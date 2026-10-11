/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wd extends oa {
    private int[] field_C;
    private int[] field_T;
    private static int[] field_jb;
    private static int[] field_U;
    private int[] field_lb;
    private int[] field_u;
    private int[] field_R;
    private int[] field_l;
    private int[] field_J;
    private int[] field_L;
    private boolean[] field_p;
    private int[] field_B;
    private int field_eb;
    private int[] field_j;
    private int[] field_Q;
    private int field_fb;
    private int[] field_Y;
    private int[] field_A;
    private int[] field_F;
    private int field_P;
    private int field_y;
    private int field_v;
    private int[] field_V;
    private int[] field_h;
    private int field_D;
    private int[] field_w;
    private fj[] field_o;
    private int field_q;
    private int field_M;
    private int field_G;
    private boolean field_W;
    private int[] field_bb;
    private int[] field_x;
    private lh field_t;
    private int[] field_kb;
    private int[] field_N;
    private int field_cb;
    private int[] field_gb;
    private int[] field_H;
    private int[] field_z;
    private int[] field_I;
    private int field_n;
    private int field_k;
    private int field_i;
    private int field_K;
    private lh field_ab;
    private int field_S;
    private int[] field_X;
    private int[] field_hb;
    private int field_O;
    private int[] field_r;
    private int field_db;
    private int[] field_m;
    private int field_E;
    private int[] field_s;
    private int[] field_Z;
    private int[] field_ib;

    private final void a(int param0, int param1) {
        if (this.field_o[param0] != null) {
          this.field_o[param0].e(param1 * 256 / df.field_n);
        }
    }

    private final boolean e() {
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
        if (this.field_y != 1 &&
          this.field_y != 2) {
          this.field_P = 0;
          return false;
        }
        var14 = 0;
        if (this.field_P == 0) {
          if (this.field_y == 1) {
            this.field_y = 2;
            this.field_i = 0;
            this.field_G = 0;
            this.field_fb = this.field_ab.field_F[this.field_i];
            this.field_S = 0;
          }
          if (!(this.field_G < this.field_ab.field_c[this.field_fb]) ||
            this.field_v == 1 ||
            this.field_O != 0 &&
            this.field_G % this.field_O == 0 ||
            this.field_n > 0 &&
            this.field_G % this.field_n == 0) {
            if (this.field_O == 0) {
              this.field_i = this.field_i + 1;
            } else {
              if (this.field_eb <= this.field_i) {
                var14 = 1;
              }
              this.field_i = this.field_eb;
            }
            if (this.field_K != -1) {
              this.field_i = this.field_K;
              this.field_K = -1;
            }
            if (this.field_i >= this.field_ab.field_M) {
              this.field_i = 0;
              var14 = 1;
            }
            this.field_G = 0;
            if (this.field_v == 1) {
              this.field_eb = this.field_eb / 16 * 10 + this.field_eb % 16;
              if (this.field_eb >= this.field_ab.field_c[this.field_fb]) {
                this.field_eb = 0;
              }
              this.field_G = this.field_eb;
            }
            if (this.field_M >= 0 && (this.field_n >= 0 ||
              var14 != 0)) {
              var15 = this.field_M;
              var16 = this.field_k;
              if (this.field_t != null) {
                for (var17 = 0; var17 < this.field_ab.field_p; var17++) {
                  this.d(var17);
                }
                this.field_ab = this.field_t;
                this.g();
                this.field_y = 2;
              }
              this.field_i = var15;
              this.field_G = var16;
              var14 = 0;
              this.field_n = 0;
              this.field_M = -1;
              this.field_k = -1;
              this.field_t = null;
            }
            this.field_fb = this.field_ab.field_F[this.field_i];
            this.field_S = 0;
            for (var10 = 0; var10 < this.field_G; var10++) {
              for (var15 = 0; var15 < this.field_ab.field_p; var15++) {
                var16 = this.field_ab.field_l[this.field_fb][this.field_S] & 255;
                this.field_S = this.field_S + 1;
                if (var16 >= 128) {
                  var16 -= 128;
                } else {
                  this.field_S = this.field_S - 1;
                  var16 = 31;
                }
                if ((var16 & 1) == 1) {
                  this.field_S = this.field_S + 1;
                }
                if ((var16 & 2) == 2) {
                  this.field_S = this.field_S + 1;
                }
                if ((var16 & 4) == 4) {
                  this.field_S = this.field_S + 1;
                }
                if ((var16 & 8) == 8) {
                  this.field_S = this.field_S + 1;
                }
                if ((var16 & 16) == 16) {
                  this.field_S = this.field_S + 1;
                }
              }
            }
            this.field_K = -1;
            this.field_v = 0;
            this.field_O = 0;
          }
          this.field_G = this.field_G + 1;
        }
        for (var15 = 0; var15 < this.field_ab.field_p; var15++) {
          L55: {
            if (this.field_P != 0) {
              if (this.field_F[var15] < 0) {
                break L55;
              }
              var16 = this.field_F[var15];
            } else {
              var16 = this.field_S;
            }
            this.field_F[var15] = -1;
            var17 = var16;
            var18 = -1;
            var19 = -1;
            var20 = -1;
            var21 = -1;
            var22 = -1;
            var23 = 0;
            var24 = this.field_ab.field_l[this.field_fb][var16] & 255;
            var16++;
            if (var24 >= 128) {
              var24 -= 128;
            } else {
              var16--;
              var24 = 31;
            }
            if ((var24 & 1) == 1) {
              var18 = this.field_ab.field_l[this.field_fb][var16] & 255;
              var16++;
            }
            if ((var24 & 2) == 2) {
              var19 = (this.field_ab.field_l[this.field_fb][var16] & 255) - 1;
              var16++;
            }
            if ((var24 & 4) == 4) {
              var20 = (this.field_ab.field_l[this.field_fb][var16] & 255) - 16;
              var16++;
            }
            if ((var24 & 8) == 8) {
              var22 = this.field_ab.field_l[this.field_fb][var16] & 255;
              var16++;
            }
            if ((var24 & 16) == 16) {
              var23 = this.field_ab.field_l[this.field_fb][var16] & 255;
              var16++;
            }
            if (this.field_P == 0) {
              this.field_S = var16;
            }
            if (!this.field_p[var15]) {
              if (var22 == 14) {
                var22 = var22 * 16 + var23 / 16;
                var23 = var23 & 15;
              }
              if (var22 == 236) {
                if (var23 != 0) {
                  if (this.field_P != var23) {
                    this.field_F[var15] = var17;
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
                this.field_P < var23) {
                this.field_F[var15] = var17;
              } else {
                if (var20 >= 80 &&
                  var20 < 96) {
                  this.field_A[var15] = 2;
                  this.field_ib[var15] = 80 - var20;
                  var20 = -1;
                }
                if (var20 >= 96 &&
                  var20 < 112) {
                  this.field_A[var15] = 2;
                  this.field_ib[var15] = var20 - 96;
                  var20 = -1;
                }
                if (var20 >= 112 &&
                  var20 < 128) {
                  var20 = this.field_H[var15] - (var20 - 112);
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
                  var20 = this.field_H[var15] + (var20 - 128);
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
                  this.field_C[var15] = 2;
                  this.field_I[var15] = 192 - var20;
                  var20 = -1;
                }
                if (var20 >= 208 &&
                  var20 < 224) {
                  this.field_C[var15] = 2;
                  this.field_I[var15] = var20 - 208;
                  var20 = -1;
                }
                if (var20 > 64) {
                  var20 = -1;
                }
                if (var22 == 13) {
                  if (this.field_O > 1) {
                    this.field_O = 1;
                  } else {
                    this.field_v = 1;
                    this.field_eb = var23;
                  }
                }
                if (var22 == 15) {
                  if (var23 >= 32) {
                    this.field_q = var23;
                  } else {
                    this.field_E = var23;
                  }
                }
                if (var22 == 16) {
                  this.field_D = var23;
                }
                if (var22 == 12) {
                  var20 = var23;
                }
                if (var22 == 8) {
                  var21 = var23;
                  if (var22 == 11 &&
                    this.field_O <= 1) {
                    this.field_O = 1;
                    this.field_eb = var23;
                  }
                } else {
                  if (var22 == 11 &&
                    this.field_O <= 1) {
                    this.field_O = 1;
                    this.field_eb = var23;
                  }
                }
                if (var22 == 20) {
                  var18 = 97;
                }
                if (var22 == 21) {
                  this.field_lb[var15] = var23;
                  if (this.field_lb[var15] >= this.field_ab.field_k[var3][this.field_ab.field_k[var3].length - 1]) {
                    this.field_lb[var15] = this.field_ab.field_k[var3][this.field_ab.field_k[var3].length - 1] - 1;
                  }
                  this.field_N[var15] = var23;
                  if (this.field_N[var15] >= this.field_ab.field_r[var3][this.field_ab.field_r[var3].length - 1]) {
                    this.field_N[var15] = this.field_ab.field_r[var3][this.field_ab.field_r[var3].length - 1] - 1;
                    if (var19 >= 0 &&
                      var18 <= 96) {
                      this.field_lb[var15] = 0;
                      this.field_N[var15] = 0;
                      this.field_j[var15] = 1;
                      this.field_J[var15] = 0;
                    }
                  } else {
                    if (var19 >= 0 &&
                      var18 <= 96) {
                      this.field_lb[var15] = 0;
                      this.field_N[var15] = 0;
                      this.field_j[var15] = 1;
                      this.field_J[var15] = 0;
                    }
                  }
                } else {
                  if (var19 >= 0 &&
                    var18 <= 96) {
                    this.field_lb[var15] = 0;
                    this.field_N[var15] = 0;
                    this.field_j[var15] = 1;
                    this.field_J[var15] = 0;
                  }
                }
                if (var22 == 3 &&
                  var20 < 0 &&
                  var19 != -1) {
                  var20 = this.field_ab.field_E[this.field_r[var15]];
                }
                if (var22 == 3 &&
                  var21 < 0 &&
                  var19 != -1) {
                  var21 = this.field_ab.field_q[this.field_r[var15]];
                }
                if (var18 >= 0 &&
                  var18 <= 96 &&
                  var22 != 3) {
                  if (var19 == -1 &&
                    var20 < 0) {
                    var20 = this.field_H[var15];
                  }
                  if (var19 == -1 &&
                    var21 < 0) {
                    var21 = this.field_X[var15];
                  }
                  if (var19 != -1) {
                    this.field_R[var15] = var19;
                    if (var18 >= 96) {
                      var19 = this.field_ab.field_j[var19][95];
                    } else {
                      var19 = this.field_ab.field_j[var19][var18];
                    }
                  } else {
                    var19 = this.field_r[var15];
                  }
                  if (var20 < 0) {
                    var20 = this.field_ab.field_E[var19];
                  }
                  if (var21 < 0) {
                    var21 = this.field_ab.field_q[var19];
                  }
                  var25 = 7680 - (var18 + this.field_ab.field_J[var19]) * 64 - this.field_ab.field_o[var19] / 2;
                  if (var25 >= 0) {
                    if (var25 > 7999) {
                      var25 = 7999;
                    }
                  } else {
                    var25 = 0;
                  }
                  this.field_Y[var15] = var25;
                  var26 = field_jb[var25];
                  this.field_r[var15] = var19;
                  this.field_H[var15] = var20;
                  this.field_X[var15] = var21;
                  this.field_gb[var15] = var25;
                  var1 = 0;
                  if (var22 == 9) {
                    if (var23 * 256 <= this.field_ab.field_d[var19]) {
                      var1 = var23 * 256;
                    } else {
                      var1 = this.field_ab.field_d[var19];
                    }
                  }
                  this.a(var15, var19, var1, var26, var20, var21);
                  this.field_hb[var15] = 0;
                } else {
                  if (var18 <= 96) {
                    if (var20 >= 0 ||
                      var21 >= 0) {
                      if (var20 >= 0) {
                        this.field_H[var15] = var20;
                      }
                      if (var21 >= 0) {
                        this.field_X[var15] = var21;
                      }
                    }
                  } else {
                    if (this.field_w[var15] != 1) {
                      this.d(var15);
                    } else {
                      this.field_j[var15] = 0;
                    }
                  }
                }
                if (var22 != 3) {
                  if (var22 != 5) {
                    this.field_B[var15] = 0;
                  }
                } else {
                  this.field_B[var15] = 1;
                  if (var18 >= 0) {
                    if (var18 <= 96) {
                      var19 = this.field_r[var15];
                      var25 = 7680 - (var18 + this.field_ab.field_J[var19]) * 64 - this.field_ab.field_o[var19] / 2;
                      if (var25 >= 0) {
                        if (var25 > 7999) {
                          var25 = 7999;
                        }
                      } else {
                        var25 = 0;
                      }
                      this.field_Y[var15] = var25;
                      if (var23 != 0) {
                        this.field_bb[var15] = var23;
                        if (this.field_ab.field_m == 0) {
                          this.field_bb[var15] = this.field_bb[var15] * 2;
                        }
                      }
                    } else {
                      if (var23 != 0) {
                        this.field_bb[var15] = var23;
                        if (this.field_ab.field_m == 0) {
                          this.field_bb[var15] = this.field_bb[var15] * 2;
                        }
                      }
                    }
                  } else {
                    if (var23 != 0) {
                      this.field_bb[var15] = var23;
                      if (this.field_ab.field_m == 0) {
                        this.field_bb[var15] = this.field_bb[var15] * 2;
                      }
                    }
                  }
                }
                if (var22 != 4) {
                  if (var22 != 6) {
                    if (this.field_x[var15] != 0) {
                      var25 = field_jb[this.field_gb[var15]];
                      this.a(var15, var25);
                    }
                    this.field_hb[var15] = 0;
                    this.field_x[var15] = 0;
                  }
                } else {
                  this.field_x[var15] = 1;
                  if (var23 / 16 > 0) {
                    this.field_Z[var15] = var23 / 16;
                  }
                  if ((var23 & 15) > 0) {
                    this.field_Q[var15] = var23 & 15;
                  }
                }
                if (var22 != 17) {
                  this.field_h[var15] = 0;
                } else {
                  this.field_h[var15] = 1;
                  if (var23 != 0) {
                    this.field_s[var15] = (var23 & 240) / 16 - (var23 & 15);
                  }
                }
                if (var22 != 10 &&
                  var22 != 6 &&
                  var22 != 5) {
                  if (this.field_A[var15] != 2) {
                    this.field_A[var15] = 0;
                  } else {
                    this.field_A[var15] = 1;
                  }
                } else {
                  this.field_A[var15] = 1;
                  if (var23 != 0) {
                    this.field_ib[var15] = (var23 & 240) / 16 - (var23 & 15);
                  }
                }
                if (var22 != 25) {
                  if (this.field_C[var15] != 2) {
                    this.field_C[var15] = 0;
                  } else {
                    this.field_C[var15] = 1;
                  }
                } else {
                  this.field_C[var15] = 1;
                  if (var23 != 0) {
                    this.field_I[var15] = (var23 & 240) / 16 - (var23 & 15);
                  }
                }
                if (var22 == 234) {
                  if (var23 != 0) {
                    this.field_L[var15] = var23;
                  } else {
                    var23 = this.field_L[var15];
                  }
                  this.field_H[var15] = this.field_H[var15] + var23;
                  if (this.field_H[var15] >= 0) {
                    if (this.field_H[var15] > 64) {
                      this.field_H[var15] = 64;
                    }
                  } else {
                    this.field_H[var15] = 0;
                  }
                }
                if (var22 == 235) {
                  if (var23 != 0) {
                    this.field_m[var15] = var23;
                  } else {
                    var23 = this.field_m[var15];
                  }
                  this.field_H[var15] = this.field_H[var15] - var23;
                  if (this.field_H[var15] >= 0) {
                    if (this.field_H[var15] > 64) {
                      this.field_H[var15] = 64;
                    }
                  } else {
                    this.field_H[var15] = 0;
                  }
                }
                if (var22 != 1) {
                  this.field_kb[var15] = 0;
                } else {
                  if (var23 != 0) {
                    this.field_kb[var15] = var23;
                  }
                }
                if (var22 != 2) {
                  this.field_l[var15] = 0;
                } else {
                  if (var23 != 0) {
                    this.field_l[var15] = var23;
                  }
                }
                switch (var22) {
                  case 225:
                    if (var23 != 0) {
                      this.field_T[var15] = var23;
                    } else {
                      var23 = this.field_T[var15];
                    }
                    this.field_gb[var15] = this.field_gb[var15] - var23 * 4;
                    if (this.field_gb[var15] >= 0) {
                      if (this.field_gb[var15] > 7999) {
                        this.field_gb[var15] = 7999;
                      }
                    } else {
                      this.field_gb[var15] = 0;
                    }
                    var25 = field_jb[this.field_gb[var15]];
                    this.a(var15, var25);
                    break;
                  case 226:
                    if (var23 != 0) {
                      this.field_V[var15] = var23;
                    } else {
                      var23 = this.field_V[var15];
                    }
                    this.field_gb[var15] = this.field_gb[var15] + var23 * 4;
                    if (this.field_gb[var15] >= 0) {
                      if (this.field_gb[var15] > 7999) {
                        this.field_gb[var15] = 7999;
                      }
                    } else {
                      this.field_gb[var15] = 0;
                    }
                    var25 = field_jb[this.field_gb[var15]];
                    this.a(var15, var25);
                    break;
                  case 33:
                    if (var23 / 16 != 1) {
                      var23 = var23 & 15;
                      if (var23 != 0) {
                        this.field_u[var15] = var23;
                      } else {
                        var23 = this.field_u[var15];
                      }
                      this.field_gb[var15] = this.field_gb[var15] + var23;
                      if (this.field_gb[var15] >= 0) {
                        if (this.field_gb[var15] > 7999) {
                          this.field_gb[var15] = 7999;
                        }
                      } else {
                        this.field_gb[var15] = 0;
                      }
                      var25 = field_jb[this.field_gb[var15]];
                      this.a(var15, var25);
                    } else {
                      var23 = var23 & 15;
                      if (var23 != 0) {
                        this.field_z[var15] = var23;
                      } else {
                        var23 = this.field_z[var15];
                      }
                      this.field_gb[var15] = this.field_gb[var15] - var23;
                      if (this.field_gb[var15] >= 0) {
                        if (this.field_gb[var15] > 7999) {
                          this.field_gb[var15] = 7999;
                        }
                      } else {
                        this.field_gb[var15] = 0;
                      }
                      var25 = field_jb[this.field_gb[var15]];
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
          for (var15 = 0; var15 < this.field_ab.field_p; var15++) {
            if (!this.field_p[var15]) {
              if (this.field_h[var15] != 0) {
                this.field_D = this.field_D + this.field_s[var15];
                if (this.field_D >= 0) {
                  if (this.field_D > 64) {
                    this.field_D = 64;
                  }
                } else {
                  this.field_D = 0;
                }
              }
              if (this.field_A[var15] != 0 ||
                this.field_C[var15] != 0) {
                this.field_H[var15] = this.field_H[var15] + this.field_ib[var15];
                if (this.field_H[var15] >= 0) {
                  if (this.field_H[var15] > 64) {
                    this.field_H[var15] = 64;
                  }
                } else {
                  this.field_H[var15] = 0;
                }
                this.field_X[var15] = this.field_X[var15] + this.field_I[var15];
                if (this.field_X[var15] >= 0) {
                  if (this.field_X[var15] > 255) {
                    this.field_X[var15] = 255;
                  }
                } else {
                  this.field_X[var15] = 0;
                }
              }
              if (this.field_x[var15] == 1) {
                this.field_hb[var15] = (this.field_hb[var15] + this.field_Z[var15]) % 68;
                var2 = field_U[this.field_hb[var15]] * this.field_Q[var15] >> 8;
                var16 = this.field_gb[var15] + var2;
                this.a(var15, field_jb[var16]);
              }
              if (this.field_kb[var15] > 0) {
                this.field_gb[var15] = this.field_gb[var15] - this.field_kb[var15] * 4;
                if (this.field_gb[var15] >= 0) {
                  if (this.field_gb[var15] > 7999) {
                    this.field_gb[var15] = 7999;
                  }
                } else {
                  this.field_gb[var15] = 0;
                }
                var16 = field_jb[this.field_gb[var15]];
                this.a(var15, var16);
              }
              if (this.field_l[var15] > 0) {
                this.field_gb[var15] = this.field_gb[var15] + this.field_l[var15] * 4;
                if (this.field_gb[var15] >= 0) {
                  if (this.field_gb[var15] > 7999) {
                    this.field_gb[var15] = 7999;
                  }
                } else {
                  this.field_gb[var15] = 0;
                }
                var16 = field_jb[this.field_gb[var15]];
                this.a(var15, var16);
              }
              if (this.field_B[var15] > 0) {
                if (this.field_gb[var15] < this.field_Y[var15]) {
                  this.field_gb[var15] = this.field_gb[var15] + this.field_bb[var15] * 4;
                  if (this.field_gb[var15] > this.field_Y[var15]) {
                    this.field_gb[var15] = this.field_Y[var15];
                  }
                }
                if (this.field_gb[var15] > this.field_Y[var15]) {
                  this.field_gb[var15] = this.field_gb[var15] - this.field_bb[var15] * 4;
                  if (this.field_gb[var15] < this.field_Y[var15]) {
                    this.field_gb[var15] = this.field_Y[var15];
                  }
                }
                if (this.field_gb[var15] >= 0) {
                  if (this.field_gb[var15] > 7999) {
                    this.field_gb[var15] = 7999;
                  }
                } else {
                  this.field_gb[var15] = 0;
                }
                var16 = field_jb[this.field_gb[var15]];
                this.a(var15, var16);
              }
            }
          }
        }
        for (var15 = 0; var15 < this.field_ab.field_p; var15++) {
          if (!this.field_p[var15]) {
            var16 = this.field_H[var15];
            var17 = this.field_X[var15];
            this.field_w[var15] = 0;
            if (this.field_R[var15] >= 0) {
              var3 = this.field_R[var15];
              if ((this.field_ab.field_a[this.field_R[var15]] & 1) == 1) {
                this.field_w[var15] = 1;
                var4 = this.field_lb[var15];
                for (var5 = 0; this.field_ab.field_k[var3][var5 + 1] < var4; var5++) {
                }
                var6 = this.field_ab.field_k[var3][var5];
                var8 = this.field_ab.field_k[var3][var5 + 1];
                var7 = this.field_ab.field_f[var3][var5];
                var9 = this.field_ab.field_f[var3][var5 + 1];
                if (var8 == var6) {
                  var8++;
                }
                var11 = ((var8 - var4) * var7 + (var4 - var6) * var9) / (var8 - var6);
                var12 = 32768 - this.field_J[var15];
                if (var12 < 0) {
                  var12 = 0;
                }
                var16 = var16 * var11 * var12 >> 21;
                if ((this.field_ab.field_a[var3] & 2) == 2 &&
                  this.field_j[var15] == 1 &&
                  this.field_lb[var15] == this.field_ab.field_k[var3][this.field_ab.field_P[var3]]) {
                  this.field_lb[var15] = this.field_lb[var15] - 1;
                }
                if (this.field_lb[var15] == this.field_ab.field_k[var3][this.field_ab.field_k[var3].length - 1]) {
                  this.field_lb[var15] = this.field_lb[var15] - 1;
                }
                if (this.field_j[var15] == 0) {
                  this.field_J[var15] = this.field_J[var15] + this.field_ab.field_i[var3];
                }
                this.field_lb[var15] = this.field_lb[var15] + 1;
                if ((this.field_ab.field_a[var3] & 4) == 4 &&
                  this.field_lb[var15] == this.field_ab.field_k[var3][this.field_ab.field_v[var3]]) {
                  this.field_lb[var15] = this.field_ab.field_k[var3][this.field_ab.field_K[var3]];
                }
              }
              if ((this.field_ab.field_b[this.field_R[var15]] & 1) == 1) {
                var4 = this.field_N[var15];
                for (var5 = 0; this.field_ab.field_r[var3][var5 + 1] < var4; var5++) {
                }
                var6 = this.field_ab.field_r[var3][var5];
                var8 = this.field_ab.field_r[var3][var5 + 1];
                var7 = this.field_ab.field_H[var3][var5];
                var9 = this.field_ab.field_H[var3][var5 + 1];
                if (var8 == var6) {
                  var8++;
                }
                var13 = ((var8 - var4) * var7 + (var4 - var6) * var9) / (var8 - var6);
                var17 = var17 + ((var13 - 32) * (128 - Math.abs(var17 - 128)) >> 5);
                if ((this.field_ab.field_b[var3] & 2) == 2 &&
                  this.field_j[var15] == 1 &&
                  this.field_N[var15] == this.field_ab.field_r[var3][this.field_ab.field_C[var3]]) {
                  this.field_N[var15] = this.field_N[var15] - 1;
                }
                if (this.field_N[var15] == this.field_ab.field_r[var3][this.field_ab.field_r[var3].length - 1]) {
                  this.field_N[var15] = this.field_N[var15] - 1;
                }
                this.field_N[var15] = this.field_N[var15] + 1;
                if ((this.field_ab.field_b[var3] & 4) == 4 &&
                  this.field_N[var15] == this.field_ab.field_r[var3][this.field_ab.field_O[var3]]) {
                  this.field_N[var15] = this.field_ab.field_r[var3][this.field_ab.field_z[var3]];
                }
              }
            }
            this.a(var15, var16, var17);
          }
        }
        this.field_P = this.field_P + 1;
        if (this.field_P >= this.field_E) {
          this.field_P = 0;
        }
        return var14 != 0;
    }

    public static void c() {
        field_jb = null;
        field_U = null;
    }

    private final void g() {
        this.field_H = new int[this.field_ab.field_p];
        this.field_X = new int[this.field_ab.field_p];
        this.field_gb = new int[this.field_ab.field_p];
        this.field_r = new int[this.field_ab.field_p];
        this.field_R = new int[this.field_ab.field_p];
        this.field_s = new int[this.field_ab.field_p];
        this.field_ib = new int[this.field_ab.field_p];
        this.field_I = new int[this.field_ab.field_p];
        this.field_Z = new int[this.field_ab.field_p];
        this.field_Q = new int[this.field_ab.field_p];
        this.field_hb = new int[this.field_ab.field_p];
        this.field_x = new int[this.field_ab.field_p];
        this.field_L = new int[this.field_ab.field_p];
        this.field_T = new int[this.field_ab.field_p];
        this.field_z = new int[this.field_ab.field_p];
        this.field_m = new int[this.field_ab.field_p];
        this.field_V = new int[this.field_ab.field_p];
        this.field_u = new int[this.field_ab.field_p];
        this.field_kb = new int[this.field_ab.field_p];
        this.field_l = new int[this.field_ab.field_p];
        this.field_Y = new int[this.field_ab.field_p];
        this.field_bb = new int[this.field_ab.field_p];
        this.field_F = new int[this.field_ab.field_p];
        this.field_lb = new int[this.field_ab.field_p];
        this.field_N = new int[this.field_ab.field_p];
        this.field_w = new int[this.field_ab.field_p];
        this.field_j = new int[this.field_ab.field_p];
        this.field_J = new int[this.field_ab.field_p];
        this.field_B = new int[this.field_ab.field_p];
        this.field_A = new int[this.field_ab.field_p];
        this.field_C = new int[this.field_ab.field_p];
        this.field_h = new int[this.field_ab.field_p];
        this.field_p = new boolean[this.field_ab.field_p];
        this.field_o = new fj[this.field_ab.field_p];
        this.d();
    }

    final void b() {
        int var1 = 0;
        for (var1 = 0; var1 < this.field_ab.field_p; var1++) {
          if (this.field_o[var1] != null) {
            this.field_g.b(this.field_o[var1]);
          }
        }
    }

    private final void a(int param0, int param1, int param2) {
        if (this.field_o[param0] != null) {
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
          this.field_o[param0].b(df.field_n >> 7, param1 * this.field_D * this.field_cb >> 12, param2);
        }
    }

    private final void d() {
        int var1 = 0;
        int var1Lifetime1;
        this.field_P = 0;
        this.field_y = 0;
        this.field_S = 0;
        this.field_G = 0;
        this.field_i = 0;
        this.field_fb = 0;
        this.field_E = this.field_ab.field_w;
        this.field_q = this.field_ab.field_u;
        this.field_D = 64;
        for (var1 = 0; var1 < this.field_ab.field_p; var1++) {
          this.field_ib[var1] = 0;
          this.field_I[var1] = 0;
          this.field_Z[var1] = 0;
          this.field_Q[var1] = 0;
          this.field_hb[var1] = 0;
          this.field_x[var1] = 0;
          this.field_L[var1] = 0;
          this.field_T[var1] = 0;
          this.field_z[var1] = 0;
          this.field_m[var1] = 0;
          this.field_V[var1] = 0;
          this.field_u[var1] = 0;
          this.field_kb[var1] = 0;
          this.field_l[var1] = 0;
          this.field_Y[var1] = 0;
          this.field_bb[var1] = 0;
          this.field_F[var1] = -1;
          this.field_lb[var1] = 0;
          this.field_N[var1] = 0;
          this.field_w[var1] = 0;
          this.field_j[var1] = 0;
          this.field_J[var1] = 0;
          this.field_B[var1] = 0;
          this.field_h[var1] = 0;
          this.field_A[var1] = 0;
          this.field_C[var1] = 0;
          this.field_r[var1] = 0;
          this.field_H[var1] = 0;
          this.field_X[var1] = 128;
          this.field_gb[var1] = 0;
          this.field_R[var1] = -1;
        }
        this.field_n = 0;
        this.field_t = null;
        this.field_M = -1;
        this.field_k = -1;
        this.field_O = 0;
        this.field_eb = 0;
        this.field_K = -1;
        this.field_v = 0;
        int var2 = 0;
        var1Lifetime1 = var2;
        while (var2 < this.field_ab.field_p) {
          this.field_o[var2] = null;
          this.field_p[var2] = false;
          var2++;
        }
        this.field_y = 1;
    }

    private final void d(int param0) {
        if (this.field_o[param0] != null) {
          this.field_o[param0].h(df.field_n >> 7);
          this.field_o[param0] = null;
        }
    }

    final void f() {
        if (this.field_g != null) {
          throw new RuntimeException();
        }
        this.d();
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        ud stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_15_2 = 0;
        fj stackIn_17_0 = null;
        int stackIn_18_1 = 0;
        fj stackIn_20_0 = null;
        boolean stackIn_21_1 = false;
        Throwable decompiledCaughtException = null;
        fj var7 = null;
        Object var8 = null;
        this.d(param0);
        if (param3 > field_jb[7999] &&
          param3 < field_jb[0]) {
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
          stackIn_14_0 = this.field_ab.field_L[param1];
          stackIn_14_1 = param3 * 256 / df.field_n;
          if (param2 == 0) {
            stackIn_15_2 = param4 * this.field_D * this.field_cb >> 12;
          } else {
            stackIn_15_2 = 0;
          }
          var7 = fj.a(stackIn_14_0, stackIn_14_1, stackIn_15_2, param5);
          var7.b(this.field_ab.field_e[param1], this.field_ab.field_A[param1]);
          stackIn_17_0 = var7;
          stackIn_18_1 = (this.field_ab.field_B[param1] == 0) ? 0 : -1;
          ((fj) (Object) stackIn_17_0).g(stackIn_18_1);
          stackIn_20_0 = var7;
          stackIn_21_1 = (this.field_ab.field_B[param1] != 2) ? false : true;
          ((fj) (Object) stackIn_20_0).a(stackIn_21_1);
          if (param2 != 0) {
            var7.d(param2);
            var7.b(df.field_n >> 7, param4 * this.field_D * this.field_cb >> 12, param5);
          }
          this.field_o[param0] = var7;
          if (this.field_g != null) {
            var8 = this.field_g;
            synchronized (var8) {
              this.field_g.b(var7);
            }
          }
          return;
        }
    }

    final int a(vi param0) {
        if (this.e() &&
          !this.field_W) {
          return -1;
        }
        int var3 = df.field_n;
        int var4 = (var3 << 9) + (var3 << 7);
        return var4 / (this.field_q * this.field_db);
    }

    final void a() {
        int var1 = 0;
        for (var1 = 0; var1 < this.field_ab.field_p; var1++) {
          if (this.field_o[var1] != null) {
            this.field_g.a(this.field_o[var1]);
          }
        }
    }

    final synchronized void a(int param0) {
        this.field_cb = param0;
    }

    wd(lh param0) {
        this.field_v = 0;
        this.field_y = 0;
        this.field_cb = 64;
        this.field_eb = 0;
        this.field_n = 0;
        this.field_M = -1;
        this.field_O = 0;
        this.field_K = -1;
        this.field_t = null;
        this.field_W = true;
        this.field_P = 0;
        this.field_k = -1;
        this.field_db = 256;
        this.field_ab = param0;
        this.g();
    }

    static {
        int var0 = 0;
        int var0Lifetime1;
        field_U = new int[68];
        field_jb = new int[8000];
        for (var0 = 0; var0 < 8000; var0++) {
          field_jb[var0] = (int)(8363.0 * Math.pow(2.0, (double)(4608 - var0) / 768.0));
        }
        for (var0Lifetime1 = 0; var0Lifetime1 < 68; var0Lifetime1++) {
          field_U[var0Lifetime1] = (int)(-2048.0 * Math.sin((double)var0Lifetime1 * 0.0923998));
        }
    }
}
