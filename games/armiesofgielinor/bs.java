/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bs {
    static je field_a;
    static int[] field_b;
    static String field_c;

    public static void a(boolean param0) {
        if (!param0) {
          return;
        }
        field_a = null;
        field_c = null;
        field_b = null;
    }

    final static int a(byte param0) {
        int var1 = 0 % ((-32 - param0) / 48);
        return fc.field_b;
    }

    final static int a(PacketBuffer param0, int param1) {
        int var2_int = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          var2_int = param0.payload[param1 + param0.position];
          if (param0.payload[param0.position] == we.field_a[0] &&
            param0.payload[param0.position + 1] == we.field_a[1] &&
            we.field_a[2] == param0.payload[param0.position + 2]) {
            param0.readInt(1);
          } else {
            var2_int = -1;
          }
          stackIn_7_0 = var2_int;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("bs.C(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_c = "Buying or selling an account";
        field_b = new int[]{2, 4, 6, 8};
    }
}
