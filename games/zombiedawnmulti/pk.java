/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pk {
    static int[] field_a;
    static jb field_b;
    static ja field_c;

    final static cj b() {
        return bf.field_n.field_Gb;
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        if (param0 != 619119521) {
            pk.a(38);
            field_c = null;
            return;
        }
        field_c = null;
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
        field_a = new int[98304];
        for (var0 = 92682; 46341 <= var0; var0--) {
            var4 = (long)((var0 << 1) + -1);
            var6 = (long)((var0 << 1) + 1);
            var3 = (int)((var6 * var6 >> 18) + -32768L);
            var2 = (int)(-32768L + (var4 * var4 >> 18));
            if (var3 >= field_a.length) {
                var3 = field_a.length + -1;
            }
            for (var1 = var2 < 0 ? 0 : var2; var3 >= var1; var1++) {
                field_a[var1] = var0;
            }
        }
    }
}
