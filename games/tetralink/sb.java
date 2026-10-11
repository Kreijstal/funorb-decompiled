/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sb {
    static byte[] field_b;
    static ah field_a;
    static String field_c;

    final static boolean a(byte param0, String param1) {
        RuntimeException var2 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 2) {
            sb.a((byte) 126);
          }
          stackIn_5_0 = (null != fh.a(-32055, param1));
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("sb.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_c = null;
        field_a = null;
        if (param0 == -30) {
          field_b = null;
          return;
        }
        String var2 = (String) null;
        sb.a((byte) 65, (String) null);
        field_b = null;
    }

    static {
        field_b = new byte[]{(byte)2};
        field_c = "You cannot chat to <%0> because <%0> is offline in your friend list.";
    }
}
