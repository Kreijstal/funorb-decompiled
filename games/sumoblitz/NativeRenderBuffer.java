/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NativeRenderBuffer implements RenderBuffer, NativeResource {
    long field_nativeid;

    private final native void releaseHandle(long handle, boolean cleanupMode);

    protected final void finalize() {
        if (this.field_nativeid != 0L) {
          NativeResourceReaper.a((NativeResource) (this), (byte) -37);
        }
    }

    public final void disposeNativeResource(boolean param0) {
        this.releaseHandle(this.field_nativeid, param0);
    }

    private final native void allocate(int width, int height);

    NativeRenderBuffer(int width, int height) {
        this.field_nativeid = 0L;
        this.allocate(width, height);
    }
}
