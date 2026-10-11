/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class fka {
    private int[] field_u;
    private static int[] field_w;
    private co field_p;
    private int field_m;
    private co field_g;
    private co field_c;
    private co field_k;
    private static int[] field_b;
    private co field_e;
    private hva field_n;
    private static int[] field_x;
    private co field_y;
    int field_v;
    private int field_f;
    private int[] field_a;
    private co field_d;
    private static int[] field_q;
    private int[] field_t;
    private static int[] field_r;
    private static int[] field_s;
    private co field_l;
    private static int[] field_o;
    private static int[] field_j;
    int field_i;
    private co field_h;

    final void a(uia param0) {
        int var3 = 0;
        int var4 = 0;
        this.field_g = new co();
        this.field_g.b(param0);
        this.field_y = new co();
        this.field_y.b(param0);
        int var2 = param0.h(255);
        if (var2 != 0) {
          param0.field_h = param0.field_h - 1;
          this.field_c = new co();
          this.field_c.b(param0);
          this.field_l = new co();
          this.field_l.b(param0);
        }
        var2 = param0.h(255);
        if (var2 != 0) {
          param0.field_h = param0.field_h - 1;
          this.field_e = new co();
          this.field_e.b(param0);
          this.field_p = new co();
          this.field_p.b(param0);
        }
        var2 = param0.h(255);
        if (var2 != 0) {
          param0.field_h = param0.field_h - 1;
          this.field_k = new co();
          this.field_k.b(param0);
          this.field_h = new co();
          this.field_h.b(param0);
        }
        for (var3 = 0; var3 < 10; var3++) {
          var4 = param0.d((byte) -46);
          if (var4 == 0) {
            break;
          }
          this.field_a[var3] = var4;
          this.field_u[var3] = param0.f((byte) -128);
          this.field_t[var3] = param0.d((byte) -46);
        }
        this.field_f = param0.d((byte) -46);
        this.field_m = param0.d((byte) -46);
        this.field_v = param0.d(123);
        this.field_i = param0.d(126);
        this.field_n = new hva();
        this.field_d = new co();
        this.field_n.a(param0, this.field_d);
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
        lua.a(field_x, 0, param0);
        if (param1 < 10) {
          return field_x;
        }
        var3 = (double)param0 / ((double)param1 + 0.0);
        this.field_g.a();
        this.field_y.a();
        var5 = 0;
        var6 = 0;
        var7 = 0;
        if (this.field_c != null) {
          this.field_c.a();
          this.field_l.a();
          var5 = (int)((double)(this.field_c.field_i - this.field_c.field_e) * 32.768 / var3);
          var6 = (int)((double)this.field_c.field_e * 32.768 / var3);
        }
        var8 = 0;
        var9 = 0;
        var10 = 0;
        if (this.field_e != null) {
          this.field_e.a();
          this.field_p.a();
          var8 = (int)((double)(this.field_e.field_i - this.field_e.field_e) * 32.768 / var3);
          var9 = (int)((double)this.field_e.field_e * 32.768 / var3);
        }
        for (var11 = 0; var11 < 5; var11++) {
          if (this.field_a[var11] != 0) {
            field_r[var11] = 0;
            field_s[var11] = (int)((double)this.field_t[var11] * var3);
            field_j[var11] = (this.field_a[var11] << 14) / 100;
            field_o[var11] = (int)((double)(this.field_g.field_i - this.field_g.field_e) * 32.768 * Math.pow(1.0057929410678534, (double)this.field_u[var11]) / var3);
            field_q[var11] = (int)((double)this.field_g.field_e * 32.768 / var3);
          }
        }
        for (var11Lifetime1 = 0; var11Lifetime1 < param0; var11Lifetime1++) {
          var12 = this.field_g.a(param0);
          var13 = this.field_y.a(param0);
          if (this.field_c != null) {
            var14 = this.field_c.a(param0);
            var15 = this.field_l.a(param0);
            var12 = var12 + (this.a(var7, var15, this.field_c.field_a) >> 1);
            var7 = var7 + ((var14 * var5 >> 16) + var6);
          }
          if (this.field_e != null) {
            var14Lifetime3 = this.field_e.a(param0);
            var15Lifetime3 = this.field_p.a(param0);
            var13 = var13 * ((this.a(var10, var15Lifetime3, this.field_e.field_a) >> 1) + 32768) >> 15;
            var10 = var10 + ((var14Lifetime3 * var8 >> 16) + var9);
          }
          for (var14Lifetime4 = 0; var14Lifetime4 < 5; var14Lifetime4++) {
            if (this.field_a[var14Lifetime4] != 0) {
              var15Lifetime4 = var11Lifetime1 + field_s[var14Lifetime4];
              if (var15Lifetime4 < param0) {
                field_x[var15Lifetime4] = field_x[var15Lifetime4] + this.a(field_r[var14Lifetime4], var13 * field_j[var14Lifetime4] >> 15, this.field_g.field_a);
                field_r[var14Lifetime4] = field_r[var14Lifetime4] + ((var12 * field_o[var14Lifetime4] >> 16) + field_q[var14Lifetime4]);
              }
            }
          }
        }
        if (this.field_k != null) {
          this.field_k.a();
          this.field_h.a();
          var11Lifetime2 = 0;
          var12Lifetime1 = 0;
          var13Lifetime1 = 1;
          for (var14Lifetime1 = 0; var14Lifetime1 < param0; var14Lifetime1++) {
            var15Lifetime1 = this.field_k.a(param0);
            var16 = this.field_h.a(param0);
            if (var13Lifetime1 == 0) {
              var12Lifetime1Lifetime1 = this.field_k.field_e + ((this.field_k.field_i - this.field_k.field_e) * var16 >> 8);
            } else {
              var12Lifetime1Lifetime1 = this.field_k.field_e + ((this.field_k.field_i - this.field_k.field_e) * var15Lifetime1 >> 8);
            }
            var11Lifetime2 += 256;
            if (var11Lifetime2 >= var12Lifetime1Lifetime1) {
              var11Lifetime2 = 0;
              stackIn_41_0 = (var13Lifetime1 != 0) ? 0 : 1;
              var13Lifetime1 = stackIn_41_0;
            }
            if (var13Lifetime1 != 0) {
              field_x[var14Lifetime1] = 0;
            }
          }
        }
        if (this.field_f > 0 &&
          this.field_m > 0) {
          var11Lifetime3 = (int)((double)this.field_f * var3);
          for (var12Lifetime2 = var11Lifetime3; var12Lifetime2 < param0; var12Lifetime2++) {
            field_x[var12Lifetime2] = field_x[var12Lifetime2] + field_x[var12Lifetime2 - var11Lifetime3] * this.field_m / 100;
          }
        }
        if (!(this.field_n.field_a[0] <= 0) ||
          !(this.field_n.field_a[1] <= 0)) {
          this.field_d.a();
          var11Lifetime4 = this.field_d.a(param0 + 1);
          var12Lifetime3 = this.field_n.a(0, (float)var11Lifetime4 / 65536.0f);
          var13Lifetime2 = this.field_n.a(1, (float)var11Lifetime4 / 65536.0f);
          if (param0 >= var12Lifetime3 + var13Lifetime2) {
            var14Lifetime2 = 0;
            var15Lifetime2 = var13Lifetime2;
            if (var15Lifetime2 > param0 - var12Lifetime3) {
              var15Lifetime2 = param0 - var12Lifetime3;
            }
            while (var14Lifetime2 < var15Lifetime2) {
              var16Lifetime1 = (int)((long)field_x[var14Lifetime2 + var12Lifetime3] * (long)hva.field_d >> 16);
              for (var17 = 0; var17 < var12Lifetime3; var17++) {
                var16Lifetime1 = var16Lifetime1 + (int)((long)field_x[var14Lifetime2 + var12Lifetime3 - 1 - var17] * (long)hva.field_g[0][var17] >> 16);
              }
              for (var17Lifetime3 = 0; var17Lifetime3 < var14Lifetime2; var17Lifetime3++) {
                var16Lifetime1 = var16Lifetime1 - (int)((long)field_x[var14Lifetime2 - 1 - var17Lifetime3] * (long)hva.field_g[1][var17Lifetime3] >> 16);
              }
              field_x[var14Lifetime2] = var16Lifetime1;
              var11Lifetime4 = this.field_d.a(param0 + 1);
              var14Lifetime2++;
            }
            var15Lifetime2Lifetime1 = 128;
            while (true) {
              if (var15Lifetime2Lifetime1 > param0 - var12Lifetime3) {
                var15Lifetime2Lifetime1 = param0 - var12Lifetime3;
              }
              while (var14Lifetime2 < var15Lifetime2Lifetime1) {
                var16Lifetime1Lifetime1 = (int)((long)field_x[var14Lifetime2 + var12Lifetime3] * (long)hva.field_d >> 16);
                for (var17Lifetime1 = 0; var17Lifetime1 < var12Lifetime3; var17Lifetime1++) {
                  var16Lifetime1Lifetime1 = var16Lifetime1Lifetime1 + (int)((long)field_x[var14Lifetime2 + var12Lifetime3 - 1 - var17Lifetime1] * (long)hva.field_g[0][var17Lifetime1] >> 16);
                }
                for (var17Lifetime1Lifetime1 = 0; var17Lifetime1Lifetime1 < var13Lifetime2; var17Lifetime1Lifetime1++) {
                  var16Lifetime1Lifetime1 = var16Lifetime1Lifetime1 - (int)((long)field_x[var14Lifetime2 - 1 - var17Lifetime1Lifetime1] * (long)hva.field_g[1][var17Lifetime1Lifetime1] >> 16);
                }
                field_x[var14Lifetime2] = var16Lifetime1Lifetime1;
                var11Lifetime4 = this.field_d.a(param0 + 1);
                var14Lifetime2++;
              }
              if (var14Lifetime2 < param0 - var12Lifetime3) {
                var12Lifetime3 = this.field_n.a(0, (float)var11Lifetime4 / 65536.0f);
                var13Lifetime2 = this.field_n.a(1, (float)var11Lifetime4 / 65536.0f);
                var15Lifetime2Lifetime1 += 128;
                continue;
              }
              break;
            }
            while (var14Lifetime2 < param0) {
              var16Lifetime1Lifetime2 = 0;
              for (var17Lifetime2 = var14Lifetime2 + var12Lifetime3 - param0; var17Lifetime2 < var12Lifetime3; var17Lifetime2++) {
                var16Lifetime1Lifetime2 = var16Lifetime1Lifetime2 + (int)((long)field_x[var14Lifetime2 + var12Lifetime3 - 1 - var17Lifetime2] * (long)hva.field_g[0][var17Lifetime2] >> 16);
              }
              for (var17Lifetime2Lifetime1 = 0; var17Lifetime2Lifetime1 < var13Lifetime2; var17Lifetime2Lifetime1++) {
                var16Lifetime1Lifetime2 = var16Lifetime1Lifetime2 - (int)((long)field_x[var14Lifetime2 - 1 - var17Lifetime2Lifetime1] * (long)hva.field_g[1][var17Lifetime2Lifetime1] >> 16);
              }
              field_x[var14Lifetime2] = var16Lifetime1Lifetime2;
              var11Lifetime4 = this.field_d.a(param0 + 1);
              var14Lifetime2++;
            }
          }
        }
        for (var11Lifetime5 = 0; var11Lifetime5 < param0; var11Lifetime5++) {
          if (field_x[var11Lifetime5] < -32768) {
            field_x[var11Lifetime5] = -32768;
          }
          if (field_x[var11Lifetime5] > 32767) {
            field_x[var11Lifetime5] = 32767;
          }
        }
        return field_x;
    }

    private final int a(int param0, int param1, int param2) {
        if (param2 == 1) {
          if ((param0 & 32767) < 16384) {
            return param1;
          }
          return -param1;
        }
        if (param2 == 2) {
          return field_b[param0 & 32767] * param1 >> 14;
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
        field_x = null;
        field_w = null;
        field_b = null;
        field_r = null;
        field_s = null;
        field_j = null;
        field_o = null;
        field_q = null;
    }

    fka() {
        this.field_m = 100;
        this.field_u = new int[]{0, 0, 0, 0, 0};
        this.field_a = new int[]{0, 0, 0, 0, 0};
        this.field_v = 500;
        this.field_f = 0;
        this.field_t = new int[]{0, 0, 0, 0, 0};
        this.field_i = 0;
    }

    static {
        int var1 = 0;
        int var1Lifetime1;
        field_w = new int[32768];
        Random var0 = new Random(0L);
        for (var1 = 0; var1 < 32768; var1++) {
          field_w[var1] = (var0.nextInt() & 2) - 1;
        }
        field_b = new int[32768];
        for (var1Lifetime1 = 0; var1Lifetime1 < 32768; var1Lifetime1++) {
          field_b[var1Lifetime1] = (int)(Math.sin((double)var1Lifetime1 / 5215.1903) * 16384.0);
        }
        field_x = new int[220500];
        field_o = new int[5];
        field_r = new int[5];
        field_j = new int[5];
        field_q = new int[5];
        field_s = new int[5];
    }
}
