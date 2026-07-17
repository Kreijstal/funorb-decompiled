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

    final static void d() {
        int var1 = 0;
        if (bc.field_b > 10) {
            rf.b(80, bc.field_b + -10);
            var1 = 0;
            return;
        }
        rf.b(80, 0);
        var1 = 0;
    }

    cm(int param0) {
        ((cm) this).field_q = param0;
    }

    public static void a() {
        field_s = null;
        field_t = null;
        field_v = null;
        field_r = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = new String[]{"By rating", "By win percentage"};
        field_t = new ij();
    }
}
