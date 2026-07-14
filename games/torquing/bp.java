/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bp {
    static int field_f;
    static ei field_a;
    static int field_d;
    static int[] field_b;
    static la field_c;
    static int field_e;

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(wc param0, int param1, int param2) {
        int var5 = 0;
        int var6 = Torquing.field_u;
        df var7 = wa.field_d;
        df var8 = var7;
        var8.f(91, param2);
        var8.field_n = var8.field_n + 1;
        int var4 = var8.field_n;
        var8.b(90, param1);
        var8.a(param0.field_q, 118);
        var8.a(param0.field_n, param1 ^ 58);
        var8.a(param0.field_m, 88);
        var8.b((byte) 60, param0.field_p);
        var8.b((byte) 60, param0.field_r);
        var8.b((byte) 60, param0.field_o);
        var8.b((byte) 60, param0.field_j);
        var8.b(90, param0.field_k.length);
        for (var5 = 0; var5 < param0.field_k.length; var5++) {
            var7.b((byte) 60, param0.field_k[var5]);
        }
        int discarded$0 = var8.a(var4, true);
        var8.c((byte) 48, var8.field_n - var4);
    }

    public static void a(boolean param0) {
        field_b = null;
        if (param0) {
            return;
        }
        field_a = null;
        field_c = null;
    }

    final static void a(byte param0) {
        bg var1_ref = null;
        bg var1 = (bg) (Object) rf.field_t.b((byte) -77);
        if (param0 >= -42) {
            bp.a(false);
        }
        if (var1 == null) {
            var1_ref = new bg();
        }
        var1_ref.a(ph.field_e, ph.field_c, ph.field_h, ph.field_d, ph.field_j, ph.field_a, ph.field_k, 17830);
        bf.field_a.a((byte) 54, (q) (Object) var1_ref);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new ei();
        field_d = 4;
        field_b = new int[]{28, 28, 112, 397, 421, 0, 156, 156, 156, 156, 56, 156};
    }
}
