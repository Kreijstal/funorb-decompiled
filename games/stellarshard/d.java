/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class d extends p {
    private int field_S;
    private int field_gb;
    private int[] field_U;
    private int[] field_r;
    private int[] field_ib;
    private int[] field_F;
    private static int[] field_K;
    private int[] field_bb;
    private int field_D;
    private gd[] field_B;
    private int field_eb;
    private int[] field_W;
    private int field_Z;
    private int[] field_cb;
    private int[] field_o;
    private int[] field_x;
    private int field_p;
    private boolean field_ab;
    private int[] field_v;
    private int field_s;
    private int[] field_n;
    private int field_z;
    private boolean[] field_Q;
    private int[] field_M;
    private int[] field_J;
    private int[] field_Y;
    private int[] field_mb;
    private jj field_H;
    private int field_ob;
    private int field_db;
    private int[] field_L;
    private int[] field_R;
    private int field_m;
    private int field_lb;
    private int[] field_nb;
    private int[] field_jb;
    private int field_pb;
    private int[] field_kb;
    private static int[] field_P;
    private int[] field_qb;
    private int field_V;
    private int[] field_t;
    private int[] field_q;
    private int[] field_N;
    private int[] field_I;
    private int[] field_hb;
    private int field_fb;
    private int field_T;
    private int[] field_X;
    private int field_A;
    private int[] field_G;
    private int[] field_w;
    private int field_O;
    private int[] field_C;
    private jj field_y;
    private int[] field_E;
    private int[] field_u;

    private final void a(int param0, int param1) {
        if (this.field_B[param0] != null) {
          this.field_B[param0].f(param1 * 256 / ba.field_m);
        }
    }

    public static void e() {
        field_P = null;
        field_K = null;
    }

    final synchronized void d(int param0) {
        this.field_A = param0;
    }

    private final void a(int param0) {
        if (this.field_B[param0] != null) {
          this.field_B[param0].g(ba.field_m >> 7);
          this.field_B[param0] = null;
        }
    }

    private final void f() {
        int var1 = 0;
        int var1Lifetime1;
        this.field_ob = 0;
        this.field_S = 0;
        this.field_s = 0;
        this.field_lb = 0;
        this.field_fb = 0;
        this.field_T = 0;
        this.field_Z = this.field_y.field_a;
        this.field_db = this.field_y.field_w;
        this.field_O = 64;
        for (var1 = 0; var1 < this.field_y.field_r; var1++) {
          this.field_ib[var1] = 0;
          this.field_Y[var1] = 0;
          this.field_U[var1] = 0;
          this.field_N[var1] = 0;
          this.field_F[var1] = 0;
          this.field_J[var1] = 0;
          this.field_C[var1] = 0;
          this.field_W[var1] = 0;
          this.field_cb[var1] = 0;
          this.field_hb[var1] = 0;
          this.field_I[var1] = 0;
          this.field_M[var1] = 0;
          this.field_x[var1] = 0;
          this.field_L[var1] = 0;
          this.field_qb[var1] = 0;
          this.field_u[var1] = 0;
          this.field_n[var1] = -1;
          this.field_o[var1] = 0;
          this.field_R[var1] = 0;
          this.field_bb[var1] = 0;
          this.field_nb[var1] = 0;
          this.field_jb[var1] = 0;
          this.field_t[var1] = 0;
          this.field_r[var1] = 0;
          this.field_X[var1] = 0;
          this.field_w[var1] = 0;
          this.field_v[var1] = 0;
          this.field_q[var1] = 0;
          this.field_kb[var1] = 128;
          this.field_mb[var1] = 0;
          this.field_E[var1] = -1;
        }
        this.field_p = 0;
        this.field_H = null;
        this.field_gb = -1;
        this.field_eb = -1;
        this.field_V = 0;
        this.field_D = 0;
        this.field_m = -1;
        this.field_pb = 0;
        int var2 = 0;
        var1Lifetime1 = var2;
        while (var2 < this.field_y.field_r) {
          this.field_B[var2] = null;
          this.field_Q[var2] = false;
          var2++;
        }
        this.field_S = 1;
    }

    final void a() {
        int var1 = 0;
        for (var1 = 0; var1 < this.field_y.field_r; var1++) {
          if (this.field_B[var1] != null) {
            this.field_k.b(this.field_B[var1]);
          }
        }
    }

    final int a(hl param0) {
        if (this.d() &&
          !this.field_ab) {
          return -1;
        }
        int var3 = ba.field_m;
        int var4 = (var3 << 9) + (var3 << 7);
        return var4 / (this.field_db * this.field_z);
    }

    private final void a(int param0, int param1, int param2) {
        if (this.field_B[param0] != null) {
          if (param1 < 0) {
            param1 = 0;
          } else {
            if (param1 > 64) {
              param1 = 64;
            }
          }
          if (param2 < 0) {
            param2 = 0;
          } else {
            if (param2 > 256) {
              param2 = 256;
            }
          }
          this.field_B[param0].b(ba.field_m >> 7, param1 * this.field_O * this.field_A >> 12, param2);
        }
    }

    private final void g() {
        this.field_q = new int[this.field_y.field_r];
        this.field_kb = new int[this.field_y.field_r];
        this.field_mb = new int[this.field_y.field_r];
        this.field_v = new int[this.field_y.field_r];
        this.field_E = new int[this.field_y.field_r];
        this.field_G = new int[this.field_y.field_r];
        this.field_ib = new int[this.field_y.field_r];
        this.field_Y = new int[this.field_y.field_r];
        this.field_U = new int[this.field_y.field_r];
        this.field_N = new int[this.field_y.field_r];
        this.field_F = new int[this.field_y.field_r];
        this.field_J = new int[this.field_y.field_r];
        this.field_C = new int[this.field_y.field_r];
        this.field_W = new int[this.field_y.field_r];
        this.field_cb = new int[this.field_y.field_r];
        this.field_hb = new int[this.field_y.field_r];
        this.field_I = new int[this.field_y.field_r];
        this.field_M = new int[this.field_y.field_r];
        this.field_x = new int[this.field_y.field_r];
        this.field_L = new int[this.field_y.field_r];
        this.field_qb = new int[this.field_y.field_r];
        this.field_u = new int[this.field_y.field_r];
        this.field_n = new int[this.field_y.field_r];
        this.field_o = new int[this.field_y.field_r];
        this.field_R = new int[this.field_y.field_r];
        this.field_bb = new int[this.field_y.field_r];
        this.field_nb = new int[this.field_y.field_r];
        this.field_jb = new int[this.field_y.field_r];
        this.field_t = new int[this.field_y.field_r];
        this.field_X = new int[this.field_y.field_r];
        this.field_w = new int[this.field_y.field_r];
        this.field_r = new int[this.field_y.field_r];
        this.field_Q = new boolean[this.field_y.field_r];
        this.field_B = new gd[this.field_y.field_r];
        this.f();
    }

    private final boolean d() {
        int var10 = 0;
        int var1;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
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
        int var21;
        int var22;
        int var23;
        int var24;
        int var25;
        int var26;
        var3 = 0;
        if (this.field_S != 1 &&
          this.field_S != 2) {
          this.field_ob = 0;
          return false;
        }
        var14 = 0;
        if (this.field_ob == 0) {
          if (this.field_S == 1) {
            this.field_S = 2;
            this.field_fb = 0;
            this.field_lb = 0;
            this.field_T = this.field_y.field_f[this.field_fb];
            this.field_s = 0;
          }
          if (!(this.field_lb < this.field_y.field_l[this.field_T]) ||
            this.field_pb == 1 ||
            this.field_V != 0 &&
            this.field_lb % this.field_V == 0 ||
            this.field_p > 0 &&
            this.field_lb % this.field_p == 0) {
            if (this.field_V == 0) {
              this.field_fb = this.field_fb + 1;
            } else {
              if (this.field_D <= this.field_fb) {
                var14 = 1;
              }
              this.field_fb = this.field_D;
            }
            if (this.field_m != -1) {
              this.field_fb = this.field_m;
              this.field_m = -1;
            }
            if (this.field_fb >= this.field_y.field_d) {
              this.field_fb = 0;
              var14 = 1;
            }
            this.field_lb = 0;
            if (this.field_pb == 1) {
              this.field_D = this.field_D / 16 * 10 + this.field_D % 16;
              if (this.field_D >= this.field_y.field_l[this.field_T]) {
                this.field_D = 0;
              }
              this.field_lb = this.field_D;
            }
            if (this.field_gb >= 0 && (this.field_p >= 0 ||
              var14 != 0)) {
              var15 = this.field_gb;
              var16 = this.field_eb;
              if (this.field_H != null) {
                for (var17 = 0; var17 < this.field_y.field_r; var17++) {
                  this.a(var17);
                }
                this.field_y = this.field_H;
                this.g();
                this.field_S = 2;
              }
              this.field_fb = var15;
              this.field_lb = var16;
              var14 = 0;
              this.field_p = 0;
              this.field_gb = -1;
              this.field_eb = -1;
              this.field_H = null;
            }
            this.field_T = this.field_y.field_f[this.field_fb];
            this.field_s = 0;
            for (var10 = 0; var10 < this.field_lb; var10++) {
              for (var15 = 0; var15 < this.field_y.field_r; var15++) {
                var16 = this.field_y.field_y[this.field_T][this.field_s] & 255;
                this.field_s = this.field_s + 1;
                if (var16 >= 128) {
                  var16 -= 128;
                } else {
                  this.field_s = this.field_s - 1;
                  var16 = 31;
                }
                if ((var16 & 1) == 1) {
                  this.field_s = this.field_s + 1;
                }
                if ((var16 & 2) == 2) {
                  this.field_s = this.field_s + 1;
                }
                if ((var16 & 4) == 4) {
                  this.field_s = this.field_s + 1;
                }
                if ((var16 & 8) == 8) {
                  this.field_s = this.field_s + 1;
                }
                if ((var16 & 16) == 16) {
                  this.field_s = this.field_s + 1;
                }
              }
            }
            this.field_m = -1;
            this.field_pb = 0;
            this.field_V = 0;
          }
          this.field_lb = this.field_lb + 1;
        }
        for (var15 = 0; var15 < this.field_y.field_r; var15++) {
          L55: {
            if (this.field_ob != 0) {
              if (this.field_n[var15] < 0) {
                break L55;
              }
              var16 = this.field_n[var15];
            } else {
              var16 = this.field_s;
            }
            this.field_n[var15] = -1;
            var17 = var16;
            var18 = -1;
            var19 = -1;
            var20 = -1;
            var21 = -1;
            var22 = -1;
            var23 = 0;
            var24 = this.field_y.field_y[this.field_T][var16] & 255;
            var16++;
            if (var24 >= 128) {
              var24 -= 128;
            } else {
              var16--;
              var24 = 31;
            }
            if ((var24 & 1) == 1) {
              var18 = this.field_y.field_y[this.field_T][var16] & 255;
              var16++;
            }
            if ((var24 & 2) == 2) {
              var19 = (this.field_y.field_y[this.field_T][var16] & 255) - 1;
              var16++;
            }
            if ((var24 & 4) == 4) {
              var20 = (this.field_y.field_y[this.field_T][var16] & 255) - 16;
              var16++;
            }
            if ((var24 & 8) == 8) {
              var22 = this.field_y.field_y[this.field_T][var16] & 255;
              var16++;
            }
            if ((var24 & 16) == 16) {
              var23 = this.field_y.field_y[this.field_T][var16] & 255;
              var16++;
            }
            if (this.field_ob == 0) {
              this.field_s = var16;
            }
            if (!this.field_Q[var15]) {
              if (var22 == 14) {
                var22 = var22 * 16 + var23 / 16;
                var23 = var23 & 15;
              }
              if (var22 == 236) {
                if (var23 != 0) {
                  if (this.field_ob != var23) {
                    this.field_n[var15] = var17;
                  } else {
                    var18 = 97;
                    var22 = -1;
                    var21 = -1;
                    var20 = -1;
                    var19 = -1;
                    var23 = 0;
                  }
                } else {
                  var18 = 97;
                }
              }
              if (var22 == 237 &&
                this.field_ob < var23) {
                this.field_n[var15] = var17;
              } else {
                if (var20 >= 80 &&
                  var20 < 96) {
                  this.field_X[var15] = 2;
                  this.field_ib[var15] = 80 - var20;
                  var20 = -1;
                }
                if (var20 >= 96 &&
                  var20 < 112) {
                  this.field_X[var15] = 2;
                  this.field_ib[var15] = var20 - 96;
                  var20 = -1;
                }
                if (var20 >= 112 &&
                  var20 < 128) {
                  var20 = this.field_q[var15] - (var20 - 112);
                  if (var20 >= 0) {
                    if (var20 > 64) {
                      var20 = 64;
                    }
                  } else {
                    var20 = 0;
                  }
                }
                if (var20 >= 128 &&
                  var20 < 136) {
                  var20 = this.field_q[var15] + (var20 - 128);
                  if (var20 >= 0) {
                    if (var20 > 64) {
                      var20 = 64;
                    }
                  } else {
                    var20 = 0;
                  }
                }
                if (var20 >= 176 &&
                  var20 < 192) {
                  var21 = (var20 - 176) * 17;
                  var20 = -1;
                }
                if (var20 >= 192 &&
                  var20 < 208) {
                  this.field_w[var15] = 2;
                  this.field_Y[var15] = 192 - var20;
                  var20 = -1;
                }
                if (var20 >= 208 &&
                  var20 < 224) {
                  this.field_w[var15] = 2;
                  this.field_Y[var15] = var20 - 208;
                  var20 = -1;
                }
                if (var20 > 64) {
                  var20 = -1;
                }
                if (var22 == 13) {
                  if (this.field_V > 1) {
                    this.field_V = 1;
                  } else {
                    this.field_pb = 1;
                    this.field_D = var23;
                  }
                }
                if (var22 == 15) {
                  if (var23 >= 32) {
                    this.field_db = var23;
                  } else {
                    this.field_Z = var23;
                  }
                }
                if (var22 == 16) {
                  this.field_O = var23;
                }
                if (var22 == 12) {
                  var20 = var23;
                }
                if (var22 == 8) {
                  var21 = var23;
                  if (var22 == 11 &&
                    this.field_V <= 1) {
                    this.field_V = 1;
                    this.field_D = var23;
                  }
                } else {
                  if (var22 == 11 &&
                    this.field_V <= 1) {
                    this.field_V = 1;
                    this.field_D = var23;
                  }
                }
                if (var22 == 20) {
                  var18 = 97;
                }
                if (var22 == 21) {
                  this.field_o[var15] = var23;
                  if (this.field_o[var15] >= this.field_y.field_L[var3][this.field_y.field_L[var3].length - 1]) {
                    this.field_o[var15] = this.field_y.field_L[var3][this.field_y.field_L[var3].length - 1] - 1;
                  }
                  this.field_R[var15] = var23;
                  if (this.field_R[var15] >= this.field_y.field_x[var3][this.field_y.field_x[var3].length - 1]) {
                    this.field_R[var15] = this.field_y.field_x[var3][this.field_y.field_x[var3].length - 1] - 1;
                    if (var19 >= 0 &&
                      var18 <= 96) {
                      this.field_o[var15] = 0;
                      this.field_R[var15] = 0;
                      this.field_nb[var15] = 1;
                      this.field_jb[var15] = 0;
                    }
                  } else {
                    if (var19 >= 0 &&
                      var18 <= 96) {
                      this.field_o[var15] = 0;
                      this.field_R[var15] = 0;
                      this.field_nb[var15] = 1;
                      this.field_jb[var15] = 0;
                    }
                  }
                } else {
                  if (var19 >= 0 &&
                    var18 <= 96) {
                    this.field_o[var15] = 0;
                    this.field_R[var15] = 0;
                    this.field_nb[var15] = 1;
                    this.field_jb[var15] = 0;
                  }
                }
                if (var22 == 3 &&
                  var20 < 0 &&
                  var19 != -1) {
                  var20 = this.field_y.field_J[this.field_v[var15]];
                }
                if (var22 == 3 &&
                  var21 < 0 &&
                  var19 != -1) {
                  var21 = this.field_y.field_h[this.field_v[var15]];
                }
                if (var18 >= 0 &&
                  var18 <= 96 &&
                  var22 != 3) {
                  if (var19 == -1 &&
                    var20 < 0) {
                    var20 = this.field_q[var15];
                  }
                  if (var19 == -1 &&
                    var21 < 0) {
                    var21 = this.field_kb[var15];
                  }
                  if (var19 != -1) {
                    this.field_E[var15] = var19;
                    if (var18 >= 96) {
                      var19 = this.field_y.field_C[var19][95];
                    } else {
                      var19 = this.field_y.field_C[var19][var18];
                    }
                  } else {
                    var19 = this.field_v[var15];
                  }
                  if (var20 < 0) {
                    var20 = this.field_y.field_J[var19];
                  }
                  if (var21 < 0) {
                    var21 = this.field_y.field_h[var19];
                  }
                  var25 = 7680 - (var18 + this.field_y.field_o[var19]) * 64 - this.field_y.field_n[var19] / 2;
                  if (var25 >= 0) {
                    if (var25 > 7999) {
                      var25 = 7999;
                    }
                  } else {
                    var25 = 0;
                  }
                  this.field_qb[var15] = var25;
                  var26 = field_P[var25];
                  this.field_v[var15] = var19;
                  this.field_q[var15] = var20;
                  this.field_kb[var15] = var21;
                  this.field_mb[var15] = var25;
                  var1 = 0;
                  if (var22 == 9) {
                    if (var23 * 256 <= this.field_y.field_m[var19]) {
                      var1 = var23 * 256;
                    } else {
                      var1 = this.field_y.field_m[var19];
                    }
                  }
                  this.a(var15, var19, var1, var26, var20, var21);
                  this.field_F[var15] = 0;
                } else {
                  if (var18 <= 96) {
                    if (var20 >= 0 ||
                      var21 >= 0) {
                      if (var20 >= 0) {
                        this.field_q[var15] = var20;
                      }
                      if (var21 >= 0) {
                        this.field_kb[var15] = var21;
                      }
                    }
                  } else {
                    if (this.field_bb[var15] != 1) {
                      this.a(var15);
                    } else {
                      this.field_nb[var15] = 0;
                    }
                  }
                }
                if (var22 != 3) {
                  if (var22 != 5) {
                    this.field_t[var15] = 0;
                  }
                } else {
                  this.field_t[var15] = 1;
                  if (var18 >= 0) {
                    if (var18 <= 96) {
                      var19 = this.field_v[var15];
                      var25 = 7680 - (var18 + this.field_y.field_o[var19]) * 64 - this.field_y.field_n[var19] / 2;
                      if (var25 >= 0) {
                        if (var25 > 7999) {
                          var25 = 7999;
                        }
                      } else {
                        var25 = 0;
                      }
                      this.field_qb[var15] = var25;
                      if (var23 != 0) {
                        this.field_u[var15] = var23;
                        if (this.field_y.field_s == 0) {
                          this.field_u[var15] = this.field_u[var15] * 2;
                        }
                      }
                    } else {
                      if (var23 != 0) {
                        this.field_u[var15] = var23;
                        if (this.field_y.field_s == 0) {
                          this.field_u[var15] = this.field_u[var15] * 2;
                        }
                      }
                    }
                  } else {
                    if (var23 != 0) {
                      this.field_u[var15] = var23;
                      if (this.field_y.field_s == 0) {
                        this.field_u[var15] = this.field_u[var15] * 2;
                      }
                    }
                  }
                }
                if (var22 != 4) {
                  if (var22 != 6) {
                    if (this.field_J[var15] != 0) {
                      var25 = field_P[this.field_mb[var15]];
                      this.a(var15, var25);
                    }
                    this.field_F[var15] = 0;
                    this.field_J[var15] = 0;
                  }
                } else {
                  this.field_J[var15] = 1;
                  if (var23 / 16 > 0) {
                    this.field_U[var15] = var23 / 16;
                  }
                  if ((var23 & 15) > 0) {
                    this.field_N[var15] = var23 & 15;
                  }
                }
                if (var22 != 17) {
                  this.field_r[var15] = 0;
                } else {
                  this.field_r[var15] = 1;
                  if (var23 != 0) {
                    this.field_G[var15] = (var23 & 240) / 16 - (var23 & 15);
                  }
                }
                if (var22 != 10 &&
                  var22 != 6 &&
                  var22 != 5) {
                  if (this.field_X[var15] != 2) {
                    this.field_X[var15] = 0;
                  } else {
                    this.field_X[var15] = 1;
                  }
                } else {
                  this.field_X[var15] = 1;
                  if (var23 != 0) {
                    this.field_ib[var15] = (var23 & 240) / 16 - (var23 & 15);
                  }
                }
                if (var22 != 25) {
                  if (this.field_w[var15] != 2) {
                    this.field_w[var15] = 0;
                  } else {
                    this.field_w[var15] = 1;
                  }
                } else {
                  this.field_w[var15] = 1;
                  if (var23 != 0) {
                    this.field_Y[var15] = (var23 & 240) / 16 - (var23 & 15);
                  }
                }
                if (var22 == 234) {
                  if (var23 != 0) {
                    this.field_C[var15] = var23;
                  } else {
                    var23 = this.field_C[var15];
                  }
                  this.field_q[var15] = this.field_q[var15] + var23;
                  if (this.field_q[var15] >= 0) {
                    if (this.field_q[var15] > 64) {
                      this.field_q[var15] = 64;
                    }
                  } else {
                    this.field_q[var15] = 0;
                  }
                }
                if (var22 == 235) {
                  if (var23 != 0) {
                    this.field_hb[var15] = var23;
                  } else {
                    var23 = this.field_hb[var15];
                  }
                  this.field_q[var15] = this.field_q[var15] - var23;
                  if (this.field_q[var15] >= 0) {
                    if (this.field_q[var15] > 64) {
                      this.field_q[var15] = 64;
                    }
                  } else {
                    this.field_q[var15] = 0;
                  }
                }
                if (var22 != 1) {
                  this.field_x[var15] = 0;
                } else {
                  if (var23 != 0) {
                    this.field_x[var15] = var23;
                  }
                }
                if (var22 != 2) {
                  this.field_L[var15] = 0;
                } else {
                  if (var23 != 0) {
                    this.field_L[var15] = var23;
                  }
                }
                switch (var22) {
                  case 225:
                    if (var23 != 0) {
                      this.field_W[var15] = var23;
                    } else {
                      var23 = this.field_W[var15];
                    }
                    this.field_mb[var15] = this.field_mb[var15] - var23 * 4;
                    if (this.field_mb[var15] >= 0) {
                      if (this.field_mb[var15] > 7999) {
                        this.field_mb[var15] = 7999;
                      }
                    } else {
                      this.field_mb[var15] = 0;
                    }
                    var25 = field_P[this.field_mb[var15]];
                    this.a(var15, var25);
                    break;
                  case 226:
                    if (var23 != 0) {
                      this.field_I[var15] = var23;
                    } else {
                      var23 = this.field_I[var15];
                    }
                    this.field_mb[var15] = this.field_mb[var15] + var23 * 4;
                    if (this.field_mb[var15] >= 0) {
                      if (this.field_mb[var15] > 7999) {
                        this.field_mb[var15] = 7999;
                      }
                    } else {
                      this.field_mb[var15] = 0;
                    }
                    var25 = field_P[this.field_mb[var15]];
                    this.a(var15, var25);
                    break;
                  case 33:
                    if (var23 / 16 != 1) {
                      var23 = var23 & 15;
                      if (var23 != 0) {
                        this.field_M[var15] = var23;
                      } else {
                        var23 = this.field_M[var15];
                      }
                      this.field_mb[var15] = this.field_mb[var15] + var23;
                      if (this.field_mb[var15] >= 0) {
                        if (this.field_mb[var15] > 7999) {
                          this.field_mb[var15] = 7999;
                        }
                      } else {
                        this.field_mb[var15] = 0;
                      }
                      var25 = field_P[this.field_mb[var15]];
                      this.a(var15, var25);
                    } else {
                      var23 = var23 & 15;
                      if (var23 != 0) {
                        this.field_cb[var15] = var23;
                      } else {
                        var23 = this.field_cb[var15];
                      }
                      this.field_mb[var15] = this.field_mb[var15] - var23;
                      if (this.field_mb[var15] >= 0) {
                        if (this.field_mb[var15] > 7999) {
                          this.field_mb[var15] = 7999;
                        }
                      } else {
                        this.field_mb[var15] = 0;
                      }
                      var25 = field_P[this.field_mb[var15]];
                      this.a(var15, var25);
                    }
                    break;
                  default:
                    break;
                }
              }
            }
          }
        }
        if (this.field_ob > 0) {
          for (var15 = 0; var15 < this.field_y.field_r; var15++) {
            if (!this.field_Q[var15]) {
              if (this.field_r[var15] != 0) {
                this.field_O = this.field_O + this.field_G[var15];
                if (this.field_O >= 0) {
                  if (this.field_O > 64) {
                    this.field_O = 64;
                  }
                } else {
                  this.field_O = 0;
                }
              }
              if (this.field_X[var15] != 0 ||
                this.field_w[var15] != 0) {
                this.field_q[var15] = this.field_q[var15] + this.field_ib[var15];
                if (this.field_q[var15] >= 0) {
                  if (this.field_q[var15] > 64) {
                    this.field_q[var15] = 64;
                  }
                } else {
                  this.field_q[var15] = 0;
                }
                this.field_kb[var15] = this.field_kb[var15] + this.field_Y[var15];
                if (this.field_kb[var15] >= 0) {
                  if (this.field_kb[var15] > 255) {
                    this.field_kb[var15] = 255;
                  }
                } else {
                  this.field_kb[var15] = 0;
                }
              }
              if (this.field_J[var15] == 1) {
                this.field_F[var15] = (this.field_F[var15] + this.field_U[var15]) % 68;
                var2 = field_K[this.field_F[var15]] * this.field_N[var15] >> 8;
                var16 = this.field_mb[var15] + var2;
                this.a(var15, field_P[var16]);
              }
              if (this.field_x[var15] > 0) {
                this.field_mb[var15] = this.field_mb[var15] - this.field_x[var15] * 4;
                if (this.field_mb[var15] >= 0) {
                  if (this.field_mb[var15] > 7999) {
                    this.field_mb[var15] = 7999;
                  }
                } else {
                  this.field_mb[var15] = 0;
                }
                var16 = field_P[this.field_mb[var15]];
                this.a(var15, var16);
              }
              if (this.field_L[var15] > 0) {
                this.field_mb[var15] = this.field_mb[var15] + this.field_L[var15] * 4;
                if (this.field_mb[var15] >= 0) {
                  if (this.field_mb[var15] > 7999) {
                    this.field_mb[var15] = 7999;
                  }
                } else {
                  this.field_mb[var15] = 0;
                }
                var16 = field_P[this.field_mb[var15]];
                this.a(var15, var16);
              }
              if (this.field_t[var15] > 0) {
                if (this.field_mb[var15] < this.field_qb[var15]) {
                  this.field_mb[var15] = this.field_mb[var15] + this.field_u[var15] * 4;
                  if (this.field_mb[var15] > this.field_qb[var15]) {
                    this.field_mb[var15] = this.field_qb[var15];
                  }
                }
                if (this.field_mb[var15] > this.field_qb[var15]) {
                  this.field_mb[var15] = this.field_mb[var15] - this.field_u[var15] * 4;
                  if (this.field_mb[var15] < this.field_qb[var15]) {
                    this.field_mb[var15] = this.field_qb[var15];
                  }
                }
                if (this.field_mb[var15] >= 0) {
                  if (this.field_mb[var15] > 7999) {
                    this.field_mb[var15] = 7999;
                  }
                } else {
                  this.field_mb[var15] = 0;
                }
                var16 = field_P[this.field_mb[var15]];
                this.a(var15, var16);
              }
            }
          }
        }
        for (var15 = 0; var15 < this.field_y.field_r; var15++) {
          if (!this.field_Q[var15]) {
            var16 = this.field_q[var15];
            var17 = this.field_kb[var15];
            this.field_bb[var15] = 0;
            if (this.field_E[var15] >= 0) {
              var3 = this.field_E[var15];
              if ((this.field_y.field_A[this.field_E[var15]] & 1) == 1) {
                this.field_bb[var15] = 1;
                var4 = this.field_o[var15];
                for (var5 = 0; this.field_y.field_L[var3][var5 + 1] < var4; var5++) {
                }
                var6 = this.field_y.field_L[var3][var5];
                var8 = this.field_y.field_L[var3][var5 + 1];
                var7 = this.field_y.field_I[var3][var5];
                var9 = this.field_y.field_I[var3][var5 + 1];
                if (var8 == var6) {
                  var8++;
                }
                var11 = ((var8 - var4) * var7 + (var4 - var6) * var9) / (var8 - var6);
                var12 = 32768 - this.field_jb[var15];
                if (var12 < 0) {
                  var12 = 0;
                }
                var16 = var16 * var11 * var12 >> 21;
                if ((this.field_y.field_A[var3] & 2) == 2 &&
                  this.field_nb[var15] == 1 &&
                  this.field_o[var15] == this.field_y.field_L[var3][this.field_y.field_D[var3]]) {
                  this.field_o[var15] = this.field_o[var15] - 1;
                }
                if (this.field_o[var15] == this.field_y.field_L[var3][this.field_y.field_L[var3].length - 1]) {
                  this.field_o[var15] = this.field_o[var15] - 1;
                }
                if (this.field_nb[var15] == 0) {
                  this.field_jb[var15] = this.field_jb[var15] + this.field_y.field_b[var3];
                }
                this.field_o[var15] = this.field_o[var15] + 1;
                if ((this.field_y.field_A[var3] & 4) == 4 &&
                  this.field_o[var15] == this.field_y.field_L[var3][this.field_y.field_q[var3]]) {
                  this.field_o[var15] = this.field_y.field_L[var3][this.field_y.field_e[var3]];
                }
              }
              if ((this.field_y.field_F[this.field_E[var15]] & 1) == 1) {
                var4 = this.field_R[var15];
                for (var5 = 0; this.field_y.field_x[var3][var5 + 1] < var4; var5++) {
                }
                var6 = this.field_y.field_x[var3][var5];
                var8 = this.field_y.field_x[var3][var5 + 1];
                var7 = this.field_y.field_g[var3][var5];
                var9 = this.field_y.field_g[var3][var5 + 1];
                if (var8 == var6) {
                  var8++;
                }
                var13 = ((var8 - var4) * var7 + (var4 - var6) * var9) / (var8 - var6);
                var17 = var17 + ((var13 - 32) * (128 - Math.abs(var17 - 128)) >> 5);
                if ((this.field_y.field_F[var3] & 2) == 2 &&
                  this.field_nb[var15] == 1 &&
                  this.field_R[var15] == this.field_y.field_x[var3][this.field_y.field_B[var3]]) {
                  this.field_R[var15] = this.field_R[var15] - 1;
                }
                if (this.field_R[var15] == this.field_y.field_x[var3][this.field_y.field_x[var3].length - 1]) {
                  this.field_R[var15] = this.field_R[var15] - 1;
                }
                this.field_R[var15] = this.field_R[var15] + 1;
                if ((this.field_y.field_F[var3] & 4) == 4 &&
                  this.field_R[var15] == this.field_y.field_x[var3][this.field_y.field_H[var3]]) {
                  this.field_R[var15] = this.field_y.field_x[var3][this.field_y.field_E[var3]];
                }
              }
            }
            this.a(var15, var16, var17);
          }
        }
        this.field_ob = this.field_ob + 1;
        if (this.field_ob >= this.field_Z) {
          this.field_ob = 0;
        }
        return var14 != 0;
    }

    final void c() {
        if (this.field_k != null) {
          throw new RuntimeException();
        }
        this.f();
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        ud stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_15_2 = 0;
        gd stackIn_17_0 = null;
        int stackIn_18_1 = 0;
        gd stackIn_20_0 = null;
        boolean stackIn_21_1 = false;
        Throwable decompiledCaughtException = null;
        gd var7 = null;
        Object var8 = null;
        this.a(param0);
        if (param3 > field_P[7999] &&
          param3 < field_P[0]) {
          if (param4 >= 0) {
            if (param4 > 64) {
              param4 = 64;
            }
          } else {
            param4 = 0;
          }
          if (param5 >= 0) {
            if (param5 > 255) {
              param5 = 255;
            }
          } else {
            param5 = 0;
          }
          stackIn_14_0 = this.field_y.field_j[param1];
          stackIn_14_1 = param3 * 256 / ba.field_m;
          if (param2 == 0) {
            stackIn_15_2 = param4 * this.field_O * this.field_A >> 12;
          } else {
            stackIn_15_2 = 0;
          }
          var7 = gd.a(stackIn_14_0, stackIn_14_1, stackIn_15_2, param5);
          var7.d(this.field_y.field_t[param1], this.field_y.field_v[param1]);
          stackIn_17_0 = var7;
          stackIn_18_1 = (this.field_y.field_c[param1] == 0) ? 0 : -1;
          ((gd) (Object) stackIn_17_0).e(stackIn_18_1);
          stackIn_20_0 = var7;
          stackIn_21_1 = (this.field_y.field_c[param1] != 2) ? false : true;
          ((gd) (Object) stackIn_20_0).a(stackIn_21_1);
          if (param2 != 0) {
            var7.h(param2);
            var7.b(ba.field_m >> 7, param4 * this.field_O * this.field_A >> 12, param5);
          }
          this.field_B[param0] = var7;
          if (this.field_k != null) {
            var8 = this.field_k;
            synchronized (var8) {
              this.field_k.a(var7);
            }
          }
          return;
        }
    }

    final void b() {
        int var1 = 0;
        for (var1 = 0; var1 < this.field_y.field_r; var1++) {
          if (this.field_B[var1] != null) {
            this.field_k.a(this.field_B[var1]);
          }
        }
    }

    d(jj param0) {
        this.field_D = 0;
        this.field_ob = 0;
        this.field_eb = -1;
        this.field_ab = true;
        this.field_m = -1;
        this.field_gb = -1;
        this.field_p = 0;
        this.field_S = 0;
        this.field_H = null;
        this.field_z = 256;
        this.field_V = 0;
        this.field_A = 64;
        this.field_pb = 0;
        this.field_y = param0;
        this.g();
    }

    static {
        int var0 = 0;
        int var0Lifetime1;
        field_K = new int[68];
        field_P = new int[8000];
        for (var0 = 0; var0 < 8000; var0++) {
          field_P[var0] = (int)(8363.0 * Math.pow(2.0, (double)(4608 - var0) / 768.0));
        }
        for (var0Lifetime1 = 0; var0Lifetime1 < 68; var0Lifetime1++) {
          field_K[var0Lifetime1] = (int)(-2048.0 * Math.sin((double)var0Lifetime1 * 0.0923998));
        }
    }
}
