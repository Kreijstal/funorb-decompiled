/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rha extends vg {
    static String field_h;
    byte[] field_g;
    int field_i;
    long field_f;

    public static void a(int param0) {
        field_h = null;
        if (param0 != -29867) {
            field_h = (String) null;
        }
    }

    rha(long param0, int param1, byte[] param2) {
        try {
            this.field_i = param1;
            this.field_f = param0;
            this.field_g = param2;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "rha.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_h = "Johnsson";
    }
}
