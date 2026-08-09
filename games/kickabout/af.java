/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class af {
    static int[] field_b;
    static dt[] field_a;
    static String field_c;
    static hd field_d;

    final static int a(up param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_int = 5 * gp.a(param0, -576054046) / 3;
              if (param1 < (var2_int ^ -1)) {
                var2_int = 30;
                break L1;
              } else {
                break L1;
              }
            }
            stackIn_4_0 = var2_int;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("af.B(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    public static void a(byte param0) {
        field_d = null;
        field_c = null;
        field_b = null;
        field_a = null;
        int var1 = -21 / ((param0 - 9) / 34);
    }

    static {
        field_b = new int[]{156, 154};
        field_c = "<%0> is not on your friend list.";
    }
}
