/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cb extends Exception {
    static String field_d;
    String field_b;
    static je field_c;
    static um[] field_a;

    public static void a(int param0) {
        field_d = null;
        int var1 = -112 / ((param0 - 70) / 54);
        field_c = null;
        field_a = null;
    }

    final static void a(int param0, wk param1, int param2, int param3, int param4, int param5) {
        int var13 = 0;
        int var14 = 0;
        int var6 = tm.field_c;
        int var7 = tm.field_j;
        int var8 = tm.field_n[150];
        int var9 = tm.field_e[150];
        int var10 = param5 * var9 + -(param0 * var8) >> -11818448;
        int var12 = 69 % ((-24 - param3) / 46);
        int var11 = param5 * var8 + var9 * param0 >> 1957129584;
        if (var11 > 0) {
            var13 = var6 - -((param4 << -604629751) / var11);
            var14 = (var10 << 1065063401) / var11 + var7;
            param1.f(var13, var14, param2);
        }
    }

    cb(String param0) {
        ((cb) this).field_b = param0;
    }

    final static wk[] a(boolean param0, kl param1, int param2, int param3) {
        if (param0) {
            return null;
        }
        if (!kp.a(param0, param2, param1, param3)) {
            return null;
        }
        return md.g(122);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Options";
        field_a = new um[6];
    }
}
