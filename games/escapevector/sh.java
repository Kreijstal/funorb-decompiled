/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class sh extends fl {
    int field_q;
    static String field_r;
    static String field_s;

    abstract boolean d(byte param0);

    abstract Object e(byte param0);

    public static void f(int param0) {
        field_s = null;
        field_r = null;
        if (param0 != 0) {
            Object var2 = null;
            java.net.URL discarded$0 = sh.a((byte) -113, (java.applet.Applet) null, (java.net.URL) null);
        }
    }

    final static ee a(byte param0, java.applet.Applet param1) {
        String var2 = null;
        ee[] var3 = null;
        int var4 = 0;
        ee var5 = null;
        int var6 = 0;
        var6 = EscapeVector.field_A;
        var2 = dc.a((byte) 90, "jagex-last-login-method", param1);
        if (param0 == -1) {
          if (var2 != null) {
            var3 = ma.a(false);
            var4 = 0;
            L0: while (true) {
              if (var3.length > var4) {
                var5 = var3[var4];
                if (!var5.a(var2, (byte) 119)) {
                  var4++;
                  continue L0;
                } else {
                  return var5;
                }
              } else {
                return qj.field_g;
              }
            }
          } else {
            return qj.field_g;
          }
        } else {
          return null;
        }
    }

    sh(int param0) {
        ((sh) this).field_q = param0;
    }

    final static java.net.URL a(byte param0, java.applet.Applet param1, java.net.URL param2) {
        String var3 = null;
        String var4 = null;
        var3 = null;
        var4 = null;
        if (param0 < 11) {
          return null;
        } else {
          L0: {
            if (null == oh.field_p) {
              break L0;
            } else {
              if (oh.field_p.equals((Object) (Object) param1.getParameter("settings"))) {
                break L0;
              } else {
                var3 = oh.field_p;
                var4 = var3;
                var4 = var3;
                break L0;
              }
            }
          }
          L1: {
            if (wi.field_i == null) {
              break L1;
            } else {
              if (wi.field_i.equals((Object) (Object) param1.getParameter("session"))) {
                break L1;
              } else {
                var4 = wi.field_i;
                break L1;
              }
            }
          }
          return vn.a(var4, -1, var3, param2, 1);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "Escape Vector Expansion";
        field_s = "Retry";
    }
}
