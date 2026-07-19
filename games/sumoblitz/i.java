/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class i extends ka implements e {
    long field_nativeid;

    public final native void w(boolean param0);

    protected final void finalize() {
        if (this.field_nativeid != 0L) {
            pa.a((e) (this), (byte) -37);
        }
    }

    private final native void oa(oa param0);

    i(oa param0) {
        this.oa(param0);
    }
}
