/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rh {
    static String field_b;
    static String field_a;

    final static byte[] a(String param0, byte param1) {
        RuntimeException var2 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -59) {
            field_a = (String) null;
          }
          stackIn_3_0 = jc.field_k.a("", 100, param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("rh.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void b(int param0) {
        field_b = null;
        field_a = null;
        int var1 = 97 / ((-28 - param0) / 34);
    }

    final static int a(int param0) {
        if (param0 != -16118) {
          rh.b(4);
          return sh.field_rb - dg.field_x;
        }
        return sh.field_rb - dg.field_x;
    }

    static {
    }
}
