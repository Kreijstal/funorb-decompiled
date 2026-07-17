/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qe {
    static gf field_a;
    static String field_b;

    final static int[][] a(boolean param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, float param8) {
        int var11 = 0;
        int var12 = Sumoblitz.field_L ? 1 : 0;
        int[][] var15 = new int[param7][param6];
        int[][] var14 = var15;
        int[][] var13 = var14;
        int[][] var9 = var13;
        mo var10 = new mo();
        var10.field_s = param1;
        var10.field_p = (int)(param8 * (float)param4);
        var10.field_q = param3;
        var10.field_r = param5;
        var10.field_m = param0 ? true : false;
        var10.c(-8);
        vv.a(-1203350004, param6, param7);
        for (var11 = 0; var11 < param7; var11++) {
            var10.a(param4 + -32792, var11, var15[var11]);
        }
        return var9;
    }

    public static void a(int param0) {
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
