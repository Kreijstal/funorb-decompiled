/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class be extends li {
    boolean field_p;
    static int field_t;
    static fe field_n;
    int field_r;
    static boolean field_q;
    static String field_s;
    int[] field_o;

    final static void a(int param0, er[] param1, int param2, int param3, int param4, int param5, int param6, int param7, er[] param8, int param9, er[] param10, int param11, cc param12) {
        int var15_int = 0;
        int var16 = 0;
        try {
            var15_int = param12.field_t - -param12.field_M;
            var16 = param12.field_t;
            int var17 = 53;
            int discarded$0 = 320;
            c.a(8, var16, var15_int, 20, param1, 8, param12, 16766751, 280, 10, param8, 16777215, 5, param10, param12, var16, 20412, 16777215, var15_int);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "be.D(" + -103 + ',' + (param1 != null ? "{...}" : "null") + ',' + 320 + ',' + 20 + ',' + 16766751 + ',' + 10 + ',' + 5 + ',' + 16777215 + ',' + (param8 != null ? "{...}" : "null") + ',' + 8 + ',' + (param10 != null ? "{...}" : "null") + ',' + 8 + ',' + (param12 != null ? "{...}" : "null") + ',' + 280 + ',' + 16777215 + ')');
        }
    }

    final static int a(int param0, byte param1) {
        return mj.a(-109, in.field_b, param0);
    }

    public static void a() {
        field_n = null;
        field_s = null;
    }

    be() {
    }

    final static void a(String param0, int param1, java.applet.Applet param2) {
        try {
            String var6 = null;
            String var5 = null;
            String var4 = null;
            String var7 = null;
            try {
                v.field_b = param0;
                try {
                    var6 = param2.getParameter("cookieprefix");
                    var5 = var6;
                    var5 = var6;
                    var4 = param2.getParameter("cookiehost");
                    var5 = var4;
                    var5 = var4;
                    var7 = var6 + "settings=" + param0 + "; version=1; path=/; domain=" + var4;
                    var5 = var7;
                    var5 = var7;
                    if (param0.length() == 0) {
                        var5 = var7 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                    } else {
                        var5 = var7 + "; Expires=" + uh.a((byte) -66, 94608000000L + gk.a(53)) + "; Max-Age=" + 94608000L;
                    }
                    int discarded$0 = 124;
                    je.a(param2, "document.cookie=\"" + var5 + "\"");
                } catch (Throwable throwable) {
                }
                op.a(0, param2);
            } catch (RuntimeException runtimeException) {
                throw wn.a((Throwable) (Object) runtimeException, "be.B(" + (param0 != null ? "{...}" : "null") + ',' + -1 + ',' + (param2 != null ? "{...}" : "null") + ')');
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
        field_s = "Hide players in <%0>'s game";
    }
}
