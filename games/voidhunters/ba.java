/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ba extends r implements e {
    long field_nativeid;

    public final native void w(boolean param0);

    protected final void finalize() {
        if (this.field_nativeid != 0L) {
            pq.a(0, (e) (this));
        }
    }

    ba(oa param0) {
    }
}
