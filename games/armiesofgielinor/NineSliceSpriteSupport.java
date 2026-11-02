/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NineSliceSpriteSupport {
    static int field_c;
    static volatile boolean canvasRebuildRequested;
    static String field_d;
    static int gameOptionCount;

    final static void a(boolean param0, boolean param1) {
        GlobalSpell.a(-47, param0);
        if (param1) {
          NineSliceSpriteSupport.releaseStatics((byte) 89);
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
          SoftwareRaster.clearPixels();
          DamageEvent.b((byte) 92, param1);
          return;
        }
        SoftwareRaster.fillRectangleBlended(0, 0, SoftwareRaster.width, SoftwareRaster.height, 0, 192);
        DamageEvent.b((byte) 92, param1);
    }

    final static void a(int param0, int param1) {
        CipherPacketBuffer var2 = EmailValidator.outgoingPacket;
        var2.writeCipheredOpcode(32161, param0);
        var2.writeByte(param1 ^ 1, 1);
        var2.writeByte(1, param1);
    }

    final static RgbSprite[] buildSolidFrameSprites(int topColour, boolean returnNull, int height, int centreColour, int cornerSize, int bottomColour) {
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
        RgbSprite var9 = new RgbSprite(cornerSize, -(2 * cornerSize) + height);
        var9.bindAsRasterTarget();
        SoftwareRaster.fillVerticalGradient(0, 0, cornerSize, -(2 * cornerSize) + height, topColour, bottomColour);
        RgbSprite var10 = new RgbSprite(cornerSize, cornerSize);
        var10.bindAsRasterTarget();
        if (!returnNull) {
          SoftwareRaster.fillRectangle(0, 0, cornerSize, cornerSize, topColour);
          var11 = new RgbSprite(16, cornerSize);
          var11.bindAsRasterTarget();
          SoftwareRaster.fillRectangle(0, 0, 16, cornerSize, topColour);
          var12 = new RgbSprite(cornerSize, cornerSize);
          var12.bindAsRasterTarget();
          SoftwareRaster.fillRectangle(0, 0, cornerSize, cornerSize, bottomColour);
          var13 = new RgbSprite(16, cornerSize);
          var13.bindAsRasterTarget();
          SoftwareRaster.fillRectangle(0, 0, 16, cornerSize, bottomColour);
          var14 = null;
          if (centreColour > 0) {
            var16 = new RgbSprite(16, 16);
            var14 = var16;
            var16.bindAsRasterTarget();
            SoftwareRaster.fillRectangle(0, 0, 16, 16, centreColour);
          }
          SoftwareRaster.setTarget(var18, var7, var8);
          return new RgbSprite[]{var10, var11, var10, var9, (RgbSprite) (var14), var9, var12, var13, var12};
        }
        return (RgbSprite[]) null;
    }

    public static void releaseStatics(byte obfuscationGuard) {
        field_d = null;
        if (obfuscationGuard != -84) {
          field_d = (String) null;
        }
    }

    static {
        canvasRebuildRequested = false;
        field_d = "Private";
    }
}
