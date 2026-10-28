/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GuestLoginSupport {
    static PcmSample field_b;
    static PcmSample field_a;

    final static void beginAccountLogin(boolean pointerDriven) {
        if (!SpriteState.guestSession) {
          throw new IllegalStateException();
        }
        CipherPacketBuffer.field_u = true;
        SeekerMine.a((byte) -126, pointerDriven);
        QuickChatPhraseCache.field_e = 0;
    }

    public static void releaseStatics(byte guard) {
        if (guard != 103) {
          field_a = (PcmSample) null;
        }
        field_a = null;
        field_b = null;
    }

    final static void initializeIntroIntensityRamp(int guard) {
        int var4 = EscapeVector.obfuscationControl;
        try {
          MeshRasterState.useRasterClip();
          HighscoreQuery.field_i = 11;
          MenuTitleRenderSupport.field_c = new int[260];
          for (int var1_int = 0; var1_int < 256; var1_int++) {
            double var2 = 15.0;
            MenuTitleRenderSupport.field_c[var1_int] = (int)(Math.pow((double)((float)var1_int / 256.0f), var2) * 255.0);
          }
          if (guard >= -19) {
            field_b = (PcmSample) null;
          }
          int var5 = 256;
          int var1_intLifetime1 = var5;
          while (var5 < MenuTitleRenderSupport.field_c.length) {
            MenuTitleRenderSupport.field_c[var5] = 255;
            var5++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var1 = decompiledCaughtException;
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) var1), "pa.A(" + guard + ')');
        }
    }

    static {
    }
}
