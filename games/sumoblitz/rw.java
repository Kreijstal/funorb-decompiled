/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class rw extends DualLinkNode {
    boolean field_s;
    volatile boolean field_u;
    boolean field_t;
    static SpriteData[] field_r;

    final static String c(byte param0) {
        if (param0 > -81) {
          return (String) null;
        }
        if (ProxySocketConnector.field_e == ad.field_p) {
          return bi.field_d;
        }
        return kh.field_d;
    }

    rw() {
        this.field_u = true;
    }

    abstract int a(int param0);

    abstract byte[] d(boolean param0);

    public static void releaseStatics(boolean param0) {
        field_r = null;
        if (!param0) {
          field_r = (SpriteData[]) null;
        }
    }

    final static void a(byte param0) {
        Sprite var1 = null;
        Sprite var2 = null;
        int var3 = 0;
        int var4 = Sumoblitz.field_L ? 1 : 0;
        try {
          var1 = new Sprite(540, 140);
          jq.a(7161, var1);
          nk.b();
          if (param0 != -90) {
            field_r = (SpriteData[]) null;
          }
          SoftwareRasterizer.clear();
          MusicPatch.field_u = 0;
          ok.b(256);
          var2 = var1.copy();
          for (var3 = 0; var3 < 15; var3++) {
            var2.drawSilhouette(-2, -2, 16777215);
            SoftwareRasterizer.blurRectangle(4, 4, 0, 0, 540, 140);
          }
          eh.field_b.d();
          var1.drawHalfSize(0, 0);
          ClientException.a((byte) 76);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "rw.B(" + param0 + ')');
        }
    }

    static {
    }
}
