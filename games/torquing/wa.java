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
    }

    final static cp a(boolean param0, fj param1) {
        RuntimeException var2 = null;
        Object var3 = null;
        cp stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        cp stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                var3 = null;
                cp discarded$2 = wa.a(true, (fj) null);
                break L1;
              }
            }
            stackOut_2_0 = new cp(param1.g(65536), param1.g(65536), param1.g(65536), param1.g(65536), param1.g(65536), param1.g(65536), param1.g(65536), param1.g(65536), param1.e((byte) 62), param1.i((byte) -101));
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("wa.C(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(int param0, int param1, boolean param2, int param3, int param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = Torquing.field_u;
        try {
          L0: {
            L1: {
              if (param3 >= param4) {
                var7 = param4;
                var5_int = var7;
                L2: while (true) {
                  if (param3 <= var7) {
                    break L1;
                  } else {
                    qd.field_a[var7][param1] = param0;
                    var7++;
                    continue L2;
                  }
                }
              } else {
                var5_int = param3;
                L3: while (true) {
                  if (var5_int >= param4) {
                    break L1;
                  } else {
                    qd.field_a[var5_int][param1] = param0;
                    var5_int++;
                    continue L3;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw rb.a((Throwable) (Object) var5, "wa.B(" + param0 + ',' + param1 + ',' + true + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static boolean a(char param0) {
        int stackIn_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
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
            stackOut_10_0 = 0;
            stackIn_11_0 = stackOut_10_0;
            break L0;
          }
          stackOut_9_0 = 1;
          stackIn_11_0 = stackOut_9_0;
          break L0;
        }
        return stackIn_11_0 != 0;
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
        var15 = Torquing.field_u;
        var9 = 3;
        var10 = new t[]{new t(var9, var9), new t(3, var9), new t(var9, var9), new t(var9, 3), new t(64, 64), new t(var9, 3), new t(var9, var9), new t(3, var9), new t(var9, var9)};
        var11_ref_t__ = var10;
        var12 = 0;
        L0: while (true) {
          if (var11_ref_t__.length <= var12) {
            var11 = 0;
            L1: while (true) {
              if (var11 >= 1) {
                var11 = 0;
                L2: while (true) {
                  if (var11 >= 1) {
                    var11 = 0;
                    L3: while (true) {
                      if (3 <= var11) {
                        var11 = 0;
                        L4: while (true) {
                          if (1 <= var11) {
                            return var10;
                          } else {
                            var12 = 0;
                            L5: while (true) {
                              if (var12 >= 1) {
                                var11++;
                                continue L4;
                              } else {
                                var10[1].field_y[var11 + 3 * (-var12 + var9 - 1)] = 65793;
                                var10[3].field_y[var9 * var11 + var9 - 1 + -var12] = 65793;
                                var10[7].field_y[var12 * 3 + var11] = 65793;
                                var10[5].field_y[var9 * var11 - -var12] = 65793;
                                var12++;
                                continue L5;
                              }
                            }
                          }
                        }
                      } else {
                        var12 = 0;
                        L6: while (true) {
                          if (var12 >= 1) {
                            var11++;
                            continue L3;
                          } else {
                            var10[7].field_y[var11 + (-var12 + (var9 - 1)) * 3] = 0;
                            var10[5].field_y[var9 * var11 + (-1 + var9) - var12] = 0;
                            var10[1].field_y[var11 + 3 * var12] = 0;
                            var10[3].field_y[var12 + var9 * var11] = 0;
                            var12++;
                            continue L6;
                          }
                        }
                      }
                    }
                  } else {
                    var12 = 0;
                    L7: while (true) {
                      if (var9 <= var12) {
                        var11++;
                        continue L2;
                      } else {
                        var10[0].field_y[var12 + var11 * var9] = 0;
                        var10[0].field_y[var12 * var9 + var11] = 0;
                        if (var9 + -var11 > var12) {
                          var10[2].field_y[var11 * var9 + var12] = 0;
                          var10[6].field_y[var11 + var12 * var9] = 0;
                          var12++;
                          continue L7;
                        } else {
                          var12++;
                          continue L7;
                        }
                      }
                    }
                  }
                }
              } else {
                var12 = 0;
                L8: while (true) {
                  if (var12 >= var9) {
                    var11++;
                    continue L1;
                  } else {
                    var10[6].field_y[var9 * (-1 + var9 + -var11) + var12] = 0;
                    var10[8].field_y[var12 + var9 * (-var11 + (var9 - 1))] = 0;
                    var10[2].field_y[-var11 - (1 + (-var9 - var12 * var9))] = 0;
                    var10[8].field_y[-var11 - 1 - -var9 + var12 * var9] = 0;
                    var12++;
                    continue L8;
                  }
                }
              }
            }
          } else {
            var13 = var11_ref_t__[var12];
            var14 = 0;
            L9: while (true) {
              if (var13.field_y.length <= var14) {
                var12++;
                continue L0;
              } else {
                var13.field_y[var14] = 0;
                var14++;
                continue L9;
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
