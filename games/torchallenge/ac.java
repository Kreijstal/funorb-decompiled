/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ac {
    static ka field_a;
    static int field_d;
    static long field_e;
    static p field_c;
    static String field_b;

    final static void a(java.math.BigInteger param0, byte param1, uf param2, java.math.BigInteger param3, uf param4) {
        lc.a(0, param4, 0, param2.field_m, param2.field_q, param3, param0);
        if (param1 != -105) {
            Object var6 = null;
            ac.a(true, 15, (ej) null, true, -63);
        }
    }

    final static jl a(boolean param0) {
        if (!param0) {
            return null;
        }
        return (jl) (Object) new bd();
    }

    final static void a(int param0) {
        if (param0 >= -106) {
            return;
        }
        gb.field_d.field_h = 0;
        gb.field_d.field_b = 0;
    }

    final static void a(boolean param0, int param1, ej param2, boolean param3, int param4) {
        la.field_d.a(12048, 1000000, param1, !param3 ? true : false, param4, param2);
        if (param0) {
            field_e = -106L;
            return;
        }
    }

    public static void b(int param0) {
        Object var2 = null;
        field_b = null;
        if (param0 > -50) {
          var2 = null;
          ac.a(true, -1, (ej) null, true, -127);
          field_c = null;
          field_a = null;
          return;
        } else {
          field_c = null;
          field_a = null;
          return;
        }
    }

    final static t a(long param0, String param1, int param2, String param3, boolean param4) {
        int var6 = 0;
        if (param0 == 0L) {
            if (param1 != null) {
                return (t) (Object) new kk(param1, param3);
            }
            if (!(!param4)) {
                return (t) (Object) new ri(param0, param3);
            }
            var6 = 63 / ((84 - param2) / 37);
            return (t) (Object) new na(param0, param3);
        }
        if (!(!param4)) {
            return (t) (Object) new ri(param0, param3);
        }
        var6 = 63 / ((84 - param2) / 37);
        return (t) (Object) new na(param0, param3);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Achievements";
        field_c = new p();
    }
}
