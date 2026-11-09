/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RendererSession {
    long startTimeMillis;
    static SpriteData[] field_b;
    GraphicsToolkit toolkit;
    static int[] isaacSeed;
    RendererPreference preference;
    private RendererStateSnapshot snapshot;
    java.awt.Canvas canvas;

    public static void releaseStatics(int param0) {
        isaacSeed = null;
        field_b = null;
        if (param0 != 4) {
          RendererSession.releaseStatics(-95);
        }
    }

    final RendererStateSnapshot captureState(int guard) {
        if (null == this.snapshot) {
          this.snapshot = new RendererStateSnapshot();
        }
        int var2 = 105 % ((guard - 3) / 46);
        this.snapshot.capture(-108, this);
        return this.snapshot;
    }

    RendererSession(GraphicsToolkit renderer, RendererPreference backendChoice, java.awt.Canvas surface) {
        try {
          this.canvas = surface;
          this.toolkit = renderer;
          this.preference = backendChoice;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "bk.<init>(" + (renderer != null ? "{...}" : "null") + ',' + (backendChoice != null ? "{...}" : "null") + ',' + (surface != null ? "{...}" : "null") + ')');
        }
    }

    static {
        isaacSeed = new int[4];
    }
}
