/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ai {
    static String field_d;
    static boolean field_a;
    static String field_b;
    static String field_c;

    public static void a(byte param0) {
        if (param0 != 41) {
          field_c = (String) null;
          field_c = null;
          field_d = null;
          field_b = null;
          return;
        } else {
          field_c = null;
          field_d = null;
          field_b = null;
          return;
        }
    }

    final static us a(byte param0, String param1) {
        RuntimeException var2 = null;
        us stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 > 114) {
                break L1;
              } else {
                field_d = (String) null;
                break L1;
              }
            }
            stackIn_3_0 = new us(param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("ai.A(").append(param0).append(',');

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
          throw tba.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    static {
        field_d = "Remove friend";
        field_b = "This game option is only available to members.";
        field_c = "Honour";
    }
}
