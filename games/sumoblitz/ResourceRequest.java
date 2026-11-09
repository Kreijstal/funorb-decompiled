/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ResourceRequest extends DualLinkNode {
    boolean cleanupMarked;
    volatile boolean pending;
    boolean urgent;
    static SpriteData[] field_r;

    final static String c(byte param0) {
        if (param0 > -81) {
          return (String) null;
        }
        if (ProxySocketConnector.accountCreationState == LegacyOpenGlGraphicsHeap.PENDING) {
          return ArenaBackdropPalettes.field_d;
        }
        return kh.field_d;
    }

    ResourceRequest() {
        this.pending = true;
    }

    abstract int loadPercent(int guard);

    abstract byte[] completedBytes(boolean guard);

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
          jq.pushSpriteRaster(7161, var1);
          SoftwareRasterViewport.syncClip();
          if (param0 != -90) {
            field_r = (SpriteData[]) null;
          }
          SoftwareRasterizer.clear();
          MusicPatch.field_u = 0;
          IsaacCipher.b(256);
          var2 = var1.copy();
          for (var3 = 0; var3 < 15; var3++) {
            var2.drawSilhouette(-2, -2, 16777215);
            SoftwareRasterizer.blurRectangle(4, 4, 0, 0, 540, 140);
          }
          eh.field_b.bindRaster();
          var1.drawHalfSize(0, 0);
          ClientException.popRasterState((byte) 76);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "rw.B(" + param0 + ')');
        }
    }

    static {
    }
}
