/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hj {
    static int field_a;
    static String field_d;
    static gb field_g;
    static int field_c;
    static int field_f;
    static int[] field_b;
    static int field_e;

    public static void a() {
        field_g = null;
        field_d = null;
        field_b = null;
    }

    final static db[] a(int param0) {
        int var2 = 0;
        int var3 = wizardrun.field_H;
        db[] var1 = new db[wb.field_f];
        for (var2 = 0; wb.field_f > var2; var2++) {
            var1[var2] = new db(hk.field_bb, eg.field_v, ph.field_q[var2], ne.field_h[var2], cg.field_k[var2], tf.field_b[var2], mf.field_j[var2], ic.field_b);
        }
        eb.a(0);
        return var1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Waiting for fonts";
        field_c = 0;
    }
}
