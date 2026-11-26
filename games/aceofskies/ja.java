/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ja extends ao implements NativeResource {
    long field_nativeid;

    private final native void la();

    public final void dispose(boolean param0) {
        this.AA(this.field_nativeid, param0);
    }

    private final native void AA(long param0, boolean param1);

    ja() {
        this.la();
    }

    protected final void finalize() {
        if (this.field_nativeid != 0L) {
          NativeResourceDisposer.disposeOrEnqueue((NativeResource) (this), -115);
        }
    }
}
