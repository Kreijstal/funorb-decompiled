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
const passSevenBytes = read('rules/geoblox-v7.json');
const passSeven = JSON.parse(passSevenBytes);
const migrationBytes = read('rules/geoblox-v7-migration.json');
const migration = JSON.parse(migrationBytes);
const sha256 = bytes => crypto.createHash('sha256').update(bytes).digest('hex');
if (migration.schema !== 1 || migration.version !== 7 ||
    migration.previousRulesSha256 !== sha256(passSixBytes) ||
    migration.previousInputTreeSha256 !== passSix.inputTreeSha256 ||
    migration.inputTreeSha256 !== passSeven.inputTreeSha256 ||
    migration.javaToolsCommit !== passSeven.generators.javaTools.commit ||
    !Array.isArray(migration.identityChanges) || migration.identityChanges.length !== 0 ||
    migration.review.rulesRetained !== renames.length ||
    migration.review.originalSpellingGuardsMatched !== renames.length ||
    migration.review.namedLocalDeclarationIdentitiesUnchanged !==
      renames.filter(rule => rule.symbol.startsWith('L:')).length ||
    migration.review.namedLocalsUniqueWithinMethodBeforeAndAfter !== true)
  throw new Error('Input or declaration identities differ from the reviewed pass-7 migration');
const rebuiltPassSeven = {...passSix, version: 7, previousRulesSha256: sha256(passSixBytes),
  namingMigrationSha256: sha256(migrationBytes), inputTreeSha256: passSeven.inputTreeSha256,
  source: passSeven.source, generators: passSeven.generators, renames};
if (passSevenBytes.toString() !== JSON.stringify(rebuiltPassSeven, null, 2) + '\n')
  throw new Error('Retained pass 7 does not match its reviewed rule lineage');
if (pin.namingMigration !== 'rules/geoblox-v13-text.json')
  throw new Error('Changed input requires reviewed naming-rule migration');
const passEightBytes = read('rules/geoblox-v8.json');
const passEight = JSON.parse(passEightBytes);
const latestBytes = read('rules/geoblox-v8-migration.json');
const latest = JSON.parse(latestBytes);
const localRules = renames.filter(rule => rule.symbol.startsWith('L:')).length;
if (latest.schema !== 1 || latest.version !== 8 ||
    latest.previousRulesSha256 !== sha256(passSevenBytes) ||
    latest.previousInputTreeSha256 !== passSeven.inputTreeSha256 ||
    latest.inputTreeSha256 !== passEight.inputTreeSha256 ||
    latest.javaToolsCommit !== passEight.generators.javaTools.commit ||
    !Array.isArray(latest.identityChanges) ||
    latest.review.rulesRetained !== renames.length ||
    latest.review.originalSpellingGuardsMatched !== renames.length ||
    latest.review.namedLocalDeclarationIdentitiesMoved !== latest.identityChanges.length ||
    latest.review.namedLocalDeclarationIdentitiesUnchanged + latest.identityChanges.length !== localRules ||
    latest.review.namedLocalsUniqueWithinMethodBeforeAndAfter !== true)
  throw new Error('Input or declaration identities differ from the reviewed pass-8 migration');
const moves = new Map();
for (const move of latest.identityChanges) {
  const rule = renames.find(rule => rule.symbol === move.from);
  if (!rule || !/^L:.+#\d+$/.test(move.from) || !/^L:.+#\d+$/.test(move.to) ||
      move.from.slice(0, move.from.lastIndexOf('#')) !== move.to.slice(0, move.to.lastIndexOf('#')) ||
      move.from === move.to || moves.has(move.from) || move.originalName !== rule.originalName ||
      move.readableName !== rule.to || move.evidence !== rule.evidence)
    throw new Error('Local identity differs from the reviewed pass-8 migration');
  moves.set(move.from, move.to);
}
const migratedRenames = renames.map(rule => ({...rule, symbol: moves.get(rule.symbol) ?? rule.symbol}))
  .sort((a, b) => a.symbol < b.symbol ? -1 : a.symbol > b.symbol ? 1 : 0);
if (new Set(migratedRenames.map(rule => rule.symbol)).size !== migratedRenames.length)
  throw new Error('Migrated naming rules have duplicate identities');
