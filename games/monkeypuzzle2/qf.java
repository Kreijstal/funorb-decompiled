/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qf extends og {
    private int[] field_jb;
    private int field_O;
    private int[] field_F;
    private int[] field_J;
    private boolean field_P;
    private static int[] field_v;
    private int field_k;
    private int[] field_G;
    private int[] field_S;
    private int field_C;
    private int field_l;
    private int[] field_h;
    private static int[] field_j;
    private int[] field_H;
    private int[] field_D;
    private int[] field_A;
    private int field_M;
    private int field_ib;
    private int[] field_L;
    private int[] field_t;
    private int field_B;
    private int[] field_i;
    private int[] field_n;
    private int[] field_V;
    private int[] field_E;
    private int[] field_eb;
    private int[] field_db;
    private int field_Z;
    private int[] field_z;
    private int field_K;
    private int[] field_Q;
    private int[] field_U;
    private int field_T;
    private int[] field_hb;
    private int[] field_w;
    private lg field_X;
    private int[] field_Y;
    private int field_o;
    private int[] field_q;
    private boolean[] field_x;
    private int field_u;
    private int field_N;
    private int[] field_bb;
    private int[] field_s;
    private int field_gb;
    private int field_cb;
    private lg field_kb;
    private int[] field_y;
    private int[] field_W;
    private int[] field_m;
    private li[] field_R;
    private int[] field_I;
    private int field_p;
    private int field_fb;
    private int field_r;
    private int[] field_g;
    private int[] field_ab;

    private final void e() {
        int var1 = 0;
        int var1Lifetime1;
        this.field_T = 0;
        this.field_K = 0;
        this.field_B = 0;
        this.field_k = 0;
        this.field_C = 0;
        this.field_N = 0;
        this.field_cb = this.field_X.field_f;
        this.field_O = this.field_X.field_K;
        this.field_r = 64;
        for (var1 = 0; var1 < this.field_X.field_j; var1++) {
          this.field_z[var1] = 0;
          this.field_eb[var1] = 0;
          this.field_y[var1] = 0;
          this.field_D[var1] = 0;
          this.field_W[var1] = 0;
          this.field_jb[var1] = 0;
          this.field_m[var1] = 0;
          this.field_S[var1] = 0;
          this.field_h[var1] = 0;
          this.field_F[var1] = 0;
          this.field_J[var1] = 0;
          this.field_q[var1] = 0;
          this.field_E[var1] = 0;
          this.field_I[var1] = 0;
          this.field_H[var1] = 0;
          this.field_t[var1] = 0;
          this.field_g[var1] = -1;
          this.field_Y[var1] = 0;
          this.field_A[var1] = 0;
          this.field_V[var1] = 0;
          this.field_n[var1] = 0;
          this.field_Q[var1] = 0;
          this.field_ab[var1] = 0;
          this.field_i[var1] = 0;
          this.field_L[var1] = 0;
          this.field_U[var1] = 0;
          this.field_G[var1] = 0;
          this.field_s[var1] = 0;
          this.field_w[var1] = 128;
          this.field_db[var1] = 0;
          this.field_hb[var1] = -1;
        }
        this.field_fb = 0;
        this.field_kb = null;
        this.field_Z = -1;
        this.field_gb = -1;
        this.field_o = 0;
        this.field_u = 0;
        this.field_l = -1;
        this.field_ib = 0;
        int var2 = 0;
        var1Lifetime1 = var2;
        while (var2 < this.field_X.field_j) {
          this.field_R[var2] = null;
          this.field_x[var2] = false;
          var2++;
        }
        this.field_K = 1;
    }

    private final void e(int param0) {
        if (this.field_R[param0] != null) {
          this.field_R[param0].f(va.field_i >> 7);
          this.field_R[param0] = null;
        }
    }

    final synchronized void a(lg param0, int param1, int param2, int param3) {
        this.field_fb = param3;
        if (param0 != null) {
          this.field_kb = param0;
        }
        this.field_Z = param1;
        this.field_gb = param2;
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
        if (this.field_K != 1 &&
          this.field_K != 2) {
          this.field_T = 0;
          return false;
        }
        var14 = 0;
        if (this.field_T == 0) {
          if (this.field_K == 1) {
            this.field_K = 2;
            this.field_C = 0;
            this.field_k = 0;
            this.field_N = this.field_X.field_q[this.field_C];
            this.field_B = 0;
          }
          if (!(this.field_k < this.field_X.field_x[this.field_N]) ||
            this.field_ib == 1 ||
            this.field_o != 0 &&
            this.field_k % this.field_o == 0 ||
            this.field_fb > 0 &&
            this.field_k % this.field_fb == 0) {
            if (this.field_o == 0) {
              this.field_C = this.field_C + 1;
            } else {
              if (this.field_u <= this.field_C) {
                var14 = 1;
              }
              this.field_C = this.field_u;
            }
            if (this.field_l != -1) {
              this.field_C = this.field_l;
              this.field_l = -1;
            }
            if (this.field_C >= this.field_X.field_s) {
              this.field_C = 0;
              var14 = 1;
            }
            this.field_k = 0;
            if (this.field_ib == 1) {
              this.field_u = this.field_u / 16 * 10 + this.field_u % 16;
              if (this.field_u >= this.field_X.field_x[this.field_N]) {
                this.field_u = 0;
              }
              this.field_k = this.field_u;
            }
            if (this.field_Z >= 0 && (this.field_fb >= 0 ||
              var14 != 0)) {
              var15 = this.field_Z;
              var16 = this.field_gb;
              if (this.field_kb != null) {
                for (var17 = 0; var17 < this.field_X.field_j; var17++) {
                  this.e(var17);
                }
                this.field_X = this.field_kb;
                this.c();
                this.field_K = 2;
              }
              this.field_C = var15;
              this.field_k = var16;
              var14 = 0;
              this.field_fb = 0;
              this.field_Z = -1;
              this.field_gb = -1;
              this.field_kb = null;
            }
            this.field_N = this.field_X.field_q[this.field_C];
            this.field_B = 0;
            for (var10 = 0; var10 < this.field_k; var10++) {
              for (var15 = 0; var15 < this.field_X.field_j; var15++) {
                var16 = this.field_X.field_L[this.field_N][this.field_B] & 255;
                this.field_B = this.field_B + 1;
                if (var16 >= 128) {
                  var16 -= 128;
                } else {
                  this.field_B = this.field_B - 1;
                  var16 = 31;
                }
                if ((var16 & 1) == 1) {
                  this.field_B = this.field_B + 1;
                }
                if ((var16 & 2) == 2) {
                  this.field_B = this.field_B + 1;
                }
                if ((var16 & 4) == 4) {
                  this.field_B = this.field_B + 1;
                }
                if ((var16 & 8) == 8) {
                  this.field_B = this.field_B + 1;
                }
                if ((var16 & 16) == 16) {
                  this.field_B = this.field_B + 1;
                }
              }
            }
            this.field_l = -1;
            this.field_ib = 0;
            this.field_o = 0;
          }
          this.field_k = this.field_k + 1;
        }
        for (var15 = 0; var15 < this.field_X.field_j; var15++) {
          L55: {
            if (this.field_T != 0) {
              if (this.field_g[var15] < 0) {
                break L55;
              }
              var16 = this.field_g[var15];
            } else {
              var16 = this.field_B;
            }
            this.field_g[var15] = -1;
            var17 = var16;
            var18 = -1;
            var19 = -1;
            var20 = -1;
            var21 = -1;
            var22 = -1;
            var23 = 0;
            var24 = this.field_X.field_L[this.field_N][var16] & 255;
            var16++;
            if (var24 >= 128) {
              var24 -= 128;
            } else {
              var16--;
              var24 = 31;
            }
            if ((var24 & 1) == 1) {
              var18 = this.field_X.field_L[this.field_N][var16] & 255;
              var16++;
            }
            if ((var24 & 2) == 2) {
              var19 = (this.field_X.field_L[this.field_N][var16] & 255) - 1;
              var16++;
            }
            if ((var24 & 4) == 4) {
              var20 = (this.field_X.field_L[this.field_N][var16] & 255) - 16;
              var16++;
            }
            if ((var24 & 8) == 8) {
              var22 = this.field_X.field_L[this.field_N][var16] & 255;
              var16++;
            }
            if ((var24 & 16) == 16) {
              var23 = this.field_X.field_L[this.field_N][var16] & 255;
              var16++;
            }
            if (this.field_T == 0) {
              this.field_B = var16;
            }
            if (!this.field_x[var15]) {
              if (var22 == 14) {
                var22 = var22 * 16 + var23 / 16;
                var23 = var23 & 15;
              }
              if (var22 == 236) {
                if (var23 != 0) {
                  if (this.field_T != var23) {
                    this.field_g[var15] = var17;
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
                this.field_T < var23) {
                this.field_g[var15] = var17;
              } else {
                if (var20 >= 80 &&
                  var20 < 96) {
                  this.field_L[var15] = 2;
                  this.field_z[var15] = 80 - var20;
                  var20 = -1;
                }
                if (var20 >= 96 &&
                  var20 < 112) {
                  this.field_L[var15] = 2;
                  this.field_z[var15] = var20 - 96;
                  var20 = -1;
                }
                if (var20 >= 112 &&
                  var20 < 128) {
                  var20 = this.field_s[var15] - (var20 - 112);
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
                  var20 = this.field_s[var15] + (var20 - 128);
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
                  this.field_U[var15] = 2;
                  this.field_eb[var15] = 192 - var20;
                  var20 = -1;
                }
                if (var20 >= 208 &&
                  var20 < 224) {
                  this.field_U[var15] = 2;
                  this.field_eb[var15] = var20 - 208;
                  var20 = -1;
                }
                if (var20 > 64) {
                  var20 = -1;
                }
                if (var22 == 13) {
                  if (this.field_o > 1) {
                    this.field_o = 1;
                  } else {
                    this.field_ib = 1;
                    this.field_u = var23;
                  }
                }
                if (var22 == 15) {
                  if (var23 >= 32) {
                    this.field_O = var23;
                  } else {
                    this.field_cb = var23;
                  }
                }
                if (var22 == 16) {
                  this.field_r = var23;
                }
                if (var22 == 12) {
                  var20 = var23;
                }
                if (var22 == 8) {
                  var21 = var23;
                }
                if (var22 == 11 &&
                  this.field_o <= 1) {
                  this.field_o = 1;
                  this.field_u = var23;
                }
                if (var22 == 20) {
                  var18 = 97;
                }
                if (var22 == 21) {
                  this.field_Y[var15] = var23;
                  if (this.field_Y[var15] >= this.field_X.field_y[var3][this.field_X.field_y[var3].length - 1]) {
                    this.field_Y[var15] = this.field_X.field_y[var3][this.field_X.field_y[var3].length - 1] - 1;
                  }
                  this.field_A[var15] = var23;
                  if (this.field_A[var15] >= this.field_X.field_r[var3][this.field_X.field_r[var3].length - 1]) {
                    this.field_A[var15] = this.field_X.field_r[var3][this.field_X.field_r[var3].length - 1] - 1;
                  }
                }
                if (var19 >= 0 &&
                  var18 <= 96) {
                  this.field_Y[var15] = 0;
                  this.field_A[var15] = 0;
                  this.field_n[var15] = 1;
                  this.field_Q[var15] = 0;
                }
                if (var22 == 3 &&
                  var20 < 0 &&
                  var19 != -1) {
                  var20 = this.field_X.field_a[this.field_G[var15]];
                }
                if (var22 == 3 &&
                  var21 < 0 &&
                  var19 != -1) {
                  var21 = this.field_X.field_N[this.field_G[var15]];
                }
                if (var18 >= 0 &&
                  var18 <= 96 &&
                  var22 != 3) {
                  if (var19 == -1 &&
                    var20 < 0) {
                    var20 = this.field_s[var15];
                  }
                  if (var19 == -1 &&
                    var21 < 0) {
                    var21 = this.field_w[var15];
                  }
                  if (var19 != -1) {
                    this.field_hb[var15] = var19;
                    if (var18 >= 96) {
                      var19 = this.field_X.field_t[var19][95];
                    } else {
                      var19 = this.field_X.field_t[var19][var18];
                    }
                  } else {
                    var19 = this.field_G[var15];
                  }
                  if (var20 < 0) {
                    var20 = this.field_X.field_a[var19];
                  }
                  if (var21 < 0) {
                    var21 = this.field_X.field_N[var19];
                  }
                  var25 = 7680 - (var18 + this.field_X.field_O[var19]) * 64 - this.field_X.field_g[var19] / 2;
                  if (var25 >= 0) {
                    if (var25 > 7999) {
                      var25 = 7999;
                    }
                  } else {
                    var25 = 0;
                  }
                  this.field_H[var15] = var25;
                  var26 = field_v[var25];
                  this.field_G[var15] = var19;
                  this.field_s[var15] = var20;
                  this.field_w[var15] = var21;
                  this.field_db[var15] = var25;
                  var1 = 0;
                  if (var22 == 9) {
                    if (var23 * 256 <= this.field_X.field_o[var19]) {
                      var1 = var23 * 256;
                    } else {
                      var1 = this.field_X.field_o[var19];
                    }
                  }
                  this.a(var15, var19, var1, var26, var20, var21);
                  this.field_W[var15] = 0;
                } else {
                  if (var18 <= 96) {
                    if (var20 >= 0 ||
                      var21 >= 0) {
                      if (var20 >= 0) {
                        this.field_s[var15] = var20;
                      }
                      if (var21 >= 0) {
                        this.field_w[var15] = var21;
                      }
                    }
                  } else {
                    if (this.field_V[var15] != 1) {
                      this.e(var15);
                    } else {
                      this.field_n[var15] = 0;
                    }
                  }
                }
                L98: {
                  if (var22 != 3) {
                    if (var22 != 5) {
                      this.field_ab[var15] = 0;
                    }
                  } else {
                    this.field_ab[var15] = 1;
                    if (var18 >= 0) {
                      if (var18 <= 96) {
                        var19 = this.field_G[var15];
                        var25 = 7680 - (var18 + this.field_X.field_O[var19]) * 64 - this.field_X.field_g[var19] / 2;
                        if (var25 >= 0) {
                          if (var25 <= 7999) {
                            this.field_H[var15] = var25;
                            if ((var23 != 0)) {
                              this.field_t[var15] = var23;
                              if ((this.field_X.field_e == 0)) {
                                this.field_t[var15] = this.field_t[var15] * 2;
                              }
                            }
                            break L98;
                          }
                          var25 = 7999;
                        } else {
                          var25 = 0;
                        }
                        this.field_H[var15] = var25;
                        if (var23 != 0) {
                          this.field_t[var15] = var23;
                          if (this.field_X.field_e == 0) {
                            this.field_t[var15] = this.field_t[var15] * 2;
                          }
                        }
                      } else {
                        if (var23 != 0) {
                          this.field_t[var15] = var23;
                          if (this.field_X.field_e == 0) {
                            this.field_t[var15] = this.field_t[var15] * 2;
                          }
                        }
                      }
                    } else {
                      if (var23 != 0) {
                        this.field_t[var15] = var23;
                        if (this.field_X.field_e == 0) {
                          this.field_t[var15] = this.field_t[var15] * 2;
                        }
                      }
                    }
                  }
                }
                if (var22 != 4) {
                  if (var22 != 6) {
                    if (this.field_jb[var15] != 0) {
                      var25 = field_v[this.field_db[var15]];
                      this.a(var15, var25);
                    }
                    this.field_W[var15] = 0;
                    this.field_jb[var15] = 0;
                  }
                } else {
                  this.field_jb[var15] = 1;
                  if (var23 / 16 > 0) {
                    this.field_y[var15] = var23 / 16;
                  }
                  if ((var23 & 15) > 0) {
                    this.field_D[var15] = var23 & 15;
                  }
                }
                if (var22 != 17) {
                  this.field_i[var15] = 0;
                } else {
                  this.field_i[var15] = 1;
                  if (var23 != 0) {
                    this.field_bb[var15] = (var23 & 240) / 16 - (var23 & 15);
                  }
                }
                if (var22 != 10 &&
                  var22 != 6 &&
                  var22 != 5) {
                  if (this.field_L[var15] != 2) {
                    this.field_L[var15] = 0;
                  } else {
                    this.field_L[var15] = 1;
                  }
                } else {
                  this.field_L[var15] = 1;
                  if (var23 != 0) {
                    this.field_z[var15] = (var23 & 240) / 16 - (var23 & 15);
                  }
                }
                if (var22 != 25) {
                  if (this.field_U[var15] != 2) {
                    this.field_U[var15] = 0;
                  } else {
                    this.field_U[var15] = 1;
                  }
                } else {
                  this.field_U[var15] = 1;
                  if (var23 != 0) {
                    this.field_eb[var15] = (var23 & 240) / 16 - (var23 & 15);
                  }
                }
                if (var22 == 234) {
                  if (var23 != 0) {
                    this.field_m[var15] = var23;
                  } else {
                    var23 = this.field_m[var15];
                  }
                  this.field_s[var15] = this.field_s[var15] + var23;
                  if (this.field_s[var15] >= 0) {
                    if (this.field_s[var15] > 64) {
                      this.field_s[var15] = 64;
                    }
                  } else {
                    this.field_s[var15] = 0;
                  }
                }
                if (var22 == 235) {
                  if (var23 != 0) {
                    this.field_F[var15] = var23;
                  } else {
                    var23 = this.field_F[var15];
                  }
                  this.field_s[var15] = this.field_s[var15] - var23;
                  if (this.field_s[var15] >= 0) {
                    if (this.field_s[var15] > 64) {
                      this.field_s[var15] = 64;
                    }
                  } else {
                    this.field_s[var15] = 0;
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
                  this.field_I[var15] = 0;
                } else {
                  if (var23 != 0) {
                    this.field_I[var15] = var23;
                  }
                }
                switch (var22) {
                  case 225:
                    if (var23 != 0) {
                      this.field_S[var15] = var23;
                    } else {
                      var23 = this.field_S[var15];
                    }
                    this.field_db[var15] = this.field_db[var15] - var23 * 4;
                    if (this.field_db[var15] >= 0) {
                      if (this.field_db[var15] > 7999) {
                        this.field_db[var15] = 7999;
                      }
                    } else {
                      this.field_db[var15] = 0;
                    }
                    var25 = field_v[this.field_db[var15]];
                    this.a(var15, var25);
                    break;
                  case 226:
                    if (var23 != 0) {
                      this.field_J[var15] = var23;
                    } else {
                      var23 = this.field_J[var15];
                    }
                    this.field_db[var15] = this.field_db[var15] + var23 * 4;
                    if (this.field_db[var15] >= 0) {
                      if (this.field_db[var15] > 7999) {
                        this.field_db[var15] = 7999;
                      }
                    } else {
                      this.field_db[var15] = 0;
                    }
                    var25 = field_v[this.field_db[var15]];
                    this.a(var15, var25);
                    break;
                  case 33:
                    if (var23 / 16 != 1) {
                      var23 = var23 & 15;
                      if (var23 != 0) {
                        this.field_q[var15] = var23;
                      } else {
                        var23 = this.field_q[var15];
                      }
                      this.field_db[var15] = this.field_db[var15] + var23;
                      if (this.field_db[var15] >= 0) {
                        if (this.field_db[var15] > 7999) {
                          this.field_db[var15] = 7999;
                        }
                      } else {
                        this.field_db[var15] = 0;
                      }
                      var25 = field_v[this.field_db[var15]];
                      this.a(var15, var25);
                    } else {
                      var23 = var23 & 15;
                      if (var23 != 0) {
                        this.field_h[var15] = var23;
                      } else {
                        var23 = this.field_h[var15];
                      }
                      this.field_db[var15] = this.field_db[var15] - var23;
                      if (this.field_db[var15] >= 0) {
                        if (this.field_db[var15] > 7999) {
                          this.field_db[var15] = 7999;
                        }
                      } else {
                        this.field_db[var15] = 0;
                      }
                      var25 = field_v[this.field_db[var15]];
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
        if (this.field_T > 0) {
          for (var15 = 0; var15 < this.field_X.field_j; var15++) {
            if (!this.field_x[var15]) {
              if (this.field_i[var15] != 0) {
                this.field_r = this.field_r + this.field_bb[var15];
                if (this.field_r >= 0) {
                  if (this.field_r > 64) {
                    this.field_r = 64;
                  }
                } else {
                  this.field_r = 0;
                }
              }
              if (this.field_L[var15] != 0 ||
                this.field_U[var15] != 0) {
                this.field_s[var15] = this.field_s[var15] + this.field_z[var15];
                if (this.field_s[var15] >= 0) {
                  if (this.field_s[var15] > 64) {
                    this.field_s[var15] = 64;
                  }
                } else {
                  this.field_s[var15] = 0;
                }
                this.field_w[var15] = this.field_w[var15] + this.field_eb[var15];
                if (this.field_w[var15] >= 0) {
                  if (this.field_w[var15] > 255) {
                    this.field_w[var15] = 255;
                  }
                } else {
                  this.field_w[var15] = 0;
                }
              }
              if (this.field_jb[var15] == 1) {
                this.field_W[var15] = (this.field_W[var15] + this.field_y[var15]) % 68;
                var2 = field_j[this.field_W[var15]] * this.field_D[var15] >> 8;
                var16 = this.field_db[var15] + var2;
                this.a(var15, field_v[var16]);
              }
              if (this.field_E[var15] > 0) {
                this.field_db[var15] = this.field_db[var15] - this.field_E[var15] * 4;
                if (this.field_db[var15] >= 0) {
                  if (this.field_db[var15] > 7999) {
                    this.field_db[var15] = 7999;
                  }
                } else {
                  this.field_db[var15] = 0;
                }
                var16 = field_v[this.field_db[var15]];
                this.a(var15, var16);
              }
              if (this.field_I[var15] > 0) {
                this.field_db[var15] = this.field_db[var15] + this.field_I[var15] * 4;
                if (this.field_db[var15] >= 0) {
                  if (this.field_db[var15] > 7999) {
                    this.field_db[var15] = 7999;
                  }
                } else {
                  this.field_db[var15] = 0;
                }
                var16 = field_v[this.field_db[var15]];
                this.a(var15, var16);
              }
              if (this.field_ab[var15] > 0) {
                if (this.field_db[var15] < this.field_H[var15]) {
                  this.field_db[var15] = this.field_db[var15] + this.field_t[var15] * 4;
                  if (this.field_db[var15] > this.field_H[var15]) {
                    this.field_db[var15] = this.field_H[var15];
                  }
                }
                if (this.field_db[var15] > this.field_H[var15]) {
                  this.field_db[var15] = this.field_db[var15] - this.field_t[var15] * 4;
                  if (this.field_db[var15] < this.field_H[var15]) {
                    this.field_db[var15] = this.field_H[var15];
                  }
                }
                if (this.field_db[var15] >= 0) {
                  if (this.field_db[var15] > 7999) {
                    this.field_db[var15] = 7999;
                  }
                } else {
                  this.field_db[var15] = 0;
                }
                var16 = field_v[this.field_db[var15]];
                this.a(var15, var16);
              }
            }
          }
        }
        for (var15 = 0; var15 < this.field_X.field_j; var15++) {
          if (!this.field_x[var15]) {
            var16 = this.field_s[var15];
            var17 = this.field_w[var15];
            this.field_V[var15] = 0;
            if (this.field_hb[var15] >= 0) {
              var3 = this.field_hb[var15];
              if ((this.field_X.field_d[this.field_hb[var15]] & 1) == 1) {
                this.field_V[var15] = 1;
                var4 = this.field_Y[var15];
                for (var5 = 0; this.field_X.field_y[var3][var5 + 1] < var4; var5++) {
                }
                var6 = this.field_X.field_y[var3][var5];
                var8 = this.field_X.field_y[var3][var5 + 1];
                var7 = this.field_X.field_u[var3][var5];
                var9 = this.field_X.field_u[var3][var5 + 1];
                if (var8 == var6) {
                  var8++;
                }
                var11 = ((var8 - var4) * var7 + (var4 - var6) * var9) / (var8 - var6);
                var12 = 32768 - this.field_Q[var15];
                if (var12 < 0) {
                  var12 = 0;
                }
                var16 = var16 * var11 * var12 >> 21;
                if ((this.field_X.field_d[var3] & 2) == 2 &&
                  this.field_n[var15] == 1 &&
                  this.field_Y[var15] == this.field_X.field_y[var3][this.field_X.field_k[var3]]) {
                  this.field_Y[var15] = this.field_Y[var15] - 1;
                }
                if (this.field_Y[var15] == this.field_X.field_y[var3][this.field_X.field_y[var3].length - 1]) {
                  this.field_Y[var15] = this.field_Y[var15] - 1;
                }
                if (this.field_n[var15] == 0) {
                  this.field_Q[var15] = this.field_Q[var15] + this.field_X.field_m[var3];
                }
                this.field_Y[var15] = this.field_Y[var15] + 1;
                if ((this.field_X.field_d[var3] & 4) == 4 &&
                  this.field_Y[var15] == this.field_X.field_y[var3][this.field_X.field_H[var3]]) {
                  this.field_Y[var15] = this.field_X.field_y[var3][this.field_X.field_b[var3]];
                }
              }
              if ((this.field_X.field_J[this.field_hb[var15]] & 1) == 1) {
                var4 = this.field_A[var15];
                for (var5 = 0; this.field_X.field_r[var3][var5 + 1] < var4; var5++) {
                }
                var6 = this.field_X.field_r[var3][var5];
                var8 = this.field_X.field_r[var3][var5 + 1];
                var7 = this.field_X.field_z[var3][var5];
                var9 = this.field_X.field_z[var3][var5 + 1];
                if (var8 == var6) {
                  var8++;
                }
                var13 = ((var8 - var4) * var7 + (var4 - var6) * var9) / (var8 - var6);
                var17 = var17 + ((var13 - 32) * (128 - Math.abs(var17 - 128)) >> 5);
                if ((this.field_X.field_J[var3] & 2) == 2 &&
                  this.field_n[var15] == 1 &&
                  this.field_A[var15] == this.field_X.field_r[var3][this.field_X.field_F[var3]]) {
                  this.field_A[var15] = this.field_A[var15] - 1;
                }
                if (this.field_A[var15] == this.field_X.field_r[var3][this.field_X.field_r[var3].length - 1]) {
                  this.field_A[var15] = this.field_A[var15] - 1;
                }
                this.field_A[var15] = this.field_A[var15] + 1;
                if ((this.field_X.field_J[var3] & 4) == 4 &&
                  this.field_A[var15] == this.field_X.field_r[var3][this.field_X.field_v[var3]]) {
                  this.field_A[var15] = this.field_X.field_r[var3][this.field_X.field_C[var3]];
                }
              }
            }
            this.a(var15, var16, var17);
          }
        }
        this.field_T = this.field_T + 1;
        if (this.field_T >= this.field_cb) {
          this.field_T = 0;
        }
        return var14 != 0;
    }

    final synchronized void a(int param0) {
        this.field_M = param0;
    }

    final void b() {
        int var1 = 0;
        for (var1 = 0; var1 < this.field_X.field_j; var1++) {
          if (this.field_R[var1] != null) {
            this.field_f.a(this.field_R[var1]);
          }
        }
    }

    public static void f() {
        field_v = null;
        field_j = null;
    }

    private final void c() {
        this.field_s = new int[this.field_X.field_j];
        this.field_w = new int[this.field_X.field_j];
        this.field_db = new int[this.field_X.field_j];
        this.field_G = new int[this.field_X.field_j];
        this.field_hb = new int[this.field_X.field_j];
        this.field_bb = new int[this.field_X.field_j];
        this.field_z = new int[this.field_X.field_j];
        this.field_eb = new int[this.field_X.field_j];
        this.field_y = new int[this.field_X.field_j];
        this.field_D = new int[this.field_X.field_j];
        this.field_W = new int[this.field_X.field_j];
        this.field_jb = new int[this.field_X.field_j];
        this.field_m = new int[this.field_X.field_j];
        this.field_S = new int[this.field_X.field_j];
        this.field_h = new int[this.field_X.field_j];
        this.field_F = new int[this.field_X.field_j];
        this.field_J = new int[this.field_X.field_j];
        this.field_q = new int[this.field_X.field_j];
        this.field_E = new int[this.field_X.field_j];
        this.field_I = new int[this.field_X.field_j];
        this.field_H = new int[this.field_X.field_j];
        this.field_t = new int[this.field_X.field_j];
        this.field_g = new int[this.field_X.field_j];
        this.field_Y = new int[this.field_X.field_j];
        this.field_A = new int[this.field_X.field_j];
        this.field_V = new int[this.field_X.field_j];
        this.field_n = new int[this.field_X.field_j];
        this.field_Q = new int[this.field_X.field_j];
        this.field_ab = new int[this.field_X.field_j];
        this.field_L = new int[this.field_X.field_j];
        this.field_U = new int[this.field_X.field_j];
        this.field_i = new int[this.field_X.field_j];
        this.field_x = new boolean[this.field_X.field_j];
        this.field_R = new li[this.field_X.field_j];
        this.e();
    }

    final int a(mj param0) {
        if (this.d() &&
          !this.field_P) {
          return -1;
        }
        int var3 = va.field_i;
        int var4 = (var3 << 9) + (var3 << 7);
        return var4 / (this.field_O * this.field_p);
    }

    final synchronized void a(boolean param0) {
        this.field_P = param0 ? true : false;
    }

    private final void a(int param0, int param1, int param2) {
        if (this.field_R[param0] != null) {
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
          this.field_R[param0].b(va.field_i >> 7, param1 * this.field_r * this.field_M >> 12, param2);
        }
    }

    final void a() {
        int var1 = 0;
        for (var1 = 0; var1 < this.field_X.field_j; var1++) {
          if (this.field_R[var1] != null) {
            this.field_f.b(this.field_R[var1]);
          }
        }
    }

    private final void a(int param0, int param1) {
        if (this.field_R[param0] != null) {
          this.field_R[param0].i(param1 * 256 / va.field_i);
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        td stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_14_2 = 0;
        li stackIn_16_0 = null;
        int stackIn_17_1 = 0;
        li stackIn_19_0 = null;
        boolean stackIn_20_1 = false;
        Throwable decompiledCaughtException = null;
        li var7 = null;
        Object var8 = null;
        this.e(param0);
        if (param3 > field_v[7999] &&
          param3 < field_v[0]) {
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
          stackIn_13_0 = this.field_X.field_h[param1];
          stackIn_13_1 = param3 * 256 / va.field_i;
          if (param2 == 0) {
            stackIn_14_2 = param4 * this.field_r * this.field_M >> 12;
          } else {
            stackIn_14_2 = 0;
          }
          var7 = li.a(stackIn_13_0, stackIn_13_1, stackIn_14_2, param5);
          var7.c(this.field_X.field_B[param1], this.field_X.field_A[param1]);
          stackIn_16_0 = var7;
          stackIn_17_1 = (this.field_X.field_c[param1] == 0) ? 0 : -1;
          ((li) (Object) stackIn_16_0).h(stackIn_17_1);
          stackIn_19_0 = var7;
          stackIn_20_1 = (this.field_X.field_c[param1] != 2) ? false : true;
          ((li) (Object) stackIn_19_0).a(stackIn_20_1);
          if (param2 != 0) {
            var7.e(param2);
            var7.b(va.field_i >> 7, param4 * this.field_r * this.field_M >> 12, param5);
          }
          this.field_R[param0] = var7;
          if (this.field_f != null) {
            var8 = this.field_f;
            synchronized (var8) {
              this.field_f.a(var7);
            }
          }
          return;
        }
    }

    qf(lg param0) {
        this.field_Z = -1;
        this.field_T = 0;
        this.field_M = 64;
        this.field_K = 0;
        this.field_o = 0;
        this.field_kb = null;
        this.field_P = true;
        this.field_gb = -1;
        this.field_ib = 0;
        this.field_l = -1;
        this.field_fb = 0;
        this.field_p = 256;
        this.field_u = 0;
        this.field_X = param0;
        this.c();
    }

    static {
        int var0 = 0;
        int var0Lifetime1;
        field_j = new int[68];
        field_v = new int[8000];
        for (var0 = 0; var0 < 8000; var0++) {
          field_v[var0] = (int)(8363.0 * Math.pow(2.0, (double)(4608 - var0) / 768.0));
        }
        for (var0Lifetime1 = 0; var0Lifetime1 < 68; var0Lifetime1++) {
          field_j[var0Lifetime1] = (int)(-2048.0 * Math.sin((double)var0Lifetime1 * 0.0923998));
        }
    }
}
