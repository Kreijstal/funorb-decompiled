/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NativeRenderBuffer implements RenderBuffer, NativeResource {
    long field_nativeid;

    private final native void releaseNativeHandle(long param0, boolean param1);

    private final native void initializeNativeRenderBuffer(int param0, int param1);

    protected final void finalize() {
        if (this.field_nativeid != 0L) {
          NativeReleaseQueue.queueRelease(-1, (NativeResource) (this));
        }
    }

    public final void releaseNative(boolean param0) {
        this.releaseNativeHandle(this.field_nativeid, param0);
    }

    NativeRenderBuffer(int param0, int param1) {
        this.field_nativeid = 0L;
        this.initializeNativeRenderBuffer(param0, param1);
    }
}