const rebuiltPassEight = {...passSeven, version: 8, previousRulesSha256: sha256(passSevenBytes),
  namingMigrationSha256: sha256(latestBytes), inputTreeSha256: passEight.inputTreeSha256,
  source: passEight.source, generators: passEight.generators, renames: migratedRenames};
if (passEightBytes.toString() !== JSON.stringify(rebuiltPassEight, null, 2) + '\n')
  throw new Error('Retained pass 8 does not match its reviewed rule lineage');
const passNineBytes = read('rules/geoblox-v9.json');
const passNine = JSON.parse(passNineBytes);
const finalMigrationBytes = read('rules/geoblox-v9-migration.json');
const finalMigration = JSON.parse(finalMigrationBytes);
if (finalMigration.schema !== 1 || finalMigration.version !== 9 ||
    finalMigration.previousRulesSha256 !== sha256(passEightBytes) ||
    finalMigration.previousInputTreeSha256 !== passEight.inputTreeSha256 ||
    finalMigration.inputTreeSha256 !== passNine.inputTreeSha256 ||
    finalMigration.javaToolsCommit !== passNine.generators.javaTools.commit ||
    !Array.isArray(finalMigration.identityChanges) || finalMigration.identityChanges.length !== 0 ||
    finalMigration.review.rulesRetained !== renames.length ||
    finalMigration.review.originalSpellingGuardsMatched !== renames.length ||
    finalMigration.review.namedLocals !== localRules ||
    finalMigration.review.namedLocalDeclarationIdentitiesUnchanged !== localRules ||
    finalMigration.review.namedLocalDeclarationIdentitiesMoved !== 0 ||
    finalMigration.review.namedLocalsUniqueWithinMethodBeforeAndAfter !== true ||
    finalMigration.review.classFieldMethodParameterIdentitiesUnchanged !== true)
  throw new Error('Input or declaration identities differ from the reviewed pass-9 migration');
const rebuiltPassNine = {...passEight, version: 9, previousRulesSha256: sha256(passEightBytes),
  namingMigrationSha256: sha256(finalMigrationBytes), inputTreeSha256: passNine.inputTreeSha256,
  source: passNine.source, generators: passNine.generators, renames: migratedRenames};
if (passNineBytes.toString() !== JSON.stringify(rebuiltPassNine, null, 2) + '\n')
  throw new Error('Retained pass 9 does not match its reviewed rule lineage');
const passTenBytes = read('rules/geoblox-v10.json');
const passTen = JSON.parse(passTenBytes);
const currentMigrationBytes = read('rules/geoblox-v10-migration.json');
const currentMigration = JSON.parse(currentMigrationBytes);
if (currentMigration.schema !== 1 || currentMigration.version !== 10 ||
    currentMigration.previousRulesSha256 !== sha256(passNineBytes) ||
    currentMigration.previousInputTreeSha256 !== passNine.inputTreeSha256 ||
    currentMigration.inputTreeSha256 !== passTen.inputTreeSha256 ||
    currentMigration.javaToolsCommit !== passTen.generators.javaTools.commit ||
    !Array.isArray(currentMigration.identityChanges) ||
    currentMigration.review.rulesRetained !== renames.length ||
    currentMigration.review.originalSpellingGuardsMatched !== renames.length ||
    currentMigration.review.namedLocals !== localRules ||
    currentMigration.review.namedLocalDeclarationIdentitiesMoved !== currentMigration.identityChanges.length ||
    currentMigration.review.namedLocalDeclarationIdentitiesUnchanged + currentMigration.identityChanges.length !== localRules ||
    currentMigration.review.namedLocalsUniqueWithinMethodBeforeAndAfter !== true ||
    currentMigration.review.classFieldMethodParameterIdentitiesUnchanged !== true)
  throw new Error('Input or declaration identities differ from the reviewed pass-10 migration');
