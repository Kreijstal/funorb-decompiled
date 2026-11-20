/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class UiAngleDialRenderer implements UiRenderer {
    private int textShadowColor;
    private int textPadding;
    private int textTopOffset;
    static MenuInputState field_c;
    private int textColor;
    private int backgroundColor;
    private int markerColor;
    private int dialColor;
    static String field_f;
    static String field_e;
    static String[] field_i;
    private BitmapFont font;
    static int field_a;

    public static void clearSharedReferences(boolean param0) {
        if (param0) {
          return;
        }
        field_c = null;
        field_e = null;
        field_i = null;
        field_f = null;
    }

    public final void drawComponent(int param0, UiComponent param1, int param2, int param3, boolean param4) {
        UiAngleDial var15 = null;
        int var7 = 0;
        int var8 = 0;
        int var14 = 0;
        double var10 = 0.0;
        int var12 = 0;
        int var13 = 0;
        double var10Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        try {
          var15 = !(param1 instanceof UiAngleDial) ? null : (UiAngleDial) (param1);
          SoftwareRasterizer2D.fillRectangle(param1.x + param2, param1.y + param3, param1.width, param1.height, this.backgroundColor);
          if (var15 != null) {
          }
          var7 = var15.centerX + param2 + param1.x;
          int var9 = 127 / ((-27 - param0) / 35);
          var8 = var15.centerY + (param1.y + param3);
          SoftwareRasterizer2D.fillCircle(var7, var8, var15.radius, this.dialColor);
          if (var15.markerValue != -1) {
            var10 = 3.141592653589793 * (double)var15.markerValue * 2.0 / (double)var15.stepsPerRevolution;
            var12 = (int)(-Math.sin(var10) * (double)var15.radius);
            var13 = (int)(Math.cos(var10) * (double)var15.radius);
            SoftwareRasterizer2D.fillCircle(var12 + var7, var8 + var13, 1, this.markerColor);
          }
          SoftwareRasterizer2D.fillCircle(var7, var8, 2, 1);
          var10Lifetime1 = 2.0 * (3.141592653589793 * (double)var15.value) / (double)var15.stepsPerRevolution;
          var12Lifetime1 = (int)(-Math.sin(var10Lifetime1) * (double)var15.radius);
          var13Lifetime1 = (int)(Math.cos(var10Lifetime1) * (double)var15.radius);
          SoftwareRasterizer2D.drawLine(var7, var8, var7 + var12Lifetime1, var8 + var13Lifetime1, 1);
          if (null != this.font) {
            var14 = var15.centerX + var15.radius + this.textPadding;
            this.font.drawParagraph(param1.text, var14 + param1.x + param2, param1.y + (param3 + this.textTopOffset), param1.width - var14 - this.textPadding, -(this.textPadding << 1) + param1.height, this.textColor, this.textShadowColor, 1, 1, 0);
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "ei.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    UiAngleDialRenderer(BitmapFont param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        try {
          this.dialColor = param5;
          this.textTopOffset = param2;
          this.textShadowColor = param4;
          this.textPadding = param1;
          this.backgroundColor = param7;
          this.markerColor = param6;
          this.textColor = param3;
          this.font = param0;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "ei.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    static {
        field_c = new MenuInputState(1);
        field_f = "Rotate the mouse wheel or press plus & minus to zoom the camera";
        field_e = "Unable to delete friend - system busy";
        field_i = new String[]{"gametype_icons"};
        field_a = 500;
    }
}
