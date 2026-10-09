/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SoundFilter {
    int[] pairCounts;
    private static float forwardGain;
    private int[][][] frequencyEndpoints;
    private int[] gainEndpoints;
    private int[][][] attenuationEndpoints;
    static int forwardMultiplierQ16;
    private static float[][] coefficientWorkspace;
    static int[][] coefficientsQ16;

    public static void releaseCoefficientBuffers() {
        coefficientWorkspace = (float[][]) null;
        coefficientsQ16 = (int[][]) null;
    }

    final int computeCoefficients(int channel, float fraction) {
        float firstOrderTerm = 0.0f;
        float secondOrderTerm = 0.0f;
        int coefficientIndex = 0;
        float[] recurrenceCoefficients = null;
        float[] lowOrderCoefficients = null;
        float[] leadingCoefficients = null;
        float[] forwardCoefficients = null;
        float interpolatedValue = 0.0f;
        int pairOrCoefficientIndex = 0;
        float interpolatedValueLiteralPhase1;
        float interpolatedValueLiteralPhase2;
        int pairOrCoefficientIndexLiteralPhase1;
        int pairOrCoefficientIndexLiteralPhase2;
        if (channel == 0) {
            interpolatedValue = (float)this.gainEndpoints[0] + (float)(this.gainEndpoints[1] - this.gainEndpoints[0]) * fraction;
            interpolatedValue = interpolatedValue * 0.0030517578125f;
            forwardGain = (float)Math.pow(0.1, (double)(interpolatedValue / 20.0f));
            forwardMultiplierQ16 = (int)(forwardGain * 65536.0f);
        }
        if (this.pairCounts[channel] == 0) {
            return 0;
        }
        interpolatedValueLiteralPhase1 = this.interpolateRadius(channel, 0, fraction);
        coefficientWorkspace[channel][0] = -2.0f * interpolatedValueLiteralPhase1 * (float)Math.cos((double)this.interpolateAngularFrequency(channel, 0, fraction));
        coefficientWorkspace[channel][1] = interpolatedValueLiteralPhase1 * interpolatedValueLiteralPhase1;
        for (pairOrCoefficientIndex = 1; pairOrCoefficientIndex < this.pairCounts[channel]; pairOrCoefficientIndex++) {
            interpolatedValueLiteralPhase2 = this.interpolateRadius(channel, pairOrCoefficientIndex, fraction);
            firstOrderTerm = -2.0f * interpolatedValueLiteralPhase2 * (float)Math.cos((double)this.interpolateAngularFrequency(channel, pairOrCoefficientIndex, fraction));
            secondOrderTerm = interpolatedValueLiteralPhase2 * interpolatedValueLiteralPhase2;
            coefficientWorkspace[channel][pairOrCoefficientIndex * 2 + 1] = coefficientWorkspace[channel][pairOrCoefficientIndex * 2 - 1] * secondOrderTerm;
            coefficientWorkspace[channel][pairOrCoefficientIndex * 2] = coefficientWorkspace[channel][pairOrCoefficientIndex * 2 - 1] * firstOrderTerm + coefficientWorkspace[channel][pairOrCoefficientIndex * 2 - 2] * secondOrderTerm;
            for (coefficientIndex = pairOrCoefficientIndex * 2 - 1; coefficientIndex >= 2; coefficientIndex--) {
                recurrenceCoefficients = coefficientWorkspace[channel];
                recurrenceCoefficients[coefficientIndex] = recurrenceCoefficients[coefficientIndex] + (coefficientWorkspace[channel][coefficientIndex - 1] * firstOrderTerm + coefficientWorkspace[channel][coefficientIndex - 2] * secondOrderTerm);
            }
            lowOrderCoefficients = coefficientWorkspace[channel];
            lowOrderCoefficients[1] = lowOrderCoefficients[1] + (coefficientWorkspace[channel][0] * firstOrderTerm + secondOrderTerm);
            leadingCoefficients = coefficientWorkspace[channel];
            leadingCoefficients[0] = leadingCoefficients[0] + firstOrderTerm;
        }
        if (channel == 0) {
            for (pairOrCoefficientIndexLiteralPhase1 = 0; pairOrCoefficientIndexLiteralPhase1 < this.pairCounts[0] * 2; pairOrCoefficientIndexLiteralPhase1++) {
                forwardCoefficients = coefficientWorkspace[0];
                forwardCoefficients[pairOrCoefficientIndexLiteralPhase1] = forwardCoefficients[pairOrCoefficientIndexLiteralPhase1] * forwardGain;
            }
        }
        for (pairOrCoefficientIndexLiteralPhase2 = 0; pairOrCoefficientIndexLiteralPhase2 < this.pairCounts[channel] * 2; pairOrCoefficientIndexLiteralPhase2++) {
            coefficientsQ16[channel][pairOrCoefficientIndexLiteralPhase2] = (int)(coefficientWorkspace[channel][pairOrCoefficientIndexLiteralPhase2] * 65536.0f);
        }
        return this.pairCounts[channel] * 2;
    }

    private final static float normalizeAngularFrequency(float frequencyOctaves) {
        float frequencyHz = 32.70319747924805f * (float)Math.pow(2.0, (double)frequencyOctaves);
        return frequencyHz * 3.1415927410125732f / 11025.0f;
    }

    final void decode(ByteArrayBuffer buffer, SoundEnvelope envelope) {
        int packedPairCounts;
        int variantMask;
        int channel;
        int pairIndex;
        int variantPairIndex;
        int[] zeroedGainEndpoints;
        int channelNestedPhase2;
        int pairIndexNestedPhase2;
        packedPairCounts = buffer.readUnsignedByte((byte) 34);
        this.pairCounts[0] = packedPairCounts >> 4;
        this.pairCounts[1] = packedPairCounts & 15;
        if (packedPairCounts != 0) {
          this.gainEndpoints[0] = buffer.readUnsignedShortBE(true);
          this.gainEndpoints[1] = buffer.readUnsignedShortBE(true);
          variantMask = buffer.readUnsignedByte((byte) 34);
          for (channel = 0; channel < 2; channel++) {
            for (pairIndex = 0; pairIndex < this.pairCounts[channel]; pairIndex++) {
              this.frequencyEndpoints[channel][0][pairIndex] = buffer.readUnsignedShortBE(true);
              this.attenuationEndpoints[channel][0][pairIndex] = buffer.readUnsignedShortBE(true);
            }
          }
          for (channelNestedPhase2 = 0; channelNestedPhase2 < 2; channelNestedPhase2++) {
            variantPairIndex = 0;
            pairIndexNestedPhase2 = variantPairIndex;
            while (variantPairIndex < this.pairCounts[channelNestedPhase2]) {
              if ((variantMask & 1 << channelNestedPhase2 * 4 << variantPairIndex) == 0) {
                this.frequencyEndpoints[channelNestedPhase2][1][variantPairIndex] = this.frequencyEndpoints[channelNestedPhase2][0][variantPairIndex];
                this.attenuationEndpoints[channelNestedPhase2][1][variantPairIndex] = this.attenuationEndpoints[channelNestedPhase2][0][variantPairIndex];
                variantPairIndex++;
                continue;
              }
              this.frequencyEndpoints[channelNestedPhase2][1][variantPairIndex] = buffer.readUnsignedShortBE(true);
              this.attenuationEndpoints[channelNestedPhase2][1][variantPairIndex] = buffer.readUnsignedShortBE(true);
              variantPairIndex++;
            }
          }
          if (variantMask != 0 ||
                this.gainEndpoints[1] != this.gainEndpoints[0]) {
            envelope.decodeSegments(buffer);
          }
        } else {
          zeroedGainEndpoints = this.gainEndpoints;
          this.gainEndpoints[1] = 0;
          zeroedGainEndpoints[0] = 0;
        }
    }

    private final float interpolateAngularFrequency(int channel, int pairIndex, float fraction) {
        float frequencyOctaves = (float)this.frequencyEndpoints[channel][0][pairIndex] + fraction * (float)(this.frequencyEndpoints[channel][1][pairIndex] - this.frequencyEndpoints[channel][0][pairIndex]);
        frequencyOctaves = frequencyOctaves * 0.0001220703125f;
        return SoundFilter.normalizeAngularFrequency(frequencyOctaves);
    }

    private final float interpolateRadius(int channel, int pairIndex, float fraction) {
        float attenuationDecibels = (float)this.attenuationEndpoints[channel][0][pairIndex] + fraction * (float)(this.attenuationEndpoints[channel][1][pairIndex] - this.attenuationEndpoints[channel][0][pairIndex]);
        attenuationDecibels = attenuationDecibels * 0.00152587890625f;
        return 1.0f - (float)Math.pow(10.0, (double)(-attenuationDecibels / 20.0f));
    }

    SoundFilter() {
        this.pairCounts = new int[2];
        this.attenuationEndpoints = new int[2][2][4];
        this.frequencyEndpoints = new int[2][2][4];
        this.gainEndpoints = new int[2];
    }

    static {
        coefficientWorkspace = new float[2][8];
        coefficientsQ16 = new int[2][8];
    }
}
