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
let expected=null, expectedSpritePixels=null;
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
        if(args.length!=0){SpritePixelBehavior.main(args);return;}
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
  }
}catch(error){if(error.stderr)process.stderr.write(error.stderr);throw error;}
finally{fs.rmSync(temporary,{recursive:true,force:true});}
