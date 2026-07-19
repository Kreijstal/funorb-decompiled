/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class go {
    static String field_a;
    static int field_b;

    final static int a(ea param0, int param1, int param2, int[][][] param3) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            if ((param1 ^ -1) != -3) {
              if (param1 != 1) {
                if (param2 == param1) {
                  stackOut_8_0 = -param3[param0.field_c][param0.field_i][param0.field_k] + (param3[param0.field_l][param0.field_i][param0.field_k] + -param3[param0.field_l][param0.field_d][param0.field_k]) - -param3[param0.field_c][param0.field_d][param0.field_k];
                  stackIn_9_0 = stackOut_8_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return 0;
                }
              } else {
                stackOut_4_0 = -param3[param0.field_c][param0.field_i][param0.field_k] + (param3[param0.field_c][param0.field_i][param0.field_e] + param3[param0.field_l][param0.field_i][param0.field_k] + -param3[param0.field_l][param0.field_i][param0.field_e]);
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_1_0 = -param3[param0.field_c][param0.field_i][param0.field_k] + (param3[param0.field_c][param0.field_d][param0.field_k] + -param3[param0.field_c][param0.field_d][param0.field_e]) + param3[param0.field_c][param0.field_i][param0.field_e];
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var4);
            stackOut_10_1 = new StringBuilder().append("go.A(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L1;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L1;
            }
          }
          L2: {
            stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L2;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L2;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_9_0;
          }
        }
    }

    public static void a(int param0) {
        int var1 = -108 / ((-5 - param0) / 34);
        field_a = null;
    }

    final static int a(int param0, byte param1) {
        if (param1 != -56) {
          return 123;
        } else {
          return ((int)((-fw.field_G + (-jr.field_Gb + (double)param0)) * (double)hw.field_i) >> 928134504) + 240;
        }
    }

    final static void a(int param0, nu param1, int param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        nl var11 = null;
        nl stackIn_3_0 = null;
        nl stackIn_4_0 = null;
        nl stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        nl stackIn_27_0 = null;
        nl stackIn_28_0 = null;
        nl stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        nl stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        nl stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        nl stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        int stackIn_32_2 = 0;
        nl stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        nl stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        nl stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        int stackIn_35_2 = 0;
        nl stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        nl stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        nl stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        int stackIn_38_2 = 0;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        nl stackOut_2_0 = null;
        nl stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        nl stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        nl stackOut_26_0 = null;
        nl stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        nl stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        nl stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        nl stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        int stackOut_31_2 = 0;
        nl stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        int stackOut_30_2 = 0;
        nl stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        nl stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        int stackOut_34_2 = 0;
        nl stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        int stackOut_33_2 = 0;
        nl stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        nl stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        int stackOut_37_2 = 0;
        nl stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        int stackOut_36_2 = 0;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        try {
          L0: {
            L1: {
              var11 = param1.field_P[param3][param4];
              var7 = param5 << -761396944;
              var8 = param0 << -1920800112;
              if (var11.field_M != var7) {
                break L1;
              } else {
                if (var8 != var11.field_w) {
                  break L1;
                } else {
                  L2: {
                    stackOut_2_0 = (nl) (var11);
                    stackIn_4_0 = stackOut_2_0;
                    stackIn_3_0 = stackOut_2_0;
                    if (param3 == 0) {
                      stackOut_4_0 = (nl) ((Object) stackIn_4_0);
                      stackOut_4_1 = -1;
                      stackIn_5_0 = stackOut_4_0;
                      stackIn_5_1 = stackOut_4_1;
                      break L2;
                    } else {
                      stackOut_3_0 = (nl) ((Object) stackIn_3_0);
                      stackOut_3_1 = 1;
                      stackIn_5_0 = stackOut_3_0;
                      stackIn_5_1 = stackOut_3_1;
                      break L2;
                    }
                  }
                  L3: {
                    stackIn_5_0.field_n = stackIn_5_1;
                    var11.field_j = 0;
                    if (var11.field_u == 0) {
                      break L3;
                    } else {
                      var11.a((byte) -31, 0);
                      break L3;
                    }
                  }
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            L4: {
              if (var11.field_u != 11) {
                break L4;
              } else {
                L5: {
                  if (-1 == (8 & var11.field_G ^ -1)) {
                    break L5;
                  } else {
                    if (var11.field_M <= var7) {
                      break L5;
                    } else {
                      var11.field_M = var7;
                      break L5;
                    }
                  }
                }
                L6: {
                  if (0 == (2 & var11.field_G)) {
                    break L6;
                  } else {
                    if (var7 > var11.field_M) {
                      var11.field_M = var7;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                }
                L7: {
                  if ((var11.field_G & 4) == 0) {
                    break L7;
                  } else {
                    if (var11.field_w < var8) {
                      var11.field_w = var8;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                }
                if ((var11.field_G & 1) == 0) {
                  break L4;
                } else {
                  if (var11.field_w > var8) {
                    var11.field_w = var8;
                    break L4;
                  } else {
                    break L4;
                  }
                }
              }
            }
            L8: {
              var9 = var11.f(param2 ^ -119);
              if (param2 == 0) {
                break L8;
              } else {
                go.a(-38);
                break L8;
              }
            }
            L9: {
              var10 = var11.a(true);
              stackOut_26_0 = (nl) (var11);
              stackIn_28_0 = stackOut_26_0;
              stackIn_27_0 = stackOut_26_0;
              if (var9 < param5) {
                stackOut_28_0 = (nl) ((Object) stackIn_28_0);
                stackOut_28_1 = 8;
                stackIn_29_0 = stackOut_28_0;
                stackIn_29_1 = stackOut_28_1;
                break L9;
              } else {
                stackOut_27_0 = (nl) ((Object) stackIn_27_0);
                stackOut_27_1 = 0;
                stackIn_29_0 = stackOut_27_0;
                stackIn_29_1 = stackOut_27_1;
                break L9;
              }
            }
            L10: {
              stackOut_29_0 = (nl) ((Object) stackIn_29_0);
              stackOut_29_1 = stackIn_29_1;
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              if (var9 <= param5) {
                stackOut_31_0 = (nl) ((Object) stackIn_31_0);
                stackOut_31_1 = stackIn_31_1;
                stackOut_31_2 = 0;
                stackIn_32_0 = stackOut_31_0;
                stackIn_32_1 = stackOut_31_1;
                stackIn_32_2 = stackOut_31_2;
                break L10;
              } else {
                stackOut_30_0 = (nl) ((Object) stackIn_30_0);
                stackOut_30_1 = stackIn_30_1;
                stackOut_30_2 = 2;
                stackIn_32_0 = stackOut_30_0;
                stackIn_32_1 = stackOut_30_1;
                stackIn_32_2 = stackOut_30_2;
                break L10;
              }
            }
            L11: {
              stackOut_32_0 = (nl) ((Object) stackIn_32_0);
              stackOut_32_1 = stackIn_32_1 | stackIn_32_2;
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              if (param0 > var10) {
                stackOut_34_0 = (nl) ((Object) stackIn_34_0);
                stackOut_34_1 = stackIn_34_1;
                stackOut_34_2 = 1;
                stackIn_35_0 = stackOut_34_0;
                stackIn_35_1 = stackOut_34_1;
                stackIn_35_2 = stackOut_34_2;
                break L11;
              } else {
                stackOut_33_0 = (nl) ((Object) stackIn_33_0);
                stackOut_33_1 = stackIn_33_1;
                stackOut_33_2 = 0;
                stackIn_35_0 = stackOut_33_0;
                stackIn_35_1 = stackOut_33_1;
                stackIn_35_2 = stackOut_33_2;
                break L11;
              }
            }
            L12: {
              stackOut_35_0 = (nl) ((Object) stackIn_35_0);
              stackOut_35_1 = stackIn_35_1 | stackIn_35_2;
              stackIn_37_0 = stackOut_35_0;
              stackIn_37_1 = stackOut_35_1;
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              if (param0 < var10) {
                stackOut_37_0 = (nl) ((Object) stackIn_37_0);
                stackOut_37_1 = stackIn_37_1;
                stackOut_37_2 = 4;
                stackIn_38_0 = stackOut_37_0;
                stackIn_38_1 = stackOut_37_1;
                stackIn_38_2 = stackOut_37_2;
                break L12;
              } else {
                stackOut_36_0 = (nl) ((Object) stackIn_36_0);
                stackOut_36_1 = stackIn_36_1;
                stackOut_36_2 = 0;
                stackIn_38_0 = stackOut_36_0;
                stackIn_38_1 = stackOut_36_1;
                stackIn_38_2 = stackOut_36_2;
                break L12;
              }
            }
            stackIn_38_0.field_G = stackIn_38_1 | stackIn_38_2;
            var11.field_L = 2;
            var11.field_u = 11;
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var6 = decompiledCaughtException;
            stackOut_40_0 = (RuntimeException) (var6);
            stackOut_40_1 = new StringBuilder().append("go.D(").append(param0).append(',');
            stackIn_42_0 = stackOut_40_0;
            stackIn_42_1 = stackOut_40_1;
            stackIn_41_0 = stackOut_40_0;
            stackIn_41_1 = stackOut_40_1;
            if (param1 == null) {
              stackOut_42_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackOut_42_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackOut_42_2 = "null";
              stackIn_43_0 = stackOut_42_0;
              stackIn_43_1 = stackOut_42_1;
              stackIn_43_2 = stackOut_42_2;
              break L13;
            } else {
              stackOut_41_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackOut_41_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackOut_41_2 = "{...}";
              stackIn_43_0 = stackOut_41_0;
              stackIn_43_1 = stackOut_41_1;
              stackIn_43_2 = stackOut_41_2;
              break L13;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_43_0), stackIn_43_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_a = "You have withdrawn your request to join.";
        field_b = 0;
    }
}
