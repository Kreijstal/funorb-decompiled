/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class og {
    static String field_d;
    static int field_f;
    static String field_i;
    static int[][] field_j;
    static String field_k;
    static boolean field_b;
    static wb field_a;
    static int[] field_g;
    static String field_e;
    static int field_c;
    static String[] field_h;

    final static void a(byte param0) {
        ph.field_h = null;
        uj.field_b = null;
        ig.field_H = null;
        sa.field_l = null;
        jc.field_c = null;
        qf.field_d = null;
    }

    public static void a(int param0) {
        field_i = null;
        field_a = null;
        field_h = null;
        field_d = null;
        field_e = null;
        field_j = null;
        field_g = null;
        field_k = null;
        if (param0 <= 31) {
            og.a(18);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var1 = 0;
        int var0 = 0;
        int var2 = 0;
        field_f = 640;
        field_i = "Mega Power: <%0>";
        field_k = "No highscores";
        field_d = "Fullscreen";
        field_a = new wb(0);
        field_e = "FULL ACCESS";
        field_g = new int[256];
        for (var1 = 0; var1 < 256; var1++) {
            var0 = var1;
            for (var2 = 0; var2 < 8; var2++) {
                if ((1 & var0) != 1) {
                    var0 = var0 >>> 1;
                } else {
                    var0 = var0 >>> 1 ^ -306674912;
                }
            }
            field_g[var1] = var0;
        }
        field_h = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    }
}
