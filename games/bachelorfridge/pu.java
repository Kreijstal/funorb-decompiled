/*
 * Decompiled by CFR-JS 0.4.0.
 */
class pu extends bia {
    static gj field_j;
    static String field_k;

    pu() {
    }

    public static void c(byte param0) {
        field_k = null;
        field_j = null;
        int var1 = -64 % ((param0 - 74) / 49);
    }

    final static void a(vr param0, vr param1, int param2, vr param3, vr param4) {
        db.field_a = param1;
        if (param2 != -21201) {
            return;
        }
        try {
            ha.field_i = param4;
            oaa.field_b = param0;
            qb.field_l = param3;
            ai.field_d = new i(qb.field_l, ha.field_i);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "pu.I(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_k = "Spectate";
    }
}
