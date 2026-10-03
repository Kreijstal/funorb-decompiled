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
const expectedCacheWriteSha256 = 'e5d3ac6ab42a61da22e44337bc05b64e89e0360d4d51a94256fff69d3a37081d';
const expectedShutdownSha256 = '2fec6ee86681993c79d39ef1e57026f31fd9b0a87b7d7f94a5bddf5af83d6335';
const expectedSocketIoSha256 = 'ed8f7d5f5438f4fb39cb3bceca82a861d01f4e08502ca73ba7af8ca475b6292b';
const expectedDispatcherShutdownSha256 = '86554dba87ac6740912bf88fcd328c871758629250b6277e4223e4955bfcfb29';
const expectedInputSha256 = 'f8fe8768fbba9c94298f8e9a9193605681295cdd49d1eeba47929c208634844e';
const expectedArchiveSectorSha256 = '77dc4b47188f20793aaecb76f198e59850d0fc3d8af0ca07b2d0a111719a869b';
const expectedArchiveCompressionSha256 = '191d74dde65e8e0a6b5dc72a0193765baa165a94ab82ef5df15f10d86fd6f8fe';
const expectedBzip2BlockSha256 = 'f237b1b6fd8e69c006fa43ec005f742ae5909d107d0ba5ec4574f2c804ad3ba9';
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
  let expected, expectedArchiveSectorSha256Baseline, expectedArchiveCompressionBaseline, expectedBzip2BlockBaseline;
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
      }
      class CacheWriteBehavior extends ResultHelperBehavior {
        public static void main(String[] args) throws Exception {
          Method write=method("${type('ic')}","${method('ic','a(B)V')}",byte.class);
          java.nio.file.Path path=java.nio.file.Files.createTempFile("geoblox-cache-probe-",".bin");
          int cases=0;
          try {
            for(byte guard:new byte[]{65,0,-128,127})for(int mode=0;mode<7;mode++)
            for(int offset:new int[]{-1,0,8,40,Integer.MAX_VALUE-12}) {
              java.nio.file.Files.write(path,new byte[0]);
              Object file=construct("${type('pa')}",new Class<?>[]{java.io.File.class,String.class,long.class},
                path.toFile(),"rw",mode==6?12L:1024L);
              java.io.RandomAccessFile raw=(java.io.RandomAccessFile)${get('pa','field_d','Ljava/io/RandomAccessFile;','file')};
              try {
                byte[] before=new byte[mode==6?12:40]; Arrays.fill(before,(byte)99);raw.write(before);raw.seek(0L);
                Object cache=construct("${type('sk')}",new Class<?>[]{Class.forName("${type('pa')}"),int.class,int.class},
                  file,64,0);
                Object packet=mode==4||mode==5?null:allocate("${type('pk')}");
                byte[] payload=new byte[64];for(int index=0;index<payload.length;index++)payload[index]=(byte)(index*17-63);
                if(packet!=null) {
                  ${set('qc','field_f','I','packet','offset')}
                  ${set('qc','field_j','[B','packet','mode==3?null:payload')}
                }
                ${set('Geoblox','field_C','I','null','0')}
                ${set('af','field_b','Lsk;','null','mode==0||mode==5?null:cache')}
                ${set('eh','field_d','Lpk;','null','packet')}
                ${set('ic','field_a','Ljava/lang/String;','null','"guard-sentinel"')}
                if(mode==2)raw.close(); // keep the closed handle to exercise IOException
                String completion="ok";
                try { write.invoke(null,guard); }
                catch(InvocationTargetException error) {
                  check(packet==null && error.getCause() instanceof NullPointerException,"outside null packet failure");
                  completion=error.getCause().getClass().getName();
                }
                check(packet==null?!completion.equals("ok"):completion.equals("ok"),"completion kind");
                int after=packet==null?offset:(Integer)${get('qc','field_f','I','packet')};
                check(packet==null||after==offset+24,"offset advances after swallowed cache failure");
                check(guard==65?"guard-sentinel".equals(${get('ic','field_a','Ljava/lang/String;')}):
                  ${get('ic','field_a','Ljava/lang/String;')}==null,"guard side effect");
                byte[] expected=before.clone();
                if(mode==1 && offset>=0 && offset<=payload.length-24)System.arraycopy(payload,offset,expected,0,24);
                if(mode==6) {expected=Arrays.copyOf(expected,13);expected[12]=1;}
                byte[] actual=java.nio.file.Files.readAllBytes(path);
                check(Arrays.equals(actual,expected),"cache file bytes");
                for(int index=0;index<payload.length;index++)check(payload[index]==(byte)(index*17-63),"input bytes unchanged");
                System.out.println("cache:"+guard+":"+mode+":"+offset+":"+after+":"+completion+":"+Arrays.toString(actual));
                cases++;
              } finally {raw.close();}
            }
          } finally {java.nio.file.Files.deleteIfExists(path);}
          check(cases==140,"cache case count");System.out.println("cache-complete:"+cases);
        }
      }
      class ArchiveSectorBehavior extends ResultHelperBehavior {
        static final int archiveId=7;
        static void put(byte[] bytes,int offset,int value,int width) {
          for(int i=width-1;i>=0;i--) { bytes[offset+i]=(byte)value;value>>>=8; }
        }
        static byte[] payload(int length) {
          byte[] bytes=new byte[length];for(int i=0;i<length;i++)bytes[i]=(byte)(i*37+11);return bytes;
        }
        static String digest(byte[] bytes) throws Exception {
          byte[] hash=java.security.MessageDigest.getInstance("SHA-256").digest(bytes);
          StringBuilder result=new StringBuilder();for(byte b:hash)result.append(String.format("%02x",b&255));return result.toString();
        }
        static class Fixture implements AutoCloseable {
          final java.nio.file.Path directory,dataPath,indexPath;
          final Object cache,dataFile,indexFile;
          Fixture(byte[] data,byte[] index,int maximumLength) throws Exception {
            directory=java.nio.file.Files.createTempDirectory("geoblox-sectors-");
            dataPath=directory.resolve("data.bin");indexPath=directory.resolve("index.bin");
            java.nio.file.Files.write(dataPath,data);java.nio.file.Files.write(indexPath,index);
            dataFile=construct("${type('pa')}",new Class<?>[]{java.io.File.class,String.class,long.class},dataPath.toFile(),"rw",2097152L);
            indexFile=construct("${type('pa')}",new Class<?>[]{java.io.File.class,String.class,long.class},indexPath.toFile(),"rw",2097152L);
            Object dataBuffer=construct("${type('sk')}",new Class<?>[]{Class.forName("${type('pa')}"),int.class,int.class},dataFile,64,0);
            Object indexBuffer=construct("${type('sk')}",new Class<?>[]{Class.forName("${type('pa')}"),int.class,int.class},indexFile,64,0);
            cache=construct("${type('jh')}",new Class<?>[]{int.class,Class.forName("${type('sk')}"),Class.forName("${type('sk')}"),int.class},archiveId,dataBuffer,indexBuffer,maximumLength);
          }
          public void close() throws Exception {
            Method close=method("${type('pa')}","${method('pa','a(B)V')}",byte.class);
            try {close.invoke(dataFile,(byte)-5);} finally {
              try {close.invoke(indexFile,(byte)-5);} finally {
                java.nio.file.Files.deleteIfExists(dataPath);java.nio.file.Files.deleteIfExists(indexPath);java.nio.file.Files.deleteIfExists(directory);
              }
            }
          }
        }
        static void trace(String tag,int id,int length,boolean written,byte[] read,Fixture f) throws Exception {
          check(!Thread.holdsLock(${get('jh','field_d','Lsk;','f.cache')}),"archive data monitor released");
          System.out.println("sector:"+tag+":"+id+":"+length+":"+written+":"+(read==null?"null":digest(read))+":"+
            digest(java.nio.file.Files.readAllBytes(f.dataPath))+":"+digest(java.nio.file.Files.readAllBytes(f.indexPath)));
        }
        public static void main(String[] args) throws Exception {
          ${set('Geoblox','field_C','I','null','0')}
          Method write=method("${type('jh')}","${method('jh','a([BBII)Z')}",byte[].class,byte.class,int.class,int.class);
          Method read=method("${type('jh')}","${method('jh','a(IB)[B')}",int.class,byte.class);
          int cases=0;
          for(int id:new int[]{0,1,65535,65536,70000})for(int length:new int[]{0,1,509,510,511,512,513,1020,1021,1022,1024,1600})for(boolean reuse:new boolean[]{false,true}) {
            try(Fixture f=new Fixture(new byte[0],new byte[0],20000)) {
              if(reuse)check((Boolean)write.invoke(f.cache,payload(1600),(byte)-53,id,1600),"seed archive write");
              byte[] expected=payload(length);
              boolean written=(Boolean)write.invoke(f.cache,expected,(byte)-53,id,length);
              check(written,"archive write status");
              byte[] actual=(byte[])read.invoke(f.cache,id,(byte)-78);
              boolean losesChain=id>65535 && length>510 && (length%510==1 || length%510==2);
              boolean missingEmptyEntry=!reuse && length==0;
              if(losesChain||missingEmptyEntry)check(actual==null,"retained chain/empty behavior");
              else check(Arrays.equals(actual,expected),"archive payload roundtrip");
              trace(reuse?"reuse":"new",id,length,written,actual,f);cases++;
            }
          }
          for(int id:new int[]{1,65536})for(int mode=0;mode<8;mode++) {
            int header=id>65535?10:8;
            byte[] expected=payload(500),data=new byte[1040],index=new byte[id*6+6];
            put(index,id*6,500,3);put(index,id*6+3,mode==7?0:1,3);
            put(data,520,mode==1?id+1:id,id>65535?4:2);
            put(data,520+(id>65535?4:2),mode==2?1:0,2);
            put(data,520+(id>65535?6:4),mode==4?3:0,3);
            data[520+header-1]=(byte)(mode==3?archiveId+1:archiveId);
            System.arraycopy(expected,0,data,520+header,expected.length);
            if(mode==5)data=Arrays.copyOf(data,520+header+499);
            try(Fixture f=new Fixture(data,index,mode==6?100:20000)) {
              byte[] actual=(byte[])read.invoke(f.cache,id,(byte)-78);
              if(mode==0)check(Arrays.equals(actual,expected),"seed sector decode");
              else check(actual==null,"malformed sector rejected");
              trace("malformed"+mode,id,500,false,actual,f);cases++;
            }
          }
          for(int id:new int[]{1,65536}) {
            byte[] data=new byte[520],index=new byte[id*6+6];put(index,id*6,1,3);put(index,id*6+3,1,3);
            try(Fixture f=new Fixture(data,index,20000)) {
              boolean written=(Boolean)write.invoke(f.cache,payload(4),(byte)-53,id,4);
              check(written,"header EOF retains success exit");
              byte[] actual=(byte[])read.invoke(f.cache,id,(byte)-78);
              check(actual==null,"EOF chain remains unreadable");
              check(Arrays.equals(data,java.nio.file.Files.readAllBytes(f.dataPath)),"EOF exit writes no sector");
              put(index,id*6,4,3);check(Arrays.equals(index,java.nio.file.Files.readAllBytes(f.indexPath)),"index published before header EOF");
              trace("header-eof",id,4,written,actual,f);cases++;
            }
          }
          check(cases==138,"sector archive case count");System.out.println("archive-sector-complete:"+cases);
        }
      }
      class ArchiveCompressionBehavior extends ResultHelperBehavior {
        static byte[] packet(int type,byte[] payload,int packedLength,int outputLength) throws Exception {
          java.io.ByteArrayOutputStream bytes=new java.io.ByteArrayOutputStream();
          java.io.DataOutputStream out=new java.io.DataOutputStream(bytes);out.writeByte(type);out.writeInt(packedLength);
          if(type!=0)out.writeInt(outputLength);out.write(payload);return bytes.toByteArray();
        }
        static byte[] gzip(byte[] payload) throws Exception {
          java.io.ByteArrayOutputStream bytes=new java.io.ByteArrayOutputStream();
          try(java.util.zip.GZIPOutputStream gzip=new java.util.zip.GZIPOutputStream(bytes)){gzip.write(payload);}
          return bytes.toByteArray();
        }
        static String error(InvocationTargetException failure) throws Exception {
          Throwable cause=failure.getCause();check(cause.getClass()==Class.forName("${type('sa')}"),"compression contextual error");
          return "context:"+((Throwable)${get('sa','field_a','Ljava/lang/Throwable;','cause')}).getClass().getName();
        }
        public static void main(String[] args) throws Exception {
          ${set('Geoblox','field_C','I','null','0')}
          Object shared=construct("${type('fe')}",new Class<?>[0]);${set('sc','field_b','Lfe;','null','shared')}
          Method unpack=method("${type('v')}","${method('v','a([BI)[B')}",byte[].class,int.class);
          Method inflate=method("${type('fe')}","${method('fe','a(ILqc;[B)V')}",int.class,Class.forName("${type('qc')}"),byte[].class);
          int cases=0;
          for(int type:new int[]{0,2,99})for(int length:new int[]{0,1,16,513})for(int limit:new int[]{0,length,length==0?1:length-1}) {
            byte[] expected=ArchiveSectorBehavior.payload(length),packed=type==0?expected:gzip(expected);
            byte[] input=packet(type,packed,packed.length,length),before=input.clone();
            ${set('uj','field_b','I','null','limit')}
            boolean rejected=limit!=0&&(packed.length>limit||length>limit);byte[] actual=null;String status="ok";
            try{actual=(byte[])unpack.invoke(null,input,-1);}catch(InvocationTargetException failure){status=error(failure);}
            check(rejected?!status.equals("ok"):status.equals("ok")&&Arrays.equals(actual,expected),"container length limit/payload");
            check(Arrays.equals(before,input),"container input retained");
            System.out.println("compression:container:"+type+":"+length+":"+limit+":"+status+":"+(actual==null?"null":ArchiveSectorBehavior.digest(actual)));cases++;
          }
          ${set('uj','field_b','I','null','0')}
          for(int type:new int[]{2,99})for(int declared:new int[]{0,1}) {
            byte[] expected=ArchiveSectorBehavior.payload(16),input=packet(type,gzip(expected),declared,16);
            byte[] actual=(byte[])unpack.invoke(null,input,-1);check(Arrays.equals(actual,expected),"gzip uses full backing input");
            System.out.println("compression:declared:"+type+":"+declared+":"+ArchiveSectorBehavior.digest(actual));cases++;
          }
          for(int type:new int[]{2,99}) {
            byte[] compressed=gzip(ArchiveSectorBehavior.payload(16)),input=packet(type,compressed,compressed.length,16);
            byte[] actual=(byte[])unpack.invoke(null,input,~type);
            check(Arrays.equals(actual,Arrays.copyOfRange(input,5,5+compressed.length)),"complement selector raw-copy branch");
            System.out.println("compression:selector:"+type+":"+ArchiveSectorBehavior.digest(actual));cases++;
          }
          byte[] prefix="Archive block payload: ".getBytes(java.nio.charset.StandardCharsets.US_ASCII),expected=new byte[151];
          System.arraycopy(prefix,0,expected,0,prefix.length);for(int i=prefix.length;i<expected.length;i++)expected[i]=(byte)((i-prefix.length)%32);
          byte[] bzip=Base64.getDecoder().decode("MUFZJlNZNrnT2AAAQn2Af////8AAABAgAD5s0SAgAHIpAGhoAAyAAMNQKqoGgGgAGI9TENMgIQtXC6XiIvmAwmIxmQykZmM5oNJqNZsNpuN5wOJyJCUmOZ0IHXxXVshPKmvFoSwCgERYE/F3JFOFCQNrnT2A");
          byte[] decoded=(byte[])unpack.invoke(null,packet(1,bzip,bzip.length,expected.length),-1);
          check(Arrays.equals(decoded,expected),"fixed stripped Bzh1 block vector");
          Object state=${get('tb','field_a','Ljl;')};
          check(${get('jl','field_p','[B','state')}==null&&${get('jl','field_j','[B','state')}==null,"successful bzip releases input/output arrays");
          System.out.println("compression:bzip:"+ArchiveSectorBehavior.digest(decoded));cases++;
          decoded=(byte[])unpack.invoke(null,packet(1,new byte[]{23},0,4),-1);
          check(Arrays.equals(decoded,new byte[4]),"early bzip end ignores declared packed length/output completion");
          System.out.println("compression:bzip-end:"+ArchiveSectorBehavior.digest(decoded));cases++;
          Object reusable=construct("${type('fe')}",new Class<?>[0]);byte[] payload=ArchiveSectorBehavior.payload(16),compressed=gzip(payload);
          for(int position:new int[]{0,3})for(int outputLength:new int[]{0,1,16,20})for(int mode=0;mode<4;mode++) {
            if(outputLength==0&&mode==3)continue;
            byte[] input=new byte[position+compressed.length];System.arraycopy(compressed,0,input,position,compressed.length);
            if(mode==1)input[position]=0;if(mode==2)input[input.length-8]^=127;if(mode==3)input[position+10]=7;
            byte[] before=input.clone(),actual=new byte[outputLength];Arrays.fill(actual,(byte)85);
            Object buffer=construct("${type('qc')}",new Class<?>[]{byte[].class},input);${set('qc','field_f','I','buffer','position')}
            String status="ok";try{inflate.invoke(reusable,-1,buffer,actual);}catch(InvocationTargetException failure){status=error(failure);}
            boolean rejected=mode==1||mode==3;check(rejected?!status.equals("ok"):status.equals("ok"),"gzip completion kind");
            byte[] wanted=new byte[outputLength];Arrays.fill(wanted,(byte)85);if(!rejected)System.arraycopy(payload,0,wanted,0,Math.min(outputLength,payload.length));
            check(Arrays.equals(actual,wanted),"gzip partial output/tail retention");check(Arrays.equals(input,before),"gzip input unchanged");
            check((Integer)${get('qc','field_f','I','buffer')}==position,"gzip input cursor unchanged");
            java.util.zip.Inflater decoder=(java.util.zip.Inflater)${get('fe','field_i','Ljava/util/zip/Inflater;','reusable')};
            check(decoder.getBytesRead()==0&&decoder.getBytesWritten()==0,"gzip inflater reset/reused");
            System.out.println("compression:inflate:"+position+":"+outputLength+":"+mode+":"+status+":"+ArchiveSectorBehavior.digest(actual));cases++;
          }
          check(cases==74,"compression case count");System.out.println("archive-compression-complete:"+cases);
        }
      }
      class Bzip2BlockBehavior extends ResultHelperBehavior {
        static final String[] vectors={"F3JFOFCQAAAAAA==","MUFZJlNZ9qAUoQAAI3////////////////////////////////////////////+wANkEmAAmAAJgAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAkwAEwABMAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAADiNAEwAJowAAAJiYGjQAAAAAAAExMBNNMAATAAAAAAAAAAAEwAAABNMmAYCCBQYMODxAREhMUFfgLC4wMjQ2ODo8PkBD8SL5fMjJCUmJygpKissLS4vMDEyMzQ1Njc4OTr6HZ4e/U+P0BBQkMIhgfZFCBQAMEjAgoEMAAkdISUpLTE1OT1BRUlNUVVZXVFVWV1hZWltcXV5fYGFiY2RlZmdoaWprbG1ub3BxcnN0dXZ3eHl6e3x9fn+AgYKDhIWGh4iJiouMjY6PkJGSk5SVlpeYmZqbnJ2en6ChoqOkpaanqKmqq6ytrq+wsbKztLW2t7i5uru8vb6/wMHCw8TFxsfIycrLzM3Oz9DR0tPU1dbX2Nna29zd3t/g4eLj5OXm5+jp6uvs7e7v8PHy8/T19vf4+fr7/P0XckU4UJD2oBShA=","MUFZJlNZur7RmwAAA//////////////////////////////////////////////AArwAAAkwAEwABMAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAEmAAmAAJgAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAkwAEwABMAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAqqqAmAmAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAf0QEQIQMQQQUf8IMIOIQISIUIWIYP/ENEOEPEQERESETEUEVEWEXEYEZEaEbEcEdEeEfEgEhEiEjEkElEmEnEoEpEqErEsEtEuEvEwExEyEzE0E1E2E3E4E5E6E7E8E9E+E/FAFBFCFDFEFFFGFHFIFJFKFLFMFNFOFPFQFRFSFTFUFVFWFXFYFZFaFbFcFdFeFfFgFhFiFjFkFlFmFnFoFpFqFrFsFtFuFvFwFxFyFzF0F1F2F3F4F5F6F7F8F9F+F/GAGBGCGDGEGFGGGHGIGJGKGLGMGNGOGPGQGRGSGTGUGVGWGXGYGZGaGbGcGdGeGfGgGhGiGjGkGlGmGnGoGpGqGrGsGtGuGvGwGxGyGzG0G1G2G3G4G5G6G7G8G9G+G/HAHBHCHDHEHFHGHHHIHJHKHLHMHNHOHPHQHRHSHTHUHVHWHXHYHZHaHbHcHdHeHfHgHhHiHjHkHlHmHnHoHpHqHrHsHtHuHvHwHxHyHzH0H1H2H3H4H5H6H7H8H9H+F3JFOFCQur7Rmw==","MUFZJlNZFrlp7AADtf/////////////////////////////////////////////gClvvV3PPfZ963e97XvDrfdatue3b3e3a73n3dve+27fe+2++59ruSaBtGp6mEGjNRoaeppkNNkEekemiaaNNppNNMmmNRo2o9J5A1D1MjNBPRNqDTIY0jJtCHom0EyMnqGaQ09QyNpGANGmjBBoGRoaaIIU9qj9E2iMRPDU9U9GptTyaGnoTap5PVPCaPTVP1TahhNPJkam9FHplMngamp+ownqTwE9Keap7RN6ppPap5T9FPKekb0MU2mp6npPKHkpvTBGmmmhlTxo1NplPUeqfpTbVPRqP1RCD00aRtTEaaGah6npqbUbIjR6mhtI0yPU9TEyekDI9T1NBtTI0D0QehqHpNlPDU2oJhNinpNlPSabImnqaaaek02iPSbUBiep6QaepoYCaZMmmI0eokzRNMmE9TAmj0TQB6mmATJk8oyGTT1MTNT0GINNAj9Jk00aaj0JkxNNDE0yN6o0xqNME9RgCNDCZMmajTah6j0am0nqY1NMQ9TJmSY1BJppoYDU0yPU00GjZTJ6m1NgapsmjRNppPJo0j0mIGaNNR6hmSPERk0NHlDEbKaeo9QMaQMQbQTJpiaNDRoaaPU2gTNEeiaHo1HkgwmQhM1MAyE00eIZGpmpmgnqMmQ2po2phpHpMmammjJo0YmmZIzTRNMmJowjRk2po0wnqabQTR6BMnoajEaaZomj1NNMmJ6NR6TBpDMmhqZlNFDPTB1qSJ9ibSUF9VlGUs+bAmN7szLvdxkWEW5TR87ehDIeTApObEQJdjVC6YawdSlAx8xo0x63NGZYZG6giiaFHOpUoTNUArt5uecqm5auhT+mni167vYh5HVyJLR+QkZ80RGuqRI4K+NgaqOYpCcOiGKRM8wpZEZDCfN9axmzXwrwPsbIhWhhb5iglV5MKEvy2hBxTSHfggTIU2Qjx6xPnSbuktq/1Wxigyr+DcTEDOVUqr/58In2rSUt95W0WnZgQ/ctIpg8KrE0tQMXO8T33L5tK9R45x0y8bRT5KRpBJXaQXPHSuUjsyk0DnEzeeqlZaMXTWHiYqVyq/prnyTEHfqoNOvtCkEuWfHQRgI3PAPpy9lgvAN8R0YYcztTmxlyo6EjoUMDNeoCACgDllarklOEPOK30/dlj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"};
        static byte[] payload(int shape) {
          int[] lengths={0,272,2048,4096,1024,120064};byte[] result=new byte[lengths[shape]];
          if(shape==1){byte[] prefix="AAAAABBBCCDDDDDD".getBytes(java.nio.charset.StandardCharsets.US_ASCII);System.arraycopy(prefix,0,result,0,prefix.length);for(int i=prefix.length;i<result.length;i++)result[i]=(byte)(i-prefix.length);}
          if(shape==2||shape==5)for(int i=0;i<result.length;i++)result[i]=(byte)i;
          if(shape==3){int seed=0x12345678;for(int i=0;i<result.length;i++){seed=seed*1664525+1013904223;result[i]=(byte)(seed>>>24);}}
          if(shape==4)Arrays.fill(result,(byte)90);return result;
        }
        static byte[] input(int shape){return Base64.getDecoder().decode(vectors[shape]);}
        public static void main(String[] args) throws Exception {
          Method decode=method("${type('tb')}","${method('tb','a([BI[BII)I')}",byte[].class,int.class,byte[].class,int.class,int.class);
          int cases=0;Object state=${get('tb','field_a','Ljl;')};
          for(int shape=0;shape<vectors.length;shape++) {
            byte[] expected=payload(shape),compressed=input(shape),before=compressed.clone();
            SortedSet<Integer> capacities=new TreeSet<>(Arrays.asList(0,1,3,expected.length/2,expected.length,expected.length+5));
            for(int capacity:capacities) {
              byte[] destination=new byte[capacity];Arrays.fill(destination,(byte)85);
              int count=(Integer)decode.invoke(null,destination,capacity,compressed,-999,0);
              int wantedCount=Math.min(capacity,expected.length);byte[] wanted=new byte[capacity];Arrays.fill(wanted,(byte)85);
              System.arraycopy(expected,0,wanted,0,wantedCount);
              check(count==wantedCount&&Arrays.equals(destination,wanted),"bzip block/partial payload oracle");
              check(Arrays.equals(compressed,before),"bzip input untouched");
              check((Integer)${get('jl','field_C','I','state')}==count&&(Integer)${get('jl','field_A','I','state')}==capacity-count,"bzip output state");
              check(${get('jl','field_p','[B','state')}==null&&${get('jl','field_j','[B','state')}==null,"bzip success releases arrays");
              check(!Thread.holdsLock(state),"bzip state monitor released");
              System.out.println("bzip-block:"+shape+":"+capacity+":"+count+":"+ArchiveSectorBehavior.digest(destination));cases++;
            }
          }
          for(int mode=0;mode<3;mode++) {
            byte[] compressed=mode==0?new byte[0]:mode==1?input(1):null,destination=new byte[16];Arrays.fill(destination,(byte)85);
            String status="ok";try{decode.invoke(null,destination,16,compressed,0,mode==1?-1:0);}catch(InvocationTargetException failure){status=failure.getCause().getClass().getName();}
            check(status.equals(mode==2?"java.lang.NullPointerException":"java.lang.ArrayIndexOutOfBoundsException"),"bzip malformed input failure kind");
            byte[] wanted=new byte[16];Arrays.fill(wanted,(byte)85);check(Arrays.equals(destination,wanted),"bzip malformed input retains output");
            check(${get('jl','field_p','[B','state')}==compressed&&${get('jl','field_j','[B','state')}==destination,"bzip failure retains array aliases");
            check(!Thread.holdsLock(state),"bzip failed monitor released");
            System.out.println("bzip-failure:"+mode+":"+status+":"+ArchiveSectorBehavior.digest(destination));cases++;
            byte[] expected=payload(1),recovered=new byte[expected.length];
            int count=(Integer)decode.invoke(null,recovered,recovered.length,input(1),0,0);
            check(count==expected.length&&Arrays.equals(expected,recovered),"bzip recovery after failed input");
            check(${get('jl','field_p','[B','state')}==null&&${get('jl','field_j','[B','state')}==null,"bzip recovery clears aliases");
            System.out.println("bzip-recovery:"+mode+":"+count+":"+ArchiveSectorBehavior.digest(recovered));cases++;
          }
          check(cases==40,"bzip block case count");System.out.println("bzip-block-complete:"+cases);
        }
      }
      class ShutdownBehavior extends ResultHelperBehavior {
        public static void main(String[] args) throws Exception {
          Method close=method("${type('ba')}","${method('ba','b(I)V')}",int.class);
          Thread terminated=new Thread(()->{});terminated.start();terminated.join();int cases=0;
          for(int guard:new int[]{-124,-118,Integer.MIN_VALUE})for(int state=0;state<8;state++)
          for(boolean initialClosed:new boolean[]{false,true})for(boolean interrupted:new boolean[]{false,true}) {
            if(state==6 && !initialClosed && !interrupted || state==7 && (initialClosed || interrupted))continue;
            Object socket=allocate("${type('ba')}");Object task=state==0?null:allocate("${type('cb')}");
            java.util.concurrent.CountDownLatch ready=new java.util.concurrent.CountDownLatch(1);
            java.util.concurrent.CountDownLatch release=new java.util.concurrent.CountDownLatch(1);
            Thread worker=null,publisher=null;
            if(task!=null) {
              ${set('cb','field_a','I','task','state==1?2:state==7?0:1')}
              Object payload=state==2?terminated:state==3?new Thread(()->{}):state==4?null:"wrong-type";
              if(state==6) {
                worker=new Thread(()->{ready.countDown();try {release.await();}catch(InterruptedException ignored){}});
                worker.start();check(ready.await(3,java.util.concurrent.TimeUnit.SECONDS),"worker started");payload=worker;
              }
              ${set('cb','field_b','Ljava/lang/Object;','task','payload')}
            }
            ${set('ba','field_m','Lcb;','socket','task')}
            ${set('ba','field_f','Z','socket','initialClosed')}
            if(state==7) {
              publisher=new Thread(()->{try {synchronized(socket) {
                ready.countDown();while(!(Boolean)${get('ba','field_f','Z','socket')})socket.wait();
                ${set('cb','field_a','I','task','2')}
              }}catch(Exception failure){throw new AssertionError(failure);}});
              publisher.start();check(ready.await(3,java.util.concurrent.TimeUnit.SECONDS),"publisher waiting");
            }
            try {
              if(interrupted)Thread.currentThread().interrupt();String completion="ok";
              try {close.invoke(socket,guard);}catch(InvocationTargetException error) {
                check(!initialClosed && (state==4 && error.getCause() instanceof NullPointerException
                  || state==5 && error.getCause() instanceof ClassCastException),"unmatched join failure");
                completion=error.getCause().getClass().getName();
              }
              check(completion.equals("ok")== (initialClosed || state!=4 && state!=5),"completion kind");
              boolean closed=(Boolean)${get('ba','field_f','Z','socket')};check(closed,"closed flag");
              Object after=${get('ba','field_m','Lcb;','socket')};
              check(initialClosed || !completion.equals("ok")?after==task:after==null,"task release/failure retention");
              boolean afterInterrupt=Thread.currentThread().isInterrupted();
              check(afterInterrupt==(interrupted && (initialClosed || state!=6)),"interrupt consumption");
              check(!Thread.holdsLock(socket),"monitor released");
              System.out.println("shutdown:"+guard+":"+state+":"+initialClosed+":"+interrupted+":"+completion+
                ":"+closed+":"+(after==task)+":"+afterInterrupt);cases++;
            } finally {
              Thread.interrupted();release.countDown();
              if(worker!=null) {worker.join(3000L);check(!worker.isAlive(),"worker stopped");}
              if(publisher!=null) {publisher.join(3000L);check(!publisher.isAlive(),"publisher stopped");}
            }
          }
          check(cases==84,"shutdown case count");System.out.println("shutdown-complete:"+cases);
        }
      }
      class SocketIoBehavior extends ResultHelperBehavior {
        static class Input extends java.io.InputStream {
          byte[] bytes={11,22,33,44};int position,reads,closes,mode;boolean closeFailure;
          final java.io.IOException failure=new java.io.IOException("input");
          public int available(){return bytes.length-position;}
          public int read() throws java.io.IOException {reads++;if(mode==2)throw failure;
            return position==bytes.length?-1:bytes[position++]&255;}
          public int read(byte[] target,int offset,int length) throws java.io.IOException {
            reads++;if(mode==2)throw failure;if(mode==1)return 0;
            if(position==bytes.length)return -1;int count=Math.min(2,Math.min(length,bytes.length-position));
            System.arraycopy(bytes,position,target,offset,count);position+=count;return count;
          }
          public void close() throws java.io.IOException {closes++;if(closeFailure)throw failure;}
        }
        static class Output extends java.io.OutputStream {
          final java.io.ByteArrayOutputStream bytes=new java.io.ByteArrayOutputStream();int writes,flushes,closes,mode;
          public void write(int value){bytes.write(value);}
          public void write(byte[] source,int offset,int length) throws java.io.IOException {
            writes++;if(mode==1)throw new java.io.IOException("write");bytes.write(source,offset,length);
          }
          public void flush() throws java.io.IOException {flushes++;if(mode==2)throw new java.io.IOException("flush");}
          public void close(){closes++;}
        }
        static class Socket extends java.net.Socket {
          final Input input=new Input();final Output output=new Output();int timeout,closes;boolean noDelay;
          public void setSoTimeout(int value){timeout=value;}public void setTcpNoDelay(boolean value){noDelay=value;}
          public java.io.InputStream getInputStream(){return input;}public java.io.OutputStream getOutputStream(){return output;}
          public synchronized void close(){closes++;}
        }
        static Throwable call(Method method,Object receiver,Object... arguments) throws Exception {
          try{method.invoke(receiver,arguments);return null;}catch(InvocationTargetException error){return error.getCause();}
        }
        static Object holder(Socket fixture,int capacity,int start,boolean closed) throws Exception {
          Object socket=allocate("${type('ba')}");
          ${set('ba','field_j','Ljava/net/Socket;','socket','fixture')}
          ${set('ba','field_g','Ljava/io/InputStream;','socket','fixture.input')}
          ${set('ba','field_a','Ljava/io/OutputStream;','socket','fixture.output')}
          ${set('ba','field_b','I','socket','capacity')}
          ${set('ba','field_k','I','socket','start')}
          ${set('ba','field_e','I','socket','start')}
          ${set('ba','field_f','Z','socket','closed')}
          ${set('ba','field_m','Lcb;','socket',`allocate("${type('cb')}")`)}
          return socket;
        }
        public static void main(String[] args) throws Exception {
          int cases=0;Class<?> dispatcher=Class.forName("${type('d')}");
          for(int capacity:new int[]{5000,256}) {
            Socket fixture=new Socket();Object tasks=allocate("${type('d')}");
            Object socket=capacity==5000?construct("${type('ba')}",new Class<?>[]{java.net.Socket.class,dispatcher},fixture,tasks)
              :construct("${type('ba')}",new Class<?>[]{java.net.Socket.class,dispatcher,int.class},fixture,tasks,capacity);
            check(fixture.timeout==30000 && fixture.noDelay,"socket configuration");
            check(${get('ba','field_j','Ljava/net/Socket;','socket')}==fixture &&
              ${get('ba','field_g','Ljava/io/InputStream;','socket')}==fixture.input &&
              ${get('ba','field_a','Ljava/io/OutputStream;','socket')}==fixture.output &&
              ${get('ba','field_l','Ld;','socket')}==tasks,"constructor identities");
            check((Integer)${get('ba','field_b','I','socket')}==capacity &&
              !(Boolean)${get('ba','field_f','Z','socket')} && !(Boolean)${get('ba','field_i','Z','socket')} &&
              (Integer)${get('ba','field_k','I','socket')}==0 && (Integer)${get('ba','field_e','I','socket')}==0 &&
              ${get('ba','field_d','[B','socket')}==null && ${get('ba','field_m','Lcb;','socket')}==null,"constructor state");
            ${set('ba','field_f','Z','socket','true')}
            System.out.println("constructor:"+capacity+":"+fixture.timeout+":"+fixture.noDelay);cases++;
          }
          Method available=method("${type('ba')}","${method('ba','a(B)I')}",byte.class);
          Method readByte=method("${type('ba')}","${method('ba','c(I)I')}",int.class);
          Method readFully=method("${type('ba')}","${method('ba','a([BBII)V')}",byte[].class,byte.class,int.class,int.class);
          Method checkError=method("${type('ba')}","${method('ba','d(I)V')}",int.class);
          Method enqueue=method("${type('ba')}","${method('ba','a(III[B)V')}",int.class,int.class,int.class,byte[].class);
          Method run=method("${type('ba')}","run");
          for(boolean closed:new boolean[]{false,true})for(byte guard:new byte[]{-128,71,72,127}) {
            Socket fixture=new Socket();Object socket=holder(fixture,256,0,closed);String completion="ok";int count=-1;
            try{count=(Integer)available.invoke(socket,guard);}catch(InvocationTargetException error){
              check(!closed && guard<=71 && error.getCause() instanceof NullPointerException,"available failure");completion="null";}
            check(!completion.equals("ok") || count==(closed?0:4),"available count");
            check((${get('ba','field_g','Ljava/io/InputStream;','socket')}==null)==(guard<=71),"available guard effect");
            System.out.println("available:"+closed+":"+guard+":"+completion+":"+count);cases++;
          }
          for(boolean closed:new boolean[]{false,true})for(int guard:new int[]{-17422,0,Integer.MIN_VALUE}) {
            Socket fixture=new Socket();Object socket=holder(fixture,256,0,closed);int value=(Integer)readByte.invoke(socket,guard);
            check(value==(closed?0:guard==-17422?11:-104),"read byte result");
            check(fixture.input.position==(!closed && guard==-17422?1:0),"read byte consumption");
            System.out.println("byte:"+closed+":"+guard+":"+value+":"+fixture.input.position);cases++;
          }
          for(boolean closed:new boolean[]{false,true})for(byte guard:new byte[]{-97,0})
          for(int mode=0;mode<3;mode++)for(int length:new int[]{0,1,4,8}) {
            Socket fixture=new Socket();fixture.input.mode=mode;Object socket=holder(fixture,256,0,closed);
            byte[] target=new byte[10],expected=new byte[10];Arrays.fill(target,(byte)99);Arrays.fill(expected,(byte)99);
            boolean active=!closed && guard==-97 && length>0;int copied=active && mode==0?Math.min(length,4):0;
            System.arraycopy(fixture.input.bytes,0,expected,1,copied);Throwable error=call(readFully,socket,target,guard,1,length);
            boolean fails=active && (mode!=0 || length>4);check((error!=null)==fails,"readFully completion");
            if(fails)check(mode==2?error==fixture.input.failure:error instanceof java.io.EOFException,"readFully throwable");
            check(Arrays.equals(target,expected) && fixture.input.position==copied,"readFully partial bytes");
            System.out.println("readFully:"+closed+":"+guard+":"+mode+":"+length+":"+(error==null?"ok":error.getClass().getName())+
              ":"+Arrays.toString(target)+":"+fixture.input.reads);cases++;
          }
          for(boolean closed:new boolean[]{false,true})for(boolean pending:new boolean[]{false,true})
          for(int guard:new int[]{-128,-79,0}) {
            Socket fixture=new Socket();Object socket=holder(fixture,256,0,closed);
            ${set('ba','field_i','Z','socket','pending')}
            Throwable error=call(checkError,socket,guard);boolean fails=!closed && pending && guard<-79;
            check((error!=null)==fails && (!fails || error instanceof java.io.IOException),"pending error completion");
            boolean after=(Boolean)${get('ba','field_i','Z','socket')};check(after==(pending && !fails),"pending error consumption");
            System.out.println("pending:"+closed+":"+pending+":"+guard+":"+fails+":"+after);cases++;
          }
          for(int capacity:new int[]{256,512})for(int start:new int[]{0,capacity-2})
          for(int length:new int[]{0,1,5,capacity-101,capacity-100})for(boolean closed:new boolean[]{false,true})
          for(boolean pending:new boolean[]{false,true})for(int guard:new int[]{100,0}) {
            Socket fixture=new Socket();Object socket=holder(fixture,capacity,start,closed);
            Object task=${get('ba','field_m','Lcb;','socket')};byte[] source=new byte[length+2];
            for(int i=0;i<source.length;i++)source[i]=(byte)(i*17+3);
            ${set('ba','field_i','Z','socket','pending')}
            Throwable error=call(enqueue,socket,guard,1,length,source);
            boolean overflow=!closed && !pending && length==capacity-100;
            boolean fails=!closed && (pending || overflow);check((error!=null)==fails && (!fails || error instanceof java.io.IOException),"enqueue completion");
            byte[] buffer=(byte[])${get('ba','field_d','[B','socket')};int copied=closed || pending?0:length;
            check((buffer==null)==(closed || pending),"lazy buffer allocation");
            if(buffer!=null){byte[] expected=new byte[capacity];for(int i=0;i<copied;i++)expected[(start+i)%capacity]=source[i+1];
              check(Arrays.equals(buffer,expected),"ring bytes");}
            int write=(Integer)${get('ba','field_e','I','socket')};check(write==(start+copied)%capacity,"ring write position");
            check((Integer)${get('ba','field_k','I','socket')}==start && ${get('ba','field_m','Lcb;','socket')}==task,"ring read/task retention");
            boolean after=(Boolean)${get('ba','field_i','Z','socket')};check(after==(closed && pending),"enqueue consumes pending failure");
            check((${get('ba','field_a','Ljava/io/OutputStream;','socket')}==null)==(!closed && !pending && !overflow && guard!=100),"enqueue guard effect");
            check(!Thread.holdsLock(socket),"enqueue monitor released");
            System.out.println("enqueue:"+capacity+":"+start+":"+length+":"+closed+":"+pending+":"+guard+":"+fails+":"+write+":"+after);cases++;
          }
          for(int capacity:new int[]{256,512})for(int start:new int[]{0,capacity-2})for(int length:new int[]{0,1,5})
          for(int mode=0;mode<3;mode++)for(boolean closeFailure:new boolean[]{false,true}) {
            Socket fixture=new Socket();fixture.output.mode=mode;fixture.input.closeFailure=closeFailure;
            Object socket=holder(fixture,capacity,start,true);byte[] buffer=new byte[capacity],expected=new byte[length];
            for(int i=0;i<length;i++){expected[i]=(byte)(i*17+3);buffer[(start+i)%capacity]=expected[i];}
            ${set('ba','field_d','[B','socket','buffer')}
            ${set('ba','field_e','I','socket','(start+length)%capacity')}
            check(call(run,socket)==null,"writer completion");
            check(Arrays.equals(fixture.output.bytes.toByteArray(),mode==1?new byte[0]:expected),"writer bytes");
            int chunks=length==0?0:start+length>capacity?2:1;
            check(fixture.output.writes==chunks && fixture.output.flushes==(length==0?0:1),"writer split/flush");
            check((Integer)${get('ba','field_k','I','socket')}==(start+length)%capacity &&
              ${get('ba','field_d','[B','socket')}==null,"writer consumption/release");
            check((Boolean)${get('ba','field_i','Z','socket')}==(length>0 && mode!=0),"writer failure flag");
            check(fixture.input.closes==1 && fixture.output.closes==(closeFailure?0:1) && fixture.closes==(closeFailure?0:1),"close failure order");
            check(!Thread.holdsLock(socket),"writer monitor released");
            System.out.println("writer:"+capacity+":"+start+":"+length+":"+mode+":"+closeFailure+":"+
              Arrays.toString(fixture.output.bytes.toByteArray())+":"+fixture.output.writes+":"+fixture.output.flushes+":"+fixture.output.closes+":"+fixture.closes);cases++;
          }
          check(cases==308,"socket I/O case count");System.out.println("socket-io-complete:"+cases);
        }
      }
      class DispatcherShutdownBehavior extends ResultHelperBehavior {
        static final StringBuilder trace=new StringBuilder();
        static class RecordingFile extends java.io.RandomAccessFile {
          final String id;final boolean fails;boolean tracing=true;
          RecordingFile(java.io.File path,String id,boolean fails)throws java.io.IOException {super(path,"rw");this.id=id;this.fails=fails;}
          public void close()throws java.io.IOException {if(tracing)trace.append(id).append(',');super.close();if(fails&&tracing)throw new java.io.IOException(id);}
          void forceClose()throws java.io.IOException {tracing=false;super.close();}
        }
        static Object file(java.nio.file.Path directory,String id,boolean failure,java.util.List<Object> holders,
            java.util.List<RecordingFile> files)throws Exception {
          Object holder=allocate("${type('pa')}");RecordingFile file=new RecordingFile(directory.resolve(id).toFile(),id,failure);
          ${set('pa','field_d','Ljava/io/RandomAccessFile;','holder','file')}
          holders.add(holder);files.add(file);return holder;
        }
        public static void main(String[] args)throws Exception {
          Method shutdown=method("${type('d')}","${method('d','a(B)V')}",byte.class);int cases=0;
          for(int nullMask=0;nullMask<32;nullMask++)for(int failMask:new int[]{0,21,31}) {
            java.nio.file.Path directory=java.nio.file.Files.createTempDirectory("geoblox-dispatcher-close-");
            java.util.List<Object> holders=new ArrayList<>();java.util.List<RecordingFile> files=new ArrayList<>();
            try {
              Object dispatcher=allocate("${type('d')}");Object indices=java.lang.reflect.Array.newInstance(Class.forName("${type('pa')}"),5);
              ${set('d','field_i','Ljava/lang/Thread;','dispatcher','new Thread()')}
              ${set('d','field_j','Lpa;','dispatcher','file(directory,"data",false,holders,files)')}
              ${set('d','field_s','Lpa;','dispatcher','file(directory,"master",false,holders,files)')}
              String expected="data,master,";
              for(int index=0;index<5;index++)if((nullMask&(1<<index))==0) {
                java.lang.reflect.Array.set(indices,index,file(directory,"index"+index,(failMask&(1<<index))!=0,holders,files));
                expected+="index"+index+",";
              }
              ${set('d','field_r','[Lpa;','dispatcher','indices')}
              ${set('d','field_n','Lpa;','dispatcher','file(directory,"seed",false,holders,files)')}
              expected+="seed,";trace.setLength(0);shutdown.invoke(dispatcher,(byte)13);
              check(trace.toString().equals(expected),"cache shutdown order: "+trace+" != "+expected);
              for(int i=0;i<holders.size();i++)check((${get('pa','field_d','Ljava/io/RandomAccessFile;','holders.get(i)')}!=null)==files.get(i).fails,"close success/failure retention");
              check((Boolean)${get('d','field_c','Z','dispatcher')} && !Thread.holdsLock(dispatcher),"dispatcher flag/monitor");
              check(${get('d','field_d','Lcb;','dispatcher')}==null && ${get('d','field_g','Lcb;','dispatcher')}==null,"no shutdown task for valid guard");
              System.out.println("dispatcher-close:"+nullMask+":"+failMask+":"+trace);cases++;
            } finally {
              for(int i=0;i<holders.size();i++) {files.get(i).forceClose();${set('pa','field_d','Ljava/io/RandomAccessFile;','holders.get(i)','null')}}
              try(java.util.stream.Stream<java.nio.file.Path> children=java.nio.file.Files.list(directory)) {
                for(java.nio.file.Path child:(Iterable<java.nio.file.Path>)children::iterator)java.nio.file.Files.delete(child);
              }
              java.nio.file.Files.delete(directory);
            }
          }
          check(cases==96,"dispatcher shutdown case count");System.out.println("dispatcher-shutdown-complete:"+cases);
        }
      }
      class InputBehavior extends ResultHelperBehavior {
        static int cases;
        static void check(boolean value,String label) { ResultHelperBehavior.check(value,label); }
        static void resetKeyboard(Object listener,int read,int write,int end) throws Exception {
          ${set('Geoblox','field_C','I','null','0')}
          ${set('je','field_j','Lwl;','null','listener')}
          ${set('vd','field_n','I','null','read')}
          ${set('ba','field_c','I','null','write')}
          ${set('pc','field_p','I','null','end')}
          ${set('kj','field_O','[I','null','new int[128]')}
          ${set('ai','field_n','[C','null','new char[128]')}
          ${set('kj','field_o','[Z','null','new boolean[112]')}
          ${set('gf','field_c','[I','null','new int[128]')}
          ${set('gk','field_b','I','null','read')}
          ${set('ii','field_c','I','null','read')}
          ${set('nk','field_e','I','null','7')}
        }
        static void trace(String name,int... values) {
          StringBuilder out=new StringBuilder(name);for(int value:values)out.append(':').append(value);
          System.out.println(out);cases++;
        }
        public static void main(String[] args) throws Exception {
          Object keyboard=ResultHelperBehavior.allocate("${type('wl')}");
          java.awt.Canvas canvas=new java.awt.Canvas();
          int[] starts={0,1,63,126,127};
          for(int start:starts)for(int count:new int[]{0,1,2,64,127})for(int guard:new int[]{41,42,127}) {
            int end=(start+count)%128;resetKeyboard(keyboard,start,(end+1)%128,end);
            ${set('ki','field_d','I','null','-777')}${set('te','field_a','C','null',"(char)777")}
            int[] codes=(int[])${get('kj','field_O','[I')};char[] chars=(char[])${get('ai','field_n','[C')};
            for(int i=0;i<count;i++){int slot=(start+i)%128;codes[slot]=i%2==0?96:-1;chars[slot]=(char)(i%2==0?0:65+i);}
            int consumed=0;
            while(${type('hh')}.${method('hh','a(I)Z')}(guard)) {
              check(guard>41 && consumed<count,"poll boundary");
              check((Integer)${get('ki','field_d','I')}==codes[(start+consumed)%128],"poll code");
              check((Character)${get('te','field_a','C')}==chars[(start+consumed)%128],"poll character");consumed++;
            }
            check(consumed==(guard>41?count:0),"poll count");
            check((Integer)${get('vd','field_n','I')}==(start+consumed)%128,"poll cursor wrap");
            check((Integer)${get('ba','field_c','I')}==(end+1)%128 && (Integer)${get('pc','field_p','I')}==end,"poll frame fence");
            if(consumed==0)check((Integer)${get('ki','field_d','I')}==-777 && (Character)${get('te','field_a','C')}==777,"empty poll retains payload");
            check(!Thread.holdsLock(keyboard),"poll monitor released");trace("poll",start,count,guard,consumed);
          }
          int[][] changes={{},{0},{96,~96},{~0,111,~111,97},{1,2,~1,3,~2,~3}};
          for(int start:starts)for(int pattern=0;pattern<changes.length;pattern++)for(boolean reset:new boolean[]{false,true})for(boolean guard:new boolean[]{false,true}) {
            resetKeyboard(keyboard,start,17,11);boolean[] held=(boolean[])${get('kj','field_o','[Z')};
            Arrays.fill(held,true);boolean[] expected=held.clone();int[] queue=(int[])${get('gf','field_c','[I')};
            for(int i=0;i<changes[pattern].length;i++)queue[(start+i)%128]=changes[pattern][i];
            int write=reset?-1:(start+changes[pattern].length)%128;
            ${set('ii','field_c','I','null','write')}${set('re','field_f','Ljava/lang/String;','null','"retained"')}
            if(reset)Arrays.fill(expected,false);else for(int change:changes[pattern])expected[change<0?~change:change]=change>=0;
            ${type('re')}.${method('re','b(Z)V')}(guard);
            check(Arrays.equals(held,expected),"held key replay/reset");
            check((Integer)${get('gk','field_b','I')}==(reset?start:write) && (Integer)${get('ii','field_c','I')}==(reset?start:write),"held queue cursors");
            check((Integer)${get('vd','field_n','I')}==11 && (Integer)${get('pc','field_p','I')}==17,"new frame fence");
            check((Integer)${get('nk','field_e','I')}==8,"keyboard idle increment");
            check(guard?"retained".equals(${get('re','field_f','Ljava/lang/String;')}):${get('re','field_f','Ljava/lang/String;')}==null,"keyboard guard effect");
            check(!Thread.holdsLock(keyboard),"frame monitor released");trace("held",start,pattern,reset?1:0,guard?1:0,Arrays.hashCode(held));
          }
          int[] mapping={-1,0,96,225,85,10,111,82};
          for(int start:starts)for(int code=0;code<10;code++)for(int modifiers:new int[]{0,2,8})for(boolean full:new boolean[]{false,true})for(boolean stateFull:new boolean[]{false,true})for(boolean release:new boolean[]{false,true}) {
            int next=(start+1)%128;resetKeyboard(keyboard,full?next:(start+2)%128,start,0);
            ${set('gk','field_b','I','null','stateFull?next:start')}
            ${set('ii','field_c','I','null','start')}
            ${set('oe','field_P','[I','null','mapping.clone()')}
            java.awt.event.KeyEvent event=new java.awt.event.KeyEvent(canvas,release?java.awt.event.KeyEvent.KEY_RELEASED:java.awt.event.KeyEvent.KEY_PRESSED,0,modifiers,code,'x');
            java.awt.event.KeyListener listener=(java.awt.event.KeyListener)keyboard;
            if(release)listener.keyReleased(event);else listener.keyPressed(event);
            int translated=code<mapping.length?mapping[code]:-1;
            translated=release?(translated & ~128):((translated & 128)==0?translated:-1);
            boolean queued=translated>=0;
            int[] stateQueue=(int[])${get('gf','field_c','[I')};int[] eventQueue=(int[])${get('kj','field_O','[I')};
            check((Integer)${get('ii','field_c','I')}==(queued?(stateFull?-1:next):start),"listener state write/overflow");
            if(queued)check(stateQueue[start]==(release?~translated:translated),"listener state encoding");
            boolean eventAdded=queued&&!release&&!full;
            check((Integer)${get('ba','field_c','I')}==(eventAdded?next:start),"listener event fullness");
            if(eventAdded)check(eventQueue[start]==translated && ((char[])${get('ai','field_n','[C')})[start]==0,"press payload");
            check((Integer)${get('nk','field_e','I')}==0,"callback idle reset");
            check(event.isConsumed()==(release || (modifiers&10)!=0 || translated==85 || translated==10),"key consumption");
            trace("key",start,code,modifiers,full?1:0,stateFull?1:0,release?1:0,translated,eventAdded?1:0);
          }
          for(int start:starts)for(int character:new int[]{0,1,31,32,65,127,128,159,160,255,256,8364,8218,402,8230,352,338,8482,376,0xd800,65535})for(boolean active:new boolean[]{false,true})for(boolean full:new boolean[]{false,true}) {
            resetKeyboard(active?keyboard:null,full?(start+1)%128:(start+2)%128,start,0);
            java.awt.event.KeyEvent event=new java.awt.event.KeyEvent(canvas,java.awt.event.KeyEvent.KEY_TYPED,0,0,java.awt.event.KeyEvent.VK_UNDEFINED,'x');
            // Include sentinel payloads that the AWT constructor rejects.
            event.setKeyChar((char)character);
            ((java.awt.event.KeyListener)keyboard).keyTyped(event);
            boolean accepted=character>0&&character<128 || character>=160&&character<=255 || Arrays.binarySearch(new int[]{338,352,376,402,8218,8230,8364,8482},character)>=0;
            boolean added=active&&accepted&&!full;
            check((Integer)${get('ba','field_c','I')}==(added?(start+1)%128:start),"typed queue index");
            if(added)check(((int[])${get('kj','field_O','[I')})[start]==-1 && ((char[])${get('ai','field_n','[C')})[start]==character,"typed payload");
            check(event.isConsumed(),"typed event consumed");trace("typed",start,character,active?1:0,full?1:0,added?1:0);
          }
          for(int start:starts) {
            resetKeyboard(keyboard,start,start,0);((java.awt.event.FocusListener)keyboard).focusLost(new java.awt.event.FocusEvent(canvas,java.awt.event.FocusEvent.FOCUS_LOST));
            check((Integer)${get('ii','field_c','I')}==-1,"focus reset sentinel");trace("focus",start);
          }
          Object pointer=ResultHelperBehavior.allocate("${type('le')}");
          String[] operations={"mouseMoved","mouseDragged","mouseEntered","mouseExited","mousePressed","mouseReleased","mouseClicked","focusLost"};
          for(String operation:operations)for(int[] xy:new int[][]{{-1,-1},{0,0},{320,240},{639,479}})for(int button:new int[]{0,1,3})for(boolean active:new boolean[]{false,true})for(boolean popup:new boolean[]{false,true}) {
            ${set('pg','field_c','Lle;','null','active?pointer:null')}
            ${set('gh','field_P','I','null','13')}${set('lj','field_b','I','null','31')}${set('eg','field_h','I','null','29')}
            ${set('ah','field_e','I','null','37')}${set('hi','field_C','I','null','43')}${set('vd','field_a','I','null','2')}
            ${set('s','field_I','I','null','1')}${set('fc','field_f','Z','null','false')}
            if(operation.equals("focusLost"))((java.awt.event.FocusListener)pointer).focusLost(new java.awt.event.FocusEvent(canvas,java.awt.event.FocusEvent.FOCUS_LOST));
            else {
              java.awt.event.MouseEvent event=new java.awt.event.MouseEvent(canvas,java.awt.event.MouseEvent.MOUSE_PRESSED,0,0,xy[0],xy[1],1,popup,button);
              ResultHelperBehavior.method("${type('le')}",operation,java.awt.event.MouseEvent.class).invoke(pointer,event);
              boolean consumes=popup&&(operation.equals("mousePressed")||operation.equals("mouseReleased")||operation.equals("mouseClicked"));
              check(event.isConsumed()==consumes,"pointer popup consumption");
            }
            boolean motion=operation.equals("mouseMoved")||operation.equals("mouseDragged")||operation.equals("mouseEntered"),exit=operation.equals("mouseExited"),press=operation.equals("mousePressed"),release=operation.equals("mouseReleased"),focus=operation.equals("focusLost");
            int x=active&&motion?xy[0]:active&&exit?-1:31,y=active&&motion?xy[1]:active&&exit?-1:29;
            int pressX=active&&press?xy[0]:37,pressY=active&&press?xy[1]:43,pressButton=active&&press?(button==3?2:1):2;
            int held=active&&press?pressButton:active&&(release||focus)?0:1;
            boolean changed=active&&(motion||exit||press||release);
            check((Integer)${get('gh','field_P','I')}==(changed?0:13),"pointer idle state");
            ${set('pg','field_c','Lle;','null','pointer')}
            ${type('mc')}.${method('mc','a(B)V')}((byte)-128);
            check((Integer)${get('qa','field_a','I')}==x && (Integer)${get('ue','field_e','I')}==y,"pointer position snapshot");
            check((Integer)${get('mc','field_a','I')}==pressX && (Integer)${get('he','field_d','I')}==pressY,"press position snapshot");
            check((Integer)${get('bi','field_g','I')}==pressButton && (Integer)${get('gf','field_a','I')}==held,"button snapshots");
            check((Boolean)${get('wb','field_a','Z')}==changed && !(Boolean)${get('fc','field_f','Z')} && (Integer)${get('vd','field_a','I')}==0,"pending pointer state consumed");
            ${type('mc')}.${method('mc','a(B)V')}((byte)-128);
            check((Integer)${get('bi','field_g','I')}==0 && !(Boolean)${get('wb','field_a','Z')} && (Integer)${get('gf','field_a','I')}==held,"press consumed once; held retained");
            check(!Thread.holdsLock(pointer),"pointer monitor released");trace(operation,xy[0],xy[1],button,active?1:0,popup?1:0,x,y,pressX,pressY,pressButton,held,changed?1:0);
          }
          check(cases==2184,"input case count");System.out.println("input-complete:"+cases);
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
    const cacheOutput = captureProcess('java', ['-Djava.awt.headless=true','-cp',classes + path.delimiter + cp,
      'CacheWriteBehavior']).stdout;
    const cacheSha256 = crypto.createHash('sha256').update(cacheOutput).digest('hex');
    console.log(JSON.stringify({variant, cacheSha256, completion: cacheOutput.toString().trim().split('\n').at(-1)}));
    assert.equal(cacheSha256, expectedCacheWriteSha256, variant);
    const archiveOutput = captureProcess('java', ['-Djava.awt.headless=true','-cp',classes + path.delimiter + cp,
      'ArchiveSectorBehavior']).stdout;
    const archiveSectorSha256 = crypto.createHash('sha256').update(archiveOutput).digest('hex');
    console.log(JSON.stringify({variant, archiveSectorSha256, completion: archiveOutput.toString().trim().split('\n').at(-1)}));
    assert.equal(archiveSectorSha256, expectedArchiveSectorSha256, variant);
    if (variant === 'native') expectedArchiveSectorSha256Baseline = archiveOutput;
    if (nativeInput && variant !== 'native') {
      const actualLines = archiveOutput.toString().split('\n'), nativeLines = expectedArchiveSectorSha256Baseline.toString().split('\n');
      const mismatch = actualLines.findIndex((line, index) => line !== nativeLines[index]);
      assert.equal(mismatch, -1, `${variant}: ${nativeLines[mismatch]} versus ${actualLines[mismatch]}`);
    }
    const shutdownOutput = captureProcess('java', ['-Djava.awt.headless=true','-cp',classes + path.delimiter + cp,
      'ShutdownBehavior']).stdout;
    const shutdownSha256 = crypto.createHash('sha256').update(shutdownOutput).digest('hex');
    console.log(JSON.stringify({variant, shutdownSha256, completion: shutdownOutput.toString().trim().split('\n').at(-1)}));
    assert.equal(shutdownSha256, expectedShutdownSha256, variant);
    const compressionOutput = captureProcess('java', ['-Djava.awt.headless=true','-cp',classes + path.delimiter + cp,
      'ArchiveCompressionBehavior']).stdout;
    const archiveCompressionSha256 = crypto.createHash('sha256').update(compressionOutput).digest('hex');
    console.log(JSON.stringify({variant, archiveCompressionSha256, completion: compressionOutput.toString().trim().split('\n').at(-1)}));
    assert.equal(archiveCompressionSha256, expectedArchiveCompressionSha256, variant);
    if (variant === 'native') expectedArchiveCompressionBaseline = compressionOutput;
    if (nativeInput && variant !== 'native') assert.equal(Buffer.compare(compressionOutput, expectedArchiveCompressionBaseline), 0, variant);
    const bzipOutput = captureProcess('java', ['-Djava.awt.headless=true','-cp',classes + path.delimiter + cp,
      'Bzip2BlockBehavior']).stdout;
    const bzip2BlockSha256 = crypto.createHash('sha256').update(bzipOutput).digest('hex');
    console.log(JSON.stringify({variant, bzip2BlockSha256, completion: bzipOutput.toString().trim().split('\n').at(-1)}));
    assert.equal(bzip2BlockSha256, expectedBzip2BlockSha256, variant);
    if (variant === 'native') expectedBzip2BlockBaseline = bzipOutput;
    if (nativeInput && variant !== 'native') assert.equal(Buffer.compare(bzipOutput, expectedBzip2BlockBaseline), 0, variant);
    const socketIoOutput = captureProcess('java', ['-Djava.awt.headless=true','-cp',classes + path.delimiter + cp,
      'SocketIoBehavior']).stdout;
    const socketIoSha256 = crypto.createHash('sha256').update(socketIoOutput).digest('hex');
    console.log(JSON.stringify({variant, socketIoSha256, completion: socketIoOutput.toString().trim().split('\n').at(-1)}));
    assert.equal(socketIoSha256, expectedSocketIoSha256, variant);
    const dispatcherShutdownOutput = captureProcess('java', ['-Djava.awt.headless=true','-cp',classes + path.delimiter + cp,
      'DispatcherShutdownBehavior']).stdout;
    const dispatcherShutdownSha256 = crypto.createHash('sha256').update(dispatcherShutdownOutput).digest('hex');
    console.log(JSON.stringify({variant, dispatcherShutdownSha256, completion: dispatcherShutdownOutput.toString().trim().split('\n').at(-1)}));
    assert.equal(dispatcherShutdownSha256, expectedDispatcherShutdownSha256, variant);
    const inputOutput = captureProcess('java', ['-Djava.awt.headless=true','-cp',classes + path.delimiter + cp,
      'InputBehavior']).stdout;
    const inputSha256 = crypto.createHash('sha256').update(inputOutput).digest('hex');
    console.log(JSON.stringify({variant, inputSha256, completion: inputOutput.toString().trim().split('\n').at(-1)}));
    assert.equal(inputSha256, expectedInputSha256, variant);
  }
} catch (error) {
  if (error.stderr) process.stderr.write(error.stderr);
  throw error;
} finally { fs.rmSync(temporary, {recursive: true, force: true}); }
