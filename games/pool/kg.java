/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kg extends ma {
    int field_o;
    byte[] field_p;
    static int field_m;
    static String field_q;
    static int field_n;
    static vh field_r;
    static int[] field_s;
    static int[] field_t;
    static vn field_l;

    final static String c(byte param0) {
        if (wd.field_Lb == ra.field_e) {
            return eo.field_Rb;
        }
        if (param0 <= 44) {
            String discarded$0 = kg.c((byte) 49);
            return qg.field_a;
        }
        return qg.field_a;
    }

    public static void d() {
        field_q = null;
        field_r = null;
        field_t = null;
        field_s = null;
        int var1 = 0;
        field_l = null;
    }

    final static void a() {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            hr.field_c = new ro[2];
            var2_int = 0;
            L1: while (true) {
              if (hr.field_c.length <= var2_int) {
                break L0;
              } else {
                hr.field_c[var2_int] = new ro();
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var2, "kg.A(" + 2 + 44 + 49 + 41);
        }
    }

    private kg() throws Throwable {
        throw new Error();
    }

    final static void a(int param0, boolean param1, int param2, int param3, int param4) {
        qe.field_y = param2;
        vc.field_K = param4;
        ch.field_I = param3;
        mm.field_b = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = -1;
        field_s = new int[]{0, 0};
        field_t = new int[4];
    }
}
