/*
 * Decompiled by CFR-JS 0.4.0.
 */
class TextWidgetPainter implements WidgetPainter, WidgetTextLayout {
    int lineSpacing;
    int textColor;
    int selectionColor;
    static Sprite field_j;
    int verticalAlignment;
    int caretColor;
    int topInset;
    int bottomInset;
    int leftInset;
    int horizontalAlignment;
    BitmapFont font;
    int rightInset;
    private int shadowColor;
    static String field_p;
    static IntrusiveDeque field_d;
    private boolean wrapText;

    public final int textOriginX(byte guard, UiComponent component, int originX) {
        String stackIn_8_2 = null;
        try {
          if (guard == -113) {
            int stackIn_4_0 = this.textXForOffset(0, component, -18079, originX);
            return stackIn_4_0;
          }
          int stackIn_2_0 = -25;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_7_0 = var4;
          StringBuilder stackIn_7_1 = new StringBuilder().append("k.E(").append(guard).append(',');
          if (component == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(originX).append(')').toString());
        }
    }

    public final int characterIndexAtPosition(int originX, int originY, int pointerY, int pointerX, int guard, UiComponent component) {
        String stackIn_7_2 = null;
        try {
          if (guard <= 81) {
            this.shadowColor = -116;
          }
          this.ensureTextLayout(component, 90);
          int stackIn_3_0 = component.textLayout.characterIndexAt((byte) 39, pointerX - this.textOriginX((byte) -113, component, originX), pointerY - this.textOriginY(component, originY, -16956));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var7 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var7;
          StringBuilder stackIn_6_1 = new StringBuilder().append("k.A(").append(originX).append(',').append(originY).append(',').append(pointerY).append(',').append(pointerX).append(',').append(guard).append(',');
          if (component == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final int textOriginY(UiComponent component, int originY, int guard) {
        String stackIn_7_2 = null;
        try {
          if (guard != -16956) {
            UiComponent var5 = (UiComponent) null;
            this.preferredHeight(-8, (UiComponent) null);
          }
          int stackIn_3_0 = this.textYForOffset(component, 0, 0, originY);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var4;
          StringBuilder stackIn_6_1 = new StringBuilder().append("k.C(");
          if (component == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(originY).append(',').append(guard).append(')').toString());
        }
    }

    private final void drawText(UiComponent component, int originY, int originX, int guard) {
        try {
          this.drawStyledText(originY, this.textColor, this.shadowColor, originX, 0, 0, true, component);
          if (guard >= -15) {
            UiComponent var6 = (UiComponent) null;
            this.preferredWidth((byte) 102, (UiComponent) null);
          }
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "k.HA(" + (component != null ? "{...}" : "null") + ',' + originY + ',' + originX + ',' + guard + ')');
        }
    }

    private final int textYForOffset(UiComponent component, int guard, int textOffset, int originY) {
        String stackIn_7_2 = null;
        try {
          if (guard != 0) {
            UiComponent var6 = (UiComponent) null;
            this.characterIndexAtPosition(-51, -123, -119, 54, -115, (UiComponent) null);
          }
          int stackIn_3_0 = textOffset + (component.field_v + this.topInset + (originY + component.y));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var5;
          StringBuilder stackIn_6_1 = new StringBuilder().append("k.BA(");
          if (component == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(guard).append(',').append(textOffset).append(',').append(originY).append(')').toString());
        }
    }

    final static Sprite a(int param0, byte param1, int param2) {
        ObjectSpriteSet[] var5 = LoadingProgressDialog.objectSpriteSets(false);
        var5 = var5;
        if (var5 == null) {
          return null;
        }
        if (param1 == -39) {
          return var5[param2].a(false, param0);
        }
        TextWidgetPainter.isAsciiAlphanumeric(true, '￾');
        return var5[param2].a(false, param0);
    }

    public void drawWidget(int originX, int originY, int guard, UiComponent component, boolean enabled) {
        if (null == this.font) {
          return;
        }
        try {
          if (guard >= -14) {
            UiComponent var7 = (UiComponent) null;
            this.drawCaret((UiComponent) null, -75, 106, 104, false);
          }
          this.drawText(component, originY, originX, -100);
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "k.M(" + originX + ',' + originY + ',' + guard + ',' + (component != null ? "{...}" : "null") + ',' + enabled + ')');
        }
    }

    public final int contentWidth(UiComponent component, int guard) {
        String stackIn_7_2 = null;
        try {
          if (guard != -25033) {
            this.caretColor = 7;
          }
          int stackIn_3_0 = -this.rightInset - this.leftInset + component.width;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var3;
          StringBuilder stackIn_6_1 = new StringBuilder().append("k.J(");
          if (component == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(guard).append(')').toString());
        }
    }

    public final void drawSelection(int originX, int selectionStart, UiComponent component, int selectionEnd, int guard, int originY) {
        int stackIn_15_0 = 0;
        int stackIn_20_0 = 0;
        String stackIn_26_2 = null;
        int var8 = 0;
        int var9 = 0;
        int var16 = EscapeVector.obfuscationControl;
        try {
          if (guard != -613528456) {
            UiComponent var17 = (UiComponent) null;
            this.characterIndexAtPosition(-128, 94, 31, -40, 4, (UiComponent) null);
          }
          if (selectionEnd == selectionStart) {
            return;
          }
          if (!component.isFocused(0)) {
            return;
          }
          TextLayout var18 = this.ensureTextLayout(component, 90);
          TextLayout var19 = var18;
          if (selectionStart <= selectionEnd) {
            var8 = selectionStart;
            var9 = selectionEnd;
          } else {
            var9 = selectionStart;
            var8 = selectionEnd;
          }
          int var10 = var19.lineForCharacter(var8, 0);
          int var11 = var19.lineForCharacter(var9, 0);
          rd.a(component.width + (component.x + originX), originX + component.x, component.height + (component.y + originY), 19807, originY + component.y);
          for (int var12 = var10; var11 >= var12; var12++) {
            TextLayoutLine var13 = var18.lines[var12];
            if (var12 == var10) {
              stackIn_15_0 = var19.characterX((byte) 127, var8);
            } else {
              stackIn_15_0 = var13.insertionX[0];
            }
            int var14 = stackIn_15_0;
            if (var12 == var11) {
              stackIn_20_0 = var19.characterX((byte) -9, var9);
            } else if (var13 == null) {
              stackIn_20_0 = 0;
            } else {
              stackIn_20_0 = var13.insertionX[var13.insertionX.length - 1];
            }
            int var15 = stackIn_20_0;
            AchievementThresholdRule.field_g.fillRectangleAlpha(var13.bottom, 1, this.selectionColor >>> 24, var13.top + (originY + component.y) - (-this.topInset - component.field_v), var15 - var14, this.selectionColor, this.textXForOffset(var14, component, -18079, originX));
          }
          RasterRestoreSupport.popRasterState((byte) -59);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var7 = decompiledCaughtException;
          RuntimeException stackIn_25_0 = var7;
          StringBuilder stackIn_25_1 = new StringBuilder().append("k.I(").append(originX).append(',').append(selectionStart).append(',');
          if (component == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(selectionEnd).append(',').append(guard).append(',').append(originY).append(')').toString());
        }
    }

    private final void drawStyledText(int originY, int textColor, int shadowColor, int originX, int offsetY, int offsetX, boolean guard, UiComponent component) {
        String stackIn_29_2 = null;
        int var11 = 0;
        int var13 = EscapeVector.obfuscationControl;
        try {
          rd.a(originX + component.x + component.width, originX + component.x, originY - (-component.y - component.height), 19807, component.y + originY);
          int var9_int = this.contentWidth(component, -25033);
          int var10 = this.contentHeight(-14072, component);
          if (this.wrapText) {
            this.font.drawParagraph(this.displayText((byte) 39, component), this.textXForOffset(offsetX, component, -18079, originX), this.textYForOffset(component, 0, offsetY, originY), var9_int, var10, textColor, shadowColor, this.horizontalAlignment, this.verticalAlignment, this.lineSpacing);
          } else {
            int var12 = this.verticalAlignment;
            if (var12 == 0) {
              var11 = this.font.maxAscent;
            } else if (var12 == 2) {
              var11 = -this.font.maxDescent + var10;
            } else {
              if (var12 != 3 &&
                var12 == 1) {
              }
              var11 = this.font.maxAscent + (var10 - this.font.maxAscent - this.font.maxDescent >> 1);
            }
            int var12Lifetime1 = this.horizontalAlignment;
            if (0 != var12Lifetime1 &&
              var12Lifetime1 != 3) {
              if (var12Lifetime1 == 1) {
                this.font.drawCentered(this.displayText((byte) 39, component), this.textXForOffset(offsetX, component, -18079, originX) + (var9_int >> 1), this.textYForOffset(component, 0, offsetY, originY) + var11, textColor, shadowColor);
              } else if (2 == var12Lifetime1) {
                this.font.drawRight(this.displayText((byte) 39, component), this.textXForOffset(offsetX, component, -18079, originX) + var9_int, var11 + this.textYForOffset(component, 0, offsetY, originY), textColor, shadowColor);
              }
              boolean decompiledFrameRemainder0 = false;
            }
            else {
              this.font.drawLeft(this.displayText((byte) 39, component), this.textXForOffset(offsetX, component, -18079, originX), var11 + this.textYForOffset(component, 0, offsetY, originY), textColor, shadowColor);
            }
          }
          if (!guard) {
            TextWidgetPainter.releaseStatics(85);
          }
          RasterRestoreSupport.popRasterState((byte) 125);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var9 = decompiledCaughtException;
          RuntimeException stackIn_28_0 = var9;
          StringBuilder stackIn_28_1 = new StringBuilder().append("k.V(").append(originY).append(',').append(textColor).append(',').append(shadowColor).append(',').append(originX).append(',').append(offsetY).append(',').append(offsetX).append(',').append(guard).append(',');
          if (component == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }

    private final int textXForOffset(int textOffset, UiComponent component, int guard, int originX) {
        String stackIn_7_2 = null;
        try {
          if (guard != -18079) {
            UiComponent var6 = (UiComponent) null;
            int discarded$1 = this.textXForOffset(39, (UiComponent) null, 121, 83);
          }
          int stackIn_3_0 = textOffset + (this.leftInset + component.x) + (originX + component.field_n);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var5;
          StringBuilder stackIn_6_1 = new StringBuilder().append("k.EA(").append(textOffset).append(',');
          if (component == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(guard).append(',').append(originX).append(')').toString());
        }
    }

    private final int contentHeight(int guard, UiComponent component) {
        String stackIn_7_2 = null;
        try {
          if (guard != -14072) {
            this.selectionColor = 0;
          }
          int stackIn_3_0 = -this.bottomInset + (component.height - this.topInset);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var3;
          StringBuilder stackIn_6_1 = new StringBuilder().append("k.W(").append(guard).append(',');
          if (component == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final void copyStyleTo(TextWidgetPainter destination, int guard) {
        try {
          destination.topInset = this.topInset;
          destination.caretColor = this.caretColor;
          destination.horizontalAlignment = this.horizontalAlignment;
          destination.shadowColor = this.shadowColor;
          destination.bottomInset = this.bottomInset;
          destination.rightInset = this.rightInset;
          if (guard <= 56) {
            this.shadowColor = 60;
          }
          destination.leftInset = this.leftInset;
          destination.font = this.font;
          destination.lineSpacing = this.lineSpacing;
          destination.selectionColor = this.selectionColor;
          destination.verticalAlignment = this.verticalAlignment;
          destination.wrapText = this.wrapText;
          destination.textColor = this.textColor;
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "k.FA(" + (destination != null ? "{...}" : "null") + ',' + guard + ')');
        }
    }

    public final int lineHeight(int guard) {
        if (guard >= 96) {
          return this.font.maxAscent + this.font.maxDescent;
        }
        field_p = (String) null;
        return this.font.maxAscent + this.font.maxDescent;
    }

    public static void releaseStatics(int guard) {
        field_d = null;
        if (guard != -24239) {
          return;
        }
        field_p = null;
        field_j = null;
    }

    final static boolean isAsciiAlphanumeric(boolean guard, char character) {
        if (!guard) {
          field_j = (Sprite) null;
          if (48 > character) {
            if (65 <= character &&
              character <= 90) {
              return true;
            }
            if (character < 97) {
              return false;
            }
            if (122 < character) {
              return false;
            }
            return true;
          }
          if (character <= 57) {
            return true;
          }
          if (65 > character) {
            if (character < 97) {
              return false;
            }
            if (122 >= character) {
              return true;
            }
            return false;
          }
          if (character <= 90) {
            return true;
          }
          boolean stackIn_28_0 = (character >= 97) && (122 >= character);
          return stackIn_28_0;
        }
        if (48 > character) {
          if (65 > character) {
            if (character < 97) {
              return false;
            }
            if (122 < character) {
              return false;
            }
            return true;
          }
          if (character <= 90) {
            return true;
          }
          boolean stackIn_64_0 = (character >= 97) && (122 >= character);
          return stackIn_64_0;
        }
        if (character <= 57) {
          return true;
        }
        if (65 > character) {
          if (character < 97) {
            return false;
          }
          if (122 < character) {
            return false;
          }
          return true;
        }
        if (character <= 90) {
          return true;
        }
        boolean stackIn_50_0 = (character >= 97) && (122 >= character);
        return stackIn_50_0;
    }

    String displayText(byte guard, UiComponent component) {
        String stackIn_7_2 = null;
        try {
          if (guard != 39) {
            field_d = (IntrusiveDeque) null;
          }
          String stackIn_3_0 = component.text;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var3;
          StringBuilder stackIn_6_1 = new StringBuilder().append("k.N(").append(guard).append(',');
          if (component == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final void drawCaret(UiComponent component, int characterIndex, int originX, int originY, boolean guard) {
        try {
          if (!guard) {
            this.textColor = 30;
          }
          if (component.isFocused(0)) {
            TextLayout var13 = this.ensureTextLayout(component, 90);
            TextLayout var14 = var13;
            int var7 = var14.lineForCharacter(characterIndex, 0);
            TextLayoutLine var8 = var13.lines[var7];
            int var9 = var14.characterX((byte) 122, characterIndex);
            int var10 = this.textXForOffset(var9, component, -18079, originX);
            int var11 = this.textOriginY(component, originY, -16956) + Math.max(0, var8.top);
            int var12 = this.textOriginY(component, originY, -16956) + Math.min(this.contentHeight(-14072, component), Math.min(var8.bottom, var7 + 1 < var14.lines.length ? var13.lines[1 + var7].top : var8.bottom));
            rd.a(component.width + originX + component.x, component.x + originX, originY + (component.y + component.height), 19807, component.y + originY);
            AchievementThresholdRule.field_g.drawLine(var10, var12, -29666, var10, var11, this.caretColor);
            RasterRestoreSupport.popRasterState((byte) 122);
          }
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "k.H(" + (component != null ? "{...}" : "null") + ',' + characterIndex + ',' + originX + ',' + originY + ',' + guard + ')');
        }
    }

    TextWidgetPainter(BitmapFont param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this(param0, param1, param1, param2, param2, param3, param4, param5, param6, param7, -1, 2147483647, false);
    }

    protected TextWidgetPainter() {
    }

    public final TextLayout ensureTextLayout(UiComponent component, int guard) {
        String stackIn_13_2 = null;
        try {
          if (null == component.textLayout) {
            component.textLayout = (TextLayout) ((Object) new CachedTextLayout());
          }
          if (this.wrapText) {
            ((CachedTextLayout) (component.textLayout)).layoutWrapped(this.contentHeight(guard - 14162, component), this.displayText((byte) 39, component), this.font, this.contentWidth(component, guard - 25123), this.horizontalAlignment, this.verticalAlignment, this.lineSpacing, (byte) -13);
          } else {
            this.layoutSingleLine(component, -86);
          }
          if (guard != 90) {
            UiComponent var4 = (UiComponent) null;
            this.textOriginX((byte) 117, (UiComponent) null, -58);
          }
          TextLayout stackIn_9_0 = component.textLayout;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_12_0 = var3;
          StringBuilder stackIn_12_1 = new StringBuilder().append("k.B(");
          if (component == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(guard).append(')').toString());
        }
    }

    private final void layoutSingleLine(UiComponent component, int guard) {
        String stackIn_33_2 = null;
        int var5 = 0;
        int var7 = EscapeVector.obfuscationControl;
        try {
          if (null == component.textLayout) {
            component.textLayout = (TextLayout) ((Object) new CachedTextLayout());
          }
          int var3_int = this.contentWidth(component, -25033);
          if (guard >= -6) {
            this.verticalAlignment = 29;
          }
          int var4 = this.contentHeight(-14072, component);
          int var6 = this.verticalAlignment;
          if (var6 == 0) {
            var5 = this.font.maxAscent;
          } else if (2 != var6) {
            if (var6 != 3 &&
              var6 == 1) {
            }
            var5 = this.font.maxAscent + (-this.font.maxAscent + var4 - this.font.maxDescent >> 1);
          } else {
            var5 = var4 - this.font.maxDescent;
          }
          int var6Lifetime1 = this.horizontalAlignment;
          if (var6Lifetime1 != 0 &&
            var6Lifetime1 != 3) {
            if (1 == var6Lifetime1) {
              if (!(component.textLayout instanceof CachedTextLayout)) {
                return;
              }
              ((CachedTextLayout) (component.textLayout)).layoutCentered(this.displayText((byte) 39, component), var3_int >> 1, this.font, var5, true);
              return;
            }
            if (2 != var6Lifetime1) {
              return;
            }
            if (!(component.textLayout instanceof CachedTextLayout)) {
              return;
            }
            ((CachedTextLayout) (component.textLayout)).layoutRightAligned(this.font, this.displayText((byte) 39, component), var3_int, var5, (byte) 69);
            return;
          }
          if (component.textLayout instanceof CachedTextLayout) {
            ((CachedTextLayout) (component.textLayout)).layoutLeftAligned(this.displayText((byte) 39, component), 0, 0, var5, this.font);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_32_0 = var3;
          StringBuilder stackIn_32_1 = new StringBuilder().append("k.AA(");
          if (component == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(guard).append(')').toString());
        }
    }

    TextWidgetPainter(BitmapFont param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, boolean param12) {
        try {
          this.textColor = param5;
          this.lineSpacing = param9;
          this.caretColor = param10;
          this.rightInset = param2;
          this.font = param0;
          this.verticalAlignment = param8;
          this.selectionColor = param11;
          this.bottomInset = param4;
          this.shadowColor = param6;
          this.topInset = param3;
          this.horizontalAlignment = param7;
          this.leftInset = param1;
          this.wrapText = param12 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "k.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ')');
        }
    }

    public final int preferredWidth(byte guard, UiComponent component) {
        String stackIn_8_2 = null;
        try {
          if (guard != -46) {
            int stackIn_2_0 = -89;
            return stackIn_2_0;
          }
          this.ensureTextLayout(component, 90);
          int stackIn_4_0 = component.textLayout.maximumLineWidth((byte) -112) + this.leftInset + this.rightInset;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_7_0 = var3;
          StringBuilder stackIn_7_1 = new StringBuilder().append("k.D(").append(guard).append(',');
          if (component == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    public final int preferredHeight(int guard, UiComponent component) {
        String stackIn_7_2 = null;
        try {
          this.ensureTextLayout(component, 90);
          if (guard > -95) {
            UiComponent var4 = (UiComponent) null;
            this.drawText((UiComponent) null, 11, -109, 0);
          }
          int stackIn_3_0 = component.textLayout.height(0) + (this.topInset + this.bottomInset);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var3;
          StringBuilder stackIn_6_1 = new StringBuilder().append("k.F(").append(guard).append(',');
          if (component == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    static {
        field_p = "Shield: ";
        field_d = new IntrusiveDeque();
    }
}
