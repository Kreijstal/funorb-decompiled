/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nba extends ao {
    final static Sprite[] a(boolean param0, int param1, int param2, boolean param3, int param4, int param5) {
        Object var10 = null;
        Object var11 = null;
        Sprite var13 = null;
        Sprite var14 = null;
        int[] var16 = SoftwareRasterizer.field_e;
        int[] var15 = var16;
        int[] var12 = var15;
        int[] var6 = var12;
        int var7 = SoftwareRasterizer.field_i;
        int var8 = SoftwareRasterizer.field_c;
        Sprite var9 = new Sprite(16, param4);
        if (param2 == 1) {
          var9.b();
          SoftwareRasterizer.fillVerticalGradient(0, 0, 16, param4, param1, param5);
          var10 = null;
          var11 = null;
          if (param3) {
            var13 = var9.copy();
            var10 = var13;
            var13.b();
            SoftwareRasterizer.drawHorizontalLine(0, 0, 5, 0);
            SoftwareRasterizer.drawHorizontalLine(0, 1, 3, 0);
            SoftwareRasterizer.drawHorizontalLine(0, 2, 2, 0);
            SoftwareRasterizer.drawHorizontalLine(0, 3, 1, 0);
            SoftwareRasterizer.drawHorizontalLine(0, 4, 1, 0);
          }
          if (param0) {
            var14 = var9.copy();
            var11 = var14;
            var14.b();
            SoftwareRasterizer.drawHorizontalLine(11, 0, 5, 0);
            SoftwareRasterizer.drawHorizontalLine(13, 1, 3, 0);
            SoftwareRasterizer.drawHorizontalLine(14, 2, 2, 0);
            SoftwareRasterizer.drawHorizontalLine(15, 3, 1, 0);
            SoftwareRasterizer.drawHorizontalLine(15, 4, 1, 0);
          }
          SoftwareRasterizer.setTarget(var16, var7, var8);
          return new Sprite[]{null, null, null, (Sprite) (var10), var9, (Sprite) (var11), null, null, null};
        }
        return (Sprite[]) null;
    }

    final static boolean b(byte param0) {
        if (param0 >= -98) {
          nba.a(-97, false);
          return nla.field_f;
        }
        return nla.field_f;
    }

    final static gca a(int param0, boolean param1) {
        if (param1) {
          return (gca) null;
        }
        int var2 = param0;
        if (var2 == 32) {
          return (gca) ((Object) new c());
        }
        if (var2 == 29) {
          return (gca) ((Object) new ria());
        }
        return null;
    }

    static {
    }
}
