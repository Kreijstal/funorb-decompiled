/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class qda {
    private int field_s;
    private int[] field_r;
    private int field_u;
    private hc field_i;
    private rpb field_e;
    private rpb field_y;
    private rpb field_w;
    private rpb field_c;
    private rpb field_o;
    int field_k;
    int field_d;
    private int[] field_n;
    private rpb field_j;
    private static int[] field_f;
    private int[] field_q;
    private static int[] field_m;
    private rpb field_x;
    private rpb field_b;
    private rpb field_a;
    private static int[] field_g;
    private static int[] field_l;
    private static int[] field_p;
    private static int[] field_h;
    private static int[] field_v;
    private static int[] field_t;

    public static void a() {
        field_f = null;
        field_g = null;
        field_m = null;
        field_t = null;
        field_l = null;
        field_h = null;
        field_v = null;
        field_p = null;
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
        cua.a(field_f, 0, param0);
        if (param1 < 10) {
          return field_f;
        }
        var3 = (double)param0 / ((double)param1 + 0.0);
        this.field_o.a();
        this.field_c.a();
        var5 = 0;
        var6 = 0;
        var7 = 0;
        if (this.field_y != null) {
          this.field_y.a();
          this.field_b.a();
          var5 = (int)((double)(this.field_y.field_j - this.field_y.field_i) * 32.768 / var3);
          var6 = (int)((double)this.field_y.field_i * 32.768 / var3);
        }
        var8 = 0;
        var9 = 0;
        var10 = 0;
        if (this.field_j != null) {
          this.field_j.a();
          this.field_w.a();
          var8 = (int)((double)(this.field_j.field_j - this.field_j.field_i) * 32.768 / var3);
          var9 = (int)((double)this.field_j.field_i * 32.768 / var3);
        }
        for (var11 = 0; var11 < 5; var11++) {
          if (this.field_n[var11] != 0) {
            field_t[var11] = 0;
            field_l[var11] = (int)((double)this.field_q[var11] * var3);
            field_h[var11] = (this.field_n[var11] << 14) / 100;
            field_v[var11] = (int)((double)(this.field_o.field_j - this.field_o.field_i) * 32.768 * Math.pow(1.0057929410678534, (double)this.field_r[var11]) / var3);
            field_p[var11] = (int)((double)this.field_o.field_i * 32.768 / var3);
          }
        }
        for (var11Lifetime1 = 0; var11Lifetime1 < param0; var11Lifetime1++) {
          var12 = this.field_o.a(param0);
          var13 = this.field_c.a(param0);
          if (this.field_y != null) {
            var14 = this.field_y.a(param0);
            var15 = this.field_b.a(param0);
            var12 = var12 + (this.a(var7, var15, this.field_y.field_e) >> 1);
            var7 = var7 + ((var14 * var5 >> 16) + var6);
          }
          if (this.field_j != null) {
            var14Lifetime3 = this.field_j.a(param0);
            var15Lifetime3 = this.field_w.a(param0);
            var13 = var13 * ((this.a(var10, var15Lifetime3, this.field_j.field_e) >> 1) + 32768) >> 15;
            var10 = var10 + ((var14Lifetime3 * var8 >> 16) + var9);
          }
          for (var14Lifetime4 = 0; var14Lifetime4 < 5; var14Lifetime4++) {
            if (this.field_n[var14Lifetime4] != 0) {
              var15Lifetime4 = var11Lifetime1 + field_l[var14Lifetime4];
              if (var15Lifetime4 < param0) {
                field_f[var15Lifetime4] = field_f[var15Lifetime4] + this.a(field_t[var14Lifetime4], var13 * field_h[var14Lifetime4] >> 15, this.field_o.field_e);
                field_t[var14Lifetime4] = field_t[var14Lifetime4] + ((var12 * field_v[var14Lifetime4] >> 16) + field_p[var14Lifetime4]);
              }
            }
          }
        }
        if (this.field_e != null) {
          this.field_e.a();
          this.field_a.a();
          var11Lifetime2 = 0;
          var12Lifetime1 = 0;
          var13Lifetime1 = 1;
          for (var14Lifetime1 = 0; var14Lifetime1 < param0; var14Lifetime1++) {
            var15Lifetime1 = this.field_e.a(param0);
            var16 = this.field_a.a(param0);
            if (var13Lifetime1 == 0) {
              var12Lifetime1Lifetime1 = this.field_e.field_i + ((this.field_e.field_j - this.field_e.field_i) * var16 >> 8);
            } else {
              var12Lifetime1Lifetime1 = this.field_e.field_i + ((this.field_e.field_j - this.field_e.field_i) * var15Lifetime1 >> 8);
            }
            var11Lifetime2 += 256;
            if (var11Lifetime2 >= var12Lifetime1Lifetime1) {
              var11Lifetime2 = 0;
              stackIn_41_0 = (var13Lifetime1 != 0) ? 0 : 1;
              var13Lifetime1 = stackIn_41_0;
            }
            if (var13Lifetime1 != 0) {
              field_f[var14Lifetime1] = 0;
            }
          }
        }
        if (this.field_s > 0 &&
          this.field_u > 0) {
          var11Lifetime3 = (int)((double)this.field_s * var3);
          for (var12Lifetime2 = var11Lifetime3; var12Lifetime2 < param0; var12Lifetime2++) {
            field_f[var12Lifetime2] = field_f[var12Lifetime2] + field_f[var12Lifetime2 - var11Lifetime3] * this.field_u / 100;
          }
        }
        if (!(this.field_i.field_g[0] <= 0) ||
          !(this.field_i.field_g[1] <= 0)) {
          this.field_x.a();
          var11Lifetime4 = this.field_x.a(param0 + 1);
          var12Lifetime3 = this.field_i.a(0, (float)var11Lifetime4 / 65536.0f);
          var13Lifetime2 = this.field_i.a(1, (float)var11Lifetime4 / 65536.0f);
          if (param0 >= var12Lifetime3 + var13Lifetime2) {
            var14Lifetime2 = 0;
            var15Lifetime2 = var13Lifetime2;
            if (var15Lifetime2 > param0 - var12Lifetime3) {
              var15Lifetime2 = param0 - var12Lifetime3;
            }
            while (var14Lifetime2 < var15Lifetime2) {
              var16Lifetime1 = (int)((long)field_f[var14Lifetime2 + var12Lifetime3] * (long)hc.field_d >> 16);
              for (var17 = 0; var17 < var12Lifetime3; var17++) {
                var16Lifetime1 = var16Lifetime1 + (int)((long)field_f[var14Lifetime2 + var12Lifetime3 - 1 - var17] * (long)hc.field_f[0][var17] >> 16);
              }
              for (var17Lifetime3 = 0; var17Lifetime3 < var14Lifetime2; var17Lifetime3++) {
                var16Lifetime1 = var16Lifetime1 - (int)((long)field_f[var14Lifetime2 - 1 - var17Lifetime3] * (long)hc.field_f[1][var17Lifetime3] >> 16);
              }
              field_f[var14Lifetime2] = var16Lifetime1;
              var11Lifetime4 = this.field_x.a(param0 + 1);
              var14Lifetime2++;
            }
            var15Lifetime2Lifetime1 = 128;
            while (true) {
              if (var15Lifetime2Lifetime1 > param0 - var12Lifetime3) {
                var15Lifetime2Lifetime1 = param0 - var12Lifetime3;
              }
              while (var14Lifetime2 < var15Lifetime2Lifetime1) {
                var16Lifetime1Lifetime1 = (int)((long)field_f[var14Lifetime2 + var12Lifetime3] * (long)hc.field_d >> 16);
                for (var17Lifetime1 = 0; var17Lifetime1 < var12Lifetime3; var17Lifetime1++) {
                  var16Lifetime1Lifetime1 = var16Lifetime1Lifetime1 + (int)((long)field_f[var14Lifetime2 + var12Lifetime3 - 1 - var17Lifetime1] * (long)hc.field_f[0][var17Lifetime1] >> 16);
                }
                for (var17Lifetime1Lifetime1 = 0; var17Lifetime1Lifetime1 < var13Lifetime2; var17Lifetime1Lifetime1++) {
                  var16Lifetime1Lifetime1 = var16Lifetime1Lifetime1 - (int)((long)field_f[var14Lifetime2 - 1 - var17Lifetime1Lifetime1] * (long)hc.field_f[1][var17Lifetime1Lifetime1] >> 16);
                }
                field_f[var14Lifetime2] = var16Lifetime1Lifetime1;
                var11Lifetime4 = this.field_x.a(param0 + 1);
                var14Lifetime2++;
              }
              if (var14Lifetime2 < param0 - var12Lifetime3) {
                var12Lifetime3 = this.field_i.a(0, (float)var11Lifetime4 / 65536.0f);
                var13Lifetime2 = this.field_i.a(1, (float)var11Lifetime4 / 65536.0f);
                var15Lifetime2Lifetime1 += 128;
                continue;
              }
              break;
            }
            while (var14Lifetime2 < param0) {
              var16Lifetime1Lifetime2 = 0;
              for (var17Lifetime2 = var14Lifetime2 + var12Lifetime3 - param0; var17Lifetime2 < var12Lifetime3; var17Lifetime2++) {
                var16Lifetime1Lifetime2 = var16Lifetime1Lifetime2 + (int)((long)field_f[var14Lifetime2 + var12Lifetime3 - 1 - var17Lifetime2] * (long)hc.field_f[0][var17Lifetime2] >> 16);
              }
              for (var17Lifetime2Lifetime1 = 0; var17Lifetime2Lifetime1 < var13Lifetime2; var17Lifetime2Lifetime1++) {
                var16Lifetime1Lifetime2 = var16Lifetime1Lifetime2 - (int)((long)field_f[var14Lifetime2 - 1 - var17Lifetime2Lifetime1] * (long)hc.field_f[1][var17Lifetime2Lifetime1] >> 16);
              }
              field_f[var14Lifetime2] = var16Lifetime1Lifetime2;
              var11Lifetime4 = this.field_x.a(param0 + 1);
              var14Lifetime2++;
            }
          }
        }
        for (var11Lifetime5 = 0; var11Lifetime5 < param0; var11Lifetime5++) {
          if (field_f[var11Lifetime5] < -32768) {
            field_f[var11Lifetime5] = -32768;
          }
          if (field_f[var11Lifetime5] > 32767) {
            field_f[var11Lifetime5] = 32767;
          }
        }
        return field_f;
    }

    final void a(ds param0) {
        int var3 = 0;
        int var4 = 0;
        this.field_o = new rpb();
        this.field_o.b(param0);
        this.field_c = new rpb();
        this.field_c.b(param0);
        int var2 = param0.e((byte) -87);
        if (var2 != 0) {
          param0.field_e = param0.field_e - 1;
          this.field_y = new rpb();
          this.field_y.b(param0);
          this.field_b = new rpb();
          this.field_b.b(param0);
        }
        var2 = param0.e((byte) -106);
        if (var2 != 0) {
          param0.field_e = param0.field_e - 1;
          this.field_j = new rpb();
          this.field_j.b(param0);
          this.field_w = new rpb();
          this.field_w.b(param0);
        }
        var2 = param0.e((byte) -98);
        if (var2 != 0) {
          param0.field_e = param0.field_e - 1;
          this.field_e = new rpb();
          this.field_e.b(param0);
          this.field_a = new rpb();
          this.field_a.b(param0);
        }
        for (var3 = 0; var3 < 10; var3++) {
          var4 = param0.f(107);
          if (var4 == 0) {
            break;
          }
          this.field_n[var3] = var4;
          this.field_r[var3] = param0.d(0);
          this.field_q[var3] = param0.f(50);
        }
        this.field_s = param0.f(84);
        this.field_u = param0.f(120);
        this.field_d = param0.e(1869);
        this.field_k = param0.e(1869);
        this.field_i = new hc();
        this.field_x = new rpb();
        this.field_i.a(param0, this.field_x);
    }

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
          return field_g[param0 / 2607 & 32767] * param1;
        }
        return 0;
    }

    qda() {
        this.field_k = 0;
        this.field_r = new int[]{0, 0, 0, 0, 0};
        this.field_n = new int[]{0, 0, 0, 0, 0};
        this.field_q = new int[]{0, 0, 0, 0, 0};
        this.field_u = 100;
        this.field_s = 0;
        this.field_d = 500;
    }

    static {
        int var1 = 0;
        int var1Lifetime1;
        field_g = new int[32768];
        Random var0 = new Random(0L);
        for (var1 = 0; var1 < 32768; var1++) {
          field_g[var1] = (var0.nextInt() & 2) - 1;
        }
        field_m = new int[32768];
        for (var1Lifetime1 = 0; var1Lifetime1 < 32768; var1Lifetime1++) {
          field_m[var1Lifetime1] = (int)(Math.sin((double)var1Lifetime1 / 5215.1903) * 16384.0);
        }
        field_f = new int[220500];
        field_l = new int[5];
        field_p = new int[5];
        field_v = new int[5];
        field_h = new int[5];
        field_t = new int[5];
    }
}
