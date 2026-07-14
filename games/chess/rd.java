/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rd {
    static String field_b;
    static String field_a;

    final static int[] a(int param0, int param1, double[] param2) {
        int var4 = 0;
        int var5 = Chess.field_G;
        int[] var6 = new int[param2.length];
        int[] var3 = var6;
        for (var4 = param1 + param2.length; (var4 ^ -1) <= -1; var4--) {
            var6[var4] = (int)(0.5 + (double)(1 << param0) * param2[var4]);
        }
        return var3;
    }

    final static km a(int param0, int param1, int param2) {
        int var5 = Chess.field_G;
        km var6 = new km(param0, param0);
        km var3 = var6;
        int var4 = 0;
        if (param2 != 14727) {
            return null;
        }
        while (var4 < var3.field_x.length) {
            var6.field_x[var4] = param1;
            var4++;
        }
        return var3;
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        if (param0 != 32286) {
            field_a = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Please try again in a few minutes.";
        field_b = "to keep fullscreen or";
    }
}