const currentMoves = new Map();
for (const move of currentMigration.identityChanges) {
  const rule = migratedRenames.find(rule => rule.symbol === move.from);
  if (!rule || !/^L:.+#\d+$/.test(move.from) || !/^L:.+#\d+$/.test(move.to) ||
      move.from.slice(0, move.from.lastIndexOf('#')) !== move.to.slice(0, move.to.lastIndexOf('#')) ||
      move.from === move.to || currentMoves.has(move.from) || move.originalName !== rule.originalName ||
      move.readableName !== rule.to || move.evidence !== rule.evidence)
    throw new Error('Local identity differs from the reviewed pass-10 migration');
  currentMoves.set(move.from, move.to);
}
const currentRenames = migratedRenames.map(rule => ({...rule,
  symbol: currentMoves.get(rule.symbol) ?? rule.symbol}))
  .sort((a, b) => a.symbol < b.symbol ? -1 : a.symbol > b.symbol ? 1 : 0);
if (new Set(currentRenames.map(rule => rule.symbol)).size !== currentRenames.length)
  throw new Error('Migrated naming rules have duplicate identities');
const rebuiltPassTen = {...passNine, version: 10, previousRulesSha256: sha256(passNineBytes),
  namingMigrationSha256: sha256(currentMigrationBytes), inputTreeSha256: passTen.inputTreeSha256,
  source: passTen.source, generators: passTen.generators, renames: currentRenames};
if (passTenBytes.toString() !== JSON.stringify(rebuiltPassTen, null, 2) + '\n')
  throw new Error('Retained pass 10 does not match its reviewed rule lineage');
const passElevenBytes = read('rules/geoblox-v11.json');
const passEleven = JSON.parse(passElevenBytes);
const nextMigrationBytes = read('rules/geoblox-v11-migration.json');
const nextMigration = JSON.parse(nextMigrationBytes);
if (nextMigration.schema !== 1 || nextMigration.version !== 11 ||
    nextMigration.previousRulesSha256 !== sha256(passTenBytes) ||
    nextMigration.previousInputTreeSha256 !== passTen.inputTreeSha256 ||
    nextMigration.inputTreeSha256 !== passEleven.inputTreeSha256 ||
    nextMigration.javaToolsCommit !== passEleven.generators.javaTools.commit ||
    !Array.isArray(nextMigration.identityChanges) || nextMigration.identityChanges.length !== 0 ||
    nextMigration.review.rulesRetained !== renames.length ||
    nextMigration.review.originalSpellingGuardsMatched !== renames.length ||
    nextMigration.review.namedLocals !== localRules ||
    nextMigration.review.namedLocalDeclarationIdentitiesUnchanged !== localRules ||
    nextMigration.review.namedLocalDeclarationIdentitiesMoved !== 0 ||
    nextMigration.review.namedLocalsUniqueWithinMethodBeforeAndAfter !== true ||
    nextMigration.review.classFieldMethodParameterIdentitiesUnchanged !== true)
  throw new Error('Input or declaration identities differ from the reviewed pass-11 migration');
const rebuiltPassEleven = {...passTen, version: 11, previousRulesSha256: sha256(passTenBytes),
  namingMigrationSha256: sha256(nextMigrationBytes), inputTreeSha256: passEleven.inputTreeSha256,
  source: passEleven.source, generators: passEleven.generators, renames: currentRenames};
if (passElevenBytes.toString() !== JSON.stringify(rebuiltPassEleven, null, 2) + '\n')
  throw new Error('Retained pass 11 does not match its reviewed rule lineage');
const passTwelveBytes = read('rules/geoblox-v12.json');
const passTwelve = JSON.parse(passTwelveBytes);
const outlineMigrationBytes = read('rules/geoblox-v12-migration.json');
const outlineMigration = JSON.parse(outlineMigrationBytes);
if (outlineMigration.schema !== 1 || outlineMigration.version !== 12 ||
    outlineMigration.previousRulesSha256 !== sha256(passElevenBytes) ||
    outlineMigration.previousInputTreeSha256 !== passEleven.inputTreeSha256 ||
    outlineMigration.inputTreeSha256 !== passTwelve.inputTreeSha256 ||
    outlineMigration.javaToolsCommit !== passTwelve.generators.javaTools.commit ||
    !Array.isArray(outlineMigration.identityChanges) || outlineMigration.identityChanges.length !== 0 ||
    outlineMigration.review.rulesRetained !== renames.length ||
    outlineMigration.review.originalSpellingGuardsMatched !== renames.length ||
    outlineMigration.review.namedLocals !== localRules ||
    outlineMigration.review.namedLocalDeclarationIdentitiesUnchanged !== localRules ||
    outlineMigration.review.namedLocalDeclarationIdentitiesMoved !== 0 ||
    outlineMigration.review.namedLocalsUniqueWithinMethodBeforeAndAfter !== true ||
    outlineMigration.review.classFieldMethodParameterIdentitiesUnchanged !== true)
  throw new Error('Input or declaration identities differ from the reviewed pass-12 migration');
