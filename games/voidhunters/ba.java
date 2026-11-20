/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ba extends r implements NativeResource {
    long field_nativeid;

    public final native void disposeNative(boolean param0);

    protected final void finalize() {
        if (this.field_nativeid != 0L) {
          NativeDisposalQueue.enqueue(0, (NativeResource) (this));
        }
    }

    ba(NativeSoftwareToolkit param0) {
    }
}
