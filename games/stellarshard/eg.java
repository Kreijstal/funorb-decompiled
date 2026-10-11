/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eg {
    static String[] field_a;
    static int field_d;
    static String field_c;
    static oj field_b;

    public static void b(int param0) {
        if (param0 > -85) {
          eg.b(42);
        }
        field_b = null;
        field_c = null;
        field_a = null;
    }

    final static int a(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = stellarshard.field_B;
        try {
          if (param0 > -26) {
            eg.b(12);
          }
          for (var1_int = 0; var1_int < 3000; var1_int++) {
            if (null == wk.field_b[var1_int]) {
              stackIn_8_0 = var1_int;
              return stackIn_8_0;
            }
          }
          stackIn_11_0 = -1;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var1), "eg.B(" + param0 + ')');
        }
    }

    static {
        field_a = new String[]{"Showing by rating", "Showing by win percentage"};
        field_c = "Change display name";
        field_b = new oj();
    }
}
