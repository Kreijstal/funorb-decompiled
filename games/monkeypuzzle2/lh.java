/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lh {
    static String field_a;
    static am field_c;
    static int field_b;
    static boolean field_e;
    static String[] field_d;

    final static void a(ad param0, ad param1, ad param2, int param3) {
        ai discarded$1 = null;
        RuntimeException var4 = null;
        ai[] var5 = null;
        ai[][] var6 = null;
        int[][] var7 = null;
        int var8 = 0;
        int var9 = 0;
        ai[] var10 = null;
        le var11 = null;
        int var11_int = 0;
        int var12 = 0;
        le var13 = null;
        int var14 = 0;
        ai[] var15 = null;
        le var16 = null;
        int[][] var17 = null;
        le var18 = null;
        le var19 = null;
        int[][] var20 = null;
        int stackIn_10_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_17_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var14 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            pe.field_a = lb.a(false, "commonui", param1, "frame_top");
            ra.field_Z = lb.a(false, "commonui", param1, "frame_bottom");
            af.field_e = ma.a(param1, "jagex_logo_grey", 16711680, "commonui");
            qj.field_C = lb.a(false, "commonui", param1, "button");
            hk.field_i = rd.a("validation", param1, 0, "commonui");
            pf.field_c = (ta) ((Object) cb.a("commonui", param0, -103, param1, "arezzo12"));
            t.field_z = (ta) ((Object) cb.a("commonui", param0, -99, param1, "arezzo14"));
            pj.field_c = (ta) ((Object) cb.a("commonui", param0, -75, param1, "arezzo14bold"));
            var18 = new le(param2.a("", "button.gif", -128), (java.awt.Component) ((Object) ie.field_e));
            discarded$1 = df.a("commonui", param1, (byte) 118, "dropdown");
            var5 = uj.a("commonui", "screen_options", param1, false);
            vj.field_d = new ai[4];
            oa.field_D = new ai[4];
            tf.field_a = new ai[4];
            var6 = new ai[][]{vj.field_d, tf.field_a, oa.field_D};
            var20 = new int[4][];
            var17 = var20;
            var7 = var17;
            var7[0] = var5[0].field_m;
            var8 = 1;
            L1: while (true) {
              L2: {
                L3: {
                  if (var8 >= var20.length) {
                    break L3;
                  } else {
                    var7[var8] = (int[]) ((Object) var20[0].clone());
                    var8++;
                    if (var14 != 0) {
                      break L2;
                    } else {
                      if (var14 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var8 = var5[0].field_n[0];
                var20[2][var8] = 16777215;
                var20[1][var8] = 2394342;
                var20[3][var8] = 4767999;
                break L2;
              }
              var9 = 0;
              L4: while (true) {
                L5: {
                  L6: {
                    if (3 <= var9) {
                      break L6;
                    } else {
                      var15 = var6[var9];
                      var10 = var15;
                      stackOut_9_0 = 0;
                      stackIn_18_0 = stackOut_9_0;
                      stackIn_10_0 = stackOut_9_0;
                      if (var14 != 0) {
                        break L5;
                      } else {
                        var11_int = stackIn_10_0;
                        L7: while (true) {
                          L8: {
                            L9: {
                              if (var11_int >= var15.length) {
                                break L9;
                              } else {
                                var15[var11_int] = ri.a(var5[var9], true, var20[var11_int]);
                                var11_int++;
                                if (var14 != 0) {
                                  break L8;
                                } else {
                                  if (var14 == 0) {
                                    continue L7;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                            }
                            var9++;
                            break L8;
                          }
                          if (var14 == 0) {
                            continue L4;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                  }
                  var9 = var18.field_j;
                  vf.a((byte) 34);
                  var18.e();
                  stackOut_17_0 = 0;
                  stackIn_18_0 = stackOut_17_0;
                  break L5;
                }
                ge.g(stackIn_18_0, 0, ge.field_h, ge.field_g);
                var16 = new le(var9, var9);
                var19 = var16;
                var19.e();
                var18.a(0, 0);
                var12 = 16 % ((param3 - 39) / 53);
                var11 = new le(var9, var9);
                var11.e();
                var18.a(-var18.field_k + var9, 0);
                var13 = new le(-(var9 * 2) + var18.field_k, var9);
                var13.e();
                var18.a(-var9, 0);
                tj.b(653);
                qj.field_C = new le[]{var16, var13, var11};
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var4 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) (var4);
            stackOut_20_1 = new StringBuilder().append("lh.D(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L10;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L10;
            }
          }
          L11: {
            stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L11;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L11;
            }
          }
          L12: {
            stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
            stackOut_26_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',');
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param2 == null) {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L12;
            } else {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L12;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ',' + param3 + ')');
        }
    }

    final static cj a(boolean param0, String param1, int param2) {
        cj var3 = null;
        RuntimeException var3_ref = null;
        cj stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        cj stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              var3 = new cj(false);
              var3.field_i = param2;
              var3.field_h = param1;
              if (param0) {
                break L1;
              } else {
                field_e = false;
                break L1;
              }
            }
            stackOut_2_0 = (cj) (var3);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3_ref);
            stackOut_4_1 = new StringBuilder().append("lh.C(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    final static String a(byte param0) {
        if (param0 > -93) {
            field_b = 46;
            return MonkeyPuzzle2.field_D.f(-1);
        }
        return MonkeyPuzzle2.field_D.f(-1);
    }

    public static void a(int param0) {
        if (param0 != 0) {
          field_c = (am) null;
          field_c = null;
          field_a = null;
          field_d = null;
          return;
        } else {
          field_c = null;
          field_a = null;
          field_d = null;
          return;
        }
    }

    static {
        field_a = "Discard";
        field_c = new am();
        field_d = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
    }
}
