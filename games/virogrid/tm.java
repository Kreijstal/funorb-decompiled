/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tm extends l {
    static String field_i;
    static String field_j;
    int field_m;
    static String field_k;
    static int[] field_o;
    static int field_n;
    int[] field_p;
    static int field_g;
    static je field_l;
    static int[] field_h;

    public static void a(int param0) {
        field_j = null;
        field_i = null;
        field_l = null;
        field_o = null;
        if (param0 > -48) {
          return;
        }
        field_h = null;
        field_k = null;
    }

    final static void a(int param0, int param1, boolean param2, int param3, int param4, mg[] param5) {
        int var21 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_74_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var22 = 0;
        mg[] var23 = null;
        int var20Lifetime1;
        int var20Lifetime2;
        int var20Lifetime3;
        int var20Lifetime4;
        var22 = Virogrid.field_F ? 1 : 0;
        try {
          if (param5 == null) {
            return;
          }
          if (param3 > 0 &&
            param4 > 0) {
            if (param5[3] == null) {
              stackIn_9_0 = 0;
            } else {
              stackIn_9_0 = param5[3].field_u;
            }
            var6_int = stackIn_9_0;
            if (null == param5[5]) {
              stackIn_12_0 = 0;
            } else {
              stackIn_12_0 = param5[5].field_u;
            }
            var7 = stackIn_12_0;
            if (null == param5[1]) {
              stackIn_15_0 = 0;
            } else {
              stackIn_15_0 = param5[1].field_z;
            }
            var8 = stackIn_15_0;
            if (param5[7] != null) {
              stackIn_18_0 = param5[7].field_z;
            } else {
              stackIn_18_0 = 0;
            }
            var9 = stackIn_18_0;
            var10 = param0 + param3;
            var11 = param1 + param4;
            var12 = var6_int + param0;
            var13 = var10 - var7;
            var14 = var8 + param1;
            var15 = var11 - var9;
            var16 = var12;
            var17 = var13;
            if (var17 < var16) {
              var17 = param3 * var6_int / (var6_int + var7) + param0;
              var16 = param3 * var6_int / (var6_int + var7) + param0;
            }
            var18 = var14;
            var19 = var15;
            df.b(nf.field_f);
            if (var19 < var18) {
              var19 = param1 + var8 * param4 / (var9 + var8);
              var18 = param1 + var8 * param4 / (var9 + var8);
            }
            if (param5[0] != null) {
              df.h(param0, param1, var16, var18);
              param5[0].d(param0, param1);
              df.a(nf.field_f);
            }
            if (null != param5[2]) {
              df.h(var17, param1, var10, var18);
              param5[2].d(var13, param1);
              df.a(nf.field_f);
            }
            if (param5[6] != null) {
              df.h(param0, var19, var16, var11);
              param5[6].d(param0, var15);
              df.a(nf.field_f);
            }
            if (param5[8] != null) {
              df.h(var17, var19, var10, var11);
              param5[8].d(var13, var15);
              df.a(nf.field_f);
            }
            if (param5[1] != null &&
              param5[1].field_u != 0) {
              df.h(var16, param1, var17, var18);
              for (var20 = var12; var13 > var20; var20 = var20 + param5[1].field_u) {
                param5[1].d(var20, param1);
              }
              df.a(nf.field_f);
            }
            if (null != param5[7] &&
              param5[7].field_u != 0) {
              df.h(var16, var19, var17, var11);
              for (var20Lifetime1 = var12; var20Lifetime1 < var13; var20Lifetime1 = var20Lifetime1 + param5[7].field_u) {
                param5[7].d(var20Lifetime1, var15);
              }
              df.a(nf.field_f);
            }
            if (param2) {
              var23 = (mg[]) null;
              tm.a(-38, 91, true, -16, -31, (mg[]) null);
            }
            if (null != param5[3] &&
              param5[3].field_z != 0) {
              df.h(param0, var18, var16, var19);
              for (var20Lifetime2 = var14; var15 > var20Lifetime2; var20Lifetime2 = var20Lifetime2 + param5[3].field_z) {
                param5[3].d(param0, var20Lifetime2);
              }
              df.a(nf.field_f);
            }
            if (null != param5[5] &&
              param5[5].field_z != 0) {
              df.h(var17, var18, var10, var19);
              for (var20Lifetime3 = var14; var15 > var20Lifetime3; var20Lifetime3 = var20Lifetime3 + param5[5].field_z) {
                param5[5].d(var13, var20Lifetime3);
              }
              df.a(nf.field_f);
            }
            if (param5[4] != null &&
              0 != param5[4].field_u &&
              param5[4].field_z != 0) {
              df.h(var16, var18, var17, var19);
              for (var20Lifetime4 = var14; var15 > var20Lifetime4; var20Lifetime4 = var20Lifetime4 + param5[4].field_z) {
                for (var21 = var12; var13 > var21; var21 = var21 + param5[4].field_u) {
                  param5[4].d(var21, var20Lifetime4);
                }
              }
              df.a(nf.field_f);
              return;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_73_0 = var6;
          stackIn_73_1 = new StringBuilder().append("tm.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_73_0), ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(')').toString());
        }
    }

    final static pe a(jh param0, int param1) {
        pe var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        pe stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = new pe(param0, param0);
          co.field_a.a(var2, (byte) -70);
          var3 = -54 % ((7 - param1) / 49);
          hd.field_g.a(param0);
          stackIn_1_0 = var2;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_4_0 = var2_ref;
          stackIn_4_1 = new StringBuilder().append("tm.B(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(mg[][] param0, int param1, int param2, int param3, int[] param4, eh param5, mg[][] param6, byte[] param7, String[][] param8, int param9, String[][] param10, String[] param11, String[] param12, byte[] param13, String[] param14) {
        hk[] array$0 = null;
        hk[] array$1 = null;
        hk[] array$2 = null;
        int var19 = 0;
        km stackIn_7_0;
        km stackIn_7_1;
        long stackIn_7_2;
        km stackIn_7_3;
        km stackIn_8_0 = null;
        km stackIn_8_1 = null;
        String stackIn_8_4 = null;
        Object stackIn_45_0 = null;
        km stackIn_45_1 = null;
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
        km var16 = null;
        int var17_int = 0;
        km var17 = null;
        int var18 = 0;
        Object var19_ref = null;
        Object var20 = null;
        int var21 = 0;
        km var23 = null;
        km var24 = null;
        int var18Lifetime1;
        int var18Lifetime2;
        int var17_intLifetime1;
        int var17_intLifetime2;
        int var17_intLifetime3;
        int var17_intLifetime4;
        var21 = Virogrid.field_F ? 1 : 0;
        try {
          sf.field_J = param0;
          oj.field_Vb = param2;
          qi.field_f = param3;
          bd.field_a = param12;
          vj.field_b = param4;
          vc.field_fb = param6;
          ch.field_j = param11;
          te.field_e = param14;
          p.field_e = param7;
          ic.field_f = param13;
          th.field_p = param10;
          uf.field_d = param8;
          jb.field_I = ke.a(32, param5, "lobby", "gameprivacy");
          m.field_f = ke.a(32, param5, "lobby", "ratedgame");
          lc.field_c = ke.a(32, param5, "lobby", "opentome");
          ph.field_m = ke.a(32, param5, "lobby", "allowspectators");
          cj.field_b = new String[5];
          cj.field_b[1] = ob.field_a;
          cj.field_b[0] = vi.field_j;
          cj.field_b[2] = wf.field_i;
          cj.field_b[3] = ca.field_R;
          cj.field_b[4] = ak.field_c;
          ij.field_m = new km(0L, (km) null);
          me.field_d = new km(0L, ag.field_d, tl.field_h);
          wm.field_m = new km(0L, he.field_Jb, wl.field_f);
          uf.field_j = new um(0L, new km(0L, (km) null), gg.field_M, ub.field_z);
          ij.field_m.a(0, me.field_d);
          if (ql.field_d) {
            ij.field_m.a(0, wm.field_m);
          }
          ij.field_m.a(0, uf.field_j);
          uf.field_j.field_Eb.b(18003, ti.field_h);
          uf.field_j.field_Eb.field_D = 1;
          var23 = uf.field_j.field_Eb;
          var24 = var23;
          var24.field_lb = 1;
          qd.field_f = new km(0L, ti.field_h);
          if (param1 <= 92) {
            return;
          }
          qd.field_f.field_lb = 1;
          s.field_b = new km(0L, mf.field_j, um.field_Ib.toUpperCase());
          ng.field_Z = new km(0L, kh.field_b, uf.field_o.toUpperCase());
          nk.field_I = new km(0L, cc.field_w);
          f.field_c = new km(0L, ag.field_d, pi.field_a);
          qn.field_H = new km(0L, jm.field_b, wf.field_g);
          fn.field_d = new km(0L, jm.field_b, lh.field_c);
          gk.field_b = new km(0L, jm.field_b, th.field_r);
          ec.field_C = new km(0L, jm.field_b, fh.field_d);
          qn.field_J = new km(0L, he.field_Jb, bf.field_k);
          ch.field_a = new um(0L, new km(0L, (km) null), gg.field_M, ub.field_z);
          nd.field_a = new km(0L, bd.field_b, dm.field_s.toUpperCase());
          nd.field_a.field_Y = ql.field_d;
          stackIn_7_0 = null;
          stackIn_7_1 = null;
          stackIn_7_2 = 0L;
          stackIn_7_3 = bd.field_b;
          if (ql.field_d) {
            stackIn_8_0 = null;
            stackIn_8_1 = null;
            stackIn_8_4 = we.field_f;
          } else {
            stackIn_8_0 = null;
            stackIn_8_1 = null;
            stackIn_8_4 = wb.field_l;
          }
          dc.field_R = new km(stackIn_7_2, stackIn_7_3, ((String) (Object) stackIn_8_4).toUpperCase());
          hg.field_p = new km(0L, (km) null);
          hg.field_p.a(0, ng.field_Z);
          hg.field_p.a(0, nk.field_I);
          nk.field_I.a(0, f.field_c);
          nk.field_I.a(0, qn.field_H);
          nk.field_I.a(0, fn.field_d);
          if (ql.field_d) {
            nk.field_I.a(0, gk.field_b);
          }
          nk.field_I.a(0, ec.field_C);
          nk.field_I.a(0, qn.field_J);
          nk.field_I.a(0, ch.field_a);
          if (ql.field_d) {
            hg.field_p.a(0, nd.field_a);
          }
          hg.field_p.a(0, dc.field_R);
          pa.field_o = new km(0L, ti.field_h);
          pa.field_o.field_D = 0;
          pa.field_o.field_lb = 1;
          nk.field_H = new km(0L, fa.field_n, kb.field_a.toUpperCase());
          jj.field_a = new km(0L, fn.field_e);
          jj.field_a.a(0, pa.field_o);
          jj.field_a.a(0, nk.field_H);
          l.field_b = new km(0L, gg.field_M);
          l.field_b.b(18003, ti.field_h);
          var16 = l.field_b;
          l.field_b.field_D = 1;
          var16.field_lb = 1;
          ia.field_d = new km(0L, (km) null);
          qh.field_R = new km(0L, ti.field_h);
          qh.field_R.field_lb = 1;
          kh.field_g = new km(0L, ag.field_d, tl.field_h);
          gn.field_F = new km(0L, he.field_Jb, wl.field_f);
          wm.field_r = new um(0L, new km(0L, (km) null), gg.field_M, ub.field_z);
          ia.field_d.a(0, qh.field_R);
          ia.field_d.a(0, kh.field_g);
          if (ql.field_d) {
            ia.field_d.a(0, gn.field_F);
          }
          ia.field_d.a(0, wm.field_r);
          fb.field_o = new km(0L, mf.field_j, mf.field_i.toUpperCase());
          qi.field_e = new km(0L, kh.field_b);
          nn.field_b = new km(0L, cc.field_w);
          qa.field_c = new km(0L, me.field_c, tk.field_a.toUpperCase());
          oe.field_b = new hk[4 + param9][];
          f.field_f = new km[param9 + 4];
          f.field_f[0] = new km(0L, ke.field_u, ul.field_b);
          oe.field_b[0] = new hk[6];
          for (var17_int = 0; var17_int < 5; var17_int++) {
            oe.field_b[0][var17_int + 1] = new hk(0L, vf.field_e, (km) null, ma.field_e, jb.field_I[var17_int], cj.field_b[var17_int]);
          }
          if (2 <= vj.field_b.length) {
            f.field_f[1] = new km(0L, ke.field_u, wg.field_d);
            array$0 = new hk[vj.field_b.length + 1];
            oe.field_b[1] = array$0;
            oe.field_b[1][0] = new hk(0L, vf.field_e, (km) null, ma.field_e, (mg) null, gn.field_I);
            for (var17_intLifetime1 = 0; var17_intLifetime1 < vj.field_b.length; var17_intLifetime1++) {
              oe.field_b[1][1 + var17_intLifetime1] = new hk(0L, vf.field_e, (km) null, ma.field_e, (mg) null, Integer.toString(vj.field_b[var17_intLifetime1]));
            }
          }
          f.field_f[2] = new km(0L, ke.field_u, field_i);
          oe.field_b[2] = new hk[]{new hk(0L, vf.field_e, (km) null, ma.field_e, (mg) null, gn.field_I), new hk(0L, vf.field_e, (km) null, ma.field_e, ph.field_m[0], vi.field_f), new hk(0L, vf.field_e, (km) null, ma.field_e, ph.field_m[1], ej.field_F)};
          if (qi.field_f > 1) {
            f.field_f[3] = new km(0L, ke.field_u, sm.field_c);
            array$1 = new hk[1 + qi.field_f];
            oe.field_b[3] = array$1;
            oe.field_b[3][0] = new hk(0L, vf.field_e, (km) null, ma.field_e, (mg) null, gn.field_I);
            for (var17_intLifetime2 = 0; var17_intLifetime2 < qi.field_f; var17_intLifetime2++) {
              oe.field_b[3][var17_intLifetime2 + 1] = new hk(0L, vf.field_e, (km) null, ma.field_e, (mg) null, te.field_e[var17_intLifetime2]);
            }
          }
          for (var17_intLifetime3 = 0; param9 > var17_intLifetime3; var17_intLifetime3++) {
            f.field_f[var17_intLifetime3 + 4] = new km(0L, ke.field_u, bd.field_a[var17_intLifetime3]);
            array$2 = new hk[1 + rb.a(255, (int) ic.field_f[var17_intLifetime3])];
            oe.field_b[4 + var17_intLifetime3] = array$2;
            oe.field_b[var17_intLifetime3 + 4][0] = new hk(0L, vf.field_e, (km) null, ma.field_e, (mg) null, gn.field_I);
            for (var18 = 0; var18 < (ic.field_f[var17_intLifetime3] & 255); var18++) {
              if (sf.field_J == null) {
                var19_ref = null;
              } else {
                if (null != sf.field_J[var17_intLifetime3]) {
                  var19_ref = sf.field_J[var17_intLifetime3][var18];
                } else {
                  var19_ref = null;
                }
              }
              if (uf.field_d != null) {
                if (uf.field_d[var17_intLifetime3] == null) {
                  var20 = null;
                } else {
                  var20 = uf.field_d[var17_intLifetime3][var18];
                }
              } else {
                var20 = null;
              }
              oe.field_b[4 + var17_intLifetime3][var18 + 1] = new hk(0L, vf.field_e, (km) null, ma.field_e, (mg) (var19_ref), (String) (var20));
            }
          }
          for (var17_intLifetime4 = 0; var17_intLifetime4 < param9 + 4; var17_intLifetime4++) {
            stackIn_45_0 = null;
            stackIn_45_1 = f.field_f[var17_intLifetime4];
            if (stackIn_45_0 != stackIn_45_1) {
              f.field_f[var17_intLifetime4].field_fb = 11;
            }
            if (null != oe.field_b[var17_intLifetime4]) {
              for (var18Lifetime1 = 0; var18Lifetime1 < oe.field_b[var17_intLifetime4].length; var18Lifetime1++) {
                if (null != oe.field_b[var17_intLifetime4][var18Lifetime1] &&
                  oe.field_b[var17_intLifetime4][var18Lifetime1].field_Fb != null) {
                  oe.field_b[var17_intLifetime4][var18Lifetime1].field_Fb.field_fb = 11;
                }
              }
            }
          }
          ed.field_c = new km(0L, bd.field_b);
          ii.field_d = new km(0L, bd.field_b);
          jk.field_b = new km(0L, da.field_n);
          jk.field_b.b(18003, ti.field_h);
          var17 = jk.field_b;
          jk.field_b.field_D = 1;
          var17.field_lb = 1;
          dm.field_r = new km(0L, (km) null);
          dm.field_r.a(0, qi.field_e);
          dm.field_r.a(0, nn.field_b);
          nn.field_b.a(0, qa.field_c);
          for (var18Lifetime2 = 0; 4 + param9 > var18Lifetime2; var18Lifetime2++) {
            if ((var18Lifetime2 != 1 ||
              !(vj.field_b.length < 2)) && (var18Lifetime2 != 3 ||
              !(qi.field_f <= 1))) {
              nn.field_b.a(0, f.field_f[var18Lifetime2]);
              for (var19 = 0; oe.field_b[var18Lifetime2].length > var19; var19++) {
                if (null != oe.field_b[var18Lifetime2][var19]) {
                  nn.field_b.a(0, oe.field_b[var18Lifetime2][var19]);
                }
              }
            }
          }
          dm.field_r.a(0, ed.field_c);
          dm.field_r.a(0, ii.field_d);
          dm.field_r.a(0, jk.field_b);
          jj.field_m = new km(0L, wh.field_a, lc.field_h.toUpperCase());
          na.field_Ib = new km(0L, fa.field_n, ob.field_b.toUpperCase());
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var15 = decompiledCaughtException;
          stackIn_76_0 = var15;
          stackIn_76_1 = new StringBuilder().append("tm.C(");
          if (param0 == null) {
            stackIn_77_2 = "null";
          } else {
            stackIn_77_2 = "{...}";
          }
          stackIn_79_1 = ((StringBuilder) (Object) stackIn_76_1).append(stackIn_77_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_80_2 = "null";
          } else {
            stackIn_80_2 = "{...}";
          }
          stackIn_82_1 = ((StringBuilder) (Object) stackIn_79_1).append(stackIn_80_2).append(',');
          if (param5 == null) {
            stackIn_83_2 = "null";
          } else {
            stackIn_83_2 = "{...}";
          }
          stackIn_85_1 = ((StringBuilder) (Object) stackIn_82_1).append(stackIn_83_2).append(',');
          if (param6 == null) {
            stackIn_86_2 = "null";
          } else {
            stackIn_86_2 = "{...}";
          }
          stackIn_88_1 = ((StringBuilder) (Object) stackIn_85_1).append(stackIn_86_2).append(',');
          if (param7 == null) {
            stackIn_89_2 = "null";
          } else {
            stackIn_89_2 = "{...}";
          }
          stackIn_91_1 = ((StringBuilder) (Object) stackIn_88_1).append(stackIn_89_2).append(',');
          if (param8 == null) {
            stackIn_92_2 = "null";
          } else {
            stackIn_92_2 = "{...}";
          }
          stackIn_94_1 = ((StringBuilder) (Object) stackIn_91_1).append(stackIn_92_2).append(',').append(param9).append(',');
          if (param10 == null) {
            stackIn_95_2 = "null";
          } else {
            stackIn_95_2 = "{...}";
          }
          stackIn_97_1 = ((StringBuilder) (Object) stackIn_94_1).append(stackIn_95_2).append(',');
          if (param11 == null) {
            stackIn_98_2 = "null";
          } else {
            stackIn_98_2 = "{...}";
          }
          stackIn_100_1 = ((StringBuilder) (Object) stackIn_97_1).append(stackIn_98_2).append(',');
          if (param12 == null) {
            stackIn_101_2 = "null";
          } else {
            stackIn_101_2 = "{...}";
          }
          stackIn_103_1 = ((StringBuilder) (Object) stackIn_100_1).append(stackIn_101_2).append(',');
          if (param13 == null) {
            stackIn_104_2 = "null";
          } else {
            stackIn_104_2 = "{...}";
          }
          stackIn_106_1 = ((StringBuilder) (Object) stackIn_103_1).append(stackIn_104_2).append(',');
          if (param14 == null) {
            stackIn_107_2 = "null";
          } else {
            stackIn_107_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_76_0), ((StringBuilder) (Object) stackIn_106_1).append(stackIn_107_2).append(')').toString());
        }
    }

    final static mg[] a(eh param0, int param1, int param2, int param3) {
        RuntimeException var4 = null;
        mg[] stackIn_2_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 4) {
            stackIn_2_0 = (mg[]) null;
            return stackIn_2_0;
          }
          if (hn.a(param0, param1, param3, (byte) 109)) {
            return dd.a((byte) -123);
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("tm.A(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private tm() throws Throwable {
        throw new Error();
    }

    static {
        field_j = "<%0> has joined your game.";
        field_i = "Allow spectators?";
        field_k = null;
    }
}
