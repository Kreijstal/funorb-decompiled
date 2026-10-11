/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dj {
    static ng field_c;
    static int field_b;
    static String field_a;

    public static void a(int param0) {
        int var1 = -91 / ((param0 + 10) / 34);
        field_c = null;
        field_a = null;
    }

    final static boolean a(byte param0, String param1) {
        RuntimeException var2 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 44) {
            field_c = (ng) null;
          }
          stackIn_5_0 = (sg.a((byte) 79, param1) != null);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("dj.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    static {
        field_b = 50;
        field_a = "Play free version";
        field_c = new ng();
    }
}
