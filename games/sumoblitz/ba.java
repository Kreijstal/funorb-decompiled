/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ba extends r implements e {
    long field_nativeid;

    public final native void w(boolean param0);

    ba(oa param0) {
    }

    protected final void finalize() {
        if (this.field_nativeid != 0L) {
            pa.a((e) (this), (byte) -37);
        }
    }
}
