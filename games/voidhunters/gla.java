/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gla {
    int field_c;
    static String field_b;
    private jp field_a;

    protected final void finalize() throws Throwable {
        this.field_a.a(this.field_c, (byte) 98);
        super.finalize();
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != -5709) {
            gla.a(-15);
        }
    }

    gla(jp param0, int param1, int param2) {
        try {
            this.field_a = param0;
            this.field_c = param2;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "gla.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_b = "Click here or press V to select the grapple";
    }
}
