/*
 * Decompiled by CFR-JS 0.4.0.
 */
class GradientBorderTextStyle extends UiTextStyle {
    static int booleanTokenType;

    public final void drawComponent(int param0, UiComponent param1, int param2, int param3, boolean param4) {
        try {
          if (param4) {
            ServerTickFactory.drawGradientBorder(param1.y + param3, (byte) 115, param1.height, param1.width, param1.x + param2);
          }
          super.drawComponent(59, param1, param2, param3, param4);
          int var6_int = -48 / ((param0 + 27) / 35);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "io.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    GradientBorderTextStyle(BitmapFont param0, int param1) {
        super(param0, 4, 2, 2, 2, param1, -1, 0, 1, param0.maxAscent, -1, 2147483647, false);
    }

    GradientBorderTextStyle(int param0) {
        this(SetShipToShipRamDamage.field_o, param0);
    }

    static {
        booleanTokenType = 7;
    }
}
