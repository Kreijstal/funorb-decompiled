/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class SoundTone {
    private int echoDelayMillis;
    private SoundEnvelope volumeModulation;
    private static int[] noiseTable;
    private SoundEnvelope pitchModulationAmplitude;
    private int echoDecayPercent;
    private SoundEnvelope volumeModulationAmplitude;
    private static int[] sampleScratch;
    private SoundEnvelope pitchEnvelope;
    private SoundEnvelope filterEnvelope;
    private int[] oscillatorPitch;
    private SoundEnvelope gateClosedEnvelope;
    private AudioFilter filter;
    private int[] oscillatorDelayMillis;
    private SoundEnvelope volumeEnvelope;
    int offsetMillis;
    private int[] oscillatorVolumePercent;
    int durationMillis;
    private SoundEnvelope gateOpenEnvelope;
    private SoundEnvelope pitchModulation;
    private static int[] sineTable;
    private static int[] oscillatorPitchSteps;
    private static int[] oscillatorBaseSteps;
    private static int[] oscillatorGainQ14;
    private static int[] oscillatorPhases;
    private static int[] oscillatorDelaySamples;

    public static void releaseScratch() {
        sampleScratch = null;
        noiseTable = null;
        sineTable = null;
        oscillatorPhases = null;
        oscillatorDelaySamples = null;
        oscillatorGainQ14 = null;
        oscillatorPitchSteps = null;
        oscillatorBaseSteps = null;
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

    final int[] synthesize(int sampleCount, int durationMillis) {
        int nextGateClosed = 0;
        double samplesPerMillisecond;
        int pitchModulationStep;
        int pitchModulationBase;
        int pitchModulationPhase;
        int volumeModulationStep;
        int volumeModulationBase;
        int volumeModulationPhase;
        int setupOscillator;
        int pitchValue;
        int volumeValue;
        int pitchModulationValue;
        int pitchModulationDepth;
        int gateOpenValue;
        int startupForwardIndex;
        int oscillatorSample;
        int gateProgress;
        int echoDelaySamples;
        int filterValue;
        int clampSample;
        int unusedGateValue;
        int echoSample;
        int forwardCoefficientCount;
        int gateClosed;
        int feedbackCoefficientCount;
        int gateSample;
        int filterSample;
        int gateClosedValue;
        int startupEndSample;
        int startupFilteredSample;
        int unusedSampleIndex;
        int oscillatorIndex;
        int volumeModulationDepth;
        int delayedSample;
        int forwardIndex;
        int tailForwardIndex;
        int gateThreshold;
        int filterBlockEnd;
        int filteredSample;
        int tailFilteredSample;
        int startupFeedbackIndex;
        int feedbackIndex;
        int tailFeedbackIndex;
        ArrayOperations.clearInts(sampleScratch, 0, sampleCount);
        if (durationMillis < 10) {
          return sampleScratch;
        }
        samplesPerMillisecond = (double)sampleCount / ((double)durationMillis + 0.0);
        this.pitchEnvelope.reset();
        this.volumeEnvelope.reset();
        pitchModulationStep = 0;
        pitchModulationBase = 0;
        pitchModulationPhase = 0;
        if (this.pitchModulation != null) {
          this.pitchModulation.reset();
          this.pitchModulationAmplitude.reset();
          pitchModulationStep = (int)((double)(this.pitchModulation.end - this.pitchModulation.start) * 32.768 / samplesPerMillisecond);
          pitchModulationBase = (int)((double)this.pitchModulation.start * 32.768 / samplesPerMillisecond);
        }
        volumeModulationStep = 0;
        volumeModulationBase = 0;
        volumeModulationPhase = 0;
        if (this.volumeModulation != null) {
          this.volumeModulation.reset();
          this.volumeModulationAmplitude.reset();
          volumeModulationStep = (int)((double)(this.volumeModulation.end - this.volumeModulation.start) * 32.768 / samplesPerMillisecond);
          volumeModulationBase = (int)((double)this.volumeModulation.start * 32.768 / samplesPerMillisecond);
        }
        for (setupOscillator = 0; setupOscillator < 5; setupOscillator++) {
          if (this.oscillatorVolumePercent[setupOscillator] != 0) {
            oscillatorPhases[setupOscillator] = 0;
            oscillatorDelaySamples[setupOscillator] = (int)((double)this.oscillatorDelayMillis[setupOscillator] * samplesPerMillisecond);
            oscillatorGainQ14[setupOscillator] = (this.oscillatorVolumePercent[setupOscillator] << 14) / 100;
            oscillatorPitchSteps[setupOscillator] = (int)((double)(this.pitchEnvelope.end - this.pitchEnvelope.start) * 32.768 * Math.pow(1.0057929410678534, (double)this.oscillatorPitch[setupOscillator]) / samplesPerMillisecond);
            oscillatorBaseSteps[setupOscillator] = (int)((double)this.pitchEnvelope.start * 32.768 / samplesPerMillisecond);
          }
        }
        for (oscillatorSample = 0; oscillatorSample < sampleCount; oscillatorSample++) {
          pitchValue = this.pitchEnvelope.nextValue(sampleCount);
          volumeValue = this.volumeEnvelope.nextValue(sampleCount);
          if (this.pitchModulation != null) {
            pitchModulationValue = this.pitchModulation.nextValue(sampleCount);
            pitchModulationDepth = this.pitchModulationAmplitude.nextValue(sampleCount);
            pitchValue = pitchValue + (this.evaluateWaveform(pitchModulationPhase, pitchModulationDepth, this.pitchModulation.waveform) >> 1);
            pitchModulationPhase = pitchModulationPhase + ((pitchModulationValue * pitchModulationStep >> 16) + pitchModulationBase);
          }
          if (this.volumeModulation != null) {
            unusedSampleIndex = this.volumeModulation.nextValue(sampleCount);
            volumeModulationDepth = this.volumeModulationAmplitude.nextValue(sampleCount);
            volumeValue = volumeValue * ((this.evaluateWaveform(volumeModulationPhase, volumeModulationDepth, this.volumeModulation.waveform) >> 1) + 32768) >> 15;
            volumeModulationPhase = volumeModulationPhase + ((unusedSampleIndex * volumeModulationStep >> 16) + volumeModulationBase);
          }
          for (oscillatorIndex = 0; oscillatorIndex < 5; oscillatorIndex++) {
            if (this.oscillatorVolumePercent[oscillatorIndex] != 0) {
              delayedSample = oscillatorSample + oscillatorDelaySamples[oscillatorIndex];
              if (delayedSample < sampleCount) {
                sampleScratch[delayedSample] = sampleScratch[delayedSample] + this.evaluateWaveform(oscillatorPhases[oscillatorIndex], volumeValue * oscillatorGainQ14[oscillatorIndex] >> 15, this.pitchEnvelope.waveform);
                oscillatorPhases[oscillatorIndex] = oscillatorPhases[oscillatorIndex] + ((pitchValue * oscillatorPitchSteps[oscillatorIndex] >> 16) + oscillatorBaseSteps[oscillatorIndex]);
              }
            }
          }
        }
        if (this.gateClosedEnvelope != null) {
          this.gateClosedEnvelope.reset();
          this.gateOpenEnvelope.reset();
          gateProgress = 0;
          unusedGateValue = 0;
          gateClosed = 1;
          for (gateSample = 0; gateSample < sampleCount; gateSample++) {
            gateClosedValue = this.gateClosedEnvelope.nextValue(sampleCount);
            gateOpenValue = this.gateOpenEnvelope.nextValue(sampleCount);
            if (gateClosed == 0) {
              gateThreshold = this.gateClosedEnvelope.start + ((this.gateClosedEnvelope.end - this.gateClosedEnvelope.start) * gateOpenValue >> 8);
            } else {
              gateThreshold = this.gateClosedEnvelope.start + ((this.gateClosedEnvelope.end - this.gateClosedEnvelope.start) * gateClosedValue >> 8);
            }
            gateProgress += 256;
            if (gateProgress >= gateThreshold) {
              gateProgress = 0;
              nextGateClosed = (gateClosed != 0) ? 0 : 1;
              gateClosed = nextGateClosed;
            }
            if (gateClosed != 0) {
              sampleScratch[gateSample] = 0;
            }
          }
        }
        if (this.echoDelayMillis > 0 &&
          this.echoDecayPercent > 0) {
          echoDelaySamples = (int)((double)this.echoDelayMillis * samplesPerMillisecond);
          for (echoSample = echoDelaySamples; echoSample < sampleCount; echoSample++) {
            sampleScratch[echoSample] = sampleScratch[echoSample] + sampleScratch[echoSample - echoDelaySamples] * this.echoDecayPercent / 100;
          }
        }
        if (!(this.filter.pairCounts[0] <= 0) ||
          !(this.filter.pairCounts[1] <= 0)) {
          this.filterEnvelope.reset();
          filterValue = this.filterEnvelope.nextValue(sampleCount + 1);
          forwardCoefficientCount = this.filter.computeCoefficients(0, (float)filterValue / 65536.0f);
          feedbackCoefficientCount = this.filter.computeCoefficients(1, (float)filterValue / 65536.0f);
          if (sampleCount >= forwardCoefficientCount + feedbackCoefficientCount) {
            filterSample = 0;
            startupEndSample = feedbackCoefficientCount;
            if (startupEndSample > sampleCount - forwardCoefficientCount) {
              startupEndSample = sampleCount - forwardCoefficientCount;
            }
            while (filterSample < startupEndSample) {
              startupFilteredSample = (int)((long)sampleScratch[filterSample + forwardCoefficientCount] * (long)AudioFilter.forwardGainQ16 >> 16);
              for (startupForwardIndex = 0; startupForwardIndex < forwardCoefficientCount; startupForwardIndex++) {
                startupFilteredSample = startupFilteredSample + (int)((long)sampleScratch[filterSample + forwardCoefficientCount - 1 - startupForwardIndex] * (long)AudioFilter.coefficientsQ16[0][startupForwardIndex] >> 16);
              }
              for (startupFeedbackIndex = 0; startupFeedbackIndex < filterSample; startupFeedbackIndex++) {
                startupFilteredSample = startupFilteredSample - (int)((long)sampleScratch[filterSample - 1 - startupFeedbackIndex] * (long)AudioFilter.coefficientsQ16[1][startupFeedbackIndex] >> 16);
              }
              sampleScratch[filterSample] = startupFilteredSample;
              filterValue = this.filterEnvelope.nextValue(sampleCount + 1);
              filterSample++;
            }
            filterBlockEnd = 128;
            while (true) {
              if (filterBlockEnd > sampleCount - forwardCoefficientCount) {
                filterBlockEnd = sampleCount - forwardCoefficientCount;
              }
              while (filterSample < filterBlockEnd) {
                filteredSample = (int)((long)sampleScratch[filterSample + forwardCoefficientCount] * (long)AudioFilter.forwardGainQ16 >> 16);
                for (forwardIndex = 0; forwardIndex < forwardCoefficientCount; forwardIndex++) {
                  filteredSample = filteredSample + (int)((long)sampleScratch[filterSample + forwardCoefficientCount - 1 - forwardIndex] * (long)AudioFilter.coefficientsQ16[0][forwardIndex] >> 16);
                }
                for (feedbackIndex = 0; feedbackIndex < feedbackCoefficientCount; feedbackIndex++) {
                  filteredSample = filteredSample - (int)((long)sampleScratch[filterSample - 1 - feedbackIndex] * (long)AudioFilter.coefficientsQ16[1][feedbackIndex] >> 16);
                }
                sampleScratch[filterSample] = filteredSample;
                filterValue = this.filterEnvelope.nextValue(sampleCount + 1);
                filterSample++;
              }
              if (filterSample < sampleCount - forwardCoefficientCount) {
                forwardCoefficientCount = this.filter.computeCoefficients(0, (float)filterValue / 65536.0f);
                feedbackCoefficientCount = this.filter.computeCoefficients(1, (float)filterValue / 65536.0f);
                filterBlockEnd += 128;
                continue;
              }
              break;
            }
            while (filterSample < sampleCount) {
              tailFilteredSample = 0;
              for (tailForwardIndex = filterSample + forwardCoefficientCount - sampleCount; tailForwardIndex < forwardCoefficientCount; tailForwardIndex++) {
                tailFilteredSample = tailFilteredSample + (int)((long)sampleScratch[filterSample + forwardCoefficientCount - 1 - tailForwardIndex] * (long)AudioFilter.coefficientsQ16[0][tailForwardIndex] >> 16);
              }
              for (tailFeedbackIndex = 0; tailFeedbackIndex < feedbackCoefficientCount; tailFeedbackIndex++) {
                tailFilteredSample = tailFilteredSample - (int)((long)sampleScratch[filterSample - 1 - tailFeedbackIndex] * (long)AudioFilter.coefficientsQ16[1][tailFeedbackIndex] >> 16);
              }
              sampleScratch[filterSample] = tailFilteredSample;
              filterValue = this.filterEnvelope.nextValue(sampleCount + 1);
              filterSample++;
            }
          }
        }
        for (clampSample = 0; clampSample < sampleCount; clampSample++) {
          if (sampleScratch[clampSample] < -32768) {
            sampleScratch[clampSample] = -32768;
          }
          if (sampleScratch[clampSample] > 32767) {
            sampleScratch[clampSample] = 32767;
          }
        }
        return sampleScratch;
    }

    final void decode(PacketBuffer packet) {
        int oscillatorIndex = 0;
        int volumePercent = 0;
        this.pitchEnvelope = new SoundEnvelope();
        this.pitchEnvelope.decode(packet);
        this.volumeEnvelope = new SoundEnvelope();
        this.volumeEnvelope.decode(packet);
        int optionalWaveform = packet.readUnsignedByte(255);
        if (optionalWaveform != 0) {
          packet.position = packet.position - 1;
          this.pitchModulation = new SoundEnvelope();
          this.pitchModulation.decode(packet);
          this.pitchModulationAmplitude = new SoundEnvelope();
          this.pitchModulationAmplitude.decode(packet);
        }
        optionalWaveform = packet.readUnsignedByte(255);
        if (optionalWaveform != 0) {
          packet.position = packet.position - 1;
          this.volumeModulation = new SoundEnvelope();
          this.volumeModulation.decode(packet);
          this.volumeModulationAmplitude = new SoundEnvelope();
          this.volumeModulationAmplitude.decode(packet);
        }
        optionalWaveform = packet.readUnsignedByte(255);
        if (optionalWaveform != 0) {
          packet.position = packet.position - 1;
          this.gateClosedEnvelope = new SoundEnvelope();
          this.gateClosedEnvelope.decode(packet);
          this.gateOpenEnvelope = new SoundEnvelope();
          this.gateOpenEnvelope.decode(packet);
        }
        for (oscillatorIndex = 0; oscillatorIndex < 10; oscillatorIndex++) {
          volumePercent = packet.readUnsignedSmart(-32768);
          if (volumePercent == 0) {
            break;
          }
          this.oscillatorVolumePercent[oscillatorIndex] = volumePercent;
          this.oscillatorPitch[oscillatorIndex] = packet.readSignedSmart(-1342);
          this.oscillatorDelayMillis[oscillatorIndex] = packet.readUnsignedSmart(-32768);
        }
        this.echoDelayMillis = packet.readUnsignedSmart(-32768);
        this.echoDecayPercent = packet.readUnsignedSmart(-32768);
        this.durationMillis = packet.readUnsignedShort(65280);
        this.offsetMillis = packet.readUnsignedShort(65280);
        this.filter = new AudioFilter();
        this.filterEnvelope = new SoundEnvelope();
        this.filter.decode(packet, this.filterEnvelope);
    }

    SoundTone() {
        this.echoDelayMillis = 0;
        this.echoDecayPercent = 100;
        this.oscillatorPitch = new int[]{0, 0, 0, 0, 0};
        this.oscillatorDelayMillis = new int[]{0, 0, 0, 0, 0};
        this.oscillatorVolumePercent = new int[]{0, 0, 0, 0, 0};
        this.durationMillis = 500;
        this.offsetMillis = 0;
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
        oscillatorDelaySamples = new int[5];
        oscillatorBaseSteps = new int[5];
        oscillatorGainQ14 = new int[5];
    }
}
