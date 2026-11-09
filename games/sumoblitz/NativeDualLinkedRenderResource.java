/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NativeDualLinkedRenderResource extends DualLinkedRenderResource implements NativeResource {
    long field_nativeid;

    public final native void disposeNativeResource(boolean param0);

    NativeDualLinkedRenderResource(NativeSoftwareGraphicsToolkit toolkit) {
    }

    protected final void finalize() {
        if (this.field_nativeid != 0L) {
          NativeResourceReaper.deferDisposal((NativeResource) (this), (byte) -37);
        }
    }
}
