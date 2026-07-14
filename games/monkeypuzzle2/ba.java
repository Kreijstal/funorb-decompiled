/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ba {
    int field_i;
    static le[][] field_a;
    static String field_d;
    static String field_c;
    static r field_f;
    java.awt.Image field_b;
    int[] field_e;
    int field_g;
    static String field_h;

    final static boolean a(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var1 = (Object) (Object) wj.field_k;
                    // monitorenter wj.field_k
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (o.field_b == bh.field_e) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        // monitorexit var1
                        stackOut_3_0 = 0;
                        stackIn_4_0 = stackOut_3_0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 4: {
                    return stackIn_4_0 != 0;
                }
                case 5: {
                    try {
                        oa.field_H = oi.field_e[o.field_b];
                        rd.field_p = ia.field_d[o.field_b];
                        o.field_b = o.field_b - param0 & 127;
                        // monitorexit var1
                        stackOut_5_0 = 1;
                        stackIn_6_0 = stackOut_5_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 6: {
                    return stackIn_6_0 != 0;
                }
                case 7: {
                    try {
                        var2 = caughtException;
                        // monitorexit var1
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 8: {
                    throw (RuntimeException) (Object) var2;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    abstract void a(int param0, java.awt.Component param1, int param2, int param3);

    public static void a(boolean param0) {
        field_h = null;
        field_a = null;
        if (param0) {
            return;
        }
        field_f = null;
        field_d = null;
        field_c = null;
    }

    abstract void a(int param0, int param1, java.awt.Graphics param2, int param3);

    final void a(byte param0) {
        if (param0 < 106) {
          ((ba) this).field_e = null;
          ge.a(((ba) this).field_e, ((ba) this).field_g, ((ba) this).field_i);
          return;
        } else {
          ge.a(((ba) this).field_e, ((ba) this).field_g, ((ba) this).field_i);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Please check if address is correct";
        field_c = "Warning: if you quit, you will lose any game you are in the middle of!";
        field_a = new le[7][];
    }
}
