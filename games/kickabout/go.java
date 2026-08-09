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
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if ((param1 ^ -1) != -3) {
              if (param1 != 1) {
                if (param2 == param1) {
                  stackIn_9_0 = -param3[param0.field_c][param0.field_i][param0.field_k] + (param3[param0.field_l][param0.field_i][param0.field_k] + -param3[param0.field_l][param0.field_d][param0.field_k]) - -param3[param0.field_c][param0.field_d][param0.field_k];
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return 0;
                }
              } else {
                stackIn_5_0 = -param3[param0.field_c][param0.field_i][param0.field_k] + (param3[param0.field_c][param0.field_i][param0.field_e] + param3[param0.field_l][param0.field_i][param0.field_k] + -param3[param0.field_l][param0.field_i][param0.field_e]);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = -param3[param0.field_c][param0.field_i][param0.field_k] + (param3[param0.field_c][param0.field_d][param0.field_k] + -param3[param0.field_c][param0.field_d][param0.field_e]) + param3[param0.field_c][param0.field_i][param0.field_e];
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var4);

            stackIn_12_1 = new StringBuilder().append("go.A(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L1;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L2;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ')');
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
        nl stackIn_4_0 = null;
        nl stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        nl stackIn_28_0 = null;
        nl stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        int stackIn_32_2 = 0;
        int stackIn_34_1 = 0;
        int stackIn_35_1 = 0;
        int stackIn_35_2 = 0;
        int stackIn_37_1 = 0;
        int stackIn_38_1 = 0;
        int stackIn_38_2 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        nl var11 = null;
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
                    stackIn_4_0 = (nl) (var11);

                    if (param3 == 0) {
                      stackIn_5_0 = (nl) ((Object) stackIn_4_0);
                      stackIn_5_1 = -1;
                      break L2;
                    } else {
                      stackIn_5_0 = (nl) ((Object) stackIn_4_0);
                      stackIn_5_1 = 1;
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
              stackIn_28_0 = (nl) (var11);

              if (var9 < param5) {
                stackIn_29_0 = (nl) ((Object) stackIn_28_0);
                stackIn_29_1 = 8;
                break L9;
              } else {
                stackIn_29_0 = (nl) ((Object) stackIn_28_0);
                stackIn_29_1 = 0;
                break L9;
              }
            }
            L10: {




              if (var9 <= param5) {
                stackIn_29_0 = (nl) ((Object) stackIn_29_0);

                stackIn_32_2 = 0;
                break L10;
              } else {
                stackIn_29_0 = (nl) ((Object) stackIn_29_0);

                stackIn_32_2 = 2;
                break L10;
              }
            }
            L11: {


              stackIn_34_1 = stackIn_29_1 | stackIn_32_2;

              if (param0 > var10) {
                stackIn_29_0 = (nl) ((Object) stackIn_29_0);
                stackIn_35_1 = stackIn_34_1;
                stackIn_35_2 = 1;
                break L11;
              } else {
                stackIn_29_0 = (nl) ((Object) stackIn_29_0);
                stackIn_35_1 = stackIn_34_1;
                stackIn_35_2 = 0;
                break L11;
              }
            }
            L12: {


              stackIn_37_1 = stackIn_35_1 | stackIn_35_2;

              if (param0 < var10) {
                stackIn_29_0 = (nl) ((Object) stackIn_29_0);
                stackIn_38_1 = stackIn_37_1;
                stackIn_38_2 = 4;
                break L12;
              } else {
                stackIn_29_0 = (nl) ((Object) stackIn_29_0);
                stackIn_38_1 = stackIn_37_1;
                stackIn_38_2 = 0;
                break L12;
              }
            }
            stackIn_29_0.field_G = stackIn_38_1 | stackIn_38_2;
            var11.field_L = 2;
            var11.field_u = 11;
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var6 = decompiledCaughtException;
            stackIn_42_0 = (RuntimeException) (var6);

            stackIn_42_1 = new StringBuilder().append("go.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_43_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "null";
              break L13;
            } else {
              stackIn_43_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "{...}";
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
