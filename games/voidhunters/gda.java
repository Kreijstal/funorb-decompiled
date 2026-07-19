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
        if (param0 != 18) {
            field_d = -107;
        }
    }

    gda(ml param0, int param1, ml param2, int param3, int param4, int param5, int param6, int param7) {
        try {
            this.field_h = param0;
            this.field_g = param3;
            this.field_l = param5;
            this.field_f = param7;
            this.field_m = param2;
            this.field_j = param6;
            this.field_i = param1;
            this.field_e = param4;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "gda.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    static {
        field_d = 0;
        field_k = "You can join this game";
    }
}
