/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NativeResourceHandle extends NativeResourceNodeBase implements NativeResource {
    long field_nativeid;

    NativeResourceHandle(NativeSoftwareGraphicsToolkit param0) {
    }

    protected final void finalize() {
        if (this.field_nativeid != 0L) {
          NativeReleaseQueue.queueRelease(-1, (NativeResource) (this));
        }
    }

    public final native void releaseNative(boolean param0);
}
