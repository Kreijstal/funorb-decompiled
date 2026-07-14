/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dj {
    static uc field_a;
    static int[] field_b;
    static String field_c;

    final static boolean a(pf param0, byte param1) {
        if (param1 > -109) {
            return false;
        }
        return param0.c((byte) -111);
    }

    public static void a(int param0) {
        if (param0 != 4) {
            return;
        }
        field_b = null;
        field_a = null;
        field_c = null;
    }

    final static void a(boolean param0, java.applet.Applet param1, String param2) {
        try {
            String var7 = null;
            String var5 = null;
            String var4 = null;
            String var8 = null;
            l.field_g = param2;
            try {
                var7 = param1.getParameter("cookieprefix");
                var5 = var7;
                var5 = var7;
                var4 = param1.getParameter("cookiehost");
                var5 = var4;
                var5 = var4;
                if (param0) {
                    Object var6 = null;
                    dj.a(true, (java.applet.Applet) null, (String) null);
                }
                var8 = var7 + "settings=" + param2 + "; version=1; path=/; domain=" + var4;
                var5 = var8;
                var5 = var8;
                if (param2.length() == 0) {
                    var5 = var8 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                } else {
                    var5 = var8 + "; Expires=" + od.a(10, 94608000000L + ih.a((byte) -98)) + "; Max-Age=" + 94608000L;
                }
                sh.a(-13847, "document.cookie=\"" + var5 + "\"", param1);
            } catch (Throwable throwable) {
            }
            rl.a(param1, (byte) 15);
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
        field_b = new int[4];
        field_a = new uc();
        field_c = "Continue";
    }
}
