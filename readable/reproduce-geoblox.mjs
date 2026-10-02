import fs from 'node:fs';
import os from 'node:os';
import path from 'node:path';
import crypto from 'node:crypto';
import {fileURLToPath} from 'node:url';
import {generateReadable} from './tools/readable-java.mjs';
import {captureProcess} from './tools/lib/capture-process.mjs';

const root = fileURLToPath(new URL('./', import.meta.url));
const repository = path.resolve(root, '..');
const args = process.argv.slice(2);
const check = args.includes('--check');
const positional = args.filter(arg => arg !== '--check');
if (positional.length > 1 || positional.some(arg => arg.startsWith('--')))
  throw new Error('Usage: node readable/reproduce-geoblox.mjs [OUTPUT] [--check]');
const output = positional[0] ? path.resolve(positional[0]) : path.join(root, 'geoblox');
const digest = bytes => crypto.createHash('sha256').update(bytes).digest('hex');
const temporary = fs.mkdtempSync(path.join(os.tmpdir(), 'funorb-readable-input-'));
try {
  const rulesFile = path.join(root, 'geoblox-rules.json');
  const rules = JSON.parse(fs.readFileSync(rulesFile));
  const sourcePin = JSON.parse(fs.readFileSync(path.join(root, 'geoblox-source-pin.json')));
  if (rules.source.commit !== sourcePin.commit ||
      rules.source.repository !== sourcePin.sourceRepository ||
      rules.source.subdirectory !== sourcePin.subdirectory ||
      rules.inputTreeSha256 !== sourcePin.inputTreeSha256 ||
      !/^[a-f0-9]{40}$/.test(sourcePin.commit) || sourcePin.subdirectory !== 'games/geoblox')
    throw new Error('Rules do not match the frozen publication input');
  const toolRoot = path.join(root, 'tools');
  const toolPin = JSON.parse(fs.readFileSync(path.join(toolRoot, 'PIN.json')));
  for (const filename of ['readable-java.mjs', 'lib/ReadableJava.java', 'lib/capture-process.mjs'])
    if (digest(fs.readFileSync(path.join(toolRoot, filename))) !== toolPin.files[filename])
      throw new Error(`Frozen naming tool changed: ${filename}`);
  const classpath = path.join(root, 'funorb-stubs.jar');
  if (digest(fs.readFileSync(classpath)) !== sourcePin.stubJarSha256)
    throw new Error('Frozen compilation dependency changed');
  // Later changes under games/ must not change this export's pinned input.
  const archive = path.join(temporary, 'input.tar');
  captureProcess('git', ['-C', repository, 'archive', '--format=tar', '--output=' + archive,
    sourcePin.commit, sourcePin.subdirectory]);
  captureProcess('tar', ['-xf', archive, '-C', temporary]);
  let migration;
  if (sourcePin.namingMigration) {
    const migrationBytes = fs.readFileSync(path.join(root, sourcePin.namingMigration));
    if (digest(migrationBytes) !== rules.namingMigrationSha256)
      throw new Error('Reviewed naming migration differs from the rules');
    migration = JSON.parse(migrationBytes);
    let previous;
    if (migration.previousRulesFile) {
      if (!/^rules\/geoblox-v\d+\.json$/.test(migration.previousRulesFile))
        throw new Error('Invalid previous naming manifest path');
      const previousBytes = fs.readFileSync(path.join(root, migration.previousRulesFile));
      if (digest(previousBytes) !== migration.previousRulesSha256)
        throw new Error('Previous naming manifest differs from the migration');
      previous = JSON.parse(previousBytes);
      if (!/^[a-f0-9]{40}$/.test(previous.source.commit) ||
          previous.source.subdirectory !== sourcePin.subdirectory)
        throw new Error('Invalid previous publication source pin');
    }
    for (const item of migration.sourceEvidence || []) {
      if (!/^[A-Za-z_$][A-Za-z0-9_$]*\.java$/.test(item.file) ||
          digest(fs.readFileSync(path.join(temporary, sourcePin.subdirectory, item.file))) !== item.sha256)
        throw new Error(`Reviewed migration source differs: ${item.file}`);
      if (previous && item.previousSha256) {
        const before = captureProcess('git', ['-C', repository, 'show',
          `${previous.source.commit}:${previous.source.subdirectory}/${item.file}`]).stdout;
        if (digest(before) !== item.previousSha256)
          throw new Error(`Previous migration source differs: ${item.file}`);
      }
    }
  }
  const verifySourceEvidence = (additions, updates = [], label = 'result-helper') => {
    if (!Array.isArray(updates) || new Set(updates.map(item => item.file)).size !== updates.length)
      throw new Error('Invalid reviewed result evidence updates');
    for (const update of updates) {
      const original = additions.sourceEvidence?.find(item => item.file === update.file);
      const changed = migration.sourceEvidence?.find(item => item.file === update.file);
      if (!original || !changed || update.previousSha256 !== original.sha256 ||
          update.previousSha256 !== changed.previousSha256 || update.sha256 !== changed.sha256)
        throw new Error('Invalid reviewed result evidence update');
    }
    for (const item of additions.sourceEvidence || []) {
      const expectedSha256 = updates.find(update => update.file === item.file)?.sha256 ?? item.sha256;
      if (!/^[A-Za-z_$][A-Za-z0-9_$]*\.java$/.test(item.file) ||
          digest(fs.readFileSync(path.join(temporary, sourcePin.subdirectory, item.file))) !== expectedSha256)
        throw new Error(`Reviewed ${label} source differs: ${item.file}`);
    }
  };
  // Historical result evidence remains tied to its original manifest, even
  // when the current naming additions cover a newer pass. Only the reviewed
  // migration may update those old source hashes.
  if (migration?.resultEvidenceManifest) {
    if (!/^rules\/geoblox-v\d+-[a-z-]+\.json$/.test(migration.resultEvidenceManifest))
      throw new Error('Invalid historical result manifest path');
    const historicalBytes = fs.readFileSync(path.join(root, migration.resultEvidenceManifest));
    if (digest(historicalBytes) !== migration.resultEvidenceManifestSha256)
      throw new Error('Historical result manifest differs from the migration');
    verifySourceEvidence(JSON.parse(historicalBytes), migration.resultEvidenceUpdates ?? []);
  }
  if (sourcePin.namingAdditions) {
    const additionsBytes = fs.readFileSync(path.join(root, sourcePin.namingAdditions));
    if (digest(additionsBytes) !== rules.namingAdditionsSha256)
      throw new Error('Reviewed naming additions differ from the rules');
    const additions = JSON.parse(additionsBytes);
    if (additions.previousRulesFile) {
      if (!/^rules\/geoblox-v\d+\.json$/.test(additions.previousRulesFile))
        throw new Error('Invalid previous additions manifest path');
      const previousBytes = fs.readFileSync(path.join(root, additions.previousRulesFile));
      if (digest(previousBytes) !== additions.previousRulesSha256 ||
          rules.previousRulesSha256 !== additions.previousRulesSha256)
        throw new Error('Previous naming manifest differs from the additions');
    }
    const currentIsHistorical = sourcePin.namingAdditions === migration?.resultEvidenceManifest;
    verifySourceEvidence(additions, currentIsHistorical ? migration.resultEvidenceUpdates ?? [] : [], 'naming');
    for (const item of additions.nativeEvidence || []) {
      if (!/^tests\/test-geoblox-[a-z-]+\.mjs$/.test(item.file) ||
          digest(fs.readFileSync(path.join(root, item.file))) !== item.sha256)
        throw new Error(`Reviewed native probe differs: ${item.file}`);
    }
  }
  console.log(JSON.stringify(generateReadable({
    input: path.join(temporary, sourcePin.subdirectory), output, rulesFile, classpath, check,
  })));
} catch (error) {
  console.error(error.stderr?.toString() || error.message);
  process.exitCode = 1;
} finally {
  fs.rmSync(temporary, {recursive: true, force: true});
}
