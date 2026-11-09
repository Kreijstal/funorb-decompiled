/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CheckboxRenderer implements WidgetRenderer {
    private int textTop;
    private int textShadow;
    private int horizontalAlignment;
    private int verticalAlignment;
    private LegacyBitmapFont font;
    private int boxHeight;
    private int textPadding;
    private int boxY;
    static int[] field_k;
    private int textColor;
    private int boxWidth;
    private int backgroundColor;
    private int boxX;

    public final void renderWidget(UiWidget widget, int parentY, int guard, boolean isEnabled, int parentX) {
        UiWidget stackIn_3_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        CheckboxWidget var11 = null;
        try {
          if (!(widget instanceof CheckboxWidget)) {
            stackIn_3_0 = null;
          } else {
            stackIn_3_0 = (UiWidget) (widget);
          }
          var11 = (CheckboxWidget) (stackIn_3_0);
          if (var11 != null) {
            isEnabled = isEnabled & var11.enabled;
          }
          var7 = 5592405;
          if (isEnabled) {
            var7 = 16777215;
          }
          SoftwareRasterizer.fillRectangle(widget.x + parentX, widget.y + parentY, widget.width, widget.height, this.backgroundColor);
          var8 = this.boxX + parentX + widget.x;
          var9 = this.boxY + widget.y + parentY;
          SoftwareRasterizer.drawDropShadow(var8, var9, this.boxWidth, this.boxHeight, guard);
          SoftwareRasterizer.fillRectangle(var8, var9, this.boxWidth, this.boxHeight, var7);
          if (var11.selected) {
            SoftwareRasterizer.drawLine(var8, var9, var8 + this.boxWidth, var9 + this.boxHeight, 1);
            SoftwareRasterizer.drawLine(this.boxWidth + var8, var9, var8, this.boxHeight + var9, 1);
          }
          if (null != this.font) {
            var10 = this.boxWidth - (-this.boxX - this.textPadding);
            this.font.a(widget.text, parentX - (-widget.x - var10), this.textTop + widget.y + parentY, -var10 - this.textPadding + widget.width, -(this.textPadding << 1) + widget.height, this.textColor, this.textShadow, this.horizontalAlignment, this.verticalAlignment, 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_15_0 = var6;
          stackIn_15_1 = new StringBuilder().append("vg.A(");
          if (widget == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(parentY).append(',').append(guard).append(',').append(isEnabled).append(',').append(parentX).append(')').toString());
        }
    }

    public static void releaseStatics(boolean param0) {
        field_k = null;
        if (param0) {
          CheckboxRenderer.releaseStatics(false);
        }
    }

    CheckboxRenderer(LegacyBitmapFont labelFont, int padding, int labelTop, int labelColor, int shadow, int left, int top, int height, int width, int background) {
        this.verticalAlignment = 1;
        this.horizontalAlignment = 1;
        try {
          this.boxX = left;
          this.textTop = labelTop;
          this.boxY = top;
          this.font = labelFont;
          this.backgroundColor = background;
          this.boxWidth = width;
          this.textShadow = shadow;
          this.textPadding = padding;
          this.textColor = labelColor;
          this.boxHeight = height;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "vg.<init>(" + (labelFont != null ? "{...}" : "null") + ',' + padding + ',' + labelTop + ',' + labelColor + ',' + shadow + ',' + left + ',' + top + ',' + height + ',' + width + ',' + background + ')');
        }
    }

    static {
    }
}
