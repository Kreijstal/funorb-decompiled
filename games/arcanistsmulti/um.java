/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class um {
    static String field_e;
    static String field_d;
    static aj field_b;
    static int[][] field_a;
    static String field_c;

    public static void a(int param0) {
        field_e = null;
        field_a = null;
        field_d = null;
        field_b = null;
        field_c = null;
    }

    final static boolean a(byte param0) {
        return sb.field_a;
    }

    final static void a(String param0, java.applet.Applet param1, int param2) {
        try {
            String var7 = null;
            String var5 = null;
            String var4 = null;
            String var8 = null;
            try {
                so.field_g = param0;
                var7 = param1.getParameter("cookieprefix");
                var5 = var7;
                var4 = param1.getParameter("cookiehost");
                var5 = var4;
                var8 = var7 + "session=" + param0 + "; version=1; path=/; domain=" + var4;
                var5 = var8;
                if (param0.length() != 0) {
                    var5 = var8;
                } else {
                    var5 = var8 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                }
                ei.a("document.cookie=\"" + var5 + "\"", param1, 269);
                if (param2 != 13680) {
                    Object var6 = null;
                    um.a((String) null, (java.applet.Applet) null, -110);
                }
                ml.a(-104, param1);
            } catch (RuntimeException runtimeException) {
                throw aa.a((Throwable) (Object) runtimeException, "um.B(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
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
        field_e = "ESC - cancel this line";
        field_d = "Friends";
        field_c = "<%0> would need a rating of <%1> to play with the current options.";
        field_b = new aj(10, 2, 2, 0);
    }
}
