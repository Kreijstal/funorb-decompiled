/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LinkButtonPainter implements WidgetPainter {
    static ClientUiComponent field_g;
    private BitmapFont font;
    private int horizontalAlignment;
    static String field_h;
    static PcmSample[][] field_d;
    private int verticalAlignment;
    static BattleGraphicsAssets field_f;
    static String field_a;

    public static void a(int param0) {
        field_h = null;
        field_a = null;
        if (param0 < -9) {
          field_f = null;
          field_d = (PcmSample[][]) null;
          field_g = null;
          return;
        }
        field_g = (ClientUiComponent) null;
        field_f = null;
        field_d = (PcmSample[][]) null;
        field_g = null;
    }

    public final void paintWidget(Widget widget, int originX, int obfuscationGuard, boolean renderFlag, int originY) {
        int stackIn_7_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (obfuscationGuard > -79) {
            return;
          }
          if (!widget.hovered &&
            !widget.isFocused(false)) {
            stackIn_7_0 = 2188450;
          } else {
            stackIn_7_0 = 3249872;
          }
          var6_int = stackIn_7_0;
          this.font.drawParagraph("<u=" + Integer.toString(var6_int, 16) + ">" + widget.text + "</u>", widget.x + originX, widget.y + originY, widget.width, widget.height, var6_int, -1, this.horizontalAlignment, this.verticalAlignment, this.font.maxAscent + this.font.maxDescent);
          if (widget.isFocused(false)) {
            var7 = this.font.textWidth(widget.text);
            var8 = this.font.maxAscent + this.font.maxDescent;
            var9 = originX + widget.x;
            if (this.horizontalAlignment == 2) {
              var9 = var9 + (-var7 + widget.width);
            } else {
              if (this.horizontalAlignment == 1) {
                var9 = var9 + (widget.width - var7 >> 1);
              }
            }
            var10 = originY + widget.y;
            if (this.verticalAlignment == 2) {
              var10 = var10 + (widget.height - var8);
            } else {
              if (this.verticalAlignment == 1) {
                var10 = var10 + (widget.height - var8 >> 1);
              }
            }
            AccountNameSelectionForm.c(4 + var7, -2 + var9, -70, var8, 2 + var10);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_21_0 = var6;
          stackIn_21_1 = new StringBuilder().append("td.C(");
          if (widget == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(originX).append(',').append(obfuscationGuard).append(',').append(renderFlag).append(',').append(originY).append(')').toString());
        }
    }

    final static int a(int param0, byte param1) {
        int var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        int var2 = param0;
        if (var2 == 59) {
          return 2;
        }
        if (var2 == 53) {
          return 3;
        }
        if (var2 == 43) {
          return 4;
        }
        if (var2 == 63) {
          return 0;
        }
        if (var2 == 58) {
          return 1;
        }
        if (param1 <= -40) {
          return -1;
        }
        return -5;
    }

    final static void a(boolean param0, boolean param1, int param2) {
        String var4 = (String) null;
        rn.a(3, (String) null, param0, param1);
        if (param2 <= 4) {
          LinkButtonPainter.a(46, (byte) -104);
        }
    }

    public LinkButtonPainter() {
        this.font = ArmiesOfGielinor.field_J;
        this.horizontalAlignment = 1;
        this.verticalAlignment = 1;
    }

    LinkButtonPainter(BitmapFont font, int horizontalAlignment, int verticalAlignment) {
        try {
          this.font = font;
          this.verticalAlignment = verticalAlignment;
          this.horizontalAlignment = horizontalAlignment;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "td.<init>(" + (font != null ? "{...}" : "null") + ',' + horizontalAlignment + ',' + verticalAlignment + ')');
        }
    }

    static {
        field_h = "This unit has ingested a cloning catalyst and will leave behind a perfect replica when it next moves.";
        field_a = "<%0>-<%1>";
    }
}
