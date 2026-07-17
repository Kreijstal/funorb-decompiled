/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qe {
    static gf field_a;
    static String field_b;

    final static int[][] a(boolean param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, float param8) {
        int var11 = 0;
        int var12 = Sumoblitz.field_L ? 1 : 0;
        int[][] var15 = new int[256][64];
        int[][] var14 = var15;
        int[][] var13 = var14;
        int[][] var9 = var13;
        mo var10 = new mo();
        var10.field_s = 3;
        var10.field_p = (int)(param8 * (float)4096);
        var10.field_q = 4;
        var10.field_r = 4;
        var10.field_m = false;
        var10.c(-8);
        vv.a(-1203350004, 64, 256);
        for (var11 = 0; var11 < 256; var11++) {
            var10.a(-28696, var11, var15[var11]);
        }
        return var9;
    }

    public static void a() {
        field_b = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new gf();
        field_b = "Connection lost - attempting to reconnect";
    }
}
