/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ModalDialog extends WidgetContainer {
    boolean open;
    DialogLayer dialogLayer;
    private int opacity;
    static TextureFormat DEPTH_COMPONENT;
    static int[] field_C;

    ModalDialog(DialogLayer layer, int initialWidth, int initialHeight) {
        super(LoginFieldValue.field_b - initialWidth >> 1, LoginForm.field_O - initialHeight >> 1, initialWidth, initialHeight, (WidgetRenderer) null);
        try {
          this.open = false;
          this.opacity = 0;
          this.dialogLayer = layer;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "rg.<init>(" + (layer != null ? "{...}" : "null") + ',' + initialWidth + ',' + initialHeight + ')');
        }
    }

    public static void releaseStatics(byte param0) {
        DEPTH_COMPONENT = null;
        int var1 = 68 / ((1 - param0) / 63);
        field_C = null;
    }

    final void renderLayer(int parentX, int parentY, byte guard, int layer) {
        if (this.opacity == 0) {
          return;
        }
        if (this.opacity >= 256) {
          if (layer == 0) {
            this.drawBackdrop(117, parentX + this.x, parentY + this.y);
            super.renderLayer(parentX, parentY, (byte) -112, layer);
            return;
          }
          return;
        }
        if (null == TickClock.field_a) {
          TickClock.field_a = new Sprite(this.width, this.height);
          jq.pushSpriteRaster(7161, TickClock.field_a);
          SoftwareRasterizer.clear();
          this.drawBackdrop(113, 0, 0);
          if (guard < -35) {
            super.renderLayer(-parentX - this.x, -parentY - this.y, (byte) -114, layer);
            ClientException.popRasterState((byte) 114);
            TickClock.field_a.a(parentX + this.x, parentY + this.y, this.opacity);
            return;
          }
          this.focusedChild(-77);
          super.renderLayer(-parentX - this.x, -parentY - this.y, (byte) -114, layer);
          ClientException.popRasterState((byte) 114);
          TickClock.field_a.a(parentX + this.x, parentY + this.y, this.opacity);
          return;
        }
        if (TickClock.field_a.field_x < this.width) {
          TickClock.field_a = new Sprite(this.width, this.height);
          jq.pushSpriteRaster(7161, TickClock.field_a);
          SoftwareRasterizer.clear();
          this.drawBackdrop(113, 0, 0);
          if (guard < -35) {
            super.renderLayer(-parentX - this.x, -parentY - this.y, (byte) -114, layer);
            ClientException.popRasterState((byte) 114);
            TickClock.field_a.a(parentX + this.x, parentY + this.y, this.opacity);
            return;
          }
          this.focusedChild(-77);
          super.renderLayer(-parentX - this.x, -parentY - this.y, (byte) -114, layer);
          ClientException.popRasterState((byte) 114);
          TickClock.field_a.a(parentX + this.x, parentY + this.y, this.opacity);
          return;
        }
        if (this.height > TickClock.field_a.field_u) {
          TickClock.field_a = new Sprite(this.width, this.height);
          jq.pushSpriteRaster(7161, TickClock.field_a);
          SoftwareRasterizer.clear();
          this.drawBackdrop(113, 0, 0);
          if (guard < -35) {
            super.renderLayer(-parentX - this.x, -parentY - this.y, (byte) -114, layer);
            ClientException.popRasterState((byte) 114);
            TickClock.field_a.a(parentX + this.x, parentY + this.y, this.opacity);
            return;
          }
          this.focusedChild(-77);
          super.renderLayer(-parentX - this.x, -parentY - this.y, (byte) -114, layer);
          ClientException.popRasterState((byte) 114);
          TickClock.field_a.a(parentX + this.x, parentY + this.y, this.opacity);
          return;
        }
        jq.pushSpriteRaster(7161, TickClock.field_a);
        SoftwareRasterizer.clear();
        this.drawBackdrop(113, 0, 0);
        if (guard < -35) {
          super.renderLayer(-parentX - this.x, -parentY - this.y, (byte) -114, layer);
          ClientException.popRasterState((byte) 114);
          TickClock.field_a.a(parentX + this.x, parentY + this.y, this.opacity);
          return;
        }
        this.focusedChild(-77);
        super.renderLayer(-parentX - this.x, -parentY - this.y, (byte) -114, layer);
        ClientException.popRasterState((byte) 114);
        TickClock.field_a.a(parentX + this.x, parentY + this.y, this.opacity);
    }

    boolean advanceAnimation(int guard) {
        boolean stackIn_8_0 = false;
        boolean stackIn_15_0 = false;
        boolean stackIn_24_0 = false;
        boolean stackIn_30_0 = false;
        boolean stackIn_39_0 = false;
        boolean stackIn_45_0 = false;
        boolean stackIn_53_0 = false;
        boolean stackIn_59_0 = false;
        int var2;
        int var3;
        int var2Lifetime1;
        int var3Lifetime1;
        if (guard != -28778) {
          this.dialogLayer = (DialogLayer) null;
          var2 = this.targetOpacity((byte) -100);
          var3 = var2 - this.opacity;
          if (var3 <= 0) {
            if (var3 < 0) {
              this.opacity = this.opacity + (1 + var3 - 16) / 16;
              if (0 != this.opacity) {
                return false;
              }
              if (var2 != 0) {
                return false;
              }
              stackIn_15_0 = !(this.open);
              return stackIn_15_0;
            }
            stackIn_8_0 = (0 == this.opacity) && (var2 == 0) && (!this.open);
            return stackIn_8_0;
          }
          this.opacity = this.opacity + (7 + var3) / 8;
          if (var3 >= 0) {
            stackIn_30_0 = (0 == this.opacity) && (var2 == 0) && (!this.open);
            return stackIn_30_0;
          }
          this.opacity = this.opacity + (1 + var3 - 16) / 16;
          stackIn_24_0 = (0 == this.opacity) && (var2 == 0) && (!this.open);
          return stackIn_24_0;
        }
        var2Lifetime1 = this.targetOpacity((byte) -100);
        var3Lifetime1 = var2Lifetime1 - this.opacity;
        if (var3Lifetime1 <= 0) {
          if (var3Lifetime1 >= 0) {
            stackIn_53_0 = (0 == this.opacity) && (var2Lifetime1 == 0) && (!this.open);
            return stackIn_53_0;
          }
          this.opacity = this.opacity + (1 + var3Lifetime1 - 16) / 16;
          stackIn_59_0 = (0 == this.opacity) && (var2Lifetime1 == 0) && (!this.open);
          return stackIn_59_0;
        }
        this.opacity = this.opacity + (7 + var3Lifetime1) / 8;
        if (var3Lifetime1 >= 0) {
          stackIn_39_0 = (0 == this.opacity) && (var2Lifetime1 == 0) && (!this.open);
          return stackIn_39_0;
        }
        this.opacity = this.opacity + (1 + var3Lifetime1 - 16) / 16;
        stackIn_45_0 = (0 == this.opacity) && (var2Lifetime1 == 0) && (!this.open);
        return stackIn_45_0;
    }

    final static boolean isAsciiLetter(int guard, char character) {
        int var2 = -62 % ((-58 - guard) / 63);
        if (65 <= character) {
          if (character <= 90) {
            return true;
          }
          if (character < 97) {
            return false;
          }
          if (character <= 122) {
            return true;
          }
          return false;
        }
        if (character < 97) {
          return false;
        }
        if (character > 122) {
          return false;
        }
        return true;
    }

    boolean finishAnimation(int guard) {
        if (guard != 0) {
          return false;
        }
        this.opacity = this.targetOpacity((byte) -100);
        if (0 != this.opacity) {
          return false;
        }
        if (!this.open) {
          return true;
        }
        return false;
    }

    final void resizeCentered(int newWidth, int newHeight, int guard) {
        if (guard >= 37) {
          this.setBounds(106, LoginFieldValue.field_b - newWidth >> 1, -newHeight + LoginForm.field_O >> 1, newHeight, newWidth);
          return;
        }
        DEPTH_COMPONENT = (TextureFormat) null;
        this.setBounds(106, LoginFieldValue.field_b - newWidth >> 1, -newHeight + LoginForm.field_O >> 1, newHeight, newWidth);
    }

    abstract void drawBackdrop(int guard, int originX, int originY);

    final UiWidget focusedChild(int guard) {
        UiWidget var2 = super.focusedChild(-105);
        int var3 = -113 / ((guard + 25) / 58);
        if (var2 != null) {
          return var2;
        }
        return (UiWidget) (this);
    }

    final static void a(byte param0, int param1) {
        LoginCredentials.pollAccountDialogs(19886);
        if (param0 != 55) {
          ModalDialog.isAsciiLetter(124, 'r');
        }
    }

    private final int targetOpacity(byte guard) {
        if (guard == -100) {
          return !this.open ? 0 : this.dialogLayer.topOpenDialog((byte) 54) != this ? 0 : 256;
        }
        return -55;
    }

    static {
        DEPTH_COMPONENT = new TextureFormat(1);
        field_C = new int[1024];
    }
}
