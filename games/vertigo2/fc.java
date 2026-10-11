/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fc extends bn {
    int[] field_C;
    byte[] field_eb;
    int[] field_u;
    int[] field_bb;
    int[] field_X;
    int[] field_D;
    int[] field_a;
    int field_w;
    private short[] field_t;
    int[] field_k;
    int field_T;
    int[] field_N;
    private short field_db;
    int field_L;
    int field_W;
    private static fc field_ab;
    int[] field_A;
    int[] field_E;
    byte[] field_H;
    private boolean field_I;
    byte[] field_R;
    private int[][] field_g;
    private short[] field_Y;
    int[] field_i;
    private static byte[] field_h;
    short[] field_F;
    private static int[] field_hb;
    private static int[] field_s;
    int[] field_o;
    private static short[] field_m;
    private short field_lb;
    private static int[] field_f;
    boolean field_K;
    private int[][] field_b;
    short[] field_d;
    byte field_M;
    private static int[] field_fb;
    private static int[] field_q;
    private static int[] field_v;
    private static boolean[] field_Z;
    private static int[] field_V;
    private static int[] field_O;
    private static int[] field_J;
    private static int[] field_l;
    private static int[] field_Q;
    private static int[][] field_G;
    private static int[] field_j;
    private static boolean field_B;
    private static int[] field_P;
    private static int[] field_cb;
    private static int[] field_S;
    private static int field_ib;
    private static int[] field_r;
    private static int[] field_gb;
    private static int[] field_c;
    private static boolean field_n;
    private static int[] field_jb;
    private static int field_e;
    private static int field_x;
    private static int[][] field_y;
    private static int[][] field_U;
    private static boolean[] field_p;
    private static int field_kb;
    private static int[] field_z;

    final int f() {
        if (!this.field_K) {
          this.e();
        }
        return this.field_lb;
    }

    private final static int b(int param0) {
        if (param0 < 2) {
          param0 = 2;
        } else {
          if (param0 > 126) {
            param0 = 126;
          }
        }
        return param0;
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
          field_kb = 0;
          field_ib = 0;
          field_x = 0;
          for (var11 = 0; var11 < var9; var11++) {
            var12 = param1[var11];
            if (var12 < this.field_b.length) {
              var78 = this.field_b[var12];
              for (var14 = 0; var14 < var78.length; var14++) {
                var15 = var78[var14];
                if (this.field_Y == null ||
                  (param6 & this.field_Y[var15]) != 0) {
                  field_kb = field_kb + this.field_k[var15];
                  field_ib = field_ib + this.field_C[var15];
                  field_x = field_x + this.field_A[var15];
                  var10++;
                }
              }
            }
          }
          if (var10 <= 0) {
            field_kb = param2;
            field_ib = param3;
            field_x = param4;
          } else {
            field_kb = field_kb / var10 + param2;
            field_ib = field_ib / var10 + param3;
            field_x = field_x / var10 + param4;
            field_n = true;
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
            if (var11Lifetime1Lifetime1 < this.field_b.length) {
              var79 = this.field_b[var11Lifetime1Lifetime1];
              for (var13 = 0; var13 < var79.length; var13++) {
                var14Lifetime1 = var79[var13];
                if (this.field_Y == null ||
                  (param6 & this.field_Y[var14Lifetime1]) != 0) {
                  this.field_k[var14Lifetime1] = this.field_k[var14Lifetime1] + param2;
                  this.field_C[var14Lifetime1] = this.field_C[var14Lifetime1] + param3;
                  this.field_A[var14Lifetime1] = this.field_A[var14Lifetime1] + param4;
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
              if (var11Lifetime2 < this.field_b.length) {
                var81 = this.field_b[var11Lifetime2];
                for (var13Lifetime1 = 0; var13Lifetime1 < var81.length; var13Lifetime1++) {
                  var14Lifetime2 = var81[var13Lifetime1];
                  if (this.field_Y == null ||
                    (param6 & this.field_Y[var14Lifetime2]) != 0) {
                    this.field_k[var14Lifetime2] = this.field_k[var14Lifetime2] - field_kb;
                    this.field_C[var14Lifetime2] = this.field_C[var14Lifetime2] - field_ib;
                    this.field_A[var14Lifetime2] = this.field_A[var14Lifetime2] - field_x;
                    if (param4 != 0) {
                      var15Lifetime1 = oo.field_j[param4];
                      var16 = oo.field_h[param4];
                      var17 = this.field_C[var14Lifetime2] * var15Lifetime1 + this.field_k[var14Lifetime2] * var16 + 32767 >> 16;
                      this.field_C[var14Lifetime2] = this.field_C[var14Lifetime2] * var16 - this.field_k[var14Lifetime2] * var15Lifetime1 + 32767 >> 16;
                      this.field_k[var14Lifetime2] = var17;
                    }
                    if (param2 != 0) {
                      var15Lifetime1 = oo.field_j[param2];
                      var16 = oo.field_h[param2];
                      var17 = this.field_C[var14Lifetime2] * var16 - this.field_A[var14Lifetime2] * var15Lifetime1 + 32767 >> 16;
                      this.field_A[var14Lifetime2] = this.field_C[var14Lifetime2] * var15Lifetime1 + this.field_A[var14Lifetime2] * var16 + 32767 >> 16;
                      this.field_C[var14Lifetime2] = var17;
                    }
                    if (param3 != 0) {
                      var15Lifetime1 = oo.field_j[param3];
                      var16 = oo.field_h[param3];
                      var17 = this.field_A[var14Lifetime2] * var15Lifetime1 + this.field_k[var14Lifetime2] * var16 + 32767 >> 16;
                      this.field_A[var14Lifetime2] = this.field_A[var14Lifetime2] * var16 - this.field_k[var14Lifetime2] * var15Lifetime1 + 32767 >> 16;
                      this.field_k[var14Lifetime2] = var17;
                    }
                    this.field_k[var14Lifetime2] = this.field_k[var14Lifetime2] + field_kb;
                    this.field_C[var14Lifetime2] = this.field_C[var14Lifetime2] + field_ib;
                    this.field_A[var14Lifetime2] = this.field_A[var14Lifetime2] + field_x;
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
          if (field_n) {
            var16 = param7[0] * field_kb + param7[3] * field_ib + param7[6] * field_x + 16384 >> 15;
            var17 = param7[1] * field_kb + param7[4] * field_ib + param7[7] * field_x + 16384 >> 15;
            var18 = param7[2] * field_kb + param7[5] * field_ib + param7[8] * field_x + 16384 >> 15;
            var16 = var16 + var13Lifetime1;
            var17 = var17 + var14Lifetime2;
            var18 = var18 + var15Lifetime1;
            field_kb = var16;
            field_ib = var17;
            field_x = var18;
            field_n = false;
          }
          var61 = new int[9];
          var50 = var61;
          var16_ref_int__ = var50;
          var17 = oo.field_h[param2] >> 1;
          var18 = oo.field_j[param2] >> 1;
          var19 = oo.field_h[param3] >> 1;
          var20 = oo.field_j[param3] >> 1;
          var21 = oo.field_h[param4] >> 1;
          var22 = oo.field_j[param4] >> 1;
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
          var25_int = var61[0] * -field_kb + var61[1] * -field_ib + var61[2] * -field_x + 16384 >> 15;
          var26 = var61[3] * -field_kb + var61[4] * -field_ib + var61[5] * -field_x + 16384 >> 15;
          var27 = var61[6] * -field_kb + var61[7] * -field_ib + var61[8] * -field_x + 16384 >> 15;
          var28 = var25_int + field_kb;
          var29_int = var26 + field_ib;
          var30 = var27 + field_x;
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
            if (var40 < this.field_b.length) {
              var80 = this.field_b[var40];
              for (var42 = 0; var42 < var80.length; var42++) {
                var43 = var80[var42];
                if (this.field_Y == null ||
                  (param6 & this.field_Y[var43]) != 0) {
                  var44 = var63[0] * this.field_k[var43] + var63[1] * this.field_C[var43] + var63[2] * this.field_A[var43] + 16384 >> 15;
                  var45 = var63[3] * this.field_k[var43] + var63[4] * this.field_C[var43] + var63[5] * this.field_A[var43] + 16384 >> 15;
                  var46 = var63[6] * this.field_k[var43] + var63[7] * this.field_C[var43] + var63[8] * this.field_A[var43] + 16384 >> 15;
                  var44 = var44 + var36;
                  var45 = var45 + var37;
                  var46 = var46 + var38;
                  this.field_k[var43] = var44;
                  this.field_C[var43] = var45;
                  this.field_A[var43] = var46;
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
              if (this.field_g != null) {
                for (var10Lifetime2 = 0; var10Lifetime2 < var9; var10Lifetime2++) {
                  var11Lifetime2 = param1[var10Lifetime2];
                  if (var11Lifetime2 < this.field_g.length) {
                    var85 = this.field_g[var11Lifetime2];
                    for (var13Lifetime1 = 0; var13Lifetime1 < var85.length; var13Lifetime1++) {
                      var14Lifetime2 = var85[var13Lifetime1];
                      if (this.field_t == null ||
                        (param6 & this.field_t[var14Lifetime2]) != 0) {
                        var15Lifetime1 = this.field_d[var14Lifetime2] & 65535;
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
                        this.field_d[var14Lifetime2] = (short)(var16 << 10 | var17 << 7 | var18);
                      }
                    }
                    this.field_I = true;
                  }
                }
                return;
              }
            } else {
              if (this.field_g != null) {
                if (this.field_R != null) {
                  for (var10Lifetime2 = 0; var10Lifetime2 < var9; var10Lifetime2++) {
                    var11Lifetime2 = param1[var10Lifetime2];
                    if (var11Lifetime2 < this.field_g.length) {
                      var84 = this.field_g[var11Lifetime2];
                      for (var13Lifetime1 = 0; var13Lifetime1 < var84.length; var13Lifetime1++) {
                        var14Lifetime2 = var84[var13Lifetime1];
                        if (this.field_t == null ||
                          (param6 & this.field_t[var14Lifetime2]) != 0) {
                          var15Lifetime1 = (this.field_R[var14Lifetime2] & 255) + param2 * 8;
                          if (var15Lifetime1 >= 0) {
                            if (var15Lifetime1 > 255) {
                              var15Lifetime1 = 255;
                            }
                          } else {
                            var15Lifetime1 = 0;
                          }
                          this.field_R[var14Lifetime2] = (byte)var15Lifetime1;
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
              if (var11Lifetime2 < this.field_b.length) {
                var83 = this.field_b[var11Lifetime2];
                for (var13Lifetime1 = 0; var13Lifetime1 < var83.length; var13Lifetime1++) {
                  var14Lifetime2 = var83[var13Lifetime1];
                  if (this.field_Y == null ||
                    (param6 & this.field_Y[var14Lifetime2]) != 0) {
                    this.field_k[var14Lifetime2] = this.field_k[var14Lifetime2] - field_kb;
                    this.field_C[var14Lifetime2] = this.field_C[var14Lifetime2] - field_ib;
                    this.field_A[var14Lifetime2] = this.field_A[var14Lifetime2] - field_x;
                    this.field_k[var14Lifetime2] = this.field_k[var14Lifetime2] * param2 / 128;
                    this.field_C[var14Lifetime2] = this.field_C[var14Lifetime2] * param3 / 128;
                    this.field_A[var14Lifetime2] = this.field_A[var14Lifetime2] * param4 / 128;
                    this.field_k[var14Lifetime2] = this.field_k[var14Lifetime2] + field_kb;
                    this.field_C[var14Lifetime2] = this.field_C[var14Lifetime2] + field_ib;
                    this.field_A[var14Lifetime2] = this.field_A[var14Lifetime2] + field_x;
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
          if (field_n) {
            var16 = param7[0] * field_kb + param7[3] * field_ib + param7[6] * field_x + 16384 >> 15;
            var17 = param7[1] * field_kb + param7[4] * field_ib + param7[7] * field_x + 16384 >> 15;
            var18 = param7[2] * field_kb + param7[5] * field_ib + param7[8] * field_x + 16384 >> 15;
            var16 = var16 + var13Lifetime1;
            var17 = var17 + var14Lifetime2;
            var18 = var18 + var15Lifetime1;
            field_kb = var16;
            field_ib = var17;
            field_x = var18;
            field_n = false;
          }
          var16 = param2 << 15 >> 7;
          var17 = param3 << 15 >> 7;
          var18 = param4 << 15 >> 7;
          var19 = var16 * -field_kb + 16384 >> 15;
          var20 = var17 * -field_ib + 16384 >> 15;
          var21 = var18 * -field_x + 16384 >> 15;
          var22 = var19 + field_kb;
          var23 = var20 + field_ib;
          var24 = var21 + field_x;
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
            if (var34 < this.field_b.length) {
              var82 = this.field_b[var34];
              for (var36 = 0; var36 < var82.length; var36++) {
                var37 = var82[var36];
                if (this.field_Y == null ||
                  (param6 & this.field_Y[var37]) != 0) {
                  var38 = var66[0] * this.field_k[var37] + var66[1] * this.field_C[var37] + var66[2] * this.field_A[var37] + 16384 >> 15;
                  var39 = var66[3] * this.field_k[var37] + var66[4] * this.field_C[var37] + var66[5] * this.field_A[var37] + 16384 >> 15;
                  var40 = var66[6] * this.field_k[var37] + var66[7] * this.field_C[var37] + var66[8] * this.field_A[var37] + 16384 >> 15;
                  var38 = var38 + var30;
                  var39 = var39 + var31Lifetime1;
                  var40 = var40 + var32;
                  this.field_k[var37] = var38;
                  this.field_C[var37] = var39;
                  this.field_A[var37] = var40;
                }
              }
            }
          }
        }
    }

    private final void c() {
        int var4 = 0;
        int var3;
        int stackIn_5_0 = 0;
        int var1;
        int var2;
        for (var4 = 0; var4 < this.field_w; var4++) {
          if (this.field_F == null) {
            stackIn_5_0 = -1;
          } else {
            stackIn_5_0 = this.field_F[var4];
          }
          var3 = stackIn_5_0;
          if (var3 == -1) {
            var1 = this.field_d[var4] & 65535;
            if (this.field_bb[var4] != -1) {
              if (this.field_bb[var4] != -2) {
                var2 = this.field_i[var4] & -131072;
                this.field_i[var4] = var2 | fc.a(var1, var2 >> 17);
                var2 = this.field_X[var4] & -131072;
                this.field_X[var4] = var2 | fc.a(var1, var2 >> 17);
                var2 = this.field_bb[var4] & -131072;
                this.field_bb[var4] = var2 | fc.a(var1, var2 >> 17);
              }
            } else {
              var2 = this.field_i[var4] & -131072;
              this.field_i[var4] = var2 | fc.a(var1, var2 >> 17);
            }
          }
        }
    }

    private final void a(int param0) {
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
        var2 = oo.field_l;
        var3 = oo.field_e;
        var4 = 0;
        var5 = this.field_o[param0];
        var6 = this.field_a[param0];
        var7 = this.field_u[param0];
        var8 = field_q[var5];
        var9 = field_q[var6];
        var10 = field_q[var7];
        if (this.field_R != null) {
          oo.field_n = this.field_R[param0] & 255;
        } else {
          oo.field_n = 0;
        }
        if (var8 < 50) {
          var11 = field_S[var5];
          var12 = field_fb[var5];
          var13 = this.field_i[param0] & 65535;
          if (var10 >= 50) {
            var14 = (50 - var8) * oo.field_k[var10 - var8];
            field_O[var4] = var2 + (var11 + ((field_S[var7] - var11) * var14 >> 16) << 9) / 50;
            field_l[var4] = var3 + (var12 + ((field_fb[var7] - var12) * var14 >> 16) << 9) / 50;
            incrementValue$0 = var4;
            var4++;
            field_J[incrementValue$0] = var13 + (((this.field_bb[param0] & 65535) - var13) * var14 >> 16);
          }
          if (var9 >= 50) {
            var14Lifetime4 = (50 - var8) * oo.field_k[var9 - var8];
            field_O[var4] = var2 + (var11 + ((field_S[var6] - var11) * var14Lifetime4 >> 16) << 9) / 50;
            field_l[var4] = var3 + (var12 + ((field_fb[var6] - var12) * var14Lifetime4 >> 16) << 9) / 50;
            incrementValue$1 = var4;
            var4++;
            field_J[incrementValue$1] = var13 + (((this.field_X[param0] & 65535) - var13) * var14Lifetime4 >> 16);
          }
        } else {
          field_O[var4] = field_v[var5];
          field_l[var4] = field_cb[var5];
          incrementValue$2 = var4;
          var4++;
          field_J[incrementValue$2] = this.field_i[param0] & 65535;
        }
        if (var9 < 50) {
          var11Lifetime1 = field_S[var6];
          var12Lifetime1 = field_fb[var6];
          var13Lifetime1 = this.field_X[param0] & 65535;
          if (var8 >= 50) {
            var14Lifetime1 = (50 - var9) * oo.field_k[var8 - var9];
            field_O[var4] = var2 + (var11Lifetime1 + ((field_S[var5] - var11Lifetime1) * var14Lifetime1 >> 16) << 9) / 50;
            field_l[var4] = var3 + (var12Lifetime1 + ((field_fb[var5] - var12Lifetime1) * var14Lifetime1 >> 16) << 9) / 50;
            incrementValue$3 = var4;
            var4++;
            field_J[incrementValue$3] = var13Lifetime1 + (((this.field_i[param0] & 65535) - var13Lifetime1) * var14Lifetime1 >> 16);
          }
          if (var10 >= 50) {
            var14Lifetime1Lifetime1 = (50 - var9) * oo.field_k[var10 - var9];
            field_O[var4] = var2 + (var11Lifetime1 + ((field_S[var7] - var11Lifetime1) * var14Lifetime1Lifetime1 >> 16) << 9) / 50;
            field_l[var4] = var3 + (var12Lifetime1 + ((field_fb[var7] - var12Lifetime1) * var14Lifetime1Lifetime1 >> 16) << 9) / 50;
            incrementValue$4 = var4;
            var4++;
            field_J[incrementValue$4] = var13Lifetime1 + (((this.field_bb[param0] & 65535) - var13Lifetime1) * var14Lifetime1Lifetime1 >> 16);
          }
        } else {
          field_O[var4] = field_v[var6];
          field_l[var4] = field_cb[var6];
          incrementValue$5 = var4;
          var4++;
          field_J[incrementValue$5] = this.field_X[param0] & 65535;
        }
        if (var10 < 50) {
          var11Lifetime2 = field_S[var7];
          var12Lifetime2 = field_fb[var7];
          var13Lifetime2 = this.field_bb[param0] & 65535;
          if (var9 >= 50) {
            var14Lifetime2 = (50 - var10) * oo.field_k[var9 - var10];
            field_O[var4] = var2 + (var11Lifetime2 + ((field_S[var6] - var11Lifetime2) * var14Lifetime2 >> 16) << 9) / 50;
            field_l[var4] = var3 + (var12Lifetime2 + ((field_fb[var6] - var12Lifetime2) * var14Lifetime2 >> 16) << 9) / 50;
            incrementValue$6 = var4;
            var4++;
            field_J[incrementValue$6] = var13Lifetime2 + (((this.field_X[param0] & 65535) - var13Lifetime2) * var14Lifetime2 >> 16);
          }
          if (var8 >= 50) {
            var14Lifetime2Lifetime1 = (50 - var10) * oo.field_k[var8 - var10];
            field_O[var4] = var2 + (var11Lifetime2 + ((field_S[var5] - var11Lifetime2) * var14Lifetime2Lifetime1 >> 16) << 9) / 50;
            field_l[var4] = var3 + (var12Lifetime2 + ((field_fb[var5] - var12Lifetime2) * var14Lifetime2Lifetime1 >> 16) << 9) / 50;
            incrementValue$7 = var4;
            var4++;
            field_J[incrementValue$7] = var13Lifetime2 + (((this.field_i[param0] & 65535) - var13Lifetime2) * var14Lifetime2Lifetime1 >> 16);
          }
        } else {
          field_O[var4] = field_v[var7];
          field_l[var4] = field_cb[var7];
          incrementValue$8 = var4;
          var4++;
          field_J[incrementValue$8] = this.field_bb[param0] & 65535;
        }
        boolean decompiledFrameRemainder0 = true;
        var11Lifetime3 = field_O[0];
        var12Lifetime3 = field_O[1];
        var13Lifetime3 = field_O[2];
        var14Lifetime3 = field_l[0];
        var15 = field_l[1];
        var16 = field_l[2];
        oo.field_m = false;
        if (var4 == 3) {
          if (var11Lifetime3 < 0 ||
            var12Lifetime3 < 0 ||
            var13Lifetime3 < 0 ||
            !(var11Lifetime3 <= oo.field_q) ||
            !(var12Lifetime3 <= oo.field_q) ||
            !(var13Lifetime3 <= oo.field_q)) {
            oo.field_m = true;
          }
          if (this.field_F != null &&
            this.field_F[param0] != -1) {
            if (this.field_eb != null &&
              this.field_eb[param0] != -1) {
              var20 = this.field_eb[param0] & 255;
              var17 = this.field_N[var20];
              var18 = this.field_D[var20];
              var19 = this.field_E[var20];
            } else {
              var17 = var5;
              var18 = var6;
              var19 = var7;
            }
            if (this.field_bb[param0] != -1) {
              oo.a(var14Lifetime3, var15, var16, var11Lifetime3, var12Lifetime3, var13Lifetime3, field_J[0], field_J[1], field_J[2], field_S[var17], field_S[var18], field_S[var19], field_fb[var17], field_fb[var18], field_fb[var19], field_q[var17], field_q[var18], field_q[var19], (int) this.field_F[param0]);
            } else {
              oo.a(var14Lifetime3, var15, var16, var11Lifetime3, var12Lifetime3, var13Lifetime3, this.field_i[param0], this.field_i[param0], this.field_i[param0], field_S[var17], field_S[var18], field_S[var19], field_fb[var17], field_fb[var18], field_fb[var19], field_q[var17], field_q[var18], field_q[var19], (int) this.field_F[param0]);
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (this.field_bb[param0] != -1) {
              oo.a(var14Lifetime3, var15, var16, var11Lifetime3, var12Lifetime3, var13Lifetime3, field_J[0], field_J[1], field_J[2]);
            } else {
              oo.a(var14Lifetime3, var15, var16, var11Lifetime3, var12Lifetime3, var13Lifetime3, oo.field_c[this.field_i[param0] & 65535]);
            }
          }
        }
        if (var4 != 4) {
          return;
        }
        if (var11Lifetime3 < 0 ||
          var12Lifetime3 < 0 ||
          var13Lifetime3 < 0 ||
          !(var11Lifetime3 <= oo.field_q) ||
          !(var12Lifetime3 <= oo.field_q) ||
          !(var13Lifetime3 <= oo.field_q) ||
          !(field_O[3] >= 0) ||
          !(field_O[3] <= oo.field_q)) {
          oo.field_m = true;
        }
        if (this.field_F != null &&
          this.field_F[param0] != -1) {
          if (this.field_eb != null &&
            this.field_eb[param0] != -1) {
            var20Lifetime1 = this.field_eb[param0] & 255;
            var17Lifetime1 = this.field_N[var20Lifetime1];
            var18Lifetime1 = this.field_D[var20Lifetime1];
            var19Lifetime1 = this.field_E[var20Lifetime1];
          } else {
            var17Lifetime1 = var5;
            var18Lifetime1 = var6;
            var19Lifetime1 = var7;
          }
          var20Lifetime1Lifetime1 = this.field_F[param0];
          if (this.field_bb[param0] != -1) {
            oo.a(var14Lifetime3, var15, var16, var11Lifetime3, var12Lifetime3, var13Lifetime3, field_J[0], field_J[1], field_J[2], field_S[var17Lifetime1], field_S[var18Lifetime1], field_S[var19Lifetime1], field_fb[var17Lifetime1], field_fb[var18Lifetime1], field_fb[var19Lifetime1], field_q[var17Lifetime1], field_q[var18Lifetime1], field_q[var19Lifetime1], var20Lifetime1Lifetime1);
            oo.a(var14Lifetime3, var16, field_l[3], var11Lifetime3, var13Lifetime3, field_O[3], field_J[0], field_J[2], field_J[3], field_S[var17Lifetime1], field_S[var18Lifetime1], field_S[var19Lifetime1], field_fb[var17Lifetime1], field_fb[var18Lifetime1], field_fb[var19Lifetime1], field_q[var17Lifetime1], field_q[var18Lifetime1], field_q[var19Lifetime1], var20Lifetime1Lifetime1);
          } else {
            oo.a(var14Lifetime3, var15, var16, var11Lifetime3, var12Lifetime3, var13Lifetime3, this.field_i[param0], this.field_i[param0], this.field_i[param0], field_S[var17Lifetime1], field_S[var18Lifetime1], field_S[var19Lifetime1], field_fb[var17Lifetime1], field_fb[var18Lifetime1], field_fb[var19Lifetime1], field_q[var17Lifetime1], field_q[var18Lifetime1], field_q[var19Lifetime1], var20Lifetime1Lifetime1);
            oo.a(var14Lifetime3, var16, field_l[3], var11Lifetime3, var13Lifetime3, field_O[3], this.field_i[param0], this.field_i[param0], this.field_i[param0], field_S[var17Lifetime1], field_S[var18Lifetime1], field_S[var19Lifetime1], field_fb[var17Lifetime1], field_fb[var18Lifetime1], field_fb[var19Lifetime1], field_q[var17Lifetime1], field_q[var18Lifetime1], field_q[var19Lifetime1], var20Lifetime1Lifetime1);
          }
        } else {
          if (this.field_bb[param0] != -1) {
            oo.a(var14Lifetime3, var15, var16, var11Lifetime3, var12Lifetime3, var13Lifetime3, field_J[0], field_J[1], field_J[2]);
            oo.a(var14Lifetime3, var16, field_l[3], var11Lifetime3, var13Lifetime3, field_O[3], field_J[0], field_J[2], field_J[3]);
          } else {
            var17Lifetime1 = oo.field_c[this.field_i[param0] & 65535];
            oo.a(var14Lifetime3, var15, var16, var11Lifetime3, var12Lifetime3, var13Lifetime3, var17Lifetime1);
            oo.a(var14Lifetime3, var16, field_l[3], var11Lifetime3, var13Lifetime3, field_O[3], var17Lifetime1);
          }
        }
    }

    private final bn a(boolean param0, boolean param1, fc param2, byte[] param3, short[] param4, int[] param5, int[] param6, int[] param7) {
        int var9;
        int var9Lifetime1;
        int var9Lifetime2;
        param2.field_T = this.field_T;
        param2.field_W = this.field_W;
        param2.field_w = this.field_w;
        param2.field_L = this.field_L;
        if (param2.field_k == null ||
          !(param2.field_k.length >= this.field_T)) {
          param2.field_k = new int[this.field_T + 100];
          param2.field_C = new int[this.field_T + 100];
          param2.field_A = new int[this.field_T + 100];
        }
        for (var9 = 0; var9 < this.field_T; var9++) {
          param2.field_k[var9] = this.field_k[var9];
          param2.field_C[var9] = this.field_C[var9];
          param2.field_A[var9] = this.field_A[var9];
        }
        if (!param0) {
          param2.field_R = param3;
          if (this.field_R != null) {
            for (var9Lifetime1 = 0; var9Lifetime1 < this.field_w; var9Lifetime1++) {
              param2.field_R[var9Lifetime1] = this.field_R[var9Lifetime1];
            }
          } else {
            for (var9Lifetime1 = 0; var9Lifetime1 < this.field_w; var9Lifetime1++) {
              param2.field_R[var9Lifetime1] = (byte) 0;
            }
          }
        } else {
          param2.field_R = this.field_R;
        }
        if (!param1) {
          param2.field_d = param4;
          param2.field_i = param5;
          param2.field_X = param6;
          param2.field_bb = param7;
          for (var9Lifetime2 = 0; var9Lifetime2 < this.field_w; var9Lifetime2++) {
            param2.field_d[var9Lifetime2] = this.field_d[var9Lifetime2];
            param2.field_i[var9Lifetime2] = this.field_i[var9Lifetime2];
            param2.field_X[var9Lifetime2] = this.field_X[var9Lifetime2];
            param2.field_bb[var9Lifetime2] = this.field_bb[var9Lifetime2];
          }
        } else {
          param2.field_d = this.field_d;
          param2.field_i = this.field_i;
          param2.field_X = this.field_X;
          param2.field_bb = this.field_bb;
        }
        param2.field_o = this.field_o;
        param2.field_a = this.field_a;
        param2.field_u = this.field_u;
        param2.field_H = this.field_H;
        param2.field_eb = this.field_eb;
        param2.field_F = this.field_F;
        param2.field_M = this.field_M;
        param2.field_N = this.field_N;
        param2.field_D = this.field_D;
        param2.field_E = this.field_E;
        param2.field_b = this.field_b;
        param2.field_g = this.field_g;
        param2.field_Y = this.field_Y;
        param2.field_t = this.field_t;
        param2.field_K = false;
        return (bn) ((Object) param2);
    }

    final bn a(boolean param0, boolean param1, boolean param2) {
        if (!param0 &&
          field_h.length < this.field_w) {
          field_h = new byte[this.field_w + 100];
        }
        if (!param1 &&
          field_m.length < this.field_w) {
          field_hb = new int[this.field_w + 100];
          field_f = new int[this.field_w + 100];
          field_s = new int[this.field_w + 100];
          field_m = new short[this.field_w + 100];
        }
        return this.a(param0, param1, field_ab, field_h, field_m, field_hb, field_f, field_s);
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
        if (var5 < 50 - this.field_db) {
          return;
        }
        var15Lifetime2 = this.field_db * 92682 >> 16;
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
        stackIn_15_0 = (var5 > 50 + this.field_db) ? 0 : 1;
        var16 = stackIn_15_0;
        if (var16 == 0) {
          stackIn_21_0 = (this.field_L > 0) ? 1 : 0;
        } else {
          stackIn_21_0 = 1;
        }
        var17Lifetime2 = stackIn_21_0;
        var18Lifetime1 = oo.field_l;
        var19Lifetime1 = oo.field_e;
        var20 = 0;
        var27 = 0;
        var21_intLifetime1 = var27;
        while (var27 < this.field_T) {
          var22Lifetime1 = this.field_k[var27];
          var23Lifetime1 = this.field_C[var27];
          var24 = this.field_A[var27];
          var25 = var22Lifetime1 * var6 + var23Lifetime1 * var9 + var24 * var12 >> 16;
          var26 = var22Lifetime1 * var7 + var23Lifetime1 * var10 + var24 * var13 >> 16;
          var24 = var22Lifetime1 * var8 + var23Lifetime1 * var11 + var24 * var14 >> 16;
          var22Lifetime1Lifetime1 = var25;
          var23Lifetime1Lifetime1 = var26;
          field_gb[var27] = var24;
          var22Lifetime1Lifetime1 = var22Lifetime1Lifetime1 + var3;
          var23Lifetime1Lifetime1 = var23Lifetime1Lifetime1 + var4;
          var24 = var24 + var5;
          if (var24 < 50) {
            field_v[var27] = -5000;
            var20 = 1;
          } else {
            field_v[var27] = var18Lifetime1 + (var22Lifetime1Lifetime1 << 9) / var24;
            field_cb[var27] = var19Lifetime1 + (var23Lifetime1Lifetime1 << 9) / var24;
          }
          if (var17Lifetime2 != 0) {
            field_S[var27] = var22Lifetime1Lifetime1;
            field_fb[var27] = var23Lifetime1Lifetime1;
            field_q[var27] = var24;
          }
          var27++;
        }
        try {
          this.a((var20 & var16) != 0, false, 0L, (int) this.field_db, this.field_db << 1);
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var21 = (Exception) (Object) decompiledCaughtException;
        }
        return;
    }

    private final void c(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        if (field_p[param0]) {
          this.a(param0);
          return;
        }
        var2 = this.field_o[param0];
        var3 = this.field_a[param0];
        var4 = this.field_u[param0];
        oo.field_m = field_Z[param0];
        if (this.field_R != null) {
          oo.field_n = this.field_R[param0] & 255;
        } else {
          oo.field_n = 0;
        }
        if (this.field_F != null &&
          this.field_F[param0] != -1) {
          if (this.field_eb != null &&
            this.field_eb[param0] != -1) {
            var8 = this.field_eb[param0] & 255;
            var5 = this.field_N[var8];
            var6 = this.field_D[var8];
            var7 = this.field_E[var8];
          } else {
            var5 = var2;
            var6 = var3;
            var7 = var4;
          }
          if (this.field_bb[param0] != -1) {
            oo.a(field_cb[var2], field_cb[var3], field_cb[var4], field_v[var2], field_v[var3], field_v[var4], this.field_i[param0], this.field_X[param0], this.field_bb[param0], field_S[var5], field_S[var6], field_S[var7], field_fb[var5], field_fb[var6], field_fb[var7], field_q[var5], field_q[var6], field_q[var7], (int) this.field_F[param0]);
          } else {
            oo.a(field_cb[var2], field_cb[var3], field_cb[var4], field_v[var2], field_v[var3], field_v[var4], this.field_i[param0], this.field_i[param0], this.field_i[param0], field_S[var5], field_S[var6], field_S[var7], field_fb[var5], field_fb[var6], field_fb[var7], field_q[var5], field_q[var6], field_q[var7], (int) this.field_F[param0]);
          }
        } else {
          if (this.field_bb[param0] != -1) {
            oo.a(field_cb[var2], field_cb[var3], field_cb[var4], field_v[var2], field_v[var3], field_v[var4], this.field_i[param0] & 65535, this.field_X[param0] & 65535, this.field_bb[param0] & 65535);
          } else {
            oo.a(field_cb[var2], field_cb[var3], field_cb[var4], field_v[var2], field_v[var3], field_v[var4], oo.field_c[this.field_i[param0] & 65535]);
          }
        }
    }

    public static void d() {
        field_ab = null;
        field_h = null;
        field_m = null;
        field_hb = null;
        field_f = null;
        field_s = null;
        field_Z = null;
        field_p = null;
        field_v = null;
        field_cb = null;
        field_gb = null;
        field_S = null;
        field_fb = null;
        field_q = null;
        field_j = null;
        field_U = (int[][]) null;
        field_P = null;
        field_y = (int[][]) null;
        field_jb = null;
        field_c = null;
        field_Q = null;
        field_G = (int[][]) null;
        field_r = null;
        field_z = null;
        field_V = null;
        field_O = null;
        field_l = null;
        field_J = null;
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
          if (!this.field_K) {
            this.e();
          }
          var10_int = oo.field_l;
          var11 = oo.field_e;
          var12 = oo.field_j[param0];
          var13 = oo.field_h[param0];
          var14 = oo.field_j[param1];
          var15 = oo.field_h[param1];
          var16 = oo.field_j[param2];
          var17 = oo.field_h[param2];
          var18 = oo.field_j[param3];
          var19 = oo.field_h[param3];
          var20 = param5 * var18 + param6 * var19 >> 16;
          for (var21 = 0; var21 < this.field_T; var21++) {
            var22 = this.field_k[var21];
            var23 = this.field_C[var21];
            var24 = this.field_A[var21];
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
            field_gb[var21] = var24 - var20;
            field_v[var21] = var10_int + (var22 << 9) / var24;
            field_cb[var21] = var11 + (var23Lifetime1 << 9) / var24;
            if (this.field_L > 0) {
              field_S[var21] = var22;
              field_fb[var21] = var23Lifetime1;
              field_q[var21] = var24;
            }
          }
          this.a(false, param7 >= 0L ? true : false, param7, (int) this.field_db, this.field_db << 1);
        } catch (RuntimeException runtimeException) {
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
        if (!field_B) {
          for (var8 = 0; var8 < 1600; var8++) {
            field_j[var8] = 0;
          }
          for (var8Lifetime4 = 0; var8Lifetime4 < 32; var8Lifetime4++) {
            field_P[var8Lifetime4] = 0;
          }
          field_e = 0;
        }
        for (var8Lifetime1 = 0; var8Lifetime1 < this.field_w; var8Lifetime1++) {
          L45: {
            if (this.field_bb[var8Lifetime1] != -2) {
              var9 = this.field_o[var8Lifetime1];
              var10 = this.field_a[var8Lifetime1];
              var11 = this.field_u[var8Lifetime1];
              var12 = field_v[var9];
              var13 = field_v[var10];
              var14_int = field_v[var11];
              if (param0 && (var12 == -5000 ||
                var13 == -5000 ||
                var14_int == -5000)) {
                var15_int = field_S[var9];
                var16 = field_S[var10];
                var17 = field_S[var11];
                var18 = field_fb[var9];
                var19 = field_fb[var10];
                var20 = field_fb[var11];
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
                  field_p[var8Lifetime1] = true;
                  if (field_B) {
                    field_jb[var7] = (field_gb[var9] + field_gb[var10] + field_gb[var11]) / 3;
                    incrementValue$12 = var7;
                    var7++;
                    field_c[incrementValue$12] = var8Lifetime1;
                  } else {
                    var27 = (field_gb[var9] + field_gb[var10] + field_gb[var11]) / 3 + param3;
                    if (field_j[var27] < 64) {
                      dupTemp$10 = field_j[var27];
                      arrayValue$11 = field_U[var27];
                      field_j[var27] = dupTemp$10 + 1;
                      arrayValue$11[dupTemp$10] = var8Lifetime1;
                    } else {
                      var28 = field_j[var27];
                      if (var28 == 64) {
                        if (field_e == 512) {
                          break L45;
                        }
                        fieldTemp$7 = field_e;
                        field_e = field_e + 1;
                        var28 = 65 + fieldTemp$7;
                        field_j[var27] = 65 + fieldTemp$7;
                      }
                      var28 -= 65;
                      dupTemp$8 = field_P[var28];
                      arrayValue$9 = field_y[var28];
                      field_P[var28] = dupTemp$8 + 1;
                      arrayValue$9[dupTemp$8] = var8Lifetime1;
                    }
                  }
                }
                break L45;
              }
              if (param1 &&
                this.a(bj.field_h + oo.field_l, fb.field_E + oo.field_e, field_cb[var9], field_cb[var10], field_cb[var11], var12, var13, var14_int)) {
                fieldTemp$13 = ec.field_C;
                ec.field_C = ec.field_C + 1;
                un.field_Mb[fieldTemp$13] = param2;
                param1 = false;
              }
              if ((var12 - var13) * (field_cb[var11] - field_cb[var10]) - (field_cb[var9] - field_cb[var10]) * (var14_int - var13) > 0) {
                field_p[var8Lifetime1] = false;
                if (var12 >= 0 &&
                  var13 >= 0 &&
                  var14_int >= 0 &&
                  var12 <= oo.field_q &&
                  var13 <= oo.field_q &&
                  var14_int <= oo.field_q) {
                  field_Z[var8Lifetime1] = false;
                } else {
                  field_Z[var8Lifetime1] = true;
                }
                if (!field_B) {
                  var15_intLifetime2 = (field_gb[var9] + field_gb[var10] + field_gb[var11]) / 3 + param3;
                  if (field_j[var15_intLifetime2] >= 64) {
                    var16Lifetime2 = field_j[var15_intLifetime2];
                    if (var16Lifetime2 == 64) {
                      if (field_e == 512) {
                        break L45;
                      }
                      fieldTemp$14 = field_e;
                      field_e = field_e + 1;
                      var16Lifetime2 = 65 + fieldTemp$14;
                      field_j[var15_intLifetime2] = 65 + fieldTemp$14;
                    }
                    var16Lifetime2 -= 65;
                    dupTemp$15 = field_P[var16Lifetime2];
                    arrayValue$16 = field_y[var16Lifetime2];
                    field_P[var16Lifetime2] = dupTemp$15 + 1;
                    arrayValue$16[dupTemp$15] = var8Lifetime1;
                  } else {
                    dupTemp$17 = field_j[var15_intLifetime2];
                    arrayValue$18 = field_U[var15_intLifetime2];
                    field_j[var15_intLifetime2] = dupTemp$17 + 1;
                    arrayValue$18[dupTemp$17] = var8Lifetime1;
                  }
                } else {
                  field_jb[var7] = (field_gb[var9] + field_gb[var10] + field_gb[var11]) / 3;
                  incrementValue$19 = var7;
                  var7++;
                  field_c[incrementValue$19] = var8Lifetime1;
                }
              }
            }
          }
        }
        if (field_B) {
          sf.a(field_jb, (byte) 17, var7 - 1, 0, field_c);
          if (this.field_H == null) {
            for (var8Lifetime2 = 0; var8Lifetime2 < var7; var8Lifetime2++) {
              this.c(field_c[var8Lifetime2]);
            }
            return;
          }
          for (var8Lifetime2 = 0; var8Lifetime2 < 12; var8Lifetime2++) {
            field_Q[var8Lifetime2] = 0;
            field_V[var8Lifetime2] = 0;
          }
          for (var8Lifetime2 = 0; var8Lifetime2 < var7; var8Lifetime2++) {
            var9Lifetime1 = field_c[var8Lifetime2];
            var10Lifetime1 = field_jb[var8Lifetime2];
            var11Lifetime1 = this.field_H[var9Lifetime1];
            dupTemp$2 = field_Q[var11Lifetime1];
            field_Q[var11Lifetime1] = dupTemp$2 + 1;
            var12Lifetime1 = dupTemp$2;
            field_G[var11Lifetime1][var12Lifetime1] = var9Lifetime1;
            if (var11Lifetime1 >= 10) {
              if (var11Lifetime1 != 10) {
                field_z[var12Lifetime1] = var10Lifetime1;
              } else {
                field_r[var12Lifetime1] = var10Lifetime1;
              }
            } else {
              field_V[var11Lifetime1] = field_V[var11Lifetime1] + var10Lifetime1;
            }
          }
        } else {
          if (this.field_H == null) {
            for (var8Lifetime2 = param4 - 1; var8Lifetime2 >= 0; var8Lifetime2--) {
              var9Lifetime1 = field_j[var8Lifetime2];
              if (var9Lifetime1 > 0) {
                stackIn_90_0 = (var9Lifetime1 <= 64) ? var9Lifetime1 : 64;
                var10Lifetime1 = stackIn_90_0;
                var45 = field_U[var8Lifetime2];
                for (var12Lifetime1 = 0; var12Lifetime1 < var10Lifetime1; var12Lifetime1++) {
                  this.c(var45[var12Lifetime1]);
                }
              }
              if (var9Lifetime1 > 64) {
                var10Lifetime1 = field_j[var8Lifetime2] - 64 - 1;
                var46 = field_y[var10Lifetime1];
                for (var12Lifetime1 = 0; var12Lifetime1 < field_P[var10Lifetime1]; var12Lifetime1++) {
                  this.c(var46[var12Lifetime1]);
                }
              }
            }
            return;
          }
          for (var8Lifetime2 = 0; var8Lifetime2 < 12; var8Lifetime2++) {
            field_Q[var8Lifetime2] = 0;
            field_V[var8Lifetime2] = 0;
          }
          for (var8Lifetime2 = param4 - 1; var8Lifetime2 >= 0; var8Lifetime2--) {
            var9Lifetime1 = field_j[var8Lifetime2];
            if (var9Lifetime1 > 0) {
              if (var9Lifetime1 <= 64) {
                var10Lifetime1 = var9Lifetime1;
              } else {
                var10Lifetime1 = 64;
              }
              var47 = field_U[var8Lifetime2];
              for (var12Lifetime1 = 0; var12Lifetime1 < var10Lifetime1; var12Lifetime1++) {
                var13Lifetime1 = var47[var12Lifetime1];
                var14_intLifetime1 = this.field_H[var13Lifetime1];
                dupTemp$0 = field_Q[var14_intLifetime1];
                field_Q[var14_intLifetime1] = dupTemp$0 + 1;
                var15_intLifetime1 = dupTemp$0;
                field_G[var14_intLifetime1][var15_intLifetime1] = var13Lifetime1;
                if (var14_intLifetime1 >= 10) {
                  if (var14_intLifetime1 != 10) {
                    field_z[var15_intLifetime1] = var8Lifetime2;
                  } else {
                    field_r[var15_intLifetime1] = var8Lifetime2;
                  }
                } else {
                  field_V[var14_intLifetime1] = field_V[var14_intLifetime1] + var8Lifetime2;
                }
              }
            }
            if (var9Lifetime1 > 64) {
              var10Lifetime1 = field_j[var8Lifetime2] - 64 - 1;
              var48 = field_y[var10Lifetime1];
              for (var12Lifetime1 = 0; var12Lifetime1 < field_P[var10Lifetime1]; var12Lifetime1++) {
                var13Lifetime1Lifetime1 = var48[var12Lifetime1];
                var14_intLifetime1Lifetime1 = this.field_H[var13Lifetime1Lifetime1];
                dupTemp$1 = field_Q[var14_intLifetime1Lifetime1];
                field_Q[var14_intLifetime1Lifetime1] = dupTemp$1 + 1;
                var15_intLifetime1Lifetime1 = dupTemp$1;
                field_G[var14_intLifetime1Lifetime1][var15_intLifetime1Lifetime1] = var13Lifetime1Lifetime1;
                if (var14_intLifetime1Lifetime1 >= 10) {
                  if (var14_intLifetime1Lifetime1 != 10) {
                    field_z[var15_intLifetime1Lifetime1] = var8Lifetime2;
                  } else {
                    field_r[var15_intLifetime1Lifetime1] = var8Lifetime2;
                  }
                } else {
                  field_V[var14_intLifetime1Lifetime1] = field_V[var14_intLifetime1Lifetime1] + var8Lifetime2;
                }
              }
            }
          }
        }
        var8Lifetime3 = 0;
        if (!(field_Q[1] <= 0) ||
          !(field_Q[2] <= 0)) {
          var8Lifetime3 = (field_V[1] + field_V[2]) / (field_Q[1] + field_Q[2]);
        }
        var9Lifetime2 = 0;
        if (!(field_Q[3] <= 0) ||
          !(field_Q[4] <= 0)) {
          var9Lifetime2 = (field_V[3] + field_V[4]) / (field_Q[3] + field_Q[4]);
        }
        var10Lifetime2 = 0;
        if (!(field_Q[6] <= 0) ||
          !(field_Q[8] <= 0)) {
          var10Lifetime2 = (field_V[6] + field_V[8]) / (field_Q[6] + field_Q[8]);
        }
        var12Lifetime2 = 0;
        var13Lifetime2 = field_Q[10];
        var14 = field_G[10];
        var15 = field_r;
        if (var12Lifetime2 == var13Lifetime2) {
          var12Lifetime2 = 0;
          var13Lifetime2 = field_Q[11];
          var14 = field_G[11];
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
              this.c(var14[incrementValue$4]);
              if (var12Lifetime2 == var13Lifetime2 &&
                var14 != field_G[11]) {
                var12Lifetime2 = 0;
                var13Lifetime2 = field_Q[11];
                var14 = field_G[11];
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
              this.c(var14[incrementValue$5]);
              if (var12Lifetime2 == var13Lifetime2 &&
                var14 != field_G[11]) {
                var12Lifetime2 = 0;
                var13Lifetime2 = field_Q[11];
                var14 = field_G[11];
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
              this.c(var14[incrementValue$6]);
              if (var12Lifetime2 == var13Lifetime2 &&
                var14 != field_G[11]) {
                var12Lifetime2 = 0;
                var13Lifetime2 = field_Q[11];
                var14 = field_G[11];
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
          var17Lifetime1 = field_Q[var16Lifetime1];
          var49 = field_G[var16Lifetime1];
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
            var14 != field_G[11]) {
            var12Lifetime2 = 0;
            var14 = field_G[11];
            var13Lifetime2 = field_Q[11];
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
          field_kb = 0;
          field_ib = 0;
          field_x = 0;
          for (var9 = 0; var9 < var7; var9++) {
            var10 = param1[var9];
            if (var10 < this.field_b.length) {
              var35 = this.field_b[var10];
              for (var12 = 0; var12 < var35.length; var12++) {
                var13 = var35[var12];
                field_kb = field_kb + this.field_k[var13];
                field_ib = field_ib + this.field_C[var13];
                field_x = field_x + this.field_A[var13];
                var8++;
              }
            }
          }
          if (var8 <= 0) {
            field_kb = param2;
            field_ib = param3;
            field_x = param4;
          } else {
            field_kb = field_kb / var8 + param2;
            field_ib = field_ib / var8 + param3;
            field_x = field_x / var8 + param4;
          }
          return;
        }
        if (param0 == 1) {
          for (var8Lifetime1 = 0; var8Lifetime1 < var7; var8Lifetime1++) {
            var9Lifetime1 = param1[var8Lifetime1];
            if (var9Lifetime1 < this.field_b.length) {
              var36 = this.field_b[var9Lifetime1];
              for (var11 = 0; var11 < var36.length; var11++) {
                var12Lifetime1 = var36[var11];
                this.field_k[var12Lifetime1] = this.field_k[var12Lifetime1] + param2;
                this.field_C[var12Lifetime1] = this.field_C[var12Lifetime1] + param3;
                this.field_A[var12Lifetime1] = this.field_A[var12Lifetime1] + param4;
              }
            }
          }
          return;
        }
        if (param0 == 2) {
          for (var8Lifetime2 = 0; var8Lifetime2 < var7; var8Lifetime2++) {
            var9Lifetime2 = param1[var8Lifetime2];
            if (var9Lifetime2 < this.field_b.length) {
              var37 = this.field_b[var9Lifetime2];
              for (var11Lifetime1 = 0; var11Lifetime1 < var37.length; var11Lifetime1++) {
                var12Lifetime2 = var37[var11Lifetime1];
                this.field_k[var12Lifetime2] = this.field_k[var12Lifetime2] - field_kb;
                this.field_C[var12Lifetime2] = this.field_C[var12Lifetime2] - field_ib;
                this.field_A[var12Lifetime2] = this.field_A[var12Lifetime2] - field_x;
                if (param4 != 0) {
                  var13Lifetime1 = oo.field_j[param4];
                  var14 = oo.field_h[param4];
                  var15 = this.field_C[var12Lifetime2] * var13Lifetime1 + this.field_k[var12Lifetime2] * var14 + 32767 >> 16;
                  this.field_C[var12Lifetime2] = this.field_C[var12Lifetime2] * var14 - this.field_k[var12Lifetime2] * var13Lifetime1 + 32767 >> 16;
                  this.field_k[var12Lifetime2] = var15;
                }
                if (param2 != 0) {
                  var13Lifetime1Lifetime1 = oo.field_j[param2];
                  var14Lifetime2 = oo.field_h[param2];
                  var15Lifetime2 = this.field_C[var12Lifetime2] * var14Lifetime2 - this.field_A[var12Lifetime2] * var13Lifetime1Lifetime1 + 32767 >> 16;
                  this.field_A[var12Lifetime2] = this.field_C[var12Lifetime2] * var13Lifetime1Lifetime1 + this.field_A[var12Lifetime2] * var14Lifetime2 + 32767 >> 16;
                  this.field_C[var12Lifetime2] = var15Lifetime2;
                }
                if (param3 != 0) {
                  var13Lifetime1Lifetime2 = oo.field_j[param3];
                  var14Lifetime3 = oo.field_h[param3];
                  var15Lifetime3 = this.field_A[var12Lifetime2] * var13Lifetime1Lifetime2 + this.field_k[var12Lifetime2] * var14Lifetime3 + 32767 >> 16;
                  this.field_A[var12Lifetime2] = this.field_A[var12Lifetime2] * var14Lifetime3 - this.field_k[var12Lifetime2] * var13Lifetime1Lifetime2 + 32767 >> 16;
                  this.field_k[var12Lifetime2] = var15Lifetime3;
                }
                this.field_k[var12Lifetime2] = this.field_k[var12Lifetime2] + field_kb;
                this.field_C[var12Lifetime2] = this.field_C[var12Lifetime2] + field_ib;
                this.field_A[var12Lifetime2] = this.field_A[var12Lifetime2] + field_x;
              }
            }
          }
          return;
        }
        if (param0 == 3) {
          for (var8Lifetime3 = 0; var8Lifetime3 < var7; var8Lifetime3++) {
            var9Lifetime3 = param1[var8Lifetime3];
            if (var9Lifetime3 < this.field_b.length) {
              var38 = this.field_b[var9Lifetime3];
              for (var11Lifetime2 = 0; var11Lifetime2 < var38.length; var11Lifetime2++) {
                var12Lifetime3 = var38[var11Lifetime2];
                this.field_k[var12Lifetime3] = this.field_k[var12Lifetime3] - field_kb;
                this.field_C[var12Lifetime3] = this.field_C[var12Lifetime3] - field_ib;
                this.field_A[var12Lifetime3] = this.field_A[var12Lifetime3] - field_x;
                this.field_k[var12Lifetime3] = this.field_k[var12Lifetime3] * param2 / 128;
                this.field_C[var12Lifetime3] = this.field_C[var12Lifetime3] * param3 / 128;
                this.field_A[var12Lifetime3] = this.field_A[var12Lifetime3] * param4 / 128;
                this.field_k[var12Lifetime3] = this.field_k[var12Lifetime3] + field_kb;
                this.field_C[var12Lifetime3] = this.field_C[var12Lifetime3] + field_ib;
                this.field_A[var12Lifetime3] = this.field_A[var12Lifetime3] + field_x;
              }
            }
          }
          return;
        }
        if (param0 != 5) {
          if (param0 != 7) {
            return;
          }
          if (this.field_g != null) {
            for (var8Lifetime4 = 0; var8Lifetime4 < var7; var8Lifetime4++) {
              var9Lifetime4 = param1[var8Lifetime4];
              if (var9Lifetime4 < this.field_g.length) {
                var40 = this.field_g[var9Lifetime4];
                for (var11Lifetime3 = 0; var11Lifetime3 < var40.length; var11Lifetime3++) {
                  var12Lifetime4 = var40[var11Lifetime3];
                  var13Lifetime2 = this.field_d[var12Lifetime4] & 65535;
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
                  this.field_d[var12Lifetime4] = (short)(var14Lifetime1 << 10 | var15Lifetime1 << 7 | var16);
                }
                this.field_I = true;
              }
            }
            return;
          }
        } else {
          if (this.field_g != null) {
            if (this.field_R != null) {
              for (var8Lifetime4 = 0; var8Lifetime4 < var7; var8Lifetime4++) {
                var9Lifetime4 = param1[var8Lifetime4];
                if (var9Lifetime4 < this.field_g.length) {
                  var39 = this.field_g[var9Lifetime4];
                  for (var11Lifetime3 = 0; var11Lifetime3 < var39.length; var11Lifetime3++) {
                    var12Lifetime4 = var39[var11Lifetime3];
                    var13Lifetime2 = (this.field_R[var12Lifetime4] & 255) + param2 * 8;
                    if (var13Lifetime2 >= 0) {
                      if (var13Lifetime2 > 255) {
                        var13Lifetime2 = 255;
                      }
                    } else {
                      var13Lifetime2 = 0;
                    }
                    this.field_R[var12Lifetime4] = (byte)var13Lifetime2;
                  }
                }
              }
              return;
            }
            return;
          }
        }
    }

    final void b() {
        if (this.field_I) {
          this.c();
          this.field_I = false;
        }
        this.field_K = false;
    }

    final void a(fc param0) {
        int var2;
        int var2Lifetime1;
        int var2Lifetime2;
        for (var2 = 0; var2 < param0.field_w; var2++) {
          this.field_o[this.field_w] = param0.field_o[var2] + this.field_T;
          this.field_a[this.field_w] = param0.field_a[var2] + this.field_T;
          this.field_u[this.field_w] = param0.field_u[var2] + this.field_T;
          this.field_i[this.field_w] = param0.field_i[var2];
          this.field_X[this.field_w] = param0.field_X[var2];
          this.field_bb[this.field_w] = param0.field_bb[var2];
          this.field_d[this.field_w] = param0.field_d[var2];
          if (this.field_H != null) {
            if (param0.field_H == null) {
              this.field_H[this.field_w] = param0.field_M;
            } else {
              this.field_H[this.field_w] = param0.field_H[var2];
            }
            if (this.field_R != null &&
              param0.field_R != null) {
              this.field_R[this.field_w] = param0.field_R[var2];
            }
          } else {
            if (this.field_R != null &&
              param0.field_R != null) {
              this.field_R[this.field_w] = param0.field_R[var2];
            }
          }
          if (this.field_F != null) {
            if (param0.field_F == null) {
              this.field_F[this.field_w] = (short)-1;
            } else {
              this.field_F[this.field_w] = param0.field_F[var2];
            }
          }
          if (this.field_eb != null) {
            if (param0.field_eb != null &&
              param0.field_eb[var2] != -1) {
              this.field_eb[this.field_w] = (byte)(param0.field_eb[var2] + this.field_L);
            } else {
              this.field_eb[this.field_w] = (byte)-1;
            }
          }
          this.field_w = this.field_w + 1;
        }
        if (this.field_N != null) {
          for (var2Lifetime1 = 0; var2Lifetime1 < param0.field_L; var2Lifetime1++) {
            this.field_N[this.field_L] = param0.field_N[var2Lifetime1] + this.field_T;
            this.field_D[this.field_L] = param0.field_D[var2Lifetime1] + this.field_T;
            this.field_E[this.field_L] = param0.field_E[var2Lifetime1] + this.field_T;
            this.field_L = this.field_L + 1;
          }
        }
        for (var2Lifetime2 = 0; var2Lifetime2 < param0.field_T; var2Lifetime2++) {
          this.field_k[this.field_T] = param0.field_k[var2Lifetime2];
          this.field_C[this.field_T] = param0.field_C[var2Lifetime2];
          this.field_A[this.field_T] = param0.field_A[var2Lifetime2];
          this.field_T = this.field_T + 1;
        }
        this.field_W = this.field_T;
    }

    final boolean a() {
        if (this.field_b == null) {
          return false;
        }
        field_kb = 0;
        field_ib = 0;
        field_x = 0;
        return true;
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
        for (var9 = 0; var9 < this.field_W; var9++) {
          var10 = this.field_k[var9];
          var11 = this.field_C[var9];
          var12 = this.field_A[var9];
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
        this.field_lb = (short)(int)(Math.sqrt((double)var7) + 0.99);
        this.field_db = (short)(int)(Math.sqrt((double)var8) + 0.99);
        this.field_K = true;
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

    private fc() {
        this.field_T = 0;
        this.field_L = 0;
        this.field_I = false;
        this.field_W = 0;
        this.field_w = 0;
        this.field_K = false;
        this.field_M = (byte) 0;
    }

    fc(lg param0, int param1, int param2, int param3, int param4, int param5) {
        int dupTemp$1 = 0;
        int incrementValue$0 = 0;
        int var7;
        int var8;
        int var9;
        int[] var9_ref_int__;
        int var10;
        int var11;
        int var12;
        sg var13;
        int var14;
        int var15;
        int var16;
        int[] var17;
        g var18;
        g var19;
        int[] var20;
        int var9Lifetime1;
        int var10Lifetime1;
        int var10Lifetime2;
        int var11Lifetime1;
        int var11Lifetime2;
        int var10Lifetime1Lifetime1;
        int var10Lifetime1Lifetime2;
        this.field_T = 0;
        this.field_L = 0;
        this.field_I = false;
        this.field_W = 0;
        this.field_w = 0;
        this.field_K = false;
        this.field_M = (byte) 0;
        param0.c();
        param0.d();
        this.field_T = param0.field_G;
        this.field_W = param0.field_O;
        this.field_k = param0.field_p;
        this.field_C = param0.field_D;
        this.field_A = param0.field_i;
        this.field_w = param0.field_z;
        this.field_o = param0.field_e;
        this.field_a = param0.field_H;
        this.field_u = param0.field_r;
        this.field_H = param0.field_k;
        this.field_R = param0.field_o;
        this.field_M = param0.field_A;
        this.field_d = param0.field_c;
        this.field_b = param0.field_n;
        this.field_g = param0.field_w;
        this.field_t = param0.field_K;
        this.field_Y = param0.field_f;
        var7 = (int)Math.sqrt((double)(param3 * param3 + param4 * param4 + param5 * param5));
        var8 = param2 * var7 >> 8;
        this.field_i = new int[this.field_w];
        this.field_X = new int[this.field_w];
        this.field_bb = new int[this.field_w];
        if (param0.field_N != null) {
          this.field_F = new short[this.field_w];
          for (var9 = 0; var9 < this.field_w; var9++) {
            var10 = param0.field_N[var9];
            if (var10 != -1 &&
              oo.field_o.d(-127, var10)) {
              this.field_F[var9] = (short)var10;
            } else {
              this.field_F[var9] = (short)-1;
            }
          }
        } else {
          this.field_F = null;
        }
        if (param0.field_L > 0 &&
          param0.field_x != null) {
          var20 = new int[param0.field_L];
          var17 = var20;
          var9_ref_int__ = var17;
          for (var10Lifetime1 = 0; var10Lifetime1 < this.field_w; var10Lifetime1++) {
            if (param0.field_x[var10Lifetime1] != -1) {
              dupTemp$1 = param0.field_x[var10Lifetime1] & 255;
              var9_ref_int__[dupTemp$1] = var9_ref_int__[dupTemp$1] + 1;
            }
          }
          this.field_L = 0;
          for (var10Lifetime1Lifetime1 = 0; var10Lifetime1Lifetime1 < param0.field_L; var10Lifetime1Lifetime1++) {
            if (var20[var10Lifetime1Lifetime1] > 0 &&
              param0.field_E[var10Lifetime1Lifetime1] == 0) {
              this.field_L = this.field_L + 1;
            }
          }
          this.field_N = new int[this.field_L];
          this.field_D = new int[this.field_L];
          this.field_E = new int[this.field_L];
          var10Lifetime1Lifetime2 = 0;
          for (var11 = 0; var11 < param0.field_L; var11++) {
            if (var20[var11] > 0 &&
              param0.field_E[var11] == 0) {
              this.field_N[var10Lifetime1Lifetime2] = param0.field_M[var11] & 65535;
              this.field_D[var10Lifetime1Lifetime2] = param0.field_P[var11] & 65535;
              this.field_E[var10Lifetime1Lifetime2] = param0.field_F[var11] & 65535;
              incrementValue$0 = var10Lifetime1Lifetime2;
              var10Lifetime1Lifetime2++;
              var9_ref_int__[var11] = incrementValue$0;
            } else {
              var20[var11] = -1;
            }
          }
          this.field_eb = new byte[this.field_w];
          for (var11Lifetime2 = 0; var11Lifetime2 < this.field_w; var11Lifetime2++) {
            if (param0.field_x[var11Lifetime2] == -1) {
              this.field_eb[var11Lifetime2] = (byte)-1;
            } else {
              this.field_eb[var11Lifetime2] = (byte)var9_ref_int__[param0.field_x[var11Lifetime2] & 255];
              if (this.field_eb[var11Lifetime2] == -1 &&
                this.field_F != null) {
                this.field_F[var11Lifetime2] = (short)-1;
              }
            }
          }
        }
        var16 = 0;
        var9Lifetime1 = var16;
        while (var16 < this.field_w) {
          if (param0.field_g != null) {
            var10Lifetime2 = param0.field_g[var16];
          } else {
            var10Lifetime2 = 0;
          }
          if (param0.field_o != null) {
            var11Lifetime1 = param0.field_o[var16];
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
                this.field_bb[var16] = -2;
              } else {
                var19 = param0.field_j[var16];
                var14 = param1 + (param3 * var19.field_a + param4 * var19.field_c + param5 * var19.field_d) / (var8 + var8 / 2);
                this.field_i[var16] = fc.b(var14);
                this.field_bb[var16] = -1;
              }
            } else {
              if (param0.field_Q != null &&
                param0.field_Q[this.field_o[var16]] != null) {
                var13 = param0.field_Q[this.field_o[var16]];
              } else {
                var13 = param0.field_B[this.field_o[var16]];
              }
              var14 = param1 + (param3 * var13.field_b + param4 * var13.field_h + param5 * var13.field_f) / (var8 * var13.field_g);
              this.field_i[var16] = fc.b(var14);
              if (param0.field_Q != null &&
                param0.field_Q[this.field_a[var16]] != null) {
                var13 = param0.field_Q[this.field_a[var16]];
              } else {
                var13 = param0.field_B[this.field_a[var16]];
              }
              var14 = param1 + (param3 * var13.field_b + param4 * var13.field_h + param5 * var13.field_f) / (var8 * var13.field_g);
              this.field_X[var16] = fc.b(var14);
              if (param0.field_Q != null &&
                param0.field_Q[this.field_u[var16]] != null) {
                var13 = param0.field_Q[this.field_u[var16]];
              } else {
                var13 = param0.field_B[this.field_u[var16]];
              }
              var14 = param1 + (param3 * var13.field_b + param4 * var13.field_h + param5 * var13.field_f) / (var8 * var13.field_g);
              this.field_bb[var16] = fc.b(var14);
            }
          } else {
            if (var10Lifetime2 != 0) {
              if (var10Lifetime2 != 1) {
                if (var10Lifetime2 != 3) {
                  this.field_bb[var16] = -2;
                } else {
                  this.field_i[var16] = 128;
                  this.field_bb[var16] = -1;
                }
              } else {
                var18 = param0.field_j[var16];
                var14 = param1 + (param3 * var18.field_a + param4 * var18.field_c + param5 * var18.field_d) / (var8 + var8 / 2) << 17;
                this.field_i[var16] = var14 | fc.a(param0.field_c[var16] & 65535, var14 >> 17);
                this.field_bb[var16] = -1;
              }
            } else {
              var15 = param0.field_c[var16] & 65535;
              if (param0.field_Q != null &&
                param0.field_Q[this.field_o[var16]] != null) {
                var13 = param0.field_Q[this.field_o[var16]];
              } else {
                var13 = param0.field_B[this.field_o[var16]];
              }
              var14 = param1 + (param3 * var13.field_b + param4 * var13.field_h + param5 * var13.field_f) / (var8 * var13.field_g) << 17;
              this.field_i[var16] = var14 | fc.a(var15, var14 >> 17);
              if (param0.field_Q != null &&
                param0.field_Q[this.field_a[var16]] != null) {
                var13 = param0.field_Q[this.field_a[var16]];
              } else {
                var13 = param0.field_B[this.field_a[var16]];
              }
              var14 = param1 + (param3 * var13.field_b + param4 * var13.field_h + param5 * var13.field_f) / (var8 * var13.field_g) << 17;
              this.field_X[var16] = var14 | fc.a(var15, var14 >> 17);
              if (param0.field_Q != null &&
                param0.field_Q[this.field_u[var16]] != null) {
                var13 = param0.field_Q[this.field_u[var16]];
              } else {
                var13 = param0.field_B[this.field_u[var16]];
              }
              var14 = param1 + (param3 * var13.field_b + param4 * var13.field_h + param5 * var13.field_f) / (var8 * var13.field_g) << 17;
              this.field_bb[var16] = var14 | fc.a(var15, var14 >> 17);
            }
          }
          var16++;
        }
    }

    fc(int param0, int param1, int param2, boolean param3, boolean param4, boolean param5, boolean param6, int param7, int param8) {
        this.field_T = 0;
        this.field_L = 0;
        this.field_I = false;
        this.field_W = 0;
        this.field_w = 0;
        this.field_K = false;
        this.field_M = (byte) 0;
        this.field_k = new int[param0];
        this.field_C = new int[param0];
        this.field_A = new int[param0];
        this.field_o = new int[param1];
        this.field_a = new int[param1];
        this.field_u = new int[param1];
        this.field_i = new int[param1];
        this.field_X = new int[param1];
        this.field_bb = new int[param1];
        if (param3) {
          this.field_H = new byte[param1];
        }
        if (param4) {
          this.field_R = new byte[param1];
        }
        if (param5) {
          this.field_F = new short[param1];
        }
        if (param6) {
          this.field_eb = new byte[param1];
        }
        if (param2 > 0) {
          this.field_N = new int[param2];
          this.field_D = new int[param2];
          this.field_E = new int[param2];
        }
        this.field_d = new short[param1];
    }

    static {
        field_ab = new fc();
        field_hb = new int[1];
        field_s = new int[1];
        field_f = new int[1];
        field_m = new short[1];
        field_h = new byte[1];
        fc discarded$0 = new fc();
        fc discarded$1 = new fc();
        field_Z = new boolean[4096];
        field_G = new int[12][4096];
        field_q = new int[4096];
        field_fb = new int[4096];
        field_v = new int[4096];
        field_l = new int[10];
        field_S = new int[4096];
        field_Q = new int[12];
        field_cb = new int[4096];
        field_O = new int[10];
        field_B = false;
        field_J = new int[10];
        field_V = new int[12];
        field_r = new int[4096];
        field_n = false;
        field_gb = new int[4096];
        field_e = 0;
        field_p = new boolean[4096];
        field_z = new int[4096];
        if (field_B) {
          field_jb = new int[4096];
          field_c = new int[4096];
        } else {
          field_j = new int[1600];
          field_U = new int[1600][64];
          field_P = new int[32];
          field_y = new int[32][512];
        }
    }
}
