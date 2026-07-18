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
        L0: {
          if (((d) this).field_B[param0] == null) {
            break L0;
          } else {
            ((d) this).field_B[param0].f(param1 * 256 / ba.field_m);
            break L0;
          }
        }
    }

    public static void e() {
        field_P = null;
        field_K = null;
    }

    final synchronized void d(int param0) {
        ((d) this).field_A = param0;
    }

    private final void a(int param0) {
        L0: {
          if (((d) this).field_B[param0] == null) {
            break L0;
          } else {
            ((d) this).field_B[param0].g(ba.field_m >> 7);
            ((d) this).field_B[param0] = null;
            break L0;
          }
        }
    }

    private final void f() {
        int var1 = 0;
        ((d) this).field_ob = 0;
        ((d) this).field_S = 0;
        ((d) this).field_s = 0;
        ((d) this).field_lb = 0;
        ((d) this).field_fb = 0;
        ((d) this).field_T = 0;
        ((d) this).field_Z = ((d) this).field_y.field_a;
        ((d) this).field_db = ((d) this).field_y.field_w;
        ((d) this).field_O = 64;
        var1 = 0;
        L0: while (true) {
          if (var1 >= ((d) this).field_y.field_r) {
            ((d) this).field_p = 0;
            ((d) this).field_H = null;
            ((d) this).field_gb = -1;
            ((d) this).field_eb = -1;
            ((d) this).field_V = 0;
            ((d) this).field_D = 0;
            ((d) this).field_m = -1;
            ((d) this).field_pb = 0;
            var1 = 0;
            L1: while (true) {
              if (var1 >= ((d) this).field_y.field_r) {
                ((d) this).field_S = 1;
                return;
              } else {
                ((d) this).field_B[var1] = null;
                ((d) this).field_Q[var1] = false;
                var1++;
                continue L1;
              }
            }
          } else {
            ((d) this).field_ib[var1] = 0;
            ((d) this).field_Y[var1] = 0;
            ((d) this).field_U[var1] = 0;
            ((d) this).field_N[var1] = 0;
            ((d) this).field_F[var1] = 0;
            ((d) this).field_J[var1] = 0;
            ((d) this).field_C[var1] = 0;
            ((d) this).field_W[var1] = 0;
            ((d) this).field_cb[var1] = 0;
            ((d) this).field_hb[var1] = 0;
            ((d) this).field_I[var1] = 0;
            ((d) this).field_M[var1] = 0;
            ((d) this).field_x[var1] = 0;
            ((d) this).field_L[var1] = 0;
            ((d) this).field_qb[var1] = 0;
            ((d) this).field_u[var1] = 0;
            ((d) this).field_n[var1] = -1;
            ((d) this).field_o[var1] = 0;
            ((d) this).field_R[var1] = 0;
            ((d) this).field_bb[var1] = 0;
            ((d) this).field_nb[var1] = 0;
            ((d) this).field_jb[var1] = 0;
            ((d) this).field_t[var1] = 0;
            ((d) this).field_r[var1] = 0;
            ((d) this).field_X[var1] = 0;
            ((d) this).field_w[var1] = 0;
            ((d) this).field_v[var1] = 0;
            ((d) this).field_q[var1] = 0;
            ((d) this).field_kb[var1] = 128;
            ((d) this).field_mb[var1] = 0;
            ((d) this).field_E[var1] = -1;
            var1++;
            continue L0;
          }
        }
    }

    final void a() {
        int var1 = 0;
        var1 = 0;
        L0: while (true) {
          if (var1 >= ((d) this).field_y.field_r) {
            return;
          } else {
            L1: {
              if (((d) this).field_B[var1] == null) {
                break L1;
              } else {
                ((d) this).field_k.b((kd) (Object) ((d) this).field_B[var1]);
                break L1;
              }
            }
            var1++;
            continue L0;
          }
        }
    }

    final int a(hl param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var2 = this.d() ? 1 : 0;
          if (var2 == 0) {
            break L0;
          } else {
            if (((d) this).field_ab) {
              break L0;
            } else {
              return -1;
            }
          }
        }
        var3 = ba.field_m;
        var4 = (var3 << 9) + (var3 << 7);
        return var4 / (((d) this).field_db * ((d) this).field_z);
    }

    private final void a(int param0, int param1, int param2) {
        L0: {
          if (((d) this).field_B[param0] == null) {
            break L0;
          } else {
            L1: {
              if (param1 >= 0) {
                if (param1 <= 64) {
                  break L1;
                } else {
                  param1 = 64;
                  break L1;
                }
              } else {
                param1 = 0;
                break L1;
              }
            }
            L2: {
              if (param2 >= 0) {
                if (param2 <= 256) {
                  break L2;
                } else {
                  param2 = 256;
                  break L2;
                }
              } else {
                param2 = 0;
                break L2;
              }
            }
            ((d) this).field_B[param0].b(ba.field_m >> 7, param1 * ((d) this).field_O * ((d) this).field_A >> 12, param2);
            break L0;
          }
        }
    }

    private final void g() {
        ((d) this).field_q = new int[((d) this).field_y.field_r];
        ((d) this).field_kb = new int[((d) this).field_y.field_r];
        ((d) this).field_mb = new int[((d) this).field_y.field_r];
        ((d) this).field_v = new int[((d) this).field_y.field_r];
        ((d) this).field_E = new int[((d) this).field_y.field_r];
        ((d) this).field_G = new int[((d) this).field_y.field_r];
        ((d) this).field_ib = new int[((d) this).field_y.field_r];
        ((d) this).field_Y = new int[((d) this).field_y.field_r];
        ((d) this).field_U = new int[((d) this).field_y.field_r];
        ((d) this).field_N = new int[((d) this).field_y.field_r];
        ((d) this).field_F = new int[((d) this).field_y.field_r];
        ((d) this).field_J = new int[((d) this).field_y.field_r];
        ((d) this).field_C = new int[((d) this).field_y.field_r];
        ((d) this).field_W = new int[((d) this).field_y.field_r];
        ((d) this).field_cb = new int[((d) this).field_y.field_r];
        ((d) this).field_hb = new int[((d) this).field_y.field_r];
        ((d) this).field_I = new int[((d) this).field_y.field_r];
        ((d) this).field_M = new int[((d) this).field_y.field_r];
        ((d) this).field_x = new int[((d) this).field_y.field_r];
        ((d) this).field_L = new int[((d) this).field_y.field_r];
        ((d) this).field_qb = new int[((d) this).field_y.field_r];
        ((d) this).field_u = new int[((d) this).field_y.field_r];
        ((d) this).field_n = new int[((d) this).field_y.field_r];
        ((d) this).field_o = new int[((d) this).field_y.field_r];
        ((d) this).field_R = new int[((d) this).field_y.field_r];
        ((d) this).field_bb = new int[((d) this).field_y.field_r];
        ((d) this).field_nb = new int[((d) this).field_y.field_r];
        ((d) this).field_jb = new int[((d) this).field_y.field_r];
        ((d) this).field_t = new int[((d) this).field_y.field_r];
        ((d) this).field_X = new int[((d) this).field_y.field_r];
        ((d) this).field_w = new int[((d) this).field_y.field_r];
        ((d) this).field_r = new int[((d) this).field_y.field_r];
        ((d) this).field_Q = new boolean[((d) this).field_y.field_r];
        ((d) this).field_B = new gd[((d) this).field_y.field_r];
        this.f();
    }

    private final boolean d() {
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
          if (((d) this).field_S == 1) {
            break L0;
          } else {
            if (((d) this).field_S == 2) {
              break L0;
            } else {
              ((d) this).field_ob = 0;
              return false;
            }
          }
        }
        L1: {
          var14 = 0;
          if (((d) this).field_ob != 0) {
            break L1;
          } else {
            L2: {
              if (((d) this).field_S != 1) {
                break L2;
              } else {
                ((d) this).field_S = 2;
                ((d) this).field_fb = 0;
                ((d) this).field_lb = 0;
                ((d) this).field_T = ((d) this).field_y.field_f[((d) this).field_fb];
                ((d) this).field_s = 0;
                break L2;
              }
            }
            L3: {
              L4: {
                if (((d) this).field_lb >= ((d) this).field_y.field_l[((d) this).field_T]) {
                  break L4;
                } else {
                  if (((d) this).field_pb == 1) {
                    break L4;
                  } else {
                    L5: {
                      if (((d) this).field_V == 0) {
                        break L5;
                      } else {
                        if (((d) this).field_lb % ((d) this).field_V == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    if (((d) this).field_p <= 0) {
                      break L3;
                    } else {
                      if (((d) this).field_lb % ((d) this).field_p != 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
              }
              L6: {
                if (((d) this).field_V == 0) {
                  ((d) this).field_fb = ((d) this).field_fb + 1;
                  break L6;
                } else {
                  L7: {
                    if (((d) this).field_D > ((d) this).field_fb) {
                      break L7;
                    } else {
                      var14 = 1;
                      break L7;
                    }
                  }
                  ((d) this).field_fb = ((d) this).field_D;
                  break L6;
                }
              }
              L8: {
                if (((d) this).field_m == -1) {
                  break L8;
                } else {
                  ((d) this).field_fb = ((d) this).field_m;
                  ((d) this).field_m = -1;
                  break L8;
                }
              }
              L9: {
                if (((d) this).field_fb < ((d) this).field_y.field_d) {
                  break L9;
                } else {
                  ((d) this).field_fb = 0;
                  var14 = 1;
                  break L9;
                }
              }
              L10: {
                ((d) this).field_lb = 0;
                if (((d) this).field_pb != 1) {
                  break L10;
                } else {
                  L11: {
                    ((d) this).field_D = ((d) this).field_D / 16 * 10 + ((d) this).field_D % 16;
                    if (((d) this).field_D < ((d) this).field_y.field_l[((d) this).field_T]) {
                      break L11;
                    } else {
                      ((d) this).field_D = 0;
                      break L11;
                    }
                  }
                  ((d) this).field_lb = ((d) this).field_D;
                  break L10;
                }
              }
              L12: {
                if (((d) this).field_gb < 0) {
                  break L12;
                } else {
                  L13: {
                    if (((d) this).field_p >= 0) {
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
                    var15 = ((d) this).field_gb;
                    var16 = ((d) this).field_eb;
                    if (((d) this).field_H == null) {
                      break L14;
                    } else {
                      var17 = 0;
                      L15: while (true) {
                        if (var17 >= ((d) this).field_y.field_r) {
                          ((d) this).field_y = ((d) this).field_H;
                          this.g();
                          ((d) this).field_S = 2;
                          break L14;
                        } else {
                          this.a(var17);
                          var17++;
                          continue L15;
                        }
                      }
                    }
                  }
                  ((d) this).field_fb = var15;
                  ((d) this).field_lb = var16;
                  var14 = 0;
                  ((d) this).field_p = 0;
                  ((d) this).field_gb = -1;
                  ((d) this).field_eb = -1;
                  ((d) this).field_H = null;
                  break L12;
                }
              }
              ((d) this).field_T = ((d) this).field_y.field_f[((d) this).field_fb];
              ((d) this).field_s = 0;
              var10 = 0;
              L16: while (true) {
                if (var10 >= ((d) this).field_lb) {
                  ((d) this).field_m = -1;
                  ((d) this).field_pb = 0;
                  ((d) this).field_V = 0;
                  break L3;
                } else {
                  var15 = 0;
                  L17: while (true) {
                    if (var15 >= ((d) this).field_y.field_r) {
                      var10++;
                      continue L16;
                    } else {
                      L18: {
                        var16 = ((d) this).field_y.field_y[((d) this).field_T][((d) this).field_s] & 255;
                        ((d) this).field_s = ((d) this).field_s + 1;
                        if (var16 >= 128) {
                          var16 -= 128;
                          break L18;
                        } else {
                          ((d) this).field_s = ((d) this).field_s - 1;
                          var16 = 31;
                          break L18;
                        }
                      }
                      L19: {
                        if ((var16 & 1) != 1) {
                          break L19;
                        } else {
                          ((d) this).field_s = ((d) this).field_s + 1;
                          break L19;
                        }
                      }
                      L20: {
                        if ((var16 & 2) != 2) {
                          break L20;
                        } else {
                          ((d) this).field_s = ((d) this).field_s + 1;
                          break L20;
                        }
                      }
                      L21: {
                        if ((var16 & 4) != 4) {
                          break L21;
                        } else {
                          ((d) this).field_s = ((d) this).field_s + 1;
                          break L21;
                        }
                      }
                      L22: {
                        if ((var16 & 8) != 8) {
                          break L22;
                        } else {
                          ((d) this).field_s = ((d) this).field_s + 1;
                          break L22;
                        }
                      }
                      L23: {
                        if ((var16 & 16) != 16) {
                          break L23;
                        } else {
                          ((d) this).field_s = ((d) this).field_s + 1;
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
            ((d) this).field_lb = ((d) this).field_lb + 1;
            break L1;
          }
        }
        var15 = 0;
        L24: while (true) {
          if (var15 >= ((d) this).field_y.field_r) {
            L25: {
              if (((d) this).field_ob <= 0) {
                break L25;
              } else {
                var15 = 0;
                L26: while (true) {
                  if (var15 >= ((d) this).field_y.field_r) {
                    break L25;
                  } else {
                    L27: {
                      if (((d) this).field_Q[var15]) {
                        break L27;
                      } else {
                        L28: {
                          if (((d) this).field_r[var15] == 0) {
                            break L28;
                          } else {
                            ((d) this).field_O = ((d) this).field_O + ((d) this).field_G[var15];
                            if (((d) this).field_O >= 0) {
                              if (((d) this).field_O <= 64) {
                                break L28;
                              } else {
                                ((d) this).field_O = 64;
                                break L28;
                              }
                            } else {
                              ((d) this).field_O = 0;
                              break L28;
                            }
                          }
                        }
                        L29: {
                          L30: {
                            if (((d) this).field_X[var15] != 0) {
                              break L30;
                            } else {
                              if (((d) this).field_w[var15] == 0) {
                                break L29;
                              } else {
                                break L30;
                              }
                            }
                          }
                          L31: {
                            ((d) this).field_q[var15] = ((d) this).field_q[var15] + ((d) this).field_ib[var15];
                            if (((d) this).field_q[var15] >= 0) {
                              if (((d) this).field_q[var15] <= 64) {
                                break L31;
                              } else {
                                ((d) this).field_q[var15] = 64;
                                break L31;
                              }
                            } else {
                              ((d) this).field_q[var15] = 0;
                              break L31;
                            }
                          }
                          ((d) this).field_kb[var15] = ((d) this).field_kb[var15] + ((d) this).field_Y[var15];
                          if (((d) this).field_kb[var15] >= 0) {
                            if (((d) this).field_kb[var15] <= 255) {
                              break L29;
                            } else {
                              ((d) this).field_kb[var15] = 255;
                              break L29;
                            }
                          } else {
                            ((d) this).field_kb[var15] = 0;
                            break L29;
                          }
                        }
                        L32: {
                          if (((d) this).field_J[var15] != 1) {
                            break L32;
                          } else {
                            ((d) this).field_F[var15] = (((d) this).field_F[var15] + ((d) this).field_U[var15]) % 68;
                            var2 = field_K[((d) this).field_F[var15]] * ((d) this).field_N[var15] >> 8;
                            var16 = ((d) this).field_mb[var15] + var2;
                            this.a(var15, field_P[var16]);
                            break L32;
                          }
                        }
                        L33: {
                          if (((d) this).field_x[var15] <= 0) {
                            break L33;
                          } else {
                            L34: {
                              ((d) this).field_mb[var15] = ((d) this).field_mb[var15] - ((d) this).field_x[var15] * 4;
                              if (((d) this).field_mb[var15] >= 0) {
                                if (((d) this).field_mb[var15] <= 7999) {
                                  break L34;
                                } else {
                                  ((d) this).field_mb[var15] = 7999;
                                  break L34;
                                }
                              } else {
                                ((d) this).field_mb[var15] = 0;
                                break L34;
                              }
                            }
                            var16 = field_P[((d) this).field_mb[var15]];
                            this.a(var15, var16);
                            break L33;
                          }
                        }
                        L35: {
                          if (((d) this).field_L[var15] <= 0) {
                            break L35;
                          } else {
                            L36: {
                              ((d) this).field_mb[var15] = ((d) this).field_mb[var15] + ((d) this).field_L[var15] * 4;
                              if (((d) this).field_mb[var15] >= 0) {
                                if (((d) this).field_mb[var15] <= 7999) {
                                  break L36;
                                } else {
                                  ((d) this).field_mb[var15] = 7999;
                                  break L36;
                                }
                              } else {
                                ((d) this).field_mb[var15] = 0;
                                break L36;
                              }
                            }
                            var16 = field_P[((d) this).field_mb[var15]];
                            this.a(var15, var16);
                            break L35;
                          }
                        }
                        if (((d) this).field_t[var15] <= 0) {
                          break L27;
                        } else {
                          L37: {
                            if (((d) this).field_mb[var15] >= ((d) this).field_qb[var15]) {
                              break L37;
                            } else {
                              ((d) this).field_mb[var15] = ((d) this).field_mb[var15] + ((d) this).field_u[var15] * 4;
                              if (((d) this).field_mb[var15] <= ((d) this).field_qb[var15]) {
                                break L37;
                              } else {
                                ((d) this).field_mb[var15] = ((d) this).field_qb[var15];
                                break L37;
                              }
                            }
                          }
                          L38: {
                            if (((d) this).field_mb[var15] <= ((d) this).field_qb[var15]) {
                              break L38;
                            } else {
                              ((d) this).field_mb[var15] = ((d) this).field_mb[var15] - ((d) this).field_u[var15] * 4;
                              if (((d) this).field_mb[var15] >= ((d) this).field_qb[var15]) {
                                break L38;
                              } else {
                                ((d) this).field_mb[var15] = ((d) this).field_qb[var15];
                                break L38;
                              }
                            }
                          }
                          L39: {
                            if (((d) this).field_mb[var15] >= 0) {
                              if (((d) this).field_mb[var15] <= 7999) {
                                break L39;
                              } else {
                                ((d) this).field_mb[var15] = 7999;
                                break L39;
                              }
                            } else {
                              ((d) this).field_mb[var15] = 0;
                              break L39;
                            }
                          }
                          var16 = field_P[((d) this).field_mb[var15]];
                          this.a(var15, var16);
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
              if (var15 >= ((d) this).field_y.field_r) {
                L41: {
                  ((d) this).field_ob = ((d) this).field_ob + 1;
                  if (((d) this).field_ob < ((d) this).field_Z) {
                    break L41;
                  } else {
                    ((d) this).field_ob = 0;
                    break L41;
                  }
                }
                return var14 != 0;
              } else {
                L42: {
                  if (((d) this).field_Q[var15]) {
                    break L42;
                  } else {
                    L43: {
                      var16 = ((d) this).field_q[var15];
                      var17 = ((d) this).field_kb[var15];
                      ((d) this).field_bb[var15] = 0;
                      if (((d) this).field_E[var15] < 0) {
                        break L43;
                      } else {
                        L44: {
                          var3 = ((d) this).field_E[var15];
                          if ((((d) this).field_y.field_A[((d) this).field_E[var15]] & 1) != 1) {
                            break L44;
                          } else {
                            ((d) this).field_bb[var15] = 1;
                            var4 = ((d) this).field_o[var15];
                            var5 = 0;
                            L45: while (true) {
                              if (((d) this).field_y.field_L[var3][var5 + 1] >= var4) {
                                L46: {
                                  var6 = ((d) this).field_y.field_L[var3][var5];
                                  var8 = ((d) this).field_y.field_L[var3][var5 + 1];
                                  var7 = ((d) this).field_y.field_I[var3][var5];
                                  var9 = ((d) this).field_y.field_I[var3][var5 + 1];
                                  if (var8 != var6) {
                                    break L46;
                                  } else {
                                    var8++;
                                    break L46;
                                  }
                                }
                                L47: {
                                  var11 = ((var8 - var4) * var7 + (var4 - var6) * var9) / (var8 - var6);
                                  var12 = 32768 - ((d) this).field_jb[var15];
                                  if (var12 >= 0) {
                                    break L47;
                                  } else {
                                    var12 = 0;
                                    break L47;
                                  }
                                }
                                L48: {
                                  var16 = var16 * var11 * var12 >> 21;
                                  if ((((d) this).field_y.field_A[var3] & 2) != 2) {
                                    break L48;
                                  } else {
                                    if (((d) this).field_nb[var15] != 1) {
                                      break L48;
                                    } else {
                                      if (((d) this).field_o[var15] != ((d) this).field_y.field_L[var3][((d) this).field_y.field_D[var3]]) {
                                        break L48;
                                      } else {
                                        ((d) this).field_o[var15] = ((d) this).field_o[var15] - 1;
                                        break L48;
                                      }
                                    }
                                  }
                                }
                                L49: {
                                  if (((d) this).field_o[var15] != ((d) this).field_y.field_L[var3][((d) this).field_y.field_L[var3].length - 1]) {
                                    break L49;
                                  } else {
                                    ((d) this).field_o[var15] = ((d) this).field_o[var15] - 1;
                                    break L49;
                                  }
                                }
                                L50: {
                                  if (((d) this).field_nb[var15] != 0) {
                                    break L50;
                                  } else {
                                    ((d) this).field_jb[var15] = ((d) this).field_jb[var15] + ((d) this).field_y.field_b[var3];
                                    break L50;
                                  }
                                }
                                ((d) this).field_o[var15] = ((d) this).field_o[var15] + 1;
                                if ((((d) this).field_y.field_A[var3] & 4) != 4) {
                                  break L44;
                                } else {
                                  if (((d) this).field_o[var15] != ((d) this).field_y.field_L[var3][((d) this).field_y.field_q[var3]]) {
                                    break L44;
                                  } else {
                                    ((d) this).field_o[var15] = ((d) this).field_y.field_L[var3][((d) this).field_y.field_e[var3]];
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
                        if ((((d) this).field_y.field_F[((d) this).field_E[var15]] & 1) != 1) {
                          break L43;
                        } else {
                          var4 = ((d) this).field_R[var15];
                          var5 = 0;
                          L51: while (true) {
                            if (((d) this).field_y.field_x[var3][var5 + 1] >= var4) {
                              L52: {
                                var6 = ((d) this).field_y.field_x[var3][var5];
                                var8 = ((d) this).field_y.field_x[var3][var5 + 1];
                                var7 = ((d) this).field_y.field_g[var3][var5];
                                var9 = ((d) this).field_y.field_g[var3][var5 + 1];
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
                                if ((((d) this).field_y.field_F[var3] & 2) != 2) {
                                  break L53;
                                } else {
                                  if (((d) this).field_nb[var15] != 1) {
                                    break L53;
                                  } else {
                                    if (((d) this).field_R[var15] != ((d) this).field_y.field_x[var3][((d) this).field_y.field_B[var3]]) {
                                      break L53;
                                    } else {
                                      ((d) this).field_R[var15] = ((d) this).field_R[var15] - 1;
                                      break L53;
                                    }
                                  }
                                }
                              }
                              L54: {
                                if (((d) this).field_R[var15] != ((d) this).field_y.field_x[var3][((d) this).field_y.field_x[var3].length - 1]) {
                                  break L54;
                                } else {
                                  ((d) this).field_R[var15] = ((d) this).field_R[var15] - 1;
                                  break L54;
                                }
                              }
                              ((d) this).field_R[var15] = ((d) this).field_R[var15] + 1;
                              if ((((d) this).field_y.field_F[var3] & 4) != 4) {
                                break L43;
                              } else {
                                if (((d) this).field_R[var15] != ((d) this).field_y.field_x[var3][((d) this).field_y.field_H[var3]]) {
                                  break L43;
                                } else {
                                  ((d) this).field_R[var15] = ((d) this).field_y.field_x[var3][((d) this).field_y.field_E[var3]];
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
                if (((d) this).field_ob != 0) {
                  if (((d) this).field_n[var15] >= 0) {
                    var16 = ((d) this).field_n[var15];
                    break L56;
                  } else {
                    break L55;
                  }
                } else {
                  var16 = ((d) this).field_s;
                  break L56;
                }
              }
              L57: {
                ((d) this).field_n[var15] = -1;
                var17 = var16;
                var18 = -1;
                var19 = -1;
                var20 = -1;
                var21 = -1;
                var22 = -1;
                var23 = 0;
                var24 = ((d) this).field_y.field_y[((d) this).field_T][var16] & 255;
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
                  var18 = ((d) this).field_y.field_y[((d) this).field_T][var16] & 255;
                  var16++;
                  break L58;
                }
              }
              L59: {
                if ((var24 & 2) != 2) {
                  break L59;
                } else {
                  var19 = (((d) this).field_y.field_y[((d) this).field_T][var16] & 255) - 1;
                  var16++;
                  break L59;
                }
              }
              L60: {
                if ((var24 & 4) != 4) {
                  break L60;
                } else {
                  var20 = (((d) this).field_y.field_y[((d) this).field_T][var16] & 255) - 16;
                  var16++;
                  break L60;
                }
              }
              L61: {
                if ((var24 & 8) != 8) {
                  break L61;
                } else {
                  var22 = ((d) this).field_y.field_y[((d) this).field_T][var16] & 255;
                  var16++;
                  break L61;
                }
              }
              L62: {
                if ((var24 & 16) != 16) {
                  break L62;
                } else {
                  var23 = ((d) this).field_y.field_y[((d) this).field_T][var16] & 255;
                  var16++;
                  break L62;
                }
              }
              L63: {
                if (((d) this).field_ob != 0) {
                  break L63;
                } else {
                  ((d) this).field_s = var16;
                  break L63;
                }
              }
              if (((d) this).field_Q[var15]) {
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
                      if (((d) this).field_ob != var23) {
                        ((d) this).field_n[var15] = var17;
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
                    if (((d) this).field_ob >= var23) {
                      break L66;
                    } else {
                      ((d) this).field_n[var15] = var17;
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
                      ((d) this).field_X[var15] = 2;
                      ((d) this).field_ib[var15] = 80 - var20;
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
                      ((d) this).field_X[var15] = 2;
                      ((d) this).field_ib[var15] = var20 - 96;
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
                      var20 = ((d) this).field_q[var15] - (var20 - 112);
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
                      var20 = ((d) this).field_q[var15] + (var20 - 128);
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
                      ((d) this).field_w[var15] = 2;
                      ((d) this).field_Y[var15] = 192 - var20;
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
                      ((d) this).field_w[var15] = 2;
                      ((d) this).field_Y[var15] = var20 - 208;
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
                    if (((d) this).field_V > 1) {
                      ((d) this).field_V = 1;
                      break L75;
                    } else {
                      ((d) this).field_pb = 1;
                      ((d) this).field_D = var23;
                      break L75;
                    }
                  }
                }
                L76: {
                  if (var22 != 15) {
                    break L76;
                  } else {
                    if (var23 >= 32) {
                      ((d) this).field_db = var23;
                      break L76;
                    } else {
                      ((d) this).field_Z = var23;
                      break L76;
                    }
                  }
                }
                L77: {
                  if (var22 != 16) {
                    break L77;
                  } else {
                    ((d) this).field_O = var23;
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
                    if (((d) this).field_V > 1) {
                      break L80;
                    } else {
                      ((d) this).field_V = 1;
                      ((d) this).field_D = var23;
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
                      ((d) this).field_o[var15] = var23;
                      if (((d) this).field_o[var15] < ((d) this).field_y.field_L[var3][((d) this).field_y.field_L[var3].length - 1]) {
                        break L83;
                      } else {
                        ((d) this).field_o[var15] = ((d) this).field_y.field_L[var3][((d) this).field_y.field_L[var3].length - 1] - 1;
                        break L83;
                      }
                    }
                    ((d) this).field_R[var15] = var23;
                    if (((d) this).field_R[var15] < ((d) this).field_y.field_x[var3][((d) this).field_y.field_x[var3].length - 1]) {
                      break L82;
                    } else {
                      ((d) this).field_R[var15] = ((d) this).field_y.field_x[var3][((d) this).field_y.field_x[var3].length - 1] - 1;
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
                      ((d) this).field_o[var15] = 0;
                      ((d) this).field_R[var15] = 0;
                      ((d) this).field_nb[var15] = 1;
                      ((d) this).field_jb[var15] = 0;
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
                        var20 = ((d) this).field_y.field_J[((d) this).field_v[var15]];
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
                        var21 = ((d) this).field_y.field_h[((d) this).field_v[var15]];
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
                                var20 = ((d) this).field_q[var15];
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
                                var21 = ((d) this).field_kb[var15];
                                break L90;
                              }
                            }
                          }
                          L91: {
                            if (var19 != -1) {
                              ((d) this).field_E[var15] = var19;
                              if (var18 >= 96) {
                                var19 = ((d) this).field_y.field_C[var19][95];
                                break L91;
                              } else {
                                var19 = ((d) this).field_y.field_C[var19][var18];
                                break L91;
                              }
                            } else {
                              var19 = ((d) this).field_v[var15];
                              break L91;
                            }
                          }
                          L92: {
                            if (var20 >= 0) {
                              break L92;
                            } else {
                              var20 = ((d) this).field_y.field_J[var19];
                              break L92;
                            }
                          }
                          L93: {
                            if (var21 >= 0) {
                              break L93;
                            } else {
                              var21 = ((d) this).field_y.field_h[var19];
                              break L93;
                            }
                          }
                          L94: {
                            var25 = 7680 - (var18 + ((d) this).field_y.field_o[var19]) * 64 - ((d) this).field_y.field_n[var19] / 2;
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
                            ((d) this).field_qb[var15] = var25;
                            var26 = field_P[var25];
                            ((d) this).field_v[var15] = var19;
                            ((d) this).field_q[var15] = var20;
                            ((d) this).field_kb[var15] = var21;
                            ((d) this).field_mb[var15] = var25;
                            var1 = 0;
                            if (var22 != 9) {
                              break L95;
                            } else {
                              if (var23 * 256 <= ((d) this).field_y.field_m[var19]) {
                                var1 = var23 * 256;
                                break L95;
                              } else {
                                var1 = ((d) this).field_y.field_m[var19];
                                break L95;
                              }
                            }
                          }
                          this.a(var15, var19, var1, var26, var20, var21);
                          ((d) this).field_F[var15] = 0;
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
                        ((d) this).field_q[var15] = var20;
                        break L97;
                      }
                    }
                    if (var21 < 0) {
                      break L87;
                    } else {
                      ((d) this).field_kb[var15] = var21;
                      break L87;
                    }
                  } else {
                    if (((d) this).field_bb[var15] != 1) {
                      this.a(var15);
                      break L87;
                    } else {
                      ((d) this).field_nb[var15] = 0;
                      break L87;
                    }
                  }
                }
                L98: {
                  if (var22 != 3) {
                    if (var22 == 5) {
                      break L98;
                    } else {
                      ((d) this).field_t[var15] = 0;
                      break L98;
                    }
                  } else {
                    L99: {
                      ((d) this).field_t[var15] = 1;
                      if (var18 < 0) {
                        break L99;
                      } else {
                        if (var18 > 96) {
                          break L99;
                        } else {
                          L100: {
                            var19 = ((d) this).field_v[var15];
                            var25 = 7680 - (var18 + ((d) this).field_y.field_o[var19]) * 64 - ((d) this).field_y.field_n[var19] / 2;
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
                          ((d) this).field_qb[var15] = var25;
                          break L99;
                        }
                      }
                    }
                    if (var23 == 0) {
                      break L98;
                    } else {
                      ((d) this).field_u[var15] = var23;
                      if (((d) this).field_y.field_s != 0) {
                        break L98;
                      } else {
                        ((d) this).field_u[var15] = ((d) this).field_u[var15] * 2;
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
                        if (((d) this).field_J[var15] == 0) {
                          break L102;
                        } else {
                          var25 = field_P[((d) this).field_mb[var15]];
                          this.a(var15, var25);
                          break L102;
                        }
                      }
                      ((d) this).field_F[var15] = 0;
                      ((d) this).field_J[var15] = 0;
                      break L101;
                    }
                  } else {
                    L103: {
                      ((d) this).field_J[var15] = 1;
                      if (var23 / 16 <= 0) {
                        break L103;
                      } else {
                        ((d) this).field_U[var15] = var23 / 16;
                        break L103;
                      }
                    }
                    if ((var23 & 15) <= 0) {
                      break L101;
                    } else {
                      ((d) this).field_N[var15] = var23 & 15;
                      break L101;
                    }
                  }
                }
                L104: {
                  if (var22 != 17) {
                    ((d) this).field_r[var15] = 0;
                    break L104;
                  } else {
                    ((d) this).field_r[var15] = 1;
                    if (var23 == 0) {
                      break L104;
                    } else {
                      ((d) this).field_G[var15] = (var23 & 240) / 16 - (var23 & 15);
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
                          if (((d) this).field_X[var15] != 2) {
                            ((d) this).field_X[var15] = 0;
                            break L105;
                          } else {
                            ((d) this).field_X[var15] = 1;
                            break L105;
                          }
                        } else {
                          break L106;
                        }
                      }
                    }
                  }
                  ((d) this).field_X[var15] = 1;
                  if (var23 == 0) {
                    break L105;
                  } else {
                    ((d) this).field_ib[var15] = (var23 & 240) / 16 - (var23 & 15);
                    break L105;
                  }
                }
                L107: {
                  if (var22 != 25) {
                    if (((d) this).field_w[var15] != 2) {
                      ((d) this).field_w[var15] = 0;
                      break L107;
                    } else {
                      ((d) this).field_w[var15] = 1;
                      break L107;
                    }
                  } else {
                    ((d) this).field_w[var15] = 1;
                    if (var23 == 0) {
                      break L107;
                    } else {
                      ((d) this).field_Y[var15] = (var23 & 240) / 16 - (var23 & 15);
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
                        ((d) this).field_C[var15] = var23;
                        break L109;
                      } else {
                        var23 = ((d) this).field_C[var15];
                        break L109;
                      }
                    }
                    ((d) this).field_q[var15] = ((d) this).field_q[var15] + var23;
                    if (((d) this).field_q[var15] >= 0) {
                      if (((d) this).field_q[var15] <= 64) {
                        break L108;
                      } else {
                        ((d) this).field_q[var15] = 64;
                        break L108;
                      }
                    } else {
                      ((d) this).field_q[var15] = 0;
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
                        ((d) this).field_hb[var15] = var23;
                        break L111;
                      } else {
                        var23 = ((d) this).field_hb[var15];
                        break L111;
                      }
                    }
                    ((d) this).field_q[var15] = ((d) this).field_q[var15] - var23;
                    if (((d) this).field_q[var15] >= 0) {
                      if (((d) this).field_q[var15] <= 64) {
                        break L110;
                      } else {
                        ((d) this).field_q[var15] = 64;
                        break L110;
                      }
                    } else {
                      ((d) this).field_q[var15] = 0;
                      break L110;
                    }
                  }
                }
                L112: {
                  if (var22 != 1) {
                    ((d) this).field_x[var15] = 0;
                    break L112;
                  } else {
                    if (var23 == 0) {
                      break L112;
                    } else {
                      ((d) this).field_x[var15] = var23;
                      break L112;
                    }
                  }
                }
                L113: {
                  if (var22 != 2) {
                    ((d) this).field_L[var15] = 0;
                    break L113;
                  } else {
                    if (var23 == 0) {
                      break L113;
                    } else {
                      ((d) this).field_L[var15] = var23;
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
                        ((d) this).field_W[var15] = var23;
                        break L115;
                      } else {
                        var23 = ((d) this).field_W[var15];
                        break L115;
                      }
                    }
                    L116: {
                      ((d) this).field_mb[var15] = ((d) this).field_mb[var15] - var23 * 4;
                      if (((d) this).field_mb[var15] >= 0) {
                        if (((d) this).field_mb[var15] <= 7999) {
                          break L116;
                        } else {
                          ((d) this).field_mb[var15] = 7999;
                          break L116;
                        }
                      } else {
                        ((d) this).field_mb[var15] = 0;
                        break L116;
                      }
                    }
                    var25 = field_P[((d) this).field_mb[var15]];
                    this.a(var15, var25);
                    break L114;
                  }
                }
                L117: {
                  if (var22 != 226) {
                    break L117;
                  } else {
                    L118: {
                      if (var23 != 0) {
                        ((d) this).field_I[var15] = var23;
                        break L118;
                      } else {
                        var23 = ((d) this).field_I[var15];
                        break L118;
                      }
                    }
                    L119: {
                      ((d) this).field_mb[var15] = ((d) this).field_mb[var15] + var23 * 4;
                      if (((d) this).field_mb[var15] >= 0) {
                        if (((d) this).field_mb[var15] <= 7999) {
                          break L119;
                        } else {
                          ((d) this).field_mb[var15] = 7999;
                          break L119;
                        }
                      } else {
                        ((d) this).field_mb[var15] = 0;
                        break L119;
                      }
                    }
                    var25 = field_P[((d) this).field_mb[var15]];
                    this.a(var15, var25);
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
                        ((d) this).field_M[var15] = var23;
                        break L120;
                      } else {
                        var23 = ((d) this).field_M[var15];
                        break L120;
                      }
                    }
                    L121: {
                      ((d) this).field_mb[var15] = ((d) this).field_mb[var15] + var23;
                      if (((d) this).field_mb[var15] >= 0) {
                        if (((d) this).field_mb[var15] <= 7999) {
                          break L121;
                        } else {
                          ((d) this).field_mb[var15] = 7999;
                          break L121;
                        }
                      } else {
                        ((d) this).field_mb[var15] = 0;
                        break L121;
                      }
                    }
                    var25 = field_P[((d) this).field_mb[var15]];
                    this.a(var15, var25);
                    break L55;
                  } else {
                    L122: {
                      var23 = var23 & 15;
                      if (var23 != 0) {
                        ((d) this).field_cb[var15] = var23;
                        break L122;
                      } else {
                        var23 = ((d) this).field_cb[var15];
                        break L122;
                      }
                    }
                    L123: {
                      ((d) this).field_mb[var15] = ((d) this).field_mb[var15] - var23;
                      if (((d) this).field_mb[var15] >= 0) {
                        if (((d) this).field_mb[var15] <= 7999) {
                          break L123;
                        } else {
                          ((d) this).field_mb[var15] = 7999;
                          break L123;
                        }
                      } else {
                        ((d) this).field_mb[var15] = 0;
                        break L123;
                      }
                    }
                    var25 = field_P[((d) this).field_mb[var15]];
                    this.a(var15, var25);
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

    final void c() {
        if (((d) this).field_k == null) {
          this.f();
          return;
        } else {
          throw new RuntimeException();
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        gd var7 = null;
        Object var8 = null;
        Throwable var9 = null;
        ud stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        ud stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        ud stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_18_2 = 0;
        gd stackIn_19_0 = null;
        gd stackIn_21_0 = null;
        gd stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        gd stackIn_23_0 = null;
        gd stackIn_25_0 = null;
        gd stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        Throwable decompiledCaughtException = null;
        ud stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        ud stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        ud stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        gd stackOut_18_0 = null;
        gd stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        gd stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        gd stackOut_22_0 = null;
        gd stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        gd stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        L0: {
          this.a(param0);
          if (param3 <= field_P[7999]) {
            break L0;
          } else {
            if (param3 < field_P[0]) {
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
                stackOut_14_0 = ((d) this).field_y.field_j[param1];
                stackOut_14_1 = param3 * 256 / ba.field_m;
                stackIn_17_0 = stackOut_14_0;
                stackIn_17_1 = stackOut_14_1;
                stackIn_15_0 = stackOut_14_0;
                stackIn_15_1 = stackOut_14_1;
                if (param2 == 0) {
                  stackOut_17_0 = (ud) (Object) stackIn_17_0;
                  stackOut_17_1 = stackIn_17_1;
                  stackOut_17_2 = param4 * ((d) this).field_O * ((d) this).field_A >> 12;
                  stackIn_18_0 = stackOut_17_0;
                  stackIn_18_1 = stackOut_17_1;
                  stackIn_18_2 = stackOut_17_2;
                  break L3;
                } else {
                  stackOut_15_0 = (ud) (Object) stackIn_15_0;
                  stackOut_15_1 = stackIn_15_1;
                  stackOut_15_2 = 0;
                  stackIn_18_0 = stackOut_15_0;
                  stackIn_18_1 = stackOut_15_1;
                  stackIn_18_2 = stackOut_15_2;
                  break L3;
                }
              }
              L4: {
                var7 = gd.a(stackIn_18_0, stackIn_18_1, stackIn_18_2, param5);
                var7.d(((d) this).field_y.field_t[param1], ((d) this).field_y.field_v[param1]);
                stackOut_18_0 = (gd) var7;
                stackIn_21_0 = stackOut_18_0;
                stackIn_19_0 = stackOut_18_0;
                if (((d) this).field_y.field_c[param1] == 0) {
                  stackOut_21_0 = (gd) (Object) stackIn_21_0;
                  stackOut_21_1 = 0;
                  stackIn_22_0 = stackOut_21_0;
                  stackIn_22_1 = stackOut_21_1;
                  break L4;
                } else {
                  stackOut_19_0 = (gd) (Object) stackIn_19_0;
                  stackOut_19_1 = -1;
                  stackIn_22_0 = stackOut_19_0;
                  stackIn_22_1 = stackOut_19_1;
                  break L4;
                }
              }
              L5: {
                ((gd) (Object) stackIn_22_0).e(stackIn_22_1);
                stackOut_22_0 = (gd) var7;
                stackIn_25_0 = stackOut_22_0;
                stackIn_23_0 = stackOut_22_0;
                if (((d) this).field_y.field_c[param1] != 2) {
                  stackOut_25_0 = (gd) (Object) stackIn_25_0;
                  stackOut_25_1 = 0;
                  stackIn_26_0 = stackOut_25_0;
                  stackIn_26_1 = stackOut_25_1;
                  break L5;
                } else {
                  stackOut_23_0 = (gd) (Object) stackIn_23_0;
                  stackOut_23_1 = 1;
                  stackIn_26_0 = stackOut_23_0;
                  stackIn_26_1 = stackOut_23_1;
                  break L5;
                }
              }
              L6: {
                ((gd) (Object) stackIn_26_0).a(stackIn_26_1 != 0);
                if (param2 == 0) {
                  break L6;
                } else {
                  var7.h(param2);
                  var7.b(ba.field_m >> 7, param4 * ((d) this).field_O * ((d) this).field_A >> 12, param5);
                  break L6;
                }
              }
              L7: {
                ((d) this).field_B[param0] = var7;
                if (((d) this).field_k == null) {
                  break L7;
                } else {
                  var8 = (Object) (Object) ((d) this).field_k;
                  synchronized (var8) {
                    L8: {
                      ((d) this).field_k.a((kd) (Object) var7);
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

    final void b() {
        int var1 = 0;
        var1 = 0;
        L0: while (true) {
          if (var1 >= ((d) this).field_y.field_r) {
            return;
          } else {
            L1: {
              if (((d) this).field_B[var1] == null) {
                break L1;
              } else {
                ((d) this).field_k.a((kd) (Object) ((d) this).field_B[var1]);
                break L1;
              }
            }
            var1++;
            continue L0;
          }
        }
    }

    d(jj param0) {
        ((d) this).field_D = 0;
        ((d) this).field_ob = 0;
        ((d) this).field_eb = -1;
        ((d) this).field_ab = true;
        ((d) this).field_m = -1;
        ((d) this).field_gb = -1;
        ((d) this).field_p = 0;
        ((d) this).field_S = 0;
        ((d) this).field_H = null;
        ((d) this).field_z = 256;
        ((d) this).field_V = 0;
        ((d) this).field_A = 64;
        ((d) this).field_pb = 0;
        ((d) this).field_y = param0;
        this.g();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_K = new int[68];
        field_P = new int[8000];
        var0 = 0;
        L0: while (true) {
          if (var0 >= 8000) {
            var0 = 0;
            L1: while (true) {
              if (var0 >= 68) {
                return;
              } else {
                field_K[var0] = (int)(-2048.0 * Math.sin((double)var0 * 0.0923998));
                var0++;
                continue L1;
              }
            }
          } else {
            field_P[var0] = (int)(8363.0 * Math.pow(2.0, (double)(4608 - var0) / 768.0));
            var0++;
            continue L0;
          }
        }
    }
}
