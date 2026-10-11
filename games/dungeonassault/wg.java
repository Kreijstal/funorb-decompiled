/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class wg {
    private int[] field_h;
    private int field_t;
    private static int[] field_r;
    int field_o;
    private int[] field_g;
    private static int[] field_q;
    private fh field_n;
    private fh field_f;
    private fh field_m;
    private fh field_d;
    private int field_k;
    private fh field_i;
    private bi field_x;
    private fh field_v;
    private int[] field_u;
    private fh field_c;
    private fh field_p;
    private static int[] field_b;
    int field_s;
    private fh field_l;
    private static int[] field_y;
    private static int[] field_j;
    private static int[] field_a;
    private static int[] field_e;
    private static int[] field_w;

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
        cj.a(field_r, 0, param0);
        if (param1 < 10) {
          return field_r;
        }
        var3 = (double)param0 / ((double)param1 + 0.0);
        this.field_d.a();
        this.field_m.a();
        var5 = 0;
        var6 = 0;
        var7 = 0;
        if (this.field_n != null) {
          this.field_n.a();
          this.field_v.a();
          var5 = (int)((double)(this.field_n.field_j - this.field_n.field_c) * 32.768 / var3);
          var6 = (int)((double)this.field_n.field_c * 32.768 / var3);
        }
        var8 = 0;
        var9 = 0;
        var10 = 0;
        if (this.field_p != null) {
          this.field_p.a();
          this.field_c.a();
          var8 = (int)((double)(this.field_p.field_j - this.field_p.field_c) * 32.768 / var3);
          var9 = (int)((double)this.field_p.field_c * 32.768 / var3);
        }
        for (var11 = 0; var11 < 5; var11++) {
          if (this.field_g[var11] != 0) {
            field_w[var11] = 0;
            field_a[var11] = (int)((double)this.field_u[var11] * var3);
            field_e[var11] = (this.field_g[var11] << 14) / 100;
            field_j[var11] = (int)((double)(this.field_d.field_j - this.field_d.field_c) * 32.768 * Math.pow(1.0057929410678534, (double)this.field_h[var11]) / var3);
            field_y[var11] = (int)((double)this.field_d.field_c * 32.768 / var3);
          }
        }
        for (var11Lifetime1 = 0; var11Lifetime1 < param0; var11Lifetime1++) {
          var12 = this.field_d.a(param0);
          var13 = this.field_m.a(param0);
          if (this.field_n != null) {
            var14 = this.field_n.a(param0);
            var15 = this.field_v.a(param0);
            var12 = var12 + (this.a(var7, var15, this.field_n.field_d) >> 1);
            var7 = var7 + ((var14 * var5 >> 16) + var6);
          }
          if (this.field_p != null) {
            var14Lifetime3 = this.field_p.a(param0);
            var15Lifetime3 = this.field_c.a(param0);
            var13 = var13 * ((this.a(var10, var15Lifetime3, this.field_p.field_d) >> 1) + 32768) >> 15;
            var10 = var10 + ((var14Lifetime3 * var8 >> 16) + var9);
          }
          for (var14Lifetime4 = 0; var14Lifetime4 < 5; var14Lifetime4++) {
            if (this.field_g[var14Lifetime4] != 0) {
              var15Lifetime4 = var11Lifetime1 + field_a[var14Lifetime4];
              if (var15Lifetime4 < param0) {
                field_r[var15Lifetime4] = field_r[var15Lifetime4] + this.a(field_w[var14Lifetime4], var13 * field_e[var14Lifetime4] >> 15, this.field_d.field_d);
                field_w[var14Lifetime4] = field_w[var14Lifetime4] + ((var12 * field_j[var14Lifetime4] >> 16) + field_y[var14Lifetime4]);
              }
            }
          }
        }
        if (this.field_i != null) {
          this.field_i.a();
          this.field_l.a();
          var11Lifetime2 = 0;
          var12Lifetime1 = 0;
          var13Lifetime1 = 1;
          for (var14Lifetime1 = 0; var14Lifetime1 < param0; var14Lifetime1++) {
            var15Lifetime1 = this.field_i.a(param0);
            var16 = this.field_l.a(param0);
            if (var13Lifetime1 == 0) {
              var12Lifetime1Lifetime1 = this.field_i.field_c + ((this.field_i.field_j - this.field_i.field_c) * var16 >> 8);
            } else {
              var12Lifetime1Lifetime1 = this.field_i.field_c + ((this.field_i.field_j - this.field_i.field_c) * var15Lifetime1 >> 8);
            }
            var11Lifetime2 += 256;
            if (var11Lifetime2 >= var12Lifetime1Lifetime1) {
              var11Lifetime2 = 0;
              stackIn_41_0 = (var13Lifetime1 != 0) ? 0 : 1;
              var13Lifetime1 = stackIn_41_0;
            }
            if (var13Lifetime1 != 0) {
              field_r[var14Lifetime1] = 0;
            }
          }
        }
        if (this.field_k > 0 &&
          this.field_t > 0) {
          var11Lifetime3 = (int)((double)this.field_k * var3);
          for (var12Lifetime2 = var11Lifetime3; var12Lifetime2 < param0; var12Lifetime2++) {
            field_r[var12Lifetime2] = field_r[var12Lifetime2] + field_r[var12Lifetime2 - var11Lifetime3] * this.field_t / 100;
          }
        }
        if (!(this.field_x.field_e[0] <= 0) ||
          !(this.field_x.field_e[1] <= 0)) {
          this.field_f.a();
          var11Lifetime4 = this.field_f.a(param0 + 1);
          var12Lifetime3 = this.field_x.a(0, (float)var11Lifetime4 / 65536.0f);
          var13Lifetime2 = this.field_x.a(1, (float)var11Lifetime4 / 65536.0f);
          if (param0 >= var12Lifetime3 + var13Lifetime2) {
            var14Lifetime2 = 0;
            var15Lifetime2 = var13Lifetime2;
            if (var15Lifetime2 > param0 - var12Lifetime3) {
              var15Lifetime2 = param0 - var12Lifetime3;
            }
            while (var14Lifetime2 < var15Lifetime2) {
              var16Lifetime1 = (int)((long)field_r[var14Lifetime2 + var12Lifetime3] * (long)bi.field_d >> 16);
              for (var17 = 0; var17 < var12Lifetime3; var17++) {
                var16Lifetime1 = var16Lifetime1 + (int)((long)field_r[var14Lifetime2 + var12Lifetime3 - 1 - var17] * (long)bi.field_c[0][var17] >> 16);
              }
              for (var17Lifetime3 = 0; var17Lifetime3 < var14Lifetime2; var17Lifetime3++) {
                var16Lifetime1 = var16Lifetime1 - (int)((long)field_r[var14Lifetime2 - 1 - var17Lifetime3] * (long)bi.field_c[1][var17Lifetime3] >> 16);
              }
              field_r[var14Lifetime2] = var16Lifetime1;
              var11Lifetime4 = this.field_f.a(param0 + 1);
              var14Lifetime2++;
            }
            var15Lifetime2Lifetime1 = 128;
            while (true) {
              if (var15Lifetime2Lifetime1 > param0 - var12Lifetime3) {
                var15Lifetime2Lifetime1 = param0 - var12Lifetime3;
              }
              while (var14Lifetime2 < var15Lifetime2Lifetime1) {
                var16Lifetime1Lifetime1 = (int)((long)field_r[var14Lifetime2 + var12Lifetime3] * (long)bi.field_d >> 16);
                for (var17Lifetime1 = 0; var17Lifetime1 < var12Lifetime3; var17Lifetime1++) {
                  var16Lifetime1Lifetime1 = var16Lifetime1Lifetime1 + (int)((long)field_r[var14Lifetime2 + var12Lifetime3 - 1 - var17Lifetime1] * (long)bi.field_c[0][var17Lifetime1] >> 16);
                }
                for (var17Lifetime1Lifetime1 = 0; var17Lifetime1Lifetime1 < var13Lifetime2; var17Lifetime1Lifetime1++) {
                  var16Lifetime1Lifetime1 = var16Lifetime1Lifetime1 - (int)((long)field_r[var14Lifetime2 - 1 - var17Lifetime1Lifetime1] * (long)bi.field_c[1][var17Lifetime1Lifetime1] >> 16);
                }
                field_r[var14Lifetime2] = var16Lifetime1Lifetime1;
                var11Lifetime4 = this.field_f.a(param0 + 1);
                var14Lifetime2++;
              }
              if (var14Lifetime2 < param0 - var12Lifetime3) {
                var12Lifetime3 = this.field_x.a(0, (float)var11Lifetime4 / 65536.0f);
                var13Lifetime2 = this.field_x.a(1, (float)var11Lifetime4 / 65536.0f);
                var15Lifetime2Lifetime1 += 128;
                continue;
              }
              break;
            }
            while (var14Lifetime2 < param0) {
              var16Lifetime1Lifetime2 = 0;
              for (var17Lifetime2 = var14Lifetime2 + var12Lifetime3 - param0; var17Lifetime2 < var12Lifetime3; var17Lifetime2++) {
                var16Lifetime1Lifetime2 = var16Lifetime1Lifetime2 + (int)((long)field_r[var14Lifetime2 + var12Lifetime3 - 1 - var17Lifetime2] * (long)bi.field_c[0][var17Lifetime2] >> 16);
              }
              for (var17Lifetime2Lifetime1 = 0; var17Lifetime2Lifetime1 < var13Lifetime2; var17Lifetime2Lifetime1++) {
                var16Lifetime1Lifetime2 = var16Lifetime1Lifetime2 - (int)((long)field_r[var14Lifetime2 - 1 - var17Lifetime2Lifetime1] * (long)bi.field_c[1][var17Lifetime2Lifetime1] >> 16);
              }
              field_r[var14Lifetime2] = var16Lifetime1Lifetime2;
              var11Lifetime4 = this.field_f.a(param0 + 1);
              var14Lifetime2++;
            }
          }
        }
        for (var11Lifetime5 = 0; var11Lifetime5 < param0; var11Lifetime5++) {
          if (field_r[var11Lifetime5] < -32768) {
            field_r[var11Lifetime5] = -32768;
          }
          if (field_r[var11Lifetime5] > 32767) {
            field_r[var11Lifetime5] = 32767;
          }
        }
        return field_r;
    }

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
          return field_q[param0 / 2607 & 32767] * param1;
        }
        return 0;
    }

    final void a(ec param0) {
        int var3 = 0;
        int var4 = 0;
        this.field_d = new fh();
        this.field_d.b(param0);
        this.field_m = new fh();
        this.field_m.b(param0);
        int var2 = param0.c(true);
        if (var2 != 0) {
          param0.field_o = param0.field_o - 1;
          this.field_n = new fh();
          this.field_n.b(param0);
          this.field_v = new fh();
          this.field_v.b(param0);
        }
        var2 = param0.c(true);
        if (var2 != 0) {
          param0.field_o = param0.field_o - 1;
          this.field_p = new fh();
          this.field_p.b(param0);
          this.field_c = new fh();
          this.field_c.b(param0);
        }
        var2 = param0.c(true);
        if (var2 != 0) {
          param0.field_o = param0.field_o - 1;
          this.field_i = new fh();
          this.field_i.b(param0);
          this.field_l = new fh();
          this.field_l.b(param0);
        }
        for (var3 = 0; var3 < 10; var3++) {
          var4 = param0.d((byte) 58);
          if (var4 == 0) {
            break;
          }
          this.field_g[var3] = var4;
          this.field_h[var3] = param0.l(0);
          this.field_u[var3] = param0.d((byte) 58);
        }
        this.field_k = param0.d((byte) 58);
        this.field_t = param0.d((byte) 58);
        this.field_s = param0.k(0);
        this.field_o = param0.k(0);
        this.field_x = new bi();
        this.field_f = new fh();
        this.field_x.a(param0, this.field_f);
    }

    public static void a() {
        field_r = null;
        field_q = null;
        field_b = null;
        field_w = null;
        field_a = null;
        field_e = null;
        field_j = null;
        field_y = null;
    }

    wg() {
        this.field_g = new int[]{0, 0, 0, 0, 0};
        this.field_o = 0;
        this.field_t = 100;
        this.field_k = 0;
        this.field_h = new int[]{0, 0, 0, 0, 0};
        this.field_u = new int[]{0, 0, 0, 0, 0};
        this.field_s = 500;
    }

    static {
        int var1 = 0;
        int var1Lifetime1;
        field_q = new int[32768];
        Random var0 = new Random(0L);
        for (var1 = 0; var1 < 32768; var1++) {
          field_q[var1] = (var0.nextInt() & 2) - 1;
        }
        field_b = new int[32768];
        for (var1Lifetime1 = 0; var1Lifetime1 < 32768; var1Lifetime1++) {
          field_b[var1Lifetime1] = (int)(Math.sin((double)var1Lifetime1 / 5215.1903) * 16384.0);
        }
        field_r = new int[220500];
        field_y = new int[5];
        field_j = new int[5];
        field_a = new int[5];
        field_e = new int[5];
        field_w = new int[5];
    }
}
