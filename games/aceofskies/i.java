/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class i extends ka implements NativeResource {
    long field_nativeid;

    private final native void oa(NativeSoftwareRenderer param0);

    public final native void dispose(boolean param0);

    protected final void finalize() {
        if (this.field_nativeid != 0L) {
          NativeResourceDisposer.disposeOrEnqueue((NativeResource) (this), 101);
        }
    }

    i(NativeSoftwareRenderer param0) {
        this.oa(param0);
    }
}
