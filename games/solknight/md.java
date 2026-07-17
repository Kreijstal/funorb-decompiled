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
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("md.E(").append(param0).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
        return stackIn_4_0;
    }

    final byte[] f(int param0) {
        if (((md) this).field_m) {
            throw new RuntimeException();
        }
        if (param0 != 0) {
            field_v = null;
        }
        return ((md) this).field_u;
    }

    public static void i(int param0) {
        field_s = null;
        field_v = null;
        int var1 = -12;
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
        var15 = SolKnight.field_L ? 1 : 0;
        var9 = param4 + (param6 + 1);
        var10 = new o[]{new o(var9, var9), new o(param7, var9), new o(var9, var9), new o(var9, param7), new o(64, 64), new o(var9, param7), new o(var9, var9), new o(param7, var9), new o(var9, var9)};
        var11_ref_o__ = var10;
        var12 = 0;
        L0: while (true) {
          if (var11_ref_o__.length <= var12) {
            var11 = 0;
            if (param5 == -1) {
              L1: while (true) {
                if (var11 >= 1) {
                  var11 = 0;
                  L2: while (true) {
                    if (var11 >= 1) {
                      var11 = 0;
                      L3: while (true) {
                        if (var11 >= param7) {
                          var11 = 0;
                          L4: while (true) {
                            if (var11 >= param7 >> 1) {
                              return var10;
                            } else {
                              var12 = 0;
                              L5: while (true) {
                                if (var12 >= param4) {
                                  var11++;
                                  continue L4;
                                } else {
                                  var10[1].field_v[(-1 + (var9 - var12)) * param7 + var11] = param0;
                                  var10[3].field_v[var9 * var11 - 1 - (-var9 + var12)] = param0;
                                  var10[7].field_v[var11 + var12 * param7] = param0;
                                  var10[5].field_v[var12 + var11 * var9] = param0;
                                  var12++;
                                  continue L5;
                                }
                              }
                            }
                          }
                        } else {
                          var12 = 0;
                          L6: while (true) {
                            if (var12 < 1) {
                              var10[7].field_v[(-1 + (-var12 + var9)) * param7 - -var11] = param2;
                              var10[5].field_v[-var12 - -var9 + (-1 + var9 * var11)] = param2;
                              var10[1].field_v[var12 * param7 - -var11] = param1;
                              var10[3].field_v[var12 + var9 * var11] = param1;
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
                        if (var12 < var9) {
                          var10[0].field_v[var11 * var9 + var12] = param1;
                          var10[0].field_v[var9 * var12 + var11] = param1;
                          if (var9 - var11 > var12) {
                            var10[2].field_v[var9 * var11 + var12] = param1;
                            var10[6].field_v[var9 * var12 + var11] = param1;
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
                      var10[6].field_v[var12 + var9 * (-1 + (-var11 + var9))] = param2;
                      var10[8].field_v[var12 + (-var11 + (var9 + -1)) * var9] = param2;
                      var10[2].field_v[var9 * var12 - var11 - (1 + -var9)] = param2;
                      var10[8].field_v[var9 * var12 - (var11 + 1) - -var9] = param2;
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
              return null;
            }
          } else {
            var13 = var11_ref_o__[var12];
            var14 = 0;
            L9: while (true) {
              if (var13.field_v.length <= var14) {
                var12++;
                continue L0;
              } else {
                var13.field_v[var14] = param3;
                var14++;
                continue L9;
              }
            }
          }
        }
    }

    final int a(byte param0) {
        if (!(!((md) this).field_m)) {
            return 0;
        }
        if (param0 != -126) {
            int discarded$0 = ((md) this).a((byte) 102);
        }
        return 100;
    }

    md() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = new int[128];
    }
}
