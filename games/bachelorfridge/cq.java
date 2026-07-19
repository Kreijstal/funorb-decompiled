/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cq extends bw {
    je field_i;
    int field_f;
    static jg field_g;
    bw field_h;

    public static void c(byte param0) {
        field_g = null;
        int var1 = -118 / ((param0 - 24) / 34);
    }

    cq(je param0, bw param1) {
        try {
            this.field_i = param0;
            this.field_f = param0.g();
            this.field_h = param1;
            this.field_i.f(128 + b.field_u * this.field_f >> -799269624);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "cq.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_g = new jg();
    }
}
