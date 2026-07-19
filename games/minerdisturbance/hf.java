/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hf extends pi {
    static int field_r;
    static String field_p;
    static String field_s;
    static lf field_u;
    int field_o;
    static int field_t;
    static ul field_q;
    byte[] field_n;

    public static void a(int param0) {
        field_p = null;
        if (param0 != -16935) {
            return;
        }
        field_q = null;
        field_u = null;
        field_s = null;
    }

    hf(byte[] param0) {
        try {
            this.field_n = param0;
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) ((Object) runtimeException), "hf.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_s = "Went with a Bang";
        field_p = "Aqualung: Extends time that can be spent underwater.";
    }
}
