import fs from 'node:fs';
import path from 'node:path';
import crypto from 'node:crypto';
import {fileURLToPath} from 'node:url';
import {captureProcess} from './tools/lib/capture-process.mjs';

const root = fileURLToPath(new URL('./', import.meta.url));
const hash = bytes => crypto.createHash('sha256').update(bytes).digest('hex');
const sorted = rules => rules.slice().sort((a, b) => a.symbol < b.symbol ? -1 : a.symbol > b.symbol ? 1 : 0);
const same = (a, b) => JSON.stringify(a) === JSON.stringify(b);
const sha256 = value => typeof value === 'string' && /^[a-f0-9]{64}$/.test(value);
const sourceIdentity = rules => ({source: rules.source, generators: rules.generators,
  inputTreeSha256: rules.inputTreeSha256});

// One current manifest. The previous reviewed rules live in Git, not copied
// version files. Explicit differences preserve every unaffected guarded name.
export function validateManifest(rules, directory = root) {
  const publication = rules.publication;
  if (rules.schema !== 1 || !Number.isInteger(rules.version) || publication?.format !== 1 ||
      !/^[a-f0-9]{40}$/.test(rules.source?.commit) || rules.source.subdirectory !== 'games/geoblox' ||
      rules.source.repository !== 'Kreijstal/funorb-decompiled' || !sha256(rules.inputTreeSha256) ||
      !/^[a-f0-9]{40}$/.test(rules.generators?.javaTools?.commit) ||
      !sha256(rules.generators.javaTools.sourceArchive?.sha256) || !sha256(publication.stubJarSha256))
    throw new Error('Invalid current publication identity');
  const previous = publication.previousRules;
  if (!/^[a-f0-9]{40}$/.test(previous?.commit) || previous.path !== 'readable/geoblox-rules.json' ||
      !sha256(previous.sha256)) throw new Error('Invalid previous Git rule identity');
  const bytes = captureProcess('git', ['-C', path.resolve(directory, '..'), 'show',
    `${previous.commit}:${previous.path}`]).stdout;
  if (hash(bytes) !== previous.sha256) throw new Error('Previous Git rules differ from their reviewed hash');
  const before = JSON.parse(bytes);
  if (!same(sourceIdentity(before), sourceIdentity(rules)) &&
      (!same(publication.sourceChange?.before, sourceIdentity(before)) ||
       !same(publication.sourceChange?.after, sourceIdentity(rules))))
    throw new Error('Changed input requires an explicit sourceChange in the current manifest');
  if (!Array.isArray(rules.renames) || !rules.renames.length ||
      new Set(rules.renames.map(rule => rule.symbol)).size !== rules.renames.length)
    throw new Error('Current naming rules have duplicate or missing identities');
  for (const rule of rules.renames) {
    if (!/^[CMFPL]:/.test(rule.symbol) || !/^[A-Za-z_$][A-Za-z0-9_$]*$/.test(rule.originalName ?? '') ||
        !/^[A-Za-z_$][A-Za-z0-9_$]*$/.test(rule.to ?? '') || typeof rule.evidence !== 'string' || !rule.evidence.trim())
      throw new Error(`Incomplete guarded naming rule: ${rule.symbol}`);
  }
  if (!Array.isArray(publication.ruleChanges) ||
      new Set(publication.ruleChanges.map(change => change.symbol)).size !== publication.ruleChanges.length)
    throw new Error('Invalid explicit naming changes');
  const expected = new Map(before.renames.map(rule => [rule.symbol, rule]));
  for (const change of publication.ruleChanges) {
    if (!same(change.before, expected.get(change.symbol) ?? null) ||
        change.after && change.after.symbol !== change.symbol || !change.before && !change.after)
      throw new Error('Naming change differs from the previous guarded identity');
    if (change.after) expected.set(change.symbol, change.after);
    else expected.delete(change.symbol);
  }
  if (!same(sorted([...expected.values()]), sorted(rules.renames)))
    throw new Error('Current rules change an identity without an explicit naming change');
  if (!Array.isArray(publication.sourceEvidence) || !publication.sourceEvidence.length ||
      new Set(publication.sourceEvidence.map(item => item.file)).size !== publication.sourceEvidence.length ||
      publication.sourceEvidence.some(item => !/^[A-Za-z_$][A-Za-z0-9_$]*\.java$/.test(item.file) || !sha256(item.sha256)))
    throw new Error('Invalid current source evidence');
  if (!Array.isArray(publication.nativeEvidence) || !publication.nativeEvidence.length ||
      new Set(publication.nativeEvidence.map(item => item.file)).size !== publication.nativeEvidence.length)
    throw new Error('Invalid current native evidence');
  for (const item of publication.nativeEvidence) {
    if (!/^tests\/test-geoblox-[a-z-]+\.mjs$/.test(item.file) || !sha256(item.sha256) ||
        !sha256(item.nativeOutputSha256) || !Number.isInteger(item.scenarios) || item.scenarios <= 0)
      throw new Error('Invalid native probe identity');
    const probe = fs.readFileSync(path.join(directory, item.file));
    const recorded = probe.toString().match(/const expectedNativeSha256 = '([a-f0-9]{64})'/)?.[1];
    if (hash(probe) !== item.sha256 || recorded !== item.nativeOutputSha256)
      throw new Error(`Reviewed native probe differs: ${item.file}`);
  }
  const toolRoot = path.join(directory, 'tools');
  const tool = JSON.parse(fs.readFileSync(path.join(toolRoot, 'PIN.json')));
  for (const file of ['readable-java.mjs', 'lib/ReadableJava.java', 'lib/capture-process.mjs'])
    if (hash(fs.readFileSync(path.join(toolRoot, file))) !== tool.files[file])
      throw new Error(`Frozen naming tool changed: ${file}`);
  return {...rules, renames: sorted(rules.renames)};
}

if (process.argv[1] && path.resolve(process.argv[1]) === fileURLToPath(import.meta.url)) {
  const destination = path.join(root, 'geoblox-rules.json');
  const rules = validateManifest(JSON.parse(fs.readFileSync(destination)));
  const output = JSON.stringify(rules, null, 2) + '\n';
  const check = process.argv.includes('--check');
  if (check) {
    if (fs.readFileSync(destination, 'utf8') !== output)
      throw new Error('Current manifest differs from its deterministic canonical form');
  } else fs.writeFileSync(destination, output);
  console.log(JSON.stringify({rules: rules.renames.length, sourceCommit: rules.source.commit, check}));
}
