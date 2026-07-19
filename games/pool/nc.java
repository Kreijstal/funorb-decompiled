/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nc extends fa {
    private byte[] field_bb;
    private int[] field_y;
    private boolean field_U;
    int[] field_T;
    int field_P;
    private short field_O;
    int[] field_t;
    private int[] field_i;
    int[] field_R;
    private byte[] field_h;
    private int field_u;
    int[] field_Q;
    int[] field_D;
    private short[] field_Z;
    private byte[] field_M;
    private int[] field_W;
    private short field_w;
    private short field_G;
    private short field_V;
    private int field_s;
    private int[] field_n;
    int[] field_j;
    private int[] field_ab;
    private short field_B;
    private int field_eb;
    private static int[] field_db;
    int[] field_J;
    private static int[] field_x;
    private short field_r;
    private static boolean[] field_I;
    private static int[] field_m;
    private short field_N;
    private static int[][] field_E;
    private static int[] field_p;
    static int[] field_Y;
    private static int[] field_g;
    private static int[] field_A;
    private static int[] field_v;
    private static int[] field_F;
    private static int[] field_X;
    private static int field_S;
    private static int[] field_L;
    private static int[][] field_l;
    private static int[] field_K;
    private static int[] field_cb;
    private static int[] field_z;
    private static int[] field_C;
    private static int[][] field_o;
    private static int[] field_f;
    private static int[] field_H;
    private static boolean[] field_q;
    private static boolean field_k;

    final int b() {
        if (!this.field_U) {
            this.c();
        }
        return this.field_N;
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

    public static void e() {
        field_q = null;
        field_I = null;
        field_X = null;
        field_v = null;
        field_x = null;
        field_L = null;
        field_db = null;
        field_f = null;
        field_Y = null;
        field_o = (int[][]) null;
        field_g = null;
        field_E = (int[][]) null;
        field_C = null;
        field_m = null;
        field_A = null;
        field_l = (int[][]) null;
        field_K = null;
        field_z = null;
        field_F = null;
        field_H = null;
        field_cb = null;
        field_p = null;
    }

    final int i() {
        if (!this.field_U) {
            this.c();
        }
        return this.field_r;
    }

    final void b(int[] param0, int[] param1) {
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
          if (this.field_U) {
            break L0;
          } else {
            this.c();
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
        if (var5 >= 50 - this.field_w) {
          var15 = this.field_w * 92682 >> 16;
          if (var3 >= -var5 - var15) {
            if (var3 <= var5 + var15) {
              if (var4 >= -var5 - var15) {
                if (var4 <= var5 + var15) {
                  L1: {
                    if (var5 > 50 + this.field_w) {
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
                      if (this.field_eb > 0) {
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
                  var18 = fb.field_q;
                  var19 = fb.field_d;
                  var20 = 0;
                  var27 = 0;
                  var21_int = var27;
                  L3: while (true) {
                    if (var27 >= this.field_s) {
                      try {
                        L4: {
                          this.a((var20 & var16) != 0, false, 0L, (int) this.field_w, this.field_w << 1);
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
                        var23 = this.field_Q[var27];
                        var24 = this.field_D[var27];
                        var25 = var22 * var6 + var23 * var9 + var24 * var12 >> 16;
                        var26 = var22 * var7 + var23 * var10 + var24 * var13 >> 16;
                        var24 = var22 * var8 + var23 * var11 + var24 * var14 >> 16;
                        var22 = var25;
                        var23 = var26;
                        field_x[var27] = var24;
                        var22 = var22 + var3;
                        var23 = var23 + var4;
                        var24 = var24 + var5;
                        if (var24 < 50) {
                          field_X[var27] = -5000;
                          var20 = 1;
                          break L6;
                        } else {
                          field_X[var27] = var18 + (var22 << 9) / var24;
                          field_v[var27] = var19 + (var23 << 9) / var24;
                          break L6;
                        }
                      }
                      if (var17 != 0) {
                        field_L[var27] = var22;
                        field_db[var27] = var23;
                        field_f[var27] = var24;
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

    private final void c() {
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
          if (var9 >= this.field_u) {
            this.field_N = (short)var1;
            this.field_V = (short)var4;
            this.field_B = (short)var2;
            this.field_G = (short)var5;
            this.field_O = (short)var3;
            this.field_r = (short)var6;
            this.field_w = (short)(int)(Math.sqrt((double)var8) + 0.99);
            this.field_U = true;
            return;
          } else {
            L1: {
              var10 = this.field_t[var9];
              var11 = this.field_Q[var9];
              var12 = this.field_D[var9];
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

    private final void c(int param0) {
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
          var2 = fb.field_q;
          var3 = fb.field_d;
          var4 = 0;
          var5 = this.field_j[param0];
          var6 = this.field_T[param0];
          var7 = this.field_R[param0];
          var8 = field_f[var5];
          var9 = field_f[var6];
          var10 = field_f[var7];
          if (this.field_bb != null) {
            fb.field_c = this.field_bb[param0] & 255;
            break L0;
          } else {
            fb.field_c = 0;
            break L0;
          }
        }
        L1: {
          if (var8 < 50) {
            L2: {
              var11 = field_L[var5];
              var12 = field_db[var5];
              var13 = this.field_W[param0] & 65535;
              if (var10 < 50) {
                break L2;
              } else {
                var14 = (50 - var8) * fb.field_f[var10 - var8];
                field_H[var4] = var2 + (var11 + ((field_L[var7] - var11) * var14 >> 16) << 9) / 50;
                field_cb[var4] = var3 + (var12 + ((field_db[var7] - var12) * var14 >> 16) << 9) / 50;
                incrementValue$9 = var4;
                var4++;
                field_p[incrementValue$9] = var13 + (((this.field_J[param0] & 65535) - var13) * var14 >> 16);
                break L2;
              }
            }
            if (var9 < 50) {
              break L1;
            } else {
              var14 = (50 - var8) * fb.field_f[var9 - var8];
              field_H[var4] = var2 + (var11 + ((field_L[var6] - var11) * var14 >> 16) << 9) / 50;
              field_cb[var4] = var3 + (var12 + ((field_db[var6] - var12) * var14 >> 16) << 9) / 50;
              incrementValue$10 = var4;
              var4++;
              field_p[incrementValue$10] = var13 + (((this.field_y[param0] & 65535) - var13) * var14 >> 16);
              break L1;
            }
          } else {
            field_H[var4] = field_X[var5];
            field_cb[var4] = field_v[var5];
            incrementValue$11 = var4;
            var4++;
            field_p[incrementValue$11] = this.field_W[param0] & 65535;
            break L1;
          }
        }
        L3: {
          if (var9 < 50) {
            L4: {
              var11 = field_L[var6];
              var12 = field_db[var6];
              var13 = this.field_y[param0] & 65535;
              if (var8 < 50) {
                break L4;
              } else {
                var14 = (50 - var9) * fb.field_f[var8 - var9];
                field_H[var4] = var2 + (var11 + ((field_L[var5] - var11) * var14 >> 16) << 9) / 50;
                field_cb[var4] = var3 + (var12 + ((field_db[var5] - var12) * var14 >> 16) << 9) / 50;
                incrementValue$12 = var4;
                var4++;
                field_p[incrementValue$12] = var13 + (((this.field_W[param0] & 65535) - var13) * var14 >> 16);
                break L4;
              }
            }
            if (var10 < 50) {
              break L3;
            } else {
              var14 = (50 - var9) * fb.field_f[var10 - var9];
              field_H[var4] = var2 + (var11 + ((field_L[var7] - var11) * var14 >> 16) << 9) / 50;
              field_cb[var4] = var3 + (var12 + ((field_db[var7] - var12) * var14 >> 16) << 9) / 50;
              incrementValue$13 = var4;
              var4++;
              field_p[incrementValue$13] = var13 + (((this.field_J[param0] & 65535) - var13) * var14 >> 16);
              break L3;
            }
          } else {
            field_H[var4] = field_X[var6];
            field_cb[var4] = field_v[var6];
            incrementValue$14 = var4;
            var4++;
            field_p[incrementValue$14] = this.field_y[param0] & 65535;
            break L3;
          }
        }
        L5: {
          if (var10 < 50) {
            L6: {
              var11 = field_L[var7];
              var12 = field_db[var7];
              var13 = this.field_J[param0] & 65535;
              if (var9 < 50) {
                break L6;
              } else {
                var14 = (50 - var10) * fb.field_f[var9 - var10];
                field_H[var4] = var2 + (var11 + ((field_L[var6] - var11) * var14 >> 16) << 9) / 50;
                field_cb[var4] = var3 + (var12 + ((field_db[var6] - var12) * var14 >> 16) << 9) / 50;
                incrementValue$15 = var4;
                var4++;
                field_p[incrementValue$15] = var13 + (((this.field_y[param0] & 65535) - var13) * var14 >> 16);
                break L6;
              }
            }
            if (var8 < 50) {
              break L5;
            } else {
              var14 = (50 - var10) * fb.field_f[var8 - var10];
              field_H[var4] = var2 + (var11 + ((field_L[var5] - var11) * var14 >> 16) << 9) / 50;
              field_cb[var4] = var3 + (var12 + ((field_db[var5] - var12) * var14 >> 16) << 9) / 50;
              incrementValue$16 = var4;
              var4++;
              field_p[incrementValue$16] = var13 + (((this.field_W[param0] & 65535) - var13) * var14 >> 16);
              break L5;
            }
          } else {
            field_H[var4] = field_X[var7];
            field_cb[var4] = field_v[var7];
            incrementValue$17 = var4;
            var4++;
            field_p[incrementValue$17] = this.field_J[param0] & 65535;
            break L5;
          }
        }
        L7: {
          var11 = field_H[0];
          var12 = field_H[1];
          var13 = field_H[2];
          var14 = field_cb[0];
          var15 = field_cb[1];
          var16 = field_cb[2];
          fb.field_n = false;
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
                      if (var11 > fb.field_k) {
                        break L9;
                      } else {
                        if (var12 > fb.field_k) {
                          break L9;
                        } else {
                          if (var13 <= fb.field_k) {
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
              fb.field_n = true;
              break L8;
            }
            L10: {
              if (this.field_Z == null) {
                break L10;
              } else {
                if (this.field_Z[param0] != -1) {
                  L11: {
                    L12: {
                      if (this.field_h == null) {
                        break L12;
                      } else {
                        if (this.field_h[param0] == -1) {
                          break L12;
                        } else {
                          var20 = this.field_h[param0] & 255;
                          var17 = this.field_ab[var20];
                          var18 = this.field_n[var20];
                          var19 = this.field_i[var20];
                          break L11;
                        }
                      }
                    }
                    var17 = var5;
                    var18 = var6;
                    var19 = var7;
                    break L11;
                  }
                  if (this.field_J[param0] != -1) {
                    fb.a(var14, var15, var16, var11, var12, var13, field_p[0], field_p[1], field_p[2], field_L[var17], field_L[var18], field_L[var19], field_db[var17], field_db[var18], field_db[var19], field_f[var17], field_f[var18], field_f[var19], (int) this.field_Z[param0]);
                    break L7;
                  } else {
                    fb.a(var14, var15, var16, var11, var12, var13, this.field_W[param0], this.field_W[param0], this.field_W[param0], field_L[var17], field_L[var18], field_L[var19], field_db[var17], field_db[var18], field_db[var19], field_f[var17], field_f[var18], field_f[var19], (int) this.field_Z[param0]);
                    break L7;
                  }
                } else {
                  break L10;
                }
              }
            }
            if (this.field_J[param0] != -1) {
              fb.a(var14, var15, var16, var11, var12, var13, field_p[0], field_p[1], field_p[2]);
              break L7;
            } else {
              fb.a(var14, var15, var16, var11, var12, var13, fb.field_b[this.field_W[param0] & 65535]);
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
                    if (var11 > fb.field_k) {
                      break L14;
                    } else {
                      if (var12 > fb.field_k) {
                        break L14;
                      } else {
                        if (var13 > fb.field_k) {
                          break L14;
                        } else {
                          if (field_H[3] < 0) {
                            break L14;
                          } else {
                            if (field_H[3] <= fb.field_k) {
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
            fb.field_n = true;
            break L13;
          }
          L15: {
            L16: {
              if (this.field_Z == null) {
                break L16;
              } else {
                if (this.field_Z[param0] != -1) {
                  L17: {
                    L18: {
                      if (this.field_h == null) {
                        break L18;
                      } else {
                        if (this.field_h[param0] == -1) {
                          break L18;
                        } else {
                          var20 = this.field_h[param0] & 255;
                          var17 = this.field_ab[var20];
                          var18 = this.field_n[var20];
                          var19 = this.field_i[var20];
                          break L17;
                        }
                      }
                    }
                    var17 = var5;
                    var18 = var6;
                    var19 = var7;
                    break L17;
                  }
                  var20 = this.field_Z[param0];
                  if (this.field_J[param0] != -1) {
                    fb.a(var14, var15, var16, var11, var12, var13, field_p[0], field_p[1], field_p[2], field_L[var17], field_L[var18], field_L[var19], field_db[var17], field_db[var18], field_db[var19], field_f[var17], field_f[var18], field_f[var19], var20);
                    fb.a(var14, var16, field_cb[3], var11, var13, field_H[3], field_p[0], field_p[2], field_p[3], field_L[var17], field_L[var18], field_L[var19], field_db[var17], field_db[var18], field_db[var19], field_f[var17], field_f[var18], field_f[var19], var20);
                    break L15;
                  } else {
                    fb.a(var14, var15, var16, var11, var12, var13, this.field_W[param0], this.field_W[param0], this.field_W[param0], field_L[var17], field_L[var18], field_L[var19], field_db[var17], field_db[var18], field_db[var19], field_f[var17], field_f[var18], field_f[var19], var20);
                    fb.a(var14, var16, field_cb[3], var11, var13, field_H[3], this.field_W[param0], this.field_W[param0], this.field_W[param0], field_L[var17], field_L[var18], field_L[var19], field_db[var17], field_db[var18], field_db[var19], field_f[var17], field_f[var18], field_f[var19], var20);
                    break L15;
                  }
                } else {
                  break L16;
                }
              }
            }
            if (this.field_J[param0] != -1) {
              fb.a(var14, var15, var16, var11, var12, var13, field_p[0], field_p[1], field_p[2]);
              fb.a(var14, var16, field_cb[3], var11, var13, field_H[3], field_p[0], field_p[2], field_p[3]);
              break L15;
            } else {
              var17 = fb.field_b[this.field_W[param0] & 65535];
              fb.a(var14, var15, var16, var11, var12, var13, var17);
              fb.a(var14, var16, field_cb[3], var11, var13, field_H[3], var17);
              break L15;
            }
          }
          return;
        }
    }

    final int a() {
        if (!this.field_U) {
            this.c();
        }
        return this.field_w;
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
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        Exception var33 = null;
        int var33_int = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int stackIn_15_0 = 0;
        int stackIn_21_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_16_0 = 0;
        L0: {
          if (this.field_U) {
            break L0;
          } else {
            this.c();
            break L0;
          }
        }
        var3 = param1[0] - param0[0];
        var4 = param1[1] - param0[1];
        var5 = param1[2] - param0[2];
        var6 = param0[3];
        var7 = param0[4];
        var8 = param0[5];
        var9 = param0[6];
        var10 = param0[7];
        var11 = param0[8];
        var12 = param0[9];
        var13 = param0[10];
        var14 = param0[11];
        var15 = param1[3];
        var16 = param1[4];
        var17 = param1[5];
        var18 = param1[6];
        var19 = param1[7];
        var20 = param1[8];
        var21 = param1[9];
        var22 = param1[10];
        var23 = param1[11];
        var24 = var3 * var6 + var4 * var7 + var5 * var8 >> 16;
        var25 = var3 * var9 + var4 * var10 + var5 * var11 >> 16;
        var26 = var3 * var12 + var4 * var13 + var5 * var14 >> 16;
        if (var26 >= 50 - this.field_w) {
          var27 = this.field_w * 92682 >> 16;
          if (var24 >= -var26 - var27) {
            if (var24 <= var26 + var27) {
              if (var25 >= -var26 - var27) {
                if (var25 <= var26 + var27) {
                  L1: {
                    if (var26 > 50 + this.field_w) {
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
                    var28 = stackIn_15_0;
                    if (var28 == 0) {
                      if (this.field_eb > 0) {
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
                  var29 = stackIn_21_0;
                  var30 = fb.field_q;
                  var31 = fb.field_d;
                  var32 = 0;
                  var33_int = 0;
                  L3: while (true) {
                    if (var33_int >= this.field_s) {
                      try {
                        L4: {
                          this.a((var32 & var28) != 0, false, 0L, (int) this.field_w, this.field_w << 1);
                          break L4;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L5: {
                          var33 = (Exception) (Object) decompiledCaughtException;
                          break L5;
                        }
                      }
                      return;
                    } else {
                      L6: {
                        var34 = this.field_t[var33_int];
                        var35 = this.field_Q[var33_int];
                        var36 = this.field_D[var33_int];
                        var37 = var34 * var15 + var35 * var18 + var36 * var21 >> 16;
                        var38 = var34 * var16 + var35 * var19 + var36 * var22 >> 16;
                        var36 = var34 * var17 + var35 * var20 + var36 * var23 >> 16;
                        var34 = var37;
                        var35 = var38;
                        var34 = var34 + var3;
                        var35 = var35 + var4;
                        var36 = var36 + var5;
                        var37 = var34 * var6 + var35 * var7 + var36 * var8 >> 16;
                        var38 = var34 * var9 + var35 * var10 + var36 * var11 >> 16;
                        var36 = var34 * var12 + var35 * var13 + var36 * var14 >> 16;
                        var34 = var37;
                        var35 = var38;
                        field_x[var33_int] = var36 - var26;
                        if (var36 < 50) {
                          field_X[var33_int] = -5000;
                          var32 = 1;
                          break L6;
                        } else {
                          field_X[var33_int] = var30 + (var34 << 9) / var36;
                          field_v[var33_int] = var31 + (var35 << 9) / var36;
                          break L6;
                        }
                      }
                      if (var29 != 0) {
                        field_L[var33_int] = var34;
                        field_db[var33_int] = var35;
                        field_f[var33_int] = var36;
                        var33_int++;
                        continue L3;
                      } else {
                        var33_int++;
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

    final int f() {
        if (!this.field_U) {
            this.c();
        }
        return this.field_V;
    }

    final int h() {
        if (!this.field_U) {
            this.c();
        }
        return this.field_G;
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

    final int g() {
        if (!this.field_U) {
            this.c();
        }
        return this.field_B;
    }

    final int d() {
        if (!this.field_U) {
            this.c();
        }
        return this.field_O;
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
            if (field_k) {
              break L0;
            } else {
              var8 = 0;
              L1: while (true) {
                if (var8 >= 1600) {
                  var8 = 0;
                  L2: while (true) {
                    if (var8 >= 32) {
                      field_S = 0;
                      break L0;
                    } else {
                      field_g[var8] = 0;
                      var8++;
                      continue L2;
                    }
                  }
                } else {
                  field_Y[var8] = 0;
                  var8++;
                  continue L1;
                }
              }
            }
          }
          var8 = 0;
          L3: while (true) {
            if (var8 >= this.field_P) {
              L4: {
                if (!field_k) {
                  if (this.field_M != null) {
                    var8 = 0;
                    L5: while (true) {
                      if (var8 >= 12) {
                        var8 = param4 - 1;
                        L6: while (true) {
                          if (var8 < 0) {
                            break L4;
                          } else {
                            L7: {
                              var9 = field_Y[var8];
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
                                var47 = field_o[var8];
                                var12 = 0;
                                L9: while (true) {
                                  if (var12 >= var10) {
                                    break L7;
                                  } else {
                                    var13 = var47[var12];
                                    var14_int = this.field_M[var13];
                                    field_A[var14_int] = field_A[var14_int] + 1;
                                    var15_int = field_A[var14_int];
                                    field_l[var14_int][var15_int] = var13;
                                    if (var14_int >= 10) {
                                      if (var14_int != 10) {
                                        field_z[var15_int] = var8;
                                        var12++;
                                        continue L9;
                                      } else {
                                        field_K[var15_int] = var8;
                                        var12++;
                                        continue L9;
                                      }
                                    } else {
                                      field_F[var14_int] = field_F[var14_int] + var8;
                                      var12++;
                                      continue L9;
                                    }
                                  }
                                }
                              }
                            }
                            if (var9 > 64) {
                              var10 = field_Y[var8] - 64 - 1;
                              var48 = field_E[var10];
                              var12 = 0;
                              L10: while (true) {
                                if (var12 < field_g[var10]) {
                                  var13 = var48[var12];
                                  var14_int = this.field_M[var13];
                                  field_A[var14_int] = field_A[var14_int] + 1;
                                  var15_int = field_A[var14_int];
                                  field_l[var14_int][var15_int] = var13;
                                  if (var14_int >= 10) {
                                    if (var14_int != 10) {
                                      field_z[var15_int] = var8;
                                      var12++;
                                      continue L10;
                                    } else {
                                      field_K[var15_int] = var8;
                                      var12++;
                                      continue L10;
                                    }
                                  } else {
                                    field_F[var14_int] = field_F[var14_int] + var8;
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
                        field_A[var8] = 0;
                        field_F[var8] = 0;
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
                          var9 = field_Y[var8];
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
                            var45 = field_o[var8];
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
                          var10 = field_Y[var8] - 64 - 1;
                          var46 = field_E[var10];
                          var12 = 0;
                          L15: while (true) {
                            if (var12 < field_g[var10]) {
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
                  hq.a(0, field_C, field_m, var7 - 1, (byte) 80);
                  if (this.field_M != null) {
                    var8 = 0;
                    L16: while (true) {
                      if (var8 >= 12) {
                        var8 = 0;
                        L17: while (true) {
                          if (var8 >= var7) {
                            break L4;
                          } else {
                            var9 = field_m[var8];
                            var10 = field_C[var8];
                            var11 = this.field_M[var9];
                            field_A[var11] = field_A[var11] + 1;
                            var12 = field_A[var11];
                            field_l[var11][var12] = var9;
                            if (var11 >= 10) {
                              if (var11 != 10) {
                                field_z[var12] = var10;
                                var8++;
                                continue L17;
                              } else {
                                field_K[var12] = var10;
                                var8++;
                                continue L17;
                              }
                            } else {
                              field_F[var11] = field_F[var11] + var10;
                              var8++;
                              continue L17;
                            }
                          }
                        }
                      } else {
                        field_A[var8] = 0;
                        field_F[var8] = 0;
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
                        this.b(field_m[var8]);
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
                  if (field_A[1] > 0) {
                    break L20;
                  } else {
                    if (field_A[2] <= 0) {
                      break L19;
                    } else {
                      break L20;
                    }
                  }
                }
                var8 = (field_F[1] + field_F[2]) / (field_A[1] + field_A[2]);
                break L19;
              }
              L21: {
                L22: {
                  var9 = 0;
                  if (field_A[3] > 0) {
                    break L22;
                  } else {
                    if (field_A[4] <= 0) {
                      break L21;
                    } else {
                      break L22;
                    }
                  }
                }
                var9 = (field_F[3] + field_F[4]) / (field_A[3] + field_A[4]);
                break L21;
              }
              L23: {
                L24: {
                  var10 = 0;
                  if (field_A[6] > 0) {
                    break L24;
                  } else {
                    if (field_A[8] <= 0) {
                      break L23;
                    } else {
                      break L24;
                    }
                  }
                }
                var10 = (field_F[6] + field_F[8]) / (field_A[6] + field_A[8]);
                break L23;
              }
              L25: {
                var12 = 0;
                var13 = field_A[10];
                var14 = field_l[10];
                var15 = field_K;
                if (var12 != var13) {
                  break L25;
                } else {
                  var12 = 0;
                  var13 = field_A[11];
                  var14 = field_l[11];
                  var15 = field_z;
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
                        this.b(var14[incrementValue$9]);
                        if (var12 != var13) {
                          break L29;
                        } else {
                          if (var14 == field_l[11]) {
                            break L29;
                          } else {
                            var12 = 0;
                            var14 = field_l[11];
                            var13 = field_A[11];
                            var15 = field_z;
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
                            this.b(var14[incrementValue$10]);
                            if (var12 != var13) {
                              break L32;
                            } else {
                              if (var14 == field_l[11]) {
                                break L32;
                              } else {
                                var12 = 0;
                                var13 = field_A[11];
                                var14 = field_l[11];
                                var15 = field_z;
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
                              this.b(var14[incrementValue$11]);
                              if (var12 != var13) {
                                break L35;
                              } else {
                                if (var14 == field_l[11]) {
                                  break L35;
                                } else {
                                  var12 = 0;
                                  var13 = field_A[11];
                                  var14 = field_l[11];
                                  var15 = field_z;
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
                                this.b(var14[incrementValue$12]);
                                if (var12 != var13) {
                                  break L38;
                                } else {
                                  if (var14 == field_l[11]) {
                                    break L38;
                                  } else {
                                    var12 = 0;
                                    var13 = field_A[11];
                                    var14 = field_l[11];
                                    var15 = field_z;
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
                        var17 = field_A[var16];
                        var49 = field_l[var16];
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
              if (this.field_J[var8] != -2) {
                L40: {
                  var9 = this.field_j[var8];
                  var10 = this.field_T[var8];
                  var11 = this.field_R[var8];
                  var12 = field_X[var9];
                  var13 = field_X[var10];
                  var14_int = field_X[var11];
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
                    var15_int = field_L[var9];
                    var16 = field_L[var10];
                    var17 = field_L[var11];
                    var18 = field_db[var9];
                    var19 = field_db[var10];
                    var20 = field_db[var11];
                    var21 = field_f[var9];
                    var22 = field_f[var10];
                    var23 = field_f[var11];
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
                      field_I[var8] = true;
                      if (!field_k) {
                        var27 = (field_x[var9] + field_x[var10] + field_x[var11]) / 3 + param3;
                        if (field_Y[var27] >= 64) {
                          L42: {
                            var28 = field_Y[var27];
                            if (var28 != 64) {
                              break L42;
                            } else {
                              if (field_S != 512) {
                                fieldTemp$13 = field_S;
                                field_S = field_S + 1;
                                var28 = 65 + fieldTemp$13;
                                field_Y[var27] = 65 + fieldTemp$13;
                                break L42;
                              } else {
                                var8++;
                                continue L3;
                              }
                            }
                          }
                          var28 -= 65;
                          field_g[var28] = field_g[var28] + 1;
                          field_E[var28][field_g[var28]] = var8;
                          var8++;
                          continue L3;
                        } else {
                          field_Y[var27] = field_Y[var27] + 1;
                          field_o[var27][field_Y[var27]] = var8;
                          var8++;
                          continue L3;
                        }
                      } else {
                        field_C[var7] = (field_x[var9] + field_x[var10] + field_x[var11]) / 3;
                        incrementValue$14 = var7;
                        var7++;
                        field_m[incrementValue$14] = var8;
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
                    if (!this.a(tp.field_b + fb.field_q, ao.field_Rb + fb.field_d, field_v[var9], field_v[var10], field_v[var11], var12, var13, var14_int)) {
                      break L43;
                    } else {
                      fieldTemp$15 = qd.field_g;
                      qd.field_g = qd.field_g + 1;
                      dq.field_d[fieldTemp$15] = param2;
                      param1 = false;
                      break L43;
                    }
                  }
                }
                if ((var12 - var13) * (field_v[var11] - field_v[var10]) - (field_v[var9] - field_v[var10]) * (var14_int - var13) > 0) {
                  L44: {
                    L45: {
                      field_I[var8] = false;
                      if (var12 < 0) {
                        break L45;
                      } else {
                        if (var13 < 0) {
                          break L45;
                        } else {
                          if (var14_int < 0) {
                            break L45;
                          } else {
                            if (var12 > fb.field_k) {
                              break L45;
                            } else {
                              if (var13 > fb.field_k) {
                                break L45;
                              } else {
                                if (var14_int <= fb.field_k) {
                                  field_q[var8] = false;
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
                    field_q[var8] = true;
                    break L44;
                  }
                  if (!field_k) {
                    var15_int = (field_x[var9] + field_x[var10] + field_x[var11]) / 3 + param3;
                    if (field_Y[var15_int] >= 64) {
                      L46: {
                        var16 = field_Y[var15_int];
                        if (var16 != 64) {
                          break L46;
                        } else {
                          if (field_S != 512) {
                            fieldTemp$16 = field_S;
                            field_S = field_S + 1;
                            var16 = 65 + fieldTemp$16;
                            field_Y[var15_int] = 65 + fieldTemp$16;
                            break L46;
                          } else {
                            var8++;
                            continue L3;
                          }
                        }
                      }
                      var16 -= 65;
                      field_g[var16] = field_g[var16] + 1;
                      field_E[var16][field_g[var16]] = var8;
                      var8++;
                      continue L3;
                    } else {
                      field_Y[var15_int] = field_Y[var15_int] + 1;
                      field_o[var15_int][field_Y[var15_int]] = var8;
                      var8++;
                      continue L3;
                    }
                  } else {
                    field_C[var7] = (field_x[var9] + field_x[var10] + field_x[var11]) / 3;
                    incrementValue$17 = var7;
                    var7++;
                    field_m[incrementValue$17] = var8;
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
        if (!field_I[param0]) {
          L0: {
            var2 = this.field_j[param0];
            var3 = this.field_T[param0];
            var4 = this.field_R[param0];
            fb.field_n = field_q[param0];
            if (this.field_bb != null) {
              fb.field_c = this.field_bb[param0] & 255;
              break L0;
            } else {
              fb.field_c = 0;
              break L0;
            }
          }
          L1: {
            L2: {
              if (this.field_Z == null) {
                break L2;
              } else {
                if (this.field_Z[param0] != -1) {
                  L3: {
                    L4: {
                      if (this.field_h == null) {
                        break L4;
                      } else {
                        if (this.field_h[param0] == -1) {
                          break L4;
                        } else {
                          var8 = this.field_h[param0] & 255;
                          var5 = this.field_ab[var8];
                          var6 = this.field_n[var8];
                          var7 = this.field_i[var8];
                          break L3;
                        }
                      }
                    }
                    var5 = var2;
                    var6 = var3;
                    var7 = var4;
                    break L3;
                  }
                  if (this.field_J[param0] != -1) {
                    fb.a(field_v[var2], field_v[var3], field_v[var4], field_X[var2], field_X[var3], field_X[var4], this.field_W[param0], this.field_y[param0], this.field_J[param0], field_L[var5], field_L[var6], field_L[var7], field_db[var5], field_db[var6], field_db[var7], field_f[var5], field_f[var6], field_f[var7], (int) this.field_Z[param0]);
                    break L1;
                  } else {
                    fb.a(field_v[var2], field_v[var3], field_v[var4], field_X[var2], field_X[var3], field_X[var4], this.field_W[param0], this.field_W[param0], this.field_W[param0], field_L[var5], field_L[var6], field_L[var7], field_db[var5], field_db[var6], field_db[var7], field_f[var5], field_f[var6], field_f[var7], (int) this.field_Z[param0]);
                    break L1;
                  }
                } else {
                  break L2;
                }
              }
            }
            if (this.field_J[param0] != -1) {
              fb.a(field_v[var2], field_v[var3], field_v[var4], field_X[var2], field_X[var3], field_X[var4], this.field_W[param0] & 65535, this.field_y[param0] & 65535, this.field_J[param0] & 65535);
              break L1;
            } else {
              fb.a(field_v[var2], field_v[var3], field_v[var4], field_X[var2], field_X[var3], field_X[var4], fb.field_b[this.field_W[param0] & 65535]);
              break L1;
            }
          }
          return;
        } else {
          this.c(param0);
          return;
        }
    }

    private nc() {
        this.field_U = false;
        this.field_P = 0;
        this.field_u = 0;
        this.field_s = 0;
        this.field_eb = 0;
    }

    nc(eg param0, int param1, int param2, int param3, int param4, int param5) {
        int incrementValue$1 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var9_ref_int__ = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        ah var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        ef var18 = null;
        ef var19 = null;
        int[] var20 = null;
        L0: {
          this.field_U = false;
          this.field_P = 0;
          this.field_u = 0;
          this.field_s = 0;
          this.field_eb = 0;
          param0.d();
          param0.b();
          this.field_s = param0.field_B;
          this.field_u = param0.field_M;
          this.field_t = param0.field_g;
          this.field_Q = param0.field_Y;
          this.field_D = param0.field_q;
          this.field_P = param0.field_K;
          this.field_j = param0.field_N;
          this.field_T = param0.field_v;
          this.field_R = param0.field_X;
          this.field_M = param0.field_P;
          this.field_bb = param0.field_f;
          var7 = (int)Math.sqrt((double)(param3 * param3 + param4 * param4 + param5 * param5));
          var8 = param2 * var7 >> 8;
          this.field_W = new int[this.field_P];
          this.field_y = new int[this.field_P];
          this.field_J = new int[this.field_P];
          if (param0.field_L == null) {
            this.field_Z = null;
            break L0;
          } else {
            this.field_Z = new short[this.field_P];
            var9 = 0;
            L1: while (true) {
              if (var9 >= this.field_P) {
                break L0;
              } else {
                L2: {
                  var10 = param0.field_L[var9];
                  if (var10 == -1) {
                    break L2;
                  } else {
                    if (!fb.field_i.a((byte) 104, var10)) {
                      break L2;
                    } else {
                      this.field_Z[var9] = (short)var10;
                      var9++;
                      continue L1;
                    }
                  }
                }
                this.field_Z[var9] = (short)-1;
                var9++;
                continue L1;
              }
            }
          }
        }
        L3: {
          if (param0.field_l <= 0) {
            break L3;
          } else {
            if (param0.field_k == null) {
              break L3;
            } else {
              var20 = new int[param0.field_l];
              var17 = var20;
              var9_ref_int__ = var17;
              var10 = 0;
              L4: while (true) {
                if (var10 >= this.field_P) {
                  this.field_eb = 0;
                  var10 = 0;
                  L5: while (true) {
                    if (var10 >= param0.field_l) {
                      this.field_ab = new int[this.field_eb];
                      this.field_n = new int[this.field_eb];
                      this.field_i = new int[this.field_eb];
                      var10 = 0;
                      var11 = 0;
                      L6: while (true) {
                        if (var11 >= param0.field_l) {
                          this.field_h = new byte[this.field_P];
                          var11 = 0;
                          L7: while (true) {
                            if (var11 >= this.field_P) {
                              break L3;
                            } else {
                              if (param0.field_k[var11] == -1) {
                                this.field_h[var11] = (byte)-1;
                                var11++;
                                continue L7;
                              } else {
                                this.field_h[var11] = (byte)var9_ref_int__[param0.field_k[var11] & 255];
                                if (this.field_h[var11] == -1) {
                                  if (this.field_Z != null) {
                                    this.field_Z[var11] = (short)-1;
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
                              if (param0.field_o[var11] != 0) {
                                break L8;
                              } else {
                                this.field_ab[var10] = param0.field_p[var11] & 65535;
                                this.field_n[var10] = param0.field_H[var11] & 65535;
                                this.field_i[var10] = param0.field_C[var11] & 65535;
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
                        if (param0.field_o[var10] == 0) {
                          this.field_eb = this.field_eb + 1;
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
                  if (param0.field_k[var10] != -1) {
                    var9_ref_int__[param0.field_k[var10] & 255] = var9_ref_int__[param0.field_k[var10] & 255] + 1;
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
          if (var16 >= this.field_P) {
            return;
          } else {
            L10: {
              if (param0.field_Q != null) {
                var10 = param0.field_Q[var16];
                break L10;
              } else {
                var10 = 0;
                break L10;
              }
            }
            L11: {
              if (param0.field_f != null) {
                var11 = param0.field_f[var16];
                break L11;
              } else {
                var11 = 0;
                break L11;
              }
            }
            L12: {
              if (this.field_Z != null) {
                var12 = this.field_Z[var16];
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
                  this.field_J[var16] = -2;
                  var16++;
                  continue L9;
                } else {
                  var19 = param0.field_J[var16];
                  var14 = param1 + (param3 * var19.field_b + param4 * var19.field_a + param5 * var19.field_d) / (var8 + var8 / 2);
                  this.field_W[var16] = nc.d(var14);
                  this.field_J[var16] = -1;
                  var16++;
                  continue L9;
                }
              } else {
                L15: {
                  L16: {
                    if (param0.field_m == null) {
                      break L16;
                    } else {
                      if (param0.field_m[this.field_j[var16]] == null) {
                        break L16;
                      } else {
                        var13 = param0.field_m[this.field_j[var16]];
                        break L15;
                      }
                    }
                  }
                  var13 = param0.field_Z[this.field_j[var16]];
                  break L15;
                }
                L17: {
                  L18: {
                    var14 = param1 + (param3 * var13.field_f + param4 * var13.field_j + param5 * var13.field_d) / (var8 * var13.field_a);
                    this.field_W[var16] = nc.d(var14);
                    if (param0.field_m == null) {
                      break L18;
                    } else {
                      if (param0.field_m[this.field_T[var16]] == null) {
                        break L18;
                      } else {
                        var13 = param0.field_m[this.field_T[var16]];
                        break L17;
                      }
                    }
                  }
                  var13 = param0.field_Z[this.field_T[var16]];
                  break L17;
                }
                L19: {
                  L20: {
                    var14 = param1 + (param3 * var13.field_f + param4 * var13.field_j + param5 * var13.field_d) / (var8 * var13.field_a);
                    this.field_y[var16] = nc.d(var14);
                    if (param0.field_m == null) {
                      break L20;
                    } else {
                      if (param0.field_m[this.field_R[var16]] == null) {
                        break L20;
                      } else {
                        var13 = param0.field_m[this.field_R[var16]];
                        break L19;
                      }
                    }
                  }
                  var13 = param0.field_Z[this.field_R[var16]];
                  break L19;
                }
                var14 = param1 + (param3 * var13.field_f + param4 * var13.field_j + param5 * var13.field_d) / (var8 * var13.field_a);
                this.field_J[var16] = nc.d(var14);
                var16++;
                continue L9;
              }
            } else {
              if (var10 != 0) {
                if (var10 != 1) {
                  if (var10 != 3) {
                    this.field_J[var16] = -2;
                    var16++;
                    continue L9;
                  } else {
                    this.field_W[var16] = 128;
                    this.field_J[var16] = -1;
                    var16++;
                    continue L9;
                  }
                } else {
                  var18 = param0.field_J[var16];
                  var14 = param1 + (param3 * var18.field_b + param4 * var18.field_a + param5 * var18.field_d) / (var8 + var8 / 2) << 17;
                  this.field_W[var16] = var14 | nc.b(param0.field_n[var16] & 65535, var14 >> 17);
                  this.field_J[var16] = -1;
                  var16++;
                  continue L9;
                }
              } else {
                L21: {
                  L22: {
                    var15 = param0.field_n[var16] & 65535;
                    if (param0.field_m == null) {
                      break L22;
                    } else {
                      if (param0.field_m[this.field_j[var16]] == null) {
                        break L22;
                      } else {
                        var13 = param0.field_m[this.field_j[var16]];
                        break L21;
                      }
                    }
                  }
                  var13 = param0.field_Z[this.field_j[var16]];
                  break L21;
                }
                L23: {
                  L24: {
                    var14 = param1 + (param3 * var13.field_f + param4 * var13.field_j + param5 * var13.field_d) / (var8 * var13.field_a) << 17;
                    this.field_W[var16] = var14 | nc.b(var15, var14 >> 17);
                    if (param0.field_m == null) {
                      break L24;
                    } else {
                      if (param0.field_m[this.field_T[var16]] == null) {
                        break L24;
                      } else {
                        var13 = param0.field_m[this.field_T[var16]];
                        break L23;
                      }
                    }
                  }
                  var13 = param0.field_Z[this.field_T[var16]];
                  break L23;
                }
                L25: {
                  L26: {
                    var14 = param1 + (param3 * var13.field_f + param4 * var13.field_j + param5 * var13.field_d) / (var8 * var13.field_a) << 17;
                    this.field_y[var16] = var14 | nc.b(var15, var14 >> 17);
                    if (param0.field_m == null) {
                      break L26;
                    } else {
                      if (param0.field_m[this.field_R[var16]] == null) {
                        break L26;
                      } else {
                        var13 = param0.field_m[this.field_R[var16]];
                        break L25;
                      }
                    }
                  }
                  var13 = param0.field_Z[this.field_R[var16]];
                  break L25;
                }
                var14 = param1 + (param3 * var13.field_f + param4 * var13.field_j + param5 * var13.field_d) / (var8 * var13.field_a) << 17;
                this.field_J[var16] = var14 | nc.b(var15, var14 >> 17);
                var16++;
                continue L9;
              }
            }
          }
        }
    }

    static {
        nc discarded$0 = new nc();
        nc discarded$1 = new nc();
        nc discarded$2 = new nc();
        field_I = new boolean[4096];
        field_p = new int[10];
        field_A = new int[12];
        field_X = new int[4096];
        field_db = new int[4096];
        field_cb = new int[10];
        field_z = new int[4096];
        field_L = new int[4096];
        field_v = new int[4096];
        field_S = 0;
        field_x = new int[4096];
        field_K = new int[4096];
        field_F = new int[12];
        field_f = new int[4096];
        field_H = new int[10];
        field_k = false;
        field_l = new int[12][4096];
        field_q = new boolean[4096];
        if (field_k) {
            field_C = new int[4096];
            field_m = new int[4096];
        } else {
            field_Y = new int[1600];
            field_o = new int[1600][64];
            field_g = new int[32];
            field_E = new int[32][512];
        }
    }
}
