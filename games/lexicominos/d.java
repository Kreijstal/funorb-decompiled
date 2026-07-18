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
        RuntimeException var11 = null;
        int var11_int = 0;
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
        int stackIn_15_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        var23 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var11_int = 192;
            var12 = -param3;
            L1: while (true) {
              if (var12 >= 0) {
                break L0;
              } else {
                var13 = -param5;
                L2: while (true) {
                  if (var13 >= 0) {
                    param10 = param10 + param2;
                    param6 = param6 + param4;
                    var12++;
                    continue L1;
                  } else {
                    L3: {
                      int incrementValue$2 = param6;
                      param6++;
                      param9 = param1[incrementValue$2];
                      if (param9 == 0) {
                        param10++;
                        break L3;
                      } else {
                        L4: {
                          var14 = (param9 & 16725506) >> 16;
                          var15 = 255 & param9 >> 8;
                          var16 = 255 & param9;
                          var17 = param8[param10];
                          var18 = 255 & var17 >> 16;
                          var19 = 15 & var17 >> 8;
                          var20 = 255 & var17;
                          if (~var14 < ~var15) {
                            if (var16 < var14) {
                              stackOut_14_0 = var14;
                              stackIn_15_0 = stackOut_14_0;
                              break L4;
                            } else {
                              stackOut_13_0 = var16;
                              stackIn_15_0 = stackOut_13_0;
                              break L4;
                            }
                          } else {
                            if (~var15 >= ~var16) {
                              stackOut_11_0 = var16;
                              stackIn_15_0 = stackOut_11_0;
                              break L4;
                            } else {
                              stackOut_10_0 = var15;
                              stackIn_15_0 = stackOut_10_0;
                              break L4;
                            }
                          }
                        }
                        L5: {
                          var21 = stackIn_15_0;
                          if (var18 > var19) {
                            if (~var18 < ~var20) {
                              stackOut_21_0 = var18;
                              stackIn_22_0 = stackOut_21_0;
                              break L5;
                            } else {
                              stackOut_20_0 = var20;
                              stackIn_22_0 = stackOut_20_0;
                              break L5;
                            }
                          } else {
                            if (var19 <= var20) {
                              stackOut_18_0 = var20;
                              stackIn_22_0 = stackOut_18_0;
                              break L5;
                            } else {
                              stackOut_17_0 = var19;
                              stackIn_22_0 = stackOut_17_0;
                              break L5;
                            }
                          }
                        }
                        L6: {
                          var22 = stackIn_22_0;
                          if (var21 > var22) {
                            param9 = var22 * var15 / var21 << 8 | var14 * var22 / var21 << 16 | var16 * var22 / var21;
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        int incrementValue$3 = param10;
                        param10++;
                        param8[incrementValue$3] = tb.a(vg.a(16711935, 64 * vg.a(param9, 16711935) - -(var11_int * vg.a(var17, 16711935)) >> 8), vg.a(64 * vg.a(65280, param9) - -(var11_int * vg.a(var17, 65280)), 16711696) >> 8);
                        break L3;
                      }
                    }
                    var13++;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var11 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) var11;
            stackOut_30_1 = new StringBuilder().append("d.C(").append(64).append(',');
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param1 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L7;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L7;
            }
          }
          L8: {
            stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
            stackOut_33_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_33_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(-61498200).append(',');
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param8 == null) {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L8;
            } else {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L8;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_36_0, stackIn_36_2 + ',' + param9 + ',' + param10 + ')');
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
            return;
          } else {
            var0 = var1;
            var2 = 0;
            L1: while (true) {
              if (var2 >= 8) {
                field_c[var1] = var0;
                var1++;
                continue L0;
              } else {
                if ((var0 & 1) != 1) {
                  var0 = var0 >>> 1;
                  var2++;
                  continue L1;
                } else {
                  var0 = -306674912 ^ var0 >>> 1;
                  var2++;
                  continue L1;
                }
              }
            }
          }
        }
    }
}
