/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dd extends bl {
    private int[] field_qb;
    private int[] field_gb;
    private int field_s;
    private int[] field_O;
    private int[] field_z;
    private int field_D;
    private int field_pb;
    private int[] field_y;
    private int field_x;
    private int[] field_hb;
    private int[] field_fb;
    private int field_W;
    private int[] field_A;
    private int field_lb;
    private int[] field_v;
    private int[] field_ib;
    private int[] field_p;
    private boolean[] field_V;
    private int[] field_eb;
    private int field_M;
    private vk field_J;
    private int[] field_Z;
    private int field_ub;
    private int[] field_T;
    private int field_E;
    private int field_db;
    private int[] field_kb;
    private int[] field_sb;
    private int[] field_bb;
    private int[] field_I;
    private int[] field_nb;
    private int field_R;
    private int[] field_H;
    private int field_tb;
    private int[] field_Y;
    private static int[] field_rb;
    private int[] field_Q;
    private boolean field_X;
    private int field_w;
    private int field_u;
    private int[] field_N;
    private int[] field_q;
    private int[] field_G;
    private int[] field_vb;
    private int field_S;
    private int[] field_K;
    private static int[] field_cb;
    private int[] field_B;
    private int[] field_r;
    private int field_C;
    private vc[] field_t;
    private int[] field_mb;
    private vk field_P;
    private int field_ob;
    private int[] field_o;
    private int field_jb;
    private int[] field_ab;

    final void a() {
        int var1 = 0;
        var1 = 0;
        L0: while (true) {
          if (var1 >= ((dd) this).field_J.field_t) {
            return;
          } else {
            if (((dd) this).field_t[var1] != null) {
              ((dd) this).field_n.b((gf) (Object) ((dd) this).field_t[var1]);
              var1++;
              continue L0;
            } else {
              var1++;
              continue L0;
            }
          }
        }
    }

    final int a(be param0) {
        if (this.e()) {
            if (!((dd) this).field_X) {
                return -1;
            }
        }
        int var3 = dk.field_k;
        int var4 = (var3 << 9) + (var3 << 7);
        return var4 / (((dd) this).field_pb * ((dd) this).field_w);
    }

    private final void c(int param0) {
        if (((dd) this).field_t[param0] != null) {
            ((dd) this).field_t[param0].f(dk.field_k >> 7);
            ((dd) this).field_t[param0] = null;
        }
    }

    private final void a(int param0, int param1, int param2) {
        if (((dd) this).field_t[param0] != null) {
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
            ((dd) this).field_t[param0].a(dk.field_k >> 7, param1 * ((dd) this).field_W * ((dd) this).field_ob >> 12, param2);
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        vc var7 = null;
        Object var8 = null;
        Throwable var9 = null;
        bi stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        bi stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        bi stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        vc stackIn_16_0 = null;
        vc stackIn_17_0 = null;
        vc stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        vc stackIn_19_0 = null;
        vc stackIn_20_0 = null;
        vc stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        Throwable decompiledCaughtException = null;
        bi stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        bi stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        bi stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        vc stackOut_15_0 = null;
        vc stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        vc stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        vc stackOut_18_0 = null;
        vc stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        vc stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        L0: {
          this.c(param0);
          if (param3 <= field_rb[7999]) {
            break L0;
          } else {
            if (param3 < field_rb[0]) {
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
                stackOut_12_0 = ((dd) this).field_J.field_e[param1];
                stackOut_12_1 = param3 * 256 / dk.field_k;
                stackIn_14_0 = stackOut_12_0;
                stackIn_14_1 = stackOut_12_1;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                if (param2 == 0) {
                  stackOut_14_0 = (bi) (Object) stackIn_14_0;
                  stackOut_14_1 = stackIn_14_1;
                  stackOut_14_2 = param4 * ((dd) this).field_W * ((dd) this).field_ob >> 12;
                  stackIn_15_0 = stackOut_14_0;
                  stackIn_15_1 = stackOut_14_1;
                  stackIn_15_2 = stackOut_14_2;
                  break L3;
                } else {
                  stackOut_13_0 = (bi) (Object) stackIn_13_0;
                  stackOut_13_1 = stackIn_13_1;
                  stackOut_13_2 = 0;
                  stackIn_15_0 = stackOut_13_0;
                  stackIn_15_1 = stackOut_13_1;
                  stackIn_15_2 = stackOut_13_2;
                  break L3;
                }
              }
              L4: {
                var7 = vc.a(stackIn_15_0, stackIn_15_1, stackIn_15_2, param5);
                var7.d(((dd) this).field_J.field_j[param1], ((dd) this).field_J.field_u[param1]);
                stackOut_15_0 = (vc) var7;
                stackIn_17_0 = stackOut_15_0;
                stackIn_16_0 = stackOut_15_0;
                if (((dd) this).field_J.field_C[param1] == 0) {
                  stackOut_17_0 = (vc) (Object) stackIn_17_0;
                  stackOut_17_1 = 0;
                  stackIn_18_0 = stackOut_17_0;
                  stackIn_18_1 = stackOut_17_1;
                  break L4;
                } else {
                  stackOut_16_0 = (vc) (Object) stackIn_16_0;
                  stackOut_16_1 = -1;
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_18_1 = stackOut_16_1;
                  break L4;
                }
              }
              L5: {
                ((vc) (Object) stackIn_18_0).c(stackIn_18_1);
                stackOut_18_0 = (vc) var7;
                stackIn_20_0 = stackOut_18_0;
                stackIn_19_0 = stackOut_18_0;
                if (((dd) this).field_J.field_C[param1] != 2) {
                  stackOut_20_0 = (vc) (Object) stackIn_20_0;
                  stackOut_20_1 = 0;
                  stackIn_21_0 = stackOut_20_0;
                  stackIn_21_1 = stackOut_20_1;
                  break L5;
                } else {
                  stackOut_19_0 = (vc) (Object) stackIn_19_0;
                  stackOut_19_1 = 1;
                  stackIn_21_0 = stackOut_19_0;
                  stackIn_21_1 = stackOut_19_1;
                  break L5;
                }
              }
              L6: {
                ((vc) (Object) stackIn_21_0).c(stackIn_21_1 != 0);
                if (param2 == 0) {
                  break L6;
                } else {
                  var7.e(param2);
                  var7.a(dk.field_k >> 7, param4 * ((dd) this).field_W * ((dd) this).field_ob >> 12, param5);
                  break L6;
                }
              }
              L7: {
                ((dd) this).field_t[param0] = var7;
                if (((dd) this).field_n == null) {
                  break L7;
                } else {
                  var8 = (Object) (Object) ((dd) this).field_n;
                  synchronized (var8) {
                    L8: {
                      ((dd) this).field_n.a((gf) (Object) var7);
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

    private final void g() {
        int var1 = 0;
        int var2 = 0;
        ((dd) this).field_s = 0;
        ((dd) this).field_u = 0;
        ((dd) this).field_R = 0;
        ((dd) this).field_db = 0;
        ((dd) this).field_S = 0;
        ((dd) this).field_M = 0;
        ((dd) this).field_tb = ((dd) this).field_J.field_D;
        ((dd) this).field_pb = ((dd) this).field_J.field_i;
        ((dd) this).field_W = 64;
        var1 = 0;
        L0: while (true) {
          if (var1 >= ((dd) this).field_J.field_t) {
            ((dd) this).field_x = 0;
            ((dd) this).field_P = null;
            ((dd) this).field_jb = -1;
            ((dd) this).field_D = -1;
            ((dd) this).field_ub = 0;
            ((dd) this).field_lb = 0;
            ((dd) this).field_C = -1;
            ((dd) this).field_E = 0;
            var2 = 0;
            var1 = var2;
            L1: while (true) {
              if (var2 >= ((dd) this).field_J.field_t) {
                ((dd) this).field_u = 1;
                return;
              } else {
                ((dd) this).field_t[var2] = null;
                ((dd) this).field_V[var2] = false;
                var2++;
                continue L1;
              }
            }
          } else {
            ((dd) this).field_H[var1] = 0;
            ((dd) this).field_r[var1] = 0;
            ((dd) this).field_q[var1] = 0;
            ((dd) this).field_G[var1] = 0;
            ((dd) this).field_hb[var1] = 0;
            ((dd) this).field_sb[var1] = 0;
            ((dd) this).field_N[var1] = 0;
            ((dd) this).field_ib[var1] = 0;
            ((dd) this).field_z[var1] = 0;
            ((dd) this).field_v[var1] = 0;
            ((dd) this).field_eb[var1] = 0;
            ((dd) this).field_mb[var1] = 0;
            ((dd) this).field_ab[var1] = 0;
            ((dd) this).field_nb[var1] = 0;
            ((dd) this).field_B[var1] = 0;
            ((dd) this).field_bb[var1] = 0;
            ((dd) this).field_y[var1] = -1;
            ((dd) this).field_A[var1] = 0;
            ((dd) this).field_Y[var1] = 0;
            ((dd) this).field_qb[var1] = 0;
            ((dd) this).field_o[var1] = 0;
            ((dd) this).field_Q[var1] = 0;
            ((dd) this).field_T[var1] = 0;
            ((dd) this).field_K[var1] = 0;
            ((dd) this).field_kb[var1] = 0;
            ((dd) this).field_vb[var1] = 0;
            ((dd) this).field_fb[var1] = 0;
            ((dd) this).field_gb[var1] = 0;
            ((dd) this).field_O[var1] = 128;
            ((dd) this).field_I[var1] = 0;
            ((dd) this).field_Z[var1] = -1;
            var1++;
            continue L0;
          }
        }
    }

    private final boolean e() {
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
          if (((dd) this).field_u == 1) {
            break L0;
          } else {
            if (((dd) this).field_u == 2) {
              break L0;
            } else {
              ((dd) this).field_s = 0;
              return false;
            }
          }
        }
        L1: {
          var14 = 0;
          if (((dd) this).field_s != 0) {
            break L1;
          } else {
            L2: {
              if (((dd) this).field_u != 1) {
                break L2;
              } else {
                ((dd) this).field_u = 2;
                ((dd) this).field_S = 0;
                ((dd) this).field_db = 0;
                ((dd) this).field_M = ((dd) this).field_J.field_E[((dd) this).field_S];
                ((dd) this).field_R = 0;
                break L2;
              }
            }
            L3: {
              L4: {
                if (((dd) this).field_db >= ((dd) this).field_J.field_p[((dd) this).field_M]) {
                  break L4;
                } else {
                  if (((dd) this).field_E == 1) {
                    break L4;
                  } else {
                    L5: {
                      if (((dd) this).field_ub == 0) {
                        break L5;
                      } else {
                        if (((dd) this).field_db % ((dd) this).field_ub == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    if (((dd) this).field_x <= 0) {
                      break L3;
                    } else {
                      if (((dd) this).field_db % ((dd) this).field_x != 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
              }
              L6: {
                if (((dd) this).field_ub == 0) {
                  ((dd) this).field_S = ((dd) this).field_S + 1;
                  break L6;
                } else {
                  L7: {
                    if (((dd) this).field_lb > ((dd) this).field_S) {
                      break L7;
                    } else {
                      var14 = 1;
                      break L7;
                    }
                  }
                  ((dd) this).field_S = ((dd) this).field_lb;
                  break L6;
                }
              }
              L8: {
                if (((dd) this).field_C == -1) {
                  break L8;
                } else {
                  ((dd) this).field_S = ((dd) this).field_C;
                  ((dd) this).field_C = -1;
                  break L8;
                }
              }
              L9: {
                if (((dd) this).field_S < ((dd) this).field_J.field_B) {
                  break L9;
                } else {
                  ((dd) this).field_S = 0;
                  var14 = 1;
                  break L9;
                }
              }
              L10: {
                ((dd) this).field_db = 0;
                if (((dd) this).field_E != 1) {
                  break L10;
                } else {
                  L11: {
                    ((dd) this).field_lb = ((dd) this).field_lb / 16 * 10 + ((dd) this).field_lb % 16;
                    if (((dd) this).field_lb < ((dd) this).field_J.field_p[((dd) this).field_M]) {
                      break L11;
                    } else {
                      ((dd) this).field_lb = 0;
                      break L11;
                    }
                  }
                  ((dd) this).field_db = ((dd) this).field_lb;
                  break L10;
                }
              }
              L12: {
                if (((dd) this).field_jb < 0) {
                  break L12;
                } else {
                  L13: {
                    if (((dd) this).field_x >= 0) {
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
                    var15 = ((dd) this).field_jb;
                    var16 = ((dd) this).field_D;
                    if (((dd) this).field_P == null) {
                      break L14;
                    } else {
                      var17 = 0;
                      L15: while (true) {
                        if (var17 >= ((dd) this).field_J.field_t) {
                          ((dd) this).field_J = ((dd) this).field_P;
                          this.f();
                          ((dd) this).field_u = 2;
                          break L14;
                        } else {
                          this.c(var17);
                          var17++;
                          continue L15;
                        }
                      }
                    }
                  }
                  ((dd) this).field_S = var15;
                  ((dd) this).field_db = var16;
                  var14 = 0;
                  ((dd) this).field_x = 0;
                  ((dd) this).field_jb = -1;
                  ((dd) this).field_D = -1;
                  ((dd) this).field_P = null;
                  break L12;
                }
              }
              ((dd) this).field_M = ((dd) this).field_J.field_E[((dd) this).field_S];
              ((dd) this).field_R = 0;
              var10 = 0;
              L16: while (true) {
                if (var10 >= ((dd) this).field_db) {
                  ((dd) this).field_C = -1;
                  ((dd) this).field_E = 0;
                  ((dd) this).field_ub = 0;
                  break L3;
                } else {
                  var15 = 0;
                  L17: while (true) {
                    if (var15 >= ((dd) this).field_J.field_t) {
                      var10++;
                      continue L16;
                    } else {
                      L18: {
                        var16 = ((dd) this).field_J.field_l[((dd) this).field_M][((dd) this).field_R] & 255;
                        ((dd) this).field_R = ((dd) this).field_R + 1;
                        if (var16 >= 128) {
                          var16 -= 128;
                          break L18;
                        } else {
                          ((dd) this).field_R = ((dd) this).field_R - 1;
                          var16 = 31;
                          break L18;
                        }
                      }
                      L19: {
                        if ((var16 & 1) != 1) {
                          break L19;
                        } else {
                          ((dd) this).field_R = ((dd) this).field_R + 1;
                          break L19;
                        }
                      }
                      L20: {
                        if ((var16 & 2) != 2) {
                          break L20;
                        } else {
                          ((dd) this).field_R = ((dd) this).field_R + 1;
                          break L20;
                        }
                      }
                      L21: {
                        if ((var16 & 4) != 4) {
                          break L21;
                        } else {
                          ((dd) this).field_R = ((dd) this).field_R + 1;
                          break L21;
                        }
                      }
                      L22: {
                        if ((var16 & 8) != 8) {
                          break L22;
                        } else {
                          ((dd) this).field_R = ((dd) this).field_R + 1;
                          break L22;
                        }
                      }
                      if ((var16 & 16) == 16) {
                        ((dd) this).field_R = ((dd) this).field_R + 1;
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
            ((dd) this).field_db = ((dd) this).field_db + 1;
            break L1;
          }
        }
        var15 = 0;
        L23: while (true) {
          if (var15 >= ((dd) this).field_J.field_t) {
            L24: {
              if (((dd) this).field_s <= 0) {
                break L24;
              } else {
                var15 = 0;
                L25: while (true) {
                  if (var15 >= ((dd) this).field_J.field_t) {
                    break L24;
                  } else {
                    if (!((dd) this).field_V[var15]) {
                      L26: {
                        if (((dd) this).field_K[var15] == 0) {
                          break L26;
                        } else {
                          ((dd) this).field_W = ((dd) this).field_W + ((dd) this).field_p[var15];
                          if (((dd) this).field_W >= 0) {
                            if (((dd) this).field_W <= 64) {
                              break L26;
                            } else {
                              ((dd) this).field_W = 64;
                              break L26;
                            }
                          } else {
                            ((dd) this).field_W = 0;
                            break L26;
                          }
                        }
                      }
                      L27: {
                        L28: {
                          if (((dd) this).field_kb[var15] != 0) {
                            break L28;
                          } else {
                            if (((dd) this).field_vb[var15] == 0) {
                              break L27;
                            } else {
                              break L28;
                            }
                          }
                        }
                        L29: {
                          ((dd) this).field_gb[var15] = ((dd) this).field_gb[var15] + ((dd) this).field_H[var15];
                          if (((dd) this).field_gb[var15] >= 0) {
                            if (((dd) this).field_gb[var15] <= 64) {
                              break L29;
                            } else {
                              ((dd) this).field_gb[var15] = 64;
                              break L29;
                            }
                          } else {
                            ((dd) this).field_gb[var15] = 0;
                            break L29;
                          }
                        }
                        ((dd) this).field_O[var15] = ((dd) this).field_O[var15] + ((dd) this).field_r[var15];
                        if (((dd) this).field_O[var15] >= 0) {
                          if (((dd) this).field_O[var15] <= 255) {
                            break L27;
                          } else {
                            ((dd) this).field_O[var15] = 255;
                            break L27;
                          }
                        } else {
                          ((dd) this).field_O[var15] = 0;
                          break L27;
                        }
                      }
                      L30: {
                        if (((dd) this).field_sb[var15] != 1) {
                          break L30;
                        } else {
                          ((dd) this).field_hb[var15] = (((dd) this).field_hb[var15] + ((dd) this).field_q[var15]) % 68;
                          var2 = field_cb[((dd) this).field_hb[var15]] * ((dd) this).field_G[var15] >> 8;
                          var16 = ((dd) this).field_I[var15] + var2;
                          this.a(var15, field_rb[var16]);
                          break L30;
                        }
                      }
                      L31: {
                        if (((dd) this).field_ab[var15] <= 0) {
                          break L31;
                        } else {
                          L32: {
                            ((dd) this).field_I[var15] = ((dd) this).field_I[var15] - ((dd) this).field_ab[var15] * 4;
                            if (((dd) this).field_I[var15] >= 0) {
                              if (((dd) this).field_I[var15] <= 7999) {
                                break L32;
                              } else {
                                ((dd) this).field_I[var15] = 7999;
                                break L32;
                              }
                            } else {
                              ((dd) this).field_I[var15] = 0;
                              break L32;
                            }
                          }
                          var16 = field_rb[((dd) this).field_I[var15]];
                          this.a(var15, var16);
                          break L31;
                        }
                      }
                      L33: {
                        if (((dd) this).field_nb[var15] <= 0) {
                          break L33;
                        } else {
                          L34: {
                            ((dd) this).field_I[var15] = ((dd) this).field_I[var15] + ((dd) this).field_nb[var15] * 4;
                            if (((dd) this).field_I[var15] >= 0) {
                              if (((dd) this).field_I[var15] <= 7999) {
                                break L34;
                              } else {
                                ((dd) this).field_I[var15] = 7999;
                                break L34;
                              }
                            } else {
                              ((dd) this).field_I[var15] = 0;
                              break L34;
                            }
                          }
                          var16 = field_rb[((dd) this).field_I[var15]];
                          this.a(var15, var16);
                          break L33;
                        }
                      }
                      if (((dd) this).field_T[var15] > 0) {
                        L35: {
                          if (((dd) this).field_I[var15] >= ((dd) this).field_B[var15]) {
                            break L35;
                          } else {
                            ((dd) this).field_I[var15] = ((dd) this).field_I[var15] + ((dd) this).field_bb[var15] * 4;
                            if (((dd) this).field_I[var15] <= ((dd) this).field_B[var15]) {
                              break L35;
                            } else {
                              ((dd) this).field_I[var15] = ((dd) this).field_B[var15];
                              break L35;
                            }
                          }
                        }
                        L36: {
                          if (((dd) this).field_I[var15] <= ((dd) this).field_B[var15]) {
                            break L36;
                          } else {
                            ((dd) this).field_I[var15] = ((dd) this).field_I[var15] - ((dd) this).field_bb[var15] * 4;
                            if (((dd) this).field_I[var15] >= ((dd) this).field_B[var15]) {
                              break L36;
                            } else {
                              ((dd) this).field_I[var15] = ((dd) this).field_B[var15];
                              break L36;
                            }
                          }
                        }
                        L37: {
                          if (((dd) this).field_I[var15] >= 0) {
                            if (((dd) this).field_I[var15] <= 7999) {
                              break L37;
                            } else {
                              ((dd) this).field_I[var15] = 7999;
                              break L37;
                            }
                          } else {
                            ((dd) this).field_I[var15] = 0;
                            break L37;
                          }
                        }
                        var16 = field_rb[((dd) this).field_I[var15]];
                        this.a(var15, var16);
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
              if (var15 >= ((dd) this).field_J.field_t) {
                L39: {
                  ((dd) this).field_s = ((dd) this).field_s + 1;
                  if (((dd) this).field_s < ((dd) this).field_tb) {
                    break L39;
                  } else {
                    ((dd) this).field_s = 0;
                    break L39;
                  }
                }
                return var14 != 0;
              } else {
                if (!((dd) this).field_V[var15]) {
                  L40: {
                    var16 = ((dd) this).field_gb[var15];
                    var17 = ((dd) this).field_O[var15];
                    ((dd) this).field_qb[var15] = 0;
                    if (((dd) this).field_Z[var15] < 0) {
                      break L40;
                    } else {
                      L41: {
                        var3 = ((dd) this).field_Z[var15];
                        if ((((dd) this).field_J.field_H[((dd) this).field_Z[var15]] & 1) != 1) {
                          break L41;
                        } else {
                          ((dd) this).field_qb[var15] = 1;
                          var4 = ((dd) this).field_A[var15];
                          var5 = 0;
                          L42: while (true) {
                            if (((dd) this).field_J.field_f[var3][var5 + 1] >= var4) {
                              L43: {
                                var6 = ((dd) this).field_J.field_f[var3][var5];
                                var8 = ((dd) this).field_J.field_f[var3][var5 + 1];
                                var7 = ((dd) this).field_J.field_b[var3][var5];
                                var9 = ((dd) this).field_J.field_b[var3][var5 + 1];
                                if (var8 != var6) {
                                  break L43;
                                } else {
                                  var8++;
                                  break L43;
                                }
                              }
                              L44: {
                                var11 = ((var8 - var4) * var7 + (var4 - var6) * var9) / (var8 - var6);
                                var12 = 32768 - ((dd) this).field_Q[var15];
                                if (var12 >= 0) {
                                  break L44;
                                } else {
                                  var12 = 0;
                                  break L44;
                                }
                              }
                              L45: {
                                var16 = var16 * var11 * var12 >> 21;
                                if ((((dd) this).field_J.field_H[var3] & 2) != 2) {
                                  break L45;
                                } else {
                                  if (((dd) this).field_o[var15] != 1) {
                                    break L45;
                                  } else {
                                    if (((dd) this).field_A[var15] != ((dd) this).field_J.field_f[var3][((dd) this).field_J.field_g[var3]]) {
                                      break L45;
                                    } else {
                                      ((dd) this).field_A[var15] = ((dd) this).field_A[var15] - 1;
                                      break L45;
                                    }
                                  }
                                }
                              }
                              L46: {
                                if (((dd) this).field_A[var15] != ((dd) this).field_J.field_f[var3][((dd) this).field_J.field_f[var3].length - 1]) {
                                  break L46;
                                } else {
                                  ((dd) this).field_A[var15] = ((dd) this).field_A[var15] - 1;
                                  break L46;
                                }
                              }
                              L47: {
                                if (((dd) this).field_o[var15] != 0) {
                                  break L47;
                                } else {
                                  ((dd) this).field_Q[var15] = ((dd) this).field_Q[var15] + ((dd) this).field_J.field_w[var3];
                                  break L47;
                                }
                              }
                              ((dd) this).field_A[var15] = ((dd) this).field_A[var15] + 1;
                              if ((((dd) this).field_J.field_H[var3] & 4) != 4) {
                                break L41;
                              } else {
                                if (((dd) this).field_A[var15] != ((dd) this).field_J.field_f[var3][((dd) this).field_J.field_z[var3]]) {
                                  break L41;
                                } else {
                                  ((dd) this).field_A[var15] = ((dd) this).field_J.field_f[var3][((dd) this).field_J.field_n[var3]];
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
                      if ((((dd) this).field_J.field_k[((dd) this).field_Z[var15]] & 1) != 1) {
                        break L40;
                      } else {
                        var4 = ((dd) this).field_Y[var15];
                        var5 = 0;
                        L48: while (true) {
                          if (((dd) this).field_J.field_o[var3][var5 + 1] >= var4) {
                            L49: {
                              var6 = ((dd) this).field_J.field_o[var3][var5];
                              var8 = ((dd) this).field_J.field_o[var3][var5 + 1];
                              var7 = ((dd) this).field_J.field_a[var3][var5];
                              var9 = ((dd) this).field_J.field_a[var3][var5 + 1];
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
                              if ((((dd) this).field_J.field_k[var3] & 2) != 2) {
                                break L50;
                              } else {
                                if (((dd) this).field_o[var15] != 1) {
                                  break L50;
                                } else {
                                  if (((dd) this).field_Y[var15] != ((dd) this).field_J.field_o[var3][((dd) this).field_J.field_r[var3]]) {
                                    break L50;
                                  } else {
                                    ((dd) this).field_Y[var15] = ((dd) this).field_Y[var15] - 1;
                                    break L50;
                                  }
                                }
                              }
                            }
                            L51: {
                              if (((dd) this).field_Y[var15] != ((dd) this).field_J.field_o[var3][((dd) this).field_J.field_o[var3].length - 1]) {
                                break L51;
                              } else {
                                ((dd) this).field_Y[var15] = ((dd) this).field_Y[var15] - 1;
                                break L51;
                              }
                            }
                            ((dd) this).field_Y[var15] = ((dd) this).field_Y[var15] + 1;
                            if ((((dd) this).field_J.field_k[var3] & 4) != 4) {
                              break L40;
                            } else {
                              if (((dd) this).field_Y[var15] != ((dd) this).field_J.field_o[var3][((dd) this).field_J.field_d[var3]]) {
                                break L40;
                              } else {
                                ((dd) this).field_Y[var15] = ((dd) this).field_J.field_o[var3][((dd) this).field_J.field_J[var3]];
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
              if (((dd) this).field_s != 0) {
                if (((dd) this).field_y[var15] >= 0) {
                  var16 = ((dd) this).field_y[var15];
                  break L52;
                } else {
                  var15++;
                  continue L23;
                }
              } else {
                var16 = ((dd) this).field_R;
                break L52;
              }
            }
            L53: {
              ((dd) this).field_y[var15] = -1;
              var17 = var16;
              var18 = -1;
              var19 = -1;
              var20 = -1;
              var21 = -1;
              var22 = -1;
              var23 = 0;
              var24 = ((dd) this).field_J.field_l[((dd) this).field_M][var16] & 255;
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
                var18 = ((dd) this).field_J.field_l[((dd) this).field_M][var16] & 255;
                var16++;
                break L54;
              }
            }
            L55: {
              if ((var24 & 2) != 2) {
                break L55;
              } else {
                var19 = (((dd) this).field_J.field_l[((dd) this).field_M][var16] & 255) - 1;
                var16++;
                break L55;
              }
            }
            L56: {
              if ((var24 & 4) != 4) {
                break L56;
              } else {
                var20 = (((dd) this).field_J.field_l[((dd) this).field_M][var16] & 255) - 16;
                var16++;
                break L56;
              }
            }
            L57: {
              if ((var24 & 8) != 8) {
                break L57;
              } else {
                var22 = ((dd) this).field_J.field_l[((dd) this).field_M][var16] & 255;
                var16++;
                break L57;
              }
            }
            L58: {
              if ((var24 & 16) != 16) {
                break L58;
              } else {
                var23 = ((dd) this).field_J.field_l[((dd) this).field_M][var16] & 255;
                var16++;
                break L58;
              }
            }
            L59: {
              if (((dd) this).field_s != 0) {
                break L59;
              } else {
                ((dd) this).field_R = var16;
                break L59;
              }
            }
            if (!((dd) this).field_V[var15]) {
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
                    if (((dd) this).field_s != var23) {
                      ((dd) this).field_y[var15] = var17;
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
                  if (((dd) this).field_s >= var23) {
                    break L62;
                  } else {
                    ((dd) this).field_y[var15] = var17;
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
                    ((dd) this).field_kb[var15] = 2;
                    ((dd) this).field_H[var15] = 80 - var20;
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
                    ((dd) this).field_kb[var15] = 2;
                    ((dd) this).field_H[var15] = var20 - 96;
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
                    var20 = ((dd) this).field_gb[var15] - (var20 - 112);
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
                    var20 = ((dd) this).field_gb[var15] + (var20 - 128);
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
                    ((dd) this).field_vb[var15] = 2;
                    ((dd) this).field_r[var15] = 192 - var20;
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
                    ((dd) this).field_vb[var15] = 2;
                    ((dd) this).field_r[var15] = var20 - 208;
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
                  if (((dd) this).field_ub > 1) {
                    ((dd) this).field_ub = 1;
                    break L71;
                  } else {
                    ((dd) this).field_E = 1;
                    ((dd) this).field_lb = var23;
                    break L71;
                  }
                }
              }
              L72: {
                if (var22 != 15) {
                  break L72;
                } else {
                  if (var23 >= 32) {
                    ((dd) this).field_pb = var23;
                    break L72;
                  } else {
                    ((dd) this).field_tb = var23;
                    break L72;
                  }
                }
              }
              L73: {
                if (var22 != 16) {
                  break L73;
                } else {
                  ((dd) this).field_W = var23;
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
                  if (var22 != 11) {
                    break L75;
                  } else {
                    if (((dd) this).field_ub > 1) {
                      break L75;
                    } else {
                      ((dd) this).field_ub = 1;
                      ((dd) this).field_lb = var23;
                      break L75;
                    }
                  }
                } else {
                  if (var22 != 11) {
                    break L75;
                  } else {
                    if (((dd) this).field_ub > 1) {
                      break L75;
                    } else {
                      ((dd) this).field_ub = 1;
                      ((dd) this).field_lb = var23;
                      break L75;
                    }
                  }
                }
              }
              L76: {
                if (var22 != 20) {
                  break L76;
                } else {
                  var18 = 97;
                  break L76;
                }
              }
              L77: {
                if (var22 == 21) {
                  L78: {
                    ((dd) this).field_A[var15] = var23;
                    if (((dd) this).field_A[var15] < ((dd) this).field_J.field_f[var3][((dd) this).field_J.field_f[var3].length - 1]) {
                      break L78;
                    } else {
                      ((dd) this).field_A[var15] = ((dd) this).field_J.field_f[var3][((dd) this).field_J.field_f[var3].length - 1] - 1;
                      break L78;
                    }
                  }
                  ((dd) this).field_Y[var15] = var23;
                  if (((dd) this).field_Y[var15] >= ((dd) this).field_J.field_o[var3][((dd) this).field_J.field_o[var3].length - 1]) {
                    ((dd) this).field_Y[var15] = ((dd) this).field_J.field_o[var3][((dd) this).field_J.field_o[var3].length - 1] - 1;
                    if (var19 < 0) {
                      break L77;
                    } else {
                      if (var18 > 96) {
                        break L77;
                      } else {
                        ((dd) this).field_A[var15] = 0;
                        ((dd) this).field_Y[var15] = 0;
                        ((dd) this).field_o[var15] = 1;
                        ((dd) this).field_Q[var15] = 0;
                        break L77;
                      }
                    }
                  } else {
                    if (var19 < 0) {
                      break L77;
                    } else {
                      if (var18 > 96) {
                        break L77;
                      } else {
                        ((dd) this).field_A[var15] = 0;
                        ((dd) this).field_Y[var15] = 0;
                        ((dd) this).field_o[var15] = 1;
                        ((dd) this).field_Q[var15] = 0;
                        break L77;
                      }
                    }
                  }
                } else {
                  if (var19 < 0) {
                    break L77;
                  } else {
                    if (var18 > 96) {
                      break L77;
                    } else {
                      ((dd) this).field_A[var15] = 0;
                      ((dd) this).field_Y[var15] = 0;
                      ((dd) this).field_o[var15] = 1;
                      ((dd) this).field_Q[var15] = 0;
                      break L77;
                    }
                  }
                }
              }
              L79: {
                if (var22 != 3) {
                  break L79;
                } else {
                  if (var20 >= 0) {
                    break L79;
                  } else {
                    if (var19 == -1) {
                      break L79;
                    } else {
                      var20 = ((dd) this).field_J.field_I[((dd) this).field_fb[var15]];
                      break L79;
                    }
                  }
                }
              }
              L80: {
                if (var22 != 3) {
                  break L80;
                } else {
                  if (var21 >= 0) {
                    break L80;
                  } else {
                    if (var19 == -1) {
                      break L80;
                    } else {
                      var21 = ((dd) this).field_J.field_F[((dd) this).field_fb[var15]];
                      break L80;
                    }
                  }
                }
              }
              L81: {
                L82: {
                  if (var18 < 0) {
                    break L82;
                  } else {
                    if (var18 > 96) {
                      break L82;
                    } else {
                      if (var22 == 3) {
                        break L82;
                      } else {
                        L83: {
                          if (var19 != -1) {
                            break L83;
                          } else {
                            if (var20 >= 0) {
                              break L83;
                            } else {
                              var20 = ((dd) this).field_gb[var15];
                              break L83;
                            }
                          }
                        }
                        L84: {
                          if (var19 != -1) {
                            break L84;
                          } else {
                            if (var21 >= 0) {
                              break L84;
                            } else {
                              var21 = ((dd) this).field_O[var15];
                              break L84;
                            }
                          }
                        }
                        L85: {
                          if (var19 != -1) {
                            ((dd) this).field_Z[var15] = var19;
                            if (var18 >= 96) {
                              var19 = ((dd) this).field_J.field_A[var19][95];
                              break L85;
                            } else {
                              var19 = ((dd) this).field_J.field_A[var19][var18];
                              break L85;
                            }
                          } else {
                            var19 = ((dd) this).field_fb[var15];
                            break L85;
                          }
                        }
                        L86: {
                          if (var20 >= 0) {
                            break L86;
                          } else {
                            var20 = ((dd) this).field_J.field_I[var19];
                            break L86;
                          }
                        }
                        L87: {
                          if (var21 >= 0) {
                            break L87;
                          } else {
                            var21 = ((dd) this).field_J.field_F[var19];
                            break L87;
                          }
                        }
                        L88: {
                          var25 = 7680 - (var18 + ((dd) this).field_J.field_K[var19]) * 64 - ((dd) this).field_J.field_c[var19] / 2;
                          if (var25 >= 0) {
                            if (var25 <= 7999) {
                              break L88;
                            } else {
                              var25 = 7999;
                              break L88;
                            }
                          } else {
                            var25 = 0;
                            break L88;
                          }
                        }
                        L89: {
                          ((dd) this).field_B[var15] = var25;
                          var26 = field_rb[var25];
                          ((dd) this).field_fb[var15] = var19;
                          ((dd) this).field_gb[var15] = var20;
                          ((dd) this).field_O[var15] = var21;
                          ((dd) this).field_I[var15] = var25;
                          var1 = 0;
                          if (var22 != 9) {
                            break L89;
                          } else {
                            if (var23 * 256 <= ((dd) this).field_J.field_s[var19]) {
                              var1 = var23 * 256;
                              break L89;
                            } else {
                              var1 = ((dd) this).field_J.field_s[var19];
                              break L89;
                            }
                          }
                        }
                        this.a(var15, var19, var1, var26, var20, var21);
                        ((dd) this).field_hb[var15] = 0;
                        break L81;
                      }
                    }
                  }
                }
                if (var18 <= 96) {
                  L90: {
                    if (var20 >= 0) {
                      break L90;
                    } else {
                      if (var21 < 0) {
                        break L81;
                      } else {
                        break L90;
                      }
                    }
                  }
                  L91: {
                    if (var20 < 0) {
                      break L91;
                    } else {
                      ((dd) this).field_gb[var15] = var20;
                      break L91;
                    }
                  }
                  if (var21 < 0) {
                    break L81;
                  } else {
                    ((dd) this).field_O[var15] = var21;
                    break L81;
                  }
                } else {
                  if (((dd) this).field_qb[var15] != 1) {
                    this.c(var15);
                    break L81;
                  } else {
                    ((dd) this).field_o[var15] = 0;
                    break L81;
                  }
                }
              }
              L92: {
                if (var22 != 3) {
                  if (var22 == 5) {
                    break L92;
                  } else {
                    ((dd) this).field_T[var15] = 0;
                    break L92;
                  }
                } else {
                  L93: {
                    ((dd) this).field_T[var15] = 1;
                    if (var18 < 0) {
                      break L93;
                    } else {
                      if (var18 > 96) {
                        break L93;
                      } else {
                        L94: {
                          var19 = ((dd) this).field_fb[var15];
                          var25 = 7680 - (var18 + ((dd) this).field_J.field_K[var19]) * 64 - ((dd) this).field_J.field_c[var19] / 2;
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
                        ((dd) this).field_B[var15] = var25;
                        break L93;
                      }
                    }
                  }
                  if (var23 == 0) {
                    break L92;
                  } else {
                    ((dd) this).field_bb[var15] = var23;
                    if (((dd) this).field_J.field_q != 0) {
                      break L92;
                    } else {
                      ((dd) this).field_bb[var15] = ((dd) this).field_bb[var15] * 2;
                      break L92;
                    }
                  }
                }
              }
              L95: {
                if (var22 != 4) {
                  if (var22 == 6) {
                    break L95;
                  } else {
                    L96: {
                      if (((dd) this).field_sb[var15] == 0) {
                        break L96;
                      } else {
                        var25 = field_rb[((dd) this).field_I[var15]];
                        this.a(var15, var25);
                        break L96;
                      }
                    }
                    ((dd) this).field_hb[var15] = 0;
                    ((dd) this).field_sb[var15] = 0;
                    break L95;
                  }
                } else {
                  L97: {
                    ((dd) this).field_sb[var15] = 1;
                    if (var23 / 16 <= 0) {
                      break L97;
                    } else {
                      ((dd) this).field_q[var15] = var23 / 16;
                      break L97;
                    }
                  }
                  if ((var23 & 15) <= 0) {
                    break L95;
                  } else {
                    ((dd) this).field_G[var15] = var23 & 15;
                    break L95;
                  }
                }
              }
              L98: {
                if (var22 != 17) {
                  ((dd) this).field_K[var15] = 0;
                  break L98;
                } else {
                  ((dd) this).field_K[var15] = 1;
                  if (var23 == 0) {
                    break L98;
                  } else {
                    ((dd) this).field_p[var15] = (var23 & 240) / 16 - (var23 & 15);
                    break L98;
                  }
                }
              }
              L99: {
                L100: {
                  if (var22 == 10) {
                    break L100;
                  } else {
                    if (var22 == 6) {
                      break L100;
                    } else {
                      if (var22 != 5) {
                        if (((dd) this).field_kb[var15] != 2) {
                          ((dd) this).field_kb[var15] = 0;
                          break L99;
                        } else {
                          ((dd) this).field_kb[var15] = 1;
                          break L99;
                        }
                      } else {
                        break L100;
                      }
                    }
                  }
                }
                ((dd) this).field_kb[var15] = 1;
                if (var23 == 0) {
                  break L99;
                } else {
                  ((dd) this).field_H[var15] = (var23 & 240) / 16 - (var23 & 15);
                  break L99;
                }
              }
              L101: {
                if (var22 != 25) {
                  if (((dd) this).field_vb[var15] != 2) {
                    ((dd) this).field_vb[var15] = 0;
                    break L101;
                  } else {
                    ((dd) this).field_vb[var15] = 1;
                    break L101;
                  }
                } else {
                  ((dd) this).field_vb[var15] = 1;
                  if (var23 == 0) {
                    break L101;
                  } else {
                    ((dd) this).field_r[var15] = (var23 & 240) / 16 - (var23 & 15);
                    break L101;
                  }
                }
              }
              L102: {
                if (var22 != 234) {
                  break L102;
                } else {
                  L103: {
                    if (var23 != 0) {
                      ((dd) this).field_N[var15] = var23;
                      break L103;
                    } else {
                      var23 = ((dd) this).field_N[var15];
                      break L103;
                    }
                  }
                  ((dd) this).field_gb[var15] = ((dd) this).field_gb[var15] + var23;
                  if (((dd) this).field_gb[var15] >= 0) {
                    if (((dd) this).field_gb[var15] <= 64) {
                      break L102;
                    } else {
                      ((dd) this).field_gb[var15] = 64;
                      break L102;
                    }
                  } else {
                    ((dd) this).field_gb[var15] = 0;
                    break L102;
                  }
                }
              }
              L104: {
                if (var22 != 235) {
                  break L104;
                } else {
                  L105: {
                    if (var23 != 0) {
                      ((dd) this).field_v[var15] = var23;
                      break L105;
                    } else {
                      var23 = ((dd) this).field_v[var15];
                      break L105;
                    }
                  }
                  ((dd) this).field_gb[var15] = ((dd) this).field_gb[var15] - var23;
                  if (((dd) this).field_gb[var15] >= 0) {
                    if (((dd) this).field_gb[var15] <= 64) {
                      break L104;
                    } else {
                      ((dd) this).field_gb[var15] = 64;
                      break L104;
                    }
                  } else {
                    ((dd) this).field_gb[var15] = 0;
                    break L104;
                  }
                }
              }
              L106: {
                if (var22 != 1) {
                  ((dd) this).field_ab[var15] = 0;
                  break L106;
                } else {
                  if (var23 == 0) {
                    break L106;
                  } else {
                    ((dd) this).field_ab[var15] = var23;
                    break L106;
                  }
                }
              }
              L107: {
                if (var22 != 2) {
                  ((dd) this).field_nb[var15] = 0;
                  break L107;
                } else {
                  if (var23 == 0) {
                    break L107;
                  } else {
                    ((dd) this).field_nb[var15] = var23;
                    break L107;
                  }
                }
              }
              L108: {
                if (var22 != 225) {
                  break L108;
                } else {
                  L109: {
                    if (var23 != 0) {
                      ((dd) this).field_ib[var15] = var23;
                      break L109;
                    } else {
                      var23 = ((dd) this).field_ib[var15];
                      break L109;
                    }
                  }
                  L110: {
                    ((dd) this).field_I[var15] = ((dd) this).field_I[var15] - var23 * 4;
                    if (((dd) this).field_I[var15] >= 0) {
                      if (((dd) this).field_I[var15] <= 7999) {
                        break L110;
                      } else {
                        ((dd) this).field_I[var15] = 7999;
                        break L110;
                      }
                    } else {
                      ((dd) this).field_I[var15] = 0;
                      break L110;
                    }
                  }
                  var25 = field_rb[((dd) this).field_I[var15]];
                  this.a(var15, var25);
                  break L108;
                }
              }
              L111: {
                if (var22 != 226) {
                  break L111;
                } else {
                  L112: {
                    if (var23 != 0) {
                      ((dd) this).field_eb[var15] = var23;
                      break L112;
                    } else {
                      var23 = ((dd) this).field_eb[var15];
                      break L112;
                    }
                  }
                  L113: {
                    ((dd) this).field_I[var15] = ((dd) this).field_I[var15] + var23 * 4;
                    if (((dd) this).field_I[var15] >= 0) {
                      if (((dd) this).field_I[var15] <= 7999) {
                        break L113;
                      } else {
                        ((dd) this).field_I[var15] = 7999;
                        break L113;
                      }
                    } else {
                      ((dd) this).field_I[var15] = 0;
                      break L113;
                    }
                  }
                  var25 = field_rb[((dd) this).field_I[var15]];
                  this.a(var15, var25);
                  break L111;
                }
              }
              if (var22 == 33) {
                if (var23 / 16 != 1) {
                  L114: {
                    var23 = var23 & 15;
                    if (var23 != 0) {
                      ((dd) this).field_mb[var15] = var23;
                      break L114;
                    } else {
                      var23 = ((dd) this).field_mb[var15];
                      break L114;
                    }
                  }
                  L115: {
                    ((dd) this).field_I[var15] = ((dd) this).field_I[var15] + var23;
                    if (((dd) this).field_I[var15] >= 0) {
                      if (((dd) this).field_I[var15] <= 7999) {
                        break L115;
                      } else {
                        ((dd) this).field_I[var15] = 7999;
                        break L115;
                      }
                    } else {
                      ((dd) this).field_I[var15] = 0;
                      break L115;
                    }
                  }
                  var25 = field_rb[((dd) this).field_I[var15]];
                  this.a(var15, var25);
                  var15++;
                  continue L23;
                } else {
                  L116: {
                    var23 = var23 & 15;
                    if (var23 != 0) {
                      ((dd) this).field_z[var15] = var23;
                      break L116;
                    } else {
                      var23 = ((dd) this).field_z[var15];
                      break L116;
                    }
                  }
                  L117: {
                    ((dd) this).field_I[var15] = ((dd) this).field_I[var15] - var23;
                    if (((dd) this).field_I[var15] >= 0) {
                      if (((dd) this).field_I[var15] <= 7999) {
                        break L117;
                      } else {
                        ((dd) this).field_I[var15] = 7999;
                        break L117;
                      }
                    } else {
                      ((dd) this).field_I[var15] = 0;
                      break L117;
                    }
                  }
                  var25 = field_rb[((dd) this).field_I[var15]];
                  this.a(var15, var25);
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

    final synchronized void b(int param0, int param1) {
        ((dd) this).field_x = param1;
        ((dd) this).field_jb = param0;
        ((dd) this).field_D = 0;
    }

    private final void f() {
        ((dd) this).field_gb = new int[((dd) this).field_J.field_t];
        ((dd) this).field_O = new int[((dd) this).field_J.field_t];
        ((dd) this).field_I = new int[((dd) this).field_J.field_t];
        ((dd) this).field_fb = new int[((dd) this).field_J.field_t];
        ((dd) this).field_Z = new int[((dd) this).field_J.field_t];
        ((dd) this).field_p = new int[((dd) this).field_J.field_t];
        ((dd) this).field_H = new int[((dd) this).field_J.field_t];
        ((dd) this).field_r = new int[((dd) this).field_J.field_t];
        ((dd) this).field_q = new int[((dd) this).field_J.field_t];
        ((dd) this).field_G = new int[((dd) this).field_J.field_t];
        ((dd) this).field_hb = new int[((dd) this).field_J.field_t];
        ((dd) this).field_sb = new int[((dd) this).field_J.field_t];
        ((dd) this).field_N = new int[((dd) this).field_J.field_t];
        ((dd) this).field_ib = new int[((dd) this).field_J.field_t];
        ((dd) this).field_z = new int[((dd) this).field_J.field_t];
        ((dd) this).field_v = new int[((dd) this).field_J.field_t];
        ((dd) this).field_eb = new int[((dd) this).field_J.field_t];
        ((dd) this).field_mb = new int[((dd) this).field_J.field_t];
        ((dd) this).field_ab = new int[((dd) this).field_J.field_t];
        ((dd) this).field_nb = new int[((dd) this).field_J.field_t];
        ((dd) this).field_B = new int[((dd) this).field_J.field_t];
        ((dd) this).field_bb = new int[((dd) this).field_J.field_t];
        ((dd) this).field_y = new int[((dd) this).field_J.field_t];
        ((dd) this).field_A = new int[((dd) this).field_J.field_t];
        ((dd) this).field_Y = new int[((dd) this).field_J.field_t];
        ((dd) this).field_qb = new int[((dd) this).field_J.field_t];
        ((dd) this).field_o = new int[((dd) this).field_J.field_t];
        ((dd) this).field_Q = new int[((dd) this).field_J.field_t];
        ((dd) this).field_T = new int[((dd) this).field_J.field_t];
        ((dd) this).field_kb = new int[((dd) this).field_J.field_t];
        ((dd) this).field_vb = new int[((dd) this).field_J.field_t];
        ((dd) this).field_K = new int[((dd) this).field_J.field_t];
        ((dd) this).field_V = new boolean[((dd) this).field_J.field_t];
        ((dd) this).field_t = new vc[((dd) this).field_J.field_t];
        this.g();
    }

    private final void a(int param0, int param1) {
        if (((dd) this).field_t[param0] != null) {
            ((dd) this).field_t[param0].d(param1 * 256 / dk.field_k);
        }
    }

    final void d() {
        if (((dd) this).field_n != null) {
            throw new RuntimeException();
        }
        this.g();
    }

    final synchronized void b(int param0) {
        ((dd) this).field_ob = param0;
    }

    public static void c() {
        field_rb = null;
        field_cb = null;
    }

    final void b() {
        int var1 = 0;
        var1 = 0;
        L0: while (true) {
          if (var1 >= ((dd) this).field_J.field_t) {
            return;
          } else {
            if (((dd) this).field_t[var1] != null) {
              ((dd) this).field_n.a((gf) (Object) ((dd) this).field_t[var1]);
              var1++;
              continue L0;
            } else {
              var1++;
              continue L0;
            }
          }
        }
    }

    dd(vk param0) {
        ((dd) this).field_D = -1;
        ((dd) this).field_lb = 0;
        ((dd) this).field_w = 256;
        ((dd) this).field_x = 0;
        ((dd) this).field_ub = 0;
        ((dd) this).field_s = 0;
        ((dd) this).field_u = 0;
        ((dd) this).field_C = -1;
        ((dd) this).field_X = true;
        ((dd) this).field_E = 0;
        ((dd) this).field_P = null;
        ((dd) this).field_jb = -1;
        ((dd) this).field_ob = 64;
        ((dd) this).field_J = param0;
        this.f();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_rb = new int[8000];
        field_cb = new int[68];
        for (var0 = 0; var0 < 8000; var0++) {
            field_rb[var0] = (int)(8363.0 * Math.pow(2.0, (double)(4608 - var0) / 768.0));
        }
        for (var0 = 0; var0 < 68; var0++) {
            field_cb[var0] = (int)(-2048.0 * Math.sin((double)var0 * 0.0923998));
        }
    }
}
