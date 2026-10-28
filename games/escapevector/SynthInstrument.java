/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class SynthInstrument {
    private SoundEnvelope volumeModulationAmplitude;
    private SoundEnvelope volumeModulation;
    int offsetMillis;
    private SoundEnvelope pitchEnvelope;
    private SoundEnvelope filterEnvelope;
    private static int[] samples;
    private static int[] sineTable;
    private AudioFilter filter;
    private SoundEnvelope pitchModulationAmplitude;
    private SoundEnvelope releaseEnvelope;
    private SoundEnvelope attackEnvelope;
    private static int[] noiseTable;
    private int[] oscillatorPitch;
    private SoundEnvelope pitchModulation;
    private static int[] volumeScale;
    private static int[] pitchScale;
    int durationMillis;
    private static int[] oscillatorPhase;
    private int echoPercent;
    private static int[] pitchBase;
    private static int[] delaySamples;
    private SoundEnvelope volumeEnvelope;
    private int echoDelayMillis;
    private int[] oscillatorDelay;
    private int[] oscillatorVolume;

    private final int evaluateWave(int phase, int amplitude, int form) {
        if (form == 1) {
          if ((phase & 32767) < 16384) {
            return amplitude;
          }
          return -amplitude;
        }
        if (form == 2) {
          return sineTable[phase & 32767] * amplitude >> 14;
        }
        if (form == 3) {
          return ((phase & 32767) * amplitude >> 14) - amplitude;
        }
        if (form == 4) {
          return noiseTable[phase / 2607 & 32767] * amplitude;
        }
        return 0;
    }

    final void decode(PacketBuffer input) {
        this.pitchEnvelope = new SoundEnvelope();
        this.pitchEnvelope.decode(input);
        this.volumeEnvelope = new SoundEnvelope();
        this.volumeEnvelope.decode(input);
        int var2 = input.readUnsignedByte(0);
        if (var2 != 0) {
          input.position = input.position - 1;
          this.pitchModulation = new SoundEnvelope();
          this.pitchModulation.decode(input);
          this.pitchModulationAmplitude = new SoundEnvelope();
          this.pitchModulationAmplitude.decode(input);
        }
        var2 = input.readUnsignedByte(0);
        if (var2 != 0) {
          input.position = input.position - 1;
          this.volumeModulation = new SoundEnvelope();
          this.volumeModulation.decode(input);
          this.volumeModulationAmplitude = new SoundEnvelope();
          this.volumeModulationAmplitude.decode(input);
        }
        var2 = input.readUnsignedByte(0);
        if (var2 != 0) {
          input.position = input.position - 1;
          this.releaseEnvelope = new SoundEnvelope();
          this.releaseEnvelope.decode(input);
          this.attackEnvelope = new SoundEnvelope();
          this.attackEnvelope.decode(input);
        }
        for (int var3 = 0; var3 < 10; var3++) {
          int var4 = input.readUnsignedSmart(true);
          if (var4 == 0) {
            break;
          }
          this.oscillatorVolume[var3] = var4;
          this.oscillatorPitch[var3] = input.readSignedSmart((byte) 56);
          this.oscillatorDelay[var3] = input.readUnsignedSmart(true);
        }
        this.echoDelayMillis = input.readUnsignedSmart(true);
        this.echoPercent = input.readUnsignedSmart(true);
        this.durationMillis = input.readUnsignedShort(1952);
        this.offsetMillis = input.readUnsignedShort(1952);
        this.filter = new AudioFilter();
        this.filterEnvelope = new SoundEnvelope();
        this.filter.decode(input, this.filterEnvelope);
    }

    final int[] synthesize(int sampleCount, int durationMillis) {
        int var12Lifetime1Lifetime1;
        qg.a(samples, 0, sampleCount);
        if (durationMillis < 10) {
          return samples;
        }
        double var3 = (double)sampleCount / ((double)durationMillis + 0.0);
        this.pitchEnvelope.reset();
        this.volumeEnvelope.reset();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.pitchModulation != null) {
          this.pitchModulation.reset();
          this.pitchModulationAmplitude.reset();
          var5 = (int)((double)(this.pitchModulation.end - this.pitchModulation.start) * 32.768 / var3);
          var6 = (int)((double)this.pitchModulation.start * 32.768 / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.volumeModulation != null) {
          this.volumeModulation.reset();
          this.volumeModulationAmplitude.reset();
          var8 = (int)((double)(this.volumeModulation.end - this.volumeModulation.start) * 32.768 / var3);
          var9 = (int)((double)this.volumeModulation.start * 32.768 / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
          if (this.oscillatorVolume[var11] != 0) {
            oscillatorPhase[var11] = 0;
            delaySamples[var11] = (int)((double)this.oscillatorDelay[var11] * var3);
            volumeScale[var11] = (this.oscillatorVolume[var11] << 14) / 100;
            pitchScale[var11] = (int)((double)(this.pitchEnvelope.end - this.pitchEnvelope.start) * 32.768 * Math.pow(1.0057929410678534, (double)this.oscillatorPitch[var11]) / var3);
            pitchBase[var11] = (int)((double)this.pitchEnvelope.start * 32.768 / var3);
          }
        }
        for (int var11Lifetime1 = 0; var11Lifetime1 < sampleCount; var11Lifetime1++) {
          int var12 = this.pitchEnvelope.advance(sampleCount);
          int var13 = this.volumeEnvelope.advance(sampleCount);
          if (this.pitchModulation != null) {
            int var14 = this.pitchModulation.advance(sampleCount);
            int var15 = this.pitchModulationAmplitude.advance(sampleCount);
            var12 = var12 + (this.evaluateWave(var7, var15, this.pitchModulation.form) >> 1);
            var7 = var7 + ((var14 * var5 >> 16) + var6);
          }
          if (this.volumeModulation != null) {
            int var14Lifetime3 = this.volumeModulation.advance(sampleCount);
            int var15Lifetime3 = this.volumeModulationAmplitude.advance(sampleCount);
            var13 = var13 * ((this.evaluateWave(var10, var15Lifetime3, this.volumeModulation.form) >> 1) + 32768) >> 15;
            var10 = var10 + ((var14Lifetime3 * var8 >> 16) + var9);
          }
          for (int var14Lifetime4 = 0; var14Lifetime4 < 5; var14Lifetime4++) {
            if (this.oscillatorVolume[var14Lifetime4] != 0) {
              int var15Lifetime4 = var11Lifetime1 + delaySamples[var14Lifetime4];
              if (var15Lifetime4 < sampleCount) {
                samples[var15Lifetime4] = samples[var15Lifetime4] + this.evaluateWave(oscillatorPhase[var14Lifetime4], var13 * volumeScale[var14Lifetime4] >> 15, this.pitchEnvelope.form);
                oscillatorPhase[var14Lifetime4] = oscillatorPhase[var14Lifetime4] + ((var12 * pitchScale[var14Lifetime4] >> 16) + pitchBase[var14Lifetime4]);
              }
            }
          }
        }
        if (this.releaseEnvelope != null) {
          this.releaseEnvelope.reset();
          this.attackEnvelope.reset();
          int var11Lifetime2 = 0;
          int var12Lifetime1 = 0;
          boolean var13Lifetime1 = true;
          for (int var14Lifetime1 = 0; var14Lifetime1 < sampleCount; var14Lifetime1++) {
            int var15Lifetime1 = this.releaseEnvelope.advance(sampleCount);
            int var16 = this.attackEnvelope.advance(sampleCount);
            if (!var13Lifetime1) {
              var12Lifetime1Lifetime1 = this.releaseEnvelope.start + ((this.releaseEnvelope.end - this.releaseEnvelope.start) * var16 >> 8);
            } else {
              var12Lifetime1Lifetime1 = this.releaseEnvelope.start + ((this.releaseEnvelope.end - this.releaseEnvelope.start) * var15Lifetime1 >> 8);
            }
            var11Lifetime2 += 256;
            if (var11Lifetime2 >= var12Lifetime1Lifetime1) {
              var11Lifetime2 = 0;
              boolean stackIn_41_0 = !((var13Lifetime1));
              var13Lifetime1 = stackIn_41_0;
            }
            if (var13Lifetime1) {
              samples[var14Lifetime1] = 0;
            }
          }
        }
        if (this.echoDelayMillis > 0 &&
          this.echoPercent > 0) {
          int var11Lifetime3 = (int)((double)this.echoDelayMillis * var3);
          for (int var12Lifetime2 = var11Lifetime3; var12Lifetime2 < sampleCount; var12Lifetime2++) {
            samples[var12Lifetime2] = samples[var12Lifetime2] + samples[var12Lifetime2 - var11Lifetime3] * this.echoPercent / 100;
          }
        }
        if (!(this.filter.pairs[0] <= 0) ||
          !(this.filter.pairs[1] <= 0)) {
          this.filterEnvelope.reset();
          int var11Lifetime4 = this.filterEnvelope.advance(sampleCount + 1);
          int var12Lifetime3 = this.filter.computeCoefficients(0, (float)var11Lifetime4 / 65536.0f);
          int var13Lifetime2 = this.filter.computeCoefficients(1, (float)var11Lifetime4 / 65536.0f);
          if (sampleCount >= var12Lifetime3 + var13Lifetime2) {
            int var14Lifetime2 = 0;
            int var15Lifetime2 = var13Lifetime2;
            if (var15Lifetime2 > sampleCount - var12Lifetime3) {
              var15Lifetime2 = sampleCount - var12Lifetime3;
            }
            while (var14Lifetime2 < var15Lifetime2) {
              int var16Lifetime1 = (int)((long)samples[var14Lifetime2 + var12Lifetime3] * (long)AudioFilter.forwardMultiplierQ16 >> 16);
              for (int var17 = 0; var17 < var12Lifetime3; var17++) {
                var16Lifetime1 = var16Lifetime1 + (int)((long)samples[var14Lifetime2 + var12Lifetime3 - 1 - var17] * (long)AudioFilter.coefficientsQ16[0][var17] >> 16);
              }
              for (int var17Lifetime3 = 0; var17Lifetime3 < var14Lifetime2; var17Lifetime3++) {
                var16Lifetime1 = var16Lifetime1 - (int)((long)samples[var14Lifetime2 - 1 - var17Lifetime3] * (long)AudioFilter.coefficientsQ16[1][var17Lifetime3] >> 16);
              }
              samples[var14Lifetime2] = var16Lifetime1;
              var11Lifetime4 = this.filterEnvelope.advance(sampleCount + 1);
              var14Lifetime2++;
            }
            int var15Lifetime2Lifetime1 = 128;
            while (true) {
              if (var15Lifetime2Lifetime1 > sampleCount - var12Lifetime3) {
                var15Lifetime2Lifetime1 = sampleCount - var12Lifetime3;
              }
              while (var14Lifetime2 < var15Lifetime2Lifetime1) {
                int var16Lifetime1Lifetime1 = (int)((long)samples[var14Lifetime2 + var12Lifetime3] * (long)AudioFilter.forwardMultiplierQ16 >> 16);
                for (int var17Lifetime1 = 0; var17Lifetime1 < var12Lifetime3; var17Lifetime1++) {
                  var16Lifetime1Lifetime1 = var16Lifetime1Lifetime1 + (int)((long)samples[var14Lifetime2 + var12Lifetime3 - 1 - var17Lifetime1] * (long)AudioFilter.coefficientsQ16[0][var17Lifetime1] >> 16);
                }
                for (int var17Lifetime1Lifetime1 = 0; var17Lifetime1Lifetime1 < var13Lifetime2; var17Lifetime1Lifetime1++) {
                  var16Lifetime1Lifetime1 = var16Lifetime1Lifetime1 - (int)((long)samples[var14Lifetime2 - 1 - var17Lifetime1Lifetime1] * (long)AudioFilter.coefficientsQ16[1][var17Lifetime1Lifetime1] >> 16);
                }
                samples[var14Lifetime2] = var16Lifetime1Lifetime1;
                var11Lifetime4 = this.filterEnvelope.advance(sampleCount + 1);
                var14Lifetime2++;
              }
              if (var14Lifetime2 < sampleCount - var12Lifetime3) {
                var12Lifetime3 = this.filter.computeCoefficients(0, (float)var11Lifetime4 / 65536.0f);
                var13Lifetime2 = this.filter.computeCoefficients(1, (float)var11Lifetime4 / 65536.0f);
                var15Lifetime2Lifetime1 += 128;
                continue;
              }
              break;
            }
            while (var14Lifetime2 < sampleCount) {
              int var16Lifetime1Lifetime2 = 0;
              for (int var17Lifetime2 = var14Lifetime2 + var12Lifetime3 - sampleCount; var17Lifetime2 < var12Lifetime3; var17Lifetime2++) {
                var16Lifetime1Lifetime2 = var16Lifetime1Lifetime2 + (int)((long)samples[var14Lifetime2 + var12Lifetime3 - 1 - var17Lifetime2] * (long)AudioFilter.coefficientsQ16[0][var17Lifetime2] >> 16);
              }
              for (int var17Lifetime2Lifetime1 = 0; var17Lifetime2Lifetime1 < var13Lifetime2; var17Lifetime2Lifetime1++) {
                var16Lifetime1Lifetime2 = var16Lifetime1Lifetime2 - (int)((long)samples[var14Lifetime2 - 1 - var17Lifetime2Lifetime1] * (long)AudioFilter.coefficientsQ16[1][var17Lifetime2Lifetime1] >> 16);
              }
              samples[var14Lifetime2] = var16Lifetime1Lifetime2;
              var11Lifetime4 = this.filterEnvelope.advance(sampleCount + 1);
              var14Lifetime2++;
            }
          }
        }
        for (int var11Lifetime5 = 0; var11Lifetime5 < sampleCount; var11Lifetime5++) {
          if (samples[var11Lifetime5] < -32768) {
            samples[var11Lifetime5] = -32768;
          }
          if (samples[var11Lifetime5] > 32767) {
            samples[var11Lifetime5] = 32767;
          }
        }
        return samples;
    }

    public static void releaseStatics() {
        samples = null;
        noiseTable = null;
        sineTable = null;
        oscillatorPhase = null;
        delaySamples = null;
        volumeScale = null;
        pitchScale = null;
        pitchBase = null;
    }

    SynthInstrument() {
        this.offsetMillis = 0;
        this.durationMillis = 500;
        this.oscillatorPitch = new int[]{0, 0, 0, 0, 0};
        this.echoPercent = 100;
        this.echoDelayMillis = 0;
        this.oscillatorDelay = new int[]{0, 0, 0, 0, 0};
        this.oscillatorVolume = new int[]{0, 0, 0, 0, 0};
    }

    static {
        noiseTable = new int[32768];
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
          noiseTable[var1] = (var0.nextInt() & 2) - 1;
        }
        sineTable = new int[32768];
        for (int var1Lifetime1 = 0; var1Lifetime1 < 32768; var1Lifetime1++) {
          sineTable[var1Lifetime1] = (int)(Math.sin((double)var1Lifetime1 / 5215.1903) * 16384.0);
        }
        samples = new int[220500];
        volumeScale = new int[5];
        oscillatorPhase = new int[5];
        delaySamples = new int[5];
        pitchBase = new int[5];
        pitchScale = new int[5];
    }
}
