/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ya extends za implements NativeResource {
    long field_nativeid;

    final native void r();

    final native void ga();

    ya(NativeSoftwareGraphicsToolkit param0, int param1) {
        this.aa(param0, param1);
    }

    public final native void disposeNativeResource(boolean param0);

    protected final void finalize() {
        if (this.field_nativeid != 0L) {
          NativeResourceReaper.a((NativeResource) (this), (byte) -37);
        }
    }

    private final native void aa(NativeSoftwareGraphicsToolkit param0, int param1);
}
