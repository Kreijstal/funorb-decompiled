/*
 * Decompiled by CFR-JS 0.4.0.
 */
class io extends bob {
    static int field_p;

    public final void drawComponent(int param0, UiComponent param1, int param2, int param3, boolean param4) {
        try {
          if (param4) {
            ServerTickFactory.a(param1.y + param3, (byte) 115, param1.height, param1.width, param1.x + param2);
          }
          super.drawComponent(59, param1, param2, param3, param4);
          int var6_int = -48 / ((param0 + 27) / 35);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "io.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    io(BitmapFont param0, int param1) {
        super(param0, 4, 2, 2, 2, param1, -1, 0, 1, param0.maxAscent, -1, 2147483647, false);
    }

    io(int param0) {
        this(SetShipToShipRamDamage.field_o, param0);
    }

    static {
        field_p = 7;
    }
}
