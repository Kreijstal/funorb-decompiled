/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class md extends sk {
    static long field_y;
    byte[] field_u;
    int field_w;
    static int[] field_t;
    static od[] field_s;
    static String field_v;
    bi field_x;

    final static boolean a(byte param0, dl param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param0 == -124) {
              stackOut_3_0 = param1.b((byte) -117);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var2);
            stackOut_5_1 = new StringBuilder().append("md.E(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0;
        }
    }

    final byte[] f(int param0) {
        if (this.field_m) {
            throw new RuntimeException();
        }
        if (param0 != 0) {
            field_v = (String) null;
        }
        return this.field_u;
    }

    public static void i(int param0) {
        field_s = null;
        field_v = null;
        int var1 = 60 / ((-82 - param0) / 32);
        field_t = null;
    }

    final static o[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9 = 0;
        o[] var10 = null;
        o[] var11_ref_o__ = null;
        int var11 = 0;
        int var12 = 0;
        o var13 = null;
        int var14 = 0;
        int var15 = 0;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_27_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_62_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        int stackOut_31_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_28_1 = 0;
        int stackOut_42_0 = 0;
        int stackOut_34_0 = 0;
        var15 = SolKnight.field_L ? 1 : 0;
        var9 = param4 + (param6 + param8);
        var10 = new o[]{new o(var9, var9), new o(param7, var9), new o(var9, var9), new o(var9, param7), new o(64, 64), new o(var9, param7), new o(var9, var9), new o(param7, var9), new o(var9, var9)};
        var11_ref_o__ = var10;
        var12 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if (var11_ref_o__.length <= var12) {
                break L2;
              } else {
                var13 = var11_ref_o__[var12];
                stackOut_2_0 = 0;
                stackIn_11_0 = stackOut_2_0;
                stackIn_3_0 = stackOut_2_0;
                if (var15 != 0) {
                  break L1;
                } else {
                  var14 = stackIn_3_0;
                  L3: while (true) {
                    L4: {
                      L5: {
                        if (var13.field_v.length <= var14) {
                          break L5;
                        } else {
                          var13.field_v[var14] = param3;
                          var14++;
                          if (var15 != 0) {
                            break L4;
                          } else {
                            if (var15 == 0) {
                              continue L3;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      var12++;
                      break L4;
                    }
                    if (var15 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
            stackOut_10_0 = 0;
            stackIn_11_0 = stackOut_10_0;
            break L1;
          }
          var11 = stackIn_11_0;
          if (param5 == -1) {
            L6: while (true) {
              L7: {
                if (var11 >= param8) {
                  stackOut_22_0 = 0;
                  stackIn_23_0 = stackOut_22_0;
                  break L7;
                } else {
                  stackOut_61_0 = 0;
                  stackIn_23_0 = stackOut_61_0;
                  stackIn_62_0 = stackOut_61_0;
                  if (var15 != 0) {
                    break L7;
                  } else {
                    stackOut_62_0 = stackIn_62_0;
                    stackIn_60_0 = stackOut_62_0;
                    var12 = stackIn_60_0;
                    L8: while (true) {
                      L9: {
                        if (var9 <= var12) {
                          var11++;
                          break L9;
                        } else {
                          var10[6].field_v[var12 + var9 * (-1 + (-var11 + var9))] = param2;
                          var10[8].field_v[var12 + (-var11 + (var9 + -1)) * var9] = param2;
                          var10[2].field_v[var9 * var12 - var11 - (1 + -var9)] = param2;
                          var10[8].field_v[var9 * var12 - (var11 + 1) - -var9] = param2;
                          var12++;
                          if (var15 != 0) {
                            break L9;
                          } else {
                            continue L8;
                          }
                        }
                      }
                      continue L6;
                    }
                  }
                }
              }
              var11 = stackIn_23_0;
              L10: while (true) {
                stackOut_24_0 = var11;
                stackOut_24_1 = param8;
                stackIn_25_0 = stackOut_24_0;
                stackIn_25_1 = stackOut_24_1;
                L11: while (true) {
                  L12: {
                    if (stackIn_25_0 >= stackIn_25_1) {
                      stackOut_31_0 = 0;
                      stackIn_32_0 = stackOut_31_0;
                      break L12;
                    } else {
                      stackOut_26_0 = 0;
                      stackIn_32_0 = stackOut_26_0;
                      stackIn_27_0 = stackOut_26_0;
                      if (var15 != 0) {
                        break L12;
                      } else {
                        var12 = stackIn_27_0;
                        if (var12 >= var9) {
                          var11++;
                          continue L10;
                        } else {
                          var10[0].field_v[var11 * var9 + var12] = param1;
                          var10[0].field_v[var9 * var12 + var11] = param1;
                          stackOut_28_0 = var9 - var11 ^ -1;
                          stackOut_28_1 = var12 ^ -1;
                          stackIn_25_0 = stackOut_28_0;
                          stackIn_25_1 = stackOut_28_1;
                          continue L11;
                        }
                      }
                    }
                  }
                  var11 = stackIn_32_0;
                  L13: while (true) {
                    L14: {
                      if (var11 >= param7) {
                        stackOut_42_0 = 0;
                        stackIn_43_0 = stackOut_42_0;
                        break L14;
                      } else {
                        stackOut_34_0 = 0;
                        stackIn_43_0 = stackOut_34_0;
                        stackIn_35_0 = stackOut_34_0;
                        if (var15 != 0) {
                          break L14;
                        } else {
                          var12 = stackIn_35_0;
                          L15: while (true) {
                            L16: {
                              if (var12 >= param8) {
                                var11++;
                                break L16;
                              } else {
                                var10[7].field_v[(-1 + (-var12 + var9)) * param7 - -var11] = param2;
                                var10[5].field_v[-var12 - -var9 + (-1 + var9 * var11)] = param2;
                                var10[1].field_v[var12 * param7 - -var11] = param1;
                                var10[3].field_v[var12 + var9 * var11] = param1;
                                var12++;
                                if (var15 != 0) {
                                  break L16;
                                } else {
                                  continue L15;
                                }
                              }
                            }
                            continue L13;
                          }
                        }
                      }
                    }
                    var11 = stackIn_43_0;
                    L17: while (true) {
                      L18: {
                        if (var11 >= param7 >> -1951266271) {
                          break L18;
                        } else {
                          var12 = 0;
                          L19: while (true) {
                            L20: {
                              if (var12 >= param4) {
                                var11++;
                                break L20;
                              } else {
                                var10[1].field_v[(-1 + (var9 - var12)) * param7 + var11] = param0;
                                var10[3].field_v[var9 * var11 - 1 - (-var9 + var12)] = param0;
                                var10[7].field_v[var11 + var12 * param7] = param0;
                                var10[5].field_v[var12 + var11 * var9] = param0;
                                var12++;
                                if (var15 != 0) {
                                  break L20;
                                } else {
                                  continue L19;
                                }
                              }
                            }
                            if (var15 == 0) {
                              continue L17;
                            } else {
                              break L18;
                            }
                          }
                        }
                      }
                      return var10;
                    }
                  }
                }
              }
            }
          } else {
            return (o[]) null;
          }
        }
    }

    final int a(byte param0) {
        int discarded$0 = 0;
        if (!(!this.field_m)) {
            return 0;
        }
        if (param0 != -126) {
            discarded$0 = this.a((byte) 102);
        }
        return 100;
    }

    md() {
    }

    static {
        field_t = new int[128];
    }
}
