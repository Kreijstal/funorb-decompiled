/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ne {
    static String field_b;
    static String field_g;
    static String field_f;
    static int[] field_e;
    static char field_a;
    static um field_c;
    static String field_d;

    public static void a(boolean param0) {
        field_g = null;
        if (param0) {
            field_b = null;
        }
        field_c = null;
        field_e = null;
        field_f = null;
        field_d = null;
        field_b = null;
    }

    final static void a(byte param0, int param1) {
        int var3 = Virogrid.field_F ? 1 : 0;
        fa var4 = (fa) (Object) oi.field_a.a((byte) -115);
        while (var4 != null) {
            bf.a(var4, 4, param1);
            var4 = (fa) (Object) oi.field_a.a(16213);
        }
        l var2 = di.field_v.a((byte) -67);
        if (param0 != 19) {
            field_f = null;
        }
        while (var2 != null) {
            wb.a(param1, param0 + -19);
            var2 = di.field_v.a(16213);
        }
    }

    final static boolean a(int param0, String param1) {
        String var2 = null;
        Exception var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_15_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = Virogrid.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (pd.field_x.startsWith("win")) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackOut_2_0 = 0;
                        stackIn_3_0 = stackOut_2_0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0 != 0;
                }
                case 4: {
                    try {
                        if (param1.startsWith("http://")) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (param1.startsWith("https://")) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackOut_6_0 = 0;
                        stackIn_7_0 = stackOut_6_0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 7: {
                    return stackIn_7_0 != 0;
                }
                case 8: {
                    try {
                        var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                        var3 = 0;
                        if (param0 == 10448) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        ne.a(true);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var3 >= param1.length()) {
                            statePc = 15;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if ((var2.indexOf((int) param1.charAt(var3)) ^ -1) != 0) {
                            statePc = 14;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackOut_12_0 = 0;
                        stackIn_13_0 = stackOut_12_0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 13: {
                    return stackIn_13_0 != 0;
                }
                case 14: {
                    try {
                        var3++;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        Process discarded$2 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param1 + "\"");
                        stackOut_15_0 = 1;
                        stackIn_16_0 = stackOut_15_0;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 16: {
                    return stackIn_16_0 != 0;
                }
                case 17: {
                    var2_ref = (Exception) (Object) caughtException;
                    return false;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static String a(byte param0) {
        if (!(ao.field_Kb != pa.field_l)) {
            return rh.field_b;
        }
        if (param0 != -52) {
            return null;
        }
        if (ao.field_Kb == cb.field_c) {
            return ve.field_u;
        }
        if (!(w.field_I.b(-88))) {
            return ve.field_u;
        }
        return pm.field_g;
    }

    final static mg[] a(int param0, int param1, int param2, byte param3, int param4, int param5) {
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        mg var9 = null;
        mg var10 = null;
        mg var11 = null;
        mg var12 = null;
        mg var13 = null;
        mg var14 = null;
        int[] var15 = null;
        mg var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        L0: {
          var20 = df.field_d;
          var19 = var20;
          var18 = var19;
          var17 = var18;
          var15 = var17;
          var6 = var15;
          var7 = df.field_e;
          var8 = df.field_f;
          var9 = new mg(param1, -(param1 * 2) + param0);
          var9.b();
          df.a(0, 0, param1, param0 + -(2 * param1), param5, param4);
          var10 = new mg(param1, param1);
          var10.b();
          df.b(0, 0, param1, param1, param5);
          var11 = new mg(16, param1);
          var11.b();
          df.b(0, 0, 16, param1, param5);
          var12 = new mg(param1, param1);
          var12.b();
          df.b(0, 0, param1, param1, param4);
          var13 = new mg(16, param1);
          var13.b();
          if (param3 == 106) {
            break L0;
          } else {
            field_c = null;
            break L0;
          }
        }
        L1: {
          df.b(0, 0, 16, param1, param4);
          var14 = null;
          if ((param2 ^ -1) < -1) {
            var16 = new mg(16, 16);
            var14 = var16;
            var16.b();
            df.b(0, 0, 16, 16, param2);
            break L1;
          } else {
            break L1;
          }
        }
        df.a(var20, var7, var8);
        return new mg[]{var10, var11, var10, var9, var14, var9, var12, var13, var12};
    }

    final static void a(int param0) {
        kf.a(param0, param0 + -18);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Game drawn";
        field_a = '/';
        field_f = "Password is valid";
        field_d = "Mute this player for 48 hours";
    }
}
