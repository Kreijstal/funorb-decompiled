/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AudioFilter {
    static int[][] coefficientsQ16;
    private static float forwardGain;
    int[] pairCounts;
    private static float[][] coefficientScratch;
    private int[][][] attenuations;
    private int[][][] frequencies;
    static int forwardGainQ16;
    private int[] gainEndpoints;

    private final static float normalizeFrequency(float octaveOffset) {
        float frequencyHz = 32.70319747924805f * (float)Math.pow(2.0, (double)octaveOffset);
        return frequencyHz * 3.1415927410125732f / 11025.0f;
    }

    final int computeCoefficients(int stage, float interpolation) {
        float linearFactor = 0.0f;
        float quadraticFactor = 0.0f;
        int coefficientIndex = 0;
        float[] cascadeCoefficients = null;
        float[] linearCoefficients = null;
        float[] constantCoefficients = null;
        float[] gainCoefficients = null;
        float gainWord = 0.0f;
        int pairIndex = 0;
        float firstRadius;
        float pairRadius;
        int gainIndex;
        int quantizeIndex;
        if (stage == 0) {
          gainWord = (float)this.gainEndpoints[0] + (float)(this.gainEndpoints[1] - this.gainEndpoints[0]) * interpolation;
          gainWord = gainWord * 0.0030517578125f;
          forwardGain = (float)Math.pow(0.1, (double)(gainWord / 20.0f));
          forwardGainQ16 = (int)(forwardGain * 65536.0f);
        }
        if (this.pairCounts[stage] == 0) {
          return 0;
        }
        firstRadius = this.interpolateRadius(stage, 0, interpolation);
        coefficientScratch[stage][0] = -2.0f * firstRadius * (float)Math.cos((double)this.interpolateFrequency(stage, 0, interpolation));
        coefficientScratch[stage][1] = firstRadius * firstRadius;
        for (pairIndex = 1; pairIndex < this.pairCounts[stage]; pairIndex++) {
          pairRadius = this.interpolateRadius(stage, pairIndex, interpolation);
          linearFactor = -2.0f * pairRadius * (float)Math.cos((double)this.interpolateFrequency(stage, pairIndex, interpolation));
          quadraticFactor = pairRadius * pairRadius;
          coefficientScratch[stage][pairIndex * 2 + 1] = coefficientScratch[stage][pairIndex * 2 - 1] * quadraticFactor;
          coefficientScratch[stage][pairIndex * 2] = coefficientScratch[stage][pairIndex * 2 - 1] * linearFactor + coefficientScratch[stage][pairIndex * 2 - 2] * quadraticFactor;
          for (coefficientIndex = pairIndex * 2 - 1; coefficientIndex >= 2; coefficientIndex--) {
            cascadeCoefficients = coefficientScratch[stage];
            cascadeCoefficients[coefficientIndex] = cascadeCoefficients[coefficientIndex] + (coefficientScratch[stage][coefficientIndex - 1] * linearFactor + coefficientScratch[stage][coefficientIndex - 2] * quadraticFactor);
          }
          linearCoefficients = coefficientScratch[stage];
          linearCoefficients[1] = linearCoefficients[1] + (coefficientScratch[stage][0] * linearFactor + quadraticFactor);
          constantCoefficients = coefficientScratch[stage];
          constantCoefficients[0] = constantCoefficients[0] + linearFactor;
        }
        if (stage == 0) {
          for (gainIndex = 0; gainIndex < this.pairCounts[0] * 2; gainIndex++) {
            gainCoefficients = coefficientScratch[0];
            gainCoefficients[gainIndex] = gainCoefficients[gainIndex] * forwardGain;
          }
        }
        for (quantizeIndex = 0; quantizeIndex < this.pairCounts[stage] * 2; quantizeIndex++) {
          coefficientsQ16[stage][quantizeIndex] = (int)(coefficientScratch[stage][quantizeIndex] * 65536.0f);
        }
        return this.pairCounts[stage] * 2;
    }

    private final float interpolateFrequency(int stage, int pair, float interpolation) {
        float frequencyWord = (float)this.frequencies[stage][0][pair] + interpolation * (float)(this.frequencies[stage][1][pair] - this.frequencies[stage][0][pair]);
        frequencyWord = frequencyWord * 0.0001220703125f;
        return AudioFilter.normalizeFrequency(frequencyWord);
    }

    public static void releaseScratch() {
        coefficientScratch = (float[][]) null;
        coefficientsQ16 = (int[][]) null;
    }

    final void decode(PacketBuffer packet, SoundEnvelope envelope) {
        int packedPairCounts;
        int alternateMask;
        int initialStage;
        int initialPair;
        int alternatePair;
        int[] gainWords;
        int alternateStage;
        int unusedPairIndex;
        packedPairCounts = packet.readUnsignedByte(255);
        this.pairCounts[0] = packedPairCounts >> 4;
        this.pairCounts[1] = packedPairCounts & 15;
        if (packedPairCounts != 0) {
          this.gainEndpoints[0] = packet.readUnsignedShort(65280);
          this.gainEndpoints[1] = packet.readUnsignedShort(65280);
          alternateMask = packet.readUnsignedByte(255);
          for (initialStage = 0; initialStage < 2; initialStage++) {
            for (initialPair = 0; initialPair < this.pairCounts[initialStage]; initialPair++) {
              this.frequencies[initialStage][0][initialPair] = packet.readUnsignedShort(65280);
              this.attenuations[initialStage][0][initialPair] = packet.readUnsignedShort(65280);
            }
          }
          for (alternateStage = 0; alternateStage < 2; alternateStage++) {
            alternatePair = 0;
            unusedPairIndex = alternatePair;
            while (alternatePair < this.pairCounts[alternateStage]) {
              if ((alternateMask & 1 << alternateStage * 4 << alternatePair) == 0) {
                this.frequencies[alternateStage][1][alternatePair] = this.frequencies[alternateStage][0][alternatePair];
                this.attenuations[alternateStage][1][alternatePair] = this.attenuations[alternateStage][0][alternatePair];
              } else {
                this.frequencies[alternateStage][1][alternatePair] = packet.readUnsignedShort(65280);
                this.attenuations[alternateStage][1][alternatePair] = packet.readUnsignedShort(65280);
              }
              alternatePair++;
            }
          }
          if (alternateMask != 0 ||
            this.gainEndpoints[1] != this.gainEndpoints[0]) {
            envelope.decodeSegments(packet);
          }
        } else {
          gainWords = this.gainEndpoints;
          this.gainEndpoints[1] = 0;
          gainWords[0] = 0;
        }
    }

    AudioFilter() {
        this.attenuations = new int[2][2][4];
        this.frequencies = new int[2][2][4];
        this.pairCounts = new int[2];
        this.gainEndpoints = new int[2];
    }

    private final float interpolateRadius(int stage, int pair, float interpolation) {
        float attenuationWord = (float)this.attenuations[stage][0][pair] + interpolation * (float)(this.attenuations[stage][1][pair] - this.attenuations[stage][0][pair]);
        attenuationWord = attenuationWord * 0.00152587890625f;
        return 1.0f - (float)Math.pow(10.0, (double)(-attenuationWord / 20.0f));
    }

    static {
        coefficientScratch = new float[2][8];
        coefficientsQ16 = new int[2][8];
    }
}
