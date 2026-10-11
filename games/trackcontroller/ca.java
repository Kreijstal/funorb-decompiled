/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ca {
    static ba field_b;
    static int[] field_c;
    static String[] field_a;
    static String field_d;

    public static void a(int param0) {
        field_d = null;
        field_b = null;
        field_c = null;
        field_a = null;
        if (param0 < 116) {
          field_b = (ba) null;
        }
    }

    final static j a(String param0, int param1) {
        RuntimeException var2 = null;
        j stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 647) {
            field_d = (String) null;
          }
          if (sa.field_Q.b((byte) 86) &&
            !param0.equals(sa.field_Q.a((byte) 63))) {
            sa.field_Q = c.a(param0, 30692);
          }
          stackIn_7_0 = sa.field_Q;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("ca.A(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_b = new ba();
        field_d = "Restart Level";
    }
}
