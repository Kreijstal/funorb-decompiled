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
        if (param0 != 0) {
          field_b = (aj) null;
          field_e = null;
          field_a = (int[][]) null;
          field_d = null;
          field_b = null;
          field_c = null;
          return;
        } else {
          field_e = null;
          field_a = (int[][]) null;
          field_d = null;
          field_b = null;
          field_c = null;
          return;
        }
    }

    final static boolean a(byte param0) {
        if (param0 != -5) {
            return false;
        }
        return sb.field_a;
    }

    final static void a(String param0, java.applet.Applet param1, int param2) {
        try {
            String var7 = null;
            String var4 = null;
            String var8 = null;
            String var5 = null;
            try {
                so.field_g = param0;
                var7 = param1.getParameter("cookieprefix");
                var4 = param1.getParameter("cookiehost");
                var8 = var7 + "session=" + param0 + "; version=1; path=/; domain=" + var4;
                var5 = var8;
                if (!(param0.length() != 0)) {
                    var5 = var8 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                }
                ei.a("document.cookie=\"" + var5 + "\"", param1, 269);
                if (param2 != 13680) {
                    java.applet.Applet var6 = (java.applet.Applet) null;
                    um.a((String) null, (java.applet.Applet) null, -110);
                }
                ml.a(-104, param1);
            } catch (RuntimeException runtimeException) {
                throw aa.a((Throwable) ((Object) runtimeException), "um.B(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_e = "ESC - cancel this line";
        field_d = "Friends";
        field_c = "<%0> would need a rating of <%1> to play with the current options.";
        field_b = new aj(10, 2, 2, 0);
    }
}
