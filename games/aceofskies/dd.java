/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dd {
    static int[] field_c;
    static String field_d;
    static String field_b;
    static int field_a;

    final static SocketConnector a(String param0, int param1, int param2) {
        String stackIn_5_2 = null;
        try {
          int var3_int = -17 % ((param2 + 32) / 35);
          ProxySocketConnector var4 = new ProxySocketConnector();
          ((SocketConnector) ((Object) var4)).port = param1;
          ((SocketConnector) ((Object) var4)).host = param0;
          ProxySocketConnector stackIn_1_0 = var4;
          return (SocketConnector) ((Object) stackIn_1_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_4_0 = var3;
          StringBuilder stackIn_4_1 = new StringBuilder().append("dd.A(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 != -31619) {
          return;
        }
        field_d = null;
        field_b = null;
    }

    static {
        field_b = "Age:";
        field_d = "Cancel";
    }
}
