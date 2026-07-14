/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ic extends sk {
    byte field_y;
    int field_s;
    static da field_u;
    gb field_v;
    static gb field_z;
    static double field_w;
    static int field_t;
    static String field_x;

    final int a(byte param0) {
        if (param0 != -126) {
            return -80;
        }
        if (!(null != ((ic) this).field_v)) {
            return 0;
        }
        return ((ic) this).field_v.field_m * 100 / (-((ic) this).field_y + ((ic) this).field_v.field_l.length);
    }

    final byte[] f(int param0) {
        if (!((ic) this).field_m) {
          if (((ic) this).field_v.field_m >= ((ic) this).field_v.field_l.length + -((ic) this).field_y) {
            if (param0 != 0) {
              int discarded$2 = ((ic) this).a((byte) 76);
              return ((ic) this).field_v.field_l;
            } else {
              return ((ic) this).field_v.field_l;
            }
          } else {
            throw new RuntimeException();
          }
        } else {
          throw new RuntimeException();
        }
    }

    public static void i(int param0) {
        field_u = null;
        field_x = null;
        if (param0 >= -69) {
            field_w = 1.4661964452487954;
            field_z = null;
            return;
        }
        field_z = null;
    }

    ic() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = new gb(256);
        field_w = Math.atan2(1.0, 0.0);
        field_t = -1811547031;
        field_x = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
    }
}
