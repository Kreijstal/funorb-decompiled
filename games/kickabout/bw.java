/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bw {
    static ut[] field_e;
    private static int[] field_d;
    static int[] field_a;
    static String field_c;
    static sj field_b;
    static int[] field_f;

    final static int a(long param0, int param1, long param2) {
        ak discarded$0 = null;
        if (param1 != 249299984) {
            discarded$0 = bw.a(32, -61, false, -3, 30, true);
        }
        return (int)((param2 << 249299984) / param0);
    }

    public static void a(boolean param0) {
        field_f = null;
        if (param0) {
            bw.a(false);
        }
        field_c = null;
        field_d = null;
        field_e = null;
        field_b = null;
        field_a = null;
    }

    final static ak a(int param0, int param1, boolean param2, int param3, int param4, boolean param5) {
        int var7 = 0;
        int var8 = Kickabout.field_G;
        if (param4 != 9103) {
            return (ak) null;
        }
        ak var6 = new ak(4);
        var6.field_e = ((ot) ((Object) lu.field_p[param5 ? 1 : 0])).h();
        if (!(!param2)) {
            var6.field_e.g();
        }
        for (var7 = 0; var7 < param1; var7++) {
            var6.field_e.d();
        }
        var6.field_g = -(var6.field_e.field_v >> -1507173503) + param3;
        var6.field_k = param0;
        return var6;
    }

    static {
        int var0 = 0;
        field_a = new int[8];
        field_d = new int[8];
        field_a[1] = 50;
        field_a[5] = 64;
        field_a[4] = 128;
        field_a[2] = 50;
        field_a[6] = 140;
        field_a[0] = 78;
        field_a[7] = 100;
        field_a[3] = 50;
        for (var0 = 0; var0 < field_a.length; var0++) {
            field_d[var0] = field_a[var0];
        }
        field_c = "<%0> has just resigned and left, <%1> goes through <%2>.";
        field_f = new int[8192];
    }
}
