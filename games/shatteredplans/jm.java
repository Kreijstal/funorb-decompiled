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
            fe.f(-1);
            le.field_e.k(104);
            no.field_e = new ri(qh.field_B, (String) null, el.field_b, param3, param1);
            if (param2 > -50) {
                field_s = (String) null;
            }
            ae.field_f = new hk(le.field_e, no.field_e);
            le.field_e.a(true, ae.field_f);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "jm.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void d(int param0) {
        field_r = null;
        field_q = null;
        field_s = null;
        if (param0 != 22595) {
            field_r = (bi) null;
        }
    }

    jm(long param0, String param1) {
        super(param0, param1);
    }

    final ds a(byte param0) {
        int var2 = -78 / ((param0 - -7) / 41);
        return tm.field_p;
    }

    static {
        field_s = "Members";
        field_q = "<%0> points, <%1> points per turn.";
    }
}
