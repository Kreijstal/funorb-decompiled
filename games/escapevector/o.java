/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class o extends il {
    private int[] field_m;
    private int[] field_Y;
    private int[] field_J;
    private int[] field_db;
    private static int[] field_o;
    private int field_C;
    private static int[] field_D;
    private int[] field_G;
    private int field_q;
    private int[] field_lb;
    private int[] field_L;
    private int[] field_fb;
    private int[] field_cb;
    private int[] field_R;
    private int[] field_l;
    private int[] field_S;
    private int field_ib;
    private hl[] field_T;
    private int field_r;
    private int field_jb;
    private int[] field_K;
    private int field_P;
    private int field_z;
    private int field_j;
    private int field_bb;
    private int[] field_n;
    private int[] field_Z;
    private int[] field_p;
    private int field_W;
    private boolean field_t;
    private ce field_u;
    private int field_k;
    private int field_H;
    private int[] field_eb;
    private int[] field_B;
    private int[] field_v;
    private int[] field_N;
    private int[] field_w;
    private int[] field_gb;
    private int[] field_U;
    private int field_x;
    private int[] field_s;
    private int field_I;
    private int[] field_ab;
    private boolean[] field_X;
    private int field_y;
    private int[] field_kb;
    private int[] field_Q;
    private ce field_F;
    private int[] field_E;
    private int[] field_O;
    private int field_M;
    private int[] field_A;
    private int field_hb;
    private int[] field_mb;
    private int field_i;
    private int[] field_V;

    final int a(hj param0) {
        if (this.c() &&
          !this.field_t) {
          return -1;
        }
        int var3 = ie.field_q;
        int var4 = (var3 << 9) + (var3 << 7);
        return var4 / (this.field_r * this.field_y);
    }

    final synchronized void a(boolean param0) {
        this.field_t = param0 ? true : false;
    }

    private final void a(int param0, int param1, int param2) {
        if (this.field_T[param0] != null) {
          if (param1 < 0) {
            param1 = 0;
          } else if (param1 > 64) {
            param1 = 64;
          }
          if (param2 < 0) {
            param2 = 0;
          } else if (param2 > 256) {
            param2 = 256;
          }
          this.field_T[param0].b(ie.field_q >> 7, param1 * this.field_i * this.field_jb >> 12, param2);
        }
    }

    private final void e(int param0) {
        if (this.field_T[param0] != null) {
          this.field_T[param0].g(ie.field_q >> 7);
          this.field_T[param0] = null;
        }
    }

    final void b() {
        for (int var1 = 0; var1 < this.field_u.field_B; var1++) {
          if (this.field_T[var1] != null) {
            this.field_h.b(this.field_T[var1]);
          }
        }
    }

    public static void d() {
        field_o = null;
        field_D = null;
    }

    private final void e() {
        this.field_P = 0;
        this.field_M = 0;
        this.field_bb = 0;
        this.field_j = 0;
        this.field_ib = 0;
        this.field_x = 0;
        this.field_k = this.field_u.field_L;
        this.field_r = this.field_u.field_i;
        this.field_i = 64;
        for (int var1 = 0; var1 < this.field_u.field_B; var1++) {
          this.field_N[var1] = 0;
          this.field_B[var1] = 0;
          this.field_gb[var1] = 0;
          this.field_E[var1] = 0;
          this.field_R[var1] = 0;
          this.field_fb[var1] = 0;
          this.field_db[var1] = 0;
          this.field_mb[var1] = 0;
          this.field_Q[var1] = 0;
          this.field_U[var1] = 0;
          this.field_p[var1] = 0;
          this.field_cb[var1] = 0;
          this.field_m[var1] = 0;
          this.field_ab[var1] = 0;
          this.field_l[var1] = 0;
          this.field_Z[var1] = 0;
          this.field_O[var1] = -1;
          this.field_K[var1] = 0;
          this.field_s[var1] = 0;
          this.field_J[var1] = 0;
          this.field_S[var1] = 0;
          this.field_Y[var1] = 0;
          this.field_G[var1] = 0;
          this.field_w[var1] = 0;
          this.field_L[var1] = 0;
          this.field_lb[var1] = 0;
          this.field_v[var1] = 0;
          this.field_A[var1] = 0;
          this.field_eb[var1] = 128;
          this.field_n[var1] = 0;
          this.field_kb[var1] = -1;
        }
        this.field_H = 0;
        this.field_F = null;
        this.field_z = -1;
        this.field_W = -1;
        this.field_I = 0;
        this.field_q = 0;
        this.field_C = -1;
        this.field_hb = 0;
        int var2 = 0;
        int var1Lifetime1 = var2;
        while (var2 < this.field_u.field_B) {
          this.field_T[var2] = null;
          this.field_X[var2] = false;
          var2++;
        }
        this.field_M = 1;
    }

    private final void f() {
        this.field_A = new int[this.field_u.field_B];
        this.field_eb = new int[this.field_u.field_B];
        this.field_n = new int[this.field_u.field_B];
        this.field_v = new int[this.field_u.field_B];
        this.field_kb = new int[this.field_u.field_B];
        this.field_V = new int[this.field_u.field_B];
        this.field_N = new int[this.field_u.field_B];
        this.field_B = new int[this.field_u.field_B];
        this.field_gb = new int[this.field_u.field_B];
        this.field_E = new int[this.field_u.field_B];
        this.field_R = new int[this.field_u.field_B];
        this.field_fb = new int[this.field_u.field_B];
        this.field_db = new int[this.field_u.field_B];
        this.field_mb = new int[this.field_u.field_B];
        this.field_Q = new int[this.field_u.field_B];
        this.field_U = new int[this.field_u.field_B];
        this.field_p = new int[this.field_u.field_B];
        this.field_cb = new int[this.field_u.field_B];
        this.field_m = new int[this.field_u.field_B];
        this.field_ab = new int[this.field_u.field_B];
        this.field_l = new int[this.field_u.field_B];
        this.field_Z = new int[this.field_u.field_B];
        this.field_O = new int[this.field_u.field_B];
        this.field_K = new int[this.field_u.field_B];
        this.field_s = new int[this.field_u.field_B];
        this.field_J = new int[this.field_u.field_B];
        this.field_S = new int[this.field_u.field_B];
        this.field_Y = new int[this.field_u.field_B];
        this.field_G = new int[this.field_u.field_B];
        this.field_L = new int[this.field_u.field_B];
        this.field_lb = new int[this.field_u.field_B];
        this.field_w = new int[this.field_u.field_B];
        this.field_X = new boolean[this.field_u.field_B];
        this.field_T = new hl[this.field_u.field_B];
        this.e();
    }

    private final boolean c() {
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var15;
        int var16;
        int var17;
        int var25;
        int var3 = 0;
        if (this.field_M != 1 &&
          this.field_M != 2) {
          this.field_P = 0;
          return false;
        }
        boolean var14 = false;
        if (this.field_P == 0) {
          if (this.field_M == 1) {
            this.field_M = 2;
            this.field_ib = 0;
            this.field_j = 0;
            this.field_x = this.field_u.field_x[this.field_ib];
            this.field_bb = 0;
          }
          if (!(this.field_j < this.field_u.field_l[this.field_x]) ||
            this.field_hb == 1 ||
            this.field_I != 0 &&
            this.field_j % this.field_I == 0 ||
            this.field_H > 0 &&
            this.field_j % this.field_H == 0) {
            if (this.field_I == 0) {
              this.field_ib = this.field_ib + 1;
            } else {
              if (this.field_q <= this.field_ib) {
                var14 = true;
              }
              this.field_ib = this.field_q;
            }
            if (this.field_C != -1) {
              this.field_ib = this.field_C;
              this.field_C = -1;
            }
            if (this.field_ib >= this.field_u.field_w) {
              this.field_ib = 0;
              var14 = true;
            }
            this.field_j = 0;
            if (this.field_hb == 1) {
              this.field_q = this.field_q / 16 * 10 + this.field_q % 16;
              if (this.field_q >= this.field_u.field_l[this.field_x]) {
                this.field_q = 0;
              }
              this.field_j = this.field_q;
            }
            if (this.field_z >= 0 && (this.field_H >= 0 ||
              var14)) {
              var15 = this.field_z;
              var16 = this.field_W;
              if (this.field_F != null) {
                for (var17 = 0; var17 < this.field_u.field_B; var17++) {
                  this.e(var17);
                }
                this.field_u = this.field_F;
                this.f();
                this.field_M = 2;
              }
              this.field_ib = var15;
              this.field_j = var16;
              var14 = false;
              this.field_H = 0;
              this.field_z = -1;
              this.field_W = -1;
              this.field_F = null;
            }
            this.field_x = this.field_u.field_x[this.field_ib];
            this.field_bb = 0;
            for (int var10 = 0; var10 < this.field_j; var10++) {
              for (var15 = 0; var15 < this.field_u.field_B; var15++) {
                var16 = this.field_u.field_C[this.field_x][this.field_bb] & 255;
                this.field_bb = this.field_bb + 1;
                if (var16 >= 128) {
                  var16 -= 128;
                } else {
                  this.field_bb = this.field_bb - 1;
                  var16 = 31;
                }
                if ((var16 & 1) == 1) {
                  this.field_bb = this.field_bb + 1;
                }
                if ((var16 & 2) == 2) {
                  this.field_bb = this.field_bb + 1;
                }
                if ((var16 & 4) == 4) {
                  this.field_bb = this.field_bb + 1;
                }
                if ((var16 & 8) == 8) {
                  this.field_bb = this.field_bb + 1;
                }
                if ((var16 & 16) == 16) {
                  this.field_bb = this.field_bb + 1;
                }
              }
            }
            this.field_C = -1;
            this.field_hb = 0;
            this.field_I = 0;
          }
          this.field_j = this.field_j + 1;
        }
        for (var15 = 0; var15 < this.field_u.field_B; var15++) {
          regionExit1: {
            if (this.field_P != 0) {
              if (this.field_O[var15] < 0) {
                break regionExit1;
              }
              var16 = this.field_O[var15];
            } else {
              var16 = this.field_bb;
            }
            this.field_O[var15] = -1;
            var17 = var16;
            int var18 = -1;
            int var19 = -1;
            int var20 = -1;
            int var21 = -1;
            int var22 = -1;
            int var23 = 0;
            int var24 = this.field_u.field_C[this.field_x][var16] & 255;
            var16++;
            if (var24 >= 128) {
              var24 -= 128;
            } else {
              var16--;
              var24 = 31;
            }
            if ((var24 & 1) == 1) {
              var18 = this.field_u.field_C[this.field_x][var16] & 255;
              var16++;
            }
            if ((var24 & 2) == 2) {
              var19 = (this.field_u.field_C[this.field_x][var16] & 255) - 1;
              var16++;
            }
            if ((var24 & 4) == 4) {
              var20 = (this.field_u.field_C[this.field_x][var16] & 255) - 16;
              var16++;
            }
            if ((var24 & 8) == 8) {
              var22 = this.field_u.field_C[this.field_x][var16] & 255;
              var16++;
            }
            if ((var24 & 16) == 16) {
              var23 = this.field_u.field_C[this.field_x][var16] & 255;
              var16++;
            }
            if (this.field_P == 0) {
              this.field_bb = var16;
            }
            if (!this.field_X[var15]) {
              if (var22 == 14) {
                var22 = var22 * 16 + var23 / 16;
                var23 = var23 & 15;
              }
              if (var22 == 236) {
                if (var23 == 0) {
                  var18 = 97;
                } else if (this.field_P != var23) {
                  this.field_O[var15] = var17;
                } else {
                  var18 = 97;
                  var22 = -1;
                  var21 = -1;
                  var20 = -1;
                  var19 = -1;
                  var23 = 0;
                }
              }
              if (var22 == 237 &&
                this.field_P < var23) {
                this.field_O[var15] = var17;
              } else {
                if (var20 >= 80 &&
                  var20 < 96) {
                  this.field_L[var15] = 2;
                  this.field_N[var15] = 80 - var20;
                  var20 = -1;
                }
                if (var20 >= 96 &&
                  var20 < 112) {
                  this.field_L[var15] = 2;
                  this.field_N[var15] = var20 - 96;
                  var20 = -1;
                }
                if (var20 >= 112 &&
                  var20 < 128) {
                  var20 = this.field_A[var15] - (var20 - 112);
                  if (!(var20 >= 0)) {
                    var20 = 0;
                  } else if (var20 > 64) {
                    var20 = 64;
                  }
                }
                if (var20 >= 128 &&
                  var20 < 136) {
                  var20 = this.field_A[var15] + (var20 - 128);
                  if (!(var20 >= 0)) {
                    var20 = 0;
                  } else if (var20 > 64) {
                    var20 = 64;
                  }
                }
                if (var20 >= 176 &&
                  var20 < 192) {
                  var21 = (var20 - 176) * 17;
                  var20 = -1;
                }
                if (var20 >= 192 &&
                  var20 < 208) {
                  this.field_lb[var15] = 2;
                  this.field_B[var15] = 192 - var20;
                  var20 = -1;
                }
                if (var20 >= 208 &&
                  var20 < 224) {
                  this.field_lb[var15] = 2;
                  this.field_B[var15] = var20 - 208;
                  var20 = -1;
                }
                if (var20 > 64) {
                  var20 = -1;
                }
                if (var22 == 13) {
                  if (this.field_I > 1) {
                    this.field_I = 1;
                  } else {
                    this.field_hb = 1;
                    this.field_q = var23;
                  }
                }
                if (var22 == 15) {
                  if (var23 >= 32) {
                    this.field_r = var23;
                  } else {
                    this.field_k = var23;
                  }
                }
                if (var22 == 16) {
                  this.field_i = var23;
                }
                if (var22 == 12) {
                  var20 = var23;
                }
                if (var22 == 8) {
                  var21 = var23;
                }
                if (var22 == 11 &&
                  this.field_I <= 1) {
                  this.field_I = 1;
                  this.field_q = var23;
                }
                if (var22 == 20) {
                  var18 = 97;
                }
                if (var22 == 21) {
                  this.field_K[var15] = var23;
                  if (this.field_K[var15] >= this.field_u.field_v[var3][this.field_u.field_v[var3].length - 1]) {
                    this.field_K[var15] = this.field_u.field_v[var3][this.field_u.field_v[var3].length - 1] - 1;
                  }
                  this.field_s[var15] = var23;
                  if (this.field_s[var15] >= this.field_u.field_I[var3][this.field_u.field_I[var3].length - 1]) {
                    this.field_s[var15] = this.field_u.field_I[var3][this.field_u.field_I[var3].length - 1] - 1;
                  }
                }
                if (var19 >= 0 &&
                  var18 <= 96) {
                  this.field_K[var15] = 0;
                  this.field_s[var15] = 0;
                  this.field_S[var15] = 1;
                  this.field_Y[var15] = 0;
                }
                if (var22 == 3 &&
                  var20 < 0 &&
                  var19 != -1) {
                  var20 = this.field_u.field_a[this.field_v[var15]];
                }
                if (var22 == 3 &&
                  var21 < 0 &&
                  var19 != -1) {
                  var21 = this.field_u.field_y[this.field_v[var15]];
                }
                if (var18 >= 0 &&
                  var18 <= 96 &&
                  var22 != 3) {
                  if (var19 == -1 &&
                    var20 < 0) {
                    var20 = this.field_A[var15];
                  }
                  if (var19 == -1 &&
                    var21 < 0) {
                    var21 = this.field_eb[var15];
                  }
                  if (var19 != -1) {
                    this.field_kb[var15] = var19;
                    if (var18 >= 96) {
                      var19 = this.field_u.field_d[var19][95];
                    } else {
                      var19 = this.field_u.field_d[var19][var18];
                    }
                  } else {
                    var19 = this.field_v[var15];
                  }
                  if (var20 < 0) {
                    var20 = this.field_u.field_a[var19];
                  }
                  if (var21 < 0) {
                    var21 = this.field_u.field_y[var19];
                  }
                  var25 = 7680 - (var18 + this.field_u.field_b[var19]) * 64 - this.field_u.field_z[var19] / 2;
                  if (!(var25 >= 0)) {
                    var25 = 0;
                  } else if (var25 > 7999) {
                    var25 = 7999;
                  }
                  this.field_l[var15] = var25;
                  int var26 = field_o[var25];
                  this.field_v[var15] = var19;
                  this.field_A[var15] = var20;
                  this.field_eb[var15] = var21;
                  this.field_n[var15] = var25;
                  int var1 = 0;
                  if (var22 == 9) {
                    if (var23 * 256 <= this.field_u.field_n[var19]) {
                      var1 = var23 * 256;
                    } else {
                      var1 = this.field_u.field_n[var19];
                    }
                  }
                  this.a(var15, var19, var1, var26, var20, var21);
                  this.field_R[var15] = 0;
                } else if (var18 <= 96) {
                  if (var20 >= 0 ||
                    var21 >= 0) {
                    if (var20 >= 0) {
                      this.field_A[var15] = var20;
                    }
                    if (var21 >= 0) {
                      this.field_eb[var15] = var21;
                    }
                  }
                } else if (this.field_J[var15] != 1) {
                  this.e(var15);
                } else {
                  this.field_S[var15] = 0;
                }
                regionExit2: {
                  if (var22 == 3) {
                    this.field_G[var15] = 1;
                    if (var18 >= 0) {
                      if (var18 <= 96) {
                        var19 = this.field_v[var15];
                        var25 = 7680 - (var18 + this.field_u.field_b[var19]) * 64 - this.field_u.field_z[var19] / 2;
                        if (var25 >= 0) {
                          if (var25 <= 7999) {
                            this.field_l[var15] = var25;
                            if (var23 != 0) {
                              this.field_Z[var15] = var23;
                              if (this.field_u.field_D == 0) {
                                this.field_Z[var15] = this.field_Z[var15] * 2;
                              }
                            }
                            break regionExit2;
                          }
                          var25 = 7999;
                        } else {
                          var25 = 0;
                        }
                        this.field_l[var15] = var25;
                        if (var23 != 0) {
                          this.field_Z[var15] = var23;
                          if (this.field_u.field_D == 0) {
                            this.field_Z[var15] = this.field_Z[var15] * 2;
                          }
                        }
                      } else if (var23 != 0) {
                        this.field_Z[var15] = var23;
                        if (this.field_u.field_D == 0) {
                          this.field_Z[var15] = this.field_Z[var15] * 2;
                        }
                      }
                    } else if (var23 != 0) {
                      this.field_Z[var15] = var23;
                      if (this.field_u.field_D == 0) {
                        this.field_Z[var15] = this.field_Z[var15] * 2;
                      }
                    }
                  } else if (var22 != 5) {
                    this.field_G[var15] = 0;
                  }
                }
                if (var22 == 4) {
                  this.field_fb[var15] = 1;
                  if (var23 / 16 > 0) {
                    this.field_gb[var15] = var23 / 16;
                  }
                  if ((var23 & 15) > 0) {
                    this.field_E[var15] = var23 & 15;
                  }
                } else if (var22 != 6) {
                  if (this.field_fb[var15] != 0) {
                    var25 = field_o[this.field_n[var15]];
                    this.a(var15, var25);
                  }
                  this.field_R[var15] = 0;
                  this.field_fb[var15] = 0;
                }
                if (var22 != 17) {
                  this.field_w[var15] = 0;
                } else {
                  this.field_w[var15] = 1;
                  if (var23 != 0) {
                    this.field_V[var15] = (var23 & 240) / 16 - (var23 & 15);
                  }
                }
                if (var22 == 10 ||
                  var22 == 6 ||
                  var22 == 5) {
                  this.field_L[var15] = 1;
                  if (var23 != 0) {
                    this.field_N[var15] = (var23 & 240) / 16 - (var23 & 15);
                  }
                } else if (this.field_L[var15] != 2) {
                  this.field_L[var15] = 0;
                } else {
                  this.field_L[var15] = 1;
                }
                if (var22 == 25) {
                  this.field_lb[var15] = 1;
                  if (var23 != 0) {
                    this.field_B[var15] = (var23 & 240) / 16 - (var23 & 15);
                  }
                } else if (this.field_lb[var15] != 2) {
                  this.field_lb[var15] = 0;
                } else {
                  this.field_lb[var15] = 1;
                }
                if (var22 == 234) {
                  if (var23 != 0) {
                    this.field_db[var15] = var23;
                  } else {
                    var23 = this.field_db[var15];
                  }
                  this.field_A[var15] = this.field_A[var15] + var23;
                  if (!(this.field_A[var15] >= 0)) {
                    this.field_A[var15] = 0;
                  } else if (this.field_A[var15] > 64) {
                    this.field_A[var15] = 64;
                  }
                }
                if (var22 == 235) {
                  if (var23 != 0) {
                    this.field_U[var15] = var23;
                  } else {
                    var23 = this.field_U[var15];
                  }
                  this.field_A[var15] = this.field_A[var15] - var23;
                  if (!(this.field_A[var15] >= 0)) {
                    this.field_A[var15] = 0;
                  } else if (this.field_A[var15] > 64) {
                    this.field_A[var15] = 64;
                  }
                }
                if (var22 != 1) {
                  this.field_m[var15] = 0;
                } else if (var23 != 0) {
                  this.field_m[var15] = var23;
                }
                if (var22 != 2) {
                  this.field_ab[var15] = 0;
                } else if (var23 != 0) {
                  this.field_ab[var15] = var23;
                }
                switch (var22) {
                  case 225:
                    if (var23 != 0) {
                      this.field_mb[var15] = var23;
                    } else {
                      var23 = this.field_mb[var15];
                    }
                    this.field_n[var15] = this.field_n[var15] - var23 * 4;
                    if (this.field_n[var15] >= 0) {
                      if (this.field_n[var15] > 7999) {
                        this.field_n[var15] = 7999;
                      }
                    } else {
                      this.field_n[var15] = 0;
                    }
                    var25 = field_o[this.field_n[var15]];
                    this.a(var15, var25);
                    break;
                  case 226:
                    if (var23 != 0) {
                      this.field_p[var15] = var23;
                    } else {
                      var23 = this.field_p[var15];
                    }
                    this.field_n[var15] = this.field_n[var15] + var23 * 4;
                    if (this.field_n[var15] >= 0) {
                      if (this.field_n[var15] > 7999) {
                        this.field_n[var15] = 7999;
                      }
                    } else {
                      this.field_n[var15] = 0;
                    }
                    var25 = field_o[this.field_n[var15]];
                    this.a(var15, var25);
                    break;
                  case 33:
                    if (var23 / 16 != 1) {
                      var23 = var23 & 15;
                      if (var23 != 0) {
                        this.field_cb[var15] = var23;
                      } else {
                        var23 = this.field_cb[var15];
                      }
                      this.field_n[var15] = this.field_n[var15] + var23;
                      if (!(this.field_n[var15] >= 0)) {
                        this.field_n[var15] = 0;
                      } else if (this.field_n[var15] > 7999) {
                        this.field_n[var15] = 7999;
                      }
                      var25 = field_o[this.field_n[var15]];
                      this.a(var15, var25);
                    } else {
                      var23 = var23 & 15;
                      if (var23 != 0) {
                        this.field_Q[var15] = var23;
                      } else {
                        var23 = this.field_Q[var15];
                      }
                      this.field_n[var15] = this.field_n[var15] - var23;
                      if (!(this.field_n[var15] >= 0)) {
                        this.field_n[var15] = 0;
                      } else if (this.field_n[var15] > 7999) {
                        this.field_n[var15] = 7999;
                      }
                      var25 = field_o[this.field_n[var15]];
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
        if (this.field_P > 0) {
          for (var15 = 0; var15 < this.field_u.field_B; var15++) {
            if (!this.field_X[var15]) {
              if (this.field_w[var15] != 0) {
                this.field_i = this.field_i + this.field_V[var15];
                if (!(this.field_i >= 0)) {
                  this.field_i = 0;
                } else if (this.field_i > 64) {
                  this.field_i = 64;
                }
              }
              if (this.field_L[var15] != 0 ||
                this.field_lb[var15] != 0) {
                this.field_A[var15] = this.field_A[var15] + this.field_N[var15];
                if (!(this.field_A[var15] >= 0)) {
                  this.field_A[var15] = 0;
                } else if (this.field_A[var15] > 64) {
                  this.field_A[var15] = 64;
                }
                this.field_eb[var15] = this.field_eb[var15] + this.field_B[var15];
                if (!(this.field_eb[var15] >= 0)) {
                  this.field_eb[var15] = 0;
                } else if (this.field_eb[var15] > 255) {
                  this.field_eb[var15] = 255;
                }
              }
              if (this.field_fb[var15] == 1) {
                this.field_R[var15] = (this.field_R[var15] + this.field_gb[var15]) % 68;
                int var2 = field_D[this.field_R[var15]] * this.field_E[var15] >> 8;
                var16 = this.field_n[var15] + var2;
                this.a(var15, field_o[var16]);
              }
              if (this.field_m[var15] > 0) {
                this.field_n[var15] = this.field_n[var15] - this.field_m[var15] * 4;
                if (!(this.field_n[var15] >= 0)) {
                  this.field_n[var15] = 0;
                } else if (this.field_n[var15] > 7999) {
                  this.field_n[var15] = 7999;
                }
                var16 = field_o[this.field_n[var15]];
                this.a(var15, var16);
              }
              if (this.field_ab[var15] > 0) {
                this.field_n[var15] = this.field_n[var15] + this.field_ab[var15] * 4;
                if (!(this.field_n[var15] >= 0)) {
                  this.field_n[var15] = 0;
                } else if (this.field_n[var15] > 7999) {
                  this.field_n[var15] = 7999;
                }
                var16 = field_o[this.field_n[var15]];
                this.a(var15, var16);
              }
              if (this.field_G[var15] > 0) {
                if (this.field_n[var15] < this.field_l[var15]) {
                  this.field_n[var15] = this.field_n[var15] + this.field_Z[var15] * 4;
                  if (this.field_n[var15] > this.field_l[var15]) {
                    this.field_n[var15] = this.field_l[var15];
                  }
                }
                if (this.field_n[var15] > this.field_l[var15]) {
                  this.field_n[var15] = this.field_n[var15] - this.field_Z[var15] * 4;
                  if (this.field_n[var15] < this.field_l[var15]) {
                    this.field_n[var15] = this.field_l[var15];
                  }
                }
                if (!(this.field_n[var15] >= 0)) {
                  this.field_n[var15] = 0;
                } else if (this.field_n[var15] > 7999) {
                  this.field_n[var15] = 7999;
                }
                var16 = field_o[this.field_n[var15]];
                this.a(var15, var16);
              }
            }
          }
        }
        for (var15 = 0; var15 < this.field_u.field_B; var15++) {
          if (!this.field_X[var15]) {
            var16 = this.field_A[var15];
            var17 = this.field_eb[var15];
            this.field_J[var15] = 0;
            if (this.field_kb[var15] >= 0) {
              var3 = this.field_kb[var15];
              if ((this.field_u.field_u[this.field_kb[var15]] & 1) == 1) {
                this.field_J[var15] = 1;
                var4 = this.field_K[var15];
                for (var5 = 0; this.field_u.field_v[var3][var5 + 1] < var4; var5++) {
                }
                var6 = this.field_u.field_v[var3][var5];
                var8 = this.field_u.field_v[var3][var5 + 1];
                var7 = this.field_u.field_g[var3][var5];
                var9 = this.field_u.field_g[var3][var5 + 1];
                if (var8 == var6) {
                  var8++;
                }
                int var11 = ((var8 - var4) * var7 + (var4 - var6) * var9) / (var8 - var6);
                int var12 = 32768 - this.field_Y[var15];
                if (var12 < 0) {
                  var12 = 0;
                }
                var16 = var16 * var11 * var12 >> 21;
                if ((this.field_u.field_u[var3] & 2) == 2 &&
                  this.field_S[var15] == 1 &&
                  this.field_K[var15] == this.field_u.field_v[var3][this.field_u.field_J[var3]]) {
                  this.field_K[var15] = this.field_K[var15] - 1;
                }
                if (this.field_K[var15] == this.field_u.field_v[var3][this.field_u.field_v[var3].length - 1]) {
                  this.field_K[var15] = this.field_K[var15] - 1;
                }
                if (this.field_S[var15] == 0) {
                  this.field_Y[var15] = this.field_Y[var15] + this.field_u.field_H[var3];
                }
                this.field_K[var15] = this.field_K[var15] + 1;
                if ((this.field_u.field_u[var3] & 4) == 4 &&
                  this.field_K[var15] == this.field_u.field_v[var3][this.field_u.field_G[var3]]) {
                  this.field_K[var15] = this.field_u.field_v[var3][this.field_u.field_r[var3]];
                }
              }
              if ((this.field_u.field_m[this.field_kb[var15]] & 1) == 1) {
                var4 = this.field_s[var15];
                for (var5 = 0; this.field_u.field_I[var3][var5 + 1] < var4; var5++) {
                }
                var6 = this.field_u.field_I[var3][var5];
                var8 = this.field_u.field_I[var3][var5 + 1];
                var7 = this.field_u.field_t[var3][var5];
                var9 = this.field_u.field_t[var3][var5 + 1];
                if (var8 == var6) {
                  var8++;
                }
                int var13 = ((var8 - var4) * var7 + (var4 - var6) * var9) / (var8 - var6);
                var17 = var17 + ((var13 - 32) * (128 - Math.abs(var17 - 128)) >> 5);
                if ((this.field_u.field_m[var3] & 2) == 2 &&
                  this.field_S[var15] == 1 &&
                  this.field_s[var15] == this.field_u.field_I[var3][this.field_u.field_q[var3]]) {
                  this.field_s[var15] = this.field_s[var15] - 1;
                }
                if (this.field_s[var15] == this.field_u.field_I[var3][this.field_u.field_I[var3].length - 1]) {
                  this.field_s[var15] = this.field_s[var15] - 1;
                }
                this.field_s[var15] = this.field_s[var15] + 1;
                if ((this.field_u.field_m[var3] & 4) == 4 &&
                  this.field_s[var15] == this.field_u.field_I[var3][this.field_u.field_K[var3]]) {
                  this.field_s[var15] = this.field_u.field_I[var3][this.field_u.field_k[var3]];
                }
              }
            }
            this.a(var15, var16, var17);
          }
        }
        this.field_P = this.field_P + 1;
        if (this.field_P >= this.field_k) {
          this.field_P = 0;
        }
        return (var14);
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int stackIn_14_2 = 0;
        Throwable decompiledCaughtException = null;
        this.e(param0);
        if (param3 > field_o[7999] &&
          param3 < field_o[0]) {
          if (!(param4 >= 0)) {
            param4 = 0;
          } else if (param4 > 64) {
            param4 = 64;
          }
          if (!(param5 >= 0)) {
            param5 = 0;
          } else if (param5 > 255) {
            param5 = 255;
          }
          hh stackIn_13_0 = this.field_u.field_s[param1];
          int stackIn_13_1 = param3 * 256 / ie.field_q;
          if (param2 == 0) {
            stackIn_14_2 = param4 * this.field_i * this.field_jb >> 12;
          } else {
            stackIn_14_2 = 0;
          }
          hl var7 = hl.b(stackIn_13_0, stackIn_13_1, stackIn_14_2, param5);
          var7.b(this.field_u.field_h[param1], this.field_u.field_A[param1]);
          hl stackIn_16_0 = var7;
          int stackIn_17_1 = (this.field_u.field_E[param1] == 0) ? 0 : -1;
          ((hl) (Object) stackIn_16_0).h(stackIn_17_1);
          hl stackIn_19_0 = var7;
          boolean stackIn_20_1 = (this.field_u.field_E[param1] != 2) ? false : true;
          ((hl) (Object) stackIn_19_0).a(stackIn_20_1);
          if (param2 != 0) {
            var7.e(param2);
            var7.b(ie.field_q >> 7, param4 * this.field_i * this.field_jb >> 12, param5);
          }
          this.field_T[param0] = var7;
          if (this.field_h != null) {
            Object var8 = this.field_h;
            synchronized (var8) {
              this.field_h.a(var7);
            }
          }
          return;
        }
    }

    final synchronized void d(int param0) {
        this.field_jb = param0;
    }

    final void a() {
        for (int var1 = 0; var1 < this.field_u.field_B; var1++) {
          if (this.field_T[var1] != null) {
            this.field_h.a(this.field_T[var1]);
          }
        }
    }

    private final void a(int param0, int param1) {
        if (this.field_T[param0] != null) {
          this.field_T[param0].i(param1 * 256 / ie.field_q);
        }
    }

    o(ce param0) {
        this.field_jb = 64;
        this.field_H = 0;
        this.field_W = -1;
        this.field_F = null;
        this.field_P = 0;
        this.field_M = 0;
        this.field_I = 0;
        this.field_hb = 0;
        this.field_C = -1;
        this.field_y = 256;
        this.field_t = true;
        this.field_q = 0;
        this.field_z = -1;
        this.field_u = param0;
        this.f();
    }

    static {
        field_o = new int[8000];
        field_D = new int[68];
        for (int var0 = 0; var0 < 8000; var0++) {
          field_o[var0] = (int)(8363.0 * Math.pow(2.0, (double)(4608 - var0) / 768.0));
        }
        for (int var0Lifetime1 = 0; var0Lifetime1 < 68; var0Lifetime1++) {
          field_D[var0Lifetime1] = (int)(-2048.0 * Math.sin((double)var0Lifetime1 * 0.0923998));
        }
    }
}
