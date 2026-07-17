/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ss extends gga {
    private int[] field_l;
    private byte[] field_T;
    private boolean field_K;
    private int[] field_i;
    private int field_t;
    private int[] field_U;
    private byte[] field_A;
    private int[] field_R;
    private int[] field_J;
    private int[] field_G;
    private int[] field_L;
    private int field_W;
    private int[] field_x;
    private short[] field_P;
    private int[] field_r;
    private int[] field_n;
    private int field_o;
    private int field_O;
    private short field_h;
    private int[] field_N;
    private int[] field_M;
    private byte[] field_m;
    private static int[] field_c;
    private static int[] field_y;
    private static int[] field_H;
    private static int[][] field_k;
    private static int[] field_f;
    private static int[][] field_s;
    private static boolean[] field_D;
    private static int[] field_S;
    private static int[] field_q;
    private static int[] field_v;
    private static int[] field_e;
    private static int[][] field_C;
    private static int[] field_B;
    private static int[] field_j;
    private static int[] field_u;
    private static int[] field_I;
    private static int[] field_p;
    private static boolean field_E;
    private static int[] field_F;
    private static boolean[] field_z;
    private static int[] field_w;
    private static int[] field_d;
    private static int field_g;
    private static int[] field_V;

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

    private final static int a(int param0, int param1) {
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

    private final void b() {
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
          if (var9 >= ((ss) this).field_O) {
            ((ss) this).field_h = (short)(int)(Math.sqrt((double)var8) + 0.99);
            ((ss) this).field_K = true;
            return;
          } else {
            L1: {
              var10 = ((ss) this).field_x[var9];
              var11 = ((ss) this).field_J[var9];
              var12 = ((ss) this).field_U[var9];
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

    public static void a() {
        field_D = null;
        field_z = null;
        field_p = null;
        field_F = null;
        field_I = null;
        field_H = null;
        field_B = null;
        field_y = null;
        field_j = null;
        field_k = null;
        field_w = null;
        field_s = null;
        field_f = null;
        field_e = null;
        field_c = null;
        field_C = null;
        field_v = null;
        field_d = null;
        field_S = null;
        field_q = null;
        field_u = null;
        field_V = null;
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
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        L0: {
          var2 = jb.field_h;
          var3 = jb.field_j;
          var4 = 0;
          var5 = ((ss) this).field_l[param0];
          var6 = ((ss) this).field_n[param0];
          var7 = ((ss) this).field_M[param0];
          var8 = field_y[var5];
          var9 = field_y[var6];
          var10 = field_y[var7];
          if (((ss) this).field_T != null) {
            jb.field_b = ((ss) this).field_T[param0] & 255;
            break L0;
          } else {
            jb.field_b = 0;
            break L0;
          }
        }
        L1: {
          if (var8 < 50) {
            L2: {
              var11 = field_H[var5];
              var12 = field_B[var5];
              var13 = ((ss) this).field_r[param0] & 65535;
              if (var10 < 50) {
                break L2;
              } else {
                var14 = (50 - var8) * jb.field_c[var10 - var8];
                field_q[var4] = var2 + (var11 + ((field_H[var7] - var11) * var14 >> 16) << 9) / 50;
                field_u[var4] = var3 + (var12 + ((field_B[var7] - var12) * var14 >> 16) << 9) / 50;
                int incrementValue$9 = var4;
                var4++;
                field_V[incrementValue$9] = var13 + (((((ss) this).field_L[param0] & 65535) - var13) * var14 >> 16);
                break L2;
              }
            }
            if (var9 < 50) {
              break L1;
            } else {
              var14 = (50 - var8) * jb.field_c[var9 - var8];
              field_q[var4] = var2 + (var11 + ((field_H[var6] - var11) * var14 >> 16) << 9) / 50;
              field_u[var4] = var3 + (var12 + ((field_B[var6] - var12) * var14 >> 16) << 9) / 50;
              int incrementValue$10 = var4;
              var4++;
              field_V[incrementValue$10] = var13 + (((((ss) this).field_i[param0] & 65535) - var13) * var14 >> 16);
              break L1;
            }
          } else {
            field_q[var4] = field_p[var5];
            field_u[var4] = field_F[var5];
            int incrementValue$11 = var4;
            var4++;
            field_V[incrementValue$11] = ((ss) this).field_r[param0] & 65535;
            break L1;
          }
        }
        L3: {
          if (var9 < 50) {
            L4: {
              var11 = field_H[var6];
              var12 = field_B[var6];
              var13 = ((ss) this).field_i[param0] & 65535;
              if (var8 < 50) {
                break L4;
              } else {
                var14 = (50 - var9) * jb.field_c[var8 - var9];
                field_q[var4] = var2 + (var11 + ((field_H[var5] - var11) * var14 >> 16) << 9) / 50;
                field_u[var4] = var3 + (var12 + ((field_B[var5] - var12) * var14 >> 16) << 9) / 50;
                int incrementValue$12 = var4;
                var4++;
                field_V[incrementValue$12] = var13 + (((((ss) this).field_r[param0] & 65535) - var13) * var14 >> 16);
                break L4;
              }
            }
            if (var10 < 50) {
              break L3;
            } else {
              var14 = (50 - var9) * jb.field_c[var10 - var9];
              field_q[var4] = var2 + (var11 + ((field_H[var7] - var11) * var14 >> 16) << 9) / 50;
              field_u[var4] = var3 + (var12 + ((field_B[var7] - var12) * var14 >> 16) << 9) / 50;
              int incrementValue$13 = var4;
              var4++;
              field_V[incrementValue$13] = var13 + (((((ss) this).field_L[param0] & 65535) - var13) * var14 >> 16);
              break L3;
            }
          } else {
            field_q[var4] = field_p[var6];
            field_u[var4] = field_F[var6];
            int incrementValue$14 = var4;
            var4++;
            field_V[incrementValue$14] = ((ss) this).field_i[param0] & 65535;
            break L3;
          }
        }
        L5: {
          if (var10 < 50) {
            L6: {
              var11 = field_H[var7];
              var12 = field_B[var7];
              var13 = ((ss) this).field_L[param0] & 65535;
              if (var9 < 50) {
                break L6;
              } else {
                var14 = (50 - var10) * jb.field_c[var9 - var10];
                field_q[var4] = var2 + (var11 + ((field_H[var6] - var11) * var14 >> 16) << 9) / 50;
                field_u[var4] = var3 + (var12 + ((field_B[var6] - var12) * var14 >> 16) << 9) / 50;
                int incrementValue$15 = var4;
                var4++;
                field_V[incrementValue$15] = var13 + (((((ss) this).field_i[param0] & 65535) - var13) * var14 >> 16);
                break L6;
              }
            }
            if (var8 < 50) {
              break L5;
            } else {
              var14 = (50 - var10) * jb.field_c[var8 - var10];
              field_q[var4] = var2 + (var11 + ((field_H[var5] - var11) * var14 >> 16) << 9) / 50;
              field_u[var4] = var3 + (var12 + ((field_B[var5] - var12) * var14 >> 16) << 9) / 50;
              int incrementValue$16 = var4;
              var4++;
              field_V[incrementValue$16] = var13 + (((((ss) this).field_r[param0] & 65535) - var13) * var14 >> 16);
              break L5;
            }
          } else {
            field_q[var4] = field_p[var7];
            field_u[var4] = field_F[var7];
            int incrementValue$17 = var4;
            var4++;
            field_V[incrementValue$17] = ((ss) this).field_L[param0] & 65535;
            break L5;
          }
        }
        L7: {
          var11 = field_q[0];
          var12 = field_q[1];
          var13 = field_q[2];
          var14 = field_u[0];
          var15 = field_u[1];
          var16 = field_u[2];
          jb.field_q = false;
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
                      if (var11 > jb.field_o) {
                        break L9;
                      } else {
                        if (var12 > jb.field_o) {
                          break L9;
                        } else {
                          if (var13 <= jb.field_o) {
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
              jb.field_q = true;
              break L8;
            }
            L10: {
              if (((ss) this).field_P == null) {
                break L10;
              } else {
                if (((ss) this).field_P[param0] != -1) {
                  L11: {
                    L12: {
                      if (((ss) this).field_m == null) {
                        break L12;
                      } else {
                        if (((ss) this).field_m[param0] == -1) {
                          break L12;
                        } else {
                          var20 = ((ss) this).field_m[param0] & 255;
                          var17 = ((ss) this).field_G[var20];
                          var18 = ((ss) this).field_R[var20];
                          var19 = ((ss) this).field_N[var20];
                          break L11;
                        }
                      }
                    }
                    var17 = var5;
                    var18 = var6;
                    var19 = var7;
                    break L11;
                  }
                  if (((ss) this).field_L[param0] != -1) {
                    jb.a(var14, var15, var16, var11, var12, var13, field_V[0], field_V[1], field_V[2], field_H[var17], field_H[var18], field_H[var19], field_B[var17], field_B[var18], field_B[var19], field_y[var17], field_y[var18], field_y[var19], (int) ((ss) this).field_P[param0]);
                    break L7;
                  } else {
                    jb.a(var14, var15, var16, var11, var12, var13, ((ss) this).field_r[param0], ((ss) this).field_r[param0], ((ss) this).field_r[param0], field_H[var17], field_H[var18], field_H[var19], field_B[var17], field_B[var18], field_B[var19], field_y[var17], field_y[var18], field_y[var19], (int) ((ss) this).field_P[param0]);
                    break L7;
                  }
                } else {
                  break L10;
                }
              }
            }
            if (((ss) this).field_L[param0] != -1) {
              jb.a(var14, var15, var16, var11, var12, var13, field_V[0], field_V[1], field_V[2]);
              break L7;
            } else {
              jb.a(var14, var15, var16, var11, var12, var13, jb.field_k[((ss) this).field_r[param0] & 65535]);
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
                    if (var11 > jb.field_o) {
                      break L14;
                    } else {
                      if (var12 > jb.field_o) {
                        break L14;
                      } else {
                        if (var13 > jb.field_o) {
                          break L14;
                        } else {
                          if (field_q[3] < 0) {
                            break L14;
                          } else {
                            if (field_q[3] <= jb.field_o) {
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
            jb.field_q = true;
            break L13;
          }
          L15: {
            L16: {
              if (((ss) this).field_P == null) {
                break L16;
              } else {
                if (((ss) this).field_P[param0] != -1) {
                  L17: {
                    L18: {
                      if (((ss) this).field_m == null) {
                        break L18;
                      } else {
                        if (((ss) this).field_m[param0] == -1) {
                          break L18;
                        } else {
                          var20 = ((ss) this).field_m[param0] & 255;
                          var17 = ((ss) this).field_G[var20];
                          var18 = ((ss) this).field_R[var20];
                          var19 = ((ss) this).field_N[var20];
                          break L17;
                        }
                      }
                    }
                    var17 = var5;
                    var18 = var6;
                    var19 = var7;
                    break L17;
                  }
                  var20 = ((ss) this).field_P[param0];
                  if (((ss) this).field_L[param0] != -1) {
                    jb.a(var14, var15, var16, var11, var12, var13, field_V[0], field_V[1], field_V[2], field_H[var17], field_H[var18], field_H[var19], field_B[var17], field_B[var18], field_B[var19], field_y[var17], field_y[var18], field_y[var19], var20);
                    jb.a(var14, var16, field_u[3], var11, var13, field_q[3], field_V[0], field_V[2], field_V[3], field_H[var17], field_H[var18], field_H[var19], field_B[var17], field_B[var18], field_B[var19], field_y[var17], field_y[var18], field_y[var19], var20);
                    break L15;
                  } else {
                    jb.a(var14, var15, var16, var11, var12, var13, ((ss) this).field_r[param0], ((ss) this).field_r[param0], ((ss) this).field_r[param0], field_H[var17], field_H[var18], field_H[var19], field_B[var17], field_B[var18], field_B[var19], field_y[var17], field_y[var18], field_y[var19], var20);
                    jb.a(var14, var16, field_u[3], var11, var13, field_q[3], ((ss) this).field_r[param0], ((ss) this).field_r[param0], ((ss) this).field_r[param0], field_H[var17], field_H[var18], field_H[var19], field_B[var17], field_B[var18], field_B[var19], field_y[var17], field_y[var18], field_y[var19], var20);
                    break L15;
                  }
                } else {
                  break L16;
                }
              }
            }
            if (((ss) this).field_L[param0] != -1) {
              jb.a(var14, var15, var16, var11, var12, var13, field_V[0], field_V[1], field_V[2]);
              jb.a(var14, var16, field_u[3], var11, var13, field_q[3], field_V[0], field_V[2], field_V[3]);
              break L15;
            } else {
              var17 = jb.field_k[((ss) this).field_r[param0] & 65535];
              jb.a(var14, var15, var16, var11, var12, var13, var17);
              jb.a(var14, var16, field_u[3], var11, var13, field_q[3], var17);
              break L15;
            }
          }
          return;
        }
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
            var7 = 0;
            if (field_E) {
              break L0;
            } else {
              var8 = 0;
              L1: while (true) {
                if (var8 >= 1600) {
                  var8 = 0;
                  L2: while (true) {
                    if (var8 >= 32) {
                      field_g = 0;
                      break L0;
                    } else {
                      field_w[var8] = 0;
                      var8++;
                      continue L2;
                    }
                  }
                } else {
                  field_j[var8] = 0;
                  var8++;
                  continue L1;
                }
              }
            }
          }
          var8 = 0;
          L3: while (true) {
            if (var8 >= ((ss) this).field_o) {
              L4: {
                if (!field_E) {
                  if (((ss) this).field_A != null) {
                    var8 = 0;
                    L5: while (true) {
                      if (var8 >= 12) {
                        var8 = param4 - 1;
                        L6: while (true) {
                          if (var8 < 0) {
                            break L4;
                          } else {
                            L7: {
                              var9 = field_j[var8];
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
                                var47 = field_k[var8];
                                var12 = 0;
                                L9: while (true) {
                                  if (var12 >= var10) {
                                    break L7;
                                  } else {
                                    var13 = var47[var12];
                                    var14_int = ((ss) this).field_A[var13];
                                    field_c[var14_int] = field_c[var14_int] + 1;
                                    var15_int = field_c[var14_int];
                                    field_C[var14_int][var15_int] = var13;
                                    if (var14_int >= 10) {
                                      if (var14_int != 10) {
                                        field_d[var15_int] = var8;
                                        var12++;
                                        continue L9;
                                      } else {
                                        field_v[var15_int] = var8;
                                        var12++;
                                        continue L9;
                                      }
                                    } else {
                                      field_S[var14_int] = field_S[var14_int] + var8;
                                      var12++;
                                      continue L9;
                                    }
                                  }
                                }
                              }
                            }
                            if (var9 > 64) {
                              var10 = field_j[var8] - 65;
                              var48 = field_s[var10];
                              var12 = 0;
                              L10: while (true) {
                                if (var12 < field_w[var10]) {
                                  var13 = var48[var12];
                                  var14_int = ((ss) this).field_A[var13];
                                  field_c[var14_int] = field_c[var14_int] + 1;
                                  var15_int = field_c[var14_int];
                                  field_C[var14_int][var15_int] = var13;
                                  if (var14_int >= 10) {
                                    if (var14_int != 10) {
                                      field_d[var15_int] = var8;
                                      var12++;
                                      continue L10;
                                    } else {
                                      field_v[var15_int] = var8;
                                      var12++;
                                      continue L10;
                                    }
                                  } else {
                                    field_S[var14_int] = field_S[var14_int] + var8;
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
                        field_c[var8] = 0;
                        field_S[var8] = 0;
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
                          var9 = field_j[var8];
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
                            var45 = field_k[var8];
                            var12 = 0;
                            L14: while (true) {
                              if (var12 >= var10) {
                                break L12;
                              } else {
                                this.b(var45[var12]);
                                var12++;
                                continue L14;
                              }
                            }
                          }
                        }
                        if (var9 > 64) {
                          var10 = field_j[var8] - 65;
                          var46 = field_s[var10];
                          var12 = 0;
                          L15: while (true) {
                            if (var12 < field_w[var10]) {
                              this.b(var46[var12]);
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
                  gm.a(var7 - 1, -30111, field_f, field_e, 0);
                  if (((ss) this).field_A != null) {
                    var8 = 0;
                    L16: while (true) {
                      if (var8 >= 12) {
                        var8 = 0;
                        L17: while (true) {
                          if (var8 >= var7) {
                            break L4;
                          } else {
                            var9 = field_e[var8];
                            var10 = field_f[var8];
                            var11 = ((ss) this).field_A[var9];
                            field_c[var11] = field_c[var11] + 1;
                            var12 = field_c[var11];
                            field_C[var11][var12] = var9;
                            if (var11 >= 10) {
                              if (var11 != 10) {
                                field_d[var12] = var10;
                                var8++;
                                continue L17;
                              } else {
                                field_v[var12] = var10;
                                var8++;
                                continue L17;
                              }
                            } else {
                              field_S[var11] = field_S[var11] + var10;
                              var8++;
                              continue L17;
                            }
                          }
                        }
                      } else {
                        field_c[var8] = 0;
                        field_S[var8] = 0;
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
                        this.b(field_e[var8]);
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
                  if (field_c[1] > 0) {
                    break L20;
                  } else {
                    if (field_c[2] <= 0) {
                      break L19;
                    } else {
                      break L20;
                    }
                  }
                }
                var8 = (field_S[1] + field_S[2]) / (field_c[1] + field_c[2]);
                break L19;
              }
              L21: {
                L22: {
                  var9 = 0;
                  if (field_c[3] > 0) {
                    break L22;
                  } else {
                    if (field_c[4] <= 0) {
                      break L21;
                    } else {
                      break L22;
                    }
                  }
                }
                var9 = (field_S[3] + field_S[4]) / (field_c[3] + field_c[4]);
                break L21;
              }
              L23: {
                L24: {
                  var10 = 0;
                  if (field_c[6] > 0) {
                    break L24;
                  } else {
                    if (field_c[8] <= 0) {
                      break L23;
                    } else {
                      break L24;
                    }
                  }
                }
                var10 = (field_S[6] + field_S[8]) / (field_c[6] + field_c[8]);
                break L23;
              }
              L25: {
                var12 = 0;
                var13 = field_c[10];
                var14 = field_C[10];
                var15 = field_v;
                if (var12 != var13) {
                  break L25;
                } else {
                  var12 = 0;
                  var13 = field_c[11];
                  var14 = field_C[11];
                  var15 = field_d;
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
                        this.b(var14[incrementValue$7]);
                        if (var12 != var13) {
                          break L29;
                        } else {
                          if (var14 == field_C[11]) {
                            break L29;
                          } else {
                            var12 = 0;
                            var14 = field_C[11];
                            var13 = field_c[11];
                            var15 = field_d;
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
                            this.b(var14[incrementValue$8]);
                            if (var12 != var13) {
                              break L32;
                            } else {
                              if (var14 == field_C[11]) {
                                break L32;
                              } else {
                                var12 = 0;
                                var13 = field_c[11];
                                var14 = field_C[11];
                                var15 = field_d;
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
                              this.b(var14[incrementValue$9]);
                              if (var12 != var13) {
                                break L35;
                              } else {
                                if (var14 == field_C[11]) {
                                  break L35;
                                } else {
                                  var12 = 0;
                                  var13 = field_c[11];
                                  var14 = field_C[11];
                                  var15 = field_d;
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
                                this.b(var14[incrementValue$10]);
                                if (var12 != var13) {
                                  break L38;
                                } else {
                                  if (var14 == field_C[11]) {
                                    break L38;
                                  } else {
                                    var12 = 0;
                                    var13 = field_c[11];
                                    var14 = field_C[11];
                                    var15 = field_d;
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
                        var17 = field_c[var16];
                        var49 = field_C[var16];
                        var29 = 0;
                        var19 = var29;
                        L39: while (true) {
                          if (var29 >= var17) {
                            var16++;
                            continue L27;
                          } else {
                            this.b(var49[var29]);
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
              if (((ss) this).field_L[var8] != -2) {
                L40: {
                  var9 = ((ss) this).field_l[var8];
                  var10 = ((ss) this).field_n[var8];
                  var11 = ((ss) this).field_M[var8];
                  var12 = field_p[var9];
                  var13 = field_p[var10];
                  var14_int = field_p[var11];
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
                    var15_int = field_H[var9];
                    var16 = field_H[var10];
                    var17 = field_H[var11];
                    var18 = field_B[var9];
                    var19 = field_B[var10];
                    var20 = field_B[var11];
                    var21 = field_y[var9];
                    var22 = field_y[var10];
                    var23 = field_y[var11];
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
                      field_z[var8] = true;
                      if (!field_E) {
                        var27 = (field_I[var9] + field_I[var10] + field_I[var11]) / 3 + param3;
                        if (field_j[var27] >= 64) {
                          L42: {
                            var28 = field_j[var27];
                            if (var28 != 64) {
                              break L42;
                            } else {
                              if (field_g != 512) {
                                field_g = field_g + 1;
                                var28 = 65 + field_g;
                                field_j[var27] = 65 + field_g;
                                break L42;
                              } else {
                                var8++;
                                continue L3;
                              }
                            }
                          }
                          var28 -= 65;
                          field_w[var28] = field_w[var28] + 1;
                          field_s[var28][field_w[var28]] = var8;
                          var8++;
                          continue L3;
                        } else {
                          field_j[var27] = field_j[var27] + 1;
                          field_k[var27][field_j[var27]] = var8;
                          var8++;
                          continue L3;
                        }
                      } else {
                        field_f[var7] = (field_I[var9] + field_I[var10] + field_I[var11]) / 3;
                        int incrementValue$11 = var7;
                        var7++;
                        field_e[incrementValue$11] = var8;
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
                    if (!this.a(aca.field_i + jb.field_h, on.field_n + jb.field_j, field_F[var9], field_F[var10], field_F[var11], var12, var13, var14_int)) {
                      break L43;
                    } else {
                      int fieldTemp$12 = dn.field_a;
                      dn.field_a = dn.field_a + 1;
                      p.field_l[fieldTemp$12] = param2;
                      param1 = false;
                      break L43;
                    }
                  }
                }
                if ((var12 - var13) * (field_F[var11] - field_F[var10]) - (field_F[var9] - field_F[var10]) * (var14_int - var13) > 0) {
                  L44: {
                    L45: {
                      field_z[var8] = false;
                      if (var12 < 0) {
                        break L45;
                      } else {
                        if (var13 < 0) {
                          break L45;
                        } else {
                          if (var14_int < 0) {
                            break L45;
                          } else {
                            if (var12 > jb.field_o) {
                              break L45;
                            } else {
                              if (var13 > jb.field_o) {
                                break L45;
                              } else {
                                if (var14_int <= jb.field_o) {
                                  field_D[var8] = false;
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
                    field_D[var8] = true;
                    break L44;
                  }
                  if (!field_E) {
                    var15_int = (field_I[var9] + field_I[var10] + field_I[var11]) / 3 + param3;
                    if (field_j[var15_int] >= 64) {
                      L46: {
                        var16 = field_j[var15_int];
                        if (var16 != 64) {
                          break L46;
                        } else {
                          if (field_g != 512) {
                            field_g = field_g + 1;
                            var16 = 65 + field_g;
                            field_j[var15_int] = 65 + field_g;
                            break L46;
                          } else {
                            var8++;
                            continue L3;
                          }
                        }
                      }
                      var16 -= 65;
                      field_w[var16] = field_w[var16] + 1;
                      field_s[var16][field_w[var16]] = var8;
                      var8++;
                      continue L3;
                    } else {
                      field_j[var15_int] = field_j[var15_int] + 1;
                      field_k[var15_int][field_j[var15_int]] = var8;
                      var8++;
                      continue L3;
                    }
                  } else {
                    field_f[var7] = (field_I[var9] + field_I[var10] + field_I[var11]) / 3;
                    int incrementValue$13 = var7;
                    var7++;
                    field_e[incrementValue$13] = var8;
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
          if (((ss) this).field_K) {
            break L0;
          } else {
            this.b();
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
        if (var5 >= 50 - ((ss) this).field_h) {
          var15 = ((ss) this).field_h * 92682 >> 16;
          if (var3 >= -var5 - var15) {
            if (var3 <= var5 + var15) {
              if (var4 >= -var5 - var15) {
                if (var4 <= var5 + var15) {
                  L1: {
                    if (var5 > 50 + ((ss) this).field_h) {
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
                      if (((ss) this).field_t > 0) {
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
                  var18 = jb.field_h;
                  var19 = jb.field_j;
                  var20 = 0;
                  var27 = 0;
                  var21_int = var27;
                  L3: while (true) {
                    if (var27 >= ((ss) this).field_W) {
                      try {
                        L4: {
                          this.a((var20 & var16) != 0, false, 0L, (int) ((ss) this).field_h, ((ss) this).field_h << 1);
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
                        var22 = ((ss) this).field_x[var27];
                        var23 = ((ss) this).field_J[var27];
                        var24 = ((ss) this).field_U[var27];
                        var25 = var22 * var6 + var23 * var9 + var24 * var12 >> 16;
                        var26 = var22 * var7 + var23 * var10 + var24 * var13 >> 16;
                        var24 = var22 * var8 + var23 * var11 + var24 * var14 >> 16;
                        var22 = var25;
                        var23 = var26;
                        field_I[var27] = var24;
                        var22 = var22 + var3;
                        var23 = var23 + var4;
                        var24 = var24 + var5;
                        if (var24 < 50) {
                          field_p[var27] = -5000;
                          var20 = 1;
                          break L6;
                        } else {
                          field_p[var27] = var18 + (var22 << 9) / var24;
                          field_F[var27] = var19 + (var23 << 9) / var24;
                          break L6;
                        }
                      }
                      if (var17 != 0) {
                        field_H[var27] = var22;
                        field_B[var27] = var23;
                        field_y[var27] = var24;
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

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        for (var4 = 0; var4 < ((ss) this).field_W; var4++) {
            ((ss) this).field_x[var4] = ((ss) this).field_x[var4] * param0 / 128;
            ((ss) this).field_J[var4] = ((ss) this).field_J[var4] * param1 / 128;
            ((ss) this).field_U[var4] = ((ss) this).field_U[var4] * param2 / 128;
        }
        ((ss) this).field_K = false;
    }

    private final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (!field_z[param0]) {
          L0: {
            var2 = ((ss) this).field_l[param0];
            var3 = ((ss) this).field_n[param0];
            var4 = ((ss) this).field_M[param0];
            jb.field_q = field_D[param0];
            if (((ss) this).field_T != null) {
              jb.field_b = ((ss) this).field_T[param0] & 255;
              break L0;
            } else {
              jb.field_b = 0;
              break L0;
            }
          }
          L1: {
            L2: {
              if (((ss) this).field_P == null) {
                break L2;
              } else {
                if (((ss) this).field_P[param0] != -1) {
                  L3: {
                    L4: {
                      if (((ss) this).field_m == null) {
                        break L4;
                      } else {
                        if (((ss) this).field_m[param0] == -1) {
                          break L4;
                        } else {
                          var8 = ((ss) this).field_m[param0] & 255;
                          var5 = ((ss) this).field_G[var8];
                          var6 = ((ss) this).field_R[var8];
                          var7 = ((ss) this).field_N[var8];
                          break L3;
                        }
                      }
                    }
                    var5 = var2;
                    var6 = var3;
                    var7 = var4;
                    break L3;
                  }
                  if (((ss) this).field_L[param0] != -1) {
                    jb.a(field_F[var2], field_F[var3], field_F[var4], field_p[var2], field_p[var3], field_p[var4], ((ss) this).field_r[param0], ((ss) this).field_i[param0], ((ss) this).field_L[param0], field_H[var5], field_H[var6], field_H[var7], field_B[var5], field_B[var6], field_B[var7], field_y[var5], field_y[var6], field_y[var7], (int) ((ss) this).field_P[param0]);
                    break L1;
                  } else {
                    jb.a(field_F[var2], field_F[var3], field_F[var4], field_p[var2], field_p[var3], field_p[var4], ((ss) this).field_r[param0], ((ss) this).field_r[param0], ((ss) this).field_r[param0], field_H[var5], field_H[var6], field_H[var7], field_B[var5], field_B[var6], field_B[var7], field_y[var5], field_y[var6], field_y[var7], (int) ((ss) this).field_P[param0]);
                    break L1;
                  }
                } else {
                  break L2;
                }
              }
            }
            if (((ss) this).field_L[param0] != -1) {
              jb.a(field_F[var2], field_F[var3], field_F[var4], field_p[var2], field_p[var3], field_p[var4], ((ss) this).field_r[param0] & 65535, ((ss) this).field_i[param0] & 65535, ((ss) this).field_L[param0] & 65535);
              break L1;
            } else {
              jb.a(field_F[var2], field_F[var3], field_F[var4], field_p[var2], field_p[var3], field_p[var4], jb.field_k[((ss) this).field_r[param0] & 65535]);
              break L1;
            }
          }
          return;
        } else {
          this.d(param0);
          return;
        }
    }

    private ss() {
        ((ss) this).field_t = 0;
        ((ss) this).field_W = 0;
        ((ss) this).field_K = false;
        ((ss) this).field_o = 0;
        ((ss) this).field_O = 0;
    }

    ss(le param0, int param1, int param2, int param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var9_ref_int__ = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        sr var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        jea var18 = null;
        jea var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        L0: {
          ((ss) this).field_t = 0;
          ((ss) this).field_W = 0;
          ((ss) this).field_K = false;
          ((ss) this).field_o = 0;
          ((ss) this).field_O = 0;
          param0.b();
          param0.a();
          ((ss) this).field_W = param0.field_d;
          ((ss) this).field_O = param0.field_F;
          ((ss) this).field_x = param0.field_l;
          ((ss) this).field_J = param0.field_L;
          ((ss) this).field_U = param0.field_H;
          ((ss) this).field_o = param0.field_i;
          ((ss) this).field_l = param0.field_p;
          ((ss) this).field_n = param0.field_v;
          ((ss) this).field_M = param0.field_J;
          ((ss) this).field_A = param0.field_A;
          ((ss) this).field_T = param0.field_q;
          var7 = (int)Math.sqrt((double)(param3 * param3 + param4 * param4 + param5 * param5));
          var8 = param2 * var7 >> 8;
          ((ss) this).field_r = new int[((ss) this).field_o];
          ((ss) this).field_i = new int[((ss) this).field_o];
          ((ss) this).field_L = new int[((ss) this).field_o];
          if (param0.field_x == null) {
            ((ss) this).field_P = null;
            break L0;
          } else {
            ((ss) this).field_P = new short[((ss) this).field_o];
            var9 = 0;
            L1: while (true) {
              if (var9 >= ((ss) this).field_o) {
                break L0;
              } else {
                L2: {
                  var10 = param0.field_x[var9];
                  if (var10 == -1) {
                    break L2;
                  } else {
                    if (!jb.field_g.b(-23316, var10)) {
                      break L2;
                    } else {
                      ((ss) this).field_P[var9] = (short)var10;
                      var9++;
                      continue L1;
                    }
                  }
                }
                ((ss) this).field_P[var9] = (short) -1;
                var9++;
                continue L1;
              }
            }
          }
        }
        L3: {
          if (param0.field_u <= 0) {
            break L3;
          } else {
            if (param0.field_s == null) {
              break L3;
            } else {
              var22 = new int[param0.field_u];
              var21 = var22;
              var20 = var21;
              var17 = var20;
              var9_ref_int__ = var17;
              var10 = 0;
              L4: while (true) {
                if (var10 >= ((ss) this).field_o) {
                  ((ss) this).field_t = 0;
                  var10 = 0;
                  L5: while (true) {
                    if (var10 >= param0.field_u) {
                      ((ss) this).field_G = new int[((ss) this).field_t];
                      ((ss) this).field_R = new int[((ss) this).field_t];
                      ((ss) this).field_N = new int[((ss) this).field_t];
                      var10 = 0;
                      var11 = 0;
                      L6: while (true) {
                        if (var11 >= param0.field_u) {
                          ((ss) this).field_m = new byte[((ss) this).field_o];
                          var11 = 0;
                          L7: while (true) {
                            if (var11 >= ((ss) this).field_o) {
                              break L3;
                            } else {
                              if (param0.field_s[var11] == -1) {
                                ((ss) this).field_m[var11] = (byte) -1;
                                var11++;
                                continue L7;
                              } else {
                                ((ss) this).field_m[var11] = (byte)var9_ref_int__[param0.field_s[var11] & 255];
                                if (((ss) this).field_m[var11] == -1) {
                                  if (((ss) this).field_P != null) {
                                    ((ss) this).field_P[var11] = (short) -1;
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
                              if (param0.field_e[var11] != 0) {
                                break L8;
                              } else {
                                ((ss) this).field_G[var10] = param0.field_I[var11] & 65535;
                                ((ss) this).field_R[var10] = param0.field_w[var11] & 65535;
                                ((ss) this).field_N[var10] = param0.field_E[var11] & 65535;
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
                        if (param0.field_e[var10] == 0) {
                          ((ss) this).field_t = ((ss) this).field_t + 1;
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
                  if (param0.field_s[var10] != -1) {
                    var9_ref_int__[param0.field_s[var10] & 255] = var9_ref_int__[param0.field_s[var10] & 255] + 1;
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
          if (var16 >= ((ss) this).field_o) {
            return;
          } else {
            L10: {
              if (param0.field_C != null) {
                var10 = param0.field_C[var16];
                break L10;
              } else {
                var10 = 0;
                break L10;
              }
            }
            L11: {
              if (param0.field_q != null) {
                var11 = param0.field_q[var16];
                break L11;
              } else {
                var11 = 0;
                break L11;
              }
            }
            L12: {
              if (((ss) this).field_P != null) {
                var12 = ((ss) this).field_P[var16];
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
                  ((ss) this).field_L[var16] = -2;
                  var16++;
                  continue L9;
                } else {
                  var19 = param0.field_B[var16];
                  var14 = param1 + (param3 * var19.field_b + param4 * var19.field_e + param5 * var19.field_a) / (var8 + var8 / 2);
                  ((ss) this).field_r[var16] = ss.c(var14);
                  ((ss) this).field_L[var16] = -1;
                  var16++;
                  continue L9;
                }
              } else {
                L15: {
                  L16: {
                    if (param0.field_m == null) {
                      break L16;
                    } else {
                      if (param0.field_m[((ss) this).field_l[var16]] == null) {
                        break L16;
                      } else {
                        var13 = param0.field_m[((ss) this).field_l[var16]];
                        break L15;
                      }
                    }
                  }
                  var13 = param0.field_D[((ss) this).field_l[var16]];
                  break L15;
                }
                L17: {
                  L18: {
                    var14 = param1 + (param3 * var13.field_f + param4 * var13.field_h + param5 * var13.field_e) / (var8 * var13.field_g);
                    ((ss) this).field_r[var16] = ss.c(var14);
                    if (param0.field_m == null) {
                      break L18;
                    } else {
                      if (param0.field_m[((ss) this).field_n[var16]] == null) {
                        break L18;
                      } else {
                        var13 = param0.field_m[((ss) this).field_n[var16]];
                        break L17;
                      }
                    }
                  }
                  var13 = param0.field_D[((ss) this).field_n[var16]];
                  break L17;
                }
                L19: {
                  L20: {
                    var14 = param1 + (param3 * var13.field_f + param4 * var13.field_h + param5 * var13.field_e) / (var8 * var13.field_g);
                    ((ss) this).field_i[var16] = ss.c(var14);
                    if (param0.field_m == null) {
                      break L20;
                    } else {
                      if (param0.field_m[((ss) this).field_M[var16]] == null) {
                        break L20;
                      } else {
                        var13 = param0.field_m[((ss) this).field_M[var16]];
                        break L19;
                      }
                    }
                  }
                  var13 = param0.field_D[((ss) this).field_M[var16]];
                  break L19;
                }
                var14 = param1 + (param3 * var13.field_f + param4 * var13.field_h + param5 * var13.field_e) / (var8 * var13.field_g);
                ((ss) this).field_L[var16] = ss.c(var14);
                var16++;
                continue L9;
              }
            } else {
              if (var10 != 0) {
                if (var10 != 1) {
                  if (var10 != 3) {
                    ((ss) this).field_L[var16] = -2;
                    var16++;
                    continue L9;
                  } else {
                    ((ss) this).field_r[var16] = 128;
                    ((ss) this).field_L[var16] = -1;
                    var16++;
                    continue L9;
                  }
                } else {
                  var18 = param0.field_B[var16];
                  var14 = param1 + (param3 * var18.field_b + param4 * var18.field_e + param5 * var18.field_a) / (var8 + var8 / 2) << 17;
                  ((ss) this).field_r[var16] = var14 | ss.a(param0.field_z[var16] & 65535, var14 >> 17);
                  ((ss) this).field_L[var16] = -1;
                  var16++;
                  continue L9;
                }
              } else {
                L21: {
                  L22: {
                    var15 = param0.field_z[var16] & 65535;
                    if (param0.field_m == null) {
                      break L22;
                    } else {
                      if (param0.field_m[((ss) this).field_l[var16]] == null) {
                        break L22;
                      } else {
                        var13 = param0.field_m[((ss) this).field_l[var16]];
                        break L21;
                      }
                    }
                  }
                  var13 = param0.field_D[((ss) this).field_l[var16]];
                  break L21;
                }
                L23: {
                  L24: {
                    var14 = param1 + (param3 * var13.field_f + param4 * var13.field_h + param5 * var13.field_e) / (var8 * var13.field_g) << 17;
                    ((ss) this).field_r[var16] = var14 | ss.a(var15, var14 >> 17);
                    if (param0.field_m == null) {
                      break L24;
                    } else {
                      if (param0.field_m[((ss) this).field_n[var16]] == null) {
                        break L24;
                      } else {
                        var13 = param0.field_m[((ss) this).field_n[var16]];
                        break L23;
                      }
                    }
                  }
                  var13 = param0.field_D[((ss) this).field_n[var16]];
                  break L23;
                }
                L25: {
                  L26: {
                    var14 = param1 + (param3 * var13.field_f + param4 * var13.field_h + param5 * var13.field_e) / (var8 * var13.field_g) << 17;
                    ((ss) this).field_i[var16] = var14 | ss.a(var15, var14 >> 17);
                    if (param0.field_m == null) {
                      break L26;
                    } else {
                      if (param0.field_m[((ss) this).field_M[var16]] == null) {
                        break L26;
                      } else {
                        var13 = param0.field_m[((ss) this).field_M[var16]];
                        break L25;
                      }
                    }
                  }
                  var13 = param0.field_D[((ss) this).field_M[var16]];
                  break L25;
                }
                var14 = param1 + (param3 * var13.field_f + param4 * var13.field_h + param5 * var13.field_e) / (var8 * var13.field_g) << 17;
                ((ss) this).field_L[var16] = var14 | ss.a(var15, var14 >> 17);
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
        ss discarded$0 = new ss();
        ss discarded$1 = new ss();
        ss discarded$2 = new ss();
        field_y = new int[4096];
        field_S = new int[12];
        field_c = new int[12];
        field_H = new int[4096];
        field_v = new int[4096];
        field_q = new int[10];
        field_u = new int[10];
        field_D = new boolean[4096];
        field_F = new int[4096];
        field_E = false;
        field_z = new boolean[4096];
        field_I = new int[4096];
        field_g = 0;
        field_p = new int[4096];
        field_B = new int[4096];
        if (field_E) {
            field_f = new int[4096];
            field_e = new int[4096];
        } else {
            field_j = new int[1600];
            field_k = new int[1600][64];
            field_w = new int[32];
            field_s = new int[32][512];
        }
        field_C = new int[12][4096];
        field_d = new int[4096];
        field_V = new int[10];
    }
}
