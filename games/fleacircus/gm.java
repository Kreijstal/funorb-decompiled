/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gm extends hl {
    int field_mb;
    static int[][] field_kb;
    String field_jb;
    static String field_ib;
    String field_lb;
    static int field_ob;
    static int field_nb;

    final static void e(byte param0) {
        int var1 = 0;
        Object var2 = null;
        Throwable var3 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var1 = 61 % ((7 - param0) / 35);
                    if (sg.field_i != null) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return;
                }
                case 2: {
                    var2 = (Object) (Object) sg.field_i;
                    // monitorenter sg.field_i
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    try {
                        sg.field_i = null;
                        // monitorexit var2
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 4: {
                    return;
                }
                case 5: {
                    try {
                        var3 = caughtException;
                        // monitorexit var2
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 6: {
                    throw (RuntimeException) (Object) var3;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void c(boolean param0) {
        field_ib = null;
        if (param0) {
            return;
        }
        field_kb = null;
    }

    gm() {
        super(0L, (hl) null);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_ib = "<%0>Bridge:<%1> these collapse as the fleas run across so that only one flea gets over, and the others fall down behind.";
    }
}
