/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LegacyOpenGlWaterTextures {
    OpenGlTexture3D normalVolume;
    OpenGlTexture3D scrollingNoiseVolume;
    boolean usesVolumeTextures;
    static String field_f;
    OpenGlTexture2D[] noiseFrames;
    OpenGlTexture2D[] scrollingNoiseFrames;
    OpenGlTexture3D noiseVolume;

    public static void clearSharedReferences(boolean param0) {
        field_f = null;
        if (param0) {
          field_f = (String) null;
        }
    }

    final static void fillRectangle(int param0, int param1, int param2, int param3, int param4, int param5) {
        if (!OpenGlTexture1D.field_i) {
          SoftwareRasterizer2D.fillRectangle(param4, param3, param5, param1, param0);
        } else {
          if (OpenGlModel.field_v) {
            GetDebrisGroupColour.field_r.fillRectangle(param4, param3, param5, param1, param0, 0);
          }
        }
        if (param2 == 17634) {
          return;
        }
        field_f = (String) null;
    }

    LegacyOpenGlWaterTextures(OpenGlToolkit param0) {
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        OpenGlTexture3D var4 = null;
        LegacyOpenGlNormalMapGenerator var10 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        int var2_intLifetime1;
        this.normalVolume = null;
        this.scrollingNoiseVolume = null;
        this.noiseFrames = null;
        this.scrollingNoiseFrames = null;
        this.noiseVolume = null;
        try {
          this.usesVolumeTextures = param0.field_tc;
          SetBombletSprayProjectileLife.a(param0, 16);
          if (!this.usesVolumeTextures) {
            this.noiseFrames = new OpenGlTexture2D[16];
            for (var2_int = 0; var2_int < 16; var2_int++) {
              var23 = ByteStorageRanges.extractRange(GetMissionTimeLimit.field_p, 32768 * var2_int, true, 32768);
              this.noiseFrames[var2_int] = new OpenGlTexture2D(param0, 3553, 6410, 128, 128, true, var23, 6410, false);
            }
            this.scrollingNoiseFrames = new OpenGlTexture2D[16];
            for (var2_intLifetime1 = 0; 16 > var2_intLifetime1; var2_intLifetime1++) {
              var24 = ByteStorageRanges.extractRange(ScrollBarWidget.field_vb, var2_intLifetime1 * 32768, true, 32768);
              this.scrollingNoiseFrames[var2_intLifetime1] = new OpenGlTexture2D(param0, 3553, 6410, 128, 128, true, var24, 6410, false);
            }
            return;
          }
          var20 = ByteStorageAccess.extractBytes(false, GetMissionTimeLimit.field_p, true);
          this.noiseVolume = new OpenGlTexture3D(param0, 6410, 128, 128, 16, var20, 6410);
          var21 = ByteStorageAccess.extractBytes(false, ScrollBarWidget.field_vb, true);
          this.scrollingNoiseVolume = new OpenGlTexture3D(param0, 6410, 128, 128, 16, var21, 6410);
          var10 = param0.field_yb;
          if (var10.ensureProgram(92)) {
            var22 = ByteStorageAccess.extractBytes(false, SetPhasedEnergyBeamProjectileOndamageParticles.field_o, true);
            this.normalVolume = new OpenGlTexture3D(param0, 6408, 128, 128, 16);
            var4 = new OpenGlTexture3D(param0, 6409, 128, 128, 16, var22, 6409);
            if (var10.generateNormalMap(2.0f, -28279, var4, this.normalVolume)) {
              this.normalVolume.generateMipmaps(9729);
              var4.dispose(0);
              return;
            }
            this.normalVolume.dispose(0);
            this.normalVolume = null;
            var4.dispose(0);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_17_0 = var2;
          stackIn_17_1 = new StringBuilder().append("jjb.<init>(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    static {
        field_f = "Provides a burst of acceleration";
    }
}
