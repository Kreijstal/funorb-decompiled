/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rj extends rf {
    int[] field_g;
    boolean field_n;
    static id[] field_i;
    static String field_m;
    static String[] field_l;
    static String field_f;
    static int field_h;
    static int field_j;
    int field_k;

    final static int a(int param0, int param1, byte param2, byte[] param3) {
        int var5 = 0;
        if (param2 <= 79) {
            field_l = null;
        }
        int var4 = -1;
        for (var5 = param0; var5 < param1; var5++) {
            var4 = var4 >>> 212596296 ^ fb.field_n[(param3[var5] ^ var4) & 255];
        }
        var4 = var4 ^ -1;
        return var4;
    }

    public static void a(int param0) {
        field_f = null;
        if (param0 != -1) {
            rj.a(118);
        }
        field_l = null;
        field_m = null;
        field_i = null;
    }

    rj() {
        ((rj) this).field_n = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Achieved";
        field_j = 5;
        field_m = "Cancel";
        field_l = new String[]{"New superweapon!", "Serious challenges!", "Mega boss fights!"};
    }
}
