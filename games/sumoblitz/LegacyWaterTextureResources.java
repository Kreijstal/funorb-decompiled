/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LegacyWaterTextureResources {
    static int field_d;
    LegacyOpenGlTexture3D ridgedVolume;
    LegacyOpenGlTexture3D normalMap;
    LegacyOpenGlTexture2D[] turbulenceSlices;
    static String playFreeVersionText;
    static boolean field_h;
    boolean useVolumeTextures;
    LegacyOpenGlTexture3D turbulenceVolume;
    LegacyOpenGlTexture2D[] ridgedSlices;

    public static void releaseStatics(byte param0) {
        playFreeVersionText = null;
        if (param0 < 54) {
          LegacyWaterTextureResources.showConnectionLost(-75);
        }
    }

    final static void showConnectionLost(int guard) {
        iu.a((byte) -128);
        pg.field_a = true;
        ScrollPane.field_E = true;
        RenderPresentationException.field_a.closeAllDialogs((byte) -64);
        if (guard != 0) {
          LegacyWaterTextureResources.showConnectionLost(20);
        }
        HardwareUnlitEffect.a(qe.connectionLostAttemptingToText, false, (byte) 49);
    }

    LegacyWaterTextureResources(LegacyOpenGlGraphicsToolkit toolkit) {
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        LegacyOpenGlTexture3D var4 = null;
        LegacyOpenGlNormalMapGenerator var10 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        int var2_intLifetime1;
        this.ridgedVolume = null;
        this.turbulenceSlices = null;
        this.normalMap = null;
        this.turbulenceVolume = null;
        this.ridgedSlices = null;
        try {
          this.useVolumeTextures = toolkit.field_Ic;
          MusicPatchEnvelope.ensureLegacyWaterNoise(toolkit, (byte) 123);
          if (!this.useVolumeTextures) {
            this.ridgedSlices = new LegacyOpenGlTexture2D[16];
            for (var2_int = 0; var2_int < 16; var2_int++) {
              var23 = iq.a(ic.legacyRidgedWaterData, 14381, 32768, var2_int * 32768);
              this.ridgedSlices[var2_int] = new LegacyOpenGlTexture2D(toolkit, 3553, 6410, 128, 128, true, var23, 6410, false);
            }
            this.turbulenceSlices = new LegacyOpenGlTexture2D[16];
            for (var2_intLifetime1 = 0; var2_intLifetime1 < 16; var2_intLifetime1++) {
              var24 = iq.a(GameplaySession.legacyTurbulentWaterData, 14381, 32768, var2_intLifetime1 * 32768);
              this.turbulenceSlices[var2_intLifetime1] = new LegacyOpenGlTexture2D(toolkit, 3553, 6410, 128, 128, true, var24, 6410, false);
            }
            return;
          }
          var20 = NoiseSliceGenerator.extractByteArray(false, ic.legacyRidgedWaterData, 0);
          this.ridgedVolume = new LegacyOpenGlTexture3D(toolkit, 6410, 128, 128, 16, var20, 6410);
          var21 = NoiseSliceGenerator.extractByteArray(false, GameplaySession.legacyTurbulentWaterData, 0);
          this.turbulenceVolume = new LegacyOpenGlTexture3D(toolkit, 6410, 128, 128, 16, var21, 6410);
          var10 = toolkit.normalMapGenerator;
          if (var10.ensureProgram((byte) -101)) {
            var22 = NoiseSliceGenerator.extractByteArray(false, PlayingSound.legacyHeightNoise, 0);
            this.normalMap = new LegacyOpenGlTexture3D(toolkit, 6408, 128, 128, 16);
            var4 = new LegacyOpenGlTexture3D(toolkit, 6409, 128, 128, 16, var22, 6409);
            if (!var10.generateNormalMap(this.normalMap, 2.0f, false, var4)) {
              this.normalMap.close((byte) 106);
              this.normalMap = null;
            } else {
              this.normalMap.generateMipmaps(false);
            }
            var4.close((byte) 126);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_17_0 = var2;
          stackIn_17_1 = new StringBuilder().append("ch.<init>(");
          if (toolkit == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    static {
        playFreeVersionText = "Play free version";
    }
}
