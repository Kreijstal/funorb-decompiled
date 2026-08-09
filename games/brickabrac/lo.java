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

    public static void a(byte param0) {
        if (param0 < 13) {
            return;
        }
        field_c = null;
        field_b = null;
        field_a = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, j param7) {
        Object var8 = null;
        String var8_ref = null;
        RuntimeException var8_ref2 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var8 = null;
              if (-1 == (param7.field_V ^ -1)) {
                break L1;
              } else {
                if (1 != param4) {
                  L2: {
                    if ((param7.field_V ^ -1) > -1) {
                      stackIn_6_0 = Integer.toString(param7.field_V);
                      break L2;
                    } else {
                      stackIn_6_0 = rd.a(hh.field_e, new String[]{Integer.toString(param7.field_V)}, (byte) 103);
                      break L2;
                    }
                  }
                  var8_ref = stackIn_6_0;
                  ce.field_e.b(var8_ref, param3 + param0 / (param4 * 2), 60 / param4 + (param5 + (param6 / (param4 * 2) - -ce.field_e.field_F)), 2, -1, param1);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            if (param2 == 60) {
              break L0;
            } else {
              lo.a((byte) 126);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8_ref2 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var8_ref2);

            stackIn_12_1 = new StringBuilder().append("lo.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');

            if (param7 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
    }

    static {
        field_c = new String[]{"levels_icons"};
        field_a = new int[]{7, 38};
        field_b = new int[128];
    }
}
