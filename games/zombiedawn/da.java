/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class da extends le {
    static dj field_l;
    static sf field_j;
    static String field_i;
    static int field_h;
    static String field_m;
    static int field_n;
    int field_k;

    public static void c(byte param0) {
        field_j = null;
        field_l = null;
        field_m = null;
        field_i = null;
    }

    final static void d(byte param0) {
        am var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = ZombieDawn.field_J;
        try {
          L0: {
            var1 = dp.field_e;
            L1: while (true) {
              if (!jh.a((byte) 103)) {
                break L0;
              } else {
                var1.j(11, 8);
                int fieldTemp$5 = var1.field_j + 1;
                var1.field_j = var1.field_j + 1;
                var2 = fieldTemp$5;
                dn.a(var1, 84);
                dp.field_e.d(-128, var1.field_j + -var2);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw sh.a((Throwable) (Object) var1_ref, "da.A(" + -48 + ')');
        }
    }

    da(int param0) {
        ((da) this).field_k = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = null;
        field_h = 25;
        field_n = 15;
    }
}
