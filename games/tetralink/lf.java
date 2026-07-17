/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lf {
    static vg field_b;
    static String field_c;
    static String field_a;

    final static dk[] a(int param0) {
        if (param0 != 7) {
          return null;
        } else {
          return new dk[]{lh.field_s, lc.field_j, vc.field_b};
        }
    }

    final static oh[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, byte param7, int param8) {
        int var9 = 0;
        oh[] var10 = null;
        oh[] var11_ref_oh__ = null;
        int var11 = 0;
        int var12 = 0;
        oh var13 = null;
        int var14 = 0;
        int var15 = 0;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_62_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        byte stackOut_30_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_27_1 = 0;
        int stackOut_42_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_62_0 = 0;
        var15 = TetraLink.field_J;
        var9 = param4 + param5 - -param0;
        var10 = new oh[]{new oh(var9, var9), new oh(param6, var9), new oh(var9, var9), new oh(var9, param6), new oh(64, 64), new oh(var9, param6), new oh(var9, var9), new oh(param6, var9), new oh(var9, var9)};
        var11_ref_oh__ = var10;
        var12 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if (var12 >= var11_ref_oh__.length) {
                break L2;
              } else {
                var13 = var11_ref_oh__[var12];
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
                        if (var13.field_C.length <= var14) {
                          break L5;
                        } else {
                          var13.field_C[var14] = param1;
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
          L6: while (true) {
            L7: {
              if (param5 <= var11) {
                stackOut_21_0 = 0;
                stackIn_22_0 = stackOut_21_0;
                break L7;
              } else {
                stackOut_13_0 = 0;
                stackIn_22_0 = stackOut_13_0;
                stackIn_14_0 = stackOut_13_0;
                if (var15 != 0) {
                  break L7;
                } else {
                  var12 = stackIn_14_0;
                  L8: while (true) {
                    L9: {
                      if (var12 >= var9) {
                        var11++;
                        break L9;
                      } else {
                        var10[6].field_C[var12 + (var9 - (var11 + 1)) * var9] = param3;
                        var10[8].field_C[var12 + (var9 - var11 - 1) * var9] = param3;
                        var10[2].field_C[var9 * var12 - (-var9 + 1) + -var11] = param3;
                        var10[8].field_C[-1 + (var9 + -var11) + var12 * var9] = param3;
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
            var11 = stackIn_22_0;
            L10: while (true) {
              stackOut_23_0 = var11;
              stackOut_23_1 = param5;
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              L11: while (true) {
                L12: {
                  if (stackIn_24_0 >= stackIn_24_1) {
                    var11 = 0;
                    stackOut_30_0 = param7;
                    stackIn_31_0 = stackOut_30_0;
                    break L12;
                  } else {
                    stackOut_25_0 = 0;
                    stackIn_31_0 = stackOut_25_0;
                    stackIn_26_0 = stackOut_25_0;
                    if (var15 != 0) {
                      break L12;
                    } else {
                      var12 = stackIn_26_0;
                      if (var12 >= var9) {
                        var11++;
                        continue L10;
                      } else {
                        var10[0].field_C[var12 + var9 * var11] = 113;
                        var10[0].field_C[var9 * var12 - -var11] = 113;
                        stackOut_27_0 = ~var12;
                        stackOut_27_1 = ~(var9 + -var11);
                        stackIn_24_0 = stackOut_27_0;
                        stackIn_24_1 = stackOut_27_1;
                        continue L11;
                      }
                    }
                  }
                }
                L13: {
                  if (stackIn_31_0 == -112) {
                    break L13;
                  } else {
                    oh[] discarded$1 = lf.a(48, 126, 35, -60, 39, 14, -11, (byte) 26, 113);
                    break L13;
                  }
                }
                L14: while (true) {
                  L15: {
                    if (param6 <= var11) {
                      stackOut_42_0 = 0;
                      stackIn_43_0 = stackOut_42_0;
                      break L15;
                    } else {
                      stackOut_61_0 = 0;
                      stackIn_43_0 = stackOut_61_0;
                      stackIn_62_0 = stackOut_61_0;
                      if (var15 != 0) {
                        break L15;
                      } else {
                        stackOut_62_0 = stackIn_62_0;
                        stackIn_60_0 = stackOut_62_0;
                        var12 = stackIn_60_0;
                        L16: while (true) {
                          L17: {
                            if (var12 >= param5) {
                              var11++;
                              break L17;
                            } else {
                              var10[7].field_C[var11 + (-1 + -var12 + var9) * param6] = param3;
                              var10[5].field_C[var9 * var11 - (var12 + 1 + -var9)] = param3;
                              var10[1].field_C[var11 + param6 * var12] = 113;
                              var10[3].field_C[var12 + var9 * var11] = 113;
                              var12++;
                              if (var15 != 0) {
                                break L17;
                              } else {
                                continue L16;
                              }
                            }
                          }
                          continue L14;
                        }
                      }
                    }
                  }
                  var11 = stackIn_43_0;
                  L18: while (true) {
                    L19: {
                      if (param6 >> 1 <= var11) {
                        break L19;
                      } else {
                        var12 = 0;
                        L20: while (true) {
                          L21: {
                            if (var12 >= param0) {
                              var11++;
                              break L21;
                            } else {
                              var10[1].field_C[(-1 + var9 + -var12) * param6 - -var11] = param2;
                              var10[3].field_C[var11 * var9 - -var9 + -1 - var12] = param2;
                              var10[7].field_C[param6 * var12 + var11] = param2;
                              var10[5].field_C[var12 + var9 * var11] = param2;
                              var12++;
                              if (var15 != 0) {
                                break L21;
                              } else {
                                continue L20;
                              }
                            }
                          }
                          if (var15 == 0) {
                            continue L18;
                          } else {
                            break L19;
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
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
            field_b = null;
        }
        field_c = null;
        field_b = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Options Menu";
        field_a = "You have withdrawn your request to join.";
    }
}
