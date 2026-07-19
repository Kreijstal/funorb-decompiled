/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vg extends fc {
    int field_k;
    int field_m;
    int field_j;
    int[] field_l;
    int field_n;
    int field_i;
    static boolean field_p;
    int field_q;
    static boolean field_o;

    final void a(int param0, int param1, int param2, int[] param3, int param4, int param5, int param6, int param7) {
        try {
            this.field_j = param1;
            this.field_i = param0;
            this.field_m = param7;
            this.field_n = param6;
            this.field_l = param3;
            if (param2 != 11033) {
                this.field_j = -106;
            }
            this.field_q = param4;
            this.field_k = param5;
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) ((Object) runtimeException), "vg.A(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    vg() {
    }

    static {
    }
}
