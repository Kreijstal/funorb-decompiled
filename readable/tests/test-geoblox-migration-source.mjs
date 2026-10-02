import fs from 'node:fs';
import os from 'node:os';
import path from 'node:path';
import crypto from 'node:crypto';
import assert from 'node:assert/strict';
import test from 'node:test';
import {fileURLToPath} from 'node:url';
import {captureProcess} from '../tools/lib/capture-process.mjs';

const root = fileURLToPath(new URL('../', import.meta.url));
const repository = path.resolve(root, '..');
const hash = bytes => crypto.createHash('sha256').update(bytes).digest('hex');

// Use the real wrapper and pinned Git objects in an isolated local clone.
// Corruptions must be refused before javac or readable-source generation.
function rejection(mutate, message, refreshMigrationHash = false) {
  const temporary = fs.mkdtempSync(path.join(os.tmpdir(), 'geoblox-migration-source-'));
  try {
    captureProcess('git', ['clone', '--shared', '--no-checkout', '--quiet', repository, temporary]);
    for (const file of ['reproduce-geoblox.mjs', 'geoblox-rules.json', 'geoblox-source-pin.json',
      'rules/geoblox-v18.json', 'rules/geoblox-v18-results.json', 'rules/geoblox-v19-migration.json',
      'funorb-stubs.jar', 'tools/PIN.json', 'tools/readable-java.mjs',
      'tools/lib/ReadableJava.java', 'tools/lib/capture-process.mjs']) {
      const destination = path.join(temporary, 'readable', file);
      fs.mkdirSync(path.dirname(destination), {recursive: true});
      fs.copyFileSync(path.join(root, file), destination);
    }
    const migrationFile = path.join(temporary, 'readable/rules/geoblox-v19-migration.json');
    const migration = JSON.parse(fs.readFileSync(migrationFile));
    mutate(migration, temporary);
    fs.writeFileSync(migrationFile, JSON.stringify(migration, null, 2) + '\n');
    if (refreshMigrationHash) {
      const rulesFile = path.join(temporary, 'readable/geoblox-rules.json');
      const rules = JSON.parse(fs.readFileSync(rulesFile));
      rules.namingMigrationSha256 = hash(fs.readFileSync(migrationFile));
      fs.writeFileSync(rulesFile, JSON.stringify(rules, null, 2) + '\n');
    }
    const output = path.join(temporary, 'output');
    assert.throws(() => {
      try { captureProcess(process.execPath, [path.join(temporary, 'readable/reproduce-geoblox.mjs'), output]); }
      catch (error) { throw new Error(error.stderr?.toString() || error.message); }
    }, message);
    assert.equal(fs.existsSync(output), false, 'refusal must not produce a partial export');
  } finally { fs.rmSync(temporary, {recursive: true, force: true}); }
}

test('wrapper rejects a changed reviewed migration before generation', () => {
  rejection(data => { data.review.rulesRetained--; }, /Reviewed naming migration differs from the rules/);
});

test('wrapper checks current and previous source bytes despite self-consistent manifest hashes', () => {
  rejection(data => { data.sourceEvidence[0].sha256 = '0'.repeat(64); },
    /Reviewed migration source differs: oc.java/, true);
  rejection(data => { data.sourceEvidence[0].previousSha256 = '0'.repeat(64); },
    /Previous migration source differs: oc.java/, true);
});

test('wrapper rejects traversal in current source and previous manifest paths', () => {
  rejection(data => { data.sourceEvidence[0].file = '../oc.java'; },
    /Reviewed migration source differs/, true);
  rejection(data => { data.previousRulesFile = '../geoblox-v18.json'; },
    /Invalid previous naming manifest path/, true);
});

test('wrapper checks the previous manifest bytes and its publication source pin', () => {
  rejection((_data, temporary) => {
    const file = path.join(temporary, 'readable/rules/geoblox-v18.json');
    fs.appendFileSync(file, ' ');
  }, /Previous naming manifest differs from the migration/);
  rejection((data, temporary) => {
    const file = path.join(temporary, 'readable/rules/geoblox-v18.json');
    const previous = JSON.parse(fs.readFileSync(file));
    previous.source.commit = 'different';
    fs.writeFileSync(file, JSON.stringify(previous, null, 2) + '\n');
    data.previousRulesSha256 = hash(fs.readFileSync(file));
  }, /Invalid previous publication source pin/, true);
});
