/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jl {
    static int[] field_b;
    private static int[] field_a;
    private static String field_z;

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        if (param0 != 32768) {
            field_a = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        long var4 = 0L;
        long var6 = 0L;
        int var3 = 0;
        int var2 = 0;
        int var1 = 0;
        field_z = "jl.A(";
        field_a = new int[98304];
        for (var0 = 92682; (var0 ^ -1) <= -46342; var0--) {
            var4 = (long)((var0 << -1929560223) + -1);
            var6 = (long)(1 + (var0 << -1467602431));
            var3 = (int)((var6 * var6 >> 902293522) - 32768L);
            var2 = (int)(-32768L + (var4 * var4 >> -51883246));
            if (var3 >= field_a.length) {
                var3 = field_a.length - 1;
            }
            for (var1 = (var2 ^ -1) > -1 ? 0 : var2; var1 <= var3; var1++) {
                field_a[var1] = var0;
            }
        }
    }
}
