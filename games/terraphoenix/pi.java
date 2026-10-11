/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class pi {
    private fj field_x;
    private fj field_m;
    private int field_i;
    private fj field_y;
    private fj field_j;
    private static int[] field_n;
    private static int[] field_v;
    private int[] field_p;
    private fj field_b;
    int field_s;
    private fj field_q;
    int field_r;
    private int field_t;
    private fj field_d;
    private fj field_h;
    private int[] field_a;
    private ek field_k;
    private int[] field_o;
    private static int[] field_f;
    private fj field_e;
    private static int[] field_c;
    private static int[] field_u;
    private static int[] field_w;
    private static int[] field_l;
    private static int[] field_g;

    public static void a() {
        field_f = null;
        field_v = null;
        field_n = null;
        field_u = null;
        field_l = null;
        field_c = null;
        field_w = null;
        field_g = null;
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
        ka.a(field_f, 0, param0);
        if (param1 < 10) {
          return field_f;
        }
        var3 = (double)param0 / ((double)param1 + 0.0);
        this.field_q.a();
        this.field_e.a();
        var5 = 0;
        var6 = 0;
        var7 = 0;
        if (this.field_d != null) {
          this.field_d.a();
          this.field_x.a();
          var5 = (int)((double)(this.field_d.field_b - this.field_d.field_g) * 32.768 / var3);
          var6 = (int)((double)this.field_d.field_g * 32.768 / var3);
        }
        var8 = 0;
        var9 = 0;
        var10 = 0;
        if (this.field_m != null) {
          this.field_m.a();
          this.field_y.a();
          var8 = (int)((double)(this.field_m.field_b - this.field_m.field_g) * 32.768 / var3);
          var9 = (int)((double)this.field_m.field_g * 32.768 / var3);
        }
        for (var11 = 0; var11 < 5; var11++) {
          if (this.field_p[var11] != 0) {
            field_u[var11] = 0;
            field_l[var11] = (int)((double)this.field_o[var11] * var3);
            field_c[var11] = (this.field_p[var11] << 14) / 100;
            field_w[var11] = (int)((double)(this.field_q.field_b - this.field_q.field_g) * 32.768 * Math.pow(1.0057929410678534, (double)this.field_a[var11]) / var3);
            field_g[var11] = (int)((double)this.field_q.field_g * 32.768 / var3);
          }
        }
        for (var11Lifetime1 = 0; var11Lifetime1 < param0; var11Lifetime1++) {
          var12 = this.field_q.a(param0);
          var13 = this.field_e.a(param0);
          if (this.field_d != null) {
            var14 = this.field_d.a(param0);
            var15 = this.field_x.a(param0);
            var12 = var12 + (this.a(var7, var15, this.field_d.field_f) >> 1);
            var7 = var7 + ((var14 * var5 >> 16) + var6);
          }
          if (this.field_m != null) {
            var14Lifetime3 = this.field_m.a(param0);
            var15Lifetime3 = this.field_y.a(param0);
            var13 = var13 * ((this.a(var10, var15Lifetime3, this.field_m.field_f) >> 1) + 32768) >> 15;
            var10 = var10 + ((var14Lifetime3 * var8 >> 16) + var9);
          }
          for (var14Lifetime4 = 0; var14Lifetime4 < 5; var14Lifetime4++) {
            if (this.field_p[var14Lifetime4] != 0) {
              var15Lifetime4 = var11Lifetime1 + field_l[var14Lifetime4];
              if (var15Lifetime4 < param0) {
                field_f[var15Lifetime4] = field_f[var15Lifetime4] + this.a(field_u[var14Lifetime4], var13 * field_c[var14Lifetime4] >> 15, this.field_q.field_f);
                field_u[var14Lifetime4] = field_u[var14Lifetime4] + ((var12 * field_w[var14Lifetime4] >> 16) + field_g[var14Lifetime4]);
              }
            }
          }
        }
        if (this.field_b != null) {
          this.field_b.a();
          this.field_j.a();
          var11Lifetime2 = 0;
          var12Lifetime1 = 0;
          var13Lifetime1 = 1;
          for (var14Lifetime1 = 0; var14Lifetime1 < param0; var14Lifetime1++) {
            var15Lifetime1 = this.field_b.a(param0);
            var16 = this.field_j.a(param0);
            if (var13Lifetime1 == 0) {
              var12Lifetime1Lifetime1 = this.field_b.field_g + ((this.field_b.field_b - this.field_b.field_g) * var16 >> 8);
            } else {
              var12Lifetime1Lifetime1 = this.field_b.field_g + ((this.field_b.field_b - this.field_b.field_g) * var15Lifetime1 >> 8);
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
        if (this.field_i > 0 &&
          this.field_t > 0) {
          var11Lifetime3 = (int)((double)this.field_i * var3);
          for (var12Lifetime2 = var11Lifetime3; var12Lifetime2 < param0; var12Lifetime2++) {
            field_f[var12Lifetime2] = field_f[var12Lifetime2] + field_f[var12Lifetime2 - var11Lifetime3] * this.field_t / 100;
          }
        }
        if (!(this.field_k.field_a[0] <= 0) ||
          !(this.field_k.field_a[1] <= 0)) {
          this.field_h.a();
          var11Lifetime4 = this.field_h.a(param0 + 1);
          var12Lifetime3 = this.field_k.a(0, (float)var11Lifetime4 / 65536.0f);
          var13Lifetime2 = this.field_k.a(1, (float)var11Lifetime4 / 65536.0f);
          if (param0 >= var12Lifetime3 + var13Lifetime2) {
            var14Lifetime2 = 0;
            var15Lifetime2 = var13Lifetime2;
            if (var15Lifetime2 > param0 - var12Lifetime3) {
              var15Lifetime2 = param0 - var12Lifetime3;
            }
            while (var14Lifetime2 < var15Lifetime2) {
              var16Lifetime1 = (int)((long)field_f[var14Lifetime2 + var12Lifetime3] * (long)ek.field_g >> 16);
              for (var17 = 0; var17 < var12Lifetime3; var17++) {
                var16Lifetime1 = var16Lifetime1 + (int)((long)field_f[var14Lifetime2 + var12Lifetime3 - 1 - var17] * (long)ek.field_h[0][var17] >> 16);
              }
              for (var17Lifetime3 = 0; var17Lifetime3 < var14Lifetime2; var17Lifetime3++) {
                var16Lifetime1 = var16Lifetime1 - (int)((long)field_f[var14Lifetime2 - 1 - var17Lifetime3] * (long)ek.field_h[1][var17Lifetime3] >> 16);
              }
              field_f[var14Lifetime2] = var16Lifetime1;
              var11Lifetime4 = this.field_h.a(param0 + 1);
              var14Lifetime2++;
            }
            var15Lifetime2Lifetime1 = 128;
            while (true) {
              if (var15Lifetime2Lifetime1 > param0 - var12Lifetime3) {
                var15Lifetime2Lifetime1 = param0 - var12Lifetime3;
              }
              while (var14Lifetime2 < var15Lifetime2Lifetime1) {
                var16Lifetime1Lifetime1 = (int)((long)field_f[var14Lifetime2 + var12Lifetime3] * (long)ek.field_g >> 16);
                for (var17Lifetime1 = 0; var17Lifetime1 < var12Lifetime3; var17Lifetime1++) {
                  var16Lifetime1Lifetime1 = var16Lifetime1Lifetime1 + (int)((long)field_f[var14Lifetime2 + var12Lifetime3 - 1 - var17Lifetime1] * (long)ek.field_h[0][var17Lifetime1] >> 16);
                }
                for (var17Lifetime1Lifetime1 = 0; var17Lifetime1Lifetime1 < var13Lifetime2; var17Lifetime1Lifetime1++) {
                  var16Lifetime1Lifetime1 = var16Lifetime1Lifetime1 - (int)((long)field_f[var14Lifetime2 - 1 - var17Lifetime1Lifetime1] * (long)ek.field_h[1][var17Lifetime1Lifetime1] >> 16);
                }
                field_f[var14Lifetime2] = var16Lifetime1Lifetime1;
                var11Lifetime4 = this.field_h.a(param0 + 1);
                var14Lifetime2++;
              }
              if (var14Lifetime2 < param0 - var12Lifetime3) {
                var12Lifetime3 = this.field_k.a(0, (float)var11Lifetime4 / 65536.0f);
                var13Lifetime2 = this.field_k.a(1, (float)var11Lifetime4 / 65536.0f);
                var15Lifetime2Lifetime1 += 128;
                continue;
              }
              break;
            }
            while (var14Lifetime2 < param0) {
              var16Lifetime1Lifetime2 = 0;
              for (var17Lifetime2 = var14Lifetime2 + var12Lifetime3 - param0; var17Lifetime2 < var12Lifetime3; var17Lifetime2++) {
                var16Lifetime1Lifetime2 = var16Lifetime1Lifetime2 + (int)((long)field_f[var14Lifetime2 + var12Lifetime3 - 1 - var17Lifetime2] * (long)ek.field_h[0][var17Lifetime2] >> 16);
              }
              for (var17Lifetime2Lifetime1 = 0; var17Lifetime2Lifetime1 < var13Lifetime2; var17Lifetime2Lifetime1++) {
                var16Lifetime1Lifetime2 = var16Lifetime1Lifetime2 - (int)((long)field_f[var14Lifetime2 - 1 - var17Lifetime2Lifetime1] * (long)ek.field_h[1][var17Lifetime2Lifetime1] >> 16);
              }
              field_f[var14Lifetime2] = var16Lifetime1Lifetime2;
              var11Lifetime4 = this.field_h.a(param0 + 1);
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

    final void a(dh param0) {
        int var3 = 0;
        int var4 = 0;
        this.field_q = new fj();
        this.field_q.a(param0);
        this.field_e = new fj();
        this.field_e.a(param0);
        int var2 = param0.a(-16384);
        if (var2 != 0) {
          param0.field_k = param0.field_k - 1;
          this.field_d = new fj();
          this.field_d.a(param0);
          this.field_x = new fj();
          this.field_x.a(param0);
        }
        var2 = param0.a(-16384);
        if (var2 != 0) {
          param0.field_k = param0.field_k - 1;
          this.field_m = new fj();
          this.field_m.a(param0);
          this.field_y = new fj();
          this.field_y.a(param0);
        }
        var2 = param0.a(-16384);
        if (var2 != 0) {
          param0.field_k = param0.field_k - 1;
          this.field_b = new fj();
          this.field_b.a(param0);
          this.field_j = new fj();
          this.field_j.a(param0);
        }
        for (var3 = 0; var3 < 10; var3++) {
          var4 = param0.h(-89);
          if (var4 == 0) {
            break;
          }
          this.field_p[var3] = var4;
          this.field_a[var3] = param0.e((byte) 104);
          this.field_o[var3] = param0.h(117);
        }
        this.field_i = param0.h(-110);
        this.field_t = param0.h(112);
        this.field_r = param0.i(-25578);
        this.field_s = param0.i(-25578);
        this.field_k = new ek();
        this.field_h = new fj();
        this.field_k.a(param0, this.field_h);
    }

    private final int a(int param0, int param1, int param2) {
        if (param2 == 1) {
          if ((param0 & 32767) < 16384) {
            return param1;
          }
          return -param1;
        }
        if (param2 == 2) {
          return field_n[param0 & 32767] * param1 >> 14;
        }
        if (param2 == 3) {
          return ((param0 & 32767) * param1 >> 14) - param1;
        }
        if (param2 == 4) {
          return field_v[param0 / 2607 & 32767] * param1;
        }
        return 0;
    }

    pi() {
        this.field_p = new int[]{0, 0, 0, 0, 0};
        this.field_t = 100;
        this.field_r = 500;
        this.field_s = 0;
        this.field_a = new int[]{0, 0, 0, 0, 0};
        this.field_o = new int[]{0, 0, 0, 0, 0};
        this.field_i = 0;
    }

    static {
        int var1 = 0;
        int var1Lifetime1;
        field_v = new int[32768];
        Random var0 = new Random(0L);
        for (var1 = 0; var1 < 32768; var1++) {
          field_v[var1] = (var0.nextInt() & 2) - 1;
        }
        field_n = new int[32768];
        for (var1Lifetime1 = 0; var1Lifetime1 < 32768; var1Lifetime1++) {
          field_n[var1Lifetime1] = (int)(Math.sin((double)var1Lifetime1 / 5215.1903) * 16384.0);
        }
        field_f = new int[220500];
        field_c = new int[5];
        field_w = new int[5];
        field_u = new int[5];
        field_l = new int[5];
        field_g = new int[5];
    }
}
