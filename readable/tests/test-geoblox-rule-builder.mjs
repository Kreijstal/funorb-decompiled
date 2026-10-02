import fs from 'node:fs';
import os from 'node:os';
import path from 'node:path';
import assert from 'node:assert/strict';
import test from 'node:test';
import {fileURLToPath} from 'node:url';
import {captureProcess} from '../tools/lib/capture-process.mjs';

const root = fileURLToPath(new URL('../', import.meta.url));
function fixture(change, check = true) {
  const temporary = fs.mkdtempSync(path.join(os.tmpdir(), 'geoblox-current-rules-'));
  try {
    captureProcess('git', ['clone', '--shared', '--no-checkout', '--quiet', path.resolve(root, '..'), temporary]);
    const directory = path.join(temporary, 'readable');
    for (const file of ['build-geoblox-rules.mjs', 'geoblox-rules.json',
      'tests/test-geoblox-match-scoring.mjs', 'tests/test-geoblox-text-write.mjs',
      'tests/test-geoblox-gameplay.mjs',
      'tools/PIN.json', 'tools/readable-java.mjs', 'tools/lib/ReadableJava.java', 'tools/lib/capture-process.mjs']) {
      const destination = path.join(directory, file);
      fs.mkdirSync(path.dirname(destination), {recursive: true});
      fs.copyFileSync(path.join(root, file), destination);
    }
    const file = path.join(directory, 'geoblox-rules.json');
    const manifest = JSON.parse(fs.readFileSync(file));
    change?.(manifest, directory);
    fs.writeFileSync(file, JSON.stringify(manifest, null, 2) + '\n');
    try {
      return captureProcess(process.execPath, [path.join(directory, 'build-geoblox-rules.mjs'), ...(check ? ['--check'] : [])]);
    } catch (error) { throw new Error(error.stderr?.toString() || error.message); }
  } finally { fs.rmSync(temporary, {recursive: true, force: true}); }
}

test('one current manifest reproduces all guarded rules using Git history', () => {
  assert.equal(JSON.parse(fixture().stdout).rules, 1032);
});
test('previous Git objects and their hash cannot change silently', () => {
  for (const change of [
    data => { data.publication.previousRules.path = '../geoblox-rules.json'; },
    data => { data.publication.previousRules.commit = 'different'; },
  ]) assert.throws(() => fixture(change), /Invalid previous Git rule identity/);
  assert.throws(() => fixture(data => { data.publication.previousRules.sha256 = '0'.repeat(64); }),
    /Previous Git rules differ/);
});
test('retained names, evidence and original spelling need explicit changes', () => {
  for (const key of ['to', 'evidence', 'originalName'])
    assert.throws(() => fixture(data => { data.renames[0][key] = 'Different'; }), /without an explicit naming change/);
  assert.throws(() => fixture(data => { data.renames.pop(); }), /without an explicit naming change/);
});
test('explicit additions are checked against their complete previous identity', () => {
  const add = data => {
    const rule = {symbol: 'L:ul.b(I)V#21', originalName: 'var1', to: 'caughtRuntimeException', evidence: 'Fixture addition'};
    data.renames.push(rule); data.publication.ruleChanges.push({symbol: rule.symbol, before: null, after: rule});
  };
  assert.equal(JSON.parse(fixture(add, false).stdout).rules, 1033);
  assert.throws(() => fixture(data => { add(data); data.publication.ruleChanges[0].before = {}; }),
    /differs from the previous guarded identity/);
  assert.throws(() => fixture(data => { add(data); data.publication.ruleChanges.push(data.publication.ruleChanges[0]); }),
    /Invalid explicit naming changes/);
});
test('spelling guards, unique symbols and deterministic order remain mandatory', () => {
  assert.throws(() => fixture(data => { delete data.renames[0].originalName; }), /Incomplete guarded naming rule/);
  assert.throws(() => fixture(data => { data.renames[0].to = 'not a name'; }), /Incomplete guarded naming rule/);
  assert.throws(() => fixture(data => { data.renames.push(data.renames[0]); }), /duplicate or missing identities/);
  assert.throws(() => fixture(data => { data.renames.reverse(); }), /deterministic canonical form/);
});
test('source and generator changes need a current explicit migration record', () => {
  for (const change of [
    data => { data.source.commit = '0'.repeat(40); },
    data => { data.inputTreeSha256 = '0'.repeat(64); },
    data => { data.generators.javaTools.commit = '0'.repeat(40); },
  ]) assert.throws(() => fixture(change), /explicit sourceChange/);
});
test('source evidence refuses duplicate entries, traversal and malformed hashes', () => {
  for (const change of [
    data => { data.publication.sourceEvidence.push(data.publication.sourceEvidence[0]); },
    data => { data.publication.sourceEvidence[0].file = '../ab.java'; },
    data => { data.publication.sourceEvidence[0].sha256 = 'different'; },
  ]) assert.throws(() => fixture(change), /Invalid current source evidence/);
});
test('native evidence binds current probe bytes and its fixed native trace', () => {
  for (const change of [
    data => { data.publication.nativeEvidence[0].sha256 = '0'.repeat(64); },
    data => { data.publication.nativeEvidence[0].nativeOutputSha256 = '0'.repeat(64); },
    (_data, directory) => { fs.appendFileSync(path.join(directory, 'tests/test-geoblox-text-write.mjs'), '\n'); },
    (_data, directory) => { fs.appendFileSync(path.join(directory, 'tests/test-geoblox-gameplay.mjs'), '\n'); },
  ]) assert.throws(() => fixture(change), /Reviewed native probe differs/);
});
test('frozen tool bytes are still checked from the single current manifest workflow', () => {
  assert.throws(() => fixture((_data, directory) => {
    fs.appendFileSync(path.join(directory, 'tools/readable-java.mjs'), '\n');
  }), /Frozen naming tool changed/);
});
