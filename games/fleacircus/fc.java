/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fc {
    static String field_d;
    static of field_c;
    static re[] field_a;
    static String field_b;

    final static dd[] b(int param0) {
        dd[] var1;
        int var2;
        int var3;
        int[] var6;
        int var6_int;
        int var7;
        int var8;
        int[] var9;
        int[] var13;
        int[] var16;
        byte[] var20;
        int[] var21;
        byte[] var22;
        var8 = fleas.field_A ? 1 : 0;
        var1 = new dd[ef.field_l];
        var2 = 0;
        L0: while (true) {
          if (ef.field_l <= var2) {
            L1: {
              if (param0 < -127) {
                break L1;
              } else {
                field_a = (re[]) null;
                break L1;
              }
            }
            c.o(-28210);
            return var1;
          } else {
            var3 = ij.field_H[var2] * ob.field_a[var2];
            var20 = of.field_d[var2];
            if (gg.field_i[var2]) {
              var22 = wb.field_t[var2];
              var16 = new int[var3];
              var13 = var16;
              var6 = var13;
              var7 = 0;
              L2: while (true) {
                if (var3 <= var7) {
                  var1[var2] = (dd) ((Object) new sj(e.field_e, uf.field_k, vg.field_I[var2], b.field_b[var2], ij.field_H[var2], ob.field_a[var2], var16));
                  var2++;
                  continue L0;
                } else {
                  var6[var7] = ne.a(rd.field_d[sc.a(255, (int) var20[var7])], sc.a((int) var22[var7], 255) << 451721336);
                  var7++;
                  continue L2;
                }
              }
            } else {
              var9 = new int[var3];
              var21 = var9;
              var6_int = 0;
              L3: while (true) {
                if (var6_int >= var3) {
                  var1[var2] = new dd(e.field_e, uf.field_k, vg.field_I[var2], b.field_b[var2], ij.field_H[var2], ob.field_a[var2], var21);
                  var2++;
                  continue L0;
                } else {
                  var9[var6_int] = rd.field_d[sc.a((int) var20[var6_int], 255)];
                  var6_int++;
                  continue L3;
                }
              }
            }
          }
        }
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
        int stackIn_83_0 = 0;
        int stackIn_84_0 = 0;
        dd[] stackIn_84_1 = null;
        fa stackIn_86_0;
        String stackIn_86_1;
        int stackIn_86_2;
        int stackIn_86_3;
        boolean stackIn_86_4;
        fa stackIn_87_0 = null;
        String stackIn_87_1 = null;
        int stackIn_87_2 = 0;
        int stackIn_87_3 = 0;
        boolean stackIn_87_4 = false;
        int stackIn_87_5 = 0;
        int stackIn_90_4 = 0;
        int stackIn_92_0 = 0;
        int stackIn_93_0 = 0;
        dd[] stackIn_93_1 = null;
        fa stackIn_95_0;
        String stackIn_95_1;
        int stackIn_95_2;
        int stackIn_95_3;
        boolean stackIn_95_4;
        fa stackIn_96_0 = null;
        String stackIn_96_1 = null;
        int stackIn_96_2 = 0;
        int stackIn_96_3 = 0;
        boolean stackIn_96_4 = false;
        int stackIn_96_5 = 0;
        int stackIn_99_4 = 0;
        int stackIn_101_0 = 0;
        int stackIn_102_0 = 0;
        dd[] stackIn_102_1 = null;
        fa stackIn_104_0;
        String stackIn_104_1;
        int stackIn_104_2;
        int stackIn_104_3;
        boolean stackIn_104_4;
        fa stackIn_105_0 = null;
        String stackIn_105_1 = null;
        int stackIn_105_2 = 0;
        int stackIn_105_3 = 0;
        boolean stackIn_105_4 = false;
        int stackIn_105_5 = 0;
        int stackIn_108_4 = 0;
        boolean stackIn_112_0 = false;
        boolean stackIn_113_0 = false;
        int stackIn_113_1 = 0;
        boolean stackIn_115_0 = false;
        boolean stackIn_116_0 = false;
        int stackIn_116_1 = 0;
        int stackIn_118_0 = 0;
        int stackIn_119_0 = 0;
        dd[] stackIn_119_1 = null;
        vg stackIn_121_0 = null;
        boolean stackIn_121_1 = false;
        vg stackIn_122_0 = null;
        boolean stackIn_122_1 = false;
        int stackIn_122_2 = 0;
        int stackIn_125_1 = 0;
        boolean stackIn_135_0 = false;
        boolean stackIn_136_0 = false;
        int stackIn_136_1 = 0;
        boolean stackIn_138_0 = false;
        boolean stackIn_139_0 = false;
        int stackIn_139_1 = 0;
        int stackIn_141_0 = 0;
        int stackIn_142_0 = 0;
        dd[] stackIn_142_1 = null;
        vg stackIn_144_0 = null;
        boolean stackIn_144_1 = false;
        vg stackIn_145_0 = null;
        boolean stackIn_145_1 = false;
        int stackIn_145_2 = 0;
        int stackIn_148_1 = 0;
        int stackIn_159_0 = 0;
        fa stackIn_163_0;
        String stackIn_163_1;
        int stackIn_163_2;
        int stackIn_163_3;
        fa stackIn_164_0;
        String stackIn_164_1;
        int stackIn_164_2;
        int stackIn_164_3;
        int stackIn_164_4;
        Throwable caughtException = null;
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
        var27 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var1_int = tj.field_a;
              if (nl.field_c[fleas.field_E].length > tj.field_a) {
                break L1;
              } else {
                var1_int = nl.field_c[fleas.field_E].length + -1;
                break L1;
              }
            }
            var2 = var1_int * se.field_a.length / ia.field_m[fleas.field_E].length;
            var8 = nl.field_c[fleas.field_E][var1_int];
            var8.d(0, 0);
            pa.a(111);
            var3 = 39;
            L2: while (true) {
              if ((var3 ^ -1) > -1) {
                var9 = 0;
                L3: while (true) {
                  if (nb.field_b <= var9) {
                    var9 = 0;
                    L4: while (true) {
                      if (pl.field_g <= var9) {
                        var3 = 39;
                        L5: while (true) {
                          if (0 > var3) {
                            var3 = 39;
                            L6: while (true) {
                              if (0 > var3) {
                                var9 = 0;
                                L7: while (true) {
                                  if (var9 >= nb.field_b) {
                                    L8: {
                                      if (0 != (ab.field_b ^ -1)) {
                                        break L8;
                                      } else {
                                        var9 = ag.field_f / 16;
                                        var10_int = kc.field_b / 16;
                                        if (var9 < 0) {
                                          break L8;
                                        } else {
                                          if (40 <= var9) {
                                            break L8;
                                          } else {
                                            if ((var10_int ^ -1) > -1) {
                                              break L8;
                                            } else {
                                              if (-22 >= (var10_int ^ -1)) {
                                                break L8;
                                              } else {
                                                if (fl.field_c[var9][var10_int] != 0) {
                                                  break L8;
                                                } else {
                                                  var11 = var9 * 16 - 4;
                                                  var12_int = var10_int * 16 - 4;
                                                  var13_int = mh.field_u - -1;
                                                  aj.field_t[var13_int].a(var11, var12_int, 64);
                                                  if (-3 == (var13_int ^ -1)) {
                                                    gb.a(si.field_R);
                                                    gb.a(4 + var11, var12_int - -4, 4 + var11 + 16, var12_int - -20);
                                                    se.field_a[var2].a(0, 0, 64);
                                                    gb.b(si.field_R);
                                                    break L8;
                                                  } else {
                                                    break L8;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    var9 = 0;
                                    L9: while (true) {
                                      if (uf.field_h <= var9) {
                                        L10: {
                                          var9 = aj.field_t[2].field_t + 365;
                                          nc.field_d.f(0, 0);
                                          nc.field_d.g(320, 0);
                                          stackIn_83_0 = dk.field_C.field_a;

                                          if (-2 == (mh.field_u ^ -1)) {
                                            stackIn_84_0 = stackIn_83_0;
                                            stackIn_84_1 = gj.field_E;
                                            break L10;
                                          } else {
                                            stackIn_84_0 = stackIn_83_0;
                                            stackIn_84_1 = a.field_b;
                                            break L10;
                                          }
                                        }
                                        L11: {
                                          og.a(stackIn_84_0, stackIn_84_1, 93, dk.field_C.field_l, dk.field_C.field_d, dk.field_C.field_n);
                                          aj.field_t[2].d(132, 367);
                                          oj.a(371, 0, 136, var2);
                                          stackIn_86_0 = tl.field_p;

                                          stackIn_86_1 = ha.field_p.toLowerCase();

                                          stackIn_86_2 = 7 + (dk.field_C.field_l - -5);

                                          stackIn_86_3 = var9;

                                          stackIn_86_4 = dk.field_C.a((byte) 114);

                                          if (1 == ab.field_b) {
                                            stackIn_87_0 = (fa) ((Object) stackIn_86_0);
                                            stackIn_87_1 = (String) ((Object) stackIn_86_1);
                                            stackIn_87_2 = stackIn_86_2;
                                            stackIn_87_3 = stackIn_86_3;
                                            stackIn_87_4 = stackIn_86_4;
                                            stackIn_87_5 = 0;
                                            break L11;
                                          } else {
                                            stackIn_87_0 = (fa) ((Object) stackIn_86_0);
                                            stackIn_87_1 = (String) ((Object) stackIn_86_1);
                                            stackIn_87_2 = stackIn_86_2;
                                            stackIn_87_3 = stackIn_86_3;
                                            stackIn_87_4 = stackIn_86_4;
                                            stackIn_87_5 = 1;
                                            break L11;
                                          }
                                        }
                                        L12: {








                                          if (stackIn_87_4 & stackIn_87_5 == 0) {
                                            stackIn_87_0 = (fa) ((Object) stackIn_87_0);
                                            stackIn_87_1 = (String) ((Object) stackIn_87_1);


                                            stackIn_90_4 = 0;
                                            break L12;
                                          } else {
                                            stackIn_87_0 = (fa) ((Object) stackIn_87_0);
                                            stackIn_87_1 = (String) ((Object) stackIn_87_1);


                                            stackIn_90_4 = 1;
                                            break L12;
                                          }
                                        }
                                        L13: {
                                          ((fa) (Object) stackIn_87_0).c(stackIn_87_1, stackIn_87_2, stackIn_87_3, stackIn_90_4, -1);
                                          stackIn_92_0 = wd.field_a.field_a;

                                          if (mh.field_u != 2) {
                                            stackIn_93_0 = stackIn_92_0;
                                            stackIn_93_1 = a.field_b;
                                            break L13;
                                          } else {
                                            stackIn_93_0 = stackIn_92_0;
                                            stackIn_93_1 = gj.field_E;
                                            break L13;
                                          }
                                        }
                                        L14: {
                                          og.a(stackIn_93_0, stackIn_93_1, 112, wd.field_a.field_l, wd.field_a.field_d, wd.field_a.field_n);
                                          aj.field_t[3].d(352, 367);
                                          stackIn_95_0 = tl.field_p;

                                          stackIn_95_1 = j.field_h.toLowerCase();

                                          stackIn_95_2 = 7 + (wd.field_a.field_l - -5);

                                          stackIn_95_3 = var9;

                                          stackIn_95_4 = wd.field_a.a((byte) 71);

                                          if (1 == ab.field_b) {
                                            stackIn_96_0 = (fa) ((Object) stackIn_95_0);
                                            stackIn_96_1 = (String) ((Object) stackIn_95_1);
                                            stackIn_96_2 = stackIn_95_2;
                                            stackIn_96_3 = stackIn_95_3;
                                            stackIn_96_4 = stackIn_95_4;
                                            stackIn_96_5 = 0;
                                            break L14;
                                          } else {
                                            stackIn_96_0 = (fa) ((Object) stackIn_95_0);
                                            stackIn_96_1 = (String) ((Object) stackIn_95_1);
                                            stackIn_96_2 = stackIn_95_2;
                                            stackIn_96_3 = stackIn_95_3;
                                            stackIn_96_4 = stackIn_95_4;
                                            stackIn_96_5 = 1;
                                            break L14;
                                          }
                                        }
                                        L15: {








                                          if (stackIn_96_4 & stackIn_96_5 != 0) {
                                            stackIn_96_0 = (fa) ((Object) stackIn_96_0);
                                            stackIn_96_1 = (String) ((Object) stackIn_96_1);


                                            stackIn_99_4 = 1;
                                            break L15;
                                          } else {
                                            stackIn_96_0 = (fa) ((Object) stackIn_96_0);
                                            stackIn_96_1 = (String) ((Object) stackIn_96_1);


                                            stackIn_99_4 = 0;
                                            break L15;
                                          }
                                        }
                                        L16: {
                                          ((fa) (Object) stackIn_96_0).c(stackIn_96_1, stackIn_96_2, stackIn_96_3, stackIn_99_4, -1);
                                          stackIn_101_0 = de.field_b.field_a;

                                          if (mh.field_u == 3) {
                                            stackIn_102_0 = stackIn_101_0;
                                            stackIn_102_1 = gj.field_E;
                                            break L16;
                                          } else {
                                            stackIn_102_0 = stackIn_101_0;
                                            stackIn_102_1 = a.field_b;
                                            break L16;
                                          }
                                        }
                                        L17: {
                                          og.a(stackIn_102_0, stackIn_102_1, 86, de.field_b.field_l, de.field_b.field_d, de.field_b.field_n);
                                          aj.field_t[4].d(582, 367);
                                          stackIn_104_0 = tl.field_p;

                                          stackIn_104_1 = tb.field_e.toLowerCase();

                                          stackIn_104_2 = 5 + (7 + de.field_b.field_l);

                                          stackIn_104_3 = var9;

                                          stackIn_104_4 = de.field_b.a((byte) 127);

                                          if (ab.field_b == 1) {
                                            stackIn_105_0 = (fa) ((Object) stackIn_104_0);
                                            stackIn_105_1 = (String) ((Object) stackIn_104_1);
                                            stackIn_105_2 = stackIn_104_2;
                                            stackIn_105_3 = stackIn_104_3;
                                            stackIn_105_4 = stackIn_104_4;
                                            stackIn_105_5 = 0;
                                            break L17;
                                          } else {
                                            stackIn_105_0 = (fa) ((Object) stackIn_104_0);
                                            stackIn_105_1 = (String) ((Object) stackIn_104_1);
                                            stackIn_105_2 = stackIn_104_2;
                                            stackIn_105_3 = stackIn_104_3;
                                            stackIn_105_4 = stackIn_104_4;
                                            stackIn_105_5 = 1;
                                            break L17;
                                          }
                                        }
                                        L18: {








                                          if (stackIn_105_4 & stackIn_105_5 == 0) {
                                            stackIn_105_0 = (fa) ((Object) stackIn_105_0);
                                            stackIn_105_1 = (String) ((Object) stackIn_105_1);


                                            stackIn_108_4 = 0;
                                            break L18;
                                          } else {
                                            stackIn_105_0 = (fa) ((Object) stackIn_105_0);
                                            stackIn_105_1 = (String) ((Object) stackIn_105_1);


                                            stackIn_108_4 = 1;
                                            break L18;
                                          }
                                        }
                                        L19: {
                                          ((fa) (Object) stackIn_105_0).c(stackIn_105_1, stackIn_105_2, stackIn_105_3, stackIn_108_4, -1);
                                          var11 = 100 % ((param0 - 66) / 60);
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
                                          var16.c(var13, 35, var17 + 425 - -var16.field_H, var18, var19);
                                          var16.c(var14, 120, 425 - -var16.field_H, var18, var19);
                                          var16.c(var15, ol.field_f.field_l, 425 + var16.field_H, var18, var19);
                                          var20 = wa.a(false);
                                          var21 = db.a(lf.field_b, new String[]{var20}, true);
                                          var16.c(db.a(var21, new String[]{"C8BA91"}, true), 120, var16.field_H + 425 + var17, var18, var19);
                                          ol.field_f.field_l = 250;
                                          ol.field_f.field_x = ve.field_d;
                                          ol.field_f.field_a = 425 + var17 + -4;
                                          ol.field_f.field_z = -1;
                                          ol.field_f.b((byte) -60);
                                          if (lk.field_D.field_k) {
                                            L20: {
                                              stackIn_112_0 = lk.field_D.a((byte) 87);

                                              if (kc.field_f == 0) {
                                                stackIn_113_0 = stackIn_112_0;
                                                stackIn_113_1 = 0;
                                                break L20;
                                              } else {
                                                stackIn_113_0 = stackIn_112_0;
                                                stackIn_113_1 = 1;
                                                break L20;
                                              }
                                            }
                                            L21: {
                                              stackIn_115_0 = stackIn_113_0 & stackIn_113_1 != 0;

                                              if (ab.field_b == 1) {
                                                stackIn_116_0 = stackIn_115_0;
                                                stackIn_116_1 = 0;
                                                break L21;
                                              } else {
                                                stackIn_116_0 = stackIn_115_0;
                                                stackIn_116_1 = 1;
                                                break L21;
                                              }
                                            }
                                            L22: {
                                              var22 = stackIn_116_0 & stackIn_116_1 != 0 ? 1 : 0;
                                              stackIn_118_0 = lk.field_D.field_a - 3;

                                              if (var22 == 0) {
                                                stackIn_119_0 = stackIn_118_0;
                                                stackIn_119_1 = a.field_b;
                                                break L22;
                                              } else {
                                                stackIn_119_0 = stackIn_118_0;
                                                stackIn_119_1 = gj.field_E;
                                                break L22;
                                              }
                                            }
                                            L23: {
                                              og.a(stackIn_119_0, stackIn_119_1, 84, lk.field_D.field_l, lk.field_D.field_d + 6, 1 + lk.field_D.field_n);
                                              stackIn_121_0 = lk.field_D;

                                              stackIn_121_1 = lk.field_D.a((byte) 82);

                                              if (ab.field_b == 1) {
                                                stackIn_122_0 = (vg) ((Object) stackIn_121_0);
                                                stackIn_122_1 = stackIn_121_1;
                                                stackIn_122_2 = 0;
                                                break L23;
                                              } else {
                                                stackIn_122_0 = (vg) ((Object) stackIn_121_0);
                                                stackIn_122_1 = stackIn_121_1;
                                                stackIn_122_2 = 1;
                                                break L23;
                                              }
                                            }
                                            L24: {


                                              if (stackIn_122_1 & stackIn_122_2 == 0) {
                                                stackIn_122_0 = (vg) ((Object) stackIn_122_0);
                                                stackIn_125_1 = 0;
                                                break L24;
                                              } else {
                                                stackIn_122_0 = (vg) ((Object) stackIn_122_0);
                                                stackIn_125_1 = 1;
                                                break L24;
                                              }
                                            }
                                            stackIn_122_0.field_F = stackIn_125_1;
                                            lk.field_D.e(-1);
                                            var23 = (int)(ma.a((double)ni.field_j / 25.0, 116) * 64.0 + 64.0);
                                            var24_int = (int)(64.0 + nb.a((double)ni.field_j / 25.0, -128) * 64.0);
                                            gb.b(4 + lk.field_D.field_l, lk.field_D.field_a + 1, lk.field_D.field_n + -7, lk.field_D.field_d - 2, 65793 * var23, var24_int * 65793);
                                            if (qh.field_z == 0) {
                                              L25: {
                                                gb.a(si.field_R);
                                                gb.a(0, 0, 640, 336);
                                                var25 = pg.field_f;
                                                if (var25 > 120) {
                                                  var26 = var25 + -120;
                                                  var25 = var25 - 2 * var26;
                                                  break L25;
                                                } else {
                                                  break L25;
                                                }
                                              }
                                              tl.field_p.b(fi.field_l, 320, var25, 0, 0, ni.field_j / 3);
                                              var26_ref_String = var14 + "   " + db.a(fleas.field_I, new String[]{var20}, true);
                                              tl.field_p.a(db.a(var26_ref_String, new String[]{"2"}, true), 320, var25 - -tl.field_p.field_N, 0, 0);
                                              gb.b(si.field_R);
                                              break L19;
                                            } else {
                                              break L19;
                                            }
                                          } else {
                                            break L19;
                                          }
                                        }
                                        L26: {
                                          if (si.field_y.field_k) {
                                            L27: {
                                              stackIn_135_0 = si.field_y.a((byte) 125);

                                              if (0 == kc.field_f) {
                                                stackIn_136_0 = stackIn_135_0;
                                                stackIn_136_1 = 0;
                                                break L27;
                                              } else {
                                                stackIn_136_0 = stackIn_135_0;
                                                stackIn_136_1 = 1;
                                                break L27;
                                              }
                                            }
                                            L28: {
                                              stackIn_138_0 = stackIn_136_0 & stackIn_136_1 != 0;

                                              if (ab.field_b == 1) {
                                                stackIn_139_0 = stackIn_138_0;
                                                stackIn_139_1 = 0;
                                                break L28;
                                              } else {
                                                stackIn_139_0 = stackIn_138_0;
                                                stackIn_139_1 = 1;
                                                break L28;
                                              }
                                            }
                                            L29: {
                                              var22 = stackIn_139_0 & stackIn_139_1 != 0 ? 1 : 0;
                                              stackIn_141_0 = -3 + si.field_y.field_a;

                                              if (var22 != 0) {
                                                stackIn_142_0 = stackIn_141_0;
                                                stackIn_142_1 = gj.field_E;
                                                break L29;
                                              } else {
                                                stackIn_142_0 = stackIn_141_0;
                                                stackIn_142_1 = a.field_b;
                                                break L29;
                                              }
                                            }
                                            L30: {
                                              og.a(stackIn_142_0, stackIn_142_1, -45, si.field_y.field_l, si.field_y.field_d - -6, si.field_y.field_n + 1);
                                              stackIn_144_0 = si.field_y;

                                              stackIn_144_1 = si.field_y.a((byte) 121);

                                              if (ab.field_b == 1) {
                                                stackIn_145_0 = (vg) ((Object) stackIn_144_0);
                                                stackIn_145_1 = stackIn_144_1;
                                                stackIn_145_2 = 0;
                                                break L30;
                                              } else {
                                                stackIn_145_0 = (vg) ((Object) stackIn_144_0);
                                                stackIn_145_1 = stackIn_144_1;
                                                stackIn_145_2 = 1;
                                                break L30;
                                              }
                                            }
                                            L31: {


                                              if (stackIn_145_1 & stackIn_145_2 == 0) {
                                                stackIn_145_0 = (vg) ((Object) stackIn_145_0);
                                                stackIn_148_1 = 0;
                                                break L31;
                                              } else {
                                                stackIn_145_0 = (vg) ((Object) stackIn_145_0);
                                                stackIn_148_1 = 1;
                                                break L31;
                                              }
                                            }
                                            stackIn_145_0.field_F = stackIn_148_1;
                                            si.field_y.e(-1);
                                            if (0 >= mg.field_d) {
                                              break L26;
                                            } else {
                                              var23 = (int)(64.0 + ma.a((double)ni.field_j / 25.0, 123) * 64.0);
                                              var24_int = (int)(64.0 + 64.0 * nb.a((double)ni.field_j / 25.0, -122));
                                              gb.b(4 + si.field_y.field_l, 1 + si.field_y.field_a, si.field_y.field_n + -7, si.field_y.field_d - 2, 65793 * var23, var24_int * 65793);
                                              break L26;
                                            }
                                          } else {
                                            break L26;
                                          }
                                        }
                                        L32: {
                                          if (!fl.field_f) {
                                            break L32;
                                          } else {
                                            var22 = ob.field_c.length + -1;
                                            L33: while (true) {
                                              if ((var22 ^ -1) > -2) {
                                                break L32;
                                              } else {
                                                ob.field_c[var22].c(-105);
                                                var22--;
                                                continue L33;
                                              }
                                            }
                                          }
                                        }
                                        L34: {
                                          bk.b(7);
                                          if (0 <= mg.field_d) {
                                            L35: {
                                              if ((mg.field_d ^ -1) > -257) {
                                                stackIn_159_0 = 256;
                                                break L35;
                                              } else {
                                                stackIn_159_0 = 512 + mg.field_d * -1;
                                                break L35;
                                              }
                                            }
                                            L36: {
                                              var22 = stackIn_159_0;
                                              if (-1 >= (var22 ^ -1)) {
                                                break L36;
                                              } else {
                                                var22 = 0;
                                                break L36;
                                              }
                                            }
                                            L37: {
                                              stackIn_163_0 = tl.field_p;

                                              stackIn_163_1 = uj.field_d;

                                              stackIn_163_2 = 220;

                                              stackIn_163_3 = -110;

                                              if (mg.field_d > 160) {
                                                stackIn_164_0 = (fa) ((Object) stackIn_163_0);
                                                stackIn_164_1 = (String) ((Object) stackIn_163_1);
                                                stackIn_164_2 = stackIn_163_2;
                                                stackIn_164_3 = stackIn_163_3;
                                                stackIn_164_4 = 160;
                                                break L37;
                                              } else {
                                                stackIn_164_0 = (fa) ((Object) stackIn_163_0);
                                                stackIn_164_1 = (String) ((Object) stackIn_163_1);
                                                stackIn_164_2 = stackIn_163_2;
                                                stackIn_164_3 = stackIn_163_3;
                                                stackIn_164_4 = mg.field_d;
                                                break L37;
                                              }
                                            }
                                            ((fa) (Object) stackIn_164_0).a(stackIn_164_1, stackIn_164_2, stackIn_164_3 - -stackIn_164_4, 200, 150, 0, -1, var22, 1, 1, tl.field_p.field_H);
                                            break L34;
                                          } else {
                                            break L34;
                                          }
                                        }
                                        L38: {
                                          if (-1 <= (qg.field_c ^ -1)) {
                                            break L38;
                                          } else {
                                            if (0 != nb.field_b) {
                                              break L38;
                                            } else {
                                              var22 = qg.field_c / 50;
                                              var23 = qg.field_c % 50;
                                              var24 = ji.field_f[var22];
                                              var6 = 240;
                                              var5 = 320;
                                              var6 = var6 - nc.field_d.field_t / 2;
                                              var25 = var23 * var24.field_x / 50;
                                              var26 = var23 * var24.field_r / 50;
                                              var24.d(var5 - var25 / 2, var6 - var26 / 2, var25, var26, 128);
                                              ai.field_n[var22].d(-(var25 / 2) + var5, -(var26 / 2) + var6, var25, var26, 16);
                                              ai.field_n[var22].c(var5 - var25 / 2, -(var26 / 2) + var6, var25, var26, 128);
                                              break L38;
                                            }
                                          }
                                        }
                                        break L0;
                                      } else {
                                        var10_int = -(4 * (ni.field_j - nc.field_a[var9])) + 256;
                                        if (0 <= var10_int) {
                                          L39: {
                                            if (var10_int <= 255) {
                                              var11 = 10 - -((ni.field_j - nc.field_a[var9]) * 2);
                                              var12_int = lj.field_c[var9] * 16;
                                              var12_int = var12_int - var11 / 2;
                                              var13_int = 16 * fb.field_e[var9];
                                              var13_int = var13_int - var11 / 2;
                                              ca.field_P.c(var12_int, var13_int, var11, var11, var10_int);
                                              break L39;
                                            } else {
                                              break L39;
                                            }
                                          }
                                          var9++;
                                          continue L9;
                                        } else {
                                          var9++;
                                          continue L9;
                                        }
                                      }
                                    }
                                  } else {
                                    L40: {
                                      if (1 != jd.field_o[var9]) {
                                        break L40;
                                      } else {
                                        aj.field_t[5].d(qg.field_a[var9] - 10, dh.field_b[var9] - 18);
                                        el.field_s[va.field_t[var9]].d(qg.field_a[var9] - 2, dh.field_b[var9] + -2);
                                        break L40;
                                      }
                                    }
                                    var9++;
                                    continue L7;
                                  }
                                }
                              } else {
                                var4 = 20;
                                L41: while (true) {
                                  if (0 > var4) {
                                    var3--;
                                    continue L6;
                                  } else {
                                    L42: {
                                      L43: {
                                        var7 = fl.field_c[var3][var4];
                                        if (-18 == (var7 ^ -1)) {
                                          break L43;
                                        } else {
                                          if (var7 != 31) {
                                            break L42;
                                          } else {
                                            break L43;
                                          }
                                        }
                                      }
                                      aj.field_t[var7 + 36].d(16 * var3 + -4, 16 * var4 - 4);
                                      if (!fl.field_f) {
                                        break L42;
                                      } else {
                                        var9 = 64 + -(ni.field_j % 64);
                                        gb.a(-2 + (var3 * 16 - -8), 16 * var4 - -6, var9 / 4, 16777215, 256 - 4 * var9);
                                        break L42;
                                      }
                                    }
                                    if (var7 == 1) {
                                      L44: {
                                        if (fl.field_f) {
                                          var9 = ni.field_j % 64;
                                          gb.a(7 + var3 * 16, 8 + (-1 + 16 * var4), var9 / 4, 16777215, 256 + -(var9 * 4));
                                          break L44;
                                        } else {
                                          break L44;
                                        }
                                      }
                                      var4--;
                                      continue L41;
                                    } else {
                                      var4--;
                                      continue L41;
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            var4 = 20;
                            L45: while (true) {
                              if (0 > var4) {
                                var3--;
                                continue L5;
                              } else {
                                L46: {
                                  L47: {
                                    var7 = fl.field_c[var3][var4];
                                    if (2 == var7) {
                                      break L47;
                                    } else {
                                      if (var7 == 7) {
                                        break L47;
                                      } else {
                                        if (var7 != 0) {
                                          aj.field_t[var7 + 36].d(16 * var3 - 4, -4 + 16 * var4);
                                          break L46;
                                        } else {
                                          break L46;
                                        }
                                      }
                                    }
                                  }
                                  de.a((byte) 88, var3, var2, var4);
                                  break L46;
                                }
                                var4--;
                                continue L45;
                              }
                            }
                          }
                        }
                      } else {
                        var5 = f.field_F[var9];
                        var6 = ek.field_b[var9];
                        aj.field_t[15].d(16 * var5 - 4, -4 + (-2 + var6) * 16 - -hl.field_C[var9]);
                        var9++;
                        continue L4;
                      }
                    }
                  } else {
                    L48: {
                      if (1 != jd.field_o[var9]) {
                        if (-1 == (cl.field_d[var9] ^ -1)) {
                          if (db.field_H == 0) {
                            el.field_s[va.field_t[var9]].d(-2 + qg.field_a[var9], -2 + dh.field_b[var9]);
                            break L48;
                          } else {
                            el.field_s[va.field_t[var9]].b(qg.field_a[var9] + -2, dh.field_b[var9] + -2);
                            break L48;
                          }
                        } else {
                          break L48;
                        }
                      } else {
                        break L48;
                      }
                    }
                    var9++;
                    continue L3;
                  }
                }
              } else {
                var4 = 20;
                L49: while (true) {
                  if (0 > var4) {
                    var3--;
                    continue L2;
                  } else {
                    L50: {
                      L51: {
                        var7 = fl.field_c[var3][var4];
                        if ((var7 ^ -1) == -3) {
                          break L51;
                        } else {
                          if (var7 != 7) {
                            if (var7 != 18) {
                              break L50;
                            } else {
                              lg.a(-4, var4, var2, var3);
                              break L50;
                            }
                          } else {
                            break L51;
                          }
                        }
                      }
                      de.a((byte) 88, var3, var2, var4);
                      break L50;
                    }
                    L52: {
                      if (var7 != 0) {
                        aj.field_t[var7].d(16 * var3 + -4, 16 * var4 - 4);
                        break L52;
                      } else {
                        break L52;
                      }
                    }
                    var4--;
                    continue L49;
                  }
                }
              }
            }
          }
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
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var5 = of.a(param1, param2, param0, 119);
              var4 = var5;
              if (var4 != null) {
                var5[1].field_x = var5[1].field_w;
                var5[3].field_r = var5[3].field_t;
                var5[5].field_r = var5[5].field_t;
                var5[7].field_x = var5[7].field_w;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param3 == 61) {
                break L2;
              } else {
                field_b = (String) null;
                break L2;
              }
            }
            stackIn_6_0 = (dd[]) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4_ref = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var4_ref);

            stackIn_9_1 = new StringBuilder().append("fc.A(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_10_0), stackIn_16_2 + ',' + param3 + ')');
        }
        return stackIn_6_0;
    }

    final static ad d(int param0) {
        if (param0 != 64) {
            fc.b(-31);
        }
        String var1 = vi.b((byte) -55);
        if (var1 != null && 0 <= var1.indexOf('@')) {
            var1 = "";
        }
        return new ad(vi.b((byte) -55), id.a(param0 + -5999));
    }

    static {
        field_d = "Change display name";
        field_b = "?";
    }
}
