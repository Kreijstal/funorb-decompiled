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
        var1 = 67 / ((-19 - param0) / 48);
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
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_39_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_32_0 = 0;
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
                stackIn_9_0 = stackOut_2_0;
                stackIn_3_0 = stackOut_2_0;
                if (var15 != 0) {
                  break L1;
                } else {
                  var14 = stackIn_3_0;
                  L3: while (true) {
                    L4: {
                      if (var13.field_z.length <= var14) {
                        break L4;
                      } else {
                        var13.field_z[var14] = param0;
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
            stackOut_8_0 = param8;
            stackIn_9_0 = stackOut_8_0;
            break L1;
          }
          L5: {
            if (stackIn_9_0 <= -82) {
              break L5;
            } else {
              field_y = 69;
              break L5;
            }
          }
          var11 = 0;
          L6: while (true) {
            L7: {
              if (var11 >= param6) {
                stackOut_19_0 = 0;
                stackIn_20_0 = stackOut_19_0;
                break L7;
              } else {
                stackOut_13_0 = 0;
                stackIn_20_0 = stackOut_13_0;
                stackIn_14_0 = stackOut_13_0;
                if (var15 != 0) {
                  break L7;
                } else {
                  var12 = stackIn_14_0;
                  L8: while (true) {
                    if (var12 >= var9) {
                      var11++;
                      continue L6;
                    } else {
                      var10[6].field_z[(-1 + -var11 + var9) * var9 - -var12] = param3;
                      var10[8].field_z[(-1 + var9 + -var11) * var9 + var12] = param3;
                      var10[2].field_z[var12 * var9 - var11 - (1 + -var9)] = param3;
                      var10[8].field_z[var9 + (-1 - var11 + var9 * var12)] = param3;
                      var12++;
                      continue L8;
                    }
                  }
                }
              }
            }
            var11 = stackIn_20_0;
            L9: while (true) {
              L10: {
                if (var11 >= param6) {
                  stackOut_29_0 = 0;
                  stackIn_30_0 = stackOut_29_0;
                  break L10;
                } else {
                  stackOut_22_0 = 0;
                  stackIn_30_0 = stackOut_22_0;
                  stackIn_23_0 = stackOut_22_0;
                  if (var15 != 0) {
                    break L10;
                  } else {
                    var12 = stackIn_23_0;
                    L11: while (true) {
                      if (var9 <= var12) {
                        var11++;
                        continue L9;
                      } else {
                        L12: {
                          var10[0].field_z[var12 - -(var11 * var9)] = param4;
                          var10[0].field_z[var12 * var9 - -var11] = param4;
                          if (var12 >= -var11 + var9) {
                            break L12;
                          } else {
                            var10[2].field_z[var12 - -(var11 * var9)] = param4;
                            var10[6].field_z[var9 * var12 - -var11] = param4;
                            break L12;
                          }
                        }
                        var12++;
                        continue L11;
                      }
                    }
                  }
                }
              }
              var11 = stackIn_30_0;
              L13: while (true) {
                L14: {
                  if (var11 >= param7) {
                    stackOut_38_0 = 0;
                    stackIn_39_0 = stackOut_38_0;
                    break L14;
                  } else {
                    stackOut_32_0 = 0;
                    stackIn_39_0 = stackOut_32_0;
                    stackIn_33_0 = stackOut_32_0;
                    if (var15 != 0) {
                      break L14;
                    } else {
                      var12 = stackIn_33_0;
                      L15: while (true) {
                        if (param6 <= var12) {
                          var11++;
                          continue L13;
                        } else {
                          var10[7].field_z[var11 + (-1 + -var12 + var9) * param7] = param3;
                          var10[5].field_z[-1 - -var9 - (var12 - var9 * var11)] = param3;
                          var10[1].field_z[var12 * param7 + var11] = param4;
                          var10[3].field_z[var9 * var11 + var12] = param4;
                          var12++;
                          continue L15;
                        }
                      }
                    }
                  }
                }
                var11 = stackIn_39_0;
                L16: while (true) {
                  L17: {
                    if (var11 >= param7 >> -553222335) {
                      break L17;
                    } else {
                      var12 = 0;
                      L18: while (true) {
                        L19: {
                          if (var12 >= param2) {
                            var11++;
                            break L19;
                          } else {
                            var10[1].field_z[(-var12 + var9 - 1) * param7 - -var11] = param5;
                            var10[3].field_z[var9 * var11 - (1 + -var9) + -var12] = param5;
                            var10[7].field_z[var11 + param7 * var12] = param5;
                            var10[5].field_z[var9 * var11 - -var12] = param5;
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
