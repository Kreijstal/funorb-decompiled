/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NativeTransform3D extends Transform3D implements NativeResource {
    long field_nativeid;

    private final native void allocate();

    protected final void finalize() {
        if (this.field_nativeid != 0L) {
          NativeResourceReaper.a((NativeResource) (this), (byte) -37);
        }
    }

    NativeTransform3D() {
        this.allocate();
    }

    public final void disposeNativeResource(boolean param0) {
        this.releaseHandle(this.field_nativeid, param0);
    }

    private final native void releaseHandle(long handle, boolean cleanupMode);
}
