/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sc extends bj {
    private int[] field_h;
    private int[] field_z;
    private int[] field_e;
    private int[] field_o;
    private short field_B;
    private int[] field_t;
    private int[] field_g;
    private int field_R;
    private int[] field_Q;
    private byte[] field_q;
    private int[] field_U;
    private int field_I;
    private byte[] field_C;
    private int[] field_O;
    private short[] field_M;
    private int field_p;
    private boolean field_L;
    private int field_u;
    private int[] field_N;
    private int[] field_P;
    private int[] field_A;
    private byte[] field_s;
    private static int[] field_D;
    private static int[] field_V;
    private static int[] field_K;
    private static int[] field_F;
    private static int[] field_J;
    private static int[] field_v;
    private static int[] field_l;
    private static int[] field_n;
    private static int[] field_i;
    private static int[] field_S;
    private static int[] field_r;
    private static int[] field_j;
    private static int[] field_f;
    private static int[] field_d;
    private static boolean[] field_k;
    private static int[] field_G;
    private static boolean field_T;
    private static int field_m;
    private static int[][] field_H;
    private static int[][] field_E;
    private static int[] field_y;
    private static boolean[] field_W;
    private static int[][] field_w;
    private static int[] field_x;

    private final void a() {
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
        for (var9 = 0; var9 < this.field_R; var9++) {
          var10 = this.field_P[var9];
          var11 = this.field_e[var9];
          var12 = this.field_N[var9];
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
        this.field_B = (short)(int)(Math.sqrt((double)var8) + 0.99);
        this.field_L = true;
    }

    public static void b() {
        field_W = null;
        field_k = null;
        field_V = null;
        field_v = null;
        field_F = null;
        field_D = null;
        field_S = null;
        field_l = null;
        field_J = null;
        field_w = (int[][]) null;
        field_j = null;
        field_E = (int[][]) null;
        field_y = null;
        field_f = null;
        field_r = null;
        field_H = (int[][]) null;
        field_d = null;
        field_x = null;
        field_K = null;
        field_n = null;
        field_G = null;
        field_i = null;
    }

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

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, long param7) {
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
          if (!this.field_L) {
            this.a();
          }
          var10_int = cc.field_n;
          var11 = cc.field_p;
          var12 = cc.field_g[param0];
          var13 = cc.field_h[param0];
          var14 = cc.field_g[param1];
          var15 = cc.field_h[param1];
          var16 = cc.field_g[param2];
          var17 = cc.field_h[param2];
          var18 = cc.field_g[param3];
          var19 = cc.field_h[param3];
          var20 = param5 * var18 + param6 * var19 >> 16;
          for (var21 = 0; var21 < this.field_p; var21++) {
            var22 = this.field_P[var21];
            var23 = this.field_e[var21];
            var24 = this.field_N[var21];
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
            field_F[var21] = var24 - var20;
            field_V[var21] = var10_int + (var22 << 9) / var24;
            field_v[var21] = var11 + (var23Lifetime1 << 9) / var24;
            if (this.field_u > 0) {
              field_D[var21] = var22;
              field_S[var21] = var23Lifetime1;
              field_l[var21] = var24;
            }
          }
          this.a(false, param7 >= 0L ? true : false, param7, (int) this.field_B, this.field_B << 1);
        } catch (RuntimeException runtimeException) {
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
        if (!field_T) {
          for (var8 = 0; var8 < 1600; var8++) {
            field_J[var8] = 0;
          }
          for (var8Lifetime4 = 0; var8Lifetime4 < 32; var8Lifetime4++) {
            field_j[var8Lifetime4] = 0;
          }
          field_m = 0;
        }
        for (var8Lifetime1 = 0; var8Lifetime1 < this.field_I; var8Lifetime1++) {
          L45: {
            if (this.field_g[var8Lifetime1] != -2) {
              var9 = this.field_U[var8Lifetime1];
              var10 = this.field_O[var8Lifetime1];
              var11 = this.field_o[var8Lifetime1];
              var12 = field_V[var9];
              var13 = field_V[var10];
              var14_int = field_V[var11];
              if (param0 && (var12 == -5000 ||
                var13 == -5000 ||
                var14_int == -5000)) {
                var15_int = field_D[var9];
                var16 = field_D[var10];
                var17 = field_D[var11];
                var18 = field_S[var9];
                var19 = field_S[var10];
                var20 = field_S[var11];
                var21 = field_l[var9];
                var22 = field_l[var10];
                var23 = field_l[var11];
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
                  field_k[var8Lifetime1] = true;
                  if (field_T) {
                    field_y[var7] = (field_F[var9] + field_F[var10] + field_F[var11]) / 3;
                    incrementValue$12 = var7;
                    var7++;
                    field_f[incrementValue$12] = var8Lifetime1;
                  } else {
                    var27 = (field_F[var9] + field_F[var10] + field_F[var11]) / 3 + param3;
                    if (field_J[var27] < 64) {
                      dupTemp$10 = field_J[var27];
                      arrayValue$11 = field_w[var27];
                      field_J[var27] = dupTemp$10 + 1;
                      arrayValue$11[dupTemp$10] = var8Lifetime1;
                    } else {
                      var28 = field_J[var27];
                      if (var28 == 64) {
                        if (field_m == 512) {
                          break L45;
                        }
                        fieldTemp$7 = field_m;
                        field_m = field_m + 1;
                        var28 = 65 + fieldTemp$7;
                        field_J[var27] = 65 + fieldTemp$7;
                      }
                      var28 -= 65;
                      dupTemp$8 = field_j[var28];
                      arrayValue$9 = field_E[var28];
                      field_j[var28] = dupTemp$8 + 1;
                      arrayValue$9[dupTemp$8] = var8Lifetime1;
                    }
                  }
                }
                break L45;
              }
              if (param1 &&
                this.a(o.field_f + cc.field_n, tc.field_v + cc.field_p, field_v[var9], field_v[var10], field_v[var11], var12, var13, var14_int)) {
                fieldTemp$13 = db.field_c;
                db.field_c = db.field_c + 1;
                pl.field_Q[fieldTemp$13] = param2;
                param1 = false;
              }
              if ((var12 - var13) * (field_v[var11] - field_v[var10]) - (field_v[var9] - field_v[var10]) * (var14_int - var13) > 0) {
                field_k[var8Lifetime1] = false;
                if (var12 >= 0 &&
                  var13 >= 0 &&
                  var14_int >= 0 &&
                  var12 <= cc.field_m &&
                  var13 <= cc.field_m &&
                  var14_int <= cc.field_m) {
                  field_W[var8Lifetime1] = false;
                } else {
                  field_W[var8Lifetime1] = true;
                }
                if (!field_T) {
                  var15_intLifetime2 = (field_F[var9] + field_F[var10] + field_F[var11]) / 3 + param3;
                  if (field_J[var15_intLifetime2] >= 64) {
                    var16Lifetime2 = field_J[var15_intLifetime2];
                    if (var16Lifetime2 == 64) {
                      if (field_m == 512) {
                        break L45;
                      }
                      fieldTemp$14 = field_m;
                      field_m = field_m + 1;
                      var16Lifetime2 = 65 + fieldTemp$14;
                      field_J[var15_intLifetime2] = 65 + fieldTemp$14;
                    }
                    var16Lifetime2 -= 65;
                    dupTemp$15 = field_j[var16Lifetime2];
                    arrayValue$16 = field_E[var16Lifetime2];
                    field_j[var16Lifetime2] = dupTemp$15 + 1;
                    arrayValue$16[dupTemp$15] = var8Lifetime1;
                  } else {
                    dupTemp$17 = field_J[var15_intLifetime2];
                    arrayValue$18 = field_w[var15_intLifetime2];
                    field_J[var15_intLifetime2] = dupTemp$17 + 1;
                    arrayValue$18[dupTemp$17] = var8Lifetime1;
                  }
                } else {
                  field_y[var7] = (field_F[var9] + field_F[var10] + field_F[var11]) / 3;
                  incrementValue$19 = var7;
                  var7++;
                  field_f[incrementValue$19] = var8Lifetime1;
                }
              }
            }
          }
        }
        if (field_T) {
          q.a(1, 0, field_y, field_f, var7 - 1);
          if (this.field_C == null) {
            for (var8Lifetime2 = 0; var8Lifetime2 < var7; var8Lifetime2++) {
              this.d(field_f[var8Lifetime2]);
            }
            return;
          }
          for (var8Lifetime2 = 0; var8Lifetime2 < 12; var8Lifetime2++) {
            field_r[var8Lifetime2] = 0;
            field_K[var8Lifetime2] = 0;
          }
          for (var8Lifetime2 = 0; var8Lifetime2 < var7; var8Lifetime2++) {
            var9Lifetime1 = field_f[var8Lifetime2];
            var10Lifetime1 = field_y[var8Lifetime2];
            var11Lifetime1 = this.field_C[var9Lifetime1];
            dupTemp$2 = field_r[var11Lifetime1];
            field_r[var11Lifetime1] = dupTemp$2 + 1;
            var12Lifetime1 = dupTemp$2;
            field_H[var11Lifetime1][var12Lifetime1] = var9Lifetime1;
            if (var11Lifetime1 >= 10) {
              if (var11Lifetime1 != 10) {
                field_x[var12Lifetime1] = var10Lifetime1;
              } else {
                field_d[var12Lifetime1] = var10Lifetime1;
              }
            } else {
              field_K[var11Lifetime1] = field_K[var11Lifetime1] + var10Lifetime1;
            }
          }
        } else {
          if (this.field_C == null) {
            for (var8Lifetime2 = param4 - 1; var8Lifetime2 >= 0; var8Lifetime2--) {
              var9Lifetime1 = field_J[var8Lifetime2];
              if (var9Lifetime1 > 0) {
                stackIn_90_0 = (var9Lifetime1 <= 64) ? var9Lifetime1 : 64;
                var10Lifetime1 = stackIn_90_0;
                var45 = field_w[var8Lifetime2];
                for (var12Lifetime1 = 0; var12Lifetime1 < var10Lifetime1; var12Lifetime1++) {
                  this.d(var45[var12Lifetime1]);
                }
              }
              if (var9Lifetime1 > 64) {
                var10Lifetime1 = field_J[var8Lifetime2] - 64 - 1;
                var46 = field_E[var10Lifetime1];
                for (var12Lifetime1 = 0; var12Lifetime1 < field_j[var10Lifetime1]; var12Lifetime1++) {
                  this.d(var46[var12Lifetime1]);
                }
              }
            }
            return;
          }
          for (var8Lifetime2 = 0; var8Lifetime2 < 12; var8Lifetime2++) {
            field_r[var8Lifetime2] = 0;
            field_K[var8Lifetime2] = 0;
          }
          for (var8Lifetime2 = param4 - 1; var8Lifetime2 >= 0; var8Lifetime2--) {
            var9Lifetime1 = field_J[var8Lifetime2];
            if (var9Lifetime1 > 0) {
              if (var9Lifetime1 <= 64) {
                var10Lifetime1 = var9Lifetime1;
              } else {
                var10Lifetime1 = 64;
              }
              var47 = field_w[var8Lifetime2];
              for (var12Lifetime1 = 0; var12Lifetime1 < var10Lifetime1; var12Lifetime1++) {
                var13Lifetime1 = var47[var12Lifetime1];
                var14_intLifetime1 = this.field_C[var13Lifetime1];
                dupTemp$0 = field_r[var14_intLifetime1];
                field_r[var14_intLifetime1] = dupTemp$0 + 1;
                var15_intLifetime1 = dupTemp$0;
                field_H[var14_intLifetime1][var15_intLifetime1] = var13Lifetime1;
                if (var14_intLifetime1 >= 10) {
                  if (var14_intLifetime1 != 10) {
                    field_x[var15_intLifetime1] = var8Lifetime2;
                  } else {
                    field_d[var15_intLifetime1] = var8Lifetime2;
                  }
                } else {
                  field_K[var14_intLifetime1] = field_K[var14_intLifetime1] + var8Lifetime2;
                }
              }
            }
            if (var9Lifetime1 > 64) {
              var10Lifetime1 = field_J[var8Lifetime2] - 64 - 1;
              var48 = field_E[var10Lifetime1];
              for (var12Lifetime1 = 0; var12Lifetime1 < field_j[var10Lifetime1]; var12Lifetime1++) {
                var13Lifetime1Lifetime1 = var48[var12Lifetime1];
                var14_intLifetime1Lifetime1 = this.field_C[var13Lifetime1Lifetime1];
                dupTemp$1 = field_r[var14_intLifetime1Lifetime1];
                field_r[var14_intLifetime1Lifetime1] = dupTemp$1 + 1;
                var15_intLifetime1Lifetime1 = dupTemp$1;
                field_H[var14_intLifetime1Lifetime1][var15_intLifetime1Lifetime1] = var13Lifetime1Lifetime1;
                if (var14_intLifetime1Lifetime1 >= 10) {
                  if (var14_intLifetime1Lifetime1 != 10) {
                    field_x[var15_intLifetime1Lifetime1] = var8Lifetime2;
                  } else {
                    field_d[var15_intLifetime1Lifetime1] = var8Lifetime2;
                  }
                } else {
                  field_K[var14_intLifetime1Lifetime1] = field_K[var14_intLifetime1Lifetime1] + var8Lifetime2;
                }
              }
            }
          }
        }
        var8Lifetime3 = 0;
        if (!(field_r[1] <= 0) ||
          !(field_r[2] <= 0)) {
          var8Lifetime3 = (field_K[1] + field_K[2]) / (field_r[1] + field_r[2]);
        }
        var9Lifetime2 = 0;
        if (!(field_r[3] <= 0) ||
          !(field_r[4] <= 0)) {
          var9Lifetime2 = (field_K[3] + field_K[4]) / (field_r[3] + field_r[4]);
        }
        var10Lifetime2 = 0;
        if (!(field_r[6] <= 0) ||
          !(field_r[8] <= 0)) {
          var10Lifetime2 = (field_K[6] + field_K[8]) / (field_r[6] + field_r[8]);
        }
        var12Lifetime2 = 0;
        var13Lifetime2 = field_r[10];
        var14 = field_H[10];
        var15 = field_d;
        if (var12Lifetime2 == var13Lifetime2) {
          var12Lifetime2 = 0;
          var13Lifetime2 = field_r[11];
          var14 = field_H[11];
          var15 = field_x;
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
              this.d(var14[incrementValue$4]);
              if (var12Lifetime2 == var13Lifetime2 &&
                var14 != field_H[11]) {
                var12Lifetime2 = 0;
                var13Lifetime2 = field_r[11];
                var14 = field_H[11];
                var15 = field_x;
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
              this.d(var14[incrementValue$5]);
              if (var12Lifetime2 == var13Lifetime2 &&
                var14 != field_H[11]) {
                var12Lifetime2 = 0;
                var13Lifetime2 = field_r[11];
                var14 = field_H[11];
                var15 = field_x;
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
              this.d(var14[incrementValue$6]);
              if (var12Lifetime2 == var13Lifetime2 &&
                var14 != field_H[11]) {
                var12Lifetime2 = 0;
                var13Lifetime2 = field_r[11];
                var14 = field_H[11];
                var15 = field_x;
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
          var17Lifetime1 = field_r[var16Lifetime1];
          var49 = field_H[var16Lifetime1];
          var29 = 0;
          var19Lifetime1 = var29;
          while (var29 < var17Lifetime1) {
            this.d(var49[var29]);
            var29++;
          }
        }
        while (var11Lifetime2 != -1000) {
          incrementValue$3 = var12Lifetime2;
          var12Lifetime2++;
          this.d(var14[incrementValue$3]);
          if (var12Lifetime2 == var13Lifetime2 &&
            var14 != field_H[11]) {
            var12Lifetime2 = 0;
            var14 = field_H[11];
            var13Lifetime2 = field_r[11];
            var15 = field_x;
          }
          if (var12Lifetime2 >= var13Lifetime2) {
            var11Lifetime2 = -1000;
            continue;
          }
          var11Lifetime2 = var15[var12Lifetime2];
        }
        return;
    }

    private final void e(int param0) {
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
        var2 = cc.field_n;
        var3 = cc.field_p;
        var4 = 0;
        var5 = this.field_U[param0];
        var6 = this.field_O[param0];
        var7 = this.field_o[param0];
        var8 = field_l[var5];
        var9 = field_l[var6];
        var10 = field_l[var7];
        if (this.field_q != null) {
          cc.field_d = this.field_q[param0] & 255;
        } else {
          cc.field_d = 0;
        }
        if (var8 < 50) {
          var11 = field_D[var5];
          var12 = field_S[var5];
          var13 = this.field_z[param0] & 65535;
          if (var10 >= 50) {
            var14 = (50 - var8) * cc.field_l[var10 - var8];
            field_n[var4] = var2 + (var11 + ((field_D[var7] - var11) * var14 >> 16) << 9) / 50;
            field_G[var4] = var3 + (var12 + ((field_S[var7] - var12) * var14 >> 16) << 9) / 50;
            incrementValue$0 = var4;
            var4++;
            field_i[incrementValue$0] = var13 + (((this.field_g[param0] & 65535) - var13) * var14 >> 16);
          }
          if (var9 >= 50) {
            var14Lifetime4 = (50 - var8) * cc.field_l[var9 - var8];
            field_n[var4] = var2 + (var11 + ((field_D[var6] - var11) * var14Lifetime4 >> 16) << 9) / 50;
            field_G[var4] = var3 + (var12 + ((field_S[var6] - var12) * var14Lifetime4 >> 16) << 9) / 50;
            incrementValue$1 = var4;
            var4++;
            field_i[incrementValue$1] = var13 + (((this.field_A[param0] & 65535) - var13) * var14Lifetime4 >> 16);
          }
        } else {
          field_n[var4] = field_V[var5];
          field_G[var4] = field_v[var5];
          incrementValue$2 = var4;
          var4++;
          field_i[incrementValue$2] = this.field_z[param0] & 65535;
        }
        if (var9 < 50) {
          var11Lifetime1 = field_D[var6];
          var12Lifetime1 = field_S[var6];
          var13Lifetime1 = this.field_A[param0] & 65535;
          if (var8 >= 50) {
            var14Lifetime1 = (50 - var9) * cc.field_l[var8 - var9];
            field_n[var4] = var2 + (var11Lifetime1 + ((field_D[var5] - var11Lifetime1) * var14Lifetime1 >> 16) << 9) / 50;
            field_G[var4] = var3 + (var12Lifetime1 + ((field_S[var5] - var12Lifetime1) * var14Lifetime1 >> 16) << 9) / 50;
            incrementValue$3 = var4;
            var4++;
            field_i[incrementValue$3] = var13Lifetime1 + (((this.field_z[param0] & 65535) - var13Lifetime1) * var14Lifetime1 >> 16);
          }
          if (var10 >= 50) {
            var14Lifetime1Lifetime1 = (50 - var9) * cc.field_l[var10 - var9];
            field_n[var4] = var2 + (var11Lifetime1 + ((field_D[var7] - var11Lifetime1) * var14Lifetime1Lifetime1 >> 16) << 9) / 50;
            field_G[var4] = var3 + (var12Lifetime1 + ((field_S[var7] - var12Lifetime1) * var14Lifetime1Lifetime1 >> 16) << 9) / 50;
            incrementValue$4 = var4;
            var4++;
            field_i[incrementValue$4] = var13Lifetime1 + (((this.field_g[param0] & 65535) - var13Lifetime1) * var14Lifetime1Lifetime1 >> 16);
          }
        } else {
          field_n[var4] = field_V[var6];
          field_G[var4] = field_v[var6];
          incrementValue$5 = var4;
          var4++;
          field_i[incrementValue$5] = this.field_A[param0] & 65535;
        }
        if (var10 < 50) {
          var11Lifetime2 = field_D[var7];
          var12Lifetime2 = field_S[var7];
          var13Lifetime2 = this.field_g[param0] & 65535;
          if (var9 >= 50) {
            var14Lifetime2 = (50 - var10) * cc.field_l[var9 - var10];
            field_n[var4] = var2 + (var11Lifetime2 + ((field_D[var6] - var11Lifetime2) * var14Lifetime2 >> 16) << 9) / 50;
            field_G[var4] = var3 + (var12Lifetime2 + ((field_S[var6] - var12Lifetime2) * var14Lifetime2 >> 16) << 9) / 50;
            incrementValue$6 = var4;
            var4++;
            field_i[incrementValue$6] = var13Lifetime2 + (((this.field_A[param0] & 65535) - var13Lifetime2) * var14Lifetime2 >> 16);
          }
          if (var8 >= 50) {
            var14Lifetime2Lifetime1 = (50 - var10) * cc.field_l[var8 - var10];
            field_n[var4] = var2 + (var11Lifetime2 + ((field_D[var5] - var11Lifetime2) * var14Lifetime2Lifetime1 >> 16) << 9) / 50;
            field_G[var4] = var3 + (var12Lifetime2 + ((field_S[var5] - var12Lifetime2) * var14Lifetime2Lifetime1 >> 16) << 9) / 50;
            incrementValue$7 = var4;
            var4++;
            field_i[incrementValue$7] = var13Lifetime2 + (((this.field_z[param0] & 65535) - var13Lifetime2) * var14Lifetime2Lifetime1 >> 16);
          }
        } else {
          field_n[var4] = field_V[var7];
          field_G[var4] = field_v[var7];
          incrementValue$8 = var4;
          var4++;
          field_i[incrementValue$8] = this.field_g[param0] & 65535;
        }
        boolean decompiledFrameRemainder0 = true;
        var11Lifetime3 = field_n[0];
        var12Lifetime3 = field_n[1];
        var13Lifetime3 = field_n[2];
        var14Lifetime3 = field_G[0];
        var15 = field_G[1];
        var16 = field_G[2];
        cc.field_q = false;
        if (var4 == 3) {
          if (var11Lifetime3 < 0 ||
            var12Lifetime3 < 0 ||
            var13Lifetime3 < 0 ||
            !(var11Lifetime3 <= cc.field_m) ||
            !(var12Lifetime3 <= cc.field_m) ||
            !(var13Lifetime3 <= cc.field_m)) {
            cc.field_q = true;
          }
          if (this.field_M != null &&
            this.field_M[param0] != -1) {
            if (this.field_s != null &&
              this.field_s[param0] != -1) {
              var20 = this.field_s[param0] & 255;
              var17 = this.field_Q[var20];
              var18 = this.field_t[var20];
              var19 = this.field_h[var20];
            } else {
              var17 = var5;
              var18 = var6;
              var19 = var7;
            }
            if (this.field_g[param0] != -1) {
              cc.a(var14Lifetime3, var15, var16, var11Lifetime3, var12Lifetime3, var13Lifetime3, field_i[0], field_i[1], field_i[2], field_D[var17], field_D[var18], field_D[var19], field_S[var17], field_S[var18], field_S[var19], field_l[var17], field_l[var18], field_l[var19], (int) this.field_M[param0]);
            } else {
              cc.a(var14Lifetime3, var15, var16, var11Lifetime3, var12Lifetime3, var13Lifetime3, this.field_z[param0], this.field_z[param0], this.field_z[param0], field_D[var17], field_D[var18], field_D[var19], field_S[var17], field_S[var18], field_S[var19], field_l[var17], field_l[var18], field_l[var19], (int) this.field_M[param0]);
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (this.field_g[param0] != -1) {
              cc.a(var14Lifetime3, var15, var16, var11Lifetime3, var12Lifetime3, var13Lifetime3, field_i[0], field_i[1], field_i[2]);
            } else {
              cc.a(var14Lifetime3, var15, var16, var11Lifetime3, var12Lifetime3, var13Lifetime3, cc.field_e[this.field_z[param0] & 65535]);
            }
          }
        }
        if (var4 != 4) {
          return;
        }
        if (var11Lifetime3 < 0 ||
          var12Lifetime3 < 0 ||
          var13Lifetime3 < 0 ||
          !(var11Lifetime3 <= cc.field_m) ||
          !(var12Lifetime3 <= cc.field_m) ||
          !(var13Lifetime3 <= cc.field_m) ||
          !(field_n[3] >= 0) ||
          !(field_n[3] <= cc.field_m)) {
          cc.field_q = true;
        }
        if (this.field_M != null &&
          this.field_M[param0] != -1) {
          if (this.field_s != null &&
            this.field_s[param0] != -1) {
            var20Lifetime1 = this.field_s[param0] & 255;
            var17Lifetime1 = this.field_Q[var20Lifetime1];
            var18Lifetime1 = this.field_t[var20Lifetime1];
            var19Lifetime1 = this.field_h[var20Lifetime1];
          } else {
            var17Lifetime1 = var5;
            var18Lifetime1 = var6;
            var19Lifetime1 = var7;
          }
          var20Lifetime1Lifetime1 = this.field_M[param0];
          if (this.field_g[param0] != -1) {
            cc.a(var14Lifetime3, var15, var16, var11Lifetime3, var12Lifetime3, var13Lifetime3, field_i[0], field_i[1], field_i[2], field_D[var17Lifetime1], field_D[var18Lifetime1], field_D[var19Lifetime1], field_S[var17Lifetime1], field_S[var18Lifetime1], field_S[var19Lifetime1], field_l[var17Lifetime1], field_l[var18Lifetime1], field_l[var19Lifetime1], var20Lifetime1Lifetime1);
            cc.a(var14Lifetime3, var16, field_G[3], var11Lifetime3, var13Lifetime3, field_n[3], field_i[0], field_i[2], field_i[3], field_D[var17Lifetime1], field_D[var18Lifetime1], field_D[var19Lifetime1], field_S[var17Lifetime1], field_S[var18Lifetime1], field_S[var19Lifetime1], field_l[var17Lifetime1], field_l[var18Lifetime1], field_l[var19Lifetime1], var20Lifetime1Lifetime1);
          } else {
            cc.a(var14Lifetime3, var15, var16, var11Lifetime3, var12Lifetime3, var13Lifetime3, this.field_z[param0], this.field_z[param0], this.field_z[param0], field_D[var17Lifetime1], field_D[var18Lifetime1], field_D[var19Lifetime1], field_S[var17Lifetime1], field_S[var18Lifetime1], field_S[var19Lifetime1], field_l[var17Lifetime1], field_l[var18Lifetime1], field_l[var19Lifetime1], var20Lifetime1Lifetime1);
            cc.a(var14Lifetime3, var16, field_G[3], var11Lifetime3, var13Lifetime3, field_n[3], this.field_z[param0], this.field_z[param0], this.field_z[param0], field_D[var17Lifetime1], field_D[var18Lifetime1], field_D[var19Lifetime1], field_S[var17Lifetime1], field_S[var18Lifetime1], field_S[var19Lifetime1], field_l[var17Lifetime1], field_l[var18Lifetime1], field_l[var19Lifetime1], var20Lifetime1Lifetime1);
          }
        } else {
          if (this.field_g[param0] != -1) {
            cc.a(var14Lifetime3, var15, var16, var11Lifetime3, var12Lifetime3, var13Lifetime3, field_i[0], field_i[1], field_i[2]);
            cc.a(var14Lifetime3, var16, field_G[3], var11Lifetime3, var13Lifetime3, field_n[3], field_i[0], field_i[2], field_i[3]);
          } else {
            var17Lifetime1 = cc.field_e[this.field_z[param0] & 65535];
            cc.a(var14Lifetime3, var15, var16, var11Lifetime3, var12Lifetime3, var13Lifetime3, var17Lifetime1);
            cc.a(var14Lifetime3, var16, field_G[3], var11Lifetime3, var13Lifetime3, field_n[3], var17Lifetime1);
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

    private final void d(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        if (field_k[param0]) {
          this.e(param0);
          return;
        }
        var2 = this.field_U[param0];
        var3 = this.field_O[param0];
        var4 = this.field_o[param0];
        cc.field_q = field_W[param0];
        if (this.field_q != null) {
          cc.field_d = this.field_q[param0] & 255;
        } else {
          cc.field_d = 0;
        }
        if (this.field_M != null &&
          this.field_M[param0] != -1) {
          if (this.field_s != null &&
            this.field_s[param0] != -1) {
            var8 = this.field_s[param0] & 255;
            var5 = this.field_Q[var8];
            var6 = this.field_t[var8];
            var7 = this.field_h[var8];
          } else {
            var5 = var2;
            var6 = var3;
            var7 = var4;
          }
          if (this.field_g[param0] != -1) {
            cc.a(field_v[var2], field_v[var3], field_v[var4], field_V[var2], field_V[var3], field_V[var4], this.field_z[param0], this.field_A[param0], this.field_g[param0], field_D[var5], field_D[var6], field_D[var7], field_S[var5], field_S[var6], field_S[var7], field_l[var5], field_l[var6], field_l[var7], (int) this.field_M[param0]);
          } else {
            cc.a(field_v[var2], field_v[var3], field_v[var4], field_V[var2], field_V[var3], field_V[var4], this.field_z[param0], this.field_z[param0], this.field_z[param0], field_D[var5], field_D[var6], field_D[var7], field_S[var5], field_S[var6], field_S[var7], field_l[var5], field_l[var6], field_l[var7], (int) this.field_M[param0]);
          }
        } else {
          if (this.field_g[param0] != -1) {
            cc.a(field_v[var2], field_v[var3], field_v[var4], field_V[var2], field_V[var3], field_V[var4], this.field_z[param0] & 65535, this.field_A[param0] & 65535, this.field_g[param0] & 65535);
          } else {
            cc.a(field_v[var2], field_v[var3], field_v[var4], field_V[var2], field_V[var3], field_V[var4], cc.field_e[this.field_z[param0] & 65535]);
          }
        }
    }

    private sc() {
        this.field_I = 0;
        this.field_R = 0;
        this.field_p = 0;
        this.field_u = 0;
        this.field_L = false;
    }

    sc(pa param0, int param1, int param2, int param3, int param4, int param5) {
        int dupTemp$1 = 0;
        int incrementValue$0 = 0;
        int var7;
        int var8;
        int var9;
        int[] var9_ref_int__;
        int var10;
        int var11;
        int var12;
        nk var13;
        int var14;
        int var15;
        int var16;
        int[] var17;
        l var18;
        l var19;
        int[] var20;
        int var9Lifetime1;
        int var10Lifetime1;
        int var10Lifetime2;
        int var11Lifetime1;
        int var11Lifetime2;
        int var10Lifetime1Lifetime1;
        int var10Lifetime1Lifetime2;
        this.field_I = 0;
        this.field_R = 0;
        this.field_p = 0;
        this.field_u = 0;
        this.field_L = false;
        param0.a();
        param0.b();
        this.field_p = param0.field_m;
        this.field_R = param0.field_v;
        this.field_P = param0.field_g;
        this.field_e = param0.field_F;
        this.field_N = param0.field_C;
        this.field_I = param0.field_h;
        this.field_U = param0.field_z;
        this.field_O = param0.field_E;
        this.field_o = param0.field_G;
        this.field_C = param0.field_x;
        this.field_q = param0.field_j;
        var7 = (int)Math.sqrt((double)(param3 * param3 + param4 * param4 + param5 * param5));
        var8 = param2 * var7 >> 8;
        this.field_z = new int[this.field_I];
        this.field_A = new int[this.field_I];
        this.field_g = new int[this.field_I];
        if (param0.field_D != null) {
          this.field_M = new short[this.field_I];
          for (var9 = 0; var9 < this.field_I; var9++) {
            var10 = param0.field_D[var9];
            if (var10 != -1 &&
              cc.field_k.a(var10, (byte) 114)) {
              this.field_M[var9] = (short)var10;
            } else {
              this.field_M[var9] = (short)-1;
            }
          }
        } else {
          this.field_M = null;
        }
        if (param0.field_L > 0 &&
          param0.field_J != null) {
          var20 = new int[param0.field_L];
          var17 = var20;
          var9_ref_int__ = var17;
          for (var10Lifetime1 = 0; var10Lifetime1 < this.field_I; var10Lifetime1++) {
            if (param0.field_J[var10Lifetime1] != -1) {
              dupTemp$1 = param0.field_J[var10Lifetime1] & 255;
              var9_ref_int__[dupTemp$1] = var9_ref_int__[dupTemp$1] + 1;
            }
          }
          this.field_u = 0;
          for (var10Lifetime1Lifetime1 = 0; var10Lifetime1Lifetime1 < param0.field_L; var10Lifetime1Lifetime1++) {
            if (var20[var10Lifetime1Lifetime1] > 0 &&
              param0.field_i[var10Lifetime1Lifetime1] == 0) {
              this.field_u = this.field_u + 1;
            }
          }
          this.field_Q = new int[this.field_u];
          this.field_t = new int[this.field_u];
          this.field_h = new int[this.field_u];
          var10Lifetime1Lifetime2 = 0;
          for (var11 = 0; var11 < param0.field_L; var11++) {
            if (var20[var11] > 0 &&
              param0.field_i[var11] == 0) {
              this.field_Q[var10Lifetime1Lifetime2] = param0.field_B[var11] & 65535;
              this.field_t[var10Lifetime1Lifetime2] = param0.field_w[var11] & 65535;
              this.field_h[var10Lifetime1Lifetime2] = param0.field_k[var11] & 65535;
              incrementValue$0 = var10Lifetime1Lifetime2;
              var10Lifetime1Lifetime2++;
              var9_ref_int__[var11] = incrementValue$0;
            } else {
              var20[var11] = -1;
            }
          }
          this.field_s = new byte[this.field_I];
          for (var11Lifetime2 = 0; var11Lifetime2 < this.field_I; var11Lifetime2++) {
            if (param0.field_J[var11Lifetime2] == -1) {
              this.field_s[var11Lifetime2] = (byte)-1;
            } else {
              this.field_s[var11Lifetime2] = (byte)var9_ref_int__[param0.field_J[var11Lifetime2] & 255];
              if (this.field_s[var11Lifetime2] == -1 &&
                this.field_M != null) {
                this.field_M[var11Lifetime2] = (short)-1;
              }
            }
          }
        }
        var16 = 0;
        var9Lifetime1 = var16;
        while (var16 < this.field_I) {
          if (param0.field_q != null) {
            var10Lifetime2 = param0.field_q[var16];
          } else {
            var10Lifetime2 = 0;
          }
          if (param0.field_j != null) {
            var11Lifetime1 = param0.field_j[var16];
          } else {
            var11Lifetime1 = 0;
          }
          if (this.field_M != null) {
            var12 = this.field_M[var16];
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
                this.field_g[var16] = -2;
              } else {
                var19 = param0.field_l[var16];
                var14 = param1 + (param3 * var19.field_i + param4 * var19.field_c + param5 * var19.field_a) / (var8 + var8 / 2);
                this.field_z[var16] = sc.c(var14);
                this.field_g[var16] = -1;
              }
            } else {
              if (param0.field_s != null &&
                param0.field_s[this.field_U[var16]] != null) {
                var13 = param0.field_s[this.field_U[var16]];
              } else {
                var13 = param0.field_u[this.field_U[var16]];
              }
              var14 = param1 + (param3 * var13.field_e + param4 * var13.field_d + param5 * var13.field_f) / (var8 * var13.field_g);
              this.field_z[var16] = sc.c(var14);
              if (param0.field_s != null &&
                param0.field_s[this.field_O[var16]] != null) {
                var13 = param0.field_s[this.field_O[var16]];
              } else {
                var13 = param0.field_u[this.field_O[var16]];
              }
              var14 = param1 + (param3 * var13.field_e + param4 * var13.field_d + param5 * var13.field_f) / (var8 * var13.field_g);
              this.field_A[var16] = sc.c(var14);
              if (param0.field_s != null &&
                param0.field_s[this.field_o[var16]] != null) {
                var13 = param0.field_s[this.field_o[var16]];
              } else {
                var13 = param0.field_u[this.field_o[var16]];
              }
              var14 = param1 + (param3 * var13.field_e + param4 * var13.field_d + param5 * var13.field_f) / (var8 * var13.field_g);
              this.field_g[var16] = sc.c(var14);
            }
          } else {
            if (var10Lifetime2 != 0) {
              if (var10Lifetime2 != 1) {
                if (var10Lifetime2 != 3) {
                  this.field_g[var16] = -2;
                } else {
                  this.field_z[var16] = 128;
                  this.field_g[var16] = -1;
                }
              } else {
                var18 = param0.field_l[var16];
                var14 = param1 + (param3 * var18.field_i + param4 * var18.field_c + param5 * var18.field_a) / (var8 + var8 / 2) << 17;
                this.field_z[var16] = var14 | sc.a(param0.field_I[var16] & 65535, var14 >> 17);
                this.field_g[var16] = -1;
              }
            } else {
              var15 = param0.field_I[var16] & 65535;
              if (param0.field_s != null &&
                param0.field_s[this.field_U[var16]] != null) {
                var13 = param0.field_s[this.field_U[var16]];
              } else {
                var13 = param0.field_u[this.field_U[var16]];
              }
              var14 = param1 + (param3 * var13.field_e + param4 * var13.field_d + param5 * var13.field_f) / (var8 * var13.field_g) << 17;
              this.field_z[var16] = var14 | sc.a(var15, var14 >> 17);
              if (param0.field_s != null &&
                param0.field_s[this.field_O[var16]] != null) {
                var13 = param0.field_s[this.field_O[var16]];
              } else {
                var13 = param0.field_u[this.field_O[var16]];
              }
              var14 = param1 + (param3 * var13.field_e + param4 * var13.field_d + param5 * var13.field_f) / (var8 * var13.field_g) << 17;
              this.field_A[var16] = var14 | sc.a(var15, var14 >> 17);
              if (param0.field_s != null &&
                param0.field_s[this.field_o[var16]] != null) {
                var13 = param0.field_s[this.field_o[var16]];
              } else {
                var13 = param0.field_u[this.field_o[var16]];
              }
              var14 = param1 + (param3 * var13.field_e + param4 * var13.field_d + param5 * var13.field_f) / (var8 * var13.field_g) << 17;
              this.field_g[var16] = var14 | sc.a(var15, var14 >> 17);
            }
          }
          var16++;
        }
    }

    static {
        sc discarded$0 = new sc();
        sc discarded$1 = new sc();
        sc discarded$2 = new sc();
        field_V = new int[4096];
        field_i = new int[10];
        field_S = new int[4096];
        field_l = new int[4096];
        field_v = new int[4096];
        field_d = new int[4096];
        field_K = new int[12];
        field_D = new int[4096];
        field_T = false;
        field_r = new int[12];
        field_G = new int[10];
        field_F = new int[4096];
        field_H = new int[12][4096];
        if (field_T) {
          field_y = new int[4096];
          field_f = new int[4096];
        } else {
          field_J = new int[1600];
          field_w = new int[1600][64];
          field_j = new int[32];
          field_E = new int[32][512];
        }
        field_m = 0;
        field_W = new boolean[4096];
        field_n = new int[10];
        field_k = new boolean[4096];
        field_x = new int[4096];
    }
}
