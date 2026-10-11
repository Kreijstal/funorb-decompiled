/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wl extends sl {
    private int[] field_mb;
    private int field_J;
    private int[] field_kb;
    private int[] field_bb;
    private int[] field_Q;
    private static int[] field_E;
    private int[] field_M;
    private int[] field_ob;
    private int field_C;
    private int[] field_y;
    private int[] field_O;
    private int field_q;
    private static int[] field_T;
    private int field_N;
    private boolean field_jb;
    private int field_hb;
    private int field_m;
    private int field_s;
    private int field_K;
    private int[] field_nb;
    private int[] field_p;
    private int field_W;
    private int[] field_Z;
    private int[] field_gb;
    private int[] field_A;
    private int[] field_o;
    private int[] field_w;
    private int[] field_H;
    private int field_ib;
    private int field_I;
    private int[] field_X;
    private int[] field_L;
    private int[] field_B;
    private int[] field_fb;
    private int[] field_ab;
    private lh field_F;
    private int[] field_r;
    private int[] field_P;
    private int[] field_t;
    private int field_S;
    private int field_eb;
    private int[] field_Y;
    private boolean[] field_D;
    private lh field_x;
    private int[] field_pb;
    private int[] field_v;
    private int[] field_cb;
    private int[] field_U;
    private int field_db;
    private int field_l;
    private int field_R;
    private int[] field_lb;
    private int[] field_G;
    private nj[] field_V;
    private int field_z;
    private int[] field_n;
    private int field_u;

    final synchronized void a(boolean param0) {
        this.field_jb = param0 ? true : false;
    }

    private final boolean f() {
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
        if (this.field_s != 1 &&
          this.field_s != 2) {
          this.field_J = 0;
          return false;
        }
        var14 = 0;
        if (this.field_J == 0) {
          if (this.field_s == 1) {
            this.field_s = 2;
            this.field_S = 0;
            this.field_eb = 0;
            this.field_I = this.field_x.field_K[this.field_S];
            this.field_db = 0;
          }
          if (!(this.field_eb < this.field_x.field_j[this.field_I]) ||
            this.field_l == 1 ||
            this.field_ib != 0 &&
            this.field_eb % this.field_ib == 0 ||
            this.field_C > 0 &&
            this.field_eb % this.field_C == 0) {
            if (this.field_ib == 0) {
              this.field_S = this.field_S + 1;
            } else {
              if (this.field_N <= this.field_S) {
                var14 = 1;
              }
              this.field_S = this.field_N;
            }
            if (this.field_u != -1) {
              this.field_S = this.field_u;
              this.field_u = -1;
            }
            if (this.field_S >= this.field_x.field_k) {
              this.field_S = 0;
              var14 = 1;
            }
            this.field_eb = 0;
            if (this.field_l == 1) {
              this.field_N = this.field_N / 16 * 10 + this.field_N % 16;
              if (this.field_N >= this.field_x.field_j[this.field_I]) {
                this.field_N = 0;
              }
              this.field_eb = this.field_N;
            }
            if (this.field_K >= 0 && (this.field_C >= 0 ||
              var14 != 0)) {
              var15 = this.field_K;
              var16 = this.field_m;
              if (this.field_F != null) {
                for (var17 = 0; var17 < this.field_x.field_M; var17++) {
                  this.b(var17);
                }
                this.field_x = this.field_F;
                this.e();
                this.field_s = 2;
              }
              this.field_S = var15;
              this.field_eb = var16;
              var14 = 0;
              this.field_C = 0;
              this.field_K = -1;
              this.field_m = -1;
              this.field_F = null;
            }
            this.field_I = this.field_x.field_K[this.field_S];
            this.field_db = 0;
            for (var10 = 0; var10 < this.field_eb; var10++) {
              for (var15 = 0; var15 < this.field_x.field_M; var15++) {
                var16 = this.field_x.field_m[this.field_I][this.field_db] & 255;
                this.field_db = this.field_db + 1;
                if (var16 >= 128) {
                  var16 -= 128;
                } else {
                  this.field_db = this.field_db - 1;
                  var16 = 31;
                }
                if ((var16 & 1) == 1) {
                  this.field_db = this.field_db + 1;
                }
                if ((var16 & 2) == 2) {
                  this.field_db = this.field_db + 1;
                }
                if ((var16 & 4) == 4) {
                  this.field_db = this.field_db + 1;
                }
                if ((var16 & 8) == 8) {
                  this.field_db = this.field_db + 1;
                }
                if ((var16 & 16) == 16) {
                  this.field_db = this.field_db + 1;
                }
              }
            }
            this.field_u = -1;
            this.field_l = 0;
            this.field_ib = 0;
          }
          this.field_eb = this.field_eb + 1;
        }
        for (var15 = 0; var15 < this.field_x.field_M; var15++) {
          L55: {
            if (this.field_J != 0) {
              if (this.field_v[var15] < 0) {
                break L55;
              }
              var16 = this.field_v[var15];
            } else {
              var16 = this.field_db;
            }
            this.field_v[var15] = -1;
            var17 = var16;
            var18 = -1;
            var19 = -1;
            var20 = -1;
            var21 = -1;
            var22 = -1;
            var23 = 0;
            var24 = this.field_x.field_m[this.field_I][var16] & 255;
            var16++;
            if (var24 >= 128) {
              var24 -= 128;
            } else {
              var16--;
              var24 = 31;
            }
            if ((var24 & 1) == 1) {
              var18 = this.field_x.field_m[this.field_I][var16] & 255;
              var16++;
            }
            if ((var24 & 2) == 2) {
              var19 = (this.field_x.field_m[this.field_I][var16] & 255) - 1;
              var16++;
            }
            if ((var24 & 4) == 4) {
              var20 = (this.field_x.field_m[this.field_I][var16] & 255) - 16;
              var16++;
            }
            if ((var24 & 8) == 8) {
              var22 = this.field_x.field_m[this.field_I][var16] & 255;
              var16++;
            }
            if ((var24 & 16) == 16) {
              var23 = this.field_x.field_m[this.field_I][var16] & 255;
              var16++;
            }
            if (this.field_J == 0) {
              this.field_db = var16;
            }
            if (!this.field_D[var15]) {
              if (var22 == 14) {
                var22 = var22 * 16 + var23 / 16;
                var23 = var23 & 15;
              }
              if (var22 == 236) {
                if (var23 != 0) {
                  if (this.field_J != var23) {
                    this.field_v[var15] = var17;
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
                this.field_J < var23) {
                this.field_v[var15] = var17;
              } else {
                if (var20 >= 80 &&
                  var20 < 96) {
                  this.field_n[var15] = 2;
                  this.field_O[var15] = 80 - var20;
                  var20 = -1;
                }
                if (var20 >= 96 &&
                  var20 < 112) {
                  this.field_n[var15] = 2;
                  this.field_O[var15] = var20 - 96;
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
                  this.field_L[var15] = 2;
                  this.field_kb[var15] = 192 - var20;
                  var20 = -1;
                }
                if (var20 >= 208 &&
                  var20 < 224) {
                  this.field_L[var15] = 2;
                  this.field_kb[var15] = var20 - 208;
                  var20 = -1;
                }
                if (var20 > 64) {
                  var20 = -1;
                }
                if (var22 == 13) {
                  if (this.field_ib > 1) {
                    this.field_ib = 1;
                  } else {
                    this.field_l = 1;
                    this.field_N = var23;
                  }
                }
                if (var22 == 15) {
                  if (var23 >= 32) {
                    this.field_W = var23;
                  } else {
                    this.field_q = var23;
                  }
                }
                if (var22 == 16) {
                  this.field_R = var23;
                }
                if (var22 == 12) {
                  var20 = var23;
                }
                if (var22 == 8) {
                  var21 = var23;
                  if (var22 == 11 &&
                    this.field_ib <= 1) {
                    this.field_ib = 1;
                    this.field_N = var23;
                  }
                } else {
                  if (var22 == 11 &&
                    this.field_ib <= 1) {
                    this.field_ib = 1;
                    this.field_N = var23;
                  }
                }
                if (var22 == 20) {
                  var18 = 97;
                }
                if (var22 == 21) {
                  this.field_o[var15] = var23;
                  if (this.field_o[var15] >= this.field_x.field_e[var3][this.field_x.field_e[var3].length - 1]) {
                    this.field_o[var15] = this.field_x.field_e[var3][this.field_x.field_e[var3].length - 1] - 1;
                  }
                  this.field_X[var15] = var23;
                  if (this.field_X[var15] >= this.field_x.field_g[var3][this.field_x.field_g[var3].length - 1]) {
                    this.field_X[var15] = this.field_x.field_g[var3][this.field_x.field_g[var3].length - 1] - 1;
                    if (var19 >= 0 &&
                      var18 <= 96) {
                      this.field_o[var15] = 0;
                      this.field_X[var15] = 0;
                      this.field_gb[var15] = 1;
                      this.field_t[var15] = 0;
                    }
                  } else {
                    if (var19 >= 0 &&
                      var18 <= 96) {
                      this.field_o[var15] = 0;
                      this.field_X[var15] = 0;
                      this.field_gb[var15] = 1;
                      this.field_t[var15] = 0;
                    }
                  }
                } else {
                  if (var19 >= 0 &&
                    var18 <= 96) {
                    this.field_o[var15] = 0;
                    this.field_X[var15] = 0;
                    this.field_gb[var15] = 1;
                    this.field_t[var15] = 0;
                  }
                }
                if (var22 == 3 &&
                  var20 < 0 &&
                  var19 != -1) {
                  var20 = this.field_x.field_F[this.field_G[var15]];
                }
                if (var22 == 3 &&
                  var21 < 0 &&
                  var19 != -1) {
                  var21 = this.field_x.field_x[this.field_G[var15]];
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
                    var21 = this.field_Y[var15];
                  }
                  if (var19 != -1) {
                    this.field_w[var15] = var19;
                    if (var18 >= 96) {
                      var19 = this.field_x.field_l[var19][95];
                    } else {
                      var19 = this.field_x.field_l[var19][var18];
                    }
                  } else {
                    var19 = this.field_G[var15];
                  }
                  if (var20 < 0) {
                    var20 = this.field_x.field_F[var19];
                  }
                  if (var21 < 0) {
                    var21 = this.field_x.field_x[var19];
                  }
                  var25 = 7680 - (var18 + this.field_x.field_C[var19]) * 64 - this.field_x.field_z[var19] / 2;
                  if (var25 >= 0) {
                    if (var25 > 7999) {
                      var25 = 7999;
                    }
                  } else {
                    var25 = 0;
                  }
                  this.field_r[var15] = var25;
                  var26 = field_E[var25];
                  this.field_G[var15] = var19;
                  this.field_lb[var15] = var20;
                  this.field_Y[var15] = var21;
                  this.field_P[var15] = var25;
                  var1 = 0;
                  if (var22 == 9) {
                    if (var23 * 256 <= this.field_x.field_v[var19]) {
                      var1 = var23 * 256;
                    } else {
                      var1 = this.field_x.field_v[var19];
                    }
                  }
                  this.a(var15, var19, var1, var26, var20, var21);
                  this.field_U[var15] = 0;
                } else {
                  if (var18 <= 96) {
                    if (var20 >= 0 ||
                      var21 >= 0) {
                      if (var20 >= 0) {
                        this.field_lb[var15] = var20;
                      }
                      if (var21 >= 0) {
                        this.field_Y[var15] = var21;
                      }
                    }
                  } else {
                    if (this.field_M[var15] != 1) {
                      this.b(var15);
                    } else {
                      this.field_gb[var15] = 0;
                    }
                  }
                }
                if (var22 != 3) {
                  if (var22 != 5) {
                    this.field_ab[var15] = 0;
                  }
                } else {
                  this.field_ab[var15] = 1;
                  if (var18 >= 0) {
                    if (var18 <= 96) {
                      var19 = this.field_G[var15];
                      var25 = 7680 - (var18 + this.field_x.field_C[var19]) * 64 - this.field_x.field_z[var19] / 2;
                      if (var25 >= 0) {
                        if (var25 > 7999) {
                          var25 = 7999;
                        }
                      } else {
                        var25 = 0;
                      }
                      this.field_r[var15] = var25;
                      if (var23 != 0) {
                        this.field_mb[var15] = var23;
                        if (this.field_x.field_E == 0) {
                          this.field_mb[var15] = this.field_mb[var15] * 2;
                        }
                      }
                    } else {
                      if (var23 != 0) {
                        this.field_mb[var15] = var23;
                        if (this.field_x.field_E == 0) {
                          this.field_mb[var15] = this.field_mb[var15] * 2;
                        }
                      }
                    }
                  } else {
                    if (var23 != 0) {
                      this.field_mb[var15] = var23;
                      if (this.field_x.field_E == 0) {
                        this.field_mb[var15] = this.field_mb[var15] * 2;
                      }
                    }
                  }
                }
                if (var22 != 4) {
                  if (var22 != 6) {
                    if (this.field_Z[var15] != 0) {
                      var25 = field_E[this.field_P[var15]];
                      this.a(var15, var25);
                    }
                    this.field_U[var15] = 0;
                    this.field_Z[var15] = 0;
                  }
                } else {
                  this.field_Z[var15] = 1;
                  if (var23 / 16 > 0) {
                    this.field_pb[var15] = var23 / 16;
                  }
                  if ((var23 & 15) > 0) {
                    this.field_p[var15] = var23 & 15;
                  }
                }
                if (var22 != 17) {
                  this.field_nb[var15] = 0;
                } else {
                  this.field_nb[var15] = 1;
                  if (var23 != 0) {
                    this.field_A[var15] = (var23 & 240) / 16 - (var23 & 15);
                  }
                }
                if (var22 != 10 &&
                  var22 != 6 &&
                  var22 != 5) {
                  if (this.field_n[var15] != 2) {
                    this.field_n[var15] = 0;
                  } else {
                    this.field_n[var15] = 1;
                  }
                } else {
                  this.field_n[var15] = 1;
                  if (var23 != 0) {
                    this.field_O[var15] = (var23 & 240) / 16 - (var23 & 15);
                  }
                }
                if (var22 != 25) {
                  if (this.field_L[var15] != 2) {
                    this.field_L[var15] = 0;
                  } else {
                    this.field_L[var15] = 1;
                  }
                } else {
                  this.field_L[var15] = 1;
                  if (var23 != 0) {
                    this.field_kb[var15] = (var23 & 240) / 16 - (var23 & 15);
                  }
                }
                if (var22 == 234) {
                  if (var23 != 0) {
                    this.field_bb[var15] = var23;
                  } else {
                    var23 = this.field_bb[var15];
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
                    this.field_ob[var15] = var23;
                  } else {
                    var23 = this.field_ob[var15];
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
                  this.field_Q[var15] = 0;
                } else {
                  if (var23 != 0) {
                    this.field_Q[var15] = var23;
                  }
                }
                if (var22 != 2) {
                  this.field_B[var15] = 0;
                } else {
                  if (var23 != 0) {
                    this.field_B[var15] = var23;
                  }
                }
                switch (var22) {
                  case 225:
                    if (var23 != 0) {
                      this.field_y[var15] = var23;
                    } else {
                      var23 = this.field_y[var15];
                    }
                    this.field_P[var15] = this.field_P[var15] - var23 * 4;
                    if (this.field_P[var15] >= 0) {
                      if (this.field_P[var15] > 7999) {
                        this.field_P[var15] = 7999;
                      }
                    } else {
                      this.field_P[var15] = 0;
                    }
                    var25 = field_E[this.field_P[var15]];
                    this.a(var15, var25);
                    break;
                  case 226:
                    if (var23 != 0) {
                      this.field_fb[var15] = var23;
                    } else {
                      var23 = this.field_fb[var15];
                    }
                    this.field_P[var15] = this.field_P[var15] + var23 * 4;
                    if (this.field_P[var15] >= 0) {
                      if (this.field_P[var15] > 7999) {
                        this.field_P[var15] = 7999;
                      }
                    } else {
                      this.field_P[var15] = 0;
                    }
                    var25 = field_E[this.field_P[var15]];
                    this.a(var15, var25);
                    break;
                  case 33:
                    if (var23 / 16 != 1) {
                      var23 = var23 & 15;
                      if (var23 != 0) {
                        this.field_H[var15] = var23;
                      } else {
                        var23 = this.field_H[var15];
                      }
                      this.field_P[var15] = this.field_P[var15] + var23;
                      if (this.field_P[var15] >= 0) {
                        if (this.field_P[var15] > 7999) {
                          this.field_P[var15] = 7999;
                        }
                      } else {
                        this.field_P[var15] = 0;
                      }
                      var25 = field_E[this.field_P[var15]];
                      this.a(var15, var25);
                    } else {
                      var23 = var23 & 15;
                      if (var23 != 0) {
                        this.field_cb[var15] = var23;
                      } else {
                        var23 = this.field_cb[var15];
                      }
                      this.field_P[var15] = this.field_P[var15] - var23;
                      if (this.field_P[var15] >= 0) {
                        if (this.field_P[var15] > 7999) {
                          this.field_P[var15] = 7999;
                        }
                      } else {
                        this.field_P[var15] = 0;
                      }
                      var25 = field_E[this.field_P[var15]];
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
        if (this.field_J > 0) {
          for (var15 = 0; var15 < this.field_x.field_M; var15++) {
            if (!this.field_D[var15]) {
              if (this.field_nb[var15] != 0) {
                this.field_R = this.field_R + this.field_A[var15];
                if (this.field_R >= 0) {
                  if (this.field_R > 64) {
                    this.field_R = 64;
                  }
                } else {
                  this.field_R = 0;
                }
              }
              if (this.field_n[var15] != 0 ||
                this.field_L[var15] != 0) {
                this.field_lb[var15] = this.field_lb[var15] + this.field_O[var15];
                if (this.field_lb[var15] >= 0) {
                  if (this.field_lb[var15] > 64) {
                    this.field_lb[var15] = 64;
                  }
                } else {
                  this.field_lb[var15] = 0;
                }
                this.field_Y[var15] = this.field_Y[var15] + this.field_kb[var15];
                if (this.field_Y[var15] >= 0) {
                  if (this.field_Y[var15] > 255) {
                    this.field_Y[var15] = 255;
                  }
                } else {
                  this.field_Y[var15] = 0;
                }
              }
              if (this.field_Z[var15] == 1) {
                this.field_U[var15] = (this.field_U[var15] + this.field_pb[var15]) % 68;
                var2 = field_T[this.field_U[var15]] * this.field_p[var15] >> 8;
                var16 = this.field_P[var15] + var2;
                this.a(var15, field_E[var16]);
              }
              if (this.field_Q[var15] > 0) {
                this.field_P[var15] = this.field_P[var15] - this.field_Q[var15] * 4;
                if (this.field_P[var15] >= 0) {
                  if (this.field_P[var15] > 7999) {
                    this.field_P[var15] = 7999;
                  }
                } else {
                  this.field_P[var15] = 0;
                }
                var16 = field_E[this.field_P[var15]];
                this.a(var15, var16);
              }
              if (this.field_B[var15] > 0) {
                this.field_P[var15] = this.field_P[var15] + this.field_B[var15] * 4;
                if (this.field_P[var15] >= 0) {
                  if (this.field_P[var15] > 7999) {
                    this.field_P[var15] = 7999;
                  }
                } else {
                  this.field_P[var15] = 0;
                }
                var16 = field_E[this.field_P[var15]];
                this.a(var15, var16);
              }
              if (this.field_ab[var15] > 0) {
                if (this.field_P[var15] < this.field_r[var15]) {
                  this.field_P[var15] = this.field_P[var15] + this.field_mb[var15] * 4;
                  if (this.field_P[var15] > this.field_r[var15]) {
                    this.field_P[var15] = this.field_r[var15];
                  }
                }
                if (this.field_P[var15] > this.field_r[var15]) {
                  this.field_P[var15] = this.field_P[var15] - this.field_mb[var15] * 4;
                  if (this.field_P[var15] < this.field_r[var15]) {
                    this.field_P[var15] = this.field_r[var15];
                  }
                }
                if (this.field_P[var15] >= 0) {
                  if (this.field_P[var15] > 7999) {
                    this.field_P[var15] = 7999;
                  }
                } else {
                  this.field_P[var15] = 0;
                }
                var16 = field_E[this.field_P[var15]];
                this.a(var15, var16);
              }
            }
          }
        }
        for (var15 = 0; var15 < this.field_x.field_M; var15++) {
          if (!this.field_D[var15]) {
            var16 = this.field_lb[var15];
            var17 = this.field_Y[var15];
            this.field_M[var15] = 0;
            if (this.field_w[var15] >= 0) {
              var3 = this.field_w[var15];
              if ((this.field_x.field_I[this.field_w[var15]] & 1) == 1) {
                this.field_M[var15] = 1;
                var4 = this.field_o[var15];
                for (var5 = 0; this.field_x.field_e[var3][var5 + 1] < var4; var5++) {
                }
                var6 = this.field_x.field_e[var3][var5];
                var8 = this.field_x.field_e[var3][var5 + 1];
                var7 = this.field_x.field_D[var3][var5];
                var9 = this.field_x.field_D[var3][var5 + 1];
                if (var8 == var6) {
                  var8++;
                }
                var11 = ((var8 - var4) * var7 + (var4 - var6) * var9) / (var8 - var6);
                var12 = 32768 - this.field_t[var15];
                if (var12 < 0) {
                  var12 = 0;
                }
                var16 = var16 * var11 * var12 >> 21;
                if ((this.field_x.field_I[var3] & 2) == 2 &&
                  this.field_gb[var15] == 1 &&
                  this.field_o[var15] == this.field_x.field_e[var3][this.field_x.field_L[var3]]) {
                  this.field_o[var15] = this.field_o[var15] - 1;
                }
                if (this.field_o[var15] == this.field_x.field_e[var3][this.field_x.field_e[var3].length - 1]) {
                  this.field_o[var15] = this.field_o[var15] - 1;
                }
                if (this.field_gb[var15] == 0) {
                  this.field_t[var15] = this.field_t[var15] + this.field_x.field_i[var3];
                }
                this.field_o[var15] = this.field_o[var15] + 1;
                if ((this.field_x.field_I[var3] & 4) == 4 &&
                  this.field_o[var15] == this.field_x.field_e[var3][this.field_x.field_G[var3]]) {
                  this.field_o[var15] = this.field_x.field_e[var3][this.field_x.field_N[var3]];
                }
              }
              if ((this.field_x.field_h[this.field_w[var15]] & 1) == 1) {
                var4 = this.field_X[var15];
                for (var5 = 0; this.field_x.field_g[var3][var5 + 1] < var4; var5++) {
                }
                var6 = this.field_x.field_g[var3][var5];
                var8 = this.field_x.field_g[var3][var5 + 1];
                var7 = this.field_x.field_f[var3][var5];
                var9 = this.field_x.field_f[var3][var5 + 1];
                if (var8 == var6) {
                  var8++;
                }
                var13 = ((var8 - var4) * var7 + (var4 - var6) * var9) / (var8 - var6);
                var17 = var17 + ((var13 - 32) * (128 - Math.abs(var17 - 128)) >> 5);
                if ((this.field_x.field_h[var3] & 2) == 2 &&
                  this.field_gb[var15] == 1 &&
                  this.field_X[var15] == this.field_x.field_g[var3][this.field_x.field_b[var3]]) {
                  this.field_X[var15] = this.field_X[var15] - 1;
                }
                if (this.field_X[var15] == this.field_x.field_g[var3][this.field_x.field_g[var3].length - 1]) {
                  this.field_X[var15] = this.field_X[var15] - 1;
                }
                this.field_X[var15] = this.field_X[var15] + 1;
                if ((this.field_x.field_h[var3] & 4) == 4 &&
                  this.field_X[var15] == this.field_x.field_g[var3][this.field_x.field_p[var3]]) {
                  this.field_X[var15] = this.field_x.field_g[var3][this.field_x.field_q[var3]];
                }
              }
            }
            this.a(var15, var16, var17);
          }
        }
        this.field_J = this.field_J + 1;
        if (this.field_J >= this.field_q) {
          this.field_J = 0;
        }
        return var14 != 0;
    }

    final synchronized void a(int param0) {
        this.field_z = param0;
    }

    final void g() {
        if (this.field_j != null) {
          throw new RuntimeException();
        }
        this.c();
    }

    private final void e() {
        this.field_lb = new int[this.field_x.field_M];
        this.field_Y = new int[this.field_x.field_M];
        this.field_P = new int[this.field_x.field_M];
        this.field_G = new int[this.field_x.field_M];
        this.field_w = new int[this.field_x.field_M];
        this.field_A = new int[this.field_x.field_M];
        this.field_O = new int[this.field_x.field_M];
        this.field_kb = new int[this.field_x.field_M];
        this.field_pb = new int[this.field_x.field_M];
        this.field_p = new int[this.field_x.field_M];
        this.field_U = new int[this.field_x.field_M];
        this.field_Z = new int[this.field_x.field_M];
        this.field_bb = new int[this.field_x.field_M];
        this.field_y = new int[this.field_x.field_M];
        this.field_cb = new int[this.field_x.field_M];
        this.field_ob = new int[this.field_x.field_M];
        this.field_fb = new int[this.field_x.field_M];
        this.field_H = new int[this.field_x.field_M];
        this.field_Q = new int[this.field_x.field_M];
        this.field_B = new int[this.field_x.field_M];
        this.field_r = new int[this.field_x.field_M];
        this.field_mb = new int[this.field_x.field_M];
        this.field_v = new int[this.field_x.field_M];
        this.field_o = new int[this.field_x.field_M];
        this.field_X = new int[this.field_x.field_M];
        this.field_M = new int[this.field_x.field_M];
        this.field_gb = new int[this.field_x.field_M];
        this.field_t = new int[this.field_x.field_M];
        this.field_ab = new int[this.field_x.field_M];
        this.field_n = new int[this.field_x.field_M];
        this.field_L = new int[this.field_x.field_M];
        this.field_nb = new int[this.field_x.field_M];
        this.field_D = new boolean[this.field_x.field_M];
        this.field_V = new nj[this.field_x.field_M];
        this.c();
    }

    private final void c() {
        int var1 = 0;
        int var1Lifetime1;
        this.field_J = 0;
        this.field_s = 0;
        this.field_db = 0;
        this.field_eb = 0;
        this.field_S = 0;
        this.field_I = 0;
        this.field_q = this.field_x.field_B;
        this.field_W = this.field_x.field_c;
        this.field_R = 64;
        for (var1 = 0; var1 < this.field_x.field_M; var1++) {
          this.field_O[var1] = 0;
          this.field_kb[var1] = 0;
          this.field_pb[var1] = 0;
          this.field_p[var1] = 0;
          this.field_U[var1] = 0;
          this.field_Z[var1] = 0;
          this.field_bb[var1] = 0;
          this.field_y[var1] = 0;
          this.field_cb[var1] = 0;
          this.field_ob[var1] = 0;
          this.field_fb[var1] = 0;
          this.field_H[var1] = 0;
          this.field_Q[var1] = 0;
          this.field_B[var1] = 0;
          this.field_r[var1] = 0;
          this.field_mb[var1] = 0;
          this.field_v[var1] = -1;
          this.field_o[var1] = 0;
          this.field_X[var1] = 0;
          this.field_M[var1] = 0;
          this.field_gb[var1] = 0;
          this.field_t[var1] = 0;
          this.field_ab[var1] = 0;
          this.field_nb[var1] = 0;
          this.field_n[var1] = 0;
          this.field_L[var1] = 0;
          this.field_G[var1] = 0;
          this.field_lb[var1] = 0;
          this.field_Y[var1] = 128;
          this.field_P[var1] = 0;
          this.field_w[var1] = -1;
        }
        this.field_C = 0;
        this.field_F = null;
        this.field_K = -1;
        this.field_m = -1;
        this.field_ib = 0;
        this.field_N = 0;
        this.field_u = -1;
        this.field_l = 0;
        int var2 = 0;
        var1Lifetime1 = var2;
        while (var2 < this.field_x.field_M) {
          this.field_V[var2] = null;
          this.field_D[var2] = false;
          var2++;
        }
        this.field_s = 1;
    }

    public static void d() {
        field_E = null;
        field_T = null;
    }

    final void b() {
        int var1 = 0;
        for (var1 = 0; var1 < this.field_x.field_M; var1++) {
          if (this.field_V[var1] != null) {
            this.field_j.b(this.field_V[var1]);
          }
        }
    }

    private final void a(int param0, int param1, int param2) {
        if (this.field_V[param0] != null) {
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
          this.field_V[param0].a(pi.field_c >> 7, param1 * this.field_R * this.field_z >> 12, param2);
        }
    }

    final int a(uh param0) {
        if (this.f() &&
          !this.field_jb) {
          return -1;
        }
        int var3 = pi.field_c;
        int var4 = (var3 << 9) + (var3 << 7);
        return var4 / (this.field_W * this.field_hb);
    }

    final void a() {
        int var1 = 0;
        for (var1 = 0; var1 < this.field_x.field_M; var1++) {
          if (this.field_V[var1] != null) {
            this.field_j.a(this.field_V[var1]);
          }
        }
    }

    private final void a(int param0, int param1) {
        if (this.field_V[param0] != null) {
          this.field_V[param0].b(param1 * 256 / pi.field_c);
        }
    }

    private final void b(int param0) {
        if (this.field_V[param0] != null) {
          this.field_V[param0].h(pi.field_c >> 7);
          this.field_V[param0] = null;
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        gg stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_15_2 = 0;
        nj stackIn_17_0 = null;
        int stackIn_18_1 = 0;
        nj stackIn_20_0 = null;
        boolean stackIn_21_1 = false;
        Throwable decompiledCaughtException = null;
        nj var7 = null;
        Object var8 = null;
        this.b(param0);
        if (param3 > field_E[7999] &&
          param3 < field_E[0]) {
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
          stackIn_14_0 = this.field_x.field_o[param1];
          stackIn_14_1 = param3 * 256 / pi.field_c;
          if (param2 == 0) {
            stackIn_15_2 = param4 * this.field_R * this.field_z >> 12;
          } else {
            stackIn_15_2 = 0;
          }
          var7 = nj.a(stackIn_14_0, stackIn_14_1, stackIn_15_2, param5);
          var7.d(this.field_x.field_w[param1], this.field_x.field_t[param1]);
          stackIn_17_0 = var7;
          stackIn_18_1 = (this.field_x.field_y[param1] == 0) ? 0 : -1;
          ((nj) (Object) stackIn_17_0).d(stackIn_18_1);
          stackIn_20_0 = var7;
          stackIn_21_1 = (this.field_x.field_y[param1] != 2) ? false : true;
          ((nj) (Object) stackIn_20_0).a(stackIn_21_1);
          if (param2 != 0) {
            var7.c(param2);
            var7.a(pi.field_c >> 7, param4 * this.field_R * this.field_z >> 12, param5);
          }
          this.field_V[param0] = var7;
          if (this.field_j != null) {
            var8 = this.field_j;
            synchronized (var8) {
              this.field_j.b(var7);
            }
          }
          return;
        }
    }

    wl(lh param0) {
        this.field_C = 0;
        this.field_jb = true;
        this.field_m = -1;
        this.field_s = 0;
        this.field_J = 0;
        this.field_ib = 0;
        this.field_hb = 256;
        this.field_F = null;
        this.field_N = 0;
        this.field_z = 64;
        this.field_K = -1;
        this.field_u = -1;
        this.field_l = 0;
        this.field_x = param0;
        this.e();
    }

    static {
        int var0 = 0;
        int var0Lifetime1;
        field_E = new int[8000];
        field_T = new int[68];
        for (var0 = 0; var0 < 8000; var0++) {
          field_E[var0] = (int)(8363.0 * Math.pow(2.0, (double)(4608 - var0) / 768.0));
        }
        for (var0Lifetime1 = 0; var0Lifetime1 < 68; var0Lifetime1++) {
          field_T[var0Lifetime1] = (int)(-2048.0 * Math.sin((double)var0Lifetime1 * 0.0923998));
        }
    }
}
