/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kk {
    static boolean field_c;
    static int field_d;
    static String[] field_a;
    static volatile boolean field_b;
    static int field_e;

    final static java.net.URL a(int param0, java.net.URL param1, java.applet.Applet param2) {
        String var3 = null;
        String var4 = null;
        Object var5 = null;
        var3 = null;
        if (param0 >= 80) {
          L0: {
            if (td.field_i == null) {
              break L0;
            } else {
              if (td.field_i.equals((Object) (Object) param2.getParameter("settings"))) {
                break L0;
              } else {
                var3 = td.field_i;
                var4 = var3;
                var4 = var3;
                break L0;
              }
            }
          }
          var4 = null;
          if (bf.field_i != null) {
            if (bf.field_i.equals((Object) (Object) param2.getParameter("session"))) {
              return wg.a(var3, -7362, var4, -1, param1);
            } else {
              var4 = bf.field_i;
              return wg.a(var3, -7362, var4, -1, param1);
            }
          } else {
            return wg.a(var3, -7362, var4, -1, param1);
          }
        } else {
          L1: {
            var5 = null;
            java.net.URL discarded$1 = kk.a(-39, (java.net.URL) null, (java.applet.Applet) null);
            if (td.field_i == null) {
              break L1;
            } else {
              if (td.field_i.equals((Object) (Object) param2.getParameter("settings"))) {
                break L1;
              } else {
                var3 = td.field_i;
                break L1;
              }
            }
          }
          var4 = null;
          if (bf.field_i == null) {
            return wg.a(var3, -7362, var4, -1, param1);
          } else {
            L2: {
              if (!bf.field_i.equals((Object) (Object) param2.getParameter("session"))) {
                var4 = bf.field_i;
                var3 = var4;
                var4 = var3;
                var3 = var4;
                break L2;
              } else {
                break L2;
              }
            }
            return wg.a(var3, -7362, var4, -1, param1);
          }
        }
    }

    public static void a(int param0) {
        if (param0 != -1) {
            kk.a(-33);
            field_a = null;
            return;
        }
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new String[]{"Gain 10,000 points", "Gain 20,000 points", "Gain 30,000 points", "Gain 40,000 points", "Gain 50,000 points", "Destroy 10% of the asteroid cluster", "Destroy 30% of the asteroid cluster", "Destroy 60% of the asteroid cluster", "Destroy 100% of the asteroid cluster", "Get a x10 combo", "Get a x10 combo on four levels", "Get a x10 combo on every level", "Get a x25 combo", "Get a x25 combo on four levels", "Get a x25 combo on every level", "Get a x50 combo"};
        field_e = 0;
        field_d = 0;
        field_b = true;
    }
}
