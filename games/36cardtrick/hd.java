/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class hd {
    private lj field_w;
    private static int[] field_r;
    private int[] field_g;
    private int[] field_s;
    private ih field_e;
    private ih field_j;
    private int[] field_m;
    private ih field_n;
    private ih field_d;
    private ih field_u;
    int field_o;
    private static int[] field_b;
    private ih field_a;
    private static int[] field_c;
    private int field_x;
    int field_v;
    private ih field_q;
    private static int[] field_k;
    private static int[] field_h;
    private ih field_i;
    private static int[] field_y;
    private int field_f;
    private static int[] field_p;
    private ih field_l;
    private static int[] field_t;

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
        og.a(field_b, 0, param0);
        if (param1 < 10) {
          return field_b;
        }
        var3 = (double)param0 / ((double)param1 + 0.0);
        this.field_a.a();
        this.field_l.a();
        var5 = 0;
        var6 = 0;
        var7 = 0;
        if (this.field_j != null) {
          this.field_j.a();
          this.field_u.a();
          var5 = (int)((double)(this.field_j.field_b - this.field_j.field_c) * 32.768 / var3);
          var6 = (int)((double)this.field_j.field_c * 32.768 / var3);
        }
        var8 = 0;
        var9 = 0;
        var10 = 0;
        if (this.field_d != null) {
          this.field_d.a();
          this.field_i.a();
          var8 = (int)((double)(this.field_d.field_b - this.field_d.field_c) * 32.768 / var3);
          var9 = (int)((double)this.field_d.field_c * 32.768 / var3);
        }
        for (var11 = 0; var11 < 5; var11++) {
          if (this.field_s[var11] != 0) {
            field_k[var11] = 0;
            field_t[var11] = (int)((double)this.field_m[var11] * var3);
            field_p[var11] = (this.field_s[var11] << 14) / 100;
            field_y[var11] = (int)((double)(this.field_a.field_b - this.field_a.field_c) * 32.768 * Math.pow(1.0057929410678534, (double)this.field_g[var11]) / var3);
            field_h[var11] = (int)((double)this.field_a.field_c * 32.768 / var3);
          }
        }
        for (var11Lifetime1 = 0; var11Lifetime1 < param0; var11Lifetime1++) {
          var12 = this.field_a.a(param0);
          var13 = this.field_l.a(param0);
          if (this.field_j != null) {
            var14 = this.field_j.a(param0);
            var15 = this.field_u.a(param0);
            var12 = var12 + (this.a(var7, var15, this.field_j.field_k) >> 1);
            var7 = var7 + ((var14 * var5 >> 16) + var6);
          }
          if (this.field_d != null) {
            var14Lifetime3 = this.field_d.a(param0);
            var15Lifetime3 = this.field_i.a(param0);
            var13 = var13 * ((this.a(var10, var15Lifetime3, this.field_d.field_k) >> 1) + 32768) >> 15;
            var10 = var10 + ((var14Lifetime3 * var8 >> 16) + var9);
          }
          for (var14Lifetime4 = 0; var14Lifetime4 < 5; var14Lifetime4++) {
            if (this.field_s[var14Lifetime4] != 0) {
              var15Lifetime4 = var11Lifetime1 + field_t[var14Lifetime4];
              if (var15Lifetime4 < param0) {
                field_b[var15Lifetime4] = field_b[var15Lifetime4] + this.a(field_k[var14Lifetime4], var13 * field_p[var14Lifetime4] >> 15, this.field_a.field_k);
                field_k[var14Lifetime4] = field_k[var14Lifetime4] + ((var12 * field_y[var14Lifetime4] >> 16) + field_h[var14Lifetime4]);
              }
            }
          }
        }
        if (this.field_e != null) {
          this.field_e.a();
          this.field_q.a();
          var11Lifetime2 = 0;
          var12Lifetime1 = 0;
          var13Lifetime1 = 1;
          for (var14Lifetime1 = 0; var14Lifetime1 < param0; var14Lifetime1++) {
            var15Lifetime1 = this.field_e.a(param0);
            var16 = this.field_q.a(param0);
            if (var13Lifetime1 == 0) {
              var12Lifetime1Lifetime1 = this.field_e.field_c + ((this.field_e.field_b - this.field_e.field_c) * var16 >> 8);
            } else {
              var12Lifetime1Lifetime1 = this.field_e.field_c + ((this.field_e.field_b - this.field_e.field_c) * var15Lifetime1 >> 8);
            }
            var11Lifetime2 += 256;
            if (var11Lifetime2 >= var12Lifetime1Lifetime1) {
              var11Lifetime2 = 0;
              stackIn_41_0 = (var13Lifetime1 != 0) ? 0 : 1;
              var13Lifetime1 = stackIn_41_0;
            }
            if (var13Lifetime1 != 0) {
              field_b[var14Lifetime1] = 0;
            }
          }
        }
        if (this.field_x > 0 &&
          this.field_f > 0) {
          var11Lifetime3 = (int)((double)this.field_x * var3);
          for (var12Lifetime2 = var11Lifetime3; var12Lifetime2 < param0; var12Lifetime2++) {
            field_b[var12Lifetime2] = field_b[var12Lifetime2] + field_b[var12Lifetime2 - var11Lifetime3] * this.field_f / 100;
          }
        }
        if (!(this.field_w.field_e[0] <= 0) ||
          !(this.field_w.field_e[1] <= 0)) {
          this.field_n.a();
          var11Lifetime4 = this.field_n.a(param0 + 1);
          var12Lifetime3 = this.field_w.a(0, (float)var11Lifetime4 / 65536.0f);
          var13Lifetime2 = this.field_w.a(1, (float)var11Lifetime4 / 65536.0f);
          if (param0 >= var12Lifetime3 + var13Lifetime2) {
            var14Lifetime2 = 0;
            var15Lifetime2 = var13Lifetime2;
            if (var15Lifetime2 > param0 - var12Lifetime3) {
              var15Lifetime2 = param0 - var12Lifetime3;
            }
            while (var14Lifetime2 < var15Lifetime2) {
              var16Lifetime1 = (int)((long)field_b[var14Lifetime2 + var12Lifetime3] * (long)lj.field_b >> 16);
              for (var17 = 0; var17 < var12Lifetime3; var17++) {
                var16Lifetime1 = var16Lifetime1 + (int)((long)field_b[var14Lifetime2 + var12Lifetime3 - 1 - var17] * (long)lj.field_a[0][var17] >> 16);
              }
              for (var17Lifetime3 = 0; var17Lifetime3 < var14Lifetime2; var17Lifetime3++) {
                var16Lifetime1 = var16Lifetime1 - (int)((long)field_b[var14Lifetime2 - 1 - var17Lifetime3] * (long)lj.field_a[1][var17Lifetime3] >> 16);
              }
              field_b[var14Lifetime2] = var16Lifetime1;
              var11Lifetime4 = this.field_n.a(param0 + 1);
              var14Lifetime2++;
            }
            var15Lifetime2Lifetime1 = 128;
            while (true) {
              if (var15Lifetime2Lifetime1 > param0 - var12Lifetime3) {
                var15Lifetime2Lifetime1 = param0 - var12Lifetime3;
              }
              while (var14Lifetime2 < var15Lifetime2Lifetime1) {
                var16Lifetime1Lifetime1 = (int)((long)field_b[var14Lifetime2 + var12Lifetime3] * (long)lj.field_b >> 16);
                for (var17Lifetime1 = 0; var17Lifetime1 < var12Lifetime3; var17Lifetime1++) {
                  var16Lifetime1Lifetime1 = var16Lifetime1Lifetime1 + (int)((long)field_b[var14Lifetime2 + var12Lifetime3 - 1 - var17Lifetime1] * (long)lj.field_a[0][var17Lifetime1] >> 16);
                }
                for (var17Lifetime1Lifetime1 = 0; var17Lifetime1Lifetime1 < var13Lifetime2; var17Lifetime1Lifetime1++) {
                  var16Lifetime1Lifetime1 = var16Lifetime1Lifetime1 - (int)((long)field_b[var14Lifetime2 - 1 - var17Lifetime1Lifetime1] * (long)lj.field_a[1][var17Lifetime1Lifetime1] >> 16);
                }
                field_b[var14Lifetime2] = var16Lifetime1Lifetime1;
                var11Lifetime4 = this.field_n.a(param0 + 1);
                var14Lifetime2++;
              }
              if (var14Lifetime2 < param0 - var12Lifetime3) {
                var12Lifetime3 = this.field_w.a(0, (float)var11Lifetime4 / 65536.0f);
                var13Lifetime2 = this.field_w.a(1, (float)var11Lifetime4 / 65536.0f);
                var15Lifetime2Lifetime1 += 128;
                continue;
              }
              break;
            }
            while (var14Lifetime2 < param0) {
              var16Lifetime1Lifetime2 = 0;
              for (var17Lifetime2 = var14Lifetime2 + var12Lifetime3 - param0; var17Lifetime2 < var12Lifetime3; var17Lifetime2++) {
                var16Lifetime1Lifetime2 = var16Lifetime1Lifetime2 + (int)((long)field_b[var14Lifetime2 + var12Lifetime3 - 1 - var17Lifetime2] * (long)lj.field_a[0][var17Lifetime2] >> 16);
              }
              for (var17Lifetime2Lifetime1 = 0; var17Lifetime2Lifetime1 < var13Lifetime2; var17Lifetime2Lifetime1++) {
                var16Lifetime1Lifetime2 = var16Lifetime1Lifetime2 - (int)((long)field_b[var14Lifetime2 - 1 - var17Lifetime2Lifetime1] * (long)lj.field_a[1][var17Lifetime2Lifetime1] >> 16);
              }
              field_b[var14Lifetime2] = var16Lifetime1Lifetime2;
              var11Lifetime4 = this.field_n.a(param0 + 1);
              var14Lifetime2++;
            }
          }
        }
        for (var11Lifetime5 = 0; var11Lifetime5 < param0; var11Lifetime5++) {
          if (field_b[var11Lifetime5] < -32768) {
            field_b[var11Lifetime5] = -32768;
          }
          if (field_b[var11Lifetime5] > 32767) {
            field_b[var11Lifetime5] = 32767;
          }
        }
        return field_b;
    }

    private final int a(int param0, int param1, int param2) {
        if (param2 == 1) {
          if ((param0 & 32767) < 16384) {
            return param1;
          }
          return -param1;
        }
        if (param2 == 2) {
          return field_r[param0 & 32767] * param1 >> 14;
        }
        if (param2 == 3) {
          return ((param0 & 32767) * param1 >> 14) - param1;
        }
        if (param2 == 4) {
          return field_c[param0 / 2607 & 32767] * param1;
        }
        return 0;
    }

    final void a(pb param0) {
        int var3 = 0;
        int var4 = 0;
        this.field_a = new ih();
        this.field_a.b(param0);
        this.field_l = new ih();
        this.field_l.b(param0);
        int var2 = param0.f(102);
        if (var2 != 0) {
          param0.field_i = param0.field_i - 1;
          this.field_j = new ih();
          this.field_j.b(param0);
          this.field_u = new ih();
          this.field_u.b(param0);
        }
        var2 = param0.f(36);
        if (var2 != 0) {
          param0.field_i = param0.field_i - 1;
          this.field_d = new ih();
          this.field_d.b(param0);
          this.field_i = new ih();
          this.field_i.b(param0);
        }
        var2 = param0.f(-105);
        if (var2 != 0) {
          param0.field_i = param0.field_i - 1;
          this.field_e = new ih();
          this.field_e.b(param0);
          this.field_q = new ih();
          this.field_q.b(param0);
        }
        for (var3 = 0; var3 < 10; var3++) {
          var4 = param0.a(0);
          if (var4 == 0) {
            break;
          }
          this.field_s[var3] = var4;
          this.field_g[var3] = param0.b((byte) 59);
          this.field_m[var3] = param0.a(0);
        }
        this.field_x = param0.a(0);
        this.field_f = param0.a(0);
        this.field_o = param0.d((byte) 72);
        this.field_v = param0.d((byte) 72);
        this.field_w = new lj();
        this.field_n = new ih();
        this.field_w.a(param0, this.field_n);
    }

    public static void a() {
        field_b = null;
        field_c = null;
        field_r = null;
        field_k = null;
        field_t = null;
        field_p = null;
        field_y = null;
        field_h = null;
    }

    hd() {
        this.field_s = new int[]{0, 0, 0, 0, 0};
        this.field_g = new int[]{0, 0, 0, 0, 0};
        this.field_o = 500;
        this.field_v = 0;
        this.field_m = new int[]{0, 0, 0, 0, 0};
        this.field_x = 0;
        this.field_f = 100;
    }

    static {
        int var1 = 0;
        int var1Lifetime1;
        field_c = new int[32768];
        Random var0 = new Random(0L);
        for (var1 = 0; var1 < 32768; var1++) {
          field_c[var1] = (var0.nextInt() & 2) - 1;
        }
        field_r = new int[32768];
        for (var1Lifetime1 = 0; var1Lifetime1 < 32768; var1Lifetime1++) {
          field_r[var1Lifetime1] = (int)(Math.sin((double)var1Lifetime1 / 5215.1903) * 16384.0);
        }
        field_b = new int[220500];
        field_k = new int[5];
        field_h = new int[5];
        field_y = new int[5];
        field_p = new int[5];
        field_t = new int[5];
    }
}
