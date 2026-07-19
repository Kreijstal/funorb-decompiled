/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ob extends fc {
    int[] field_V;
    int[] field_A;
    int field_ib;
    int[] field_kb;
    private short[] field_y;
    int[] field_k;
    int field_ob;
    int[] field_j;
    private short[] field_T;
    int field_E;
    int[] field_I;
    byte[] field_eb;
    private static ob field_o;
    short[] field_J;
    byte field_K;
    int[] field_M;
    private int[][] field_R;
    private boolean field_i;
    short[] field_r;
    private short field_m;
    int[] field_t;
    private boolean field_s;
    int field_nb;
    int[] field_gb;
    byte[] field_U;
    int[] field_hb;
    private static short[] field_h;
    byte[] field_u;
    private static byte[] field_cb;
    int[] field_Y;
    private static int[] field_n;
    private static int[] field_jb;
    private static int[] field_O;
    private int[][] field_B;
    int[] field_p;
    private static boolean field_Z;
    private static int[] field_x;
    private static int[] field_bb;
    private static int field_v;
    private static int[] field_C;
    private static int[] field_S;
    private static int[][] field_ab;
    private static int[] field_w;
    private static int[][] field_g;
    private static boolean[] field_Q;
    private static int[] field_q;
    private static int[] field_H;
    private static int field_fb;
    private static boolean[] field_l;
    private static int[][] field_f;
    private static int[] field_D;
    private static int[] field_z;
    private static boolean field_mb;
    private static int field_X;
    private static int[] field_W;
    private static int[] field_lb;
    private static int[] field_F;
    private static int field_N;
    private static int[] field_P;
    private static int[] field_db;
    private static int[] field_G;
    private static int[] field_pb;
    private static int[] field_L;

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
          if (this.field_s) {
            break L0;
          } else {
            this.e();
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
        if (var5 >= 50 - this.field_m) {
          var15 = this.field_m * 92682 >> 16;
          if (var3 >= -var5 - var15) {
            if (var3 <= var5 + var15) {
              if (var4 >= -var5 - var15) {
                if (var4 <= var5 + var15) {
                  L1: {
                    if (var5 > 50 + this.field_m) {
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
                      if (this.field_E > 0) {
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
                  var18 = vn.field_a;
                  var19 = vn.field_f;
                  var20 = 0;
                  var27 = 0;
                  var21_int = var27;
                  L3: while (true) {
                    if (var27 >= this.field_ib) {
                      try {
                        L4: {
                          this.a((var20 & var16) != 0, false, 0L, (int) this.field_m, this.field_m << 1);
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
                        var22 = this.field_t[var27];
                        var23 = this.field_V[var27];
                        var24 = this.field_gb[var27];
                        var25 = var22 * var6 + var23 * var9 + var24 * var12 >> 16;
                        var26 = var22 * var7 + var23 * var10 + var24 * var13 >> 16;
                        var24 = var22 * var8 + var23 * var11 + var24 * var14 >> 16;
                        var22 = var25;
                        var23 = var26;
                        field_S[var27] = var24;
                        var22 = var22 + var3;
                        var23 = var23 + var4;
                        var24 = var24 + var5;
                        if (var24 < 50) {
                          field_bb[var27] = -5000;
                          var20 = 1;
                          break L6;
                        } else {
                          field_bb[var27] = var18 + (var22 << 9) / var24;
                          field_G[var27] = var19 + (var23 << 9) / var24;
                          break L6;
                        }
                      }
                      if (var17 != 0) {
                        field_F[var27] = var22;
                        field_db[var27] = var23;
                        field_q[var27] = var24;
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

    final boolean a() {
        if (this.field_B == null) {
            return false;
        }
        field_N = 0;
        field_v = 0;
        field_fb = 0;
        return true;
    }

    private final void d(int param0) {
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
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
          var2 = vn.field_a;
          var3 = vn.field_f;
          var4 = 0;
          var5 = this.field_kb[param0];
          var6 = this.field_A[param0];
          var7 = this.field_p[param0];
          var8 = field_q[var5];
          var9 = field_q[var6];
          var10 = field_q[var7];
          if (this.field_eb != null) {
            vn.field_i = this.field_eb[param0] & 255;
            break L0;
          } else {
            vn.field_i = 0;
            break L0;
          }
        }
        L1: {
          if (var8 < 50) {
            L2: {
              var11 = field_F[var5];
              var12 = field_db[var5];
              var13 = this.field_hb[param0] & 65535;
              if (var10 < 50) {
                break L2;
              } else {
                var14 = (50 - var8) * vn.field_q[var10 - var8];
                field_L[var4] = var2 + (var11 + ((field_F[var7] - var11) * var14 >> 16) << 9) / 50;
                field_x[var4] = var3 + (var12 + ((field_db[var7] - var12) * var14 >> 16) << 9) / 50;
                incrementValue$9 = var4;
                var4++;
                field_w[incrementValue$9] = var13 + (((this.field_j[param0] & 65535) - var13) * var14 >> 16);
                break L2;
              }
            }
            if (var9 < 50) {
              break L1;
            } else {
              var14 = (50 - var8) * vn.field_q[var9 - var8];
              field_L[var4] = var2 + (var11 + ((field_F[var6] - var11) * var14 >> 16) << 9) / 50;
              field_x[var4] = var3 + (var12 + ((field_db[var6] - var12) * var14 >> 16) << 9) / 50;
              incrementValue$10 = var4;
              var4++;
              field_w[incrementValue$10] = var13 + (((this.field_M[param0] & 65535) - var13) * var14 >> 16);
              break L1;
            }
          } else {
            field_L[var4] = field_bb[var5];
            field_x[var4] = field_G[var5];
            incrementValue$11 = var4;
            var4++;
            field_w[incrementValue$11] = this.field_hb[param0] & 65535;
            break L1;
          }
        }
        L3: {
          if (var9 < 50) {
            L4: {
              var11 = field_F[var6];
              var12 = field_db[var6];
              var13 = this.field_M[param0] & 65535;
              if (var8 < 50) {
                break L4;
              } else {
                var14 = (50 - var9) * vn.field_q[var8 - var9];
                field_L[var4] = var2 + (var11 + ((field_F[var5] - var11) * var14 >> 16) << 9) / 50;
                field_x[var4] = var3 + (var12 + ((field_db[var5] - var12) * var14 >> 16) << 9) / 50;
                incrementValue$12 = var4;
                var4++;
                field_w[incrementValue$12] = var13 + (((this.field_hb[param0] & 65535) - var13) * var14 >> 16);
                break L4;
              }
            }
            if (var10 < 50) {
              break L3;
            } else {
              var14 = (50 - var9) * vn.field_q[var10 - var9];
              field_L[var4] = var2 + (var11 + ((field_F[var7] - var11) * var14 >> 16) << 9) / 50;
              field_x[var4] = var3 + (var12 + ((field_db[var7] - var12) * var14 >> 16) << 9) / 50;
              incrementValue$13 = var4;
              var4++;
              field_w[incrementValue$13] = var13 + (((this.field_j[param0] & 65535) - var13) * var14 >> 16);
              break L3;
            }
          } else {
            field_L[var4] = field_bb[var6];
            field_x[var4] = field_G[var6];
            incrementValue$14 = var4;
            var4++;
            field_w[incrementValue$14] = this.field_M[param0] & 65535;
            break L3;
          }
        }
        L5: {
          if (var10 < 50) {
            L6: {
              var11 = field_F[var7];
              var12 = field_db[var7];
              var13 = this.field_j[param0] & 65535;
              if (var9 < 50) {
                break L6;
              } else {
                var14 = (50 - var10) * vn.field_q[var9 - var10];
                field_L[var4] = var2 + (var11 + ((field_F[var6] - var11) * var14 >> 16) << 9) / 50;
                field_x[var4] = var3 + (var12 + ((field_db[var6] - var12) * var14 >> 16) << 9) / 50;
                incrementValue$15 = var4;
                var4++;
                field_w[incrementValue$15] = var13 + (((this.field_M[param0] & 65535) - var13) * var14 >> 16);
                break L6;
              }
            }
            if (var8 < 50) {
              break L5;
            } else {
              var14 = (50 - var10) * vn.field_q[var8 - var10];
              field_L[var4] = var2 + (var11 + ((field_F[var5] - var11) * var14 >> 16) << 9) / 50;
              field_x[var4] = var3 + (var12 + ((field_db[var5] - var12) * var14 >> 16) << 9) / 50;
              incrementValue$16 = var4;
              var4++;
              field_w[incrementValue$16] = var13 + (((this.field_hb[param0] & 65535) - var13) * var14 >> 16);
              break L5;
            }
          } else {
            field_L[var4] = field_bb[var7];
            field_x[var4] = field_G[var7];
            incrementValue$17 = var4;
            var4++;
            field_w[incrementValue$17] = this.field_j[param0] & 65535;
            break L5;
          }
        }
        L7: {
          var11 = field_L[0];
          var12 = field_L[1];
          var13 = field_L[2];
          var14 = field_x[0];
          var15 = field_x[1];
          var16 = field_x[2];
          vn.field_e = false;
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
                      if (var11 > vn.field_k) {
                        break L9;
                      } else {
                        if (var12 > vn.field_k) {
                          break L9;
                        } else {
                          if (var13 <= vn.field_k) {
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
              vn.field_e = true;
              break L8;
            }
            L10: {
              if (this.field_r == null) {
                break L10;
              } else {
                if (this.field_r[param0] != -1) {
                  L11: {
                    L12: {
                      if (this.field_u == null) {
                        break L12;
                      } else {
                        if (this.field_u[param0] == -1) {
                          break L12;
                        } else {
                          var20 = this.field_u[param0] & 255;
                          var17 = this.field_k[var20];
                          var18 = this.field_I[var20];
                          var19 = this.field_Y[var20];
                          break L11;
                        }
                      }
                    }
                    var17 = var5;
                    var18 = var6;
                    var19 = var7;
                    break L11;
                  }
                  if (this.field_j[param0] != -1) {
                    vn.a(var14, var15, var16, var11, var12, var13, field_w[0], field_w[1], field_w[2], field_F[var17], field_F[var18], field_F[var19], field_db[var17], field_db[var18], field_db[var19], field_q[var17], field_q[var18], field_q[var19], (int) this.field_r[param0]);
                    break L7;
                  } else {
                    vn.a(var14, var15, var16, var11, var12, var13, this.field_hb[param0], this.field_hb[param0], this.field_hb[param0], field_F[var17], field_F[var18], field_F[var19], field_db[var17], field_db[var18], field_db[var19], field_q[var17], field_q[var18], field_q[var19], (int) this.field_r[param0]);
                    break L7;
                  }
                } else {
                  break L10;
                }
              }
            }
            if (this.field_j[param0] != -1) {
              vn.a(var14, var15, var16, var11, var12, var13, field_w[0], field_w[1], field_w[2]);
              break L7;
            } else {
              vn.a(var14, var15, var16, var11, var12, var13, vn.field_m[this.field_hb[param0] & 65535]);
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
                    if (var11 > vn.field_k) {
                      break L14;
                    } else {
                      if (var12 > vn.field_k) {
                        break L14;
                      } else {
                        if (var13 > vn.field_k) {
                          break L14;
                        } else {
                          if (field_L[3] < 0) {
                            break L14;
                          } else {
                            if (field_L[3] <= vn.field_k) {
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
            vn.field_e = true;
            break L13;
          }
          L15: {
            L16: {
              if (this.field_r == null) {
                break L16;
              } else {
                if (this.field_r[param0] != -1) {
                  L17: {
                    L18: {
                      if (this.field_u == null) {
                        break L18;
                      } else {
                        if (this.field_u[param0] == -1) {
                          break L18;
                        } else {
                          var20 = this.field_u[param0] & 255;
                          var17 = this.field_k[var20];
                          var18 = this.field_I[var20];
                          var19 = this.field_Y[var20];
                          break L17;
                        }
                      }
                    }
                    var17 = var5;
                    var18 = var6;
                    var19 = var7;
                    break L17;
                  }
                  var20 = this.field_r[param0];
                  if (this.field_j[param0] != -1) {
                    vn.a(var14, var15, var16, var11, var12, var13, field_w[0], field_w[1], field_w[2], field_F[var17], field_F[var18], field_F[var19], field_db[var17], field_db[var18], field_db[var19], field_q[var17], field_q[var18], field_q[var19], var20);
                    vn.a(var14, var16, field_x[3], var11, var13, field_L[3], field_w[0], field_w[2], field_w[3], field_F[var17], field_F[var18], field_F[var19], field_db[var17], field_db[var18], field_db[var19], field_q[var17], field_q[var18], field_q[var19], var20);
                    break L15;
                  } else {
                    vn.a(var14, var15, var16, var11, var12, var13, this.field_hb[param0], this.field_hb[param0], this.field_hb[param0], field_F[var17], field_F[var18], field_F[var19], field_db[var17], field_db[var18], field_db[var19], field_q[var17], field_q[var18], field_q[var19], var20);
                    vn.a(var14, var16, field_x[3], var11, var13, field_L[3], this.field_hb[param0], this.field_hb[param0], this.field_hb[param0], field_F[var17], field_F[var18], field_F[var19], field_db[var17], field_db[var18], field_db[var19], field_q[var17], field_q[var18], field_q[var19], var20);
                    break L15;
                  }
                } else {
                  break L16;
                }
              }
            }
            if (this.field_j[param0] != -1) {
              vn.a(var14, var15, var16, var11, var12, var13, field_w[0], field_w[1], field_w[2]);
              vn.a(var14, var16, field_x[3], var11, var13, field_L[3], field_w[0], field_w[2], field_w[3]);
              break L15;
            } else {
              var17 = vn.field_m[this.field_hb[param0] & 65535];
              vn.a(var14, var15, var16, var11, var12, var13, var17);
              vn.a(var14, var16, field_x[3], var11, var13, field_L[3], var17);
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
        int var4 = 0;
        int stackIn_5_0 = 0;
        int stackOut_4_0 = 0;
        short stackOut_3_0 = 0;
        var4 = 0;
        L0: while (true) {
          if (var4 >= this.field_ob) {
            return;
          } else {
            L1: {
              if (this.field_r == null) {
                stackOut_4_0 = -1;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = this.field_r[var4];
                stackIn_5_0 = stackOut_3_0;
                break L1;
              }
            }
            var3 = stackIn_5_0;
            if (var3 == -1) {
              var1 = this.field_J[var4] & 65535;
              if (this.field_j[var4] != -1) {
                if (this.field_j[var4] != -2) {
                  var2 = this.field_hb[var4] & -131072;
                  this.field_hb[var4] = var2 | ob.a(var1, var2 >> 17);
                  var2 = this.field_M[var4] & -131072;
                  this.field_M[var4] = var2 | ob.a(var1, var2 >> 17);
                  var2 = this.field_j[var4] & -131072;
                  this.field_j[var4] = var2 | ob.a(var1, var2 >> 17);
                  var4++;
                  continue L0;
                } else {
                  var4++;
                  continue L0;
                }
              } else {
                var2 = this.field_hb[var4] & -131072;
                this.field_hb[var4] = var2 | ob.a(var1, var2 >> 17);
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

    private final fc a(boolean param0, boolean param1, ob param2, byte[] param3, short[] param4, int[] param5, int[] param6, int[] param7) {
        int var9 = 0;
        L0: {
          L1: {
            param2.field_ib = this.field_ib;
            param2.field_nb = this.field_nb;
            param2.field_ob = this.field_ob;
            param2.field_E = this.field_E;
            if (param2.field_t == null) {
              break L1;
            } else {
              if (param2.field_t.length >= this.field_ib) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          param2.field_t = new int[this.field_ib + 100];
          param2.field_V = new int[this.field_ib + 100];
          param2.field_gb = new int[this.field_ib + 100];
          break L0;
        }
        var9 = 0;
        L2: while (true) {
          if (var9 >= this.field_ib) {
            L3: {
              if (!param0) {
                param2.field_eb = param3;
                if (this.field_eb != null) {
                  var9 = 0;
                  L4: while (true) {
                    if (var9 >= this.field_ob) {
                      break L3;
                    } else {
                      param2.field_eb[var9] = this.field_eb[var9];
                      var9++;
                      continue L4;
                    }
                  }
                } else {
                  var9 = 0;
                  L5: while (true) {
                    if (var9 >= this.field_ob) {
                      break L3;
                    } else {
                      param2.field_eb[var9] = (byte) 0;
                      var9++;
                      continue L5;
                    }
                  }
                }
              } else {
                param2.field_eb = this.field_eb;
                break L3;
              }
            }
            L6: {
              if (!param1) {
                param2.field_J = param4;
                param2.field_hb = param5;
                param2.field_M = param6;
                param2.field_j = param7;
                var9 = 0;
                L7: while (true) {
                  if (var9 >= this.field_ob) {
                    break L6;
                  } else {
                    param2.field_J[var9] = this.field_J[var9];
                    param2.field_hb[var9] = this.field_hb[var9];
                    param2.field_M[var9] = this.field_M[var9];
                    param2.field_j[var9] = this.field_j[var9];
                    var9++;
                    continue L7;
                  }
                }
              } else {
                param2.field_J = this.field_J;
                param2.field_hb = this.field_hb;
                param2.field_M = this.field_M;
                param2.field_j = this.field_j;
                break L6;
              }
            }
            param2.field_kb = this.field_kb;
            param2.field_A = this.field_A;
            param2.field_p = this.field_p;
            param2.field_U = this.field_U;
            param2.field_u = this.field_u;
            param2.field_r = this.field_r;
            param2.field_K = this.field_K;
            param2.field_k = this.field_k;
            param2.field_I = this.field_I;
            param2.field_Y = this.field_Y;
            param2.field_B = this.field_B;
            param2.field_R = this.field_R;
            param2.field_T = this.field_T;
            param2.field_y = this.field_y;
            param2.field_s = false;
            return (fc) ((Object) param2);
          } else {
            param2.field_t[var9] = this.field_t[var9];
            param2.field_V[var9] = this.field_V[var9];
            param2.field_gb[var9] = this.field_gb[var9];
            var9++;
            continue L2;
          }
        }
    }

    final void a(int[] param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        for (var2 = 0; var2 < this.field_ib; var2++) {
            var3 = this.field_t[var2];
            var4 = this.field_V[var2];
            var5 = this.field_gb[var2];
            this.field_t[var2] = param0[0] + (var3 * param0[3] + var4 * param0[6] + var5 * param0[9] >> 16);
            this.field_V[var2] = param0[1] + (var3 * param0[4] + var4 * param0[7] + var5 * param0[10] >> 16);
            this.field_gb[var2] = param0[2] + (var3 * param0[5] + var4 * param0[8] + var5 * param0[11] >> 16);
        }
        this.field_s = false;
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

    public static void d() {
        field_o = null;
        field_cb = null;
        field_h = null;
        field_O = null;
        field_n = null;
        field_jb = null;
        field_Q = null;
        field_l = null;
        field_bb = null;
        field_G = null;
        field_S = null;
        field_F = null;
        field_db = null;
        field_q = null;
        field_H = null;
        field_ab = (int[][]) null;
        field_P = null;
        field_f = (int[][]) null;
        field_pb = null;
        field_z = null;
        field_W = null;
        field_g = (int[][]) null;
        field_D = null;
        field_C = null;
        field_lb = null;
        field_L = null;
        field_x = null;
        field_w = null;
    }

    final fc a(boolean param0, boolean param1, boolean param2) {
        if (!param0) {
            if (field_cb.length < this.field_ob) {
                field_cb = new byte[this.field_ob + 100];
            }
        }
        if (!param1) {
            if (field_h.length < this.field_ob) {
                field_O = new int[this.field_ob + 100];
                field_n = new int[this.field_ob + 100];
                field_jb = new int[this.field_ob + 100];
                field_h = new short[this.field_ob + 100];
            }
        }
        return this.a(param0, param1, field_o, field_cb, field_h, field_O, field_n, field_jb);
    }

    private final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (!field_l[param0]) {
          L0: {
            var2 = this.field_kb[param0];
            var3 = this.field_A[param0];
            var4 = this.field_p[param0];
            vn.field_e = field_Q[param0];
            if (this.field_eb != null) {
              vn.field_i = this.field_eb[param0] & 255;
              break L0;
            } else {
              vn.field_i = 0;
              break L0;
            }
          }
          L1: {
            L2: {
              if (this.field_r == null) {
                break L2;
              } else {
                if (this.field_r[param0] != -1) {
                  L3: {
                    L4: {
                      if (this.field_u == null) {
                        break L4;
                      } else {
                        if (this.field_u[param0] == -1) {
                          break L4;
                        } else {
                          var8 = this.field_u[param0] & 255;
                          var5 = this.field_k[var8];
                          var6 = this.field_I[var8];
                          var7 = this.field_Y[var8];
                          break L3;
                        }
                      }
                    }
                    var5 = var2;
                    var6 = var3;
                    var7 = var4;
                    break L3;
                  }
                  if (this.field_j[param0] != -1) {
                    vn.a(field_G[var2], field_G[var3], field_G[var4], field_bb[var2], field_bb[var3], field_bb[var4], this.field_hb[param0], this.field_M[param0], this.field_j[param0], field_F[var5], field_F[var6], field_F[var7], field_db[var5], field_db[var6], field_db[var7], field_q[var5], field_q[var6], field_q[var7], (int) this.field_r[param0]);
                    break L1;
                  } else {
                    vn.a(field_G[var2], field_G[var3], field_G[var4], field_bb[var2], field_bb[var3], field_bb[var4], this.field_hb[param0], this.field_hb[param0], this.field_hb[param0], field_F[var5], field_F[var6], field_F[var7], field_db[var5], field_db[var6], field_db[var7], field_q[var5], field_q[var6], field_q[var7], (int) this.field_r[param0]);
                    break L1;
                  }
                } else {
                  break L2;
                }
              }
            }
            if (this.field_j[param0] != -1) {
              vn.a(field_G[var2], field_G[var3], field_G[var4], field_bb[var2], field_bb[var3], field_bb[var4], this.field_hb[param0] & 65535, this.field_M[param0] & 65535, this.field_j[param0] & 65535);
              break L1;
            } else {
              vn.a(field_G[var2], field_G[var3], field_G[var4], field_bb[var2], field_bb[var3], field_bb[var4], vn.field_m[this.field_hb[param0] & 65535]);
              break L1;
            }
          }
          return;
        } else {
          this.d(param0);
          return;
        }
    }

    private final void a(boolean param0, boolean param1, long param2, int param3, int param4) {
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int fieldTemp$13 = 0;
        int incrementValue$14 = 0;
        int fieldTemp$15 = 0;
        int fieldTemp$16 = 0;
        int incrementValue$17 = 0;
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
            if (field_Z) {
              break L0;
            } else {
              var8 = 0;
              L1: while (true) {
                if (var8 >= 1600) {
                  var8 = 0;
                  L2: while (true) {
                    if (var8 >= 32) {
                      field_X = 0;
                      break L0;
                    } else {
                      field_P[var8] = 0;
                      var8++;
                      continue L2;
                    }
                  }
                } else {
                  field_H[var8] = 0;
                  var8++;
                  continue L1;
                }
              }
            }
          }
          var8 = 0;
          L3: while (true) {
            if (var8 >= this.field_ob) {
              L4: {
                if (!field_Z) {
                  if (this.field_U != null) {
                    var8 = 0;
                    L5: while (true) {
                      if (var8 >= 12) {
                        var8 = param4 - 1;
                        L6: while (true) {
                          if (var8 < 0) {
                            break L4;
                          } else {
                            L7: {
                              var9 = field_H[var8];
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
                                var47 = field_ab[var8];
                                var12 = 0;
                                L9: while (true) {
                                  if (var12 >= var10) {
                                    break L7;
                                  } else {
                                    var13 = var47[var12];
                                    var14_int = this.field_U[var13];
                                    field_W[var14_int] = field_W[var14_int] + 1;
                                    var15_int = field_W[var14_int];
                                    field_g[var14_int][var15_int] = var13;
                                    if (var14_int >= 10) {
                                      if (var14_int != 10) {
                                        field_C[var15_int] = var8;
                                        var12++;
                                        continue L9;
                                      } else {
                                        field_D[var15_int] = var8;
                                        var12++;
                                        continue L9;
                                      }
                                    } else {
                                      field_lb[var14_int] = field_lb[var14_int] + var8;
                                      var12++;
                                      continue L9;
                                    }
                                  }
                                }
                              }
                            }
                            if (var9 > 64) {
                              var10 = field_H[var8] - 64 - 1;
                              var48 = field_f[var10];
                              var12 = 0;
                              L10: while (true) {
                                if (var12 < field_P[var10]) {
                                  var13 = var48[var12];
                                  var14_int = this.field_U[var13];
                                  field_W[var14_int] = field_W[var14_int] + 1;
                                  var15_int = field_W[var14_int];
                                  field_g[var14_int][var15_int] = var13;
                                  if (var14_int >= 10) {
                                    if (var14_int != 10) {
                                      field_C[var15_int] = var8;
                                      var12++;
                                      continue L10;
                                    } else {
                                      field_D[var15_int] = var8;
                                      var12++;
                                      continue L10;
                                    }
                                  } else {
                                    field_lb[var14_int] = field_lb[var14_int] + var8;
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
                        field_W[var8] = 0;
                        field_lb[var8] = 0;
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
                          var9 = field_H[var8];
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
                            var45 = field_ab[var8];
                            var12 = 0;
                            L14: while (true) {
                              if (var12 >= var10) {
                                break L12;
                              } else {
                                this.c(var45[var12]);
                                var12++;
                                continue L14;
                              }
                            }
                          }
                        }
                        if (var9 > 64) {
                          var10 = field_H[var8] - 64 - 1;
                          var46 = field_f[var10];
                          var12 = 0;
                          L15: while (true) {
                            if (var12 < field_P[var10]) {
                              this.c(var46[var12]);
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
                  oj.a(0, field_z, (byte) -63, var7 - 1, field_pb);
                  if (this.field_U != null) {
                    var8 = 0;
                    L16: while (true) {
                      if (var8 >= 12) {
                        var8 = 0;
                        L17: while (true) {
                          if (var8 >= var7) {
                            break L4;
                          } else {
                            var9 = field_z[var8];
                            var10 = field_pb[var8];
                            var11 = this.field_U[var9];
                            field_W[var11] = field_W[var11] + 1;
                            var12 = field_W[var11];
                            field_g[var11][var12] = var9;
                            if (var11 >= 10) {
                              if (var11 != 10) {
                                field_C[var12] = var10;
                                var8++;
                                continue L17;
                              } else {
                                field_D[var12] = var10;
                                var8++;
                                continue L17;
                              }
                            } else {
                              field_lb[var11] = field_lb[var11] + var10;
                              var8++;
                              continue L17;
                            }
                          }
                        }
                      } else {
                        field_W[var8] = 0;
                        field_lb[var8] = 0;
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
                        this.c(field_z[var8]);
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
                  if (field_W[1] > 0) {
                    break L20;
                  } else {
                    if (field_W[2] <= 0) {
                      break L19;
                    } else {
                      break L20;
                    }
                  }
                }
                var8 = (field_lb[1] + field_lb[2]) / (field_W[1] + field_W[2]);
                break L19;
              }
              L21: {
                L22: {
                  var9 = 0;
                  if (field_W[3] > 0) {
                    break L22;
                  } else {
                    if (field_W[4] <= 0) {
                      break L21;
                    } else {
                      break L22;
                    }
                  }
                }
                var9 = (field_lb[3] + field_lb[4]) / (field_W[3] + field_W[4]);
                break L21;
              }
              L23: {
                L24: {
                  var10 = 0;
                  if (field_W[6] > 0) {
                    break L24;
                  } else {
                    if (field_W[8] <= 0) {
                      break L23;
                    } else {
                      break L24;
                    }
                  }
                }
                var10 = (field_lb[6] + field_lb[8]) / (field_W[6] + field_W[8]);
                break L23;
              }
              L25: {
                var12 = 0;
                var13 = field_W[10];
                var14 = field_g[10];
                var15 = field_D;
                if (var12 != var13) {
                  break L25;
                } else {
                  var12 = 0;
                  var13 = field_W[11];
                  var14 = field_g[11];
                  var15 = field_C;
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
                        incrementValue$9 = var12;
                        var12++;
                        this.c(var14[incrementValue$9]);
                        if (var12 != var13) {
                          break L29;
                        } else {
                          if (var14 == field_g[11]) {
                            break L29;
                          } else {
                            var12 = 0;
                            var14 = field_g[11];
                            var13 = field_W[11];
                            var15 = field_C;
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
                            incrementValue$10 = var12;
                            var12++;
                            this.c(var14[incrementValue$10]);
                            if (var12 != var13) {
                              break L32;
                            } else {
                              if (var14 == field_g[11]) {
                                break L32;
                              } else {
                                var12 = 0;
                                var13 = field_W[11];
                                var14 = field_g[11];
                                var15 = field_C;
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
                              incrementValue$11 = var12;
                              var12++;
                              this.c(var14[incrementValue$11]);
                              if (var12 != var13) {
                                break L35;
                              } else {
                                if (var14 == field_g[11]) {
                                  break L35;
                                } else {
                                  var12 = 0;
                                  var13 = field_W[11];
                                  var14 = field_g[11];
                                  var15 = field_C;
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
                                incrementValue$12 = var12;
                                var12++;
                                this.c(var14[incrementValue$12]);
                                if (var12 != var13) {
                                  break L38;
                                } else {
                                  if (var14 == field_g[11]) {
                                    break L38;
                                  } else {
                                    var12 = 0;
                                    var13 = field_W[11];
                                    var14 = field_g[11];
                                    var15 = field_C;
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
                        var17 = field_W[var16];
                        var49 = field_g[var16];
                        var29 = 0;
                        var19 = var29;
                        L39: while (true) {
                          if (var29 >= var17) {
                            var16++;
                            continue L27;
                          } else {
                            this.c(var49[var29]);
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
              if (this.field_j[var8] != -2) {
                L40: {
                  var9 = this.field_kb[var8];
                  var10 = this.field_A[var8];
                  var11 = this.field_p[var8];
                  var12 = field_bb[var9];
                  var13 = field_bb[var10];
                  var14_int = field_bb[var11];
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
                    var15_int = field_F[var9];
                    var16 = field_F[var10];
                    var17 = field_F[var11];
                    var18 = field_db[var9];
                    var19 = field_db[var10];
                    var20 = field_db[var11];
                    var21 = field_q[var9];
                    var22 = field_q[var10];
                    var23 = field_q[var11];
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
                      field_l[var8] = true;
                      if (!field_Z) {
                        var27 = (field_S[var9] + field_S[var10] + field_S[var11]) / 3 + param3;
                        if (field_H[var27] >= 64) {
                          L42: {
                            var28 = field_H[var27];
                            if (var28 != 64) {
                              break L42;
                            } else {
                              if (field_X != 512) {
                                fieldTemp$13 = field_X;
                                field_X = field_X + 1;
                                var28 = 65 + fieldTemp$13;
                                field_H[var27] = 65 + fieldTemp$13;
                                break L42;
                              } else {
                                var8++;
                                continue L3;
                              }
                            }
                          }
                          var28 -= 65;
                          field_P[var28] = field_P[var28] + 1;
                          field_f[var28][field_P[var28]] = var8;
                          var8++;
                          continue L3;
                        } else {
                          field_H[var27] = field_H[var27] + 1;
                          field_ab[var27][field_H[var27]] = var8;
                          var8++;
                          continue L3;
                        }
                      } else {
                        field_pb[var7] = (field_S[var9] + field_S[var10] + field_S[var11]) / 3;
                        incrementValue$14 = var7;
                        var7++;
                        field_z[incrementValue$14] = var8;
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
                    if (!this.a(bl.field_Mb + vn.field_a, li.field_b + vn.field_f, field_G[var9], field_G[var10], field_G[var11], var12, var13, var14_int)) {
                      break L43;
                    } else {
                      fieldTemp$15 = fd.field_I;
                      fd.field_I = fd.field_I + 1;
                      cb.field_r[fieldTemp$15] = param2;
                      param1 = false;
                      break L43;
                    }
                  }
                }
                if ((var12 - var13) * (field_G[var11] - field_G[var10]) - (field_G[var9] - field_G[var10]) * (var14_int - var13) > 0) {
                  L44: {
                    L45: {
                      field_l[var8] = false;
                      if (var12 < 0) {
                        break L45;
                      } else {
                        if (var13 < 0) {
                          break L45;
                        } else {
                          if (var14_int < 0) {
                            break L45;
                          } else {
                            if (var12 > vn.field_k) {
                              break L45;
                            } else {
                              if (var13 > vn.field_k) {
                                break L45;
                              } else {
                                if (var14_int <= vn.field_k) {
                                  field_Q[var8] = false;
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
                    field_Q[var8] = true;
                    break L44;
                  }
                  if (!field_Z) {
                    var15_int = (field_S[var9] + field_S[var10] + field_S[var11]) / 3 + param3;
                    if (field_H[var15_int] >= 64) {
                      L46: {
                        var16 = field_H[var15_int];
                        if (var16 != 64) {
                          break L46;
                        } else {
                          if (field_X != 512) {
                            fieldTemp$16 = field_X;
                            field_X = field_X + 1;
                            var16 = 65 + fieldTemp$16;
                            field_H[var15_int] = 65 + fieldTemp$16;
                            break L46;
                          } else {
                            var8++;
                            continue L3;
                          }
                        }
                      }
                      var16 -= 65;
                      field_P[var16] = field_P[var16] + 1;
                      field_f[var16][field_P[var16]] = var8;
                      var8++;
                      continue L3;
                    } else {
                      field_H[var15_int] = field_H[var15_int] + 1;
                      field_ab[var15_int][field_H[var15_int]] = var8;
                      var8++;
                      continue L3;
                    }
                  } else {
                    field_pb[var7] = (field_S[var9] + field_S[var10] + field_S[var11]) / 3;
                    incrementValue$17 = var7;
                    var7++;
                    field_z[incrementValue$17] = var8;
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
                      if (this.field_R == null) {
                        break L0;
                      } else {
                        var8 = 0;
                        L1: while (true) {
                          if (var8 >= var7) {
                            return;
                          } else {
                            var9 = param1[var8];
                            if (var9 < this.field_R.length) {
                              var40 = this.field_R[var9];
                              var11 = 0;
                              L2: while (true) {
                                if (var11 >= var40.length) {
                                  this.field_i = true;
                                  var8++;
                                  continue L1;
                                } else {
                                  L3: {
                                    var12 = var40[var11];
                                    var13 = this.field_J[var12] & 65535;
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
                                  this.field_J[var12] = (short)(var14 << 10 | var15 << 7 | var16);
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
                    if (this.field_R == null) {
                      break L0;
                    } else {
                      L5: {
                        if (this.field_eb == null) {
                          break L5;
                        } else {
                          var8 = 0;
                          L6: while (true) {
                            if (var8 >= var7) {
                              break L5;
                            } else {
                              var9 = param1[var8];
                              if (var9 < this.field_R.length) {
                                var39 = this.field_R[var9];
                                var11 = 0;
                                L7: while (true) {
                                  if (var11 < var39.length) {
                                    L8: {
                                      var12 = var39[var11];
                                      var13 = (this.field_eb[var12] & 255) + param2 * 8;
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
                                    this.field_eb[var12] = (byte)var13;
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
                    if (var9 < this.field_B.length) {
                      var38 = this.field_B[var9];
                      var11 = 0;
                      L10: while (true) {
                        if (var11 < var38.length) {
                          var12 = var38[var11];
                          this.field_t[var12] = this.field_t[var12] - field_N;
                          this.field_V[var12] = this.field_V[var12] - field_v;
                          this.field_gb[var12] = this.field_gb[var12] - field_fb;
                          this.field_t[var12] = this.field_t[var12] * param2 / 128;
                          this.field_V[var12] = this.field_V[var12] * param3 / 128;
                          this.field_gb[var12] = this.field_gb[var12] * param4 / 128;
                          this.field_t[var12] = this.field_t[var12] + field_N;
                          this.field_V[var12] = this.field_V[var12] + field_v;
                          this.field_gb[var12] = this.field_gb[var12] + field_fb;
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
                  if (var9 < this.field_B.length) {
                    var37 = this.field_B[var9];
                    var11 = 0;
                    L12: while (true) {
                      if (var11 < var37.length) {
                        L13: {
                          var12 = var37[var11];
                          this.field_t[var12] = this.field_t[var12] - field_N;
                          this.field_V[var12] = this.field_V[var12] - field_v;
                          this.field_gb[var12] = this.field_gb[var12] - field_fb;
                          if (param4 == 0) {
                            break L13;
                          } else {
                            var13 = vn.field_g[param4];
                            var14 = vn.field_o[param4];
                            var15 = this.field_V[var12] * var13 + this.field_t[var12] * var14 + 32767 >> 16;
                            this.field_V[var12] = this.field_V[var12] * var14 - this.field_t[var12] * var13 + 32767 >> 16;
                            this.field_t[var12] = var15;
                            break L13;
                          }
                        }
                        L14: {
                          if (param2 == 0) {
                            break L14;
                          } else {
                            var13 = vn.field_g[param2];
                            var14 = vn.field_o[param2];
                            var15 = this.field_V[var12] * var14 - this.field_gb[var12] * var13 + 32767 >> 16;
                            this.field_gb[var12] = this.field_V[var12] * var13 + this.field_gb[var12] * var14 + 32767 >> 16;
                            this.field_V[var12] = var15;
                            break L14;
                          }
                        }
                        L15: {
                          if (param3 == 0) {
                            break L15;
                          } else {
                            var13 = vn.field_g[param3];
                            var14 = vn.field_o[param3];
                            var15 = this.field_gb[var12] * var13 + this.field_t[var12] * var14 + 32767 >> 16;
                            this.field_gb[var12] = this.field_gb[var12] * var14 - this.field_t[var12] * var13 + 32767 >> 16;
                            this.field_t[var12] = var15;
                            break L15;
                          }
                        }
                        this.field_t[var12] = this.field_t[var12] + field_N;
                        this.field_V[var12] = this.field_V[var12] + field_v;
                        this.field_gb[var12] = this.field_gb[var12] + field_fb;
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
                if (var9 < this.field_B.length) {
                  var36 = this.field_B[var9];
                  var11 = 0;
                  L17: while (true) {
                    if (var11 < var36.length) {
                      var12 = var36[var11];
                      this.field_t[var12] = this.field_t[var12] + param2;
                      this.field_V[var12] = this.field_V[var12] + param3;
                      this.field_gb[var12] = this.field_gb[var12] + param4;
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
          field_N = 0;
          field_v = 0;
          field_fb = 0;
          var9 = 0;
          L18: while (true) {
            if (var9 >= var7) {
              L19: {
                if (var8 <= 0) {
                  field_N = param2;
                  field_v = param3;
                  field_fb = param4;
                  break L19;
                } else {
                  field_N = field_N / var8 + param2;
                  field_v = field_v / var8 + param3;
                  field_fb = field_fb / var8 + param4;
                  break L19;
                }
              }
              return;
            } else {
              var10 = param1[var9];
              if (var10 < this.field_B.length) {
                var35 = this.field_B[var10];
                var12 = 0;
                L20: while (true) {
                  if (var12 < var35.length) {
                    var13 = var35[var12];
                    field_N = field_N + this.field_t[var13];
                    field_v = field_v + this.field_V[var13];
                    field_fb = field_fb + this.field_gb[var13];
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

    private final static int e(int param0) {
        if (param0 < 2) {
            param0 = 2;
        } else {
            if (param0 > 126) {
                param0 = 126;
            }
        }
        return param0;
    }

    private final void e() {
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
          if (var9 >= this.field_nb) {
            this.field_m = (short)(int)(Math.sqrt((double)var8) + 0.99);
            this.field_s = true;
            return;
          } else {
            L1: {
              var10 = this.field_t[var9];
              var11 = this.field_V[var9];
              var12 = this.field_gb[var9];
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
        int[] var78 = null;
        int[] var79 = null;
        int[] var80 = null;
        int[] var81 = null;
        int[] var82 = null;
        int[] var83 = null;
        int[] var84 = null;
        int[] var85 = null;
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
                        if (this.field_R == null) {
                          break L1;
                        } else {
                          var10 = 0;
                          L2: while (true) {
                            if (var10 >= var9) {
                              return;
                            } else {
                              var11 = param1[var10];
                              if (var11 < this.field_R.length) {
                                var85 = this.field_R[var11];
                                var13 = 0;
                                L3: while (true) {
                                  if (var13 >= var85.length) {
                                    this.field_i = true;
                                    var10++;
                                    continue L2;
                                  } else {
                                    L4: {
                                      var14 = var85[var13];
                                      if (this.field_y == null) {
                                        break L4;
                                      } else {
                                        if ((param6 & this.field_y[var14]) != 0) {
                                          break L4;
                                        } else {
                                          var13++;
                                          continue L3;
                                        }
                                      }
                                    }
                                    L5: {
                                      var15 = this.field_J[var14] & 65535;
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
                                    this.field_J[var14] = (short)(var16 << 10 | var17 << 7 | var18);
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
                      if (this.field_R == null) {
                        break L1;
                      } else {
                        L7: {
                          if (this.field_eb == null) {
                            break L7;
                          } else {
                            var10 = 0;
                            L8: while (true) {
                              if (var10 >= var9) {
                                break L7;
                              } else {
                                var11 = param1[var10];
                                if (var11 < this.field_R.length) {
                                  var84 = this.field_R[var11];
                                  var13 = 0;
                                  L9: while (true) {
                                    if (var13 < var84.length) {
                                      L10: {
                                        var14 = var84[var13];
                                        if (this.field_y == null) {
                                          break L10;
                                        } else {
                                          if ((param6 & this.field_y[var14]) != 0) {
                                            break L10;
                                          } else {
                                            var13++;
                                            continue L9;
                                          }
                                        }
                                      }
                                      L11: {
                                        var15 = (this.field_eb[var14] & 255) + param2 * 8;
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
                                      this.field_eb[var14] = (byte)var15;
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
                        if (var11 < this.field_B.length) {
                          var83 = this.field_B[var11];
                          var13 = 0;
                          L13: while (true) {
                            if (var13 < var83.length) {
                              L14: {
                                var14 = var83[var13];
                                if (this.field_T == null) {
                                  break L14;
                                } else {
                                  if ((param6 & this.field_T[var14]) != 0) {
                                    break L14;
                                  } else {
                                    var13++;
                                    continue L13;
                                  }
                                }
                              }
                              this.field_t[var14] = this.field_t[var14] - field_N;
                              this.field_V[var14] = this.field_V[var14] - field_v;
                              this.field_gb[var14] = this.field_gb[var14] - field_fb;
                              this.field_t[var14] = this.field_t[var14] * param2 / 128;
                              this.field_V[var14] = this.field_V[var14] * param3 / 128;
                              this.field_gb[var14] = this.field_gb[var14] * param4 / 128;
                              this.field_t[var14] = this.field_t[var14] + field_N;
                              this.field_V[var14] = this.field_V[var14] + field_v;
                              this.field_gb[var14] = this.field_gb[var14] + field_fb;
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
                      if (!field_mb) {
                        break L15;
                      } else {
                        var16 = param7[0] * field_N + param7[3] * field_v + param7[6] * field_fb + 16384 >> 15;
                        var17 = param7[1] * field_N + param7[4] * field_v + param7[7] * field_fb + 16384 >> 15;
                        var18 = param7[2] * field_N + param7[5] * field_v + param7[8] * field_fb + 16384 >> 15;
                        var16 = var16 + var13;
                        var17 = var17 + var14;
                        var18 = var18 + var15;
                        field_N = var16;
                        field_v = var17;
                        field_fb = var18;
                        field_mb = false;
                        break L15;
                      }
                    }
                    var16 = param2 << 15 >> 7;
                    var17 = param3 << 15 >> 7;
                    var18 = param4 << 15 >> 7;
                    var19 = var16 * -field_N + 16384 >> 15;
                    var20 = var17 * -field_v + 16384 >> 15;
                    var21 = var18 * -field_fb + 16384 >> 15;
                    var22 = var19 + field_N;
                    var23 = var20 + field_v;
                    var24 = var21 + field_fb;
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
                    var66 = new int[9];
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
                            if (var34 < this.field_B.length) {
                              var82 = this.field_B[var34];
                              var36 = 0;
                              L18: while (true) {
                                if (var36 < var82.length) {
                                  L19: {
                                    var37 = var82[var36];
                                    if (this.field_T == null) {
                                      break L19;
                                    } else {
                                      if ((param6 & this.field_T[var37]) != 0) {
                                        break L19;
                                      } else {
                                        var36++;
                                        continue L18;
                                      }
                                    }
                                  }
                                  var38 = var66[0] * this.field_t[var37] + var66[1] * this.field_V[var37] + var66[2] * this.field_gb[var37] + 16384 >> 15;
                                  var39 = var66[3] * this.field_t[var37] + var66[4] * this.field_V[var37] + var66[5] * this.field_gb[var37] + 16384 >> 15;
                                  var40 = var66[6] * this.field_t[var37] + var66[7] * this.field_V[var37] + var66[8] * this.field_gb[var37] + 16384 >> 15;
                                  var38 = var38 + var30;
                                  var39 = var39 + var31;
                                  var40 = var40 + var32;
                                  this.field_t[var37] = var38;
                                  this.field_V[var37] = var39;
                                  this.field_gb[var37] = var40;
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
                      if (var11 < this.field_B.length) {
                        var81 = this.field_B[var11];
                        var13 = 0;
                        L23: while (true) {
                          if (var13 < var81.length) {
                            L24: {
                              var14 = var81[var13];
                              if (this.field_T == null) {
                                break L24;
                              } else {
                                if ((param6 & this.field_T[var14]) != 0) {
                                  break L24;
                                } else {
                                  var13++;
                                  continue L23;
                                }
                              }
                            }
                            L25: {
                              this.field_t[var14] = this.field_t[var14] - field_N;
                              this.field_V[var14] = this.field_V[var14] - field_v;
                              this.field_gb[var14] = this.field_gb[var14] - field_fb;
                              if (param4 == 0) {
                                break L25;
                              } else {
                                var15 = vn.field_g[param4];
                                var16 = vn.field_o[param4];
                                var17 = this.field_V[var14] * var15 + this.field_t[var14] * var16 + 32767 >> 16;
                                this.field_V[var14] = this.field_V[var14] * var16 - this.field_t[var14] * var15 + 32767 >> 16;
                                this.field_t[var14] = var17;
                                break L25;
                              }
                            }
                            L26: {
                              if (param2 == 0) {
                                break L26;
                              } else {
                                var15 = vn.field_g[param2];
                                var16 = vn.field_o[param2];
                                var17 = this.field_V[var14] * var16 - this.field_gb[var14] * var15 + 32767 >> 16;
                                this.field_gb[var14] = this.field_V[var14] * var15 + this.field_gb[var14] * var16 + 32767 >> 16;
                                this.field_V[var14] = var17;
                                break L26;
                              }
                            }
                            L27: {
                              if (param3 == 0) {
                                break L27;
                              } else {
                                var15 = vn.field_g[param3];
                                var16 = vn.field_o[param3];
                                var17 = this.field_gb[var14] * var15 + this.field_t[var14] * var16 + 32767 >> 16;
                                this.field_gb[var14] = this.field_gb[var14] * var16 - this.field_t[var14] * var15 + 32767 >> 16;
                                this.field_t[var14] = var17;
                                break L27;
                              }
                            }
                            this.field_t[var14] = this.field_t[var14] + field_N;
                            this.field_V[var14] = this.field_V[var14] + field_v;
                            this.field_gb[var14] = this.field_gb[var14] + field_fb;
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
                    if (!field_mb) {
                      break L28;
                    } else {
                      var16 = param7[0] * field_N + param7[3] * field_v + param7[6] * field_fb + 16384 >> 15;
                      var17 = param7[1] * field_N + param7[4] * field_v + param7[7] * field_fb + 16384 >> 15;
                      var18 = param7[2] * field_N + param7[5] * field_v + param7[8] * field_fb + 16384 >> 15;
                      var16 = var16 + var13;
                      var17 = var17 + var14;
                      var18 = var18 + var15;
                      field_N = var16;
                      field_v = var17;
                      field_fb = var18;
                      field_mb = false;
                      break L28;
                    }
                  }
                  var61 = new int[9];
                  var50 = var61;
                  var16_ref_int__ = var50;
                  var17 = vn.field_o[param2] >> 1;
                  var18 = vn.field_g[param2] >> 1;
                  var19 = vn.field_o[param3] >> 1;
                  var20 = vn.field_g[param3] >> 1;
                  var21 = vn.field_o[param4] >> 1;
                  var22 = vn.field_g[param4] >> 1;
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
                  var25_int = var61[0] * -field_N + var61[1] * -field_v + var61[2] * -field_fb + 16384 >> 15;
                  var26 = var61[3] * -field_N + var61[4] * -field_v + var61[5] * -field_fb + 16384 >> 15;
                  var27 = var61[6] * -field_N + var61[7] * -field_v + var61[8] * -field_fb + 16384 >> 15;
                  var28 = var25_int + field_N;
                  var29_int = var26 + field_v;
                  var30 = var27 + field_fb;
                  var31_ref_int__ = new int[9];
                  var32 = 0;
                  L29: while (true) {
                    if (var32 >= 3) {
                      var32 = var61[0] * var13 + var61[1] * var14 + var61[2] * var15 + 16384 >> 15;
                      var33 = var61[3] * var13 + var61[4] * var14 + var61[5] * var15 + 16384 >> 15;
                      var34 = var61[6] * var13 + var61[7] * var14 + var61[8] * var15 + 16384 >> 15;
                      var32 = var32 + var28;
                      var33 = var33 + var29_int;
                      var34 = var34 + var30;
                      var63 = new int[9];
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
                              if (var40 < this.field_B.length) {
                                var80 = this.field_B[var40];
                                var42 = 0;
                                L32: while (true) {
                                  if (var42 < var80.length) {
                                    L33: {
                                      var43 = var80[var42];
                                      if (this.field_T == null) {
                                        break L33;
                                      } else {
                                        if ((param6 & this.field_T[var43]) != 0) {
                                          break L33;
                                        } else {
                                          var42++;
                                          continue L32;
                                        }
                                      }
                                    }
                                    var44 = var63[0] * this.field_t[var43] + var63[1] * this.field_V[var43] + var63[2] * this.field_gb[var43] + 16384 >> 15;
                                    var45 = var63[3] * this.field_t[var43] + var63[4] * this.field_V[var43] + var63[5] * this.field_gb[var43] + 16384 >> 15;
                                    var46 = var63[6] * this.field_t[var43] + var63[7] * this.field_V[var43] + var63[8] * this.field_gb[var43] + 16384 >> 15;
                                    var44 = var44 + var36;
                                    var45 = var45 + var37;
                                    var46 = var46 + var38;
                                    this.field_t[var43] = var44;
                                    this.field_V[var43] = var45;
                                    this.field_gb[var43] = var46;
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
                if (var11 < this.field_B.length) {
                  var79 = this.field_B[var11];
                  var13 = 0;
                  L40: while (true) {
                    if (var13 < var79.length) {
                      L41: {
                        var14 = var79[var13];
                        if (this.field_T == null) {
                          break L41;
                        } else {
                          if ((param6 & this.field_T[var14]) != 0) {
                            break L41;
                          } else {
                            var13++;
                            continue L40;
                          }
                        }
                      }
                      this.field_t[var14] = this.field_t[var14] + param2;
                      this.field_V[var14] = this.field_V[var14] + param3;
                      this.field_gb[var14] = this.field_gb[var14] + param4;
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
          field_N = 0;
          field_v = 0;
          field_fb = 0;
          var11 = 0;
          L42: while (true) {
            if (var11 >= var9) {
              L43: {
                if (var10 <= 0) {
                  field_N = param2;
                  field_v = param3;
                  field_fb = param4;
                  break L43;
                } else {
                  field_N = field_N / var10 + param2;
                  field_v = field_v / var10 + param3;
                  field_fb = field_fb / var10 + param4;
                  field_mb = true;
                  break L43;
                }
              }
              return;
            } else {
              var12 = param1[var11];
              if (var12 < this.field_B.length) {
                var78 = this.field_B[var12];
                var14 = 0;
                L44: while (true) {
                  if (var14 < var78.length) {
                    L45: {
                      var15 = var78[var14];
                      if (this.field_T == null) {
                        break L45;
                      } else {
                        if ((param6 & this.field_T[var15]) != 0) {
                          break L45;
                        } else {
                          var14++;
                          continue L44;
                        }
                      }
                    }
                    field_N = field_N + this.field_t[var15];
                    field_v = field_v + this.field_V[var15];
                    field_fb = field_fb + this.field_gb[var15];
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

    final void b() {
        if (this.field_i) {
            this.c();
            this.field_i = false;
        }
        this.field_s = false;
    }

    public ob() {
        this.field_ib = 0;
        this.field_ob = 0;
        this.field_E = 0;
        this.field_i = false;
        this.field_nb = 0;
        this.field_K = (byte) 0;
        this.field_s = false;
    }

    ob(kc param0, int param1, int param2, int param3, int param4, int param5) {
        int incrementValue$1 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var9_ref_int__ = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        io var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        ce var18 = null;
        ce var19 = null;
        int[] var20 = null;
        L0: {
          this.field_ib = 0;
          this.field_ob = 0;
          this.field_E = 0;
          this.field_i = false;
          this.field_nb = 0;
          this.field_K = (byte) 0;
          this.field_s = false;
          param0.b();
          param0.a();
          this.field_ib = param0.field_t;
          this.field_nb = param0.field_E;
          this.field_t = param0.field_R;
          this.field_V = param0.field_h;
          this.field_gb = param0.field_g;
          this.field_ob = param0.field_K;
          this.field_kb = param0.field_C;
          this.field_A = param0.field_O;
          this.field_p = param0.field_B;
          this.field_U = param0.field_z;
          this.field_eb = param0.field_m;
          this.field_K = param0.field_s;
          this.field_J = param0.field_H;
          this.field_B = param0.field_y;
          this.field_R = param0.field_P;
          this.field_y = param0.field_r;
          this.field_T = param0.field_j;
          var7 = (int)Math.sqrt((double)(param3 * param3 + param4 * param4 + param5 * param5));
          var8 = param2 * var7 >> 8;
          this.field_hb = new int[this.field_ob];
          this.field_M = new int[this.field_ob];
          this.field_j = new int[this.field_ob];
          if (param0.field_u == null) {
            this.field_r = null;
            break L0;
          } else {
            this.field_r = new short[this.field_ob];
            var9 = 0;
            L1: while (true) {
              if (var9 >= this.field_ob) {
                break L0;
              } else {
                L2: {
                  var10 = param0.field_u[var9];
                  if (var10 == -1) {
                    break L2;
                  } else {
                    if (!vn.field_d.a(true, var10)) {
                      break L2;
                    } else {
                      this.field_r[var9] = (short)var10;
                      var9++;
                      continue L1;
                    }
                  }
                }
                this.field_r[var9] = (short)-1;
                var9++;
                continue L1;
              }
            }
          }
        }
        L3: {
          if (param0.field_i <= 0) {
            break L3;
          } else {
            if (param0.field_q == null) {
              break L3;
            } else {
              var20 = new int[param0.field_i];
              var17 = var20;
              var9_ref_int__ = var17;
              var10 = 0;
              L4: while (true) {
                if (var10 >= this.field_ob) {
                  this.field_E = 0;
                  var10 = 0;
                  L5: while (true) {
                    if (var10 >= param0.field_i) {
                      this.field_k = new int[this.field_E];
                      this.field_I = new int[this.field_E];
                      this.field_Y = new int[this.field_E];
                      var10 = 0;
                      var11 = 0;
                      L6: while (true) {
                        if (var11 >= param0.field_i) {
                          this.field_u = new byte[this.field_ob];
                          var11 = 0;
                          L7: while (true) {
                            if (var11 >= this.field_ob) {
                              break L3;
                            } else {
                              if (param0.field_q[var11] == -1) {
                                this.field_u[var11] = (byte)-1;
                                var11++;
                                continue L7;
                              } else {
                                this.field_u[var11] = (byte)var9_ref_int__[param0.field_q[var11] & 255];
                                if (this.field_u[var11] == -1) {
                                  if (this.field_r != null) {
                                    this.field_r[var11] = (short)-1;
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
                            if (var20[var11] <= 0) {
                              break L8;
                            } else {
                              if (param0.field_v[var11] != 0) {
                                break L8;
                              } else {
                                this.field_k[var10] = param0.field_k[var11] & 65535;
                                this.field_I[var10] = param0.field_N[var11] & 65535;
                                this.field_Y[var10] = param0.field_Q[var11] & 65535;
                                incrementValue$1 = var10;
                                var10++;
                                var9_ref_int__[var11] = incrementValue$1;
                                var11++;
                                continue L6;
                              }
                            }
                          }
                          var20[var11] = -1;
                          var11++;
                          continue L6;
                        }
                      }
                    } else {
                      if (var20[var10] > 0) {
                        if (param0.field_v[var10] == 0) {
                          this.field_E = this.field_E + 1;
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
                  if (param0.field_q[var10] != -1) {
                    var9_ref_int__[param0.field_q[var10] & 255] = var9_ref_int__[param0.field_q[var10] & 255] + 1;
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
          if (var16 >= this.field_ob) {
            return;
          } else {
            L10: {
              if (param0.field_J != null) {
                var10 = param0.field_J[var16];
                break L10;
              } else {
                var10 = 0;
                break L10;
              }
            }
            L11: {
              if (param0.field_m != null) {
                var11 = param0.field_m[var16];
                break L11;
              } else {
                var11 = 0;
                break L11;
              }
            }
            L12: {
              if (this.field_r != null) {
                var12 = this.field_r[var16];
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
                  this.field_j[var16] = -2;
                  var16++;
                  continue L9;
                } else {
                  var19 = param0.field_o[var16];
                  var14 = param1 + (param3 * var19.field_g + param4 * var19.field_d + param5 * var19.field_h) / (var8 + var8 / 2);
                  this.field_hb[var16] = ob.e(var14);
                  this.field_j[var16] = -1;
                  var16++;
                  continue L9;
                }
              } else {
                L15: {
                  L16: {
                    if (param0.field_w == null) {
                      break L16;
                    } else {
                      if (param0.field_w[this.field_kb[var16]] == null) {
                        break L16;
                      } else {
                        var13 = param0.field_w[this.field_kb[var16]];
                        break L15;
                      }
                    }
                  }
                  var13 = param0.field_f[this.field_kb[var16]];
                  break L15;
                }
                L17: {
                  L18: {
                    var14 = param1 + (param3 * var13.field_j + param4 * var13.field_f + param5 * var13.field_b) / (var8 * var13.field_e);
                    this.field_hb[var16] = ob.e(var14);
                    if (param0.field_w == null) {
                      break L18;
                    } else {
                      if (param0.field_w[this.field_A[var16]] == null) {
                        break L18;
                      } else {
                        var13 = param0.field_w[this.field_A[var16]];
                        break L17;
                      }
                    }
                  }
                  var13 = param0.field_f[this.field_A[var16]];
                  break L17;
                }
                L19: {
                  L20: {
                    var14 = param1 + (param3 * var13.field_j + param4 * var13.field_f + param5 * var13.field_b) / (var8 * var13.field_e);
                    this.field_M[var16] = ob.e(var14);
                    if (param0.field_w == null) {
                      break L20;
                    } else {
                      if (param0.field_w[this.field_p[var16]] == null) {
                        break L20;
                      } else {
                        var13 = param0.field_w[this.field_p[var16]];
                        break L19;
                      }
                    }
                  }
                  var13 = param0.field_f[this.field_p[var16]];
                  break L19;
                }
                var14 = param1 + (param3 * var13.field_j + param4 * var13.field_f + param5 * var13.field_b) / (var8 * var13.field_e);
                this.field_j[var16] = ob.e(var14);
                var16++;
                continue L9;
              }
            } else {
              if (var10 != 0) {
                if (var10 != 1) {
                  if (var10 != 3) {
                    this.field_j[var16] = -2;
                    var16++;
                    continue L9;
                  } else {
                    this.field_hb[var16] = 128;
                    this.field_j[var16] = -1;
                    var16++;
                    continue L9;
                  }
                } else {
                  var18 = param0.field_o[var16];
                  var14 = param1 + (param3 * var18.field_g + param4 * var18.field_d + param5 * var18.field_h) / (var8 + var8 / 2) << 17;
                  this.field_hb[var16] = var14 | ob.a(param0.field_H[var16] & 65535, var14 >> 17);
                  this.field_j[var16] = -1;
                  var16++;
                  continue L9;
                }
              } else {
                L21: {
                  L22: {
                    var15 = param0.field_H[var16] & 65535;
                    if (param0.field_w == null) {
                      break L22;
                    } else {
                      if (param0.field_w[this.field_kb[var16]] == null) {
                        break L22;
                      } else {
                        var13 = param0.field_w[this.field_kb[var16]];
                        break L21;
                      }
                    }
                  }
                  var13 = param0.field_f[this.field_kb[var16]];
                  break L21;
                }
                L23: {
                  L24: {
                    var14 = param1 + (param3 * var13.field_j + param4 * var13.field_f + param5 * var13.field_b) / (var8 * var13.field_e) << 17;
                    this.field_hb[var16] = var14 | ob.a(var15, var14 >> 17);
                    if (param0.field_w == null) {
                      break L24;
                    } else {
                      if (param0.field_w[this.field_A[var16]] == null) {
                        break L24;
                      } else {
                        var13 = param0.field_w[this.field_A[var16]];
                        break L23;
                      }
                    }
                  }
                  var13 = param0.field_f[this.field_A[var16]];
                  break L23;
                }
                L25: {
                  L26: {
                    var14 = param1 + (param3 * var13.field_j + param4 * var13.field_f + param5 * var13.field_b) / (var8 * var13.field_e) << 17;
                    this.field_M[var16] = var14 | ob.a(var15, var14 >> 17);
                    if (param0.field_w == null) {
                      break L26;
                    } else {
                      if (param0.field_w[this.field_p[var16]] == null) {
                        break L26;
                      } else {
                        var13 = param0.field_w[this.field_p[var16]];
                        break L25;
                      }
                    }
                  }
                  var13 = param0.field_f[this.field_p[var16]];
                  break L25;
                }
                var14 = param1 + (param3 * var13.field_j + param4 * var13.field_f + param5 * var13.field_b) / (var8 * var13.field_e) << 17;
                this.field_j[var16] = var14 | ob.a(var15, var14 >> 17);
                var16++;
                continue L9;
              }
            }
          }
        }
    }

    ob(ob[] param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        ob var8_ref_ob = null;
        int var8 = 0;
        int var9_int = 0;
        ob var9 = null;
        int var10 = 0;
        ob var11 = null;
        int var12 = 0;
        ob var13 = null;
        ob var14 = null;
        int stackIn_11_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        byte[] stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        byte[] stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        byte[] stackIn_51_0 = null;
        int stackIn_51_1 = 0;
        byte[] stackIn_52_0 = null;
        int stackIn_52_1 = 0;
        int stackIn_52_2 = 0;
        byte[] stackOut_48_0 = null;
        int stackOut_48_1 = 0;
        byte[] stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        byte[] stackOut_50_0 = null;
        int stackOut_50_1 = 0;
        int stackOut_50_2 = 0;
        byte[] stackOut_51_0 = null;
        int stackOut_51_1 = 0;
        int stackOut_51_2 = 0;
        int stackOut_10_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_13_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_16_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        int stackOut_17_0 = 0;
        int stackOut_17_1 = 0;
        this.field_ib = 0;
        this.field_ob = 0;
        this.field_E = 0;
        this.field_i = false;
        this.field_nb = 0;
        this.field_K = (byte) 0;
        this.field_s = false;
        var3 = 0;
        var4 = 0;
        var5 = 0;
        var6 = 0;
        this.field_ib = 0;
        this.field_ob = 0;
        this.field_E = 0;
        this.field_K = (byte) -1;
        var7 = 0;
        L0: while (true) {
          if (var7 >= param1) {
            L1: {
              this.field_t = new int[this.field_ib];
              this.field_V = new int[this.field_ib];
              this.field_gb = new int[this.field_ib];
              this.field_kb = new int[this.field_ob];
              this.field_A = new int[this.field_ob];
              this.field_p = new int[this.field_ob];
              this.field_hb = new int[this.field_ob];
              this.field_M = new int[this.field_ob];
              this.field_j = new int[this.field_ob];
              if (var3 == 0) {
                break L1;
              } else {
                this.field_U = new byte[this.field_ob];
                break L1;
              }
            }
            L2: {
              if (var4 == 0) {
                break L2;
              } else {
                this.field_eb = new byte[this.field_ob];
                break L2;
              }
            }
            L3: {
              if (var5 == 0) {
                break L3;
              } else {
                this.field_r = new short[this.field_ob];
                break L3;
              }
            }
            L4: {
              if (var6 == 0) {
                break L4;
              } else {
                this.field_u = new byte[this.field_ob];
                break L4;
              }
            }
            L5: {
              if (this.field_E <= 0) {
                break L5;
              } else {
                this.field_k = new int[this.field_E];
                this.field_I = new int[this.field_E];
                this.field_Y = new int[this.field_E];
                break L5;
              }
            }
            this.field_J = new short[this.field_ob];
            this.field_ib = 0;
            this.field_ob = 0;
            this.field_E = 0;
            var7 = 0;
            L6: while (true) {
              if (var7 >= param1) {
                var7 = 0;
                this.field_nb = this.field_ib;
                var8 = 0;
                L7: while (true) {
                  if (var8 >= param1) {
                    return;
                  } else {
                    var9 = param0[var8];
                    if (var9 != null) {
                      var10 = 0;
                      L8: while (true) {
                        if (var10 >= var9.field_E) {
                          var12 = var9.field_nb;
                          var10 = var12;
                          L9: while (true) {
                            if (var12 < var9.field_ib) {
                              this.field_t[this.field_ib] = var9.field_t[var12];
                              this.field_V[this.field_ib] = var9.field_V[var12];
                              this.field_gb[this.field_ib] = var9.field_gb[var12];
                              this.field_ib = this.field_ib + 1;
                              var12++;
                              continue L9;
                            } else {
                              var8++;
                              continue L7;
                            }
                          }
                        } else {
                          L10: {
                            if (var9.field_k[var10] < var9.field_nb) {
                              break L10;
                            } else {
                              this.field_k[var7] = var9.field_k[var10] - var9.field_nb + this.field_ib;
                              break L10;
                            }
                          }
                          L11: {
                            if (var9.field_I[var10] < var9.field_nb) {
                              break L11;
                            } else {
                              this.field_I[var7] = var9.field_I[var10] - var9.field_nb + this.field_ib;
                              break L11;
                            }
                          }
                          if (var9.field_Y[var10] >= var9.field_nb) {
                            this.field_Y[var7] = var9.field_Y[var10] - var9.field_nb + this.field_ib;
                            var7++;
                            var10++;
                            continue L8;
                          } else {
                            var7++;
                            var10++;
                            continue L8;
                          }
                        }
                      }
                    } else {
                      var8++;
                      continue L7;
                    }
                  }
                }
              } else {
                var11 = param0[var7];
                var14 = var11;
                var8_ref_ob = var14;
                if (var8_ref_ob != null) {
                  var9_int = 0;
                  L12: while (true) {
                    if (var9_int >= var14.field_ob) {
                      var9_int = 0;
                      L13: while (true) {
                        if (var9_int >= var14.field_E) {
                          var9_int = 0;
                          L14: while (true) {
                            if (var9_int < var14.field_nb) {
                              this.field_t[this.field_ib] = var11.field_t[var9_int];
                              this.field_V[this.field_ib] = var11.field_V[var9_int];
                              this.field_gb[this.field_ib] = var11.field_gb[var9_int];
                              this.field_ib = this.field_ib + 1;
                              var9_int++;
                              continue L14;
                            } else {
                              var7++;
                              continue L6;
                            }
                          }
                        } else {
                          L15: {
                            if (var11.field_k[var9_int] >= var14.field_nb) {
                              break L15;
                            } else {
                              this.field_k[this.field_E] = var11.field_k[var9_int] + this.field_ib;
                              break L15;
                            }
                          }
                          L16: {
                            if (var11.field_I[var9_int] >= var14.field_nb) {
                              break L16;
                            } else {
                              this.field_I[this.field_E] = var11.field_I[var9_int] + this.field_ib;
                              break L16;
                            }
                          }
                          L17: {
                            if (var11.field_Y[var9_int] >= var14.field_nb) {
                              break L17;
                            } else {
                              this.field_Y[this.field_E] = var11.field_Y[var9_int] + this.field_ib;
                              break L17;
                            }
                          }
                          this.field_E = this.field_E + 1;
                          var9_int++;
                          continue L13;
                        }
                      }
                    } else {
                      L18: {
                        this.field_kb[this.field_ob] = var11.field_kb[var9_int] + this.field_ib;
                        this.field_A[this.field_ob] = var11.field_A[var9_int] + this.field_ib;
                        this.field_p[this.field_ob] = var11.field_p[var9_int] + this.field_ib;
                        this.field_hb[this.field_ob] = var11.field_hb[var9_int];
                        this.field_M[this.field_ob] = var11.field_M[var9_int];
                        this.field_j[this.field_ob] = var11.field_j[var9_int];
                        this.field_J[this.field_ob] = var11.field_J[var9_int];
                        if (var3 == 0) {
                          break L18;
                        } else {
                          if (var14.field_U == null) {
                            this.field_U[this.field_ob] = var11.field_K;
                            break L18;
                          } else {
                            this.field_U[this.field_ob] = var11.field_U[var9_int];
                            break L18;
                          }
                        }
                      }
                      L19: {
                        if (var4 == 0) {
                          break L19;
                        } else {
                          if (var14.field_eb == null) {
                            break L19;
                          } else {
                            this.field_eb[this.field_ob] = var11.field_eb[var9_int];
                            break L19;
                          }
                        }
                      }
                      L20: {
                        if (var5 == 0) {
                          break L20;
                        } else {
                          if (var14.field_r == null) {
                            this.field_r[this.field_ob] = (short)-1;
                            break L20;
                          } else {
                            this.field_r[this.field_ob] = var11.field_r[var9_int];
                            break L20;
                          }
                        }
                      }
                      L21: {
                        if (var6 == 0) {
                          break L21;
                        } else {
                          L22: {
                            L23: {
                              stackOut_48_0 = this.field_u;
                              stackOut_48_1 = this.field_ob;
                              stackIn_51_0 = stackOut_48_0;
                              stackIn_51_1 = stackOut_48_1;
                              stackIn_49_0 = stackOut_48_0;
                              stackIn_49_1 = stackOut_48_1;
                              if (var14.field_u == null) {
                                break L23;
                              } else {
                                stackOut_49_0 = (byte[]) ((Object) stackIn_49_0);
                                stackOut_49_1 = stackIn_49_1;
                                stackIn_51_0 = stackOut_49_0;
                                stackIn_51_1 = stackOut_49_1;
                                stackIn_50_0 = stackOut_49_0;
                                stackIn_50_1 = stackOut_49_1;
                                if (var11.field_u[var9_int] == -1) {
                                  break L23;
                                } else {
                                  stackOut_50_0 = (byte[]) ((Object) stackIn_50_0);
                                  stackOut_50_1 = stackIn_50_1;
                                  stackOut_50_2 = var11.field_u[var9_int] + this.field_E;
                                  stackIn_52_0 = stackOut_50_0;
                                  stackIn_52_1 = stackOut_50_1;
                                  stackIn_52_2 = stackOut_50_2;
                                  break L22;
                                }
                              }
                            }
                            stackOut_51_0 = (byte[]) ((Object) stackIn_51_0);
                            stackOut_51_1 = stackIn_51_1;
                            stackOut_51_2 = -1;
                            stackIn_52_0 = stackOut_51_0;
                            stackIn_52_1 = stackOut_51_1;
                            stackIn_52_2 = stackOut_51_2;
                            break L22;
                          }
                          stackIn_52_0[stackIn_52_1] = (byte)stackIn_52_2;
                          break L21;
                        }
                      }
                      this.field_ob = this.field_ob + 1;
                      var9_int++;
                      continue L12;
                    }
                  }
                } else {
                  var7++;
                  continue L6;
                }
              }
            }
          } else {
            var13 = param0[var7];
            var8_ref_ob = var13;
            if (var8_ref_ob != null) {
              L24: {
                this.field_ib = this.field_ib + var13.field_ib;
                this.field_ob = this.field_ob + var13.field_ob;
                this.field_E = this.field_E + var13.field_E;
                if (var13.field_U == null) {
                  L25: {
                    if (this.field_K != -1) {
                      break L25;
                    } else {
                      this.field_K = var13.field_K;
                      break L25;
                    }
                  }
                  if (this.field_K == var13.field_K) {
                    break L24;
                  } else {
                    var3 = 1;
                    break L24;
                  }
                } else {
                  var3 = 1;
                  break L24;
                }
              }
              L26: {
                stackOut_10_0 = var4;
                stackIn_12_0 = stackOut_10_0;
                stackIn_11_0 = stackOut_10_0;
                if (var13.field_eb == null) {
                  stackOut_12_0 = stackIn_12_0;
                  stackOut_12_1 = 0;
                  stackIn_13_0 = stackOut_12_0;
                  stackIn_13_1 = stackOut_12_1;
                  break L26;
                } else {
                  stackOut_11_0 = stackIn_11_0;
                  stackOut_11_1 = 1;
                  stackIn_13_0 = stackOut_11_0;
                  stackIn_13_1 = stackOut_11_1;
                  break L26;
                }
              }
              L27: {
                var4 = stackIn_13_0 | stackIn_13_1;
                stackOut_13_0 = var5;
                stackIn_15_0 = stackOut_13_0;
                stackIn_14_0 = stackOut_13_0;
                if (var13.field_r == null) {
                  stackOut_15_0 = stackIn_15_0;
                  stackOut_15_1 = 0;
                  stackIn_16_0 = stackOut_15_0;
                  stackIn_16_1 = stackOut_15_1;
                  break L27;
                } else {
                  stackOut_14_0 = stackIn_14_0;
                  stackOut_14_1 = 1;
                  stackIn_16_0 = stackOut_14_0;
                  stackIn_16_1 = stackOut_14_1;
                  break L27;
                }
              }
              L28: {
                var5 = stackIn_16_0 | stackIn_16_1;
                stackOut_16_0 = var6;
                stackIn_18_0 = stackOut_16_0;
                stackIn_17_0 = stackOut_16_0;
                if (var13.field_u == null) {
                  stackOut_18_0 = stackIn_18_0;
                  stackOut_18_1 = 0;
                  stackIn_19_0 = stackOut_18_0;
                  stackIn_19_1 = stackOut_18_1;
                  break L28;
                } else {
                  stackOut_17_0 = stackIn_17_0;
                  stackOut_17_1 = 1;
                  stackIn_19_0 = stackOut_17_0;
                  stackIn_19_1 = stackOut_17_1;
                  break L28;
                }
              }
              var6 = stackIn_19_0 | stackIn_19_1;
              var7++;
              continue L0;
            } else {
              var7++;
              continue L0;
            }
          }
        }
    }

    static {
        field_o = new ob();
        field_h = new short[1];
        field_n = new int[1];
        field_cb = new byte[1];
        field_jb = new int[1];
        field_O = new int[1];
        ob discarded$0 = new ob();
        ob discarded$1 = new ob();
        field_x = new int[10];
        field_w = new int[10];
        field_C = new int[4096];
        field_l = new boolean[4096];
        field_g = new int[12][4096];
        field_D = new int[4096];
        field_q = new int[4096];
        field_bb = new int[4096];
        field_S = new int[4096];
        field_X = 0;
        field_db = new int[4096];
        field_lb = new int[12];
        field_W = new int[12];
        field_mb = false;
        field_G = new int[4096];
        field_Q = new boolean[4096];
        field_Z = false;
        if (field_Z) {
            field_pb = new int[4096];
            field_z = new int[4096];
        } else {
            field_H = new int[1600];
            field_ab = new int[1600][64];
            field_P = new int[32];
            field_f = new int[32][512];
        }
        field_L = new int[10];
        field_F = new int[4096];
    }
}
