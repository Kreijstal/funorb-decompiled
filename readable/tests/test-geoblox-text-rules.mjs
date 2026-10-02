import fs from 'node:fs';
import assert from 'node:assert/strict';
import test from 'node:test';
import {validateTextResourceEvidence} from '../text-resource-evidence.mjs';
import {captureProcess} from '../tools/lib/capture-process.mjs';
import {fileURLToPath} from 'node:url';

const source = fs.readFileSync(new URL('../../games/geoblox/wi.java', import.meta.url), 'utf8');
const historical = JSON.parse(fs.readFileSync(new URL('../rules/geoblox-v13-text.json', import.meta.url)));
const migration = JSON.parse(fs.readFileSync(new URL('../rules/geoblox-v14-migration.json', import.meta.url)));
const manifest = {...historical, ...migration.textEvidence};
const retained = JSON.parse(fs.readFileSync(new URL('../rules/geoblox-v12.json', import.meta.url))).renames;
const check = change => {
  const altered = structuredClone(manifest);
  change?.(altered);
  return validateTextResourceEvidence(source, altered, retained);
};

test('pass 13 text evidence still verifies its immutable historical input', () => {
  const pass13 = JSON.parse(fs.readFileSync(new URL('../rules/geoblox-v13.json', import.meta.url)));
  const repository = fileURLToPath(new URL('../../', import.meta.url));
  const oldSource = captureProcess('git', ['-C', repository, 'show',
    `${pass13.source.commit}:games/geoblox/wi.java`]).stdout.toString('utf8');
  assert.deepEqual(validateTextResourceEvidence(oldSource, historical, retained),
    {resourceFields: 152, storedReads: 218, discardedReads: 526});
});

test('all 152 named resource fields follow direct guarded assignments', () => {
  assert.deepEqual(check(), {resourceFields: 152, storedReads: 218, discardedReads: 526});
});
test('text evidence rejects a changed loader source', () => {
  assert.throws(() => validateTextResourceEvidence(source.replace('"loginm3"', '"different"'),
    manifest, retained), /loader source differs/);
});
test('a field cannot borrow another resource key or array index', () => {
  assert.throws(() => check(data => { data.resourceAssignments[0].resources[0].key = 'loginm3'; }),
    /direct guarded assignments/);
  assert.throws(() => check(data => { data.resourceAssignments[0].resources[0].index = 3; }),
    /direct guarded assignments/);
});
test('resource evidence does not invent a field for a discarded decode', () => {
  assert.throws(() => check(data => { data.resourceAssignments[0].symbol = 'F:wi.field_unknown:Ljava/lang/String;'; }),
    /direct guarded assignments/);
  assert.throws(() => check(data => { data.review.discardedReadsUnnamed--; }), /strictly equal/);
});
test('every resource name retains its spelling and reviewed rule', () => {
  assert.throws(() => check(data => {
    const symbol = data.resourceAssignments.find(binding => !binding.retainedRule).symbol;
    data.renames.find(rule => rule.symbol === symbol).originalName = 'different';
  }), /spelling guard differs/);
  assert.throws(() => check(data => { data.resourceAssignments[0].to = 'different'; }),
    /reviewed name/);
});
test('resource rules preserve the previous named reconnect field', () => {
  assert.throws(() => check(data => { data.resourceAssignments[0].retainedRule = false; }),
    /retention differs/);
});

test('the unqualified loading-graphics field retains its enclosing class identity', () => {
  const binding = manifest.resourceAssignments.find(item => item.symbol === 'F:wi.field_F:Ljava/lang/String;');
  assert.equal(binding.to, 'loadingGraphicsText');
  assert.deepEqual(binding.resources.map(item => item.key), ['loading_graphics']);
  assert.throws(() => check(data => {
    data.resourceAssignments = data.resourceAssignments.filter(item => item.symbol !== binding.symbol);
  }), /direct guarded assignments/);
});
