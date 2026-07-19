/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mj {
    static aa field_e;
    static String field_a;
    static volatile boolean field_c;
    static int field_d;
    static String field_f;
    static int[] field_b;

    public static void b(int param0) {
        field_b = null;
        if (param0 != -2069072125) {
            return;
        }
        field_a = null;
        field_e = null;
        field_f = null;
    }

    final static void a(int param0) {
        qj var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        qj[] stackIn_5_0 = null;
        qj[] stackOut_3_0 = null;
        qj[] stackOut_4_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = TrackController.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var1 = ii.field_r[39];
                        var2 = 40;
                        var3 = 0;
                        if (param0 == 208) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    stackOut_3_0 = mb.field_d;
                    stackIn_5_0 = stackOut_3_0;
                    statePc = 5;
                    continue stateLoop;
                }
                case 4: {
                    try {
                        stackOut_4_0 = mb.field_d;
                        stackIn_5_0 = stackOut_4_0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (stackIn_5_0.length <= var3) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        mb.field_d[var3] = new qj(var2, var2);
                        mb.field_d[var3].a();
                        var1.a(208, 208, var2 << -673407325, var2 << -2069072125, (int)(0.5 + 16384.0 * (double)var3 / 26.0), 4096);
                        var3++;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        ia.field_b.a(-91);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 9: {
                    var1_ref = (RuntimeException) ((Object) caughtException);
                    throw sl.a((Throwable) ((Object) var1_ref), "mj.A(" + param0 + ')');
                }
                case 10: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_a = "This password contains repeated characters, and would be easy to guess";
        field_f = "All";
        field_c = false;
        field_e = new aa(1, 2, 2, 0);
    }
}
