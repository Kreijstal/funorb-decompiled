/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class WidgetStyleLayer {
    Sprite sprite;
    private boolean flushBeforeApply;
    static String[] field_c;
    private int offsetY;
    private int alpha;
    Sprite[] frameSprites;
    static String field_k;
    static int field_d;
    private int textColor;
    private int shadowColor;
    private int offsetX;

    final WidgetStyleLayer setShadowColor(int guard, int color) {
        if (guard >= -47) {
          return (WidgetStyleLayer) null;
        }
        this.shadowColor = color;
        return this;
    }

    final WidgetStyleLayer setOffsetY(int y, byte guard) {
        this.offsetY = y;
        int var3 = 120 % ((guard + 8) / 39);
        return this;
    }

    final void copyTo(int guard, WidgetStyleLayer target) {
        try {
          target.shadowColor = this.shadowColor;
          target.textColor = this.textColor;
          target.sprite = this.sprite;
          target.flushBeforeApply = this.flushBeforeApply;
          target.alpha = this.alpha;
          target.offsetX = this.offsetX;
          target.frameSprites = this.frameSprites;
          if (guard != -2) {
            this.offsetY = -16;
          }
          target.offsetY = this.offsetY;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "ef.I(" + guard + ',' + (target != null ? "{...}" : "null") + ')');
        }
    }

    final WidgetStyleLayer setOffsetX(int guard, int x) {
        this.offsetX = x;
        int var3 = -70 / ((guard - 39) / 35);
        return this;
    }

    final WidgetStyleLayer setTextColor(int color, int guard) {
        this.textColor = color;
        if (guard != -22572) {
          this.setShadowColor(-42, 116);
          return this;
        }
        return this;
    }

    final void applyTo(int originX, WidgetStyleLayer workingLayer, UiComponent component, int originY, int guard, StatefulTextPainter painter) {
        String stackIn_21_2 = null;
        String stackIn_24_2 = null;
        String stackIn_27_2 = null;
        try {
          int var7_int = -58 / ((guard + 32) / 47);
          if (this.flushBeforeApply) {
            workingLayer.draw(painter, component, originX, originY, (byte) 124);
            workingLayer.reset(true);
          }
          if (this.textColor >= -1) {
            workingLayer.textColor = this.textColor;
          }
          if (null != this.sprite) {
            workingLayer.sprite = this.sprite;
          }
          if (this.offsetY != -2147483648) {
            workingLayer.offsetY = this.offsetY;
          }
          if (this.offsetX != -2147483648) {
            workingLayer.offsetX = this.offsetX;
          }
          if (this.frameSprites != null) {
            workingLayer.frameSprites = this.frameSprites;
          }
          if (this.shadowColor >= -1) {
            workingLayer.shadowColor = this.shadowColor;
          }
          if (this.alpha == -2147483648) {
            return;
          }
          workingLayer.alpha = this.alpha;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var7 = decompiledCaughtException;
          RuntimeException stackIn_20_0 = var7;
          StringBuilder stackIn_20_1 = new StringBuilder().append("ef.K(").append(originX).append(',');
          if (workingLayer == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          StringBuilder stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',');
          if (component == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          StringBuilder stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(originY).append(',').append(guard).append(',');
          if (painter == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    public static void releaseStatics(int guard) {
        field_c = null;
        if (guard <= 38) {
          return;
        }
        field_k = null;
    }

    final WidgetStyleLayer setFlushBeforeApply(int guard, boolean flush) {
        this.flushBeforeApply = flush ? true : false;
        if (guard > -100) {
          this.sprite = (Sprite) null;
          return this;
        }
        return this;
    }

    final void draw(StatefulTextPainter painter, UiComponent component, int originX, int originY, byte guard) {
        int stackIn_21_2 = 0;
        int stackIn_24_3 = 0;
        int stackIn_27_8;
        String stackIn_32_2 = null;
        String stackIn_35_2 = null;
        try {
          if (guard < 0) {
            this.sprite = (Sprite) null;
          }
          ld.drawNineSlice(component.height, this.frameSprites, 4, originY + component.y, originX + component.x, component.width);
          if (null != this.sprite) {
            int var6_int = originX - (-component.x - this.offsetX);
            if (painter.horizontalAlignment == 1) {
              var6_int = var6_int + (component.width - this.sprite.fullWidth) / 2;
            }
            int var7 = this.offsetY + component.y + originY;
            if (painter.verticalAlignment == 1) {
              var7 = var7 + (-this.sprite.fullHeight + component.height) / 2;
            }
            if (painter.horizontalAlignment == 2) {
              var6_int = var6_int + (component.width - this.sprite.fullWidth);
            }
            if (painter.verticalAlignment == 2) {
              var7 = var7 + (-this.sprite.fullHeight + component.height);
            }
            this.sprite.drawTransparent(var6_int, var7);
          }
          String var6 = painter.displayText((byte) 39, component);
          if (var6 != null &&
            painter.font != null) {
            if (this.textColor < 0) {
              return;
            }
            BitmapFont stackIn_20_0 = painter.font;
            String stackIn_20_1 = var6;
            if (this.offsetX == -2147483648) {
              stackIn_21_2 = 0;
            } else {
              stackIn_21_2 = this.offsetX;
            }
            int stackIn_23_2 = stackIn_21_2 + (originX + component.x + painter.leftInset);
            if (this.offsetY != -2147483648) {
              stackIn_24_3 = this.offsetY;
            } else {
              stackIn_24_3 = 0;
            }
            int stackIn_26_3 = stackIn_24_3 + painter.topInset + (component.y + originY);
            int stackIn_26_4 = -painter.leftInset + component.width - painter.rightInset;
            int stackIn_26_5 = -painter.bottomInset - painter.topInset + component.height;
            int stackIn_26_6 = this.textColor;
            int stackIn_26_7 = this.shadowColor;
            if (this.alpha != -2147483648) {
              stackIn_27_8 = this.alpha;
            } else {
              stackIn_27_8 = 256;
            }
            ((BitmapFont) (Object) stackIn_20_0).drawParagraphAlpha(stackIn_20_1, stackIn_23_2, stackIn_26_3, stackIn_26_4, stackIn_26_5, stackIn_26_6, stackIn_26_7, stackIn_27_8, painter.horizontalAlignment, painter.verticalAlignment, painter.lineSpacing);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var6_ref = decompiledCaughtException;
          RuntimeException stackIn_31_0 = var6_ref;
          StringBuilder stackIn_31_1 = new StringBuilder().append("ef.H(");
          if (painter == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          StringBuilder stackIn_34_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',');
          if (component == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',').append(originX).append(',').append(originY).append(',').append(guard).append(')').toString());
        }
    }

    final WidgetStyleLayer setFrameSprites(int guard, Sprite[] sprites) {
        String stackIn_8_2 = null;
        try {
          this.frameSprites = sprites;
          if (guard == 2) {
            return this;
          }
          WidgetStyleLayer stackIn_2_0 = (WidgetStyleLayer) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_7_0 = var3;
          StringBuilder stackIn_7_1 = new StringBuilder().append("ef.B(").append(guard).append(',');
          if (sprites == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final void reset(boolean guard) {
        this.shadowColor = -1;
        this.sprite = null;
        if (guard) {
          this.frameSprites = null;
          this.alpha = 256;
          this.offsetX = 0;
          this.offsetY = 0;
          this.textColor = 0;
          return;
        }
        field_c = (String[]) null;
        this.frameSprites = null;
        this.alpha = 256;
        this.offsetX = 0;
        this.offsetY = 0;
        this.textColor = 0;
    }

    WidgetStyleLayer() {
        this.sprite = null;
        this.flushBeforeApply = false;
        this.offsetY = -2147483648;
        this.textColor = -2;
        this.frameSprites = null;
        this.alpha = -2147483648;
        this.shadowColor = -2;
        this.offsetX = -2147483648;
    }

    static {
        field_c = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        field_k = "Rock buster - 'ENTER' or 'R' or 'ALT' to fire";
        field_d = 50;
    }
}
