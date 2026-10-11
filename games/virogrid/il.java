/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class il extends cn {
    private short field_A;
    private int[] field_C;
    private int[] field_t;
    private int[] field_E;
    private byte[] field_z;
    private byte[] field_Y;
    private short[] field_ab;
    private int field_F;
    private int field_m;
    private int[] field_u;
    private int[] field_X;
    private int[] field_R;
    private int field_Q;
    private int field_S;
    private int[] field_Z;
    private boolean field_K;
    private int[] field_l;
    private int[] field_q;
    private byte[] field_M;
    private static int[] field_U;
    private static int[] field_w;
    private static boolean[] field_x;
    private static int[] field_W;
    static int field_p;
    private static boolean[] field_N;
    private static int[] field_J;
    private static int[] field_O;
    private static int[] field_H;
    private static int[] field_v;
    static int field_B;
    private int[] field_D;
    private static boolean field_e;
    static int field_I;
    private static int[] field_j;
    private static int[] field_h;
    private static int[] field_s;
    private static int[] field_f;
    private static int[] field_i;
    private static int[] field_g;
    private static int[][] field_P;
    private int[] field_n;
    private static int[][] field_L;
    private static int[] field_bb;
    private static int[][] field_y;
    private int[] field_V;
    private static int field_cb;
    private static int[] field_G;
    static int field_k;
    private static int[] field_r;
    private static int[] field_T;
    private static int field_o;

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
        field_cb = 0;
        if (!this.field_K) {
          this.d();
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
        if (var5 < 50 - this.field_A) {
          return;
        }
        var15Lifetime2 = this.field_A * 92682 >> 16;
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
        stackIn_15_0 = (var5 > 50 + this.field_A) ? 0 : 1;
        var16 = stackIn_15_0;
        if (var16 == 0) {
          stackIn_21_0 = (this.field_S > 0) ? 1 : 0;
        } else {
          stackIn_21_0 = 1;
        }
        var17Lifetime2 = stackIn_21_0;
        var18Lifetime1 = fk.field_j;
        var19Lifetime1 = fk.field_k;
        var20 = 0;
        var27 = 0;
        var21_intLifetime1 = var27;
        while (var27 < this.field_Q) {
          var22Lifetime1 = this.field_u[var27];
          var23Lifetime1 = this.field_l[var27];
          var24 = this.field_X[var27];
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
            field_j[var27] = -5000;
            var20 = 1;
          } else {
            field_j[var27] = var18Lifetime1 + (var22Lifetime1Lifetime1 << 9) / var24;
            field_O[var27] = var19Lifetime1 + (var23Lifetime1Lifetime1 << 9) / var24;
          }
          if (var17Lifetime2 != 0) {
            field_w[var27] = var22Lifetime1Lifetime1;
            field_H[var27] = var23Lifetime1Lifetime1;
            field_J[var27] = var24;
          }
          var27++;
        }
        try {
          this.a((var20 & var16) != 0, false, 0L, (int) this.field_A, this.field_A << 1);
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var21 = (Exception) (Object) decompiledCaughtException;
        }
        return;
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
        field_cb = param4;
        var7 = 0;
        if (!field_e) {
          for (var8 = 0; var8 < 1600; var8++) {
            field_v[var8] = 0;
          }
          for (var8Lifetime4 = 0; var8Lifetime4 < 32; var8Lifetime4++) {
            field_i[var8Lifetime4] = 0;
          }
          field_o = 0;
        }
        for (var8Lifetime1 = 0; var8Lifetime1 < this.field_F; var8Lifetime1++) {
          L45: {
            if (this.field_R[var8Lifetime1] != -2) {
              var9 = this.field_C[var8Lifetime1];
              var10 = this.field_n[var8Lifetime1];
              var11 = this.field_D[var8Lifetime1];
              var12 = field_j[var9];
              var13 = field_j[var10];
              var14_int = field_j[var11];
              if (param0 && (var12 == -5000 ||
                var13 == -5000 ||
                var14_int == -5000)) {
                var15_int = field_w[var9];
                var16 = field_w[var10];
                var17 = field_w[var11];
                var18 = field_H[var9];
                var19 = field_H[var10];
                var20 = field_H[var11];
                var21 = field_J[var9];
                var22 = field_J[var10];
                var23 = field_J[var11];
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
                  field_x[var8Lifetime1] = true;
                  if (field_e) {
                    field_U[var7] = (field_g[var9] + field_g[var10] + field_g[var11]) / 3;
                    incrementValue$12 = var7;
                    var7++;
                    field_G[incrementValue$12] = var8Lifetime1;
                  } else {
                    var27 = (field_g[var9] + field_g[var10] + field_g[var11]) / 3 + param3;
                    if (field_v[var27] < 64) {
                      dupTemp$10 = field_v[var27];
                      arrayValue$11 = field_L[var27];
                      field_v[var27] = dupTemp$10 + 1;
                      arrayValue$11[dupTemp$10] = var8Lifetime1;
                    } else {
                      var28 = field_v[var27];
                      if (var28 == 64) {
                        if (field_o == 512) {
                          break L45;
                        }
                        fieldTemp$7 = field_o;
                        field_o = field_o + 1;
                        var28 = 65 + fieldTemp$7;
                        field_v[var27] = 65 + fieldTemp$7;
                      }
                      var28 -= 65;
                      dupTemp$8 = field_i[var28];
                      arrayValue$9 = field_y[var28];
                      field_i[var28] = dupTemp$8 + 1;
                      arrayValue$9[dupTemp$8] = var8Lifetime1;
                    }
                  }
                }
                break L45;
              }
              if (param1 &&
                this.a(eh.field_n + fk.field_j, wm.field_F + fk.field_k, field_O[var9], field_O[var10], field_O[var11], var12, var13, var14_int)) {
                fieldTemp$13 = w.field_K;
                w.field_K = w.field_K + 1;
                bc.field_b[fieldTemp$13] = param2;
                param1 = false;
              }
              if ((var12 - var13) * (field_O[var11] - field_O[var10]) - (field_O[var9] - field_O[var10]) * (var14_int - var13) > 0) {
                field_x[var8Lifetime1] = false;
                if (var12 >= 0 &&
                  var13 >= 0 &&
                  var14_int >= 0 &&
                  var12 <= fk.field_o &&
                  var13 <= fk.field_o &&
                  var14_int <= fk.field_o) {
                  field_N[var8Lifetime1] = false;
                } else {
                  field_N[var8Lifetime1] = true;
                }
                if (!field_e) {
                  var15_intLifetime2 = (field_g[var9] + field_g[var10] + field_g[var11]) / 3 + param3;
                  if (field_v[var15_intLifetime2] >= 64) {
                    var16Lifetime2 = field_v[var15_intLifetime2];
                    if (var16Lifetime2 == 64) {
                      if (field_o == 512) {
                        break L45;
                      }
                      fieldTemp$14 = field_o;
                      field_o = field_o + 1;
                      var16Lifetime2 = 65 + fieldTemp$14;
                      field_v[var15_intLifetime2] = 65 + fieldTemp$14;
                    }
                    var16Lifetime2 -= 65;
                    dupTemp$15 = field_i[var16Lifetime2];
                    arrayValue$16 = field_y[var16Lifetime2];
                    field_i[var16Lifetime2] = dupTemp$15 + 1;
                    arrayValue$16[dupTemp$15] = var8Lifetime1;
                  } else {
                    dupTemp$17 = field_v[var15_intLifetime2];
                    arrayValue$18 = field_L[var15_intLifetime2];
                    field_v[var15_intLifetime2] = dupTemp$17 + 1;
                    arrayValue$18[dupTemp$17] = var8Lifetime1;
                  }
                } else {
                  field_U[var7] = (field_g[var9] + field_g[var10] + field_g[var11]) / 3;
                  incrementValue$19 = var7;
                  var7++;
                  field_G[incrementValue$19] = var8Lifetime1;
                }
              }
            }
          }
        }
        if (field_e) {
          ij.a(field_U, 0, 34, var7 - 1, field_G);
          if (this.field_M == null) {
            for (var8Lifetime2 = 0; var8Lifetime2 < var7; var8Lifetime2++) {
              this.a(field_G[var8Lifetime2]);
            }
            return;
          }
          for (var8Lifetime2 = 0; var8Lifetime2 < 12; var8Lifetime2++) {
            field_T[var8Lifetime2] = 0;
            field_W[var8Lifetime2] = 0;
          }
          for (var8Lifetime2 = 0; var8Lifetime2 < var7; var8Lifetime2++) {
            var9Lifetime1 = field_G[var8Lifetime2];
            var10Lifetime1 = field_U[var8Lifetime2];
            var11Lifetime1 = this.field_M[var9Lifetime1];
            dupTemp$2 = field_T[var11Lifetime1];
            field_T[var11Lifetime1] = dupTemp$2 + 1;
            var12Lifetime1 = dupTemp$2;
            field_P[var11Lifetime1][var12Lifetime1] = var9Lifetime1;
            if (var11Lifetime1 >= 10) {
              if (var11Lifetime1 != 10) {
                field_bb[var12Lifetime1] = var10Lifetime1;
              } else {
                field_r[var12Lifetime1] = var10Lifetime1;
              }
            } else {
              field_W[var11Lifetime1] = field_W[var11Lifetime1] + var10Lifetime1;
            }
          }
        } else {
          if (this.field_M == null) {
            for (var8Lifetime2 = param4 - 1; var8Lifetime2 >= 0; var8Lifetime2--) {
              var9Lifetime1 = field_v[var8Lifetime2];
              if (var9Lifetime1 > 0) {
                stackIn_88_0 = (var9Lifetime1 <= 64) ? var9Lifetime1 : 64;
                var10Lifetime1 = stackIn_88_0;
                var45 = field_L[var8Lifetime2];
                for (var12Lifetime1 = 0; var12Lifetime1 < var10Lifetime1; var12Lifetime1++) {
                  this.a(var45[var12Lifetime1]);
                }
              }
              if (var9Lifetime1 > 64) {
                var10Lifetime1 = field_v[var8Lifetime2] - 64 - 1;
                var46 = field_y[var10Lifetime1];
                for (var12Lifetime1 = 0; var12Lifetime1 < field_i[var10Lifetime1]; var12Lifetime1++) {
                  this.a(var46[var12Lifetime1]);
                }
              }
            }
            return;
          }
          for (var8Lifetime2 = 0; var8Lifetime2 < 12; var8Lifetime2++) {
            field_T[var8Lifetime2] = 0;
            field_W[var8Lifetime2] = 0;
          }
          for (var8Lifetime2 = param4 - 1; var8Lifetime2 >= 0; var8Lifetime2--) {
            var9Lifetime1 = field_v[var8Lifetime2];
            if (var9Lifetime1 > 0) {
              if (var9Lifetime1 <= 64) {
                var10Lifetime1 = var9Lifetime1;
              } else {
                var10Lifetime1 = 64;
              }
              var47 = field_L[var8Lifetime2];
              for (var12Lifetime1 = 0; var12Lifetime1 < var10Lifetime1; var12Lifetime1++) {
                var13Lifetime1 = var47[var12Lifetime1];
                var14_intLifetime1 = this.field_M[var13Lifetime1];
                dupTemp$0 = field_T[var14_intLifetime1];
                field_T[var14_intLifetime1] = dupTemp$0 + 1;
                var15_intLifetime1 = dupTemp$0;
                field_P[var14_intLifetime1][var15_intLifetime1] = var13Lifetime1;
                if (var14_intLifetime1 >= 10) {
                  if (var14_intLifetime1 != 10) {
                    field_bb[var15_intLifetime1] = var8Lifetime2;
                  } else {
                    field_r[var15_intLifetime1] = var8Lifetime2;
                  }
                } else {
                  field_W[var14_intLifetime1] = field_W[var14_intLifetime1] + var8Lifetime2;
                }
              }
            }
            if (var9Lifetime1 > 64) {
              var10Lifetime1 = field_v[var8Lifetime2] - 64 - 1;
              var48 = field_y[var10Lifetime1];
              for (var12Lifetime1 = 0; var12Lifetime1 < field_i[var10Lifetime1]; var12Lifetime1++) {
                var13Lifetime1Lifetime1 = var48[var12Lifetime1];
                var14_intLifetime1Lifetime1 = this.field_M[var13Lifetime1Lifetime1];
                dupTemp$1 = field_T[var14_intLifetime1Lifetime1];
                field_T[var14_intLifetime1Lifetime1] = dupTemp$1 + 1;
                var15_intLifetime1Lifetime1 = dupTemp$1;
                field_P[var14_intLifetime1Lifetime1][var15_intLifetime1Lifetime1] = var13Lifetime1Lifetime1;
                if (var14_intLifetime1Lifetime1 >= 10) {
                  if (var14_intLifetime1Lifetime1 != 10) {
                    field_bb[var15_intLifetime1Lifetime1] = var8Lifetime2;
                  } else {
                    field_r[var15_intLifetime1Lifetime1] = var8Lifetime2;
                  }
                } else {
                  field_W[var14_intLifetime1Lifetime1] = field_W[var14_intLifetime1Lifetime1] + var8Lifetime2;
                }
              }
            }
          }
        }
        var8Lifetime3 = 0;
        if (!(field_T[1] <= 0) ||
          !(field_T[2] <= 0)) {
          var8Lifetime3 = (field_W[1] + field_W[2]) / (field_T[1] + field_T[2]);
        }
        var9Lifetime2 = 0;
        if (!(field_T[3] <= 0) ||
          !(field_T[4] <= 0)) {
          var9Lifetime2 = (field_W[3] + field_W[4]) / (field_T[3] + field_T[4]);
        }
        var10Lifetime2 = 0;
        if (!(field_T[6] <= 0) ||
          !(field_T[8] <= 0)) {
          var10Lifetime2 = (field_W[6] + field_W[8]) / (field_T[6] + field_T[8]);
        }
        var12Lifetime2 = 0;
        var13Lifetime2 = field_T[10];
        var14 = field_P[10];
        var15 = field_r;
        if (var12Lifetime2 == var13Lifetime2) {
          var12Lifetime2 = 0;
          var13Lifetime2 = field_T[11];
          var14 = field_P[11];
          var15 = field_bb;
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
              this.a(var14[incrementValue$4]);
              if (var12Lifetime2 == var13Lifetime2 &&
                var14 != field_P[11]) {
                var12Lifetime2 = 0;
                var13Lifetime2 = field_T[11];
                var14 = field_P[11];
                var15 = field_bb;
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
              this.a(var14[incrementValue$5]);
              if (var12Lifetime2 == var13Lifetime2 &&
                var14 != field_P[11]) {
                var12Lifetime2 = 0;
                var13Lifetime2 = field_T[11];
                var14 = field_P[11];
                var15 = field_bb;
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
              this.a(var14[incrementValue$6]);
              if (var12Lifetime2 == var13Lifetime2 &&
                var14 != field_P[11]) {
                var12Lifetime2 = 0;
                var13Lifetime2 = field_T[11];
                var14 = field_P[11];
                var15 = field_bb;
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
          var49 = field_P[var16Lifetime1];
          var29 = 0;
          var19Lifetime1 = var29;
          while (var29 < var17Lifetime1) {
            this.a(var49[var29]);
            var29++;
          }
        }
        while (var11Lifetime2 != -1000) {
          incrementValue$3 = var12Lifetime2;
          var12Lifetime2++;
          this.a(var14[incrementValue$3]);
          if (var12Lifetime2 == var13Lifetime2 &&
            var14 != field_P[11]) {
            var12Lifetime2 = 0;
            var14 = field_P[11];
            var13Lifetime2 = field_T[11];
            var15 = field_bb;
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
          var10 = this.field_u[var9];
          var11 = this.field_l[var9];
          var12 = this.field_X[var9];
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
        this.field_A = (short)(int)(Math.sqrt((double)var8) + 0.99);
        this.field_K = true;
    }

    public static void a() {
        field_N = null;
        field_x = null;
        field_j = null;
        field_O = null;
        field_g = null;
        field_w = null;
        field_H = null;
        field_J = null;
        field_v = null;
        field_L = (int[][]) null;
        field_i = null;
        field_y = (int[][]) null;
        field_U = null;
        field_G = null;
        field_T = null;
        field_P = (int[][]) null;
        field_r = null;
        field_bb = null;
        field_W = null;
        field_s = null;
        field_f = null;
        field_h = null;
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
        if (field_cb == 0) {
          field_p = 0;
          field_I = 0;
          field_B = 0;
          field_k = 0;
          return;
        }
        field_k = fk.field_o;
        field_B = fk.field_n;
        field_I = 0;
        field_p = 0;
        for (var1 = 0; var1 < this.field_Q; var1++) {
          var2 = field_j[var1];
          if (var2 != -5000) {
            var3 = field_O[var1];
            if (var2 < field_k) {
              field_k = var2;
            }
            if (var2 > field_I) {
              field_I = var2;
            }
            if (var3 < field_B) {
              field_B = var3;
            }
            if (var3 > field_p) {
              field_p = var3;
            }
          }
        }
        for (var1Lifetime1 = field_cb - 1; var1Lifetime1 >= 0; var1Lifetime1--) {
          var2Lifetime1 = field_v[var1Lifetime1];
          if (var2Lifetime1 > 0) {
            if (var2Lifetime1 <= 64) {
              var3Lifetime1 = var2Lifetime1;
            } else {
              var3Lifetime1 = 64;
            }
            var11 = field_L[var1Lifetime1];
            for (var5 = 0; var5 < var3Lifetime1; var5++) {
              this.b(var11[var5]);
            }
          }
          if (var2Lifetime1 > 64) {
            var3Lifetime1Lifetime1 = field_v[var1Lifetime1] - 64 - 1;
            var12 = field_y[var3Lifetime1Lifetime1];
            var8 = 0;
            var5Lifetime1 = var8;
            while (var8 < field_i[var3Lifetime1Lifetime1]) {
              this.b(var12[var8]);
              var8++;
            }
          }
        }
        if (field_k < 0) {
          field_k = 0;
        }
        if (field_I > fk.field_o) {
          field_I = fk.field_o;
        }
        if (field_B < 0) {
          field_B = 0;
        }
        if (field_p > fk.field_n) {
          field_p = fk.field_n;
        }
        if (field_k > field_I) {
          field_k = field_I;
        }
        if (field_B > field_p) {
          field_B = field_p;
        }
        var1Lifetime2 = fk.field_m[0] % df.field_e;
        var2Lifetime2 = fk.field_m[0] / df.field_e;
        field_k = field_k + var1Lifetime2;
        field_I = field_I + var1Lifetime2;
        field_B = field_B + var2Lifetime2;
        field_p = field_p + var2Lifetime2;
        return;
    }

    final void c() {
        Throwable decompiledCaughtException = null;
        Exception var1 = null;
        try {
          this.b();
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = (Exception) (Object) decompiledCaughtException;
        }
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
        var2 = fk.field_j;
        var3 = fk.field_k;
        var4 = 0;
        var5 = this.field_C[param0];
        var6 = this.field_n[param0];
        var7 = this.field_D[param0];
        var8 = field_J[var5];
        var9 = field_J[var6];
        var10 = field_J[var7];
        if (this.field_z != null) {
          fk.field_d = this.field_z[param0] & 255;
        } else {
          fk.field_d = 0;
        }
        if (var8 < 50) {
          var11 = field_w[var5];
          var12 = field_H[var5];
          var13 = this.field_Z[param0] & 65535;
          if (var10 >= 50) {
            var14 = (50 - var8) * fk.field_a[var10 - var8];
            field_s[var4] = var2 + (var11 + ((field_w[var7] - var11) * var14 >> 16) << 9) / 50;
            field_f[var4] = var3 + (var12 + ((field_H[var7] - var12) * var14 >> 16) << 9) / 50;
            incrementValue$0 = var4;
            var4++;
            field_h[incrementValue$0] = var13 + (((this.field_R[param0] & 65535) - var13) * var14 >> 16);
          }
          if (var9 >= 50) {
            var14Lifetime4 = (50 - var8) * fk.field_a[var9 - var8];
            field_s[var4] = var2 + (var11 + ((field_w[var6] - var11) * var14Lifetime4 >> 16) << 9) / 50;
            field_f[var4] = var3 + (var12 + ((field_H[var6] - var12) * var14Lifetime4 >> 16) << 9) / 50;
            incrementValue$1 = var4;
            var4++;
            field_h[incrementValue$1] = var13 + (((this.field_E[param0] & 65535) - var13) * var14Lifetime4 >> 16);
          }
        } else {
          field_s[var4] = field_j[var5];
          field_f[var4] = field_O[var5];
          incrementValue$2 = var4;
          var4++;
          field_h[incrementValue$2] = this.field_Z[param0] & 65535;
        }
        if (var9 < 50) {
          var11Lifetime1 = field_w[var6];
          var12Lifetime1 = field_H[var6];
          var13Lifetime1 = this.field_E[param0] & 65535;
          if (var8 >= 50) {
            var14Lifetime1 = (50 - var9) * fk.field_a[var8 - var9];
            field_s[var4] = var2 + (var11Lifetime1 + ((field_w[var5] - var11Lifetime1) * var14Lifetime1 >> 16) << 9) / 50;
            field_f[var4] = var3 + (var12Lifetime1 + ((field_H[var5] - var12Lifetime1) * var14Lifetime1 >> 16) << 9) / 50;
            incrementValue$3 = var4;
            var4++;
            field_h[incrementValue$3] = var13Lifetime1 + (((this.field_Z[param0] & 65535) - var13Lifetime1) * var14Lifetime1 >> 16);
          }
          if (var10 >= 50) {
            var14Lifetime1Lifetime1 = (50 - var9) * fk.field_a[var10 - var9];
            field_s[var4] = var2 + (var11Lifetime1 + ((field_w[var7] - var11Lifetime1) * var14Lifetime1Lifetime1 >> 16) << 9) / 50;
            field_f[var4] = var3 + (var12Lifetime1 + ((field_H[var7] - var12Lifetime1) * var14Lifetime1Lifetime1 >> 16) << 9) / 50;
            incrementValue$4 = var4;
            var4++;
            field_h[incrementValue$4] = var13Lifetime1 + (((this.field_R[param0] & 65535) - var13Lifetime1) * var14Lifetime1Lifetime1 >> 16);
          }
        } else {
          field_s[var4] = field_j[var6];
          field_f[var4] = field_O[var6];
          incrementValue$5 = var4;
          var4++;
          field_h[incrementValue$5] = this.field_E[param0] & 65535;
        }
        if (var10 < 50) {
          var11Lifetime2 = field_w[var7];
          var12Lifetime2 = field_H[var7];
          var13Lifetime2 = this.field_R[param0] & 65535;
          if (var9 >= 50) {
            var14Lifetime2 = (50 - var10) * fk.field_a[var9 - var10];
            field_s[var4] = var2 + (var11Lifetime2 + ((field_w[var6] - var11Lifetime2) * var14Lifetime2 >> 16) << 9) / 50;
            field_f[var4] = var3 + (var12Lifetime2 + ((field_H[var6] - var12Lifetime2) * var14Lifetime2 >> 16) << 9) / 50;
            incrementValue$6 = var4;
            var4++;
            field_h[incrementValue$6] = var13Lifetime2 + (((this.field_E[param0] & 65535) - var13Lifetime2) * var14Lifetime2 >> 16);
          }
          if (var8 >= 50) {
            var14Lifetime2Lifetime1 = (50 - var10) * fk.field_a[var8 - var10];
            field_s[var4] = var2 + (var11Lifetime2 + ((field_w[var5] - var11Lifetime2) * var14Lifetime2Lifetime1 >> 16) << 9) / 50;
            field_f[var4] = var3 + (var12Lifetime2 + ((field_H[var5] - var12Lifetime2) * var14Lifetime2Lifetime1 >> 16) << 9) / 50;
            incrementValue$7 = var4;
            var4++;
            field_h[incrementValue$7] = var13Lifetime2 + (((this.field_Z[param0] & 65535) - var13Lifetime2) * var14Lifetime2Lifetime1 >> 16);
          }
        } else {
          field_s[var4] = field_j[var7];
          field_f[var4] = field_O[var7];
          incrementValue$8 = var4;
          var4++;
          field_h[incrementValue$8] = this.field_R[param0] & 65535;
        }
        boolean decompiledFrameRemainder0 = true;
        var11Lifetime3 = field_s[0];
        var12Lifetime3 = field_s[1];
        var13Lifetime3 = field_s[2];
        var14Lifetime3 = field_f[0];
        var15 = field_f[1];
        var16 = field_f[2];
        fk.field_g = false;
        if (var4 == 3) {
          if (var11Lifetime3 < 0 ||
            var12Lifetime3 < 0 ||
            var13Lifetime3 < 0 ||
            !(var11Lifetime3 <= fk.field_o) ||
            !(var12Lifetime3 <= fk.field_o) ||
            !(var13Lifetime3 <= fk.field_o)) {
            fk.field_g = true;
          }
          if (this.field_ab != null &&
            this.field_ab[param0] != -1) {
            if (this.field_Y != null &&
              this.field_Y[param0] != -1) {
              var20 = this.field_Y[param0] & 255;
              var17 = this.field_q[var20];
              var18 = this.field_t[var20];
              var19 = this.field_V[var20];
            } else {
              var17 = var5;
              var18 = var6;
              var19 = var7;
            }
            if (this.field_R[param0] != -1) {
              fk.a(var14Lifetime3, var15, var16, var11Lifetime3, var12Lifetime3, var13Lifetime3, field_h[0], field_h[1], field_h[2], field_w[var17], field_w[var18], field_w[var19], field_H[var17], field_H[var18], field_H[var19], field_J[var17], field_J[var18], field_J[var19], (int) this.field_ab[param0]);
            } else {
              fk.a(var14Lifetime3, var15, var16, var11Lifetime3, var12Lifetime3, var13Lifetime3, this.field_Z[param0], this.field_Z[param0], this.field_Z[param0], field_w[var17], field_w[var18], field_w[var19], field_H[var17], field_H[var18], field_H[var19], field_J[var17], field_J[var18], field_J[var19], (int) this.field_ab[param0]);
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (this.field_R[param0] != -1) {
              fk.a(var14Lifetime3, var15, var16, var11Lifetime3, var12Lifetime3, var13Lifetime3, field_h[0], field_h[1], field_h[2]);
            } else {
              fk.a(var14Lifetime3, var15, var16, var11Lifetime3, var12Lifetime3, var13Lifetime3, fk.field_l[this.field_Z[param0] & 65535]);
            }
          }
        }
        if (var4 != 4) {
          return;
        }
        if (var11Lifetime3 < 0 ||
          var12Lifetime3 < 0 ||
          var13Lifetime3 < 0 ||
          !(var11Lifetime3 <= fk.field_o) ||
          !(var12Lifetime3 <= fk.field_o) ||
          !(var13Lifetime3 <= fk.field_o) ||
          !(field_s[3] >= 0) ||
          !(field_s[3] <= fk.field_o)) {
          fk.field_g = true;
        }
        if (this.field_ab != null &&
          this.field_ab[param0] != -1) {
          if (this.field_Y != null &&
            this.field_Y[param0] != -1) {
            var20Lifetime1 = this.field_Y[param0] & 255;
            var17Lifetime1 = this.field_q[var20Lifetime1];
            var18Lifetime1 = this.field_t[var20Lifetime1];
            var19Lifetime1 = this.field_V[var20Lifetime1];
          } else {
            var17Lifetime1 = var5;
            var18Lifetime1 = var6;
            var19Lifetime1 = var7;
          }
          var20Lifetime1Lifetime1 = this.field_ab[param0];
          if (this.field_R[param0] != -1) {
            fk.a(var14Lifetime3, var15, var16, var11Lifetime3, var12Lifetime3, var13Lifetime3, field_h[0], field_h[1], field_h[2], field_w[var17Lifetime1], field_w[var18Lifetime1], field_w[var19Lifetime1], field_H[var17Lifetime1], field_H[var18Lifetime1], field_H[var19Lifetime1], field_J[var17Lifetime1], field_J[var18Lifetime1], field_J[var19Lifetime1], var20Lifetime1Lifetime1);
            fk.a(var14Lifetime3, var16, field_f[3], var11Lifetime3, var13Lifetime3, field_s[3], field_h[0], field_h[2], field_h[3], field_w[var17Lifetime1], field_w[var18Lifetime1], field_w[var19Lifetime1], field_H[var17Lifetime1], field_H[var18Lifetime1], field_H[var19Lifetime1], field_J[var17Lifetime1], field_J[var18Lifetime1], field_J[var19Lifetime1], var20Lifetime1Lifetime1);
          } else {
            fk.a(var14Lifetime3, var15, var16, var11Lifetime3, var12Lifetime3, var13Lifetime3, this.field_Z[param0], this.field_Z[param0], this.field_Z[param0], field_w[var17Lifetime1], field_w[var18Lifetime1], field_w[var19Lifetime1], field_H[var17Lifetime1], field_H[var18Lifetime1], field_H[var19Lifetime1], field_J[var17Lifetime1], field_J[var18Lifetime1], field_J[var19Lifetime1], var20Lifetime1Lifetime1);
            fk.a(var14Lifetime3, var16, field_f[3], var11Lifetime3, var13Lifetime3, field_s[3], this.field_Z[param0], this.field_Z[param0], this.field_Z[param0], field_w[var17Lifetime1], field_w[var18Lifetime1], field_w[var19Lifetime1], field_H[var17Lifetime1], field_H[var18Lifetime1], field_H[var19Lifetime1], field_J[var17Lifetime1], field_J[var18Lifetime1], field_J[var19Lifetime1], var20Lifetime1Lifetime1);
          }
        } else {
          if (this.field_R[param0] != -1) {
            fk.a(var14Lifetime3, var15, var16, var11Lifetime3, var12Lifetime3, var13Lifetime3, field_h[0], field_h[1], field_h[2]);
            fk.a(var14Lifetime3, var16, field_f[3], var11Lifetime3, var13Lifetime3, field_s[3], field_h[0], field_h[2], field_h[3]);
          } else {
            var17Lifetime1 = fk.field_l[this.field_Z[param0] & 65535];
            fk.a(var14Lifetime3, var15, var16, var11Lifetime3, var12Lifetime3, var13Lifetime3, var17Lifetime1);
            fk.a(var14Lifetime3, var16, field_f[3], var11Lifetime3, var13Lifetime3, field_s[3], var17Lifetime1);
          }
        }
    }

    private final void a(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        if (field_x[param0]) {
          this.d(param0);
          return;
        }
        var2 = this.field_C[param0];
        var3 = this.field_n[param0];
        var4 = this.field_D[param0];
        fk.field_g = field_N[param0];
        if (this.field_z != null) {
          fk.field_d = this.field_z[param0] & 255;
        } else {
          fk.field_d = 0;
        }
        if (this.field_ab != null &&
          this.field_ab[param0] != -1) {
          if (this.field_Y != null &&
            this.field_Y[param0] != -1) {
            var8 = this.field_Y[param0] & 255;
            var5 = this.field_q[var8];
            var6 = this.field_t[var8];
            var7 = this.field_V[var8];
          } else {
            var5 = var2;
            var6 = var3;
            var7 = var4;
          }
          if (this.field_R[param0] != -1) {
            fk.a(field_O[var2], field_O[var3], field_O[var4], field_j[var2], field_j[var3], field_j[var4], this.field_Z[param0], this.field_E[param0], this.field_R[param0], field_w[var5], field_w[var6], field_w[var7], field_H[var5], field_H[var6], field_H[var7], field_J[var5], field_J[var6], field_J[var7], (int) this.field_ab[param0]);
          } else {
            fk.a(field_O[var2], field_O[var3], field_O[var4], field_j[var2], field_j[var3], field_j[var4], this.field_Z[param0], this.field_Z[param0], this.field_Z[param0], field_w[var5], field_w[var6], field_w[var7], field_H[var5], field_H[var6], field_H[var7], field_J[var5], field_J[var6], field_J[var7], (int) this.field_ab[param0]);
          }
        } else {
          if (this.field_R[param0] != -1) {
            fk.a(field_O[var2], field_O[var3], field_O[var4], field_j[var2], field_j[var3], field_j[var4], this.field_Z[param0] & 65535, this.field_E[param0] & 65535, this.field_R[param0] & 65535);
          } else {
            fk.a(field_O[var2], field_O[var3], field_O[var4], field_j[var2], field_j[var3], field_j[var4], fk.field_l[this.field_Z[param0] & 65535]);
          }
        }
    }

    private final void b(int param0, int param1) {
        if (param0 < field_k) {
          field_k = param0;
        }
        if (param0 > field_I) {
          field_I = param0;
        }
        if (param1 < field_B) {
          field_B = param1;
        }
        if (param1 > field_p) {
          field_p = param1;
          return;
        }
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
        if (field_x[param0]) {
          var2 = fk.field_j;
          var3 = fk.field_k;
          var4 = this.field_C[param0];
          var5 = this.field_n[param0];
          var6 = this.field_D[param0];
          var7 = field_J[var4];
          var8 = field_J[var5];
          var9 = field_J[var6];
          if (var7 < 50) {
            var10 = field_w[var4];
            var11 = field_H[var4];
            if (var9 >= 50) {
              var12 = (50 - var7) * fk.field_a[var9 - var7];
              this.b(var2 + (var10 + ((field_w[var6] - var10) * var12 >> 16) << 9) / 50, var3 + (var11 + ((field_H[var6] - var11) * var12 >> 16) << 9) / 50);
            }
            if (var8 >= 50) {
              var12Lifetime3 = (50 - var7) * fk.field_a[var8 - var7];
              this.b(var2 + (var10 + ((field_w[var5] - var10) * var12Lifetime3 >> 16) << 9) / 50, var3 + (var11 + ((field_H[var5] - var11) * var12Lifetime3 >> 16) << 9) / 50);
            }
          }
          if (var8 < 50) {
            var10Lifetime1 = field_w[var5];
            var11Lifetime1 = field_H[var5];
            if (var7 >= 50) {
              var12Lifetime1 = (50 - var8) * fk.field_a[var7 - var8];
              this.b(var2 + (var10Lifetime1 + ((field_w[var4] - var10Lifetime1) * var12Lifetime1 >> 16) << 9) / 50, var3 + (var11Lifetime1 + ((field_H[var4] - var11Lifetime1) * var12Lifetime1 >> 16) << 9) / 50);
            }
            if (var9 >= 50) {
              var12Lifetime1Lifetime1 = (50 - var8) * fk.field_a[var9 - var8];
              this.b(var2 + (var10Lifetime1 + ((field_w[var6] - var10Lifetime1) * var12Lifetime1Lifetime1 >> 16) << 9) / 50, var3 + (var11Lifetime1 + ((field_H[var6] - var11Lifetime1) * var12Lifetime1Lifetime1 >> 16) << 9) / 50);
            }
          }
          if (var9 < 50) {
            var10Lifetime2 = field_w[var6];
            var11Lifetime2 = field_H[var6];
            if (var8 >= 50) {
              var12Lifetime2 = (50 - var9) * fk.field_a[var8 - var9];
              this.b(var2 + (var10Lifetime2 + ((field_w[var5] - var10Lifetime2) * var12Lifetime2 >> 16) << 9) / 50, var3 + (var11Lifetime2 + ((field_H[var5] - var11Lifetime2) * var12Lifetime2 >> 16) << 9) / 50);
            }
            if (var7 >= 50) {
              var12Lifetime2Lifetime1 = (50 - var9) * fk.field_a[var7 - var9];
              this.b(var2 + (var10Lifetime2 + ((field_w[var4] - var10Lifetime2) * var12Lifetime2Lifetime1 >> 16) << 9) / 50, var3 + (var11Lifetime2 + ((field_H[var4] - var11Lifetime2) * var12Lifetime2Lifetime1 >> 16) << 9) / 50);
            }
          }
          return;
        }
    }

    private il() {
        this.field_F = 0;
        this.field_m = 0;
        this.field_S = 0;
        this.field_Q = 0;
        this.field_K = false;
    }

    il(qb param0, int param1, int param2, int param3, int param4, int param5) {
        int dupTemp$1 = 0;
        int incrementValue$0 = 0;
        int var7;
        int var8;
        int var9;
        int[] var9_ref_int__;
        int var10;
        int var11;
        int var12;
        s var13;
        int var14;
        int var15;
        int var16;
        int[] var17;
        pg var18;
        pg var19;
        int[] var20;
        int var9Lifetime1;
        int var10Lifetime1;
        int var10Lifetime2;
        int var11Lifetime1;
        int var11Lifetime2;
        int var10Lifetime1Lifetime1;
        int var10Lifetime1Lifetime2;
        this.field_F = 0;
        this.field_m = 0;
        this.field_S = 0;
        this.field_Q = 0;
        this.field_K = false;
        param0.d();
        param0.a();
        this.field_Q = param0.field_t;
        this.field_m = param0.field_z;
        this.field_u = param0.field_x;
        this.field_l = param0.field_o;
        this.field_X = param0.field_l;
        this.field_F = param0.field_J;
        this.field_C = param0.field_V;
        this.field_n = param0.field_v;
        this.field_D = param0.field_e;
        this.field_M = param0.field_O;
        this.field_z = param0.field_w;
        var7 = (int)Math.sqrt((double)(param3 * param3 + param4 * param4 + param5 * param5));
        var8 = param2 * var7 >> 8;
        this.field_Z = new int[this.field_F];
        this.field_E = new int[this.field_F];
        this.field_R = new int[this.field_F];
        if (param0.field_p != null) {
          this.field_ab = new short[this.field_F];
          for (var9 = 0; var9 < this.field_F; var9++) {
            var10 = param0.field_p[var9];
            if (var10 != -1 &&
              fk.field_p.b(var10, (byte) 109)) {
              this.field_ab[var9] = (short)var10;
            } else {
              this.field_ab[var9] = (short)-1;
            }
          }
        } else {
          this.field_ab = null;
        }
        if (param0.field_f > 0 &&
          param0.field_B != null) {
          var20 = new int[param0.field_f];
          var17 = var20;
          var9_ref_int__ = var17;
          for (var10Lifetime1 = 0; var10Lifetime1 < this.field_F; var10Lifetime1++) {
            if (param0.field_B[var10Lifetime1] != -1) {
              dupTemp$1 = param0.field_B[var10Lifetime1] & 255;
              var9_ref_int__[dupTemp$1] = var9_ref_int__[dupTemp$1] + 1;
            }
          }
          this.field_S = 0;
          for (var10Lifetime1Lifetime1 = 0; var10Lifetime1Lifetime1 < param0.field_f; var10Lifetime1Lifetime1++) {
            if (var20[var10Lifetime1Lifetime1] > 0 &&
              param0.field_N[var10Lifetime1Lifetime1] == 0) {
              this.field_S = this.field_S + 1;
            }
          }
          this.field_q = new int[this.field_S];
          this.field_t = new int[this.field_S];
          this.field_V = new int[this.field_S];
          var10Lifetime1Lifetime2 = 0;
          for (var11 = 0; var11 < param0.field_f; var11++) {
            if (var20[var11] > 0 &&
              param0.field_N[var11] == 0) {
              this.field_q[var10Lifetime1Lifetime2] = param0.field_M[var11] & 65535;
              this.field_t[var10Lifetime1Lifetime2] = param0.field_q[var11] & 65535;
              this.field_V[var10Lifetime1Lifetime2] = param0.field_A[var11] & 65535;
              incrementValue$0 = var10Lifetime1Lifetime2;
              var10Lifetime1Lifetime2++;
              var9_ref_int__[var11] = incrementValue$0;
            } else {
              var20[var11] = -1;
            }
          }
          this.field_Y = new byte[this.field_F];
          for (var11Lifetime2 = 0; var11Lifetime2 < this.field_F; var11Lifetime2++) {
            if (param0.field_B[var11Lifetime2] == -1) {
              this.field_Y[var11Lifetime2] = (byte)-1;
            } else {
              this.field_Y[var11Lifetime2] = (byte)var9_ref_int__[param0.field_B[var11Lifetime2] & 255];
              if (this.field_Y[var11Lifetime2] == -1 &&
                this.field_ab != null) {
                this.field_ab[var11Lifetime2] = (short)-1;
              }
            }
          }
        }
        var16 = 0;
        var9Lifetime1 = var16;
        while (var16 < this.field_F) {
          if (param0.field_s != null) {
            var10Lifetime2 = param0.field_s[var16];
          } else {
            var10Lifetime2 = 0;
          }
          if (param0.field_w != null) {
            var11Lifetime1 = param0.field_w[var16];
          } else {
            var11Lifetime1 = 0;
          }
          if (this.field_ab != null) {
            var12 = this.field_ab[var16];
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
                this.field_R[var16] = -2;
              } else {
                var19 = param0.field_L[var16];
                var14 = param1 + (param3 * var19.field_b + param4 * var19.field_d + param5 * var19.field_f) / (var8 + var8 / 2);
                this.field_Z[var16] = il.c(var14);
                this.field_R[var16] = -1;
              }
            } else {
              if (param0.field_g != null &&
                param0.field_g[this.field_C[var16]] != null) {
                var13 = param0.field_g[this.field_C[var16]];
              } else {
                var13 = param0.field_n[this.field_C[var16]];
              }
              var14 = param1 + (param3 * var13.field_j + param4 * var13.field_d + param5 * var13.field_i) / (var8 * var13.field_e);
              this.field_Z[var16] = il.c(var14);
              if (param0.field_g != null &&
                param0.field_g[this.field_n[var16]] != null) {
                var13 = param0.field_g[this.field_n[var16]];
              } else {
                var13 = param0.field_n[this.field_n[var16]];
              }
              var14 = param1 + (param3 * var13.field_j + param4 * var13.field_d + param5 * var13.field_i) / (var8 * var13.field_e);
              this.field_E[var16] = il.c(var14);
              if (param0.field_g != null &&
                param0.field_g[this.field_D[var16]] != null) {
                var13 = param0.field_g[this.field_D[var16]];
              } else {
                var13 = param0.field_n[this.field_D[var16]];
              }
              var14 = param1 + (param3 * var13.field_j + param4 * var13.field_d + param5 * var13.field_i) / (var8 * var13.field_e);
              this.field_R[var16] = il.c(var14);
            }
          } else {
            if (var10Lifetime2 != 0) {
              if (var10Lifetime2 != 1) {
                if (var10Lifetime2 != 3) {
                  this.field_R[var16] = -2;
                } else {
                  this.field_Z[var16] = 128;
                  this.field_R[var16] = -1;
                }
              } else {
                var18 = param0.field_L[var16];
                var14 = param1 + (param3 * var18.field_b + param4 * var18.field_d + param5 * var18.field_f) / (var8 + var8 / 2) << 17;
                this.field_Z[var16] = var14 | il.a(param0.field_W[var16] & 65535, var14 >> 17);
                this.field_R[var16] = -1;
              }
            } else {
              var15 = param0.field_W[var16] & 65535;
              if (param0.field_g != null &&
                param0.field_g[this.field_C[var16]] != null) {
                var13 = param0.field_g[this.field_C[var16]];
              } else {
                var13 = param0.field_n[this.field_C[var16]];
              }
              var14 = param1 + (param3 * var13.field_j + param4 * var13.field_d + param5 * var13.field_i) / (var8 * var13.field_e) << 17;
              this.field_Z[var16] = var14 | il.a(var15, var14 >> 17);
              if (param0.field_g != null &&
                param0.field_g[this.field_n[var16]] != null) {
                var13 = param0.field_g[this.field_n[var16]];
              } else {
                var13 = param0.field_n[this.field_n[var16]];
              }
              var14 = param1 + (param3 * var13.field_j + param4 * var13.field_d + param5 * var13.field_i) / (var8 * var13.field_e) << 17;
              this.field_E[var16] = var14 | il.a(var15, var14 >> 17);
              if (param0.field_g != null &&
                param0.field_g[this.field_D[var16]] != null) {
                var13 = param0.field_g[this.field_D[var16]];
              } else {
                var13 = param0.field_n[this.field_D[var16]];
              }
              var14 = param1 + (param3 * var13.field_j + param4 * var13.field_d + param5 * var13.field_i) / (var8 * var13.field_e) << 17;
              this.field_R[var16] = var14 | il.a(var15, var14 >> 17);
            }
          }
          var16++;
        }
    }

    static {
        il discarded$0 = new il();
        il discarded$1 = new il();
        il discarded$2 = new il();
        field_W = new int[12];
        field_J = new int[4096];
        field_w = new int[4096];
        field_x = new boolean[4096];
        field_H = new int[4096];
        field_e = false;
        field_s = new int[10];
        field_f = new int[10];
        field_g = new int[4096];
        field_j = new int[4096];
        field_O = new int[4096];
        field_N = new boolean[4096];
        field_bb = new int[4096];
        field_h = new int[10];
        field_P = new int[12][4096];
        if (field_e) {
          field_U = new int[4096];
          field_G = new int[4096];
        } else {
          field_v = new int[1600];
          field_L = new int[1600][64];
          field_i = new int[32];
          field_y = new int[32][512];
        }
        field_T = new int[12];
        field_r = new int[4096];
        field_o = 0;
    }
}
