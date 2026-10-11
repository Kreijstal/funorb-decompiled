/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ue {
    static ck field_b;
    static String field_d;
    static String field_a;
    static String field_c;

    final static boolean a(int param0, String param1) {
        RuntimeException var2 = null;
        String var3 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null == jk.field_a) {
            return false;
          }
          if (param0 != 2048) {
            var3 = (String) null;
            ue.a(-5, (String) null);
          }
          stackIn_8_0 = !(param1.toLowerCase().indexOf(jk.field_a.toLowerCase()) < 0);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_11_0 = var2;
          stackIn_11_1 = new StringBuilder().append("ue.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_a = null;
        field_d = null;
        if (param0 < -4) {
          field_c = null;
          return;
        }
        ue.a(-36, 12);
        field_c = null;
    }

    final static int a(int param0, int param1) {
        param0 = param0 & 8191;
        int var2 = -44 % ((param1 + 3) / 44);
        if (param0 >= 4096) {
          return param0 >= 6144 ? pd.field_i[-6144 + param0] : -pd.field_i[-param0 + 6144];
        }
        return 2048 <= param0 ? -pd.field_i[-2048 + param0] : pd.field_i[-param0 + 2048];
    }

    static {
        field_d = "Solicitation";
        field_c = "Tips";
        field_a = "Report abuse";
    }
}
