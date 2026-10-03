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
        int var3 = 0;
        int var4 = 0;
        this.pitchEnvelope = new SoundEnvelope();
        this.pitchEnvelope.a(buffer);
        this.volumeEnvelope = new SoundEnvelope();
        this.volumeEnvelope.a(buffer);
        int var2 = buffer.readUnsignedByte((byte) 34);
        if (var2 != 0) {
            buffer.position = buffer.position - 1;
            this.pitchModulationEnvelope = new SoundEnvelope();
            this.pitchModulationEnvelope.a(buffer);
            this.pitchModulationAmplitudeEnvelope = new SoundEnvelope();
            this.pitchModulationAmplitudeEnvelope.a(buffer);
        }
        var2 = buffer.readUnsignedByte((byte) 34);
        if (var2 != 0) {
            buffer.position = buffer.position - 1;
            this.volumeModulationEnvelope = new SoundEnvelope();
            this.volumeModulationEnvelope.a(buffer);
            this.volumeModulationAmplitudeEnvelope = new SoundEnvelope();
            this.volumeModulationAmplitudeEnvelope.a(buffer);
        }
        var2 = buffer.readUnsignedByte((byte) 34);
        if (var2 != 0) {
            buffer.position = buffer.position - 1;
            this.muteTimingEnvelope = new SoundEnvelope();
            this.muteTimingEnvelope.a(buffer);
            this.unmuteTimingEnvelope = new SoundEnvelope();
            this.unmuteTimingEnvelope.a(buffer);
        }
        for (var3 = 0; var3 < 10; var3++) {
            var4 = buffer.readUnsignedSmart(1);
            if (var4 == 0) {
                break;
            }
            this.oscillatorVolumePercent[var3] = var4;
            this.oscillatorPitchOffsets[var3] = buffer.readSignedSmart(-125);
            this.oscillatorDelaysMillis[var3] = buffer.readUnsignedSmart(1);
        }
        this.echoDelayMillis = buffer.readUnsignedSmart(1);
        this.echoDecayPercent = buffer.readUnsignedSmart(1);
        this.durationMillis = buffer.readUnsignedShortBE(true);
        this.startDelayMillis = buffer.readUnsignedShortBE(true);
        this.filter = new SoundFilter();
        this.filterEnvelope = new SoundEnvelope();
        this.filter.a(buffer, this.filterEnvelope);
    }

    final int[] synthesize(int sampleCount, int durationMillis) {
        int stackIn_36_0 = 0;
        double var3;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        ArrayOperations.clearInts(sampleBuffer, 0, sampleCount);
        if (durationMillis < 10) {
          return sampleBuffer;
        }
        var3 = (double)sampleCount / ((double)durationMillis + 0.0);
        this.pitchEnvelope.a();
        this.volumeEnvelope.a();
        var5 = 0;
        var6 = 0;
        var7 = 0;
        if (this.pitchModulationEnvelope != null) {
          this.pitchModulationEnvelope.a();
          this.pitchModulationAmplitudeEnvelope.a();
          var5 = (int)((double)(this.pitchModulationEnvelope.field_g - this.pitchModulationEnvelope.field_j) * 32.768 / var3);
          var6 = (int)((double)this.pitchModulationEnvelope.field_j * 32.768 / var3);
        }
        var8 = 0;
        var9 = 0;
        var10 = 0;
        if (this.volumeModulationEnvelope != null) {
          this.volumeModulationEnvelope.a();
          this.volumeModulationAmplitudeEnvelope.a();
          var8 = (int)((double)(this.volumeModulationEnvelope.field_g - this.volumeModulationEnvelope.field_j) * 32.768 / var3);
          var9 = (int)((double)this.volumeModulationEnvelope.field_j * 32.768 / var3);
        }
        for (var11 = 0; var11 < 5; var11++) {
          if (this.oscillatorVolumePercent[var11] == 0) {
            continue;
          }
          oscillatorPhases[var11] = 0;
          oscillatorDelaySamples[var11] = (int)((double)this.oscillatorDelaysMillis[var11] * var3);
          oscillatorVolumeScales[var11] = (this.oscillatorVolumePercent[var11] << 14) / 100;
          oscillatorPitchSteps[var11] = (int)((double)(this.pitchEnvelope.field_g - this.pitchEnvelope.field_j) * 32.768 * Math.pow(1.0057929410678534, (double)this.oscillatorPitchOffsets[var11]) / var3);
          oscillatorBasePitchSteps[var11] = (int)((double)this.pitchEnvelope.field_j * 32.768 / var3);
        }
        for (var11 = 0; var11 < sampleCount; var11++) {
          var12 = this.pitchEnvelope.a(sampleCount);
          var13 = this.volumeEnvelope.a(sampleCount);
          if (this.pitchModulationEnvelope != null) {
            var14 = this.pitchModulationEnvelope.a(sampleCount);
            var15 = this.pitchModulationAmplitudeEnvelope.a(sampleCount);
            var12 = var12 + (this.evaluateWaveform(var7, var15, this.pitchModulationEnvelope.field_e) >> 1);
            var7 = var7 + ((var14 * var5 >> 16) + var6);
          }
          if (this.volumeModulationEnvelope != null) {
            var14 = this.volumeModulationEnvelope.a(sampleCount);
            var15 = this.volumeModulationAmplitudeEnvelope.a(sampleCount);
            var13 = var13 * ((this.evaluateWaveform(var10, var15, this.volumeModulationEnvelope.field_e) >> 1) + 32768) >> 15;
            var10 = var10 + ((var14 * var8 >> 16) + var9);
          }
          for (var14 = 0; var14 < 5; var14++) {
            if (this.oscillatorVolumePercent[var14] == 0) {
              continue;
            }
            var15 = var11 + oscillatorDelaySamples[var14];
            if (var15 >= sampleCount) {
              continue;
            }
            sampleBuffer[var15] = sampleBuffer[var15] + this.evaluateWaveform(oscillatorPhases[var14], var13 * oscillatorVolumeScales[var14] >> 15, this.pitchEnvelope.field_e);
            oscillatorPhases[var14] = oscillatorPhases[var14] + ((var12 * oscillatorPitchSteps[var14] >> 16) + oscillatorBasePitchSteps[var14]);
          }
        }
        if (this.muteTimingEnvelope != null) {
          this.muteTimingEnvelope.a();
          this.unmuteTimingEnvelope.a();
          var11 = 0;
          var12 = 0;
          var13 = 1;
          for (var14 = 0; var14 < sampleCount; var14++) {
            var15 = this.muteTimingEnvelope.a(sampleCount);
            var16 = this.unmuteTimingEnvelope.a(sampleCount);
            if (var13 == 0) {
              var12 = this.muteTimingEnvelope.field_j + ((this.muteTimingEnvelope.field_g - this.muteTimingEnvelope.field_j) * var16 >> 8);
            } else {
              var12 = this.muteTimingEnvelope.field_j + ((this.muteTimingEnvelope.field_g - this.muteTimingEnvelope.field_j) * var15 >> 8);
            }
            var11 += 256;
            if (var11 >= var12) {
              var11 = 0;
              stackIn_36_0 = (var13 != 0) ? 0 : 1;
              var13 = stackIn_36_0;
            }
            if (var13 == 0) {
              continue;
            }
            sampleBuffer[var14] = 0;
          }
        }
        if ((this.echoDelayMillis > 0) &&
            (this.echoDecayPercent > 0)) {
          var11 = (int)((double)this.echoDelayMillis * var3);
          for (var12 = var11; var12 < sampleCount; var12++) {
            sampleBuffer[var12] = sampleBuffer[var12] + sampleBuffer[var12 - var11] * this.echoDecayPercent / 100;
          }
        }
        {
          if (!((this.filter.field_b[0] <= 0) &&
              (this.filter.field_b[1] <= 0))) {
            this.filterEnvelope.a();
            var11 = this.filterEnvelope.a(sampleCount + 1);
            var12 = this.filter.a(0, (float)var11 / 65536.0f);
            var13 = this.filter.a(1, (float)var11 / 65536.0f);
            if (sampleCount >= var12 + var13) {
              var14 = 0;
              var15 = var13;
              if (var15 > sampleCount - var12) {
                var15 = sampleCount - var12;
              }
              while (var14 < var15) {
                var16 = (int)((long)sampleBuffer[var14 + var12] * (long)SoundFilter.field_a >> 16);
                for (var17 = 0; var17 < var12; var17++) {
                  var16 = var16 + (int)((long)sampleBuffer[var14 + var12 - 1 - var17] * (long)SoundFilter.field_g[0][var17] >> 16);
                }
                for (var17 = 0; var17 < var14; var17++) {
                  var16 = var16 - (int)((long)sampleBuffer[var14 - 1 - var17] * (long)SoundFilter.field_g[1][var17] >> 16);
                }
                sampleBuffer[var14] = var16;
                var11 = this.filterEnvelope.a(sampleCount + 1);
                var14++;
              }
              var15 = 128;
              while (true) {
                if (var15 > sampleCount - var12) {
                  var15 = sampleCount - var12;
                }
                while (var14 < var15) {
                  var16 = (int)((long)sampleBuffer[var14 + var12] * (long)SoundFilter.field_a >> 16);
                  for (var17 = 0; var17 < var12; var17++) {
                    var16 = var16 + (int)((long)sampleBuffer[var14 + var12 - 1 - var17] * (long)SoundFilter.field_g[0][var17] >> 16);
                  }
                  for (var17 = 0; var17 < var13; var17++) {
                    var16 = var16 - (int)((long)sampleBuffer[var14 - 1 - var17] * (long)SoundFilter.field_g[1][var17] >> 16);
                  }
                  sampleBuffer[var14] = var16;
                  var11 = this.filterEnvelope.a(sampleCount + 1);
                  var14++;
                }
                if (var14 < sampleCount - var12) {
                  var12 = this.filter.a(0, (float)var11 / 65536.0f);
                  var13 = this.filter.a(1, (float)var11 / 65536.0f);
                  var15 += 128;
                  continue;
                }
                while (var14 < sampleCount) {
                  var16 = 0;
                  for (var17 = var14 + var12 - sampleCount; var17 < var12; var17++) {
                    var16 = var16 + (int)((long)sampleBuffer[var14 + var12 - 1 - var17] * (long)SoundFilter.field_g[0][var17] >> 16);
                  }
                  for (var17 = 0; var17 < var13; var17++) {
                    var16 = var16 - (int)((long)sampleBuffer[var14 - 1 - var17] * (long)SoundFilter.field_g[1][var17] >> 16);
                  }
                  sampleBuffer[var14] = var16;
                  var11 = this.filterEnvelope.a(sampleCount + 1);
                  var14++;
                }
                break;
              }
            }
          }
        }
        for (var11 = 0; var11 < sampleCount; var11++) {
          if (sampleBuffer[var11] < -32768) {
            sampleBuffer[var11] = -32768;
          }
          if (sampleBuffer[var11] <= 32767) {
            continue;
          }
          sampleBuffer[var11] = 32767;
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
        int var1 = 0;
        noiseTable = new int[32768];
        Random var0 = new Random(0L);
        for (var1 = 0; var1 < 32768; var1++) {
            noiseTable[var1] = (var0.nextInt() & 2) - 1;
        }
        sineTable = new int[32768];
        for (var1 = 0; var1 < 32768; var1++) {
            sineTable[var1] = (int)(Math.sin((double)var1 / 5215.1903) * 16384.0);
        }
        sampleBuffer = new int[220500];
        oscillatorBasePitchSteps = new int[5];
        oscillatorPhases = new int[5];
        oscillatorVolumeScales = new int[5];
        oscillatorDelaySamples = new int[5];
        oscillatorPitchSteps = new int[5];
    }
}
