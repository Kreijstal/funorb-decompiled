/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class p {
    int field_j;
    private kl field_e;
    private int field_p;
    private kl field_h;
    private mf field_n;
    private kl field_i;
    private int field_o;
    private static int[] field_a;
    private static int[] field_s;
    private int[] field_d;
    private int[] field_x;
    private kl field_g;
    int field_y;
    private static int[] field_u;
    private int[] field_q;
    private kl field_c;
    private kl field_m;
    private kl field_k;
    private kl field_b;
    private kl field_t;
    private static int[] field_f;
    private static int[] field_l;
    private static int[] field_w;
    private static int[] field_r;
    private static int[] field_v;

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
        ii.a(field_u, 0, param0);
        if (param1 < 10) {
          return field_u;
        }
        var3 = (double)param0 / ((double)param1 + 0.0);
        this.field_e.a();
        this.field_t.a();
        var5 = 0;
        var6 = 0;
        var7 = 0;
        if (this.field_k != null) {
          this.field_k.a();
          this.field_c.a();
          var5 = (int)((double)(this.field_k.field_j - this.field_k.field_c) * 32.768 / var3);
          var6 = (int)((double)this.field_k.field_c * 32.768 / var3);
        }
        var8 = 0;
        var9 = 0;
        var10 = 0;
        if (this.field_g != null) {
          this.field_g.a();
          this.field_h.a();
          var8 = (int)((double)(this.field_g.field_j - this.field_g.field_c) * 32.768 / var3);
          var9 = (int)((double)this.field_g.field_c * 32.768 / var3);
        }
        for (var11 = 0; var11 < 5; var11++) {
          if (this.field_d[var11] != 0) {
            field_w[var11] = 0;
            field_f[var11] = (int)((double)this.field_q[var11] * var3);
            field_r[var11] = (this.field_d[var11] << 14) / 100;
            field_l[var11] = (int)((double)(this.field_e.field_j - this.field_e.field_c) * 32.768 * Math.pow(1.0057929410678534, (double)this.field_x[var11]) / var3);
            field_v[var11] = (int)((double)this.field_e.field_c * 32.768 / var3);
          }
        }
        for (var11Lifetime1 = 0; var11Lifetime1 < param0; var11Lifetime1++) {
          var12 = this.field_e.a(param0);
          var13 = this.field_t.a(param0);
          if (this.field_k != null) {
            var14 = this.field_k.a(param0);
            var15 = this.field_c.a(param0);
            var12 = var12 + (this.a(var7, var15, this.field_k.field_i) >> 1);
            var7 = var7 + ((var14 * var5 >> 16) + var6);
          }
          if (this.field_g != null) {
            var14Lifetime3 = this.field_g.a(param0);
            var15Lifetime3 = this.field_h.a(param0);
            var13 = var13 * ((this.a(var10, var15Lifetime3, this.field_g.field_i) >> 1) + 32768) >> 15;
            var10 = var10 + ((var14Lifetime3 * var8 >> 16) + var9);
          }
          for (var14Lifetime4 = 0; var14Lifetime4 < 5; var14Lifetime4++) {
            if (this.field_d[var14Lifetime4] != 0) {
              var15Lifetime4 = var11Lifetime1 + field_f[var14Lifetime4];
              if (var15Lifetime4 < param0) {
                field_u[var15Lifetime4] = field_u[var15Lifetime4] + this.a(field_w[var14Lifetime4], var13 * field_r[var14Lifetime4] >> 15, this.field_e.field_i);
                field_w[var14Lifetime4] = field_w[var14Lifetime4] + ((var12 * field_l[var14Lifetime4] >> 16) + field_v[var14Lifetime4]);
              }
            }
          }
        }
        if (this.field_i != null) {
          this.field_i.a();
          this.field_b.a();
          var11Lifetime2 = 0;
          var12Lifetime1 = 0;
          var13Lifetime1 = 1;
          for (var14Lifetime1 = 0; var14Lifetime1 < param0; var14Lifetime1++) {
            var15Lifetime1 = this.field_i.a(param0);
            var16 = this.field_b.a(param0);
            if (var13Lifetime1 == 0) {
              var12Lifetime1Lifetime1 = this.field_i.field_c + ((this.field_i.field_j - this.field_i.field_c) * var16 >> 8);
            } else {
              var12Lifetime1Lifetime1 = this.field_i.field_c + ((this.field_i.field_j - this.field_i.field_c) * var15Lifetime1 >> 8);
            }
            var11Lifetime2 += 256;
            if (var11Lifetime2 >= var12Lifetime1Lifetime1) {
              var11Lifetime2 = 0;
              stackIn_41_0 = (var13Lifetime1 != 0) ? 0 : 1;
              var13Lifetime1 = stackIn_41_0;
            }
            if (var13Lifetime1 != 0) {
              field_u[var14Lifetime1] = 0;
            }
          }
        }
        if (this.field_o > 0 &&
          this.field_p > 0) {
          var11Lifetime3 = (int)((double)this.field_o * var3);
          for (var12Lifetime2 = var11Lifetime3; var12Lifetime2 < param0; var12Lifetime2++) {
            field_u[var12Lifetime2] = field_u[var12Lifetime2] + field_u[var12Lifetime2 - var11Lifetime3] * this.field_p / 100;
          }
        }
        if (!(this.field_n.field_a[0] <= 0) ||
          !(this.field_n.field_a[1] <= 0)) {
          this.field_m.a();
          var11Lifetime4 = this.field_m.a(param0 + 1);
          var12Lifetime3 = this.field_n.a(0, (float)var11Lifetime4 / 65536.0f);
          var13Lifetime2 = this.field_n.a(1, (float)var11Lifetime4 / 65536.0f);
          if (param0 >= var12Lifetime3 + var13Lifetime2) {
            var14Lifetime2 = 0;
            var15Lifetime2 = var13Lifetime2;
            if (var15Lifetime2 > param0 - var12Lifetime3) {
              var15Lifetime2 = param0 - var12Lifetime3;
            }
            while (var14Lifetime2 < var15Lifetime2) {
              var16Lifetime1 = (int)((long)field_u[var14Lifetime2 + var12Lifetime3] * (long)mf.field_d >> 16);
              for (var17 = 0; var17 < var12Lifetime3; var17++) {
                var16Lifetime1 = var16Lifetime1 + (int)((long)field_u[var14Lifetime2 + var12Lifetime3 - 1 - var17] * (long)mf.field_f[0][var17] >> 16);
              }
              for (var17Lifetime3 = 0; var17Lifetime3 < var14Lifetime2; var17Lifetime3++) {
                var16Lifetime1 = var16Lifetime1 - (int)((long)field_u[var14Lifetime2 - 1 - var17Lifetime3] * (long)mf.field_f[1][var17Lifetime3] >> 16);
              }
              field_u[var14Lifetime2] = var16Lifetime1;
              var11Lifetime4 = this.field_m.a(param0 + 1);
              var14Lifetime2++;
            }
            var15Lifetime2Lifetime1 = 128;
            while (true) {
              if (var15Lifetime2Lifetime1 > param0 - var12Lifetime3) {
                var15Lifetime2Lifetime1 = param0 - var12Lifetime3;
              }
              while (var14Lifetime2 < var15Lifetime2Lifetime1) {
                var16Lifetime1Lifetime1 = (int)((long)field_u[var14Lifetime2 + var12Lifetime3] * (long)mf.field_d >> 16);
                for (var17Lifetime1 = 0; var17Lifetime1 < var12Lifetime3; var17Lifetime1++) {
                  var16Lifetime1Lifetime1 = var16Lifetime1Lifetime1 + (int)((long)field_u[var14Lifetime2 + var12Lifetime3 - 1 - var17Lifetime1] * (long)mf.field_f[0][var17Lifetime1] >> 16);
                }
                for (var17Lifetime1Lifetime1 = 0; var17Lifetime1Lifetime1 < var13Lifetime2; var17Lifetime1Lifetime1++) {
                  var16Lifetime1Lifetime1 = var16Lifetime1Lifetime1 - (int)((long)field_u[var14Lifetime2 - 1 - var17Lifetime1Lifetime1] * (long)mf.field_f[1][var17Lifetime1Lifetime1] >> 16);
                }
                field_u[var14Lifetime2] = var16Lifetime1Lifetime1;
                var11Lifetime4 = this.field_m.a(param0 + 1);
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
                var16Lifetime1Lifetime2 = var16Lifetime1Lifetime2 + (int)((long)field_u[var14Lifetime2 + var12Lifetime3 - 1 - var17Lifetime2] * (long)mf.field_f[0][var17Lifetime2] >> 16);
              }
              for (var17Lifetime2Lifetime1 = 0; var17Lifetime2Lifetime1 < var13Lifetime2; var17Lifetime2Lifetime1++) {
                var16Lifetime1Lifetime2 = var16Lifetime1Lifetime2 - (int)((long)field_u[var14Lifetime2 - 1 - var17Lifetime2Lifetime1] * (long)mf.field_f[1][var17Lifetime2Lifetime1] >> 16);
              }
              field_u[var14Lifetime2] = var16Lifetime1Lifetime2;
              var11Lifetime4 = this.field_m.a(param0 + 1);
              var14Lifetime2++;
            }
          }
        }
        for (var11Lifetime5 = 0; var11Lifetime5 < param0; var11Lifetime5++) {
          if (field_u[var11Lifetime5] < -32768) {
            field_u[var11Lifetime5] = -32768;
          }
          if (field_u[var11Lifetime5] > 32767) {
            field_u[var11Lifetime5] = 32767;
          }
        }
        return field_u;
    }

    final void a(PacketBuffer param0) {
        int var3 = 0;
        int var4 = 0;
        this.field_e = new kl();
        this.field_e.b(param0);
        this.field_t = new kl();
        this.field_t.b(param0);
        int var2 = param0.readUnsignedByte((byte) -58);
        if (var2 != 0) {
          param0.position = param0.position - 1;
          this.field_k = new kl();
          this.field_k.b(param0);
          this.field_c = new kl();
          this.field_c.b(param0);
        }
        var2 = param0.readUnsignedByte((byte) -70);
        if (var2 != 0) {
          param0.position = param0.position - 1;
          this.field_g = new kl();
          this.field_g.b(param0);
          this.field_h = new kl();
          this.field_h.b(param0);
        }
        var2 = param0.readUnsignedByte((byte) -120);
        if (var2 != 0) {
          param0.position = param0.position - 1;
          this.field_i = new kl();
          this.field_i.b(param0);
          this.field_b = new kl();
          this.field_b.b(param0);
        }
        for (var3 = 0; var3 < 10; var3++) {
          var4 = param0.b(false);
          if (var4 == 0) {
            break;
          }
          this.field_d[var3] = var4;
          this.field_x[var3] = param0.f(69);
          this.field_q[var3] = param0.b(false);
        }
        this.field_o = param0.b(false);
        this.field_p = param0.b(false);
        this.field_y = param0.readUnsignedShort((byte) -60);
        this.field_j = param0.readUnsignedShort((byte) -60);
        this.field_n = new mf();
        this.field_m = new kl();
        this.field_n.a(param0, this.field_m);
    }

    public static void a() {
        field_u = null;
        field_s = null;
        field_a = null;
        field_w = null;
        field_f = null;
        field_r = null;
        field_l = null;
        field_v = null;
    }

    private final int a(int param0, int param1, int param2) {
        if (param2 == 1) {
          if ((param0 & 32767) < 16384) {
            return param1;
          }
          return -param1;
        }
        if (param2 == 2) {
          return field_a[param0 & 32767] * param1 >> 14;
        }
        if (param2 == 3) {
          return ((param0 & 32767) * param1 >> 14) - param1;
        }
        if (param2 == 4) {
          return field_s[param0 / 2607 & 32767] * param1;
        }
        return 0;
    }

    p() {
        this.field_j = 0;
        this.field_d = new int[]{0, 0, 0, 0, 0};
        this.field_p = 100;
        this.field_y = 500;
        this.field_o = 0;
        this.field_x = new int[]{0, 0, 0, 0, 0};
        this.field_q = new int[]{0, 0, 0, 0, 0};
    }

    static {
        int var1 = 0;
        int var1Lifetime1;
        field_s = new int[32768];
        Random var0 = new Random(0L);
        for (var1 = 0; var1 < 32768; var1++) {
          field_s[var1] = (var0.nextInt() & 2) - 1;
        }
        field_a = new int[32768];
        for (var1Lifetime1 = 0; var1Lifetime1 < 32768; var1Lifetime1++) {
          field_a[var1Lifetime1] = (int)(Math.sin((double)var1Lifetime1 / 5215.1903) * 16384.0);
        }
        field_u = new int[220500];
        field_w = new int[5];
        field_r = new int[5];
        field_f = new int[5];
        field_l = new int[5];
        field_v = new int[5];
    }
}
