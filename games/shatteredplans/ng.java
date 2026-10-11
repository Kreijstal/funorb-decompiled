/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ng {
    static String field_b;
    static int[] field_a;

    final static boolean a(sl param0, byte param1) {
        RuntimeException var2 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == -95) {
            stackIn_6_0 = (param0.b((byte) 126, 1) == 1);
            return stackIn_6_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("ng.B(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        int var1 = -9 / ((39 - param0) / 63);
        field_b = null;
        field_a = null;
    }

    static {
        field_b = "Private";
        field_a = new int[128];
    }
}
