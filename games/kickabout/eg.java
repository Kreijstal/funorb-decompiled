/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eg extends qc {
    private int[] field_gb;
    private boolean field_M;
    private int[] field_mb;
    private int[] field_C;
    private boolean field_X;
    private int[][] field_I;
    private int field_T;
    private byte[] field_m;
    private int field_eb;
    int[] field_n;
    private short[] field_p;
    private short field_lb;
    private int field_L;
    private int[] field_v;
    private int[][] field_nb;
    private byte[] field_w;
    private short[] field_fb;
    private byte[] field_o;
    private int[] field_N;
    private int[] field_h;
    private int field_ab;
    private int[] field_E;
    private short[] field_x;
    private static eg field_r;
    private int[] field_W;
    private int[] field_S;
    private int[] field_kb;
    private static int[] field_cb;
    private int[] field_qb;
    private static byte[] field_jb;
    private static int[] field_G;
    private static short[] field_y;
    private static int[] field_j;
    private static int[] field_Z;
    private static int field_A;
    private static int[] field_U;
    private static int[] field_q;
    private static int[] field_D;
    private static int[] field_z;
    private short[] field_ob;
    private static int[] field_k;
    private static boolean field_O;
    private static int[] field_J;
    private static int[] field_i;
    private static int[] field_V;
    private static int[] field_H;
    private static int[][] field_Q;
    private static int field_bb;
    private static boolean[] field_ib;
    private static int[] field_R;
    private static int[] field_s;
    private static int[][] field_Y;
    private static int[] field_db;
    private static int[] field_P;
    private static int[] field_u;
    private static boolean field_l;
    private static int[] field_B;
    private static int field_pb;
    private static boolean[] field_F;
    private static int[] field_t;
    private static int[][] field_K;
    private static int field_hb;

    public static void d() {
        field_r = null;
        field_jb = null;
        field_y = null;
        field_G = null;
        field_cb = null;
        field_j = null;
        field_F = null;
        field_ib = null;
        field_i = null;
        field_s = null;
        field_U = null;
        field_R = null;
        field_B = null;
        field_u = null;
        field_D = null;
        field_Q = null;
        field_P = null;
        field_K = null;
        field_J = null;
        field_k = null;
        field_q = null;
        field_Y = null;
        field_V = null;
        field_Z = null;
        field_z = null;
        field_t = null;
        field_db = null;
        field_H = null;
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
          if (var4 >= ((eg) this).field_ab) {
            return;
          } else {
            L1: {
              if (((eg) this).field_x == null) {
                stackOut_4_0 = -1;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = ((eg) this).field_x[var4];
                stackIn_5_0 = stackOut_3_0;
                break L1;
              }
            }
            var3 = stackIn_5_0;
            if (var3 == -1) {
              var1 = ((eg) this).field_p[var4] & 65535;
              if (((eg) this).field_n[var4] != -1) {
                if (((eg) this).field_n[var4] != -2) {
                  var2 = ((eg) this).field_kb[var4] & -131072;
                  ((eg) this).field_kb[var4] = var2 | eg.a(var1, var2 >> 17);
                  var2 = ((eg) this).field_v[var4] & -131072;
                  ((eg) this).field_v[var4] = var2 | eg.a(var1, var2 >> 17);
                  var2 = ((eg) this).field_n[var4] & -131072;
                  ((eg) this).field_n[var4] = var2 | eg.a(var1, var2 >> 17);
                  var4++;
                  continue L0;
                } else {
                  var4++;
                  continue L0;
                }
              } else {
                var2 = ((eg) this).field_kb[var4] & -131072;
                ((eg) this).field_kb[var4] = var2 | eg.a(var1, var2 >> 17);
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

    private final void e(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (!field_ib[param0]) {
          L0: {
            var2 = ((eg) this).field_gb[param0];
            var3 = ((eg) this).field_S[param0];
            var4 = ((eg) this).field_h[param0];
            t.field_g = field_F[param0];
            if (((eg) this).field_m != null) {
              t.field_h = ((eg) this).field_m[param0] & 255;
              break L0;
            } else {
              t.field_h = 0;
              break L0;
            }
          }
          L1: {
            L2: {
              if (((eg) this).field_x == null) {
                break L2;
              } else {
                if (((eg) this).field_x[param0] != -1) {
                  L3: {
                    L4: {
                      if (((eg) this).field_o == null) {
                        break L4;
                      } else {
                        if (((eg) this).field_o[param0] == -1) {
                          break L4;
                        } else {
                          var8 = ((eg) this).field_o[param0] & 255;
                          var5 = ((eg) this).field_mb[var8];
                          var6 = ((eg) this).field_C[var8];
                          var7 = ((eg) this).field_qb[var8];
                          break L3;
                        }
                      }
                    }
                    var5 = var2;
                    var6 = var3;
                    var7 = var4;
                    break L3;
                  }
                  if (((eg) this).field_n[param0] != -1) {
                    t.a(field_s[var2], field_s[var3], field_s[var4], field_i[var2], field_i[var3], field_i[var4], ((eg) this).field_kb[param0], ((eg) this).field_v[param0], ((eg) this).field_n[param0], field_R[var5], field_R[var6], field_R[var7], field_B[var5], field_B[var6], field_B[var7], field_u[var5], field_u[var6], field_u[var7], (int) ((eg) this).field_x[param0]);
                    break L1;
                  } else {
                    t.a(field_s[var2], field_s[var3], field_s[var4], field_i[var2], field_i[var3], field_i[var4], ((eg) this).field_kb[param0], ((eg) this).field_kb[param0], ((eg) this).field_kb[param0], field_R[var5], field_R[var6], field_R[var7], field_B[var5], field_B[var6], field_B[var7], field_u[var5], field_u[var6], field_u[var7], (int) ((eg) this).field_x[param0]);
                    break L1;
                  }
                } else {
                  break L2;
                }
              }
            }
            if (((eg) this).field_n[param0] != -1) {
              t.a(field_s[var2], field_s[var3], field_s[var4], field_i[var2], field_i[var3], field_i[var4], ((eg) this).field_kb[param0] & 65535, ((eg) this).field_v[param0] & 65535, ((eg) this).field_n[param0] & 65535);
              break L1;
            } else {
              t.a(field_s[var2], field_s[var3], field_s[var4], field_i[var2], field_i[var3], field_i[var4], t.field_l[((eg) this).field_kb[param0] & 65535]);
              break L1;
            }
          }
          return;
        } else {
          this.c(param0);
          return;
        }
    }

    final void f() {
        int var1 = 0;
        int var2 = 0;
        for (var1 = 0; var1 < ((eg) this).field_L; var1++) {
            var2 = ((eg) this).field_N[var1];
            ((eg) this).field_N[var1] = ((eg) this).field_E[var1];
            ((eg) this).field_E[var1] = -var2;
        }
        ((eg) this).field_M = false;
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
                      if (((eg) this).field_nb == null) {
                        break L0;
                      } else {
                        var8 = 0;
                        L1: while (true) {
                          if (var8 >= var7) {
                            return;
                          } else {
                            var9 = param1[var8];
                            if (var9 < ((eg) this).field_nb.length) {
                              var40 = ((eg) this).field_nb[var9];
                              var11 = 0;
                              L2: while (true) {
                                if (var11 >= var40.length) {
                                  ((eg) this).field_X = true;
                                  var8++;
                                  continue L1;
                                } else {
                                  L3: {
                                    var12 = var40[var11];
                                    var13 = ((eg) this).field_p[var12] & 65535;
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
                                  ((eg) this).field_p[var12] = (short)(var14 << 10 | var15 << 7 | var16);
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
                    if (((eg) this).field_nb == null) {
                      break L0;
                    } else {
                      L5: {
                        if (((eg) this).field_m == null) {
                          break L5;
                        } else {
                          var8 = 0;
                          L6: while (true) {
                            if (var8 >= var7) {
                              break L5;
                            } else {
                              var9 = param1[var8];
                              if (var9 < ((eg) this).field_nb.length) {
                                var39 = ((eg) this).field_nb[var9];
                                var11 = 0;
                                L7: while (true) {
                                  if (var11 < var39.length) {
                                    L8: {
                                      var12 = var39[var11];
                                      var13 = (((eg) this).field_m[var12] & 255) + param2 * 8;
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
                                    ((eg) this).field_m[var12] = (byte)var13;
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
                    if (var9 < ((eg) this).field_I.length) {
                      var38 = ((eg) this).field_I[var9];
                      var11 = 0;
                      L10: while (true) {
                        if (var11 < var38.length) {
                          var12 = var38[var11];
                          ((eg) this).field_N[var12] = ((eg) this).field_N[var12] - field_pb;
                          ((eg) this).field_W[var12] = ((eg) this).field_W[var12] - field_hb;
                          ((eg) this).field_E[var12] = ((eg) this).field_E[var12] - field_A;
                          ((eg) this).field_N[var12] = ((eg) this).field_N[var12] * param2 / 128;
                          ((eg) this).field_W[var12] = ((eg) this).field_W[var12] * param3 / 128;
                          ((eg) this).field_E[var12] = ((eg) this).field_E[var12] * param4 / 128;
                          ((eg) this).field_N[var12] = ((eg) this).field_N[var12] + field_pb;
                          ((eg) this).field_W[var12] = ((eg) this).field_W[var12] + field_hb;
                          ((eg) this).field_E[var12] = ((eg) this).field_E[var12] + field_A;
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
                  if (var9 < ((eg) this).field_I.length) {
                    var37 = ((eg) this).field_I[var9];
                    var11 = 0;
                    L12: while (true) {
                      if (var11 < var37.length) {
                        L13: {
                          var12 = var37[var11];
                          ((eg) this).field_N[var12] = ((eg) this).field_N[var12] - field_pb;
                          ((eg) this).field_W[var12] = ((eg) this).field_W[var12] - field_hb;
                          ((eg) this).field_E[var12] = ((eg) this).field_E[var12] - field_A;
                          if (param4 == 0) {
                            break L13;
                          } else {
                            var13 = t.field_f[param4];
                            var14 = t.field_o[param4];
                            var15 = ((eg) this).field_W[var12] * var13 + ((eg) this).field_N[var12] * var14 + 32767 >> 16;
                            ((eg) this).field_W[var12] = ((eg) this).field_W[var12] * var14 - ((eg) this).field_N[var12] * var13 + 32767 >> 16;
                            ((eg) this).field_N[var12] = var15;
                            break L13;
                          }
                        }
                        L14: {
                          if (param2 == 0) {
                            break L14;
                          } else {
                            var13 = t.field_f[param2];
                            var14 = t.field_o[param2];
                            var15 = ((eg) this).field_W[var12] * var14 - ((eg) this).field_E[var12] * var13 + 32767 >> 16;
                            ((eg) this).field_E[var12] = ((eg) this).field_W[var12] * var13 + ((eg) this).field_E[var12] * var14 + 32767 >> 16;
                            ((eg) this).field_W[var12] = var15;
                            break L14;
                          }
                        }
                        L15: {
                          if (param3 == 0) {
                            break L15;
                          } else {
                            var13 = t.field_f[param3];
                            var14 = t.field_o[param3];
                            var15 = ((eg) this).field_E[var12] * var13 + ((eg) this).field_N[var12] * var14 + 32767 >> 16;
                            ((eg) this).field_E[var12] = ((eg) this).field_E[var12] * var14 - ((eg) this).field_N[var12] * var13 + 32767 >> 16;
                            ((eg) this).field_N[var12] = var15;
                            break L15;
                          }
                        }
                        ((eg) this).field_N[var12] = ((eg) this).field_N[var12] + field_pb;
                        ((eg) this).field_W[var12] = ((eg) this).field_W[var12] + field_hb;
                        ((eg) this).field_E[var12] = ((eg) this).field_E[var12] + field_A;
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
                if (var9 < ((eg) this).field_I.length) {
                  var36 = ((eg) this).field_I[var9];
                  var11 = 0;
                  L17: while (true) {
                    if (var11 < var36.length) {
                      var12 = var36[var11];
                      ((eg) this).field_N[var12] = ((eg) this).field_N[var12] + param2;
                      ((eg) this).field_W[var12] = ((eg) this).field_W[var12] + param3;
                      ((eg) this).field_E[var12] = ((eg) this).field_E[var12] + param4;
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
          field_pb = 0;
          field_hb = 0;
          field_A = 0;
          var9 = 0;
          L18: while (true) {
            if (var9 >= var7) {
              L19: {
                if (var8 <= 0) {
                  field_pb = param2;
                  field_hb = param3;
                  field_A = param4;
                  break L19;
                } else {
                  field_pb = field_pb / var8 + param2;
                  field_hb = field_hb / var8 + param3;
                  field_A = field_A / var8 + param4;
                  break L19;
                }
              }
              return;
            } else {
              var10 = param1[var9];
              if (var10 < ((eg) this).field_I.length) {
                var35 = ((eg) this).field_I[var10];
                var12 = 0;
                L20: while (true) {
                  if (var12 < var35.length) {
                    var13 = var35[var12];
                    field_pb = field_pb + ((eg) this).field_N[var13];
                    field_hb = field_hb + ((eg) this).field_W[var13];
                    field_A = field_A + ((eg) this).field_E[var13];
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

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        RuntimeException var9 = null;
        int var9_int = 0;
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
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (((eg) this).field_M) {
                break L1;
              } else {
                this.e();
                break L1;
              }
            }
            var9_int = t.field_p;
            var10 = t.field_e;
            var11 = t.field_f[param0];
            var12 = t.field_o[param0];
            var13 = t.field_f[param1];
            var14 = t.field_o[param1];
            var15 = t.field_f[param2];
            var16 = t.field_o[param2];
            var17 = t.field_f[param3];
            var18 = t.field_o[param3];
            var19 = param5 * var17 + param6 * var18 >> 16;
            var20 = 0;
            L2: while (true) {
              if (var20 >= ((eg) this).field_L) {
                this.a(false, false, 0L, (int) ((eg) this).field_lb, ((eg) this).field_lb << 1);
                break L0;
              } else {
                L3: {
                  var21 = ((eg) this).field_N[var20];
                  var22 = ((eg) this).field_W[var20];
                  var23 = ((eg) this).field_E[var20];
                  if (param2 == 0) {
                    break L3;
                  } else {
                    var24 = var22 * var15 + var21 * var16 >> 16;
                    var22 = var22 * var16 - var21 * var15 >> 16;
                    var21 = var24;
                    break L3;
                  }
                }
                L4: {
                  if (param0 == 0) {
                    break L4;
                  } else {
                    var24 = var22 * var12 - var23 * var11 >> 16;
                    var23 = var22 * var11 + var23 * var12 >> 16;
                    var22 = var24;
                    break L4;
                  }
                }
                L5: {
                  if (param1 == 0) {
                    break L5;
                  } else {
                    var24 = var23 * var13 + var21 * var14 >> 16;
                    var23 = var23 * var14 - var21 * var13 >> 16;
                    var21 = var24;
                    break L5;
                  }
                }
                L6: {
                  var21 = var21 + param4;
                  var22 = var22 + param5;
                  var23 = var23 + param6;
                  var24 = var22 * var18 - var23 * var17 >> 16;
                  var23 = var22 * var17 + var23 * var18 >> 16;
                  var22 = var24;
                  field_U[var20] = var23 - var19;
                  field_i[var20] = var9_int + (var21 << 9) / param7;
                  field_s[var20] = var10 + (var22 << 9) / param7;
                  if (((eg) this).field_eb <= 0) {
                    break L6;
                  } else {
                    field_R[var20] = var21;
                    field_B[var20] = var22;
                    field_u[var20] = var23;
                    break L6;
                  }
                }
                var20++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var9 = decompiledCaughtException;
            break L7;
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
          var2 = t.field_p;
          var3 = t.field_e;
          var4 = 0;
          var5 = ((eg) this).field_gb[param0];
          var6 = ((eg) this).field_S[param0];
          var7 = ((eg) this).field_h[param0];
          var8 = field_u[var5];
          var9 = field_u[var6];
          var10 = field_u[var7];
          if (((eg) this).field_m != null) {
            t.field_h = ((eg) this).field_m[param0] & 255;
            break L0;
          } else {
            t.field_h = 0;
            break L0;
          }
        }
        L1: {
          if (var8 < 50) {
            L2: {
              var11 = field_R[var5];
              var12 = field_B[var5];
              var13 = ((eg) this).field_kb[param0] & 65535;
              if (var10 < 50) {
                break L2;
              } else {
                var14 = (50 - var8) * t.field_m[var10 - var8];
                field_t[var4] = var2 + (var11 + ((field_R[var7] - var11) * var14 >> 16) << 9) / 50;
                field_db[var4] = var3 + (var12 + ((field_B[var7] - var12) * var14 >> 16) << 9) / 50;
                int incrementValue$9 = var4;
                var4++;
                field_H[incrementValue$9] = var13 + (((((eg) this).field_n[param0] & 65535) - var13) * var14 >> 16);
                break L2;
              }
            }
            if (var9 < 50) {
              break L1;
            } else {
              var14 = (50 - var8) * t.field_m[var9 - var8];
              field_t[var4] = var2 + (var11 + ((field_R[var6] - var11) * var14 >> 16) << 9) / 50;
              field_db[var4] = var3 + (var12 + ((field_B[var6] - var12) * var14 >> 16) << 9) / 50;
              int incrementValue$10 = var4;
              var4++;
              field_H[incrementValue$10] = var13 + (((((eg) this).field_v[param0] & 65535) - var13) * var14 >> 16);
              break L1;
            }
          } else {
            field_t[var4] = field_i[var5];
            field_db[var4] = field_s[var5];
            int incrementValue$11 = var4;
            var4++;
            field_H[incrementValue$11] = ((eg) this).field_kb[param0] & 65535;
            break L1;
          }
        }
        L3: {
          if (var9 < 50) {
            L4: {
              var11 = field_R[var6];
              var12 = field_B[var6];
              var13 = ((eg) this).field_v[param0] & 65535;
              if (var8 < 50) {
                break L4;
              } else {
                var14 = (50 - var9) * t.field_m[var8 - var9];
                field_t[var4] = var2 + (var11 + ((field_R[var5] - var11) * var14 >> 16) << 9) / 50;
                field_db[var4] = var3 + (var12 + ((field_B[var5] - var12) * var14 >> 16) << 9) / 50;
                int incrementValue$12 = var4;
                var4++;
                field_H[incrementValue$12] = var13 + (((((eg) this).field_kb[param0] & 65535) - var13) * var14 >> 16);
                break L4;
              }
            }
            if (var10 < 50) {
              break L3;
            } else {
              var14 = (50 - var9) * t.field_m[var10 - var9];
              field_t[var4] = var2 + (var11 + ((field_R[var7] - var11) * var14 >> 16) << 9) / 50;
              field_db[var4] = var3 + (var12 + ((field_B[var7] - var12) * var14 >> 16) << 9) / 50;
              int incrementValue$13 = var4;
              var4++;
              field_H[incrementValue$13] = var13 + (((((eg) this).field_n[param0] & 65535) - var13) * var14 >> 16);
              break L3;
            }
          } else {
            field_t[var4] = field_i[var6];
            field_db[var4] = field_s[var6];
            int incrementValue$14 = var4;
            var4++;
            field_H[incrementValue$14] = ((eg) this).field_v[param0] & 65535;
            break L3;
          }
        }
        L5: {
          if (var10 < 50) {
            L6: {
              var11 = field_R[var7];
              var12 = field_B[var7];
              var13 = ((eg) this).field_n[param0] & 65535;
              if (var9 < 50) {
                break L6;
              } else {
                var14 = (50 - var10) * t.field_m[var9 - var10];
                field_t[var4] = var2 + (var11 + ((field_R[var6] - var11) * var14 >> 16) << 9) / 50;
                field_db[var4] = var3 + (var12 + ((field_B[var6] - var12) * var14 >> 16) << 9) / 50;
                int incrementValue$15 = var4;
                var4++;
                field_H[incrementValue$15] = var13 + (((((eg) this).field_v[param0] & 65535) - var13) * var14 >> 16);
                break L6;
              }
            }
            if (var8 < 50) {
              break L5;
            } else {
              var14 = (50 - var10) * t.field_m[var8 - var10];
              field_t[var4] = var2 + (var11 + ((field_R[var5] - var11) * var14 >> 16) << 9) / 50;
              field_db[var4] = var3 + (var12 + ((field_B[var5] - var12) * var14 >> 16) << 9) / 50;
              int incrementValue$16 = var4;
              var4++;
              field_H[incrementValue$16] = var13 + (((((eg) this).field_kb[param0] & 65535) - var13) * var14 >> 16);
              break L5;
            }
          } else {
            field_t[var4] = field_i[var7];
            field_db[var4] = field_s[var7];
            int incrementValue$17 = var4;
            var4++;
            field_H[incrementValue$17] = ((eg) this).field_n[param0] & 65535;
            break L5;
          }
        }
        L7: {
          var11 = field_t[0];
          var12 = field_t[1];
          var13 = field_t[2];
          var14 = field_db[0];
          var15 = field_db[1];
          var16 = field_db[2];
          t.field_g = false;
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
                      if (var11 > t.field_b) {
                        break L9;
                      } else {
                        if (var12 > t.field_b) {
                          break L9;
                        } else {
                          if (var13 <= t.field_b) {
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
              t.field_g = true;
              break L8;
            }
            L10: {
              if (((eg) this).field_x == null) {
                break L10;
              } else {
                if (((eg) this).field_x[param0] != -1) {
                  L11: {
                    L12: {
                      if (((eg) this).field_o == null) {
                        break L12;
                      } else {
                        if (((eg) this).field_o[param0] == -1) {
                          break L12;
                        } else {
                          var20 = ((eg) this).field_o[param0] & 255;
                          var17 = ((eg) this).field_mb[var20];
                          var18 = ((eg) this).field_C[var20];
                          var19 = ((eg) this).field_qb[var20];
                          break L11;
                        }
                      }
                    }
                    var17 = var5;
                    var18 = var6;
                    var19 = var7;
                    break L11;
                  }
                  if (((eg) this).field_n[param0] != -1) {
                    t.a(var14, var15, var16, var11, var12, var13, field_H[0], field_H[1], field_H[2], field_R[var17], field_R[var18], field_R[var19], field_B[var17], field_B[var18], field_B[var19], field_u[var17], field_u[var18], field_u[var19], (int) ((eg) this).field_x[param0]);
                    break L7;
                  } else {
                    t.a(var14, var15, var16, var11, var12, var13, ((eg) this).field_kb[param0], ((eg) this).field_kb[param0], ((eg) this).field_kb[param0], field_R[var17], field_R[var18], field_R[var19], field_B[var17], field_B[var18], field_B[var19], field_u[var17], field_u[var18], field_u[var19], (int) ((eg) this).field_x[param0]);
                    break L7;
                  }
                } else {
                  break L10;
                }
              }
            }
            if (((eg) this).field_n[param0] != -1) {
              t.a(var14, var15, var16, var11, var12, var13, field_H[0], field_H[1], field_H[2]);
              break L7;
            } else {
              t.a(var14, var15, var16, var11, var12, var13, t.field_l[((eg) this).field_kb[param0] & 65535]);
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
                    if (var11 > t.field_b) {
                      break L14;
                    } else {
                      if (var12 > t.field_b) {
                        break L14;
                      } else {
                        if (var13 > t.field_b) {
                          break L14;
                        } else {
                          if (field_t[3] < 0) {
                            break L14;
                          } else {
                            if (field_t[3] <= t.field_b) {
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
            t.field_g = true;
            break L13;
          }
          L15: {
            L16: {
              if (((eg) this).field_x == null) {
                break L16;
              } else {
                if (((eg) this).field_x[param0] != -1) {
                  L17: {
                    L18: {
                      if (((eg) this).field_o == null) {
                        break L18;
                      } else {
                        if (((eg) this).field_o[param0] == -1) {
                          break L18;
                        } else {
                          var20 = ((eg) this).field_o[param0] & 255;
                          var17 = ((eg) this).field_mb[var20];
                          var18 = ((eg) this).field_C[var20];
                          var19 = ((eg) this).field_qb[var20];
                          break L17;
                        }
                      }
                    }
                    var17 = var5;
                    var18 = var6;
                    var19 = var7;
                    break L17;
                  }
                  var20 = ((eg) this).field_x[param0];
                  if (((eg) this).field_n[param0] != -1) {
                    t.a(var14, var15, var16, var11, var12, var13, field_H[0], field_H[1], field_H[2], field_R[var17], field_R[var18], field_R[var19], field_B[var17], field_B[var18], field_B[var19], field_u[var17], field_u[var18], field_u[var19], var20);
                    t.a(var14, var16, field_db[3], var11, var13, field_t[3], field_H[0], field_H[2], field_H[3], field_R[var17], field_R[var18], field_R[var19], field_B[var17], field_B[var18], field_B[var19], field_u[var17], field_u[var18], field_u[var19], var20);
                    break L15;
                  } else {
                    t.a(var14, var15, var16, var11, var12, var13, ((eg) this).field_kb[param0], ((eg) this).field_kb[param0], ((eg) this).field_kb[param0], field_R[var17], field_R[var18], field_R[var19], field_B[var17], field_B[var18], field_B[var19], field_u[var17], field_u[var18], field_u[var19], var20);
                    t.a(var14, var16, field_db[3], var11, var13, field_t[3], ((eg) this).field_kb[param0], ((eg) this).field_kb[param0], ((eg) this).field_kb[param0], field_R[var17], field_R[var18], field_R[var19], field_B[var17], field_B[var18], field_B[var19], field_u[var17], field_u[var18], field_u[var19], var20);
                    break L15;
                  }
                } else {
                  break L16;
                }
              }
            }
            if (((eg) this).field_n[param0] != -1) {
              t.a(var14, var15, var16, var11, var12, var13, field_H[0], field_H[1], field_H[2]);
              t.a(var14, var16, field_db[3], var11, var13, field_t[3], field_H[0], field_H[2], field_H[3]);
              break L15;
            } else {
              var17 = t.field_l[((eg) this).field_kb[param0] & 65535];
              t.a(var14, var15, var16, var11, var12, var13, var17);
              t.a(var14, var16, field_db[3], var11, var13, field_t[3], var17);
              break L15;
            }
          }
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
            if (field_l) {
              break L0;
            } else {
              var8 = 0;
              L1: while (true) {
                if (var8 >= 1600) {
                  var8 = 0;
                  L2: while (true) {
                    if (var8 >= 32) {
                      field_bb = 0;
                      break L0;
                    } else {
                      field_P[var8] = 0;
                      var8++;
                      continue L2;
                    }
                  }
                } else {
                  field_D[var8] = 0;
                  var8++;
                  continue L1;
                }
              }
            }
          }
          var8 = 0;
          L3: while (true) {
            if (var8 >= ((eg) this).field_ab) {
              L4: {
                if (!field_l) {
                  if (((eg) this).field_w != null) {
                    var8 = 0;
                    L5: while (true) {
                      if (var8 >= 12) {
                        var8 = param4 - 1;
                        L6: while (true) {
                          if (var8 < 0) {
                            break L4;
                          } else {
                            L7: {
                              var9 = field_D[var8];
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
                                var47 = field_Q[var8];
                                var12 = 0;
                                L9: while (true) {
                                  if (var12 >= var10) {
                                    break L7;
                                  } else {
                                    var13 = var47[var12];
                                    var14_int = ((eg) this).field_w[var13];
                                    field_q[var14_int] = field_q[var14_int] + 1;
                                    var15_int = field_q[var14_int];
                                    field_Y[var14_int][var15_int] = var13;
                                    if (var14_int >= 10) {
                                      if (var14_int != 10) {
                                        field_Z[var15_int] = var8;
                                        var12++;
                                        continue L9;
                                      } else {
                                        field_V[var15_int] = var8;
                                        var12++;
                                        continue L9;
                                      }
                                    } else {
                                      field_z[var14_int] = field_z[var14_int] + var8;
                                      var12++;
                                      continue L9;
                                    }
                                  }
                                }
                              }
                            }
                            if (var9 > 64) {
                              var10 = field_D[var8] - 65;
                              var48 = field_K[var10];
                              var12 = 0;
                              L10: while (true) {
                                if (var12 < field_P[var10]) {
                                  var13 = var48[var12];
                                  var14_int = ((eg) this).field_w[var13];
                                  field_q[var14_int] = field_q[var14_int] + 1;
                                  var15_int = field_q[var14_int];
                                  field_Y[var14_int][var15_int] = var13;
                                  if (var14_int >= 10) {
                                    if (var14_int != 10) {
                                      field_Z[var15_int] = var8;
                                      var12++;
                                      continue L10;
                                    } else {
                                      field_V[var15_int] = var8;
                                      var12++;
                                      continue L10;
                                    }
                                  } else {
                                    field_z[var14_int] = field_z[var14_int] + var8;
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
                        field_q[var8] = 0;
                        field_z[var8] = 0;
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
                          var9 = field_D[var8];
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
                            var45 = field_Q[var8];
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
                          var10 = field_D[var8] - 65;
                          var46 = field_K[var10];
                          var12 = 0;
                          L15: while (true) {
                            if (var12 < field_P[var10]) {
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
                  qi.a(0, var7 - 1, -1, field_J, field_k);
                  if (((eg) this).field_w != null) {
                    var8 = 0;
                    L16: while (true) {
                      if (var8 >= 12) {
                        var8 = 0;
                        L17: while (true) {
                          if (var8 >= var7) {
                            break L4;
                          } else {
                            var9 = field_k[var8];
                            var10 = field_J[var8];
                            var11 = ((eg) this).field_w[var9];
                            field_q[var11] = field_q[var11] + 1;
                            var12 = field_q[var11];
                            field_Y[var11][var12] = var9;
                            if (var11 >= 10) {
                              if (var11 != 10) {
                                field_Z[var12] = var10;
                                var8++;
                                continue L17;
                              } else {
                                field_V[var12] = var10;
                                var8++;
                                continue L17;
                              }
                            } else {
                              field_z[var11] = field_z[var11] + var10;
                              var8++;
                              continue L17;
                            }
                          }
                        }
                      } else {
                        field_q[var8] = 0;
                        field_z[var8] = 0;
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
                        this.e(field_k[var8]);
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
                  if (field_q[1] > 0) {
                    break L20;
                  } else {
                    if (field_q[2] <= 0) {
                      break L19;
                    } else {
                      break L20;
                    }
                  }
                }
                var8 = (field_z[1] + field_z[2]) / (field_q[1] + field_q[2]);
                break L19;
              }
              L21: {
                L22: {
                  var9 = 0;
                  if (field_q[3] > 0) {
                    break L22;
                  } else {
                    if (field_q[4] <= 0) {
                      break L21;
                    } else {
                      break L22;
                    }
                  }
                }
                var9 = (field_z[3] + field_z[4]) / (field_q[3] + field_q[4]);
                break L21;
              }
              L23: {
                L24: {
                  var10 = 0;
                  if (field_q[6] > 0) {
                    break L24;
                  } else {
                    if (field_q[8] <= 0) {
                      break L23;
                    } else {
                      break L24;
                    }
                  }
                }
                var10 = (field_z[6] + field_z[8]) / (field_q[6] + field_q[8]);
                break L23;
              }
              L25: {
                var12 = 0;
                var13 = field_q[10];
                var14 = field_Y[10];
                var15 = field_V;
                if (var12 != var13) {
                  break L25;
                } else {
                  var12 = 0;
                  var13 = field_q[11];
                  var14 = field_Y[11];
                  var15 = field_Z;
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
                          if (var14 == field_Y[11]) {
                            break L29;
                          } else {
                            var12 = 0;
                            var14 = field_Y[11];
                            var13 = field_q[11];
                            var15 = field_Z;
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
                              if (var14 == field_Y[11]) {
                                break L32;
                              } else {
                                var12 = 0;
                                var13 = field_q[11];
                                var14 = field_Y[11];
                                var15 = field_Z;
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
                                if (var14 == field_Y[11]) {
                                  break L35;
                                } else {
                                  var12 = 0;
                                  var13 = field_q[11];
                                  var14 = field_Y[11];
                                  var15 = field_Z;
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
                                  if (var14 == field_Y[11]) {
                                    break L38;
                                  } else {
                                    var12 = 0;
                                    var13 = field_q[11];
                                    var14 = field_Y[11];
                                    var15 = field_Z;
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
                        var17 = field_q[var16];
                        var49 = field_Y[var16];
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
              if (((eg) this).field_n[var8] != -2) {
                L40: {
                  var9 = ((eg) this).field_gb[var8];
                  var10 = ((eg) this).field_S[var8];
                  var11 = ((eg) this).field_h[var8];
                  var12 = field_i[var9];
                  var13 = field_i[var10];
                  var14_int = field_i[var11];
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
                    var15_int = field_R[var9];
                    var16 = field_R[var10];
                    var17 = field_R[var11];
                    var18 = field_B[var9];
                    var19 = field_B[var10];
                    var20 = field_B[var11];
                    var21 = field_u[var9];
                    var22 = field_u[var10];
                    var23 = field_u[var11];
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
                      field_ib[var8] = true;
                      if (!field_l) {
                        var27 = (field_U[var9] + field_U[var10] + field_U[var11]) / 3 + param3;
                        if (field_D[var27] >= 64) {
                          L42: {
                            var28 = field_D[var27];
                            if (var28 != 64) {
                              break L42;
                            } else {
                              if (field_bb != 512) {
                                field_bb = field_bb + 1;
                                var28 = 65 + field_bb;
                                field_D[var27] = 65 + field_bb;
                                break L42;
                              } else {
                                var8++;
                                continue L3;
                              }
                            }
                          }
                          var28 -= 65;
                          field_P[var28] = field_P[var28] + 1;
                          field_K[var28][field_P[var28]] = var8;
                          var8++;
                          continue L3;
                        } else {
                          field_D[var27] = field_D[var27] + 1;
                          field_Q[var27][field_D[var27]] = var8;
                          var8++;
                          continue L3;
                        }
                      } else {
                        field_J[var7] = (field_U[var9] + field_U[var10] + field_U[var11]) / 3;
                        int incrementValue$11 = var7;
                        var7++;
                        field_k[incrementValue$11] = var8;
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
                    if (!this.b(bq.field_c + t.field_p, vs.field_i + t.field_e, field_s[var9], field_s[var10], field_s[var11], var12, var13, var14_int)) {
                      break L43;
                    } else {
                      int fieldTemp$12 = jk.field_f;
                      jk.field_f = jk.field_f + 1;
                      rg.field_c[fieldTemp$12] = param2;
                      param1 = false;
                      break L43;
                    }
                  }
                }
                if ((var12 - var13) * (field_s[var11] - field_s[var10]) - (field_s[var9] - field_s[var10]) * (var14_int - var13) > 0) {
                  L44: {
                    L45: {
                      field_ib[var8] = false;
                      if (var12 < 0) {
                        break L45;
                      } else {
                        if (var13 < 0) {
                          break L45;
                        } else {
                          if (var14_int < 0) {
                            break L45;
                          } else {
                            if (var12 > t.field_b) {
                              break L45;
                            } else {
                              if (var13 > t.field_b) {
                                break L45;
                              } else {
                                if (var14_int <= t.field_b) {
                                  field_F[var8] = false;
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
                    field_F[var8] = true;
                    break L44;
                  }
                  if (!field_l) {
                    var15_int = (field_U[var9] + field_U[var10] + field_U[var11]) / 3 + param3;
                    if (field_D[var15_int] >= 64) {
                      L46: {
                        var16 = field_D[var15_int];
                        if (var16 != 64) {
                          break L46;
                        } else {
                          if (field_bb != 512) {
                            field_bb = field_bb + 1;
                            var16 = 65 + field_bb;
                            field_D[var15_int] = 65 + field_bb;
                            break L46;
                          } else {
                            var8++;
                            continue L3;
                          }
                        }
                      }
                      var16 -= 65;
                      field_P[var16] = field_P[var16] + 1;
                      field_K[var16][field_P[var16]] = var8;
                      var8++;
                      continue L3;
                    } else {
                      field_D[var15_int] = field_D[var15_int] + 1;
                      field_Q[var15_int][field_D[var15_int]] = var8;
                      var8++;
                      continue L3;
                    }
                  } else {
                    field_J[var7] = (field_U[var9] + field_U[var10] + field_U[var11]) / 3;
                    int incrementValue$13 = var7;
                    var7++;
                    field_k[incrementValue$13] = var8;
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

    final void b(int param0) {
        int var4 = 0;
        int var5 = 0;
        int var2 = t.field_f[param0];
        int var3 = t.field_o[param0];
        for (var4 = 0; var4 < ((eg) this).field_L; var4++) {
            var5 = ((eg) this).field_E[var4] * var2 + ((eg) this).field_N[var4] * var3 >> 16;
            ((eg) this).field_E[var4] = ((eg) this).field_E[var4] * var3 - ((eg) this).field_N[var4] * var2 >> 16;
            ((eg) this).field_N[var4] = var5;
        }
        ((eg) this).field_M = false;
    }

    final void a() {
        if (((eg) this).field_X) {
            this.c();
            ((eg) this).field_X = false;
        }
        ((eg) this).field_M = false;
    }

    private final qc a(boolean param0, boolean param1, eg param2, byte[] param3, short[] param4, int[] param5, int[] param6, int[] param7) {
        int var9 = 0;
        L0: {
          L1: {
            param2.field_L = ((eg) this).field_L;
            param2.field_T = ((eg) this).field_T;
            param2.field_ab = ((eg) this).field_ab;
            param2.field_eb = ((eg) this).field_eb;
            if (param2.field_N == null) {
              break L1;
            } else {
              if (param2.field_N.length >= ((eg) this).field_L) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          param2.field_N = new int[((eg) this).field_L + 100];
          param2.field_W = new int[((eg) this).field_L + 100];
          param2.field_E = new int[((eg) this).field_L + 100];
          break L0;
        }
        var9 = 0;
        L2: while (true) {
          if (var9 >= ((eg) this).field_L) {
            L3: {
              if (!param0) {
                param2.field_m = param3;
                if (((eg) this).field_m != null) {
                  var9 = 0;
                  L4: while (true) {
                    if (var9 >= ((eg) this).field_ab) {
                      break L3;
                    } else {
                      param2.field_m[var9] = ((eg) this).field_m[var9];
                      var9++;
                      continue L4;
                    }
                  }
                } else {
                  var9 = 0;
                  L5: while (true) {
                    if (var9 >= ((eg) this).field_ab) {
                      break L3;
                    } else {
                      param2.field_m[var9] = (byte) 0;
                      var9++;
                      continue L5;
                    }
                  }
                }
              } else {
                param2.field_m = ((eg) this).field_m;
                break L3;
              }
            }
            L6: {
              if (!param1) {
                param2.field_p = param4;
                param2.field_kb = param5;
                param2.field_v = param6;
                param2.field_n = param7;
                var9 = 0;
                L7: while (true) {
                  if (var9 >= ((eg) this).field_ab) {
                    break L6;
                  } else {
                    param2.field_p[var9] = ((eg) this).field_p[var9];
                    param2.field_kb[var9] = ((eg) this).field_kb[var9];
                    param2.field_v[var9] = ((eg) this).field_v[var9];
                    param2.field_n[var9] = ((eg) this).field_n[var9];
                    var9++;
                    continue L7;
                  }
                }
              } else {
                param2.field_p = ((eg) this).field_p;
                param2.field_kb = ((eg) this).field_kb;
                param2.field_v = ((eg) this).field_v;
                param2.field_n = ((eg) this).field_n;
                break L6;
              }
            }
            param2.field_gb = ((eg) this).field_gb;
            param2.field_S = ((eg) this).field_S;
            param2.field_h = ((eg) this).field_h;
            param2.field_w = ((eg) this).field_w;
            param2.field_o = ((eg) this).field_o;
            param2.field_x = ((eg) this).field_x;
            param2.field_mb = ((eg) this).field_mb;
            param2.field_C = ((eg) this).field_C;
            param2.field_qb = ((eg) this).field_qb;
            param2.field_I = ((eg) this).field_I;
            param2.field_nb = ((eg) this).field_nb;
            param2.field_ob = ((eg) this).field_ob;
            param2.field_fb = ((eg) this).field_fb;
            param2.field_M = false;
            return (qc) (Object) param2;
          } else {
            param2.field_N[var9] = ((eg) this).field_N[var9];
            param2.field_W[var9] = ((eg) this).field_W[var9];
            param2.field_E[var9] = ((eg) this).field_E[var9];
            var9++;
            continue L2;
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
                        if (((eg) this).field_nb == null) {
                          break L1;
                        } else {
                          var10 = 0;
                          L2: while (true) {
                            if (var10 >= var9) {
                              return;
                            } else {
                              var11 = param1[var10];
                              if (var11 < ((eg) this).field_nb.length) {
                                var91 = ((eg) this).field_nb[var11];
                                var13 = 0;
                                L3: while (true) {
                                  if (var13 >= var91.length) {
                                    ((eg) this).field_X = true;
                                    var10++;
                                    continue L2;
                                  } else {
                                    L4: {
                                      var14 = var91[var13];
                                      if (((eg) this).field_fb == null) {
                                        break L4;
                                      } else {
                                        if ((param6 & ((eg) this).field_fb[var14]) != 0) {
                                          break L4;
                                        } else {
                                          var13++;
                                          continue L3;
                                        }
                                      }
                                    }
                                    L5: {
                                      var15 = ((eg) this).field_p[var14] & 65535;
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
                                    ((eg) this).field_p[var14] = (short)(var16 << 10 | var17 << 7 | var18);
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
                      if (((eg) this).field_nb == null) {
                        break L1;
                      } else {
                        L7: {
                          if (((eg) this).field_m == null) {
                            break L7;
                          } else {
                            var10 = 0;
                            L8: while (true) {
                              if (var10 >= var9) {
                                break L7;
                              } else {
                                var11 = param1[var10];
                                if (var11 < ((eg) this).field_nb.length) {
                                  var90 = ((eg) this).field_nb[var11];
                                  var13 = 0;
                                  L9: while (true) {
                                    if (var13 < var90.length) {
                                      L10: {
                                        var14 = var90[var13];
                                        if (((eg) this).field_fb == null) {
                                          break L10;
                                        } else {
                                          if ((param6 & ((eg) this).field_fb[var14]) != 0) {
                                            break L10;
                                          } else {
                                            var13++;
                                            continue L9;
                                          }
                                        }
                                      }
                                      L11: {
                                        var15 = (((eg) this).field_m[var14] & 255) + param2 * 8;
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
                                      ((eg) this).field_m[var14] = (byte)var15;
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
                        if (var11 < ((eg) this).field_I.length) {
                          var89 = ((eg) this).field_I[var11];
                          var13 = 0;
                          L13: while (true) {
                            if (var13 < var89.length) {
                              L14: {
                                var14 = var89[var13];
                                if (((eg) this).field_ob == null) {
                                  break L14;
                                } else {
                                  if ((param6 & ((eg) this).field_ob[var14]) != 0) {
                                    break L14;
                                  } else {
                                    var13++;
                                    continue L13;
                                  }
                                }
                              }
                              ((eg) this).field_N[var14] = ((eg) this).field_N[var14] - field_pb;
                              ((eg) this).field_W[var14] = ((eg) this).field_W[var14] - field_hb;
                              ((eg) this).field_E[var14] = ((eg) this).field_E[var14] - field_A;
                              ((eg) this).field_N[var14] = ((eg) this).field_N[var14] * param2 / 128;
                              ((eg) this).field_W[var14] = ((eg) this).field_W[var14] * param3 / 128;
                              ((eg) this).field_E[var14] = ((eg) this).field_E[var14] * param4 / 128;
                              ((eg) this).field_N[var14] = ((eg) this).field_N[var14] + field_pb;
                              ((eg) this).field_W[var14] = ((eg) this).field_W[var14] + field_hb;
                              ((eg) this).field_E[var14] = ((eg) this).field_E[var14] + field_A;
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
                      if (!field_O) {
                        break L15;
                      } else {
                        var16 = param7[0] * field_pb + param7[3] * field_hb + param7[6] * field_A + 16384 >> 15;
                        var17 = param7[1] * field_pb + param7[4] * field_hb + param7[7] * field_A + 16384 >> 15;
                        var18 = param7[2] * field_pb + param7[5] * field_hb + param7[8] * field_A + 16384 >> 15;
                        var16 = var16 + var13;
                        var17 = var17 + var14;
                        var18 = var18 + var15;
                        field_pb = var16;
                        field_hb = var17;
                        field_A = var18;
                        field_O = false;
                        break L15;
                      }
                    }
                    var16 = param2 << 15 >> 7;
                    var17 = param3 << 15 >> 7;
                    var18 = param4 << 15 >> 7;
                    var19 = var16 * -field_pb + 16384 >> 15;
                    var20 = var17 * -field_hb + 16384 >> 15;
                    var21 = var18 * -field_A + 16384 >> 15;
                    var22 = var19 + field_pb;
                    var23 = var20 + field_hb;
                    var24 = var21 + field_A;
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
                            if (var34 < ((eg) this).field_I.length) {
                              var87 = ((eg) this).field_I[var34];
                              var36 = 0;
                              L18: while (true) {
                                if (var36 < var87.length) {
                                  L19: {
                                    var37 = var87[var36];
                                    if (((eg) this).field_ob == null) {
                                      break L19;
                                    } else {
                                      if ((param6 & ((eg) this).field_ob[var37]) != 0) {
                                        break L19;
                                      } else {
                                        var36++;
                                        continue L18;
                                      }
                                    }
                                  }
                                  var38 = var88[0] * ((eg) this).field_N[var37] + var88[1] * ((eg) this).field_W[var37] + var88[2] * ((eg) this).field_E[var37] + 16384 >> 15;
                                  var39 = var88[3] * ((eg) this).field_N[var37] + var88[4] * ((eg) this).field_W[var37] + var88[5] * ((eg) this).field_E[var37] + 16384 >> 15;
                                  var40 = var88[6] * ((eg) this).field_N[var37] + var88[7] * ((eg) this).field_W[var37] + var88[8] * ((eg) this).field_E[var37] + 16384 >> 15;
                                  var38 = var38 + var30;
                                  var39 = var39 + var31;
                                  var40 = var40 + var32;
                                  ((eg) this).field_N[var37] = var38;
                                  ((eg) this).field_W[var37] = var39;
                                  ((eg) this).field_E[var37] = var40;
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
                      if (var11 < ((eg) this).field_I.length) {
                        var86 = ((eg) this).field_I[var11];
                        var13 = 0;
                        L23: while (true) {
                          if (var13 < var86.length) {
                            L24: {
                              var14 = var86[var13];
                              if (((eg) this).field_ob == null) {
                                break L24;
                              } else {
                                if ((param6 & ((eg) this).field_ob[var14]) != 0) {
                                  break L24;
                                } else {
                                  var13++;
                                  continue L23;
                                }
                              }
                            }
                            L25: {
                              ((eg) this).field_N[var14] = ((eg) this).field_N[var14] - field_pb;
                              ((eg) this).field_W[var14] = ((eg) this).field_W[var14] - field_hb;
                              ((eg) this).field_E[var14] = ((eg) this).field_E[var14] - field_A;
                              if (param4 == 0) {
                                break L25;
                              } else {
                                var15 = t.field_f[param4];
                                var16 = t.field_o[param4];
                                var17 = ((eg) this).field_W[var14] * var15 + ((eg) this).field_N[var14] * var16 + 32767 >> 16;
                                ((eg) this).field_W[var14] = ((eg) this).field_W[var14] * var16 - ((eg) this).field_N[var14] * var15 + 32767 >> 16;
                                ((eg) this).field_N[var14] = var17;
                                break L25;
                              }
                            }
                            L26: {
                              if (param2 == 0) {
                                break L26;
                              } else {
                                var15 = t.field_f[param2];
                                var16 = t.field_o[param2];
                                var17 = ((eg) this).field_W[var14] * var16 - ((eg) this).field_E[var14] * var15 + 32767 >> 16;
                                ((eg) this).field_E[var14] = ((eg) this).field_W[var14] * var15 + ((eg) this).field_E[var14] * var16 + 32767 >> 16;
                                ((eg) this).field_W[var14] = var17;
                                break L26;
                              }
                            }
                            L27: {
                              if (param3 == 0) {
                                break L27;
                              } else {
                                var15 = t.field_f[param3];
                                var16 = t.field_o[param3];
                                var17 = ((eg) this).field_E[var14] * var15 + ((eg) this).field_N[var14] * var16 + 32767 >> 16;
                                ((eg) this).field_E[var14] = ((eg) this).field_E[var14] * var16 - ((eg) this).field_N[var14] * var15 + 32767 >> 16;
                                ((eg) this).field_N[var14] = var17;
                                break L27;
                              }
                            }
                            ((eg) this).field_N[var14] = ((eg) this).field_N[var14] + field_pb;
                            ((eg) this).field_W[var14] = ((eg) this).field_W[var14] + field_hb;
                            ((eg) this).field_E[var14] = ((eg) this).field_E[var14] + field_A;
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
                    if (!field_O) {
                      break L28;
                    } else {
                      var16 = param7[0] * field_pb + param7[3] * field_hb + param7[6] * field_A + 16384 >> 15;
                      var17 = param7[1] * field_pb + param7[4] * field_hb + param7[7] * field_A + 16384 >> 15;
                      var18 = param7[2] * field_pb + param7[5] * field_hb + param7[8] * field_A + 16384 >> 15;
                      var16 = var16 + var13;
                      var17 = var17 + var14;
                      var18 = var18 + var15;
                      field_pb = var16;
                      field_hb = var17;
                      field_A = var18;
                      field_O = false;
                      break L28;
                    }
                  }
                  var83 = new int[9];
                  var72 = var83;
                  var61 = var72;
                  var50 = var61;
                  var16_ref_int__ = var50;
                  var17 = t.field_o[param2] >> 1;
                  var18 = t.field_f[param2] >> 1;
                  var19 = t.field_o[param3] >> 1;
                  var20 = t.field_f[param3] >> 1;
                  var21 = t.field_o[param4] >> 1;
                  var22 = t.field_f[param4] >> 1;
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
                  var25_int = var83[0] * -field_pb + var83[1] * -field_hb + var83[2] * -field_A + 16384 >> 15;
                  var26 = var83[3] * -field_pb + var83[4] * -field_hb + var83[5] * -field_A + 16384 >> 15;
                  var27 = var83[6] * -field_pb + var83[7] * -field_hb + var83[8] * -field_A + 16384 >> 15;
                  var28 = var25_int + field_pb;
                  var29_int = var26 + field_hb;
                  var30 = var27 + field_A;
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
                              if (var40 < ((eg) this).field_I.length) {
                                var84 = ((eg) this).field_I[var40];
                                var42 = 0;
                                L32: while (true) {
                                  if (var42 < var84.length) {
                                    L33: {
                                      var43 = var84[var42];
                                      if (((eg) this).field_ob == null) {
                                        break L33;
                                      } else {
                                        if ((param6 & ((eg) this).field_ob[var43]) != 0) {
                                          break L33;
                                        } else {
                                          var42++;
                                          continue L32;
                                        }
                                      }
                                    }
                                    var44 = var85[0] * ((eg) this).field_N[var43] + var85[1] * ((eg) this).field_W[var43] + var85[2] * ((eg) this).field_E[var43] + 16384 >> 15;
                                    var45 = var85[3] * ((eg) this).field_N[var43] + var85[4] * ((eg) this).field_W[var43] + var85[5] * ((eg) this).field_E[var43] + 16384 >> 15;
                                    var46 = var85[6] * ((eg) this).field_N[var43] + var85[7] * ((eg) this).field_W[var43] + var85[8] * ((eg) this).field_E[var43] + 16384 >> 15;
                                    var44 = var44 + var36;
                                    var45 = var45 + var37;
                                    var46 = var46 + var38;
                                    ((eg) this).field_N[var43] = var44;
                                    ((eg) this).field_W[var43] = var45;
                                    ((eg) this).field_E[var43] = var46;
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
                if (var11 < ((eg) this).field_I.length) {
                  var82 = ((eg) this).field_I[var11];
                  var13 = 0;
                  L40: while (true) {
                    if (var13 < var82.length) {
                      L41: {
                        var14 = var82[var13];
                        if (((eg) this).field_ob == null) {
                          break L41;
                        } else {
                          if ((param6 & ((eg) this).field_ob[var14]) != 0) {
                            break L41;
                          } else {
                            var13++;
                            continue L40;
                          }
                        }
                      }
                      ((eg) this).field_N[var14] = ((eg) this).field_N[var14] + param2;
                      ((eg) this).field_W[var14] = ((eg) this).field_W[var14] + param3;
                      ((eg) this).field_E[var14] = ((eg) this).field_E[var14] + param4;
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
          field_pb = 0;
          field_hb = 0;
          field_A = 0;
          var11 = 0;
          L42: while (true) {
            if (var11 >= var9) {
              L43: {
                if (var10 <= 0) {
                  field_pb = param2;
                  field_hb = param3;
                  field_A = param4;
                  break L43;
                } else {
                  field_pb = field_pb / var10 + param2;
                  field_hb = field_hb / var10 + param3;
                  field_A = field_A / var10 + param4;
                  field_O = true;
                  break L43;
                }
              }
              return;
            } else {
              var12 = param1[var11];
              if (var12 < ((eg) this).field_I.length) {
                var81 = ((eg) this).field_I[var12];
                var14 = 0;
                L44: while (true) {
                  if (var14 < var81.length) {
                    L45: {
                      var15 = var81[var14];
                      if (((eg) this).field_ob == null) {
                        break L45;
                      } else {
                        if ((param6 & ((eg) this).field_ob[var15]) != 0) {
                          break L45;
                        } else {
                          var14++;
                          continue L44;
                        }
                      }
                    }
                    field_pb = field_pb + ((eg) this).field_N[var15];
                    field_hb = field_hb + ((eg) this).field_W[var15];
                    field_A = field_A + ((eg) this).field_E[var15];
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
          if (((eg) this).field_M) {
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
        if (var5 >= 50 - ((eg) this).field_lb) {
          var15 = ((eg) this).field_lb * 92682 >> 16;
          if (var3 >= -var5 - var15) {
            if (var3 <= var5 + var15) {
              if (var4 >= -var5 - var15) {
                if (var4 <= var5 + var15) {
                  L1: {
                    if (var5 > 50 + ((eg) this).field_lb) {
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
                      if (((eg) this).field_eb > 0) {
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
                  var18 = t.field_p;
                  var19 = t.field_e;
                  var20 = 0;
                  var27 = 0;
                  var21_int = var27;
                  L3: while (true) {
                    if (var27 >= ((eg) this).field_L) {
                      try {
                        L4: {
                          this.a((var20 & var16) != 0, false, 0L, (int) ((eg) this).field_lb, ((eg) this).field_lb << 1);
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
                        var22 = ((eg) this).field_N[var27];
                        var23 = ((eg) this).field_W[var27];
                        var24 = ((eg) this).field_E[var27];
                        var25 = var22 * var6 + var23 * var9 + var24 * var12 >> 16;
                        var26 = var22 * var7 + var23 * var10 + var24 * var13 >> 16;
                        var24 = var22 * var8 + var23 * var11 + var24 * var14 >> 16;
                        var22 = var25;
                        var23 = var26;
                        field_U[var27] = var24;
                        var22 = var22 + var3;
                        var23 = var23 + var4;
                        var24 = var24 + var5;
                        if (var24 < 50) {
                          field_i[var27] = -5000;
                          var20 = 1;
                          break L6;
                        } else {
                          field_i[var27] = var18 + (var22 << 9) / var24;
                          field_s[var27] = var19 + (var23 << 9) / var24;
                          break L6;
                        }
                      }
                      if (var17 != 0) {
                        field_R[var27] = var22;
                        field_B[var27] = var23;
                        field_u[var27] = var24;
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

    private final boolean b(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
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
          if (var9 >= ((eg) this).field_T) {
            ((eg) this).field_lb = (short)(int)(Math.sqrt((double)var8) + 0.99);
            ((eg) this).field_M = true;
            return;
          } else {
            L1: {
              var10 = ((eg) this).field_N[var9];
              var11 = ((eg) this).field_W[var9];
              var12 = ((eg) this).field_E[var9];
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

    final qc a(boolean param0, boolean param1, boolean param2) {
        L0: {
          if (!param0) {
            if (field_jb.length < ((eg) this).field_ab) {
              field_jb = new byte[((eg) this).field_ab + 100];
              if (param1) {
                break L0;
              } else {
                if (field_y.length >= ((eg) this).field_ab) {
                  break L0;
                } else {
                  field_G = new int[((eg) this).field_ab + 100];
                  field_cb = new int[((eg) this).field_ab + 100];
                  field_j = new int[((eg) this).field_ab + 100];
                  field_y = new short[((eg) this).field_ab + 100];
                  break L0;
                }
              }
            } else {
              if (param1) {
                break L0;
              } else {
                if (field_y.length >= ((eg) this).field_ab) {
                  break L0;
                } else {
                  field_G = new int[((eg) this).field_ab + 100];
                  field_cb = new int[((eg) this).field_ab + 100];
                  field_j = new int[((eg) this).field_ab + 100];
                  field_y = new short[((eg) this).field_ab + 100];
                  break L0;
                }
              }
            }
          } else {
            if (param1) {
              break L0;
            } else {
              if (field_y.length >= ((eg) this).field_ab) {
                break L0;
              } else {
                field_G = new int[((eg) this).field_ab + 100];
                field_cb = new int[((eg) this).field_ab + 100];
                field_j = new int[((eg) this).field_ab + 100];
                field_y = new short[((eg) this).field_ab + 100];
                break L0;
              }
            }
          }
        }
        return this.a(param0, param1, field_r, field_jb, field_y, field_G, field_cb, field_j);
    }

    final boolean b() {
        if (((eg) this).field_I == null) {
            return false;
        }
        field_pb = 0;
        field_hb = 0;
        field_A = 0;
        return true;
    }

    private eg() {
        ((eg) this).field_T = 0;
        ((eg) this).field_M = false;
        ((eg) this).field_X = false;
        ((eg) this).field_L = 0;
        ((eg) this).field_ab = 0;
        ((eg) this).field_eb = 0;
    }

    eg(vn param0, int param1, int param2, int param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var9_ref_int__ = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        rn var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        ia var18 = null;
        ia var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        L0: {
          ((eg) this).field_T = 0;
          ((eg) this).field_M = false;
          ((eg) this).field_X = false;
          ((eg) this).field_L = 0;
          ((eg) this).field_ab = 0;
          ((eg) this).field_eb = 0;
          param0.b();
          param0.a();
          ((eg) this).field_L = param0.field_m;
          ((eg) this).field_T = param0.field_t;
          ((eg) this).field_N = param0.field_H;
          ((eg) this).field_W = param0.field_l;
          ((eg) this).field_E = param0.field_A;
          ((eg) this).field_ab = param0.field_D;
          ((eg) this).field_gb = param0.field_r;
          ((eg) this).field_S = param0.field_L;
          ((eg) this).field_h = param0.field_w;
          ((eg) this).field_w = param0.field_z;
          ((eg) this).field_m = param0.field_k;
          ((eg) this).field_p = param0.field_p;
          ((eg) this).field_I = param0.field_s;
          ((eg) this).field_nb = param0.field_v;
          ((eg) this).field_fb = param0.field_K;
          ((eg) this).field_ob = param0.field_n;
          var7 = (int)Math.sqrt((double)(param3 * param3 + param4 * param4 + param5 * param5));
          var8 = param2 * var7 >> 8;
          ((eg) this).field_kb = new int[((eg) this).field_ab];
          ((eg) this).field_v = new int[((eg) this).field_ab];
          ((eg) this).field_n = new int[((eg) this).field_ab];
          if (param0.field_u == null) {
            ((eg) this).field_x = null;
            break L0;
          } else {
            ((eg) this).field_x = new short[((eg) this).field_ab];
            var9 = 0;
            L1: while (true) {
              if (var9 >= ((eg) this).field_ab) {
                break L0;
              } else {
                L2: {
                  var10 = param0.field_u[var9];
                  if (var10 == -1) {
                    break L2;
                  } else {
                    if (!t.field_d.a(var10, 2738)) {
                      break L2;
                    } else {
                      ((eg) this).field_x[var9] = (short)var10;
                      var9++;
                      continue L1;
                    }
                  }
                }
                ((eg) this).field_x[var9] = (short) -1;
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
            if (param0.field_I == null) {
              break L3;
            } else {
              var22 = new int[param0.field_R];
              var21 = var22;
              var20 = var21;
              var17 = var20;
              var9_ref_int__ = var17;
              var10 = 0;
              L4: while (true) {
                if (var10 >= ((eg) this).field_ab) {
                  ((eg) this).field_eb = 0;
                  var10 = 0;
                  L5: while (true) {
                    if (var10 >= param0.field_R) {
                      ((eg) this).field_mb = new int[((eg) this).field_eb];
                      ((eg) this).field_C = new int[((eg) this).field_eb];
                      ((eg) this).field_qb = new int[((eg) this).field_eb];
                      var10 = 0;
                      var11 = 0;
                      L6: while (true) {
                        if (var11 >= param0.field_R) {
                          ((eg) this).field_o = new byte[((eg) this).field_ab];
                          var11 = 0;
                          L7: while (true) {
                            if (var11 >= ((eg) this).field_ab) {
                              break L3;
                            } else {
                              if (param0.field_I[var11] == -1) {
                                ((eg) this).field_o[var11] = (byte) -1;
                                var11++;
                                continue L7;
                              } else {
                                ((eg) this).field_o[var11] = (byte)var9_ref_int__[param0.field_I[var11] & 255];
                                if (((eg) this).field_o[var11] == -1) {
                                  if (((eg) this).field_x != null) {
                                    ((eg) this).field_x[var11] = (short) -1;
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
                              if (param0.field_T[var11] != 0) {
                                break L8;
                              } else {
                                ((eg) this).field_mb[var10] = param0.field_h[var11] & 65535;
                                ((eg) this).field_C[var10] = param0.field_B[var11] & 65535;
                                ((eg) this).field_qb[var10] = param0.field_y[var11] & 65535;
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
                        if (param0.field_T[var10] == 0) {
                          ((eg) this).field_eb = ((eg) this).field_eb + 1;
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
                  if (param0.field_I[var10] != -1) {
                    var9_ref_int__[param0.field_I[var10] & 255] = var9_ref_int__[param0.field_I[var10] & 255] + 1;
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
          if (var16 >= ((eg) this).field_ab) {
            return;
          } else {
            L10: {
              if (param0.field_o != null) {
                var10 = param0.field_o[var16];
                break L10;
              } else {
                var10 = 0;
                break L10;
              }
            }
            L11: {
              if (param0.field_k != null) {
                var11 = param0.field_k[var16];
                break L11;
              } else {
                var11 = 0;
                break L11;
              }
            }
            L12: {
              if (((eg) this).field_x != null) {
                var12 = ((eg) this).field_x[var16];
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
                  ((eg) this).field_n[var16] = -2;
                  var16++;
                  continue L9;
                } else {
                  var19 = param0.field_J[var16];
                  var14 = param1 + (param3 * var19.field_f + param4 * var19.field_a + param5 * var19.field_g) / (var8 + var8 / 2);
                  ((eg) this).field_kb[var16] = eg.d(var14);
                  ((eg) this).field_n[var16] = -1;
                  var16++;
                  continue L9;
                }
              } else {
                L15: {
                  L16: {
                    if (param0.field_q == null) {
                      break L16;
                    } else {
                      if (param0.field_q[((eg) this).field_gb[var16]] == null) {
                        break L16;
                      } else {
                        var13 = param0.field_q[((eg) this).field_gb[var16]];
                        break L15;
                      }
                    }
                  }
                  var13 = param0.field_i[((eg) this).field_gb[var16]];
                  break L15;
                }
                L17: {
                  L18: {
                    var14 = param1 + (param3 * var13.field_a + param4 * var13.field_b + param5 * var13.field_f) / (var8 * var13.field_g);
                    ((eg) this).field_kb[var16] = eg.d(var14);
                    if (param0.field_q == null) {
                      break L18;
                    } else {
                      if (param0.field_q[((eg) this).field_S[var16]] == null) {
                        break L18;
                      } else {
                        var13 = param0.field_q[((eg) this).field_S[var16]];
                        break L17;
                      }
                    }
                  }
                  var13 = param0.field_i[((eg) this).field_S[var16]];
                  break L17;
                }
                L19: {
                  L20: {
                    var14 = param1 + (param3 * var13.field_a + param4 * var13.field_b + param5 * var13.field_f) / (var8 * var13.field_g);
                    ((eg) this).field_v[var16] = eg.d(var14);
                    if (param0.field_q == null) {
                      break L20;
                    } else {
                      if (param0.field_q[((eg) this).field_h[var16]] == null) {
                        break L20;
                      } else {
                        var13 = param0.field_q[((eg) this).field_h[var16]];
                        break L19;
                      }
                    }
                  }
                  var13 = param0.field_i[((eg) this).field_h[var16]];
                  break L19;
                }
                var14 = param1 + (param3 * var13.field_a + param4 * var13.field_b + param5 * var13.field_f) / (var8 * var13.field_g);
                ((eg) this).field_n[var16] = eg.d(var14);
                var16++;
                continue L9;
              }
            } else {
              if (var10 != 0) {
                if (var10 != 1) {
                  if (var10 != 3) {
                    ((eg) this).field_n[var16] = -2;
                    var16++;
                    continue L9;
                  } else {
                    ((eg) this).field_kb[var16] = 128;
                    ((eg) this).field_n[var16] = -1;
                    var16++;
                    continue L9;
                  }
                } else {
                  var18 = param0.field_J[var16];
                  var14 = param1 + (param3 * var18.field_f + param4 * var18.field_a + param5 * var18.field_g) / (var8 + var8 / 2) << 17;
                  ((eg) this).field_kb[var16] = var14 | eg.a(param0.field_p[var16] & 65535, var14 >> 17);
                  ((eg) this).field_n[var16] = -1;
                  var16++;
                  continue L9;
                }
              } else {
                L21: {
                  L22: {
                    var15 = param0.field_p[var16] & 65535;
                    if (param0.field_q == null) {
                      break L22;
                    } else {
                      if (param0.field_q[((eg) this).field_gb[var16]] == null) {
                        break L22;
                      } else {
                        var13 = param0.field_q[((eg) this).field_gb[var16]];
                        break L21;
                      }
                    }
                  }
                  var13 = param0.field_i[((eg) this).field_gb[var16]];
                  break L21;
                }
                L23: {
                  L24: {
                    var14 = param1 + (param3 * var13.field_a + param4 * var13.field_b + param5 * var13.field_f) / (var8 * var13.field_g) << 17;
                    ((eg) this).field_kb[var16] = var14 | eg.a(var15, var14 >> 17);
                    if (param0.field_q == null) {
                      break L24;
                    } else {
                      if (param0.field_q[((eg) this).field_S[var16]] == null) {
                        break L24;
                      } else {
                        var13 = param0.field_q[((eg) this).field_S[var16]];
                        break L23;
                      }
                    }
                  }
                  var13 = param0.field_i[((eg) this).field_S[var16]];
                  break L23;
                }
                L25: {
                  L26: {
                    var14 = param1 + (param3 * var13.field_a + param4 * var13.field_b + param5 * var13.field_f) / (var8 * var13.field_g) << 17;
                    ((eg) this).field_v[var16] = var14 | eg.a(var15, var14 >> 17);
                    if (param0.field_q == null) {
                      break L26;
                    } else {
                      if (param0.field_q[((eg) this).field_h[var16]] == null) {
                        break L26;
                      } else {
                        var13 = param0.field_q[((eg) this).field_h[var16]];
                        break L25;
                      }
                    }
                  }
                  var13 = param0.field_i[((eg) this).field_h[var16]];
                  break L25;
                }
                var14 = param1 + (param3 * var13.field_a + param4 * var13.field_b + param5 * var13.field_f) / (var8 * var13.field_g) << 17;
                ((eg) this).field_n[var16] = var14 | eg.a(var15, var14 >> 17);
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
        field_r = new eg();
        field_cb = new int[1];
        field_y = new short[1];
        field_j = new int[1];
        field_jb = new byte[1];
        field_G = new int[1];
        eg discarded$0 = new eg();
        eg discarded$1 = new eg();
        field_Z = new int[4096];
        field_q = new int[12];
        field_U = new int[4096];
        field_z = new int[12];
        field_i = new int[4096];
        field_s = new int[4096];
        field_bb = 0;
        field_Y = new int[12][4096];
        field_u = new int[4096];
        field_R = new int[4096];
        field_ib = new boolean[4096];
        field_O = false;
        field_H = new int[10];
        field_db = new int[10];
        field_B = new int[4096];
        field_l = false;
        field_V = new int[4096];
        field_t = new int[10];
        if (field_l) {
            field_J = new int[4096];
            field_k = new int[4096];
        } else {
            field_D = new int[1600];
            field_Q = new int[1600][64];
            field_P = new int[32];
            field_K = new int[32][512];
        }
        field_F = new boolean[4096];
    }
}
