/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wc {
    static da field_b;
    static kb field_f;
    static int field_e;
    static int field_a;
    static String field_d;
    static int field_c;

    public static void a(boolean param0) {
        field_f = null;
        field_b = null;
        field_d = null;
        if (param0) {
            field_b = null;
        }
    }

    final static o a(o param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = SolKnight.field_L ? 1 : 0;
        o var6 = new o(param0.field_t, param0.field_p);
        var6.field_q = param0.field_r;
        var6.field_s = param0.field_q + -param0.field_p - param0.field_n;
        var6.field_r = param0.field_q;
        var6.field_n = param0.field_s;
        for (var3 = param1; var3 < var6.field_t; var3++) {
            for (var4 = 0; var4 < var6.field_p; var4++) {
                var6.field_v[var6.field_p * var3 + var4] = param0.field_v[var3 + (param0.field_t + -1 - var4) * param0.field_p];
            }
        }
        return var6;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new kb();
        field_e = 480;
        field_a = 256;
        field_d = "More suggestions";
    }
}
