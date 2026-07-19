/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class of {
    static gj field_a;
    long field_c;
    private qfa field_b;

    protected final void finalize() throws Throwable {
        this.field_b.a((byte) 18, this.field_c);
        super.finalize();
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 8345) {
            field_a = (gj) null;
        }
    }

    of(qfa param0, long param1, ts[] param2) {
        try {
            this.field_c = param1;
            this.field_b = param0;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "of.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = new gj();
        gs discarded$0 = new gs();
    }
}
