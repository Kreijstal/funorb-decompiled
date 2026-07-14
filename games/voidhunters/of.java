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

    public static void a(int param0) {
        field_a = null;
        if (param0 != 8345) {
            field_a = null;
        }
    }

    of(qfa param0, long param1, ts[] param2) {
        ((of) this).field_c = param1;
        ((of) this).field_b = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new gj();
        gs discarded$0 = new gs();
    }
}
