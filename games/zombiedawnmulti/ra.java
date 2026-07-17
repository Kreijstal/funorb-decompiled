/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ra extends br {
    static ul field_l;
    int[] field_h;
    static String field_i;
    static int[] field_n;
    static w field_m;
    static String field_g;
    static oj field_f;
    static cj field_j;
    boolean field_k;
    static sk field_o;

    final static void a(java.awt.Canvas param0, int param1) {
        if (param1 > -82) {
            return;
        }
        try {
            if (11 == a.field_b) {
                fg.a(-29956);
            }
            c.a(eb.field_p, (byte) -100, lh.field_i, od.field_Bb);
            t.a(false, 0, param0, 0);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "ra.C(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final static void a(java.applet.Applet param0, int param1, String param2) {
        try {
            String var3 = null;
            String var5 = null;
            String var4 = null;
            try {
                un.field_p = param2;
                if (param1 > -29) {
                    field_o = null;
                }
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
                    fo.a(param0, 14575, "document.cookie=\"" + var5 + "\"");
                } catch (Throwable throwable) {
                }
                ak.a(14158, param0);
            } catch (RuntimeException runtimeException) {
                throw fa.a((Throwable) (Object) runtimeException, "ra.B(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void b(boolean param0) {
        field_g = null;
        field_f = null;
        field_n = null;
        field_m = null;
        field_l = null;
        field_o = null;
        field_i = null;
        field_j = null;
    }

    ra() {
        ((ra) this).field_k = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = new int[]{1, 2, 3, 5, 2, 5, 5, 5, 5, 5, 2, 3, 5, 1, 5, 5, 3};
        field_g = "<%0>/<%1>";
        field_i = "Quit";
    }
}
