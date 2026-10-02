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
if (!nativeInput) throw new Error('Usage: node readable/tests/test-geoblox-gameplay.mjs NATIVE_CLASSES');
const expectedNativeSha256 = 'c21730704dc4cdff3cb74f1f5fba326b3a059df680fecf6bbb1d080f6932eda0';
const rules = JSON.parse(fs.readFileSync(path.join(root, 'geoblox-rules.json')));
const aliases = new Map(rules.renames.map(rule => [rule.symbol, rule.to]));
const temporary = fs.mkdtempSync(path.join(os.tmpdir(), 'geoblox-gameplay-'));
try {
  const nativeFiles = [];
  const visit = directory => {
    for (const item of fs.readdirSync(directory, {withFileTypes: true})) {
      const file = path.join(directory, item.name);
      if (item.isDirectory()) visit(file);
      else if (item.name.endsWith('.class')) nativeFiles.push(file);
    }
  };
  visit(nativeInput);
  const nativeHash = crypto.createHash('sha256');
  for (const file of nativeFiles.sort()) {
    const name = Buffer.from(path.relative(nativeInput, file).split(path.sep).join('/'));
    const bytes = fs.readFileSync(file);
    nativeHash.update(name.length + ':'); nativeHash.update(name);
    nativeHash.update(bytes.length + ':'); nativeHash.update(bytes);
  }
  const pin = JSON.parse(fs.readFileSync(path.join(root, '../decompilation/geoblox-provenance.json')))
    .verifiedTransformedClasses;
  assert.equal(nativeFiles.length, pin.files);
  assert.equal(nativeHash.digest('hex'), pin.sha256);
  let expected;
  for (const variant of ['native', 'original', 'renamed']) {
    const native = variant === 'native', renamed = variant === 'renamed';
    const name = (key, original) => renamed ? aliases.get(key) ?? original : original;
    const type = original => name('C:' + original, original);
    const field = (owner, original, descriptor) => native ? original.replace(/^field_/, '')
      : name(`F:${owner}.${original}:${descriptor}`, original);
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
      static int cases,conversionFailures;
      static void check(boolean value, String label) { if (!value) throw new AssertionError(label); }
      static boolean boundary() { return ${call('ld', 'a(I)Z')}(-61); }
      static ${entity} entity(int id,int category,int variant,int kind) {
        return new ${entity}(variant,category,kind,320,240,0,0,0,0,id);
      }
      static boolean link(${entity} a,${entity} b,boolean force) {
        return ${call('ik', 'a(Lja;Lja;Z)Z')}(a,b,force);
      }
      static String state(${entity} e) {
        StringBuilder result=new StringBuilder();
        result.append(e.${field('ja','field_H','I')}).append(':')
          .append(e.${field('ja','field_z','I')}).append(':')
          .append(e.${field('ja','field_C','I')}).append(':')
          .append(e.${field('ja','field_M','I')}).append(':')
          .append(e.${field('ja','field_E','I')}).append(':')
          .append(e.${field('ja','field_L','I')}).append(':')
          .append(e.${field('ja','field_N','I')}).append(':')
          .append(e.${field('ja','field_m','I')}).append(':')
          .append(e.${field('ja','field_B','Z')}).append(':')
          .append(e.${field('ja','field_t','Z')}).append(':')
          .append(e.${field('ja','field_K','Ltf;')}==${moving}).append(':');
        for(${entity} neighbor:e.${field('ja','field_n','[Lja;')})
          result.append(neighbor==null?0:neighbor.${field('ja','field_H','I')}).append(',');
        return result.toString();
      }
      static void ordinaryOracle(${entity} e,${entity}[] neighbors) {
        check(e.${field('ja','field_L','I')}==neighbors.length,"neighbor count");
        int categories=0,variants=0;
        for(int i=0;i<neighbors.length;i++) {
          check(e.${field('ja','field_n','[Lja;')}[i]==neighbors[i],"neighbor order");
          if(e.${field('ja','field_C','I')}==neighbors[i].${field('ja','field_C','I')})categories++;
          if(e.${field('ja','field_M','I')}==neighbors[i].${field('ja','field_M','I')})variants++;
        }
        check(e.${field('ja','field_N','I')}==categories,"category count");
        check(e.${field('ja','field_m','I')}==variants,"variant count");
      }
      static void contacts() {
        ${raster} sprite=new ${raster}(1,1);
        ${global('ke','field_a','[[[Ldm;')}=new ${raster}[1][2][2];
        ${global('s','field_G','[[Ldm;')}=new ${raster}[][]{{sprite,sprite}};
        ${global('jg','field_h','[[I')}=new int[][]{{0,0,0,0,0,0,0}};
        ${global('ka','field_m','[[[Ldm;')}=new ${raster}[1][2][7];
        for(int c=0;c<2;c++)for(int v=0;v<2;v++)${global('ke','field_a','[[[Ldm;')}[0][c][v]=sprite;
        for(int v=0;v<2;v++)java.util.Arrays.fill(${global('ka','field_m','[[[Ldm;')}[0][v],sprite);
        for(int guard=0;guard<2;guard++) {
          ${global('Geoblox','field_C','I')}=guard;
          for(int firstKind=0;firstKind<3;firstKind++)for(int secondKind=0;secondKind<3;secondKind++)
          for(int category=0;category<2;category++)for(int variant=0;variant<2;variant++)
          for(boolean force:new boolean[]{false,true}) {
            ${entity} first=entity(1,0,0,firstKind),second=entity(2,category,variant,secondKind);
            first.${field('ja','field_t','Z')}=true;second.${field('ja','field_t','Z')}=true;
            boolean detached=link(first,second,force);
            check(detached==second.${field('ja','field_B','Z')},"return is second detach flag");
            if(firstKind==0&&secondKind==0) {
              ordinaryOracle(first,force?new ${entity}[0]:new ${entity}[]{second});
              ordinaryOracle(second,force?new ${entity}[0]:new ${entity}[]{first});
              check(detached==force,"forced ordinary detach");
              check(!first.${field('ja','field_B','Z')},"first stays attached");
              check(second.${field('ja','field_t','Z')},"second keeps avatar contact");
            }
            String before=state(first)+"/"+state(second);
            // Duplicate suppression applies while the contact is retained.
            if(first.${field('ja','field_L','I')}>0&&second.${field('ja','field_L','I')}>0) {
              check(!link(first,second,true),"duplicate returns false before force flag");
              check(before.equals(state(first)+"/"+state(second)),"duplicate changes nothing");
            }
            System.out.println("contact:"+guard+":"+firstKind+":"+secondKind+":"+category+":"+variant+":"+force+":"+detached+":"+before);
            cases++;
          }
          // First, middle and sixth slots, plus a missing entity,
          // with starting indices that include, skip or reach the array end.
          for(int target:new int[]{0,2,5,6})for(int start:new int[]{0,2,5,6}) {
            ${entity} center=entity(10,0,0,0);${entity}[] neighbors=new ${entity}[7];
            for(int i=0;i<7;i++)neighbors[i]=entity(i+20,i%2,i/2%2,0);
            for(int i=0;i<6;i++)link(neighbors[i],center,false);
            center.${method('ja','a(Lja;I)V')}(neighbors[target],start);
            java.util.ArrayList<${entity}> wanted=new java.util.ArrayList<${entity}>();
            for(int i=0;i<6;i++)if(i!=target||target<start)wanted.add(neighbors[i]);
            ordinaryOracle(center,wanted.toArray(new ${entity}[0]));
            for(int i=wanted.size();i<6;i++)check(center.${field('ja','field_n','[Lja;')}[i]==null,"cleared tail");
            System.out.println("remove:"+guard+":"+target+":"+start+":"+state(center));cases++;
          }
          // Force-detach an entity with two pre-existing contacts. Each
          // surviving neighbor retains its other contact and matching counts.
          ${entity} a=entity(30,0,0,0),b=entity(31,0,0,0),c=entity(32,0,0,0),d=entity(33,1,1,0);
          link(a,c,false);link(b,c,false);link(b,d,false);
          check(link(a,b,true),"force detach existing neighborhood");
          ordinaryOracle(a,new ${entity}[]{c});ordinaryOracle(b,new ${entity}[0]);
          ordinaryOracle(c,new ${entity}[]{a});ordinaryOracle(d,new ${entity}[0]);
          check(b.${field('ja','field_K','Ltf;')}==${moving},"moving queue selected");
          System.out.println("unlink:"+guard+":"+state(a)+"/"+state(b)+"/"+state(c)+"/"+state(d));cases++;
        }
      }
      static void secondaryQueues() {
        for(int guard=0;guard<2;guard++) {
          ${global('Geoblox','field_C','I')}=guard;
          ${type('wd')}[] queues={new ${type('wd')}(),new ${type('wd')}()};
          java.util.ArrayList<java.util.ArrayList<${entity}>> model=new java.util.ArrayList<java.util.ArrayList<${entity}>>();
          model.add(new java.util.ArrayList<${entity}>());model.add(new java.util.ArrayList<${entity}>());
          ${entity}[] nodes=new ${entity}[7];${deque} primary=new ${deque}();
          ${type('hf')}[] next=new ${type('hf')}[7],previous=new ${type('hf')}[7];
          for(int i=0;i<7;i++){nodes[i]=entity(i+40,0,0,0);primary.${addLast}(-35,nodes[i]);}
          for(int i=0;i<7;i++){next[i]=nodes[i].${field('hf','field_b','Lhf;')};previous[i]=nodes[i].${field('hf','field_c','Lhf;')};}
          java.util.Random random=new java.util.Random(17023);
          for(int step=0;step<160;step++) {
            int q=random.nextInt(2),index=random.nextInt(7),operation=random.nextInt(4);
            ${entity} node=nodes[index];
            if(operation<2) {
              model.get(0).remove(node);model.get(1).remove(node);
              if(operation==0){queues[q].${method('wd','a(Lrc;Z)V')}(node,false);model.get(q).add(0,node);}
              else {queues[q].${method('wd','a(ILrc;)V')}(-45,node);model.get(q).add(node);}
            } else if(operation==2) {
              ${entity} wanted=model.get(q).isEmpty()?null:model.get(q).remove(0);
              check(queues[q].${method('wd','a(Z)Lrc;')}(true)==wanted,"secondary pop identity");
            } else {
              node.${method('rc','a(B)V')}((byte)65);model.get(0).remove(node);model.get(1).remove(node);
            }
            StringBuilder trace=new StringBuilder();
            for(int which=0;which<2;which++) {
              check(queues[which].${method('wd','b(B)I')}((byte)67)==model.get(which).size(),"secondary count");
              ${type('rc')} current=queues[which].${method('wd','c(B)Lrc;')}((byte)121);
              for(${entity} wanted:model.get(which)) {
                check(current==wanted,"secondary traversal order");
                check(current.${field('rc','field_k','Lrc;')}.${field('rc','field_l','Lrc;')}==current,"secondary forward reciprocity");
                check(current.${field('rc','field_l','Lrc;')}.${field('rc','field_k','Lrc;')}==current,"secondary backward reciprocity");
                trace.append(wanted.${field('ja','field_H','I')}).append(',');
                current=queues[which].${method('wd','a(I)Lrc;')}(-59);
              }
              check(current==null,"secondary traversal end");trace.append('/');
            }
            for(int i=0;i<7;i++) {
              check(nodes[i].${field('hf','field_b','Lhf;')}==next[i]&&nodes[i].${field('hf','field_c','Lhf;')}==previous[i],"primary links independent");
              if(!model.get(0).contains(nodes[i])&&!model.get(1).contains(nodes[i]))
                check(nodes[i].${field('rc','field_k','Lrc;')}==null&&nodes[i].${field('rc','field_l','Lrc;')}==null,"secondary unlink clears both links");
            }
            System.out.println("secondary:"+guard+":"+step+":"+q+":"+index+":"+operation+":"+trace);cases++;
          }
        }
      }
      static void conversions() {
        int[][] pairs={{0,1},{0,2},{0,3},{1,2},{1,3},{2,3}};
        for(int guard=0;guard<2;guard++)for(int mode=0;mode<4;mode++)
        for(int root:new int[]{0,3})for(int key=0;key<2;key++)for(int mask=0;mask<64;mask++) {
          ${global('Geoblox','field_C','I')}=guard;
          ${entity}[] nodes=new ${entity}[4];${entity} template=entity(99,key,key,0);
          template.${field('ja','field_u','F')}=1.5f;
          int[] oldKind=new int[4],oldCategory=new int[4],oldVariant=new int[4];
          ${deque} primary=new ${deque}();${type('hf')}[] next=new ${type('hf')}[4],previous=new ${type('hf')}[4];
          for(int i=0;i<4;i++) {
            int kind=mode==1?1:mode==2?2:1+(i+key)%2;
            nodes[i]=entity(i+60,i%2,i%2,kind);nodes[i].${field('ja','field_u','F')}=i+0.25f;
            oldKind[i]=kind;oldCategory[i]=nodes[i].${field('ja','field_C','I')};oldVariant[i]=nodes[i].${field('ja','field_M','I')};
            primary.${addLast}(-35,nodes[i]);
          }
          // Control graph adjacency directly: conversion is tested separately
          // from the contact producer and starts with zero match counters.
          for(int edge=0;edge<6;edge++)if((mask&(1<<edge))!=0) {
            int a=pairs[edge][0],b=pairs[edge][1];
            nodes[a].${field('ja','field_n','[Lja;')}[nodes[a].${field('ja','field_L','I')}++]=nodes[b];
            nodes[b].${field('ja','field_n','[Lja;')}[nodes[b].${field('ja','field_L','I')}++]=nodes[a];
          }
          for(int i=0;i<4;i++){next[i]=nodes[i].${field('hf','field_b','Lhf;')};previous[i]=nodes[i].${field('hf','field_c','Lhf;')};}
          boolean[] reached=new boolean[4];reached[root]=true;
          if(mode!=0)for(int pass=0;pass<4;pass++)for(int edge=0;edge<6;edge++)if((mask&(1<<edge))!=0) {
            int a=pairs[edge][0],b=pairs[edge][1];if(reached[a]||reached[b])reached[a]=reached[b]=true;
          }
          boolean category=mode==2||mode==3,variant=mode==1||mode==3;
          boolean expectedFailure=false;
          for(int i=0;i<4;i++)if(mode==3&&reached[i]&&oldKind[i]==2)expectedFailure=true;
          String outcome="ok";
          try { ${call('bh','a(ZLja;ILja;Z)V')}(category,template,1,nodes[root],variant); }
          catch(${type('sa')} error) {
            check(expectedFailure,"unexpected conversion exception");
            check(error.${field('sa','field_a','Ljava/lang/Throwable;')} instanceof ArrayIndexOutOfBoundsException,"mixed-flag failure cause");
            outcome=error.${field('sa','field_a','Ljava/lang/Throwable;')}.getClass().getSimpleName()+":"+error.${field('sa','field_d','Ljava/lang/String;')};
            conversionFailures++;
          }
          check(outcome.equals("ok")!=expectedFailure,"predicted mixed-flag outcome");
          StringBuilder trace=new StringBuilder();int failedKindTwo=0;
          for(int i=0;i<4;i++) {
            ${entity} node=nodes[i];boolean converted=reached[i]&&mode!=0;
            int degree=node.${field('ja','field_L','I')};
            if(!expectedFailure) {
            check(node.${field('ja','field_z','I')}==(converted?0:oldKind[i]),"conversion reachability/kind");
            check(node.${field('ja','field_C','I')}==(converted&&category?key:oldCategory[i]),"conversion category");
            check(node.${field('ja','field_M','I')}==(converted&&variant?key:oldVariant[i]),"conversion variant");
            check(node.${field('ja','field_N','I')}==(converted&&category?degree:0),"category edge increments");
            check(node.${field('ja','field_m','I')}==(converted&&variant?degree:0),"variant edge increments");
            check(node.${field('ja','field_E','I')}==(converted&&oldKind[i]==2?60:0),"old kind cooldown");
            check(node.${field('ja','field_B','Z')}==(converted&&mode==2),"category-only detachment");
            check((node.${field('ja','field_K','Ltf;')}==${moving})==(converted&&mode==2),"conversion moving marker");
            } else {
              int actualKind=node.${field('ja','field_z','I')};
              if(actualKind==0) {
                check(reached[i],"partial conversion stays in reachable component");
                check(node.${field('ja','field_M','I')}==key,"partial variant write");
                if(oldKind[i]==2) {
                  check(node.${field('ja','field_C','I')}==-1&&node.${field('ja','field_E','I')}==60,"failed kind-two partial write");failedKindTwo++;
                } else check(node.${field('ja','field_C','I')}==key&&node.${field('ja','field_E','I')}==0,"completed kind-one write");
              } else {
                check(actualKind==oldKind[i]&&node.${field('ja','field_C','I')}==oldCategory[i]
                  &&node.${field('ja','field_M','I')}==oldVariant[i]&&node.${field('ja','field_E','I')}==0,"unprocessed entity unchanged");
              }
              check(node.${field('ja','field_N','I')}==node.${field('ja','field_m','I')}
                &&node.${field('ja','field_N','I')}>=0&&node.${field('ja','field_N','I')}<=degree,"partial edge increments");
              check(!node.${field('ja','field_B','Z')}&&node.${field('ja','field_K','Ltf;')}==null,"mixed flags do not detach");
            }
            check(node.${field('hf','field_b','Lhf;')}==next[i]&&node.${field('hf','field_c','Lhf;')}==previous[i],"conversion preserves primary links");
            if(!category)check(node.${field('ja','field_u','F')}==i+0.25f,"variant preserves angle");
            trace.append(state(node)).append(':').append(Float.floatToIntBits(node.${field('ja','field_u','F')})).append('/');
          }
          if(expectedFailure)check(failedKindTwo==1,"exactly one failing kind-two write");
          System.out.println("conversion:"+guard+":"+mode+":"+root+":"+key+":"+mask+":"+outcome+":"+trace);cases++;
        }
      }
      public static void main(String[] args) {
        Thread watchdog=new Thread(()->{try{Thread.sleep(45000);}catch(InterruptedException error){}System.exit(124);});
        watchdog.setDaemon(true);watchdog.start();
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
        System.out.println("gameplay behavior passed");cases++;
        contacts();
        secondaryQueues();
        conversions();
        System.out.println("complete:"+cases+":conversion-failures:"+conversionFailures);
      }
    }`;
    const directory = path.join(temporary, variant);
    const classes = path.join(directory, 'classes');
    fs.mkdirSync(classes, {recursive: true});
    const harnessFile = path.join(directory, 'GameplayBehavior.java');
    fs.writeFileSync(harnessFile, harness);
    const sourceRoot = path.join(root, renamed ? 'geoblox/src' : '../games/geoblox');
    const files = path.join(directory, 'sources.txt');
    fs.writeFileSync(files, [...(native ? [] : sourceInventory(sourceRoot).map(file => JSON.stringify(path.join(sourceRoot, file.path)))), JSON.stringify(harnessFile)].join('\n') + '\n');
    const stub = path.join(root, 'funorb-stubs.jar');
    const classpath = native ? nativeInput + path.delimiter + stub : stub;
    captureProcess(process.env.JAVAC ?? 'javac', ['--release', '8', '-proc:none', '-encoding', 'UTF-8', '-classpath', classpath, '-d', classes, '@' + files]);
    const output = captureProcess(process.env.JAVA ?? 'java', ['-Djava.awt.headless=true', '-cp', classes + path.delimiter + classpath, 'GameplayBehavior']);
    const sha256 = crypto.createHash('sha256').update(output.stdout).digest('hex');
    console.log(JSON.stringify({variant,sha256,completion:output.stdout.toString().trim().split('\n').at(-1)}));
    assert.equal(sha256,expectedNativeSha256,variant);
    if(expected===undefined)expected=output.stdout;
    else assert.equal(Buffer.compare(output.stdout,expected),0,variant);
  }
} catch (error) {
  if (error.stderr) process.stderr.write(error.stderr);
  throw error;
} finally {
  fs.rmSync(temporary, {recursive: true, force: true});
}
