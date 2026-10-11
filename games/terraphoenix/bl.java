/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bl {
    static ci[] field_b;
    static boolean field_e;
    static int field_f;
    static fa field_a;
    static String field_c;
    static String field_g;
    static long field_h;
    static String field_d;

    final static void a(byte param0, fa param1) {
        class $CfrPartitionedBody {
            RuntimeException stackIn_2491_0;
            StringBuilder stackIn_2491_1;
            String stackIn_2492_2;
            boolean stackIn_2500_0;
            RuntimeException decompiledCaughtException;
            byte[] var2;
            RuntimeException var2_ref;
            int var3;
            byte param0;
            fa param1;
            boolean finished;
            $CfrPartitionedBody(byte initialParam0, fa initialParam1) {
                this.param0 = initialParam0;
                this.param1 = initialParam1;
                this.stackIn_2491_0 = null;
                this.stackIn_2491_1 = null;
                this.stackIn_2492_2 = null;
                this.stackIn_2500_0 = false;
                this.decompiledCaughtException = null;
                this.var2 = null;
                this.var2_ref = null;
                this.var3 = 0;
            }
            void runChunk0() throws java.lang.RuntimeException {
                nj.field_i = param1;
                var2 = il.a((byte) 85, "achievement_names,0");
                if (var2 != null) {
                  b.field_g[0] = ll.a(0, var2);
                }
                var2 = il.a((byte) 107, "achievement_names,1");
                if (null != var2) {
                  b.field_g[1] = ll.a(0, var2);
                }
                var2 = il.a((byte) 101, "achievement_names,2");
                if (null != var2) {
                  b.field_g[2] = ll.a(0, var2);
                }
                var2 = il.a((byte) 93, "achievement_names,3");
                if (null != var2) {
                  b.field_g[3] = ll.a(0, var2);
                }
                var2 = il.a((byte) 97, "achievement_names,4");
                if (var2 != null) {
                  b.field_g[4] = ll.a(0, var2);
                }
                var2 = il.a((byte) 73, "achievement_names,5");
                if (null != var2) {
                  b.field_g[5] = ll.a(0, var2);
                }
                var2 = il.a((byte) 102, "achievement_names,6");
                if (var2 != null) {
                  b.field_g[6] = ll.a(0, var2);
                }
                var2 = il.a((byte) 95, "achievement_names,7");
                if (null != var2) {
                  b.field_g[7] = ll.a(sl.a((int) param0, 96), var2);
                }
                var2 = il.a((byte) 71, "achievement_names,8");
                if (null != var2) {
                  b.field_g[8] = ll.a(param0 - 96, var2);
                }
                var2 = il.a((byte) 127, "achievement_names,9");
                if (var2 != null) {
                  b.field_g[9] = ll.a(param0 - 96, var2);
                }
                var2 = il.a((byte) 72, "achievement_names,10");
                if (var2 != null) {
                  b.field_g[10] = ll.a(0, var2);
                }
                var2 = il.a((byte) 100, "achievement_names,11");
                if (var2 != null) {
                  b.field_g[11] = ll.a(param0 - 96, var2);
                }
                var2 = il.a((byte) 92, "achievement_names,12");
                if (null != var2) {
                  b.field_g[12] = ll.a(0, var2);
                }
                var2 = il.a((byte) 85, "achievement_names,13");
                if (null != var2) {
                  b.field_g[13] = ll.a(0, var2);
                }
                var2 = il.a((byte) 87, "achievement_names,14");
                if (null != var2) {
                  b.field_g[14] = ll.a(0, var2);
                }
                var2 = il.a((byte) 119, "achievement_names,15");
                if (null != var2) {
                  b.field_g[15] = ll.a(param0 - 96, var2);
                }
                var2 = il.a((byte) 115, "achievement_names,16");
                if (null != var2) {
                  b.field_g[16] = ll.a(0, var2);
                }
                var2 = il.a((byte) 79, "points");
                if (var2 != null) {
                  hh.field_l = ll.a(0, var2);
                }
                var2 = il.a((byte) 101, "allysoldat");
                if (null != var2) {
                  f.field_h = ll.a(0, var2);
                }
                var2 = il.a((byte) 101, "yrsoldat");
                if (var2 != null) {
                  hm.field_H = ll.a(param0 - 96, var2);
                }
                var2 = il.a((byte) 84, "stairs");
                if (null != var2) {
                  rj.field_b = ll.a(0, var2);
                }
                var2 = il.a((byte) 113, "normalwall");
                if (var2 != null) {
                  gh.field_O = ll.a(0, var2);
                }
                var2 = il.a((byte) 124, "lowwalls");
                if (var2 != null) {
                  vh.field_h = ll.a(0, var2);
                }
                var2 = il.a((byte) 99, "coverterr");
                if (var2 != null) {
                  cg.field_I = ll.a(0, var2);
                }
                var2 = il.a((byte) 77, "blockterr");
                if (var2 != null) {
                  am.field_H = ll.a(0, var2);
                }
                var2 = il.a((byte) 82, "impassableterr");
                if (null != var2) {
                  bm.field_c = ll.a(0, var2);
                }
                var2 = il.a((byte) 120, "thlevel");
                if (var2 != null) {
                  ab.field_c = ll.a(0, var2);
                }
                var2 = il.a((byte) 127, "ndlev");
                if (var2 != null) {
                  gh.field_L = ll.a(param0 ^ 96, var2);
                }
                var2 = il.a((byte) 101, "groundlevel");
                if (null != var2) {
                  cm.field_e = ll.a(0, var2);
                }
                var2 = il.a((byte) 110, "terraintype");
                if (null != var2) {
                  mm.field_g = ll.a(0, var2);
                }
                var2 = il.a((byte) 118, "terrainlevel");
                if (var2 != null) {
                  kj.field_a = ll.a(param0 - 96, var2);
                }
                var2 = il.a((byte) 115, "mapkey");
                if (var2 != null) {
                  vb.field_e = ll.a(0, var2);
                }
                var2 = il.a((byte) 122, "achievement_criteria,0");
                if (var2 != null) {
                  eb.field_J[0] = ll.a(0, var2);
                }
                var2 = il.a((byte) 74, "achievement_criteria,1");
                if (null != var2) {
                  eb.field_J[1] = ll.a(sl.a((int) param0, 96), var2);
                }
                var2 = il.a((byte) 122, "achievement_criteria,2");
                if (var2 != null) {
                  eb.field_J[2] = ll.a(param0 - 96, var2);
                }
                var2 = il.a((byte) 123, "achievement_criteria,3");
                if (null != var2) {
                  eb.field_J[3] = ll.a(0, var2);
                }
                var2 = il.a((byte) 96, "achievement_criteria,4");
                if (null != var2) {
                  eb.field_J[4] = ll.a(0, var2);
                }
                var2 = il.a((byte) 114, "achievement_criteria,5");
                if (var2 != null) {
                  eb.field_J[5] = ll.a(0, var2);
                }
                var2 = il.a((byte) 87, "achievement_criteria,6");
                if (null != var2) {
                  eb.field_J[6] = ll.a(param0 - 96, var2);
                }
                var2 = il.a((byte) 79, "achievement_criteria,7");
                if (var2 != null) {
                  eb.field_J[7] = ll.a(0, var2);
                }
                var2 = il.a((byte) 94, "achievement_criteria,8");
                if (var2 != null) {
                  eb.field_J[8] = ll.a(param0 - 96, var2);
                }
                var2 = il.a((byte) 91, "achievement_criteria,9");
                if (var2 != null) {
                  eb.field_J[9] = ll.a(0, var2);
                }
                var2 = il.a((byte) 123, "achievement_criteria,10");
                if (var2 != null) {
                  eb.field_J[10] = ll.a(0, var2);
                }
                var2 = il.a((byte) 73, "achievement_criteria,11");
                if (var2 != null) {
                  eb.field_J[11] = ll.a(0, var2);
                }
                var2 = il.a((byte) 72, "achievement_criteria,12");
                if (null != var2) {
                  eb.field_J[12] = ll.a(sl.a((int) param0, 96), var2);
                }
                var2 = il.a((byte) 77, "achievement_criteria,13");
                if (var2 != null) {
                  eb.field_J[13] = ll.a(sl.a((int) param0, 96), var2);
                }
                var2 = il.a((byte) 90, "achievement_criteria,14");
                if (var2 != null) {
                  eb.field_J[14] = ll.a(0, var2);
                }
                var2 = il.a((byte) 107, "achievement_criteria,15");
                if (null != var2) {
                  eb.field_J[15] = ll.a(0, var2);
                }
                var2 = il.a((byte) 82, "achievement_criteria,16");
                if (var2 != null) {
                  eb.field_J[16] = ll.a(0, var2);
                }
                var2 = il.a((byte) 89, "thousandseperator");
                if (var2 != null) {
                  ng.field_w = ll.a(param0 - 96, var2);
                }
                var2 = il.a((byte) 96, "score_colon_space");
                if (var2 != null) {
                  ll.a(param0 ^ 96, var2);
                }
                var2 = il.a((byte) 100, "canpressundo");
                if (var2 != null) {
                  mj.field_c = ll.a(0, var2);
                }
                var2 = il.a((byte) 115, "efficency");
                if (null != var2) {
                  m.field_b = ll.a(0, var2);
                }
                var2 = il.a((byte) 126, "basescore");
                if (null != var2) {
                  dl.field_o = ll.a(0, var2);
                }
                var2 = il.a((byte) 78, "makeanaccounttosave");
                if (null != var2) {
                  uc.field_q = ll.a(param0 - 96, var2);
                }
                var2 = il.a((byte) 123, "ifyoudontwanttosave");
                if (var2 != null) {
                  ae.field_L = ll.a(0, var2);
                }
                var2 = il.a((byte) 83, "contin");
                if (var2 != null) {
                  ba.field_c = ll.a(param0 ^ 96, var2);
                }
                var2 = il.a((byte) 108, "youcannotsave");
                if (var2 != null) {
                  vb.field_c = ll.a(0, var2);
                }
                var2 = il.a((byte) 78, "savegame");
                if (null != var2) {
                  me.field_n = ll.a(param0 - 96, var2);
                }
                var2 = il.a((byte) 122, "yes");
                if (null != var2) {
                  el.field_c = ll.a(0, var2);
                }
                var2 = il.a((byte) 78, "no");
                if (null != var2) {
                  bc.field_b = ll.a(0, var2);
                }
                var2 = il.a((byte) 71, "saveyourgame");
                if (null != var2) {
                  rj.field_d = ll.a(0, var2);
                }
                var2 = il.a((byte) 123, "savingwilloverwrite");
                if (null != var2) {
                  gl.field_t = ll.a(0, var2);
                }
                var2 = il.a((byte) 77, "backtoms");
                if (var2 != null) {
                  hd.field_m = ll.a(0, var2);
                }
                var2 = il.a((byte) 111, "beginmission");
                if (null != var2) {
                  lk.field_c = ll.a(0, var2);
                }
                var2 = il.a((byte) 98, "exitdebriefing");
                if (null != var2) {
                  qa.field_b = ll.a(param0 ^ 96, var2);
                }
                var2 = il.a((byte) 98, "savegameandexitdebriefing");
                if (null != var2) {
                  eg.field_n = ll.a(0, var2);
                }
                var2 = il.a((byte) 108, "exitdebriefingwithoutsaving");
                if (null != var2) {
                  rj.field_c = ll.a(param0 - 96, var2);
                }
                var2 = il.a((byte) 91, "pressnext");
                if (var2 != null) {
                  ak.field_c = ll.a(0, var2);
                }
                var2 = il.a((byte) 87, "objectivefailed");
                if (var2 != null) {
                  rf.field_s = ll.a(param0 ^ 96, var2);
                }
                var2 = il.a((byte) 113, "clearenemies");
                if (var2 != null) {
                  pl.field_G = ll.a(0, var2);
                }
                var2 = il.a((byte) 78, "retrieveevacutate");
                if (null != var2) {
                  ki.field_Z = ll.a(0, var2);
                }
                var2 = il.a((byte) 73, "evacuate");
                if (var2 != null) {
                  ch.field_h = ll.a(0, var2);
                }
                var2 = il.a((byte) 87, "evacmother");
                if (null != var2) {
                  va.field_j = ll.a(param0 - 96, var2);
                }
                var2 = il.a((byte) 77, "preplaun");
                if (var2 != null) {
                  vk.field_a = ll.a(0, var2);
                }
                var2 = il.a((byte) 123, "aboutlaun");
                if (var2 != null) {
                  fc.field_h = ll.a(0, var2);
                }
                var2 = il.a((byte) 98, "launching");
                if (null != var2) {
                  jm.field_a = ll.a(0, var2);
                }
                var2 = il.a((byte) 82, "hasdied");
                if (var2 != null) {
                  aa.field_r = ll.a(param0 - 96, var2);
                }
                var2 = il.a((byte) 97, "hasfallen");
                if (var2 != null) {
                  d.field_O = ll.a(0, var2);
                }
                var2 = il.a((byte) 124, "hostileseen");
                if (null != var2) {
                  ib.field_X = ll.a(0, var2);
                }
                var2 = il.a((byte) 99, "alienseen");
                if (null != var2) {
                  p.field_d = ll.a(0, var2);
                }
                var2 = il.a((byte) 107, "clicktosetdest");
                if (null != var2) {
                  ke.field_g = ll.a(0, var2);
                }
                var2 = il.a((byte) 87, "clicktomovedest");
                if (null != var2) {
                  wg.field_k = ll.a(0, var2);
                }
                var2 = il.a((byte) 75, "clicktocollectob");
                if (var2 != null) {
                  bm.field_b = ll.a(param0 ^ 96, var2);
                }
                var2 = il.a((byte) 75, "clicktofacedest");
                if (null != var2) {
                  va.field_b = ll.a(param0 - 96, var2);
                }
                var2 = il.a((byte) 98, "zoomtolocation");
                if (var2 != null) {
                  rl.field_c = ll.a(0, var2);
                }
                var2 = il.a((byte) 71, "clicktoselect");
                if (var2 != null) {
                  ef.field_a = ll.a(0, var2);
                }
                var2 = il.a((byte) 94, "clicktofire");
                if (null != var2) {
                  q.field_Fb = ll.a(0, var2);
                }
                var2 = il.a((byte) 103, "clicktothrow");
                if (var2 != null) {
                  hm.field_G = ll.a(0, var2);
                }
                var2 = il.a((byte) 108, "clicktoreturntomove");
                if (var2 != null) {
                  cm.field_a = ll.a(0, var2);
                }
                var2 = il.a((byte) 92, "notenoughtus");
                if (var2 != null) {
                  m.field_h = ll.a(param0 - 96, var2);
                }
                var2 = il.a((byte) 76, "outofammo");
                if (var2 != null) {
                  fl.field_d = ll.a(param0 ^ 96, var2);
                }
                var2 = il.a((byte) 90, "outofammosmall");
                if (var2 != null) {
                  ta.field_a = ll.a(0, var2);
                }
                var2 = il.a((byte) 109, "pressltoreload");
                if (var2 != null) {
                  ql.field_f = ll.a(0, var2);
                }
                var2 = il.a((byte) 84, "closemap");
                if (var2 != null) {
                  od.field_d = ll.a(0, var2);
                }
                var2 = il.a((byte) 110, "openmap");
                if (null != var2) {
                  pf.field_d = ll.a(param0 - 96, var2);
                }
                var2 = il.a((byte) 98, "selectready");
                if (var2 != null) {
                  fa.field_e = ll.a(0, var2);
                }
                var2 = il.a((byte) 119, "selectsprint");
                if (null != var2) {
                  db.field_a = ll.a(0, var2);
                }
                var2 = il.a((byte) 92, "togglescematic");
                if (var2 != null) {
                  of.field_i = ll.a(0, var2);
                }
                var2 = il.a((byte) 120, "movetolevel");
                if (var2 != null) {
                  di.field_g = ll.a(param0 ^ 96, var2);
                }
                var2 = il.a((byte) 113, "movetoground");
                if (null != var2) {
                  ph.field_u = ll.a(param0 - 96, var2);
                }
                var2 = il.a((byte) 105, "selectnextfriend");
                if (var2 != null) {
                  sd.field_f = ll.a(0, var2);
                }
                var2 = il.a((byte) 119, "centreonunit");
                if (var2 != null) {
                  ab.field_f = ll.a(0, var2);
                }
                var2 = il.a((byte) 99, "select");
                if (var2 != null) {
                  ne.field_b = ll.a(param0 - 96, var2);
                }
                var2 = il.a((byte) 125, "recruitnew");
                if (null != var2) {
                  kf.field_c = ll.a(0, var2);
                }
                var2 = il.a((byte) 77, "equip");
                if (null != var2) {
                  fi.field_n = ll.a(0, var2);
                }
                var2 = il.a((byte) 97, "build");
                if (null != var2) {
                  c.field_b = ll.a(0, var2);
                }
                var2 = il.a((byte) 102, "remove");
                if (var2 != null) {
                  gi.field_q = ll.a(0, var2);
                }
                var2 = il.a((byte) 95, "andactivateauto");
                if (null != var2) {
                  gl.field_h = ll.a(0, var2);
                }
                var2 = il.a((byte) 78, "andreturntomove");
                if (var2 != null) {
                  td.field_a = ll.a(0, var2);
                }
                var2 = il.a((byte) 117, "reload");
                if (null != var2) {
                  rf.field_q = ll.a(0, var2);
                }
                var2 = il.a((byte) 117, "cost14");
                if (var2 != null) {
                  hi.field_Y = ll.a(0, var2);
                }
                var2 = il.a((byte) 120, "selgren");
                if (var2 != null) {
                  wg.field_g = ll.a(0, var2);
                }
                var2 = il.a((byte) 120, "deselgren");
                if (null != var2) {
                  kd.field_d = ll.a(param0 ^ 96, var2);
                }
                var2 = il.a((byte) 120, "endtheturn");
                if (null != var2) {
                  kd.field_e = ll.a(0, var2);
                }
                var2 = il.a((byte) 127, "notime");
                if (null != var2) {
                  hj.field_A = ll.a(0, var2);
                }
                var2 = il.a((byte) 116, "noroute");
                if (null != var2) {
                  rj.field_f = ll.a(param0 - 96, var2);
                }
                var2 = il.a((byte) 98, "enemyturn");
                if (null != var2) {
                  mk.field_f = ll.a(0, var2);
                }
                var2 = il.a((byte) 101, "clicktocontinue");
                if (null != var2) {
                  jc.field_B = ll.a(0, var2);
                }
                var2 = il.a((byte) 76, "startingturn");
                if (null != var2) {
                  mc.field_a = ll.a(0, var2);
                }
                var2 = il.a((byte) 82, "equipmentclasses,0");
                if (var2 != null) {
                  lb.field_c[0] = ll.a(0, var2);
                }
                var2 = il.a((byte) 121, "equipmentclasses,1");
                if (null != var2) {
                  lb.field_c[1] = ll.a(param0 - 96, var2);
                }
                var2 = il.a((byte) 113, "equipmentclasses,2");
                if (var2 != null) {
                  lb.field_c[2] = ll.a(0, var2);
                }
                var2 = il.a((byte) 82, "equipmentclasses,3");
                if (var2 != null) {
                  lb.field_c[3] = ll.a(0, var2);
                }
                var2 = il.a((byte) 123, "equipmentclasses,4");
                if (var2 != null) {
                  lb.field_c[4] = ll.a(param0 - 96, var2);
                }
                var2 = il.a((byte) 120, "equipmentclasses,5");
                if (var2 != null) {
                  lb.field_c[5] = ll.a(0, var2);
                }
                var2 = il.a((byte) 72, "stockcolon");
                if (var2 != null) {
                  hk.field_c = ll.a(0, var2);
                }
                var2 = il.a((byte) 121, "outofstock");
                if (var2 != null) {
                  bh.field_j = ll.a(0, var2);
                }
                var2 = il.a((byte) 117, "armourcolon");
                if (null != var2) {
                  of.field_n = ll.a(0, var2);
                }
                var2 = il.a((byte) 71, "damagecolon");
                if (var2 != null) {
                  ab.field_e = ll.a(0, var2);
                }
                var2 = il.a((byte) 113, "damagetypehighexplosive");
                if (var2 != null) {
                  im.field_a = ll.a(0, var2);
                }
                var2 = il.a((byte) 117, "highexplosivelong");
                if (null != var2) {
                  rl.field_a = ll.a(param0 - 96, var2);
                }
                var2 = il.a((byte) 102, "clipsize");
                if (var2 != null) {
                  lm.field_f = ll.a(0, var2);
                }
                var2 = il.a((byte) 79, "accuracycolon");
                if (var2 != null) {
                  wh.field_g = ll.a(0, var2);
                }
                var2 = il.a((byte) 125, "throwtq");
                if (var2 != null) {
                  bc.field_c = ll.a(0, var2);
                }
                var2 = il.a((byte) 116, "weightcolon");
                if (var2 != null) {
                  ai.field_e = ll.a(param0 - 96, var2);
                }
                var2 = il.a((byte) 122, "shielding20");
                if (null != var2) {
                  u.field_b = ll.a(0, var2);
                }
                var2 = il.a((byte) 85, "firetq");
                if (null != var2) {
                  kh.field_K = ll.a(param0 - 96, var2);
                }
                var2 = il.a((byte) 119, "aimtq");
                if (var2 != null) {
                  qk.field_k = ll.a(0, var2);
                }
                var2 = il.a((byte) 90, "aimaccur");
                if (null != var2) {
                  ha.field_m = ll.a(0, var2);
                }
                var2 = il.a((byte) 123, "snapaccur");
                if (null != var2) {
                  ef.field_c = ll.a(0, var2);
                }
                var2 = il.a((byte) 112, "rateoffires,0");
                if (var2 != null) {
                  di.field_h[0] = ll.a(param0 - 96, var2);
                }
                var2 = il.a((byte) 125, "rateoffires,1");
                if (var2 != null) {
                  di.field_h[1] = ll.a(0, var2);
                }
                var2 = il.a((byte) 95, "rateoffires,2");
                if (var2 != null) {
                  di.field_h[2] = ll.a(0, var2);
                }
                var2 = il.a((byte) 74, "rateoffires,3");
                if (null != var2) {
                  di.field_h[3] = ll.a(sl.a((int) param0, 96), var2);
                }
                var2 = il.a((byte) 114, "rateoffires,4");
                if (var2 != null) {
                  di.field_h[4] = ll.a(0, var2);
                }
                var2 = il.a((byte) 96, "recruit");
                if (null != var2) {
                  pj.field_v = ll.a(0, var2);
                }
                var2 = il.a((byte) 100, "shortrecruit");
                if (var2 != null) {
                  pd.field_e = ll.a(param0 - 96, var2);
                }
                var2 = il.a((byte) 90, "warningencum");
                if (null != var2) {
                  og.field_b = ll.a(param0 ^ 96, var2);
                }
                var2 = il.a((byte) 88, "armournames,0");
                if (null != var2) {
                  kh.field_H[0] = ll.a(param0 - 96, var2);
                }
                var2 = il.a((byte) 95, "armournames,1");
                if (null != var2) {
                  kh.field_H[1] = ll.a(sl.a((int) param0, 96), var2);
                }
                var2 = il.a((byte) 93, "armournames,2");
                if (null != var2) {
                  kh.field_H[2] = ll.a(0, var2);
                }
                var2 = il.a((byte) 83, "armournames,3");
                if (var2 != null) {
                  kh.field_H[3] = ll.a(0, var2);
                }
                var2 = il.a((byte) 88, "armourresearchnames,0");
                if (var2 != null) {
                  pf.field_e[0] = ll.a(0, var2);
                }
                var2 = il.a((byte) 124, "armourresearchnames,1");
                if (null != var2) {
                  pf.field_e[1] = ll.a(param0 - 96, var2);
                }
                var2 = il.a((byte) 122, "armourresearchnames,2");
                if (var2 != null) {
                  pf.field_e[2] = ll.a(0, var2);
                }
                var2 = il.a((byte) 91, "armourresearchnames,3");
                if (var2 != null) {
                  pf.field_e[3] = ll.a(0, var2);
                }
                var2 = il.a((byte) 72, "armourdescriptions,0");
                if (null != var2) {
                  bd.field_f[0] = ll.a(0, var2);
                }
                var2 = il.a((byte) 76, "armourdescriptions,1");
                if (null != var2) {
                  bd.field_f[1] = ll.a(0, var2);
                }
                var2 = il.a((byte) 74, "armourdescriptions,2");
                if (var2 != null) {
                  bd.field_f[2] = ll.a(param0 - 96, var2);
                }
                var2 = il.a((byte) 121, "armourdescriptions,3");
                if (null != var2) {
                  bd.field_f[3] = ll.a(sl.a((int) param0, 96), var2);
                }
                var2 = il.a((byte) 82, "armourresearchdescriptions,0");
                if (var2 != null) {
                  jg.field_jb[0] = ll.a(0, var2);
                }
                var2 = il.a((byte) 113, "armourresearchdescriptions,1");
                if (null != var2) {
                  jg.field_jb[1] = ll.a(0, var2);
                }
                var2 = il.a((byte) 111, "armourresearchdescriptions,2");
                if (var2 != null) {
                  jg.field_jb[2] = ll.a(0, var2);
                }
                var2 = il.a((byte) 71, "armourresearchdescriptions,3");
                if (var2 != null) {
                  jg.field_jb[3] = ll.a(param0 - 96, var2);
                }
                var2 = il.a((byte) 88, "weaponnames,0");
                if (var2 != null) {
                  uh.field_L[0] = ll.a(0, var2);
                }
                var2 = il.a((byte) 98, "weaponnames,1");
                if (null != var2) {
                  uh.field_L[1] = ll.a(0, var2);
                }
                var2 = il.a((byte) 126, "weaponnames,2");
                if (var2 != null) {
                  uh.field_L[2] = ll.a(0, var2);
                }
                var2 = il.a((byte) 81, "weaponnames,3");
                if (var2 != null) {
                  uh.field_L[3] = ll.a(0, var2);
                }
                var2 = il.a((byte) 88, "weaponnames,4");
                if (null != var2) {
                  uh.field_L[4] = ll.a(0, var2);
                }
                var2 = il.a((byte) 84, "weaponnames,5");
                if (var2 != null) {
                  uh.field_L[5] = ll.a(sl.a((int) param0, 96), var2);
                }
                var2 = il.a((byte) 95, "weaponnames,6");
                if (var2 != null) {
                  uh.field_L[6] = ll.a(0, var2);
                }
                var2 = il.a((byte) 79, "weaponnames,7");
                if (var2 != null) {
                  uh.field_L[7] = ll.a(0, var2);
                }
                var2 = il.a((byte) 108, "weaponnames,8");
                if (var2 != null) {
                  uh.field_L[8] = ll.a(0, var2);
                }
                var2 = il.a((byte) 73, "weaponnames,9");
                if (var2 != null) {
                  uh.field_L[9] = ll.a(0, var2);
                }
                var2 = il.a((byte) 113, "weaponnames,10");
                if (null != var2) {
                  uh.field_L[10] = ll.a(0, var2);
                }
                var2 = il.a((byte) 101, "weaponnames,11");
                if (var2 != null) {
                  uh.field_L[11] = ll.a(0, var2);
                }
                var2 = il.a((byte) 117, "weaponnames,12");
                if (null != var2) {
                  uh.field_L[12] = ll.a(0, var2);
                }
                var2 = il.a((byte) 117, "weaponnames,13");
                if (null != var2) {
                  uh.field_L[13] = ll.a(sl.a((int) param0, 96), var2);
                }
                var2 = il.a((byte) 100, "weaponnames,14");
                if (var2 != null) {
                  uh.field_L[14] = ll.a(0, var2);
                }
                var2 = il.a((byte) 102, "weaponnames,15");
                if (var2 != null) {
                  uh.field_L[15] = ll.a(0, var2);
                }
                var2 = il.a((byte) 120, "weaponnames,16");
                if (null != var2) {
                  uh.field_L[16] = ll.a(param0 - 96, var2);
                }
                var2 = il.a((byte) 94, "weaponnames,17");
                if (null != var2) {
                  uh.field_L[17] = ll.a(0, var2);
                }
                var2 = il.a((byte) 95, "weaponnames,18");
                if (var2 != null) {
                  uh.field_L[18] = ll.a(0, var2);
                }
                var2 = il.a((byte) 92, "weaponnames,19");
                if (var2 != null) {
                  uh.field_L[19] = ll.a(0, var2);
                }
                var2 = il.a((byte) 110, "weaponnames,20");
                if (null != var2) {
                  uh.field_L[20] = ll.a(0, var2);
                }
                var2 = il.a((byte) 104, "weaponresearchnames,0");
                if (var2 != null) {
                  of.field_h[0] = ll.a(sl.a((int) param0, 96), var2);
                }
                var2 = il.a((byte) 119, "weaponresearchnames,1");
                if (var2 != null) {
                  of.field_h[1] = ll.a(0, var2);
                }
                var2 = il.a((byte) 71, "weaponresearchnames,2");
                if (var2 != null) {
                  of.field_h[2] = ll.a(0, var2);
                }
                var2 = il.a((byte) 125, "weaponresearchnames,3");
                if (null != var2) {
                  of.field_h[3] = ll.a(sl.a((int) param0, 96), var2);
                }
                var2 = il.a((byte) 92, "weaponresearchnames,4");
                if (var2 != null) {
                  of.field_h[4] = ll.a(param0 - 96, var2);
                }
                var2 = il.a((byte) 80, "weaponresearchnames,5");
                if (null != var2) {
                  of.field_h[5] = ll.a(sl.a((int) param0, 96), var2);
                }
                var2 = il.a((byte) 127, "weaponresearchnames,6");
                if (var2 != null) {
                  of.field_h[6] = ll.a(0, var2);
                }
                var2 = il.a((byte) 91, "weaponresearchnames,7");
                if (null != var2) {
                  of.field_h[7] = ll.a(0, var2);
                }
                var2 = il.a((byte) 100, "weaponresearchnames,8");
                if (null != var2) {
                  of.field_h[8] = ll.a(0, var2);
                }
                var2 = il.a((byte) 88, "weaponresearchnames,9");
                if (var2 != null) {
                  of.field_h[9] = ll.a(sl.a((int) param0, 96), var2);
                }
                var2 = il.a((byte) 122, "weaponresearchnames,10");
                if (var2 != null) {
                  of.field_h[10] = ll.a(param0 - 96, var2);
                }
                var2 = il.a((byte) 81, "weaponresearchnames,11");
                if (null != var2) {
                  of.field_h[11] = ll.a(0, var2);
                }
                var2 = il.a((byte) 88, "weaponresearchnames,12");
                if (null != var2) {
                  of.field_h[12] = ll.a(0, var2);
                }
                var2 = il.a((byte) 101, "weaponresearchnames,13");
                if (var2 != null) {
                  of.field_h[13] = ll.a(0, var2);
                }
                var2 = il.a((byte) 75, "weaponresearchnames,14");
                if (var2 != null) {
                  of.field_h[14] = ll.a(0, var2);
                }
                var2 = il.a((byte) 105, "weaponresearchnames,15");
                if (null != var2) {
                  of.field_h[15] = ll.a(param0 - 96, var2);
                }
                var2 = il.a((byte) 99, "weaponresearchnames,16");
                if (var2 != null) {
                  of.field_h[16] = ll.a(0, var2);
                }
                var2 = il.a((byte) 125, "weaponresearchnames,17");
                if (var2 != null) {
                  of.field_h[17] = ll.a(0, var2);
                }
                var2 = il.a((byte) 71, "weaponresearchnames,18");
                if (var2 != null) {
                  of.field_h[18] = ll.a(0, var2);
                }
                var2 = il.a((byte) 95, "weaponresearchnames,19");
                if (null != var2) {
                  of.field_h[19] = ll.a(0, var2);
                }
                var2 = il.a((byte) 94, "weaponresearchnames,20");
                if (null != var2) {
                  of.field_h[20] = ll.a(0, var2);
                }
                var2 = il.a((byte) 97, "weapondescriptions,0");
                if (var2 != null) {
                  i.field_b[0] = ll.a(0, var2);
                }
                var2 = il.a((byte) 101, "weapondescriptions,1");
                if (null != var2) {
                  i.field_b[1] = ll.a(0, var2);
                }
                var2 = il.a((byte) 127, "weapondescriptions,2");
                if (var2 != null) {
                  i.field_b[2] = ll.a(param0 - 96, var2);
                }
                var2 = il.a((byte) 77, "weapondescriptions,3");
                if (var2 != null) {
                  i.field_b[3] = ll.a(param0 - 96, var2);
                }
                var2 = il.a((byte) 87, "weapondescriptions,4");
                if (null != var2) {
                  i.field_b[4] = ll.a(0, var2);
                }
                var2 = il.a((byte) 88, "weapondescriptions,5");
                if (null != var2) {
                  i.field_b[5] = ll.a(0, var2);
                }
                var2 = il.a((byte) 108, "weapondescriptions,6");
                if (null != var2) {
                  i.field_b[6] = ll.a(param0 - 96, var2);
                }
                var2 = il.a((byte) 78, "weapondescriptions,7");
                if (var2 != null) {
                  i.field_b[7] = ll.a(sl.a((int) param0, 96), var2);
                }
                var2 = il.a((byte) 97, "weapondescriptions,8");
                if (var2 != null) {
                  i.field_b[8] = ll.a(sl.a((int) param0, 96), var2);
                }
                var2 = il.a((byte) 97, "weapondescriptions,9");
                if (var2 != null) {
                  i.field_b[9] = ll.a(0, var2);
                }
                var2 = il.a((byte) 102, "weapondescriptions,10");
                if (var2 != null) {
                  i.field_b[10] = ll.a(sl.a((int) param0, 96), var2);
                }
                var2 = il.a((byte) 97, "weapondescriptions,11");
                if (null != var2) {
                  i.field_b[11] = ll.a(sl.a((int) param0, 96), var2);
                }
                var2 = il.a((byte) 97, "weapondescriptions,12");
            }
            void runChunk1() throws java.lang.RuntimeException {
                if (null != var2) {
                  i.field_b[12] = ll.a(0, var2);
                }
                var2 = il.a((byte) 122, "weapondescriptions,13");
                if (var2 != null) {
                  i.field_b[13] = ll.a(sl.a((int) param0, 96), var2);
                }
                var2 = il.a((byte) 120, "weapondescriptions,14");
                if (null != var2) {
                  i.field_b[14] = ll.a(0, var2);
                }
                var2 = il.a((byte) 125, "weapondescriptions,15");
                if (var2 != null) {
                  i.field_b[15] = ll.a(0, var2);
                }
                var2 = il.a((byte) 120, "weapondescriptions,16");
                if (null != var2) {
                  i.field_b[16] = ll.a(0, var2);
                }
                var2 = il.a((byte) 72, "weapondescriptions,17");
                if (null != var2) {
                  i.field_b[17] = ll.a(0, var2);
                }
                var2 = il.a((byte) 73, "weapondescriptions,18");
                if (null != var2) {
                  i.field_b[18] = ll.a(0, var2);
                }
                var2 = il.a((byte) 95, "weapondescriptions,19");
                if (var2 != null) {
                  i.field_b[19] = ll.a(0, var2);
                }
                var2 = il.a((byte) 90, "weapondescriptions,20");
                if (var2 != null) {
                  i.field_b[20] = ll.a(0, var2);
                }
                var2 = il.a((byte) 103, "weaponresearchdescriptions,0");
                if (null != var2) {
                  da.field_i[0] = ll.a(0, var2);
                }
                var2 = il.a((byte) 86, "weaponresearchdescriptions,1");
                if (null != var2) {
                  da.field_i[1] = ll.a(param0 - 96, var2);
                }
                var2 = il.a((byte) 100, "weaponresearchdescriptions,2");
                if (null != var2) {
                  da.field_i[2] = ll.a(0, var2);
                }
                var2 = il.a((byte) 127, "weaponresearchdescriptions,3");
                if (null != var2) {
                  da.field_i[3] = ll.a(0, var2);
                }
                var2 = il.a((byte) 98, "weaponresearchdescriptions,4");
                if (null != var2) {
                  da.field_i[4] = ll.a(sl.a((int) param0, 96), var2);
                }
                var2 = il.a((byte) 72, "weaponresearchdescriptions,5");
                if (var2 != null) {
                  da.field_i[5] = ll.a(0, var2);
                }
                var2 = il.a((byte) 91, "weaponresearchdescriptions,6");
                if (null != var2) {
                  da.field_i[6] = ll.a(0, var2);
                }
                var2 = il.a((byte) 72, "weaponresearchdescriptions,7");
                if (null != var2) {
                  da.field_i[7] = ll.a(0, var2);
                }
                var2 = il.a((byte) 101, "weaponresearchdescriptions,8");
                if (var2 != null) {
                  da.field_i[8] = ll.a(0, var2);
                }
                var2 = il.a((byte) 103, "weaponresearchdescriptions,9");
                if (null != var2) {
                  da.field_i[9] = ll.a(sl.a((int) param0, 96), var2);
                }
                var2 = il.a((byte) 76, "weaponresearchdescriptions,10");
                if (var2 != null) {
                  da.field_i[10] = ll.a(param0 - 96, var2);
                }
                var2 = il.a((byte) 78, "weaponresearchdescriptions,11");
                if (var2 != null) {
                  da.field_i[11] = ll.a(sl.a((int) param0, 96), var2);
                }
                var2 = il.a((byte) 109, "weaponresearchdescriptions,12");
                if (var2 != null) {
                  da.field_i[12] = ll.a(0, var2);
                }
                var2 = il.a((byte) 121, "weaponresearchdescriptions,13");
                if (null != var2) {
                  da.field_i[13] = ll.a(0, var2);
                }
                var2 = il.a((byte) 87, "weaponresearchdescriptions,14");
                if (null != var2) {
                  da.field_i[14] = ll.a(0, var2);
                }
                var2 = il.a((byte) 105, "weaponresearchdescriptions,15");
                if (var2 != null) {
                  da.field_i[15] = ll.a(0, var2);
                }
                var2 = il.a((byte) 83, "weaponresearchdescriptions,16");
                if (null != var2) {
                  da.field_i[16] = ll.a(0, var2);
                }
                var2 = il.a((byte) 88, "weaponresearchdescriptions,17");
                if (null != var2) {
                  da.field_i[17] = ll.a(param0 - 96, var2);
                }
                var2 = il.a((byte) 118, "weaponresearchdescriptions,18");
                if (null != var2) {
                  da.field_i[18] = ll.a(0, var2);
                }
                var2 = il.a((byte) 110, "weaponresearchdescriptions,19");
                if (var2 != null) {
                  da.field_i[19] = ll.a(0, var2);
                }
                var2 = il.a((byte) 123, "weaponresearchdescriptions,20");
                if (var2 != null) {
                  da.field_i[20] = ll.a(0, var2);
                }
                var2 = il.a((byte) 93, "alliedsoldier");
                if (var2 != null) {
                  ig.field_c = ll.a(0, var2);
                }
                var2 = il.a((byte) 115, "instructions0,0");
                if (null != var2) {
                  qd.field_h[0] = ll.a(sl.a((int) param0, 96), var2);
                }
                var2 = il.a((byte) 98, "instructions0,1");
                if (var2 != null) {
                  qd.field_h[1] = ll.a(0, var2);
                }
                var2 = il.a((byte) 87, "instructions0,2");
                if (null != var2) {
                  qd.field_h[2] = ll.a(sl.a((int) param0, 96), var2);
                }
                var2 = il.a((byte) 84, "instructions0,3");
                if (var2 != null) {
                  qd.field_h[3] = ll.a(param0 - 96, var2);
                }
                var2 = il.a((byte) 101, "instructions0,4");
                if (var2 != null) {
                  qd.field_h[4] = ll.a(0, var2);
                }
                var2 = il.a((byte) 72, "instructions0,5");
                if (null != var2) {
                  qd.field_h[5] = ll.a(0, var2);
                }
                var2 = il.a((byte) 109, "instructions0,6");
                if (var2 != null) {
                  qd.field_h[6] = ll.a(param0 - 96, var2);
                }
                var2 = il.a((byte) 97, "instructions1,0");
                if (var2 != null) {
                  nd.field_o[0] = ll.a(0, var2);
                }
                var2 = il.a((byte) 98, "instructions1,1");
                if (var2 != null) {
                  nd.field_o[1] = ll.a(0, var2);
                }
                var2 = il.a((byte) 100, "instructions1,2");
                if (var2 != null) {
                  nd.field_o[2] = ll.a(0, var2);
                }
                var2 = il.a((byte) 94, "instructions1,3");
                if (var2 != null) {
                  nd.field_o[3] = ll.a(0, var2);
                }
                var2 = il.a((byte) 100, "instructions1,4");
                if (var2 != null) {
                  nd.field_o[4] = ll.a(0, var2);
                }
                var2 = il.a((byte) 109, "instructions1,5");
                if (null != var2) {
                  nd.field_o[5] = ll.a(0, var2);
                }
                var2 = il.a((byte) 83, "instructions1,6");
                if (null != var2) {
                  nd.field_o[6] = ll.a(0, var2);
                }
                var2 = il.a((byte) 115, "instructions1,7");
                if (null != var2) {
                  nd.field_o[7] = ll.a(0, var2);
                }
                var2 = il.a((byte) 98, "instructions1,8");
                if (var2 != null) {
                  nd.field_o[8] = ll.a(0, var2);
                }
                var2 = il.a((byte) 90, "instructions1,9");
                if (var2 != null) {
                  nd.field_o[9] = ll.a(0, var2);
                }
                var2 = il.a((byte) 119, "instructions1,10");
                if (null != var2) {
                  nd.field_o[10] = ll.a(0, var2);
                }
                var2 = il.a((byte) 108, "instructions1,11");
                if (null != var2) {
                  nd.field_o[11] = ll.a(0, var2);
                }
                var2 = il.a((byte) 75, "instructions1,12");
                if (null != var2) {
                  nd.field_o[12] = ll.a(0, var2);
                }
                var2 = il.a((byte) 99, "instructions1,13");
                if (null != var2) {
                  nd.field_o[13] = ll.a(0, var2);
                }
                var2 = il.a((byte) 111, "instructions1,14");
                if (var2 != null) {
                  nd.field_o[14] = ll.a(0, var2);
                }
                var2 = il.a((byte) 102, "instructions1,15");
                if (var2 != null) {
                  nd.field_o[15] = ll.a(0, var2);
                }
                var2 = il.a((byte) 94, "instructions2,0");
                if (var2 != null) {
                  mb.field_p[0] = ll.a(0, var2);
                }
                var2 = il.a((byte) 122, "instructions2,1");
                if (null != var2) {
                  mb.field_p[1] = ll.a(0, var2);
                }
                var2 = il.a((byte) 116, "instructions2,2");
                if (var2 != null) {
                  mb.field_p[2] = ll.a(0, var2);
                }
                var2 = il.a((byte) 100, "instructions2,3");
                if (null != var2) {
                  mb.field_p[3] = ll.a(0, var2);
                }
                var2 = il.a((byte) 125, "instructions2,4");
                if (var2 != null) {
                  mb.field_p[4] = ll.a(param0 - 96, var2);
                }
                var2 = il.a((byte) 96, "instructions2,5");
                if (var2 != null) {
                  mb.field_p[5] = ll.a(0, var2);
                }
                var2 = il.a((byte) 82, "instructions2,6");
                if (null != var2) {
                  mb.field_p[6] = ll.a(0, var2);
                }
                var2 = il.a((byte) 92, "instructions3,0");
                if (var2 != null) {
                  dd.field_O[0] = ll.a(0, var2);
                }
                var2 = il.a((byte) 110, "instructions3,1");
                if (var2 != null) {
                  dd.field_O[1] = ll.a(0, var2);
                }
                var2 = il.a((byte) 112, "instructions3,2");
                if (null != var2) {
                  dd.field_O[2] = ll.a(0, var2);
                }
                var2 = il.a((byte) 96, "instructions3,3");
                if (null != var2) {
                  dd.field_O[3] = ll.a(0, var2);
                }
                var2 = il.a((byte) 119, "instructions3,4");
                if (null != var2) {
                  dd.field_O[4] = ll.a(0, var2);
                }
                var2 = il.a((byte) 103, "instructions3,5");
                if (null != var2) {
                  dd.field_O[5] = ll.a(0, var2);
                }
                var2 = il.a((byte) 113, "instructions3,6");
                if (null != var2) {
                  dd.field_O[6] = ll.a(0, var2);
                }
                var2 = il.a((byte) 74, "instructions3,7");
                if (var2 != null) {
                  dd.field_O[7] = ll.a(0, var2);
                }
                var2 = il.a((byte) 93, "instructions3,8");
                if (var2 != null) {
                  dd.field_O[8] = ll.a(0, var2);
                }
                var2 = il.a((byte) 89, "instructions3,9");
                if (null != var2) {
                  dd.field_O[9] = ll.a(0, var2);
                }
                var2 = il.a((byte) 77, "instructions3,10");
                if (var2 != null) {
                  dd.field_O[10] = ll.a(0, var2);
                }
                var2 = il.a((byte) 77, "instructions3,11");
                if (var2 != null) {
                  dd.field_O[11] = ll.a(sl.a((int) param0, 96), var2);
                }
                var2 = il.a((byte) 125, "instructions3,12");
                if (null != var2) {
                  dd.field_O[12] = ll.a(0, var2);
                }
                var2 = il.a((byte) 92, "instructions3,13");
                if (null != var2) {
                  dd.field_O[13] = ll.a(0, var2);
                }
                var2 = il.a((byte) 119, "instructions3,14");
                if (null != var2) {
                  dd.field_O[14] = ll.a(0, var2);
                }
                var2 = il.a((byte) 124, "instructions3,15");
                if (null != var2) {
                  dd.field_O[15] = ll.a(0, var2);
                }
                var2 = il.a((byte) 119, "instructions3,16");
                if (var2 != null) {
                  dd.field_O[16] = ll.a(0, var2);
                }
                var2 = il.a((byte) 119, "instructions4,0");
                if (null != var2) {
                  ij.field_a[0] = ll.a(sl.a((int) param0, 96), var2);
                }
                var2 = il.a((byte) 105, "instructions4,1");
                if (null != var2) {
                  ij.field_a[1] = ll.a(0, var2);
                }
                var2 = il.a((byte) 118, "instructions4,2");
                if (var2 != null) {
                  ij.field_a[2] = ll.a(sl.a((int) param0, 96), var2);
                }
                var2 = il.a((byte) 100, "instructions4,3");
                if (null != var2) {
                  ij.field_a[3] = ll.a(0, var2);
                }
                var2 = il.a((byte) 114, "instructions4,4");
                if (null != var2) {
                  ij.field_a[4] = ll.a(0, var2);
                }
                var2 = il.a((byte) 102, "instructions4,5");
                if (null != var2) {
                  ij.field_a[5] = ll.a(0, var2);
                }
                var2 = il.a((byte) 104, "instructions4,6");
                if (null != var2) {
                  ij.field_a[6] = ll.a(0, var2);
                }
                var2 = il.a((byte) 83, "instructions5,0");
                if (var2 != null) {
                  oi.field_M[0] = ll.a(0, var2);
                }
                var2 = il.a((byte) 121, "instructions5,1");
                if (var2 != null) {
                  oi.field_M[1] = ll.a(sl.a((int) param0, 96), var2);
                }
                var2 = il.a((byte) 103, "instructions5,2");
                if (var2 != null) {
                  oi.field_M[2] = ll.a(0, var2);
                }
                var2 = il.a((byte) 123, "instructions5,3");
                if (null != var2) {
                  oi.field_M[3] = ll.a(0, var2);
                }
                var2 = il.a((byte) 95, "instructions6,0");
                if (null != var2) {
                  k.field_d[0] = ll.a(0, var2);
                }
                var2 = il.a((byte) 72, "instructions6,1");
                if (var2 != null) {
                  k.field_d[1] = ll.a(0, var2);
                }
                var2 = il.a((byte) 76, "instructions6,2");
                if (null != var2) {
                  k.field_d[2] = ll.a(param0 - 96, var2);
                }
                var2 = il.a((byte) 117, "instructions6,3");
                if (null != var2) {
                  k.field_d[3] = ll.a(0, var2);
                }
                var2 = il.a((byte) 105, "instructions6,4");
                if (null != var2) {
                  k.field_d[4] = ll.a(0, var2);
                }
                var2 = il.a((byte) 114, "instructions6,5");
                if (var2 != null) {
                  k.field_d[5] = ll.a(sl.a((int) param0, 96), var2);
                }
                var2 = il.a((byte) 85, "instructions7,0");
                if (null != var2) {
                  o.field_a[0] = ll.a(sl.a((int) param0, 96), var2);
                }
                var2 = il.a((byte) 121, "instructions7,1");
                if (null != var2) {
                  o.field_a[1] = ll.a(0, var2);
                }
                var2 = il.a((byte) 115, "instructions7,2");
                if (var2 != null) {
                  o.field_a[2] = ll.a(0, var2);
                }
                var2 = il.a((byte) 120, "instructions7,3");
                if (null != var2) {
                  o.field_a[3] = ll.a(0, var2);
                }
                var2 = il.a((byte) 100, "instructions7,4");
                if (var2 != null) {
                  o.field_a[4] = ll.a(param0 - 96, var2);
                }
                var2 = il.a((byte) 76, "instructions7,5");
                if (var2 != null) {
                  o.field_a[5] = ll.a(0, var2);
                }
                var2 = il.a((byte) 99, "instructions8,0");
                if (null != var2) {
                  vb.field_f[0] = ll.a(0, var2);
                }
                var2 = il.a((byte) 113, "instructions8,1");
                if (null != var2) {
                  vb.field_f[1] = ll.a(0, var2);
                }
                var2 = il.a((byte) 113, "instructions8,2");
                if (null != var2) {
                  vb.field_f[2] = ll.a(0, var2);
                }
                var2 = il.a((byte) 118, "instructions8,3");
                if (null != var2) {
                  vb.field_f[3] = ll.a(0, var2);
                }
                var2 = il.a((byte) 80, "instructions8,4");
                if (var2 != null) {
                  vb.field_f[4] = ll.a(sl.a((int) param0, 96), var2);
                }
                var2 = il.a((byte) 91, "instructions8,5");
                if (var2 != null) {
                  vb.field_f[5] = ll.a(0, var2);
                }
                var2 = il.a((byte) 106, "instructions8,6");
                if (var2 != null) {
                  vb.field_f[6] = ll.a(0, var2);
                }
                var2 = il.a((byte) 111, "instructions8,7");
                if (var2 != null) {
                  vb.field_f[7] = ll.a(0, var2);
                }
                var2 = il.a((byte) 108, "instructions8,8");
                if (null != var2) {
                  vb.field_f[8] = ll.a(0, var2);
                }
                var2 = il.a((byte) 110, "instructions8,9");
                if (var2 != null) {
                  vb.field_f[9] = ll.a(0, var2);
                }
                var2 = il.a((byte) 90, "instructions8,10");
                if (null != var2) {
                  vb.field_f[10] = ll.a(0, var2);
                }
                var2 = il.a((byte) 105, "instructions8,11");
                if (var2 != null) {
                  vb.field_f[11] = ll.a(0, var2);
                }
                var2 = il.a((byte) 107, "instructions8,12");
                if (var2 != null) {
                  vb.field_f[12] = ll.a(0, var2);
                }
                var2 = il.a((byte) 112, "instructions8,13");
                if (null != var2) {
                  vb.field_f[13] = ll.a(sl.a((int) param0, 96), var2);
                }
                var2 = il.a((byte) 97, "instructions8,14");
                if (var2 != null) {
                  vb.field_f[14] = ll.a(0, var2);
                }
                var2 = il.a((byte) 85, "instructions8,15");
                if (null != var2) {
                  vb.field_f[15] = ll.a(param0 - 96, var2);
                }
                var2 = il.a((byte) 100, "instructions8,16");
                if (var2 != null) {
                  vb.field_f[16] = ll.a(0, var2);
                }
                var2 = il.a((byte) 80, "instructions8,17");
                if (var2 != null) {
                  vb.field_f[17] = ll.a(0, var2);
                }
                var2 = il.a((byte) 87, "instructions8,18");
                if (var2 != null) {
                  vb.field_f[18] = ll.a(0, var2);
                }
                var2 = il.a((byte) 125, "noresearchfac");
                if (var2 != null) {
                  r.field_kb = ll.a(param0 - 96, var2);
                }
                var2 = il.a((byte) 84, "noresearchres");
                if (null != var2) {
                  jc.field_E = ll.a(0, var2);
                }
                var2 = il.a((byte) 108, "corporal");
                if (null != var2) {
                  og.field_g = ll.a(0, var2);
                }
                var2 = il.a((byte) 114, "sergeant");
                if (null != var2) {
                  wj.field_d = ll.a(param0 ^ 96, var2);
                }
                var2 = il.a((byte) 86, "captain");
                if (null != var2) {
                  cf.field_c = ll.a(param0 ^ 96, var2);
                }
                var2 = il.a((byte) 82, "benefits_in,0");
                if (null != var2) {
                  dc.field_e[0] = ll.a(sl.a((int) param0, 96), var2);
                }
                var2 = il.a((byte) 105, "benefits_in,1");
                if (var2 != null) {
                  dc.field_e[1] = ll.a(param0 - 96, var2);
                }
                var2 = il.a((byte) 116, "benefits_in,2");
                if (var2 != null) {
                  dc.field_e[2] = ll.a(0, var2);
                }
                var2 = il.a((byte) 77, "benefits_in,3");
                if (var2 != null) {
                  dc.field_e[3] = ll.a(0, var2);
                }
                var2 = il.a((byte) 95, "benefits_in,4");
                if (var2 != null) {
                  dc.field_e[4] = ll.a(0, var2);
                }
                var2 = il.a((byte) 103, "benefits_in,5");
                if (null != var2) {
                  dc.field_e[5] = ll.a(0, var2);
                }
                var2 = il.a((byte) 91, "GameName");
                if (var2 != null) {
                  b.field_c = ll.a(0, var2);
                }
                var2 = il.a((byte) 116, "down_a_mission");
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = il.a((byte) 91, "up_a_mission");
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = il.a((byte) 117, "T_I_T_L_E");
                if (null != var2) {
                  cc.field_l = ll.a(param0 ^ 96, var2);
                }
                var2 = il.a((byte) 78, "_1000pts");
                if (null != var2) {
                  jm.field_e = ll.a(0, var2);
                }
                var2 = il.a((byte) 102, "_2500pts");
                if (null != var2) {
                  mb.field_u = ll.a(0, var2);
                }
                var2 = il.a((byte) 110, "_3000pts");
                if (var2 != null) {
                  ee.field_N = ll.a(param0 ^ 96, var2);
                }
                var2 = il.a((byte) 118, "_5000pts");
                if (null != var2) {
                  fh.field_l = ll.a(param0 ^ 96, var2);
                }
                var2 = il.a((byte) 94, "_6000pts");
                if (null != var2) {
                  c.field_c = ll.a(0, var2);
                }
                var2 = il.a((byte) 106, "_10000pts");
                if (var2 != null) {
                  oa.field_b = ll.a(0, var2);
                }
                var2 = il.a((byte) 76, "_25000pts");
                if (var2 != null) {
                  bj.field_a = ll.a(param0 - 96, var2);
                }
                var2 = il.a((byte) 111, "Vigilante");
                if (null != var2) {
                  ab.field_h = ll.a(0, var2);
                }
                var2 = il.a((byte) 121, "Squiddy");
                if (null != var2) {
                  ab.field_j = ll.a(0, var2);
                }
                var2 = il.a((byte) 123, "Grunt_with_armour");
                if (null != var2) {
                  kk.field_c = ll.a(0, var2);
                }
                var2 = il.a((byte) 112, "Squiddy_with_shield");
                if (var2 != null) {
                  gm.field_a = ll.a(0, var2);
                }
                var2 = il.a((byte) 89, "Grunt_with_shielded_armour");
                if (var2 != null) {
                  qe.field_g = ll.a(0, var2);
                }
                var2 = il.a((byte) 104, "Squiddy_with_shielded_armour");
                if (null != var2) {
                  fa.field_c = ll.a(0, var2);
                }
                var2 = il.a((byte) 92, "Squiddy_Commander");
                if (var2 != null) {
                  qd.field_j = ll.a(0, var2);
                }
                var2 = il.a((byte) 120, "Soldier");
                if (null != var2) {
                  vh.field_n = ll.a(0, var2);
                }
                var2 = il.a((byte) 116, "Turret");
                if (var2 != null) {
                  qk.field_g = ll.a(0, var2);
                }
                var2 = il.a((byte) 90, "Zombie");
                if (null != var2) {
                  tb.field_x = ll.a(0, var2);
                }
                var2 = il.a((byte) 96, "Soldier_A");
                if (null != var2) {
                  ah.field_C = ll.a(0, var2);
                }
                var2 = il.a((byte) 80, "Kenetic_projection_armour");
                if (var2 != null) {
                  qe.field_j = ll.a(param0 - 96, var2);
                }
                var2 = il.a((byte) 71, "Alien_scale_mail");
                if (var2 != null) {
                  th.field_e = ll.a(0, var2);
                }
                var2 = il.a((byte) 124, "Body_Defence_Armour");
                if (var2 != null) {
                  uj.field_e = ll.a(0, var2);
                }
                var2 = il.a((byte) 89, "MODELNAME_PISTOL");
                if (var2 != null) {
                  df.field_M = ll.a(0, var2);
                }
                var2 = il.a((byte) 105, "MODELNAME_SHOTGUN");
                if (var2 != null) {
                  ml.field_r = ll.a(0, var2);
                }
                var2 = il.a((byte) 95, "MODELNAME_RIFLE");
                if (var2 != null) {
                  sa.field_a = ll.a(0, var2);
                }
                var2 = il.a((byte) 89, "MODELNAME_SMG");
                if (var2 != null) {
                  sd.field_a = ll.a(0, var2);
                }
                var2 = il.a((byte) 96, "MODELNAME_LMG");
                if (null != var2) {
                  vc.field_b = ll.a(0, var2);
                }
                var2 = il.a((byte) 74, "MODELNAME_RPG");
                if (null != var2) {
                  k.field_a = ll.a(0, var2);
                }
                var2 = il.a((byte) 121, "MODELNAME_GRENADE");
                if (var2 != null) {
                  dm.field_e = ll.a(0, var2);
                }
                var2 = il.a((byte) 125, "MODELNAME_EXPLAS");
                if (null != var2) {
                  ab.field_m = ll.a(0, var2);
                }
                var2 = il.a((byte) 113, "MODELNAME_LASGUN");
                if (null != var2) {
                  fc.field_j = ll.a(0, var2);
                }
                var2 = il.a((byte) 114, "MODELNAME_PULPIS");
                if (null != var2) {
                  hh.field_p = ll.a(0, var2);
                }
                var2 = il.a((byte) 92, "MODELNAME_PULGUN");
                if (null != var2) {
                  ij.field_c = ll.a(param0 - 96, var2);
                }
                var2 = il.a((byte) 95, "MODELNAME_PULGREN");
                if (null != var2) {
                  bb.field_h = ll.a(param0 ^ 96, var2);
                }
                var2 = il.a((byte) 126, "MODELNAME_PULRIF");
                if (var2 != null) {
                  kh.field_O = ll.a(0, var2);
                }
                var2 = il.a((byte) 83, "MODELNAME_FUSPIS");
                if (null != var2) {
                  kf.field_a = ll.a(0, var2);
                }
                var2 = il.a((byte) 105, "MODELNAME_FUSGUN");
                if (null != var2) {
                  jh.field_k = ll.a(0, var2);
                }
                var2 = il.a((byte) 81, "MODELNAME_FUSCAN");
                if (var2 != null) {
                  wl.field_y = ll.a(param0 ^ 96, var2);
                }
                var2 = il.a((byte) 90, "MODELNAME_FUSLAU");
                if (null != var2) {
                  wa.field_q = ll.a(0, var2);
                }
                var2 = il.a((byte) 107, "MODELNAME_FUSRIF");
                if (null != var2) {
                  sa.field_b = ll.a(0, var2);
                }
                var2 = il.a((byte) 74, "MODELNAME_SHIELD");
                if (null != var2) {
                  kd.field_a = ll.a(param0 - 96, var2);
                }
                var2 = il.a((byte) 110, "exitdebrief");
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = il.a((byte) 113, "capsmission");
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = il.a((byte) 89, "mission_no");
                if (null != var2) {
                  kh.field_L = ll.a(param0 ^ 96, var2);
                }
                var2 = il.a((byte) 90, "missionnames,0");
                if (var2 != null) {
                  p.field_f[0] = ll.a(0, var2);
                }
                var2 = il.a((byte) 113, "missionnames,1");
                if (null != var2) {
                  p.field_f[1] = ll.a(0, var2);
                }
                var2 = il.a((byte) 106, "missionnames,2");
                if (null != var2) {
                  p.field_f[2] = ll.a(0, var2);
                }
                var2 = il.a((byte) 72, "missionnames,3");
                if (null != var2) {
                  p.field_f[3] = ll.a(0, var2);
                }
                var2 = il.a((byte) 76, "missionnames,4");
                if (var2 != null) {
                  p.field_f[4] = ll.a(0, var2);
                }
                var2 = il.a((byte) 71, "missionnames,5");
                if (null != var2) {
                  p.field_f[5] = ll.a(0, var2);
                }
                var2 = il.a((byte) 118, "missionnames,6");
                if (null != var2) {
                  p.field_f[6] = ll.a(0, var2);
                }
                var2 = il.a((byte) 77, "missionnames,7");
                if (var2 != null) {
                  p.field_f[7] = ll.a(0, var2);
                }
                var2 = il.a((byte) 117, "missionnames,8");
                if (null != var2) {
                  p.field_f[8] = ll.a(0, var2);
                }
                var2 = il.a((byte) 95, "missionnames,9");
                if (null != var2) {
                  p.field_f[9] = ll.a(0, var2);
                }
                var2 = il.a((byte) 105, "missionnames,10");
                if (var2 != null) {
                  p.field_f[10] = ll.a(0, var2);
                }
                var2 = il.a((byte) 121, "missionnames,11");
                if (var2 != null) {
                  p.field_f[11] = ll.a(0, var2);
                }
                var2 = il.a((byte) 113, "missionnames,12");
                if (var2 != null) {
                  p.field_f[12] = ll.a(sl.a((int) param0, 96), var2);
                }
                var2 = il.a((byte) 105, "missionnames,13");
                if (var2 != null) {
                  p.field_f[13] = ll.a(0, var2);
                }
                var2 = il.a((byte) 104, "missionnames,14");
                if (null != var2) {
                  p.field_f[14] = ll.a(sl.a((int) param0, 96), var2);
                }
                var2 = il.a((byte) 110, "yaysuccess");
                if (var2 != null) {
                  hm.field_J = ll.a(0, var2);
                }
                var2 = il.a((byte) 88, "boofailed");
                if (null != var2) {
                  sk.field_a = ll.a(param0 - 96, var2);
                }
                var2 = il.a((byte) 98, "debriefstrings,0");
                if (var2 != null) {
                  pe.field_c[0] = ll.a(param0 - 96, var2);
                }
                var2 = il.a((byte) 76, "debriefstrings,1");
                if (null != var2) {
                  pe.field_c[1] = ll.a(0, var2);
                }
                var2 = il.a((byte) 122, "debriefstrings,2");
                if (var2 != null) {
                  pe.field_c[2] = ll.a(0, var2);
                }
                var2 = il.a((byte) 76, "debriefstrings,3");
                if (null != var2) {
                  pe.field_c[3] = ll.a(0, var2);
                }
                var2 = il.a((byte) 80, "debriefstrings,4");
                if (null != var2) {
                  pe.field_c[4] = ll.a(0, var2);
                }
                var2 = il.a((byte) 108, "debriefstrings,5");
                if (var2 != null) {
                  pe.field_c[5] = ll.a(sl.a((int) param0, 96), var2);
                }
                var2 = il.a((byte) 86, "debriefstrings,6");
                if (var2 != null) {
                  pe.field_c[6] = ll.a(0, var2);
                }
                var2 = il.a((byte) 88, "debriefstrings,7");
                if (null != var2) {
                  pe.field_c[7] = ll.a(0, var2);
                }
                var2 = il.a((byte) 77, "debriefstrings,8");
                if (null != var2) {
                  pe.field_c[8] = ll.a(0, var2);
                }
                var2 = il.a((byte) 91, "debriefstrings,9");
                if (var2 != null) {
                  pe.field_c[9] = ll.a(0, var2);
                }
                var2 = il.a((byte) 98, "debriefstrings,10");
                if (var2 != null) {
                  pe.field_c[10] = ll.a(param0 - 96, var2);
                }
                var2 = il.a((byte) 119, "debriefstrings,11");
                if (var2 != null) {
                  pe.field_c[11] = ll.a(0, var2);
                }
                var2 = il.a((byte) 100, "debriefstrings,12");
                if (null != var2) {
                  pe.field_c[12] = ll.a(0, var2);
                }
                var2 = il.a((byte) 98, "debriefstrings,13");
                if (var2 != null) {
                  pe.field_c[13] = ll.a(param0 - 96, var2);
                }
                var2 = il.a((byte) 75, "debriefstrings,14");
                if (var2 != null) {
                  pe.field_c[14] = ll.a(0, var2);
                }
                var2 = il.a((byte) 103, "debriefstrings,15");
                if (null != var2) {
                  pe.field_c[15] = ll.a(0, var2);
                }
                var2 = il.a((byte) 82, "debriefstrings,16");
                if (null != var2) {
                  pe.field_c[16] = ll.a(0, var2);
                }
                var2 = il.a((byte) 74, "debriefstrings,17");
                if (null != var2) {
                  pe.field_c[17] = ll.a(param0 - 96, var2);
                }
                var2 = il.a((byte) 107, "debriefstrings,18");
                if (var2 != null) {
                  pe.field_c[18] = ll.a(0, var2);
                }
                var2 = il.a((byte) 93, "debriefstrings,19");
                if (var2 != null) {
                  pe.field_c[19] = ll.a(0, var2);
                }
                var2 = il.a((byte) 114, "debriefstrings,20");
                if (null != var2) {
                  pe.field_c[20] = ll.a(sl.a((int) param0, 96), var2);
                }
                var2 = il.a((byte) 95, "debriefstrings,21");
                if (null != var2) {
                  pe.field_c[21] = ll.a(0, var2);
                }
                var2 = il.a((byte) 99, "debriefstrings,22");
                if (null != var2) {
                  pe.field_c[22] = ll.a(0, var2);
                }
                var2 = il.a((byte) 71, "debriefstrings,23");
            }
            void runChunk2() throws java.lang.RuntimeException {
                if (var2 != null) {
                  pe.field_c[23] = ll.a(0, var2);
                }
                var2 = il.a((byte) 85, "debriefstrings,24");
                if (null != var2) {
                  pe.field_c[24] = ll.a(param0 - 96, var2);
                }
                var2 = il.a((byte) 87, "debriefstrings,25");
                if (var2 != null) {
                  pe.field_c[25] = ll.a(0, var2);
                }
                var2 = il.a((byte) 127, "debriefstrings,26");
                if (null != var2) {
                  pe.field_c[26] = ll.a(0, var2);
                }
                var2 = il.a((byte) 75, "debriefstrings,27");
                if (null != var2) {
                  pe.field_c[27] = ll.a(param0 - 96, var2);
                }
                var2 = il.a((byte) 117, "debriefstrings,28");
                if (var2 != null) {
                  pe.field_c[28] = ll.a(0, var2);
                }
                var2 = il.a((byte) 96, "briefstrings,0");
                if (var2 != null) {
                  ic.field_x[0] = ll.a(0, var2);
                }
                var2 = il.a((byte) 73, "briefstrings,1");
                if (var2 != null) {
                  ic.field_x[1] = ll.a(0, var2);
                }
                var2 = il.a((byte) 107, "briefstrings,2");
                if (null != var2) {
                  ic.field_x[2] = ll.a(0, var2);
                }
                var2 = il.a((byte) 120, "briefstrings,3");
                if (null != var2) {
                  ic.field_x[3] = ll.a(0, var2);
                }
                var2 = il.a((byte) 106, "briefstrings,4");
                if (null != var2) {
                  ic.field_x[4] = ll.a(0, var2);
                }
                var2 = il.a((byte) 118, "briefstrings,5");
                if (null != var2) {
                  ic.field_x[5] = ll.a(0, var2);
                }
                var2 = il.a((byte) 95, "briefstrings,6");
                if (var2 != null) {
                  ic.field_x[6] = ll.a(sl.a((int) param0, 96), var2);
                }
                var2 = il.a((byte) 80, "briefstrings,7");
                if (null != var2) {
                  ic.field_x[7] = ll.a(0, var2);
                }
                var2 = il.a((byte) 110, "briefstrings,8");
                if (var2 != null) {
                  ic.field_x[8] = ll.a(0, var2);
                }
                var2 = il.a((byte) 120, "briefstrings,9");
                if (var2 != null) {
                  ic.field_x[9] = ll.a(0, var2);
                }
                var2 = il.a((byte) 96, "briefstrings,10");
                if (null != var2) {
                  ic.field_x[10] = ll.a(0, var2);
                }
                var2 = il.a((byte) 98, "briefstrings,11");
                if (null != var2) {
                  ic.field_x[11] = ll.a(0, var2);
                }
                var2 = il.a((byte) 92, "briefstrings,12");
                if (null != var2) {
                  ic.field_x[12] = ll.a(param0 - 96, var2);
                }
                var2 = il.a((byte) 71, "briefstrings,13");
                if (null != var2) {
                  ic.field_x[13] = ll.a(0, var2);
                }
                var2 = il.a((byte) 127, "briefstrings,14");
                if (var2 != null) {
                  ic.field_x[14] = ll.a(0, var2);
                }
                var2 = il.a((byte) 80, "briefstrings,15");
                if (null != var2) {
                  ic.field_x[15] = ll.a(0, var2);
                }
                var2 = il.a((byte) 111, "briefstrings,16");
                if (var2 != null) {
                  ic.field_x[16] = ll.a(sl.a((int) param0, 96), var2);
                }
                var2 = il.a((byte) 112, "briefstrings,17");
                if (var2 != null) {
                  ic.field_x[17] = ll.a(sl.a((int) param0, 96), var2);
                }
                var2 = il.a((byte) 90, "briefstrings,18");
                if (var2 != null) {
                  ic.field_x[18] = ll.a(0, var2);
                }
                var2 = il.a((byte) 83, "briefstrings,19");
                if (var2 != null) {
                  ic.field_x[19] = ll.a(0, var2);
                }
                var2 = il.a((byte) 109, "briefstrings,20");
                if (var2 != null) {
                  ic.field_x[20] = ll.a(sl.a((int) param0, 96), var2);
                }
                var2 = il.a((byte) 97, "briefstrings,21");
                if (var2 != null) {
                  ic.field_x[21] = ll.a(0, var2);
                }
                var2 = il.a((byte) 102, "briefstrings,22");
                if (null != var2) {
                  ic.field_x[22] = ll.a(0, var2);
                }
                var2 = il.a((byte) 97, "briefstrings,23");
                if (null != var2) {
                  ic.field_x[23] = ll.a(0, var2);
                }
                var2 = il.a((byte) 116, "briefstrings,24");
                if (null != var2) {
                  ic.field_x[24] = ll.a(0, var2);
                }
                var2 = il.a((byte) 99, "briefstrings,25");
                if (null != var2) {
                  ic.field_x[25] = ll.a(sl.a((int) param0, 96), var2);
                }
                var2 = il.a((byte) 104, "briefstrings,26");
                if (var2 != null) {
                  ic.field_x[26] = ll.a(param0 - 96, var2);
                }
                var2 = il.a((byte) 86, "briefstrings,27");
                if (null != var2) {
                  ic.field_x[27] = ll.a(0, var2);
                }
                var2 = il.a((byte) 101, "briefstrings,28");
                if (var2 != null) {
                  ic.field_x[28] = ll.a(0, var2);
                }
                var2 = il.a((byte) 80, "briefstrings,29");
                if (null != var2) {
                  ic.field_x[29] = ll.a(0, var2);
                }
                var2 = il.a((byte) 78, "briefstrings,30");
                if (var2 != null) {
                  ic.field_x[30] = ll.a(0, var2);
                }
                var2 = il.a((byte) 71, "briefstrings,31");
                if (null != var2) {
                  ic.field_x[31] = ll.a(sl.a((int) param0, 96), var2);
                }
                var2 = il.a((byte) 95, "briefstrings,32");
                if (null != var2) {
                  ic.field_x[32] = ll.a(0, var2);
                }
                var2 = il.a((byte) 93, "briefstrings,33");
                if (null != var2) {
                  ic.field_x[33] = ll.a(param0 - 96, var2);
                }
                var2 = il.a((byte) 121, "briefstrings,34");
                if (var2 != null) {
                  ic.field_x[34] = ll.a(0, var2);
                }
                var2 = il.a((byte) 96, "briefstrings,35");
                if (var2 != null) {
                  ic.field_x[35] = ll.a(0, var2);
                }
                var2 = il.a((byte) 88, "briefstrings,36");
                if (var2 != null) {
                  ic.field_x[36] = ll.a(0, var2);
                }
                var2 = il.a((byte) 82, "briefstrings,37");
                if (var2 != null) {
                  ic.field_x[37] = ll.a(sl.a((int) param0, 96), var2);
                }
                var2 = il.a((byte) 89, "briefstrings,38");
                if (null != var2) {
                  ic.field_x[38] = ll.a(sl.a((int) param0, 96), var2);
                }
                var2 = il.a((byte) 73, "briefstrings,39");
                if (null != var2) {
                  ic.field_x[39] = ll.a(0, var2);
                }
                var2 = il.a((byte) 118, "briefstrings,40");
                if (var2 != null) {
                  ic.field_x[40] = ll.a(sl.a((int) param0, 96), var2);
                }
                var2 = il.a((byte) 97, "briefstrings,41");
                if (null != var2) {
                  ic.field_x[41] = ll.a(0, var2);
                }
                var2 = il.a((byte) 126, "briefstrings,42");
                if (null != var2) {
                  ic.field_x[42] = ll.a(param0 - 96, var2);
                }
                var2 = il.a((byte) 112, "briefstrings,43");
                if (var2 != null) {
                  ic.field_x[43] = ll.a(0, var2);
                }
                var2 = il.a((byte) 72, "briefstrings,44");
                if (var2 != null) {
                  ic.field_x[44] = ll.a(param0 - 96, var2);
                }
                var2 = il.a((byte) 124, "briefstrings,45");
                if (var2 != null) {
                  ic.field_x[45] = ll.a(0, var2);
                }
                var2 = il.a((byte) 126, "briefstrings,46");
                if (var2 != null) {
                  ic.field_x[46] = ll.a(0, var2);
                }
                var2 = il.a((byte) 81, "briefstrings,47");
                if (null != var2) {
                  ic.field_x[47] = ll.a(sl.a((int) param0, 96), var2);
                }
                var2 = il.a((byte) 85, "briefstrings,48");
                if (null != var2) {
                  ic.field_x[48] = ll.a(param0 - 96, var2);
                }
                var2 = il.a((byte) 103, "briefstrings,49");
                if (null != var2) {
                  ic.field_x[49] = ll.a(0, var2);
                }
                var2 = il.a((byte) 83, "briefstrings,50");
                if (null != var2) {
                  ic.field_x[50] = ll.a(0, var2);
                }
                var2 = il.a((byte) 98, "briefstrings,51");
                if (var2 != null) {
                  ic.field_x[51] = ll.a(0, var2);
                }
                var2 = il.a((byte) 112, "briefstrings,52");
                if (var2 != null) {
                  ic.field_x[52] = ll.a(0, var2);
                }
                var2 = il.a((byte) 102, "briefstrings,53");
                if (null != var2) {
                  ic.field_x[53] = ll.a(param0 - 96, var2);
                }
                var2 = il.a((byte) 81, "briefstrings,54");
                if (var2 != null) {
                  ic.field_x[54] = ll.a(param0 - 96, var2);
                }
                var2 = il.a((byte) 95, "briefstrings,55");
                if (var2 != null) {
                  ic.field_x[55] = ll.a(0, var2);
                }
                var2 = il.a((byte) 112, "briefstrings,56");
                if (null != var2) {
                  ic.field_x[56] = ll.a(0, var2);
                }
                var2 = il.a((byte) 79, "briefstrings,57");
                if (var2 != null) {
                  ic.field_x[57] = ll.a(param0 - 96, var2);
                }
                var2 = il.a((byte) 104, "briefstrings,58");
                if (null != var2) {
                  ic.field_x[58] = ll.a(0, var2);
                }
                var2 = il.a((byte) 73, "briefstrings,59");
                if (var2 != null) {
                  ic.field_x[59] = ll.a(0, var2);
                }
                var2 = il.a((byte) 94, "briefstrings,60");
                if (null != var2) {
                  ic.field_x[60] = ll.a(sl.a((int) param0, 96), var2);
                }
                var2 = il.a((byte) 95, "briefstrings,61");
                if (var2 != null) {
                  ic.field_x[61] = ll.a(0, var2);
                }
                var2 = il.a((byte) 79, "briefstrings,62");
                if (null != var2) {
                  ic.field_x[62] = ll.a(0, var2);
                }
                var2 = il.a((byte) 110, "briefstrings,63");
                if (var2 != null) {
                  ic.field_x[63] = ll.a(0, var2);
                }
                var2 = il.a((byte) 77, "briefstrings,64");
                if (var2 != null) {
                  ic.field_x[64] = ll.a(0, var2);
                }
                var2 = il.a((byte) 113, "briefstrings,65");
                if (var2 != null) {
                  ic.field_x[65] = ll.a(0, var2);
                }
                var2 = il.a((byte) 84, "briefstrings,66");
                if (var2 != null) {
                  ic.field_x[66] = ll.a(0, var2);
                }
                var2 = il.a((byte) 112, "briefstrings,67");
                if (var2 != null) {
                  ic.field_x[67] = ll.a(0, var2);
                }
                var2 = il.a((byte) 105, "briefstrings,68");
                if (var2 != null) {
                  ic.field_x[68] = ll.a(param0 - 96, var2);
                }
                var2 = il.a((byte) 108, "briefstrings,69");
                if (var2 != null) {
                  ic.field_x[69] = ll.a(0, var2);
                }
                var2 = il.a((byte) 74, "briefstrings,70");
                if (null != var2) {
                  ic.field_x[70] = ll.a(0, var2);
                }
                var2 = il.a((byte) 102, "briefstrings,71");
                if (null != var2) {
                  ic.field_x[71] = ll.a(param0 - 96, var2);
                }
                var2 = il.a((byte) 91, "briefstrings,72");
                if (null != var2) {
                  ic.field_x[72] = ll.a(0, var2);
                }
                var2 = il.a((byte) 95, "briefstrings,73");
                if (null != var2) {
                  ic.field_x[73] = ll.a(0, var2);
                }
                var2 = il.a((byte) 106, "briefstrings,74");
                if (null != var2) {
                  ic.field_x[74] = ll.a(sl.a((int) param0, 96), var2);
                }
                var2 = il.a((byte) 100, "briefstrings,75");
                if (null != var2) {
                  ic.field_x[75] = ll.a(sl.a((int) param0, 96), var2);
                }
                var2 = il.a((byte) 102, "briefstrings,76");
                if (null != var2) {
                  ic.field_x[76] = ll.a(param0 - 96, var2);
                }
                var2 = il.a((byte) 72, "briefstrings,77");
                if (null != var2) {
                  ic.field_x[77] = ll.a(0, var2);
                }
                var2 = il.a((byte) 104, "briefstrings,78");
                if (var2 != null) {
                  ic.field_x[78] = ll.a(0, var2);
                }
                var2 = il.a((byte) 90, "briefstrings,79");
                if (null != var2) {
                  ic.field_x[79] = ll.a(0, var2);
                }
                var2 = il.a((byte) 94, "briefstrings,80");
                if (null != var2) {
                  ic.field_x[80] = ll.a(0, var2);
                }
                var2 = il.a((byte) 126, "briefstrings,81");
                if (var2 != null) {
                  ic.field_x[81] = ll.a(0, var2);
                }
                var2 = il.a((byte) 79, "diffeasy");
                if (var2 != null) {
                  gl.field_i = ll.a(0, var2);
                }
                var2 = il.a((byte) 116, "diffnorm");
                if (var2 != null) {
                  ta.field_b = ll.a(0, var2);
                }
                var2 = il.a((byte) 115, "diffhard");
                if (var2 != null) {
                  bi.field_a = ll.a(0, var2);
                }
                var2 = il.a((byte) 109, "actI");
                if (var2 != null) {
                  sb.field_n = ll.a(param0 - 96, var2);
                }
                var2 = il.a((byte) 99, "actII");
                if (null != var2) {
                  ah.field_D = ll.a(0, var2);
                }
                var2 = il.a((byte) 124, "actIII");
                if (var2 != null) {
                  lk.field_b = ll.a(0, var2);
                }
                var2 = il.a((byte) 78, "actIV");
                if (var2 != null) {
                  va.field_h = ll.a(0, var2);
                }
                var2 = il.a((byte) 102, "startnewgame");
                if (var2 != null) {
                  ij.field_e = ll.a(0, var2);
                }
                var2 = il.a((byte) 73, "continuesavedgame");
                if (var2 != null) {
                  qc.field_e = ll.a(0, var2);
                }
                var2 = il.a((byte) 85, "continuesavedgame2");
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = il.a((byte) 89, "quittomain");
                if (var2 != null) {
                  fc.field_g = ll.a(0, var2);
                }
                var2 = il.a((byte) 123, "abortmission");
                if (var2 != null) {
                  je.field_b = ll.a(param0 ^ 96, var2);
                }
                var2 = il.a((byte) 106, "nohighscores");
                if (var2 != null) {
                  ie.field_a = ll.a(param0 - 96, var2);
                }
                var2 = il.a((byte) 102, "finalscore");
                if (var2 != null) {
                  jb.field_c = ll.a(param0 ^ 96, var2);
                }
                var2 = il.a((byte) 115, "hardmodeunlocked");
                if (var2 != null) {
                  pd.field_f = ll.a(0, var2);
                }
                var2 = il.a((byte) 88, "openhelp");
                if (null != var2) {
                  ee.field_z = ll.a(0, var2);
                }
                var2 = il.a((byte) 87, "openoptions");
                if (var2 != null) {
                  ja.field_h = ll.a(0, var2);
                }
                var2 = il.a((byte) 72, "exitequip");
                if (var2 != null) {
                  nd.field_h = ll.a(0, var2);
                }
                var2 = il.a((byte) 122, "decgren");
                if (var2 != null) {
                  lf.field_b = ll.a(0, var2);
                }
                var2 = il.a((byte) 106, "incgren");
                if (var2 != null) {
                  m.field_a = ll.a(0, var2);
                }
                var2 = il.a((byte) 82, "backtomissel");
                if (var2 != null) {
                  va.field_f = ll.a(0, var2);
                }
                var2 = il.a((byte) 120, "startmiss");
                if (var2 != null) {
                  od.field_f = ll.a(param0 - 96, var2);
                }
                var2 = il.a((byte) 122, "act4");
                if (var2 != null) {
                  ce.field_d = ll.a(0, var2);
                }
                var2 = il.a((byte) 98, "act3");
                if (null != var2) {
                  jh.field_h = ll.a(param0 ^ 96, var2);
                }
                var2 = il.a((byte) 119, "act2");
                if (null != var2) {
                  bh.field_b = ll.a(param0 ^ 96, var2);
                }
                var2 = il.a((byte) 81, "act1");
                if (null != var2) {
                  ef.field_b = ll.a(0, var2);
                }
                var2 = il.a((byte) 120, "missionspace");
                if (null != var2) {
                  wj.field_e = ll.a(0, var2);
                }
                var2 = il.a((byte) 78, "normalwarning");
                if (null != var2) {
                  dj.field_f = ll.a(0, var2);
                }
                var2 = il.a((byte) 81, "acttext,0");
                if (var2 != null) {
                  jh.field_l[0] = ll.a(0, var2);
                }
                var2 = il.a((byte) 120, "acttext,1");
                if (var2 != null) {
                  jh.field_l[1] = ll.a(0, var2);
                }
                var2 = il.a((byte) 112, "acttext,2");
                if (var2 != null) {
                  jh.field_l[2] = ll.a(0, var2);
                }
                var2 = il.a((byte) 117, "acttext,3");
                if (null != var2) {
                  jh.field_l[3] = ll.a(0, var2);
                }
                var2 = il.a((byte) 97, "acttext,4");
                if (var2 != null) {
                  jh.field_l[4] = ll.a(0, var2);
                }
                var2 = il.a((byte) 105, "acttext,5");
                if (null != var2) {
                  jh.field_l[5] = ll.a(0, var2);
                }
                var2 = il.a((byte) 120, "acttext,6");
                if (var2 != null) {
                  jh.field_l[6] = ll.a(0, var2);
                }
                var2 = il.a((byte) 76, "acttext,7");
                if (null != var2) {
                  jh.field_l[7] = ll.a(0, var2);
                }
                var2 = il.a((byte) 123, "acttext,8");
                if (var2 != null) {
                  jh.field_l[8] = ll.a(0, var2);
                }
                var2 = il.a((byte) 119, "acttext,9");
                if (null != var2) {
                  jh.field_l[9] = ll.a(0, var2);
                }
                var2 = il.a((byte) 118, "acttext,10");
                if (null != var2) {
                  jh.field_l[10] = ll.a(param0 - 96, var2);
                }
                var2 = il.a((byte) 114, "acttext,11");
                if (null != var2) {
                  jh.field_l[11] = ll.a(0, var2);
                }
                var2 = il.a((byte) 119, "acttext,12");
                if (null != var2) {
                  jh.field_l[12] = ll.a(0, var2);
                }
                var2 = il.a((byte) 75, "acttext,13");
                if (null != var2) {
                  jh.field_l[13] = ll.a(0, var2);
                }
                var2 = il.a((byte) 116, "acttext,14");
                if (null != var2) {
                  jh.field_l[14] = ll.a(0, var2);
                }
                var2 = il.a((byte) 121, "acttext,15");
                if (var2 != null) {
                  jh.field_l[15] = ll.a(0, var2);
                }
                var2 = il.a((byte) 112, "acttext,16");
                if (var2 != null) {
                  jh.field_l[16] = ll.a(0, var2);
                }
                var2 = il.a((byte) 110, "acttext,17");
                if (var2 != null) {
                  jh.field_l[17] = ll.a(param0 - 96, var2);
                }
                var2 = il.a((byte) 97, "acttext,18");
                if (var2 != null) {
                  jh.field_l[18] = ll.a(0, var2);
                }
                var2 = il.a((byte) 93, "acttext,19");
                if (var2 != null) {
                  jh.field_l[19] = ll.a(0, var2);
                }
                var2 = il.a((byte) 74, "selectmission");
                if (var2 != null) {
                  eb.field_G = ll.a(0, var2);
                }
                var2 = il.a((byte) 110, "selectcitymission");
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = il.a((byte) 118, "shortmissiontext,0");
                if (null != var2) {
                  kk.field_b[0] = ll.a(sl.a((int) param0, 96), var2);
                }
                var2 = il.a((byte) 123, "shortmissiontext,1");
                if (var2 != null) {
                  kk.field_b[1] = ll.a(0, var2);
                }
                var2 = il.a((byte) 100, "shortmissiontext,2");
                if (var2 != null) {
                  kk.field_b[2] = ll.a(0, var2);
                }
                var2 = il.a((byte) 105, "shortmissiontext,3");
                if (var2 != null) {
                  kk.field_b[3] = ll.a(0, var2);
                }
                var2 = il.a((byte) 79, "shortmissiontext,4");
                if (null != var2) {
                  kk.field_b[4] = ll.a(sl.a((int) param0, 96), var2);
                }
                var2 = il.a((byte) 71, "shortmissiontext,5");
                if (null != var2) {
                  kk.field_b[5] = ll.a(0, var2);
                }
                var2 = il.a((byte) 71, "shortmissiontext,6");
                if (null != var2) {
                  kk.field_b[6] = ll.a(0, var2);
                }
                var2 = il.a((byte) 94, "shortmissiontext,7");
                if (null != var2) {
                  kk.field_b[7] = ll.a(0, var2);
                }
                var2 = il.a((byte) 100, "shortmissiontext,8");
                if (null != var2) {
                  kk.field_b[8] = ll.a(0, var2);
                }
                var2 = il.a((byte) 100, "shortmissiontext,9");
                if (var2 != null) {
                  kk.field_b[9] = ll.a(0, var2);
                }
                var2 = il.a((byte) 104, "shortmissiontext,10");
                if (null != var2) {
                  kk.field_b[10] = ll.a(0, var2);
                }
                var2 = il.a((byte) 104, "shortmissiontext,11");
                if (null != var2) {
                  kk.field_b[11] = ll.a(0, var2);
                }
                var2 = il.a((byte) 75, "shortmissiontext,12");
                if (null != var2) {
                  kk.field_b[12] = ll.a(0, var2);
                }
                var2 = il.a((byte) 87, "shortmissiontext,13");
                if (var2 != null) {
                  kk.field_b[13] = ll.a(0, var2);
                }
                var2 = il.a((byte) 96, "shortmissiontext,14");
                if (null != var2) {
                  kk.field_b[14] = ll.a(0, var2);
                }
                var2 = il.a((byte) 109, "shortmissiontext,15");
                if (var2 != null) {
                  kk.field_b[15] = ll.a(0, var2);
                }
                var2 = il.a((byte) 121, "shortmissiontext,16");
                if (var2 != null) {
                  kk.field_b[16] = ll.a(0, var2);
                }
                var2 = il.a((byte) 91, "shortmissiontext,17");
                if (null != var2) {
                  kk.field_b[17] = ll.a(0, var2);
                }
                var2 = il.a((byte) 77, "shortmissiontext,18");
                if (null != var2) {
                  kk.field_b[18] = ll.a(0, var2);
                }
                var2 = il.a((byte) 123, "shortmissiontext,19");
                if (var2 != null) {
                  kk.field_b[19] = ll.a(0, var2);
                }
                var2 = il.a((byte) 108, "shortmissiontext,20");
                if (null != var2) {
                  kk.field_b[20] = ll.a(0, var2);
                }
                var2 = il.a((byte) 73, "shortmissiontext,21");
                if (var2 != null) {
                  kk.field_b[21] = ll.a(0, var2);
                }
                var2 = il.a((byte) 72, "shortmissiontext,22");
                if (var2 != null) {
                  kk.field_b[22] = ll.a(0, var2);
                }
                var2 = il.a((byte) 101, "clicktochooselandings");
                if (var2 != null) {
                  field_g = ll.a(0, var2);
                }
                var2 = il.a((byte) 111, "enterresearch");
                if (null != var2) {
                  td.field_h = ll.a(0, var2);
                }
                var2 = il.a((byte) 111, "equipsoldiers");
                if (var2 != null) {
                  j.field_I = ll.a(0, var2);
                }
                var2 = il.a((byte) 85, "startthemission");
                if (null != var2) {
                  va.field_i = ll.a(0, var2);
                }
                var2 = il.a((byte) 104, "selamission");
                if (null != var2) {
                  lb.field_e = ll.a(0, var2);
                }
                var2 = il.a((byte) 115, "clicktosel");
                if (var2 != null) {
                  nl.field_c = ll.a(0, var2);
                }
                var2 = il.a((byte) 85, "undoplacement");
                if (null != var2) {
                  rf.field_t = ll.a(0, var2);
                }
                var2 = il.a((byte) 124, "landtroops");
                if (var2 != null) {
                  j.field_K = ll.a(0, var2);
                }
                var2 = il.a((byte) 113, "exitresearch");
                if (var2 != null) {
                  ia.field_n = ll.a(0, var2);
                }
                var2 = il.a((byte) 91, "researchtopic");
                if (null != var2) {
                  sb.field_k = ll.a(0, var2);
                }
                var2 = il.a((byte) 102, "stepno");
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = il.a((byte) 76, "tutorialtext,0");
                if (null != var2) {
                  kl.field_d[0] = ll.a(0, var2);
                }
                var2 = il.a((byte) 114, "tutorialtext,1");
                if (null != var2) {
                  kl.field_d[1] = ll.a(param0 - 96, var2);
                }
                var2 = il.a((byte) 115, "tutorialtext,2");
                if (null != var2) {
                  kl.field_d[2] = ll.a(0, var2);
                }
                var2 = il.a((byte) 114, "tutorialtext,3");
                if (var2 != null) {
                  kl.field_d[3] = ll.a(0, var2);
                }
                var2 = il.a((byte) 105, "tutorialtext,4");
                if (null != var2) {
                  kl.field_d[4] = ll.a(0, var2);
                }
                var2 = il.a((byte) 115, "tutorialtext,5");
                if (var2 != null) {
                  kl.field_d[5] = ll.a(0, var2);
                }
                var2 = il.a((byte) 94, "tutorialtext,6");
                if (null != var2) {
                  kl.field_d[6] = ll.a(param0 - 96, var2);
                }
                var2 = il.a((byte) 126, "tutorialtext,7");
                if (var2 != null) {
                  kl.field_d[7] = ll.a(0, var2);
                }
                var2 = il.a((byte) 100, "tutorialtext,8");
                if (var2 != null) {
                  kl.field_d[8] = ll.a(param0 - 96, var2);
                }
                var2 = il.a((byte) 85, "tutorialtext,9");
                if (null != var2) {
                  kl.field_d[9] = ll.a(0, var2);
                }
                var2 = il.a((byte) 104, "tutorialtext,10");
                if (null != var2) {
                  kl.field_d[10] = ll.a(0, var2);
                }
                var2 = il.a((byte) 76, "tutorialtext,11");
                if (null != var2) {
                  kl.field_d[11] = ll.a(0, var2);
                }
                var2 = il.a((byte) 101, "tutorialtext,12");
                if (var2 != null) {
                  kl.field_d[12] = ll.a(0, var2);
                }
                var2 = il.a((byte) 72, "tutorialtext,13");
                if (null != var2) {
                  kl.field_d[13] = ll.a(param0 - 96, var2);
                }
                var2 = il.a((byte) 77, "tutorialtext,14");
                if (var2 != null) {
                  kl.field_d[14] = ll.a(0, var2);
                }
                var2 = il.a((byte) 71, "tutorialtext,15");
                if (null != var2) {
                  kl.field_d[15] = ll.a(0, var2);
                }
                var2 = il.a((byte) 100, "tutorialtext,16");
                if (var2 != null) {
                  kl.field_d[16] = ll.a(param0 - 96, var2);
                }
                var2 = il.a((byte) 124, "tutorialtext,17");
                if (var2 != null) {
                  kl.field_d[17] = ll.a(0, var2);
                }
                var2 = il.a((byte) 96, "tutorialtext,18");
                if (null != var2) {
                  kl.field_d[18] = ll.a(0, var2);
                }
                var2 = il.a((byte) 120, "tutorialtext,19");
                if (null != var2) {
                  kl.field_d[19] = ll.a(sl.a((int) param0, 96), var2);
                }
                var2 = il.a((byte) 80, "tutorialtext,20");
                if (var2 != null) {
                  kl.field_d[20] = ll.a(0, var2);
                }
                var2 = il.a((byte) 104, "tutorialtext,21");
                if (null != var2) {
                  kl.field_d[21] = ll.a(0, var2);
                }
                var2 = il.a((byte) 82, "tutorialtext,22");
                if (var2 != null) {
                  kl.field_d[22] = ll.a(0, var2);
                }
                var2 = il.a((byte) 84, "tutorialtext,23");
                if (null != var2) {
                  kl.field_d[23] = ll.a(0, var2);
                }
                var2 = il.a((byte) 91, "tutorialtext,24");
                if (null != var2) {
                  kl.field_d[24] = ll.a(0, var2);
                }
                var2 = il.a((byte) 114, "tutorialtext,25");
                if (var2 != null) {
                  kl.field_d[25] = ll.a(0, var2);
                }
                var2 = il.a((byte) 89, "tutorialtext,26");
                if (null != var2) {
                  kl.field_d[26] = ll.a(0, var2);
                }
                var2 = il.a((byte) 114, "tutorialtext,27");
                if (var2 != null) {
                  kl.field_d[27] = ll.a(sl.a((int) param0, 96), var2);
                }
                var2 = il.a((byte) 96, "tutorialtext,28");
                if (null != var2) {
                  kl.field_d[28] = ll.a(0, var2);
                }
                var2 = il.a((byte) 80, "tutorialtext,29");
                if (null != var2) {
                  kl.field_d[29] = ll.a(0, var2);
                }
                var2 = il.a((byte) 74, "tutorialtext,30");
                if (var2 != null) {
                  kl.field_d[30] = ll.a(0, var2);
                }
                var2 = il.a((byte) 76, "tutorialtext,31");
                if (null != var2) {
                  kl.field_d[31] = ll.a(0, var2);
                }
                var2 = il.a((byte) 111, "tutorialtext,32");
                if (null != var2) {
                  kl.field_d[32] = ll.a(param0 - 96, var2);
                }
                var2 = il.a((byte) 93, "tutorialtext,33");
                if (null != var2) {
                  kl.field_d[33] = ll.a(0, var2);
                }
                var2 = il.a((byte) 89, "tutorialtext,34");
                if (null != var2) {
                  kl.field_d[34] = ll.a(0, var2);
                }
                var2 = il.a((byte) 89, "tutorialtext,35");
                if (var2 != null) {
                  kl.field_d[35] = ll.a(0, var2);
                }
                var2 = il.a((byte) 77, "tutorialtext,36");
                if (var2 != null) {
                  kl.field_d[36] = ll.a(0, var2);
                }
                var2 = il.a((byte) 79, "tutorialtext,37");
                if (null != var2) {
                  kl.field_d[37] = ll.a(param0 - 96, var2);
                }
                var2 = il.a((byte) 105, "tutorialtext,38");
                if (null != var2) {
                  kl.field_d[38] = ll.a(sl.a((int) param0, 96), var2);
                }
                var2 = il.a((byte) 90, "tutorialtext,39");
                if (var2 != null) {
                  kl.field_d[39] = ll.a(sl.a((int) param0, 96), var2);
                }
                var2 = il.a((byte) 109, "tutorialtext,40");
                if (var2 != null) {
                  kl.field_d[40] = ll.a(0, var2);
                }
                var2 = il.a((byte) 85, "tutorialtext,41");
                if (null != var2) {
                  kl.field_d[41] = ll.a(param0 - 96, var2);
                }
                var2 = il.a((byte) 87, "tutorialtext,42");
                if (null != var2) {
                  kl.field_d[42] = ll.a(0, var2);
                }
                var2 = il.a((byte) 88, "tutorialtext,43");
                if (var2 != null) {
                  kl.field_d[43] = ll.a(0, var2);
                }
                var2 = il.a((byte) 123, "tutorialtext,44");
                if (null != var2) {
                  kl.field_d[44] = ll.a(0, var2);
                }
                var2 = il.a((byte) 90, "tutorialtext,45");
                if (var2 != null) {
                  kl.field_d[45] = ll.a(0, var2);
                }
                var2 = il.a((byte) 117, "tutorialtext,46");
                if (null != var2) {
                  kl.field_d[46] = ll.a(0, var2);
                }
                var2 = il.a((byte) 116, "tutorialtext,47");
                if (null != var2) {
                  kl.field_d[47] = ll.a(0, var2);
                }
                var2 = il.a((byte) 106, "tutorialtext,48");
                if (var2 != null) {
                  kl.field_d[48] = ll.a(0, var2);
                }
                var2 = il.a((byte) 84, "tutorialtext,49");
            }
            void runChunk3() throws java.lang.RuntimeException {
                if (null != var2) {
                  kl.field_d[49] = ll.a(0, var2);
                }
                var2 = il.a((byte) 106, "tutorialtext,50");
                if (null != var2) {
                  kl.field_d[50] = ll.a(param0 - 96, var2);
                }
                var2 = il.a((byte) 72, "tutorialtext,51");
                if (var2 != null) {
                  kl.field_d[51] = ll.a(param0 - 96, var2);
                }
                var2 = il.a((byte) 126, "tutorialtext,52");
                if (null != var2) {
                  kl.field_d[52] = ll.a(0, var2);
                }
                var2 = il.a((byte) 92, "tutorialtext,53");
                if (null != var2) {
                  kl.field_d[53] = ll.a(0, var2);
                }
                var2 = il.a((byte) 127, "tutorialtext,54");
                if (null != var2) {
                  kl.field_d[54] = ll.a(0, var2);
                }
                var2 = il.a((byte) 103, "tutorialtext,55");
                if (var2 != null) {
                  kl.field_d[55] = ll.a(sl.a((int) param0, 96), var2);
                }
                var2 = il.a((byte) 104, "tutorialtext,56");
                if (null != var2) {
                  kl.field_d[56] = ll.a(0, var2);
                }
                var2 = il.a((byte) 125, "tutorialtext,57");
                if (null != var2) {
                  kl.field_d[57] = ll.a(param0 - 96, var2);
                }
                var2 = il.a((byte) 90, "tutorialtext,58");
                if (var2 != null) {
                  kl.field_d[58] = ll.a(0, var2);
                }
                var2 = il.a((byte) 127, "tutorialtext,59");
                if (null != var2) {
                  kl.field_d[59] = ll.a(0, var2);
                }
                var2 = il.a((byte) 125, "tutorialtext,60");
                if (null != var2) {
                  kl.field_d[60] = ll.a(0, var2);
                }
                var2 = il.a((byte) 83, "tutorialtext,61");
                if (null != var2) {
                  kl.field_d[61] = ll.a(0, var2);
                }
                var2 = il.a((byte) 121, "tutorialtext,62");
                if (null != var2) {
                  kl.field_d[62] = ll.a(param0 - 96, var2);
                }
                var2 = il.a((byte) 113, "tutorialtext,63");
                if (var2 != null) {
                  kl.field_d[63] = ll.a(0, var2);
                }
                var2 = il.a(param0, "tutorialtext,64");
                if (var2 != null) {
                  kl.field_d[64] = ll.a(param0 - 96, var2);
                }
                var2 = il.a((byte) 71, "tutorialtext,65");
                if (null != var2) {
                  kl.field_d[65] = ll.a(0, var2);
                }
                var2 = il.a((byte) 116, "tutorialtext,66");
                if (null != var2) {
                  kl.field_d[66] = ll.a(0, var2);
                }
                var2 = il.a((byte) 89, "tutorialtext,67");
                if (var2 != null) {
                  kl.field_d[67] = ll.a(0, var2);
                }
                var2 = il.a((byte) 119, "tutorialtext,68");
                if (null != var2) {
                  kl.field_d[68] = ll.a(0, var2);
                }
                var2 = il.a((byte) 92, "tutorialtext,69");
                if (null != var2) {
                  kl.field_d[69] = ll.a(param0 - 96, var2);
                }
                var2 = il.a((byte) 99, "tutorialtext,70");
                if (null != var2) {
                  kl.field_d[70] = ll.a(0, var2);
                }
                var2 = il.a((byte) 89, "tutorialtext,71");
                if (var2 != null) {
                  kl.field_d[71] = ll.a(0, var2);
                }
                var2 = il.a((byte) 113, "tutorialtext,72");
                if (var2 != null) {
                  kl.field_d[72] = ll.a(param0 - 96, var2);
                }
                var2 = il.a((byte) 126, "tutorialtext,73");
                if (var2 != null) {
                  kl.field_d[73] = ll.a(0, var2);
                }
                var2 = il.a((byte) 118, "tutorialtext,74");
                if (null != var2) {
                  kl.field_d[74] = ll.a(sl.a((int) param0, 96), var2);
                }
                var2 = il.a((byte) 82, "tutorialtext,75");
                if (var2 != null) {
                  kl.field_d[75] = ll.a(0, var2);
                }
                var2 = il.a((byte) 72, "tutorialtext,76");
                if (var2 != null) {
                  kl.field_d[76] = ll.a(0, var2);
                }
                var2 = il.a((byte) 108, "tutorialtext,77");
                if (null != var2) {
                  kl.field_d[77] = ll.a(0, var2);
                }
                var2 = il.a((byte) 82, "tutorialtext,78");
                if (var2 != null) {
                  kl.field_d[78] = ll.a(0, var2);
                }
                var2 = il.a((byte) 83, "tutorialtext,79");
                if (null != var2) {
                  kl.field_d[79] = ll.a(0, var2);
                }
                var2 = il.a((byte) 89, "tutorialtext,80");
                if (var2 != null) {
                  kl.field_d[80] = ll.a(0, var2);
                }
                var2 = il.a((byte) 116, "tutorialtext,81");
                if (null != var2) {
                  kl.field_d[81] = ll.a(0, var2);
                }
                var2 = il.a((byte) 76, "tutorialtext,82");
                if (null != var2) {
                  kl.field_d[82] = ll.a(sl.a((int) param0, 96), var2);
                }
                var2 = il.a((byte) 122, "tutorialtext,83");
                if (null != var2) {
                  kl.field_d[83] = ll.a(0, var2);
                }
                var2 = il.a((byte) 84, "tutorialtext,84");
                if (null != var2) {
                  kl.field_d[84] = ll.a(0, var2);
                }
                var2 = il.a((byte) 127, "tutorialtext,85");
                if (null != var2) {
                  kl.field_d[85] = ll.a(sl.a((int) param0, 96), var2);
                }
                var2 = il.a((byte) 102, "tutorialtext,86");
                if (null != var2) {
                  kl.field_d[86] = ll.a(0, var2);
                }
                var2 = il.a((byte) 114, "instructions_pages,0");
                if (null != var2) {
                  re.field_h[0] = ll.a(0, var2);
                }
                var2 = il.a((byte) 107, "instructions_pages,1");
                if (null != var2) {
                  re.field_h[1] = ll.a(0, var2);
                }
                var2 = il.a((byte) 84, "instructions_pages,2");
                if (null != var2) {
                  re.field_h[2] = ll.a(sl.a((int) param0, 96), var2);
                }
                var2 = il.a((byte) 101, "all");
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = il.a((byte) 75, "mine");
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = il.a((byte) 119, "besteach");
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = il.a((byte) 119, "benefits");
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = il.a((byte) 96, "keycode_M");
                if (null != var2) {
                  wb.field_e = var2[0] & 255;
                }
                var2 = il.a((byte) 82, "keycode_W");
                if (var2 != null) {
                  rh.field_c = var2[0] & 255;
                }
                var2 = il.a((byte) 101, "keycode_A");
                if (var2 != null) {
                  fl.field_b = var2[0] & 255;
                }
                var2 = il.a((byte) 80, "keycode_C");
                if (null != var2) {
                  ef.field_h = var2[0] & 255;
                }
                var2 = il.a((byte) 104, "keycode_COMMA");
                if (null != var2) {
                  uf.field_b = var2[0] & 255;
                }
                var2 = il.a((byte) 91, "keycode_FULLSTOP");
                if (null != var2) {
                  ne.field_e = 255 & var2[0];
                }
                nj.field_i = null;
            }
            void run() {
                var3 = Terraphoenix.field_V;
                try {
                  runChunk0();
                  if (finished) return;
                  runChunk1();
                  if (finished) return;
                  runChunk2();
                  if (finished) return;
                  runChunk3();
                  if (finished) return;
                } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2_ref = decompiledCaughtException;
                  stackIn_2491_0 = (RuntimeException) (var2_ref);
                  stackIn_2491_1 = new StringBuilder().append("bl.A(").append(param0).append(',');
                  if (param1 == null) {
                    stackIn_2492_2 = "null";
                  } else {
                    stackIn_2492_2 = "{...}";
                  }
                  throw qk.a((Throwable) ((Object) stackIn_2491_0), ((StringBuilder) (Object) stackIn_2491_1).append(stackIn_2492_2).append(')').toString());
                }
                if (var3 != 0) {
                  stackIn_2500_0 = (!eh.field_j);
                  eh.field_j = stackIn_2500_0;
                }
            }
        }
        $CfrPartitionedBody decompiledBody = new $CfrPartitionedBody(param0, param1);
        decompiledBody.run();
    }

    public static void a(boolean param0) {
        try {
          field_g = null;
          field_c = null;
          field_d = null;
          field_b = null;
          field_a = null;
          if (param0) {
            field_a = (fa) null;
          }
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "bl.B(" + param0 + ')');
        }
    }

    static {
        field_g = "Click on the map to choose locations to land your squad members.";
        field_c = "Type your age in years";
        field_d = "Loading graphics";
    }
}
