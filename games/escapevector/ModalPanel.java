/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ModalPanel extends UiContainer {
    static String field_O;
    static java.applet.Applet field_P;
    static IntrusiveDeque field_L;
    static int field_H;
    private int alpha;
    static String field_J;
    static String field_K;
    static int[] field_R;
    private ModalStack modalStack;
    boolean open;
    static String field_I;

    boolean updateAnimationsAndCheckClosed(int guard) {
        if (guard != -13907) {
          return false;
        }
        int var2 = this.targetAlpha(-1);
        int var3 = var2 - this.alpha;
        if (0 < var3) {
          this.alpha = this.alpha + (8 + var3 - 1) / 8;
        }
        if (var3 < 0) {
          this.alpha = this.alpha + (1 + (var3 - 16)) / 16;
        }
        boolean stackIn_12_0 = (0 == this.alpha) && (0 == var2) && (!this.open);
        return stackIn_12_0;
    }

    final UiComponent findFocusedChild(boolean guard) {
        UiComponent var2 = super.findFocusedChild(guard);
        if (var2 != null) {
          return var2;
        }
        return (UiComponent) (this);
    }

    final void drawLayer(int screenY, byte guard, int layer, int screenX) {
        if (0 == this.alpha) {
          return;
        }
        if (this.alpha >= 256) {
          if (layer != 0) {
            return;
          }
          this.drawPanelBackground(this.y + screenY, screenX + this.x, (byte) 89);
          super.drawLayer(screenY, (byte) 87, layer, screenX);
          return;
        }
        if (Minimap.field_r == null ||
          !(Minimap.field_r.width >= this.width) ||
          !(this.height <= Minimap.field_r.height)) {
          Minimap.field_r = new Sprite(this.width, this.height);
        }
        TickClock.pushSpriteRaster(Minimap.field_r, (byte) -76);
        SoftwareRasterizer.clearFramebuffer();
        this.drawPanelBackground(0, 0, (byte) 87);
        super.drawLayer(-this.y - screenY, (byte) 118, layer, -this.x - screenX);
        if (guard <= 85) {
          field_L = (IntrusiveDeque) null;
        }
        RasterRestoreSupport.popRasterState((byte) 125);
        Minimap.field_r.drawAlpha(this.x + screenX, this.y + screenY, this.alpha);
    }

    final static void drawIndexedSpriteAlphaGradient(int x, int leftAlpha, int guard, IndexedSprite sprite, int y, int rightAlpha) {
        String stackIn_36_2 = null;
        int var20 = EscapeVector.obfuscationControl;
        try {
          if (guard != 4163) {
            String var21 = (String) null;
            ModalPanel.splitString(-7, (String) null, 'ﾱ');
          }
          int var6_int = (rightAlpha - leftAlpha << 8) / sprite.field_a;
          x = x + sprite.field_f;
          y = y + sprite.field_i;
          int var7 = var6_int * sprite.field_f + (leftAlpha << 8);
          int var8 = y * SoftwareRasterizer.width + x;
          int var9 = 0;
          int var10 = sprite.field_d;
          int var11 = sprite.field_g;
          int var12 = -var11 + SoftwareRasterizer.width;
          int var13 = 0;
          if (SoftwareRasterizer.clipTop > y) {
            int var14 = SoftwareRasterizer.clipTop - y;
            var10 = var10 - var14;
            var8 = var8 + SoftwareRasterizer.width * var14;
            y = SoftwareRasterizer.clipTop;
            var9 = var9 + var14 * var11;
          }
          if (y + var10 > SoftwareRasterizer.clipBottom) {
            var10 = var10 - (var10 + y - SoftwareRasterizer.clipBottom);
          }
          if (x < SoftwareRasterizer.clipLeft) {
            int var14Lifetime1 = -x + SoftwareRasterizer.clipLeft;
            var8 = var8 + var14Lifetime1;
            var7 = var7 + var6_int * var14Lifetime1;
            x = SoftwareRasterizer.clipLeft;
            var11 = var11 - var14Lifetime1;
            var9 = var9 + var14Lifetime1;
            var12 = var12 + var14Lifetime1;
            var13 = var13 + var14Lifetime1;
          }
          if (var11 + x > SoftwareRasterizer.clipRight) {
            int var14Lifetime2 = -SoftwareRasterizer.clipRight + var11 + x;
            var13 = var13 + var14Lifetime2;
            var11 = var11 - var14Lifetime2;
            var12 = var12 + var14Lifetime2;
          }
          if (var11 > 0 &&
            var10 > 0) {
            for (y = -var10; 0 > y; y++) {
              int var14Lifetime3 = var7;
              for (x = -var11; 0 > x; x++) {
                int var15 = var14Lifetime3 >> 8;
                int var16 = 256 - var15;
                var14Lifetime3 = var14Lifetime3 + var6_int;
                if (var15 < 0) {
                  var8++;
                  var9++;
                } else {
                  int incrementValue$0 = var9;
                  var9++;
                  int var17 = sprite.field_l[sprite.field_k[incrementValue$0] & 255];
                  if (var17 != 0) {
                    if (255 >= var15) {
                      int var18 = SoftwareRasterizer.pixels[var8];
                      int var19 = 16711935 & var15 * (16711935 & var17) + var16 * (var18 & 16711935) >> 8;
                      SoftwareRasterizer.pixels[var8] = (SpriteCheckboxPainter.bitwiseAnd(SpriteCheckboxPainter.bitwiseAnd(var17, 65280) * var15 + var16 * SpriteCheckboxPainter.bitwiseAnd(var18, 65280), 16711906) >> 8) + var19;
                    } else {
                      SoftwareRasterizer.pixels[var8] = var17;
                    }
                  }
                  var8++;
                }
              }
              var9 = var9 + var13;
              var8 = var8 + var12;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var6 = decompiledCaughtException;
          RuntimeException stackIn_35_0 = var6;
          StringBuilder stackIn_35_1 = new StringBuilder().append("bb.DA(").append(x).append(',').append(leftAlpha).append(',').append(guard).append(',');
          if (sprite == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',').append(y).append(',').append(rightAlpha).append(')').toString());
        }
    }

    final static void halveAndAddPixels(int guard, int offset, int color, int length, int[] destination) {
        String stackIn_9_2 = null;
        int var8 = EscapeVector.obfuscationControl;
        try {
          if (guard != -23466) {
            return;
          }
          while (true) {
            length--;
            if (0 > length) {
              return;
            }
            int[] var9 = destination;
            int[] var5 = var9;
            int var6 = offset;
            int var7 = color;
            var9[var6] = SpriteCheckboxPainter.bitwiseAnd(var9[var6] >> 1, 8355711) + var7;
            offset++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5_ref = decompiledCaughtException;
          RuntimeException stackIn_8_0 = var5_ref;
          StringBuilder stackIn_8_1 = new StringBuilder().append("bb.L(").append(guard).append(',').append(offset).append(',').append(color).append(',').append(length).append(',');
          if (destination == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    public static void releaseStatics(byte guard) {
        if (guard != 127) {
          field_H = -93;
        }
        field_P = null;
        field_L = null;
        field_R = null;
        field_I = null;
        field_J = null;
        field_O = null;
        field_K = null;
    }

    ModalPanel(ModalStack param0, int param1, int param2) {
        super(DelayedServerPacket.field_h - param1 >> 1, SingleChildContainer.field_B - param2 >> 1, param1, param2, (WidgetPainter) null);
        try {
          this.open = false;
          this.alpha = 0;
          this.modalStack = param0;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "bb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    abstract void drawPanelBackground(int screenY, int screenX, byte guard);

    private final int targetAlpha(int guard) {
        if (guard != -1) {
          field_J = (String) null;
        }
        return this.open ? this.modalStack.topOpenPanel(0) != this ? 0 : 256 : 0;
    }

    final static String[] splitString(int guard, String text, char separator) {
        int var8 = 0;
        String stackIn_14_2 = null;
        int var9 = EscapeVector.obfuscationControl;
        try {
          CharSequence var11 = (CharSequence) ((Object) text);
          int var3_int = PasswordFieldPainter.countCharacter(var11, 4277, separator);
          String[] var4 = new String[var3_int + 1];
          if (guard > -127) {
            String var10 = (String) null;
            ModalPanel.splitString(119, (String) null, 'e');
          }
          int var5 = 0;
          int var6 = 0;
          for (int var7 = 0; var7 < var3_int; var7++) {
            for (var8 = var6; text.charAt(var8) != separator; var8++) {
            }
            int incrementValue$1 = var5;
            var5++;
            var4[incrementValue$1] = text.substring(var6, var8);
            var6 = var8 + 1;
          }
          var4[var3_int] = text.substring(var6);
          String[] stackIn_10_0 = var4;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_13_0 = var3;
          StringBuilder stackIn_13_1 = new StringBuilder().append("bb.U(").append(guard).append(',');
          if (text == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(separator).append(')').toString());
        }
    }

    boolean refreshVisibilityAndCheckClosed(byte guard) {
        int var2 = -106 / ((guard - 7) / 55);
        this.alpha = this.targetAlpha(-1);
        boolean stackIn_4_0 = (this.alpha == 0) && (!this.open);
        return stackIn_4_0;
    }

    final void resizeAndCenter(int guard, int panelHeight, int panelWidth) {
        if (guard != 255) {
          field_K = (String) null;
        }
        this.setBounds(panelWidth, -panelHeight + SingleChildContainer.field_B >> 1, -panelWidth + DelayedServerPacket.field_h >> 1, true, panelHeight);
    }

    static {
        field_O = "Back";
        field_H = 0;
        field_J = "Cancel";
        field_R = new int[]{1, 160};
        field_K = "Enter the name you'd prefer. This is the name displayed to other players.";
        field_I = "to keep fullscreen or";
    }
}
