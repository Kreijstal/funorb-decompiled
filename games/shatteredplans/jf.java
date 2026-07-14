/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jf {
    static byte[][] field_c;
    static boolean[] field_e;
    static bi field_a;
    static qr field_b;
    static String[] field_d;

    final static void a(int param0, String param1, java.applet.Applet param2) {
        try {
            String var7 = null;
            String var5 = null;
            String var4 = null;
            String var8 = null;
            cj.field_u = param1;
            try {
                var7 = param2.getParameter("cookieprefix");
                var5 = var7;
                var5 = var7;
                var4 = param2.getParameter("cookiehost");
                var5 = var4;
                var5 = var4;
                if (param0 != -25602) {
                    Object var6 = null;
                    jf.a(-11, (String) null, (java.applet.Applet) null);
                }
                var8 = var7 + "settings=" + param1 + "; version=1; path=/; domain=" + var4;
                var5 = var8;
                var5 = var8;
                if (-1 != (param1.length() ^ -1)) {
                    var5 = var8 + "; Expires=" + vm.a(94608000000L + pr.a(param0 ^ -21444), param0 + 25612) + "; Max-Age=" + 94608000L;
                } else {
                    var5 = var8 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                }
                ll.a(param2, "document.cookie=\"" + var5 + "\"", (byte) 123);
            } catch (Throwable throwable) {
            }
            h.a(-1, param2);
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 != -23) {
          int discarded$2 = jf.a(96, 113, -78);
          field_b = null;
          field_c = null;
          field_d = null;
          field_e = null;
          return;
        } else {
          field_b = null;
          field_c = null;
          field_d = null;
          field_e = null;
          return;
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = 79 % ((param2 - 39) / 60);
        int var4 = -1 + param0 & param1 >> 1962518687;
        return (param1 - -(param1 >>> -37267937)) % param0 + var4;
    }

    final static void b(byte param0) {
        bh.field_j = false;
        if (param0 != -15) {
          field_c = null;
          hm.field_p = null;
          el.field_d = null;
          kp.field_o = null;
          kd.field_b = null;
          return;
        } else {
          hm.field_p = null;
          el.field_d = null;
          kp.field_o = null;
          kd.field_b = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new byte[50][];
        field_d = new String[3];
    }
}
