/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ew {
    static String field_b;
    static ou field_e;
    static int[] field_a;
    static je field_d;
    static String field_c;

    final static nj a(byte param0, wk param1) {
        rn discarded$1 = null;
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        nj var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
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
        String var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_22_0 = 0;
        nj stackIn_31_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_21_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        nj stackOut_30_0 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        var20 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = param1.field_y;
              var3 = param1.field_v;
              var4 = param1.field_B;
              var5 = var2_int >> -1061382942;
              var6 = var3 >> -1427048606;
              if (param0 == 107) {
                break L1;
              } else {
                var21 = (String) null;
                discarded$1 = ew.a((String) null, (byte) 84);
                break L1;
              }
            }
            var7 = new nj(var5, var6);
            var23 = var7.field_B;
            var22 = var23;
            var8 = var22;
            var9 = 0;
            L2: while (true) {
              stackOut_4_0 = var3 ^ -1;
              stackIn_5_0 = stackOut_4_0;
              L3: while (true) {
                L4: {
                  if (stackIn_5_0 >= (var9 ^ -1)) {
                    break L4;
                  } else {
                    var10 = var9 * var2_int;
                    var11 = var5 * (var9 >> 565006786);
                    var12 = 0;
                    L5: while (true) {
                      L6: {
                        if (var2_int <= var12) {
                          break L6;
                        } else {
                          var13 = 0;
                          var14 = 0;
                          var15 = 0;
                          var16 = 0;
                          var17 = 0;
                          stackOut_8_0 = 0;
                          stackIn_5_0 = stackOut_8_0;
                          stackIn_9_0 = stackOut_8_0;
                          if (var20 != 0) {
                            continue L3;
                          } else {
                            var18 = stackIn_9_0;
                            L7: while (true) {
                              stackOut_10_0 = var18;
                              stackOut_10_1 = 4;
                              stackIn_11_0 = stackOut_10_0;
                              stackIn_11_1 = stackOut_10_1;
                              L8: while (true) {
                                L9: {
                                  if (stackIn_11_0 >= stackIn_11_1) {
                                    var18 = var17 << 1889053860;
                                    stackOut_21_0 = -256;
                                    stackIn_22_0 = stackOut_21_0;
                                    break L9;
                                  } else {
                                    stackOut_12_0 = 0;
                                    stackIn_22_0 = stackOut_12_0;
                                    stackIn_13_0 = stackOut_12_0;
                                    if (var20 != 0) {
                                      break L9;
                                    } else {
                                      var19 = stackIn_13_0;
                                      L10: while (true) {
                                        L11: {
                                          if ((var19 ^ -1) <= -5) {
                                            break L11;
                                          } else {
                                            var13 = var4[var19 + var2_int * var18 + var10];
                                            stackOut_15_0 = -1;
                                            stackOut_15_1 = var13 ^ -1;
                                            stackIn_11_0 = stackOut_15_0;
                                            stackIn_11_1 = stackOut_15_1;
                                            stackIn_16_0 = stackOut_15_0;
                                            stackIn_16_1 = stackOut_15_1;
                                            if (var20 != 0) {
                                              continue L8;
                                            } else {
                                              L12: {
                                                if (stackIn_16_0 != stackIn_16_1) {
                                                  var17++;
                                                  var15 = var15 + (var13 & 255);
                                                  var16 = var16 + (65280 & var13);
                                                  var14 = var14 + (16711680 & var13);
                                                  break L12;
                                                } else {
                                                  break L12;
                                                }
                                              }
                                              var19++;
                                              if (var20 == 0) {
                                                continue L10;
                                              } else {
                                                break L11;
                                              }
                                            }
                                          }
                                        }
                                        var18++;
                                        continue L7;
                                      }
                                    }
                                  }
                                }
                                L13: {
                                  if (stackIn_22_0 <= (var18 ^ -1)) {
                                    break L13;
                                  } else {
                                    var18 = 255;
                                    break L13;
                                  }
                                }
                                L14: {
                                  L15: {
                                    if (var17 == 0) {
                                      break L15;
                                    } else {
                                      var8[var11] = oe.c(oe.c(rn.a(var14 / var17, 16711680), oe.c(var18 << 1467327832, rn.a(255, var15 / var17))), rn.a(var16 / var17, 65280));
                                      if (var20 == 0) {
                                        break L14;
                                      } else {
                                        break L15;
                                      }
                                    }
                                  }
                                  var23[var11] = 0;
                                  break L14;
                                }
                                var11++;
                                var12 += 4;
                                var10 += 4;
                                if (var20 == 0) {
                                  continue L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                        }
                      }
                      var9 += 4;
                      if (var20 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackOut_30_0 = (nj) (var7);
                stackIn_31_0 = stackOut_30_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var2 = decompiledCaughtException;
            stackOut_32_0 = (RuntimeException) (var2);
            stackOut_32_1 = new StringBuilder().append("ew.A(").append(param0).append(',');
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param1 == null) {
              stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackOut_34_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L16;
            } else {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L16;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_35_0), stackIn_35_2 + ')');
        }
        return stackIn_31_0;
    }

    abstract jm a(int param0);

    public static void a(boolean param0) {
        nj discarded$2 = null;
        wk var2 = null;
        field_c = null;
        field_b = null;
        field_a = null;
        if (param0) {
          var2 = (wk) null;
          discarded$2 = ew.a((byte) 24, (wk) null);
          field_e = null;
          field_d = null;
          return;
        } else {
          field_e = null;
          field_d = null;
          return;
        }
    }

    final static rn a(String param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        String[] var4 = null;
        String[] var5 = null;
        int var6 = 0;
        String var7 = null;
        rn var8 = null;
        int var9 = 0;
        rn stackIn_3_0 = null;
        rn stackIn_7_0 = null;
        rn stackIn_11_0 = null;
        rn stackIn_15_0 = null;
        rn stackIn_18_0 = null;
        rn stackIn_21_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        rn stackOut_6_0 = null;
        rn stackOut_10_0 = null;
        rn stackOut_14_0 = null;
        rn stackOut_17_0 = null;
        rn stackOut_20_0 = null;
        rn stackOut_2_0 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length();
            if (-1 != (var2_int ^ -1)) {
              if (var2_int > 255) {
                stackOut_6_0 = el.field_e;
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var3 = 82 / ((param1 - 50) / 49);
                var4 = dj.a(32, '.', param0);
                if (-3 < (var4.length ^ -1)) {
                  stackOut_10_0 = hv.field_N;
                  stackIn_11_0 = stackOut_10_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  var5 = var4;
                  var6 = 0;
                  L1: while (true) {
                    L2: {
                      L3: {
                        if (var5.length <= var6) {
                          break L3;
                        } else {
                          var7 = var5[var6];
                          stackOut_14_0 = sb.a(var7, (byte) -107);
                          stackIn_21_0 = stackOut_14_0;
                          stackIn_15_0 = stackOut_14_0;
                          if (var9 != 0) {
                            break L2;
                          } else {
                            var8 = stackIn_15_0;
                            if (var8 != null) {
                              stackOut_17_0 = (rn) (var8);
                              stackIn_18_0 = stackOut_17_0;
                              decompiledRegionSelector0 = 4;
                              break L0;
                            } else {
                              var6++;
                              if (var9 == 0) {
                                continue L1;
                              } else {
                                break L3;
                              }
                            }
                          }
                        }
                      }
                      stackOut_20_0 = mb.a(var4[-1 + var4.length], -19);
                      stackIn_21_0 = stackOut_20_0;
                      break L2;
                    }
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              }
            } else {
              stackOut_2_0 = hv.field_N;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (var2);
            stackOut_22_1 = new StringBuilder().append("ew.E(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L4;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L4;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_21_0;
              } else {
                return stackIn_18_0;
              }
            }
          }
        }
    }

    abstract int b(int param0, int param1);

    abstract byte[] a(int param0, int param1);

    static {
        field_b = "Start Game";
        field_a = new int[8192];
        field_c = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    }
}
