/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class i extends ka implements NativeResource {
    long field_nativeid;

    public final native void disposeNativeResource(boolean param0);

    protected final void finalize() {
        if (this.field_nativeid != 0L) {
          NativeResourceReaper.a((NativeResource) (this), (byte) -37);
        }
    }

    private final native void oa(NativeSoftwareGraphicsToolkit param0);

    i(NativeSoftwareGraphicsToolkit param0) {
        this.oa(param0);
    }
}
