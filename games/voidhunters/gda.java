/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gda extends ksa {
    ml field_m;
    static String field_k;
    int field_i;
    int field_e;
    ml field_h;
    int field_j;
    int field_g;
    static int field_d;
    int field_f;
    int field_l;

    public static void c(byte param0) {
        field_k = null;
    }

    gda(ml param0, int param1, ml param2, int param3, int param4, int param5, int param6, int param7) {
        try {
            ((gda) this).field_h = param0;
            ((gda) this).field_g = param3;
            ((gda) this).field_l = param5;
            ((gda) this).field_f = param7;
            ((gda) this).field_m = param2;
            ((gda) this).field_j = param6;
            ((gda) this).field_i = param1;
            ((gda) this).field_e = param4;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "gda.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 0;
        field_k = "You can join this game";
    }
}
