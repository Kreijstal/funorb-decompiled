/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DialRenderer implements WidgetPainter {
    static int field_c;
    static int field_g;
    private int field_e;
    static String[] textBenefits;
    private int field_b;
    private BitmapFont font;
    private int dialColor;
    private int secondaryMarkerColor;
    private int field_j;
    private int backgroundColor;
    static String ticketingOneunread;
    static int field_n;
    private int field_d;
    static String messageGame;

    final static void a(byte param0, int param1) {
        BallDebugOverlay.field_i = param1 >> 4 & 3;
        if (!(2 >= BallDebugOverlay.field_i)) {
          BallDebugOverlay.field_i = 2;
        }
        ol.field_e = param1 >> 2 & 3;
        ResourceArchive.field_e = param1 & 3;
        if (!(ol.field_e <= 2)) {
          ol.field_e = 2;
        }
        if (2 < ResourceArchive.field_e) {
          ResourceArchive.field_e = 2;
          if (param0 != 78) {
            DialRenderer.a(111, (byte) -79, -26);
            return;
          }
          return;
        }
        if (param0 == 78) {
          return;
        }
        DialRenderer.a(111, (byte) -79, -26);
    }

    public final void paintWidget(boolean param0, int param1, byte param2, int param3, UiWidget param4) {
        DialWidget var15 = null;
        int var7 = 0;
        int var8 = 0;
        int var14 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        double var9Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        try {
          var15 = !(param4 instanceof DialWidget) ? null : (DialWidget) (param4);
          if (var15 != null) {
          }
          SoftwareRasterizer.fillRectangle(param1 + param4.widgetX, param4.widgetY + param3, param4.widgetWidth, param4.widgetHeight, this.backgroundColor);
          var7 = var15.centerOffsetX + (param4.widgetX + param1);
          var8 = var15.centerOffsetY + param3 + param4.widgetY;
          SoftwareRasterizer.fillCircle(var7, var8, var15.radius, this.dialColor);
          if (-1 != var15.field_V) {
            var9 = 2.0 * (3.141592653589793 * (double)var15.field_V) / (double)var15.stepCount;
            var11 = (int)(-Math.sin(var9) * (double)var15.radius);
            var12 = (int)(Math.cos(var9) * (double)var15.radius);
            SoftwareRasterizer.fillCircle(var11 + var7, var8 + var12, 1, this.secondaryMarkerColor);
          }
          SoftwareRasterizer.fillCircle(var7, var8, 2, 1);
          var9Lifetime1 = 2.0 * ((double)var15.selectedStep * 3.141592653589793) / (double)var15.stepCount;
          int var13 = 63 % ((param2 - 2) / 41);
          var11Lifetime1 = (int)(-Math.sin(var9Lifetime1) * (double)var15.radius);
          var12Lifetime1 = (int)(Math.cos(var9Lifetime1) * (double)var15.radius);
          SoftwareRasterizer.drawLine(var7, var8, var11Lifetime1 + var7, var8 + var12Lifetime1, 1);
          if (this.font != null) {
            var14 = this.field_b + var15.radius + var15.centerOffsetX;
            this.font.drawParagraph(param4.widgetText, var14 + (param1 + param4.widgetX), this.field_j + (param3 + param4.widgetY), -var14 + (-this.field_b + param4.widgetWidth), param4.widgetHeight - (this.field_b << 1), this.field_e, this.field_d, 1, 1, 0);
          }
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "vd.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(int param0, byte param1, int param2) {
        if (param1 > 65) {
          return (TriangleRasterizer.projectionCenterY + SoftwareRasterizer.clipTop << 2) + (param2 << 11) / param0;
        }
        messageGame = (String) null;
        return (TriangleRasterizer.projectionCenterY + SoftwareRasterizer.clipTop << 2) + (param2 << 11) / param0;
    }

    public static void a(int param0) {
        textBenefits = null;
        messageGame = null;
        ticketingOneunread = null;
        if (param0 != -1) {
          field_g = 72;
        }
    }

    DialRenderer(BitmapFont param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        try {
          this.field_d = param4;
          this.backgroundColor = param7;
          this.secondaryMarkerColor = param6;
          this.field_e = param3;
          this.dialColor = param5;
          this.field_j = param2;
          this.font = param0;
          this.field_b = param1;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "vd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    static {
        textBenefits = new String[]{"Three more tables: cool polar pool...", "...an ancient table in the mountains...", "...or space out in our orbital shuttle."};
        field_g = -1;
        ticketingOneunread = "You have 1 unread message!";
        messageGame = "Message game";
    }
}
