/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ll {
    static boolean field_a;

    final static void a(int param0, int param1) {
        if (!(ej.field_o != ob.field_b[param0])) {
            ej.field_o = null;
        }
        if (tm.field_h == kd.field_Fb[param0]) {
            tm.field_h = null;
        }
    }

    final static void a(dj param0, dj param1, dj param2) {
        RuntimeException var4 = null;
        v[] var5 = null;
        v[][] var6 = null;
        int[][] var7 = null;
        int var8 = 0;
        int var9 = 0;
        v[] var10 = null;
        vn var11 = null;
        int var11_int = 0;
        vn var12 = null;
        int var13 = 0;
        v[] var14 = null;
        vn var15 = null;
        int[][] var16 = null;
        vn var17 = null;
        vn var18 = null;
        int[][] var19 = null;
        int[][] var20 = null;
        int[][] var21 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var13 = ZombieDawn.field_J;
        try {
          L0: {
            ad.field_f = vm.a((byte) 117, "frame_top", "commonui", param1);
            dp.field_b = vm.a((byte) -44, "frame_bottom", "commonui", param1);
            we.field_Tb = gf.a(param1, "jagex_logo_grey", 8, "commonui");
            ia.field_d = vm.a((byte) -83, "button", "commonui", param1);
            dj.field_k = df.a((byte) 24, "commonui", "validation", param1);
            ii.field_a = (rb) (Object) ra.a(param0, "commonui", "arezzo12", 0, param1);
            ia.field_e = (rb) (Object) ra.a(param0, "commonui", "arezzo14", 0, param1);
            rk.field_b = (rb) (Object) ra.a(param0, "commonui", "arezzo14bold", 0, param1);
            var17 = new vn(param2.a("", -89, "button.gif"), (java.awt.Component) (Object) cj.field_d);
            v discarded$3 = vj.a(param1, "dropdown", "commonui", 4424743);
            var5 = dd.a("commonui", "screen_options", -1864, param1);
            af.field_c = new v[4];
            ti.field_e = new v[4];
            li.field_h = new v[4];
            var6 = new v[][]{ti.field_e, li.field_h, af.field_c};
            var21 = new int[4][];
            var20 = var21;
            var19 = var20;
            var16 = var19;
            var7 = var16;
            var7[0] = var5[0].field_l;
            var8 = 1;
            L1: while (true) {
              if (var8 >= var21.length) {
                var8 = var5[0].field_k[0];
                var21[2][var8] = 16777215;
                var21[1][var8] = 2394342;
                var21[3][var8] = 4767999;
                var9 = 0;
                L2: while (true) {
                  if (3 <= var9) {
                    var9 = var17.field_t;
                    int discarded$4 = 1584;
                    hk.i();
                    var17.a();
                    bi.a(0, 0, bi.field_f, bi.field_a);
                    var15 = new vn(var9, var9);
                    var18 = var15;
                    var18.a();
                    var17.e(0, 0);
                    var11 = new vn(var9, var9);
                    var11.a();
                    var17.e(var9 - var17.field_w, 0);
                    var12 = new vn(var17.field_w + -(2 * var9), var9);
                    var12.a();
                    var17.e(-var9, 0);
                    pa.a(-21189);
                    ia.field_d = new vn[]{var15, var12, var11};
                    break L0;
                  } else {
                    var14 = var6[var9];
                    var10 = var14;
                    var11_int = 0;
                    L3: while (true) {
                      if (var11_int >= var14.length) {
                        var9++;
                        continue L2;
                      } else {
                        int discarded$5 = -27837;
                        var14[var11_int] = ud.a(var5[var9], var21[var11_int]);
                        var11_int++;
                        continue L3;
                      }
                    }
                  }
                }
              } else {
                var7[var8] = (int[]) var21[0].clone();
                var8++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4;
            stackOut_12_1 = new StringBuilder().append("ll.E(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          L5: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          L6: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param2 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + -19041 + 41);
        }
    }

    abstract void a(boolean param0, de param1);

    abstract nk a(byte param0);

    final static void a() {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        mf var9 = null;
        int var10 = 0;
        int stackIn_11_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        mf stackIn_17_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        mf stackOut_16_0 = null;
        mf stackOut_15_0 = null;
        var10 = ZombieDawn.field_J;
        try {
          L0: {
            var1_int = eb.field_a - eb.field_c;
            eb.field_c = -(var1_int >> 1) + im.field_d;
            eb.field_a = eb.field_c + var1_int;
            el.field_k = sc.field_b - (qk.field_Mb >> 1);
            var2 = el.field_k;
            var3 = 0;
            L1: while (true) {
              if (n.field_r.length <= var3) {
                break L0;
              } else {
                L2: {
                  var4 = la.field_b[var3];
                  if (var4 >= 0) {
                    if (var4 == kk.field_m.field_d) {
                      var5 = ej.field_s;
                      break L2;
                    } else {
                      var5 = qi.field_E;
                      break L2;
                    }
                  } else {
                    var5 = qg.field_f;
                    break L2;
                  }
                }
                L3: {
                  var6 = n.field_r[var3];
                  stackOut_10_0 = 32564;
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_11_0 = stackOut_10_0;
                  if (0 > var4) {
                    stackOut_12_0 = stackIn_12_0;
                    stackOut_12_1 = 0;
                    stackIn_13_0 = stackOut_12_0;
                    stackIn_13_1 = stackOut_12_1;
                    break L3;
                  } else {
                    stackOut_11_0 = stackIn_11_0;
                    stackOut_11_1 = 1;
                    stackIn_13_0 = stackOut_11_0;
                    stackIn_13_1 = stackOut_11_1;
                    break L3;
                  }
                }
                L4: {
                  var7 = sm.a(stackIn_13_0, stackIn_13_1 != 0, var6);
                  var8 = -(var7 >> 1) + im.field_d;
                  if (var4 < 0) {
                    break L4;
                  } else {
                    L5: {
                      if (kk.field_m.field_d != var4) {
                        stackOut_16_0 = dd.field_b;
                        stackIn_17_0 = stackOut_16_0;
                        break L5;
                      } else {
                        stackOut_15_0 = qi.field_G;
                        stackIn_17_0 = stackOut_15_0;
                        break L5;
                      }
                    }
                    L6: {
                      var9 = stackIn_17_0;
                      var2 = var2 + qb.field_i;
                      if (var9 == null) {
                        break L6;
                      } else {
                        var9.a((nb.field_m << 1) + var7, var2, -nb.field_m + var8, (byte) -118, ma.field_k + (lb.field_Y << 1));
                        break L6;
                      }
                    }
                    var2 = var2 + lb.field_Y;
                    break L4;
                  }
                }
                L7: {
                  if (var4 >= 0) {
                    wb.field_m.c(var6, var8, pf.field_g + var2, var5, -1);
                    var2 = var2 + (ma.field_k + lb.field_Y + qb.field_i);
                    break L7;
                  } else {
                    re.field_g.c(var6, var8, fa.field_p + var2, var5, -1);
                    var2 = var2 + mh.field_G;
                    break L7;
                  }
                }
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sh.a((Throwable) (Object) var1, "ll.A(" + -67 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = false;
    }
}
