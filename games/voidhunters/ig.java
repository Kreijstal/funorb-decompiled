/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ig extends rqa {
    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
            return null;
        }
        return new nc((Object) (Object) frb.a(11, 97));
    }

    ig(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        kga.field_o = param1;
        if (!(ldb.field_o == tb.field_b)) {
            var2 = ldb.field_o * ldb.field_o;
            var3 = -(tb.field_b * tb.field_b) + var2;
            param1 = param1 + (-param1 + uh.field_p) * var3 / var2;
        }
        hca.field_o.a(icb.field_o, param0 + 123, 640, param1, 120);
        hp.a(640, uh.field_p + -24, qs.field_c, false, hi.field_a, 5, param0);
    }

    static {
    }
}
