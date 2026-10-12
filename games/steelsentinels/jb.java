/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jb extends kd {
    private wl field_I;
    static int field_P;
    private ee field_Z;
    private int field_z;
    private int field_N;
    int field_G;
    int field_H;
    int field_M;
    int field_V;
    static wk field_L;
    static String field_Q;
    private boolean field_R;
    boolean field_O;
    static wk field_B;
    static wk[] field_S;
    int field_T;
    static String field_E;
    int field_K;
    private int field_y;
    private mb[] field_X;
    static String field_W;
    int field_U;
    int field_F;
    private int field_Y;
    static ul field_A;
    static wk[] field_J;
    static gh field_C;
    static fm field_D;

    final void a(int param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        if (!ka.field_V) {
          return;
        }
        var4 = param1 + (this.field_H >> 8);
        var5 = param0 + (this.field_M >> 8);
        var6 = 2 % ((param2 - 30) / 54);
        var7 = (this.field_Y + (-this.field_Y + this.field_z) / 4) * this.field_U / this.field_z;
        var8 = var7 >> 4;
        var9 = this.field_z / 2;
        var10 = 2500;
        if (null != this.field_I) {
          var10 = this.field_I.field_O * 25;
          if (var10 > 2500) {
            var10 = 2500;
          }
        }
        if (0 < var8) {
          boolean decompiledFrameRemainder0 = true;
          if (this.field_I != null &&
            300 < this.field_I.field_O) {
            if (this.field_Y < var9) {
              qh.b(var10 * this.field_Y * 10 / var9, var5 << 4, 15, var4 << 4, var8 << 4);
              decompiledFrameRemainder0 = (SteelSentinels.field_G != 0);
            }
            if ((decompiledFrameRemainder0) &&
              (this.field_Y < (2 * var9))) {
              qh.b(10 * (2 * var9 - this.field_Y) * var10 / var9, var5 << 4, 15, var4 << 4, var8 << 4);
              return;
            }
          }
        }
        return;
    }

    final static wk[] g(int param0) {
        wk[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int[] var9 = null;
        byte[] var10 = null;
        int[] var11 = null;
        int stackIn_13_0 = 0;
        var7 = SteelSentinels.field_G;
        if (param0 != 7) {
          return (wk[]) null;
        }
        var1 = new wk[rl.field_d];
        var2 = 0;
        L0: while (true) {
          if (rl.field_d > var2) {
            var3 = le.field_L[var2] * ca.field_r[var2];
            var10 = dl.field_L[var2];
            var11 = new int[var3];
            var9 = var11;
            var5 = var9;
            stackIn_13_0 = 0;
            if (var7 != 0) {
              break L0;
            }
            var6 = stackIn_13_0;
            while (var3 > var6) {
              var5[var6] = ba.field_d[ec.a((int) var10[var6], 255)];
              var6++;
            }
            var1[var2] = new wk(un.field_n, eb.field_n, rl.field_a[var2], oa.field_M[var2], le.field_L[var2], ca.field_r[var2], var11);
            var2++;
            continue L0;
          }
          stackIn_13_0 = 9324;
          break;
        }
        uh.a(stackIn_13_0);
        return var1;
    }

    final void a(boolean param0) {
        int stackIn_2_0 = 0;
        int stackIn_2_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        double stackIn_51_0 = 0.0;
        int stackIn_52_1 = 0;
        int stackIn_111_0 = 0;
        int stackIn_114_1 = 0;
        int stackIn_266_0 = 0;
        int stackIn_266_1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        jc var4_ref_jc = null;
        double var5_double = 0.0;
        wl var5_ref_wl = null;
        int var5 = 0;
        int var6 = 0;
        mb var7_ref_mb = null;
        Object var7_ref = null;
        qb var7_ref_qb = null;
        int var7 = 0;
        double var8_double = 0.0;
        int var8_int = 0;
        mb var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        jc var14 = null;
        mb[] var15 = null;
        ie var16 = null;
        mb var17 = null;
        int stackIn_25_0Lifetime1;
        int stackIn_25_1Lifetime1;
        int var7Lifetime1;
        int var8_intLifetime1;
        var13 = SteelSentinels.field_G;
        var2 = 0;
        while (true) {
          stackIn_2_0 = this.field_N;
          stackIn_2_1 = var2;
          boolean decompiledFrameCompleted0 = true;
          boolean decompiledFrameCompleted1 = true;
          if (stackIn_2_0 >= stackIn_2_1) {
            this.field_M = this.field_M + this.field_T;
            this.field_H = this.field_H + this.field_V;
            stackIn_266_0 = ~this.field_Z.field_ab.a((byte) -105, this.field_H >> 4);
            stackIn_266_1 = ~-(this.field_M >> 4);
            if (var13 == 0) {
              if (stackIn_266_0 < stackIn_266_1) {
                this.field_M = -(this.field_Z.field_ab.a((byte) -124, this.field_H >> 4) << 4);
              }
              var3 = this.field_G * this.field_Y / (this.field_z * 2);
              if (var3 == 0 &&
                0 < this.field_Y) {
                var3 = 1;
              }
              this.field_Y = this.field_Y + 1;
              var4 = this.field_Y * this.field_G / (this.field_z * 2);
              if (this.field_I != null &&
                this.field_X != null && (this.field_I.field_C == 7 ||
                this.field_I.field_y == 9) && (this.field_Y & 63) == 0) {
                var14 = new jc(this.field_Z.field_K);
                var6 = 0;
                var7_ref_mb = (mb) (var14.b(2));
                while (var7_ref_mb != null) {
                  stackIn_25_0 = var6;
                  stackIn_25_1 = this.field_X.length;
                  if (stackIn_25_0 == stackIn_25_1) {
                    var15 = this.field_X;
                    this.field_X = new mb[this.field_Z.field_K.b((byte) -128)];
                    ii.a(var15, 0, this.field_X, 0, var6);
                  }
                  this.field_X[var6] = var7_ref_mb;
                  var6++;
                  var7_ref_mb = (mb) (var14.d(2));
                }
                while (true) {
                  stackIn_25_0Lifetime1 = ~var6;
                  stackIn_25_1Lifetime1 = ~this.field_X.length;
                  if (stackIn_25_0Lifetime1 <= stackIn_25_1Lifetime1) {
                    break;
                  }
                  this.field_X[var6] = null;
                  var6++;
                }
              }
              if (var4 == 0) {
                var4 = 1;
              }
              if (!this.field_Z.field_h) {
                while (var4 > var3) {
                  var5_double = 3.141592653589793 * Math.random() * 2.0;
                  var7_ref = null;
                  stackIn_2_0 = 0;
                  stackIn_2_1 = this.field_K;
                  if (stackIn_2_0 == stackIn_2_1) {
                    var8_double = (Math.random() * (double)(-this.field_Y + this.field_z) / 4.0 + (double)this.field_Y) * (double)this.field_U / (double)this.field_z + 1.0;
                    var10 = (int)(var8_double * Math.sin(var5_double)) << 4;
                    var11 = (int)(var8_double * Math.cos(var5_double)) << 4;
                    var7_ref_qb = nk.a(1, 0, this.field_Z, 126, this.field_M + var11 / 2, this.field_R, 150, 0, var10 / 2 + this.field_H, this.field_y);
                    this.field_Z.field_O.a(3, var7_ref_qb);
                    if (10 > this.field_Y) {
                      var12 = 25;
                      var7_ref_qb = nk.a(10, (int)((double)(var12 * var10) / var8_double), this.field_Z, 95, var11 + this.field_M, this.field_R, 100, (int)((double)(var12 * var11) / var8_double), var10 + this.field_H, this.field_y);
                      this.field_Z.field_O.a(3, var7_ref_qb);
                    }
                    var7_ref_qb = nk.a(0, var10 >> 4, this.field_Z, 94, this.field_M + var11 / 2, this.field_R, 300, -(10 * this.field_Y) + (var11 >> 4), var10 / 2 + this.field_H, this.field_y);
                    this.field_Z.field_O.a(3, var7_ref_qb);
                  } else {
                    if (this.field_K != 1) {
                      if (this.field_K == 2) {
                        var8_double = (Math.random() * (double)(this.field_z - this.field_Y) / 4.0 + (double)this.field_Y) * (double)this.field_U / (double)this.field_z;
                        var10 = (int)(Math.sin(var5_double) * var8_double) << 4;
                        var11 = (int)(Math.cos(var5_double) * var8_double) << 4;
                        var7_ref_qb = nk.a(1, 0, this.field_Z, 125, var11 / 2 + this.field_M, this.field_R, 50, 0, this.field_H + var10 / 2, this.field_y);
                        this.field_Z.field_O.a(3, var7_ref_qb);
                        var12 = 0;
                        while (var12 < 5) {
                          var7_ref_qb = nk.a(0, (int)(-64.0 + 128.0 * Math.random()) + (var10 >> 5), this.field_Z, 117, this.field_M + var11 / 2, this.field_R, 200, (var11 >> 5) + (int)(128.0 * Math.random() - 64.0), this.field_H + var10 / 2, this.field_y);
                          var12++;
                        }
                        if (this.field_I.field_y != 32 &&
                          this.field_I.field_y != -2) {
                          fc.a((byte) -69, 91, this.field_H);
                        }
                        this.field_Z.field_O.a(3, var7_ref_qb);
                      } else {
                        if (this.field_K == 3) {
                          var8_double = Math.random() * (double)((this.field_z - this.field_Y) / 4 + this.field_Y) * (double)this.field_U / (double)this.field_z;
                          var10 = (int)(var8_double * Math.sin(var5_double)) << 4;
                          var11 = (int)(Math.cos(var5_double) * var8_double) << 4;
                          var7_ref_qb = nk.a(4, 0, this.field_Z, 95, this.field_M + var11, this.field_R, 100, 0, var10 + this.field_H, this.field_y);
                          this.field_Z.field_O.a(3, var7_ref_qb);
                        } else {
                          if (4 != this.field_K) {
                            if (5 == this.field_K) {
                              var8_double = Math.random() * (double)((this.field_z - this.field_Y) / 4 + this.field_Y) * (double)this.field_U / (double)this.field_z;
                              var10 = (int)(Math.sin(var5_double) * var8_double) << 4;
                              var11 = (int)(var8_double * Math.cos(var5_double)) << 4;
                              var7_ref_qb = nk.a(5, 0, this.field_Z, 104, this.field_M - (-(var11 / 256) + 3584), this.field_R, 100, 0, this.field_H + var10 / 256, this.field_y);
                              this.field_Z.field_O.a(3, var7_ref_qb);
                              var10 = (int)(Math.sin((double)var3 * 0.2) * var8_double) << 4;
                              var11 = (int)(var8_double * Math.cos((double)var3 * 0.2)) << 4;
                              var7_ref_qb = nk.a(5, 0, this.field_Z, 95, this.field_M + var11, this.field_R, 100, 0, this.field_H + var10, this.field_y);
                              this.field_Z.field_O.a(3, var7_ref_qb);
                            } else {
                              if (this.field_K != 6) {
                                if (this.field_K == 7) {
                                  var8_double = Math.random() * (double)((-this.field_Y + this.field_z) / 4 + this.field_Y) * (double)this.field_U / (double)this.field_z;
                                  var10 = (int)(Math.sin(var5_double) * var8_double) << 4;
                                  var11 = (int)(Math.cos(var5_double) * var8_double) << 4;
                                  var7_ref_qb = nk.a(4, 0, this.field_Z, 112, var11 + this.field_M, this.field_R, 100, 0, this.field_H + var10, this.field_y);
                                  this.field_Z.field_O.a(3, var7_ref_qb);
                                } else {
                                  if (8 == this.field_K) {
                                    var8_double = (double)(this.field_Y * this.field_U / this.field_z);
                                    var10 = (int)(var8_double * Math.sin(0.2 * (double)var3)) << 4;
                                    var11 = (int)(var8_double * Math.cos(0.2 * (double)var3)) << 4;
                                    var7_ref_qb = nk.a(5, 0, this.field_Z, 99, this.field_M + var11, this.field_R, 100, 0, var10 + this.field_H, this.field_y);
                                    this.field_Z.field_O.a(3, var7_ref_qb);
                                    var7_ref_qb = nk.a(5, 0, this.field_Z, 113, -var11 + this.field_M, this.field_R, 100, 0, this.field_H - var10, this.field_y);
                                    this.field_Z.field_O.a(3, var7_ref_qb);
                                  } else {
                                    if (this.field_K == 9) {
                                      var8_double = Math.random() * (double)((-this.field_Y + this.field_z) / 4 + this.field_Y) * (double)this.field_U / (double)this.field_z;
                                      stackIn_51_0 = var8_double;
                                      if (Math.sin(var5_double) < 0.0) {
                                        stackIn_52_1 = -1;
                                      } else {
                                        stackIn_52_1 = 1;
                                      }
                                      var10 = (int)(stackIn_51_0 * (double)stackIn_52_1) << 4;
                                      var7_ref_qb = nk.a(0, 0, this.field_Z, 102, 0, this.field_R, 50, 0, this.field_H + var10, this.field_y);
                                      this.field_Z.field_O.a(3, var7_ref_qb);
                                    }
                                  }
                                }
                              } else {
                                var8_double = Math.random() * (double)(this.field_Y + (this.field_z - this.field_Y) / 4) * (double)this.field_U / (double)this.field_z;
                                var10 = (int)(var8_double * Math.sin(var5_double)) << 4;
                                var11 = (int)(Math.cos(var5_double) * var8_double) << 4;
                                var7_ref_qb = nk.a(0, 0, this.field_Z, 111, var11 + this.field_M, this.field_R, 100, 0, var10 + this.field_H, this.field_y);
                                var7_ref_qb.field_O = (int)(2000.0 * -Math.random());
                                this.field_Z.field_O.a(3, var7_ref_qb);
                              }
                            }
                          } else {
                            var8_double = (Math.random() * (double)(-this.field_Y + this.field_z) / 4.0 + (double)this.field_Y) * (double)this.field_U / (double)this.field_z;
                            var10 = (int)(Math.sin(var5_double) * var8_double) << 4;
                            var11 = (int)(Math.cos(var5_double) * var8_double) << 4;
                            var7_ref_qb = nk.a(1, 0, this.field_Z, 114, this.field_M + var11, this.field_R, 150, 0, this.field_H + var10, this.field_y);
                            this.field_Z.field_O.a(3, var7_ref_qb);
                            var7_ref_qb = nk.a(0, var10 >> 5, this.field_Z, 115, this.field_M + var11 / 2, this.field_R, 300, var11 >> 5, this.field_H + var10 / 2, this.field_y);
                            this.field_Z.field_O.a(3, var7_ref_qb);
                          }
                        }
                      }
                    } else {
                      var8_double = Math.random() * (double)((this.field_z - this.field_Y) / 4 + this.field_Y) * (double)this.field_U / (double)this.field_z;
                      var10 = (int)(Math.sin(var5_double) * var8_double) << 4;
                      var11 = (int)(Math.cos(var5_double) * var8_double) << 4;
                      var7_ref_qb = nk.a(3, 0, this.field_Z, 104, this.field_M + var11, this.field_R, 50, 0, var10 + this.field_H, this.field_y);
                      this.field_Z.field_O.a(3, var7_ref_qb);
                    }
                  }
                  var3++;
                }
              }
              var2++;
              continue;
            }
          } else {
            if (param0) {
              return;
            }
            this.field_F = this.field_U * (this.field_Y + (-this.field_Y + this.field_z) / 4) / this.field_z;
            if (this.field_O) {
              var2 = this.field_F * this.field_F;
              var16 = new ie(new int[]{this.field_Z.field_r, this.field_H, this.field_M});
              var4_ref_jc = new jc(this.field_Z.field_db);
              var5_ref_wl = (wl) (var4_ref_jc.b(2));
              while (var5_ref_wl != null) {
                var6 = -var5_ref_wl.field_U + this.field_H >> 4;
                var7 = -var5_ref_wl.field_A + this.field_M >> 4;
                stackIn_266_0 = ~var5_ref_wl.field_C;
                stackIn_266_1 = -3;
                if (var13 != 0) {
                  decompiledFrameCompleted1 = false;
                  break;
                }
                if ((stackIn_266_0 == stackIn_266_1 ||
                  var5_ref_wl.field_C == 3 ||
                  var5_ref_wl.field_C == 20) &&
                  (var5_ref_wl.field_y != 32 &&
                  var2 >= (var7 * var7 + var6 * var6))) {
                  if (null != var5_ref_wl.field_X &&
                    this.field_I.field_X != var5_ref_wl.field_X) {
                    this.field_I.field_X.field_ob = this.field_I.field_X.field_ob + 1;
                  }
                  var5_ref_wl.field_bb = true;
                  if (var5_ref_wl.field_C != 20) {
                    var5_ref_wl.field_T = true;
                  }
                  var5_ref_wl.field_X = this.field_I.field_X;
                }
                if (8 == var5_ref_wl.field_C &&
                  var6 * var6 + var7 * var7 <= var2 &&
                  8 >= var16.a(93, 100)) {
                  var5_ref_wl.field_bb = true;
                  if (null != var5_ref_wl.field_X &&
                    var5_ref_wl.field_X != this.field_I.field_X) {
                    this.field_I.field_X.field_ob = this.field_I.field_X.field_ob + 1;
                  }
                  var5_ref_wl.field_X = this.field_I.field_X;
                }
                var5_ref_wl = (wl) (var4_ref_jc.d(2));
              }
            }
            if (decompiledFrameCompleted1) {
              if (this.field_X != null &&
                this.field_I.field_O > 0) {
                var2 = 0;
                while (this.field_X.length > var2) {
                  var17 = this.field_X[var2];
                  if (var13 != 0) {
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                  L35: {
                    if (var17 != null) {
                      stackIn_111_0 = (this.field_R) ? 0 : 1;
                      if (var17.field_u) {
                        stackIn_114_1 = 0;
                      } else {
                        stackIn_114_1 = 1;
                      }
                      if ((stackIn_111_0 == stackIn_114_1 ||
                        this.field_Z.field_ab.b((byte) 127, var17.field_hc >> 4) == this.field_Z.field_ab.a(false, var17.field_hc >> 4)) && (var17.field_o == -1 ||
                        this.field_I.field_y == var17.field_o ||
                        var13 != 0)) {
                        var4 = this.field_H - var17.field_hc >> 4;
                        var5 = 768 + (-var17.field_Gb + this.field_M) >> 4;
                        if (Math.abs(var4) <= this.field_F &&
                          this.field_F * this.field_F >= var4 * var4 + var5 * var5) {
                          if (9 == this.field_I.field_C &&
                            this.field_I.field_X != null) {
                            if (1 == this.field_I.field_X.field_fb) {
                              var17.field_ab = var17.field_ab - 80000 / var17.field_Eb;
                              var17.field_K = var17.field_K + 400000 * this.field_I.field_X.field_E / var17.field_Eb;
                            }
                            if (2 == this.field_I.field_X.field_fb) {
                              if (this.field_I.field_X.field_hc <= var17.field_hc) {
                                var17.field_K = var17.field_K + 200000 / var17.field_Eb;
                              }
                              var17.field_ab = var17.field_ab - 200000 / var17.field_Eb;
                              if (var17.field_hc < this.field_I.field_X.field_hc) {
                                var17.field_K = var17.field_K - 200000 / var17.field_Eb;
                              }
                            }
                            if (this.field_I.field_X.field_fb == 3) {
                              var17.field_ab = var17.field_ab - 160000 / var17.field_Eb;
                              var17.field_K = var17.field_K + 80000 * this.field_I.field_X.field_E / var17.field_Eb;
                            }
                          }
                          this.field_X[var2] = null;
                          var6 = ik.a(var5 * var5 + var4 * var4, -117);
                          if (var6 > this.field_U / 2 &&
                            this.field_I.field_C != 9) {
                            var7Lifetime1 = this.field_I.field_O * (this.field_U - var6) / (this.field_U / 2);
                            if (1 > var7Lifetime1) {
                              var7Lifetime1 = 1;
                            }
                          } else {
                            var7Lifetime1 = this.field_I.field_O;
                          }
                          if (this.field_I.field_C == 9) {
                            var7Lifetime1 = this.field_I.field_O;
                            var17.field_S = var17.field_S - this.field_I.field_kb;
                            if (this.field_I.field_kb > var17.field_mc &&
                              var17.h(-128)) {
                              var17.field_mc = this.field_I.field_kb;
                            }
                            if (this.field_I.field_kb > 0 &&
                              var17.field_Tb > 0 &&
                              var17.h(-122)) {
                              var17.a(true, Math.min(var17.field_Tb, this.field_I.field_kb / 50));
                            }
                            if (var17.field_S < 0) {
                              var17.field_S = 0;
                            }
                            if (0 < var17.field_rb) {
                              var17.a((byte) 40, this.field_I);
                            }
                            if (!(var17.field_rb > 0) ||
                              this.field_I.field_X == null) {
                              if (!(var17.field_rb <= 0) &&
                                null == this.field_I.field_X &&
                                !(var17.field_z > 0)) {
                                var17.e(128, var7Lifetime1);
                              }
                            } else {
                              var8_int = var7Lifetime1;
                              if (var8_int > var17.field_rb) {
                                var8_int = var17.field_rb;
                              }
                              if (var8_int < 0) {
                                var8_int = 0;
                              }
                              boolean decompiledFrameRemainder0 = true;
                              if (var17.field_Nb != 8 &&
                                var17.field_z <= 0) {
                                if (~this.field_I.field_X.field_jc == ~var17.field_jc) {
                                  if ((this.field_I.field_X != var17)) {
                                    this.field_I.field_X.b(-(this.field_Z.field_l * (var8_int * var17.field_lb / var17.field_Eb)), 26511);
                                  }
                                  decompiledFrameRemainder0 = false;
                                }
                                else {
                                  this.field_I.field_X.b(this.field_Z.field_l * (var8_int * var17.field_lb / var17.field_Eb), 26511);
                                  this.field_I.field_X.field_Ac = this.field_I.field_X.field_Ac + var8_int;
                                }
                              }
                              if (var17.field_z <= 0) {
                                var17.e(128, var7Lifetime1);
                              }
                            }
                            if ((!(!var17.field_Lb)) &&
                              (!(var17.i(29, -27)))) {
                              var17.field_Dc = 200;
                            }
                            break L35;
                          }
                          var17.field_S = var17.field_S - var7Lifetime1 * this.field_I.field_kb / this.field_I.field_O;
                          if (var17.field_S < 0) {
                            var17.field_S = 0;
                          }
                          if (0 < var17.field_S) {
                            fc.a((byte) 114, 27, this.field_H);
                          }
                          var17.field_S = var17.field_S - var7Lifetime1;
                          var17.field_P = 100;
                          if (0 > var17.field_S) {
                            if (this.field_I.field_C != 1 &&
                              this.field_I.field_C != 2 &&
                              this.field_I.field_C != 3 &&
                              this.field_I.field_C != 20) {
                              fc.a((byte) 91, 55, this.field_H);
                            } else {
                              fc.a((byte) -100, 51, this.field_H);
                              var8_intLifetime1 = var17.h(0, 33);
                              var17.field_S = var17.field_S >> var8_intLifetime1;
                            }
                            if (var17.field_rb > 0) {
                              var17.a((byte) 68, this.field_I);
                            }
                            if (var17.field_rb > 0 &&
                              this.field_I.field_X != null) {
                              var8 = this.field_I.field_X;
                              if (this.field_I.field_X != this.field_I.field_G &&
                                null != this.field_I.field_G && (~this.field_I.field_G.field_jc != ~this.field_I.field_X.field_jc &&
                                var17.field_jc == this.field_I.field_X.field_jc ||
                                var17 == this.field_I.field_X)) {
                                var8 = this.field_I.field_G;
                              }
                              var9 = -var17.field_S;
                              if (var17.field_rb < var9) {
                                var9 = var17.field_rb;
                              }
                              if (0 > var9) {
                                var9 = 0;
                              }
                              if (var17.field_Nb != 8 &&
                                var17.field_z <= 0) {
                                if (var17.field_jc != var8.field_jc) {
                                  var8.b(this.field_Z.field_l * (var17.field_lb * var9 / var17.field_Eb), 26511);
                                  var8.field_Ac = var8.field_Ac + var9;
                                } else {
                                  if (var17 != var8) {
                                    var8.b(-(this.field_Z.field_l * (var17.field_lb * var9 / var17.field_Eb)), 26511);
                                  }
                                }
                              }
                              if (var17.field_z <= 0) {
                                var17.e(128, -var17.field_S);
                                if (var17.field_rb <= 0 &&
                                  var17.field_Nb != 8 &&
                                  this.field_I.field_bb &&
                                  this.field_I.field_G != var8 &&
                                  ~var8.field_jc != ~var17.field_jc) {
                                }
                                if (var17.field_rb <= 0 && (var17.field_Nb == 0 ||
                                  11 == var17.field_Nb) && (32 == this.field_I.field_y &&
                                  this.field_I.field_G == var8)) {
                                  var8.field_y = var8.field_y + 1;
                                }
                              }
                            } else {
                              if (0 < var17.field_rb &&
                                this.field_I.field_X == null &&
                                var17.field_z <= 0) {
                                var17.e(128, -var17.field_S);
                              }
                            }
                            if (var17.h(-122) &&
                              var17.field_mc < var7Lifetime1 * this.field_I.field_kb / this.field_I.field_O) {
                              var17.field_mc = this.field_I.field_kb * var7Lifetime1 / this.field_I.field_O;
                            }
                            if (var7Lifetime1 * this.field_I.field_kb / this.field_I.field_O > 0 &&
                              var17.field_Tb > 0 &&
                              var17.h(-122)) {
                              var17.a(true, Math.min(var17.field_Tb, var7Lifetime1 * this.field_I.field_kb / this.field_I.field_O / 50));
                            }
                            if (var17.i(26, -27) &&
                              var17.field_S < 0) {
                              var17.field_S = Math.min(-var17.field_S, var17.field_Q);
                            } else {
                              var17.field_S = 0;
                            }
                            if (var17.field_Lb &&
                              !var17.i(29, -27) &&
                              3 != di.field_g) {
                              var17.field_Dc = 200;
                            }
                          }
                        }
                      }
                    }
                  }
                  var2++;
                }
              }
              if (decompiledFrameCompleted0) {
                stackIn_266_0 = ~this.field_N;
                stackIn_266_1 = -1;
              }
            }
          }
          if ((decompiledFrameCompleted0) &&
            (stackIn_266_0 < stackIn_266_1)) {
            this.field_N = this.field_N - 1;
          }
          if (this.field_z < this.field_Y) {
            this.field_Z.field_J.a((byte) 82, (kd) (this));
          }
          return;
        }
    }

    public static void h(int param0) {
        field_S = null;
        field_L = null;
        field_Q = null;
        field_J = null;
        field_C = null;
        field_E = null;
        if (param0 != -2107133436) {
          field_P = -126;
        }
        field_W = null;
        field_D = null;
        field_B = null;
        field_A = null;
    }

    final static void c(byte param0) {
        kc.field_y = null;
        int var1 = -122 / ((-17 - param0) / 41);
    }

    jb(int param0, int param1, int param2, int param3, int param4, ee param5, mb[] param6, wl param7) {
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9 = null;
        try {
          this.field_X = param6;
          this.field_T = param3;
          this.field_z = param4;
          this.field_V = param2;
          this.field_H = param0;
          this.field_Z = param5;
          this.field_Y = 0;
          this.field_I = param7;
          this.field_M = param1;
          this.field_y = this.field_H;
          if (null != this.field_I) {
            this.field_R = this.field_I.field_ob;
          }
          this.field_K = 0;
          this.field_G = 5;
          this.field_N = 5;
          if (this.field_z < 1) {
            this.field_z = 1;
          }
          this.field_U = 64;
          this.field_F = this.field_U * (this.field_Y + (this.field_z - this.field_Y) / 4) / this.field_z;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_9_0 = var9;
          stackIn_9_1 = new StringBuilder().append("jb.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param6 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param7 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    static {
        field_P = 0;
        field_E = "<col=156080>SOLARITE CUBES: </col>";
        field_Q = "Names cannot contain consecutive spaces";
        field_W = "Type your password again to make sure it's correct";
        field_A = new ul();
        field_D = new fm(6, 0, 4, 2);
    }
}
