/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NativeSoftwareDepthBuffer implements DepthBuffer, NativeResource {
    long field_nativeid;

    private final native void initializeNative(int param0, int param1);

    private final native void disposeNativeHandle(long param0, boolean param1);

    protected final void finalize() {
        if (this.field_nativeid != 0L) {
          NativeDisposalQueue.enqueue(0, (NativeResource) (this));
        }
    }

    public final void disposeNative(boolean param0) {
        this.disposeNativeHandle(this.field_nativeid, param0);
    }

    NativeSoftwareDepthBuffer(int param0, int param1) {
        this.field_nativeid = 0L;
        this.initializeNative(param0, param1);
    }
}
