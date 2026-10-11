/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ia extends rh {
    private int field_ab;
    private int[] field_hb;
    private int field_H;
    private int field_u;
    private int[] field_P;
    private int field_pb;
    private int[] field_F;
    private int[] field_z;
    private int field_U;
    private int[] field_s;
    private int[] field_D;
    private int field_N;
    private ui field_I;
    private int[] field_r;
    private int field_L;
    private int[] field_T;
    private int[] field_v;
    private int[] field_gb;
    private int[] field_tb;
    private int field_C;
    private int[] field_mb;
    private int field_rb;
    private int[] field_jb;
    private int field_ib;
    private ui field_V;
    private int[] field_p;
    private int field_R;
    private int[] field_ob;
    private int[] field_G;
    private int[] field_eb;
    private int[] field_Y;
    private int[] field_y;
    private static int[] field_nb;
    private int field_X;
    private int field_t;
    private int[] field_B;
    private int[] field_lb;
    private int[] field_x;
    private int[] field_sb;
    private static int[] field_K;
    private int field_qb;
    private int[] field_q;
    private int[] field_E;
    private int field_Z;
    private int[] field_Q;
    private ei[] field_fb;
    private int[] field_cb;
    private int[] field_S;
    private int[] field_kb;
    private int[] field_db;
    private int field_A;
    private int field_W;
    private boolean field_w;
    private int[] field_J;
    private int field_M;
    private boolean[] field_O;
    private int[] field_bb;

    private final void e() {
        this.field_lb = new int[this.field_I.field_H];
        this.field_x = new int[this.field_I.field_H];
        this.field_T = new int[this.field_I.field_H];
        this.field_F = new int[this.field_I.field_H];
        this.field_s = new int[this.field_I.field_H];
        this.field_y = new int[this.field_I.field_H];
        this.field_sb = new int[this.field_I.field_H];
        this.field_eb = new int[this.field_I.field_H];
        this.field_gb = new int[this.field_I.field_H];
        this.field_Y = new int[this.field_I.field_H];
        this.field_B = new int[this.field_I.field_H];
        this.field_D = new int[this.field_I.field_H];
        this.field_mb = new int[this.field_I.field_H];
        this.field_cb = new int[this.field_I.field_H];
        this.field_S = new int[this.field_I.field_H];
        this.field_db = new int[this.field_I.field_H];
        this.field_r = new int[this.field_I.field_H];
        this.field_tb = new int[this.field_I.field_H];
        this.field_E = new int[this.field_I.field_H];
        this.field_ob = new int[this.field_I.field_H];
        this.field_z = new int[this.field_I.field_H];
        this.field_v = new int[this.field_I.field_H];
        this.field_P = new int[this.field_I.field_H];
        this.field_kb = new int[this.field_I.field_H];
        this.field_bb = new int[this.field_I.field_H];
        this.field_p = new int[this.field_I.field_H];
        this.field_hb = new int[this.field_I.field_H];
        this.field_G = new int[this.field_I.field_H];
        this.field_jb = new int[this.field_I.field_H];
        this.field_q = new int[this.field_I.field_H];
        this.field_J = new int[this.field_I.field_H];
        this.field_Q = new int[this.field_I.field_H];
        this.field_O = new boolean[this.field_I.field_H];
        this.field_fb = new ei[this.field_I.field_H];
        this.d();
    }

    private final void d(int param0) {
        if (this.field_fb[param0] != null) {
          this.field_fb[param0].g(en.field_o >> 7);
          this.field_fb[param0] = null;
        }
    }

    final synchronized void a(ui param0, int param1, int param2, int param3) {
        this.field_ib = param3;
        if (param0 != null) {
          this.field_V = param0;
        }
        this.field_M = param1;
        this.field_rb = param2;
    }

    final void b() {
        int var1 = 0;
        for (var1 = 0; var1 < this.field_I.field_H; var1++) {
          if (this.field_fb[var1] != null) {
            this.field_n.a(this.field_fb[var1]);
          }
        }
    }

    private final void d() {
        int var1 = 0;
        int var1Lifetime1;
        this.field_R = 0;
        this.field_pb = 0;
        this.field_X = 0;
        this.field_ab = 0;
        this.field_H = 0;
        this.field_t = 0;
        this.field_C = this.field_I.field_k;
        this.field_L = this.field_I.field_m;
        this.field_W = 64;
        for (var1 = 0; var1 < this.field_I.field_H; var1++) {
          this.field_sb[var1] = 0;
          this.field_eb[var1] = 0;
          this.field_gb[var1] = 0;
          this.field_Y[var1] = 0;
          this.field_B[var1] = 0;
          this.field_D[var1] = 0;
          this.field_mb[var1] = 0;
          this.field_cb[var1] = 0;
          this.field_S[var1] = 0;
          this.field_db[var1] = 0;
          this.field_r[var1] = 0;
          this.field_tb[var1] = 0;
          this.field_E[var1] = 0;
          this.field_ob[var1] = 0;
          this.field_z[var1] = 0;
          this.field_v[var1] = 0;
          this.field_P[var1] = -1;
          this.field_kb[var1] = 0;
          this.field_bb[var1] = 0;
          this.field_p[var1] = 0;
          this.field_hb[var1] = 0;
          this.field_G[var1] = 0;
          this.field_jb[var1] = 0;
          this.field_Q[var1] = 0;
          this.field_q[var1] = 0;
          this.field_J[var1] = 0;
          this.field_F[var1] = 0;
          this.field_lb[var1] = 0;
          this.field_x[var1] = 128;
          this.field_T[var1] = 0;
          this.field_s[var1] = -1;
        }
        this.field_ib = 0;
        this.field_V = null;
        this.field_M = -1;
        this.field_rb = -1;
        this.field_qb = 0;
        this.field_u = 0;
        this.field_N = -1;
        this.field_Z = 0;
        int var2 = 0;
        var1Lifetime1 = var2;
        while (var2 < this.field_I.field_H) {
          this.field_fb[var2] = null;
          this.field_O[var2] = false;
          var2++;
        }
        this.field_pb = 1;
    }

    final synchronized void a(int param0) {
        this.field_A = param0;
    }

    private final void a(int param0, int param1, int param2) {
        if (this.field_fb[param0] != null) {
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
          this.field_fb[param0].a(en.field_o >> 7, param1 * this.field_W * this.field_A >> 12, param2);
        }
    }

    final void a() {
        int var1 = 0;
        for (var1 = 0; var1 < this.field_I.field_H; var1++) {
          if (this.field_fb[var1] != null) {
            this.field_n.b(this.field_fb[var1]);
          }
        }
    }

    public static void f() {
        field_nb = null;
        field_K = null;
    }

    private final boolean c() {
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
        if (this.field_pb != 1 &&
          this.field_pb != 2) {
          this.field_R = 0;
          return false;
        }
        var14 = 0;
        if (this.field_R == 0) {
          if (this.field_pb == 1) {
            this.field_pb = 2;
            this.field_H = 0;
            this.field_ab = 0;
            this.field_t = this.field_I.field_s[this.field_H];
            this.field_X = 0;
          }
          if (!(this.field_ab < this.field_I.field_d[this.field_t]) ||
            this.field_Z == 1 ||
            this.field_qb != 0 &&
            this.field_ab % this.field_qb == 0 ||
            this.field_ib > 0 &&
            this.field_ab % this.field_ib == 0) {
            if (this.field_qb == 0) {
              this.field_H = this.field_H + 1;
            } else {
              if (this.field_u <= this.field_H) {
                var14 = 1;
              }
              this.field_H = this.field_u;
            }
            if (this.field_N != -1) {
              this.field_H = this.field_N;
              this.field_N = -1;
            }
            if (this.field_H >= this.field_I.field_i) {
              this.field_H = 0;
              var14 = 1;
            }
            this.field_ab = 0;
            if (this.field_Z == 1) {
              this.field_u = this.field_u / 16 * 10 + this.field_u % 16;
              if (this.field_u >= this.field_I.field_d[this.field_t]) {
                this.field_u = 0;
              }
              this.field_ab = this.field_u;
            }
            if (this.field_M >= 0 && (this.field_ib >= 0 ||
              var14 != 0)) {
              var15 = this.field_M;
              var16 = this.field_rb;
              if (this.field_V != null) {
                for (var17 = 0; var17 < this.field_I.field_H; var17++) {
                  this.d(var17);
                }
                this.field_I = this.field_V;
                this.e();
                this.field_pb = 2;
              }
              this.field_H = var15;
              this.field_ab = var16;
              var14 = 0;
              this.field_ib = 0;
              this.field_M = -1;
              this.field_rb = -1;
              this.field_V = null;
            }
            this.field_t = this.field_I.field_s[this.field_H];
            this.field_X = 0;
            for (var10 = 0; var10 < this.field_ab; var10++) {
              for (var15 = 0; var15 < this.field_I.field_H; var15++) {
                var16 = this.field_I.field_e[this.field_t][this.field_X] & 255;
                this.field_X = this.field_X + 1;
                if (var16 >= 128) {
                  var16 -= 128;
                } else {
                  this.field_X = this.field_X - 1;
                  var16 = 31;
                }
                if ((var16 & 1) == 1) {
                  this.field_X = this.field_X + 1;
                }
                if ((var16 & 2) == 2) {
                  this.field_X = this.field_X + 1;
                }
                if ((var16 & 4) == 4) {
                  this.field_X = this.field_X + 1;
                }
                if ((var16 & 8) == 8) {
                  this.field_X = this.field_X + 1;
                }
                if ((var16 & 16) == 16) {
                  this.field_X = this.field_X + 1;
                }
              }
            }
            this.field_N = -1;
            this.field_Z = 0;
            this.field_qb = 0;
          }
          this.field_ab = this.field_ab + 1;
        }
        for (var15 = 0; var15 < this.field_I.field_H; var15++) {
          L55: {
            if (this.field_R != 0) {
              if (this.field_P[var15] < 0) {
                break L55;
              }
              var16 = this.field_P[var15];
            } else {
              var16 = this.field_X;
            }
            this.field_P[var15] = -1;
            var17 = var16;
            var18 = -1;
            var19 = -1;
            var20 = -1;
            var21 = -1;
            var22 = -1;
            var23 = 0;
            var24 = this.field_I.field_e[this.field_t][var16] & 255;
            var16++;
            if (var24 >= 128) {
              var24 -= 128;
            } else {
              var16--;
              var24 = 31;
            }
            if ((var24 & 1) == 1) {
              var18 = this.field_I.field_e[this.field_t][var16] & 255;
              var16++;
            }
            if ((var24 & 2) == 2) {
              var19 = (this.field_I.field_e[this.field_t][var16] & 255) - 1;
              var16++;
            }
            if ((var24 & 4) == 4) {
              var20 = (this.field_I.field_e[this.field_t][var16] & 255) - 16;
              var16++;
            }
            if ((var24 & 8) == 8) {
              var22 = this.field_I.field_e[this.field_t][var16] & 255;
              var16++;
            }
            if ((var24 & 16) == 16) {
              var23 = this.field_I.field_e[this.field_t][var16] & 255;
              var16++;
            }
            if (this.field_R == 0) {
              this.field_X = var16;
            }
            if (!this.field_O[var15]) {
              if (var22 == 14) {
                var22 = var22 * 16 + var23 / 16;
                var23 = var23 & 15;
              }
              if (var22 == 236) {
                if (var23 != 0) {
                  if (this.field_R != var23) {
                    this.field_P[var15] = var17;
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
                this.field_R < var23) {
                this.field_P[var15] = var17;
              } else {
                if (var20 >= 80 &&
                  var20 < 96) {
                  this.field_q[var15] = 2;
                  this.field_sb[var15] = 80 - var20;
                  var20 = -1;
                }
                if (var20 >= 96 &&
                  var20 < 112) {
                  this.field_q[var15] = 2;
                  this.field_sb[var15] = var20 - 96;
                  var20 = -1;
                }
                if (var20 >= 112 &&
                  var20 < 128) {
                  var20 = this.field_lb[var15] - (var20 - 112);
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
                  var20 = this.field_lb[var15] + (var20 - 128);
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
                  this.field_J[var15] = 2;
                  this.field_eb[var15] = 192 - var20;
                  var20 = -1;
                }
                if (var20 >= 208 &&
                  var20 < 224) {
                  this.field_J[var15] = 2;
                  this.field_eb[var15] = var20 - 208;
                  var20 = -1;
                }
                if (var20 > 64) {
                  var20 = -1;
                }
                if (var22 == 13) {
                  if (this.field_qb > 1) {
                    this.field_qb = 1;
                  } else {
                    this.field_Z = 1;
                    this.field_u = var23;
                  }
                }
                if (var22 == 15) {
                  if (var23 >= 32) {
                    this.field_L = var23;
                  } else {
                    this.field_C = var23;
                  }
                }
                if (var22 == 16) {
                  this.field_W = var23;
                }
                if (var22 == 12) {
                  var20 = var23;
                }
                if (var22 == 8) {
                  var21 = var23;
                }
                if (var22 == 11 &&
                  this.field_qb <= 1) {
                  this.field_qb = 1;
                  this.field_u = var23;
                }
                if (var22 == 20) {
                  var18 = 97;
                }
                if (var22 == 21) {
                  this.field_kb[var15] = var23;
                  if (this.field_kb[var15] >= this.field_I.field_q[var3][this.field_I.field_q[var3].length - 1]) {
                    this.field_kb[var15] = this.field_I.field_q[var3][this.field_I.field_q[var3].length - 1] - 1;
                  }
                  this.field_bb[var15] = var23;
                  if (this.field_bb[var15] >= this.field_I.field_c[var3][this.field_I.field_c[var3].length - 1]) {
                    this.field_bb[var15] = this.field_I.field_c[var3][this.field_I.field_c[var3].length - 1] - 1;
                  }
                }
                if (var19 >= 0 &&
                  var18 <= 96) {
                  this.field_kb[var15] = 0;
                  this.field_bb[var15] = 0;
                  this.field_hb[var15] = 1;
                  this.field_G[var15] = 0;
                }
                if (var22 == 3 &&
                  var20 < 0 &&
                  var19 != -1) {
                  var20 = this.field_I.field_G[this.field_F[var15]];
                }
                if (var22 == 3 &&
                  var21 < 0 &&
                  var19 != -1) {
                  var21 = this.field_I.field_n[this.field_F[var15]];
                }
                if (var18 >= 0 &&
                  var18 <= 96 &&
                  var22 != 3) {
                  if (var19 == -1 &&
                    var20 < 0) {
                    var20 = this.field_lb[var15];
                  }
                  if (var19 == -1 &&
                    var21 < 0) {
                    var21 = this.field_x[var15];
                  }
                  if (var19 != -1) {
                    this.field_s[var15] = var19;
                    if (var18 >= 96) {
                      var19 = this.field_I.field_p[var19][95];
                    } else {
                      var19 = this.field_I.field_p[var19][var18];
                    }
                  } else {
                    var19 = this.field_F[var15];
                  }
                  if (var20 < 0) {
                    var20 = this.field_I.field_G[var19];
                  }
                  if (var21 < 0) {
                    var21 = this.field_I.field_n[var19];
                  }
                  var25 = 7680 - (var18 + this.field_I.field_b[var19]) * 64 - this.field_I.field_l[var19] / 2;
                  if (var25 >= 0) {
                    if (var25 > 7999) {
                      var25 = 7999;
                    }
                  } else {
                    var25 = 0;
                  }
                  this.field_z[var15] = var25;
                  var26 = field_nb[var25];
                  this.field_F[var15] = var19;
                  this.field_lb[var15] = var20;
                  this.field_x[var15] = var21;
                  this.field_T[var15] = var25;
                  var1 = 0;
                  if (var22 == 9) {
                    if (var23 * 256 <= this.field_I.field_B[var19]) {
                      var1 = var23 * 256;
                    } else {
                      var1 = this.field_I.field_B[var19];
                    }
                  }
                  this.a(var15, var19, var1, var26, var20, var21);
                  this.field_B[var15] = 0;
                } else {
                  if (var18 <= 96) {
                    if (var20 >= 0 ||
                      var21 >= 0) {
                      if (var20 >= 0) {
                        this.field_lb[var15] = var20;
                      }
                      if (var21 >= 0) {
                        this.field_x[var15] = var21;
                      }
                    }
                  } else {
                    if (this.field_p[var15] != 1) {
                      this.d(var15);
                    } else {
                      this.field_hb[var15] = 0;
                    }
                  }
                }
                L98: {
                  if (var22 != 3) {
                    if (var22 != 5) {
                      this.field_jb[var15] = 0;
                    }
                  } else {
                    this.field_jb[var15] = 1;
                    if (var18 >= 0) {
                      if (var18 <= 96) {
                        var19 = this.field_F[var15];
                        var25 = 7680 - (var18 + this.field_I.field_b[var19]) * 64 - this.field_I.field_l[var19] / 2;
                        if (var25 >= 0) {
                          if (var25 <= 7999) {
                            this.field_z[var15] = var25;
                            if ((var23 != 0)) {
                              this.field_v[var15] = var23;
                              if ((this.field_I.field_N == 0)) {
                                this.field_v[var15] = this.field_v[var15] * 2;
                              }
                            }
                            break L98;
                          }
                          var25 = 7999;
                        } else {
                          var25 = 0;
                        }
                        this.field_z[var15] = var25;
                        if (var23 != 0) {
                          this.field_v[var15] = var23;
                          if (this.field_I.field_N == 0) {
                            this.field_v[var15] = this.field_v[var15] * 2;
                          }
                        }
                      } else {
                        if (var23 != 0) {
                          this.field_v[var15] = var23;
                          if (this.field_I.field_N == 0) {
                            this.field_v[var15] = this.field_v[var15] * 2;
                          }
                        }
                      }
                    } else {
                      if (var23 != 0) {
                        this.field_v[var15] = var23;
                        if (this.field_I.field_N == 0) {
                          this.field_v[var15] = this.field_v[var15] * 2;
                        }
                      }
                    }
                  }
                }
                if (var22 != 4) {
                  if (var22 != 6) {
                    if (this.field_D[var15] != 0) {
                      var25 = field_nb[this.field_T[var15]];
                      this.b(var15, var25);
                    }
                    this.field_B[var15] = 0;
                    this.field_D[var15] = 0;
                  }
                } else {
                  this.field_D[var15] = 1;
                  if (var23 / 16 > 0) {
                    this.field_gb[var15] = var23 / 16;
                  }
                  if ((var23 & 15) > 0) {
                    this.field_Y[var15] = var23 & 15;
                  }
                }
                if (var22 != 17) {
                  this.field_Q[var15] = 0;
                } else {
                  this.field_Q[var15] = 1;
                  if (var23 != 0) {
                    this.field_y[var15] = (var23 & 240) / 16 - (var23 & 15);
                  }
                }
                if (var22 != 10 &&
                  var22 != 6 &&
                  var22 != 5) {
                  if (this.field_q[var15] != 2) {
                    this.field_q[var15] = 0;
                  } else {
                    this.field_q[var15] = 1;
                  }
                } else {
                  this.field_q[var15] = 1;
                  if (var23 != 0) {
                    this.field_sb[var15] = (var23 & 240) / 16 - (var23 & 15);
                  }
                }
                if (var22 != 25) {
                  if (this.field_J[var15] != 2) {
                    this.field_J[var15] = 0;
                  } else {
                    this.field_J[var15] = 1;
                  }
                } else {
                  this.field_J[var15] = 1;
                  if (var23 != 0) {
                    this.field_eb[var15] = (var23 & 240) / 16 - (var23 & 15);
                  }
                }
                if (var22 == 234) {
                  if (var23 != 0) {
                    this.field_mb[var15] = var23;
                  } else {
                    var23 = this.field_mb[var15];
                  }
                  this.field_lb[var15] = this.field_lb[var15] + var23;
                  if (this.field_lb[var15] >= 0) {
                    if (this.field_lb[var15] > 64) {
                      this.field_lb[var15] = 64;
                    }
                  } else {
                    this.field_lb[var15] = 0;
                  }
                }
                if (var22 == 235) {
                  if (var23 != 0) {
                    this.field_db[var15] = var23;
                  } else {
                    var23 = this.field_db[var15];
                  }
                  this.field_lb[var15] = this.field_lb[var15] - var23;
                  if (this.field_lb[var15] >= 0) {
                    if (this.field_lb[var15] > 64) {
                      this.field_lb[var15] = 64;
                    }
                  } else {
                    this.field_lb[var15] = 0;
                  }
                }
                if (var22 != 1) {
                  this.field_E[var15] = 0;
                } else {
                  if (var23 != 0) {
                    this.field_E[var15] = var23;
                  }
                }
                if (var22 != 2) {
                  this.field_ob[var15] = 0;
                } else {
                  if (var23 != 0) {
                    this.field_ob[var15] = var23;
                  }
                }
                switch (var22) {
                  case 225:
                    if (var23 != 0) {
                      this.field_cb[var15] = var23;
                    } else {
                      var23 = this.field_cb[var15];
                    }
                    this.field_T[var15] = this.field_T[var15] - var23 * 4;
                    if (this.field_T[var15] >= 0) {
                      if (this.field_T[var15] > 7999) {
                        this.field_T[var15] = 7999;
                      }
                    } else {
                      this.field_T[var15] = 0;
                    }
                    var25 = field_nb[this.field_T[var15]];
                    this.b(var15, var25);
                    break;
                  case 226:
                    if (var23 != 0) {
                      this.field_r[var15] = var23;
                    } else {
                      var23 = this.field_r[var15];
                    }
                    this.field_T[var15] = this.field_T[var15] + var23 * 4;
                    if (this.field_T[var15] >= 0) {
                      if (this.field_T[var15] > 7999) {
                        this.field_T[var15] = 7999;
                      }
                    } else {
                      this.field_T[var15] = 0;
                    }
                    var25 = field_nb[this.field_T[var15]];
                    this.b(var15, var25);
                    break;
                  case 33:
                    if (var23 / 16 != 1) {
                      var23 = var23 & 15;
                      if (var23 != 0) {
                        this.field_tb[var15] = var23;
                      } else {
                        var23 = this.field_tb[var15];
                      }
                      this.field_T[var15] = this.field_T[var15] + var23;
                      if (this.field_T[var15] >= 0) {
                        if (this.field_T[var15] > 7999) {
                          this.field_T[var15] = 7999;
                        }
                      } else {
                        this.field_T[var15] = 0;
                      }
                      var25 = field_nb[this.field_T[var15]];
                      this.b(var15, var25);
                    } else {
                      var23 = var23 & 15;
                      if (var23 != 0) {
                        this.field_S[var15] = var23;
                      } else {
                        var23 = this.field_S[var15];
                      }
                      this.field_T[var15] = this.field_T[var15] - var23;
                      if (this.field_T[var15] >= 0) {
                        if (this.field_T[var15] > 7999) {
                          this.field_T[var15] = 7999;
                        }
                      } else {
                        this.field_T[var15] = 0;
                      }
                      var25 = field_nb[this.field_T[var15]];
                      this.b(var15, var25);
                    }
                    break;
                  default:
                    break;
                }
              }
            }
          }
        }
        if (this.field_R > 0) {
          for (var15 = 0; var15 < this.field_I.field_H; var15++) {
            if (!this.field_O[var15]) {
              if (this.field_Q[var15] != 0) {
                this.field_W = this.field_W + this.field_y[var15];
                if (this.field_W >= 0) {
                  if (this.field_W > 64) {
                    this.field_W = 64;
                  }
                } else {
                  this.field_W = 0;
                }
              }
              if (this.field_q[var15] != 0 ||
                this.field_J[var15] != 0) {
                this.field_lb[var15] = this.field_lb[var15] + this.field_sb[var15];
                if (this.field_lb[var15] >= 0) {
                  if (this.field_lb[var15] > 64) {
                    this.field_lb[var15] = 64;
                  }
                } else {
                  this.field_lb[var15] = 0;
                }
                this.field_x[var15] = this.field_x[var15] + this.field_eb[var15];
                if (this.field_x[var15] >= 0) {
                  if (this.field_x[var15] > 255) {
                    this.field_x[var15] = 255;
                  }
                } else {
                  this.field_x[var15] = 0;
                }
              }
              if (this.field_D[var15] == 1) {
                this.field_B[var15] = (this.field_B[var15] + this.field_gb[var15]) % 68;
                var2 = field_K[this.field_B[var15]] * this.field_Y[var15] >> 8;
                var16 = this.field_T[var15] + var2;
                this.b(var15, field_nb[var16]);
              }
              if (this.field_E[var15] > 0) {
                this.field_T[var15] = this.field_T[var15] - this.field_E[var15] * 4;
                if (this.field_T[var15] >= 0) {
                  if (this.field_T[var15] > 7999) {
                    this.field_T[var15] = 7999;
                  }
                } else {
                  this.field_T[var15] = 0;
                }
                var16 = field_nb[this.field_T[var15]];
                this.b(var15, var16);
              }
              if (this.field_ob[var15] > 0) {
                this.field_T[var15] = this.field_T[var15] + this.field_ob[var15] * 4;
                if (this.field_T[var15] >= 0) {
                  if (this.field_T[var15] > 7999) {
                    this.field_T[var15] = 7999;
                  }
                } else {
                  this.field_T[var15] = 0;
                }
                var16 = field_nb[this.field_T[var15]];
                this.b(var15, var16);
              }
              if (this.field_jb[var15] > 0) {
                if (this.field_T[var15] < this.field_z[var15]) {
                  this.field_T[var15] = this.field_T[var15] + this.field_v[var15] * 4;
                  if (this.field_T[var15] > this.field_z[var15]) {
                    this.field_T[var15] = this.field_z[var15];
                  }
                }
                if (this.field_T[var15] > this.field_z[var15]) {
                  this.field_T[var15] = this.field_T[var15] - this.field_v[var15] * 4;
                  if (this.field_T[var15] < this.field_z[var15]) {
                    this.field_T[var15] = this.field_z[var15];
                  }
                }
                if (this.field_T[var15] >= 0) {
                  if (this.field_T[var15] > 7999) {
                    this.field_T[var15] = 7999;
                  }
                } else {
                  this.field_T[var15] = 0;
                }
                var16 = field_nb[this.field_T[var15]];
                this.b(var15, var16);
              }
            }
          }
        }
        for (var15 = 0; var15 < this.field_I.field_H; var15++) {
          if (!this.field_O[var15]) {
            var16 = this.field_lb[var15];
            var17 = this.field_x[var15];
            this.field_p[var15] = 0;
            if (this.field_s[var15] >= 0) {
              var3 = this.field_s[var15];
              if ((this.field_I.field_z[this.field_s[var15]] & 1) == 1) {
                this.field_p[var15] = 1;
                var4 = this.field_kb[var15];
                for (var5 = 0; this.field_I.field_q[var3][var5 + 1] < var4; var5++) {
                }
                var6 = this.field_I.field_q[var3][var5];
                var8 = this.field_I.field_q[var3][var5 + 1];
                var7 = this.field_I.field_F[var3][var5];
                var9 = this.field_I.field_F[var3][var5 + 1];
                if (var8 == var6) {
                  var8++;
                }
                var11 = ((var8 - var4) * var7 + (var4 - var6) * var9) / (var8 - var6);
                var12 = 32768 - this.field_G[var15];
                if (var12 < 0) {
                  var12 = 0;
                }
                var16 = var16 * var11 * var12 >> 21;
                if ((this.field_I.field_z[var3] & 2) == 2 &&
                  this.field_hb[var15] == 1 &&
                  this.field_kb[var15] == this.field_I.field_q[var3][this.field_I.field_r[var3]]) {
                  this.field_kb[var15] = this.field_kb[var15] - 1;
                }
                if (this.field_kb[var15] == this.field_I.field_q[var3][this.field_I.field_q[var3].length - 1]) {
                  this.field_kb[var15] = this.field_kb[var15] - 1;
                }
                if (this.field_hb[var15] == 0) {
                  this.field_G[var15] = this.field_G[var15] + this.field_I.field_v[var3];
                }
                this.field_kb[var15] = this.field_kb[var15] + 1;
                if ((this.field_I.field_z[var3] & 4) == 4 &&
                  this.field_kb[var15] == this.field_I.field_q[var3][this.field_I.field_K[var3]]) {
                  this.field_kb[var15] = this.field_I.field_q[var3][this.field_I.field_j[var3]];
                }
              }
              if ((this.field_I.field_O[this.field_s[var15]] & 1) == 1) {
                var4 = this.field_bb[var15];
                for (var5 = 0; this.field_I.field_c[var3][var5 + 1] < var4; var5++) {
                }
                var6 = this.field_I.field_c[var3][var5];
                var8 = this.field_I.field_c[var3][var5 + 1];
                var7 = this.field_I.field_a[var3][var5];
                var9 = this.field_I.field_a[var3][var5 + 1];
                if (var8 == var6) {
                  var8++;
                }
                var13 = ((var8 - var4) * var7 + (var4 - var6) * var9) / (var8 - var6);
                var17 = var17 + ((var13 - 32) * (128 - Math.abs(var17 - 128)) >> 5);
                if ((this.field_I.field_O[var3] & 2) == 2 &&
                  this.field_hb[var15] == 1 &&
                  this.field_bb[var15] == this.field_I.field_c[var3][this.field_I.field_J[var3]]) {
                  this.field_bb[var15] = this.field_bb[var15] - 1;
                }
                if (this.field_bb[var15] == this.field_I.field_c[var3][this.field_I.field_c[var3].length - 1]) {
                  this.field_bb[var15] = this.field_bb[var15] - 1;
                }
                this.field_bb[var15] = this.field_bb[var15] + 1;
                if ((this.field_I.field_O[var3] & 4) == 4 &&
                  this.field_bb[var15] == this.field_I.field_c[var3][this.field_I.field_I[var3]]) {
                  this.field_bb[var15] = this.field_I.field_c[var3][this.field_I.field_C[var3]];
                }
              }
            }
            this.a(var15, var16, var17);
          }
        }
        this.field_R = this.field_R + 1;
        if (this.field_R >= this.field_C) {
          this.field_R = 0;
        }
        return var14 != 0;
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        ud stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_14_2 = 0;
        ei stackIn_16_0 = null;
        int stackIn_17_1 = 0;
        ei stackIn_19_0 = null;
        boolean stackIn_20_1 = false;
        Throwable decompiledCaughtException = null;
        ei var7 = null;
        Object var8 = null;
        this.d(param0);
        if (param3 > field_nb[7999] &&
          param3 < field_nb[0]) {
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
          stackIn_13_0 = this.field_I.field_g[param1];
          stackIn_13_1 = param3 * 256 / en.field_o;
          if (param2 == 0) {
            stackIn_14_2 = param4 * this.field_W * this.field_A >> 12;
          } else {
            stackIn_14_2 = 0;
          }
          var7 = ei.b(stackIn_13_0, stackIn_13_1, stackIn_14_2, param5);
          var7.f(this.field_I.field_w[param1], this.field_I.field_f[param1]);
          stackIn_16_0 = var7;
          stackIn_17_1 = (this.field_I.field_M[param1] == 0) ? 0 : -1;
          ((ei) (Object) stackIn_16_0).f(stackIn_17_1);
          stackIn_19_0 = var7;
          stackIn_20_1 = (this.field_I.field_M[param1] != 2) ? false : true;
          ((ei) (Object) stackIn_19_0).a(stackIn_20_1);
          if (param2 != 0) {
            var7.e(param2);
            var7.a(en.field_o >> 7, param4 * this.field_W * this.field_A >> 12, param5);
          }
          this.field_fb[param0] = var7;
          if (this.field_n != null) {
            var8 = this.field_n;
            synchronized (var8) {
              this.field_n.a(var7);
            }
          }
          return;
        }
    }

    final int a(mi param0) {
        if (this.c() &&
          !this.field_w) {
          return -1;
        }
        int var3 = en.field_o;
        int var4 = (var3 << 9) + (var3 << 7);
        return var4 / (this.field_L * this.field_U);
    }

    private final void b(int param0, int param1) {
        if (this.field_fb[param0] != null) {
          this.field_fb[param0].d(param1 * 256 / en.field_o);
        }
    }

    final synchronized void c(int param0) {
        this.field_U = param0;
    }

    ia(ui param0) {
        this.field_u = 0;
        this.field_rb = -1;
        this.field_pb = 0;
        this.field_U = 256;
        this.field_V = null;
        this.field_ib = 0;
        this.field_R = 0;
        this.field_N = -1;
        this.field_Z = 0;
        this.field_w = true;
        this.field_A = 64;
        this.field_qb = 0;
        this.field_M = -1;
        this.field_I = param0;
        this.e();
    }

    static {
        int var0 = 0;
        int var0Lifetime1;
        field_nb = new int[8000];
        field_K = new int[68];
        for (var0 = 0; var0 < 8000; var0++) {
          field_nb[var0] = (int)(8363.0 * Math.pow(2.0, (double)(4608 - var0) / 768.0));
        }
        for (var0Lifetime1 = 0; var0Lifetime1 < 68; var0Lifetime1++) {
          field_K[var0Lifetime1] = (int)(-2048.0 * Math.sin((double)var0Lifetime1 * 0.0923998));
        }
    }
}
