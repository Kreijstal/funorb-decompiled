/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uma {
    static String field_a;
    static boolean field_c;
    static vna field_b;

    final static int a(int param0, kh param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != -26803) {
            field_b = (vna) null;
          }
          stackIn_3_0 = (param1.b((byte) 44, param0) ^ 1 << -1 + param0) - (1 << -1 + param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("uma.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        if (param0 != -1) {
          field_a = (String) null;
        }
    }

    final static boolean b(int param0) {
        if (param0 != -1) {
          return false;
        }
        if (10 > gda.field_c) {
          return false;
        }
        if (!qga.field_m) {
          return !o.e(param0 + 540801) ? true : false;
        }
        return false;
    }

    static {
        field_a = "Remove name";
    }
}
