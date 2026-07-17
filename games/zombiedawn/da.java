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

    public static void c() {
        field_j = null;
        field_l = null;
        field_m = null;
        field_i = null;
    }

    final static void d() {
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
              int discarded$13 = 103;
              if (!jh.a()) {
                break L0;
              } else {
                var1.j(11, 8);
                int fieldTemp$14 = var1.field_j + 1;
                var1.field_j = var1.field_j + 1;
                var2 = fieldTemp$14;
                int discarded$15 = 84;
                dn.a(var1);
                dp.field_e.d(-128, var1.field_j + -var2);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw sh.a((Throwable) (Object) var1_ref, "da.A(" + -48 + 41);
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
