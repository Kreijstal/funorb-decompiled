/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class dl extends pa {
    boolean field_v;
    static ed field_w;
    static dd field_s;
    boolean field_r;
    static String field_u;
    volatile boolean field_q;
    static fh field_t;

    abstract int f(int param0);

    public static void h(int param0) {
        field_s = null;
        field_t = null;
        field_w = null;
        field_u = null;
        if (param0 != 2) {
            dl.h(-20);
        }
    }

    abstract byte[] g(int param0);

    final static n a(int param0, int param1, int param2, rh param3, rh param4) {
        if (param1 == 2) {
          if (!ha.a(param4, -32180, param2, param0)) {
            return null;
          } else {
            return pd.a(param3.a(param2, (byte) 122, param0), true);
          }
        } else {
          field_u = null;
          if (!ha.a(param4, -32180, param2, param0)) {
            return null;
          } else {
            return pd.a(param3.a(param2, (byte) 122, param0), true);
          }
        }
    }

    dl() {
        ((dl) this).field_q = true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = new ed();
        field_u = "<%0>Balloons & landing pad:<%1> will carry one flea upwards until it reaches the landing pad. On its way, it will not affect anything and will pass in front of any obstacles. One use only.";
        field_t = new fh(10, 2, 2, 0);
    }
}
