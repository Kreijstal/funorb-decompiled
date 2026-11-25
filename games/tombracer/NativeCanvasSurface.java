/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NativeCanvasSurface extends IntrusiveNode implements NativeResource {
    java.awt.Canvas field_f;
    private static boolean field_g;
    int field_i;
    long field_nativeid;
    int field_h;
    private static long field_j;

    private final native void attachNativeCanvas(java.awt.Canvas param0, int param1, int param2);

    public final native void releaseNative(boolean param0);

    private final void handlePresentationFailure(Exception param0) {
        if (!field_g) {
          field_j = AdjustedWallClock.currentTimeMillis((byte) -107);
          field_g = true;
          return;
        }
        if (AdjustedWallClock.currentTimeMillis((byte) -107) - field_j >= 30000L) {
          throw new RuntimeException(param0.getMessage());
        }
        this.field_f.repaint();
    }

    final void attachCanvas(java.awt.Canvas param0, int param1, int param2) {
        this.field_i = param1;
        this.field_h = param2;
        this.attachNativeCanvas(param0, param1, param2);
    }

    private final native void presentNativeCanvas(int param0, int param1, int param2, int param3);

    final void present(int param0, int param1) {
        java.awt.Dimension var4 = null;
        synchronized (this.field_f.getTreeLock()) {
          var4 = this.field_f.getSize();
          this.presentNativeCanvas(param0, param1, var4.width, var4.height);
          field_g = false;
        }
    }

    protected final void finalize() {
        if (this.field_nativeid != 0L) {
          NativeReleaseQueue.queueRelease(-1, (NativeResource) (this));
          return;
        }
    }

    private final native void initializeNativeCanvasSurface(NativeSoftwareGraphicsToolkit param0, java.awt.Canvas param1, int param2, int param3);

    NativeCanvasSurface(NativeSoftwareGraphicsToolkit param0, java.awt.Canvas param1, int param2, int param3) {
        this.field_f = param1;
        this.field_i = param2;
        this.field_h = param3;
        this.initializeNativeCanvasSurface(param0, this.field_f, param2, param3);
    }

    static {
        field_g = false;
    }
}
