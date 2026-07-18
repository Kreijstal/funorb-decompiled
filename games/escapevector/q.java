/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class q extends hc {
    int field_M;
    private int field_D;
    static java.math.BigInteger field_O;
    static String field_F;
    static boolean field_P;
    private static boolean[] field_N;
    private static boolean[] field_Q;
    static String field_H;
    private static boolean[] field_I;
    static boolean[][] field_E;
    static String[] field_L;
    int field_J;
    static ed field_G;
    private kn field_K;

    final boolean a(int param0, int param1, byte param2, int param3, int param4, hm param5, int param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_24_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_23_0 = 0;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var14 = EscapeVector.field_A;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3, param4, param5, param6)) {
              L1: {
                var8_int = -((q) this).field_M + (param1 + -param4);
                var9 = -(2 * ((q) this).field_M) + ((q) this).field_g;
                if (var8_int > var9) {
                  var8_int = var9;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (var8_int < 0) {
                  var8_int = 0;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                var8_int = var8_int * ((q) this).field_D / var9;
                if (param6 == 1) {
                  ((q) this).field_K.a(var8_int, (byte) -51);
                  break L3;
                } else {
                  if (param6 == 2) {
                    var10 = 2147483647;
                    var11 = -1;
                    var12 = 0;
                    L4: while (true) {
                      if (((q) this).field_K.a(true) <= var12) {
                        if (var11 < 0) {
                          break L3;
                        } else {
                          ((q) this).field_K.c(0, var11);
                          break L3;
                        }
                      } else {
                        L5: {
                          var13 = -var8_int + ((q) this).field_K.a(-49, var12);
                          var13 = var13 * var13;
                          if (var13 >= var10) {
                            var12++;
                            break L5;
                          } else {
                            var10 = var13;
                            var11 = var12;
                            var12++;
                            break L5;
                          }
                        }
                        var12++;
                        continue L4;
                      }
                    }
                  } else {
                    return true;
                  }
                }
              }
              stackOut_23_0 = 1;
              stackIn_24_0 = stackOut_23_0;
              break L0;
            } else {
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var8 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var8;
            stackOut_25_1 = new StringBuilder().append("q.V(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param5 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L6;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L6;
            }
          }
          throw t.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + ',' + param6 + ')');
        }
        return stackIn_24_0 != 0;
    }

    final int e(byte param0) {
        if (param0 != 98) {
            return 116;
        }
        return ((q) this).field_K.a(true);
    }

    final int b(int param0, byte param1) {
        if (param0 >= 0) {
          if (((q) this).field_K.a(true) > param0) {
            if (param1 != 97) {
              ((q) this).field_D = 112;
              return ((q) this).field_K.a(-109, param0);
            } else {
              return ((q) this).field_K.a(-109, param0);
            }
          } else {
            return -1;
          }
        } else {
          return -1;
        }
    }

    public static void a(byte param0) {
        field_Q = null;
        field_H = null;
        field_L = null;
        field_O = null;
        field_I = null;
        field_G = null;
        field_N = null;
        field_F = null;
        field_E = null;
    }

    final int k(int param0) {
        Object var3 = null;
        if (param0 != -1) {
          var3 = null;
          boolean discarded$2 = ((q) this).a(-27, -35, (byte) -19, -117, -67, (hm) null, 21);
          return ((q) this).field_D;
        } else {
          return ((q) this).field_D;
        }
    }

    final static void c(int param0, byte param1) {
        c var2 = null;
        if (param1 >= -60) {
          field_P = true;
          var2 = om.field_c;
          var2.a(6, true);
          var2.f(1, -123);
          var2.f(0, -123);
          return;
        } else {
          var2 = om.field_c;
          var2.a(6, true);
          var2.f(1, -123);
          var2.f(0, -123);
          return;
        }
    }

    private q() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_O = new java.math.BigInteger("65537");
        field_H = "Unpacking music";
        field_F = "Creating a Jagex account is simple and free. Your account will remember your progress, highscores and achievements in every game. You can also use it to play some of our multiplayer games - and Jagex's other games!<br><br><col=2164A2>Please note - if you have a RuneScape account, you can click 'Go Back' and use your existing account to log in!</col>";
        field_N = new boolean[]{false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false};
        field_I = new boolean[]{true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false};
        field_L = new String[]{"layer0", "layer1", "layer2", "layer3"};
        field_Q = new boolean[]{false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false};
        field_E = new boolean[][]{field_N, field_N, field_Q, field_I};
    }
}
