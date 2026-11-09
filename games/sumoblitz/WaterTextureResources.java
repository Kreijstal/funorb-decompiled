/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class WaterTextureResources {
    Texture3D normalMap;
    Texture3D animatedVolume;
    static SpriteData[] field_c;
    boolean useVolumeTextures;
    private HardwareGraphicsToolkit toolkit;
    Texture2D[] animatedSlices;
    private Texture2D[] secondarySlices;

    final boolean ensureNormalMap(int guard) {
        byte[] var22 = null;
        byte[] var19 = null;
        byte[] var18 = null;
        byte[] var23 = null;
        byte[] var20 = null;
        byte[] var17 = null;
        byte[] var24 = null;
        byte[] var21 = null;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        float var13 = 0.0f;
        float var14 = 0.0f;
        float var15 = 0.0f;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        byte[] var2 = null;
        int var16 = Sumoblitz.field_L ? 1 : 0;
        byte[] var2Lifetime1;
        if (this.normalMap == null) {
          if (NoiseSliceGenerator.hardwareHeightNoise == null) {
            var22 = HardwareTextureCache.generateNoiseVolume(0.6000000238418579f, 0.5f, 128, -30865, new PerlinNoiseSliceGenerator(419684), 4.0f, 4.0f, 16.0f, 16, 8, 128);
            var19 = var22;
            var18 = var19;
            var2 = var18;
            NoiseSliceGenerator.hardwareHeightNoise = DroneDebris.storeByteArray((byte) -121, var22, false);
          }
          var23 = NoiseSliceGenerator.extractByteArray(false, NoiseSliceGenerator.hardwareHeightNoise, 0);
          var20 = var23;
          var17 = var20;
          var2Lifetime1 = var17;
          var24 = new byte[4 * var23.length];
          var21 = var24;
          var3 = var21;
          var4 = 0;
          for (var5 = 0; 16 > var5; var5++) {
            var6 = 16384 * var5;
            var7 = var6;
            for (var8 = 0; var8 < 128; var8++) {
              var9 = var7 + var8 * 128;
              var10 = var7 + (127 & var8 - 1) * 128;
              var11 = 128 * (1 + var8 & 127) + var7;
              for (var12 = 0; var12 < 128; var12++) {
                var13 = (float)((var2Lifetime1[var12 + var10] & 255) - (var2Lifetime1[var12 + var11] & 255));
                var14 = (float)((var2Lifetime1[(var12 - 1 & 127) + var9] & 255) - (255 & var2Lifetime1[var9 + (127 & var12 + 1)]));
                var15 = (float)(128.0 / Math.sqrt((double)(16384.0f + var14 * var14 + var13 * var13)));
                incrementValue$0 = var4;
                var4++;
                var3[incrementValue$0] = (byte)(int)(127.0f + var15 * var14);
                incrementValue$1 = var4;
                var4++;
                var3[incrementValue$1] = (byte)(int)(127.0f + 128.0f * var15);
                incrementValue$2 = var4;
                var4++;
                var3[incrementValue$2] = (byte)(int)(var13 * var15 + 127.0f);
                var3[var4++] = var2Lifetime1[var6++];
              }
            }
          }
          this.normalMap = this.toolkit.a(true, BeveledTextInputRenderer.RGBA, 16, 128, var24, 128);
        }
        if (guard > -120) {
          this.useVolumeTextures = true;
        }
        return this.normalMap != null ? true : false;
    }

    final boolean hasAnimatedTextures(int guard) {
        if (guard <= 14) {
          return false;
        }
        return !this.useVolumeTextures ? this.animatedSlices != null ? true : false : null != this.animatedVolume ? true : false;
    }

    public static void releaseStatics(int param0) {
        if (param0 != 128) {
          WaterTextureResources.releaseStatics(-102);
        }
        field_c = null;
    }

    final static LegacyOpenGlShader compileShader(LegacyOpenGlGraphicsToolkit toolkit, boolean guard, int shaderType, String source) {
        long var4_long = 0L;
        RuntimeException var4 = null;
        byte[] var10 = null;
        LegacyOpenGlShader stackIn_2_0 = null;
        Object stackIn_13_0 = null;
        LegacyOpenGlShader stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_long = jaggl.OpenGL.glCreateShaderObjectARB(shaderType);
          jaggl.OpenGL.glShaderSourceARB(var4_long, source);
          jaggl.OpenGL.glCompileShaderARB(var4_long);
          jaggl.OpenGL.glGetObjectParameterivARB(var4_long, 35713, DroneChargeParticle.field_z, 0);
          if (guard) {
            stackIn_2_0 = (LegacyOpenGlShader) null;
            return stackIn_2_0;
          }
          if (DroneChargeParticle.field_z[0] == 0) {
            if (DroneChargeParticle.field_z[0] == 0) {
              System.out.println("Shader compile failed:");
            }
            jaggl.OpenGL.glGetObjectParameterivARB(var4_long, 35716, DroneChargeParticle.field_z, 1);
            if (DroneChargeParticle.field_z[1] > 1) {
              var10 = new byte[DroneChargeParticle.field_z[1]];
              jaggl.OpenGL.glGetInfoLogARB(var4_long, DroneChargeParticle.field_z[1], DroneChargeParticle.field_z, 0, var10, 0);
              System.out.println(new String(var10));
            }
            if (0 == DroneChargeParticle.field_z[0]) {
              jaggl.OpenGL.glDeleteObjectARB(var4_long);
              stackIn_13_0 = null;
              return (LegacyOpenGlShader) (stackIn_13_0);
            }
          }
          stackIn_15_0 = new LegacyOpenGlShader(toolkit, var4_long, shaderType);
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_18_0 = var4;
          stackIn_18_1 = new StringBuilder().append("sk.C(");
          if (toolkit == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(guard).append(',').append(shaderType).append(',');
          if (source == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    WaterTextureResources(HardwareGraphicsToolkit owner) {
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var15 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        byte[] var18 = null;
        int var2_intLifetime1;
        this.normalMap = null;
        this.animatedVolume = null;
        this.animatedSlices = null;
        this.secondarySlices = null;
        try {
          this.toolkit = owner;
          this.useVolumeTextures = this.toolkit.field_Eb;
          if (this.useVolumeTextures &&
            !this.toolkit.a((byte) -42, GpuDataType.UNSIGNED_BYTE, AchievementThresholds.LUMINANCE_ALPHA)) {
            this.useVolumeTextures = false;
          }
          if (!this.useVolumeTextures &&
            !this.toolkit.a(GpuDataType.UNSIGNED_BYTE, AchievementThresholds.LUMINANCE_ALPHA, 6)) {
            return;
          }
          InwardSparkParticle.ensureHardwareWaterNoise(23369);
          if (!this.useVolumeTextures) {
            this.animatedSlices = new Texture2D[16];
            for (var2_int = 0; var2_int < 16; var2_int++) {
              var17 = ByteStorageRanges.copyRange(FourIntReadRequest.hardwareRidgedWaterData, 14381, 32768, var2_int * 32768);
              this.animatedSlices[var2_int] = this.toolkit.a(var17, 128, 128, AchievementThresholds.LUMINANCE_ALPHA, 0, true);
            }
            this.secondarySlices = new Texture2D[16];
            for (var2_intLifetime1 = 0; var2_intLifetime1 < 16; var2_intLifetime1++) {
              var18 = ByteStorageRanges.copyRange(LegacyOpenGlShader.hardwareTurbulentWaterData, 14381, 32768, 32768 * var2_intLifetime1);
              this.secondarySlices[var2_intLifetime1] = this.toolkit.a(var18, 128, 128, AchievementThresholds.LUMINANCE_ALPHA, 0, true);
            }
            return;
          }
          var15 = NoiseSliceGenerator.extractByteArray(false, FourIntReadRequest.hardwareRidgedWaterData, 0);
          this.animatedVolume = this.toolkit.a(true, AchievementThresholds.LUMINANCE_ALPHA, 16, 128, var15, 128);
          var16 = NoiseSliceGenerator.extractByteArray(false, LegacyOpenGlShader.hardwareTurbulentWaterData, 0);
          this.toolkit.a(true, AchievementThresholds.LUMINANCE_ALPHA, 16, 128, var16, 128);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_19_0 = var2;
          stackIn_19_1 = new StringBuilder().append("sk.<init>(");
          if (owner == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    static {
    }
}
