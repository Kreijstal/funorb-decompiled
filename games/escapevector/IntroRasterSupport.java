/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IntroRasterSupport {
    static Sprite field_a;
    static byte[][] field_b;

    final static void buildIntroHalo(int guard) {
        int var4 = EscapeVector.obfuscationControl;
        try {
          Sprite var1 = new Sprite(540, 140);
          TickClock.pushSpriteRaster(var1, (byte) -7);
          MeshRasterState.useRasterClip();
          SoftwareRasterizer.clearFramebuffer();
          SocketConnector.field_d = 0;
          IndexedSpriteState.a(-124);
          if (guard < 115) {
            IntroRasterSupport.releaseStatics(109);
          }
          Sprite var2 = var1.copy();
          for (int var3 = 0; var3 < 15; var3++) {
            var2.drawSilhouette(-2, -2, 16777215);
            SoftwareRasterizer.blurRectangle(4, 4, 0, 0, 540, 140);
          }
          SlidingSpriteTransition.field_d.bindAsFramebuffer();
          var1.drawHalfSize(0, 0);
          RasterRestoreSupport.popRasterState((byte) 116);
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "id.D(" + guard + ')');
        }
    }

    final static void configureIntroScale(int durationScale, int scale) {
        IntKeyLookup.field_c = 100 * scale / 150;
        IntKeyLookup.field_a = (scale << 16) / 150;
        IntKeyLookup.field_e = durationScale * scale / 150;
    }

    public static void releaseStatics(int guard) {
        field_b = (byte[][]) null;
        if (guard != -17129) {
          return;
        }
        field_a = null;
    }

    final static int initialHighscoreAction(int guard) {
        HighscoresScreen var1 = CanvasRenderSupport.field_a;
        if (guard != 0) {
          field_b = (byte[][]) null;
        }
        if (AccountSessionSupport.isGuestSession(guard ^ -126)) {
          return var1.actionIndex(1, 0);
        }
        return var1.actionIndex(1, 0);
    }

    static {
        field_b = new byte[50][];
    }
}
