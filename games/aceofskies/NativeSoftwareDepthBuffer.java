/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NativeSoftwareDepthBuffer implements DepthBuffer, NativeResource {
    long field_nativeid;

    protected final void finalize() {
        if (this.field_nativeid != 0L) {
          NativeResourceDisposer.disposeOrEnqueue((NativeResource) (this), -111);
        }
    }

    public final void dispose(boolean param0) {
        this.releaseNative(this.field_nativeid, param0);
    }

    private final native void releaseNative(long param0, boolean param1);

    NativeSoftwareDepthBuffer(int param0, int param1) {
        this.field_nativeid = 0L;
        this.initializeNative(param0, param1);
    }

    private final native void initializeNative(int param0, int param1);
}
