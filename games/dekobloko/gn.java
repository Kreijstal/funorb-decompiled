/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gn {
    static String field_d;
    static int field_a;
    static boolean field_b;
    static int[] field_e;
    static String[][] field_c;
    static volatile long field_f;

    public static void a(int param0) {
        field_e = null;
        if (param0 != 0) {
            return;
        }
        field_c = null;
        field_d = null;
    }

    final static java.net.URL a(java.net.URL param0, int param1, java.applet.Applet param2) {
        Object var3 = null;
        String var3_ref = null;
        String var4 = null;
        var3 = null;
        if (param1 == -1) {
          L0: {
            if (null == rb.field_l) {
              break L0;
            } else {
              if (rb.field_l.equals((Object) (Object) param2.getParameter("settings"))) {
                break L0;
              } else {
                var3_ref = rb.field_l;
                var4 = var3_ref;
                var4 = var3_ref;
                break L0;
              }
            }
          }
          var4 = null;
          if (u.field_a != null) {
            if (u.field_a.equals((Object) (Object) param2.getParameter("session"))) {
              return pl.a(var4, var3_ref, false, param0, -1);
            } else {
              var4 = u.field_a;
              return pl.a(var4, var3_ref, false, param0, -1);
            }
          } else {
            return pl.a(var4, var3_ref, false, param0, -1);
          }
        } else {
          return null;
        }
    }

    final static void b(int param0) {
        if (param0 != -29550) {
            return;
        }
        ef.f((byte) 53);
        uf.k(-4840);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Stamina Mode";
        field_f = 0L;
    }
}
