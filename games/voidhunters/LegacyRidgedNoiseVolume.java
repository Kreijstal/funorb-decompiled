/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LegacyRidgedNoiseVolume extends RidgedNoiseVolumeGenerator {
    private byte[] voxels;
    static int field_u;

    final byte[] generateVolume(int param0, byte param1, int param2, int param3) {
        this.voxels = new byte[param2 * param0 * (param3 * 2)];
        if (param1 <= -36) {
          this.generate(param2, (byte) -10, param0, param3);
          return this.voxels;
        }
        this.generateVolume(-114, (byte) -82, -98, -124);
        this.generate(param2, (byte) -10, param0, param3);
        return this.voxels;
    }

    final void writeSample(int param0, byte param1, int param2) {
        int var4 = param2 * 2;
        int var5 = 255 & param1;
        int incrementValue$0 = var4;
        var4++;
        this.voxels[incrementValue$0] = (byte)(3 * var5 >> 5);
        if (param0 == 0) {
          this.voxels[var4] = (byte)(var5 * 3 >> 5);
          return;
        }
        field_u = 17;
        this.voxels[var4] = (byte)(var5 * 3 >> 5);
    }

    LegacyRidgedNoiseVolume() {
        super(8, 5, 8, 8, 2, 0.10000000149011612f, 0.550000011920929f, 3.0f);
    }

    static {
        field_u = 32768;
    }
}
