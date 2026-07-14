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
        int var2 = -126 % ((param0 - -56) / 41);
        return of.field_p;
    }

    final static String a(int param0, ec param1, int param2) {
        int var3_int = 0;
        Exception var3 = null;
        byte[] var4 = null;
        String var5 = null;
        int var6 = 0;
        String stackIn_4_0 = null;
        Throwable decompiledCaughtException = null;
        String stackOut_3_0 = null;
        try {
          L0: {
            var3_int = param1.d((byte) 58);
            if (var3_int > param0) {
              var3_int = param0;
              break L0;
            } else {
              break L0;
            }
          }
          var4 = new byte[var3_int];
          param1.field_o = param1.field_o + qh.field_G.a(param1.field_m, var4, (byte) -88, param1.field_o, 0, var3_int);
          var5 = mk.a((byte) -24, var4, var3_int, 0);
          var6 = 114 / ((param2 - 54) / 47);
          stackOut_3_0 = (String) var5;
          stackIn_4_0 = stackOut_3_0;
        } catch (java.lang.Exception decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          return stackIn_4_0;
        }
        return null;
    }

    sc(long param0, String param1) {
        super(param0, param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Suggested names: ";
    }
}
