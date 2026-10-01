import fs from 'node:fs';
import path from 'node:path';
import crypto from 'node:crypto';
import {fileURLToPath} from 'node:url';

const root = fileURLToPath(new URL('./', import.meta.url));
const read = name => fs.readFileSync(path.join(root, name));
const previousBytes = read('rules/geoblox-v5.json');
const previous = JSON.parse(previousBytes);
const gameplay = JSON.parse(read('rules/geoblox-v6-gameplay.json'));
const pin = JSON.parse(read('geoblox-source-pin.json'));
const digest = crypto.createHash('sha256').update(previousBytes).digest('hex');
if (gameplay.schema !== 1 || gameplay.previousRulesSha256 !== digest)
  throw new Error('Gameplay additions do not match the reviewed previous rules');
if (!/^[a-f0-9]{40}$/.test(pin.commit) || pin.subdirectory !== 'games/geoblox')
  throw new Error('Invalid publication source pin');
const renames = [...previous.renames, ...gameplay.renames].sort((a, b) =>
  a.symbol < b.symbol ? -1 : a.symbol > b.symbol ? 1 : 0);
if (new Set(renames.map(rule => rule.symbol)).size !== renames.length)
  throw new Error('Duplicate naming rules');
for (const rule of renames)
  if (!rule.originalName || !rule.to || !rule.evidence)
    throw new Error(`Incomplete guarded rule: ${rule.symbol}`);
const passSixBytes = read('rules/geoblox-v6.json');
const passSix = JSON.parse(passSixBytes);
if (passSix.version !== 6 || passSix.previousRulesSha256 !== digest ||
    passSix.inputTreeSha256 !== previous.inputTreeSha256 ||
    JSON.stringify(passSix.renames) !== JSON.stringify(renames))
  throw new Error('Retained pass 6 does not match its reviewed rule lineage');
if (pin.namingMigration !== 'rules/geoblox-v7-migration.json')
  throw new Error('Changed input requires reviewed naming-rule migration');
const migrationBytes = read(pin.namingMigration);
const migration = JSON.parse(migrationBytes);
const sha256 = bytes => crypto.createHash('sha256').update(bytes).digest('hex');
if (migration.schema !== 1 || migration.version !== 7 ||
    migration.previousRulesSha256 !== sha256(passSixBytes) ||
    migration.previousInputTreeSha256 !== passSix.inputTreeSha256 ||
    migration.inputTreeSha256 !== pin.inputTreeSha256 ||
    migration.javaToolsCommit !== pin.generators.javaTools.commit ||
    !Array.isArray(migration.identityChanges) || migration.identityChanges.length !== 0 ||
    migration.review.rulesRetained !== renames.length ||
    migration.review.originalSpellingGuardsMatched !== renames.length ||
    migration.review.namedLocalDeclarationIdentitiesUnchanged !==
      renames.filter(rule => rule.symbol.startsWith('L:')).length ||
    migration.review.namedLocalsUniqueWithinMethodBeforeAndAfter !== true)
  throw new Error('Input or declaration identities differ from the reviewed pass-7 migration');
const rules = {...passSix, version: 7, previousRulesSha256: sha256(passSixBytes),
  namingMigrationSha256: sha256(migrationBytes), inputTreeSha256: pin.inputTreeSha256,
  source: {repository: pin.sourceRepository, commit: pin.commit, subdirectory: pin.subdirectory},
  generators: pin.generators, renames};
const output = JSON.stringify(rules, null, 2) + '\n';
const destination = path.join(root, 'geoblox-rules.json');
const check = process.argv.includes('--check');
if (check) {
  if (fs.readFileSync(destination, 'utf8') !== output)
    throw new Error('Publication rules differ from deterministic rebuild');
} else fs.writeFileSync(destination, output);
console.log(JSON.stringify({rules: renames.length, sourceCommit: pin.commit, check}));
