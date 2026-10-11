/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gm {
    static String field_a;
    static String field_e;
    static int field_c;
    static String field_b;
    static lb field_d;

    final static byte[] a(String param0, boolean param1) {
        RuntimeException var2 = null;
        String var3 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            var3 = (String) null;
            gm.a((String) null, true);
          }
          stackIn_3_0 = d.field_d.a("", param0, (byte) -128);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("gm.B(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_e = null;
        field_b = null;
        int var1 = 121 % ((-11 - param0) / 32);
        field_d = null;
    }

    static {
        field_a = "This trap is lethal.";
        field_e = "<col=FF0000>Defence -1</col>";
    }
}
