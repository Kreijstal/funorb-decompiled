/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ec {
    static String[] field_a;
    static String field_b;

    public static void a(int param0) {
        field_a = null;
        if (param0 != -29584) {
          ec.a(-78);
        }
        field_b = null;
    }

    final static kv[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var14 = 0;
        int var9;
        kv[] var10;
        kv[] var11_ref_kv__;
        int var11;
        int var12;
        kv var13;
        int var15;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        int var12Lifetime4;
        var15 = BachelorFridge.field_y;
        var9 = param4 + (param8 + param6);
        var10 = new kv[]{new kv(var9, var9), new kv(param0, var9), new kv(var9, var9), new kv(var9, param0), new kv(64, 64), new kv(var9, param0), new kv(var9, var9), new kv(param0, var9), new kv(var9, var9)};
        var11_ref_kv__ = var10;
        for (var12 = 0; var11_ref_kv__.length > var12; var12++) {
          var13 = var11_ref_kv__[var12];
          for (var14 = 0; var14 < var13.field_v.length; var14++) {
            var13.field_v[var14] = param5;
          }
        }
        if (param1 != 5) {
          field_b = (String) null;
        }
        for (var11 = 0; var11 < param8; var11++) {
          for (var12Lifetime1 = 0; var9 > var12Lifetime1; var12Lifetime1++) {
            var10[6].field_v[var12Lifetime1 + var9 * (-1 + (var9 - var11))] = param2;
            var10[8].field_v[var12Lifetime1 + var9 * (-var11 + (var9 - 1))] = param2;
            var10[2].field_v[var12Lifetime1 * var9 + var9 + (-1 - var11)] = param2;
            var10[8].field_v[-var11 - (1 - var9) + var9 * var12Lifetime1] = param2;
          }
        }
        for (var11Lifetime1 = 0; var11Lifetime1 < param8; var11Lifetime1++) {
          for (var12Lifetime2 = 0; var9 > var12Lifetime2; var12Lifetime2++) {
            var10[0].field_v[var9 * var11Lifetime1 + var12Lifetime2] = param7;
            var10[0].field_v[var12Lifetime2 * var9 + var11Lifetime1] = param7;
            if (var12Lifetime2 < var9 - var11Lifetime1) {
              var10[2].field_v[var12Lifetime2 + var11Lifetime1 * var9] = param7;
              var10[6].field_v[var11Lifetime1 + var9 * var12Lifetime2] = param7;
            }
          }
        }
        for (var11Lifetime2 = 0; var11Lifetime2 < param0; var11Lifetime2++) {
          for (var12Lifetime3 = 0; param8 > var12Lifetime3; var12Lifetime3++) {
            var10[7].field_v[(-1 + (-var12Lifetime3 + var9)) * param0 + var11Lifetime2] = param2;
            var10[5].field_v[var9 + (-1 - var12Lifetime3) + var9 * var11Lifetime2] = param2;
            var10[1].field_v[var12Lifetime3 * param0 + var11Lifetime2] = param7;
            var10[3].field_v[var12Lifetime3 + var11Lifetime2 * var9] = param7;
          }
        }
        for (var11Lifetime3 = 0; param0 >> 1 > var11Lifetime3; var11Lifetime3++) {
          for (var12Lifetime4 = 0; param4 > var12Lifetime4; var12Lifetime4++) {
            var10[1].field_v[(-1 + var9 - var12Lifetime4) * param0 + var11Lifetime3] = param3;
            var10[3].field_v[var11Lifetime3 * var9 - (var12Lifetime4 + (-var9 + 1))] = param3;
            var10[7].field_v[param0 * var12Lifetime4 + var11Lifetime3] = param3;
            var10[5].field_v[var9 * var11Lifetime3 + var12Lifetime4] = param3;
          }
        }
        return var10;
    }

    static {
        field_a = new String[16];
        field_b = "Invite more players, or alternatively try changing the '<%0>' setting.";
    }
}
