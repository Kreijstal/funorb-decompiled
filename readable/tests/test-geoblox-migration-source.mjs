import fs from 'node:fs';
import os from 'node:os';
import path from 'node:path';
import assert from 'node:assert/strict';
import test from 'node:test';
import {fileURLToPath} from 'node:url';
import {captureProcess} from '../tools/lib/capture-process.mjs';

const root = fileURLToPath(new URL('../', import.meta.url));
function rejection(change, message) {
  const temporary = fs.mkdtempSync(path.join(os.tmpdir(), 'geoblox-current-source-'));
  try {
    captureProcess('git', ['clone', '--shared', '--no-checkout', '--quiet', path.resolve(root, '..'), temporary]);
    const directory = path.join(temporary, 'readable');
    for (const file of ['reproduce-geoblox.mjs', 'build-geoblox-rules.mjs', 'text-resource-evidence.mjs',
      'geoblox-rules.json', 'funorb-stubs.jar', 'tests/test-geoblox-match-scoring.mjs',
      'tests/test-geoblox-text-write.mjs', 'tools/PIN.json', 'tools/readable-java.mjs',
      'tools/lib/ReadableJava.java', 'tools/lib/capture-process.mjs']) {
      const destination = path.join(directory, file);
      fs.mkdirSync(path.dirname(destination), {recursive: true});
      fs.copyFileSync(path.join(root, file), destination);
    }
    const file = path.join(directory, 'geoblox-rules.json');
    const manifest = JSON.parse(fs.readFileSync(file));
    change(manifest, directory);
    fs.writeFileSync(file, JSON.stringify(manifest, null, 2) + '\n');
    const output = path.join(temporary, 'output');
    assert.throws(() => {
      try { captureProcess(process.execPath, [path.join(directory, 'reproduce-geoblox.mjs'), output]); }
      catch (error) { throw new Error(error.stderr?.toString() || error.message); }
    }, message);
    assert.equal(fs.existsSync(output), false, 'refusal must not leave a partial export');
  } finally { fs.rmSync(temporary, {recursive: true, force: true}); }
}

test('wrapper checks frozen source bytes directly from the Git input', () => {
  rejection(data => { data.publication.sourceEvidence[0].sha256 = '0'.repeat(64); }, /Reviewed source differs/);
  rejection(data => { data.publication.sourceEvidence[0].file = '../ab.java'; }, /Invalid current source evidence/);
});
test('wrapper refuses unreviewed rule changes and previous Git hash corruption', () => {
  rejection(data => { data.renames[0].to = 'Different'; }, /without an explicit naming change/);
  rejection(data => { data.publication.previousRules.sha256 = '0'.repeat(64); }, /Previous Git rules differ/);
});
test('wrapper rejects changed native probe bytes before compilation', () => {
  rejection(data => { data.publication.nativeEvidence[0].sha256 = '0'.repeat(64); }, /Reviewed native probe differs/);
  rejection((_data, directory) => {
    fs.appendFileSync(path.join(directory, 'tests/test-geoblox-text-write.mjs'), '\n');
  }, /Reviewed native probe differs/);
});
test('wrapper verifies resource assignments against the actual current source', () => {
  rejection(data => { data.publication.textResources.loaderSourceSha256 = '0'.repeat(64); }, /loader source differs/);
  rejection(data => { data.publication.textResources.resourceAssignments[0].resources[0].key = 'wrong'; },
    /direct guarded assignments/);
});
test('wrapper refuses a changed compilation dependency or naming tool', () => {
  rejection(data => { data.publication.stubJarSha256 = '0'.repeat(64); }, /Frozen compilation dependency changed/);
  rejection((_data, directory) => { fs.appendFileSync(path.join(directory, 'tools/readable-java.mjs'), '\n'); },
    /Frozen naming tool changed/);
});
