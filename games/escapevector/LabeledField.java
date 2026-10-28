/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LabeledField extends SingleChildContainer {
    private int labelColor;
    private String label;
    private int padding;
    static QuickChatDynamicCommand field_H;
    private int labelWidth;
    private boolean labelOnRight;
    private BitmapFont labelFont;
    static int[] field_M;
    static String field_I;

    final static byte[] loadNamedAsset(String name, int guard) {
        String stackIn_7_2 = null;
        try {
          if (guard != 10592) {
            LabeledField.releaseStatics(-55);
          }
          byte[] stackIn_3_0 = IntegerParseSupport.field_e.getNamedFile(guard ^ -10596, name, "");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var2;
          StringBuilder stackIn_6_1 = new StringBuilder().append("ki.A(");
          if (name == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(guard).append(')').toString());
        }
    }

    public static void releaseStatics(int guard) {
        field_M = null;
        field_H = null;
        if (guard < 67) {
          field_M = (int[]) null;
          field_I = null;
          return;
        }
        field_I = null;
    }

    final String getTooltip(int guard) {
        boolean var2 = (this.child.hovered);
        this.child.hovered = this.hovered;
        String var3 = this.child.getTooltip(guard);
        this.child.hovered = (var2) ? true : false;
        return var3;
    }

    final void drawLayer(int screenY, byte guard, int layer, int screenX) {
        int var5 = this.x + screenX;
        int var6 = this.y + screenY;
        super.drawLayer(screenY, (byte) 114, layer, screenX);
        if (layer != 0) {
          return;
        }
        int var7 = this.labelOnRight ? this.width - (this.labelWidth + this.padding * 2) : 0;
        this.labelFont.drawParagraph(this.label, this.padding + var5 + var7, var6 + this.padding, -this.padding + this.labelWidth, -(this.padding * 2) + this.height, this.labelColor, -1, this.labelOnRight ? 0 : 2, 1, this.labelFont.maxAscent);
        if (guard >= 85) {
          return;
        }
        this.labelOnRight = false;
    }

    LabeledField(int param0, int param1, int param2, int param3, UiComponent param4, boolean param5, int param6, int param7, BitmapFont param8, int param9, String param10) {
        super(param0, param1, param2, param3, (WidgetPainter) null, (UiListener) null);
        int stackIn_10_0 = 0;
        String stackIn_15_2 = null;
        String stackIn_18_2 = null;
        String stackIn_21_2 = null;
        try {
          this.child = param4;
          this.labelWidth = param6;
          this.labelColor = param9;
          boolean stackIn_4_1 = (param5);
          this.labelOnRight = stackIn_4_1;
          this.padding = param7;
          this.labelFont = param8;
          this.label = param10;
          int var12_int = -this.padding + this.labelWidth;
          int var13 = this.labelFont.paragraphHeight(param10, var12_int, this.labelFont.maxAscent) + 2 * this.padding;
          if (param3 >= var13) {
            var13 = param3;
          } else {
            this.setBounds(param2, param1, param0, true, var13);
          }
          if (this.labelOnRight) {
            stackIn_10_0 = 0;
          } else {
            stackIn_10_0 = 2 * this.padding + this.labelWidth;
          }
          int var14 = stackIn_10_0;
          this.child.setBounds(-(3 * this.padding) + (-this.labelWidth + param2), this.padding + (var13 - param3 >> 1), var14, true, param3 - 2 * this.padding);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var12 = decompiledCaughtException;
          RuntimeException stackIn_14_0 = var12;
          StringBuilder stackIn_14_1 = new StringBuilder().append("ki.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          StringBuilder stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          StringBuilder stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param9).append(',');
          if (param10 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    static {
        field_H = new QuickChatDynamicCommand(10, 2, 2, 0);
        field_M = new int[]{-1, -1, -1, 0};
        field_I = "Container not retrieved - restarting";
    }
}
