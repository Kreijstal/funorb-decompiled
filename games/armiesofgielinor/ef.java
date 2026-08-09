/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ef extends Exception {
    static String[] field_d;
    static int field_c;
    int field_b;
    static String field_a;

    final static void b(int param0) {
        ro.field_lb = null;
        bv.field_w = null;
        og.field_p = null;
        vs.field_e = null;
        jf.field_C = null;
        pr.field_g = null;
        kl.field_a = null;
        cq.field_u = null;
        if (param0 != -1) {
            ef.b(95);
        }
    }

    ef(int param0) {
        this.field_b = param0;
    }

    final static void a(int param0, byte param1, int param2, boolean param3, int param4, int param5, int param6, String param7) {
        if (param1 <= 24) {
            return;
        }
        try {
            if (0 == we.field_f.field_yb) {
            } else {
                if (bb.field_a) {
                } else {
                    if (!vi.field_d) {
                        hf.field_c = true;
                    } else {
                        np.k(86);
                    }
                }
            }
            if (!hf.field_c) {
                return;
            }
            ts.a(param7, param2, param4, 20, param0, param0, param5, 15676, param6);
            eu.field_g.a(true, param3);
            if (param3) {
                if (qf.field_e.field_yb != 0) {
                    hf.field_c = false;
                }
                if (-1 != (ed.field_e.field_yb ^ -1)) {
                    rd.b(8445);
                    hf.field_c = false;
                    return;
                }
            }
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "ef.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + (param7 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 0) {
            field_c = 83;
            field_d = null;
            return;
        }
        field_d = null;
    }

    static {
        field_a = "Loading...";
    }
}
