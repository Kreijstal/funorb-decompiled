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
        int var1;
        var1 = 0;
        L0: while (true) {
          if (var1 >= this.field_I.field_H) {
            return;
          } else {
            if (this.field_fb[var1] != null) {
              this.field_n.a(this.field_fb[var1]);
              var1++;
              continue L0;
            } else {
              var1++;
              continue L0;
            }
          }
        }
    }

    private final void d() {
        int var1 = 0;
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
        var1 = var2;
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
        int var1;
        var1 = 0;
        L0: while (true) {
          if (var1 >= this.field_I.field_H) {
            return;
          } else {
            if (this.field_fb[var1] != null) {
              this.field_n.b(this.field_fb[var1]);
              var1++;
              continue L0;
            } else {
              var1++;
              continue L0;
            }
          }
        }
    }

    public static void f() {
        field_nb = null;
        field_K = null;
    }

    private final boolean c() {
        int var1;
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
        int var21;
        int var22;
        int var23;
        int var24;
        int var25;
        int var26;
        L0: {
          var3 = 0;
          if (this.field_pb == 1) {
            break L0;
          } else {
            if (this.field_pb == 2) {
              break L0;
            } else {
              this.field_R = 0;
              return false;
            }
          }
        }
        L1: {
          var14 = 0;
          if (this.field_R != 0) {
            break L1;
          } else {
            L2: {
              if (this.field_pb != 1) {
                break L2;
              } else {
                this.field_pb = 2;
                this.field_H = 0;
                this.field_ab = 0;
                this.field_t = this.field_I.field_s[this.field_H];
                this.field_X = 0;
                break L2;
              }
            }
            L3: {
              L4: {
                if (this.field_ab >= this.field_I.field_d[this.field_t]) {
                  break L4;
                } else {
                  if (this.field_Z == 1) {
                    break L4;
                  } else {
                    L5: {
                      if (this.field_qb == 0) {
                        break L5;
                      } else {
                        if (this.field_ab % this.field_qb == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    if (this.field_ib <= 0) {
                      break L3;
                    } else {
                      if (this.field_ab % this.field_ib != 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
              }
              L6: {
                if (this.field_qb == 0) {
                  this.field_H = this.field_H + 1;
                  break L6;
                } else {
                  L7: {
                    if (this.field_u > this.field_H) {
                      break L7;
                    } else {
                      var14 = 1;
                      break L7;
                    }
                  }
                  this.field_H = this.field_u;
                  break L6;
                }
              }
              L8: {
                if (this.field_N == -1) {
                  break L8;
                } else {
                  this.field_H = this.field_N;
                  this.field_N = -1;
                  break L8;
                }
              }
              L9: {
                if (this.field_H < this.field_I.field_i) {
                  break L9;
                } else {
                  this.field_H = 0;
                  var14 = 1;
                  break L9;
                }
              }
              L10: {
                this.field_ab = 0;
                if (this.field_Z != 1) {
                  break L10;
                } else {
                  L11: {
                    this.field_u = this.field_u / 16 * 10 + this.field_u % 16;
                    if (this.field_u < this.field_I.field_d[this.field_t]) {
                      break L11;
                    } else {
                      this.field_u = 0;
                      break L11;
                    }
                  }
                  this.field_ab = this.field_u;
                  break L10;
                }
              }
              L12: {
                if (this.field_M < 0) {
                  break L12;
                } else {
                  L13: {
                    if (this.field_ib >= 0) {
                      break L13;
                    } else {
                      if (var14 == 0) {
                        break L12;
                      } else {
                        break L13;
                      }
                    }
                  }
                  L14: {
                    var15 = this.field_M;
                    var16 = this.field_rb;
                    if (this.field_V == null) {
                      break L14;
                    } else {
                      var17 = 0;
                      L15: while (true) {
                        if (var17 >= this.field_I.field_H) {
                          this.field_I = this.field_V;
                          this.e();
                          this.field_pb = 2;
                          break L14;
                        } else {
                          this.d(var17);
                          var17++;
                          continue L15;
                        }
                      }
                    }
                  }
                  this.field_H = var15;
                  this.field_ab = var16;
                  var14 = 0;
                  this.field_ib = 0;
                  this.field_M = -1;
                  this.field_rb = -1;
                  this.field_V = null;
                  break L12;
                }
              }
              this.field_t = this.field_I.field_s[this.field_H];
              this.field_X = 0;
              var10 = 0;
              L16: while (true) {
                if (var10 >= this.field_ab) {
                  this.field_N = -1;
                  this.field_Z = 0;
                  this.field_qb = 0;
                  break L3;
                } else {
                  var15 = 0;
                  L17: while (true) {
                    if (var15 >= this.field_I.field_H) {
                      var10++;
                      continue L16;
                    } else {
                      L18: {
                        var16 = this.field_I.field_e[this.field_t][this.field_X] & 255;
                        this.field_X = this.field_X + 1;
                        if (var16 >= 128) {
                          var16 -= 128;
                          break L18;
                        } else {
                          this.field_X = this.field_X - 1;
                          var16 = 31;
                          break L18;
                        }
                      }
                      L19: {
                        if ((var16 & 1) != 1) {
                          break L19;
                        } else {
                          this.field_X = this.field_X + 1;
                          break L19;
                        }
                      }
                      L20: {
                        if ((var16 & 2) != 2) {
                          break L20;
                        } else {
                          this.field_X = this.field_X + 1;
                          break L20;
                        }
                      }
                      L21: {
                        if ((var16 & 4) != 4) {
                          break L21;
                        } else {
                          this.field_X = this.field_X + 1;
                          break L21;
                        }
                      }
                      L22: {
                        if ((var16 & 8) != 8) {
                          break L22;
                        } else {
                          this.field_X = this.field_X + 1;
                          break L22;
                        }
                      }
                      if ((var16 & 16) == 16) {
                        this.field_X = this.field_X + 1;
                        var15++;
                        continue L17;
                      } else {
                        var15++;
                        continue L17;
                      }
                    }
                  }
                }
              }
            }
            this.field_ab = this.field_ab + 1;
            break L1;
          }
        }
        var15 = 0;
        L23: while (true) {
          if (var15 >= this.field_I.field_H) {
            L24: {
              if (this.field_R <= 0) {
                break L24;
              } else {
                var15 = 0;
                L25: while (true) {
                  if (var15 >= this.field_I.field_H) {
                    break L24;
                  } else {
                    if (!this.field_O[var15]) {
                      L26: {
                        if (this.field_Q[var15] == 0) {
                          break L26;
                        } else {
                          this.field_W = this.field_W + this.field_y[var15];
                          if (this.field_W >= 0) {
                            if (this.field_W <= 64) {
                              break L26;
                            } else {
                              this.field_W = 64;
                              break L26;
                            }
                          } else {
                            this.field_W = 0;
                            break L26;
                          }
                        }
                      }
                      L27: {
                        L28: {
                          if (this.field_q[var15] != 0) {
                            break L28;
                          } else {
                            if (this.field_J[var15] == 0) {
                              break L27;
                            } else {
                              break L28;
                            }
                          }
                        }
                        L29: {
                          this.field_lb[var15] = this.field_lb[var15] + this.field_sb[var15];
                          if (this.field_lb[var15] >= 0) {
                            if (this.field_lb[var15] <= 64) {
                              break L29;
                            } else {
                              this.field_lb[var15] = 64;
                              break L29;
                            }
                          } else {
                            this.field_lb[var15] = 0;
                            break L29;
                          }
                        }
                        this.field_x[var15] = this.field_x[var15] + this.field_eb[var15];
                        if (this.field_x[var15] >= 0) {
                          if (this.field_x[var15] <= 255) {
                            break L27;
                          } else {
                            this.field_x[var15] = 255;
                            break L27;
                          }
                        } else {
                          this.field_x[var15] = 0;
                          break L27;
                        }
                      }
                      L30: {
                        if (this.field_D[var15] != 1) {
                          break L30;
                        } else {
                          this.field_B[var15] = (this.field_B[var15] + this.field_gb[var15]) % 68;
                          var2 = field_K[this.field_B[var15]] * this.field_Y[var15] >> 8;
                          var16 = this.field_T[var15] + var2;
                          this.b(var15, field_nb[var16]);
                          break L30;
                        }
                      }
                      L31: {
                        if (this.field_E[var15] <= 0) {
                          break L31;
                        } else {
                          L32: {
                            this.field_T[var15] = this.field_T[var15] - this.field_E[var15] * 4;
                            if (this.field_T[var15] >= 0) {
                              if (this.field_T[var15] <= 7999) {
                                break L32;
                              } else {
                                this.field_T[var15] = 7999;
                                break L32;
                              }
                            } else {
                              this.field_T[var15] = 0;
                              break L32;
                            }
                          }
                          var16 = field_nb[this.field_T[var15]];
                          this.b(var15, var16);
                          break L31;
                        }
                      }
                      L33: {
                        if (this.field_ob[var15] <= 0) {
                          break L33;
                        } else {
                          L34: {
                            this.field_T[var15] = this.field_T[var15] + this.field_ob[var15] * 4;
                            if (this.field_T[var15] >= 0) {
                              if (this.field_T[var15] <= 7999) {
                                break L34;
                              } else {
                                this.field_T[var15] = 7999;
                                break L34;
                              }
                            } else {
                              this.field_T[var15] = 0;
                              break L34;
                            }
                          }
                          var16 = field_nb[this.field_T[var15]];
                          this.b(var15, var16);
                          break L33;
                        }
                      }
                      if (this.field_jb[var15] > 0) {
                        L35: {
                          if (this.field_T[var15] >= this.field_z[var15]) {
                            break L35;
                          } else {
                            this.field_T[var15] = this.field_T[var15] + this.field_v[var15] * 4;
                            if (this.field_T[var15] <= this.field_z[var15]) {
                              break L35;
                            } else {
                              this.field_T[var15] = this.field_z[var15];
                              break L35;
                            }
                          }
                        }
                        L36: {
                          if (this.field_T[var15] <= this.field_z[var15]) {
                            break L36;
                          } else {
                            this.field_T[var15] = this.field_T[var15] - this.field_v[var15] * 4;
                            if (this.field_T[var15] >= this.field_z[var15]) {
                              break L36;
                            } else {
                              this.field_T[var15] = this.field_z[var15];
                              break L36;
                            }
                          }
                        }
                        L37: {
                          if (this.field_T[var15] >= 0) {
                            if (this.field_T[var15] <= 7999) {
                              break L37;
                            } else {
                              this.field_T[var15] = 7999;
                              break L37;
                            }
                          } else {
                            this.field_T[var15] = 0;
                            break L37;
                          }
                        }
                        var16 = field_nb[this.field_T[var15]];
                        this.b(var15, var16);
                        var15++;
                        continue L25;
                      } else {
                        var15++;
                        continue L25;
                      }
                    } else {
                      var15++;
                      continue L25;
                    }
                  }
                }
              }
            }
            var15 = 0;
            L38: while (true) {
              if (var15 >= this.field_I.field_H) {
                L39: {
                  this.field_R = this.field_R + 1;
                  if (this.field_R < this.field_C) {
                    break L39;
                  } else {
                    this.field_R = 0;
                    break L39;
                  }
                }
                return var14 != 0;
              } else {
                if (!this.field_O[var15]) {
                  L40: {
                    var16 = this.field_lb[var15];
                    var17 = this.field_x[var15];
                    this.field_p[var15] = 0;
                    if (this.field_s[var15] < 0) {
                      break L40;
                    } else {
                      L41: {
                        var3 = this.field_s[var15];
                        if ((this.field_I.field_z[this.field_s[var15]] & 1) != 1) {
                          break L41;
                        } else {
                          this.field_p[var15] = 1;
                          var4 = this.field_kb[var15];
                          var5 = 0;
                          L42: while (true) {
                            if (this.field_I.field_q[var3][var5 + 1] >= var4) {
                              L43: {
                                var6 = this.field_I.field_q[var3][var5];
                                var8 = this.field_I.field_q[var3][var5 + 1];
                                var7 = this.field_I.field_F[var3][var5];
                                var9 = this.field_I.field_F[var3][var5 + 1];
                                if (var8 != var6) {
                                  break L43;
                                } else {
                                  var8++;
                                  break L43;
                                }
                              }
                              L44: {
                                var11 = ((var8 - var4) * var7 + (var4 - var6) * var9) / (var8 - var6);
                                var12 = 32768 - this.field_G[var15];
                                if (var12 >= 0) {
                                  break L44;
                                } else {
                                  var12 = 0;
                                  break L44;
                                }
                              }
                              L45: {
                                var16 = var16 * var11 * var12 >> 21;
                                if ((this.field_I.field_z[var3] & 2) != 2) {
                                  break L45;
                                } else {
                                  if (this.field_hb[var15] != 1) {
                                    break L45;
                                  } else {
                                    if (this.field_kb[var15] != this.field_I.field_q[var3][this.field_I.field_r[var3]]) {
                                      break L45;
                                    } else {
                                      this.field_kb[var15] = this.field_kb[var15] - 1;
                                      break L45;
                                    }
                                  }
                                }
                              }
                              L46: {
                                if (this.field_kb[var15] != this.field_I.field_q[var3][this.field_I.field_q[var3].length - 1]) {
                                  break L46;
                                } else {
                                  this.field_kb[var15] = this.field_kb[var15] - 1;
                                  break L46;
                                }
                              }
                              L47: {
                                if (this.field_hb[var15] != 0) {
                                  break L47;
                                } else {
                                  this.field_G[var15] = this.field_G[var15] + this.field_I.field_v[var3];
                                  break L47;
                                }
                              }
                              this.field_kb[var15] = this.field_kb[var15] + 1;
                              if ((this.field_I.field_z[var3] & 4) != 4) {
                                break L41;
                              } else {
                                if (this.field_kb[var15] != this.field_I.field_q[var3][this.field_I.field_K[var3]]) {
                                  break L41;
                                } else {
                                  this.field_kb[var15] = this.field_I.field_q[var3][this.field_I.field_j[var3]];
                                  break L41;
                                }
                              }
                            } else {
                              var5++;
                              continue L42;
                            }
                          }
                        }
                      }
                      if ((this.field_I.field_O[this.field_s[var15]] & 1) != 1) {
                        break L40;
                      } else {
                        var4 = this.field_bb[var15];
                        var5 = 0;
                        L48: while (true) {
                          if (this.field_I.field_c[var3][var5 + 1] >= var4) {
                            L49: {
                              var6 = this.field_I.field_c[var3][var5];
                              var8 = this.field_I.field_c[var3][var5 + 1];
                              var7 = this.field_I.field_a[var3][var5];
                              var9 = this.field_I.field_a[var3][var5 + 1];
                              if (var8 != var6) {
                                break L49;
                              } else {
                                var8++;
                                break L49;
                              }
                            }
                            L50: {
                              var13 = ((var8 - var4) * var7 + (var4 - var6) * var9) / (var8 - var6);
                              var17 = var17 + ((var13 - 32) * (128 - Math.abs(var17 - 128)) >> 5);
                              if ((this.field_I.field_O[var3] & 2) != 2) {
                                break L50;
                              } else {
                                if (this.field_hb[var15] != 1) {
                                  break L50;
                                } else {
                                  if (this.field_bb[var15] != this.field_I.field_c[var3][this.field_I.field_J[var3]]) {
                                    break L50;
                                  } else {
                                    this.field_bb[var15] = this.field_bb[var15] - 1;
                                    break L50;
                                  }
                                }
                              }
                            }
                            L51: {
                              if (this.field_bb[var15] != this.field_I.field_c[var3][this.field_I.field_c[var3].length - 1]) {
                                break L51;
                              } else {
                                this.field_bb[var15] = this.field_bb[var15] - 1;
                                break L51;
                              }
                            }
                            this.field_bb[var15] = this.field_bb[var15] + 1;
                            if ((this.field_I.field_O[var3] & 4) != 4) {
                              break L40;
                            } else {
                              if (this.field_bb[var15] != this.field_I.field_c[var3][this.field_I.field_I[var3]]) {
                                break L40;
                              } else {
                                this.field_bb[var15] = this.field_I.field_c[var3][this.field_I.field_C[var3]];
                                break L40;
                              }
                            }
                          } else {
                            var5++;
                            continue L48;
                          }
                        }
                      }
                    }
                  }
                  this.a(var15, var16, var17);
                  var15++;
                  continue L38;
                } else {
                  var15++;
                  continue L38;
                }
              }
            }
          } else {
            L52: {
              if (this.field_R != 0) {
                if (this.field_P[var15] >= 0) {
                  var16 = this.field_P[var15];
                  break L52;
                } else {
                  var15++;
                  continue L23;
                }
              } else {
                var16 = this.field_X;
                break L52;
              }
            }
            L53: {
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
                break L53;
              } else {
                var16--;
                var24 = 31;
                break L53;
              }
            }
            L54: {
              if ((var24 & 1) != 1) {
                break L54;
              } else {
                var18 = this.field_I.field_e[this.field_t][var16] & 255;
                var16++;
                break L54;
              }
            }
            L55: {
              if ((var24 & 2) != 2) {
                break L55;
              } else {
                var19 = (this.field_I.field_e[this.field_t][var16] & 255) - 1;
                var16++;
                break L55;
              }
            }
            L56: {
              if ((var24 & 4) != 4) {
                break L56;
              } else {
                var20 = (this.field_I.field_e[this.field_t][var16] & 255) - 16;
                var16++;
                break L56;
              }
            }
            L57: {
              if ((var24 & 8) != 8) {
                break L57;
              } else {
                var22 = this.field_I.field_e[this.field_t][var16] & 255;
                var16++;
                break L57;
              }
            }
            L58: {
              if ((var24 & 16) != 16) {
                break L58;
              } else {
                var23 = this.field_I.field_e[this.field_t][var16] & 255;
                var16++;
                break L58;
              }
            }
            L59: {
              if (this.field_R != 0) {
                break L59;
              } else {
                this.field_X = var16;
                break L59;
              }
            }
            if (!this.field_O[var15]) {
              L60: {
                if (var22 != 14) {
                  break L60;
                } else {
                  var22 = var22 * 16 + var23 / 16;
                  var23 = var23 & 15;
                  break L60;
                }
              }
              L61: {
                if (var22 != 236) {
                  break L61;
                } else {
                  if (var23 != 0) {
                    if (this.field_R != var23) {
                      this.field_P[var15] = var17;
                      break L61;
                    } else {
                      var18 = 97;
                      var22 = -1;
                      var21 = -1;
                      var20 = -1;
                      var19 = -1;
                      var23 = 0;
                      break L61;
                    }
                  } else {
                    var18 = 97;
                    break L61;
                  }
                }
              }
              L62: {
                if (var22 != 237) {
                  break L62;
                } else {
                  if (this.field_R >= var23) {
                    break L62;
                  } else {
                    this.field_P[var15] = var17;
                    var15++;
                    continue L23;
                  }
                }
              }
              L63: {
                if (var20 < 80) {
                  break L63;
                } else {
                  if (var20 >= 96) {
                    break L63;
                  } else {
                    this.field_q[var15] = 2;
                    this.field_sb[var15] = 80 - var20;
                    var20 = -1;
                    break L63;
                  }
                }
              }
              L64: {
                if (var20 < 96) {
                  break L64;
                } else {
                  if (var20 >= 112) {
                    break L64;
                  } else {
                    this.field_q[var15] = 2;
                    this.field_sb[var15] = var20 - 96;
                    var20 = -1;
                    break L64;
                  }
                }
              }
              L65: {
                if (var20 < 112) {
                  break L65;
                } else {
                  if (var20 >= 128) {
                    break L65;
                  } else {
                    var20 = this.field_lb[var15] - (var20 - 112);
                    if (var20 >= 0) {
                      if (var20 <= 64) {
                        break L65;
                      } else {
                        var20 = 64;
                        break L65;
                      }
                    } else {
                      var20 = 0;
                      break L65;
                    }
                  }
                }
              }
              L66: {
                if (var20 < 128) {
                  break L66;
                } else {
                  if (var20 >= 136) {
                    break L66;
                  } else {
                    var20 = this.field_lb[var15] + (var20 - 128);
                    if (var20 >= 0) {
                      if (var20 <= 64) {
                        break L66;
                      } else {
                        var20 = 64;
                        break L66;
                      }
                    } else {
                      var20 = 0;
                      break L66;
                    }
                  }
                }
              }
              L67: {
                if (var20 < 176) {
                  break L67;
                } else {
                  if (var20 >= 192) {
                    break L67;
                  } else {
                    var21 = (var20 - 176) * 17;
                    var20 = -1;
                    break L67;
                  }
                }
              }
              L68: {
                if (var20 < 192) {
                  break L68;
                } else {
                  if (var20 >= 208) {
                    break L68;
                  } else {
                    this.field_J[var15] = 2;
                    this.field_eb[var15] = 192 - var20;
                    var20 = -1;
                    break L68;
                  }
                }
              }
              L69: {
                if (var20 < 208) {
                  break L69;
                } else {
                  if (var20 >= 224) {
                    break L69;
                  } else {
                    this.field_J[var15] = 2;
                    this.field_eb[var15] = var20 - 208;
                    var20 = -1;
                    break L69;
                  }
                }
              }
              L70: {
                if (var20 <= 64) {
                  break L70;
                } else {
                  var20 = -1;
                  break L70;
                }
              }
              L71: {
                if (var22 != 13) {
                  break L71;
                } else {
                  if (this.field_qb > 1) {
                    this.field_qb = 1;
                    break L71;
                  } else {
                    this.field_Z = 1;
                    this.field_u = var23;
                    break L71;
                  }
                }
              }
              L72: {
                if (var22 != 15) {
                  break L72;
                } else {
                  if (var23 >= 32) {
                    this.field_L = var23;
                    break L72;
                  } else {
                    this.field_C = var23;
                    break L72;
                  }
                }
              }
              L73: {
                if (var22 != 16) {
                  break L73;
                } else {
                  this.field_W = var23;
                  break L73;
                }
              }
              L74: {
                if (var22 != 12) {
                  break L74;
                } else {
                  var20 = var23;
                  break L74;
                }
              }
              L75: {
                if (var22 != 8) {
                  break L75;
                } else {
                  var21 = var23;
                  break L75;
                }
              }
              L76: {
                if (var22 != 11) {
                  break L76;
                } else {
                  if (this.field_qb > 1) {
                    break L76;
                  } else {
                    this.field_qb = 1;
                    this.field_u = var23;
                    break L76;
                  }
                }
              }
              L77: {
                if (var22 != 20) {
                  break L77;
                } else {
                  var18 = 97;
                  break L77;
                }
              }
              L78: {
                if (var22 != 21) {
                  break L78;
                } else {
                  L79: {
                    this.field_kb[var15] = var23;
                    if (this.field_kb[var15] < this.field_I.field_q[var3][this.field_I.field_q[var3].length - 1]) {
                      break L79;
                    } else {
                      this.field_kb[var15] = this.field_I.field_q[var3][this.field_I.field_q[var3].length - 1] - 1;
                      break L79;
                    }
                  }
                  this.field_bb[var15] = var23;
                  if (this.field_bb[var15] < this.field_I.field_c[var3][this.field_I.field_c[var3].length - 1]) {
                    break L78;
                  } else {
                    this.field_bb[var15] = this.field_I.field_c[var3][this.field_I.field_c[var3].length - 1] - 1;
                    break L78;
                  }
                }
              }
              L80: {
                if (var19 < 0) {
                  break L80;
                } else {
                  if (var18 > 96) {
                    break L80;
                  } else {
                    this.field_kb[var15] = 0;
                    this.field_bb[var15] = 0;
                    this.field_hb[var15] = 1;
                    this.field_G[var15] = 0;
                    break L80;
                  }
                }
              }
              L81: {
                if (var22 != 3) {
                  break L81;
                } else {
                  if (var20 >= 0) {
                    break L81;
                  } else {
                    if (var19 == -1) {
                      break L81;
                    } else {
                      var20 = this.field_I.field_G[this.field_F[var15]];
                      break L81;
                    }
                  }
                }
              }
              L82: {
                if (var22 != 3) {
                  break L82;
                } else {
                  if (var21 >= 0) {
                    break L82;
                  } else {
                    if (var19 == -1) {
                      break L82;
                    } else {
                      var21 = this.field_I.field_n[this.field_F[var15]];
                      break L82;
                    }
                  }
                }
              }
              L83: {
                L84: {
                  if (var18 < 0) {
                    break L84;
                  } else {
                    if (var18 > 96) {
                      break L84;
                    } else {
                      if (var22 == 3) {
                        break L84;
                      } else {
                        L85: {
                          if (var19 != -1) {
                            break L85;
                          } else {
                            if (var20 >= 0) {
                              break L85;
                            } else {
                              var20 = this.field_lb[var15];
                              break L85;
                            }
                          }
                        }
                        L86: {
                          if (var19 != -1) {
                            break L86;
                          } else {
                            if (var21 >= 0) {
                              break L86;
                            } else {
                              var21 = this.field_x[var15];
                              break L86;
                            }
                          }
                        }
                        L87: {
                          if (var19 != -1) {
                            this.field_s[var15] = var19;
                            if (var18 >= 96) {
                              var19 = this.field_I.field_p[var19][95];
                              break L87;
                            } else {
                              var19 = this.field_I.field_p[var19][var18];
                              break L87;
                            }
                          } else {
                            var19 = this.field_F[var15];
                            break L87;
                          }
                        }
                        L88: {
                          if (var20 >= 0) {
                            break L88;
                          } else {
                            var20 = this.field_I.field_G[var19];
                            break L88;
                          }
                        }
                        L89: {
                          if (var21 >= 0) {
                            break L89;
                          } else {
                            var21 = this.field_I.field_n[var19];
                            break L89;
                          }
                        }
                        L90: {
                          var25 = 7680 - (var18 + this.field_I.field_b[var19]) * 64 - this.field_I.field_l[var19] / 2;
                          if (var25 >= 0) {
                            if (var25 <= 7999) {
                              break L90;
                            } else {
                              var25 = 7999;
                              break L90;
                            }
                          } else {
                            var25 = 0;
                            break L90;
                          }
                        }
                        L91: {
                          this.field_z[var15] = var25;
                          var26 = field_nb[var25];
                          this.field_F[var15] = var19;
                          this.field_lb[var15] = var20;
                          this.field_x[var15] = var21;
                          this.field_T[var15] = var25;
                          var1 = 0;
                          if (var22 != 9) {
                            break L91;
                          } else {
                            if (var23 * 256 <= this.field_I.field_B[var19]) {
                              var1 = var23 * 256;
                              break L91;
                            } else {
                              var1 = this.field_I.field_B[var19];
                              break L91;
                            }
                          }
                        }
                        this.a(var15, var19, var1, var26, var20, var21);
                        this.field_B[var15] = 0;
                        break L83;
                      }
                    }
                  }
                }
                if (var18 <= 96) {
                  L92: {
                    if (var20 >= 0) {
                      break L92;
                    } else {
                      if (var21 < 0) {
                        break L83;
                      } else {
                        break L92;
                      }
                    }
                  }
                  L93: {
                    if (var20 < 0) {
                      break L93;
                    } else {
                      this.field_lb[var15] = var20;
                      break L93;
                    }
                  }
                  if (var21 < 0) {
                    break L83;
                  } else {
                    this.field_x[var15] = var21;
                    break L83;
                  }
                } else {
                  if (this.field_p[var15] != 1) {
                    this.d(var15);
                    break L83;
                  } else {
                    this.field_hb[var15] = 0;
                    break L83;
                  }
                }
              }
              L94: {
                if (var22 != 3) {
                  if (var22 == 5) {
                    break L94;
                  } else {
                    this.field_jb[var15] = 0;
                    break L94;
                  }
                } else {
                  this.field_jb[var15] = 1;
                  if (var18 >= 0) {
                    if (var18 <= 96) {
                      L95: {
                        var19 = this.field_F[var15];
                        var25 = 7680 - (var18 + this.field_I.field_b[var19]) * 64 - this.field_I.field_l[var19] / 2;
                        if (var25 >= 0) {
                          if (var25 > 7999) {
                            var25 = 7999;
                            break L95;
                          } else {
                            this.field_z[var15] = var25;
                            if (var23 == 0) {
                              break L94;
                            } else {
                              this.field_v[var15] = var23;
                              if (this.field_I.field_N != 0) {
                                break L94;
                              } else {
                                this.field_v[var15] = this.field_v[var15] * 2;
                                break L94;
                              }
                            }
                          }
                        } else {
                          var25 = 0;
                          break L95;
                        }
                      }
                      this.field_z[var15] = var25;
                      if (var23 == 0) {
                        break L94;
                      } else {
                        this.field_v[var15] = var23;
                        if (this.field_I.field_N != 0) {
                          break L94;
                        } else {
                          this.field_v[var15] = this.field_v[var15] * 2;
                          break L94;
                        }
                      }
                    } else {
                      if (var23 == 0) {
                        break L94;
                      } else {
                        this.field_v[var15] = var23;
                        if (this.field_I.field_N != 0) {
                          break L94;
                        } else {
                          this.field_v[var15] = this.field_v[var15] * 2;
                          break L94;
                        }
                      }
                    }
                  } else {
                    if (var23 == 0) {
                      break L94;
                    } else {
                      this.field_v[var15] = var23;
                      if (this.field_I.field_N != 0) {
                        break L94;
                      } else {
                        this.field_v[var15] = this.field_v[var15] * 2;
                        break L94;
                      }
                    }
                  }
                }
              }
              L96: {
                if (var22 != 4) {
                  if (var22 == 6) {
                    break L96;
                  } else {
                    L97: {
                      if (this.field_D[var15] == 0) {
                        break L97;
                      } else {
                        var25 = field_nb[this.field_T[var15]];
                        this.b(var15, var25);
                        break L97;
                      }
                    }
                    this.field_B[var15] = 0;
                    this.field_D[var15] = 0;
                    break L96;
                  }
                } else {
                  L98: {
                    this.field_D[var15] = 1;
                    if (var23 / 16 <= 0) {
                      break L98;
                    } else {
                      this.field_gb[var15] = var23 / 16;
                      break L98;
                    }
                  }
                  if ((var23 & 15) <= 0) {
                    break L96;
                  } else {
                    this.field_Y[var15] = var23 & 15;
                    break L96;
                  }
                }
              }
              L99: {
                if (var22 != 17) {
                  this.field_Q[var15] = 0;
                  break L99;
                } else {
                  this.field_Q[var15] = 1;
                  if (var23 == 0) {
                    break L99;
                  } else {
                    this.field_y[var15] = (var23 & 240) / 16 - (var23 & 15);
                    break L99;
                  }
                }
              }
              L100: {
                L101: {
                  if (var22 == 10) {
                    break L101;
                  } else {
                    if (var22 == 6) {
                      break L101;
                    } else {
                      if (var22 != 5) {
                        if (this.field_q[var15] != 2) {
                          this.field_q[var15] = 0;
                          break L100;
                        } else {
                          this.field_q[var15] = 1;
                          break L100;
                        }
                      } else {
                        break L101;
                      }
                    }
                  }
                }
                this.field_q[var15] = 1;
                if (var23 == 0) {
                  break L100;
                } else {
                  this.field_sb[var15] = (var23 & 240) / 16 - (var23 & 15);
                  break L100;
                }
              }
              L102: {
                if (var22 != 25) {
                  if (this.field_J[var15] != 2) {
                    this.field_J[var15] = 0;
                    break L102;
                  } else {
                    this.field_J[var15] = 1;
                    break L102;
                  }
                } else {
                  this.field_J[var15] = 1;
                  if (var23 == 0) {
                    break L102;
                  } else {
                    this.field_eb[var15] = (var23 & 240) / 16 - (var23 & 15);
                    break L102;
                  }
                }
              }
              L103: {
                if (var22 != 234) {
                  break L103;
                } else {
                  L104: {
                    if (var23 != 0) {
                      this.field_mb[var15] = var23;
                      break L104;
                    } else {
                      var23 = this.field_mb[var15];
                      break L104;
                    }
                  }
                  this.field_lb[var15] = this.field_lb[var15] + var23;
                  if (this.field_lb[var15] >= 0) {
                    if (this.field_lb[var15] <= 64) {
                      break L103;
                    } else {
                      this.field_lb[var15] = 64;
                      break L103;
                    }
                  } else {
                    this.field_lb[var15] = 0;
                    break L103;
                  }
                }
              }
              L105: {
                if (var22 != 235) {
                  break L105;
                } else {
                  L106: {
                    if (var23 != 0) {
                      this.field_db[var15] = var23;
                      break L106;
                    } else {
                      var23 = this.field_db[var15];
                      break L106;
                    }
                  }
                  this.field_lb[var15] = this.field_lb[var15] - var23;
                  if (this.field_lb[var15] >= 0) {
                    if (this.field_lb[var15] <= 64) {
                      break L105;
                    } else {
                      this.field_lb[var15] = 64;
                      break L105;
                    }
                  } else {
                    this.field_lb[var15] = 0;
                    break L105;
                  }
                }
              }
              L107: {
                if (var22 != 1) {
                  this.field_E[var15] = 0;
                  break L107;
                } else {
                  if (var23 == 0) {
                    break L107;
                  } else {
                    this.field_E[var15] = var23;
                    break L107;
                  }
                }
              }
              L108: {
                if (var22 != 2) {
                  this.field_ob[var15] = 0;
                  break L108;
                } else {
                  if (var23 == 0) {
                    break L108;
                  } else {
                    this.field_ob[var15] = var23;
                    break L108;
                  }
                }
              }
              L109: {
                if (var22 != 225) {
                  break L109;
                } else {
                  L110: {
                    if (var23 != 0) {
                      this.field_cb[var15] = var23;
                      break L110;
                    } else {
                      var23 = this.field_cb[var15];
                      break L110;
                    }
                  }
                  L111: {
                    this.field_T[var15] = this.field_T[var15] - var23 * 4;
                    if (this.field_T[var15] >= 0) {
                      if (this.field_T[var15] <= 7999) {
                        break L111;
                      } else {
                        this.field_T[var15] = 7999;
                        break L111;
                      }
                    } else {
                      this.field_T[var15] = 0;
                      break L111;
                    }
                  }
                  var25 = field_nb[this.field_T[var15]];
                  this.b(var15, var25);
                  break L109;
                }
              }
              L112: {
                if (var22 != 226) {
                  break L112;
                } else {
                  L113: {
                    if (var23 != 0) {
                      this.field_r[var15] = var23;
                      break L113;
                    } else {
                      var23 = this.field_r[var15];
                      break L113;
                    }
                  }
                  L114: {
                    this.field_T[var15] = this.field_T[var15] + var23 * 4;
                    if (this.field_T[var15] >= 0) {
                      if (this.field_T[var15] <= 7999) {
                        break L114;
                      } else {
                        this.field_T[var15] = 7999;
                        break L114;
                      }
                    } else {
                      this.field_T[var15] = 0;
                      break L114;
                    }
                  }
                  var25 = field_nb[this.field_T[var15]];
                  this.b(var15, var25);
                  break L112;
                }
              }
              if (var22 == 33) {
                if (var23 / 16 != 1) {
                  L115: {
                    var23 = var23 & 15;
                    if (var23 != 0) {
                      this.field_tb[var15] = var23;
                      break L115;
                    } else {
                      var23 = this.field_tb[var15];
                      break L115;
                    }
                  }
                  L116: {
                    this.field_T[var15] = this.field_T[var15] + var23;
                    if (this.field_T[var15] >= 0) {
                      if (this.field_T[var15] <= 7999) {
                        break L116;
                      } else {
                        this.field_T[var15] = 7999;
                        break L116;
                      }
                    } else {
                      this.field_T[var15] = 0;
                      break L116;
                    }
                  }
                  var25 = field_nb[this.field_T[var15]];
                  this.b(var15, var25);
                  var15++;
                  continue L23;
                } else {
                  L117: {
                    var23 = var23 & 15;
                    if (var23 != 0) {
                      this.field_S[var15] = var23;
                      break L117;
                    } else {
                      var23 = this.field_S[var15];
                      break L117;
                    }
                  }
                  L118: {
                    this.field_T[var15] = this.field_T[var15] - var23;
                    if (this.field_T[var15] >= 0) {
                      if (this.field_T[var15] <= 7999) {
                        break L118;
                      } else {
                        this.field_T[var15] = 7999;
                        break L118;
                      }
                    } else {
                      this.field_T[var15] = 0;
                      break L118;
                    }
                  }
                  var25 = field_nb[this.field_T[var15]];
                  this.b(var15, var25);
                  var15++;
                  continue L23;
                }
              } else {
                var15++;
                continue L23;
              }
            } else {
              var15++;
              continue L23;
            }
          }
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        ud stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        ud stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        ei stackIn_16_0 = null;
        ei stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        ei stackIn_19_0 = null;
        ei stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        Throwable decompiledCaughtException = null;
        ei var7 = null;
        Object var8 = null;
        L0: {
          this.d(param0);
          if (param3 <= field_nb[7999]) {
            break L0;
          } else {
            if (param3 < field_nb[0]) {
              L1: {
                if (param4 >= 0) {
                  if (param4 <= 64) {
                    break L1;
                  } else {
                    param4 = 64;
                    break L1;
                  }
                } else {
                  param4 = 0;
                  break L1;
                }
              }
              L2: {
                if (param5 >= 0) {
                  if (param5 <= 255) {
                    break L2;
                  } else {
                    param5 = 255;
                    break L2;
                  }
                } else {
                  param5 = 0;
                  break L2;
                }
              }
              L3: {
                stackIn_13_0 = this.field_I.field_g[param1];

                stackIn_13_1 = param3 * 256 / en.field_o;

                if (param2 == 0) {
                  stackIn_14_0 = (ud) ((Object) stackIn_13_0);
                  stackIn_14_1 = stackIn_13_1;
                  stackIn_14_2 = param4 * this.field_W * this.field_A >> 12;
                  break L3;
                } else {
                  stackIn_14_0 = (ud) ((Object) stackIn_13_0);
                  stackIn_14_1 = stackIn_13_1;
                  stackIn_14_2 = 0;
                  break L3;
                }
              }
              L4: {
                var7 = ei.b(stackIn_14_0, stackIn_14_1, stackIn_14_2, param5);
                var7.f(this.field_I.field_w[param1], this.field_I.field_f[param1]);
                stackIn_16_0 = (ei) (var7);

                if (this.field_I.field_M[param1] == 0) {
                  stackIn_17_0 = (ei) ((Object) stackIn_16_0);
                  stackIn_17_1 = 0;
                  break L4;
                } else {
                  stackIn_17_0 = (ei) ((Object) stackIn_16_0);
                  stackIn_17_1 = -1;
                  break L4;
                }
              }
              L5: {
                ((ei) (Object) stackIn_17_0).f(stackIn_17_1);
                stackIn_19_0 = (ei) (var7);

                if (this.field_I.field_M[param1] != 2) {
                  stackIn_20_0 = (ei) ((Object) stackIn_19_0);
                  stackIn_20_1 = 0;
                  break L5;
                } else {
                  stackIn_20_0 = (ei) ((Object) stackIn_19_0);
                  stackIn_20_1 = 1;
                  break L5;
                }
              }
              L6: {
                ((ei) (Object) stackIn_20_0).a(stackIn_20_1 != 0);
                if (param2 == 0) {
                  break L6;
                } else {
                  var7.e(param2);
                  var7.a(en.field_o >> 7, param4 * this.field_W * this.field_A >> 12, param5);
                  break L6;
                }
              }
              L7: {
                this.field_fb[param0] = var7;
                if (this.field_n == null) {
                  break L7;
                } else {
                  var8 = this.field_n;
                  synchronized (var8) {
                    L8: {
                      this.field_n.a(var7);
                      break L8;
                    }
                  }
                  break L7;
                }
              }
              return;
            } else {
              break L0;
            }
          }
        }
    }

    final int a(mi param0) {
        if (this.c() && !this.field_w) {
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
        field_nb = new int[8000];
        field_K = new int[68];
        for (var0 = 0; var0 < 8000; var0++) {
            field_nb[var0] = (int)(8363.0 * Math.pow(2.0, (double)(4608 - var0) / 768.0));
        }
        for (var0 = 0; var0 < 68; var0++) {
            field_K[var0] = (int)(-2048.0 * Math.sin((double)var0 * 0.0923998));
        }
    }
}
