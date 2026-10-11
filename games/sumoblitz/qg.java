/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class qg {
    private int[] field_b;
    private vj field_j;
    private vj field_r;
    private vj field_f;
    private vj field_o;
    private static int[] field_s;
    private static int[] field_c;
    int field_k;
    private vj field_u;
    private vj field_q;
    private int field_x;
    private int[] field_t;
    private re field_h;
    int field_e;
    private vj field_m;
    private vj field_y;
    private vj field_g;
    private static int[] field_d;
    private static int[] field_i;
    private static int[] field_v;
    private int[] field_l;
    private static int[] field_w;
    private static int[] field_p;
    private static int[] field_a;
    private int field_n;

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
        la.a(field_d, 0, param0);
        if (param1 < 10) {
          return field_d;
        }
        var3 = (double)param0 / ((double)param1 + 0.0);
        this.field_j.a();
        this.field_o.a();
        var5 = 0;
        var6 = 0;
        var7 = 0;
        if (this.field_m != null) {
          this.field_m.a();
          this.field_q.a();
          var5 = (int)((double)(this.field_m.field_d - this.field_m.field_b) * 32.768 / var3);
          var6 = (int)((double)this.field_m.field_b * 32.768 / var3);
        }
        var8 = 0;
        var9 = 0;
        var10 = 0;
        if (this.field_g != null) {
          this.field_g.a();
          this.field_r.a();
          var8 = (int)((double)(this.field_g.field_d - this.field_g.field_b) * 32.768 / var3);
          var9 = (int)((double)this.field_g.field_b * 32.768 / var3);
        }
        for (var11 = 0; var11 < 5; var11++) {
          if (this.field_l[var11] != 0) {
            field_p[var11] = 0;
            field_a[var11] = (int)((double)this.field_b[var11] * var3);
            field_i[var11] = (this.field_l[var11] << 14) / 100;
            field_w[var11] = (int)((double)(this.field_j.field_d - this.field_j.field_b) * 32.768 * Math.pow(1.0057929410678534, (double)this.field_t[var11]) / var3);
            field_v[var11] = (int)((double)this.field_j.field_b * 32.768 / var3);
          }
        }
        for (var11Lifetime1 = 0; var11Lifetime1 < param0; var11Lifetime1++) {
          var12 = this.field_j.a(param0);
          var13 = this.field_o.a(param0);
          if (this.field_m != null) {
            var14 = this.field_m.a(param0);
            var15 = this.field_q.a(param0);
            var12 = var12 + (this.a(var7, var15, this.field_m.field_a) >> 1);
            var7 = var7 + ((var14 * var5 >> 16) + var6);
          }
          if (this.field_g != null) {
            var14Lifetime3 = this.field_g.a(param0);
            var15Lifetime3 = this.field_r.a(param0);
            var13 = var13 * ((this.a(var10, var15Lifetime3, this.field_g.field_a) >> 1) + 32768) >> 15;
            var10 = var10 + ((var14Lifetime3 * var8 >> 16) + var9);
          }
          for (var14Lifetime4 = 0; var14Lifetime4 < 5; var14Lifetime4++) {
            if (this.field_l[var14Lifetime4] != 0) {
              var15Lifetime4 = var11Lifetime1 + field_a[var14Lifetime4];
              if (var15Lifetime4 < param0) {
                field_d[var15Lifetime4] = field_d[var15Lifetime4] + this.a(field_p[var14Lifetime4], var13 * field_i[var14Lifetime4] >> 15, this.field_j.field_a);
                field_p[var14Lifetime4] = field_p[var14Lifetime4] + ((var12 * field_w[var14Lifetime4] >> 16) + field_v[var14Lifetime4]);
              }
            }
          }
        }
        if (this.field_y != null) {
          this.field_y.a();
          this.field_f.a();
          var11Lifetime2 = 0;
          var12Lifetime1 = 0;
          var13Lifetime1 = 1;
          for (var14Lifetime1 = 0; var14Lifetime1 < param0; var14Lifetime1++) {
            var15Lifetime1 = this.field_y.a(param0);
            var16 = this.field_f.a(param0);
            if (var13Lifetime1 == 0) {
              var12Lifetime1Lifetime1 = this.field_y.field_b + ((this.field_y.field_d - this.field_y.field_b) * var16 >> 8);
            } else {
              var12Lifetime1Lifetime1 = this.field_y.field_b + ((this.field_y.field_d - this.field_y.field_b) * var15Lifetime1 >> 8);
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
        if (this.field_n > 0 &&
          this.field_x > 0) {
          var11Lifetime3 = (int)((double)this.field_n * var3);
          for (var12Lifetime2 = var11Lifetime3; var12Lifetime2 < param0; var12Lifetime2++) {
            field_d[var12Lifetime2] = field_d[var12Lifetime2] + field_d[var12Lifetime2 - var11Lifetime3] * this.field_x / 100;
          }
        }
        if (!(this.field_h.field_g[0] <= 0) ||
          !(this.field_h.field_g[1] <= 0)) {
          this.field_u.a();
          var11Lifetime4 = this.field_u.a(param0 + 1);
          var12Lifetime3 = this.field_h.a(0, (float)var11Lifetime4 / 65536.0f);
          var13Lifetime2 = this.field_h.a(1, (float)var11Lifetime4 / 65536.0f);
          if (param0 >= var12Lifetime3 + var13Lifetime2) {
            var14Lifetime2 = 0;
            var15Lifetime2 = var13Lifetime2;
            if (var15Lifetime2 > param0 - var12Lifetime3) {
              var15Lifetime2 = param0 - var12Lifetime3;
            }
            while (var14Lifetime2 < var15Lifetime2) {
              var16Lifetime1 = (int)((long)field_d[var14Lifetime2 + var12Lifetime3] * (long)re.field_e >> 16);
              for (var17 = 0; var17 < var12Lifetime3; var17++) {
                var16Lifetime1 = var16Lifetime1 + (int)((long)field_d[var14Lifetime2 + var12Lifetime3 - 1 - var17] * (long)re.field_f[0][var17] >> 16);
              }
              for (var17Lifetime3 = 0; var17Lifetime3 < var14Lifetime2; var17Lifetime3++) {
                var16Lifetime1 = var16Lifetime1 - (int)((long)field_d[var14Lifetime2 - 1 - var17Lifetime3] * (long)re.field_f[1][var17Lifetime3] >> 16);
              }
              field_d[var14Lifetime2] = var16Lifetime1;
              var11Lifetime4 = this.field_u.a(param0 + 1);
              var14Lifetime2++;
            }
            var15Lifetime2Lifetime1 = 128;
            while (true) {
              if (var15Lifetime2Lifetime1 > param0 - var12Lifetime3) {
                var15Lifetime2Lifetime1 = param0 - var12Lifetime3;
              }
              while (var14Lifetime2 < var15Lifetime2Lifetime1) {
                var16Lifetime1Lifetime1 = (int)((long)field_d[var14Lifetime2 + var12Lifetime3] * (long)re.field_e >> 16);
                for (var17Lifetime1 = 0; var17Lifetime1 < var12Lifetime3; var17Lifetime1++) {
                  var16Lifetime1Lifetime1 = var16Lifetime1Lifetime1 + (int)((long)field_d[var14Lifetime2 + var12Lifetime3 - 1 - var17Lifetime1] * (long)re.field_f[0][var17Lifetime1] >> 16);
                }
                for (var17Lifetime1Lifetime1 = 0; var17Lifetime1Lifetime1 < var13Lifetime2; var17Lifetime1Lifetime1++) {
                  var16Lifetime1Lifetime1 = var16Lifetime1Lifetime1 - (int)((long)field_d[var14Lifetime2 - 1 - var17Lifetime1Lifetime1] * (long)re.field_f[1][var17Lifetime1Lifetime1] >> 16);
                }
                field_d[var14Lifetime2] = var16Lifetime1Lifetime1;
                var11Lifetime4 = this.field_u.a(param0 + 1);
                var14Lifetime2++;
              }
              if (var14Lifetime2 < param0 - var12Lifetime3) {
                var12Lifetime3 = this.field_h.a(0, (float)var11Lifetime4 / 65536.0f);
                var13Lifetime2 = this.field_h.a(1, (float)var11Lifetime4 / 65536.0f);
                var15Lifetime2Lifetime1 += 128;
                continue;
              }
              break;
            }
            while (var14Lifetime2 < param0) {
              var16Lifetime1Lifetime2 = 0;
              for (var17Lifetime2 = var14Lifetime2 + var12Lifetime3 - param0; var17Lifetime2 < var12Lifetime3; var17Lifetime2++) {
                var16Lifetime1Lifetime2 = var16Lifetime1Lifetime2 + (int)((long)field_d[var14Lifetime2 + var12Lifetime3 - 1 - var17Lifetime2] * (long)re.field_f[0][var17Lifetime2] >> 16);
              }
              for (var17Lifetime2Lifetime1 = 0; var17Lifetime2Lifetime1 < var13Lifetime2; var17Lifetime2Lifetime1++) {
                var16Lifetime1Lifetime2 = var16Lifetime1Lifetime2 - (int)((long)field_d[var14Lifetime2 - 1 - var17Lifetime2Lifetime1] * (long)re.field_f[1][var17Lifetime2Lifetime1] >> 16);
              }
              field_d[var14Lifetime2] = var16Lifetime1Lifetime2;
              var11Lifetime4 = this.field_u.a(param0 + 1);
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

    public static void a() {
        field_d = null;
        field_c = null;
        field_s = null;
        field_p = null;
        field_a = null;
        field_i = null;
        field_w = null;
        field_v = null;
    }

    final void a(fs param0) {
        int var3 = 0;
        int var4 = 0;
        this.field_j = new vj();
        this.field_j.a(param0);
        this.field_o = new vj();
        this.field_o.a(param0);
        int var2 = param0.e(-31302);
        if (var2 != 0) {
          param0.field_p = param0.field_p - 1;
          this.field_m = new vj();
          this.field_m.a(param0);
          this.field_q = new vj();
          this.field_q.a(param0);
        }
        var2 = param0.e(-31302);
        if (var2 != 0) {
          param0.field_p = param0.field_p - 1;
          this.field_g = new vj();
          this.field_g.a(param0);
          this.field_r = new vj();
          this.field_r.a(param0);
        }
        var2 = param0.e(-31302);
        if (var2 != 0) {
          param0.field_p = param0.field_p - 1;
          this.field_y = new vj();
          this.field_y.a(param0);
          this.field_f = new vj();
          this.field_f.a(param0);
        }
        for (var3 = 0; var3 < 10; var3++) {
          var4 = param0.e(false);
          if (var4 == 0) {
            break;
          }
          this.field_l[var3] = var4;
          this.field_t[var3] = param0.h(-2858);
          this.field_b[var3] = param0.e(false);
        }
        this.field_n = param0.e(false);
        this.field_x = param0.e(false);
        this.field_k = param0.a(255);
        this.field_e = param0.a(255);
        this.field_h = new re();
        this.field_u = new vj();
        this.field_h.a(param0, this.field_u);
    }

    private final int a(int param0, int param1, int param2) {
        if (param2 == 1) {
          if ((param0 & 32767) < 16384) {
            return param1;
          }
          return -param1;
        }
        if (param2 == 2) {
          return field_s[param0 & 32767] * param1 >> 14;
        }
        if (param2 == 3) {
          return ((param0 & 32767) * param1 >> 14) - param1;
        }
        if (param2 == 4) {
          return field_c[param0 / 2607 & 32767] * param1;
        }
        return 0;
    }

    qg() {
        this.field_b = new int[]{0, 0, 0, 0, 0};
        this.field_e = 0;
        this.field_t = new int[]{0, 0, 0, 0, 0};
        this.field_x = 100;
        this.field_l = new int[]{0, 0, 0, 0, 0};
        this.field_k = 500;
        this.field_n = 0;
    }

    static {
        int var1 = 0;
        int var1Lifetime1;
        field_c = new int[32768];
        Random var0 = new Random(0L);
        for (var1 = 0; var1 < 32768; var1++) {
          field_c[var1] = (var0.nextInt() & 2) - 1;
        }
        field_s = new int[32768];
        for (var1Lifetime1 = 0; var1Lifetime1 < 32768; var1Lifetime1++) {
          field_s[var1Lifetime1] = (int)(Math.sin((double)var1Lifetime1 / 5215.1903) * 16384.0);
        }
        field_d = new int[220500];
        field_i = new int[5];
        field_p = new int[5];
        field_w = new int[5];
        field_a = new int[5];
        field_v = new int[5];
    }
}
