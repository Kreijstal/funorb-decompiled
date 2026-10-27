/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class we {
    private SoundEnvelope field_k;
    private SoundEnvelope field_p;
    int field_s;
    private SoundEnvelope field_u;
    private SoundEnvelope field_q;
    private static int[] field_y;
    private static int[] field_m;
    private cl field_n;
    private SoundEnvelope field_d;
    private SoundEnvelope field_e;
    private SoundEnvelope field_r;
    private static int[] field_h;
    private int[] field_v;
    private SoundEnvelope field_a;
    private static int[] field_g;
    private static int[] field_o;
    int field_l;
    private static int[] field_c;
    private int field_w;
    private static int[] field_f;
    private static int[] field_j;
    private SoundEnvelope field_x;
    private int field_b;
    private int[] field_i;
    private int[] field_t;

    private final int a(int param0, int param1, int param2) {
        if (param2 == 1) {
          if ((param0 & 32767) < 16384) {
            return param1;
          }
          return -param1;
        }
        if (param2 == 2) {
          return field_m[param0 & 32767] * param1 >> 14;
        }
        if (param2 == 3) {
          return ((param0 & 32767) * param1 >> 14) - param1;
        }
        if (param2 == 4) {
          return field_h[param0 / 2607 & 32767] * param1;
        }
        return 0;
    }

    final void a(PacketBuffer param0) {
        this.field_u = new SoundEnvelope();
        this.field_u.decode(param0);
        this.field_x = new SoundEnvelope();
        this.field_x.decode(param0);
        int var2 = param0.readUnsignedByte(0);
        if (var2 != 0) {
          param0.position = param0.position - 1;
          this.field_a = new SoundEnvelope();
          this.field_a.decode(param0);
          this.field_d = new SoundEnvelope();
          this.field_d.decode(param0);
        }
        var2 = param0.readUnsignedByte(0);
        if (var2 != 0) {
          param0.position = param0.position - 1;
          this.field_p = new SoundEnvelope();
          this.field_p.decode(param0);
          this.field_k = new SoundEnvelope();
          this.field_k.decode(param0);
        }
        var2 = param0.readUnsignedByte(0);
        if (var2 != 0) {
          param0.position = param0.position - 1;
          this.field_e = new SoundEnvelope();
          this.field_e.decode(param0);
          this.field_r = new SoundEnvelope();
          this.field_r.decode(param0);
        }
        for (int var3 = 0; var3 < 10; var3++) {
          int var4 = param0.readUnsignedSmart(true);
          if (var4 == 0) {
            break;
          }
          this.field_t[var3] = var4;
          this.field_v[var3] = param0.e((byte) 56);
          this.field_i[var3] = param0.readUnsignedSmart(true);
        }
        this.field_b = param0.readUnsignedSmart(true);
        this.field_w = param0.readUnsignedSmart(true);
        this.field_l = param0.readUnsignedShort(1952);
        this.field_s = param0.readUnsignedShort(1952);
        this.field_n = new cl();
        this.field_q = new SoundEnvelope();
        this.field_n.a(param0, this.field_q);
    }

    final int[] a(int param0, int param1) {
        int var12Lifetime1Lifetime1;
        qg.a(field_y, 0, param0);
        if (param1 < 10) {
          return field_y;
        }
        double var3 = (double)param0 / ((double)param1 + 0.0);
        this.field_u.reset();
        this.field_x.reset();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field_a != null) {
          this.field_a.reset();
          this.field_d.reset();
          var5 = (int)((double)(this.field_a.end - this.field_a.start) * 32.768 / var3);
          var6 = (int)((double)this.field_a.start * 32.768 / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field_p != null) {
          this.field_p.reset();
          this.field_k.reset();
          var8 = (int)((double)(this.field_p.end - this.field_p.start) * 32.768 / var3);
          var9 = (int)((double)this.field_p.start * 32.768 / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
          if (this.field_t[var11] != 0) {
            field_c[var11] = 0;
            field_j[var11] = (int)((double)this.field_i[var11] * var3);
            field_g[var11] = (this.field_t[var11] << 14) / 100;
            field_o[var11] = (int)((double)(this.field_u.end - this.field_u.start) * 32.768 * Math.pow(1.0057929410678534, (double)this.field_v[var11]) / var3);
            field_f[var11] = (int)((double)this.field_u.start * 32.768 / var3);
          }
        }
        for (int var11Lifetime1 = 0; var11Lifetime1 < param0; var11Lifetime1++) {
          int var12 = this.field_u.advance(param0);
          int var13 = this.field_x.advance(param0);
          if (this.field_a != null) {
            int var14 = this.field_a.advance(param0);
            int var15 = this.field_d.advance(param0);
            var12 = var12 + (this.a(var7, var15, this.field_a.form) >> 1);
            var7 = var7 + ((var14 * var5 >> 16) + var6);
          }
          if (this.field_p != null) {
            int var14Lifetime3 = this.field_p.advance(param0);
            int var15Lifetime3 = this.field_k.advance(param0);
            var13 = var13 * ((this.a(var10, var15Lifetime3, this.field_p.form) >> 1) + 32768) >> 15;
            var10 = var10 + ((var14Lifetime3 * var8 >> 16) + var9);
          }
          for (int var14Lifetime4 = 0; var14Lifetime4 < 5; var14Lifetime4++) {
            if (this.field_t[var14Lifetime4] != 0) {
              int var15Lifetime4 = var11Lifetime1 + field_j[var14Lifetime4];
              if (var15Lifetime4 < param0) {
                field_y[var15Lifetime4] = field_y[var15Lifetime4] + this.a(field_c[var14Lifetime4], var13 * field_g[var14Lifetime4] >> 15, this.field_u.form);
                field_c[var14Lifetime4] = field_c[var14Lifetime4] + ((var12 * field_o[var14Lifetime4] >> 16) + field_f[var14Lifetime4]);
              }
            }
          }
        }
        if (this.field_e != null) {
          this.field_e.reset();
          this.field_r.reset();
          int var11Lifetime2 = 0;
          int var12Lifetime1 = 0;
          boolean var13Lifetime1 = true;
          for (int var14Lifetime1 = 0; var14Lifetime1 < param0; var14Lifetime1++) {
            int var15Lifetime1 = this.field_e.advance(param0);
            int var16 = this.field_r.advance(param0);
            if (!var13Lifetime1) {
              var12Lifetime1Lifetime1 = this.field_e.start + ((this.field_e.end - this.field_e.start) * var16 >> 8);
            } else {
              var12Lifetime1Lifetime1 = this.field_e.start + ((this.field_e.end - this.field_e.start) * var15Lifetime1 >> 8);
            }
            var11Lifetime2 += 256;
            if (var11Lifetime2 >= var12Lifetime1Lifetime1) {
              var11Lifetime2 = 0;
              boolean stackIn_41_0 = !((var13Lifetime1));
              var13Lifetime1 = stackIn_41_0;
            }
            if (var13Lifetime1) {
              field_y[var14Lifetime1] = 0;
            }
          }
        }
        if (this.field_b > 0 &&
          this.field_w > 0) {
          int var11Lifetime3 = (int)((double)this.field_b * var3);
          for (int var12Lifetime2 = var11Lifetime3; var12Lifetime2 < param0; var12Lifetime2++) {
            field_y[var12Lifetime2] = field_y[var12Lifetime2] + field_y[var12Lifetime2 - var11Lifetime3] * this.field_w / 100;
          }
        }
        if (!(this.field_n.field_g[0] <= 0) ||
          !(this.field_n.field_g[1] <= 0)) {
          this.field_q.reset();
          int var11Lifetime4 = this.field_q.advance(param0 + 1);
          int var12Lifetime3 = this.field_n.a(0, (float)var11Lifetime4 / 65536.0f);
          int var13Lifetime2 = this.field_n.a(1, (float)var11Lifetime4 / 65536.0f);
          if (param0 >= var12Lifetime3 + var13Lifetime2) {
            int var14Lifetime2 = 0;
            int var15Lifetime2 = var13Lifetime2;
            if (var15Lifetime2 > param0 - var12Lifetime3) {
              var15Lifetime2 = param0 - var12Lifetime3;
            }
            while (var14Lifetime2 < var15Lifetime2) {
              int var16Lifetime1 = (int)((long)field_y[var14Lifetime2 + var12Lifetime3] * (long)cl.field_c >> 16);
              for (int var17 = 0; var17 < var12Lifetime3; var17++) {
                var16Lifetime1 = var16Lifetime1 + (int)((long)field_y[var14Lifetime2 + var12Lifetime3 - 1 - var17] * (long)cl.field_b[0][var17] >> 16);
              }
              for (int var17Lifetime3 = 0; var17Lifetime3 < var14Lifetime2; var17Lifetime3++) {
                var16Lifetime1 = var16Lifetime1 - (int)((long)field_y[var14Lifetime2 - 1 - var17Lifetime3] * (long)cl.field_b[1][var17Lifetime3] >> 16);
              }
              field_y[var14Lifetime2] = var16Lifetime1;
              var11Lifetime4 = this.field_q.advance(param0 + 1);
              var14Lifetime2++;
            }
            int var15Lifetime2Lifetime1 = 128;
            while (true) {
              if (var15Lifetime2Lifetime1 > param0 - var12Lifetime3) {
                var15Lifetime2Lifetime1 = param0 - var12Lifetime3;
              }
              while (var14Lifetime2 < var15Lifetime2Lifetime1) {
                int var16Lifetime1Lifetime1 = (int)((long)field_y[var14Lifetime2 + var12Lifetime3] * (long)cl.field_c >> 16);
                for (int var17Lifetime1 = 0; var17Lifetime1 < var12Lifetime3; var17Lifetime1++) {
                  var16Lifetime1Lifetime1 = var16Lifetime1Lifetime1 + (int)((long)field_y[var14Lifetime2 + var12Lifetime3 - 1 - var17Lifetime1] * (long)cl.field_b[0][var17Lifetime1] >> 16);
                }
                for (int var17Lifetime1Lifetime1 = 0; var17Lifetime1Lifetime1 < var13Lifetime2; var17Lifetime1Lifetime1++) {
                  var16Lifetime1Lifetime1 = var16Lifetime1Lifetime1 - (int)((long)field_y[var14Lifetime2 - 1 - var17Lifetime1Lifetime1] * (long)cl.field_b[1][var17Lifetime1Lifetime1] >> 16);
                }
                field_y[var14Lifetime2] = var16Lifetime1Lifetime1;
                var11Lifetime4 = this.field_q.advance(param0 + 1);
                var14Lifetime2++;
              }
              if (var14Lifetime2 < param0 - var12Lifetime3) {
                var12Lifetime3 = this.field_n.a(0, (float)var11Lifetime4 / 65536.0f);
                var13Lifetime2 = this.field_n.a(1, (float)var11Lifetime4 / 65536.0f);
                var15Lifetime2Lifetime1 += 128;
                continue;
              }
              break;
            }
            while (var14Lifetime2 < param0) {
              int var16Lifetime1Lifetime2 = 0;
              for (int var17Lifetime2 = var14Lifetime2 + var12Lifetime3 - param0; var17Lifetime2 < var12Lifetime3; var17Lifetime2++) {
                var16Lifetime1Lifetime2 = var16Lifetime1Lifetime2 + (int)((long)field_y[var14Lifetime2 + var12Lifetime3 - 1 - var17Lifetime2] * (long)cl.field_b[0][var17Lifetime2] >> 16);
              }
              for (int var17Lifetime2Lifetime1 = 0; var17Lifetime2Lifetime1 < var13Lifetime2; var17Lifetime2Lifetime1++) {
                var16Lifetime1Lifetime2 = var16Lifetime1Lifetime2 - (int)((long)field_y[var14Lifetime2 - 1 - var17Lifetime2Lifetime1] * (long)cl.field_b[1][var17Lifetime2Lifetime1] >> 16);
              }
              field_y[var14Lifetime2] = var16Lifetime1Lifetime2;
              var11Lifetime4 = this.field_q.advance(param0 + 1);
              var14Lifetime2++;
            }
          }
        }
        for (int var11Lifetime5 = 0; var11Lifetime5 < param0; var11Lifetime5++) {
          if (field_y[var11Lifetime5] < -32768) {
            field_y[var11Lifetime5] = -32768;
          }
          if (field_y[var11Lifetime5] > 32767) {
            field_y[var11Lifetime5] = 32767;
          }
        }
        return field_y;
    }

    public static void a() {
        field_y = null;
        field_h = null;
        field_m = null;
        field_c = null;
        field_j = null;
        field_g = null;
        field_o = null;
        field_f = null;
    }

    we() {
        this.field_s = 0;
        this.field_l = 500;
        this.field_v = new int[]{0, 0, 0, 0, 0};
        this.field_w = 100;
        this.field_b = 0;
        this.field_i = new int[]{0, 0, 0, 0, 0};
        this.field_t = new int[]{0, 0, 0, 0, 0};
    }

    static {
        field_h = new int[32768];
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
          field_h[var1] = (var0.nextInt() & 2) - 1;
        }
        field_m = new int[32768];
        for (int var1Lifetime1 = 0; var1Lifetime1 < 32768; var1Lifetime1++) {
          field_m[var1Lifetime1] = (int)(Math.sin((double)var1Lifetime1 / 5215.1903) * 16384.0);
        }
        field_y = new int[220500];
        field_g = new int[5];
        field_c = new int[5];
        field_j = new int[5];
        field_f = new int[5];
        field_o = new int[5];
    }
}
