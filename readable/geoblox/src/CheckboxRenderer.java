/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CheckboxRenderer implements WidgetRenderer {
    private int textShadowColor;
    private int checkboxOffsetX;
    private int textOffsetY;
    private int verticalAlignment;
    private int padding;
    private int backgroundColor;
    private BitmapFont font;
    private int textColor;
    private int checkboxOffsetY;
    private int checkboxWidth;
    private int horizontalAlignment;
    static int pointerPressButtonSnapshot;
    private int checkboxHeight;
    static String[] mustLogin3Texts;

    final static boolean a(boolean param0, CharSequence param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Geoblox.clientControlFlowFlag;
        try {
          if (!SocketArchiveNetworkClient.a(param0, param1, (byte) 118)) {
            return false;
          }
          if (param2 >= -32) {
            return true;
          }
          var3_int = 0;
          while (true) {
            if (param1.length() <= var3_int) {
              return true;
            }
            if (TextInputValidator.a(param1.charAt(var3_int), (byte) 118)) {
              var3_int++;
              continue;
            }
            return false;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_17_0 = var3;
          stackIn_17_1 = new StringBuilder().append("bi.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(')').toString());
        }
    }

    public final void drawWidget(int parentX, int methodGuard, int parentY, boolean widgetEnabled, UiWidget widget) {
        UiWidget stackIn_3_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        CheckboxWidget var11 = null;
        try {
          if (widget instanceof CheckboxWidget) {
            stackIn_3_0 = (UiWidget) (widget);
          } else {
            stackIn_3_0 = null;
          }
          var11 = (CheckboxWidget) ((Object) stackIn_3_0);
          if (var11 != null) {
            widgetEnabled = widgetEnabled & var11.enabled;
          }
          if (methodGuard > -5) {
            this.horizontalAlignment = -3;
          }
          var7 = 5592405;
          SoftwareRasterizer.fillRectangle(widget.widgetX + parentX, parentY + widget.widgetY, widget.widgetWidth, widget.widgetHeight, this.backgroundColor);
          if (widgetEnabled) {
            var7 = 16777215;
          }
          var8 = this.checkboxOffsetX + (parentX + widget.widgetX);
          var9 = this.checkboxOffsetY + (widget.widgetY + parentY);
          SoftwareRasterizer.drawRectangleDropShadow(var8, var9, this.checkboxWidth, this.checkboxHeight, 5592405);
          SoftwareRasterizer.fillRectangle(var8, var9, this.checkboxWidth, this.checkboxHeight, var7);
          if (var11.active) {
            SoftwareRasterizer.drawLine(var8, var9, this.checkboxWidth + var8, var9 + this.checkboxHeight, 1);
            SoftwareRasterizer.drawLine(var8 + this.checkboxWidth, var9, var8, this.checkboxHeight + var9, 1);
          }
          if (null != this.font) {
            var10 = this.padding + this.checkboxWidth + this.checkboxOffsetX;
            this.font.drawParagraph(widget.widgetText, var10 + widget.widgetX + parentX, widget.widgetY + parentY + this.textOffsetY, widget.widgetWidth + (-this.padding - var10), -(this.padding << 1) + widget.widgetHeight, this.textColor, this.textShadowColor, this.horizontalAlignment, this.verticalAlignment, 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_17_0 = var6;
          stackIn_17_1 = new StringBuilder().append("bi.E(").append(parentX).append(',').append(methodGuard).append(',').append(parentY).append(',').append(widgetEnabled).append(',');
          if (widget == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 != 1) {
            return;
        }
        mustLogin3Texts = null;
    }

    CheckboxRenderer(BitmapFont param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        this.horizontalAlignment = 1;
        this.verticalAlignment = 1;
        try {
            this.textShadowColor = param4;
            this.padding = param1;
            this.font = param0;
            this.checkboxWidth = param8;
            this.checkboxHeight = param7;
            this.textColor = param3;
            this.textOffsetY = param2;
            this.checkboxOffsetX = param5;
            this.backgroundColor = param9;
            this.checkboxOffsetY = param6;
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "bi.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    static {
        pointerPressButtonSnapshot = 0;
        mustLogin3Texts = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
    }
}
