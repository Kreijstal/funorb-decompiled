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
        ((wl) this).field_jb = param0;
    }

    private final boolean f() {
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
          if (((wl) this).field_s == 1) {
            break L0;
          } else {
            if (((wl) this).field_s == 2) {
              break L0;
            } else {
              ((wl) this).field_J = 0;
              return false;
            }
          }
        }
        L1: {
          var14 = 0;
          if (((wl) this).field_J != 0) {
            break L1;
          } else {
            L2: {
              if (((wl) this).field_s != 1) {
                break L2;
              } else {
                ((wl) this).field_s = 2;
                ((wl) this).field_S = 0;
                ((wl) this).field_eb = 0;
                ((wl) this).field_I = ((wl) this).field_x.field_K[((wl) this).field_S];
                ((wl) this).field_db = 0;
                break L2;
              }
            }
            L3: {
              L4: {
                if (((wl) this).field_eb >= ((wl) this).field_x.field_j[((wl) this).field_I]) {
                  break L4;
                } else {
                  if (((wl) this).field_l == 1) {
                    break L4;
                  } else {
                    L5: {
                      if (((wl) this).field_ib == 0) {
                        break L5;
                      } else {
                        if (((wl) this).field_eb % ((wl) this).field_ib == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    if (((wl) this).field_C <= 0) {
                      break L3;
                    } else {
                      if (((wl) this).field_eb % ((wl) this).field_C != 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
              }
              L6: {
                if (((wl) this).field_ib == 0) {
                  ((wl) this).field_S = ((wl) this).field_S + 1;
                  break L6;
                } else {
                  L7: {
                    if (((wl) this).field_N > ((wl) this).field_S) {
                      break L7;
                    } else {
                      var14 = 1;
                      break L7;
                    }
                  }
                  ((wl) this).field_S = ((wl) this).field_N;
                  break L6;
                }
              }
              L8: {
                if (((wl) this).field_u == -1) {
                  break L8;
                } else {
                  ((wl) this).field_S = ((wl) this).field_u;
                  ((wl) this).field_u = -1;
                  break L8;
                }
              }
              L9: {
                if (((wl) this).field_S < ((wl) this).field_x.field_k) {
                  break L9;
                } else {
                  ((wl) this).field_S = 0;
                  var14 = 1;
                  break L9;
                }
              }
              L10: {
                ((wl) this).field_eb = 0;
                if (((wl) this).field_l != 1) {
                  break L10;
                } else {
                  L11: {
                    ((wl) this).field_N = ((wl) this).field_N / 16 * 10 + ((wl) this).field_N % 16;
                    if (((wl) this).field_N < ((wl) this).field_x.field_j[((wl) this).field_I]) {
                      break L11;
                    } else {
                      ((wl) this).field_N = 0;
                      break L11;
                    }
                  }
                  ((wl) this).field_eb = ((wl) this).field_N;
                  break L10;
                }
              }
              L12: {
                if (((wl) this).field_K < 0) {
                  break L12;
                } else {
                  L13: {
                    if (((wl) this).field_C >= 0) {
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
                    var15 = ((wl) this).field_K;
                    var16 = ((wl) this).field_m;
                    if (((wl) this).field_F == null) {
                      break L14;
                    } else {
                      var17 = 0;
                      L15: while (true) {
                        if (var17 >= ((wl) this).field_x.field_M) {
                          ((wl) this).field_x = ((wl) this).field_F;
                          this.e();
                          ((wl) this).field_s = 2;
                          break L14;
                        } else {
                          this.b(var17);
                          var17++;
                          continue L15;
                        }
                      }
                    }
                  }
                  ((wl) this).field_S = var15;
                  ((wl) this).field_eb = var16;
                  var14 = 0;
                  ((wl) this).field_C = 0;
                  ((wl) this).field_K = -1;
                  ((wl) this).field_m = -1;
                  ((wl) this).field_F = null;
                  break L12;
                }
              }
              ((wl) this).field_I = ((wl) this).field_x.field_K[((wl) this).field_S];
              ((wl) this).field_db = 0;
              var10 = 0;
              L16: while (true) {
                if (var10 >= ((wl) this).field_eb) {
                  ((wl) this).field_u = -1;
                  ((wl) this).field_l = 0;
                  ((wl) this).field_ib = 0;
                  break L3;
                } else {
                  var15 = 0;
                  L17: while (true) {
                    if (var15 >= ((wl) this).field_x.field_M) {
                      var10++;
                      continue L16;
                    } else {
                      L18: {
                        var16 = ((wl) this).field_x.field_m[((wl) this).field_I][((wl) this).field_db] & 255;
                        ((wl) this).field_db = ((wl) this).field_db + 1;
                        if (var16 >= 128) {
                          var16 -= 128;
                          break L18;
                        } else {
                          ((wl) this).field_db = ((wl) this).field_db - 1;
                          var16 = 31;
                          break L18;
                        }
                      }
                      L19: {
                        if ((var16 & 1) != 1) {
                          break L19;
                        } else {
                          ((wl) this).field_db = ((wl) this).field_db + 1;
                          break L19;
                        }
                      }
                      L20: {
                        if ((var16 & 2) != 2) {
                          break L20;
                        } else {
                          ((wl) this).field_db = ((wl) this).field_db + 1;
                          break L20;
                        }
                      }
                      L21: {
                        if ((var16 & 4) != 4) {
                          break L21;
                        } else {
                          ((wl) this).field_db = ((wl) this).field_db + 1;
                          break L21;
                        }
                      }
                      L22: {
                        if ((var16 & 8) != 8) {
                          break L22;
                        } else {
                          ((wl) this).field_db = ((wl) this).field_db + 1;
                          break L22;
                        }
                      }
                      L23: {
                        if ((var16 & 16) != 16) {
                          break L23;
                        } else {
                          ((wl) this).field_db = ((wl) this).field_db + 1;
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
            ((wl) this).field_eb = ((wl) this).field_eb + 1;
            break L1;
          }
        }
        var15 = 0;
        L24: while (true) {
          if (var15 >= ((wl) this).field_x.field_M) {
            L25: {
              if (((wl) this).field_J <= 0) {
                break L25;
              } else {
                var15 = 0;
                L26: while (true) {
                  if (var15 >= ((wl) this).field_x.field_M) {
                    break L25;
                  } else {
                    L27: {
                      if (((wl) this).field_D[var15]) {
                        break L27;
                      } else {
                        L28: {
                          if (((wl) this).field_nb[var15] == 0) {
                            break L28;
                          } else {
                            ((wl) this).field_R = ((wl) this).field_R + ((wl) this).field_A[var15];
                            if (((wl) this).field_R >= 0) {
                              if (((wl) this).field_R <= 64) {
                                break L28;
                              } else {
                                ((wl) this).field_R = 64;
                                break L28;
                              }
                            } else {
                              ((wl) this).field_R = 0;
                              break L28;
                            }
                          }
                        }
                        L29: {
                          L30: {
                            if (((wl) this).field_n[var15] != 0) {
                              break L30;
                            } else {
                              if (((wl) this).field_L[var15] == 0) {
                                break L29;
                              } else {
                                break L30;
                              }
                            }
                          }
                          L31: {
                            ((wl) this).field_lb[var15] = ((wl) this).field_lb[var15] + ((wl) this).field_O[var15];
                            if (((wl) this).field_lb[var15] >= 0) {
                              if (((wl) this).field_lb[var15] <= 64) {
                                break L31;
                              } else {
                                ((wl) this).field_lb[var15] = 64;
                                break L31;
                              }
                            } else {
                              ((wl) this).field_lb[var15] = 0;
                              break L31;
                            }
                          }
                          ((wl) this).field_Y[var15] = ((wl) this).field_Y[var15] + ((wl) this).field_kb[var15];
                          if (((wl) this).field_Y[var15] >= 0) {
                            if (((wl) this).field_Y[var15] <= 255) {
                              break L29;
                            } else {
                              ((wl) this).field_Y[var15] = 255;
                              break L29;
                            }
                          } else {
                            ((wl) this).field_Y[var15] = 0;
                            break L29;
                          }
                        }
                        L32: {
                          if (((wl) this).field_Z[var15] != 1) {
                            break L32;
                          } else {
                            ((wl) this).field_U[var15] = (((wl) this).field_U[var15] + ((wl) this).field_pb[var15]) % 68;
                            var2 = field_T[((wl) this).field_U[var15]] * ((wl) this).field_p[var15] >> 8;
                            var16 = ((wl) this).field_P[var15] + var2;
                            this.a(var15, field_E[var16]);
                            break L32;
                          }
                        }
                        L33: {
                          if (((wl) this).field_Q[var15] <= 0) {
                            break L33;
                          } else {
                            L34: {
                              ((wl) this).field_P[var15] = ((wl) this).field_P[var15] - ((wl) this).field_Q[var15] * 4;
                              if (((wl) this).field_P[var15] >= 0) {
                                if (((wl) this).field_P[var15] <= 7999) {
                                  break L34;
                                } else {
                                  ((wl) this).field_P[var15] = 7999;
                                  break L34;
                                }
                              } else {
                                ((wl) this).field_P[var15] = 0;
                                break L34;
                              }
                            }
                            var16 = field_E[((wl) this).field_P[var15]];
                            this.a(var15, var16);
                            break L33;
                          }
                        }
                        L35: {
                          if (((wl) this).field_B[var15] <= 0) {
                            break L35;
                          } else {
                            L36: {
                              ((wl) this).field_P[var15] = ((wl) this).field_P[var15] + ((wl) this).field_B[var15] * 4;
                              if (((wl) this).field_P[var15] >= 0) {
                                if (((wl) this).field_P[var15] <= 7999) {
                                  break L36;
                                } else {
                                  ((wl) this).field_P[var15] = 7999;
                                  break L36;
                                }
                              } else {
                                ((wl) this).field_P[var15] = 0;
                                break L36;
                              }
                            }
                            var16 = field_E[((wl) this).field_P[var15]];
                            this.a(var15, var16);
                            break L35;
                          }
                        }
                        if (((wl) this).field_ab[var15] <= 0) {
                          break L27;
                        } else {
                          L37: {
                            if (((wl) this).field_P[var15] >= ((wl) this).field_r[var15]) {
                              break L37;
                            } else {
                              ((wl) this).field_P[var15] = ((wl) this).field_P[var15] + ((wl) this).field_mb[var15] * 4;
                              if (((wl) this).field_P[var15] <= ((wl) this).field_r[var15]) {
                                break L37;
                              } else {
                                ((wl) this).field_P[var15] = ((wl) this).field_r[var15];
                                break L37;
                              }
                            }
                          }
                          L38: {
                            if (((wl) this).field_P[var15] <= ((wl) this).field_r[var15]) {
                              break L38;
                            } else {
                              ((wl) this).field_P[var15] = ((wl) this).field_P[var15] - ((wl) this).field_mb[var15] * 4;
                              if (((wl) this).field_P[var15] >= ((wl) this).field_r[var15]) {
                                break L38;
                              } else {
                                ((wl) this).field_P[var15] = ((wl) this).field_r[var15];
                                break L38;
                              }
                            }
                          }
                          L39: {
                            if (((wl) this).field_P[var15] >= 0) {
                              if (((wl) this).field_P[var15] <= 7999) {
                                break L39;
                              } else {
                                ((wl) this).field_P[var15] = 7999;
                                break L39;
                              }
                            } else {
                              ((wl) this).field_P[var15] = 0;
                              break L39;
                            }
                          }
                          var16 = field_E[((wl) this).field_P[var15]];
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
              if (var15 >= ((wl) this).field_x.field_M) {
                L41: {
                  ((wl) this).field_J = ((wl) this).field_J + 1;
                  if (((wl) this).field_J < ((wl) this).field_q) {
                    break L41;
                  } else {
                    ((wl) this).field_J = 0;
                    break L41;
                  }
                }
                return var14 != 0;
              } else {
                L42: {
                  if (((wl) this).field_D[var15]) {
                    break L42;
                  } else {
                    L43: {
                      var16 = ((wl) this).field_lb[var15];
                      var17 = ((wl) this).field_Y[var15];
                      ((wl) this).field_M[var15] = 0;
                      if (((wl) this).field_w[var15] < 0) {
                        break L43;
                      } else {
                        L44: {
                          var3 = ((wl) this).field_w[var15];
                          if ((((wl) this).field_x.field_I[((wl) this).field_w[var15]] & 1) != 1) {
                            break L44;
                          } else {
                            ((wl) this).field_M[var15] = 1;
                            var4 = ((wl) this).field_o[var15];
                            var5 = 0;
                            L45: while (true) {
                              if (((wl) this).field_x.field_e[var3][var5 + 1] >= var4) {
                                L46: {
                                  var6 = ((wl) this).field_x.field_e[var3][var5];
                                  var8 = ((wl) this).field_x.field_e[var3][var5 + 1];
                                  var7 = ((wl) this).field_x.field_D[var3][var5];
                                  var9 = ((wl) this).field_x.field_D[var3][var5 + 1];
                                  if (var8 != var6) {
                                    break L46;
                                  } else {
                                    var8++;
                                    break L46;
                                  }
                                }
                                L47: {
                                  var11 = ((var8 - var4) * var7 + (var4 - var6) * var9) / (var8 - var6);
                                  var12 = 32768 - ((wl) this).field_t[var15];
                                  if (var12 >= 0) {
                                    break L47;
                                  } else {
                                    var12 = 0;
                                    break L47;
                                  }
                                }
                                L48: {
                                  var16 = var16 * var11 * var12 >> 21;
                                  if ((((wl) this).field_x.field_I[var3] & 2) != 2) {
                                    break L48;
                                  } else {
                                    if (((wl) this).field_gb[var15] != 1) {
                                      break L48;
                                    } else {
                                      if (((wl) this).field_o[var15] != ((wl) this).field_x.field_e[var3][((wl) this).field_x.field_L[var3]]) {
                                        break L48;
                                      } else {
                                        ((wl) this).field_o[var15] = ((wl) this).field_o[var15] - 1;
                                        break L48;
                                      }
                                    }
                                  }
                                }
                                L49: {
                                  if (((wl) this).field_o[var15] != ((wl) this).field_x.field_e[var3][((wl) this).field_x.field_e[var3].length - 1]) {
                                    break L49;
                                  } else {
                                    ((wl) this).field_o[var15] = ((wl) this).field_o[var15] - 1;
                                    break L49;
                                  }
                                }
                                L50: {
                                  if (((wl) this).field_gb[var15] != 0) {
                                    break L50;
                                  } else {
                                    ((wl) this).field_t[var15] = ((wl) this).field_t[var15] + ((wl) this).field_x.field_i[var3];
                                    break L50;
                                  }
                                }
                                ((wl) this).field_o[var15] = ((wl) this).field_o[var15] + 1;
                                if ((((wl) this).field_x.field_I[var3] & 4) != 4) {
                                  break L44;
                                } else {
                                  if (((wl) this).field_o[var15] != ((wl) this).field_x.field_e[var3][((wl) this).field_x.field_G[var3]]) {
                                    break L44;
                                  } else {
                                    ((wl) this).field_o[var15] = ((wl) this).field_x.field_e[var3][((wl) this).field_x.field_N[var3]];
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
                        if ((((wl) this).field_x.field_h[((wl) this).field_w[var15]] & 1) != 1) {
                          break L43;
                        } else {
                          var4 = ((wl) this).field_X[var15];
                          var5 = 0;
                          L51: while (true) {
                            if (((wl) this).field_x.field_g[var3][var5 + 1] >= var4) {
                              L52: {
                                var6 = ((wl) this).field_x.field_g[var3][var5];
                                var8 = ((wl) this).field_x.field_g[var3][var5 + 1];
                                var7 = ((wl) this).field_x.field_f[var3][var5];
                                var9 = ((wl) this).field_x.field_f[var3][var5 + 1];
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
                                if ((((wl) this).field_x.field_h[var3] & 2) != 2) {
                                  break L53;
                                } else {
                                  if (((wl) this).field_gb[var15] != 1) {
                                    break L53;
                                  } else {
                                    if (((wl) this).field_X[var15] != ((wl) this).field_x.field_g[var3][((wl) this).field_x.field_b[var3]]) {
                                      break L53;
                                    } else {
                                      ((wl) this).field_X[var15] = ((wl) this).field_X[var15] - 1;
                                      break L53;
                                    }
                                  }
                                }
                              }
                              L54: {
                                if (((wl) this).field_X[var15] != ((wl) this).field_x.field_g[var3][((wl) this).field_x.field_g[var3].length - 1]) {
                                  break L54;
                                } else {
                                  ((wl) this).field_X[var15] = ((wl) this).field_X[var15] - 1;
                                  break L54;
                                }
                              }
                              ((wl) this).field_X[var15] = ((wl) this).field_X[var15] + 1;
                              if ((((wl) this).field_x.field_h[var3] & 4) != 4) {
                                break L43;
                              } else {
                                if (((wl) this).field_X[var15] != ((wl) this).field_x.field_g[var3][((wl) this).field_x.field_p[var3]]) {
                                  break L43;
                                } else {
                                  ((wl) this).field_X[var15] = ((wl) this).field_x.field_g[var3][((wl) this).field_x.field_q[var3]];
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
                if (((wl) this).field_J != 0) {
                  if (((wl) this).field_v[var15] >= 0) {
                    var16 = ((wl) this).field_v[var15];
                    break L56;
                  } else {
                    break L55;
                  }
                } else {
                  var16 = ((wl) this).field_db;
                  break L56;
                }
              }
              L57: {
                ((wl) this).field_v[var15] = -1;
                var17 = var16;
                var18 = -1;
                var19 = -1;
                var20 = -1;
                var21 = -1;
                var22 = -1;
                var23 = 0;
                var24 = ((wl) this).field_x.field_m[((wl) this).field_I][var16] & 255;
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
                  var18 = ((wl) this).field_x.field_m[((wl) this).field_I][var16] & 255;
                  var16++;
                  break L58;
                }
              }
              L59: {
                if ((var24 & 2) != 2) {
                  break L59;
                } else {
                  var19 = (((wl) this).field_x.field_m[((wl) this).field_I][var16] & 255) - 1;
                  var16++;
                  break L59;
                }
              }
              L60: {
                if ((var24 & 4) != 4) {
                  break L60;
                } else {
                  var20 = (((wl) this).field_x.field_m[((wl) this).field_I][var16] & 255) - 16;
                  var16++;
                  break L60;
                }
              }
              L61: {
                if ((var24 & 8) != 8) {
                  break L61;
                } else {
                  var22 = ((wl) this).field_x.field_m[((wl) this).field_I][var16] & 255;
                  var16++;
                  break L61;
                }
              }
              L62: {
                if ((var24 & 16) != 16) {
                  break L62;
                } else {
                  var23 = ((wl) this).field_x.field_m[((wl) this).field_I][var16] & 255;
                  var16++;
                  break L62;
                }
              }
              L63: {
                if (((wl) this).field_J != 0) {
                  break L63;
                } else {
                  ((wl) this).field_db = var16;
                  break L63;
                }
              }
              if (((wl) this).field_D[var15]) {
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
                      if (((wl) this).field_J != var23) {
                        ((wl) this).field_v[var15] = var17;
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
                    if (((wl) this).field_J >= var23) {
                      break L66;
                    } else {
                      ((wl) this).field_v[var15] = var17;
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
                      ((wl) this).field_n[var15] = 2;
                      ((wl) this).field_O[var15] = 80 - var20;
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
                      ((wl) this).field_n[var15] = 2;
                      ((wl) this).field_O[var15] = var20 - 96;
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
                      var20 = ((wl) this).field_lb[var15] - (var20 - 112);
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
                      var20 = ((wl) this).field_lb[var15] + (var20 - 128);
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
                      ((wl) this).field_L[var15] = 2;
                      ((wl) this).field_kb[var15] = 192 - var20;
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
                      ((wl) this).field_L[var15] = 2;
                      ((wl) this).field_kb[var15] = var20 - 208;
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
                    if (((wl) this).field_ib > 1) {
                      ((wl) this).field_ib = 1;
                      break L75;
                    } else {
                      ((wl) this).field_l = 1;
                      ((wl) this).field_N = var23;
                      break L75;
                    }
                  }
                }
                L76: {
                  if (var22 != 15) {
                    break L76;
                  } else {
                    if (var23 >= 32) {
                      ((wl) this).field_W = var23;
                      break L76;
                    } else {
                      ((wl) this).field_q = var23;
                      break L76;
                    }
                  }
                }
                L77: {
                  if (var22 != 16) {
                    break L77;
                  } else {
                    ((wl) this).field_R = var23;
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
                    if (((wl) this).field_ib > 1) {
                      break L80;
                    } else {
                      ((wl) this).field_ib = 1;
                      ((wl) this).field_N = var23;
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
                      ((wl) this).field_o[var15] = var23;
                      if (((wl) this).field_o[var15] < ((wl) this).field_x.field_e[var3][((wl) this).field_x.field_e[var3].length - 1]) {
                        break L83;
                      } else {
                        ((wl) this).field_o[var15] = ((wl) this).field_x.field_e[var3][((wl) this).field_x.field_e[var3].length - 1] - 1;
                        break L83;
                      }
                    }
                    ((wl) this).field_X[var15] = var23;
                    if (((wl) this).field_X[var15] < ((wl) this).field_x.field_g[var3][((wl) this).field_x.field_g[var3].length - 1]) {
                      break L82;
                    } else {
                      ((wl) this).field_X[var15] = ((wl) this).field_x.field_g[var3][((wl) this).field_x.field_g[var3].length - 1] - 1;
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
                      ((wl) this).field_o[var15] = 0;
                      ((wl) this).field_X[var15] = 0;
                      ((wl) this).field_gb[var15] = 1;
                      ((wl) this).field_t[var15] = 0;
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
                        var20 = ((wl) this).field_x.field_F[((wl) this).field_G[var15]];
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
                        var21 = ((wl) this).field_x.field_x[((wl) this).field_G[var15]];
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
                                var20 = ((wl) this).field_lb[var15];
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
                                var21 = ((wl) this).field_Y[var15];
                                break L90;
                              }
                            }
                          }
                          L91: {
                            if (var19 != -1) {
                              ((wl) this).field_w[var15] = var19;
                              if (var18 >= 96) {
                                var19 = ((wl) this).field_x.field_l[var19][95];
                                break L91;
                              } else {
                                var19 = ((wl) this).field_x.field_l[var19][var18];
                                break L91;
                              }
                            } else {
                              var19 = ((wl) this).field_G[var15];
                              break L91;
                            }
                          }
                          L92: {
                            if (var20 >= 0) {
                              break L92;
                            } else {
                              var20 = ((wl) this).field_x.field_F[var19];
                              break L92;
                            }
                          }
                          L93: {
                            if (var21 >= 0) {
                              break L93;
                            } else {
                              var21 = ((wl) this).field_x.field_x[var19];
                              break L93;
                            }
                          }
                          L94: {
                            var25 = 7680 - (var18 + ((wl) this).field_x.field_C[var19]) * 64 - ((wl) this).field_x.field_z[var19] / 2;
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
                            ((wl) this).field_r[var15] = var25;
                            var26 = field_E[var25];
                            ((wl) this).field_G[var15] = var19;
                            ((wl) this).field_lb[var15] = var20;
                            ((wl) this).field_Y[var15] = var21;
                            ((wl) this).field_P[var15] = var25;
                            var1 = 0;
                            if (var22 != 9) {
                              break L95;
                            } else {
                              if (var23 * 256 <= ((wl) this).field_x.field_v[var19]) {
                                var1 = var23 * 256;
                                break L95;
                              } else {
                                var1 = ((wl) this).field_x.field_v[var19];
                                break L95;
                              }
                            }
                          }
                          this.a(var15, var19, var1, var26, var20, var21);
                          ((wl) this).field_U[var15] = 0;
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
                        ((wl) this).field_lb[var15] = var20;
                        break L97;
                      }
                    }
                    if (var21 < 0) {
                      break L87;
                    } else {
                      ((wl) this).field_Y[var15] = var21;
                      break L87;
                    }
                  } else {
                    if (((wl) this).field_M[var15] != 1) {
                      this.b(var15);
                      break L87;
                    } else {
                      ((wl) this).field_gb[var15] = 0;
                      break L87;
                    }
                  }
                }
                L98: {
                  if (var22 != 3) {
                    if (var22 == 5) {
                      break L98;
                    } else {
                      ((wl) this).field_ab[var15] = 0;
                      break L98;
                    }
                  } else {
                    L99: {
                      ((wl) this).field_ab[var15] = 1;
                      if (var18 < 0) {
                        break L99;
                      } else {
                        if (var18 > 96) {
                          break L99;
                        } else {
                          L100: {
                            var19 = ((wl) this).field_G[var15];
                            var25 = 7680 - (var18 + ((wl) this).field_x.field_C[var19]) * 64 - ((wl) this).field_x.field_z[var19] / 2;
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
                          ((wl) this).field_r[var15] = var25;
                          break L99;
                        }
                      }
                    }
                    if (var23 == 0) {
                      break L98;
                    } else {
                      ((wl) this).field_mb[var15] = var23;
                      if (((wl) this).field_x.field_E != 0) {
                        break L98;
                      } else {
                        ((wl) this).field_mb[var15] = ((wl) this).field_mb[var15] * 2;
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
                        if (((wl) this).field_Z[var15] == 0) {
                          break L102;
                        } else {
                          var25 = field_E[((wl) this).field_P[var15]];
                          this.a(var15, var25);
                          break L102;
                        }
                      }
                      ((wl) this).field_U[var15] = 0;
                      ((wl) this).field_Z[var15] = 0;
                      break L101;
                    }
                  } else {
                    L103: {
                      ((wl) this).field_Z[var15] = 1;
                      if (var23 / 16 <= 0) {
                        break L103;
                      } else {
                        ((wl) this).field_pb[var15] = var23 / 16;
                        break L103;
                      }
                    }
                    if ((var23 & 15) <= 0) {
                      break L101;
                    } else {
                      ((wl) this).field_p[var15] = var23 & 15;
                      break L101;
                    }
                  }
                }
                L104: {
                  if (var22 != 17) {
                    ((wl) this).field_nb[var15] = 0;
                    break L104;
                  } else {
                    ((wl) this).field_nb[var15] = 1;
                    if (var23 == 0) {
                      break L104;
                    } else {
                      ((wl) this).field_A[var15] = (var23 & 240) / 16 - (var23 & 15);
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
                          if (((wl) this).field_n[var15] != 2) {
                            ((wl) this).field_n[var15] = 0;
                            break L105;
                          } else {
                            ((wl) this).field_n[var15] = 1;
                            break L105;
                          }
                        } else {
                          break L106;
                        }
                      }
                    }
                  }
                  ((wl) this).field_n[var15] = 1;
                  if (var23 == 0) {
                    break L105;
                  } else {
                    ((wl) this).field_O[var15] = (var23 & 240) / 16 - (var23 & 15);
                    break L105;
                  }
                }
                L107: {
                  if (var22 != 25) {
                    if (((wl) this).field_L[var15] != 2) {
                      ((wl) this).field_L[var15] = 0;
                      break L107;
                    } else {
                      ((wl) this).field_L[var15] = 1;
                      break L107;
                    }
                  } else {
                    ((wl) this).field_L[var15] = 1;
                    if (var23 == 0) {
                      break L107;
                    } else {
                      ((wl) this).field_kb[var15] = (var23 & 240) / 16 - (var23 & 15);
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
                        ((wl) this).field_bb[var15] = var23;
                        break L109;
                      } else {
                        var23 = ((wl) this).field_bb[var15];
                        break L109;
                      }
                    }
                    ((wl) this).field_lb[var15] = ((wl) this).field_lb[var15] + var23;
                    if (((wl) this).field_lb[var15] >= 0) {
                      if (((wl) this).field_lb[var15] <= 64) {
                        break L108;
                      } else {
                        ((wl) this).field_lb[var15] = 64;
                        break L108;
                      }
                    } else {
                      ((wl) this).field_lb[var15] = 0;
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
                        ((wl) this).field_ob[var15] = var23;
                        break L111;
                      } else {
                        var23 = ((wl) this).field_ob[var15];
                        break L111;
                      }
                    }
                    ((wl) this).field_lb[var15] = ((wl) this).field_lb[var15] - var23;
                    if (((wl) this).field_lb[var15] >= 0) {
                      if (((wl) this).field_lb[var15] <= 64) {
                        break L110;
                      } else {
                        ((wl) this).field_lb[var15] = 64;
                        break L110;
                      }
                    } else {
                      ((wl) this).field_lb[var15] = 0;
                      break L110;
                    }
                  }
                }
                L112: {
                  if (var22 != 1) {
                    ((wl) this).field_Q[var15] = 0;
                    break L112;
                  } else {
                    if (var23 == 0) {
                      break L112;
                    } else {
                      ((wl) this).field_Q[var15] = var23;
                      break L112;
                    }
                  }
                }
                L113: {
                  if (var22 != 2) {
                    ((wl) this).field_B[var15] = 0;
                    break L113;
                  } else {
                    if (var23 == 0) {
                      break L113;
                    } else {
                      ((wl) this).field_B[var15] = var23;
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
                        ((wl) this).field_y[var15] = var23;
                        break L115;
                      } else {
                        var23 = ((wl) this).field_y[var15];
                        break L115;
                      }
                    }
                    L116: {
                      ((wl) this).field_P[var15] = ((wl) this).field_P[var15] - var23 * 4;
                      if (((wl) this).field_P[var15] >= 0) {
                        if (((wl) this).field_P[var15] <= 7999) {
                          break L116;
                        } else {
                          ((wl) this).field_P[var15] = 7999;
                          break L116;
                        }
                      } else {
                        ((wl) this).field_P[var15] = 0;
                        break L116;
                      }
                    }
                    var25 = field_E[((wl) this).field_P[var15]];
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
                        ((wl) this).field_fb[var15] = var23;
                        break L118;
                      } else {
                        var23 = ((wl) this).field_fb[var15];
                        break L118;
                      }
                    }
                    L119: {
                      ((wl) this).field_P[var15] = ((wl) this).field_P[var15] + var23 * 4;
                      if (((wl) this).field_P[var15] >= 0) {
                        if (((wl) this).field_P[var15] <= 7999) {
                          break L119;
                        } else {
                          ((wl) this).field_P[var15] = 7999;
                          break L119;
                        }
                      } else {
                        ((wl) this).field_P[var15] = 0;
                        break L119;
                      }
                    }
                    var25 = field_E[((wl) this).field_P[var15]];
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
                        ((wl) this).field_H[var15] = var23;
                        break L120;
                      } else {
                        var23 = ((wl) this).field_H[var15];
                        break L120;
                      }
                    }
                    L121: {
                      ((wl) this).field_P[var15] = ((wl) this).field_P[var15] + var23;
                      if (((wl) this).field_P[var15] >= 0) {
                        if (((wl) this).field_P[var15] <= 7999) {
                          break L121;
                        } else {
                          ((wl) this).field_P[var15] = 7999;
                          break L121;
                        }
                      } else {
                        ((wl) this).field_P[var15] = 0;
                        break L121;
                      }
                    }
                    var25 = field_E[((wl) this).field_P[var15]];
                    this.a(var15, var25);
                    break L55;
                  } else {
                    L122: {
                      var23 = var23 & 15;
                      if (var23 != 0) {
                        ((wl) this).field_cb[var15] = var23;
                        break L122;
                      } else {
                        var23 = ((wl) this).field_cb[var15];
                        break L122;
                      }
                    }
                    L123: {
                      ((wl) this).field_P[var15] = ((wl) this).field_P[var15] - var23;
                      if (((wl) this).field_P[var15] >= 0) {
                        if (((wl) this).field_P[var15] <= 7999) {
                          break L123;
                        } else {
                          ((wl) this).field_P[var15] = 7999;
                          break L123;
                        }
                      } else {
                        ((wl) this).field_P[var15] = 0;
                        break L123;
                      }
                    }
                    var25 = field_E[((wl) this).field_P[var15]];
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

    final synchronized void a(int param0) {
        ((wl) this).field_z = param0;
    }

    final void g() {
        RuntimeException decompiledCaughtException = null;
        try {
          if (((wl) this).field_j == null) {
          } else {
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          throw decompiledCaughtException;
        }
        this.c();
    }

    private final void e() {
        ((wl) this).field_lb = new int[((wl) this).field_x.field_M];
        ((wl) this).field_Y = new int[((wl) this).field_x.field_M];
        ((wl) this).field_P = new int[((wl) this).field_x.field_M];
        ((wl) this).field_G = new int[((wl) this).field_x.field_M];
        ((wl) this).field_w = new int[((wl) this).field_x.field_M];
        ((wl) this).field_A = new int[((wl) this).field_x.field_M];
        ((wl) this).field_O = new int[((wl) this).field_x.field_M];
        ((wl) this).field_kb = new int[((wl) this).field_x.field_M];
        ((wl) this).field_pb = new int[((wl) this).field_x.field_M];
        ((wl) this).field_p = new int[((wl) this).field_x.field_M];
        ((wl) this).field_U = new int[((wl) this).field_x.field_M];
        ((wl) this).field_Z = new int[((wl) this).field_x.field_M];
        ((wl) this).field_bb = new int[((wl) this).field_x.field_M];
        ((wl) this).field_y = new int[((wl) this).field_x.field_M];
        ((wl) this).field_cb = new int[((wl) this).field_x.field_M];
        ((wl) this).field_ob = new int[((wl) this).field_x.field_M];
        ((wl) this).field_fb = new int[((wl) this).field_x.field_M];
        ((wl) this).field_H = new int[((wl) this).field_x.field_M];
        ((wl) this).field_Q = new int[((wl) this).field_x.field_M];
        ((wl) this).field_B = new int[((wl) this).field_x.field_M];
        ((wl) this).field_r = new int[((wl) this).field_x.field_M];
        ((wl) this).field_mb = new int[((wl) this).field_x.field_M];
        ((wl) this).field_v = new int[((wl) this).field_x.field_M];
        ((wl) this).field_o = new int[((wl) this).field_x.field_M];
        ((wl) this).field_X = new int[((wl) this).field_x.field_M];
        ((wl) this).field_M = new int[((wl) this).field_x.field_M];
        ((wl) this).field_gb = new int[((wl) this).field_x.field_M];
        ((wl) this).field_t = new int[((wl) this).field_x.field_M];
        ((wl) this).field_ab = new int[((wl) this).field_x.field_M];
        ((wl) this).field_n = new int[((wl) this).field_x.field_M];
        ((wl) this).field_L = new int[((wl) this).field_x.field_M];
        ((wl) this).field_nb = new int[((wl) this).field_x.field_M];
        ((wl) this).field_D = new boolean[((wl) this).field_x.field_M];
        ((wl) this).field_V = new nj[((wl) this).field_x.field_M];
        this.c();
    }

    private final void c() {
        int var1 = 0;
        RuntimeException decompiledCaughtException = null;
        ((wl) this).field_J = 0;
        ((wl) this).field_s = 0;
        ((wl) this).field_db = 0;
        ((wl) this).field_eb = 0;
        ((wl) this).field_S = 0;
        ((wl) this).field_I = 0;
        ((wl) this).field_q = ((wl) this).field_x.field_B;
        ((wl) this).field_W = ((wl) this).field_x.field_c;
        ((wl) this).field_R = 64;
        var1 = 0;
        try {
          L0: while (true) {
            if (var1 >= ((wl) this).field_x.field_M) {
              break L0;
            } else {
              ((wl) this).field_O[var1] = 0;
              ((wl) this).field_kb[var1] = 0;
              ((wl) this).field_pb[var1] = 0;
              ((wl) this).field_p[var1] = 0;
              ((wl) this).field_U[var1] = 0;
              ((wl) this).field_Z[var1] = 0;
              ((wl) this).field_bb[var1] = 0;
              ((wl) this).field_y[var1] = 0;
              ((wl) this).field_cb[var1] = 0;
              ((wl) this).field_ob[var1] = 0;
              ((wl) this).field_fb[var1] = 0;
              ((wl) this).field_H[var1] = 0;
              ((wl) this).field_Q[var1] = 0;
              ((wl) this).field_B[var1] = 0;
              ((wl) this).field_r[var1] = 0;
              ((wl) this).field_mb[var1] = 0;
              ((wl) this).field_v[var1] = -1;
              ((wl) this).field_o[var1] = 0;
              ((wl) this).field_X[var1] = 0;
              ((wl) this).field_M[var1] = 0;
              ((wl) this).field_gb[var1] = 0;
              ((wl) this).field_t[var1] = 0;
              ((wl) this).field_ab[var1] = 0;
              ((wl) this).field_nb[var1] = 0;
              ((wl) this).field_n[var1] = 0;
              ((wl) this).field_L[var1] = 0;
              ((wl) this).field_G[var1] = 0;
              ((wl) this).field_lb[var1] = 0;
              ((wl) this).field_Y[var1] = 128;
              ((wl) this).field_P[var1] = 0;
              ((wl) this).field_w[var1] = -1;
              var1++;
              continue L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          throw decompiledCaughtException;
        }
        ((wl) this).field_C = 0;
        ((wl) this).field_F = null;
        ((wl) this).field_K = -1;
        ((wl) this).field_m = -1;
        ((wl) this).field_ib = 0;
        ((wl) this).field_N = 0;
        ((wl) this).field_u = -1;
        ((wl) this).field_l = 0;
        var1 = 0;
        try {
          L1: while (true) {
            if (var1 >= ((wl) this).field_x.field_M) {
              break L1;
            } else {
              ((wl) this).field_V[var1] = null;
              ((wl) this).field_D[var1] = false;
              var1++;
              continue L1;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          throw decompiledCaughtException;
        }
        ((wl) this).field_s = 1;
    }

    public static void d() {
        field_E = null;
        field_T = null;
    }

    final void b() {
        int var1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var1 = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (var1 >= ((wl) this).field_x.field_M) {
                            statePc = 9;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (((wl) this).field_V[var1] == null) {
                            statePc = 8;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        ((wl) this).field_j.b((lf) (Object) ((wl) this).field_V[var1]);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 7: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 8: {
                    var1++;
                    statePc = 1;
                    continue stateLoop;
                }
                case 9: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(int param0, int param1, int param2) {
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (((wl) this).field_V[param0] == null) {
                            statePc = 12;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        if (param1 >= 0) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 3: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 4: {
                    param1 = 0;
                    statePc = 7;
                    continue stateLoop;
                }
                case 5: {
                    if (param1 <= 64) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    param1 = 64;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    if (param2 >= 0) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    param2 = 0;
                    statePc = 11;
                    continue stateLoop;
                }
                case 9: {
                    if (param2 <= 256) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    param2 = 256;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    ((wl) this).field_V[param0].a(pi.field_c >> 7, param1 * ((wl) this).field_R * ((wl) this).field_z >> 12, param2);
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int a(uh param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        Object stackIn_3_0 = null;
        Object stackOut_2_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var2 = this.f() ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (var2 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackOut_2_0 = this;
                        stackIn_3_0 = stackOut_2_0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (((wl) this).field_jb) {
                            statePc = 8;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        return -1;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 7: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 8: {
                    var3 = pi.field_c;
                    var4 = (var3 << 9) + (var3 << 7);
                    return var4 / (((wl) this).field_W * ((wl) this).field_hb);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a() {
        int var1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var1 = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (var1 >= ((wl) this).field_x.field_M) {
                            statePc = 9;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (((wl) this).field_V[var1] == null) {
                            statePc = 8;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        ((wl) this).field_j.a((lf) (Object) ((wl) this).field_V[var1]);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 7: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 8: {
                    var1++;
                    statePc = 1;
                    continue stateLoop;
                }
                case 9: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(int param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (((wl) this).field_V[param0] == null) {
              break L0;
            } else {
              ((wl) this).field_V[param0].b(param1 * 256 / pi.field_c);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
        }
        throw decompiledCaughtException;
    }

    private final void b(int param0) {
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (((wl) this).field_V[param0] == null) {
              break L0;
            } else {
              ((wl) this).field_V[param0].h(pi.field_c >> 7);
              ((wl) this).field_V[param0] = null;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
        }
        throw decompiledCaughtException;
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        nj var7 = null;
        Object var8 = null;
        Object var8_ref = null;
        Throwable var9 = null;
        int stackIn_2_0 = 0;
        gg stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        gg stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        gg stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_19_2 = 0;
        nj stackIn_21_0 = null;
        nj stackIn_23_0 = null;
        nj stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        nj stackIn_25_0 = null;
        nj stackIn_27_0 = null;
        nj stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        int stackOut_1_0 = 0;
        gg stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        gg stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        gg stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        nj stackOut_20_0 = null;
        nj stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        nj stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        nj stackOut_24_0 = null;
        nj stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        nj stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        this.b(param0);
                        if (param3 <= field_E[7999]) {
                            statePc = 5;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        stackOut_1_0 = param3;
                        stackIn_2_0 = stackOut_1_0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (stackIn_2_0 < field_E[0]) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        return;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 6: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 7: {
                    if (param4 >= 0) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    param4 = 0;
                    statePc = 11;
                    continue stateLoop;
                }
                case 9: {
                    if (param4 <= 64) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    param4 = 64;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    if (param5 >= 0) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    param5 = 0;
                    statePc = 15;
                    continue stateLoop;
                }
                case 13: {
                    if (param5 <= 255) {
                        statePc = 15;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    param5 = 255;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    try {
                        stackOut_15_0 = ((wl) this).field_x.field_o[param1];
                        stackOut_15_1 = param3 * 256 / pi.field_c;
                        stackIn_18_0 = stackOut_15_0;
                        stackIn_18_1 = stackOut_15_1;
                        stackIn_16_0 = stackOut_15_0;
                        stackIn_16_1 = stackOut_15_1;
                        if (param2 == 0) {
                            statePc = 18;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        stackOut_16_0 = (gg) (Object) stackIn_16_0;
                        stackOut_16_1 = stackIn_16_1;
                        stackOut_16_2 = 0;
                        stackIn_19_0 = stackOut_16_0;
                        stackIn_19_1 = stackOut_16_1;
                        stackIn_19_2 = stackOut_16_2;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 17: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 18: {
                    stackOut_18_0 = (gg) (Object) stackIn_18_0;
                    stackOut_18_1 = stackIn_18_1;
                    stackOut_18_2 = param4 * ((wl) this).field_R * ((wl) this).field_z >> 12;
                    stackIn_19_0 = stackOut_18_0;
                    stackIn_19_1 = stackOut_18_1;
                    stackIn_19_2 = stackOut_18_2;
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    var7 = nj.a(stackIn_19_0, stackIn_19_1, stackIn_19_2, param5);
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    try {
                        var7.d(((wl) this).field_x.field_w[param1], ((wl) this).field_x.field_t[param1]);
                        stackOut_20_0 = (nj) var7;
                        stackIn_23_0 = stackOut_20_0;
                        stackIn_21_0 = stackOut_20_0;
                        if (((wl) this).field_x.field_y[param1] == 0) {
                            statePc = 23;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackOut_21_0 = (nj) (Object) stackIn_21_0;
                        stackOut_21_1 = -1;
                        stackIn_24_0 = stackOut_21_0;
                        stackIn_24_1 = stackOut_21_1;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 22: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 23: {
                    stackOut_23_0 = (nj) (Object) stackIn_23_0;
                    stackOut_23_1 = 0;
                    stackIn_24_0 = stackOut_23_0;
                    stackIn_24_1 = stackOut_23_1;
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    try {
                        ((nj) (Object) stackIn_24_0).d(stackIn_24_1);
                        stackOut_24_0 = (nj) var7;
                        stackIn_27_0 = stackOut_24_0;
                        stackIn_25_0 = stackOut_24_0;
                        if (((wl) this).field_x.field_y[param1] != 2) {
                            statePc = 27;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        stackOut_25_0 = (nj) (Object) stackIn_25_0;
                        stackOut_25_1 = 1;
                        stackIn_28_0 = stackOut_25_0;
                        stackIn_28_1 = stackOut_25_1;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 26: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 27: {
                    stackOut_27_0 = (nj) (Object) stackIn_27_0;
                    stackOut_27_1 = 0;
                    stackIn_28_0 = stackOut_27_0;
                    stackIn_28_1 = stackOut_27_1;
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    try {
                        ((nj) (Object) stackIn_28_0).a(stackIn_28_1 != 0);
                        if (param2 == 0) {
                            statePc = 32;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var7.c(param2);
                        var7.a(pi.field_c >> 7, param4 * ((wl) this).field_R * ((wl) this).field_z >> 12, param5);
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 31: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 32: {
                    ((wl) this).field_V[param0] = var7;
                    if (((wl) this).field_j == null) {
                        statePc = 38;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    var8_ref = (Object) (Object) ((wl) this).field_j;
                    // monitorenter ((wl) this).field_j
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    try {
                        ((wl) this).field_j.b((lf) (Object) var7);
                        // monitorexit var8_ref
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var9 = caughtException;
                        // monitorexit var8_ref
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 37: {
                    throw (RuntimeException) (Object) var9;
                }
                case 38: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    wl(lh param0) {
        ((wl) this).field_C = 0;
        ((wl) this).field_jb = true;
        ((wl) this).field_m = -1;
        ((wl) this).field_s = 0;
        ((wl) this).field_J = 0;
        ((wl) this).field_ib = 0;
        ((wl) this).field_hb = 256;
        ((wl) this).field_F = null;
        ((wl) this).field_N = 0;
        ((wl) this).field_z = 64;
        ((wl) this).field_K = -1;
        ((wl) this).field_u = -1;
        ((wl) this).field_l = 0;
        ((wl) this).field_x = param0;
        this.e();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        RuntimeException decompiledCaughtException = null;
        field_E = new int[8000];
        field_T = new int[68];
        var0 = 0;
        try {
          L0: while (true) {
            if (var0 >= 8000) {
              break L0;
            } else {
              field_E[var0] = (int)(8363.0 * Math.pow(2.0, (double)(4608 - var0) / 768.0));
              var0++;
              continue L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          throw decompiledCaughtException;
        }
        var0 = 0;
        try {
          L1: while (true) {
            if (var0 >= 68) {
              break L1;
            } else {
              field_T[var0] = (int)(-2048.0 * Math.sin((double)var0 * 0.0923998));
              var0++;
              continue L1;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          throw decompiledCaughtException;
        }
    }
}
