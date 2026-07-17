/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sc {
    static int field_c;
    static ag field_a;
    static int field_d;
    static boolean field_b;

    public static void a() {
        field_a = null;
    }

    final static byte[] a(boolean param0, boolean param1, Object param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        ni var4 = null;
        Object stackIn_2_0 = null;
        byte[] stackIn_7_0 = null;
        byte[] stackIn_9_0 = null;
        byte[] stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_8_0 = null;
        byte[] stackOut_6_0 = null;
        byte[] stackOut_12_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          if (param2 != null) {
            if (param2 instanceof byte[]) {
              var3 = (byte[]) param2;
              if (!param0) {
                stackOut_8_0 = (byte[]) var3;
                stackIn_9_0 = stackOut_8_0;
                return stackIn_9_0;
              } else {
                int discarded$2 = -16;
                stackOut_6_0 = kh.a(var3);
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              }
            } else {
              if (param2 instanceof ni) {
                var4 = (ni) param2;
                stackOut_12_0 = var4.a(3006);
                stackIn_13_0 = stackOut_12_0;
                return stackIn_13_0;
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
          L0: {
            var3_ref = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3_ref;
            stackOut_15_1 = new StringBuilder().append("sc.A(").append(param0).append(44).append(1).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L0;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L0;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 41);
        }
    }

    final static ea[] a(int param0, int param1, int param2, int param3) {
        int var9 = 0;
        ea[] var10 = null;
        ea[] var11_ref_ea__ = null;
        int var11 = 0;
        int var12 = 0;
        ea var13 = null;
        int var14 = 0;
        int var15 = 0;
        var15 = MinerDisturbance.field_ab;
        var9 = 3;
        var10 = new ea[]{new ea(var9, var9), new ea(3, var9), new ea(var9, var9), new ea(var9, 3), new ea(64, 64), new ea(var9, 3), new ea(var9, var9), new ea(3, var9), new ea(var9, var9)};
        var11_ref_ea__ = var10;
        var12 = 0;
        L0: while (true) {
          if (var12 >= var11_ref_ea__.length) {
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
                          if (var11 >= 1) {
                            return var10;
                          } else {
                            var12 = 0;
                            L5: while (true) {
                              if (var12 >= 1) {
                                var11++;
                                continue L4;
                              } else {
                                var10[1].field_D[3 * (var9 - var12 - 1) - -var11] = param3;
                                var10[3].field_D[var9 * var11 - 1 - (-var9 - -var12)] = param3;
                                var10[7].field_D[3 * var12 + var11] = param3;
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
                            var10[7].field_D[3 * (-var12 + var9 + -1) + var11] = 0;
                            var10[5].field_D[-var12 - (1 + -var9 - var9 * var11)] = 0;
                            var10[1].field_D[3 * var12 + var11] = 0;
                            var10[3].field_D[var11 * var9 + var12] = 0;
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
                        var10[0].field_D[var12 - -(var11 * var9)] = 0;
                        var10[0].field_D[var11 + var12 * var9] = 0;
                        if (var12 < var9 + -var11) {
                          var10[2].field_D[var11 * var9 + var12] = 0;
                          var10[6].field_D[var11 + var9 * var12] = 0;
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
                    var10[6].field_D[var12 + var9 * (-1 + (-var11 + var9))] = 0;
                    var10[8].field_D[var9 * (-1 + -var11 + var9) - -var12] = 0;
                    var10[2].field_D[var9 * var12 - 1 - (-var9 + var11)] = 0;
                    var10[8].field_D[var9 + -1 + (-var11 + var12 * var9)] = 0;
                    var12++;
                    continue L8;
                  }
                }
              }
            }
          } else {
            var13 = var11_ref_ea__[var12];
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = true;
        field_a = new ag();
    }
}
