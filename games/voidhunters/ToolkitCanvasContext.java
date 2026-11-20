/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ToolkitCanvasContext {
    static String[] menuLabels;
    private ToolkitViewState viewState;
    java.awt.Canvas canvas;
    GraphicsToolkit toolkit;
    long timeOriginMillis;
    GraphicsBackendOption backendOption;
    static int field_d;

    ToolkitCanvasContext(GraphicsToolkit param0, GraphicsBackendOption param1, java.awt.Canvas param2) {
        try {
          this.canvas = param2;
          this.toolkit = param0;
          this.backendOption = param1;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "bra.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final ToolkitViewState captureViewState(byte param0) {
        if (param0 <= -113) {
          if (null == this.viewState) {
            this.viewState = new ToolkitViewState();
          }
          this.viewState.capture(4, this);
          return this.viewState;
        }
        this.timeOriginMillis = -31L;
        if (null == this.viewState) {
          this.viewState = new ToolkitViewState();
        }
        this.viewState.capture(4, this);
        return this.viewState;
    }

    public static void clearSharedReferences(boolean param0) {
        if (!param0) {
          ToolkitCanvasContext.clearSharedReferences(true);
          menuLabels = null;
          return;
        }
        menuLabels = null;
    }

    static {
        field_d = 0;
    }
}
