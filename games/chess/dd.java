/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dd extends kk {
    private int field_q;
    private int[] field_N;
    private int[] field_P;
    private int[] field_s;
    private int[] field_y;
    private int[] field_gb;
    private byte[] field_u;
    private boolean field_Y;
    private int[] field_z;
    private int field_A;
    private byte[] field_h;
    private int[] field_F;
    private int[] field_cb;
    private byte[] field_H;
    private int field_ab;
    private int[] field_R;
    private int[] field_o;
    private short[] field_S;
    private static int[] field_L;
    private static int[] field_j;
    private short field_C;
    private static int field_m;
    private static int[] field_M;
    private static int[] field_T;
    private static int[] field_n;
    private static int[] field_W;
    private static boolean[] field_V;
    private static boolean[] field_v;
    private static int[] field_w;
    private static int[][] field_fb;
    private static int[] field_bb;
    private static int[] field_G;
    private int field_p;
    private int[] field_i;
    private static int[] field_db;
    private static int[][] field_Q;
    private static int field_t;
    private static int[] field_K;
    private static int[] field_B;
    private static int[] field_l;
    private static int[][] field_U;
    static int field_Z;
    static int field_eb;
    private static boolean field_r;
    private static int[] field_I;
    static int field_D;
    private static int[] field_k;
    private int[] field_X;
    private static int[] field_O;
    static int field_x;
    private static int[] field_E;

    private final void e(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        if (field_v[param0]) {
          this.b(param0);
          return;
        }
        var2 = this.field_gb[param0];
        var3 = this.field_P[param0];
        var4 = this.field_R[param0];
        nh.field_k = field_V[param0];
        if (this.field_h != null) {
          nh.field_b = this.field_h[param0] & 255;
        } else {
          nh.field_b = 0;
        }
        if (this.field_S != null &&
          this.field_S[param0] != -1) {
          if (this.field_H != null &&
            this.field_H[param0] != -1) {
            var8 = this.field_H[param0] & 255;
            var5 = this.field_N[var8];
            var6 = this.field_X[var8];
            var7 = this.field_i[var8];
          } else {
            var5 = var2;
            var6 = var3;
            var7 = var4;
          }
          if (this.field_s[param0] != -1) {
            nh.a(field_G[var2], field_G[var3], field_G[var4], field_M[var2], field_M[var3], field_M[var4], this.field_z[param0], this.field_o[param0], this.field_s[param0], field_K[var5], field_K[var6], field_K[var7], field_E[var5], field_E[var6], field_E[var7], field_db[var5], field_db[var6], field_db[var7], (int) this.field_S[param0]);
          } else {
            nh.a(field_G[var2], field_G[var3], field_G[var4], field_M[var2], field_M[var3], field_M[var4], this.field_z[param0], this.field_z[param0], this.field_z[param0], field_K[var5], field_K[var6], field_K[var7], field_E[var5], field_E[var6], field_E[var7], field_db[var5], field_db[var6], field_db[var7], (int) this.field_S[param0]);
          }
        } else {
          if (this.field_s[param0] != -1) {
            nh.a(field_G[var2], field_G[var3], field_G[var4], field_M[var2], field_M[var3], field_M[var4], this.field_z[param0] & 65535, this.field_o[param0] & 65535, this.field_s[param0] & 65535);
          } else {
            nh.a(field_G[var2], field_G[var3], field_G[var4], field_M[var2], field_M[var3], field_M[var4], nh.field_d[this.field_z[param0] & 65535]);
          }
        }
    }

    public static void b() {
        field_V = null;
        field_v = null;
        field_M = null;
        field_G = null;
        field_k = null;
        field_K = null;
        field_E = null;
        field_db = null;
        field_O = null;
        field_fb = (int[][]) null;
        field_w = null;
        field_U = (int[][]) null;
        field_l = null;
        field_L = null;
        field_bb = null;
        field_Q = (int[][]) null;
        field_B = null;
        field_T = null;
        field_W = null;
        field_n = null;
        field_j = null;
        field_I = null;
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
        field_m = param4;
        var7 = 0;
        if (!field_r) {
          for (var8 = 0; var8 < 1600; var8++) {
            field_O[var8] = 0;
          }
          for (var8Lifetime4 = 0; var8Lifetime4 < 32; var8Lifetime4++) {
            field_w[var8Lifetime4] = 0;
          }
          field_t = 0;
        }
        for (var8Lifetime1 = 0; var8Lifetime1 < this.field_A; var8Lifetime1++) {
          L45: {
            if (this.field_s[var8Lifetime1] != -2) {
              var9 = this.field_gb[var8Lifetime1];
              var10 = this.field_P[var8Lifetime1];
              var11 = this.field_R[var8Lifetime1];
              var12 = field_M[var9];
              var13 = field_M[var10];
              var14_int = field_M[var11];
              if (param0 && (var12 == -5000 ||
                var13 == -5000 ||
                var14_int == -5000)) {
                var15_int = field_K[var9];
                var16 = field_K[var10];
                var17 = field_K[var11];
                var18 = field_E[var9];
                var19 = field_E[var10];
                var20 = field_E[var11];
                var21 = field_db[var9];
                var22 = field_db[var10];
                var23 = field_db[var11];
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
                  field_v[var8Lifetime1] = true;
                  if (field_r) {
                    field_l[var7] = (field_k[var9] + field_k[var10] + field_k[var11]) / 3;
                    incrementValue$12 = var7;
                    var7++;
                    field_L[incrementValue$12] = var8Lifetime1;
                  } else {
                    var27 = (field_k[var9] + field_k[var10] + field_k[var11]) / 3 + param3;
                    if (field_O[var27] < 64) {
                      dupTemp$10 = field_O[var27];
                      arrayValue$11 = field_fb[var27];
                      field_O[var27] = dupTemp$10 + 1;
                      arrayValue$11[dupTemp$10] = var8Lifetime1;
                    } else {
                      var28 = field_O[var27];
                      if (var28 == 64) {
                        if (field_t == 512) {
                          break L45;
                        }
                        fieldTemp$7 = field_t;
                        field_t = field_t + 1;
                        var28 = 65 + fieldTemp$7;
                        field_O[var27] = 65 + fieldTemp$7;
                      }
                      var28 -= 65;
                      dupTemp$8 = field_w[var28];
                      arrayValue$9 = field_U[var28];
                      field_w[var28] = dupTemp$8 + 1;
                      arrayValue$9[dupTemp$8] = var8Lifetime1;
                    }
                  }
                }
                break L45;
              }
              if (param1 &&
                this.a(tb.field_d + nh.field_n, v.field_m + nh.field_f, field_G[var9], field_G[var10], field_G[var11], var12, var13, var14_int)) {
                fieldTemp$13 = mi.field_v;
                mi.field_v = mi.field_v + 1;
                pd.field_Nb[fieldTemp$13] = param2;
                param1 = false;
              }
              if ((var12 - var13) * (field_G[var11] - field_G[var10]) - (field_G[var9] - field_G[var10]) * (var14_int - var13) > 0) {
                field_v[var8Lifetime1] = false;
                if (var12 >= 0 &&
                  var13 >= 0 &&
                  var14_int >= 0 &&
                  var12 <= nh.field_o &&
                  var13 <= nh.field_o &&
                  var14_int <= nh.field_o) {
                  field_V[var8Lifetime1] = false;
                } else {
                  field_V[var8Lifetime1] = true;
                }
                if (!field_r) {
                  var15_intLifetime2 = (field_k[var9] + field_k[var10] + field_k[var11]) / 3 + param3;
                  if (field_O[var15_intLifetime2] >= 64) {
                    var16Lifetime2 = field_O[var15_intLifetime2];
                    if (var16Lifetime2 == 64) {
                      if (field_t == 512) {
                        break L45;
                      }
                      fieldTemp$14 = field_t;
                      field_t = field_t + 1;
                      var16Lifetime2 = 65 + fieldTemp$14;
                      field_O[var15_intLifetime2] = 65 + fieldTemp$14;
                    }
                    var16Lifetime2 -= 65;
                    dupTemp$15 = field_w[var16Lifetime2];
                    arrayValue$16 = field_U[var16Lifetime2];
                    field_w[var16Lifetime2] = dupTemp$15 + 1;
                    arrayValue$16[dupTemp$15] = var8Lifetime1;
                  } else {
                    dupTemp$17 = field_O[var15_intLifetime2];
                    arrayValue$18 = field_fb[var15_intLifetime2];
                    field_O[var15_intLifetime2] = dupTemp$17 + 1;
                    arrayValue$18[dupTemp$17] = var8Lifetime1;
                  }
                } else {
                  field_l[var7] = (field_k[var9] + field_k[var10] + field_k[var11]) / 3;
                  incrementValue$19 = var7;
                  var7++;
                  field_L[incrementValue$19] = var8Lifetime1;
                }
              }
            }
          }
        }
        if (field_r) {
          hn.a(field_l, 0, 0, field_L, var7 - 1);
          if (this.field_u == null) {
            for (var8Lifetime2 = 0; var8Lifetime2 < var7; var8Lifetime2++) {
              this.e(field_L[var8Lifetime2]);
            }
            return;
          }
          for (var8Lifetime2 = 0; var8Lifetime2 < 12; var8Lifetime2++) {
            field_bb[var8Lifetime2] = 0;
            field_W[var8Lifetime2] = 0;
          }
          for (var8Lifetime2 = 0; var8Lifetime2 < var7; var8Lifetime2++) {
            var9Lifetime1 = field_L[var8Lifetime2];
            var10Lifetime1 = field_l[var8Lifetime2];
            var11Lifetime1 = this.field_u[var9Lifetime1];
            dupTemp$2 = field_bb[var11Lifetime1];
            field_bb[var11Lifetime1] = dupTemp$2 + 1;
            var12Lifetime1 = dupTemp$2;
            field_Q[var11Lifetime1][var12Lifetime1] = var9Lifetime1;
            if (var11Lifetime1 >= 10) {
              if (var11Lifetime1 != 10) {
                field_T[var12Lifetime1] = var10Lifetime1;
              } else {
                field_B[var12Lifetime1] = var10Lifetime1;
              }
            } else {
              field_W[var11Lifetime1] = field_W[var11Lifetime1] + var10Lifetime1;
            }
          }
        } else {
          if (this.field_u == null) {
            for (var8Lifetime2 = param4 - 1; var8Lifetime2 >= 0; var8Lifetime2--) {
              var9Lifetime1 = field_O[var8Lifetime2];
              if (var9Lifetime1 > 0) {
                stackIn_88_0 = (var9Lifetime1 <= 64) ? var9Lifetime1 : 64;
                var10Lifetime1 = stackIn_88_0;
                var45 = field_fb[var8Lifetime2];
                for (var12Lifetime1 = 0; var12Lifetime1 < var10Lifetime1; var12Lifetime1++) {
                  this.e(var45[var12Lifetime1]);
                }
              }
              if (var9Lifetime1 > 64) {
                var10Lifetime1 = field_O[var8Lifetime2] - 64 - 1;
                var46 = field_U[var10Lifetime1];
                for (var12Lifetime1 = 0; var12Lifetime1 < field_w[var10Lifetime1]; var12Lifetime1++) {
                  this.e(var46[var12Lifetime1]);
                }
              }
            }
            return;
          }
          for (var8Lifetime2 = 0; var8Lifetime2 < 12; var8Lifetime2++) {
            field_bb[var8Lifetime2] = 0;
            field_W[var8Lifetime2] = 0;
          }
          for (var8Lifetime2 = param4 - 1; var8Lifetime2 >= 0; var8Lifetime2--) {
            var9Lifetime1 = field_O[var8Lifetime2];
            if (var9Lifetime1 > 0) {
              if (var9Lifetime1 <= 64) {
                var10Lifetime1 = var9Lifetime1;
              } else {
                var10Lifetime1 = 64;
              }
              var47 = field_fb[var8Lifetime2];
              for (var12Lifetime1 = 0; var12Lifetime1 < var10Lifetime1; var12Lifetime1++) {
                var13Lifetime1 = var47[var12Lifetime1];
                var14_intLifetime1 = this.field_u[var13Lifetime1];
                dupTemp$0 = field_bb[var14_intLifetime1];
                field_bb[var14_intLifetime1] = dupTemp$0 + 1;
                var15_intLifetime1 = dupTemp$0;
                field_Q[var14_intLifetime1][var15_intLifetime1] = var13Lifetime1;
                if (var14_intLifetime1 >= 10) {
                  if (var14_intLifetime1 != 10) {
                    field_T[var15_intLifetime1] = var8Lifetime2;
                  } else {
                    field_B[var15_intLifetime1] = var8Lifetime2;
                  }
                } else {
                  field_W[var14_intLifetime1] = field_W[var14_intLifetime1] + var8Lifetime2;
                }
              }
            }
            if (var9Lifetime1 > 64) {
              var10Lifetime1 = field_O[var8Lifetime2] - 64 - 1;
              var48 = field_U[var10Lifetime1];
              for (var12Lifetime1 = 0; var12Lifetime1 < field_w[var10Lifetime1]; var12Lifetime1++) {
                var13Lifetime1Lifetime1 = var48[var12Lifetime1];
                var14_intLifetime1Lifetime1 = this.field_u[var13Lifetime1Lifetime1];
                dupTemp$1 = field_bb[var14_intLifetime1Lifetime1];
                field_bb[var14_intLifetime1Lifetime1] = dupTemp$1 + 1;
                var15_intLifetime1Lifetime1 = dupTemp$1;
                field_Q[var14_intLifetime1Lifetime1][var15_intLifetime1Lifetime1] = var13Lifetime1Lifetime1;
                if (var14_intLifetime1Lifetime1 >= 10) {
                  if (var14_intLifetime1Lifetime1 != 10) {
                    field_T[var15_intLifetime1Lifetime1] = var8Lifetime2;
                  } else {
                    field_B[var15_intLifetime1Lifetime1] = var8Lifetime2;
                  }
                } else {
                  field_W[var14_intLifetime1Lifetime1] = field_W[var14_intLifetime1Lifetime1] + var8Lifetime2;
                }
              }
            }
          }
        }
        var8Lifetime3 = 0;
        if (!(field_bb[1] <= 0) ||
          !(field_bb[2] <= 0)) {
          var8Lifetime3 = (field_W[1] + field_W[2]) / (field_bb[1] + field_bb[2]);
        }
        var9Lifetime2 = 0;
        if (!(field_bb[3] <= 0) ||
          !(field_bb[4] <= 0)) {
          var9Lifetime2 = (field_W[3] + field_W[4]) / (field_bb[3] + field_bb[4]);
        }
        var10Lifetime2 = 0;
        if (!(field_bb[6] <= 0) ||
          !(field_bb[8] <= 0)) {
          var10Lifetime2 = (field_W[6] + field_W[8]) / (field_bb[6] + field_bb[8]);
        }
        var12Lifetime2 = 0;
        var13Lifetime2 = field_bb[10];
        var14 = field_Q[10];
        var15 = field_B;
        if (var12Lifetime2 == var13Lifetime2) {
          var12Lifetime2 = 0;
          var13Lifetime2 = field_bb[11];
          var14 = field_Q[11];
          var15 = field_T;
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
                var14 != field_Q[11]) {
                var12Lifetime2 = 0;
                var13Lifetime2 = field_bb[11];
                var14 = field_Q[11];
                var15 = field_T;
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
                var14 != field_Q[11]) {
                var12Lifetime2 = 0;
                var13Lifetime2 = field_bb[11];
                var14 = field_Q[11];
                var15 = field_T;
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
                var14 != field_Q[11]) {
                var12Lifetime2 = 0;
                var13Lifetime2 = field_bb[11];
                var14 = field_Q[11];
                var15 = field_T;
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
          var17Lifetime1 = field_bb[var16Lifetime1];
          var49 = field_Q[var16Lifetime1];
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
            var14 != field_Q[11]) {
            var12Lifetime2 = 0;
            var14 = field_Q[11];
            var13Lifetime2 = field_bb[11];
            var15 = field_T;
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
        var2 = nh.field_n;
        var3 = nh.field_f;
        var4 = 0;
        var5 = this.field_gb[param0];
        var6 = this.field_P[param0];
        var7 = this.field_R[param0];
        var8 = field_db[var5];
        var9 = field_db[var6];
        var10 = field_db[var7];
        if (this.field_h != null) {
          nh.field_b = this.field_h[param0] & 255;
        } else {
          nh.field_b = 0;
        }
        if (var8 < 50) {
          var11 = field_K[var5];
          var12 = field_E[var5];
          var13 = this.field_z[param0] & 65535;
          if (var10 >= 50) {
            var14 = (50 - var8) * nh.field_h[var10 - var8];
            field_n[var4] = var2 + (var11 + ((field_K[var7] - var11) * var14 >> 16) << 9) / 50;
            field_j[var4] = var3 + (var12 + ((field_E[var7] - var12) * var14 >> 16) << 9) / 50;
            incrementValue$0 = var4;
            var4++;
            field_I[incrementValue$0] = var13 + (((this.field_s[param0] & 65535) - var13) * var14 >> 16);
          }
          if (var9 >= 50) {
            var14Lifetime4 = (50 - var8) * nh.field_h[var9 - var8];
            field_n[var4] = var2 + (var11 + ((field_K[var6] - var11) * var14Lifetime4 >> 16) << 9) / 50;
            field_j[var4] = var3 + (var12 + ((field_E[var6] - var12) * var14Lifetime4 >> 16) << 9) / 50;
            incrementValue$1 = var4;
            var4++;
            field_I[incrementValue$1] = var13 + (((this.field_o[param0] & 65535) - var13) * var14Lifetime4 >> 16);
          }
        } else {
          field_n[var4] = field_M[var5];
          field_j[var4] = field_G[var5];
          incrementValue$2 = var4;
          var4++;
          field_I[incrementValue$2] = this.field_z[param0] & 65535;
        }
        if (var9 < 50) {
          var11Lifetime1 = field_K[var6];
          var12Lifetime1 = field_E[var6];
          var13Lifetime1 = this.field_o[param0] & 65535;
          if (var8 >= 50) {
            var14Lifetime1 = (50 - var9) * nh.field_h[var8 - var9];
            field_n[var4] = var2 + (var11Lifetime1 + ((field_K[var5] - var11Lifetime1) * var14Lifetime1 >> 16) << 9) / 50;
            field_j[var4] = var3 + (var12Lifetime1 + ((field_E[var5] - var12Lifetime1) * var14Lifetime1 >> 16) << 9) / 50;
            incrementValue$3 = var4;
            var4++;
            field_I[incrementValue$3] = var13Lifetime1 + (((this.field_z[param0] & 65535) - var13Lifetime1) * var14Lifetime1 >> 16);
          }
          if (var10 >= 50) {
            var14Lifetime1Lifetime1 = (50 - var9) * nh.field_h[var10 - var9];
            field_n[var4] = var2 + (var11Lifetime1 + ((field_K[var7] - var11Lifetime1) * var14Lifetime1Lifetime1 >> 16) << 9) / 50;
            field_j[var4] = var3 + (var12Lifetime1 + ((field_E[var7] - var12Lifetime1) * var14Lifetime1Lifetime1 >> 16) << 9) / 50;
            incrementValue$4 = var4;
            var4++;
            field_I[incrementValue$4] = var13Lifetime1 + (((this.field_s[param0] & 65535) - var13Lifetime1) * var14Lifetime1Lifetime1 >> 16);
          }
        } else {
          field_n[var4] = field_M[var6];
          field_j[var4] = field_G[var6];
          incrementValue$5 = var4;
          var4++;
          field_I[incrementValue$5] = this.field_o[param0] & 65535;
        }
        if (var10 < 50) {
          var11Lifetime2 = field_K[var7];
          var12Lifetime2 = field_E[var7];
          var13Lifetime2 = this.field_s[param0] & 65535;
          if (var9 >= 50) {
            var14Lifetime2 = (50 - var10) * nh.field_h[var9 - var10];
            field_n[var4] = var2 + (var11Lifetime2 + ((field_K[var6] - var11Lifetime2) * var14Lifetime2 >> 16) << 9) / 50;
            field_j[var4] = var3 + (var12Lifetime2 + ((field_E[var6] - var12Lifetime2) * var14Lifetime2 >> 16) << 9) / 50;
            incrementValue$6 = var4;
            var4++;
            field_I[incrementValue$6] = var13Lifetime2 + (((this.field_o[param0] & 65535) - var13Lifetime2) * var14Lifetime2 >> 16);
          }
          if (var8 >= 50) {
            var14Lifetime2Lifetime1 = (50 - var10) * nh.field_h[var8 - var10];
            field_n[var4] = var2 + (var11Lifetime2 + ((field_K[var5] - var11Lifetime2) * var14Lifetime2Lifetime1 >> 16) << 9) / 50;
            field_j[var4] = var3 + (var12Lifetime2 + ((field_E[var5] - var12Lifetime2) * var14Lifetime2Lifetime1 >> 16) << 9) / 50;
            incrementValue$7 = var4;
            var4++;
            field_I[incrementValue$7] = var13Lifetime2 + (((this.field_z[param0] & 65535) - var13Lifetime2) * var14Lifetime2Lifetime1 >> 16);
          }
        } else {
          field_n[var4] = field_M[var7];
          field_j[var4] = field_G[var7];
          incrementValue$8 = var4;
          var4++;
          field_I[incrementValue$8] = this.field_s[param0] & 65535;
        }
        boolean decompiledFrameRemainder0 = true;
        var11Lifetime3 = field_n[0];
        var12Lifetime3 = field_n[1];
        var13Lifetime3 = field_n[2];
        var14Lifetime3 = field_j[0];
        var15 = field_j[1];
        var16 = field_j[2];
        nh.field_k = false;
        if (var4 == 3) {
          if (var11Lifetime3 < 0 ||
            var12Lifetime3 < 0 ||
            var13Lifetime3 < 0 ||
            !(var11Lifetime3 <= nh.field_o) ||
            !(var12Lifetime3 <= nh.field_o) ||
            !(var13Lifetime3 <= nh.field_o)) {
            nh.field_k = true;
          }
          if (this.field_S != null &&
            this.field_S[param0] != -1) {
            if (this.field_H != null &&
              this.field_H[param0] != -1) {
              var20 = this.field_H[param0] & 255;
              var17 = this.field_N[var20];
              var18 = this.field_X[var20];
              var19 = this.field_i[var20];
            } else {
              var17 = var5;
              var18 = var6;
              var19 = var7;
            }
            if (this.field_s[param0] != -1) {
              nh.a(var14Lifetime3, var15, var16, var11Lifetime3, var12Lifetime3, var13Lifetime3, field_I[0], field_I[1], field_I[2], field_K[var17], field_K[var18], field_K[var19], field_E[var17], field_E[var18], field_E[var19], field_db[var17], field_db[var18], field_db[var19], (int) this.field_S[param0]);
            } else {
              nh.a(var14Lifetime3, var15, var16, var11Lifetime3, var12Lifetime3, var13Lifetime3, this.field_z[param0], this.field_z[param0], this.field_z[param0], field_K[var17], field_K[var18], field_K[var19], field_E[var17], field_E[var18], field_E[var19], field_db[var17], field_db[var18], field_db[var19], (int) this.field_S[param0]);
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (this.field_s[param0] != -1) {
              nh.a(var14Lifetime3, var15, var16, var11Lifetime3, var12Lifetime3, var13Lifetime3, field_I[0], field_I[1], field_I[2]);
            } else {
              nh.a(var14Lifetime3, var15, var16, var11Lifetime3, var12Lifetime3, var13Lifetime3, nh.field_d[this.field_z[param0] & 65535]);
            }
          }
        }
        if (var4 != 4) {
          return;
        }
        if (var11Lifetime3 < 0 ||
          var12Lifetime3 < 0 ||
          var13Lifetime3 < 0 ||
          !(var11Lifetime3 <= nh.field_o) ||
          !(var12Lifetime3 <= nh.field_o) ||
          !(var13Lifetime3 <= nh.field_o) ||
          !(field_n[3] >= 0) ||
          !(field_n[3] <= nh.field_o)) {
          nh.field_k = true;
        }
        if (this.field_S != null &&
          this.field_S[param0] != -1) {
          if (this.field_H != null &&
            this.field_H[param0] != -1) {
            var20Lifetime1 = this.field_H[param0] & 255;
            var17Lifetime1 = this.field_N[var20Lifetime1];
            var18Lifetime1 = this.field_X[var20Lifetime1];
            var19Lifetime1 = this.field_i[var20Lifetime1];
          } else {
            var17Lifetime1 = var5;
            var18Lifetime1 = var6;
            var19Lifetime1 = var7;
          }
          var20Lifetime1Lifetime1 = this.field_S[param0];
          if (this.field_s[param0] != -1) {
            nh.a(var14Lifetime3, var15, var16, var11Lifetime3, var12Lifetime3, var13Lifetime3, field_I[0], field_I[1], field_I[2], field_K[var17Lifetime1], field_K[var18Lifetime1], field_K[var19Lifetime1], field_E[var17Lifetime1], field_E[var18Lifetime1], field_E[var19Lifetime1], field_db[var17Lifetime1], field_db[var18Lifetime1], field_db[var19Lifetime1], var20Lifetime1Lifetime1);
            nh.a(var14Lifetime3, var16, field_j[3], var11Lifetime3, var13Lifetime3, field_n[3], field_I[0], field_I[2], field_I[3], field_K[var17Lifetime1], field_K[var18Lifetime1], field_K[var19Lifetime1], field_E[var17Lifetime1], field_E[var18Lifetime1], field_E[var19Lifetime1], field_db[var17Lifetime1], field_db[var18Lifetime1], field_db[var19Lifetime1], var20Lifetime1Lifetime1);
          } else {
            nh.a(var14Lifetime3, var15, var16, var11Lifetime3, var12Lifetime3, var13Lifetime3, this.field_z[param0], this.field_z[param0], this.field_z[param0], field_K[var17Lifetime1], field_K[var18Lifetime1], field_K[var19Lifetime1], field_E[var17Lifetime1], field_E[var18Lifetime1], field_E[var19Lifetime1], field_db[var17Lifetime1], field_db[var18Lifetime1], field_db[var19Lifetime1], var20Lifetime1Lifetime1);
            nh.a(var14Lifetime3, var16, field_j[3], var11Lifetime3, var13Lifetime3, field_n[3], this.field_z[param0], this.field_z[param0], this.field_z[param0], field_K[var17Lifetime1], field_K[var18Lifetime1], field_K[var19Lifetime1], field_E[var17Lifetime1], field_E[var18Lifetime1], field_E[var19Lifetime1], field_db[var17Lifetime1], field_db[var18Lifetime1], field_db[var19Lifetime1], var20Lifetime1Lifetime1);
          }
        } else {
          if (this.field_s[param0] != -1) {
            nh.a(var14Lifetime3, var15, var16, var11Lifetime3, var12Lifetime3, var13Lifetime3, field_I[0], field_I[1], field_I[2]);
            nh.a(var14Lifetime3, var16, field_j[3], var11Lifetime3, var13Lifetime3, field_n[3], field_I[0], field_I[2], field_I[3]);
          } else {
            var17Lifetime1 = nh.field_d[this.field_z[param0] & 65535];
            nh.a(var14Lifetime3, var15, var16, var11Lifetime3, var12Lifetime3, var13Lifetime3, var17Lifetime1);
            nh.a(var14Lifetime3, var16, field_j[3], var11Lifetime3, var13Lifetime3, field_n[3], var17Lifetime1);
          }
        }
    }

    private final void c() {
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
        if (field_m == 0) {
          field_eb = 0;
          field_Z = 0;
          field_D = 0;
          field_x = 0;
          return;
        }
        field_x = nh.field_o;
        field_D = nh.field_l;
        field_Z = 0;
        field_eb = 0;
        for (var1 = 0; var1 < this.field_q; var1++) {
          var2 = field_M[var1];
          if (var2 != -5000) {
            var3 = field_G[var1];
            if (var2 < field_x) {
              field_x = var2;
            }
            if (var2 > field_Z) {
              field_Z = var2;
            }
            if (var3 < field_D) {
              field_D = var3;
            }
            if (var3 > field_eb) {
              field_eb = var3;
            }
          }
        }
        for (var1Lifetime1 = field_m - 1; var1Lifetime1 >= 0; var1Lifetime1--) {
          var2Lifetime1 = field_O[var1Lifetime1];
          if (var2Lifetime1 > 0) {
            if (var2Lifetime1 <= 64) {
              var3Lifetime1 = var2Lifetime1;
            } else {
              var3Lifetime1 = 64;
            }
            var11 = field_fb[var1Lifetime1];
            for (var5 = 0; var5 < var3Lifetime1; var5++) {
              this.d(var11[var5]);
            }
          }
          if (var2Lifetime1 > 64) {
            var3Lifetime1Lifetime1 = field_O[var1Lifetime1] - 64 - 1;
            var12 = field_U[var3Lifetime1Lifetime1];
            var8 = 0;
            var5Lifetime1 = var8;
            while (var8 < field_w[var3Lifetime1Lifetime1]) {
              this.d(var12[var8]);
              var8++;
            }
          }
        }
        if (field_x < 0) {
          field_x = 0;
        }
        if (field_Z > nh.field_o) {
          field_Z = nh.field_o;
        }
        if (field_D < 0) {
          field_D = 0;
        }
        if (field_eb > nh.field_l) {
          field_eb = nh.field_l;
        }
        if (field_x > field_Z) {
          field_x = field_Z;
        }
        if (field_D > field_eb) {
          field_D = field_eb;
        }
        var1Lifetime2 = nh.field_p[0] % wb.field_h;
        var2Lifetime2 = nh.field_p[0] / wb.field_h;
        field_x = field_x + var1Lifetime2;
        field_Z = field_Z + var1Lifetime2;
        field_D = field_D + var2Lifetime2;
        field_eb = field_eb + var2Lifetime2;
        return;
    }

    private final void a(int param0, int param1) {
        if (param0 < field_x) {
          field_x = param0;
        }
        if (param0 > field_Z) {
          field_Z = param0;
        }
        if (param1 < field_D) {
          field_D = param1;
        }
        if (param1 > field_eb) {
          field_eb = param1;
          return;
        }
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
        field_m = 0;
        if (!this.field_Y) {
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
        if (var5 < 50 - this.field_C) {
          return;
        }
        var15Lifetime2 = this.field_C * 92682 >> 16;
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
        stackIn_15_0 = (var5 > 50 + this.field_C) ? 0 : 1;
        var16 = stackIn_15_0;
        if (var16 == 0) {
          stackIn_21_0 = (this.field_p > 0) ? 1 : 0;
        } else {
          stackIn_21_0 = 1;
        }
        var17Lifetime2 = stackIn_21_0;
        var18Lifetime1 = nh.field_n;
        var19Lifetime1 = nh.field_f;
        var20 = 0;
        var27 = 0;
        var21_intLifetime1 = var27;
        while (var27 < this.field_q) {
          var22Lifetime1 = this.field_y[var27];
          var23Lifetime1 = this.field_F[var27];
          var24 = this.field_cb[var27];
          var25 = var22Lifetime1 * var6 + var23Lifetime1 * var9 + var24 * var12 >> 16;
          var26 = var22Lifetime1 * var7 + var23Lifetime1 * var10 + var24 * var13 >> 16;
          var24 = var22Lifetime1 * var8 + var23Lifetime1 * var11 + var24 * var14 >> 16;
          var22Lifetime1Lifetime1 = var25;
          var23Lifetime1Lifetime1 = var26;
          field_k[var27] = var24;
          var22Lifetime1Lifetime1 = var22Lifetime1Lifetime1 + var3;
          var23Lifetime1Lifetime1 = var23Lifetime1Lifetime1 + var4;
          var24 = var24 + var5;
          if (var24 < 50) {
            field_M[var27] = -5000;
            var20 = 1;
          } else {
            field_M[var27] = var18Lifetime1 + (var22Lifetime1Lifetime1 << 9) / var24;
            field_G[var27] = var19Lifetime1 + (var23Lifetime1Lifetime1 << 9) / var24;
          }
          if (var17Lifetime2 != 0) {
            field_K[var27] = var22Lifetime1Lifetime1;
            field_E[var27] = var23Lifetime1Lifetime1;
            field_db[var27] = var24;
          }
          var27++;
        }
        try {
          this.a((var20 & var16) != 0, false, 0L, (int) this.field_C, this.field_C << 1);
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var21 = (Exception) (Object) decompiledCaughtException;
        }
        return;
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

    private final void d(int param0) {
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
        if (field_v[param0]) {
          var2 = nh.field_n;
          var3 = nh.field_f;
          var4 = this.field_gb[param0];
          var5 = this.field_P[param0];
          var6 = this.field_R[param0];
          var7 = field_db[var4];
          var8 = field_db[var5];
          var9 = field_db[var6];
          if (var7 < 50) {
            var10 = field_K[var4];
            var11 = field_E[var4];
            if (var9 >= 50) {
              var12 = (50 - var7) * nh.field_h[var9 - var7];
              this.a(var2 + (var10 + ((field_K[var6] - var10) * var12 >> 16) << 9) / 50, var3 + (var11 + ((field_E[var6] - var11) * var12 >> 16) << 9) / 50);
            }
            if (var8 >= 50) {
              var12Lifetime3 = (50 - var7) * nh.field_h[var8 - var7];
              this.a(var2 + (var10 + ((field_K[var5] - var10) * var12Lifetime3 >> 16) << 9) / 50, var3 + (var11 + ((field_E[var5] - var11) * var12Lifetime3 >> 16) << 9) / 50);
            }
          }
          if (var8 < 50) {
            var10Lifetime1 = field_K[var5];
            var11Lifetime1 = field_E[var5];
            if (var7 >= 50) {
              var12Lifetime1 = (50 - var8) * nh.field_h[var7 - var8];
              this.a(var2 + (var10Lifetime1 + ((field_K[var4] - var10Lifetime1) * var12Lifetime1 >> 16) << 9) / 50, var3 + (var11Lifetime1 + ((field_E[var4] - var11Lifetime1) * var12Lifetime1 >> 16) << 9) / 50);
            }
            if (var9 >= 50) {
              var12Lifetime1Lifetime1 = (50 - var8) * nh.field_h[var9 - var8];
              this.a(var2 + (var10Lifetime1 + ((field_K[var6] - var10Lifetime1) * var12Lifetime1Lifetime1 >> 16) << 9) / 50, var3 + (var11Lifetime1 + ((field_E[var6] - var11Lifetime1) * var12Lifetime1Lifetime1 >> 16) << 9) / 50);
            }
          }
          if (var9 < 50) {
            var10Lifetime2 = field_K[var6];
            var11Lifetime2 = field_E[var6];
            if (var8 >= 50) {
              var12Lifetime2 = (50 - var9) * nh.field_h[var8 - var9];
              this.a(var2 + (var10Lifetime2 + ((field_K[var5] - var10Lifetime2) * var12Lifetime2 >> 16) << 9) / 50, var3 + (var11Lifetime2 + ((field_E[var5] - var11Lifetime2) * var12Lifetime2 >> 16) << 9) / 50);
            }
            if (var7 >= 50) {
              var12Lifetime2Lifetime1 = (50 - var9) * nh.field_h[var7 - var9];
              this.a(var2 + (var10Lifetime2 + ((field_K[var4] - var10Lifetime2) * var12Lifetime2Lifetime1 >> 16) << 9) / 50, var3 + (var11Lifetime2 + ((field_E[var4] - var11Lifetime2) * var12Lifetime2Lifetime1 >> 16) << 9) / 50);
            }
          }
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

    final void a() {
        Throwable decompiledCaughtException = null;
        Exception var1 = null;
        try {
          this.c();
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = (Exception) (Object) decompiledCaughtException;
        }
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
        for (var9 = 0; var9 < this.field_ab; var9++) {
          var10 = this.field_y[var9];
          var11 = this.field_F[var9];
          var12 = this.field_cb[var9];
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
        this.field_C = (short)(int)(Math.sqrt((double)var8) + 0.99);
        this.field_Y = true;
    }

    private dd() {
        this.field_q = 0;
        this.field_Y = false;
        this.field_A = 0;
        this.field_ab = 0;
        this.field_p = 0;
    }

    dd(bn param0, int param1, int param2, int param3, int param4, int param5) {
        int dupTemp$1 = 0;
        int incrementValue$0 = 0;
        int var7;
        int var8;
        int var9;
        int[] var9_ref_int__;
        int var10;
        int var11;
        int var12;
        cb var13;
        int var14;
        int var15;
        int var16;
        int[] var17;
        fh var18;
        fh var19;
        int[] var20;
        int var9Lifetime1;
        int var10Lifetime1;
        int var10Lifetime2;
        int var11Lifetime1;
        int var11Lifetime2;
        int var10Lifetime1Lifetime1;
        int var10Lifetime1Lifetime2;
        this.field_q = 0;
        this.field_Y = false;
        this.field_A = 0;
        this.field_ab = 0;
        this.field_p = 0;
        param0.b();
        param0.d();
        this.field_q = param0.field_h;
        this.field_ab = param0.field_q;
        this.field_y = param0.field_K;
        this.field_F = param0.field_C;
        this.field_cb = param0.field_v;
        this.field_A = param0.field_y;
        this.field_gb = param0.field_P;
        this.field_P = param0.field_O;
        this.field_R = param0.field_N;
        this.field_u = param0.field_w;
        this.field_h = param0.field_D;
        var7 = (int)Math.sqrt((double)(param3 * param3 + param4 * param4 + param5 * param5));
        var8 = param2 * var7 >> 8;
        this.field_z = new int[this.field_A];
        this.field_o = new int[this.field_A];
        this.field_s = new int[this.field_A];
        if (param0.field_B != null) {
          this.field_S = new short[this.field_A];
          for (var9 = 0; var9 < this.field_A; var9++) {
            var10 = param0.field_B[var9];
            if (var10 != -1 &&
              nh.field_q.b(var10, -79)) {
              this.field_S[var9] = (short)var10;
            } else {
              this.field_S[var9] = (short)-1;
            }
          }
        } else {
          this.field_S = null;
        }
        if (param0.field_R > 0 &&
          param0.field_Q != null) {
          var20 = new int[param0.field_R];
          var17 = var20;
          var9_ref_int__ = var17;
          for (var10Lifetime1 = 0; var10Lifetime1 < this.field_A; var10Lifetime1++) {
            if (param0.field_Q[var10Lifetime1] != -1) {
              dupTemp$1 = param0.field_Q[var10Lifetime1] & 255;
              var9_ref_int__[dupTemp$1] = var9_ref_int__[dupTemp$1] + 1;
            }
          }
          this.field_p = 0;
          for (var10Lifetime1Lifetime1 = 0; var10Lifetime1Lifetime1 < param0.field_R; var10Lifetime1Lifetime1++) {
            if (var20[var10Lifetime1Lifetime1] > 0 &&
              param0.field_l[var10Lifetime1Lifetime1] == 0) {
              this.field_p = this.field_p + 1;
            }
          }
          this.field_N = new int[this.field_p];
          this.field_X = new int[this.field_p];
          this.field_i = new int[this.field_p];
          var10Lifetime1Lifetime2 = 0;
          for (var11 = 0; var11 < param0.field_R; var11++) {
            if (var20[var11] > 0 &&
              param0.field_l[var11] == 0) {
              this.field_N[var10Lifetime1Lifetime2] = param0.field_J[var11] & 65535;
              this.field_X[var10Lifetime1Lifetime2] = param0.field_n[var11] & 65535;
              this.field_i[var10Lifetime1Lifetime2] = param0.field_x[var11] & 65535;
              incrementValue$0 = var10Lifetime1Lifetime2;
              var10Lifetime1Lifetime2++;
              var9_ref_int__[var11] = incrementValue$0;
            } else {
              var20[var11] = -1;
            }
          }
          this.field_H = new byte[this.field_A];
          for (var11Lifetime2 = 0; var11Lifetime2 < this.field_A; var11Lifetime2++) {
            if (param0.field_Q[var11Lifetime2] == -1) {
              this.field_H[var11Lifetime2] = (byte)-1;
            } else {
              this.field_H[var11Lifetime2] = (byte)var9_ref_int__[param0.field_Q[var11Lifetime2] & 255];
              if (this.field_H[var11Lifetime2] == -1 &&
                this.field_S != null) {
                this.field_S[var11Lifetime2] = (short)-1;
              }
            }
          }
        }
        var16 = 0;
        var9Lifetime1 = var16;
        while (var16 < this.field_A) {
          if (param0.field_G != null) {
            var10Lifetime2 = param0.field_G[var16];
          } else {
            var10Lifetime2 = 0;
          }
          if (param0.field_D != null) {
            var11Lifetime1 = param0.field_D[var16];
          } else {
            var11Lifetime1 = 0;
          }
          if (this.field_S != null) {
            var12 = this.field_S[var16];
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
                this.field_s[var16] = -2;
              } else {
                var19 = param0.field_p[var16];
                var14 = param1 + (param3 * var19.field_f + param4 * var19.field_a + param5 * var19.field_c) / (var8 + var8 / 2);
                this.field_z[var16] = dd.c(var14);
                this.field_s[var16] = -1;
              }
            } else {
              if (param0.field_A != null &&
                param0.field_A[this.field_gb[var16]] != null) {
                var13 = param0.field_A[this.field_gb[var16]];
              } else {
                var13 = param0.field_o[this.field_gb[var16]];
              }
              var14 = param1 + (param3 * var13.field_j + param4 * var13.field_d + param5 * var13.field_i) / (var8 * var13.field_g);
              this.field_z[var16] = dd.c(var14);
              if (param0.field_A != null &&
                param0.field_A[this.field_P[var16]] != null) {
                var13 = param0.field_A[this.field_P[var16]];
              } else {
                var13 = param0.field_o[this.field_P[var16]];
              }
              var14 = param1 + (param3 * var13.field_j + param4 * var13.field_d + param5 * var13.field_i) / (var8 * var13.field_g);
              this.field_o[var16] = dd.c(var14);
              if (param0.field_A != null &&
                param0.field_A[this.field_R[var16]] != null) {
                var13 = param0.field_A[this.field_R[var16]];
              } else {
                var13 = param0.field_o[this.field_R[var16]];
              }
              var14 = param1 + (param3 * var13.field_j + param4 * var13.field_d + param5 * var13.field_i) / (var8 * var13.field_g);
              this.field_s[var16] = dd.c(var14);
            }
          } else {
            if (var10Lifetime2 != 0) {
              if (var10Lifetime2 != 1) {
                if (var10Lifetime2 != 3) {
                  this.field_s[var16] = -2;
                } else {
                  this.field_z[var16] = 128;
                  this.field_s[var16] = -1;
                }
              } else {
                var18 = param0.field_p[var16];
                var14 = param1 + (param3 * var18.field_f + param4 * var18.field_a + param5 * var18.field_c) / (var8 + var8 / 2) << 17;
                this.field_z[var16] = var14 | dd.b(param0.field_j[var16] & 65535, var14 >> 17);
                this.field_s[var16] = -1;
              }
            } else {
              var15 = param0.field_j[var16] & 65535;
              if (param0.field_A != null &&
                param0.field_A[this.field_gb[var16]] != null) {
                var13 = param0.field_A[this.field_gb[var16]];
              } else {
                var13 = param0.field_o[this.field_gb[var16]];
              }
              var14 = param1 + (param3 * var13.field_j + param4 * var13.field_d + param5 * var13.field_i) / (var8 * var13.field_g) << 17;
              this.field_z[var16] = var14 | dd.b(var15, var14 >> 17);
              if (param0.field_A != null &&
                param0.field_A[this.field_P[var16]] != null) {
                var13 = param0.field_A[this.field_P[var16]];
              } else {
                var13 = param0.field_o[this.field_P[var16]];
              }
              var14 = param1 + (param3 * var13.field_j + param4 * var13.field_d + param5 * var13.field_i) / (var8 * var13.field_g) << 17;
              this.field_o[var16] = var14 | dd.b(var15, var14 >> 17);
              if (param0.field_A != null &&
                param0.field_A[this.field_R[var16]] != null) {
                var13 = param0.field_A[this.field_R[var16]];
              } else {
                var13 = param0.field_o[this.field_R[var16]];
              }
              var14 = param1 + (param3 * var13.field_j + param4 * var13.field_d + param5 * var13.field_i) / (var8 * var13.field_g) << 17;
              this.field_s[var16] = var14 | dd.b(var15, var14 >> 17);
            }
          }
          var16++;
        }
    }

    static {
        dd discarded$0 = new dd();
        dd discarded$1 = new dd();
        dd discarded$2 = new dd();
        field_db = new int[4096];
        field_n = new int[10];
        field_M = new int[4096];
        field_V = new boolean[4096];
        field_t = 0;
        field_T = new int[4096];
        field_B = new int[4096];
        field_K = new int[4096];
        field_bb = new int[12];
        field_v = new boolean[4096];
        field_j = new int[10];
        field_Q = new int[12][4096];
        field_W = new int[12];
        field_k = new int[4096];
        field_r = false;
        field_E = new int[4096];
        field_I = new int[10];
        field_G = new int[4096];
        if (field_r) {
          field_l = new int[4096];
          field_L = new int[4096];
        } else {
          field_O = new int[1600];
          field_fb = new int[1600][64];
          field_w = new int[32];
          field_U = new int[32][512];
        }
    }
}
