/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ScorePopup extends IntrusiveNode {
    float progress;
    int chainMultiplier;
    static int field_l;
    float originY;
    String pointsText;
    float originX;
    static String field_j;
    int points;
    static sl field_g;

    final static void b(int param0) {
        if (param0 <= 65) {
            return;
        }
        if (fj.field_p == null) {
            if (!(null == oh.field_a)) {
                oh.field_a.c();
            }
            return;
        }
        fj.field_p.c();
        if (!(null == oh.field_a)) {
            oh.field_a.c();
        }
    }

    public static void c(byte param0) {
        field_g = null;
        if (param0 != -40) {
            return;
        }
        field_j = null;
    }

    final static void a(byte param0) {
        jk.avatarSteeringDirectionId = 1;
        if (param0 != 38) {
            ScorePopup.c((byte) -26);
        }
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
            if (param0 <= 105) {
                ScorePopup.a((byte) 114);
            }
            fe.field_g = var2_int << 15 & 2064384;
            h.field_b = h.field_b + (var2_int >> 6);
            fe.field_g = fe.field_g + (param1.c((byte) 34) << 7);
            var2_int = param1.c((byte) 34);
            fe.field_g = fe.field_g + (var2_int >> 1);
            lc.field_b = (var2_int & 1) << 16;
            lc.field_b = lc.field_b + param1.b(true);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "me.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    ScorePopup() {
        this.progress = 0.0f;
        this.points = 0;
    }

    static {
        field_l = -1;
    }
}
