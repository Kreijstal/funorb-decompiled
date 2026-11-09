/*
 * Decompiled by CFR-JS 0.4.0.
 */
class TextWidgetRenderer implements WidgetRenderer, TextWidgetLayout {
    private int shadowColor;
    int textColor;
    int caretColor;
    int verticalAlignment;
    private boolean wrapText;
    int paddingTop;
    int lineSpacing;
    int paddingLeft;
    LegacyBitmapFont font;
    int paddingBottom;
    int horizontalAlignment;
    int paddingRight;
    int selectionColor;

    private final int textYForOffset(int parentY, byte guard, UiWidget widget, int layoutY) {
        RuntimeException var5 = null;
        TextWidgetRenderer var6 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (guard > -120) {
            var6 = (TextWidgetRenderer) null;
            this.copyStyleTo((TextWidgetRenderer) null, 108);
          }
          stackIn_3_0 = layoutY + (widget.y + parentY) + this.paddingTop + widget.textOffsetY;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("gm.EA(").append(parentY).append(',').append(guard).append(',');
          if (widget == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(layoutY).append(')').toString());
        }
    }

    public final int measuredTextHeight(UiWidget widget, byte guard) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.layoutText(-3, widget);
          if (guard > 65) {
            stackIn_4_0 = widget.textLayout.height(true) + this.paddingTop + this.paddingBottom;
            return stackIn_4_0;
          }
          stackIn_2_0 = 56;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("gm.P(");
          if (widget == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(guard).append(')').toString());
        }
    }

    public final int lineHeight(int guard) {
        if (guard != 14763) {
          this.paddingLeft = 25;
        }
        return this.font.descent + this.font.ascent;
    }

    public final TextLayout layoutText(int guard, UiWidget widget) {
        RuntimeException var3 = null;
        UiWidget var4 = null;
        TextLayout stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null == widget.textLayout) {
            widget.textLayout = (TextLayout) ((Object) new CachedTextLayout());
          }
          if (!this.wrapText) {
            this.layoutSingleLine(-12731, widget);
          } else {
            ((CachedTextLayout) (widget.textLayout)).layoutWrapped((byte) -75, this.horizontalAlignment, this.font, this.contentHeight(widget, true), this.widgetText(true, widget), this.verticalAlignment, this.lineSpacing, this.contentWidth(98, widget));
          }
          if (guard != -3) {
            var4 = (UiWidget) null;
            this.layoutSingleLine(-115, (UiWidget) null);
          }
          stackIn_8_0 = widget.textLayout;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("gm.M(").append(guard).append(',');
          if (widget == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    private final void layoutSingleLine(int guard, UiWidget widget) {
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var6Lifetime1;
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (null == widget.textLayout) {
            widget.textLayout = (TextLayout) ((Object) new CachedTextLayout());
          }
          var3_int = this.contentWidth(112, widget);
          var4 = this.contentHeight(widget, true);
          var6 = this.verticalAlignment;
          if (var6 == 0) {
            var5 = this.font.ascent;
          } else {
            if (var6 == 2) {
              var5 = var4 - this.font.descent;
            } else {
              if (3 != var6 &&
                var6 == 1) {
              }
              var5 = this.font.ascent + (-this.font.descent + (var4 - this.font.ascent) >> 1);
            }
          }
          if (guard != -12731) {
            this.selectionColor = 96;
          }
          var6Lifetime1 = this.horizontalAlignment;
          if (var6Lifetime1 != 0 &&
            3 != var6Lifetime1) {
            if (1 == var6Lifetime1) {
              if (!(widget.textLayout instanceof CachedTextLayout)) {
                return;
              }
              ((CachedTextLayout) (widget.textLayout)).layoutCenteredLine(var5, this.font, guard ^ -12762, this.widgetText(true, widget), var3_int >> 1);
              return;
            }
            if (var6Lifetime1 != 2) {
              return;
            }
            if (!(widget.textLayout instanceof CachedTextLayout)) {
              return;
            }
            ((CachedTextLayout) (widget.textLayout)).a(this.font, var5, var3_int, this.widgetText(true, widget), (byte) 79);
            return;
          }
          if (widget.textLayout instanceof CachedTextLayout) {
            ((CachedTextLayout) (widget.textLayout)).a(this.font, var5, this.widgetText(true, widget), 0, (byte) -36);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_31_0 = var3;
          stackIn_31_1 = new StringBuilder().append("gm.W(").append(guard).append(',');
          if (widget == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(')').toString());
        }
    }

    public final int measuredTextWidth(UiWidget widget, byte guard) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.layoutText(guard - 86, widget);
          if (guard == 83) {
            stackIn_4_0 = widget.textLayout.maximumRightEdge((byte) -18) + this.paddingLeft + this.paddingRight;
            return stackIn_4_0;
          }
          stackIn_2_0 = -86;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("gm.T(");
          if (widget == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(guard).append(')').toString());
        }
    }

    public final int textOriginY(int parentY, UiWidget widget, int guard) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (guard == 0) {
            stackIn_4_0 = this.textYForOffset(parentY, (byte) -124, widget, 0);
            return stackIn_4_0;
          }
          stackIn_2_0 = -83;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("gm.U(").append(parentY).append(',');
          if (widget == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(guard).append(')').toString());
        }
    }

    private final int contentHeight(UiWidget widget, boolean guard) {
        int discarded$1 = 0;
        RuntimeException var3 = null;
        UiWidget var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!guard) {
            var4 = (UiWidget) null;
            discarded$1 = this.contentHeight((UiWidget) null, false);
          }
          stackIn_3_0 = widget.height + (-this.paddingTop - this.paddingBottom);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("gm.CA(");
          if (widget == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(guard).append(')').toString());
        }
    }

    public final int contentWidth(int guard, UiWidget widget) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (guard <= 87) {
            this.horizontalAlignment = 57;
          }
          stackIn_3_0 = -this.paddingRight + (widget.width - this.paddingLeft);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("gm.O(").append(guard).append(',');
          if (widget == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public void renderWidget(UiWidget widget, int parentY, int guard, boolean isEnabled, int parentX) {
        int discarded$0 = 0;
        if (null == this.font) {
          return;
        }
        try {
          this.drawText(widget, false, parentX, parentY);
          if (guard != 5592405) {
            UiWidget var7 = (UiWidget) null;
            discarded$0 = this.textXForOffset(-115, (UiWidget) null, -70, -20);
          }
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "gm.A(" + (widget != null ? "{...}" : "null") + ',' + parentY + ',' + guard + ',' + isEnabled + ',' + parentX + ')');
        }
    }

    String widgetText(boolean guard, UiWidget widget) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!guard) {
            this.shadowColor = -106;
          }
          stackIn_3_0 = widget.text;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("gm.I(").append(guard).append(',');
          if (widget == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final void drawCaret(int guard, int parentX, int parentY, int caretIndex, UiWidget widget) {
        int var7 = 0;
        TextLayoutLine var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        UiWidget var13 = null;
        TextLayout var14 = null;
        TextLayout var15 = null;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        int stackIn_5_3;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (widget.hasFocus(guard ^ -2)) {
            var14 = this.layoutText(-3, widget);
            var15 = var14;
            var7 = var15.lineForCharacter(caretIndex, -17500);
            var8 = var14.lines[var7];
            var9 = var15.caretX((byte) 113, caretIndex);
            var10 = this.textXForOffset(-3, widget, var9, parentX);
            var11 = this.textOriginY(parentY, widget, 0) + Math.max(0, var8.top);
            stackIn_4_0 = this.textOriginY(parentY, widget, 0);
            stackIn_4_1 = this.contentHeight(widget, true);
            stackIn_4_2 = var8.bottom;
            if (var15.lines.length <= var7 + 1) {
              stackIn_5_3 = var8.bottom;
            } else {
              stackIn_5_3 = var14.lines[1 + var7].top;
            }
            var12 = stackIn_4_0 + Math.min(stackIn_4_1, Math.min(stackIn_4_2, stackIn_5_3));
            TextCaretLayout.pushClip(widget.height + (widget.y + parentY), parentY + widget.y, 1, widget.x + parentX, widget.x + parentX + widget.width);
            HardwareTurbulentWaterNoise.widgetTheme.a(this.caretColor, var10, false, var10, var12, var11);
            ClientException.popRasterState((byte) 116);
          }
          if (guard != 1) {
            var13 = (UiWidget) null;
            this.drawCaret(-62, -56, -29, -84, (UiWidget) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_11_0 = var6;
          stackIn_11_1 = new StringBuilder().append("gm.R(").append(guard).append(',').append(parentX).append(',').append(parentY).append(',').append(caretIndex).append(',');
          if (widget == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final void copyStyleTo(TextWidgetRenderer destination, int guard) {
        try {
          destination.paddingTop = this.paddingTop;
          destination.shadowColor = this.shadowColor;
          destination.paddingBottom = this.paddingBottom;
          destination.textColor = this.textColor;
          destination.font = this.font;
          destination.caretColor = this.caretColor;
          int var3_int = 72 % ((21 - guard) / 46);
          destination.wrapText = this.wrapText;
          destination.paddingRight = this.paddingRight;
          destination.lineSpacing = this.lineSpacing;
          destination.selectionColor = this.selectionColor;
          destination.verticalAlignment = this.verticalAlignment;
          destination.paddingLeft = this.paddingLeft;
          destination.horizontalAlignment = this.horizontalAlignment;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "gm.V(" + (destination != null ? "{...}" : "null") + ',' + guard + ')');
        }
    }

    TextWidgetRenderer(LegacyBitmapFont param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this(param0, param1, param1, param2, param2, param3, param4, param5, param6, param7, -1, 2147483647, false);
    }

    private final int textXForOffset(int guard, UiWidget widget, int layoutX, int parentX) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (guard == -3) {
            stackIn_4_0 = widget.textOffsetX + (this.paddingLeft + parentX) + widget.x + layoutX;
            return stackIn_4_0;
          }
          stackIn_2_0 = 46;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("gm.DA(").append(guard).append(',');
          if (widget == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(layoutX).append(',').append(parentX).append(')').toString());
        }
    }

    public final void drawSelection(int parentX, int anchor, int guard, int caretIndex, UiWidget widget, int parentY) {
        int var12 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        TextLayoutLine var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        TextLayout var17 = null;
        TextLayout var18 = null;
        var16 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (anchor == caretIndex) {
            return;
          }
          if (guard != 0) {
            return;
          }
          if (widget.hasFocus(-1)) {
            var17 = this.layoutText(guard ^ -3, widget);
            var18 = var17;
            if (caretIndex > anchor) {
              var8 = anchor;
              var9 = caretIndex;
            } else {
              var8 = caretIndex;
              var9 = anchor;
            }
            var10 = var18.lineForCharacter(var8, guard ^ -17500);
            var11 = var18.lineForCharacter(var9, -17500);
            TextCaretLayout.pushClip(widget.height + (widget.y + parentY), widget.y + parentY, 1, widget.x + parentX, widget.width + (parentX + widget.x));
            for (var12 = var10; var12 <= var11; var12++) {
              var13 = var17.lines[var12];
              if (var10 != var12) {
                stackIn_14_0 = var13.caretX[0];
              } else {
                stackIn_14_0 = var18.caretX((byte) 118, var8);
              }
              var14 = stackIn_14_0;
              if (var12 == var11) {
                stackIn_19_0 = var18.caretX((byte) 125, var9);
              } else {
                if (var13 != null) {
                  stackIn_19_0 = var13.caretX[-1 + var13.caretX.length];
                } else {
                  stackIn_19_0 = 0;
                }
              }
              var15 = stackIn_19_0;
              HardwareTurbulentWaterNoise.widgetTheme.a(this.selectionColor >>> 24, guard + 3, var13.bottom, this.selectionColor, this.textXForOffset(-3, widget, var14, parentX), var15 - var14, widget.textOffsetY + (this.paddingTop + widget.y + parentY) + var13.top);
            }
            ClientException.popRasterState((byte) 86);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_24_0 = var7;
          stackIn_24_1 = new StringBuilder().append("gm.N(").append(parentX).append(',').append(anchor).append(',').append(guard).append(',').append(caretIndex).append(',');
          if (widget == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(parentY).append(')').toString());
        }
    }

    public final int characterAtPoint(int parentX, UiWidget widget, int pointerX, int pointerY, int guard, int parentY) {
        RuntimeException var7 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (guard != -4059) {
            stackIn_2_0 = 115;
            return stackIn_2_0;
          }
          this.layoutText(guard ^ 4056, widget);
          stackIn_4_0 = widget.textLayout.characterAtPoint(pointerY - this.textOriginY(parentY, widget, 0), -this.textOriginX(parentX, widget, 16098) + pointerX, guard + 4166);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_7_0 = var7;
          stackIn_7_1 = new StringBuilder().append("gm.S(").append(parentX).append(',');
          if (widget == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(pointerX).append(',').append(pointerY).append(',').append(guard).append(',').append(parentY).append(')').toString());
        }
    }

    private final void drawText(UiWidget widget, boolean guard, int parentX, int parentY) {
        try {
          this.drawTextWithColors(widget, parentX, this.textColor, parentY, 0, this.shadowColor, (byte) 104, 0);
          if (guard) {
            UiWidget var6 = (UiWidget) null;
            this.widgetText(false, (UiWidget) null);
          }
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "gm.BA(" + (widget != null ? "{...}" : "null") + ',' + guard + ',' + parentX + ',' + parentY + ')');
        }
    }

    private final void drawTextWithColors(UiWidget widget, int parentX, int foreground, int parentY, int layoutY, int shadow, byte guard, int layoutX) {
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var12Lifetime1;
        var13 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (guard <= 73) {
            return;
          }
          boolean decompiledFrameRemainder0 = true;
          TextCaretLayout.pushClip(widget.height + (parentY + widget.y), widget.y + parentY, 1, widget.x + parentX, widget.width + widget.x + parentX);
          var9_int = this.contentWidth(95, widget);
          var10 = this.contentHeight(widget, true);
          if (!this.wrapText) {
            var12 = this.verticalAlignment;
            if (var12 != 0) {
              if (var12 != 2) {
                if (var12 != 3 &&
                  var12 == 1) {
                }
                var11 = (-this.font.ascent + var10 - this.font.descent >> 1) + this.font.ascent;
              } else {
                var11 = var10 - this.font.descent;
              }
            } else {
              var11 = this.font.ascent;
            }
            var12Lifetime1 = this.horizontalAlignment;
            if (var12Lifetime1 != 0 &&
              var12Lifetime1 != 3) {
              if (var12Lifetime1 == 1) {
                this.font.drawCentered(this.widgetText(true, widget), (var9_int >> 1) + this.textXForOffset(-3, widget, layoutX, parentX), var11 + this.textYForOffset(parentY, (byte) -121, widget, layoutY), foreground, shadow);
              } else {
                if ((var12Lifetime1 == 2)) {
                  this.font.drawRightAligned(this.widgetText(true, widget), this.textXForOffset(-3, widget, layoutX, parentX) + var9_int, var11 + this.textYForOffset(parentY, (byte) -123, widget, layoutY), foreground, shadow);
                }
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              this.font.drawText(this.widgetText(true, widget), this.textXForOffset(-3, widget, layoutX, parentX), var11 + this.textYForOffset(parentY, (byte) -124, widget, layoutY), foreground, shadow);
            }
          } else {
            this.font.drawParagraph(this.widgetText(true, widget), this.textXForOffset(-3, widget, layoutX, parentX), this.textYForOffset(parentY, (byte) -122, widget, layoutY), var9_int, var10, foreground, shadow, this.horizontalAlignment, this.verticalAlignment, this.lineSpacing);
          }
          ClientException.popRasterState((byte) 63);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_28_0 = var9;
          stackIn_28_1 = new StringBuilder().append("gm.AA(");
          if (widget == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(parentX).append(',').append(foreground).append(',').append(parentY).append(',').append(layoutY).append(',').append(shadow).append(',').append(guard).append(',').append(layoutX).append(')').toString());
        }
    }

    public final int textOriginX(int parentX, UiWidget widget, int guard) {
        RuntimeException var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (guard != 16098) {
            this.verticalAlignment = 32;
          }
          stackIn_3_0 = this.textXForOffset(-3, widget, 0, parentX);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("gm.L(").append(parentX).append(',');
          if (widget == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(guard).append(')').toString());
        }
    }

    protected TextWidgetRenderer() {
    }

    TextWidgetRenderer(LegacyBitmapFont param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, boolean param12) {
        try {
          this.textColor = param5;
          this.lineSpacing = param9;
          this.selectionColor = param11;
          this.caretColor = param10;
          this.verticalAlignment = param8;
          this.paddingBottom = param4;
          this.shadowColor = param6;
          this.font = param0;
          this.horizontalAlignment = param7;
          this.paddingTop = param3;
          this.paddingRight = param2;
          this.wrapText = param12 ? true : false;
          this.paddingLeft = param1;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "gm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ')');
        }
    }

    static {
    }
}
