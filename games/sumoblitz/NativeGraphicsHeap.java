/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NativeGraphicsHeap extends GraphicsHeap implements NativeResource {
    long field_nativeid;

    final native void r();

    final native void ga();

    NativeGraphicsHeap(NativeSoftwareGraphicsToolkit toolkit, int capacity) {
        this.allocate(toolkit, capacity);
    }

    public final native void disposeNativeResource(boolean param0);

    protected final void finalize() {
        if (this.field_nativeid != 0L) {
          NativeResourceReaper.a((NativeResource) (this), (byte) -37);
        }
    }

    private final native void allocate(NativeSoftwareGraphicsToolkit toolkit, int capacity);
}
