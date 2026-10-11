/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class sda {
    private kd field_y;
    private static int[] field_o;
    private bc field_e;
    private kd field_c;
    private kd field_u;
    private kd field_i;
    int field_m;
    private kd field_d;
    private int[] field_l;
    private static int[] field_p;
    int field_b;
    private kd field_x;
    private int[] field_h;
    private int field_w;
    private kd field_a;
    private int field_s;
    private int[] field_q;
    private kd field_r;
    private static int[] field_t;
    private static int[] field_k;
    private static int[] field_f;
    private static int[] field_j;
    private static int[] field_v;
    private static int[] field_g;
    private kd field_n;

    private final int a(int param0, int param1, int param2) {
        if (param2 == 1) {
          if ((param0 & 32767) < 16384) {
            return param1;
          }
          return -param1;
        }
        if (param2 == 2) {
          return field_o[param0 & 32767] * param1 >> 14;
        }
        if (param2 == 3) {
          return ((param0 & 32767) * param1 >> 14) - param1;
        }
        if (param2 == 4) {
          return field_p[param0 / 2607 & 32767] * param1;
        }
        return 0;
    }

    final void a(lu param0) {
        int var3 = 0;
        int var4 = 0;
        this.field_i = new kd();
        this.field_i.b(param0);
        this.field_d = new kd();
        this.field_d.b(param0);
        int var2 = param0.b(16711935);
        if (var2 != 0) {
          param0.field_g = param0.field_g - 1;
          this.field_x = new kd();
          this.field_x.b(param0);
          this.field_r = new kd();
          this.field_r.b(param0);
        }
        var2 = param0.b(16711935);
        if (var2 != 0) {
          param0.field_g = param0.field_g - 1;
          this.field_n = new kd();
          this.field_n.b(param0);
          this.field_y = new kd();
          this.field_y.b(param0);
        }
        var2 = param0.b(16711935);
        if (var2 != 0) {
          param0.field_g = param0.field_g - 1;
          this.field_u = new kd();
          this.field_u.b(param0);
          this.field_a = new kd();
          this.field_a.b(param0);
        }
        for (var3 = 0; var3 < 10; var3++) {
          var4 = param0.h(16711935);
          if (var4 == 0) {
            break;
          }
          this.field_q[var3] = var4;
          this.field_h[var3] = param0.e(-4095);
          this.field_l[var3] = param0.h(16711935);
        }
        this.field_s = param0.h(16711935);
        this.field_w = param0.h(16711935);
        this.field_b = param0.e((byte) 45);
        this.field_m = param0.e((byte) 93);
        this.field_e = new bc();
        this.field_c = new kd();
        this.field_e.a(param0, this.field_c);
    }

    public static void a() {
        field_t = null;
        field_p = null;
        field_o = null;
        field_g = null;
        field_j = null;
        field_v = null;
        field_k = null;
        field_f = null;
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
        bl.a(field_t, 0, param0);
        if (param1 < 10) {
          return field_t;
        }
        var3 = (double)param0 / ((double)param1 + 0.0);
        this.field_i.a();
        this.field_d.a();
        var5 = 0;
        var6 = 0;
        var7 = 0;
        if (this.field_x != null) {
          this.field_x.a();
          this.field_r.a();
          var5 = (int)((double)(this.field_x.field_g - this.field_x.field_b) * 32.768 / var3);
          var6 = (int)((double)this.field_x.field_b * 32.768 / var3);
        }
        var8 = 0;
        var9 = 0;
        var10 = 0;
        if (this.field_n != null) {
          this.field_n.a();
          this.field_y.a();
          var8 = (int)((double)(this.field_n.field_g - this.field_n.field_b) * 32.768 / var3);
          var9 = (int)((double)this.field_n.field_b * 32.768 / var3);
        }
        for (var11 = 0; var11 < 5; var11++) {
          if (this.field_q[var11] != 0) {
            field_g[var11] = 0;
            field_j[var11] = (int)((double)this.field_l[var11] * var3);
            field_v[var11] = (this.field_q[var11] << 14) / 100;
            field_k[var11] = (int)((double)(this.field_i.field_g - this.field_i.field_b) * 32.768 * Math.pow(1.0057929410678534, (double)this.field_h[var11]) / var3);
            field_f[var11] = (int)((double)this.field_i.field_b * 32.768 / var3);
          }
        }
        for (var11Lifetime1 = 0; var11Lifetime1 < param0; var11Lifetime1++) {
          var12 = this.field_i.a(param0);
          var13 = this.field_d.a(param0);
          if (this.field_x != null) {
            var14 = this.field_x.a(param0);
            var15 = this.field_r.a(param0);
            var12 = var12 + (this.a(var7, var15, this.field_x.field_k) >> 1);
            var7 = var7 + ((var14 * var5 >> 16) + var6);
          }
          if (this.field_n != null) {
            var14Lifetime3 = this.field_n.a(param0);
            var15Lifetime3 = this.field_y.a(param0);
            var13 = var13 * ((this.a(var10, var15Lifetime3, this.field_n.field_k) >> 1) + 32768) >> 15;
            var10 = var10 + ((var14Lifetime3 * var8 >> 16) + var9);
          }
          for (var14Lifetime4 = 0; var14Lifetime4 < 5; var14Lifetime4++) {
            if (this.field_q[var14Lifetime4] != 0) {
              var15Lifetime4 = var11Lifetime1 + field_j[var14Lifetime4];
              if (var15Lifetime4 < param0) {
                field_t[var15Lifetime4] = field_t[var15Lifetime4] + this.a(field_g[var14Lifetime4], var13 * field_v[var14Lifetime4] >> 15, this.field_i.field_k);
                field_g[var14Lifetime4] = field_g[var14Lifetime4] + ((var12 * field_k[var14Lifetime4] >> 16) + field_f[var14Lifetime4]);
              }
            }
          }
        }
        if (this.field_u != null) {
          this.field_u.a();
          this.field_a.a();
          var11Lifetime2 = 0;
          var12Lifetime1 = 0;
          var13Lifetime1 = 1;
          for (var14Lifetime1 = 0; var14Lifetime1 < param0; var14Lifetime1++) {
            var15Lifetime1 = this.field_u.a(param0);
            var16 = this.field_a.a(param0);
            if (var13Lifetime1 == 0) {
              var12Lifetime1Lifetime1 = this.field_u.field_b + ((this.field_u.field_g - this.field_u.field_b) * var16 >> 8);
            } else {
              var12Lifetime1Lifetime1 = this.field_u.field_b + ((this.field_u.field_g - this.field_u.field_b) * var15Lifetime1 >> 8);
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
        if (this.field_s > 0 &&
          this.field_w > 0) {
          var11Lifetime3 = (int)((double)this.field_s * var3);
          for (var12Lifetime2 = var11Lifetime3; var12Lifetime2 < param0; var12Lifetime2++) {
            field_t[var12Lifetime2] = field_t[var12Lifetime2] + field_t[var12Lifetime2 - var11Lifetime3] * this.field_w / 100;
          }
        }
        if (!(this.field_e.field_d[0] <= 0) ||
          !(this.field_e.field_d[1] <= 0)) {
          this.field_c.a();
          var11Lifetime4 = this.field_c.a(param0 + 1);
          var12Lifetime3 = this.field_e.a(0, (float)var11Lifetime4 / 65536.0f);
          var13Lifetime2 = this.field_e.a(1, (float)var11Lifetime4 / 65536.0f);
          if (param0 >= var12Lifetime3 + var13Lifetime2) {
            var14Lifetime2 = 0;
            var15Lifetime2 = var13Lifetime2;
            if (var15Lifetime2 > param0 - var12Lifetime3) {
              var15Lifetime2 = param0 - var12Lifetime3;
            }
            while (var14Lifetime2 < var15Lifetime2) {
              var16Lifetime1 = (int)((long)field_t[var14Lifetime2 + var12Lifetime3] * (long)bc.field_a >> 16);
              for (var17 = 0; var17 < var12Lifetime3; var17++) {
                var16Lifetime1 = var16Lifetime1 + (int)((long)field_t[var14Lifetime2 + var12Lifetime3 - 1 - var17] * (long)bc.field_e[0][var17] >> 16);
              }
              for (var17Lifetime3 = 0; var17Lifetime3 < var14Lifetime2; var17Lifetime3++) {
                var16Lifetime1 = var16Lifetime1 - (int)((long)field_t[var14Lifetime2 - 1 - var17Lifetime3] * (long)bc.field_e[1][var17Lifetime3] >> 16);
              }
              field_t[var14Lifetime2] = var16Lifetime1;
              var11Lifetime4 = this.field_c.a(param0 + 1);
              var14Lifetime2++;
            }
            var15Lifetime2Lifetime1 = 128;
            while (true) {
              if (var15Lifetime2Lifetime1 > param0 - var12Lifetime3) {
                var15Lifetime2Lifetime1 = param0 - var12Lifetime3;
              }
              while (var14Lifetime2 < var15Lifetime2Lifetime1) {
                var16Lifetime1Lifetime1 = (int)((long)field_t[var14Lifetime2 + var12Lifetime3] * (long)bc.field_a >> 16);
                for (var17Lifetime1 = 0; var17Lifetime1 < var12Lifetime3; var17Lifetime1++) {
                  var16Lifetime1Lifetime1 = var16Lifetime1Lifetime1 + (int)((long)field_t[var14Lifetime2 + var12Lifetime3 - 1 - var17Lifetime1] * (long)bc.field_e[0][var17Lifetime1] >> 16);
                }
                for (var17Lifetime1Lifetime1 = 0; var17Lifetime1Lifetime1 < var13Lifetime2; var17Lifetime1Lifetime1++) {
                  var16Lifetime1Lifetime1 = var16Lifetime1Lifetime1 - (int)((long)field_t[var14Lifetime2 - 1 - var17Lifetime1Lifetime1] * (long)bc.field_e[1][var17Lifetime1Lifetime1] >> 16);
                }
                field_t[var14Lifetime2] = var16Lifetime1Lifetime1;
                var11Lifetime4 = this.field_c.a(param0 + 1);
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
                var16Lifetime1Lifetime2 = var16Lifetime1Lifetime2 + (int)((long)field_t[var14Lifetime2 + var12Lifetime3 - 1 - var17Lifetime2] * (long)bc.field_e[0][var17Lifetime2] >> 16);
              }
              for (var17Lifetime2Lifetime1 = 0; var17Lifetime2Lifetime1 < var13Lifetime2; var17Lifetime2Lifetime1++) {
                var16Lifetime1Lifetime2 = var16Lifetime1Lifetime2 - (int)((long)field_t[var14Lifetime2 - 1 - var17Lifetime2Lifetime1] * (long)bc.field_e[1][var17Lifetime2Lifetime1] >> 16);
              }
              field_t[var14Lifetime2] = var16Lifetime1Lifetime2;
              var11Lifetime4 = this.field_c.a(param0 + 1);
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

    sda() {
        this.field_b = 500;
        this.field_m = 0;
        this.field_l = new int[]{0, 0, 0, 0, 0};
        this.field_w = 100;
        this.field_s = 0;
        this.field_h = new int[]{0, 0, 0, 0, 0};
        this.field_q = new int[]{0, 0, 0, 0, 0};
    }

    static {
        int var1 = 0;
        int var1Lifetime1;
        field_p = new int[32768];
        Random var0 = new Random(0L);
        for (var1 = 0; var1 < 32768; var1++) {
          field_p[var1] = (var0.nextInt() & 2) - 1;
        }
        field_o = new int[32768];
        for (var1Lifetime1 = 0; var1Lifetime1 < 32768; var1Lifetime1++) {
          field_o[var1Lifetime1] = (int)(Math.sin((double)var1Lifetime1 / 5215.1903) * 16384.0);
        }
        field_t = new int[220500];
        field_f = new int[5];
        field_k = new int[5];
        field_v = new int[5];
        field_g = new int[5];
        field_j = new int[5];
    }
}
