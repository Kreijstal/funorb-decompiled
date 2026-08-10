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
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == -124) {
              stackIn_4_0 = param1.b((byte) -117);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("md.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0;
        }
    }

    final byte[] f(int param0) {
        if (this.field_m) {
            throw new RuntimeException();
        }
        if (param0 != 0) {
            field_v = (String) null;
        }
        return this.field_u;
    }

    public static void i(int param0) {
        field_s = null;
        field_v = null;
        int var1 = 60 / ((-82 - param0) / 32);
        field_t = null;
    }

    final static o[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9;
        o[] var10;
        o[] var11_ref_o__;
        int var11;
        int var12;
        o var13;
        int var14;
        int var15;
        var15 = SolKnight.field_L ? 1 : 0;
        var9 = param4 + (param6 + param8);
        var10 = new o[]{new o(var9, var9), new o(param7, var9), new o(var9, var9), new o(var9, param7), new o(64, 64), new o(var9, param7), new o(var9, var9), new o(param7, var9), new o(var9, var9)};
        var11_ref_o__ = var10;
        var12 = 0;
        L0: while (true) {
          if (var11_ref_o__.length <= var12) {
            var11 = 0;
            if (param5 == -1) {
              L1: while (true) {
                if (var11 >= param8) {
                  var11 = 0;
                  L2: while (true) {
                    if (var11 >= param8) {
                      var11 = 0;
                      L3: while (true) {
                        if (var11 >= param7) {
                          var11 = 0;
                          L4: while (true) {
                            if (var11 >= param7 >> -1951266271) {
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
                            if (var12 < param8) {
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
                          if ((var9 - var11 ^ -1) < (var12 ^ -1)) {
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
              return (o[]) null;
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
        if (!(!this.field_m)) {
            return 0;
        }
        if (param0 != -126) {
            this.a((byte) 102);
        }
        return 100;
    }

    md() {
    }

    static {
        field_t = new int[128];
    }
}
