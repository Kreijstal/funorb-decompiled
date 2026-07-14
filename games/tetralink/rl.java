/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rl {
    static String field_e;
    static String field_g;
    static int[] field_c;
    static int field_d;
    static int field_a;
    static oh[][] field_b;
    static fg field_f;

    final static void b(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (param0 == -9648) {
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
                    if (vi.field_a != null) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    return;
                }
                case 4: {
                    var1 = (Object) (Object) vi.field_a;
                    // monitorenter vi.field_a
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        vi.field_a = null;
                        // monitorexit var1
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 6: {
                    return;
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

    public static void a(int param0) {
        field_e = null;
        field_b = null;
        field_g = null;
        field_f = null;
        field_c = null;
        if (param0 != 14236) {
            rl.b(109);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Game";
        field_g = "Loading music";
    }
}
