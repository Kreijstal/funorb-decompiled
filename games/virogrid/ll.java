/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ll {
    static int field_d;
    static int field_b;
    static String field_c;
    static String field_a;

    public static void a(byte param0) {
        field_c = null;
        field_a = null;
        int var1 = 10 % ((param0 - 41) / 60);
    }

    final static String a(byte param0, CharSequence[] param1) {
        RuntimeException var2 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= 6) {
            stackIn_4_0 = mh.a(param1, (byte) 111, 0, param1.length);
            return stackIn_4_0;
          }
          stackIn_2_0 = (String) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("ll.O(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    static {
        field_b = 0;
        field_c = "Username: ";
        field_a = "Error connecting to server. Please try using a different server.";
    }
}
