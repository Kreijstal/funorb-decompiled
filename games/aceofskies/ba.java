/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ba extends r implements NativeResource {
    long field_nativeid;

    public final native void dispose(boolean param0);

    ba(NativeSoftwareRenderer param0) {
    }

    protected final void finalize() {
        if (this.field_nativeid != 0L) {
          NativeResourceDisposer.disposeOrEnqueue((NativeResource) (this), 56);
        }
    }
}
