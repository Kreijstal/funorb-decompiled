/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class SynthesizerVoice {
    int durationMilliseconds;
    private SoundEnvelope gateClosedEnvelope;
    private SoundEnvelope pitchEnvelope;
    private SoundEnvelope volumeModulationEnvelope;
    private int[] oscillatorPitchOffsets;
    private int[] oscillatorVolumes;
    private SoundEnvelope pitchModulationEnvelope;
    private SoundFilter filter;
    private SoundEnvelope gateOpenEnvelope;
    private SoundEnvelope volumeModulationAmplitude;
    private int echoFeedbackPercent;
    private static int[] sineTable;
    private int echoDelayMilliseconds;
    int offsetMilliseconds;
    private int[] oscillatorDelays;
    private static int[] sampleScratch;
    private static int[] noiseTable;
    private SoundEnvelope filterEnvelope;
    private SoundEnvelope pitchModulationAmplitude;
    private SoundEnvelope amplitudeEnvelope;
    private static int[] oscillatorPitchSteps;
    private static int[] oscillatorBasePitchSteps;
    private static int[] oscillatorPhases;
    private static int[] oscillatorSampleDelays;
    private static int[] oscillatorAmplitudeScales;

    final int[] synthesize(int sampleCount, int durationMilliseconds) {
        int nextGateClosed = 0;
        double samplesPerMillisecond;
        int pitchModulationStep;
        int pitchModulationBaseStep;
        int pitchModulationPhase;
        int volumeModulationStep;
        int volumeModulationBaseStep;
        int volumeModulationPhase;
        int oscillatorIndex;
        int pitchLevel;
        int amplitudeLevel;
        int pitchModulationLevel;
        int pitchModulationDepth;
        int gateOpenLevel;
        int initialForwardCoefficientIndex;
        int sampleIndex;
        int gateCounter;
        int echoSampleDelay;
        int filterLevel;
        int clampSampleIndex;
        int initialGateThreshold;
        int echoSampleIndex;
        int forwardCoefficientCount;
        int gateClosed;
        int feedbackCoefficientCount;
        int gateSampleIndex;
        int filterSampleIndex;
        int gateClosedLevel;
        int initialFilterEnd;
        int initialFilteredSample;
        int volumeModulationLevel;
        int mixOscillatorIndex;
        int volumeModulationDepth;
        int delayedSampleIndex;
        int forwardCoefficientIndex;
        int tailForwardCoefficientIndex;
        int gateThreshold;
        int filterBlockEnd;
        int filteredSample;
        int tailFilteredSample;
        int initialFeedbackCoefficientIndex;
        int feedbackCoefficientIndex;
        int tailFeedbackCoefficientIndex;
        vm.a(sampleScratch, 0, sampleCount);
        if (durationMilliseconds < 10) {
          return sampleScratch;
        }
        samplesPerMillisecond = (double)sampleCount / ((double)durationMilliseconds + 0.0);
        this.pitchEnvelope.reset();
        this.amplitudeEnvelope.reset();
        pitchModulationStep = 0;
        pitchModulationBaseStep = 0;
        pitchModulationPhase = 0;
        if (this.pitchModulationEnvelope != null) {
          this.pitchModulationEnvelope.reset();
          this.pitchModulationAmplitude.reset();
          pitchModulationStep = (int)((double)(this.pitchModulationEnvelope.endValue - this.pitchModulationEnvelope.startValue) * 32.768 / samplesPerMillisecond);
          pitchModulationBaseStep = (int)((double)this.pitchModulationEnvelope.startValue * 32.768 / samplesPerMillisecond);
        }
        volumeModulationStep = 0;
        volumeModulationBaseStep = 0;
        volumeModulationPhase = 0;
        if (this.volumeModulationEnvelope != null) {
          this.volumeModulationEnvelope.reset();
          this.volumeModulationAmplitude.reset();
          volumeModulationStep = (int)((double)(this.volumeModulationEnvelope.endValue - this.volumeModulationEnvelope.startValue) * 32.768 / samplesPerMillisecond);
          volumeModulationBaseStep = (int)((double)this.volumeModulationEnvelope.startValue * 32.768 / samplesPerMillisecond);
        }
        for (oscillatorIndex = 0; oscillatorIndex < 5; oscillatorIndex++) {
          if (this.oscillatorVolumes[oscillatorIndex] != 0) {
            oscillatorPhases[oscillatorIndex] = 0;
            oscillatorSampleDelays[oscillatorIndex] = (int)((double)this.oscillatorDelays[oscillatorIndex] * samplesPerMillisecond);
            oscillatorAmplitudeScales[oscillatorIndex] = (this.oscillatorVolumes[oscillatorIndex] << 14) / 100;
            oscillatorPitchSteps[oscillatorIndex] = (int)((double)(this.pitchEnvelope.endValue - this.pitchEnvelope.startValue) * 32.768 * Math.pow(1.0057929410678534, (double)this.oscillatorPitchOffsets[oscillatorIndex]) / samplesPerMillisecond);
            oscillatorBasePitchSteps[oscillatorIndex] = (int)((double)this.pitchEnvelope.startValue * 32.768 / samplesPerMillisecond);
          }
        }
        for (sampleIndex = 0; sampleIndex < sampleCount; sampleIndex++) {
          pitchLevel = this.pitchEnvelope.step(sampleCount);
          amplitudeLevel = this.amplitudeEnvelope.step(sampleCount);
          if (this.pitchModulationEnvelope != null) {
            pitchModulationLevel = this.pitchModulationEnvelope.step(sampleCount);
            pitchModulationDepth = this.pitchModulationAmplitude.step(sampleCount);
            pitchLevel = pitchLevel + (this.evaluateWaveform(pitchModulationPhase, pitchModulationDepth, this.pitchModulationEnvelope.waveformType) >> 1);
            pitchModulationPhase = pitchModulationPhase + ((pitchModulationLevel * pitchModulationStep >> 16) + pitchModulationBaseStep);
          }
          if (this.volumeModulationEnvelope != null) {
            volumeModulationLevel = this.volumeModulationEnvelope.step(sampleCount);
            volumeModulationDepth = this.volumeModulationAmplitude.step(sampleCount);
            amplitudeLevel = amplitudeLevel * ((this.evaluateWaveform(volumeModulationPhase, volumeModulationDepth, this.volumeModulationEnvelope.waveformType) >> 1) + 32768) >> 15;
            volumeModulationPhase = volumeModulationPhase + ((volumeModulationLevel * volumeModulationStep >> 16) + volumeModulationBaseStep);
          }
          for (mixOscillatorIndex = 0; mixOscillatorIndex < 5; mixOscillatorIndex++) {
            if (this.oscillatorVolumes[mixOscillatorIndex] != 0) {
              delayedSampleIndex = sampleIndex + oscillatorSampleDelays[mixOscillatorIndex];
              if (delayedSampleIndex < sampleCount) {
                sampleScratch[delayedSampleIndex] = sampleScratch[delayedSampleIndex] + this.evaluateWaveform(oscillatorPhases[mixOscillatorIndex], amplitudeLevel * oscillatorAmplitudeScales[mixOscillatorIndex] >> 15, this.pitchEnvelope.waveformType);
                oscillatorPhases[mixOscillatorIndex] = oscillatorPhases[mixOscillatorIndex] + ((pitchLevel * oscillatorPitchSteps[mixOscillatorIndex] >> 16) + oscillatorBasePitchSteps[mixOscillatorIndex]);
              }
            }
          }
        }
        if (this.gateClosedEnvelope != null) {
          this.gateClosedEnvelope.reset();
          this.gateOpenEnvelope.reset();
          gateCounter = 0;
          initialGateThreshold = 0;
          gateClosed = 1;
          for (gateSampleIndex = 0; gateSampleIndex < sampleCount; gateSampleIndex++) {
            gateClosedLevel = this.gateClosedEnvelope.step(sampleCount);
            gateOpenLevel = this.gateOpenEnvelope.step(sampleCount);
            if (gateClosed == 0) {
              gateThreshold = this.gateClosedEnvelope.startValue + ((this.gateClosedEnvelope.endValue - this.gateClosedEnvelope.startValue) * gateOpenLevel >> 8);
            } else {
              gateThreshold = this.gateClosedEnvelope.startValue + ((this.gateClosedEnvelope.endValue - this.gateClosedEnvelope.startValue) * gateClosedLevel >> 8);
            }
            gateCounter += 256;
            if (gateCounter >= gateThreshold) {
              gateCounter = 0;
              nextGateClosed = (gateClosed != 0) ? 0 : 1;
              gateClosed = nextGateClosed;
            }
            if (gateClosed != 0) {
              sampleScratch[gateSampleIndex] = 0;
            }
          }
        }
        if (this.echoDelayMilliseconds > 0 &&
          this.echoFeedbackPercent > 0) {
          echoSampleDelay = (int)((double)this.echoDelayMilliseconds * samplesPerMillisecond);
          for (echoSampleIndex = echoSampleDelay; echoSampleIndex < sampleCount; echoSampleIndex++) {
            sampleScratch[echoSampleIndex] = sampleScratch[echoSampleIndex] + sampleScratch[echoSampleIndex - echoSampleDelay] * this.echoFeedbackPercent / 100;
          }
        }
        if (!(this.filter.pairCounts[0] <= 0) ||
          !(this.filter.pairCounts[1] <= 0)) {
          this.filterEnvelope.reset();
          filterLevel = this.filterEnvelope.step(sampleCount + 1);
          forwardCoefficientCount = this.filter.computeCoefficients(0, (float)filterLevel / 65536.0f);
          feedbackCoefficientCount = this.filter.computeCoefficients(1, (float)filterLevel / 65536.0f);
          if (sampleCount >= forwardCoefficientCount + feedbackCoefficientCount) {
            filterSampleIndex = 0;
            initialFilterEnd = feedbackCoefficientCount;
            if (initialFilterEnd > sampleCount - forwardCoefficientCount) {
              initialFilterEnd = sampleCount - forwardCoefficientCount;
            }
            while (filterSampleIndex < initialFilterEnd) {
              initialFilteredSample = (int)((long)sampleScratch[filterSampleIndex + forwardCoefficientCount] * (long)SoundFilter.forwardMultiplier >> 16);
              for (initialForwardCoefficientIndex = 0; initialForwardCoefficientIndex < forwardCoefficientCount; initialForwardCoefficientIndex++) {
                initialFilteredSample = initialFilteredSample + (int)((long)sampleScratch[filterSampleIndex + forwardCoefficientCount - 1 - initialForwardCoefficientIndex] * (long)SoundFilter.coefficients[0][initialForwardCoefficientIndex] >> 16);
              }
              for (initialFeedbackCoefficientIndex = 0; initialFeedbackCoefficientIndex < filterSampleIndex; initialFeedbackCoefficientIndex++) {
                initialFilteredSample = initialFilteredSample - (int)((long)sampleScratch[filterSampleIndex - 1 - initialFeedbackCoefficientIndex] * (long)SoundFilter.coefficients[1][initialFeedbackCoefficientIndex] >> 16);
              }
              sampleScratch[filterSampleIndex] = initialFilteredSample;
              filterLevel = this.filterEnvelope.step(sampleCount + 1);
              filterSampleIndex++;
            }
            filterBlockEnd = 128;
            while (true) {
              if (filterBlockEnd > sampleCount - forwardCoefficientCount) {
                filterBlockEnd = sampleCount - forwardCoefficientCount;
              }
              while (filterSampleIndex < filterBlockEnd) {
                filteredSample = (int)((long)sampleScratch[filterSampleIndex + forwardCoefficientCount] * (long)SoundFilter.forwardMultiplier >> 16);
                for (forwardCoefficientIndex = 0; forwardCoefficientIndex < forwardCoefficientCount; forwardCoefficientIndex++) {
                  filteredSample = filteredSample + (int)((long)sampleScratch[filterSampleIndex + forwardCoefficientCount - 1 - forwardCoefficientIndex] * (long)SoundFilter.coefficients[0][forwardCoefficientIndex] >> 16);
                }
                for (feedbackCoefficientIndex = 0; feedbackCoefficientIndex < feedbackCoefficientCount; feedbackCoefficientIndex++) {
                  filteredSample = filteredSample - (int)((long)sampleScratch[filterSampleIndex - 1 - feedbackCoefficientIndex] * (long)SoundFilter.coefficients[1][feedbackCoefficientIndex] >> 16);
                }
                sampleScratch[filterSampleIndex] = filteredSample;
                filterLevel = this.filterEnvelope.step(sampleCount + 1);
                filterSampleIndex++;
              }
              if (filterSampleIndex < sampleCount - forwardCoefficientCount) {
                forwardCoefficientCount = this.filter.computeCoefficients(0, (float)filterLevel / 65536.0f);
                feedbackCoefficientCount = this.filter.computeCoefficients(1, (float)filterLevel / 65536.0f);
                filterBlockEnd += 128;
                continue;
              }
              break;
            }
            while (filterSampleIndex < sampleCount) {
              tailFilteredSample = 0;
              for (tailForwardCoefficientIndex = filterSampleIndex + forwardCoefficientCount - sampleCount; tailForwardCoefficientIndex < forwardCoefficientCount; tailForwardCoefficientIndex++) {
                tailFilteredSample = tailFilteredSample + (int)((long)sampleScratch[filterSampleIndex + forwardCoefficientCount - 1 - tailForwardCoefficientIndex] * (long)SoundFilter.coefficients[0][tailForwardCoefficientIndex] >> 16);
              }
              for (tailFeedbackCoefficientIndex = 0; tailFeedbackCoefficientIndex < feedbackCoefficientCount; tailFeedbackCoefficientIndex++) {
                tailFilteredSample = tailFilteredSample - (int)((long)sampleScratch[filterSampleIndex - 1 - tailFeedbackCoefficientIndex] * (long)SoundFilter.coefficients[1][tailFeedbackCoefficientIndex] >> 16);
              }
              sampleScratch[filterSampleIndex] = tailFilteredSample;
              filterLevel = this.filterEnvelope.step(sampleCount + 1);
              filterSampleIndex++;
            }
          }
        }
        for (clampSampleIndex = 0; clampSampleIndex < sampleCount; clampSampleIndex++) {
          if (sampleScratch[clampSampleIndex] < -32768) {
            sampleScratch[clampSampleIndex] = -32768;
          }
          if (sampleScratch[clampSampleIndex] > 32767) {
            sampleScratch[clampSampleIndex] = 32767;
          }
        }
        return sampleScratch;
    }

    private final int evaluateWaveform(int phase, int amplitude, int waveformType) {
        if (waveformType == 1) {
          if ((phase & 32767) < 16384) {
            return amplitude;
          }
          return -amplitude;
        }
        if (waveformType == 2) {
          return sineTable[phase & 32767] * amplitude >> 14;
        }
        if (waveformType == 3) {
          return ((phase & 32767) * amplitude >> 14) - amplitude;
        }
        if (waveformType == 4) {
          return noiseTable[phase / 2607 & 32767] * amplitude;
        }
        return 0;
    }

    final void decode(PacketBuffer buffer) {
        int oscillatorIndex = 0;
        int oscillatorVolume = 0;
        this.pitchEnvelope = new SoundEnvelope();
        this.pitchEnvelope.decode(buffer);
        this.amplitudeEnvelope = new SoundEnvelope();
        this.amplitudeEnvelope.decode(buffer);
        int envelopeMarker = buffer.readUnsignedByte(0);
        if (envelopeMarker != 0) {
          buffer.position = buffer.position - 1;
          this.pitchModulationEnvelope = new SoundEnvelope();
          this.pitchModulationEnvelope.decode(buffer);
          this.pitchModulationAmplitude = new SoundEnvelope();
          this.pitchModulationAmplitude.decode(buffer);
        }
        envelopeMarker = buffer.readUnsignedByte(0);
        if (envelopeMarker != 0) {
          buffer.position = buffer.position - 1;
          this.volumeModulationEnvelope = new SoundEnvelope();
          this.volumeModulationEnvelope.decode(buffer);
          this.volumeModulationAmplitude = new SoundEnvelope();
          this.volumeModulationAmplitude.decode(buffer);
        }
        envelopeMarker = buffer.readUnsignedByte(0);
        if (envelopeMarker != 0) {
          buffer.position = buffer.position - 1;
          this.gateClosedEnvelope = new SoundEnvelope();
          this.gateClosedEnvelope.decode(buffer);
          this.gateOpenEnvelope = new SoundEnvelope();
          this.gateOpenEnvelope.decode(buffer);
        }
        for (oscillatorIndex = 0; oscillatorIndex < 10; oscillatorIndex++) {
          oscillatorVolume = buffer.readUnsignedSmart(-23470);
          if (oscillatorVolume == 0) {
            break;
          }
          this.oscillatorVolumes[oscillatorIndex] = oscillatorVolume;
          this.oscillatorPitchOffsets[oscillatorIndex] = buffer.readSignedSmart(112);
          this.oscillatorDelays[oscillatorIndex] = buffer.readUnsignedSmart(-23470);
        }
        this.echoDelayMilliseconds = buffer.readUnsignedSmart(-23470);
        this.echoFeedbackPercent = buffer.readUnsignedSmart(-23470);
        this.durationMilliseconds = buffer.readUnsignedShort((byte) -104);
        this.offsetMilliseconds = buffer.readUnsignedShort((byte) -104);
        this.filter = new SoundFilter();
        this.filterEnvelope = new SoundEnvelope();
        this.filter.decode(buffer, this.filterEnvelope);
    }

    public static void releaseScratch() {
        sampleScratch = null;
        noiseTable = null;
        sineTable = null;
        oscillatorPhases = null;
        oscillatorSampleDelays = null;
        oscillatorAmplitudeScales = null;
        oscillatorPitchSteps = null;
        oscillatorBasePitchSteps = null;
    }

    SynthesizerVoice() {
        this.oscillatorPitchOffsets = new int[]{0, 0, 0, 0, 0};
        this.echoFeedbackPercent = 100;
        this.echoDelayMilliseconds = 0;
        this.offsetMilliseconds = 0;
        this.oscillatorVolumes = new int[]{0, 0, 0, 0, 0};
        this.durationMilliseconds = 500;
        this.oscillatorDelays = new int[]{0, 0, 0, 0, 0};
    }

    static {
        int noiseIndex = 0;
        int sineIndex;
        noiseTable = new int[32768];
        Random noiseRandom = new Random(0L);
        for (noiseIndex = 0; noiseIndex < 32768; noiseIndex++) {
          noiseTable[noiseIndex] = (noiseRandom.nextInt() & 2) - 1;
        }
        sineTable = new int[32768];
        for (sineIndex = 0; sineIndex < 32768; sineIndex++) {
          sineTable[sineIndex] = (int)(Math.sin((double)sineIndex / 5215.1903) * 16384.0);
        }
        sampleScratch = new int[220500];
        oscillatorPitchSteps = new int[5];
        oscillatorPhases = new int[5];
        oscillatorBasePitchSteps = new int[5];
        oscillatorSampleDelays = new int[5];
        oscillatorAmplitudeScales = new int[5];
    }
}
