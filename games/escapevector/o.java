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
        int var2 = this.c() ? 1 : 0;
        if (var2 != 0) {
            if (!((o) this).field_t) {
                return -1;
            }
        }
        int var3 = ie.field_q;
        int var4 = (var3 << 9) + (var3 << 7);
        return var4 / (((o) this).field_r * ((o) this).field_y);
    }

    final synchronized void a(boolean param0) {
        ((o) this).field_t = param0;
    }

    private final void a(int param0, int param1, int param2) {
        if (((o) this).field_T[param0] != null) {
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
            ((o) this).field_T[param0].b(ie.field_q >> 7, param1 * ((o) this).field_i * ((o) this).field_jb >> 12, param2);
        }
    }

    private final void e(int param0) {
        if (((o) this).field_T[param0] != null) {
            ((o) this).field_T[param0].g(ie.field_q >> 7);
            ((o) this).field_T[param0] = null;
        }
    }

    final void b() {
        int var1 = 0;
        for (var1 = 0; var1 < ((o) this).field_u.field_B; var1++) {
            if (((o) this).field_T[var1] != null) {
                ((o) this).field_h.b((wg) (Object) ((o) this).field_T[var1]);
            }
        }
    }

    public static void d() {
        field_o = null;
        field_D = null;
    }

    private final void e() {
        int var1 = 0;
        ((o) this).field_P = 0;
        ((o) this).field_M = 0;
        ((o) this).field_bb = 0;
        ((o) this).field_j = 0;
        ((o) this).field_ib = 0;
        ((o) this).field_x = 0;
        ((o) this).field_k = ((o) this).field_u.field_L;
        ((o) this).field_r = ((o) this).field_u.field_i;
        ((o) this).field_i = 64;
        var1 = 0;
        L0: while (true) {
          if (var1 >= ((o) this).field_u.field_B) {
            ((o) this).field_H = 0;
            ((o) this).field_F = null;
            ((o) this).field_z = -1;
            ((o) this).field_W = -1;
            ((o) this).field_I = 0;
            ((o) this).field_q = 0;
            ((o) this).field_C = -1;
            ((o) this).field_hb = 0;
            var1 = 0;
            L1: while (true) {
              if (var1 >= ((o) this).field_u.field_B) {
                ((o) this).field_M = 1;
                return;
              } else {
                ((o) this).field_T[var1] = null;
                ((o) this).field_X[var1] = false;
                var1++;
                continue L1;
              }
            }
          } else {
            ((o) this).field_N[var1] = 0;
            ((o) this).field_B[var1] = 0;
            ((o) this).field_gb[var1] = 0;
            ((o) this).field_E[var1] = 0;
            ((o) this).field_R[var1] = 0;
            ((o) this).field_fb[var1] = 0;
            ((o) this).field_db[var1] = 0;
            ((o) this).field_mb[var1] = 0;
            ((o) this).field_Q[var1] = 0;
            ((o) this).field_U[var1] = 0;
            ((o) this).field_p[var1] = 0;
            ((o) this).field_cb[var1] = 0;
            ((o) this).field_m[var1] = 0;
            ((o) this).field_ab[var1] = 0;
            ((o) this).field_l[var1] = 0;
            ((o) this).field_Z[var1] = 0;
            ((o) this).field_O[var1] = -1;
            ((o) this).field_K[var1] = 0;
            ((o) this).field_s[var1] = 0;
            ((o) this).field_J[var1] = 0;
            ((o) this).field_S[var1] = 0;
            ((o) this).field_Y[var1] = 0;
            ((o) this).field_G[var1] = 0;
            ((o) this).field_w[var1] = 0;
            ((o) this).field_L[var1] = 0;
            ((o) this).field_lb[var1] = 0;
            ((o) this).field_v[var1] = 0;
            ((o) this).field_A[var1] = 0;
            ((o) this).field_eb[var1] = 128;
            ((o) this).field_n[var1] = 0;
            ((o) this).field_kb[var1] = -1;
            var1++;
            continue L0;
          }
        }
    }

    private final void f() {
        ((o) this).field_A = new int[((o) this).field_u.field_B];
        ((o) this).field_eb = new int[((o) this).field_u.field_B];
        ((o) this).field_n = new int[((o) this).field_u.field_B];
        ((o) this).field_v = new int[((o) this).field_u.field_B];
        ((o) this).field_kb = new int[((o) this).field_u.field_B];
        ((o) this).field_V = new int[((o) this).field_u.field_B];
        ((o) this).field_N = new int[((o) this).field_u.field_B];
        ((o) this).field_B = new int[((o) this).field_u.field_B];
        ((o) this).field_gb = new int[((o) this).field_u.field_B];
        ((o) this).field_E = new int[((o) this).field_u.field_B];
        ((o) this).field_R = new int[((o) this).field_u.field_B];
        ((o) this).field_fb = new int[((o) this).field_u.field_B];
        ((o) this).field_db = new int[((o) this).field_u.field_B];
        ((o) this).field_mb = new int[((o) this).field_u.field_B];
        ((o) this).field_Q = new int[((o) this).field_u.field_B];
        ((o) this).field_U = new int[((o) this).field_u.field_B];
        ((o) this).field_p = new int[((o) this).field_u.field_B];
        ((o) this).field_cb = new int[((o) this).field_u.field_B];
        ((o) this).field_m = new int[((o) this).field_u.field_B];
        ((o) this).field_ab = new int[((o) this).field_u.field_B];
        ((o) this).field_l = new int[((o) this).field_u.field_B];
        ((o) this).field_Z = new int[((o) this).field_u.field_B];
        ((o) this).field_O = new int[((o) this).field_u.field_B];
        ((o) this).field_K = new int[((o) this).field_u.field_B];
        ((o) this).field_s = new int[((o) this).field_u.field_B];
        ((o) this).field_J = new int[((o) this).field_u.field_B];
        ((o) this).field_S = new int[((o) this).field_u.field_B];
        ((o) this).field_Y = new int[((o) this).field_u.field_B];
        ((o) this).field_G = new int[((o) this).field_u.field_B];
        ((o) this).field_L = new int[((o) this).field_u.field_B];
        ((o) this).field_lb = new int[((o) this).field_u.field_B];
        ((o) this).field_w = new int[((o) this).field_u.field_B];
        ((o) this).field_X = new boolean[((o) this).field_u.field_B];
        ((o) this).field_T = new hl[((o) this).field_u.field_B];
        this.e();
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
          if (((o) this).field_M == 1) {
            break L0;
          } else {
            if (((o) this).field_M == 2) {
              break L0;
            } else {
              ((o) this).field_P = 0;
              return false;
            }
          }
        }
        L1: {
          var14 = 0;
          if (((o) this).field_P != 0) {
            break L1;
          } else {
            L2: {
              if (((o) this).field_M != 1) {
                break L2;
              } else {
                ((o) this).field_M = 2;
                ((o) this).field_ib = 0;
                ((o) this).field_j = 0;
                ((o) this).field_x = ((o) this).field_u.field_x[((o) this).field_ib];
                ((o) this).field_bb = 0;
                break L2;
              }
            }
            L3: {
              L4: {
                if (((o) this).field_j >= ((o) this).field_u.field_l[((o) this).field_x]) {
                  break L4;
                } else {
                  if (((o) this).field_hb == 1) {
                    break L4;
                  } else {
                    L5: {
                      if (((o) this).field_I == 0) {
                        break L5;
                      } else {
                        if (((o) this).field_j % ((o) this).field_I == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    if (((o) this).field_H <= 0) {
                      break L3;
                    } else {
                      if (((o) this).field_j % ((o) this).field_H != 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
              }
              L6: {
                if (((o) this).field_I == 0) {
                  ((o) this).field_ib = ((o) this).field_ib + 1;
                  break L6;
                } else {
                  L7: {
                    if (((o) this).field_q > ((o) this).field_ib) {
                      break L7;
                    } else {
                      var14 = 1;
                      break L7;
                    }
                  }
                  ((o) this).field_ib = ((o) this).field_q;
                  break L6;
                }
              }
              L8: {
                if (((o) this).field_C == -1) {
                  break L8;
                } else {
                  ((o) this).field_ib = ((o) this).field_C;
                  ((o) this).field_C = -1;
                  break L8;
                }
              }
              L9: {
                if (((o) this).field_ib < ((o) this).field_u.field_w) {
                  break L9;
                } else {
                  ((o) this).field_ib = 0;
                  var14 = 1;
                  break L9;
                }
              }
              L10: {
                ((o) this).field_j = 0;
                if (((o) this).field_hb != 1) {
                  break L10;
                } else {
                  L11: {
                    ((o) this).field_q = ((o) this).field_q / 16 * 10 + ((o) this).field_q % 16;
                    if (((o) this).field_q < ((o) this).field_u.field_l[((o) this).field_x]) {
                      break L11;
                    } else {
                      ((o) this).field_q = 0;
                      break L11;
                    }
                  }
                  ((o) this).field_j = ((o) this).field_q;
                  break L10;
                }
              }
              L12: {
                if (((o) this).field_z < 0) {
                  break L12;
                } else {
                  L13: {
                    if (((o) this).field_H >= 0) {
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
                    var15 = ((o) this).field_z;
                    var16 = ((o) this).field_W;
                    if (((o) this).field_F == null) {
                      break L14;
                    } else {
                      var17 = 0;
                      L15: while (true) {
                        if (var17 >= ((o) this).field_u.field_B) {
                          ((o) this).field_u = ((o) this).field_F;
                          this.f();
                          ((o) this).field_M = 2;
                          break L14;
                        } else {
                          this.e(var17);
                          var17++;
                          continue L15;
                        }
                      }
                    }
                  }
                  ((o) this).field_ib = var15;
                  ((o) this).field_j = var16;
                  var14 = 0;
                  ((o) this).field_H = 0;
                  ((o) this).field_z = -1;
                  ((o) this).field_W = -1;
                  ((o) this).field_F = null;
                  break L12;
                }
              }
              ((o) this).field_x = ((o) this).field_u.field_x[((o) this).field_ib];
              ((o) this).field_bb = 0;
              var10 = 0;
              L16: while (true) {
                if (var10 >= ((o) this).field_j) {
                  ((o) this).field_C = -1;
                  ((o) this).field_hb = 0;
                  ((o) this).field_I = 0;
                  break L3;
                } else {
                  var15 = 0;
                  L17: while (true) {
                    if (var15 >= ((o) this).field_u.field_B) {
                      var10++;
                      continue L16;
                    } else {
                      L18: {
                        var16 = ((o) this).field_u.field_C[((o) this).field_x][((o) this).field_bb] & 255;
                        ((o) this).field_bb = ((o) this).field_bb + 1;
                        if (var16 >= 128) {
                          var16 -= 128;
                          break L18;
                        } else {
                          ((o) this).field_bb = ((o) this).field_bb - 1;
                          var16 = 31;
                          break L18;
                        }
                      }
                      L19: {
                        if ((var16 & 1) != 1) {
                          break L19;
                        } else {
                          ((o) this).field_bb = ((o) this).field_bb + 1;
                          break L19;
                        }
                      }
                      L20: {
                        if ((var16 & 2) != 2) {
                          break L20;
                        } else {
                          ((o) this).field_bb = ((o) this).field_bb + 1;
                          break L20;
                        }
                      }
                      L21: {
                        if ((var16 & 4) != 4) {
                          break L21;
                        } else {
                          ((o) this).field_bb = ((o) this).field_bb + 1;
                          break L21;
                        }
                      }
                      L22: {
                        if ((var16 & 8) != 8) {
                          break L22;
                        } else {
                          ((o) this).field_bb = ((o) this).field_bb + 1;
                          break L22;
                        }
                      }
                      L23: {
                        if ((var16 & 16) != 16) {
                          break L23;
                        } else {
                          ((o) this).field_bb = ((o) this).field_bb + 1;
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
            ((o) this).field_j = ((o) this).field_j + 1;
            break L1;
          }
        }
        var15 = 0;
        L24: while (true) {
          if (var15 >= ((o) this).field_u.field_B) {
            L25: {
              if (((o) this).field_P <= 0) {
                break L25;
              } else {
                var15 = 0;
                L26: while (true) {
                  if (var15 >= ((o) this).field_u.field_B) {
                    break L25;
                  } else {
                    L27: {
                      if (((o) this).field_X[var15]) {
                        break L27;
                      } else {
                        L28: {
                          if (((o) this).field_w[var15] == 0) {
                            break L28;
                          } else {
                            ((o) this).field_i = ((o) this).field_i + ((o) this).field_V[var15];
                            if (((o) this).field_i >= 0) {
                              if (((o) this).field_i <= 64) {
                                break L28;
                              } else {
                                ((o) this).field_i = 64;
                                break L28;
                              }
                            } else {
                              ((o) this).field_i = 0;
                              break L28;
                            }
                          }
                        }
                        L29: {
                          L30: {
                            if (((o) this).field_L[var15] != 0) {
                              break L30;
                            } else {
                              if (((o) this).field_lb[var15] == 0) {
                                break L29;
                              } else {
                                break L30;
                              }
                            }
                          }
                          L31: {
                            ((o) this).field_A[var15] = ((o) this).field_A[var15] + ((o) this).field_N[var15];
                            if (((o) this).field_A[var15] >= 0) {
                              if (((o) this).field_A[var15] <= 64) {
                                break L31;
                              } else {
                                ((o) this).field_A[var15] = 64;
                                break L31;
                              }
                            } else {
                              ((o) this).field_A[var15] = 0;
                              break L31;
                            }
                          }
                          ((o) this).field_eb[var15] = ((o) this).field_eb[var15] + ((o) this).field_B[var15];
                          if (((o) this).field_eb[var15] >= 0) {
                            if (((o) this).field_eb[var15] <= 255) {
                              break L29;
                            } else {
                              ((o) this).field_eb[var15] = 255;
                              break L29;
                            }
                          } else {
                            ((o) this).field_eb[var15] = 0;
                            break L29;
                          }
                        }
                        L32: {
                          if (((o) this).field_fb[var15] != 1) {
                            break L32;
                          } else {
                            ((o) this).field_R[var15] = (((o) this).field_R[var15] + ((o) this).field_gb[var15]) % 68;
                            var2 = field_D[((o) this).field_R[var15]] * ((o) this).field_E[var15] >> 8;
                            var16 = ((o) this).field_n[var15] + var2;
                            this.a(var15, field_o[var16]);
                            break L32;
                          }
                        }
                        L33: {
                          if (((o) this).field_m[var15] <= 0) {
                            break L33;
                          } else {
                            L34: {
                              ((o) this).field_n[var15] = ((o) this).field_n[var15] - ((o) this).field_m[var15] * 4;
                              if (((o) this).field_n[var15] >= 0) {
                                if (((o) this).field_n[var15] <= 7999) {
                                  break L34;
                                } else {
                                  ((o) this).field_n[var15] = 7999;
                                  break L34;
                                }
                              } else {
                                ((o) this).field_n[var15] = 0;
                                break L34;
                              }
                            }
                            var16 = field_o[((o) this).field_n[var15]];
                            this.a(var15, var16);
                            break L33;
                          }
                        }
                        L35: {
                          if (((o) this).field_ab[var15] <= 0) {
                            break L35;
                          } else {
                            L36: {
                              ((o) this).field_n[var15] = ((o) this).field_n[var15] + ((o) this).field_ab[var15] * 4;
                              if (((o) this).field_n[var15] >= 0) {
                                if (((o) this).field_n[var15] <= 7999) {
                                  break L36;
                                } else {
                                  ((o) this).field_n[var15] = 7999;
                                  break L36;
                                }
                              } else {
                                ((o) this).field_n[var15] = 0;
                                break L36;
                              }
                            }
                            var16 = field_o[((o) this).field_n[var15]];
                            this.a(var15, var16);
                            break L35;
                          }
                        }
                        if (((o) this).field_G[var15] <= 0) {
                          break L27;
                        } else {
                          L37: {
                            if (((o) this).field_n[var15] >= ((o) this).field_l[var15]) {
                              break L37;
                            } else {
                              ((o) this).field_n[var15] = ((o) this).field_n[var15] + ((o) this).field_Z[var15] * 4;
                              if (((o) this).field_n[var15] <= ((o) this).field_l[var15]) {
                                break L37;
                              } else {
                                ((o) this).field_n[var15] = ((o) this).field_l[var15];
                                break L37;
                              }
                            }
                          }
                          L38: {
                            if (((o) this).field_n[var15] <= ((o) this).field_l[var15]) {
                              break L38;
                            } else {
                              ((o) this).field_n[var15] = ((o) this).field_n[var15] - ((o) this).field_Z[var15] * 4;
                              if (((o) this).field_n[var15] >= ((o) this).field_l[var15]) {
                                break L38;
                              } else {
                                ((o) this).field_n[var15] = ((o) this).field_l[var15];
                                break L38;
                              }
                            }
                          }
                          L39: {
                            if (((o) this).field_n[var15] >= 0) {
                              if (((o) this).field_n[var15] <= 7999) {
                                break L39;
                              } else {
                                ((o) this).field_n[var15] = 7999;
                                break L39;
                              }
                            } else {
                              ((o) this).field_n[var15] = 0;
                              break L39;
                            }
                          }
                          var16 = field_o[((o) this).field_n[var15]];
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
              if (var15 >= ((o) this).field_u.field_B) {
                L41: {
                  ((o) this).field_P = ((o) this).field_P + 1;
                  if (((o) this).field_P < ((o) this).field_k) {
                    break L41;
                  } else {
                    ((o) this).field_P = 0;
                    break L41;
                  }
                }
                return var14 != 0;
              } else {
                L42: {
                  if (((o) this).field_X[var15]) {
                    break L42;
                  } else {
                    L43: {
                      var16 = ((o) this).field_A[var15];
                      var17 = ((o) this).field_eb[var15];
                      ((o) this).field_J[var15] = 0;
                      if (((o) this).field_kb[var15] < 0) {
                        break L43;
                      } else {
                        L44: {
                          var3 = ((o) this).field_kb[var15];
                          if ((((o) this).field_u.field_u[((o) this).field_kb[var15]] & 1) != 1) {
                            break L44;
                          } else {
                            ((o) this).field_J[var15] = 1;
                            var4 = ((o) this).field_K[var15];
                            var5 = 0;
                            L45: while (true) {
                              if (((o) this).field_u.field_v[var3][var5 + 1] >= var4) {
                                L46: {
                                  var6 = ((o) this).field_u.field_v[var3][var5];
                                  var8 = ((o) this).field_u.field_v[var3][var5 + 1];
                                  var7 = ((o) this).field_u.field_g[var3][var5];
                                  var9 = ((o) this).field_u.field_g[var3][var5 + 1];
                                  if (var8 != var6) {
                                    break L46;
                                  } else {
                                    var8++;
                                    break L46;
                                  }
                                }
                                L47: {
                                  var11 = ((var8 - var4) * var7 + (var4 - var6) * var9) / (var8 - var6);
                                  var12 = 32768 - ((o) this).field_Y[var15];
                                  if (var12 >= 0) {
                                    break L47;
                                  } else {
                                    var12 = 0;
                                    break L47;
                                  }
                                }
                                L48: {
                                  var16 = var16 * var11 * var12 >> 21;
                                  if ((((o) this).field_u.field_u[var3] & 2) != 2) {
                                    break L48;
                                  } else {
                                    if (((o) this).field_S[var15] != 1) {
                                      break L48;
                                    } else {
                                      if (((o) this).field_K[var15] != ((o) this).field_u.field_v[var3][((o) this).field_u.field_J[var3]]) {
                                        break L48;
                                      } else {
                                        ((o) this).field_K[var15] = ((o) this).field_K[var15] - 1;
                                        break L48;
                                      }
                                    }
                                  }
                                }
                                L49: {
                                  if (((o) this).field_K[var15] != ((o) this).field_u.field_v[var3][((o) this).field_u.field_v[var3].length - 1]) {
                                    break L49;
                                  } else {
                                    ((o) this).field_K[var15] = ((o) this).field_K[var15] - 1;
                                    break L49;
                                  }
                                }
                                L50: {
                                  if (((o) this).field_S[var15] != 0) {
                                    break L50;
                                  } else {
                                    ((o) this).field_Y[var15] = ((o) this).field_Y[var15] + ((o) this).field_u.field_H[var3];
                                    break L50;
                                  }
                                }
                                ((o) this).field_K[var15] = ((o) this).field_K[var15] + 1;
                                if ((((o) this).field_u.field_u[var3] & 4) != 4) {
                                  break L44;
                                } else {
                                  if (((o) this).field_K[var15] != ((o) this).field_u.field_v[var3][((o) this).field_u.field_G[var3]]) {
                                    break L44;
                                  } else {
                                    ((o) this).field_K[var15] = ((o) this).field_u.field_v[var3][((o) this).field_u.field_r[var3]];
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
                        if ((((o) this).field_u.field_m[((o) this).field_kb[var15]] & 1) != 1) {
                          break L43;
                        } else {
                          var4 = ((o) this).field_s[var15];
                          var5 = 0;
                          L51: while (true) {
                            if (((o) this).field_u.field_I[var3][var5 + 1] >= var4) {
                              L52: {
                                var6 = ((o) this).field_u.field_I[var3][var5];
                                var8 = ((o) this).field_u.field_I[var3][var5 + 1];
                                var7 = ((o) this).field_u.field_t[var3][var5];
                                var9 = ((o) this).field_u.field_t[var3][var5 + 1];
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
                                if ((((o) this).field_u.field_m[var3] & 2) != 2) {
                                  break L53;
                                } else {
                                  if (((o) this).field_S[var15] != 1) {
                                    break L53;
                                  } else {
                                    if (((o) this).field_s[var15] != ((o) this).field_u.field_I[var3][((o) this).field_u.field_q[var3]]) {
                                      break L53;
                                    } else {
                                      ((o) this).field_s[var15] = ((o) this).field_s[var15] - 1;
                                      break L53;
                                    }
                                  }
                                }
                              }
                              L54: {
                                if (((o) this).field_s[var15] != ((o) this).field_u.field_I[var3][((o) this).field_u.field_I[var3].length - 1]) {
                                  break L54;
                                } else {
                                  ((o) this).field_s[var15] = ((o) this).field_s[var15] - 1;
                                  break L54;
                                }
                              }
                              ((o) this).field_s[var15] = ((o) this).field_s[var15] + 1;
                              if ((((o) this).field_u.field_m[var3] & 4) != 4) {
                                break L43;
                              } else {
                                if (((o) this).field_s[var15] != ((o) this).field_u.field_I[var3][((o) this).field_u.field_K[var3]]) {
                                  break L43;
                                } else {
                                  ((o) this).field_s[var15] = ((o) this).field_u.field_I[var3][((o) this).field_u.field_k[var3]];
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
                if (((o) this).field_P != 0) {
                  if (((o) this).field_O[var15] >= 0) {
                    var16 = ((o) this).field_O[var15];
                    break L56;
                  } else {
                    break L55;
                  }
                } else {
                  var16 = ((o) this).field_bb;
                  break L56;
                }
              }
              L57: {
                ((o) this).field_O[var15] = -1;
                var17 = var16;
                var18 = -1;
                var19 = -1;
                var20 = -1;
                var21 = -1;
                var22 = -1;
                var23 = 0;
                var24 = ((o) this).field_u.field_C[((o) this).field_x][var16] & 255;
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
                  var18 = ((o) this).field_u.field_C[((o) this).field_x][var16] & 255;
                  var16++;
                  break L58;
                }
              }
              L59: {
                if ((var24 & 2) != 2) {
                  break L59;
                } else {
                  var19 = (((o) this).field_u.field_C[((o) this).field_x][var16] & 255) - 1;
                  var16++;
                  break L59;
                }
              }
              L60: {
                if ((var24 & 4) != 4) {
                  break L60;
                } else {
                  var20 = (((o) this).field_u.field_C[((o) this).field_x][var16] & 255) - 16;
                  var16++;
                  break L60;
                }
              }
              L61: {
                if ((var24 & 8) != 8) {
                  break L61;
                } else {
                  var22 = ((o) this).field_u.field_C[((o) this).field_x][var16] & 255;
                  var16++;
                  break L61;
                }
              }
              L62: {
                if ((var24 & 16) != 16) {
                  break L62;
                } else {
                  var23 = ((o) this).field_u.field_C[((o) this).field_x][var16] & 255;
                  var16++;
                  break L62;
                }
              }
              L63: {
                if (((o) this).field_P != 0) {
                  break L63;
                } else {
                  ((o) this).field_bb = var16;
                  break L63;
                }
              }
              if (((o) this).field_X[var15]) {
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
                      if (((o) this).field_P != var23) {
                        ((o) this).field_O[var15] = var17;
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
                    if (((o) this).field_P >= var23) {
                      break L66;
                    } else {
                      ((o) this).field_O[var15] = var17;
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
                      ((o) this).field_L[var15] = 2;
                      ((o) this).field_N[var15] = 80 - var20;
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
                      ((o) this).field_L[var15] = 2;
                      ((o) this).field_N[var15] = var20 - 96;
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
                      var20 = ((o) this).field_A[var15] - (var20 - 112);
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
                      var20 = ((o) this).field_A[var15] + (var20 - 128);
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
                      ((o) this).field_lb[var15] = 2;
                      ((o) this).field_B[var15] = 192 - var20;
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
                      ((o) this).field_lb[var15] = 2;
                      ((o) this).field_B[var15] = var20 - 208;
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
                    if (((o) this).field_I > 1) {
                      ((o) this).field_I = 1;
                      break L75;
                    } else {
                      ((o) this).field_hb = 1;
                      ((o) this).field_q = var23;
                      break L75;
                    }
                  }
                }
                L76: {
                  if (var22 != 15) {
                    break L76;
                  } else {
                    if (var23 >= 32) {
                      ((o) this).field_r = var23;
                      break L76;
                    } else {
                      ((o) this).field_k = var23;
                      break L76;
                    }
                  }
                }
                L77: {
                  if (var22 != 16) {
                    break L77;
                  } else {
                    ((o) this).field_i = var23;
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
                    if (((o) this).field_I > 1) {
                      break L80;
                    } else {
                      ((o) this).field_I = 1;
                      ((o) this).field_q = var23;
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
                      ((o) this).field_K[var15] = var23;
                      if (((o) this).field_K[var15] < ((o) this).field_u.field_v[var3][((o) this).field_u.field_v[var3].length - 1]) {
                        break L83;
                      } else {
                        ((o) this).field_K[var15] = ((o) this).field_u.field_v[var3][((o) this).field_u.field_v[var3].length - 1] - 1;
                        break L83;
                      }
                    }
                    ((o) this).field_s[var15] = var23;
                    if (((o) this).field_s[var15] < ((o) this).field_u.field_I[var3][((o) this).field_u.field_I[var3].length - 1]) {
                      break L82;
                    } else {
                      ((o) this).field_s[var15] = ((o) this).field_u.field_I[var3][((o) this).field_u.field_I[var3].length - 1] - 1;
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
                      ((o) this).field_K[var15] = 0;
                      ((o) this).field_s[var15] = 0;
                      ((o) this).field_S[var15] = 1;
                      ((o) this).field_Y[var15] = 0;
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
                        var20 = ((o) this).field_u.field_a[((o) this).field_v[var15]];
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
                        var21 = ((o) this).field_u.field_y[((o) this).field_v[var15]];
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
                                var20 = ((o) this).field_A[var15];
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
                                var21 = ((o) this).field_eb[var15];
                                break L90;
                              }
                            }
                          }
                          L91: {
                            if (var19 != -1) {
                              ((o) this).field_kb[var15] = var19;
                              if (var18 >= 96) {
                                var19 = ((o) this).field_u.field_d[var19][95];
                                break L91;
                              } else {
                                var19 = ((o) this).field_u.field_d[var19][var18];
                                break L91;
                              }
                            } else {
                              var19 = ((o) this).field_v[var15];
                              break L91;
                            }
                          }
                          L92: {
                            if (var20 >= 0) {
                              break L92;
                            } else {
                              var20 = ((o) this).field_u.field_a[var19];
                              break L92;
                            }
                          }
                          L93: {
                            if (var21 >= 0) {
                              break L93;
                            } else {
                              var21 = ((o) this).field_u.field_y[var19];
                              break L93;
                            }
                          }
                          L94: {
                            var25 = 7680 - (var18 + ((o) this).field_u.field_b[var19]) * 64 - ((o) this).field_u.field_z[var19] / 2;
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
                            ((o) this).field_l[var15] = var25;
                            var26 = field_o[var25];
                            ((o) this).field_v[var15] = var19;
                            ((o) this).field_A[var15] = var20;
                            ((o) this).field_eb[var15] = var21;
                            ((o) this).field_n[var15] = var25;
                            var1 = 0;
                            if (var22 != 9) {
                              break L95;
                            } else {
                              if (var23 * 256 <= ((o) this).field_u.field_n[var19]) {
                                var1 = var23 * 256;
                                break L95;
                              } else {
                                var1 = ((o) this).field_u.field_n[var19];
                                break L95;
                              }
                            }
                          }
                          this.a(var15, var19, var1, var26, var20, var21);
                          ((o) this).field_R[var15] = 0;
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
                        ((o) this).field_A[var15] = var20;
                        break L97;
                      }
                    }
                    if (var21 < 0) {
                      break L87;
                    } else {
                      ((o) this).field_eb[var15] = var21;
                      break L87;
                    }
                  } else {
                    if (((o) this).field_J[var15] != 1) {
                      this.e(var15);
                      break L87;
                    } else {
                      ((o) this).field_S[var15] = 0;
                      break L87;
                    }
                  }
                }
                L98: {
                  if (var22 != 3) {
                    if (var22 == 5) {
                      break L98;
                    } else {
                      ((o) this).field_G[var15] = 0;
                      break L98;
                    }
                  } else {
                    L99: {
                      ((o) this).field_G[var15] = 1;
                      if (var18 < 0) {
                        break L99;
                      } else {
                        if (var18 > 96) {
                          break L99;
                        } else {
                          L100: {
                            var19 = ((o) this).field_v[var15];
                            var25 = 7680 - (var18 + ((o) this).field_u.field_b[var19]) * 64 - ((o) this).field_u.field_z[var19] / 2;
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
                          ((o) this).field_l[var15] = var25;
                          break L99;
                        }
                      }
                    }
                    if (var23 == 0) {
                      break L98;
                    } else {
                      ((o) this).field_Z[var15] = var23;
                      if (((o) this).field_u.field_D != 0) {
                        break L98;
                      } else {
                        ((o) this).field_Z[var15] = ((o) this).field_Z[var15] * 2;
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
                        if (((o) this).field_fb[var15] == 0) {
                          break L102;
                        } else {
                          var25 = field_o[((o) this).field_n[var15]];
                          this.a(var15, var25);
                          break L102;
                        }
                      }
                      ((o) this).field_R[var15] = 0;
                      ((o) this).field_fb[var15] = 0;
                      break L101;
                    }
                  } else {
                    L103: {
                      ((o) this).field_fb[var15] = 1;
                      if (var23 / 16 <= 0) {
                        break L103;
                      } else {
                        ((o) this).field_gb[var15] = var23 / 16;
                        break L103;
                      }
                    }
                    if ((var23 & 15) <= 0) {
                      break L101;
                    } else {
                      ((o) this).field_E[var15] = var23 & 15;
                      break L101;
                    }
                  }
                }
                L104: {
                  if (var22 != 17) {
                    ((o) this).field_w[var15] = 0;
                    break L104;
                  } else {
                    ((o) this).field_w[var15] = 1;
                    if (var23 == 0) {
                      break L104;
                    } else {
                      ((o) this).field_V[var15] = (var23 & 240) / 16 - (var23 & 15);
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
                          if (((o) this).field_L[var15] != 2) {
                            ((o) this).field_L[var15] = 0;
                            break L105;
                          } else {
                            ((o) this).field_L[var15] = 1;
                            break L105;
                          }
                        } else {
                          break L106;
                        }
                      }
                    }
                  }
                  ((o) this).field_L[var15] = 1;
                  if (var23 == 0) {
                    break L105;
                  } else {
                    ((o) this).field_N[var15] = (var23 & 240) / 16 - (var23 & 15);
                    break L105;
                  }
                }
                L107: {
                  if (var22 != 25) {
                    if (((o) this).field_lb[var15] != 2) {
                      ((o) this).field_lb[var15] = 0;
                      break L107;
                    } else {
                      ((o) this).field_lb[var15] = 1;
                      break L107;
                    }
                  } else {
                    ((o) this).field_lb[var15] = 1;
                    if (var23 == 0) {
                      break L107;
                    } else {
                      ((o) this).field_B[var15] = (var23 & 240) / 16 - (var23 & 15);
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
                        ((o) this).field_db[var15] = var23;
                        break L109;
                      } else {
                        var23 = ((o) this).field_db[var15];
                        break L109;
                      }
                    }
                    ((o) this).field_A[var15] = ((o) this).field_A[var15] + var23;
                    if (((o) this).field_A[var15] >= 0) {
                      if (((o) this).field_A[var15] <= 64) {
                        break L108;
                      } else {
                        ((o) this).field_A[var15] = 64;
                        break L108;
                      }
                    } else {
                      ((o) this).field_A[var15] = 0;
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
                        ((o) this).field_U[var15] = var23;
                        break L111;
                      } else {
                        var23 = ((o) this).field_U[var15];
                        break L111;
                      }
                    }
                    ((o) this).field_A[var15] = ((o) this).field_A[var15] - var23;
                    if (((o) this).field_A[var15] >= 0) {
                      if (((o) this).field_A[var15] <= 64) {
                        break L110;
                      } else {
                        ((o) this).field_A[var15] = 64;
                        break L110;
                      }
                    } else {
                      ((o) this).field_A[var15] = 0;
                      break L110;
                    }
                  }
                }
                L112: {
                  if (var22 != 1) {
                    ((o) this).field_m[var15] = 0;
                    break L112;
                  } else {
                    if (var23 == 0) {
                      break L112;
                    } else {
                      ((o) this).field_m[var15] = var23;
                      break L112;
                    }
                  }
                }
                L113: {
                  if (var22 != 2) {
                    ((o) this).field_ab[var15] = 0;
                    break L113;
                  } else {
                    if (var23 == 0) {
                      break L113;
                    } else {
                      ((o) this).field_ab[var15] = var23;
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
                        ((o) this).field_mb[var15] = var23;
                        break L115;
                      } else {
                        var23 = ((o) this).field_mb[var15];
                        break L115;
                      }
                    }
                    L116: {
                      ((o) this).field_n[var15] = ((o) this).field_n[var15] - var23 * 4;
                      if (((o) this).field_n[var15] >= 0) {
                        if (((o) this).field_n[var15] <= 7999) {
                          break L116;
                        } else {
                          ((o) this).field_n[var15] = 7999;
                          break L116;
                        }
                      } else {
                        ((o) this).field_n[var15] = 0;
                        break L116;
                      }
                    }
                    var25 = field_o[((o) this).field_n[var15]];
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
                        ((o) this).field_p[var15] = var23;
                        break L118;
                      } else {
                        var23 = ((o) this).field_p[var15];
                        break L118;
                      }
                    }
                    L119: {
                      ((o) this).field_n[var15] = ((o) this).field_n[var15] + var23 * 4;
                      if (((o) this).field_n[var15] >= 0) {
                        if (((o) this).field_n[var15] <= 7999) {
                          break L119;
                        } else {
                          ((o) this).field_n[var15] = 7999;
                          break L119;
                        }
                      } else {
                        ((o) this).field_n[var15] = 0;
                        break L119;
                      }
                    }
                    var25 = field_o[((o) this).field_n[var15]];
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
                        ((o) this).field_cb[var15] = var23;
                        break L120;
                      } else {
                        var23 = ((o) this).field_cb[var15];
                        break L120;
                      }
                    }
                    L121: {
                      ((o) this).field_n[var15] = ((o) this).field_n[var15] + var23;
                      if (((o) this).field_n[var15] >= 0) {
                        if (((o) this).field_n[var15] <= 7999) {
                          break L121;
                        } else {
                          ((o) this).field_n[var15] = 7999;
                          break L121;
                        }
                      } else {
                        ((o) this).field_n[var15] = 0;
                        break L121;
                      }
                    }
                    var25 = field_o[((o) this).field_n[var15]];
                    this.a(var15, var25);
                    break L55;
                  } else {
                    L122: {
                      var23 = var23 & 15;
                      if (var23 != 0) {
                        ((o) this).field_Q[var15] = var23;
                        break L122;
                      } else {
                        var23 = ((o) this).field_Q[var15];
                        break L122;
                      }
                    }
                    L123: {
                      ((o) this).field_n[var15] = ((o) this).field_n[var15] - var23;
                      if (((o) this).field_n[var15] >= 0) {
                        if (((o) this).field_n[var15] <= 7999) {
                          break L123;
                        } else {
                          ((o) this).field_n[var15] = 7999;
                          break L123;
                        }
                      } else {
                        ((o) this).field_n[var15] = 0;
                        break L123;
                      }
                    }
                    var25 = field_o[((o) this).field_n[var15]];
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

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        hl var7 = null;
        Object var8 = null;
        Throwable var9 = null;
        hh stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        hh stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        hh stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        hl stackIn_15_0 = null;
        hl stackIn_16_0 = null;
        hl stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        hl stackIn_18_0 = null;
        hl stackIn_19_0 = null;
        hl stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        Throwable decompiledCaughtException = null;
        hh stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        hh stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        hh stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        hl stackOut_14_0 = null;
        hl stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        hl stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        hl stackOut_17_0 = null;
        hl stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        hl stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        L0: {
          this.e(param0);
          if (param3 <= field_o[7999]) {
            break L0;
          } else {
            if (param3 < field_o[0]) {
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
                stackOut_11_0 = ((o) this).field_u.field_s[param1];
                stackOut_11_1 = param3 * 256 / ie.field_q;
                stackIn_13_0 = stackOut_11_0;
                stackIn_13_1 = stackOut_11_1;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                if (param2 == 0) {
                  stackOut_13_0 = (hh) (Object) stackIn_13_0;
                  stackOut_13_1 = stackIn_13_1;
                  stackOut_13_2 = param4 * ((o) this).field_i * ((o) this).field_jb >> 12;
                  stackIn_14_0 = stackOut_13_0;
                  stackIn_14_1 = stackOut_13_1;
                  stackIn_14_2 = stackOut_13_2;
                  break L3;
                } else {
                  stackOut_12_0 = (hh) (Object) stackIn_12_0;
                  stackOut_12_1 = stackIn_12_1;
                  stackOut_12_2 = 0;
                  stackIn_14_0 = stackOut_12_0;
                  stackIn_14_1 = stackOut_12_1;
                  stackIn_14_2 = stackOut_12_2;
                  break L3;
                }
              }
              L4: {
                var7 = hl.b(stackIn_14_0, stackIn_14_1, stackIn_14_2, param5);
                var7.b(((o) this).field_u.field_h[param1], ((o) this).field_u.field_A[param1]);
                stackOut_14_0 = (hl) var7;
                stackIn_16_0 = stackOut_14_0;
                stackIn_15_0 = stackOut_14_0;
                if (((o) this).field_u.field_E[param1] == 0) {
                  stackOut_16_0 = (hl) (Object) stackIn_16_0;
                  stackOut_16_1 = 0;
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  break L4;
                } else {
                  stackOut_15_0 = (hl) (Object) stackIn_15_0;
                  stackOut_15_1 = -1;
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_17_1 = stackOut_15_1;
                  break L4;
                }
              }
              L5: {
                ((hl) (Object) stackIn_17_0).h(stackIn_17_1);
                stackOut_17_0 = (hl) var7;
                stackIn_19_0 = stackOut_17_0;
                stackIn_18_0 = stackOut_17_0;
                if (((o) this).field_u.field_E[param1] != 2) {
                  stackOut_19_0 = (hl) (Object) stackIn_19_0;
                  stackOut_19_1 = 0;
                  stackIn_20_0 = stackOut_19_0;
                  stackIn_20_1 = stackOut_19_1;
                  break L5;
                } else {
                  stackOut_18_0 = (hl) (Object) stackIn_18_0;
                  stackOut_18_1 = 1;
                  stackIn_20_0 = stackOut_18_0;
                  stackIn_20_1 = stackOut_18_1;
                  break L5;
                }
              }
              L6: {
                ((hl) (Object) stackIn_20_0).a(stackIn_20_1 != 0);
                if (param2 == 0) {
                  break L6;
                } else {
                  var7.e(param2);
                  var7.b(ie.field_q >> 7, param4 * ((o) this).field_i * ((o) this).field_jb >> 12, param5);
                  break L6;
                }
              }
              L7: {
                ((o) this).field_T[param0] = var7;
                if (((o) this).field_h == null) {
                  break L7;
                } else {
                  var8 = (Object) (Object) ((o) this).field_h;
                  synchronized (var8) {
                    L8: {
                      ((o) this).field_h.a((wg) (Object) var7);
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

    final synchronized void d(int param0) {
        ((o) this).field_jb = param0;
    }

    final void a() {
        int var1 = 0;
        for (var1 = 0; var1 < ((o) this).field_u.field_B; var1++) {
            if (((o) this).field_T[var1] != null) {
                ((o) this).field_h.a((wg) (Object) ((o) this).field_T[var1]);
            }
        }
    }

    private final void a(int param0, int param1) {
        if (((o) this).field_T[param0] != null) {
            ((o) this).field_T[param0].i(param1 * 256 / ie.field_q);
        }
    }

    o(ce param0) {
        ((o) this).field_jb = 64;
        ((o) this).field_H = 0;
        ((o) this).field_W = -1;
        ((o) this).field_F = null;
        ((o) this).field_P = 0;
        ((o) this).field_M = 0;
        ((o) this).field_I = 0;
        ((o) this).field_hb = 0;
        ((o) this).field_C = -1;
        ((o) this).field_y = 256;
        ((o) this).field_t = true;
        ((o) this).field_q = 0;
        ((o) this).field_z = -1;
        ((o) this).field_u = param0;
        this.f();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_o = new int[8000];
        field_D = new int[68];
        for (var0 = 0; var0 < 8000; var0++) {
            field_o[var0] = (int)(8363.0 * Math.pow(2.0, (double)(4608 - var0) / 768.0));
        }
        for (var0 = 0; var0 < 68; var0++) {
            field_D[var0] = (int)(-2048.0 * Math.sin((double)var0 * 0.0923998));
        }
    }
}
