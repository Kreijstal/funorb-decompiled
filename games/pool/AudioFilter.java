/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AudioFilter {
    int[] pairCounts;
    private int[][][] field_b;
    private static float[][] coefficientScratch;
    static int[][] coefficientsQ16;
    private static float forwardGain;
    private int[] gainEndpoints;
    static int field_e;
    private int[][][] field_g;

    private final static float normalizeFrequency(float octaves) {
        float var1 = 32.70319747924805f * (float)Math.pow(2.0, (double)octaves);
        return var1 * 3.1415927410125732f / 11025.0f;
    }

    private final float interpolateFrequency(int channel, int param1, float fraction) {
        float var4 = (float)this.field_b[channel][0][param1] + fraction * (float)(this.field_b[channel][1][param1] - this.field_b[channel][0][param1]);
        var4 = var4 * 0.0001220703125f;
        return AudioFilter.normalizeFrequency(var4);
    }

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
          forwardGain = (float)Math.pow(0.1, (double)(var3 / 20.0f));
          field_e = (int)(forwardGain * 65536.0f);
        }
        if (this.pairCounts[channel] == 0) {
          return 0;
        }
        var3Lifetime1 = this.interpolateRadius(channel, 0, fraction);
        coefficientScratch[channel][0] = -2.0f * var3Lifetime1 * (float)Math.cos((double)this.interpolateFrequency(channel, 0, fraction));
        coefficientScratch[channel][1] = var3Lifetime1 * var3Lifetime1;
        for (var4 = 1; var4 < this.pairCounts[channel]; var4++) {
          var3Lifetime2 = this.interpolateRadius(channel, var4, fraction);
          var5 = -2.0f * var3Lifetime2 * (float)Math.cos((double)this.interpolateFrequency(channel, var4, fraction));
          var6 = var3Lifetime2 * var3Lifetime2;
          coefficientScratch[channel][var4 * 2 + 1] = coefficientScratch[channel][var4 * 2 - 1] * var6;
          coefficientScratch[channel][var4 * 2] = coefficientScratch[channel][var4 * 2 - 1] * var5 + coefficientScratch[channel][var4 * 2 - 2] * var6;
          for (var7 = var4 * 2 - 1; var7 >= 2; var7--) {
            dupTemp$0 = coefficientScratch[channel];
            dupTemp$0[var7] = dupTemp$0[var7] + (coefficientScratch[channel][var7 - 1] * var5 + coefficientScratch[channel][var7 - 2] * var6);
          }
          dupTemp$1 = coefficientScratch[channel];
          dupTemp$1[1] = dupTemp$1[1] + (coefficientScratch[channel][0] * var5 + var6);
          dupTemp$2 = coefficientScratch[channel];
          dupTemp$2[0] = dupTemp$2[0] + var5;
        }
        if (channel == 0) {
          for (var4Lifetime1 = 0; var4Lifetime1 < this.pairCounts[0] * 2; var4Lifetime1++) {
            dupTemp$3 = coefficientScratch[0];
            dupTemp$3[var4Lifetime1] = dupTemp$3[var4Lifetime1] * forwardGain;
          }
        }
        for (var4Lifetime2 = 0; var4Lifetime2 < this.pairCounts[channel] * 2; var4Lifetime2++) {
          coefficientsQ16[channel][var4Lifetime2] = (int)(coefficientScratch[channel][var4Lifetime2] * 65536.0f);
        }
        return this.pairCounts[channel] * 2;
    }

    public static void releaseStatics() {
        coefficientScratch = (float[][]) null;
        coefficientsQ16 = (int[][]) null;
    }

    private final float interpolateRadius(int channel, int param1, float fraction) {
        float var4 = (float)this.field_g[channel][0][param1] + fraction * (float)(this.field_g[channel][1][param1] - this.field_g[channel][0][param1]);
        var4 = var4 * 0.00152587890625f;
        return 1.0f - (float)Math.pow(10.0, (double)(-var4 / 20.0f));
    }

    AudioFilter() {
        this.pairCounts = new int[2];
        this.field_b = new int[2][2][4];
        this.gainEndpoints = new int[2];
        this.field_g = new int[2][2][4];
    }

    final void decode(PacketBuffer param0, SoundEnvelope param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int[] var11;
        int var5Lifetime1;
        int var6Lifetime1;
        var3 = param0.readUnsignedByte(-100);
        this.pairCounts[0] = var3 >> 4;
        this.pairCounts[1] = var3 & 15;
        if (var3 != 0) {
          this.gainEndpoints[0] = param0.readUnsignedShort(-1034);
          this.gainEndpoints[1] = param0.readUnsignedShort(-1034);
          var4 = param0.readUnsignedByte(-108);
          for (var5 = 0; var5 < 2; var5++) {
            for (var6 = 0; var6 < this.pairCounts[var5]; var6++) {
              this.field_b[var5][0][var6] = param0.readUnsignedShort(-1034);
              this.field_g[var5][0][var6] = param0.readUnsignedShort(-1034);
            }
          }
          for (var5Lifetime1 = 0; var5Lifetime1 < 2; var5Lifetime1++) {
            var7 = 0;
            var6Lifetime1 = var7;
            while (var7 < this.pairCounts[var5Lifetime1]) {
              if ((var4 & 1 << var5Lifetime1 * 4 << var7) == 0) {
                this.field_b[var5Lifetime1][1][var7] = this.field_b[var5Lifetime1][0][var7];
                this.field_g[var5Lifetime1][1][var7] = this.field_g[var5Lifetime1][0][var7];
              } else {
                this.field_b[var5Lifetime1][1][var7] = param0.readUnsignedShort(-1034);
                this.field_g[var5Lifetime1][1][var7] = param0.readUnsignedShort(-1034);
              }
              var7++;
            }
          }
          if (var4 != 0 ||
            this.gainEndpoints[1] != this.gainEndpoints[0]) {
            param1.decodeSegments(param0);
          }
        } else {
          var11 = this.gainEndpoints;
          this.gainEndpoints[1] = 0;
          var11[0] = 0;
        }
    }

    static {
        coefficientsQ16 = new int[2][8];
        coefficientScratch = new float[2][8];
    }
}
