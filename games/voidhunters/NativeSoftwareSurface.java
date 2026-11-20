/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NativeSoftwareSurface extends IntrusiveNode implements NativeResource {
    int height;
    private static boolean field_d;
    java.awt.Canvas canvas;
    int width;
    long field_nativeid;
    private static long field_h;

    private final native void initializeSurfaceNative(NativeSoftwareToolkit param0, java.awt.Canvas param1, int param2, int param3);

    final void present(int param0, int param1) {
        java.awt.Dimension var4 = null;
        synchronized (this.canvas.getTreeLock()) {
          var4 = this.canvas.getSize();
          this.presentNative(param0, param1, var4.width, var4.height);
          field_d = false;
        }
    }

    public final native void disposeNative(boolean param0);

    private final native void resizeSurfaceNative(java.awt.Canvas param0, int param1, int param2);

    private final native void presentNative(int param0, int param1, int param2, int param3);

    private final void handlePresentationFailure(Exception param0) {
        if (!field_d) {
          field_h = MonotonicMillisClock.currentTimeMillis(false);
          field_d = true;
          return;
        }
        if (MonotonicMillisClock.currentTimeMillis(false) - field_h >= 30000L) {
          throw new RuntimeException(param0.getMessage());
        }
        this.canvas.repaint();
    }

    NativeSoftwareSurface(NativeSoftwareToolkit param0, java.awt.Canvas param1, int param2, int param3) {
        this.canvas = param1;
        this.width = param2;
        this.height = param3;
        this.initializeSurfaceNative(param0, this.canvas, param2, param3);
    }

    final void resize(java.awt.Canvas param0, int param1, int param2) {
        this.width = param1;
        this.height = param2;
        this.resizeSurfaceNative(param0, param1, param2);
    }

    protected final void finalize() {
        if (this.field_nativeid != 0L) {
          NativeDisposalQueue.enqueue(0, (NativeResource) (this));
          return;
        }
    }

    static {
        field_d = false;
    }
}
