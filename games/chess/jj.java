/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jj {
    static ci field_f;
    static dd[] field_c;
    static c field_d;
    static c field_b;
    static um field_e;
    static hn field_a;

    final static void c(int param0) {
        nk var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Chess.field_G;
        try {
          L0: {
            var1 = qn.field_U;
            L1: while (true) {
              if (!ci.g(2147483647)) {
                break L0;
              } else {
                var1.f(8, -65);
                int fieldTemp$5 = var1.field_l + 1;
                var1.field_l = var1.field_l + 1;
                var2 = fieldTemp$5;
                de.a(var1, (byte) 67);
                qn.field_U.a(var1.field_l + -var2, -1);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw fk.a((Throwable) (Object) var1_ref, "jj.C(" + 8 + ')');
        }
    }

    public static void a(int param0) {
        field_f = null;
        field_c = null;
        field_a = null;
        field_e = null;
        field_b = null;
        field_d = null;
    }

    final static boolean b(int param0) {
        return cd.field_x != null || an.field_c;
    }

    final static boolean d(int param0) {
        int var1 = 103;
        if (ch.field_gb == null) {
            return false;
        }
        if (!ch.field_gb.b(-1)) {
            return false;
        }
        return true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new dd[7];
    }
}
