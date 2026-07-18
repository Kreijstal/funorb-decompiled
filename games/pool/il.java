/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class il {
    static ge field_b;
    static String field_d;
    static String field_h;
    static dd field_a;
    static jg[] field_c;
    static String field_e;
    static vh[] field_g;
    static dd field_f;

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        field_d = null;
        field_h = null;
        field_f = null;
        int var1 = -94 % ((param0 - 54) / 32);
        field_g = null;
        field_e = null;
        field_b = null;
    }

    final static dd[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9 = 0;
        dd[] var10 = null;
        dd[] var11_ref_dd__ = null;
        int var11 = 0;
        int var12 = 0;
        dd var13 = null;
        int var14 = 0;
        int var15 = 0;
        var15 = Pool.field_O;
        var9 = 3;
        var10 = new dd[]{new dd(var9, var9), new dd(3, var9), new dd(var9, var9), new dd(var9, 3), new dd(64, 64), new dd(var9, 3), new dd(var9, var9), new dd(3, var9), new dd(var9, var9)};
        var11_ref_dd__ = var10;
        var12 = 0;
        L0: while (true) {
          if (var11_ref_dd__.length <= var12) {
            var10 = var11_ref_dd__;
            var11 = 0;
            L1: while (true) {
              if (var11 >= 1) {
                var11 = 0;
                L2: while (true) {
                  if (var11 >= 1) {
                    var11 = 0;
                    L3: while (true) {
                      if (var11 >= 3) {
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
                                var10[1].field_D[var11 + (var9 - (var12 + 1)) * 3] = 65793;
                                var10[3].field_D[var11 * var9 - 1 - (-var9 + var12)] = 65793;
                                var10[7].field_D[var11 + var12 * 3] = 65793;
                                var10[5].field_D[var9 * var11 - -var12] = 65793;
                                var12++;
                                continue L5;
                              }
                            }
                          }
                        }
                      } else {
                        var12 = 0;
                        L6: while (true) {
                          if (1 > var12) {
                            var10[7].field_D[var11 + (-1 + (-var12 + var9)) * 3] = 0;
                            var10[5].field_D[var9 * var11 + var9 + -1 - var12] = 0;
                            var10[1].field_D[3 * var12 - -var11] = 0;
                            var10[3].field_D[var9 * var11 - -var12] = 0;
                            var12++;
                            continue L6;
                          } else {
                            var11++;
                            continue L3;
                          }
                        }
                      }
                    }
                  } else {
                    var12 = 0;
                    L7: while (true) {
                      if (var9 > var12) {
                        var10[0].field_D[var9 * var11 + var12] = 0;
                        var10[0].field_D[var12 * var9 + var11] = 0;
                        if (var12 < var9 + -var11) {
                          var10[2].field_D[var9 * var11 + var12] = 0;
                          var10[6].field_D[var12 * var9 + var11] = 0;
                          var12++;
                          continue L7;
                        } else {
                          var12++;
                          continue L7;
                        }
                      } else {
                        var11++;
                        continue L2;
                      }
                    }
                  }
                }
              } else {
                var12 = 0;
                L8: while (true) {
                  if (var9 > var12) {
                    var10[6].field_D[(-1 + var9 - var11) * var9 + var12] = 0;
                    var10[8].field_D[var9 * (-1 + -var11 + var9) - -var12] = 0;
                    var10[2].field_D[-1 + var9 + (-var11 + var12 * var9)] = 0;
                    var10[8].field_D[var9 * var12 - var11 - (-var9 + 1)] = 0;
                    var12++;
                    continue L8;
                  } else {
                    var11++;
                    continue L1;
                  }
                }
              }
            }
          } else {
            var13 = var11_ref_dd__[var12];
            var14 = 0;
            L9: while (true) {
              if (var13.field_D.length <= var14) {
                var12++;
                continue L0;
              } else {
                var13.field_D[var14] = 0;
                var14++;
                continue L9;
              }
            }
          }
        }
    }

    final static int[] a(byte param0, int[] param1) {
        RuntimeException var2 = null;
        int[] var2_array = null;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int[] stackIn_7_0 = null;
        int[] stackIn_15_0 = null;
        int[] stackIn_17_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_16_0 = null;
        int[] stackOut_14_0 = null;
        int[] stackOut_6_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var4 = Pool.field_O;
        try {
          L0: {
            L1: {
              if (param0 >= 72) {
                break L1;
              } else {
                il.a(-2);
                break L1;
              }
            }
            L2: {
              if (param1 == null) {
                break L2;
              } else {
                if (param1.length != 0) {
                  if (param1.length >= 12) {
                    stackOut_16_0 = (int[]) param1;
                    stackIn_17_0 = stackOut_16_0;
                    break L0;
                  } else {
                    var5 = new int[12];
                    var2_array = var5;
                    var3 = 0;
                    L3: while (true) {
                      if (param1.length <= var3) {
                        L4: while (true) {
                          if (ln.field_m.length <= var3) {
                            stackOut_14_0 = (int[]) var2_array;
                            stackIn_15_0 = stackOut_14_0;
                            return stackIn_15_0;
                          } else {
                            var2_array[var3] = ln.field_m[var3];
                            var3++;
                            continue L4;
                          }
                        }
                      } else {
                        var5[var3] = param1[var3];
                        var3++;
                        continue L3;
                      }
                    }
                  }
                } else {
                  break L2;
                }
              }
            }
            stackOut_6_0 = new int[]{ln.field_m[0], ln.field_m[1], ln.field_m[2], ln.field_m[3], ln.field_m[4], ln.field_m[5], ln.field_m[6], ln.field_m[7], ln.field_m[8], ln.field_m[9], ln.field_m[10], ln.field_m[11]};
            stackIn_7_0 = stackOut_6_0;
            return stackIn_7_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var2;
            stackOut_18_1 = new StringBuilder().append("il.C(").append(param0).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L5;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ')');
        }
        return stackIn_17_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new jg[4];
        field_h = "You have won!";
        field_e = "OFF";
        field_d = "Breaking real-world laws";
    }
}
