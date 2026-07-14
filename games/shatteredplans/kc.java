/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kc {
    static pf field_b;
    int field_j;
    int field_c;
    static nq field_g;
    int field_a;
    int field_h;
    byte[] field_e;
    int field_k;
    byte[] field_n;
    static boolean field_d;
    int field_f;
    int field_o;
    static int field_i;
    static byte[][] field_l;
    static int[] field_m;

    public static void a(boolean param0) {
        field_l = null;
        field_b = null;
        field_m = null;
        if (param0) {
            field_i = 19;
            field_g = null;
            return;
        }
        field_g = null;
    }

    final static void a(byte param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param0 != -97) {
            kc.a((byte) 75);
            var1 = gd.field_b[0];
            for (var2 = 1; var2 < gd.field_b.length; var2++) {
                var3 = gd.field_b[var2];
                ps.a(jl.field_M, var2 << 740786052, jl.field_M, var1, var3);
                var1 = var1 + var3;
            }
            return;
        }
        var1 = gd.field_b[0];
        for (var2 = 1; var2 < gd.field_b.length; var2++) {
            var3 = gd.field_b[var2];
            ps.a(jl.field_M, var2 << 740786052, jl.field_M, var1, var3);
            var1 = var1 + var3;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new pf();
        field_m = new int[4];
    }
}
