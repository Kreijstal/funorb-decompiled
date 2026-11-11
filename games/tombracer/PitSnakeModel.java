/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PitSnakeModel implements Renderable {
    private boolean field_g;
    static int field_b;
    SnakePitModel snakePit;
    private boolean field_f;
    private ModelAnimator field_d;
    PitSnake snake;
    static UiComponent[] field_c;
    static int[] field_h;

    public final int getRenderY(byte param0) {
        if (param0 <= 91) {
          return 125;
        }
        return this.snakePit.getRenderY((byte) 112) + this.snake.getOffsetY(0);
    }

    public static void releaseStatics(int param0) {
        if (param0 != -1) {
          return;
        }
        field_h = null;
        field_c = null;
    }

    public final void render(int param0, Camera param1) {
        int var3_int = 0;
        int var4 = 0;
        ToolkitModel var5 = null;
        try {
          var3_int = this.snake.getDirection(2);
          var4 = GameScreen.positiveModulo(-(PortalBehaviour.directionToAngle(VertexStreamLayout.field_f[var3_int][1], VertexStreamLayout.field_f[var3_int][0], 1) >> 2) + 512, 2048, 73);
          if (param0 < 103) {
            PitSnakeModel.clampToScreenX((byte) 44, -55, -63, 37);
          }
          var5 = this.field_d.getModel((byte) 74);
          ChatMessage.drawModelAt(var4, -83584144, this.getRenderY((byte) 120), this.getRenderX((byte) -89), var5, this.getRenderZ((byte) -95));
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "bt.DB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void updateAnimation(int param0) {
        if (this.snake.isCoolingDown(180)) {
          if (!this.field_g) {
            this.field_d.play(1, false, (byte) -85, 9);
            this.field_d.queue(6, this.field_d.getCurrentAnimationLength((byte) 50), 1, -1);
          }
          this.field_f = false;
          this.field_g = true;
        } else {
          if (!this.field_f) {
            this.field_d.play(1, false, (byte) 120, 8);
            this.field_d.queue(7, this.field_d.getCurrentAnimationLength((byte) -97), 1, -1);
          }
          this.field_f = true;
          this.field_g = false;
        }
        if (param0 != -4366) {
          field_h = (int[]) null;
        } else {
          this.field_d.tick(0);
          return;
        }
        this.field_d.tick(0);
    }

    public final int getRenderX(byte param0) {
        int var2 = -13 / ((-23 - param0) / 53);
        return this.snakePit.getRenderX((byte) 101) + this.snake.getOffsetX((byte) 84);
    }

    final static int clampToScreenX(byte param0, int param1, int param2, int param3) {
        if (SoftwareRasterizer.width >= param3 + param1) {
          return param3;
        }
        if (param0 != -8) {
          PitSnakeModel.clampToScreenX((byte) 51, -70, 71, 100);
          if (-param1 + param3 + param2 < 0) {
            return -param1 + SoftwareRasterizer.width;
          }
          return -param1 + param2 + param3;
        }
        if (-param1 + param3 + param2 < 0) {
          return -param1 + SoftwareRasterizer.width;
        }
        return -param1 + param2 + param3;
    }

    public final boolean isRenderExpired(byte param0) {
        if (param0 != 48) {
          this.snake = (PitSnake) null;
          return this.snakePit.isRenderExpired((byte) 48);
        }
        return this.snakePit.isRenderExpired((byte) 48);
    }

    PitSnakeModel() {
        this.field_d = new ModelAnimator(6, 4, 1);
        this.field_d.play(1, true, (byte) -102, 7);
        this.field_f = true;
    }

    public final int getRenderZ(byte param0) {
        if (param0 >= -86) {
          PitSnakeModel.releaseStatics(-6);
          return this.snakePit.getRenderZ((byte) -94);
        }
        return this.snakePit.getRenderZ((byte) -94);
    }

    static {
    }
}
