/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class se extends cga {
    ta field_w;
    int field_v;
    static hk field_u;
    static sna[] field_s;
    static boolean field_x;
    byte[] field_t;

    final byte[] d(byte param0) {
        if (((se) this).field_n) {
          throw new RuntimeException();
        } else {
          if (param0 != -65) {
            ((se) this).field_v = 0;
            return ((se) this).field_t;
          } else {
            return ((se) this).field_t;
          }
        }
    }

    public static void f(int param0) {
        field_s = null;
        field_u = null;
        int var1 = -13 / ((40 - param0) / 62);
    }

    final int e(int param0) {
        if (param0 != -6298) {
            return 65;
        }
        if (!(!((se) this).field_n)) {
            return 0;
        }
        return 100;
    }

    se() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = new hk("email");
    }
}
