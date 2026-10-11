/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ik extends m {
    private short field_v;
    private int[] field_R;
    private int[] field_q;
    int[] field_u;
    private byte[] field_w;
    private int[] field_B;
    private byte[] field_Q;
    private int[] field_t;
    private boolean field_o;
    private int[] field_I;
    private int[] field_F;
    private int[] field_j;
    private int field_V;
    private int[] field_d;
    private int[] field_C;
    short[] field_l;
    private int field_E;
    int[] field_h;
    private int field_b;
    int[] field_U;
    private int field_r;
    byte[] field_O;
    private static int[] field_g;
    private static int[] field_G;
    private static int[] field_x;
    private static int[] field_m;
    private static int[] field_n;
    private static int[] field_k;
    private static int[][] field_e;
    private static int[] field_P;
    private static boolean[] field_D;
    private static int[][] field_H;
    private static int[][] field_L;
    private static int[] field_N;
    private static int[] field_S;
    private static int[] field_s;
    private static int[] field_K;
    private static int[] field_p;
    private static boolean field_y;
    private static int[] field_z;
    private static int[] field_c;
    private static int[] field_J;
    private static boolean[] field_M;
    private static int[] field_T;
    private static int[] field_i;
    private static int field_f;

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

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, long param7) {
        int var10_int = 0;
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
        int var23Lifetime1;
        int var25Lifetime1;
        int var25Lifetime2;
        int var25Lifetime3;
        try {
          if (!this.field_o) {
            this.b();
          }
          var10_int = jb.field_m;
          var11 = jb.field_g;
          var12 = jb.field_j[param0];
          var13 = jb.field_k[param0];
          var14 = jb.field_j[param1];
          var15 = jb.field_k[param1];
          var16 = jb.field_j[param2];
          var17 = jb.field_k[param2];
          var18 = jb.field_j[param3];
          var19 = jb.field_k[param3];
          var20 = param5 * var18 + param6 * var19 >> 16;
          for (var21 = 0; var21 < this.field_r; var21++) {
            var22 = this.field_B[var21];
            var23 = this.field_F[var21];
            var24 = this.field_q[var21];
            if (param2 != 0) {
              var25 = var23 * var16 + var22 * var17 >> 16;
              var23 = var23 * var17 - var22 * var16 >> 16;
              var22 = var25;
            }
            if (param0 != 0) {
              var25Lifetime1 = var23 * var13 - var24 * var12 >> 16;
              var24 = var23 * var12 + var24 * var13 >> 16;
              var23 = var25Lifetime1;
            }
            if (param1 != 0) {
              var25Lifetime2 = var24 * var14 + var22 * var15 >> 16;
              var24 = var24 * var15 - var22 * var14 >> 16;
              var22 = var25Lifetime2;
            }
            var22 = var22 + param4;
            var23 = var23 + param5;
            var24 = var24 + param6;
            var25Lifetime3 = var23 * var19 - var24 * var18 >> 16;
            var24 = var23 * var18 + var24 * var19 >> 16;
            var23Lifetime1 = var25Lifetime3;
            field_z[var21] = var24 - var20;
            field_G[var21] = var10_int + (var22 << 9) / var24;
            field_k[var21] = var11 + (var23Lifetime1 << 9) / var24;
            if (this.field_E > 0) {
              field_J[var21] = var22;
              field_s[var21] = var23Lifetime1;
              field_i[var21] = var24;
            }
          }
          this.a(false, param7 >= 0L ? true : false, param7, (int) this.field_v, this.field_v << 1);
        } catch (RuntimeException runtimeException) {
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this.a(param0, param1, param2, param3, param4, param5, param6, -1L);
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

    private final void b(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        if (field_D[param0]) {
          this.c(param0);
          return;
        }
        var2 = this.field_j[param0];
        var3 = this.field_R[param0];
        var4 = this.field_d[param0];
        jb.field_n = field_M[param0];
        if (this.field_w != null) {
          jb.field_d = this.field_w[param0] & 255;
        } else {
          jb.field_d = 0;
        }
        if (this.field_l != null &&
          this.field_l[param0] != -1) {
          if (this.field_O != null &&
            this.field_O[param0] != -1) {
            var8 = this.field_O[param0] & 255;
            var5 = this.field_h[var8];
            var6 = this.field_u[var8];
            var7 = this.field_U[var8];
          } else {
            var5 = var2;
            var6 = var3;
            var7 = var4;
          }
          if (this.field_I[param0] != -1) {
            jb.a(field_k[var2], field_k[var3], field_k[var4], field_G[var2], field_G[var3], field_G[var4], this.field_t[param0], this.field_C[param0], this.field_I[param0], field_J[var5], field_J[var6], field_J[var7], field_s[var5], field_s[var6], field_s[var7], field_i[var5], field_i[var6], field_i[var7], (int) this.field_l[param0]);
          } else {
            jb.a(field_k[var2], field_k[var3], field_k[var4], field_G[var2], field_G[var3], field_G[var4], this.field_t[param0], this.field_t[param0], this.field_t[param0], field_J[var5], field_J[var6], field_J[var7], field_s[var5], field_s[var6], field_s[var7], field_i[var5], field_i[var6], field_i[var7], (int) this.field_l[param0]);
          }
        } else {
          if (this.field_I[param0] != -1) {
            jb.a(field_k[var2], field_k[var3], field_k[var4], field_G[var2], field_G[var3], field_G[var4], this.field_t[param0] & 65535, this.field_C[param0] & 65535, this.field_I[param0] & 65535);
          } else {
            jb.a(field_k[var2], field_k[var3], field_k[var4], field_G[var2], field_G[var3], field_G[var4], jb.field_p[this.field_t[param0] & 65535]);
          }
        }
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
        var2 = jb.field_m;
        var3 = jb.field_g;
        var4 = 0;
        var5 = this.field_j[param0];
        var6 = this.field_R[param0];
        var7 = this.field_d[param0];
        var8 = field_i[var5];
        var9 = field_i[var6];
        var10 = field_i[var7];
        if (this.field_w != null) {
          jb.field_d = this.field_w[param0] & 255;
        } else {
          jb.field_d = 0;
        }
        if (var8 < 50) {
          var11 = field_J[var5];
          var12 = field_s[var5];
          var13 = this.field_t[param0] & 65535;
          if (var10 >= 50) {
            var14 = (50 - var8) * jb.field_a[var10 - var8];
            field_N[var4] = var2 + (var11 + ((field_J[var7] - var11) * var14 >> 16) << 9) / 50;
            field_p[var4] = var3 + (var12 + ((field_s[var7] - var12) * var14 >> 16) << 9) / 50;
            incrementValue$0 = var4;
            var4++;
            field_g[incrementValue$0] = var13 + (((this.field_I[param0] & 65535) - var13) * var14 >> 16);
          }
          if (var9 >= 50) {
            var14Lifetime4 = (50 - var8) * jb.field_a[var9 - var8];
            field_N[var4] = var2 + (var11 + ((field_J[var6] - var11) * var14Lifetime4 >> 16) << 9) / 50;
            field_p[var4] = var3 + (var12 + ((field_s[var6] - var12) * var14Lifetime4 >> 16) << 9) / 50;
            incrementValue$1 = var4;
            var4++;
            field_g[incrementValue$1] = var13 + (((this.field_C[param0] & 65535) - var13) * var14Lifetime4 >> 16);
          }
        } else {
          field_N[var4] = field_G[var5];
          field_p[var4] = field_k[var5];
          incrementValue$2 = var4;
          var4++;
          field_g[incrementValue$2] = this.field_t[param0] & 65535;
        }
        if (var9 < 50) {
          var11Lifetime1 = field_J[var6];
          var12Lifetime1 = field_s[var6];
          var13Lifetime1 = this.field_C[param0] & 65535;
          if (var8 >= 50) {
            var14Lifetime1 = (50 - var9) * jb.field_a[var8 - var9];
            field_N[var4] = var2 + (var11Lifetime1 + ((field_J[var5] - var11Lifetime1) * var14Lifetime1 >> 16) << 9) / 50;
            field_p[var4] = var3 + (var12Lifetime1 + ((field_s[var5] - var12Lifetime1) * var14Lifetime1 >> 16) << 9) / 50;
            incrementValue$3 = var4;
            var4++;
            field_g[incrementValue$3] = var13Lifetime1 + (((this.field_t[param0] & 65535) - var13Lifetime1) * var14Lifetime1 >> 16);
          }
          if (var10 >= 50) {
            var14Lifetime1Lifetime1 = (50 - var9) * jb.field_a[var10 - var9];
            field_N[var4] = var2 + (var11Lifetime1 + ((field_J[var7] - var11Lifetime1) * var14Lifetime1Lifetime1 >> 16) << 9) / 50;
            field_p[var4] = var3 + (var12Lifetime1 + ((field_s[var7] - var12Lifetime1) * var14Lifetime1Lifetime1 >> 16) << 9) / 50;
            incrementValue$4 = var4;
            var4++;
            field_g[incrementValue$4] = var13Lifetime1 + (((this.field_I[param0] & 65535) - var13Lifetime1) * var14Lifetime1Lifetime1 >> 16);
          }
        } else {
          field_N[var4] = field_G[var6];
          field_p[var4] = field_k[var6];
          incrementValue$5 = var4;
          var4++;
          field_g[incrementValue$5] = this.field_C[param0] & 65535;
        }
        if (var10 < 50) {
          var11Lifetime2 = field_J[var7];
          var12Lifetime2 = field_s[var7];
          var13Lifetime2 = this.field_I[param0] & 65535;
          if (var9 >= 50) {
            var14Lifetime2 = (50 - var10) * jb.field_a[var9 - var10];
            field_N[var4] = var2 + (var11Lifetime2 + ((field_J[var6] - var11Lifetime2) * var14Lifetime2 >> 16) << 9) / 50;
            field_p[var4] = var3 + (var12Lifetime2 + ((field_s[var6] - var12Lifetime2) * var14Lifetime2 >> 16) << 9) / 50;
            incrementValue$6 = var4;
            var4++;
            field_g[incrementValue$6] = var13Lifetime2 + (((this.field_C[param0] & 65535) - var13Lifetime2) * var14Lifetime2 >> 16);
          }
          if (var8 >= 50) {
            var14Lifetime2Lifetime1 = (50 - var10) * jb.field_a[var8 - var10];
            field_N[var4] = var2 + (var11Lifetime2 + ((field_J[var5] - var11Lifetime2) * var14Lifetime2Lifetime1 >> 16) << 9) / 50;
            field_p[var4] = var3 + (var12Lifetime2 + ((field_s[var5] - var12Lifetime2) * var14Lifetime2Lifetime1 >> 16) << 9) / 50;
            incrementValue$7 = var4;
            var4++;
            field_g[incrementValue$7] = var13Lifetime2 + (((this.field_t[param0] & 65535) - var13Lifetime2) * var14Lifetime2Lifetime1 >> 16);
          }
        } else {
          field_N[var4] = field_G[var7];
          field_p[var4] = field_k[var7];
          incrementValue$8 = var4;
          var4++;
          field_g[incrementValue$8] = this.field_I[param0] & 65535;
        }
        boolean decompiledFrameRemainder0 = true;
        var11Lifetime3 = field_N[0];
        var12Lifetime3 = field_N[1];
        var13Lifetime3 = field_N[2];
        var14Lifetime3 = field_p[0];
        var15 = field_p[1];
        var16 = field_p[2];
        jb.field_n = false;
        if (var4 == 3) {
          if (var11Lifetime3 < 0 ||
            var12Lifetime3 < 0 ||
            var13Lifetime3 < 0 ||
            !(var11Lifetime3 <= jb.field_i) ||
            !(var12Lifetime3 <= jb.field_i) ||
            !(var13Lifetime3 <= jb.field_i)) {
            jb.field_n = true;
          }
          if (this.field_l != null &&
            this.field_l[param0] != -1) {
            if (this.field_O != null &&
              this.field_O[param0] != -1) {
              var20 = this.field_O[param0] & 255;
              var17 = this.field_h[var20];
              var18 = this.field_u[var20];
              var19 = this.field_U[var20];
            } else {
              var17 = var5;
              var18 = var6;
              var19 = var7;
            }
            if (this.field_I[param0] != -1) {
              jb.a(var14Lifetime3, var15, var16, var11Lifetime3, var12Lifetime3, var13Lifetime3, field_g[0], field_g[1], field_g[2], field_J[var17], field_J[var18], field_J[var19], field_s[var17], field_s[var18], field_s[var19], field_i[var17], field_i[var18], field_i[var19], (int) this.field_l[param0]);
            } else {
              jb.a(var14Lifetime3, var15, var16, var11Lifetime3, var12Lifetime3, var13Lifetime3, this.field_t[param0], this.field_t[param0], this.field_t[param0], field_J[var17], field_J[var18], field_J[var19], field_s[var17], field_s[var18], field_s[var19], field_i[var17], field_i[var18], field_i[var19], (int) this.field_l[param0]);
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (this.field_I[param0] != -1) {
              jb.a(var14Lifetime3, var15, var16, var11Lifetime3, var12Lifetime3, var13Lifetime3, field_g[0], field_g[1], field_g[2]);
            } else {
              jb.a(var14Lifetime3, var15, var16, var11Lifetime3, var12Lifetime3, var13Lifetime3, jb.field_p[this.field_t[param0] & 65535]);
            }
          }
        }
        if (var4 != 4) {
          return;
        }
        if (var11Lifetime3 < 0 ||
          var12Lifetime3 < 0 ||
          var13Lifetime3 < 0 ||
          !(var11Lifetime3 <= jb.field_i) ||
          !(var12Lifetime3 <= jb.field_i) ||
          !(var13Lifetime3 <= jb.field_i) ||
          !(field_N[3] >= 0) ||
          !(field_N[3] <= jb.field_i)) {
          jb.field_n = true;
        }
        if (this.field_l != null &&
          this.field_l[param0] != -1) {
          if (this.field_O != null &&
            this.field_O[param0] != -1) {
            var20Lifetime1 = this.field_O[param0] & 255;
            var17Lifetime1 = this.field_h[var20Lifetime1];
            var18Lifetime1 = this.field_u[var20Lifetime1];
            var19Lifetime1 = this.field_U[var20Lifetime1];
          } else {
            var17Lifetime1 = var5;
            var18Lifetime1 = var6;
            var19Lifetime1 = var7;
          }
          var20Lifetime1Lifetime1 = this.field_l[param0];
          if (this.field_I[param0] != -1) {
            jb.a(var14Lifetime3, var15, var16, var11Lifetime3, var12Lifetime3, var13Lifetime3, field_g[0], field_g[1], field_g[2], field_J[var17Lifetime1], field_J[var18Lifetime1], field_J[var19Lifetime1], field_s[var17Lifetime1], field_s[var18Lifetime1], field_s[var19Lifetime1], field_i[var17Lifetime1], field_i[var18Lifetime1], field_i[var19Lifetime1], var20Lifetime1Lifetime1);
            jb.a(var14Lifetime3, var16, field_p[3], var11Lifetime3, var13Lifetime3, field_N[3], field_g[0], field_g[2], field_g[3], field_J[var17Lifetime1], field_J[var18Lifetime1], field_J[var19Lifetime1], field_s[var17Lifetime1], field_s[var18Lifetime1], field_s[var19Lifetime1], field_i[var17Lifetime1], field_i[var18Lifetime1], field_i[var19Lifetime1], var20Lifetime1Lifetime1);
          } else {
            jb.a(var14Lifetime3, var15, var16, var11Lifetime3, var12Lifetime3, var13Lifetime3, this.field_t[param0], this.field_t[param0], this.field_t[param0], field_J[var17Lifetime1], field_J[var18Lifetime1], field_J[var19Lifetime1], field_s[var17Lifetime1], field_s[var18Lifetime1], field_s[var19Lifetime1], field_i[var17Lifetime1], field_i[var18Lifetime1], field_i[var19Lifetime1], var20Lifetime1Lifetime1);
            jb.a(var14Lifetime3, var16, field_p[3], var11Lifetime3, var13Lifetime3, field_N[3], this.field_t[param0], this.field_t[param0], this.field_t[param0], field_J[var17Lifetime1], field_J[var18Lifetime1], field_J[var19Lifetime1], field_s[var17Lifetime1], field_s[var18Lifetime1], field_s[var19Lifetime1], field_i[var17Lifetime1], field_i[var18Lifetime1], field_i[var19Lifetime1], var20Lifetime1Lifetime1);
          }
        } else {
          if (this.field_I[param0] != -1) {
            jb.a(var14Lifetime3, var15, var16, var11Lifetime3, var12Lifetime3, var13Lifetime3, field_g[0], field_g[1], field_g[2]);
            jb.a(var14Lifetime3, var16, field_p[3], var11Lifetime3, var13Lifetime3, field_N[3], field_g[0], field_g[2], field_g[3]);
          } else {
            var17Lifetime1 = jb.field_p[this.field_t[param0] & 65535];
            jb.a(var14Lifetime3, var15, var16, var11Lifetime3, var12Lifetime3, var13Lifetime3, var17Lifetime1);
            jb.a(var14Lifetime3, var16, field_p[3], var11Lifetime3, var13Lifetime3, field_N[3], var17Lifetime1);
          }
        }
    }

    public static void a() {
        field_M = null;
        field_D = null;
        field_G = null;
        field_k = null;
        field_z = null;
        field_J = null;
        field_s = null;
        field_i = null;
        field_n = null;
        field_e = (int[][]) null;
        field_T = null;
        field_L = (int[][]) null;
        field_S = null;
        field_c = null;
        field_x = null;
        field_H = (int[][]) null;
        field_K = null;
        field_P = null;
        field_m = null;
        field_N = null;
        field_p = null;
        field_g = null;
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
        int stackIn_90_0 = 0;
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
        if (!field_y) {
          for (var8 = 0; var8 < 1600; var8++) {
            field_n[var8] = 0;
          }
          for (var8Lifetime4 = 0; var8Lifetime4 < 32; var8Lifetime4++) {
            field_T[var8Lifetime4] = 0;
          }
          field_f = 0;
        }
        for (var8Lifetime1 = 0; var8Lifetime1 < this.field_b; var8Lifetime1++) {
          L45: {
            if (this.field_I[var8Lifetime1] != -2) {
              var9 = this.field_j[var8Lifetime1];
              var10 = this.field_R[var8Lifetime1];
              var11 = this.field_d[var8Lifetime1];
              var12 = field_G[var9];
              var13 = field_G[var10];
              var14_int = field_G[var11];
              if (param0 && (var12 == -5000 ||
                var13 == -5000 ||
                var14_int == -5000)) {
                var15_int = field_J[var9];
                var16 = field_J[var10];
                var17 = field_J[var11];
                var18 = field_s[var9];
                var19 = field_s[var10];
                var20 = field_s[var11];
                var21 = field_i[var9];
                var22 = field_i[var10];
                var23 = field_i[var11];
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
                  field_D[var8Lifetime1] = true;
                  if (field_y) {
                    field_S[var7] = (field_z[var9] + field_z[var10] + field_z[var11]) / 3;
                    incrementValue$12 = var7;
                    var7++;
                    field_c[incrementValue$12] = var8Lifetime1;
                  } else {
                    var27 = (field_z[var9] + field_z[var10] + field_z[var11]) / 3 + param3;
                    if (field_n[var27] < 64) {
                      dupTemp$10 = field_n[var27];
                      arrayValue$11 = field_e[var27];
                      field_n[var27] = dupTemp$10 + 1;
                      arrayValue$11[dupTemp$10] = var8Lifetime1;
                    } else {
                      var28 = field_n[var27];
                      if (var28 == 64) {
                        if (field_f == 512) {
                          break L45;
                        }
                        fieldTemp$7 = field_f;
                        field_f = field_f + 1;
                        var28 = 65 + fieldTemp$7;
                        field_n[var27] = 65 + fieldTemp$7;
                      }
                      var28 -= 65;
                      dupTemp$8 = field_T[var28];
                      arrayValue$9 = field_L[var28];
                      field_T[var28] = dupTemp$8 + 1;
                      arrayValue$9[dupTemp$8] = var8Lifetime1;
                    }
                  }
                }
                break L45;
              }
              if (param1 &&
                this.a(ll.field_d + jb.field_m, cc.field_a + jb.field_g, field_k[var9], field_k[var10], field_k[var11], var12, var13, var14_int)) {
                fieldTemp$13 = ra.field_c;
                ra.field_c = ra.field_c + 1;
                se.field_J[fieldTemp$13] = param2;
                param1 = false;
              }
              if ((var12 - var13) * (field_k[var11] - field_k[var10]) - (field_k[var9] - field_k[var10]) * (var14_int - var13) > 0) {
                field_D[var8Lifetime1] = false;
                if (var12 >= 0 &&
                  var13 >= 0 &&
                  var14_int >= 0 &&
                  var12 <= jb.field_i &&
                  var13 <= jb.field_i &&
                  var14_int <= jb.field_i) {
                  field_M[var8Lifetime1] = false;
                } else {
                  field_M[var8Lifetime1] = true;
                }
                if (!field_y) {
                  var15_intLifetime2 = (field_z[var9] + field_z[var10] + field_z[var11]) / 3 + param3;
                  if (field_n[var15_intLifetime2] >= 64) {
                    var16Lifetime2 = field_n[var15_intLifetime2];
                    if (var16Lifetime2 == 64) {
                      if (field_f == 512) {
                        break L45;
                      }
                      fieldTemp$14 = field_f;
                      field_f = field_f + 1;
                      var16Lifetime2 = 65 + fieldTemp$14;
                      field_n[var15_intLifetime2] = 65 + fieldTemp$14;
                    }
                    var16Lifetime2 -= 65;
                    dupTemp$15 = field_T[var16Lifetime2];
                    arrayValue$16 = field_L[var16Lifetime2];
                    field_T[var16Lifetime2] = dupTemp$15 + 1;
                    arrayValue$16[dupTemp$15] = var8Lifetime1;
                  } else {
                    dupTemp$17 = field_n[var15_intLifetime2];
                    arrayValue$18 = field_e[var15_intLifetime2];
                    field_n[var15_intLifetime2] = dupTemp$17 + 1;
                    arrayValue$18[dupTemp$17] = var8Lifetime1;
                  }
                } else {
                  field_S[var7] = (field_z[var9] + field_z[var10] + field_z[var11]) / 3;
                  incrementValue$19 = var7;
                  var7++;
                  field_c[incrementValue$19] = var8Lifetime1;
                }
              }
            }
          }
        }
        if (field_y) {
          nb.a((byte) -64, field_c, 0, field_S, var7 - 1);
          if (this.field_Q == null) {
            for (var8Lifetime2 = 0; var8Lifetime2 < var7; var8Lifetime2++) {
              this.b(field_c[var8Lifetime2]);
            }
            return;
          }
          for (var8Lifetime2 = 0; var8Lifetime2 < 12; var8Lifetime2++) {
            field_x[var8Lifetime2] = 0;
            field_m[var8Lifetime2] = 0;
          }
          for (var8Lifetime2 = 0; var8Lifetime2 < var7; var8Lifetime2++) {
            var9Lifetime1 = field_c[var8Lifetime2];
            var10Lifetime1 = field_S[var8Lifetime2];
            var11Lifetime1 = this.field_Q[var9Lifetime1];
            dupTemp$2 = field_x[var11Lifetime1];
            field_x[var11Lifetime1] = dupTemp$2 + 1;
            var12Lifetime1 = dupTemp$2;
            field_H[var11Lifetime1][var12Lifetime1] = var9Lifetime1;
            if (var11Lifetime1 >= 10) {
              if (var11Lifetime1 != 10) {
                field_P[var12Lifetime1] = var10Lifetime1;
              } else {
                field_K[var12Lifetime1] = var10Lifetime1;
              }
            } else {
              field_m[var11Lifetime1] = field_m[var11Lifetime1] + var10Lifetime1;
            }
          }
        } else {
          if (this.field_Q == null) {
            for (var8Lifetime2 = param4 - 1; var8Lifetime2 >= 0; var8Lifetime2--) {
              var9Lifetime1 = field_n[var8Lifetime2];
              if (var9Lifetime1 > 0) {
                stackIn_90_0 = (var9Lifetime1 <= 64) ? var9Lifetime1 : 64;
                var10Lifetime1 = stackIn_90_0;
                var45 = field_e[var8Lifetime2];
                for (var12Lifetime1 = 0; var12Lifetime1 < var10Lifetime1; var12Lifetime1++) {
                  this.b(var45[var12Lifetime1]);
                }
              }
              if (var9Lifetime1 > 64) {
                var10Lifetime1 = field_n[var8Lifetime2] - 64 - 1;
                var46 = field_L[var10Lifetime1];
                for (var12Lifetime1 = 0; var12Lifetime1 < field_T[var10Lifetime1]; var12Lifetime1++) {
                  this.b(var46[var12Lifetime1]);
                }
              }
            }
            return;
          }
          for (var8Lifetime2 = 0; var8Lifetime2 < 12; var8Lifetime2++) {
            field_x[var8Lifetime2] = 0;
            field_m[var8Lifetime2] = 0;
          }
          for (var8Lifetime2 = param4 - 1; var8Lifetime2 >= 0; var8Lifetime2--) {
            var9Lifetime1 = field_n[var8Lifetime2];
            if (var9Lifetime1 > 0) {
              if (var9Lifetime1 <= 64) {
                var10Lifetime1 = var9Lifetime1;
              } else {
                var10Lifetime1 = 64;
              }
              var47 = field_e[var8Lifetime2];
              for (var12Lifetime1 = 0; var12Lifetime1 < var10Lifetime1; var12Lifetime1++) {
                var13Lifetime1 = var47[var12Lifetime1];
                var14_intLifetime1 = this.field_Q[var13Lifetime1];
                dupTemp$0 = field_x[var14_intLifetime1];
                field_x[var14_intLifetime1] = dupTemp$0 + 1;
                var15_intLifetime1 = dupTemp$0;
                field_H[var14_intLifetime1][var15_intLifetime1] = var13Lifetime1;
                if (var14_intLifetime1 >= 10) {
                  if (var14_intLifetime1 != 10) {
                    field_P[var15_intLifetime1] = var8Lifetime2;
                  } else {
                    field_K[var15_intLifetime1] = var8Lifetime2;
                  }
                } else {
                  field_m[var14_intLifetime1] = field_m[var14_intLifetime1] + var8Lifetime2;
                }
              }
            }
            if (var9Lifetime1 > 64) {
              var10Lifetime1 = field_n[var8Lifetime2] - 64 - 1;
              var48 = field_L[var10Lifetime1];
              for (var12Lifetime1 = 0; var12Lifetime1 < field_T[var10Lifetime1]; var12Lifetime1++) {
                var13Lifetime1Lifetime1 = var48[var12Lifetime1];
                var14_intLifetime1Lifetime1 = this.field_Q[var13Lifetime1Lifetime1];
                dupTemp$1 = field_x[var14_intLifetime1Lifetime1];
                field_x[var14_intLifetime1Lifetime1] = dupTemp$1 + 1;
                var15_intLifetime1Lifetime1 = dupTemp$1;
                field_H[var14_intLifetime1Lifetime1][var15_intLifetime1Lifetime1] = var13Lifetime1Lifetime1;
                if (var14_intLifetime1Lifetime1 >= 10) {
                  if (var14_intLifetime1Lifetime1 != 10) {
                    field_P[var15_intLifetime1Lifetime1] = var8Lifetime2;
                  } else {
                    field_K[var15_intLifetime1Lifetime1] = var8Lifetime2;
                  }
                } else {
                  field_m[var14_intLifetime1Lifetime1] = field_m[var14_intLifetime1Lifetime1] + var8Lifetime2;
                }
              }
            }
          }
        }
        var8Lifetime3 = 0;
        if (!(field_x[1] <= 0) ||
          !(field_x[2] <= 0)) {
          var8Lifetime3 = (field_m[1] + field_m[2]) / (field_x[1] + field_x[2]);
        }
        var9Lifetime2 = 0;
        if (!(field_x[3] <= 0) ||
          !(field_x[4] <= 0)) {
          var9Lifetime2 = (field_m[3] + field_m[4]) / (field_x[3] + field_x[4]);
        }
        var10Lifetime2 = 0;
        if (!(field_x[6] <= 0) ||
          !(field_x[8] <= 0)) {
          var10Lifetime2 = (field_m[6] + field_m[8]) / (field_x[6] + field_x[8]);
        }
        var12Lifetime2 = 0;
        var13Lifetime2 = field_x[10];
        var14 = field_H[10];
        var15 = field_K;
        if (var12Lifetime2 == var13Lifetime2) {
          var12Lifetime2 = 0;
          var13Lifetime2 = field_x[11];
          var14 = field_H[11];
          var15 = field_P;
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
                var14 != field_H[11]) {
                var12Lifetime2 = 0;
                var13Lifetime2 = field_x[11];
                var14 = field_H[11];
                var15 = field_P;
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
                var14 != field_H[11]) {
                var12Lifetime2 = 0;
                var13Lifetime2 = field_x[11];
                var14 = field_H[11];
                var15 = field_P;
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
                var14 != field_H[11]) {
                var12Lifetime2 = 0;
                var13Lifetime2 = field_x[11];
                var14 = field_H[11];
                var15 = field_P;
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
          var17Lifetime1 = field_x[var16Lifetime1];
          var49 = field_H[var16Lifetime1];
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
            var14 != field_H[11]) {
            var12Lifetime2 = 0;
            var14 = field_H[11];
            var13Lifetime2 = field_x[11];
            var15 = field_P;
          }
          if (var12Lifetime2 >= var13Lifetime2) {
            var11Lifetime2 = -1000;
            continue;
          }
          var11Lifetime2 = var15[var12Lifetime2];
        }
        return;
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
        for (var9 = 0; var9 < this.field_V; var9++) {
          var10 = this.field_B[var9];
          var11 = this.field_F[var9];
          var12 = this.field_q[var9];
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
        this.field_v = (short)(int)(Math.sqrt((double)var8) + 0.99);
        this.field_o = true;
    }

    private ik() {
        this.field_o = false;
        this.field_V = 0;
        this.field_b = 0;
        this.field_E = 0;
        this.field_r = 0;
    }

    ik(bb param0, int param1, int param2, int param3, int param4, int param5) {
        int dupTemp$1 = 0;
        int incrementValue$0 = 0;
        int var7;
        int var8;
        int var9;
        int[] var9_ref_int__;
        int var10;
        int var11;
        int var12;
        dj var13;
        int var14;
        int var15;
        int var16;
        int[] var17;
        e var18;
        e var19;
        int[] var20;
        int var9Lifetime1;
        int var10Lifetime1;
        int var10Lifetime2;
        int var11Lifetime1;
        int var11Lifetime2;
        int var10Lifetime1Lifetime1;
        int var10Lifetime1Lifetime2;
        this.field_o = false;
        this.field_V = 0;
        this.field_b = 0;
        this.field_E = 0;
        this.field_r = 0;
        param0.b();
        param0.a();
        this.field_r = param0.field_r;
        this.field_V = param0.field_b;
        this.field_B = param0.field_w;
        this.field_F = param0.field_e;
        this.field_q = param0.field_u;
        this.field_b = param0.field_y;
        this.field_j = param0.field_h;
        this.field_R = param0.field_v;
        this.field_d = param0.field_q;
        this.field_Q = param0.field_p;
        this.field_w = param0.field_k;
        var7 = (int)Math.sqrt((double)(param3 * param3 + param4 * param4 + param5 * param5));
        var8 = param2 * var7 >> 8;
        this.field_t = new int[this.field_b];
        this.field_C = new int[this.field_b];
        this.field_I = new int[this.field_b];
        if (param0.field_i != null) {
          this.field_l = new short[this.field_b];
          for (var9 = 0; var9 < this.field_b; var9++) {
            var10 = param0.field_i[var9];
            if (var10 != -1 &&
              jb.field_b.a(var10, 3)) {
              this.field_l[var9] = (short)var10;
            } else {
              this.field_l[var9] = (short)-1;
            }
          }
        } else {
          this.field_l = null;
        }
        if (param0.field_f > 0 &&
          param0.field_c != null) {
          var20 = new int[param0.field_f];
          var17 = var20;
          var9_ref_int__ = var17;
          for (var10Lifetime1 = 0; var10Lifetime1 < this.field_b; var10Lifetime1++) {
            if (param0.field_c[var10Lifetime1] != -1) {
              dupTemp$1 = param0.field_c[var10Lifetime1] & 255;
              var9_ref_int__[dupTemp$1] = var9_ref_int__[dupTemp$1] + 1;
            }
          }
          this.field_E = 0;
          for (var10Lifetime1Lifetime1 = 0; var10Lifetime1Lifetime1 < param0.field_f; var10Lifetime1Lifetime1++) {
            if (var20[var10Lifetime1Lifetime1] > 0 &&
              param0.field_x[var10Lifetime1Lifetime1] == 0) {
              this.field_E = this.field_E + 1;
            }
          }
          this.field_h = new int[this.field_E];
          this.field_u = new int[this.field_E];
          this.field_U = new int[this.field_E];
          var10Lifetime1Lifetime2 = 0;
          for (var11 = 0; var11 < param0.field_f; var11++) {
            if (var20[var11] > 0 &&
              param0.field_x[var11] == 0) {
              this.field_h[var10Lifetime1Lifetime2] = param0.field_d[var11] & 65535;
              this.field_u[var10Lifetime1Lifetime2] = param0.field_B[var11] & 65535;
              this.field_U[var10Lifetime1Lifetime2] = param0.field_z[var11] & 65535;
              incrementValue$0 = var10Lifetime1Lifetime2;
              var10Lifetime1Lifetime2++;
              var9_ref_int__[var11] = incrementValue$0;
            } else {
              var20[var11] = -1;
            }
          }
          this.field_O = new byte[this.field_b];
          for (var11Lifetime2 = 0; var11Lifetime2 < this.field_b; var11Lifetime2++) {
            if (param0.field_c[var11Lifetime2] == -1) {
              this.field_O[var11Lifetime2] = (byte)-1;
            } else {
              this.field_O[var11Lifetime2] = (byte)var9_ref_int__[param0.field_c[var11Lifetime2] & 255];
              if (this.field_O[var11Lifetime2] == -1 &&
                this.field_l != null) {
                this.field_l[var11Lifetime2] = (short)-1;
              }
            }
          }
        }
        var16 = 0;
        var9Lifetime1 = var16;
        while (var16 < this.field_b) {
          if (param0.field_o != null) {
            var10Lifetime2 = param0.field_o[var16];
          } else {
            var10Lifetime2 = 0;
          }
          if (param0.field_k != null) {
            var11Lifetime1 = param0.field_k[var16];
          } else {
            var11Lifetime1 = 0;
          }
          if (this.field_l != null) {
            var12 = this.field_l[var16];
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
                this.field_I[var16] = -2;
              } else {
                var19 = param0.field_n[var16];
                var14 = param1 + (param3 * var19.field_g + param4 * var19.field_h + param5 * var19.field_d) / (var8 + var8 / 2);
                this.field_t[var16] = ik.d(var14);
                this.field_I[var16] = -1;
              }
            } else {
              if (param0.field_t != null &&
                param0.field_t[this.field_j[var16]] != null) {
                var13 = param0.field_t[this.field_j[var16]];
              } else {
                var13 = param0.field_j[this.field_j[var16]];
              }
              var14 = param1 + (param3 * var13.field_g + param4 * var13.field_b + param5 * var13.field_c) / (var8 * var13.field_d);
              this.field_t[var16] = ik.d(var14);
              if (param0.field_t != null &&
                param0.field_t[this.field_R[var16]] != null) {
                var13 = param0.field_t[this.field_R[var16]];
              } else {
                var13 = param0.field_j[this.field_R[var16]];
              }
              var14 = param1 + (param3 * var13.field_g + param4 * var13.field_b + param5 * var13.field_c) / (var8 * var13.field_d);
              this.field_C[var16] = ik.d(var14);
              if (param0.field_t != null &&
                param0.field_t[this.field_d[var16]] != null) {
                var13 = param0.field_t[this.field_d[var16]];
              } else {
                var13 = param0.field_j[this.field_d[var16]];
              }
              var14 = param1 + (param3 * var13.field_g + param4 * var13.field_b + param5 * var13.field_c) / (var8 * var13.field_d);
              this.field_I[var16] = ik.d(var14);
            }
          } else {
            if (var10Lifetime2 != 0) {
              if (var10Lifetime2 != 1) {
                if (var10Lifetime2 != 3) {
                  this.field_I[var16] = -2;
                } else {
                  this.field_t[var16] = 128;
                  this.field_I[var16] = -1;
                }
              } else {
                var18 = param0.field_n[var16];
                var14 = param1 + (param3 * var18.field_g + param4 * var18.field_h + param5 * var18.field_d) / (var8 + var8 / 2) << 17;
                this.field_t[var16] = var14 | ik.a(param0.field_l[var16] & 65535, var14 >> 17);
                this.field_I[var16] = -1;
              }
            } else {
              var15 = param0.field_l[var16] & 65535;
              if (param0.field_t != null &&
                param0.field_t[this.field_j[var16]] != null) {
                var13 = param0.field_t[this.field_j[var16]];
              } else {
                var13 = param0.field_j[this.field_j[var16]];
              }
              var14 = param1 + (param3 * var13.field_g + param4 * var13.field_b + param5 * var13.field_c) / (var8 * var13.field_d) << 17;
              this.field_t[var16] = var14 | ik.a(var15, var14 >> 17);
              if (param0.field_t != null &&
                param0.field_t[this.field_R[var16]] != null) {
                var13 = param0.field_t[this.field_R[var16]];
              } else {
                var13 = param0.field_j[this.field_R[var16]];
              }
              var14 = param1 + (param3 * var13.field_g + param4 * var13.field_b + param5 * var13.field_c) / (var8 * var13.field_d) << 17;
              this.field_C[var16] = var14 | ik.a(var15, var14 >> 17);
              if (param0.field_t != null &&
                param0.field_t[this.field_d[var16]] != null) {
                var13 = param0.field_t[this.field_d[var16]];
              } else {
                var13 = param0.field_j[this.field_d[var16]];
              }
              var14 = param1 + (param3 * var13.field_g + param4 * var13.field_b + param5 * var13.field_c) / (var8 * var13.field_d) << 17;
              this.field_I[var16] = var14 | ik.a(var15, var14 >> 17);
            }
          }
          var16++;
        }
    }

    static {
        ik discarded$0 = new ik();
        ik discarded$1 = new ik();
        ik discarded$2 = new ik();
        field_m = new int[12];
        field_g = new int[10];
        field_p = new int[10];
        field_k = new int[4096];
        field_K = new int[4096];
        field_x = new int[12];
        field_D = new boolean[4096];
        field_P = new int[4096];
        field_z = new int[4096];
        field_i = new int[4096];
        field_J = new int[4096];
        field_H = new int[12][4096];
        field_s = new int[4096];
        field_N = new int[10];
        field_y = false;
        field_G = new int[4096];
        field_f = 0;
        field_M = new boolean[4096];
        if (field_y) {
          field_S = new int[4096];
          field_c = new int[4096];
        } else {
          field_n = new int[1600];
          field_e = new int[1600][64];
          field_T = new int[32];
          field_L = new int[32][512];
        }
    }
}
