/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class je {
    private mk field_x;
    private static int[] field_u;
    private mk field_n;
    private h field_f;
    private int[] field_d;
    private static int[] field_w;
    private int[] field_o;
    int field_s;
    int field_i;
    private int field_q;
    private int[] field_c;
    private mk field_l;
    private mk field_j;
    private mk field_b;
    private int field_p;
    private static int[] field_t;
    private mk field_v;
    private mk field_h;
    private mk field_y;
    private mk field_e;
    private static int[] field_a;
    private static int[] field_r;
    private static int[] field_g;
    private static int[] field_m;
    private static int[] field_k;

    public static void a() {
        field_t = null;
        field_u = null;
        field_w = null;
        field_r = null;
        field_g = null;
        field_m = null;
        field_a = null;
        field_k = null;
    }

    final void a(rb param0) {
        int var3 = 0;
        int var4 = 0;
        this.field_b = new mk();
        this.field_b.a(param0);
        this.field_e = new mk();
        this.field_e.a(param0);
        int var2 = param0.j(7909);
        if (var2 != 0) {
          param0.field_g = param0.field_g - 1;
          this.field_l = new mk();
          this.field_l.a(param0);
          this.field_h = new mk();
          this.field_h.a(param0);
        }
        var2 = param0.j(7909);
        if (var2 != 0) {
          param0.field_g = param0.field_g - 1;
          this.field_y = new mk();
          this.field_y.a(param0);
          this.field_v = new mk();
          this.field_v.a(param0);
        }
        var2 = param0.j(7909);
        if (var2 != 0) {
          param0.field_g = param0.field_g - 1;
          this.field_n = new mk();
          this.field_n.a(param0);
          this.field_x = new mk();
          this.field_x.a(param0);
        }
        for (var3 = 0; var3 < 10; var3++) {
          var4 = param0.d(128);
          if (var4 == 0) {
            break;
          }
          this.field_d[var3] = var4;
          this.field_o[var3] = param0.d((byte) 105);
          this.field_c[var3] = param0.d(128);
        }
        this.field_q = param0.d(128);
        this.field_p = param0.d(128);
        this.field_s = param0.i(-1174051992);
        this.field_i = param0.i(-1174051992);
        this.field_f = new h();
        this.field_j = new mk();
        this.field_f.a(param0, this.field_j);
    }

    private final int a(int param0, int param1, int param2) {
        if (param2 == 1) {
          if ((param0 & 32767) < 16384) {
            return param1;
          }
          return -param1;
        }
        if (param2 == 2) {
          return field_w[param0 & 32767] * param1 >> 14;
        }
        if (param2 == 3) {
          return ((param0 & 32767) * param1 >> 14) - param1;
        }
        if (param2 == 4) {
          return field_u[param0 / 2607 & 32767] * param1;
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
        ug.a(field_t, 0, param0);
        if (param1 < 10) {
          return field_t;
        }
        var3 = (double)param0 / ((double)param1 + 0.0);
        this.field_b.a();
        this.field_e.a();
        var5 = 0;
        var6 = 0;
        var7 = 0;
        if (this.field_l != null) {
          this.field_l.a();
          this.field_h.a();
          var5 = (int)((double)(this.field_l.field_b - this.field_l.field_g) * 32.768 / var3);
          var6 = (int)((double)this.field_l.field_g * 32.768 / var3);
        }
        var8 = 0;
        var9 = 0;
        var10 = 0;
        if (this.field_y != null) {
          this.field_y.a();
          this.field_v.a();
          var8 = (int)((double)(this.field_y.field_b - this.field_y.field_g) * 32.768 / var3);
          var9 = (int)((double)this.field_y.field_g * 32.768 / var3);
        }
        for (var11 = 0; var11 < 5; var11++) {
          if (this.field_d[var11] != 0) {
            field_r[var11] = 0;
            field_g[var11] = (int)((double)this.field_c[var11] * var3);
            field_m[var11] = (this.field_d[var11] << 14) / 100;
            field_a[var11] = (int)((double)(this.field_b.field_b - this.field_b.field_g) * 32.768 * Math.pow(1.0057929410678534, (double)this.field_o[var11]) / var3);
            field_k[var11] = (int)((double)this.field_b.field_g * 32.768 / var3);
          }
        }
        for (var11Lifetime1 = 0; var11Lifetime1 < param0; var11Lifetime1++) {
          var12 = this.field_b.a(param0);
          var13 = this.field_e.a(param0);
          if (this.field_l != null) {
            var14 = this.field_l.a(param0);
            var15 = this.field_h.a(param0);
            var12 = var12 + (this.a(var7, var15, this.field_l.field_i) >> 1);
            var7 = var7 + ((var14 * var5 >> 16) + var6);
          }
          if (this.field_y != null) {
            var14Lifetime3 = this.field_y.a(param0);
            var15Lifetime3 = this.field_v.a(param0);
            var13 = var13 * ((this.a(var10, var15Lifetime3, this.field_y.field_i) >> 1) + 32768) >> 15;
            var10 = var10 + ((var14Lifetime3 * var8 >> 16) + var9);
          }
          for (var14Lifetime4 = 0; var14Lifetime4 < 5; var14Lifetime4++) {
            if (this.field_d[var14Lifetime4] != 0) {
              var15Lifetime4 = var11Lifetime1 + field_g[var14Lifetime4];
              if (var15Lifetime4 < param0) {
                field_t[var15Lifetime4] = field_t[var15Lifetime4] + this.a(field_r[var14Lifetime4], var13 * field_m[var14Lifetime4] >> 15, this.field_b.field_i);
                field_r[var14Lifetime4] = field_r[var14Lifetime4] + ((var12 * field_a[var14Lifetime4] >> 16) + field_k[var14Lifetime4]);
              }
            }
          }
        }
        if (this.field_n != null) {
          this.field_n.a();
          this.field_x.a();
          var11Lifetime2 = 0;
          var12Lifetime1 = 0;
          var13Lifetime1 = 1;
          for (var14Lifetime1 = 0; var14Lifetime1 < param0; var14Lifetime1++) {
            var15Lifetime1 = this.field_n.a(param0);
            var16 = this.field_x.a(param0);
            if (var13Lifetime1 == 0) {
              var12Lifetime1Lifetime1 = this.field_n.field_g + ((this.field_n.field_b - this.field_n.field_g) * var16 >> 8);
            } else {
              var12Lifetime1Lifetime1 = this.field_n.field_g + ((this.field_n.field_b - this.field_n.field_g) * var15Lifetime1 >> 8);
            }
            var11Lifetime2 += 256;
            if (var11Lifetime2 >= var12Lifetime1Lifetime1) {
              var11Lifetime2 = 0;
              stackIn_41_0 = (var13Lifetime1 != 0) ? 0 : 1;
              var13Lifetime1 = stackIn_41_0;
            }
            if (var13Lifetime1 != 0) {
              field_t[var14Lifetime1] = 0;
            }
          }
        }
        if (this.field_q > 0 &&
          this.field_p > 0) {
          var11Lifetime3 = (int)((double)this.field_q * var3);
          for (var12Lifetime2 = var11Lifetime3; var12Lifetime2 < param0; var12Lifetime2++) {
            field_t[var12Lifetime2] = field_t[var12Lifetime2] + field_t[var12Lifetime2 - var11Lifetime3] * this.field_p / 100;
          }
        }
        if (!(this.field_f.field_d[0] <= 0) ||
          !(this.field_f.field_d[1] <= 0)) {
          this.field_j.a();
          var11Lifetime4 = this.field_j.a(param0 + 1);
          var12Lifetime3 = this.field_f.a(0, (float)var11Lifetime4 / 65536.0f);
          var13Lifetime2 = this.field_f.a(1, (float)var11Lifetime4 / 65536.0f);
          if (param0 >= var12Lifetime3 + var13Lifetime2) {
            var14Lifetime2 = 0;
            var15Lifetime2 = var13Lifetime2;
            if (var15Lifetime2 > param0 - var12Lifetime3) {
              var15Lifetime2 = param0 - var12Lifetime3;
            }
            while (var14Lifetime2 < var15Lifetime2) {
              var16Lifetime1 = (int)((long)field_t[var14Lifetime2 + var12Lifetime3] * (long)h.field_b >> 16);
              for (var17 = 0; var17 < var12Lifetime3; var17++) {
                var16Lifetime1 = var16Lifetime1 + (int)((long)field_t[var14Lifetime2 + var12Lifetime3 - 1 - var17] * (long)h.field_f[0][var17] >> 16);
              }
              for (var17Lifetime3 = 0; var17Lifetime3 < var14Lifetime2; var17Lifetime3++) {
                var16Lifetime1 = var16Lifetime1 - (int)((long)field_t[var14Lifetime2 - 1 - var17Lifetime3] * (long)h.field_f[1][var17Lifetime3] >> 16);
              }
              field_t[var14Lifetime2] = var16Lifetime1;
              var11Lifetime4 = this.field_j.a(param0 + 1);
              var14Lifetime2++;
            }
            var15Lifetime2Lifetime1 = 128;
            while (true) {
              if (var15Lifetime2Lifetime1 > param0 - var12Lifetime3) {
                var15Lifetime2Lifetime1 = param0 - var12Lifetime3;
              }
              while (var14Lifetime2 < var15Lifetime2Lifetime1) {
                var16Lifetime1Lifetime1 = (int)((long)field_t[var14Lifetime2 + var12Lifetime3] * (long)h.field_b >> 16);
                for (var17Lifetime1 = 0; var17Lifetime1 < var12Lifetime3; var17Lifetime1++) {
                  var16Lifetime1Lifetime1 = var16Lifetime1Lifetime1 + (int)((long)field_t[var14Lifetime2 + var12Lifetime3 - 1 - var17Lifetime1] * (long)h.field_f[0][var17Lifetime1] >> 16);
                }
                for (var17Lifetime1Lifetime1 = 0; var17Lifetime1Lifetime1 < var13Lifetime2; var17Lifetime1Lifetime1++) {
                  var16Lifetime1Lifetime1 = var16Lifetime1Lifetime1 - (int)((long)field_t[var14Lifetime2 - 1 - var17Lifetime1Lifetime1] * (long)h.field_f[1][var17Lifetime1Lifetime1] >> 16);
                }
                field_t[var14Lifetime2] = var16Lifetime1Lifetime1;
                var11Lifetime4 = this.field_j.a(param0 + 1);
                var14Lifetime2++;
              }
              if (var14Lifetime2 < param0 - var12Lifetime3) {
                var12Lifetime3 = this.field_f.a(0, (float)var11Lifetime4 / 65536.0f);
                var13Lifetime2 = this.field_f.a(1, (float)var11Lifetime4 / 65536.0f);
                var15Lifetime2Lifetime1 += 128;
                continue;
              }
              break;
            }
            while (var14Lifetime2 < param0) {
              var16Lifetime1Lifetime2 = 0;
              for (var17Lifetime2 = var14Lifetime2 + var12Lifetime3 - param0; var17Lifetime2 < var12Lifetime3; var17Lifetime2++) {
                var16Lifetime1Lifetime2 = var16Lifetime1Lifetime2 + (int)((long)field_t[var14Lifetime2 + var12Lifetime3 - 1 - var17Lifetime2] * (long)h.field_f[0][var17Lifetime2] >> 16);
              }
              for (var17Lifetime2Lifetime1 = 0; var17Lifetime2Lifetime1 < var13Lifetime2; var17Lifetime2Lifetime1++) {
                var16Lifetime1Lifetime2 = var16Lifetime1Lifetime2 - (int)((long)field_t[var14Lifetime2 - 1 - var17Lifetime2Lifetime1] * (long)h.field_f[1][var17Lifetime2Lifetime1] >> 16);
              }
              field_t[var14Lifetime2] = var16Lifetime1Lifetime2;
              var11Lifetime4 = this.field_j.a(param0 + 1);
              var14Lifetime2++;
            }
          }
        }
        for (var11Lifetime5 = 0; var11Lifetime5 < param0; var11Lifetime5++) {
          if (field_t[var11Lifetime5] < -32768) {
            field_t[var11Lifetime5] = -32768;
          }
          if (field_t[var11Lifetime5] > 32767) {
            field_t[var11Lifetime5] = 32767;
          }
        }
        return field_t;
    }

    je() {
        this.field_o = new int[]{0, 0, 0, 0, 0};
        this.field_q = 0;
        this.field_i = 0;
        this.field_s = 500;
        this.field_c = new int[]{0, 0, 0, 0, 0};
        this.field_d = new int[]{0, 0, 0, 0, 0};
        this.field_p = 100;
    }

    static {
        int var1 = 0;
        int var1Lifetime1;
        field_u = new int[32768];
        Random var0 = new Random(0L);
        for (var1 = 0; var1 < 32768; var1++) {
          field_u[var1] = (var0.nextInt() & 2) - 1;
        }
        field_w = new int[32768];
        for (var1Lifetime1 = 0; var1Lifetime1 < 32768; var1Lifetime1++) {
          field_w[var1Lifetime1] = (int)(Math.sin((double)var1Lifetime1 / 5215.1903) * 16384.0);
        }
        field_t = new int[220500];
        field_a = new int[5];
        field_r = new int[5];
        field_m = new int[5];
        field_k = new int[5];
        field_g = new int[5];
    }
}
