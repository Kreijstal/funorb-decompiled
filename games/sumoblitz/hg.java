/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hg extends ms {
    static String field_t;
    int field_u;
    int field_n;
    static float[] field_l;
    int field_s;
    static lg field_o;
    static float[] field_k;
    int field_p;
    int field_r;
    int field_q;
    static int[] field_m;

    final static nj[] a(int param0, int[] param1) {
        int var6 = Sumoblitz.field_L ? 1 : 0;
        int var2 = 0 == param1[param1.length - 1] ? 1 : 0;
        nj[] var3 = new nj[var2 == 0 ? param1.length + 1 : param1.length];
        int var4 = 0;
        for (var4 = 0; var4 < param1.length; var4++) {
            var3[var4] = new nj(param1[var4], 2);
        }
        if (!(var4 >= var3.length)) {
            var3[var4] = new nj(0, 2);
        }
        int var5 = 34 / ((57 - param0) / 53);
        return var3;
    }

    public static void a(byte param0) {
        field_m = null;
        field_l = null;
        if (param0 != 12) {
            Object var2 = null;
            nj[] discarded$0 = hg.a(-33, (int[]) null);
        }
        field_t = null;
        field_k = null;
        field_o = null;
    }

    hg(int param0, int param1, int param2, int param3, int param4, int param5) {
        ((hg) this).field_n = param4;
        ((hg) this).field_r = param2;
        ((hg) this).field_s = param3;
        ((hg) this).field_q = param1;
        ((hg) this).field_u = param0;
        ((hg) this).field_p = param5;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var2 = 0;
        field_t = "Play the game without logging in just yet";
        field_k = new float[16384];
        field_l = new float[16384];
        double var0 = 0.0003834951969714103;
        for (var2 = 0; var2 < 16384; var2++) {
            field_k[var2] = (float)Math.sin((double)var2 * var0);
            field_l[var2] = (float)Math.cos(var0 * (double)var2);
        }
        field_m = new int[1];
    }
}
