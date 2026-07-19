/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hc {
    static String field_b;
    int field_a;
    static String field_c;

    final static si a(boolean param0) {
        int var1_int = 0;
        IllegalArgumentException var1 = null;
        si var2 = null;
        int var3 = 0;
        si stackIn_3_0 = null;
        jo stackIn_6_0 = null;
        si stackIn_8_0 = null;
        si stackOut_2_0 = null;
        jo stackOut_4_0 = null;
        jo stackOut_5_0 = null;
        si stackOut_7_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = ShatteredPlansClient.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var1_int = 0;
                        if (!param0) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackOut_2_0 = (si) null;
                        stackIn_3_0 = stackOut_2_0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0;
                }
                case 4: {
                    stackOut_4_0 = kq.field_A;
                    stackIn_6_0 = stackOut_4_0;
                    statePc = 6;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        stackOut_5_0 = kq.field_A;
                        stackIn_6_0 = stackOut_5_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var2 = ((jo) (Object) stackIn_6_0).a(var1_int, (byte) 100);
                        if (!var2.field_y) {
                            statePc = 9;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackOut_7_0 = (si) (var2);
                        stackIn_8_0 = stackOut_7_0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return stackIn_8_0;
                }
                case 9: {
                    try {
                        var1_int++;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 10: {
                    var1 = (IllegalArgumentException) ((Object) caughtException);
                    return null;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static lp a(int param0, int param1, int param2) {
        lp var9 = new lp(param0, param2, 209, rs.field_Cb.field_J);
        int var4 = (-rs.field_Cb.c(ho.field_g) + 209 + -20) / 2;
        vc.field_b = new bi(var4, 2);
        int var5 = 112 / ((param1 - 89) / 37);
        ra.a(-107);
        vc.field_b.e();
        gf.d(0, 0, var4, 2, 16777215);
        cg.i(0);
        ff var6 = new ff(5 + param0, var9.field_i / 2 + param2, vc.field_b);
        ff var7 = new ff(-vc.field_b.field_z + (var9.field_m + (param0 - 5)), var9.field_i / 2 + param2, vc.field_b);
        qk var8 = new qk(param0, param2, var9.field_m, var9.field_i, ho.field_g);
        var9.a(var6, 8);
        var9.a(var7, 8);
        var9.a(var8, 8);
        return var9;
    }

    public static void a(byte param0) {
        lp discarded$0 = null;
        field_c = null;
        if (param0 < 41) {
            discarded$0 = hc.a(-92, -95, -94);
            field_b = null;
            return;
        }
        field_b = null;
    }

    static {
        field_b = "Loading music";
        field_c = "Lost";
    }
}
