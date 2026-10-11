/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wl extends kd {
    boolean field_bb;
    int field_C;
    private boolean field_gb;
    private int field_L;
    mb field_X;
    boolean field_W;
    int field_A;
    mb[] field_fb;
    private int field_cb;
    int field_F;
    boolean field_ab;
    int field_kb;
    private ee field_B;
    private boolean field_P;
    boolean field_ob;
    mb field_nb;
    boolean field_I;
    static rf field_N;
    int field_U;
    private int field_Q;
    boolean field_E;
    int field_M;
    int field_Z;
    private boolean field_mb;
    static String field_Y;
    int field_K;
    int field_eb;
    private boolean field_H;
    boolean field_V;
    private int field_ib;
    static String field_R;
    int field_O;
    int field_hb;
    int field_y;
    static boolean field_lb;
    static int field_D;
    static byte[] field_db;
    int field_z;
    static gh field_J;
    int field_S;
    int field_jb;
    mb field_G;
    boolean field_T;

    private final boolean g(int param0, int param1) {
        int var3;
        qb var4;
        if (param0 < 80) {
          this.field_T = false;
        }
        boolean decompiledFrameRemainder0 = true;
        this.g(1354276);
        if (10 != this.field_y &&
          this.field_y != 21) {
          this.field_H = false;
          this.field_L = 32;
          if (this.field_y == 35 &&
            !this.field_V &&
            !this.field_B.field_h &&
            (3 & param1 + this.field_Z) == 0 &&
            0 == (this.field_hb & 7)) {
            var3 = 5 - Math.abs(-50 + this.field_hb) / 10;
            var4 = nk.a(14, (int)((double)(-this.field_F) * ((double)(-var3) + Math.random() * (double)(var3 * 2))), this.field_B, 87, this.field_A, this.field_ob, 8, (int)((double)this.field_eb * ((double)(-var3) + (double)(var3 * 2) * Math.random())), this.field_U, this.field_U);
            this.field_B.field_O.a(3, var4);
          }
          if (this.field_y == 35 &&
            !this.field_V &&
            this.field_Z == 8 &&
            (7 & this.field_hb) != 0) {
            this.field_B.field_J.a((byte) 44, (kd) (this));
            return true;
          }
          if (this.field_y != 30) {
            return false;
          }
          decompiledFrameRemainder0 = (this.field_Z == 4);
          if ((decompiledFrameRemainder0) &&
            (decompiledFrameRemainder0 = ((this.field_hb & 3) != 0))) {
            if (!this.field_I) {
              this.field_B.field_J.a((byte) 74, (kd) (this));
            } else {
              this.field_T = true;
            }
            return true;
          }
        }
        if (decompiledFrameRemainder0) {
          this.field_L = 32;
        }
        return false;
    }

    final void a(int param0, int param1, int param2) {
        boolean discarded$0 = false;
        int stackIn_94_0 = 0;
        int stackIn_94_1 = 0;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        nk var8_ref_nk;
        int var9;
        int[] var10;
        int var10_int;
        int var11;
        int[] var11_ref_int__;
        int var12;
        int var13;
        int var14;
        int[] var15;
        int var16_int;
        double var16;
        double var18;
        int var20;
        int var21;
        int var22;
        int[] var23;
        int[] var24;
        int[] var25;
        int[] var26;
        int var16_intLifetime1;
        int stackIn_94_0Lifetime1;
        int stackIn_94_1Lifetime1;
        int var16_intLifetime1Lifetime1;
        int var16_intLifetime1Lifetime2;
        int var16_intLifetime1Lifetime3;
        var22 = SteelSentinels.field_G;
        var4 = param1 + (this.field_U >> 8);
        var5 = param0 + (this.field_A >> 8);
        var6 = 8;
        var7 = (int)(65536.0 * Math.atan2((double)(-this.field_eb), (double)(-this.field_F)) / 6.283185307179586);
        if (19 == this.field_C) {
          pb.b(var4, var5, 100, 16777215, 16);
        }
        if (param2 != 4) {
          discarded$0 = this.g(-67, 19);
        }
        if (this.field_C >= 12 &&
          16 >= this.field_C) {
          if (this.field_eb != 1) {
            sb.field_W.a(-(sb.field_W.field_z / 2) + var4, -(sb.field_W.field_B / 2) + var5);
          } else {
            hb.field_e.a(var4 - sb.field_W.field_z / 2, var5 - sb.field_W.field_B / 2);
          }
        }
        if (var4 < -32) {
          return;
        }
        if (672 >= var4 &&
          var5 >= -32 &&
          672 >= var5) {
          if (this.field_C != 2) {
            if (this.field_C != 4) {
              if (this.field_C == 6) {
                var8 = 2000;
                var9 = var8 >> 7;
                var26 = new int[1024];
                var24 = var26;
                var10 = var24;
                var11 = 0;
                while (true) {
                  if (var11 < 512) {
                    var12 = var11 / 6;
                    var13 = var11 / 5;
                    var14 = var11 / 4;
                    stackIn_94_0 = ~var11;
                    stackIn_94_1 = -449;
                    if (stackIn_94_0 < stackIn_94_1) {
                      var14 = var14 + 4 * (-192 + var11 - 256) / 2;
                      var13 = var13 + (-256 + (var11 - 192)) * 4 / 3;
                      var12 = var12 + (var11 - 192 - 256) * 4 / 4;
                    }
                    if (var14 > 255) {
                      var14 = 255;
                    }
                    if (var13 > 255) {
                      var13 = 255;
                    }
                    if (255 < var12) {
                      var12 = 255;
                    }
                    var10[var11] = var12 * 65536 - (-(256 * var13) - 1 * var14);
                    var11++;
                    continue;
                  }
                  qh.b(10000, var5 << 4, 15, var4 << 4, var9 << 4);
                  pb.a(var4 << 4, var5 << 4, var9 << 4, 500, var26);
                  stackIn_94_0Lifetime1 = ~this.field_y;
                  stackIn_94_1Lifetime1 = -19;
                  if (stackIn_94_0Lifetime1 == stackIn_94_1Lifetime1) {
                    var11 = (int)(Math.cos(0.2 * (double)this.field_Z) * 150.0);
                    var12 = (int)(Math.sin((double)this.field_Z * 0.2) * 150.0);
                    pb.a((var4 << 4) + var11, var12 + (var5 << 4), var9 << 3, 250, var26);
                    pb.a((var4 << 4) - var11, (var5 << 4) - var12, var9 << 3, 250, var26);
                    break;
                  }
                  if (this.field_y != 31) {
                    break;
                  }
                  var11 = (int)(Math.cos((double)this.field_Z * 0.2) * 150.0);
                  var12 = (int)(150.0 * Math.sin(0.2 * (double)this.field_Z));
                  pb.a(var11 + (var4 << 4), (var5 << 4) + var12, var9 << 3, 250, var26);
                  pb.a((var4 << 4) - var11, -var12 + (var5 << 4), var9 << 3, 250, var26);
                  var11 = var11 * 2;
                  var12 = var12 * 2;
                  pb.a(var12 + (var4 << 4), (var5 << 4) - var11, var9 << 3, 250, var26);
                  pb.a(-var12 + (var4 << 4), (var5 << 4) + var11, var9 << 3, 250, var26);
                  return;
                }
              }
            } else {
              if (this.field_L != 32) {
                var8 = 120;
                var9 = 49;
                var10_int = 1114111;
                var11_ref_int__ = pe.field_o;
                if (this.field_y == 17) {
                  var8 = 120;
                  var10_int = 8978431;
                }
                if (this.field_y == 30) {
                  var8 = 120;
                  var10_int = 16777215;
                }
                if (this.field_y == 35) {
                  var8 = 180;
                  var11_ref_int__ = pe.field_N;
                  var9 = 99;
                }
                if (this.field_y == 21) {
                  var11_ref_int__ = pe.field_N;
                  var8 = 96;
                }
                if (this.field_y == 10) {
                  var8 = 64;
                  var11_ref_int__ = pe.field_N;
                }
                if (this.field_y != 21 &&
                  this.field_y != 10) {
                  var8 = var8 * 2;
                  var8 = var8 - 32 * this.field_Z;
                  if (var8 < 0) {
                    var8 = 0;
                  }
                }
                var12 = var8 >> 5;
                var13 = -((this.field_L + 2) * this.field_eb >> 4);
                var14 = -((this.field_L + 2) * this.field_F >> 4);
                if (var12 < 2) {
                  var12 = 2;
                }
                if (this.field_y == 17) {
                  var14 = var14 / 2;
                  var13 = var13 / 2;
                }
                if (ka.field_V &&
                  3 > var12) {
                  var12 = 3;
                }
                var25 = new int[var12];
                var23 = var25;
                var15 = var23;
                for (var16_int = 0; var16_int < var25.length; var16_int++) {
                  var15[var16_int] = var11_ref_int__[var16_int * (127 * this.field_hb / var9) / var25.length];
                }
                if (this.field_y != 21) {
                  if (this.field_y == 17) {
                    var5 = var5 << 4;
                    var4 = var4 << 4;
                    var13 = var13 >> 2;
                    var14 = var14 >> 2;
                    for (var16_intLifetime1 = 15; var16_intLifetime1 > 0; var16_intLifetime1--) {
                      pb.a(var4, var5, 32 + var16_intLifetime1 * 3, 2 * var16_intLifetime1 + 1, hc.field_W);
                      var5 = var5 + var14;
                      var4 = var4 + var13;
                    }
                    return;
                  }
                  if (this.field_y == 10) {
                    var5 = var5 << 4;
                    var14 = var14 >> 3;
                    var4 = var4 << 4;
                    var13 = var13 >> 3;
                    for (var16_intLifetime1Lifetime1 = 15; var16_intLifetime1Lifetime1 > 0; var16_intLifetime1Lifetime1--) {
                      pb.a(var4, var5, 32 + var16_intLifetime1Lifetime1 * 3, 1 + var16_intLifetime1Lifetime1 * 2, hc.field_eb);
                      var5 = var5 + var14;
                      var4 = var4 + var13;
                    }
                    return;
                  }
                  if (35 == this.field_y &&
                    this.field_Z > 8) {
                    var14 = var14 >> 3;
                    var5 = var5 << 4;
                    var4 = var4 << 4;
                    var13 = var13 >> 3;
                    for (var16_intLifetime1Lifetime2 = 15; var16_intLifetime1Lifetime2 > 0; var16_intLifetime1Lifetime2--) {
                      pb.a(var4, var5, 32 + var16_intLifetime1Lifetime2 * 3, var16_intLifetime1Lifetime2 * 2 + 1, hc.field_eb);
                      var4 = var4 + var13;
                      var5 = var5 + var14;
                    }
                    return;
                  }
                  if (this.field_y == 30 &&
                    this.field_Z > 4) {
                    var13 = var13 >> 3;
                    var14 = var14 >> 3;
                    var4 = var4 << 4;
                    var5 = var5 << 4;
                    for (var16_intLifetime1Lifetime3 = 15; 0 < var16_intLifetime1Lifetime3; var16_intLifetime1Lifetime3--) {
                      pb.a(var4, var5, 32 + var16_intLifetime1Lifetime3 * 3, 1 + 2 * var16_intLifetime1Lifetime3, hc.field_W);
                      var4 = var4 + var13;
                      var5 = var5 + var14;
                    }
                    return;
                  }
                  if (2 < var12) {
                    this.a(var14, var5, param2 - 3, var12, var13, var4, var10_int, var25);
                    return;
                  }
                  pb.f(var4, var5, (var13 >> 4) + var4, (var14 >> 4) + var5, var10_int, 192);
                  return;
                }
                var16 = 0.5 * Math.random() + 0.25;
                var18 = 0.5 * Math.random() - 0.25;
                var20 = (int)(var16 * (double)var13 + var18 * (double)var14);
                var21 = (int)((double)var14 * var16 - (double)var13 * var18);
                this.a(var14, var5, 1, var12 - 1, var13, var4, var10_int, var25);
                this.a(var21, var5, 1, var12, var20, var4, var10_int, var25);
                this.a(var14 - var21, var5 + var21 / 16, 1, var12, -var20 + var13, var4 + var20 / 16, var10_int, var25);
                return;
              }
            }
          } else {
            var8_ref_nk = ul.a(17 + this.field_y, (byte) 67);
            if (var8_ref_nk != null) {
              var8_ref_nk.field_R.a(var8_ref_nk.field_R.field_g << 3, var8_ref_nk.field_R.field_d << 3, var4 << 4, var5 << 4, var7, 1024);
              if (this.field_y == 32) {
                var9 = 3 * var6 / 2;
                b.field_n[0 + this.field_B.field_r / 10 % 6].d(-(this.field_eb >> 6) - var9 + var4, -(this.field_F >> 6) + var5 - var9, var9 * 2, var9 * 2, 192);
              }
            }
          }
          return;
        }
    }

    private final void a(int param0, int param1) {
        int var3 = 0;
        mb var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        double var10;
        double var12;
        double var14;
        double var16;
        double var18;
        double var20;
        double var22;
        double var24;
        int var26;
        int var9Lifetime1;
        int var9Lifetime2;
        var26 = SteelSentinels.field_G;
        if (param0 < 78) {
          return;
        }
        for (var3 = 0; this.field_fb.length > var3; var3++) {
          boolean decompiledFrameRemainder0 = true;
          var4 = this.field_fb[var3];
          if (var4 != null && (this.field_X != var4 ||
            this.field_C != 7)) {
            var5 = this.field_U - var4.field_hc;
            var6 = (var4.field_Db << 3) + (-var4.field_Gb + this.field_A);
            if (Math.abs(var5) <= (var4.field_Ub << 3) &&
              Math.abs(var6) <= var4.field_Db << 3 && (var4 != this.field_X ||
              this.field_Z > 10) && var4.field_rb > 0) {
              var7 = this.field_O * this.field_eb * this.field_L / (10 * var4.field_Eb);
              var8 = this.field_L * this.field_O * this.field_eb / (var4.field_Eb * 10);
              if (0 == this.field_C ||
                this.field_C == 5) {
                var8 = var8 / 2;
                var7 = var7 / 2;
              }
              if ((14 == this.field_y ||
                this.field_y == 28) &&
                20 > this.field_Z) {
                var8 = 0;
                var7 = 0;
              }
              if (var4.i(31, -27) &&
                !var4.field_Lb) {
                var8 = var8 / 2;
                var7 = var7 / 2;
              }
              if (var4.i(29, -27) &&
                var4.field_Lb) {
                var7 = var7 / 2;
                var8 = var8 / 2;
              }
              if (var4.field_Zb.field_N == 109) {
                var8 = 0;
                var7 = 0;
              }
              if (var4.field_z > 0) {
                var8 = 0;
                var7 = 0;
              }
              if (this.field_C != 4 &&
                0 == var4.field_oc) {
                var4.field_ab = var4.field_ab + var8;
                var4.field_K = var4.field_K + var7;
              }
              this.field_T = true;
              if (!this.field_gb &&
                this.field_X != null) {
                if ((this.field_C == 2 ||
                  this.field_C == 1) &&
                  (var4.field_Lb &&
                  var4.field_Rb <= 0)) {
                }
                if (3 == this.field_C &&
                  var4.field_Lb &&
                  var4.field_Rb > 0) {
                }
                this.field_gb = true;
                if (2 == this.field_C) {
                  this.field_X.field_p = this.field_X.field_p + 1;
                }
              }
              if ((0 != var7 ||
                var8 != 0) &&
                !var4.field_Lb) {
                var4.field_Rb = 25;
              }
              this.field_fb[var3] = null;
              if (-1 == var4.field_o ||
                ~var4.field_o == ~this.field_y) {
                var4.field_S = var4.field_S - this.field_kb;
                if (this.field_kb > 0 &&
                  var4.field_Tb > 0 &&
                  var4.h(-126)) {
                  var4.a(true, Math.min(this.field_kb / 50, var4.field_Tb));
                }
                var4.field_P = 100;
                if (var4.field_S < 0) {
                  var4.field_S = 0;
                }
                if (4 != this.field_C &&
                  6 != this.field_C &&
                  7 != this.field_C) {
                  if (0 < var4.field_rb &&
                    var4.field_z <= 0) {
                    var4.a((byte) 76, this);
                  }
                  if (0 < var4.field_rb &&
                    this.field_X != null) {
                    if (this.field_C != 7 &&
                      this.field_C != 0 &&
                      5 != this.field_C) {
                      if (this.field_C != 1 &&
                        this.field_C != 2 &&
                        this.field_C != 3 &&
                        this.field_C != 20) {
                        fc.a((byte) -128, 55, this.field_U);
                      } else {
                        fc.a((byte) -74, 51, this.field_U);
                        var9 = var4.h(0, 33);
                        this.field_O = this.field_O >> var9;
                      }
                    } else {
                      fc.a((byte) 41, 49, this.field_U);
                      var9 = var4.h(0, 32);
                      this.field_O = this.field_O >> var9;
                    }
                    if (this.field_y == 15 &&
                      this.field_jb <= this.field_Z &&
                      this.field_E) {
                      this.field_O = this.field_O * 4;
                    }
                    if ((this.field_y == 14 ||
                      this.field_y == 28) &&
                      this.field_Z < 20) {
                      this.field_O = this.field_O / 4;
                    }
                    if (var4.field_z <= 0 &&
                      var4.field_rb > 0) {
                      var4.e(128, this.field_O);
                      if (this.field_y == 32 &&
                        0 >= var4.field_rb && (var4.field_Nb == 0 ||
                        var4.field_Nb == 11) && this.field_X != null) {
                        this.field_X.field_y = this.field_X.field_y + 1;
                      }
                    }
                    var9Lifetime2 = this.field_O;
                    if (var9Lifetime2 > var4.field_rb) {
                      var9Lifetime2 = var4.field_rb;
                    }
                    if (var9Lifetime2 < 0) {
                      var9Lifetime2 = 0;
                    }
                    if (var4.i(26, -27)) {
                      var4.field_S = Math.min(var4.field_Q, var4.field_S + var9Lifetime2);
                    }
                    if (8 != var4.field_Nb) {
                      if (var4.field_jc == this.field_X.field_jc) {
                        if (var4.field_z <= 0 &&
                          this.field_X != var4) {
                          this.field_X.b(-(this.field_B.field_l * (var9Lifetime2 * var4.field_lb / var4.field_Eb)), 26511);
                        }
                      } else {
                        if (var4.field_z <= 0) {
                          this.field_X.b(this.field_B.field_l * (var4.field_lb * var9Lifetime2 / var4.field_Eb), 26511);
                          this.field_X.field_Ac = this.field_X.field_Ac + var9Lifetime2;
                        }
                        if (!this.field_V &&
                          this.field_jb <= this.field_Z && (null == this.field_nb ||
                          3 != this.field_C)) {
                          this.field_X.field_db = this.field_X.field_db + 1;
                          if (0 <= this.field_X.field_q) {
                            this.field_X.field_q = 100;
                          }
                        }
                      }
                    }
                    if (var9Lifetime2 <= 0 &&
                      var4.field_rb > 0 ||
                      38 == var4.field_rc) {
                      this.field_gb = false;
                      this.field_T = false;
                      if (var5 == 0 &&
                        var6 == 0) {
                        this.field_F = -this.field_F / 2;
                        this.field_eb = -this.field_eb / 2;
                      } else {
                        var10 = Math.abs((double)var4.field_Ub / (double)var4.field_Db);
                        var12 = (double)var5 * var10;
                        var14 = (double)var6;
                        var16 = Math.sqrt(var12 * var12 + var14 * var14);
                        if (0.0 != var16) {
                          var14 = var14 / var16;
                          var12 = var12 / var16;
                        }
                        var18 = -var14;
                        var20 = var12;
                        var22 = (double)this.field_eb * var12 + var14 * (double)this.field_F;
                        var24 = (double)this.field_F * var20 + var18 * (double)this.field_eb;
                        var24 = -var24;
                        this.field_eb = (int)(var22 * var12 + var24 * var18);
                        this.field_F = (int)(var22 * var14 + var24 * var20);
                        this.field_eb = this.field_eb / 2;
                        this.field_F = this.field_F / 2;
                      }
                      this.field_O = this.field_O / 2;
                    }
                  } else {
                    if (var4.field_rb > 0 &&
                      this.field_X == null &&
                      0 >= var4.field_z) {
                      var4.e(128, this.field_O);
                    }
                  }
                  if (this.field_kb > var4.field_mc &&
                    var4.h(-125)) {
                    var4.field_mc = this.field_kb;
                  }
                  if ((!(!var4.field_Lb)) &&
                    (!(var4.i(29, -27)))) {
                    var4.field_Dc = 200;
                  }
                  decompiledFrameRemainder0 = false;
                }
                else {
                  if (0 < var4.field_S) {
                    fc.a((byte) -99, 27, this.field_U);
                  }
                  var4.field_S = var4.field_S - this.field_O;
                  if (var4.field_S < 0) {
                    fc.a((byte) 41, 50, this.field_U);
                    if (var4.field_rb > 0 &&
                      var4.field_z <= 0) {
                      var4.a((byte) 125, this);
                    }
                    if (var4.field_rb > 0 &&
                      null != this.field_X) {
                      var9Lifetime1 = -var4.field_S;
                      if (var4.field_rb < var9Lifetime1) {
                        var9Lifetime1 = var4.field_rb;
                      }
                      if (var9Lifetime1 < 0) {
                        var9Lifetime1 = 0;
                      }
                      if (var4.field_Nb != 8 &&
                        var4.field_z <= 0) {
                        if (var4.field_jc == this.field_X.field_jc) {
                          if (this.field_X != var4) {
                            this.field_X.b(-(this.field_B.field_l * (var9Lifetime1 * var4.field_lb / var4.field_Eb)), 26511);
                          }
                        } else {
                          this.field_X.field_Ac = this.field_X.field_Ac + var9Lifetime1;
                          this.field_X.b(this.field_B.field_l * (var9Lifetime1 * var4.field_lb / var4.field_Eb), 26511);
                        }
                      }
                      if (!(var4.field_z > 0)) {
                        var4.e(128, -var4.field_S);
                        if (var4.field_rb <= 0 &&
                          this.field_y == 32 && (var4.field_Nb == 0 ||
                          var4.field_Nb == 11)) {
                          this.field_X.field_y = this.field_X.field_y + 1;
                        }
                        if (var4.i(26, -27) &&
                          var4.field_S < 0) {
                          var4.field_S = Math.min(-var4.field_S, var4.field_Q);
                        } else {
                          var4.field_S = 0;
                        }
                      }
                    } else {
                      if (var4.field_rb > 0 &&
                        null == this.field_X) {
                        if (var4.field_z <= 0) {
                          var4.e(128, -var4.field_S);
                        }
                        if (var4.i(26, -27) &&
                          0 > var4.field_S) {
                          var4.field_S = Math.min(-var4.field_S, var4.field_Q);
                        } else {
                          var4.field_S = 0;
                        }
                      }
                    }
                    if (this.field_kb > var4.field_mc &&
                      var4.h(-125)) {
                      var4.field_mc = this.field_kb;
                    }
                    if (var4.field_Lb &&
                      !var4.i(29, -27)) {
                      var4.field_Dc = 200;
                    }
                  }
                }
              }
            }
          }
        }
        return;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        if (param3 > -93) {
          return;
        }
        this.a(param1, param0, param2, true, param4, (byte) -114);
    }

    final static int a(int[] param0, int param1, boolean param2, nk param3) {
        int var5 = 0;
        int incrementValue$1 = 0;
        qd[] var4 = null;
        RuntimeException var4_ref = null;
        int var6 = 0;
        qd[] var7 = null;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        qd[] var4Lifetime1;
        var6 = SteelSentinels.field_G;
        try {
          var4 = new qd[]{};
          var7 = param3.a(var4, -21636, -1);
          var4Lifetime1 = var7;
          for (var5 = 0; var5 < var7.length; var5++) {
            if (var7[var5] != null &&
              -1 != var7[var5].field_q) {
              incrementValue$1 = param1;
              param1++;
              param0[incrementValue$1] = ec.a(var7[var5].field_q, 1008);
            }
          }
          if (!param2) {
            field_J = (gh) null;
          }
          stackIn_11_0 = param1;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_14_0 = var4_ref;
          stackIn_14_1 = new StringBuilder().append("wl.O(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    private final void a(int param0, int param1, int param2, boolean param3, int param4, byte param5) {
        jb stackIn_27_0;
        jb stackIn_27_1;
        int stackIn_27_2;
        int stackIn_27_3;
        int stackIn_27_4;
        int stackIn_27_5;
        int stackIn_27_6;
        ee stackIn_27_7;
        jb stackIn_28_0 = null;
        jb stackIn_28_1 = null;
        mb[] stackIn_28_8 = null;
        jb var7;
        int var8;
        var8 = SteelSentinels.field_G;
        if (this.field_I) {
          this.field_T = true;
        }
        if (this.field_X != null &&
          this.field_X.field_rc == 41) {
          param4 = param4 * 2;
          param0 = param0 * 2;
          param1 = param1 * 4;
        }
        if (this.field_V) {
          return;
        }
        if (this.field_I) {
          return;
        }
        if (this.field_y != 32 &&
          this.field_y != -2) {
          if (this.field_y != 8) {
            if (50 > param4) {
              fc.a((byte) 92, 86, this.field_U);
            } else {
              if (100 <= param4) {
                if (param4 >= 150) {
                  if (param4 >= 200) {
                    if (param4 >= 250) {
                      fc.a((byte) -102, 54, this.field_U);
                    } else {
                      fc.a((byte) -120, 53, this.field_U);
                    }
                  } else {
                    fc.a((byte) -103, 89, this.field_U);
                  }
                } else {
                  fc.a((byte) -89, 88, this.field_U);
                }
              } else {
                fc.a((byte) 69, 87, this.field_U);
              }
            }
          } else {
            fc.a((byte) 27, 17, this.field_U);
          }
        }
        stackIn_27_0 = null;
        stackIn_27_1 = null;
        stackIn_27_2 = this.field_U;
        stackIn_27_3 = this.field_A;
        stackIn_27_4 = 0;
        stackIn_27_5 = 0;
        stackIn_27_6 = param4;
        stackIn_27_7 = this.field_B;
        if (!param3) {
          stackIn_28_0 = null;
          stackIn_28_1 = null;
          stackIn_28_8 = null;
        } else {
          stackIn_28_0 = null;
          stackIn_28_1 = null;
          stackIn_28_8 = this.field_fb;
        }
        var7 = new jb(stackIn_27_2, stackIn_27_3, stackIn_27_4, stackIn_27_5, stackIn_27_6, stackIn_27_7, stackIn_28_8, this);
        if (param5 >= -96) {
          this.field_G = (mb) null;
        }
        var7.field_G = param1;
        var7.field_U = param0;
        var7.field_O = this.field_W;
        var7.field_K = param2;
        this.field_B.field_u.a(3, var7);
        return;
    }

    final static java.applet.Applet d(byte param0) {
        if (fb.field_o != null) {
          return fb.field_o;
        }
        if (param0 != -21) {
          field_J = (gh) null;
        }
        return (java.applet.Applet) ((Object) km.field_m);
    }

    final static boolean a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        CharSequence var3 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = -57 % ((-11 - param0) / 36);
          var3 = (CharSequence) ((Object) param1);
          stackIn_1_0 = ng.field_r.equals(ui.a(1, var3));
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_4_0 = var2;
          stackIn_4_1 = new StringBuilder().append("wl.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    private final boolean a(int param0, byte param1) {
        int var3;
        qb var4;
        int var5;
        var5 = SteelSentinels.field_G;
        var3 = -42 / ((10 - param1) / 61);
        this.field_L = 32;
        if (!this.field_B.field_h &&
          !this.field_V) {
          var4 = nk.a(2, -this.field_eb / 2, this.field_B, 112, this.field_A, this.field_ob, 10, -this.field_F / 2, this.field_U, this.field_U);
          this.field_B.field_O.a(3, var4);
        }
        if (50 > this.field_hb) {
          this.field_hb = this.field_hb * 6;
        }
        this.field_Z = this.field_Z + 1;
        if (this.field_Z <= this.field_hb &&
          !this.field_P) {
          return false;
        }
        if (0 == this.field_y) {
          this.a(2, 500, 2, -99, 100);
        } else {
          if (this.field_y == 11) {
            this.a(10, 750, 2, -125, 500);
          }
        }
        if (this.field_I) {
          this.field_T = true;
        } else {
          this.field_B.field_J.a((byte) 92, (kd) (this));
        }
        return true;
    }

    private final boolean b(int param0, int param1) {
        int var3 = 0;
        double var4 = 0.0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        qb var10 = null;
        this.field_L = param0;
        if (!this.field_B.field_h) {
          if (this.field_V) {
            return false;
          }
          var3 = 100;
          var4 = 0.5;
          if (3 == this.field_y) {
            var4 = 0.5;
            var3 = 100;
          }
          if (this.field_y == 16) {
            var4 = 0.4;
            var3 = 100;
          }
          if (29 == this.field_y) {
            var3 = 200;
            var4 = 0.3;
          }
          var6 = (int)Math.sqrt((double)(this.field_eb * this.field_eb + this.field_F * this.field_F));
          var7 = (int)(Math.sin((double)(this.field_Z * this.field_L + param1) * var4) * (double)var3);
          if (var6 > 0) {
            var8 = this.field_F * var7 / var6;
            var9 = var7 * -this.field_eb / var6;
            var10 = nk.a(6, var8, this.field_B, 88, this.field_A, this.field_ob, 100, var9, this.field_U, this.field_U);
            this.field_B.field_O.a(3, var10);
          }
        }
        return false;
    }

    private final boolean e(int param0, int param1) {
        qb var3;
        int var4;
        qb var3Lifetime1;
        qb var3Lifetime2;
        boolean decompiledFrameRemainder0 = true;
        var4 = SteelSentinels.field_G;
        this.g(1354276);
        this.field_L = 8;
        if (!this.field_B.field_h &&
          !this.field_V &&
          param0 == 0) {
          if (this.field_y == 18 &&
            (15 & this.field_L * this.field_B.field_r + param0) == 0) {
            if ((this.field_B.field_r & 3) == 0) {
              var3 = nk.a(5, -this.field_F / 2, this.field_B, 94, this.field_A, this.field_ob, 200, this.field_eb / 2, this.field_U, this.field_U);
              this.field_B.field_O.a(param1 ^ 30, var3);
            } else {
              if ((2 == (3 & this.field_B.field_r))) {
                var3Lifetime2 = nk.a(5, this.field_F / 2, this.field_B, 104, this.field_A, this.field_ob, 200, -this.field_eb / 2, this.field_U, this.field_U);
                this.field_B.field_O.a(3, var3Lifetime2);
              }
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (31 == this.field_y) {
              if ((7 & this.field_B.field_r) != 0) {
                if (4 == (7 & this.field_B.field_r)) {
                  var3Lifetime1 = nk.a(4, this.field_F, this.field_B, 98, this.field_A, this.field_ob, 200, -this.field_eb, this.field_U, this.field_U);
                  this.field_B.field_O.a(param1 - 26, var3Lifetime1);
                }
              } else {
                var3Lifetime1 = nk.a(4, -this.field_F, this.field_B, param1 + 63, this.field_A, this.field_ob, 200, this.field_eb, this.field_U, this.field_U);
                this.field_B.field_O.a(3, var3Lifetime1);
              }
            }
          }
        }
        if (param1 == 29) {
          return false;
        }
        field_R = (String) null;
        return false;
    }

    private final boolean d(int param0, int param1) {
        boolean stackIn_27_0 = false;
        boolean stackIn_34_0 = false;
        int stackIn_47_0 = 0;
        boolean stackIn_56_1 = false;
        boolean stackOut_33_0;
        boolean stackOut_26_0;
        int var3;
        int var4_int;
        qb var4;
        int var5;
        int var6_int;
        qb var6;
        int var7;
        wl var8;
        ie var9;
        wl var10;
        int var4_intLifetime1;
        int var5Lifetime1;
        qb var4Lifetime1;
        qb var6Lifetime1;
        qb var6Lifetime2;
        int stackIn_47_0Lifetime1;
        var7 = SteelSentinels.field_G;
        var3 = 200;
        if (0 == this.field_Z &&
          0 == param0) {
          this.field_S = this.field_S - this.field_A;
          this.field_K = this.field_K - this.field_U;
        }
        if (this.field_Z < 10) {
          var4_int = this.field_K;
          var5 = this.field_S;
          var6_int = 10 * (int)Math.sqrt((double)(var4_int / 100 * var4_int + var5 / 100 * var5));
          if (1 > var6_int) {
            var6_int = 1;
          }
          this.field_F = var3 * this.field_Z * var5 / (var6_int * 10);
          if (this.field_y != 32 && (null == this.field_X ||
            0 == this.field_X.field_Nb)) {
            this.field_H = false;
          }
          this.field_eb = var4_int * (this.field_Z * var3) / (10 * var6_int);
        } else {
          if (this.field_Z >= 20) {
            if (this.field_y == 9 &&
              30 == this.field_Z) {
              this.field_T = true;
            }
            if (this.field_y == 19 &&
              this.field_Z == 30) {
              this.field_T = true;
              var9 = new ie(new int[]{this.field_B.field_r});
              if (!this.field_V) {
                for (var5 = 0; var5 < 7; var5++) {
                  var10 = new wl(this.field_U, this.field_A, this.field_eb, this.field_F, this.field_hb, this.field_L, 2, this.field_B, this.field_X, this.field_O / 2, this.field_ib, this.field_y);
                  var10.field_Z = 31;
                  var10.field_ab = this.field_ab;
                  var10.field_V = this.field_V;
                  var10.field_kb = this.field_kb;
                  stackOut_33_0 = this.field_V;
                  stackIn_47_0 = stackOut_33_0 ? 1 : 0;
                  stackIn_34_0 = stackOut_33_0;
                  if (stackIn_34_0) {
                    var10.field_fb = null;
                  }
                  var10.field_eb = var10.field_eb + (jh.a(8192 * var5 / 7 + this.field_B.field_r, 4096) * wc.a((byte) -61, var9, 16) >> 15);
                  var10.field_F = var10.field_F + (kg.a(var5 * 8192 / 7 + this.field_B.field_r, (byte) -98) * wc.a((byte) -61, var9, 16) >> 15);
                  this.field_B.field_db.a(3, var10);
                }
              } else {
                if (!this.field_I) {
                  for (var5 = 0; var5 < 7; var5++) {
                    var8 = new wl(this.field_U, this.field_A, this.field_eb, this.field_F, this.field_hb, this.field_L, 2, this.field_B, this.field_X, this.field_O / 2, this.field_ib, this.field_y);
                    var8.field_ab = this.field_ab;
                    var8.field_Z = 31;
                    var8.field_V = this.field_V;
                    stackOut_26_0 = this.field_V;
                    stackIn_47_0 = stackOut_26_0 ? 1 : 0;
                    stackIn_27_0 = stackOut_26_0;
                    if (stackIn_27_0) {
                      var8.field_fb = null;
                    }
                    var8.field_kb = this.field_kb;
                    var8.field_eb = var8.field_eb + (jh.a(8192 * var5 / 7 + this.field_B.field_r, 4096) * wc.a((byte) -61, var9, 16) >> 15);
                    var8.field_F = var8.field_F + (kg.a(8192 * var5 / 7 + this.field_B.field_r, (byte) -94) * wc.a((byte) -61, var9, 16) >> 15);
                    pm.field_db.a(3, var8);
                  }
                }
              }
            }
          } else {
            var4_int = (int)Math.sqrt((double)(this.field_eb * this.field_eb + this.field_F * this.field_F));
            if (1 > var4_int) {
              var4_int = 1;
            }
            this.field_F = var3 * this.field_F / var4_int;
            this.field_eb = this.field_eb * var3 / var4_int;
            if (32 != this.field_y && (this.field_X == null ||
              0 == this.field_X.field_Nb)) {
              this.field_H = false;
            }
          }
        }
        this.field_L = 12;
        stackIn_47_0Lifetime1 = -33;
        if (stackIn_47_0Lifetime1 == ~this.field_y &&
          this.field_Z > 10) {
          if (!this.field_B.field_h &&
            !this.field_V &&
            (1 & this.field_B.field_r + param0) == 0) {
            var4_intLifetime1 = -(this.field_eb * 20) + this.field_U;
            var5Lifetime1 = this.field_A - 20 * this.field_F;
            var6 = nk.a(1, -this.field_F - this.field_eb, this.field_B, 99, var5Lifetime1, this.field_ob, 50, -this.field_F + this.field_eb, var4_intLifetime1, this.field_U);
            this.field_B.field_O.a(param1 - 47, var6);
            var6Lifetime1 = nk.a(1, -this.field_eb + this.field_F, this.field_B, 106, var5Lifetime1, this.field_ob, 50, -this.field_eb - this.field_F, var4_intLifetime1, this.field_U);
            this.field_B.field_O.a(3, var6Lifetime1);
            var6Lifetime2 = nk.a(0, -this.field_eb / 2, this.field_B, param1 ^ 72, var5Lifetime1, this.field_ob, 250, -this.field_F / 2, var4_intLifetime1, this.field_U);
            this.field_B.field_O.a(3, var6Lifetime2);
          }
          stackIn_56_1 = (this.field_Z % 2 == 0);
          this.field_H = stackIn_56_1;
        } else {
          if (!this.field_B.field_h &&
            !this.field_V &&
            0 == (this.field_B.field_r + param0 & 1)) {
            var4 = nk.a(2, -this.field_eb / 2, this.field_B, 108, this.field_A, this.field_ob, 50, -this.field_F / 2, this.field_U, this.field_U);
            this.field_B.field_O.a(3, var4);
            var4Lifetime1 = nk.a(3, -this.field_eb / 2, this.field_B, 101, this.field_A, this.field_ob, 250, -this.field_F / 2, this.field_U, this.field_U);
            this.field_B.field_O.a(3, var4Lifetime1);
          }
        }
        if (param1 == 50) {
        }
        return false;
    }

    final static boolean a(String param0, boolean param1, String param2) {
        String var3 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          param2 = hk.a('_', "", param1, param2);
          var3 = ri.a(-1, param2);
          stackIn_5_0 = (param0.indexOf(param2) != -1) || (param0.indexOf(var3) != -1);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_8_0 = var3_ref;
          stackIn_8_1 = new StringBuilder().append("wl.I(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    private final boolean f(int param0, int param1) {
        boolean stackIn_39_1 = false;
        boolean stackIn_68_0 = false;
        qb var3;
        int var4;
        int var6;
        wl var7;
        ie var8;
        wl var9;
        ie var10;
        qb var3Lifetime1;
        boolean stackIn_68_0Lifetime1;
        var6 = SteelSentinels.field_G;
        if (this.field_L == 0 ||
          this.field_L == 7) {
          this.field_L = 8;
        }
        if (this.field_y == 15) {
          this.field_L = 16;
        }
        if (param1 != -29) {
          this.field_L = -44;
        }
        boolean decompiledFrameRemainder0 = true;
        if (this.field_y == 2 && (this.field_Z > this.field_z ||
          this.field_bb)) {
          if (this.field_bb) {
            this.field_eb = 0;
            this.field_F = 0;
          } else {
            this.field_F = this.field_F / 2;
            this.field_eb = this.field_eb / 2;
          }
          this.field_T = true;
          if (!this.field_V) {
            var10 = new ie(new int[]{this.field_B.field_r, this.field_U, this.field_A});
            for (var4 = 0; var4 < this.field_M; var4++) {
              var9 = new wl(this.field_U, this.field_A, this.field_eb, this.field_F, this.field_hb, this.field_L, 8, this.field_B, this.field_X, this.field_O, this.field_ib, this.field_y);
              var9.field_ab = this.field_ab;
              var9.field_G = this.field_G;
              var9.field_V = this.field_V;
              var9.field_kb = this.field_kb;
              stackIn_68_0 = this.field_V;
              if (stackIn_68_0) {
                var9.field_fb = null;
              }
              var9.field_eb = var9.field_eb + (jh.a(8192 * var4 / 10 + this.field_B.field_r, 4096) * wc.a((byte) -61, var10, 64) >> 16);
              var9.field_F = var9.field_F + (kg.a(this.field_B.field_r + var4 * 8192 / 10, (byte) -98) * wc.a((byte) -61, var10, 48) >> 16);
              this.field_B.field_db.a(3, var9);
            }
          } else {
            if (!this.field_I) {
              var8 = new ie(new int[]{this.field_B.field_r, this.field_U, this.field_A});
              for (var4 = 0; this.field_M > var4; var4++) {
                var7 = new wl(this.field_U, this.field_A, this.field_eb, this.field_F, this.field_hb, this.field_L, 8, this.field_B, this.field_X, this.field_O, this.field_ib, this.field_y);
                var7.field_V = this.field_V;
                var7.field_ab = this.field_ab;
                stackIn_68_0 = this.field_V;
                if (stackIn_68_0) {
                  var7.field_fb = null;
                }
                var7.field_kb = this.field_kb;
                var7.field_eb = var7.field_eb + (jh.a(this.field_B.field_r + 8192 * var4 / 10, 4096) * wc.a((byte) -61, var8, 64) >> 16);
                var7.field_F = var7.field_F + (kg.a(this.field_B.field_r + 8192 * var4 / 10, (byte) -108) * wc.a((byte) -61, var8, 48) >> 16);
                pm.field_db.a(param1 + 32, var7);
              }
            }
          }
          stackIn_68_0Lifetime1 = this.field_B.field_h;
          if ((!(stackIn_68_0Lifetime1)) &&
            (!(this.field_V))) {
            var3 = nk.a(2, -this.field_eb / 2, this.field_B, 107, this.field_A, this.field_ob, 25, -this.field_F / 2, this.field_U, this.field_U);
            this.field_B.field_O.a(3, var3);
          }
          decompiledFrameRemainder0 = false;
        }
        else {
          if (this.field_y == 2) {
            stackIn_39_1 = (this.field_L != 3);
            this.field_H = stackIn_39_1;
            if (this.field_L == 2 ||
              this.field_L == 8) {
              this.field_L = 4;
            }
            if (!this.field_B.field_h &&
              !this.field_V) {
              var3Lifetime1 = nk.a(2, -this.field_eb / 2, this.field_B, 97, this.field_A, this.field_ob, 25, -this.field_F / 2, this.field_U, this.field_U);
              this.field_B.field_O.a(3, var3Lifetime1);
            }
          } else {
            if (14 != this.field_y &&
              this.field_y != 28) {
              if (!(this.field_B.field_h)) {
                if (this.field_V) {
                  return false;
                }
                var3Lifetime1 = nk.a(3, -this.field_eb / 2, this.field_B, 110, this.field_A, this.field_ob, 5, -this.field_F / 2, this.field_U, this.field_U);
                this.field_B.field_O.a(3, var3Lifetime1);
                if (this.field_y == 27) {
                  var3Lifetime1 = nk.a(8, -this.field_eb / 2, this.field_B, param1 + 123, this.field_A, this.field_ob, 25, -this.field_F / 2, this.field_U, this.field_U);
                  this.field_B.field_O.a(3, var3Lifetime1);
                } else {
                  var3Lifetime1 = nk.a(8, -this.field_eb / 2, this.field_B, 99, this.field_A, this.field_ob, 10, -this.field_F / 2, this.field_U, this.field_U);
                  if (this.field_y == 15 &&
                    this.field_Z >= this.field_jb &&
                    null != this.field_X &&
                    this.field_E) {
                    var3Lifetime1.field_M = 3;
                  }
                  this.field_B.field_O.a(3, var3Lifetime1);
                }
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              this.field_H = true;
              this.field_L = 16;
              if (!this.field_B.field_h &&
                !this.field_V) {
                if (this.field_y == 28 &&
                  3 > this.field_Z) {
                  var3Lifetime1 = nk.a(1, -this.field_eb / 2, this.field_B, 120, this.field_A, this.field_ob, 35 - this.field_Z * 10, -this.field_F / 2, this.field_U, this.field_U);
                  this.field_B.field_O.a(param1 ^ -32, var3Lifetime1);
                } else {
                  if (this.field_Z >= 1) {
                    var3Lifetime1 = nk.a(3, -this.field_eb / 2, this.field_B, param1 + 119, this.field_A, this.field_ob, 5, -this.field_F / 2, this.field_U, this.field_U);
                    this.field_B.field_O.a(3, var3Lifetime1);
                  } else {
                    var3Lifetime1 = nk.a(1, -this.field_eb / 2, this.field_B, 125, this.field_A, this.field_ob, 18 - this.field_Z * 8, -this.field_F / 2, this.field_U, this.field_U);
                    this.field_B.field_O.a(3, var3Lifetime1);
                  }
                }
              }
            }
          }
        }
        return false;
    }

    private final boolean b(int param0, byte param1) {
        boolean discarded$0 = false;
        qb var3 = null;
        if (param1 > -107) {
          discarded$0 = this.b(31, (byte) -17);
        }
        this.field_H = 0 == (1 & param0) ? true : false;
        this.field_L = 2;
        if (!this.field_B.field_h &&
          !this.field_V) {
          var3 = nk.a(2, -this.field_eb / 2, this.field_B, 112, this.field_A, this.field_ob, 25, -this.field_F / 2, this.field_U, this.field_U);
          this.field_B.field_O.a(3, var3);
        }
        if (this.field_y == 2 &&
          this.field_bb) {
          if (this.field_T) {
            return false;
          }
          this.a(5, 256, 4, -113, 50);
          this.field_T = true;
        }
        return false;
    }

    final static void c(byte param0) {
        int[] var3 = null;
        int[] var4 = null;
        int[] var5 = null;
        int[] var2 = null;
        int[] var1 = null;
        if (oa.a(0, true)) {
          var2 = ao.field_B;
          var1 = var2;
          var2[1] = vn.a(var2[1], 64);
          var3 = ao.field_A;
          var1 = var3;
          var3[1] = ec.a(var3[1], -65);
        } else {
          var4 = ao.field_B;
          var1 = var4;
          var4[1] = ec.a(var4[1], -65);
          var5 = ao.field_A;
          var1 = var5;
          var5[1] = vn.a(var5[1], 64);
        }
        if (param0 < 7) {
          field_N = (rf) null;
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int[] param7) {
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_53_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        nk var23 = null;
        int[] var24 = null;
        int[] var25 = null;
        var22 = SteelSentinels.field_G;
        try {
          if (param0 + param4 < 0) {
            param5 = param5 + (param4 >> 4);
            param1 = param1 + (param0 >> 4);
            param4 = -param4;
            param0 = -param0;
          }
          var9_int = pb.field_i;
          var10 = pb.field_b;
          var11 = pb.field_l;
          var12 = pb.field_d;
          if (param2 != 1) {
            var23 = (nk) null;
            wl.a((int[]) null, -55, false, (nk) null);
          }
          var13 = pb.field_c;
          var25 = pb.field_g;
          var24 = var25;
          var17 = var24;
          if (!this.field_W &&
            this.field_y != 35 &&
            this.field_y != 4) {
            pb.e(param5, param1, param3 - 1, 16777215);
            pb.c(param5, param1, param3 - 1, param6);
          }
          if (param4 <= param0) {
            param5 = param5 << 16;
            var10 = var10 - param3;
            var9_int = var9_int + param3;
            param0 = param0 >> 4;
            param5 = param5 + 32768;
            param4 = param4 << 12;
            var18 = (int)Math.floor(0.5 + (double)param4 / (double)param0);
            param0 = param0 + param1;
            if (var12 <= param0) {
              param0 = -1 + var12;
            }
            if (var11 > param1) {
              param5 = param5 + (var11 - param1) * var18;
              param1 = var11;
            }
            while (param0 >= param1) {
              var19 = param5 >> 16;
              param5 = param5 + var18;
              if (var9_int <= var19 &&
                var10 > var19) {
                var14 = var13 * param1 + var19 - param3;
                for (var20 = 0; param3 > var20; var20++) {
                  var14++;
                  param6 = param7[var20];
                  var15 = var25[var14];
                  var16 = param6 + var15;
                  var21 = (param6 & 16711935) + (var15 & 16711935);
                  var15 = (65536 & -var21 + var16) + (16777472 & var21);
                  var17[var14] = vn.a(-var15 + var16, var15 - (var15 >>> 8));
                }
                var14 = var14 + param3;
                for (var20 = 1; var20 < param3; var20++) {
                  var14--;
                  param6 = param7[var20];
                  var15 = var25[var14];
                  var16 = param6 + var15;
                  var21 = (16711935 & var15) + (16711935 & param6);
                  var15 = (-var21 + var16 & 65536) + (var21 & 16777472);
                  var17[var14] = vn.a(var15 - (var15 >>> 8), -var15 + var16);
                }
              }
              param1++;
            }
            return;
          }
          param1 = param1 << 16;
          var12 = var12 - param3;
          var11 = var11 + param3;
          param1 = param1 + 32768;
          param0 = param0 << 12;
          param4 = param4 >> 4;
          var18 = (int)Math.floor(0.5 + (double)param0 / (double)param4);
          param4 = param4 + param5;
          if (param5 < var9_int) {
            param1 = param1 + (-param5 + var9_int) * var18;
            param5 = var9_int;
          }
          if (var10 <= param4) {
            param4 = -1 + var10;
            while (param5 <= param4) {
              var19 = param1 >> 16;
              param1 = param1 + var18;
              if (var11 <= var19 &&
                var19 < var12) {
                var14 = -(var13 * param3) + (param5 + var13 * var19);
                for (var20 = 0; var20 < param3; var20++) {
                  var14 = var14 + var13;
                  param6 = param7[var20];
                  var15 = var25[var14];
                  var16 = param6 + var15;
                  var21 = (16711935 & param6) + (var15 & 16711935);
                  var15 = (16777472 & var21) + (-var21 + var16 & 65536);
                  var17[var14] = vn.a(var15 - (var15 >>> 8), var16 - var15);
                }
                var14 = var14 + param3 * var13;
                for (var20 = 1; param3 > var20; var20++) {
                  param6 = param7[var20];
                  var14 = var14 - var13;
                  var15 = var25[var14];
                  var16 = param6 + var15;
                  var21 = (var15 & 16711935) + (16711935 & param6);
                  var15 = (65536 & -var21 + var16) + (var21 & 16777472);
                  var17[var14] = vn.a(var16 - var15, var15 - (var15 >>> 8));
                }
              }
              param5++;
            }
            return;
          }
          if (param5 <= param4) {
            var19 = param1 >> 16;
            param1 = param1 + var18;
            if (var11 <= var19 &&
              var19 < var12) {
              var14 = -(var13 * param3) + (param5 + var13 * var19);
              for (var20 = 0; var20 < param3; var20++) {
                var14 = var14 + var13;
                param6 = param7[var20];
                var15 = var25[var14];
                var16 = param6 + var15;
                var21 = (16711935 & param6) + (var15 & 16711935);
                var15 = (16777472 & var21) + (-var21 + var16 & 65536);
                var17[var14] = vn.a(var15 - (var15 >>> 8), var16 - var15);
              }
              while (true) {
                var14 = var14 + param3 * var13;
                for (var20 = 1; param3 > var20; var20++) {
                  param6 = param7[var20];
                  var14 = var14 - var13;
                  var15 = var25[var14];
                  var16 = param6 + var15;
                  var21 = (var15 & 16711935) + (16711935 & param6);
                  var15 = (65536 & -var21 + var16) + (var21 & 16777472);
                  var17[var14] = vn.a(var16 - var15, var15 - (var15 >>> 8));
                }
                do {
                  param5++;
                  if (param5 > param4) {
                    return;
                  }
                  var19 = param1 >> 16;
                  param1 = param1 + var18;
                } while (var11 > var19 ||
                  var19 >= var12);
                var14 = -(var13 * param3) + (param5 + var13 * var19);
                for (var20 = 0; var20 < param3; var20++) {
                  var14 = var14 + var13;
                  param6 = param7[var20];
                  var15 = var25[var14];
                  var16 = param6 + var15;
                  var21 = (16711935 & param6) + (var15 & 16711935);
                  var15 = (16777472 & var21) + (-var21 + var16 & 65536);
                  var17[var14] = vn.a(var15 - (var15 >>> 8), var16 - var15);
                }
              }
            }
            while (true) {
              param5++;
              if (param5 > param4) {
                return;
              }
              var19 = param1 >> 16;
              param1 = param1 + var18;
              if (var11 > var19) {
                continue;
              }
              if (var19 >= var12) {
                continue;
              }
              var14 = -(var13 * param3) + (param5 + var13 * var19);
              for (var20 = 0; var20 < param3; var20++) {
                var14 = var14 + var13;
                param6 = param7[var20];
                var15 = var25[var14];
                var16 = param6 + var15;
                var21 = (16711935 & param6) + (var15 & 16711935);
                var15 = (16777472 & var21) + (-var21 + var16 & 65536);
                var17[var14] = vn.a(var15 - (var15 >>> 8), var16 - var15);
              }
              var14 = var14 + param3 * var13;
              for (var20 = 1; param3 > var20; var20++) {
                param6 = param7[var20];
                var14 = var14 - var13;
                var15 = var25[var14];
                var16 = param6 + var15;
                var21 = (var15 & 16711935) + (16711935 & param6);
                var15 = (65536 & -var21 + var16) + (var21 & 16777472);
                var17[var14] = vn.a(var16 - var15, var15 - (var15 >>> 8));
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_52_0 = var9;
          stackIn_52_1 = new StringBuilder().append("wl.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_53_2 = "null";
          } else {
            stackIn_53_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_52_0), ((StringBuilder) (Object) stackIn_52_1).append(stackIn_53_2).append(')').toString());
        }
    }

    final static boolean j(int param0) {
        if (param0 != 16777215) {
          return true;
        }
        return jn.field_b == nj.field_ab ? true : false;
    }

    private final boolean a(byte param0, int param1) {
        int var3;
        int var4;
        qb var4_ref_qb;
        int var5;
        int var6;
        qb var7;
        int var7_int;
        int var8;
        int var9;
        qb var10;
        int var11;
        qb var7Lifetime1;
        qb var10Lifetime1;
        var11 = SteelSentinels.field_G;
        if (param0 >= -1) {
          this.field_Z = 101;
        }
        var3 = 300;
        if (this.field_Z < 20) {
          var4 = this.field_eb;
          var5 = this.field_F;
          var6 = (int)Math.sqrt((double)(var5 * var5 + var4 * var4));
          if (1 > var6) {
            var6 = 1;
          }
          this.field_H = false;
          this.field_eb = (this.field_Z + 5) * (var4 * var3) / (var6 * 25);
          this.field_F = var5 * ((this.field_Z + 5) * var3) / (var6 * 25);
          if (!this.field_B.field_h &&
            !this.field_V &&
            (this.field_B.field_r + param1 & 1) == 0) {
            var7 = nk.a(2, -this.field_eb / 2, this.field_B, 95, this.field_A, this.field_ob, 200, -this.field_F / 2, this.field_U, this.field_U);
            this.field_B.field_O.a(3, var7);
            var7Lifetime1 = nk.a(3, -this.field_eb / 2, this.field_B, 113, this.field_A, this.field_ob, 50, -this.field_F / 2, this.field_U, this.field_U);
            this.field_B.field_O.a(3, var7Lifetime1);
          }
        } else {
          if (this.field_Z < 128) {
            if (null != this.field_nb) {
              if (this.field_nb.field_pc) {
                this.field_nb = null;
              } else {
                this.field_K = this.field_nb.field_hc;
                this.field_S = -(this.field_nb.field_Db << 3) + this.field_nb.field_Gb;
              }
            }
            var4 = (-this.field_U + this.field_K) / 10;
            var5 = (-this.field_A + this.field_S) / 10;
            var6 = cm.a(var5, 200, var4);
            var7_int = cm.a(this.field_F, 200, this.field_eb);
            var8 = -4096 + (8191 & -var7_int + (var6 + 4096));
            var9 = kk.a(this.field_F, this.field_eb, -22967);
            if (var8 >= -1024 &&
              1024 >= var8) {
              if (300 > var9) {
                var9 += 5;
              }
            } else {
              if (var9 < 300) {
                var9 += 5;
              }
              if (var9 > 300) {
                var9 -= 5;
              }
            }
            if (var8 > 16) {
              var8 = 16;
            }
            if (var8 < -16) {
              var8 = -16;
            }
            if (var4 * this.field_eb < 0 &&
              this.field_cb * this.field_eb > 0 &&
              this.field_Q * this.field_F > 0 &&
              null != this.field_nb &&
              this.field_F * (this.field_eb * var8) < 0) {
              var8 = -var8;
            }
            var7_int = var7_int + var8;
            this.field_eb = kg.a(var7_int, (byte) -127) * var9 >> 16;
            this.field_F = jh.a(var7_int, 4096) * var9 >> 16;
            this.field_H = false;
            if (!this.field_B.field_h &&
              !this.field_V) {
              if (0 != (this.field_B.field_r + param1 & 1)) {
                this.field_L = 4;
                return false;
              }
              var10 = nk.a(2, -this.field_eb / 2, this.field_B, 102, this.field_A, this.field_ob, 200, -this.field_F / 2, this.field_U, this.field_U);
              this.field_B.field_O.a(3, var10);
              var10Lifetime1 = nk.a(3, -this.field_eb / 2, this.field_B, 107, this.field_A, this.field_ob, 50, -this.field_F / 2, this.field_U, this.field_U);
              this.field_B.field_O.a(3, var10Lifetime1);
            }
          } else {
            if (!this.field_B.field_h &&
              !this.field_V &&
              0 == (this.field_B.field_r + param1 & 1)) {
              var4_ref_qb = nk.a(3, -this.field_eb / 2, this.field_B, 120, this.field_A, this.field_ob, 50, -this.field_F / 2, this.field_U, this.field_U);
              this.field_B.field_O.a(3, var4_ref_qb);
            }
          }
        }
        this.field_L = 4;
        return false;
    }

    final void i(int param0) {
        boolean stackIn_3_1 = false;
        mb stackIn_44_0 = null;
        int stackIn_45_1 = 0;
        int stackIn_70_0 = 0;
        int stackIn_73_0 = 0;
        int stackIn_73_1 = 0;
        int stackIn_100_0 = 0;
        int stackIn_100_1 = 0;
        int stackIn_151_0 = 0;
        int stackIn_151_1 = 0;
        boolean stackIn_183_0 = false;
        int stackIn_188_0 = 0;
        int stackIn_306_0;
        int stackIn_306_1;
        ee stackIn_306_2;
        int stackIn_306_3;
        int stackIn_306_4;
        boolean stackIn_306_5;
        int stackIn_307_6;
        int stackIn_316_0;
        int stackIn_316_1;
        ee stackIn_316_2;
        int stackIn_316_3;
        int stackIn_316_4;
        boolean stackIn_316_5;
        int stackIn_317_6;
        int stackIn_456_0 = 0;
        int stackIn_456_1 = 0;
        boolean stackOut_182_0;
        int var2;
        double var2_double;
        mb var2_ref_mb;
        Object var3;
        int var3_int;
        mb var3_ref;
        qb var3_ref2;
        wl var3_ref3;
        int var4;
        mb var4_ref_mb;
        qb var4_ref_qb;
        int var5;
        wl var5_ref_wl;
        int var6;
        qb var7;
        int var7_int;
        int var8;
        int var9;
        wl var10;
        ie var11;
        jc var12;
        int var2Lifetime1;
        int var2Lifetime2;
        int var3_intLifetime1;
        int var3_intLifetime2;
        int var4Lifetime1;
        int var2Lifetime3;
        double var2_doubleLifetime1;
        int var3_intLifetime3;
        int var5Lifetime1;
        int var5Lifetime2;
        int var6Lifetime1;
        int var6Lifetime2;
        int var2Lifetime2Lifetime1;
        int var2Lifetime2Lifetime2;
        int var3_intLifetime2Lifetime1;
        int var4Lifetime1Lifetime1;
        int var4Lifetime1Lifetime2;
        mb var3_refLifetime1;
        qb var3_ref2Lifetime1;
        wl var3_ref3Lifetime1;
        qb var4_ref_qbLifetime1;
        qb var7Lifetime1;
        qb var3_ref2Lifetime2;
        qb var3_ref2Lifetime3;
        qb var3_ref2Lifetime1Lifetime1;
        int stackIn_70_0Lifetime1;
        int stackIn_73_0Lifetime1;
        int stackIn_73_1Lifetime1;
        int stackIn_100_0Lifetime1;
        int stackIn_100_1Lifetime1;
        int stackIn_151_0Lifetime1;
        int stackIn_151_1Lifetime1;
        int stackIn_188_0Lifetime1;
        int stackIn_456_0Lifetime1;
        int stackIn_456_0Lifetime2;
        int stackIn_456_1Lifetime1;
        int stackIn_456_1Lifetime2;
        int var5Lifetime3;
        int var2Lifetime2Lifetime3;
        int var4Lifetime1Lifetime3;
        int var4Lifetime1Lifetime4;
        var3 = null;
        var9 = SteelSentinels.field_G;
        this.field_H = true;
        stackIn_3_1 = !(this.field_B.field_ab.a(false, this.field_U >> 4) <= -(this.field_A >> 4));
        this.field_ob = stackIn_3_1;
        if (19 == this.field_C) {
          this.field_A = -this.field_B.field_ab.a(false, this.field_U >> 4) << 4;
          this.field_Z = this.field_Z + 1;
          if (this.field_Z < 250) {
            this.field_A = this.field_A - (-250 + this.field_Z) * ((this.field_Z - 250) * 10);
          }
          if (this.field_Z >= 400 &&
            this.field_Z < 450) {
            var2 = 900000 - 2000 * this.field_Z;
            this.field_A = this.field_A - var2;
            var3_int = this.field_Z * 25 - 10000;
            this.a(5, 50 + var3_int, 3, -108, 10);
            this.field_A = this.field_A + var2;
          }
          if (this.field_Z == 450) {
            this.a(4000, 0, 3, false, 50, (byte) -115);
          }
          if (this.field_Z > 450) {
            var2Lifetime3 = 2 * (1 & this.field_Z) - 1;
            var3_intLifetime3 = 750 * (var2Lifetime3 * (this.field_Z - 450));
            this.field_U = this.field_U + var3_intLifetime3;
            this.field_A = -this.field_B.field_ab.a(false, this.field_U >> 4) << 4;
            this.a(100, 256, 4, -124, 5 * this.field_Z - 2250 + 50);
            this.field_A = -this.field_B.field_ab.a(false, this.field_U >> 4) << 4;
            this.field_U = this.field_U - var3_intLifetime3;
          }
          if (this.field_Z >= 500) {
            this.field_Z = 0;
          }
          return;
        }
        if (this.field_C >= 12 &&
          this.field_C <= 16) {
          if (this.field_Z == 0) {
            fc.a((byte) -110, 81, -1);
          }
          if (0 == (61 & this.field_Z)) {
            fc.a((byte) 37, 2, this.field_U);
          }
          this.field_Z = this.field_Z + 1;
          var2Lifetime1 = 5100;
          if (this.field_eb == 1) {
            this.field_U = (this.field_B.field_ab.a(9) + 2 * var2Lifetime1) * this.field_Z / 500 - var2Lifetime1 << 4;
          } else {
            this.field_U = -var2Lifetime1 + (2 * var2Lifetime1 + this.field_B.field_ab.a(99)) * (500 - this.field_Z) / 500 << 4;
          }
          this.field_A = -(30000 * Math.abs(-250 + this.field_Z) / 250) - 150000;
          if (this.field_C == 13 ||
            this.field_C == 15) {
            this.field_Z = this.field_Z + 1;
            this.field_A = -(30000 * this.field_Z / 500) - 100000;
          }
          if (this.field_C == 16) {
            this.field_A = 400 * (this.field_Z * this.field_Z * 1800 / 250000) - 180000;
            if (this.field_Z == 180) {
              this.field_B.field_b = 1;
              this.field_B.field_R = 1550;
              fc.a((byte) 104, 60, -1);
            }
            if (this.field_Z > 250) {
              this.field_B.field_J.a((byte) 82, (kd) (this));
              var3_ref = (mb) (this.field_B.field_K.e(13058));
              while (var3_ref != null) {
                stackIn_73_0 = 0;
                stackIn_73_1 = var3_ref.field_rb;
                if (stackIn_73_0 < stackIn_73_1) {
                  var3_ref.field_ab = -3000;
                  stackIn_44_0 = var3_ref;
                  if (var3_ref.field_hc <= this.field_U) {
                    stackIn_45_1 = -3000;
                  } else {
                    stackIn_45_1 = 3000;
                  }
                  stackIn_44_0.field_K = stackIn_45_1;
                  var3_ref.f(128);
                  var3_ref.field_pc = false;
                }
                var3_ref = (mb) (this.field_B.field_K.a((byte) -96));
              }
            } else {
              if (this.field_Z == 250) {
                var3_intLifetime1 = this.field_U;
                var4 = this.field_A;
                if ((this.field_Z & 31) == 5) {
                  this.a(50, 2000, 0, -99, 20);
                }
                this.field_A = this.field_A - 10000;
                this.field_U = this.field_U - 25000;
                if ((this.field_Z & 31) == 0) {
                  this.a(50, 2000, 0, param0 - 111, 20);
                }
                this.field_U = this.field_U + 50000;
                this.field_A = this.field_A + 30000;
                if ((31 & this.field_Z) == 10) {
                  this.a(50, 2000, 0, -102, 20);
                }
                this.field_A = var4;
                this.field_U = var3_intLifetime1;
                fc.a((byte) 80, 104, -1);
              }
            }
          }
          var3_refLifetime1 = (mb) (this.field_B.field_K.e(13058));
          while (true) {
            if (var3_refLifetime1 != null) {
              stackIn_70_0 = var3_refLifetime1.field_rb;
              if (stackIn_70_0 > 0 &&
                !var3_refLifetime1.field_pc &&
                var3_refLifetime1.field_Lb &&
                var3_refLifetime1.field_Gb < 25000 + this.field_A &&
                Math.abs(-this.field_U + var3_refLifetime1.field_hc) < 65000) {
                var3_refLifetime1.field_dc = true;
                var3_refLifetime1.f(128);
                var3_refLifetime1.field_K = this.field_eb * 3000;
              }
              var3_refLifetime1 = (mb) (this.field_B.field_K.a((byte) -101));
              continue;
            }
            break;
          }
          stackIn_70_0Lifetime1 = this.field_B.field_h ? 1 : 0;
          if (stackIn_70_0Lifetime1 == 0) {
            stackIn_73_0Lifetime1 = 1;
            stackIn_73_1Lifetime1 = 0;
            var3_ref2 = nk.a(stackIn_73_0Lifetime1, stackIn_73_1Lifetime1, this.field_B, 116, this.field_A + 29000, false, 50, 100, this.field_U + 9000 * this.field_eb, this.field_U);
            this.field_B.field_O.a(param0 ^ -4, var3_ref2);
            var3_ref2Lifetime2 = nk.a(1, 0, this.field_B, 101, this.field_A + 32000, false, 50, 100, this.field_U + 15000 * this.field_eb, this.field_U);
            this.field_B.field_O.a(3, var3_ref2Lifetime2);
            var3_ref2Lifetime3 = nk.a(1, 0, this.field_B, param0 + 112, this.field_A + 35000, false, 50, 100, this.field_U + 21000 * this.field_eb, this.field_U);
            this.field_B.field_O.a(3, var3_ref2Lifetime3);
          }
          boolean decompiledFrameRemainder0 = true;
          if (12 != this.field_C) {
            if (13 != this.field_C &&
              this.field_C != 15) {
              if (((this.field_C == 14)) &&
                (((7 & this.field_Z) == 0)) &&
                (!(this.field_Z <= 250))) {
                var10 = new wl(-(this.field_eb * 48000) + this.field_U, this.field_A + 8000, this.field_eb * -50, 25, 1, 1, 3, this.field_B, (mb) null, 50, 0, 6);
                var10.field_ab = true;
                this.field_B.field_T.a(3, var10);
                fc.a((byte) 27, 14, this.field_U);
                var10.field_nb = null;
                var4_ref_mb = (mb) (this.field_B.field_K.e(param0 ^ -13059));
                while (var4_ref_mb != null) {
                  stackIn_100_0 = -1;
                  stackIn_100_1 = ~var4_ref_mb.field_rb;
                  if (stackIn_100_0 > stackIn_100_1 &&
                    !var4_ref_mb.field_pc) {
                    if (!var4_ref_mb.field_Lb) {
                      var4_ref_mb = (mb) (this.field_B.field_K.a((byte) -74));
                      continue;
                    }
                    if (var10.field_nb == null ||
                      !(Math.abs(var4_ref_mb.field_hc - var10.field_U) >= Math.abs(var10.field_nb.field_hc - var10.field_U))) {
                      var10.field_nb = var4_ref_mb;
                      var10.field_K = var10.field_nb.field_hc;
                      var10.field_S = var10.field_nb.field_Gb;
                    }
                  }
                  var4_ref_mb = (mb) (this.field_B.field_K.a((byte) -74));
                }
                var10.field_nb = null;
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              var3_ref3 = new wl(-(this.field_eb * 30000) + this.field_U, this.field_A + 29000, 300 * this.field_eb, 200, 50, 1, 4, this.field_B, (mb) null, 10, 0, 17);
              var3_ref3.field_ab = true;
              this.field_B.field_T.a(3, var3_ref3);
              if (this.field_Z % 50 == 0) {
                fc.a((byte) 110, 67, this.field_U);
              }
            }
          } else {
            if (0 == (31 & this.field_Z) &&
              this.field_Z > 250) {
              var3_ref3 = new wl(-(this.field_eb * 24000) + this.field_U, 23000 + this.field_A, this.field_eb * -50, 50, 1, 1, 6, this.field_B, (mb) null, 500, 0, 31);
              var3_ref3.field_ab = true;
              this.field_B.field_T.a(3, var3_ref3);
              fc.a((byte) -117, 62, this.field_U);
            }
          }
          stackIn_100_0Lifetime1 = ~this.field_Z;
          stackIn_100_1Lifetime1 = -501;
          if (stackIn_100_0Lifetime1 > stackIn_100_1Lifetime1) {
            return;
          }
          this.field_eb = -this.field_eb;
          this.field_Z = -500;
          if (this.field_C == 12) {
            this.field_C = 13;
          } else {
            if (this.field_C == 14) {
              this.field_C = 13;
            } else {
              if (13 == this.field_C) {
                this.field_B.field_J.a((byte) 79, (kd) (this));
              } else {
                if (this.field_C == 16) {
                  this.field_B.field_J.a((byte) 89, (kd) (this));
                }
              }
            }
          }
          return;
        }
        L27: {
          if (this.field_C != 17) {
            if (this.field_C == 11) {
              if (!this.field_B.field_h &&
                this.field_Z < 125) {
                var2_double = Math.random() * 3.14;
                var4Lifetime1 = (int)(1024.0 * Math.sin(var2_double));
                var5 = (int)(1024.0 * Math.cos(var2_double));
                var6 = -(this.field_Z / 4) + (50 - (int)(Math.random() * (double)this.field_Z / 4.0));
                var7 = nk.a(4, var4Lifetime1, this.field_B, 100, -(var6 * var5) + this.field_A, this.field_ob, 50, var5, -(var4Lifetime1 * var6) + this.field_U, this.field_U);
                this.field_B.field_O.a(3, var7);
              }
              boolean decompiledFrameRemainder2 = true;
              if (100 <= this.field_Z &&
                this.field_Z < 1000) {
                var2Lifetime2 = this.field_U + (this.field_Z - 100) * (this.field_ib - this.field_U) / 400;
                if (80000 > Math.abs(var2Lifetime2 - this.field_ib) && (this.field_eb == 1 &&
                  (this.field_B.field_v & 1) == 0 ||
                  this.field_eb == -1 &&
                  (this.field_B.field_v & 2) == 0)) {
                  var11 = new ie(new int[]{this.field_B.field_r});
                  var4Lifetime1Lifetime4 = 0;
                  while (7 > var4Lifetime1Lifetime4) {
                    var5_ref_wl = new wl(var2Lifetime2, this.field_A - (40 * this.field_Z - 4000), 0, 0, this.field_hb, this.field_L, 6, this.field_B, this.field_X, 500, this.field_ib, 31);
                    var5_ref_wl.field_ab = this.field_ab;
                    var5_ref_wl.field_V = this.field_V;
                    var5_ref_wl.field_Z = 31;
                    stackOut_182_0 = this.field_V;
                    stackIn_188_0 = stackOut_182_0 ? 1 : 0;
                    stackIn_183_0 = stackOut_182_0;
                    if (stackIn_183_0) {
                      var5_ref_wl.field_fb = null;
                    }
                    var5_ref_wl.field_kb = this.field_kb;
                    var5_ref_wl.field_eb = var5_ref_wl.field_eb + (jh.a(8192 * var4Lifetime1Lifetime4 / 7 + this.field_B.field_r, param0 ^ -4097) * wc.a((byte) -61, var11, 16) >> 13);
                    var5_ref_wl.field_eb = Math.abs(var5_ref_wl.field_eb) * -this.field_eb;
                    var5_ref_wl.field_F = var5_ref_wl.field_F + (kg.a(var4Lifetime1Lifetime4 * 8192 / 7 + this.field_B.field_r, (byte) -95) * wc.a((byte) -61, var11, 16) >> 13);
                    this.field_B.field_db.a(3, var5_ref_wl);
                    var4Lifetime1Lifetime4++;
                  }
                  stackIn_188_0Lifetime1 = this.field_eb;
                  if (stackIn_188_0Lifetime1 == 1) {
                    this.field_B.field_v = this.field_B.field_v | 1;
                  }
                  if (this.field_B.field_b == 0) {
                    this.field_B.field_b = 1;
                  }
                  this.field_Z = 1000;
                  if ((-1 == this.field_eb)) {
                    this.field_B.field_v = this.field_B.field_v | 2;
                  }
                  decompiledFrameRemainder2 = false;
                }
                else {
                  if (!this.field_B.field_h) {
                    var3_ref2Lifetime1 = nk.a(4, 0, this.field_B, param0 ^ -99, -((this.field_Z - 100) * 40) + this.field_A, this.field_ob, 50, -500 + (this.field_B.field_r & 1) * 1000, var2Lifetime2, this.field_U);
                    this.field_B.field_O.a(3, var3_ref2Lifetime1);
                    var3_ref2Lifetime1 = nk.a(1, 0, this.field_B, 125, this.field_A - (-100 + this.field_Z) * 40, this.field_ob, 100, 0, var2Lifetime2, this.field_U);
                    this.field_B.field_O.a(3, var3_ref2Lifetime1);
                  }
                }
              }
              this.field_Z = this.field_Z + 1;
              if (this.field_Z == 500 && (this.field_eb == 1 &&
                0 == (this.field_B.field_v & 16) ||
                this.field_eb == -1 &&
                (32 & this.field_B.field_v) == 0)) {
                this.field_A = this.field_A - 16000;
                this.field_U = this.field_ib;
                this.a(1000, 5000, 0, -102, 200);
                if (this.field_eb != 1) {
                  if (this.field_eb == -1) {
                    if (0 != (this.field_B.field_v & 8)) {
                      this.field_U = this.field_U + 25000;
                      this.field_A = this.field_A + 10000;
                      this.field_B.field_v = this.field_B.field_v | 32;
                      this.a(2000, 5000, 0, -127, 400);
                      this.field_U = this.field_U - 50000;
                      this.field_A = this.field_A - 30000;
                      this.a(2000, 5000, 0, param0 ^ 126, 500);
                      this.field_B.g(-124, 1);
                    }
                    if ((2 & this.field_B.field_v) != 0) {
                      this.field_B.field_v = this.field_B.field_v | 8;
                    }
                    this.field_B.field_v = this.field_B.field_v | 2;
                  }
                } else {
                  if ((this.field_B.field_v & 4) != 0) {
                    this.field_B.field_v = this.field_B.field_v | 16;
                    this.field_U = this.field_U - 25000;
                    this.field_A = this.field_A + 10000;
                    this.a(2000, 5000, 0, param0 ^ 117, 400);
                    this.field_A = this.field_A - 30000;
                    this.field_U = this.field_U + 50000;
                    this.a(2000, 5000, 0, -100, 500);
                    this.field_B.g(param0 - 116, 0);
                  }
                  if ((1 & this.field_B.field_v) != 0) {
                    this.field_B.field_v = this.field_B.field_v | 4;
                  }
                  this.field_B.field_v = this.field_B.field_v | 1;
                }
                this.field_Z = 1000;
              }
              if (this.field_Z >= 1000) {
                if (null != this.field_X) {
                  this.field_X.field_vb = this.field_X.field_vb + 10000;
                  this.field_X.field_Ab = this.field_X.field_Ab + 10000;
                  this.field_X.field_Fc = 50;
                  if (-1 == this.field_B.field_g) {
                    this.field_B.field_g = this.field_X.field_Bb;
                  }
                  this.field_X.field_qc = this.field_X.field_qc + 1;
                }
                this.field_B.field_J.a((byte) 124, (kd) (this));
              }
              return;
            }
            var2Lifetime2Lifetime3 = 0;
            L30: while (true) {
              if (this.field_L >= var2Lifetime2Lifetime3) {
                this.field_U = this.field_U + this.field_eb;
                this.field_A = this.field_A + this.field_F;
                stackIn_456_0 = this.field_C;
                stackIn_456_1 = 4;
                if ((stackIn_456_0 == stackIn_456_1 ||
                  5 == this.field_C) &&
                  this.field_A < -180000) {
                  this.field_T = true;
                }
                boolean decompiledFrameRemainder1 = true;
                if (this.field_C != 4) {
                  if (this.field_C != 2) {
                    if (this.field_C != 7) {
                      if (this.field_C == 0) {
                        if (this.c(param0 ^ -3, var2Lifetime2Lifetime3)) {
                          return;
                        }
                      } else {
                        if (this.field_C != 1 &&
                          this.field_C != 20) {
                          if (8 == this.field_C) {
                            if (this.b(var2Lifetime2Lifetime3, (byte) -114)) {
                              return;
                            }
                            decompiledFrameRemainder1 = false;
                          }
                          else {
                            if ((5 == this.field_C) &&
                              (decompiledFrameRemainder1 = !(!this.b(param0 ^ -9, var2Lifetime2Lifetime3)))) {
                              return;
                            }
                            if (decompiledFrameRemainder1) {
                              if ((this.field_C == 6) &&
                                (decompiledFrameRemainder1 = !(!this.e(var2Lifetime2Lifetime3, param0 + 30)))) {
                                return;
                              }
                              if ((decompiledFrameRemainder1) &&
                                (decompiledFrameRemainder1 = (3 == this.field_C)) &&
                                (decompiledFrameRemainder1 = !(!this.a((byte) -102, var2Lifetime2Lifetime3)))) {
                                return;
                              }
                            }
                          }
                        }
                        if ((decompiledFrameRemainder1) &&
                          (this.f(var2Lifetime2Lifetime3, -29))) {
                          return;
                        }
                      }
                    } else {
                      if (this.a(var2Lifetime2Lifetime3, (byte) -95)) {
                        return;
                      }
                    }
                  } else {
                    if (this.d(var2Lifetime2Lifetime3, 50)) {
                      return;
                    }
                  }
                } else {
                  if (this.g(97, var2Lifetime2Lifetime3)) {
                    return;
                  }
                }
                if (this.field_fb != null) {
                  this.a(param0 + 92, var2Lifetime2Lifetime3);
                }
                if (!this.field_T && (!this.field_B.b(this.field_U, param0 - 4) ||
                  !(this.field_B.field_ab.a(false, this.field_U >> 4) > -(this.field_A >> 4)) ||
                  !(this.field_B.field_ab.b((byte) 121, this.field_U >> 4) < -(this.field_A >> 4))) && this.field_B.field_ab.a((byte) -107, this.field_U >> 4) <= -(this.field_A >> 4)) {
                  if (this.field_T &&
                    this.field_I) {
                    break L30;
                  }
                  if (!this.field_T) {
                    var2Lifetime2Lifetime3++;
                    continue;
                  }
                  this.field_L = var2Lifetime2Lifetime3;
                  if (null == this.field_X) {
                    break L30;
                  }
                  if (this.field_C != 2) {
                    break L30;
                  }
                  if (this.field_gb) {
                    break L30;
                  }
                  this.field_X.field_p = 0;
                  break L30;
                }
                if (this.field_X != null &&
                  !this.field_V &&
                  !this.field_T &&
                  this.field_jb <= this.field_Z && (this.field_nb == null ||
                  3 != this.field_C)) {
                  this.field_X.field_q = -200;
                  this.field_X.field_sb = this.field_X.field_sb + 1;
                }
                if (0 == this.field_C) {
                  if (this.field_y != 1) {
                    if (12 == this.field_y) {
                      this.a(64, 3, 1, false, 20, (byte) -103);
                    } else {
                      if (this.field_y == 26) {
                        this.a(96, 6, 1, false, 30, (byte) -118);
                      }
                    }
                  } else {
                    this.a(64, 1, 1, false, 10, (byte) -116);
                  }
                  if (!this.field_I) {
                    this.field_B.field_J.a((byte) 36, (kd) (this));
                  } else {
                    this.field_T = true;
                  }
                } else {
                  if (this.field_C != 7) {
                    if (this.field_C != 4) {
                      if (1 != this.field_C &&
                        this.field_C != 20) {
                        if (this.field_C == 8) {
                          if (2 == this.field_y) {
                            this.a(5, 256, 4, -108, 50);
                          } else {
                            if (this.field_y == 19) {
                              this.a(15, 500, 0, -126, 25);
                            }
                          }
                          if (!this.field_I) {
                            this.field_B.field_J.a((byte) 83, (kd) (this));
                            return;
                          }
                          this.field_T = true;
                          return;
                        }
                        if (this.field_C == 6) {
                          if (this.field_y != 5) {
                            if (18 == this.field_y) {
                              this.a(200, 750, 3, -112, 75);
                            } else {
                              if (this.field_y == 31) {
                                this.a(500, 1000, 3, -98, 100);
                              }
                            }
                          } else {
                            this.a(25, 500, 3, param0 - 111, 50);
                          }
                          if (!this.field_I) {
                            this.field_B.field_J.a((byte) 66, (kd) (this));
                            return;
                          }
                          this.field_T = true;
                          return;
                        }
                        if (this.field_C != 2) {
                          if (3 == this.field_C) {
                            if (this.field_y == 6) {
                              this.a(25, 300, 0, -115, 25);
                            } else {
                              if (34 == this.field_y) {
                                this.a(200, 500, 0, param0 ^ 97, 75);
                              }
                            }
                            if (this.field_I) {
                              this.field_T = true;
                              return;
                            }
                            this.field_B.field_J.a((byte) 76, (kd) (this));
                            return;
                          }
                          if (5 != this.field_C) {
                            if (this.field_I) {
                              this.field_T = true;
                              return;
                            }
                            this.field_B.field_J.a((byte) 75, (kd) (this));
                            return;
                          }
                          if (this.field_y == 3) {
                            this.a(50, 2, 0, false, 5, (byte) -121);
                          } else {
                            if (this.field_y == 16) {
                              this.a(100, 4, 0, false, 5, (byte) -114);
                            } else {
                              if (this.field_y == 29) {
                                this.a(150, 8, 0, false, 5, (byte) -98);
                              }
                            }
                          }
                          if (!this.field_I) {
                            this.field_B.field_J.a((byte) 115, (kd) (this));
                            return;
                          }
                          this.field_T = true;
                          return;
                        }
                        if (9 != this.field_y) {
                          if (this.field_y != 7) {
                            if (8 != this.field_y) {
                              if (this.field_y == 20) {
                                this.a(200, 1500, 0, param0 - 108, 150);
                              } else {
                                if (this.field_y == 33) {
                                  this.a(400, 2500, 0, param0 - 119, 200);
                                } else {
                                  if (this.field_y != 19) {
                                    if (this.field_y == 32) {
                                      if (!this.field_I &&
                                        !this.field_V) {
                                        fc.a((byte) 45, 104, this.field_U);
                                      }
                                      this.a(250, 1500, 0, -96, 50);
                                      this.a(5000, 5000, 2, -95, 500);
                                      this.a(5000, 2500, 3, param0 ^ 117, 500);
                                      if (this.field_B.field_b == 0 &&
                                        !this.field_V) {
                                        this.field_B.field_b = 1;
                                      }
                                    }
                                  } else {
                                    this.a(10, 256, 0, -103, 10);
                                  }
                                }
                              }
                            } else {
                              this.a(50, 1000, 8, -103, 25);
                            }
                          } else {
                            this.a(25, 1000, 0, -100, 50);
                          }
                        } else {
                          this.field_W = true;
                          this.a(500, 1000, 2, -122, 1500);
                        }
                        if (this.field_I) {
                          this.field_T = true;
                          return;
                        }
                        this.field_B.field_J.a((byte) 80, (kd) (this));
                        return;
                      }
                      if (this.field_y != 2) {
                        if (this.field_y != 13) {
                          if (this.field_y != 15) {
                            if (14 != this.field_y) {
                              if (this.field_y != 28) {
                                if (27 == this.field_y) {
                                  this.a(20, 512, 0, param0 ^ 100, 50);
                                }
                              } else {
                                if (this.field_Z < 20) {
                                  this.field_O = this.field_O / 2;
                                  this.a(10, 100, 0, -107, 50);
                                } else {
                                  this.a(40, 1500, 0, param0 - 118, 50);
                                }
                              }
                            } else {
                              if (this.field_Z < 20) {
                                this.field_O = this.field_O / 2;
                                this.a(10, 32, 0, -110, 25);
                              } else {
                                this.a(20, 750, 0, -124, 25);
                              }
                            }
                          } else {
                            if (this.field_Z >= this.field_jb &&
                              null != this.field_X &&
                              this.field_E) {
                              this.a(32, 5, 0, false, 25, (byte) -126);
                            } else {
                              this.a(32, 5, 0, false, 25, (byte) -107);
                            }
                          }
                        } else {
                          this.a(10, 32, 0, -101, 50);
                        }
                      } else {
                        this.a(1, 32, 1, param0 - 101, 5);
                      }
                      if (!this.field_I) {
                        this.field_B.field_J.a((byte) 92, (kd) (this));
                      } else {
                        this.field_T = true;
                      }
                    } else {
                      if (this.field_y != 10) {
                        if (this.field_y == 21) {
                          this.a(1500, 3, 2, false, 20, (byte) -105);
                        } else {
                          if (!this.field_T) {
                            if (!this.field_B.field_h &&
                              !this.field_V) {
                              var3_ref2Lifetime1Lifetime1 = nk.a(2, 0, this.field_B, 114, -(this.field_B.field_ab.a((byte) -109, this.field_U >> 4) << 4) - 8, this.field_ob, 250, 0, this.field_U, this.field_U);
                              this.field_B.field_O.a(param0 ^ -4, var3_ref2Lifetime1Lifetime1);
                            }
                            if (!this.field_B.field_h &&
                              !this.field_V) {
                              stackIn_316_0 = 13;
                              stackIn_316_1 = -this.field_eb / 2;
                              stackIn_316_2 = this.field_B;
                              stackIn_316_3 = param0 ^ -112;
                              stackIn_316_4 = this.field_A;
                              stackIn_316_5 = this.field_ob;
                              if (this.field_y == 17) {
                                stackIn_317_6 = 100;
                              } else {
                                stackIn_317_6 = 20;
                              }
                              var3_ref2Lifetime1Lifetime1 = nk.a(stackIn_316_0, stackIn_316_1, stackIn_316_2, stackIn_316_3, stackIn_316_4, stackIn_316_5, stackIn_317_6, -this.field_F / 2, this.field_U, this.field_U);
                              this.field_B.field_O.a(3, var3_ref2Lifetime1Lifetime1);
                            }
                          } else {
                            this.a(32, 1, 1, false, 10, (byte) -98);
                            if (!this.field_B.field_h &&
                              !this.field_V) {
                              stackIn_306_0 = 13;
                              stackIn_306_1 = -this.field_eb / 2;
                              stackIn_306_2 = this.field_B;
                              stackIn_306_3 = param0 + 121;
                              stackIn_306_4 = this.field_A;
                              stackIn_306_5 = this.field_ob;
                              if (this.field_y == 17) {
                                stackIn_307_6 = 100;
                              } else {
                                stackIn_307_6 = 20;
                              }
                              var3_ref2Lifetime1Lifetime1 = nk.a(stackIn_306_0, stackIn_306_1, stackIn_306_2, stackIn_306_3, stackIn_306_4, stackIn_306_5, stackIn_307_6, -this.field_F / 2, this.field_U, this.field_U);
                              this.field_B.field_O.a(3, var3_ref2Lifetime1Lifetime1);
                            }
                          }
                        }
                      } else {
                        this.a(32, 1, 2, false, 10, (byte) -99);
                      }
                      if (!this.field_I) {
                        this.field_B.field_J.a((byte) 100, (kd) (this));
                      } else {
                        this.field_T = true;
                      }
                    }
                  } else {
                    if (this.field_y == 0) {
                      this.a(2, 500, 2, param0 - 117, 100);
                    } else {
                      if (11 == this.field_y) {
                        this.a(10, 750, 2, -122, 500);
                      }
                    }
                    if (!this.field_I) {
                      this.field_B.field_J.a((byte) 77, (kd) (this));
                      break L27;
                    }
                    this.field_T = true;
                  }
                }
                return;
              }
              break;
            }
            if (this.field_W &&
              !this.field_V) {
              var12 = new jc(this.field_B.field_db);
              var3_ref3Lifetime1 = (wl) (var12.b(param0 ^ -3));
              while (var3_ref3Lifetime1 != null) {
                var4Lifetime1Lifetime3 = this.field_U - var3_ref3Lifetime1.field_U;
                var5Lifetime3 = this.field_A - var3_ref3Lifetime1.field_A;
                stackIn_456_0Lifetime1 = 2;
                stackIn_456_1Lifetime1 = var3_ref3Lifetime1.field_C;
                if ((stackIn_456_0Lifetime1 == stackIn_456_1Lifetime1 ||
                  var3_ref3Lifetime1.field_C == 3 ||
                  var3_ref3Lifetime1.field_C == 20) &&
                  (var3_ref3Lifetime1.field_y != 32 &&
                  Math.abs(var4Lifetime1Lifetime3) <= 256 &&
                  Math.abs(var5Lifetime3) <= 256)) {
                  if (20 != var3_ref3Lifetime1.field_C) {
                    var3_ref3Lifetime1.field_T = true;
                  }
                  if (this.field_X != null &&
                    this.field_X != var3_ref3Lifetime1.field_X) {
                    this.field_X.field_ob = this.field_X.field_ob + 1;
                  }
                  var3_ref3Lifetime1.field_X = this.field_X;
                  if (this.field_C == 7) {
                    this.field_P = true;
                  }
                  var3_ref3Lifetime1.field_bb = true;
                }
                var3_ref3Lifetime1 = (wl) (var12.d(param0 ^ -3));
              }
            }
            stackIn_456_0Lifetime2 = param0;
            stackIn_456_1Lifetime2 = ~this.field_L;
            if (stackIn_456_0Lifetime2 > stackIn_456_1Lifetime2) {
              this.field_L = this.field_L - 1;
            }
            if (this.field_H) {
              this.field_F = this.field_F + this.field_B.field_z;
              if (this.field_C == 4) {
                this.field_F = this.field_F + 3 * this.field_B.field_z;
              }
            }
            this.field_Z = this.field_Z + 1;
            if (this.field_U >= -128 &&
              this.field_U <= (this.field_B.field_ab.a(param0 - 126) << 4) + 128) {
              return;
            }
            if (this.field_I) {
              this.field_T = true;
            } else {
              this.field_B.field_J.a((byte) 42, (kd) (this));
            }
            return;
          }
          if (this.field_nb == null) {
            var2_ref_mb = (mb) (this.field_B.field_K.e(13058));
            while (var2_ref_mb != null) {
              if (var2_ref_mb.field_rb > 0 &&
                !var2_ref_mb.field_pc && ((var2_ref_mb.field_jc == 1 &&
                -1 == this.field_eb ||
                0 == var2_ref_mb.field_jc &&
                this.field_eb == 1) &&
                (this.field_nb == null ||
                !(Math.abs(var2_ref_mb.field_hc - this.field_U) >= Math.abs(this.field_nb.field_hc - this.field_U))))) {
                this.field_nb = var2_ref_mb;
                this.field_K = this.field_nb.field_hc;
                this.field_S = this.field_nb.field_Gb;
              }
              var2_ref_mb = (mb) (this.field_B.field_K.a((byte) -93));
            }
            if (this.field_nb == null) {
              this.field_B.field_J.a((byte) 97, (kd) (this));
            }
            return;
          }
          if (!(this.field_nb.field_rb > 0) ||
            this.field_nb.field_Hb) {
            this.field_B.field_J.a((byte) 40, (kd) (this));
          }
          if (!this.field_B.field_h &&
            this.field_Z < 125) {
            var2_doubleLifetime1 = Math.random() * 3.14;
            var4Lifetime1Lifetime1 = (int)(Math.sin(var2_doubleLifetime1) * 1024.0);
            var5Lifetime1 = (int)(1024.0 * Math.cos(var2_doubleLifetime1));
            var6Lifetime1 = -(this.field_Z / 4) + 50 - (int)(Math.random() * (double)this.field_Z / 4.0);
            var7Lifetime1 = nk.a(4, var4Lifetime1Lifetime1, this.field_B, param0 ^ -119, -(var5Lifetime1 * var6Lifetime1) + this.field_A, this.field_ob, 50, var5Lifetime1, -(var4Lifetime1Lifetime1 * var6Lifetime1) + this.field_U, this.field_U);
            this.field_B.field_O.a(3, var7Lifetime1);
          }
          if (this.field_Z >= 100 &&
            this.field_Z < 1000) {
            this.field_U = this.field_U + this.field_eb * 1000;
            var2Lifetime2Lifetime1 = (-100 + this.field_Z) * (this.field_nb.field_hc - this.field_U) / 900 + this.field_U;
            var3_intLifetime2 = (-100 + this.field_Z) * (-this.field_A + this.field_nb.field_Gb) / 900 + this.field_A;
            if (!this.field_B.field_h) {
              var4_ref_qb = nk.a(4, 0, this.field_B, 125, var3_intLifetime2, this.field_ob, 50, 1000 * (1 & this.field_B.field_r) - 500, var2Lifetime2Lifetime1, this.field_U);
              this.field_B.field_O.a(param0 + 4, var4_ref_qb);
              var4_ref_qbLifetime1 = nk.a(1, 0, this.field_B, 125, var3_intLifetime2, this.field_ob, 100, 0, var2Lifetime2Lifetime1, this.field_U);
              this.field_B.field_O.a(3, var4_ref_qbLifetime1);
            }
          }
          this.field_Z = this.field_Z + 1;
          if (this.field_Z >= 1000) {
            this.field_U = this.field_nb.field_hc;
            this.field_A = this.field_nb.field_Gb;
            this.a(1000, 5000, 0, param0 - 121, 200);
            var2Lifetime2Lifetime2 = -1;
            var3_intLifetime2Lifetime1 = 0;
            while (var3_intLifetime2Lifetime1 < 2) {
              var4Lifetime1Lifetime2 = this.field_B.field_ab.field_o[var3_intLifetime2Lifetime1];
              var5Lifetime2 = -1080;
              var6Lifetime2 = 4800;
              var7_int = (this.field_U >> 4) - var4Lifetime1Lifetime2;
              var8 = (this.field_A >> 4) - var5Lifetime2;
              stackIn_151_0 = var6Lifetime2 * var6Lifetime2;
              stackIn_151_1 = var7_int * var7_int + var8 * var8;
              if (stackIn_151_0 > stackIn_151_1) {
                var2Lifetime2Lifetime2 = var3_intLifetime2Lifetime1;
              }
              var3_intLifetime2Lifetime1++;
            }
            stackIn_151_0Lifetime1 = -2;
            stackIn_151_1Lifetime1 = ~this.field_eb;
            if (stackIn_151_0Lifetime1 == stackIn_151_1Lifetime1 &&
              1 == var2Lifetime2Lifetime2) {
              if ((this.field_B.field_v & 8) != 0) {
                this.field_A = this.field_A + 10000;
                this.field_U = this.field_U + 25000;
                this.field_B.field_v = this.field_B.field_v | 32;
                this.a(2000, 5000, 0, -122, 400);
                this.field_U = this.field_U - 50000;
                this.field_A = this.field_A - 30000;
                this.a(2000, 5000, 0, -104, 500);
                this.field_B.g(-121, 1);
              }
              this.field_B.field_v = this.field_B.field_v | 8;
              this.field_B.field_v = this.field_B.field_v | 2;
            } else {
              if (this.field_eb == -1 &&
                var2Lifetime2Lifetime2 == 0) {
                if (0 != (4 & this.field_B.field_v)) {
                  this.field_U = this.field_U - 25000;
                  this.field_A = this.field_A + 10000;
                  this.field_B.field_v = this.field_B.field_v | 16;
                  this.a(2000, 5000, 0, -128, 400);
                  this.field_U = this.field_U + 50000;
                  this.field_A = this.field_A - 30000;
                  this.a(2000, 5000, 0, param0 ^ 95, 500);
                  this.field_B.g(-116, 0);
                }
                this.field_B.field_v = this.field_B.field_v | 4;
                this.field_B.field_v = this.field_B.field_v | 1;
              }
            }
            this.field_B.field_J.a((byte) 125, (kd) (this));
            return;
          }
        }
    }

    public static void h(int param0) {
        field_Y = null;
        field_R = null;
        field_J = null;
        field_db = null;
        if (param0 != 31554) {
          field_Y = (String) null;
        }
        field_N = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13) {
        int incrementValue$1 = 0;
        int var14;
        int var15;
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
        int var15Lifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        int var18Lifetime1;
        int var19Lifetime1;
        int var20Lifetime1;
        int var21Lifetime1;
        int var22Lifetime1;
        int var23Lifetime1;
        int var24Lifetime1;
        int var25Lifetime1;
        int var26Lifetime1;
        int var24Lifetime2;
        int var24Lifetime1Lifetime1;
        var14 = (param0 << 4) - param13;
        var15 = param11;
        var16 = param1;
        var17 = param2;
        for (var18 = param8; var18 < param9; var18++) {
          if (var16 < param5) {
            var19 = (var18 << 4) - param12;
            var20 = (var16 << param4) / param6;
            var21 = ff.field_kb[var20] * param10 >> 15;
            var22 = var18 + (var19 * var21 + 131072 >> 18);
            if (var22 > 639) {
              var22 = 639;
            }
            var23 = param0 + (var14 * var21 + 131072 >> 18);
            if (var23 < 0) {
              var23 = 0;
            }
            var24 = pb.field_g[var23 * 640 + var22];
            var25 = 64 + (ff.field_ib[var20] * param10 >> 17);
            if (var25 < 0) {
              var25 = -var25;
            }
            var26 = (var24 & 16711935) * var25;
            var25 = (var24 & 65280) * var25;
            var24Lifetime2 = (var26 & 1069563840) + (var25 & 4177920);
            var26 = (var26 & -1073692672) + (var25 & 12582912);
            var26 = (var26 | var26 >>> 1) & 1077952512;
            incrementValue$1 = var15;
            var15++;
            pb.field_g[incrementValue$1] = (var24Lifetime2 | var26 - (var26 >>> 8)) >>> 6;
            var16 = var16 + var17;
            var17 = var17 + param3;
            continue;
          }
          break;
        }
        var15Lifetime1 = param11;
        var16Lifetime1 = param1;
        var17Lifetime1 = param2;
        for (var18Lifetime1 = param8 - 1; var18Lifetime1 >= param7; var18Lifetime1--) {
          var17Lifetime1 = var17Lifetime1 - param3;
          var16Lifetime1 = var16Lifetime1 - var17Lifetime1;
          if (var16Lifetime1 >= param5) {
            return;
          }
          var19Lifetime1 = (var18Lifetime1 << 4) - param12;
          var20Lifetime1 = (var16Lifetime1 << param4) / param6;
          var21Lifetime1 = ff.field_kb[var20Lifetime1] * param10 >> 15;
          var22Lifetime1 = var18Lifetime1 + (var19Lifetime1 * var21Lifetime1 + 131072 >> 18);
          if (var22Lifetime1 < 0) {
            var22Lifetime1 = 0;
          }
          var23Lifetime1 = param0 + (var14 * var21Lifetime1 + 131072 >> 18);
          if (var23Lifetime1 < 0) {
            var23Lifetime1 = 0;
          }
          var24Lifetime1 = pb.field_g[var23Lifetime1 * 640 + var22Lifetime1];
          var25Lifetime1 = 64 + (ff.field_ib[var20Lifetime1] * param10 >> 17);
          if (var25Lifetime1 < 0) {
            var25Lifetime1 = -var25Lifetime1;
          }
          var26Lifetime1 = (var24Lifetime1 & 16711935) * var25Lifetime1;
          var25Lifetime1 = (var24Lifetime1 & 65280) * var25Lifetime1;
          var24Lifetime1Lifetime1 = (var26Lifetime1 & 1069563840) + (var25Lifetime1 & 4177920);
          var26Lifetime1 = (var26Lifetime1 & -1073692672) + (var25Lifetime1 & 12582912);
          var26Lifetime1 = (var26Lifetime1 | var26Lifetime1 >>> 1) & 1077952512;
          var15Lifetime1--;
          pb.field_g[var15Lifetime1] = (var24Lifetime1Lifetime1 | var26Lifetime1 - (var26Lifetime1 >>> 8)) >>> 6;
        }
    }

    private final void g(int param0) {
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        boolean stackIn_20_1 = false;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int stackIn_15_0Lifetime1;
        int stackIn_15_1Lifetime1;
        var9 = SteelSentinels.field_G;
        if (param0 != 1354276) {
          this.field_P = true;
        }
        var2 = 0;
        if (3 == this.field_B.field_ab.b(103)) {
          var3 = this.field_B.field_ab.a(-123) >> 1;
          var4 = 600;
          var5 = 5120;
          var6 = -var3 + (this.field_U >> 4);
          var7 = -var4 + (this.field_A >> 4);
          if (var6 * var6 + var7 * var7 < var5 * var5) {
            var2 = 1;
          }
        } else {
          if (this.field_B.field_ab.b(52) == 4) {
            for (var3 = 0; var3 < 2; var3++) {
              stackIn_15_0 = 0;
              stackIn_15_1 = var3 + 1 & this.field_B.field_v;
              if (stackIn_15_0 == stackIn_15_1) {
                var4 = this.field_B.field_ab.field_o[var3];
                var5 = -1080;
                var6 = 4800;
                var7 = -var4 + (this.field_U >> 4);
                var8 = (this.field_A >> 4) - var5;
                if (var7 * var7 + var8 * var8 < var6 * var6) {
                  var2 = 1;
                }
              }
            }
          }
        }
        stackIn_15_0Lifetime1 = this.field_mb ? 1 : 0;
        stackIn_15_1Lifetime1 = var2;
        if (stackIn_15_0Lifetime1 != stackIn_15_1Lifetime1) {
          this.field_T = true;
        }
        stackIn_20_1 = (var2 != 0);
        this.field_mb = stackIn_20_1;
    }

    private final boolean c(int param0, int param1) {
        qb var3 = null;
        if (param0 != 2) {
          return true;
        }
        this.field_L = 10;
        if (!this.field_B.field_h &&
          !this.field_V) {
          var3 = nk.a(3, -this.field_eb / 2, this.field_B, 108, this.field_A, this.field_ob, 10, -this.field_F / 2, this.field_U, this.field_U);
          var3.field_I = 10 * this.field_Z / this.field_hb;
          this.field_B.field_O.a(param0 ^ 1, var3);
        }
        if (this.field_Z <= this.field_hb) {
        } else {
          if (!this.field_I) {
            this.field_B.field_J.a((byte) 127, (kd) (this));
          } else {
            this.field_T = true;
            return true;
          }
          return true;
        }
        this.field_H = false;
        return false;
    }

    wl(int param0, int param1, int param2, int param3, int param4, int param5, int param6, ee param7, mb param8, int param9, int param10, int param11) {
        int incrementValue$0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_11_1 = 0;
        int stackIn_17_1 = 0;
        boolean stackIn_22_1 = false;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var13_int = 0;
        RuntimeException var13 = null;
        jc var14 = null;
        mb var15 = null;
        this.field_M = 10;
        this.field_z = 50;
        try {
          this.field_A = param1;
          this.field_L = param5;
          this.field_y = param11;
          this.field_B = param7;
          this.field_X = param8;
          this.field_G = param8;
          this.field_O = param9;
          this.field_U = param0;
          this.field_C = param6;
          this.field_Z = 0;
          this.field_ib = param10;
          if (param3 >= 0) {
            if (param3 == 0) {
              stackIn_6_1 = 0;
            } else {
              stackIn_6_1 = 1;
            }
          } else {
            stackIn_6_1 = -1;
          }
          this.field_Q = stackIn_6_1;
          if (param2 >= 0) {
            if (param2 != 0) {
              stackIn_11_1 = 1;
            } else {
              stackIn_11_1 = 0;
            }
          } else {
            stackIn_11_1 = -1;
          }
          this.field_cb = stackIn_11_1;
          this.field_eb = param2;
          this.field_hb = param4;
          this.field_F = param3;
          this.field_K = this.field_U;
          this.field_S = this.field_A;
          this.g(1354276);
          if (this.field_X != null) {
            this.field_ob = this.field_X.field_u;
          }
          this.field_kb = 0;
          this.field_T = false;
          if (this.field_C != 5 &&
            15 != this.field_y) {
            stackIn_17_1 = 75;
          } else {
            stackIn_17_1 = 42;
          }
          this.field_jb = stackIn_17_1 * 4 / this.field_B.field_z;
          this.field_bb = false;
          this.field_gb = false;
          this.field_W = false;
          stackIn_22_1 = (this.field_y == 15) && (null != this.field_X) && (this.field_X.field_q > 0);
          this.field_E = stackIn_22_1;
          this.field_fb = new mb[this.field_B.field_K.b((byte) -128)];
          var13_int = 0;
          var14 = new jc(this.field_B.field_K);
          var15 = (mb) (var14.b(2));
          while (var15 != null) {
            if (var15.field_Zb.field_N != nn.field_c[0] ||
              null == this.field_X ||
              nn.field_c[0] != this.field_X.field_Zb.field_N) {
              incrementValue$0 = var13_int;
              var13_int++;
              this.field_fb[incrementValue$0] = var15;
            }
            var15 = (mb) (var14.d(2));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var13 = decompiledCaughtException;
          stackIn_32_0 = var13;
          stackIn_32_1 = new StringBuilder().append("wl.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          stackIn_35_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',');
          if (param8 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(')').toString());
        }
    }

    static {
        field_N = new rf();
        field_Y = "This private message is prefixed with \"<col=9090FF>To <%1>:</col>\" on your screen.<br>On <%1>'s screen, it will be prefixed with \"<col=FF6060>From <%0>:</col>\", which is<br>a different length and may leave less room for the message itself.<br><br>This shading covers the area which is not available on <%1>'s screen.<br>Provided your message fits to the left of the shaded area,<br><%1> should be able to see it in full.<br><br>(Note: this may be inaccurate if <%1> is playing in a different<br>language from you.)";
        field_db = new byte[520];
        field_lb = false;
        field_R = "This game has been updated! Please reload this page.";
        field_D = 0;
    }
}
