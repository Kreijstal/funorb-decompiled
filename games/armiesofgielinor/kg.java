/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kg {
    int field_a;
    static String field_c;
    static boolean field_d;
    int field_e;
    int field_b;

    public static void a(byte param0) {
        if (param0 >= -43) {
          field_c = (String) null;
          field_c = null;
          return;
        }
        field_c = null;
    }

    final static boolean a(String param0, int param1) {
        RuntimeException var2 = null;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (wl.field_I == null) {
            return false;
          }
          if (param1 > 34) {
            stackIn_10_0 = !(0 > param0.toLowerCase().indexOf(wl.field_I.toLowerCase()));
            return stackIn_10_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_13_0 = var2;
          stackIn_13_1 = new StringBuilder().append("kg.B(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_c = "More options";
    }
}
