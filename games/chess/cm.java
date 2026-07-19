/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class cm extends l {
    static int field_w;
    int field_q;
    static ij field_t;
    static String[] field_r;
    static int field_u;
    static rk field_s;
    static dk field_v;

    abstract boolean g(int param0);

    abstract Object f(int param0);

    final static void d(byte param0) {
        int var1 = 0;
        if (bc.field_b > 10) {
          rf.b(80, bc.field_b + -10);
          var1 = 4 % ((-52 - param0) / 51);
          return;
        } else {
          rf.b(80, 0);
          var1 = 4 % ((-52 - param0) / 51);
          return;
        }
    }

    cm(int param0) {
        this.field_q = param0;
    }

    public static void a(boolean param0) {
        field_s = null;
        field_t = null;
        field_v = null;
        if (param0) {
            cm.a(false);
            field_r = null;
            return;
        }
        field_r = null;
    }

    static {
        field_r = new String[]{"By rating", "By win percentage"};
        field_t = new ij();
    }
}
