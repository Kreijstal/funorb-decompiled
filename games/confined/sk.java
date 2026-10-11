/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sk extends wj {
    private int field_E;
    private byte[] field_Q;
    private byte[] field_db;
    private int field_S;
    private int field_r;
    private int[] field_B;
    private int[] field_q;
    private int[] field_C;
    private short field_O;
    private int[] field_t;
    private boolean field_s;
    private int[] field_y;
    private int[] field_x;
    private int[] field_R;
    private static boolean[] field_L;
    private static int[] field_o;
    private static int field_fb;
    private static int[] field_n;
    static int field_j;
    private static int[] field_v;
    private static int[][] field_w;
    private static int[] field_eb;
    private static int[] field_k;
    private static int[] field_U;
    private int[] field_Y;
    private static int[] field_cb;
    static int field_G;
    private int[] field_W;
    private static int[] field_Z;
    private short[] field_F;
    static int field_h;
    private static int[] field_H;
    private static int[] field_g;
    private static int[] field_I;
    private static int[] field_K;
    private static int[] field_N;
    private static int[] field_T;
    private static int field_bb;
    private int[] field_M;
    private byte[] field_p;
    private static int[][] field_A;
    private int[] field_i;
    private int field_m;
    private int[] field_l;
    private static boolean field_X;
    private static int[] field_J;
    private static int[][] field_P;
    static int field_u;
    private static int[] field_ab;
    private static int[] field_V;
    private static boolean[] field_z;

    private final void b(int param0, int param1) {
        if (param0 < field_u) {
          field_u = param0;
        }
        if (param0 > field_h) {
          field_h = param0;
        }
        if (param1 < field_j) {
          field_j = param1;
        }
        if (param1 > field_G) {
          field_G = param1;
          return;
        }
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

    private final void e(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        if (field_L[param0]) {
          this.c(param0);
          return;
        }
        var2 = this.field_t[param0];
        var3 = this.field_M[param0];
        var4 = this.field_y[param0];
        ti.field_c = field_z[param0];
        if (this.field_p != null) {
          ti.field_h = this.field_p[param0] & 255;
        } else {
          ti.field_h = 0;
        }
        if (this.field_F != null &&
          this.field_F[param0] != -1) {
          if (this.field_db != null &&
            this.field_db[param0] != -1) {
            var8 = this.field_db[param0] & 255;
            var5 = this.field_Y[var8];
            var6 = this.field_R[var8];
            var7 = this.field_x[var8];
          } else {
            var5 = var2;
            var6 = var3;
            var7 = var4;
          }
          if (this.field_l[param0] != -1) {
            ti.a(field_J[var2], field_J[var3], field_J[var4], field_eb[var2], field_eb[var3], field_eb[var4], this.field_i[param0], this.field_q[param0], this.field_l[param0], field_H[var5], field_H[var6], field_H[var7], field_V[var5], field_V[var6], field_V[var7], field_N[var5], field_N[var6], field_N[var7], (int) this.field_F[param0]);
          } else {
            ti.a(field_J[var2], field_J[var3], field_J[var4], field_eb[var2], field_eb[var3], field_eb[var4], this.field_i[param0], this.field_i[param0], this.field_i[param0], field_H[var5], field_H[var6], field_H[var7], field_V[var5], field_V[var6], field_V[var7], field_N[var5], field_N[var6], field_N[var7], (int) this.field_F[param0]);
          }
        } else {
          if (this.field_l[param0] != -1) {
            ti.a(field_J[var2], field_J[var3], field_J[var4], field_eb[var2], field_eb[var3], field_eb[var4], this.field_i[param0] & 65535, this.field_q[param0] & 65535, this.field_l[param0] & 65535);
          } else {
            ti.a(field_J[var2], field_J[var3], field_J[var4], field_eb[var2], field_eb[var3], field_eb[var4], ti.field_o[this.field_i[param0] & 65535]);
          }
        }
    }

    final void a() {
        Throwable decompiledCaughtException = null;
        Exception var1 = null;
        try {
          this.d();
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = (Exception) (Object) decompiledCaughtException;
        }
    }

    private final void b() {
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
        for (var9 = 0; var9 < this.field_m; var9++) {
          var10 = this.field_W[var9];
          var11 = this.field_C[var9];
          var12 = this.field_B[var9];
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
        Math.sqrt((double)var7);
        this.field_O = (short)(int)(Math.sqrt((double)var8) + 0.99);
        this.field_s = true;
    }

    private final static int a(int param0, int param1) {
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
        var2 = ti.field_k;
        var3 = ti.field_f;
        var4 = 0;
        var5 = this.field_t[param0];
        var6 = this.field_M[param0];
        var7 = this.field_y[param0];
        var8 = field_N[var5];
        var9 = field_N[var6];
        var10 = field_N[var7];
        if (this.field_p != null) {
          ti.field_h = this.field_p[param0] & 255;
        } else {
          ti.field_h = 0;
        }
        if (var8 < 50) {
          var11 = field_H[var5];
          var12 = field_V[var5];
          var13 = this.field_i[param0] & 65535;
          if (var10 >= 50) {
            var14 = (50 - var8) * ti.field_i[var10 - var8];
            field_k[var4] = var2 + (var11 + ((field_H[var7] - var11) * var14 >> 16) << 9) / 50;
            field_ab[var4] = var3 + (var12 + ((field_V[var7] - var12) * var14 >> 16) << 9) / 50;
            incrementValue$0 = var4;
            var4++;
            field_o[incrementValue$0] = var13 + (((this.field_l[param0] & 65535) - var13) * var14 >> 16);
          }
          if (var9 >= 50) {
            var14Lifetime4 = (50 - var8) * ti.field_i[var9 - var8];
            field_k[var4] = var2 + (var11 + ((field_H[var6] - var11) * var14Lifetime4 >> 16) << 9) / 50;
            field_ab[var4] = var3 + (var12 + ((field_V[var6] - var12) * var14Lifetime4 >> 16) << 9) / 50;
            incrementValue$1 = var4;
            var4++;
            field_o[incrementValue$1] = var13 + (((this.field_q[param0] & 65535) - var13) * var14Lifetime4 >> 16);
          }
        } else {
          field_k[var4] = field_eb[var5];
          field_ab[var4] = field_J[var5];
          incrementValue$2 = var4;
          var4++;
          field_o[incrementValue$2] = this.field_i[param0] & 65535;
        }
        if (var9 < 50) {
          var11Lifetime1 = field_H[var6];
          var12Lifetime1 = field_V[var6];
          var13Lifetime1 = this.field_q[param0] & 65535;
          if (var8 >= 50) {
            var14Lifetime1 = (50 - var9) * ti.field_i[var8 - var9];
            field_k[var4] = var2 + (var11Lifetime1 + ((field_H[var5] - var11Lifetime1) * var14Lifetime1 >> 16) << 9) / 50;
            field_ab[var4] = var3 + (var12Lifetime1 + ((field_V[var5] - var12Lifetime1) * var14Lifetime1 >> 16) << 9) / 50;
            incrementValue$3 = var4;
            var4++;
            field_o[incrementValue$3] = var13Lifetime1 + (((this.field_i[param0] & 65535) - var13Lifetime1) * var14Lifetime1 >> 16);
          }
          if (var10 >= 50) {
            var14Lifetime1Lifetime1 = (50 - var9) * ti.field_i[var10 - var9];
            field_k[var4] = var2 + (var11Lifetime1 + ((field_H[var7] - var11Lifetime1) * var14Lifetime1Lifetime1 >> 16) << 9) / 50;
            field_ab[var4] = var3 + (var12Lifetime1 + ((field_V[var7] - var12Lifetime1) * var14Lifetime1Lifetime1 >> 16) << 9) / 50;
            incrementValue$4 = var4;
            var4++;
            field_o[incrementValue$4] = var13Lifetime1 + (((this.field_l[param0] & 65535) - var13Lifetime1) * var14Lifetime1Lifetime1 >> 16);
          }
        } else {
          field_k[var4] = field_eb[var6];
          field_ab[var4] = field_J[var6];
          incrementValue$5 = var4;
          var4++;
          field_o[incrementValue$5] = this.field_q[param0] & 65535;
        }
        if (var10 < 50) {
          var11Lifetime2 = field_H[var7];
          var12Lifetime2 = field_V[var7];
          var13Lifetime2 = this.field_l[param0] & 65535;
          if (var9 >= 50) {
            var14Lifetime2 = (50 - var10) * ti.field_i[var9 - var10];
            field_k[var4] = var2 + (var11Lifetime2 + ((field_H[var6] - var11Lifetime2) * var14Lifetime2 >> 16) << 9) / 50;
            field_ab[var4] = var3 + (var12Lifetime2 + ((field_V[var6] - var12Lifetime2) * var14Lifetime2 >> 16) << 9) / 50;
            incrementValue$6 = var4;
            var4++;
            field_o[incrementValue$6] = var13Lifetime2 + (((this.field_q[param0] & 65535) - var13Lifetime2) * var14Lifetime2 >> 16);
          }
          if (var8 >= 50) {
            var14Lifetime2Lifetime1 = (50 - var10) * ti.field_i[var8 - var10];
            field_k[var4] = var2 + (var11Lifetime2 + ((field_H[var5] - var11Lifetime2) * var14Lifetime2Lifetime1 >> 16) << 9) / 50;
            field_ab[var4] = var3 + (var12Lifetime2 + ((field_V[var5] - var12Lifetime2) * var14Lifetime2Lifetime1 >> 16) << 9) / 50;
            incrementValue$7 = var4;
            var4++;
            field_o[incrementValue$7] = var13Lifetime2 + (((this.field_i[param0] & 65535) - var13Lifetime2) * var14Lifetime2Lifetime1 >> 16);
          }
        } else {
          field_k[var4] = field_eb[var7];
          field_ab[var4] = field_J[var7];
          incrementValue$8 = var4;
          var4++;
          field_o[incrementValue$8] = this.field_l[param0] & 65535;
        }
        boolean decompiledFrameRemainder0 = true;
        var11Lifetime3 = field_k[0];
        var12Lifetime3 = field_k[1];
        var13Lifetime3 = field_k[2];
        var14Lifetime3 = field_ab[0];
        var15 = field_ab[1];
        var16 = field_ab[2];
        ti.field_c = false;
        if (var4 == 3) {
          if (var11Lifetime3 < 0 ||
            var12Lifetime3 < 0 ||
            var13Lifetime3 < 0 ||
            !(var11Lifetime3 <= ti.field_e) ||
            !(var12Lifetime3 <= ti.field_e) ||
            !(var13Lifetime3 <= ti.field_e)) {
            ti.field_c = true;
          }
          if (this.field_F != null &&
            this.field_F[param0] != -1) {
            if (this.field_db != null &&
              this.field_db[param0] != -1) {
              var20 = this.field_db[param0] & 255;
              var17 = this.field_Y[var20];
              var18 = this.field_R[var20];
              var19 = this.field_x[var20];
            } else {
              var17 = var5;
              var18 = var6;
              var19 = var7;
            }
            if (this.field_l[param0] != -1) {
              ti.a(var14Lifetime3, var15, var16, var11Lifetime3, var12Lifetime3, var13Lifetime3, field_o[0], field_o[1], field_o[2], field_H[var17], field_H[var18], field_H[var19], field_V[var17], field_V[var18], field_V[var19], field_N[var17], field_N[var18], field_N[var19], (int) this.field_F[param0]);
            } else {
              ti.a(var14Lifetime3, var15, var16, var11Lifetime3, var12Lifetime3, var13Lifetime3, this.field_i[param0], this.field_i[param0], this.field_i[param0], field_H[var17], field_H[var18], field_H[var19], field_V[var17], field_V[var18], field_V[var19], field_N[var17], field_N[var18], field_N[var19], (int) this.field_F[param0]);
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (this.field_l[param0] != -1) {
              ti.a(var14Lifetime3, var15, var16, var11Lifetime3, var12Lifetime3, var13Lifetime3, field_o[0], field_o[1], field_o[2]);
            } else {
              ti.a(var14Lifetime3, var15, var16, var11Lifetime3, var12Lifetime3, var13Lifetime3, ti.field_o[this.field_i[param0] & 65535]);
            }
          }
        }
        if (var4 != 4) {
          return;
        }
        if (var11Lifetime3 < 0 ||
          var12Lifetime3 < 0 ||
          var13Lifetime3 < 0 ||
          !(var11Lifetime3 <= ti.field_e) ||
          !(var12Lifetime3 <= ti.field_e) ||
          !(var13Lifetime3 <= ti.field_e) ||
          !(field_k[3] >= 0) ||
          !(field_k[3] <= ti.field_e)) {
          ti.field_c = true;
        }
        if (this.field_F != null &&
          this.field_F[param0] != -1) {
          if (this.field_db != null &&
            this.field_db[param0] != -1) {
            var20Lifetime1 = this.field_db[param0] & 255;
            var17Lifetime1 = this.field_Y[var20Lifetime1];
            var18Lifetime1 = this.field_R[var20Lifetime1];
            var19Lifetime1 = this.field_x[var20Lifetime1];
          } else {
            var17Lifetime1 = var5;
            var18Lifetime1 = var6;
            var19Lifetime1 = var7;
          }
          var20Lifetime1Lifetime1 = this.field_F[param0];
          if (this.field_l[param0] != -1) {
            ti.a(var14Lifetime3, var15, var16, var11Lifetime3, var12Lifetime3, var13Lifetime3, field_o[0], field_o[1], field_o[2], field_H[var17Lifetime1], field_H[var18Lifetime1], field_H[var19Lifetime1], field_V[var17Lifetime1], field_V[var18Lifetime1], field_V[var19Lifetime1], field_N[var17Lifetime1], field_N[var18Lifetime1], field_N[var19Lifetime1], var20Lifetime1Lifetime1);
            ti.a(var14Lifetime3, var16, field_ab[3], var11Lifetime3, var13Lifetime3, field_k[3], field_o[0], field_o[2], field_o[3], field_H[var17Lifetime1], field_H[var18Lifetime1], field_H[var19Lifetime1], field_V[var17Lifetime1], field_V[var18Lifetime1], field_V[var19Lifetime1], field_N[var17Lifetime1], field_N[var18Lifetime1], field_N[var19Lifetime1], var20Lifetime1Lifetime1);
          } else {
            ti.a(var14Lifetime3, var15, var16, var11Lifetime3, var12Lifetime3, var13Lifetime3, this.field_i[param0], this.field_i[param0], this.field_i[param0], field_H[var17Lifetime1], field_H[var18Lifetime1], field_H[var19Lifetime1], field_V[var17Lifetime1], field_V[var18Lifetime1], field_V[var19Lifetime1], field_N[var17Lifetime1], field_N[var18Lifetime1], field_N[var19Lifetime1], var20Lifetime1Lifetime1);
            ti.a(var14Lifetime3, var16, field_ab[3], var11Lifetime3, var13Lifetime3, field_k[3], this.field_i[param0], this.field_i[param0], this.field_i[param0], field_H[var17Lifetime1], field_H[var18Lifetime1], field_H[var19Lifetime1], field_V[var17Lifetime1], field_V[var18Lifetime1], field_V[var19Lifetime1], field_N[var17Lifetime1], field_N[var18Lifetime1], field_N[var19Lifetime1], var20Lifetime1Lifetime1);
          }
        } else {
          if (this.field_l[param0] != -1) {
            ti.a(var14Lifetime3, var15, var16, var11Lifetime3, var12Lifetime3, var13Lifetime3, field_o[0], field_o[1], field_o[2]);
            ti.a(var14Lifetime3, var16, field_ab[3], var11Lifetime3, var13Lifetime3, field_k[3], field_o[0], field_o[2], field_o[3]);
          } else {
            var17Lifetime1 = ti.field_o[this.field_i[param0] & 65535];
            ti.a(var14Lifetime3, var15, var16, var11Lifetime3, var12Lifetime3, var13Lifetime3, var17Lifetime1);
            ti.a(var14Lifetime3, var16, field_ab[3], var11Lifetime3, var13Lifetime3, field_k[3], var17Lifetime1);
          }
        }
    }

    public static void c() {
        field_z = null;
        field_L = null;
        field_eb = null;
        field_J = null;
        field_g = null;
        field_H = null;
        field_V = null;
        field_N = null;
        field_cb = null;
        field_P = (int[][]) null;
        field_Z = null;
        field_A = (int[][]) null;
        field_I = null;
        field_n = null;
        field_T = null;
        field_w = (int[][]) null;
        field_K = null;
        field_U = null;
        field_v = null;
        field_k = null;
        field_ab = null;
        field_o = null;
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
        field_bb = param4;
        var7 = 0;
        if (!field_X) {
          for (var8 = 0; var8 < 1600; var8++) {
            field_cb[var8] = 0;
          }
          for (var8Lifetime4 = 0; var8Lifetime4 < 32; var8Lifetime4++) {
            field_Z[var8Lifetime4] = 0;
          }
          field_fb = 0;
        }
        for (var8Lifetime1 = 0; var8Lifetime1 < this.field_E; var8Lifetime1++) {
          L45: {
            if (this.field_l[var8Lifetime1] != -2) {
              var9 = this.field_t[var8Lifetime1];
              var10 = this.field_M[var8Lifetime1];
              var11 = this.field_y[var8Lifetime1];
              var12 = field_eb[var9];
              var13 = field_eb[var10];
              var14_int = field_eb[var11];
              if (param0 && (var12 == -5000 ||
                var13 == -5000 ||
                var14_int == -5000)) {
                var15_int = field_H[var9];
                var16 = field_H[var10];
                var17 = field_H[var11];
                var18 = field_V[var9];
                var19 = field_V[var10];
                var20 = field_V[var11];
                var21 = field_N[var9];
                var22 = field_N[var10];
                var23 = field_N[var11];
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
                  field_L[var8Lifetime1] = true;
                  if (field_X) {
                    field_I[var7] = (field_g[var9] + field_g[var10] + field_g[var11]) / 3;
                    incrementValue$12 = var7;
                    var7++;
                    field_n[incrementValue$12] = var8Lifetime1;
                  } else {
                    var27 = (field_g[var9] + field_g[var10] + field_g[var11]) / 3 + param3;
                    if (field_cb[var27] < 64) {
                      dupTemp$10 = field_cb[var27];
                      arrayValue$11 = field_P[var27];
                      field_cb[var27] = dupTemp$10 + 1;
                      arrayValue$11[dupTemp$10] = var8Lifetime1;
                    } else {
                      var28 = field_cb[var27];
                      if (var28 == 64) {
                        if (field_fb == 512) {
                          break L45;
                        }
                        fieldTemp$7 = field_fb;
                        field_fb = field_fb + 1;
                        var28 = 65 + fieldTemp$7;
                        field_cb[var27] = 65 + fieldTemp$7;
                      }
                      var28 -= 65;
                      dupTemp$8 = field_Z[var28];
                      arrayValue$9 = field_A[var28];
                      field_Z[var28] = dupTemp$8 + 1;
                      arrayValue$9[dupTemp$8] = var8Lifetime1;
                    }
                  }
                }
                break L45;
              }
              if (param1 &&
                this.a(on.field_a + ti.field_k, bj.field_q + ti.field_f, field_J[var9], field_J[var10], field_J[var11], var12, var13, var14_int)) {
                fieldTemp$13 = tk.field_g;
                tk.field_g = tk.field_g + 1;
                la.field_S[fieldTemp$13] = param2;
                param1 = false;
              }
              if ((var12 - var13) * (field_J[var11] - field_J[var10]) - (field_J[var9] - field_J[var10]) * (var14_int - var13) > 0) {
                field_L[var8Lifetime1] = false;
                if (var12 >= 0 &&
                  var13 >= 0 &&
                  var14_int >= 0 &&
                  var12 <= ti.field_e &&
                  var13 <= ti.field_e &&
                  var14_int <= ti.field_e) {
                  field_z[var8Lifetime1] = false;
                } else {
                  field_z[var8Lifetime1] = true;
                }
                if (!field_X) {
                  var15_intLifetime2 = (field_g[var9] + field_g[var10] + field_g[var11]) / 3 + param3;
                  if (field_cb[var15_intLifetime2] >= 64) {
                    var16Lifetime2 = field_cb[var15_intLifetime2];
                    if (var16Lifetime2 == 64) {
                      if (field_fb == 512) {
                        break L45;
                      }
                      fieldTemp$14 = field_fb;
                      field_fb = field_fb + 1;
                      var16Lifetime2 = 65 + fieldTemp$14;
                      field_cb[var15_intLifetime2] = 65 + fieldTemp$14;
                    }
                    var16Lifetime2 -= 65;
                    dupTemp$15 = field_Z[var16Lifetime2];
                    arrayValue$16 = field_A[var16Lifetime2];
                    field_Z[var16Lifetime2] = dupTemp$15 + 1;
                    arrayValue$16[dupTemp$15] = var8Lifetime1;
                  } else {
                    dupTemp$17 = field_cb[var15_intLifetime2];
                    arrayValue$18 = field_P[var15_intLifetime2];
                    field_cb[var15_intLifetime2] = dupTemp$17 + 1;
                    arrayValue$18[dupTemp$17] = var8Lifetime1;
                  }
                } else {
                  field_I[var7] = (field_g[var9] + field_g[var10] + field_g[var11]) / 3;
                  incrementValue$19 = var7;
                  var7++;
                  field_n[incrementValue$19] = var8Lifetime1;
                }
              }
            }
          }
        }
        if (field_X) {
          hk.a((byte) 120, 0, field_n, var7 - 1, field_I);
          if (this.field_Q == null) {
            for (var8Lifetime2 = 0; var8Lifetime2 < var7; var8Lifetime2++) {
              this.e(field_n[var8Lifetime2]);
            }
            return;
          }
          for (var8Lifetime2 = 0; var8Lifetime2 < 12; var8Lifetime2++) {
            field_T[var8Lifetime2] = 0;
            field_v[var8Lifetime2] = 0;
          }
          for (var8Lifetime2 = 0; var8Lifetime2 < var7; var8Lifetime2++) {
            var9Lifetime1 = field_n[var8Lifetime2];
            var10Lifetime1 = field_I[var8Lifetime2];
            var11Lifetime1 = this.field_Q[var9Lifetime1];
            dupTemp$2 = field_T[var11Lifetime1];
            field_T[var11Lifetime1] = dupTemp$2 + 1;
            var12Lifetime1 = dupTemp$2;
            field_w[var11Lifetime1][var12Lifetime1] = var9Lifetime1;
            if (var11Lifetime1 >= 10) {
              if (var11Lifetime1 != 10) {
                field_U[var12Lifetime1] = var10Lifetime1;
              } else {
                field_K[var12Lifetime1] = var10Lifetime1;
              }
            } else {
              field_v[var11Lifetime1] = field_v[var11Lifetime1] + var10Lifetime1;
            }
          }
        } else {
          if (this.field_Q == null) {
            for (var8Lifetime2 = param4 - 1; var8Lifetime2 >= 0; var8Lifetime2--) {
              var9Lifetime1 = field_cb[var8Lifetime2];
              if (var9Lifetime1 > 0) {
                stackIn_88_0 = (var9Lifetime1 <= 64) ? var9Lifetime1 : 64;
                var10Lifetime1 = stackIn_88_0;
                var45 = field_P[var8Lifetime2];
                for (var12Lifetime1 = 0; var12Lifetime1 < var10Lifetime1; var12Lifetime1++) {
                  this.e(var45[var12Lifetime1]);
                }
              }
              if (var9Lifetime1 > 64) {
                var10Lifetime1 = field_cb[var8Lifetime2] - 64 - 1;
                var46 = field_A[var10Lifetime1];
                for (var12Lifetime1 = 0; var12Lifetime1 < field_Z[var10Lifetime1]; var12Lifetime1++) {
                  this.e(var46[var12Lifetime1]);
                }
              }
            }
            return;
          }
          for (var8Lifetime2 = 0; var8Lifetime2 < 12; var8Lifetime2++) {
            field_T[var8Lifetime2] = 0;
            field_v[var8Lifetime2] = 0;
          }
          for (var8Lifetime2 = param4 - 1; var8Lifetime2 >= 0; var8Lifetime2--) {
            var9Lifetime1 = field_cb[var8Lifetime2];
            if (var9Lifetime1 > 0) {
              if (var9Lifetime1 <= 64) {
                var10Lifetime1 = var9Lifetime1;
              } else {
                var10Lifetime1 = 64;
              }
              var47 = field_P[var8Lifetime2];
              for (var12Lifetime1 = 0; var12Lifetime1 < var10Lifetime1; var12Lifetime1++) {
                var13Lifetime1 = var47[var12Lifetime1];
                var14_intLifetime1 = this.field_Q[var13Lifetime1];
                dupTemp$0 = field_T[var14_intLifetime1];
                field_T[var14_intLifetime1] = dupTemp$0 + 1;
                var15_intLifetime1 = dupTemp$0;
                field_w[var14_intLifetime1][var15_intLifetime1] = var13Lifetime1;
                if (var14_intLifetime1 >= 10) {
                  if (var14_intLifetime1 != 10) {
                    field_U[var15_intLifetime1] = var8Lifetime2;
                  } else {
                    field_K[var15_intLifetime1] = var8Lifetime2;
                  }
                } else {
                  field_v[var14_intLifetime1] = field_v[var14_intLifetime1] + var8Lifetime2;
                }
              }
            }
            if (var9Lifetime1 > 64) {
              var10Lifetime1 = field_cb[var8Lifetime2] - 64 - 1;
              var48 = field_A[var10Lifetime1];
              for (var12Lifetime1 = 0; var12Lifetime1 < field_Z[var10Lifetime1]; var12Lifetime1++) {
                var13Lifetime1Lifetime1 = var48[var12Lifetime1];
                var14_intLifetime1Lifetime1 = this.field_Q[var13Lifetime1Lifetime1];
                dupTemp$1 = field_T[var14_intLifetime1Lifetime1];
                field_T[var14_intLifetime1Lifetime1] = dupTemp$1 + 1;
                var15_intLifetime1Lifetime1 = dupTemp$1;
                field_w[var14_intLifetime1Lifetime1][var15_intLifetime1Lifetime1] = var13Lifetime1Lifetime1;
                if (var14_intLifetime1Lifetime1 >= 10) {
                  if (var14_intLifetime1Lifetime1 != 10) {
                    field_U[var15_intLifetime1Lifetime1] = var8Lifetime2;
                  } else {
                    field_K[var15_intLifetime1Lifetime1] = var8Lifetime2;
                  }
                } else {
                  field_v[var14_intLifetime1Lifetime1] = field_v[var14_intLifetime1Lifetime1] + var8Lifetime2;
                }
              }
            }
          }
        }
        var8Lifetime3 = 0;
        if (!(field_T[1] <= 0) ||
          !(field_T[2] <= 0)) {
          var8Lifetime3 = (field_v[1] + field_v[2]) / (field_T[1] + field_T[2]);
        }
        var9Lifetime2 = 0;
        if (!(field_T[3] <= 0) ||
          !(field_T[4] <= 0)) {
          var9Lifetime2 = (field_v[3] + field_v[4]) / (field_T[3] + field_T[4]);
        }
        var10Lifetime2 = 0;
        if (!(field_T[6] <= 0) ||
          !(field_T[8] <= 0)) {
          var10Lifetime2 = (field_v[6] + field_v[8]) / (field_T[6] + field_T[8]);
        }
        var12Lifetime2 = 0;
        var13Lifetime2 = field_T[10];
        var14 = field_w[10];
        var15 = field_K;
        if (var12Lifetime2 == var13Lifetime2) {
          var12Lifetime2 = 0;
          var13Lifetime2 = field_T[11];
          var14 = field_w[11];
          var15 = field_U;
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
              this.e(var14[incrementValue$4]);
              if (var12Lifetime2 == var13Lifetime2 &&
                var14 != field_w[11]) {
                var12Lifetime2 = 0;
                var13Lifetime2 = field_T[11];
                var14 = field_w[11];
                var15 = field_U;
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
              this.e(var14[incrementValue$5]);
              if (var12Lifetime2 == var13Lifetime2 &&
                var14 != field_w[11]) {
                var12Lifetime2 = 0;
                var13Lifetime2 = field_T[11];
                var14 = field_w[11];
                var15 = field_U;
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
              this.e(var14[incrementValue$6]);
              if (var12Lifetime2 == var13Lifetime2 &&
                var14 != field_w[11]) {
                var12Lifetime2 = 0;
                var13Lifetime2 = field_T[11];
                var14 = field_w[11];
                var15 = field_U;
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
          var17Lifetime1 = field_T[var16Lifetime1];
          var49 = field_w[var16Lifetime1];
          var29 = 0;
          var19Lifetime1 = var29;
          while (var29 < var17Lifetime1) {
            this.e(var49[var29]);
            var29++;
          }
        }
        while (var11Lifetime2 != -1000) {
          incrementValue$3 = var12Lifetime2;
          var12Lifetime2++;
          this.e(var14[incrementValue$3]);
          if (var12Lifetime2 == var13Lifetime2 &&
            var14 != field_w[11]) {
            var12Lifetime2 = 0;
            var14 = field_w[11];
            var13Lifetime2 = field_T[11];
            var15 = field_U;
          }
          if (var12Lifetime2 >= var13Lifetime2) {
            var11Lifetime2 = -1000;
            continue;
          }
          var11Lifetime2 = var15[var12Lifetime2];
        }
        return;
    }

    private final void d() {
        int var1;
        int var2;
        int var3;
        int var5;
        int var8;
        int[] var11;
        int[] var12;
        int var1Lifetime1;
        int var1Lifetime2;
        int var2Lifetime1;
        int var2Lifetime2;
        int var3Lifetime1;
        int var5Lifetime1;
        int var3Lifetime1Lifetime1;
        if (field_bb == 0) {
          field_G = 0;
          field_h = 0;
          field_j = 0;
          field_u = 0;
          return;
        }
        field_u = ti.field_e;
        field_j = ti.field_g;
        field_h = 0;
        field_G = 0;
        for (var1 = 0; var1 < this.field_S; var1++) {
          var2 = field_eb[var1];
          if (var2 != -5000) {
            var3 = field_J[var1];
            if (var2 < field_u) {
              field_u = var2;
            }
            if (var2 > field_h) {
              field_h = var2;
            }
            if (var3 < field_j) {
              field_j = var3;
            }
            if (var3 > field_G) {
              field_G = var3;
            }
          }
        }
        for (var1Lifetime1 = field_bb - 1; var1Lifetime1 >= 0; var1Lifetime1--) {
          var2Lifetime1 = field_cb[var1Lifetime1];
          if (var2Lifetime1 > 0) {
            if (var2Lifetime1 <= 64) {
              var3Lifetime1 = var2Lifetime1;
            } else {
              var3Lifetime1 = 64;
            }
            var11 = field_P[var1Lifetime1];
            for (var5 = 0; var5 < var3Lifetime1; var5++) {
              this.b(var11[var5]);
            }
          }
          if (var2Lifetime1 > 64) {
            var3Lifetime1Lifetime1 = field_cb[var1Lifetime1] - 64 - 1;
            var12 = field_A[var3Lifetime1Lifetime1];
            var8 = 0;
            var5Lifetime1 = var8;
            while (var8 < field_Z[var3Lifetime1Lifetime1]) {
              this.b(var12[var8]);
              var8++;
            }
          }
        }
        if (field_u < 0) {
          field_u = 0;
        }
        if (field_h > ti.field_e) {
          field_h = ti.field_e;
        }
        if (field_j < 0) {
          field_j = 0;
        }
        if (field_G > ti.field_g) {
          field_G = ti.field_g;
        }
        if (field_u > field_h) {
          field_u = field_h;
        }
        if (field_j > field_G) {
          field_j = field_G;
        }
        var1Lifetime2 = ti.field_l[0] % fn.field_g;
        var2Lifetime2 = ti.field_l[0] / fn.field_g;
        field_u = field_u + var1Lifetime2;
        field_h = field_h + var1Lifetime2;
        field_j = field_j + var2Lifetime2;
        field_G = field_G + var2Lifetime2;
        return;
    }

    final void a(int[] param0, int[] param1) {
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
        field_bb = 0;
        if (!this.field_s) {
          this.b();
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
        if (var5 < 50 - this.field_O) {
          return;
        }
        var15Lifetime2 = this.field_O * 92682 >> 16;
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
        stackIn_15_0 = (var5 > 50 + this.field_O) ? 0 : 1;
        var16 = stackIn_15_0;
        if (var16 == 0) {
          stackIn_21_0 = (this.field_r > 0) ? 1 : 0;
        } else {
          stackIn_21_0 = 1;
        }
        var17Lifetime2 = stackIn_21_0;
        var18Lifetime1 = ti.field_k;
        var19Lifetime1 = ti.field_f;
        var20 = 0;
        var27 = 0;
        var21_intLifetime1 = var27;
        while (var27 < this.field_S) {
          var22Lifetime1 = this.field_W[var27];
          var23Lifetime1 = this.field_C[var27];
          var24 = this.field_B[var27];
          var25 = var22Lifetime1 * var6 + var23Lifetime1 * var9 + var24 * var12 >> 16;
          var26 = var22Lifetime1 * var7 + var23Lifetime1 * var10 + var24 * var13 >> 16;
          var24 = var22Lifetime1 * var8 + var23Lifetime1 * var11 + var24 * var14 >> 16;
          var22Lifetime1Lifetime1 = var25;
          var23Lifetime1Lifetime1 = var26;
          field_g[var27] = var24;
          var22Lifetime1Lifetime1 = var22Lifetime1Lifetime1 + var3;
          var23Lifetime1Lifetime1 = var23Lifetime1Lifetime1 + var4;
          var24 = var24 + var5;
          if (var24 < 50) {
            field_eb[var27] = -5000;
            var20 = 1;
          } else {
            field_eb[var27] = var18Lifetime1 + (var22Lifetime1Lifetime1 << 9) / var24;
            field_J[var27] = var19Lifetime1 + (var23Lifetime1Lifetime1 << 9) / var24;
          }
          if (var17Lifetime2 != 0) {
            field_H[var27] = var22Lifetime1Lifetime1;
            field_V[var27] = var23Lifetime1Lifetime1;
            field_N[var27] = var24;
          }
          var27++;
        }
        try {
          this.a((var20 & var16) != 0, false, 0L, (int) this.field_O, this.field_O << 1);
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var21 = (Exception) (Object) decompiledCaughtException;
        }
        return;
    }

    private final void b(int param0) {
        int var2 = 0;
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
        int var10Lifetime1;
        int var10Lifetime2;
        int var11Lifetime1;
        int var11Lifetime2;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        int var12Lifetime1Lifetime1;
        int var12Lifetime2Lifetime1;
        if (param0 >= 65536) {
          return;
        }
        if (field_L[param0]) {
          var2 = ti.field_k;
          var3 = ti.field_f;
          var4 = this.field_t[param0];
          var5 = this.field_M[param0];
          var6 = this.field_y[param0];
          var7 = field_N[var4];
          var8 = field_N[var5];
          var9 = field_N[var6];
          if (var7 < 50) {
            var10 = field_H[var4];
            var11 = field_V[var4];
            if (var9 >= 50) {
              var12 = (50 - var7) * ti.field_i[var9 - var7];
              this.b(var2 + (var10 + ((field_H[var6] - var10) * var12 >> 16) << 9) / 50, var3 + (var11 + ((field_V[var6] - var11) * var12 >> 16) << 9) / 50);
            }
            if (var8 >= 50) {
              var12Lifetime3 = (50 - var7) * ti.field_i[var8 - var7];
              this.b(var2 + (var10 + ((field_H[var5] - var10) * var12Lifetime3 >> 16) << 9) / 50, var3 + (var11 + ((field_V[var5] - var11) * var12Lifetime3 >> 16) << 9) / 50);
            }
          }
          if (var8 < 50) {
            var10Lifetime1 = field_H[var5];
            var11Lifetime1 = field_V[var5];
            if (var7 >= 50) {
              var12Lifetime1 = (50 - var8) * ti.field_i[var7 - var8];
              this.b(var2 + (var10Lifetime1 + ((field_H[var4] - var10Lifetime1) * var12Lifetime1 >> 16) << 9) / 50, var3 + (var11Lifetime1 + ((field_V[var4] - var11Lifetime1) * var12Lifetime1 >> 16) << 9) / 50);
            }
            if (var9 >= 50) {
              var12Lifetime1Lifetime1 = (50 - var8) * ti.field_i[var9 - var8];
              this.b(var2 + (var10Lifetime1 + ((field_H[var6] - var10Lifetime1) * var12Lifetime1Lifetime1 >> 16) << 9) / 50, var3 + (var11Lifetime1 + ((field_V[var6] - var11Lifetime1) * var12Lifetime1Lifetime1 >> 16) << 9) / 50);
            }
          }
          if (var9 < 50) {
            var10Lifetime2 = field_H[var6];
            var11Lifetime2 = field_V[var6];
            if (var8 >= 50) {
              var12Lifetime2 = (50 - var9) * ti.field_i[var8 - var9];
              this.b(var2 + (var10Lifetime2 + ((field_H[var5] - var10Lifetime2) * var12Lifetime2 >> 16) << 9) / 50, var3 + (var11Lifetime2 + ((field_V[var5] - var11Lifetime2) * var12Lifetime2 >> 16) << 9) / 50);
            }
            if (var7 >= 50) {
              var12Lifetime2Lifetime1 = (50 - var9) * ti.field_i[var7 - var9];
              this.b(var2 + (var10Lifetime2 + ((field_H[var4] - var10Lifetime2) * var12Lifetime2Lifetime1 >> 16) << 9) / 50, var3 + (var11Lifetime2 + ((field_V[var4] - var11Lifetime2) * var12Lifetime2Lifetime1 >> 16) << 9) / 50);
            }
          }
          return;
        }
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

    private sk() {
        this.field_E = 0;
        this.field_S = 0;
        this.field_r = 0;
        this.field_s = false;
        this.field_m = 0;
    }

    sk(od param0, int param1, int param2, int param3, int param4, int param5) {
        int dupTemp$1 = 0;
        int incrementValue$0 = 0;
        int var7;
        int var8;
        int var9;
        int[] var9_ref_int__;
        int var10;
        int var11;
        int var12;
        oh var13;
        int var14;
        int var15;
        int var16;
        int[] var17;
        ea var18;
        ea var19;
        int[] var20;
        int var9Lifetime1;
        int var10Lifetime1;
        int var10Lifetime2;
        int var11Lifetime1;
        int var11Lifetime2;
        int var10Lifetime1Lifetime1;
        int var10Lifetime1Lifetime2;
        this.field_E = 0;
        this.field_S = 0;
        this.field_r = 0;
        this.field_s = false;
        this.field_m = 0;
        param0.d();
        param0.b();
        this.field_S = param0.field_j;
        this.field_m = param0.field_R;
        this.field_W = param0.field_v;
        this.field_C = param0.field_s;
        this.field_B = param0.field_h;
        this.field_E = param0.field_t;
        this.field_t = param0.field_S;
        this.field_M = param0.field_q;
        this.field_y = param0.field_i;
        this.field_Q = param0.field_G;
        this.field_p = param0.field_n;
        var7 = (int)Math.sqrt((double)(param3 * param3 + param4 * param4 + param5 * param5));
        var8 = param2 * var7 >> 8;
        this.field_i = new int[this.field_E];
        this.field_q = new int[this.field_E];
        this.field_l = new int[this.field_E];
        if (param0.field_p != null) {
          this.field_F = new short[this.field_E];
          for (var9 = 0; var9 < this.field_E; var9++) {
            var10 = param0.field_p[var9];
            if (var10 != -1 &&
              ti.field_b.a(var10, 1)) {
              this.field_F[var9] = (short)var10;
            } else {
              this.field_F[var9] = (short)-1;
            }
          }
        } else {
          this.field_F = null;
        }
        if (param0.field_Q > 0 &&
          param0.field_y != null) {
          var20 = new int[param0.field_Q];
          var17 = var20;
          var9_ref_int__ = var17;
          for (var10Lifetime1 = 0; var10Lifetime1 < this.field_E; var10Lifetime1++) {
            if (param0.field_y[var10Lifetime1] != -1) {
              dupTemp$1 = param0.field_y[var10Lifetime1] & 255;
              var9_ref_int__[dupTemp$1] = var9_ref_int__[dupTemp$1] + 1;
            }
          }
          this.field_r = 0;
          for (var10Lifetime1Lifetime1 = 0; var10Lifetime1Lifetime1 < param0.field_Q; var10Lifetime1Lifetime1++) {
            if (var20[var10Lifetime1Lifetime1] > 0 &&
              param0.field_z[var10Lifetime1Lifetime1] == 0) {
              this.field_r = this.field_r + 1;
            }
          }
          this.field_Y = new int[this.field_r];
          this.field_R = new int[this.field_r];
          this.field_x = new int[this.field_r];
          var10Lifetime1Lifetime2 = 0;
          for (var11 = 0; var11 < param0.field_Q; var11++) {
            if (var20[var11] > 0 &&
              param0.field_z[var11] == 0) {
              this.field_Y[var10Lifetime1Lifetime2] = param0.field_g[var11] & 65535;
              this.field_R[var10Lifetime1Lifetime2] = param0.field_U[var11] & 65535;
              this.field_x[var10Lifetime1Lifetime2] = param0.field_T[var11] & 65535;
              incrementValue$0 = var10Lifetime1Lifetime2;
              var10Lifetime1Lifetime2++;
              var9_ref_int__[var11] = incrementValue$0;
            } else {
              var20[var11] = -1;
            }
          }
          this.field_db = new byte[this.field_E];
          for (var11Lifetime2 = 0; var11Lifetime2 < this.field_E; var11Lifetime2++) {
            if (param0.field_y[var11Lifetime2] == -1) {
              this.field_db[var11Lifetime2] = (byte)-1;
            } else {
              this.field_db[var11Lifetime2] = (byte)var9_ref_int__[param0.field_y[var11Lifetime2] & 255];
              if (this.field_db[var11Lifetime2] == -1 &&
                this.field_F != null) {
                this.field_F[var11Lifetime2] = (short)-1;
              }
            }
          }
        }
        var16 = 0;
        var9Lifetime1 = var16;
        while (var16 < this.field_E) {
          if (param0.field_C != null) {
            var10Lifetime2 = param0.field_C[var16];
          } else {
            var10Lifetime2 = 0;
          }
          if (param0.field_n != null) {
            var11Lifetime1 = param0.field_n[var16];
          } else {
            var11Lifetime1 = 0;
          }
          if (this.field_F != null) {
            var12 = this.field_F[var16];
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
                this.field_l[var16] = -2;
              } else {
                var19 = param0.field_u[var16];
                var14 = param1 + (param3 * var19.field_d + param4 * var19.field_c + param5 * var19.field_b) / (var8 + var8 / 2);
                this.field_i[var16] = sk.d(var14);
                this.field_l[var16] = -1;
              }
            } else {
              if (param0.field_r != null &&
                param0.field_r[this.field_t[var16]] != null) {
                var13 = param0.field_r[this.field_t[var16]];
              } else {
                var13 = param0.field_I[this.field_t[var16]];
              }
              var14 = param1 + (param3 * var13.field_b + param4 * var13.field_c + param5 * var13.field_f) / (var8 * var13.field_g);
              this.field_i[var16] = sk.d(var14);
              if (param0.field_r != null &&
                param0.field_r[this.field_M[var16]] != null) {
                var13 = param0.field_r[this.field_M[var16]];
              } else {
                var13 = param0.field_I[this.field_M[var16]];
              }
              var14 = param1 + (param3 * var13.field_b + param4 * var13.field_c + param5 * var13.field_f) / (var8 * var13.field_g);
              this.field_q[var16] = sk.d(var14);
              if (param0.field_r != null &&
                param0.field_r[this.field_y[var16]] != null) {
                var13 = param0.field_r[this.field_y[var16]];
              } else {
                var13 = param0.field_I[this.field_y[var16]];
              }
              var14 = param1 + (param3 * var13.field_b + param4 * var13.field_c + param5 * var13.field_f) / (var8 * var13.field_g);
              this.field_l[var16] = sk.d(var14);
            }
          } else {
            if (var10Lifetime2 != 0) {
              if (var10Lifetime2 != 1) {
                if (var10Lifetime2 != 3) {
                  this.field_l[var16] = -2;
                } else {
                  this.field_i[var16] = 128;
                  this.field_l[var16] = -1;
                }
              } else {
                var18 = param0.field_u[var16];
                var14 = param1 + (param3 * var18.field_d + param4 * var18.field_c + param5 * var18.field_b) / (var8 + var8 / 2) << 17;
                this.field_i[var16] = var14 | sk.a(param0.field_M[var16] & 65535, var14 >> 17);
                this.field_l[var16] = -1;
              }
            } else {
              var15 = param0.field_M[var16] & 65535;
              if (param0.field_r != null &&
                param0.field_r[this.field_t[var16]] != null) {
                var13 = param0.field_r[this.field_t[var16]];
              } else {
                var13 = param0.field_I[this.field_t[var16]];
              }
              var14 = param1 + (param3 * var13.field_b + param4 * var13.field_c + param5 * var13.field_f) / (var8 * var13.field_g) << 17;
              this.field_i[var16] = var14 | sk.a(var15, var14 >> 17);
              if (param0.field_r != null &&
                param0.field_r[this.field_M[var16]] != null) {
                var13 = param0.field_r[this.field_M[var16]];
              } else {
                var13 = param0.field_I[this.field_M[var16]];
              }
              var14 = param1 + (param3 * var13.field_b + param4 * var13.field_c + param5 * var13.field_f) / (var8 * var13.field_g) << 17;
              this.field_q[var16] = var14 | sk.a(var15, var14 >> 17);
              if (param0.field_r != null &&
                param0.field_r[this.field_y[var16]] != null) {
                var13 = param0.field_r[this.field_y[var16]];
              } else {
                var13 = param0.field_I[this.field_y[var16]];
              }
              var14 = param1 + (param3 * var13.field_b + param4 * var13.field_c + param5 * var13.field_f) / (var8 * var13.field_g) << 17;
              this.field_l[var16] = var14 | sk.a(var15, var14 >> 17);
            }
          }
          var16++;
        }
    }

    static {
        sk discarded$0 = new sk();
        sk discarded$1 = new sk();
        sk discarded$2 = new sk();
        field_L = new boolean[4096];
        field_k = new int[10];
        field_fb = 0;
        field_w = new int[12][4096];
        field_v = new int[12];
        field_U = new int[4096];
        field_K = new int[4096];
        field_T = new int[12];
        field_eb = new int[4096];
        field_g = new int[4096];
        field_N = new int[4096];
        field_J = new int[4096];
        field_H = new int[4096];
        field_o = new int[10];
        field_ab = new int[10];
        field_X = false;
        if (field_X) {
          field_I = new int[4096];
          field_n = new int[4096];
        } else {
          field_cb = new int[1600];
          field_P = new int[1600][64];
          field_Z = new int[32];
          field_A = new int[32][512];
        }
        field_z = new boolean[4096];
        field_V = new int[4096];
    }
}
