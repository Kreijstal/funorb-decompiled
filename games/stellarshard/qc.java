/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qc {
    static boolean field_b;
    static boolean field_a;
    private pb[] field_c;

    final static int a(byte param0, boolean param1) {
        int stackIn_6_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_77_0 = 0;
        int stackIn_81_0 = 0;
        int stackIn_84_0 = 0;
        int stackIn_86_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = stellarshard.field_B;
        try {
          sl.field_b = sl.field_b + 65536;
          while (65536 <= wi.a(sl.field_b, (byte) 98, cj.field_d)) {
            gj.field_v = gj.field_v + 1;
            sl.field_b = sl.field_b - cj.field_d;
          }
          if (param0 > -110) {
            stackIn_6_0 = -72;
            return stackIn_6_0;
          }
          var2_int = -1;
          if (null != ed.field_a) {
            var2_int = ed.field_a.length;
          } else {
            if (null != dl.field_C) {
              var2_int = dl.field_C.length;
            }
          }
          if (var2_int != -1) {
            boolean decompiledFrameRemainder0 = true;
            if (ha.field_w < cj.field_a) {
              ha.field_w = ha.field_w + 1;
              if (cj.field_c < ha.field_w && (ed.field_a == null ||
                null == ed.field_a[nk.field_c])) {
                ha.field_w = ha.field_w - 1;
                decompiledFrameRemainder0 = false;
              }
              else {
                if (ha.field_w >= cj.field_a &&
                  ed.field_a[(1 + nk.field_c) % var2_int] == null) {
                  ha.field_w = ha.field_w - 1;
                }
              }
            }
            if (cj.field_a <= ha.field_w) {
              tc.field_w = nk.field_c;
              if (nj.field_g) {
                nk.field_c = nk.field_c + 1;
                if (var2_int <= nk.field_c) {
                  nk.field_c = nk.field_c - var2_int;
                }
              } else {
                nk.field_c = nk.field_c - 1;
                if (nk.field_c < 0) {
                  nk.field_c = nk.field_c + var2_int;
                }
              }
              ha.field_w = ha.field_w - cj.field_a;
            }
            if (ha.field_w > cj.field_c) {
              nj.field_g = true;
            }
          }
          if (ea.field_l != null) {
            var3 = -(ea.field_l.field_x / 2) + 357;
            var4 = 0;
            if (0 != gh.field_c &&
              var3 < oc.field_e &&
              oc.field_e < ea.field_l.field_y + var3) {
              if (-ea.field_l.field_v + 269 < di.field_b &&
                269 > di.field_b) {
                nj.field_g = false;
                var4 = 1;
                ha.field_w = cj.field_a;
              }
              if (di.field_b > 586 &&
                di.field_b < ea.field_l.field_v + 586) {
                var4 = 1;
                ha.field_w = cj.field_a;
                nj.field_g = true;
              }
            }
            if (var4 == 0 &&
              ha.field_w > cj.field_c &&
              eb.field_a > var3 &&
              ea.field_l.field_y + var3 > eb.field_a) {
              if (ni.field_e > 269 - ea.field_l.field_v &&
                ni.field_e < 269) {
                ha.field_w = cj.field_c;
              }
              if (ni.field_e > 586 &&
                586 + ea.field_l.field_v > ni.field_e) {
                ha.field_w = cj.field_c;
              }
            }
          }
          if (!param1) {
            return 0;
          }
          cd.field_L.a(af.a(1, ni.field_e, eb.field_a), af.a(1, di.field_b, oc.field_e), -1);
          if (cd.field_L.c(-18)) {
            if (0 == cd.field_L.field_f) {
              stackIn_65_0 = 3;
              return stackIn_65_0;
            }
            if (cd.field_L.field_f == 1) {
              stackIn_69_0 = 2;
              return stackIn_69_0;
            }
          }
          stackIn_72_0 = 107;
          while (true) {
            if (!qh.c(stackIn_72_0)) {
              stackIn_86_0 = 0;
              return stackIn_86_0;
            }
            cd.field_L.a(0, 84);
            if (cd.field_L.c(-10)) {
              if (cd.field_L.field_f == 0) {
                stackIn_77_0 = 3;
                return stackIn_77_0;
              }
              if (cd.field_L.field_f == 1) {
                stackIn_81_0 = 1;
                return stackIn_81_0;
              }
            }
            if (gi.field_f != 13) {
              stackIn_72_0 = 107;
              continue;
            }
            break;
          }
          stackIn_84_0 = 1;
          return stackIn_84_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var2), "qc.C(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(int param0, boolean param1, int param2) {
        int stackIn_50_0 = 0;
        int stackIn_53_0 = 0;
        String[] stackIn_60_0 = null;
        int stackIn_60_1 = 0;
        String stackIn_61_2 = null;
        String[] stackIn_66_0 = null;
        int stackIn_66_1 = 0;
        String stackIn_67_2 = null;
        int stackIn_87_0 = 0;
        String stackIn_87_1 = null;
        boolean stackIn_88_2 = false;
        int stackIn_110_0 = 0;
        int stackIn_111_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        String[] var4_ref_String__ = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String[] var10 = null;
        String var11 = null;
        String var12 = null;
        String[] var4_ref_String__Lifetime1;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var6Lifetime1;
        int var8Lifetime1;
        int var3_intLifetime1;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime2;
        int var8Lifetime3;
        int var5Lifetime2Lifetime1;
        int var7Lifetime1Lifetime1;
        var9 = stellarshard.field_B;
        try {
          qh.field_g = true;
          rb.field_s = param0;
          if (rb.field_s == 0) {
            var3_int = nj.a(gg.field_d, pe.field_c, hc.field_m, (byte) -128, ii.field_G);
            var4 = 3 + var3_int;
            sj.field_J = new int[var4];
            stellarshard.field_L = new String[var4];
            for (var5 = 0; var5 < var4; var5++) {
              sj.field_J[var5] = -1;
            }
            pk.field_j = new int[2];
            for (var5 = 0; var5 < var3_int; var5++) {
              stellarshard.field_L[var5] = hc.field_m[var5];
            }
            stellarshard.field_L[-3 + var4] = "";
            stellarshard.field_L[-2 + var4] = kk.field_l;
            sj.field_J[-2 + var4] = 0;
            pk.field_j[0] = 4;
            stellarshard.field_L[-1 + var4] = td.field_a;
            sj.field_J[var4 - 1] = 1;
            pk.field_j[1] = 5;
          } else if (rb.field_s == 1) {
            var3_int = nj.a(gg.field_d, pe.field_c, hc.field_m, (byte) -128, ii.field_G);
            var4 = 2 + var3_int;
            stellarshard.field_L = new String[var4];
            sj.field_J = new int[var4];
            for (var5 = 0; var4 > var5; var5++) {
              sj.field_J[var5] = -1;
            }
            pk.field_j = new int[1];
            for (var5 = 0; var5 < var3_int; var5++) {
              stellarshard.field_L[var5] = hc.field_m[var5];
            }
            stellarshard.field_L[-2 + var4] = "";
            stellarshard.field_L[var4 - 1] = td.field_a;
            sj.field_J[var4 - 1] = 0;
            pk.field_j[0] = 5;
          } else if (rb.field_s != 2) {
            if (rb.field_s == 3) {
              if (ic.field_d.field_p) {
                var3_int = nj.a(gg.field_d, pe.field_c, hc.field_m, (byte) -128, ei.field_E);
              } else {
                var3_int = nj.a(gg.field_d, pe.field_c, hc.field_m, (byte) -128, ld.field_D);
              }
              var4 = var3_int + 2;
              stellarshard.field_L = new String[var4];
              sj.field_J = new int[var4];
              for (var5 = 0; var4 > var5; var5++) {
                sj.field_J[var5] = -1;
              }
              pk.field_j = new int[1];
              for (var5 = 0; var5 < var3_int; var5++) {
                stellarshard.field_L[var5] = hc.field_m[var5];
              }
              stellarshard.field_L[var4 - 2] = "";
              stellarshard.field_L[-1 + var4] = td.field_a;
              sj.field_J[var4 - 1] = 0;
              pk.field_j[0] = 5;
            } else if (rb.field_s == 4) {
              var3_int = nj.a(gg.field_d, pe.field_c, hc.field_m, (byte) -128, wh.field_d);
              var4 = var3_int + 2;
              sj.field_J = new int[var4];
              stellarshard.field_L = new String[var4];
              for (var5 = 0; var5 < var4; var5++) {
                sj.field_J[var5] = -1;
              }
              pk.field_j = new int[1];
              for (var5 = 0; var3_int > var5; var5++) {
                stellarshard.field_L[var5] = hc.field_m[var5];
              }
              stellarshard.field_L[var4 - 2] = "";
              stellarshard.field_L[var4 - 1] = td.field_a;
              sj.field_J[-1 + var4] = 0;
              pk.field_j[0] = 5;
            } else {
              if (rb.field_s != 5) {
                throw new IllegalArgumentException();
              }
              var3_int = nj.a(gg.field_d, pe.field_c, hc.field_m, (byte) -128, df.field_k);
              var4 = var3_int + 3;
              stellarshard.field_L = new String[var4];
              sj.field_J = new int[var4];
              for (var5 = 0; var5 < var4; var5++) {
                sj.field_J[var5] = -1;
              }
              pk.field_j = new int[2];
              for (var5 = 0; var5 < var3_int; var5++) {
                stellarshard.field_L[var5] = hc.field_m[var5];
              }
              stellarshard.field_L[var4 - 3] = "";
              stellarshard.field_L[var4 - 2] = ha.field_v;
              sj.field_J[var4 - 2] = 0;
              pk.field_j[0] = 3;
              stellarshard.field_L[var4 - 1] = td.field_a;
              sj.field_J[-1 + var4] = 1;
              pk.field_j[1] = 5;
            }
          } else {
            var3_int = nj.a(gg.field_d, pe.field_c, hc.field_m, (byte) -128, h.a(le.field_q, 0, new String[]{"<br><%0><br>"}));
            var4 = -1;
            for (var5 = 0; var5 < var3_int; var5++) {
              if (!"<%0>".equals(hc.field_m[var5])) {
                continue;
              }
              var4 = var5;
              break;
            }
            if (var4 == -1) {
              throw new IllegalStateException();
            }
            pd.field_g = new String[var4];
            ri.a(hc.field_m, 0, pd.field_g, 0, var4);
            fb.field_e = new String[-var4 + (var3_int - 1)];
            ri.a(hc.field_m, var4 + 1, fb.field_e, 0, var3_int + (-var4 - 1));
            var3_int = nj.a(gg.field_d, pe.field_c, hc.field_m, (byte) -128, h.a(dl.field_K, 0, new String[]{"<br><%0><br>"}));
            var4 = -1;
            for (var5 = 0; var3_int > var5; var5++) {
              if (!"<%0>".equals(hc.field_m[var5])) {
                continue;
              }
              var4 = var5;
              break;
            }
            if (var4 == -1) {
              throw new IllegalStateException();
            }
            bb.field_k = new String[var4];
            ri.a(hc.field_m, 0, bb.field_k, 0, var4);
            o.field_g = new String[-var4 + (var3_int - 1)];
            ri.a(hc.field_m, 1 + var4, o.field_g, 0, -var4 + (var3_int - 1));
            if (pd.field_g.length < bb.field_k.length) {
              stackIn_50_0 = bb.field_k.length;
            } else {
              stackIn_50_0 = pd.field_g.length;
            }
            var5 = stackIn_50_0;
            if (o.field_g.length <= fb.field_e.length) {
              stackIn_53_0 = fb.field_e.length;
            } else {
              stackIn_53_0 = o.field_g.length;
            }
            var6 = stackIn_53_0;
            var7 = var5 + 7 + var6;
            sj.field_J = new int[var7];
            stellarshard.field_L = new String[var7];
            for (var8 = 0; var7 > var8; var8++) {
              sj.field_J[var8] = -1;
            }
            sj.field_J[1] = 0;
            stellarshard.field_L[1] = am.field_b;
            pk.field_j = new int[2];
            stellarshard.field_L[0] = oa.field_B;
            pk.field_j[0] = 5;
            pk.field_j[1] = 2;
            sj.field_J[3] = 1;
            stellarshard.field_L[2] = vl.field_i;
            stellarshard.field_L[5] = "";
            stellarshard.field_L[4] = tk.field_a;
            stellarshard.field_L[3] = wf.field_c;
            for (var8Lifetime2 = 0; var5 > var8Lifetime2; var8Lifetime2++) {
              stackIn_60_0 = stellarshard.field_L;
              stackIn_60_1 = var8Lifetime2 + 6;
              if (-var5 + (bb.field_k.length + var8Lifetime2) >= 0) {
                stackIn_61_2 = bb.field_k[-var5 + bb.field_k.length + var8Lifetime2];
              } else {
                stackIn_61_2 = "";
              }
              stackIn_60_0[stackIn_60_1] = stackIn_61_2;
            }
            stellarshard.field_L[6 + var5] = null;
            sj.field_J[6 + var5] = -2;
            for (var8Lifetime3 = 0; var6 > var8Lifetime3; var8Lifetime3++) {
              stackIn_66_0 = stellarshard.field_L;
              stackIn_66_1 = var8Lifetime3 + (7 + var5);
              if (var8Lifetime3 >= o.field_g.length) {
                stackIn_67_2 = "";
              } else {
                stackIn_67_2 = o.field_g[var8Lifetime3];
              }
              stackIn_66_0[stackIn_66_1] = stackIn_67_2;
            }
            jj.field_p = ih.a((byte) -98);
          }
          ua.field_i.field_i = pk.field_j.length;
          var3_intLifetime1 = 0;
          for (var4Lifetime1 = 0; var4Lifetime1 < stellarshard.field_L.length; var4Lifetime1++) {
            stackIn_87_0 = -39;
            stackIn_87_1 = stellarshard.field_L[var4Lifetime1];
            stackIn_88_2 = !(sj.field_J[var4Lifetime1] < 0);
            var5Lifetime1 = qe.$cfr$intArgs$a$590e95718a07(stackIn_87_0, stackIn_87_1, stackIn_88_2);
            if (var5Lifetime1 > var3_intLifetime1) {
              var3_intLifetime1 = var5Lifetime1;
            }
          }
          if (2 == rb.field_s) {
            var10 = pd.field_g;
            var4_ref_String__ = var10;
            for (var5Lifetime2 = 0; var5Lifetime2 < var10.length; var5Lifetime2++) {
              var11 = var10[var5Lifetime2];
              var7Lifetime1 = qe.$cfr$intArgs$a$590e95718a07(-33, var11, false);
              if (var7Lifetime1 > var3_intLifetime1) {
                var3_intLifetime1 = var7Lifetime1;
              }
            }
            var4_ref_String__Lifetime1 = fb.field_e;
            for (var5Lifetime2Lifetime1 = 0; var5Lifetime2Lifetime1 < var4_ref_String__Lifetime1.length; var5Lifetime2Lifetime1++) {
              var12 = var4_ref_String__Lifetime1[var5Lifetime2Lifetime1];
              var7Lifetime1Lifetime1 = qe.$cfr$intArgs$a$590e95718a07(-40, var12, false);
              if (var7Lifetime1Lifetime1 > var3_intLifetime1) {
                var3_intLifetime1 = var7Lifetime1Lifetime1;
              }
            }
          }
          dd.field_e = s.field_b + var3_intLifetime1 - (var3_intLifetime1 >> 1);
          od.field_r = -(var3_intLifetime1 >> 1) + s.field_b;
          fl.field_a = ua.field_i.field_i * (nh.field_h + nh.field_f << 1);
          for (var4Lifetime2 = 0; var4Lifetime2 < stellarshard.field_L.length; var4Lifetime2++) {
            stackIn_110_0 = fl.field_a;
            if (sj.field_J[var4Lifetime2] >= 0) {
              stackIn_111_1 = na.field_a;
            } else {
              stackIn_111_1 = l.field_e;
            }
            fl.field_a = stackIn_110_0 + stackIn_111_1;
          }
          rg.field_F = -(fl.field_a >> 1) + eh.field_g;
          vl.field_o = new int[stellarshard.field_L.length][];
          var4Lifetime3 = param2;
          var5Lifetime3 = rg.field_F;
          while (var4Lifetime3 < stellarshard.field_L.length) {
            var6Lifetime1 = sj.field_J[var4Lifetime3];
            if (var6Lifetime1 >= 0) {
              var7Lifetime2 = qe.$cfr$intArgs$a$590e95718a07(-21, stellarshard.field_L[var4Lifetime3], true);
              var5Lifetime3 = var5Lifetime3 + nh.field_f;
              var8Lifetime1 = s.field_b - (var7Lifetime2 >> 1);
              vl.field_o[var4Lifetime3] = new int[4];
              vl.field_o[var4Lifetime3][0] = var8Lifetime1 - le.field_k;
              vl.field_o[var4Lifetime3][1] = var5Lifetime3;
              vl.field_o[var4Lifetime3][2] = var7Lifetime2 + (le.field_k << 1);
              vl.field_o[var4Lifetime3][3] = na.field_a + (nh.field_h << 1);
              var5Lifetime3 = var5Lifetime3 + (nh.field_f + ((nh.field_h << 1) + na.field_a));
            } else {
              var5Lifetime3 = var5Lifetime3 + l.field_e;
            }
            var4Lifetime3++;
          }
          if (rb.field_s != 2) {
            ua.field_i.a(eb.a(eb.field_a, ni.field_e, -112), 0, param1, false);
          } else {
            ua.field_i.a(-1, -1, param1, false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var3), "qc.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(boolean param0, int param1, int param2, int param3, int param4) {
        if (!param0) {
          field_b = false;
        }
        ed.a(-6313, param4, param3, this.field_c, param1, param2);
    }

    final static int a(int param0) {
        if (param0 != 1) {
          field_a = true;
        }
        return gj.field_t;
    }

    final static boolean a(int param0, char param1) {
        boolean stackIn_10_0 = false;
        if (param0 != -1750942672) {
          field_a = true;
        }
        stackIn_10_0 = ((!(param1 < 65) &&
          !(90 < param1)) ||
          (!(param1 < 97) &&
          !(param1 > 122)));
        return stackIn_10_0;
    }

    qc(pb[] param0) {
        try {
          this.field_c = param0;
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "qc.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, byte param12, int param13, int param14, int param15, int param16) {
        int var17_int = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var34 = 0;
        int var35 = 0;
        int var42 = 0;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_78_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var17 = null;
        int var33 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        int var35Lifetime1;
        int var36Lifetime1;
        int var37Lifetime1;
        int var38Lifetime1;
        int var39Lifetime1;
        int var40Lifetime1;
        int var36Lifetime2;
        int var36Lifetime3;
        int var37Lifetime2;
        int var38Lifetime2;
        int var39Lifetime2;
        int var40Lifetime2;
        var42 = stellarshard.field_B;
        try {
          if (param7 >= 0 &&
            cc.field_c > param9) {
            if (param5 < 0 &&
              param16 < 0 &&
              param0 < 0) {
              return;
            }
            if (param5 >= cc.field_m &&
              param16 >= cc.field_m &&
              param0 >= cc.field_m) {
              return;
            }
            if (param12 != 127) {
              field_a = false;
            }
            var34 = param7 - param9;
            if (param9 != param10) {
              var18 = param5 << 16;
              var17_int = param5 << 16;
              var26 = param11 << 16;
              var25 = param11 << 16;
              var22 = param13 << 16;
              var21 = param13 << 16;
              var30 = param15 << 16;
              var29 = param15 << 16;
              var35 = param10 - param9;
              var20 = (-param5 + param0 << 16) / var34;
              var19 = (param16 - param5 << 16) / var35;
              if (var19 < var20) {
                var27 = (param14 - param11 << 16) / var35;
                var33 = 0;
                var23 = (param8 - param13 << 16) / var35;
                var31 = (param3 - param15 << 16) / var35;
                var32 = (-param15 + param1 << 16) / var34;
                var28 = (param6 - param11 << 16) / var34;
                var24 = (param4 - param13 << 16) / var34;
              } else {
                var24 = (-param13 + param8 << 16) / var35;
                var32 = (-param15 + param3 << 16) / var35;
                var28 = (param14 - param11 << 16) / var35;
                var31 = (-param15 + param1 << 16) / var34;
                var27 = (-param11 + param6 << 16) / var34;
                var36 = var19;
                var19 = var20;
                var20 = var36;
                var23 = (-param13 + param4 << 16) / var34;
                var33 = 1;
              }
              boolean decompiledFrameRemainder0 = true;
              if (param9 < 0) {
                if (param10 < 0) {
                  param9 = -param9 + param10;
                  var29 = var29 + var31 * param9;
                  var22 = var22 + param9 * var24;
                  var25 = var25 + var27 * param9;
                  var21 = var21 + var23 * param9;
                  var18 = var18 + param9 * var20;
                  var30 = var30 + var32 * param9;
                  var26 = var26 + param9 * var28;
                  var17_int = var17_int + param9 * var19;
                  param9 = param10;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  param9 = -param9;
                  var25 = var25 + var27 * param9;
                  var17_int = var17_int + param9 * var19;
                  var18 = var18 + param9 * var20;
                  var22 = var22 + var24 * param9;
                  var29 = var29 + param9 * var31;
                  var26 = var26 + param9 * var28;
                  var30 = var30 + var32 * param9;
                  var21 = var21 + param9 * var23;
                  param9 = 0;
                }
              }
              if (decompiledFrameRemainder0) {
                var36Lifetime2 = cc.field_i[param9];
                while (param10 > param9) {
                  var37 = var17_int >> 16;
                  if (cc.field_m > var37) {
                    var38 = (var18 >> 16) - (var17_int >> 16);
                    if (var38 == 0) {
                      if (var37 >= 0 &&
                        var37 < cc.field_m) {
                        vk.a(var25, 0, var29, 0, param2, (byte) 96, var36Lifetime2 + var37, var21, var38, 0);
                      }
                    } else {
                      var39 = (-var21 + var22) / var38;
                      var40 = (-var25 + var26) / var38;
                      var41 = (var30 - var29) / var38;
                      if (var37 + var38 >= cc.field_m) {
                        var38 = -1 - var37 + cc.field_m;
                      }
                      if (var37 >= 0) {
                        vk.a(var25, var41, var29, var40, param2, (byte) 71, var36Lifetime2 + var37, var21, var38, var39);
                      } else {
                        vk.a(-(var37 * var40) + var25, var41, var29 - var41 * var37, var40, param2, (byte) 63, var36Lifetime2, var21 - var37 * var39, var37 + var38, var39);
                      }
                    }
                  }
                  param9++;
                  if (cc.field_c <= param9) {
                    return;
                  }
                  var22 = var22 + var24;
                  var17_int = var17_int + var19;
                  var25 = var25 + var27;
                  var26 = var26 + var28;
                  var29 = var29 + var31;
                  var36Lifetime2 = var36Lifetime2 + ti.field_i;
                  var30 = var30 + var32;
                  var18 = var18 + var20;
                  var21 = var21 + var23;
                }
              }
              var36Lifetime3 = -param10 + param7;
              if (var36Lifetime3 == 0) {
                var23 = 0;
                var28 = 0;
                var31 = 0;
                var24 = 0;
                var32 = 0;
                var20 = 0;
                var27 = 0;
                var19 = 0;
              } else {
                var37Lifetime2 = param0 << 16;
                var38Lifetime2 = param4 << 16;
                var39Lifetime2 = param6 << 16;
                if (var33 == 0) {
                  var17_int = param16 << 16;
                  var29 = param3 << 16;
                  var21 = param8 << 16;
                  var25 = param14 << 16;
                } else {
                  var22 = param8 << 16;
                  var30 = param3 << 16;
                  var18 = param16 << 16;
                  var26 = param14 << 16;
                }
                var40Lifetime2 = param1 << 16;
                var31 = (var40Lifetime2 - var29) / var36Lifetime3;
                var23 = (-var21 + var38Lifetime2) / var36Lifetime3;
                var24 = (-var22 + var38Lifetime2) / var36Lifetime3;
                var20 = (var37Lifetime2 - var18) / var36Lifetime3;
                var27 = (-var25 + var39Lifetime2) / var36Lifetime3;
                var28 = (-var26 + var39Lifetime2) / var36Lifetime3;
                var32 = (var40Lifetime2 - var30) / var36Lifetime3;
                var19 = (-var17_int + var37Lifetime2) / var36Lifetime3;
              }
            } else {
              if (param9 == param7) {
                var25 = param11;
                var28 = 0;
                var24 = 0;
                var20 = 0;
                var27 = 0;
                var18 = param16 << 16;
                var17_int = param5 << 16;
                var31 = 0;
                var30 = param3;
                var19 = 0;
                var32 = 0;
                var23 = 0;
                var22 = param8;
                var29 = param15;
                var21 = param13;
                var26 = param14;
              } else {
                var35 = -param10 + param7;
                if (param16 <= param5) {
                  var25 = param14 << 16;
                  var27 = (param6 - param14 << 16) / var35;
                  var30 = param15 << 16;
                  var20 = (param0 - param5 << 16) / var34;
                  var31 = (param1 - param3 << 16) / var35;
                  var18 = param5 << 16;
                  var29 = param3 << 16;
                  var23 = (param4 - param8 << 16) / var35;
                  var28 = (param6 - param11 << 16) / var34;
                  var19 = (-param16 + param0 << 16) / var35;
                  var17_int = param16 << 16;
                  var32 = (-param15 + param1 << 16) / var34;
                  var22 = param13 << 16;
                  var21 = param8 << 16;
                  var24 = (param4 - param13 << 16) / var34;
                  var26 = param11 << 16;
                } else {
                  var26 = param14 << 16;
                  var29 = param15 << 16;
                  var27 = (-param11 + param6 << 16) / var34;
                  var23 = (param4 - param13 << 16) / var34;
                  var21 = param13 << 16;
                  var20 = (-param16 + param0 << 16) / var35;
                  var28 = (-param14 + param6 << 16) / var35;
                  var19 = (-param5 + param0 << 16) / var34;
                  var30 = param3 << 16;
                  var18 = param16 << 16;
                  var17_int = param5 << 16;
                  var22 = param8 << 16;
                  var31 = (-param15 + param1 << 16) / var34;
                  var32 = (param1 - param3 << 16) / var35;
                  var25 = param11 << 16;
                  var24 = (-param8 + param4 << 16) / var35;
                }
              }
              var33 = 0;
              if (param9 < 0) {
                param9 = Math.min(-param9, param10 - param9);
                var25 = var25 + var27 * param9;
                var30 = var30 + param9 * var32;
                var17_int = var17_int + param9 * var19;
                var22 = var22 + var24 * param9;
                var21 = var21 + param9 * var23;
                var29 = var29 + var31 * param9;
                var18 = var18 + param9 * var20;
                var26 = var26 + param9 * var28;
                param9 = 0;
              }
            }
            if (0 > param9) {
              param9 = -param9;
              var21 = var21 + param9 * var23;
              var25 = var25 + param9 * var27;
              var26 = var26 + param9 * var28;
              var22 = var22 + var24 * param9;
              var17_int = var17_int + var19 * param9;
              var29 = var29 + var31 * param9;
              var18 = var18 + var20 * param9;
              var30 = var30 + param9 * var32;
              param9 = 0;
            }
            var35Lifetime1 = cc.field_i[param9];
            while (param7 > param9) {
              var36Lifetime1 = var17_int >> 16;
              if (var36Lifetime1 < cc.field_m) {
                var37Lifetime1 = (var18 >> 16) - (var17_int >> 16);
                if (var37Lifetime1 != 0) {
                  var38Lifetime1 = (var22 - var21) / var37Lifetime1;
                  var39Lifetime1 = (-var25 + var26) / var37Lifetime1;
                  var40Lifetime1 = (var30 - var29) / var37Lifetime1;
                  if (cc.field_m <= var37Lifetime1 + var36Lifetime1) {
                    var37Lifetime1 = -var36Lifetime1 + (cc.field_m - 1);
                  }
                  if (var36Lifetime1 < 0) {
                    vk.a(var25 - var39Lifetime1 * var36Lifetime1, var40Lifetime1, -(var40Lifetime1 * var36Lifetime1) + var29, var39Lifetime1, param2, (byte) 92, var35Lifetime1, -(var38Lifetime1 * var36Lifetime1) + var21, var37Lifetime1 + var36Lifetime1, var38Lifetime1);
                  } else {
                    vk.a(var25, var40Lifetime1, var29, var39Lifetime1, param2, (byte) 77, var35Lifetime1 + var36Lifetime1, var21, var37Lifetime1, var38Lifetime1);
                  }
                } else {
                  if (var36Lifetime1 >= 0 &&
                    cc.field_m > var36Lifetime1) {
                    vk.a(var25, 0, var29, 0, param2, (byte) 94, var36Lifetime1 + var35Lifetime1, var21, var37Lifetime1, 0);
                  }
                }
              }
              param9++;
              if (param9 >= cc.field_c) {
                return;
              }
              var26 = var26 + var28;
              var21 = var21 + var23;
              var30 = var30 + var32;
              var18 = var18 + var20;
              var35Lifetime1 = var35Lifetime1 + ti.field_i;
              var22 = var22 + var24;
              var25 = var25 + var27;
              var17_int = var17_int + var19;
              var29 = var29 + var31;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var17 = decompiledCaughtException;
          stackIn_77_0 = var17;
          stackIn_77_1 = new StringBuilder().append("qc.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_78_2 = "null";
          } else {
            stackIn_78_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_77_0), ((StringBuilder) (Object) stackIn_77_1).append(stackIn_78_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',').append(param16).append(')').toString());
        }
    }

    static {
        field_b = false;
        field_a = false;
    }
}
