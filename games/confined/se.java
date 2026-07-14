/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class se {
    static bi field_a;

    final static void a(int param0) {
        int var4 = Confined.field_J ? 1 : 0;
        int[] var5 = bd.field_g;
        int[] var1 = var5;
        int var2 = param0;
        int var3 = var5.length;
        while (var3 > var2) {
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
        }
    }

    final static void a(vg param0, boolean param1, double[] param2, boolean param3, double param4, double param5, dj param6) {
        double var9 = 0.0;
        double var11 = 0.0;
        double var13 = 0.0;
        double var15 = 0.0;
        int var17 = 0;
        double var18 = 0.0;
        double var20 = 0.0;
        double var22 = 0.0;
        double var24 = 0.0;
        double var26 = 0.0;
        double var28 = 0.0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        int stackIn_9_3 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        int stackIn_10_3 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        int stackIn_11_3 = 0;
        int[] stackIn_11_4 = null;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        int stackIn_20_2 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int stackIn_21_2 = 0;
        int stackIn_21_3 = 0;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        int stackIn_22_2 = 0;
        int stackIn_22_3 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int stackIn_23_2 = 0;
        int stackIn_23_3 = 0;
        int[] stackIn_23_4 = null;
        int stackOut_17_0 = 0;
        int stackOut_17_1 = 0;
        int stackOut_19_0 = 0;
        int stackOut_19_1 = 0;
        int stackOut_19_2 = 0;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        int stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
        int stackOut_20_2 = 0;
        int stackOut_20_3 = 0;
        int stackOut_22_0 = 0;
        int stackOut_22_1 = 0;
        int stackOut_22_2 = 0;
        int stackOut_22_3 = 0;
        int[] stackOut_22_4 = null;
        int stackOut_21_0 = 0;
        int stackOut_21_1 = 0;
        int stackOut_21_2 = 0;
        int stackOut_21_3 = 0;
        int[] stackOut_21_4 = null;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        int stackOut_8_3 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        int stackOut_10_3 = 0;
        int[] stackOut_10_4 = null;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        int stackOut_9_3 = 0;
        int[] stackOut_9_4 = null;
        var9 = param6.field_E + param2[9] * param6.field_C;
        var11 = param6.field_t + param6.field_C * param2[10];
        if (param1) {
          L0: {
            field_a = null;
            var13 = param6.field_D + param2[11] * param6.field_C;
            var15 = param4 * 1.0;
            var17 = (int)(32768.0 * var15);
            var18 = var9 - param0.field_T;
            var20 = -param0.field_L + var11;
            var22 = var13 - param0.field_O;
            var24 = var20 * param0.field_ab + param0.field_R * var18 + var22 * param0.field_M;
            var26 = param0.field_F * var22 + (param0.field_U * var20 + param0.field_V * var18);
            var28 = var20 * param0.field_H + var18 * param0.field_P + var22 * param0.field_N;
            if (var28 < 0.15) {
              break L0;
            } else {
              L1: {
                var30 = 5120 - -(int)(var24 / var28 * 10240.0);
                var31 = 3008 - -(int)(10240.0 * (var26 / var28));
                var17 = (int)qn.field_v.a((double)var17 * (-(var22 / param5) + 1.0), 0, var13);
                var32 = (int)(0.2 / var28 * 10240.0);
                var33 = var17 >> 533934218;
                if (127 < var33) {
                  var33 = 127;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                stackOut_17_0 = var30;
                stackOut_17_1 = var31;
                stackIn_19_0 = stackOut_17_0;
                stackIn_19_1 = stackOut_17_1;
                stackIn_18_0 = stackOut_17_0;
                stackIn_18_1 = stackOut_17_1;
                if (var32 <= 4100) {
                  stackOut_19_0 = stackIn_19_0;
                  stackOut_19_1 = stackIn_19_1;
                  stackOut_19_2 = var32;
                  stackIn_20_0 = stackOut_19_0;
                  stackIn_20_1 = stackOut_19_1;
                  stackIn_20_2 = stackOut_19_2;
                  break L2;
                } else {
                  stackOut_18_0 = stackIn_18_0;
                  stackOut_18_1 = stackIn_18_1;
                  stackOut_18_2 = 4100;
                  stackIn_20_0 = stackOut_18_0;
                  stackIn_20_1 = stackOut_18_1;
                  stackIn_20_2 = stackOut_18_2;
                  break L2;
                }
              }
              L3: {
                stackOut_20_0 = stackIn_20_0;
                stackOut_20_1 = stackIn_20_1;
                stackOut_20_2 = stackIn_20_2;
                stackOut_20_3 = var33;
                stackIn_22_0 = stackOut_20_0;
                stackIn_22_1 = stackOut_20_1;
                stackIn_22_2 = stackOut_20_2;
                stackIn_22_3 = stackOut_20_3;
                stackIn_21_0 = stackOut_20_0;
                stackIn_21_1 = stackOut_20_1;
                stackIn_21_2 = stackOut_20_2;
                stackIn_21_3 = stackOut_20_3;
                if (!param3) {
                  stackOut_22_0 = stackIn_22_0;
                  stackOut_22_1 = stackIn_22_1;
                  stackOut_22_2 = stackIn_22_2;
                  stackOut_22_3 = stackIn_22_3;
                  stackOut_22_4 = mm.field_cb;
                  stackIn_23_0 = stackOut_22_0;
                  stackIn_23_1 = stackOut_22_1;
                  stackIn_23_2 = stackOut_22_2;
                  stackIn_23_3 = stackOut_22_3;
                  stackIn_23_4 = stackOut_22_4;
                  break L3;
                } else {
                  stackOut_21_0 = stackIn_21_0;
                  stackOut_21_1 = stackIn_21_1;
                  stackOut_21_2 = stackIn_21_2;
                  stackOut_21_3 = stackIn_21_3;
                  stackOut_21_4 = mm.field_gb;
                  stackIn_23_0 = stackOut_21_0;
                  stackIn_23_1 = stackOut_21_1;
                  stackIn_23_2 = stackOut_21_2;
                  stackIn_23_3 = stackOut_21_3;
                  stackIn_23_4 = stackOut_21_4;
                  break L3;
                }
              }
              fn.a(stackIn_23_0, stackIn_23_1, stackIn_23_2, stackIn_23_3, stackIn_23_4);
              break L0;
            }
          }
          return;
        } else {
          L4: {
            var13 = param6.field_D + param2[11] * param6.field_C;
            var15 = param4 * 1.0;
            var17 = (int)(32768.0 * var15);
            var18 = var9 - param0.field_T;
            var20 = -param0.field_L + var11;
            var22 = var13 - param0.field_O;
            var24 = var20 * param0.field_ab + param0.field_R * var18 + var22 * param0.field_M;
            var26 = param0.field_F * var22 + (param0.field_U * var20 + param0.field_V * var18);
            var28 = var20 * param0.field_H + var18 * param0.field_P + var22 * param0.field_N;
            if (var28 < 0.15) {
              break L4;
            } else {
              L5: {
                var30 = 5120 - -(int)(var24 / var28 * 10240.0);
                var31 = 3008 - -(int)(10240.0 * (var26 / var28));
                var17 = (int)qn.field_v.a((double)var17 * (-(var22 / param5) + 1.0), 0, var13);
                var32 = (int)(0.2 / var28 * 10240.0);
                var33 = var17 >> 533934218;
                if (127 < var33) {
                  var33 = 127;
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                stackOut_5_0 = var30;
                stackOut_5_1 = var31;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                if (var32 <= 4100) {
                  stackOut_7_0 = stackIn_7_0;
                  stackOut_7_1 = stackIn_7_1;
                  stackOut_7_2 = var32;
                  stackIn_8_0 = stackOut_7_0;
                  stackIn_8_1 = stackOut_7_1;
                  stackIn_8_2 = stackOut_7_2;
                  break L6;
                } else {
                  stackOut_6_0 = stackIn_6_0;
                  stackOut_6_1 = stackIn_6_1;
                  stackOut_6_2 = 4100;
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_8_1 = stackOut_6_1;
                  stackIn_8_2 = stackOut_6_2;
                  break L6;
                }
              }
              L7: {
                stackOut_8_0 = stackIn_8_0;
                stackOut_8_1 = stackIn_8_1;
                stackOut_8_2 = stackIn_8_2;
                stackOut_8_3 = var33;
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                stackIn_10_2 = stackOut_8_2;
                stackIn_10_3 = stackOut_8_3;
                stackIn_9_0 = stackOut_8_0;
                stackIn_9_1 = stackOut_8_1;
                stackIn_9_2 = stackOut_8_2;
                stackIn_9_3 = stackOut_8_3;
                if (!param3) {
                  stackOut_10_0 = stackIn_10_0;
                  stackOut_10_1 = stackIn_10_1;
                  stackOut_10_2 = stackIn_10_2;
                  stackOut_10_3 = stackIn_10_3;
                  stackOut_10_4 = mm.field_cb;
                  stackIn_11_0 = stackOut_10_0;
                  stackIn_11_1 = stackOut_10_1;
                  stackIn_11_2 = stackOut_10_2;
                  stackIn_11_3 = stackOut_10_3;
                  stackIn_11_4 = stackOut_10_4;
                  break L7;
                } else {
                  stackOut_9_0 = stackIn_9_0;
                  stackOut_9_1 = stackIn_9_1;
                  stackOut_9_2 = stackIn_9_2;
                  stackOut_9_3 = stackIn_9_3;
                  stackOut_9_4 = mm.field_gb;
                  stackIn_11_0 = stackOut_9_0;
                  stackIn_11_1 = stackOut_9_1;
                  stackIn_11_2 = stackOut_9_2;
                  stackIn_11_3 = stackOut_9_3;
                  stackIn_11_4 = stackOut_9_4;
                  break L7;
                }
              }
              fn.a(stackIn_11_0, stackIn_11_1, stackIn_11_2, stackIn_11_3, stackIn_11_4);
              break L4;
            }
          }
          return;
        }
    }

    public static void a(byte param0) {
        if (param0 >= -113) {
            field_a = null;
            field_a = null;
            return;
        }
        field_a = null;
    }

    static {
    }
}
