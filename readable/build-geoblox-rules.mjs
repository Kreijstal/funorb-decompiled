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
if (pin.inputTreeSha256 !== previous.inputTreeSha256)
  throw new Error('Changed input requires reviewed naming-rule migration');
if (!/^[a-f0-9]{40}$/.test(pin.commit) || pin.subdirectory !== 'games/geoblox')
  throw new Error('Invalid publication source pin');
const renames = [...previous.renames, ...gameplay.renames].sort((a, b) =>
  a.symbol < b.symbol ? -1 : a.symbol > b.symbol ? 1 : 0);
if (new Set(renames.map(rule => rule.symbol)).size !== renames.length)
  throw new Error('Duplicate naming rules');
for (const rule of renames)
  if (!rule.originalName || !rule.to || !rule.evidence)
    throw new Error(`Incomplete guarded rule: ${rule.symbol}`);
const rules = {...previous, version: 6, previousRulesSha256: digest,
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
