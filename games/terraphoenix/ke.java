/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ke {
    static int field_f;
    static int field_e;
    static int field_c;
    static ci field_b;
    static fa field_d;
    static String field_g;
    static bg[] field_a;

    final static void a() {
    }

    final static void b() {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = Terraphoenix.field_V;
        try {
          L0: {
            var1_int = 0;
            L1: while (true) {
              if (4 <= var1_int) {
                break L0;
              } else {
                sj.field_a[var1_int] = new lg(var1_int);
                var1_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qk.a((Throwable) (Object) var1, "ke.E(" + 0 + 41);
        }
    }

    abstract byte[] c(boolean param0);

    abstract void a(byte[] param0, boolean param1);

    final static void a(java.applet.Applet param0, byte param1) {
        String var2 = null;
        String var3 = null;
        long var4 = 0L;
        try {
            bl.field_e = true;
            var2 = "tuhstatbut";
            var3 = "rvnadlm";
            var4 = -1L;
            ll.a(var3, var4, (byte) 116, param0, var2);
            int var6 = -64 / ((param1 - -40) / 38);
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "ke.D(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    public static void a(boolean param0) {
        field_g = null;
        field_d = null;
        field_b = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        kk.a(50, 100);
        field_g = "Left click to select destination";
    }
}
