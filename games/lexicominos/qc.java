/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qc {
    static int[][][] field_b;
    static String[] field_e;
    static int[][][] field_f;
    static int[][] field_a;
    static int[] field_c;
    static db[] field_d;

    final static void a(int param0, int param1, int param2) {
        int var3 = -15 % ((-43 - param2) / 61);
        ed.field_v = 0;
        hf.field_a = param1;
        hc.field_db = param0;
        je.field_a = 1;
    }

    public static void a(int param0) {
        field_e = null;
        field_d = null;
        field_c = null;
        field_f = (int[][][]) null;
        if (param0 != 225) {
            return;
        }
        field_a = (int[][]) null;
        field_b = (int[][][]) null;
    }

    static {
        int var0 = 0;
        int var1 = 0;
        int var2 = 0;
        double var3 = 0.0;
        double var5 = 0.0;
        double var7 = 0.0;
        int var9 = 0;
        double var10 = 0.0;
        double var12 = 0.0;
        int var14 = 0;
        double var15 = 0.0;
        double var17 = 0.0;
        field_b = new int[7][4][];
        field_b[0][0] = new int[]{-1, 0, 0, 0, 1, 0, 2, 0};
        field_b[1][0] = new int[]{-1, 0, 0, 0, 1, 0, 1, 1};
        field_b[2][0] = new int[]{-1, 1, -1, 0, 0, 0, 1, 0};
        field_b[3][0] = new int[]{-1, 0, 0, 0, 0, -1, 1, -1};
        field_b[4][0] = new int[]{-1, 0, 0, 0, 1, 0, 0, -1};
        field_b[5][0] = new int[]{1, 0, 0, 0, 0, -1, -1, -1};
        field_b[6][0] = new int[]{0, 0, 0, 1, 1, 1, 1, 0};
        for (var0 = 0; 7 > var0; var0++) {
            for (var1 = 1; 4 > var1; var1++) {
                field_b[var0][var1] = new int[]{field_b[var0][var1 - 1][1], -field_b[var0][-1 + var1][0], field_b[var0][-1 + var1][3], -field_b[var0][-1 + var1][2], field_b[var0][var1 - 1][5], -field_b[var0][-1 + var1][4], field_b[var0][var1 + -1][7], -field_b[var0][var1 - 1][6]};
            }
        }
        field_b[6] = new int[][]{new int[]{0, 0, 1, 0, 1, 1, 0, 1}, new int[]{0, 1, 0, 0, 1, 0, 1, 1}, new int[]{1, 1, 0, 1, 0, 0, 1, 0}, new int[]{1, 0, 1, 1, 0, 1, 0, 0}};
        field_f = new int[7][128][8];
        for (var0 = 0; var0 < 128; var0++) {
            var1 = var0 / 32;
            var2 = var0 % 32;
            var3 = (double)var2 * 3.141592653589793 / 64.0;
            var5 = Math.cos(var3);
            var7 = Math.sin(var3);
            for (var9 = 0; 7 > var9; var9++) {
                var10 = 6 == var9 ? 0.5 : 0.0;
                var12 = (var9 ^ -1) != -7 ? 0.0 : 0.5;
                for (var14 = 0; var14 < 4; var14++) {
                    var15 = (double)field_b[var9][var1][2 * var14] - var10;
                    var17 = (double)field_b[var9][var1][1 + var14 * 2] - var12;
                    field_f[var9][var0][2 * var14] = (int)Math.round(24.0 * (var10 + (var5 * var15 + var17 * var7)));
                    field_f[var9][var0][var14 * 2 + 1] = (int)Math.round((var12 + (-(var7 * var15) + var5 * var17)) * 24.0);
                }
            }
        }
        field_a = new int[][]{new int[]{1, 3, 8, 9, 4, 7, 10, 5, 15, 12}, new int[]{13, 2}, new int[]{6, 4, 7, 8, 11}, new int[]{2, 16}, new int[]{17, 2, 18}, new int[]{13, 2}, new int[]{13, 14}, new int[]{5, 2}, new int[]{2, 16, 1}, new int[]{17, 2, 16, 1}, new int[]{17, 2, 16, 1}, new int[]{17, 2, 1}, new int[]{2, 16}, new int[]{17, 2}, new int[]{19, 4, 7, 8, 20}};
        field_c = new int[15];
        for (var0 = 0; var0 < 15; var0++) {
            field_c[var0] = 225 - 43 * field_a[var0].length / 2;
        }
        field_c[1] = -(43 * field_a[1].length) + 438;
        field_c[5] = -(43 * field_a[5].length) + 438;
        field_c[6] = -(43 * field_a[6].length) + 438;
        field_c[7] = -(field_a[7].length * 43) + 438;
        field_c[3] = 387;
        int[] var22 = field_c;
        field_c[4] = 344;
        field_c[13] = 387;
        var22[12] = 387;
        for (var1 = 8; 11 >= var1; var1++) {
            field_c[var1] = 348;
        }
    }
}
