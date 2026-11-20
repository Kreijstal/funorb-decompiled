/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GpuRidgedNoiseVolume extends RidgedNoiseVolumeGenerator {
    private byte[] voxels;
    static int field_t;

    final void writeSample(int param0, byte param1, int param2) {
        int incrementValue$0 = 0;
        int var4 = 0;
        int var5 = 0;
        int var4Lifetime1;
        int var5Lifetime1;
        if (param0 == 0) {
          var4 = param2 * 2;
          incrementValue$0 = var4;
          var4++;
          this.voxels[incrementValue$0] = (byte)-1;
          var5 = 255 & param1;
          this.voxels[var4] = (byte)(3 * var5 >> 5);
          return;
        }
        field_t = -1;
        var4Lifetime1 = param2 * 2;
        int incrementValue$1 = var4Lifetime1;
        var4Lifetime1++;
        this.voxels[incrementValue$1] = (byte)-1;
        var5Lifetime1 = 255 & param1;
        this.voxels[var4Lifetime1] = (byte)(3 * var5Lifetime1 >> 5);
    }

    final static void increaseSoundEffectVolume(int param0) {
        int var1 = 0;
        int var1Lifetime1;
        if (param0 != 18941) {
          GpuRidgedNoiseVolume.increaseSoundEffectVolume(-27);
          if (RidgedNoiseVolumeGenerator.soundEffectVolume >= 224) {
            LoopingSound.setSoundEffectVolume(256, -13205);
            return;
          }
          var1 = RidgedNoiseVolumeGenerator.soundEffectVolume % 32;
          LoopingSound.setSoundEffectVolume(-var1 + RidgedNoiseVolumeGenerator.soundEffectVolume + 32, param0 ^ -31338);
          return;
        }
        if (RidgedNoiseVolumeGenerator.soundEffectVolume >= 224) {
          LoopingSound.setSoundEffectVolume(256, -13205);
          return;
        }
        var1Lifetime1 = RidgedNoiseVolumeGenerator.soundEffectVolume % 32;
        LoopingSound.setSoundEffectVolume(-var1Lifetime1 + RidgedNoiseVolumeGenerator.soundEffectVolume + 32, param0 ^ -31338);
    }

    GpuRidgedNoiseVolume() {
        super(8, 5, 8, 8, 2, 0.10000000149011612f, 0.550000011920929f, 3.0f);
    }

    final byte[] generateVolume(int param0, int param1, boolean param2, int param3) {
        this.voxels = new byte[2 * param1 * (param3 * param0)];
        if (!param2) {
          this.generate(param0, (byte) -10, param3, param1);
          return this.voxels;
        }
        return (byte[]) null;
    }

    static {
    }
}
