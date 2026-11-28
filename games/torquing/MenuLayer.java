/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class MenuLayer {
    static String field_a;
    static String field_b;

    final static void a(boolean param0) {
        Sprite var1 = null;
        Sprite var2 = null;
        int var3 = 0;
        int var4 = Torquing.field_u;
        try {
          var1 = new Sprite(540, 140);
          GzipDecompressor.a((byte) -121, var1);
          be.a();
          SoftwareRasterizer.clearRaster();
          jh.field_z = 0;
          so.b(119);
          var2 = var1.c();
          for (var3 = 0; var3 < 15; var3++) {
            var2.drawSilhouette(-2, -2, 16777215);
            SoftwareRasterizer.blurRectangle(4, 4, 0, 0, 540, 140);
          }
          if (!param0) {
            MenuLayer.clearDeclaredStaticReferences(-61);
          }
          ff.field_c.e();
          var1.drawHalfSize(0, 0);
          r.a(126);
        } catch (RuntimeException runtimeException) {
          throw rb.wrapThrowable((Throwable) ((Object) runtimeException), "af.C(" + param0 + ')');
        }
    }

    abstract void drawLayer(int param0);

    public static void clearDeclaredStaticReferences(int param0) {
        field_b = null;
        field_a = null;
        if (param0 != 23394) {
          MenuLayer.clearDeclaredStaticReferences(-25);
        }
    }

    static {
        field_a = "Connection lost - attempting to reconnect";
        field_b = "?";
    }
}
