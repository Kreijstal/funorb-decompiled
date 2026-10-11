/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class kk extends rg {
    static hj field_A;
    int field_y;
    static int[][] field_C;
    static bp field_D;
    static String field_B;
    static String field_E;
    static float field_w;
    static int field_z;
    static int field_F;
    static String field_G;
    static vh field_x;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        na.field_f = param4;
        wm.field_Nb = param0;
        or.field_a = param2;
        if (param6 != 1727215554) {
          kk.f(-21);
        }
        la.field_f = param3;
        if (na.field_f - param1 >= la.field_f - param5) {
          stackIn_5_0 = -param5 + la.field_f;
        } else {
          stackIn_5_0 = na.field_f - param1;
        }
        hd.field_I = stackIn_5_0;
        if (param1 + na.field_f <= param5 + la.field_f) {
          stackIn_8_0 = la.field_f + param5;
        } else {
          stackIn_8_0 = param1 + na.field_f;
        }
        wh.field_f = stackIn_8_0;
        if (wm.field_Nb - param5 <= -param1 + or.field_a) {
          stackIn_11_0 = -param5 + wm.field_Nb;
        } else {
          stackIn_11_0 = or.field_a - param1;
        }
        ic.field_a = stackIn_11_0;
        if (or.field_a + param1 <= param5 + wm.field_Nb) {
          stackIn_14_0 = param5 + wm.field_Nb;
        } else {
          stackIn_14_0 = param1 + or.field_a;
        }
        na.field_c = stackIn_14_0;
        if (ic.field_a < qh.field_c << 2) {
          if (qh.field_c << 2 > na.field_c) {
            na.field_c = qh.field_c << 2;
          }
          ic.field_a = qh.field_c << 2;
        }
        if (qh.field_b << 2 > hd.field_I) {
          hd.field_I = qh.field_b << 2;
          if (wh.field_f < qh.field_b << 2) {
            wh.field_f = qh.field_b << 2;
          }
        }
        if (na.field_c > qh.field_g << 2) {
          na.field_c = qh.field_g << 2;
          if (ic.field_a > qh.field_g << 2) {
            ic.field_a = qh.field_g << 2;
          }
        }
        if (wh.field_f > qh.field_j << 2) {
          if (hd.field_I > qh.field_j << 2) {
            hd.field_I = qh.field_j << 2;
          }
          wh.field_f = qh.field_j << 2;
        }
    }

    final static void g(int param0) {
        s.field_c[16].a(dj.field_m, true);
        s.field_c[15].a(ua.field_t, true);
        s.field_c[17].a(ml.field_k, true);
        int var1 = 125 % ((-17 - param0) / 34);
        if (!mg.a(true)) {
          s.field_c[3].a(sh.field_O, true);
          s.field_c[10].a(kc.field_h, true);
          s.field_c[11].a(fq.field_Hb, true);
          s.field_c[12].a(ao.field_Nb, true);
          s.field_c[8].a(ac.field_r, true);
          s.field_c[24].a(ud.field_G, true);
          s.field_c[9].a(w.field_d, true);
        }
    }

    final static void a(boolean param0, int param1, int param2) {
        int stackIn_52_0 = 0;
        int stackIn_55_0 = 0;
        String[] stackIn_62_0 = null;
        int stackIn_62_1 = 0;
        String stackIn_63_2 = null;
        String[] stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        int stackIn_67_2 = 0;
        int stackIn_67_3 = 0;
        String stackIn_70_2 = null;
        String stackIn_90_0 = null;
        boolean stackIn_91_1 = false;
        int stackIn_114_0 = 0;
        int stackIn_115_1 = 0;
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
        var9 = Pool.field_O;
        try {
          lk.field_o = true;
          oa.field_h = param2;
          if (oa.field_h == 0) {
            var3_int = rg.a(wj.field_T, ih.field_c, lg.field_v, dq.field_f, 0);
            var4 = 3 + var3_int;
            bm.field_c = new int[var4];
            dq.field_j = new String[var4];
            for (var5 = 0; var4 > var5; var5++) {
              bm.field_c[var5] = -1;
            }
            mb.field_c = new int[2];
            for (var5 = 0; var3_int > var5; var5++) {
              dq.field_j[var5] = ih.field_c[var5];
            }
            dq.field_j[var4 - 3] = "";
            dq.field_j[var4 - 2] = wp.field_h;
            bm.field_c[-2 + var4] = 0;
            mb.field_c[0] = 4;
            dq.field_j[-1 + var4] = hi.field_i;
            bm.field_c[var4 - 1] = 1;
            mb.field_c[1] = 5;
          } else if (oa.field_h == 1) {
            var3_int = rg.a(wj.field_T, ih.field_c, lg.field_v, dq.field_f, 0);
            var4 = 2 + var3_int;
            dq.field_j = new String[var4];
            bm.field_c = new int[var4];
            for (var5 = 0; var5 < var4; var5++) {
              bm.field_c[var5] = -1;
            }
            mb.field_c = new int[1];
            for (var5 = 0; var5 < var3_int; var5++) {
              dq.field_j[var5] = ih.field_c[var5];
            }
            dq.field_j[-2 + var4] = "";
            dq.field_j[var4 - 1] = hi.field_i;
            bm.field_c[var4 - 1] = 0;
            mb.field_c[0] = 5;
          } else if (oa.field_h != 2) {
            if (oa.field_h == 3) {
              if (lg.field_s.field_k) {
                var3_int = rg.a(wj.field_T, ih.field_c, ih.field_b, dq.field_f, param1 ^ 4);
              } else {
                var3_int = rg.a(wj.field_T, ih.field_c, lc.field_T, dq.field_f, 0);
              }
              var4 = 2 + var3_int;
              bm.field_c = new int[var4];
              dq.field_j = new String[var4];
              for (var5 = 0; var5 < var4; var5++) {
                bm.field_c[var5] = -1;
              }
              mb.field_c = new int[1];
              for (var5 = 0; var5 < var3_int; var5++) {
                dq.field_j[var5] = ih.field_c[var5];
              }
              dq.field_j[-2 + var4] = "";
              dq.field_j[-1 + var4] = hi.field_i;
              bm.field_c[-1 + var4] = 0;
              mb.field_c[0] = 5;
            } else if (4 == oa.field_h) {
              var3_int = rg.a(wj.field_T, ih.field_c, wh.field_i, dq.field_f, 0);
              var4 = 2 + var3_int;
              bm.field_c = new int[var4];
              dq.field_j = new String[var4];
              for (var5 = 0; var4 > var5; var5++) {
                bm.field_c[var5] = -1;
              }
              mb.field_c = new int[1];
              for (var5 = 0; var5 < var3_int; var5++) {
                dq.field_j[var5] = ih.field_c[var5];
              }
              dq.field_j[-2 + var4] = "";
              dq.field_j[var4 - 1] = hi.field_i;
              bm.field_c[-1 + var4] = 0;
              mb.field_c[0] = 5;
            } else {
              if (oa.field_h != 5) {
                throw new IllegalArgumentException();
              }
              var3_int = rg.a(wj.field_T, ih.field_c, de.field_c, dq.field_f, param1 ^ 4);
              var4 = 3 + var3_int;
              bm.field_c = new int[var4];
              dq.field_j = new String[var4];
              for (var5 = 0; var5 < var4; var5++) {
                bm.field_c[var5] = -1;
              }
              mb.field_c = new int[2];
              for (var5 = 0; var5 < var3_int; var5++) {
                dq.field_j[var5] = ih.field_c[var5];
              }
              dq.field_j[var4 - 3] = "";
              dq.field_j[var4 - 2] = hg.field_b;
              bm.field_c[var4 - 2] = 0;
              mb.field_c[0] = 3;
              dq.field_j[var4 - 1] = hi.field_i;
              bm.field_c[-1 + var4] = 1;
              mb.field_c[1] = 5;
            }
          } else {
            var3_int = rg.a(wj.field_T, ih.field_c, nr.a(new String[]{"<br><%0><br>"}, param1 - 5, rl.field_g), dq.field_f, 0);
            var4 = -1;
            for (var5 = 0; var5 < var3_int; var5++) {
              if (!"<%0>".equals(ih.field_c[var5])) {
                continue;
              }
              var4 = var5;
              break;
            }
            if (-1 == var4) {
              throw new IllegalStateException();
            }
            hk.field_n = new String[var4];
            qn.a(ih.field_c, 0, hk.field_n, 0, var4);
            rq.field_H = new String[-1 + var3_int - var4];
            qn.a(ih.field_c, 1 + var4, rq.field_H, 0, -var4 + var3_int - 1);
            var4 = -1;
            var3_int = rg.a(wj.field_T, ih.field_c, nr.a(new String[]{"<br><%0><br>"}, -1, cf.field_j), dq.field_f, 0);
            for (var5 = 0; var3_int > var5; var5++) {
              if (!"<%0>".equals(ih.field_c[var5])) {
                continue;
              }
              var4 = var5;
              break;
            }
            if (-1 == var4) {
              throw new IllegalStateException();
            }
            va.field_W = new String[var4];
            qn.a(ih.field_c, 0, va.field_W, 0, var4);
            fo.field_a = new String[-1 + (var3_int - var4)];
            qn.a(ih.field_c, 1 + var4, fo.field_a, 0, -1 + (-var4 + var3_int));
            if (hk.field_n.length >= va.field_W.length) {
              stackIn_52_0 = hk.field_n.length;
            } else {
              stackIn_52_0 = va.field_W.length;
            }
            var5 = stackIn_52_0;
            if (rq.field_H.length < fo.field_a.length) {
              stackIn_55_0 = fo.field_a.length;
            } else {
              stackIn_55_0 = rq.field_H.length;
            }
            var6 = stackIn_55_0;
            var7 = var5 + (7 + var6);
            bm.field_c = new int[var7];
            dq.field_j = new String[var7];
            for (var8 = 0; var8 < var7; var8++) {
              bm.field_c[var8] = -1;
            }
            dq.field_j[1] = jc.field_g;
            mb.field_c = new int[2];
            bm.field_c[1] = 0;
            dq.field_j[0] = cl.field_b;
            bm.field_c[3] = 1;
            dq.field_j[3] = ad.field_e;
            mb.field_c[1] = 2;
            dq.field_j[2] = jp.field_W;
            dq.field_j[5] = "";
            dq.field_j[4] = nk.field_c;
            mb.field_c[0] = 5;
            for (var8Lifetime2 = 0; var8Lifetime2 < var5; var8Lifetime2++) {
              stackIn_62_0 = dq.field_j;
              stackIn_62_1 = var8Lifetime2 + 6;
              if (-var5 + (va.field_W.length + var8Lifetime2) < 0) {
                stackIn_63_2 = "";
              } else {
                stackIn_63_2 = va.field_W[va.field_W.length + var8Lifetime2 - var5];
              }
              stackIn_62_0[stackIn_62_1] = stackIn_63_2;
            }
            dq.field_j[var5 + 6] = null;
            bm.field_c[var5 + 6] = -2;
            for (var8Lifetime3 = 0; var8Lifetime3 < var6; var8Lifetime3++) {
              stackIn_67_0 = dq.field_j;
              stackIn_67_1 = var5 + 7 + var8Lifetime3;
              stackIn_67_2 = fo.field_a.length;
              stackIn_67_3 = var8Lifetime3;
              if (stackIn_67_2 > stackIn_67_3) {
                stackIn_70_2 = fo.field_a[var8Lifetime3];
              } else {
                stackIn_70_2 = "";
              }
              stackIn_67_0[stackIn_67_1] = stackIn_70_2;
            }
            ap.field_y = rl.a((byte) -119);
          }
          n.field_W.field_e = mb.field_c.length;
          var3_intLifetime1 = 0;
          for (var4Lifetime1 = 0; var4Lifetime1 < dq.field_j.length; var4Lifetime1++) {
            stackIn_90_0 = dq.field_j[var4Lifetime1];
            stackIn_91_1 = !(bm.field_c[var4Lifetime1] < 0);
            var5Lifetime1 = ch.a(stackIn_90_0, stackIn_91_1, false);
            if (var3_intLifetime1 < var5Lifetime1) {
              var3_intLifetime1 = var5Lifetime1;
            }
          }
          if (oa.field_h == 2) {
            var10 = hk.field_n;
            var4_ref_String__ = var10;
            for (var5Lifetime2 = 0; var10.length > var5Lifetime2; var5Lifetime2++) {
              var11 = var10[var5Lifetime2];
              var7Lifetime1 = ch.a(var11, false, false);
              if (var3_intLifetime1 < var7Lifetime1) {
                var3_intLifetime1 = var7Lifetime1;
              }
            }
            var4_ref_String__Lifetime1 = rq.field_H;
            for (var5Lifetime2Lifetime1 = 0; var5Lifetime2Lifetime1 < var4_ref_String__Lifetime1.length; var5Lifetime2Lifetime1++) {
              var12 = var4_ref_String__Lifetime1[var5Lifetime2Lifetime1];
              var7Lifetime1Lifetime1 = ch.a(var12, false, false);
              if (var7Lifetime1Lifetime1 > var3_intLifetime1) {
                var3_intLifetime1 = var7Lifetime1Lifetime1;
              }
            }
          }
          fk.field_Z = nn.field_c - (var3_intLifetime1 >> 1);
          rl.field_a = (qi.field_e + fj.field_h << 1) * n.field_W.field_e;
          ah.field_i = -(var3_intLifetime1 >> 1) + (var3_intLifetime1 + nn.field_c);
          for (var4Lifetime2 = 0; var4Lifetime2 < dq.field_j.length; var4Lifetime2++) {
            stackIn_114_0 = rl.field_a;
            if (0 > bm.field_c[var4Lifetime2]) {
              stackIn_115_1 = qe.field_y;
            } else {
              stackIn_115_1 = ch.field_I;
            }
            rl.field_a = stackIn_114_0 + stackIn_115_1;
          }
          uh.field_n = cd.field_e - (rl.field_a >> 1);
          ra.field_b = new int[dq.field_j.length][];
          var4Lifetime3 = 0;
          var5Lifetime3 = uh.field_n;
          if (param1 != 4) {
            return;
          }
          while (var4Lifetime3 < dq.field_j.length) {
            var6Lifetime1 = bm.field_c[var4Lifetime3];
            if (var6Lifetime1 >= 0) {
              var7Lifetime2 = ch.a(dq.field_j[var4Lifetime3], true, false);
              var8Lifetime1 = nn.field_c - (var7Lifetime2 >> 1);
              var5Lifetime3 = var5Lifetime3 + qi.field_e;
              ra.field_b[var4Lifetime3] = new int[4];
              ra.field_b[var4Lifetime3][0] = var8Lifetime1 - rm.field_b;
              ra.field_b[var4Lifetime3][1] = var5Lifetime3;
              ra.field_b[var4Lifetime3][2] = var7Lifetime2 + (rm.field_b << 1);
              ra.field_b[var4Lifetime3][3] = (fj.field_h << 1) + ch.field_I;
              var5Lifetime3 = var5Lifetime3 + (qi.field_e + ((fj.field_h << 1) + ch.field_I));
            } else {
              var5Lifetime3 = var5Lifetime3 + qe.field_y;
            }
            var4Lifetime3++;
          }
          if (oa.field_h != 2) {
            n.field_W.a(param0, 0, ub.a(wn.field_i, gg.field_f, 0), true);
          } else {
            n.field_W.a(param0, -1, -1, true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var3), "kk.D(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    abstract boolean e(int param0);

    abstract Object c(byte param0);

    kk(int param0) {
        this.field_y = param0;
    }

    public static void f(int param0) {
        field_x = null;
        field_B = null;
        field_A = null;
        field_E = null;
        field_C = (int[][]) null;
        field_D = null;
        if (param0 != 1) {
          kk.a(-127, 17, -14, 121, -101, -122, -96);
        }
        field_G = null;
    }

    static {
        field_E = "Visit the Account Management section on the main site to view.";
        field_A = new hj(4, 1, 1, 1);
        field_F = 1;
        field_G = "<col=ff9999>Reds</col>";
    }
}
