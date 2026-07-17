/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gd extends kk {
    private int[] field_q;
    private int[] field_w;
    int[] field_R;
    private byte[] field_lb;
    private int field_Y;
    private short[] field_ab;
    private byte[] field_H;
    private boolean field_k;
    private int[] field_F;
    private int[] field_jb;
    private int[] field_bb;
    private int field_l;
    private short field_A;
    int[] field_Z;
    private byte[] field_ob;
    int field_I;
    int[] field_o;
    private boolean field_db;
    private int[][] field_i;
    private int[] field_G;
    private int[][] field_S;
    private int[] field_nb;
    private static gd field_ib;
    private short[] field_r;
    int[] field_t;
    private int field_p;
    private short[] field_g;
    private int[] field_N;
    private short[] field_e;
    private static byte[] field_u;
    private static int[] field_gb;
    private static short[] field_C;
    private static int[] field_K;
    private static int[] field_m;
    private static boolean[] field_D;
    private static int[] field_hb;
    private static int[] field_V;
    private static boolean field_y;
    private static int[] field_z;
    private static int[] field_M;
    private static int[] field_eb;
    private static int field_cb;
    private static int field_x;
    private static int[] field_W;
    private static int[] field_O;
    private static int[] field_P;
    private static int[] field_h;
    private static int[][] field_kb;
    private static int[] field_B;
    private static boolean[] field_s;
    private static boolean field_f;
    private static int[][] field_j;
    private static int[] field_X;
    private static int[] field_n;
    private static int[][] field_U;
    private static int field_v;
    private static int[] field_T;
    private static int[] field_L;
    private static int[] field_J;
    private static int field_mb;
    private static int[] field_Q;
    private static int[] field_fb;

    private final void e() {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_5_0 = 0;
        int stackOut_4_0 = 0;
        short stackOut_3_0 = 0;
        var4 = 0;
        L0: while (true) {
          if (var4 >= ((gd) this).field_Y) {
            return;
          } else {
            L1: {
              if (((gd) this).field_ab == null) {
                stackOut_4_0 = -1;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = ((gd) this).field_ab[var4];
                stackIn_5_0 = stackOut_3_0;
                break L1;
              }
            }
            var3 = stackIn_5_0;
            if (var3 == -1) {
              var1 = ((gd) this).field_r[var4] & 65535;
              if (((gd) this).field_R[var4] != -1) {
                if (((gd) this).field_R[var4] != -2) {
                  var2 = ((gd) this).field_Z[var4] & -131072;
                  ((gd) this).field_Z[var4] = var2 | gd.a(var1, var2 >> 17);
                  var2 = ((gd) this).field_t[var4] & -131072;
                  ((gd) this).field_t[var4] = var2 | gd.a(var1, var2 >> 17);
                  var2 = ((gd) this).field_R[var4] & -131072;
                  ((gd) this).field_R[var4] = var2 | gd.a(var1, var2 >> 17);
                  var4++;
                  continue L0;
                } else {
                  var4++;
                  continue L0;
                }
              } else {
                var2 = ((gd) this).field_Z[var4] & -131072;
                ((gd) this).field_Z[var4] = var2 | gd.a(var1, var2 >> 17);
                var4++;
                continue L0;
              }
            } else {
              var4++;
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

    final void a() {
        if (((gd) this).field_db) {
            this.e();
            ((gd) this).field_db = false;
        }
        ((gd) this).field_k = false;
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
          var2 = tm.field_c;
          var3 = tm.field_j;
          var4 = 0;
          var5 = ((gd) this).field_jb[param0];
          var6 = ((gd) this).field_bb[param0];
          var7 = ((gd) this).field_N[param0];
          var8 = field_O[var5];
          var9 = field_O[var6];
          var10 = field_O[var7];
          if (((gd) this).field_H != null) {
            tm.field_f = ((gd) this).field_H[param0] & 255;
            break L0;
          } else {
            tm.field_f = 0;
            break L0;
          }
        }
        L1: {
          if (var8 < 50) {
            L2: {
              var11 = field_X[var5];
              var12 = field_Q[var5];
              var13 = ((gd) this).field_Z[param0] & 65535;
              if (var10 < 50) {
                break L2;
              } else {
                var14 = (50 - var8) * tm.field_m[var10 - var8];
                field_n[var4] = var2 + (var11 + ((field_X[var7] - var11) * var14 >> 16) << 9) / 50;
                field_eb[var4] = var3 + (var12 + ((field_Q[var7] - var12) * var14 >> 16) << 9) / 50;
                int incrementValue$9 = var4;
                var4++;
                field_fb[incrementValue$9] = var13 + (((((gd) this).field_R[param0] & 65535) - var13) * var14 >> 16);
                break L2;
              }
            }
            if (var9 < 50) {
              break L1;
            } else {
              var14 = (50 - var8) * tm.field_m[var9 - var8];
              field_n[var4] = var2 + (var11 + ((field_X[var6] - var11) * var14 >> 16) << 9) / 50;
              field_eb[var4] = var3 + (var12 + ((field_Q[var6] - var12) * var14 >> 16) << 9) / 50;
              int incrementValue$10 = var4;
              var4++;
              field_fb[incrementValue$10] = var13 + (((((gd) this).field_t[param0] & 65535) - var13) * var14 >> 16);
              break L1;
            }
          } else {
            field_n[var4] = field_B[var5];
            field_eb[var4] = field_V[var5];
            int incrementValue$11 = var4;
            var4++;
            field_fb[incrementValue$11] = ((gd) this).field_Z[param0] & 65535;
            break L1;
          }
        }
        L3: {
          if (var9 < 50) {
            L4: {
              var11 = field_X[var6];
              var12 = field_Q[var6];
              var13 = ((gd) this).field_t[param0] & 65535;
              if (var8 < 50) {
                break L4;
              } else {
                var14 = (50 - var9) * tm.field_m[var8 - var9];
                field_n[var4] = var2 + (var11 + ((field_X[var5] - var11) * var14 >> 16) << 9) / 50;
                field_eb[var4] = var3 + (var12 + ((field_Q[var5] - var12) * var14 >> 16) << 9) / 50;
                int incrementValue$12 = var4;
                var4++;
                field_fb[incrementValue$12] = var13 + (((((gd) this).field_Z[param0] & 65535) - var13) * var14 >> 16);
                break L4;
              }
            }
            if (var10 < 50) {
              break L3;
            } else {
              var14 = (50 - var9) * tm.field_m[var10 - var9];
              field_n[var4] = var2 + (var11 + ((field_X[var7] - var11) * var14 >> 16) << 9) / 50;
              field_eb[var4] = var3 + (var12 + ((field_Q[var7] - var12) * var14 >> 16) << 9) / 50;
              int incrementValue$13 = var4;
              var4++;
              field_fb[incrementValue$13] = var13 + (((((gd) this).field_R[param0] & 65535) - var13) * var14 >> 16);
              break L3;
            }
          } else {
            field_n[var4] = field_B[var6];
            field_eb[var4] = field_V[var6];
            int incrementValue$14 = var4;
            var4++;
            field_fb[incrementValue$14] = ((gd) this).field_t[param0] & 65535;
            break L3;
          }
        }
        L5: {
          if (var10 < 50) {
            L6: {
              var11 = field_X[var7];
              var12 = field_Q[var7];
              var13 = ((gd) this).field_R[param0] & 65535;
              if (var9 < 50) {
                break L6;
              } else {
                var14 = (50 - var10) * tm.field_m[var9 - var10];
                field_n[var4] = var2 + (var11 + ((field_X[var6] - var11) * var14 >> 16) << 9) / 50;
                field_eb[var4] = var3 + (var12 + ((field_Q[var6] - var12) * var14 >> 16) << 9) / 50;
                int incrementValue$15 = var4;
                var4++;
                field_fb[incrementValue$15] = var13 + (((((gd) this).field_t[param0] & 65535) - var13) * var14 >> 16);
                break L6;
              }
            }
            if (var8 < 50) {
              break L5;
            } else {
              var14 = (50 - var10) * tm.field_m[var8 - var10];
              field_n[var4] = var2 + (var11 + ((field_X[var5] - var11) * var14 >> 16) << 9) / 50;
              field_eb[var4] = var3 + (var12 + ((field_Q[var5] - var12) * var14 >> 16) << 9) / 50;
              int incrementValue$16 = var4;
              var4++;
              field_fb[incrementValue$16] = var13 + (((((gd) this).field_Z[param0] & 65535) - var13) * var14 >> 16);
              break L5;
            }
          } else {
            field_n[var4] = field_B[var7];
            field_eb[var4] = field_V[var7];
            int incrementValue$17 = var4;
            var4++;
            field_fb[incrementValue$17] = ((gd) this).field_R[param0] & 65535;
            break L5;
          }
        }
        L7: {
          var11 = field_n[0];
          var12 = field_n[1];
          var13 = field_n[2];
          var14 = field_eb[0];
          var15 = field_eb[1];
          var16 = field_eb[2];
          tm.field_a = false;
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
                      if (var11 > tm.field_l) {
                        break L9;
                      } else {
                        if (var12 > tm.field_l) {
                          break L9;
                        } else {
                          if (var13 <= tm.field_l) {
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
              tm.field_a = true;
              break L8;
            }
            L10: {
              if (((gd) this).field_ab == null) {
                break L10;
              } else {
                if (((gd) this).field_ab[param0] != -1) {
                  L11: {
                    L12: {
                      if (((gd) this).field_lb == null) {
                        break L12;
                      } else {
                        if (((gd) this).field_lb[param0] == -1) {
                          break L12;
                        } else {
                          var20 = ((gd) this).field_lb[param0] & 255;
                          var17 = ((gd) this).field_nb[var20];
                          var18 = ((gd) this).field_q[var20];
                          var19 = ((gd) this).field_w[var20];
                          break L11;
                        }
                      }
                    }
                    var17 = var5;
                    var18 = var6;
                    var19 = var7;
                    break L11;
                  }
                  if (((gd) this).field_R[param0] != -1) {
                    tm.a(var14, var15, var16, var11, var12, var13, field_fb[0], field_fb[1], field_fb[2], field_X[var17], field_X[var18], field_X[var19], field_Q[var17], field_Q[var18], field_Q[var19], field_O[var17], field_O[var18], field_O[var19], (int) ((gd) this).field_ab[param0]);
                    break L7;
                  } else {
                    tm.a(var14, var15, var16, var11, var12, var13, ((gd) this).field_Z[param0], ((gd) this).field_Z[param0], ((gd) this).field_Z[param0], field_X[var17], field_X[var18], field_X[var19], field_Q[var17], field_Q[var18], field_Q[var19], field_O[var17], field_O[var18], field_O[var19], (int) ((gd) this).field_ab[param0]);
                    break L7;
                  }
                } else {
                  break L10;
                }
              }
            }
            if (((gd) this).field_R[param0] != -1) {
              tm.a(var14, var15, var16, var11, var12, var13, field_fb[0], field_fb[1], field_fb[2]);
              break L7;
            } else {
              tm.a(var14, var15, var16, var11, var12, var13, tm.field_h[((gd) this).field_Z[param0] & 65535]);
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
                    if (var11 > tm.field_l) {
                      break L14;
                    } else {
                      if (var12 > tm.field_l) {
                        break L14;
                      } else {
                        if (var13 > tm.field_l) {
                          break L14;
                        } else {
                          if (field_n[3] < 0) {
                            break L14;
                          } else {
                            if (field_n[3] <= tm.field_l) {
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
            tm.field_a = true;
            break L13;
          }
          L15: {
            L16: {
              if (((gd) this).field_ab == null) {
                break L16;
              } else {
                if (((gd) this).field_ab[param0] != -1) {
                  L17: {
                    L18: {
                      if (((gd) this).field_lb == null) {
                        break L18;
                      } else {
                        if (((gd) this).field_lb[param0] == -1) {
                          break L18;
                        } else {
                          var20 = ((gd) this).field_lb[param0] & 255;
                          var17 = ((gd) this).field_nb[var20];
                          var18 = ((gd) this).field_q[var20];
                          var19 = ((gd) this).field_w[var20];
                          break L17;
                        }
                      }
                    }
                    var17 = var5;
                    var18 = var6;
                    var19 = var7;
                    break L17;
                  }
                  var20 = ((gd) this).field_ab[param0];
                  if (((gd) this).field_R[param0] != -1) {
                    tm.a(var14, var15, var16, var11, var12, var13, field_fb[0], field_fb[1], field_fb[2], field_X[var17], field_X[var18], field_X[var19], field_Q[var17], field_Q[var18], field_Q[var19], field_O[var17], field_O[var18], field_O[var19], var20);
                    tm.a(var14, var16, field_eb[3], var11, var13, field_n[3], field_fb[0], field_fb[2], field_fb[3], field_X[var17], field_X[var18], field_X[var19], field_Q[var17], field_Q[var18], field_Q[var19], field_O[var17], field_O[var18], field_O[var19], var20);
                    break L15;
                  } else {
                    tm.a(var14, var15, var16, var11, var12, var13, ((gd) this).field_Z[param0], ((gd) this).field_Z[param0], ((gd) this).field_Z[param0], field_X[var17], field_X[var18], field_X[var19], field_Q[var17], field_Q[var18], field_Q[var19], field_O[var17], field_O[var18], field_O[var19], var20);
                    tm.a(var14, var16, field_eb[3], var11, var13, field_n[3], ((gd) this).field_Z[param0], ((gd) this).field_Z[param0], ((gd) this).field_Z[param0], field_X[var17], field_X[var18], field_X[var19], field_Q[var17], field_Q[var18], field_Q[var19], field_O[var17], field_O[var18], field_O[var19], var20);
                    break L15;
                  }
                } else {
                  break L16;
                }
              }
            }
            if (((gd) this).field_R[param0] != -1) {
              tm.a(var14, var15, var16, var11, var12, var13, field_fb[0], field_fb[1], field_fb[2]);
              tm.a(var14, var16, field_eb[3], var11, var13, field_n[3], field_fb[0], field_fb[2], field_fb[3]);
              break L15;
            } else {
              var17 = tm.field_h[((gd) this).field_Z[param0] & 65535];
              tm.a(var14, var15, var16, var11, var12, var13, var17);
              tm.a(var14, var16, field_eb[3], var11, var13, field_n[3], var17);
              break L15;
            }
          }
          return;
        }
    }

    final kk a(boolean param0, boolean param1, boolean param2) {
        L0: {
          if (!param0) {
            if (field_u.length < ((gd) this).field_Y) {
              field_u = new byte[((gd) this).field_Y + 100];
              if (param1) {
                break L0;
              } else {
                if (field_C.length >= ((gd) this).field_Y) {
                  break L0;
                } else {
                  field_gb = new int[((gd) this).field_Y + 100];
                  field_m = new int[((gd) this).field_Y + 100];
                  field_K = new int[((gd) this).field_Y + 100];
                  field_C = new short[((gd) this).field_Y + 100];
                  break L0;
                }
              }
            } else {
              if (param1) {
                break L0;
              } else {
                if (field_C.length >= ((gd) this).field_Y) {
                  break L0;
                } else {
                  field_gb = new int[((gd) this).field_Y + 100];
                  field_m = new int[((gd) this).field_Y + 100];
                  field_K = new int[((gd) this).field_Y + 100];
                  field_C = new short[((gd) this).field_Y + 100];
                  break L0;
                }
              }
            }
          } else {
            if (param1) {
              break L0;
            } else {
              if (field_C.length >= ((gd) this).field_Y) {
                break L0;
              } else {
                field_gb = new int[((gd) this).field_Y + 100];
                field_m = new int[((gd) this).field_Y + 100];
                field_K = new int[((gd) this).field_Y + 100];
                field_C = new short[((gd) this).field_Y + 100];
                break L0;
              }
            }
          }
        }
        return this.a(param0, param1, field_ib, field_u, field_C, field_gb, field_m, field_K);
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

    final boolean b() {
        if (((gd) this).field_S == null) {
            return false;
        }
        field_v = 0;
        field_mb = 0;
        field_cb = 0;
        return true;
    }

    final void b(int param0, int param1, int param2) {
        int var4 = 0;
        for (var4 = 0; var4 < ((gd) this).field_I; var4++) {
            ((gd) this).field_G[var4] = ((gd) this).field_G[var4] * param0 / 128;
            ((gd) this).field_o[var4] = ((gd) this).field_o[var4] * param1 / 128;
            ((gd) this).field_F[var4] = ((gd) this).field_F[var4] * param2 / 128;
        }
        ((gd) this).field_k = false;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        ((gd) this).a(param0, param1, param2, param3, param4, param5, param6, -1L);
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
            var2 = ((gd) this).field_jb[param0];
            var3 = ((gd) this).field_bb[param0];
            var4 = ((gd) this).field_N[param0];
            tm.field_a = field_s[param0];
            if (((gd) this).field_H != null) {
              tm.field_f = ((gd) this).field_H[param0] & 255;
              break L0;
            } else {
              tm.field_f = 0;
              break L0;
            }
          }
          L1: {
            L2: {
              if (((gd) this).field_ab == null) {
                break L2;
              } else {
                if (((gd) this).field_ab[param0] != -1) {
                  L3: {
                    L4: {
                      if (((gd) this).field_lb == null) {
                        break L4;
                      } else {
                        if (((gd) this).field_lb[param0] == -1) {
                          break L4;
                        } else {
                          var8 = ((gd) this).field_lb[param0] & 255;
                          var5 = ((gd) this).field_nb[var8];
                          var6 = ((gd) this).field_q[var8];
                          var7 = ((gd) this).field_w[var8];
                          break L3;
                        }
                      }
                    }
                    var5 = var2;
                    var6 = var3;
                    var7 = var4;
                    break L3;
                  }
                  if (((gd) this).field_R[param0] != -1) {
                    tm.a(field_V[var2], field_V[var3], field_V[var4], field_B[var2], field_B[var3], field_B[var4], ((gd) this).field_Z[param0], ((gd) this).field_t[param0], ((gd) this).field_R[param0], field_X[var5], field_X[var6], field_X[var7], field_Q[var5], field_Q[var6], field_Q[var7], field_O[var5], field_O[var6], field_O[var7], (int) ((gd) this).field_ab[param0]);
                    break L1;
                  } else {
                    tm.a(field_V[var2], field_V[var3], field_V[var4], field_B[var2], field_B[var3], field_B[var4], ((gd) this).field_Z[param0], ((gd) this).field_Z[param0], ((gd) this).field_Z[param0], field_X[var5], field_X[var6], field_X[var7], field_Q[var5], field_Q[var6], field_Q[var7], field_O[var5], field_O[var6], field_O[var7], (int) ((gd) this).field_ab[param0]);
                    break L1;
                  }
                } else {
                  break L2;
                }
              }
            }
            if (((gd) this).field_R[param0] != -1) {
              tm.a(field_V[var2], field_V[var3], field_V[var4], field_B[var2], field_B[var3], field_B[var4], ((gd) this).field_Z[param0] & 65535, ((gd) this).field_t[param0] & 65535, ((gd) this).field_R[param0] & 65535);
              break L1;
            } else {
              tm.a(field_V[var2], field_V[var3], field_V[var4], field_B[var2], field_B[var3], field_B[var4], tm.field_h[((gd) this).field_Z[param0] & 65535]);
              break L1;
            }
          }
          return;
        } else {
          this.c(param0);
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

    private final kk a(boolean param0, boolean param1, gd param2, byte[] param3, short[] param4, int[] param5, int[] param6, int[] param7) {
        int var9 = 0;
        L0: {
          L1: {
            param2.field_I = ((gd) this).field_I;
            param2.field_p = ((gd) this).field_p;
            param2.field_Y = ((gd) this).field_Y;
            param2.field_l = ((gd) this).field_l;
            if (param2.field_G == null) {
              break L1;
            } else {
              if (param2.field_G.length >= ((gd) this).field_I) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          param2.field_G = new int[((gd) this).field_I + 100];
          param2.field_o = new int[((gd) this).field_I + 100];
          param2.field_F = new int[((gd) this).field_I + 100];
          break L0;
        }
        var9 = 0;
        L2: while (true) {
          if (var9 >= ((gd) this).field_I) {
            L3: {
              if (!param0) {
                param2.field_H = param3;
                if (((gd) this).field_H != null) {
                  var9 = 0;
                  L4: while (true) {
                    if (var9 >= ((gd) this).field_Y) {
                      break L3;
                    } else {
                      param2.field_H[var9] = ((gd) this).field_H[var9];
                      var9++;
                      continue L4;
                    }
                  }
                } else {
                  var9 = 0;
                  L5: while (true) {
                    if (var9 >= ((gd) this).field_Y) {
                      break L3;
                    } else {
                      param2.field_H[var9] = (byte) 0;
                      var9++;
                      continue L5;
                    }
                  }
                }
              } else {
                param2.field_H = ((gd) this).field_H;
                break L3;
              }
            }
            L6: {
              if (!param1) {
                param2.field_r = param4;
                param2.field_Z = param5;
                param2.field_t = param6;
                param2.field_R = param7;
                var9 = 0;
                L7: while (true) {
                  if (var9 >= ((gd) this).field_Y) {
                    break L6;
                  } else {
                    param2.field_r[var9] = ((gd) this).field_r[var9];
                    param2.field_Z[var9] = ((gd) this).field_Z[var9];
                    param2.field_t[var9] = ((gd) this).field_t[var9];
                    param2.field_R[var9] = ((gd) this).field_R[var9];
                    var9++;
                    continue L7;
                  }
                }
              } else {
                param2.field_r = ((gd) this).field_r;
                param2.field_Z = ((gd) this).field_Z;
                param2.field_t = ((gd) this).field_t;
                param2.field_R = ((gd) this).field_R;
                break L6;
              }
            }
            param2.field_jb = ((gd) this).field_jb;
            param2.field_bb = ((gd) this).field_bb;
            param2.field_N = ((gd) this).field_N;
            param2.field_ob = ((gd) this).field_ob;
            param2.field_lb = ((gd) this).field_lb;
            param2.field_ab = ((gd) this).field_ab;
            param2.field_nb = ((gd) this).field_nb;
            param2.field_q = ((gd) this).field_q;
            param2.field_w = ((gd) this).field_w;
            param2.field_S = ((gd) this).field_S;
            param2.field_i = ((gd) this).field_i;
            param2.field_e = ((gd) this).field_e;
            param2.field_g = ((gd) this).field_g;
            param2.field_k = false;
            return (kk) (Object) param2;
          } else {
            param2.field_G[var9] = ((gd) this).field_G[var9];
            param2.field_o[var9] = ((gd) this).field_o[var9];
            param2.field_F[var9] = ((gd) this).field_F[var9];
            var9++;
            continue L2;
          }
        }
    }

    final void a(int param0, int[] param1, int param2, int param3, int param4, boolean param5) {
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
        int[] var35 = null;
        int[] var36 = null;
        int[] var37 = null;
        int[] var38 = null;
        int[] var39 = null;
        int[] var40 = null;
        var7 = param1.length;
        if (param0 != 0) {
          if (param0 != 1) {
            if (param0 != 2) {
              if (param0 != 3) {
                L0: {
                  if (param0 != 5) {
                    if (param0 != 7) {
                      return;
                    } else {
                      if (((gd) this).field_i == null) {
                        break L0;
                      } else {
                        var8 = 0;
                        L1: while (true) {
                          if (var8 >= var7) {
                            return;
                          } else {
                            var9 = param1[var8];
                            if (var9 < ((gd) this).field_i.length) {
                              var40 = ((gd) this).field_i[var9];
                              var11 = 0;
                              L2: while (true) {
                                if (var11 >= var40.length) {
                                  ((gd) this).field_db = true;
                                  var8++;
                                  continue L1;
                                } else {
                                  L3: {
                                    var12 = var40[var11];
                                    var13 = ((gd) this).field_r[var12] & 65535;
                                    var14 = var13 >> 10 & 63;
                                    var15 = var13 >> 7 & 7;
                                    var16 = var13 & 127;
                                    var14 = var14 + param2 & 63;
                                    var15 = var15 + param3;
                                    if (var15 >= 0) {
                                      if (var15 <= 7) {
                                        break L3;
                                      } else {
                                        var15 = 7;
                                        break L3;
                                      }
                                    } else {
                                      var15 = 0;
                                      break L3;
                                    }
                                  }
                                  L4: {
                                    var16 = var16 + param4;
                                    if (var16 >= 0) {
                                      if (var16 <= 127) {
                                        break L4;
                                      } else {
                                        var16 = 127;
                                        break L4;
                                      }
                                    } else {
                                      var16 = 0;
                                      break L4;
                                    }
                                  }
                                  ((gd) this).field_r[var12] = (short)(var14 << 10 | var15 << 7 | var16);
                                  var11++;
                                  continue L2;
                                }
                              }
                            } else {
                              var8++;
                              continue L1;
                            }
                          }
                        }
                      }
                    }
                  } else {
                    if (((gd) this).field_i == null) {
                      break L0;
                    } else {
                      L5: {
                        if (((gd) this).field_H == null) {
                          break L5;
                        } else {
                          var8 = 0;
                          L6: while (true) {
                            if (var8 >= var7) {
                              break L5;
                            } else {
                              var9 = param1[var8];
                              if (var9 < ((gd) this).field_i.length) {
                                var39 = ((gd) this).field_i[var9];
                                var11 = 0;
                                L7: while (true) {
                                  if (var11 < var39.length) {
                                    L8: {
                                      var12 = var39[var11];
                                      var13 = (((gd) this).field_H[var12] & 255) + param2 * 8;
                                      if (var13 >= 0) {
                                        if (var13 <= 255) {
                                          break L8;
                                        } else {
                                          var13 = 255;
                                          break L8;
                                        }
                                      } else {
                                        var13 = 0;
                                        break L8;
                                      }
                                    }
                                    ((gd) this).field_H[var12] = (byte)var13;
                                    var11++;
                                    continue L7;
                                  } else {
                                    var8++;
                                    continue L6;
                                  }
                                }
                              } else {
                                var8++;
                                continue L6;
                              }
                            }
                          }
                        }
                      }
                      return;
                    }
                  }
                }
                return;
              } else {
                var8 = 0;
                L9: while (true) {
                  if (var8 >= var7) {
                    return;
                  } else {
                    var9 = param1[var8];
                    if (var9 < ((gd) this).field_S.length) {
                      var38 = ((gd) this).field_S[var9];
                      var11 = 0;
                      L10: while (true) {
                        if (var11 < var38.length) {
                          var12 = var38[var11];
                          ((gd) this).field_G[var12] = ((gd) this).field_G[var12] - field_v;
                          ((gd) this).field_o[var12] = ((gd) this).field_o[var12] - field_mb;
                          ((gd) this).field_F[var12] = ((gd) this).field_F[var12] - field_cb;
                          ((gd) this).field_G[var12] = ((gd) this).field_G[var12] * param2 / 128;
                          ((gd) this).field_o[var12] = ((gd) this).field_o[var12] * param3 / 128;
                          ((gd) this).field_F[var12] = ((gd) this).field_F[var12] * param4 / 128;
                          ((gd) this).field_G[var12] = ((gd) this).field_G[var12] + field_v;
                          ((gd) this).field_o[var12] = ((gd) this).field_o[var12] + field_mb;
                          ((gd) this).field_F[var12] = ((gd) this).field_F[var12] + field_cb;
                          var11++;
                          continue L10;
                        } else {
                          var8++;
                          continue L9;
                        }
                      }
                    } else {
                      var8++;
                      continue L9;
                    }
                  }
                }
              }
            } else {
              var8 = 0;
              L11: while (true) {
                if (var8 >= var7) {
                  return;
                } else {
                  var9 = param1[var8];
                  if (var9 < ((gd) this).field_S.length) {
                    var37 = ((gd) this).field_S[var9];
                    var11 = 0;
                    L12: while (true) {
                      if (var11 < var37.length) {
                        L13: {
                          var12 = var37[var11];
                          ((gd) this).field_G[var12] = ((gd) this).field_G[var12] - field_v;
                          ((gd) this).field_o[var12] = ((gd) this).field_o[var12] - field_mb;
                          ((gd) this).field_F[var12] = ((gd) this).field_F[var12] - field_cb;
                          if (param4 == 0) {
                            break L13;
                          } else {
                            var13 = tm.field_n[param4];
                            var14 = tm.field_e[param4];
                            var15 = ((gd) this).field_o[var12] * var13 + ((gd) this).field_G[var12] * var14 + 32767 >> 16;
                            ((gd) this).field_o[var12] = ((gd) this).field_o[var12] * var14 - ((gd) this).field_G[var12] * var13 + 32767 >> 16;
                            ((gd) this).field_G[var12] = var15;
                            break L13;
                          }
                        }
                        L14: {
                          if (param2 == 0) {
                            break L14;
                          } else {
                            var13 = tm.field_n[param2];
                            var14 = tm.field_e[param2];
                            var15 = ((gd) this).field_o[var12] * var14 - ((gd) this).field_F[var12] * var13 + 32767 >> 16;
                            ((gd) this).field_F[var12] = ((gd) this).field_o[var12] * var13 + ((gd) this).field_F[var12] * var14 + 32767 >> 16;
                            ((gd) this).field_o[var12] = var15;
                            break L14;
                          }
                        }
                        L15: {
                          if (param3 == 0) {
                            break L15;
                          } else {
                            var13 = tm.field_n[param3];
                            var14 = tm.field_e[param3];
                            var15 = ((gd) this).field_F[var12] * var13 + ((gd) this).field_G[var12] * var14 + 32767 >> 16;
                            ((gd) this).field_F[var12] = ((gd) this).field_F[var12] * var14 - ((gd) this).field_G[var12] * var13 + 32767 >> 16;
                            ((gd) this).field_G[var12] = var15;
                            break L15;
                          }
                        }
                        ((gd) this).field_G[var12] = ((gd) this).field_G[var12] + field_v;
                        ((gd) this).field_o[var12] = ((gd) this).field_o[var12] + field_mb;
                        ((gd) this).field_F[var12] = ((gd) this).field_F[var12] + field_cb;
                        var11++;
                        continue L12;
                      } else {
                        var8++;
                        continue L11;
                      }
                    }
                  } else {
                    var8++;
                    continue L11;
                  }
                }
              }
            }
          } else {
            var8 = 0;
            L16: while (true) {
              if (var8 >= var7) {
                return;
              } else {
                var9 = param1[var8];
                if (var9 < ((gd) this).field_S.length) {
                  var36 = ((gd) this).field_S[var9];
                  var11 = 0;
                  L17: while (true) {
                    if (var11 < var36.length) {
                      var12 = var36[var11];
                      ((gd) this).field_G[var12] = ((gd) this).field_G[var12] + param2;
                      ((gd) this).field_o[var12] = ((gd) this).field_o[var12] + param3;
                      ((gd) this).field_F[var12] = ((gd) this).field_F[var12] + param4;
                      var11++;
                      continue L17;
                    } else {
                      var8++;
                      continue L16;
                    }
                  }
                } else {
                  var8++;
                  continue L16;
                }
              }
            }
          }
        } else {
          var8 = 0;
          field_v = 0;
          field_mb = 0;
          field_cb = 0;
          var9 = 0;
          L18: while (true) {
            if (var9 >= var7) {
              L19: {
                if (var8 <= 0) {
                  field_v = param2;
                  field_mb = param3;
                  field_cb = param4;
                  break L19;
                } else {
                  field_v = field_v / var8 + param2;
                  field_mb = field_mb / var8 + param3;
                  field_cb = field_cb / var8 + param4;
                  break L19;
                }
              }
              return;
            } else {
              var10 = param1[var9];
              if (var10 < ((gd) this).field_S.length) {
                var35 = ((gd) this).field_S[var10];
                var12 = 0;
                L20: while (true) {
                  if (var12 < var35.length) {
                    var13 = var35[var12];
                    field_v = field_v + ((gd) this).field_G[var13];
                    field_mb = field_mb + ((gd) this).field_o[var13];
                    field_cb = field_cb + ((gd) this).field_F[var13];
                    var8++;
                    var12++;
                    continue L20;
                  } else {
                    var9++;
                    continue L18;
                  }
                }
              } else {
                var9++;
                continue L18;
              }
            }
          }
        }
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
          if (var9 >= ((gd) this).field_p) {
            ((gd) this).field_A = (short)(int)(Math.sqrt((double)var8) + 0.99);
            ((gd) this).field_k = true;
            return;
          } else {
            L1: {
              var10 = ((gd) this).field_G[var9];
              var11 = ((gd) this).field_o[var9];
              var12 = ((gd) this).field_F[var9];
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

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, long param7) {
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
            L1: {
              if (((gd) this).field_k) {
                break L1;
              } else {
                this.d();
                break L1;
              }
            }
            var10_int = tm.field_c;
            var11 = tm.field_j;
            var12 = tm.field_n[param0];
            var13 = tm.field_e[param0];
            var14 = tm.field_n[param1];
            var15 = tm.field_e[param1];
            var16 = tm.field_n[param2];
            var17 = tm.field_e[param2];
            var18 = tm.field_n[param3];
            var19 = tm.field_e[param3];
            var20 = param5 * var18 + param6 * var19 >> 16;
            var21 = 0;
            L2: while (true) {
              if (var21 >= ((gd) this).field_I) {
                L3: {
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
                    break L3;
                  } else {
                    stackOut_14_0 = this;
                    stackOut_14_1 = stackIn_14_1;
                    stackOut_14_2 = 1;
                    stackIn_16_0 = stackOut_14_0;
                    stackIn_16_1 = stackOut_14_1;
                    stackIn_16_2 = stackOut_14_2;
                    break L3;
                  }
                }
                this.a(stackIn_16_1 != 0, stackIn_16_2 != 0, param7, (int) ((gd) this).field_A, ((gd) this).field_A << 1);
                break L0;
              } else {
                L4: {
                  var22 = ((gd) this).field_G[var21];
                  var23 = ((gd) this).field_o[var21];
                  var24 = ((gd) this).field_F[var21];
                  if (param2 == 0) {
                    break L4;
                  } else {
                    var25 = var23 * var16 + var22 * var17 >> 16;
                    var23 = var23 * var17 - var22 * var16 >> 16;
                    var22 = var25;
                    break L4;
                  }
                }
                L5: {
                  if (param0 == 0) {
                    break L5;
                  } else {
                    var25 = var23 * var13 - var24 * var12 >> 16;
                    var24 = var23 * var12 + var24 * var13 >> 16;
                    var23 = var25;
                    break L5;
                  }
                }
                L6: {
                  if (param1 == 0) {
                    break L6;
                  } else {
                    var25 = var24 * var14 + var22 * var15 >> 16;
                    var24 = var24 * var15 - var22 * var14 >> 16;
                    var22 = var25;
                    break L6;
                  }
                }
                L7: {
                  var22 = var22 + param4;
                  var23 = var23 + param5;
                  var24 = var24 + param6;
                  var25 = var23 * var19 - var24 * var18 >> 16;
                  var24 = var23 * var18 + var24 * var19 >> 16;
                  var23 = var25;
                  field_J[var21] = var24 - var20;
                  field_B[var21] = var10_int + (var22 << 9) / var24;
                  field_V[var21] = var11 + (var23 << 9) / var24;
                  if (((gd) this).field_l <= 0) {
                    break L7;
                  } else {
                    field_X[var21] = var22;
                    field_Q[var21] = var23;
                    field_O[var21] = var24;
                    break L7;
                  }
                }
                var21++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var10 = decompiledCaughtException;
            break L8;
          }
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
        int stackIn_76_0 = 0;
        int stackOut_75_0 = 0;
        int stackOut_74_0 = 0;
        if (param4 < 1600) {
          L0: {
            var7 = 0;
            if (field_f) {
              break L0;
            } else {
              var8 = 0;
              L1: while (true) {
                if (var8 >= 1600) {
                  var8 = 0;
                  L2: while (true) {
                    if (var8 >= 32) {
                      field_x = 0;
                      break L0;
                    } else {
                      field_L[var8] = 0;
                      var8++;
                      continue L2;
                    }
                  }
                } else {
                  field_T[var8] = 0;
                  var8++;
                  continue L1;
                }
              }
            }
          }
          var8 = 0;
          L3: while (true) {
            if (var8 >= ((gd) this).field_Y) {
              L4: {
                if (!field_f) {
                  if (((gd) this).field_ob != null) {
                    var8 = 0;
                    L5: while (true) {
                      if (var8 >= 12) {
                        var8 = param4 - 1;
                        L6: while (true) {
                          if (var8 < 0) {
                            break L4;
                          } else {
                            L7: {
                              var9 = field_T[var8];
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
                                var47 = field_U[var8];
                                var12 = 0;
                                L9: while (true) {
                                  if (var12 >= var10) {
                                    break L7;
                                  } else {
                                    var13 = var47[var12];
                                    var14_int = ((gd) this).field_ob[var13];
                                    field_P[var14_int] = field_P[var14_int] + 1;
                                    var15_int = field_P[var14_int];
                                    field_j[var14_int][var15_int] = var13;
                                    if (var14_int >= 10) {
                                      if (var14_int != 10) {
                                        field_M[var15_int] = var8;
                                        var12++;
                                        continue L9;
                                      } else {
                                        field_z[var15_int] = var8;
                                        var12++;
                                        continue L9;
                                      }
                                    } else {
                                      field_h[var14_int] = field_h[var14_int] + var8;
                                      var12++;
                                      continue L9;
                                    }
                                  }
                                }
                              }
                            }
                            if (var9 > 64) {
                              var10 = field_T[var8] - 65;
                              var48 = field_kb[var10];
                              var12 = 0;
                              L10: while (true) {
                                if (var12 < field_L[var10]) {
                                  var13 = var48[var12];
                                  var14_int = ((gd) this).field_ob[var13];
                                  field_P[var14_int] = field_P[var14_int] + 1;
                                  var15_int = field_P[var14_int];
                                  field_j[var14_int][var15_int] = var13;
                                  if (var14_int >= 10) {
                                    if (var14_int != 10) {
                                      field_M[var15_int] = var8;
                                      var12++;
                                      continue L10;
                                    } else {
                                      field_z[var15_int] = var8;
                                      var12++;
                                      continue L10;
                                    }
                                  } else {
                                    field_h[var14_int] = field_h[var14_int] + var8;
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
                        field_P[var8] = 0;
                        field_h[var8] = 0;
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
                          var9 = field_T[var8];
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
                            var45 = field_U[var8];
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
                          var10 = field_T[var8] - 65;
                          var46 = field_kb[var10];
                          var12 = 0;
                          L15: while (true) {
                            if (var12 < field_L[var10]) {
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
                  dk.a(var7 - 1, 0, (byte) -127, field_hb, field_W);
                  if (((gd) this).field_ob != null) {
                    var8 = 0;
                    L16: while (true) {
                      if (var8 >= 12) {
                        var8 = 0;
                        L17: while (true) {
                          if (var8 >= var7) {
                            break L4;
                          } else {
                            var9 = field_W[var8];
                            var10 = field_hb[var8];
                            var11 = ((gd) this).field_ob[var9];
                            field_P[var11] = field_P[var11] + 1;
                            var12 = field_P[var11];
                            field_j[var11][var12] = var9;
                            if (var11 >= 10) {
                              if (var11 != 10) {
                                field_M[var12] = var10;
                                var8++;
                                continue L17;
                              } else {
                                field_z[var12] = var10;
                                var8++;
                                continue L17;
                              }
                            } else {
                              field_h[var11] = field_h[var11] + var10;
                              var8++;
                              continue L17;
                            }
                          }
                        }
                      } else {
                        field_P[var8] = 0;
                        field_h[var8] = 0;
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
                        this.b(field_W[var8]);
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
                  if (field_P[1] > 0) {
                    break L20;
                  } else {
                    if (field_P[2] <= 0) {
                      break L19;
                    } else {
                      break L20;
                    }
                  }
                }
                var8 = (field_h[1] + field_h[2]) / (field_P[1] + field_P[2]);
                break L19;
              }
              L21: {
                L22: {
                  var9 = 0;
                  if (field_P[3] > 0) {
                    break L22;
                  } else {
                    if (field_P[4] <= 0) {
                      break L21;
                    } else {
                      break L22;
                    }
                  }
                }
                var9 = (field_h[3] + field_h[4]) / (field_P[3] + field_P[4]);
                break L21;
              }
              L23: {
                L24: {
                  var10 = 0;
                  if (field_P[6] > 0) {
                    break L24;
                  } else {
                    if (field_P[8] <= 0) {
                      break L23;
                    } else {
                      break L24;
                    }
                  }
                }
                var10 = (field_h[6] + field_h[8]) / (field_P[6] + field_P[8]);
                break L23;
              }
              L25: {
                var12 = 0;
                var13 = field_P[10];
                var14 = field_j[10];
                var15 = field_z;
                if (var12 != var13) {
                  break L25;
                } else {
                  var12 = 0;
                  var13 = field_P[11];
                  var14 = field_j[11];
                  var15 = field_M;
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
                          if (var14 == field_j[11]) {
                            break L29;
                          } else {
                            var12 = 0;
                            var14 = field_j[11];
                            var13 = field_P[11];
                            var15 = field_M;
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
                              if (var14 == field_j[11]) {
                                break L32;
                              } else {
                                var12 = 0;
                                var13 = field_P[11];
                                var14 = field_j[11];
                                var15 = field_M;
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
                                if (var14 == field_j[11]) {
                                  break L35;
                                } else {
                                  var12 = 0;
                                  var13 = field_P[11];
                                  var14 = field_j[11];
                                  var15 = field_M;
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
                                  if (var14 == field_j[11]) {
                                    break L38;
                                  } else {
                                    var12 = 0;
                                    var13 = field_P[11];
                                    var14 = field_j[11];
                                    var15 = field_M;
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
                        var17 = field_P[var16];
                        var49 = field_j[var16];
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
              if (((gd) this).field_R[var8] != -2) {
                L40: {
                  var9 = ((gd) this).field_jb[var8];
                  var10 = ((gd) this).field_bb[var8];
                  var11 = ((gd) this).field_N[var8];
                  var12 = field_B[var9];
                  var13 = field_B[var10];
                  var14_int = field_B[var11];
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
                    var15_int = field_X[var9];
                    var16 = field_X[var10];
                    var17 = field_X[var11];
                    var18 = field_Q[var9];
                    var19 = field_Q[var10];
                    var20 = field_Q[var11];
                    var21 = field_O[var9];
                    var22 = field_O[var10];
                    var23 = field_O[var11];
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
                      if (!field_f) {
                        var27 = (field_J[var9] + field_J[var10] + field_J[var11]) / 3 + param3;
                        if (field_T[var27] >= 64) {
                          L42: {
                            var28 = field_T[var27];
                            if (var28 != 64) {
                              break L42;
                            } else {
                              if (field_x != 512) {
                                field_x = field_x + 1;
                                var28 = 65 + field_x;
                                field_T[var27] = 65 + field_x;
                                break L42;
                              } else {
                                var8++;
                                continue L3;
                              }
                            }
                          }
                          var28 -= 65;
                          field_L[var28] = field_L[var28] + 1;
                          field_kb[var28][field_L[var28]] = var8;
                          var8++;
                          continue L3;
                        } else {
                          field_T[var27] = field_T[var27] + 1;
                          field_U[var27][field_T[var27]] = var8;
                          var8++;
                          continue L3;
                        }
                      } else {
                        field_hb[var7] = (field_J[var9] + field_J[var10] + field_J[var11]) / 3;
                        int incrementValue$11 = var7;
                        var7++;
                        field_W[incrementValue$11] = var8;
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
                    if (!this.a(ot.field_G + tm.field_c, vl.field_j + tm.field_j, field_V[var9], field_V[var10], field_V[var11], var12, var13, var14_int)) {
                      break L43;
                    } else {
                      int fieldTemp$12 = ws.field_O;
                      ws.field_O = ws.field_O + 1;
                      am.field_I[fieldTemp$12] = param2;
                      param1 = false;
                      break L43;
                    }
                  }
                }
                if ((var12 - var13) * (field_V[var11] - field_V[var10]) - (field_V[var9] - field_V[var10]) * (var14_int - var13) > 0) {
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
                            if (var12 > tm.field_l) {
                              break L45;
                            } else {
                              if (var13 > tm.field_l) {
                                break L45;
                              } else {
                                if (var14_int <= tm.field_l) {
                                  field_s[var8] = false;
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
                    field_s[var8] = true;
                    break L44;
                  }
                  if (!field_f) {
                    var15_int = (field_J[var9] + field_J[var10] + field_J[var11]) / 3 + param3;
                    if (field_T[var15_int] >= 64) {
                      L46: {
                        var16 = field_T[var15_int];
                        if (var16 != 64) {
                          break L46;
                        } else {
                          if (field_x != 512) {
                            field_x = field_x + 1;
                            var16 = 65 + field_x;
                            field_T[var15_int] = 65 + field_x;
                            break L46;
                          } else {
                            var8++;
                            continue L3;
                          }
                        }
                      }
                      var16 -= 65;
                      field_L[var16] = field_L[var16] + 1;
                      field_kb[var16][field_L[var16]] = var8;
                      var8++;
                      continue L3;
                    } else {
                      field_T[var15_int] = field_T[var15_int] + 1;
                      field_U[var15_int][field_T[var15_int]] = var8;
                      var8++;
                      continue L3;
                    }
                  } else {
                    field_hb[var7] = (field_J[var9] + field_J[var10] + field_J[var11]) / 3;
                    int incrementValue$13 = var7;
                    var7++;
                    field_W[incrementValue$13] = var8;
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

    public static void c() {
        field_ib = null;
        field_u = null;
        field_C = null;
        field_gb = null;
        field_m = null;
        field_K = null;
        field_s = null;
        field_D = null;
        field_B = null;
        field_V = null;
        field_J = null;
        field_X = null;
        field_Q = null;
        field_O = null;
        field_T = null;
        field_U = null;
        field_L = null;
        field_kb = null;
        field_hb = null;
        field_W = null;
        field_P = null;
        field_j = null;
        field_z = null;
        field_M = null;
        field_h = null;
        field_n = null;
        field_eb = null;
        field_fb = null;
    }

    final void a(int param0, int[] param1, int param2, int param3, int param4, boolean param5, int param6, int[] param7) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int[] var16_ref_int__ = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25_int = 0;
        int[] var25 = null;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29_int = 0;
        int[] var29 = null;
        int var30 = 0;
        int[] var31_ref_int__ = null;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int[] var35 = null;
        int var35_int = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int var42 = 0;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        int var46 = 0;
        int[] var47 = null;
        int[] var50 = null;
        int[] var52 = null;
        int[] var55 = null;
        int[] var61 = null;
        int[] var63 = null;
        int[] var66 = null;
        int[] var72 = null;
        int[] var74 = null;
        int[] var77 = null;
        int[] var81 = null;
        int[] var82 = null;
        int[] var83 = null;
        int[] var84 = null;
        int[] var85 = null;
        int[] var86 = null;
        int[] var87 = null;
        int[] var88 = null;
        int[] var89 = null;
        int[] var90 = null;
        int[] var91 = null;
        var9 = param1.length;
        if (param0 != 0) {
          if (param0 != 1) {
            L0: {
              if (param0 != 2) {
                if (param0 != 3) {
                  L1: {
                    if (param0 != 5) {
                      if (param0 != 7) {
                        return;
                      } else {
                        if (((gd) this).field_i == null) {
                          break L1;
                        } else {
                          var10 = 0;
                          L2: while (true) {
                            if (var10 >= var9) {
                              return;
                            } else {
                              var11 = param1[var10];
                              if (var11 < ((gd) this).field_i.length) {
                                var91 = ((gd) this).field_i[var11];
                                var13 = 0;
                                L3: while (true) {
                                  if (var13 >= var91.length) {
                                    ((gd) this).field_db = true;
                                    var10++;
                                    continue L2;
                                  } else {
                                    L4: {
                                      var14 = var91[var13];
                                      if (((gd) this).field_g == null) {
                                        break L4;
                                      } else {
                                        if ((param6 & ((gd) this).field_g[var14]) != 0) {
                                          break L4;
                                        } else {
                                          var13++;
                                          continue L3;
                                        }
                                      }
                                    }
                                    L5: {
                                      var15 = ((gd) this).field_r[var14] & 65535;
                                      var16 = var15 >> 10 & 63;
                                      var17 = var15 >> 7 & 7;
                                      var18 = var15 & 127;
                                      var16 = var16 + param2 & 63;
                                      var17 = var17 + param3;
                                      if (var17 >= 0) {
                                        if (var17 <= 7) {
                                          break L5;
                                        } else {
                                          var17 = 7;
                                          break L5;
                                        }
                                      } else {
                                        var17 = 0;
                                        break L5;
                                      }
                                    }
                                    L6: {
                                      var18 = var18 + param4;
                                      if (var18 >= 0) {
                                        if (var18 <= 127) {
                                          break L6;
                                        } else {
                                          var18 = 127;
                                          break L6;
                                        }
                                      } else {
                                        var18 = 0;
                                        break L6;
                                      }
                                    }
                                    ((gd) this).field_r[var14] = (short)(var16 << 10 | var17 << 7 | var18);
                                    var13++;
                                    continue L3;
                                  }
                                }
                              } else {
                                var10++;
                                continue L2;
                              }
                            }
                          }
                        }
                      }
                    } else {
                      if (((gd) this).field_i == null) {
                        break L1;
                      } else {
                        L7: {
                          if (((gd) this).field_H == null) {
                            break L7;
                          } else {
                            var10 = 0;
                            L8: while (true) {
                              if (var10 >= var9) {
                                break L7;
                              } else {
                                var11 = param1[var10];
                                if (var11 < ((gd) this).field_i.length) {
                                  var90 = ((gd) this).field_i[var11];
                                  var13 = 0;
                                  L9: while (true) {
                                    if (var13 < var90.length) {
                                      L10: {
                                        var14 = var90[var13];
                                        if (((gd) this).field_g == null) {
                                          break L10;
                                        } else {
                                          if ((param6 & ((gd) this).field_g[var14]) != 0) {
                                            break L10;
                                          } else {
                                            var13++;
                                            continue L9;
                                          }
                                        }
                                      }
                                      L11: {
                                        var15 = (((gd) this).field_H[var14] & 255) + param2 * 8;
                                        if (var15 >= 0) {
                                          if (var15 <= 255) {
                                            break L11;
                                          } else {
                                            var15 = 255;
                                            break L11;
                                          }
                                        } else {
                                          var15 = 0;
                                          break L11;
                                        }
                                      }
                                      ((gd) this).field_H[var14] = (byte)var15;
                                      var13++;
                                      continue L9;
                                    } else {
                                      var10++;
                                      continue L8;
                                    }
                                  }
                                } else {
                                  var10++;
                                  continue L8;
                                }
                              }
                            }
                          }
                        }
                        return;
                      }
                    }
                  }
                  return;
                } else {
                  if (param7 == null) {
                    var10 = 0;
                    L12: while (true) {
                      if (var10 >= var9) {
                        return;
                      } else {
                        var11 = param1[var10];
                        if (var11 < ((gd) this).field_S.length) {
                          var89 = ((gd) this).field_S[var11];
                          var13 = 0;
                          L13: while (true) {
                            if (var13 < var89.length) {
                              L14: {
                                var14 = var89[var13];
                                if (((gd) this).field_e == null) {
                                  break L14;
                                } else {
                                  if ((param6 & ((gd) this).field_e[var14]) != 0) {
                                    break L14;
                                  } else {
                                    var13++;
                                    continue L13;
                                  }
                                }
                              }
                              ((gd) this).field_G[var14] = ((gd) this).field_G[var14] - field_v;
                              ((gd) this).field_o[var14] = ((gd) this).field_o[var14] - field_mb;
                              ((gd) this).field_F[var14] = ((gd) this).field_F[var14] - field_cb;
                              ((gd) this).field_G[var14] = ((gd) this).field_G[var14] * param2 / 128;
                              ((gd) this).field_o[var14] = ((gd) this).field_o[var14] * param3 / 128;
                              ((gd) this).field_F[var14] = ((gd) this).field_F[var14] * param4 / 128;
                              ((gd) this).field_G[var14] = ((gd) this).field_G[var14] + field_v;
                              ((gd) this).field_o[var14] = ((gd) this).field_o[var14] + field_mb;
                              ((gd) this).field_F[var14] = ((gd) this).field_F[var14] + field_cb;
                              var13++;
                              continue L13;
                            } else {
                              var10++;
                              continue L12;
                            }
                          }
                        } else {
                          var10++;
                          continue L12;
                        }
                      }
                    }
                  } else {
                    L15: {
                      var10 = param7[9];
                      var11 = param7[10];
                      var12 = param7[11];
                      var13 = param7[12];
                      var14 = param7[13];
                      var15 = param7[14];
                      if (!field_y) {
                        break L15;
                      } else {
                        var16 = param7[0] * field_v + param7[3] * field_mb + param7[6] * field_cb + 16384 >> 15;
                        var17 = param7[1] * field_v + param7[4] * field_mb + param7[7] * field_cb + 16384 >> 15;
                        var18 = param7[2] * field_v + param7[5] * field_mb + param7[8] * field_cb + 16384 >> 15;
                        var16 = var16 + var13;
                        var17 = var17 + var14;
                        var18 = var18 + var15;
                        field_v = var16;
                        field_mb = var17;
                        field_cb = var18;
                        field_y = false;
                        break L15;
                      }
                    }
                    var16 = param2 << 15 >> 7;
                    var17 = param3 << 15 >> 7;
                    var18 = param4 << 15 >> 7;
                    var19 = var16 * -field_v + 16384 >> 15;
                    var20 = var17 * -field_mb + 16384 >> 15;
                    var21 = var18 * -field_cb + 16384 >> 15;
                    var22 = var19 + field_v;
                    var23 = var20 + field_mb;
                    var24 = var21 + field_cb;
                    var25 = new int[9];
                    var25[0] = var16 * param7[0] + 16384 >> 15;
                    var25[1] = var16 * param7[3] + 16384 >> 15;
                    var25[2] = var16 * param7[6] + 16384 >> 15;
                    var25[3] = var17 * param7[1] + 16384 >> 15;
                    var25[4] = var17 * param7[4] + 16384 >> 15;
                    var25[5] = var17 * param7[7] + 16384 >> 15;
                    var25[6] = var18 * param7[2] + 16384 >> 15;
                    var25[7] = var18 * param7[5] + 16384 >> 15;
                    var25[8] = var18 * param7[8] + 16384 >> 15;
                    var26 = var16 * var13 + 16384 >> 15;
                    var27 = var17 * var14 + 16384 >> 15;
                    var28 = var18 * var15 + 16384 >> 15;
                    var26 = var26 + var22;
                    var27 = var27 + var23;
                    var28 = var28 + var24;
                    var88 = new int[9];
                    var77 = var88;
                    var66 = var77;
                    var55 = var66;
                    var29 = var55;
                    var30 = 0;
                    L16: while (true) {
                      if (var30 >= 3) {
                        var30 = param7[0] * var26 + param7[1] * var27 + param7[2] * var28 + 16384 >> 15;
                        var31 = param7[3] * var26 + param7[4] * var27 + param7[5] * var28 + 16384 >> 15;
                        var32 = param7[6] * var26 + param7[7] * var27 + param7[8] * var28 + 16384 >> 15;
                        var30 = var30 + var10;
                        var31 = var31 + var11;
                        var32 = var32 + var12;
                        var33 = 0;
                        L17: while (true) {
                          if (var33 >= var9) {
                            break L0;
                          } else {
                            var34 = param1[var33];
                            if (var34 < ((gd) this).field_S.length) {
                              var87 = ((gd) this).field_S[var34];
                              var36 = 0;
                              L18: while (true) {
                                if (var36 < var87.length) {
                                  L19: {
                                    var37 = var87[var36];
                                    if (((gd) this).field_e == null) {
                                      break L19;
                                    } else {
                                      if ((param6 & ((gd) this).field_e[var37]) != 0) {
                                        break L19;
                                      } else {
                                        var36++;
                                        continue L18;
                                      }
                                    }
                                  }
                                  var38 = var88[0] * ((gd) this).field_G[var37] + var88[1] * ((gd) this).field_o[var37] + var88[2] * ((gd) this).field_F[var37] + 16384 >> 15;
                                  var39 = var88[3] * ((gd) this).field_G[var37] + var88[4] * ((gd) this).field_o[var37] + var88[5] * ((gd) this).field_F[var37] + 16384 >> 15;
                                  var40 = var88[6] * ((gd) this).field_G[var37] + var88[7] * ((gd) this).field_o[var37] + var88[8] * ((gd) this).field_F[var37] + 16384 >> 15;
                                  var38 = var38 + var30;
                                  var39 = var39 + var31;
                                  var40 = var40 + var32;
                                  ((gd) this).field_G[var37] = var38;
                                  ((gd) this).field_o[var37] = var39;
                                  ((gd) this).field_F[var37] = var40;
                                  var36++;
                                  continue L18;
                                } else {
                                  var33++;
                                  continue L17;
                                }
                              }
                            } else {
                              var33++;
                              continue L17;
                            }
                          }
                        }
                      } else {
                        var31 = 0;
                        L20: while (true) {
                          if (var31 >= 3) {
                            var30++;
                            continue L16;
                          } else {
                            var32 = 0;
                            var33 = 0;
                            L21: while (true) {
                              if (var33 >= 3) {
                                var29[var30 * 3 + var31] = var32 + 16384 >> 15;
                                var31++;
                                continue L20;
                              } else {
                                var32 = var32 + param7[var30 * 3 + var33] * var25[var31 + var33 * 3];
                                var33++;
                                continue L21;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                if (param7 == null) {
                  var10 = 0;
                  L22: while (true) {
                    if (var10 >= var9) {
                      return;
                    } else {
                      var11 = param1[var10];
                      if (var11 < ((gd) this).field_S.length) {
                        var86 = ((gd) this).field_S[var11];
                        var13 = 0;
                        L23: while (true) {
                          if (var13 < var86.length) {
                            L24: {
                              var14 = var86[var13];
                              if (((gd) this).field_e == null) {
                                break L24;
                              } else {
                                if ((param6 & ((gd) this).field_e[var14]) != 0) {
                                  break L24;
                                } else {
                                  var13++;
                                  continue L23;
                                }
                              }
                            }
                            L25: {
                              ((gd) this).field_G[var14] = ((gd) this).field_G[var14] - field_v;
                              ((gd) this).field_o[var14] = ((gd) this).field_o[var14] - field_mb;
                              ((gd) this).field_F[var14] = ((gd) this).field_F[var14] - field_cb;
                              if (param4 == 0) {
                                break L25;
                              } else {
                                var15 = tm.field_n[param4];
                                var16 = tm.field_e[param4];
                                var17 = ((gd) this).field_o[var14] * var15 + ((gd) this).field_G[var14] * var16 + 32767 >> 16;
                                ((gd) this).field_o[var14] = ((gd) this).field_o[var14] * var16 - ((gd) this).field_G[var14] * var15 + 32767 >> 16;
                                ((gd) this).field_G[var14] = var17;
                                break L25;
                              }
                            }
                            L26: {
                              if (param2 == 0) {
                                break L26;
                              } else {
                                var15 = tm.field_n[param2];
                                var16 = tm.field_e[param2];
                                var17 = ((gd) this).field_o[var14] * var16 - ((gd) this).field_F[var14] * var15 + 32767 >> 16;
                                ((gd) this).field_F[var14] = ((gd) this).field_o[var14] * var15 + ((gd) this).field_F[var14] * var16 + 32767 >> 16;
                                ((gd) this).field_o[var14] = var17;
                                break L26;
                              }
                            }
                            L27: {
                              if (param3 == 0) {
                                break L27;
                              } else {
                                var15 = tm.field_n[param3];
                                var16 = tm.field_e[param3];
                                var17 = ((gd) this).field_F[var14] * var15 + ((gd) this).field_G[var14] * var16 + 32767 >> 16;
                                ((gd) this).field_F[var14] = ((gd) this).field_F[var14] * var16 - ((gd) this).field_G[var14] * var15 + 32767 >> 16;
                                ((gd) this).field_G[var14] = var17;
                                break L27;
                              }
                            }
                            ((gd) this).field_G[var14] = ((gd) this).field_G[var14] + field_v;
                            ((gd) this).field_o[var14] = ((gd) this).field_o[var14] + field_mb;
                            ((gd) this).field_F[var14] = ((gd) this).field_F[var14] + field_cb;
                            var13++;
                            continue L23;
                          } else {
                            var10++;
                            continue L22;
                          }
                        }
                      } else {
                        var10++;
                        continue L22;
                      }
                    }
                  }
                } else {
                  L28: {
                    var10 = param7[9];
                    var11 = param7[10];
                    var12 = param7[11];
                    var13 = param7[12];
                    var14 = param7[13];
                    var15 = param7[14];
                    if (!field_y) {
                      break L28;
                    } else {
                      var16 = param7[0] * field_v + param7[3] * field_mb + param7[6] * field_cb + 16384 >> 15;
                      var17 = param7[1] * field_v + param7[4] * field_mb + param7[7] * field_cb + 16384 >> 15;
                      var18 = param7[2] * field_v + param7[5] * field_mb + param7[8] * field_cb + 16384 >> 15;
                      var16 = var16 + var13;
                      var17 = var17 + var14;
                      var18 = var18 + var15;
                      field_v = var16;
                      field_mb = var17;
                      field_cb = var18;
                      field_y = false;
                      break L28;
                    }
                  }
                  var83 = new int[9];
                  var72 = var83;
                  var61 = var72;
                  var50 = var61;
                  var16_ref_int__ = var50;
                  var17 = tm.field_e[param2] >> 1;
                  var18 = tm.field_n[param2] >> 1;
                  var19 = tm.field_e[param3] >> 1;
                  var20 = tm.field_n[param3] >> 1;
                  var21 = tm.field_e[param4] >> 1;
                  var22 = tm.field_n[param4] >> 1;
                  var23 = var18 * var21 + 16384 >> 15;
                  var24 = var18 * var22 + 16384 >> 15;
                  var16_ref_int__[0] = var19 * var21 + var20 * var24 + 16384 >> 15;
                  var16_ref_int__[1] = -var19 * var22 + var20 * var23 + 16384 >> 15;
                  var16_ref_int__[2] = var20 * var17 + 16384 >> 15;
                  var16_ref_int__[3] = var17 * var22 + 16384 >> 15;
                  var16_ref_int__[4] = var17 * var21 + 16384 >> 15;
                  var16_ref_int__[5] = -var18;
                  var16_ref_int__[6] = -var20 * var21 + var19 * var24 + 16384 >> 15;
                  var16_ref_int__[7] = var20 * var22 + var19 * var23 + 16384 >> 15;
                  var16_ref_int__[8] = var19 * var17 + 16384 >> 15;
                  var25_int = var83[0] * -field_v + var83[1] * -field_mb + var83[2] * -field_cb + 16384 >> 15;
                  var26 = var83[3] * -field_v + var83[4] * -field_mb + var83[5] * -field_cb + 16384 >> 15;
                  var27 = var83[6] * -field_v + var83[7] * -field_mb + var83[8] * -field_cb + 16384 >> 15;
                  var28 = var25_int + field_v;
                  var29_int = var26 + field_mb;
                  var30 = var27 + field_cb;
                  var31_ref_int__ = new int[9];
                  var32 = 0;
                  L29: while (true) {
                    if (var32 >= 3) {
                      var32 = var83[0] * var13 + var83[1] * var14 + var83[2] * var15 + 16384 >> 15;
                      var33 = var83[3] * var13 + var83[4] * var14 + var83[5] * var15 + 16384 >> 15;
                      var34 = var83[6] * var13 + var83[7] * var14 + var83[8] * var15 + 16384 >> 15;
                      var32 = var32 + var28;
                      var33 = var33 + var29_int;
                      var34 = var34 + var30;
                      var85 = new int[9];
                      var74 = var85;
                      var63 = var74;
                      var52 = var63;
                      var47 = var52;
                      var35 = var47;
                      var36 = 0;
                      L30: while (true) {
                        if (var36 >= 3) {
                          var36 = param7[0] * var32 + param7[1] * var33 + param7[2] * var34 + 16384 >> 15;
                          var37 = param7[3] * var32 + param7[4] * var33 + param7[5] * var34 + 16384 >> 15;
                          var38 = param7[6] * var32 + param7[7] * var33 + param7[8] * var34 + 16384 >> 15;
                          var36 = var36 + var10;
                          var37 = var37 + var11;
                          var38 = var38 + var12;
                          var39 = 0;
                          L31: while (true) {
                            if (var39 >= var9) {
                              break L0;
                            } else {
                              var40 = param1[var39];
                              if (var40 < ((gd) this).field_S.length) {
                                var84 = ((gd) this).field_S[var40];
                                var42 = 0;
                                L32: while (true) {
                                  if (var42 < var84.length) {
                                    L33: {
                                      var43 = var84[var42];
                                      if (((gd) this).field_e == null) {
                                        break L33;
                                      } else {
                                        if ((param6 & ((gd) this).field_e[var43]) != 0) {
                                          break L33;
                                        } else {
                                          var42++;
                                          continue L32;
                                        }
                                      }
                                    }
                                    var44 = var85[0] * ((gd) this).field_G[var43] + var85[1] * ((gd) this).field_o[var43] + var85[2] * ((gd) this).field_F[var43] + 16384 >> 15;
                                    var45 = var85[3] * ((gd) this).field_G[var43] + var85[4] * ((gd) this).field_o[var43] + var85[5] * ((gd) this).field_F[var43] + 16384 >> 15;
                                    var46 = var85[6] * ((gd) this).field_G[var43] + var85[7] * ((gd) this).field_o[var43] + var85[8] * ((gd) this).field_F[var43] + 16384 >> 15;
                                    var44 = var44 + var36;
                                    var45 = var45 + var37;
                                    var46 = var46 + var38;
                                    ((gd) this).field_G[var43] = var44;
                                    ((gd) this).field_o[var43] = var45;
                                    ((gd) this).field_F[var43] = var46;
                                    var42++;
                                    continue L32;
                                  } else {
                                    var39++;
                                    continue L31;
                                  }
                                }
                              } else {
                                var39++;
                                continue L31;
                              }
                            }
                          }
                        } else {
                          var37 = 0;
                          L34: while (true) {
                            if (var37 >= 3) {
                              var36++;
                              continue L30;
                            } else {
                              var38 = 0;
                              var39 = 0;
                              L35: while (true) {
                                if (var39 >= 3) {
                                  var35[var36 * 3 + var37] = var38 + 16384 >> 15;
                                  var37++;
                                  continue L34;
                                } else {
                                  var38 = var38 + param7[var36 * 3 + var39] * var31_ref_int__[var37 + var39 * 3];
                                  var39++;
                                  continue L35;
                                }
                              }
                            }
                          }
                        }
                      }
                    } else {
                      var33 = 0;
                      L36: while (true) {
                        if (var33 >= 3) {
                          var32++;
                          continue L29;
                        } else {
                          var34 = 0;
                          var35_int = 0;
                          L37: while (true) {
                            if (var35_int >= 3) {
                              var31_ref_int__[var32 * 3 + var33] = var34 + 16384 >> 15;
                              var33++;
                              continue L36;
                            } else {
                              var34 = var34 + var16_ref_int__[var32 * 3 + var35_int] * param7[var33 * 3 + var35_int];
                              var35_int++;
                              continue L37;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
            return;
          } else {
            L38: {
              if (param7 == null) {
                break L38;
              } else {
                var10 = param7[0] * param2 + param7[1] * param3 + param7[2] * param4 + 16384 >> 15;
                var11 = param7[3] * param2 + param7[4] * param3 + param7[5] * param4 + 16384 >> 15;
                var12 = param7[6] * param2 + param7[7] * param3 + param7[8] * param4 + 16384 >> 15;
                param2 = var10;
                param3 = var11;
                param4 = var12;
                break L38;
              }
            }
            var10 = 0;
            L39: while (true) {
              if (var10 >= var9) {
                return;
              } else {
                var11 = param1[var10];
                if (var11 < ((gd) this).field_S.length) {
                  var82 = ((gd) this).field_S[var11];
                  var13 = 0;
                  L40: while (true) {
                    if (var13 < var82.length) {
                      L41: {
                        var14 = var82[var13];
                        if (((gd) this).field_e == null) {
                          break L41;
                        } else {
                          if ((param6 & ((gd) this).field_e[var14]) != 0) {
                            break L41;
                          } else {
                            var13++;
                            continue L40;
                          }
                        }
                      }
                      ((gd) this).field_G[var14] = ((gd) this).field_G[var14] + param2;
                      ((gd) this).field_o[var14] = ((gd) this).field_o[var14] + param3;
                      ((gd) this).field_F[var14] = ((gd) this).field_F[var14] + param4;
                      var13++;
                      continue L40;
                    } else {
                      var10++;
                      continue L39;
                    }
                  }
                } else {
                  var10++;
                  continue L39;
                }
              }
            }
          }
        } else {
          var10 = 0;
          field_v = 0;
          field_mb = 0;
          field_cb = 0;
          var11 = 0;
          L42: while (true) {
            if (var11 >= var9) {
              L43: {
                if (var10 <= 0) {
                  field_v = param2;
                  field_mb = param3;
                  field_cb = param4;
                  break L43;
                } else {
                  field_v = field_v / var10 + param2;
                  field_mb = field_mb / var10 + param3;
                  field_cb = field_cb / var10 + param4;
                  field_y = true;
                  break L43;
                }
              }
              return;
            } else {
              var12 = param1[var11];
              if (var12 < ((gd) this).field_S.length) {
                var81 = ((gd) this).field_S[var12];
                var14 = 0;
                L44: while (true) {
                  if (var14 < var81.length) {
                    L45: {
                      var15 = var81[var14];
                      if (((gd) this).field_e == null) {
                        break L45;
                      } else {
                        if ((param6 & ((gd) this).field_e[var15]) != 0) {
                          break L45;
                        } else {
                          var14++;
                          continue L44;
                        }
                      }
                    }
                    field_v = field_v + ((gd) this).field_G[var15];
                    field_mb = field_mb + ((gd) this).field_o[var15];
                    field_cb = field_cb + ((gd) this).field_F[var15];
                    var10++;
                    var14++;
                    continue L44;
                  } else {
                    var11++;
                    continue L42;
                  }
                }
              } else {
                var11++;
                continue L42;
              }
            }
          }
        }
    }

    private gd() {
        ((gd) this).field_Y = 0;
        ((gd) this).field_l = 0;
        ((gd) this).field_I = 0;
        ((gd) this).field_k = false;
        ((gd) this).field_db = false;
        ((gd) this).field_p = 0;
    }

    gd(js param0, int param1, int param2, int param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var9_ref_int__ = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        wi var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        kg var18 = null;
        kg var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        L0: {
          ((gd) this).field_Y = 0;
          ((gd) this).field_l = 0;
          ((gd) this).field_I = 0;
          ((gd) this).field_k = false;
          ((gd) this).field_db = false;
          ((gd) this).field_p = 0;
          param0.b();
          param0.a();
          ((gd) this).field_I = param0.field_x;
          ((gd) this).field_p = param0.field_v;
          ((gd) this).field_G = param0.field_N;
          ((gd) this).field_o = param0.field_D;
          ((gd) this).field_F = param0.field_u;
          ((gd) this).field_Y = param0.field_O;
          ((gd) this).field_jb = param0.field_q;
          ((gd) this).field_bb = param0.field_o;
          ((gd) this).field_N = param0.field_r;
          ((gd) this).field_ob = param0.field_w;
          ((gd) this).field_H = param0.field_h;
          ((gd) this).field_r = param0.field_i;
          ((gd) this).field_S = param0.field_l;
          ((gd) this).field_i = param0.field_H;
          ((gd) this).field_g = param0.field_A;
          ((gd) this).field_e = param0.field_j;
          var7 = (int)Math.sqrt((double)(param3 * param3 + param4 * param4 + param5 * param5));
          var8 = param2 * var7 >> 8;
          ((gd) this).field_Z = new int[((gd) this).field_Y];
          ((gd) this).field_t = new int[((gd) this).field_Y];
          ((gd) this).field_R = new int[((gd) this).field_Y];
          if (param0.field_B == null) {
            ((gd) this).field_ab = null;
            break L0;
          } else {
            ((gd) this).field_ab = new short[((gd) this).field_Y];
            var9 = 0;
            L1: while (true) {
              if (var9 >= ((gd) this).field_Y) {
                break L0;
              } else {
                L2: {
                  var10 = param0.field_B[var9];
                  if (var10 == -1) {
                    break L2;
                  } else {
                    if (!tm.field_o.a(true, var10)) {
                      break L2;
                    } else {
                      ((gd) this).field_ab[var9] = (short)var10;
                      var9++;
                      continue L1;
                    }
                  }
                }
                ((gd) this).field_ab[var9] = (short) -1;
                var9++;
                continue L1;
              }
            }
          }
        }
        L3: {
          if (param0.field_E <= 0) {
            break L3;
          } else {
            if (param0.field_G == null) {
              break L3;
            } else {
              var22 = new int[param0.field_E];
              var21 = var22;
              var20 = var21;
              var17 = var20;
              var9_ref_int__ = var17;
              var10 = 0;
              L4: while (true) {
                if (var10 >= ((gd) this).field_Y) {
                  ((gd) this).field_l = 0;
                  var10 = 0;
                  L5: while (true) {
                    if (var10 >= param0.field_E) {
                      ((gd) this).field_nb = new int[((gd) this).field_l];
                      ((gd) this).field_q = new int[((gd) this).field_l];
                      ((gd) this).field_w = new int[((gd) this).field_l];
                      var10 = 0;
                      var11 = 0;
                      L6: while (true) {
                        if (var11 >= param0.field_E) {
                          ((gd) this).field_lb = new byte[((gd) this).field_Y];
                          var11 = 0;
                          L7: while (true) {
                            if (var11 >= ((gd) this).field_Y) {
                              break L3;
                            } else {
                              if (param0.field_G[var11] == -1) {
                                ((gd) this).field_lb[var11] = (byte) -1;
                                var11++;
                                continue L7;
                              } else {
                                ((gd) this).field_lb[var11] = (byte)var9_ref_int__[param0.field_G[var11] & 255];
                                if (((gd) this).field_lb[var11] == -1) {
                                  if (((gd) this).field_ab != null) {
                                    ((gd) this).field_ab[var11] = (short) -1;
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
                              if (param0.field_t[var11] != 0) {
                                break L8;
                              } else {
                                ((gd) this).field_nb[var10] = param0.field_M[var11] & 65535;
                                ((gd) this).field_q[var10] = param0.field_n[var11] & 65535;
                                ((gd) this).field_w[var10] = param0.field_C[var11] & 65535;
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
                        if (param0.field_t[var10] == 0) {
                          ((gd) this).field_l = ((gd) this).field_l + 1;
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
                  if (param0.field_G[var10] != -1) {
                    var9_ref_int__[param0.field_G[var10] & 255] = var9_ref_int__[param0.field_G[var10] & 255] + 1;
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
          if (var16 >= ((gd) this).field_Y) {
            return;
          } else {
            L10: {
              if (param0.field_p != null) {
                var10 = param0.field_p[var16];
                break L10;
              } else {
                var10 = 0;
                break L10;
              }
            }
            L11: {
              if (param0.field_h != null) {
                var11 = param0.field_h[var16];
                break L11;
              } else {
                var11 = 0;
                break L11;
              }
            }
            L12: {
              if (((gd) this).field_ab != null) {
                var12 = ((gd) this).field_ab[var16];
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
                  ((gd) this).field_R[var16] = -2;
                  var16++;
                  continue L9;
                } else {
                  var19 = param0.field_L[var16];
                  var14 = param1 + (param3 * var19.field_b + param4 * var19.field_a + param5 * var19.field_e) / (var8 + var8 / 2);
                  ((gd) this).field_Z[var16] = gd.d(var14);
                  ((gd) this).field_R[var16] = -1;
                  var16++;
                  continue L9;
                }
              } else {
                L15: {
                  L16: {
                    if (param0.field_g == null) {
                      break L16;
                    } else {
                      if (param0.field_g[((gd) this).field_jb[var16]] == null) {
                        break L16;
                      } else {
                        var13 = param0.field_g[((gd) this).field_jb[var16]];
                        break L15;
                      }
                    }
                  }
                  var13 = param0.field_y[((gd) this).field_jb[var16]];
                  break L15;
                }
                L17: {
                  L18: {
                    var14 = param1 + (param3 * var13.field_d + param4 * var13.field_e + param5 * var13.field_b) / (var8 * var13.field_g);
                    ((gd) this).field_Z[var16] = gd.d(var14);
                    if (param0.field_g == null) {
                      break L18;
                    } else {
                      if (param0.field_g[((gd) this).field_bb[var16]] == null) {
                        break L18;
                      } else {
                        var13 = param0.field_g[((gd) this).field_bb[var16]];
                        break L17;
                      }
                    }
                  }
                  var13 = param0.field_y[((gd) this).field_bb[var16]];
                  break L17;
                }
                L19: {
                  L20: {
                    var14 = param1 + (param3 * var13.field_d + param4 * var13.field_e + param5 * var13.field_b) / (var8 * var13.field_g);
                    ((gd) this).field_t[var16] = gd.d(var14);
                    if (param0.field_g == null) {
                      break L20;
                    } else {
                      if (param0.field_g[((gd) this).field_N[var16]] == null) {
                        break L20;
                      } else {
                        var13 = param0.field_g[((gd) this).field_N[var16]];
                        break L19;
                      }
                    }
                  }
                  var13 = param0.field_y[((gd) this).field_N[var16]];
                  break L19;
                }
                var14 = param1 + (param3 * var13.field_d + param4 * var13.field_e + param5 * var13.field_b) / (var8 * var13.field_g);
                ((gd) this).field_R[var16] = gd.d(var14);
                var16++;
                continue L9;
              }
            } else {
              if (var10 != 0) {
                if (var10 != 1) {
                  if (var10 != 3) {
                    ((gd) this).field_R[var16] = -2;
                    var16++;
                    continue L9;
                  } else {
                    ((gd) this).field_Z[var16] = 128;
                    ((gd) this).field_R[var16] = -1;
                    var16++;
                    continue L9;
                  }
                } else {
                  var18 = param0.field_L[var16];
                  var14 = param1 + (param3 * var18.field_b + param4 * var18.field_a + param5 * var18.field_e) / (var8 + var8 / 2) << 17;
                  ((gd) this).field_Z[var16] = var14 | gd.a(param0.field_i[var16] & 65535, var14 >> 17);
                  ((gd) this).field_R[var16] = -1;
                  var16++;
                  continue L9;
                }
              } else {
                L21: {
                  L22: {
                    var15 = param0.field_i[var16] & 65535;
                    if (param0.field_g == null) {
                      break L22;
                    } else {
                      if (param0.field_g[((gd) this).field_jb[var16]] == null) {
                        break L22;
                      } else {
                        var13 = param0.field_g[((gd) this).field_jb[var16]];
                        break L21;
                      }
                    }
                  }
                  var13 = param0.field_y[((gd) this).field_jb[var16]];
                  break L21;
                }
                L23: {
                  L24: {
                    var14 = param1 + (param3 * var13.field_d + param4 * var13.field_e + param5 * var13.field_b) / (var8 * var13.field_g) << 17;
                    ((gd) this).field_Z[var16] = var14 | gd.a(var15, var14 >> 17);
                    if (param0.field_g == null) {
                      break L24;
                    } else {
                      if (param0.field_g[((gd) this).field_bb[var16]] == null) {
                        break L24;
                      } else {
                        var13 = param0.field_g[((gd) this).field_bb[var16]];
                        break L23;
                      }
                    }
                  }
                  var13 = param0.field_y[((gd) this).field_bb[var16]];
                  break L23;
                }
                L25: {
                  L26: {
                    var14 = param1 + (param3 * var13.field_d + param4 * var13.field_e + param5 * var13.field_b) / (var8 * var13.field_g) << 17;
                    ((gd) this).field_t[var16] = var14 | gd.a(var15, var14 >> 17);
                    if (param0.field_g == null) {
                      break L26;
                    } else {
                      if (param0.field_g[((gd) this).field_N[var16]] == null) {
                        break L26;
                      } else {
                        var13 = param0.field_g[((gd) this).field_N[var16]];
                        break L25;
                      }
                    }
                  }
                  var13 = param0.field_y[((gd) this).field_N[var16]];
                  break L25;
                }
                var14 = param1 + (param3 * var13.field_d + param4 * var13.field_e + param5 * var13.field_b) / (var8 * var13.field_g) << 17;
                ((gd) this).field_R[var16] = var14 | gd.a(var15, var14 >> 17);
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
        field_ib = new gd();
        field_gb = new int[1];
        field_u = new byte[1];
        field_C = new short[1];
        field_K = new int[1];
        field_m = new int[1];
        gd discarded$0 = new gd();
        gd discarded$1 = new gd();
        field_y = false;
        field_M = new int[4096];
        field_eb = new int[10];
        field_h = new int[12];
        field_V = new int[4096];
        field_s = new boolean[4096];
        field_P = new int[12];
        field_D = new boolean[4096];
        field_z = new int[4096];
        field_n = new int[10];
        field_X = new int[4096];
        field_x = 0;
        field_f = false;
        field_B = new int[4096];
        field_J = new int[4096];
        field_O = new int[4096];
        field_Q = new int[4096];
        field_j = new int[12][4096];
        if (field_f) {
            field_hb = new int[4096];
            field_W = new int[4096];
        } else {
            field_T = new int[1600];
            field_U = new int[1600][64];
            field_L = new int[32];
            field_kb = new int[32][512];
        }
        field_fb = new int[10];
    }
}
