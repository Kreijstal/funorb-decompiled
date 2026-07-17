/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class d {
    static ko[] field_b;
    static int[] field_a;
    static dl[] field_c;

    final static void a(java.applet.Applet param0, byte param1, String param2) {
        try {
            String var3 = null;
            String var5 = null;
            String var4 = null;
            hm.field_c = param2;
            try {
                var3 = param0.getParameter("cookieprefix");
                var5 = var3;
                var5 = var3;
                var4 = param0.getParameter("cookiehost");
                var5 = var4;
                var5 = var4;
                var5 = var3 + "session=" + param2 + "; version=1; path=/; domain=" + var4;
                if (0 == param2.length()) {
                    var5 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                }
                hi.a("document.cookie=\"" + var5 + "\"", param0, (byte) 77);
            } catch (Throwable throwable) {
            }
            if (param1 <= 110) {
                return;
            }
            try {
                hk.a(1, param0);
            } catch (RuntimeException runtimeException) {
                throw dn.a((Throwable) (Object) runtimeException, "d.B(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(byte param0, boolean param1) {
        qe.field_g.a((byte) -80, 0, 0);
        int var2 = 51 % ((param0 - 10) / 47);
    }

    public static void a(int param0) {
        field_c = null;
        field_b = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new ko[7];
        field_a = new int[8192];
    }
}
