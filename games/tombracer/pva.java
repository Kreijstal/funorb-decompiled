/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pva {
    private cka field_b;
    int field_a;

    protected final void finalize() throws Throwable {
        this.field_b.i(this.field_a, -1);
        super.finalize();
    }

    pva(cka param0, int param1, int param2) {
        try {
            this.field_a = param2;
            this.field_b = param0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "pva.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
    }
}
