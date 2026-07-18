/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cq extends bw {
    je field_i;
    int field_f;
    static jg field_g;
    bw field_h;

    public static void c() {
        field_g = null;
        int var1 = -118;
    }

    cq(je param0, bw param1) {
        try {
            ((cq) this).field_i = param0;
            ((cq) this).field_f = param0.g();
            ((cq) this).field_h = param1;
            ((cq) this).field_i.f(128 + b.field_u * ((cq) this).field_f >> 8);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "cq.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new jg();
    }
}
