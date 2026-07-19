/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ja extends ao implements e {
    long field_nativeid;

    private final native void la();

    public final void w(boolean param0) {
        this.AA(this.field_nativeid, param0);
    }

    private final native void AA(long param0, boolean param1);

    ja() {
        this.la();
    }

    protected final void finalize() {
        if (this.field_nativeid != 0L) {
            vk.a((e) (this), -115);
        }
    }
}
