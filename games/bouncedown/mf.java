/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mf {
    static int field_e;
    static bc field_d;
    static pc field_a;
    static tg field_b;
    static String field_c;

    public static void a(byte param0) {
        Object var2 = null;
        field_a = null;
        field_c = null;
        if (param0 > -87) {
          var2 = null;
          String discarded$2 = mf.a(-20, 44, (wi) null);
          field_d = null;
          field_b = null;
          return;
        } else {
          field_d = null;
          field_b = null;
          return;
        }
    }

    final static String a(int param0, int param1, wi param2) {
        int var3_int = 0;
        Exception var3 = null;
        byte[] var4 = null;
        String var5 = null;
        String stackIn_4_0 = null;
        Throwable decompiledCaughtException = null;
        String stackOut_3_0 = null;
        try {
          L0: {
            var3_int = param2.f(param1 ^ -2706);
            if (param0 < var3_int) {
              var3_int = param0;
              break L0;
            } else {
              break L0;
            }
          }
          var4 = new byte[var3_int];
          param2.field_h = param2.field_h + pa.field_d.a(var4, param2.field_h, 0, param2.field_i, param1 ^ param1, var3_int);
          var5 = lh.a(0, -3789, var3_int, var4);
          stackOut_3_0 = (String) var5;
          stackIn_4_0 = stackOut_3_0;
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = (Exception) (Object) decompiledCaughtException;
          return "Cabbage";
        }
        return stackIn_4_0;
    }

    final static int a(int param0, int param1, int param2) {
        if (param0 != 0) {
            return 12;
        }
        int var3 = param2 >>> -281766465;
        return -var3 + (param2 - -var3) / param1;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new bc();
        field_c = "This entry doesn't match";
    }
}
