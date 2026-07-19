/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class xa implements gd, e {
    long field_nativeid;

    protected final void finalize() {
        if (this.field_nativeid != 0L) {
            vk.a((e) (this), -111);
        }
    }

    public final void w(boolean param0) {
        this.va(this.field_nativeid, param0);
    }

    private final native void va(long param0, boolean param1);

    xa(int param0, int param1) {
        this.field_nativeid = 0L;
        this.r(param0, param1);
    }

    private final native void r(int param0, int param1);
}
