/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wa extends ih {
    static double field_e;
    static String field_c;
    static boolean field_f;
    static df field_d;

    public static void a(int param0) {
        field_d = null;
        field_c = null;
        if (param0 > -40) {
            t[] discarded$0 = wa.a((byte) 71, -60, -21, -91, 93, 31, -101, 24, -104);
        }
    }

    final static cp a(boolean param0, fj param1) {
        if (param0) {
            Object var3 = null;
            cp discarded$0 = wa.a(true, (fj) null);
        }
        return new cp(param1.g(65536), param1.g(65536), param1.g(65536), param1.g(65536), param1.g(65536), param1.g(65536), param1.g(65536), param1.g(65536), param1.e((byte) 62), param1.i((byte) -101));
    }

    final static void a(int param0, int param1, boolean param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        L0: {
          var6 = Torquing.field_u;
          if (param2) {
            break L0;
          } else {
            var7 = null;
            cp discarded$2 = wa.a(false, (fj) null);
            break L0;
          }
        }
        L1: {
          if (param3 >= param4) {
            var5 = param4;
            L2: while (true) {
              if (param3 <= var5) {
                break L1;
              } else {
                qd.field_a[var5][param1] = param0;
                var5++;
                if (var6 != 0) {
                  break L1;
                } else {
                  continue L2;
                }
              }
            }
          } else {
            var5 = param3;
            L3: while (true) {
              if (var5 >= param4) {
                if (var6 == 0) {
                  break L1;
                } else {
                  var5 = param4;
                  L4: while (true) {
                    if (param3 <= var5) {
                      break L1;
                    } else {
                      qd.field_a[var5][param1] = param0;
                      var5++;
                      continue L4;
                    }
                  }
                }
              } else {
                qd.field_a[var5][param1] = param0;
                var5++;
                if (var6 != 0) {
                  break L1;
                } else {
                  continue L3;
                }
              }
            }
          }
        }
    }

    final static boolean a(char param0, byte param1) {
        int stackIn_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        if (param1 != 34) {
          return false;
        } else {
          L0: {
            L1: {
              L2: {
                if (param0 < 48) {
                  break L2;
                } else {
                  if (param0 <= 57) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (65 > param0) {
                  break L3;
                } else {
                  if (90 >= param0) {
                    break L1;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (param0 < 97) {
                  break L4;
                } else {
                  if (param0 > 122) {
                    break L4;
                  } else {
                    break L1;
                  }
                }
              }
              stackOut_11_0 = 0;
              stackIn_12_0 = stackOut_11_0;
              break L0;
            }
            stackOut_10_0 = 1;
            stackIn_12_0 = stackOut_10_0;
            break L0;
          }
          return stackIn_12_0 != 0;
        }
    }

    final static t[] a(byte param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9 = 0;
        t[] var10 = null;
        t[] var11_ref_t__ = null;
        int var11 = 0;
        int var12 = 0;
        t var13 = null;
        int var14 = 0;
        int var15 = 0;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_37_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_20_0 = 0;
        byte stackOut_36_0 = 0;
        int stackOut_30_0 = 0;
        var15 = Torquing.field_u;
        var9 = param2 - (-param3 + -param1);
        var10 = new t[]{new t(var9, var9), new t(param5, var9), new t(var9, var9), new t(var9, param5), new t(64, 64), new t(var9, param5), new t(var9, var9), new t(param5, var9), new t(var9, var9)};
        var11_ref_t__ = var10;
        var12 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if (var11_ref_t__.length <= var12) {
                break L2;
              } else {
                var13 = var11_ref_t__[var12];
                stackOut_2_0 = 0;
                stackIn_9_0 = stackOut_2_0;
                stackIn_3_0 = stackOut_2_0;
                if (var15 != 0) {
                  break L1;
                } else {
                  var14 = stackIn_3_0;
                  L3: while (true) {
                    L4: {
                      if (var13.field_y.length <= var14) {
                        break L4;
                      } else {
                        var13.field_y[var14] = param7;
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
              if (param2 <= var11) {
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
                      var10[6].field_y[var9 * (-1 + var9 + -var11) + var12] = param4;
                      var10[8].field_y[var12 + var9 * (-var11 + (var9 - 1))] = param4;
                      var10[2].field_y[-var11 - (1 + (-var9 - var12 * var9))] = param4;
                      var10[8].field_y[-var11 - 1 - -var9 + var12 * var9] = param4;
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
                if (param2 <= var11) {
                  stackOut_27_0 = 0;
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
                      if (var9 <= var12) {
                        var11++;
                        continue L8;
                      } else {
                        L11: {
                          var10[0].field_y[var12 + var11 * var9] = param6;
                          var10[0].field_y[var12 * var9 + var11] = param6;
                          if (var9 + -var11 <= var12) {
                            break L11;
                          } else {
                            var10[2].field_y[var11 * var9 + var12] = param6;
                            var10[6].field_y[var11 + var12 * var9] = param6;
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
              var11 = stackIn_28_0;
              L12: while (true) {
                L13: {
                  if (param5 <= var11) {
                    var11 = 0;
                    stackOut_36_0 = param0;
                    stackIn_37_0 = stackOut_36_0;
                    break L13;
                  } else {
                    stackOut_30_0 = 0;
                    stackIn_37_0 = stackOut_30_0;
                    stackIn_31_0 = stackOut_30_0;
                    if (var15 != 0) {
                      break L13;
                    } else {
                      var12 = stackIn_31_0;
                      L14: while (true) {
                        if (var12 >= param2) {
                          var11++;
                          continue L12;
                        } else {
                          var10[7].field_y[var11 + (-var12 + (var9 - 1)) * param5] = param4;
                          var10[5].field_y[var9 * var11 + (-1 + var9) - var12] = param4;
                          var10[1].field_y[var11 + param5 * var12] = param6;
                          var10[3].field_y[var12 + var9 * var11] = param6;
                          var12++;
                          continue L14;
                        }
                      }
                    }
                  }
                }
                if (stackIn_37_0 != -63) {
                  return null;
                } else {
                  L15: while (true) {
                    L16: {
                      if (param5 >> 2080308673 <= var11) {
                        break L16;
                      } else {
                        var12 = 0;
                        L17: while (true) {
                          L18: {
                            if (param1 <= var12) {
                              var11++;
                              break L18;
                            } else {
                              var10[1].field_y[var11 + param5 * (-var12 + var9 - 1)] = param8;
                              var10[3].field_y[var9 * var11 + var9 - 1 + -var12] = param8;
                              var10[7].field_y[var12 * param5 + var11] = param8;
                              var10[5].field_y[var9 * var11 - -var12] = param8;
                              var12++;
                              if (var15 != 0) {
                                break L18;
                              } else {
                                continue L17;
                              }
                            }
                          }
                          if (var15 == 0) {
                            continue L15;
                          } else {
                            break L16;
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = Math.atan2(1.0, 0.0);
        field_c = "WORLD:";
        field_f = false;
    }
}
