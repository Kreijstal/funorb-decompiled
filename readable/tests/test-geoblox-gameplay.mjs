import fs from 'node:fs';
import os from 'node:os';
import path from 'node:path';
import assert from 'node:assert/strict';
import {fileURLToPath} from 'node:url';
import {sourceInventory} from '../tools/readable-java.mjs';
import {captureProcess} from '../tools/lib/capture-process.mjs';

const root = fileURLToPath(new URL('../', import.meta.url));
const rules = JSON.parse(fs.readFileSync(path.join(root, 'geoblox-rules.json')));
const aliases = new Map(rules.renames.map(rule => [rule.symbol, rule.to]));
const temporary = fs.mkdtempSync(path.join(os.tmpdir(), 'geoblox-gameplay-'));
try {
  for (const renamed of [false, true]) {
    const name = (key, original) => renamed ? aliases.get(key) ?? original : original;
    const type = original => name('C:' + original, original);
    const field = (owner, original, descriptor) => name(`F:${owner}.${original}:${descriptor}`, original);
    const global = (owner, original, descriptor) => type(owner) + '.' + field(owner, original, descriptor);
    const method = (owner, signature) => name('M:' + owner + '.' + signature, signature.split('(')[0]);
    const call = (owner, signature) => type(owner) + '.' + method(owner, signature);
    const deque = type('tf'), popup = type('me'), entity = type('ja'), raster = type('dm');
    const active = global('md', 'field_a', 'Ltf;'), available = global('ue', 'field_f', 'Ltf;');
    const addLast = method('tf', 'a(ILhf;)V'), empty = method('tf', 'c(I)Z');
    const framebuffer = global('vb', 'field_c', '[I');
    const candidates = global('nk', 'field_f', '[I');
    const candidateCount = global('h', 'field_a', 'I');
    const chain = global('gf', 'field_f', 'I');
    const moving = global('ji', 'field_r', 'Ltf;');
    const staged = global('wd', 'field_e', 'Ltf;');
    const transient = global('bh', 'field_c', 'Ltf;');
    const attached = global('a', 'field_d', 'Ltf;');
    const harness = `public final class GameplayBehavior {
      static void check(boolean value, String label) { if (!value) throw new AssertionError(label); }
      static boolean boundary() { return ${call('ld', 'a(I)Z')}(-61); }
      public static void main(String[] args) {
        ${global('Geoblox', 'field_C', 'I')} = 0;
        ${global('vb', 'field_f', 'I')} = 640;
        ${global('vb', 'field_b', 'I')} = 480;
        ${framebuffer} = new int[640 * 480];
        check(!boundary(), "empty playfield");
        int[][] nonBoundary = {{320,240}, {549,240}, {551,240}, {320,11}, {320,9}};
        for (int[] point : nonBoundary) {
          ${framebuffer}[point[0] + point[1] * 640] = 7;
          check(!boundary(), "interior/exterior pixel");
          ${framebuffer}[point[0] + point[1] * 640] = 0;
        }
        int[][] hits = {{550,240}, {90,240}, {320,10}, {320,470},
          {550,241}, {90,239}, {321,10}, {319,470}};
        for (int[] point : hits) {
          ${framebuffer}[point[0] + point[1] * 640] = 1;
          check(boundary(), "circle contact at " + point[0] + "," + point[1]);
          ${framebuffer}[point[0] + point[1] * 640] = 0;
        }

        ${active} = new ${deque}();
        ${available} = new ${deque}();
        ${popup} first = new ${popup}(), second = new ${popup}();
        ${available}.${addLast}(-35, second);
        ${available}.${addLast}(-35, first);
        ${call('ug', 'a(IZIII)V')}(90, true, 220, 3, 330);
        ${call('ug', 'a(IZIII)V')}(17, true, 100, 1, 80);
        check(${available}.${empty}(13519), "popup pool consumed");
        check(${active}.${method('tf', 'a(I)I')}(100) == 2, "two active popups");
        check(first.${field('me', 'field_f', 'I')} == 90 && second.${field('me', 'field_f', 'I')} == 17, "points");
        check(first.${field('me', 'field_h', 'I')} == 3 && second.${field('me', 'field_h', 'I')} == 1, "chain");
        check(first.${field('me', 'field_m', 'Ljava/lang/String;')}.equals("90"), "points text");
        check(first.${field('me', 'field_n', 'F')} == 330 && first.${field('me', 'field_i', 'F')} == 220, "origin");
        float progress = 0;
        for (int tick = 0; tick < 10; tick++) {
          progress += 0.03999999910593033f * progress + 0.00004999999873689376f;
          ${call('cf', 'd(B)V')}((byte)27);
          check(Float.floatToIntBits(first.${field('me', 'field_k', 'F')}) == Float.floatToIntBits(progress), "progress");
          check(first.${field('me', 'field_k', 'F')} == second.${field('me', 'field_k', 'F')}, "shared progress");
        }
        check(${call('wa', 'a(I)I')}(-25866) == 107, "unfinished points already include multiplier");
        check(${active}.${empty}(13519), "active popups drained");
        check(${call('wa', 'a(I)I')}(-25866) == 0, "empty drain");

        // Use a one-pixel ordinary sprite so the real entity constructor runs.
        ${global('c', 'field_ab', 'I')} = 0;
        ${global('ke', 'field_a', '[[[Ldm;')} = new ${raster}[1][1][1];
        ${global('ke', 'field_a', '[[[Ldm;')}[0][0][0] = new ${raster}(1, 1);
        ${entity}[] triple = new ${entity}[3];
        for (int i = 0; i < 3; i++)
          triple[i] = new ${entity}(0, 0, 0, 320, 240, 0, 0, 0, 0, i + 1);
        ${global('tl', 'field_g', '[Lja;')} = new ${entity}[]{null, triple[0], triple[1], triple[2]};
        int packed = (1 << 20) | (2 << 10) | 3;
        for (int blocked = 0; blocked < 3; blocked++) {
          ${chain} = 0;
          for (int i = 0; i < 3; i++) {
            triple[i].${field('ja', 'field_E', 'I')} = i == blocked ? 1 : 0;
            triple[i].${field('ja', 'field_K', 'Ltf;')} = new ${deque}();
          }
          ${candidateCount} = 2;
          ${candidates} = new int[]{packed, packed};
          check(${call('ec', 'b(I)Z')}(-18913), "blocked nonempty batch still processed");
          check(${candidateCount} == 0 && ${candidates}[0] == 0 && ${candidates}[1] == 0, "batch consumed");
          check(${chain} == 0 && ${active}.${empty}(13519), "cooldown prevented points popup");
          for (${entity} member : triple)
            check(member.${field('ja', 'field_K', 'Ltf;')} == null, "candidate queue reset");
        }
        ${global('wb', 'field_b', 'I')} = 0;
        check(!${call('ec', 'b(I)Z')}(-18913), "empty batch");

        ${moving} = new ${deque}(); ${staged} = new ${deque}(); ${transient} = new ${deque}();
        ${attached} = new ${deque}();
        ${attached}.${addLast}(-35, triple[0]);
        ${global('jl', 'field_t', 'Z')} = false;
        check(${call('ih', 'a(I)Z')}(0), "settled does not mean attached board empty");
        for (${deque} queue : new ${deque}[]{${moving}, ${staged}, ${transient}}) {
          queue.${addLast}(-35, triple[1]);
          check(!${call('ih', 'a(I)Z')}(0), "active queue prevents settling");
          queue.${method('tf', 'b(B)Lhf;')}((byte)-100);
        }
        ${global('jl', 'field_t', 'Z')} = true;
        check(!${call('ih', 'a(I)Z')}(0), "additional settling gate");
        System.out.println("gameplay behavior passed");
      }
    }`;
    const directory = path.join(temporary, renamed ? 'renamed' : 'original');
    const classes = path.join(directory, 'classes');
    fs.mkdirSync(classes, {recursive: true});
    const harnessFile = path.join(directory, 'GameplayBehavior.java');
    fs.writeFileSync(harnessFile, harness);
    const sourceRoot = path.join(root, renamed ? 'geoblox/src' : '../games/geoblox');
    const files = path.join(directory, 'sources.txt');
    fs.writeFileSync(files, [...sourceInventory(sourceRoot).map(file => JSON.stringify(path.join(sourceRoot, file.path))), JSON.stringify(harnessFile)].join('\n') + '\n');
    const classpath = path.join(root, 'funorb-stubs.jar');
    captureProcess(process.env.JAVAC ?? 'javac', ['--release', '8', '-proc:none', '-encoding', 'UTF-8', '-classpath', classpath, '-d', classes, '@' + files]);
    const output = captureProcess(process.env.JAVA ?? 'java', ['-Djava.awt.headless=true', '-cp', classes + path.delimiter + classpath, 'GameplayBehavior']);
    assert.equal(output.stdout.toString(), 'gameplay behavior passed\n');
    console.log(`${renamed ? 'renamed' : 'original'}: boundary probes, popup progress/drain, cooldown deferral and queue settling passed`);
  }
} catch (error) {
  if (error.stderr) process.stderr.write(error.stderr);
  throw error;
} finally {
  fs.rmSync(temporary, {recursive: true, force: true});
}
