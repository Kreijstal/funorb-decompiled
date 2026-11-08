/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MarkerSliderPainter implements WidgetPainter {
    private int field_j;
    private int field_c;
    private int field_f;
    static String field_i;
    static String field_b;
    static int field_g;
    private BitmapFont field_h;
    private int field_d;
    private int field_a;
    private int field_e;

    public static void releaseStatics(int param0) {
        field_b = null;
        field_i = null;
        int var1 = -35 / ((param0 - 19) / 58);
    }

    public final void drawWidget(UiComponent param0, byte param1, int param2, int param3, boolean param4) {
        int var10 = 0;
        UiComponent stackIn_6_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        MarkerSlider var12 = null;
        var11 = Pixelate.field_H ? 1 : 0;
        try {
          if (param1 != -124) {
            MarkerSliderPainter.releaseStatics(-84);
          }
          if (!(param0 instanceof MarkerSlider)) {
            stackIn_6_0 = null;
          } else {
            stackIn_6_0 = (UiComponent) (param0);
          }
          var12 = (MarkerSlider) (stackIn_6_0);
          SoftwareRasterizer.fillRectangle(param0.field_z + param3, param2 + param0.field_p, param0.field_E, param0.field_C, this.field_d);
          if (var12 != null) {
          }
          var7 = param0.field_E - 2 * var12.field_R;
          var8 = param3 + param0.field_z + var12.field_R;
          var9 = param2 + param0.field_p + var12.field_T;
          SoftwareRasterizer.drawLine(var8, var9, var7 + var8, var9, this.field_c);
          for (var10 = -1 + var12.getMarkerCount((byte) 62); var10 >= 0; var10--) {
            SoftwareRasterizer.fillCircle(var8 + var7 * var12.getMarker((byte) -91, var10) / var12.getRange(param1 + 123), var9, this.field_e, this.field_a);
          }
          if (null == this.field_h) {
            return;
          }
          this.field_h.drawCentered(var12.field_q, var7 / 2 + var8, this.field_h.lineAdvance + (var9 + var12.field_T), this.field_f, this.field_j);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_16_0 = var6;
          stackIn_16_1 = new StringBuilder().append("hg.A(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    MarkerSliderPainter(BitmapFont param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        try {
          this.field_c = param3;
          this.field_j = param2;
          this.field_d = param4;
          this.field_h = param0;
          this.field_f = param1;
          this.field_a = param6;
          this.field_e = param5;
        } catch (RuntimeException runtimeException) {
          throw aa.addExceptionContext((Throwable) ((Object) runtimeException), "hg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    static {
        field_i = "<%0> has not yet unlocked this option for use.";
        field_b = "Rating";
        field_g = 50;
    }
}
