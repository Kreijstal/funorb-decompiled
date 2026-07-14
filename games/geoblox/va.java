/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class va {
    static int field_b;
    static ck field_f;
    static boolean field_d;
    static al field_e;
    static int field_a;
    static tf field_c;

    public static void a(int param0) {
        field_f = null;
        if (param0 != 0) {
            return;
        }
        field_e = null;
        field_c = null;
    }

    final static void a(String param0, java.applet.Applet param1, int param2) {
        try {
            String var3 = null;
            String var4 = null;
            String var5 = null;
            me.field_j = param0;
            try {
                var3 = param1.getParameter("cookieprefix");
                var4 = param1.getParameter("cookiehost");
                var5 = var3 + "session=" + param0 + "; version=1; path=/; domain=" + var4;
                if (!((param0.length() ^ -1) != param2)) {
                    var5 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                }
                wk.a(param1, "document.cookie=\"" + var5 + "\"", (byte) -92);
            } catch (Throwable throwable) {
            }
            oj.a(param1, 20000000);
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static dm[] a(int param0, byte param1) {
        if (param1 != -112) {
            field_e = null;
        }
        dm[] var3 = new dm[9];
        dm[] var2 = var3;
        var3[4] = ef.a(0, param0, 64);
        return var2;
    }

    final static void a(int param0, byte[] param1, int param2, int[] param3, byte param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = Geoblox.field_C;
        for (var5 = 0; var5 < ch.field_d.length; var5++) {
            param2 = ch.field_d[var5];
            var6 = var5 << -1588670812;
            while (true) {
                param2--;
                if (0 == param2) {
                    break;
                }
                var6++;
                param0 = pj.field_i[var6];
                param3[param1[param0]] = param3[param1[param0]] + 1;
                pj.field_i[param3[param1[param0]]] = param0;
            }
        }
        if (param4 != -85) {
            dm[] discarded$0 = va.a(80, (byte) 55);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = false;
        field_f = new ck(14, 0, 4, 1);
        field_e = new al();
    }
}
