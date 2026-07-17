/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fs {
    static int field_b;
    static String field_c;
    static String[] field_a;

    public static void a(int param0) {
        field_a = null;
        field_c = null;
    }

    final static ut[] a(int param0, int param1, int param2, int param3, int param4, byte param5) {
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        ut var9 = null;
        ut var10 = null;
        ut var11 = null;
        Object var14 = null;
        int[] var15 = null;
        int[] var17 = null;
        int[] var18 = null;
        ut var19 = null;
        ut var20 = null;
        ut var21 = null;
        int[] var22 = null;
        ut var23 = null;
        ut var24 = null;
        ut var25 = null;
        int[] var26 = null;
        var26 = on.field_a;
        var22 = var26;
        var18 = var22;
        var17 = var18;
        var15 = var17;
        var6 = var15;
        var7 = on.field_g;
        var8 = on.field_f;
        var9 = new ut(param1, param0 + -(param1 * 2));
        var9.e();
        on.g(0, 0, param1, -(2 * param1) + param0, param3, param4);
        var10 = new ut(param1, param1);
        var10.e();
        on.a(0, 0, param1, param1, param3);
        var11 = new ut(16, param1);
        var11.e();
        on.a(0, 0, 16, param1, param3);
        if (param5 <= 77) {
          L0: {
            field_a = null;
            var19 = new ut(param1, param1);
            var19.e();
            on.a(0, 0, param1, param1, param4);
            var20 = new ut(16, param1);
            var20.e();
            on.a(0, 0, 16, param1, param4);
            var14 = null;
            if (param2 <= 0) {
              break L0;
            } else {
              var21 = new ut(16, 16);
              var14 = (Object) (Object) var21;
              var21.e();
              on.a(0, 0, 16, 16, param2);
              break L0;
            }
          }
          on.a(var26, var7, var8);
          return new ut[]{var10, var11, var10, var9, (ut) var14, var9, var19, var20, var19};
        } else {
          L1: {
            var23 = new ut(param1, param1);
            var23.e();
            on.a(0, 0, param1, param1, param4);
            var24 = new ut(16, param1);
            var24.e();
            on.a(0, 0, 16, param1, param4);
            var14 = null;
            if (param2 <= 0) {
              break L1;
            } else {
              var25 = new ut(16, 16);
              var14 = (Object) (Object) var25;
              var25.e();
              on.a(0, 0, 16, 16, param2);
              break L1;
            }
          }
          on.a(var26, var7, var8);
          return new ut[]{var10, var11, var10, var9, (ut) var14, var9, var23, var24, var23};
        }
    }

    final static int a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, ml param7, int param8, int param9) {
        int var10_int = 0;
        RuntimeException var10 = null;
        int var11 = 0;
        int var12 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_29_0 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_28_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        try {
          L0: {
            var10_int = 59 % ((-62 - param0) / 61);
            var10_int = param7.l(2, 59);
            if (var10_int == 0) {
              L1: {
                if (0 == param9) {
                  stackOut_28_0 = 0;
                  stackIn_29_0 = stackOut_28_0;
                  break L1;
                } else {
                  stackOut_27_0 = aq.a(param9, -30273, param7);
                  stackIn_29_0 = stackOut_27_0;
                  break L1;
                }
              }
              break L0;
            } else {
              if (var10_int == 1) {
                L2: {
                  if (param4 == 0) {
                    stackOut_21_0 = 0;
                    stackIn_22_0 = stackOut_21_0;
                    break L2;
                  } else {
                    stackOut_20_0 = aq.a(param4, -30273, param7);
                    stackIn_22_0 = stackOut_20_0;
                    break L2;
                  }
                }
                L3: {
                  var11 = stackIn_22_0;
                  var12 = param1;
                  if (var11 < 0) {
                    stackOut_24_0 = -var12 + var11;
                    stackIn_25_0 = stackOut_24_0;
                    break L3;
                  } else {
                    stackOut_23_0 = var12 + var11;
                    stackIn_25_0 = stackOut_23_0;
                    break L3;
                  }
                }
                return stackIn_25_0;
              } else {
                if (var10_int != 2) {
                  if (var10_int == 3) {
                    L4: {
                      if (0 != param8) {
                        stackOut_14_0 = aq.a(param8, -30273, param7);
                        stackIn_15_0 = stackOut_14_0;
                        break L4;
                      } else {
                        stackOut_13_0 = 0;
                        stackIn_15_0 = stackOut_13_0;
                        break L4;
                      }
                    }
                    L5: {
                      var11 = stackIn_15_0;
                      var12 = param1 + param6 + param2;
                      if (0 <= var11) {
                        stackOut_17_0 = var12 + var11;
                        stackIn_18_0 = stackOut_17_0;
                        break L5;
                      } else {
                        stackOut_16_0 = var11 + -var12;
                        stackIn_18_0 = stackOut_16_0;
                        break L5;
                      }
                    }
                    return stackIn_18_0;
                  } else {
                    throw new IllegalStateException();
                  }
                } else {
                  L6: {
                    if (0 == param3) {
                      stackOut_5_0 = 0;
                      stackIn_6_0 = stackOut_5_0;
                      break L6;
                    } else {
                      stackOut_4_0 = aq.a(param3, -30273, param7);
                      stackIn_6_0 = stackOut_4_0;
                      break L6;
                    }
                  }
                  L7: {
                    var11 = stackIn_6_0;
                    var12 = param2 + param1;
                    if (0 <= var11) {
                      stackOut_8_0 = var11 - -var12;
                      stackIn_9_0 = stackOut_8_0;
                      break L7;
                    } else {
                      stackOut_7_0 = var11 - var12;
                      stackIn_9_0 = stackOut_7_0;
                      break L7;
                    }
                  }
                  return stackIn_9_0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var10 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) var10;
            stackOut_30_1 = new StringBuilder().append("fs.B(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44).append(param6).append(44);
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param7 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L8;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L8;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + 44 + param8 + 44 + param9 + 41);
        }
        return stackIn_29_0;
    }

    final static void a(int param0, gm param1, int param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ui.g(0).a(param1, param0, true);
              if (param2 >= 103) {
                break L1;
              } else {
                field_c = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("fs.D(").append(param0).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param2 + 41);
        }
    }

    final static void a(byte param0) {
        if (param0 == -126) {
          if (up.field_p != -qt.field_l) {
            if (up.field_p == -qt.field_l + 250) {
              up.field_p = up.field_p + 1;
              return;
            } else {
              up.field_p = up.field_p + 1;
              return;
            }
          } else {
            up.field_p = up.field_p + 1;
            return;
          }
        } else {
          field_a = null;
          if (up.field_p != -qt.field_l) {
            if (up.field_p == -qt.field_l + 250) {
              up.field_p = up.field_p + 1;
              return;
            } else {
              up.field_p = up.field_p + 1;
              return;
            }
          } else {
            up.field_p = up.field_p + 1;
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Staff impersonation";
        field_b = -1;
    }
}
