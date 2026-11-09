/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LegacyRidgedWaterNoise extends RidgedNoise3D {
    private byte[] pixels;
    static TextureTransformMode TEXTURE_COUNT3;

    final void writeVoxel(byte value, int index, int guard) {
        int var4 = 0;
        int var5 = 0;
        int incrementValue$0 = 0;
        if (guard == 4096) {
          var4 = index * 2;
          var5 = value & 255;
          incrementValue$0 = var4;
          var4++;
          this.pixels[incrementValue$0] = (byte)(var5 * 3 >> 5);
          this.pixels[var4] = (byte)(var5 * 3 >> 5);
          return;
        }
    }

    LegacyRidgedWaterNoise() {
        super(8, 5, 8, 8, 2, 0.10000000149011612f, 0.550000011920929f, 3.0f);
    }

    final byte[] generate(byte guard, int width, int height, int depth) {
        int var5 = 79 % ((guard + 43) / 46);
        this.pixels = new byte[2 * (depth * (height * width))];
        this.generateVolume(depth, 206, height, width);
        return this.pixels;
    }

    final static void updateDisplayDialogs(int guard) {
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (!BeveledCheckboxRenderer.hasOpenDialogs(false)) {
            if (null != CompactMeshGeometry.field_o &&
              CompactMeshGeometry.field_o.field_a) {
              HardwareAnimatedWaterEffect.d(1);
              HardwareTextureSprite.field_e.pushDialog((byte) 113, new DisplayModeErrorDialog(HardwareTextureSprite.field_e, CachedArchiveProvider.FULLSCREEN_FOCUS_FAILURE));
            }
            return;
          }
          HardwareTextureSprite.field_e.dispatchPointerInput(JaggrabDownloader.displayDialogY, PasswordInputRenderer.displayDialogX, true, guard - 1886067878);
          if (guard != 1886067877) {
            LegacyRidgedWaterNoise.releaseStatics((byte) -127);
          }
          HardwareTextureSprite.field_e.advanceDialogAnimations(-104);
          while (EmailCredentials.c(-81)) {
            HardwareTextureSprite.field_e.dispatchKey(WhirlpoolDigest.field_c, TextureCombineOperation.field_a, true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var1), "ip.D(" + guard + ')');
        }
    }

    public static void releaseStatics(byte param0) {
        TEXTURE_COUNT3 = null;
        if (param0 <= 53) {
          LegacyRidgedWaterNoise.releaseStatics((byte) -74);
        }
    }

    static {
        TEXTURE_COUNT3 = new TextureTransformMode();
    }
}
