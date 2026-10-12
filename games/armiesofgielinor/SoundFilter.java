/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SoundFilter {
    private int[][][] attenuationEndpoints;
    private static float forwardGain;
    int[] pairCounts;
    static int forwardMultiplier;
    private int[] gainEndpoints;
    static int[][] coefficients;
    private static float[][] coefficientScratch;
    private int[][][] frequencyEndpoints;

    private final static float angularFrequency(float octaves) {
        float frequencyHz = 32.70319747924805f * (float)Math.pow(2.0, (double)octaves);
        return frequencyHz * 3.1415927410125732f / 11025.0f;
    }

    final int computeCoefficients(int channel, float fraction) {
        float pairLinearCoefficient = 0.0f;
        float pairQuadraticCoefficient = 0.0f;
        int coefficientIndex = 0;
        float[] pairCoefficients = null;
        float[] quadraticCoefficients = null;
        float[] linearCoefficients = null;
        float[] gainCoefficients = null;
        float gainDecibels = 0.0f;
        int pairIndex = 0;
        float firstPairRadius;
        float pairRadius;
        int gainCoefficientIndex;
        int fixedCoefficientIndex;
        if (channel == 0) {
          gainDecibels = (float)this.gainEndpoints[0] + (float)(this.gainEndpoints[1] - this.gainEndpoints[0]) * fraction;
          gainDecibels = gainDecibels * 0.0030517578125f;
          forwardGain = (float)Math.pow(0.1, (double)(gainDecibels / 20.0f));
          forwardMultiplier = (int)(forwardGain * 65536.0f);
        }
        if (this.pairCounts[channel] == 0) {
          return 0;
        }
        firstPairRadius = this.interpolateRadius(channel, 0, fraction);
        coefficientScratch[channel][0] = -2.0f * firstPairRadius * (float)Math.cos((double)this.interpolateFrequency(channel, 0, fraction));
        coefficientScratch[channel][1] = firstPairRadius * firstPairRadius;
        for (pairIndex = 1; pairIndex < this.pairCounts[channel]; pairIndex++) {
          pairRadius = this.interpolateRadius(channel, pairIndex, fraction);
          pairLinearCoefficient = -2.0f * pairRadius * (float)Math.cos((double)this.interpolateFrequency(channel, pairIndex, fraction));
          pairQuadraticCoefficient = pairRadius * pairRadius;
          coefficientScratch[channel][pairIndex * 2 + 1] = coefficientScratch[channel][pairIndex * 2 - 1] * pairQuadraticCoefficient;
          coefficientScratch[channel][pairIndex * 2] = coefficientScratch[channel][pairIndex * 2 - 1] * pairLinearCoefficient + coefficientScratch[channel][pairIndex * 2 - 2] * pairQuadraticCoefficient;
          for (coefficientIndex = pairIndex * 2 - 1; coefficientIndex >= 2; coefficientIndex--) {
            pairCoefficients = coefficientScratch[channel];
            pairCoefficients[coefficientIndex] = pairCoefficients[coefficientIndex] + (coefficientScratch[channel][coefficientIndex - 1] * pairLinearCoefficient + coefficientScratch[channel][coefficientIndex - 2] * pairQuadraticCoefficient);
          }
          quadraticCoefficients = coefficientScratch[channel];
          quadraticCoefficients[1] = quadraticCoefficients[1] + (coefficientScratch[channel][0] * pairLinearCoefficient + pairQuadraticCoefficient);
          linearCoefficients = coefficientScratch[channel];
          linearCoefficients[0] = linearCoefficients[0] + pairLinearCoefficient;
        }
        if (channel == 0) {
          for (gainCoefficientIndex = 0; gainCoefficientIndex < this.pairCounts[0] * 2; gainCoefficientIndex++) {
            gainCoefficients = coefficientScratch[0];
            gainCoefficients[gainCoefficientIndex] = gainCoefficients[gainCoefficientIndex] * forwardGain;
          }
        }
        for (fixedCoefficientIndex = 0; fixedCoefficientIndex < this.pairCounts[channel] * 2; fixedCoefficientIndex++) {
          coefficients[channel][fixedCoefficientIndex] = (int)(coefficientScratch[channel][fixedCoefficientIndex] * 65536.0f);
        }
        return this.pairCounts[channel] * 2;
    }

    public static void releaseScratch() {
        coefficientScratch = (float[][]) null;
        coefficients = (int[][]) null;
    }

    private final float interpolateRadius(int channel, int pairIndex, float fraction) {
        float attenuationDecibels = (float)this.attenuationEndpoints[channel][0][pairIndex] + fraction * (float)(this.attenuationEndpoints[channel][1][pairIndex] - this.attenuationEndpoints[channel][0][pairIndex]);
        attenuationDecibels = attenuationDecibels * 0.00152587890625f;
        return 1.0f - (float)Math.pow(10.0, (double)(-attenuationDecibels / 20.0f));
    }

    final void decode(PacketBuffer buffer, SoundEnvelope envelope) {
        int packedPairCounts;
        int endpointOverrideMask;
        int channel;
        int pairIndex;
        int endpointPairIndex;
        int[] zeroGainEndpoints;
        int endpointChannel;
        int initialEndpointPairIndex;
        packedPairCounts = buffer.readUnsignedByte(0);
        this.pairCounts[0] = packedPairCounts >> 4;
        this.pairCounts[1] = packedPairCounts & 15;
        if (packedPairCounts != 0) {
          this.gainEndpoints[0] = buffer.readUnsignedShort((byte) -104);
          this.gainEndpoints[1] = buffer.readUnsignedShort((byte) -104);
          endpointOverrideMask = buffer.readUnsignedByte(0);
          for (channel = 0; channel < 2; channel++) {
            for (pairIndex = 0; pairIndex < this.pairCounts[channel]; pairIndex++) {
              this.frequencyEndpoints[channel][0][pairIndex] = buffer.readUnsignedShort((byte) -104);
              this.attenuationEndpoints[channel][0][pairIndex] = buffer.readUnsignedShort((byte) -104);
            }
          }
          for (endpointChannel = 0; endpointChannel < 2; endpointChannel++) {
            endpointPairIndex = 0;
            initialEndpointPairIndex = endpointPairIndex;
            while (endpointPairIndex < this.pairCounts[endpointChannel]) {
              if ((endpointOverrideMask & 1 << endpointChannel * 4 << endpointPairIndex) == 0) {
                this.frequencyEndpoints[endpointChannel][1][endpointPairIndex] = this.frequencyEndpoints[endpointChannel][0][endpointPairIndex];
                this.attenuationEndpoints[endpointChannel][1][endpointPairIndex] = this.attenuationEndpoints[endpointChannel][0][endpointPairIndex];
              } else {
                this.frequencyEndpoints[endpointChannel][1][endpointPairIndex] = buffer.readUnsignedShort((byte) -104);
                this.attenuationEndpoints[endpointChannel][1][endpointPairIndex] = buffer.readUnsignedShort((byte) -104);
              }
              endpointPairIndex++;
            }
          }
          if (endpointOverrideMask != 0 ||
            this.gainEndpoints[1] != this.gainEndpoints[0]) {
            envelope.decodeSegments(buffer);
          }
        } else {
          zeroGainEndpoints = this.gainEndpoints;
          this.gainEndpoints[1] = 0;
          zeroGainEndpoints[0] = 0;
        }
    }

    private final float interpolateFrequency(int channel, int pairIndex, float fraction) {
        float frequencyOctaves = (float)this.frequencyEndpoints[channel][0][pairIndex] + fraction * (float)(this.frequencyEndpoints[channel][1][pairIndex] - this.frequencyEndpoints[channel][0][pairIndex]);
        frequencyOctaves = frequencyOctaves * 0.0001220703125f;
        return SoundFilter.angularFrequency(frequencyOctaves);
    }

    SoundFilter() {
        this.attenuationEndpoints = new int[2][2][4];
        this.gainEndpoints = new int[2];
        this.pairCounts = new int[2];
        this.frequencyEndpoints = new int[2][2][4];
    }

    static {
        coefficients = new int[2][8];
        coefficientScratch = new float[2][8];
    }
}
