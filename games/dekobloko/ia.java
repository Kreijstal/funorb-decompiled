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
        ((ia) this).field_lb = new int[((ia) this).field_I.field_H];
        ((ia) this).field_x = new int[((ia) this).field_I.field_H];
        ((ia) this).field_T = new int[((ia) this).field_I.field_H];
        ((ia) this).field_F = new int[((ia) this).field_I.field_H];
        ((ia) this).field_s = new int[((ia) this).field_I.field_H];
        ((ia) this).field_y = new int[((ia) this).field_I.field_H];
        ((ia) this).field_sb = new int[((ia) this).field_I.field_H];
        ((ia) this).field_eb = new int[((ia) this).field_I.field_H];
        ((ia) this).field_gb = new int[((ia) this).field_I.field_H];
        ((ia) this).field_Y = new int[((ia) this).field_I.field_H];
        ((ia) this).field_B = new int[((ia) this).field_I.field_H];
        ((ia) this).field_D = new int[((ia) this).field_I.field_H];
        ((ia) this).field_mb = new int[((ia) this).field_I.field_H];
        ((ia) this).field_cb = new int[((ia) this).field_I.field_H];
        ((ia) this).field_S = new int[((ia) this).field_I.field_H];
        ((ia) this).field_db = new int[((ia) this).field_I.field_H];
        ((ia) this).field_r = new int[((ia) this).field_I.field_H];
        ((ia) this).field_tb = new int[((ia) this).field_I.field_H];
        ((ia) this).field_E = new int[((ia) this).field_I.field_H];
        ((ia) this).field_ob = new int[((ia) this).field_I.field_H];
        ((ia) this).field_z = new int[((ia) this).field_I.field_H];
        ((ia) this).field_v = new int[((ia) this).field_I.field_H];
        ((ia) this).field_P = new int[((ia) this).field_I.field_H];
        ((ia) this).field_kb = new int[((ia) this).field_I.field_H];
        ((ia) this).field_bb = new int[((ia) this).field_I.field_H];
        ((ia) this).field_p = new int[((ia) this).field_I.field_H];
        ((ia) this).field_hb = new int[((ia) this).field_I.field_H];
        ((ia) this).field_G = new int[((ia) this).field_I.field_H];
        ((ia) this).field_jb = new int[((ia) this).field_I.field_H];
        ((ia) this).field_q = new int[((ia) this).field_I.field_H];
        ((ia) this).field_J = new int[((ia) this).field_I.field_H];
        ((ia) this).field_Q = new int[((ia) this).field_I.field_H];
        ((ia) this).field_O = new boolean[((ia) this).field_I.field_H];
        ((ia) this).field_fb = new ei[((ia) this).field_I.field_H];
        this.d();
    }

    private final void d(int param0) {
        if (((ia) this).field_fb[param0] != null) {
            ((ia) this).field_fb[param0].g(en.field_o >> 7);
            ((ia) this).field_fb[param0] = null;
        }
    }

    final synchronized void a(ui param0, int param1, int param2, int param3) {
        ((ia) this).field_ib = param3;
        if (param0 != null) {
            ((ia) this).field_V = param0;
        }
        ((ia) this).field_M = param1;
        ((ia) this).field_rb = param2;
    }

    final void b() {
        int var1 = 0;
        for (var1 = 0; var1 < ((ia) this).field_I.field_H; var1++) {
            if (((ia) this).field_fb[var1] != null) {
                ((ia) this).field_n.a((ol) (Object) ((ia) this).field_fb[var1]);
            }
        }
    }

    private final void d() {
        int var1 = 0;
        ((ia) this).field_R = 0;
        ((ia) this).field_pb = 0;
        ((ia) this).field_X = 0;
        ((ia) this).field_ab = 0;
        ((ia) this).field_H = 0;
        ((ia) this).field_t = 0;
        ((ia) this).field_C = ((ia) this).field_I.field_k;
        ((ia) this).field_L = ((ia) this).field_I.field_m;
        ((ia) this).field_W = 64;
        var1 = 0;
        L0: while (true) {
          if (var1 >= ((ia) this).field_I.field_H) {
            ((ia) this).field_ib = 0;
            ((ia) this).field_V = null;
            ((ia) this).field_M = -1;
            ((ia) this).field_rb = -1;
            ((ia) this).field_qb = 0;
            ((ia) this).field_u = 0;
            ((ia) this).field_N = -1;
            ((ia) this).field_Z = 0;
            var1 = 0;
            L1: while (true) {
              if (var1 >= ((ia) this).field_I.field_H) {
                ((ia) this).field_pb = 1;
                return;
              } else {
                ((ia) this).field_fb[var1] = null;
                ((ia) this).field_O[var1] = false;
                var1++;
                continue L1;
              }
            }
          } else {
            ((ia) this).field_sb[var1] = 0;
            ((ia) this).field_eb[var1] = 0;
            ((ia) this).field_gb[var1] = 0;
            ((ia) this).field_Y[var1] = 0;
            ((ia) this).field_B[var1] = 0;
            ((ia) this).field_D[var1] = 0;
            ((ia) this).field_mb[var1] = 0;
            ((ia) this).field_cb[var1] = 0;
            ((ia) this).field_S[var1] = 0;
            ((ia) this).field_db[var1] = 0;
            ((ia) this).field_r[var1] = 0;
            ((ia) this).field_tb[var1] = 0;
            ((ia) this).field_E[var1] = 0;
            ((ia) this).field_ob[var1] = 0;
            ((ia) this).field_z[var1] = 0;
            ((ia) this).field_v[var1] = 0;
            ((ia) this).field_P[var1] = -1;
            ((ia) this).field_kb[var1] = 0;
            ((ia) this).field_bb[var1] = 0;
            ((ia) this).field_p[var1] = 0;
            ((ia) this).field_hb[var1] = 0;
            ((ia) this).field_G[var1] = 0;
            ((ia) this).field_jb[var1] = 0;
            ((ia) this).field_Q[var1] = 0;
            ((ia) this).field_q[var1] = 0;
            ((ia) this).field_J[var1] = 0;
            ((ia) this).field_F[var1] = 0;
            ((ia) this).field_lb[var1] = 0;
            ((ia) this).field_x[var1] = 128;
            ((ia) this).field_T[var1] = 0;
            ((ia) this).field_s[var1] = -1;
            var1++;
            continue L0;
          }
        }
    }

    final synchronized void a(int param0) {
        ((ia) this).field_A = param0;
    }

    private final void a(int param0, int param1, int param2) {
        if (((ia) this).field_fb[param0] != null) {
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
            ((ia) this).field_fb[param0].a(en.field_o >> 7, param1 * ((ia) this).field_W * ((ia) this).field_A >> 12, param2);
        }
    }

    final void a() {
        int var1 = 0;
        for (var1 = 0; var1 < ((ia) this).field_I.field_H; var1++) {
            if (((ia) this).field_fb[var1] != null) {
                ((ia) this).field_n.b((ol) (Object) ((ia) this).field_fb[var1]);
            }
        }
    }

    public static void f() {
        field_nb = null;
        field_K = null;
    }

    private final boolean c() {
        int var1 = 0;
        int var2 = 0;
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
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        L0: {
          var3 = 0;
          if (((ia) this).field_pb == 1) {
            break L0;
          } else {
            if (((ia) this).field_pb == 2) {
              break L0;
            } else {
              ((ia) this).field_R = 0;
              return false;
            }
          }
        }
        L1: {
          var14 = 0;
          if (((ia) this).field_R != 0) {
            break L1;
          } else {
            L2: {
              if (((ia) this).field_pb != 1) {
                break L2;
              } else {
                ((ia) this).field_pb = 2;
                ((ia) this).field_H = 0;
                ((ia) this).field_ab = 0;
                ((ia) this).field_t = ((ia) this).field_I.field_s[((ia) this).field_H];
                ((ia) this).field_X = 0;
                break L2;
              }
            }
            L3: {
              L4: {
                if (((ia) this).field_ab >= ((ia) this).field_I.field_d[((ia) this).field_t]) {
                  break L4;
                } else {
                  if (((ia) this).field_Z == 1) {
                    break L4;
                  } else {
                    L5: {
                      if (((ia) this).field_qb == 0) {
                        break L5;
                      } else {
                        if (((ia) this).field_ab % ((ia) this).field_qb == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    if (((ia) this).field_ib <= 0) {
                      break L3;
                    } else {
                      if (((ia) this).field_ab % ((ia) this).field_ib != 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
              }
              L6: {
                if (((ia) this).field_qb == 0) {
                  ((ia) this).field_H = ((ia) this).field_H + 1;
                  break L6;
                } else {
                  L7: {
                    if (((ia) this).field_u > ((ia) this).field_H) {
                      break L7;
                    } else {
                      var14 = 1;
                      break L7;
                    }
                  }
                  ((ia) this).field_H = ((ia) this).field_u;
                  break L6;
                }
              }
              L8: {
                if (((ia) this).field_N == -1) {
                  break L8;
                } else {
                  ((ia) this).field_H = ((ia) this).field_N;
                  ((ia) this).field_N = -1;
                  break L8;
                }
              }
              L9: {
                if (((ia) this).field_H < ((ia) this).field_I.field_i) {
                  break L9;
                } else {
                  ((ia) this).field_H = 0;
                  var14 = 1;
                  break L9;
                }
              }
              L10: {
                ((ia) this).field_ab = 0;
                if (((ia) this).field_Z != 1) {
                  break L10;
                } else {
                  L11: {
                    ((ia) this).field_u = ((ia) this).field_u / 16 * 10 + ((ia) this).field_u % 16;
                    if (((ia) this).field_u < ((ia) this).field_I.field_d[((ia) this).field_t]) {
                      break L11;
                    } else {
                      ((ia) this).field_u = 0;
                      break L11;
                    }
                  }
                  ((ia) this).field_ab = ((ia) this).field_u;
                  break L10;
                }
              }
              L12: {
                if (((ia) this).field_M < 0) {
                  break L12;
                } else {
                  L13: {
                    if (((ia) this).field_ib >= 0) {
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
                    var15 = ((ia) this).field_M;
                    var16 = ((ia) this).field_rb;
                    if (((ia) this).field_V == null) {
                      break L14;
                    } else {
                      var17 = 0;
                      L15: while (true) {
                        if (var17 >= ((ia) this).field_I.field_H) {
                          ((ia) this).field_I = ((ia) this).field_V;
                          this.e();
                          ((ia) this).field_pb = 2;
                          break L14;
                        } else {
                          this.d(var17);
                          var17++;
                          continue L15;
                        }
                      }
                    }
                  }
                  ((ia) this).field_H = var15;
                  ((ia) this).field_ab = var16;
                  var14 = 0;
                  ((ia) this).field_ib = 0;
                  ((ia) this).field_M = -1;
                  ((ia) this).field_rb = -1;
                  ((ia) this).field_V = null;
                  break L12;
                }
              }
              ((ia) this).field_t = ((ia) this).field_I.field_s[((ia) this).field_H];
              ((ia) this).field_X = 0;
              var10 = 0;
              L16: while (true) {
                if (var10 >= ((ia) this).field_ab) {
                  ((ia) this).field_N = -1;
                  ((ia) this).field_Z = 0;
                  ((ia) this).field_qb = 0;
                  break L3;
                } else {
                  var15 = 0;
                  L17: while (true) {
                    if (var15 >= ((ia) this).field_I.field_H) {
                      var10++;
                      continue L16;
                    } else {
                      L18: {
                        var16 = ((ia) this).field_I.field_e[((ia) this).field_t][((ia) this).field_X] & 255;
                        ((ia) this).field_X = ((ia) this).field_X + 1;
                        if (var16 >= 128) {
                          var16 -= 128;
                          break L18;
                        } else {
                          ((ia) this).field_X = ((ia) this).field_X - 1;
                          var16 = 31;
                          break L18;
                        }
                      }
                      L19: {
                        if ((var16 & 1) != 1) {
                          break L19;
                        } else {
                          ((ia) this).field_X = ((ia) this).field_X + 1;
                          break L19;
                        }
                      }
                      L20: {
                        if ((var16 & 2) != 2) {
                          break L20;
                        } else {
                          ((ia) this).field_X = ((ia) this).field_X + 1;
                          break L20;
                        }
                      }
                      L21: {
                        if ((var16 & 4) != 4) {
                          break L21;
                        } else {
                          ((ia) this).field_X = ((ia) this).field_X + 1;
                          break L21;
                        }
                      }
                      L22: {
                        if ((var16 & 8) != 8) {
                          break L22;
                        } else {
                          ((ia) this).field_X = ((ia) this).field_X + 1;
                          break L22;
                        }
                      }
                      L23: {
                        if ((var16 & 16) != 16) {
                          break L23;
                        } else {
                          ((ia) this).field_X = ((ia) this).field_X + 1;
                          break L23;
                        }
                      }
                      var15++;
                      continue L17;
                    }
                  }
                }
              }
            }
            ((ia) this).field_ab = ((ia) this).field_ab + 1;
            break L1;
          }
        }
        var15 = 0;
        L24: while (true) {
          if (var15 >= ((ia) this).field_I.field_H) {
            L25: {
              if (((ia) this).field_R <= 0) {
                break L25;
              } else {
                var15 = 0;
                L26: while (true) {
                  if (var15 >= ((ia) this).field_I.field_H) {
                    break L25;
                  } else {
                    L27: {
                      if (((ia) this).field_O[var15]) {
                        break L27;
                      } else {
                        L28: {
                          if (((ia) this).field_Q[var15] == 0) {
                            break L28;
                          } else {
                            ((ia) this).field_W = ((ia) this).field_W + ((ia) this).field_y[var15];
                            if (((ia) this).field_W >= 0) {
                              if (((ia) this).field_W <= 64) {
                                break L28;
                              } else {
                                ((ia) this).field_W = 64;
                                break L28;
                              }
                            } else {
                              ((ia) this).field_W = 0;
                              break L28;
                            }
                          }
                        }
                        L29: {
                          L30: {
                            if (((ia) this).field_q[var15] != 0) {
                              break L30;
                            } else {
                              if (((ia) this).field_J[var15] == 0) {
                                break L29;
                              } else {
                                break L30;
                              }
                            }
                          }
                          L31: {
                            ((ia) this).field_lb[var15] = ((ia) this).field_lb[var15] + ((ia) this).field_sb[var15];
                            if (((ia) this).field_lb[var15] >= 0) {
                              if (((ia) this).field_lb[var15] <= 64) {
                                break L31;
                              } else {
                                ((ia) this).field_lb[var15] = 64;
                                break L31;
                              }
                            } else {
                              ((ia) this).field_lb[var15] = 0;
                              break L31;
                            }
                          }
                          ((ia) this).field_x[var15] = ((ia) this).field_x[var15] + ((ia) this).field_eb[var15];
                          if (((ia) this).field_x[var15] >= 0) {
                            if (((ia) this).field_x[var15] <= 255) {
                              break L29;
                            } else {
                              ((ia) this).field_x[var15] = 255;
                              break L29;
                            }
                          } else {
                            ((ia) this).field_x[var15] = 0;
                            break L29;
                          }
                        }
                        L32: {
                          if (((ia) this).field_D[var15] != 1) {
                            break L32;
                          } else {
                            ((ia) this).field_B[var15] = (((ia) this).field_B[var15] + ((ia) this).field_gb[var15]) % 68;
                            var2 = field_K[((ia) this).field_B[var15]] * ((ia) this).field_Y[var15] >> 8;
                            var16 = ((ia) this).field_T[var15] + var2;
                            this.b(var15, field_nb[var16]);
                            break L32;
                          }
                        }
                        L33: {
                          if (((ia) this).field_E[var15] <= 0) {
                            break L33;
                          } else {
                            L34: {
                              ((ia) this).field_T[var15] = ((ia) this).field_T[var15] - ((ia) this).field_E[var15] * 4;
                              if (((ia) this).field_T[var15] >= 0) {
                                if (((ia) this).field_T[var15] <= 7999) {
                                  break L34;
                                } else {
                                  ((ia) this).field_T[var15] = 7999;
                                  break L34;
                                }
                              } else {
                                ((ia) this).field_T[var15] = 0;
                                break L34;
                              }
                            }
                            var16 = field_nb[((ia) this).field_T[var15]];
                            this.b(var15, var16);
                            break L33;
                          }
                        }
                        L35: {
                          if (((ia) this).field_ob[var15] <= 0) {
                            break L35;
                          } else {
                            L36: {
                              ((ia) this).field_T[var15] = ((ia) this).field_T[var15] + ((ia) this).field_ob[var15] * 4;
                              if (((ia) this).field_T[var15] >= 0) {
                                if (((ia) this).field_T[var15] <= 7999) {
                                  break L36;
                                } else {
                                  ((ia) this).field_T[var15] = 7999;
                                  break L36;
                                }
                              } else {
                                ((ia) this).field_T[var15] = 0;
                                break L36;
                              }
                            }
                            var16 = field_nb[((ia) this).field_T[var15]];
                            this.b(var15, var16);
                            break L35;
                          }
                        }
                        if (((ia) this).field_jb[var15] <= 0) {
                          break L27;
                        } else {
                          L37: {
                            if (((ia) this).field_T[var15] >= ((ia) this).field_z[var15]) {
                              break L37;
                            } else {
                              ((ia) this).field_T[var15] = ((ia) this).field_T[var15] + ((ia) this).field_v[var15] * 4;
                              if (((ia) this).field_T[var15] <= ((ia) this).field_z[var15]) {
                                break L37;
                              } else {
                                ((ia) this).field_T[var15] = ((ia) this).field_z[var15];
                                break L37;
                              }
                            }
                          }
                          L38: {
                            if (((ia) this).field_T[var15] <= ((ia) this).field_z[var15]) {
                              break L38;
                            } else {
                              ((ia) this).field_T[var15] = ((ia) this).field_T[var15] - ((ia) this).field_v[var15] * 4;
                              if (((ia) this).field_T[var15] >= ((ia) this).field_z[var15]) {
                                break L38;
                              } else {
                                ((ia) this).field_T[var15] = ((ia) this).field_z[var15];
                                break L38;
                              }
                            }
                          }
                          L39: {
                            if (((ia) this).field_T[var15] >= 0) {
                              if (((ia) this).field_T[var15] <= 7999) {
                                break L39;
                              } else {
                                ((ia) this).field_T[var15] = 7999;
                                break L39;
                              }
                            } else {
                              ((ia) this).field_T[var15] = 0;
                              break L39;
                            }
                          }
                          var16 = field_nb[((ia) this).field_T[var15]];
                          this.b(var15, var16);
                          break L27;
                        }
                      }
                    }
                    var15++;
                    continue L26;
                  }
                }
              }
            }
            var15 = 0;
            L40: while (true) {
              if (var15 >= ((ia) this).field_I.field_H) {
                L41: {
                  ((ia) this).field_R = ((ia) this).field_R + 1;
                  if (((ia) this).field_R < ((ia) this).field_C) {
                    break L41;
                  } else {
                    ((ia) this).field_R = 0;
                    break L41;
                  }
                }
                return var14 != 0;
              } else {
                L42: {
                  if (((ia) this).field_O[var15]) {
                    break L42;
                  } else {
                    L43: {
                      var16 = ((ia) this).field_lb[var15];
                      var17 = ((ia) this).field_x[var15];
                      ((ia) this).field_p[var15] = 0;
                      if (((ia) this).field_s[var15] < 0) {
                        break L43;
                      } else {
                        L44: {
                          var3 = ((ia) this).field_s[var15];
                          if ((((ia) this).field_I.field_z[((ia) this).field_s[var15]] & 1) != 1) {
                            break L44;
                          } else {
                            ((ia) this).field_p[var15] = 1;
                            var4 = ((ia) this).field_kb[var15];
                            var5 = 0;
                            L45: while (true) {
                              if (((ia) this).field_I.field_q[var3][var5 + 1] >= var4) {
                                L46: {
                                  var6 = ((ia) this).field_I.field_q[var3][var5];
                                  var8 = ((ia) this).field_I.field_q[var3][var5 + 1];
                                  var7 = ((ia) this).field_I.field_F[var3][var5];
                                  var9 = ((ia) this).field_I.field_F[var3][var5 + 1];
                                  if (var8 != var6) {
                                    break L46;
                                  } else {
                                    var8++;
                                    break L46;
                                  }
                                }
                                L47: {
                                  var11 = ((var8 - var4) * var7 + (var4 - var6) * var9) / (var8 - var6);
                                  var12 = 32768 - ((ia) this).field_G[var15];
                                  if (var12 >= 0) {
                                    break L47;
                                  } else {
                                    var12 = 0;
                                    break L47;
                                  }
                                }
                                L48: {
                                  var16 = var16 * var11 * var12 >> 21;
                                  if ((((ia) this).field_I.field_z[var3] & 2) != 2) {
                                    break L48;
                                  } else {
                                    if (((ia) this).field_hb[var15] != 1) {
                                      break L48;
                                    } else {
                                      if (((ia) this).field_kb[var15] != ((ia) this).field_I.field_q[var3][((ia) this).field_I.field_r[var3]]) {
                                        break L48;
                                      } else {
                                        ((ia) this).field_kb[var15] = ((ia) this).field_kb[var15] - 1;
                                        break L48;
                                      }
                                    }
                                  }
                                }
                                L49: {
                                  if (((ia) this).field_kb[var15] != ((ia) this).field_I.field_q[var3][((ia) this).field_I.field_q[var3].length - 1]) {
                                    break L49;
                                  } else {
                                    ((ia) this).field_kb[var15] = ((ia) this).field_kb[var15] - 1;
                                    break L49;
                                  }
                                }
                                L50: {
                                  if (((ia) this).field_hb[var15] != 0) {
                                    break L50;
                                  } else {
                                    ((ia) this).field_G[var15] = ((ia) this).field_G[var15] + ((ia) this).field_I.field_v[var3];
                                    break L50;
                                  }
                                }
                                ((ia) this).field_kb[var15] = ((ia) this).field_kb[var15] + 1;
                                if ((((ia) this).field_I.field_z[var3] & 4) != 4) {
                                  break L44;
                                } else {
                                  if (((ia) this).field_kb[var15] != ((ia) this).field_I.field_q[var3][((ia) this).field_I.field_K[var3]]) {
                                    break L44;
                                  } else {
                                    ((ia) this).field_kb[var15] = ((ia) this).field_I.field_q[var3][((ia) this).field_I.field_j[var3]];
                                    break L44;
                                  }
                                }
                              } else {
                                var5++;
                                continue L45;
                              }
                            }
                          }
                        }
                        if ((((ia) this).field_I.field_O[((ia) this).field_s[var15]] & 1) != 1) {
                          break L43;
                        } else {
                          var4 = ((ia) this).field_bb[var15];
                          var5 = 0;
                          L51: while (true) {
                            if (((ia) this).field_I.field_c[var3][var5 + 1] >= var4) {
                              L52: {
                                var6 = ((ia) this).field_I.field_c[var3][var5];
                                var8 = ((ia) this).field_I.field_c[var3][var5 + 1];
                                var7 = ((ia) this).field_I.field_a[var3][var5];
                                var9 = ((ia) this).field_I.field_a[var3][var5 + 1];
                                if (var8 != var6) {
                                  break L52;
                                } else {
                                  var8++;
                                  break L52;
                                }
                              }
                              L53: {
                                var13 = ((var8 - var4) * var7 + (var4 - var6) * var9) / (var8 - var6);
                                var17 = var17 + ((var13 - 32) * (128 - Math.abs(var17 - 128)) >> 5);
                                if ((((ia) this).field_I.field_O[var3] & 2) != 2) {
                                  break L53;
                                } else {
                                  if (((ia) this).field_hb[var15] != 1) {
                                    break L53;
                                  } else {
                                    if (((ia) this).field_bb[var15] != ((ia) this).field_I.field_c[var3][((ia) this).field_I.field_J[var3]]) {
                                      break L53;
                                    } else {
                                      ((ia) this).field_bb[var15] = ((ia) this).field_bb[var15] - 1;
                                      break L53;
                                    }
                                  }
                                }
                              }
                              L54: {
                                if (((ia) this).field_bb[var15] != ((ia) this).field_I.field_c[var3][((ia) this).field_I.field_c[var3].length - 1]) {
                                  break L54;
                                } else {
                                  ((ia) this).field_bb[var15] = ((ia) this).field_bb[var15] - 1;
                                  break L54;
                                }
                              }
                              ((ia) this).field_bb[var15] = ((ia) this).field_bb[var15] + 1;
                              if ((((ia) this).field_I.field_O[var3] & 4) != 4) {
                                break L43;
                              } else {
                                if (((ia) this).field_bb[var15] != ((ia) this).field_I.field_c[var3][((ia) this).field_I.field_I[var3]]) {
                                  break L43;
                                } else {
                                  ((ia) this).field_bb[var15] = ((ia) this).field_I.field_c[var3][((ia) this).field_I.field_C[var3]];
                                  break L43;
                                }
                              }
                            } else {
                              var5++;
                              continue L51;
                            }
                          }
                        }
                      }
                    }
                    this.a(var15, var16, var17);
                    break L42;
                  }
                }
                var15++;
                continue L40;
              }
            }
          } else {
            L55: {
              L56: {
                if (((ia) this).field_R != 0) {
                  if (((ia) this).field_P[var15] >= 0) {
                    var16 = ((ia) this).field_P[var15];
                    break L56;
                  } else {
                    break L55;
                  }
                } else {
                  var16 = ((ia) this).field_X;
                  break L56;
                }
              }
              L57: {
                ((ia) this).field_P[var15] = -1;
                var17 = var16;
                var18 = -1;
                var19 = -1;
                var20 = -1;
                var21 = -1;
                var22 = -1;
                var23 = 0;
                var24 = ((ia) this).field_I.field_e[((ia) this).field_t][var16] & 255;
                var16++;
                if (var24 >= 128) {
                  var24 -= 128;
                  break L57;
                } else {
                  var16--;
                  var24 = 31;
                  break L57;
                }
              }
              L58: {
                if ((var24 & 1) != 1) {
                  break L58;
                } else {
                  var18 = ((ia) this).field_I.field_e[((ia) this).field_t][var16] & 255;
                  var16++;
                  break L58;
                }
              }
              L59: {
                if ((var24 & 2) != 2) {
                  break L59;
                } else {
                  var19 = (((ia) this).field_I.field_e[((ia) this).field_t][var16] & 255) - 1;
                  var16++;
                  break L59;
                }
              }
              L60: {
                if ((var24 & 4) != 4) {
                  break L60;
                } else {
                  var20 = (((ia) this).field_I.field_e[((ia) this).field_t][var16] & 255) - 16;
                  var16++;
                  break L60;
                }
              }
              L61: {
                if ((var24 & 8) != 8) {
                  break L61;
                } else {
                  var22 = ((ia) this).field_I.field_e[((ia) this).field_t][var16] & 255;
                  var16++;
                  break L61;
                }
              }
              L62: {
                if ((var24 & 16) != 16) {
                  break L62;
                } else {
                  var23 = ((ia) this).field_I.field_e[((ia) this).field_t][var16] & 255;
                  var16++;
                  break L62;
                }
              }
              L63: {
                if (((ia) this).field_R != 0) {
                  break L63;
                } else {
                  ((ia) this).field_X = var16;
                  break L63;
                }
              }
              if (((ia) this).field_O[var15]) {
                break L55;
              } else {
                L64: {
                  if (var22 != 14) {
                    break L64;
                  } else {
                    var22 = var22 * 16 + var23 / 16;
                    var23 = var23 & 15;
                    break L64;
                  }
                }
                L65: {
                  if (var22 != 236) {
                    break L65;
                  } else {
                    if (var23 != 0) {
                      if (((ia) this).field_R != var23) {
                        ((ia) this).field_P[var15] = var17;
                        break L65;
                      } else {
                        var18 = 97;
                        var22 = -1;
                        var21 = -1;
                        var20 = -1;
                        var19 = -1;
                        var23 = 0;
                        break L65;
                      }
                    } else {
                      var18 = 97;
                      break L65;
                    }
                  }
                }
                L66: {
                  if (var22 != 237) {
                    break L66;
                  } else {
                    if (((ia) this).field_R >= var23) {
                      break L66;
                    } else {
                      ((ia) this).field_P[var15] = var17;
                      break L55;
                    }
                  }
                }
                L67: {
                  if (var20 < 80) {
                    break L67;
                  } else {
                    if (var20 >= 96) {
                      break L67;
                    } else {
                      ((ia) this).field_q[var15] = 2;
                      ((ia) this).field_sb[var15] = 80 - var20;
                      var20 = -1;
                      break L67;
                    }
                  }
                }
                L68: {
                  if (var20 < 96) {
                    break L68;
                  } else {
                    if (var20 >= 112) {
                      break L68;
                    } else {
                      ((ia) this).field_q[var15] = 2;
                      ((ia) this).field_sb[var15] = var20 - 96;
                      var20 = -1;
                      break L68;
                    }
                  }
                }
                L69: {
                  if (var20 < 112) {
                    break L69;
                  } else {
                    if (var20 >= 128) {
                      break L69;
                    } else {
                      var20 = ((ia) this).field_lb[var15] - (var20 - 112);
                      if (var20 >= 0) {
                        if (var20 <= 64) {
                          break L69;
                        } else {
                          var20 = 64;
                          break L69;
                        }
                      } else {
                        var20 = 0;
                        break L69;
                      }
                    }
                  }
                }
                L70: {
                  if (var20 < 128) {
                    break L70;
                  } else {
                    if (var20 >= 136) {
                      break L70;
                    } else {
                      var20 = ((ia) this).field_lb[var15] + (var20 - 128);
                      if (var20 >= 0) {
                        if (var20 <= 64) {
                          break L70;
                        } else {
                          var20 = 64;
                          break L70;
                        }
                      } else {
                        var20 = 0;
                        break L70;
                      }
                    }
                  }
                }
                L71: {
                  if (var20 < 176) {
                    break L71;
                  } else {
                    if (var20 >= 192) {
                      break L71;
                    } else {
                      var21 = (var20 - 176) * 17;
                      var20 = -1;
                      break L71;
                    }
                  }
                }
                L72: {
                  if (var20 < 192) {
                    break L72;
                  } else {
                    if (var20 >= 208) {
                      break L72;
                    } else {
                      ((ia) this).field_J[var15] = 2;
                      ((ia) this).field_eb[var15] = 192 - var20;
                      var20 = -1;
                      break L72;
                    }
                  }
                }
                L73: {
                  if (var20 < 208) {
                    break L73;
                  } else {
                    if (var20 >= 224) {
                      break L73;
                    } else {
                      ((ia) this).field_J[var15] = 2;
                      ((ia) this).field_eb[var15] = var20 - 208;
                      var20 = -1;
                      break L73;
                    }
                  }
                }
                L74: {
                  if (var20 <= 64) {
                    break L74;
                  } else {
                    var20 = -1;
                    break L74;
                  }
                }
                L75: {
                  if (var22 != 13) {
                    break L75;
                  } else {
                    if (((ia) this).field_qb > 1) {
                      ((ia) this).field_qb = 1;
                      break L75;
                    } else {
                      ((ia) this).field_Z = 1;
                      ((ia) this).field_u = var23;
                      break L75;
                    }
                  }
                }
                L76: {
                  if (var22 != 15) {
                    break L76;
                  } else {
                    if (var23 >= 32) {
                      ((ia) this).field_L = var23;
                      break L76;
                    } else {
                      ((ia) this).field_C = var23;
                      break L76;
                    }
                  }
                }
                L77: {
                  if (var22 != 16) {
                    break L77;
                  } else {
                    ((ia) this).field_W = var23;
                    break L77;
                  }
                }
                L78: {
                  if (var22 != 12) {
                    break L78;
                  } else {
                    var20 = var23;
                    break L78;
                  }
                }
                L79: {
                  if (var22 != 8) {
                    break L79;
                  } else {
                    var21 = var23;
                    break L79;
                  }
                }
                L80: {
                  if (var22 != 11) {
                    break L80;
                  } else {
                    if (((ia) this).field_qb > 1) {
                      break L80;
                    } else {
                      ((ia) this).field_qb = 1;
                      ((ia) this).field_u = var23;
                      break L80;
                    }
                  }
                }
                L81: {
                  if (var22 != 20) {
                    break L81;
                  } else {
                    var18 = 97;
                    break L81;
                  }
                }
                L82: {
                  if (var22 != 21) {
                    break L82;
                  } else {
                    L83: {
                      ((ia) this).field_kb[var15] = var23;
                      if (((ia) this).field_kb[var15] < ((ia) this).field_I.field_q[var3][((ia) this).field_I.field_q[var3].length - 1]) {
                        break L83;
                      } else {
                        ((ia) this).field_kb[var15] = ((ia) this).field_I.field_q[var3][((ia) this).field_I.field_q[var3].length - 1] - 1;
                        break L83;
                      }
                    }
                    ((ia) this).field_bb[var15] = var23;
                    if (((ia) this).field_bb[var15] < ((ia) this).field_I.field_c[var3][((ia) this).field_I.field_c[var3].length - 1]) {
                      break L82;
                    } else {
                      ((ia) this).field_bb[var15] = ((ia) this).field_I.field_c[var3][((ia) this).field_I.field_c[var3].length - 1] - 1;
                      break L82;
                    }
                  }
                }
                L84: {
                  if (var19 < 0) {
                    break L84;
                  } else {
                    if (var18 > 96) {
                      break L84;
                    } else {
                      ((ia) this).field_kb[var15] = 0;
                      ((ia) this).field_bb[var15] = 0;
                      ((ia) this).field_hb[var15] = 1;
                      ((ia) this).field_G[var15] = 0;
                      break L84;
                    }
                  }
                }
                L85: {
                  if (var22 != 3) {
                    break L85;
                  } else {
                    if (var20 >= 0) {
                      break L85;
                    } else {
                      if (var19 == -1) {
                        break L85;
                      } else {
                        var20 = ((ia) this).field_I.field_G[((ia) this).field_F[var15]];
                        break L85;
                      }
                    }
                  }
                }
                L86: {
                  if (var22 != 3) {
                    break L86;
                  } else {
                    if (var21 >= 0) {
                      break L86;
                    } else {
                      if (var19 == -1) {
                        break L86;
                      } else {
                        var21 = ((ia) this).field_I.field_n[((ia) this).field_F[var15]];
                        break L86;
                      }
                    }
                  }
                }
                L87: {
                  L88: {
                    if (var18 < 0) {
                      break L88;
                    } else {
                      if (var18 > 96) {
                        break L88;
                      } else {
                        if (var22 == 3) {
                          break L88;
                        } else {
                          L89: {
                            if (var19 != -1) {
                              break L89;
                            } else {
                              if (var20 >= 0) {
                                break L89;
                              } else {
                                var20 = ((ia) this).field_lb[var15];
                                break L89;
                              }
                            }
                          }
                          L90: {
                            if (var19 != -1) {
                              break L90;
                            } else {
                              if (var21 >= 0) {
                                break L90;
                              } else {
                                var21 = ((ia) this).field_x[var15];
                                break L90;
                              }
                            }
                          }
                          L91: {
                            if (var19 != -1) {
                              ((ia) this).field_s[var15] = var19;
                              if (var18 >= 96) {
                                var19 = ((ia) this).field_I.field_p[var19][95];
                                break L91;
                              } else {
                                var19 = ((ia) this).field_I.field_p[var19][var18];
                                break L91;
                              }
                            } else {
                              var19 = ((ia) this).field_F[var15];
                              break L91;
                            }
                          }
                          L92: {
                            if (var20 >= 0) {
                              break L92;
                            } else {
                              var20 = ((ia) this).field_I.field_G[var19];
                              break L92;
                            }
                          }
                          L93: {
                            if (var21 >= 0) {
                              break L93;
                            } else {
                              var21 = ((ia) this).field_I.field_n[var19];
                              break L93;
                            }
                          }
                          L94: {
                            var25 = 7680 - (var18 + ((ia) this).field_I.field_b[var19]) * 64 - ((ia) this).field_I.field_l[var19] / 2;
                            if (var25 >= 0) {
                              if (var25 <= 7999) {
                                break L94;
                              } else {
                                var25 = 7999;
                                break L94;
                              }
                            } else {
                              var25 = 0;
                              break L94;
                            }
                          }
                          L95: {
                            ((ia) this).field_z[var15] = var25;
                            var26 = field_nb[var25];
                            ((ia) this).field_F[var15] = var19;
                            ((ia) this).field_lb[var15] = var20;
                            ((ia) this).field_x[var15] = var21;
                            ((ia) this).field_T[var15] = var25;
                            var1 = 0;
                            if (var22 != 9) {
                              break L95;
                            } else {
                              if (var23 * 256 <= ((ia) this).field_I.field_B[var19]) {
                                var1 = var23 * 256;
                                break L95;
                              } else {
                                var1 = ((ia) this).field_I.field_B[var19];
                                break L95;
                              }
                            }
                          }
                          this.a(var15, var19, var1, var26, var20, var21);
                          ((ia) this).field_B[var15] = 0;
                          break L87;
                        }
                      }
                    }
                  }
                  if (var18 <= 96) {
                    L96: {
                      if (var20 >= 0) {
                        break L96;
                      } else {
                        if (var21 < 0) {
                          break L87;
                        } else {
                          break L96;
                        }
                      }
                    }
                    L97: {
                      if (var20 < 0) {
                        break L97;
                      } else {
                        ((ia) this).field_lb[var15] = var20;
                        break L97;
                      }
                    }
                    if (var21 < 0) {
                      break L87;
                    } else {
                      ((ia) this).field_x[var15] = var21;
                      break L87;
                    }
                  } else {
                    if (((ia) this).field_p[var15] != 1) {
                      this.d(var15);
                      break L87;
                    } else {
                      ((ia) this).field_hb[var15] = 0;
                      break L87;
                    }
                  }
                }
                L98: {
                  if (var22 != 3) {
                    if (var22 == 5) {
                      break L98;
                    } else {
                      ((ia) this).field_jb[var15] = 0;
                      break L98;
                    }
                  } else {
                    L99: {
                      ((ia) this).field_jb[var15] = 1;
                      if (var18 < 0) {
                        break L99;
                      } else {
                        if (var18 > 96) {
                          break L99;
                        } else {
                          L100: {
                            var19 = ((ia) this).field_F[var15];
                            var25 = 7680 - (var18 + ((ia) this).field_I.field_b[var19]) * 64 - ((ia) this).field_I.field_l[var19] / 2;
                            if (var25 >= 0) {
                              if (var25 <= 7999) {
                                break L100;
                              } else {
                                var25 = 7999;
                                break L100;
                              }
                            } else {
                              var25 = 0;
                              break L100;
                            }
                          }
                          ((ia) this).field_z[var15] = var25;
                          break L99;
                        }
                      }
                    }
                    if (var23 == 0) {
                      break L98;
                    } else {
                      ((ia) this).field_v[var15] = var23;
                      if (((ia) this).field_I.field_N != 0) {
                        break L98;
                      } else {
                        ((ia) this).field_v[var15] = ((ia) this).field_v[var15] * 2;
                        break L98;
                      }
                    }
                  }
                }
                L101: {
                  if (var22 != 4) {
                    if (var22 == 6) {
                      break L101;
                    } else {
                      L102: {
                        if (((ia) this).field_D[var15] == 0) {
                          break L102;
                        } else {
                          var25 = field_nb[((ia) this).field_T[var15]];
                          this.b(var15, var25);
                          break L102;
                        }
                      }
                      ((ia) this).field_B[var15] = 0;
                      ((ia) this).field_D[var15] = 0;
                      break L101;
                    }
                  } else {
                    L103: {
                      ((ia) this).field_D[var15] = 1;
                      if (var23 / 16 <= 0) {
                        break L103;
                      } else {
                        ((ia) this).field_gb[var15] = var23 / 16;
                        break L103;
                      }
                    }
                    if ((var23 & 15) <= 0) {
                      break L101;
                    } else {
                      ((ia) this).field_Y[var15] = var23 & 15;
                      break L101;
                    }
                  }
                }
                L104: {
                  if (var22 != 17) {
                    ((ia) this).field_Q[var15] = 0;
                    break L104;
                  } else {
                    ((ia) this).field_Q[var15] = 1;
                    if (var23 == 0) {
                      break L104;
                    } else {
                      ((ia) this).field_y[var15] = (var23 & 240) / 16 - (var23 & 15);
                      break L104;
                    }
                  }
                }
                L105: {
                  L106: {
                    if (var22 == 10) {
                      break L106;
                    } else {
                      if (var22 == 6) {
                        break L106;
                      } else {
                        if (var22 != 5) {
                          if (((ia) this).field_q[var15] != 2) {
                            ((ia) this).field_q[var15] = 0;
                            break L105;
                          } else {
                            ((ia) this).field_q[var15] = 1;
                            break L105;
                          }
                        } else {
                          break L106;
                        }
                      }
                    }
                  }
                  ((ia) this).field_q[var15] = 1;
                  if (var23 == 0) {
                    break L105;
                  } else {
                    ((ia) this).field_sb[var15] = (var23 & 240) / 16 - (var23 & 15);
                    break L105;
                  }
                }
                L107: {
                  if (var22 != 25) {
                    if (((ia) this).field_J[var15] != 2) {
                      ((ia) this).field_J[var15] = 0;
                      break L107;
                    } else {
                      ((ia) this).field_J[var15] = 1;
                      break L107;
                    }
                  } else {
                    ((ia) this).field_J[var15] = 1;
                    if (var23 == 0) {
                      break L107;
                    } else {
                      ((ia) this).field_eb[var15] = (var23 & 240) / 16 - (var23 & 15);
                      break L107;
                    }
                  }
                }
                L108: {
                  if (var22 != 234) {
                    break L108;
                  } else {
                    L109: {
                      if (var23 != 0) {
                        ((ia) this).field_mb[var15] = var23;
                        break L109;
                      } else {
                        var23 = ((ia) this).field_mb[var15];
                        break L109;
                      }
                    }
                    ((ia) this).field_lb[var15] = ((ia) this).field_lb[var15] + var23;
                    if (((ia) this).field_lb[var15] >= 0) {
                      if (((ia) this).field_lb[var15] <= 64) {
                        break L108;
                      } else {
                        ((ia) this).field_lb[var15] = 64;
                        break L108;
                      }
                    } else {
                      ((ia) this).field_lb[var15] = 0;
                      break L108;
                    }
                  }
                }
                L110: {
                  if (var22 != 235) {
                    break L110;
                  } else {
                    L111: {
                      if (var23 != 0) {
                        ((ia) this).field_db[var15] = var23;
                        break L111;
                      } else {
                        var23 = ((ia) this).field_db[var15];
                        break L111;
                      }
                    }
                    ((ia) this).field_lb[var15] = ((ia) this).field_lb[var15] - var23;
                    if (((ia) this).field_lb[var15] >= 0) {
                      if (((ia) this).field_lb[var15] <= 64) {
                        break L110;
                      } else {
                        ((ia) this).field_lb[var15] = 64;
                        break L110;
                      }
                    } else {
                      ((ia) this).field_lb[var15] = 0;
                      break L110;
                    }
                  }
                }
                L112: {
                  if (var22 != 1) {
                    ((ia) this).field_E[var15] = 0;
                    break L112;
                  } else {
                    if (var23 == 0) {
                      break L112;
                    } else {
                      ((ia) this).field_E[var15] = var23;
                      break L112;
                    }
                  }
                }
                L113: {
                  if (var22 != 2) {
                    ((ia) this).field_ob[var15] = 0;
                    break L113;
                  } else {
                    if (var23 == 0) {
                      break L113;
                    } else {
                      ((ia) this).field_ob[var15] = var23;
                      break L113;
                    }
                  }
                }
                L114: {
                  if (var22 != 225) {
                    break L114;
                  } else {
                    L115: {
                      if (var23 != 0) {
                        ((ia) this).field_cb[var15] = var23;
                        break L115;
                      } else {
                        var23 = ((ia) this).field_cb[var15];
                        break L115;
                      }
                    }
                    L116: {
                      ((ia) this).field_T[var15] = ((ia) this).field_T[var15] - var23 * 4;
                      if (((ia) this).field_T[var15] >= 0) {
                        if (((ia) this).field_T[var15] <= 7999) {
                          break L116;
                        } else {
                          ((ia) this).field_T[var15] = 7999;
                          break L116;
                        }
                      } else {
                        ((ia) this).field_T[var15] = 0;
                        break L116;
                      }
                    }
                    var25 = field_nb[((ia) this).field_T[var15]];
                    this.b(var15, var25);
                    break L114;
                  }
                }
                L117: {
                  if (var22 != 226) {
                    break L117;
                  } else {
                    L118: {
                      if (var23 != 0) {
                        ((ia) this).field_r[var15] = var23;
                        break L118;
                      } else {
                        var23 = ((ia) this).field_r[var15];
                        break L118;
                      }
                    }
                    L119: {
                      ((ia) this).field_T[var15] = ((ia) this).field_T[var15] + var23 * 4;
                      if (((ia) this).field_T[var15] >= 0) {
                        if (((ia) this).field_T[var15] <= 7999) {
                          break L119;
                        } else {
                          ((ia) this).field_T[var15] = 7999;
                          break L119;
                        }
                      } else {
                        ((ia) this).field_T[var15] = 0;
                        break L119;
                      }
                    }
                    var25 = field_nb[((ia) this).field_T[var15]];
                    this.b(var15, var25);
                    break L117;
                  }
                }
                if (var22 != 33) {
                  break L55;
                } else {
                  if (var23 / 16 != 1) {
                    L120: {
                      var23 = var23 & 15;
                      if (var23 != 0) {
                        ((ia) this).field_tb[var15] = var23;
                        break L120;
                      } else {
                        var23 = ((ia) this).field_tb[var15];
                        break L120;
                      }
                    }
                    L121: {
                      ((ia) this).field_T[var15] = ((ia) this).field_T[var15] + var23;
                      if (((ia) this).field_T[var15] >= 0) {
                        if (((ia) this).field_T[var15] <= 7999) {
                          break L121;
                        } else {
                          ((ia) this).field_T[var15] = 7999;
                          break L121;
                        }
                      } else {
                        ((ia) this).field_T[var15] = 0;
                        break L121;
                      }
                    }
                    var25 = field_nb[((ia) this).field_T[var15]];
                    this.b(var15, var25);
                    break L55;
                  } else {
                    L122: {
                      var23 = var23 & 15;
                      if (var23 != 0) {
                        ((ia) this).field_S[var15] = var23;
                        break L122;
                      } else {
                        var23 = ((ia) this).field_S[var15];
                        break L122;
                      }
                    }
                    L123: {
                      ((ia) this).field_T[var15] = ((ia) this).field_T[var15] - var23;
                      if (((ia) this).field_T[var15] >= 0) {
                        if (((ia) this).field_T[var15] <= 7999) {
                          break L123;
                        } else {
                          ((ia) this).field_T[var15] = 7999;
                          break L123;
                        }
                      } else {
                        ((ia) this).field_T[var15] = 0;
                        break L123;
                      }
                    }
                    var25 = field_nb[((ia) this).field_T[var15]];
                    this.b(var15, var25);
                    break L55;
                  }
                }
              }
            }
            var15++;
            continue L24;
          }
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        ei var7 = null;
        Object var8 = null;
        Throwable var9 = null;
        ud stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        ud stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        ud stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        ei stackIn_15_0 = null;
        ei stackIn_16_0 = null;
        ei stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        ei stackIn_18_0 = null;
        ei stackIn_19_0 = null;
        ei stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        Throwable decompiledCaughtException = null;
        ud stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        ud stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        ud stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        ei stackOut_14_0 = null;
        ei stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        ei stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        ei stackOut_17_0 = null;
        ei stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        ei stackOut_18_0 = null;
        int stackOut_18_1 = 0;
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
                stackOut_11_0 = ((ia) this).field_I.field_g[param1];
                stackOut_11_1 = param3 * 256 / en.field_o;
                stackIn_13_0 = stackOut_11_0;
                stackIn_13_1 = stackOut_11_1;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                if (param2 == 0) {
                  stackOut_13_0 = (ud) (Object) stackIn_13_0;
                  stackOut_13_1 = stackIn_13_1;
                  stackOut_13_2 = param4 * ((ia) this).field_W * ((ia) this).field_A >> 12;
                  stackIn_14_0 = stackOut_13_0;
                  stackIn_14_1 = stackOut_13_1;
                  stackIn_14_2 = stackOut_13_2;
                  break L3;
                } else {
                  stackOut_12_0 = (ud) (Object) stackIn_12_0;
                  stackOut_12_1 = stackIn_12_1;
                  stackOut_12_2 = 0;
                  stackIn_14_0 = stackOut_12_0;
                  stackIn_14_1 = stackOut_12_1;
                  stackIn_14_2 = stackOut_12_2;
                  break L3;
                }
              }
              L4: {
                var7 = ei.b(stackIn_14_0, stackIn_14_1, stackIn_14_2, param5);
                var7.f(((ia) this).field_I.field_w[param1], ((ia) this).field_I.field_f[param1]);
                stackOut_14_0 = (ei) var7;
                stackIn_16_0 = stackOut_14_0;
                stackIn_15_0 = stackOut_14_0;
                if (((ia) this).field_I.field_M[param1] == 0) {
                  stackOut_16_0 = (ei) (Object) stackIn_16_0;
                  stackOut_16_1 = 0;
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  break L4;
                } else {
                  stackOut_15_0 = (ei) (Object) stackIn_15_0;
                  stackOut_15_1 = -1;
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_17_1 = stackOut_15_1;
                  break L4;
                }
              }
              L5: {
                ((ei) (Object) stackIn_17_0).f(stackIn_17_1);
                stackOut_17_0 = (ei) var7;
                stackIn_19_0 = stackOut_17_0;
                stackIn_18_0 = stackOut_17_0;
                if (((ia) this).field_I.field_M[param1] != 2) {
                  stackOut_19_0 = (ei) (Object) stackIn_19_0;
                  stackOut_19_1 = 0;
                  stackIn_20_0 = stackOut_19_0;
                  stackIn_20_1 = stackOut_19_1;
                  break L5;
                } else {
                  stackOut_18_0 = (ei) (Object) stackIn_18_0;
                  stackOut_18_1 = 1;
                  stackIn_20_0 = stackOut_18_0;
                  stackIn_20_1 = stackOut_18_1;
                  break L5;
                }
              }
              L6: {
                ((ei) (Object) stackIn_20_0).a(stackIn_20_1 != 0);
                if (param2 == 0) {
                  break L6;
                } else {
                  var7.e(param2);
                  var7.a(en.field_o >> 7, param4 * ((ia) this).field_W * ((ia) this).field_A >> 12, param5);
                  break L6;
                }
              }
              L7: {
                ((ia) this).field_fb[param0] = var7;
                if (((ia) this).field_n == null) {
                  break L7;
                } else {
                  var8 = (Object) (Object) ((ia) this).field_n;
                  synchronized (var8) {
                    L8: {
                      ((ia) this).field_n.a((ol) (Object) var7);
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
        int var2 = this.c() ? 1 : 0;
        if (var2 != 0) {
            if (!((ia) this).field_w) {
                return -1;
            }
        }
        int var3 = en.field_o;
        int var4 = (var3 << 9) + (var3 << 7);
        return var4 / (((ia) this).field_L * ((ia) this).field_U);
    }

    private final void b(int param0, int param1) {
        if (((ia) this).field_fb[param0] != null) {
            ((ia) this).field_fb[param0].d(param1 * 256 / en.field_o);
        }
    }

    final synchronized void c(int param0) {
        ((ia) this).field_U = param0;
    }

    ia(ui param0) {
        ((ia) this).field_u = 0;
        ((ia) this).field_rb = -1;
        ((ia) this).field_pb = 0;
        ((ia) this).field_U = 256;
        ((ia) this).field_V = null;
        ((ia) this).field_ib = 0;
        ((ia) this).field_R = 0;
        ((ia) this).field_N = -1;
        ((ia) this).field_Z = 0;
        ((ia) this).field_w = true;
        ((ia) this).field_A = 64;
        ((ia) this).field_qb = 0;
        ((ia) this).field_M = -1;
        ((ia) this).field_I = param0;
        this.e();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
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
