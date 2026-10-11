/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sc extends ch {
    static qg field_q;
    static String field_p;

    public static void b(byte param0) {
        field_q = null;
        field_p = null;
        if (param0 != -94) {
          sc.b((byte) -6);
        }
    }

    final fd b(int param0) {
        int var2 = -126 % ((param0 + 56) / 41);
        return of.field_p;
    }

    final static String a(int param0, ec param1, int param2) {
        int var3_int = 0;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        String var5 = null;
        int var6 = 0;
        String stackIn_4_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          try {
            var3_int = param1.d((byte) 58);
            if (var3_int > param0) {
              var3_int = param0;
            }
            var4 = new byte[var3_int];
            param1.field_o = param1.field_o + qh.field_G.a(param1.field_m, var4, (byte) -88, param1.field_o, 0, var3_int);
            var5 = mk.a((byte) -24, var4, var3_int, 0);
            var6 = 114 / ((param2 - 54) / 47);
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
          stackIn_9_1 = new StringBuilder().append("sc.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(')').toString());
        }
    }

    sc(long param0, String param1) {
        super(param0, param1);
    }

    static {
        field_p = "Suggested names: ";
    }
}
