/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jq {
    static TextureCombineSource TEXTURE;

    jq(LegacyVertexBuffer param0, int param1, int param2, int param3) {
    }

    final static void setLoadingLanguage(int language, int guard) {
        if (guard == 13586) {
          pi.field_b = wh.field_w[language];
          LegacyOpenGlTexture3D.field_k = ArenaPad.waitingForTextTranslations[language];
          AccountRequestState.field_c = qi.loadingTextTranslations[language];
          return;
        }
        TEXTURE = (TextureCombineSource) null;
        pi.field_b = wh.field_w[language];
        LegacyOpenGlTexture3D.field_k = ArenaPad.waitingForTextTranslations[language];
        AccountRequestState.field_c = qi.loadingTextTranslations[language];
    }

    final static void pushSpriteRaster(int guard, Sprite sprite) {
        try {
          GameApplet.pushRasterState(82);
          SoftwareRasterizer.setRaster(sprite.pixels, sprite.field_z, sprite.field_w);
          if (guard != 7161) {
            jq.setLoadingLanguage(-84, -69);
          }
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "jq.C(" + guard + ',' + (sprite != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 < 99) {
          Sprite var2 = (Sprite) null;
          jq.pushSpriteRaster(87, (Sprite) null);
          TEXTURE = null;
          return;
        }
        TEXTURE = null;
    }

    static {
        TEXTURE = new TextureCombineSource();
    }
}
