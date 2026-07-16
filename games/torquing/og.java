/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class og extends q {
    static eb field_k;
    static String field_m;
    int field_l;
    int field_j;

    final static void a(java.awt.Component param0, int param1) {
        param0.removeKeyListener((java.awt.event.KeyListener) (Object) ha.field_b);
        param0.removeFocusListener((java.awt.event.FocusListener) (Object) ha.field_b);
        hb.field_y = param1;
    }

    final static void a(int param0) {
        Object var2 = null;
        uj.a((String) null, -32082, "");
        int var1 = 51 / ((param0 - 47) / 32);
    }

    public static void a(byte param0) {
        field_m = null;
        field_k = null;
        if (param0 <= 124) {
            Object var2 = null;
            java.net.URL discarded$0 = og.a((java.net.URL) null, (java.applet.Applet) null, (byte) 62);
        }
    }

    final static java.net.URL a(java.net.URL param0, java.applet.Applet param1, byte param2) {
        Object var3 = null;
        Object var4 = null;
        var3 = null;
        if (param2 <= -65) {
          L0: {
            var4 = null;
            if (rd.field_t == null) {
              break L0;
            } else {
              if (rd.field_t.equals((Object) (Object) param1.getParameter("settings"))) {
                break L0;
              } else {
                var3 = (Object) (Object) rd.field_t;
                var4 = var3;
                var4 = var3;
                break L0;
              }
            }
          }
          if (null != jb.field_e) {
            if (jb.field_e.equals((Object) (Object) param1.getParameter("session"))) {
              return pg.a(-1, (String) var4, param0, 47, (String) var3);
            } else {
              var4 = (Object) (Object) jb.field_e;
              return pg.a(-1, (String) var4, param0, 47, (String) var3);
            }
          } else {
            return pg.a(-1, (String) var4, param0, 47, (String) var3);
          }
        } else {
          L1: {
            field_m = null;
            var4 = null;
            if (rd.field_t == null) {
              break L1;
            } else {
              if (rd.field_t.equals((Object) (Object) param1.getParameter("settings"))) {
                break L1;
              } else {
                var3 = (Object) (Object) rd.field_t;
                break L1;
              }
            }
          }
          if (null == jb.field_e) {
            return pg.a(-1, (String) var4, param0, 47, (String) var3);
          } else {
            L2: {
              if (!jb.field_e.equals((Object) (Object) param1.getParameter("session"))) {
                var4 = (Object) (Object) jb.field_e;
                break L2;
              } else {
                break L2;
              }
            }
            return pg.a(-1, (String) var4, param0, 47, (String) var3);
          }
        }
    }

    private og() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = new eb(64);
    }
}
