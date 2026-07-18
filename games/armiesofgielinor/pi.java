/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pi extends fw {
    private fh field_Q;
    int field_R;
    private int field_L;
    int field_S;
    static int[][] field_M;
    static String field_P;
    static je field_N;
    static wk field_T;
    static String field_O;

    final int a(int param0, byte param1) {
        if (param0 >= 0) {
          if (param0 < ((pi) this).field_Q.a(-102)) {
            if (param1 != -47) {
              return -9;
            } else {
              return ((pi) this).field_Q.d(param0, 652110180);
            }
          } else {
            return -1;
          }
        } else {
          return -1;
        }
    }

    final int d(byte param0) {
        if (param0 != -39) {
            return -55;
        }
        return ((pi) this).field_Q.a(param0 ^ 85);
    }

    final boolean a(int param0, int param1, int param2, int param3, kb param4, int param5, int param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_26_0 = 0;
        int stackIn_28_0 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_27_0 = 0;
        int stackOut_25_0 = 0;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        var14 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3 > 103) {
                break L1;
              } else {
                field_N = null;
                break L1;
              }
            }
            if (!super.a(param0, param1, param2, 122, param4, param5, param6)) {
              stackOut_27_0 = 0;
              stackIn_28_0 = stackOut_27_0;
              break L0;
            } else {
              L2: {
                var8_int = -param1 + (param0 + -((pi) this).field_R);
                var9 = -(((pi) this).field_R * 2) + ((pi) this).field_l;
                if (var8_int > var9) {
                  var8_int = var9;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (var8_int < 0) {
                  var8_int = 0;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                var8_int = ((pi) this).field_L * var8_int / var9;
                if (param6 == 1) {
                  ((pi) this).field_Q.e(26884, var8_int);
                  break L4;
                } else {
                  if (param6 == 2) {
                    var10 = 2147483647;
                    var11 = -1;
                    var12 = 0;
                    L5: while (true) {
                      if (((pi) this).field_Q.a(-125) <= var12) {
                        if (0 <= var11) {
                          ((pi) this).field_Q.b(var11, -66);
                          break L4;
                        } else {
                          break L4;
                        }
                      } else {
                        var13 = ((pi) this).field_Q.d(var12, 652110180) - var8_int;
                        var13 = var13 * var13;
                        if (~var13 <= ~var10) {
                          var12++;
                          var12++;
                          continue L5;
                        } else {
                          var10 = var13;
                          var11 = var12;
                          var12++;
                          var12++;
                          continue L5;
                        }
                      }
                    }
                  } else {
                    return true;
                  }
                }
              }
              stackOut_25_0 = 1;
              stackIn_26_0 = stackOut_25_0;
              return stackIn_26_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var8 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) var8;
            stackOut_29_1 = new StringBuilder().append("pi.NA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param4 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L6;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L6;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_28_0 != 0;
    }

    final int a(int param0) {
        Object var3 = null;
        if (param0 != -1) {
          var3 = null;
          boolean discarded$2 = ((pi) this).a(104, -75, 118, -4, (kb) null, 10, 30);
          return ((pi) this).field_L;
        } else {
          return ((pi) this).field_L;
        }
    }

    public static void a(byte param0) {
        field_O = null;
        field_P = null;
        field_M = null;
        field_N = null;
        field_T = null;
    }

    private pi() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_P = "Most units";
        field_M = new int[][]{null, null, null, new int[4], null, new int[5]};
        field_O = "Just play";
    }
}
