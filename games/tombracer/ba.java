/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ba extends r implements e {
    long field_nativeid;

    ba(oa param0) {
    }

    protected final void finalize() {
        if (this.field_nativeid != 0L) {
            ho.a(-1, (e) (this));
        }
    }

    public final native void w(boolean param0);
}
