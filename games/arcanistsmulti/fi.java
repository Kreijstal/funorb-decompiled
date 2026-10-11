/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fi {
    static boolean field_h;
    static String field_a;
    static String field_b;
    static String field_g;
    static String field_f;
    static int field_e;
    static int[] field_c;
    static dl field_d;

    public static void a(byte param0) {
        field_g = null;
        field_d = null;
        field_c = null;
        field_f = null;
        field_a = null;
        field_b = null;
        if (param0 != 5) {
          fi.a((byte) -81);
        }
    }

    final static boolean a(CharSequence param0, int param1) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 10) {
            stackIn_4_0 = fj.a(97, param0, true, 10);
            return stackIn_4_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("fi.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_a = "Connection lost - attempting to reconnect";
        field_b = "Find opponents";
        field_g = "You can ask to join this game";
        field_c = new int[]{9, 10, 11};
        field_f = "Play rated game";
        field_e = 33;
    }
}
