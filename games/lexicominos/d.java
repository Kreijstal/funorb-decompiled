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
            field_e = (int[]) null;
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
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
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
        int stackIn_9_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_32_0 = 0;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_31_0 = 0;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        var23 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var11_int = -param0 + 256;
            if (param7 == -61498200) {
              var12 = -param3;
              L1: while (true) {
                L2: {
                  if (-1 >= (var12 ^ -1)) {
                    break L2;
                  } else {
                    if (var23 != 0) {
                      break L2;
                    } else {
                      var13 = -param5;
                      L3: while (true) {
                        L4: {
                          L5: {
                            if (-1 >= (var13 ^ -1)) {
                              break L5;
                            } else {
                              incrementValue$2 = param6;
                              param6++;
                              param9 = param1[incrementValue$2];
                              stackOut_8_0 = param9;
                              stackIn_32_0 = stackOut_8_0;
                              stackIn_9_0 = stackOut_8_0;
                              if (var23 != 0) {
                                break L4;
                              } else {
                                L6: {
                                  if (stackIn_9_0 != 0) {
                                    L7: {
                                      var14 = (param9 & 16725506) >> 1501906544;
                                      var15 = 255 & param9 >> -2107625976;
                                      var16 = 255 & param9;
                                      var17 = param8[param10];
                                      var18 = 255 & var17 >> 458465488;
                                      var19 = 15 & var17 >> 598648072;
                                      var20 = 255 & var17;
                                      if (var14 > var15) {
                                        if (var16 < var14) {
                                          stackOut_17_0 = var14;
                                          stackIn_18_0 = stackOut_17_0;
                                          break L7;
                                        } else {
                                          stackOut_16_0 = var16;
                                          stackIn_18_0 = stackOut_16_0;
                                          break L7;
                                        }
                                      } else {
                                        if (var15 <= var16) {
                                          stackOut_14_0 = var16;
                                          stackIn_18_0 = stackOut_14_0;
                                          break L7;
                                        } else {
                                          stackOut_13_0 = var15;
                                          stackIn_18_0 = stackOut_13_0;
                                          break L7;
                                        }
                                      }
                                    }
                                    L8: {
                                      var21 = stackIn_18_0;
                                      if (var18 > var19) {
                                        if (var18 > var20) {
                                          stackOut_24_0 = var18;
                                          stackIn_25_0 = stackOut_24_0;
                                          break L8;
                                        } else {
                                          stackOut_23_0 = var20;
                                          stackIn_25_0 = stackOut_23_0;
                                          break L8;
                                        }
                                      } else {
                                        if (var19 <= var20) {
                                          stackOut_21_0 = var20;
                                          stackIn_25_0 = stackOut_21_0;
                                          break L8;
                                        } else {
                                          stackOut_20_0 = var19;
                                          stackIn_25_0 = stackOut_20_0;
                                          break L8;
                                        }
                                      }
                                    }
                                    L9: {
                                      var22 = stackIn_25_0;
                                      if (var21 > var22) {
                                        param9 = var22 * var15 / var21 << -61498200 | var14 * var22 / var21 << -1522203792 | var16 * var22 / var21;
                                        break L9;
                                      } else {
                                        break L9;
                                      }
                                    }
                                    incrementValue$3 = param10;
                                    param10++;
                                    param8[incrementValue$3] = tb.a(vg.a(16711935, param0 * vg.a(param9, 16711935) - -(var11_int * vg.a(var17, 16711935)) >> 108273096), vg.a(param0 * vg.a(65280, param9) - -(var11_int * vg.a(var17, 65280)), 16711696) >> 1114217448);
                                    if (var23 == 0) {
                                      break L6;
                                    } else {
                                      param10++;
                                      break L6;
                                    }
                                  } else {
                                    param10++;
                                    break L6;
                                  }
                                }
                                var13++;
                                if (var23 == 0) {
                                  continue L3;
                                } else {
                                  break L5;
                                }
                              }
                            }
                          }
                          param10 = param10 + param2;
                          stackOut_31_0 = param6 + param4;
                          stackIn_32_0 = stackOut_31_0;
                          break L4;
                        }
                        param6 = stackIn_32_0;
                        var12++;
                        if (var23 == 0) {
                          continue L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var11 = decompiledCaughtException;
            stackOut_34_0 = (RuntimeException) (var11);
            stackOut_34_1 = new StringBuilder().append("d.C(").append(param0).append(',');
            stackIn_36_0 = stackOut_34_0;
            stackIn_36_1 = stackOut_34_1;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            if (param1 == null) {
              stackOut_36_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackOut_36_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L10;
            } else {
              stackOut_35_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackOut_35_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackOut_35_2 = "{...}";
              stackIn_37_0 = stackOut_35_0;
              stackIn_37_1 = stackOut_35_1;
              stackIn_37_2 = stackOut_35_2;
              break L10;
            }
          }
          L11: {
            stackOut_37_0 = (RuntimeException) ((Object) stackIn_37_0);
            stackOut_37_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_37_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
            stackIn_39_0 = stackOut_37_0;
            stackIn_39_1 = stackOut_37_1;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            if (param8 == null) {
              stackOut_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackOut_39_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L11;
            } else {
              stackOut_38_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackOut_38_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackOut_38_2 = "{...}";
              stackIn_40_0 = stackOut_38_0;
              stackIn_40_1 = stackOut_38_1;
              stackIn_40_2 = stackOut_38_2;
              break L11;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_40_0), stackIn_40_2 + ',' + param9 + ',' + param10 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        $cfr$clinit: {
            int var0 = 0;
            int var1 = 0;
            int var2 = 0;
            field_c = new int[256];
            var1 = 0;
            L0: while (true) {
              if (var1 >= 256) {
                break $cfr$clinit;
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
}
