/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LabeledToggleRenderer implements WidgetRenderer {
    private int boxWidth;
    static String field_g;
    private int boxY;
    private int shadowPaint;
    private int boxX;
    private int verticalAlignment;
    private int labelGap;
    static String field_a;
    private int backgroundColor;
    private int boxHeight;
    private int horizontalAlignment;
    private int labelOffsetY;
    private TextFont font;
    private int textPaint;

    public final void paintWidget(boolean obfuscationGuard, int callbackGuard, int parentX, Widget widget, int parentY) {
        Widget stackIn_3_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        ToggleButtonWidget var11 = null;
        try {
          if (widget instanceof ToggleButtonWidget) {
            stackIn_3_0 = (Widget) (widget);
          } else {
            stackIn_3_0 = null;
          }
          var11 = (ToggleButtonWidget) (stackIn_3_0);
          if (var11 != null) {
            obfuscationGuard = obfuscationGuard & var11.enabled;
          }
          var7 = 5592405;
          if (obfuscationGuard) {
            var7 = 16777215;
          }
          Rasterizer2D.fillRectangle(widget.x + parentX, parentY + widget.y, widget.width, widget.height, this.backgroundColor);
          var8 = this.boxX + parentX + widget.x;
          var9 = this.boxY + parentY + widget.y;
          Rasterizer2D.a(var8, var9, this.boxWidth, this.boxHeight, 5592405);
          if (callbackGuard != -20618) {
            this.boxY = 116;
          }
          Rasterizer2D.fillRectangle(var8, var9, this.boxWidth, this.boxHeight, var7);
          if (var11.active) {
            Rasterizer2D.drawLine(var8, var9, this.boxWidth + var8, var9 + this.boxHeight, 1);
            Rasterizer2D.drawLine(var8 + this.boxWidth, var9, var8, var9 + this.boxHeight, 1);
          }
          if (null == this.font) {
            return;
          }
          var10 = this.boxWidth + this.boxX + this.labelGap;
          this.font.drawParagraph(widget.text, parentX + (widget.x + var10), this.labelOffsetY + (widget.y + parentY), widget.width - (this.labelGap + var10), widget.height - (this.labelGap << 1), this.textPaint, this.shadowPaint, this.horizontalAlignment, this.verticalAlignment, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_18_0 = var6;
          stackIn_18_1 = new StringBuilder().append("ei.AA(").append(obfuscationGuard).append(',').append(callbackGuard).append(',').append(parentX).append(',');
          if (widget == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(parentY).append(')').toString());
        }
    }

    final static void b(int param0) {
        int var1;
        int var2;
        var2 = BrickABrac.field_J ? 1 : 0;
        if (param0 != 0) {
          return;
        }
        AppletGameShell.field_b = null;
        CanvasInputCleanup.field_g = false;
        if (NanoGameClock.field_l) {
          StrongCacheEntry.field_I.showPendingMessage((byte) -104);
        } else {
          var1 = OptionsScreen.field_x;
          if (var1 > 0) {
            if (var1 != 1) {
              AppletGameShell.field_b = GamePresentationHelpers.formatIndexedText(IntegerBitLengthHelpers.field_c, new String[]{Integer.toString(var1)}, (byte) 103);
            } else {
              AppletGameShell.field_b = WidgetGroup.field_C;
            }
            AppletGameShell.field_b = IntrusiveNode.a(new CharSequence[]{(CharSequence) ((Object) AppletGameShell.field_b), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) ConditionalTextValue.field_e)}, true);
          }
          StrongCacheEntry.field_I.closeDialog(param0 + 17);
          NinjaBackground.e((byte) -117);
        }
    }

    public static void a(int param0) {
        field_g = null;
        if (param0 != 1) {
          return;
        }
        field_a = null;
    }

    LabeledToggleRenderer(TextFont font, int labelGap, int labelOffsetY, int textPaint, int shadowPaint, int boxX, int boxY, int boxHeight, int boxWidth, int backgroundColor) {
        this.horizontalAlignment = 1;
        this.verticalAlignment = 1;
        try {
          this.font = font;
          this.boxWidth = boxWidth;
          this.labelGap = labelGap;
          this.boxHeight = boxHeight;
          this.boxX = boxX;
          this.boxY = boxY;
          this.backgroundColor = backgroundColor;
          this.textPaint = textPaint;
          this.shadowPaint = shadowPaint;
          this.labelOffsetY = labelOffsetY;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "ei.<init>(" + (font != null ? "{...}" : "null") + ',' + labelGap + ',' + labelOffsetY + ',' + textPaint + ',' + shadowPaint + ',' + boxX + ',' + boxY + ',' + boxHeight + ',' + boxWidth + ',' + backgroundColor + ')');
        }
    }

    static {
        field_g = "(1 player wants to join)";
        field_a = "Some players haven't unlocked the currently selected game options.<br>Please see the player list on the left for details.";
    }
}
