/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class d {
    static long field_a;
    static int[] field_c;
    static int[] field_e;
    boolean field_b;
    String field_f;
    String field_d;

    public static void a(boolean param0) {
        field_e = null;
        if (param0) {
            field_e = null;
        }
        field_c = null;
    }

    final static boolean a(byte param0) {
        int var1 = 0;
        int stackIn_5_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          L1: {
            var1 = 126 % ((param0 - 47) / 33);
            if (ta.field_g < 10) {
              break L1;
            } else {
              if (qg.field_d) {
                break L1;
              } else {
                if (bd.c(false)) {
                  break L1;
                } else {
                  stackOut_3_0 = 1;
                  stackIn_5_0 = stackOut_3_0;
                  break L0;
                }
              }
            }
          }
          stackOut_4_0 = 0;
          stackIn_5_0 = stackOut_4_0;
          break L0;
        }
        return stackIn_5_0 != 0;
    }

    final static void a(int param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int[] param8, int param9, int param10) {
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int stackIn_14_0 = 0;
        int stackIn_21_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        var23 = Lexicominos.field_L ? 1 : 0;
        var11 = -param0 + 256;
        if (param7 == -61498200) {
          var12 = -param3;
          L0: while (true) {
            if (-1 >= var12) {
              return;
            } else {
              var13 = -param5;
              L1: while (true) {
                if (-1 <= var13) {
                  param10 = param10 + param2;
                  param6 = param6 + param4;
                  var12++;
                  continue L0;
                } else {
                  param6++;
                  param9 = param1[param6];
                  if (param9 == 0) {
                    param10++;
                    var13++;
                    continue L1;
                  } else {
                    L2: {
                      var14 = (param9 & 16725506) >> 1501906544;
                      var15 = 255 & param9 >> -2107625976;
                      var16 = 255 & param9;
                      var17 = param8[param10];
                      var18 = 255 & var17 >> 458465488;
                      var19 = 15 & var17 >> 598648072;
                      var20 = 255 & var17;
                      if (var14 > var15) {
                        if (var16 < var14) {
                          stackOut_13_0 = var14;
                          stackIn_14_0 = stackOut_13_0;
                          break L2;
                        } else {
                          stackOut_12_0 = var16;
                          stackIn_14_0 = stackOut_12_0;
                          break L2;
                        }
                      } else {
                        if (var15 <= var16) {
                          stackOut_10_0 = var16;
                          stackIn_14_0 = stackOut_10_0;
                          break L2;
                        } else {
                          stackOut_9_0 = var15;
                          stackIn_14_0 = stackOut_9_0;
                          break L2;
                        }
                      }
                    }
                    L3: {
                      var21 = stackIn_14_0;
                      if (var18 > var19) {
                        if (var18 > var20) {
                          stackOut_20_0 = var18;
                          stackIn_21_0 = stackOut_20_0;
                          break L3;
                        } else {
                          stackOut_19_0 = var20;
                          stackIn_21_0 = stackOut_19_0;
                          break L3;
                        }
                      } else {
                        if (var19 <= var20) {
                          stackOut_17_0 = var20;
                          stackIn_21_0 = stackOut_17_0;
                          break L3;
                        } else {
                          stackOut_16_0 = var19;
                          stackIn_21_0 = stackOut_16_0;
                          break L3;
                        }
                      }
                    }
                    L4: {
                      var22 = stackIn_21_0;
                      if (var21 > var22) {
                        param9 = var22 * var15 / var21 << -61498200 | var14 * var22 / var21 << -1522203792 | var16 * var22 / var21;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    param10++;
                    param8[param10] = tb.a(vg.a(16711935, param0 * vg.a(param9, 16711935) - -(var11 * vg.a(var17, 16711935)) >> 108273096), vg.a(param0 * vg.a(65280, param9) - -(var11 * vg.a(var17, 65280)), 16711696) >> 1114217448);
                    var13++;
                    continue L1;
                  }
                }
              }
            }
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        int var1 = 0;
        int var2 = 0;
        field_c = new int[256];
        var1 = 0;
        L0: while (true) {
          if (var1 >= 256) {
          } else {
            var0 = var1;
            var2 = 0;
            L1: while (true) {
              if ((var2 ^ -1) <= -9) {
                field_c[var1] = var0;
                var1++;
                continue L0;
              } else {
                if ((var0 & 1 ^ -1) != -2) {
                  var0 = var0 >>> 1;
                  var2++;
                  continue L1;
                } else {
                  var0 = -306674912 ^ var0 >>> -301986207;
                  var2++;
                  continue L1;
                }
              }
            }
          }
        }
    }
}
