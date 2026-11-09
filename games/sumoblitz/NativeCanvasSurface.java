/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NativeCanvasSurface extends IntrusiveNode implements NativeResource {
    private static long firstFailureMillis;
    int width;
    private static boolean presentationFailurePending;
    java.awt.Canvas canvas;
    int height;
    long field_nativeid;

    private final void handlePresentationFailure(Exception failure) {
        if (!presentationFailurePending) {
          firstFailureMillis = IntroMeshResources.monotonicTimeMillis(-119);
          presentationFailurePending = true;
          return;
        }
        if (IntroMeshResources.monotonicTimeMillis(-120) - firstFailureMillis >= 30000L) {
          throw new RuntimeException(failure.getMessage());
        }
        this.canvas.repaint();
    }

    final void present(int offsetX, int offsetY) {
        java.awt.Dimension var4 = null;
        synchronized (this.canvas.getTreeLock()) {
          var4 = this.canvas.getSize();
          this.presentNative(offsetX, offsetY, var4.width, var4.height);
          presentationFailurePending = false;
        }
    }

    private final native void resizeNative(java.awt.Canvas canvas, int width, int height);

    private final native void initializeNative(NativeSoftwareGraphicsToolkit toolkit, java.awt.Canvas canvas, int width, int height);

    final void resize(java.awt.Canvas canvas, int width, int height) {
        this.width = width;
        this.height = height;
        this.resizeNative(canvas, width, height);
    }

    private final native void presentNative(int offsetX, int offsetY, int canvasWidth, int canvasHeight);

    public final native void disposeNativeResource(boolean param0);

    protected final void finalize() {
        if (this.field_nativeid != 0L) {
          NativeResourceReaper.deferDisposal((NativeResource) (this), (byte) -37);
          return;
        }
    }

    NativeCanvasSurface(NativeSoftwareGraphicsToolkit toolkit, java.awt.Canvas canvas, int width, int height) {
        this.canvas = canvas;
        this.width = width;
        this.height = height;
        this.initializeNative(toolkit, this.canvas, width, height);
    }

    static {
        presentationFailurePending = false;
    }
}
