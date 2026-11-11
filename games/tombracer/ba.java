/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ba extends r implements e {
    long field_nativeid;

    ba(NativeSoftwareGraphicsToolkit param0) {
    }

    protected final void finalize() {
        if (this.field_nativeid != 0L) {
          NativeReleaseQueue.queueRelease(-1, (e) (this));
        }
    }

    public final native void w(boolean param0);
}
