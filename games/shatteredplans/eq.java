/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eq extends oh {
    static bi field_o;
    static String field_i;
    int[] field_r;
    int[] field_p;
    byte[][][] field_h;
    int[] field_m;
    pb[] field_q;
    int field_j;
    pb[] field_n;
    static qh field_k;
    int field_l;

    final static void d(byte param0) {
        int var1 = 0;
        double var2 = 0.0;
        int var4 = ShatteredPlansClient.field_F ? 1 : 0;
        wn.c();
        we.field_e = 11;
        uc.field_w = new int[260];
        if (param0 != -47) {
            Object var5 = null;
            eq.a((String[]) null, (sq) null, 48);
        }
        for (var1 = 0; (var1 ^ -1) > -257; var1++) {
            var2 = 15.0;
            uc.field_w[var1] = (int)(255.0 * Math.pow((double)((float)var1 / 256.0f), var2));
        }
        int var6 = 256;
        var1 = var6;
        while (var6 < uc.field_w.length) {
            uc.field_w[var6] = 255;
            var6++;
        }
    }

    final static void a(String[] args, sq param1, int param2) {
        int var4 = 0;
        String var5 = null;
        int var6 = ShatteredPlansClient.field_F ? 1 : 0;
        String[] var7 = args;
        String[] var3 = var7;
        for (var4 = param2; var7.length > var4; var4++) {
            var5 = var7[var4];
            param1.a(30712, var5);
        }
    }

    public static void a(byte param0) {
        if (param0 != -70) {
            return;
        }
        field_i = null;
        field_o = null;
        field_k = null;
    }

    eq() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Cancel unrated rematch";
    }
}
