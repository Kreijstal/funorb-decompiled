/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ob extends fc {
    int[] field_V;
    int[] field_A;
    int field_ib;
    int[] field_kb;
    private short[] field_y;
    int[] field_k;
    int field_ob;
    int[] field_j;
    private short[] field_T;
    int field_E;
    int[] field_I;
    byte[] field_eb;
    private static ob field_o;
    short[] field_J;
    byte field_K;
    int[] field_M;
    private int[][] field_R;
    private boolean field_i;
    short[] field_r;
    private short field_m;
    int[] field_t;
    private boolean field_s;
    int field_nb;
    int[] field_gb;
    byte[] field_U;
    int[] field_hb;
    private static short[] field_h;
    byte[] field_u;
    private static byte[] field_cb;
    int[] field_Y;
    private static int[] field_n;
    private static int[] field_jb;
    private static int[] field_O;
    private int[][] field_B;
    int[] field_p;
    private static boolean field_Z;
    private static int[] field_x;
    private static int[] field_bb;
    private static int field_v;
    private static int[] field_C;
    private static int[] field_S;
    private static int[][] field_ab;
    private static int[] field_w;
    private static int[][] field_g;
    private static boolean[] field_Q;
    private static int[] field_q;
    private static int[] field_H;
    private static int field_fb;
    private static boolean[] field_l;
    private static int[][] field_f;
    private static int[] field_D;
    private static int[] field_z;
    private static boolean field_mb;
    private static int field_X;
    private static int[] field_W;
    private static int[] field_lb;
    private static int[] field_F;
    private static int field_N;
    private static int[] field_P;
    private static int[] field_db;
    private static int[] field_G;
    private static int[] field_pb;
    private static int[] field_L;

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
        if (!this.field_s) {
          this.e();
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
        if (var5 < 50 - this.field_m) {
          return;
        }
        var15Lifetime2 = this.field_m * 92682 >> 16;
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
        stackIn_15_0 = (var5 > 50 + this.field_m) ? 0 : 1;
        var16 = stackIn_15_0;
        if (var16 == 0) {
          stackIn_21_0 = (this.field_E > 0) ? 1 : 0;
        } else {
          stackIn_21_0 = 1;
        }
        var17Lifetime2 = stackIn_21_0;
        var18Lifetime1 = vn.field_a;
        var19Lifetime1 = vn.field_f;
        var20 = 0;
        var27 = 0;
        var21_intLifetime1 = var27;
        while (var27 < this.field_ib) {
          var22Lifetime1 = this.field_t[var27];
          var23Lifetime1 = this.field_V[var27];
          var24 = this.field_gb[var27];
          var25 = var22Lifetime1 * var6 + var23Lifetime1 * var9 + var24 * var12 >> 16;
          var26 = var22Lifetime1 * var7 + var23Lifetime1 * var10 + var24 * var13 >> 16;
          var24 = var22Lifetime1 * var8 + var23Lifetime1 * var11 + var24 * var14 >> 16;
          var22Lifetime1Lifetime1 = var25;
          var23Lifetime1Lifetime1 = var26;
          field_S[var27] = var24;
          var22Lifetime1Lifetime1 = var22Lifetime1Lifetime1 + var3;
          var23Lifetime1Lifetime1 = var23Lifetime1Lifetime1 + var4;
          var24 = var24 + var5;
          if (var24 < 50) {
            field_bb[var27] = -5000;
            var20 = 1;
          } else {
            field_bb[var27] = var18Lifetime1 + (var22Lifetime1Lifetime1 << 9) / var24;
            field_G[var27] = var19Lifetime1 + (var23Lifetime1Lifetime1 << 9) / var24;
          }
          if (var17Lifetime2 != 0) {
            field_F[var27] = var22Lifetime1Lifetime1;
            field_db[var27] = var23Lifetime1Lifetime1;
            field_q[var27] = var24;
          }
          var27++;
        }
        try {
          this.a((var20 & var16) != 0, false, 0L, (int) this.field_m, this.field_m << 1);
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var21 = (Exception) (Object) decompiledCaughtException;
        }
        return;
    }

    final boolean a() {
        if (this.field_B == null) {
          return false;
        }
        field_N = 0;
        field_v = 0;
        field_fb = 0;
        return true;
    }

    private final void d(int param0) {
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
        var2 = vn.field_a;
        var3 = vn.field_f;
        var4 = 0;
        var5 = this.field_kb[param0];
        var6 = this.field_A[param0];
        var7 = this.field_p[param0];
        var8 = field_q[var5];
        var9 = field_q[var6];
        var10 = field_q[var7];
        if (this.field_eb != null) {
          vn.field_i = this.field_eb[param0] & 255;
        } else {
          vn.field_i = 0;
        }
        if (var8 < 50) {
          var11 = field_F[var5];
          var12 = field_db[var5];
          var13 = this.field_hb[param0] & 65535;
          if (var10 >= 50) {
            var14 = (50 - var8) * vn.field_q[var10 - var8];
            field_L[var4] = var2 + (var11 + ((field_F[var7] - var11) * var14 >> 16) << 9) / 50;
            field_x[var4] = var3 + (var12 + ((field_db[var7] - var12) * var14 >> 16) << 9) / 50;
            incrementValue$0 = var4;
            var4++;
            field_w[incrementValue$0] = var13 + (((this.field_j[param0] & 65535) - var13) * var14 >> 16);
          }
          if (var9 >= 50) {
            var14Lifetime4 = (50 - var8) * vn.field_q[var9 - var8];
            field_L[var4] = var2 + (var11 + ((field_F[var6] - var11) * var14Lifetime4 >> 16) << 9) / 50;
            field_x[var4] = var3 + (var12 + ((field_db[var6] - var12) * var14Lifetime4 >> 16) << 9) / 50;
            incrementValue$1 = var4;
            var4++;
            field_w[incrementValue$1] = var13 + (((this.field_M[param0] & 65535) - var13) * var14Lifetime4 >> 16);
          }
        } else {
          field_L[var4] = field_bb[var5];
          field_x[var4] = field_G[var5];
          incrementValue$2 = var4;
          var4++;
          field_w[incrementValue$2] = this.field_hb[param0] & 65535;
        }
        if (var9 < 50) {
          var11Lifetime1 = field_F[var6];
          var12Lifetime1 = field_db[var6];
          var13Lifetime1 = this.field_M[param0] & 65535;
          if (var8 >= 50) {
            var14Lifetime1 = (50 - var9) * vn.field_q[var8 - var9];
            field_L[var4] = var2 + (var11Lifetime1 + ((field_F[var5] - var11Lifetime1) * var14Lifetime1 >> 16) << 9) / 50;
            field_x[var4] = var3 + (var12Lifetime1 + ((field_db[var5] - var12Lifetime1) * var14Lifetime1 >> 16) << 9) / 50;
            incrementValue$3 = var4;
            var4++;
            field_w[incrementValue$3] = var13Lifetime1 + (((this.field_hb[param0] & 65535) - var13Lifetime1) * var14Lifetime1 >> 16);
          }
          if (var10 >= 50) {
            var14Lifetime1Lifetime1 = (50 - var9) * vn.field_q[var10 - var9];
            field_L[var4] = var2 + (var11Lifetime1 + ((field_F[var7] - var11Lifetime1) * var14Lifetime1Lifetime1 >> 16) << 9) / 50;
            field_x[var4] = var3 + (var12Lifetime1 + ((field_db[var7] - var12Lifetime1) * var14Lifetime1Lifetime1 >> 16) << 9) / 50;
            incrementValue$4 = var4;
            var4++;
            field_w[incrementValue$4] = var13Lifetime1 + (((this.field_j[param0] & 65535) - var13Lifetime1) * var14Lifetime1Lifetime1 >> 16);
          }
        } else {
          field_L[var4] = field_bb[var6];
          field_x[var4] = field_G[var6];
          incrementValue$5 = var4;
          var4++;
          field_w[incrementValue$5] = this.field_M[param0] & 65535;
        }
        if (var10 < 50) {
          var11Lifetime2 = field_F[var7];
          var12Lifetime2 = field_db[var7];
          var13Lifetime2 = this.field_j[param0] & 65535;
          if (var9 >= 50) {
            var14Lifetime2 = (50 - var10) * vn.field_q[var9 - var10];
            field_L[var4] = var2 + (var11Lifetime2 + ((field_F[var6] - var11Lifetime2) * var14Lifetime2 >> 16) << 9) / 50;
            field_x[var4] = var3 + (var12Lifetime2 + ((field_db[var6] - var12Lifetime2) * var14Lifetime2 >> 16) << 9) / 50;
            incrementValue$6 = var4;
            var4++;
            field_w[incrementValue$6] = var13Lifetime2 + (((this.field_M[param0] & 65535) - var13Lifetime2) * var14Lifetime2 >> 16);
          }
          if (var8 >= 50) {
            var14Lifetime2Lifetime1 = (50 - var10) * vn.field_q[var8 - var10];
            field_L[var4] = var2 + (var11Lifetime2 + ((field_F[var5] - var11Lifetime2) * var14Lifetime2Lifetime1 >> 16) << 9) / 50;
            field_x[var4] = var3 + (var12Lifetime2 + ((field_db[var5] - var12Lifetime2) * var14Lifetime2Lifetime1 >> 16) << 9) / 50;
            incrementValue$7 = var4;
            var4++;
            field_w[incrementValue$7] = var13Lifetime2 + (((this.field_hb[param0] & 65535) - var13Lifetime2) * var14Lifetime2Lifetime1 >> 16);
          }
        } else {
          field_L[var4] = field_bb[var7];
          field_x[var4] = field_G[var7];
          incrementValue$8 = var4;
          var4++;
          field_w[incrementValue$8] = this.field_j[param0] & 65535;
        }
        boolean decompiledFrameRemainder0 = true;
        var11Lifetime3 = field_L[0];
        var12Lifetime3 = field_L[1];
        var13Lifetime3 = field_L[2];
        var14Lifetime3 = field_x[0];
        var15 = field_x[1];
        var16 = field_x[2];
        vn.field_e = false;
        if (var4 == 3) {
          if (var11Lifetime3 < 0 ||
            var12Lifetime3 < 0 ||
            var13Lifetime3 < 0 ||
            !(var11Lifetime3 <= vn.field_k) ||
            !(var12Lifetime3 <= vn.field_k) ||
            !(var13Lifetime3 <= vn.field_k)) {
            vn.field_e = true;
          }
          if (this.field_r != null &&
            this.field_r[param0] != -1) {
            if (this.field_u != null &&
              this.field_u[param0] != -1) {
              var20 = this.field_u[param0] & 255;
              var17 = this.field_k[var20];
              var18 = this.field_I[var20];
              var19 = this.field_Y[var20];
            } else {
              var17 = var5;
              var18 = var6;
              var19 = var7;
            }
            if (this.field_j[param0] != -1) {
              vn.a(var14Lifetime3, var15, var16, var11Lifetime3, var12Lifetime3, var13Lifetime3, field_w[0], field_w[1], field_w[2], field_F[var17], field_F[var18], field_F[var19], field_db[var17], field_db[var18], field_db[var19], field_q[var17], field_q[var18], field_q[var19], (int) this.field_r[param0]);
            } else {
              vn.a(var14Lifetime3, var15, var16, var11Lifetime3, var12Lifetime3, var13Lifetime3, this.field_hb[param0], this.field_hb[param0], this.field_hb[param0], field_F[var17], field_F[var18], field_F[var19], field_db[var17], field_db[var18], field_db[var19], field_q[var17], field_q[var18], field_q[var19], (int) this.field_r[param0]);
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (this.field_j[param0] != -1) {
              vn.a(var14Lifetime3, var15, var16, var11Lifetime3, var12Lifetime3, var13Lifetime3, field_w[0], field_w[1], field_w[2]);
            } else {
              vn.a(var14Lifetime3, var15, var16, var11Lifetime3, var12Lifetime3, var13Lifetime3, vn.field_m[this.field_hb[param0] & 65535]);
            }
          }
        }
        if (var4 != 4) {
          return;
        }
        if (var11Lifetime3 < 0 ||
          var12Lifetime3 < 0 ||
          var13Lifetime3 < 0 ||
          !(var11Lifetime3 <= vn.field_k) ||
          !(var12Lifetime3 <= vn.field_k) ||
          !(var13Lifetime3 <= vn.field_k) ||
          !(field_L[3] >= 0) ||
          !(field_L[3] <= vn.field_k)) {
          vn.field_e = true;
        }
        if (this.field_r != null &&
          this.field_r[param0] != -1) {
          if (this.field_u != null &&
            this.field_u[param0] != -1) {
            var20Lifetime1 = this.field_u[param0] & 255;
            var17Lifetime1 = this.field_k[var20Lifetime1];
            var18Lifetime1 = this.field_I[var20Lifetime1];
            var19Lifetime1 = this.field_Y[var20Lifetime1];
          } else {
            var17Lifetime1 = var5;
            var18Lifetime1 = var6;
            var19Lifetime1 = var7;
          }
          var20Lifetime1Lifetime1 = this.field_r[param0];
          if (this.field_j[param0] != -1) {
            vn.a(var14Lifetime3, var15, var16, var11Lifetime3, var12Lifetime3, var13Lifetime3, field_w[0], field_w[1], field_w[2], field_F[var17Lifetime1], field_F[var18Lifetime1], field_F[var19Lifetime1], field_db[var17Lifetime1], field_db[var18Lifetime1], field_db[var19Lifetime1], field_q[var17Lifetime1], field_q[var18Lifetime1], field_q[var19Lifetime1], var20Lifetime1Lifetime1);
            vn.a(var14Lifetime3, var16, field_x[3], var11Lifetime3, var13Lifetime3, field_L[3], field_w[0], field_w[2], field_w[3], field_F[var17Lifetime1], field_F[var18Lifetime1], field_F[var19Lifetime1], field_db[var17Lifetime1], field_db[var18Lifetime1], field_db[var19Lifetime1], field_q[var17Lifetime1], field_q[var18Lifetime1], field_q[var19Lifetime1], var20Lifetime1Lifetime1);
          } else {
            vn.a(var14Lifetime3, var15, var16, var11Lifetime3, var12Lifetime3, var13Lifetime3, this.field_hb[param0], this.field_hb[param0], this.field_hb[param0], field_F[var17Lifetime1], field_F[var18Lifetime1], field_F[var19Lifetime1], field_db[var17Lifetime1], field_db[var18Lifetime1], field_db[var19Lifetime1], field_q[var17Lifetime1], field_q[var18Lifetime1], field_q[var19Lifetime1], var20Lifetime1Lifetime1);
            vn.a(var14Lifetime3, var16, field_x[3], var11Lifetime3, var13Lifetime3, field_L[3], this.field_hb[param0], this.field_hb[param0], this.field_hb[param0], field_F[var17Lifetime1], field_F[var18Lifetime1], field_F[var19Lifetime1], field_db[var17Lifetime1], field_db[var18Lifetime1], field_db[var19Lifetime1], field_q[var17Lifetime1], field_q[var18Lifetime1], field_q[var19Lifetime1], var20Lifetime1Lifetime1);
          }
        } else {
          if (this.field_j[param0] != -1) {
            vn.a(var14Lifetime3, var15, var16, var11Lifetime3, var12Lifetime3, var13Lifetime3, field_w[0], field_w[1], field_w[2]);
            vn.a(var14Lifetime3, var16, field_x[3], var11Lifetime3, var13Lifetime3, field_L[3], field_w[0], field_w[2], field_w[3]);
          } else {
            var17Lifetime1 = vn.field_m[this.field_hb[param0] & 65535];
            vn.a(var14Lifetime3, var15, var16, var11Lifetime3, var12Lifetime3, var13Lifetime3, var17Lifetime1);
            vn.a(var14Lifetime3, var16, field_x[3], var11Lifetime3, var13Lifetime3, field_L[3], var17Lifetime1);
          }
        }
    }

    private final void c() {
        int var4 = 0;
        int var3;
        int stackIn_5_0 = 0;
        int var1;
        int var2;
        for (var4 = 0; var4 < this.field_ob; var4++) {
          if (this.field_r == null) {
            stackIn_5_0 = -1;
          } else {
            stackIn_5_0 = this.field_r[var4];
          }
          var3 = stackIn_5_0;
          if (var3 == -1) {
            var1 = this.field_J[var4] & 65535;
            if (this.field_j[var4] != -1) {
              if (this.field_j[var4] != -2) {
                var2 = this.field_hb[var4] & -131072;
                this.field_hb[var4] = var2 | ob.a(var1, var2 >> 17);
                var2 = this.field_M[var4] & -131072;
                this.field_M[var4] = var2 | ob.a(var1, var2 >> 17);
                var2 = this.field_j[var4] & -131072;
                this.field_j[var4] = var2 | ob.a(var1, var2 >> 17);
              }
            } else {
              var2 = this.field_hb[var4] & -131072;
              this.field_hb[var4] = var2 | ob.a(var1, var2 >> 17);
            }
          }
        }
    }

    private final fc a(boolean param0, boolean param1, ob param2, byte[] param3, short[] param4, int[] param5, int[] param6, int[] param7) {
        int var9;
        int var9Lifetime1;
        int var9Lifetime2;
        param2.field_ib = this.field_ib;
        param2.field_nb = this.field_nb;
        param2.field_ob = this.field_ob;
        param2.field_E = this.field_E;
        if (param2.field_t == null ||
          !(param2.field_t.length >= this.field_ib)) {
          param2.field_t = new int[this.field_ib + 100];
          param2.field_V = new int[this.field_ib + 100];
          param2.field_gb = new int[this.field_ib + 100];
        }
        for (var9 = 0; var9 < this.field_ib; var9++) {
          param2.field_t[var9] = this.field_t[var9];
          param2.field_V[var9] = this.field_V[var9];
          param2.field_gb[var9] = this.field_gb[var9];
        }
        if (!param0) {
          param2.field_eb = param3;
          if (this.field_eb != null) {
            for (var9Lifetime1 = 0; var9Lifetime1 < this.field_ob; var9Lifetime1++) {
              param2.field_eb[var9Lifetime1] = this.field_eb[var9Lifetime1];
            }
          } else {
            for (var9Lifetime1 = 0; var9Lifetime1 < this.field_ob; var9Lifetime1++) {
              param2.field_eb[var9Lifetime1] = (byte) 0;
            }
          }
        } else {
          param2.field_eb = this.field_eb;
        }
        if (!param1) {
          param2.field_J = param4;
          param2.field_hb = param5;
          param2.field_M = param6;
          param2.field_j = param7;
          for (var9Lifetime2 = 0; var9Lifetime2 < this.field_ob; var9Lifetime2++) {
            param2.field_J[var9Lifetime2] = this.field_J[var9Lifetime2];
            param2.field_hb[var9Lifetime2] = this.field_hb[var9Lifetime2];
            param2.field_M[var9Lifetime2] = this.field_M[var9Lifetime2];
            param2.field_j[var9Lifetime2] = this.field_j[var9Lifetime2];
          }
        } else {
          param2.field_J = this.field_J;
          param2.field_hb = this.field_hb;
          param2.field_M = this.field_M;
          param2.field_j = this.field_j;
        }
        param2.field_kb = this.field_kb;
        param2.field_A = this.field_A;
        param2.field_p = this.field_p;
        param2.field_U = this.field_U;
        param2.field_u = this.field_u;
        param2.field_r = this.field_r;
        param2.field_K = this.field_K;
        param2.field_k = this.field_k;
        param2.field_I = this.field_I;
        param2.field_Y = this.field_Y;
        param2.field_B = this.field_B;
        param2.field_R = this.field_R;
        param2.field_T = this.field_T;
        param2.field_y = this.field_y;
        param2.field_s = false;
        return (fc) ((Object) param2);
    }

    final void a(int[] param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        for (var2 = 0; var2 < this.field_ib; var2++) {
          var3 = this.field_t[var2];
          var4 = this.field_V[var2];
          var5 = this.field_gb[var2];
          this.field_t[var2] = param0[0] + (var3 * param0[3] + var4 * param0[6] + var5 * param0[9] >> 16);
          this.field_V[var2] = param0[1] + (var3 * param0[4] + var4 * param0[7] + var5 * param0[10] >> 16);
          this.field_gb[var2] = param0[2] + (var3 * param0[5] + var4 * param0[8] + var5 * param0[11] >> 16);
        }
        this.field_s = false;
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

    public static void d() {
        field_o = null;
        field_cb = null;
        field_h = null;
        field_O = null;
        field_n = null;
        field_jb = null;
        field_Q = null;
        field_l = null;
        field_bb = null;
        field_G = null;
        field_S = null;
        field_F = null;
        field_db = null;
        field_q = null;
        field_H = null;
        field_ab = (int[][]) null;
        field_P = null;
        field_f = (int[][]) null;
        field_pb = null;
        field_z = null;
        field_W = null;
        field_g = (int[][]) null;
        field_D = null;
        field_C = null;
        field_lb = null;
        field_L = null;
        field_x = null;
        field_w = null;
    }

    final fc a(boolean param0, boolean param1, boolean param2) {
        if (!param0 &&
          field_cb.length < this.field_ob) {
          field_cb = new byte[this.field_ob + 100];
        }
        if (!param1 &&
          field_h.length < this.field_ob) {
          field_O = new int[this.field_ob + 100];
          field_n = new int[this.field_ob + 100];
          field_jb = new int[this.field_ob + 100];
          field_h = new short[this.field_ob + 100];
        }
        return this.a(param0, param1, field_o, field_cb, field_h, field_O, field_n, field_jb);
    }

    private final void c(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        if (field_l[param0]) {
          this.d(param0);
          return;
        }
        var2 = this.field_kb[param0];
        var3 = this.field_A[param0];
        var4 = this.field_p[param0];
        vn.field_e = field_Q[param0];
        if (this.field_eb != null) {
          vn.field_i = this.field_eb[param0] & 255;
        } else {
          vn.field_i = 0;
        }
        if (this.field_r != null &&
          this.field_r[param0] != -1) {
          if (this.field_u != null &&
            this.field_u[param0] != -1) {
            var8 = this.field_u[param0] & 255;
            var5 = this.field_k[var8];
            var6 = this.field_I[var8];
            var7 = this.field_Y[var8];
          } else {
            var5 = var2;
            var6 = var3;
            var7 = var4;
          }
          if (this.field_j[param0] != -1) {
            vn.a(field_G[var2], field_G[var3], field_G[var4], field_bb[var2], field_bb[var3], field_bb[var4], this.field_hb[param0], this.field_M[param0], this.field_j[param0], field_F[var5], field_F[var6], field_F[var7], field_db[var5], field_db[var6], field_db[var7], field_q[var5], field_q[var6], field_q[var7], (int) this.field_r[param0]);
          } else {
            vn.a(field_G[var2], field_G[var3], field_G[var4], field_bb[var2], field_bb[var3], field_bb[var4], this.field_hb[param0], this.field_hb[param0], this.field_hb[param0], field_F[var5], field_F[var6], field_F[var7], field_db[var5], field_db[var6], field_db[var7], field_q[var5], field_q[var6], field_q[var7], (int) this.field_r[param0]);
          }
        } else {
          if (this.field_j[param0] != -1) {
            vn.a(field_G[var2], field_G[var3], field_G[var4], field_bb[var2], field_bb[var3], field_bb[var4], this.field_hb[param0] & 65535, this.field_M[param0] & 65535, this.field_j[param0] & 65535);
          } else {
            vn.a(field_G[var2], field_G[var3], field_G[var4], field_bb[var2], field_bb[var3], field_bb[var4], vn.field_m[this.field_hb[param0] & 65535]);
          }
        }
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
        if (!field_Z) {
          for (var8 = 0; var8 < 1600; var8++) {
            field_H[var8] = 0;
          }
          for (var8Lifetime4 = 0; var8Lifetime4 < 32; var8Lifetime4++) {
            field_P[var8Lifetime4] = 0;
          }
          field_X = 0;
        }
        for (var8Lifetime1 = 0; var8Lifetime1 < this.field_ob; var8Lifetime1++) {
          L45: {
            if (this.field_j[var8Lifetime1] != -2) {
              var9 = this.field_kb[var8Lifetime1];
              var10 = this.field_A[var8Lifetime1];
              var11 = this.field_p[var8Lifetime1];
              var12 = field_bb[var9];
              var13 = field_bb[var10];
              var14_int = field_bb[var11];
              if (param0 && (var12 == -5000 ||
                var13 == -5000 ||
                var14_int == -5000)) {
                var15_int = field_F[var9];
                var16 = field_F[var10];
                var17 = field_F[var11];
                var18 = field_db[var9];
                var19 = field_db[var10];
                var20 = field_db[var11];
                var21 = field_q[var9];
                var22 = field_q[var10];
                var23 = field_q[var11];
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
                  field_l[var8Lifetime1] = true;
                  if (field_Z) {
                    field_pb[var7] = (field_S[var9] + field_S[var10] + field_S[var11]) / 3;
                    incrementValue$12 = var7;
                    var7++;
                    field_z[incrementValue$12] = var8Lifetime1;
                  } else {
                    var27 = (field_S[var9] + field_S[var10] + field_S[var11]) / 3 + param3;
                    if (field_H[var27] < 64) {
                      dupTemp$10 = field_H[var27];
                      arrayValue$11 = field_ab[var27];
                      field_H[var27] = dupTemp$10 + 1;
                      arrayValue$11[dupTemp$10] = var8Lifetime1;
                    } else {
                      var28 = field_H[var27];
                      if (var28 == 64) {
                        if (field_X == 512) {
                          break L45;
                        }
                        fieldTemp$7 = field_X;
                        field_X = field_X + 1;
                        var28 = 65 + fieldTemp$7;
                        field_H[var27] = 65 + fieldTemp$7;
                      }
                      var28 -= 65;
                      dupTemp$8 = field_P[var28];
                      arrayValue$9 = field_f[var28];
                      field_P[var28] = dupTemp$8 + 1;
                      arrayValue$9[dupTemp$8] = var8Lifetime1;
                    }
                  }
                }
                break L45;
              }
              if (param1 &&
                this.a(bl.field_Mb + vn.field_a, li.field_b + vn.field_f, field_G[var9], field_G[var10], field_G[var11], var12, var13, var14_int)) {
                fieldTemp$13 = fd.field_I;
                fd.field_I = fd.field_I + 1;
                cb.field_r[fieldTemp$13] = param2;
                param1 = false;
              }
              if ((var12 - var13) * (field_G[var11] - field_G[var10]) - (field_G[var9] - field_G[var10]) * (var14_int - var13) > 0) {
                field_l[var8Lifetime1] = false;
                if (var12 >= 0 &&
                  var13 >= 0 &&
                  var14_int >= 0 &&
                  var12 <= vn.field_k &&
                  var13 <= vn.field_k &&
                  var14_int <= vn.field_k) {
                  field_Q[var8Lifetime1] = false;
                } else {
                  field_Q[var8Lifetime1] = true;
                }
                if (!field_Z) {
                  var15_intLifetime2 = (field_S[var9] + field_S[var10] + field_S[var11]) / 3 + param3;
                  if (field_H[var15_intLifetime2] >= 64) {
                    var16Lifetime2 = field_H[var15_intLifetime2];
                    if (var16Lifetime2 == 64) {
                      if (field_X == 512) {
                        break L45;
                      }
                      fieldTemp$14 = field_X;
                      field_X = field_X + 1;
                      var16Lifetime2 = 65 + fieldTemp$14;
                      field_H[var15_intLifetime2] = 65 + fieldTemp$14;
                    }
                    var16Lifetime2 -= 65;
                    dupTemp$15 = field_P[var16Lifetime2];
                    arrayValue$16 = field_f[var16Lifetime2];
                    field_P[var16Lifetime2] = dupTemp$15 + 1;
                    arrayValue$16[dupTemp$15] = var8Lifetime1;
                  } else {
                    dupTemp$17 = field_H[var15_intLifetime2];
                    arrayValue$18 = field_ab[var15_intLifetime2];
                    field_H[var15_intLifetime2] = dupTemp$17 + 1;
                    arrayValue$18[dupTemp$17] = var8Lifetime1;
                  }
                } else {
                  field_pb[var7] = (field_S[var9] + field_S[var10] + field_S[var11]) / 3;
                  incrementValue$19 = var7;
                  var7++;
                  field_z[incrementValue$19] = var8Lifetime1;
                }
              }
            }
          }
        }
        if (field_Z) {
          oj.a(0, field_z, (byte) -63, var7 - 1, field_pb);
          if (this.field_U == null) {
            for (var8Lifetime2 = 0; var8Lifetime2 < var7; var8Lifetime2++) {
              this.c(field_z[var8Lifetime2]);
            }
            return;
          }
          for (var8Lifetime2 = 0; var8Lifetime2 < 12; var8Lifetime2++) {
            field_W[var8Lifetime2] = 0;
            field_lb[var8Lifetime2] = 0;
          }
          for (var8Lifetime2 = 0; var8Lifetime2 < var7; var8Lifetime2++) {
            var9Lifetime1 = field_z[var8Lifetime2];
            var10Lifetime1 = field_pb[var8Lifetime2];
            var11Lifetime1 = this.field_U[var9Lifetime1];
            dupTemp$2 = field_W[var11Lifetime1];
            field_W[var11Lifetime1] = dupTemp$2 + 1;
            var12Lifetime1 = dupTemp$2;
            field_g[var11Lifetime1][var12Lifetime1] = var9Lifetime1;
            if (var11Lifetime1 >= 10) {
              if (var11Lifetime1 != 10) {
                field_C[var12Lifetime1] = var10Lifetime1;
              } else {
                field_D[var12Lifetime1] = var10Lifetime1;
              }
            } else {
              field_lb[var11Lifetime1] = field_lb[var11Lifetime1] + var10Lifetime1;
            }
          }
        } else {
          if (this.field_U == null) {
            for (var8Lifetime2 = param4 - 1; var8Lifetime2 >= 0; var8Lifetime2--) {
              var9Lifetime1 = field_H[var8Lifetime2];
              if (var9Lifetime1 > 0) {
                stackIn_88_0 = (var9Lifetime1 <= 64) ? var9Lifetime1 : 64;
                var10Lifetime1 = stackIn_88_0;
                var45 = field_ab[var8Lifetime2];
                for (var12Lifetime1 = 0; var12Lifetime1 < var10Lifetime1; var12Lifetime1++) {
                  this.c(var45[var12Lifetime1]);
                }
              }
              if (var9Lifetime1 > 64) {
                var10Lifetime1 = field_H[var8Lifetime2] - 64 - 1;
                var46 = field_f[var10Lifetime1];
                for (var12Lifetime1 = 0; var12Lifetime1 < field_P[var10Lifetime1]; var12Lifetime1++) {
                  this.c(var46[var12Lifetime1]);
                }
              }
            }
            return;
          }
          for (var8Lifetime2 = 0; var8Lifetime2 < 12; var8Lifetime2++) {
            field_W[var8Lifetime2] = 0;
            field_lb[var8Lifetime2] = 0;
          }
          for (var8Lifetime2 = param4 - 1; var8Lifetime2 >= 0; var8Lifetime2--) {
            var9Lifetime1 = field_H[var8Lifetime2];
            if (var9Lifetime1 > 0) {
              if (var9Lifetime1 <= 64) {
                var10Lifetime1 = var9Lifetime1;
              } else {
                var10Lifetime1 = 64;
              }
              var47 = field_ab[var8Lifetime2];
              for (var12Lifetime1 = 0; var12Lifetime1 < var10Lifetime1; var12Lifetime1++) {
                var13Lifetime1 = var47[var12Lifetime1];
                var14_intLifetime1 = this.field_U[var13Lifetime1];
                dupTemp$0 = field_W[var14_intLifetime1];
                field_W[var14_intLifetime1] = dupTemp$0 + 1;
                var15_intLifetime1 = dupTemp$0;
                field_g[var14_intLifetime1][var15_intLifetime1] = var13Lifetime1;
                if (var14_intLifetime1 >= 10) {
                  if (var14_intLifetime1 != 10) {
                    field_C[var15_intLifetime1] = var8Lifetime2;
                  } else {
                    field_D[var15_intLifetime1] = var8Lifetime2;
                  }
                } else {
                  field_lb[var14_intLifetime1] = field_lb[var14_intLifetime1] + var8Lifetime2;
                }
              }
            }
            if (var9Lifetime1 > 64) {
              var10Lifetime1 = field_H[var8Lifetime2] - 64 - 1;
              var48 = field_f[var10Lifetime1];
              for (var12Lifetime1 = 0; var12Lifetime1 < field_P[var10Lifetime1]; var12Lifetime1++) {
                var13Lifetime1Lifetime1 = var48[var12Lifetime1];
                var14_intLifetime1Lifetime1 = this.field_U[var13Lifetime1Lifetime1];
                dupTemp$1 = field_W[var14_intLifetime1Lifetime1];
                field_W[var14_intLifetime1Lifetime1] = dupTemp$1 + 1;
                var15_intLifetime1Lifetime1 = dupTemp$1;
                field_g[var14_intLifetime1Lifetime1][var15_intLifetime1Lifetime1] = var13Lifetime1Lifetime1;
                if (var14_intLifetime1Lifetime1 >= 10) {
                  if (var14_intLifetime1Lifetime1 != 10) {
                    field_C[var15_intLifetime1Lifetime1] = var8Lifetime2;
                  } else {
                    field_D[var15_intLifetime1Lifetime1] = var8Lifetime2;
                  }
                } else {
                  field_lb[var14_intLifetime1Lifetime1] = field_lb[var14_intLifetime1Lifetime1] + var8Lifetime2;
                }
              }
            }
          }
        }
        var8Lifetime3 = 0;
        if (!(field_W[1] <= 0) ||
          !(field_W[2] <= 0)) {
          var8Lifetime3 = (field_lb[1] + field_lb[2]) / (field_W[1] + field_W[2]);
        }
        var9Lifetime2 = 0;
        if (!(field_W[3] <= 0) ||
          !(field_W[4] <= 0)) {
          var9Lifetime2 = (field_lb[3] + field_lb[4]) / (field_W[3] + field_W[4]);
        }
        var10Lifetime2 = 0;
        if (!(field_W[6] <= 0) ||
          !(field_W[8] <= 0)) {
          var10Lifetime2 = (field_lb[6] + field_lb[8]) / (field_W[6] + field_W[8]);
        }
        var12Lifetime2 = 0;
        var13Lifetime2 = field_W[10];
        var14 = field_g[10];
        var15 = field_D;
        if (var12Lifetime2 == var13Lifetime2) {
          var12Lifetime2 = 0;
          var13Lifetime2 = field_W[11];
          var14 = field_g[11];
          var15 = field_C;
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
              this.c(var14[incrementValue$4]);
              if (var12Lifetime2 == var13Lifetime2 &&
                var14 != field_g[11]) {
                var12Lifetime2 = 0;
                var13Lifetime2 = field_W[11];
                var14 = field_g[11];
                var15 = field_C;
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
              this.c(var14[incrementValue$5]);
              if (var12Lifetime2 == var13Lifetime2 &&
                var14 != field_g[11]) {
                var12Lifetime2 = 0;
                var13Lifetime2 = field_W[11];
                var14 = field_g[11];
                var15 = field_C;
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
              this.c(var14[incrementValue$6]);
              if (var12Lifetime2 == var13Lifetime2 &&
                var14 != field_g[11]) {
                var12Lifetime2 = 0;
                var13Lifetime2 = field_W[11];
                var14 = field_g[11];
                var15 = field_C;
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
          var17Lifetime1 = field_W[var16Lifetime1];
          var49 = field_g[var16Lifetime1];
          var29 = 0;
          var19Lifetime1 = var29;
          while (var29 < var17Lifetime1) {
            this.c(var49[var29]);
            var29++;
          }
        }
        while (var11Lifetime2 != -1000) {
          incrementValue$3 = var12Lifetime2;
          var12Lifetime2++;
          this.c(var14[incrementValue$3]);
          if (var12Lifetime2 == var13Lifetime2 &&
            var14 != field_g[11]) {
            var12Lifetime2 = 0;
            var14 = field_g[11];
            var13Lifetime2 = field_W[11];
            var15 = field_C;
          }
          if (var12Lifetime2 >= var13Lifetime2) {
            var11Lifetime2 = -1000;
            continue;
          }
          var11Lifetime2 = var15[var12Lifetime2];
        }
        return;
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

    final void a(int param0, int[] param1, int param2, int param3, int param4, boolean param5) {
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
        int[] var35;
        int[] var36;
        int[] var37;
        int[] var38;
        int[] var39;
        int[] var40;
        int var8Lifetime1;
        int var8Lifetime2;
        int var8Lifetime3;
        int var8Lifetime4;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        int var9Lifetime4;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        int var12Lifetime4;
        int var13Lifetime1;
        int var13Lifetime2;
        int var14Lifetime1;
        int var15Lifetime1;
        int var14Lifetime2;
        int var14Lifetime3;
        int var15Lifetime2;
        int var15Lifetime3;
        int var13Lifetime1Lifetime1;
        int var13Lifetime1Lifetime2;
        var7 = param1.length;
        if (param0 == 0) {
          var8 = 0;
          field_N = 0;
          field_v = 0;
          field_fb = 0;
          for (var9 = 0; var9 < var7; var9++) {
            var10 = param1[var9];
            if (var10 < this.field_B.length) {
              var35 = this.field_B[var10];
              for (var12 = 0; var12 < var35.length; var12++) {
                var13 = var35[var12];
                field_N = field_N + this.field_t[var13];
                field_v = field_v + this.field_V[var13];
                field_fb = field_fb + this.field_gb[var13];
                var8++;
              }
            }
          }
          if (var8 <= 0) {
            field_N = param2;
            field_v = param3;
            field_fb = param4;
          } else {
            field_N = field_N / var8 + param2;
            field_v = field_v / var8 + param3;
            field_fb = field_fb / var8 + param4;
          }
          return;
        }
        if (param0 == 1) {
          for (var8Lifetime1 = 0; var8Lifetime1 < var7; var8Lifetime1++) {
            var9Lifetime1 = param1[var8Lifetime1];
            if (var9Lifetime1 < this.field_B.length) {
              var36 = this.field_B[var9Lifetime1];
              for (var11 = 0; var11 < var36.length; var11++) {
                var12Lifetime1 = var36[var11];
                this.field_t[var12Lifetime1] = this.field_t[var12Lifetime1] + param2;
                this.field_V[var12Lifetime1] = this.field_V[var12Lifetime1] + param3;
                this.field_gb[var12Lifetime1] = this.field_gb[var12Lifetime1] + param4;
              }
            }
          }
          return;
        }
        if (param0 == 2) {
          for (var8Lifetime2 = 0; var8Lifetime2 < var7; var8Lifetime2++) {
            var9Lifetime2 = param1[var8Lifetime2];
            if (var9Lifetime2 < this.field_B.length) {
              var37 = this.field_B[var9Lifetime2];
              for (var11Lifetime1 = 0; var11Lifetime1 < var37.length; var11Lifetime1++) {
                var12Lifetime2 = var37[var11Lifetime1];
                this.field_t[var12Lifetime2] = this.field_t[var12Lifetime2] - field_N;
                this.field_V[var12Lifetime2] = this.field_V[var12Lifetime2] - field_v;
                this.field_gb[var12Lifetime2] = this.field_gb[var12Lifetime2] - field_fb;
                if (param4 != 0) {
                  var13Lifetime1 = vn.field_g[param4];
                  var14 = vn.field_o[param4];
                  var15 = this.field_V[var12Lifetime2] * var13Lifetime1 + this.field_t[var12Lifetime2] * var14 + 32767 >> 16;
                  this.field_V[var12Lifetime2] = this.field_V[var12Lifetime2] * var14 - this.field_t[var12Lifetime2] * var13Lifetime1 + 32767 >> 16;
                  this.field_t[var12Lifetime2] = var15;
                }
                if (param2 != 0) {
                  var13Lifetime1Lifetime1 = vn.field_g[param2];
                  var14Lifetime2 = vn.field_o[param2];
                  var15Lifetime2 = this.field_V[var12Lifetime2] * var14Lifetime2 - this.field_gb[var12Lifetime2] * var13Lifetime1Lifetime1 + 32767 >> 16;
                  this.field_gb[var12Lifetime2] = this.field_V[var12Lifetime2] * var13Lifetime1Lifetime1 + this.field_gb[var12Lifetime2] * var14Lifetime2 + 32767 >> 16;
                  this.field_V[var12Lifetime2] = var15Lifetime2;
                }
                if (param3 != 0) {
                  var13Lifetime1Lifetime2 = vn.field_g[param3];
                  var14Lifetime3 = vn.field_o[param3];
                  var15Lifetime3 = this.field_gb[var12Lifetime2] * var13Lifetime1Lifetime2 + this.field_t[var12Lifetime2] * var14Lifetime3 + 32767 >> 16;
                  this.field_gb[var12Lifetime2] = this.field_gb[var12Lifetime2] * var14Lifetime3 - this.field_t[var12Lifetime2] * var13Lifetime1Lifetime2 + 32767 >> 16;
                  this.field_t[var12Lifetime2] = var15Lifetime3;
                }
                this.field_t[var12Lifetime2] = this.field_t[var12Lifetime2] + field_N;
                this.field_V[var12Lifetime2] = this.field_V[var12Lifetime2] + field_v;
                this.field_gb[var12Lifetime2] = this.field_gb[var12Lifetime2] + field_fb;
              }
            }
          }
          return;
        }
        if (param0 == 3) {
          for (var8Lifetime3 = 0; var8Lifetime3 < var7; var8Lifetime3++) {
            var9Lifetime3 = param1[var8Lifetime3];
            if (var9Lifetime3 < this.field_B.length) {
              var38 = this.field_B[var9Lifetime3];
              for (var11Lifetime2 = 0; var11Lifetime2 < var38.length; var11Lifetime2++) {
                var12Lifetime3 = var38[var11Lifetime2];
                this.field_t[var12Lifetime3] = this.field_t[var12Lifetime3] - field_N;
                this.field_V[var12Lifetime3] = this.field_V[var12Lifetime3] - field_v;
                this.field_gb[var12Lifetime3] = this.field_gb[var12Lifetime3] - field_fb;
                this.field_t[var12Lifetime3] = this.field_t[var12Lifetime3] * param2 / 128;
                this.field_V[var12Lifetime3] = this.field_V[var12Lifetime3] * param3 / 128;
                this.field_gb[var12Lifetime3] = this.field_gb[var12Lifetime3] * param4 / 128;
                this.field_t[var12Lifetime3] = this.field_t[var12Lifetime3] + field_N;
                this.field_V[var12Lifetime3] = this.field_V[var12Lifetime3] + field_v;
                this.field_gb[var12Lifetime3] = this.field_gb[var12Lifetime3] + field_fb;
              }
            }
          }
          return;
        }
        if (param0 != 5) {
          if (param0 != 7) {
            return;
          }
          if (this.field_R != null) {
            for (var8Lifetime4 = 0; var8Lifetime4 < var7; var8Lifetime4++) {
              var9Lifetime4 = param1[var8Lifetime4];
              if (var9Lifetime4 < this.field_R.length) {
                var40 = this.field_R[var9Lifetime4];
                for (var11Lifetime3 = 0; var11Lifetime3 < var40.length; var11Lifetime3++) {
                  var12Lifetime4 = var40[var11Lifetime3];
                  var13Lifetime2 = this.field_J[var12Lifetime4] & 65535;
                  var14Lifetime1 = var13Lifetime2 >> 10 & 63;
                  var15Lifetime1 = var13Lifetime2 >> 7 & 7;
                  var16 = var13Lifetime2 & 127;
                  var14Lifetime1 = var14Lifetime1 + param2 & 63;
                  var15Lifetime1 = var15Lifetime1 + param3;
                  if (var15Lifetime1 >= 0) {
                    if (var15Lifetime1 > 7) {
                      var15Lifetime1 = 7;
                    }
                  } else {
                    var15Lifetime1 = 0;
                  }
                  var16 = var16 + param4;
                  if (var16 >= 0) {
                    if (var16 > 127) {
                      var16 = 127;
                    }
                  } else {
                    var16 = 0;
                  }
                  this.field_J[var12Lifetime4] = (short)(var14Lifetime1 << 10 | var15Lifetime1 << 7 | var16);
                }
                this.field_i = true;
              }
            }
            return;
          }
        } else {
          if (this.field_R != null) {
            if (this.field_eb != null) {
              for (var8Lifetime4 = 0; var8Lifetime4 < var7; var8Lifetime4++) {
                var9Lifetime4 = param1[var8Lifetime4];
                if (var9Lifetime4 < this.field_R.length) {
                  var39 = this.field_R[var9Lifetime4];
                  for (var11Lifetime3 = 0; var11Lifetime3 < var39.length; var11Lifetime3++) {
                    var12Lifetime4 = var39[var11Lifetime3];
                    var13Lifetime2 = (this.field_eb[var12Lifetime4] & 255) + param2 * 8;
                    if (var13Lifetime2 >= 0) {
                      if (var13Lifetime2 > 255) {
                        var13Lifetime2 = 255;
                      }
                    } else {
                      var13Lifetime2 = 0;
                    }
                    this.field_eb[var12Lifetime4] = (byte)var13Lifetime2;
                  }
                }
              }
              return;
            }
            return;
          }
        }
    }

    private final static int e(int param0) {
        if (param0 < 2) {
          param0 = 2;
        } else {
          if (param0 > 126) {
            param0 = 126;
          }
        }
        return param0;
    }

    private final void e() {
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
        for (var9 = 0; var9 < this.field_nb; var9++) {
          var10 = this.field_t[var9];
          var11 = this.field_V[var9];
          var12 = this.field_gb[var9];
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
        this.field_m = (short)(int)(Math.sqrt((double)var8) + 0.99);
        this.field_s = true;
    }

    final void a(int param0, int[] param1, int param2, int param3, int param4, boolean param5, int param6, int[] param7) {
        int var35_int = 0;
        int var42 = 0;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int[] var16_ref_int__;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23;
        int var24;
        int[] var25;
        int var25_int;
        int var26;
        int var27;
        int var28;
        int[] var29;
        int var29_int;
        int var30;
        int var31;
        int[] var31_ref_int__;
        int var32;
        int var33;
        int var34;
        int[] var35;
        int var36;
        int var37;
        int var38;
        int var39;
        int var40;
        int var43;
        int var44;
        int var45;
        int var46;
        int[] var47;
        int[] var50;
        int[] var52;
        int[] var55;
        int[] var61;
        int[] var63;
        int[] var66;
        int[] var78;
        int[] var79;
        int[] var80;
        int[] var81;
        int[] var82;
        int[] var83;
        int[] var84;
        int[] var85;
        int var10Lifetime1;
        int var10Lifetime2;
        int var11Lifetime1;
        int var11Lifetime2;
        int var12Lifetime1;
        int var12Lifetime2;
        int var13Lifetime1;
        int var14Lifetime1;
        int var14Lifetime2;
        int var15Lifetime1;
        int var31Lifetime1;
        int var10Lifetime1Lifetime1;
        int var11Lifetime1Lifetime1;
        var9 = param1.length;
        if (param0 == 0) {
          var10 = 0;
          field_N = 0;
          field_v = 0;
          field_fb = 0;
          for (var11 = 0; var11 < var9; var11++) {
            var12 = param1[var11];
            if (var12 < this.field_B.length) {
              var78 = this.field_B[var12];
              for (var14 = 0; var14 < var78.length; var14++) {
                var15 = var78[var14];
                if (this.field_T == null ||
                  (param6 & this.field_T[var15]) != 0) {
                  field_N = field_N + this.field_t[var15];
                  field_v = field_v + this.field_V[var15];
                  field_fb = field_fb + this.field_gb[var15];
                  var10++;
                }
              }
            }
          }
          if (var10 <= 0) {
            field_N = param2;
            field_v = param3;
            field_fb = param4;
          } else {
            field_N = field_N / var10 + param2;
            field_v = field_v / var10 + param3;
            field_fb = field_fb / var10 + param4;
            field_mb = true;
          }
          return;
        }
        if (param0 == 1) {
          if (param7 != null) {
            var10Lifetime1 = param7[0] * param2 + param7[1] * param3 + param7[2] * param4 + 16384 >> 15;
            var11Lifetime1 = param7[3] * param2 + param7[4] * param3 + param7[5] * param4 + 16384 >> 15;
            var12Lifetime1 = param7[6] * param2 + param7[7] * param3 + param7[8] * param4 + 16384 >> 15;
            param2 = var10Lifetime1;
            param3 = var11Lifetime1;
            param4 = var12Lifetime1;
          }
          for (var10Lifetime1Lifetime1 = 0; var10Lifetime1Lifetime1 < var9; var10Lifetime1Lifetime1++) {
            var11Lifetime1Lifetime1 = param1[var10Lifetime1Lifetime1];
            if (var11Lifetime1Lifetime1 < this.field_B.length) {
              var79 = this.field_B[var11Lifetime1Lifetime1];
              for (var13 = 0; var13 < var79.length; var13++) {
                var14Lifetime1 = var79[var13];
                if (this.field_T == null ||
                  (param6 & this.field_T[var14Lifetime1]) != 0) {
                  this.field_t[var14Lifetime1] = this.field_t[var14Lifetime1] + param2;
                  this.field_V[var14Lifetime1] = this.field_V[var14Lifetime1] + param3;
                  this.field_gb[var14Lifetime1] = this.field_gb[var14Lifetime1] + param4;
                }
              }
            }
          }
          return;
        }
        if (param0 == 2) {
          if (param7 == null) {
            for (var10Lifetime2 = 0; var10Lifetime2 < var9; var10Lifetime2++) {
              var11Lifetime2 = param1[var10Lifetime2];
              if (var11Lifetime2 < this.field_B.length) {
                var81 = this.field_B[var11Lifetime2];
                for (var13Lifetime1 = 0; var13Lifetime1 < var81.length; var13Lifetime1++) {
                  var14Lifetime2 = var81[var13Lifetime1];
                  if (this.field_T == null ||
                    (param6 & this.field_T[var14Lifetime2]) != 0) {
                    this.field_t[var14Lifetime2] = this.field_t[var14Lifetime2] - field_N;
                    this.field_V[var14Lifetime2] = this.field_V[var14Lifetime2] - field_v;
                    this.field_gb[var14Lifetime2] = this.field_gb[var14Lifetime2] - field_fb;
                    if (param4 != 0) {
                      var15Lifetime1 = vn.field_g[param4];
                      var16 = vn.field_o[param4];
                      var17 = this.field_V[var14Lifetime2] * var15Lifetime1 + this.field_t[var14Lifetime2] * var16 + 32767 >> 16;
                      this.field_V[var14Lifetime2] = this.field_V[var14Lifetime2] * var16 - this.field_t[var14Lifetime2] * var15Lifetime1 + 32767 >> 16;
                      this.field_t[var14Lifetime2] = var17;
                    }
                    if (param2 != 0) {
                      var15Lifetime1 = vn.field_g[param2];
                      var16 = vn.field_o[param2];
                      var17 = this.field_V[var14Lifetime2] * var16 - this.field_gb[var14Lifetime2] * var15Lifetime1 + 32767 >> 16;
                      this.field_gb[var14Lifetime2] = this.field_V[var14Lifetime2] * var15Lifetime1 + this.field_gb[var14Lifetime2] * var16 + 32767 >> 16;
                      this.field_V[var14Lifetime2] = var17;
                    }
                    if (param3 != 0) {
                      var15Lifetime1 = vn.field_g[param3];
                      var16 = vn.field_o[param3];
                      var17 = this.field_gb[var14Lifetime2] * var15Lifetime1 + this.field_t[var14Lifetime2] * var16 + 32767 >> 16;
                      this.field_gb[var14Lifetime2] = this.field_gb[var14Lifetime2] * var16 - this.field_t[var14Lifetime2] * var15Lifetime1 + 32767 >> 16;
                      this.field_t[var14Lifetime2] = var17;
                    }
                    this.field_t[var14Lifetime2] = this.field_t[var14Lifetime2] + field_N;
                    this.field_V[var14Lifetime2] = this.field_V[var14Lifetime2] + field_v;
                    this.field_gb[var14Lifetime2] = this.field_gb[var14Lifetime2] + field_fb;
                  }
                }
              }
            }
            return;
          }
          var10Lifetime2 = param7[9];
          var11Lifetime2 = param7[10];
          var12Lifetime2 = param7[11];
          var13Lifetime1 = param7[12];
          var14Lifetime2 = param7[13];
          var15Lifetime1 = param7[14];
          if (field_mb) {
            var16 = param7[0] * field_N + param7[3] * field_v + param7[6] * field_fb + 16384 >> 15;
            var17 = param7[1] * field_N + param7[4] * field_v + param7[7] * field_fb + 16384 >> 15;
            var18 = param7[2] * field_N + param7[5] * field_v + param7[8] * field_fb + 16384 >> 15;
            var16 = var16 + var13Lifetime1;
            var17 = var17 + var14Lifetime2;
            var18 = var18 + var15Lifetime1;
            field_N = var16;
            field_v = var17;
            field_fb = var18;
            field_mb = false;
          }
          var61 = new int[9];
          var50 = var61;
          var16_ref_int__ = var50;
          var17 = vn.field_o[param2] >> 1;
          var18 = vn.field_g[param2] >> 1;
          var19 = vn.field_o[param3] >> 1;
          var20 = vn.field_g[param3] >> 1;
          var21 = vn.field_o[param4] >> 1;
          var22 = vn.field_g[param4] >> 1;
          var23 = var18 * var21 + 16384 >> 15;
          var24 = var18 * var22 + 16384 >> 15;
          var16_ref_int__[0] = var19 * var21 + var20 * var24 + 16384 >> 15;
          var16_ref_int__[1] = -var19 * var22 + var20 * var23 + 16384 >> 15;
          var16_ref_int__[2] = var20 * var17 + 16384 >> 15;
          var16_ref_int__[3] = var17 * var22 + 16384 >> 15;
          var16_ref_int__[4] = var17 * var21 + 16384 >> 15;
          var16_ref_int__[5] = -var18;
          var16_ref_int__[6] = -var20 * var21 + var19 * var24 + 16384 >> 15;
          var16_ref_int__[7] = var20 * var22 + var19 * var23 + 16384 >> 15;
          var16_ref_int__[8] = var19 * var17 + 16384 >> 15;
          var25_int = var61[0] * -field_N + var61[1] * -field_v + var61[2] * -field_fb + 16384 >> 15;
          var26 = var61[3] * -field_N + var61[4] * -field_v + var61[5] * -field_fb + 16384 >> 15;
          var27 = var61[6] * -field_N + var61[7] * -field_v + var61[8] * -field_fb + 16384 >> 15;
          var28 = var25_int + field_N;
          var29_int = var26 + field_v;
          var30 = var27 + field_fb;
          var31_ref_int__ = new int[9];
          for (var32 = 0; var32 < 3; var32++) {
            for (var33 = 0; var33 < 3; var33++) {
              var34 = 0;
              for (var35_int = 0; var35_int < 3; var35_int++) {
                var34 = var34 + var16_ref_int__[var32 * 3 + var35_int] * param7[var33 * 3 + var35_int];
              }
              var31_ref_int__[var32 * 3 + var33] = var34 + 16384 >> 15;
            }
          }
          var32 = var61[0] * var13Lifetime1 + var61[1] * var14Lifetime2 + var61[2] * var15Lifetime1 + 16384 >> 15;
          var33 = var61[3] * var13Lifetime1 + var61[4] * var14Lifetime2 + var61[5] * var15Lifetime1 + 16384 >> 15;
          var34 = var61[6] * var13Lifetime1 + var61[7] * var14Lifetime2 + var61[8] * var15Lifetime1 + 16384 >> 15;
          var32 = var32 + var28;
          var33 = var33 + var29_int;
          var34 = var34 + var30;
          var63 = new int[9];
          var52 = var63;
          var47 = var52;
          var35 = var47;
          for (var36 = 0; var36 < 3; var36++) {
            for (var37 = 0; var37 < 3; var37++) {
              var38 = 0;
              for (var39 = 0; var39 < 3; var39++) {
                var38 = var38 + param7[var36 * 3 + var39] * var31_ref_int__[var37 + var39 * 3];
              }
              var35[var36 * 3 + var37] = var38 + 16384 >> 15;
            }
          }
          var36 = param7[0] * var32 + param7[1] * var33 + param7[2] * var34 + 16384 >> 15;
          var37 = param7[3] * var32 + param7[4] * var33 + param7[5] * var34 + 16384 >> 15;
          var38 = param7[6] * var32 + param7[7] * var33 + param7[8] * var34 + 16384 >> 15;
          var36 = var36 + var10Lifetime2;
          var37 = var37 + var11Lifetime2;
          var38 = var38 + var12Lifetime2;
          for (var39 = 0; var39 < var9; var39++) {
            var40 = param1[var39];
            if (var40 < this.field_B.length) {
              var80 = this.field_B[var40];
              for (var42 = 0; var42 < var80.length; var42++) {
                var43 = var80[var42];
                if (this.field_T == null ||
                  (param6 & this.field_T[var43]) != 0) {
                  var44 = var63[0] * this.field_t[var43] + var63[1] * this.field_V[var43] + var63[2] * this.field_gb[var43] + 16384 >> 15;
                  var45 = var63[3] * this.field_t[var43] + var63[4] * this.field_V[var43] + var63[5] * this.field_gb[var43] + 16384 >> 15;
                  var46 = var63[6] * this.field_t[var43] + var63[7] * this.field_V[var43] + var63[8] * this.field_gb[var43] + 16384 >> 15;
                  var44 = var44 + var36;
                  var45 = var45 + var37;
                  var46 = var46 + var38;
                  this.field_t[var43] = var44;
                  this.field_V[var43] = var45;
                  this.field_gb[var43] = var46;
                }
              }
            }
          }
        } else {
          if (param0 != 3) {
            if (param0 != 5) {
              if (param0 != 7) {
                return;
              }
              if (this.field_R != null) {
                for (var10Lifetime2 = 0; var10Lifetime2 < var9; var10Lifetime2++) {
                  var11Lifetime2 = param1[var10Lifetime2];
                  if (var11Lifetime2 < this.field_R.length) {
                    var85 = this.field_R[var11Lifetime2];
                    for (var13Lifetime1 = 0; var13Lifetime1 < var85.length; var13Lifetime1++) {
                      var14Lifetime2 = var85[var13Lifetime1];
                      if (this.field_y == null ||
                        (param6 & this.field_y[var14Lifetime2]) != 0) {
                        var15Lifetime1 = this.field_J[var14Lifetime2] & 65535;
                        var16 = var15Lifetime1 >> 10 & 63;
                        var17 = var15Lifetime1 >> 7 & 7;
                        var18 = var15Lifetime1 & 127;
                        var16 = var16 + param2 & 63;
                        var17 = var17 + param3;
                        if (var17 >= 0) {
                          if (var17 > 7) {
                            var17 = 7;
                          }
                        } else {
                          var17 = 0;
                        }
                        var18 = var18 + param4;
                        if (var18 >= 0) {
                          if (var18 > 127) {
                            var18 = 127;
                          }
                        } else {
                          var18 = 0;
                        }
                        this.field_J[var14Lifetime2] = (short)(var16 << 10 | var17 << 7 | var18);
                      }
                    }
                    this.field_i = true;
                  }
                }
                return;
              }
            } else {
              if (this.field_R != null) {
                if (this.field_eb != null) {
                  for (var10Lifetime2 = 0; var10Lifetime2 < var9; var10Lifetime2++) {
                    var11Lifetime2 = param1[var10Lifetime2];
                    if (var11Lifetime2 < this.field_R.length) {
                      var84 = this.field_R[var11Lifetime2];
                      for (var13Lifetime1 = 0; var13Lifetime1 < var84.length; var13Lifetime1++) {
                        var14Lifetime2 = var84[var13Lifetime1];
                        if (this.field_y == null ||
                          (param6 & this.field_y[var14Lifetime2]) != 0) {
                          var15Lifetime1 = (this.field_eb[var14Lifetime2] & 255) + param2 * 8;
                          if (var15Lifetime1 >= 0) {
                            if (var15Lifetime1 > 255) {
                              var15Lifetime1 = 255;
                            }
                          } else {
                            var15Lifetime1 = 0;
                          }
                          this.field_eb[var14Lifetime2] = (byte)var15Lifetime1;
                        }
                      }
                    }
                  }
                  return;
                }
                return;
              }
            }
            return;
          }
          if (param7 == null) {
            for (var10Lifetime2 = 0; var10Lifetime2 < var9; var10Lifetime2++) {
              var11Lifetime2 = param1[var10Lifetime2];
              if (var11Lifetime2 < this.field_B.length) {
                var83 = this.field_B[var11Lifetime2];
                for (var13Lifetime1 = 0; var13Lifetime1 < var83.length; var13Lifetime1++) {
                  var14Lifetime2 = var83[var13Lifetime1];
                  if (this.field_T == null ||
                    (param6 & this.field_T[var14Lifetime2]) != 0) {
                    this.field_t[var14Lifetime2] = this.field_t[var14Lifetime2] - field_N;
                    this.field_V[var14Lifetime2] = this.field_V[var14Lifetime2] - field_v;
                    this.field_gb[var14Lifetime2] = this.field_gb[var14Lifetime2] - field_fb;
                    this.field_t[var14Lifetime2] = this.field_t[var14Lifetime2] * param2 / 128;
                    this.field_V[var14Lifetime2] = this.field_V[var14Lifetime2] * param3 / 128;
                    this.field_gb[var14Lifetime2] = this.field_gb[var14Lifetime2] * param4 / 128;
                    this.field_t[var14Lifetime2] = this.field_t[var14Lifetime2] + field_N;
                    this.field_V[var14Lifetime2] = this.field_V[var14Lifetime2] + field_v;
                    this.field_gb[var14Lifetime2] = this.field_gb[var14Lifetime2] + field_fb;
                  }
                }
              }
            }
            return;
          }
          var10Lifetime2 = param7[9];
          var11Lifetime2 = param7[10];
          var12Lifetime2 = param7[11];
          var13Lifetime1 = param7[12];
          var14Lifetime2 = param7[13];
          var15Lifetime1 = param7[14];
          if (field_mb) {
            var16 = param7[0] * field_N + param7[3] * field_v + param7[6] * field_fb + 16384 >> 15;
            var17 = param7[1] * field_N + param7[4] * field_v + param7[7] * field_fb + 16384 >> 15;
            var18 = param7[2] * field_N + param7[5] * field_v + param7[8] * field_fb + 16384 >> 15;
            var16 = var16 + var13Lifetime1;
            var17 = var17 + var14Lifetime2;
            var18 = var18 + var15Lifetime1;
            field_N = var16;
            field_v = var17;
            field_fb = var18;
            field_mb = false;
          }
          var16 = param2 << 15 >> 7;
          var17 = param3 << 15 >> 7;
          var18 = param4 << 15 >> 7;
          var19 = var16 * -field_N + 16384 >> 15;
          var20 = var17 * -field_v + 16384 >> 15;
          var21 = var18 * -field_fb + 16384 >> 15;
          var22 = var19 + field_N;
          var23 = var20 + field_v;
          var24 = var21 + field_fb;
          var25 = new int[9];
          var25[0] = var16 * param7[0] + 16384 >> 15;
          var25[1] = var16 * param7[3] + 16384 >> 15;
          var25[2] = var16 * param7[6] + 16384 >> 15;
          var25[3] = var17 * param7[1] + 16384 >> 15;
          var25[4] = var17 * param7[4] + 16384 >> 15;
          var25[5] = var17 * param7[7] + 16384 >> 15;
          var25[6] = var18 * param7[2] + 16384 >> 15;
          var25[7] = var18 * param7[5] + 16384 >> 15;
          var25[8] = var18 * param7[8] + 16384 >> 15;
          var26 = var16 * var13Lifetime1 + 16384 >> 15;
          var27 = var17 * var14Lifetime2 + 16384 >> 15;
          var28 = var18 * var15Lifetime1 + 16384 >> 15;
          var26 = var26 + var22;
          var27 = var27 + var23;
          var28 = var28 + var24;
          var66 = new int[9];
          var55 = var66;
          var29 = var55;
          for (var30 = 0; var30 < 3; var30++) {
            for (var31 = 0; var31 < 3; var31++) {
              var32 = 0;
              for (var33 = 0; var33 < 3; var33++) {
                var32 = var32 + param7[var30 * 3 + var33] * var25[var31 + var33 * 3];
              }
              var29[var30 * 3 + var31] = var32 + 16384 >> 15;
            }
          }
          var30 = param7[0] * var26 + param7[1] * var27 + param7[2] * var28 + 16384 >> 15;
          var31Lifetime1 = param7[3] * var26 + param7[4] * var27 + param7[5] * var28 + 16384 >> 15;
          var32 = param7[6] * var26 + param7[7] * var27 + param7[8] * var28 + 16384 >> 15;
          var30 = var30 + var10Lifetime2;
          var31Lifetime1 = var31Lifetime1 + var11Lifetime2;
          var32 = var32 + var12Lifetime2;
          for (var33 = 0; var33 < var9; var33++) {
            var34 = param1[var33];
            if (var34 < this.field_B.length) {
              var82 = this.field_B[var34];
              for (var36 = 0; var36 < var82.length; var36++) {
                var37 = var82[var36];
                if (this.field_T == null ||
                  (param6 & this.field_T[var37]) != 0) {
                  var38 = var66[0] * this.field_t[var37] + var66[1] * this.field_V[var37] + var66[2] * this.field_gb[var37] + 16384 >> 15;
                  var39 = var66[3] * this.field_t[var37] + var66[4] * this.field_V[var37] + var66[5] * this.field_gb[var37] + 16384 >> 15;
                  var40 = var66[6] * this.field_t[var37] + var66[7] * this.field_V[var37] + var66[8] * this.field_gb[var37] + 16384 >> 15;
                  var38 = var38 + var30;
                  var39 = var39 + var31Lifetime1;
                  var40 = var40 + var32;
                  this.field_t[var37] = var38;
                  this.field_V[var37] = var39;
                  this.field_gb[var37] = var40;
                }
              }
            }
          }
        }
    }

    final void b() {
        if (this.field_i) {
          this.c();
          this.field_i = false;
        }
        this.field_s = false;
    }

    public ob() {
        this.field_ib = 0;
        this.field_ob = 0;
        this.field_E = 0;
        this.field_i = false;
        this.field_nb = 0;
        this.field_K = (byte) 0;
        this.field_s = false;
    }

    ob(kc param0, int param1, int param2, int param3, int param4, int param5) {
        int dupTemp$1 = 0;
        int incrementValue$0 = 0;
        int var7;
        int var8;
        int var9;
        int[] var9_ref_int__;
        int var10;
        int var11;
        int var12;
        io var13;
        int var14;
        int var15;
        int var16;
        int[] var17;
        ce var18;
        ce var19;
        int[] var20;
        int var9Lifetime1;
        int var10Lifetime1;
        int var10Lifetime2;
        int var11Lifetime1;
        int var11Lifetime2;
        int var10Lifetime1Lifetime1;
        int var10Lifetime1Lifetime2;
        this.field_ib = 0;
        this.field_ob = 0;
        this.field_E = 0;
        this.field_i = false;
        this.field_nb = 0;
        this.field_K = (byte) 0;
        this.field_s = false;
        param0.b();
        param0.a();
        this.field_ib = param0.field_t;
        this.field_nb = param0.field_E;
        this.field_t = param0.field_R;
        this.field_V = param0.field_h;
        this.field_gb = param0.field_g;
        this.field_ob = param0.field_K;
        this.field_kb = param0.field_C;
        this.field_A = param0.field_O;
        this.field_p = param0.field_B;
        this.field_U = param0.field_z;
        this.field_eb = param0.field_m;
        this.field_K = param0.field_s;
        this.field_J = param0.field_H;
        this.field_B = param0.field_y;
        this.field_R = param0.field_P;
        this.field_y = param0.field_r;
        this.field_T = param0.field_j;
        var7 = (int)Math.sqrt((double)(param3 * param3 + param4 * param4 + param5 * param5));
        var8 = param2 * var7 >> 8;
        this.field_hb = new int[this.field_ob];
        this.field_M = new int[this.field_ob];
        this.field_j = new int[this.field_ob];
        if (param0.field_u != null) {
          this.field_r = new short[this.field_ob];
          for (var9 = 0; var9 < this.field_ob; var9++) {
            var10 = param0.field_u[var9];
            if (var10 != -1 &&
              vn.field_d.a(true, var10)) {
              this.field_r[var9] = (short)var10;
            } else {
              this.field_r[var9] = (short)-1;
            }
          }
        } else {
          this.field_r = null;
        }
        if (param0.field_i > 0 &&
          param0.field_q != null) {
          var20 = new int[param0.field_i];
          var17 = var20;
          var9_ref_int__ = var17;
          for (var10Lifetime1 = 0; var10Lifetime1 < this.field_ob; var10Lifetime1++) {
            if (param0.field_q[var10Lifetime1] != -1) {
              dupTemp$1 = param0.field_q[var10Lifetime1] & 255;
              var9_ref_int__[dupTemp$1] = var9_ref_int__[dupTemp$1] + 1;
            }
          }
          this.field_E = 0;
          for (var10Lifetime1Lifetime1 = 0; var10Lifetime1Lifetime1 < param0.field_i; var10Lifetime1Lifetime1++) {
            if (var20[var10Lifetime1Lifetime1] > 0 &&
              param0.field_v[var10Lifetime1Lifetime1] == 0) {
              this.field_E = this.field_E + 1;
            }
          }
          this.field_k = new int[this.field_E];
          this.field_I = new int[this.field_E];
          this.field_Y = new int[this.field_E];
          var10Lifetime1Lifetime2 = 0;
          for (var11 = 0; var11 < param0.field_i; var11++) {
            if (var20[var11] > 0 &&
              param0.field_v[var11] == 0) {
              this.field_k[var10Lifetime1Lifetime2] = param0.field_k[var11] & 65535;
              this.field_I[var10Lifetime1Lifetime2] = param0.field_N[var11] & 65535;
              this.field_Y[var10Lifetime1Lifetime2] = param0.field_Q[var11] & 65535;
              incrementValue$0 = var10Lifetime1Lifetime2;
              var10Lifetime1Lifetime2++;
              var9_ref_int__[var11] = incrementValue$0;
            } else {
              var20[var11] = -1;
            }
          }
          this.field_u = new byte[this.field_ob];
          for (var11Lifetime2 = 0; var11Lifetime2 < this.field_ob; var11Lifetime2++) {
            if (param0.field_q[var11Lifetime2] == -1) {
              this.field_u[var11Lifetime2] = (byte)-1;
            } else {
              this.field_u[var11Lifetime2] = (byte)var9_ref_int__[param0.field_q[var11Lifetime2] & 255];
              if (this.field_u[var11Lifetime2] == -1 &&
                this.field_r != null) {
                this.field_r[var11Lifetime2] = (short)-1;
              }
            }
          }
        }
        var16 = 0;
        var9Lifetime1 = var16;
        while (var16 < this.field_ob) {
          if (param0.field_J != null) {
            var10Lifetime2 = param0.field_J[var16];
          } else {
            var10Lifetime2 = 0;
          }
          if (param0.field_m != null) {
            var11Lifetime1 = param0.field_m[var16];
          } else {
            var11Lifetime1 = 0;
          }
          if (this.field_r != null) {
            var12 = this.field_r[var16];
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
                this.field_j[var16] = -2;
              } else {
                var19 = param0.field_o[var16];
                var14 = param1 + (param3 * var19.field_g + param4 * var19.field_d + param5 * var19.field_h) / (var8 + var8 / 2);
                this.field_hb[var16] = ob.e(var14);
                this.field_j[var16] = -1;
              }
            } else {
              if (param0.field_w != null &&
                param0.field_w[this.field_kb[var16]] != null) {
                var13 = param0.field_w[this.field_kb[var16]];
              } else {
                var13 = param0.field_f[this.field_kb[var16]];
              }
              var14 = param1 + (param3 * var13.field_j + param4 * var13.field_f + param5 * var13.field_b) / (var8 * var13.field_e);
              this.field_hb[var16] = ob.e(var14);
              if (param0.field_w != null &&
                param0.field_w[this.field_A[var16]] != null) {
                var13 = param0.field_w[this.field_A[var16]];
              } else {
                var13 = param0.field_f[this.field_A[var16]];
              }
              var14 = param1 + (param3 * var13.field_j + param4 * var13.field_f + param5 * var13.field_b) / (var8 * var13.field_e);
              this.field_M[var16] = ob.e(var14);
              if (param0.field_w != null &&
                param0.field_w[this.field_p[var16]] != null) {
                var13 = param0.field_w[this.field_p[var16]];
              } else {
                var13 = param0.field_f[this.field_p[var16]];
              }
              var14 = param1 + (param3 * var13.field_j + param4 * var13.field_f + param5 * var13.field_b) / (var8 * var13.field_e);
              this.field_j[var16] = ob.e(var14);
            }
          } else {
            if (var10Lifetime2 != 0) {
              if (var10Lifetime2 != 1) {
                if (var10Lifetime2 != 3) {
                  this.field_j[var16] = -2;
                } else {
                  this.field_hb[var16] = 128;
                  this.field_j[var16] = -1;
                }
              } else {
                var18 = param0.field_o[var16];
                var14 = param1 + (param3 * var18.field_g + param4 * var18.field_d + param5 * var18.field_h) / (var8 + var8 / 2) << 17;
                this.field_hb[var16] = var14 | ob.a(param0.field_H[var16] & 65535, var14 >> 17);
                this.field_j[var16] = -1;
              }
            } else {
              var15 = param0.field_H[var16] & 65535;
              if (param0.field_w != null &&
                param0.field_w[this.field_kb[var16]] != null) {
                var13 = param0.field_w[this.field_kb[var16]];
              } else {
                var13 = param0.field_f[this.field_kb[var16]];
              }
              var14 = param1 + (param3 * var13.field_j + param4 * var13.field_f + param5 * var13.field_b) / (var8 * var13.field_e) << 17;
              this.field_hb[var16] = var14 | ob.a(var15, var14 >> 17);
              if (param0.field_w != null &&
                param0.field_w[this.field_A[var16]] != null) {
                var13 = param0.field_w[this.field_A[var16]];
              } else {
                var13 = param0.field_f[this.field_A[var16]];
              }
              var14 = param1 + (param3 * var13.field_j + param4 * var13.field_f + param5 * var13.field_b) / (var8 * var13.field_e) << 17;
              this.field_M[var16] = var14 | ob.a(var15, var14 >> 17);
              if (param0.field_w != null &&
                param0.field_w[this.field_p[var16]] != null) {
                var13 = param0.field_w[this.field_p[var16]];
              } else {
                var13 = param0.field_f[this.field_p[var16]];
              }
              var14 = param1 + (param3 * var13.field_j + param4 * var13.field_f + param5 * var13.field_b) / (var8 * var13.field_e) << 17;
              this.field_j[var16] = var14 | ob.a(var15, var14 >> 17);
            }
          }
          var16++;
        }
    }

    ob(ob[] param0, int param1) {
        int var8 = 0;
        int stackIn_13_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_16_0 = 0;
        int stackIn_17_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_20_1 = 0;
        byte[] stackIn_54_0 = null;
        int stackIn_54_1 = 0;
        int stackIn_55_2 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        ob var8_ref_ob;
        ob var9;
        int var9_int;
        int var10;
        ob var11;
        int var12;
        ob var13;
        ob var14;
        int var7Lifetime1;
        int var7Lifetime2;
        int var9_intLifetime1;
        int var9_intLifetime2;
        int var10Lifetime1;
        ob var8_ref_obLifetime1;
        this.field_ib = 0;
        this.field_ob = 0;
        this.field_E = 0;
        this.field_i = false;
        this.field_nb = 0;
        this.field_K = (byte) 0;
        this.field_s = false;
        var3 = 0;
        var4 = 0;
        var5 = 0;
        var6 = 0;
        this.field_ib = 0;
        this.field_ob = 0;
        this.field_E = 0;
        this.field_K = (byte) -1;
        for (var7 = 0; var7 < param1; var7++) {
          var13 = param0[var7];
          var8_ref_ob = var13;
          if (var8_ref_ob != null) {
            this.field_ib = this.field_ib + var13.field_ib;
            this.field_ob = this.field_ob + var13.field_ob;
            this.field_E = this.field_E + var13.field_E;
            if (var13.field_U == null) {
              if (this.field_K == -1) {
                this.field_K = var13.field_K;
              }
              if (this.field_K != var13.field_K) {
                var3 = 1;
              }
            } else {
              var3 = 1;
            }
            stackIn_13_0 = var4;
            if (var13.field_eb == null) {
              stackIn_14_1 = 0;
            } else {
              stackIn_14_1 = 1;
            }
            var4 = stackIn_13_0 | stackIn_14_1;
            stackIn_16_0 = var5;
            if (var13.field_r == null) {
              stackIn_17_1 = 0;
            } else {
              stackIn_17_1 = 1;
            }
            var5 = stackIn_16_0 | stackIn_17_1;
            stackIn_19_0 = var6;
            if (var13.field_u == null) {
              stackIn_20_1 = 0;
            } else {
              stackIn_20_1 = 1;
            }
            var6 = stackIn_19_0 | stackIn_20_1;
          }
        }
        this.field_t = new int[this.field_ib];
        this.field_V = new int[this.field_ib];
        this.field_gb = new int[this.field_ib];
        this.field_kb = new int[this.field_ob];
        this.field_A = new int[this.field_ob];
        this.field_p = new int[this.field_ob];
        this.field_hb = new int[this.field_ob];
        this.field_M = new int[this.field_ob];
        this.field_j = new int[this.field_ob];
        if (var3 != 0) {
          this.field_U = new byte[this.field_ob];
        }
        if (var4 != 0) {
          this.field_eb = new byte[this.field_ob];
        }
        if (var5 != 0) {
          this.field_r = new short[this.field_ob];
        }
        if (var6 != 0) {
          this.field_u = new byte[this.field_ob];
        }
        if (this.field_E > 0) {
          this.field_k = new int[this.field_E];
          this.field_I = new int[this.field_E];
          this.field_Y = new int[this.field_E];
        }
        this.field_J = new short[this.field_ob];
        this.field_ib = 0;
        this.field_ob = 0;
        this.field_E = 0;
        for (var7Lifetime1 = 0; var7Lifetime1 < param1; var7Lifetime1++) {
          var11 = param0[var7Lifetime1];
          var14 = var11;
          var8_ref_obLifetime1 = var14;
          if (var8_ref_obLifetime1 != null) {
            for (var9_int = 0; var9_int < var14.field_ob; var9_int++) {
              this.field_kb[this.field_ob] = var11.field_kb[var9_int] + this.field_ib;
              this.field_A[this.field_ob] = var11.field_A[var9_int] + this.field_ib;
              this.field_p[this.field_ob] = var11.field_p[var9_int] + this.field_ib;
              this.field_hb[this.field_ob] = var11.field_hb[var9_int];
              this.field_M[this.field_ob] = var11.field_M[var9_int];
              this.field_j[this.field_ob] = var11.field_j[var9_int];
              this.field_J[this.field_ob] = var11.field_J[var9_int];
              if (var3 != 0) {
                if (var14.field_U == null) {
                  this.field_U[this.field_ob] = var11.field_K;
                } else {
                  this.field_U[this.field_ob] = var11.field_U[var9_int];
                }
              }
              if (var4 != 0 &&
                var14.field_eb != null) {
                this.field_eb[this.field_ob] = var11.field_eb[var9_int];
              }
              if (var5 != 0) {
                if (var14.field_r == null) {
                  this.field_r[this.field_ob] = (short)-1;
                } else {
                  this.field_r[this.field_ob] = var11.field_r[var9_int];
                }
              }
              if (var6 != 0) {
                stackIn_54_0 = this.field_u;
                stackIn_54_1 = this.field_ob;
                if (var14.field_u != null &&
                  var11.field_u[var9_int] != -1) {
                  stackIn_55_2 = var11.field_u[var9_int] + this.field_E;
                } else {
                  stackIn_55_2 = -1;
                }
                stackIn_54_0[stackIn_54_1] = (byte)stackIn_55_2;
              }
              this.field_ob = this.field_ob + 1;
            }
            for (var9_intLifetime1 = 0; var9_intLifetime1 < var14.field_E; var9_intLifetime1++) {
              if (var11.field_k[var9_intLifetime1] < var14.field_nb) {
                this.field_k[this.field_E] = var11.field_k[var9_intLifetime1] + this.field_ib;
              }
              if (var11.field_I[var9_intLifetime1] < var14.field_nb) {
                this.field_I[this.field_E] = var11.field_I[var9_intLifetime1] + this.field_ib;
              }
              if (var11.field_Y[var9_intLifetime1] < var14.field_nb) {
                this.field_Y[this.field_E] = var11.field_Y[var9_intLifetime1] + this.field_ib;
              }
              this.field_E = this.field_E + 1;
            }
            for (var9_intLifetime2 = 0; var9_intLifetime2 < var14.field_nb; var9_intLifetime2++) {
              this.field_t[this.field_ib] = var11.field_t[var9_intLifetime2];
              this.field_V[this.field_ib] = var11.field_V[var9_intLifetime2];
              this.field_gb[this.field_ib] = var11.field_gb[var9_intLifetime2];
              this.field_ib = this.field_ib + 1;
            }
          }
        }
        var7Lifetime2 = 0;
        this.field_nb = this.field_ib;
        for (var8 = 0; var8 < param1; var8++) {
          var9 = param0[var8];
          if (var9 != null) {
            for (var10 = 0; var10 < var9.field_E; var10++) {
              if (var9.field_k[var10] >= var9.field_nb) {
                this.field_k[var7Lifetime2] = var9.field_k[var10] - var9.field_nb + this.field_ib;
              }
              if (var9.field_I[var10] >= var9.field_nb) {
                this.field_I[var7Lifetime2] = var9.field_I[var10] - var9.field_nb + this.field_ib;
              }
              if (var9.field_Y[var10] >= var9.field_nb) {
                this.field_Y[var7Lifetime2] = var9.field_Y[var10] - var9.field_nb + this.field_ib;
              }
              var7Lifetime2++;
            }
            var12 = var9.field_nb;
            var10Lifetime1 = var12;
            while (var12 < var9.field_ib) {
              this.field_t[this.field_ib] = var9.field_t[var12];
              this.field_V[this.field_ib] = var9.field_V[var12];
              this.field_gb[this.field_ib] = var9.field_gb[var12];
              this.field_ib = this.field_ib + 1;
              var12++;
            }
          }
        }
    }

    static {
        field_o = new ob();
        field_h = new short[1];
        field_n = new int[1];
        field_cb = new byte[1];
        field_jb = new int[1];
        field_O = new int[1];
        ob discarded$0 = new ob();
        ob discarded$1 = new ob();
        field_x = new int[10];
        field_w = new int[10];
        field_C = new int[4096];
        field_l = new boolean[4096];
        field_g = new int[12][4096];
        field_D = new int[4096];
        field_q = new int[4096];
        field_bb = new int[4096];
        field_S = new int[4096];
        field_X = 0;
        field_db = new int[4096];
        field_lb = new int[12];
        field_W = new int[12];
        field_mb = false;
        field_G = new int[4096];
        field_Q = new boolean[4096];
        field_Z = false;
        if (field_Z) {
          field_pb = new int[4096];
          field_z = new int[4096];
        } else {
          field_H = new int[1600];
          field_ab = new int[1600][64];
          field_P = new int[32];
          field_f = new int[32][512];
        }
        field_L = new int[10];
        field_F = new int[4096];
    }
}
