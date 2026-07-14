/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sc {
    static boolean field_a;
    static String field_c;
    static String field_b;
    static String[] field_d;

    static int a(int param0, int param1) {
        return param0 & param1;
    }

    public static void a(byte param0) {
        field_b = null;
        field_c = null;
        field_d = null;
        int var1 = 88 / ((-23 - param0) / 44);
    }

    final static void a(int param0, hi param1, int param2) {
        ih var5 = ud.field_b;
        var5.e(param2 + 7, param0);
        var5.field_i = var5.field_i + 1;
        int var4 = var5.field_i;
        var5.a(param2 ^ -12, param2);
        var5.a(-11, param1.field_j);
        var5.a(param2 + -12, param1.field_m);
        var5.a(param1.field_o, (byte) -46);
        var5.a(param1.field_i, (byte) -82);
        var5.a(param1.field_l, (byte) -67);
        var5.a(param1.field_n, (byte) -42);
        int discarded$0 = var5.c(var4, param2 + -30533);
        var5.c((byte) -81, var5.field_i - var4);
    }

    final static void a(int param0) {
        Object var1 = null;
        int var2 = 0;
        Throwable var3 = null;
        int var4 = 0;
        int var5 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = fleas.field_A ? 1 : 0;
                    var1 = (Object) (Object) rh.field_f;
                    // monitorenter rh.field_f
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        tl.field_o = tc.field_h;
                        lg.field_d = lg.field_d + 1;
                        if ((em.field_f ^ -1) > param0) {
                            statePc = 6;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (em.field_f == sd.field_a) {
                            statePc = 10;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var2 = qk.field_b[sd.field_a];
                        sd.field_a = 127 & 1 + sd.field_a;
                        if (0 <= var2) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        ei.field_H[var2] = false;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        ei.field_H[var2] = true;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var5 = 0;
                        var2 = var5;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (-113 <= var5) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        ei.field_H[var5] = false;
                        var5++;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        em.field_f = sd.field_a;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        tc.field_h = ak.field_e;
                        // monitorexit var1
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var3 = caughtException;
                        // monitorexit var1
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 13: {
                    throw (RuntimeException) (Object) var3;
                }
                case 14: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = true;
        field_b = "Create a free account to start using this feature";
        field_c = "Loading levels";
        field_d = new String[16];
    }
}
