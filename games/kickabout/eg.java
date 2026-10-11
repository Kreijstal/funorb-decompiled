/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eg extends qc {
    private int[] field_gb;
    private boolean field_M;
    private int[] field_mb;
    private int[] field_C;
    private boolean field_X;
    private int[][] field_I;
    private int field_T;
    private byte[] field_m;
    private int field_eb;
    int[] field_n;
    private short[] field_p;
    private short field_lb;
    private int field_L;
    private int[] field_v;
    private int[][] field_nb;
    private byte[] field_w;
    private short[] field_fb;
    private byte[] field_o;
    private int[] field_N;
    private int[] field_h;
    private int field_ab;
    private int[] field_E;
    private short[] field_x;
    private static eg field_r;
    private int[] field_W;
    private int[] field_S;
    private int[] field_kb;
    private static int[] field_cb;
    private int[] field_qb;
    private static byte[] field_jb;
    private static int[] field_G;
    private static short[] field_y;
    private static int[] field_j;
    private static int[] field_Z;
    private static int field_A;
    private static int[] field_U;
    private static int[] field_q;
    private static int[] field_D;
    private static int[] field_z;
    private short[] field_ob;
    private static int[] field_k;
    private static boolean field_O;
    private static int[] field_J;
    private static int[] field_i;
    private static int[] field_V;
    private static int[] field_H;
    private static int[][] field_Q;
    private static int field_bb;
    private static boolean[] field_ib;
    private static int[] field_R;
    private static int[] field_s;
    private static int[][] field_Y;
    private static int[] field_db;
    private static int[] field_P;
    private static int[] field_u;
    private static boolean field_l;
    private static int[] field_B;
    private static int field_pb;
    private static boolean[] field_F;
    private static int[] field_t;
    private static int[][] field_K;
    private static int field_hb;

    public static void d() {
        field_r = null;
        field_jb = null;
        field_y = null;
        field_G = null;
        field_cb = null;
        field_j = null;
        field_F = null;
        field_ib = null;
        field_i = null;
        field_s = null;
        field_U = null;
        field_R = null;
        field_B = null;
        field_u = null;
        field_D = null;
        field_Q = (int[][]) null;
        field_P = null;
        field_K = (int[][]) null;
        field_J = null;
        field_k = null;
        field_q = null;
        field_Y = (int[][]) null;
        field_V = null;
        field_Z = null;
        field_z = null;
        field_t = null;
        field_db = null;
        field_H = null;
    }

    private final void c() {
        int var4 = 0;
        int var3;
        int stackIn_5_0 = 0;
        int var1;
        int var2;
        for (var4 = 0; var4 < this.field_ab; var4++) {
          if (this.field_x == null) {
            stackIn_5_0 = -1;
          } else {
            stackIn_5_0 = this.field_x[var4];
          }
          var3 = stackIn_5_0;
          if (var3 == -1) {
            var1 = this.field_p[var4] & 65535;
            if (this.field_n[var4] != -1) {
              if (this.field_n[var4] != -2) {
                var2 = this.field_kb[var4] & -131072;
                this.field_kb[var4] = var2 | eg.a(var1, var2 >> 17);
                var2 = this.field_v[var4] & -131072;
                this.field_v[var4] = var2 | eg.a(var1, var2 >> 17);
                var2 = this.field_n[var4] & -131072;
                this.field_n[var4] = var2 | eg.a(var1, var2 >> 17);
              }
            } else {
              var2 = this.field_kb[var4] & -131072;
              this.field_kb[var4] = var2 | eg.a(var1, var2 >> 17);
            }
          }
        }
    }

    private final void e(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        if (field_ib[param0]) {
          this.c(param0);
          return;
        }
        var2 = this.field_gb[param0];
        var3 = this.field_S[param0];
        var4 = this.field_h[param0];
        t.field_g = field_F[param0];
        if (this.field_m != null) {
          t.field_h = this.field_m[param0] & 255;
        } else {
          t.field_h = 0;
        }
        if (this.field_x != null &&
          this.field_x[param0] != -1) {
          if (this.field_o != null &&
            this.field_o[param0] != -1) {
            var8 = this.field_o[param0] & 255;
            var5 = this.field_mb[var8];
            var6 = this.field_C[var8];
            var7 = this.field_qb[var8];
          } else {
            var5 = var2;
            var6 = var3;
            var7 = var4;
          }
          if (this.field_n[param0] != -1) {
            t.a(field_s[var2], field_s[var3], field_s[var4], field_i[var2], field_i[var3], field_i[var4], this.field_kb[param0], this.field_v[param0], this.field_n[param0], field_R[var5], field_R[var6], field_R[var7], field_B[var5], field_B[var6], field_B[var7], field_u[var5], field_u[var6], field_u[var7], (int) this.field_x[param0]);
          } else {
            t.a(field_s[var2], field_s[var3], field_s[var4], field_i[var2], field_i[var3], field_i[var4], this.field_kb[param0], this.field_kb[param0], this.field_kb[param0], field_R[var5], field_R[var6], field_R[var7], field_B[var5], field_B[var6], field_B[var7], field_u[var5], field_u[var6], field_u[var7], (int) this.field_x[param0]);
          }
        } else {
          if (this.field_n[param0] != -1) {
            t.a(field_s[var2], field_s[var3], field_s[var4], field_i[var2], field_i[var3], field_i[var4], this.field_kb[param0] & 65535, this.field_v[param0] & 65535, this.field_n[param0] & 65535);
          } else {
            t.a(field_s[var2], field_s[var3], field_s[var4], field_i[var2], field_i[var3], field_i[var4], t.field_l[this.field_kb[param0] & 65535]);
          }
        }
    }

    final void f() {
        int var1 = 0;
        int var2 = 0;
        for (var1 = 0; var1 < this.field_L; var1++) {
          var2 = this.field_N[var1];
          this.field_N[var1] = this.field_E[var1];
          this.field_E[var1] = -var2;
        }
        this.field_M = false;
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
          field_pb = 0;
          field_hb = 0;
          field_A = 0;
          for (var9 = 0; var9 < var7; var9++) {
            var10 = param1[var9];
            if (var10 < this.field_I.length) {
              var35 = this.field_I[var10];
              for (var12 = 0; var12 < var35.length; var12++) {
                var13 = var35[var12];
                field_pb = field_pb + this.field_N[var13];
                field_hb = field_hb + this.field_W[var13];
                field_A = field_A + this.field_E[var13];
                var8++;
              }
            }
          }
          if (var8 <= 0) {
            field_pb = param2;
            field_hb = param3;
            field_A = param4;
          } else {
            field_pb = field_pb / var8 + param2;
            field_hb = field_hb / var8 + param3;
            field_A = field_A / var8 + param4;
          }
          return;
        }
        if (param0 == 1) {
          for (var8Lifetime1 = 0; var8Lifetime1 < var7; var8Lifetime1++) {
            var9Lifetime1 = param1[var8Lifetime1];
            if (var9Lifetime1 < this.field_I.length) {
              var36 = this.field_I[var9Lifetime1];
              for (var11 = 0; var11 < var36.length; var11++) {
                var12Lifetime1 = var36[var11];
                this.field_N[var12Lifetime1] = this.field_N[var12Lifetime1] + param2;
                this.field_W[var12Lifetime1] = this.field_W[var12Lifetime1] + param3;
                this.field_E[var12Lifetime1] = this.field_E[var12Lifetime1] + param4;
              }
            }
          }
          return;
        }
        if (param0 == 2) {
          for (var8Lifetime2 = 0; var8Lifetime2 < var7; var8Lifetime2++) {
            var9Lifetime2 = param1[var8Lifetime2];
            if (var9Lifetime2 < this.field_I.length) {
              var37 = this.field_I[var9Lifetime2];
              for (var11Lifetime1 = 0; var11Lifetime1 < var37.length; var11Lifetime1++) {
                var12Lifetime2 = var37[var11Lifetime1];
                this.field_N[var12Lifetime2] = this.field_N[var12Lifetime2] - field_pb;
                this.field_W[var12Lifetime2] = this.field_W[var12Lifetime2] - field_hb;
                this.field_E[var12Lifetime2] = this.field_E[var12Lifetime2] - field_A;
                if (param4 != 0) {
                  var13Lifetime1 = t.field_f[param4];
                  var14 = t.field_o[param4];
                  var15 = this.field_W[var12Lifetime2] * var13Lifetime1 + this.field_N[var12Lifetime2] * var14 + 32767 >> 16;
                  this.field_W[var12Lifetime2] = this.field_W[var12Lifetime2] * var14 - this.field_N[var12Lifetime2] * var13Lifetime1 + 32767 >> 16;
                  this.field_N[var12Lifetime2] = var15;
                }
                if (param2 != 0) {
                  var13Lifetime1Lifetime1 = t.field_f[param2];
                  var14Lifetime2 = t.field_o[param2];
                  var15Lifetime2 = this.field_W[var12Lifetime2] * var14Lifetime2 - this.field_E[var12Lifetime2] * var13Lifetime1Lifetime1 + 32767 >> 16;
                  this.field_E[var12Lifetime2] = this.field_W[var12Lifetime2] * var13Lifetime1Lifetime1 + this.field_E[var12Lifetime2] * var14Lifetime2 + 32767 >> 16;
                  this.field_W[var12Lifetime2] = var15Lifetime2;
                }
                if (param3 != 0) {
                  var13Lifetime1Lifetime2 = t.field_f[param3];
                  var14Lifetime3 = t.field_o[param3];
                  var15Lifetime3 = this.field_E[var12Lifetime2] * var13Lifetime1Lifetime2 + this.field_N[var12Lifetime2] * var14Lifetime3 + 32767 >> 16;
                  this.field_E[var12Lifetime2] = this.field_E[var12Lifetime2] * var14Lifetime3 - this.field_N[var12Lifetime2] * var13Lifetime1Lifetime2 + 32767 >> 16;
                  this.field_N[var12Lifetime2] = var15Lifetime3;
                }
                this.field_N[var12Lifetime2] = this.field_N[var12Lifetime2] + field_pb;
                this.field_W[var12Lifetime2] = this.field_W[var12Lifetime2] + field_hb;
                this.field_E[var12Lifetime2] = this.field_E[var12Lifetime2] + field_A;
              }
            }
          }
          return;
        }
        if (param0 == 3) {
          for (var8Lifetime3 = 0; var8Lifetime3 < var7; var8Lifetime3++) {
            var9Lifetime3 = param1[var8Lifetime3];
            if (var9Lifetime3 < this.field_I.length) {
              var38 = this.field_I[var9Lifetime3];
              for (var11Lifetime2 = 0; var11Lifetime2 < var38.length; var11Lifetime2++) {
                var12Lifetime3 = var38[var11Lifetime2];
                this.field_N[var12Lifetime3] = this.field_N[var12Lifetime3] - field_pb;
                this.field_W[var12Lifetime3] = this.field_W[var12Lifetime3] - field_hb;
                this.field_E[var12Lifetime3] = this.field_E[var12Lifetime3] - field_A;
                this.field_N[var12Lifetime3] = this.field_N[var12Lifetime3] * param2 / 128;
                this.field_W[var12Lifetime3] = this.field_W[var12Lifetime3] * param3 / 128;
                this.field_E[var12Lifetime3] = this.field_E[var12Lifetime3] * param4 / 128;
                this.field_N[var12Lifetime3] = this.field_N[var12Lifetime3] + field_pb;
                this.field_W[var12Lifetime3] = this.field_W[var12Lifetime3] + field_hb;
                this.field_E[var12Lifetime3] = this.field_E[var12Lifetime3] + field_A;
              }
            }
          }
          return;
        }
        if (param0 != 5) {
          if (param0 != 7) {
            return;
          }
          if (this.field_nb != null) {
            for (var8Lifetime4 = 0; var8Lifetime4 < var7; var8Lifetime4++) {
              var9Lifetime4 = param1[var8Lifetime4];
              if (var9Lifetime4 < this.field_nb.length) {
                var40 = this.field_nb[var9Lifetime4];
                for (var11Lifetime3 = 0; var11Lifetime3 < var40.length; var11Lifetime3++) {
                  var12Lifetime4 = var40[var11Lifetime3];
                  var13Lifetime2 = this.field_p[var12Lifetime4] & 65535;
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
                  this.field_p[var12Lifetime4] = (short)(var14Lifetime1 << 10 | var15Lifetime1 << 7 | var16);
                }
                this.field_X = true;
              }
            }
            return;
          }
        } else {
          if (this.field_nb != null) {
            if (this.field_m != null) {
              for (var8Lifetime4 = 0; var8Lifetime4 < var7; var8Lifetime4++) {
                var9Lifetime4 = param1[var8Lifetime4];
                if (var9Lifetime4 < this.field_nb.length) {
                  var39 = this.field_nb[var9Lifetime4];
                  for (var11Lifetime3 = 0; var11Lifetime3 < var39.length; var11Lifetime3++) {
                    var12Lifetime4 = var39[var11Lifetime3];
                    var13Lifetime2 = (this.field_m[var12Lifetime4] & 255) + param2 * 8;
                    if (var13Lifetime2 >= 0) {
                      if (var13Lifetime2 > 255) {
                        var13Lifetime2 = 255;
                      }
                    } else {
                      var13Lifetime2 = 0;
                    }
                    this.field_m[var12Lifetime4] = (byte)var13Lifetime2;
                  }
                }
              }
              return;
            }
            return;
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var9_int = 0;
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
        int var22Lifetime1;
        int var24Lifetime1;
        int var24Lifetime2;
        int var24Lifetime3;
        try {
          if (!this.field_M) {
            this.e();
          }
          var9_int = t.field_p;
          var10 = t.field_e;
          var11 = t.field_f[param0];
          var12 = t.field_o[param0];
          var13 = t.field_f[param1];
          var14 = t.field_o[param1];
          var15 = t.field_f[param2];
          var16 = t.field_o[param2];
          var17 = t.field_f[param3];
          var18 = t.field_o[param3];
          var19 = param5 * var17 + param6 * var18 >> 16;
          for (var20 = 0; var20 < this.field_L; var20++) {
            var21 = this.field_N[var20];
            var22 = this.field_W[var20];
            var23 = this.field_E[var20];
            if (param2 != 0) {
              var24 = var22 * var15 + var21 * var16 >> 16;
              var22 = var22 * var16 - var21 * var15 >> 16;
              var21 = var24;
            }
            if (param0 != 0) {
              var24Lifetime1 = var22 * var12 - var23 * var11 >> 16;
              var23 = var22 * var11 + var23 * var12 >> 16;
              var22 = var24Lifetime1;
            }
            if (param1 != 0) {
              var24Lifetime2 = var23 * var13 + var21 * var14 >> 16;
              var23 = var23 * var14 - var21 * var13 >> 16;
              var21 = var24Lifetime2;
            }
            var21 = var21 + param4;
            var22 = var22 + param5;
            var23 = var23 + param6;
            var24Lifetime3 = var22 * var18 - var23 * var17 >> 16;
            var23 = var22 * var17 + var23 * var18 >> 16;
            var22Lifetime1 = var24Lifetime3;
            field_U[var20] = var23 - var19;
            field_i[var20] = var9_int + (var21 << 9) / param7;
            field_s[var20] = var10 + (var22Lifetime1 << 9) / param7;
            if (this.field_eb > 0) {
              field_R[var20] = var21;
              field_B[var20] = var22Lifetime1;
              field_u[var20] = var23;
            }
          }
          this.a(false, false, 0L, (int) this.field_lb, this.field_lb << 1);
        } catch (RuntimeException runtimeException) {
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
        var2 = t.field_p;
        var3 = t.field_e;
        var4 = 0;
        var5 = this.field_gb[param0];
        var6 = this.field_S[param0];
        var7 = this.field_h[param0];
        var8 = field_u[var5];
        var9 = field_u[var6];
        var10 = field_u[var7];
        if (this.field_m != null) {
          t.field_h = this.field_m[param0] & 255;
        } else {
          t.field_h = 0;
        }
        if (var8 < 50) {
          var11 = field_R[var5];
          var12 = field_B[var5];
          var13 = this.field_kb[param0] & 65535;
          if (var10 >= 50) {
            var14 = (50 - var8) * t.field_m[var10 - var8];
            field_t[var4] = var2 + (var11 + ((field_R[var7] - var11) * var14 >> 16) << 9) / 50;
            field_db[var4] = var3 + (var12 + ((field_B[var7] - var12) * var14 >> 16) << 9) / 50;
            incrementValue$0 = var4;
            var4++;
            field_H[incrementValue$0] = var13 + (((this.field_n[param0] & 65535) - var13) * var14 >> 16);
          }
          if (var9 >= 50) {
            var14Lifetime4 = (50 - var8) * t.field_m[var9 - var8];
            field_t[var4] = var2 + (var11 + ((field_R[var6] - var11) * var14Lifetime4 >> 16) << 9) / 50;
            field_db[var4] = var3 + (var12 + ((field_B[var6] - var12) * var14Lifetime4 >> 16) << 9) / 50;
            incrementValue$1 = var4;
            var4++;
            field_H[incrementValue$1] = var13 + (((this.field_v[param0] & 65535) - var13) * var14Lifetime4 >> 16);
          }
        } else {
          field_t[var4] = field_i[var5];
          field_db[var4] = field_s[var5];
          incrementValue$2 = var4;
          var4++;
          field_H[incrementValue$2] = this.field_kb[param0] & 65535;
        }
        if (var9 < 50) {
          var11Lifetime1 = field_R[var6];
          var12Lifetime1 = field_B[var6];
          var13Lifetime1 = this.field_v[param0] & 65535;
          if (var8 >= 50) {
            var14Lifetime1 = (50 - var9) * t.field_m[var8 - var9];
            field_t[var4] = var2 + (var11Lifetime1 + ((field_R[var5] - var11Lifetime1) * var14Lifetime1 >> 16) << 9) / 50;
            field_db[var4] = var3 + (var12Lifetime1 + ((field_B[var5] - var12Lifetime1) * var14Lifetime1 >> 16) << 9) / 50;
            incrementValue$3 = var4;
            var4++;
            field_H[incrementValue$3] = var13Lifetime1 + (((this.field_kb[param0] & 65535) - var13Lifetime1) * var14Lifetime1 >> 16);
          }
          if (var10 >= 50) {
            var14Lifetime1Lifetime1 = (50 - var9) * t.field_m[var10 - var9];
            field_t[var4] = var2 + (var11Lifetime1 + ((field_R[var7] - var11Lifetime1) * var14Lifetime1Lifetime1 >> 16) << 9) / 50;
            field_db[var4] = var3 + (var12Lifetime1 + ((field_B[var7] - var12Lifetime1) * var14Lifetime1Lifetime1 >> 16) << 9) / 50;
            incrementValue$4 = var4;
            var4++;
            field_H[incrementValue$4] = var13Lifetime1 + (((this.field_n[param0] & 65535) - var13Lifetime1) * var14Lifetime1Lifetime1 >> 16);
          }
        } else {
          field_t[var4] = field_i[var6];
          field_db[var4] = field_s[var6];
          incrementValue$5 = var4;
          var4++;
          field_H[incrementValue$5] = this.field_v[param0] & 65535;
        }
        if (var10 < 50) {
          var11Lifetime2 = field_R[var7];
          var12Lifetime2 = field_B[var7];
          var13Lifetime2 = this.field_n[param0] & 65535;
          if (var9 >= 50) {
            var14Lifetime2 = (50 - var10) * t.field_m[var9 - var10];
            field_t[var4] = var2 + (var11Lifetime2 + ((field_R[var6] - var11Lifetime2) * var14Lifetime2 >> 16) << 9) / 50;
            field_db[var4] = var3 + (var12Lifetime2 + ((field_B[var6] - var12Lifetime2) * var14Lifetime2 >> 16) << 9) / 50;
            incrementValue$6 = var4;
            var4++;
            field_H[incrementValue$6] = var13Lifetime2 + (((this.field_v[param0] & 65535) - var13Lifetime2) * var14Lifetime2 >> 16);
          }
          if (var8 >= 50) {
            var14Lifetime2Lifetime1 = (50 - var10) * t.field_m[var8 - var10];
            field_t[var4] = var2 + (var11Lifetime2 + ((field_R[var5] - var11Lifetime2) * var14Lifetime2Lifetime1 >> 16) << 9) / 50;
            field_db[var4] = var3 + (var12Lifetime2 + ((field_B[var5] - var12Lifetime2) * var14Lifetime2Lifetime1 >> 16) << 9) / 50;
            incrementValue$7 = var4;
            var4++;
            field_H[incrementValue$7] = var13Lifetime2 + (((this.field_kb[param0] & 65535) - var13Lifetime2) * var14Lifetime2Lifetime1 >> 16);
          }
        } else {
          field_t[var4] = field_i[var7];
          field_db[var4] = field_s[var7];
          incrementValue$8 = var4;
          var4++;
          field_H[incrementValue$8] = this.field_n[param0] & 65535;
        }
        boolean decompiledFrameRemainder0 = true;
        var11Lifetime3 = field_t[0];
        var12Lifetime3 = field_t[1];
        var13Lifetime3 = field_t[2];
        var14Lifetime3 = field_db[0];
        var15 = field_db[1];
        var16 = field_db[2];
        t.field_g = false;
        if (var4 == 3) {
          if (var11Lifetime3 < 0 ||
            var12Lifetime3 < 0 ||
            var13Lifetime3 < 0 ||
            !(var11Lifetime3 <= t.field_b) ||
            !(var12Lifetime3 <= t.field_b) ||
            !(var13Lifetime3 <= t.field_b)) {
            t.field_g = true;
          }
          if (this.field_x != null &&
            this.field_x[param0] != -1) {
            if (this.field_o != null &&
              this.field_o[param0] != -1) {
              var20 = this.field_o[param0] & 255;
              var17 = this.field_mb[var20];
              var18 = this.field_C[var20];
              var19 = this.field_qb[var20];
            } else {
              var17 = var5;
              var18 = var6;
              var19 = var7;
            }
            if (this.field_n[param0] != -1) {
              t.a(var14Lifetime3, var15, var16, var11Lifetime3, var12Lifetime3, var13Lifetime3, field_H[0], field_H[1], field_H[2], field_R[var17], field_R[var18], field_R[var19], field_B[var17], field_B[var18], field_B[var19], field_u[var17], field_u[var18], field_u[var19], (int) this.field_x[param0]);
            } else {
              t.a(var14Lifetime3, var15, var16, var11Lifetime3, var12Lifetime3, var13Lifetime3, this.field_kb[param0], this.field_kb[param0], this.field_kb[param0], field_R[var17], field_R[var18], field_R[var19], field_B[var17], field_B[var18], field_B[var19], field_u[var17], field_u[var18], field_u[var19], (int) this.field_x[param0]);
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (this.field_n[param0] != -1) {
              t.a(var14Lifetime3, var15, var16, var11Lifetime3, var12Lifetime3, var13Lifetime3, field_H[0], field_H[1], field_H[2]);
            } else {
              t.a(var14Lifetime3, var15, var16, var11Lifetime3, var12Lifetime3, var13Lifetime3, t.field_l[this.field_kb[param0] & 65535]);
            }
          }
        }
        if (var4 != 4) {
          return;
        }
        if (var11Lifetime3 < 0 ||
          var12Lifetime3 < 0 ||
          var13Lifetime3 < 0 ||
          !(var11Lifetime3 <= t.field_b) ||
          !(var12Lifetime3 <= t.field_b) ||
          !(var13Lifetime3 <= t.field_b) ||
          !(field_t[3] >= 0) ||
          !(field_t[3] <= t.field_b)) {
          t.field_g = true;
        }
        if (this.field_x != null &&
          this.field_x[param0] != -1) {
          if (this.field_o != null &&
            this.field_o[param0] != -1) {
            var20Lifetime1 = this.field_o[param0] & 255;
            var17Lifetime1 = this.field_mb[var20Lifetime1];
            var18Lifetime1 = this.field_C[var20Lifetime1];
            var19Lifetime1 = this.field_qb[var20Lifetime1];
          } else {
            var17Lifetime1 = var5;
            var18Lifetime1 = var6;
            var19Lifetime1 = var7;
          }
          var20Lifetime1Lifetime1 = this.field_x[param0];
          if (this.field_n[param0] != -1) {
            t.a(var14Lifetime3, var15, var16, var11Lifetime3, var12Lifetime3, var13Lifetime3, field_H[0], field_H[1], field_H[2], field_R[var17Lifetime1], field_R[var18Lifetime1], field_R[var19Lifetime1], field_B[var17Lifetime1], field_B[var18Lifetime1], field_B[var19Lifetime1], field_u[var17Lifetime1], field_u[var18Lifetime1], field_u[var19Lifetime1], var20Lifetime1Lifetime1);
            t.a(var14Lifetime3, var16, field_db[3], var11Lifetime3, var13Lifetime3, field_t[3], field_H[0], field_H[2], field_H[3], field_R[var17Lifetime1], field_R[var18Lifetime1], field_R[var19Lifetime1], field_B[var17Lifetime1], field_B[var18Lifetime1], field_B[var19Lifetime1], field_u[var17Lifetime1], field_u[var18Lifetime1], field_u[var19Lifetime1], var20Lifetime1Lifetime1);
          } else {
            t.a(var14Lifetime3, var15, var16, var11Lifetime3, var12Lifetime3, var13Lifetime3, this.field_kb[param0], this.field_kb[param0], this.field_kb[param0], field_R[var17Lifetime1], field_R[var18Lifetime1], field_R[var19Lifetime1], field_B[var17Lifetime1], field_B[var18Lifetime1], field_B[var19Lifetime1], field_u[var17Lifetime1], field_u[var18Lifetime1], field_u[var19Lifetime1], var20Lifetime1Lifetime1);
            t.a(var14Lifetime3, var16, field_db[3], var11Lifetime3, var13Lifetime3, field_t[3], this.field_kb[param0], this.field_kb[param0], this.field_kb[param0], field_R[var17Lifetime1], field_R[var18Lifetime1], field_R[var19Lifetime1], field_B[var17Lifetime1], field_B[var18Lifetime1], field_B[var19Lifetime1], field_u[var17Lifetime1], field_u[var18Lifetime1], field_u[var19Lifetime1], var20Lifetime1Lifetime1);
          }
        } else {
          if (this.field_n[param0] != -1) {
            t.a(var14Lifetime3, var15, var16, var11Lifetime3, var12Lifetime3, var13Lifetime3, field_H[0], field_H[1], field_H[2]);
            t.a(var14Lifetime3, var16, field_db[3], var11Lifetime3, var13Lifetime3, field_t[3], field_H[0], field_H[2], field_H[3]);
          } else {
            var17Lifetime1 = t.field_l[this.field_kb[param0] & 65535];
            t.a(var14Lifetime3, var15, var16, var11Lifetime3, var12Lifetime3, var13Lifetime3, var17Lifetime1);
            t.a(var14Lifetime3, var16, field_db[3], var11Lifetime3, var13Lifetime3, field_t[3], var17Lifetime1);
          }
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
        if (!field_l) {
          for (var8 = 0; var8 < 1600; var8++) {
            field_D[var8] = 0;
          }
          for (var8Lifetime4 = 0; var8Lifetime4 < 32; var8Lifetime4++) {
            field_P[var8Lifetime4] = 0;
          }
          field_bb = 0;
        }
        for (var8Lifetime1 = 0; var8Lifetime1 < this.field_ab; var8Lifetime1++) {
          L45: {
            if (this.field_n[var8Lifetime1] != -2) {
              var9 = this.field_gb[var8Lifetime1];
              var10 = this.field_S[var8Lifetime1];
              var11 = this.field_h[var8Lifetime1];
              var12 = field_i[var9];
              var13 = field_i[var10];
              var14_int = field_i[var11];
              if (param0 && (var12 == -5000 ||
                var13 == -5000 ||
                var14_int == -5000)) {
                var15_int = field_R[var9];
                var16 = field_R[var10];
                var17 = field_R[var11];
                var18 = field_B[var9];
                var19 = field_B[var10];
                var20 = field_B[var11];
                var21 = field_u[var9];
                var22 = field_u[var10];
                var23 = field_u[var11];
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
                  field_ib[var8Lifetime1] = true;
                  if (field_l) {
                    field_J[var7] = (field_U[var9] + field_U[var10] + field_U[var11]) / 3;
                    incrementValue$12 = var7;
                    var7++;
                    field_k[incrementValue$12] = var8Lifetime1;
                  } else {
                    var27 = (field_U[var9] + field_U[var10] + field_U[var11]) / 3 + param3;
                    if (field_D[var27] < 64) {
                      dupTemp$10 = field_D[var27];
                      arrayValue$11 = field_Q[var27];
                      field_D[var27] = dupTemp$10 + 1;
                      arrayValue$11[dupTemp$10] = var8Lifetime1;
                    } else {
                      var28 = field_D[var27];
                      if (var28 == 64) {
                        if (field_bb == 512) {
                          break L45;
                        }
                        fieldTemp$7 = field_bb;
                        field_bb = field_bb + 1;
                        var28 = 65 + fieldTemp$7;
                        field_D[var27] = 65 + fieldTemp$7;
                      }
                      var28 -= 65;
                      dupTemp$8 = field_P[var28];
                      arrayValue$9 = field_K[var28];
                      field_P[var28] = dupTemp$8 + 1;
                      arrayValue$9[dupTemp$8] = var8Lifetime1;
                    }
                  }
                }
                break L45;
              }
              if (param1 &&
                this.b(bq.field_c + t.field_p, vs.field_i + t.field_e, field_s[var9], field_s[var10], field_s[var11], var12, var13, var14_int)) {
                fieldTemp$13 = jk.field_f;
                jk.field_f = jk.field_f + 1;
                rg.field_c[fieldTemp$13] = param2;
                param1 = false;
              }
              if ((var12 - var13) * (field_s[var11] - field_s[var10]) - (field_s[var9] - field_s[var10]) * (var14_int - var13) > 0) {
                field_ib[var8Lifetime1] = false;
                if (var12 >= 0 &&
                  var13 >= 0 &&
                  var14_int >= 0 &&
                  var12 <= t.field_b &&
                  var13 <= t.field_b &&
                  var14_int <= t.field_b) {
                  field_F[var8Lifetime1] = false;
                } else {
                  field_F[var8Lifetime1] = true;
                }
                if (!field_l) {
                  var15_intLifetime2 = (field_U[var9] + field_U[var10] + field_U[var11]) / 3 + param3;
                  if (field_D[var15_intLifetime2] >= 64) {
                    var16Lifetime2 = field_D[var15_intLifetime2];
                    if (var16Lifetime2 == 64) {
                      if (field_bb == 512) {
                        break L45;
                      }
                      fieldTemp$14 = field_bb;
                      field_bb = field_bb + 1;
                      var16Lifetime2 = 65 + fieldTemp$14;
                      field_D[var15_intLifetime2] = 65 + fieldTemp$14;
                    }
                    var16Lifetime2 -= 65;
                    dupTemp$15 = field_P[var16Lifetime2];
                    arrayValue$16 = field_K[var16Lifetime2];
                    field_P[var16Lifetime2] = dupTemp$15 + 1;
                    arrayValue$16[dupTemp$15] = var8Lifetime1;
                  } else {
                    dupTemp$17 = field_D[var15_intLifetime2];
                    arrayValue$18 = field_Q[var15_intLifetime2];
                    field_D[var15_intLifetime2] = dupTemp$17 + 1;
                    arrayValue$18[dupTemp$17] = var8Lifetime1;
                  }
                } else {
                  field_J[var7] = (field_U[var9] + field_U[var10] + field_U[var11]) / 3;
                  incrementValue$19 = var7;
                  var7++;
                  field_k[incrementValue$19] = var8Lifetime1;
                }
              }
            }
          }
        }
        if (field_l) {
          qi.a(0, var7 - 1, -1, field_J, field_k);
          if (this.field_w == null) {
            for (var8Lifetime2 = 0; var8Lifetime2 < var7; var8Lifetime2++) {
              this.e(field_k[var8Lifetime2]);
            }
            return;
          }
          for (var8Lifetime2 = 0; var8Lifetime2 < 12; var8Lifetime2++) {
            field_q[var8Lifetime2] = 0;
            field_z[var8Lifetime2] = 0;
          }
          for (var8Lifetime2 = 0; var8Lifetime2 < var7; var8Lifetime2++) {
            var9Lifetime1 = field_k[var8Lifetime2];
            var10Lifetime1 = field_J[var8Lifetime2];
            var11Lifetime1 = this.field_w[var9Lifetime1];
            dupTemp$2 = field_q[var11Lifetime1];
            field_q[var11Lifetime1] = dupTemp$2 + 1;
            var12Lifetime1 = dupTemp$2;
            field_Y[var11Lifetime1][var12Lifetime1] = var9Lifetime1;
            if (var11Lifetime1 >= 10) {
              if (var11Lifetime1 != 10) {
                field_Z[var12Lifetime1] = var10Lifetime1;
              } else {
                field_V[var12Lifetime1] = var10Lifetime1;
              }
            } else {
              field_z[var11Lifetime1] = field_z[var11Lifetime1] + var10Lifetime1;
            }
          }
        } else {
          if (this.field_w == null) {
            for (var8Lifetime2 = param4 - 1; var8Lifetime2 >= 0; var8Lifetime2--) {
              var9Lifetime1 = field_D[var8Lifetime2];
              if (var9Lifetime1 > 0) {
                stackIn_90_0 = (var9Lifetime1 <= 64) ? var9Lifetime1 : 64;
                var10Lifetime1 = stackIn_90_0;
                var45 = field_Q[var8Lifetime2];
                for (var12Lifetime1 = 0; var12Lifetime1 < var10Lifetime1; var12Lifetime1++) {
                  this.e(var45[var12Lifetime1]);
                }
              }
              if (var9Lifetime1 > 64) {
                var10Lifetime1 = field_D[var8Lifetime2] - 64 - 1;
                var46 = field_K[var10Lifetime1];
                for (var12Lifetime1 = 0; var12Lifetime1 < field_P[var10Lifetime1]; var12Lifetime1++) {
                  this.e(var46[var12Lifetime1]);
                }
              }
            }
            return;
          }
          for (var8Lifetime2 = 0; var8Lifetime2 < 12; var8Lifetime2++) {
            field_q[var8Lifetime2] = 0;
            field_z[var8Lifetime2] = 0;
          }
          for (var8Lifetime2 = param4 - 1; var8Lifetime2 >= 0; var8Lifetime2--) {
            var9Lifetime1 = field_D[var8Lifetime2];
            if (var9Lifetime1 > 0) {
              if (var9Lifetime1 <= 64) {
                var10Lifetime1 = var9Lifetime1;
              } else {
                var10Lifetime1 = 64;
              }
              var47 = field_Q[var8Lifetime2];
              for (var12Lifetime1 = 0; var12Lifetime1 < var10Lifetime1; var12Lifetime1++) {
                var13Lifetime1 = var47[var12Lifetime1];
                var14_intLifetime1 = this.field_w[var13Lifetime1];
                dupTemp$0 = field_q[var14_intLifetime1];
                field_q[var14_intLifetime1] = dupTemp$0 + 1;
                var15_intLifetime1 = dupTemp$0;
                field_Y[var14_intLifetime1][var15_intLifetime1] = var13Lifetime1;
                if (var14_intLifetime1 >= 10) {
                  if (var14_intLifetime1 != 10) {
                    field_Z[var15_intLifetime1] = var8Lifetime2;
                  } else {
                    field_V[var15_intLifetime1] = var8Lifetime2;
                  }
                } else {
                  field_z[var14_intLifetime1] = field_z[var14_intLifetime1] + var8Lifetime2;
                }
              }
            }
            if (var9Lifetime1 > 64) {
              var10Lifetime1 = field_D[var8Lifetime2] - 64 - 1;
              var48 = field_K[var10Lifetime1];
              for (var12Lifetime1 = 0; var12Lifetime1 < field_P[var10Lifetime1]; var12Lifetime1++) {
                var13Lifetime1Lifetime1 = var48[var12Lifetime1];
                var14_intLifetime1Lifetime1 = this.field_w[var13Lifetime1Lifetime1];
                dupTemp$1 = field_q[var14_intLifetime1Lifetime1];
                field_q[var14_intLifetime1Lifetime1] = dupTemp$1 + 1;
                var15_intLifetime1Lifetime1 = dupTemp$1;
                field_Y[var14_intLifetime1Lifetime1][var15_intLifetime1Lifetime1] = var13Lifetime1Lifetime1;
                if (var14_intLifetime1Lifetime1 >= 10) {
                  if (var14_intLifetime1Lifetime1 != 10) {
                    field_Z[var15_intLifetime1Lifetime1] = var8Lifetime2;
                  } else {
                    field_V[var15_intLifetime1Lifetime1] = var8Lifetime2;
                  }
                } else {
                  field_z[var14_intLifetime1Lifetime1] = field_z[var14_intLifetime1Lifetime1] + var8Lifetime2;
                }
              }
            }
          }
        }
        var8Lifetime3 = 0;
        if (!(field_q[1] <= 0) ||
          !(field_q[2] <= 0)) {
          var8Lifetime3 = (field_z[1] + field_z[2]) / (field_q[1] + field_q[2]);
        }
        var9Lifetime2 = 0;
        if (!(field_q[3] <= 0) ||
          !(field_q[4] <= 0)) {
          var9Lifetime2 = (field_z[3] + field_z[4]) / (field_q[3] + field_q[4]);
        }
        var10Lifetime2 = 0;
        if (!(field_q[6] <= 0) ||
          !(field_q[8] <= 0)) {
          var10Lifetime2 = (field_z[6] + field_z[8]) / (field_q[6] + field_q[8]);
        }
        var12Lifetime2 = 0;
        var13Lifetime2 = field_q[10];
        var14 = field_Y[10];
        var15 = field_V;
        if (var12Lifetime2 == var13Lifetime2) {
          var12Lifetime2 = 0;
          var13Lifetime2 = field_q[11];
          var14 = field_Y[11];
          var15 = field_Z;
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
                var14 != field_Y[11]) {
                var12Lifetime2 = 0;
                var13Lifetime2 = field_q[11];
                var14 = field_Y[11];
                var15 = field_Z;
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
                var14 != field_Y[11]) {
                var12Lifetime2 = 0;
                var13Lifetime2 = field_q[11];
                var14 = field_Y[11];
                var15 = field_Z;
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
                var14 != field_Y[11]) {
                var12Lifetime2 = 0;
                var13Lifetime2 = field_q[11];
                var14 = field_Y[11];
                var15 = field_Z;
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
          var17Lifetime1 = field_q[var16Lifetime1];
          var49 = field_Y[var16Lifetime1];
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
            var14 != field_Y[11]) {
            var12Lifetime2 = 0;
            var14 = field_Y[11];
            var13Lifetime2 = field_q[11];
            var15 = field_Z;
          }
          if (var12Lifetime2 >= var13Lifetime2) {
            var11Lifetime2 = -1000;
            continue;
          }
          var11Lifetime2 = var15[var12Lifetime2];
        }
        return;
    }

    final void b(int param0) {
        int var4 = 0;
        int var5 = 0;
        int var2 = t.field_f[param0];
        int var3 = t.field_o[param0];
        for (var4 = 0; var4 < this.field_L; var4++) {
          var5 = this.field_E[var4] * var2 + this.field_N[var4] * var3 >> 16;
          this.field_E[var4] = this.field_E[var4] * var3 - this.field_N[var4] * var2 >> 16;
          this.field_N[var4] = var5;
        }
        this.field_M = false;
    }

    final void a() {
        if (this.field_X) {
          this.c();
          this.field_X = false;
        }
        this.field_M = false;
    }

    private final qc a(boolean param0, boolean param1, eg param2, byte[] param3, short[] param4, int[] param5, int[] param6, int[] param7) {
        int var9;
        int var9Lifetime1;
        int var9Lifetime2;
        param2.field_L = this.field_L;
        param2.field_T = this.field_T;
        param2.field_ab = this.field_ab;
        param2.field_eb = this.field_eb;
        if (param2.field_N == null ||
          !(param2.field_N.length >= this.field_L)) {
          param2.field_N = new int[this.field_L + 100];
          param2.field_W = new int[this.field_L + 100];
          param2.field_E = new int[this.field_L + 100];
        }
        for (var9 = 0; var9 < this.field_L; var9++) {
          param2.field_N[var9] = this.field_N[var9];
          param2.field_W[var9] = this.field_W[var9];
          param2.field_E[var9] = this.field_E[var9];
        }
        if (!param0) {
          param2.field_m = param3;
          if (this.field_m != null) {
            for (var9Lifetime1 = 0; var9Lifetime1 < this.field_ab; var9Lifetime1++) {
              param2.field_m[var9Lifetime1] = this.field_m[var9Lifetime1];
            }
          } else {
            for (var9Lifetime1 = 0; var9Lifetime1 < this.field_ab; var9Lifetime1++) {
              param2.field_m[var9Lifetime1] = (byte) 0;
            }
          }
        } else {
          param2.field_m = this.field_m;
        }
        if (!param1) {
          param2.field_p = param4;
          param2.field_kb = param5;
          param2.field_v = param6;
          param2.field_n = param7;
          for (var9Lifetime2 = 0; var9Lifetime2 < this.field_ab; var9Lifetime2++) {
            param2.field_p[var9Lifetime2] = this.field_p[var9Lifetime2];
            param2.field_kb[var9Lifetime2] = this.field_kb[var9Lifetime2];
            param2.field_v[var9Lifetime2] = this.field_v[var9Lifetime2];
            param2.field_n[var9Lifetime2] = this.field_n[var9Lifetime2];
          }
        } else {
          param2.field_p = this.field_p;
          param2.field_kb = this.field_kb;
          param2.field_v = this.field_v;
          param2.field_n = this.field_n;
        }
        param2.field_gb = this.field_gb;
        param2.field_S = this.field_S;
        param2.field_h = this.field_h;
        param2.field_w = this.field_w;
        param2.field_o = this.field_o;
        param2.field_x = this.field_x;
        param2.field_mb = this.field_mb;
        param2.field_C = this.field_C;
        param2.field_qb = this.field_qb;
        param2.field_I = this.field_I;
        param2.field_nb = this.field_nb;
        param2.field_ob = this.field_ob;
        param2.field_fb = this.field_fb;
        param2.field_M = false;
        return (qc) ((Object) param2);
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
          field_pb = 0;
          field_hb = 0;
          field_A = 0;
          for (var11 = 0; var11 < var9; var11++) {
            var12 = param1[var11];
            if (var12 < this.field_I.length) {
              var78 = this.field_I[var12];
              for (var14 = 0; var14 < var78.length; var14++) {
                var15 = var78[var14];
                if (this.field_ob == null ||
                  (param6 & this.field_ob[var15]) != 0) {
                  field_pb = field_pb + this.field_N[var15];
                  field_hb = field_hb + this.field_W[var15];
                  field_A = field_A + this.field_E[var15];
                  var10++;
                }
              }
            }
          }
          if (var10 <= 0) {
            field_pb = param2;
            field_hb = param3;
            field_A = param4;
          } else {
            field_pb = field_pb / var10 + param2;
            field_hb = field_hb / var10 + param3;
            field_A = field_A / var10 + param4;
            field_O = true;
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
            if (var11Lifetime1Lifetime1 < this.field_I.length) {
              var79 = this.field_I[var11Lifetime1Lifetime1];
              for (var13 = 0; var13 < var79.length; var13++) {
                var14Lifetime1 = var79[var13];
                if (this.field_ob == null ||
                  (param6 & this.field_ob[var14Lifetime1]) != 0) {
                  this.field_N[var14Lifetime1] = this.field_N[var14Lifetime1] + param2;
                  this.field_W[var14Lifetime1] = this.field_W[var14Lifetime1] + param3;
                  this.field_E[var14Lifetime1] = this.field_E[var14Lifetime1] + param4;
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
              if (var11Lifetime2 < this.field_I.length) {
                var81 = this.field_I[var11Lifetime2];
                for (var13Lifetime1 = 0; var13Lifetime1 < var81.length; var13Lifetime1++) {
                  var14Lifetime2 = var81[var13Lifetime1];
                  if (this.field_ob == null ||
                    (param6 & this.field_ob[var14Lifetime2]) != 0) {
                    this.field_N[var14Lifetime2] = this.field_N[var14Lifetime2] - field_pb;
                    this.field_W[var14Lifetime2] = this.field_W[var14Lifetime2] - field_hb;
                    this.field_E[var14Lifetime2] = this.field_E[var14Lifetime2] - field_A;
                    if (param4 != 0) {
                      var15Lifetime1 = t.field_f[param4];
                      var16 = t.field_o[param4];
                      var17 = this.field_W[var14Lifetime2] * var15Lifetime1 + this.field_N[var14Lifetime2] * var16 + 32767 >> 16;
                      this.field_W[var14Lifetime2] = this.field_W[var14Lifetime2] * var16 - this.field_N[var14Lifetime2] * var15Lifetime1 + 32767 >> 16;
                      this.field_N[var14Lifetime2] = var17;
                    }
                    if (param2 != 0) {
                      var15Lifetime1 = t.field_f[param2];
                      var16 = t.field_o[param2];
                      var17 = this.field_W[var14Lifetime2] * var16 - this.field_E[var14Lifetime2] * var15Lifetime1 + 32767 >> 16;
                      this.field_E[var14Lifetime2] = this.field_W[var14Lifetime2] * var15Lifetime1 + this.field_E[var14Lifetime2] * var16 + 32767 >> 16;
                      this.field_W[var14Lifetime2] = var17;
                    }
                    if (param3 != 0) {
                      var15Lifetime1 = t.field_f[param3];
                      var16 = t.field_o[param3];
                      var17 = this.field_E[var14Lifetime2] * var15Lifetime1 + this.field_N[var14Lifetime2] * var16 + 32767 >> 16;
                      this.field_E[var14Lifetime2] = this.field_E[var14Lifetime2] * var16 - this.field_N[var14Lifetime2] * var15Lifetime1 + 32767 >> 16;
                      this.field_N[var14Lifetime2] = var17;
                    }
                    this.field_N[var14Lifetime2] = this.field_N[var14Lifetime2] + field_pb;
                    this.field_W[var14Lifetime2] = this.field_W[var14Lifetime2] + field_hb;
                    this.field_E[var14Lifetime2] = this.field_E[var14Lifetime2] + field_A;
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
          if (field_O) {
            var16 = param7[0] * field_pb + param7[3] * field_hb + param7[6] * field_A + 16384 >> 15;
            var17 = param7[1] * field_pb + param7[4] * field_hb + param7[7] * field_A + 16384 >> 15;
            var18 = param7[2] * field_pb + param7[5] * field_hb + param7[8] * field_A + 16384 >> 15;
            var16 = var16 + var13Lifetime1;
            var17 = var17 + var14Lifetime2;
            var18 = var18 + var15Lifetime1;
            field_pb = var16;
            field_hb = var17;
            field_A = var18;
            field_O = false;
          }
          var61 = new int[9];
          var50 = var61;
          var16_ref_int__ = var50;
          var17 = t.field_o[param2] >> 1;
          var18 = t.field_f[param2] >> 1;
          var19 = t.field_o[param3] >> 1;
          var20 = t.field_f[param3] >> 1;
          var21 = t.field_o[param4] >> 1;
          var22 = t.field_f[param4] >> 1;
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
          var25_int = var61[0] * -field_pb + var61[1] * -field_hb + var61[2] * -field_A + 16384 >> 15;
          var26 = var61[3] * -field_pb + var61[4] * -field_hb + var61[5] * -field_A + 16384 >> 15;
          var27 = var61[6] * -field_pb + var61[7] * -field_hb + var61[8] * -field_A + 16384 >> 15;
          var28 = var25_int + field_pb;
          var29_int = var26 + field_hb;
          var30 = var27 + field_A;
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
            if (var40 < this.field_I.length) {
              var80 = this.field_I[var40];
              for (var42 = 0; var42 < var80.length; var42++) {
                var43 = var80[var42];
                if (this.field_ob == null ||
                  (param6 & this.field_ob[var43]) != 0) {
                  var44 = var63[0] * this.field_N[var43] + var63[1] * this.field_W[var43] + var63[2] * this.field_E[var43] + 16384 >> 15;
                  var45 = var63[3] * this.field_N[var43] + var63[4] * this.field_W[var43] + var63[5] * this.field_E[var43] + 16384 >> 15;
                  var46 = var63[6] * this.field_N[var43] + var63[7] * this.field_W[var43] + var63[8] * this.field_E[var43] + 16384 >> 15;
                  var44 = var44 + var36;
                  var45 = var45 + var37;
                  var46 = var46 + var38;
                  this.field_N[var43] = var44;
                  this.field_W[var43] = var45;
                  this.field_E[var43] = var46;
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
              if (this.field_nb != null) {
                for (var10Lifetime2 = 0; var10Lifetime2 < var9; var10Lifetime2++) {
                  var11Lifetime2 = param1[var10Lifetime2];
                  if (var11Lifetime2 < this.field_nb.length) {
                    var85 = this.field_nb[var11Lifetime2];
                    for (var13Lifetime1 = 0; var13Lifetime1 < var85.length; var13Lifetime1++) {
                      var14Lifetime2 = var85[var13Lifetime1];
                      if (this.field_fb == null ||
                        (param6 & this.field_fb[var14Lifetime2]) != 0) {
                        var15Lifetime1 = this.field_p[var14Lifetime2] & 65535;
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
                        this.field_p[var14Lifetime2] = (short)(var16 << 10 | var17 << 7 | var18);
                      }
                    }
                    this.field_X = true;
                  }
                }
                return;
              }
            } else {
              if (this.field_nb != null) {
                if (this.field_m != null) {
                  for (var10Lifetime2 = 0; var10Lifetime2 < var9; var10Lifetime2++) {
                    var11Lifetime2 = param1[var10Lifetime2];
                    if (var11Lifetime2 < this.field_nb.length) {
                      var84 = this.field_nb[var11Lifetime2];
                      for (var13Lifetime1 = 0; var13Lifetime1 < var84.length; var13Lifetime1++) {
                        var14Lifetime2 = var84[var13Lifetime1];
                        if (this.field_fb == null ||
                          (param6 & this.field_fb[var14Lifetime2]) != 0) {
                          var15Lifetime1 = (this.field_m[var14Lifetime2] & 255) + param2 * 8;
                          if (var15Lifetime1 >= 0) {
                            if (var15Lifetime1 > 255) {
                              var15Lifetime1 = 255;
                            }
                          } else {
                            var15Lifetime1 = 0;
                          }
                          this.field_m[var14Lifetime2] = (byte)var15Lifetime1;
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
              if (var11Lifetime2 < this.field_I.length) {
                var83 = this.field_I[var11Lifetime2];
                for (var13Lifetime1 = 0; var13Lifetime1 < var83.length; var13Lifetime1++) {
                  var14Lifetime2 = var83[var13Lifetime1];
                  if (this.field_ob == null ||
                    (param6 & this.field_ob[var14Lifetime2]) != 0) {
                    this.field_N[var14Lifetime2] = this.field_N[var14Lifetime2] - field_pb;
                    this.field_W[var14Lifetime2] = this.field_W[var14Lifetime2] - field_hb;
                    this.field_E[var14Lifetime2] = this.field_E[var14Lifetime2] - field_A;
                    this.field_N[var14Lifetime2] = this.field_N[var14Lifetime2] * param2 / 128;
                    this.field_W[var14Lifetime2] = this.field_W[var14Lifetime2] * param3 / 128;
                    this.field_E[var14Lifetime2] = this.field_E[var14Lifetime2] * param4 / 128;
                    this.field_N[var14Lifetime2] = this.field_N[var14Lifetime2] + field_pb;
                    this.field_W[var14Lifetime2] = this.field_W[var14Lifetime2] + field_hb;
                    this.field_E[var14Lifetime2] = this.field_E[var14Lifetime2] + field_A;
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
          if (field_O) {
            var16 = param7[0] * field_pb + param7[3] * field_hb + param7[6] * field_A + 16384 >> 15;
            var17 = param7[1] * field_pb + param7[4] * field_hb + param7[7] * field_A + 16384 >> 15;
            var18 = param7[2] * field_pb + param7[5] * field_hb + param7[8] * field_A + 16384 >> 15;
            var16 = var16 + var13Lifetime1;
            var17 = var17 + var14Lifetime2;
            var18 = var18 + var15Lifetime1;
            field_pb = var16;
            field_hb = var17;
            field_A = var18;
            field_O = false;
          }
          var16 = param2 << 15 >> 7;
          var17 = param3 << 15 >> 7;
          var18 = param4 << 15 >> 7;
          var19 = var16 * -field_pb + 16384 >> 15;
          var20 = var17 * -field_hb + 16384 >> 15;
          var21 = var18 * -field_A + 16384 >> 15;
          var22 = var19 + field_pb;
          var23 = var20 + field_hb;
          var24 = var21 + field_A;
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
            if (var34 < this.field_I.length) {
              var82 = this.field_I[var34];
              for (var36 = 0; var36 < var82.length; var36++) {
                var37 = var82[var36];
                if (this.field_ob == null ||
                  (param6 & this.field_ob[var37]) != 0) {
                  var38 = var66[0] * this.field_N[var37] + var66[1] * this.field_W[var37] + var66[2] * this.field_E[var37] + 16384 >> 15;
                  var39 = var66[3] * this.field_N[var37] + var66[4] * this.field_W[var37] + var66[5] * this.field_E[var37] + 16384 >> 15;
                  var40 = var66[6] * this.field_N[var37] + var66[7] * this.field_W[var37] + var66[8] * this.field_E[var37] + 16384 >> 15;
                  var38 = var38 + var30;
                  var39 = var39 + var31Lifetime1;
                  var40 = var40 + var32;
                  this.field_N[var37] = var38;
                  this.field_W[var37] = var39;
                  this.field_E[var37] = var40;
                }
              }
            }
          }
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
        if (!this.field_M) {
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
        if (var5 < 50 - this.field_lb) {
          return;
        }
        var15Lifetime2 = this.field_lb * 92682 >> 16;
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
        stackIn_15_0 = (var5 > 50 + this.field_lb) ? 0 : 1;
        var16 = stackIn_15_0;
        if (var16 == 0) {
          stackIn_21_0 = (this.field_eb > 0) ? 1 : 0;
        } else {
          stackIn_21_0 = 1;
        }
        var17Lifetime2 = stackIn_21_0;
        var18Lifetime1 = t.field_p;
        var19Lifetime1 = t.field_e;
        var20 = 0;
        var27 = 0;
        var21_intLifetime1 = var27;
        while (var27 < this.field_L) {
          var22Lifetime1 = this.field_N[var27];
          var23Lifetime1 = this.field_W[var27];
          var24 = this.field_E[var27];
          var25 = var22Lifetime1 * var6 + var23Lifetime1 * var9 + var24 * var12 >> 16;
          var26 = var22Lifetime1 * var7 + var23Lifetime1 * var10 + var24 * var13 >> 16;
          var24 = var22Lifetime1 * var8 + var23Lifetime1 * var11 + var24 * var14 >> 16;
          var22Lifetime1Lifetime1 = var25;
          var23Lifetime1Lifetime1 = var26;
          field_U[var27] = var24;
          var22Lifetime1Lifetime1 = var22Lifetime1Lifetime1 + var3;
          var23Lifetime1Lifetime1 = var23Lifetime1Lifetime1 + var4;
          var24 = var24 + var5;
          if (var24 < 50) {
            field_i[var27] = -5000;
            var20 = 1;
          } else {
            field_i[var27] = var18Lifetime1 + (var22Lifetime1Lifetime1 << 9) / var24;
            field_s[var27] = var19Lifetime1 + (var23Lifetime1Lifetime1 << 9) / var24;
          }
          if (var17Lifetime2 != 0) {
            field_R[var27] = var22Lifetime1Lifetime1;
            field_B[var27] = var23Lifetime1Lifetime1;
            field_u[var27] = var24;
          }
          var27++;
        }
        try {
          this.a((var20 & var16) != 0, false, 0L, (int) this.field_lb, this.field_lb << 1);
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var21 = (Exception) (Object) decompiledCaughtException;
        }
        return;
    }

    private final boolean b(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
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
        for (var9 = 0; var9 < this.field_T; var9++) {
          var10 = this.field_N[var9];
          var11 = this.field_W[var9];
          var12 = this.field_E[var9];
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
        this.field_lb = (short)(int)(Math.sqrt((double)var8) + 0.99);
        this.field_M = true;
    }

    final qc a(boolean param0, boolean param1, boolean param2) {
        if (!param0 &&
          field_jb.length < this.field_ab) {
          field_jb = new byte[this.field_ab + 100];
        }
        if (!param1 &&
          field_y.length < this.field_ab) {
          field_G = new int[this.field_ab + 100];
          field_cb = new int[this.field_ab + 100];
          field_j = new int[this.field_ab + 100];
          field_y = new short[this.field_ab + 100];
        }
        return this.a(param0, param1, field_r, field_jb, field_y, field_G, field_cb, field_j);
    }

    final boolean b() {
        if (this.field_I == null) {
          return false;
        }
        field_pb = 0;
        field_hb = 0;
        field_A = 0;
        return true;
    }

    private eg() {
        this.field_T = 0;
        this.field_M = false;
        this.field_X = false;
        this.field_L = 0;
        this.field_ab = 0;
        this.field_eb = 0;
    }

    eg(vn param0, int param1, int param2, int param3, int param4, int param5) {
        int dupTemp$1 = 0;
        int incrementValue$0 = 0;
        int var7;
        int var8;
        int var9;
        int[] var9_ref_int__;
        int var10;
        int var11;
        int var12;
        rn var13;
        int var14;
        int var15;
        int var16;
        int[] var17;
        ia var18;
        ia var19;
        int[] var20;
        int var9Lifetime1;
        int var10Lifetime1;
        int var10Lifetime2;
        int var11Lifetime1;
        int var11Lifetime2;
        int var10Lifetime1Lifetime1;
        int var10Lifetime1Lifetime2;
        this.field_T = 0;
        this.field_M = false;
        this.field_X = false;
        this.field_L = 0;
        this.field_ab = 0;
        this.field_eb = 0;
        param0.b();
        param0.a();
        this.field_L = param0.field_m;
        this.field_T = param0.field_t;
        this.field_N = param0.field_H;
        this.field_W = param0.field_l;
        this.field_E = param0.field_A;
        this.field_ab = param0.field_D;
        this.field_gb = param0.field_r;
        this.field_S = param0.field_L;
        this.field_h = param0.field_w;
        this.field_w = param0.field_z;
        this.field_m = param0.field_k;
        this.field_p = param0.field_p;
        this.field_I = param0.field_s;
        this.field_nb = param0.field_v;
        this.field_fb = param0.field_K;
        this.field_ob = param0.field_n;
        var7 = (int)Math.sqrt((double)(param3 * param3 + param4 * param4 + param5 * param5));
        var8 = param2 * var7 >> 8;
        this.field_kb = new int[this.field_ab];
        this.field_v = new int[this.field_ab];
        this.field_n = new int[this.field_ab];
        if (param0.field_u != null) {
          this.field_x = new short[this.field_ab];
          for (var9 = 0; var9 < this.field_ab; var9++) {
            var10 = param0.field_u[var9];
            if (var10 != -1 &&
              t.field_d.a(var10, 2738)) {
              this.field_x[var9] = (short)var10;
            } else {
              this.field_x[var9] = (short)-1;
            }
          }
        } else {
          this.field_x = null;
        }
        if (param0.field_R > 0 &&
          param0.field_I != null) {
          var20 = new int[param0.field_R];
          var17 = var20;
          var9_ref_int__ = var17;
          for (var10Lifetime1 = 0; var10Lifetime1 < this.field_ab; var10Lifetime1++) {
            if (param0.field_I[var10Lifetime1] != -1) {
              dupTemp$1 = param0.field_I[var10Lifetime1] & 255;
              var9_ref_int__[dupTemp$1] = var9_ref_int__[dupTemp$1] + 1;
            }
          }
          this.field_eb = 0;
          for (var10Lifetime1Lifetime1 = 0; var10Lifetime1Lifetime1 < param0.field_R; var10Lifetime1Lifetime1++) {
            if (var20[var10Lifetime1Lifetime1] > 0 &&
              param0.field_T[var10Lifetime1Lifetime1] == 0) {
              this.field_eb = this.field_eb + 1;
            }
          }
          this.field_mb = new int[this.field_eb];
          this.field_C = new int[this.field_eb];
          this.field_qb = new int[this.field_eb];
          var10Lifetime1Lifetime2 = 0;
          for (var11 = 0; var11 < param0.field_R; var11++) {
            if (var20[var11] > 0 &&
              param0.field_T[var11] == 0) {
              this.field_mb[var10Lifetime1Lifetime2] = param0.field_h[var11] & 65535;
              this.field_C[var10Lifetime1Lifetime2] = param0.field_B[var11] & 65535;
              this.field_qb[var10Lifetime1Lifetime2] = param0.field_y[var11] & 65535;
              incrementValue$0 = var10Lifetime1Lifetime2;
              var10Lifetime1Lifetime2++;
              var9_ref_int__[var11] = incrementValue$0;
            } else {
              var20[var11] = -1;
            }
          }
          this.field_o = new byte[this.field_ab];
          for (var11Lifetime2 = 0; var11Lifetime2 < this.field_ab; var11Lifetime2++) {
            if (param0.field_I[var11Lifetime2] == -1) {
              this.field_o[var11Lifetime2] = (byte)-1;
            } else {
              this.field_o[var11Lifetime2] = (byte)var9_ref_int__[param0.field_I[var11Lifetime2] & 255];
              if (this.field_o[var11Lifetime2] == -1 &&
                this.field_x != null) {
                this.field_x[var11Lifetime2] = (short)-1;
              }
            }
          }
        }
        var16 = 0;
        var9Lifetime1 = var16;
        while (var16 < this.field_ab) {
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
          if (this.field_x != null) {
            var12 = this.field_x[var16];
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
                this.field_n[var16] = -2;
              } else {
                var19 = param0.field_J[var16];
                var14 = param1 + (param3 * var19.field_f + param4 * var19.field_a + param5 * var19.field_g) / (var8 + var8 / 2);
                this.field_kb[var16] = eg.d(var14);
                this.field_n[var16] = -1;
              }
            } else {
              if (param0.field_q != null &&
                param0.field_q[this.field_gb[var16]] != null) {
                var13 = param0.field_q[this.field_gb[var16]];
              } else {
                var13 = param0.field_i[this.field_gb[var16]];
              }
              var14 = param1 + (param3 * var13.field_a + param4 * var13.field_b + param5 * var13.field_f) / (var8 * var13.field_g);
              this.field_kb[var16] = eg.d(var14);
              if (param0.field_q != null &&
                param0.field_q[this.field_S[var16]] != null) {
                var13 = param0.field_q[this.field_S[var16]];
              } else {
                var13 = param0.field_i[this.field_S[var16]];
              }
              var14 = param1 + (param3 * var13.field_a + param4 * var13.field_b + param5 * var13.field_f) / (var8 * var13.field_g);
              this.field_v[var16] = eg.d(var14);
              if (param0.field_q != null &&
                param0.field_q[this.field_h[var16]] != null) {
                var13 = param0.field_q[this.field_h[var16]];
              } else {
                var13 = param0.field_i[this.field_h[var16]];
              }
              var14 = param1 + (param3 * var13.field_a + param4 * var13.field_b + param5 * var13.field_f) / (var8 * var13.field_g);
              this.field_n[var16] = eg.d(var14);
            }
          } else {
            if (var10Lifetime2 != 0) {
              if (var10Lifetime2 != 1) {
                if (var10Lifetime2 != 3) {
                  this.field_n[var16] = -2;
                } else {
                  this.field_kb[var16] = 128;
                  this.field_n[var16] = -1;
                }
              } else {
                var18 = param0.field_J[var16];
                var14 = param1 + (param3 * var18.field_f + param4 * var18.field_a + param5 * var18.field_g) / (var8 + var8 / 2) << 17;
                this.field_kb[var16] = var14 | eg.a(param0.field_p[var16] & 65535, var14 >> 17);
                this.field_n[var16] = -1;
              }
            } else {
              var15 = param0.field_p[var16] & 65535;
              if (param0.field_q != null &&
                param0.field_q[this.field_gb[var16]] != null) {
                var13 = param0.field_q[this.field_gb[var16]];
              } else {
                var13 = param0.field_i[this.field_gb[var16]];
              }
              var14 = param1 + (param3 * var13.field_a + param4 * var13.field_b + param5 * var13.field_f) / (var8 * var13.field_g) << 17;
              this.field_kb[var16] = var14 | eg.a(var15, var14 >> 17);
              if (param0.field_q != null &&
                param0.field_q[this.field_S[var16]] != null) {
                var13 = param0.field_q[this.field_S[var16]];
              } else {
                var13 = param0.field_i[this.field_S[var16]];
              }
              var14 = param1 + (param3 * var13.field_a + param4 * var13.field_b + param5 * var13.field_f) / (var8 * var13.field_g) << 17;
              this.field_v[var16] = var14 | eg.a(var15, var14 >> 17);
              if (param0.field_q != null &&
                param0.field_q[this.field_h[var16]] != null) {
                var13 = param0.field_q[this.field_h[var16]];
              } else {
                var13 = param0.field_i[this.field_h[var16]];
              }
              var14 = param1 + (param3 * var13.field_a + param4 * var13.field_b + param5 * var13.field_f) / (var8 * var13.field_g) << 17;
              this.field_n[var16] = var14 | eg.a(var15, var14 >> 17);
            }
          }
          var16++;
        }
    }

    static {
        field_r = new eg();
        field_cb = new int[1];
        field_y = new short[1];
        field_j = new int[1];
        field_jb = new byte[1];
        field_G = new int[1];
        eg discarded$0 = new eg();
        eg discarded$1 = new eg();
        field_Z = new int[4096];
        field_q = new int[12];
        field_U = new int[4096];
        field_z = new int[12];
        field_i = new int[4096];
        field_s = new int[4096];
        field_bb = 0;
        field_Y = new int[12][4096];
        field_u = new int[4096];
        field_R = new int[4096];
        field_ib = new boolean[4096];
        field_O = false;
        field_H = new int[10];
        field_db = new int[10];
        field_B = new int[4096];
        field_l = false;
        field_V = new int[4096];
        field_t = new int[10];
        if (field_l) {
          field_J = new int[4096];
          field_k = new int[4096];
        } else {
          field_D = new int[1600];
          field_Q = new int[1600][64];
          field_P = new int[32];
          field_K = new int[32][512];
        }
        field_F = new boolean[4096];
    }
}
