/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sh {
    static e field_b;
    static String field_a;
    static String field_c;

    public static void a(int param0) {
        field_c = null;
        field_b = null;
        if (param0 != 11) {
            return;
        }
        field_a = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(byte param0, java.applet.Applet param1, String param2) {
        try {
            Exception exception = null;
            java.net.URL var3 = null;
            Throwable decompiledCaughtException = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        try {
                            var3 = new java.net.URL(param1.getCodeBase(), param2);
                            var3 = ah.a(var3, param1, (byte) 73);
                            ba.a(-7235, var3.toString(), true, param1);
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_0) {
                            caughtException = stateCaught_0;
                            statePc = 2;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        exception = (Exception) (Object) caughtException;
                        exception.printStackTrace();
                        statePc = 3;
                        continue stateLoop;
                    }
                    case 3: {
                        if (param0 >= -27) {
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
                        field_a = null;
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
        field_a = "Player Name: ";
        field_c = "<%0> retry attempts remaining";
        field_b = new e(11, 0, 1, 2);
    }
}
