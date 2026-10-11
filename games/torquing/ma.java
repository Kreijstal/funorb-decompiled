/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ma {
    private td field_j;
    private td field_u;
    private td field_p;
    private int field_t;
    private td field_i;
    private static int[] field_n;
    private int[] field_d;
    int field_q;
    private td field_a;
    int field_f;
    private lo field_y;
    private td field_r;
    private int[] field_c;
    private td field_b;
    private int[] field_x;
    private td field_s;
    private static int[] field_v;
    private int field_o;
    private td field_m;
    private static int[] field_w;
    private static int[] field_g;
    private static int[] field_k;
    private static int[] field_e;
    private static int[] field_l;
    private static int[] field_h;

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

    final void a(fj param0) {
        int var3 = 0;
        int var4 = 0;
        this.field_r = new td();
        this.field_r.a(param0);
        this.field_i = new td();
        this.field_i.a(param0);
        int var2 = param0.i((byte) -101);
        if (var2 != 0) {
          param0.field_n = param0.field_n - 1;
          this.field_s = new td();
          this.field_s.a(param0);
          this.field_p = new td();
          this.field_p.a(param0);
        }
        var2 = param0.i((byte) -101);
        if (var2 != 0) {
          param0.field_n = param0.field_n - 1;
          this.field_b = new td();
          this.field_b.a(param0);
          this.field_m = new td();
          this.field_m.a(param0);
        }
        var2 = param0.i((byte) -101);
        if (var2 != 0) {
          param0.field_n = param0.field_n - 1;
          this.field_a = new td();
          this.field_a.a(param0);
          this.field_j = new td();
          this.field_j.a(param0);
        }
        for (var3 = 0; var3 < 10; var3++) {
          var4 = param0.a((byte) -112);
          if (var4 == 0) {
            break;
          }
          this.field_c[var3] = var4;
          this.field_x[var3] = param0.g((byte) -124);
          this.field_d[var3] = param0.a((byte) -121);
        }
        this.field_t = param0.a((byte) -123);
        this.field_o = param0.a((byte) -119);
        this.field_f = param0.i(7088);
        this.field_q = param0.i(7088);
        this.field_y = new lo();
        this.field_u = new td();
        this.field_y.a(param0, this.field_u);
    }

    public static void a() {
        field_w = null;
        field_v = null;
        field_n = null;
        field_g = null;
        field_h = null;
        field_k = null;
        field_l = null;
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
        dk.a(field_w, 0, param0);
        if (param1 < 10) {
          return field_w;
        }
        var3 = (double)param0 / ((double)param1 + 0.0);
        this.field_r.a();
        this.field_i.a();
        var5 = 0;
        var6 = 0;
        var7 = 0;
        if (this.field_s != null) {
          this.field_s.a();
          this.field_p.a();
          var5 = (int)((double)(this.field_s.field_a - this.field_s.field_e) * 32.768 / var3);
          var6 = (int)((double)this.field_s.field_e * 32.768 / var3);
        }
        var8 = 0;
        var9 = 0;
        var10 = 0;
        if (this.field_b != null) {
          this.field_b.a();
          this.field_m.a();
          var8 = (int)((double)(this.field_b.field_a - this.field_b.field_e) * 32.768 / var3);
          var9 = (int)((double)this.field_b.field_e * 32.768 / var3);
        }
        for (var11 = 0; var11 < 5; var11++) {
          if (this.field_c[var11] != 0) {
            field_g[var11] = 0;
            field_h[var11] = (int)((double)this.field_d[var11] * var3);
            field_k[var11] = (this.field_c[var11] << 14) / 100;
            field_l[var11] = (int)((double)(this.field_r.field_a - this.field_r.field_e) * 32.768 * Math.pow(1.0057929410678534, (double)this.field_x[var11]) / var3);
            field_e[var11] = (int)((double)this.field_r.field_e * 32.768 / var3);
          }
        }
        for (var11Lifetime1 = 0; var11Lifetime1 < param0; var11Lifetime1++) {
          var12 = this.field_r.a(param0);
          var13 = this.field_i.a(param0);
          if (this.field_s != null) {
            var14 = this.field_s.a(param0);
            var15 = this.field_p.a(param0);
            var12 = var12 + (this.a(var7, var15, this.field_s.field_c) >> 1);
            var7 = var7 + ((var14 * var5 >> 16) + var6);
          }
          if (this.field_b != null) {
            var14Lifetime3 = this.field_b.a(param0);
            var15Lifetime3 = this.field_m.a(param0);
            var13 = var13 * ((this.a(var10, var15Lifetime3, this.field_b.field_c) >> 1) + 32768) >> 15;
            var10 = var10 + ((var14Lifetime3 * var8 >> 16) + var9);
          }
          for (var14Lifetime4 = 0; var14Lifetime4 < 5; var14Lifetime4++) {
            if (this.field_c[var14Lifetime4] != 0) {
              var15Lifetime4 = var11Lifetime1 + field_h[var14Lifetime4];
              if (var15Lifetime4 < param0) {
                field_w[var15Lifetime4] = field_w[var15Lifetime4] + this.a(field_g[var14Lifetime4], var13 * field_k[var14Lifetime4] >> 15, this.field_r.field_c);
                field_g[var14Lifetime4] = field_g[var14Lifetime4] + ((var12 * field_l[var14Lifetime4] >> 16) + field_e[var14Lifetime4]);
              }
            }
          }
        }
        if (this.field_a != null) {
          this.field_a.a();
          this.field_j.a();
          var11Lifetime2 = 0;
          var12Lifetime1 = 0;
          var13Lifetime1 = 1;
          for (var14Lifetime1 = 0; var14Lifetime1 < param0; var14Lifetime1++) {
            var15Lifetime1 = this.field_a.a(param0);
            var16 = this.field_j.a(param0);
            if (var13Lifetime1 == 0) {
              var12Lifetime1Lifetime1 = this.field_a.field_e + ((this.field_a.field_a - this.field_a.field_e) * var16 >> 8);
            } else {
              var12Lifetime1Lifetime1 = this.field_a.field_e + ((this.field_a.field_a - this.field_a.field_e) * var15Lifetime1 >> 8);
            }
            var11Lifetime2 += 256;
            if (var11Lifetime2 >= var12Lifetime1Lifetime1) {
              var11Lifetime2 = 0;
              stackIn_41_0 = (var13Lifetime1 != 0) ? 0 : 1;
              var13Lifetime1 = stackIn_41_0;
            }
            if (var13Lifetime1 != 0) {
              field_w[var14Lifetime1] = 0;
            }
          }
        }
        if (this.field_t > 0 &&
          this.field_o > 0) {
          var11Lifetime3 = (int)((double)this.field_t * var3);
          for (var12Lifetime2 = var11Lifetime3; var12Lifetime2 < param0; var12Lifetime2++) {
            field_w[var12Lifetime2] = field_w[var12Lifetime2] + field_w[var12Lifetime2 - var11Lifetime3] * this.field_o / 100;
          }
        }
        if (!(this.field_y.field_e[0] <= 0) ||
          !(this.field_y.field_e[1] <= 0)) {
          this.field_u.a();
          var11Lifetime4 = this.field_u.a(param0 + 1);
          var12Lifetime3 = this.field_y.a(0, (float)var11Lifetime4 / 65536.0f);
          var13Lifetime2 = this.field_y.a(1, (float)var11Lifetime4 / 65536.0f);
          if (param0 >= var12Lifetime3 + var13Lifetime2) {
            var14Lifetime2 = 0;
            var15Lifetime2 = var13Lifetime2;
            if (var15Lifetime2 > param0 - var12Lifetime3) {
              var15Lifetime2 = param0 - var12Lifetime3;
            }
            while (var14Lifetime2 < var15Lifetime2) {
              var16Lifetime1 = (int)((long)field_w[var14Lifetime2 + var12Lifetime3] * (long)lo.field_h >> 16);
              for (var17 = 0; var17 < var12Lifetime3; var17++) {
                var16Lifetime1 = var16Lifetime1 + (int)((long)field_w[var14Lifetime2 + var12Lifetime3 - 1 - var17] * (long)lo.field_b[0][var17] >> 16);
              }
              for (var17Lifetime3 = 0; var17Lifetime3 < var14Lifetime2; var17Lifetime3++) {
                var16Lifetime1 = var16Lifetime1 - (int)((long)field_w[var14Lifetime2 - 1 - var17Lifetime3] * (long)lo.field_b[1][var17Lifetime3] >> 16);
              }
              field_w[var14Lifetime2] = var16Lifetime1;
              var11Lifetime4 = this.field_u.a(param0 + 1);
              var14Lifetime2++;
            }
            var15Lifetime2Lifetime1 = 128;
            while (true) {
              if (var15Lifetime2Lifetime1 > param0 - var12Lifetime3) {
                var15Lifetime2Lifetime1 = param0 - var12Lifetime3;
              }
              while (var14Lifetime2 < var15Lifetime2Lifetime1) {
                var16Lifetime1Lifetime1 = (int)((long)field_w[var14Lifetime2 + var12Lifetime3] * (long)lo.field_h >> 16);
                for (var17Lifetime1 = 0; var17Lifetime1 < var12Lifetime3; var17Lifetime1++) {
                  var16Lifetime1Lifetime1 = var16Lifetime1Lifetime1 + (int)((long)field_w[var14Lifetime2 + var12Lifetime3 - 1 - var17Lifetime1] * (long)lo.field_b[0][var17Lifetime1] >> 16);
                }
                for (var17Lifetime1Lifetime1 = 0; var17Lifetime1Lifetime1 < var13Lifetime2; var17Lifetime1Lifetime1++) {
                  var16Lifetime1Lifetime1 = var16Lifetime1Lifetime1 - (int)((long)field_w[var14Lifetime2 - 1 - var17Lifetime1Lifetime1] * (long)lo.field_b[1][var17Lifetime1Lifetime1] >> 16);
                }
                field_w[var14Lifetime2] = var16Lifetime1Lifetime1;
                var11Lifetime4 = this.field_u.a(param0 + 1);
                var14Lifetime2++;
              }
              if (var14Lifetime2 < param0 - var12Lifetime3) {
                var12Lifetime3 = this.field_y.a(0, (float)var11Lifetime4 / 65536.0f);
                var13Lifetime2 = this.field_y.a(1, (float)var11Lifetime4 / 65536.0f);
                var15Lifetime2Lifetime1 += 128;
                continue;
              }
              break;
            }
            while (var14Lifetime2 < param0) {
              var16Lifetime1Lifetime2 = 0;
              for (var17Lifetime2 = var14Lifetime2 + var12Lifetime3 - param0; var17Lifetime2 < var12Lifetime3; var17Lifetime2++) {
                var16Lifetime1Lifetime2 = var16Lifetime1Lifetime2 + (int)((long)field_w[var14Lifetime2 + var12Lifetime3 - 1 - var17Lifetime2] * (long)lo.field_b[0][var17Lifetime2] >> 16);
              }
              for (var17Lifetime2Lifetime1 = 0; var17Lifetime2Lifetime1 < var13Lifetime2; var17Lifetime2Lifetime1++) {
                var16Lifetime1Lifetime2 = var16Lifetime1Lifetime2 - (int)((long)field_w[var14Lifetime2 - 1 - var17Lifetime2Lifetime1] * (long)lo.field_b[1][var17Lifetime2Lifetime1] >> 16);
              }
              field_w[var14Lifetime2] = var16Lifetime1Lifetime2;
              var11Lifetime4 = this.field_u.a(param0 + 1);
              var14Lifetime2++;
            }
          }
        }
        for (var11Lifetime5 = 0; var11Lifetime5 < param0; var11Lifetime5++) {
          if (field_w[var11Lifetime5] < -32768) {
            field_w[var11Lifetime5] = -32768;
          }
          if (field_w[var11Lifetime5] > 32767) {
            field_w[var11Lifetime5] = 32767;
          }
        }
        return field_w;
    }

    ma() {
        this.field_t = 0;
        this.field_d = new int[]{0, 0, 0, 0, 0};
        this.field_f = 500;
        this.field_o = 100;
        this.field_x = new int[]{0, 0, 0, 0, 0};
        this.field_c = new int[]{0, 0, 0, 0, 0};
        this.field_q = 0;
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
        field_w = new int[220500];
        field_h = new int[5];
        field_g = new int[5];
        field_l = new int[5];
        field_k = new int[5];
        field_e = new int[5];
    }
}
