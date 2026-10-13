/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tq {
    static int field_c;
    static volatile boolean field_a;
    static String field_d;
    static int gameOptionCount;

    final static void a(boolean param0, boolean param1) {
        GlobalSpell.a(-47, param0);
        if (param1) {
          tq.a((byte) 89);
          DraggableWidgetContainer.a(param0, true);
          return;
        }
        DraggableWidgetContainer.a(param0, true);
    }

    final static void a(boolean param0, boolean param1, int param2) {
        if (param2 < 74) {
          return;
        }
        if (!param1) {
          SoftwareRaster.b();
          DamageEvent.b((byte) 92, param1);
          return;
        }
        SoftwareRaster.b(0, 0, SoftwareRaster.width, SoftwareRaster.height, 0, 192);
        DamageEvent.b((byte) 92, param1);
    }

    final static void a(int param0, int param1) {
        CipherPacketBuffer var2 = EmailValidator.outgoingPacket;
        var2.writeCipheredOpcode(32161, param0);
        var2.writeByte(param1 ^ 1, 1);
        var2.writeByte(1, param1);
    }

    final static RgbSprite[] a(int param0, boolean param1, int param2, int param3, int param4, int param5) {
        RgbSprite var11 = null;
        RgbSprite var12 = null;
        RgbSprite var13 = null;
        Object var14 = null;
        RgbSprite var16 = null;
        int[] var18 = SoftwareRaster.pixels;
        int[] var17 = var18;
        int[] var15 = var17;
        int[] var6 = var15;
        int var7 = SoftwareRaster.width;
        int var8 = SoftwareRaster.height;
        RgbSprite var9 = new RgbSprite(param4, -(2 * param4) + param2);
        var9.b();
        SoftwareRaster.a(0, 0, param4, -(2 * param4) + param2, param0, param5);
        RgbSprite var10 = new RgbSprite(param4, param4);
        var10.b();
        if (!param1) {
          SoftwareRaster.f(0, 0, param4, param4, param0);
          var11 = new RgbSprite(16, param4);
          var11.b();
          SoftwareRaster.f(0, 0, 16, param4, param0);
          var12 = new RgbSprite(param4, param4);
          var12.b();
          SoftwareRaster.f(0, 0, param4, param4, param5);
          var13 = new RgbSprite(16, param4);
          var13.b();
          SoftwareRaster.f(0, 0, 16, param4, param5);
          var14 = null;
          if (param3 > 0) {
            var16 = new RgbSprite(16, 16);
            var14 = var16;
            var16.b();
            SoftwareRaster.f(0, 0, 16, 16, param3);
          }
          SoftwareRaster.setTarget(var18, var7, var8);
          return new RgbSprite[]{var10, var11, var10, var9, (RgbSprite) (var14), var9, var12, var13, var12};
        }
        return (RgbSprite[]) null;
    }

    public static void a(byte param0) {
        field_d = null;
        if (param0 != -84) {
          field_d = (String) null;
        }
    }

    static {
        field_a = false;
        field_d = "Private";
    }
}
