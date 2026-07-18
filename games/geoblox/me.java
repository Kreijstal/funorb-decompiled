/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class me extends hf {
    float field_k;
    int field_h;
    static int field_l;
    float field_i;
    String field_m;
    float field_n;
    static String field_j;
    int field_f;
    static sl field_g;

    final static void b(int param0) {
        if (fj.field_p != null) {
            fj.field_p.c();
            if (!(null == oh.field_a)) {
                oh.field_a.c();
            }
            return;
        }
        if (!(null == oh.field_a)) {
            oh.field_a.c();
        }
    }

    public static void c(byte param0) {
        field_g = null;
        field_j = null;
    }

    final static void a(byte param0) {
        jk.field_d = 1;
    }

    final static void a(int param0, qc param1) {
        int var2_int = 0;
        try {
            rd.field_v = param1.b(true) << 5;
            var2_int = param1.c((byte) 34);
            rd.field_v = rd.field_v + (var2_int >> 3);
            h.field_b = var2_int << 18 & 1835008;
            h.field_b = h.field_b + (param1.b(true) << 2);
            var2_int = param1.c((byte) 34);
            fe.field_g = var2_int << 15 & 2064384;
            h.field_b = h.field_b + (var2_int >> 6);
            fe.field_g = fe.field_g + (param1.c((byte) 34) << 7);
            var2_int = param1.c((byte) 34);
            fe.field_g = fe.field_g + (var2_int >> 1);
            lc.field_b = (var2_int & 1) << 16;
            lc.field_b = lc.field_b + param1.b(true);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "me.B(" + 116 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    me() {
        ((me) this).field_k = 0.0f;
        ((me) this).field_f = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = -1;
    }
}
