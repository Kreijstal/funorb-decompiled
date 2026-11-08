/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class SynthInstrument {
    private SoundEnvelope pitchModulationAmplitude;
    private SoundEnvelope field_q;
    private SoundEnvelope field_b;
    private SoundEnvelope filterEnvelope;
    private static int[] field_v;
    private SoundEnvelope volumeEnvelope;
    private int[] oscillatorPitch;
    private int echoDelayMillis;
    private SoundEnvelope volumeModulation;
    private static int[] field_s;
    private SoundEnvelope volumeModulationAmplitude;
    int durationMillis;
    private int[] oscillatorVolumePercent;
    private static int[] field_c;
    private int[] field_y;
    private static int[] field_o;
    private int echoDecayPercent;
    int field_e;
    private static int[] field_a;
    private static int[] field_w;
    private static int[] field_n;
    private AudioFilter filter;
    private SoundEnvelope pitchEnvelope;
    private static int[] field_j;
    private SoundEnvelope pitchModulation;

    final void decode(PacketBuffer param0) {
        int var3 = 0;
        int var4 = 0;
        this.pitchEnvelope = new SoundEnvelope();
        this.pitchEnvelope.decode(param0);
        this.volumeEnvelope = new SoundEnvelope();
        this.volumeEnvelope.decode(param0);
        int var2 = param0.readUnsignedByte(255);
        if (var2 != 0) {
          param0.position = param0.position - 1;
          this.pitchModulation = new SoundEnvelope();
          this.pitchModulation.decode(param0);
          this.pitchModulationAmplitude = new SoundEnvelope();
          this.pitchModulationAmplitude.decode(param0);
        }
        var2 = param0.readUnsignedByte(255);
        if (var2 != 0) {
          param0.position = param0.position - 1;
          this.volumeModulation = new SoundEnvelope();
          this.volumeModulation.decode(param0);
          this.volumeModulationAmplitude = new SoundEnvelope();
          this.volumeModulationAmplitude.decode(param0);
        }
        var2 = param0.readUnsignedByte(255);
        if (var2 != 0) {
          param0.position = param0.position - 1;
          this.field_q = new SoundEnvelope();
          this.field_q.decode(param0);
          this.field_b = new SoundEnvelope();
          this.field_b.decode(param0);
        }
        for (var3 = 0; var3 < 10; var3++) {
          var4 = param0.readUnsignedSmart(21231);
          if (var4 == 0) {
            break;
          }
          this.oscillatorVolumePercent[var3] = var4;
          this.oscillatorPitch[var3] = param0.readSignedSmart(-20729);
          this.field_y[var3] = param0.readUnsignedSmart(21231);
        }
        this.echoDelayMillis = param0.readUnsignedSmart(21231);
        this.echoDecayPercent = param0.readUnsignedSmart(21231);
        this.durationMillis = param0.readUnsignedShort((byte) -124);
        this.field_e = param0.readUnsignedShort((byte) 7);
        this.filter = new AudioFilter();
        this.filterEnvelope = new SoundEnvelope();
        this.filter.decode(param0, this.filterEnvelope);
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
        ArraySupport.clearInts(field_c, 0, param0);
        if (param1 < 10) {
          return field_c;
        }
        var3 = (double)param0 / ((double)param1 + 0.0);
        this.pitchEnvelope.reset();
        this.volumeEnvelope.reset();
        var5 = 0;
        var6 = 0;
        var7 = 0;
        if (this.pitchModulation != null) {
          this.pitchModulation.reset();
          this.pitchModulationAmplitude.reset();
          var5 = (int)((double)(this.pitchModulation.field_g - this.pitchModulation.field_c) * 32.768 / var3);
          var6 = (int)((double)this.pitchModulation.field_c * 32.768 / var3);
        }
        var8 = 0;
        var9 = 0;
        var10 = 0;
        if (this.volumeModulation != null) {
          this.volumeModulation.reset();
          this.volumeModulationAmplitude.reset();
          var8 = (int)((double)(this.volumeModulation.field_g - this.volumeModulation.field_c) * 32.768 / var3);
          var9 = (int)((double)this.volumeModulation.field_c * 32.768 / var3);
        }
        for (var11 = 0; var11 < 5; var11++) {
          if (this.oscillatorVolumePercent[var11] != 0) {
            field_n[var11] = 0;
            field_j[var11] = (int)((double)this.field_y[var11] * var3);
            field_w[var11] = (this.oscillatorVolumePercent[var11] << 14) / 100;
            field_a[var11] = (int)((double)(this.pitchEnvelope.field_g - this.pitchEnvelope.field_c) * 32.768 * Math.pow(1.0057929410678534, (double)this.oscillatorPitch[var11]) / var3);
            field_o[var11] = (int)((double)this.pitchEnvelope.field_c * 32.768 / var3);
          }
        }
        for (var11Lifetime1 = 0; var11Lifetime1 < param0; var11Lifetime1++) {
          var12 = this.pitchEnvelope.advance(param0);
          var13 = this.volumeEnvelope.advance(param0);
          if (this.pitchModulation != null) {
            var14 = this.pitchModulation.advance(param0);
            var15 = this.pitchModulationAmplitude.advance(param0);
            var12 = var12 + (this.evaluateWave(var7, var15, this.pitchModulation.field_a) >> 1);
            var7 = var7 + ((var14 * var5 >> 16) + var6);
          }
          if (this.volumeModulation != null) {
            var14Lifetime3 = this.volumeModulation.advance(param0);
            var15Lifetime3 = this.volumeModulationAmplitude.advance(param0);
            var13 = var13 * ((this.evaluateWave(var10, var15Lifetime3, this.volumeModulation.field_a) >> 1) + 32768) >> 15;
            var10 = var10 + ((var14Lifetime3 * var8 >> 16) + var9);
          }
          for (var14Lifetime4 = 0; var14Lifetime4 < 5; var14Lifetime4++) {
            if (this.oscillatorVolumePercent[var14Lifetime4] != 0) {
              var15Lifetime4 = var11Lifetime1 + field_j[var14Lifetime4];
              if (var15Lifetime4 < param0) {
                field_c[var15Lifetime4] = field_c[var15Lifetime4] + this.evaluateWave(field_n[var14Lifetime4], var13 * field_w[var14Lifetime4] >> 15, this.pitchEnvelope.field_a);
                field_n[var14Lifetime4] = field_n[var14Lifetime4] + ((var12 * field_a[var14Lifetime4] >> 16) + field_o[var14Lifetime4]);
              }
            }
          }
        }
        if (this.field_q != null) {
          this.field_q.reset();
          this.field_b.reset();
          var11Lifetime2 = 0;
          var12Lifetime1 = 0;
          var13Lifetime1 = 1;
          for (var14Lifetime1 = 0; var14Lifetime1 < param0; var14Lifetime1++) {
            var15Lifetime1 = this.field_q.advance(param0);
            var16 = this.field_b.advance(param0);
            if (var13Lifetime1 == 0) {
              var12Lifetime1Lifetime1 = this.field_q.field_c + ((this.field_q.field_g - this.field_q.field_c) * var16 >> 8);
            } else {
              var12Lifetime1Lifetime1 = this.field_q.field_c + ((this.field_q.field_g - this.field_q.field_c) * var15Lifetime1 >> 8);
            }
            var11Lifetime2 += 256;
            if (var11Lifetime2 >= var12Lifetime1Lifetime1) {
              var11Lifetime2 = 0;
              stackIn_41_0 = (var13Lifetime1 != 0) ? 0 : 1;
              var13Lifetime1 = stackIn_41_0;
            }
            if (var13Lifetime1 != 0) {
              field_c[var14Lifetime1] = 0;
            }
          }
        }
        if (this.echoDelayMillis > 0 &&
          this.echoDecayPercent > 0) {
          var11Lifetime3 = (int)((double)this.echoDelayMillis * var3);
          for (var12Lifetime2 = var11Lifetime3; var12Lifetime2 < param0; var12Lifetime2++) {
            field_c[var12Lifetime2] = field_c[var12Lifetime2] + field_c[var12Lifetime2 - var11Lifetime3] * this.echoDecayPercent / 100;
          }
        }
        if (!(this.filter.pairCounts[0] <= 0) ||
          !(this.filter.pairCounts[1] <= 0)) {
          this.filterEnvelope.reset();
          var11Lifetime4 = this.filterEnvelope.advance(param0 + 1);
          var12Lifetime3 = this.filter.computeCoefficients(0, (float)var11Lifetime4 / 65536.0f);
          var13Lifetime2 = this.filter.computeCoefficients(1, (float)var11Lifetime4 / 65536.0f);
          if (param0 >= var12Lifetime3 + var13Lifetime2) {
            var14Lifetime2 = 0;
            var15Lifetime2 = var13Lifetime2;
            if (var15Lifetime2 > param0 - var12Lifetime3) {
              var15Lifetime2 = param0 - var12Lifetime3;
            }
            while (var14Lifetime2 < var15Lifetime2) {
              var16Lifetime1 = (int)((long)field_c[var14Lifetime2 + var12Lifetime3] * (long)AudioFilter.field_a >> 16);
              for (var17 = 0; var17 < var12Lifetime3; var17++) {
                var16Lifetime1 = var16Lifetime1 + (int)((long)field_c[var14Lifetime2 + var12Lifetime3 - 1 - var17] * (long)AudioFilter.field_e[0][var17] >> 16);
              }
              for (var17Lifetime3 = 0; var17Lifetime3 < var14Lifetime2; var17Lifetime3++) {
                var16Lifetime1 = var16Lifetime1 - (int)((long)field_c[var14Lifetime2 - 1 - var17Lifetime3] * (long)AudioFilter.field_e[1][var17Lifetime3] >> 16);
              }
              field_c[var14Lifetime2] = var16Lifetime1;
              var11Lifetime4 = this.filterEnvelope.advance(param0 + 1);
              var14Lifetime2++;
            }
            var15Lifetime2Lifetime1 = 128;
            while (true) {
              if (var15Lifetime2Lifetime1 > param0 - var12Lifetime3) {
                var15Lifetime2Lifetime1 = param0 - var12Lifetime3;
              }
              while (var14Lifetime2 < var15Lifetime2Lifetime1) {
                var16Lifetime1Lifetime1 = (int)((long)field_c[var14Lifetime2 + var12Lifetime3] * (long)AudioFilter.field_a >> 16);
                for (var17Lifetime1 = 0; var17Lifetime1 < var12Lifetime3; var17Lifetime1++) {
                  var16Lifetime1Lifetime1 = var16Lifetime1Lifetime1 + (int)((long)field_c[var14Lifetime2 + var12Lifetime3 - 1 - var17Lifetime1] * (long)AudioFilter.field_e[0][var17Lifetime1] >> 16);
                }
                for (var17Lifetime1Lifetime1 = 0; var17Lifetime1Lifetime1 < var13Lifetime2; var17Lifetime1Lifetime1++) {
                  var16Lifetime1Lifetime1 = var16Lifetime1Lifetime1 - (int)((long)field_c[var14Lifetime2 - 1 - var17Lifetime1Lifetime1] * (long)AudioFilter.field_e[1][var17Lifetime1Lifetime1] >> 16);
                }
                field_c[var14Lifetime2] = var16Lifetime1Lifetime1;
                var11Lifetime4 = this.filterEnvelope.advance(param0 + 1);
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
                var16Lifetime1Lifetime2 = var16Lifetime1Lifetime2 + (int)((long)field_c[var14Lifetime2 + var12Lifetime3 - 1 - var17Lifetime2] * (long)AudioFilter.field_e[0][var17Lifetime2] >> 16);
              }
              for (var17Lifetime2Lifetime1 = 0; var17Lifetime2Lifetime1 < var13Lifetime2; var17Lifetime2Lifetime1++) {
                var16Lifetime1Lifetime2 = var16Lifetime1Lifetime2 - (int)((long)field_c[var14Lifetime2 - 1 - var17Lifetime2Lifetime1] * (long)AudioFilter.field_e[1][var17Lifetime2Lifetime1] >> 16);
              }
              field_c[var14Lifetime2] = var16Lifetime1Lifetime2;
              var11Lifetime4 = this.filterEnvelope.advance(param0 + 1);
              var14Lifetime2++;
            }
          }
        }
        for (var11Lifetime5 = 0; var11Lifetime5 < param0; var11Lifetime5++) {
          if (field_c[var11Lifetime5] < -32768) {
            field_c[var11Lifetime5] = -32768;
          }
          if (field_c[var11Lifetime5] > 32767) {
            field_c[var11Lifetime5] = 32767;
          }
        }
        return field_c;
    }

    public static void releaseStatics() {
        field_c = null;
        field_s = null;
        field_v = null;
        field_n = null;
        field_j = null;
        field_w = null;
        field_a = null;
        field_o = null;
    }

    private final int evaluateWave(int param0, int param1, int param2) {
        if (param2 == 1) {
          if ((param0 & 32767) < 16384) {
            return param1;
          }
          return -param1;
        }
        if (param2 == 2) {
          return field_v[param0 & 32767] * param1 >> 14;
        }
        if (param2 == 3) {
          return ((param0 & 32767) * param1 >> 14) - param1;
        }
        if (param2 == 4) {
          return field_s[param0 / 2607 & 32767] * param1;
        }
        return 0;
    }

    SynthInstrument() {
        this.oscillatorVolumePercent = new int[]{0, 0, 0, 0, 0};
        this.echoDelayMillis = 0;
        this.oscillatorPitch = new int[]{0, 0, 0, 0, 0};
        this.field_y = new int[]{0, 0, 0, 0, 0};
        this.field_e = 0;
        this.echoDecayPercent = 100;
        this.durationMillis = 500;
    }

    static {
        int var1 = 0;
        int var1Lifetime1;
        field_s = new int[32768];
        Random var0 = new Random(0L);
        for (var1 = 0; var1 < 32768; var1++) {
          field_s[var1] = (var0.nextInt() & 2) - 1;
        }
        field_v = new int[32768];
        for (var1Lifetime1 = 0; var1Lifetime1 < 32768; var1Lifetime1++) {
          field_v[var1Lifetime1] = (int)(Math.sin((double)var1Lifetime1 / 5215.1903) * 16384.0);
        }
        field_c = new int[220500];
        field_o = new int[5];
        field_w = new int[5];
        field_n = new int[5];
        field_a = new int[5];
        field_j = new int[5];
    }
}
