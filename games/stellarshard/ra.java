/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ra {
    static String field_a;

    final static void a(int param0) {
        Object var1_ref_Object = null;
        int var1 = 0;
        Throwable var2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (null == sf.field_c) {
                        statePc = 6;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    var1_ref_Object = (Object) (Object) sf.field_c;
                    // monitorenter sf.field_c
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    try {
                        sf.field_c = null;
                        // monitorexit var1_ref_Object
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 3: {
                    var1 = 36 / ((68 - param0) / 48);
                    return;
                }
                case 4: {
                    try {
                        var2 = caughtException;
                        // monitorexit var1_ref_Object
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 5: {
                    throw (RuntimeException) (Object) var2;
                }
                case 6: {
                    var1 = 36 / ((68 - param0) / 48);
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void b(int param0) {
        field_a = null;
        if (param0 != -14755) {
            field_a = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Play free version";
    }
}
