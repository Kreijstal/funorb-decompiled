/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NativeSoftwareTransform3D extends Transform3D implements NativeResource {
    long field_nativeid;

    private final native void setCameraNative(long param0, int param1, int param2, int param3, int param4, int param5, int param6);

    private final native void initializeNative();

    NativeSoftwareTransform3D() {
        this.initializeNative();
    }

    public final void disposeNative(boolean param0) {
        this.disposeNativeHandle(this.field_nativeid, param0);
    }

    protected final void finalize() {
        if (this.field_nativeid != 0L) {
          NativeDisposalQueue.enqueue(0, (NativeResource) (this));
        }
    }

    final void setCamera(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.setCameraNative(this.field_nativeid, param0, param1, param2, param3, param4, param5);
    }

    private final native void disposeNativeHandle(long param0, boolean param1);
}
