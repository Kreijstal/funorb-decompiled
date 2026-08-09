/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nk {
    final static void a(kv param0, int param1, int param2, int param3, int param4) {
        int var13 = 0;
        int var15 = 0;
        if (param3 <= 0 || param4 <= 0) {
            return;
        }
        int var5 = param0.field_q;
        int var6 = param0.field_p;
        int var7 = 0;
        int var8 = 0;
        int var9 = param0.field_n;
        int var10 = param0.field_o;
        int var11 = (var9 << 16) / param3;
        int var12 = (var10 << 16) / param4;
        if (param0.field_t > 0) {
            var13 = ((param0.field_t << 16) + var11 - 1) / var11;
            param1 = param1 + var13;
            var7 = var7 + (var13 * var11 - (param0.field_t << 16));
        }
        if (param0.field_u > 0) {
            var13 = ((param0.field_u << 16) + var12 - 1) / var12;
            param2 = param2 + var13;
            var8 = var8 + (var13 * var12 - (param0.field_u << 16));
        }
        if (var5 < var9) {
            param3 = ((var5 << 16) - var7 + var11 - 1) / var11;
        }
        if (var6 < var10) {
            param4 = ((var6 << 16) - var8 + var12 - 1) / var12;
        }
        var13 = param1 + param2 * dg.field_i;
        int var14 = dg.field_i - param3;
        if (param2 + param4 > dg.field_k) {
            param4 = param4 - (param2 + param4 - dg.field_k);
        }
        if (param2 < dg.field_j) {
            var15 = dg.field_j - param2;
            param4 = param4 - var15;
            var13 = var13 + var15 * dg.field_i;
            var8 = var8 + var12 * var15;
        }
        if (param1 + param3 > dg.field_h) {
            var15 = param1 + param3 - dg.field_h;
            param3 = param3 - var15;
            var14 = var14 + var15;
        }
        if (param1 < dg.field_f) {
            var15 = dg.field_f - param1;
            param3 = param3 - var15;
            var13 = var13 + var15;
            var7 = var7 + var11 * var15;
            var14 = var14 + var15;
        }
        nk.a(dg.field_e, param0.field_v, 0, 0, var7, var8, var13, var14, param3, param4, var11, var12, var5);
    }

    final static kv a(pa param0) {
        kv var1;
        int var2;
        int var3;
        int var4;
        int[] stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int[] stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        var1 = new kv(param0.field_q, param0.field_p);
        var1.field_t = param0.field_t;
        var1.field_u = param0.field_u;
        var1.field_n = param0.field_n;
        var1.field_o = param0.field_o;
        var2 = param0.field_v.length;
        var3 = 0;
        L0: while (true) {
          if (var3 >= var2) {
            return var1;
          } else {
            var4 = param0.field_v[var3];
            if ((var4 & -2147483648) == 0) {
              var1.field_v[var3] = 0;
              var3++;
              continue L0;
            } else {
              L1: {
                var4 = var4 & 16777215;
                stackIn_5_0 = var1.field_v;

                stackIn_5_1 = var3;

                if (var4 != 0) {
                  stackIn_6_0 = (int[]) ((Object) stackIn_5_0);
                  stackIn_6_1 = stackIn_5_1;
                  stackIn_6_2 = var4;
                  break L1;
                } else {
                  stackIn_6_0 = (int[]) ((Object) stackIn_5_0);
                  stackIn_6_1 = stackIn_5_1;
                  stackIn_6_2 = 65793;
                  break L1;
                }
              }
              stackIn_6_0[stackIn_6_1] = stackIn_6_2;
              var3++;
              continue L0;
            }
          }
        }
    }

    private final static void a(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12) {
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int incrementValue$0 = 0;
        int var13 = param4;
        for (var14 = -param9; var14 < 0; var14++) {
            var15 = (param5 >> 16) * param12;
            for (var16 = -param8; var16 < 0; var16++) {
                param2 = param1[(param4 >> 16) + var15];
                if (param2 != 0) {
                    param3 = param0[param6];
                    param2 = 256 - (param2 & 255);
                    incrementValue$0 = param6;
                    param6++;
                    param0[incrementValue$0] = ((param3 & 16711935) * param2 & -16711936 | (param3 & 65280) * param2 & 16711680) >> 8;
                } else {
                    param6++;
                }
                param4 = param4 + param10;
            }
            param5 = param5 + param11;
            param4 = var13;
            param6 = param6 + param7;
        }
    }
}
