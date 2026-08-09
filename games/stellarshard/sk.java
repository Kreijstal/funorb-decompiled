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
                      stackIn_9_0 = 0;
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            stackIn_9_0 = 1;
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
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = stellarshard.field_B;
        try {
          L0: {
            if (!mj.a((byte) -27, param0, param2)) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var3_int = param1;
              L1: while (true) {
                if (var3_int >= param2.length()) {
                  stackIn_13_0 = 1;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (!b.a(param2.charAt(var3_int), (byte) -123)) {
                    stackIn_10_0 = 0;
                    decompiledRegionSelector0 = 1;
                    break L0;
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
            stackIn_16_0 = (RuntimeException) (var3);

            stackIn_16_1 = new StringBuilder().append("sk.H(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L2;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L2;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0 != 0;
          } else {
            return stackIn_13_0 != 0;
          }
        }
    }

    abstract ua a(int param0);

    abstract void a(int param0, ka param1);

    static {
        field_a = new double[12];
    }
}
