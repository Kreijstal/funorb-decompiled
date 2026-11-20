/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class UiToggleButtonRenderer implements UiRenderer {
    private int textOffsetY;
    private int textPadding;
    private int boxWidth;
    private int boxOffsetY;
    private BitmapFont font;
    private int verticalAlignment;
    private int backgroundColor;
    private int horizontalAlignment;
    private int boxOffsetX;
    private int boxHeight;
    static String field_f;
    static int[] field_a;
    private int textColor;
    private int textShadow;

    final static int computeSoundPan(int param0, int param1) {
        int var2 = TextureTransformMode.field_a.worldToScreenX(param1, (byte) 121) - TextureTransformMode.field_a.screenOriginX;
        int var3 = param0 + var2 / 4;
        if (var3 > 250) {
          var3 = 250;
          return var3;
        }
        if (var3 >= 6) {
          return var3;
        }
        var3 = 6;
        return var3;
    }

    final static void drawRectangle(int param0, int param1, int param2, int param3, int param4, int param5) {
        if (!OpenGlTexture1D.field_i) {
          SoftwareRasterizer2D.drawRectangle(param1, param3, param5, param2, param4);
          if (param0 < 106) {
            field_f = (String) null;
            return;
          }
          return;
        }
        if (!SetPointDefenceLaserReload.field_o) {
          if (param0 < 106) {
            field_f = (String) null;
            return;
          }
          return;
        }
        GetDebrisGroupColour.field_r.drawRectangleDefaultBlend(-83, param3, param5, -16777216 | param4, param1, param2);
        if (param0 >= 106) {
          return;
        }
        field_f = (String) null;
    }

    public final void drawComponent(int param0, UiComponent param1, int param2, int param3, boolean param4) {
        UiComponent stackIn_3_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        UiToggleButton var12 = null;
        try {
          if (!(param1 instanceof UiToggleButton)) {
            stackIn_3_0 = null;
          } else {
            stackIn_3_0 = (UiComponent) (param1);
          }
          var12 = (UiToggleButton) (stackIn_3_0);
          if (var12 != null) {
            param4 = param4 & var12.enabled;
          }
          var7 = 5592405;
          if (param4) {
            var7 = 16777215;
          }
          SoftwareRasterizer2D.fillRectangle(param2 + param1.x, param3 + param1.y, param1.width, param1.height, this.backgroundColor);
          var8 = this.boxOffsetX + (param2 + param1.x);
          var9 = param1.y + param3 + this.boxOffsetY;
          SoftwareRasterizer2D.drawRectangleDropShadow(var8, var9, this.boxWidth, this.boxHeight, 5592405);
          SoftwareRasterizer2D.fillRectangle(var8, var9, this.boxWidth, this.boxHeight, var7);
          if (var12.active) {
            SoftwareRasterizer2D.drawLine(var8, var9, var8 + this.boxWidth, this.boxHeight + var9, 1);
            SoftwareRasterizer2D.drawLine(var8 + this.boxWidth, var9, var8, this.boxHeight + var9, 1);
          }
          var10 = 49 % ((param0 + 27) / 35);
          if (null == this.font) {
            return;
          }
          var11 = this.boxWidth + this.boxOffsetX + this.textPadding;
          this.font.drawParagraph(param1.text, var11 + (param2 + param1.x), this.textOffsetY + param3 + param1.y, -this.textPadding + (-var11 + param1.width), -(this.textPadding << 1) + param1.height, this.textColor, this.textShadow, this.horizontalAlignment, this.verticalAlignment, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_18_0 = var6;
          stackIn_18_1 = new StringBuilder().append("uv.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void clearSharedReferences(int param0) {
        field_f = null;
        field_a = null;
        if (param0 != 22089) {
          field_f = (String) null;
        }
    }

    UiToggleButtonRenderer(BitmapFont param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        this.verticalAlignment = 1;
        this.horizontalAlignment = 1;
        try {
          this.textPadding = param1;
          this.boxOffsetY = param6;
          this.textOffsetY = param2;
          this.boxWidth = param8;
          this.font = param0;
          this.textShadow = param4;
          this.boxOffsetX = param5;
          this.textColor = param3;
          this.backgroundColor = param9;
          this.boxHeight = param7;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "uv.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    static {
        field_f = "Error connecting to server. Please try using a different server.";
        field_a = new int[8192];
    }
}
