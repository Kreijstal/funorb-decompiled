/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ToolkitRasterStateStack {
    private ToolkitRasterState frames;
    private int[] clipBounds;
    private GraphicsToolkit toolkit;
    private ToolkitSprite target;
    static AccountRequestPhase idleAccountRequest;
    private ToolkitRasterState freeFrames;
    static String field_b;

    private final void pushRenderTarget(ToolkitSprite param0, int param1, boolean param2) {
        try {
          this.pushState(-117);
          if (this.target != null) {
            this.toolkit.restoreDefaultFramebuffer();
          }
          this.toolkit.setRenderTarget(param0, param2);
          if (param1 != 4) {
            idleAccountRequest = (AccountRequestPhase) null;
          }
          this.target = param0;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "kla.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void pop(boolean param0) {
        ToolkitRasterState var3 = null;
        ToolkitRasterState var2 = null;
        ToolkitRasterState var3Lifetime1;
        ToolkitRasterState var3Lifetime2;
        ToolkitRasterState var3Lifetime3;
        ToolkitRasterState var2Lifetime1;
        ToolkitRasterState var2Lifetime2;
        ToolkitRasterState var2Lifetime3;
        ToolkitRasterState var3Lifetime4;
        ToolkitRasterState var2Lifetime4;
        ToolkitRasterState var3Lifetime1Lifetime1;
        ToolkitRasterState var2Lifetime1Lifetime1;
        if (this.frames.target == this.target) {
          this.toolkit.setClip(this.frames.clipLeft, this.frames.clipTop, this.frames.clipRight, this.frames.clipBottom);
          if (!param0) {
            this.pushState(0);
            var3 = this.frames;
            var2 = var3;
            this.frames = this.frames.next;
            var3.next = this.freeFrames;
            var3.target = null;
            this.freeFrames = var3;
            return;
          }
          var3Lifetime4 = this.frames;
          var2Lifetime4 = var3Lifetime4;
          this.frames = this.frames.next;
          var3Lifetime4.next = this.freeFrames;
          var3Lifetime4.target = null;
          this.freeFrames = var3Lifetime4;
          return;
        }
        this.toolkit.restoreDefaultFramebuffer();
        if (null != this.frames.target) {
          this.toolkit.setRenderTarget(this.frames.target, true);
        } else {
          this.target = this.frames.target;
          this.toolkit.setClip(this.frames.clipLeft, this.frames.clipTop, this.frames.clipRight, this.frames.clipBottom);
          if (!param0) {
            this.pushState(0);
            var3Lifetime1 = this.frames;
            var2Lifetime1 = var3Lifetime1;
            this.frames = this.frames.next;
            var3Lifetime1.next = this.freeFrames;
            var3Lifetime1.target = null;
            this.freeFrames = var3Lifetime1;
            return;
          }
          var3Lifetime1Lifetime1 = this.frames;
          var2Lifetime1Lifetime1 = var3Lifetime1Lifetime1;
          this.frames = this.frames.next;
          var3Lifetime1Lifetime1.next = this.freeFrames;
          var3Lifetime1Lifetime1.target = null;
          this.freeFrames = var3Lifetime1Lifetime1;
          return;
        }
        this.target = this.frames.target;
        this.toolkit.setClip(this.frames.clipLeft, this.frames.clipTop, this.frames.clipRight, this.frames.clipBottom);
        if (param0) {
          var3Lifetime2 = this.frames;
          var2Lifetime2 = var3Lifetime2;
          this.frames = this.frames.next;
          var3Lifetime2.next = this.freeFrames;
          var3Lifetime2.target = null;
          this.freeFrames = var3Lifetime2;
          return;
        }
        this.pushState(0);
        var3Lifetime3 = this.frames;
        var2Lifetime3 = var3Lifetime3;
        this.frames = this.frames.next;
        var3Lifetime3.next = this.freeFrames;
        var3Lifetime3.target = null;
        this.freeFrames = var3Lifetime3;
    }

    final void pushClip(int param0, int param1, int param2, int param3, byte param4) {
        if (param4 > -3) {
          return;
        }
        this.pushState(-127);
        this.toolkit.intersectClip(param0, param2, param1, param3);
    }

    private final void pushState(int param0) {
        ToolkitRasterState var2 = null;
        this.toolkit.getClip(this.clipBounds);
        if (null == this.freeFrames) {
          var2 = new ToolkitRasterState();
        } else {
          var2 = this.freeFrames;
          this.freeFrames = this.freeFrames.next;
        }
        var2.setState(this.clipBounds[2], this.frames, this.clipBounds[3], this.target, 4096, this.clipBounds[1], this.clipBounds[0]);
        if (param0 < -25) {
          this.frames = var2;
          return;
        }
    }

    final void pushRenderTarget(ToolkitSprite param0, int param1) {
        try {
          this.pushRenderTarget(param0, param1 + 4, false);
          if (param1 != 0) {
            this.frames = (ToolkitRasterState) null;
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "kla.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void clearSharedReferences(int param0) {
        if (param0 <= 37) {
          idleAccountRequest = (AccountRequestPhase) null;
          field_b = null;
          idleAccountRequest = null;
          return;
        }
        field_b = null;
        idleAccountRequest = null;
    }

    ToolkitRasterStateStack(GraphicsToolkit param0) {
        this.clipBounds = new int[4];
        this.target = null;
        try {
          this.toolkit = param0;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "kla.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        idleAccountRequest = new AccountRequestPhase();
        field_b = "More missile defence";
    }
}
