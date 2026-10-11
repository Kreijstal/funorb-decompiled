/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ko {
    String field_f;
    static int field_e;
    boolean field_d;
    String field_c;
    static wk field_g;
    static int field_b;
    static String field_a;

    public static void a(boolean param0) {
        field_a = null;
        field_g = null;
        if (param0) {
          Object var2 = (Object) null;
          ko.a(false, -124, (Object) null);
        }
    }

    final static byte[] a(boolean param0, int param1, Object param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        Object var4 = null;
        mg var5 = null;
        Object stackIn_2_0 = null;
        byte[] stackIn_6_0 = null;
        byte[] stackIn_8_0 = null;
        byte[] stackIn_12_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 == null) {
            stackIn_2_0 = null;
            return (byte[]) (stackIn_2_0);
          }
          if (param2 instanceof byte[]) {
            var3 = (byte[]) (param2);
            if (param0) {
              stackIn_8_0 = kj.a(var3, 31732);
              return stackIn_8_0;
            }
            stackIn_6_0 = var3;
            return stackIn_6_0;
          }
          if (param2 instanceof mg) {
            var5 = (mg) (param2);
            stackIn_12_0 = var5.a(0);
            return stackIn_12_0;
          }
          if (param1 < 30) {
            var4 = (Object) null;
            ko.a(false, 22, (Object) null);
          }
          throw new IllegalArgumentException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_18_0 = var3_ref;
          stackIn_18_1 = new StringBuilder().append("ko.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    static {
        field_g = new wk(56, 56);
        field_b = 0;
        field_a = "Player";
    }
}
