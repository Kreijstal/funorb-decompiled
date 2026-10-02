import fs from 'node:fs';
import os from 'node:os';
import path from 'node:path';
import crypto from 'node:crypto';
import assert from 'node:assert/strict';
import {fileURLToPath} from 'node:url';
import {sourceInventory} from '../tools/readable-java.mjs';
import {captureProcess} from '../tools/lib/capture-process.mjs';

const root = fileURLToPath(new URL('../', import.meta.url));
const nativeInput = process.argv[2] && path.resolve(process.argv[2]);
const aliases = new Map(JSON.parse(fs.readFileSync(path.join(root, 'geoblox-rules.json')))
  .renames.map(rule => [rule.symbol, rule.to]));
const expectedNativeSha256 = 'ec3c627a2eec22d24549607b97ae8c3b6d735e24217b26c61e8a5e510872ace6';
const temporary = fs.mkdtempSync(path.join(os.tmpdir(), 'geoblox-result-helpers-'));
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
      public class ResultHelperBehavior {
        static final Object unsafe; static final Method allocateInstance;
        static { try { Class<?> type = Class.forName("sun.misc.Unsafe");
          Field f = type.getDeclaredField("theUnsafe"); f.setAccessible(true); unsafe = f.get(null);
          allocateInstance = type.getMethod("allocateInstance",Class.class);
        } catch(Exception error) { throw new RuntimeException(error); } }
        static final Map<String,Field> fields = new HashMap<>();
        static Field field(String owner,String name) throws Exception {
          String key=owner+":"+name; Field f=fields.get(key);
          if(f==null) { f=Class.forName(owner).getDeclaredField(name); f.setAccessible(true);
            fields.put(key,f); } return f;
        }
        static Object get(String owner,String name,Object instance) throws Exception {
          return field(owner,name).get(instance);
        }
        static void set(String owner,String name,Object instance,Object value) throws Exception {
          field(owner,name).set(instance,value);
        }
        static Object allocate(String name) throws Exception {
          return allocateInstance.invoke(unsafe,Class.forName(name));
        }
        static Object construct(String name,Class<?>[] types,Object... args) throws Exception {
          Constructor<?> c=Class.forName(name).getDeclaredConstructor(types); c.setAccessible(true);
          return c.newInstance(args);
        }
        static Method method(String owner,String name,Class<?>... types) throws Exception {
          Method m=Class.forName(owner).getDeclaredMethod(name,types); m.setAccessible(true); return m;
        }
        static void check(boolean value,String label) { if(!value) throw new AssertionError(label); }
        public static void main(String[] args) throws Exception {
          int selectorCases=0, factoryCases=0, positionChecks=0, musicCases=0;
          Method add=method("${type('tf')}","${method('tf','a(ILhf;)V')}",int.class,Class.forName("${type('hf')}"));
          Method count=method("${type('tf')}","${method('tf','a(I)I')}",int.class);
          Method select=method("${type('i')}","${method('i','a(B)Lja;')}",byte.class);
          float[][] shapes={ {}, {320,240}, {Float.NaN,240}, {320+Float.MIN_VALUE,240},
            {321,240}, {323,244,317,236}, {321,240,340,240,330,240},
            {Float.NaN,240,320,241,Float.POSITIVE_INFINITY,240},
            {Float.POSITIVE_INFINITY,240,Float.NEGATIVE_INFINITY,240,340,240},
            {321,240,320,240,Float.NaN,240} };
          for(int shape=0;shape<shapes.length;shape++) for(int guard:new int[]{0,1,-1})
          for(byte methodGuard:new byte[]{-128,-127,0,127}) {
            Object queue=construct("${type('tf')}",new Class<?>[0]);
            ${set('a','field_d','Ltf;','null','queue')}
            ${set('Geoblox','field_C','I','null','guard')}
            Object mask=construct("${type('dm')}",new Class<?>[]{int.class,int.class},1,1);
            ${set('i','field_a','Ldm;','null','mask')}
            float[] coordinates=shapes[shape]; Object[] entities=new Object[coordinates.length/2];
            for(int i=0;i<entities.length;i++) {
              Object entity=allocate("${type('ja')}"); entities[i]=entity;
              ${set('ja','field_o','F','entity','coordinates[i*2]')}
              ${set('ja','field_v','F','entity','coordinates[i*2+1]')}
              add.invoke(queue,-35,entity);
            }
            int wanted=-1; float max=Float.MIN_VALUE;
            for(int i=entities.length-1;i>=0;i--) {
              float x=coordinates[i*2]-320, y=coordinates[i*2+1]-240;
              float distance=x*x+y*y;
              if(distance>max) { max=distance; wanted=i; }
              if(guard!=0) break;
            }
            Object selected=select.invoke(null,methodGuard); int actual=-1;
            for(int i=0;i<entities.length;i++) if(entities[i]==selected) actual=i;
            check(actual==wanted,"selector identity "+selectorCases);
            boolean maskCleared=${get('i','field_a','Ldm;')}==null;
            check(maskCleared==(methodGuard>=-127),"selector guard side effect");
            check((Integer)count.invoke(queue,100)==entities.length,"selector retains queue");
            for(int i=0;i<entities.length;i++) {
              check(Float.floatToRawIntBits((Float)${get('ja','field_o','F','entities[i]')})==
                Float.floatToRawIntBits(coordinates[i*2]),"selector retains x");
              check(Float.floatToRawIntBits((Float)${get('ja','field_v','F','entities[i]')})==
                Float.floatToRawIntBits(coordinates[i*2+1]),"selector retains y");
            }
            System.out.println("select:"+shape+":"+guard+":"+methodGuard+":"+actual+":"+maskCleared);
            selectorCases++;
          }
          ${set('Geoblox','field_C','I','null','0')}
          Class<?> sampleType=Class.forName("${type('gd')}");
          Method create=method("${type('kl')}","${method('kl','a(Lgd;II)Lkl;')}",sampleType,int.class,int.class);
          Method outside=method("${type('kl')}","${method('kl','l()Z')}");
          for(int rate:new int[]{0,8000,22050,48000,Integer.MAX_VALUE})
          for(int outputRate:new int[]{0,8000,22050,48000})
          for(int percent:new int[]{-100,0,50,100,200,Integer.MAX_VALUE})
          for(int volume:new int[]{0,45,96,-1,Integer.MIN_VALUE})
          for(int length:new int[]{-1,0,1,8}) for(boolean bounce:new boolean[]{false,true}) {
            byte[] samples=length<0?null:new byte[length];
            if(samples!=null) for(int i=0;i<samples.length;i++) samples[i]=(byte)(i*17-63);
            Object sample=construct("${type('gd')}",
              new Class<?>[]{int.class,byte[].class,int.class,int.class,boolean.class},
              rate,samples,0,Math.max(0,length),bounce);
            ${set('qk','field_j','I','null','outputRate')}
            String result;
            try {
              Object stream=create.invoke(null,sample,percent,volume);
              if(stream==null) { check(length<=0,"empty sample only"); result="null"; }
              else {
                check(length>0 && outputRate!=0,"nonempty sample and output frequency");
                int step=(Integer)${get('kl','field_p','I','stream')};
                int scaledVolume=(Integer)${get('kl','field_u','I','stream')};
                check(step==(int)((long)rate*256L*(long)percent/(long)(100*outputRate)),"PCM step");
                check(scaledVolume==(volume<<6),"PCM volume");
                check(${get('ia','field_g','Le;','stream')}==sample,"sample identity");
                check((Integer)${get('kl','field_q','I','stream')}==0,"loop start");
                check((Integer)${get('kl','field_m','I','stream')}==length,"loop end");
                check((Boolean)${get('kl','field_r','Z','stream')}==bounce,"ping-pong flag");
                int initial=(Integer)${get('kl','field_x','I','stream')}; check(initial==0,"initial position");
                StringBuilder positions=new StringBuilder();
                for(int position:new int[]{-1,0,255,(length<<8)-1,length<<8}) {
                  ${set('kl','field_x','I','stream','position')}
                  boolean value=(Boolean)outside.invoke(stream);
                  check(value==(position<0 || position>=(length<<8)),"position bounds");
                  check((Integer)${get('kl','field_x','I','stream')}==position,"query retains position");
                  positions.append(value?'1':'0'); positionChecks++;
                }
                result=step+":"+scaledVolume+":"+positions;
              }
            } catch(InvocationTargetException error) {
              check(length>0 && outputRate==0 && error.getCause() instanceof ArithmeticException,
                "only nonempty zero-output frequency divides by zero");
              result=error.getCause().getClass().getSimpleName();
            }
            check(${get('gd','field_k','[B','sample')}==samples,"sample bytes identity");
            if(samples!=null) for(int i=0;i<samples.length;i++) check(samples[i]==(byte)(i*17-63),"sample bytes");
            System.out.println("sample:"+rate+":"+outputRate+":"+percent+":"+volume+":"+length+":"+bounce+":"+result);
            factoryCases++;
          }
          try { create.invoke(null,null,100,96); throw new AssertionError("null sample must throw"); }
          catch(InvocationTargetException error) { check(error.getCause() instanceof NullPointerException,"null sample"); }
          factoryCases++;
          Method music=method("${type('ra')}","${method('ra','a(ILrf;)V')}",int.class,Class.forName("${type('rf')}"));
          for(int guard:new int[]{0,1}) for(int state=0;state<3;state++) {
            Object current=state==0?null:allocate("${type('rf')}"); Object requested=state==1?current:null;
            ${set('fe','field_e','Lrf;','null','current')}
            ${set('ra','field_d','I','null','77')}
            music.invoke(null,guard,requested);
            check(${get('fe','field_e','Lrf;')}==current,"music early-return track identity");
            check((Integer)${get('ra','field_d','I')}==77,"music early-return guard");
            System.out.println("music:"+guard+":"+state+":unchanged"); musicCases++;
          }
          check(selectorCases==120 && factoryCases==4801 && positionChecks==9000 && musicCases==6,"case counts");
          System.out.println("complete:"+selectorCases+":"+factoryCases+":"+positionChecks+":"+musicCases);
        }
      }`;
    const directory = path.join(temporary, variant), classes = path.join(directory, 'classes');
    fs.mkdirSync(classes, {recursive: true});
    const harnessFile = path.join(directory, 'ResultHelperBehavior.java');
    fs.writeFileSync(harnessFile, harness);
    const stub = path.join(root, 'funorb-stubs.jar');
    const cp = native ? nativeInput + path.delimiter + stub : stub;
    const sourceRoot = path.join(root, renamed ? 'geoblox/src' : '../games/geoblox');
    const sources = native ? [] : sourceInventory(sourceRoot).map(file => path.join(sourceRoot, file.path));
    const list = path.join(directory, 'sources.txt');
    fs.writeFileSync(list, [...sources, harnessFile].map(file => JSON.stringify(file)).join('\n') + '\n');
    captureProcess('javac', ['--release','8','-proc:none','-encoding','UTF-8','-classpath',cp,'-d',classes,'@'+list]);
    const output = captureProcess('java', ['-Djava.awt.headless=true','-cp',classes + path.delimiter + cp,
      'ResultHelperBehavior']).stdout;
    const sha256 = crypto.createHash('sha256').update(output).digest('hex');
    console.log(JSON.stringify({variant, sha256, completion: output.toString().trim().split('\n').at(-1)}));
    assert.equal(sha256, expectedNativeSha256, variant);
    if (expected === undefined) expected = output;
    else assert.equal(Buffer.compare(output, expected), 0, variant);
  }
} catch (error) {
  if (error.stderr) process.stderr.write(error.stderr);
  throw error;
} finally { fs.rmSync(temporary, {recursive: true, force: true}); }
