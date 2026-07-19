/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gl {
    int field_e;
    byte[] field_m;
    int field_h;
    int field_g;
    byte[] field_b;
    static iw field_a;
    int field_k;
    int field_j;
    int field_l;
    static hd field_c;
    static int[] field_d;
    static String field_f;
    static String field_i;
    int field_n;

    final static int a(int param0, byte param1, int param2, int param3, ml param4, int param5, int param6, int param7, int param8, int param9) {
        RuntimeException var10 = null;
        int var10_int = 0;
        int stackIn_7_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_25_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_19_1 = 0;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        int stackOut_20_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_13_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        try {
          L0: {
            L1: {
              if (param1 > 32) {
                break L1;
              } else {
                field_a = (iw) null;
                break L1;
              }
            }
            var10_int = param4.l(2, 59);
            if (0 == var10_int) {
              L2: {
                if (0 == param2) {
                  stackOut_24_0 = 0;
                  stackIn_25_0 = stackOut_24_0;
                  break L2;
                } else {
                  stackOut_23_0 = param4.l(param2, 59);
                  stackIn_25_0 = stackOut_23_0;
                  break L2;
                }
              }
              decompiledRegionSelector0 = 3;
              break L0;
            } else {
              if (1 != var10_int) {
                if ((var10_int ^ -1) != -3) {
                  if ((var10_int ^ -1) == -4) {
                    L3: {
                      stackOut_17_0 = param8;
                      stackIn_19_0 = stackOut_17_0;
                      stackIn_18_0 = stackOut_17_0;
                      if (param3 != 0) {
                        stackOut_19_0 = stackIn_19_0;
                        stackOut_19_1 = param4.l(param3, 59);
                        stackIn_20_0 = stackOut_19_0;
                        stackIn_20_1 = stackOut_19_1;
                        break L3;
                      } else {
                        stackOut_18_0 = stackIn_18_0;
                        stackOut_18_1 = 0;
                        stackIn_20_0 = stackOut_18_0;
                        stackIn_20_1 = stackOut_18_1;
                        break L3;
                      }
                    }
                    stackOut_20_0 = stackIn_20_0 + stackIn_20_1 + param7 + param0;
                    stackIn_21_0 = stackOut_20_0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    throw new IllegalStateException();
                  }
                } else {
                  L4: {
                    stackOut_10_0 = param8;
                    stackIn_12_0 = stackOut_10_0;
                    stackIn_11_0 = stackOut_10_0;
                    if (param9 != 0) {
                      stackOut_12_0 = stackIn_12_0;
                      stackOut_12_1 = param4.l(param9, 59);
                      stackIn_13_0 = stackOut_12_0;
                      stackIn_13_1 = stackOut_12_1;
                      break L4;
                    } else {
                      stackOut_11_0 = stackIn_11_0;
                      stackOut_11_1 = 0;
                      stackIn_13_0 = stackOut_11_0;
                      stackIn_13_1 = stackOut_11_1;
                      break L4;
                    }
                  }
                  stackOut_13_0 = stackIn_13_0 + stackIn_13_1 - -param0;
                  stackIn_14_0 = stackOut_13_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                L5: {
                  if (0 == param5) {
                    stackOut_6_0 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    break L5;
                  } else {
                    stackOut_5_0 = param4.l(param5, 59);
                    stackIn_7_0 = stackOut_5_0;
                    break L5;
                  }
                }
                stackOut_7_0 = stackIn_7_0 + param8;
                stackIn_8_0 = stackOut_7_0;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var10 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) (var10);
            stackOut_26_1 = new StringBuilder().append("gl.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param4 == null) {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L6;
            } else {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L6;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_14_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_21_0;
            } else {
              return stackIn_25_0;
            }
          }
        }
    }

    final static void a(int param0, nu param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        nu var12 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        var11 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              if (param0 == 6711) {
                break L1;
              } else {
                var12 = (nu) null;
                gl.a(-102, (nu) null);
                break L1;
              }
            }
            L2: {
              if (in.field_c == null) {
                in.field_c = new int[2][4][4][10][2];
                break L2;
              } else {
                break L2;
              }
            }
            if (nd.field_d == param1) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              nd.field_d = param1;
              var2_int = 0;
              L3: while (true) {
                if (-3 >= (var2_int ^ -1)) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var3 = 0;
                  L4: while (true) {
                    if (var3 >= 4) {
                      var2_int++;
                      continue L3;
                    } else {
                      var4 = 0;
                      L5: while (true) {
                        if (4 <= var4) {
                          var3++;
                          continue L4;
                        } else {
                          var5 = in.field_c[var2_int][var3][var4].length;
                          var6 = 0;
                          L6: while (true) {
                            if (var5 <= var6) {
                              var4++;
                              continue L5;
                            } else {
                              L7: {
                                if (var4 != 0) {
                                  if (-3 != (var4 ^ -1)) {
                                    var7 = var6 * 896 / (-1 + var5);
                                    break L7;
                                  } else {
                                    var7 = 896;
                                    break L7;
                                  }
                                } else {
                                  var7 = 0;
                                  break L7;
                                }
                              }
                              L8: {
                                if (var4 == 1) {
                                  var8 = 0;
                                  break L8;
                                } else {
                                  if ((var4 ^ -1) != -4) {
                                    var8 = 1344 * var6 / (-1 + var5);
                                    break L8;
                                  } else {
                                    var8 = 1344;
                                    break L8;
                                  }
                                }
                              }
                              var9 = param1.field_V.field_t;
                              var10 = param1.field_V.field_p;
                              param1.field_V.field_t = var7 << 453691152;
                              param1.field_V.field_p = var8 << -2116445584;
                              vl.a(param1, (byte) -75);
                              param1.field_V.field_t = var9;
                              param1.field_V.field_p = var10;
                              gt.a(var3 + 1, var2_int, (byte) 112, param1.field_r[var2_int]);
                              in.field_c[var2_int][var3][var4][var6][0] = ge.field_m[0];
                              in.field_c[var2_int][var3][var4][var6][1] = ge.field_m[1];
                              var6++;
                              continue L6;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackOut_32_0 = (RuntimeException) (var2);
            stackOut_32_1 = new StringBuilder().append("gl.D(").append(param0).append(',');
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
              break L9;
            } else {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L9;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_35_0), stackIn_35_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static ut[] a(int param0, byte param1, int param2, int param3, int param4) {
        int var5 = 34 % ((param1 - 38) / 37);
        return q.a(1, 1, param2, 1, 3, -1481, param4, param0, param3);
    }

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        field_d = null;
        field_f = null;
        if (param0 <= 25) {
            return;
        }
        field_i = null;
    }

    static {
        field_a = new iw(256);
        field_i = "help";
        field_f = "Starting price";
    }
}
