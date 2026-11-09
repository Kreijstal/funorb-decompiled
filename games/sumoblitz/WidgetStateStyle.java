/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class WidgetStateStyle {
    static RasterIndexedSprite[] field_c;
    static byte[] field_b;
    private int alpha;
    Sprite icon;
    private int offsetX;
    private int offsetY;
    Sprite[] backgroundSlices;
    private boolean flushBeforeApply;
    private int textColor;
    private int textShadow;

    final void copyTo(WidgetStateStyle destination, byte guard) {
        try {
          if (guard < 74) {
            field_b = (byte[]) null;
          }
          destination.offsetX = this.offsetX;
          destination.flushBeforeApply = this.flushBeforeApply;
          destination.offsetY = this.offsetY;
          destination.alpha = this.alpha;
          destination.icon = this.icon;
          destination.textColor = this.textColor;
          destination.textShadow = this.textShadow;
          destination.backgroundSlices = this.backgroundSlices;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "sm.F(" + (destination != null ? "{...}" : "null") + ',' + guard + ')');
        }
    }

    final void reset(boolean guard) {
        this.offsetX = 0;
        this.textColor = 0;
        this.icon = null;
        if (!guard) {
          field_c = (RasterIndexedSprite[]) null;
        }
        this.alpha = 256;
        this.textShadow = -1;
        this.offsetY = 0;
        this.backgroundSlices = null;
    }

    final WidgetStateStyle withTextShadow(int color, int guard) {
        this.textShadow = color;
        if (guard != 30149) {
          this.alpha = -30;
        }
        return this;
    }

    final WidgetStateStyle withBackgroundSlices(Sprite[] sprites, int guard) {
        RuntimeException var3 = null;
        WidgetStateStyle stackIn_2_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (guard != 2147483647) {
            stackIn_2_0 = (WidgetStateStyle) null;
            return stackIn_2_0;
          }
          this.backgroundSlices = sprites;
          return this;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("sm.J(");
          if (sprites == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(guard).append(')').toString());
        }
    }

    final static void initializePlayerDrone(int guard) {
        SpriteMask.drones[0] = (Drone) ((Object) new PlayerDrone(81920, 61440));
        SpriteMask.drones[0].speedLevel = !RenderPresentationException.a(false) ? 5 : 10;
        SpriteMask.drones[0].tractionLevel = !RenderPresentationException.a(false) ? 5 : 10;
        SpriteMask.drones[0].bounceLevel = RenderPresentationException.a(false) ? 10 : 5;
        if (guard <= 68) {
          WidgetStateStyle.releaseStatics((byte) 108);
        }
        SpriteMask.drones[0].recomputeUpgradeStats((byte) 35);
        AppletTickHistory.field_b = 250;
    }

    final WidgetStateStyle withOffsetX(int offset, int guard) {
        if (guard != -1) {
          return (WidgetStateStyle) null;
        }
        this.offsetX = offset;
        return this;
    }

    final WidgetStateStyle withTextColor(int color, int guard) {
        if (guard != 17818) {
          this.textColor = 47;
        }
        this.textColor = color;
        return this;
    }

    final WidgetStateStyle withOffsetY(int guard, int offset) {
        this.offsetY = offset;
        if (guard != 1) {
          this.offsetY = 21;
        }
        return this;
    }

    final static short[] decodePackedShortArray(short[] existing, IsaacPacketBuffer packet, int guard, int lengthBits) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        short[] stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          var4_int = packet.readBits(lengthBits, (byte) -109);
          if (var4_int == 0) {
            return null;
          }
          if (guard >= -111) {
            WidgetStateStyle.releaseStatics((byte) -110);
          }
          if (existing == null ||
            existing.length != var4_int) {
            existing = new short[var4_int];
          }
          var5 = packet.readBits(4, (byte) -94);
          var6 = (short)packet.readBits(16, (byte) -119);
          if (var5 > 0) {
            for (var7 = 0; var4_int > var7; var7++) {
              existing[var7] = (short)(var6 + packet.readBits(var5, (byte) -123));
            }
          } else {
            for (var7 = 0; var7 < var4_int; var7++) {
              existing[var7] = (short)var6;
            }
          }
          stackIn_18_0 = (short[]) (existing);
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_21_0 = var4;
          stackIn_21_1 = new StringBuilder().append("sm.K(");
          if (existing == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (packet == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(guard).append(',').append(lengthBits).append(')').toString());
        }
    }

    final WidgetStateStyle withFlushBeforeApply(boolean enabled, boolean guard) {
        this.flushBeforeApply = enabled ? true : false;
        if (!guard) {
          this.withTextShadow(124, 58);
        }
        return this;
    }

    public static void releaseStatics(byte param0) {
        field_c = null;
        field_b = null;
        if (param0 != -30) {
          field_c = (RasterIndexedSprite[]) null;
        }
    }

    WidgetStateStyle() {
        this.alpha = -2147483648;
        this.icon = null;
        this.backgroundSlices = null;
        this.offsetX = -2147483648;
        this.textShadow = -2;
        this.offsetY = -2147483648;
        this.textColor = -2;
        this.flushBeforeApply = false;
    }

    final void draw(int parentY, StatefulWidgetRenderer renderer, int parentX, int guard, UiWidget widget) {
        LegacyBitmapFont stackIn_20_0 = null;
        String stackIn_20_1 = null;
        int stackIn_21_2 = 0;
        int stackIn_23_2;
        int stackIn_23_3;
        int stackIn_24_4 = 0;
        int stackIn_26_3;
        int stackIn_26_4;
        int stackIn_26_5;
        int stackIn_26_6;
        int stackIn_26_7;
        int stackIn_27_8;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7_int = 0;
        String var7 = null;
        int var8 = 0;
        try {
          SoftwareTransform3D.drawNineSlice(parentX + widget.x, this.backgroundSlices, (byte) -34, widget.y + parentY, widget.height, widget.width);
          var6_int = -128 % ((guard + 9) / 35);
          if (this.icon != null) {
            var7_int = this.offsetX + (parentX + widget.x);
            var8 = this.offsetY + widget.y + parentY;
            if (1 == renderer.horizontalAlignment) {
              var7_int = var7_int + (widget.width - this.icon.field_z) / 2;
            }
            if (renderer.horizontalAlignment == 2) {
              var7_int = var7_int + (widget.width - this.icon.field_z);
            }
            if (1 == renderer.verticalAlignment) {
              var8 = var8 + (-this.icon.field_w + widget.height) / 2;
            }
            if (2 == renderer.verticalAlignment) {
              var8 = var8 + (-this.icon.field_w + widget.height);
            }
            this.icon.draw(var7_int, var8);
          }
          var7 = renderer.widgetText(true, widget);
          if (var7 != null &&
            renderer.font != null) {
            if (this.textColor < 0) {
              return;
            }
            stackIn_20_0 = renderer.font;
            stackIn_20_1 = var7;
            if (this.offsetX == -2147483648) {
              stackIn_21_2 = 0;
            } else {
              stackIn_21_2 = this.offsetX;
            }
            stackIn_23_2 = stackIn_21_2 + (renderer.paddingLeft + (widget.x + parentX));
            stackIn_23_3 = renderer.paddingTop + (widget.y + parentY);
            if (this.offsetY == -2147483648) {
              stackIn_24_4 = 0;
            } else {
              stackIn_24_4 = this.offsetY;
            }
            stackIn_26_3 = stackIn_23_3 + stackIn_24_4;
            stackIn_26_4 = widget.width - (renderer.paddingLeft + renderer.paddingRight);
            stackIn_26_5 = widget.height - (renderer.paddingTop + renderer.paddingBottom);
            stackIn_26_6 = this.textColor;
            stackIn_26_7 = this.textShadow;
            if (this.alpha == -2147483648) {
              stackIn_27_8 = 256;
            } else {
              stackIn_27_8 = this.alpha;
            }
            ((LegacyBitmapFont) (Object) stackIn_20_0).drawParagraphAlpha(stackIn_20_1, stackIn_23_2, stackIn_26_3, stackIn_26_4, stackIn_26_5, stackIn_26_6, stackIn_26_7, stackIn_27_8, renderer.horizontalAlignment, renderer.verticalAlignment, renderer.lineSpacing);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_31_0 = var6;
          stackIn_31_1 = new StringBuilder().append("sm.B(").append(parentY).append(',');
          if (renderer == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          stackIn_34_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(parentX).append(',').append(guard).append(',');
          if (widget == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(')').toString());
        }
    }

    final void applyTo(int parentX, UiWidget widget, int guard, StatefulWidgetRenderer renderer, int parentY, WidgetStateStyle composite) {
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        WidgetStateStyle var8 = null;
        try {
          if (this.flushBeforeApply) {
            composite.draw(parentY, renderer, parentX, 76, widget);
            composite.reset(true);
          }
          if (-2147483648 != this.offsetY) {
            composite.offsetY = this.offsetY;
          }
          if (this.textColor >= -1) {
            composite.textColor = this.textColor;
          }
          if (null != this.icon) {
            composite.icon = this.icon;
          }
          if (-1 <= this.textShadow) {
            composite.textShadow = this.textShadow;
          }
          if (this.alpha != -2147483648) {
            composite.alpha = this.alpha;
          }
          if (null != this.backgroundSlices) {
            composite.backgroundSlices = this.backgroundSlices;
          }
          if (this.offsetX != -2147483648) {
            composite.offsetX = this.offsetX;
          }
          if (guard > -1) {
            var8 = (WidgetStateStyle) null;
            this.applyTo(32, (UiWidget) null, -99, (StatefulWidgetRenderer) null, 16, (WidgetStateStyle) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_25_0 = var7;
          stackIn_25_1 = new StringBuilder().append("sm.N(").append(parentX).append(',');
          if (widget == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(guard).append(',');
          if (renderer == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          stackIn_31_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(parentY).append(',');
          if (composite == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(')').toString());
        }
    }

    final static void a(byte param0, boolean param1, boolean param2) {
        int var3 = -2 % ((param0 - 62) / 63);
        String var4 = (String) null;
        ea.a(1, param2, (String) null, param1);
    }

    static {
    }
}
