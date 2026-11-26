/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class il {
    static int field_a;
    static int[][] field_b;

    public static void clearStaticReferences(int param0) {
        if (param0 < 61) {
          return;
        }
        field_b = (int[][]) null;
    }

    final static void a(ci param0, ci param1, byte param2) {
        try {
          if (param0.field_I == null) {
            param0.field_I = new IntrusiveDeque();
          }
          if (param1.field_I == null) {
            param1.field_I = new IntrusiveDeque();
          }
          if (null == bf.field_M) {
            bf.field_M = new SecondaryNodeHashTable(64);
          }
          if (param2 != 15) {
            field_a = 90;
          }
          if (r.field_Ib == null) {
            r.field_Ib = new SecondaryNodeHashTable(64);
          }
          me.field_e = param0.field_I;
          cl.field_e = param1.field_I;
          ArchiveRequest.d((byte) -42);
        } catch (RuntimeException runtimeException) {
          throw SpriteGeometry.wrapClientException((Throwable) ((Object) runtimeException), "il.B(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static RgbSprite[] a(int param0, int param1, int param2, boolean param3, boolean param4, int param5) {
        RgbSprite var13 = null;
        RgbSprite var14 = null;
        int[] var16 = SoftwareRasterizer.field_d;
        int[] var15 = var16;
        int[] var12 = var15;
        int[] var6 = var12;
        int var7 = SoftwareRasterizer.field_h;
        int var8 = SoftwareRasterizer.field_c;
        RgbSprite var9 = new RgbSprite(16, param2);
        var9.e();
        SoftwareRasterizer.fillRectangleVerticalGradient(0, param0, 16, param2, param5, param1);
        Object var10 = null;
        if (param3) {
          var13 = var9.c();
          var10 = var13;
          var13.e();
          SoftwareRasterizer.drawHorizontalLine(0, 0, 5, 0);
          SoftwareRasterizer.drawHorizontalLine(0, 1, 3, 0);
          SoftwareRasterizer.drawHorizontalLine(0, 2, 2, 0);
          SoftwareRasterizer.drawHorizontalLine(0, 3, 1, 0);
          SoftwareRasterizer.drawHorizontalLine(0, 4, 1, 0);
        }
        Object var11 = null;
        if (param4) {
          var14 = var9.c();
          var11 = var14;
          var14.e();
          SoftwareRasterizer.drawHorizontalLine(11, 0, 5, 0);
          SoftwareRasterizer.drawHorizontalLine(13, 1, 3, 0);
          SoftwareRasterizer.drawHorizontalLine(14, 2, 2, 0);
          SoftwareRasterizer.drawHorizontalLine(15, 3, 1, 0);
          SoftwareRasterizer.drawHorizontalLine(15, 4, 1, 0);
        }
        SoftwareRasterizer.setRasterBuffer(var16, var7, var8);
        return new RgbSprite[]{null, null, null, (RgbSprite) (var10), var9, (RgbSprite) (var11), null, null, null};
    }

    static {
    }
}
