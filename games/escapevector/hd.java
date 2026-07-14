/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hd extends java.awt.Canvas {
    static String field_a;
    private java.awt.Component field_b;
    static String field_e;
    static int[] field_d;
    static int field_c;

    public static void a(int param0) {
        int var1 = 26 / ((param0 - 55) / 60);
        field_a = null;
        field_e = null;
        field_d = null;
    }

    public final void update(java.awt.Graphics param0) {
        ((hd) this).field_b.update(param0);
    }

    final static boolean a(String param0, boolean param1, String param2) {
        if (!lb.b((byte) -35, param0)) {
          if (aa.a(1, param0)) {
            return false;
          } else {
            if (!ol.a((byte) -7, param0)) {
              if (param2.length() == 0) {
                return true;
              } else {
                if (!lg.a(0, param0, param2)) {
                  if (lf.a(param0, (byte) 37, param2)) {
                    return false;
                  } else {
                    if (!param1) {
                      if (pi.a(-91, param0, param2)) {
                        return false;
                      } else {
                        return true;
                      }
                    } else {
                      return false;
                    }
                  }
                } else {
                  return false;
                }
              }
            } else {
              return false;
            }
          }
        } else {
          return false;
        }
    }

    public final void paint(java.awt.Graphics param0) {
        ((hd) this).field_b.paint(param0);
    }

    hd(java.awt.Component param0) {
        ((hd) this).field_b = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Triple shot";
        field_d = new int[8192];
    }
}
