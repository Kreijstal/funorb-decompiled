/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mc {
    static int field_a;
    static String field_b;
    static vh field_c;

    public static void a(int param0) {
        if (param0 != 17913) {
          return;
        }
        field_c = null;
        field_b = null;
    }

    final static int a(byte param0, int param1, CharSequence param2) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -38) {
            mc.a(-13);
          }
          stackIn_3_0 = uj.a(param2, (byte) 124, param1, true);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("mc.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    static {
        field_b = "Shoots";
    }
}
