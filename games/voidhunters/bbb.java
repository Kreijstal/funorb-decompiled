/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bbb {
    static String field_a;

    public static void a(int param0) {
        if (param0 != 0) {
            field_a = null;
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static phb[] a(phb[] param0, byte param1) {
        int var3 = 0;
        phb var4 = null;
        int var5 = VoidHunters.field_G;
        int var2 = 60 / ((-15 - param1) / 36);
        for (var3 = 0; param0.length > var3; var3++) {
            var4 = param0[var3];
            param0[var3].field_l = 0;
            var4.field_k = 0;
            param0[var3].field_m = param0[var3].field_q;
            param0[var3].field_n = param0[var3].field_p;
        }
        return param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Please try again in a few minutes.";
    }
}
