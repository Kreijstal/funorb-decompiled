/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class c {
    static ud field_a;
    static String field_b;

    final static j a(String param0, int param1) {
        RuntimeException var2 = null;
        j stackIn_2_0 = null;
        j stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 30692) {
            stackIn_4_0 = new j(param0);
            return stackIn_4_0;
          }
          stackIn_2_0 = (j) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("c.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_a = null;
        if (param0 < 42) {
          String var2 = (String) null;
          c.a((String) null, -27);
        }
    }

    static {
        field_a = new ud();
        field_b = "Music: ";
    }
}
