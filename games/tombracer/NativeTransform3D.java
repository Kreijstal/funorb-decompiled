/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NativeTransform3D extends Transform3D implements NativeResource {
    long field_nativeid;

    private final native void setNativeCamera(long param0, int param1, int param2, int param3, int param4, int param5, int param6);

    final void rotateX(int param0) {
        this.rotateNativeX(this.field_nativeid, param0);
    }

    public final void releaseNative(boolean param0) {
        this.releaseNativeHandle(this.field_nativeid, param0);
    }

    private final native void initializeNativeTransform();

    private final native void rotateNativeY(long param0, int param1);

    private final native void rotateNativeZ(long param0, int param1);

    final void setIdentity() {
        this.setNativeIdentity(this.field_nativeid);
    }

    protected final void finalize() {
        if (this.field_nativeid != 0L) {
          NativeReleaseQueue.queueRelease(-1, (NativeResource) (this));
        }
    }

    private final native void releaseNativeHandle(long param0, boolean param1);

    final void rotateZ(int param0) {
        this.rotateNativeZ(this.field_nativeid, param0);
    }

    private final native void rotateNativeX(long param0, int param1);

    private final native void translateNative(long param0, int param1, int param2, int param3);

    private final native void setNativeIdentity(long param0);

    final void rotateY(int param0) {
        this.rotateNativeY(this.field_nativeid, param0);
    }

    final void setCamera(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.setNativeCamera(this.field_nativeid, param0, param1, param2, param3, param4, param5);
    }

    final void translate(int param0, int param1, int param2) {
        this.translateNative(this.field_nativeid, param0, param1, param2);
    }

    NativeTransform3D() {
        this.initializeNativeTransform();
    }
}
