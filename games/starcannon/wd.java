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
        if (((wd) this).field_o[param0] != null) {
            ((wd) this).field_o[param0].e(param1 * 256 / df.field_n);
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
          if (((wd) this).field_y == 1) {
            break L0;
          } else {
            if (((wd) this).field_y == 2) {
              break L0;
            } else {
              ((wd) this).field_P = 0;
              return false;
            }
          }
        }
        L1: {
          var14 = 0;
          if (((wd) this).field_P != 0) {
            break L1;
          } else {
            L2: {
              if (((wd) this).field_y != 1) {
                break L2;
              } else {
                ((wd) this).field_y = 2;
                ((wd) this).field_i = 0;
                ((wd) this).field_G = 0;
                ((wd) this).field_fb = ((wd) this).field_ab.field_F[((wd) this).field_i];
                ((wd) this).field_S = 0;
                break L2;
              }
            }
            L3: {
              L4: {
                if (((wd) this).field_G >= ((wd) this).field_ab.field_c[((wd) this).field_fb]) {
                  break L4;
                } else {
                  if (((wd) this).field_v == 1) {
                    break L4;
                  } else {
                    L5: {
                      if (((wd) this).field_O == 0) {
                        break L5;
                      } else {
                        if (((wd) this).field_G % ((wd) this).field_O == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    if (((wd) this).field_n <= 0) {
                      break L3;
                    } else {
                      if (((wd) this).field_G % ((wd) this).field_n != 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
              }
              L6: {
                if (((wd) this).field_O == 0) {
                  ((wd) this).field_i = ((wd) this).field_i + 1;
                  break L6;
                } else {
                  L7: {
                    if (((wd) this).field_eb > ((wd) this).field_i) {
                      break L7;
                    } else {
                      var14 = 1;
                      break L7;
                    }
                  }
                  ((wd) this).field_i = ((wd) this).field_eb;
                  break L6;
                }
              }
              L8: {
                if (((wd) this).field_K == -1) {
                  break L8;
                } else {
                  ((wd) this).field_i = ((wd) this).field_K;
                  ((wd) this).field_K = -1;
                  break L8;
                }
              }
              L9: {
                if (((wd) this).field_i < ((wd) this).field_ab.field_M) {
                  break L9;
                } else {
                  ((wd) this).field_i = 0;
                  var14 = 1;
                  break L9;
                }
              }
              L10: {
                ((wd) this).field_G = 0;
                if (((wd) this).field_v != 1) {
                  break L10;
                } else {
                  L11: {
                    ((wd) this).field_eb = ((wd) this).field_eb / 16 * 10 + ((wd) this).field_eb % 16;
                    if (((wd) this).field_eb < ((wd) this).field_ab.field_c[((wd) this).field_fb]) {
                      break L11;
                    } else {
                      ((wd) this).field_eb = 0;
                      break L11;
                    }
                  }
                  ((wd) this).field_G = ((wd) this).field_eb;
                  break L10;
                }
              }
              L12: {
                if (((wd) this).field_M < 0) {
                  break L12;
                } else {
                  L13: {
                    if (((wd) this).field_n >= 0) {
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
                    var15 = ((wd) this).field_M;
                    var16 = ((wd) this).field_k;
                    if (((wd) this).field_t == null) {
                      break L14;
                    } else {
                      var17 = 0;
                      L15: while (true) {
                        if (var17 >= ((wd) this).field_ab.field_p) {
                          ((wd) this).field_ab = ((wd) this).field_t;
                          this.g();
                          ((wd) this).field_y = 2;
                          break L14;
                        } else {
                          this.d(var17);
                          var17++;
                          continue L15;
                        }
                      }
                    }
                  }
                  ((wd) this).field_i = var15;
                  ((wd) this).field_G = var16;
                  var14 = 0;
                  ((wd) this).field_n = 0;
                  ((wd) this).field_M = -1;
                  ((wd) this).field_k = -1;
                  ((wd) this).field_t = null;
                  break L12;
                }
              }
              ((wd) this).field_fb = ((wd) this).field_ab.field_F[((wd) this).field_i];
              ((wd) this).field_S = 0;
              var10 = 0;
              L16: while (true) {
                if (var10 >= ((wd) this).field_G) {
                  ((wd) this).field_K = -1;
                  ((wd) this).field_v = 0;
                  ((wd) this).field_O = 0;
                  break L3;
                } else {
                  var15 = 0;
                  L17: while (true) {
                    if (var15 >= ((wd) this).field_ab.field_p) {
                      var10++;
                      continue L16;
                    } else {
                      L18: {
                        var16 = ((wd) this).field_ab.field_l[((wd) this).field_fb][((wd) this).field_S] & 255;
                        ((wd) this).field_S = ((wd) this).field_S + 1;
                        if (var16 >= 128) {
                          var16 -= 128;
                          break L18;
                        } else {
                          ((wd) this).field_S = ((wd) this).field_S - 1;
                          var16 = 31;
                          break L18;
                        }
                      }
                      L19: {
                        if ((var16 & 1) != 1) {
                          break L19;
                        } else {
                          ((wd) this).field_S = ((wd) this).field_S + 1;
                          break L19;
                        }
                      }
                      L20: {
                        if ((var16 & 2) != 2) {
                          break L20;
                        } else {
                          ((wd) this).field_S = ((wd) this).field_S + 1;
                          break L20;
                        }
                      }
                      L21: {
                        if ((var16 & 4) != 4) {
                          break L21;
                        } else {
                          ((wd) this).field_S = ((wd) this).field_S + 1;
                          break L21;
                        }
                      }
                      L22: {
                        if ((var16 & 8) != 8) {
                          break L22;
                        } else {
                          ((wd) this).field_S = ((wd) this).field_S + 1;
                          break L22;
                        }
                      }
                      if ((var16 & 16) == 16) {
                        ((wd) this).field_S = ((wd) this).field_S + 1;
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
            ((wd) this).field_G = ((wd) this).field_G + 1;
            break L1;
          }
        }
        var15 = 0;
        L23: while (true) {
          if (var15 >= ((wd) this).field_ab.field_p) {
            L24: {
              if (((wd) this).field_P <= 0) {
                break L24;
              } else {
                var15 = 0;
                L25: while (true) {
                  if (var15 >= ((wd) this).field_ab.field_p) {
                    break L24;
                  } else {
                    if (!((wd) this).field_p[var15]) {
                      L26: {
                        if (((wd) this).field_h[var15] == 0) {
                          break L26;
                        } else {
                          ((wd) this).field_D = ((wd) this).field_D + ((wd) this).field_s[var15];
                          if (((wd) this).field_D >= 0) {
                            if (((wd) this).field_D <= 64) {
                              break L26;
                            } else {
                              ((wd) this).field_D = 64;
                              break L26;
                            }
                          } else {
                            ((wd) this).field_D = 0;
                            break L26;
                          }
                        }
                      }
                      L27: {
                        L28: {
                          if (((wd) this).field_A[var15] != 0) {
                            break L28;
                          } else {
                            if (((wd) this).field_C[var15] == 0) {
                              break L27;
                            } else {
                              break L28;
                            }
                          }
                        }
                        L29: {
                          ((wd) this).field_H[var15] = ((wd) this).field_H[var15] + ((wd) this).field_ib[var15];
                          if (((wd) this).field_H[var15] >= 0) {
                            if (((wd) this).field_H[var15] <= 64) {
                              break L29;
                            } else {
                              ((wd) this).field_H[var15] = 64;
                              break L29;
                            }
                          } else {
                            ((wd) this).field_H[var15] = 0;
                            break L29;
                          }
                        }
                        ((wd) this).field_X[var15] = ((wd) this).field_X[var15] + ((wd) this).field_I[var15];
                        if (((wd) this).field_X[var15] >= 0) {
                          if (((wd) this).field_X[var15] <= 255) {
                            break L27;
                          } else {
                            ((wd) this).field_X[var15] = 255;
                            break L27;
                          }
                        } else {
                          ((wd) this).field_X[var15] = 0;
                          break L27;
                        }
                      }
                      L30: {
                        if (((wd) this).field_x[var15] != 1) {
                          break L30;
                        } else {
                          ((wd) this).field_hb[var15] = (((wd) this).field_hb[var15] + ((wd) this).field_Z[var15]) % 68;
                          var2 = field_U[((wd) this).field_hb[var15]] * ((wd) this).field_Q[var15] >> 8;
                          var16 = ((wd) this).field_gb[var15] + var2;
                          this.a(var15, field_jb[var16]);
                          break L30;
                        }
                      }
                      L31: {
                        if (((wd) this).field_kb[var15] <= 0) {
                          break L31;
                        } else {
                          L32: {
                            ((wd) this).field_gb[var15] = ((wd) this).field_gb[var15] - ((wd) this).field_kb[var15] * 4;
                            if (((wd) this).field_gb[var15] >= 0) {
                              if (((wd) this).field_gb[var15] <= 7999) {
                                break L32;
                              } else {
                                ((wd) this).field_gb[var15] = 7999;
                                break L32;
                              }
                            } else {
                              ((wd) this).field_gb[var15] = 0;
                              break L32;
                            }
                          }
                          var16 = field_jb[((wd) this).field_gb[var15]];
                          this.a(var15, var16);
                          break L31;
                        }
                      }
                      L33: {
                        if (((wd) this).field_l[var15] <= 0) {
                          break L33;
                        } else {
                          L34: {
                            ((wd) this).field_gb[var15] = ((wd) this).field_gb[var15] + ((wd) this).field_l[var15] * 4;
                            if (((wd) this).field_gb[var15] >= 0) {
                              if (((wd) this).field_gb[var15] <= 7999) {
                                break L34;
                              } else {
                                ((wd) this).field_gb[var15] = 7999;
                                break L34;
                              }
                            } else {
                              ((wd) this).field_gb[var15] = 0;
                              break L34;
                            }
                          }
                          var16 = field_jb[((wd) this).field_gb[var15]];
                          this.a(var15, var16);
                          break L33;
                        }
                      }
                      if (((wd) this).field_B[var15] > 0) {
                        L35: {
                          if (((wd) this).field_gb[var15] >= ((wd) this).field_Y[var15]) {
                            break L35;
                          } else {
                            ((wd) this).field_gb[var15] = ((wd) this).field_gb[var15] + ((wd) this).field_bb[var15] * 4;
                            if (((wd) this).field_gb[var15] <= ((wd) this).field_Y[var15]) {
                              break L35;
                            } else {
                              ((wd) this).field_gb[var15] = ((wd) this).field_Y[var15];
                              break L35;
                            }
                          }
                        }
                        L36: {
                          if (((wd) this).field_gb[var15] <= ((wd) this).field_Y[var15]) {
                            break L36;
                          } else {
                            ((wd) this).field_gb[var15] = ((wd) this).field_gb[var15] - ((wd) this).field_bb[var15] * 4;
                            if (((wd) this).field_gb[var15] >= ((wd) this).field_Y[var15]) {
                              break L36;
                            } else {
                              ((wd) this).field_gb[var15] = ((wd) this).field_Y[var15];
                              break L36;
                            }
                          }
                        }
                        L37: {
                          if (((wd) this).field_gb[var15] >= 0) {
                            if (((wd) this).field_gb[var15] <= 7999) {
                              break L37;
                            } else {
                              ((wd) this).field_gb[var15] = 7999;
                              break L37;
                            }
                          } else {
                            ((wd) this).field_gb[var15] = 0;
                            break L37;
                          }
                        }
                        var16 = field_jb[((wd) this).field_gb[var15]];
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
              if (var15 >= ((wd) this).field_ab.field_p) {
                L39: {
                  ((wd) this).field_P = ((wd) this).field_P + 1;
                  if (((wd) this).field_P < ((wd) this).field_E) {
                    break L39;
                  } else {
                    ((wd) this).field_P = 0;
                    break L39;
                  }
                }
                return var14 != 0;
              } else {
                if (!((wd) this).field_p[var15]) {
                  L40: {
                    var16 = ((wd) this).field_H[var15];
                    var17 = ((wd) this).field_X[var15];
                    ((wd) this).field_w[var15] = 0;
                    if (((wd) this).field_R[var15] < 0) {
                      break L40;
                    } else {
                      L41: {
                        var3 = ((wd) this).field_R[var15];
                        if ((((wd) this).field_ab.field_a[((wd) this).field_R[var15]] & 1) != 1) {
                          break L41;
                        } else {
                          ((wd) this).field_w[var15] = 1;
                          var4 = ((wd) this).field_lb[var15];
                          var5 = 0;
                          L42: while (true) {
                            if (((wd) this).field_ab.field_k[var3][var5 + 1] >= var4) {
                              L43: {
                                var6 = ((wd) this).field_ab.field_k[var3][var5];
                                var8 = ((wd) this).field_ab.field_k[var3][var5 + 1];
                                var7 = ((wd) this).field_ab.field_f[var3][var5];
                                var9 = ((wd) this).field_ab.field_f[var3][var5 + 1];
                                if (var8 != var6) {
                                  break L43;
                                } else {
                                  var8++;
                                  break L43;
                                }
                              }
                              L44: {
                                var11 = ((var8 - var4) * var7 + (var4 - var6) * var9) / (var8 - var6);
                                var12 = 32768 - ((wd) this).field_J[var15];
                                if (var12 >= 0) {
                                  break L44;
                                } else {
                                  var12 = 0;
                                  break L44;
                                }
                              }
                              L45: {
                                var16 = var16 * var11 * var12 >> 21;
                                if ((((wd) this).field_ab.field_a[var3] & 2) != 2) {
                                  break L45;
                                } else {
                                  if (((wd) this).field_j[var15] != 1) {
                                    break L45;
                                  } else {
                                    if (((wd) this).field_lb[var15] != ((wd) this).field_ab.field_k[var3][((wd) this).field_ab.field_P[var3]]) {
                                      break L45;
                                    } else {
                                      ((wd) this).field_lb[var15] = ((wd) this).field_lb[var15] - 1;
                                      break L45;
                                    }
                                  }
                                }
                              }
                              L46: {
                                if (((wd) this).field_lb[var15] != ((wd) this).field_ab.field_k[var3][((wd) this).field_ab.field_k[var3].length - 1]) {
                                  break L46;
                                } else {
                                  ((wd) this).field_lb[var15] = ((wd) this).field_lb[var15] - 1;
                                  break L46;
                                }
                              }
                              L47: {
                                if (((wd) this).field_j[var15] != 0) {
                                  break L47;
                                } else {
                                  ((wd) this).field_J[var15] = ((wd) this).field_J[var15] + ((wd) this).field_ab.field_i[var3];
                                  break L47;
                                }
                              }
                              ((wd) this).field_lb[var15] = ((wd) this).field_lb[var15] + 1;
                              if ((((wd) this).field_ab.field_a[var3] & 4) != 4) {
                                break L41;
                              } else {
                                if (((wd) this).field_lb[var15] != ((wd) this).field_ab.field_k[var3][((wd) this).field_ab.field_v[var3]]) {
                                  break L41;
                                } else {
                                  ((wd) this).field_lb[var15] = ((wd) this).field_ab.field_k[var3][((wd) this).field_ab.field_K[var3]];
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
                      if ((((wd) this).field_ab.field_b[((wd) this).field_R[var15]] & 1) != 1) {
                        break L40;
                      } else {
                        var4 = ((wd) this).field_N[var15];
                        var5 = 0;
                        L48: while (true) {
                          if (((wd) this).field_ab.field_r[var3][var5 + 1] >= var4) {
                            L49: {
                              var6 = ((wd) this).field_ab.field_r[var3][var5];
                              var8 = ((wd) this).field_ab.field_r[var3][var5 + 1];
                              var7 = ((wd) this).field_ab.field_H[var3][var5];
                              var9 = ((wd) this).field_ab.field_H[var3][var5 + 1];
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
                              if ((((wd) this).field_ab.field_b[var3] & 2) != 2) {
                                break L50;
                              } else {
                                if (((wd) this).field_j[var15] != 1) {
                                  break L50;
                                } else {
                                  if (((wd) this).field_N[var15] != ((wd) this).field_ab.field_r[var3][((wd) this).field_ab.field_C[var3]]) {
                                    break L50;
                                  } else {
                                    ((wd) this).field_N[var15] = ((wd) this).field_N[var15] - 1;
                                    break L50;
                                  }
                                }
                              }
                            }
                            L51: {
                              if (((wd) this).field_N[var15] != ((wd) this).field_ab.field_r[var3][((wd) this).field_ab.field_r[var3].length - 1]) {
                                break L51;
                              } else {
                                ((wd) this).field_N[var15] = ((wd) this).field_N[var15] - 1;
                                break L51;
                              }
                            }
                            ((wd) this).field_N[var15] = ((wd) this).field_N[var15] + 1;
                            if ((((wd) this).field_ab.field_b[var3] & 4) != 4) {
                              break L40;
                            } else {
                              if (((wd) this).field_N[var15] != ((wd) this).field_ab.field_r[var3][((wd) this).field_ab.field_O[var3]]) {
                                break L40;
                              } else {
                                ((wd) this).field_N[var15] = ((wd) this).field_ab.field_r[var3][((wd) this).field_ab.field_z[var3]];
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
              if (((wd) this).field_P != 0) {
                if (((wd) this).field_F[var15] >= 0) {
                  var16 = ((wd) this).field_F[var15];
                  break L52;
                } else {
                  var15++;
                  continue L23;
                }
              } else {
                var16 = ((wd) this).field_S;
                break L52;
              }
            }
            L53: {
              ((wd) this).field_F[var15] = -1;
              var17 = var16;
              var18 = -1;
              var19 = -1;
              var20 = -1;
              var21 = -1;
              var22 = -1;
              var23 = 0;
              var24 = ((wd) this).field_ab.field_l[((wd) this).field_fb][var16] & 255;
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
                var18 = ((wd) this).field_ab.field_l[((wd) this).field_fb][var16] & 255;
                var16++;
                break L54;
              }
            }
            L55: {
              if ((var24 & 2) != 2) {
                break L55;
              } else {
                var19 = (((wd) this).field_ab.field_l[((wd) this).field_fb][var16] & 255) - 1;
                var16++;
                break L55;
              }
            }
            L56: {
              if ((var24 & 4) != 4) {
                break L56;
              } else {
                var20 = (((wd) this).field_ab.field_l[((wd) this).field_fb][var16] & 255) - 16;
                var16++;
                break L56;
              }
            }
            L57: {
              if ((var24 & 8) != 8) {
                break L57;
              } else {
                var22 = ((wd) this).field_ab.field_l[((wd) this).field_fb][var16] & 255;
                var16++;
                break L57;
              }
            }
            L58: {
              if ((var24 & 16) != 16) {
                break L58;
              } else {
                var23 = ((wd) this).field_ab.field_l[((wd) this).field_fb][var16] & 255;
                var16++;
                break L58;
              }
            }
            L59: {
              if (((wd) this).field_P != 0) {
                break L59;
              } else {
                ((wd) this).field_S = var16;
                break L59;
              }
            }
            if (!((wd) this).field_p[var15]) {
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
                    if (((wd) this).field_P != var23) {
                      ((wd) this).field_F[var15] = var17;
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
                  if (((wd) this).field_P >= var23) {
                    break L62;
                  } else {
                    ((wd) this).field_F[var15] = var17;
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
                    ((wd) this).field_A[var15] = 2;
                    ((wd) this).field_ib[var15] = 80 - var20;
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
                    ((wd) this).field_A[var15] = 2;
                    ((wd) this).field_ib[var15] = var20 - 96;
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
                    var20 = ((wd) this).field_H[var15] - (var20 - 112);
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
                    var20 = ((wd) this).field_H[var15] + (var20 - 128);
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
                    ((wd) this).field_C[var15] = 2;
                    ((wd) this).field_I[var15] = 192 - var20;
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
                    ((wd) this).field_C[var15] = 2;
                    ((wd) this).field_I[var15] = var20 - 208;
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
                  if (((wd) this).field_O > 1) {
                    ((wd) this).field_O = 1;
                    break L71;
                  } else {
                    ((wd) this).field_v = 1;
                    ((wd) this).field_eb = var23;
                    break L71;
                  }
                }
              }
              L72: {
                if (var22 != 15) {
                  break L72;
                } else {
                  if (var23 >= 32) {
                    ((wd) this).field_q = var23;
                    break L72;
                  } else {
                    ((wd) this).field_E = var23;
                    break L72;
                  }
                }
              }
              L73: {
                if (var22 != 16) {
                  break L73;
                } else {
                  ((wd) this).field_D = var23;
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
                    if (((wd) this).field_O > 1) {
                      break L75;
                    } else {
                      ((wd) this).field_O = 1;
                      ((wd) this).field_eb = var23;
                      break L75;
                    }
                  }
                } else {
                  if (var22 != 11) {
                    break L75;
                  } else {
                    if (((wd) this).field_O > 1) {
                      break L75;
                    } else {
                      ((wd) this).field_O = 1;
                      ((wd) this).field_eb = var23;
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
                    ((wd) this).field_lb[var15] = var23;
                    if (((wd) this).field_lb[var15] < ((wd) this).field_ab.field_k[var3][((wd) this).field_ab.field_k[var3].length - 1]) {
                      break L78;
                    } else {
                      ((wd) this).field_lb[var15] = ((wd) this).field_ab.field_k[var3][((wd) this).field_ab.field_k[var3].length - 1] - 1;
                      break L78;
                    }
                  }
                  ((wd) this).field_N[var15] = var23;
                  if (((wd) this).field_N[var15] >= ((wd) this).field_ab.field_r[var3][((wd) this).field_ab.field_r[var3].length - 1]) {
                    ((wd) this).field_N[var15] = ((wd) this).field_ab.field_r[var3][((wd) this).field_ab.field_r[var3].length - 1] - 1;
                    if (var19 < 0) {
                      break L77;
                    } else {
                      if (var18 > 96) {
                        break L77;
                      } else {
                        ((wd) this).field_lb[var15] = 0;
                        ((wd) this).field_N[var15] = 0;
                        ((wd) this).field_j[var15] = 1;
                        ((wd) this).field_J[var15] = 0;
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
                        ((wd) this).field_lb[var15] = 0;
                        ((wd) this).field_N[var15] = 0;
                        ((wd) this).field_j[var15] = 1;
                        ((wd) this).field_J[var15] = 0;
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
                      ((wd) this).field_lb[var15] = 0;
                      ((wd) this).field_N[var15] = 0;
                      ((wd) this).field_j[var15] = 1;
                      ((wd) this).field_J[var15] = 0;
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
                      var20 = ((wd) this).field_ab.field_E[((wd) this).field_r[var15]];
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
                      var21 = ((wd) this).field_ab.field_q[((wd) this).field_r[var15]];
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
                              var20 = ((wd) this).field_H[var15];
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
                              var21 = ((wd) this).field_X[var15];
                              break L84;
                            }
                          }
                        }
                        L85: {
                          if (var19 != -1) {
                            ((wd) this).field_R[var15] = var19;
                            if (var18 >= 96) {
                              var19 = ((wd) this).field_ab.field_j[var19][95];
                              break L85;
                            } else {
                              var19 = ((wd) this).field_ab.field_j[var19][var18];
                              break L85;
                            }
                          } else {
                            var19 = ((wd) this).field_r[var15];
                            break L85;
                          }
                        }
                        L86: {
                          if (var20 >= 0) {
                            break L86;
                          } else {
                            var20 = ((wd) this).field_ab.field_E[var19];
                            break L86;
                          }
                        }
                        L87: {
                          if (var21 >= 0) {
                            break L87;
                          } else {
                            var21 = ((wd) this).field_ab.field_q[var19];
                            break L87;
                          }
                        }
                        L88: {
                          var25 = 7680 - (var18 + ((wd) this).field_ab.field_J[var19]) * 64 - ((wd) this).field_ab.field_o[var19] / 2;
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
                          ((wd) this).field_Y[var15] = var25;
                          var26 = field_jb[var25];
                          ((wd) this).field_r[var15] = var19;
                          ((wd) this).field_H[var15] = var20;
                          ((wd) this).field_X[var15] = var21;
                          ((wd) this).field_gb[var15] = var25;
                          var1 = 0;
                          if (var22 != 9) {
                            break L89;
                          } else {
                            if (var23 * 256 <= ((wd) this).field_ab.field_d[var19]) {
                              var1 = var23 * 256;
                              break L89;
                            } else {
                              var1 = ((wd) this).field_ab.field_d[var19];
                              break L89;
                            }
                          }
                        }
                        this.a(var15, var19, var1, var26, var20, var21);
                        ((wd) this).field_hb[var15] = 0;
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
                      ((wd) this).field_H[var15] = var20;
                      break L91;
                    }
                  }
                  if (var21 < 0) {
                    break L81;
                  } else {
                    ((wd) this).field_X[var15] = var21;
                    break L81;
                  }
                } else {
                  if (((wd) this).field_w[var15] != 1) {
                    this.d(var15);
                    break L81;
                  } else {
                    ((wd) this).field_j[var15] = 0;
                    break L81;
                  }
                }
              }
              L92: {
                if (var22 != 3) {
                  if (var22 == 5) {
                    break L92;
                  } else {
                    ((wd) this).field_B[var15] = 0;
                    break L92;
                  }
                } else {
                  L93: {
                    ((wd) this).field_B[var15] = 1;
                    if (var18 < 0) {
                      break L93;
                    } else {
                      if (var18 > 96) {
                        break L93;
                      } else {
                        L94: {
                          var19 = ((wd) this).field_r[var15];
                          var25 = 7680 - (var18 + ((wd) this).field_ab.field_J[var19]) * 64 - ((wd) this).field_ab.field_o[var19] / 2;
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
                        ((wd) this).field_Y[var15] = var25;
                        break L93;
                      }
                    }
                  }
                  if (var23 == 0) {
                    break L92;
                  } else {
                    ((wd) this).field_bb[var15] = var23;
                    if (((wd) this).field_ab.field_m != 0) {
                      break L92;
                    } else {
                      ((wd) this).field_bb[var15] = ((wd) this).field_bb[var15] * 2;
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
                      if (((wd) this).field_x[var15] == 0) {
                        break L96;
                      } else {
                        var25 = field_jb[((wd) this).field_gb[var15]];
                        this.a(var15, var25);
                        break L96;
                      }
                    }
                    ((wd) this).field_hb[var15] = 0;
                    ((wd) this).field_x[var15] = 0;
                    break L95;
                  }
                } else {
                  L97: {
                    ((wd) this).field_x[var15] = 1;
                    if (var23 / 16 <= 0) {
                      break L97;
                    } else {
                      ((wd) this).field_Z[var15] = var23 / 16;
                      break L97;
                    }
                  }
                  if ((var23 & 15) <= 0) {
                    break L95;
                  } else {
                    ((wd) this).field_Q[var15] = var23 & 15;
                    break L95;
                  }
                }
              }
              L98: {
                if (var22 != 17) {
                  ((wd) this).field_h[var15] = 0;
                  break L98;
                } else {
                  ((wd) this).field_h[var15] = 1;
                  if (var23 == 0) {
                    break L98;
                  } else {
                    ((wd) this).field_s[var15] = (var23 & 240) / 16 - (var23 & 15);
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
                        if (((wd) this).field_A[var15] != 2) {
                          ((wd) this).field_A[var15] = 0;
                          break L99;
                        } else {
                          ((wd) this).field_A[var15] = 1;
                          break L99;
                        }
                      } else {
                        break L100;
                      }
                    }
                  }
                }
                ((wd) this).field_A[var15] = 1;
                if (var23 == 0) {
                  break L99;
                } else {
                  ((wd) this).field_ib[var15] = (var23 & 240) / 16 - (var23 & 15);
                  break L99;
                }
              }
              L101: {
                if (var22 != 25) {
                  if (((wd) this).field_C[var15] != 2) {
                    ((wd) this).field_C[var15] = 0;
                    break L101;
                  } else {
                    ((wd) this).field_C[var15] = 1;
                    break L101;
                  }
                } else {
                  ((wd) this).field_C[var15] = 1;
                  if (var23 == 0) {
                    break L101;
                  } else {
                    ((wd) this).field_I[var15] = (var23 & 240) / 16 - (var23 & 15);
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
                      ((wd) this).field_L[var15] = var23;
                      break L103;
                    } else {
                      var23 = ((wd) this).field_L[var15];
                      break L103;
                    }
                  }
                  ((wd) this).field_H[var15] = ((wd) this).field_H[var15] + var23;
                  if (((wd) this).field_H[var15] >= 0) {
                    if (((wd) this).field_H[var15] <= 64) {
                      break L102;
                    } else {
                      ((wd) this).field_H[var15] = 64;
                      break L102;
                    }
                  } else {
                    ((wd) this).field_H[var15] = 0;
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
                      ((wd) this).field_m[var15] = var23;
                      break L105;
                    } else {
                      var23 = ((wd) this).field_m[var15];
                      break L105;
                    }
                  }
                  ((wd) this).field_H[var15] = ((wd) this).field_H[var15] - var23;
                  if (((wd) this).field_H[var15] >= 0) {
                    if (((wd) this).field_H[var15] <= 64) {
                      break L104;
                    } else {
                      ((wd) this).field_H[var15] = 64;
                      break L104;
                    }
                  } else {
                    ((wd) this).field_H[var15] = 0;
                    break L104;
                  }
                }
              }
              L106: {
                if (var22 != 1) {
                  ((wd) this).field_kb[var15] = 0;
                  break L106;
                } else {
                  if (var23 == 0) {
                    break L106;
                  } else {
                    ((wd) this).field_kb[var15] = var23;
                    break L106;
                  }
                }
              }
              L107: {
                if (var22 != 2) {
                  ((wd) this).field_l[var15] = 0;
                  break L107;
                } else {
                  if (var23 == 0) {
                    break L107;
                  } else {
                    ((wd) this).field_l[var15] = var23;
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
                      ((wd) this).field_T[var15] = var23;
                      break L109;
                    } else {
                      var23 = ((wd) this).field_T[var15];
                      break L109;
                    }
                  }
                  L110: {
                    ((wd) this).field_gb[var15] = ((wd) this).field_gb[var15] - var23 * 4;
                    if (((wd) this).field_gb[var15] >= 0) {
                      if (((wd) this).field_gb[var15] <= 7999) {
                        break L110;
                      } else {
                        ((wd) this).field_gb[var15] = 7999;
                        break L110;
                      }
                    } else {
                      ((wd) this).field_gb[var15] = 0;
                      break L110;
                    }
                  }
                  var25 = field_jb[((wd) this).field_gb[var15]];
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
                      ((wd) this).field_V[var15] = var23;
                      break L112;
                    } else {
                      var23 = ((wd) this).field_V[var15];
                      break L112;
                    }
                  }
                  L113: {
                    ((wd) this).field_gb[var15] = ((wd) this).field_gb[var15] + var23 * 4;
                    if (((wd) this).field_gb[var15] >= 0) {
                      if (((wd) this).field_gb[var15] <= 7999) {
                        break L113;
                      } else {
                        ((wd) this).field_gb[var15] = 7999;
                        break L113;
                      }
                    } else {
                      ((wd) this).field_gb[var15] = 0;
                      break L113;
                    }
                  }
                  var25 = field_jb[((wd) this).field_gb[var15]];
                  this.a(var15, var25);
                  break L111;
                }
              }
              if (var22 == 33) {
                if (var23 / 16 != 1) {
                  L114: {
                    var23 = var23 & 15;
                    if (var23 != 0) {
                      ((wd) this).field_u[var15] = var23;
                      break L114;
                    } else {
                      var23 = ((wd) this).field_u[var15];
                      break L114;
                    }
                  }
                  L115: {
                    ((wd) this).field_gb[var15] = ((wd) this).field_gb[var15] + var23;
                    if (((wd) this).field_gb[var15] >= 0) {
                      if (((wd) this).field_gb[var15] <= 7999) {
                        break L115;
                      } else {
                        ((wd) this).field_gb[var15] = 7999;
                        break L115;
                      }
                    } else {
                      ((wd) this).field_gb[var15] = 0;
                      break L115;
                    }
                  }
                  var25 = field_jb[((wd) this).field_gb[var15]];
                  this.a(var15, var25);
                  var15++;
                  continue L23;
                } else {
                  L116: {
                    var23 = var23 & 15;
                    if (var23 != 0) {
                      ((wd) this).field_z[var15] = var23;
                      break L116;
                    } else {
                      var23 = ((wd) this).field_z[var15];
                      break L116;
                    }
                  }
                  L117: {
                    ((wd) this).field_gb[var15] = ((wd) this).field_gb[var15] - var23;
                    if (((wd) this).field_gb[var15] >= 0) {
                      if (((wd) this).field_gb[var15] <= 7999) {
                        break L117;
                      } else {
                        ((wd) this).field_gb[var15] = 7999;
                        break L117;
                      }
                    } else {
                      ((wd) this).field_gb[var15] = 0;
                      break L117;
                    }
                  }
                  var25 = field_jb[((wd) this).field_gb[var15]];
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

    public static void c() {
        field_jb = null;
        field_U = null;
    }

    private final void g() {
        ((wd) this).field_H = new int[((wd) this).field_ab.field_p];
        ((wd) this).field_X = new int[((wd) this).field_ab.field_p];
        ((wd) this).field_gb = new int[((wd) this).field_ab.field_p];
        ((wd) this).field_r = new int[((wd) this).field_ab.field_p];
        ((wd) this).field_R = new int[((wd) this).field_ab.field_p];
        ((wd) this).field_s = new int[((wd) this).field_ab.field_p];
        ((wd) this).field_ib = new int[((wd) this).field_ab.field_p];
        ((wd) this).field_I = new int[((wd) this).field_ab.field_p];
        ((wd) this).field_Z = new int[((wd) this).field_ab.field_p];
        ((wd) this).field_Q = new int[((wd) this).field_ab.field_p];
        ((wd) this).field_hb = new int[((wd) this).field_ab.field_p];
        ((wd) this).field_x = new int[((wd) this).field_ab.field_p];
        ((wd) this).field_L = new int[((wd) this).field_ab.field_p];
        ((wd) this).field_T = new int[((wd) this).field_ab.field_p];
        ((wd) this).field_z = new int[((wd) this).field_ab.field_p];
        ((wd) this).field_m = new int[((wd) this).field_ab.field_p];
        ((wd) this).field_V = new int[((wd) this).field_ab.field_p];
        ((wd) this).field_u = new int[((wd) this).field_ab.field_p];
        ((wd) this).field_kb = new int[((wd) this).field_ab.field_p];
        ((wd) this).field_l = new int[((wd) this).field_ab.field_p];
        ((wd) this).field_Y = new int[((wd) this).field_ab.field_p];
        ((wd) this).field_bb = new int[((wd) this).field_ab.field_p];
        ((wd) this).field_F = new int[((wd) this).field_ab.field_p];
        ((wd) this).field_lb = new int[((wd) this).field_ab.field_p];
        ((wd) this).field_N = new int[((wd) this).field_ab.field_p];
        ((wd) this).field_w = new int[((wd) this).field_ab.field_p];
        ((wd) this).field_j = new int[((wd) this).field_ab.field_p];
        ((wd) this).field_J = new int[((wd) this).field_ab.field_p];
        ((wd) this).field_B = new int[((wd) this).field_ab.field_p];
        ((wd) this).field_A = new int[((wd) this).field_ab.field_p];
        ((wd) this).field_C = new int[((wd) this).field_ab.field_p];
        ((wd) this).field_h = new int[((wd) this).field_ab.field_p];
        ((wd) this).field_p = new boolean[((wd) this).field_ab.field_p];
        ((wd) this).field_o = new fj[((wd) this).field_ab.field_p];
        this.d();
    }

    final void b() {
        int var1 = 0;
        var1 = 0;
        L0: while (true) {
          if (var1 >= ((wd) this).field_ab.field_p) {
            return;
          } else {
            if (((wd) this).field_o[var1] != null) {
              ((wd) this).field_g.b((c) (Object) ((wd) this).field_o[var1]);
              var1++;
              continue L0;
            } else {
              var1++;
              continue L0;
            }
          }
        }
    }

    private final void a(int param0, int param1, int param2) {
        if (((wd) this).field_o[param0] != null) {
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
            ((wd) this).field_o[param0].b(df.field_n >> 7, param1 * ((wd) this).field_D * ((wd) this).field_cb >> 12, param2);
        }
    }

    private final void d() {
        int var1 = 0;
        int var2 = 0;
        ((wd) this).field_P = 0;
        ((wd) this).field_y = 0;
        ((wd) this).field_S = 0;
        ((wd) this).field_G = 0;
        ((wd) this).field_i = 0;
        ((wd) this).field_fb = 0;
        ((wd) this).field_E = ((wd) this).field_ab.field_w;
        ((wd) this).field_q = ((wd) this).field_ab.field_u;
        ((wd) this).field_D = 64;
        var1 = 0;
        L0: while (true) {
          if (var1 >= ((wd) this).field_ab.field_p) {
            ((wd) this).field_n = 0;
            ((wd) this).field_t = null;
            ((wd) this).field_M = -1;
            ((wd) this).field_k = -1;
            ((wd) this).field_O = 0;
            ((wd) this).field_eb = 0;
            ((wd) this).field_K = -1;
            ((wd) this).field_v = 0;
            var2 = 0;
            var1 = var2;
            L1: while (true) {
              if (var2 >= ((wd) this).field_ab.field_p) {
                ((wd) this).field_y = 1;
                return;
              } else {
                ((wd) this).field_o[var2] = null;
                ((wd) this).field_p[var2] = false;
                var2++;
                continue L1;
              }
            }
          } else {
            ((wd) this).field_ib[var1] = 0;
            ((wd) this).field_I[var1] = 0;
            ((wd) this).field_Z[var1] = 0;
            ((wd) this).field_Q[var1] = 0;
            ((wd) this).field_hb[var1] = 0;
            ((wd) this).field_x[var1] = 0;
            ((wd) this).field_L[var1] = 0;
            ((wd) this).field_T[var1] = 0;
            ((wd) this).field_z[var1] = 0;
            ((wd) this).field_m[var1] = 0;
            ((wd) this).field_V[var1] = 0;
            ((wd) this).field_u[var1] = 0;
            ((wd) this).field_kb[var1] = 0;
            ((wd) this).field_l[var1] = 0;
            ((wd) this).field_Y[var1] = 0;
            ((wd) this).field_bb[var1] = 0;
            ((wd) this).field_F[var1] = -1;
            ((wd) this).field_lb[var1] = 0;
            ((wd) this).field_N[var1] = 0;
            ((wd) this).field_w[var1] = 0;
            ((wd) this).field_j[var1] = 0;
            ((wd) this).field_J[var1] = 0;
            ((wd) this).field_B[var1] = 0;
            ((wd) this).field_h[var1] = 0;
            ((wd) this).field_A[var1] = 0;
            ((wd) this).field_C[var1] = 0;
            ((wd) this).field_r[var1] = 0;
            ((wd) this).field_H[var1] = 0;
            ((wd) this).field_X[var1] = 128;
            ((wd) this).field_gb[var1] = 0;
            ((wd) this).field_R[var1] = -1;
            var1++;
            continue L0;
          }
        }
    }

    private final void d(int param0) {
        if (((wd) this).field_o[param0] != null) {
            ((wd) this).field_o[param0].h(df.field_n >> 7);
            ((wd) this).field_o[param0] = null;
        }
    }

    final void f() {
        if (((wd) this).field_g != null) {
            throw new RuntimeException();
        }
        this.d();
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        fj var7 = null;
        Object var8 = null;
        Throwable var9 = null;
        ud stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        ud stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        ud stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        fj stackIn_16_0 = null;
        fj stackIn_17_0 = null;
        fj stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        fj stackIn_19_0 = null;
        fj stackIn_20_0 = null;
        fj stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        Throwable decompiledCaughtException = null;
        ud stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        ud stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        ud stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        fj stackOut_15_0 = null;
        fj stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        fj stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        fj stackOut_18_0 = null;
        fj stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        fj stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        L0: {
          this.d(param0);
          if (param3 <= field_jb[7999]) {
            break L0;
          } else {
            if (param3 < field_jb[0]) {
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
                stackOut_12_0 = ((wd) this).field_ab.field_L[param1];
                stackOut_12_1 = param3 * 256 / df.field_n;
                stackIn_14_0 = stackOut_12_0;
                stackIn_14_1 = stackOut_12_1;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                if (param2 == 0) {
                  stackOut_14_0 = (ud) (Object) stackIn_14_0;
                  stackOut_14_1 = stackIn_14_1;
                  stackOut_14_2 = param4 * ((wd) this).field_D * ((wd) this).field_cb >> 12;
                  stackIn_15_0 = stackOut_14_0;
                  stackIn_15_1 = stackOut_14_1;
                  stackIn_15_2 = stackOut_14_2;
                  break L3;
                } else {
                  stackOut_13_0 = (ud) (Object) stackIn_13_0;
                  stackOut_13_1 = stackIn_13_1;
                  stackOut_13_2 = 0;
                  stackIn_15_0 = stackOut_13_0;
                  stackIn_15_1 = stackOut_13_1;
                  stackIn_15_2 = stackOut_13_2;
                  break L3;
                }
              }
              L4: {
                var7 = fj.a(stackIn_15_0, stackIn_15_1, stackIn_15_2, param5);
                var7.b(((wd) this).field_ab.field_e[param1], ((wd) this).field_ab.field_A[param1]);
                stackOut_15_0 = (fj) var7;
                stackIn_17_0 = stackOut_15_0;
                stackIn_16_0 = stackOut_15_0;
                if (((wd) this).field_ab.field_B[param1] == 0) {
                  stackOut_17_0 = (fj) (Object) stackIn_17_0;
                  stackOut_17_1 = 0;
                  stackIn_18_0 = stackOut_17_0;
                  stackIn_18_1 = stackOut_17_1;
                  break L4;
                } else {
                  stackOut_16_0 = (fj) (Object) stackIn_16_0;
                  stackOut_16_1 = -1;
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_18_1 = stackOut_16_1;
                  break L4;
                }
              }
              L5: {
                ((fj) (Object) stackIn_18_0).g(stackIn_18_1);
                stackOut_18_0 = (fj) var7;
                stackIn_20_0 = stackOut_18_0;
                stackIn_19_0 = stackOut_18_0;
                if (((wd) this).field_ab.field_B[param1] != 2) {
                  stackOut_20_0 = (fj) (Object) stackIn_20_0;
                  stackOut_20_1 = 0;
                  stackIn_21_0 = stackOut_20_0;
                  stackIn_21_1 = stackOut_20_1;
                  break L5;
                } else {
                  stackOut_19_0 = (fj) (Object) stackIn_19_0;
                  stackOut_19_1 = 1;
                  stackIn_21_0 = stackOut_19_0;
                  stackIn_21_1 = stackOut_19_1;
                  break L5;
                }
              }
              L6: {
                ((fj) (Object) stackIn_21_0).a(stackIn_21_1 != 0);
                if (param2 == 0) {
                  break L6;
                } else {
                  var7.d(param2);
                  var7.b(df.field_n >> 7, param4 * ((wd) this).field_D * ((wd) this).field_cb >> 12, param5);
                  break L6;
                }
              }
              L7: {
                ((wd) this).field_o[param0] = var7;
                if (((wd) this).field_g == null) {
                  break L7;
                } else {
                  var8 = (Object) (Object) ((wd) this).field_g;
                  synchronized (var8) {
                    L8: {
                      ((wd) this).field_g.b((c) (Object) var7);
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

    final int a(vi param0) {
        if (this.e()) {
            if (!((wd) this).field_W) {
                return -1;
            }
        }
        int var3 = df.field_n;
        int var4 = (var3 << 9) + (var3 << 7);
        return var4 / (((wd) this).field_q * ((wd) this).field_db);
    }

    final void a() {
        int var1 = 0;
        var1 = 0;
        L0: while (true) {
          if (var1 >= ((wd) this).field_ab.field_p) {
            return;
          } else {
            if (((wd) this).field_o[var1] != null) {
              ((wd) this).field_g.a((c) (Object) ((wd) this).field_o[var1]);
              var1++;
              continue L0;
            } else {
              var1++;
              continue L0;
            }
          }
        }
    }

    final synchronized void a(int param0) {
        ((wd) this).field_cb = param0;
    }

    wd(lh param0) {
        ((wd) this).field_v = 0;
        ((wd) this).field_y = 0;
        ((wd) this).field_cb = 64;
        ((wd) this).field_eb = 0;
        ((wd) this).field_n = 0;
        ((wd) this).field_M = -1;
        ((wd) this).field_O = 0;
        ((wd) this).field_K = -1;
        ((wd) this).field_t = null;
        ((wd) this).field_W = true;
        ((wd) this).field_P = 0;
        ((wd) this).field_k = -1;
        ((wd) this).field_db = 256;
        ((wd) this).field_ab = param0;
        this.g();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_U = new int[68];
        field_jb = new int[8000];
        for (var0 = 0; var0 < 8000; var0++) {
            field_jb[var0] = (int)(8363.0 * Math.pow(2.0, (double)(4608 - var0) / 768.0));
        }
        for (var0 = 0; var0 < 68; var0++) {
            field_U[var0] = (int)(-2048.0 * Math.sin((double)var0 * 0.0923998));
        }
    }
}
