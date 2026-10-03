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
const expectedNativeSha256 = '16c92de1c3230786836344a4848c7046488b9cfa4a48078ca34024fdcbdc7be9';
const expectedSpritePixelsSha256 = 'c986ff493508bf516e6bd33e187ee51ed478a012dfebf467a8b76e00f78a1f09';
const expectedSpriteTransformsSha256 = 'dd7445f0f6dc8c030467f58606545b95ee42afc9846ccaeebc79107f353583c1';
const expectedTriangleRasterSha256 = '3a708f0eb4343a68f9cd859b75cc6d42db0eda690188b95deb7619a998603760';
const expectedMeshLightingSha256 = '8606f3fa1d8808bbfd5e5bfafe3b67872487172f07455401ac290acf79f5fdc6';
const expectedFlatTriangleRasterSha256 = '60e7b9df0d8b178901617ebcd5a7b8da7745fdaf40f40beea681676733237ab7';
let expected=null, expectedSpritePixels=null, expectedSpriteTransforms=null, expectedTriangleRaster=null, expectedMeshLighting=null, expectedFlatTriangleRaster=null;
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
    const call=(owner,signature)=>type(owner)+'.'+name('M:'+owner+'.'+signature,signature.split('(')[0]);
    const spriteCall=(signature)=>name('M:dm.'+signature,signature.split('(')[0]);
    const indexedCall=(signature)=>name('M:na.'+signature,signature.split('(')[0]);
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
        if(args.length!=0){
          if(args[0].equals("flat-triangle"))FlatTriangleBehavior.main(args);
          else if(args[0].equals("mesh-lighting"))MeshLightingBehavior.main(args);
          else if(args[0].equals("triangle-raster"))TriangleRasterBehavior.main(args);
          else if(args[0].equals("sprite-transforms"))SpriteTransformBehavior.main(args);
          else SpritePixelBehavior.main(args);
          return;
        }
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
    }
    class FlatTriangleBehavior extends TriangleRasterBehavior {
      public static void main(String[] args)throws Exception {
        trace=MessageDigest.getInstance("SHA-256");cases=0;int spanCases=0,wrapperCases=0,directCases=0;
        f("${type('Geoblox')}","${field('Geoblox','field_C','I')}").setInt(null,0);
        for(int count:new int[]{-2,0,1,2,5,Integer.MIN_VALUE,Integer.MAX_VALUE})
        for(int start:new int[]{-1,0,3,6,Integer.MAX_VALUE})for(int color:new int[]{0,0x7f0000,0x007f7f,-1,0x12345678})
        for(int guard:new int[]{47,-67,0})for(int buffer=0;buffer<3;buffer++) {
          int[] pixels=buffer==0?background(8):buffer==1?null:background(2);
          int[] oracle=pixels==null?null:pixels.clone();int index=start,remaining=count;
          Throwable oracleError=null,error=null;
          try {while(--remaining>=0){oracle[index]=color+((oracle[index]>>1)&0x7f7f7f);index++;}
            int discarded=-30%((-2-guard)/40);
          }catch(RuntimeException caught){oracleError=caught;}
          try {${call('ib','a(I[IIII)V')}(guard,pixels,start,color,count);}
          catch(RuntimeException caught){error=caught;}
          if(!java.util.Arrays.equals(pixels,oracle)||!rootFailure(error).equals(rootFailure(oracleError)))throw new AssertionError("flat span oracle");
          record("flat-span:"+failure(error),pixels);spanCases++;
        }
        int[][] clips={{0,0,20,12},{3,2,17,9},{0,0,0,0},{2,1,8,5}};
        int[][] shapes={{2,1,12,4,6,9},{-4,-3,10,4,2,14},{1,2,12,2,4,9},{2,1,2,5,2,9},
          {2,4,6,4,9,4},{24,1,30,4,27,9},{-5,1,-3,4,-7,9},{0,-2,19,0,4,11}};
        int[][] permutations={{0,1,2},{0,2,1},{1,0,2},{1,2,0},{2,0,1},{2,1,0}};
        int[] colors={0,0x7f0000,0x007f7f,0x7f7f7f};
        for(int[] clip:clips)for(int[] shape:shapes)for(int[] permutation:permutations)
        for(int color:colors)for(int flag:new int[]{-1,0,1})for(int guard:new int[]{-122,-102}) {
          int[] pixels=background(240);viewport(pixels,clip);
          f("${type('Geoblox')}","${field('Geoblox','field_C','I')}").setInt(null,flag);
          int a=permutation[0],b=permutation[1],c=permutation[2];Throwable error=null;
          try {${call('gi','a(IIIIIIII)V')}(shape[c*2],guard,shape[c*2+1],shape[a*2+1],shape[a*2],shape[b*2],shape[b*2+1],color);}
          catch(RuntimeException caught){error=caught;}
          record("flat-wrapper:"+failure(error),pixels);wrapperCases++;
        }
        int[][] sortedShapes={{2,1,12,4,6,9},{-4,-3,4,2,16,14},{1,2,12,2,4,9},
          {2,1,6,9,12,9},{2,4,6,4,12,4},{24,1,30,4,27,9}};
        for(int[] clip:clips)for(int[] shape:sortedShapes)for(int color:colors)
        for(int flag:new int[]{-1,0,1})for(int guard:new int[]{110,74,-110})for(int buffer=0;buffer<3;buffer++) {
          viewport(background(240),clip);
          int[] pixels=buffer==0?background(240):buffer==1?null:background(2);Throwable error=null;
          f("${type('Geoblox')}","${field('Geoblox','field_C','I')}").setInt(null,flag);
          try {${call('sd','a(IIII[IIIII)V')}(shape[2],shape[0],color,guard,pixels,shape[5],shape[4],shape[3],shape[1]);}
          catch(RuntimeException caught){error=caught;}
          record("flat-direct:"+failure(error),pixels);directCases++;
        }
        if(spanCases!=1575||wrapperCases!=4608||directCases!=2592||cases!=8775)throw new AssertionError("flat case inventory");
        StringBuilder sha=new StringBuilder();for(byte value:trace.digest())sha.append(String.format("%02x",value&255));
        System.out.println("flat-triangle:"+cases+":"+spanCases+":"+wrapperCases+":"+directCases+":"+sha);
      }
    }
    class MeshLightingBehavior extends TriangleRasterBehavior {
      static String meshState(${type('nf')} mesh)throws Exception {
        return java.util.Arrays.toString(mesh.${field('nf','field_O','[S')})+":"
          +java.util.Arrays.toString(mesh.${field('nf','field_q','[S')})+":"
          +java.util.Arrays.toString(mesh.${field('nf','field_K','[S')})+":"
          +f("${type('nf')}","${field('nf','field_D','Z')}").getBoolean(mesh)+":"
          +mesh.${field('nf','field_Q','I')}+":"+mesh.${field('nf','field_I','I')}+":"
          +mesh.${field('nf','field_s','I')}+":"+mesh.${field('nf','field_H','I')}+":"
          +mesh.${field('nf','field_F','I')}+":"+mesh.${field('nf','field_N','I')}+":"
          +(mesh.${field('nf','field_g','[S')}==null);
      }
      public static void main(String[] args)throws Exception {
        trace=MessageDigest.getInstance("SHA-256");cases=0;int drawCases=0,transformCases=0;
        int[][] shapes={{2,1,12,4,6,9},{-4,-3,4,2,16,14},{2,4,2,4,2,4}};
        int[][] directions={{256,0,0,128,128,0},{0,0,256,0,0,256},{-128,128,-128,128,0,-128},
          {Integer.MIN_VALUE,0,0,Integer.MAX_VALUE,0,0}};
        for(int[] shape:shapes)for(int normalMode=0;normalMode<4;normalMode++)for(int materialMode=0;materialMode<4;materialMode++)
        for(int priorityMode=0;priorityMode<3;priorityMode++)for(int[] direction:directions)
        for(int guard:new int[]{6562,0})for(int flag:new int[]{-1,0,1})for(int fault=0;fault<3;fault++) {
          int[] pixels=background(240);viewport(pixels,new int[]{0,0,20,12});
          f("${type('Geoblox')}","${field('Geoblox','field_C','I')}").setInt(null,flag);
          ${type('nf')} mesh=new ${type('nf')}();mesh.${field('nf','field_m','S')}=3;
          mesh.${field('nf','field_r','[S')}=new short[]{0,0,0};mesh.${field('nf','field_B','[S')}=new short[]{1,2,1};
          mesh.${field('nf','field_c','[S')}=new short[]{2,1,2};
          mesh.${field('nf','field_P','[S')}=new short[]{0,0,0};
          mesh.${field('nf','field_u','[S')}=new short[]{0,1,1};mesh.${field('nf','field_e','[S')}=new short[]{0,2,2};
          if(normalMode==0){mesh.${field('nf','field_u','[S')}=new short[]{0,0,0};mesh.${field('nf','field_e','[S')}=new short[]{0,0,0};}
          if(normalMode==2)mesh.${field('nf','field_u','[S')}[1]=9;
          if(normalMode==3)mesh.${field('nf','field_P','[S')}[2]=-1;
          mesh.${field('nf','field_n','[B')}=priorityMode==0?null:new byte[]{2,0,1};mesh.${field('nf','field_v','B')}=(byte)(priorityMode==2?3:1);
          mesh.${field('nf','field_G','[S')}=materialMode==0?null:materialMode==1?new short[]{-1,0,1}
            :materialMode==2?new short[]{99,0,1}:new short[]{-2,0,1};
          ${type('fd')} first=new ${type('fd')}(),second=new ${type('fd')}();
          first.${field('fd','field_a','I')}=0xff1203;second.${field('fd','field_a','I')}=0x01ee80;
          ${type('l')}.${field('l','field_i','[Lfd;')}=materialMode==0?null:new ${type('fd')}[]{first,second};
          ${type('ok')}.${field('ok','field_h','[I')}=fault==2?null:new int[]{256,0,-256};
          ${type('oa')}.${field('oa','field_f','[I')}=new int[]{0,256,0};${type('gi')}.${field('gi','field_b','[I')}=new int[]{0,0,256};
          ${type('sh')}.${field('sh','field_x','[I')}=new int[]{shape[0],shape[2],shape[4]};
          ${type('dj')}.${field('dj','field_N','[I')}=new int[]{shape[1],shape[3],shape[5]};
          ${type('jf')}.${field('jf','field_b','[I')}=new int[260];
          for(int i=0;i<256;i++)${type('jf')}.${field('jf','field_b','[I')}[i]=(int)(255.0*Math.pow((float)i/256.0f,15.0));
          for(int i=256;i<260;i++)${type('jf')}.${field('jf','field_b','[I')}[i]=255;
          ${type('ch')}.${field('ch','field_b','I')}=3;${type('ch')}.${field('ch','field_d','[I')}=new int[]{1,1,1,0};
          ${type('pj')}.${field('pj','field_i','[I')}=new int[64];java.util.Arrays.fill(${type('pj')}.${field('pj','field_i','[I')},-99);
          ${type('pj')}.${field('pj','field_i','[I')}[0]=0;${type('pj')}.${field('pj','field_i','[I')}[16]=1;${type('pj')}.${field('pj','field_i','[I')}[32]=2;
          ${type('uh')}.${field('uh','field_x','[I')}=new int[128];${type('uh')}.${field('uh','field_x','[I')}[1]=1;${type('uh')}.${field('uh','field_x','[I')}[2]=2;
          Throwable error=null;
          try {${call('hi','a(IIIIILnf;II)V')}(direction[5],direction[2],direction[3],guard,direction[0],fault==1?null:mesh,direction[4],direction[1]);}
          catch(RuntimeException caught){error=caught;}
          record("mesh:"+failure(error)+":"+java.util.Arrays.toString(${type('pj')}.${field('pj','field_i','[I')})
            +":"+java.util.Arrays.toString(${type('uh')}.${field('uh','field_x','[I')}),pixels);drawCases++;
        }
        f("${type('Geoblox')}","${field('Geoblox','field_C','I')}").setInt(null,0);
        for(int operation=0;operation<3;operation++)for(int seed=0;seed<4;seed++)for(boolean cached:new boolean[]{false,true})
        for(int fault=0;fault<4;fault++)for(int variant=0;variant<(operation==0?3:2);variant++) {
          ${type('nf')} mesh=new ${type('nf')}();mesh.${field('nf','field_o','S')}=3;
          mesh.${field('nf','field_O','[S')}=new short[]{(short)(seed*17001),-32768,32767};
          mesh.${field('nf','field_q','[S')}=new short[]{-7,(short)(seed*-11111),9};
          mesh.${field('nf','field_K','[S')}=new short[]{300,-2,(short)(seed*22223)};
          if(fault==1)mesh.${field('nf','field_O','[S')}=null;
          if(fault==2)mesh.${field('nf','field_q','[S')}=new short[]{8};
          if(fault==3)mesh.${field('nf','field_K','[S')}=null;
          mesh.${field('nf','field_g','[S')}=new short[]{123};
          mesh.${field('nf','field_Q','I')}=91;mesh.${field('nf','field_I','I')}=92;
          mesh.${field('nf','field_s','I')}=93;mesh.${field('nf','field_H','I')}=94;
          mesh.${field('nf','field_F','I')}=95;mesh.${field('nf','field_N','I')}=96;
          f("${type('nf')}","${field('nf','field_D','Z')}").setBoolean(mesh,cached);
          Throwable error=null;
          try {
            if(operation==0)mesh.${name('M:nf.a(IIBII)V','a')}(seed*-9123,new int[]{0,-3,7}[variant],(byte)100,seed*1234567,seed+3);
            else if(operation==1)mesh.${name('M:nf.a(IIII)V','a')}(seed*-40000,seed*70000,variant==0?-9121:0,seed*90001);
            else mesh.${name('M:nf.a(B)V','a')}((byte)(variant==0?-99:0));
          }catch(RuntimeException caught){error=caught;}
          record("transform:"+operation+":"+failure(error)+":"+meshState(mesh),null);transformCases++;
        }
        if(drawCases!=10368||transformCases!=224||cases!=10592)throw new AssertionError("mesh case inventory");
        StringBuilder sha=new StringBuilder();for(byte value:trace.digest())sha.append(String.format("%02x",value&255));
        System.out.println("mesh-lighting:"+cases+":"+drawCases+":"+transformCases+":"+sha);
      }
    }
    class TriangleRasterBehavior {
      static MessageDigest trace;
      static int cases,spanCases,viewportCases,triangleCases;
      static Field f(String owner,String name)throws Exception {Field f=Class.forName(owner).getDeclaredField(name);f.setAccessible(true);return f;}
      static int[] background(int size){int[] p=new int[size];for(int i=0;i<size;i++)p[i]=i*0x123457+0x87654321;return p;}
      static String failure(Throwable error)throws Exception {
        if(error==null)return "ok";
        if(error instanceof ${type('sa')})return f("${type('sa')}","${field('sa','field_a','Ljava/lang/Throwable;')}").get(error).getClass().getName()
          +":"+f("${type('sa')}","${field('sa','field_d','Ljava/lang/String;')}").get(error);
        return error.getClass().getName();
      }
      static String rootFailure(Throwable error)throws Exception {
        if(error==null)return "ok";
        if(error instanceof ${type('sa')})error=(Throwable)f("${type('sa')}","${field('sa','field_a','Ljava/lang/Throwable;')}").get(error);
        return error.getClass().getName();
      }
      static void record(String label,int[] pixels)throws Exception {
        trace.update((label+":"+java.util.Arrays.toString(pixels)+"\\n").getBytes("UTF-8"));cases++;
      }
      static void viewport(int[] pixels,int[] clip)throws Exception {
        ${call('vb','a([III)V')}(pixels,20,12);
        ${call('vb','e(IIII)V')}(clip[0],clip[1],clip[2],clip[3]);
        ${call('mh','b()V')}();
        int width=clip[2]-clip[0],height=clip[3]-clip[1];
        if(f("${type('mh')}","${field('mh','field_c','I')}").getInt(null)!=width
            ||f("${type('mh')}","${field('mh','field_h','I')}").getInt(null)!=height
            ||f("${type('mh')}","${field('mh','field_d','I')}").getInt(null)!=width/2
            ||f("${type('mh')}","${field('mh','field_i','I')}").getInt(null)!=height/2)throw new AssertionError("viewport size/center");
        int[] rows=(int[])f("${type('mh')}","${field('mh','field_b','[I')}").get(null);
        for(int y=0;y<height;y++)if(rows[y]!=(clip[1]+y)*20+clip[0])throw new AssertionError("viewport row offset");
      }
      public static void main(String[] args)throws Exception {
        trace=MessageDigest.getInstance("SHA-256");
        f("${type('Geoblox')}","${field('Geoblox','field_C','I')}").setInt(null,0);
        int[] sine=(int[])f("${type('mh')}","${field('mh','field_f','[I')}").get(null);
        int[] cosine=(int[])f("${type('mh')}","${field('mh','field_g','[I')}").get(null);
        int[] inverse15=(int[])f("${type('mh')}","${field('mh','field_e','[I')}").get(null);
        int[] inverse16=(int[])f("${type('mh')}","${field('mh','field_a','[I')}").get(null);
        for(int i=0;i<2048;i++) {
          if(sine[i]!=(int)(65536.0*Math.sin(i*0.0030679615))||cosine[i]!=(int)(65536.0*Math.cos(i*0.0030679615))
              ||inverse16[i]!=(i==0?0:65536/i)||i<512&&inverse15[i]!=(i==0?0:32768/i))throw new AssertionError("triangle lookup tables");
        }
        record("sine-q16",sine);record("cosine-q16",cosine);record("inverse-q15",inverse15);record("inverse-q16",inverse16);
        int[][] colors={{0,0,0},{128<<16,64<<16,255<<16},{-1,Integer.MAX_VALUE,Integer.MIN_VALUE},
          {0xff01fe,0x8001ff,0x0100ff},{0x12345678,0x76543210,-0x2345678}};
        int[][] steps={{0,0,0},{65536,-32768,16384},{Integer.MIN_VALUE,Integer.MAX_VALUE,-1}};
        for(int count:new int[]{-2,0,1,2,5})for(int start:new int[]{-1,0,3,6})for(int[] color:colors)
        for(int[] step:steps)for(int guard:new int[]{33423689,0})for(int buffer=0;buffer<3;buffer++) {
          int[] actual=buffer==0?background(8):buffer==1?null:background(2);
          int[] expected=actual==null?null:actual.clone();
          int red=color[0],green=color[1],blue=color[2],index=start,remaining=count,expectedGuard=91;
          Throwable oracleError=null,actualError=null;
          try {
            while(--remaining>=0){int previous=(expected[index]>>1)&0x7f7f7f;
              expected[index]=((red&33423360)>>1)+((green&33423689)>>9)+((blue>>17)&255)+previous;
              index++;red+=step[0];green+=step[1];blue+=step[2];}
            if(guard!=33423689)expectedGuard=-7;
          }catch(RuntimeException error){oracleError=error;}
          f("${type('jf')}","${field('jf','field_c','I')}").setInt(null,91);
          try {${call('jf','a(IIIIIIIII[I)V')}(start,step[0],guard,color[0],step[2],color[1],step[1],count,color[2],actual);}
          catch(RuntimeException error){actualError=error;}
          if(!java.util.Arrays.equals(actual,expected)||!rootFailure(actualError).equals(rootFailure(oracleError))
              ||f("${type('jf')}","${field('jf','field_c','I')}").getInt(null)!=expectedGuard)throw new AssertionError("span oracle");
          record("span:"+failure(actualError)+":"+expectedGuard,actual);spanCases++;
        }
        int[][] clips={{0,0,20,12},{3,2,17,9},{0,0,0,0},{2,1,8,5}};
        int[][] shapes={{2,1,12,4,6,9},{-4,-3,10,4,2,14},{1,2,12,2,4,9},{2,1,2,5,2,9},
          {2,4,6,4,9,4},{24,1,30,4,27,9},{-5,1,-3,4,-7,9},{0,-2,19,0,4,11}};
        int[][] permutations={{0,1,2},{0,2,1},{1,0,2},{1,2,0},{2,0,1},{2,1,0}};
        int[][] vertexColors={{0xff0000,0x00ff00,0x0000ff},{0,0,0},{0xffffff,0x123456,0xabcdef}};
        for(int[] clip:clips) {
          int[] probe=background(240);viewport(probe,clip);record("viewport:"+java.util.Arrays.toString(clip),probe);viewportCases++;
          for(int[] shape:shapes)for(int[] permutation:permutations)for(int[] rgb:vertexColors)
          for(int flag:new int[]{-1,0,1})for(int guard:new int[]{-2,-1}) {
            int a=permutation[0],b=permutation[1],c=permutation[2];
            int[] target=background(240);viewport(target,clip);
            f("${type('Geoblox')}","${field('Geoblox','field_C','I')}").setInt(null,flag);
            Throwable error=null;
            try {${call('nb','a(IIIIIIIIIIIIIIII)V')}(rgb[b]&255,(rgb[b]>>8)&255,rgb[c]>>16,(rgb[c]>>8)&255,
              shape[a*2+1],rgb[a]&255,rgb[b]>>16,shape[b*2+1],shape[c*2],rgb[c]&255,guard,
              rgb[a]>>16,(rgb[a]>>8)&255,shape[a*2],shape[b*2],shape[c*2+1]);}
            catch(RuntimeException caught){error=caught;}
            if(guard!=-2&&!java.util.Arrays.equals(target,background(240)))throw new AssertionError("triangle guard");
            record("triangle:"+failure(error),target);triangleCases++;
          }
        }
        ${call('vb','a([III)V')}(new int[2054],2,1027);${call('mh','b()V')}();
        int[] expanded=(int[])f("${type('mh')}","${field('mh','field_b','[I')}").get(null);
        if(expanded.length<1027)throw new AssertionError("triangle rows grow");
        for(int i=0;i<1027;i++)if(expanded[i]!=i*2)throw new AssertionError("grown row offset");
        record("grown-row-offsets",expanded);
        ${call('mh','c()V')}();
        if(f("${type('mh')}","${field('mh','field_f','[I')}").get(null)!=null
            ||f("${type('mh')}","${field('mh','field_g','[I')}").get(null)!=null
            ||f("${type('mh')}","${field('mh','field_e','[I')}").get(null)!=null
            ||f("${type('mh')}","${field('mh','field_a','[I')}").get(null)!=null
            ||f("${type('mh')}","${field('mh','field_b','[I')}").get(null)!=null)throw new AssertionError("triangle table release");
        record("released-state:"+f("${type('mh')}","${field('mh','field_c','I')}").getInt(null)
          +":"+f("${type('mh')}","${field('mh','field_h','I')}").getInt(null)
          +":"+f("${type('mh')}","${field('mh','field_d','I')}").getInt(null)
          +":"+f("${type('mh')}","${field('mh','field_i','I')}").getInt(null),null);
        if(spanCases!=1800||viewportCases!=4||triangleCases!=3456||cases!=5266)throw new AssertionError("case inventory");
        StringBuilder sha=new StringBuilder();for(byte value:trace.digest())sha.append(String.format("%02x",value&255));
        System.out.println("triangle-raster:"+cases+":"+spanCases+":"+viewportCases+":"+triangleCases+":6:"+sha);
      }
    }
    class SpritePixelBehavior {
      static final int targetWidth=11,targetHeight=9;
      static final int[] colors={0,1,0x7f7f7f,0x808080,0xffffff,0x123456,0x800000,0x00ff00};
      static int cases,oracleCases,traceCases;
      static MessageDigest trace;
      static int blend(int source,int destination,int alpha,boolean argb) {
        int result=0;
        for(int shift=0;shift<=16;shift+=8) {
          int a=(source>>>shift)&255,b=(destination>>>shift)&255;
          result|=((a*alpha+b*(256-alpha))/256)<<shift;
        }
        // The original RGB/indexed kernels use signed >> 8; ARGB uses >>> 8.
        return argb?result:(result<<8)>>8;
      }
      static int grayTint(int source,int tint) {
        int gray=source&255;
        if(((source>>>8)&255)!=gray||((source>>>16)&255)!=gray)return source;
        int result=0;
        for(int shift=0;shift<=16;shift+=8) {
          int channel=(tint>>>shift)&255;
          int value=gray>128?(channel*(256-gray)+255*(gray-128))/128:gray*channel/128;
          result|=value<<shift;
        }
        return result;
      }
      static int grayModulate(int source,int tint) {
        int gray=source&255;
        if(((source>>>8)&255)!=gray||((source>>>16)&255)!=gray)return source;
        return ((gray*((tint>>>16)&255)/256)<<16)|((gray*((tint>>>8)&255)/256)<<8)
          |((gray*(tint&255)/256&254)+1);
      }
      static int[] background() {
        int[] pixels=new int[targetWidth*targetHeight];
        for(int i=0;i<pixels.length;i++)pixels[i]=((i*17011+0x287c9d)^((i&3)*0x6384b1))&0xffffff;
        return pixels;
      }
      static void record(int[] pixels) {
        for(int pixel:pixels) {trace.update((byte)(pixel>>>24));trace.update((byte)(pixel>>>16));
          trace.update((byte)(pixel>>>8));trace.update((byte)pixel);}
        cases++;
      }
      static int expectedPixel(int source,int destination,int operation,int alpha,int tint,boolean argb) {
        if(argb) {
          int storedAlpha=source>>>24;
          if(operation==7) {
            int result=0,weight=storedAlpha*alpha/256;
            for(int shift=0;shift<=16;shift+=8)
              result|=Math.min(255,((source>>>shift)&255)*weight/256+((destination>>>shift)&255))<<shift;
            return result;
          }
          if(operation!=2&&storedAlpha==0)return destination;
          int rgb=source&0xffffff;
          if(operation==3)rgb=grayTint(rgb,tint);
          if(operation==4)rgb=grayModulate(rgb,tint);
          return blend(rgb,destination,operation==2?storedAlpha*alpha/256:storedAlpha,true);
        }
        if(operation==1)return source;
        if(source==0)return destination;
        if(operation==2)return blend(source,destination,alpha,false);
        if(operation==3)return grayTint(source,tint);
        if(operation==4)return grayModulate(source,tint);
        if(operation==5)return tint;
        if(operation==6) {
          if(destination==0)return destination;
          int result=0;for(int shift=0;shift<=16;shift+=8)
            result|=(((source>>>shift)&255)*((destination>>>shift)&255)/256)<<shift;
          return result;
        }
        if(operation==7) {
          int result=0;for(int shift=0;shift<=16;shift+=8)
            result|=Math.min(255,((source>>>shift)&255)*alpha/256+((destination>>>shift)&255))<<shift;
          return result;
        }
        return source;
      }
      static int[] oracle(int[] source,int w,int h,int fullWidth,int fullHeight,int trimX,int trimY,
          int x,int y,int outputWidth,int outputHeight,int[] clip,int operation,int alpha,int tint,boolean argb) {
        int[] result=background();
        for(int dy=0;dy<targetHeight;dy++)for(int dx=0;dx<targetWidth;dx++) {
          if(dx<clip[0]||dy<clip[1]||dx>=clip[2]||dy>=clip[3])continue;
          int sx,sy;
          if(outputWidth<0) {sx=dx-x-trimX;sy=dy-y-trimY;}
          else {
            if(dx<x||dy<y||dx>=x+outputWidth||dy>=y+outputHeight)continue;
            sx=((dx-x)*((fullWidth<<16)/outputWidth)>>16)-trimX;
            sy=((dy-y)*((fullHeight<<16)/outputHeight)>>16)-trimY;
          }
          if(sx<0||sy<0||sx>=w||sy>=h)continue;
          int index=dy*targetWidth+dx;
          result[index]=expectedPixel(source[sy*w+sx],result[index],operation,alpha,tint,argb);
        }
        return result;
      }
      static void check(int[] actual,int[] wanted,String label) {
        if(!java.util.Arrays.equals(actual,wanted)) {
          int i=0;while(i<actual.length&&actual[i]==wanted[i])i++;
          throw new AssertionError(label+" pixel "+i+": "+Integer.toHexString(actual[i])+" != "+Integer.toHexString(wanted[i]));
        }
        oracleCases++;
      }
      public static void main(String[]args)throws Exception {
        trace=MessageDigest.getInstance("SHA-256");
        int[][] clips={{0,0,11,9},{1,2,8,7},{0,0,0,0},{5,0,6,9},{0,4,11,5}};
        int[][] shapes={{1,1,1,1,0,0},{4,3,4,3,0,0},{4,3,6,5,1,1},{7,4,9,6,1,1}};
        int[][] positions={{-3,-2},{0,0},{2,2},{8,7},{14,12}};
        int[] alphas={0,1,128,255,256};
        int tint=0xc85a93;
        for(boolean argb:new boolean[]{false,true})for(int[] shape:shapes)for(int pattern=0;pattern<3;pattern++) {
          int w=shape[0],h=shape[1];int[] source=new int[w*h];
          for(int i=0;i<source.length;i++) {
            int rgb=colors[(i+pattern*3)%colors.length];
            source[i]=argb?rgb|((new int[]{0,1,127,128,254,255}[(i+pattern)%6])<<24):rgb;
          }
          int[] originalSource=source.clone();
          ${type('dm')} sprite=argb?new ${type('il')}(shape[2],shape[3],shape[4],shape[5],w,h,source)
            :new ${type('dm')}(shape[2],shape[3],shape[4],shape[5],w,h,source);
          for(int[] clip:clips)for(int[] position:positions)for(int alpha:alphas) {
            for(int operation:argb?new int[]{0,1,2,3,4,7}:new int[]{0,1,2,3,4,5,6,7}) {
              int[] target=background();${call('vb','a([III)V')}(target,targetWidth,targetHeight);
              ${call('vb','e(IIII)V')}(clip[0],clip[1],clip[2],clip[3]);
              int x=position[0],y=position[1];
              switch(operation) {
                case 0:sprite.${spriteCall('b(II)V')}(x,y);break;
                case 1:sprite.${spriteCall('c(II)V')}(x,y);break;
                case 2:sprite.${spriteCall('d(III)V')}(x,y,alpha);break;
                case 3:sprite.${spriteCall('e(III)V')}(x,y,tint);break;
                case 4:sprite.${spriteCall('b(III)V')}(x,y,tint);break;
                case 5:sprite.${spriteCall('a(III)V')}(x,y,tint);break;
                case 6:sprite.${spriteCall('e(II)V')}(x,y);break;
                case 7:sprite.${spriteCall('c(III)V')}(x,y,alpha);break;
              }
              check(target,oracle(source,w,h,shape[2],shape[3],shape[4],shape[5],x,y,-1,-1,clip,
                operation,alpha,tint,argb),"unscaled:"+argb+":"+w+":"+pattern+":"+operation+":"+alpha);
              record(target);
            }
            for(int[] size:new int[][]{{1,1},{3,2},{8,6}})for(int operation=0;operation<(argb?2:3);operation++) {
              int[] target=background();${call('vb','a([III)V')}(target,targetWidth,targetHeight);
              ${call('vb','e(IIII)V')}(clip[0],clip[1],clip[2],clip[3]);
              int x=position[0],y=position[1];
              if(operation==0)sprite.${spriteCall('a(IIII)V')}(x,y,size[0],size[1]);
              if(operation==1)sprite.${spriteCall('b(IIIII)V')}(x,y,size[0],size[1],alpha);
              if(operation==2)sprite.${spriteCall('a(IIIII)V')}(x,y,size[0],size[1],tint);
              check(target,oracle(source,w,h,shape[2],shape[3],shape[4],shape[5],x,y,size[0],size[1],clip,
                operation==0?0:operation==1?2:5,alpha,tint,argb),"scaled:"+argb+":"+w+":"+pattern+":"+operation);
              record(target);
            }
          }
          for(int[] clip:clips)for(int[] position:positions)for(int operation=0;operation<2;operation++) {
            int[] target=background();${call('vb','a([III)V')}(target,targetWidth,targetHeight);
            ${call('vb','e(IIII)V')}(clip[0],clip[1],clip[2],clip[3]);
            if(operation==0)sprite.${spriteCall('d(II)V')}(position[0],position[1]);
            else sprite.${spriteCall('f(II)V')}(position[0],position[1]);
            record(target);traceCases++;
          }
          if(!java.util.Arrays.equals(source,originalSource))throw new AssertionError("source pixels changed");
        }
        for(int[] clip:clips)for(int[] position:positions)for(int alpha:alphas)for(int operation=0;operation<2;operation++) {
          byte[] indices={0,1,2,3,4,127,-128,-1,0,3,2,1,6,5,4,3,7,0,1,2,3};
          int[] palette=new int[256];for(int i=0;i<palette.length;i++)palette[i]=colors[i%colors.length];
          palette[0]=0xaabbcc;palette[1]=0;
          ${type('na')} sprite=new ${type('na')}(9,5,1,1,7,3,indices,palette);
          int[] target=background();${call('vb','a([III)V')}(target,targetWidth,targetHeight);
          ${call('vb','e(IIII)V')}(clip[0],clip[1],clip[2],clip[3]);
          if(operation==0)sprite.${indexedCall('a(II)V')}(position[0],position[1]);
          else sprite.${indexedCall('a(III)V')}(position[0],position[1],alpha);
          int[] wanted=background();
          for(int sy=0;sy<3;sy++)for(int sx=0;sx<7;sx++) {
            int dx=position[0]+1+sx,dy=position[1]+1+sy,index=indices[sy*7+sx]&255;
            if(index==0||dx<clip[0]||dy<clip[1]||dx>=clip[2]||dy>=clip[3])continue;
            int destination=dy*targetWidth+dx;
            wanted[destination]=operation==0?palette[index]:blend(palette[index],wanted[destination],alpha,false);
          }
          check(target,wanted,"indexed:"+operation);
          record(target);
        }
        for(int[] clip:clips)for(int[] position:positions)for(int run:new int[]{0,1,3,255}) {
          byte[] indices={1,-1,(byte)run,3,4,5,6,0,1,2,-1,(byte)run,5,6,7,1,2,3,4,5,6};
          ${type('na')} sprite=new ${type('na')}(9,5,1,1,7,3,indices,colors);
          int[] target=background();${call('vb','a([III)V')}(target,targetWidth,targetHeight);
          ${call('vb','e(IIII)V')}(clip[0],clip[1],clip[2],clip[3]);
          try {sprite.${indexedCall('b(II)V')}(position[0],position[1]);trace.update((byte)0);}
          catch(ArrayIndexOutOfBoundsException error){trace.update((byte)1);}
          record(target);traceCases++;
        }
        for(int invalidAlpha:new int[]{-257,-1,257,511,Integer.MIN_VALUE,Integer.MAX_VALUE})
        for(boolean argb:new boolean[]{false,true})for(int operation=0;operation<2;operation++) {
          int[] source={0,0x808080,0xff123456,0x01010203};
          ${type('dm')} sprite=argb?new ${type('il')}(2,2,0,0,2,2,source):new ${type('dm')}(2,2,0,0,2,2,source);
          int[] target=background();${call('vb','a([III)V')}(target,targetWidth,targetHeight);
          if(operation==0)sprite.${spriteCall('d(III)V')}(2,2,invalidAlpha);
          else sprite.${spriteCall('c(III)V')}(2,2,invalidAlpha);
          record(target);traceCases++;
        }
        StringBuilder sha=new StringBuilder();for(byte b:trace.digest())sha.append(String.format("%02x",b&255));
        System.out.println("sprite-pixels:"+cases+":"+oracleCases+":"+traceCases+":"+sha);
      }
    }
    class SpriteTransformBehavior extends SpritePixelBehavior {
      static int cases,oracleCases,traceCases;
      static MessageDigest trace;
      static void record(int[] pixels) {
        for(int pixel:pixels){trace.update((byte)(pixel>>>24));trace.update((byte)(pixel>>>16));
          trace.update((byte)(pixel>>>8));trace.update((byte)pixel);}
        cases++;
      }
      static void check(int[] actual,int[] wanted,String label) {
        if(!java.util.Arrays.equals(actual,wanted))throw new AssertionError(label);
        oracleCases++;
      }
      static int[] reductionOracle(int[] source,int w,int h,int trimX,int trimY,int x,int y,
          int block,int[] clip,boolean argb) {
        int[] result=background();int left=x+trimX/block,top=y+trimY/block,count=block*block;
        for(int dy=0;dy<targetHeight;dy++)for(int dx=0;dx<targetWidth;dx++) {
          if(dx<clip[0]||dy<clip[1]||dx>=clip[2]||dy>=clip[3])continue;
          int sx=(dx-left)*block,sy=(dy-top)*block;
          if(sx<0||sy<0||sx+block>w||sy+block>h)continue;
          int index=dy*targetWidth+dx,alphaSum=0;int[] channels=new int[3];
          for(int by=0;by<block;by++)for(int bx=0;bx<block;bx++) {
            int pixel=source[(sy+by)*w+sx+bx],alpha=argb?pixel>>>24:1;
            if(!argb&&pixel==0)pixel=result[index];
            alphaSum+=alpha;for(int c=0;c<3;c++)channels[c]+=((pixel>>>(c*8))&255)*alpha;
          }
          if(argb&&alphaSum==0)continue;
          int filtered=0;for(int c=0;c<3;c++)filtered|=(channels[c]/(argb?alphaSum:count))<<(c*8);
          result[index]=argb?blend(filtered,result[index],alphaSum/count,true):filtered;
        }
        return result;
      }
      static int[] cardinalOracle(int[] source,int w,int h,int trimX,int trimY,int pivotX,int pivotY,
          int destinationX,int destinationY,int quarterTurns,int scale,int[] clip,boolean argb) {
        int[] result=background();if(scale==0)return result;
        int[] sin={0,1,0,-1},cos={1,0,-1,0};int inverse=16777216/scale;
        int stepX=cos[quarterTurns]*inverse,stepY=sin[quarterTurns]*inverse;
        for(int dy=0;dy<targetHeight;dy++)for(int dx=0;dx<targetWidth;dx++) {
          if(dx<clip[0]||dy<clip[1]||dx>=clip[2]||dy>=clip[3])continue;
          int rx=dx*16+8-destinationX,ry=dy*16+8-destinationY;
          int sx=(pivotX-trimX*16)*256-Math.floorDiv(ry*stepY,16)+Math.floorDiv(rx*stepX,16);
          int sy=(pivotY-trimY*16)*256+Math.floorDiv(ry*stepX,16)+Math.floorDiv(rx*stepY,16);
          if(sx<0||sy<0||sx>=w*4096||sy>=h*4096)continue;
          int index=dy*targetWidth+dx,pixel=source[(sy/4096)*w+sx/4096];
          if(argb)result[index]=blend(pixel,result[index],pixel>>>24,true);
          else if(pixel!=0)result[index]=pixel;
        }
        return result;
      }
      static int bilinearOracle(int[] source,int w,int h,int sourceX,int sourceY,int fx,int fy,int destination) {
        fx=Math.floorMod(fx,4096);fy=Math.floorMod(fy,4096);
        int total=0;int[] channels=new int[3];
        for(int by=0;by<2;by++)for(int bx=0;bx<2;bx++) {
          int x=sourceX+bx,y=sourceY+by;
          if(x<0||y<0||x>=w||y>=h)continue;
          int pixel=source[y*w+x];if(pixel==0)continue;
          int weight=((bx==0?4096-fx:fx)*(by==0?4096-fy:fy))/65536;
          total+=weight;for(int c=0;c<3;c++)channels[c]+=((pixel>>>(c*8))&255)*weight;
        }
        if(total<128)return destination;
        int result=0;for(int c=0;c<3;c++)result|=(channels[c]/(total<256?total:256))<<(c*8);
        return result==0?1:result;
      }
      static int geometry(Object sprite,String name)throws Exception {
        return NineSliceBehavior.field("${type('wh')}",name).getInt(sprite);
      }
      static int[] pixels(Object sprite)throws Exception {
        return (int[])NineSliceBehavior.field("${type('dm')}","${field('dm','field_v','[I')}").get(sprite);
      }
      public static void main(String[]args)throws Exception {
        trace=MessageDigest.getInstance("SHA-256");
        int[][] shapes={{1,1,1,1,0,0},{4,4,4,4,0,0},{5,3,7,5,1,1}};
        int[][] clips={{0,0,11,9},{1,2,8,7},{5,0,6,9}};
        int[][] positions={{0,0},{2,2},{8,7}};
        for(boolean argb:new boolean[]{false,true})for(int[] shape:shapes)for(int pattern=0;pattern<2;pattern++) {
          int w=shape[0],h=shape[1];int[] source=new int[w*h];
          for(int i=0;i<source.length;i++)source[i]=colors[(i+pattern*3)%colors.length]
            |(argb?(new int[]{0,1,127,128,254,255}[(i+pattern)%6])<<24:0);
          int[] originalSource=source.clone();
          ${type('dm')} sprite=argb?new ${type('il')}(shape[2],shape[3],shape[4],shape[5],w,h,source)
            :new ${type('dm')}(shape[2],shape[3],shape[4],shape[5],w,h,source);
          for(int[] clip:clips)for(int[] position:positions)for(int block:new int[]{2,4}) {
            int[] target=background();${call('vb','a([III)V')}(target,targetWidth,targetHeight);
            ${call('vb','e(IIII)V')}(clip[0],clip[1],clip[2],clip[3]);
            if(block==2)sprite.${spriteCall('d(II)V')}(position[0],position[1]);
            else sprite.${spriteCall('f(II)V')}(position[0],position[1]);
            check(target,reductionOracle(source,w,h,shape[4],shape[5],position[0],position[1],block,clip,argb),
              "reduction:"+argb+":"+w+":"+block);
            record(target);
          }
          for(int[] clip:clips)for(int[] position:positions)for(int pivotShift:new int[]{0,8})
          for(int fraction:new int[]{0,8,15})for(int scale:new int[]{-8192,-4096,-2048,0,2048,4096,8192})
          for(int turns=0;turns<4;turns++) {
            int[] target=background();${call('vb','a([III)V')}(target,targetWidth,targetHeight);
            ${call('vb','e(IIII)V')}(clip[0],clip[1],clip[2],clip[3]);
            int px=shape[2]*8+pivotShift,py=shape[3]*8-pivotShift;
            int dx=position[0]*16+fraction,dy=position[1]*16+fraction;
            sprite.${spriteCall('b(IIIIII)V')}(px,py,dx,dy,turns*16384,scale);
            check(target,cardinalOracle(source,w,h,shape[4],shape[5],px,py,dx,dy,turns,scale,clip,argb),
              "cardinal:"+argb+":"+w+":"+turns+":"+scale+":"+fraction);
            record(target);
          }
          if(!java.util.Arrays.equals(source,originalSource))throw new AssertionError("transform source changed");
        }
        Method bilinear=Class.forName("${type('dm')}").getDeclaredMethod("${spriteCall('c(IIIII)V')}",
          int.class,int.class,int.class,int.class,int.class);bilinear.setAccessible(true);
        for(int pattern=0;pattern<3;pattern++) {
          int[] source=new int[12];for(int i=0;i<source.length;i++)source[i]=colors[(i+pattern*3)%colors.length];
          ${type('dm')} sprite=new ${type('dm')}(4,3,0,0,4,3,source);
          for(int y=-1;y<3;y++)for(int x=-1;x<4;x++)
          for(int fx:new int[]{-1,0,1,1023,2047,2048,4094,4095,8192})
          for(int fy:new int[]{-1,0,1,1023,2047,2048,4094,4095,8192}) {
            int[] target=background();${call('vb','a([III)V')}(target,targetWidth,targetHeight);
            int[] wanted=target.clone();int index=37;
            wanted[index]=bilinearOracle(source,4,3,x,y,fx,fy,wanted[index]);
            bilinear.invoke(sprite,index,x,y,fx,fy);
            check(target,wanted,"bilinear:"+pattern+":"+x+":"+y+":"+fx+":"+fy);record(target);
          }
        }
        for(boolean argb:new boolean[]{false,true})for(int[] shape:shapes)
        for(int pattern=0;pattern<4;pattern++)for(int operation=0;operation<5;operation++) {
          int w=shape[0],h=shape[1];int[] initial=new int[w*h];
          for(int i=0;i<initial.length;i++)initial[i]=pattern==3?0:pattern==2?(i==initial.length/2?1:0)
            :colors[(i+pattern*3)%colors.length]|(argb&&i%2==0?0xff000000:0);
          int[] source=initial.clone();
          ${type('dm')} sprite=argb?new ${type('il')}(shape[2],shape[3],shape[4],shape[5],w,h,source)
            :new ${type('dm')}(shape[2],shape[3],shape[4],shape[5],w,h,source);
          ${type('dm')} result=sprite;int[] wanted=initial.clone();
          int newWidth=w,newHeight=h,fullWidth=shape[2],fullHeight=shape[3],trimX=shape[4],trimY=shape[5];
          if(operation==0)result=sprite.${spriteCall('b()Ldm;')}();
          if(operation==1) {
            result=sprite.${spriteCall('c()Ldm;')}();trimX=fullWidth-w-trimX;
            for(int y=0;y<h;y++)for(int x=0;x<w;x++)wanted[y*w+x]=initial[y*w+w-1-x];
          }
          if(operation==2) {
            sprite.${spriteCall('a()V')}();newWidth=h;newHeight=w;
            fullWidth=shape[3];fullHeight=shape[2];trimX=shape[3]-h-shape[5];trimY=shape[4];
            for(int y=0;y<h;y++)for(int x=0;x<w;x++)wanted[x*h+h-1-y]=initial[y*w+x];
          }
          if(operation==3) {
            sprite.${spriteCall('g(I)V')}(0xc85a93);
            for(int y=0;y<h;y++)for(int x=0;x<w;x++)if(initial[y*w+x]==0
              &&(x>0&&initial[y*w+x-1]!=0||x+1<w&&initial[y*w+x+1]!=0
                ||y>0&&initial[(y-1)*w+x]!=0||y+1<h&&initial[(y+1)*w+x]!=0))wanted[y*w+x]=0xc85a93;
          }
          if(operation==4) {
            sprite.${spriteCall('d()V')}();int left=w,top=h,right=-1,bottom=-1;
            for(int y=0;y<h;y++)for(int x=0;x<w;x++)if(initial[y*w+x]!=0) {
              left=Math.min(left,x);right=Math.max(right,x);top=Math.min(top,y);bottom=Math.max(bottom,y);
            }
            if(right<0){newWidth=0;newHeight=0;wanted=new int[0];}
            else {
              newWidth=right-left+1;newHeight=bottom-top+1;trimX+=left;trimY+=top;
              wanted=new int[newWidth*newHeight];for(int y=0;y<newHeight;y++)for(int x=0;x<newWidth;x++)
                wanted[y*newWidth+x]=initial[(y+top)*w+x+left];
            }
          }
          if(geometry(result,"${field('wh','field_r','I')}")!=newWidth||geometry(result,"${field('wh','field_m','I')}")!=newHeight
            ||geometry(result,"${field('wh','field_s','I')}")!=fullWidth||geometry(result,"${field('wh','field_o','I')}")!=fullHeight
            ||geometry(result,"${field('wh','field_u','I')}")!=trimX||geometry(result,"${field('wh','field_p','I')}")!=trimY)
              throw new AssertionError("mutated geometry:"+argb+":"+w+":"+pattern+":"+operation);
          if(operation<2&&(result==sprite||pixels(result)==source||result instanceof ${type('il')}))
            throw new AssertionError("copy object/type/pixel independence");
          if(!java.util.Arrays.equals(source,initial))throw new AssertionError("mutated source array");
          check(pixels(result),wanted,"copy/rotate/outline/trim:"+argb+":"+w+":"+pattern+":"+operation);
          for(int value:new int[]{newWidth,newHeight,fullWidth,fullHeight,trimX,trimY}) {
            trace.update((byte)(value>>>24));trace.update((byte)(value>>>16));trace.update((byte)(value>>>8));trace.update((byte)value);
          }
          trace.update((byte)(result==sprite?1:0));trace.update((byte)(pixels(result)==source?1:0));
          trace.update((byte)(result instanceof ${type('il')}?1:0));record(pixels(result));
        }
        for(boolean argb:new boolean[]{false,true})for(int[] shape:shapes)for(int[] clip:clips)
        for(int[] position:positions)for(int angle:new int[]{-1,0,1,8192,16383,16384,16385,24576,32768,40960,49151,49152,65536})
        for(int scale:new int[]{-4096,-1,0,1,2048,4096,Integer.MAX_VALUE})for(int mode=0;mode<2;mode++) {
          int[] source=new int[shape[0]*shape[1]];for(int i=0;i<source.length;i++)
            source[i]=colors[i%colors.length]|(argb?(i%2==0?0xff000000:0):0);
          ${type('dm')} sprite=argb?new ${type('il')}(shape[2],shape[3],shape[4],shape[5],shape[0],shape[1],source)
            :new ${type('dm')}(shape[2],shape[3],shape[4],shape[5],shape[0],shape[1],source);
          int[] target=background();${call('vb','a([III)V')}(target,targetWidth,targetHeight);
          ${call('vb','e(IIII)V')}(clip[0],clip[1],clip[2],clip[3]);
          try {
            if(mode==0)sprite.${spriteCall('b(IIIIII)V')}(shape[2]*8,shape[3]*8,position[0]*16+3,position[1]*16+11,angle,scale);
            else sprite.${spriteCall('a(IIIIII)V')}(shape[2]*8,shape[3]*8,position[0]*16+3,position[1]*16+11,angle,scale);
            trace.update((byte)0);
          }catch(ArrayIndexOutOfBoundsException error){trace.update((byte)1);}
          catch(ArithmeticException error){trace.update((byte)2);}
          record(target);traceCases++;
        }
        StringBuilder sha=new StringBuilder();for(byte b:trace.digest())sha.append(String.format("%02x",b&255));
        System.out.println("sprite-transforms:"+cases+":"+oracleCases+":"+traceCases+":"+sha);
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
    assert.equal(crypto.createHash('sha256').update(output).digest('hex'),expectedNativeSha256,variant+': matches recorded verified native bytecode output');
    if(expected===null)expected=output;else assert.deepEqual(output,expected,variant+': every sprite pixel and cleanup side effect must match');
    console.log(JSON.stringify({variant,cases:2592,sha256:crypto.createHash('sha256').update(output).digest('hex')}));
    const spriteOutput=captureProcess('java',['-Djava.awt.headless=true','-cp',classes+path.delimiter+cp,'NineSliceBehavior','sprite-pixels']).stdout;
    const spriteSha=crypto.createHash('sha256').update(spriteOutput).digest('hex');
    console.log(JSON.stringify({variant,spritePixelTrace:spriteOutput.toString().trim(),sha256:spriteSha}));
    assert.match(spriteOutput.toString(),/^sprite-pixels:45074:43750:1324:[a-f0-9]{64}\n$/);
    assert.equal(spriteSha,expectedSpritePixelsSha256,variant+': fixed native sprite-pixel trace');
    if(expectedSpritePixels===null)expectedSpritePixels=spriteOutput;
    else assert.deepEqual(spriteOutput,expectedSpritePixels,variant+': sprite pixels and original failure mutations');
    const transformOutput=captureProcess('java',['-Djava.awt.headless=true','-cp',classes+path.delimiter+cp,'NineSliceBehavior','sprite-transforms']).stdout;
    const transformSha=crypto.createHash('sha256').update(transformOutput).digest('hex');
    console.log(JSON.stringify({variant,spriteTransformTrace:transformOutput.toString().trim(),sha256:transformSha}));
    assert.match(transformOutput.toString(),/^sprite-transforms:33168:23340:9828:[a-f0-9]{64}\n$/);
    assert.equal(transformSha,expectedSpriteTransformsSha256,variant+': fixed native sprite-transform trace');
    if(expectedSpriteTransforms===null)expectedSpriteTransforms=transformOutput;
    else assert.deepEqual(transformOutput,expectedSpriteTransforms,variant+': transform pixel buffers and failure mutations');
    const triangleOutput=captureProcess('java',['-Djava.awt.headless=true','-cp',classes+path.delimiter+cp,'NineSliceBehavior','triangle-raster']).stdout;
    const triangleSha=crypto.createHash('sha256').update(triangleOutput).digest('hex');
    console.log(JSON.stringify({variant,triangleRasterTrace:triangleOutput.toString().trim(),sha256:triangleSha}));
    assert.match(triangleOutput.toString(),/^triangle-raster:5266:1800:4:3456:6:[a-f0-9]{64}\n$/);
    assert.equal(triangleSha,expectedTriangleRasterSha256,variant+': fixed native triangle-raster trace');
    if(expectedTriangleRaster===null)expectedTriangleRaster=triangleOutput;
    else assert.deepEqual(triangleOutput,expectedTriangleRaster,variant+': triangle pixels, viewport state and failure mutations');
    const meshOutput=captureProcess('java',['-Djava.awt.headless=true','-cp',classes+path.delimiter+cp,'NineSliceBehavior','mesh-lighting']).stdout;
    const meshSha=crypto.createHash('sha256').update(meshOutput).digest('hex');
    console.log(JSON.stringify({variant,meshLightingTrace:meshOutput.toString().trim(),sha256:meshSha}));
    assert.match(meshOutput.toString(),/^mesh-lighting:10592:10368:224:[a-f0-9]{64}\n$/);
    assert.equal(meshSha,expectedMeshLightingSha256,variant+': fixed native mesh-lighting trace');
    if(expectedMeshLighting===null)expectedMeshLighting=meshOutput;
    else assert.deepEqual(meshOutput,expectedMeshLighting,variant+': model lighting, ordering, transforms, bounds and failure mutations');
    const flatOutput=captureProcess('java',['-Djava.awt.headless=true','-cp',classes+path.delimiter+cp,'NineSliceBehavior','flat-triangle']).stdout;
    const flatSha=crypto.createHash('sha256').update(flatOutput).digest('hex');
    console.log(JSON.stringify({variant,flatTriangleTrace:flatOutput.toString().trim(),sha256:flatSha}));
    assert.match(flatOutput.toString(),/^flat-triangle:8775:1575:4608:2592:[a-f0-9]{64}\n$/);
    assert.equal(flatSha,expectedFlatTriangleRasterSha256,variant+': fixed native flat-triangle trace');
    if(expectedFlatTriangleRaster===null)expectedFlatTriangleRaster=flatOutput;
    else assert.deepEqual(flatOutput,expectedFlatTriangleRaster,variant+': flat triangle pixels, guard timing and partial writes');
  }
}catch(error){if(error.stderr)process.stderr.write(error.stderr);throw error;}
finally{fs.rmSync(temporary,{recursive:true,force:true});}
