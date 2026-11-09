/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jq {
    static TextureCombineSource TEXTURE;

    jq(LegacyVertexBuffer param0, int param1, int param2, int param3) {
    }

    final static void a(int param0, int param1) {
        if (param1 == 13586) {
          pi.field_b = wh.field_w[param0];
          LegacyOpenGlTexture3D.field_k = ArenaPad.waitingForTextTranslations[param0];
          mm.field_c = qi.loadingTextTranslations[param0];
          return;
        }
        TEXTURE = (TextureCombineSource) null;
        pi.field_b = wh.field_w[param0];
        LegacyOpenGlTexture3D.field_k = ArenaPad.waitingForTextTranslations[param0];
        mm.field_c = qi.loadingTextTranslations[param0];
    }

    final static void a(int param0, Sprite param1) {
        try {
          GameApplet.pushRasterState(82);
          SoftwareRasterizer.setRaster(param1.pixels, param1.field_z, param1.field_w);
          if (param0 != 7161) {
            jq.a(-84, -69);
          }
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "jq.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 < 99) {
          Sprite var2 = (Sprite) null;
          jq.a(87, (Sprite) null);
          TEXTURE = null;
          return;
        }
        TEXTURE = null;
    }

    static {
        TEXTURE = new TextureCombineSource();
    }
}
