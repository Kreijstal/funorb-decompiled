/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fb {
    static byte[][] field_d;
    static java.applet.Applet field_c;
    static int field_e;
    static int field_a;
    static String field_b;

    final static void a(int param0) {
        Object var1 = null;
        int var2 = 0;
        Throwable var3 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var1 = (Object) (Object) ho.field_b;
                    // monitorenter ho.field_b
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        oj.field_g = oj.field_g + 1;
                        vu.field_f = mp.field_g;
                        ic.field_b = sj.field_a;
                        cf.field_g = qd.field_m;
                        uu.field_e = si.field_b;
                        si.field_b = false;
                        vj.field_d = me.field_b;
                        ln.field_c = kg.field_a;
                        lq.field_a = jd.field_e;
                        me.field_b = 0;
                        var2 = -26 / ((param0 - 11) / 61);
                        // monitorexit var1
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var3 = caughtException;
                        // monitorexit var1
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 4: {
                    throw (RuntimeException) (Object) var3;
                }
                case 5: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(byte param0) {
        field_b = null;
        int var1 = 5 % ((-54 - param0) / 58);
        field_d = (byte[][]) null;
        field_c = null;
    }

    final static int b(int param0) {
        if (param0 != 0) {
            int discarded$0 = fb.b(-21);
            return he.field_n;
        }
        return he.field_n;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new byte[50][];
        field_a = 0;
    }
}
