/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class sk {
    static int field_b;
    static double[] field_a;
    static boolean[] field_c;

    public static void a(boolean param0) {
        field_c = null;
        if (!param0) {
            sk.a(false);
        }
        field_a = null;
    }

    final static boolean a(char param0, int param1) {
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        if (param1 <= -102) {
          L0: {
            L1: {
              if (param0 == 160) {
                break L1;
              } else {
                if (32 == param0) {
                  break L1;
                } else {
                  if (param0 == 95) {
                    break L1;
                  } else {
                    if (45 != param0) {
                      stackOut_8_0 = 0;
                      stackIn_9_0 = stackOut_8_0;
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            stackOut_7_0 = 1;
            stackIn_9_0 = stackOut_7_0;
            break L0;
          }
          return stackIn_9_0 != 0;
        } else {
          return false;
        }
    }

    final static boolean a(boolean param0, int param1, CharSequence param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var4 = stellarshard.field_B;
        try {
          L0: {
            if (!mj.a((byte) -27, false, param2)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              var3_int = 0;
              L1: while (true) {
                if (var3_int >= param2.length()) {
                  stackOut_12_0 = 1;
                  stackIn_13_0 = stackOut_12_0;
                  break L0;
                } else {
                  int discarded$15 = -123;
                  if (!b.a(param2.charAt(var3_int))) {
                    stackOut_9_0 = 0;
                    stackIn_10_0 = stackOut_9_0;
                    return stackIn_10_0 != 0;
                  } else {
                    var3_int++;
                    continue L1;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3;
            stackOut_14_1 = new StringBuilder().append("sk.H(").append(0).append(44).append(0).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L2;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L2;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
        return stackIn_13_0 != 0;
    }

    abstract ua a(int param0);

    abstract void a(int param0, ka param1);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new double[12];
    }
}
