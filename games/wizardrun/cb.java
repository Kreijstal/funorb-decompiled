/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cb {
    static int field_f;
    static int[][] field_d;
    static boolean field_c;
    static ud field_b;
    static int field_a;
    static int[] field_e;
    static boolean field_g;

    public static void a(int param0) {
        field_d = (int[][]) null;
        field_b = null;
        int var1 = 96 % ((14 - param0) / 60);
        field_e = null;
    }

    final static o[] a(int param0, int param1, int param2, boolean param3, int param4, int param5, int param6, int param7, int param8) {
        int var14 = 0;
        int var9;
        o[] var10;
        o[] var11_ref_o__;
        int var11;
        int var12;
        o var13;
        int var15;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        int var12Lifetime4;
        var15 = wizardrun.field_H;
        var9 = param2 + (param4 + param8);
        var10 = new o[]{new o(var9, var9), new o(param6, var9), new o(var9, var9), new o(var9, param6), new o(64, 64), new o(var9, param6), new o(var9, var9), new o(param6, var9), new o(var9, var9)};
        var11_ref_o__ = var10;
        for (var12 = 0; var11_ref_o__.length > var12; var12++) {
          var13 = var11_ref_o__[var12];
          for (var14 = 0; var14 < var13.field_B.length; var14++) {
            var13.field_B[var14] = param1;
          }
        }
        if (!param3) {
          cb.a(-117);
        }
        for (var11 = 0; param8 > var11; var11++) {
          for (var12Lifetime1 = 0; var12Lifetime1 < var9; var12Lifetime1++) {
            var10[6].field_B[var12Lifetime1 + (-var11 + (var9 - 1)) * var9] = param5;
            var10[8].field_B[var12Lifetime1 + (var9 - var11 - 1) * var9] = param5;
            var10[2].field_B[var12Lifetime1 * var9 - (-var9 + 1) - var11] = param5;
            var10[8].field_B[var12Lifetime1 * var9 - var11 + (var9 - 1)] = param5;
          }
        }
        for (var11Lifetime1 = 0; param8 > var11Lifetime1; var11Lifetime1++) {
          for (var12Lifetime2 = 0; var12Lifetime2 < var9; var12Lifetime2++) {
            var10[0].field_B[var12Lifetime2 + var9 * var11Lifetime1] = param7;
            var10[0].field_B[var11Lifetime1 + var9 * var12Lifetime2] = param7;
            if ((var9 - var11Lifetime1) > var12Lifetime2) {
              var10[2].field_B[var12Lifetime2 + var11Lifetime1 * var9] = param7;
              var10[6].field_B[var9 * var12Lifetime2 + var11Lifetime1] = param7;
            }
          }
        }
        for (var11Lifetime2 = 0; var11Lifetime2 < param6; var11Lifetime2++) {
          for (var12Lifetime3 = 0; param8 > var12Lifetime3; var12Lifetime3++) {
            var10[7].field_B[var11Lifetime2 + (var9 + (-var12Lifetime3 - 1)) * param6] = param5;
            var10[5].field_B[-1 + var9 - (var12Lifetime3 - var9 * var11Lifetime2)] = param5;
            var10[1].field_B[var11Lifetime2 + param6 * var12Lifetime3] = param7;
            var10[3].field_B[var12Lifetime3 + var9 * var11Lifetime2] = param7;
          }
        }
        for (var11Lifetime3 = 0; param6 >> 1 > var11Lifetime3; var11Lifetime3++) {
          for (var12Lifetime4 = 0; param2 > var12Lifetime4; var12Lifetime4++) {
            var10[1].field_B[var11Lifetime3 + param6 * (var9 - (var12Lifetime4 + 1))] = param0;
            var10[3].field_B[-var12Lifetime4 + (-1 + var9) + var11Lifetime3 * var9] = param0;
            var10[7].field_B[var12Lifetime4 * param6 + var11Lifetime3] = param0;
            var10[5].field_B[var11Lifetime3 * var9 + var12Lifetime4] = param0;
          }
        }
        return var10;
    }

    static {
        field_f = -1;
        field_e = new int[16384];
    }
}
