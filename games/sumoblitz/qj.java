/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qj {
    private on field_b;
    long field_a;
    static java.applet.Applet field_c;
    static long field_d;

    qj(on param0, long param1, int param2) {
        try {
            this.field_a = param1;
            this.field_b = param0;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "qj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    protected final void finalize() throws Throwable {
        this.field_b.a(33984, this.field_a);
        super.finalize();
    }

    public static void a(byte param0) {
        field_c = null;
        int var1 = 0 % ((8 - param0) / 63);
    }

    static {
    }
}
