/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lt {
    String field_g;
    static volatile long field_b;
    String field_c;
    static Object field_f;
    String field_e;
    int field_d;
    cn field_h;
    static jpa field_a;

    final static boolean a(String param0, int param1) {
        RuntimeException var2 = null;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null == gj.field_q) {
            return false;
          }
          if (param1 == -1) {
            stackIn_10_0 = !(param0.toLowerCase().indexOf(gj.field_q.toLowerCase()) < 0);
            return stackIn_10_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_13_0 = var2;
          stackIn_13_1 = new StringBuilder().append("lt.A(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 >= -13) {
          return;
        }
        field_a = null;
        field_f = null;
    }

    static {
        field_b = 0L;
    }
}
