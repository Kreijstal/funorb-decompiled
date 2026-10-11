/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class g extends gb {
    int field_t;
    static int[] field_u;
    static int field_p;
    static oa field_x;
    int field_v;
    static int field_y;
    int field_q;
    int field_o;
    int field_r;
    static ti field_w;
    int field_s;

    final static int g(int param0) {
        if (param0 != 1) {
          g.f(-106);
        }
        if (!re.field_k && fe.field_L >= bc.field_o &&
          !(bc.field_o + cl.field_a <= fe.field_L)) {
          return field_y;
        }
        return -1;
    }

    final static void f(int param0) {
        int var1 = 0;
        int var1Lifetime1;
        if (32 >= qd.field_d) {
          da.a(0, (byte) -74);
        } else {
          var1 = qd.field_d % 32;
          if (var1 == 0) {
            var1 = 32;
          }
          da.a(-var1 + qd.field_d, (byte) -74);
        }
        var1Lifetime1 = 67 / ((-19 - param0) / 48);
    }

    final static qj[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var14 = 0;
        int var9;
        qj[] var10;
        qj[] var11_ref_qj__;
        int var11;
        int var12;
        qj var13;
        int var15;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        int var12Lifetime4;
        var15 = TrackController.field_F ? 1 : 0;
        var9 = param6 + param1 + param2;
        var10 = new qj[]{new qj(var9, var9), new qj(param7, var9), new qj(var9, var9), new qj(var9, param7), new qj(64, 64), new qj(var9, param7), new qj(var9, var9), new qj(param7, var9), new qj(var9, var9)};
        var11_ref_qj__ = var10;
        for (var12 = 0; var12 < var11_ref_qj__.length; var12++) {
          var13 = var11_ref_qj__[var12];
          for (var14 = 0; var13.field_z.length > var14; var14++) {
            var13.field_z[var14] = param0;
          }
        }
        if (param8 > -82) {
          field_y = 69;
        }
        for (var11 = 0; var11 < param6; var11++) {
          for (var12Lifetime1 = 0; var12Lifetime1 < var9; var12Lifetime1++) {
            var10[6].field_z[(-1 - var11 + var9) * var9 + var12Lifetime1] = param3;
            var10[8].field_z[(-1 + var9 - var11) * var9 + var12Lifetime1] = param3;
            var10[2].field_z[var12Lifetime1 * var9 - var11 - (1 - var9)] = param3;
            var10[8].field_z[var9 + (-1 - var11 + var9 * var12Lifetime1)] = param3;
          }
        }
        for (var11Lifetime1 = 0; var11Lifetime1 < param6; var11Lifetime1++) {
          for (var12Lifetime2 = 0; var9 > var12Lifetime2; var12Lifetime2++) {
            var10[0].field_z[var12Lifetime2 + var11Lifetime1 * var9] = param4;
            var10[0].field_z[var12Lifetime2 * var9 + var11Lifetime1] = param4;
            if (var12Lifetime2 < -var11Lifetime1 + var9) {
              var10[2].field_z[var12Lifetime2 + var11Lifetime1 * var9] = param4;
              var10[6].field_z[var9 * var12Lifetime2 + var11Lifetime1] = param4;
            }
          }
        }
        for (var11Lifetime2 = 0; var11Lifetime2 < param7; var11Lifetime2++) {
          for (var12Lifetime3 = 0; param6 > var12Lifetime3; var12Lifetime3++) {
            var10[7].field_z[var11Lifetime2 + (-1 - var12Lifetime3 + var9) * param7] = param3;
            var10[5].field_z[-1 + var9 - (var12Lifetime3 - var9 * var11Lifetime2)] = param3;
            var10[1].field_z[var12Lifetime3 * param7 + var11Lifetime2] = param4;
            var10[3].field_z[var9 * var11Lifetime2 + var12Lifetime3] = param4;
          }
        }
        for (var11Lifetime3 = 0; var11Lifetime3 < param7 >> 1; var11Lifetime3++) {
          for (var12Lifetime4 = 0; var12Lifetime4 < param2; var12Lifetime4++) {
            var10[1].field_z[(-var12Lifetime4 + var9 - 1) * param7 + var11Lifetime3] = param5;
            var10[3].field_z[var9 * var11Lifetime3 - (1 - var9) - var12Lifetime4] = param5;
            var10[7].field_z[var11Lifetime3 + param7 * var12Lifetime4] = param5;
            var10[5].field_z[var9 * var11Lifetime3 + var12Lifetime4] = param5;
          }
        }
        return var10;
    }

    public static void a(byte param0) {
        field_w = null;
        field_u = null;
        field_x = null;
        if (param0 != 12) {
          field_w = (ti) null;
        }
    }

    g() {
    }

    static {
        field_p = 0;
        field_y = -1;
        field_w = null;
    }
}
