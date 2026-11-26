/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NativeSoftwareRenderContext implements NativeResource {
    private NativeSoftwareRenderer field_a;
    long field_nativeid;

    final void activateForCurrentThread() {
        Thread.currentThread();
        this.activateContext();
    }

    protected final void finalize() {
        if (this.field_nativeid != 0L) {
          NativeResourceDisposer.disposeOrEnqueue((NativeResource) (this), 120);
        }
    }

    NativeSoftwareRenderContext(NativeSoftwareRenderer param0, int param1, int param2) {
        this.field_a = param0;
        i discarded$0 = new i(this.field_a);
        i discarded$1 = new i(this.field_a);
        i discarded$2 = new i(this.field_a);
        i discarded$3 = new i(this.field_a);
        i discarded$4 = new i(this.field_a);
        i discarded$5 = new i(this.field_a);
        i discarded$6 = new i(this.field_a);
        i discarded$7 = new i(this.field_a);
        i discarded$8 = new i(this.field_a);
        i discarded$9 = new i(this.field_a);
        this.initializeNative(this.field_nativeid, param0, param1, param2);
    }

    private final native void activateNative(long param0);

    public final void dispose(boolean param0) {
        this.releaseNative(this.field_nativeid, param0);
    }

    private final native void initializeNative(long param0, GraphicsRenderer param1, int param2, int param3);

    private final void activateContext() {
        this.activateNative(this.field_nativeid);
    }

    private final native void releaseNative(long param0, boolean param1);
}
