import fs from 'node:fs';
import os from 'node:os';
import path from 'node:path';
import crypto from 'node:crypto';
import assert from 'node:assert/strict';
import {fileURLToPath} from 'node:url';
import {sourceInventory} from '../tools/readable-java.mjs';
import {captureProcess} from '../tools/lib/capture-process.mjs';

const root = fileURLToPath(new URL('../', import.meta.url));
const nativeInput = process.argv[2] ? path.resolve(process.argv[2]) : null;
const rawInput = process.argv[3] ? path.resolve(process.argv[3]) : path.resolve(root,'../games/geoblox');
if(process.argv.length>4)throw new Error('Usage: test-geoblox-nine-slice.mjs [VERIFIED_CLASSES [RAW_SOURCE]]');
const aliases = new Map(JSON.parse(fs.readFileSync(path.join(root,'geoblox-rules.json'))).renames.map(r=>[r.symbol,r.to]));
const temporary=fs.mkdtempSync(path.join(os.tmpdir(),'geoblox-nine-slice-'));
const nativeOutputSha256='16c92de1c3230786836344a4848c7046488b9cfa4a48078ca34024fdcbdc7be9';
let expected=null;
try {
  if(nativeInput) {
    const files=[];
    const visit=directory=>{for(const e of fs.readdirSync(directory,{withFileTypes:true})) {
      const p=path.join(directory,e.name);if(e.isDirectory())visit(p);else if(e.name.endsWith('.class'))files.push(p);
    }};
    visit(nativeInput);const hash=crypto.createHash('sha256');
    for(const file of files.sort()) {
      const name=Buffer.from(path.relative(nativeInput,file).split(path.sep).join('/'));const bytes=fs.readFileSync(file);
      hash.update(name.length+':');hash.update(name);hash.update(bytes.length+':');hash.update(bytes);
    }
    const pin=JSON.parse(fs.readFileSync(path.join(root,'../decompilation/geoblox-provenance.json'))).verifiedTransformedClasses;
    assert.equal(files.length,pin.files);assert.equal(hash.digest('hex'),pin.sha256);
  }
  for(const variant of [...(nativeInput?['native']:[]),'original','renamed']) {
    const native=variant==='native',renamed=variant==='renamed';
    const name=(symbol,original)=>renamed?aliases.get(symbol)??original:original;
    const type=original=>name('C:'+original,original);
    const field=(owner,original,descriptor)=>native?original.replace(/^field_/,''):name(`F:${owner}.${original}:${descriptor}`,original);
    const harness=`import java.lang.reflect.*;import java.nio.*;import java.security.*;
    public class NineSliceBehavior {
      static Field field(String type,String name)throws Exception {Field f=Class.forName(type).getDeclaredField(name);f.setAccessible(true);return f;}
      static Object construct(String type)throws Exception {Constructor<?> c=Class.forName(type).getDeclaredConstructor();c.setAccessible(true);return c.newInstance();}
      static String pixels(Object sprite)throws Exception {
        int[] pixels=(int[])field("${type('dm')}","${field('dm','field_v','[I')}").get(sprite);
        ByteBuffer b=ByteBuffer.allocate(pixels.length*4);for(int p:pixels)b.putInt(p);
        byte[] hash=MessageDigest.getInstance("SHA-256").digest(b.array());StringBuilder s=new StringBuilder();
        for(byte value:hash)s.append(String.format("%02x",value&255));
        return field("${type('wh')}","${field('wh','field_s','I')}").getInt(sprite)+"x"+
          field("${type('wh')}","${field('wh','field_o','I')}").getInt(sprite)+":"+
          field("${type('wh')}","${field('wh','field_r','I')}").getInt(sprite)+"x"+
          field("${type('wh')}","${field('wh','field_m','I')}").getInt(sprite)+":"+s;
      }
      public static void main(String[]args)throws Exception {
        Method build=Class.forName("${type('n')}").getDeclaredMethod("${name('M:n.a(IIIIBIIII)[Ldm;','a')}",
          int.class,int.class,int.class,int.class,byte.class,int.class,int.class,int.class,int.class);build.setAccessible(true);
        Field guard=field("${type('Geoblox')}","${field('Geoblox','field_C','I')}");
        Field queue=field("${type('n')}","${field('n','field_l','Ltf;')}");
        Field resources=field("${type('n')}","${field('n','field_k','[Lvd;')}");
        int cases=0;
        for(int flag:new int[]{-1,0,1,42}) for(byte cleanup:new byte[]{0,1})
        for(int inset:new int[]{0,1,2}) for(int gap:new int[]{0,1,2})
        for(int border:new int[]{0,1,2}) for(int length:new int[]{0,1,3,4})
        for(int seed:new int[]{0,0x123456,0x80001234}) {
          guard.setInt(null,flag);Object marker=construct("${type('tf')}");queue.set(null,marker);
          Object array=Array.newInstance(resources.getType().getComponentType(),1);resources.set(null,array);
          StringBuilder result=new StringBuilder();
          try {Object[] sprites=(Object[])build.invoke(null,seed+3,inset,seed+2,length,cleanup,seed,seed+1,gap,border);
            if(sprites.length!=9)throw new AssertionError("sprite count");
            for(Object sprite:sprites)result.append(pixels(sprite)).append(';');
          }catch(InvocationTargetException error) {
            Throwable cause=error.getCause();result.append(cause.getClass().getName());
          }
          result.append(queue.get(null)==marker?"queue-kept":"queue-cleared");
          result.append(resources.get(null)==array?":resources-kept":":resources-cleared");
          System.out.println(result);cases++;
        }
        if(cases!=2592)throw new AssertionError(cases);
      }
    }`;
    const directory=path.join(temporary,variant),classes=path.join(directory,'classes');fs.mkdirSync(classes,{recursive:true});
    const harnessFile=path.join(directory,'NineSliceBehavior.java');fs.writeFileSync(harnessFile,harness);
    const stub=path.join(root,'funorb-stubs.jar');const cp=native?nativeInput+path.delimiter+stub:stub;
    const sourceRoot=renamed?path.join(root,'geoblox/src'):rawInput;
    const sources=native?[]:sourceInventory(sourceRoot).map(file=>path.join(sourceRoot,file.path));
    const list=path.join(directory,'sources.txt');fs.writeFileSync(list,[...sources,harnessFile].map(p=>JSON.stringify(p)).join('\n')+'\n');
    captureProcess('javac',['--release','8','-proc:none','-encoding','UTF-8','-classpath',cp,'-d',classes,'@'+list]);
    const output=captureProcess('java',['-Djava.awt.headless=true','-cp',classes+path.delimiter+cp,'NineSliceBehavior']).stdout;
    assert.equal(output.toString().trim().split('\n').length,2592);
    assert.equal(crypto.createHash('sha256').update(output).digest('hex'),nativeOutputSha256,variant+': matches recorded verified native bytecode output');
    if(expected===null)expected=output;else assert.deepEqual(output,expected,variant+': every sprite pixel and cleanup side effect must match');
    console.log(JSON.stringify({variant,cases:2592,sha256:crypto.createHash('sha256').update(output).digest('hex')}));
  }
}catch(error){if(error.stderr)process.stderr.write(error.stderr);throw error;}
finally{fs.rmSync(temporary,{recursive:true,force:true});}
