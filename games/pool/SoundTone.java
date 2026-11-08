/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class SoundTone {
    private int field_q;
    private SoundEnvelope field_e;
    private int[] field_y;
    private static int[] sampleScratch;
    private int[] field_a;
    private SoundEnvelope field_t;
    private static int[] noiseTable;
    private SoundEnvelope field_g;
    private SoundEnvelope field_c;
    private SoundEnvelope field_i;
    private int[] field_p;
    private SoundEnvelope field_d;
    private SoundEnvelope field_f;
    private AudioFilter field_r;
    private SoundEnvelope field_h;
    private SoundEnvelope field_j;
    int field_l;
    private static int[] sineTable;
    private int field_n;
    private static int[] oscillatorDelaySamples;
    private static int[] field_w;
    private static int[] oscillatorPhases;
    private static int[] oscillatorBasePitchSteps;
    private static int[] oscillatorPitchSteps;
    int field_x;

    public static void releaseScratch() {
        sampleScratch = null;
        noiseTable = null;
        sineTable = null;
        oscillatorPhases = null;
        oscillatorDelaySamples = null;
        field_w = null;
        oscillatorPitchSteps = null;
        oscillatorBasePitchSteps = null;
    }

    final void decode(PacketBuffer param0) {
        int var3 = 0;
        int var4 = 0;
        this.field_j = new SoundEnvelope();
        this.field_j.decode(param0);
        this.field_c = new SoundEnvelope();
        this.field_c.decode(param0);
        int var2 = param0.readUnsignedByte(-98);
        if (var2 != 0) {
          param0.position = param0.position - 1;
          this.field_h = new SoundEnvelope();
          this.field_h.decode(param0);
          this.field_i = new SoundEnvelope();
          this.field_i.decode(param0);
        }
        var2 = param0.readUnsignedByte(-95);
        if (var2 != 0) {
          param0.position = param0.position - 1;
          this.field_g = new SoundEnvelope();
          this.field_g.decode(param0);
          this.field_t = new SoundEnvelope();
          this.field_t.decode(param0);
        }
        var2 = param0.readUnsignedByte(-83);
        if (var2 != 0) {
          param0.position = param0.position - 1;
          this.field_e = new SoundEnvelope();
          this.field_e.decode(param0);
          this.field_d = new SoundEnvelope();
          this.field_d.decode(param0);
        }
        for (var3 = 0; var3 < 10; var3++) {
          var4 = param0.readUnsignedSmart((byte) -115);
          if (var4 == 0) {
            break;
          }
          this.field_y[var3] = var4;
          this.field_a[var3] = param0.readSignedSmart(-103);
          this.field_p[var3] = param0.readUnsignedSmart((byte) -115);
        }
        this.field_n = param0.readUnsignedSmart((byte) -115);
        this.field_q = param0.readUnsignedSmart((byte) -115);
        this.field_x = param0.readUnsignedShort(-1034);
        this.field_l = param0.readUnsignedShort(-1034);
        this.field_r = new AudioFilter();
        this.field_f = new SoundEnvelope();
        this.field_r.decode(param0, this.field_f);
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
        ArrayOperations.clearInts(sampleScratch, 0, param0);
        if (param1 < 10) {
          return sampleScratch;
        }
        var3 = (double)param0 / ((double)param1 + 0.0);
        this.field_j.reset();
        this.field_c.reset();
        var5 = 0;
        var6 = 0;
        var7 = 0;
        if (this.field_h != null) {
          this.field_h.reset();
          this.field_i.reset();
          var5 = (int)((double)(this.field_h.field_a - this.field_h.field_f) * 32.768 / var3);
          var6 = (int)((double)this.field_h.field_f * 32.768 / var3);
        }
        var8 = 0;
        var9 = 0;
        var10 = 0;
        if (this.field_g != null) {
          this.field_g.reset();
          this.field_t.reset();
          var8 = (int)((double)(this.field_g.field_a - this.field_g.field_f) * 32.768 / var3);
          var9 = (int)((double)this.field_g.field_f * 32.768 / var3);
        }
        for (var11 = 0; var11 < 5; var11++) {
          if (this.field_y[var11] != 0) {
            oscillatorPhases[var11] = 0;
            oscillatorDelaySamples[var11] = (int)((double)this.field_p[var11] * var3);
            field_w[var11] = (this.field_y[var11] << 14) / 100;
            oscillatorPitchSteps[var11] = (int)((double)(this.field_j.field_a - this.field_j.field_f) * 32.768 * Math.pow(1.0057929410678534, (double)this.field_a[var11]) / var3);
            oscillatorBasePitchSteps[var11] = (int)((double)this.field_j.field_f * 32.768 / var3);
          }
        }
        for (var11Lifetime1 = 0; var11Lifetime1 < param0; var11Lifetime1++) {
          var12 = this.field_j.advance(param0);
          var13 = this.field_c.advance(param0);
          if (this.field_h != null) {
            var14 = this.field_h.advance(param0);
            var15 = this.field_i.advance(param0);
            var12 = var12 + (this.evaluateWaveform(var7, var15, this.field_h.field_b) >> 1);
            var7 = var7 + ((var14 * var5 >> 16) + var6);
          }
          if (this.field_g != null) {
            var14Lifetime3 = this.field_g.advance(param0);
            var15Lifetime3 = this.field_t.advance(param0);
            var13 = var13 * ((this.evaluateWaveform(var10, var15Lifetime3, this.field_g.field_b) >> 1) + 32768) >> 15;
            var10 = var10 + ((var14Lifetime3 * var8 >> 16) + var9);
          }
          for (var14Lifetime4 = 0; var14Lifetime4 < 5; var14Lifetime4++) {
            if (this.field_y[var14Lifetime4] != 0) {
              var15Lifetime4 = var11Lifetime1 + oscillatorDelaySamples[var14Lifetime4];
              if (var15Lifetime4 < param0) {
                sampleScratch[var15Lifetime4] = sampleScratch[var15Lifetime4] + this.evaluateWaveform(oscillatorPhases[var14Lifetime4], var13 * field_w[var14Lifetime4] >> 15, this.field_j.field_b);
                oscillatorPhases[var14Lifetime4] = oscillatorPhases[var14Lifetime4] + ((var12 * oscillatorPitchSteps[var14Lifetime4] >> 16) + oscillatorBasePitchSteps[var14Lifetime4]);
              }
            }
          }
        }
        if (this.field_e != null) {
          this.field_e.reset();
          this.field_d.reset();
          var11Lifetime2 = 0;
          var12Lifetime1 = 0;
          var13Lifetime1 = 1;
          for (var14Lifetime1 = 0; var14Lifetime1 < param0; var14Lifetime1++) {
            var15Lifetime1 = this.field_e.advance(param0);
            var16 = this.field_d.advance(param0);
            if (var13Lifetime1 == 0) {
              var12Lifetime1Lifetime1 = this.field_e.field_f + ((this.field_e.field_a - this.field_e.field_f) * var16 >> 8);
            } else {
              var12Lifetime1Lifetime1 = this.field_e.field_f + ((this.field_e.field_a - this.field_e.field_f) * var15Lifetime1 >> 8);
            }
            var11Lifetime2 += 256;
            if (var11Lifetime2 >= var12Lifetime1Lifetime1) {
              var11Lifetime2 = 0;
              stackIn_41_0 = (var13Lifetime1 != 0) ? 0 : 1;
              var13Lifetime1 = stackIn_41_0;
            }
            if (var13Lifetime1 != 0) {
              sampleScratch[var14Lifetime1] = 0;
            }
          }
        }
        if (this.field_n > 0 &&
          this.field_q > 0) {
          var11Lifetime3 = (int)((double)this.field_n * var3);
          for (var12Lifetime2 = var11Lifetime3; var12Lifetime2 < param0; var12Lifetime2++) {
            sampleScratch[var12Lifetime2] = sampleScratch[var12Lifetime2] + sampleScratch[var12Lifetime2 - var11Lifetime3] * this.field_q / 100;
          }
        }
        if (!(this.field_r.pairCounts[0] <= 0) ||
          !(this.field_r.pairCounts[1] <= 0)) {
          this.field_f.reset();
          var11Lifetime4 = this.field_f.advance(param0 + 1);
          var12Lifetime3 = this.field_r.computeCoefficients(0, (float)var11Lifetime4 / 65536.0f);
          var13Lifetime2 = this.field_r.computeCoefficients(1, (float)var11Lifetime4 / 65536.0f);
          if (param0 >= var12Lifetime3 + var13Lifetime2) {
            var14Lifetime2 = 0;
            var15Lifetime2 = var13Lifetime2;
            if (var15Lifetime2 > param0 - var12Lifetime3) {
              var15Lifetime2 = param0 - var12Lifetime3;
            }
            while (var14Lifetime2 < var15Lifetime2) {
              var16Lifetime1 = (int)((long)sampleScratch[var14Lifetime2 + var12Lifetime3] * (long)AudioFilter.field_e >> 16);
              for (var17 = 0; var17 < var12Lifetime3; var17++) {
                var16Lifetime1 = var16Lifetime1 + (int)((long)sampleScratch[var14Lifetime2 + var12Lifetime3 - 1 - var17] * (long)AudioFilter.coefficientsQ16[0][var17] >> 16);
              }
              for (var17Lifetime3 = 0; var17Lifetime3 < var14Lifetime2; var17Lifetime3++) {
                var16Lifetime1 = var16Lifetime1 - (int)((long)sampleScratch[var14Lifetime2 - 1 - var17Lifetime3] * (long)AudioFilter.coefficientsQ16[1][var17Lifetime3] >> 16);
              }
              sampleScratch[var14Lifetime2] = var16Lifetime1;
              var11Lifetime4 = this.field_f.advance(param0 + 1);
              var14Lifetime2++;
            }
            var15Lifetime2Lifetime1 = 128;
            while (true) {
              if (var15Lifetime2Lifetime1 > param0 - var12Lifetime3) {
                var15Lifetime2Lifetime1 = param0 - var12Lifetime3;
              }
              while (var14Lifetime2 < var15Lifetime2Lifetime1) {
                var16Lifetime1Lifetime1 = (int)((long)sampleScratch[var14Lifetime2 + var12Lifetime3] * (long)AudioFilter.field_e >> 16);
                for (var17Lifetime1 = 0; var17Lifetime1 < var12Lifetime3; var17Lifetime1++) {
                  var16Lifetime1Lifetime1 = var16Lifetime1Lifetime1 + (int)((long)sampleScratch[var14Lifetime2 + var12Lifetime3 - 1 - var17Lifetime1] * (long)AudioFilter.coefficientsQ16[0][var17Lifetime1] >> 16);
                }
                for (var17Lifetime1Lifetime1 = 0; var17Lifetime1Lifetime1 < var13Lifetime2; var17Lifetime1Lifetime1++) {
                  var16Lifetime1Lifetime1 = var16Lifetime1Lifetime1 - (int)((long)sampleScratch[var14Lifetime2 - 1 - var17Lifetime1Lifetime1] * (long)AudioFilter.coefficientsQ16[1][var17Lifetime1Lifetime1] >> 16);
                }
                sampleScratch[var14Lifetime2] = var16Lifetime1Lifetime1;
                var11Lifetime4 = this.field_f.advance(param0 + 1);
                var14Lifetime2++;
              }
              if (var14Lifetime2 < param0 - var12Lifetime3) {
                var12Lifetime3 = this.field_r.computeCoefficients(0, (float)var11Lifetime4 / 65536.0f);
                var13Lifetime2 = this.field_r.computeCoefficients(1, (float)var11Lifetime4 / 65536.0f);
                var15Lifetime2Lifetime1 += 128;
                continue;
              }
              break;
            }
            while (var14Lifetime2 < param0) {
              var16Lifetime1Lifetime2 = 0;
              for (var17Lifetime2 = var14Lifetime2 + var12Lifetime3 - param0; var17Lifetime2 < var12Lifetime3; var17Lifetime2++) {
                var16Lifetime1Lifetime2 = var16Lifetime1Lifetime2 + (int)((long)sampleScratch[var14Lifetime2 + var12Lifetime3 - 1 - var17Lifetime2] * (long)AudioFilter.coefficientsQ16[0][var17Lifetime2] >> 16);
              }
              for (var17Lifetime2Lifetime1 = 0; var17Lifetime2Lifetime1 < var13Lifetime2; var17Lifetime2Lifetime1++) {
                var16Lifetime1Lifetime2 = var16Lifetime1Lifetime2 - (int)((long)sampleScratch[var14Lifetime2 - 1 - var17Lifetime2Lifetime1] * (long)AudioFilter.coefficientsQ16[1][var17Lifetime2Lifetime1] >> 16);
              }
              sampleScratch[var14Lifetime2] = var16Lifetime1Lifetime2;
              var11Lifetime4 = this.field_f.advance(param0 + 1);
              var14Lifetime2++;
            }
          }
        }
        for (var11Lifetime5 = 0; var11Lifetime5 < param0; var11Lifetime5++) {
          if (sampleScratch[var11Lifetime5] < -32768) {
            sampleScratch[var11Lifetime5] = -32768;
          }
          if (sampleScratch[var11Lifetime5] > 32767) {
            sampleScratch[var11Lifetime5] = 32767;
          }
        }
        return sampleScratch;
    }

    SoundTone() {
        this.field_y = new int[]{0, 0, 0, 0, 0};
        this.field_q = 100;
        this.field_a = new int[]{0, 0, 0, 0, 0};
        this.field_p = new int[]{0, 0, 0, 0, 0};
        this.field_l = 0;
        this.field_n = 0;
        this.field_x = 500;
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
        sampleScratch = new int[220500];
        oscillatorDelaySamples = new int[5];
        oscillatorBasePitchSteps = new int[5];
        oscillatorPhases = new int[5];
        field_w = new int[5];
        oscillatorPitchSteps = new int[5];
    }
}
