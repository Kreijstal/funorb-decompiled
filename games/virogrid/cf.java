/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cf {
    static String field_b;
    static float field_c;
    static String field_a;

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        int var1 = -95 / ((param0 - 66) / 45);
    }

    final static void a(eh param0, eh param1, int param2, eh param3) {
        RuntimeException var4 = null;
        rm[] var5 = null;
        rm[][] var6 = null;
        int[][] var7 = null;
        int var8 = 0;
        int var9 = 0;
        rm[] var10 = null;
        mg var11 = null;
        int var11_int = 0;
        mg var12 = null;
        int var13 = 0;
        rm[] var14 = null;
        mg var15 = null;
        int[][] var16 = null;
        mg var17 = null;
        mg var18 = null;
        int[][] var19 = null;
        int[][] var20 = null;
        int[][] var21 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var13 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 >= 51) {
                break L1;
              } else {
                cf.a(105);
                break L1;
              }
            }
            qm.field_Kb = ke.a(32, param0, "commonui", "frame_top");
            qg.field_j = ke.a(32, param0, "commonui", "frame_bottom");
            ed.field_d = sn.a(param0, "jagex_logo_grey", "commonui", false);
            td.field_g = ke.a(32, param0, "commonui", "button");
            bf.field_p = jj.a("commonui", param0, false, "validation");
            dk.field_j = (e) (Object) pc.a(param0, -1, "commonui", "arezzo12", param3);
            dj.field_h = (e) (Object) pc.a(param0, -1, "commonui", "arezzo14", param3);
            on.field_b = (e) (Object) pc.a(param0, -1, "commonui", "arezzo14bold", param3);
            var17 = new mg(param1.a("button.gif", 100, ""), (java.awt.Component) (Object) fi.field_v);
            rm discarded$1 = vc.a(param0, "dropdown", "commonui", (byte) 39);
            var5 = ke.a("screen_options", "commonui", param0, 32370);
            dk.field_q = new rm[4];
            hj.field_g = new rm[4];
            jc.field_h = new rm[4];
            var6 = new rm[][]{hj.field_g, jc.field_h, dk.field_q};
            var21 = new int[4][];
            var20 = var21;
            var19 = var20;
            var16 = var19;
            var7 = var16;
            var7[0] = var5[0].field_m;
            var8 = 1;
            L2: while (true) {
              if (var21.length <= var8) {
                var8 = var5[0].field_n[0];
                var21[2][var8] = 16777215;
                var21[1][var8] = 2394342;
                var21[3][var8] = 4767999;
                var9 = 0;
                L3: while (true) {
                  if (var9 >= 3) {
                    var9 = var17.field_p;
                    lm.a(0);
                    var17.b();
                    df.e(0, 0, df.field_e, df.field_f);
                    var15 = new mg(var9, var9);
                    var18 = var15;
                    var18.b();
                    var17.b(0, 0);
                    var11 = new mg(var9, var9);
                    var11.b();
                    var17.b(var9 + -var17.field_w, 0);
                    var12 = new mg(var17.field_w - var9 * 2, var9);
                    var12.b();
                    var17.b(-var9, 0);
                    ai.a(true);
                    td.field_g = new mg[]{var15, var12, var11};
                    break L0;
                  } else {
                    var14 = var6[var9];
                    var10 = var14;
                    var11_int = 0;
                    L4: while (true) {
                      if (var11_int >= var14.length) {
                        var9++;
                        continue L3;
                      } else {
                        var14[var11_int] = fe.a(var5[var9], var21[var11_int], (byte) -107);
                        var11_int++;
                        continue L4;
                      }
                    }
                  }
                }
              } else {
                var7[var8] = (int[]) var21[0].clone();
                var8++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var4;
            stackOut_14_1 = new StringBuilder().append("cf.E(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          L6: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          L7: {
            stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(44).append(param2).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param3 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L7;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L7;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 41);
        }
    }

    final static void a(byte param0, boolean param1) {
        if (!(ij.field_j == null)) {
            df.g(df.field_i, df.field_g, -df.field_i + df.field_k, df.field_h + -df.field_g);
            ij.field_j.a(param1, 24960);
        }
        if (param0 > -94) {
            ck discarded$0 = cf.a((byte) 1);
        }
    }

    final static ck a(byte param0) {
        if (param0 >= -19) {
            Object var2 = null;
            cf.a((cj) null, (byte) 82);
        }
        if (!(pa.field_l != kh.field_e)) {
            throw new IllegalStateException();
        }
        if (pa.field_l != rg.field_d) {
            return null;
        }
        pa.field_l = kh.field_e;
        return vb.field_c;
    }

    final static int[] b(int param0) {
        if (param0 != -30481) {
            return null;
        }
        return new int[8];
    }

    final static void a(cj param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        cj var3 = null;
        int var4 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var4 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            if (null == param0.field_h) {
              return;
            } else {
              L1: {
                if (param1 >= 6) {
                  break L1;
                } else {
                  field_c = 1.6972997188568115f;
                  break L1;
                }
              }
              L2: {
                L3: {
                  if (param0.field_m != 0) {
                    break L3;
                  } else {
                    if (param0.field_a == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                var2_int = 0;
                L4: while (true) {
                  if (qh.field_K <= var2_int) {
                    break L2;
                  } else {
                    L5: {
                      var3 = el.field_s[var2_int];
                      if (var3.field_n != 2) {
                        break L5;
                      } else {
                        if (param0.field_m != var3.field_m) {
                          break L5;
                        } else {
                          if (param0.field_a != var3.field_a) {
                            break L5;
                          } else {
                            return;
                          }
                        }
                      }
                    }
                    var2_int++;
                    continue L4;
                  }
                }
              }
              L6: {
                if (param0.field_g != null) {
                  i.field_F = param0.field_n;
                  ca.field_O = param0.field_i;
                  an.field_a = param0.field_p;
                  sh.field_ub = param0.field_g;
                  break L6;
                } else {
                  break L6;
                }
              }
              ln.a(param0, 107);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var2;
            stackOut_22_1 = new StringBuilder().append("cf.A(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L7;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + param1 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Offer draw";
    }
}
