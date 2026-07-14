/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class g {
    byte[] field_i;
    int field_g;
    int field_h;
    static int field_l;
    static String field_e;
    static int field_a;
    byte[] field_j;
    int field_b;
    static kg field_k;
    int field_d;
    int field_f;
    int field_c;
    int field_m;

    public static void a(int param0) {
        field_e = null;
        field_k = null;
        if (param0 != -6960) {
            Object var2 = null;
            jg discarded$0 = g.a(107, 48, (dl) null, 12, (byte) 17, 41);
        }
    }

    final static jg a(int param0, int param1, dl param2, int param3, byte param4, int param5) {
        java.awt.Frame var6 = null;
        jg var7 = null;
        Object var8 = null;
        java.awt.Frame var9 = null;
        var9 = ii.a(true, param5, param2, param0, param1, param3);
        var6 = var9;
        if (var9 != null) {
          var7 = new jg();
          var7.field_c = var9;
          java.awt.Component discarded$8 = var7.field_c.add((java.awt.Component) (Object) var7);
          var7.setBounds(0, 0, param3, param0);
          if (param4 != -81) {
            var8 = null;
            g.a((java.applet.Applet) null, (String) null, -30);
            var7.addFocusListener((java.awt.event.FocusListener) (Object) var7);
            var7.requestFocus();
            return var7;
          } else {
            var7.addFocusListener((java.awt.event.FocusListener) (Object) var7);
            var7.requestFocus();
            return var7;
          }
        } else {
          return null;
        }
    }

    final static void a(java.applet.Applet param0, String param1, int param2) {
        try {
            String var4 = null;
            String var5 = null;
            bf.field_i = param1;
            String var3 = param0.getParameter("cookieprefix");
            if (param2 != -3603) {
                return;
            }
            try {
                var4 = param0.getParameter("cookiehost");
                var5 = var3 + "session=" + param1 + "; version=1; path=/; domain=" + var4;
                if (!(param1.length() != 0)) {
                    var5 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                }
                fd.a(57, param0, "document.cookie=\"" + var5 + "\"");
            } catch (Throwable throwable) {
            }
            la.a(param0, true);
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
        field_e = "Checking";
        field_k = new kg();
    }
}
