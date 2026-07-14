/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ji {
    static boolean field_c;
    static String field_d;
    static String field_e;
    static String field_a;
    static int field_b;

    public static void a(int param0) {
        field_a = null;
        field_d = null;
        if (param0 != 13377) {
            return;
        }
        field_e = null;
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        try {
                            var2 = new java.net.URL(param1.getCodeBase(), "tosupport.ws");
                            param1.getAppletContext().showDocument(gf.a(param1, true, var2), "_top");
                            if (param0 == 8355711) {
                                statePc = 4;
                            } else {
                                statePc = 1;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_0) {
                            caughtException = stateCaught_0;
                            statePc = 3;
                            continue stateLoop;
                        }
                    }
                    case 1: {
                        try {
                            field_c = true;
                            return;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 3;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        var2_ref = (Exception) (Object) caughtException;
                        var2_ref.printStackTrace();
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

    final static void b(int param0) {
        al.j(-1);
        int var1 = -108 / ((param0 - 38) / 61);
        ud.field_ab = true;
        ch.field_e = true;
        nb.field_a.h(-120);
        qj.a(pn.field_i, false, 127);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Show private chat from my friends and opponents";
        field_e = "OK";
        field_a = "Fullscreen mode";
        field_b = 0;
    }
}
