/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lo {
    static String[] field_c;
    static int[] field_b;
    static int[] field_a;
    static boolean field_d;

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a() {
        field_c = null;
        field_b = null;
        field_a = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, j param7) {
        Object var8 = null;
        String var8_ref = null;
        RuntimeException var8_ref2 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_5_0 = null;
        String stackOut_4_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              var8 = null;
              if (param7.field_V == 0) {
                break L1;
              } else {
                if (1 != param4) {
                  L2: {
                    if (param7.field_V < 0) {
                      stackOut_5_0 = Integer.toString(param7.field_V);
                      stackIn_6_0 = stackOut_5_0;
                      break L2;
                    } else {
                      stackOut_4_0 = rd.a(hh.field_e, new String[1], (byte) 103);
                      stackIn_6_0 = stackOut_4_0;
                      break L2;
                    }
                  }
                  var8_ref = stackIn_6_0;
                  ce.field_e.b(var8_ref, param3 + param0 / (param4 * 2), 60 / param4 + (param5 + (param6 / (param4 * 2) - -ce.field_e.field_F)), 2, -1, param1);
                  break L1;
                } else {
                  return;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8_ref2 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var8_ref2;
            stackOut_8_1 = new StringBuilder().append("lo.A(").append(param0).append(',').append(param1).append(',').append(60).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param7 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new String[]{"levels_icons"};
        field_a = new int[]{7, 38};
        field_b = new int[128];
    }
}
