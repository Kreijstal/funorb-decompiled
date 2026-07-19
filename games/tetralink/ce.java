/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ce {
    int field_d;
    int field_g;
    private static int[] field_a;
    int field_h;
    static int[] field_e;
    static bh field_f;
    static boolean[][] field_i;
    static String field_c;
    static int field_b;

    public static void a(byte param0) {
        field_f = null;
        field_i = (boolean[][]) null;
        if (param0 <= 7) {
            ce.a((byte) -74);
        }
        field_c = null;
        field_e = null;
        field_a = null;
    }

    final static oh a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = TetraLink.field_J;
        oh var6 = new oh(param1, param1);
        oh var3 = var6;
        for (var4 = param2; var4 < var3.field_C.length; var4++) {
            var6.field_C[var4] = param0;
        }
        return var3;
    }

    static {
        int var0 = 0;
        double var1 = 0.0;
        field_a = new int[65536];
        field_e = new int[65536];
        for (var0 = 0; var0 < 65536; var0++) {
            var1 = 256.0 - Math.sqrt((double)var0);
            field_e[var0] = (int)(0.5 + var1 * var1);
        }
        for (var0 = 0; var0 < 65536; var0++) {
            var1 = Math.sqrt((double)var0);
            field_a[var0] = (int)Math.floor((double)var0 * 0.0234375 + (-(var1 * 9.0) + 768.5));
        }
        field_c = "Accept unrated rematch";
    }
}
