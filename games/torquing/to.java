/*
 * Decompiled by CFR-JS 0.4.0.
 */
class to extends ta {
    static ei field_s;
    static String field_r;
    static ei field_q;

    final static void a(java.applet.Applet param0, int param1) {
        try {
            java.net.URL var2 = null;
            try {
                if (param1 > -17) {
                    to.a(82);
                }
                var2 = new java.net.URL(param0.getCodeBase(), "quit.ws");
                param0.getAppletContext().showDocument(og.a(var2, param0, (byte) -95), "_top");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_r = null;
        field_q = null;
        field_s = null;
        if (param0 != 29830) {
            Object var2 = null;
            to.a((java.applet.Applet) null, -15);
        }
    }

    to() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = new ei();
        field_r = "Squared Away";
        field_q = new ei();
    }
}
