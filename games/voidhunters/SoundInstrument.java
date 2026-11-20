/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class SoundInstrument {
    private int echoDelayMillis;
    private int[] oscillatorPitchOffsets;
    private int echoDecayPercent;
    private SoundFilter filter;
    private SoundEnvelope gateRelease;
    private SoundEnvelope pitchModulation;
    private SoundEnvelope volumeModulationAmplitude;
    private SoundEnvelope volume;
    private SoundEnvelope pitch;
    int startDelayMillis;
    int durationMillis;
    private int[] oscillatorVolumes;
    private SoundEnvelope volumeModulation;
    private static int[] sampleBuffer;
    private int[] oscillatorDelaysMillis;
    private static int[] sineTable;
    private SoundEnvelope filterEnvelope;
    private SoundEnvelope pitchModulationAmplitude;
    private SoundEnvelope gateAttack;
    private static int[] noiseTable;
    private static int[] field_l;
    private static int[] field_p;
    private static int[] field_h;
    private static int[] field_v;
    private static int[] field_t;

    public static void clearSharedReferences() {
        sampleBuffer = null;
        noiseTable = null;
        sineTable = null;
        field_t = null;
        field_l = null;
        field_h = null;
        field_v = null;
        field_p = null;
    }

    final int[] synthesize(int param0, int param1) {
        int stackIn_41_0 = 0;
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
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var11Lifetime4;
        int var11Lifetime5;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        int var13Lifetime1;
        int var13Lifetime2;
        int var14Lifetime1;
        int var14Lifetime2;
        int var15Lifetime1;
        int var15Lifetime2;
        int var16Lifetime1;
        int var14Lifetime3;
        int var14Lifetime4;
        int var15Lifetime3;
        int var15Lifetime4;
        int var17Lifetime1;
        int var17Lifetime2;
        int var12Lifetime1Lifetime1;
        int var15Lifetime2Lifetime1;
        int var16Lifetime1Lifetime1;
        int var16Lifetime1Lifetime2;
        int var17Lifetime3;
        int var17Lifetime1Lifetime1;
        int var17Lifetime2Lifetime1;
        ArrayOperations.clear(sampleBuffer, 0, param0);
        if (param1 < 10) {
          return sampleBuffer;
        }
        var3 = (double)param0 / ((double)param1 + 0.0);
        this.pitch.reset();
        this.volume.reset();
        var5 = 0;
        var6 = 0;
        var7 = 0;
        if (this.pitchModulation != null) {
          this.pitchModulation.reset();
          this.pitchModulationAmplitude.reset();
          var5 = (int)((double)(this.pitchModulation.end - this.pitchModulation.start) * 32.768 / var3);
          var6 = (int)((double)this.pitchModulation.start * 32.768 / var3);
        }
        var8 = 0;
        var9 = 0;
        var10 = 0;
        if (this.volumeModulation != null) {
          this.volumeModulation.reset();
          this.volumeModulationAmplitude.reset();
          var8 = (int)((double)(this.volumeModulation.end - this.volumeModulation.start) * 32.768 / var3);
          var9 = (int)((double)this.volumeModulation.start * 32.768 / var3);
        }
        for (var11 = 0; var11 < 5; var11++) {
          if (this.oscillatorVolumes[var11] != 0) {
            field_t[var11] = 0;
            field_l[var11] = (int)((double)this.oscillatorDelaysMillis[var11] * var3);
            field_h[var11] = (this.oscillatorVolumes[var11] << 14) / 100;
            field_v[var11] = (int)((double)(this.pitch.end - this.pitch.start) * 32.768 * Math.pow(1.0057929410678534, (double)this.oscillatorPitchOffsets[var11]) / var3);
            field_p[var11] = (int)((double)this.pitch.start * 32.768 / var3);
          }
        }
        for (var11Lifetime1 = 0; var11Lifetime1 < param0; var11Lifetime1++) {
          var12 = this.pitch.step(param0);
          var13 = this.volume.step(param0);
          if (this.pitchModulation != null) {
            var14 = this.pitchModulation.step(param0);
            var15 = this.pitchModulationAmplitude.step(param0);
            var12 = var12 + (this.evaluateWaveform(var7, var15, this.pitchModulation.waveform) >> 1);
            var7 = var7 + ((var14 * var5 >> 16) + var6);
          }
          if (this.volumeModulation != null) {
            var14Lifetime3 = this.volumeModulation.step(param0);
            var15Lifetime3 = this.volumeModulationAmplitude.step(param0);
            var13 = var13 * ((this.evaluateWaveform(var10, var15Lifetime3, this.volumeModulation.waveform) >> 1) + 32768) >> 15;
            var10 = var10 + ((var14Lifetime3 * var8 >> 16) + var9);
          }
          for (var14Lifetime4 = 0; var14Lifetime4 < 5; var14Lifetime4++) {
            if (this.oscillatorVolumes[var14Lifetime4] != 0) {
              var15Lifetime4 = var11Lifetime1 + field_l[var14Lifetime4];
              if (var15Lifetime4 < param0) {
                sampleBuffer[var15Lifetime4] = sampleBuffer[var15Lifetime4] + this.evaluateWaveform(field_t[var14Lifetime4], var13 * field_h[var14Lifetime4] >> 15, this.pitch.waveform);
                field_t[var14Lifetime4] = field_t[var14Lifetime4] + ((var12 * field_v[var14Lifetime4] >> 16) + field_p[var14Lifetime4]);
              }
            }
          }
        }
        if (this.gateRelease != null) {
          this.gateRelease.reset();
          this.gateAttack.reset();
          var11Lifetime2 = 0;
          var12Lifetime1 = 0;
          var13Lifetime1 = 1;
          for (var14Lifetime1 = 0; var14Lifetime1 < param0; var14Lifetime1++) {
            var15Lifetime1 = this.gateRelease.step(param0);
            var16 = this.gateAttack.step(param0);
            if (var13Lifetime1 == 0) {
              var12Lifetime1Lifetime1 = this.gateRelease.start + ((this.gateRelease.end - this.gateRelease.start) * var16 >> 8);
            } else {
              var12Lifetime1Lifetime1 = this.gateRelease.start + ((this.gateRelease.end - this.gateRelease.start) * var15Lifetime1 >> 8);
            }
            var11Lifetime2 += 256;
            if (var11Lifetime2 >= var12Lifetime1Lifetime1) {
              var11Lifetime2 = 0;
              stackIn_41_0 = (var13Lifetime1 != 0) ? 0 : 1;
              var13Lifetime1 = stackIn_41_0;
            }
            if (var13Lifetime1 != 0) {
              sampleBuffer[var14Lifetime1] = 0;
            }
          }
        }
        if (this.echoDelayMillis > 0 &&
          this.echoDecayPercent > 0) {
          var11Lifetime3 = (int)((double)this.echoDelayMillis * var3);
          for (var12Lifetime2 = var11Lifetime3; var12Lifetime2 < param0; var12Lifetime2++) {
            sampleBuffer[var12Lifetime2] = sampleBuffer[var12Lifetime2] + sampleBuffer[var12Lifetime2 - var11Lifetime3] * this.echoDecayPercent / 100;
          }
        }
        if (!(this.filter.pairCounts[0] <= 0) ||
          !(this.filter.pairCounts[1] <= 0)) {
          this.filterEnvelope.reset();
          var11Lifetime4 = this.filterEnvelope.step(param0 + 1);
          var12Lifetime3 = this.filter.computeCoefficients(0, (float)var11Lifetime4 / 65536.0f);
          var13Lifetime2 = this.filter.computeCoefficients(1, (float)var11Lifetime4 / 65536.0f);
          if (param0 >= var12Lifetime3 + var13Lifetime2) {
            var14Lifetime2 = 0;
            var15Lifetime2 = var13Lifetime2;
            if (var15Lifetime2 > param0 - var12Lifetime3) {
              var15Lifetime2 = param0 - var12Lifetime3;
            }
            while (var14Lifetime2 < var15Lifetime2) {
              var16Lifetime1 = (int)((long)sampleBuffer[var14Lifetime2 + var12Lifetime3] * (long)SoundFilter.forwardMultiplier >> 16);
              for (var17 = 0; var17 < var12Lifetime3; var17++) {
                var16Lifetime1 = var16Lifetime1 + (int)((long)sampleBuffer[var14Lifetime2 + var12Lifetime3 - 1 - var17] * (long)SoundFilter.coefficients[0][var17] >> 16);
              }
              for (var17Lifetime3 = 0; var17Lifetime3 < var14Lifetime2; var17Lifetime3++) {
                var16Lifetime1 = var16Lifetime1 - (int)((long)sampleBuffer[var14Lifetime2 - 1 - var17Lifetime3] * (long)SoundFilter.coefficients[1][var17Lifetime3] >> 16);
              }
              sampleBuffer[var14Lifetime2] = var16Lifetime1;
              var11Lifetime4 = this.filterEnvelope.step(param0 + 1);
              var14Lifetime2++;
            }
            var15Lifetime2Lifetime1 = 128;
            while (true) {
              if (var15Lifetime2Lifetime1 > param0 - var12Lifetime3) {
                var15Lifetime2Lifetime1 = param0 - var12Lifetime3;
              }
              while (var14Lifetime2 < var15Lifetime2Lifetime1) {
                var16Lifetime1Lifetime1 = (int)((long)sampleBuffer[var14Lifetime2 + var12Lifetime3] * (long)SoundFilter.forwardMultiplier >> 16);
                for (var17Lifetime1 = 0; var17Lifetime1 < var12Lifetime3; var17Lifetime1++) {
                  var16Lifetime1Lifetime1 = var16Lifetime1Lifetime1 + (int)((long)sampleBuffer[var14Lifetime2 + var12Lifetime3 - 1 - var17Lifetime1] * (long)SoundFilter.coefficients[0][var17Lifetime1] >> 16);
                }
                for (var17Lifetime1Lifetime1 = 0; var17Lifetime1Lifetime1 < var13Lifetime2; var17Lifetime1Lifetime1++) {
                  var16Lifetime1Lifetime1 = var16Lifetime1Lifetime1 - (int)((long)sampleBuffer[var14Lifetime2 - 1 - var17Lifetime1Lifetime1] * (long)SoundFilter.coefficients[1][var17Lifetime1Lifetime1] >> 16);
                }
                sampleBuffer[var14Lifetime2] = var16Lifetime1Lifetime1;
                var11Lifetime4 = this.filterEnvelope.step(param0 + 1);
                var14Lifetime2++;
              }
              if (var14Lifetime2 < param0 - var12Lifetime3) {
                var12Lifetime3 = this.filter.computeCoefficients(0, (float)var11Lifetime4 / 65536.0f);
                var13Lifetime2 = this.filter.computeCoefficients(1, (float)var11Lifetime4 / 65536.0f);
                var15Lifetime2Lifetime1 += 128;
                continue;
              }
              break;
            }
            while (var14Lifetime2 < param0) {
              var16Lifetime1Lifetime2 = 0;
              for (var17Lifetime2 = var14Lifetime2 + var12Lifetime3 - param0; var17Lifetime2 < var12Lifetime3; var17Lifetime2++) {
                var16Lifetime1Lifetime2 = var16Lifetime1Lifetime2 + (int)((long)sampleBuffer[var14Lifetime2 + var12Lifetime3 - 1 - var17Lifetime2] * (long)SoundFilter.coefficients[0][var17Lifetime2] >> 16);
              }
              for (var17Lifetime2Lifetime1 = 0; var17Lifetime2Lifetime1 < var13Lifetime2; var17Lifetime2Lifetime1++) {
                var16Lifetime1Lifetime2 = var16Lifetime1Lifetime2 - (int)((long)sampleBuffer[var14Lifetime2 - 1 - var17Lifetime2Lifetime1] * (long)SoundFilter.coefficients[1][var17Lifetime2Lifetime1] >> 16);
              }
              sampleBuffer[var14Lifetime2] = var16Lifetime1Lifetime2;
              var11Lifetime4 = this.filterEnvelope.step(param0 + 1);
              var14Lifetime2++;
            }
          }
        }
        for (var11Lifetime5 = 0; var11Lifetime5 < param0; var11Lifetime5++) {
          if (sampleBuffer[var11Lifetime5] < -32768) {
            sampleBuffer[var11Lifetime5] = -32768;
          }
          if (sampleBuffer[var11Lifetime5] > 32767) {
            sampleBuffer[var11Lifetime5] = 32767;
          }
        }
        return sampleBuffer;
    }

    final void decode(PacketBuffer param0) {
        int var3 = 0;
        int var4 = 0;
        this.pitch = new SoundEnvelope();
        this.pitch.decode(param0);
        this.volume = new SoundEnvelope();
        this.volume.decode(param0);
        int var2 = param0.readUnsignedByte((byte) -87);
        if (var2 != 0) {
          param0.position = param0.position - 1;
          this.pitchModulation = new SoundEnvelope();
          this.pitchModulation.decode(param0);
          this.pitchModulationAmplitude = new SoundEnvelope();
          this.pitchModulationAmplitude.decode(param0);
        }
        var2 = param0.readUnsignedByte((byte) -106);
        if (var2 != 0) {
          param0.position = param0.position - 1;
          this.volumeModulation = new SoundEnvelope();
          this.volumeModulation.decode(param0);
          this.volumeModulationAmplitude = new SoundEnvelope();
          this.volumeModulationAmplitude.decode(param0);
        }
        var2 = param0.readUnsignedByte((byte) -98);
        if (var2 != 0) {
          param0.position = param0.position - 1;
          this.gateRelease = new SoundEnvelope();
          this.gateRelease.decode(param0);
          this.gateAttack = new SoundEnvelope();
          this.gateAttack.decode(param0);
        }
        for (var3 = 0; var3 < 10; var3++) {
          var4 = param0.readUnsignedSmart(107);
          if (var4 == 0) {
            break;
          }
          this.oscillatorVolumes[var3] = var4;
          this.oscillatorPitchOffsets[var3] = param0.readSignedSmart(0);
          this.oscillatorDelaysMillis[var3] = param0.readUnsignedSmart(50);
        }
        this.echoDelayMillis = param0.readUnsignedSmart(84);
        this.echoDecayPercent = param0.readUnsignedSmart(120);
        this.durationMillis = param0.readUnsignedShort(1869);
        this.startDelayMillis = param0.readUnsignedShort(1869);
        this.filter = new SoundFilter();
        this.filterEnvelope = new SoundEnvelope();
        this.filter.decode(param0, this.filterEnvelope);
    }

    private final int evaluateWaveform(int param0, int param1, int param2) {
        if (param2 == 1) {
          if ((param0 & 32767) < 16384) {
            return param1;
          }
          return -param1;
        }
        if (param2 == 2) {
          return sineTable[param0 & 32767] * param1 >> 14;
        }
        if (param2 == 3) {
          return ((param0 & 32767) * param1 >> 14) - param1;
        }
        if (param2 == 4) {
          return noiseTable[param0 / 2607 & 32767] * param1;
        }
        return 0;
    }

    SoundInstrument() {
        this.startDelayMillis = 0;
        this.oscillatorPitchOffsets = new int[]{0, 0, 0, 0, 0};
        this.oscillatorVolumes = new int[]{0, 0, 0, 0, 0};
        this.oscillatorDelaysMillis = new int[]{0, 0, 0, 0, 0};
        this.echoDecayPercent = 100;
        this.echoDelayMillis = 0;
        this.durationMillis = 500;
    }

    static {
        int var1 = 0;
        int var1Lifetime1;
        noiseTable = new int[32768];
        Random var0 = new Random(0L);
        for (var1 = 0; var1 < 32768; var1++) {
          noiseTable[var1] = (var0.nextInt() & 2) - 1;
        }
        sineTable = new int[32768];
        for (var1Lifetime1 = 0; var1Lifetime1 < 32768; var1Lifetime1++) {
          sineTable[var1Lifetime1] = (int)(Math.sin((double)var1Lifetime1 / 5215.1903) * 16384.0);
        }
        sampleBuffer = new int[220500];
        field_l = new int[5];
        field_p = new int[5];
        field_v = new int[5];
        field_h = new int[5];
        field_t = new int[5];
    }
}
