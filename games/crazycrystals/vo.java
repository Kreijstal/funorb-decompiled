/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vo {
    static String field_b;
    static String field_a;

    public static void a(boolean param0) {
        field_b = null;
        if (!param0) {
            return;
        }
        field_a = null;
    }

    final static void a(int param0, String param1, java.applet.Applet param2) {
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
                            var3 = new java.net.URL(param2.getCodeBase(), param1);
                            var3 = gh.a(param2, var3, (byte) 67);
                            ec.a(true, var3.toString(), param2, (byte) -17);
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
                        if (param0 != 31251) {
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
                        field_b = null;
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
        field_b = "Checking";
        field_a = "to store your progress.";
    }
}
