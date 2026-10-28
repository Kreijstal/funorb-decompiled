/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AudioFilter {
    private int[][][] frequencies;
    private int[][][] attenuations;
    private static float forwardGain;
    static int forwardMultiplierQ16;
    private int[] unity;
    static int[][] coefficientsQ16;
    int[] pairs;
    private static float[][] coefficients;

    final void decode(PacketBuffer input, SoundEnvelope envelope) {
        int var3 = input.readUnsignedByte(0);
        this.pairs[0] = var3 >> 4;
        this.pairs[1] = var3 & 15;
        if (var3 != 0) {
          this.unity[0] = input.readUnsignedShort(1952);
          this.unity[1] = input.readUnsignedShort(1952);
          int var4 = input.readUnsignedByte(0);
          for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.pairs[var5]; var6++) {
              this.frequencies[var5][0][var6] = input.readUnsignedShort(1952);
              this.attenuations[var5][0][var6] = input.readUnsignedShort(1952);
            }
          }
          for (int var5Lifetime1 = 0; var5Lifetime1 < 2; var5Lifetime1++) {
            int var7 = 0;
            int var6Lifetime1 = var7;
            while (var7 < this.pairs[var5Lifetime1]) {
              if ((var4 & 1 << var5Lifetime1 * 4 << var7) == 0) {
                this.frequencies[var5Lifetime1][1][var7] = this.frequencies[var5Lifetime1][0][var7];
                this.attenuations[var5Lifetime1][1][var7] = this.attenuations[var5Lifetime1][0][var7];
              } else {
                this.frequencies[var5Lifetime1][1][var7] = input.readUnsignedShort(1952);
                this.attenuations[var5Lifetime1][1][var7] = input.readUnsignedShort(1952);
              }
              var7++;
            }
          }
          if (var4 != 0 ||
            this.unity[1] != this.unity[0]) {
            envelope.decodeSegments(input);
          }
        } else {
          int[] var11 = this.unity;
          this.unity[1] = 0;
          var11[0] = 0;
        }
    }

    private final float interpolateFrequency(int section, int pair, float fraction) {
        float var4 = (float)this.frequencies[section][0][pair] + fraction * (float)(this.frequencies[section][1][pair] - this.frequencies[section][0][pair]);
        var4 = var4 * 0.0001220703125f;
        return AudioFilter.normalizeFrequency(var4);
    }

    public static void releaseStatics() {
        coefficients = (float[][]) null;
        coefficientsQ16 = (int[][]) null;
    }

    final int computeCoefficients(int section, float fraction) {
        if (section == 0) {
          float var3 = (float)this.unity[0] + (float)(this.unity[1] - this.unity[0]) * fraction;
          var3 = var3 * 0.0030517578125f;
          forwardGain = (float)Math.pow(0.1, (double)(var3 / 20.0f));
          forwardMultiplierQ16 = (int)(forwardGain * 65536.0f);
        }
        if (this.pairs[section] == 0) {
          return 0;
        }
        float var3Lifetime1 = this.interpolateMagnitude(section, 0, fraction);
        coefficients[section][0] = -2.0f * var3Lifetime1 * (float)Math.cos((double)this.interpolateFrequency(section, 0, fraction));
        coefficients[section][1] = var3Lifetime1 * var3Lifetime1;
        for (int var4 = 1; var4 < this.pairs[section]; var4++) {
          float var3Lifetime2 = this.interpolateMagnitude(section, var4, fraction);
          float var5 = -2.0f * var3Lifetime2 * (float)Math.cos((double)this.interpolateFrequency(section, var4, fraction));
          float var6 = var3Lifetime2 * var3Lifetime2;
          coefficients[section][var4 * 2 + 1] = coefficients[section][var4 * 2 - 1] * var6;
          coefficients[section][var4 * 2] = coefficients[section][var4 * 2 - 1] * var5 + coefficients[section][var4 * 2 - 2] * var6;
          for (int var7 = var4 * 2 - 1; var7 >= 2; var7--) {
            float[] dupTemp$0 = coefficients[section];
            dupTemp$0[var7] = dupTemp$0[var7] + (coefficients[section][var7 - 1] * var5 + coefficients[section][var7 - 2] * var6);
          }
          float[] dupTemp$1 = coefficients[section];
          dupTemp$1[1] = dupTemp$1[1] + (coefficients[section][0] * var5 + var6);
          float[] dupTemp$2 = coefficients[section];
          dupTemp$2[0] = dupTemp$2[0] + var5;
        }
        if (section == 0) {
          for (int var4Lifetime1 = 0; var4Lifetime1 < this.pairs[0] * 2; var4Lifetime1++) {
            float[] dupTemp$3 = coefficients[0];
            dupTemp$3[var4Lifetime1] = dupTemp$3[var4Lifetime1] * forwardGain;
          }
        }
        for (int var4Lifetime2 = 0; var4Lifetime2 < this.pairs[section] * 2; var4Lifetime2++) {
          coefficientsQ16[section][var4Lifetime2] = (int)(coefficients[section][var4Lifetime2] * 65536.0f);
        }
        return this.pairs[section] * 2;
    }

    private final static float normalizeFrequency(float octaves) {
        float var1 = 32.70319747924805f * (float)Math.pow(2.0, (double)octaves);
        return var1 * 3.1415927410125732f / 11025.0f;
    }

    private final float interpolateMagnitude(int section, int pair, float fraction) {
        float var4 = (float)this.attenuations[section][0][pair] + fraction * (float)(this.attenuations[section][1][pair] - this.attenuations[section][0][pair]);
        var4 = var4 * 0.00152587890625f;
        return 1.0f - (float)Math.pow(10.0, (double)(-var4 / 20.0f));
    }

    AudioFilter() {
        this.frequencies = new int[2][2][4];
        this.unity = new int[2];
        this.attenuations = new int[2][2][4];
        this.pairs = new int[2];
    }

    static {
        coefficientsQ16 = new int[2][8];
        coefficients = new float[2][8];
    }
}
