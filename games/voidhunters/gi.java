/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gi {
    static int field_b;
    static int field_a;

    final static ge a(String param0, byte param1) {
        RuntimeException var2 = null;
        String var3 = null;
        ge stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 110) {
            var3 = (String) null;
            gi.a((String) null, (byte) 101);
          }
          stackIn_3_0 = new ge(param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("gi.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_b = -1;
    }
}
