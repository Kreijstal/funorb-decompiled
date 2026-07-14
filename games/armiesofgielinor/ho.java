/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ho {
    int field_c;
    static String field_d;
    static je field_a;
    int field_b;

    final static void a(int param0) {
        int var1 = 20 % ((param0 - -6) / 45);
        ud.field_X = null;
        kr.field_C.a(123);
    }

    public final String toString() {
        return "(turnsTaken: " + ((ho) this).field_b + " damageTaken: " + ((ho) this).field_c + ")";
    }

    final static void a(java.applet.Applet param0, byte param1) {
        try {
            Exception exception = null;
            java.net.URL var2 = null;
            Object var3 = null;
            Throwable decompiledCaughtException = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        try {
                            var2 = new java.net.URL(param0.getCodeBase(), "quit.ws");
                            param0.getAppletContext().showDocument(ck.a(-3780, var2, param0), "_top");
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
                        if (param1 != -3) {
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
                        var3 = null;
                        ho.a((java.applet.Applet) null, (byte) -10);
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

    public static void a(byte param0) {
        if (param0 >= -113) {
            ho.a(3);
            field_d = null;
            field_a = null;
            return;
        }
        field_d = null;
        field_a = null;
    }

    ho(int param0, int param1) {
        ((ho) this).field_b = param0;
        ((ho) this).field_c = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Ask to join <%0>'s game";
    }
}
