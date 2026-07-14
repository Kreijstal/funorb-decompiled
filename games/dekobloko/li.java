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
        byte[] var4 = null;
        String var5 = null;
        String stackIn_4_0 = null;
        Throwable decompiledCaughtException = null;
        String stackOut_3_0 = null;
        try {
          L0: {
            var3_int = param2.a(false);
            if (var3_int > param0) {
              var3_int = param0;
              break L0;
            } else {
              break L0;
            }
          }
          var4 = new byte[var3_int];
          param2.field_n = param2.field_n + me.field_z.a(param2.field_n, (byte) 91, param1, var4, param2.field_r, var3_int);
          var5 = un.a(var4, 0, 0, var3_int);
          stackOut_3_0 = (String) var5;
          stackIn_4_0 = stackOut_3_0;
        } catch (java.lang.Exception decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          return stackIn_4_0;
        }
        return null;
    }

    public static void a(int param0) {
        field_b = null;
        field_i = null;
        field_f = null;
        field_h = null;
        field_d = null;
        field_g = null;
        field_c = null;
        int var1 = 26 % ((param0 - -65) / 33);
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Email is valid";
        field_f = "Report <%0> for abuse";
        field_c = "Status";
        field_b = null;
        field_g = "You are invited to <%0>'s game.";
    }
}
