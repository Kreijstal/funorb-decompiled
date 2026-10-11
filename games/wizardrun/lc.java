/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lc {
    static String field_c;
    static int field_a;
    static boolean field_d;
    static long field_b;

    final static boolean a(int param0, kl param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 0) {
            lc.a(-84);
          }
          stackIn_3_0 = param1.d(param0 ^ 48);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("lc.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_c = null;
        int var1 = 85 % ((30 - param0) / 62);
    }

    static {
        field_c = "If you charge all the way to the top you can capture the enemies.";
        field_b = 0L;
    }
}
