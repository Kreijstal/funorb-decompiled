/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ub extends RuntimeException {
    String field_a;
    Throwable field_c;
    static tp[] field_d;
    static int[] field_b;

    final static int a(int param0) {
        if (param0 != 255) {
            return -99;
        }
        return ri.field_a - bf.field_c;
    }

    public static void a(boolean param0) {
        field_b = null;
        field_d = null;
        if (!param0) {
            field_b = null;
        }
    }

    ub(Throwable param0, String param1) {
        ((ub) this).field_a = param1;
        ((ub) this).field_c = param0;
    }

    final static void b(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (tm.field_b != null) {
                        statePc = 4;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    if (param0 == 0) {
                        statePc = 3;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    int discarded$5 = ub.a(-12);
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    return;
                }
                case 4: {
                    var1 = (Object) (Object) tm.field_b;
                    // monitorenter tm.field_b
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        tm.field_b = null;
                        // monitorexit var1
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 6: {
                    if (param0 == 0) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    int discarded$6 = ub.a(-12);
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    return;
                }
                case 9: {
                    try {
                        var2 = caughtException;
                        // monitorexit var1
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 10: {
                    throw (RuntimeException) (Object) var2;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_d = new tp[255];
        for (var0 = 0; field_d.length > var0; var0++) {
            field_d[var0] = new tp();
        }
    }
}
