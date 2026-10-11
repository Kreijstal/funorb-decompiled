/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mk {
    static oh field_b;
    static na field_a;
    static boolean field_c;

    final static String a(int param0, kk param1, String param2, String param3, byte param4) {
        RuntimeException var5 = null;
        String var6 = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1.c(-102)) {
            stackIn_2_0 = (String) (param3);
            return stackIn_2_0;
          }
          if (param4 <= 107) {
            var6 = (String) null;
            mk.a(-118, (kk) null, (String) null, (String) null, (byte) 60);
          }
          stackIn_6_0 = param2 + " - " + param1.a(param0, -24214) + "%";
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("mk.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param4).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_a = null;
        if (param0 != -3) {
          mk.a((byte) -6);
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
    }
}
