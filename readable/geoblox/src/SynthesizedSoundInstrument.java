/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class SynthesizedSoundInstrument {
    private static int[] noiseTable;
    private int[] oscillatorDelaysMillis;
    private SoundEnvelope pitchEnvelope;
    private SoundEnvelope muteTimingEnvelope;
    private SoundFilter filter;
    private SoundEnvelope volumeEnvelope;
    private SoundEnvelope pitchModulationEnvelope;
    private int[] oscillatorPitchOffsets;
    private int echoDelayMillis;
    private SoundEnvelope volumeModulationEnvelope;
    private SoundEnvelope filterEnvelope;
    private SoundEnvelope pitchModulationAmplitudeEnvelope;
    private static int[] sineTable;
    int durationMillis;
    private int[] oscillatorVolumePercent;
    private SoundEnvelope volumeModulationAmplitudeEnvelope;
    private int echoDecayPercent;
    private SoundEnvelope unmuteTimingEnvelope;
    int startDelayMillis;
    private static int[] sampleBuffer;
    private static int[] oscillatorBasePitchSteps;
    private static int[] oscillatorDelaySamples;
    private static int[] oscillatorPhases;
    private static int[] oscillatorVolumeScales;
    private static int[] oscillatorPitchSteps;

    public static void releaseSynthesisBuffers() {
        sampleBuffer = null;
        noiseTable = null;
        sineTable = null;
        oscillatorPhases = null;
        oscillatorDelaySamples = null;
        oscillatorVolumeScales = null;
        oscillatorPitchSteps = null;
        oscillatorBasePitchSteps = null;
    }

    private final int evaluateWaveform(int phase, int amplitude, int waveform) {
        if (waveform == 1) {
            if ((phase & 32767) < 16384) {
                return amplitude;
            }
            return -amplitude;
        }
        if (waveform == 2) {
            return sineTable[phase & 32767] * amplitude >> 14;
        }
        if (waveform == 3) {
            return ((phase & 32767) * amplitude >> 14) - amplitude;
        }
        if (waveform == 4) {
            return noiseTable[phase / 2607 & 32767] * amplitude;
        }
        return 0;
    }

    final void decode(ByteArrayBuffer buffer) {
        int oscillatorIndex = 0;
        int oscillatorVolumePercent = 0;
        this.pitchEnvelope = new SoundEnvelope();
        this.pitchEnvelope.decode(buffer);
        this.volumeEnvelope = new SoundEnvelope();
        this.volumeEnvelope.decode(buffer);
        int optionalEnvelopeTag = buffer.readUnsignedByte((byte) 34);
        if (optionalEnvelopeTag != 0) {
            buffer.position = buffer.position - 1;
            this.pitchModulationEnvelope = new SoundEnvelope();
            this.pitchModulationEnvelope.decode(buffer);
            this.pitchModulationAmplitudeEnvelope = new SoundEnvelope();
            this.pitchModulationAmplitudeEnvelope.decode(buffer);
        }
        optionalEnvelopeTag = buffer.readUnsignedByte((byte) 34);
        if (optionalEnvelopeTag != 0) {
            buffer.position = buffer.position - 1;
            this.volumeModulationEnvelope = new SoundEnvelope();
            this.volumeModulationEnvelope.decode(buffer);
            this.volumeModulationAmplitudeEnvelope = new SoundEnvelope();
            this.volumeModulationAmplitudeEnvelope.decode(buffer);
        }
        optionalEnvelopeTag = buffer.readUnsignedByte((byte) 34);
        if (optionalEnvelopeTag != 0) {
            buffer.position = buffer.position - 1;
            this.muteTimingEnvelope = new SoundEnvelope();
            this.muteTimingEnvelope.decode(buffer);
            this.unmuteTimingEnvelope = new SoundEnvelope();
            this.unmuteTimingEnvelope.decode(buffer);
        }
        for (oscillatorIndex = 0; oscillatorIndex < 10; oscillatorIndex++) {
            oscillatorVolumePercent = buffer.readUnsignedSmart(1);
            if (oscillatorVolumePercent == 0) {
                break;
            }
            this.oscillatorVolumePercent[oscillatorIndex] = oscillatorVolumePercent;
            this.oscillatorPitchOffsets[oscillatorIndex] = buffer.readSignedSmart(-125);
            this.oscillatorDelaysMillis[oscillatorIndex] = buffer.readUnsignedSmart(1);
        }
        this.echoDelayMillis = buffer.readUnsignedSmart(1);
        this.echoDecayPercent = buffer.readUnsignedSmart(1);
        this.durationMillis = buffer.readUnsignedShortBE(true);
        this.startDelayMillis = buffer.readUnsignedShortBE(true);
        this.filter = new SoundFilter();
        this.filterEnvelope = new SoundEnvelope();
        this.filter.decode(buffer, this.filterEnvelope);
    }

    final int[] synthesize(int sampleCount, int durationMillis) {
        int nextMuteFlag = 0;
        double samplesPerMillisecond;
        int pitchModulationScale;
        int basePitchModulationStep;
        int pitchModulationPhase;
        int volumeModulationScale;
        int baseVolumeModulationStep;
        int volumeModulationPhase;
        int oscillatorSetupIndex;
        int pitchEnvelopeValue;
        int volumeEnvelopeValue;
        int pitchModulationValue;
        int pitchModulationAmplitude;
        int unmuteEnvelopeValue;
        int warmupCoefficientIndex;
        int sampleIndex;
        int gateCounterQ8;
        int echoDelaySamples;
        int filterEnvelopeValue;
        int clippingSampleIndex;
        int unusedInitialGateThreshold;
        int echoSampleIndex;
        int forwardFilterOrder;
        int muteFlag;
        int feedbackFilterOrder;
        int gatedSampleIndex;
        int filterSampleIndex;
        int muteEnvelopeValue;
        int filterWarmupEnd;
        int warmupFilteredSample;
        int volumeModulationValue;
        int oscillatorIndex;
        int volumeModulationAmplitude;
        int oscillatorSampleOffset;
        int chunkCoefficientIndex;
        int tailCoefficientIndex;
        int gateThreshold;
        int filterChunkEnd;
        int chunkFilteredSample;
        int tailFilteredSample;
        int warmupCoefficientIndexLiteralPhase1;
        int chunkCoefficientIndexLiteralPhase1;
        int tailCoefficientIndexLiteralPhase1;
        ArrayOperations.clearInts(sampleBuffer, 0, sampleCount);
        if (durationMillis < 10) {
          return sampleBuffer;
        }
        samplesPerMillisecond = (double)sampleCount / ((double)durationMillis + 0.0);
        this.pitchEnvelope.reset();
        this.volumeEnvelope.reset();
        pitchModulationScale = 0;
        basePitchModulationStep = 0;
        pitchModulationPhase = 0;
        if (this.pitchModulationEnvelope != null) {
          this.pitchModulationEnvelope.reset();
          this.pitchModulationAmplitudeEnvelope.reset();
          pitchModulationScale = (int)((double)(this.pitchModulationEnvelope.endValue - this.pitchModulationEnvelope.startValue) * 32.768 / samplesPerMillisecond);
          basePitchModulationStep = (int)((double)this.pitchModulationEnvelope.startValue * 32.768 / samplesPerMillisecond);
        }
        volumeModulationScale = 0;
        baseVolumeModulationStep = 0;
        volumeModulationPhase = 0;
        if (this.volumeModulationEnvelope != null) {
          this.volumeModulationEnvelope.reset();
          this.volumeModulationAmplitudeEnvelope.reset();
          volumeModulationScale = (int)((double)(this.volumeModulationEnvelope.endValue - this.volumeModulationEnvelope.startValue) * 32.768 / samplesPerMillisecond);
          baseVolumeModulationStep = (int)((double)this.volumeModulationEnvelope.startValue * 32.768 / samplesPerMillisecond);
        }
        for (oscillatorSetupIndex = 0; oscillatorSetupIndex < 5; oscillatorSetupIndex++) {
          if (this.oscillatorVolumePercent[oscillatorSetupIndex] == 0) {
            continue;
          }
          oscillatorPhases[oscillatorSetupIndex] = 0;
          oscillatorDelaySamples[oscillatorSetupIndex] = (int)((double)this.oscillatorDelaysMillis[oscillatorSetupIndex] * samplesPerMillisecond);
          oscillatorVolumeScales[oscillatorSetupIndex] = (this.oscillatorVolumePercent[oscillatorSetupIndex] << 14) / 100;
          oscillatorPitchSteps[oscillatorSetupIndex] = (int)((double)(this.pitchEnvelope.endValue - this.pitchEnvelope.startValue) * 32.768 * Math.pow(1.0057929410678534, (double)this.oscillatorPitchOffsets[oscillatorSetupIndex]) / samplesPerMillisecond);
          oscillatorBasePitchSteps[oscillatorSetupIndex] = (int)((double)this.pitchEnvelope.startValue * 32.768 / samplesPerMillisecond);
        }
        for (sampleIndex = 0; sampleIndex < sampleCount; sampleIndex++) {
          pitchEnvelopeValue = this.pitchEnvelope.advance(sampleCount);
          volumeEnvelopeValue = this.volumeEnvelope.advance(sampleCount);
          if (this.pitchModulationEnvelope != null) {
            pitchModulationValue = this.pitchModulationEnvelope.advance(sampleCount);
            pitchModulationAmplitude = this.pitchModulationAmplitudeEnvelope.advance(sampleCount);
            pitchEnvelopeValue = pitchEnvelopeValue + (this.evaluateWaveform(pitchModulationPhase, pitchModulationAmplitude, this.pitchModulationEnvelope.waveform) >> 1);
            pitchModulationPhase = pitchModulationPhase + ((pitchModulationValue * pitchModulationScale >> 16) + basePitchModulationStep);
          }
          if (this.volumeModulationEnvelope != null) {
            volumeModulationValue = this.volumeModulationEnvelope.advance(sampleCount);
            volumeModulationAmplitude = this.volumeModulationAmplitudeEnvelope.advance(sampleCount);
            volumeEnvelopeValue = volumeEnvelopeValue * ((this.evaluateWaveform(volumeModulationPhase, volumeModulationAmplitude, this.volumeModulationEnvelope.waveform) >> 1) + 32768) >> 15;
            volumeModulationPhase = volumeModulationPhase + ((volumeModulationValue * volumeModulationScale >> 16) + baseVolumeModulationStep);
          }
          for (oscillatorIndex = 0; oscillatorIndex < 5; oscillatorIndex++) {
            if (this.oscillatorVolumePercent[oscillatorIndex] == 0) {
              continue;
            }
            oscillatorSampleOffset = sampleIndex + oscillatorDelaySamples[oscillatorIndex];
            if (oscillatorSampleOffset >= sampleCount) {
              continue;
            }
            sampleBuffer[oscillatorSampleOffset] = sampleBuffer[oscillatorSampleOffset] + this.evaluateWaveform(oscillatorPhases[oscillatorIndex], volumeEnvelopeValue * oscillatorVolumeScales[oscillatorIndex] >> 15, this.pitchEnvelope.waveform);
            oscillatorPhases[oscillatorIndex] = oscillatorPhases[oscillatorIndex] + ((pitchEnvelopeValue * oscillatorPitchSteps[oscillatorIndex] >> 16) + oscillatorBasePitchSteps[oscillatorIndex]);
          }
        }
        if (this.muteTimingEnvelope != null) {
          this.muteTimingEnvelope.reset();
          this.unmuteTimingEnvelope.reset();
          gateCounterQ8 = 0;
          unusedInitialGateThreshold = 0;
          muteFlag = 1;
          for (gatedSampleIndex = 0; gatedSampleIndex < sampleCount; gatedSampleIndex++) {
            muteEnvelopeValue = this.muteTimingEnvelope.advance(sampleCount);
            unmuteEnvelopeValue = this.unmuteTimingEnvelope.advance(sampleCount);
            if (muteFlag == 0) {
              gateThreshold = this.muteTimingEnvelope.startValue + ((this.muteTimingEnvelope.endValue - this.muteTimingEnvelope.startValue) * unmuteEnvelopeValue >> 8);
            } else {
              gateThreshold = this.muteTimingEnvelope.startValue + ((this.muteTimingEnvelope.endValue - this.muteTimingEnvelope.startValue) * muteEnvelopeValue >> 8);
            }
            gateCounterQ8 += 256;
            if (gateCounterQ8 >= gateThreshold) {
              gateCounterQ8 = 0;
              nextMuteFlag = (muteFlag != 0) ? 0 : 1;
              muteFlag = nextMuteFlag;
            }
            if (muteFlag == 0) {
              continue;
            }
            sampleBuffer[gatedSampleIndex] = 0;
          }
        }
        if (this.echoDelayMillis > 0 &&
            this.echoDecayPercent > 0) {
          echoDelaySamples = (int)((double)this.echoDelayMillis * samplesPerMillisecond);
          for (echoSampleIndex = echoDelaySamples; echoSampleIndex < sampleCount; echoSampleIndex++) {
            sampleBuffer[echoSampleIndex] = sampleBuffer[echoSampleIndex] + sampleBuffer[echoSampleIndex - echoDelaySamples] * this.echoDecayPercent / 100;
          }
        }
        if (!(this.filter.pairCounts[0] <= 0) ||
            !(this.filter.pairCounts[1] <= 0)) {
          this.filterEnvelope.reset();
          filterEnvelopeValue = this.filterEnvelope.advance(sampleCount + 1);
          forwardFilterOrder = this.filter.computeCoefficients(0, (float)filterEnvelopeValue / 65536.0f);
          feedbackFilterOrder = this.filter.computeCoefficients(1, (float)filterEnvelopeValue / 65536.0f);
          if (sampleCount >= forwardFilterOrder + feedbackFilterOrder) {
            filterSampleIndex = 0;
            filterWarmupEnd = feedbackFilterOrder;
            if (filterWarmupEnd > sampleCount - forwardFilterOrder) {
              filterWarmupEnd = sampleCount - forwardFilterOrder;
            }
            while (filterSampleIndex < filterWarmupEnd) {
              warmupFilteredSample = (int)((long)sampleBuffer[filterSampleIndex + forwardFilterOrder] * (long)SoundFilter.forwardMultiplierQ16 >> 16);
              for (warmupCoefficientIndex = 0; warmupCoefficientIndex < forwardFilterOrder; warmupCoefficientIndex++) {
                warmupFilteredSample = warmupFilteredSample + (int)((long)sampleBuffer[filterSampleIndex + forwardFilterOrder - 1 - warmupCoefficientIndex] * (long)SoundFilter.coefficientsQ16[0][warmupCoefficientIndex] >> 16);
              }
              for (warmupCoefficientIndexLiteralPhase1 = 0; warmupCoefficientIndexLiteralPhase1 < filterSampleIndex; warmupCoefficientIndexLiteralPhase1++) {
                warmupFilteredSample = warmupFilteredSample - (int)((long)sampleBuffer[filterSampleIndex - 1 - warmupCoefficientIndexLiteralPhase1] * (long)SoundFilter.coefficientsQ16[1][warmupCoefficientIndexLiteralPhase1] >> 16);
              }
              sampleBuffer[filterSampleIndex] = warmupFilteredSample;
              filterEnvelopeValue = this.filterEnvelope.advance(sampleCount + 1);
              filterSampleIndex++;
            }
            filterChunkEnd = 128;
            while (true) {
              if (filterChunkEnd > sampleCount - forwardFilterOrder) {
                filterChunkEnd = sampleCount - forwardFilterOrder;
              }
              while (filterSampleIndex < filterChunkEnd) {
                chunkFilteredSample = (int)((long)sampleBuffer[filterSampleIndex + forwardFilterOrder] * (long)SoundFilter.forwardMultiplierQ16 >> 16);
                for (chunkCoefficientIndex = 0; chunkCoefficientIndex < forwardFilterOrder; chunkCoefficientIndex++) {
                  chunkFilteredSample = chunkFilteredSample + (int)((long)sampleBuffer[filterSampleIndex + forwardFilterOrder - 1 - chunkCoefficientIndex] * (long)SoundFilter.coefficientsQ16[0][chunkCoefficientIndex] >> 16);
                }
                for (chunkCoefficientIndexLiteralPhase1 = 0; chunkCoefficientIndexLiteralPhase1 < feedbackFilterOrder; chunkCoefficientIndexLiteralPhase1++) {
                  chunkFilteredSample = chunkFilteredSample - (int)((long)sampleBuffer[filterSampleIndex - 1 - chunkCoefficientIndexLiteralPhase1] * (long)SoundFilter.coefficientsQ16[1][chunkCoefficientIndexLiteralPhase1] >> 16);
                }
                sampleBuffer[filterSampleIndex] = chunkFilteredSample;
                filterEnvelopeValue = this.filterEnvelope.advance(sampleCount + 1);
                filterSampleIndex++;
              }
              if (filterSampleIndex < sampleCount - forwardFilterOrder) {
                forwardFilterOrder = this.filter.computeCoefficients(0, (float)filterEnvelopeValue / 65536.0f);
                feedbackFilterOrder = this.filter.computeCoefficients(1, (float)filterEnvelopeValue / 65536.0f);
                filterChunkEnd += 128;
                continue;
              }
              break;
            }
            while (filterSampleIndex < sampleCount) {
              tailFilteredSample = 0;
              for (tailCoefficientIndex = filterSampleIndex + forwardFilterOrder - sampleCount; tailCoefficientIndex < forwardFilterOrder; tailCoefficientIndex++) {
                tailFilteredSample = tailFilteredSample + (int)((long)sampleBuffer[filterSampleIndex + forwardFilterOrder - 1 - tailCoefficientIndex] * (long)SoundFilter.coefficientsQ16[0][tailCoefficientIndex] >> 16);
              }
              for (tailCoefficientIndexLiteralPhase1 = 0; tailCoefficientIndexLiteralPhase1 < feedbackFilterOrder; tailCoefficientIndexLiteralPhase1++) {
                tailFilteredSample = tailFilteredSample - (int)((long)sampleBuffer[filterSampleIndex - 1 - tailCoefficientIndexLiteralPhase1] * (long)SoundFilter.coefficientsQ16[1][tailCoefficientIndexLiteralPhase1] >> 16);
              }
              sampleBuffer[filterSampleIndex] = tailFilteredSample;
              filterEnvelopeValue = this.filterEnvelope.advance(sampleCount + 1);
              filterSampleIndex++;
            }
          }
        }
        for (clippingSampleIndex = 0; clippingSampleIndex < sampleCount; clippingSampleIndex++) {
          if (sampleBuffer[clippingSampleIndex] < -32768) {
            sampleBuffer[clippingSampleIndex] = -32768;
          }
          if (sampleBuffer[clippingSampleIndex] <= 32767) {
            continue;
          }
          sampleBuffer[clippingSampleIndex] = 32767;
        }
        return sampleBuffer;
    }

    SynthesizedSoundInstrument() {
        this.oscillatorDelaysMillis = new int[]{0, 0, 0, 0, 0};
        this.echoDelayMillis = 0;
        this.oscillatorPitchOffsets = new int[]{0, 0, 0, 0, 0};
        this.oscillatorVolumePercent = new int[]{0, 0, 0, 0, 0};
        this.echoDecayPercent = 100;
        this.durationMillis = 500;
        this.startDelayMillis = 0;
    }

    static {
        int waveTableIndex = 0;
        int waveTableIndexLiteralPhase1;
        noiseTable = new int[32768];
        Random seededNoiseRandom = new Random(0L);
        for (waveTableIndex = 0; waveTableIndex < 32768; waveTableIndex++) {
            noiseTable[waveTableIndex] = (seededNoiseRandom.nextInt() & 2) - 1;
        }
        sineTable = new int[32768];
        for (waveTableIndexLiteralPhase1 = 0; waveTableIndexLiteralPhase1 < 32768; waveTableIndexLiteralPhase1++) {
            sineTable[waveTableIndexLiteralPhase1] = (int)(Math.sin((double)waveTableIndexLiteralPhase1 / 5215.1903) * 16384.0);
        }
        sampleBuffer = new int[220500];
        oscillatorBasePitchSteps = new int[5];
        oscillatorPhases = new int[5];
        oscillatorVolumeScales = new int[5];
        oscillatorDelaySamples = new int[5];
        oscillatorPitchSteps = new int[5];
    }
}
