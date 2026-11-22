/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NativeSoftwareGraphicsHeap extends GraphicsHeap implements NativeResource {
    long field_nativeid;

    protected final void finalize() {
        if (this.field_nativeid != 0L) {
          NativeReleaseQueue.queueRelease(-1, (NativeResource) (this));
        }
    }

    public final native void releaseNative(boolean param0);

    final native void onToolkitDispose();

    private final native void initializeNativeHeap(NativeSoftwareGraphicsToolkit param0, int param1);

    final native void onToolkitTimeUpdate();

    NativeSoftwareGraphicsHeap(NativeSoftwareGraphicsToolkit param0, int param1) {
        this.initializeNativeHeap(param0, param1);
    }
}
