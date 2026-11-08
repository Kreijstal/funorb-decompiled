/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ba extends r implements NativeResource {
    long field_nativeid;

    public final native void disposeNativeResource(boolean param0);

    ba(NativeSoftwareGraphicsToolkit param0) {
    }

    protected final void finalize() {
        if (this.field_nativeid != 0L) {
          NativeResourceReaper.a((NativeResource) (this), (byte) -37);
        }
    }
}
