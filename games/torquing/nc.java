/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nc {
    static int field_a;
    static String field_c;
    static String field_b;
    static t[] field_d;

    final static void a(int param0, boolean param1) {
        ik var2 = null;
        int var3 = 0;
        int var4 = Torquing.field_u;
        try {
            if (ia.a(-22426, 0)) {
                param0 = 6;
            }
            var2 = (ik) ((Object) qc.field_Y.b(0));
            while (var2 != null) {
                if ((var2.field_p ^ -1) != (param0 ^ -1)) {
                    var2.a(param0, !param1 ? true : false);
                }
                var3 = var2.field_r;
                if (!(4 != param0)) {
                    var3 = var2.field_r >> -1475667966;
                }
                if (!(-8 != (param0 ^ -1))) {
                    var3 = (var2.field_n + 480) * var2.field_r / 1920;
                }
                var2.field_j.e(var2.field_l >> 1895814082, 0, var3);
                var2 = (ik) ((Object) qc.field_Y.f(-24059));
            }
            if (!param1) {
                nc.a(-39);
                return;
            }
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) ((Object) runtimeException), "nc.B(" + param0 + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 < 53) {
            return;
        }
        field_d = null;
        field_c = null;
        field_b = null;
    }

    static {
        field_b = "Circuitous Route";
        field_c = "Skin";
    }
}
