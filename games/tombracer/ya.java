/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ya extends za implements e {
    long field_nativeid;

    protected final void finalize() {
        if (this.field_nativeid != 0L) {
          NativeReleaseQueue.queueRelease(-1, (e) (this));
        }
    }

    public final native void w(boolean param0);

    final native void ga();

    private final native void aa(NativeSoftwareGraphicsToolkit param0, int param1);

    final native void r();

    ya(NativeSoftwareGraphicsToolkit param0, int param1) {
        this.aa(param0, param1);
    }
}
