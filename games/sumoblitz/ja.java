/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ja extends eu implements e {
    long field_nativeid;

    private final native void la();

    protected final void finalize() {
        if (this.field_nativeid != 0L) {
            pa.a((e) (this), (byte) -37);
        }
    }

    ja() {
        this.la();
    }

    public final void w(boolean param0) {
        this.AA(this.field_nativeid, param0);
    }

    private final native void AA(long param0, boolean param1);
}
