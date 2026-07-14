/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uc {
    static String field_f;
    static Boolean field_b;
    static int field_d;
    static int field_a;
    static le field_g;
    static ci field_c;
    static int[] field_e;

    final static ci b(int param0) {
        if (param0 != -17260) {
            return null;
        }
        return ib.field_c.field_Kb;
    }

    public static void a(int param0) {
        field_c = null;
        int var1 = -95 % ((-52 - param0) / 46);
        field_e = null;
        field_g = null;
        field_b = null;
        field_f = null;
    }

    final static void a(byte param0) {
        Object var1 = null;
        Throwable var2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (param0 <= -33) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    field_g = null;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (bj.field_cb == null) {
                        statePc = 8;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    var1 = (Object) (Object) bj.field_cb;
                    // monitorenter bj.field_cb
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    try {
                        bj.field_cb = null;
                        // monitorexit var1
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 5: {
                    return;
                }
                case 6: {
                    try {
                        var2 = caughtException;
                        // monitorexit var1
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 7: {
                    throw (RuntimeException) (Object) var2;
                }
                case 8: {
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
        field_d = 24;
        field_f = "Similar rating";
        field_a = 2;
        field_e = new int[8192];
    }
}
