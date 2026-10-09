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
        int indexOrGateCounterOrEchoDelayOrFilterEnvelopeValue;
        int pitchOrGateThresholdOrEchoIndexOrForwardOrder;
        int volumeOrMuteFlagOrFeedbackOrder;
        int modulationValueOrOscillatorOrSampleIndex;
        int amplitudeOrGateValueOrSampleOffsetOrFilterChunkEnd;
        int unmuteEnvelopeValueOrFilteredSample;
        int filterCoefficientIndex;
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
        for (indexOrGateCounterOrEchoDelayOrFilterEnvelopeValue = 0; indexOrGateCounterOrEchoDelayOrFilterEnvelopeValue < 5; indexOrGateCounterOrEchoDelayOrFilterEnvelopeValue++) {
          if (this.oscillatorVolumePercent[indexOrGateCounterOrEchoDelayOrFilterEnvelopeValue] == 0) {
            continue;
          }
          oscillatorPhases[indexOrGateCounterOrEchoDelayOrFilterEnvelopeValue] = 0;
          oscillatorDelaySamples[indexOrGateCounterOrEchoDelayOrFilterEnvelopeValue] = (int)((double)this.oscillatorDelaysMillis[indexOrGateCounterOrEchoDelayOrFilterEnvelopeValue] * samplesPerMillisecond);
          oscillatorVolumeScales[indexOrGateCounterOrEchoDelayOrFilterEnvelopeValue] = (this.oscillatorVolumePercent[indexOrGateCounterOrEchoDelayOrFilterEnvelopeValue] << 14) / 100;
          oscillatorPitchSteps[indexOrGateCounterOrEchoDelayOrFilterEnvelopeValue] = (int)((double)(this.pitchEnvelope.endValue - this.pitchEnvelope.startValue) * 32.768 * Math.pow(1.0057929410678534, (double)this.oscillatorPitchOffsets[indexOrGateCounterOrEchoDelayOrFilterEnvelopeValue]) / samplesPerMillisecond);
          oscillatorBasePitchSteps[indexOrGateCounterOrEchoDelayOrFilterEnvelopeValue] = (int)((double)this.pitchEnvelope.startValue * 32.768 / samplesPerMillisecond);
        }
        for (indexOrGateCounterOrEchoDelayOrFilterEnvelopeValue = 0; indexOrGateCounterOrEchoDelayOrFilterEnvelopeValue < sampleCount; indexOrGateCounterOrEchoDelayOrFilterEnvelopeValue++) {
          pitchOrGateThresholdOrEchoIndexOrForwardOrder = this.pitchEnvelope.advance(sampleCount);
          volumeOrMuteFlagOrFeedbackOrder = this.volumeEnvelope.advance(sampleCount);
          if (this.pitchModulationEnvelope != null) {
            modulationValueOrOscillatorOrSampleIndex = this.pitchModulationEnvelope.advance(sampleCount);
            amplitudeOrGateValueOrSampleOffsetOrFilterChunkEnd = this.pitchModulationAmplitudeEnvelope.advance(sampleCount);
            pitchOrGateThresholdOrEchoIndexOrForwardOrder = pitchOrGateThresholdOrEchoIndexOrForwardOrder + (this.evaluateWaveform(pitchModulationPhase, amplitudeOrGateValueOrSampleOffsetOrFilterChunkEnd, this.pitchModulationEnvelope.waveform) >> 1);
            pitchModulationPhase = pitchModulationPhase + ((modulationValueOrOscillatorOrSampleIndex * pitchModulationScale >> 16) + basePitchModulationStep);
          }
          if (this.volumeModulationEnvelope != null) {
            modulationValueOrOscillatorOrSampleIndex = this.volumeModulationEnvelope.advance(sampleCount);
            amplitudeOrGateValueOrSampleOffsetOrFilterChunkEnd = this.volumeModulationAmplitudeEnvelope.advance(sampleCount);
            volumeOrMuteFlagOrFeedbackOrder = volumeOrMuteFlagOrFeedbackOrder * ((this.evaluateWaveform(volumeModulationPhase, amplitudeOrGateValueOrSampleOffsetOrFilterChunkEnd, this.volumeModulationEnvelope.waveform) >> 1) + 32768) >> 15;
            volumeModulationPhase = volumeModulationPhase + ((modulationValueOrOscillatorOrSampleIndex * volumeModulationScale >> 16) + baseVolumeModulationStep);
          }
          for (modulationValueOrOscillatorOrSampleIndex = 0; modulationValueOrOscillatorOrSampleIndex < 5; modulationValueOrOscillatorOrSampleIndex++) {
            if (this.oscillatorVolumePercent[modulationValueOrOscillatorOrSampleIndex] == 0) {
              continue;
            }
            amplitudeOrGateValueOrSampleOffsetOrFilterChunkEnd = indexOrGateCounterOrEchoDelayOrFilterEnvelopeValue + oscillatorDelaySamples[modulationValueOrOscillatorOrSampleIndex];
            if (amplitudeOrGateValueOrSampleOffsetOrFilterChunkEnd >= sampleCount) {
              continue;
            }
            sampleBuffer[amplitudeOrGateValueOrSampleOffsetOrFilterChunkEnd] = sampleBuffer[amplitudeOrGateValueOrSampleOffsetOrFilterChunkEnd] + this.evaluateWaveform(oscillatorPhases[modulationValueOrOscillatorOrSampleIndex], volumeOrMuteFlagOrFeedbackOrder * oscillatorVolumeScales[modulationValueOrOscillatorOrSampleIndex] >> 15, this.pitchEnvelope.waveform);
            oscillatorPhases[modulationValueOrOscillatorOrSampleIndex] = oscillatorPhases[modulationValueOrOscillatorOrSampleIndex] + ((pitchOrGateThresholdOrEchoIndexOrForwardOrder * oscillatorPitchSteps[modulationValueOrOscillatorOrSampleIndex] >> 16) + oscillatorBasePitchSteps[modulationValueOrOscillatorOrSampleIndex]);
          }
        }
        if (this.muteTimingEnvelope != null) {
          this.muteTimingEnvelope.reset();
          this.unmuteTimingEnvelope.reset();
          indexOrGateCounterOrEchoDelayOrFilterEnvelopeValue = 0;
          pitchOrGateThresholdOrEchoIndexOrForwardOrder = 0;
          volumeOrMuteFlagOrFeedbackOrder = 1;
          for (modulationValueOrOscillatorOrSampleIndex = 0; modulationValueOrOscillatorOrSampleIndex < sampleCount; modulationValueOrOscillatorOrSampleIndex++) {
            amplitudeOrGateValueOrSampleOffsetOrFilterChunkEnd = this.muteTimingEnvelope.advance(sampleCount);
            unmuteEnvelopeValueOrFilteredSample = this.unmuteTimingEnvelope.advance(sampleCount);
            if (volumeOrMuteFlagOrFeedbackOrder == 0) {
              pitchOrGateThresholdOrEchoIndexOrForwardOrder = this.muteTimingEnvelope.startValue + ((this.muteTimingEnvelope.endValue - this.muteTimingEnvelope.startValue) * unmuteEnvelopeValueOrFilteredSample >> 8);
            } else {
              pitchOrGateThresholdOrEchoIndexOrForwardOrder = this.muteTimingEnvelope.startValue + ((this.muteTimingEnvelope.endValue - this.muteTimingEnvelope.startValue) * amplitudeOrGateValueOrSampleOffsetOrFilterChunkEnd >> 8);
            }
            indexOrGateCounterOrEchoDelayOrFilterEnvelopeValue += 256;
            if (indexOrGateCounterOrEchoDelayOrFilterEnvelopeValue >= pitchOrGateThresholdOrEchoIndexOrForwardOrder) {
              indexOrGateCounterOrEchoDelayOrFilterEnvelopeValue = 0;
              nextMuteFlag = (volumeOrMuteFlagOrFeedbackOrder != 0) ? 0 : 1;
              volumeOrMuteFlagOrFeedbackOrder = nextMuteFlag;
            }
            if (volumeOrMuteFlagOrFeedbackOrder == 0) {
              continue;
            }
            sampleBuffer[modulationValueOrOscillatorOrSampleIndex] = 0;
          }
        }
        if (this.echoDelayMillis > 0 &&
            this.echoDecayPercent > 0) {
          indexOrGateCounterOrEchoDelayOrFilterEnvelopeValue = (int)((double)this.echoDelayMillis * samplesPerMillisecond);
          for (pitchOrGateThresholdOrEchoIndexOrForwardOrder = indexOrGateCounterOrEchoDelayOrFilterEnvelopeValue; pitchOrGateThresholdOrEchoIndexOrForwardOrder < sampleCount; pitchOrGateThresholdOrEchoIndexOrForwardOrder++) {
            sampleBuffer[pitchOrGateThresholdOrEchoIndexOrForwardOrder] = sampleBuffer[pitchOrGateThresholdOrEchoIndexOrForwardOrder] + sampleBuffer[pitchOrGateThresholdOrEchoIndexOrForwardOrder - indexOrGateCounterOrEchoDelayOrFilterEnvelopeValue] * this.echoDecayPercent / 100;
          }
        }
        {
          if (!(this.filter.pairCounts[0] <= 0) ||
              !(this.filter.pairCounts[1] <= 0)) {
            this.filterEnvelope.reset();
            indexOrGateCounterOrEchoDelayOrFilterEnvelopeValue = this.filterEnvelope.advance(sampleCount + 1);
            pitchOrGateThresholdOrEchoIndexOrForwardOrder = this.filter.computeCoefficients(0, (float)indexOrGateCounterOrEchoDelayOrFilterEnvelopeValue / 65536.0f);
            volumeOrMuteFlagOrFeedbackOrder = this.filter.computeCoefficients(1, (float)indexOrGateCounterOrEchoDelayOrFilterEnvelopeValue / 65536.0f);
            if (sampleCount >= pitchOrGateThresholdOrEchoIndexOrForwardOrder + volumeOrMuteFlagOrFeedbackOrder) {
              modulationValueOrOscillatorOrSampleIndex = 0;
              amplitudeOrGateValueOrSampleOffsetOrFilterChunkEnd = volumeOrMuteFlagOrFeedbackOrder;
              if (amplitudeOrGateValueOrSampleOffsetOrFilterChunkEnd > sampleCount - pitchOrGateThresholdOrEchoIndexOrForwardOrder) {
                amplitudeOrGateValueOrSampleOffsetOrFilterChunkEnd = sampleCount - pitchOrGateThresholdOrEchoIndexOrForwardOrder;
              }
              while (modulationValueOrOscillatorOrSampleIndex < amplitudeOrGateValueOrSampleOffsetOrFilterChunkEnd) {
                unmuteEnvelopeValueOrFilteredSample = (int)((long)sampleBuffer[modulationValueOrOscillatorOrSampleIndex + pitchOrGateThresholdOrEchoIndexOrForwardOrder] * (long)SoundFilter.forwardMultiplierQ16 >> 16);
                for (filterCoefficientIndex = 0; filterCoefficientIndex < pitchOrGateThresholdOrEchoIndexOrForwardOrder; filterCoefficientIndex++) {
                  unmuteEnvelopeValueOrFilteredSample = unmuteEnvelopeValueOrFilteredSample + (int)((long)sampleBuffer[modulationValueOrOscillatorOrSampleIndex + pitchOrGateThresholdOrEchoIndexOrForwardOrder - 1 - filterCoefficientIndex] * (long)SoundFilter.coefficientsQ16[0][filterCoefficientIndex] >> 16);
                }
                for (filterCoefficientIndex = 0; filterCoefficientIndex < modulationValueOrOscillatorOrSampleIndex; filterCoefficientIndex++) {
                  unmuteEnvelopeValueOrFilteredSample = unmuteEnvelopeValueOrFilteredSample - (int)((long)sampleBuffer[modulationValueOrOscillatorOrSampleIndex - 1 - filterCoefficientIndex] * (long)SoundFilter.coefficientsQ16[1][filterCoefficientIndex] >> 16);
                }
                sampleBuffer[modulationValueOrOscillatorOrSampleIndex] = unmuteEnvelopeValueOrFilteredSample;
                indexOrGateCounterOrEchoDelayOrFilterEnvelopeValue = this.filterEnvelope.advance(sampleCount + 1);
                modulationValueOrOscillatorOrSampleIndex++;
              }
              amplitudeOrGateValueOrSampleOffsetOrFilterChunkEnd = 128;
              while (true) {
                if (amplitudeOrGateValueOrSampleOffsetOrFilterChunkEnd > sampleCount - pitchOrGateThresholdOrEchoIndexOrForwardOrder) {
                  amplitudeOrGateValueOrSampleOffsetOrFilterChunkEnd = sampleCount - pitchOrGateThresholdOrEchoIndexOrForwardOrder;
                }
                while (modulationValueOrOscillatorOrSampleIndex < amplitudeOrGateValueOrSampleOffsetOrFilterChunkEnd) {
                  unmuteEnvelopeValueOrFilteredSample = (int)((long)sampleBuffer[modulationValueOrOscillatorOrSampleIndex + pitchOrGateThresholdOrEchoIndexOrForwardOrder] * (long)SoundFilter.forwardMultiplierQ16 >> 16);
                  for (filterCoefficientIndex = 0; filterCoefficientIndex < pitchOrGateThresholdOrEchoIndexOrForwardOrder; filterCoefficientIndex++) {
                    unmuteEnvelopeValueOrFilteredSample = unmuteEnvelopeValueOrFilteredSample + (int)((long)sampleBuffer[modulationValueOrOscillatorOrSampleIndex + pitchOrGateThresholdOrEchoIndexOrForwardOrder - 1 - filterCoefficientIndex] * (long)SoundFilter.coefficientsQ16[0][filterCoefficientIndex] >> 16);
                  }
                  for (filterCoefficientIndex = 0; filterCoefficientIndex < volumeOrMuteFlagOrFeedbackOrder; filterCoefficientIndex++) {
                    unmuteEnvelopeValueOrFilteredSample = unmuteEnvelopeValueOrFilteredSample - (int)((long)sampleBuffer[modulationValueOrOscillatorOrSampleIndex - 1 - filterCoefficientIndex] * (long)SoundFilter.coefficientsQ16[1][filterCoefficientIndex] >> 16);
                  }
                  sampleBuffer[modulationValueOrOscillatorOrSampleIndex] = unmuteEnvelopeValueOrFilteredSample;
                  indexOrGateCounterOrEchoDelayOrFilterEnvelopeValue = this.filterEnvelope.advance(sampleCount + 1);
                  modulationValueOrOscillatorOrSampleIndex++;
                }
                if (modulationValueOrOscillatorOrSampleIndex < sampleCount - pitchOrGateThresholdOrEchoIndexOrForwardOrder) {
                  pitchOrGateThresholdOrEchoIndexOrForwardOrder = this.filter.computeCoefficients(0, (float)indexOrGateCounterOrEchoDelayOrFilterEnvelopeValue / 65536.0f);
                  volumeOrMuteFlagOrFeedbackOrder = this.filter.computeCoefficients(1, (float)indexOrGateCounterOrEchoDelayOrFilterEnvelopeValue / 65536.0f);
                  amplitudeOrGateValueOrSampleOffsetOrFilterChunkEnd += 128;
                  continue;
                }
                break;
              }
              while (modulationValueOrOscillatorOrSampleIndex < sampleCount) {
                unmuteEnvelopeValueOrFilteredSample = 0;
                for (filterCoefficientIndex = modulationValueOrOscillatorOrSampleIndex + pitchOrGateThresholdOrEchoIndexOrForwardOrder - sampleCount; filterCoefficientIndex < pitchOrGateThresholdOrEchoIndexOrForwardOrder; filterCoefficientIndex++) {
                  unmuteEnvelopeValueOrFilteredSample = unmuteEnvelopeValueOrFilteredSample + (int)((long)sampleBuffer[modulationValueOrOscillatorOrSampleIndex + pitchOrGateThresholdOrEchoIndexOrForwardOrder - 1 - filterCoefficientIndex] * (long)SoundFilter.coefficientsQ16[0][filterCoefficientIndex] >> 16);
                }
                for (filterCoefficientIndex = 0; filterCoefficientIndex < volumeOrMuteFlagOrFeedbackOrder; filterCoefficientIndex++) {
                  unmuteEnvelopeValueOrFilteredSample = unmuteEnvelopeValueOrFilteredSample - (int)((long)sampleBuffer[modulationValueOrOscillatorOrSampleIndex - 1 - filterCoefficientIndex] * (long)SoundFilter.coefficientsQ16[1][filterCoefficientIndex] >> 16);
                }
                sampleBuffer[modulationValueOrOscillatorOrSampleIndex] = unmuteEnvelopeValueOrFilteredSample;
                indexOrGateCounterOrEchoDelayOrFilterEnvelopeValue = this.filterEnvelope.advance(sampleCount + 1);
                modulationValueOrOscillatorOrSampleIndex++;
              }
            }
          }
        }
        for (indexOrGateCounterOrEchoDelayOrFilterEnvelopeValue = 0; indexOrGateCounterOrEchoDelayOrFilterEnvelopeValue < sampleCount; indexOrGateCounterOrEchoDelayOrFilterEnvelopeValue++) {
          if (sampleBuffer[indexOrGateCounterOrEchoDelayOrFilterEnvelopeValue] < -32768) {
            sampleBuffer[indexOrGateCounterOrEchoDelayOrFilterEnvelopeValue] = -32768;
          }
          if (sampleBuffer[indexOrGateCounterOrEchoDelayOrFilterEnvelopeValue] <= 32767) {
            continue;
          }
          sampleBuffer[indexOrGateCounterOrEchoDelayOrFilterEnvelopeValue] = 32767;
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
        noiseTable = new int[32768];
        Random seededNoiseRandom = new Random(0L);
        for (waveTableIndex = 0; waveTableIndex < 32768; waveTableIndex++) {
            noiseTable[waveTableIndex] = (seededNoiseRandom.nextInt() & 2) - 1;
        }
        sineTable = new int[32768];
        for (waveTableIndex = 0; waveTableIndex < 32768; waveTableIndex++) {
            sineTable[waveTableIndex] = (int)(Math.sin((double)waveTableIndex / 5215.1903) * 16384.0);
        }
        sampleBuffer = new int[220500];
        oscillatorBasePitchSteps = new int[5];
        oscillatorPhases = new int[5];
        oscillatorVolumeScales = new int[5];
        oscillatorDelaySamples = new int[5];
        oscillatorPitchSteps = new int[5];
    }
}
