/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hj extends oh {
    static gh field_n;
    fs field_j;
    ln field_i;
    static String field_m;
    int field_h;
    static int field_k;
    static tm[] field_l;

    public static void a(byte param0) {
        field_l = null;
        field_m = null;
        field_n = null;
        if (param0 != 12) {
            field_n = (gh) null;
        }
    }

    hj(fs param0, ln param1, int param2) {
        try {
            this.field_h = param2;
            this.field_j = param0;
            this.field_i = param1;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "hj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_m = "Only show private chat from my friends and opponents";
        field_k = 0;
    }
}
