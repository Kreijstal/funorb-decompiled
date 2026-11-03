/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class SynthInstrument {
    int field_s;
    private AudioFilter field_k;
    private SoundEnvelope field_o;
    int field_a;
    private static int[] field_u;
    private int[] field_y;
    private int[] field_x;
    private int field_f;
    private int[] field_h;
    private SoundEnvelope field_r;
    private SoundEnvelope field_g;
    private SoundEnvelope field_d;
    private static int[] field_j;
    private SoundEnvelope field_m;
    private int field_b;
    private SoundEnvelope field_n;
    private SoundEnvelope field_e;
    private static int[] field_v;
    private SoundEnvelope field_l;
    private static int[] field_p;
    private static int[] field_q;
    private static int[] field_t;
    private SoundEnvelope field_i;
    private static int[] field_c;
    private static int[] field_w;

    public static void clearStatics() {
        field_u = null;
        field_v = null;
        field_j = null;
        field_c = null;
        field_q = null;
        field_p = null;
        field_t = null;
        field_w = null;
    }

    final int[] render(int param0, int param1) {
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
        ArrayOperations.zeroFill(field_u, 0, param0);
        if (param1 < 10) {
          return field_u;
        }
        var3 = (double)param0 / ((double)param1 + 0.0);
        this.field_m.reset();
        this.field_i.reset();
        var5 = 0;
        var6 = 0;
        var7 = 0;
        if (this.field_l != null) {
          this.field_l.reset();
          this.field_d.reset();
          var5 = (int)((double)(this.field_l.field_i - this.field_l.field_d) * 32.768 / var3);
          var6 = (int)((double)this.field_l.field_d * 32.768 / var3);
        }
        var8 = 0;
        var9 = 0;
        var10 = 0;
        if (this.field_g != null) {
          this.field_g.reset();
          this.field_o.reset();
          var8 = (int)((double)(this.field_g.field_i - this.field_g.field_d) * 32.768 / var3);
          var9 = (int)((double)this.field_g.field_d * 32.768 / var3);
        }
        for (var11 = 0; var11 < 5; var11++) {
          if (this.field_y[var11] != 0) {
            field_c[var11] = 0;
            field_q[var11] = (int)((double)this.field_h[var11] * var3);
            field_p[var11] = (this.field_y[var11] << 14) / 100;
            field_t[var11] = (int)((double)(this.field_m.field_i - this.field_m.field_d) * 32.768 * Math.pow(1.0057929410678534, (double)this.field_x[var11]) / var3);
            field_w[var11] = (int)((double)this.field_m.field_d * 32.768 / var3);
          }
        }
        for (var11Lifetime1 = 0; var11Lifetime1 < param0; var11Lifetime1++) {
          var12 = this.field_m.step(param0);
          var13 = this.field_i.step(param0);
          if (this.field_l != null) {
            var14 = this.field_l.step(param0);
            var15 = this.field_d.step(param0);
            var12 = var12 + (this.oscillator(var7, var15, this.field_l.field_f) >> 1);
            var7 = var7 + ((var14 * var5 >> 16) + var6);
          }
          if (this.field_g != null) {
            var14Lifetime3 = this.field_g.step(param0);
            var15Lifetime3 = this.field_o.step(param0);
            var13 = var13 * ((this.oscillator(var10, var15Lifetime3, this.field_g.field_f) >> 1) + 32768) >> 15;
            var10 = var10 + ((var14Lifetime3 * var8 >> 16) + var9);
          }
          for (var14Lifetime4 = 0; var14Lifetime4 < 5; var14Lifetime4++) {
            if (this.field_y[var14Lifetime4] != 0) {
              var15Lifetime4 = var11Lifetime1 + field_q[var14Lifetime4];
              if (var15Lifetime4 < param0) {
                field_u[var15Lifetime4] = field_u[var15Lifetime4] + this.oscillator(field_c[var14Lifetime4], var13 * field_p[var14Lifetime4] >> 15, this.field_m.field_f);
                field_c[var14Lifetime4] = field_c[var14Lifetime4] + ((var12 * field_t[var14Lifetime4] >> 16) + field_w[var14Lifetime4]);
              }
            }
          }
        }
        if (this.field_e != null) {
          this.field_e.reset();
          this.field_r.reset();
          var11Lifetime2 = 0;
          var12Lifetime1 = 0;
          var13Lifetime1 = 1;
          for (var14Lifetime1 = 0; var14Lifetime1 < param0; var14Lifetime1++) {
            var15Lifetime1 = this.field_e.step(param0);
            var16 = this.field_r.step(param0);
            if (var13Lifetime1 == 0) {
              var12Lifetime1Lifetime1 = this.field_e.field_d + ((this.field_e.field_i - this.field_e.field_d) * var16 >> 8);
            } else {
              var12Lifetime1Lifetime1 = this.field_e.field_d + ((this.field_e.field_i - this.field_e.field_d) * var15Lifetime1 >> 8);
            }
            var11Lifetime2 += 256;
            if (var11Lifetime2 >= var12Lifetime1Lifetime1) {
              var11Lifetime2 = 0;
              stackIn_41_0 = (var13Lifetime1 != 0) ? 0 : 1;
              var13Lifetime1 = stackIn_41_0;
            }
            if (var13Lifetime1 != 0) {
              field_u[var14Lifetime1] = 0;
            }
          }
        }
        if (this.field_f > 0 &&
          this.field_b > 0) {
          var11Lifetime3 = (int)((double)this.field_f * var3);
          for (var12Lifetime2 = var11Lifetime3; var12Lifetime2 < param0; var12Lifetime2++) {
            field_u[var12Lifetime2] = field_u[var12Lifetime2] + field_u[var12Lifetime2 - var11Lifetime3] * this.field_b / 100;
          }
        }
        if (!(this.field_k.field_d[0] <= 0) ||
          !(this.field_k.field_d[1] <= 0)) {
          this.field_n.reset();
          var11Lifetime4 = this.field_n.step(param0 + 1);
          var12Lifetime3 = this.field_k.computeCoefficients(0, (float)var11Lifetime4 / 65536.0f);
          var13Lifetime2 = this.field_k.computeCoefficients(1, (float)var11Lifetime4 / 65536.0f);
          if (param0 >= var12Lifetime3 + var13Lifetime2) {
            var14Lifetime2 = 0;
            var15Lifetime2 = var13Lifetime2;
            if (var15Lifetime2 > param0 - var12Lifetime3) {
              var15Lifetime2 = param0 - var12Lifetime3;
            }
            while (var14Lifetime2 < var15Lifetime2) {
              var16Lifetime1 = (int)((long)field_u[var14Lifetime2 + var12Lifetime3] * (long)AudioFilter.field_g >> 16);
              for (var17 = 0; var17 < var12Lifetime3; var17++) {
                var16Lifetime1 = var16Lifetime1 + (int)((long)field_u[var14Lifetime2 + var12Lifetime3 - 1 - var17] * (long)AudioFilter.field_e[0][var17] >> 16);
              }
              for (var17Lifetime3 = 0; var17Lifetime3 < var14Lifetime2; var17Lifetime3++) {
                var16Lifetime1 = var16Lifetime1 - (int)((long)field_u[var14Lifetime2 - 1 - var17Lifetime3] * (long)AudioFilter.field_e[1][var17Lifetime3] >> 16);
              }
              field_u[var14Lifetime2] = var16Lifetime1;
              var11Lifetime4 = this.field_n.step(param0 + 1);
              var14Lifetime2++;
            }
            var15Lifetime2Lifetime1 = 128;
            while (true) {
              if (var15Lifetime2Lifetime1 > param0 - var12Lifetime3) {
                var15Lifetime2Lifetime1 = param0 - var12Lifetime3;
              }
              while (var14Lifetime2 < var15Lifetime2Lifetime1) {
                var16Lifetime1Lifetime1 = (int)((long)field_u[var14Lifetime2 + var12Lifetime3] * (long)AudioFilter.field_g >> 16);
                for (var17Lifetime1 = 0; var17Lifetime1 < var12Lifetime3; var17Lifetime1++) {
                  var16Lifetime1Lifetime1 = var16Lifetime1Lifetime1 + (int)((long)field_u[var14Lifetime2 + var12Lifetime3 - 1 - var17Lifetime1] * (long)AudioFilter.field_e[0][var17Lifetime1] >> 16);
                }
                for (var17Lifetime1Lifetime1 = 0; var17Lifetime1Lifetime1 < var13Lifetime2; var17Lifetime1Lifetime1++) {
                  var16Lifetime1Lifetime1 = var16Lifetime1Lifetime1 - (int)((long)field_u[var14Lifetime2 - 1 - var17Lifetime1Lifetime1] * (long)AudioFilter.field_e[1][var17Lifetime1Lifetime1] >> 16);
                }
                field_u[var14Lifetime2] = var16Lifetime1Lifetime1;
                var11Lifetime4 = this.field_n.step(param0 + 1);
                var14Lifetime2++;
              }
              if (var14Lifetime2 < param0 - var12Lifetime3) {
                var12Lifetime3 = this.field_k.computeCoefficients(0, (float)var11Lifetime4 / 65536.0f);
                var13Lifetime2 = this.field_k.computeCoefficients(1, (float)var11Lifetime4 / 65536.0f);
                var15Lifetime2Lifetime1 += 128;
                continue;
              }
              break;
            }
            while (var14Lifetime2 < param0) {
              var16Lifetime1Lifetime2 = 0;
              for (var17Lifetime2 = var14Lifetime2 + var12Lifetime3 - param0; var17Lifetime2 < var12Lifetime3; var17Lifetime2++) {
                var16Lifetime1Lifetime2 = var16Lifetime1Lifetime2 + (int)((long)field_u[var14Lifetime2 + var12Lifetime3 - 1 - var17Lifetime2] * (long)AudioFilter.field_e[0][var17Lifetime2] >> 16);
              }
              for (var17Lifetime2Lifetime1 = 0; var17Lifetime2Lifetime1 < var13Lifetime2; var17Lifetime2Lifetime1++) {
                var16Lifetime1Lifetime2 = var16Lifetime1Lifetime2 - (int)((long)field_u[var14Lifetime2 - 1 - var17Lifetime2Lifetime1] * (long)AudioFilter.field_e[1][var17Lifetime2Lifetime1] >> 16);
              }
              field_u[var14Lifetime2] = var16Lifetime1Lifetime2;
              var11Lifetime4 = this.field_n.step(param0 + 1);
              var14Lifetime2++;
            }
          }
        }
        for (var11Lifetime5 = 0; var11Lifetime5 < param0; var11Lifetime5++) {
          if (field_u[var11Lifetime5] < -32768) {
            field_u[var11Lifetime5] = -32768;
          }
          if (field_u[var11Lifetime5] > 32767) {
            field_u[var11Lifetime5] = 32767;
          }
        }
        return field_u;
    }

    final void decode(PacketBuffer param0) {
        int var3 = 0;
        int var4 = 0;
        this.field_m = new SoundEnvelope();
        this.field_m.decode(param0);
        this.field_i = new SoundEnvelope();
        this.field_i.decode(param0);
        int var2 = param0.readUnsignedByte(-127);
        if (var2 != 0) {
          param0.position = param0.position - 1;
          this.field_l = new SoundEnvelope();
          this.field_l.decode(param0);
          this.field_d = new SoundEnvelope();
          this.field_d.decode(param0);
        }
        var2 = param0.readUnsignedByte(-79);
        if (var2 != 0) {
          param0.position = param0.position - 1;
          this.field_g = new SoundEnvelope();
          this.field_g.decode(param0);
          this.field_o = new SoundEnvelope();
          this.field_o.decode(param0);
        }
        var2 = param0.readUnsignedByte(-60);
        if (var2 != 0) {
          param0.position = param0.position - 1;
          this.field_e = new SoundEnvelope();
          this.field_e.decode(param0);
          this.field_r = new SoundEnvelope();
          this.field_r.decode(param0);
        }
        for (var3 = 0; var3 < 10; var3++) {
          var4 = param0.readUnsignedSmart(-1282738780);
          if (var4 == 0) {
            break;
          }
          this.field_y[var3] = var4;
          this.field_x[var3] = param0.readSignedSmart((byte) 65);
          this.field_h[var3] = param0.readUnsignedSmart(-1282738780);
        }
        this.field_f = param0.readUnsignedSmart(-1282738780);
        this.field_b = param0.readUnsignedSmart(-1282738780);
        this.field_a = param0.readUnsignedShort(-20976);
        this.field_s = param0.readUnsignedShort(-20976);
        this.field_k = new AudioFilter();
        this.field_n = new SoundEnvelope();
        this.field_k.decode(param0, this.field_n);
    }

    private final int oscillator(int param0, int param1, int param2) {
        if (param2 == 1) {
          if ((param0 & 32767) < 16384) {
            return param1;
          }
          return -param1;
        }
        if (param2 == 2) {
          return field_j[param0 & 32767] * param1 >> 14;
        }
        if (param2 == 3) {
          return ((param0 & 32767) * param1 >> 14) - param1;
        }
        if (param2 == 4) {
          return field_v[param0 / 2607 & 32767] * param1;
        }
        return 0;
    }

    SynthInstrument() {
        this.field_s = 0;
        this.field_y = new int[]{0, 0, 0, 0, 0};
        this.field_h = new int[]{0, 0, 0, 0, 0};
        this.field_f = 0;
        this.field_b = 100;
        this.field_x = new int[]{0, 0, 0, 0, 0};
        this.field_a = 500;
    }

    static {
        int var1 = 0;
        int var1Lifetime1;
        field_v = new int[32768];
        Random var0 = new Random(0L);
        for (var1 = 0; var1 < 32768; var1++) {
          field_v[var1] = (var0.nextInt() & 2) - 1;
        }
        field_j = new int[32768];
        for (var1Lifetime1 = 0; var1Lifetime1 < 32768; var1Lifetime1++) {
          field_j[var1Lifetime1] = (int)(Math.sin((double)var1Lifetime1 / 5215.1903) * 16384.0);
        }
        field_u = new int[220500];
        field_q = new int[5];
        field_t = new int[5];
        field_p = new int[5];
        field_w = new int[5];
        field_c = new int[5];
    }
}
