/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wq {
    boolean field_a;
    static String field_c;
    String field_b;
    String field_d;

    final static Object a(boolean param0, byte param1, byte[] param2) {
        cb var3 = null;
        RuntimeException var3_ref = null;
        cb stackIn_6_0 = null;
        Object stackIn_9_0 = null;
        byte[] stackIn_12_0 = null;
        byte[] stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 == null) {
            return null;
          }
          if (param2.length > 136) {
            var3 = new cb();
            ((le) ((Object) var3)).a(param2, (byte) 95);
            stackIn_6_0 = var3;
            return stackIn_6_0;
          }
          if (param1 >= -124) {
            stackIn_9_0 = (Object) null;
            return stackIn_9_0;
          }
          if (!param0) {
            stackIn_14_0 = (byte[]) (param2);
            return stackIn_14_0;
          }
          stackIn_12_0 = ck.a(param2, false);
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("wq.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_c = null;
        int var1 = 68 / ((44 - param0) / 56);
    }

    static {
        field_c = "System captured<br><col=2F5FBF>(In colony colour)</col>";
    }
}
