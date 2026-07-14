/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qj {
    private on field_b;
    long field_a;
    static java.applet.Applet field_c;
    static long field_d;

    qj(on param0, long param1, int param2) {
        ((qj) this).field_a = param1;
        ((qj) this).field_b = param0;
    }

    protected final void finalize() throws Throwable {
        ((qj) this).field_b.a(33984, ((qj) this).field_a);
        super.finalize();
    }

    public static void a(byte param0) {
        field_c = null;
        int var1 = 0 % ((8 - param0) / 63);
    }

    static {
    }
}
