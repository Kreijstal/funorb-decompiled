/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ea {
    static ib field_a;
    static int[] field_d;
    static int field_b;
    static int field_c;

    final static String a(byte param0, gk param1, int param2) {
        int var3_int = 0;
        Exception var3 = null;
        byte[] var4 = null;
        String var5 = null;
        String stackIn_6_0 = null;
        Throwable decompiledCaughtException = null;
        String stackOut_5_0 = null;
        try {
          L0: {
            var3_int = param1.o(-1);
            if (var3_int > param2) {
              var3_int = param2;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            var4 = new byte[var3_int];
            if (param0 == 90) {
              break L1;
            } else {
              ea.a(-85);
              break L1;
            }
          }
          param1.field_h = param1.field_h + jc.field_d.a(-1, 0, param1.field_h, var3_int, var4, param1.field_g);
          var5 = sc.a(var4, var3_int, param0 ^ -106, 0);
          stackOut_5_0 = (String) var5;
          stackIn_6_0 = stackOut_5_0;
        } catch (java.lang.Exception decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          return stackIn_6_0;
        }
        return null;
    }

    public static void a(int param0) {
        if (param0 != 0) {
            field_c = 117;
            field_d = null;
            field_a = null;
            return;
        }
        field_d = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new ib();
        field_d = new int[8192];
    }
}
