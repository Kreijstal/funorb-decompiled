/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class iha {
    private static int field_f;
    private static int field_g;
    private static int field_d;
    private static int field_i;
    private static int field_a;
    private static int field_h;
    private static int field_e;
    private static int field_c;
    private static int[] field_b;

    private final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13) {
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        L0: while (true) {
          if (param11 >= 0) {
            return;
          } else {
            field_a = field_g;
            field_f = field_c;
            var14 = param12;
            L1: while (true) {
              if (var14 >= 0) {
                param7 = param7 + param13;
                param11++;
                field_h = field_h + param9;
                field_i = field_i + param10;
                continue L0;
              } else {
                L2: {
                  param1 = field_f - field_h >> 16;
                  if (param1 >= -param2) {
                    if (param1 <= param2) {
                      param0 = field_a + field_i >> 16;
                      if (param0 >= -param2) {
                        if (param0 <= param5 + param2) {
                          L3: {
                            if (param0 >= param2) {
                              if (param0 <= param5 - param2) {
                                stackOut_15_0 = param8;
                                stackIn_16_0 = stackOut_15_0;
                                break L3;
                              } else {
                                stackOut_14_0 = (param5 + param2 - param0) * field_d >> 8;
                                stackIn_16_0 = stackOut_14_0;
                                break L3;
                              }
                            } else {
                              stackOut_12_0 = (param0 + param2) * field_d >> 8;
                              stackIn_16_0 = stackOut_12_0;
                              break L3;
                            }
                          }
                          L4: {
                            param3 = stackIn_16_0;
                            param4 = param1 * param3 * field_e >> 8;
                            if (param4 < 0) {
                              stackOut_18_0 = field_b[param3 + param4];
                              stackIn_19_0 = stackOut_18_0;
                              break L4;
                            } else {
                              stackOut_17_0 = field_b[param3 - param4];
                              stackIn_19_0 = stackOut_17_0;
                              break L4;
                            }
                          }
                          param1 = stackIn_19_0;
                          var15 = param1;
                          var16 = param6[param7];
                          var17 = 256 - (var15 & 255);
                          param6[param7] = (var16 & 16711935) * var17 >> 8 & 16711935 | (var16 & 65280) * var17 >> 8 & 65280;
                          break L2;
                        } else {
                          break L2;
                        }
                      } else {
                        break L2;
                      }
                    } else {
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
                var14++;
                param7++;
                field_a = field_a + param9;
                field_f = field_f + param10;
                continue L1;
              }
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        L0: {
          var7 = param2 - param0;
          var8 = param3 - param1;
          var9 = (int)Math.sqrt((double)(var7 * var7 + var8 * var8));
          var10 = (int)(65536.0 / Math.sqrt((double)(var7 * var7 + var8 * var8)));
          var7 = var7 * var10;
          var8 = var8 * var10;
          var11 = param0;
          var12 = param1;
          var13 = param2;
          var14 = param3;
          if (var11 <= var13) {
            break L0;
          } else {
            var15 = var11;
            var11 = var13;
            var13 = var15;
            break L0;
          }
        }
        L1: {
          if (var12 <= var14) {
            break L1;
          } else {
            var15 = var12;
            var12 = var14;
            var14 = var15;
            break L1;
          }
        }
        L2: {
          var11 = var11 - param4;
          var12 = var12 - param4;
          var13 = var13 + param4;
          var14 = var14 + param4;
          if (var11 >= bea.field_b) {
            break L2;
          } else {
            var11 = bea.field_b;
            break L2;
          }
        }
        L3: {
          if (var12 >= bea.field_h) {
            break L3;
          } else {
            var12 = bea.field_h;
            break L3;
          }
        }
        L4: {
          if (var13 <= bea.field_d) {
            break L4;
          } else {
            var13 = bea.field_d;
            break L4;
          }
        }
        L5: {
          if (var14 <= bea.field_k) {
            break L5;
          } else {
            var14 = bea.field_k;
            break L5;
          }
        }
        field_e = 256 / param4;
        field_d = param5 * 128 / param4;
        field_h = (var12 - param1) * var7;
        field_i = (var12 - param1) * var8;
        field_g = (var11 - param0) * var7;
        field_c = (var11 - param0) * var8;
        field_b = param6;
        iha.a(param0, param1, param4, 0, 0, var9, bea.field_l, var12 * bea.field_g + var11, param5, var7, var8, var12 - var14, var11 - var13, bea.field_g - (var13 - var11));
    }

    public static void a() {
        field_b = null;
    }
}
