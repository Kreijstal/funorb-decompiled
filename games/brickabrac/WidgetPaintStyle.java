/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class WidgetPaintStyle {
    private int offsetY;
    static String field_e;
    private boolean paintPreviousStyle;
    private int shadowPaint;
    static boolean field_a;
    static int uiBootstrapStage;
    static RgbSprite arcticSmallSprite;
    private int textAlpha256;
    static String field_n;
    static int field_j;
    static int[] field_o;
    private int textPaint;
    RgbSprite[] frameSprites;
    RgbSprite icon;
    static int field_g;
    private int offsetX;

    public static void b(int param0) {
        if (param0 != 2) {
          return;
        }
        field_n = null;
        field_o = null;
        field_e = null;
        arcticSmallSprite = null;
    }

    final WidgetPaintStyle setOffsetX(int offsetX, byte obfuscationGuard) {
        if (obfuscationGuard != -50) {
          this.setTextPaint(true, -56);
          this.offsetX = offsetX;
          return this;
        }
        this.offsetX = offsetX;
        return this;
    }

    final WidgetPaintStyle setPaintPreviousStyle(boolean paintPreviousStyle, boolean obfuscationGuard) {
        this.paintPreviousStyle = paintPreviousStyle ? true : false;
        if (!obfuscationGuard) {
          return this;
        }
        String var4 = (String) null;
        WidgetPaintStyle.a((ResourceArchive) null, (String) null, -112, (String) null);
        return this;
    }

    final WidgetPaintStyle setShadowPaint(int paint, byte obfuscationGuard) {
        if (obfuscationGuard != -69) {
          this.textPaint = 10;
          this.shadowPaint = paint;
          return this;
        }
        this.shadowPaint = paint;
        return this;
    }

    final static String a(ResourceArchive param0, String param1, int param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        String stackIn_3_0 = null;
        String stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = 94 % ((param2 - 52) / 42);
          if (!param0.ensureIndex((byte) -127)) {
            stackIn_3_0 = (String) (param1);
            return stackIn_3_0;
          }
          stackIn_5_0 = param3 + " - " + param0.getProgress(-4126) + "%";
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("be.L(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final void paintStyle(int parentY, StatefulWidgetRenderer renderer, Widget widget, byte obfuscationGuard, int parentX) {
        TextFont stackIn_18_0 = null;
        String stackIn_18_1 = null;
        int stackIn_19_2 = 0;
        int stackIn_21_2;
        int stackIn_21_3;
        int stackIn_21_4;
        int stackIn_21_5;
        int stackIn_22_6 = 0;
        int stackIn_24_3;
        int stackIn_24_4;
        int stackIn_24_5;
        int stackIn_24_6;
        int stackIn_24_7;
        int stackIn_25_8;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        String var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        int var7Lifetime1;
        try {
          nh.paintNineSliceFrame(widget.width, widget.height, -40, widget.x + parentX, this.frameSprites, parentY + widget.y);
          if (null != this.icon) {
            var6_int = this.offsetX + widget.x + parentX;
            if (renderer.horizontalAlignment == 1) {
              var6_int = var6_int + (widget.width - this.icon.canvasWidth) / 2;
            }
            var7 = this.offsetY + (parentY + widget.y);
            if (renderer.verticalAlignment == 1) {
              var7 = var7 + (-this.icon.canvasHeight + widget.height) / 2;
            }
            if (2 == renderer.horizontalAlignment) {
              var6_int = var6_int + (widget.width - this.icon.canvasWidth);
            }
            if (renderer.verticalAlignment == 2) {
              var7 = var7 + (widget.height - this.icon.canvasHeight);
            }
            this.icon.drawTransparent(var6_int, var7);
          }
          var6 = renderer.getDisplayText(widget, true);
          var7Lifetime1 = 3 % ((obfuscationGuard - 13) / 43);
          if (var6 != null &&
            renderer.font != null &&
            0 <= this.textPaint) {
            stackIn_18_0 = renderer.font;
            stackIn_18_1 = var6;
            if (this.offsetX != -2147483648) {
              stackIn_19_2 = this.offsetX;
            } else {
              stackIn_19_2 = 0;
            }
            stackIn_21_2 = stackIn_19_2 + renderer.leftInset + (parentX + widget.x);
            stackIn_21_3 = parentY;
            stackIn_21_4 = -widget.y;
            stackIn_21_5 = -renderer.topInset;
            if (this.offsetY == -2147483648) {
              stackIn_22_6 = 0;
            } else {
              stackIn_22_6 = this.offsetY;
            }
            stackIn_24_3 = stackIn_21_3 - (stackIn_21_4 + (stackIn_21_5 - stackIn_22_6));
            stackIn_24_4 = widget.width - renderer.leftInset - renderer.rightInset;
            stackIn_24_5 = -renderer.topInset + (widget.height - renderer.bottomInset);
            stackIn_24_6 = this.textPaint;
            stackIn_24_7 = this.shadowPaint;
            if (this.textAlpha256 == -2147483648) {
              stackIn_25_8 = 256;
            } else {
              stackIn_25_8 = this.textAlpha256;
            }
            ((TextFont) (Object) stackIn_18_0).a(stackIn_18_1, stackIn_21_2, stackIn_24_3, stackIn_24_4, stackIn_24_5, stackIn_24_6, stackIn_24_7, stackIn_25_8, renderer.horizontalAlignment, renderer.verticalAlignment, renderer.lineSpacing);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_29_0 = var6_ref;
          stackIn_29_1 = new StringBuilder().append("be.E(").append(parentY).append(',');
          if (renderer == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',');
          if (widget == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(obfuscationGuard).append(',').append(parentX).append(')').toString());
        }
    }

    final void mergeInto(WidgetPaintStyle target, int obfuscationGuard, StatefulWidgetRenderer renderer, Widget widget, int parentX, int parentY) {
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          if (this.paintPreviousStyle) {
            target.paintStyle(parentY, renderer, widget, (byte) 99, parentX);
            target.resetPaintStyle(-2147483648);
          }
          if (this.offsetX != -2147483648) {
            target.offsetX = this.offsetX;
          }
          if (this.offsetY != -2147483648) {
            target.offsetY = this.offsetY;
          }
          if (null != this.icon) {
            target.icon = this.icon;
          }
          if (-1 <= this.textPaint) {
            target.textPaint = this.textPaint;
          }
          if (this.shadowPaint >= -1) {
            target.shadowPaint = this.shadowPaint;
          }
          if (~this.textAlpha256 != obfuscationGuard) {
            target.textAlpha256 = this.textAlpha256;
          }
          if (null == this.frameSprites) {
            return;
          }
          target.frameSprites = this.frameSprites;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_23_0 = var7;
          stackIn_23_1 = new StringBuilder().append("be.N(");
          if (target == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(obfuscationGuard).append(',');
          if (renderer == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',');
          if (widget == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(parentX).append(',').append(parentY).append(')').toString());
        }
    }

    final static byte[] readArchiveBytes(boolean obfuscationGuard, Object storage, boolean copy) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        ByteStorage var4 = null;
        byte[] stackIn_6_0 = null;
        byte[] stackIn_8_0 = null;
        byte[] stackIn_11_0 = null;
        byte[] stackIn_14_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (storage == null) {
            return null;
          }
          if (storage instanceof byte[]) {
            var3 = (byte[]) (storage);
            if (!copy) {
              stackIn_8_0 = var3;
              return stackIn_8_0;
            }
            stackIn_6_0 = AppletGameShell.copyBytes(false, var3);
            return stackIn_6_0;
          }
          if (obfuscationGuard) {
            stackIn_11_0 = (byte[]) null;
            return stackIn_11_0;
          }
          if (!(storage instanceof ByteStorage)) {
            throw new IllegalArgumentException();
          }
          var4 = (ByteStorage) (storage);
          stackIn_14_0 = var4.toByteArray(16616);
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_18_0 = var3_ref;
          stackIn_18_1 = new StringBuilder().append("be.G(").append(obfuscationGuard).append(',');
          if (storage == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(copy).append(')').toString());
        }
    }

    final WidgetPaintStyle setOffsetY(int obfuscationGuard, int offsetY) {
        if (obfuscationGuard != 0) {
          this.textPaint = 14;
          this.offsetY = offsetY;
          return this;
        }
        this.offsetY = offsetY;
        return this;
    }

    final WidgetPaintStyle setTextPaint(boolean obfuscationGuard, int paint) {
        this.textPaint = paint;
        if (obfuscationGuard) {
          this.setTextPaint(false, 75);
          return this;
        }
        return this;
    }

    final void copyPaintStyleTo(boolean obfuscationGuard, WidgetPaintStyle target) {
        try {
          if (obfuscationGuard) {
            Object var4 = (Object) null;
            WidgetPaintStyle.readArchiveBytes(true, (Object) null, true);
          }
          target.icon = this.icon;
          target.offsetX = this.offsetX;
          target.paintPreviousStyle = this.paintPreviousStyle;
          target.textAlpha256 = this.textAlpha256;
          target.textPaint = this.textPaint;
          target.offsetY = this.offsetY;
          target.frameSprites = this.frameSprites;
          target.shadowPaint = this.shadowPaint;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "be.M(" + obfuscationGuard + ',' + (target != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(byte param0) {
        int var1 = 47 % ((59 - param0) / 63);
        return FullscreenFailureKind.field_i;
    }

    final WidgetPaintStyle setFrameSprites(RgbSprite[] sprites, int obfuscationGuard) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard != -2147483648) {
            field_o = (int[]) null;
          }
          this.frameSprites = sprites;
          return this;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("be.J(");
          if (sprites == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final void resetPaintStyle(int obfuscationGuard) {
        this.textAlpha256 = 256;
        this.textPaint = 0;
        if (obfuscationGuard == -2147483648) {
          this.offsetX = 0;
          this.offsetY = 0;
          this.shadowPaint = -1;
          this.frameSprites = null;
          this.icon = null;
          return;
        }
    }

    WidgetPaintStyle() {
        this.offsetY = -2147483648;
        this.paintPreviousStyle = false;
        this.shadowPaint = -2;
        this.textAlpha256 = -2147483648;
        this.textPaint = -2;
        this.frameSprites = null;
        this.icon = null;
        this.offsetX = -2147483648;
    }

    static {
        uiBootstrapStage = 0;
        field_a = true;
        field_e = "Won";
        field_n = "You can ask to join this game";
        field_o = new int[]{20, 21, 36, 6, 8};
    }
}
