/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fc {
    static String field_d;
    static of field_c;
    static re[] field_a;
    static String field_b;

    final static dd[] b(int param0) {
        int var2 = 0;
        int var6_int = 0;
        int var7 = 0;
        dd[] var1;
        int var3;
        int[] var6;
        int var8;
        int[] var9;
        int[] var13;
        int[] var16;
        byte[] var20;
        int[] var21;
        byte[] var22;
        var8 = fleas.field_A ? 1 : 0;
        var1 = new dd[ef.field_l];
        for (var2 = 0; ef.field_l > var2; var2++) {
          var3 = ij.field_H[var2] * ob.field_a[var2];
          var20 = of.field_d[var2];
          if (!gg.field_i[var2]) {
            var9 = new int[var3];
            var21 = var9;
            for (var6_int = 0; var6_int < var3; var6_int++) {
              var9[var6_int] = rd.field_d[sc.a((int) var20[var6_int], 255)];
            }
            var1[var2] = new dd(e.field_e, uf.field_k, vg.field_I[var2], b.field_b[var2], ij.field_H[var2], ob.field_a[var2], var21);
          } else {
            var22 = wb.field_t[var2];
            var16 = new int[var3];
            var13 = var16;
            var6 = var13;
            for (var7 = 0; var3 > var7; var7++) {
              var6[var7] = ne.a(rd.field_d[sc.a(255, (int) var20[var7])], sc.a((int) var22[var7], 255) << 24);
            }
            var1[var2] = (dd) ((Object) new sj(e.field_e, uf.field_k, vg.field_I[var2], b.field_b[var2], ij.field_H[var2], ob.field_a[var2], var16));
          }
        }
        if (param0 >= -127) {
          field_a = (re[]) null;
        }
        c.o(-28210);
        return var1;
    }

    public static void a(int param0) {
        field_d = null;
        field_c = null;
        field_a = null;
        if (param0 >= -38) {
          fc.d(-78);
        }
        field_b = null;
    }

    final static void c(int param0) {
        int stackIn_85_0 = 0;
        dd[] stackIn_86_1 = null;
        fa stackIn_88_0;
        String stackIn_88_1;
        int stackIn_88_2;
        int stackIn_88_3;
        boolean stackIn_88_4;
        boolean stackIn_89_5 = false;
        int stackIn_92_4 = 0;
        int stackIn_94_0 = 0;
        dd[] stackIn_95_1 = null;
        fa stackIn_97_0;
        String stackIn_97_1;
        int stackIn_97_2;
        int stackIn_97_3;
        boolean stackIn_97_4;
        boolean stackIn_98_5 = false;
        int stackIn_101_4 = 0;
        int stackIn_103_0 = 0;
        dd[] stackIn_104_1 = null;
        fa stackIn_106_0;
        String stackIn_106_1;
        int stackIn_106_2;
        int stackIn_106_3;
        boolean stackIn_106_4;
        boolean stackIn_107_5 = false;
        int stackIn_110_4 = 0;
        boolean stackIn_114_0 = false;
        boolean stackIn_115_1 = false;
        boolean stackIn_117_0 = false;
        boolean stackIn_118_1 = false;
        int stackIn_120_0 = 0;
        dd[] stackIn_121_1 = null;
        vg stackIn_123_0 = null;
        boolean stackIn_123_1 = false;
        boolean stackIn_124_2 = false;
        int stackIn_127_1 = 0;
        boolean stackIn_137_0 = false;
        boolean stackIn_138_1 = false;
        boolean stackIn_140_0 = false;
        boolean stackIn_141_1 = false;
        int stackIn_143_0 = 0;
        dd[] stackIn_144_1 = null;
        vg stackIn_146_0 = null;
        boolean stackIn_146_1 = false;
        boolean stackIn_147_2 = false;
        int stackIn_150_1 = 0;
        int stackIn_161_0 = 0;
        fa stackIn_165_0;
        String stackIn_165_1;
        int stackIn_165_2;
        int stackIn_165_3;
        int stackIn_166_4;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        dd var8 = null;
        int var9 = 0;
        int var10_int = 0;
        String var10 = null;
        int var11 = 0;
        int var12_int = 0;
        String var12 = null;
        int var13_int = 0;
        String var13 = null;
        String var14 = null;
        String var15 = null;
        fa var16 = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        String var20 = null;
        String var21 = null;
        int var22 = 0;
        int var23 = 0;
        int var24_int = 0;
        dd var24 = null;
        int var25 = 0;
        int var26 = 0;
        String var26_ref_String = null;
        int var27 = 0;
        int var3Lifetime1;
        int var3Lifetime2;
        int var4Lifetime1;
        int var4Lifetime2;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var7Lifetime2;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        int var9Lifetime4;
        int var9Lifetime5;
        int var9Lifetime6;
        int var10_intLifetime1;
        int var11Lifetime1;
        int var11Lifetime2;
        int var12_intLifetime1;
        int var13_intLifetime1;
        int var22Lifetime1;
        int var22Lifetime2;
        int var22Lifetime3;
        int var22Lifetime4;
        int var23Lifetime1;
        int var23Lifetime2;
        int var24_intLifetime1;
        int var25Lifetime1;
        int var26Lifetime1;
        int var9Lifetime2Lifetime1;
        var27 = fleas.field_A ? 1 : 0;
        try {
          var1_int = tj.field_a;
          if (nl.field_c[fleas.field_E].length <= tj.field_a) {
            var1_int = nl.field_c[fleas.field_E].length - 1;
          }
          var2 = var1_int * se.field_a.length / ia.field_m[fleas.field_E].length;
          var8 = nl.field_c[fleas.field_E][var1_int];
          var8.d(0, 0);
          pa.a(111);
          for (var3 = 39; var3 >= 0; var3--) {
            for (var4 = 20; 0 <= var4; var4--) {
              var7 = fl.field_c[var3][var4];
              if (var7 != 2 &&
                var7 != 7) {
                if (var7 == 18) {
                  lg.a(-4, var4, var2, var3);
                }
              } else {
                de.a((byte) 88, var3, var2, var4);
              }
              if (var7 != 0) {
                aj.field_t[var7].d(16 * var3 - 4, 16 * var4 - 4);
              }
            }
          }
          for (var9 = 0; nb.field_b > var9; var9++) {
            if (1 != jd.field_o[var9] &&
              cl.field_d[var9] == 0) {
              if (db.field_H == 0) {
                el.field_s[va.field_t[var9]].d(-2 + qg.field_a[var9], -2 + dh.field_b[var9]);
              } else {
                el.field_s[va.field_t[var9]].b(qg.field_a[var9] - 2, dh.field_b[var9] - 2);
              }
            }
          }
          for (var9Lifetime1 = 0; pl.field_g > var9Lifetime1; var9Lifetime1++) {
            var5 = f.field_F[var9Lifetime1];
            var6 = ek.field_b[var9Lifetime1];
            aj.field_t[15].d(16 * var5 - 4, -4 + (-2 + var6) * 16 + hl.field_C[var9Lifetime1]);
          }
          for (var3Lifetime1 = 39; 0 <= var3Lifetime1; var3Lifetime1--) {
            for (var4Lifetime1 = 20; 0 <= var4Lifetime1; var4Lifetime1--) {
              var7Lifetime1 = fl.field_c[var3Lifetime1][var4Lifetime1];
              if (2 != var7Lifetime1 &&
                var7Lifetime1 != 7) {
                if (var7Lifetime1 != 0) {
                  aj.field_t[var7Lifetime1 + 36].d(16 * var3Lifetime1 - 4, -4 + 16 * var4Lifetime1);
                }
              } else {
                de.a((byte) 88, var3Lifetime1, var2, var4Lifetime1);
              }
            }
          }
          for (var3Lifetime2 = 39; 0 <= var3Lifetime2; var3Lifetime2--) {
            for (var4Lifetime2 = 20; 0 <= var4Lifetime2; var4Lifetime2--) {
              var7Lifetime2 = fl.field_c[var3Lifetime2][var4Lifetime2];
              if (var7Lifetime2 == 17 ||
                var7Lifetime2 == 31) {
                aj.field_t[var7Lifetime2 + 36].d(16 * var3Lifetime2 - 4, 16 * var4Lifetime2 - 4);
                if (fl.field_f) {
                  var9Lifetime2 = 64 - ni.field_j % 64;
                  gb.a(-2 + (var3Lifetime2 * 16 + 8), 16 * var4Lifetime2 + 6, var9Lifetime2 / 4, 16777215, 256 - 4 * var9Lifetime2);
                }
              }
              if (var7Lifetime2 == 1 &&
                fl.field_f) {
                var9Lifetime2Lifetime1 = ni.field_j % 64;
                gb.a(7 + var3Lifetime2 * 16, 8 + (-1 + 16 * var4Lifetime2), var9Lifetime2Lifetime1 / 4, 16777215, 256 - var9Lifetime2Lifetime1 * 4);
              }
            }
          }
          for (var9Lifetime3 = 0; var9Lifetime3 < nb.field_b; var9Lifetime3++) {
            if (1 == jd.field_o[var9Lifetime3]) {
              aj.field_t[5].d(qg.field_a[var9Lifetime3] - 10, dh.field_b[var9Lifetime3] - 18);
              el.field_s[va.field_t[var9Lifetime3]].d(qg.field_a[var9Lifetime3] - 2, dh.field_b[var9Lifetime3] - 2);
            }
          }
          if (ab.field_b == -1) {
            var9Lifetime4 = ag.field_f / 16;
            var10_int = kc.field_b / 16;
            if (var9Lifetime4 >= 0 &&
              40 > var9Lifetime4 &&
              var10_int >= 0 &&
              var10_int < 21 &&
              fl.field_c[var9Lifetime4][var10_int] == 0) {
              var11 = var9Lifetime4 * 16 - 4;
              var12_int = var10_int * 16 - 4;
              var13_int = mh.field_u + 1;
              aj.field_t[var13_int].a(var11, var12_int, 64);
              if (var13_int == 2) {
                gb.a(si.field_R);
                gb.a(4 + var11, var12_int + 4, 4 + var11 + 16, var12_int + 20);
                se.field_a[var2].a(0, 0, 64);
                gb.b(si.field_R);
              }
            }
          }
          for (var9Lifetime5 = 0; uf.field_h > var9Lifetime5; var9Lifetime5++) {
            var10_intLifetime1 = -(4 * (ni.field_j - nc.field_a[var9Lifetime5])) + 256;
            if (0 <= var10_intLifetime1 &&
              var10_intLifetime1 <= 255) {
              var11Lifetime1 = 10 + (ni.field_j - nc.field_a[var9Lifetime5]) * 2;
              var12_intLifetime1 = lj.field_c[var9Lifetime5] * 16;
              var12_intLifetime1 = var12_intLifetime1 - var11Lifetime1 / 2;
              var13_intLifetime1 = 16 * fb.field_e[var9Lifetime5];
              var13_intLifetime1 = var13_intLifetime1 - var11Lifetime1 / 2;
              ca.field_P.c(var12_intLifetime1, var13_intLifetime1, var11Lifetime1, var11Lifetime1, var10_intLifetime1);
            }
          }
          var9Lifetime6 = aj.field_t[2].field_t + 365;
          nc.field_d.f(0, 0);
          nc.field_d.g(320, 0);
          stackIn_85_0 = dk.field_C.field_a;
          if (mh.field_u == 1) {
            stackIn_86_1 = gj.field_E;
          } else {
            stackIn_86_1 = a.field_b;
          }
          og.a(stackIn_85_0, stackIn_86_1, 93, dk.field_C.field_l, dk.field_C.field_d, dk.field_C.field_n);
          aj.field_t[2].d(132, 367);
          oj.a(371, 0, 136, var2);
          stackIn_88_0 = tl.field_p;
          stackIn_88_1 = ha.field_p.toLowerCase();
          stackIn_88_2 = 7 + (dk.field_C.field_l + 5);
          stackIn_88_3 = var9Lifetime6;
          stackIn_88_4 = dk.field_C.a((byte) 114);
          stackIn_89_5 = (1 != ab.field_b);
          if (stackIn_88_4 & !stackIn_89_5) {
            stackIn_92_4 = 0;
          } else {
            stackIn_92_4 = 1;
          }
          ((fa) (Object) stackIn_88_0).c(stackIn_88_1, stackIn_88_2, stackIn_88_3, stackIn_92_4, -1);
          stackIn_94_0 = wd.field_a.field_a;
          if (mh.field_u != 2) {
            stackIn_95_1 = a.field_b;
          } else {
            stackIn_95_1 = gj.field_E;
          }
          og.a(stackIn_94_0, stackIn_95_1, 112, wd.field_a.field_l, wd.field_a.field_d, wd.field_a.field_n);
          aj.field_t[3].d(352, 367);
          stackIn_97_0 = tl.field_p;
          stackIn_97_1 = j.field_h.toLowerCase();
          stackIn_97_2 = 7 + (wd.field_a.field_l + 5);
          stackIn_97_3 = var9Lifetime6;
          stackIn_97_4 = wd.field_a.a((byte) 71);
          stackIn_98_5 = (1 != ab.field_b);
          if (stackIn_97_4 & stackIn_98_5) {
            stackIn_101_4 = 1;
          } else {
            stackIn_101_4 = 0;
          }
          ((fa) (Object) stackIn_97_0).c(stackIn_97_1, stackIn_97_2, stackIn_97_3, stackIn_101_4, -1);
          stackIn_103_0 = de.field_b.field_a;
          if (mh.field_u == 3) {
            stackIn_104_1 = gj.field_E;
          } else {
            stackIn_104_1 = a.field_b;
          }
          og.a(stackIn_103_0, stackIn_104_1, 86, de.field_b.field_l, de.field_b.field_d, de.field_b.field_n);
          aj.field_t[4].d(582, 367);
          stackIn_106_0 = tl.field_p;
          stackIn_106_1 = tb.field_e.toLowerCase();
          stackIn_106_2 = 5 + (7 + de.field_b.field_l);
          stackIn_106_3 = var9Lifetime6;
          stackIn_106_4 = de.field_b.a((byte) 127);
          stackIn_107_5 = (ab.field_b != 1);
          if (stackIn_106_4 & !stackIn_107_5) {
            stackIn_110_4 = 0;
          } else {
            stackIn_110_4 = 1;
          }
          ((fa) (Object) stackIn_106_0).c(stackIn_106_1, stackIn_106_2, stackIn_106_3, stackIn_110_4, -1);
          var11Lifetime2 = 100 % ((param0 - 66) / 60);
          var10 = db.a(pk.field_G, new String[]{wj.field_c[fleas.field_E][var1_int]}, true);
          var12 = db.a(fb.field_f, new String[]{Integer.toString(qh.field_z), Integer.toString((int) ia.field_m[fleas.field_E][var1_int].field_f)}, true);
          var13 = db.a(va.field_s, new String[]{Integer.toString(pl.field_f), Integer.toString((int) ia.field_m[fleas.field_E][var1_int].field_e)}, true);
          var14 = db.a(hm.field_h, new String[]{Integer.toString(wi.field_b)}, true);
          var15 = db.a(pd.field_i, new String[]{Integer.toString(j.field_f ^ wi.field_p.field_b)}, true);
          var16 = ve.field_d;
          var17 = 3 + (int)(1.5 * (double)var16.field_H);
          var18 = 0;
          var19 = -1;
          var16.c(var10, 35, var16.field_H + (425 - var17), var18, var19);
          var16.c(var12, 35, var16.field_H + 425, var18, var19);
          var16.c(var13, 35, var17 + 425 + var16.field_H, var18, var19);
          var16.c(var14, 120, 425 + var16.field_H, var18, var19);
          var16.c(var15, ol.field_f.field_l, 425 + var16.field_H, var18, var19);
          var20 = wa.a(false);
          var21 = db.a(lf.field_b, new String[]{var20}, true);
          var16.c(db.a(var21, new String[]{"C8BA91"}, true), 120, var16.field_H + 425 + var17, var18, var19);
          ol.field_f.field_l = 250;
          ol.field_f.field_x = ve.field_d;
          ol.field_f.field_a = 425 + var17 - 4;
          ol.field_f.field_z = -1;
          ol.field_f.b((byte) -60);
          if (lk.field_D.field_k) {
            stackIn_114_0 = lk.field_D.a((byte) 87);
            stackIn_115_1 = (kc.field_f != 0);
            stackIn_117_0 = stackIn_114_0 & stackIn_115_1;
            stackIn_118_1 = (ab.field_b != 1);
            var22 = stackIn_117_0 & stackIn_118_1 ? 1 : 0;
            stackIn_120_0 = lk.field_D.field_a - 3;
            if (var22 == 0) {
              stackIn_121_1 = a.field_b;
            } else {
              stackIn_121_1 = gj.field_E;
            }
            og.a(stackIn_120_0, stackIn_121_1, 84, lk.field_D.field_l, lk.field_D.field_d + 6, 1 + lk.field_D.field_n);
            stackIn_123_0 = lk.field_D;
            stackIn_123_1 = lk.field_D.a((byte) 82);
            stackIn_124_2 = (ab.field_b != 1);
            if (stackIn_123_1 & !stackIn_124_2) {
              stackIn_127_1 = 0;
            } else {
              stackIn_127_1 = 1;
            }
            stackIn_123_0.field_F = stackIn_127_1;
            lk.field_D.e(-1);
            var23 = (int)(ma.a((double)ni.field_j / 25.0, 116) * 64.0 + 64.0);
            var24_int = (int)(64.0 + nb.a((double)ni.field_j / 25.0, -128) * 64.0);
            gb.b(4 + lk.field_D.field_l, lk.field_D.field_a + 1, lk.field_D.field_n - 7, lk.field_D.field_d - 2, 65793 * var23, var24_int * 65793);
            if (qh.field_z == 0) {
              gb.a(si.field_R);
              gb.a(0, 0, 640, 336);
              var25 = pg.field_f;
              if (var25 > 120) {
                var26 = var25 - 120;
                var25 = var25 - 2 * var26;
              }
              tl.field_p.b(fi.field_l, 320, var25, 0, 0, ni.field_j / 3);
              var26_ref_String = var14 + "   " + db.a(fleas.field_I, new String[]{var20}, true);
              tl.field_p.a(db.a(var26_ref_String, new String[]{"2"}, true), 320, var25 + tl.field_p.field_N, 0, 0);
              gb.b(si.field_R);
            }
          }
          if (si.field_y.field_k) {
            stackIn_137_0 = si.field_y.a((byte) 125);
            stackIn_138_1 = (0 != kc.field_f);
            stackIn_140_0 = stackIn_137_0 & stackIn_138_1;
            stackIn_141_1 = (ab.field_b != 1);
            var22Lifetime1 = stackIn_140_0 & stackIn_141_1 ? 1 : 0;
            stackIn_143_0 = -3 + si.field_y.field_a;
            if (var22Lifetime1 != 0) {
              stackIn_144_1 = gj.field_E;
            } else {
              stackIn_144_1 = a.field_b;
            }
            og.a(stackIn_143_0, stackIn_144_1, -45, si.field_y.field_l, si.field_y.field_d + 6, si.field_y.field_n + 1);
            stackIn_146_0 = si.field_y;
            stackIn_146_1 = si.field_y.a((byte) 121);
            stackIn_147_2 = (ab.field_b != 1);
            if (stackIn_146_1 & !stackIn_147_2) {
              stackIn_150_1 = 0;
            } else {
              stackIn_150_1 = 1;
            }
            stackIn_146_0.field_F = stackIn_150_1;
            si.field_y.e(-1);
            if (0 < mg.field_d) {
              var23Lifetime1 = (int)(64.0 + ma.a((double)ni.field_j / 25.0, 123) * 64.0);
              var24_intLifetime1 = (int)(64.0 + 64.0 * nb.a((double)ni.field_j / 25.0, -122));
              gb.b(4 + si.field_y.field_l, 1 + si.field_y.field_a, si.field_y.field_n - 7, si.field_y.field_d - 2, 65793 * var23Lifetime1, var24_intLifetime1 * 65793);
            }
          }
          if (fl.field_f) {
            for (var22Lifetime2 = ob.field_c.length - 1; var22Lifetime2 >= 1; var22Lifetime2--) {
              ob.field_c[var22Lifetime2].c(-105);
            }
          }
          bk.b(7);
          if (0 <= mg.field_d) {
            if (mg.field_d < 256) {
              stackIn_161_0 = 256;
            } else {
              stackIn_161_0 = 512 + mg.field_d * -1;
            }
            var22Lifetime3 = stackIn_161_0;
            if (var22Lifetime3 < 0) {
              var22Lifetime3 = 0;
            }
            stackIn_165_0 = tl.field_p;
            stackIn_165_1 = uj.field_d;
            stackIn_165_2 = 220;
            stackIn_165_3 = -110;
            if (mg.field_d > 160) {
              stackIn_166_4 = 160;
            } else {
              stackIn_166_4 = mg.field_d;
            }
            ((fa) (Object) stackIn_165_0).a(stackIn_165_1, stackIn_165_2, stackIn_165_3 + stackIn_166_4, 200, 150, 0, -1, var22Lifetime3, 1, 1, tl.field_p.field_H);
          }
          if (qg.field_c > 0 &&
            0 == nb.field_b) {
            var22Lifetime4 = qg.field_c / 50;
            var23Lifetime2 = qg.field_c % 50;
            var24 = ji.field_f[var22Lifetime4];
            var6Lifetime1 = 240;
            var5Lifetime1 = 320;
            var6Lifetime1 = var6Lifetime1 - nc.field_d.field_t / 2;
            var25Lifetime1 = var23Lifetime2 * var24.field_x / 50;
            var26Lifetime1 = var23Lifetime2 * var24.field_r / 50;
            var24.d(var5Lifetime1 - var25Lifetime1 / 2, var6Lifetime1 - var26Lifetime1 / 2, var25Lifetime1, var26Lifetime1, 128);
            ai.field_n[var22Lifetime4].d(-(var25Lifetime1 / 2) + var5Lifetime1, -(var26Lifetime1 / 2) + var6Lifetime1, var25Lifetime1, var26Lifetime1, 16);
            ai.field_n[var22Lifetime4].c(var5Lifetime1 - var25Lifetime1 / 2, -(var26Lifetime1 / 2) + var6Lifetime1, var25Lifetime1, var26Lifetime1, 128);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var1), "fc.B(" + param0 + ')');
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static dd[] a(rh param0, String param1, String param2, byte param3) {
        dd[] var4 = null;
        RuntimeException var4_ref = null;
        dd[] var5 = null;
        dd[] stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = of.a(param1, param2, param0, 119);
          var4 = var5;
          if (var4 != null) {
            var5[1].field_x = var5[1].field_w;
            var5[3].field_r = var5[3].field_t;
            var5[5].field_r = var5[5].field_t;
            var5[7].field_x = var5[7].field_w;
          }
          if (param3 != 61) {
            field_b = (String) null;
          }
          stackIn_6_0 = var4;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_9_0 = var4_ref;
          stackIn_9_1 = new StringBuilder().append("fc.A(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(')').toString());
        }
    }

    final static ad d(int param0) {
        if (param0 != 64) {
          fc.b(-31);
        }
        String var1 = vi.b((byte) -55);
        if (var1 != null &&
          0 <= var1.indexOf('@')) {
          var1 = "";
        }
        return new ad(vi.b((byte) -55), id.a(param0 - 5999));
    }

    static {
        field_d = "Change display name";
        field_b = "?";
    }
}
