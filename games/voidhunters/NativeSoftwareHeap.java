/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NativeSoftwareHeap extends GraphicsHeap implements NativeResource {
    long field_nativeid;

    public final native void disposeNative(boolean param0);

    final native void ga();

    protected final void finalize() {
        if (this.field_nativeid != 0L) {
          NativeDisposalQueue.enqueue(0, (NativeResource) (this));
        }
    }

    private final native void aa(NativeSoftwareToolkit param0, int param1);

    NativeSoftwareHeap(NativeSoftwareToolkit param0, int param1) {
        this.aa(param0, param1);
    }

    final native void r();
}
