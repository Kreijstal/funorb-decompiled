/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lf {
    static vg field_b;
    static String field_c;
    static String field_a;

    final static dk[] a(int param0) {
        if (param0 != 7) {
          return (dk[]) null;
        }
        return new dk[]{lh.field_s, lc.field_j, vc.field_b};
    }

    final static oh[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, byte param7, int param8) {
        int var14 = 0;
        int var9;
        oh[] var10;
        oh[] var11_ref_oh__;
        int var11;
        int var12;
        oh var13;
        int var15;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        int var12Lifetime4;
        var15 = TetraLink.field_J;
        var9 = param4 + param5 + param0;
        var10 = new oh[]{new oh(var9, var9), new oh(param6, var9), new oh(var9, var9), new oh(var9, param6), new oh(64, 64), new oh(var9, param6), new oh(var9, var9), new oh(param6, var9), new oh(var9, var9)};
        var11_ref_oh__ = var10;
        for (var12 = 0; var12 < var11_ref_oh__.length; var12++) {
          var13 = var11_ref_oh__[var12];
          for (var14 = 0; var13.field_C.length > var14; var14++) {
            var13.field_C[var14] = param1;
          }
        }
        for (var11 = 0; param5 > var11; var11++) {
          for (var12Lifetime1 = 0; var12Lifetime1 < var9; var12Lifetime1++) {
            var10[6].field_C[var12Lifetime1 + (var9 - (var11 + 1)) * var9] = param3;
            var10[8].field_C[var12Lifetime1 + (var9 - var11 - 1) * var9] = param3;
            var10[2].field_C[var9 * var12Lifetime1 - (-var9 + 1) - var11] = param3;
            var10[8].field_C[-1 + (var9 - var11) + var12Lifetime1 * var9] = param3;
          }
        }
        for (var11Lifetime1 = 0; var11Lifetime1 < param5; var11Lifetime1++) {
          for (var12Lifetime2 = 0; var12Lifetime2 < var9; var12Lifetime2++) {
            var10[0].field_C[var12Lifetime2 + var9 * var11Lifetime1] = param8;
            var10[0].field_C[var9 * var12Lifetime2 + var11Lifetime1] = param8;
            if (var12Lifetime2 < (var9 - var11Lifetime1)) {
              var10[2].field_C[var12Lifetime2 + var9 * var11Lifetime1] = param8;
              var10[6].field_C[var11Lifetime1 + var9 * var12Lifetime2] = param8;
            }
          }
        }
        var11Lifetime2 = 0;
        if (param7 != -112) {
          lf.a(48, 126, 35, -60, 39, 14, -11, (byte) 26, 113);
        }
        while (param6 > var11Lifetime2) {
          for (var12Lifetime3 = 0; var12Lifetime3 < param5; var12Lifetime3++) {
            var10[7].field_C[var11Lifetime2 + (-1 - var12Lifetime3 + var9) * param6] = param3;
            var10[5].field_C[var9 * var11Lifetime2 - (var12Lifetime3 + 1 - var9)] = param3;
            var10[1].field_C[var11Lifetime2 + param6 * var12Lifetime3] = param8;
            var10[3].field_C[var12Lifetime3 + var9 * var11Lifetime2] = param8;
          }
          var11Lifetime2++;
        }
        for (var11Lifetime3 = 0; param6 >> 1 > var11Lifetime3; var11Lifetime3++) {
          for (var12Lifetime4 = 0; var12Lifetime4 < param0; var12Lifetime4++) {
            var10[1].field_C[(-1 + var9 - var12Lifetime4) * param6 + var11Lifetime3] = param2;
            var10[3].field_C[var11Lifetime3 * var9 + var9 - 1 - var12Lifetime4] = param2;
            var10[7].field_C[param6 * var12Lifetime4 + var11Lifetime3] = param2;
            var10[5].field_C[var12Lifetime4 + var9 * var11Lifetime3] = param2;
          }
        }
        return var10;
    }

    public static void a(boolean param0) {
        if (!param0) {
          field_b = (vg) null;
        }
        field_c = null;
        field_b = null;
        field_a = null;
    }

    static {
        field_c = "Options Menu";
        field_a = "You have withdrawn your request to join.";
    }
}
