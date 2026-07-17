/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class g extends gb {
    int field_t;
    static int[] field_u;
    static int field_p;
    static oa field_x;
    int field_v;
    static int field_y;
    int field_q;
    int field_o;
    int field_r;
    static ti field_w;
    int field_s;

    final static int g(int param0) {
        if (param0 != 1) {
            g.f(-106);
        }
        if (re.field_k) {
            return -1;
        }
        if (fe.field_L < bc.field_o) {
            return -1;
        }
        if (!(bc.field_o + cl.field_a <= fe.field_L)) {
            return field_y;
        }
        return -1;
    }

    final static void f(int param0) {
        int var1 = 0;
        L0: {
          L1: {
            if (32 < qd.field_d) {
              break L1;
            } else {
              da.a(0, (byte) -74);
              if (!TrackController.field_F) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          L2: {
            var1 = qd.field_d % 32;
            if (var1 == 0) {
              var1 = 32;
              break L2;
            } else {
              break L2;
            }
          }
          da.a(-var1 + qd.field_d, (byte) -74);
          break L0;
        }
        var1 = 67;
    }

    final static qj[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9 = 0;
        qj[] var10 = null;
        qj[] var11_ref_qj__ = null;
        int var11 = 0;
        int var12 = 0;
        qj var13 = null;
        int var14 = 0;
        int var15 = 0;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_28_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_44_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        int stackOut_32_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_29_1 = 0;
        int stackOut_43_0 = 0;
        int stackOut_35_0 = 0;
        var15 = TrackController.field_F ? 1 : 0;
        var9 = param6 - -param1 - -param2;
        var10 = new qj[]{new qj(var9, var9), new qj(param7, var9), new qj(var9, var9), new qj(var9, param7), new qj(64, 64), new qj(var9, param7), new qj(var9, var9), new qj(param7, var9), new qj(var9, var9)};
        var11_ref_qj__ = var10;
        var12 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if (var12 >= var11_ref_qj__.length) {
                break L2;
              } else {
                var13 = var11_ref_qj__[var12];
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
                        if (var13.field_z.length <= var14) {
                          break L5;
                        } else {
                          var13.field_z[var14] = param0;
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
            stackOut_10_0 = param8;
            stackIn_11_0 = stackOut_10_0;
            break L1;
          }
          L6: {
            if (stackIn_11_0 <= -82) {
              break L6;
            } else {
              field_y = 69;
              break L6;
            }
          }
          var11 = 0;
          L7: while (true) {
            L8: {
              if (var11 >= param6) {
                stackOut_23_0 = 0;
                stackIn_24_0 = stackOut_23_0;
                break L8;
              } else {
                stackOut_15_0 = 0;
                stackIn_24_0 = stackOut_15_0;
                stackIn_16_0 = stackOut_15_0;
                if (var15 != 0) {
                  break L8;
                } else {
                  var12 = stackIn_16_0;
                  L9: while (true) {
                    L10: {
                      if (var12 >= var9) {
                        var11++;
                        break L10;
                      } else {
                        var10[6].field_z[(-1 + -var11 + var9) * var9 - -var12] = param3;
                        var10[8].field_z[(-1 + var9 + -var11) * var9 + var12] = param3;
                        var10[2].field_z[var12 * var9 - var11 - (1 + -var9)] = param3;
                        var10[8].field_z[var9 + (-1 - var11 + var9 * var12)] = param3;
                        var12++;
                        if (var15 != 0) {
                          break L10;
                        } else {
                          continue L9;
                        }
                      }
                    }
                    continue L7;
                  }
                }
              }
            }
            var11 = stackIn_24_0;
            L11: while (true) {
              stackOut_25_0 = var11;
              stackOut_25_1 = param6;
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              L12: while (true) {
                L13: {
                  if (stackIn_26_0 >= stackIn_26_1) {
                    stackOut_32_0 = 0;
                    stackIn_33_0 = stackOut_32_0;
                    break L13;
                  } else {
                    stackOut_27_0 = 0;
                    stackIn_33_0 = stackOut_27_0;
                    stackIn_28_0 = stackOut_27_0;
                    if (var15 != 0) {
                      break L13;
                    } else {
                      var12 = stackIn_28_0;
                      if (var9 <= var12) {
                        var11++;
                        continue L11;
                      } else {
                        var10[0].field_z[var12 - -(var11 * var9)] = param4;
                        var10[0].field_z[var12 * var9 - -var11] = param4;
                        stackOut_29_0 = var12;
                        stackOut_29_1 = -var11 + var9;
                        stackIn_26_0 = stackOut_29_0;
                        stackIn_26_1 = stackOut_29_1;
                        continue L12;
                      }
                    }
                  }
                }
                var11 = stackIn_33_0;
                L14: while (true) {
                  L15: {
                    if (var11 >= param7) {
                      stackOut_43_0 = 0;
                      stackIn_44_0 = stackOut_43_0;
                      break L15;
                    } else {
                      stackOut_35_0 = 0;
                      stackIn_44_0 = stackOut_35_0;
                      stackIn_36_0 = stackOut_35_0;
                      if (var15 != 0) {
                        break L15;
                      } else {
                        var12 = stackIn_36_0;
                        L16: while (true) {
                          L17: {
                            if (param6 <= var12) {
                              var11++;
                              break L17;
                            } else {
                              var10[7].field_z[var11 + (-1 + -var12 + var9) * param7] = param3;
                              var10[5].field_z[-1 - -var9 - (var12 - var9 * var11)] = param3;
                              var10[1].field_z[var12 * param7 + var11] = param4;
                              var10[3].field_z[var9 * var11 + var12] = param4;
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
                  var11 = stackIn_44_0;
                  L18: while (true) {
                    L19: {
                      if (var11 >= param7 >> 1) {
                        break L19;
                      } else {
                        var12 = 0;
                        L20: while (true) {
                          L21: {
                            if (var12 >= param2) {
                              var11++;
                              break L21;
                            } else {
                              var10[1].field_z[(-var12 + var9 - 1) * param7 - -var11] = param5;
                              var10[3].field_z[var9 * var11 - (1 + -var9) + -var12] = param5;
                              var10[7].field_z[var11 + param7 * var12] = param5;
                              var10[5].field_z[var9 * var11 - -var12] = param5;
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

    public static void a(byte param0) {
        field_w = null;
        field_u = null;
        field_x = null;
        if (param0 != 12) {
            field_w = null;
        }
    }

    g() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = 0;
        field_y = -1;
        field_w = null;
    }
}
