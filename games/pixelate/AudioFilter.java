/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AudioFilter {
    static int[][] field_e;
    private int[][][] frequencies;
    private int[] gainEndpoints;
    private static float field_h;
    static int field_a;
    private int[][][] field_d;
    private static float[][] field_b;
    int[] pairCounts;

    final int computeCoefficients(int param0, float param1) {
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
        if (param0 == 0) {
          var3 = (float)this.gainEndpoints[0] + (float)(this.gainEndpoints[1] - this.gainEndpoints[0]) * param1;
          var3 = var3 * 0.0030517578125f;
          field_h = (float)Math.pow(0.1, (double)(var3 / 20.0f));
          field_a = (int)(field_h * 65536.0f);
        }
        if (this.pairCounts[param0] == 0) {
          return 0;
        }
        var3Lifetime1 = this.interpolateRadius(param0, 0, param1);
        field_b[param0][0] = -2.0f * var3Lifetime1 * (float)Math.cos((double)this.interpolateFrequency(param0, 0, param1));
        field_b[param0][1] = var3Lifetime1 * var3Lifetime1;
        for (var4 = 1; var4 < this.pairCounts[param0]; var4++) {
          var3Lifetime2 = this.interpolateRadius(param0, var4, param1);
          var5 = -2.0f * var3Lifetime2 * (float)Math.cos((double)this.interpolateFrequency(param0, var4, param1));
          var6 = var3Lifetime2 * var3Lifetime2;
          field_b[param0][var4 * 2 + 1] = field_b[param0][var4 * 2 - 1] * var6;
          field_b[param0][var4 * 2] = field_b[param0][var4 * 2 - 1] * var5 + field_b[param0][var4 * 2 - 2] * var6;
          for (var7 = var4 * 2 - 1; var7 >= 2; var7--) {
            dupTemp$0 = field_b[param0];
            dupTemp$0[var7] = dupTemp$0[var7] + (field_b[param0][var7 - 1] * var5 + field_b[param0][var7 - 2] * var6);
          }
          dupTemp$1 = field_b[param0];
          dupTemp$1[1] = dupTemp$1[1] + (field_b[param0][0] * var5 + var6);
          dupTemp$2 = field_b[param0];
          dupTemp$2[0] = dupTemp$2[0] + var5;
        }
        if (param0 == 0) {
          for (var4Lifetime1 = 0; var4Lifetime1 < this.pairCounts[0] * 2; var4Lifetime1++) {
            dupTemp$3 = field_b[0];
            dupTemp$3[var4Lifetime1] = dupTemp$3[var4Lifetime1] * field_h;
          }
        }
        for (var4Lifetime2 = 0; var4Lifetime2 < this.pairCounts[param0] * 2; var4Lifetime2++) {
          field_e[param0][var4Lifetime2] = (int)(field_b[param0][var4Lifetime2] * 65536.0f);
        }
        return this.pairCounts[param0] * 2;
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
        var3 = param0.readUnsignedByte(255);
        this.pairCounts[0] = var3 >> 4;
        this.pairCounts[1] = var3 & 15;
        if (var3 != 0) {
          this.gainEndpoints[0] = param0.readUnsignedShort((byte) -124);
          this.gainEndpoints[1] = param0.readUnsignedShort((byte) 111);
          var4 = param0.readUnsignedByte(255);
          for (var5 = 0; var5 < 2; var5++) {
            for (var6 = 0; var6 < this.pairCounts[var5]; var6++) {
              this.frequencies[var5][0][var6] = param0.readUnsignedShort((byte) -3);
              this.field_d[var5][0][var6] = param0.readUnsignedShort((byte) 62);
            }
          }
          for (var5Lifetime1 = 0; var5Lifetime1 < 2; var5Lifetime1++) {
            var7 = 0;
            var6Lifetime1 = var7;
            while (var7 < this.pairCounts[var5Lifetime1]) {
              if ((var4 & 1 << var5Lifetime1 * 4 << var7) == 0) {
                this.frequencies[var5Lifetime1][1][var7] = this.frequencies[var5Lifetime1][0][var7];
                this.field_d[var5Lifetime1][1][var7] = this.field_d[var5Lifetime1][0][var7];
              } else {
                this.frequencies[var5Lifetime1][1][var7] = param0.readUnsignedShort((byte) -121);
                this.field_d[var5Lifetime1][1][var7] = param0.readUnsignedShort((byte) 86);
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

    public static void releaseStatics() {
        field_b = (float[][]) null;
        field_e = (int[][]) null;
    }

    private final float interpolateRadius(int param0, int param1, float param2) {
        float var4 = (float)this.field_d[param0][0][param1] + param2 * (float)(this.field_d[param0][1][param1] - this.field_d[param0][0][param1]);
        var4 = var4 * 0.00152587890625f;
        return 1.0f - (float)Math.pow(10.0, (double)(-var4 / 20.0f));
    }

    private final float interpolateFrequency(int param0, int param1, float param2) {
        float var4 = (float)this.frequencies[param0][0][param1] + param2 * (float)(this.frequencies[param0][1][param1] - this.frequencies[param0][0][param1]);
        var4 = var4 * 0.0001220703125f;
        return AudioFilter.normalizeFrequency(var4);
    }

    private final static float normalizeFrequency(float param0) {
        float var1 = 32.70319747924805f * (float)Math.pow(2.0, (double)param0);
        return var1 * 3.1415927410125732f / 11025.0f;
    }

    AudioFilter() {
        this.frequencies = new int[2][2][4];
        this.gainEndpoints = new int[2];
        this.field_d = new int[2][2][4];
        this.pairCounts = new int[2];
    }

    static {
        field_e = new int[2][8];
        field_b = new float[2][8];
    }
}
