import fs from 'node:fs';
import os from 'node:os';
import path from 'node:path';
import assert from 'node:assert/strict';
import test from 'node:test';
import {fileURLToPath} from 'node:url';
import {captureProcess} from '../tools/lib/capture-process.mjs';

const root = fileURLToPath(new URL('../', import.meta.url));
function fixture(change) {
  const temporary = fs.mkdtempSync(path.join(os.tmpdir(), 'geoblox-rule-builder-'));
  try {
    for (const file of ['build-geoblox-rules.mjs', 'geoblox-source-pin.json',
      'geoblox-rules.json', 'rules/geoblox-v5.json', 'rules/geoblox-v6-gameplay.json',
      'rules/geoblox-v6.json', 'rules/geoblox-v7-migration.json',
      'rules/geoblox-v7.json', 'rules/geoblox-v8-migration.json',
      'rules/geoblox-v8.json', 'rules/geoblox-v9-migration.json',
      'rules/geoblox-v9.json', 'rules/geoblox-v10-migration.json',
      'rules/geoblox-v10.json', 'rules/geoblox-v11-migration.json']) {
      fs.mkdirSync(path.dirname(path.join(temporary, file)), {recursive: true});
      fs.copyFileSync(path.join(root, file), path.join(temporary, file));
    }
    change?.((file, update) => {
      const target = path.join(temporary, file);
      const data = JSON.parse(fs.readFileSync(target));
      update(data);
      fs.writeFileSync(target, JSON.stringify(data, null, 2) + '\n');
    });
    try {
      return captureProcess(process.execPath,
        [path.join(temporary, 'build-geoblox-rules.mjs'), '--check']);
    } catch (error) {
      throw new Error(error.stderr?.toString() || error.message);
    }
  } finally { fs.rmSync(temporary, {recursive: true, force: true}); }
}

test('reviewed lineage reproduces all 642 guarded rules', () => {
  assert.equal(JSON.parse(fixture().stdout).rules, 642);
});
test('a replacement input digest alone cannot migrate the export', () => {
  assert.throws(() => fixture(edit => edit('geoblox-source-pin.json', data => {
    data.inputTreeSha256 = '0'.repeat(64);
  })), /reviewed pass-11 migration/);
});
test('a different decompiler revision requires a new reviewed migration', () => {
  assert.throws(() => fixture(edit => edit('geoblox-source-pin.json', data => {
    data.generators.javaTools.commit = '0'.repeat(40);
  })), /reviewed pass-11 migration/);
});
test('previous names and migration identities cannot change silently', () => {
  assert.throws(() => fixture(edit => edit('rules/geoblox-v6.json', data => {
    data.renames[0].to = 'DifferentName';
  })), /reviewed rule lineage/);
  assert.throws(() => fixture(edit => edit('rules/geoblox-v8-migration.json', data => {
    data.identityChanges.push({from: 'L:gh.a(I)V#0', to: 'L:gh.a(I)V#1'});
  })), /reviewed pass-8 migration/);
});
test('local migrations preserve the original spelling guard', () => {
  assert.throws(() => fixture(edit => edit('rules/geoblox-v8-migration.json', data => {
    data.identityChanges[0].originalName = 'wrongLocal';
  })), /reviewed pass-8 migration/);
});
test('local migrations cannot cross a JVM method boundary', () => {
  assert.throws(() => fixture(edit => edit('rules/geoblox-v8-migration.json', data => {
    data.identityChanges[0].to = 'L:gh.b(B)V#16';
  })), /reviewed pass-8 migration/);
});
test('migrated declarations retain distinct identities', () => {
  assert.throws(() => fixture(edit => edit('rules/geoblox-v8-migration.json', data => {
    data.identityChanges[0].to = data.identityChanges[1].to;
  })), /duplicate identities/);
});
test('pass 9 requires unchanged reviewed declaration identities', () => {
  assert.throws(() => fixture(edit => edit('rules/geoblox-v9-migration.json', data => {
    data.identityChanges.push({from: 'L:c.h(B)V#0', to: 'L:c.h(B)V#1'});
  })), /reviewed pass-9 migration/);
  assert.throws(() => fixture(edit => edit('rules/geoblox-v9-migration.json', data => {
    data.review.namedLocalDeclarationIdentitiesUnchanged--;
  })), /reviewed pass-9 migration/);
});
test('current local migrations guard spelling, method boundaries and distinct identities', () => {
  assert.throws(() => fixture(edit => edit('rules/geoblox-v10-migration.json', data => {
    data.identityChanges[0].originalName = 'wrongLocal';
  })), /reviewed pass-10 migration/);
  assert.throws(() => fixture(edit => edit('rules/geoblox-v10-migration.json', data => {
    data.identityChanges[0].to = 'L:kc.a(IB)V#21';
  })), /reviewed pass-10 migration/);
  assert.throws(() => fixture(edit => edit('rules/geoblox-v10-migration.json', data => {
    data.identityChanges[0].to = data.identityChanges[1].to;
  })), /duplicate identities/);
});

test('pass 11 requires unchanged reviewed declaration identities', () => {
  assert.throws(() => fixture(edit => edit('rules/geoblox-v11-migration.json', data => {
    data.identityChanges.push({from: 'L:c.h(B)V#0', to: 'L:c.h(B)V#1'});
  })), /reviewed pass-11 migration/);
  assert.throws(() => fixture(edit => edit('rules/geoblox-v11-migration.json', data => {
    data.review.namedLocalDeclarationIdentitiesUnchanged--;
  })), /reviewed pass-11 migration/);
  assert.throws(() => fixture(edit => edit('rules/geoblox-v10.json', data => {
    data.renames[0].to = 'ChangedHistoricalName';
  })), /reviewed rule lineage/);
});
