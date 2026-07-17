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
            ((qj) this).field_a = param1;
            ((qj) this).field_b = param0;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "qj.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    protected final void finalize() throws Throwable {
        ((qj) this).field_b.a(33984, ((qj) this).field_a);
        super.finalize();
    }

    public static void a(byte param0) {
        field_c = null;
        int var1 = 0;
    }

    static {
    }
}
