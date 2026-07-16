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
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_54_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_11_0 = 0;
        byte stackOut_27_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_54_0 = 0;
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
                stackIn_9_0 = stackOut_2_0;
                stackIn_3_0 = stackOut_2_0;
                if (var15 != 0) {
                  break L1;
                } else {
                  var14 = stackIn_3_0;
                  L3: while (true) {
                    L4: {
                      if (var13.field_C.length <= var14) {
                        break L4;
                      } else {
                        var13.field_C[var14] = param1;
                        var14++;
                        if (var15 == 0) {
                          continue L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    var12++;
                    if (var15 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
            stackOut_8_0 = 0;
            stackIn_9_0 = stackOut_8_0;
            break L1;
          }
          var11 = stackIn_9_0;
          L5: while (true) {
            L6: {
              if (param5 <= var11) {
                stackOut_17_0 = 0;
                stackIn_18_0 = stackOut_17_0;
                break L6;
              } else {
                stackOut_11_0 = 0;
                stackIn_18_0 = stackOut_11_0;
                stackIn_12_0 = stackOut_11_0;
                if (var15 != 0) {
                  break L6;
                } else {
                  var12 = stackIn_12_0;
                  L7: while (true) {
                    if (var12 >= var9) {
                      var11++;
                      continue L5;
                    } else {
                      var10[6].field_C[var12 + (var9 - (var11 + 1)) * var9] = param3;
                      var10[8].field_C[var12 + (var9 - var11 - 1) * var9] = param3;
                      var10[2].field_C[var9 * var12 - (-var9 + 1) + -var11] = param3;
                      var10[8].field_C[-1 + (var9 + -var11) + var12 * var9] = param3;
                      var12++;
                      continue L7;
                    }
                  }
                }
              }
            }
            var11 = stackIn_18_0;
            L8: while (true) {
              L9: {
                if (var11 >= param5) {
                  var11 = 0;
                  stackOut_27_0 = param7;
                  stackIn_28_0 = stackOut_27_0;
                  break L9;
                } else {
                  stackOut_20_0 = 0;
                  stackIn_28_0 = stackOut_20_0;
                  stackIn_21_0 = stackOut_20_0;
                  if (var15 != 0) {
                    break L9;
                  } else {
                    var12 = stackIn_21_0;
                    L10: while (true) {
                      if (var12 >= var9) {
                        var11++;
                        continue L8;
                      } else {
                        L11: {
                          var10[0].field_C[var12 + var9 * var11] = param8;
                          var10[0].field_C[var9 * var12 - -var11] = param8;
                          if ((var12 ^ -1) <= (var9 + -var11 ^ -1)) {
                            break L11;
                          } else {
                            var10[2].field_C[var12 - -(var9 * var11)] = param8;
                            var10[6].field_C[var11 + var9 * var12] = param8;
                            break L11;
                          }
                        }
                        var12++;
                        continue L10;
                      }
                    }
                  }
                }
              }
              L12: {
                if (stackIn_28_0 == -112) {
                  break L12;
                } else {
                  oh[] discarded$1 = lf.a(48, 126, 35, -60, 39, 14, -11, (byte) 26, 113);
                  break L12;
                }
              }
              L13: while (true) {
                L14: {
                  if (param6 <= var11) {
                    stackOut_37_0 = 0;
                    stackIn_38_0 = stackOut_37_0;
                    break L14;
                  } else {
                    stackOut_53_0 = 0;
                    stackIn_38_0 = stackOut_53_0;
                    stackIn_54_0 = stackOut_53_0;
                    if (var15 != 0) {
                      break L14;
                    } else {
                      stackOut_54_0 = stackIn_54_0;
                      stackIn_52_0 = stackOut_54_0;
                      var12 = stackIn_52_0;
                      L15: while (true) {
                        if (var12 >= param5) {
                          var11++;
                          continue L13;
                        } else {
                          var10[7].field_C[var11 + (-1 + -var12 + var9) * param6] = param3;
                          var10[5].field_C[var9 * var11 - (var12 + 1 + -var9)] = param3;
                          var10[1].field_C[var11 + param6 * var12] = param8;
                          var10[3].field_C[var12 + var9 * var11] = param8;
                          var12++;
                          continue L15;
                        }
                      }
                    }
                  }
                }
                var11 = stackIn_38_0;
                L16: while (true) {
                  L17: {
                    if (param6 >> 161197633 <= var11) {
                      break L17;
                    } else {
                      var12 = 0;
                      L18: while (true) {
                        L19: {
                          if (var12 >= param0) {
                            var11++;
                            break L19;
                          } else {
                            var10[1].field_C[(-1 + var9 + -var12) * param6 - -var11] = param2;
                            var10[3].field_C[var11 * var9 - -var9 + -1 - var12] = param2;
                            var10[7].field_C[param6 * var12 + var11] = param2;
                            var10[5].field_C[var12 + var9 * var11] = param2;
                            var12++;
                            if (var15 != 0) {
                              break L19;
                            } else {
                              continue L18;
                            }
                          }
                        }
                        if (var15 == 0) {
                          continue L16;
                        } else {
                          break L17;
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
