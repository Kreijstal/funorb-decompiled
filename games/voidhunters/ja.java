/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ja extends pw implements e {
    long field_nativeid;

    private final native void P(long param0, int param1, int param2, int param3, int param4, int param5, int param6);

    private final native void la();

    ja() {
        this.la();
    }

    public final void w(boolean param0) {
        this.AA(this.field_nativeid, param0);
    }

    protected final void finalize() {
        if (this.field_nativeid != 0L) {
            pq.a(0, (e) (this));
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.P(this.field_nativeid, param0, param1, param2, param3, param4, param5);
    }

    private final native void AA(long param0, boolean param1);
}
