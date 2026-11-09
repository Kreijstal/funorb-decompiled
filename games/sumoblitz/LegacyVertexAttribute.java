/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LegacyVertexAttribute {
    static TextureCombineSource TEXTURE;

    LegacyVertexAttribute(LegacyVertexBuffer buffer, int componentType, int componentCount, int offset) {
    }

    final static void setLoadingLanguage(int language, int guard) {
        if (guard == 13586) {
          ArenaDefinitionCodec.field_b = LegacyOpenGlPbuffer.field_w[language];
          LegacyOpenGlTexture3D.field_k = ArenaPad.waitingForTextTranslations[language];
          AccountRequestState.field_c = ReflectionReplySender.loadingTextTranslations[language];
          return;
        }
        TEXTURE = (TextureCombineSource) null;
        ArenaDefinitionCodec.field_b = LegacyOpenGlPbuffer.field_w[language];
        LegacyOpenGlTexture3D.field_k = ArenaPad.waitingForTextTranslations[language];
        AccountRequestState.field_c = ReflectionReplySender.loadingTextTranslations[language];
    }

    final static void pushSpriteRaster(int guard, Sprite sprite) {
        try {
          GameApplet.pushRasterState(82);
          SoftwareRasterizer.setRaster(sprite.pixels, sprite.paddedWidth, sprite.paddedHeight);
          if (guard != 7161) {
            LegacyVertexAttribute.setLoadingLanguage(-84, -69);
          }
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "jq.C(" + guard + ',' + (sprite != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 < 99) {
          Sprite var2 = (Sprite) null;
          LegacyVertexAttribute.pushSpriteRaster(87, (Sprite) null);
          TEXTURE = null;
          return;
        }
        TEXTURE = null;
    }

    static {
        TEXTURE = new TextureCombineSource();
    }
}