const rebuiltPassTwelve = {...passEleven, version: 12, previousRulesSha256: sha256(passElevenBytes),
  namingMigrationSha256: sha256(outlineMigrationBytes), inputTreeSha256: passTwelve.inputTreeSha256,
  source: passTwelve.source, generators: passTwelve.generators, renames: currentRenames};
if (passTwelveBytes.toString() !== JSON.stringify(rebuiltPassTwelve, null, 2) + '\n')
  throw new Error('Retained pass 12 does not match its reviewed rule lineage');
const textBytes = read(pin.namingMigration);
const text = JSON.parse(textBytes);
const toolPinBytes = read('tools/PIN.json');
const toolPin = JSON.parse(toolPinBytes);
if (text.schema !== 1 || text.version !== 13 ||
    text.previousRulesSha256 !== sha256(passTwelveBytes) ||
    text.inputTreeSha256 !== pin.inputTreeSha256 ||
    text.inputTreeSha256 !== passTwelve.inputTreeSha256 ||
    text.javaToolsCommit !== pin.generators.javaTools.commit ||
    text.javaToolsCommit !== passTwelve.generators.javaTools.commit ||
    pin.commit !== passTwelve.source.commit ||
    text.namingToolCommit !== toolPin.adaptedToolCommit ||
    text.namingToolPinSha256 !== sha256(toolPinBytes) ||
    !Array.isArray(text.renames) || text.renames.length !== 199 ||
    !Array.isArray(text.resourceAssignments) || text.resourceAssignments.length !== 152 ||
    text.review.rulesRetained !== currentRenames.length ||
    text.review.rulesAdded !== text.renames.length ||
    text.review.originalSpellingGuardsMatched !== currentRenames.length + text.renames.length ||
    text.review.resourceFieldsObserved !== 152 ||
    text.review.resourceFieldsRetained !== 1 || text.review.resourceFieldsAdded !== 151 ||
    text.review.storedResourceReads !== 218 || text.review.allResourceReads !== 744 ||
    text.review.discardedReadsUnnamed !== 526 || text.review.additionalTextFlowRules !== 48 ||
    text.review.sourceGeneratedRules !== 19 || text.review.namedLocalsAdded !== 11 ||
    text.review.sourceBodyEdited !== false)
  throw new Error('Source or naming tool differs from the reviewed pass-13 text additions');
const retainedSymbols = new Set(currentRenames.map(rule => rule.symbol));
for (const rule of text.renames) {
  if (retainedSymbols.has(rule.symbol)) throw new Error('Text additions replace a retained naming identity');
  if (!/^[CMFPL]:/.test(rule.symbol) || !rule.originalName || !rule.to || !rule.evidence)
    throw new Error('Incomplete guarded text rule');
}
const textRenames = [...currentRenames, ...text.renames]
  .sort((a, b) => a.symbol < b.symbol ? -1 : a.symbol > b.symbol ? 1 : 0);
if (new Set(textRenames.map(rule => rule.symbol)).size !== textRenames.length)
  throw new Error('Text additions have duplicate naming identities');
const rules = {...passTwelve, version: 13, previousRulesSha256: sha256(passTwelveBytes),
  namingMigrationSha256: sha256(textBytes), inputTreeSha256: pin.inputTreeSha256,
  source: {repository: pin.sourceRepository, commit: pin.commit, subdirectory: pin.subdirectory},
  generators: pin.generators, renames: textRenames};
const output = JSON.stringify(rules, null, 2) + '\n';
const destination = path.join(root, 'geoblox-rules.json');
const check = process.argv.includes('--check');
if (check) {
  if (fs.readFileSync(destination, 'utf8') !== output)
    throw new Error('Publication rules differ from deterministic rebuild');
} else fs.writeFileSync(destination, output);
console.log(JSON.stringify({rules: rules.renames.length, sourceCommit: pin.commit, check}));
