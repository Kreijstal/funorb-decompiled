/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NativeRenderBufferSet extends RenderBufferSet implements NativeResource {
    long field_nativeid;

    public final native void disposeNativeResource(boolean param0);

    protected final void finalize() {
        if (this.field_nativeid != 0L) {
          NativeResourceReaper.deferDisposal((NativeResource) (this), (byte) -37);
        }
    }

    private final native void initializeNative(NativeSoftwareGraphicsToolkit toolkit);

    NativeRenderBufferSet(NativeSoftwareGraphicsToolkit toolkit) {
        this.initializeNative(toolkit);
    }
}
