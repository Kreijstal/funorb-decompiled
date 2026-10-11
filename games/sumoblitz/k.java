/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class k {
    static String field_a;

    final static boolean a(ki param0, int param1, int param2, int param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        byte[] var5 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = param0.a((byte) 126, param1, param2);
          var4 = var5;
          if (param3 != -23046) {
            field_a = (String) null;
          }
          if (var5 == null) {
            return false;
          }
          eg.a(param3 ^ -23291, var5);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_10_0 = var4_ref;
          stackIn_10_1 = new StringBuilder().append("k.B(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(pd param0, int param1, byte param2) {
        pl var3 = null;
        try {
          if (param2 < 93) {
            field_a = (String) null;
          }
          var3 = as.field_v;
          var3.g(param1, 8);
          var3.b((byte) 111, param0.field_k);
          var3.b(-10, param0.field_o);
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "k.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != 28322) {
          field_a = (String) null;
          field_a = null;
          return;
        }
        field_a = null;
    }

    static {
        field_a = "start game";
    }
}
