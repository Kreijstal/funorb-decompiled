/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ss extends gga {
    private int[] field_l;
    private byte[] field_T;
    private boolean field_K;
    private int[] field_i;
    private int field_t;
    private int[] field_U;
    private byte[] field_A;
    private int[] field_R;
    private int[] field_J;
    private int[] field_G;
    private int[] field_L;
    private int field_W;
    private int[] field_x;
    private short[] field_P;
    private int[] field_r;
    private int[] field_n;
    private int field_o;
    private int field_O;
    private short field_h;
    private int[] field_N;
    private int[] field_M;
    private byte[] field_m;
    private static int[] field_c;
    private static int[] field_y;
    private static int[] field_H;
    private static int[][] field_k;
    private static int[] field_f;
    private static int[][] field_s;
    private static boolean[] field_D;
    private static int[] field_S;
    private static int[] field_q;
    private static int[] field_v;
    private static int[] field_e;
    private static int[][] field_C;
    private static int[] field_B;
    private static int[] field_j;
    private static int[] field_u;
    private static int[] field_I;
    private static int[] field_p;
    private static boolean field_E;
    private static int[] field_F;
    private static boolean[] field_z;
    private static int[] field_w;
    private static int[] field_d;
    private static int field_g;
    private static int[] field_V;

    private final static int c(int param0) {
        if (param0 < 2) {
          param0 = 2;
        } else {
          if (param0 > 126) {
            param0 = 126;
          }
        }
        return param0;
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
        for (var9 = 0; var9 < this.field_O; var9++) {
          var10 = this.field_x[var9];
          var11 = this.field_J[var9];
          var12 = this.field_U[var9];
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
        this.field_h = (short)(int)(Math.sqrt((double)var8) + 0.99);
        this.field_K = true;
    }

    public static void a() {
        field_D = null;
        field_z = null;
        field_p = null;
        field_F = null;
        field_I = null;
        field_H = null;
        field_B = null;
        field_y = null;
        field_j = null;
        field_k = (int[][]) null;
        field_w = null;
        field_s = (int[][]) null;
        field_f = null;
        field_e = null;
        field_c = null;
        field_C = (int[][]) null;
        field_v = null;
        field_d = null;
        field_S = null;
        field_q = null;
        field_u = null;
        field_V = null;
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
        var2 = jb.field_h;
        var3 = jb.field_j;
        var4 = 0;
        var5 = this.field_l[param0];
        var6 = this.field_n[param0];
        var7 = this.field_M[param0];
        var8 = field_y[var5];
        var9 = field_y[var6];
        var10 = field_y[var7];
        if (this.field_T != null) {
          jb.field_b = this.field_T[param0] & 255;
        } else {
          jb.field_b = 0;
        }
        if (var8 < 50) {
          var11 = field_H[var5];
          var12 = field_B[var5];
          var13 = this.field_r[param0] & 65535;
          if (var10 >= 50) {
            var14 = (50 - var8) * jb.field_c[var10 - var8];
            field_q[var4] = var2 + (var11 + ((field_H[var7] - var11) * var14 >> 16) << 9) / 50;
            field_u[var4] = var3 + (var12 + ((field_B[var7] - var12) * var14 >> 16) << 9) / 50;
            incrementValue$0 = var4;
            var4++;
            field_V[incrementValue$0] = var13 + (((this.field_L[param0] & 65535) - var13) * var14 >> 16);
          }
          if (var9 >= 50) {
            var14Lifetime4 = (50 - var8) * jb.field_c[var9 - var8];
            field_q[var4] = var2 + (var11 + ((field_H[var6] - var11) * var14Lifetime4 >> 16) << 9) / 50;
            field_u[var4] = var3 + (var12 + ((field_B[var6] - var12) * var14Lifetime4 >> 16) << 9) / 50;
            incrementValue$1 = var4;
            var4++;
            field_V[incrementValue$1] = var13 + (((this.field_i[param0] & 65535) - var13) * var14Lifetime4 >> 16);
          }
        } else {
          field_q[var4] = field_p[var5];
          field_u[var4] = field_F[var5];
          incrementValue$2 = var4;
          var4++;
          field_V[incrementValue$2] = this.field_r[param0] & 65535;
        }
        if (var9 < 50) {
          var11Lifetime1 = field_H[var6];
          var12Lifetime1 = field_B[var6];
          var13Lifetime1 = this.field_i[param0] & 65535;
          if (var8 >= 50) {
            var14Lifetime1 = (50 - var9) * jb.field_c[var8 - var9];
            field_q[var4] = var2 + (var11Lifetime1 + ((field_H[var5] - var11Lifetime1) * var14Lifetime1 >> 16) << 9) / 50;
            field_u[var4] = var3 + (var12Lifetime1 + ((field_B[var5] - var12Lifetime1) * var14Lifetime1 >> 16) << 9) / 50;
            incrementValue$3 = var4;
            var4++;
            field_V[incrementValue$3] = var13Lifetime1 + (((this.field_r[param0] & 65535) - var13Lifetime1) * var14Lifetime1 >> 16);
          }
          if (var10 >= 50) {
            var14Lifetime1Lifetime1 = (50 - var9) * jb.field_c[var10 - var9];
            field_q[var4] = var2 + (var11Lifetime1 + ((field_H[var7] - var11Lifetime1) * var14Lifetime1Lifetime1 >> 16) << 9) / 50;
            field_u[var4] = var3 + (var12Lifetime1 + ((field_B[var7] - var12Lifetime1) * var14Lifetime1Lifetime1 >> 16) << 9) / 50;
            incrementValue$4 = var4;
            var4++;
            field_V[incrementValue$4] = var13Lifetime1 + (((this.field_L[param0] & 65535) - var13Lifetime1) * var14Lifetime1Lifetime1 >> 16);
          }
        } else {
          field_q[var4] = field_p[var6];
          field_u[var4] = field_F[var6];
          incrementValue$5 = var4;
          var4++;
          field_V[incrementValue$5] = this.field_i[param0] & 65535;
        }
        if (var10 < 50) {
          var11Lifetime2 = field_H[var7];
          var12Lifetime2 = field_B[var7];
          var13Lifetime2 = this.field_L[param0] & 65535;
          if (var9 >= 50) {
            var14Lifetime2 = (50 - var10) * jb.field_c[var9 - var10];
            field_q[var4] = var2 + (var11Lifetime2 + ((field_H[var6] - var11Lifetime2) * var14Lifetime2 >> 16) << 9) / 50;
            field_u[var4] = var3 + (var12Lifetime2 + ((field_B[var6] - var12Lifetime2) * var14Lifetime2 >> 16) << 9) / 50;
            incrementValue$6 = var4;
            var4++;
            field_V[incrementValue$6] = var13Lifetime2 + (((this.field_i[param0] & 65535) - var13Lifetime2) * var14Lifetime2 >> 16);
          }
          if (var8 >= 50) {
            var14Lifetime2Lifetime1 = (50 - var10) * jb.field_c[var8 - var10];
            field_q[var4] = var2 + (var11Lifetime2 + ((field_H[var5] - var11Lifetime2) * var14Lifetime2Lifetime1 >> 16) << 9) / 50;
            field_u[var4] = var3 + (var12Lifetime2 + ((field_B[var5] - var12Lifetime2) * var14Lifetime2Lifetime1 >> 16) << 9) / 50;
            incrementValue$7 = var4;
            var4++;
            field_V[incrementValue$7] = var13Lifetime2 + (((this.field_r[param0] & 65535) - var13Lifetime2) * var14Lifetime2Lifetime1 >> 16);
          }
        } else {
          field_q[var4] = field_p[var7];
          field_u[var4] = field_F[var7];
          incrementValue$8 = var4;
          var4++;
          field_V[incrementValue$8] = this.field_L[param0] & 65535;
        }
        boolean decompiledFrameRemainder0 = true;
        var11Lifetime3 = field_q[0];
        var12Lifetime3 = field_q[1];
        var13Lifetime3 = field_q[2];
        var14Lifetime3 = field_u[0];
        var15 = field_u[1];
        var16 = field_u[2];
        jb.field_q = false;
        if (var4 == 3) {
          if (var11Lifetime3 < 0 ||
            var12Lifetime3 < 0 ||
            var13Lifetime3 < 0 ||
            !(var11Lifetime3 <= jb.field_o) ||
            !(var12Lifetime3 <= jb.field_o) ||
            !(var13Lifetime3 <= jb.field_o)) {
            jb.field_q = true;
          }
          if (this.field_P != null &&
            this.field_P[param0] != -1) {
            if (this.field_m != null &&
              this.field_m[param0] != -1) {
              var20 = this.field_m[param0] & 255;
              var17 = this.field_G[var20];
              var18 = this.field_R[var20];
              var19 = this.field_N[var20];
            } else {
              var17 = var5;
              var18 = var6;
              var19 = var7;
            }
            if (this.field_L[param0] != -1) {
              jb.a(var14Lifetime3, var15, var16, var11Lifetime3, var12Lifetime3, var13Lifetime3, field_V[0], field_V[1], field_V[2], field_H[var17], field_H[var18], field_H[var19], field_B[var17], field_B[var18], field_B[var19], field_y[var17], field_y[var18], field_y[var19], (int) this.field_P[param0]);
            } else {
              jb.a(var14Lifetime3, var15, var16, var11Lifetime3, var12Lifetime3, var13Lifetime3, this.field_r[param0], this.field_r[param0], this.field_r[param0], field_H[var17], field_H[var18], field_H[var19], field_B[var17], field_B[var18], field_B[var19], field_y[var17], field_y[var18], field_y[var19], (int) this.field_P[param0]);
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (this.field_L[param0] != -1) {
              jb.a(var14Lifetime3, var15, var16, var11Lifetime3, var12Lifetime3, var13Lifetime3, field_V[0], field_V[1], field_V[2]);
            } else {
              jb.a(var14Lifetime3, var15, var16, var11Lifetime3, var12Lifetime3, var13Lifetime3, jb.field_k[this.field_r[param0] & 65535]);
            }
          }
        }
        if (var4 != 4) {
          return;
        }
        if (var11Lifetime3 < 0 ||
          var12Lifetime3 < 0 ||
          var13Lifetime3 < 0 ||
          !(var11Lifetime3 <= jb.field_o) ||
          !(var12Lifetime3 <= jb.field_o) ||
          !(var13Lifetime3 <= jb.field_o) ||
          !(field_q[3] >= 0) ||
          !(field_q[3] <= jb.field_o)) {
          jb.field_q = true;
        }
        if (this.field_P != null &&
          this.field_P[param0] != -1) {
          if (this.field_m != null &&
            this.field_m[param0] != -1) {
            var20Lifetime1 = this.field_m[param0] & 255;
            var17Lifetime1 = this.field_G[var20Lifetime1];
            var18Lifetime1 = this.field_R[var20Lifetime1];
            var19Lifetime1 = this.field_N[var20Lifetime1];
          } else {
            var17Lifetime1 = var5;
            var18Lifetime1 = var6;
            var19Lifetime1 = var7;
          }
          var20Lifetime1Lifetime1 = this.field_P[param0];
          if (this.field_L[param0] != -1) {
            jb.a(var14Lifetime3, var15, var16, var11Lifetime3, var12Lifetime3, var13Lifetime3, field_V[0], field_V[1], field_V[2], field_H[var17Lifetime1], field_H[var18Lifetime1], field_H[var19Lifetime1], field_B[var17Lifetime1], field_B[var18Lifetime1], field_B[var19Lifetime1], field_y[var17Lifetime1], field_y[var18Lifetime1], field_y[var19Lifetime1], var20Lifetime1Lifetime1);
            jb.a(var14Lifetime3, var16, field_u[3], var11Lifetime3, var13Lifetime3, field_q[3], field_V[0], field_V[2], field_V[3], field_H[var17Lifetime1], field_H[var18Lifetime1], field_H[var19Lifetime1], field_B[var17Lifetime1], field_B[var18Lifetime1], field_B[var19Lifetime1], field_y[var17Lifetime1], field_y[var18Lifetime1], field_y[var19Lifetime1], var20Lifetime1Lifetime1);
          } else {
            jb.a(var14Lifetime3, var15, var16, var11Lifetime3, var12Lifetime3, var13Lifetime3, this.field_r[param0], this.field_r[param0], this.field_r[param0], field_H[var17Lifetime1], field_H[var18Lifetime1], field_H[var19Lifetime1], field_B[var17Lifetime1], field_B[var18Lifetime1], field_B[var19Lifetime1], field_y[var17Lifetime1], field_y[var18Lifetime1], field_y[var19Lifetime1], var20Lifetime1Lifetime1);
            jb.a(var14Lifetime3, var16, field_u[3], var11Lifetime3, var13Lifetime3, field_q[3], this.field_r[param0], this.field_r[param0], this.field_r[param0], field_H[var17Lifetime1], field_H[var18Lifetime1], field_H[var19Lifetime1], field_B[var17Lifetime1], field_B[var18Lifetime1], field_B[var19Lifetime1], field_y[var17Lifetime1], field_y[var18Lifetime1], field_y[var19Lifetime1], var20Lifetime1Lifetime1);
          }
        } else {
          if (this.field_L[param0] != -1) {
            jb.a(var14Lifetime3, var15, var16, var11Lifetime3, var12Lifetime3, var13Lifetime3, field_V[0], field_V[1], field_V[2]);
            jb.a(var14Lifetime3, var16, field_u[3], var11Lifetime3, var13Lifetime3, field_q[3], field_V[0], field_V[2], field_V[3]);
          } else {
            var17Lifetime1 = jb.field_k[this.field_r[param0] & 65535];
            jb.a(var14Lifetime3, var15, var16, var11Lifetime3, var12Lifetime3, var13Lifetime3, var17Lifetime1);
            jb.a(var14Lifetime3, var16, field_u[3], var11Lifetime3, var13Lifetime3, field_q[3], var17Lifetime1);
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
        if (!field_E) {
          for (var8 = 0; var8 < 1600; var8++) {
            field_j[var8] = 0;
          }
          for (var8Lifetime4 = 0; var8Lifetime4 < 32; var8Lifetime4++) {
            field_w[var8Lifetime4] = 0;
          }
          field_g = 0;
        }
        for (var8Lifetime1 = 0; var8Lifetime1 < this.field_o; var8Lifetime1++) {
          L45: {
            if (this.field_L[var8Lifetime1] != -2) {
              var9 = this.field_l[var8Lifetime1];
              var10 = this.field_n[var8Lifetime1];
              var11 = this.field_M[var8Lifetime1];
              var12 = field_p[var9];
              var13 = field_p[var10];
              var14_int = field_p[var11];
              if (param0 && (var12 == -5000 ||
                var13 == -5000 ||
                var14_int == -5000)) {
                var15_int = field_H[var9];
                var16 = field_H[var10];
                var17 = field_H[var11];
                var18 = field_B[var9];
                var19 = field_B[var10];
                var20 = field_B[var11];
                var21 = field_y[var9];
                var22 = field_y[var10];
                var23 = field_y[var11];
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
                  field_z[var8Lifetime1] = true;
                  if (field_E) {
                    field_f[var7] = (field_I[var9] + field_I[var10] + field_I[var11]) / 3;
                    incrementValue$12 = var7;
                    var7++;
                    field_e[incrementValue$12] = var8Lifetime1;
                  } else {
                    var27 = (field_I[var9] + field_I[var10] + field_I[var11]) / 3 + param3;
                    if (field_j[var27] < 64) {
                      dupTemp$10 = field_j[var27];
                      arrayValue$11 = field_k[var27];
                      field_j[var27] = dupTemp$10 + 1;
                      arrayValue$11[dupTemp$10] = var8Lifetime1;
                    } else {
                      var28 = field_j[var27];
                      if (var28 == 64) {
                        if (field_g == 512) {
                          break L45;
                        }
                        fieldTemp$7 = field_g;
                        field_g = field_g + 1;
                        var28 = 65 + fieldTemp$7;
                        field_j[var27] = 65 + fieldTemp$7;
                      }
                      var28 -= 65;
                      dupTemp$8 = field_w[var28];
                      arrayValue$9 = field_s[var28];
                      field_w[var28] = dupTemp$8 + 1;
                      arrayValue$9[dupTemp$8] = var8Lifetime1;
                    }
                  }
                }
                break L45;
              }
              if (param1 &&
                this.a(aca.field_i + jb.field_h, on.field_n + jb.field_j, field_F[var9], field_F[var10], field_F[var11], var12, var13, var14_int)) {
                fieldTemp$13 = dn.field_a;
                dn.field_a = dn.field_a + 1;
                p.field_l[fieldTemp$13] = param2;
                param1 = false;
              }
              if ((var12 - var13) * (field_F[var11] - field_F[var10]) - (field_F[var9] - field_F[var10]) * (var14_int - var13) > 0) {
                field_z[var8Lifetime1] = false;
                if (var12 >= 0 &&
                  var13 >= 0 &&
                  var14_int >= 0 &&
                  var12 <= jb.field_o &&
                  var13 <= jb.field_o &&
                  var14_int <= jb.field_o) {
                  field_D[var8Lifetime1] = false;
                } else {
                  field_D[var8Lifetime1] = true;
                }
                if (!field_E) {
                  var15_intLifetime2 = (field_I[var9] + field_I[var10] + field_I[var11]) / 3 + param3;
                  if (field_j[var15_intLifetime2] >= 64) {
                    var16Lifetime2 = field_j[var15_intLifetime2];
                    if (var16Lifetime2 == 64) {
                      if (field_g == 512) {
                        break L45;
                      }
                      fieldTemp$14 = field_g;
                      field_g = field_g + 1;
                      var16Lifetime2 = 65 + fieldTemp$14;
                      field_j[var15_intLifetime2] = 65 + fieldTemp$14;
                    }
                    var16Lifetime2 -= 65;
                    dupTemp$15 = field_w[var16Lifetime2];
                    arrayValue$16 = field_s[var16Lifetime2];
                    field_w[var16Lifetime2] = dupTemp$15 + 1;
                    arrayValue$16[dupTemp$15] = var8Lifetime1;
                  } else {
                    dupTemp$17 = field_j[var15_intLifetime2];
                    arrayValue$18 = field_k[var15_intLifetime2];
                    field_j[var15_intLifetime2] = dupTemp$17 + 1;
                    arrayValue$18[dupTemp$17] = var8Lifetime1;
                  }
                } else {
                  field_f[var7] = (field_I[var9] + field_I[var10] + field_I[var11]) / 3;
                  incrementValue$19 = var7;
                  var7++;
                  field_e[incrementValue$19] = var8Lifetime1;
                }
              }
            }
          }
        }
        if (field_E) {
          gm.a(var7 - 1, -30111, field_f, field_e, 0);
          if (this.field_A == null) {
            for (var8Lifetime2 = 0; var8Lifetime2 < var7; var8Lifetime2++) {
              this.b(field_e[var8Lifetime2]);
            }
            return;
          }
          for (var8Lifetime2 = 0; var8Lifetime2 < 12; var8Lifetime2++) {
            field_c[var8Lifetime2] = 0;
            field_S[var8Lifetime2] = 0;
          }
          for (var8Lifetime2 = 0; var8Lifetime2 < var7; var8Lifetime2++) {
            var9Lifetime1 = field_e[var8Lifetime2];
            var10Lifetime1 = field_f[var8Lifetime2];
            var11Lifetime1 = this.field_A[var9Lifetime1];
            dupTemp$2 = field_c[var11Lifetime1];
            field_c[var11Lifetime1] = dupTemp$2 + 1;
            var12Lifetime1 = dupTemp$2;
            field_C[var11Lifetime1][var12Lifetime1] = var9Lifetime1;
            if (var11Lifetime1 >= 10) {
              if (var11Lifetime1 != 10) {
                field_d[var12Lifetime1] = var10Lifetime1;
              } else {
                field_v[var12Lifetime1] = var10Lifetime1;
              }
            } else {
              field_S[var11Lifetime1] = field_S[var11Lifetime1] + var10Lifetime1;
            }
          }
        } else {
          if (this.field_A == null) {
            for (var8Lifetime2 = param4 - 1; var8Lifetime2 >= 0; var8Lifetime2--) {
              var9Lifetime1 = field_j[var8Lifetime2];
              if (var9Lifetime1 > 0) {
                stackIn_88_0 = (var9Lifetime1 <= 64) ? var9Lifetime1 : 64;
                var10Lifetime1 = stackIn_88_0;
                var45 = field_k[var8Lifetime2];
                for (var12Lifetime1 = 0; var12Lifetime1 < var10Lifetime1; var12Lifetime1++) {
                  this.b(var45[var12Lifetime1]);
                }
              }
              if (var9Lifetime1 > 64) {
                var10Lifetime1 = field_j[var8Lifetime2] - 64 - 1;
                var46 = field_s[var10Lifetime1];
                for (var12Lifetime1 = 0; var12Lifetime1 < field_w[var10Lifetime1]; var12Lifetime1++) {
                  this.b(var46[var12Lifetime1]);
                }
              }
            }
            return;
          }
          for (var8Lifetime2 = 0; var8Lifetime2 < 12; var8Lifetime2++) {
            field_c[var8Lifetime2] = 0;
            field_S[var8Lifetime2] = 0;
          }
          for (var8Lifetime2 = param4 - 1; var8Lifetime2 >= 0; var8Lifetime2--) {
            var9Lifetime1 = field_j[var8Lifetime2];
            if (var9Lifetime1 > 0) {
              if (var9Lifetime1 <= 64) {
                var10Lifetime1 = var9Lifetime1;
              } else {
                var10Lifetime1 = 64;
              }
              var47 = field_k[var8Lifetime2];
              for (var12Lifetime1 = 0; var12Lifetime1 < var10Lifetime1; var12Lifetime1++) {
                var13Lifetime1 = var47[var12Lifetime1];
                var14_intLifetime1 = this.field_A[var13Lifetime1];
                dupTemp$0 = field_c[var14_intLifetime1];
                field_c[var14_intLifetime1] = dupTemp$0 + 1;
                var15_intLifetime1 = dupTemp$0;
                field_C[var14_intLifetime1][var15_intLifetime1] = var13Lifetime1;
                if (var14_intLifetime1 >= 10) {
                  if (var14_intLifetime1 != 10) {
                    field_d[var15_intLifetime1] = var8Lifetime2;
                  } else {
                    field_v[var15_intLifetime1] = var8Lifetime2;
                  }
                } else {
                  field_S[var14_intLifetime1] = field_S[var14_intLifetime1] + var8Lifetime2;
                }
              }
            }
            if (var9Lifetime1 > 64) {
              var10Lifetime1 = field_j[var8Lifetime2] - 64 - 1;
              var48 = field_s[var10Lifetime1];
              for (var12Lifetime1 = 0; var12Lifetime1 < field_w[var10Lifetime1]; var12Lifetime1++) {
                var13Lifetime1Lifetime1 = var48[var12Lifetime1];
                var14_intLifetime1Lifetime1 = this.field_A[var13Lifetime1Lifetime1];
                dupTemp$1 = field_c[var14_intLifetime1Lifetime1];
                field_c[var14_intLifetime1Lifetime1] = dupTemp$1 + 1;
                var15_intLifetime1Lifetime1 = dupTemp$1;
                field_C[var14_intLifetime1Lifetime1][var15_intLifetime1Lifetime1] = var13Lifetime1Lifetime1;
                if (var14_intLifetime1Lifetime1 >= 10) {
                  if (var14_intLifetime1Lifetime1 != 10) {
                    field_d[var15_intLifetime1Lifetime1] = var8Lifetime2;
                  } else {
                    field_v[var15_intLifetime1Lifetime1] = var8Lifetime2;
                  }
                } else {
                  field_S[var14_intLifetime1Lifetime1] = field_S[var14_intLifetime1Lifetime1] + var8Lifetime2;
                }
              }
            }
          }
        }
        var8Lifetime3 = 0;
        if (!(field_c[1] <= 0) ||
          !(field_c[2] <= 0)) {
          var8Lifetime3 = (field_S[1] + field_S[2]) / (field_c[1] + field_c[2]);
        }
        var9Lifetime2 = 0;
        if (!(field_c[3] <= 0) ||
          !(field_c[4] <= 0)) {
          var9Lifetime2 = (field_S[3] + field_S[4]) / (field_c[3] + field_c[4]);
        }
        var10Lifetime2 = 0;
        if (!(field_c[6] <= 0) ||
          !(field_c[8] <= 0)) {
          var10Lifetime2 = (field_S[6] + field_S[8]) / (field_c[6] + field_c[8]);
        }
        var12Lifetime2 = 0;
        var13Lifetime2 = field_c[10];
        var14 = field_C[10];
        var15 = field_v;
        if (var12Lifetime2 == var13Lifetime2) {
          var12Lifetime2 = 0;
          var13Lifetime2 = field_c[11];
          var14 = field_C[11];
          var15 = field_d;
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
                var14 != field_C[11]) {
                var12Lifetime2 = 0;
                var13Lifetime2 = field_c[11];
                var14 = field_C[11];
                var15 = field_d;
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
                var14 != field_C[11]) {
                var12Lifetime2 = 0;
                var13Lifetime2 = field_c[11];
                var14 = field_C[11];
                var15 = field_d;
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
                var14 != field_C[11]) {
                var12Lifetime2 = 0;
                var13Lifetime2 = field_c[11];
                var14 = field_C[11];
                var15 = field_d;
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
          var17Lifetime1 = field_c[var16Lifetime1];
          var49 = field_C[var16Lifetime1];
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
            var14 != field_C[11]) {
            var12Lifetime2 = 0;
            var14 = field_C[11];
            var13Lifetime2 = field_c[11];
            var15 = field_d;
          }
          if (var12Lifetime2 >= var13Lifetime2) {
            var11Lifetime2 = -1000;
            continue;
          }
          var11Lifetime2 = var15[var12Lifetime2];
        }
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
        if (!this.field_K) {
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
        if (var5 < 50 - this.field_h) {
          return;
        }
        var15Lifetime2 = this.field_h * 92682 >> 16;
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
        stackIn_15_0 = (var5 > 50 + this.field_h) ? 0 : 1;
        var16 = stackIn_15_0;
        if (var16 == 0) {
          stackIn_21_0 = (this.field_t > 0) ? 1 : 0;
        } else {
          stackIn_21_0 = 1;
        }
        var17Lifetime2 = stackIn_21_0;
        var18Lifetime1 = jb.field_h;
        var19Lifetime1 = jb.field_j;
        var20 = 0;
        var27 = 0;
        var21_intLifetime1 = var27;
        while (var27 < this.field_W) {
          var22Lifetime1 = this.field_x[var27];
          var23Lifetime1 = this.field_J[var27];
          var24 = this.field_U[var27];
          var25 = var22Lifetime1 * var6 + var23Lifetime1 * var9 + var24 * var12 >> 16;
          var26 = var22Lifetime1 * var7 + var23Lifetime1 * var10 + var24 * var13 >> 16;
          var24 = var22Lifetime1 * var8 + var23Lifetime1 * var11 + var24 * var14 >> 16;
          var22Lifetime1Lifetime1 = var25;
          var23Lifetime1Lifetime1 = var26;
          field_I[var27] = var24;
          var22Lifetime1Lifetime1 = var22Lifetime1Lifetime1 + var3;
          var23Lifetime1Lifetime1 = var23Lifetime1Lifetime1 + var4;
          var24 = var24 + var5;
          if (var24 < 50) {
            field_p[var27] = -5000;
            var20 = 1;
          } else {
            field_p[var27] = var18Lifetime1 + (var22Lifetime1Lifetime1 << 9) / var24;
            field_F[var27] = var19Lifetime1 + (var23Lifetime1Lifetime1 << 9) / var24;
          }
          if (var17Lifetime2 != 0) {
            field_H[var27] = var22Lifetime1Lifetime1;
            field_B[var27] = var23Lifetime1Lifetime1;
            field_y[var27] = var24;
          }
          var27++;
        }
        try {
          this.a((var20 & var16) != 0, false, 0L, (int) this.field_h, this.field_h << 1);
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var21 = (Exception) (Object) decompiledCaughtException;
        }
        return;
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        for (var4 = 0; var4 < this.field_W; var4++) {
          this.field_x[var4] = this.field_x[var4] * param0 / 128;
          this.field_J[var4] = this.field_J[var4] * param1 / 128;
          this.field_U[var4] = this.field_U[var4] * param2 / 128;
        }
        this.field_K = false;
    }

    private final void b(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        if (field_z[param0]) {
          this.d(param0);
          return;
        }
        var2 = this.field_l[param0];
        var3 = this.field_n[param0];
        var4 = this.field_M[param0];
        jb.field_q = field_D[param0];
        if (this.field_T != null) {
          jb.field_b = this.field_T[param0] & 255;
        } else {
          jb.field_b = 0;
        }
        if (this.field_P != null &&
          this.field_P[param0] != -1) {
          if (this.field_m != null &&
            this.field_m[param0] != -1) {
            var8 = this.field_m[param0] & 255;
            var5 = this.field_G[var8];
            var6 = this.field_R[var8];
            var7 = this.field_N[var8];
          } else {
            var5 = var2;
            var6 = var3;
            var7 = var4;
          }
          if (this.field_L[param0] != -1) {
            jb.a(field_F[var2], field_F[var3], field_F[var4], field_p[var2], field_p[var3], field_p[var4], this.field_r[param0], this.field_i[param0], this.field_L[param0], field_H[var5], field_H[var6], field_H[var7], field_B[var5], field_B[var6], field_B[var7], field_y[var5], field_y[var6], field_y[var7], (int) this.field_P[param0]);
          } else {
            jb.a(field_F[var2], field_F[var3], field_F[var4], field_p[var2], field_p[var3], field_p[var4], this.field_r[param0], this.field_r[param0], this.field_r[param0], field_H[var5], field_H[var6], field_H[var7], field_B[var5], field_B[var6], field_B[var7], field_y[var5], field_y[var6], field_y[var7], (int) this.field_P[param0]);
          }
        } else {
          if (this.field_L[param0] != -1) {
            jb.a(field_F[var2], field_F[var3], field_F[var4], field_p[var2], field_p[var3], field_p[var4], this.field_r[param0] & 65535, this.field_i[param0] & 65535, this.field_L[param0] & 65535);
          } else {
            jb.a(field_F[var2], field_F[var3], field_F[var4], field_p[var2], field_p[var3], field_p[var4], jb.field_k[this.field_r[param0] & 65535]);
          }
        }
    }

    private ss() {
        this.field_t = 0;
        this.field_W = 0;
        this.field_K = false;
        this.field_o = 0;
        this.field_O = 0;
    }

    ss(le param0, int param1, int param2, int param3, int param4, int param5) {
        int dupTemp$1 = 0;
        int incrementValue$0 = 0;
        int var7;
        int var8;
        int var9;
        int[] var9_ref_int__;
        int var10;
        int var11;
        int var12;
        sr var13;
        int var14;
        int var15;
        int var16;
        int[] var17;
        jea var18;
        jea var19;
        int[] var20;
        int var9Lifetime1;
        int var10Lifetime1;
        int var10Lifetime2;
        int var11Lifetime1;
        int var11Lifetime2;
        int var10Lifetime1Lifetime1;
        int var10Lifetime1Lifetime2;
        this.field_t = 0;
        this.field_W = 0;
        this.field_K = false;
        this.field_o = 0;
        this.field_O = 0;
        param0.b();
        param0.a();
        this.field_W = param0.field_d;
        this.field_O = param0.field_F;
        this.field_x = param0.field_l;
        this.field_J = param0.field_L;
        this.field_U = param0.field_H;
        this.field_o = param0.field_i;
        this.field_l = param0.field_p;
        this.field_n = param0.field_v;
        this.field_M = param0.field_J;
        this.field_A = param0.field_A;
        this.field_T = param0.field_q;
        var7 = (int)Math.sqrt((double)(param3 * param3 + param4 * param4 + param5 * param5));
        var8 = param2 * var7 >> 8;
        this.field_r = new int[this.field_o];
        this.field_i = new int[this.field_o];
        this.field_L = new int[this.field_o];
        if (param0.field_x != null) {
          this.field_P = new short[this.field_o];
          for (var9 = 0; var9 < this.field_o; var9++) {
            var10 = param0.field_x[var9];
            if (var10 != -1 &&
              jb.field_g.b(-23316, var10)) {
              this.field_P[var9] = (short)var10;
            } else {
              this.field_P[var9] = (short)-1;
            }
          }
        } else {
          this.field_P = null;
        }
        if (param0.field_u > 0 &&
          param0.field_s != null) {
          var20 = new int[param0.field_u];
          var17 = var20;
          var9_ref_int__ = var17;
          for (var10Lifetime1 = 0; var10Lifetime1 < this.field_o; var10Lifetime1++) {
            if (param0.field_s[var10Lifetime1] != -1) {
              dupTemp$1 = param0.field_s[var10Lifetime1] & 255;
              var9_ref_int__[dupTemp$1] = var9_ref_int__[dupTemp$1] + 1;
            }
          }
          this.field_t = 0;
          for (var10Lifetime1Lifetime1 = 0; var10Lifetime1Lifetime1 < param0.field_u; var10Lifetime1Lifetime1++) {
            if (var20[var10Lifetime1Lifetime1] > 0 &&
              param0.field_e[var10Lifetime1Lifetime1] == 0) {
              this.field_t = this.field_t + 1;
            }
          }
          this.field_G = new int[this.field_t];
          this.field_R = new int[this.field_t];
          this.field_N = new int[this.field_t];
          var10Lifetime1Lifetime2 = 0;
          for (var11 = 0; var11 < param0.field_u; var11++) {
            if (var20[var11] > 0 &&
              param0.field_e[var11] == 0) {
              this.field_G[var10Lifetime1Lifetime2] = param0.field_I[var11] & 65535;
              this.field_R[var10Lifetime1Lifetime2] = param0.field_w[var11] & 65535;
              this.field_N[var10Lifetime1Lifetime2] = param0.field_E[var11] & 65535;
              incrementValue$0 = var10Lifetime1Lifetime2;
              var10Lifetime1Lifetime2++;
              var9_ref_int__[var11] = incrementValue$0;
            } else {
              var20[var11] = -1;
            }
          }
          this.field_m = new byte[this.field_o];
          for (var11Lifetime2 = 0; var11Lifetime2 < this.field_o; var11Lifetime2++) {
            if (param0.field_s[var11Lifetime2] == -1) {
              this.field_m[var11Lifetime2] = (byte)-1;
            } else {
              this.field_m[var11Lifetime2] = (byte)var9_ref_int__[param0.field_s[var11Lifetime2] & 255];
              if (this.field_m[var11Lifetime2] == -1 &&
                this.field_P != null) {
                this.field_P[var11Lifetime2] = (short)-1;
              }
            }
          }
        }
        var16 = 0;
        var9Lifetime1 = var16;
        while (var16 < this.field_o) {
          if (param0.field_C != null) {
            var10Lifetime2 = param0.field_C[var16];
          } else {
            var10Lifetime2 = 0;
          }
          if (param0.field_q != null) {
            var11Lifetime1 = param0.field_q[var16];
          } else {
            var11Lifetime1 = 0;
          }
          if (this.field_P != null) {
            var12 = this.field_P[var16];
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
                this.field_L[var16] = -2;
              } else {
                var19 = param0.field_B[var16];
                var14 = param1 + (param3 * var19.field_b + param4 * var19.field_e + param5 * var19.field_a) / (var8 + var8 / 2);
                this.field_r[var16] = ss.c(var14);
                this.field_L[var16] = -1;
              }
            } else {
              if (param0.field_m != null &&
                param0.field_m[this.field_l[var16]] != null) {
                var13 = param0.field_m[this.field_l[var16]];
              } else {
                var13 = param0.field_D[this.field_l[var16]];
              }
              var14 = param1 + (param3 * var13.field_f + param4 * var13.field_h + param5 * var13.field_e) / (var8 * var13.field_g);
              this.field_r[var16] = ss.c(var14);
              if (param0.field_m != null &&
                param0.field_m[this.field_n[var16]] != null) {
                var13 = param0.field_m[this.field_n[var16]];
              } else {
                var13 = param0.field_D[this.field_n[var16]];
              }
              var14 = param1 + (param3 * var13.field_f + param4 * var13.field_h + param5 * var13.field_e) / (var8 * var13.field_g);
              this.field_i[var16] = ss.c(var14);
              if (param0.field_m != null &&
                param0.field_m[this.field_M[var16]] != null) {
                var13 = param0.field_m[this.field_M[var16]];
              } else {
                var13 = param0.field_D[this.field_M[var16]];
              }
              var14 = param1 + (param3 * var13.field_f + param4 * var13.field_h + param5 * var13.field_e) / (var8 * var13.field_g);
              this.field_L[var16] = ss.c(var14);
            }
          } else {
            if (var10Lifetime2 != 0) {
              if (var10Lifetime2 != 1) {
                if (var10Lifetime2 != 3) {
                  this.field_L[var16] = -2;
                } else {
                  this.field_r[var16] = 128;
                  this.field_L[var16] = -1;
                }
              } else {
                var18 = param0.field_B[var16];
                var14 = param1 + (param3 * var18.field_b + param4 * var18.field_e + param5 * var18.field_a) / (var8 + var8 / 2) << 17;
                this.field_r[var16] = var14 | ss.a(param0.field_z[var16] & 65535, var14 >> 17);
                this.field_L[var16] = -1;
              }
            } else {
              var15 = param0.field_z[var16] & 65535;
              if (param0.field_m != null &&
                param0.field_m[this.field_l[var16]] != null) {
                var13 = param0.field_m[this.field_l[var16]];
              } else {
                var13 = param0.field_D[this.field_l[var16]];
              }
              var14 = param1 + (param3 * var13.field_f + param4 * var13.field_h + param5 * var13.field_e) / (var8 * var13.field_g) << 17;
              this.field_r[var16] = var14 | ss.a(var15, var14 >> 17);
              if (param0.field_m != null &&
                param0.field_m[this.field_n[var16]] != null) {
                var13 = param0.field_m[this.field_n[var16]];
              } else {
                var13 = param0.field_D[this.field_n[var16]];
              }
              var14 = param1 + (param3 * var13.field_f + param4 * var13.field_h + param5 * var13.field_e) / (var8 * var13.field_g) << 17;
              this.field_i[var16] = var14 | ss.a(var15, var14 >> 17);
              if (param0.field_m != null &&
                param0.field_m[this.field_M[var16]] != null) {
                var13 = param0.field_m[this.field_M[var16]];
              } else {
                var13 = param0.field_D[this.field_M[var16]];
              }
              var14 = param1 + (param3 * var13.field_f + param4 * var13.field_h + param5 * var13.field_e) / (var8 * var13.field_g) << 17;
              this.field_L[var16] = var14 | ss.a(var15, var14 >> 17);
            }
          }
          var16++;
        }
    }

    static {
        ss discarded$0 = new ss();
        ss discarded$1 = new ss();
        ss discarded$2 = new ss();
        field_y = new int[4096];
        field_S = new int[12];
        field_c = new int[12];
        field_H = new int[4096];
        field_v = new int[4096];
        field_q = new int[10];
        field_u = new int[10];
        field_D = new boolean[4096];
        field_F = new int[4096];
        field_E = false;
        field_z = new boolean[4096];
        field_I = new int[4096];
        field_g = 0;
        field_p = new int[4096];
        field_B = new int[4096];
        if (field_E) {
          field_f = new int[4096];
          field_e = new int[4096];
        } else {
          field_j = new int[1600];
          field_k = new int[1600][64];
          field_w = new int[32];
          field_s = new int[32][512];
        }
        field_C = new int[12][4096];
        field_d = new int[4096];
        field_V = new int[10];
    }
}
