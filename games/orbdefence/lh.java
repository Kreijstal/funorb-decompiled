/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lh {
    static String field_a;
    static be field_b;
    static int field_c;
    static int field_d;

    public static void a(int param0) {
        field_b = null;
        if (param0 != -21248) {
            field_b = null;
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static void a(java.applet.Applet param0, String param1, boolean param2) {
        try {
            String var3 = null;
            String var4 = null;
            String var5 = null;
            pc.field_ab = param1;
            if (param2) {
                return;
            }
            try {
                var3 = param0.getParameter("cookieprefix");
                var4 = param0.getParameter("cookiehost");
                var5 = var3 + "session=" + param1 + "; version=1; path=/; domain=" + var4;
                if (!(param1.length() != 0)) {
                    var5 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                }
                gm.a((byte) -17, "document.cookie=\"" + var5 + "\"", param0);
            } catch (Throwable throwable) {
            }
            g.a(1, param0);
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
        field_c = -1;
        field_a = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
        field_d = 480;
    }
}
