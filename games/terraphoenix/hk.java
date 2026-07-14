/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hk {
    int field_m;
    static bg[] field_d;
    int field_i;
    rk field_l;
    int field_k;
    static char[] field_a;
    int field_b;
    static String field_c;
    int field_e;
    int field_f;
    int field_j;
    int field_g;
    int field_h;

    public static void a(boolean param0) {
        Object var2 = null;
        field_d = null;
        if (!param0) {
          var2 = null;
          hk.a((java.awt.Canvas) null, (byte) 22);
          field_c = null;
          field_a = null;
          return;
        } else {
          field_c = null;
          field_a = null;
          return;
        }
    }

    final static void a(int param0, int param1, byte[] param2, int param3, int[] param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = Terraphoenix.field_V;
        var5 = 0;
        if (param1 < -9) {
          L0: while (true) {
            if (fc.field_e.length > var5) {
              param0 = fc.field_e[var5];
              var6 = var5 << 721535620;
              L1: while (true) {
                param0--;
                if (-1 == (param0 ^ -1)) {
                  var5++;
                  var5++;
                  continue L0;
                } else {
                  var6++;
                  param3 = qh.field_c[var6];
                  param4[param2[param3]] = param4[param2[param3]] + 1;
                  qh.field_c[param4[param2[param3]]] = param3;
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    final static void a(java.awt.Component param0, byte param1) {
        int var2 = 45 % ((14 - param1) / 43);
        param0.setFocusTraversalKeysEnabled(false);
        param0.addKeyListener((java.awt.event.KeyListener) (Object) th.field_g);
        param0.addFocusListener((java.awt.event.FocusListener) (Object) th.field_g);
    }

    final static void a(String param0, byte param1, java.applet.Applet param2) {
        try {
            String var7 = null;
            String var5 = null;
            String var4 = null;
            String var8 = null;
            va.field_g = param0;
            if (param1 != 3) {
                Object var6 = null;
                hk.a((java.awt.Component) null, (byte) 83);
            }
            try {
                var7 = param2.getParameter("cookieprefix");
                var5 = var7;
                var5 = var7;
                var4 = param2.getParameter("cookiehost");
                var5 = var4;
                var5 = var4;
                var8 = var7 + "settings=" + param0 + "; version=1; path=/; domain=" + var4;
                var5 = var8;
                var5 = var8;
                if (param0.length() == 0) {
                    var5 = var8 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                } else {
                    var5 = var8 + "; Expires=" + wc.a(94608000000L + ll.a(1000), -1) + "; Max-Age=" + 94608000L;
                }
                cd.a(param2, param1 ^ 13161, "document.cookie=\"" + var5 + "\"");
            } catch (Throwable throwable) {
            }
            dh.a(param2, true);
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(java.awt.Canvas param0, byte param1) {
        me.a((java.awt.Component) (Object) param0, (byte) 126);
        pd.a(-26, (java.awt.Component) (Object) param0);
        int var2 = 42 % ((param1 - 61) / 32);
        if (!(lk.field_d == null)) {
            lk.field_d.a((java.awt.Component) (Object) param0, (byte) -105);
        }
    }

    hk() {
        ((hk) this).field_m = 0;
        ((hk) this).field_i = 0;
        ((hk) this).field_b = 0;
        ((hk) this).field_e = 0;
        ((hk) this).field_h = 0;
        ((hk) this).field_k = 0;
        ((hk) this).field_j = 0;
        ((hk) this).field_f = 0;
        ((hk) this).field_g = 0;
        ((hk) this).field_l = new rk();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Stock: ";
        field_a = new char[]{(char)91, (char)93, (char)35};
    }
}
