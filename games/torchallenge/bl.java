/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bl extends ng {
    int field_Y;
    private m field_R;
    static rj field_S;
    int field_W;
    private int field_Z;
    static int[] field_T;
    static int[][] field_O;
    static int field_P;
    static boolean field_U;
    static int field_X;
    static wb field_V;
    static String field_Q;

    final boolean a(int param0, int param1, int param2, int param3, int param4, int param5, ee param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_23_0 = 0;
        int stackIn_25_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_24_0 = 0;
        int stackOut_22_0 = 0;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var14 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 == -81) {
                break L1;
              } else {
                int discarded$1 = ((bl) this).a(58, 19);
                break L1;
              }
            }
            if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
              stackOut_24_0 = 0;
              stackIn_25_0 = stackOut_24_0;
              break L0;
            } else {
              L2: {
                var8_int = -param4 + param1 - ((bl) this).field_W;
                var9 = -(2 * ((bl) this).field_W) + ((bl) this).field_p;
                if (var8_int <= var9) {
                  break L2;
                } else {
                  var8_int = var9;
                  break L2;
                }
              }
              L3: {
                if (var8_int >= 0) {
                  break L3;
                } else {
                  var8_int = 0;
                  break L3;
                }
              }
              L4: {
                var8_int = var8_int * ((bl) this).field_Z / var9;
                if (1 != param5) {
                  if (param5 == 2) {
                    var10 = 2147483647;
                    var11 = -1;
                    var12 = 0;
                    L5: while (true) {
                      if (((bl) this).field_R.a(false) <= var12) {
                        if (var11 < 0) {
                          break L4;
                        } else {
                          ((bl) this).field_R.b(var11, (byte) -116);
                          break L4;
                        }
                      } else {
                        L6: {
                          var13 = -var8_int + ((bl) this).field_R.c(var12, 7);
                          var13 = var13 * var13;
                          if (var10 <= var13) {
                            var12++;
                            break L6;
                          } else {
                            var11 = var12;
                            var10 = var13;
                            var12++;
                            break L6;
                          }
                        }
                        var12++;
                        continue L5;
                      }
                    }
                  } else {
                    return true;
                  }
                } else {
                  ((bl) this).field_R.a(var8_int, (byte) 46);
                  break L4;
                }
              }
              stackOut_22_0 = 1;
              stackIn_23_0 = stackOut_22_0;
              return stackIn_23_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var8 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var8;
            stackOut_26_1 = new StringBuilder().append("bl.CA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param6 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L7;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L7;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + ')');
        }
        return stackIn_25_0 != 0;
    }

    final static ka[] a(int param0, int param1, lj param2) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        ka[] stackIn_5_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        ka[] stackOut_4_0 = null;
        Object stackOut_1_0 = null;
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
            if (lk.a(160, param2, param1, param0)) {
              stackOut_4_0 = de.a(true);
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (ka[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var4;
            stackOut_6_1 = new StringBuilder().append("bl.C(").append(param0).append(',').append(param1).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L1;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + 2147483647 + ')');
        }
        return stackIn_5_0;
    }

    final int a(int param0, int param1) {
        int var3 = 0;
        if (param1 >= 0) {
          if (param1 >= ((bl) this).field_R.a(false)) {
            return -1;
          } else {
            var3 = 127 / ((param0 - 59) / 38);
            return ((bl) this).field_R.c(param1, 7);
          }
        } else {
          return -1;
        }
    }

    final int d(boolean param0) {
        if (!param0) {
            return 97;
        }
        return ((bl) this).field_R.a(!param0 ? true : false);
    }

    private bl() throws Throwable {
        throw new Error();
    }

    final static int a(int param0, byte param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_9_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_10_0 = 0;
        var4 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            var3_int = 1;
            L1: while (true) {
              if (param0 <= 1) {
                if (1 == param0) {
                  stackOut_8_0 = var3_int * param2;
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                } else {
                  stackOut_10_0 = var3_int;
                  stackIn_11_0 = stackOut_10_0;
                  break L0;
                }
              } else {
                L2: {
                  if ((1 & param0) == 0) {
                    break L2;
                  } else {
                    var3_int = var3_int * param2;
                    break L2;
                  }
                }
                param0 = param0 >> 1;
                param2 = param2 * param2;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw oj.a((Throwable) (Object) var3, "bl.F(" + param0 + ',' + -86 + ',' + param2 + ')');
        }
        return stackIn_11_0;
    }

    final int a(int param0) {
        if (param0 != -1) {
            int discarded$0 = ((bl) this).d(false);
            return ((bl) this).field_Z;
        }
        return ((bl) this).field_Z;
    }

    public static void e() {
        field_T = null;
        field_O = null;
        field_V = null;
        field_S = null;
        field_Q = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_O = new int[2][5];
        field_P = 0;
        field_S = new rj();
        field_U = true;
        field_Q = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    }
}
