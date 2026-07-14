/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class s {
    static String field_b;
    static String[] field_c;
    static String field_a;

    final static void a(oa param0, int param1, boolean param2) {
        ih var5 = ud.field_b;
        var5.e(8, param1);
        if (param2) {
            return;
        }
        var5.field_i = var5.field_i + 1;
        int var4 = var5.field_i;
        var5.a(-11, 1);
        if (param0.field_k == null) {
            var5.a(-11, 0);
        } else {
            var5.a(-11, param0.field_k.length);
            var5.a(param0.field_k, param0.field_k.length, 0, 0);
        }
        int discarded$0 = var5.c(var4, -30532);
        var5.field_i = var5.field_i - 4;
        param0.field_i = var5.c((byte) -3);
        var5.c((byte) -128, -var4 + var5.field_i);
    }

    public static void a(byte param0) {
        field_a = null;
        field_b = null;
        if (param0 != 123) {
            field_b = null;
        }
        field_c = null;
    }

    final static void a(int param0, int param1, bh param2) {
        int var5 = 0;
        int var6 = fleas.field_A ? 1 : 0;
        ih var8 = ud.field_b;
        ih var9 = var8;
        var9.e(param0 ^ -4479, param1);
        var9.field_i = var9.field_i + 1;
        int var4 = var9.field_i;
        if (param0 != -4471) {
            Object var7 = null;
            s.a(120, -80, (bh) null);
        }
        var9.a(-11, 1);
        var9.b((byte) 76, param2.field_s);
        var9.b((byte) -49, param2.field_o);
        var9.b((byte) 105, param2.field_i);
        var9.a(param2.field_j, (byte) -50);
        var9.a(param2.field_r, (byte) -35);
        var9.a(param2.field_v, (byte) -56);
        var9.a(param2.field_m, (byte) -15);
        var9.a(-11, param2.field_p.length);
        for (var5 = 0; var5 < param2.field_p.length; var5++) {
            var8.a(param2.field_p[var5], (byte) -50);
        }
        int discarded$0 = var9.c(var4, -30532);
        var9.c((byte) -110, var9.field_i - var4);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
        field_a = "Try again";
    }
}
