/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NativeSoftwareRenderContext implements NativeResource {
    private NativeSoftwareToolkit toolkit;
    long field_nativeid;
    Runnable ownerThread;

    protected final void finalize() {
        if (this.field_nativeid != 0L) {
          NativeDisposalQueue.enqueue(0, (NativeResource) (this));
        }
    }

    private final native void bindContextNative(long param0);

    final void bindToCurrentThread() {
        this.ownerThread = (Runnable) ((Object) Thread.currentThread());
        this.bindNativeContext();
    }

    private final native void disposeContextNative(long param0, boolean param1);

    NativeSoftwareRenderContext(NativeSoftwareToolkit param0, int param1, int param2) {
        this.toolkit = param0;
        i discarded$0 = new i(this.toolkit);
        i discarded$1 = new i(this.toolkit);
        i discarded$2 = new i(this.toolkit);
        i discarded$3 = new i(this.toolkit);
        i discarded$4 = new i(this.toolkit);
        i discarded$5 = new i(this.toolkit);
        i discarded$6 = new i(this.toolkit);
        i discarded$7 = new i(this.toolkit);
        i discarded$8 = new i(this.toolkit);
        i discarded$9 = new i(this.toolkit);
        this.initializeContextNative(this.field_nativeid, param0, param1, param2);
    }

    public final void disposeNative(boolean param0) {
        this.disposeContextNative(this.field_nativeid, param0);
    }

    private final void bindNativeContext() {
        this.bindContextNative(this.field_nativeid);
    }

    private final native void drawThickLineNative(long param0, GraphicsToolkit param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8);

    private final native void initializeContextNative(long param0, GraphicsToolkit param1, int param2, int param3);

    final void drawThickLine(GraphicsToolkit param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this.drawThickLineNative(this.field_nativeid, param0, param1, param2, param3, param4, param5, param6, param7);
    }
}
