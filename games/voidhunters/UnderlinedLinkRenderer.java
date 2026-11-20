/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class UnderlinedLinkRenderer implements UiRenderer {
    private int verticalAlignment;
    static TextureCoordinateMode field_d;
    private BitmapFont font;
    private int horizontalAlignment;
    static float[] field_c;

    public static void clearSharedReferences(byte param0) {
        if (param0 != -52) {
          field_c = (float[]) null;
          field_d = null;
          field_c = null;
          return;
        }
        field_d = null;
        field_c = null;
    }

    final static LobbyGameEntry getLobbyGameById(int param0, int param1) {
        if (param1 == 1) {
          return GetLaserReload.field_r == null ? null : (LobbyGameEntry) (GetLaserReload.field_r.get(-1, (long)param0));
        }
        UnderlinedLinkRenderer.getLobbyGameById(-8, 53);
        return GetLaserReload.field_r == null ? null : (LobbyGameEntry) (GetLaserReload.field_r.get(-1, (long)param0));
    }

    public final void drawComponent(int param0, UiComponent param1, int param2, int param3, boolean param4) {
        int stackIn_5_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = VoidHunters.field_G;
        try {
          if (!param1.hovered &&
            !param1.hasFocus((byte) -120)) {
            stackIn_5_0 = 2188450;
          } else {
            stackIn_5_0 = 3249872;
          }
          var6_int = stackIn_5_0;
          var7 = 122 / ((param0 + 27) / 35);
          this.font.drawParagraph("<u=" + Integer.toString(var6_int, 16) + ">" + param1.text + "</u>", param2 + param1.x, param3 + param1.y, param1.width, param1.height, var6_int, -1, this.horizontalAlignment, this.verticalAlignment, this.font.maxDescent + this.font.maxAscent);
          if (!param1.hasFocus((byte) -120)) {
            return;
          }
          var8 = this.font.getStringWidth(param1.text);
          var9 = this.font.maxDescent + this.font.maxAscent;
          var10 = param2 + param1.x;
          if (2 != this.horizontalAlignment) {
            if (this.horizontalAlignment == 1) {
              var10 = var10 + (-var8 + param1.width >> 1);
            }
          } else {
            var10 = var10 + (-var8 + param1.width);
          }
          var11 = param1.y + param3;
          if (this.verticalAlignment == 2) {
            var11 = var11 + (-var9 + param1.height);
          } else {
            if (this.verticalAlignment == 1) {
              var11 = var11 + (-var9 + param1.height >> 1);
            }
          }
          SetCountermeasureLauncherRandomness.drawDottedFocusRectangle(var11 + 2, var8 + 4, var10 - 2, var9, (byte) -79);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_19_0 = var6;
          stackIn_19_1 = new StringBuilder().append("meb.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public UnderlinedLinkRenderer() {
        this.font = SetShipToShipRamDamage.field_o;
        this.horizontalAlignment = 1;
        this.verticalAlignment = 1;
    }

    UnderlinedLinkRenderer(BitmapFont param0, int param1, int param2) {
        try {
          this.verticalAlignment = param2;
          this.font = param0;
          this.horizontalAlignment = param1;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "meb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_d = new TextureCoordinateMode();
        field_c = new float[4];
    }
}
