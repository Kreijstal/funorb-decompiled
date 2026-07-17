/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uf {
    static int field_a;
    static String field_b;

    final static boolean a(char param0, byte param1) {
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        if (param1 <= -55) {
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
                    if (param0 != 45) {
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
          return true;
        }
    }

    final static q a(boolean param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object stackIn_7_0 = null;
        q stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        q stackOut_11_0 = null;
        Object stackOut_6_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var5 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var2_int = param1.length();
            var3 = 0;
            L1: while (true) {
              if (var3 >= var2_int) {
                stackOut_11_0 = vc.field_N;
                stackIn_12_0 = stackOut_11_0;
                break L0;
              } else {
                var4 = param1.charAt(var3);
                if (var4 >= 48) {
                  if (var4 <= 57) {
                    var3++;
                    continue L1;
                  } else {
                    stackOut_6_0 = null;
                    stackIn_7_0 = stackOut_6_0;
                    return (q) (Object) stackIn_7_0;
                  }
                } else {
                  return null;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var2;
            stackOut_13_1 = new StringBuilder().append("uf.D(").append(0).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L2;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L2;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
        return stackIn_12_0;
    }

    public static void a(int param0) {
        field_b = null;
    }

    final static boolean a() {
        return !dl.field_l.b(-26753);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 20;
        field_b = "Create your own free Jagex account";
    }
}
