import fs from 'node:fs';
import os from 'node:os';
import path from 'node:path';
import crypto from 'node:crypto';
import assert from 'node:assert/strict';
import {fileURLToPath} from 'node:url';
import {sourceInventory} from '../tools/readable-java.mjs';
import {captureProcess} from '../tools/lib/capture-process.mjs';

// Controlled registration and packet scopes, with independent mask/queue and
// big-endian/CRC oracles. A pre-existing notification avoids asset/font loading.
// This does not exercise an empty panel, login/retry/acknowledgement, networking,
// or interpret the tracking integers as a server-side validation algorithm.
const root = fileURLToPath(new URL('../', import.meta.url));
const nativeInput = process.argv[2] && path.resolve(process.argv[2]);
const aliases = new Map(JSON.parse(fs.readFileSync(path.join(root, 'geoblox-rules.json')))
  .renames.map(rule => [rule.symbol, rule.to]));
const expectedNativeSha256 = 'd6c2a9615dc04f73a8983a99f676bb23f2e00cd87573fae3a0701ce552f2dd00';
const temporary = fs.mkdtempSync(path.join(os.tmpdir(), 'geoblox-achievements-'));
try {
  if (nativeInput) {
    const files = [];
    const visit = directory => {
      for (const item of fs.readdirSync(directory, {withFileTypes: true})) {
        const file = path.join(directory, item.name);
        if (item.isDirectory()) visit(file);
        else if (item.name.endsWith('.class')) files.push(file);
      }
    };
    visit(nativeInput);
    const hash = crypto.createHash('sha256');
    for (const file of files.sort()) {
      const name = Buffer.from(path.relative(nativeInput, file).split(path.sep).join('/'));
      const bytes = fs.readFileSync(file);
      hash.update(name.length + ':'); hash.update(name);
      hash.update(bytes.length + ':'); hash.update(bytes);
    }
    const pin = JSON.parse(fs.readFileSync(path.join(root, '../decompilation/geoblox-provenance.json')))
      .verifiedTransformedClasses;
    assert.equal(files.length, pin.files);
    assert.equal(hash.digest('hex'), pin.sha256);
  }
  let expected;
  for (const variant of [...(nativeInput ? ['native'] : []), 'original', 'renamed']) {
    const native = variant === 'native', renamed = variant === 'renamed';
    const name = (symbol, original) => renamed ? aliases.get(symbol) ?? original : original;
    const type = original => name('C:' + original, original);
    const field = (owner, original, descriptor) => native ? original.replace(/^field_/, '')
      : name(`F:${owner}.${original}:${descriptor}`, original);
    const method = (owner, signature) => name('M:' + owner + '.' + signature, signature.split('(')[0]);
    const get = (owner, original, descriptor, instance = 'null') =>
      `get("${type(owner)}", "${field(owner, original, descriptor)}", ${instance})`;
    const set = (owner, original, descriptor, instance, value) =>
      `set("${type(owner)}", "${field(owner, original, descriptor)}", ${instance}, ${value});`;
    const harness = `import java.lang.reflect.*; import java.util.*;
      import java.nio.*; import java.util.zip.*; import java.security.*;
      public class AchievementBehavior {
        static final Object unsafe; static final Method allocate;
        static { try { Class<?> c=Class.forName("sun.misc.Unsafe");
          Field f=c.getDeclaredField("theUnsafe"); f.setAccessible(true); unsafe=f.get(null);
          allocate=c.getMethod("allocateInstance",Class.class);
        } catch(Exception e) { throw new RuntimeException(e); } }
        static Object alloc(String c) throws Exception { return allocate.invoke(unsafe,Class.forName(c)); }
        static Field f(String c,String n) throws Exception {
          Field f=Class.forName(c).getDeclaredField(n); f.setAccessible(true); return f; }
        static Object get(String c,String n,Object o) throws Exception { return f(c,n).get(o); }
        static void set(String c,String n,Object o,Object v) throws Exception { f(c,n).set(o,v); }
        static Method m(String c,String n,Class<?>... p) throws Exception {
          Method m=Class.forName(c).getDeclaredMethod(n,p); m.setAccessible(true); return m; }
        static Object deque() throws Exception { Constructor<?> c=Class.forName("${type('tf')}").getDeclaredConstructor();
          c.setAccessible(true); return c.newInstance(); }
        static void check(boolean b,String s) { if(!b)throw new AssertionError(s); }
        public static void main(String[] ignored) throws Exception {
          Method register=m("${type('ra')}","${method('ra','a(III)V')}",int.class,int.class,int.class);
          Method add=m("${type('tf')}","${method('tf','a(ILhf;)V')}",int.class,Class.forName("${type('hf')}"));
          Method pop=m("${type('tf')}","${method('tf','b(B)Lhf;')}",byte.class);
          Method first=m("${type('tf')}","${method('tf','g(I)Lhf;')}",int.class);
          Method init=m("${type('pk')}","${method('pk','a([IZ)V')}",int[].class,boolean.class);
          Method submit=m("${type('sj')}","${method('sj','a(Lp;II)V')}",Class.forName("${type('p')}"),int.class,int.class);
          MessageDigest trace=MessageDigest.getInstance("SHA-256"); int scenarios=0,packets=0;
          for(int control:new int[]{0,7}) for(int id:new int[]{-1,0,4,16,31,32,33,255,256})
          for(boolean tutorial:new boolean[]{false,true}) for(boolean blocked:new boolean[]{false,true})
          for(boolean earned:new boolean[]{false,true}) for(boolean tracked:new boolean[]{false,true})
          for(int guard:new int[]{-88,-47,0}) {
            int bit=1<<id, initialEarned=earned?bit:0, initialTracking=tracked?bit:0;
            int accumulator=id%2==0?Integer.MIN_VALUE:Integer.MAX_VALUE;
            int primary=id*17+1,secondary=id*31-8,checkByte=id^255;
            Object session=alloc("${type('gh')}"),pending=deque(),submissions=deque(),sent=deque();
            Object marker=alloc("${type('nj')}");
            ${set('Geoblox','field_C','I','null','control')}
            ${set('el','field_o','Lgh;','null','session')}
            ${set('gh','field_Y','Z','session','tutorial')}
            ${set('gh','field_K','Z','session','blocked')}
            ${set('gh','field_e','I','session','41')}
            ${set('pb','field_t','Ltf;','null','pending')}
            ${set('ja','field_A','Ltf;','null','submissions')}
            ${set('rh','field_a','Ltf;','null','sent')}
            ${set('vl','field_p','I','null','initialEarned')}
            ${set('ug','field_c','I','null','0x40000000')}
            ${set('dc','field_a','I','null','initialTracking')}
            ${set('el','field_g','I','null','accumulator')}
            ${set('sc','field_f','I','null','primary')}
            ${set('lb','field_b','I','null','secondary')}
            ${set('ra','field_b','Ljava/lang/String;','null','"sentinel"')}
            add.invoke(pending,-80,marker);
            register.invoke(null,checkByte,guard,id);
            boolean accept=!tutorial&&!earned;
            int wantedTracking=accept?initialTracking|bit:initialTracking;
            int wantedAccumulator=accept&&!tracked?accumulator-bit:accumulator;
            check((Integer)${get('vl','field_p','I')}==(accept?initialEarned|bit:initialEarned),"earned mask");
            check((Integer)${get('ug','field_c','I')}==(accept?0x40000000|bit:0x40000000),"new mask");
            check((Integer)${get('dc','field_a','I')}==wantedTracking,"tracking bits");
            check((Integer)${get('el','field_g','I')}==wantedAccumulator,"tracking accumulator overflow");
            check((Integer)${get('gh','field_e','I','session')}==41+(accept?1:0),"new count");
            check((accept&&guard>=-47)?${get('ra','field_b','Ljava/lang/String;')}==null:
              "sentinel".equals(${get('ra','field_b','Ljava/lang/String;')}),"invalid guard side effect");
            // A repeated registration must be a no-op even when the first was blocked from submission.
            register.invoke(null,checkByte,guard,id);
            check((Integer)${get('gh','field_e','I','session')}==41+(accept?1:0),"duplicate count");
            check(pop.invoke(pending,(byte)-118)==marker,"existing notification order");
            Object notification=pop.invoke(pending,(byte)-118);
            check((notification!=null)==accept,"notification presence");
            if(notification!=null)check((Integer)${get('nj','field_h','I','notification')}==id,"notification id");
            check(pop.invoke(pending,(byte)-118)==null,"no duplicate notifications");
            Object record=pop.invoke(submissions,(byte)-118);
            check((record!=null)==(accept&&!blocked),"submission gating");
            check(pop.invoke(submissions,(byte)-118)==null,"no duplicate records");
            if(record!=null) {
              int[] values=new int[]{id,checkByte,wantedTracking,wantedAccumulator,primary,secondary};
              String[] fields=new String[]{"${field('p','field_l','I')}","${field('p','field_h','I')}",
                "${field('p','field_f','I')}","${field('p','field_g','I')}",
                "${field('p','field_j','I')}","${field('p','field_n','I')}"};
              for(int i=0;i<6;i++)check((Integer)get("${type('p')}",fields[i],record)==values[i],"record field "+i);
              Object packet=alloc("${type('pk')}"); byte[] bytes=new byte[64];
              ${set('qc','field_j','[B','packet','bytes')}
              ${set('qc','field_f','I','packet','0')}
              ${set('fj','field_q','Lpk;','null','packet')}
              init.invoke(packet,new int[]{1,2,3,4},false);
              submit.invoke(null,record,-56,4);
              check(first.invoke(sent,0)==record,"record retained for acknowledgement/retry");
              check((Integer)${get('qc','field_f','I','packet')}==25,"packet length");
              check((bytes[1]&255)==23,"length backpatch");
              byte[] body=new byte[23]; ByteBuffer out=ByteBuffer.wrap(body).order(ByteOrder.BIG_ENDIAN);
              out.put((byte)1).put((byte)id).put((byte)checkByte).putInt(wantedTracking)
                .putInt(wantedAccumulator).putInt(primary).putInt(secondary);
              CRC32 crc=new CRC32(); crc.update(body,0,19); out.putInt((int)crc.getValue());
              check(Arrays.equals(body,Arrays.copyOfRange(bytes,2,25)),"independent packet/CRC layout");
              trace.update(Arrays.copyOf(bytes,25)); packets++;
            }
            String state=control+":"+id+":"+tutorial+":"+blocked+":"+earned+":"+tracked+":"+guard
              +":"+wantedTracking+":"+wantedAccumulator+":"+accept+"\\n";
            trace.update(state.getBytes("UTF-8")); scenarios++;
          }
          StringBuilder digest=new StringBuilder(); for(byte b:trace.digest())digest.append(String.format("%02x",b&255));
          System.out.println("complete:"+scenarios+":"+packets+":"+digest);
        }
      }`;
    const directory = path.join(temporary, variant), classes = path.join(directory, 'classes');
    fs.mkdirSync(classes, {recursive: true});
    const harnessFile = path.join(directory, 'AchievementBehavior.java');
    fs.writeFileSync(harnessFile, harness);
    const stub = path.join(root, 'funorb-stubs.jar');
    const cp = native ? nativeInput + path.delimiter + stub : stub;
    const sourceRoot = path.join(root, renamed ? 'geoblox/src' : '../games/geoblox');
    const sources = native ? [] : sourceInventory(sourceRoot).map(file => path.join(sourceRoot, file.path));
    const list = path.join(directory, 'sources.txt');
    fs.writeFileSync(list, [...sources, harnessFile].map(file => JSON.stringify(file)).join('\n') + '\n');
    captureProcess('javac', ['--release','8','-proc:none','-encoding','UTF-8','-classpath',cp,'-d',classes,'@'+list]);
    const output = captureProcess('java', ['-Djava.awt.headless=true','-cp',classes + path.delimiter + cp,
      'AchievementBehavior']).stdout;
    const sha256 = crypto.createHash('sha256').update(output).digest('hex');
    console.log(JSON.stringify({variant, sha256, completion: output.toString().trim()}));
    assert.equal(sha256, expectedNativeSha256, variant);
    if (expected === undefined) expected = output;
    else assert.equal(Buffer.compare(output, expected), 0, variant);
  }
} catch (error) {
  if (error.stderr) process.stderr.write(error.stderr);
  throw error;
} finally { fs.rmSync(temporary, {recursive: true, force: true}); }
