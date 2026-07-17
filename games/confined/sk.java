/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sk extends wj {
    private int field_E;
    private byte[] field_Q;
    private byte[] field_db;
    private int field_S;
    private int field_r;
    private int[] field_B;
    private int[] field_q;
    private int[] field_C;
    private short field_O;
    private int[] field_t;
    private boolean field_s;
    private int[] field_y;
    private int[] field_x;
    private int[] field_R;
    private static boolean[] field_L;
    private static int[] field_o;
    private static int field_fb;
    private static int[] field_n;
    static int field_j;
    private static int[] field_v;
    private static int[][] field_w;
    private static int[] field_eb;
    private static int[] field_k;
    private static int[] field_U;
    private int[] field_Y;
    private static int[] field_cb;
    static int field_G;
    private int[] field_W;
    private static int[] field_Z;
    private short[] field_F;
    static int field_h;
    private static int[] field_H;
    private static int[] field_g;
    private static int[] field_I;
    private static int[] field_K;
    private static int[] field_N;
    private static int[] field_T;
    private static int field_bb;
    private int[] field_M;
    private byte[] field_p;
    private static int[][] field_A;
    private int[] field_i;
    private int field_m;
    private int[] field_l;
    private static boolean field_X;
    private static int[] field_J;
    private static int[][] field_P;
    static int field_u;
    private static int[] field_ab;
    private static int[] field_V;
    private static boolean[] field_z;

    private final void b(int param0, int param1) {
        if (param0 < field_u) {
            field_u = param0;
        }
        if (param0 > field_h) {
            field_h = param0;
        }
        if (param1 < field_j) {
            field_j = param1;
        }
        if (param1 > field_G) {
            field_G = param1;
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

    private final void e(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (!field_L[param0]) {
          L0: {
            var2 = ((sk) this).field_t[param0];
            var3 = ((sk) this).field_M[param0];
            var4 = ((sk) this).field_y[param0];
            ti.field_c = field_z[param0];
            if (((sk) this).field_p != null) {
              ti.field_h = ((sk) this).field_p[param0] & 255;
              break L0;
            } else {
              ti.field_h = 0;
              break L0;
            }
          }
          L1: {
            L2: {
              if (((sk) this).field_F == null) {
                break L2;
              } else {
                if (((sk) this).field_F[param0] != -1) {
                  L3: {
                    L4: {
                      if (((sk) this).field_db == null) {
                        break L4;
                      } else {
                        if (((sk) this).field_db[param0] == -1) {
                          break L4;
                        } else {
                          var8 = ((sk) this).field_db[param0] & 255;
                          var5 = ((sk) this).field_Y[var8];
                          var6 = ((sk) this).field_R[var8];
                          var7 = ((sk) this).field_x[var8];
                          break L3;
                        }
                      }
                    }
                    var5 = var2;
                    var6 = var3;
                    var7 = var4;
                    break L3;
                  }
                  if (((sk) this).field_l[param0] != -1) {
                    ti.a(field_J[var2], field_J[var3], field_J[var4], field_eb[var2], field_eb[var3], field_eb[var4], ((sk) this).field_i[param0], ((sk) this).field_q[param0], ((sk) this).field_l[param0], field_H[var5], field_H[var6], field_H[var7], field_V[var5], field_V[var6], field_V[var7], field_N[var5], field_N[var6], field_N[var7], (int) ((sk) this).field_F[param0]);
                    break L1;
                  } else {
                    ti.a(field_J[var2], field_J[var3], field_J[var4], field_eb[var2], field_eb[var3], field_eb[var4], ((sk) this).field_i[param0], ((sk) this).field_i[param0], ((sk) this).field_i[param0], field_H[var5], field_H[var6], field_H[var7], field_V[var5], field_V[var6], field_V[var7], field_N[var5], field_N[var6], field_N[var7], (int) ((sk) this).field_F[param0]);
                    break L1;
                  }
                } else {
                  break L2;
                }
              }
            }
            if (((sk) this).field_l[param0] != -1) {
              ti.a(field_J[var2], field_J[var3], field_J[var4], field_eb[var2], field_eb[var3], field_eb[var4], ((sk) this).field_i[param0] & 65535, ((sk) this).field_q[param0] & 65535, ((sk) this).field_l[param0] & 65535);
              break L1;
            } else {
              ti.a(field_J[var2], field_J[var3], field_J[var4], field_eb[var2], field_eb[var3], field_eb[var4], ti.field_o[((sk) this).field_i[param0] & 65535]);
              break L1;
            }
          }
          return;
        } else {
          this.c(param0);
          return;
        }
    }

    final void a() {
        Exception var1 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            this.d();
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
          if (var9 >= ((sk) this).field_m) {
            ((sk) this).field_O = (short)(int)(Math.sqrt((double)var8) + 0.99);
            ((sk) this).field_s = true;
            return;
          } else {
            L1: {
              var10 = ((sk) this).field_W[var9];
              var11 = ((sk) this).field_C[var9];
              var12 = ((sk) this).field_B[var9];
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
          var2 = ti.field_k;
          var3 = ti.field_f;
          var4 = 0;
          var5 = ((sk) this).field_t[param0];
          var6 = ((sk) this).field_M[param0];
          var7 = ((sk) this).field_y[param0];
          var8 = field_N[var5];
          var9 = field_N[var6];
          var10 = field_N[var7];
          if (((sk) this).field_p != null) {
            ti.field_h = ((sk) this).field_p[param0] & 255;
            break L0;
          } else {
            ti.field_h = 0;
            break L0;
          }
        }
        L1: {
          if (var8 < 50) {
            L2: {
              var11 = field_H[var5];
              var12 = field_V[var5];
              var13 = ((sk) this).field_i[param0] & 65535;
              if (var10 < 50) {
                break L2;
              } else {
                var14 = (50 - var8) * ti.field_i[var10 - var8];
                field_k[var4] = var2 + (var11 + ((field_H[var7] - var11) * var14 >> 16) << 9) / 50;
                field_ab[var4] = var3 + (var12 + ((field_V[var7] - var12) * var14 >> 16) << 9) / 50;
                int incrementValue$9 = var4;
                var4++;
                field_o[incrementValue$9] = var13 + (((((sk) this).field_l[param0] & 65535) - var13) * var14 >> 16);
                break L2;
              }
            }
            if (var9 < 50) {
              break L1;
            } else {
              var14 = (50 - var8) * ti.field_i[var9 - var8];
              field_k[var4] = var2 + (var11 + ((field_H[var6] - var11) * var14 >> 16) << 9) / 50;
              field_ab[var4] = var3 + (var12 + ((field_V[var6] - var12) * var14 >> 16) << 9) / 50;
              int incrementValue$10 = var4;
              var4++;
              field_o[incrementValue$10] = var13 + (((((sk) this).field_q[param0] & 65535) - var13) * var14 >> 16);
              break L1;
            }
          } else {
            field_k[var4] = field_eb[var5];
            field_ab[var4] = field_J[var5];
            int incrementValue$11 = var4;
            var4++;
            field_o[incrementValue$11] = ((sk) this).field_i[param0] & 65535;
            break L1;
          }
        }
        L3: {
          if (var9 < 50) {
            L4: {
              var11 = field_H[var6];
              var12 = field_V[var6];
              var13 = ((sk) this).field_q[param0] & 65535;
              if (var8 < 50) {
                break L4;
              } else {
                var14 = (50 - var9) * ti.field_i[var8 - var9];
                field_k[var4] = var2 + (var11 + ((field_H[var5] - var11) * var14 >> 16) << 9) / 50;
                field_ab[var4] = var3 + (var12 + ((field_V[var5] - var12) * var14 >> 16) << 9) / 50;
                int incrementValue$12 = var4;
                var4++;
                field_o[incrementValue$12] = var13 + (((((sk) this).field_i[param0] & 65535) - var13) * var14 >> 16);
                break L4;
              }
            }
            if (var10 < 50) {
              break L3;
            } else {
              var14 = (50 - var9) * ti.field_i[var10 - var9];
              field_k[var4] = var2 + (var11 + ((field_H[var7] - var11) * var14 >> 16) << 9) / 50;
              field_ab[var4] = var3 + (var12 + ((field_V[var7] - var12) * var14 >> 16) << 9) / 50;
              int incrementValue$13 = var4;
              var4++;
              field_o[incrementValue$13] = var13 + (((((sk) this).field_l[param0] & 65535) - var13) * var14 >> 16);
              break L3;
            }
          } else {
            field_k[var4] = field_eb[var6];
            field_ab[var4] = field_J[var6];
            int incrementValue$14 = var4;
            var4++;
            field_o[incrementValue$14] = ((sk) this).field_q[param0] & 65535;
            break L3;
          }
        }
        L5: {
          if (var10 < 50) {
            L6: {
              var11 = field_H[var7];
              var12 = field_V[var7];
              var13 = ((sk) this).field_l[param0] & 65535;
              if (var9 < 50) {
                break L6;
              } else {
                var14 = (50 - var10) * ti.field_i[var9 - var10];
                field_k[var4] = var2 + (var11 + ((field_H[var6] - var11) * var14 >> 16) << 9) / 50;
                field_ab[var4] = var3 + (var12 + ((field_V[var6] - var12) * var14 >> 16) << 9) / 50;
                int incrementValue$15 = var4;
                var4++;
                field_o[incrementValue$15] = var13 + (((((sk) this).field_q[param0] & 65535) - var13) * var14 >> 16);
                break L6;
              }
            }
            if (var8 < 50) {
              break L5;
            } else {
              var14 = (50 - var10) * ti.field_i[var8 - var10];
              field_k[var4] = var2 + (var11 + ((field_H[var5] - var11) * var14 >> 16) << 9) / 50;
              field_ab[var4] = var3 + (var12 + ((field_V[var5] - var12) * var14 >> 16) << 9) / 50;
              int incrementValue$16 = var4;
              var4++;
              field_o[incrementValue$16] = var13 + (((((sk) this).field_i[param0] & 65535) - var13) * var14 >> 16);
              break L5;
            }
          } else {
            field_k[var4] = field_eb[var7];
            field_ab[var4] = field_J[var7];
            int incrementValue$17 = var4;
            var4++;
            field_o[incrementValue$17] = ((sk) this).field_l[param0] & 65535;
            break L5;
          }
        }
        L7: {
          var11 = field_k[0];
          var12 = field_k[1];
          var13 = field_k[2];
          var14 = field_ab[0];
          var15 = field_ab[1];
          var16 = field_ab[2];
          ti.field_c = false;
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
                      if (var11 > ti.field_e) {
                        break L9;
                      } else {
                        if (var12 > ti.field_e) {
                          break L9;
                        } else {
                          if (var13 <= ti.field_e) {
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
              ti.field_c = true;
              break L8;
            }
            L10: {
              if (((sk) this).field_F == null) {
                break L10;
              } else {
                if (((sk) this).field_F[param0] != -1) {
                  L11: {
                    L12: {
                      if (((sk) this).field_db == null) {
                        break L12;
                      } else {
                        if (((sk) this).field_db[param0] == -1) {
                          break L12;
                        } else {
                          var20 = ((sk) this).field_db[param0] & 255;
                          var17 = ((sk) this).field_Y[var20];
                          var18 = ((sk) this).field_R[var20];
                          var19 = ((sk) this).field_x[var20];
                          break L11;
                        }
                      }
                    }
                    var17 = var5;
                    var18 = var6;
                    var19 = var7;
                    break L11;
                  }
                  if (((sk) this).field_l[param0] != -1) {
                    ti.a(var14, var15, var16, var11, var12, var13, field_o[0], field_o[1], field_o[2], field_H[var17], field_H[var18], field_H[var19], field_V[var17], field_V[var18], field_V[var19], field_N[var17], field_N[var18], field_N[var19], (int) ((sk) this).field_F[param0]);
                    break L7;
                  } else {
                    ti.a(var14, var15, var16, var11, var12, var13, ((sk) this).field_i[param0], ((sk) this).field_i[param0], ((sk) this).field_i[param0], field_H[var17], field_H[var18], field_H[var19], field_V[var17], field_V[var18], field_V[var19], field_N[var17], field_N[var18], field_N[var19], (int) ((sk) this).field_F[param0]);
                    break L7;
                  }
                } else {
                  break L10;
                }
              }
            }
            if (((sk) this).field_l[param0] != -1) {
              ti.a(var14, var15, var16, var11, var12, var13, field_o[0], field_o[1], field_o[2]);
              break L7;
            } else {
              ti.a(var14, var15, var16, var11, var12, var13, ti.field_o[((sk) this).field_i[param0] & 65535]);
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
                    if (var11 > ti.field_e) {
                      break L14;
                    } else {
                      if (var12 > ti.field_e) {
                        break L14;
                      } else {
                        if (var13 > ti.field_e) {
                          break L14;
                        } else {
                          if (field_k[3] < 0) {
                            break L14;
                          } else {
                            if (field_k[3] <= ti.field_e) {
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
            ti.field_c = true;
            break L13;
          }
          L15: {
            L16: {
              if (((sk) this).field_F == null) {
                break L16;
              } else {
                if (((sk) this).field_F[param0] != -1) {
                  L17: {
                    L18: {
                      if (((sk) this).field_db == null) {
                        break L18;
                      } else {
                        if (((sk) this).field_db[param0] == -1) {
                          break L18;
                        } else {
                          var20 = ((sk) this).field_db[param0] & 255;
                          var17 = ((sk) this).field_Y[var20];
                          var18 = ((sk) this).field_R[var20];
                          var19 = ((sk) this).field_x[var20];
                          break L17;
                        }
                      }
                    }
                    var17 = var5;
                    var18 = var6;
                    var19 = var7;
                    break L17;
                  }
                  var20 = ((sk) this).field_F[param0];
                  if (((sk) this).field_l[param0] != -1) {
                    ti.a(var14, var15, var16, var11, var12, var13, field_o[0], field_o[1], field_o[2], field_H[var17], field_H[var18], field_H[var19], field_V[var17], field_V[var18], field_V[var19], field_N[var17], field_N[var18], field_N[var19], var20);
                    ti.a(var14, var16, field_ab[3], var11, var13, field_k[3], field_o[0], field_o[2], field_o[3], field_H[var17], field_H[var18], field_H[var19], field_V[var17], field_V[var18], field_V[var19], field_N[var17], field_N[var18], field_N[var19], var20);
                    break L15;
                  } else {
                    ti.a(var14, var15, var16, var11, var12, var13, ((sk) this).field_i[param0], ((sk) this).field_i[param0], ((sk) this).field_i[param0], field_H[var17], field_H[var18], field_H[var19], field_V[var17], field_V[var18], field_V[var19], field_N[var17], field_N[var18], field_N[var19], var20);
                    ti.a(var14, var16, field_ab[3], var11, var13, field_k[3], ((sk) this).field_i[param0], ((sk) this).field_i[param0], ((sk) this).field_i[param0], field_H[var17], field_H[var18], field_H[var19], field_V[var17], field_V[var18], field_V[var19], field_N[var17], field_N[var18], field_N[var19], var20);
                    break L15;
                  }
                } else {
                  break L16;
                }
              }
            }
            if (((sk) this).field_l[param0] != -1) {
              ti.a(var14, var15, var16, var11, var12, var13, field_o[0], field_o[1], field_o[2]);
              ti.a(var14, var16, field_ab[3], var11, var13, field_k[3], field_o[0], field_o[2], field_o[3]);
              break L15;
            } else {
              var17 = ti.field_o[((sk) this).field_i[param0] & 65535];
              ti.a(var14, var15, var16, var11, var12, var13, var17);
              ti.a(var14, var16, field_ab[3], var11, var13, field_k[3], var17);
              break L15;
            }
          }
          return;
        }
    }

    public static void c() {
        field_z = null;
        field_L = null;
        field_eb = null;
        field_J = null;
        field_g = null;
        field_H = null;
        field_V = null;
        field_N = null;
        field_cb = null;
        field_P = null;
        field_Z = null;
        field_A = null;
        field_I = null;
        field_n = null;
        field_T = null;
        field_w = null;
        field_K = null;
        field_U = null;
        field_v = null;
        field_k = null;
        field_ab = null;
        field_o = null;
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
            field_bb = param4;
            var7 = 0;
            if (field_X) {
              break L0;
            } else {
              var8 = 0;
              L1: while (true) {
                if (var8 >= 1600) {
                  var8 = 0;
                  L2: while (true) {
                    if (var8 >= 32) {
                      field_fb = 0;
                      break L0;
                    } else {
                      field_Z[var8] = 0;
                      var8++;
                      continue L2;
                    }
                  }
                } else {
                  field_cb[var8] = 0;
                  var8++;
                  continue L1;
                }
              }
            }
          }
          var8 = 0;
          L3: while (true) {
            if (var8 >= ((sk) this).field_E) {
              L4: {
                if (!field_X) {
                  if (((sk) this).field_Q != null) {
                    var8 = 0;
                    L5: while (true) {
                      if (var8 >= 12) {
                        var8 = param4 - 1;
                        L6: while (true) {
                          if (var8 < 0) {
                            break L4;
                          } else {
                            L7: {
                              var9 = field_cb[var8];
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
                                var47 = field_P[var8];
                                var12 = 0;
                                L9: while (true) {
                                  if (var12 >= var10) {
                                    break L7;
                                  } else {
                                    var13 = var47[var12];
                                    var14_int = ((sk) this).field_Q[var13];
                                    field_T[var14_int] = field_T[var14_int] + 1;
                                    var15_int = field_T[var14_int];
                                    field_w[var14_int][var15_int] = var13;
                                    if (var14_int >= 10) {
                                      if (var14_int != 10) {
                                        field_U[var15_int] = var8;
                                        var12++;
                                        continue L9;
                                      } else {
                                        field_K[var15_int] = var8;
                                        var12++;
                                        continue L9;
                                      }
                                    } else {
                                      field_v[var14_int] = field_v[var14_int] + var8;
                                      var12++;
                                      continue L9;
                                    }
                                  }
                                }
                              }
                            }
                            if (var9 > 64) {
                              var10 = field_cb[var8] - 65;
                              var48 = field_A[var10];
                              var12 = 0;
                              L10: while (true) {
                                if (var12 < field_Z[var10]) {
                                  var13 = var48[var12];
                                  var14_int = ((sk) this).field_Q[var13];
                                  field_T[var14_int] = field_T[var14_int] + 1;
                                  var15_int = field_T[var14_int];
                                  field_w[var14_int][var15_int] = var13;
                                  if (var14_int >= 10) {
                                    if (var14_int != 10) {
                                      field_U[var15_int] = var8;
                                      var12++;
                                      continue L10;
                                    } else {
                                      field_K[var15_int] = var8;
                                      var12++;
                                      continue L10;
                                    }
                                  } else {
                                    field_v[var14_int] = field_v[var14_int] + var8;
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
                        field_T[var8] = 0;
                        field_v[var8] = 0;
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
                          var9 = field_cb[var8];
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
                            var45 = field_P[var8];
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
                          var10 = field_cb[var8] - 65;
                          var46 = field_A[var10];
                          var12 = 0;
                          L15: while (true) {
                            if (var12 < field_Z[var10]) {
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
                  hk.a((byte) 120, 0, field_n, var7 - 1, field_I);
                  if (((sk) this).field_Q != null) {
                    var8 = 0;
                    L16: while (true) {
                      if (var8 >= 12) {
                        var8 = 0;
                        L17: while (true) {
                          if (var8 >= var7) {
                            break L4;
                          } else {
                            var9 = field_n[var8];
                            var10 = field_I[var8];
                            var11 = ((sk) this).field_Q[var9];
                            field_T[var11] = field_T[var11] + 1;
                            var12 = field_T[var11];
                            field_w[var11][var12] = var9;
                            if (var11 >= 10) {
                              if (var11 != 10) {
                                field_U[var12] = var10;
                                var8++;
                                continue L17;
                              } else {
                                field_K[var12] = var10;
                                var8++;
                                continue L17;
                              }
                            } else {
                              field_v[var11] = field_v[var11] + var10;
                              var8++;
                              continue L17;
                            }
                          }
                        }
                      } else {
                        field_T[var8] = 0;
                        field_v[var8] = 0;
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
                        this.e(field_n[var8]);
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
                  if (field_T[1] > 0) {
                    break L20;
                  } else {
                    if (field_T[2] <= 0) {
                      break L19;
                    } else {
                      break L20;
                    }
                  }
                }
                var8 = (field_v[1] + field_v[2]) / (field_T[1] + field_T[2]);
                break L19;
              }
              L21: {
                L22: {
                  var9 = 0;
                  if (field_T[3] > 0) {
                    break L22;
                  } else {
                    if (field_T[4] <= 0) {
                      break L21;
                    } else {
                      break L22;
                    }
                  }
                }
                var9 = (field_v[3] + field_v[4]) / (field_T[3] + field_T[4]);
                break L21;
              }
              L23: {
                L24: {
                  var10 = 0;
                  if (field_T[6] > 0) {
                    break L24;
                  } else {
                    if (field_T[8] <= 0) {
                      break L23;
                    } else {
                      break L24;
                    }
                  }
                }
                var10 = (field_v[6] + field_v[8]) / (field_T[6] + field_T[8]);
                break L23;
              }
              L25: {
                var12 = 0;
                var13 = field_T[10];
                var14 = field_w[10];
                var15 = field_K;
                if (var12 != var13) {
                  break L25;
                } else {
                  var12 = 0;
                  var13 = field_T[11];
                  var14 = field_w[11];
                  var15 = field_U;
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
                          if (var14 == field_w[11]) {
                            break L29;
                          } else {
                            var12 = 0;
                            var14 = field_w[11];
                            var13 = field_T[11];
                            var15 = field_U;
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
                              if (var14 == field_w[11]) {
                                break L32;
                              } else {
                                var12 = 0;
                                var13 = field_T[11];
                                var14 = field_w[11];
                                var15 = field_U;
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
                                if (var14 == field_w[11]) {
                                  break L35;
                                } else {
                                  var12 = 0;
                                  var13 = field_T[11];
                                  var14 = field_w[11];
                                  var15 = field_U;
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
                                  if (var14 == field_w[11]) {
                                    break L38;
                                  } else {
                                    var12 = 0;
                                    var13 = field_T[11];
                                    var14 = field_w[11];
                                    var15 = field_U;
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
                        var17 = field_T[var16];
                        var49 = field_w[var16];
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
              if (((sk) this).field_l[var8] != -2) {
                L40: {
                  var9 = ((sk) this).field_t[var8];
                  var10 = ((sk) this).field_M[var8];
                  var11 = ((sk) this).field_y[var8];
                  var12 = field_eb[var9];
                  var13 = field_eb[var10];
                  var14_int = field_eb[var11];
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
                    var18 = field_V[var9];
                    var19 = field_V[var10];
                    var20 = field_V[var11];
                    var21 = field_N[var9];
                    var22 = field_N[var10];
                    var23 = field_N[var11];
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
                      field_L[var8] = true;
                      if (!field_X) {
                        var27 = (field_g[var9] + field_g[var10] + field_g[var11]) / 3 + param3;
                        if (field_cb[var27] >= 64) {
                          L42: {
                            var28 = field_cb[var27];
                            if (var28 != 64) {
                              break L42;
                            } else {
                              if (field_fb != 512) {
                                field_fb = field_fb + 1;
                                var28 = 65 + field_fb;
                                field_cb[var27] = 65 + field_fb;
                                break L42;
                              } else {
                                var8++;
                                continue L3;
                              }
                            }
                          }
                          var28 -= 65;
                          field_Z[var28] = field_Z[var28] + 1;
                          field_A[var28][field_Z[var28]] = var8;
                          var8++;
                          continue L3;
                        } else {
                          field_cb[var27] = field_cb[var27] + 1;
                          field_P[var27][field_cb[var27]] = var8;
                          var8++;
                          continue L3;
                        }
                      } else {
                        field_I[var7] = (field_g[var9] + field_g[var10] + field_g[var11]) / 3;
                        int incrementValue$11 = var7;
                        var7++;
                        field_n[incrementValue$11] = var8;
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
                    if (!this.a(on.field_a + ti.field_k, bj.field_q + ti.field_f, field_J[var9], field_J[var10], field_J[var11], var12, var13, var14_int)) {
                      break L43;
                    } else {
                      int fieldTemp$12 = tk.field_g;
                      tk.field_g = tk.field_g + 1;
                      la.field_S[fieldTemp$12] = param2;
                      param1 = false;
                      break L43;
                    }
                  }
                }
                if ((var12 - var13) * (field_J[var11] - field_J[var10]) - (field_J[var9] - field_J[var10]) * (var14_int - var13) > 0) {
                  L44: {
                    L45: {
                      field_L[var8] = false;
                      if (var12 < 0) {
                        break L45;
                      } else {
                        if (var13 < 0) {
                          break L45;
                        } else {
                          if (var14_int < 0) {
                            break L45;
                          } else {
                            if (var12 > ti.field_e) {
                              break L45;
                            } else {
                              if (var13 > ti.field_e) {
                                break L45;
                              } else {
                                if (var14_int <= ti.field_e) {
                                  field_z[var8] = false;
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
                    field_z[var8] = true;
                    break L44;
                  }
                  if (!field_X) {
                    var15_int = (field_g[var9] + field_g[var10] + field_g[var11]) / 3 + param3;
                    if (field_cb[var15_int] >= 64) {
                      L46: {
                        var16 = field_cb[var15_int];
                        if (var16 != 64) {
                          break L46;
                        } else {
                          if (field_fb != 512) {
                            field_fb = field_fb + 1;
                            var16 = 65 + field_fb;
                            field_cb[var15_int] = 65 + field_fb;
                            break L46;
                          } else {
                            var8++;
                            continue L3;
                          }
                        }
                      }
                      var16 -= 65;
                      field_Z[var16] = field_Z[var16] + 1;
                      field_A[var16][field_Z[var16]] = var8;
                      var8++;
                      continue L3;
                    } else {
                      field_cb[var15_int] = field_cb[var15_int] + 1;
                      field_P[var15_int][field_cb[var15_int]] = var8;
                      var8++;
                      continue L3;
                    }
                  } else {
                    field_I[var7] = (field_g[var9] + field_g[var10] + field_g[var11]) / 3;
                    int incrementValue$13 = var7;
                    var7++;
                    field_n[incrementValue$13] = var8;
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

    private final void d() {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var5 = 0;
        int var8 = 0;
        int[] var11 = null;
        int[] var12 = null;
        if (field_bb != 0) {
          field_u = ti.field_e;
          field_j = ti.field_g;
          field_h = 0;
          field_G = 0;
          var1 = 0;
          L0: while (true) {
            if (var1 >= ((sk) this).field_S) {
              var1 = field_bb - 1;
              L1: while (true) {
                if (var1 < 0) {
                  L2: {
                    if (field_u >= 0) {
                      break L2;
                    } else {
                      field_u = 0;
                      break L2;
                    }
                  }
                  L3: {
                    if (field_h <= ti.field_e) {
                      break L3;
                    } else {
                      field_h = ti.field_e;
                      break L3;
                    }
                  }
                  L4: {
                    if (field_j >= 0) {
                      break L4;
                    } else {
                      field_j = 0;
                      break L4;
                    }
                  }
                  L5: {
                    if (field_G <= ti.field_g) {
                      break L5;
                    } else {
                      field_G = ti.field_g;
                      break L5;
                    }
                  }
                  L6: {
                    if (field_u <= field_h) {
                      break L6;
                    } else {
                      field_u = field_h;
                      break L6;
                    }
                  }
                  L7: {
                    if (field_j <= field_G) {
                      break L7;
                    } else {
                      field_j = field_G;
                      break L7;
                    }
                  }
                  var1 = ti.field_l[0] % fn.field_g;
                  var2 = ti.field_l[0] / fn.field_g;
                  field_u = field_u + var1;
                  field_h = field_h + var1;
                  field_j = field_j + var2;
                  field_G = field_G + var2;
                  return;
                } else {
                  L8: {
                    var2 = field_cb[var1];
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
                      var11 = field_P[var1];
                      var5 = 0;
                      L10: while (true) {
                        if (var5 >= var3) {
                          break L8;
                        } else {
                          this.b(var11[var5]);
                          var5++;
                          continue L10;
                        }
                      }
                    }
                  }
                  if (var2 > 64) {
                    var3 = field_cb[var1] - 65;
                    var12 = field_A[var3];
                    var8 = 0;
                    var5 = var8;
                    L11: while (true) {
                      if (var8 < field_Z[var3]) {
                        this.b(var12[var8]);
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
              var2 = field_eb[var1];
              if (var2 != -5000) {
                L12: {
                  var3 = field_J[var1];
                  if (var2 >= field_u) {
                    break L12;
                  } else {
                    field_u = var2;
                    break L12;
                  }
                }
                L13: {
                  if (var2 <= field_h) {
                    break L13;
                  } else {
                    field_h = var2;
                    break L13;
                  }
                }
                L14: {
                  if (var3 >= field_j) {
                    break L14;
                  } else {
                    field_j = var3;
                    break L14;
                  }
                }
                if (var3 > field_G) {
                  field_G = var3;
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
          field_G = 0;
          field_h = 0;
          field_j = 0;
          field_u = 0;
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
          field_bb = 0;
          if (((sk) this).field_s) {
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
        if (var5 >= 50 - ((sk) this).field_O) {
          var15 = ((sk) this).field_O * 92682 >> 16;
          if (var3 >= -var5 - var15) {
            if (var3 <= var5 + var15) {
              if (var4 >= -var5 - var15) {
                if (var4 <= var5 + var15) {
                  L1: {
                    if (var5 > 50 + ((sk) this).field_O) {
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
                      if (((sk) this).field_r > 0) {
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
                  var18 = ti.field_k;
                  var19 = ti.field_f;
                  var20 = 0;
                  var27 = 0;
                  var21_int = var27;
                  L3: while (true) {
                    if (var27 >= ((sk) this).field_S) {
                      try {
                        L4: {
                          this.a((var20 & var16) != 0, false, 0L, (int) ((sk) this).field_O, ((sk) this).field_O << 1);
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
                        var22 = ((sk) this).field_W[var27];
                        var23 = ((sk) this).field_C[var27];
                        var24 = ((sk) this).field_B[var27];
                        var25 = var22 * var6 + var23 * var9 + var24 * var12 >> 16;
                        var26 = var22 * var7 + var23 * var10 + var24 * var13 >> 16;
                        var24 = var22 * var8 + var23 * var11 + var24 * var14 >> 16;
                        var22 = var25;
                        var23 = var26;
                        field_g[var27] = var24;
                        var22 = var22 + var3;
                        var23 = var23 + var4;
                        var24 = var24 + var5;
                        if (var24 < 50) {
                          field_eb[var27] = -5000;
                          var20 = 1;
                          break L6;
                        } else {
                          field_eb[var27] = var18 + (var22 << 9) / var24;
                          field_J[var27] = var19 + (var23 << 9) / var24;
                          break L6;
                        }
                      }
                      if (var17 != 0) {
                        field_H[var27] = var22;
                        field_V[var27] = var23;
                        field_N[var27] = var24;
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
        if (param0 < 65536) {
          if (!field_L[param0]) {
            return;
          } else {
            L0: {
              var2 = ti.field_k;
              var3 = ti.field_f;
              var4 = ((sk) this).field_t[param0];
              var5 = ((sk) this).field_M[param0];
              var6 = ((sk) this).field_y[param0];
              var7 = field_N[var4];
              var8 = field_N[var5];
              var9 = field_N[var6];
              if (var7 >= 50) {
                break L0;
              } else {
                L1: {
                  var10 = field_H[var4];
                  var11 = field_V[var4];
                  if (var9 < 50) {
                    break L1;
                  } else {
                    var12 = (50 - var7) * ti.field_i[var9 - var7];
                    this.b(var2 + (var10 + ((field_H[var6] - var10) * var12 >> 16) << 9) / 50, var3 + (var11 + ((field_V[var6] - var11) * var12 >> 16) << 9) / 50);
                    break L1;
                  }
                }
                if (var8 < 50) {
                  break L0;
                } else {
                  var12 = (50 - var7) * ti.field_i[var8 - var7];
                  this.b(var2 + (var10 + ((field_H[var5] - var10) * var12 >> 16) << 9) / 50, var3 + (var11 + ((field_V[var5] - var11) * var12 >> 16) << 9) / 50);
                  break L0;
                }
              }
            }
            L2: {
              if (var8 >= 50) {
                break L2;
              } else {
                L3: {
                  var10 = field_H[var5];
                  var11 = field_V[var5];
                  if (var7 < 50) {
                    break L3;
                  } else {
                    var12 = (50 - var8) * ti.field_i[var7 - var8];
                    this.b(var2 + (var10 + ((field_H[var4] - var10) * var12 >> 16) << 9) / 50, var3 + (var11 + ((field_V[var4] - var11) * var12 >> 16) << 9) / 50);
                    break L3;
                  }
                }
                if (var9 < 50) {
                  break L2;
                } else {
                  var12 = (50 - var8) * ti.field_i[var9 - var8];
                  this.b(var2 + (var10 + ((field_H[var6] - var10) * var12 >> 16) << 9) / 50, var3 + (var11 + ((field_V[var6] - var11) * var12 >> 16) << 9) / 50);
                  break L2;
                }
              }
            }
            L4: {
              if (var9 >= 50) {
                break L4;
              } else {
                L5: {
                  var10 = field_H[var6];
                  var11 = field_V[var6];
                  if (var8 < 50) {
                    break L5;
                  } else {
                    var12 = (50 - var9) * ti.field_i[var8 - var9];
                    this.b(var2 + (var10 + ((field_H[var5] - var10) * var12 >> 16) << 9) / 50, var3 + (var11 + ((field_V[var5] - var11) * var12 >> 16) << 9) / 50);
                    break L5;
                  }
                }
                if (var7 < 50) {
                  break L4;
                } else {
                  var12 = (50 - var9) * ti.field_i[var7 - var9];
                  this.b(var2 + (var10 + ((field_H[var4] - var10) * var12 >> 16) << 9) / 50, var3 + (var11 + ((field_V[var4] - var11) * var12 >> 16) << 9) / 50);
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

    private sk() {
        ((sk) this).field_E = 0;
        ((sk) this).field_S = 0;
        ((sk) this).field_r = 0;
        ((sk) this).field_s = false;
        ((sk) this).field_m = 0;
    }

    sk(od param0, int param1, int param2, int param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var9_ref_int__ = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        oh var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        ea var18 = null;
        ea var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        L0: {
          ((sk) this).field_E = 0;
          ((sk) this).field_S = 0;
          ((sk) this).field_r = 0;
          ((sk) this).field_s = false;
          ((sk) this).field_m = 0;
          param0.d();
          param0.b();
          ((sk) this).field_S = param0.field_j;
          ((sk) this).field_m = param0.field_R;
          ((sk) this).field_W = param0.field_v;
          ((sk) this).field_C = param0.field_s;
          ((sk) this).field_B = param0.field_h;
          ((sk) this).field_E = param0.field_t;
          ((sk) this).field_t = param0.field_S;
          ((sk) this).field_M = param0.field_q;
          ((sk) this).field_y = param0.field_i;
          ((sk) this).field_Q = param0.field_G;
          ((sk) this).field_p = param0.field_n;
          var7 = (int)Math.sqrt((double)(param3 * param3 + param4 * param4 + param5 * param5));
          var8 = param2 * var7 >> 8;
          ((sk) this).field_i = new int[((sk) this).field_E];
          ((sk) this).field_q = new int[((sk) this).field_E];
          ((sk) this).field_l = new int[((sk) this).field_E];
          if (param0.field_p == null) {
            ((sk) this).field_F = null;
            break L0;
          } else {
            ((sk) this).field_F = new short[((sk) this).field_E];
            var9 = 0;
            L1: while (true) {
              if (var9 >= ((sk) this).field_E) {
                break L0;
              } else {
                L2: {
                  var10 = param0.field_p[var9];
                  if (var10 == -1) {
                    break L2;
                  } else {
                    if (!ti.field_b.a(var10, 1)) {
                      break L2;
                    } else {
                      ((sk) this).field_F[var9] = (short)var10;
                      var9++;
                      continue L1;
                    }
                  }
                }
                ((sk) this).field_F[var9] = (short) -1;
                var9++;
                continue L1;
              }
            }
          }
        }
        L3: {
          if (param0.field_Q <= 0) {
            break L3;
          } else {
            if (param0.field_y == null) {
              break L3;
            } else {
              var22 = new int[param0.field_Q];
              var21 = var22;
              var20 = var21;
              var17 = var20;
              var9_ref_int__ = var17;
              var10 = 0;
              L4: while (true) {
                if (var10 >= ((sk) this).field_E) {
                  ((sk) this).field_r = 0;
                  var10 = 0;
                  L5: while (true) {
                    if (var10 >= param0.field_Q) {
                      ((sk) this).field_Y = new int[((sk) this).field_r];
                      ((sk) this).field_R = new int[((sk) this).field_r];
                      ((sk) this).field_x = new int[((sk) this).field_r];
                      var10 = 0;
                      var11 = 0;
                      L6: while (true) {
                        if (var11 >= param0.field_Q) {
                          ((sk) this).field_db = new byte[((sk) this).field_E];
                          var11 = 0;
                          L7: while (true) {
                            if (var11 >= ((sk) this).field_E) {
                              break L3;
                            } else {
                              if (param0.field_y[var11] == -1) {
                                ((sk) this).field_db[var11] = (byte) -1;
                                var11++;
                                continue L7;
                              } else {
                                ((sk) this).field_db[var11] = (byte)var9_ref_int__[param0.field_y[var11] & 255];
                                if (((sk) this).field_db[var11] == -1) {
                                  if (((sk) this).field_F != null) {
                                    ((sk) this).field_F[var11] = (short) -1;
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
                              if (param0.field_z[var11] != 0) {
                                break L8;
                              } else {
                                ((sk) this).field_Y[var10] = param0.field_g[var11] & 65535;
                                ((sk) this).field_R[var10] = param0.field_U[var11] & 65535;
                                ((sk) this).field_x[var10] = param0.field_T[var11] & 65535;
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
                        if (param0.field_z[var10] == 0) {
                          ((sk) this).field_r = ((sk) this).field_r + 1;
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
                  if (param0.field_y[var10] != -1) {
                    var9_ref_int__[param0.field_y[var10] & 255] = var9_ref_int__[param0.field_y[var10] & 255] + 1;
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
          if (var16 >= ((sk) this).field_E) {
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
              if (param0.field_n != null) {
                var11 = param0.field_n[var16];
                break L11;
              } else {
                var11 = 0;
                break L11;
              }
            }
            L12: {
              if (((sk) this).field_F != null) {
                var12 = ((sk) this).field_F[var16];
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
                  ((sk) this).field_l[var16] = -2;
                  var16++;
                  continue L9;
                } else {
                  var19 = param0.field_u[var16];
                  var14 = param1 + (param3 * var19.field_d + param4 * var19.field_c + param5 * var19.field_b) / (var8 + var8 / 2);
                  ((sk) this).field_i[var16] = sk.d(var14);
                  ((sk) this).field_l[var16] = -1;
                  var16++;
                  continue L9;
                }
              } else {
                L15: {
                  L16: {
                    if (param0.field_r == null) {
                      break L16;
                    } else {
                      if (param0.field_r[((sk) this).field_t[var16]] == null) {
                        break L16;
                      } else {
                        var13 = param0.field_r[((sk) this).field_t[var16]];
                        break L15;
                      }
                    }
                  }
                  var13 = param0.field_I[((sk) this).field_t[var16]];
                  break L15;
                }
                L17: {
                  L18: {
                    var14 = param1 + (param3 * var13.field_b + param4 * var13.field_c + param5 * var13.field_f) / (var8 * var13.field_g);
                    ((sk) this).field_i[var16] = sk.d(var14);
                    if (param0.field_r == null) {
                      break L18;
                    } else {
                      if (param0.field_r[((sk) this).field_M[var16]] == null) {
                        break L18;
                      } else {
                        var13 = param0.field_r[((sk) this).field_M[var16]];
                        break L17;
                      }
                    }
                  }
                  var13 = param0.field_I[((sk) this).field_M[var16]];
                  break L17;
                }
                L19: {
                  L20: {
                    var14 = param1 + (param3 * var13.field_b + param4 * var13.field_c + param5 * var13.field_f) / (var8 * var13.field_g);
                    ((sk) this).field_q[var16] = sk.d(var14);
                    if (param0.field_r == null) {
                      break L20;
                    } else {
                      if (param0.field_r[((sk) this).field_y[var16]] == null) {
                        break L20;
                      } else {
                        var13 = param0.field_r[((sk) this).field_y[var16]];
                        break L19;
                      }
                    }
                  }
                  var13 = param0.field_I[((sk) this).field_y[var16]];
                  break L19;
                }
                var14 = param1 + (param3 * var13.field_b + param4 * var13.field_c + param5 * var13.field_f) / (var8 * var13.field_g);
                ((sk) this).field_l[var16] = sk.d(var14);
                var16++;
                continue L9;
              }
            } else {
              if (var10 != 0) {
                if (var10 != 1) {
                  if (var10 != 3) {
                    ((sk) this).field_l[var16] = -2;
                    var16++;
                    continue L9;
                  } else {
                    ((sk) this).field_i[var16] = 128;
                    ((sk) this).field_l[var16] = -1;
                    var16++;
                    continue L9;
                  }
                } else {
                  var18 = param0.field_u[var16];
                  var14 = param1 + (param3 * var18.field_d + param4 * var18.field_c + param5 * var18.field_b) / (var8 + var8 / 2) << 17;
                  ((sk) this).field_i[var16] = var14 | sk.a(param0.field_M[var16] & 65535, var14 >> 17);
                  ((sk) this).field_l[var16] = -1;
                  var16++;
                  continue L9;
                }
              } else {
                L21: {
                  L22: {
                    var15 = param0.field_M[var16] & 65535;
                    if (param0.field_r == null) {
                      break L22;
                    } else {
                      if (param0.field_r[((sk) this).field_t[var16]] == null) {
                        break L22;
                      } else {
                        var13 = param0.field_r[((sk) this).field_t[var16]];
                        break L21;
                      }
                    }
                  }
                  var13 = param0.field_I[((sk) this).field_t[var16]];
                  break L21;
                }
                L23: {
                  L24: {
                    var14 = param1 + (param3 * var13.field_b + param4 * var13.field_c + param5 * var13.field_f) / (var8 * var13.field_g) << 17;
                    ((sk) this).field_i[var16] = var14 | sk.a(var15, var14 >> 17);
                    if (param0.field_r == null) {
                      break L24;
                    } else {
                      if (param0.field_r[((sk) this).field_M[var16]] == null) {
                        break L24;
                      } else {
                        var13 = param0.field_r[((sk) this).field_M[var16]];
                        break L23;
                      }
                    }
                  }
                  var13 = param0.field_I[((sk) this).field_M[var16]];
                  break L23;
                }
                L25: {
                  L26: {
                    var14 = param1 + (param3 * var13.field_b + param4 * var13.field_c + param5 * var13.field_f) / (var8 * var13.field_g) << 17;
                    ((sk) this).field_q[var16] = var14 | sk.a(var15, var14 >> 17);
                    if (param0.field_r == null) {
                      break L26;
                    } else {
                      if (param0.field_r[((sk) this).field_y[var16]] == null) {
                        break L26;
                      } else {
                        var13 = param0.field_r[((sk) this).field_y[var16]];
                        break L25;
                      }
                    }
                  }
                  var13 = param0.field_I[((sk) this).field_y[var16]];
                  break L25;
                }
                var14 = param1 + (param3 * var13.field_b + param4 * var13.field_c + param5 * var13.field_f) / (var8 * var13.field_g) << 17;
                ((sk) this).field_l[var16] = var14 | sk.a(var15, var14 >> 17);
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
        sk discarded$0 = new sk();
        sk discarded$1 = new sk();
        sk discarded$2 = new sk();
        field_L = new boolean[4096];
        field_k = new int[10];
        field_fb = 0;
        field_w = new int[12][4096];
        field_v = new int[12];
        field_U = new int[4096];
        field_K = new int[4096];
        field_T = new int[12];
        field_eb = new int[4096];
        field_g = new int[4096];
        field_N = new int[4096];
        field_J = new int[4096];
        field_H = new int[4096];
        field_o = new int[10];
        field_ab = new int[10];
        field_X = false;
        if (field_X) {
            field_I = new int[4096];
            field_n = new int[4096];
        } else {
            field_cb = new int[1600];
            field_P = new int[1600][64];
            field_Z = new int[32];
            field_A = new int[32][512];
        }
        field_z = new boolean[4096];
        field_V = new int[4096];
    }
}
