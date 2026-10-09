/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ed {
    private static int[] field_b;
    private int[] field_x;
    private uc field_t;
    private uc field_q;
    private ub field_e;
    private uc field_o;
    private uc field_y;
    private int[] field_j;
    private int field_h;
    private uc field_u;
    private uc field_k;
    private uc field_w;
    private static int[] field_g;
    int field_d;
    private int[] field_a;
    private uc field_n;
    private int field_r;
    private uc field_m;
    int field_v;
    private static int[] field_f;
    private static int[] field_p;
    private static int[] field_s;
    private static int[] field_i;
    private static int[] field_l;
    private static int[] field_c;

    public static void a() {
        field_f = null;
        field_b = null;
        field_g = null;
        field_i = null;
        field_s = null;
        field_l = null;
        field_c = null;
        field_p = null;
    }

    private final int a(int param0, int param1, int param2) {
        if (param2 == 1) {
            if ((param0 & 32767) < 16384) {
                return param1;
            }
            return -param1;
        }
        if (param2 == 2) {
            return field_g[param0 & 32767] * param1 >> 14;
        }
        if (param2 == 3) {
            return ((param0 & 32767) * param1 >> 14) - param1;
        }
        if (param2 == 4) {
            return field_b[param0 / 2607 & 32767] * param1;
        }
        return 0;
    }

    final void a(qc param0) {
        int var3 = 0;
        int var4 = 0;
        this.field_t = new uc();
        this.field_t.a(param0);
        this.field_o = new uc();
        this.field_o.a(param0);
        int var2 = param0.c((byte) 34);
        if (var2 != 0) {
            param0.field_f = param0.field_f - 1;
            this.field_y = new uc();
            this.field_y.a(param0);
            this.field_w = new uc();
            this.field_w.a(param0);
        }
        var2 = param0.c((byte) 34);
        if (var2 != 0) {
            param0.field_f = param0.field_f - 1;
            this.field_u = new uc();
            this.field_u.a(param0);
            this.field_n = new uc();
            this.field_n.a(param0);
        }
        var2 = param0.c((byte) 34);
        if (var2 != 0) {
            param0.field_f = param0.field_f - 1;
            this.field_q = new uc();
            this.field_q.a(param0);
            this.field_m = new uc();
            this.field_m.a(param0);
        }
        for (var3 = 0; var3 < 10; var3++) {
            var4 = param0.c(1);
            if (var4 == 0) {
                break;
            }
            this.field_a[var3] = var4;
            this.field_j[var3] = param0.h(-125);
            this.field_x[var3] = param0.c(1);
        }
        this.field_h = param0.c(1);
        this.field_r = param0.c(1);
        this.field_d = param0.b(true);
        this.field_v = param0.b(true);
        this.field_e = new ub();
        this.field_k = new uc();
        this.field_e.a(param0, this.field_k);
    }

    final int[] a(int param0, int param1) {
        int stackIn_36_0 = 0;
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
        sf.a(field_f, 0, param0);
        if (param1 < 10) {
          return field_f;
        }
        var3 = (double)param0 / ((double)param1 + 0.0);
        this.field_t.a();
        this.field_o.a();
        var5 = 0;
        var6 = 0;
        var7 = 0;
        if (this.field_y != null) {
          this.field_y.a();
          this.field_w.a();
          var5 = (int)((double)(this.field_y.field_g - this.field_y.field_j) * 32.768 / var3);
          var6 = (int)((double)this.field_y.field_j * 32.768 / var3);
        }
        var8 = 0;
        var9 = 0;
        var10 = 0;
        if (this.field_u != null) {
          this.field_u.a();
          this.field_n.a();
          var8 = (int)((double)(this.field_u.field_g - this.field_u.field_j) * 32.768 / var3);
          var9 = (int)((double)this.field_u.field_j * 32.768 / var3);
        }
        for (var11 = 0; var11 < 5; var11++) {
          if (this.field_a[var11] == 0) {
            continue;
          }
          field_i[var11] = 0;
          field_s[var11] = (int)((double)this.field_x[var11] * var3);
          field_l[var11] = (this.field_a[var11] << 14) / 100;
          field_c[var11] = (int)((double)(this.field_t.field_g - this.field_t.field_j) * 32.768 * Math.pow(1.0057929410678534, (double)this.field_j[var11]) / var3);
          field_p[var11] = (int)((double)this.field_t.field_j * 32.768 / var3);
        }
        for (var11Lifetime1 = 0; var11Lifetime1 < param0; var11Lifetime1++) {
          var12 = this.field_t.a(param0);
          var13 = this.field_o.a(param0);
          if (this.field_y != null) {
            var14 = this.field_y.a(param0);
            var15 = this.field_w.a(param0);
            var12 = var12 + (this.a(var7, var15, this.field_y.field_e) >> 1);
            var7 = var7 + ((var14 * var5 >> 16) + var6);
          }
          if (this.field_u != null) {
            var14Lifetime3 = this.field_u.a(param0);
            var15Lifetime3 = this.field_n.a(param0);
            var13 = var13 * ((this.a(var10, var15Lifetime3, this.field_u.field_e) >> 1) + 32768) >> 15;
            var10 = var10 + ((var14Lifetime3 * var8 >> 16) + var9);
          }
          for (var14Lifetime4 = 0; var14Lifetime4 < 5; var14Lifetime4++) {
            if (this.field_a[var14Lifetime4] == 0) {
              continue;
            }
            var15Lifetime4 = var11Lifetime1 + field_s[var14Lifetime4];
            if (var15Lifetime4 >= param0) {
              continue;
            }
            field_f[var15Lifetime4] = field_f[var15Lifetime4] + this.a(field_i[var14Lifetime4], var13 * field_l[var14Lifetime4] >> 15, this.field_t.field_e);
            field_i[var14Lifetime4] = field_i[var14Lifetime4] + ((var12 * field_c[var14Lifetime4] >> 16) + field_p[var14Lifetime4]);
          }
        }
        if (this.field_q != null) {
          this.field_q.a();
          this.field_m.a();
          var11Lifetime2 = 0;
          var12Lifetime1 = 0;
          var13Lifetime1 = 1;
          for (var14Lifetime1 = 0; var14Lifetime1 < param0; var14Lifetime1++) {
            var15Lifetime1 = this.field_q.a(param0);
            var16 = this.field_m.a(param0);
            if (var13Lifetime1 == 0) {
              var12Lifetime1Lifetime1 = this.field_q.field_j + ((this.field_q.field_g - this.field_q.field_j) * var16 >> 8);
            } else {
              var12Lifetime1Lifetime1 = this.field_q.field_j + ((this.field_q.field_g - this.field_q.field_j) * var15Lifetime1 >> 8);
            }
            var11Lifetime2 += 256;
            if (var11Lifetime2 >= var12Lifetime1Lifetime1) {
              var11Lifetime2 = 0;
              stackIn_36_0 = (var13Lifetime1 != 0) ? 0 : 1;
              var13Lifetime1 = stackIn_36_0;
            }
            if (var13Lifetime1 == 0) {
              continue;
            }
            field_f[var14Lifetime1] = 0;
          }
        }
        if (this.field_h > 0 &&
            this.field_r > 0) {
          var11Lifetime3 = (int)((double)this.field_h * var3);
          for (var12Lifetime2 = var11Lifetime3; var12Lifetime2 < param0; var12Lifetime2++) {
            field_f[var12Lifetime2] = field_f[var12Lifetime2] + field_f[var12Lifetime2 - var11Lifetime3] * this.field_r / 100;
          }
        }
        if (!(this.field_e.field_b[0] <= 0) ||
            !(this.field_e.field_b[1] <= 0)) {
          this.field_k.a();
          var11Lifetime4 = this.field_k.a(param0 + 1);
          var12Lifetime3 = this.field_e.a(0, (float)var11Lifetime4 / 65536.0f);
          var13Lifetime2 = this.field_e.a(1, (float)var11Lifetime4 / 65536.0f);
          if (param0 >= var12Lifetime3 + var13Lifetime2) {
            var14Lifetime2 = 0;
            var15Lifetime2 = var13Lifetime2;
            if (var15Lifetime2 > param0 - var12Lifetime3) {
              var15Lifetime2 = param0 - var12Lifetime3;
            }
            while (var14Lifetime2 < var15Lifetime2) {
              var16Lifetime1 = (int)((long)field_f[var14Lifetime2 + var12Lifetime3] * (long)ub.field_a >> 16);
              for (var17 = 0; var17 < var12Lifetime3; var17++) {
                var16Lifetime1 = var16Lifetime1 + (int)((long)field_f[var14Lifetime2 + var12Lifetime3 - 1 - var17] * (long)ub.field_g[0][var17] >> 16);
              }
              for (var17 = 0; var17 < var14Lifetime2; var17++) {
                var16Lifetime1 = var16Lifetime1 - (int)((long)field_f[var14Lifetime2 - 1 - var17] * (long)ub.field_g[1][var17] >> 16);
              }
              field_f[var14Lifetime2] = var16Lifetime1;
              var11Lifetime4 = this.field_k.a(param0 + 1);
              var14Lifetime2++;
            }
            var15Lifetime2Lifetime1 = 128;
            while (true) {
              if (var15Lifetime2Lifetime1 > param0 - var12Lifetime3) {
                var15Lifetime2Lifetime1 = param0 - var12Lifetime3;
              }
              while (var14Lifetime2 < var15Lifetime2Lifetime1) {
                var16Lifetime1Lifetime1 = (int)((long)field_f[var14Lifetime2 + var12Lifetime3] * (long)ub.field_a >> 16);
                for (var17Lifetime1 = 0; var17Lifetime1 < var12Lifetime3; var17Lifetime1++) {
                  var16Lifetime1Lifetime1 = var16Lifetime1Lifetime1 + (int)((long)field_f[var14Lifetime2 + var12Lifetime3 - 1 - var17Lifetime1] * (long)ub.field_g[0][var17Lifetime1] >> 16);
                }
                for (var17Lifetime1 = 0; var17Lifetime1 < var13Lifetime2; var17Lifetime1++) {
                  var16Lifetime1Lifetime1 = var16Lifetime1Lifetime1 - (int)((long)field_f[var14Lifetime2 - 1 - var17Lifetime1] * (long)ub.field_g[1][var17Lifetime1] >> 16);
                }
                field_f[var14Lifetime2] = var16Lifetime1Lifetime1;
                var11Lifetime4 = this.field_k.a(param0 + 1);
                var14Lifetime2++;
              }
              if (var14Lifetime2 < param0 - var12Lifetime3) {
                var12Lifetime3 = this.field_e.a(0, (float)var11Lifetime4 / 65536.0f);
                var13Lifetime2 = this.field_e.a(1, (float)var11Lifetime4 / 65536.0f);
                var15Lifetime2Lifetime1 += 128;
                continue;
              }
              break;
            }
            while (var14Lifetime2 < param0) {
              var16Lifetime1Lifetime2 = 0;
              for (var17Lifetime2 = var14Lifetime2 + var12Lifetime3 - param0; var17Lifetime2 < var12Lifetime3; var17Lifetime2++) {
                var16Lifetime1Lifetime2 = var16Lifetime1Lifetime2 + (int)((long)field_f[var14Lifetime2 + var12Lifetime3 - 1 - var17Lifetime2] * (long)ub.field_g[0][var17Lifetime2] >> 16);
              }
              for (var17Lifetime2 = 0; var17Lifetime2 < var13Lifetime2; var17Lifetime2++) {
                var16Lifetime1Lifetime2 = var16Lifetime1Lifetime2 - (int)((long)field_f[var14Lifetime2 - 1 - var17Lifetime2] * (long)ub.field_g[1][var17Lifetime2] >> 16);
              }
              field_f[var14Lifetime2] = var16Lifetime1Lifetime2;
              var11Lifetime4 = this.field_k.a(param0 + 1);
              var14Lifetime2++;
            }
          }
        }
        for (var11Lifetime5 = 0; var11Lifetime5 < param0; var11Lifetime5++) {
          if (field_f[var11Lifetime5] < -32768) {
            field_f[var11Lifetime5] = -32768;
          }
          if (field_f[var11Lifetime5] <= 32767) {
            continue;
          }
          field_f[var11Lifetime5] = 32767;
        }
        return field_f;
    }

    ed() {
        this.field_x = new int[]{0, 0, 0, 0, 0};
        this.field_h = 0;
        this.field_j = new int[]{0, 0, 0, 0, 0};
        this.field_a = new int[]{0, 0, 0, 0, 0};
        this.field_r = 100;
        this.field_d = 500;
        this.field_v = 0;
    }

    static {
        int var1 = 0;
        field_b = new int[32768];
        Random var0 = new Random(0L);
        for (var1 = 0; var1 < 32768; var1++) {
            field_b[var1] = (var0.nextInt() & 2) - 1;
        }
        field_g = new int[32768];
        for (var1 = 0; var1 < 32768; var1++) {
            field_g[var1] = (int)(Math.sin((double)var1 / 5215.1903) * 16384.0);
        }
        field_f = new int[220500];
        field_p = new int[5];
        field_i = new int[5];
        field_l = new int[5];
        field_s = new int[5];
        field_c = new int[5];
    }
}
