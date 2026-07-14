/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class qg {
    static int field_c;
    static boolean field_d;
    static int field_f;
    int field_b;
    static int[] field_a;
    static String field_h;
    String field_e;
    static String[] field_g;

    final static void a(java.applet.Applet param0, byte param1) {
        int var2 = 94 % ((param1 - 9) / 62);
        pl.a("", (byte) 71, param0);
        fo.a(38205, param0);
    }

    abstract java.net.Socket a(boolean param0) throws IOException;

    public static void a(int param0) {
        field_g = null;
        field_a = null;
        field_h = null;
        if (param0 != 26161) {
            field_g = null;
        }
    }

    final static void a(int param0, java.applet.Applet param1, String param2) {
        try {
            String var6 = null;
            String var5 = null;
            String var4 = null;
            String var7 = null;
            nj.field_X = param2;
            if (param0 != 165) {
                return;
            }
            try {
                var6 = param1.getParameter("cookieprefix");
                var5 = var6;
                var5 = var6;
                var4 = param1.getParameter("cookiehost");
                var5 = var4;
                var5 = var4;
                var7 = var6 + "settings=" + param2 + "; version=1; path=/; domain=" + var4;
                var5 = var7;
                var5 = var7;
                if (param2.length() != 0) {
                    var5 = var7 + "; Expires=" + jb.a(param0 ^ 2147483482, 94608000000L + pd.a(-22826)) + "; Max-Age=" + 94608000L;
                } else {
                    var5 = var7 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                }
                qe.a("document.cookie=\"" + var5 + "\"", param1, (byte) 63);
            } catch (Throwable throwable) {
            }
            hl.a(param1, 1);
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final java.net.Socket b(int param0) throws IOException {
        if (param0 != 16076) {
            return null;
        }
        return new java.net.Socket(((qg) this).field_e, ((qg) this).field_b);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 0;
        field_g = new String[]{"Gah. They're not going to be enough. You'll need to do better next time!", "These humans are dwindling too fast! You won't be able to finish the level.", "No, this just won't do. Not enough humans left!"};
        field_d = false;
        field_h = "Achievements";
        field_a = new int[]{165, 400, 370, 463};
    }
}
