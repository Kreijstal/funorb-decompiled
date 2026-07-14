/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class v {
    static Calendar field_a;

    final static void a(int param0, String param1, java.applet.Applet param2) {
        try {
            String var6 = null;
            String var5 = null;
            String var4 = null;
            String var7 = null;
            md.field_j = param1;
            try {
                var6 = param2.getParameter("cookieprefix");
                var5 = var6;
                var5 = var6;
                var4 = param2.getParameter("cookiehost");
                var5 = var4;
                var5 = var4;
                var7 = var6 + "settings=" + param1 + "; version=1; path=/; domain=" + var4;
                var5 = var7;
                var5 = var7;
                if (param0 != 0) {
                    v.a(28);
                }
                if (-1 == (param1.length() ^ -1)) {
                    var5 = var7 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                } else {
                    var5 = var7 + "; Expires=" + e.a(lk.a(0) + 94608000000L, (byte) -122) + "; Max-Age=" + 94608000L;
                }
                kj.a(-124, "document.cookie=\"" + var5 + "\"", param2);
            } catch (Throwable throwable) {
            }
            ok.a(param0 ^ 9507, param2);
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(byte[] param0, int param1, byte param2) {
        if (param2 != 40) {
            field_a = null;
            return sg.a(0, (byte) 93, param1, param0);
        }
        return sg.a(0, (byte) 93, param1, param0);
    }

    final static void a(byte param0, ci param1) {
        ti var2 = null;
        int var3 = 0;
        int var4 = 0;
        var2 = new ti(param1.a("", (byte) 91, "final_frame.jpg"), (java.awt.Component) (Object) gd.field_k);
        var3 = var2.field_n;
        var4 = var2.field_m;
        og.a((byte) 45);
        ch.field_c = new ti(var3, var4 * 3 / 4);
        ch.field_c.e();
        var2.f(0, 0);
        if (param0 < 86) {
          field_a = null;
          tb.field_e = new ti(var3, -ch.field_c.field_m + var4);
          tb.field_e.e();
          var2.f(0, -ch.field_c.field_m);
          tb.field_e.field_l = ch.field_c.field_m;
          fi.c(true);
          return;
        } else {
          tb.field_e = new ti(var3, -ch.field_c.field_m + var4);
          tb.field_e.e();
          var2.f(0, -ch.field_c.field_m);
          tb.field_e.field_l = ch.field_c.field_m;
          fi.c(true);
          return;
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 17320) {
            Object var2 = null;
            v.a(-107, (String) null, (java.applet.Applet) null);
        }
    }

    final static void a(byte param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            try {
                var2 = new java.net.URL(param1.getCodeBase(), "tosupport.ws");
                if (param0 != -67) {
                    Object var3 = null;
                    v.a((byte) -68, (java.applet.Applet) null);
                }
                param1.getAppletContext().showDocument(dh.a(param1, (byte) -95, var2), "_top");
            } catch (Exception exception) {
                exception.printStackTrace();
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
        field_a = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }
}
