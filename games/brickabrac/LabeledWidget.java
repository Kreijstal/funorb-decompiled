/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LabeledWidget extends SingleChildWidget {
    private String labelText;
    private boolean labelOnRight;
    private TextFont labelFont;
    private int inset;
    private int labelColor;
    static EmailAvailabilityRequest emailAvailabilityRequest;
    static String field_G;
    private int labelWidth;
    static PaletteFont field_O;
    static ResourceArchive field_P;

    final void drawLayer(int parentY, int parentX, int layer, byte obfuscationGuard) {
        int var5 = this.x + parentX;
        int var6 = parentY + this.y;
        super.drawLayer(parentY, parentX, layer, obfuscationGuard);
        if (layer != 0) {
          return;
        }
        int var7 = this.labelOnRight ? this.width - (this.labelWidth + this.inset * 2) : 0;
        this.labelFont.a(this.labelText, this.inset + var5 + var7, this.inset + var6, this.labelWidth - this.inset, -(2 * this.inset) + this.height, this.labelColor, -1, !this.labelOnRight ? 2 : 0, 1, this.labelFont.ascent);
    }

    public static void c(boolean param0) {
        field_O = null;
        emailAvailabilityRequest = null;
        field_G = null;
        field_P = null;
        if (param0) {
          field_O = (PaletteFont) null;
        }
    }

    LabeledWidget(int x, int y, int width, int height, Widget child, boolean labelOnRight, int labelWidth, int inset, TextFont labelFont, int labelColor, String labelText) {
        super(x, y, width, height, (WidgetRenderer) null, (WidgetListener) null);
        boolean stackIn_4_1 = false;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var12_int = 0;
        RuntimeException var12 = null;
        int var13 = 0;
        int var14 = 0;
        try {
          this.child = child;
          this.inset = inset;
          stackIn_4_1 = (labelOnRight);
          this.labelOnRight = stackIn_4_1;
          this.labelFont = labelFont;
          this.labelColor = labelColor;
          this.labelText = labelText;
          this.labelWidth = labelWidth;
          var12_int = this.labelWidth - this.inset;
          var13 = this.labelFont.measureWrappedHeight(labelText, var12_int, this.labelFont.ascent) + this.inset * 2;
          if (height >= var13) {
            var13 = height;
          } else {
            this.setBounds(var13, x, y, (byte) -119, width);
          }
          if (this.labelOnRight) {
            stackIn_10_0 = 0;
          } else {
            stackIn_10_0 = 2 * this.inset + this.labelWidth;
          }
          var14 = stackIn_10_0;
          this.child.setBounds(height - 2 * this.inset, var14, this.inset + (var13 - height >> 1), (byte) -119, -(this.inset * 3) + width - this.labelWidth);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var12 = decompiledCaughtException;
          stackIn_14_0 = var12;
          stackIn_14_1 = new StringBuilder().append("ma.<init>(").append(x).append(',').append(y).append(',').append(width).append(',').append(height).append(',');
          if (child == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(labelOnRight).append(',').append(labelWidth).append(',').append(inset).append(',');
          if (labelFont == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(labelColor).append(',');
          if (labelText == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final static void a(byte param0, int param1) {
        int var2 = 51 / ((-51 - param0) / 53);
        SingleChildWidget.a(13894, param1);
    }

    final String getTooltip(int obfuscationGuard) {
        int var2 = 0;
        String var3 = null;
        if (obfuscationGuard >= 6) {
          var2 = this.child.mouseOver ? 1 : 0;
          this.child.mouseOver = this.mouseOver;
          var3 = this.child.getTooltip(39);
          this.child.mouseOver = var2 != 0 ? true : false;
          return var3;
        }
        return (String) null;
    }

    final static void sendAchievementMaskRequest(byte obfuscationGuard, int opcode) {
        BitPacketBuffer var2 = null;
        BitPacketBuffer var2Lifetime1;
        if (obfuscationGuard <= -49) {
          var2 = TextFieldValidator.outgoingPackets;
          var2.writeCipheredOpcode(-13413, opcode);
          var2.writeByte(27, 1);
          var2.writeByte(127, 2);
          return;
        }
        LabeledWidget.sendAchievementMaskRequest((byte) -23, -84);
        var2Lifetime1 = TextFieldValidator.outgoingPackets;
        var2Lifetime1.writeCipheredOpcode(-13413, opcode);
        var2Lifetime1.writeByte(27, 1);
        var2Lifetime1.writeByte(127, 2);
    }

    static {
        field_G = "Here you can set up a rated game. If you win, your rating will go up. If<nbsp>you lose, it will go down!<br><br>Please specify your preferences and click '<%0>'. Our system will then attempt to find suitable opponents in under a minute, depending on how busy the lobby<nbsp>is.<br><br>This is an excellent way to get to know new people!";
    }
}
