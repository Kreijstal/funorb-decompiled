/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dh extends pp {
    static String field_i;

    public static void d(byte param0) {
        if (param0 >= -39) {
            field_i = null;
            field_i = null;
            return;
        }
        field_i = null;
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        try {
                            var2 = new java.net.URL(param0.getCodeBase(), "quit.ws");
                            param0.getAppletContext().showDocument(ow.a(var2, (byte) -123, param0), "_top");
                            if (param1 > 43) {
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
                            field_i = null;
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

    public dh() {
    }

    final static void a(byte param0, int param1) {
        ala.a(param0 + 26161, wba.field_e[param1]);
        if (param0 != 58) {
            dh.a((byte) 17, -16);
        }
    }

    final void a(aga param0, op param1, int param2) {
        param1.field_R = true;
        if (param2 != 12) {
            field_i = null;
        }
    }

    final void a(lu param0, byte param1) {
        int var3 = -1 % ((34 - param1) / 58);
        this.a(param0, (byte) -77);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Return to lobby";
    }
}
