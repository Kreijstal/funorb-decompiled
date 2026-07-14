/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qm {
    static ql field_d;
    static String field_b;
    static int field_a;
    static String field_e;
    static String field_c;

    public static void a(byte param0) {
        field_b = null;
        field_d = null;
        field_c = null;
        if (param0 > -100) {
            field_b = null;
            field_e = null;
            return;
        }
        field_e = null;
    }

    final static void a(int param0, int param1) {
        try {
            int var2 = 0;
            Throwable var3 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var2 = 25 / ((42 - param0) / 40);
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            Object discarded$1 = ne.a(new Object[1], 78, uc.e((byte) -82), "resizing");
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 3;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        var3 = caughtException;
                        statePc = 4;
                        continue stateLoop;
                    }
                    case 4: {
                        return;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Send private Quick Chat to <%0>";
        field_e = "Loading extra data";
        field_c = "Accept unrated rematch";
    }
}
