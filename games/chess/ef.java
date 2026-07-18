/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ef extends o {
    int field_k;
    static String field_l;
    static sa field_j;
    static jc field_n;
    static String field_m;

    final static void a(pf param0) {
        if (!(wf.field_R != param0)) {
            return;
        }
        try {
            fk.field_q.e(-3435);
            mh.field_d.g();
            wf.field_R = param0;
            if (wf.field_R != null) {
                fk.field_q.a(false, wf.field_R, 59);
            }
            int var2_int = 0;
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "ef.B(" + (param0 != null ? "{...}" : "null") + ',' + -102 + ')');
        }
    }

    ef(int param0) {
        ((ef) this).field_k = param0;
    }

    public static void a() {
        field_n = null;
        field_j = null;
        field_l = null;
        field_m = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "Hide chat";
        field_j = new sa();
        field_n = new jc();
        field_m = "Remove friend";
    }
}
