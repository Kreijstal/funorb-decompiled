/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uj {
    static ie field_e;
    static di field_d;
    static dd field_c;
    static String field_b;
    static int[] field_a;

    public static void a(byte param0) {
        field_e = null;
        field_d = null;
        field_a = null;
        field_b = null;
        if (param0 <= 13) {
          uj.a((byte) 78);
          field_c = null;
          return;
        } else {
          field_c = null;
          return;
        }
    }

    final static void a(uf param0, ij param1, int[] param2, int[] param3, int param4) {
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        var12 = Pool.field_O;
        var17 = param0.field_ab;
        var16 = var17;
        var15 = var16;
        var14 = var15;
        var13 = var14;
        var5 = var13;
        var6 = -var17[0] + param3[0];
        var7 = param3[param4] + -var17[1];
        var8 = -var17[2] + param3[2];
        var9 = var8 * var17[11] + var17[9] * var6 - -(var17[10] * var7) >> 611129072;
        if (0 < var9) {
          param2[1] = var17[8] * var8 + (var6 * var17[6] - -(var17[7] * var7)) >> 480041575;
          param2[0] = var7 * var17[4] + (var6 * var17[3] - -(var17[5] * var8)) >> 1859211783;
          param2[1] = fb.field_d + param2[1] / var9;
          param2[0] = fb.field_q - -(param2[0] / var9);
          var10 = param1.field_K.field_A >> -1445386975;
          param2[1] = param2[1] - var10;
          var11 = param1.field_K.field_z >> 2029755937;
          if (-var11 + qh.field_l < param2[0]) {
            param2[0] = qh.field_l + -var11;
            if (-var10 + qh.field_f >= param2[1]) {
              if (param2[1] < var10) {
                param2[1] = var10;
                return;
              } else {
                param2[1] = param2[1];
                return;
              }
            } else {
              param2[1] = qh.field_f - var10;
              return;
            }
          } else {
            if (var11 <= param2[0]) {
              if (-var10 + qh.field_f >= param2[1]) {
                if (param2[1] < var10) {
                  param2[1] = var10;
                  return;
                } else {
                  param2[1] = param2[1];
                  return;
                }
              } else {
                param2[1] = qh.field_f - var10;
                return;
              }
            } else {
              param2[0] = var11;
              if (-var10 + qh.field_f >= param2[1]) {
                if (param2[1] < var10) {
                  param2[1] = var10;
                  return;
                } else {
                  param2[1] = param2[1];
                  return;
                }
              } else {
                param2[1] = qh.field_f - var10;
                return;
              }
            }
          }
        } else {
          param2[1] = qh.field_f >> 1511770785;
          param2[0] = qh.field_l >> 189950177;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new ie();
        field_b = "Rankings";
        field_a = new int[]{0, 1, 3, 9, 10, 8, 7, 5, 15, 2, 12, 14, 4, 13, 11, 6};
    }
}
