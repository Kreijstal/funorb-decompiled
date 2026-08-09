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
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var4 = null;
        ai[] var5 = null;
        ai[][] var6 = null;
        int[][] var7 = null;
        int var8 = 0;
        int var9 = 0;
        ai[] var10 = null;
        int var11_int = 0;
        le var11 = null;
        int var12 = 0;
        le var13 = null;
        int var14 = 0;
        ai[] var15 = null;
        le var16 = null;
        int[][] var17 = null;
        le var18 = null;
        le var19 = null;
        int[][] var20 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var14 = MonkeyPuzzle2.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        pe.field_a = lb.a(false, "commonui", param1, "frame_top");
                        ra.field_Z = lb.a(false, "commonui", param1, "frame_bottom");
                        af.field_e = ma.a(param1, "jagex_logo_grey", 16711680, "commonui");
                        qj.field_C = lb.a(false, "commonui", param1, "button");
                        hk.field_i = rd.a("validation", param1, 0, "commonui");
                        pf.field_c = (ta) ((Object) cb.a("commonui", param0, -103, param1, "arezzo12"));
                        t.field_z = (ta) ((Object) cb.a("commonui", param0, -99, param1, "arezzo14"));
                        pj.field_c = (ta) ((Object) cb.a("commonui", param0, -75, param1, "arezzo14bold"));
                        var18 = new le(param2.a("", "button.gif", -128), (java.awt.Component) ((Object) ie.field_e));
                        df.a("commonui", param1, (byte) 118, "dropdown");
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
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var8 >= var20.length) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var7[var8] = (int[]) ((Object) var20[0].clone());
                        var8++;
                        if (var14 != 0) {
                            statePc = 7;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var14 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var8 = var5[0].field_n[0];
                        var20[2][var8] = 16777215;
                        var20[1][var8] = 2394342;
                        var20[3][var8] = 4767999;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var9 = 0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (3 <= var9) {
                            statePc = 17;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var15 = var6[var9];
                        var10 = var15;
                        stackIn_18_0 = 0;
                        stackIn_10_0 = stackIn_18_0;
                        if (var14 != 0) {
                            statePc = 18;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var11_int = stackIn_10_0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var11_int >= var15.length) {
                            statePc = 15;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var15[var11_int] = ri.a(var5[var9], true, var20[var11_int]);
                        var11_int++;
                        if (var14 != 0) {
                            statePc = 16;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var14 == 0) {
                            statePc = 11;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var9++;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (var14 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var9 = var18.field_j;
                        vf.a((byte) 34);
                        var18.e();
                        stackIn_18_0 = 0;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
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
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 20: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    stackIn_22_0 = (RuntimeException) (var4);
                    stackIn_21_0 = stackIn_22_0;
                    stackIn_22_1 = new StringBuilder().append("lh.D(");
                    stackIn_21_1 = stackIn_22_1;
                    if (param0 == null) {
                        statePc = 22;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    stackIn_23_0 = (RuntimeException) ((Object) stackIn_21_0);
                    stackIn_23_1 = (StringBuilder) ((Object) stackIn_21_1);
                    stackIn_23_2 = "{...}";
                    statePc = 23;
                    continue stateLoop;
                }
                case 22: {
                    stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
                    stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
                    stackIn_23_2 = "null";
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    stackIn_25_0 = (RuntimeException) ((Object) stackIn_23_0);
                    stackIn_24_0 = stackIn_25_0;
                    stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');
                    stackIn_24_1 = stackIn_25_1;
                    if (param1 == null) {
                        statePc = 25;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    stackIn_26_0 = (RuntimeException) ((Object) stackIn_24_0);
                    stackIn_26_1 = (StringBuilder) ((Object) stackIn_24_1);
                    stackIn_26_2 = "{...}";
                    statePc = 26;
                    continue stateLoop;
                }
                case 25: {
                    stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
                    stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
                    stackIn_26_2 = "null";
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    stackIn_28_0 = (RuntimeException) ((Object) stackIn_26_0);
                    stackIn_27_0 = stackIn_28_0;
                    stackIn_28_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',');
                    stackIn_27_1 = stackIn_28_1;
                    if (param2 == null) {
                        statePc = 28;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    stackIn_29_0 = (RuntimeException) ((Object) stackIn_27_0);
                    stackIn_29_1 = (StringBuilder) ((Object) stackIn_27_1);
                    stackIn_29_2 = "{...}";
                    statePc = 29;
                    continue stateLoop;
                }
                case 28: {
                    stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
                    stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
                    stackIn_29_2 = "null";
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    throw la.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ',' + param3 + ')');
                }
                case 30: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static cj a(boolean param0, String param1, int param2) {
        cj var3 = null;
        RuntimeException var3_ref = null;
        cj stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            stackIn_3_0 = (cj) (var3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3_ref);

            stackIn_6_1 = new StringBuilder().append("lh.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
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
