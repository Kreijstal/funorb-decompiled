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
        int var10_int = 0;
        RuntimeException var10 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            var10_int = param4.l(2, 59);
            if (0 == var10_int) {
              stackOut_11_0 = 0;
              stackIn_12_0 = stackOut_11_0;
              break L0;
            } else {
              if (1 != var10_int) {
                if (var10_int != 2) {
                  if (var10_int == 3) {
                    stackOut_9_0 = 1 + param4.l(16, 59) + 272;
                    stackIn_10_0 = stackOut_9_0;
                    return stackIn_10_0;
                  } else {
                    throw new IllegalStateException();
                  }
                } else {
                  stackOut_5_0 = 1 + param4.l(8, 59) - -16;
                  stackIn_6_0 = stackOut_5_0;
                  return stackIn_6_0;
                }
              } else {
                stackOut_2_0 = param4.l(4, 59) + 1;
                stackIn_3_0 = stackOut_2_0;
                return stackIn_3_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var10 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var10;
            stackOut_13_1 = new StringBuilder().append("gl.C(").append(16).append(',').append(123).append(',').append(0).append(',').append(16).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param4 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L1;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L1;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + 4 + ',' + 65536 + ',' + 256 + ',' + 1 + ',' + 8 + ')');
        }
        return stackIn_12_0;
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
        Object var12 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
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
                var12 = null;
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
              return;
            } else {
              nd.field_d = param1;
              var2_int = 0;
              L3: while (true) {
                if (var2_int >= 2) {
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
                                  if (var4 != 2) {
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
                                  if (var4 != 3) {
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
                              param1.field_V.field_t = var7 << 16;
                              param1.field_V.field_p = var8 << 16;
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
            stackOut_32_0 = (RuntimeException) var2;
            stackOut_32_1 = new StringBuilder().append("gl.D(").append(param0).append(',');
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param1 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L9;
            } else {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L9;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_35_0, stackIn_35_2 + ')');
        }
    }

    final static ut[] a(int param0, byte param1, int param2, int param3, int param4) {
        int var5 = 0;
        return q.a(1, 1, 0, 1, 3, -1481, 0, 65793, 0);
    }

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        field_d = null;
        field_f = null;
        field_i = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new iw(256);
        field_i = "help";
        field_f = "Starting price";
    }
}
