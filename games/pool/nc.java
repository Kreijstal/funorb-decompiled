/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nc extends fa {
    private byte[] field_bb;
    private int[] field_y;
    private boolean field_U;
    int[] field_T;
    int field_P;
    private short field_O;
    int[] field_t;
    private int[] field_i;
    int[] field_R;
    private byte[] field_h;
    private int field_u;
    int[] field_Q;
    int[] field_D;
    private short[] field_Z;
    private byte[] field_M;
    private int[] field_W;
    private short field_w;
    private short field_G;
    private short field_V;
    private int field_s;
    private int[] field_n;
    int[] field_j;
    private int[] field_ab;
    private short field_B;
    private int field_eb;
    private static int[] field_db;
    int[] field_J;
    private static int[] field_x;
    private short field_r;
    private static boolean[] field_I;
    private static int[] field_m;
    private short field_N;
    private static int[][] field_E;
    private static int[] field_p;
    static int[] field_Y;
    private static int[] field_g;
    private static int[] field_A;
    private static int[] field_v;
    private static int[] field_F;
    private static int[] field_X;
    private static int field_S;
    private static int[] field_L;
    private static int[][] field_l;
    private static int[] field_K;
    private static int[] field_cb;
    private static int[] field_z;
    private static int[] field_C;
    private static int[][] field_o;
    private static int[] field_f;
    private static int[] field_H;
    private static boolean[] field_q;
    private static boolean field_k;

    final int b() {
        if (!this.field_U) {
          this.c();
        }
        return this.field_N;
    }

    private final static int b(int param0, int param1) {
        param1 = param1 * (param0 & 127) >> 7;
        if (param1 < 2) {
          param1 = 2;
        } else {
          if (param1 > 126) {
            param1 = 126;
          }
        }
        return (param0 & 65408) + param1;
    }

    public static void e() {
        field_q = null;
        field_I = null;
        field_X = null;
        field_v = null;
        field_x = null;
        field_L = null;
        field_db = null;
        field_f = null;
        field_Y = null;
        field_o = (int[][]) null;
        field_g = null;
        field_E = (int[][]) null;
        field_C = null;
        field_m = null;
        field_A = null;
        field_l = (int[][]) null;
        field_K = null;
        field_z = null;
        field_F = null;
        field_H = null;
        field_cb = null;
        field_p = null;
    }

    final int i() {
        if (!this.field_U) {
          this.c();
        }
        return this.field_r;
    }

    final void b(int[] param0, int[] param1) {
        int stackIn_15_0 = 0;
        int stackIn_21_0 = 0;
        Throwable decompiledCaughtException = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21_int = 0;
        Exception var21 = null;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var15Lifetime1;
        int var15Lifetime2;
        int var17Lifetime1;
        int var17Lifetime2;
        int var18Lifetime1;
        int var19Lifetime1;
        int var21_intLifetime1;
        int var22Lifetime1;
        int var23Lifetime1;
        int var22Lifetime1Lifetime1;
        int var23Lifetime1Lifetime1;
        if (!this.field_U) {
          this.c();
        }
        var15 = param0[3] >> 2;
        var16 = param0[4] >> 2;
        var17 = param0[5] >> 2;
        var18 = param0[6] >> 2;
        var19 = param0[7] >> 2;
        var20 = param0[8] >> 2;
        var21_int = param0[9] >> 2;
        var22 = param0[10] >> 2;
        var23 = param0[11] >> 2;
        var6 = var15 * param1[3] + var16 * param1[4] + var17 * param1[5] >> 14;
        var7 = var18 * param1[3] + var19 * param1[4] + var20 * param1[5] >> 14;
        var8 = var21_int * param1[3] + var22 * param1[4] + var23 * param1[5] >> 14;
        var9 = var15 * param1[6] + var16 * param1[7] + var17 * param1[8] >> 14;
        var10 = var18 * param1[6] + var19 * param1[7] + var20 * param1[8] >> 14;
        var11 = var21_int * param1[6] + var22 * param1[7] + var23 * param1[8] >> 14;
        var12 = var15 * param1[9] + var16 * param1[10] + var17 * param1[11] >> 14;
        var13 = var18 * param1[9] + var19 * param1[10] + var20 * param1[11] >> 14;
        var14 = var21_int * param1[9] + var22 * param1[10] + var23 * param1[11] >> 14;
        var15Lifetime1 = param1[0] - param0[0];
        var16 = param1[1] - param0[1];
        var17Lifetime1 = param1[2] - param0[2];
        var3 = var15Lifetime1 * param0[3] + var16 * param0[4] + var17Lifetime1 * param0[5] >> 16;
        var4 = var15Lifetime1 * param0[6] + var16 * param0[7] + var17Lifetime1 * param0[8] >> 16;
        var5 = var15Lifetime1 * param0[9] + var16 * param0[10] + var17Lifetime1 * param0[11] >> 16;
        if (var5 < 50 - this.field_w) {
          return;
        }
        var15Lifetime2 = this.field_w * 92682 >> 16;
        if (var3 < -var5 - var15Lifetime2) {
          return;
        }
        if (var3 > var5 + var15Lifetime2) {
          return;
        }
        if (var4 < -var5 - var15Lifetime2) {
          return;
        }
        if (var4 > var5 + var15Lifetime2) {
          return;
        }
        stackIn_15_0 = (var5 > 50 + this.field_w) ? 0 : 1;
        var16 = stackIn_15_0;
        if (var16 == 0) {
          stackIn_21_0 = (this.field_eb > 0) ? 1 : 0;
        } else {
          stackIn_21_0 = 1;
        }
        var17Lifetime2 = stackIn_21_0;
        var18Lifetime1 = fb.field_q;
        var19Lifetime1 = fb.field_d;
        var20 = 0;
        var27 = 0;
        var21_intLifetime1 = var27;
        while (var27 < this.field_s) {
          var22Lifetime1 = this.field_t[var27];
          var23Lifetime1 = this.field_Q[var27];
          var24 = this.field_D[var27];
          var25 = var22Lifetime1 * var6 + var23Lifetime1 * var9 + var24 * var12 >> 16;
          var26 = var22Lifetime1 * var7 + var23Lifetime1 * var10 + var24 * var13 >> 16;
          var24 = var22Lifetime1 * var8 + var23Lifetime1 * var11 + var24 * var14 >> 16;
          var22Lifetime1Lifetime1 = var25;
          var23Lifetime1Lifetime1 = var26;
          field_x[var27] = var24;
          var22Lifetime1Lifetime1 = var22Lifetime1Lifetime1 + var3;
          var23Lifetime1Lifetime1 = var23Lifetime1Lifetime1 + var4;
          var24 = var24 + var5;
          if (var24 < 50) {
            field_X[var27] = -5000;
            var20 = 1;
          } else {
            field_X[var27] = var18Lifetime1 + (var22Lifetime1Lifetime1 << 9) / var24;
            field_v[var27] = var19Lifetime1 + (var23Lifetime1Lifetime1 << 9) / var24;
          }
          if (var17Lifetime2 != 0) {
            field_L[var27] = var22Lifetime1Lifetime1;
            field_db[var27] = var23Lifetime1Lifetime1;
            field_f[var27] = var24;
          }
          var27++;
        }
        try {
          this.a((var20 & var16) != 0, false, 0L, (int) this.field_w, this.field_w << 1);
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var21 = (Exception) (Object) decompiledCaughtException;
        }
        return;
    }

    private final void c() {
        int var9 = 0;
        int var1;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var10;
        int var11;
        int var12;
        int var13;
        var1 = 32767;
        var2 = 32767;
        var3 = 32767;
        var4 = -32768;
        var5 = -32768;
        var6 = -32768;
        var7 = 0;
        var8 = 0;
        for (var9 = 0; var9 < this.field_u; var9++) {
          var10 = this.field_t[var9];
          var11 = this.field_Q[var9];
          var12 = this.field_D[var9];
          if (var10 < var1) {
            var1 = var10;
          }
          if (var10 > var4) {
            var4 = var10;
          }
          if (var11 < var2) {
            var2 = var11;
          }
          if (var11 > var5) {
            var5 = var11;
          }
          if (var12 < var3) {
            var3 = var12;
          }
          if (var12 > var6) {
            var6 = var12;
          }
          var13 = var10 * var10 + var12 * var12;
          if (var13 > var7) {
            var7 = var13;
          }
          var13 = var13 + var11 * var11;
          if (var13 > var8) {
            var8 = var13;
          }
        }
        this.field_N = (short)var1;
        this.field_V = (short)var4;
        this.field_B = (short)var2;
        this.field_G = (short)var5;
        this.field_O = (short)var3;
        this.field_r = (short)var6;
        Math.sqrt((double)var7);
        this.field_w = (short)(int)(Math.sqrt((double)var8) + 0.99);
        this.field_U = true;
    }

    private final void c(int param0) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int var2;
        int var3;
        int var4;
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
        int var18;
        int var19;
        int var20;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        int var13Lifetime1;
        int var13Lifetime2;
        int var13Lifetime3;
        int var14Lifetime1;
        int var14Lifetime2;
        int var14Lifetime3;
        int var17Lifetime1;
        int var18Lifetime1;
        int var19Lifetime1;
        int var20Lifetime1;
        int var14Lifetime4;
        int var14Lifetime1Lifetime1;
        int var14Lifetime2Lifetime1;
        int var20Lifetime1Lifetime1;
        var2 = fb.field_q;
        var3 = fb.field_d;
        var4 = 0;
        var5 = this.field_j[param0];
        var6 = this.field_T[param0];
        var7 = this.field_R[param0];
        var8 = field_f[var5];
        var9 = field_f[var6];
        var10 = field_f[var7];
        if (this.field_bb != null) {
          fb.field_c = this.field_bb[param0] & 255;
        } else {
          fb.field_c = 0;
        }
        if (var8 < 50) {
          var11 = field_L[var5];
          var12 = field_db[var5];
          var13 = this.field_W[param0] & 65535;
          if (var10 >= 50) {
            var14 = (50 - var8) * fb.field_f[var10 - var8];
            field_H[var4] = var2 + (var11 + ((field_L[var7] - var11) * var14 >> 16) << 9) / 50;
            field_cb[var4] = var3 + (var12 + ((field_db[var7] - var12) * var14 >> 16) << 9) / 50;
            incrementValue$0 = var4;
            var4++;
            field_p[incrementValue$0] = var13 + (((this.field_J[param0] & 65535) - var13) * var14 >> 16);
          }
          if (var9 >= 50) {
            var14Lifetime4 = (50 - var8) * fb.field_f[var9 - var8];
            field_H[var4] = var2 + (var11 + ((field_L[var6] - var11) * var14Lifetime4 >> 16) << 9) / 50;
            field_cb[var4] = var3 + (var12 + ((field_db[var6] - var12) * var14Lifetime4 >> 16) << 9) / 50;
            incrementValue$1 = var4;
            var4++;
            field_p[incrementValue$1] = var13 + (((this.field_y[param0] & 65535) - var13) * var14Lifetime4 >> 16);
          }
        } else {
          field_H[var4] = field_X[var5];
          field_cb[var4] = field_v[var5];
          incrementValue$2 = var4;
          var4++;
          field_p[incrementValue$2] = this.field_W[param0] & 65535;
        }
        if (var9 < 50) {
          var11Lifetime1 = field_L[var6];
          var12Lifetime1 = field_db[var6];
          var13Lifetime1 = this.field_y[param0] & 65535;
          if (var8 >= 50) {
            var14Lifetime1 = (50 - var9) * fb.field_f[var8 - var9];
            field_H[var4] = var2 + (var11Lifetime1 + ((field_L[var5] - var11Lifetime1) * var14Lifetime1 >> 16) << 9) / 50;
            field_cb[var4] = var3 + (var12Lifetime1 + ((field_db[var5] - var12Lifetime1) * var14Lifetime1 >> 16) << 9) / 50;
            incrementValue$3 = var4;
            var4++;
            field_p[incrementValue$3] = var13Lifetime1 + (((this.field_W[param0] & 65535) - var13Lifetime1) * var14Lifetime1 >> 16);
          }
          if (var10 >= 50) {
            var14Lifetime1Lifetime1 = (50 - var9) * fb.field_f[var10 - var9];
            field_H[var4] = var2 + (var11Lifetime1 + ((field_L[var7] - var11Lifetime1) * var14Lifetime1Lifetime1 >> 16) << 9) / 50;
            field_cb[var4] = var3 + (var12Lifetime1 + ((field_db[var7] - var12Lifetime1) * var14Lifetime1Lifetime1 >> 16) << 9) / 50;
            incrementValue$4 = var4;
            var4++;
            field_p[incrementValue$4] = var13Lifetime1 + (((this.field_J[param0] & 65535) - var13Lifetime1) * var14Lifetime1Lifetime1 >> 16);
          }
        } else {
          field_H[var4] = field_X[var6];
          field_cb[var4] = field_v[var6];
          incrementValue$5 = var4;
          var4++;
          field_p[incrementValue$5] = this.field_y[param0] & 65535;
        }
        if (var10 < 50) {
          var11Lifetime2 = field_L[var7];
          var12Lifetime2 = field_db[var7];
          var13Lifetime2 = this.field_J[param0] & 65535;
          if (var9 >= 50) {
            var14Lifetime2 = (50 - var10) * fb.field_f[var9 - var10];
            field_H[var4] = var2 + (var11Lifetime2 + ((field_L[var6] - var11Lifetime2) * var14Lifetime2 >> 16) << 9) / 50;
            field_cb[var4] = var3 + (var12Lifetime2 + ((field_db[var6] - var12Lifetime2) * var14Lifetime2 >> 16) << 9) / 50;
            incrementValue$6 = var4;
            var4++;
            field_p[incrementValue$6] = var13Lifetime2 + (((this.field_y[param0] & 65535) - var13Lifetime2) * var14Lifetime2 >> 16);
          }
          if (var8 >= 50) {
            var14Lifetime2Lifetime1 = (50 - var10) * fb.field_f[var8 - var10];
            field_H[var4] = var2 + (var11Lifetime2 + ((field_L[var5] - var11Lifetime2) * var14Lifetime2Lifetime1 >> 16) << 9) / 50;
            field_cb[var4] = var3 + (var12Lifetime2 + ((field_db[var5] - var12Lifetime2) * var14Lifetime2Lifetime1 >> 16) << 9) / 50;
            incrementValue$7 = var4;
            var4++;
            field_p[incrementValue$7] = var13Lifetime2 + (((this.field_W[param0] & 65535) - var13Lifetime2) * var14Lifetime2Lifetime1 >> 16);
          }
        } else {
          field_H[var4] = field_X[var7];
          field_cb[var4] = field_v[var7];
          incrementValue$8 = var4;
          var4++;
          field_p[incrementValue$8] = this.field_J[param0] & 65535;
        }
        boolean decompiledFrameRemainder0 = true;
        var11Lifetime3 = field_H[0];
        var12Lifetime3 = field_H[1];
        var13Lifetime3 = field_H[2];
        var14Lifetime3 = field_cb[0];
        var15 = field_cb[1];
        var16 = field_cb[2];
        fb.field_n = false;
        if (var4 == 3) {
          if (var11Lifetime3 < 0 ||
            var12Lifetime3 < 0 ||
            var13Lifetime3 < 0 ||
            !(var11Lifetime3 <= fb.field_k) ||
            !(var12Lifetime3 <= fb.field_k) ||
            !(var13Lifetime3 <= fb.field_k)) {
            fb.field_n = true;
          }
          if (this.field_Z != null &&
            this.field_Z[param0] != -1) {
            if (this.field_h != null &&
              this.field_h[param0] != -1) {
              var20 = this.field_h[param0] & 255;
              var17 = this.field_ab[var20];
              var18 = this.field_n[var20];
              var19 = this.field_i[var20];
            } else {
              var17 = var5;
              var18 = var6;
              var19 = var7;
            }
            if (this.field_J[param0] != -1) {
              fb.a(var14Lifetime3, var15, var16, var11Lifetime3, var12Lifetime3, var13Lifetime3, field_p[0], field_p[1], field_p[2], field_L[var17], field_L[var18], field_L[var19], field_db[var17], field_db[var18], field_db[var19], field_f[var17], field_f[var18], field_f[var19], (int) this.field_Z[param0]);
            } else {
              fb.a(var14Lifetime3, var15, var16, var11Lifetime3, var12Lifetime3, var13Lifetime3, this.field_W[param0], this.field_W[param0], this.field_W[param0], field_L[var17], field_L[var18], field_L[var19], field_db[var17], field_db[var18], field_db[var19], field_f[var17], field_f[var18], field_f[var19], (int) this.field_Z[param0]);
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (this.field_J[param0] != -1) {
              fb.a(var14Lifetime3, var15, var16, var11Lifetime3, var12Lifetime3, var13Lifetime3, field_p[0], field_p[1], field_p[2]);
            } else {
              fb.a(var14Lifetime3, var15, var16, var11Lifetime3, var12Lifetime3, var13Lifetime3, fb.field_b[this.field_W[param0] & 65535]);
            }
          }
        }
        if (var4 != 4) {
          return;
        }
        if (var11Lifetime3 < 0 ||
          var12Lifetime3 < 0 ||
          var13Lifetime3 < 0 ||
          !(var11Lifetime3 <= fb.field_k) ||
          !(var12Lifetime3 <= fb.field_k) ||
          !(var13Lifetime3 <= fb.field_k) ||
          !(field_H[3] >= 0) ||
          !(field_H[3] <= fb.field_k)) {
          fb.field_n = true;
        }
        if (this.field_Z != null &&
          this.field_Z[param0] != -1) {
          if (this.field_h != null &&
            this.field_h[param0] != -1) {
            var20Lifetime1 = this.field_h[param0] & 255;
            var17Lifetime1 = this.field_ab[var20Lifetime1];
            var18Lifetime1 = this.field_n[var20Lifetime1];
            var19Lifetime1 = this.field_i[var20Lifetime1];
          } else {
            var17Lifetime1 = var5;
            var18Lifetime1 = var6;
            var19Lifetime1 = var7;
          }
          var20Lifetime1Lifetime1 = this.field_Z[param0];
          if (this.field_J[param0] != -1) {
            fb.a(var14Lifetime3, var15, var16, var11Lifetime3, var12Lifetime3, var13Lifetime3, field_p[0], field_p[1], field_p[2], field_L[var17Lifetime1], field_L[var18Lifetime1], field_L[var19Lifetime1], field_db[var17Lifetime1], field_db[var18Lifetime1], field_db[var19Lifetime1], field_f[var17Lifetime1], field_f[var18Lifetime1], field_f[var19Lifetime1], var20Lifetime1Lifetime1);
            fb.a(var14Lifetime3, var16, field_cb[3], var11Lifetime3, var13Lifetime3, field_H[3], field_p[0], field_p[2], field_p[3], field_L[var17Lifetime1], field_L[var18Lifetime1], field_L[var19Lifetime1], field_db[var17Lifetime1], field_db[var18Lifetime1], field_db[var19Lifetime1], field_f[var17Lifetime1], field_f[var18Lifetime1], field_f[var19Lifetime1], var20Lifetime1Lifetime1);
          } else {
            fb.a(var14Lifetime3, var15, var16, var11Lifetime3, var12Lifetime3, var13Lifetime3, this.field_W[param0], this.field_W[param0], this.field_W[param0], field_L[var17Lifetime1], field_L[var18Lifetime1], field_L[var19Lifetime1], field_db[var17Lifetime1], field_db[var18Lifetime1], field_db[var19Lifetime1], field_f[var17Lifetime1], field_f[var18Lifetime1], field_f[var19Lifetime1], var20Lifetime1Lifetime1);
            fb.a(var14Lifetime3, var16, field_cb[3], var11Lifetime3, var13Lifetime3, field_H[3], this.field_W[param0], this.field_W[param0], this.field_W[param0], field_L[var17Lifetime1], field_L[var18Lifetime1], field_L[var19Lifetime1], field_db[var17Lifetime1], field_db[var18Lifetime1], field_db[var19Lifetime1], field_f[var17Lifetime1], field_f[var18Lifetime1], field_f[var19Lifetime1], var20Lifetime1Lifetime1);
          }
        } else {
          if (this.field_J[param0] != -1) {
            fb.a(var14Lifetime3, var15, var16, var11Lifetime3, var12Lifetime3, var13Lifetime3, field_p[0], field_p[1], field_p[2]);
            fb.a(var14Lifetime3, var16, field_cb[3], var11Lifetime3, var13Lifetime3, field_H[3], field_p[0], field_p[2], field_p[3]);
          } else {
            var17Lifetime1 = fb.field_b[this.field_W[param0] & 65535];
            fb.a(var14Lifetime3, var15, var16, var11Lifetime3, var12Lifetime3, var13Lifetime3, var17Lifetime1);
            fb.a(var14Lifetime3, var16, field_cb[3], var11Lifetime3, var13Lifetime3, field_H[3], var17Lifetime1);
          }
        }
    }

    final int a() {
        if (!this.field_U) {
          this.c();
        }
        return this.field_w;
    }

    final void a(int[] param0, int[] param1) {
        int var33_int = 0;
        int stackIn_15_0 = 0;
        int stackIn_21_0 = 0;
        Throwable decompiledCaughtException = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        Exception var33 = null;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var34Lifetime1;
        int var34Lifetime2;
        int var35Lifetime1;
        int var35Lifetime2;
        int var37Lifetime1;
        int var38Lifetime1;
        if (!this.field_U) {
          this.c();
        }
        var3 = param1[0] - param0[0];
        var4 = param1[1] - param0[1];
        var5 = param1[2] - param0[2];
        var6 = param0[3];
        var7 = param0[4];
        var8 = param0[5];
        var9 = param0[6];
        var10 = param0[7];
        var11 = param0[8];
        var12 = param0[9];
        var13 = param0[10];
        var14 = param0[11];
        var15 = param1[3];
        var16 = param1[4];
        var17 = param1[5];
        var18 = param1[6];
        var19 = param1[7];
        var20 = param1[8];
        var21 = param1[9];
        var22 = param1[10];
        var23 = param1[11];
        var24 = var3 * var6 + var4 * var7 + var5 * var8 >> 16;
        var25 = var3 * var9 + var4 * var10 + var5 * var11 >> 16;
        var26 = var3 * var12 + var4 * var13 + var5 * var14 >> 16;
        if (var26 < 50 - this.field_w) {
          return;
        }
        var27 = this.field_w * 92682 >> 16;
        if (var24 < -var26 - var27) {
          return;
        }
        if (var24 > var26 + var27) {
          return;
        }
        if (var25 < -var26 - var27) {
          return;
        }
        if (var25 > var26 + var27) {
          return;
        }
        stackIn_15_0 = (var26 > 50 + this.field_w) ? 0 : 1;
        var28 = stackIn_15_0;
        if (var28 == 0) {
          stackIn_21_0 = (this.field_eb > 0) ? 1 : 0;
        } else {
          stackIn_21_0 = 1;
        }
        var29 = stackIn_21_0;
        var30 = fb.field_q;
        var31 = fb.field_d;
        var32 = 0;
        for (var33_int = 0; var33_int < this.field_s; var33_int++) {
          var34 = this.field_t[var33_int];
          var35 = this.field_Q[var33_int];
          var36 = this.field_D[var33_int];
          var37 = var34 * var15 + var35 * var18 + var36 * var21 >> 16;
          var38 = var34 * var16 + var35 * var19 + var36 * var22 >> 16;
          var36 = var34 * var17 + var35 * var20 + var36 * var23 >> 16;
          var34Lifetime1 = var37;
          var35Lifetime1 = var38;
          var34Lifetime1 = var34Lifetime1 + var3;
          var35Lifetime1 = var35Lifetime1 + var4;
          var36 = var36 + var5;
          var37Lifetime1 = var34Lifetime1 * var6 + var35Lifetime1 * var7 + var36 * var8 >> 16;
          var38Lifetime1 = var34Lifetime1 * var9 + var35Lifetime1 * var10 + var36 * var11 >> 16;
          var36 = var34Lifetime1 * var12 + var35Lifetime1 * var13 + var36 * var14 >> 16;
          var34Lifetime2 = var37Lifetime1;
          var35Lifetime2 = var38Lifetime1;
          field_x[var33_int] = var36 - var26;
          if (var36 < 50) {
            field_X[var33_int] = -5000;
            var32 = 1;
          } else {
            field_X[var33_int] = var30 + (var34Lifetime2 << 9) / var36;
            field_v[var33_int] = var31 + (var35Lifetime2 << 9) / var36;
          }
          if (var29 != 0) {
            field_L[var33_int] = var34Lifetime2;
            field_db[var33_int] = var35Lifetime2;
            field_f[var33_int] = var36;
          }
        }
        try {
          this.a((var32 & var28) != 0, false, 0L, (int) this.field_w, this.field_w << 1);
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var33 = (Exception) (Object) decompiledCaughtException;
        }
        return;
    }

    private final static int d(int param0) {
        if (param0 < 2) {
          param0 = 2;
        } else {
          if (param0 > 126) {
            param0 = 126;
          }
        }
        return param0;
    }

    final int f() {
        if (!this.field_U) {
          this.c();
        }
        return this.field_V;
    }

    final int h() {
        if (!this.field_U) {
          this.c();
        }
        return this.field_G;
    }

    private final boolean a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        if (param1 < param2 &&
          param1 < param3 &&
          param1 < param4) {
          return false;
        }
        if (param1 > param2 &&
          param1 > param3 &&
          param1 > param4) {
          return false;
        }
        if (param0 < param5 &&
          param0 < param6 &&
          param0 < param7) {
          return false;
        }
        if (param0 > param5 &&
          param0 > param6 &&
          param0 > param7) {
          return false;
        }
        return true;
    }

    final int g() {
        if (!this.field_U) {
          this.c();
        }
        return this.field_B;
    }

    final int d() {
        if (!this.field_U) {
          this.c();
        }
        return this.field_O;
    }

    private final void a(boolean param0, boolean param1, long param2, int param3, int param4) {
        int incrementValue$12 = 0;
        int dupTemp$10 = 0;
        int[] arrayValue$11 = null;
        int fieldTemp$7 = 0;
        int dupTemp$8 = 0;
        int[] arrayValue$9 = null;
        int fieldTemp$13 = 0;
        int fieldTemp$14 = 0;
        int dupTemp$15 = 0;
        int[] arrayValue$16 = null;
        int dupTemp$17 = 0;
        int[] arrayValue$18 = null;
        int incrementValue$19 = 0;
        int dupTemp$2 = 0;
        int dupTemp$0 = 0;
        int dupTemp$1 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$3 = 0;
        int stackIn_88_0 = 0;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14_int;
        int[] var14;
        int var15_int;
        int[] var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23;
        int var24;
        int var25;
        int var26;
        int var27;
        int var28;
        int var29;
        int[] var45;
        int[] var46;
        int[] var47;
        int[] var48;
        int[] var49;
        int var8Lifetime1;
        int var8Lifetime2;
        int var8Lifetime3;
        int var9Lifetime1;
        int var9Lifetime2;
        int var10Lifetime1;
        int var10Lifetime2;
        int var11Lifetime1;
        int var11Lifetime2;
        int var12Lifetime1;
        int var12Lifetime2;
        int var13Lifetime1;
        int var13Lifetime2;
        int var14_intLifetime1;
        int var15_intLifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        int var19Lifetime1;
        int var8Lifetime4;
        int var15_intLifetime2;
        int var16Lifetime2;
        int var13Lifetime1Lifetime1;
        int var14_intLifetime1Lifetime1;
        int var15_intLifetime1Lifetime1;
        if (param4 >= 1600) {
          return;
        }
        var7 = 0;
        if (!field_k) {
          for (var8 = 0; var8 < 1600; var8++) {
            field_Y[var8] = 0;
          }
          for (var8Lifetime4 = 0; var8Lifetime4 < 32; var8Lifetime4++) {
            field_g[var8Lifetime4] = 0;
          }
          field_S = 0;
        }
        for (var8Lifetime1 = 0; var8Lifetime1 < this.field_P; var8Lifetime1++) {
          L45: {
            if (this.field_J[var8Lifetime1] != -2) {
              var9 = this.field_j[var8Lifetime1];
              var10 = this.field_T[var8Lifetime1];
              var11 = this.field_R[var8Lifetime1];
              var12 = field_X[var9];
              var13 = field_X[var10];
              var14_int = field_X[var11];
              if (param0 && (var12 == -5000 ||
                var13 == -5000 ||
                var14_int == -5000)) {
                var15_int = field_L[var9];
                var16 = field_L[var10];
                var17 = field_L[var11];
                var18 = field_db[var9];
                var19 = field_db[var10];
                var20 = field_db[var11];
                var21 = field_f[var9];
                var22 = field_f[var10];
                var23 = field_f[var11];
                var15_int = var15_int - var16;
                var17 = var17 - var16;
                var18 = var18 - var19;
                var20 = var20 - var19;
                var21 = var21 - var22;
                var23 = var23 - var22;
                var24 = var18 * var23 - var21 * var20;
                var25 = var21 * var17 - var15_int * var23;
                var26 = var15_int * var20 - var18 * var17;
                if (!(var16 * var24 + var19 * var25 + var22 * var26 <= 0)) {
                  field_I[var8Lifetime1] = true;
                  if (field_k) {
                    field_C[var7] = (field_x[var9] + field_x[var10] + field_x[var11]) / 3;
                    incrementValue$12 = var7;
                    var7++;
                    field_m[incrementValue$12] = var8Lifetime1;
                  } else {
                    var27 = (field_x[var9] + field_x[var10] + field_x[var11]) / 3 + param3;
                    if (field_Y[var27] < 64) {
                      dupTemp$10 = field_Y[var27];
                      arrayValue$11 = field_o[var27];
                      field_Y[var27] = dupTemp$10 + 1;
                      arrayValue$11[dupTemp$10] = var8Lifetime1;
                    } else {
                      var28 = field_Y[var27];
                      if (var28 == 64) {
                        if (field_S == 512) {
                          break L45;
                        }
                        fieldTemp$7 = field_S;
                        field_S = field_S + 1;
                        var28 = 65 + fieldTemp$7;
                        field_Y[var27] = 65 + fieldTemp$7;
                      }
                      var28 -= 65;
                      dupTemp$8 = field_g[var28];
                      arrayValue$9 = field_E[var28];
                      field_g[var28] = dupTemp$8 + 1;
                      arrayValue$9[dupTemp$8] = var8Lifetime1;
                    }
                  }
                }
                break L45;
              }
              if (param1 &&
                this.a(tp.field_b + fb.field_q, ao.field_Rb + fb.field_d, field_v[var9], field_v[var10], field_v[var11], var12, var13, var14_int)) {
                fieldTemp$13 = qd.field_g;
                qd.field_g = qd.field_g + 1;
                dq.field_d[fieldTemp$13] = param2;
                param1 = false;
              }
              if ((var12 - var13) * (field_v[var11] - field_v[var10]) - (field_v[var9] - field_v[var10]) * (var14_int - var13) > 0) {
                field_I[var8Lifetime1] = false;
                if (var12 >= 0 &&
                  var13 >= 0 &&
                  var14_int >= 0 &&
                  var12 <= fb.field_k &&
                  var13 <= fb.field_k &&
                  var14_int <= fb.field_k) {
                  field_q[var8Lifetime1] = false;
                } else {
                  field_q[var8Lifetime1] = true;
                }
                if (!field_k) {
                  var15_intLifetime2 = (field_x[var9] + field_x[var10] + field_x[var11]) / 3 + param3;
                  if (field_Y[var15_intLifetime2] >= 64) {
                    var16Lifetime2 = field_Y[var15_intLifetime2];
                    if (var16Lifetime2 == 64) {
                      if (field_S == 512) {
                        break L45;
                      }
                      fieldTemp$14 = field_S;
                      field_S = field_S + 1;
                      var16Lifetime2 = 65 + fieldTemp$14;
                      field_Y[var15_intLifetime2] = 65 + fieldTemp$14;
                    }
                    var16Lifetime2 -= 65;
                    dupTemp$15 = field_g[var16Lifetime2];
                    arrayValue$16 = field_E[var16Lifetime2];
                    field_g[var16Lifetime2] = dupTemp$15 + 1;
                    arrayValue$16[dupTemp$15] = var8Lifetime1;
                  } else {
                    dupTemp$17 = field_Y[var15_intLifetime2];
                    arrayValue$18 = field_o[var15_intLifetime2];
                    field_Y[var15_intLifetime2] = dupTemp$17 + 1;
                    arrayValue$18[dupTemp$17] = var8Lifetime1;
                  }
                } else {
                  field_C[var7] = (field_x[var9] + field_x[var10] + field_x[var11]) / 3;
                  incrementValue$19 = var7;
                  var7++;
                  field_m[incrementValue$19] = var8Lifetime1;
                }
              }
            }
          }
        }
        if (field_k) {
          hq.a(0, field_C, field_m, var7 - 1, (byte) 80);
          if (this.field_M == null) {
            for (var8Lifetime2 = 0; var8Lifetime2 < var7; var8Lifetime2++) {
              this.b(field_m[var8Lifetime2]);
            }
            return;
          }
          for (var8Lifetime2 = 0; var8Lifetime2 < 12; var8Lifetime2++) {
            field_A[var8Lifetime2] = 0;
            field_F[var8Lifetime2] = 0;
          }
          for (var8Lifetime2 = 0; var8Lifetime2 < var7; var8Lifetime2++) {
            var9Lifetime1 = field_m[var8Lifetime2];
            var10Lifetime1 = field_C[var8Lifetime2];
            var11Lifetime1 = this.field_M[var9Lifetime1];
            dupTemp$2 = field_A[var11Lifetime1];
            field_A[var11Lifetime1] = dupTemp$2 + 1;
            var12Lifetime1 = dupTemp$2;
            field_l[var11Lifetime1][var12Lifetime1] = var9Lifetime1;
            if (var11Lifetime1 >= 10) {
              if (var11Lifetime1 != 10) {
                field_z[var12Lifetime1] = var10Lifetime1;
              } else {
                field_K[var12Lifetime1] = var10Lifetime1;
              }
            } else {
              field_F[var11Lifetime1] = field_F[var11Lifetime1] + var10Lifetime1;
            }
          }
        } else {
          if (this.field_M == null) {
            for (var8Lifetime2 = param4 - 1; var8Lifetime2 >= 0; var8Lifetime2--) {
              var9Lifetime1 = field_Y[var8Lifetime2];
              if (var9Lifetime1 > 0) {
                stackIn_88_0 = (var9Lifetime1 <= 64) ? var9Lifetime1 : 64;
                var10Lifetime1 = stackIn_88_0;
                var45 = field_o[var8Lifetime2];
                for (var12Lifetime1 = 0; var12Lifetime1 < var10Lifetime1; var12Lifetime1++) {
                  this.b(var45[var12Lifetime1]);
                }
              }
              if (var9Lifetime1 > 64) {
                var10Lifetime1 = field_Y[var8Lifetime2] - 64 - 1;
                var46 = field_E[var10Lifetime1];
                for (var12Lifetime1 = 0; var12Lifetime1 < field_g[var10Lifetime1]; var12Lifetime1++) {
                  this.b(var46[var12Lifetime1]);
                }
              }
            }
            return;
          }
          for (var8Lifetime2 = 0; var8Lifetime2 < 12; var8Lifetime2++) {
            field_A[var8Lifetime2] = 0;
            field_F[var8Lifetime2] = 0;
          }
          for (var8Lifetime2 = param4 - 1; var8Lifetime2 >= 0; var8Lifetime2--) {
            var9Lifetime1 = field_Y[var8Lifetime2];
            if (var9Lifetime1 > 0) {
              if (var9Lifetime1 <= 64) {
                var10Lifetime1 = var9Lifetime1;
              } else {
                var10Lifetime1 = 64;
              }
              var47 = field_o[var8Lifetime2];
              for (var12Lifetime1 = 0; var12Lifetime1 < var10Lifetime1; var12Lifetime1++) {
                var13Lifetime1 = var47[var12Lifetime1];
                var14_intLifetime1 = this.field_M[var13Lifetime1];
                dupTemp$0 = field_A[var14_intLifetime1];
                field_A[var14_intLifetime1] = dupTemp$0 + 1;
                var15_intLifetime1 = dupTemp$0;
                field_l[var14_intLifetime1][var15_intLifetime1] = var13Lifetime1;
                if (var14_intLifetime1 >= 10) {
                  if (var14_intLifetime1 != 10) {
                    field_z[var15_intLifetime1] = var8Lifetime2;
                  } else {
                    field_K[var15_intLifetime1] = var8Lifetime2;
                  }
                } else {
                  field_F[var14_intLifetime1] = field_F[var14_intLifetime1] + var8Lifetime2;
                }
              }
            }
            if (var9Lifetime1 > 64) {
              var10Lifetime1 = field_Y[var8Lifetime2] - 64 - 1;
              var48 = field_E[var10Lifetime1];
              for (var12Lifetime1 = 0; var12Lifetime1 < field_g[var10Lifetime1]; var12Lifetime1++) {
                var13Lifetime1Lifetime1 = var48[var12Lifetime1];
                var14_intLifetime1Lifetime1 = this.field_M[var13Lifetime1Lifetime1];
                dupTemp$1 = field_A[var14_intLifetime1Lifetime1];
                field_A[var14_intLifetime1Lifetime1] = dupTemp$1 + 1;
                var15_intLifetime1Lifetime1 = dupTemp$1;
                field_l[var14_intLifetime1Lifetime1][var15_intLifetime1Lifetime1] = var13Lifetime1Lifetime1;
                if (var14_intLifetime1Lifetime1 >= 10) {
                  if (var14_intLifetime1Lifetime1 != 10) {
                    field_z[var15_intLifetime1Lifetime1] = var8Lifetime2;
                  } else {
                    field_K[var15_intLifetime1Lifetime1] = var8Lifetime2;
                  }
                } else {
                  field_F[var14_intLifetime1Lifetime1] = field_F[var14_intLifetime1Lifetime1] + var8Lifetime2;
                }
              }
            }
          }
        }
        var8Lifetime3 = 0;
        if (!(field_A[1] <= 0) ||
          !(field_A[2] <= 0)) {
          var8Lifetime3 = (field_F[1] + field_F[2]) / (field_A[1] + field_A[2]);
        }
        var9Lifetime2 = 0;
        if (!(field_A[3] <= 0) ||
          !(field_A[4] <= 0)) {
          var9Lifetime2 = (field_F[3] + field_F[4]) / (field_A[3] + field_A[4]);
        }
        var10Lifetime2 = 0;
        if (!(field_A[6] <= 0) ||
          !(field_A[8] <= 0)) {
          var10Lifetime2 = (field_F[6] + field_F[8]) / (field_A[6] + field_A[8]);
        }
        var12Lifetime2 = 0;
        var13Lifetime2 = field_A[10];
        var14 = field_l[10];
        var15 = field_K;
        if (var12Lifetime2 == var13Lifetime2) {
          var12Lifetime2 = 0;
          var13Lifetime2 = field_A[11];
          var14 = field_l[11];
          var15 = field_z;
        }
        if (var12Lifetime2 >= var13Lifetime2) {
          var11Lifetime2 = -1000;
        } else {
          var11Lifetime2 = var15[var12Lifetime2];
        }
        for (var16Lifetime1 = 0; var16Lifetime1 < 10; var16Lifetime1++) {
          while (var16Lifetime1 == 0) {
            if (var11Lifetime2 > var8Lifetime3) {
              incrementValue$4 = var12Lifetime2;
              var12Lifetime2++;
              this.b(var14[incrementValue$4]);
              if (var12Lifetime2 == var13Lifetime2 &&
                var14 != field_l[11]) {
                var12Lifetime2 = 0;
                var13Lifetime2 = field_A[11];
                var14 = field_l[11];
                var15 = field_z;
              }
              if (var12Lifetime2 >= var13Lifetime2) {
                var11Lifetime2 = -1000;
                continue;
              }
              var11Lifetime2 = var15[var12Lifetime2];
              continue;
            }
            break;
          }
          while (var16Lifetime1 == 3) {
            if (var11Lifetime2 > var9Lifetime2) {
              incrementValue$5 = var12Lifetime2;
              var12Lifetime2++;
              this.b(var14[incrementValue$5]);
              if (var12Lifetime2 == var13Lifetime2 &&
                var14 != field_l[11]) {
                var12Lifetime2 = 0;
                var13Lifetime2 = field_A[11];
                var14 = field_l[11];
                var15 = field_z;
              }
              if (var12Lifetime2 >= var13Lifetime2) {
                var11Lifetime2 = -1000;
                continue;
              }
              var11Lifetime2 = var15[var12Lifetime2];
              continue;
            }
            break;
          }
          while (var16Lifetime1 == 5) {
            if (var11Lifetime2 > var10Lifetime2) {
              incrementValue$6 = var12Lifetime2;
              var12Lifetime2++;
              this.b(var14[incrementValue$6]);
              if (var12Lifetime2 == var13Lifetime2 &&
                var14 != field_l[11]) {
                var12Lifetime2 = 0;
                var13Lifetime2 = field_A[11];
                var14 = field_l[11];
                var15 = field_z;
              }
              if (var12Lifetime2 >= var13Lifetime2) {
                var11Lifetime2 = -1000;
                continue;
              }
              var11Lifetime2 = var15[var12Lifetime2];
              continue;
            }
            break;
          }
          var17Lifetime1 = field_A[var16Lifetime1];
          var49 = field_l[var16Lifetime1];
          var29 = 0;
          var19Lifetime1 = var29;
          while (var29 < var17Lifetime1) {
            this.b(var49[var29]);
            var29++;
          }
        }
        while (var11Lifetime2 != -1000) {
          incrementValue$3 = var12Lifetime2;
          var12Lifetime2++;
          this.b(var14[incrementValue$3]);
          if (var12Lifetime2 == var13Lifetime2 &&
            var14 != field_l[11]) {
            var12Lifetime2 = 0;
            var14 = field_l[11];
            var13Lifetime2 = field_A[11];
            var15 = field_z;
          }
          if (var12Lifetime2 >= var13Lifetime2) {
            var11Lifetime2 = -1000;
            continue;
          }
          var11Lifetime2 = var15[var12Lifetime2];
        }
        return;
    }

    private final void b(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        if (field_I[param0]) {
          this.c(param0);
          return;
        }
        var2 = this.field_j[param0];
        var3 = this.field_T[param0];
        var4 = this.field_R[param0];
        fb.field_n = field_q[param0];
        if (this.field_bb != null) {
          fb.field_c = this.field_bb[param0] & 255;
        } else {
          fb.field_c = 0;
        }
        if (this.field_Z != null &&
          this.field_Z[param0] != -1) {
          if (this.field_h != null &&
            this.field_h[param0] != -1) {
            var8 = this.field_h[param0] & 255;
            var5 = this.field_ab[var8];
            var6 = this.field_n[var8];
            var7 = this.field_i[var8];
          } else {
            var5 = var2;
            var6 = var3;
            var7 = var4;
          }
          if (this.field_J[param0] != -1) {
            fb.a(field_v[var2], field_v[var3], field_v[var4], field_X[var2], field_X[var3], field_X[var4], this.field_W[param0], this.field_y[param0], this.field_J[param0], field_L[var5], field_L[var6], field_L[var7], field_db[var5], field_db[var6], field_db[var7], field_f[var5], field_f[var6], field_f[var7], (int) this.field_Z[param0]);
          } else {
            fb.a(field_v[var2], field_v[var3], field_v[var4], field_X[var2], field_X[var3], field_X[var4], this.field_W[param0], this.field_W[param0], this.field_W[param0], field_L[var5], field_L[var6], field_L[var7], field_db[var5], field_db[var6], field_db[var7], field_f[var5], field_f[var6], field_f[var7], (int) this.field_Z[param0]);
          }
        } else {
          if (this.field_J[param0] != -1) {
            fb.a(field_v[var2], field_v[var3], field_v[var4], field_X[var2], field_X[var3], field_X[var4], this.field_W[param0] & 65535, this.field_y[param0] & 65535, this.field_J[param0] & 65535);
          } else {
            fb.a(field_v[var2], field_v[var3], field_v[var4], field_X[var2], field_X[var3], field_X[var4], fb.field_b[this.field_W[param0] & 65535]);
          }
        }
    }

    private nc() {
        this.field_U = false;
        this.field_P = 0;
        this.field_u = 0;
        this.field_s = 0;
        this.field_eb = 0;
    }

    nc(eg param0, int param1, int param2, int param3, int param4, int param5) {
        int dupTemp$1 = 0;
        int incrementValue$0 = 0;
        int var7;
        int var8;
        int var9;
        int[] var9_ref_int__;
        int var10;
        int var11;
        int var12;
        ah var13;
        int var14;
        int var15;
        int var16;
        int[] var17;
        ef var18;
        ef var19;
        int[] var20;
        int var9Lifetime1;
        int var10Lifetime1;
        int var10Lifetime2;
        int var11Lifetime1;
        int var11Lifetime2;
        int var10Lifetime1Lifetime1;
        int var10Lifetime1Lifetime2;
        this.field_U = false;
        this.field_P = 0;
        this.field_u = 0;
        this.field_s = 0;
        this.field_eb = 0;
        param0.d();
        param0.b();
        this.field_s = param0.field_B;
        this.field_u = param0.field_M;
        this.field_t = param0.field_g;
        this.field_Q = param0.field_Y;
        this.field_D = param0.field_q;
        this.field_P = param0.field_K;
        this.field_j = param0.field_N;
        this.field_T = param0.field_v;
        this.field_R = param0.field_X;
        this.field_M = param0.field_P;
        this.field_bb = param0.field_f;
        var7 = (int)Math.sqrt((double)(param3 * param3 + param4 * param4 + param5 * param5));
        var8 = param2 * var7 >> 8;
        this.field_W = new int[this.field_P];
        this.field_y = new int[this.field_P];
        this.field_J = new int[this.field_P];
        if (param0.field_L != null) {
          this.field_Z = new short[this.field_P];
          for (var9 = 0; var9 < this.field_P; var9++) {
            var10 = param0.field_L[var9];
            if (var10 != -1 &&
              fb.field_i.a((byte) 104, var10)) {
              this.field_Z[var9] = (short)var10;
            } else {
              this.field_Z[var9] = (short)-1;
            }
          }
        } else {
          this.field_Z = null;
        }
        if (param0.field_l > 0 &&
          param0.field_k != null) {
          var20 = new int[param0.field_l];
          var17 = var20;
          var9_ref_int__ = var17;
          for (var10Lifetime1 = 0; var10Lifetime1 < this.field_P; var10Lifetime1++) {
            if (param0.field_k[var10Lifetime1] != -1) {
              dupTemp$1 = param0.field_k[var10Lifetime1] & 255;
              var9_ref_int__[dupTemp$1] = var9_ref_int__[dupTemp$1] + 1;
            }
          }
          this.field_eb = 0;
          for (var10Lifetime1Lifetime1 = 0; var10Lifetime1Lifetime1 < param0.field_l; var10Lifetime1Lifetime1++) {
            if (var20[var10Lifetime1Lifetime1] > 0 &&
              param0.field_o[var10Lifetime1Lifetime1] == 0) {
              this.field_eb = this.field_eb + 1;
            }
          }
          this.field_ab = new int[this.field_eb];
          this.field_n = new int[this.field_eb];
          this.field_i = new int[this.field_eb];
          var10Lifetime1Lifetime2 = 0;
          for (var11 = 0; var11 < param0.field_l; var11++) {
            if (var20[var11] > 0 &&
              param0.field_o[var11] == 0) {
              this.field_ab[var10Lifetime1Lifetime2] = param0.field_p[var11] & 65535;
              this.field_n[var10Lifetime1Lifetime2] = param0.field_H[var11] & 65535;
              this.field_i[var10Lifetime1Lifetime2] = param0.field_C[var11] & 65535;
              incrementValue$0 = var10Lifetime1Lifetime2;
              var10Lifetime1Lifetime2++;
              var9_ref_int__[var11] = incrementValue$0;
            } else {
              var20[var11] = -1;
            }
          }
          this.field_h = new byte[this.field_P];
          for (var11Lifetime2 = 0; var11Lifetime2 < this.field_P; var11Lifetime2++) {
            if (param0.field_k[var11Lifetime2] == -1) {
              this.field_h[var11Lifetime2] = (byte)-1;
            } else {
              this.field_h[var11Lifetime2] = (byte)var9_ref_int__[param0.field_k[var11Lifetime2] & 255];
              if (this.field_h[var11Lifetime2] == -1 &&
                this.field_Z != null) {
                this.field_Z[var11Lifetime2] = (short)-1;
              }
            }
          }
        }
        var16 = 0;
        var9Lifetime1 = var16;
        while (var16 < this.field_P) {
          if (param0.field_Q != null) {
            var10Lifetime2 = param0.field_Q[var16];
          } else {
            var10Lifetime2 = 0;
          }
          if (param0.field_f != null) {
            var11Lifetime1 = param0.field_f[var16];
          } else {
            var11Lifetime1 = 0;
          }
          if (this.field_Z != null) {
            var12 = this.field_Z[var16];
          } else {
            var12 = -1;
          }
          if (var11Lifetime1 == -2) {
            var10Lifetime2 = 3;
          }
          if (var11Lifetime1 == -1) {
            var10Lifetime2 = 2;
          }
          if (var12 != -1) {
            if (var10Lifetime2 != 0) {
              if (var10Lifetime2 != 1) {
                this.field_J[var16] = -2;
              } else {
                var19 = param0.field_J[var16];
                var14 = param1 + (param3 * var19.field_b + param4 * var19.field_a + param5 * var19.field_d) / (var8 + var8 / 2);
                this.field_W[var16] = nc.d(var14);
                this.field_J[var16] = -1;
              }
            } else {
              if (param0.field_m != null &&
                param0.field_m[this.field_j[var16]] != null) {
                var13 = param0.field_m[this.field_j[var16]];
              } else {
                var13 = param0.field_Z[this.field_j[var16]];
              }
              var14 = param1 + (param3 * var13.field_f + param4 * var13.field_j + param5 * var13.field_d) / (var8 * var13.field_a);
              this.field_W[var16] = nc.d(var14);
              if (param0.field_m != null &&
                param0.field_m[this.field_T[var16]] != null) {
                var13 = param0.field_m[this.field_T[var16]];
              } else {
                var13 = param0.field_Z[this.field_T[var16]];
              }
              var14 = param1 + (param3 * var13.field_f + param4 * var13.field_j + param5 * var13.field_d) / (var8 * var13.field_a);
              this.field_y[var16] = nc.d(var14);
              if (param0.field_m != null &&
                param0.field_m[this.field_R[var16]] != null) {
                var13 = param0.field_m[this.field_R[var16]];
              } else {
                var13 = param0.field_Z[this.field_R[var16]];
              }
              var14 = param1 + (param3 * var13.field_f + param4 * var13.field_j + param5 * var13.field_d) / (var8 * var13.field_a);
              this.field_J[var16] = nc.d(var14);
            }
          } else {
            if (var10Lifetime2 != 0) {
              if (var10Lifetime2 != 1) {
                if (var10Lifetime2 != 3) {
                  this.field_J[var16] = -2;
                } else {
                  this.field_W[var16] = 128;
                  this.field_J[var16] = -1;
                }
              } else {
                var18 = param0.field_J[var16];
                var14 = param1 + (param3 * var18.field_b + param4 * var18.field_a + param5 * var18.field_d) / (var8 + var8 / 2) << 17;
                this.field_W[var16] = var14 | nc.b(param0.field_n[var16] & 65535, var14 >> 17);
                this.field_J[var16] = -1;
              }
            } else {
              var15 = param0.field_n[var16] & 65535;
              if (param0.field_m != null &&
                param0.field_m[this.field_j[var16]] != null) {
                var13 = param0.field_m[this.field_j[var16]];
              } else {
                var13 = param0.field_Z[this.field_j[var16]];
              }
              var14 = param1 + (param3 * var13.field_f + param4 * var13.field_j + param5 * var13.field_d) / (var8 * var13.field_a) << 17;
              this.field_W[var16] = var14 | nc.b(var15, var14 >> 17);
              if (param0.field_m != null &&
                param0.field_m[this.field_T[var16]] != null) {
                var13 = param0.field_m[this.field_T[var16]];
              } else {
                var13 = param0.field_Z[this.field_T[var16]];
              }
              var14 = param1 + (param3 * var13.field_f + param4 * var13.field_j + param5 * var13.field_d) / (var8 * var13.field_a) << 17;
              this.field_y[var16] = var14 | nc.b(var15, var14 >> 17);
              if (param0.field_m != null &&
                param0.field_m[this.field_R[var16]] != null) {
                var13 = param0.field_m[this.field_R[var16]];
              } else {
                var13 = param0.field_Z[this.field_R[var16]];
              }
              var14 = param1 + (param3 * var13.field_f + param4 * var13.field_j + param5 * var13.field_d) / (var8 * var13.field_a) << 17;
              this.field_J[var16] = var14 | nc.b(var15, var14 >> 17);
            }
          }
          var16++;
        }
    }

    static {
        nc discarded$0 = new nc();
        nc discarded$1 = new nc();
        nc discarded$2 = new nc();
        field_I = new boolean[4096];
        field_p = new int[10];
        field_A = new int[12];
        field_X = new int[4096];
        field_db = new int[4096];
        field_cb = new int[10];
        field_z = new int[4096];
        field_L = new int[4096];
        field_v = new int[4096];
        field_S = 0;
        field_x = new int[4096];
        field_K = new int[4096];
        field_F = new int[12];
        field_f = new int[4096];
        field_H = new int[10];
        field_k = false;
        field_l = new int[12][4096];
        field_q = new boolean[4096];
        if (field_k) {
          field_C = new int[4096];
          field_m = new int[4096];
        } else {
          field_Y = new int[1600];
          field_o = new int[1600][64];
          field_g = new int[32];
          field_E = new int[32][512];
        }
    }
}
