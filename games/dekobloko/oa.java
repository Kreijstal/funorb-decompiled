/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oa {
    static String field_f;
    static int[] field_e;
    static String field_c;
    static int field_a;
    static String field_d;
    static ck[] field_b;

    final static void a(int param0) {
        if (param0 <= 125) {
            return;
        }
        sg.field_d = null;
        tc.field_Nb = null;
        hc.field_c = null;
        tm.field_a = null;
        fh.field_a = null;
        mb.field_d = null;
    }

    final static void a(java.applet.Applet param0, int param1, String param2) {
        try {
            String var3 = null;
            String var4 = null;
            String var5 = null;
            u.field_a = param2;
            try {
                var3 = param0.getParameter("cookieprefix");
                var4 = param0.getParameter("cookiehost");
                var5 = var3 + "session=" + param2 + "; version=1; path=/; domain=" + var4;
                if (!(param1 != (param2.length() ^ -1))) {
                    var5 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                }
                nc.a((byte) -51, param0, "document.cookie=\"" + var5 + "\"");
            } catch (Throwable throwable) {
            }
            me.a((byte) 121, param0);
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static String a(String param0, int param1) {
        int var4 = 0;
        int var5 = client.field_A ? 1 : 0;
        int var2 = param0.length();
        char[] var3 = new char[var2];
        for (var4 = 0; var4 < var2; var4++) {
            var3[-var4 + var2 + -1] = param0.charAt(var4);
        }
        if (param1 != -1) {
            field_f = null;
        }
        return new String(var3);
    }

    public static void b(int param0) {
        if (param0 != -1) {
            field_e = null;
        }
        field_f = null;
        field_e = null;
        field_b = null;
        field_d = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Enter multiplayer lobby";
        field_d = "You must play 1 more rated game before playing with the current options.";
    }
}
