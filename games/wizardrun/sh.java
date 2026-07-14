/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sh {
    static o field_b;
    static String field_a;
    static String field_d;
    static int field_c;

    public static void a(byte param0) {
        field_d = null;
        field_a = null;
        if (param0 > -124) {
            field_c = 25;
            field_b = null;
            return;
        }
        field_b = null;
    }

    final static void a(boolean param0, int param1, String param2, java.applet.Applet param3) {
        try {
            if (vh.field_k.startsWith("win")) {
                if (tj.a(99, param2)) {
                    return;
                }
            }
            int var4 = 116 / ((63 - param1) / 56);
            try {
                param3.getAppletContext().showDocument(new java.net.URL(param2), "_blank");
            } catch (java.net.MalformedURLException malformedURLException) {
                rg.a((Throwable) null, "MGR1: " + param2, -562);
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
        field_d = "Connection restored.";
        field_a = "Warning: if you quit, you will lose any game you are in the middle of!";
        field_c = 0;
    }
}
