/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fh implements WidgetRenderer {
    private int field_a;
    private int field_b;
    private BitmapFont field_d;
    static int field_c;
    static Sprite[] field_e;

    final static void b(int param0) {
        AgeValidator.field_i = false;
        va.field_d = false;
        MidiNote.a(-1, false);
        WidgetSkinState.field_g = DiskCacheWorker.field_l;
        kd.field_b = DiskCacheWorker.field_l;
        if (param0 != -6011) {
            field_c = 36;
        }
    }

    public static void a(int param0) {
        if (param0 != 1) {
            fh.a(51);
            field_e = null;
            return;
        }
        field_e = null;
    }

    final static boolean c(int param0) {
        if (param0 > -78) {
            return false;
        }
        return hl.field_G;
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
          this.field_d.drawParagraph("<u=" + Integer.toString(var6_int, 16) + ">" + widget.widgetText + "</u>", widget.widgetX + parentX, parentY + widget.widgetY, widget.widgetWidth, widget.widgetHeight, var6_int, -1, this.field_b, this.field_a, this.field_d.maxAscent + this.field_d.maxDescent);
          if (methodGuard > -5) {
            fh.a(53L, -116);
          }
          if (!widget.hasKeyboardFocus((byte) 54)) {
            return;
          }
          var7 = this.field_d.measureTextWidth(widget.widgetText);
          var8 = this.field_d.maxDescent + this.field_d.maxAscent;
          var9 = widget.widgetX + parentX;
          if (this.field_b == 2) {
            var9 = var9 + (-var7 + widget.widgetWidth);
          } else {
            if (this.field_b == 1) {
              var9 = var9 + (-var7 + widget.widgetWidth >> 1);
            }
          }
          var10 = parentY + widget.widgetY;
          if (this.field_a == 2) {
            var10 = var10 + (widget.widgetHeight - var8);
          } else {
            if (this.field_a == 1) {
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

    public fh() {
        this.field_a = 1;
        this.field_b = 1;
        this.field_d = DialogLayer.sharedUiFont;
    }

    fh(BitmapFont param0, int param1, int param2) {
        try {
            this.field_a = param2;
            this.field_b = param1;
            this.field_d = param0;
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "fh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_c = 0;
    }
}
