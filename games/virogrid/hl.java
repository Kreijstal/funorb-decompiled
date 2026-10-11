/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class hl {
    private wj field_r;
    private int[] field_b;
    private wj field_i;
    private static int[] field_l;
    private wj field_y;
    private bh field_k;
    private wj field_s;
    private int field_u;
    int field_q;
    private int[] field_m;
    private wj field_x;
    private wj field_a;
    private wj field_h;
    private int[] field_p;
    private static int[] field_c;
    private wj field_f;
    int field_g;
    private static int[] field_w;
    private wj field_o;
    private int field_t;
    private static int[] field_j;
    private static int[] field_v;
    private static int[] field_d;
    private static int[] field_n;
    private static int[] field_e;

    private final int a(int param0, int param1, int param2) {
        if (param2 == 1) {
          if ((param0 & 32767) < 16384) {
            return param1;
          }
          return -param1;
        }
        if (param2 == 2) {
          return field_c[param0 & 32767] * param1 >> 14;
        }
        if (param2 == 3) {
          return ((param0 & 32767) * param1 >> 14) - param1;
        }
        if (param2 == 4) {
          return field_w[param0 / 2607 & 32767] * param1;
        }
        return 0;
    }

    public static void a() {
        field_l = null;
        field_w = null;
        field_c = null;
        field_n = null;
        field_v = null;
        field_d = null;
        field_j = null;
        field_e = null;
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
        ek.a(field_l, 0, param0);
        if (param1 < 10) {
          return field_l;
        }
        var3 = (double)param0 / ((double)param1 + 0.0);
        this.field_o.a();
        this.field_a.a();
        var5 = 0;
        var6 = 0;
        var7 = 0;
        if (this.field_h != null) {
          this.field_h.a();
          this.field_i.a();
          var5 = (int)((double)(this.field_h.field_f - this.field_h.field_j) * 32.768 / var3);
          var6 = (int)((double)this.field_h.field_j * 32.768 / var3);
        }
        var8 = 0;
        var9 = 0;
        var10 = 0;
        if (this.field_y != null) {
          this.field_y.a();
          this.field_r.a();
          var8 = (int)((double)(this.field_y.field_f - this.field_y.field_j) * 32.768 / var3);
          var9 = (int)((double)this.field_y.field_j * 32.768 / var3);
        }
        for (var11 = 0; var11 < 5; var11++) {
          if (this.field_m[var11] != 0) {
            field_n[var11] = 0;
            field_v[var11] = (int)((double)this.field_p[var11] * var3);
            field_d[var11] = (this.field_m[var11] << 14) / 100;
            field_j[var11] = (int)((double)(this.field_o.field_f - this.field_o.field_j) * 32.768 * Math.pow(1.0057929410678534, (double)this.field_b[var11]) / var3);
            field_e[var11] = (int)((double)this.field_o.field_j * 32.768 / var3);
          }
        }
        for (var11Lifetime1 = 0; var11Lifetime1 < param0; var11Lifetime1++) {
          var12 = this.field_o.a(param0);
          var13 = this.field_a.a(param0);
          if (this.field_h != null) {
            var14 = this.field_h.a(param0);
            var15 = this.field_i.a(param0);
            var12 = var12 + (this.a(var7, var15, this.field_h.field_h) >> 1);
            var7 = var7 + ((var14 * var5 >> 16) + var6);
          }
          if (this.field_y != null) {
            var14Lifetime3 = this.field_y.a(param0);
            var15Lifetime3 = this.field_r.a(param0);
            var13 = var13 * ((this.a(var10, var15Lifetime3, this.field_y.field_h) >> 1) + 32768) >> 15;
            var10 = var10 + ((var14Lifetime3 * var8 >> 16) + var9);
          }
          for (var14Lifetime4 = 0; var14Lifetime4 < 5; var14Lifetime4++) {
            if (this.field_m[var14Lifetime4] != 0) {
              var15Lifetime4 = var11Lifetime1 + field_v[var14Lifetime4];
              if (var15Lifetime4 < param0) {
                field_l[var15Lifetime4] = field_l[var15Lifetime4] + this.a(field_n[var14Lifetime4], var13 * field_d[var14Lifetime4] >> 15, this.field_o.field_h);
                field_n[var14Lifetime4] = field_n[var14Lifetime4] + ((var12 * field_j[var14Lifetime4] >> 16) + field_e[var14Lifetime4]);
              }
            }
          }
        }
        if (this.field_x != null) {
          this.field_x.a();
          this.field_f.a();
          var11Lifetime2 = 0;
          var12Lifetime1 = 0;
          var13Lifetime1 = 1;
          for (var14Lifetime1 = 0; var14Lifetime1 < param0; var14Lifetime1++) {
            var15Lifetime1 = this.field_x.a(param0);
            var16 = this.field_f.a(param0);
            if (var13Lifetime1 == 0) {
              var12Lifetime1Lifetime1 = this.field_x.field_j + ((this.field_x.field_f - this.field_x.field_j) * var16 >> 8);
            } else {
              var12Lifetime1Lifetime1 = this.field_x.field_j + ((this.field_x.field_f - this.field_x.field_j) * var15Lifetime1 >> 8);
            }
            var11Lifetime2 += 256;
            if (var11Lifetime2 >= var12Lifetime1Lifetime1) {
              var11Lifetime2 = 0;
              stackIn_41_0 = (var13Lifetime1 != 0) ? 0 : 1;
              var13Lifetime1 = stackIn_41_0;
            }
            if (var13Lifetime1 != 0) {
              field_l[var14Lifetime1] = 0;
            }
          }
        }
        if (this.field_u > 0 &&
          this.field_t > 0) {
          var11Lifetime3 = (int)((double)this.field_u * var3);
          for (var12Lifetime2 = var11Lifetime3; var12Lifetime2 < param0; var12Lifetime2++) {
            field_l[var12Lifetime2] = field_l[var12Lifetime2] + field_l[var12Lifetime2 - var11Lifetime3] * this.field_t / 100;
          }
        }
        if (!(this.field_k.field_b[0] <= 0) ||
          !(this.field_k.field_b[1] <= 0)) {
          this.field_s.a();
          var11Lifetime4 = this.field_s.a(param0 + 1);
          var12Lifetime3 = this.field_k.a(0, (float)var11Lifetime4 / 65536.0f);
          var13Lifetime2 = this.field_k.a(1, (float)var11Lifetime4 / 65536.0f);
          if (param0 >= var12Lifetime3 + var13Lifetime2) {
            var14Lifetime2 = 0;
            var15Lifetime2 = var13Lifetime2;
            if (var15Lifetime2 > param0 - var12Lifetime3) {
              var15Lifetime2 = param0 - var12Lifetime3;
            }
            while (var14Lifetime2 < var15Lifetime2) {
              var16Lifetime1 = (int)((long)field_l[var14Lifetime2 + var12Lifetime3] * (long)bh.field_g >> 16);
              for (var17 = 0; var17 < var12Lifetime3; var17++) {
                var16Lifetime1 = var16Lifetime1 + (int)((long)field_l[var14Lifetime2 + var12Lifetime3 - 1 - var17] * (long)bh.field_c[0][var17] >> 16);
              }
              for (var17Lifetime3 = 0; var17Lifetime3 < var14Lifetime2; var17Lifetime3++) {
                var16Lifetime1 = var16Lifetime1 - (int)((long)field_l[var14Lifetime2 - 1 - var17Lifetime3] * (long)bh.field_c[1][var17Lifetime3] >> 16);
              }
              field_l[var14Lifetime2] = var16Lifetime1;
              var11Lifetime4 = this.field_s.a(param0 + 1);
              var14Lifetime2++;
            }
            var15Lifetime2Lifetime1 = 128;
            while (true) {
              if (var15Lifetime2Lifetime1 > param0 - var12Lifetime3) {
                var15Lifetime2Lifetime1 = param0 - var12Lifetime3;
              }
              while (var14Lifetime2 < var15Lifetime2Lifetime1) {
                var16Lifetime1Lifetime1 = (int)((long)field_l[var14Lifetime2 + var12Lifetime3] * (long)bh.field_g >> 16);
                for (var17Lifetime1 = 0; var17Lifetime1 < var12Lifetime3; var17Lifetime1++) {
                  var16Lifetime1Lifetime1 = var16Lifetime1Lifetime1 + (int)((long)field_l[var14Lifetime2 + var12Lifetime3 - 1 - var17Lifetime1] * (long)bh.field_c[0][var17Lifetime1] >> 16);
                }
                for (var17Lifetime1Lifetime1 = 0; var17Lifetime1Lifetime1 < var13Lifetime2; var17Lifetime1Lifetime1++) {
                  var16Lifetime1Lifetime1 = var16Lifetime1Lifetime1 - (int)((long)field_l[var14Lifetime2 - 1 - var17Lifetime1Lifetime1] * (long)bh.field_c[1][var17Lifetime1Lifetime1] >> 16);
                }
                field_l[var14Lifetime2] = var16Lifetime1Lifetime1;
                var11Lifetime4 = this.field_s.a(param0 + 1);
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
                var16Lifetime1Lifetime2 = var16Lifetime1Lifetime2 + (int)((long)field_l[var14Lifetime2 + var12Lifetime3 - 1 - var17Lifetime2] * (long)bh.field_c[0][var17Lifetime2] >> 16);
              }
              for (var17Lifetime2Lifetime1 = 0; var17Lifetime2Lifetime1 < var13Lifetime2; var17Lifetime2Lifetime1++) {
                var16Lifetime1Lifetime2 = var16Lifetime1Lifetime2 - (int)((long)field_l[var14Lifetime2 - 1 - var17Lifetime2Lifetime1] * (long)bh.field_c[1][var17Lifetime2Lifetime1] >> 16);
              }
              field_l[var14Lifetime2] = var16Lifetime1Lifetime2;
              var11Lifetime4 = this.field_s.a(param0 + 1);
              var14Lifetime2++;
            }
          }
        }
        for (var11Lifetime5 = 0; var11Lifetime5 < param0; var11Lifetime5++) {
          if (field_l[var11Lifetime5] < -32768) {
            field_l[var11Lifetime5] = -32768;
          }
          if (field_l[var11Lifetime5] > 32767) {
            field_l[var11Lifetime5] = 32767;
          }
        }
        return field_l;
    }

    final void a(jc param0) {
        int var3 = 0;
        int var4 = 0;
        this.field_o = new wj();
        this.field_o.a(param0);
        this.field_a = new wj();
        this.field_a.a(param0);
        int var2 = param0.g(11132);
        if (var2 != 0) {
          param0.field_l = param0.field_l - 1;
          this.field_h = new wj();
          this.field_h.a(param0);
          this.field_i = new wj();
          this.field_i.a(param0);
        }
        var2 = param0.g(11132);
        if (var2 != 0) {
          param0.field_l = param0.field_l - 1;
          this.field_y = new wj();
          this.field_y.a(param0);
          this.field_r = new wj();
          this.field_r.a(param0);
        }
        var2 = param0.g(11132);
        if (var2 != 0) {
          param0.field_l = param0.field_l - 1;
          this.field_x = new wj();
          this.field_x.a(param0);
          this.field_f = new wj();
          this.field_f.a(param0);
        }
        for (var3 = 0; var3 < 10; var3++) {
          var4 = param0.c(false);
          if (var4 == 0) {
            break;
          }
          this.field_m[var3] = var4;
          this.field_b[var3] = param0.d(121);
          this.field_p[var3] = param0.c(false);
        }
        this.field_u = param0.c(false);
        this.field_t = param0.c(false);
        this.field_q = param0.c((byte) 36);
        this.field_g = param0.c((byte) -92);
        this.field_k = new bh();
        this.field_s = new wj();
        this.field_k.a(param0, this.field_s);
    }

    hl() {
        this.field_q = 500;
        this.field_b = new int[]{0, 0, 0, 0, 0};
        this.field_u = 0;
        this.field_m = new int[]{0, 0, 0, 0, 0};
        this.field_p = new int[]{0, 0, 0, 0, 0};
        this.field_g = 0;
        this.field_t = 100;
    }

    static {
        int var1 = 0;
        int var1Lifetime1;
        field_w = new int[32768];
        Random var0 = new Random(0L);
        for (var1 = 0; var1 < 32768; var1++) {
          field_w[var1] = (var0.nextInt() & 2) - 1;
        }
        field_c = new int[32768];
        for (var1Lifetime1 = 0; var1Lifetime1 < 32768; var1Lifetime1++) {
          field_c[var1Lifetime1] = (int)(Math.sin((double)var1Lifetime1 / 5215.1903) * 16384.0);
        }
        field_l = new int[220500];
        field_v = new int[5];
        field_d = new int[5];
        field_j = new int[5];
        field_e = new int[5];
        field_n = new int[5];
    }
}
