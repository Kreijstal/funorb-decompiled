/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pva {
    private cka field_b;
    int field_a;

    protected final void finalize() throws Throwable {
        ((pva) this).field_b.i(((pva) this).field_a, -1);
        super.finalize();
    }

    pva(cka param0, int param1, int param2) {
        ((pva) this).field_a = param2;
        ((pva) this).field_b = param0;
    }

    static {
    }
}
