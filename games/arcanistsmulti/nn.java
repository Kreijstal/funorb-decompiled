/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class nn extends tf {
    static String field_t;
    static ij field_q;
    static eh field_s;
    static String field_m;
    static int field_p;
    static int[][] field_n;
    int field_r;
    static og field_o;

    abstract boolean f(byte param0);

    final static String g(byte param0) {
        int var2 = 0;
        String var1;
        int var3;
        int var4;
        int var5;
        String var6;
        String var7;
        String var8;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        if (param0 != -25) {
          nn.c(-47);
        }
        var6 = "(" + ve.field_m + " " + nf.field_W + " " + se.field_I + ") " + on.field_g;
        var1 = var6;
        if (fj.field_h > 0) {
          var1 = var6 + ":";
          for (var2 = 0; var2 < fj.field_h; var2++) {
            var7 = var1 + ' ';
            var3 = 255 & df.field_z.field_j[var2];
            var4 = var3 >> 4;
            var3 = var3 & 15;
            if (var4 < 10) {
              var4 += 48;
            } else {
              var4 += 55;
            }
            if (var3 >= 10) {
              var3 += 55;
            } else {
              var3 += 48;
            }
            var8 = var7 + (char)var4;
            var1 = var8 + (char)var3;
          }
        }
        return var1;
    }

    public static void c(int param0) {
        field_t = null;
        if (param0 <= 25) {
          return;
        }
        field_s = null;
        field_o = null;
        field_q = null;
        field_m = null;
        field_n = (int[][]) null;
    }

    final static void a(byte[] param0, int[] param1, int param2, qb[][] param3, int param4, String[] param5, String[][] param6, String[] param7, eg param8, byte[] param9, String[] param10, String[][] param11, int param12, qb[][] param13, int param14) {
        nl[] array$0 = null;
        nl[] array$1 = null;
        nl[] array$2 = null;
        int var19 = 0;
        kc stackIn_5_0;
        kc stackIn_5_1;
        long stackIn_5_2;
        kc stackIn_5_3;
        kc stackIn_6_0 = null;
        kc stackIn_6_1 = null;
        String stackIn_6_4 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_77_2 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_80_2 = null;
        StringBuilder stackIn_82_1 = null;
        String stackIn_83_2 = null;
        StringBuilder stackIn_85_1 = null;
        String stackIn_86_2 = null;
        StringBuilder stackIn_88_1 = null;
        String stackIn_89_2 = null;
        StringBuilder stackIn_91_1 = null;
        String stackIn_92_2 = null;
        StringBuilder stackIn_94_1 = null;
        String stackIn_95_2 = null;
        StringBuilder stackIn_97_1 = null;
        String stackIn_98_2 = null;
        StringBuilder stackIn_100_1 = null;
        String stackIn_101_2 = null;
        StringBuilder stackIn_103_1 = null;
        String stackIn_104_2 = null;
        StringBuilder stackIn_106_1 = null;
        String stackIn_107_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var15 = null;
        kc var16 = null;
        int var17_int = 0;
        kc var17 = null;
        int var18 = 0;
        Object var19_ref = null;
        Object var20 = null;
        int var21 = 0;
        kc var23 = null;
        kc var24 = null;
        int var18Lifetime1;
        int var18Lifetime2;
        int var17_intLifetime1;
        int var17_intLifetime2;
        int var17_intLifetime3;
        int var17_intLifetime4;
        var21 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          le.field_q = param12;
          fl.field_b = param7;
          pn.field_b = param13;
          lj.field_o = param6;
          ef.field_t = param4;
          ao.field_h = param1;
          qa.field_o = param11;
          rk.field_I = param5;
          nk.field_m = param3;
          ob.field_bb = param10;
          ml.field_m = param9;
          gb.field_d = param0;
          mo.field_b = qe.a(param8, "gameprivacy", "lobby", 92);
          re.field_j = qe.a(param8, "ratedgame", "lobby", 81);
          sk.field_f = qe.a(param8, "opentome", "lobby", 71);
          ec.field_i = qe.a(param8, "allowspectators", "lobby", 88);
          vm.field_c = new String[5];
          vm.field_c[4] = io.field_C;
          vm.field_c[1] = ne.field_a;
          vm.field_c[0] = wm.field_F;
          vm.field_c[2] = um.field_d;
          vm.field_c[3] = lj.field_m;
          mj.field_s = new kc(0L, (kc) null);
          uc.field_d = new kc(0L, vf.field_u, hb.field_Bb);
          nh.field_z = new kc(0L, vf.field_i, ef.field_q);
          nj.field_m = new dn(0L, new kc(0L, (kc) null), am.field_c, vn.field_i);
          mj.field_s.a(uc.field_d, param14 + 87);
          if (fc.field_a) {
            mj.field_s.a(nh.field_z, 41);
          }
          mj.field_s.a(nj.field_m, 47);
          nj.field_m.field_Hb.a(pg.field_c, (byte) 126);
          var23 = nj.field_m.field_Hb;
          var24 = var23;
          nj.field_m.field_Hb.field_gb = 1;
          var24.field_X = 1;
          kg.field_c = new kc(0L, pg.field_c);
          kg.field_c.field_X = 1;
          ii.field_b = new kc(0L, th.field_c, ti.field_M.toUpperCase());
          sm.field_c = new kc(0L, wa.field_Pb, hb.field_Ib.toUpperCase());
          ad.field_c = new kc(0L, ia.field_a);
          tj.field_o = new kc(0L, vf.field_u, of.field_k);
          hg.field_e = new kc(0L, rn.field_S, lc.field_c);
          ci.field_a = new kc(0L, rn.field_S, ba.field_c);
          lo.field_r = new kc(0L, rn.field_S, dk.field_h);
          vc.field_j = new kc(0L, rn.field_S, g.field_b);
          jo.field_a = new kc(0L, vf.field_i, kh.field_a);
          ee.field_g = new dn(0L, new kc(0L, (kc) null), am.field_c, vn.field_i);
          of.field_a = new kc(0L, ko.field_h, fi.field_f.toUpperCase());
          of.field_a.field_ub = fc.field_a;
          stackIn_5_0 = null;
          stackIn_5_1 = null;
          stackIn_5_2 = 0L;
          stackIn_5_3 = ko.field_h;
          if (fc.field_a) {
            stackIn_6_0 = null;
            stackIn_6_1 = null;
            stackIn_6_4 = ga.field_t;
          } else {
            stackIn_6_0 = null;
            stackIn_6_1 = null;
            stackIn_6_4 = sl.field_K;
          }
          jl.field_a = new kc(stackIn_5_2, stackIn_5_3, ((String) (Object) stackIn_6_4).toUpperCase());
          fn.field_e = new kc(0L, (kc) null);
          fn.field_e.a(sm.field_c, 23);
          fn.field_e.a(ad.field_c, 36);
          ad.field_c.a(tj.field_o, 106);
          ad.field_c.a(hg.field_e, 50);
          ad.field_c.a(ci.field_a, param14 + 20);
          if (fc.field_a) {
            ad.field_c.a(lo.field_r, 44);
          }
          ad.field_c.a(vc.field_j, param14 + 47);
          ad.field_c.a(jo.field_a, 29);
          ad.field_c.a(ee.field_g, 124);
          if (fc.field_a) {
            fn.field_e.a(of.field_a, 20);
          }
          fn.field_e.a(jl.field_a, 15);
          la.field_c = new kc(0L, pg.field_c);
          la.field_c.field_gb = 0;
          la.field_c.field_X = 1;
          dm.field_E = new kc(0L, gn.field_c, im.field_f.toUpperCase());
          gm.field_h = new kc(0L, mf.field_d);
          gm.field_h.a(la.field_c, 110);
          gm.field_h.a(dm.field_E, 121);
          vc.field_c = new kc(0L, am.field_c);
          vc.field_c.a(pg.field_c, (byte) 119);
          vc.field_c.field_gb = 1;
          var16 = vc.field_c;
          var16.field_X = 1;
          bk.field_M = new kc(0L, (kc) null);
          aj.field_d = new kc(0L, pg.field_c);
          aj.field_d.field_X = 1;
          qc.field_d = new kc(0L, vf.field_u, hb.field_Bb);
          hf.field_q = new kc(0L, vf.field_i, ef.field_q);
          lf.field_b = new dn(0L, new kc(0L, (kc) null), am.field_c, vn.field_i);
          bk.field_M.a(aj.field_d, 30);
          bk.field_M.a(qc.field_d, 51);
          if (fc.field_a) {
            bk.field_M.a(hf.field_q, param14 + 10);
          }
          bk.field_M.a(lf.field_b, 31);
          mo.field_o = new kc(0L, th.field_c, gb.field_a.toUpperCase());
          nl.field_Db = new kc(0L, wa.field_Pb);
          mi.field_m = new kc(0L, ia.field_a);
          ib.field_s = new kc(0L, dd.field_b, o.field_o.toUpperCase());
          s.field_e = new nl[param2 + 4][];
          wd.field_g = new kc[4 + param2];
          wd.field_g[0] = new kc(0L, mi.field_A, gg.field_i);
          s.field_e[0] = new nl[6];
          for (var17_int = 0; var17_int < 5; var17_int++) {
            s.field_e[0][var17_int + 1] = new nl(0L, nf.field_j, (kc) null, nj.field_d, mo.field_b[var17_int], vm.field_c[var17_int]);
          }
          if (ao.field_h.length >= 2) {
            wd.field_g[1] = new kc(0L, mi.field_A, w.field_Bb);
            array$0 = new nl[ao.field_h.length + 1];
            s.field_e[1] = array$0;
            s.field_e[1][0] = new nl(0L, nf.field_j, (kc) null, nj.field_d, (qb) null, ij.field_Rb);
            for (var17_intLifetime1 = 0; ao.field_h.length > var17_intLifetime1; var17_intLifetime1++) {
              s.field_e[1][var17_intLifetime1 + 1] = new nl(0L, nf.field_j, (kc) null, nj.field_d, (qb) null, Integer.toString(ao.field_h[var17_intLifetime1]));
            }
          }
          wd.field_g[2] = new kc(0L, mi.field_A, gb.field_b);
          s.field_e[param14] = new nl[]{new nl(0L, nf.field_j, (kc) null, nj.field_d, (qb) null, ij.field_Rb), new nl(0L, nf.field_j, (kc) null, nj.field_d, ec.field_i[0], nh.field_B), new nl(0L, nf.field_j, (kc) null, nj.field_d, ec.field_i[1], cf.field_d)};
          if (le.field_q > 1) {
            wd.field_g[3] = new kc(0L, mi.field_A, fm.field_e);
            array$1 = new nl[le.field_q + 1];
            s.field_e[3] = array$1;
            s.field_e[3][0] = new nl(0L, nf.field_j, (kc) null, nj.field_d, (qb) null, ij.field_Rb);
            for (var17_intLifetime2 = 0; var17_intLifetime2 < le.field_q; var17_intLifetime2++) {
              s.field_e[3][1 + var17_intLifetime2] = new nl(0L, nf.field_j, (kc) null, nj.field_d, (qb) null, fl.field_b[var17_intLifetime2]);
            }
          }
          for (var17_intLifetime3 = 0; param2 > var17_intLifetime3; var17_intLifetime3++) {
            wd.field_g[var17_intLifetime3 + 4] = new kc(0L, mi.field_A, ob.field_bb[var17_intLifetime3]);
            array$2 = new nl[1 + dg.a((int) gb.field_d[var17_intLifetime3], 255)];
            s.field_e[var17_intLifetime3 + 4] = array$2;
            s.field_e[4 + var17_intLifetime3][0] = new nl(0L, nf.field_j, (kc) null, nj.field_d, (qb) null, ij.field_Rb);
            for (var18 = 0; var18 < (gb.field_d[var17_intLifetime3] & 255); var18++) {
              if (null == pn.field_b) {
                var19_ref = null;
              } else {
                if (null != pn.field_b[var17_intLifetime3]) {
                  var19_ref = pn.field_b[var17_intLifetime3][var18];
                } else {
                  var19_ref = null;
                }
              }
              if (lj.field_o == null) {
                var20 = null;
              } else {
                if (null != lj.field_o[var17_intLifetime3]) {
                  var20 = lj.field_o[var17_intLifetime3][var18];
                } else {
                  var20 = null;
                }
              }
              s.field_e[4 + var17_intLifetime3][var18 + 1] = new nl(0L, nf.field_j, (kc) null, nj.field_d, (qb) (var19_ref), (String) (var20));
            }
          }
          for (var17_intLifetime4 = 0; param2 + 4 > var17_intLifetime4; var17_intLifetime4++) {
            if (wd.field_g[var17_intLifetime4] != null) {
              wd.field_g[var17_intLifetime4].field_z = 11;
            }
            if (s.field_e[var17_intLifetime4] != null) {
              for (var18Lifetime1 = 0; s.field_e[var17_intLifetime4].length > var18Lifetime1; var18Lifetime1++) {
                if (s.field_e[var17_intLifetime4][var18Lifetime1] != null &&
                  s.field_e[var17_intLifetime4][var18Lifetime1].field_Eb != null) {
                  s.field_e[var17_intLifetime4][var18Lifetime1].field_Eb.field_z = 11;
                }
              }
            }
          }
          go.field_d = new kc(0L, ko.field_h);
          dk.field_k = new kc(0L, ko.field_h);
          jf.field_d = new kc(0L, j.field_f);
          jf.field_d.a(pg.field_c, (byte) 119);
          var17 = jf.field_d;
          jf.field_d.field_gb = 1;
          var17.field_X = 1;
          oh.field_h = new kc(0L, (kc) null);
          oh.field_h.a(nl.field_Db, 19);
          oh.field_h.a(mi.field_m, 49);
          mi.field_m.a(ib.field_s, 98);
          for (var18Lifetime2 = 0; var18Lifetime2 < param2 + 4; var18Lifetime2++) {
            if ((1 != var18Lifetime2 ||
              !(2 > ao.field_h.length)) && (3 != var18Lifetime2 ||
              !(1 >= le.field_q))) {
              mi.field_m.a(wd.field_g[var18Lifetime2], param14 + 5);
              for (var19 = 0; s.field_e[var18Lifetime2].length > var19; var19++) {
                if (s.field_e[var18Lifetime2][var19] != null) {
                  mi.field_m.a(s.field_e[var18Lifetime2][var19], 92);
                }
              }
            }
          }
          oh.field_h.a(go.field_d, 13);
          oh.field_h.a(dk.field_k, 23);
          oh.field_h.a(jf.field_d, 110);
          hf.field_t = new kc(0L, be.field_l, mb.field_O.toUpperCase());
          gj.field_d = new kc(0L, gn.field_c, f.field_i.toUpperCase());
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var15 = decompiledCaughtException;
          stackIn_76_0 = var15;
          stackIn_76_1 = new StringBuilder().append("nn.C(");
          if (param0 == null) {
            stackIn_77_2 = "null";
          } else {
            stackIn_77_2 = "{...}";
          }
          stackIn_79_1 = ((StringBuilder) (Object) stackIn_76_1).append(stackIn_77_2).append(',');
          if (param1 == null) {
            stackIn_80_2 = "null";
          } else {
            stackIn_80_2 = "{...}";
          }
          stackIn_82_1 = ((StringBuilder) (Object) stackIn_79_1).append(stackIn_80_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_83_2 = "null";
          } else {
            stackIn_83_2 = "{...}";
          }
          stackIn_85_1 = ((StringBuilder) (Object) stackIn_82_1).append(stackIn_83_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_86_2 = "null";
          } else {
            stackIn_86_2 = "{...}";
          }
          stackIn_88_1 = ((StringBuilder) (Object) stackIn_85_1).append(stackIn_86_2).append(',');
          if (param6 == null) {
            stackIn_89_2 = "null";
          } else {
            stackIn_89_2 = "{...}";
          }
          stackIn_91_1 = ((StringBuilder) (Object) stackIn_88_1).append(stackIn_89_2).append(',');
          if (param7 == null) {
            stackIn_92_2 = "null";
          } else {
            stackIn_92_2 = "{...}";
          }
          stackIn_94_1 = ((StringBuilder) (Object) stackIn_91_1).append(stackIn_92_2).append(',');
          if (param8 == null) {
            stackIn_95_2 = "null";
          } else {
            stackIn_95_2 = "{...}";
          }
          stackIn_97_1 = ((StringBuilder) (Object) stackIn_94_1).append(stackIn_95_2).append(',');
          if (param9 == null) {
            stackIn_98_2 = "null";
          } else {
            stackIn_98_2 = "{...}";
          }
          stackIn_100_1 = ((StringBuilder) (Object) stackIn_97_1).append(stackIn_98_2).append(',');
          if (param10 == null) {
            stackIn_101_2 = "null";
          } else {
            stackIn_101_2 = "{...}";
          }
          stackIn_103_1 = ((StringBuilder) (Object) stackIn_100_1).append(stackIn_101_2).append(',');
          if (param11 == null) {
            stackIn_104_2 = "null";
          } else {
            stackIn_104_2 = "{...}";
          }
          stackIn_106_1 = ((StringBuilder) (Object) stackIn_103_1).append(stackIn_104_2).append(',').append(param12).append(',');
          if (param13 == null) {
            stackIn_107_2 = "null";
          } else {
            stackIn_107_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_76_0), ((StringBuilder) (Object) stackIn_106_1).append(stackIn_107_2).append(',').append(param14).append(')').toString());
        }
    }

    abstract Object e(byte param0);

    final static byte[] a(int param0, byte param1, byte[] param2, int param3) {
        int var5_int = 0;
        byte[] var4 = null;
        int var7 = 0;
        byte[] var8 = null;
        byte[] stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        rm var5 = null;
        byte[] var6 = null;
        byte[] var9 = null;
        byte[] var10 = null;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (param3 > 0) {
            var8 = new byte[param0];
            var4 = var8;
            for (var5_int = 0; param0 > var5_int; var5_int++) {
              var8[var5_int] = param2[param3 + var5_int];
            }
          } else {
            var4 = param2;
          }
          var5 = new rm();
          if (param1 != -93) {
            nn.a((byte[]) null, (int[]) null, 89, (qb[][]) null, -13, (String[]) null, (String[][]) null, (String[]) null, (eg) null, (byte[]) null, (String[]) null, (String[][]) null, 28, (qb[][]) null, -101);
          }
          var5.c(-23645);
          var5.a((long)(8 * param0), 8, var4);
          var10 = new byte[64];
          var9 = var10;
          var6 = var9;
          var5.a((byte) 119, 0, var10);
          stackIn_9_0 = var6;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_12_0 = var4_ref;
          stackIn_12_1 = new StringBuilder().append("nn.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    nn(int param0) {
        this.field_r = param0;
    }

    static {
        field_t = "You are offering to draw.";
        field_p = 15;
        field_m = "Start Game";
        field_s = new eh();
        field_n = new int[][]{new int[]{25, 26, 27}, new int[]{28, 29, 30}, new int[]{31, 32, 33}, new int[]{34, 35, 36}, new int[]{37, 38, 39}, new int[]{40, 41, 42}, new int[]{45, 46, 47}, new int[]{48, 49, 50}, new int[]{61, 62, 62}, new int[]{40, 41, 42}};
    }
}
