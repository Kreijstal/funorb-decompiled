/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sda extends vg {
    static boolean[] field_f;
    int field_l;
    byte[] field_j;
    static String field_i;
    static String field_h;
    static String field_k;
    static ssa field_g;

    public static void a(int param0) {
        field_i = null;
        field_h = null;
        if (param0 != -1) {
          field_f = null;
          field_f = null;
          field_k = null;
          field_g = null;
          return;
        } else {
          field_f = null;
          field_k = null;
          field_g = null;
          return;
        }
    }

    private sda() throws Throwable {
        throw new Error();
    }

    final static java.net.URL a(java.applet.Applet param0, int param1, java.net.URL param2) {
        String var3 = null;
        String var4 = null;
        if (param1 == -1) {
          L0: {
            var3 = null;
            var4 = null;
            if (null == ts.field_g) {
              break L0;
            } else {
              if (!ts.field_g.equals((Object) (Object) param0.getParameter("settings"))) {
                var3 = ts.field_g;
                var4 = var3;
                var4 = var3;
                break L0;
              } else {
                if (aia.field_j == null) {
                  return us.a((byte) 66, param2, var4, -1, var3);
                } else {
                  L1: {
                    if (!aia.field_j.equals((Object) (Object) param0.getParameter("session"))) {
                      var4 = aia.field_j;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  return us.a((byte) 66, param2, var4, -1, var3);
                }
              }
            }
          }
          if (aia.field_j != null) {
            if (aia.field_j.equals((Object) (Object) param0.getParameter("session"))) {
              return us.a((byte) 66, param2, var4, -1, var3);
            } else {
              var4 = aia.field_j;
              return us.a((byte) 66, param2, var4, -1, var3);
            }
          } else {
            return us.a((byte) 66, param2, var4, -1, var3);
          }
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "Jamille";
        field_i = "Unrated game";
        field_h = "Loot Bags x2";
        field_g = null;
    }
}
