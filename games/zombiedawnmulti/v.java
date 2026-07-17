/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class v {
    static String field_g;
    static ri field_e;
    static int field_f;
    static int[] field_b;
    private static long[] field_d;
    static String field_a;
    static String field_c;

    final static void a(int param0) {
        int var1 = (kp.field_l - 640) / 2;
        int var2 = b.field_d * b.field_d;
        int var3 = var2 + -(mh.field_h * mh.field_h);
        qe.field_k.a(-4 + (-120 + oo.field_l) - 90, 90, 199, -(var3 * param0 / var2) + var1, -3344);
        cm.field_a.a(-120 + (oo.field_l + -4), 0, 438, var1 - -202 - -(var3 * 438 / var2), -3344);
    }

    public static void a() {
        field_b = null;
        field_e = null;
        field_g = null;
        field_c = null;
        field_d = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var2 = 0;
        long var0 = 0L;
        int var3 = 0;
        field_g = "Quick Chat game";
        field_d = new long[256];
        for (var2 = 0; var2 < 256; var2++) {
            var0 = (long)var2;
            for (var3 = 0; var3 < 8; var3++) {
                if (1L == (1L & var0)) {
                    var0 = -3932672073523589310L ^ var0 >>> 1;
                } else {
                    var0 = var0 >>> 1;
                }
            }
            field_d[var2] = var0;
        }
        field_c = "To <%0>: ";
    }
}
