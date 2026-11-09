/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LinkWidgetRenderer implements WidgetRenderer {
    static String friendsCanBeAddedText;
    private int verticalAlignment;
    private int horizontalAlignment;
    private LegacyBitmapFont font;

    public static void releaseStatics(int guard) {
        if (guard < 38) {
          LinkWidgetRenderer.a(31);
          friendsCanBeAddedText = null;
          return;
        }
        friendsCanBeAddedText = null;
    }

    public LinkWidgetRenderer() {
        this.verticalAlignment = 1;
        this.horizontalAlignment = 1;
        this.font = TextCaretLayout.field_b;
    }

    public final void renderWidget(UiWidget widget, int parentY, int guard, boolean isEnabled, int parentX) {
        int stackIn_6_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (!widget.hovered &&
            !widget.hasFocus(-1)) {
            stackIn_6_0 = 2188450;
          } else {
            stackIn_6_0 = 3249872;
          }
          var6_int = stackIn_6_0;
          this.font.drawParagraph("<u=" + Integer.toString(var6_int, 16) + ">" + widget.text + "</u>", parentX + widget.x, widget.y + parentY, widget.width, widget.height, var6_int, -1, this.horizontalAlignment, this.verticalAlignment, this.font.ascent + this.font.descent);
          if (widget.hasFocus(-1)) {
            var7 = this.font.stringWidth(widget.text);
            var8 = this.font.ascent + this.font.descent;
            var9 = parentX + widget.x;
            if (2 == this.horizontalAlignment) {
              var9 = var9 + (-var7 + widget.width);
            } else {
              if (1 == this.horizontalAlignment) {
                var9 = var9 + (widget.width - var7 >> 1);
              }
            }
            var10 = widget.y + parentY;
            if (this.verticalAlignment == 2) {
              var10 = var10 + (widget.height - var8);
            } else {
              if (this.verticalAlignment == 1) {
                var10 = var10 + (widget.height - var8 >> 1);
              }
            }
            AudioServiceThread.drawDottedRectangle(var10 + 2, 4 + var7, guard ^ -5596714, var9 - 2, var8);
          }
          if (guard == 5592405) {
            return;
          }
          this.verticalAlignment = 59;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_22_0 = var6;
          stackIn_22_1 = new StringBuilder().append("bv.A(");
          if (widget == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(parentY).append(',').append(guard).append(',').append(isEnabled).append(',').append(parentX).append(')').toString());
        }
    }

    LinkWidgetRenderer(LegacyBitmapFont textFont, int alignX, int alignY) {
        try {
          this.verticalAlignment = alignY;
          this.font = textFont;
          this.horizontalAlignment = alignX;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "bv.<init>(" + (textFont != null ? "{...}" : "null") + ',' + alignX + ',' + alignY + ')');
        }
    }

    final static void a(int param0) {
        String var2 = (String) null;
        AccountNameSupport.showLoginForm((byte) 99, FadingWidget.field_C, (String) null);
        if (param0 != -363927231) {
          LinkWidgetRenderer.a(-108);
        }
    }

    static {
        friendsCanBeAddedText = "Friends can be added in multiplayer<nbsp>games";
    }
}
