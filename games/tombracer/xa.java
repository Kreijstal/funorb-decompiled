/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class xa implements mw, e {
    long field_nativeid;

    private final native void va(long param0, boolean param1);

    private final native void r(int param0, int param1);

    protected final void finalize() {
        if (this.field_nativeid != 0L) {
            ho.a(-1, (e) (this));
        }
    }

    public final void w(boolean param0) {
        this.va(this.field_nativeid, param0);
    }

    xa(int param0, int param1) {
        this.field_nativeid = 0L;
        this.r(param0, param1);
    }
}
