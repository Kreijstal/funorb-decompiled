/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AudioFilter {
    private static float field_a;
    private int[] gainEndpoints;
    static int forwardMultiplier;
    private static float[][] field_h;
    static int[][] coefficients;
    private int[][][] frequencies;
    private int[][][] attenuations;
    int[] pairCounts;

    final int computeCoefficients(int channel, float fraction) {
        float var5 = 0.0f;
        float var6 = 0.0f;
        int var7 = 0;
        float[] dupTemp$0 = null;
        float[] dupTemp$1 = null;
        float[] dupTemp$2 = null;
        float[] dupTemp$3 = null;
        float var3 = 0.0f;
        int var4 = 0;
        float var3Lifetime1;
        float var3Lifetime2;
        int var4Lifetime1;
        int var4Lifetime2;
        if (channel == 0) {
          var3 = (float)this.gainEndpoints[0] + (float)(this.gainEndpoints[1] - this.gainEndpoints[0]) * fraction;
          var3 = var3 * 0.0030517578125f;
          field_a = (float)Math.pow(0.1, (double)(var3 / 20.0f));
          forwardMultiplier = (int)(field_a * 65536.0f);
        }
        if (this.pairCounts[channel] == 0) {
          return 0;
        }
        var3Lifetime1 = this.interpolateAttenuation(channel, 0, fraction);
        field_h[channel][0] = -2.0f * var3Lifetime1 * (float)Math.cos((double)this.interpolateFrequency(channel, 0, fraction));
        field_h[channel][1] = var3Lifetime1 * var3Lifetime1;
        for (var4 = 1; var4 < this.pairCounts[channel]; var4++) {
          var3Lifetime2 = this.interpolateAttenuation(channel, var4, fraction);
          var5 = -2.0f * var3Lifetime2 * (float)Math.cos((double)this.interpolateFrequency(channel, var4, fraction));
          var6 = var3Lifetime2 * var3Lifetime2;
          field_h[channel][var4 * 2 + 1] = field_h[channel][var4 * 2 - 1] * var6;
          field_h[channel][var4 * 2] = field_h[channel][var4 * 2 - 1] * var5 + field_h[channel][var4 * 2 - 2] * var6;
          for (var7 = var4 * 2 - 1; var7 >= 2; var7--) {
            dupTemp$0 = field_h[channel];
            dupTemp$0[var7] = dupTemp$0[var7] + (field_h[channel][var7 - 1] * var5 + field_h[channel][var7 - 2] * var6);
          }
          dupTemp$1 = field_h[channel];
          dupTemp$1[1] = dupTemp$1[1] + (field_h[channel][0] * var5 + var6);
          dupTemp$2 = field_h[channel];
          dupTemp$2[0] = dupTemp$2[0] + var5;
        }
        if (channel == 0) {
          for (var4Lifetime1 = 0; var4Lifetime1 < this.pairCounts[0] * 2; var4Lifetime1++) {
            dupTemp$3 = field_h[0];
            dupTemp$3[var4Lifetime1] = dupTemp$3[var4Lifetime1] * field_a;
          }
        }
        for (var4Lifetime2 = 0; var4Lifetime2 < this.pairCounts[channel] * 2; var4Lifetime2++) {
          coefficients[channel][var4Lifetime2] = (int)(field_h[channel][var4Lifetime2] * 65536.0f);
        }
        return this.pairCounts[channel] * 2;
    }

    private final static float frequencyToRadians(float param0) {
        float var1 = 32.70319747924805f * (float)Math.pow(2.0, (double)param0);
        return var1 * 3.1415927410125732f / 11025.0f;
    }

    private final float interpolateFrequency(int channel, int pair, float fraction) {
        float var4 = (float)this.frequencies[channel][0][pair] + fraction * (float)(this.frequencies[channel][1][pair] - this.frequencies[channel][0][pair]);
        var4 = var4 * 0.0001220703125f;
        return AudioFilter.frequencyToRadians(var4);
    }

    public static void releaseStatics() {
        field_h = (float[][]) null;
        coefficients = (int[][]) null;
    }

    final void decode(PacketBuffer buffer, SoundEnvelope envelope) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int[] var11;
        int var5Lifetime1;
        int var6Lifetime1;
        var3 = buffer.readUnsignedByte(-31302);
        this.pairCounts[0] = var3 >> 4;
        this.pairCounts[1] = var3 & 15;
        if (var3 != 0) {
          this.gainEndpoints[0] = buffer.readUnsignedShort(255);
          this.gainEndpoints[1] = buffer.readUnsignedShort(255);
          var4 = buffer.readUnsignedByte(-31302);
          for (var5 = 0; var5 < 2; var5++) {
            for (var6 = 0; var6 < this.pairCounts[var5]; var6++) {
              this.frequencies[var5][0][var6] = buffer.readUnsignedShort(255);
              this.attenuations[var5][0][var6] = buffer.readUnsignedShort(255);
            }
          }
          for (var5Lifetime1 = 0; var5Lifetime1 < 2; var5Lifetime1++) {
            var7 = 0;
            var6Lifetime1 = var7;
            while (var7 < this.pairCounts[var5Lifetime1]) {
              if ((var4 & 1 << var5Lifetime1 * 4 << var7) == 0) {
                this.frequencies[var5Lifetime1][1][var7] = this.frequencies[var5Lifetime1][0][var7];
                this.attenuations[var5Lifetime1][1][var7] = this.attenuations[var5Lifetime1][0][var7];
              } else {
                this.frequencies[var5Lifetime1][1][var7] = buffer.readUnsignedShort(255);
                this.attenuations[var5Lifetime1][1][var7] = buffer.readUnsignedShort(255);
              }
              var7++;
            }
          }
          if (var4 != 0 ||
            this.gainEndpoints[1] != this.gainEndpoints[0]) {
            envelope.decodeSegments(buffer);
          }
        } else {
          var11 = this.gainEndpoints;
          this.gainEndpoints[1] = 0;
          var11[0] = 0;
        }
    }

    private final float interpolateAttenuation(int channel, int pair, float fraction) {
        float var4 = (float)this.attenuations[channel][0][pair] + fraction * (float)(this.attenuations[channel][1][pair] - this.attenuations[channel][0][pair]);
        var4 = var4 * 0.00152587890625f;
        return 1.0f - (float)Math.pow(10.0, (double)(-var4 / 20.0f));
    }

    AudioFilter() {
        this.gainEndpoints = new int[2];
        this.frequencies = new int[2][2][4];
        this.attenuations = new int[2][2][4];
        this.pairCounts = new int[2];
    }

    static {
        field_h = new float[2][8];
        coefficients = new int[2][8];
    }
}
