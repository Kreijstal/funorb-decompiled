/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ke {
    private int[] field_t;
    private ve field_q;
    private static int[] field_p;
    private int[] field_y;
    int field_e;
    private static int[] field_g;
    int field_v;
    private int[] field_j;
    private ve field_s;
    private ve field_o;
    private static int[] field_x;
    private int field_l;
    private int field_n;
    private ve field_f;
    private ve field_i;
    private ve field_u;
    private je field_c;
    private ve field_r;
    private static int[] field_m;
    private static int[] field_d;
    private static int[] field_a;
    private static int[] field_w;
    private ve field_k;
    private ve field_h;
    private static int[] field_b;

    final void a(th param0) {
        int var3 = 0;
        int var4 = 0;
        this.field_r = new ve();
        this.field_r.b(param0);
        this.field_u = new ve();
        this.field_u.b(param0);
        int var2 = param0.f((byte) -43);
        if (var2 != 0) {
          param0.field_l = param0.field_l - 1;
          this.field_o = new ve();
          this.field_o.b(param0);
          this.field_q = new ve();
          this.field_q.b(param0);
        }
        var2 = param0.f((byte) -105);
        if (var2 != 0) {
          param0.field_l = param0.field_l - 1;
          this.field_f = new ve();
          this.field_f.b(param0);
          this.field_k = new ve();
          this.field_k.b(param0);
        }
        var2 = param0.f((byte) -30);
        if (var2 != 0) {
          param0.field_l = param0.field_l - 1;
          this.field_i = new ve();
          this.field_i.b(param0);
          this.field_h = new ve();
          this.field_h.b(param0);
        }
        for (var3 = 0; var3 < 10; var3++) {
          var4 = param0.e(128);
          if (var4 == 0) {
            break;
          }
          this.field_y[var3] = var4;
          this.field_j[var3] = param0.b((byte) -84);
          this.field_t[var3] = param0.e(128);
        }
        this.field_n = param0.e(128);
        this.field_l = param0.e(128);
        this.field_v = param0.k(-48);
        this.field_e = param0.k(-47);
        this.field_c = new je();
        this.field_s = new ve();
        this.field_c.a(param0, this.field_s);
    }

    private final int a(int param0, int param1, int param2) {
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
          return field_p[param0 / 2607 & 32767] * param1;
        }
        return 0;
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
        bc.a(field_g, 0, param0);
        if (param1 < 10) {
          return field_g;
        }
        var3 = (double)param0 / ((double)param1 + 0.0);
        this.field_r.a();
        this.field_u.a();
        var5 = 0;
        var6 = 0;
        var7 = 0;
        if (this.field_o != null) {
          this.field_o.a();
          this.field_q.a();
          var5 = (int)((double)(this.field_o.field_f - this.field_o.field_h) * 32.768 / var3);
          var6 = (int)((double)this.field_o.field_h * 32.768 / var3);
        }
        var8 = 0;
        var9 = 0;
        var10 = 0;
        if (this.field_f != null) {
          this.field_f.a();
          this.field_k.a();
          var8 = (int)((double)(this.field_f.field_f - this.field_f.field_h) * 32.768 / var3);
          var9 = (int)((double)this.field_f.field_h * 32.768 / var3);
        }
        for (var11 = 0; var11 < 5; var11++) {
          if (this.field_y[var11] != 0) {
            field_b[var11] = 0;
            field_w[var11] = (int)((double)this.field_t[var11] * var3);
            field_m[var11] = (this.field_y[var11] << 14) / 100;
            field_d[var11] = (int)((double)(this.field_r.field_f - this.field_r.field_h) * 32.768 * Math.pow(1.0057929410678534, (double)this.field_j[var11]) / var3);
            field_a[var11] = (int)((double)this.field_r.field_h * 32.768 / var3);
          }
        }
        for (var11Lifetime1 = 0; var11Lifetime1 < param0; var11Lifetime1++) {
          var12 = this.field_r.a(param0);
          var13 = this.field_u.a(param0);
          if (this.field_o != null) {
            var14 = this.field_o.a(param0);
            var15 = this.field_q.a(param0);
            var12 = var12 + (this.a(var7, var15, this.field_o.field_g) >> 1);
            var7 = var7 + ((var14 * var5 >> 16) + var6);
          }
          if (this.field_f != null) {
            var14Lifetime3 = this.field_f.a(param0);
            var15Lifetime3 = this.field_k.a(param0);
            var13 = var13 * ((this.a(var10, var15Lifetime3, this.field_f.field_g) >> 1) + 32768) >> 15;
            var10 = var10 + ((var14Lifetime3 * var8 >> 16) + var9);
          }
          for (var14Lifetime4 = 0; var14Lifetime4 < 5; var14Lifetime4++) {
            if (this.field_y[var14Lifetime4] != 0) {
              var15Lifetime4 = var11Lifetime1 + field_w[var14Lifetime4];
              if (var15Lifetime4 < param0) {
                field_g[var15Lifetime4] = field_g[var15Lifetime4] + this.a(field_b[var14Lifetime4], var13 * field_m[var14Lifetime4] >> 15, this.field_r.field_g);
                field_b[var14Lifetime4] = field_b[var14Lifetime4] + ((var12 * field_d[var14Lifetime4] >> 16) + field_a[var14Lifetime4]);
              }
            }
          }
        }
        if (this.field_i != null) {
          this.field_i.a();
          this.field_h.a();
          var11Lifetime2 = 0;
          var12Lifetime1 = 0;
          var13Lifetime1 = 1;
          for (var14Lifetime1 = 0; var14Lifetime1 < param0; var14Lifetime1++) {
            var15Lifetime1 = this.field_i.a(param0);
            var16 = this.field_h.a(param0);
            if (var13Lifetime1 == 0) {
              var12Lifetime1Lifetime1 = this.field_i.field_h + ((this.field_i.field_f - this.field_i.field_h) * var16 >> 8);
            } else {
              var12Lifetime1Lifetime1 = this.field_i.field_h + ((this.field_i.field_f - this.field_i.field_h) * var15Lifetime1 >> 8);
            }
            var11Lifetime2 += 256;
            if (var11Lifetime2 >= var12Lifetime1Lifetime1) {
              var11Lifetime2 = 0;
              stackIn_41_0 = (var13Lifetime1 != 0) ? 0 : 1;
              var13Lifetime1 = stackIn_41_0;
            }
            if (var13Lifetime1 != 0) {
              field_g[var14Lifetime1] = 0;
            }
          }
        }
        if (this.field_n > 0 &&
          this.field_l > 0) {
          var11Lifetime3 = (int)((double)this.field_n * var3);
          for (var12Lifetime2 = var11Lifetime3; var12Lifetime2 < param0; var12Lifetime2++) {
            field_g[var12Lifetime2] = field_g[var12Lifetime2] + field_g[var12Lifetime2 - var11Lifetime3] * this.field_l / 100;
          }
        }
        if (!(this.field_c.field_a[0] <= 0) ||
          !(this.field_c.field_a[1] <= 0)) {
          this.field_s.a();
          var11Lifetime4 = this.field_s.a(param0 + 1);
          var12Lifetime3 = this.field_c.a(0, (float)var11Lifetime4 / 65536.0f);
          var13Lifetime2 = this.field_c.a(1, (float)var11Lifetime4 / 65536.0f);
          if (param0 >= var12Lifetime3 + var13Lifetime2) {
            var14Lifetime2 = 0;
            var15Lifetime2 = var13Lifetime2;
            if (var15Lifetime2 > param0 - var12Lifetime3) {
              var15Lifetime2 = param0 - var12Lifetime3;
            }
            while (var14Lifetime2 < var15Lifetime2) {
              var16Lifetime1 = (int)((long)field_g[var14Lifetime2 + var12Lifetime3] * (long)je.field_d >> 16);
              for (var17 = 0; var17 < var12Lifetime3; var17++) {
                var16Lifetime1 = var16Lifetime1 + (int)((long)field_g[var14Lifetime2 + var12Lifetime3 - 1 - var17] * (long)je.field_f[0][var17] >> 16);
              }
              for (var17Lifetime3 = 0; var17Lifetime3 < var14Lifetime2; var17Lifetime3++) {
                var16Lifetime1 = var16Lifetime1 - (int)((long)field_g[var14Lifetime2 - 1 - var17Lifetime3] * (long)je.field_f[1][var17Lifetime3] >> 16);
              }
              field_g[var14Lifetime2] = var16Lifetime1;
              var11Lifetime4 = this.field_s.a(param0 + 1);
              var14Lifetime2++;
            }
            var15Lifetime2Lifetime1 = 128;
            while (true) {
              if (var15Lifetime2Lifetime1 > param0 - var12Lifetime3) {
                var15Lifetime2Lifetime1 = param0 - var12Lifetime3;
              }
              while (var14Lifetime2 < var15Lifetime2Lifetime1) {
                var16Lifetime1Lifetime1 = (int)((long)field_g[var14Lifetime2 + var12Lifetime3] * (long)je.field_d >> 16);
                for (var17Lifetime1 = 0; var17Lifetime1 < var12Lifetime3; var17Lifetime1++) {
                  var16Lifetime1Lifetime1 = var16Lifetime1Lifetime1 + (int)((long)field_g[var14Lifetime2 + var12Lifetime3 - 1 - var17Lifetime1] * (long)je.field_f[0][var17Lifetime1] >> 16);
                }
                for (var17Lifetime1Lifetime1 = 0; var17Lifetime1Lifetime1 < var13Lifetime2; var17Lifetime1Lifetime1++) {
                  var16Lifetime1Lifetime1 = var16Lifetime1Lifetime1 - (int)((long)field_g[var14Lifetime2 - 1 - var17Lifetime1Lifetime1] * (long)je.field_f[1][var17Lifetime1Lifetime1] >> 16);
                }
                field_g[var14Lifetime2] = var16Lifetime1Lifetime1;
                var11Lifetime4 = this.field_s.a(param0 + 1);
                var14Lifetime2++;
              }
              if (var14Lifetime2 < param0 - var12Lifetime3) {
                var12Lifetime3 = this.field_c.a(0, (float)var11Lifetime4 / 65536.0f);
                var13Lifetime2 = this.field_c.a(1, (float)var11Lifetime4 / 65536.0f);
                var15Lifetime2Lifetime1 += 128;
                continue;
              }
              break;
            }
            while (var14Lifetime2 < param0) {
              var16Lifetime1Lifetime2 = 0;
              for (var17Lifetime2 = var14Lifetime2 + var12Lifetime3 - param0; var17Lifetime2 < var12Lifetime3; var17Lifetime2++) {
                var16Lifetime1Lifetime2 = var16Lifetime1Lifetime2 + (int)((long)field_g[var14Lifetime2 + var12Lifetime3 - 1 - var17Lifetime2] * (long)je.field_f[0][var17Lifetime2] >> 16);
              }
              for (var17Lifetime2Lifetime1 = 0; var17Lifetime2Lifetime1 < var13Lifetime2; var17Lifetime2Lifetime1++) {
                var16Lifetime1Lifetime2 = var16Lifetime1Lifetime2 - (int)((long)field_g[var14Lifetime2 - 1 - var17Lifetime2Lifetime1] * (long)je.field_f[1][var17Lifetime2Lifetime1] >> 16);
              }
              field_g[var14Lifetime2] = var16Lifetime1Lifetime2;
              var11Lifetime4 = this.field_s.a(param0 + 1);
              var14Lifetime2++;
            }
          }
        }
        for (var11Lifetime5 = 0; var11Lifetime5 < param0; var11Lifetime5++) {
          if (field_g[var11Lifetime5] < -32768) {
            field_g[var11Lifetime5] = -32768;
          }
          if (field_g[var11Lifetime5] > 32767) {
            field_g[var11Lifetime5] = 32767;
          }
        }
        return field_g;
    }

    public static void a() {
        field_g = null;
        field_p = null;
        field_x = null;
        field_b = null;
        field_w = null;
        field_m = null;
        field_d = null;
        field_a = null;
    }

    ke() {
        this.field_t = new int[]{0, 0, 0, 0, 0};
        this.field_y = new int[]{0, 0, 0, 0, 0};
        this.field_e = 0;
        this.field_l = 100;
        this.field_j = new int[]{0, 0, 0, 0, 0};
        this.field_n = 0;
        this.field_v = 500;
    }

    static {
        int var1 = 0;
        int var1Lifetime1;
        field_p = new int[32768];
        Random var0 = new Random(0L);
        for (var1 = 0; var1 < 32768; var1++) {
          field_p[var1] = (var0.nextInt() & 2) - 1;
        }
        field_x = new int[32768];
        for (var1Lifetime1 = 0; var1Lifetime1 < 32768; var1Lifetime1++) {
          field_x[var1Lifetime1] = (int)(Math.sin((double)var1Lifetime1 / 5215.1903) * 16384.0);
        }
        field_g = new int[220500];
        field_w = new int[5];
        field_a = new int[5];
        field_d = new int[5];
        field_b = new int[5];
        field_m = new int[5];
    }
}
