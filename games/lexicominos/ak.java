/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ak {
    private static int[] field_g;
    private int[] field_n;
    private se field_d;
    private se field_j;
    private int field_f;
    private se field_a;
    private se field_l;
    private static int[] field_m;
    private int[] field_h;
    private se field_u;
    int field_o;
    private se field_c;
    private gi field_y;
    private static int[] field_i;
    private se field_q;
    int field_r;
    private se field_t;
    private se field_x;
    private int[] field_w;
    private static int[] field_b;
    private static int[] field_v;
    private static int[] field_s;
    private static int[] field_e;
    private int field_p;
    private static int[] field_k;

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
          return field_i[param0 / 2607 & 32767] * param1;
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
        o.a(field_g, 0, param0);
        if (param1 < 10) {
          return field_g;
        }
        var3 = (double)param0 / ((double)param1 + 0.0);
        this.field_l.a();
        this.field_x.a();
        var5 = 0;
        var6 = 0;
        var7 = 0;
        if (this.field_c != null) {
          this.field_c.a();
          this.field_t.a();
          var5 = (int)((double)(this.field_c.field_c - this.field_c.field_e) * 32.768 / var3);
          var6 = (int)((double)this.field_c.field_e * 32.768 / var3);
        }
        var8 = 0;
        var9 = 0;
        var10 = 0;
        if (this.field_a != null) {
          this.field_a.a();
          this.field_u.a();
          var8 = (int)((double)(this.field_a.field_c - this.field_a.field_e) * 32.768 / var3);
          var9 = (int)((double)this.field_a.field_e * 32.768 / var3);
        }
        for (var11 = 0; var11 < 5; var11++) {
          if (this.field_w[var11] != 0) {
            field_e[var11] = 0;
            field_k[var11] = (int)((double)this.field_n[var11] * var3);
            field_v[var11] = (this.field_w[var11] << 14) / 100;
            field_s[var11] = (int)((double)(this.field_l.field_c - this.field_l.field_e) * 32.768 * Math.pow(1.0057929410678534, (double)this.field_h[var11]) / var3);
            field_b[var11] = (int)((double)this.field_l.field_e * 32.768 / var3);
          }
        }
        for (var11Lifetime1 = 0; var11Lifetime1 < param0; var11Lifetime1++) {
          var12 = this.field_l.a(param0);
          var13 = this.field_x.a(param0);
          if (this.field_c != null) {
            var14 = this.field_c.a(param0);
            var15 = this.field_t.a(param0);
            var12 = var12 + (this.a(var7, var15, this.field_c.field_a) >> 1);
            var7 = var7 + ((var14 * var5 >> 16) + var6);
          }
          if (this.field_a != null) {
            var14Lifetime3 = this.field_a.a(param0);
            var15Lifetime3 = this.field_u.a(param0);
            var13 = var13 * ((this.a(var10, var15Lifetime3, this.field_a.field_a) >> 1) + 32768) >> 15;
            var10 = var10 + ((var14Lifetime3 * var8 >> 16) + var9);
          }
          for (var14Lifetime4 = 0; var14Lifetime4 < 5; var14Lifetime4++) {
            if (this.field_w[var14Lifetime4] != 0) {
              var15Lifetime4 = var11Lifetime1 + field_k[var14Lifetime4];
              if (var15Lifetime4 < param0) {
                field_g[var15Lifetime4] = field_g[var15Lifetime4] + this.a(field_e[var14Lifetime4], var13 * field_v[var14Lifetime4] >> 15, this.field_l.field_a);
                field_e[var14Lifetime4] = field_e[var14Lifetime4] + ((var12 * field_s[var14Lifetime4] >> 16) + field_b[var14Lifetime4]);
              }
            }
          }
        }
        if (this.field_j != null) {
          this.field_j.a();
          this.field_d.a();
          var11Lifetime2 = 0;
          var12Lifetime1 = 0;
          var13Lifetime1 = 1;
          for (var14Lifetime1 = 0; var14Lifetime1 < param0; var14Lifetime1++) {
            var15Lifetime1 = this.field_j.a(param0);
            var16 = this.field_d.a(param0);
            if (var13Lifetime1 == 0) {
              var12Lifetime1Lifetime1 = this.field_j.field_e + ((this.field_j.field_c - this.field_j.field_e) * var16 >> 8);
            } else {
              var12Lifetime1Lifetime1 = this.field_j.field_e + ((this.field_j.field_c - this.field_j.field_e) * var15Lifetime1 >> 8);
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
        if (this.field_p > 0 &&
          this.field_f > 0) {
          var11Lifetime3 = (int)((double)this.field_p * var3);
          for (var12Lifetime2 = var11Lifetime3; var12Lifetime2 < param0; var12Lifetime2++) {
            field_g[var12Lifetime2] = field_g[var12Lifetime2] + field_g[var12Lifetime2 - var11Lifetime3] * this.field_f / 100;
          }
        }
        if (!(this.field_y.field_c[0] <= 0) ||
          !(this.field_y.field_c[1] <= 0)) {
          this.field_q.a();
          var11Lifetime4 = this.field_q.a(param0 + 1);
          var12Lifetime3 = this.field_y.a(0, (float)var11Lifetime4 / 65536.0f);
          var13Lifetime2 = this.field_y.a(1, (float)var11Lifetime4 / 65536.0f);
          if (param0 >= var12Lifetime3 + var13Lifetime2) {
            var14Lifetime2 = 0;
            var15Lifetime2 = var13Lifetime2;
            if (var15Lifetime2 > param0 - var12Lifetime3) {
              var15Lifetime2 = param0 - var12Lifetime3;
            }
            while (var14Lifetime2 < var15Lifetime2) {
              var16Lifetime1 = (int)((long)field_g[var14Lifetime2 + var12Lifetime3] * (long)gi.field_a >> 16);
              for (var17 = 0; var17 < var12Lifetime3; var17++) {
                var16Lifetime1 = var16Lifetime1 + (int)((long)field_g[var14Lifetime2 + var12Lifetime3 - 1 - var17] * (long)gi.field_g[0][var17] >> 16);
              }
              for (var17Lifetime3 = 0; var17Lifetime3 < var14Lifetime2; var17Lifetime3++) {
                var16Lifetime1 = var16Lifetime1 - (int)((long)field_g[var14Lifetime2 - 1 - var17Lifetime3] * (long)gi.field_g[1][var17Lifetime3] >> 16);
              }
              field_g[var14Lifetime2] = var16Lifetime1;
              var11Lifetime4 = this.field_q.a(param0 + 1);
              var14Lifetime2++;
            }
            var15Lifetime2Lifetime1 = 128;
            while (true) {
              if (var15Lifetime2Lifetime1 > param0 - var12Lifetime3) {
                var15Lifetime2Lifetime1 = param0 - var12Lifetime3;
              }
              while (var14Lifetime2 < var15Lifetime2Lifetime1) {
                var16Lifetime1Lifetime1 = (int)((long)field_g[var14Lifetime2 + var12Lifetime3] * (long)gi.field_a >> 16);
                for (var17Lifetime1 = 0; var17Lifetime1 < var12Lifetime3; var17Lifetime1++) {
                  var16Lifetime1Lifetime1 = var16Lifetime1Lifetime1 + (int)((long)field_g[var14Lifetime2 + var12Lifetime3 - 1 - var17Lifetime1] * (long)gi.field_g[0][var17Lifetime1] >> 16);
                }
                for (var17Lifetime1Lifetime1 = 0; var17Lifetime1Lifetime1 < var13Lifetime2; var17Lifetime1Lifetime1++) {
                  var16Lifetime1Lifetime1 = var16Lifetime1Lifetime1 - (int)((long)field_g[var14Lifetime2 - 1 - var17Lifetime1Lifetime1] * (long)gi.field_g[1][var17Lifetime1Lifetime1] >> 16);
                }
                field_g[var14Lifetime2] = var16Lifetime1Lifetime1;
                var11Lifetime4 = this.field_q.a(param0 + 1);
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
                var16Lifetime1Lifetime2 = var16Lifetime1Lifetime2 + (int)((long)field_g[var14Lifetime2 + var12Lifetime3 - 1 - var17Lifetime2] * (long)gi.field_g[0][var17Lifetime2] >> 16);
              }
              for (var17Lifetime2Lifetime1 = 0; var17Lifetime2Lifetime1 < var13Lifetime2; var17Lifetime2Lifetime1++) {
                var16Lifetime1Lifetime2 = var16Lifetime1Lifetime2 - (int)((long)field_g[var14Lifetime2 - 1 - var17Lifetime2Lifetime1] * (long)gi.field_g[1][var17Lifetime2Lifetime1] >> 16);
              }
              field_g[var14Lifetime2] = var16Lifetime1Lifetime2;
              var11Lifetime4 = this.field_q.a(param0 + 1);
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

    final void a(wf param0) {
        int var3 = 0;
        int var4 = 0;
        this.field_l = new se();
        this.field_l.b(param0);
        this.field_x = new se();
        this.field_x.b(param0);
        int var2 = param0.d(true);
        if (var2 != 0) {
          param0.field_h = param0.field_h - 1;
          this.field_c = new se();
          this.field_c.b(param0);
          this.field_t = new se();
          this.field_t.b(param0);
        }
        var2 = param0.d(true);
        if (var2 != 0) {
          param0.field_h = param0.field_h - 1;
          this.field_a = new se();
          this.field_a.b(param0);
          this.field_u = new se();
          this.field_u.b(param0);
        }
        var2 = param0.d(true);
        if (var2 != 0) {
          param0.field_h = param0.field_h - 1;
          this.field_j = new se();
          this.field_j.b(param0);
          this.field_d = new se();
          this.field_d.b(param0);
        }
        for (var3 = 0; var3 < 10; var3++) {
          var4 = param0.h((byte) -89);
          if (var4 == 0) {
            break;
          }
          this.field_w[var3] = var4;
          this.field_h[var3] = param0.c((byte) -10);
          this.field_n[var3] = param0.h((byte) -112);
        }
        this.field_p = param0.h((byte) -95);
        this.field_f = param0.h((byte) -127);
        this.field_r = param0.b(-1698573656);
        this.field_o = param0.b(-1698573656);
        this.field_y = new gi();
        this.field_q = new se();
        this.field_y.a(param0, this.field_q);
    }

    public static void a() {
        field_g = null;
        field_i = null;
        field_m = null;
        field_e = null;
        field_k = null;
        field_v = null;
        field_s = null;
        field_b = null;
    }

    ak() {
        this.field_f = 100;
        this.field_h = new int[]{0, 0, 0, 0, 0};
        this.field_r = 500;
        this.field_o = 0;
        this.field_n = new int[]{0, 0, 0, 0, 0};
        this.field_p = 0;
        this.field_w = new int[]{0, 0, 0, 0, 0};
    }

    static {
        int var1 = 0;
        int var1Lifetime1;
        field_i = new int[32768];
        Random var0 = new Random(0L);
        for (var1 = 0; var1 < 32768; var1++) {
          field_i[var1] = (var0.nextInt() & 2) - 1;
        }
        field_m = new int[32768];
        for (var1Lifetime1 = 0; var1Lifetime1 < 32768; var1Lifetime1++) {
          field_m[var1Lifetime1] = (int)(Math.sin((double)var1Lifetime1 / 5215.1903) * 16384.0);
        }
        field_g = new int[220500];
        field_b = new int[5];
        field_s = new int[5];
        field_v = new int[5];
        field_e = new int[5];
        field_k = new int[5];
    }
}
