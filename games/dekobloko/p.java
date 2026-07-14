/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class p {
    static String field_c;
    static w field_b;
    static String field_d;
    static long field_a;

    public static void a(int param0) {
        if (param0 < 104) {
          field_b = null;
          field_b = null;
          field_d = null;
          field_c = null;
          return;
        } else {
          field_b = null;
          field_d = null;
          field_c = null;
          return;
        }
    }

    final static void a(int param0, byte param1) {
        try {
            Throwable throwable = null;
            Throwable decompiledCaughtException = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        try {
                            Object discarded$3 = nc.a("resizing", param1 + -14511, se.h(param1 ^ -25126), new Object[1]);
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_0) {
                            caughtException = stateCaught_0;
                            statePc = 2;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        throwable = caughtException;
                        statePc = 3;
                        continue stateLoop;
                    }
                    case 3: {
                        if (param1 != -30) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        return;
                    }
                    case 5: {
                        p.a(72, (byte) -105);
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
        field_c = "Create unrated game";
        field_d = "Position";
    }
}
