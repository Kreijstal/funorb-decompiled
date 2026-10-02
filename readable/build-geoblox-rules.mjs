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
if (pin.namingMigration !== 'rules/geoblox-v17-migration.json')
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
const passThirteenBytes = read('rules/geoblox-v13.json');
const passThirteen = JSON.parse(passThirteenBytes);
const textBytes = read('rules/geoblox-v13-text.json');
const text = JSON.parse(textBytes);
const toolPinBytes = read('tools/PIN.json');
const toolPin = JSON.parse(toolPinBytes);
if (text.schema !== 1 || text.version !== 13 ||
    text.previousRulesSha256 !== sha256(passTwelveBytes) ||
    text.inputTreeSha256 !== passThirteen.inputTreeSha256 ||
    text.inputTreeSha256 !== passTwelve.inputTreeSha256 ||
    text.javaToolsCommit !== passThirteen.generators.javaTools.commit ||
    text.javaToolsCommit !== passTwelve.generators.javaTools.commit ||
    passThirteen.source.commit !== passTwelve.source.commit ||
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
const rebuiltPassThirteen = {...passTwelve, version: 13,
  previousRulesSha256: sha256(passTwelveBytes), namingMigrationSha256: sha256(textBytes),
  inputTreeSha256: passThirteen.inputTreeSha256, source: passThirteen.source,
  generators: passThirteen.generators, renames: textRenames};
if (passThirteenBytes.toString() !== JSON.stringify(rebuiltPassThirteen, null, 2) + '\n')
  throw new Error('Retained pass 13 does not match its reviewed rule lineage');
const passFourteenBytes = read('rules/geoblox-v14.json');
const passFourteen = JSON.parse(passFourteenBytes);
const comparisonBytes = read('rules/geoblox-v14-migration.json');
const comparison = JSON.parse(comparisonBytes);
const namedTextLocals = textRenames.filter(rule => rule.symbol.startsWith('L:')).length;
if (comparison.schema !== 1 || comparison.version !== 14 ||
    comparison.previousRulesSha256 !== sha256(passThirteenBytes) ||
    comparison.previousInputTreeSha256 !== passThirteen.inputTreeSha256 ||
    comparison.sourceCommit !== passFourteen.source.commit ||
    comparison.inputTreeSha256 !== passFourteen.inputTreeSha256 ||
    comparison.javaToolsCommit !== passFourteen.generators.javaTools.commit ||
    !Array.isArray(comparison.identityChanges) || comparison.identityChanges.length !== 0 ||
    comparison.review.rulesRetained !== textRenames.length ||
    comparison.review.originalSpellingGuardsMatched !== textRenames.length ||
    comparison.review.namedLocals !== namedTextLocals ||
    comparison.review.namedLocalDeclarationIdentitiesUnchanged !== namedTextLocals ||
    comparison.review.namedLocalDeclarationIdentitiesMoved !== 0 ||
    comparison.review.namedLocalsUniqueWithinMethodBeforeAndAfter !== true ||
    comparison.review.classFieldMethodParameterIdentitiesUnchanged !== true ||
    comparison.review.changedJavaFiles !== 156 ||
    !/^[a-f0-9]{64}$/.test(comparison.textEvidence?.loaderSourceSha256 ?? ''))
  throw new Error('Input or declaration identities differ from the reviewed pass-14 migration');
const resourceIdentities = assignments => assignments?.map(binding => ({...binding,
  resources: binding.resources.map(({line, ...resource}) => resource)}));
if (JSON.stringify(resourceIdentities(comparison.textEvidence.resourceAssignments)) !==
    JSON.stringify(resourceIdentities(text.resourceAssignments)))
  throw new Error('Pass-14 text evidence changes reviewed resource identities');
const rebuiltPassFourteen = {...passThirteen, version: 14, previousRulesSha256: sha256(passThirteenBytes),
  namingMigrationSha256: sha256(comparisonBytes), inputTreeSha256: passFourteen.inputTreeSha256,
  source: passFourteen.source, generators: passFourteen.generators, renames: textRenames};
if (passFourteenBytes.toString() !== JSON.stringify(rebuiltPassFourteen, null, 2) + '\n')
  throw new Error('Retained pass 14 does not match its reviewed rule lineage');
const passFifteenBytes = read('rules/geoblox-v15.json');
const passFifteen = JSON.parse(passFifteenBytes);
const loopBytes = read('rules/geoblox-v15-migration.json');
const loop = JSON.parse(loopBytes);
if (loop.schema !== 1 || loop.version !== 15 ||
    loop.previousRulesSha256 !== sha256(passFourteenBytes) ||
    loop.previousInputTreeSha256 !== passFourteen.inputTreeSha256 ||
    loop.sourceCommit !== passFifteen.source.commit || loop.inputTreeSha256 !== passFifteen.inputTreeSha256 ||
    loop.javaToolsCommit !== passFifteen.generators.javaTools.commit ||
    !Array.isArray(loop.identityChanges) ||
    loop.review.rulesRetained !== textRenames.length ||
    loop.review.originalSpellingGuardsMatched !== textRenames.length ||
    loop.review.namedLocals !== namedTextLocals ||
    loop.review.namedLocalDeclarationIdentitiesMoved !== loop.identityChanges.length ||
    loop.review.namedLocalDeclarationIdentitiesUnchanged + loop.identityChanges.length !== namedTextLocals ||
    loop.review.namedLocalTypesMatched !== namedTextLocals ||
    loop.review.namedLocalsUniqueWithinMethodBeforeAndAfter !== true ||
    loop.review.classFieldMethodParameterIdentitiesUnchanged !== true ||
    loop.review.changedJavaFiles !== 10)
  throw new Error('Input or declaration identities differ from the reviewed pass-15 migration');
if (JSON.stringify(loop.textEvidence) !== JSON.stringify(comparison.textEvidence))
  throw new Error('Pass-15 text evidence changes reviewed resource identities or unchanged loader source');
const loopMoves = new Map();
for (const move of loop.identityChanges) {
  const rule = textRenames.find(rule => rule.symbol === move.from);
  if (!rule || !/^L:.+#\d+$/.test(move.from) || !/^L:.+#\d+$/.test(move.to) ||
      move.from.slice(0, move.from.lastIndexOf('#')) !== move.to.slice(0, move.to.lastIndexOf('#')) ||
      move.from === move.to || loopMoves.has(move.from) || move.originalName !== rule.originalName ||
      move.readableName !== rule.to || move.evidence !== rule.evidence)
    throw new Error('Local identity differs from the reviewed pass-15 migration');
  loopMoves.set(move.from, move.to);
}
const loopRenames = textRenames.map(rule => ({...rule, symbol: loopMoves.get(rule.symbol) ?? rule.symbol}))
  .sort((a, b) => a.symbol < b.symbol ? -1 : a.symbol > b.symbol ? 1 : 0);
if (new Set(loopRenames.map(rule => rule.symbol)).size !== loopRenames.length)
  throw new Error('Migrated naming rules have duplicate identities');
const rebuiltPassFifteen = {...passFourteen, version: 15, previousRulesSha256: sha256(passFourteenBytes),
  namingMigrationSha256: sha256(loopBytes), inputTreeSha256: passFifteen.inputTreeSha256,
  source: passFifteen.source, generators: passFifteen.generators, renames: loopRenames};
if (passFifteenBytes.toString() !== JSON.stringify(rebuiltPassFifteen, null, 2) + '\n')
  throw new Error('Retained pass 15 does not match its reviewed rule lineage');
const passSixteenBytes = read('rules/geoblox-v16.json');
const passSixteen = JSON.parse(passSixteenBytes);
const borderBytes = read('rules/geoblox-v16-border.json');
const border = JSON.parse(borderBytes);
if (border.schema !== 1 || border.version !== 16 ||
    border.previousRulesSha256 !== sha256(passFifteenBytes) ||
    border.inputTreeSha256 !== passSixteen.inputTreeSha256 || border.inputTreeSha256 !== passFifteen.inputTreeSha256 ||
    border.sourceCommit !== passSixteen.source.commit || border.sourceCommit !== passFifteen.source.commit ||
    border.javaToolsCommit !== passSixteen.generators.javaTools.commit ||
    border.javaToolsCommit !== passFifteen.generators.javaTools.commit ||
    border.textEvidenceMigration !== 'rules/geoblox-v15-migration.json' ||
    border.textEvidenceMigrationSha256 !== sha256(loopBytes) ||
    JSON.stringify(passSixteen.generators) !== JSON.stringify(passFifteen.generators) ||
    !Array.isArray(border.renames) || border.renames.length !== 85 ||
    border.review.rulesRetained !== loopRenames.length ||
    border.review.rulesAdded !== border.renames.length ||
    border.review.originalSpellingGuardsMatched !== loopRenames.length + border.renames.length ||
    border.review.rawSourceTreeUnchanged !== true || border.review.sourceBodyEdited !== false ||
    !Array.isArray(border.review.identityChanges) || border.review.identityChanges.length !== 0)
  throw new Error('Source or naming additions differ from the reviewed pass-16 border manifest');
const retainedLoopSymbols = new Set(loopRenames.map(rule => rule.symbol));
for (const rule of border.renames) {
  if (retainedLoopSymbols.has(rule.symbol))
    throw new Error('Border additions replace a retained naming identity');
  if (!/^[CMFPL]:/.test(rule.symbol) || !rule.originalName || !rule.to || !rule.evidence)
    throw new Error('Incomplete guarded border rule');
}
const borderRenames = [...loopRenames, ...border.renames]
  .sort((a, b) => a.symbol < b.symbol ? -1 : a.symbol > b.symbol ? 1 : 0);
if (new Set(borderRenames.map(rule => rule.symbol)).size !== borderRenames.length)
  throw new Error('Border additions have duplicate naming identities');
const expectedFamilies = [
  {members: ['M:ib.e(I)Llh;', 'M:q.e(I)Llh;'], readableName: 'currentValidationState'},
  {members: ['M:ib.b(B)Ljava/lang/String;', 'M:q.b(B)Ljava/lang/String;'], readableName: 'currentValidationMessage'},
  ...[['a', '(ILjava/lang/String;)Llh;', 'validationStateForText'],
    ['b', '(ILjava/lang/String;)Ljava/lang/String;', 'validationMessageForText']]
    .map(([member, descriptor, readableName]) => ({
      members: ['ag', 'cf', 'g', 'mk', 'n', 'q', 'uk'].map(owner => `M:${owner}.${member}${descriptor}`),
      readableName,
    })),
];
if (JSON.stringify(border.overrideFamilies) !== JSON.stringify(expectedFamilies) ||
    expectedFamilies.some(family => family.members.some(symbol =>
      border.renames.find(rule => rule.symbol === symbol)?.to !== family.readableName)))
  throw new Error('Border additions leave an incomplete or inconsistent reviewed override family');
const rebuiltPassSixteen = {...passFifteen, version: 16, previousRulesSha256: sha256(passFifteenBytes),
  namingMigrationSha256: sha256(borderBytes), inputTreeSha256: passSixteen.inputTreeSha256,
  source: passSixteen.source, generators: passSixteen.generators, renames: borderRenames};
if (passSixteenBytes.toString() !== JSON.stringify(rebuiltPassSixteen, null, 2) + '\n')
  throw new Error('Retained pass 16 does not match its reviewed rule lineage');
const numericBytes = read(pin.namingMigration);
const numeric = JSON.parse(numericBytes);
if (numeric.schema !== 1 || numeric.version !== 17 ||
    numeric.previousRulesSha256 !== sha256(passSixteenBytes) ||
    numeric.previousInputTreeSha256 !== passSixteen.inputTreeSha256 ||
    numeric.inputTreeSha256 !== pin.inputTreeSha256 || numeric.sourceCommit !== pin.commit ||
    numeric.javaToolsCommit !== pin.generators.javaTools.commit ||
    numeric.decompilerSourceArchiveSha256 !== pin.generators.javaTools.sourceArchive.sha256 ||
    JSON.stringify(pin.generators.dekoblokoWork) !== JSON.stringify(passSixteen.generators.dekoblokoWork) ||
    numeric.textEvidenceMigration !== 'rules/geoblox-v15-migration.json' ||
    numeric.textEvidenceMigrationSha256 !== sha256(loopBytes) ||
    !Array.isArray(numeric.identityChanges) || numeric.identityChanges.length !== 0 ||
    numeric.review.rulesRetained !== borderRenames.length ||
    numeric.review.originalSpellingGuardsMatched !== borderRenames.length ||
    numeric.review.namedLocals !== 248 || numeric.review.namedLocalDeclarationIdentitiesUnchanged !== 248 ||
    numeric.review.namedLocalDeclarationIdentitiesMoved !== 0 ||
    numeric.review.sourceDeclarationIdentitiesUnchanged !== 21181 ||
    numeric.review.classFieldMethodParameterIdentitiesUnchanged !== true ||
    JSON.stringify(numeric.review.changedJavaFiles) !== JSON.stringify(['dm.java', 'il.java']) ||
    numeric.review.correctedNumericNegations !== 6 ||
    numeric.review.sourceBodyEditedByHand !== false || numeric.review.bytecodeUnchanged !== true)
  throw new Error('Input or declaration identities differ from the reviewed pass-17 migration');
const rules = {...passSixteen, version: 17, previousRulesSha256: sha256(passSixteenBytes),
  namingMigrationSha256: sha256(numericBytes), inputTreeSha256: pin.inputTreeSha256,
  source: {repository: pin.sourceRepository, commit: pin.commit, subdirectory: pin.subdirectory},
  generators: pin.generators, renames: borderRenames};
const output = JSON.stringify(rules, null, 2) + '\n';
const destination = path.join(root, 'geoblox-rules.json');
const check = process.argv.includes('--check');
if (check) {
  if (fs.readFileSync(destination, 'utf8') !== output)
    throw new Error('Publication rules differ from deterministic rebuild');
} else fs.writeFileSync(destination, output);
console.log(JSON.stringify({rules: rules.renames.length, sourceCommit: pin.commit, check}));
