/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class UnderlinedButtonRenderer implements WidgetRenderer {
    private int verticalAlignment;
    private int horizontalAlignment;
    private BitmapFont labelFont;
    static int field_c;
    static Sprite[] field_e;

    final static void b(int param0) {
        AgeValidator.field_i = false;
        MeshPrioritySupport.field_d = false;
        MidiNote.a(-1, false);
        WidgetSkinState.usernameQueryFlowState = DiskCacheWorker.idleClientFlowToken;
        ClientFlowState.accountCreationFlowState = DiskCacheWorker.idleClientFlowToken;
        if (param0 != -6011) {
            field_c = 36;
        }
    }

    public static void a(int param0) {
        if (param0 != 1) {
            UnderlinedButtonRenderer.a(51);
            field_e = null;
            return;
        }
        field_e = null;
    }

    final static boolean c(int param0) {
        if (param0 > -78) {
            return false;
        }
        return ProgressBarWidget.field_G;
    }

    final static String a(long param0, int param1) {
        int var3 = 0;
        long var4 = 0L;
        StringBuilder var6 = null;
        long var7_long = 0L;
        int var9 = 0;
        int var10 = 0;
        StringBuilder discarded$0 = null;
        int var11 = Geoblox.clientControlFlowFlag;
        if (param0 <= 0L) {
            return null;
        }
        if (param0 >= 6582952005840035281L) {
            return null;
        }
        if (0L != param0 % 37L) {
            var3 = 0;
            var4 = param0;
            while (var4 != 0L) {
                var4 = var4 / 37L;
                var3++;
            }
            var6 = new StringBuilder(var3);
            while (param0 != 0L) {
                var7_long = param0;
                param0 = param0 / 37L;
                var9 = w.field_c[(int)(-(37L * param0) + var7_long)];
                if (95 == var9) {
                    var10 = -1 + var6.length();
                    var9 = 160;
                    var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                }
                discarded$0 = var6.append((char) var9);
            }
            var6.reverse();
            int var7 = 49 % ((27 - param1) / 36);
            var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
            return var6.toString();
        }
        return null;
    }

    public final void drawWidget(int parentX, int methodGuard, int parentY, boolean widgetEnabled, UiWidget widget) {
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
        var11 = Geoblox.clientControlFlowFlag;
        try {
          if ((!widget.pointerInside) &&
              (!widget.hasKeyboardFocus((byte) 54))) {
            stackIn_5_0 = 2188450;
          } else {
            stackIn_5_0 = 3249872;
          }
          var6_int = stackIn_5_0;
          this.labelFont.drawParagraph("<u=" + Integer.toString(var6_int, 16) + ">" + widget.widgetText + "</u>", widget.widgetX + parentX, parentY + widget.widgetY, widget.widgetWidth, widget.widgetHeight, var6_int, -1, this.horizontalAlignment, this.verticalAlignment, this.labelFont.maxAscent + this.labelFont.maxDescent);
          if (methodGuard > -5) {
            UnderlinedButtonRenderer.a(53L, -116);
          }
          if (!widget.hasKeyboardFocus((byte) 54)) {
            return;
          }
          var7 = this.labelFont.measureTextWidth(widget.widgetText);
          var8 = this.labelFont.maxDescent + this.labelFont.maxAscent;
          var9 = widget.widgetX + parentX;
          if (this.horizontalAlignment == 2) {
            var9 = var9 + (-var7 + widget.widgetWidth);
          } else {
            if (this.horizontalAlignment == 1) {
              var9 = var9 + (-var7 + widget.widgetWidth >> 1);
            }
          }
          var10 = parentY + widget.widgetY;
          if (this.verticalAlignment == 2) {
            var10 = var10 + (widget.widgetHeight - var8);
          } else {
            if (this.verticalAlignment == 1) {
              var10 = var10 + (widget.widgetHeight - var8 >> 1);
            }
          }
          ImageProducerRasterBuffer.a(var10 + 2, 4 + var7, 14164, var8, -2 + var9);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_22_0 = var6;
          stackIn_22_1 = new StringBuilder().append("fh.E(").append(parentX).append(',').append(methodGuard).append(',').append(parentY).append(',').append(widgetEnabled).append(',');
          if (widget == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    public UnderlinedButtonRenderer() {
        this.verticalAlignment = 1;
        this.horizontalAlignment = 1;
        this.labelFont = DialogLayer.sharedUiFont;
    }

    UnderlinedButtonRenderer(BitmapFont labelFont, int horizontalAlignment, int verticalAlignment) {
        try {
            this.verticalAlignment = verticalAlignment;
            this.horizontalAlignment = horizontalAlignment;
            this.labelFont = labelFont;
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "fh.<init>(" + (labelFont != null ? "{...}" : "null") + ',' + horizontalAlignment + ',' + verticalAlignment + ')');
        }
    }

    static {
        field_c = 0;
    }
}
