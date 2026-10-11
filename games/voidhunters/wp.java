/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wp {
    static int field_a;
    static int field_b;

    final static String a(Class param0, boolean param1) {
        RuntimeException var2 = null;
        String stackIn_4_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            field_a = 17;
          }
          if (!param0.isArray()) {
            stackIn_6_0 = param0.getName().substring(param0.getName().lastIndexOf(".") + 1);
            return stackIn_6_0;
          }
          stackIn_4_0 = wp.a(param0.getComponentType(), param1) + "[]";
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("wp.A(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_b = 0;
        field_a = field_b;
    }
}
