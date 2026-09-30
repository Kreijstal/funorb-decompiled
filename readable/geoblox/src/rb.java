/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rb {
    static String field_a;
    static boolean field_c;
    static int field_b;
    static v field_d;

    final static bg a(int param0, int param1, rh param2, int param3, rh param4) {
        RuntimeException var5 = null;
        bg stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                rb.a((byte) -35);
                break L1;
              }
            }
            if (mf.a(param0, param3, 107, param2)) {
              stackIn_6_0 = lc.a(4520, param4.a(param3, -28153, param0));
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("rb.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ')');
        }
        return stackIn_6_0;
    }

    public static void a(byte param0) {
        field_d = null;
        field_a = null;
        int var1 = -73 % ((-60 - param0) / 48);
    }

    static {
        field_a = "Cancel";
        field_d = null;
    }
}
