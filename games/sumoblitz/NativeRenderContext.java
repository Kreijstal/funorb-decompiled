/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NativeRenderContext implements NativeResource {
    private NativeSoftwareGraphicsToolkit toolkit;
    long field_nativeid;

    private final native void disposeNative(long nativeHandle, boolean deferred);

    final void bindToCurrentThread() {
        Thread.currentThread();
        this.bindHandle();
    }

    protected final void finalize() {
        if (this.field_nativeid != 0L) {
          NativeResourceReaper.deferDisposal((NativeResource) (this), (byte) -37);
        }
    }

    private final void bindHandle() {
        this.bindNative(this.field_nativeid);
    }

    public final void disposeNativeResource(boolean param0) {
        this.disposeNative(this.field_nativeid, param0);
    }

    private final native void bindNative(long nativeHandle);

    NativeRenderContext(NativeSoftwareGraphicsToolkit param0, int param1, int param2) {
        this.toolkit = param0;
        NativeRenderBufferSet discarded$0 = new NativeRenderBufferSet(this.toolkit);
        NativeRenderBufferSet discarded$1 = new NativeRenderBufferSet(this.toolkit);
        NativeRenderBufferSet discarded$2 = new NativeRenderBufferSet(this.toolkit);
        NativeRenderBufferSet discarded$3 = new NativeRenderBufferSet(this.toolkit);
        NativeRenderBufferSet discarded$4 = new NativeRenderBufferSet(this.toolkit);
        NativeRenderBufferSet discarded$5 = new NativeRenderBufferSet(this.toolkit);
        NativeRenderBufferSet discarded$6 = new NativeRenderBufferSet(this.toolkit);
        NativeRenderBufferSet discarded$7 = new NativeRenderBufferSet(this.toolkit);
        NativeRenderBufferSet discarded$8 = new NativeRenderBufferSet(this.toolkit);
        NativeRenderBufferSet discarded$9 = new NativeRenderBufferSet(this.toolkit);
        this.initializeNative(this.field_nativeid, param0, param1, param2);
    }

    private final native void initializeNative(long nativeHandle, GraphicsToolkit toolkit, int firstCapacity, int secondCapacity);
}
