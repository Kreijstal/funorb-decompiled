/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class SynthesizedSoundInstrument {
    private SoundEnvelope field_e;
    private static int[] field_i;
    private SoundEnvelope field_h;
    private int[] field_m;
    private static int[] field_x;
    private SoundFilter field_c;
    private static int[] field_d;
    private int[] field_v;
    private SoundEnvelope field_t;
    int field_w;
    int field_y;
    private SoundEnvelope field_u;
    private SoundEnvelope field_r;
    private int[] field_p;
    private int field_n;
    private SoundEnvelope field_b;
    private SoundEnvelope field_j;
    private int field_l;
    private SoundEnvelope field_q;
    private static int[] field_f;
    private static int[] field_k;
    private static int[] field_s;
    private static int[] field_o;
    private static int[] field_g;
    private SoundEnvelope field_a;

    final void a(PacketBuffer param0) {
        int var3 = 0;
        int var4 = 0;
        this.field_u = new SoundEnvelope();
        this.field_u.decode(param0);
        this.field_b = new SoundEnvelope();
        this.field_b.decode(param0);
        int var2 = param0.readUnsignedByte((byte) -113);
        if (var2 != 0) {
          param0.field_n = param0.field_n - 1;
          this.field_j = new SoundEnvelope();
          this.field_j.decode(param0);
          this.field_a = new SoundEnvelope();
          this.field_a.decode(param0);
        }
        var2 = param0.readUnsignedByte((byte) -106);
        if (var2 != 0) {
          param0.field_n = param0.field_n - 1;
          this.field_h = new SoundEnvelope();
          this.field_h.decode(param0);
          this.field_r = new SoundEnvelope();
          this.field_r.decode(param0);
        }
        var2 = param0.readUnsignedByte((byte) -119);
        if (var2 != 0) {
          param0.field_n = param0.field_n - 1;
          this.field_e = new SoundEnvelope();
          this.field_e.decode(param0);
          this.field_t = new SoundEnvelope();
          this.field_t.decode(param0);
        }
        for (var3 = 0; var3 < 10; var3++) {
          var4 = param0.readUnsignedSmart(-32768);
          if (var4 == 0) {
            break;
          }
          this.field_v[var3] = var4;
          this.field_p[var3] = param0.readSignedSmart(-121);
          this.field_m[var3] = param0.readUnsignedSmart(-32768);
        }
        this.field_l = param0.readUnsignedSmart(-32768);
        this.field_n = param0.readUnsignedSmart(-32768);
        this.field_w = param0.readUnsignedShort((byte) 81);
        this.field_y = param0.readUnsignedShort((byte) 81);
        this.field_c = new SoundFilter();
        this.field_q = new SoundEnvelope();
        this.field_c.a(param0, this.field_q);
    }

    public static void releaseSynthesisBuffers() {
        field_d = null;
        field_i = null;
        field_x = null;
        field_s = null;
        field_o = null;
        field_k = null;
        field_g = null;
        field_f = null;
    }

    final int[] a(int param0, int param1) {
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
        ArrayOperations.clearInts(field_d, 0, param0);
        if (param1 < 10) {
          return field_d;
        }
        var3 = (double)param0 / ((double)param1 + 0.0);
        this.field_u.reset();
        this.field_b.reset();
        var5 = 0;
        var6 = 0;
        var7 = 0;
        if (this.field_j != null) {
          this.field_j.reset();
          this.field_a.reset();
          var5 = (int)((double)(this.field_j.field_j - this.field_j.field_b) * 32.768 / var3);
          var6 = (int)((double)this.field_j.field_b * 32.768 / var3);
        }
        var8 = 0;
        var9 = 0;
        var10 = 0;
        if (this.field_h != null) {
          this.field_h.reset();
          this.field_r.reset();
          var8 = (int)((double)(this.field_h.field_j - this.field_h.field_b) * 32.768 / var3);
          var9 = (int)((double)this.field_h.field_b * 32.768 / var3);
        }
        for (var11 = 0; var11 < 5; var11++) {
          if (this.field_v[var11] != 0) {
            field_s[var11] = 0;
            field_o[var11] = (int)((double)this.field_m[var11] * var3);
            field_k[var11] = (this.field_v[var11] << 14) / 100;
            field_g[var11] = (int)((double)(this.field_u.field_j - this.field_u.field_b) * 32.768 * Math.pow(1.0057929410678534, (double)this.field_p[var11]) / var3);
            field_f[var11] = (int)((double)this.field_u.field_b * 32.768 / var3);
          }
        }
        for (var11Lifetime1 = 0; var11Lifetime1 < param0; var11Lifetime1++) {
          var12 = this.field_u.advance(param0);
          var13 = this.field_b.advance(param0);
          if (this.field_j != null) {
            var14 = this.field_j.advance(param0);
            var15 = this.field_a.advance(param0);
            var12 = var12 + (this.evaluateWaveform(var7, var15, this.field_j.field_g) >> 1);
            var7 = var7 + ((var14 * var5 >> 16) + var6);
          }
          if (this.field_h != null) {
            var14Lifetime3 = this.field_h.advance(param0);
            var15Lifetime3 = this.field_r.advance(param0);
            var13 = var13 * ((this.evaluateWaveform(var10, var15Lifetime3, this.field_h.field_g) >> 1) + 32768) >> 15;
            var10 = var10 + ((var14Lifetime3 * var8 >> 16) + var9);
          }
          for (var14Lifetime4 = 0; var14Lifetime4 < 5; var14Lifetime4++) {
            if (this.field_v[var14Lifetime4] != 0) {
              var15Lifetime4 = var11Lifetime1 + field_o[var14Lifetime4];
              if (var15Lifetime4 < param0) {
                field_d[var15Lifetime4] = field_d[var15Lifetime4] + this.evaluateWaveform(field_s[var14Lifetime4], var13 * field_k[var14Lifetime4] >> 15, this.field_u.field_g);
                field_s[var14Lifetime4] = field_s[var14Lifetime4] + ((var12 * field_g[var14Lifetime4] >> 16) + field_f[var14Lifetime4]);
              }
            }
          }
        }
        if (this.field_e != null) {
          this.field_e.reset();
          this.field_t.reset();
          var11Lifetime2 = 0;
          var12Lifetime1 = 0;
          var13Lifetime1 = 1;
          for (var14Lifetime1 = 0; var14Lifetime1 < param0; var14Lifetime1++) {
            var15Lifetime1 = this.field_e.advance(param0);
            var16 = this.field_t.advance(param0);
            if (var13Lifetime1 == 0) {
              var12Lifetime1Lifetime1 = this.field_e.field_b + ((this.field_e.field_j - this.field_e.field_b) * var16 >> 8);
            } else {
              var12Lifetime1Lifetime1 = this.field_e.field_b + ((this.field_e.field_j - this.field_e.field_b) * var15Lifetime1 >> 8);
            }
            var11Lifetime2 += 256;
            if (var11Lifetime2 >= var12Lifetime1Lifetime1) {
              var11Lifetime2 = 0;
              stackIn_41_0 = (var13Lifetime1 != 0) ? 0 : 1;
              var13Lifetime1 = stackIn_41_0;
            }
            if (var13Lifetime1 != 0) {
              field_d[var14Lifetime1] = 0;
            }
          }
        }
        if (this.field_l > 0 &&
          this.field_n > 0) {
          var11Lifetime3 = (int)((double)this.field_l * var3);
          for (var12Lifetime2 = var11Lifetime3; var12Lifetime2 < param0; var12Lifetime2++) {
            field_d[var12Lifetime2] = field_d[var12Lifetime2] + field_d[var12Lifetime2 - var11Lifetime3] * this.field_n / 100;
          }
        }
        if (!(this.field_c.field_h[0] <= 0) ||
          !(this.field_c.field_h[1] <= 0)) {
          this.field_q.reset();
          var11Lifetime4 = this.field_q.advance(param0 + 1);
          var12Lifetime3 = this.field_c.computeCoefficients(0, (float)var11Lifetime4 / 65536.0f);
          var13Lifetime2 = this.field_c.computeCoefficients(1, (float)var11Lifetime4 / 65536.0f);
          if (param0 >= var12Lifetime3 + var13Lifetime2) {
            var14Lifetime2 = 0;
            var15Lifetime2 = var13Lifetime2;
            if (var15Lifetime2 > param0 - var12Lifetime3) {
              var15Lifetime2 = param0 - var12Lifetime3;
            }
            while (var14Lifetime2 < var15Lifetime2) {
              var16Lifetime1 = (int)((long)field_d[var14Lifetime2 + var12Lifetime3] * (long)SoundFilter.field_g >> 16);
              for (var17 = 0; var17 < var12Lifetime3; var17++) {
                var16Lifetime1 = var16Lifetime1 + (int)((long)field_d[var14Lifetime2 + var12Lifetime3 - 1 - var17] * (long)SoundFilter.field_b[0][var17] >> 16);
              }
              for (var17Lifetime3 = 0; var17Lifetime3 < var14Lifetime2; var17Lifetime3++) {
                var16Lifetime1 = var16Lifetime1 - (int)((long)field_d[var14Lifetime2 - 1 - var17Lifetime3] * (long)SoundFilter.field_b[1][var17Lifetime3] >> 16);
              }
              field_d[var14Lifetime2] = var16Lifetime1;
              var11Lifetime4 = this.field_q.advance(param0 + 1);
              var14Lifetime2++;
            }
            var15Lifetime2Lifetime1 = 128;
            while (true) {
              if (var15Lifetime2Lifetime1 > param0 - var12Lifetime3) {
                var15Lifetime2Lifetime1 = param0 - var12Lifetime3;
              }
              while (var14Lifetime2 < var15Lifetime2Lifetime1) {
                var16Lifetime1Lifetime1 = (int)((long)field_d[var14Lifetime2 + var12Lifetime3] * (long)SoundFilter.field_g >> 16);
                for (var17Lifetime1 = 0; var17Lifetime1 < var12Lifetime3; var17Lifetime1++) {
                  var16Lifetime1Lifetime1 = var16Lifetime1Lifetime1 + (int)((long)field_d[var14Lifetime2 + var12Lifetime3 - 1 - var17Lifetime1] * (long)SoundFilter.field_b[0][var17Lifetime1] >> 16);
                }
                for (var17Lifetime1Lifetime1 = 0; var17Lifetime1Lifetime1 < var13Lifetime2; var17Lifetime1Lifetime1++) {
                  var16Lifetime1Lifetime1 = var16Lifetime1Lifetime1 - (int)((long)field_d[var14Lifetime2 - 1 - var17Lifetime1Lifetime1] * (long)SoundFilter.field_b[1][var17Lifetime1Lifetime1] >> 16);
                }
                field_d[var14Lifetime2] = var16Lifetime1Lifetime1;
                var11Lifetime4 = this.field_q.advance(param0 + 1);
                var14Lifetime2++;
              }
              if (var14Lifetime2 < param0 - var12Lifetime3) {
                var12Lifetime3 = this.field_c.computeCoefficients(0, (float)var11Lifetime4 / 65536.0f);
                var13Lifetime2 = this.field_c.computeCoefficients(1, (float)var11Lifetime4 / 65536.0f);
                var15Lifetime2Lifetime1 += 128;
                continue;
              }
              break;
            }
            while (var14Lifetime2 < param0) {
              var16Lifetime1Lifetime2 = 0;
              for (var17Lifetime2 = var14Lifetime2 + var12Lifetime3 - param0; var17Lifetime2 < var12Lifetime3; var17Lifetime2++) {
                var16Lifetime1Lifetime2 = var16Lifetime1Lifetime2 + (int)((long)field_d[var14Lifetime2 + var12Lifetime3 - 1 - var17Lifetime2] * (long)SoundFilter.field_b[0][var17Lifetime2] >> 16);
              }
              for (var17Lifetime2Lifetime1 = 0; var17Lifetime2Lifetime1 < var13Lifetime2; var17Lifetime2Lifetime1++) {
                var16Lifetime1Lifetime2 = var16Lifetime1Lifetime2 - (int)((long)field_d[var14Lifetime2 - 1 - var17Lifetime2Lifetime1] * (long)SoundFilter.field_b[1][var17Lifetime2Lifetime1] >> 16);
              }
              field_d[var14Lifetime2] = var16Lifetime1Lifetime2;
              var11Lifetime4 = this.field_q.advance(param0 + 1);
              var14Lifetime2++;
            }
          }
        }
        for (var11Lifetime5 = 0; var11Lifetime5 < param0; var11Lifetime5++) {
          if (field_d[var11Lifetime5] < -32768) {
            field_d[var11Lifetime5] = -32768;
          }
          if (field_d[var11Lifetime5] > 32767) {
            field_d[var11Lifetime5] = 32767;
          }
        }
        return field_d;
    }

    private final int evaluateWaveform(int param0, int param1, int param2) {
        if (param2 == 1) {
          if ((param0 & 32767) < 16384) {
            return param1;
          }
          return -param1;
        }
        if (param2 == 2) {
          return field_x[param0 & 32767] * param1 >> 14;
        }
        if (param2 == 3) {
          return ((param0 & 32767) * param1 >> 14) - param1;
        }
        if (param2 == 4) {
          return field_i[param0 / 2607 & 32767] * param1;
        }
        return 0;
    }

    SynthesizedSoundInstrument() {
        this.field_m = new int[]{0, 0, 0, 0, 0};
        this.field_w = 500;
        this.field_p = new int[]{0, 0, 0, 0, 0};
        this.field_n = 100;
        this.field_v = new int[]{0, 0, 0, 0, 0};
        this.field_l = 0;
        this.field_y = 0;
    }

    static {
        int var1 = 0;
        int var1Lifetime1;
        field_i = new int[32768];
        Random var0 = new Random(0L);
        for (var1 = 0; var1 < 32768; var1++) {
          field_i[var1] = (var0.nextInt() & 2) - 1;
        }
        field_x = new int[32768];
        for (var1Lifetime1 = 0; var1Lifetime1 < 32768; var1Lifetime1++) {
          field_x[var1Lifetime1] = (int)(Math.sin((double)var1Lifetime1 / 5215.1903) * 16384.0);
        }
        field_d = new int[220500];
        field_k = new int[5];
        field_f = new int[5];
        field_s = new int[5];
        field_g = new int[5];
        field_o = new int[5];
    }
}
