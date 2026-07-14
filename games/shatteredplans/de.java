/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class de extends oh {
    String field_l;
    static String field_k;
    static int field_j;
    static String field_h;
    static int field_i;

    public static void a(byte param0) {
        field_h = null;
        field_k = null;
        if (param0 != 102) {
            Object var2 = null;
            de.a(62, (java.applet.Applet) null);
        }
    }

    de(String param0) {
        ((de) this).field_l = param0;
    }

    final static void a(int param0, java.applet.Applet param1) {
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
                            var2 = new java.net.URL(param1.getCodeBase(), "tosupport.ws");
                            param1.getAppletContext().showDocument(jg.a(param1, false, var2), "_top");
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
                        if (param0 <= 107) {
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
                        de.a(-3, (java.applet.Applet) null);
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
        field_i = 250;
        field_k = "Animations speed is double. Click to halve.";
    }
}
