/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class joa {
    private static int[] field_b;
    static int field_a;

    final static String a(CharSequence param0, boolean param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        String stackIn_5_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_4_0 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              var2 = vga.a(agb.a(param0, -49), -128);
              if (!param1) {
                break L1;
              } else {
                field_b = (int[]) null;
                break L1;
              }
            }
            L2: {
              if (var2 != null) {
                break L2;
              } else {
                var2 = "";
                break L2;
              }
            }
            stackOut_4_0 = (String) (var2);
            stackIn_5_0 = stackOut_4_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var2_ref);
            stackOut_6_1 = new StringBuilder().append("joa.C(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_5_0;
    }

    final static int a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_30_0 = 0;
        int stackIn_40_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_38_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_29_0 = 0;
        var8 = param5 * param3 + -(param1 * param0);
        if (var8 == 0) {
          return -1;
        } else {
          L0: {
            var9 = param6 * param0 - param2 * param3;
            if (-1 < (var9 ^ -1)) {
              stackOut_5_0 = 0;
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              stackOut_4_0 = 1;
              stackIn_6_0 = stackOut_4_0;
              break L0;
            }
          }
          L1: {
            stackOut_6_0 = stackIn_6_0;
            stackIn_8_0 = stackOut_6_0;
            stackIn_7_0 = stackOut_6_0;
            if (param7 >= var8) {
              stackOut_8_0 = stackIn_8_0;
              stackOut_8_1 = 0;
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              break L1;
            } else {
              stackOut_7_0 = stackIn_7_0;
              stackOut_7_1 = 1;
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              break L1;
            }
          }
          if ((stackIn_9_0 ^ stackIn_9_1) != 0) {
            return -1;
          } else {
            L2: {
              var10 = -vma.a(124, var9) + 30;
              if (var10 >= param4) {
                var11 = (var9 << param4) / var8;
                break L2;
              } else {
                var8 = var8 >> -var10 + param4;
                if (var8 >> -var10 + param4 == 0) {
                  return -1;
                } else {
                  var11 = (var9 << var10) / var8;
                  break L2;
                }
              }
            }
            if (1 << param4 >= var11) {
              if (Math.abs(param0) <= Math.abs(param3)) {
                L3: {
                  L4: {
                    L5: {
                      var12 = param6 + (param1 * var11 >> param4);
                      if (0 > param3) {
                        if (var12 < param3) {
                          break L4;
                        } else {
                          if (-1 > (var12 ^ -1)) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      } else {
                        if (0 > var12) {
                          break L4;
                        } else {
                          if (var12 > param3) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    stackOut_38_0 = var11;
                    stackIn_40_0 = stackOut_38_0;
                    break L3;
                  }
                  stackOut_39_0 = -1;
                  stackIn_40_0 = stackOut_39_0;
                  break L3;
                }
                return stackIn_40_0;
              } else {
                L6: {
                  L7: {
                    L8: {
                      var12 = param2 - -(var11 * param5 >> param4);
                      if (-1 >= (param0 ^ -1)) {
                        if (var12 < 0) {
                          break L7;
                        } else {
                          if (param0 < var12) {
                            break L7;
                          } else {
                            break L8;
                          }
                        }
                      } else {
                        if (param0 > var12) {
                          break L7;
                        } else {
                          if (var12 > 0) {
                            break L7;
                          } else {
                            break L8;
                          }
                        }
                      }
                    }
                    stackOut_28_0 = var11;
                    stackIn_30_0 = stackOut_28_0;
                    break L6;
                  }
                  stackOut_29_0 = -1;
                  stackIn_30_0 = stackOut_29_0;
                  break L6;
                }
                return stackIn_30_0;
              }
            } else {
              return -1;
            }
          }
        }
    }

    public static void a(int param0) {
        int discarded$0 = 0;
        field_b = null;
        if (param0 != 26936) {
            discarded$0 = joa.a(-25, -71, 87, 48, 85, 34, -54, 36);
        }
    }

    static {
        int var0 = 0;
        long var4 = 0L;
        long var6 = 0L;
        int var3 = 0;
        int var2 = 0;
        int var1 = 0;
        field_b = new int[98304];
        for (var0 = 92682; var0 >= 46341; var0--) {
            var4 = (long)((var0 << -945755263) + -1);
            var6 = (long)(1 + (var0 << -255027551));
            var3 = (int)((var6 * var6 >> -1334368494) - 32768L);
            var2 = (int)((var4 * var4 >> 210053970) + -32768L);
            if (!(field_b.length > var3)) {
                var3 = -1 + field_b.length;
            }
            for (var1 = -1 < (var2 ^ -1) ? 0 : var2; var1 <= var3; var1++) {
                field_b[var1] = var0;
            }
        }
        field_a = 1600;
    }
}
