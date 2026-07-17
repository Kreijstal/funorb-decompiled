/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sc {
    static int field_c;
    static ag field_a;
    static int field_d;
    static boolean field_b;

    public static void a(int param0) {
        field_a = null;
    }

    final static byte[] a(boolean param0, boolean param1, Object param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        ni var4 = null;
        Object stackIn_2_0 = null;
        byte[] stackIn_9_0 = null;
        byte[] stackIn_11_0 = null;
        byte[] stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_10_0 = null;
        byte[] stackOut_8_0 = null;
        byte[] stackOut_14_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          if (param2 != null) {
            L0: {
              if (param1) {
                break L0;
              } else {
                field_b = true;
                break L0;
              }
            }
            if (param2 instanceof byte[]) {
              var3 = (byte[]) param2;
              if (!param0) {
                stackOut_10_0 = (byte[]) var3;
                stackIn_11_0 = stackOut_10_0;
                return stackIn_11_0;
              } else {
                stackOut_8_0 = kh.a(var3, (byte) -16);
                stackIn_9_0 = stackOut_8_0;
                return stackIn_9_0;
              }
            } else {
              if (param2 instanceof ni) {
                var4 = (ni) param2;
                stackOut_14_0 = var4.a(3006);
                stackIn_15_0 = stackOut_14_0;
                return stackIn_15_0;
              } else {
                throw new IllegalArgumentException();
              }
            }
          } else {
            stackOut_1_0 = null;
            stackIn_2_0 = stackOut_1_0;
            return (byte[]) (Object) stackIn_2_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var3_ref;
            stackOut_17_1 = new StringBuilder().append("sc.A(").append(param0).append(44).append(param1).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param2 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L1;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L1;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 41);
        }
    }

    final static ea[] a(int param0, int param1, int param2, int param3, int param4, int param5, byte param6, int param7, int param8) {
        int var9 = 0;
        ea[] var10 = null;
        ea[] var11_ref_ea__ = null;
        int var11 = 0;
        int var12 = 0;
        ea var13 = null;
        int var14 = 0;
        int var15 = 0;
        var15 = MinerDisturbance.field_ab;
        var9 = param2 + 1 + param5;
        var10 = new ea[]{new ea(var9, var9), new ea(param0, var9), new ea(var9, var9), new ea(var9, param0), new ea(64, 64), new ea(var9, param0), new ea(var9, var9), new ea(param0, var9), new ea(var9, var9)};
        var11_ref_ea__ = var10;
        var12 = 0;
        L0: while (true) {
          if (var12 >= var11_ref_ea__.length) {
            if (param6 == -81) {
              var11 = 0;
              L1: while (true) {
                if (var11 >= 1) {
                  var11 = 0;
                  L2: while (true) {
                    if (var11 >= 1) {
                      var11 = 0;
                      L3: while (true) {
                        if (param0 <= var11) {
                          var11 = 0;
                          L4: while (true) {
                            if (param0 >> 1 <= var11) {
                              return var10;
                            } else {
                              var12 = 0;
                              L5: while (true) {
                                if (var12 >= param2) {
                                  var11++;
                                  continue L4;
                                } else {
                                  var10[1].field_D[param0 * (var9 - var12 - 1) - -var11] = param3;
                                  var10[3].field_D[var9 * var11 - 1 - (-var9 - -var12)] = param3;
                                  var10[7].field_D[param0 * var12 + var11] = param3;
                                  var10[5].field_D[var11 * var9 - -var12] = param3;
                                  var12++;
                                  continue L5;
                                }
                              }
                            }
                          }
                        } else {
                          var12 = 0;
                          L6: while (true) {
                            if (1 <= var12) {
                              var11++;
                              continue L3;
                            } else {
                              var10[7].field_D[param0 * (-var12 + var9 + -1) + var11] = param7;
                              var10[5].field_D[-var12 - (1 + -var9 - var9 * var11)] = param7;
                              var10[1].field_D[param0 * var12 + var11] = param4;
                              var10[3].field_D[var11 * var9 + var12] = param4;
                              var12++;
                              continue L6;
                            }
                          }
                        }
                      }
                    } else {
                      var12 = 0;
                      L7: while (true) {
                        if (var9 > var12) {
                          var10[0].field_D[var12 - -(var11 * var9)] = param4;
                          var10[0].field_D[var11 + var12 * var9] = param4;
                          if (var12 < var9 + -var11) {
                            var10[2].field_D[var11 * var9 + var12] = param4;
                            var10[6].field_D[var11 + var9 * var12] = param4;
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
                    if (var9 <= var12) {
                      var11++;
                      continue L1;
                    } else {
                      var10[6].field_D[var12 + var9 * (-1 + (-var11 + var9))] = param7;
                      var10[8].field_D[var9 * (-1 + -var11 + var9) - -var12] = param7;
                      var10[2].field_D[var9 * var12 - 1 - (-var9 + var11)] = param7;
                      var10[8].field_D[var9 + -1 + (-var11 + var12 * var9)] = param7;
                      var12++;
                      continue L8;
                    }
                  }
                }
              }
            } else {
              return null;
            }
          } else {
            var13 = var11_ref_ea__[var12];
            var14 = 0;
            L9: while (true) {
              if (var13.field_D.length <= var14) {
                var12++;
                continue L0;
              } else {
                var13.field_D[var14] = param1;
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
        field_b = true;
        field_a = new ag();
    }
}
