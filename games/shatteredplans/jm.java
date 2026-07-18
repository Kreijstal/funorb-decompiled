/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jm extends kp {
    static bi field_r;
    static String field_s;
    static int field_t;
    static String field_q;

    final static void a(String param0, boolean param1, byte param2, boolean param3) {
        try {
            int discarded$0 = -1;
            fe.f();
            le.field_e.k(104);
            no.field_e = new ri(qh.field_B, (String) null, el.field_b, param3, param1);
            if (param2 > -50) {
                field_s = null;
            }
            ae.field_f = new hk(le.field_e, (vg) (Object) no.field_e);
            le.field_e.a(true, (vg) (Object) ae.field_f);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "jm.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void d() {
        field_r = null;
        field_q = null;
        field_s = null;
    }

    jm(long param0, String param1) {
        super(param0, param1);
    }

    final ds a(byte param0) {
        int var2 = -78 / ((param0 - -7) / 41);
        return tm.field_p;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = "Members";
        field_q = "<%0> points, <%1> points per turn.";
    }
}
