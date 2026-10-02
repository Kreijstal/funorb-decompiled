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
    const shutdownOutput = captureProcess('java', ['-Djava.awt.headless=true','-cp',classes + path.delimiter + cp,
      'ShutdownBehavior']).stdout;
    const shutdownSha256 = crypto.createHash('sha256').update(shutdownOutput).digest('hex');
    console.log(JSON.stringify({variant, shutdownSha256, completion: shutdownOutput.toString().trim().split('\n').at(-1)}));
    assert.equal(shutdownSha256, expectedShutdownSha256, variant);
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
