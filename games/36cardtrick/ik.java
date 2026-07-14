/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ik extends m {
    private short field_v;
    private int[] field_R;
    private int[] field_q;
    int[] field_u;
    private byte[] field_w;
    private int[] field_B;
    private byte[] field_Q;
    private int[] field_t;
    private boolean field_o;
    private int[] field_I;
    private int[] field_F;
    private int[] field_j;
    private int field_V;
    private int[] field_d;
    private int[] field_C;
    short[] field_l;
    private int field_E;
    int[] field_h;
    private int field_b;
    int[] field_U;
    private int field_r;
    byte[] field_O;
    private static int[] field_g;
    private static int[] field_G;
    private static int[] field_x;
    private static int[] field_m;
    private static int[] field_n;
    private static int[] field_k;
    private static int[][] field_e;
    private static int[] field_P;
    private static boolean[] field_D;
    private static int[][] field_H;
    private static int[][] field_L;
    private static int[] field_N;
    private static int[] field_S;
    private static int[] field_s;
    private static int[] field_K;
    private static int[] field_p;
    private static boolean field_y;
    private static int[] field_z;
    private static int[] field_c;
    private static int[] field_J;
    private static boolean[] field_M;
    private static int[] field_T;
    private static int[] field_i;
    private static int field_f;

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

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, long param7) {
        RuntimeException var10 = null;
        int var10_int = 0;
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
        Object stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        try {
          L0: {
            if (((ik) this).field_o) {
              break L0;
            } else {
              this.b();
              break L0;
            }
          }
          var10_int = jb.field_m;
          var11 = jb.field_g;
          var12 = jb.field_j[param0];
          var13 = jb.field_k[param0];
          var14 = jb.field_j[param1];
          var15 = jb.field_k[param1];
          var16 = jb.field_j[param2];
          var17 = jb.field_k[param2];
          var18 = jb.field_j[param3];
          var19 = jb.field_k[param3];
          var20 = param5 * var18 + param6 * var19 >> 16;
          var21 = 0;
          L1: while (true) {
            if (var21 >= ((ik) this).field_r) {
              L2: {
                stackOut_13_0 = this;
                stackOut_13_1 = 0;
                stackIn_15_0 = stackOut_13_0;
                stackIn_15_1 = stackOut_13_1;
                stackIn_14_0 = stackOut_13_0;
                stackIn_14_1 = stackOut_13_1;
                if (param7 < 0L) {
                  stackOut_15_0 = this;
                  stackOut_15_1 = stackIn_15_1;
                  stackOut_15_2 = 0;
                  stackIn_16_0 = stackOut_15_0;
                  stackIn_16_1 = stackOut_15_1;
                  stackIn_16_2 = stackOut_15_2;
                  break L2;
                } else {
                  stackOut_14_0 = this;
                  stackOut_14_1 = stackIn_14_1;
                  stackOut_14_2 = 1;
                  stackIn_16_0 = stackOut_14_0;
                  stackIn_16_1 = stackOut_14_1;
                  stackIn_16_2 = stackOut_14_2;
                  break L2;
                }
              }
              this.a(stackIn_16_1 != 0, stackIn_16_2 != 0, param7, (int) ((ik) this).field_v, ((ik) this).field_v << 1);
            } else {
              L3: {
                var22 = ((ik) this).field_B[var21];
                var23 = ((ik) this).field_F[var21];
                var24 = ((ik) this).field_q[var21];
                if (param2 == 0) {
                  break L3;
                } else {
                  var25 = var23 * var16 + var22 * var17 >> 16;
                  var23 = var23 * var17 - var22 * var16 >> 16;
                  var22 = var25;
                  break L3;
                }
              }
              L4: {
                if (param0 == 0) {
                  break L4;
                } else {
                  var25 = var23 * var13 - var24 * var12 >> 16;
                  var24 = var23 * var12 + var24 * var13 >> 16;
                  var23 = var25;
                  break L4;
                }
              }
              L5: {
                if (param1 == 0) {
                  break L5;
                } else {
                  var25 = var24 * var14 + var22 * var15 >> 16;
                  var24 = var24 * var15 - var22 * var14 >> 16;
                  var22 = var25;
                  break L5;
                }
              }
              L6: {
                var22 = var22 + param4;
                var23 = var23 + param5;
                var24 = var24 + param6;
                var25 = var23 * var19 - var24 * var18 >> 16;
                var24 = var23 * var18 + var24 * var19 >> 16;
                var23 = var25;
                field_z[var21] = var24 - var20;
                field_G[var21] = var10_int + (var22 << 9) / var24;
                field_k[var21] = var11 + (var23 << 9) / var24;
                if (((ik) this).field_E <= 0) {
                  break L6;
                } else {
                  field_J[var21] = var22;
                  field_s[var21] = var23;
                  field_i[var21] = var24;
                  break L6;
                }
              }
              var21++;
              continue L1;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
        }
        var10 = decompiledCaughtException;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this.a(param0, param1, param2, param3, param4, param5, param6, -1L);
    }

    private final static int d(int param0) {
        if (param0 < 2) {
            param0 = 2;
        } else {
            if (param0 > 126) {
                param0 = 126;
            }
        }
        return param0;
    }

    private final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (!field_D[param0]) {
          L0: {
            var2 = ((ik) this).field_j[param0];
            var3 = ((ik) this).field_R[param0];
            var4 = ((ik) this).field_d[param0];
            jb.field_n = field_M[param0];
            if (((ik) this).field_w != null) {
              jb.field_d = ((ik) this).field_w[param0] & 255;
              break L0;
            } else {
              jb.field_d = 0;
              break L0;
            }
          }
          L1: {
            L2: {
              if (((ik) this).field_l == null) {
                break L2;
              } else {
                if (((ik) this).field_l[param0] != -1) {
                  L3: {
                    L4: {
                      if (((ik) this).field_O == null) {
                        break L4;
                      } else {
                        if (((ik) this).field_O[param0] == -1) {
                          break L4;
                        } else {
                          var8 = ((ik) this).field_O[param0] & 255;
                          var5 = ((ik) this).field_h[var8];
                          var6 = ((ik) this).field_u[var8];
                          var7 = ((ik) this).field_U[var8];
                          break L3;
                        }
                      }
                    }
                    var5 = var2;
                    var6 = var3;
                    var7 = var4;
                    break L3;
                  }
                  if (((ik) this).field_I[param0] != -1) {
                    jb.a(field_k[var2], field_k[var3], field_k[var4], field_G[var2], field_G[var3], field_G[var4], ((ik) this).field_t[param0], ((ik) this).field_C[param0], ((ik) this).field_I[param0], field_J[var5], field_J[var6], field_J[var7], field_s[var5], field_s[var6], field_s[var7], field_i[var5], field_i[var6], field_i[var7], (int) ((ik) this).field_l[param0]);
                    break L1;
                  } else {
                    jb.a(field_k[var2], field_k[var3], field_k[var4], field_G[var2], field_G[var3], field_G[var4], ((ik) this).field_t[param0], ((ik) this).field_t[param0], ((ik) this).field_t[param0], field_J[var5], field_J[var6], field_J[var7], field_s[var5], field_s[var6], field_s[var7], field_i[var5], field_i[var6], field_i[var7], (int) ((ik) this).field_l[param0]);
                    break L1;
                  }
                } else {
                  break L2;
                }
              }
            }
            if (((ik) this).field_I[param0] != -1) {
              jb.a(field_k[var2], field_k[var3], field_k[var4], field_G[var2], field_G[var3], field_G[var4], ((ik) this).field_t[param0] & 65535, ((ik) this).field_C[param0] & 65535, ((ik) this).field_I[param0] & 65535);
              break L1;
            } else {
              jb.a(field_k[var2], field_k[var3], field_k[var4], field_G[var2], field_G[var3], field_G[var4], jb.field_p[((ik) this).field_t[param0] & 65535]);
              break L1;
            }
          }
          return;
        } else {
          this.c(param0);
          return;
        }
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

    private final void c(int param0) {
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
          var2 = jb.field_m;
          var3 = jb.field_g;
          var4 = 0;
          var5 = ((ik) this).field_j[param0];
          var6 = ((ik) this).field_R[param0];
          var7 = ((ik) this).field_d[param0];
          var8 = field_i[var5];
          var9 = field_i[var6];
          var10 = field_i[var7];
          if (((ik) this).field_w != null) {
            jb.field_d = ((ik) this).field_w[param0] & 255;
            break L0;
          } else {
            jb.field_d = 0;
            break L0;
          }
        }
        L1: {
          if (var8 < 50) {
            L2: {
              var11 = field_J[var5];
              var12 = field_s[var5];
              var13 = ((ik) this).field_t[param0] & 65535;
              if (var10 < 50) {
                break L2;
              } else {
                var14 = (50 - var8) * jb.field_a[var10 - var8];
                field_N[var4] = var2 + (var11 + ((field_J[var7] - var11) * var14 >> 16) << 9) / 50;
                field_p[var4] = var3 + (var12 + ((field_s[var7] - var12) * var14 >> 16) << 9) / 50;
                var4++;
                field_g[var4] = var13 + (((((ik) this).field_I[param0] & 65535) - var13) * var14 >> 16);
                break L2;
              }
            }
            if (var9 < 50) {
              break L1;
            } else {
              var14 = (50 - var8) * jb.field_a[var9 - var8];
              field_N[var4] = var2 + (var11 + ((field_J[var6] - var11) * var14 >> 16) << 9) / 50;
              field_p[var4] = var3 + (var12 + ((field_s[var6] - var12) * var14 >> 16) << 9) / 50;
              var4++;
              field_g[var4] = var13 + (((((ik) this).field_C[param0] & 65535) - var13) * var14 >> 16);
              break L1;
            }
          } else {
            field_N[var4] = field_G[var5];
            field_p[var4] = field_k[var5];
            var4++;
            field_g[var4] = ((ik) this).field_t[param0] & 65535;
            break L1;
          }
        }
        L3: {
          if (var9 < 50) {
            L4: {
              var11 = field_J[var6];
              var12 = field_s[var6];
              var13 = ((ik) this).field_C[param0] & 65535;
              if (var8 < 50) {
                break L4;
              } else {
                var14 = (50 - var9) * jb.field_a[var8 - var9];
                field_N[var4] = var2 + (var11 + ((field_J[var5] - var11) * var14 >> 16) << 9) / 50;
                field_p[var4] = var3 + (var12 + ((field_s[var5] - var12) * var14 >> 16) << 9) / 50;
                var4++;
                field_g[var4] = var13 + (((((ik) this).field_t[param0] & 65535) - var13) * var14 >> 16);
                break L4;
              }
            }
            if (var10 < 50) {
              break L3;
            } else {
              var14 = (50 - var9) * jb.field_a[var10 - var9];
              field_N[var4] = var2 + (var11 + ((field_J[var7] - var11) * var14 >> 16) << 9) / 50;
              field_p[var4] = var3 + (var12 + ((field_s[var7] - var12) * var14 >> 16) << 9) / 50;
              var4++;
              field_g[var4] = var13 + (((((ik) this).field_I[param0] & 65535) - var13) * var14 >> 16);
              break L3;
            }
          } else {
            field_N[var4] = field_G[var6];
            field_p[var4] = field_k[var6];
            var4++;
            field_g[var4] = ((ik) this).field_C[param0] & 65535;
            break L3;
          }
        }
        L5: {
          if (var10 < 50) {
            L6: {
              var11 = field_J[var7];
              var12 = field_s[var7];
              var13 = ((ik) this).field_I[param0] & 65535;
              if (var9 < 50) {
                break L6;
              } else {
                var14 = (50 - var10) * jb.field_a[var9 - var10];
                field_N[var4] = var2 + (var11 + ((field_J[var6] - var11) * var14 >> 16) << 9) / 50;
                field_p[var4] = var3 + (var12 + ((field_s[var6] - var12) * var14 >> 16) << 9) / 50;
                var4++;
                field_g[var4] = var13 + (((((ik) this).field_C[param0] & 65535) - var13) * var14 >> 16);
                break L6;
              }
            }
            if (var8 < 50) {
              break L5;
            } else {
              var14 = (50 - var10) * jb.field_a[var8 - var10];
              field_N[var4] = var2 + (var11 + ((field_J[var5] - var11) * var14 >> 16) << 9) / 50;
              field_p[var4] = var3 + (var12 + ((field_s[var5] - var12) * var14 >> 16) << 9) / 50;
              var4++;
              field_g[var4] = var13 + (((((ik) this).field_t[param0] & 65535) - var13) * var14 >> 16);
              break L5;
            }
          } else {
            field_N[var4] = field_G[var7];
            field_p[var4] = field_k[var7];
            var4++;
            field_g[var4] = ((ik) this).field_I[param0] & 65535;
            break L5;
          }
        }
        L7: {
          var11 = field_N[0];
          var12 = field_N[1];
          var13 = field_N[2];
          var14 = field_p[0];
          var15 = field_p[1];
          var16 = field_p[2];
          jb.field_n = false;
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
                      if (var11 > jb.field_i) {
                        break L9;
                      } else {
                        if (var12 > jb.field_i) {
                          break L9;
                        } else {
                          if (var13 <= jb.field_i) {
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
              jb.field_n = true;
              break L8;
            }
            L10: {
              if (((ik) this).field_l == null) {
                break L10;
              } else {
                if (((ik) this).field_l[param0] != -1) {
                  L11: {
                    L12: {
                      if (((ik) this).field_O == null) {
                        break L12;
                      } else {
                        if (((ik) this).field_O[param0] == -1) {
                          break L12;
                        } else {
                          var20 = ((ik) this).field_O[param0] & 255;
                          var17 = ((ik) this).field_h[var20];
                          var18 = ((ik) this).field_u[var20];
                          var19 = ((ik) this).field_U[var20];
                          break L11;
                        }
                      }
                    }
                    var17 = var5;
                    var18 = var6;
                    var19 = var7;
                    break L11;
                  }
                  if (((ik) this).field_I[param0] != -1) {
                    jb.a(var14, var15, var16, var11, var12, var13, field_g[0], field_g[1], field_g[2], field_J[var17], field_J[var18], field_J[var19], field_s[var17], field_s[var18], field_s[var19], field_i[var17], field_i[var18], field_i[var19], (int) ((ik) this).field_l[param0]);
                    break L7;
                  } else {
                    jb.a(var14, var15, var16, var11, var12, var13, ((ik) this).field_t[param0], ((ik) this).field_t[param0], ((ik) this).field_t[param0], field_J[var17], field_J[var18], field_J[var19], field_s[var17], field_s[var18], field_s[var19], field_i[var17], field_i[var18], field_i[var19], (int) ((ik) this).field_l[param0]);
                    break L7;
                  }
                } else {
                  break L10;
                }
              }
            }
            if (((ik) this).field_I[param0] != -1) {
              jb.a(var14, var15, var16, var11, var12, var13, field_g[0], field_g[1], field_g[2]);
              break L7;
            } else {
              jb.a(var14, var15, var16, var11, var12, var13, jb.field_p[((ik) this).field_t[param0] & 65535]);
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
                    if (var11 > jb.field_i) {
                      break L14;
                    } else {
                      if (var12 > jb.field_i) {
                        break L14;
                      } else {
                        if (var13 > jb.field_i) {
                          break L14;
                        } else {
                          if (field_N[3] < 0) {
                            break L14;
                          } else {
                            if (field_N[3] <= jb.field_i) {
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
            jb.field_n = true;
            break L13;
          }
          L15: {
            L16: {
              if (((ik) this).field_l == null) {
                break L16;
              } else {
                if (((ik) this).field_l[param0] != -1) {
                  L17: {
                    L18: {
                      if (((ik) this).field_O == null) {
                        break L18;
                      } else {
                        if (((ik) this).field_O[param0] == -1) {
                          break L18;
                        } else {
                          var20 = ((ik) this).field_O[param0] & 255;
                          var17 = ((ik) this).field_h[var20];
                          var18 = ((ik) this).field_u[var20];
                          var19 = ((ik) this).field_U[var20];
                          break L17;
                        }
                      }
                    }
                    var17 = var5;
                    var18 = var6;
                    var19 = var7;
                    break L17;
                  }
                  var20 = ((ik) this).field_l[param0];
                  if (((ik) this).field_I[param0] != -1) {
                    jb.a(var14, var15, var16, var11, var12, var13, field_g[0], field_g[1], field_g[2], field_J[var17], field_J[var18], field_J[var19], field_s[var17], field_s[var18], field_s[var19], field_i[var17], field_i[var18], field_i[var19], var20);
                    jb.a(var14, var16, field_p[3], var11, var13, field_N[3], field_g[0], field_g[2], field_g[3], field_J[var17], field_J[var18], field_J[var19], field_s[var17], field_s[var18], field_s[var19], field_i[var17], field_i[var18], field_i[var19], var20);
                    break L15;
                  } else {
                    jb.a(var14, var15, var16, var11, var12, var13, ((ik) this).field_t[param0], ((ik) this).field_t[param0], ((ik) this).field_t[param0], field_J[var17], field_J[var18], field_J[var19], field_s[var17], field_s[var18], field_s[var19], field_i[var17], field_i[var18], field_i[var19], var20);
                    jb.a(var14, var16, field_p[3], var11, var13, field_N[3], ((ik) this).field_t[param0], ((ik) this).field_t[param0], ((ik) this).field_t[param0], field_J[var17], field_J[var18], field_J[var19], field_s[var17], field_s[var18], field_s[var19], field_i[var17], field_i[var18], field_i[var19], var20);
                    break L15;
                  }
                } else {
                  break L16;
                }
              }
            }
            if (((ik) this).field_I[param0] != -1) {
              jb.a(var14, var15, var16, var11, var12, var13, field_g[0], field_g[1], field_g[2]);
              jb.a(var14, var16, field_p[3], var11, var13, field_N[3], field_g[0], field_g[2], field_g[3]);
              break L15;
            } else {
              var17 = jb.field_p[((ik) this).field_t[param0] & 65535];
              jb.a(var14, var15, var16, var11, var12, var13, var17);
              jb.a(var14, var16, field_p[3], var11, var13, field_N[3], var17);
              break L15;
            }
          }
          return;
        }
    }

    public static void a() {
        field_M = null;
        field_D = null;
        field_G = null;
        field_k = null;
        field_z = null;
        field_J = null;
        field_s = null;
        field_i = null;
        field_n = null;
        field_e = (int[][]) null;
        field_T = null;
        field_L = (int[][]) null;
        field_S = null;
        field_c = null;
        field_x = null;
        field_H = (int[][]) null;
        field_K = null;
        field_P = null;
        field_m = null;
        field_N = null;
        field_p = null;
        field_g = null;
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
        int stackIn_76_0 = 0;
        int stackOut_75_0 = 0;
        int stackOut_74_0 = 0;
        if (param4 < 1600) {
          L0: {
            var7 = 0;
            if (field_y) {
              break L0;
            } else {
              var8 = 0;
              L1: while (true) {
                if (var8 >= 1600) {
                  var8 = 0;
                  L2: while (true) {
                    if (var8 >= 32) {
                      field_f = 0;
                      break L0;
                    } else {
                      field_T[var8] = 0;
                      var8++;
                      continue L2;
                    }
                  }
                } else {
                  field_n[var8] = 0;
                  var8++;
                  continue L1;
                }
              }
            }
          }
          var8 = 0;
          L3: while (true) {
            if (var8 >= ((ik) this).field_b) {
              L4: {
                if (!field_y) {
                  if (((ik) this).field_Q != null) {
                    var8 = 0;
                    L5: while (true) {
                      if (var8 >= 12) {
                        var8 = param4 - 1;
                        L6: while (true) {
                          if (var8 < 0) {
                            break L4;
                          } else {
                            L7: {
                              var9 = field_n[var8];
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
                                var47 = field_e[var8];
                                var12 = 0;
                                L9: while (true) {
                                  if (var12 >= var10) {
                                    break L7;
                                  } else {
                                    var13 = var47[var12];
                                    var14_int = ((ik) this).field_Q[var13];
                                    field_x[var14_int] = field_x[var14_int] + 1;
                                    var15_int = field_x[var14_int];
                                    field_H[var14_int][var15_int] = var13;
                                    if (var14_int >= 10) {
                                      if (var14_int != 10) {
                                        field_P[var15_int] = var8;
                                        var12++;
                                        continue L9;
                                      } else {
                                        field_K[var15_int] = var8;
                                        var12++;
                                        continue L9;
                                      }
                                    } else {
                                      field_m[var14_int] = field_m[var14_int] + var8;
                                      var12++;
                                      continue L9;
                                    }
                                  }
                                }
                              }
                            }
                            if (var9 > 64) {
                              var10 = field_n[var8] - 64 - 1;
                              var48 = field_L[var10];
                              var12 = 0;
                              L10: while (true) {
                                if (var12 < field_T[var10]) {
                                  var13 = var48[var12];
                                  var14_int = ((ik) this).field_Q[var13];
                                  field_x[var14_int] = field_x[var14_int] + 1;
                                  var15_int = field_x[var14_int];
                                  field_H[var14_int][var15_int] = var13;
                                  if (var14_int >= 10) {
                                    if (var14_int != 10) {
                                      field_P[var15_int] = var8;
                                      var12++;
                                      continue L10;
                                    } else {
                                      field_K[var15_int] = var8;
                                      var12++;
                                      continue L10;
                                    }
                                  } else {
                                    field_m[var14_int] = field_m[var14_int] + var8;
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
                        field_x[var8] = 0;
                        field_m[var8] = 0;
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
                          var9 = field_n[var8];
                          if (var9 <= 0) {
                            break L12;
                          } else {
                            L13: {
                              if (var9 <= 64) {
                                stackOut_75_0 = var9;
                                stackIn_76_0 = stackOut_75_0;
                                break L13;
                              } else {
                                stackOut_74_0 = 64;
                                stackIn_76_0 = stackOut_74_0;
                                break L13;
                              }
                            }
                            var10 = stackIn_76_0;
                            var45 = field_e[var8];
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
                          var10 = field_n[var8] - 64 - 1;
                          var46 = field_L[var10];
                          var12 = 0;
                          L15: while (true) {
                            if (var12 < field_T[var10]) {
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
                  nb.a((byte) -64, field_c, 0, field_S, var7 - 1);
                  if (((ik) this).field_Q != null) {
                    var8 = 0;
                    L16: while (true) {
                      if (var8 >= 12) {
                        var8 = 0;
                        L17: while (true) {
                          if (var8 >= var7) {
                            break L4;
                          } else {
                            var9 = field_c[var8];
                            var10 = field_S[var8];
                            var11 = ((ik) this).field_Q[var9];
                            field_x[var11] = field_x[var11] + 1;
                            var12 = field_x[var11];
                            field_H[var11][var12] = var9;
                            if (var11 >= 10) {
                              if (var11 != 10) {
                                field_P[var12] = var10;
                                var8++;
                                continue L17;
                              } else {
                                field_K[var12] = var10;
                                var8++;
                                continue L17;
                              }
                            } else {
                              field_m[var11] = field_m[var11] + var10;
                              var8++;
                              continue L17;
                            }
                          }
                        }
                      } else {
                        field_x[var8] = 0;
                        field_m[var8] = 0;
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
                        this.b(field_c[var8]);
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
                  if (field_x[1] > 0) {
                    break L20;
                  } else {
                    if (field_x[2] <= 0) {
                      break L19;
                    } else {
                      break L20;
                    }
                  }
                }
                var8 = (field_m[1] + field_m[2]) / (field_x[1] + field_x[2]);
                break L19;
              }
              L21: {
                L22: {
                  var9 = 0;
                  if (field_x[3] > 0) {
                    break L22;
                  } else {
                    if (field_x[4] <= 0) {
                      break L21;
                    } else {
                      break L22;
                    }
                  }
                }
                var9 = (field_m[3] + field_m[4]) / (field_x[3] + field_x[4]);
                break L21;
              }
              L23: {
                L24: {
                  var10 = 0;
                  if (field_x[6] > 0) {
                    break L24;
                  } else {
                    if (field_x[8] <= 0) {
                      break L23;
                    } else {
                      break L24;
                    }
                  }
                }
                var10 = (field_m[6] + field_m[8]) / (field_x[6] + field_x[8]);
                break L23;
              }
              L25: {
                var12 = 0;
                var13 = field_x[10];
                var14 = field_H[10];
                var15 = field_K;
                if (var12 != var13) {
                  break L25;
                } else {
                  var12 = 0;
                  var13 = field_x[11];
                  var14 = field_H[11];
                  var15 = field_P;
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
                        var12++;
                        this.b(var14[var12]);
                        if (var12 != var13) {
                          break L29;
                        } else {
                          if (var14 == field_H[11]) {
                            break L29;
                          } else {
                            var12 = 0;
                            var14 = field_H[11];
                            var13 = field_x[11];
                            var15 = field_P;
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
                            var12++;
                            this.b(var14[var12]);
                            if (var12 != var13) {
                              break L32;
                            } else {
                              if (var14 == field_H[11]) {
                                break L32;
                              } else {
                                var12 = 0;
                                var13 = field_x[11];
                                var14 = field_H[11];
                                var15 = field_P;
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
                              var12++;
                              this.b(var14[var12]);
                              if (var12 != var13) {
                                break L35;
                              } else {
                                if (var14 == field_H[11]) {
                                  break L35;
                                } else {
                                  var12 = 0;
                                  var13 = field_x[11];
                                  var14 = field_H[11];
                                  var15 = field_P;
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
                                var12++;
                                this.b(var14[var12]);
                                if (var12 != var13) {
                                  break L38;
                                } else {
                                  if (var14 == field_H[11]) {
                                    break L38;
                                  } else {
                                    var12 = 0;
                                    var13 = field_x[11];
                                    var14 = field_H[11];
                                    var15 = field_P;
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
                        var17 = field_x[var16];
                        var49 = field_H[var16];
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
              if (((ik) this).field_I[var8] != -2) {
                L40: {
                  var9 = ((ik) this).field_j[var8];
                  var10 = ((ik) this).field_R[var8];
                  var11 = ((ik) this).field_d[var8];
                  var12 = field_G[var9];
                  var13 = field_G[var10];
                  var14_int = field_G[var11];
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
                    var15_int = field_J[var9];
                    var16 = field_J[var10];
                    var17 = field_J[var11];
                    var18 = field_s[var9];
                    var19 = field_s[var10];
                    var20 = field_s[var11];
                    var21 = field_i[var9];
                    var22 = field_i[var10];
                    var23 = field_i[var11];
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
                      field_D[var8] = true;
                      if (!field_y) {
                        var27 = (field_z[var9] + field_z[var10] + field_z[var11]) / 3 + param3;
                        if (field_n[var27] >= 64) {
                          L42: {
                            var28 = field_n[var27];
                            if (var28 != 64) {
                              break L42;
                            } else {
                              if (field_f != 512) {
                                field_f = field_f + 1;
                                var28 = 65 + field_f;
                                field_n[var27] = 65 + field_f;
                                break L42;
                              } else {
                                var8++;
                                continue L3;
                              }
                            }
                          }
                          var28 -= 65;
                          field_T[var28] = field_T[var28] + 1;
                          field_L[var28][field_T[var28]] = var8;
                          var8++;
                          continue L3;
                        } else {
                          field_n[var27] = field_n[var27] + 1;
                          field_e[var27][field_n[var27]] = var8;
                          var8++;
                          continue L3;
                        }
                      } else {
                        field_S[var7] = (field_z[var9] + field_z[var10] + field_z[var11]) / 3;
                        var7++;
                        field_c[var7] = var8;
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
                    if (!this.a(ll.field_d + jb.field_m, cc.field_a + jb.field_g, field_k[var9], field_k[var10], field_k[var11], var12, var13, var14_int)) {
                      break L43;
                    } else {
                      ra.field_c = ra.field_c + 1;
                      se.field_J[ra.field_c] = param2;
                      param1 = false;
                      break L43;
                    }
                  }
                }
                if ((var12 - var13) * (field_k[var11] - field_k[var10]) - (field_k[var9] - field_k[var10]) * (var14_int - var13) > 0) {
                  L44: {
                    L45: {
                      field_D[var8] = false;
                      if (var12 < 0) {
                        break L45;
                      } else {
                        if (var13 < 0) {
                          break L45;
                        } else {
                          if (var14_int < 0) {
                            break L45;
                          } else {
                            if (var12 > jb.field_i) {
                              break L45;
                            } else {
                              if (var13 > jb.field_i) {
                                break L45;
                              } else {
                                if (var14_int <= jb.field_i) {
                                  field_M[var8] = false;
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
                    field_M[var8] = true;
                    break L44;
                  }
                  if (!field_y) {
                    var15_int = (field_z[var9] + field_z[var10] + field_z[var11]) / 3 + param3;
                    if (field_n[var15_int] >= 64) {
                      L46: {
                        var16 = field_n[var15_int];
                        if (var16 != 64) {
                          break L46;
                        } else {
                          if (field_f != 512) {
                            field_f = field_f + 1;
                            var16 = 65 + field_f;
                            field_n[var15_int] = 65 + field_f;
                            break L46;
                          } else {
                            var8++;
                            continue L3;
                          }
                        }
                      }
                      var16 -= 65;
                      field_T[var16] = field_T[var16] + 1;
                      field_L[var16][field_T[var16]] = var8;
                      var8++;
                      continue L3;
                    } else {
                      field_n[var15_int] = field_n[var15_int] + 1;
                      field_e[var15_int][field_n[var15_int]] = var8;
                      var8++;
                      continue L3;
                    }
                  } else {
                    field_S[var7] = (field_z[var9] + field_z[var10] + field_z[var11]) / 3;
                    var7++;
                    field_c[var7] = var8;
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
          if (var9 >= ((ik) this).field_V) {
            ((ik) this).field_v = (short)(int)(Math.sqrt((double)var8) + 0.99);
            ((ik) this).field_o = true;
            return;
          } else {
            L1: {
              var10 = ((ik) this).field_B[var9];
              var11 = ((ik) this).field_F[var9];
              var12 = ((ik) this).field_q[var9];
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

    private ik() {
        ((ik) this).field_o = false;
        ((ik) this).field_V = 0;
        ((ik) this).field_b = 0;
        ((ik) this).field_E = 0;
        ((ik) this).field_r = 0;
    }

    ik(bb param0, int param1, int param2, int param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var9_ref_int__ = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        dj var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        e var18 = null;
        e var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        L0: {
          ((ik) this).field_o = false;
          ((ik) this).field_V = 0;
          ((ik) this).field_b = 0;
          ((ik) this).field_E = 0;
          ((ik) this).field_r = 0;
          param0.b();
          param0.a();
          ((ik) this).field_r = ((bb) param0).field_r;
          ((ik) this).field_V = ((bb) param0).field_b;
          ((ik) this).field_B = ((bb) param0).field_w;
          ((ik) this).field_F = ((bb) param0).field_e;
          ((ik) this).field_q = ((bb) param0).field_u;
          ((ik) this).field_b = ((bb) param0).field_y;
          ((ik) this).field_j = ((bb) param0).field_h;
          ((ik) this).field_R = ((bb) param0).field_v;
          ((ik) this).field_d = ((bb) param0).field_q;
          ((ik) this).field_Q = ((bb) param0).field_p;
          ((ik) this).field_w = ((bb) param0).field_k;
          var7 = (int)Math.sqrt((double)(param3 * param3 + param4 * param4 + param5 * param5));
          var8 = param2 * var7 >> 8;
          ((ik) this).field_t = new int[((ik) this).field_b];
          ((ik) this).field_C = new int[((ik) this).field_b];
          ((ik) this).field_I = new int[((ik) this).field_b];
          if (((bb) param0).field_i == null) {
            ((ik) this).field_l = null;
            break L0;
          } else {
            ((ik) this).field_l = new short[((ik) this).field_b];
            var9 = 0;
            L1: while (true) {
              if (var9 >= ((ik) this).field_b) {
                break L0;
              } else {
                L2: {
                  var10 = ((bb) param0).field_i[var9];
                  if (var10 == -1) {
                    break L2;
                  } else {
                    if (!jb.field_b.a(var10, 3)) {
                      break L2;
                    } else {
                      ((ik) this).field_l[var9] = (short)var10;
                      var9++;
                      continue L1;
                    }
                  }
                }
                ((ik) this).field_l[var9] = (short)-1;
                var9++;
                continue L1;
              }
            }
          }
        }
        L3: {
          if (((bb) param0).field_f <= 0) {
            break L3;
          } else {
            if (((bb) param0).field_c == null) {
              break L3;
            } else {
              var22 = new int[((bb) param0).field_f];
              var21 = var22;
              var20 = var21;
              var17 = var20;
              var9_ref_int__ = var17;
              var10 = 0;
              L4: while (true) {
                if (var10 >= ((ik) this).field_b) {
                  ((ik) this).field_E = 0;
                  var10 = 0;
                  L5: while (true) {
                    if (var10 >= ((bb) param0).field_f) {
                      ((ik) this).field_h = new int[((ik) this).field_E];
                      ((ik) this).field_u = new int[((ik) this).field_E];
                      ((ik) this).field_U = new int[((ik) this).field_E];
                      var10 = 0;
                      var11 = 0;
                      L6: while (true) {
                        if (var11 >= ((bb) param0).field_f) {
                          ((ik) this).field_O = new byte[((ik) this).field_b];
                          var11 = 0;
                          L7: while (true) {
                            if (var11 >= ((ik) this).field_b) {
                              break L3;
                            } else {
                              if (((bb) param0).field_c[var11] == -1) {
                                ((ik) this).field_O[var11] = (byte)-1;
                                var11++;
                                continue L7;
                              } else {
                                ((ik) this).field_O[var11] = (byte)var9_ref_int__[((bb) param0).field_c[var11] & 255];
                                if (((ik) this).field_O[var11] == -1) {
                                  if (((ik) this).field_l != null) {
                                    ((ik) this).field_l[var11] = (short)-1;
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
                              if (((bb) param0).field_x[var11] != 0) {
                                break L8;
                              } else {
                                ((ik) this).field_h[var10] = ((bb) param0).field_d[var11] & 65535;
                                ((ik) this).field_u[var10] = ((bb) param0).field_B[var11] & 65535;
                                ((ik) this).field_U[var10] = ((bb) param0).field_z[var11] & 65535;
                                var10++;
                                var9_ref_int__[var11] = var10;
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
                        if (((bb) param0).field_x[var10] == 0) {
                          ((ik) this).field_E = ((ik) this).field_E + 1;
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
                  if (((bb) param0).field_c[var10] != -1) {
                    var9_ref_int__[((bb) param0).field_c[var10] & 255] = var9_ref_int__[((bb) param0).field_c[var10] & 255] + 1;
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
          if (var16 >= ((ik) this).field_b) {
          } else {
            L10: {
              if (((bb) param0).field_o != null) {
                var10 = ((bb) param0).field_o[var16];
                break L10;
              } else {
                var10 = 0;
                break L10;
              }
            }
            L11: {
              if (((bb) param0).field_k != null) {
                var11 = ((bb) param0).field_k[var16];
                break L11;
              } else {
                var11 = 0;
                break L11;
              }
            }
            L12: {
              if (((ik) this).field_l != null) {
                var12 = ((ik) this).field_l[var16];
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
                  ((ik) this).field_I[var16] = -2;
                  var16++;
                  continue L9;
                } else {
                  var19 = ((bb) param0).field_n[var16];
                  var14 = param1 + (param3 * ((e) var19).field_g + param4 * ((e) var19).field_h + param5 * ((e) var19).field_d) / (var8 + var8 / 2);
                  ((ik) this).field_t[var16] = ik.d(var14);
                  ((ik) this).field_I[var16] = -1;
                  var16++;
                  continue L9;
                }
              } else {
                L15: {
                  L16: {
                    if (((bb) param0).field_t == null) {
                      break L16;
                    } else {
                      if (((bb) param0).field_t[((ik) this).field_j[var16]] == null) {
                        break L16;
                      } else {
                        var13 = ((bb) param0).field_t[((ik) this).field_j[var16]];
                        break L15;
                      }
                    }
                  }
                  var13 = ((bb) param0).field_j[((ik) this).field_j[var16]];
                  break L15;
                }
                L17: {
                  L18: {
                    var14 = param1 + (param3 * ((dj) var13).field_g + param4 * ((dj) var13).field_b + param5 * ((dj) var13).field_c) / (var8 * ((dj) var13).field_d);
                    ((ik) this).field_t[var16] = ik.d(var14);
                    if (((bb) param0).field_t == null) {
                      break L18;
                    } else {
                      if (((bb) param0).field_t[((ik) this).field_R[var16]] == null) {
                        break L18;
                      } else {
                        var13 = ((bb) param0).field_t[((ik) this).field_R[var16]];
                        break L17;
                      }
                    }
                  }
                  var13 = ((bb) param0).field_j[((ik) this).field_R[var16]];
                  break L17;
                }
                L19: {
                  L20: {
                    var14 = param1 + (param3 * ((dj) var13).field_g + param4 * ((dj) var13).field_b + param5 * ((dj) var13).field_c) / (var8 * ((dj) var13).field_d);
                    ((ik) this).field_C[var16] = ik.d(var14);
                    if (((bb) param0).field_t == null) {
                      break L20;
                    } else {
                      if (((bb) param0).field_t[((ik) this).field_d[var16]] == null) {
                        break L20;
                      } else {
                        var13 = ((bb) param0).field_t[((ik) this).field_d[var16]];
                        break L19;
                      }
                    }
                  }
                  var13 = ((bb) param0).field_j[((ik) this).field_d[var16]];
                  break L19;
                }
                var14 = param1 + (param3 * ((dj) var13).field_g + param4 * ((dj) var13).field_b + param5 * ((dj) var13).field_c) / (var8 * ((dj) var13).field_d);
                ((ik) this).field_I[var16] = ik.d(var14);
                var16++;
                continue L9;
              }
            } else {
              if (var10 != 0) {
                if (var10 != 1) {
                  if (var10 != 3) {
                    ((ik) this).field_I[var16] = -2;
                    var16++;
                    continue L9;
                  } else {
                    ((ik) this).field_t[var16] = 128;
                    ((ik) this).field_I[var16] = -1;
                    var16++;
                    continue L9;
                  }
                } else {
                  var18 = ((bb) param0).field_n[var16];
                  var14 = param1 + (param3 * ((e) var18).field_g + param4 * ((e) var18).field_h + param5 * ((e) var18).field_d) / (var8 + var8 / 2) << 17;
                  ((ik) this).field_t[var16] = var14 | ik.a(((bb) param0).field_l[var16] & 65535, var14 >> 17);
                  ((ik) this).field_I[var16] = -1;
                  var16++;
                  continue L9;
                }
              } else {
                L21: {
                  L22: {
                    var15 = ((bb) param0).field_l[var16] & 65535;
                    if (((bb) param0).field_t == null) {
                      break L22;
                    } else {
                      if (((bb) param0).field_t[((ik) this).field_j[var16]] == null) {
                        break L22;
                      } else {
                        var13 = ((bb) param0).field_t[((ik) this).field_j[var16]];
                        break L21;
                      }
                    }
                  }
                  var13 = ((bb) param0).field_j[((ik) this).field_j[var16]];
                  break L21;
                }
                L23: {
                  L24: {
                    var14 = param1 + (param3 * ((dj) var13).field_g + param4 * ((dj) var13).field_b + param5 * ((dj) var13).field_c) / (var8 * ((dj) var13).field_d) << 17;
                    ((ik) this).field_t[var16] = var14 | ik.a(var15, var14 >> 17);
                    if (((bb) param0).field_t == null) {
                      break L24;
                    } else {
                      if (((bb) param0).field_t[((ik) this).field_R[var16]] == null) {
                        break L24;
                      } else {
                        var13 = ((bb) param0).field_t[((ik) this).field_R[var16]];
                        break L23;
                      }
                    }
                  }
                  var13 = ((bb) param0).field_j[((ik) this).field_R[var16]];
                  break L23;
                }
                L25: {
                  L26: {
                    var14 = param1 + (param3 * ((dj) var13).field_g + param4 * ((dj) var13).field_b + param5 * ((dj) var13).field_c) / (var8 * ((dj) var13).field_d) << 17;
                    ((ik) this).field_C[var16] = var14 | ik.a(var15, var14 >> 17);
                    if (((bb) param0).field_t == null) {
                      break L26;
                    } else {
                      if (((bb) param0).field_t[((ik) this).field_d[var16]] == null) {
                        break L26;
                      } else {
                        var13 = ((bb) param0).field_t[((ik) this).field_d[var16]];
                        break L25;
                      }
                    }
                  }
                  var13 = ((bb) param0).field_j[((ik) this).field_d[var16]];
                  break L25;
                }
                var14 = param1 + (param3 * ((dj) var13).field_g + param4 * ((dj) var13).field_b + param5 * ((dj) var13).field_c) / (var8 * ((dj) var13).field_d) << 17;
                ((ik) this).field_I[var16] = var14 | ik.a(var15, var14 >> 17);
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
        ik discarded$0 = new ik();
        ik discarded$1 = new ik();
        ik discarded$2 = new ik();
        field_m = new int[12];
        field_g = new int[10];
        field_p = new int[10];
        field_k = new int[4096];
        field_K = new int[4096];
        field_x = new int[12];
        field_D = new boolean[4096];
        field_P = new int[4096];
        field_z = new int[4096];
        field_i = new int[4096];
        field_J = new int[4096];
        field_H = new int[12][4096];
        field_s = new int[4096];
        field_N = new int[10];
        field_y = false;
        field_G = new int[4096];
        field_f = 0;
        field_M = new boolean[4096];
        if (field_y) {
            field_S = new int[4096];
            field_c = new int[4096];
        } else {
            field_n = new int[1600];
            field_e = new int[1600][64];
            field_T = new int[32];
            field_L = new int[32][512];
        }
    }
}
