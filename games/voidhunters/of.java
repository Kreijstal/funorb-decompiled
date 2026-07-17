/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class of {
    static gj field_a;
    long field_c;
    private qfa field_b;

    protected final void finalize() throws Throwable {
        ((of) this).field_b.a((byte) 18, ((of) this).field_c);
        super.finalize();
    }

    public static void a() {
        field_a = null;
    }

    of(qfa param0, long param1, ts[] param2) {
        try {
            ((of) this).field_c = param1;
            ((of) this).field_b = param0;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "of.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new gj();
        gs discarded$0 = new gs();
    }
}
