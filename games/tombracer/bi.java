/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bi {
    static fta field_a;
    static int field_c;
    static su field_d;
    static String[] field_b;

    public static void a(boolean param0) {
        field_a = null;
        field_b = null;
        if (param0) {
            Object var2 = null;
            bi.a((ha) null, 112);
            field_d = null;
            return;
        }
        field_d = null;
    }

    final static void a(ha param0, int param1) {
        ssa var2 = uja.a((byte) 65, param0);
        jea var3 = wi.field_s;
        var2.a(var3.field_q + var3.field_G, var3.field_A, (byte) -12, var3.field_t + var3.field_A, var3.field_q);
        param0.SA(param1, var3.field_A, bea.field_g, var3.field_t, bea.field_l, bea.field_g * var3.field_A, bea.field_g);
        var2.a(param1 ^ -64);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new fta();
        field_d = new su(7, 0, 1, 1);
        field_b = new String[]{"All scores", "My scores", "Best each"};
    }
}
