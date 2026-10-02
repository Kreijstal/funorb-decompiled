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
      'rules/geoblox-v10.json', 'rules/geoblox-v11-migration.json',
      'rules/geoblox-v11.json', 'rules/geoblox-v12-migration.json',
      'rules/geoblox-v12.json', 'rules/geoblox-v13-text.json', 'rules/geoblox-v13.json',
      'rules/geoblox-v14-migration.json', 'rules/geoblox-v14.json',
      'rules/geoblox-v15-migration.json', 'rules/geoblox-v15.json',
      'rules/geoblox-v16-border.json', 'rules/geoblox-v16.json',
      'rules/geoblox-v17-migration.json', 'rules/geoblox-v17.json',
      'rules/geoblox-v18-results.json', 'tools/PIN.json']) {
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

test('reviewed lineage reproduces all 972 guarded rules', () => {
  assert.equal(JSON.parse(fixture().stdout).rules, 972);
});

test('result additions cannot replace retained names, duplicate identities or lose spelling guards', () => {
  assert.throws(() => fixture(edit => edit('rules/geoblox-v18-results.json', data => {
    data.renames[0].symbol = 'C:gh';
  })), /replace a retained naming identity/);
  assert.throws(() => fixture(edit => edit('rules/geoblox-v18-results.json', data => {
    data.renames[0].symbol = data.renames[1].symbol;
  })), /duplicate naming identities/);
  assert.throws(() => fixture(edit => edit('rules/geoblox-v18-results.json', data => {
    delete data.renames[0].originalName;
  })), /Incomplete guarded result rule/);
});

test('result additions retain input, generator, naming-tool and resource-evidence identities', () => {
  for (const field of ['previousRulesSha256', 'inputTreeSha256', 'sourceCommit', 'javaToolsCommit',
    'namingToolCommit', 'textEvidenceMigration', 'textEvidenceMigrationSha256']) {
    assert.throws(() => fixture(edit => edit('rules/geoblox-v18-results.json', data => {
      data[field] = 'different';
    })), /reviewed pass-18 result manifest/);
  }
  assert.throws(() => fixture(edit => edit('rules/geoblox-v17.json', data => {
    data.renames[0].to = 'DifferentHistoricalName';
  })), /Retained pass 17.*reviewed rule lineage/);
  assert.throws(() => fixture(edit => edit('geoblox-source-pin.json', data => {
    data.namingAdditions = 'rules/geoblox-v16-border.json';
  })), /reviewed result-helper additions/);
});

test('result additions require unchanged source identities, complete counts and reviewed source files', () => {
  for (const mutate of [
    data => { data.review.rulesRetained--; },
    data => { data.review.rulesAdded--; },
    data => { data.review.originalSpellingGuardsMatched--; },
    data => { data.review.namedLocalsAdded--; },
    data => { data.review.sourceBodyEdited = true; },
    data => { data.review.rawSourceTreeUnchanged = false; },
    data => { data.review.identityChanges.push({from: 'L:gh.f(I)V#0', to: 'L:gh.f(I)V#1'}); },
    data => { data.sourceEvidence.pop(); },
    data => { data.sourceEvidence[0].file = '../gd.java'; },
    data => { data.sourceEvidence[0].sha256 = 'different'; },
  ]) assert.throws(() => fixture(edit => edit('rules/geoblox-v18-results.json', mutate)),
    /reviewed pass-18 result manifest/);
});
test('a replacement input digest alone cannot migrate the export', () => {
  assert.throws(() => fixture(edit => edit('geoblox-source-pin.json', data => {
    data.inputTreeSha256 = '0'.repeat(64);
  })), /reviewed pass-17 migration/);
});
test('a different decompiler revision requires a new reviewed migration', () => {
  assert.throws(() => fixture(edit => edit('geoblox-source-pin.json', data => {
    data.generators.javaTools.commit = '0'.repeat(40);
  })), /reviewed pass-17 migration/);
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

test('pass 12 preserves all reviewed declaration identities and pass 11 history', () => {
  assert.throws(() => fixture(edit => edit('rules/geoblox-v12-migration.json', data => {
    data.identityChanges.push({from: 'L:c.h(B)V#0', to: 'L:c.h(B)V#1'});
  })), /reviewed pass-12 migration/);
  assert.throws(() => fixture(edit => edit('rules/geoblox-v12-migration.json', data => {
    data.review.namedLocalDeclarationIdentitiesUnchanged--;
  })), /reviewed pass-12 migration/);
  assert.throws(() => fixture(edit => edit('rules/geoblox-v11.json', data => {
    data.renames[0].to = 'ChangedHistoricalName';
  })), /reviewed rule lineage/);
});

test('text additions cannot replace retained identities or duplicate new ones', () => {
  assert.throws(() => fixture(edit => edit('rules/geoblox-v13-text.json', data => {
    data.renames[0].symbol = 'C:gh';
  })), /replace a retained naming identity/);
  assert.throws(() => fixture(edit => edit('rules/geoblox-v13-text.json', data => {
    data.renames[0].symbol = data.renames[1].symbol;
  })), /duplicate naming identities/);
});
test('text additions retain spelling guards and the reviewed naming tool', () => {
  assert.throws(() => fixture(edit => edit('rules/geoblox-v13-text.json', data => {
    delete data.renames[0].originalName;
  })), /Incomplete guarded text rule/);
  assert.throws(() => fixture(edit => edit('tools/PIN.json', data => {
    data.adaptedToolCommit = '0'.repeat(40);
  })), /reviewed pass-13 text additions/);
});
test('pass 13 retains its historical source commit, old manifest and resource counts', () => {
  assert.throws(() => fixture(edit => edit('rules/geoblox-v13.json', data => {
    data.source.commit = '0'.repeat(40);
  })), /reviewed pass-13 text additions/);
  assert.throws(() => fixture(edit => edit('rules/geoblox-v12.json', data => {
    data.renames[0].to = 'ChangedHistoricalName';
  })), /reviewed rule lineage/);
  assert.throws(() => fixture(edit => edit('rules/geoblox-v13-text.json', data => {
    data.review.discardedReadsUnnamed--;
  })), /reviewed pass-13 text additions/);
});

test('pass 14 guards its source commit and retains every local identity', () => {
  assert.throws(() => fixture(edit => edit('rules/geoblox-v14.json', data => {
    data.source.commit = '0'.repeat(40);
  })), /reviewed pass-14 migration/);
  assert.throws(() => fixture(edit => edit('rules/geoblox-v14-migration.json', data => {
    data.review.namedLocalDeclarationIdentitiesUnchanged--;
  })), /reviewed pass-14 migration/);
  assert.throws(() => fixture(edit => edit('rules/geoblox-v14-migration.json', data => {
    data.identityChanges.push({from: 'L:bc.a(I[BII)Ljava/lang/String;#0', to: 'L:bc.a(I[BII)Ljava/lang/String;#1'});
  })), /reviewed pass-14 migration/);
});

test('pass 14 cannot rewrite historical names or borrow a resource identity', () => {
  assert.throws(() => fixture(edit => edit('rules/geoblox-v13.json', data => {
    data.renames[0].to = 'ChangedHistoricalName';
  })), /reviewed rule lineage/);
  assert.throws(() => fixture(edit => edit('rules/geoblox-v14-migration.json', data => {
    data.textEvidence.resourceAssignments[0].resources[0].key = 'different';
  })), /changes reviewed resource identities/);
});

test('pass 15 binds the new source commit and retains the complete pass-14 snapshot', () => {
  assert.throws(() => fixture(edit => edit('rules/geoblox-v15.json', data => {
    data.source.commit = '0'.repeat(40);
  })), /reviewed pass-15 migration/);
  assert.throws(() => fixture(edit => edit('rules/geoblox-v14.json', data => {
    data.renames[0].to = 'ChangedHistoricalName';
  })), /reviewed rule lineage/);
});

test('pass 15 local moves preserve spelling, method, semantic name and evidence', () => {
  for (const change of [
    move => { move.originalName = 'wrongLocal'; },
    move => { move.to = 'L:gh.a(I)V#6'; },
    move => { move.readableName = 'wrongRole'; },
    move => { move.evidence = 'unreviewed'; },
  ]) assert.throws(() => fixture(edit => edit('rules/geoblox-v15-migration.json', data => {
    change(data.identityChanges[0]);
  })), /reviewed pass-15 migration/);
});

test('pass 15 moves cannot collide or omit a reviewed type/identity count', () => {
  assert.throws(() => fixture(edit => edit('rules/geoblox-v15-migration.json', data => {
    data.identityChanges[0].to = data.identityChanges[1].to;
  })), /duplicate identities/);
  for (const key of ['namedLocalTypesMatched', 'namedLocalDeclarationIdentitiesUnchanged',
    'namedLocalDeclarationIdentitiesMoved'])
    assert.throws(() => fixture(edit => edit('rules/geoblox-v15-migration.json', data => {
      data.review[key]--;
    })), /reviewed pass-15 migration/);
});

test('pass 15 cannot change the retained loader source or resource evidence', () => {
  for (const change of [
    evidence => { evidence.loaderSourceSha256 = '0'.repeat(64); },
    evidence => { evidence.resourceAssignments[0].resources[0].key = 'different'; },
  ]) assert.throws(() => fixture(edit => edit('rules/geoblox-v15-migration.json', data => {
    change(data.textEvidence);
  })), /changes reviewed resource identities or unchanged loader source/);
});

test('pass 16 additions retain their source and every pass-15 name', () => {
  assert.throws(() => fixture(edit => edit('geoblox-source-pin.json', data => {
    data.commit = '0'.repeat(40);
  })), /reviewed pass-17 migration/);
  assert.throws(() => fixture(edit => edit('rules/geoblox-v15.json', data => {
    data.renames[0].to = 'ChangedHistoricalName';
  })), /reviewed rule lineage/);
  assert.throws(() => fixture(edit => edit('rules/geoblox-v16-border.json', data => {
    data.review.sourceBodyEdited = true;
  })), /reviewed pass-16 border manifest/);
});

test('pass 16 additions cannot replace retained identities, duplicate identities or lose guards', () => {
  assert.throws(() => fixture(edit => edit('rules/geoblox-v16-border.json', data => {
    data.renames[0].symbol = 'C:gh';
  })), /replace a retained naming identity/);
  assert.throws(() => fixture(edit => edit('rules/geoblox-v16-border.json', data => {
    data.renames[1].symbol = data.renames[0].symbol;
  })), /duplicate naming identities/);
  assert.throws(() => fixture(edit => edit('rules/geoblox-v16-border.json', data => {
    delete data.renames[0].originalName;
  })), /Incomplete guarded border rule/);
});

test('pass 16 preserves all complete validation override families', () => {
  assert.throws(() => fixture(edit => edit('rules/geoblox-v16-border.json', data => {
    data.renames.find(rule => rule.symbol === 'M:ib.e(I)Llh;').to = 'WrongFamilyName';
  })), /incomplete or inconsistent reviewed override family/);
  assert.throws(() => fixture(edit => edit('rules/geoblox-v16-border.json', data => {
    data.overrideFamilies.pop();
  })), /incomplete or inconsistent reviewed override family/);
});

test('pass 16 cannot borrow another text-evidence revision', () => {
  for (const key of ['textEvidenceMigration', 'textEvidenceMigrationSha256'])
    assert.throws(() => fixture(edit => edit('rules/geoblox-v16-border.json', data => {
      data[key] = 'wrong';
    })), /reviewed pass-16 border manifest/);
});


test('pass 17 retains every declaration without silently migrating local identities', () => {
  for (const change of [
    data => { data.identityChanges.push({from: 'L:gh.f(I)V#4', to: 'L:gh.f(I)V#5'}); },
    data => { data.review.namedLocalDeclarationIdentitiesUnchanged--; },
    data => { data.review.sourceDeclarationIdentitiesUnchanged--; },
    data => { data.review.originalSpellingGuardsMatched--; },
  ]) assert.throws(() => fixture(edit => edit('rules/geoblox-v17-migration.json', change)),
    /reviewed pass-17 migration/);
});

test('pass 17 cannot replace the frozen naming pass or claim hand-edited source', () => {
  assert.throws(() => fixture(edit => edit('rules/geoblox-v16.json', data => {
    data.renames[0].to = 'ChangedHistoricalName';
  })), /reviewed rule lineage/);
  for (const change of [
    data => { data.review.sourceBodyEditedByHand = true; },
    data => { data.review.changedJavaFiles = ['gh.java']; },
    data => { data.review.correctedNumericNegations = 5; },
    data => { data.review.bytecodeUnchanged = false; },
  ]) assert.throws(() => fixture(edit => edit('rules/geoblox-v17-migration.json', change)),
    /reviewed pass-17 migration/);
});

test('pass 17 binds the decompiler source archive and retains original text evidence', () => {
  for (const change of [
    data => { data.decompilerSourceArchiveSha256 = '0'.repeat(64); },
    data => { data.previousInputTreeSha256 = '0'.repeat(64); },
    data => { data.textEvidenceMigration = 'rules/geoblox-v14-migration.json'; },
    data => { data.textEvidenceMigrationSha256 = '0'.repeat(64); },
  ]) assert.throws(() => fixture(edit => edit('rules/geoblox-v17-migration.json', change)),
    /reviewed pass-17 migration/);
});
