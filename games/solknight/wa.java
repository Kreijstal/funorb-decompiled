/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wa {
    static volatile boolean field_b;
    static String field_a;

    static int a(int param0, int param1) {
        return param0 ^ param1;
    }

    final static boolean a(jd param0, byte param1) {
        RuntimeException var2 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < -107) {
            stackIn_6_0 = (param0.d((byte) 48, 1) == 1);
            return stackIn_6_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("wa.A(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 != -2) {
          wa.a(85);
          field_a = null;
          return;
        }
        field_a = null;
    }

    static {
        field_b = true;
    }
}
