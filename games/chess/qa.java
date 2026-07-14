/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qa {
    static int field_e;
    static String field_a;
    static String field_d;
    static String field_b;
    static String field_g;
    static um field_c;
    static id field_f;

    final static void a(byte param0, String param1, java.applet.Applet param2) {
        try {
            qn.field_R = param1;
            String var3 = param2.getParameter("cookieprefix");
            String var5 = var3;
            var5 = var3;
            String var4 = param2.getParameter("cookiehost");
            var5 = var4;
            var5 = var4;
            var5 = var3 + "session=" + param1 + "; version=1; path=/; domain=" + var4;
            if (param0 <= 10) {
                return;
            }
            try {
                if (param1.length() == 0) {
                    var5 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                }
                u.a((byte) -81, "document.cookie=\"" + var5 + "\"", param2);
            } catch (Throwable throwable) {
            }
            od.a(false, param2);
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_g = null;
        field_d = null;
        field_f = null;
        field_c = null;
        if (param0 != -1) {
          field_a = null;
          field_b = null;
          field_a = null;
          return;
        } else {
          field_b = null;
          field_a = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Enter multiplayer lobby";
        field_g = "Withdraw request to join <%0>'s game";
        field_b = "Music: ";
        field_d = "Accept rematch";
    }
}
