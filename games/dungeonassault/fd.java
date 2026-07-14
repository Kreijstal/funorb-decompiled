/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fd {
    static String[] field_b;
    static String field_a;
    int field_c;

    final static gj b(byte param0) {
        if (param0 != 108) {
            return null;
        }
        return (gj) (Object) new fg();
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (ib.field_f != null) {
                        statePc = 4;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    if (param0 >= 24) {
                        statePc = 3;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    field_a = null;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    return;
                }
                case 4: {
                    var1 = (Object) (Object) ib.field_f;
                    // monitorenter ib.field_f
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        ib.field_f = null;
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
                    if (param0 >= 24) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    field_a = null;
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

    public static void a(byte param0) {
        field_b = null;
        if (param0 < 18) {
            fd.a(-49);
            field_a = null;
            return;
        }
        field_a = null;
    }

    fd(int param0) {
        ((fd) this).field_c = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "How will you style yourself?";
    }
}
