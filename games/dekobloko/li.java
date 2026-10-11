/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class li {
    static String field_g;
    static String field_a;
    static w field_h;
    static String field_f;
    static ri field_b;
    static ck field_i;
    static w field_d;
    static long field_e;
    static String field_c;

    final static String a(int param0, int param1, wl param2) {
        int var3_int = 0;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        String var5 = null;
        String stackIn_4_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          try {
            var3_int = param2.a(false);
            if (var3_int > param0) {
              var3_int = param0;
            }
            var4 = new byte[var3_int];
            param2.field_n = param2.field_n + me.field_z.a(param2.field_n, (byte) 91, param1, var4, param2.field_r, var3_int);
            var5 = un.a(var4, 0, 0, var3_int);
            stackIn_4_0 = var5;
            return stackIn_4_0;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            stackIn_6_0 = "Cabbage";
            return stackIn_6_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_9_0 = var3_ref;
          stackIn_9_1 = new StringBuilder().append("li.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_i = null;
        field_f = null;
        field_h = null;
        field_d = null;
        field_g = null;
        field_c = null;
        int var1 = 26 % ((param0 + 65) / 33);
        field_a = null;
    }

    static {
        field_a = "Email is valid";
        field_f = "Report <%0> for abuse";
        field_c = "Status";
        field_b = null;
        field_g = "You are invited to <%0>'s game.";
    }
}
