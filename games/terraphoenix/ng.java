/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ng extends fd {
    static boolean field_s;
    static int field_x;
    static int field_v;
    static String field_w;
    static bg[] field_u;
    static int field_y;
    static volatile int field_t;

    ng(pk param0, int param1) {
        super(param0, 4, 2, 2, 2, param1, -1, 0, 1, param0.field_s, -1, 2147483647, false);
    }

    public final void a(int param0, gl param1, int param2, int param3, boolean param4) {
        if (!(!param4)) {
            ah.a(param1.field_n, 128, param1.field_p, param2 - -param1.field_w, param1.field_u + param0);
        }
        super.a(param0, param1, param2, param3, param4);
    }

    public static void e(int param0) {
        field_w = null;
        field_u = null;
        if (param0 < 26) {
            ng.e(-69);
        }
    }

    ng(int param0) {
        this(qk.field_e, param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = ",";
        field_v = 0;
        field_t = 0;
        field_x = 0;
    }
}
