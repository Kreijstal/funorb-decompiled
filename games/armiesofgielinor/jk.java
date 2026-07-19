/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class jk {
    static me field_b;
    static String field_a;

    final static int[] a(int param0, int[] param1, int param2, int[] param3) {
        RuntimeException var4 = null;
        int[] var4_array = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        Object stackIn_11_0 = null;
        int stackIn_15_0 = 0;
        int stackIn_23_0 = 0;
        int[] stackIn_26_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_14_0 = 0;
        int stackOut_22_0 = 0;
        int[] stackOut_25_0 = null;
        Object stackOut_10_0 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var16 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (param1.length == param3.length) {
              L1: {
                if (param3.length != 0) {
                  stackOut_5_0 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L1;
                }
              }
              L2: {
                stackOut_6_0 = stackIn_6_0;
                stackIn_8_0 = stackOut_6_0;
                stackIn_7_0 = stackOut_6_0;
                if (param1.length != 0) {
                  stackOut_8_0 = stackIn_8_0;
                  stackOut_8_1 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  break L2;
                } else {
                  stackOut_7_0 = stackIn_7_0;
                  stackOut_7_1 = 1;
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  break L2;
                }
              }
              if ((stackIn_9_0 | stackIn_9_1) == 0) {
                var17 = new int[param0 * param3.length];
                var4_array = var17;
                var5 = 0;
                L3: while (true) {
                  L4: {
                    L5: {
                      if (param3.length <= var5) {
                        break L5;
                      } else {
                        var6 = 16711680 & param3[var5];
                        var7 = param3[var5] & 65280;
                        var8 = param3[var5] & 255;
                        var9 = param1[var5] & 16711680;
                        var10 = 65280 & param1[var5];
                        var11 = 255 & param1[var5];
                        stackOut_14_0 = 0;
                        stackIn_23_0 = stackOut_14_0;
                        stackIn_15_0 = stackOut_14_0;
                        if (var16 != 0) {
                          break L4;
                        } else {
                          var12 = stackIn_15_0;
                          L6: while (true) {
                            L7: {
                              if (var12 >= param0) {
                                var5++;
                                break L7;
                              } else {
                                var13 = 16711680 & (-var12 + param0) * var6 / param0 + var12 * var9 / param0;
                                var14 = 65280 & var10 * var12 / param0 + (-var12 + param0) * var7 / param0;
                                var15 = var12 * var11 / param0 - -((-var12 + param0) * var8 / param0) & 255;
                                var17[param0 * var5 + var12] = oe.c(oe.c(var15, var13), var14);
                                var12++;
                                if (var16 != 0) {
                                  break L7;
                                } else {
                                  continue L6;
                                }
                              }
                            }
                            if (var16 == 0) {
                              continue L3;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                    }
                    stackOut_22_0 = param2;
                    stackIn_23_0 = stackOut_22_0;
                    break L4;
                  }
                  L8: {
                    if (stackIn_23_0 >= 122) {
                      break L8;
                    } else {
                      field_a = (String) null;
                      break L8;
                    }
                  }
                  stackOut_25_0 = (int[]) (var17);
                  stackIn_26_0 = stackOut_25_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                stackOut_10_0 = null;
                stackIn_11_0 = stackOut_10_0;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var4 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) (var4);
            stackOut_27_1 = new StringBuilder().append("jk.B(").append(param0).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param1 == null) {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L9;
            } else {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L9;
            }
          }
          L10: {
            stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
            stackOut_30_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',').append(param2).append(',');
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param3 == null) {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L10;
            } else {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L10;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (int[]) ((Object) stackIn_11_0);
        } else {
          return stackIn_26_0;
        }
    }

    public static void a(int param0) {
        int var1 = 15 % ((48 - param0) / 35);
        field_b = null;
        field_a = null;
    }

    final static el b(int param0) {
        try {
            Throwable var1 = null;
            el stackIn_3_0 = null;
            Throwable decompiledCaughtException = null;
            el stackOut_2_0 = null;
            if (param0 > 64) {
              try {
                L0: {
                  stackOut_2_0 = (el) (Class.forName("sv").newInstance());
                  stackIn_3_0 = stackOut_2_0;
                  break L0;
                }
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var1 = decompiledCaughtException;
                return null;
              }
              return stackIn_3_0;
            } else {
              return (el) null;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_a = "Hide tutorial";
        field_b = new me(0, 2, 2, 1);
    }
}
