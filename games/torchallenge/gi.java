/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gi {
    static boolean field_c;
    static java.awt.Frame field_b;
    static int field_e;
    static rb field_a;
    static ka[] field_f;
    static ad field_d;

    final static java.applet.Applet b(int param0) {
        if (null != aj.field_g) {
            return aj.field_g;
        }
        if (param0 != 12476) {
            field_d = null;
            return (java.applet.Applet) (Object) mj.field_c;
        }
        return (java.applet.Applet) (Object) mj.field_c;
    }

    public static void a(int param0) {
        field_f = null;
        field_b = null;
        field_a = null;
        if (param0 != 10) {
            return;
        }
        field_d = null;
    }

    final static boolean a(byte param0, String param1) {
        if (param1 != null) {
          if (param1.length() >= nh.field_bb) {
            if (param1.length() > gb.field_b) {
              return true;
            } else {
              if (param0 <= 40) {
                java.applet.Applet discarded$2 = gi.b(-79);
                return false;
              } else {
                return false;
              }
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = false;
        field_e = 10;
    }
}
