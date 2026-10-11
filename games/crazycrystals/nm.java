/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class nm {
    private ml field_h;
    private ml field_p;
    private ml field_c;
    private static int[] field_b;
    private ml field_f;
    private ml field_d;
    private int[] field_r;
    private int[] field_y;
    int field_g;
    private ml field_q;
    private ml field_j;
    private ml field_t;
    private static int[] field_k;
    private static int[] field_x;
    private bk field_v;
    private static int[] field_e;
    int field_w;
    private static int[] field_o;
    private ml field_l;
    private int field_n;
    private static int[] field_i;
    private static int[] field_m;
    private static int[] field_s;
    private int field_a;
    private int[] field_u;

    private final int a(int param0, int param1, int param2) {
        if (param2 == 1) {
          if ((param0 & 32767) < 16384) {
            return param1;
          }
          return -param1;
        }
        if (param2 == 2) {
          return field_b[param0 & 32767] * param1 >> 14;
        }
        if (param2 == 3) {
          return ((param0 & 32767) * param1 >> 14) - param1;
        }
        if (param2 == 4) {
          return field_x[param0 / 2607 & 32767] * param1;
        }
        return 0;
    }

    final void a(ng param0) {
        int var3 = 0;
        int var4 = 0;
        this.field_p = new ml();
        this.field_p.b(param0);
        this.field_q = new ml();
        this.field_q.b(param0);
        int var2 = param0.h(255);
        if (var2 != 0) {
          param0.field_f = param0.field_f - 1;
          this.field_c = new ml();
          this.field_c.b(param0);
          this.field_f = new ml();
          this.field_f.b(param0);
        }
        var2 = param0.h(255);
        if (var2 != 0) {
          param0.field_f = param0.field_f - 1;
          this.field_t = new ml();
          this.field_t.b(param0);
          this.field_d = new ml();
          this.field_d.b(param0);
        }
        var2 = param0.h(255);
        if (var2 != 0) {
          param0.field_f = param0.field_f - 1;
          this.field_h = new ml();
          this.field_h.b(param0);
          this.field_l = new ml();
          this.field_l.b(param0);
        }
        for (var3 = 0; var3 < 10; var3++) {
          var4 = param0.c(false);
          if (var4 == 0) {
            break;
          }
          this.field_u[var3] = var4;
          this.field_r[var3] = param0.f(0);
          this.field_y[var3] = param0.c(false);
        }
        this.field_a = param0.c(false);
        this.field_n = param0.c(false);
        this.field_w = param0.c((byte) -7);
        this.field_g = param0.c((byte) -7);
        this.field_v = new bk();
        this.field_j = new ml();
        this.field_v.a(param0, this.field_j);
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
        eg.a(field_k, 0, param0);
        if (param1 < 10) {
          return field_k;
        }
        var3 = (double)param0 / ((double)param1 + 0.0);
        this.field_p.a();
        this.field_q.a();
        var5 = 0;
        var6 = 0;
        var7 = 0;
        if (this.field_c != null) {
          this.field_c.a();
          this.field_f.a();
          var5 = (int)((double)(this.field_c.field_d - this.field_c.field_h) * 32.768 / var3);
          var6 = (int)((double)this.field_c.field_h * 32.768 / var3);
        }
        var8 = 0;
        var9 = 0;
        var10 = 0;
        if (this.field_t != null) {
          this.field_t.a();
          this.field_d.a();
          var8 = (int)((double)(this.field_t.field_d - this.field_t.field_h) * 32.768 / var3);
          var9 = (int)((double)this.field_t.field_h * 32.768 / var3);
        }
        for (var11 = 0; var11 < 5; var11++) {
          if (this.field_u[var11] != 0) {
            field_s[var11] = 0;
            field_e[var11] = (int)((double)this.field_y[var11] * var3);
            field_i[var11] = (this.field_u[var11] << 14) / 100;
            field_m[var11] = (int)((double)(this.field_p.field_d - this.field_p.field_h) * 32.768 * Math.pow(1.0057929410678534, (double)this.field_r[var11]) / var3);
            field_o[var11] = (int)((double)this.field_p.field_h * 32.768 / var3);
          }
        }
        for (var11Lifetime1 = 0; var11Lifetime1 < param0; var11Lifetime1++) {
          var12 = this.field_p.a(param0);
          var13 = this.field_q.a(param0);
          if (this.field_c != null) {
            var14 = this.field_c.a(param0);
            var15 = this.field_f.a(param0);
            var12 = var12 + (this.a(var7, var15, this.field_c.field_c) >> 1);
            var7 = var7 + ((var14 * var5 >> 16) + var6);
          }
          if (this.field_t != null) {
            var14Lifetime3 = this.field_t.a(param0);
            var15Lifetime3 = this.field_d.a(param0);
            var13 = var13 * ((this.a(var10, var15Lifetime3, this.field_t.field_c) >> 1) + 32768) >> 15;
            var10 = var10 + ((var14Lifetime3 * var8 >> 16) + var9);
          }
          for (var14Lifetime4 = 0; var14Lifetime4 < 5; var14Lifetime4++) {
            if (this.field_u[var14Lifetime4] != 0) {
              var15Lifetime4 = var11Lifetime1 + field_e[var14Lifetime4];
              if (var15Lifetime4 < param0) {
                field_k[var15Lifetime4] = field_k[var15Lifetime4] + this.a(field_s[var14Lifetime4], var13 * field_i[var14Lifetime4] >> 15, this.field_p.field_c);
                field_s[var14Lifetime4] = field_s[var14Lifetime4] + ((var12 * field_m[var14Lifetime4] >> 16) + field_o[var14Lifetime4]);
              }
            }
          }
        }
        if (this.field_h != null) {
          this.field_h.a();
          this.field_l.a();
          var11Lifetime2 = 0;
          var12Lifetime1 = 0;
          var13Lifetime1 = 1;
          for (var14Lifetime1 = 0; var14Lifetime1 < param0; var14Lifetime1++) {
            var15Lifetime1 = this.field_h.a(param0);
            var16 = this.field_l.a(param0);
            if (var13Lifetime1 == 0) {
              var12Lifetime1Lifetime1 = this.field_h.field_h + ((this.field_h.field_d - this.field_h.field_h) * var16 >> 8);
            } else {
              var12Lifetime1Lifetime1 = this.field_h.field_h + ((this.field_h.field_d - this.field_h.field_h) * var15Lifetime1 >> 8);
            }
            var11Lifetime2 += 256;
            if (var11Lifetime2 >= var12Lifetime1Lifetime1) {
              var11Lifetime2 = 0;
              stackIn_41_0 = (var13Lifetime1 != 0) ? 0 : 1;
              var13Lifetime1 = stackIn_41_0;
            }
            if (var13Lifetime1 != 0) {
              field_k[var14Lifetime1] = 0;
            }
          }
        }
        if (this.field_a > 0 &&
          this.field_n > 0) {
          var11Lifetime3 = (int)((double)this.field_a * var3);
          for (var12Lifetime2 = var11Lifetime3; var12Lifetime2 < param0; var12Lifetime2++) {
            field_k[var12Lifetime2] = field_k[var12Lifetime2] + field_k[var12Lifetime2 - var11Lifetime3] * this.field_n / 100;
          }
        }
        if (!(this.field_v.field_c[0] <= 0) ||
          !(this.field_v.field_c[1] <= 0)) {
          this.field_j.a();
          var11Lifetime4 = this.field_j.a(param0 + 1);
          var12Lifetime3 = this.field_v.a(0, (float)var11Lifetime4 / 65536.0f);
          var13Lifetime2 = this.field_v.a(1, (float)var11Lifetime4 / 65536.0f);
          if (param0 >= var12Lifetime3 + var13Lifetime2) {
            var14Lifetime2 = 0;
            var15Lifetime2 = var13Lifetime2;
            if (var15Lifetime2 > param0 - var12Lifetime3) {
              var15Lifetime2 = param0 - var12Lifetime3;
            }
            while (var14Lifetime2 < var15Lifetime2) {
              var16Lifetime1 = (int)((long)field_k[var14Lifetime2 + var12Lifetime3] * (long)bk.field_e >> 16);
              for (var17 = 0; var17 < var12Lifetime3; var17++) {
                var16Lifetime1 = var16Lifetime1 + (int)((long)field_k[var14Lifetime2 + var12Lifetime3 - 1 - var17] * (long)bk.field_g[0][var17] >> 16);
              }
              for (var17Lifetime3 = 0; var17Lifetime3 < var14Lifetime2; var17Lifetime3++) {
                var16Lifetime1 = var16Lifetime1 - (int)((long)field_k[var14Lifetime2 - 1 - var17Lifetime3] * (long)bk.field_g[1][var17Lifetime3] >> 16);
              }
              field_k[var14Lifetime2] = var16Lifetime1;
              var11Lifetime4 = this.field_j.a(param0 + 1);
              var14Lifetime2++;
            }
            var15Lifetime2Lifetime1 = 128;
            while (true) {
              if (var15Lifetime2Lifetime1 > param0 - var12Lifetime3) {
                var15Lifetime2Lifetime1 = param0 - var12Lifetime3;
              }
              while (var14Lifetime2 < var15Lifetime2Lifetime1) {
                var16Lifetime1Lifetime1 = (int)((long)field_k[var14Lifetime2 + var12Lifetime3] * (long)bk.field_e >> 16);
                for (var17Lifetime1 = 0; var17Lifetime1 < var12Lifetime3; var17Lifetime1++) {
                  var16Lifetime1Lifetime1 = var16Lifetime1Lifetime1 + (int)((long)field_k[var14Lifetime2 + var12Lifetime3 - 1 - var17Lifetime1] * (long)bk.field_g[0][var17Lifetime1] >> 16);
                }
                for (var17Lifetime1Lifetime1 = 0; var17Lifetime1Lifetime1 < var13Lifetime2; var17Lifetime1Lifetime1++) {
                  var16Lifetime1Lifetime1 = var16Lifetime1Lifetime1 - (int)((long)field_k[var14Lifetime2 - 1 - var17Lifetime1Lifetime1] * (long)bk.field_g[1][var17Lifetime1Lifetime1] >> 16);
                }
                field_k[var14Lifetime2] = var16Lifetime1Lifetime1;
                var11Lifetime4 = this.field_j.a(param0 + 1);
                var14Lifetime2++;
              }
              if (var14Lifetime2 < param0 - var12Lifetime3) {
                var12Lifetime3 = this.field_v.a(0, (float)var11Lifetime4 / 65536.0f);
                var13Lifetime2 = this.field_v.a(1, (float)var11Lifetime4 / 65536.0f);
                var15Lifetime2Lifetime1 += 128;
                continue;
              }
              break;
            }
            while (var14Lifetime2 < param0) {
              var16Lifetime1Lifetime2 = 0;
              for (var17Lifetime2 = var14Lifetime2 + var12Lifetime3 - param0; var17Lifetime2 < var12Lifetime3; var17Lifetime2++) {
                var16Lifetime1Lifetime2 = var16Lifetime1Lifetime2 + (int)((long)field_k[var14Lifetime2 + var12Lifetime3 - 1 - var17Lifetime2] * (long)bk.field_g[0][var17Lifetime2] >> 16);
              }
              for (var17Lifetime2Lifetime1 = 0; var17Lifetime2Lifetime1 < var13Lifetime2; var17Lifetime2Lifetime1++) {
                var16Lifetime1Lifetime2 = var16Lifetime1Lifetime2 - (int)((long)field_k[var14Lifetime2 - 1 - var17Lifetime2Lifetime1] * (long)bk.field_g[1][var17Lifetime2Lifetime1] >> 16);
              }
              field_k[var14Lifetime2] = var16Lifetime1Lifetime2;
              var11Lifetime4 = this.field_j.a(param0 + 1);
              var14Lifetime2++;
            }
          }
        }
        for (var11Lifetime5 = 0; var11Lifetime5 < param0; var11Lifetime5++) {
          if (field_k[var11Lifetime5] < -32768) {
            field_k[var11Lifetime5] = -32768;
          }
          if (field_k[var11Lifetime5] > 32767) {
            field_k[var11Lifetime5] = 32767;
          }
        }
        return field_k;
    }

    public static void a() {
        field_k = null;
        field_x = null;
        field_b = null;
        field_s = null;
        field_e = null;
        field_i = null;
        field_m = null;
        field_o = null;
    }

    nm() {
        this.field_y = new int[]{0, 0, 0, 0, 0};
        this.field_g = 0;
        this.field_r = new int[]{0, 0, 0, 0, 0};
        this.field_n = 100;
        this.field_a = 0;
        this.field_w = 500;
        this.field_u = new int[]{0, 0, 0, 0, 0};
    }

    static {
        int var1 = 0;
        int var1Lifetime1;
        field_x = new int[32768];
        Random var0 = new Random(0L);
        for (var1 = 0; var1 < 32768; var1++) {
          field_x[var1] = (var0.nextInt() & 2) - 1;
        }
        field_b = new int[32768];
        for (var1Lifetime1 = 0; var1Lifetime1 < 32768; var1Lifetime1++) {
          field_b[var1Lifetime1] = (int)(Math.sin((double)var1Lifetime1 / 5215.1903) * 16384.0);
        }
        field_k = new int[220500];
        field_e = new int[5];
        field_o = new int[5];
        field_s = new int[5];
        field_m = new int[5];
        field_i = new int[5];
    }
}
