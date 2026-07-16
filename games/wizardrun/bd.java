/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bd {
    static rc field_b;
    static oi field_a;
    static o[] field_c;

    final static eb a(Throwable param0, String param1) {
        eb var2 = null;
        if (!(param0 instanceof eb)) {
            var2 = new eb(param0, param1);
        } else {
            var2 = (eb) (Object) param0;
            var2.field_b = var2.field_b + 32 + param1;
        }
        return var2;
    }

    final static boolean b(int param0) {
        if (param0 < 20) {
            return true;
        }
        if (!(gd.field_c != -1)) {
            if (!hc.a(1, -28266)) {
                return false;
            }
            gd.field_c = nk.field_N.f(255);
            nk.field_N.field_m = 0;
        }
        if (!(1 != (gd.field_c ^ -1))) {
            if (hc.a(2, -28266)) {
                gd.field_c = nk.field_N.j(-14477);
                nk.field_N.field_m = 0;
                return hc.a(gd.field_c, -28266);
            }
            return false;
        }
        return hc.a(gd.field_c, -28266);
    }

    public static void c(int param0) {
        Object var2 = null;
        if (param0 != 1) {
          var2 = null;
          eb discarded$2 = bd.a((Throwable) null, (String) null);
          field_b = null;
          field_a = null;
          field_c = null;
          return;
        } else {
          field_b = null;
          field_a = null;
          field_c = null;
          return;
        }
    }

    final static void a(int param0) {
        kc.field_H = jl.c(4);
        u.field_A = new wi();
        if (param0 > -26) {
          field_b = null;
          di.a(true, true, 117);
          return;
        } else {
          di.a(true, true, 117);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new rc();
    }
}
