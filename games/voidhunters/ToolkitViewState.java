/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ToolkitViewState {
    static String field_e;
    private int[] projectionParameters;
    private int[] clipBounds;
    private int farPlane;
    private int nearPlane;
    private long timeOriginMillis;

    final void restore(int param0, ToolkitCanvasContext param1) {
        GraphicsToolkit var4 = null;
        GraphicsToolkit var3 = null;
        try {
          var4 = param1.toolkit;
          var3 = var4;
          var4.setClip(this.clipBounds[0], this.clipBounds[1], this.clipBounds[2], this.clipBounds[3]);
          var4.setProjectionParameters(this.projectionParameters[0], this.projectionParameters[param0], this.projectionParameters[2], this.projectionParameters[3]);
          var3.setDepthRange(this.nearPlane, this.farPlane);
          param1.timeOriginMillis = this.timeOriginMillis;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "t.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void capture(int param0, ToolkitCanvasContext param1) {
        GraphicsToolkit var3 = null;
        if (param0 != 4) {
          return;
        }
        try {
          var3 = param1.toolkit;
          var3.getClip(this.clipBounds);
          this.projectionParameters = var3.getProjectionParameters();
          this.nearPlane = var3.getNearPlane();
          this.farPlane = var3.getFarPlane();
          this.timeOriginMillis = param1.timeOriginMillis;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "t.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static Ship createPresetShip(int param0, byte param1) {
        if (param1 < 34) {
          return (Ship) null;
        }
        return OpenGlFramebuffer.createPresetShip(param0, 0, true);
    }

    public static void clearSharedReferences(int param0) {
        if (param0 != 1) {
          ToolkitViewState.clearSharedReferences(57);
          field_e = null;
          return;
        }
        field_e = null;
    }

    ToolkitViewState() {
        this.clipBounds = new int[4];
    }

    static {
        field_e = "Withdraw request to join <%0>'s game";
    }
}
