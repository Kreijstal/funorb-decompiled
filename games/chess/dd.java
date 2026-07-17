/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dd extends kk {
    private int field_q;
    private int[] field_N;
    private int[] field_P;
    private int[] field_s;
    private int[] field_y;
    private int[] field_gb;
    private byte[] field_u;
    private boolean field_Y;
    private int[] field_z;
    private int field_A;
    private byte[] field_h;
    private int[] field_F;
    private int[] field_cb;
    private byte[] field_H;
    private int field_ab;
    private int[] field_R;
    private int[] field_o;
    private short[] field_S;
    private static int[] field_L;
    private static int[] field_j;
    private short field_C;
    private static int field_m;
    private static int[] field_M;
    private static int[] field_T;
    private static int[] field_n;
    private static int[] field_W;
    private static boolean[] field_V;
    private static boolean[] field_v;
    private static int[] field_w;
    private static int[][] field_fb;
    private static int[] field_bb;
    private static int[] field_G;
    private int field_p;
    private int[] field_i;
    private static int[] field_db;
    private static int[][] field_Q;
    private static int field_t;
    private static int[] field_K;
    private static int[] field_B;
    private static int[] field_l;
    private static int[][] field_U;
    static int field_Z;
    static int field_eb;
    private static boolean field_r;
    private static int[] field_I;
    static int field_D;
    private static int[] field_k;
    private int[] field_X;
    private static int[] field_O;
    static int field_x;
    private static int[] field_E;

    private final void e(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (!field_v[param0]) {
          L0: {
            var2 = ((dd) this).field_gb[param0];
            var3 = ((dd) this).field_P[param0];
            var4 = ((dd) this).field_R[param0];
            nh.field_k = field_V[param0];
            if (((dd) this).field_h != null) {
              nh.field_b = ((dd) this).field_h[param0] & 255;
              break L0;
            } else {
              nh.field_b = 0;
              break L0;
            }
          }
          L1: {
            L2: {
              if (((dd) this).field_S == null) {
                break L2;
              } else {
                if (((dd) this).field_S[param0] != -1) {
                  L3: {
                    L4: {
                      if (((dd) this).field_H == null) {
                        break L4;
                      } else {
                        if (((dd) this).field_H[param0] == -1) {
                          break L4;
                        } else {
                          var8 = ((dd) this).field_H[param0] & 255;
                          var5 = ((dd) this).field_N[var8];
                          var6 = ((dd) this).field_X[var8];
                          var7 = ((dd) this).field_i[var8];
                          break L3;
                        }
                      }
                    }
                    var5 = var2;
                    var6 = var3;
                    var7 = var4;
                    break L3;
                  }
                  if (((dd) this).field_s[param0] != -1) {
                    nh.a(field_G[var2], field_G[var3], field_G[var4], field_M[var2], field_M[var3], field_M[var4], ((dd) this).field_z[param0], ((dd) this).field_o[param0], ((dd) this).field_s[param0], field_K[var5], field_K[var6], field_K[var7], field_E[var5], field_E[var6], field_E[var7], field_db[var5], field_db[var6], field_db[var7], (int) ((dd) this).field_S[param0]);
                    break L1;
                  } else {
                    nh.a(field_G[var2], field_G[var3], field_G[var4], field_M[var2], field_M[var3], field_M[var4], ((dd) this).field_z[param0], ((dd) this).field_z[param0], ((dd) this).field_z[param0], field_K[var5], field_K[var6], field_K[var7], field_E[var5], field_E[var6], field_E[var7], field_db[var5], field_db[var6], field_db[var7], (int) ((dd) this).field_S[param0]);
                    break L1;
                  }
                } else {
                  break L2;
                }
              }
            }
            if (((dd) this).field_s[param0] != -1) {
              nh.a(field_G[var2], field_G[var3], field_G[var4], field_M[var2], field_M[var3], field_M[var4], ((dd) this).field_z[param0] & 65535, ((dd) this).field_o[param0] & 65535, ((dd) this).field_s[param0] & 65535);
              break L1;
            } else {
              nh.a(field_G[var2], field_G[var3], field_G[var4], field_M[var2], field_M[var3], field_M[var4], nh.field_d[((dd) this).field_z[param0] & 65535]);
              break L1;
            }
          }
          return;
        } else {
          this.b(param0);
          return;
        }
    }

    public static void b() {
        field_V = null;
        field_v = null;
        field_M = null;
        field_G = null;
        field_k = null;
        field_K = null;
        field_E = null;
        field_db = null;
        field_O = null;
        field_fb = null;
        field_w = null;
        field_U = null;
        field_l = null;
        field_L = null;
        field_bb = null;
        field_Q = null;
        field_B = null;
        field_T = null;
        field_W = null;
        field_n = null;
        field_j = null;
        field_I = null;
    }

    private final void a(boolean param0, boolean param1, long param2, int param3, int param4) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14_int = 0;
        int[] var14 = null;
        int var15_int = 0;
        int[] var15 = null;
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
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int[] var45 = null;
        int[] var46 = null;
        int[] var47 = null;
        int[] var48 = null;
        int[] var49 = null;
        int stackIn_74_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_72_0 = 0;
        if (param4 < 1600) {
          L0: {
            field_m = param4;
            var7 = 0;
            if (field_r) {
              break L0;
            } else {
              var8 = 0;
              L1: while (true) {
                if (var8 >= 1600) {
                  var8 = 0;
                  L2: while (true) {
                    if (var8 >= 32) {
                      field_t = 0;
                      break L0;
                    } else {
                      field_w[var8] = 0;
                      var8++;
                      continue L2;
                    }
                  }
                } else {
                  field_O[var8] = 0;
                  var8++;
                  continue L1;
                }
              }
            }
          }
          var8 = 0;
          L3: while (true) {
            if (var8 >= ((dd) this).field_A) {
              L4: {
                if (!field_r) {
                  if (((dd) this).field_u != null) {
                    var8 = 0;
                    L5: while (true) {
                      if (var8 >= 12) {
                        var8 = param4 - 1;
                        L6: while (true) {
                          if (var8 < 0) {
                            break L4;
                          } else {
                            L7: {
                              var9 = field_O[var8];
                              if (var9 <= 0) {
                                break L7;
                              } else {
                                L8: {
                                  if (var9 <= 64) {
                                    var10 = var9;
                                    break L8;
                                  } else {
                                    var10 = 64;
                                    break L8;
                                  }
                                }
                                var47 = field_fb[var8];
                                var12 = 0;
                                L9: while (true) {
                                  if (var12 >= var10) {
                                    break L7;
                                  } else {
                                    var13 = var47[var12];
                                    var14_int = ((dd) this).field_u[var13];
                                    field_bb[var14_int] = field_bb[var14_int] + 1;
                                    var15_int = field_bb[var14_int];
                                    field_Q[var14_int][var15_int] = var13;
                                    if (var14_int >= 10) {
                                      if (var14_int != 10) {
                                        field_T[var15_int] = var8;
                                        var12++;
                                        continue L9;
                                      } else {
                                        field_B[var15_int] = var8;
                                        var12++;
                                        continue L9;
                                      }
                                    } else {
                                      field_W[var14_int] = field_W[var14_int] + var8;
                                      var12++;
                                      continue L9;
                                    }
                                  }
                                }
                              }
                            }
                            if (var9 > 64) {
                              var10 = field_O[var8] - 65;
                              var48 = field_U[var10];
                              var12 = 0;
                              L10: while (true) {
                                if (var12 < field_w[var10]) {
                                  var13 = var48[var12];
                                  var14_int = ((dd) this).field_u[var13];
                                  field_bb[var14_int] = field_bb[var14_int] + 1;
                                  var15_int = field_bb[var14_int];
                                  field_Q[var14_int][var15_int] = var13;
                                  if (var14_int >= 10) {
                                    if (var14_int != 10) {
                                      field_T[var15_int] = var8;
                                      var12++;
                                      continue L10;
                                    } else {
                                      field_B[var15_int] = var8;
                                      var12++;
                                      continue L10;
                                    }
                                  } else {
                                    field_W[var14_int] = field_W[var14_int] + var8;
                                    var12++;
                                    continue L10;
                                  }
                                } else {
                                  var8--;
                                  continue L6;
                                }
                              }
                            } else {
                              var8--;
                              continue L6;
                            }
                          }
                        }
                      } else {
                        field_bb[var8] = 0;
                        field_W[var8] = 0;
                        var8++;
                        continue L5;
                      }
                    }
                  } else {
                    var8 = param4 - 1;
                    L11: while (true) {
                      if (var8 < 0) {
                        return;
                      } else {
                        L12: {
                          var9 = field_O[var8];
                          if (var9 <= 0) {
                            break L12;
                          } else {
                            L13: {
                              if (var9 <= 64) {
                                stackOut_73_0 = var9;
                                stackIn_74_0 = stackOut_73_0;
                                break L13;
                              } else {
                                stackOut_72_0 = 64;
                                stackIn_74_0 = stackOut_72_0;
                                break L13;
                              }
                            }
                            var10 = stackIn_74_0;
                            var45 = field_fb[var8];
                            var12 = 0;
                            L14: while (true) {
                              if (var12 >= var10) {
                                break L12;
                              } else {
                                this.e(var45[var12]);
                                var12++;
                                continue L14;
                              }
                            }
                          }
                        }
                        if (var9 > 64) {
                          var10 = field_O[var8] - 65;
                          var46 = field_U[var10];
                          var12 = 0;
                          L15: while (true) {
                            if (var12 < field_w[var10]) {
                              this.e(var46[var12]);
                              var12++;
                              continue L15;
                            } else {
                              var8--;
                              continue L11;
                            }
                          }
                        } else {
                          var8--;
                          continue L11;
                        }
                      }
                    }
                  }
                } else {
                  hn.a(field_l, 0, 0, field_L, var7 - 1);
                  if (((dd) this).field_u != null) {
                    var8 = 0;
                    L16: while (true) {
                      if (var8 >= 12) {
                        var8 = 0;
                        L17: while (true) {
                          if (var8 >= var7) {
                            break L4;
                          } else {
                            var9 = field_L[var8];
                            var10 = field_l[var8];
                            var11 = ((dd) this).field_u[var9];
                            field_bb[var11] = field_bb[var11] + 1;
                            var12 = field_bb[var11];
                            field_Q[var11][var12] = var9;
                            if (var11 >= 10) {
                              if (var11 != 10) {
                                field_T[var12] = var10;
                                var8++;
                                continue L17;
                              } else {
                                field_B[var12] = var10;
                                var8++;
                                continue L17;
                              }
                            } else {
                              field_W[var11] = field_W[var11] + var10;
                              var8++;
                              continue L17;
                            }
                          }
                        }
                      } else {
                        field_bb[var8] = 0;
                        field_W[var8] = 0;
                        var8++;
                        continue L16;
                      }
                    }
                  } else {
                    var8 = 0;
                    L18: while (true) {
                      if (var8 >= var7) {
                        return;
                      } else {
                        this.e(field_L[var8]);
                        var8++;
                        continue L18;
                      }
                    }
                  }
                }
              }
              L19: {
                L20: {
                  var8 = 0;
                  if (field_bb[1] > 0) {
                    break L20;
                  } else {
                    if (field_bb[2] <= 0) {
                      break L19;
                    } else {
                      break L20;
                    }
                  }
                }
                var8 = (field_W[1] + field_W[2]) / (field_bb[1] + field_bb[2]);
                break L19;
              }
              L21: {
                L22: {
                  var9 = 0;
                  if (field_bb[3] > 0) {
                    break L22;
                  } else {
                    if (field_bb[4] <= 0) {
                      break L21;
                    } else {
                      break L22;
                    }
                  }
                }
                var9 = (field_W[3] + field_W[4]) / (field_bb[3] + field_bb[4]);
                break L21;
              }
              L23: {
                L24: {
                  var10 = 0;
                  if (field_bb[6] > 0) {
                    break L24;
                  } else {
                    if (field_bb[8] <= 0) {
                      break L23;
                    } else {
                      break L24;
                    }
                  }
                }
                var10 = (field_W[6] + field_W[8]) / (field_bb[6] + field_bb[8]);
                break L23;
              }
              L25: {
                var12 = 0;
                var13 = field_bb[10];
                var14 = field_Q[10];
                var15 = field_B;
                if (var12 != var13) {
                  break L25;
                } else {
                  var12 = 0;
                  var13 = field_bb[11];
                  var14 = field_Q[11];
                  var15 = field_T;
                  break L25;
                }
              }
              L26: {
                if (var12 >= var13) {
                  var11 = -1000;
                  break L26;
                } else {
                  var11 = var15[var12];
                  break L26;
                }
              }
              var16 = 0;
              L27: while (true) {
                if (var16 >= 10) {
                  L28: while (true) {
                    if (var11 == -1000) {
                      return;
                    } else {
                      L29: {
                        int incrementValue$7 = var12;
                        var12++;
                        this.e(var14[incrementValue$7]);
                        if (var12 != var13) {
                          break L29;
                        } else {
                          if (var14 == field_Q[11]) {
                            break L29;
                          } else {
                            var12 = 0;
                            var14 = field_Q[11];
                            var13 = field_bb[11];
                            var15 = field_T;
                            break L29;
                          }
                        }
                      }
                      if (var12 >= var13) {
                        var11 = -1000;
                        continue L28;
                      } else {
                        var11 = var15[var12];
                        continue L28;
                      }
                    }
                  }
                } else {
                  L30: while (true) {
                    L31: {
                      if (var16 != 0) {
                        break L31;
                      } else {
                        if (var11 <= var8) {
                          break L31;
                        } else {
                          L32: {
                            int incrementValue$8 = var12;
                            var12++;
                            this.e(var14[incrementValue$8]);
                            if (var12 != var13) {
                              break L32;
                            } else {
                              if (var14 == field_Q[11]) {
                                break L32;
                              } else {
                                var12 = 0;
                                var13 = field_bb[11];
                                var14 = field_Q[11];
                                var15 = field_T;
                                break L32;
                              }
                            }
                          }
                          if (var12 >= var13) {
                            var11 = -1000;
                            continue L30;
                          } else {
                            var11 = var15[var12];
                            continue L30;
                          }
                        }
                      }
                    }
                    L33: while (true) {
                      L34: {
                        if (var16 != 3) {
                          break L34;
                        } else {
                          if (var11 <= var9) {
                            break L34;
                          } else {
                            L35: {
                              int incrementValue$9 = var12;
                              var12++;
                              this.e(var14[incrementValue$9]);
                              if (var12 != var13) {
                                break L35;
                              } else {
                                if (var14 == field_Q[11]) {
                                  break L35;
                                } else {
                                  var12 = 0;
                                  var13 = field_bb[11];
                                  var14 = field_Q[11];
                                  var15 = field_T;
                                  break L35;
                                }
                              }
                            }
                            if (var12 >= var13) {
                              var11 = -1000;
                              continue L33;
                            } else {
                              var11 = var15[var12];
                              continue L33;
                            }
                          }
                        }
                      }
                      L36: while (true) {
                        L37: {
                          if (var16 != 5) {
                            break L37;
                          } else {
                            if (var11 <= var10) {
                              break L37;
                            } else {
                              L38: {
                                int incrementValue$10 = var12;
                                var12++;
                                this.e(var14[incrementValue$10]);
                                if (var12 != var13) {
                                  break L38;
                                } else {
                                  if (var14 == field_Q[11]) {
                                    break L38;
                                  } else {
                                    var12 = 0;
                                    var13 = field_bb[11];
                                    var14 = field_Q[11];
                                    var15 = field_T;
                                    break L38;
                                  }
                                }
                              }
                              if (var12 >= var13) {
                                var11 = -1000;
                                continue L36;
                              } else {
                                var11 = var15[var12];
                                continue L36;
                              }
                            }
                          }
                        }
                        var17 = field_bb[var16];
                        var49 = field_Q[var16];
                        var29 = 0;
                        var19 = var29;
                        L39: while (true) {
                          if (var29 >= var17) {
                            var16++;
                            continue L27;
                          } else {
                            this.e(var49[var29]);
                            var29++;
                            continue L39;
                          }
                        }
                      }
                    }
                  }
                }
              }
            } else {
              if (((dd) this).field_s[var8] != -2) {
                L40: {
                  var9 = ((dd) this).field_gb[var8];
                  var10 = ((dd) this).field_P[var8];
                  var11 = ((dd) this).field_R[var8];
                  var12 = field_M[var9];
                  var13 = field_M[var10];
                  var14_int = field_M[var11];
                  if (!param0) {
                    break L40;
                  } else {
                    L41: {
                      if (var12 == -5000) {
                        break L41;
                      } else {
                        if (var13 == -5000) {
                          break L41;
                        } else {
                          if (var14_int != -5000) {
                            break L40;
                          } else {
                            break L41;
                          }
                        }
                      }
                    }
                    var15_int = field_K[var9];
                    var16 = field_K[var10];
                    var17 = field_K[var11];
                    var18 = field_E[var9];
                    var19 = field_E[var10];
                    var20 = field_E[var11];
                    var21 = field_db[var9];
                    var22 = field_db[var10];
                    var23 = field_db[var11];
                    var15_int = var15_int - var16;
                    var17 = var17 - var16;
                    var18 = var18 - var19;
                    var20 = var20 - var19;
                    var21 = var21 - var22;
                    var23 = var23 - var22;
                    var24 = var18 * var23 - var21 * var20;
                    var25 = var21 * var17 - var15_int * var23;
                    var26 = var15_int * var20 - var18 * var17;
                    if (var16 * var24 + var19 * var25 + var22 * var26 > 0) {
                      field_v[var8] = true;
                      if (!field_r) {
                        var27 = (field_k[var9] + field_k[var10] + field_k[var11]) / 3 + param3;
                        if (field_O[var27] >= 64) {
                          L42: {
                            var28 = field_O[var27];
                            if (var28 != 64) {
                              break L42;
                            } else {
                              if (field_t != 512) {
                                field_t = field_t + 1;
                                var28 = 65 + field_t;
                                field_O[var27] = 65 + field_t;
                                break L42;
                              } else {
                                var8++;
                                continue L3;
                              }
                            }
                          }
                          var28 -= 65;
                          field_w[var28] = field_w[var28] + 1;
                          field_U[var28][field_w[var28]] = var8;
                          var8++;
                          continue L3;
                        } else {
                          field_O[var27] = field_O[var27] + 1;
                          field_fb[var27][field_O[var27]] = var8;
                          var8++;
                          continue L3;
                        }
                      } else {
                        field_l[var7] = (field_k[var9] + field_k[var10] + field_k[var11]) / 3;
                        int incrementValue$11 = var7;
                        var7++;
                        field_L[incrementValue$11] = var8;
                        var8++;
                        continue L3;
                      }
                    } else {
                      var8++;
                      continue L3;
                    }
                  }
                }
                L43: {
                  if (!param1) {
                    break L43;
                  } else {
                    if (!this.a(tb.field_d + nh.field_n, v.field_m + nh.field_f, field_G[var9], field_G[var10], field_G[var11], var12, var13, var14_int)) {
                      break L43;
                    } else {
                      int fieldTemp$12 = mi.field_v;
                      mi.field_v = mi.field_v + 1;
                      pd.field_Nb[fieldTemp$12] = param2;
                      param1 = false;
                      break L43;
                    }
                  }
                }
                if ((var12 - var13) * (field_G[var11] - field_G[var10]) - (field_G[var9] - field_G[var10]) * (var14_int - var13) > 0) {
                  L44: {
                    L45: {
                      field_v[var8] = false;
                      if (var12 < 0) {
                        break L45;
                      } else {
                        if (var13 < 0) {
                          break L45;
                        } else {
                          if (var14_int < 0) {
                            break L45;
                          } else {
                            if (var12 > nh.field_o) {
                              break L45;
                            } else {
                              if (var13 > nh.field_o) {
                                break L45;
                              } else {
                                if (var14_int <= nh.field_o) {
                                  field_V[var8] = false;
                                  break L44;
                                } else {
                                  break L45;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    field_V[var8] = true;
                    break L44;
                  }
                  if (!field_r) {
                    var15_int = (field_k[var9] + field_k[var10] + field_k[var11]) / 3 + param3;
                    if (field_O[var15_int] >= 64) {
                      L46: {
                        var16 = field_O[var15_int];
                        if (var16 != 64) {
                          break L46;
                        } else {
                          if (field_t != 512) {
                            field_t = field_t + 1;
                            var16 = 65 + field_t;
                            field_O[var15_int] = 65 + field_t;
                            break L46;
                          } else {
                            var8++;
                            continue L3;
                          }
                        }
                      }
                      var16 -= 65;
                      field_w[var16] = field_w[var16] + 1;
                      field_U[var16][field_w[var16]] = var8;
                      var8++;
                      continue L3;
                    } else {
                      field_O[var15_int] = field_O[var15_int] + 1;
                      field_fb[var15_int][field_O[var15_int]] = var8;
                      var8++;
                      continue L3;
                    }
                  } else {
                    field_l[var7] = (field_k[var9] + field_k[var10] + field_k[var11]) / 3;
                    int incrementValue$13 = var7;
                    var7++;
                    field_L[incrementValue$13] = var8;
                    var8++;
                    continue L3;
                  }
                } else {
                  var8++;
                  continue L3;
                }
              } else {
                var8++;
                continue L3;
              }
            }
          }
        } else {
          return;
        }
    }

    private final void b(int param0) {
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
        L0: {
          var2 = nh.field_n;
          var3 = nh.field_f;
          var4 = 0;
          var5 = ((dd) this).field_gb[param0];
          var6 = ((dd) this).field_P[param0];
          var7 = ((dd) this).field_R[param0];
          var8 = field_db[var5];
          var9 = field_db[var6];
          var10 = field_db[var7];
          if (((dd) this).field_h != null) {
            nh.field_b = ((dd) this).field_h[param0] & 255;
            break L0;
          } else {
            nh.field_b = 0;
            break L0;
          }
        }
        L1: {
          if (var8 < 50) {
            L2: {
              var11 = field_K[var5];
              var12 = field_E[var5];
              var13 = ((dd) this).field_z[param0] & 65535;
              if (var10 < 50) {
                break L2;
              } else {
                var14 = (50 - var8) * nh.field_h[var10 - var8];
                field_n[var4] = var2 + (var11 + ((field_K[var7] - var11) * var14 >> 16) << 9) / 50;
                field_j[var4] = var3 + (var12 + ((field_E[var7] - var12) * var14 >> 16) << 9) / 50;
                int incrementValue$9 = var4;
                var4++;
                field_I[incrementValue$9] = var13 + (((((dd) this).field_s[param0] & 65535) - var13) * var14 >> 16);
                break L2;
              }
            }
            if (var9 < 50) {
              break L1;
            } else {
              var14 = (50 - var8) * nh.field_h[var9 - var8];
              field_n[var4] = var2 + (var11 + ((field_K[var6] - var11) * var14 >> 16) << 9) / 50;
              field_j[var4] = var3 + (var12 + ((field_E[var6] - var12) * var14 >> 16) << 9) / 50;
              int incrementValue$10 = var4;
              var4++;
              field_I[incrementValue$10] = var13 + (((((dd) this).field_o[param0] & 65535) - var13) * var14 >> 16);
              break L1;
            }
          } else {
            field_n[var4] = field_M[var5];
            field_j[var4] = field_G[var5];
            int incrementValue$11 = var4;
            var4++;
            field_I[incrementValue$11] = ((dd) this).field_z[param0] & 65535;
            break L1;
          }
        }
        L3: {
          if (var9 < 50) {
            L4: {
              var11 = field_K[var6];
              var12 = field_E[var6];
              var13 = ((dd) this).field_o[param0] & 65535;
              if (var8 < 50) {
                break L4;
              } else {
                var14 = (50 - var9) * nh.field_h[var8 - var9];
                field_n[var4] = var2 + (var11 + ((field_K[var5] - var11) * var14 >> 16) << 9) / 50;
                field_j[var4] = var3 + (var12 + ((field_E[var5] - var12) * var14 >> 16) << 9) / 50;
                int incrementValue$12 = var4;
                var4++;
                field_I[incrementValue$12] = var13 + (((((dd) this).field_z[param0] & 65535) - var13) * var14 >> 16);
                break L4;
              }
            }
            if (var10 < 50) {
              break L3;
            } else {
              var14 = (50 - var9) * nh.field_h[var10 - var9];
              field_n[var4] = var2 + (var11 + ((field_K[var7] - var11) * var14 >> 16) << 9) / 50;
              field_j[var4] = var3 + (var12 + ((field_E[var7] - var12) * var14 >> 16) << 9) / 50;
              int incrementValue$13 = var4;
              var4++;
              field_I[incrementValue$13] = var13 + (((((dd) this).field_s[param0] & 65535) - var13) * var14 >> 16);
              break L3;
            }
          } else {
            field_n[var4] = field_M[var6];
            field_j[var4] = field_G[var6];
            int incrementValue$14 = var4;
            var4++;
            field_I[incrementValue$14] = ((dd) this).field_o[param0] & 65535;
            break L3;
          }
        }
        L5: {
          if (var10 < 50) {
            L6: {
              var11 = field_K[var7];
              var12 = field_E[var7];
              var13 = ((dd) this).field_s[param0] & 65535;
              if (var9 < 50) {
                break L6;
              } else {
                var14 = (50 - var10) * nh.field_h[var9 - var10];
                field_n[var4] = var2 + (var11 + ((field_K[var6] - var11) * var14 >> 16) << 9) / 50;
                field_j[var4] = var3 + (var12 + ((field_E[var6] - var12) * var14 >> 16) << 9) / 50;
                int incrementValue$15 = var4;
                var4++;
                field_I[incrementValue$15] = var13 + (((((dd) this).field_o[param0] & 65535) - var13) * var14 >> 16);
                break L6;
              }
            }
            if (var8 < 50) {
              break L5;
            } else {
              var14 = (50 - var10) * nh.field_h[var8 - var10];
              field_n[var4] = var2 + (var11 + ((field_K[var5] - var11) * var14 >> 16) << 9) / 50;
              field_j[var4] = var3 + (var12 + ((field_E[var5] - var12) * var14 >> 16) << 9) / 50;
              int incrementValue$16 = var4;
              var4++;
              field_I[incrementValue$16] = var13 + (((((dd) this).field_z[param0] & 65535) - var13) * var14 >> 16);
              break L5;
            }
          } else {
            field_n[var4] = field_M[var7];
            field_j[var4] = field_G[var7];
            int incrementValue$17 = var4;
            var4++;
            field_I[incrementValue$17] = ((dd) this).field_s[param0] & 65535;
            break L5;
          }
        }
        L7: {
          var11 = field_n[0];
          var12 = field_n[1];
          var13 = field_n[2];
          var14 = field_j[0];
          var15 = field_j[1];
          var16 = field_j[2];
          nh.field_k = false;
          if (var4 != 3) {
            break L7;
          } else {
            L8: {
              L9: {
                if (var11 < 0) {
                  break L9;
                } else {
                  if (var12 < 0) {
                    break L9;
                  } else {
                    if (var13 < 0) {
                      break L9;
                    } else {
                      if (var11 > nh.field_o) {
                        break L9;
                      } else {
                        if (var12 > nh.field_o) {
                          break L9;
                        } else {
                          if (var13 <= nh.field_o) {
                            break L8;
                          } else {
                            break L9;
                          }
                        }
                      }
                    }
                  }
                }
              }
              nh.field_k = true;
              break L8;
            }
            L10: {
              if (((dd) this).field_S == null) {
                break L10;
              } else {
                if (((dd) this).field_S[param0] != -1) {
                  L11: {
                    L12: {
                      if (((dd) this).field_H == null) {
                        break L12;
                      } else {
                        if (((dd) this).field_H[param0] == -1) {
                          break L12;
                        } else {
                          var20 = ((dd) this).field_H[param0] & 255;
                          var17 = ((dd) this).field_N[var20];
                          var18 = ((dd) this).field_X[var20];
                          var19 = ((dd) this).field_i[var20];
                          break L11;
                        }
                      }
                    }
                    var17 = var5;
                    var18 = var6;
                    var19 = var7;
                    break L11;
                  }
                  if (((dd) this).field_s[param0] != -1) {
                    nh.a(var14, var15, var16, var11, var12, var13, field_I[0], field_I[1], field_I[2], field_K[var17], field_K[var18], field_K[var19], field_E[var17], field_E[var18], field_E[var19], field_db[var17], field_db[var18], field_db[var19], (int) ((dd) this).field_S[param0]);
                    break L7;
                  } else {
                    nh.a(var14, var15, var16, var11, var12, var13, ((dd) this).field_z[param0], ((dd) this).field_z[param0], ((dd) this).field_z[param0], field_K[var17], field_K[var18], field_K[var19], field_E[var17], field_E[var18], field_E[var19], field_db[var17], field_db[var18], field_db[var19], (int) ((dd) this).field_S[param0]);
                    break L7;
                  }
                } else {
                  break L10;
                }
              }
            }
            if (((dd) this).field_s[param0] != -1) {
              nh.a(var14, var15, var16, var11, var12, var13, field_I[0], field_I[1], field_I[2]);
              break L7;
            } else {
              nh.a(var14, var15, var16, var11, var12, var13, nh.field_d[((dd) this).field_z[param0] & 65535]);
              break L7;
            }
          }
        }
        if (var4 != 4) {
          return;
        } else {
          L13: {
            L14: {
              if (var11 < 0) {
                break L14;
              } else {
                if (var12 < 0) {
                  break L14;
                } else {
                  if (var13 < 0) {
                    break L14;
                  } else {
                    if (var11 > nh.field_o) {
                      break L14;
                    } else {
                      if (var12 > nh.field_o) {
                        break L14;
                      } else {
                        if (var13 > nh.field_o) {
                          break L14;
                        } else {
                          if (field_n[3] < 0) {
                            break L14;
                          } else {
                            if (field_n[3] <= nh.field_o) {
                              break L13;
                            } else {
                              break L14;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
            nh.field_k = true;
            break L13;
          }
          L15: {
            L16: {
              if (((dd) this).field_S == null) {
                break L16;
              } else {
                if (((dd) this).field_S[param0] != -1) {
                  L17: {
                    L18: {
                      if (((dd) this).field_H == null) {
                        break L18;
                      } else {
                        if (((dd) this).field_H[param0] == -1) {
                          break L18;
                        } else {
                          var20 = ((dd) this).field_H[param0] & 255;
                          var17 = ((dd) this).field_N[var20];
                          var18 = ((dd) this).field_X[var20];
                          var19 = ((dd) this).field_i[var20];
                          break L17;
                        }
                      }
                    }
                    var17 = var5;
                    var18 = var6;
                    var19 = var7;
                    break L17;
                  }
                  var20 = ((dd) this).field_S[param0];
                  if (((dd) this).field_s[param0] != -1) {
                    nh.a(var14, var15, var16, var11, var12, var13, field_I[0], field_I[1], field_I[2], field_K[var17], field_K[var18], field_K[var19], field_E[var17], field_E[var18], field_E[var19], field_db[var17], field_db[var18], field_db[var19], var20);
                    nh.a(var14, var16, field_j[3], var11, var13, field_n[3], field_I[0], field_I[2], field_I[3], field_K[var17], field_K[var18], field_K[var19], field_E[var17], field_E[var18], field_E[var19], field_db[var17], field_db[var18], field_db[var19], var20);
                    break L15;
                  } else {
                    nh.a(var14, var15, var16, var11, var12, var13, ((dd) this).field_z[param0], ((dd) this).field_z[param0], ((dd) this).field_z[param0], field_K[var17], field_K[var18], field_K[var19], field_E[var17], field_E[var18], field_E[var19], field_db[var17], field_db[var18], field_db[var19], var20);
                    nh.a(var14, var16, field_j[3], var11, var13, field_n[3], ((dd) this).field_z[param0], ((dd) this).field_z[param0], ((dd) this).field_z[param0], field_K[var17], field_K[var18], field_K[var19], field_E[var17], field_E[var18], field_E[var19], field_db[var17], field_db[var18], field_db[var19], var20);
                    break L15;
                  }
                } else {
                  break L16;
                }
              }
            }
            if (((dd) this).field_s[param0] != -1) {
              nh.a(var14, var15, var16, var11, var12, var13, field_I[0], field_I[1], field_I[2]);
              nh.a(var14, var16, field_j[3], var11, var13, field_n[3], field_I[0], field_I[2], field_I[3]);
              break L15;
            } else {
              var17 = nh.field_d[((dd) this).field_z[param0] & 65535];
              nh.a(var14, var15, var16, var11, var12, var13, var17);
              nh.a(var14, var16, field_j[3], var11, var13, field_n[3], var17);
              break L15;
            }
          }
          return;
        }
    }

    private final void c() {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var5 = 0;
        int var8 = 0;
        int[] var11 = null;
        int[] var12 = null;
        if (field_m != 0) {
          field_x = nh.field_o;
          field_D = nh.field_l;
          field_Z = 0;
          field_eb = 0;
          var1 = 0;
          L0: while (true) {
            if (var1 >= ((dd) this).field_q) {
              var1 = field_m - 1;
              L1: while (true) {
                if (var1 < 0) {
                  L2: {
                    if (field_x >= 0) {
                      break L2;
                    } else {
                      field_x = 0;
                      break L2;
                    }
                  }
                  L3: {
                    if (field_Z <= nh.field_o) {
                      break L3;
                    } else {
                      field_Z = nh.field_o;
                      break L3;
                    }
                  }
                  L4: {
                    if (field_D >= 0) {
                      break L4;
                    } else {
                      field_D = 0;
                      break L4;
                    }
                  }
                  L5: {
                    if (field_eb <= nh.field_l) {
                      break L5;
                    } else {
                      field_eb = nh.field_l;
                      break L5;
                    }
                  }
                  L6: {
                    if (field_x <= field_Z) {
                      break L6;
                    } else {
                      field_x = field_Z;
                      break L6;
                    }
                  }
                  L7: {
                    if (field_D <= field_eb) {
                      break L7;
                    } else {
                      field_D = field_eb;
                      break L7;
                    }
                  }
                  var1 = nh.field_p[0] % wb.field_h;
                  var2 = nh.field_p[0] / wb.field_h;
                  field_x = field_x + var1;
                  field_Z = field_Z + var1;
                  field_D = field_D + var2;
                  field_eb = field_eb + var2;
                  return;
                } else {
                  L8: {
                    var2 = field_O[var1];
                    if (var2 <= 0) {
                      break L8;
                    } else {
                      L9: {
                        if (var2 <= 64) {
                          var3 = var2;
                          break L9;
                        } else {
                          var3 = 64;
                          break L9;
                        }
                      }
                      var11 = field_fb[var1];
                      var5 = 0;
                      L10: while (true) {
                        if (var5 >= var3) {
                          break L8;
                        } else {
                          this.d(var11[var5]);
                          var5++;
                          continue L10;
                        }
                      }
                    }
                  }
                  if (var2 > 64) {
                    var3 = field_O[var1] - 65;
                    var12 = field_U[var3];
                    var8 = 0;
                    var5 = var8;
                    L11: while (true) {
                      if (var8 < field_w[var3]) {
                        this.d(var12[var8]);
                        var8++;
                        continue L11;
                      } else {
                        var1--;
                        continue L1;
                      }
                    }
                  } else {
                    var1--;
                    continue L1;
                  }
                }
              }
            } else {
              var2 = field_M[var1];
              if (var2 != -5000) {
                L12: {
                  var3 = field_G[var1];
                  if (var2 >= field_x) {
                    break L12;
                  } else {
                    field_x = var2;
                    break L12;
                  }
                }
                L13: {
                  if (var2 <= field_Z) {
                    break L13;
                  } else {
                    field_Z = var2;
                    break L13;
                  }
                }
                L14: {
                  if (var3 >= field_D) {
                    break L14;
                  } else {
                    field_D = var3;
                    break L14;
                  }
                }
                if (var3 > field_eb) {
                  field_eb = var3;
                  var1++;
                  continue L0;
                } else {
                  var1++;
                  continue L0;
                }
              } else {
                var1++;
                continue L0;
              }
            }
          }
        } else {
          field_eb = 0;
          field_Z = 0;
          field_D = 0;
          field_x = 0;
          return;
        }
    }

    private final void a(int param0, int param1) {
        if (param0 < field_x) {
            field_x = param0;
        }
        if (param0 > field_Z) {
            field_Z = param0;
        }
        if (param1 < field_D) {
            field_D = param1;
        }
        if (param1 > field_eb) {
            field_eb = param1;
            return;
        }
    }

    final void a(int[] param0, int[] param1) {
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
        Exception var21 = null;
        int var21_int = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int stackIn_15_0 = 0;
        int stackIn_21_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_16_0 = 0;
        L0: {
          field_m = 0;
          if (((dd) this).field_Y) {
            break L0;
          } else {
            this.d();
            break L0;
          }
        }
        var15 = param0[3] >> 2;
        var16 = param0[4] >> 2;
        var17 = param0[5] >> 2;
        var18 = param0[6] >> 2;
        var19 = param0[7] >> 2;
        var20 = param0[8] >> 2;
        var21_int = param0[9] >> 2;
        var22 = param0[10] >> 2;
        var23 = param0[11] >> 2;
        var6 = var15 * param1[3] + var16 * param1[4] + var17 * param1[5] >> 14;
        var7 = var18 * param1[3] + var19 * param1[4] + var20 * param1[5] >> 14;
        var8 = var21_int * param1[3] + var22 * param1[4] + var23 * param1[5] >> 14;
        var9 = var15 * param1[6] + var16 * param1[7] + var17 * param1[8] >> 14;
        var10 = var18 * param1[6] + var19 * param1[7] + var20 * param1[8] >> 14;
        var11 = var21_int * param1[6] + var22 * param1[7] + var23 * param1[8] >> 14;
        var12 = var15 * param1[9] + var16 * param1[10] + var17 * param1[11] >> 14;
        var13 = var18 * param1[9] + var19 * param1[10] + var20 * param1[11] >> 14;
        var14 = var21_int * param1[9] + var22 * param1[10] + var23 * param1[11] >> 14;
        var15 = param1[0] - param0[0];
        var16 = param1[1] - param0[1];
        var17 = param1[2] - param0[2];
        var3 = var15 * param0[3] + var16 * param0[4] + var17 * param0[5] >> 16;
        var4 = var15 * param0[6] + var16 * param0[7] + var17 * param0[8] >> 16;
        var5 = var15 * param0[9] + var16 * param0[10] + var17 * param0[11] >> 16;
        if (var5 >= 50 - ((dd) this).field_C) {
          var15 = ((dd) this).field_C * 92682 >> 16;
          if (var3 >= -var5 - var15) {
            if (var3 <= var5 + var15) {
              if (var4 >= -var5 - var15) {
                if (var4 <= var5 + var15) {
                  L1: {
                    if (var5 > 50 + ((dd) this).field_C) {
                      stackOut_14_0 = 0;
                      stackIn_15_0 = stackOut_14_0;
                      break L1;
                    } else {
                      stackOut_13_0 = 1;
                      stackIn_15_0 = stackOut_13_0;
                      break L1;
                    }
                  }
                  L2: {
                    var16 = stackIn_15_0;
                    if (var16 == 0) {
                      if (((dd) this).field_p > 0) {
                        stackOut_19_0 = 1;
                        stackIn_21_0 = stackOut_19_0;
                        break L2;
                      } else {
                        stackOut_18_0 = 0;
                        stackIn_21_0 = stackOut_18_0;
                        break L2;
                      }
                    } else {
                      stackOut_16_0 = 1;
                      stackIn_21_0 = stackOut_16_0;
                      break L2;
                    }
                  }
                  var17 = stackIn_21_0;
                  var18 = nh.field_n;
                  var19 = nh.field_f;
                  var20 = 0;
                  var27 = 0;
                  var21_int = var27;
                  L3: while (true) {
                    if (var27 >= ((dd) this).field_q) {
                      try {
                        L4: {
                          this.a((var20 & var16) != 0, false, 0L, (int) ((dd) this).field_C, ((dd) this).field_C << 1);
                          break L4;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L5: {
                          var21 = (Exception) (Object) decompiledCaughtException;
                          break L5;
                        }
                      }
                      return;
                    } else {
                      L6: {
                        var22 = ((dd) this).field_y[var27];
                        var23 = ((dd) this).field_F[var27];
                        var24 = ((dd) this).field_cb[var27];
                        var25 = var22 * var6 + var23 * var9 + var24 * var12 >> 16;
                        var26 = var22 * var7 + var23 * var10 + var24 * var13 >> 16;
                        var24 = var22 * var8 + var23 * var11 + var24 * var14 >> 16;
                        var22 = var25;
                        var23 = var26;
                        field_k[var27] = var24;
                        var22 = var22 + var3;
                        var23 = var23 + var4;
                        var24 = var24 + var5;
                        if (var24 < 50) {
                          field_M[var27] = -5000;
                          var20 = 1;
                          break L6;
                        } else {
                          field_M[var27] = var18 + (var22 << 9) / var24;
                          field_G[var27] = var19 + (var23 << 9) / var24;
                          break L6;
                        }
                      }
                      if (var17 != 0) {
                        field_K[var27] = var22;
                        field_E[var27] = var23;
                        field_db[var27] = var24;
                        var27++;
                        continue L3;
                      } else {
                        var27++;
                        continue L3;
                      }
                    }
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    private final boolean a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        if (param1 < param2) {
            if (param1 < param3) {
                if (param1 < param4) {
                    return false;
                }
            }
        }
        if (param1 > param2) {
            if (param1 > param3) {
                if (param1 > param4) {
                    return false;
                }
            }
        }
        if (param0 < param5) {
            if (param0 < param6) {
                if (param0 < param7) {
                    return false;
                }
            }
        }
        if (param0 > param5) {
            if (param0 > param6) {
                if (param0 > param7) {
                    return false;
                }
            }
        }
        return true;
    }

    private final void d(int param0) {
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
        if (param0 < 65536) {
          if (!field_v[param0]) {
            return;
          } else {
            L0: {
              var2 = nh.field_n;
              var3 = nh.field_f;
              var4 = ((dd) this).field_gb[param0];
              var5 = ((dd) this).field_P[param0];
              var6 = ((dd) this).field_R[param0];
              var7 = field_db[var4];
              var8 = field_db[var5];
              var9 = field_db[var6];
              if (var7 >= 50) {
                break L0;
              } else {
                L1: {
                  var10 = field_K[var4];
                  var11 = field_E[var4];
                  if (var9 < 50) {
                    break L1;
                  } else {
                    var12 = (50 - var7) * nh.field_h[var9 - var7];
                    this.a(var2 + (var10 + ((field_K[var6] - var10) * var12 >> 16) << 9) / 50, var3 + (var11 + ((field_E[var6] - var11) * var12 >> 16) << 9) / 50);
                    break L1;
                  }
                }
                if (var8 < 50) {
                  break L0;
                } else {
                  var12 = (50 - var7) * nh.field_h[var8 - var7];
                  this.a(var2 + (var10 + ((field_K[var5] - var10) * var12 >> 16) << 9) / 50, var3 + (var11 + ((field_E[var5] - var11) * var12 >> 16) << 9) / 50);
                  break L0;
                }
              }
            }
            L2: {
              if (var8 >= 50) {
                break L2;
              } else {
                L3: {
                  var10 = field_K[var5];
                  var11 = field_E[var5];
                  if (var7 < 50) {
                    break L3;
                  } else {
                    var12 = (50 - var8) * nh.field_h[var7 - var8];
                    this.a(var2 + (var10 + ((field_K[var4] - var10) * var12 >> 16) << 9) / 50, var3 + (var11 + ((field_E[var4] - var11) * var12 >> 16) << 9) / 50);
                    break L3;
                  }
                }
                if (var9 < 50) {
                  break L2;
                } else {
                  var12 = (50 - var8) * nh.field_h[var9 - var8];
                  this.a(var2 + (var10 + ((field_K[var6] - var10) * var12 >> 16) << 9) / 50, var3 + (var11 + ((field_E[var6] - var11) * var12 >> 16) << 9) / 50);
                  break L2;
                }
              }
            }
            L4: {
              if (var9 >= 50) {
                break L4;
              } else {
                L5: {
                  var10 = field_K[var6];
                  var11 = field_E[var6];
                  if (var8 < 50) {
                    break L5;
                  } else {
                    var12 = (50 - var9) * nh.field_h[var8 - var9];
                    this.a(var2 + (var10 + ((field_K[var5] - var10) * var12 >> 16) << 9) / 50, var3 + (var11 + ((field_E[var5] - var11) * var12 >> 16) << 9) / 50);
                    break L5;
                  }
                }
                if (var7 < 50) {
                  break L4;
                } else {
                  var12 = (50 - var9) * nh.field_h[var7 - var9];
                  this.a(var2 + (var10 + ((field_K[var4] - var10) * var12 >> 16) << 9) / 50, var3 + (var11 + ((field_E[var4] - var11) * var12 >> 16) << 9) / 50);
                  break L4;
                }
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    private final static int c(int param0) {
        if (param0 < 2) {
            param0 = 2;
        } else {
            if (param0 > 126) {
                param0 = 126;
            }
        }
        return param0;
    }

    final void a() {
        Exception var1 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            this.c();
            break L0;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var1 = (Exception) (Object) decompiledCaughtException;
            break L1;
          }
        }
    }

    private final static int b(int param0, int param1) {
        param1 = param1 * (param0 & 127) >> 7;
        if (param1 < 2) {
            param1 = 2;
        } else {
            if (param1 > 126) {
                param1 = 126;
            }
        }
        return (param0 & 65408) + param1;
    }

    private final void d() {
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
        var1 = 32767;
        var2 = 32767;
        var3 = 32767;
        var4 = -32768;
        var5 = -32768;
        var6 = -32768;
        var7 = 0;
        var8 = 0;
        var9 = 0;
        L0: while (true) {
          if (var9 >= ((dd) this).field_ab) {
            ((dd) this).field_C = (short)(int)(Math.sqrt((double)var8) + 0.99);
            ((dd) this).field_Y = true;
            return;
          } else {
            L1: {
              var10 = ((dd) this).field_y[var9];
              var11 = ((dd) this).field_F[var9];
              var12 = ((dd) this).field_cb[var9];
              if (var10 >= var1) {
                break L1;
              } else {
                var1 = var10;
                break L1;
              }
            }
            L2: {
              if (var10 <= var4) {
                break L2;
              } else {
                var4 = var10;
                break L2;
              }
            }
            L3: {
              if (var11 >= var2) {
                break L3;
              } else {
                var2 = var11;
                break L3;
              }
            }
            L4: {
              if (var11 <= var5) {
                break L4;
              } else {
                var5 = var11;
                break L4;
              }
            }
            L5: {
              if (var12 >= var3) {
                break L5;
              } else {
                var3 = var12;
                break L5;
              }
            }
            L6: {
              if (var12 <= var6) {
                break L6;
              } else {
                var6 = var12;
                break L6;
              }
            }
            L7: {
              var13 = var10 * var10 + var12 * var12;
              if (var13 <= var7) {
                break L7;
              } else {
                var7 = var13;
                break L7;
              }
            }
            var13 = var13 + var11 * var11;
            if (var13 > var8) {
              var8 = var13;
              var9++;
              continue L0;
            } else {
              var9++;
              continue L0;
            }
          }
        }
    }

    private dd() {
        ((dd) this).field_q = 0;
        ((dd) this).field_Y = false;
        ((dd) this).field_A = 0;
        ((dd) this).field_ab = 0;
        ((dd) this).field_p = 0;
    }

    dd(bn param0, int param1, int param2, int param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var9_ref_int__ = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        cb var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        fh var18 = null;
        fh var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        L0: {
          ((dd) this).field_q = 0;
          ((dd) this).field_Y = false;
          ((dd) this).field_A = 0;
          ((dd) this).field_ab = 0;
          ((dd) this).field_p = 0;
          param0.b();
          param0.d();
          ((dd) this).field_q = param0.field_h;
          ((dd) this).field_ab = param0.field_q;
          ((dd) this).field_y = param0.field_K;
          ((dd) this).field_F = param0.field_C;
          ((dd) this).field_cb = param0.field_v;
          ((dd) this).field_A = param0.field_y;
          ((dd) this).field_gb = param0.field_P;
          ((dd) this).field_P = param0.field_O;
          ((dd) this).field_R = param0.field_N;
          ((dd) this).field_u = param0.field_w;
          ((dd) this).field_h = param0.field_D;
          var7 = (int)Math.sqrt((double)(param3 * param3 + param4 * param4 + param5 * param5));
          var8 = param2 * var7 >> 8;
          ((dd) this).field_z = new int[((dd) this).field_A];
          ((dd) this).field_o = new int[((dd) this).field_A];
          ((dd) this).field_s = new int[((dd) this).field_A];
          if (param0.field_B == null) {
            ((dd) this).field_S = null;
            break L0;
          } else {
            ((dd) this).field_S = new short[((dd) this).field_A];
            var9 = 0;
            L1: while (true) {
              if (var9 >= ((dd) this).field_A) {
                break L0;
              } else {
                L2: {
                  var10 = param0.field_B[var9];
                  if (var10 == -1) {
                    break L2;
                  } else {
                    if (!nh.field_q.b(var10, -79)) {
                      break L2;
                    } else {
                      ((dd) this).field_S[var9] = (short)var10;
                      var9++;
                      continue L1;
                    }
                  }
                }
                ((dd) this).field_S[var9] = (short) -1;
                var9++;
                continue L1;
              }
            }
          }
        }
        L3: {
          if (param0.field_R <= 0) {
            break L3;
          } else {
            if (param0.field_Q == null) {
              break L3;
            } else {
              var22 = new int[param0.field_R];
              var21 = var22;
              var20 = var21;
              var17 = var20;
              var9_ref_int__ = var17;
              var10 = 0;
              L4: while (true) {
                if (var10 >= ((dd) this).field_A) {
                  ((dd) this).field_p = 0;
                  var10 = 0;
                  L5: while (true) {
                    if (var10 >= param0.field_R) {
                      ((dd) this).field_N = new int[((dd) this).field_p];
                      ((dd) this).field_X = new int[((dd) this).field_p];
                      ((dd) this).field_i = new int[((dd) this).field_p];
                      var10 = 0;
                      var11 = 0;
                      L6: while (true) {
                        if (var11 >= param0.field_R) {
                          ((dd) this).field_H = new byte[((dd) this).field_A];
                          var11 = 0;
                          L7: while (true) {
                            if (var11 >= ((dd) this).field_A) {
                              break L3;
                            } else {
                              if (param0.field_Q[var11] == -1) {
                                ((dd) this).field_H[var11] = (byte) -1;
                                var11++;
                                continue L7;
                              } else {
                                ((dd) this).field_H[var11] = (byte)var9_ref_int__[param0.field_Q[var11] & 255];
                                if (((dd) this).field_H[var11] == -1) {
                                  if (((dd) this).field_S != null) {
                                    ((dd) this).field_S[var11] = (short) -1;
                                    var11++;
                                    continue L7;
                                  } else {
                                    var11++;
                                    continue L7;
                                  }
                                } else {
                                  var11++;
                                  continue L7;
                                }
                              }
                            }
                          }
                        } else {
                          L8: {
                            if (var22[var11] <= 0) {
                              break L8;
                            } else {
                              if (param0.field_l[var11] != 0) {
                                break L8;
                              } else {
                                ((dd) this).field_N[var10] = param0.field_J[var11] & 65535;
                                ((dd) this).field_X[var10] = param0.field_n[var11] & 65535;
                                ((dd) this).field_i[var10] = param0.field_x[var11] & 65535;
                                int incrementValue$1 = var10;
                                var10++;
                                var9_ref_int__[var11] = incrementValue$1;
                                var11++;
                                continue L6;
                              }
                            }
                          }
                          var22[var11] = -1;
                          var11++;
                          continue L6;
                        }
                      }
                    } else {
                      if (var22[var10] > 0) {
                        if (param0.field_l[var10] == 0) {
                          ((dd) this).field_p = ((dd) this).field_p + 1;
                          var10++;
                          continue L5;
                        } else {
                          var10++;
                          continue L5;
                        }
                      } else {
                        var10++;
                        continue L5;
                      }
                    }
                  }
                } else {
                  if (param0.field_Q[var10] != -1) {
                    var9_ref_int__[param0.field_Q[var10] & 255] = var9_ref_int__[param0.field_Q[var10] & 255] + 1;
                    var10++;
                    continue L4;
                  } else {
                    var10++;
                    continue L4;
                  }
                }
              }
            }
          }
        }
        var16 = 0;
        var9 = var16;
        L9: while (true) {
          if (var16 >= ((dd) this).field_A) {
            return;
          } else {
            L10: {
              if (param0.field_G != null) {
                var10 = param0.field_G[var16];
                break L10;
              } else {
                var10 = 0;
                break L10;
              }
            }
            L11: {
              if (param0.field_D != null) {
                var11 = param0.field_D[var16];
                break L11;
              } else {
                var11 = 0;
                break L11;
              }
            }
            L12: {
              if (((dd) this).field_S != null) {
                var12 = ((dd) this).field_S[var16];
                break L12;
              } else {
                var12 = -1;
                break L12;
              }
            }
            L13: {
              if (var11 != -2) {
                break L13;
              } else {
                var10 = 3;
                break L13;
              }
            }
            L14: {
              if (var11 != -1) {
                break L14;
              } else {
                var10 = 2;
                break L14;
              }
            }
            if (var12 != -1) {
              if (var10 != 0) {
                if (var10 != 1) {
                  ((dd) this).field_s[var16] = -2;
                  var16++;
                  continue L9;
                } else {
                  var19 = param0.field_p[var16];
                  var14 = param1 + (param3 * var19.field_f + param4 * var19.field_a + param5 * var19.field_c) / (var8 + var8 / 2);
                  ((dd) this).field_z[var16] = dd.c(var14);
                  ((dd) this).field_s[var16] = -1;
                  var16++;
                  continue L9;
                }
              } else {
                L15: {
                  L16: {
                    if (param0.field_A == null) {
                      break L16;
                    } else {
                      if (param0.field_A[((dd) this).field_gb[var16]] == null) {
                        break L16;
                      } else {
                        var13 = param0.field_A[((dd) this).field_gb[var16]];
                        break L15;
                      }
                    }
                  }
                  var13 = param0.field_o[((dd) this).field_gb[var16]];
                  break L15;
                }
                L17: {
                  L18: {
                    var14 = param1 + (param3 * var13.field_j + param4 * var13.field_d + param5 * var13.field_i) / (var8 * var13.field_g);
                    ((dd) this).field_z[var16] = dd.c(var14);
                    if (param0.field_A == null) {
                      break L18;
                    } else {
                      if (param0.field_A[((dd) this).field_P[var16]] == null) {
                        break L18;
                      } else {
                        var13 = param0.field_A[((dd) this).field_P[var16]];
                        break L17;
                      }
                    }
                  }
                  var13 = param0.field_o[((dd) this).field_P[var16]];
                  break L17;
                }
                L19: {
                  L20: {
                    var14 = param1 + (param3 * var13.field_j + param4 * var13.field_d + param5 * var13.field_i) / (var8 * var13.field_g);
                    ((dd) this).field_o[var16] = dd.c(var14);
                    if (param0.field_A == null) {
                      break L20;
                    } else {
                      if (param0.field_A[((dd) this).field_R[var16]] == null) {
                        break L20;
                      } else {
                        var13 = param0.field_A[((dd) this).field_R[var16]];
                        break L19;
                      }
                    }
                  }
                  var13 = param0.field_o[((dd) this).field_R[var16]];
                  break L19;
                }
                var14 = param1 + (param3 * var13.field_j + param4 * var13.field_d + param5 * var13.field_i) / (var8 * var13.field_g);
                ((dd) this).field_s[var16] = dd.c(var14);
                var16++;
                continue L9;
              }
            } else {
              if (var10 != 0) {
                if (var10 != 1) {
                  if (var10 != 3) {
                    ((dd) this).field_s[var16] = -2;
                    var16++;
                    continue L9;
                  } else {
                    ((dd) this).field_z[var16] = 128;
                    ((dd) this).field_s[var16] = -1;
                    var16++;
                    continue L9;
                  }
                } else {
                  var18 = param0.field_p[var16];
                  var14 = param1 + (param3 * var18.field_f + param4 * var18.field_a + param5 * var18.field_c) / (var8 + var8 / 2) << 17;
                  ((dd) this).field_z[var16] = var14 | dd.b(param0.field_j[var16] & 65535, var14 >> 17);
                  ((dd) this).field_s[var16] = -1;
                  var16++;
                  continue L9;
                }
              } else {
                L21: {
                  L22: {
                    var15 = param0.field_j[var16] & 65535;
                    if (param0.field_A == null) {
                      break L22;
                    } else {
                      if (param0.field_A[((dd) this).field_gb[var16]] == null) {
                        break L22;
                      } else {
                        var13 = param0.field_A[((dd) this).field_gb[var16]];
                        break L21;
                      }
                    }
                  }
                  var13 = param0.field_o[((dd) this).field_gb[var16]];
                  break L21;
                }
                L23: {
                  L24: {
                    var14 = param1 + (param3 * var13.field_j + param4 * var13.field_d + param5 * var13.field_i) / (var8 * var13.field_g) << 17;
                    ((dd) this).field_z[var16] = var14 | dd.b(var15, var14 >> 17);
                    if (param0.field_A == null) {
                      break L24;
                    } else {
                      if (param0.field_A[((dd) this).field_P[var16]] == null) {
                        break L24;
                      } else {
                        var13 = param0.field_A[((dd) this).field_P[var16]];
                        break L23;
                      }
                    }
                  }
                  var13 = param0.field_o[((dd) this).field_P[var16]];
                  break L23;
                }
                L25: {
                  L26: {
                    var14 = param1 + (param3 * var13.field_j + param4 * var13.field_d + param5 * var13.field_i) / (var8 * var13.field_g) << 17;
                    ((dd) this).field_o[var16] = var14 | dd.b(var15, var14 >> 17);
                    if (param0.field_A == null) {
                      break L26;
                    } else {
                      if (param0.field_A[((dd) this).field_R[var16]] == null) {
                        break L26;
                      } else {
                        var13 = param0.field_A[((dd) this).field_R[var16]];
                        break L25;
                      }
                    }
                  }
                  var13 = param0.field_o[((dd) this).field_R[var16]];
                  break L25;
                }
                var14 = param1 + (param3 * var13.field_j + param4 * var13.field_d + param5 * var13.field_i) / (var8 * var13.field_g) << 17;
                ((dd) this).field_s[var16] = var14 | dd.b(var15, var14 >> 17);
                var16++;
                continue L9;
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        dd discarded$0 = new dd();
        dd discarded$1 = new dd();
        dd discarded$2 = new dd();
        field_db = new int[4096];
        field_n = new int[10];
        field_M = new int[4096];
        field_V = new boolean[4096];
        field_t = 0;
        field_T = new int[4096];
        field_B = new int[4096];
        field_K = new int[4096];
        field_bb = new int[12];
        field_v = new boolean[4096];
        field_j = new int[10];
        field_Q = new int[12][4096];
        field_W = new int[12];
        field_k = new int[4096];
        field_r = false;
        field_E = new int[4096];
        field_I = new int[10];
        field_G = new int[4096];
        if (field_r) {
            field_l = new int[4096];
            field_L = new int[4096];
        } else {
            field_O = new int[1600];
            field_fb = new int[1600][64];
            field_w = new int[32];
            field_U = new int[32][512];
        }
    }
}
