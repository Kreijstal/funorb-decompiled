/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LinkWidgetRenderer implements WidgetRenderer {
    private int horizontalAlignment;
    private TextFont font;
    private int verticalAlignment;
    static int matchmakingOptionByteOne;
    static LoginMethodPreference field_c;
    static String field_a;

    public final void paintWidget(boolean obfuscationGuard, int callbackGuard, int parentX, Widget widget, int parentY) {
        int stackIn_5_0 = 0;
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
        var11 = BrickABrac.field_J ? 1 : 0;
        try {
          if (!widget.mouseOver &&
            !widget.isFocused(-67)) {
            stackIn_5_0 = 2188450;
          } else {
            stackIn_5_0 = 3249872;
          }
          var6_int = stackIn_5_0;
          this.font.a("<u=" + Integer.toString(var6_int, 16) + ">" + widget.text + "</u>", widget.x + parentX, widget.y + parentY, widget.width, widget.height, var6_int, -1, this.horizontalAlignment, this.verticalAlignment, this.font.descent + this.font.ascent);
          if (callbackGuard != -20618) {
            field_a = (String) null;
          }
          if (!widget.isFocused(-54)) {
            return;
          }
          var7 = this.font.measureText(widget.text);
          var8 = this.font.descent + this.font.ascent;
          var9 = widget.x + parentX;
          if (this.horizontalAlignment == 2) {
            var9 = var9 + (-var7 + widget.width);
          } else {
            if (this.horizontalAlignment == 1) {
              var9 = var9 + (-var7 + widget.width >> 1);
            }
          }
          var10 = widget.y + parentY;
          if (this.verticalAlignment == 2) {
            var10 = var10 + (-var8 + widget.height);
          } else {
            if (1 == this.verticalAlignment) {
              var10 = var10 + (-var8 + widget.height >> 1);
            }
          }
          ScrollPaneWithFooter.a(var10 + 2, var9 - 2, callbackGuard ^ -20727, var8, var7 + 4);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_22_0 = var6;
          stackIn_22_1 = new StringBuilder().append("bb.AA(").append(obfuscationGuard).append(',').append(callbackGuard).append(',').append(parentX).append(',');
          if (widget == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(parentY).append(')').toString());
        }
    }

    public LinkWidgetRenderer() {
        this.horizontalAlignment = 1;
        this.font = ArchiveNetworkClient.field_u;
        this.verticalAlignment = 1;
    }

    public static void a(boolean param0) {
        field_c = null;
        if (param0) {
          field_c = (LoginMethodPreference) null;
          field_a = null;
          return;
        }
        field_a = null;
    }

    LinkWidgetRenderer(TextFont font, int horizontalAlignment, int verticalAlignment) {
        try {
          this.horizontalAlignment = horizontalAlignment;
          this.font = font;
          this.verticalAlignment = verticalAlignment;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "bb.<init>(" + (font != null ? "{...}" : "null") + ',' + horizontalAlignment + ',' + verticalAlignment + ')');
        }
    }

    static {
        field_c = new LoginMethodPreference("");
        field_a = "Loading instruments";
    }
}
