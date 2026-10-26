/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class th {
    private static int[] field_f;
    int field_a;
    private wh field_j;
    private int field_x;
    private wh field_s;
    private ge field_p;
    private static int[] field_l;
    private wh field_e;
    private wh field_t;
    private int field_m;
    private wh field_y;
    private int[] field_w;
    private wh field_i;
    private int[] field_c;
    private int[] field_n;
    private static int[] field_v;
    private wh field_h;
    int field_r;
    private wh field_b;
    private static int[] field_o;
    private static int[] field_k;
    private static int[] field_q;
    private static int[] field_d;
    private static int[] field_g;
    private wh field_u;

    private final int a(int param0, int param1, int param2) {
        if (param2 == 1) {
          if ((param0 & 32767) < 16384) {
            return param1;
          }
          return -param1;
        }
        if (param2 == 2) {
          return field_l[param0 & 32767] * param1 >> 14;
        }
        if (param2 == 3) {
          return ((param0 & 32767) * param1 >> 14) - param1;
        }
        if (param2 == 4) {
          return field_v[param0 / 2607 & 32767] * param1;
        }
        return 0;
    }

    public static void a() {
        field_f = null;
        field_v = null;
        field_l = null;
        field_q = null;
        field_g = null;
        field_d = null;
        field_k = null;
        field_o = null;
    }

    final void a(PacketBuffer param0) {
        this.field_h = new wh();
        this.field_h.b(param0);
        this.field_s = new wh();
        this.field_s.b(param0);
        int var2 = param0.readUnsignedByte(-64);
        if (var2 != 0) {
          param0.position = param0.position - 1;
          this.field_u = new wh();
          this.field_u.b(param0);
          this.field_t = new wh();
          this.field_t.b(param0);
        }
        var2 = param0.readUnsignedByte(-57);
        if (var2 != 0) {
          param0.position = param0.position - 1;
          this.field_i = new wh();
          this.field_i.b(param0);
          this.field_y = new wh();
          this.field_y.b(param0);
        }
        var2 = param0.readUnsignedByte(-81);
        if (var2 != 0) {
          param0.position = param0.position - 1;
          this.field_b = new wh();
          this.field_b.b(param0);
          this.field_j = new wh();
          this.field_j.b(param0);
        }
        for (int var3 = 0; var3 < 10; var3++) {
          int var4 = param0.readUnsignedSmart(-129);
          if (var4 == 0) {
            break;
          }
          this.field_w[var3] = var4;
          this.field_n[var3] = param0.readSignedSmart((byte) 103);
          this.field_c[var3] = param0.readUnsignedSmart(-129);
        }
        this.field_m = param0.readUnsignedSmart(-129);
        this.field_x = param0.readUnsignedSmart(-129);
        this.field_r = param0.readUnsignedShort((byte) 0);
        this.field_a = param0.readUnsignedShort((byte) 0);
        this.field_p = new ge();
        this.field_e = new wh();
        this.field_p.a(param0, this.field_e);
    }

    final int[] a(int param0, int param1) {
        int var12Lifetime1Lifetime1;
        au.a(field_f, 0, param0);
        if (param1 < 10) {
          return field_f;
        }
        double var3 = (double)param0 / ((double)param1 + 0.0);
        this.field_h.a();
        this.field_s.a();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field_u != null) {
          this.field_u.a();
          this.field_t.a();
          var5 = (int)((double)(this.field_u.field_b - this.field_u.field_a) * 32.768 / var3);
          var6 = (int)((double)this.field_u.field_a * 32.768 / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field_i != null) {
          this.field_i.a();
          this.field_y.a();
          var8 = (int)((double)(this.field_i.field_b - this.field_i.field_a) * 32.768 / var3);
          var9 = (int)((double)this.field_i.field_a * 32.768 / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
          if (this.field_w[var11] != 0) {
            field_q[var11] = 0;
            field_g[var11] = (int)((double)this.field_c[var11] * var3);
            field_d[var11] = (this.field_w[var11] << 14) / 100;
            field_k[var11] = (int)((double)(this.field_h.field_b - this.field_h.field_a) * 32.768 * Math.pow(1.0057929410678534, (double)this.field_n[var11]) / var3);
            field_o[var11] = (int)((double)this.field_h.field_a * 32.768 / var3);
          }
        }
        for (int var11Lifetime1 = 0; var11Lifetime1 < param0; var11Lifetime1++) {
          int var12 = this.field_h.a(param0);
          int var13 = this.field_s.a(param0);
          if (this.field_u != null) {
            int var14 = this.field_u.a(param0);
            int var15 = this.field_t.a(param0);
            var12 = var12 + (this.a(var7, var15, this.field_u.field_c) >> 1);
            var7 = var7 + ((var14 * var5 >> 16) + var6);
          }
          if (this.field_i != null) {
            int var14Lifetime3 = this.field_i.a(param0);
            int var15Lifetime3 = this.field_y.a(param0);
            var13 = var13 * ((this.a(var10, var15Lifetime3, this.field_i.field_c) >> 1) + 32768) >> 15;
            var10 = var10 + ((var14Lifetime3 * var8 >> 16) + var9);
          }
          for (int var14Lifetime4 = 0; var14Lifetime4 < 5; var14Lifetime4++) {
            if (this.field_w[var14Lifetime4] != 0) {
              int var15Lifetime4 = var11Lifetime1 + field_g[var14Lifetime4];
              if (var15Lifetime4 < param0) {
                field_f[var15Lifetime4] = field_f[var15Lifetime4] + this.a(field_q[var14Lifetime4], var13 * field_d[var14Lifetime4] >> 15, this.field_h.field_c);
                field_q[var14Lifetime4] = field_q[var14Lifetime4] + ((var12 * field_k[var14Lifetime4] >> 16) + field_o[var14Lifetime4]);
              }
            }
          }
        }
        if (this.field_b != null) {
          this.field_b.a();
          this.field_j.a();
          int var11Lifetime2 = 0;
          int var12Lifetime1 = 0;
          boolean var13Lifetime1 = true;
          for (int var14Lifetime1 = 0; var14Lifetime1 < param0; var14Lifetime1++) {
            int var15Lifetime1 = this.field_b.a(param0);
            int var16 = this.field_j.a(param0);
            if (!var13Lifetime1) {
              var12Lifetime1Lifetime1 = this.field_b.field_a + ((this.field_b.field_b - this.field_b.field_a) * var16 >> 8);
            } else {
              var12Lifetime1Lifetime1 = this.field_b.field_a + ((this.field_b.field_b - this.field_b.field_a) * var15Lifetime1 >> 8);
            }
            var11Lifetime2 += 256;
            if (var11Lifetime2 >= var12Lifetime1Lifetime1) {
              var11Lifetime2 = 0;
              boolean stackIn_41_0 = !((var13Lifetime1));
              var13Lifetime1 = stackIn_41_0;
            }
            if (var13Lifetime1) {
              field_f[var14Lifetime1] = 0;
            }
          }
        }
        if (this.field_m > 0 &&
          this.field_x > 0) {
          int var11Lifetime3 = (int)((double)this.field_m * var3);
          for (int var12Lifetime2 = var11Lifetime3; var12Lifetime2 < param0; var12Lifetime2++) {
            field_f[var12Lifetime2] = field_f[var12Lifetime2] + field_f[var12Lifetime2 - var11Lifetime3] * this.field_x / 100;
          }
        }
        if (!(this.field_p.field_d[0] <= 0) ||
          !(this.field_p.field_d[1] <= 0)) {
          this.field_e.a();
          int var11Lifetime4 = this.field_e.a(param0 + 1);
          int var12Lifetime3 = this.field_p.a(0, (float)var11Lifetime4 / 65536.0f);
          int var13Lifetime2 = this.field_p.a(1, (float)var11Lifetime4 / 65536.0f);
          if (param0 >= var12Lifetime3 + var13Lifetime2) {
            int var14Lifetime2 = 0;
            int var15Lifetime2 = var13Lifetime2;
            if (var15Lifetime2 > param0 - var12Lifetime3) {
              var15Lifetime2 = param0 - var12Lifetime3;
            }
            while (var14Lifetime2 < var15Lifetime2) {
              int var16Lifetime1 = (int)((long)field_f[var14Lifetime2 + var12Lifetime3] * (long)ge.field_g >> 16);
              for (int var17 = 0; var17 < var12Lifetime3; var17++) {
                var16Lifetime1 = var16Lifetime1 + (int)((long)field_f[var14Lifetime2 + var12Lifetime3 - 1 - var17] * (long)ge.field_h[0][var17] >> 16);
              }
              for (int var17Lifetime3 = 0; var17Lifetime3 < var14Lifetime2; var17Lifetime3++) {
                var16Lifetime1 = var16Lifetime1 - (int)((long)field_f[var14Lifetime2 - 1 - var17Lifetime3] * (long)ge.field_h[1][var17Lifetime3] >> 16);
              }
              field_f[var14Lifetime2] = var16Lifetime1;
              var11Lifetime4 = this.field_e.a(param0 + 1);
              var14Lifetime2++;
            }
            int var15Lifetime2Lifetime1 = 128;
            while (true) {
              if (var15Lifetime2Lifetime1 > param0 - var12Lifetime3) {
                var15Lifetime2Lifetime1 = param0 - var12Lifetime3;
              }
              while (var14Lifetime2 < var15Lifetime2Lifetime1) {
                int var16Lifetime1Lifetime1 = (int)((long)field_f[var14Lifetime2 + var12Lifetime3] * (long)ge.field_g >> 16);
                for (int var17Lifetime1 = 0; var17Lifetime1 < var12Lifetime3; var17Lifetime1++) {
                  var16Lifetime1Lifetime1 = var16Lifetime1Lifetime1 + (int)((long)field_f[var14Lifetime2 + var12Lifetime3 - 1 - var17Lifetime1] * (long)ge.field_h[0][var17Lifetime1] >> 16);
                }
                for (int var17Lifetime1Lifetime1 = 0; var17Lifetime1Lifetime1 < var13Lifetime2; var17Lifetime1Lifetime1++) {
                  var16Lifetime1Lifetime1 = var16Lifetime1Lifetime1 - (int)((long)field_f[var14Lifetime2 - 1 - var17Lifetime1Lifetime1] * (long)ge.field_h[1][var17Lifetime1Lifetime1] >> 16);
                }
                field_f[var14Lifetime2] = var16Lifetime1Lifetime1;
                var11Lifetime4 = this.field_e.a(param0 + 1);
                var14Lifetime2++;
              }
              if (var14Lifetime2 < param0 - var12Lifetime3) {
                var12Lifetime3 = this.field_p.a(0, (float)var11Lifetime4 / 65536.0f);
                var13Lifetime2 = this.field_p.a(1, (float)var11Lifetime4 / 65536.0f);
                var15Lifetime2Lifetime1 += 128;
                continue;
              }
              break;
            }
            while (var14Lifetime2 < param0) {
              int var16Lifetime1Lifetime2 = 0;
              for (int var17Lifetime2 = var14Lifetime2 + var12Lifetime3 - param0; var17Lifetime2 < var12Lifetime3; var17Lifetime2++) {
                var16Lifetime1Lifetime2 = var16Lifetime1Lifetime2 + (int)((long)field_f[var14Lifetime2 + var12Lifetime3 - 1 - var17Lifetime2] * (long)ge.field_h[0][var17Lifetime2] >> 16);
              }
              for (int var17Lifetime2Lifetime1 = 0; var17Lifetime2Lifetime1 < var13Lifetime2; var17Lifetime2Lifetime1++) {
                var16Lifetime1Lifetime2 = var16Lifetime1Lifetime2 - (int)((long)field_f[var14Lifetime2 - 1 - var17Lifetime2Lifetime1] * (long)ge.field_h[1][var17Lifetime2Lifetime1] >> 16);
              }
              field_f[var14Lifetime2] = var16Lifetime1Lifetime2;
              var11Lifetime4 = this.field_e.a(param0 + 1);
              var14Lifetime2++;
            }
          }
        }
        for (int var11Lifetime5 = 0; var11Lifetime5 < param0; var11Lifetime5++) {
          if (field_f[var11Lifetime5] < -32768) {
            field_f[var11Lifetime5] = -32768;
          }
          if (field_f[var11Lifetime5] > 32767) {
            field_f[var11Lifetime5] = 32767;
          }
        }
        return field_f;
    }

    th() {
        this.field_x = 100;
        this.field_a = 0;
        this.field_c = new int[]{0, 0, 0, 0, 0};
        this.field_w = new int[]{0, 0, 0, 0, 0};
        this.field_m = 0;
        this.field_n = new int[]{0, 0, 0, 0, 0};
        this.field_r = 500;
    }

    static {
        field_v = new int[32768];
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
          field_v[var1] = (var0.nextInt() & 2) - 1;
        }
        field_l = new int[32768];
        for (int var1Lifetime1 = 0; var1Lifetime1 < 32768; var1Lifetime1++) {
          field_l[var1Lifetime1] = (int)(Math.sin((double)var1Lifetime1 / 5215.1903) * 16384.0);
        }
        field_f = new int[220500];
        field_d = new int[5];
        field_g = new int[5];
        field_o = new int[5];
        field_k = new int[5];
        field_q = new int[5];
    }
}
