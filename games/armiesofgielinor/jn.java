/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jn {
    static int field_c;
    static int[] field_f;
    static int field_d;
    static String field_a;
    static String field_e;
    static wk[][] field_b;

    public static void a(int param0) {
        if (param0 > -94) {
            jn.a(84);
        }
        field_a = null;
        field_f = null;
        field_b = null;
        field_e = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int[] param7, int param8, int param9) {
        int[] var17 = null;
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = ArmiesOfGielinor.field_M ? 1 : 0;
        while (true) {
            param5--;
            if (-1 < (param5 ^ -1)) {
                break;
            }
            var17 = param7;
            var10 = var17;
            var11 = param4;
            var12 = param1;
            var13 = param6;
            var14 = param0;
            var15 = (16711422 & var17[var11]) >> 2103577121;
            var10[var11] = var15 + (rn.a(33423424, var13) >> 555900105) + (rn.a(33423360, var12) >> 1075032961) + (rn.a(33544325, var14) >> 680561425);
            param0 = param0 + param9;
            param1 = param1 + param2;
            param4++;
            param6 = param6 + param8;
        }
        if (param3 != 33423424) {
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
        field_c = 15;
        field_a = "Save and Exit";
        field_f = new int[98304];
        for (var0 = 92682; var0 >= 46341; var0--) {
            var4 = (long)(-1 + (var0 << 1599713953));
            var6 = (long)((var0 << -563895263) - -1);
            var3 = (int)((var6 * var6 >> -766032622) + -32768L);
            var2 = (int)((var4 * var4 >> -1732596782) + -32768L);
            if (field_f.length <= var3) {
                var3 = field_f.length + -1;
            }
            for (var1 = (var2 ^ -1) <= -1 ? var2 : 0; var1 <= var3; var1++) {
                field_f[var1] = var0;
            }
        }
        field_e = "Achievements";
    }
}
