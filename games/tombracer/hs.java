/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hs {
    private static int[] field_a;
    static String field_b;
    static float field_c;
    static String field_d;

    public final String toString() {
        throw new IllegalStateException();
    }

    final static boolean a(byte param0, Class param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                var2_int = -35 / ((param0 - 32) / 47);
                if (param1 == Integer.TYPE) {
                  break L2;
                } else {
                  if (param1 == Short.TYPE) {
                    break L2;
                  } else {
                    if (Long.TYPE == param1) {
                      break L2;
                    } else {
                      if (Byte.TYPE == param1) {
                        break L2;
                      } else {
                        if (Float.TYPE == param1) {
                          break L2;
                        } else {
                          if (Double.TYPE != param1) {
                            stackOut_8_0 = 0;
                            stackIn_9_0 = stackOut_8_0;
                            break L1;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                  }
                }
              }
              stackOut_7_0 = 1;
              stackIn_9_0 = stackOut_7_0;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var2;
            stackOut_10_1 = new StringBuilder().append("hs.A(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
        return stackIn_9_0 != 0;
    }

    final static void a(boolean param0) {
        int var2 = 109;
        if (!(era.field_d == null)) {
            bea.d(bea.field_b, bea.field_h, -bea.field_b + bea.field_d, -bea.field_h + bea.field_k);
            era.field_d.b(64, param0);
        }
    }

    public static void a() {
        field_b = null;
        field_d = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        long var6 = 0L;
        long var4 = 0L;
        int var2 = 0;
        int var3 = 0;
        int var1 = 0;
        field_a = new int[98304];
        for (var0 = 92682; var0 >= 46341; var0--) {
            var6 = (long)(1 + (var0 << 1));
            var4 = (long)(-1 + (var0 << 1));
            var2 = (int)((var4 * var4 >> 18) + -32768L);
            var3 = (int)((var6 * var6 >> 18) + -32768L);
            if (!(var3 < field_a.length)) {
                var3 = -1 + field_a.length;
            }
            for (var1 = var2 < 0 ? 0 : var2; var1 <= var3; var1++) {
                field_a[var1] = var0;
            }
        }
        field_b = "Inviting <%0>";
        field_d = "Quick Chat lobby";
    }
}
