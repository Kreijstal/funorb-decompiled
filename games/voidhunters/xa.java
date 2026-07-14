/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class xa implements wib, e {
    long field_nativeid;

    private final native void r(int param0, int param1);

    private final native void va(long param0, boolean param1);

    protected final void finalize() {
        if (((xa) this).field_nativeid != 0L) {
            pq.a(0, (e) this);
        }
    }

    public final void w(boolean param0) {
        this.va(((xa) this).field_nativeid, param0);
    }

    xa(int param0, int param1) {
        ((xa) this).field_nativeid = 0L;
        this.r(param0, param1);
    }
}
