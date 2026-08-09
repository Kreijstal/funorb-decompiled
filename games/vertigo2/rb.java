/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class rb {
    static String field_b;
    static String field_a;

    public static void a(boolean param0) {
        field_a = null;
        field_b = null;
        if (!param0) {
            field_b = (String) null;
        }
    }

    final static pl a(byte param0, ed param1) {
        RuntimeException var2 = null;
        pl stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 > 80) {
                break L1;
              } else {
                field_b = (String) null;
                break L1;
              }
            }
            stackIn_3_0 = new pl(param1.n(2), param1.n(2), param1.n(2), param1.n(2), param1.m(0), param1.m(0), param1.h(-11));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("rb.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    static {
        field_b = "You are offering to draw.";
        field_a = "Achievements";
    }
}
