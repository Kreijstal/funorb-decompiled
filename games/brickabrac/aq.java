/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aq implements Runnable {
    volatile boolean field_b;
    volatile boolean field_a;
    tg field_c;
    volatile tj[] field_d;
    static int field_e;
    private static String field_z;

    public final void run() {
        int var1_int = 0;
        Exception var1 = null;
        RuntimeException var1_ref = null;
        tj var2 = null;
        Throwable var3 = null;
        int var4 = 0;
        Object var5 = null;
        Object var6 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = BrickABrac.field_J ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        ((aq) this).field_b = true;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (((aq) this).field_a) {
                            statePc = 10;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = (stateCaught_2 instanceof Exception ? 11 : 13);
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var1_int = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = (stateCaught_3 instanceof Exception ? 11 : 13);
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var1_int >= 2) {
                            statePc = 9;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = (stateCaught_4 instanceof Exception ? 11 : 13);
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var2 = ((aq) this).field_d[var1_int];
                        if (var2 != null) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = (stateCaught_5 instanceof Exception ? 11 : 13);
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = (stateCaught_6 instanceof Exception ? 11 : 13);
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var2.c();
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = (stateCaught_7 instanceof Exception ? 11 : 13);
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var1_int++;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = (stateCaught_8 instanceof Exception ? 11 : 13);
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        wj.a(-128, 10L);
                        var5 = null;
                        kq.a(-4317, ((aq) this).field_c, (Object) null);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = (stateCaught_9 instanceof Exception ? 11 : 13);
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        ((aq) this).field_b = false;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var1 = (Exception) (Object) caughtException;
                        var6 = null;
                        rk.a((String) null, (Throwable) (Object) var1, 96);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        ((aq) this).field_b = false;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var3 = caughtException;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        ((aq) this).field_b = false;
                        throw (RuntimeException) (Object) var3;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 16: {
                    var1_ref = (RuntimeException) (Object) caughtException;
                    throw qb.a((Throwable) (Object) var1_ref, field_z);
                }
                case 17: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    aq() {
        ((aq) this).field_d = new tj[2];
        ((aq) this).field_a = false;
        ((aq) this).field_b = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "aq.run()";
        field_e = 98;
    }
}
