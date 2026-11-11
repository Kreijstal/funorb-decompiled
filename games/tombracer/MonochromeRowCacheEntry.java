/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MonochromeRowCacheEntry extends IntrusiveNode {
    static int field_k;
    static byte[] field_m;
    static String[] reconnectingMessages;
    int field_j;
    static ModelData field_l;
    static SpriteData[] field_f;
    int field_h;
    static String field_g;

    final static Sprite[] createGradientPanelSprites(int param0, boolean param1, int param2, int param3, int param4, boolean param5) {
        Sprite var20 = null;
        Sprite var21 = null;
        Sprite var22 = null;
        Sprite var18 = null;
        Sprite var19 = null;
        int var7 = 0;
        int var8 = 0;
        Object var10 = null;
        Object var11 = null;
        int[] var16 = SoftwareRasterizer.pixels;
        int[] var15 = var16;
        int[] var12 = var15;
        int[] var6 = var12;
        int var7Lifetime1;
        int var8Lifetime1;
        if (param0 < -62) {
          var7 = SoftwareRasterizer.width;
          var8 = SoftwareRasterizer.height;
          var20 = new Sprite(16, param2);
          var20.makeRasterTarget();
          SoftwareRasterizer.fillVerticalGradient(0, 0, 16, param2, param3, param4);
          var10 = null;
          if (param5) {
            var21 = var20.copy();
            var10 = var21;
            var21.makeRasterTarget();
            SoftwareRasterizer.drawHorizontalLine(0, 0, 5, 0);
            SoftwareRasterizer.drawHorizontalLine(0, 1, 3, 0);
            SoftwareRasterizer.drawHorizontalLine(0, 2, 2, 0);
            SoftwareRasterizer.drawHorizontalLine(0, 3, 1, 0);
            SoftwareRasterizer.drawHorizontalLine(0, 4, 1, 0);
          }
          var11 = null;
          if (param1) {
            var22 = var20.copy();
            var11 = var22;
            var22.makeRasterTarget();
            SoftwareRasterizer.drawHorizontalLine(11, 0, 5, 0);
            SoftwareRasterizer.drawHorizontalLine(13, 1, 3, 0);
            SoftwareRasterizer.drawHorizontalLine(14, 2, 2, 0);
            SoftwareRasterizer.drawHorizontalLine(15, 3, 1, 0);
            SoftwareRasterizer.drawHorizontalLine(15, 4, 1, 0);
          }
          SoftwareRasterizer.setTarget(var16, var7, var8);
          return new Sprite[]{null, null, null, (Sprite) (var10), var20, (Sprite) (var11), null, null, null};
        }
        MonochromeRowCacheEntry.a((byte) -71);
        var7Lifetime1 = SoftwareRasterizer.width;
        var8Lifetime1 = SoftwareRasterizer.height;
        Sprite var17 = new Sprite(16, param2);
        var17.makeRasterTarget();
        SoftwareRasterizer.fillVerticalGradient(0, 0, 16, param2, param3, param4);
        var10 = null;
        if (param5) {
          var18 = var17.copy();
          var10 = var18;
          var18.makeRasterTarget();
          SoftwareRasterizer.drawHorizontalLine(0, 0, 5, 0);
          SoftwareRasterizer.drawHorizontalLine(0, 1, 3, 0);
          SoftwareRasterizer.drawHorizontalLine(0, 2, 2, 0);
          SoftwareRasterizer.drawHorizontalLine(0, 3, 1, 0);
          SoftwareRasterizer.drawHorizontalLine(0, 4, 1, 0);
        }
        var11 = null;
        if (param1) {
          var19 = var17.copy();
          var11 = var19;
          var19.makeRasterTarget();
          SoftwareRasterizer.drawHorizontalLine(11, 0, 5, 0);
          SoftwareRasterizer.drawHorizontalLine(13, 1, 3, 0);
          SoftwareRasterizer.drawHorizontalLine(14, 2, 2, 0);
          SoftwareRasterizer.drawHorizontalLine(15, 3, 1, 0);
          SoftwareRasterizer.drawHorizontalLine(15, 4, 1, 0);
        }
        SoftwareRasterizer.setTarget(var16, var7Lifetime1, var8Lifetime1);
        return new Sprite[]{null, null, null, (Sprite) (var10), var17, (Sprite) (var11), null, null, null};
    }

    final static ClientException wrapException(Throwable param0, String param1) {
        ClientException var2 = null;
        if (param0 instanceof ClientException) {
          var2 = (ClientException) ((Object) param0);
          var2.context = var2.context + ' ' + param1;
        } else {
          var2 = new ClientException(param0, param1);
        }
        return var2;
    }

    final static ResourceArchive a(byte param0) {
        int var1 = 79 / ((param0 - 7) / 37);
        return StringListNode.getOrOpenArchive(-94, S2CEventPacket.field_d.field_c);
    }

    public static void releaseStatics(int param0) {
        field_m = null;
        field_l = null;
        field_g = null;
        field_f = null;
        if (param0 != 0) {
          return;
        }
        reconnectingMessages = null;
    }

    MonochromeRowCacheEntry(int param0, int param1) {
        this.field_j = param1;
        this.field_h = param0;
    }

    static {
        reconnectingMessages = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
    }
}
