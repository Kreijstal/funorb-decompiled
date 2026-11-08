/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class xa implements nr, NativeResource {
    long field_nativeid;

    private final native void va(long param0, boolean param1);

    protected final void finalize() {
        if (this.field_nativeid != 0L) {
          NativeResourceReaper.a((NativeResource) (this), (byte) -37);
        }
    }

    public final void disposeNativeResource(boolean param0) {
        this.va(this.field_nativeid, param0);
    }

    private final native void r(int param0, int param1);

    xa(int param0, int param1) {
        this.field_nativeid = 0L;
        this.r(param0, param1);
    }
}
