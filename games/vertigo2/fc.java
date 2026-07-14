/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fc extends bn {
    int[] field_C;
    byte[] field_eb;
    int[] field_u;
    int[] field_bb;
    int[] field_X;
    int[] field_D;
    int[] field_a;
    int field_w;
    private short[] field_t;
    int[] field_k;
    int field_T;
    int[] field_N;
    private short field_db;
    int field_L;
    int field_W;
    private static fc field_ab;
    int[] field_A;
    int[] field_E;
    byte[] field_H;
    private boolean field_I;
    byte[] field_R;
    private int[][] field_g;
    private short[] field_Y;
    int[] field_i;
    private static byte[] field_h;
    short[] field_F;
    private static int[] field_hb;
    private static int[] field_s;
    int[] field_o;
    private static short[] field_m;
    private short field_lb;
    private static int[] field_f;
    boolean field_K;
    private int[][] field_b;
    short[] field_d;
    byte field_M;
    private static int[] field_fb;
    private static int[] field_q;
    private static int[] field_v;
    private static boolean[] field_Z;
    private static int[] field_V;
    private static int[] field_O;
    private static int[] field_J;
    private static int[] field_l;
    private static int[] field_Q;
    private static int[][] field_G;
    private static int[] field_j;
    private static boolean field_B;
    private static int[] field_P;
    private static int[] field_cb;
    private static int[] field_S;
    private static int field_ib;
    private static int[] field_r;
    private static int[] field_gb;
    private static int[] field_c;
    private static boolean field_n;
    private static int[] field_jb;
    private static int field_e;
    private static int field_x;
    private static int[][] field_y;
    private static int[][] field_U;
    private static boolean[] field_p;
    private static int field_kb;
    private static int[] field_z;

    final int f() {
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (((fc) this).field_K) {
              break L0;
            } else {
              this.e();
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
        }
        throw decompiledCaughtException;
    }

    private final static int b(int param0) {
        if (param0 < 2) {
            param0 = 2;
        } else {
            if (param0 > 126) {
                param0 = 126;
            }
        }
        return param0;
    }

    final void a(int param0, int[] param1, int param2, int param3, int param4, boolean param5, int param6, int[] param7) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12_int = 0;
        int[] var12 = null;
        int[] var13_ref_int__ = null;
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
        int[] var41 = null;
        int var42 = 0;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        int var46 = 0;
        var9 = param1.length;
        if (param0 != 0) {
          if (param0 != 1) {
            if (param0 != 2) {
              if (param0 != 3) {
                if (param0 != 5) {
                  if (param0 != 7) {
                    return;
                  } else {
                    L0: {
                      if (((fc) this).field_g == null) {
                        break L0;
                      } else {
                        var10 = 0;
                        L1: while (true) {
                          if (var10 >= var9) {
                            break L0;
                          } else {
                            L2: {
                              var11 = param1[var10];
                              if (var11 >= ((fc) this).field_g.length) {
                                break L2;
                              } else {
                                var12 = ((fc) this).field_g[var11];
                                var13 = 0;
                                L3: while (true) {
                                  if (var13 >= var12.length) {
                                    ((fc) this).field_I = true;
                                    break L2;
                                  } else {
                                    L4: {
                                      L5: {
                                        var14 = var12[var13];
                                        if (((fc) this).field_t == null) {
                                          break L5;
                                        } else {
                                          if ((param6 & ((fc) this).field_t[var14]) != 0) {
                                            break L5;
                                          } else {
                                            break L4;
                                          }
                                        }
                                      }
                                      L6: {
                                        var15 = ((fc) this).field_d[var14] & 65535;
                                        var16 = var15 >> 10 & 63;
                                        var17 = var15 >> 7 & 7;
                                        var18 = var15 & 127;
                                        var16 = var16 + param2 & 63;
                                        var17 = var17 + param3;
                                        if (var17 >= 0) {
                                          if (var17 <= 7) {
                                            break L6;
                                          } else {
                                            var17 = 7;
                                            break L6;
                                          }
                                        } else {
                                          var17 = 0;
                                          break L6;
                                        }
                                      }
                                      L7: {
                                        var18 = var18 + param4;
                                        if (var18 >= 0) {
                                          if (var18 <= 127) {
                                            break L7;
                                          } else {
                                            var18 = 127;
                                            break L7;
                                          }
                                        } else {
                                          var18 = 0;
                                          break L7;
                                        }
                                      }
                                      ((fc) this).field_d[var14] = (short)(var16 << 10 | var17 << 7 | var18);
                                      break L4;
                                    }
                                    var13++;
                                    continue L3;
                                  }
                                }
                              }
                            }
                            var10++;
                            continue L1;
                          }
                        }
                      }
                    }
                    return;
                  }
                } else {
                  L8: {
                    if (((fc) this).field_g == null) {
                      break L8;
                    } else {
                      if (((fc) this).field_R == null) {
                        break L8;
                      } else {
                        var10 = 0;
                        L9: while (true) {
                          if (var10 >= var9) {
                            break L8;
                          } else {
                            L10: {
                              var11 = param1[var10];
                              if (var11 >= ((fc) this).field_g.length) {
                                break L10;
                              } else {
                                var12 = ((fc) this).field_g[var11];
                                var13 = 0;
                                L11: while (true) {
                                  if (var13 >= var12.length) {
                                    break L10;
                                  } else {
                                    L12: {
                                      L13: {
                                        var14 = var12[var13];
                                        if (((fc) this).field_t == null) {
                                          break L13;
                                        } else {
                                          if ((param6 & ((fc) this).field_t[var14]) != 0) {
                                            break L13;
                                          } else {
                                            break L12;
                                          }
                                        }
                                      }
                                      L14: {
                                        var15 = (((fc) this).field_R[var14] & 255) + param2 * 8;
                                        if (var15 >= 0) {
                                          if (var15 <= 255) {
                                            break L14;
                                          } else {
                                            var15 = 255;
                                            break L14;
                                          }
                                        } else {
                                          var15 = 0;
                                          break L14;
                                        }
                                      }
                                      ((fc) this).field_R[var14] = (byte)var15;
                                      break L12;
                                    }
                                    var13++;
                                    continue L11;
                                  }
                                }
                              }
                            }
                            var10++;
                            continue L9;
                          }
                        }
                      }
                    }
                  }
                  return;
                }
              } else {
                L15: {
                  if (param7 == null) {
                    var10 = 0;
                    L16: while (true) {
                      if (var10 >= var9) {
                        break L15;
                      } else {
                        L17: {
                          var11 = param1[var10];
                          if (var11 >= ((fc) this).field_b.length) {
                            break L17;
                          } else {
                            var12 = ((fc) this).field_b[var11];
                            var13 = 0;
                            L18: while (true) {
                              if (var13 >= var12.length) {
                                break L17;
                              } else {
                                L19: {
                                  L20: {
                                    var14 = var12[var13];
                                    if (((fc) this).field_Y == null) {
                                      break L20;
                                    } else {
                                      if ((param6 & ((fc) this).field_Y[var14]) != 0) {
                                        break L20;
                                      } else {
                                        break L19;
                                      }
                                    }
                                  }
                                  ((fc) this).field_k[var14] = ((fc) this).field_k[var14] - field_kb;
                                  ((fc) this).field_C[var14] = ((fc) this).field_C[var14] - field_ib;
                                  ((fc) this).field_A[var14] = ((fc) this).field_A[var14] - field_x;
                                  ((fc) this).field_k[var14] = ((fc) this).field_k[var14] * param2 / 128;
                                  ((fc) this).field_C[var14] = ((fc) this).field_C[var14] * param3 / 128;
                                  ((fc) this).field_A[var14] = ((fc) this).field_A[var14] * param4 / 128;
                                  ((fc) this).field_k[var14] = ((fc) this).field_k[var14] + field_kb;
                                  ((fc) this).field_C[var14] = ((fc) this).field_C[var14] + field_ib;
                                  ((fc) this).field_A[var14] = ((fc) this).field_A[var14] + field_x;
                                  break L19;
                                }
                                var13++;
                                continue L18;
                              }
                            }
                          }
                        }
                        var10++;
                        continue L16;
                      }
                    }
                  } else {
                    L21: {
                      var10 = param7[9];
                      var11 = param7[10];
                      var12_int = param7[11];
                      var13 = param7[12];
                      var14 = param7[13];
                      var15 = param7[14];
                      if (!field_n) {
                        break L21;
                      } else {
                        var16 = param7[0] * field_kb + param7[3] * field_ib + param7[6] * field_x + 16384 >> 15;
                        var17 = param7[1] * field_kb + param7[4] * field_ib + param7[7] * field_x + 16384 >> 15;
                        var18 = param7[2] * field_kb + param7[5] * field_ib + param7[8] * field_x + 16384 >> 15;
                        var16 = var16 + var13;
                        var17 = var17 + var14;
                        var18 = var18 + var15;
                        field_kb = var16;
                        field_ib = var17;
                        field_x = var18;
                        field_n = false;
                        break L21;
                      }
                    }
                    var16 = param2 << 15 >> 7;
                    var17 = param3 << 15 >> 7;
                    var18 = param4 << 15 >> 7;
                    var19 = var16 * -field_kb + 16384 >> 15;
                    var20 = var17 * -field_ib + 16384 >> 15;
                    var21 = var18 * -field_x + 16384 >> 15;
                    var22 = var19 + field_kb;
                    var23 = var20 + field_ib;
                    var24 = var21 + field_x;
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
                    var29 = new int[9];
                    var30 = 0;
                    L22: while (true) {
                      if (var30 >= 3) {
                        var30 = param7[0] * var26 + param7[1] * var27 + param7[2] * var28 + 16384 >> 15;
                        var31 = param7[3] * var26 + param7[4] * var27 + param7[5] * var28 + 16384 >> 15;
                        var32 = param7[6] * var26 + param7[7] * var27 + param7[8] * var28 + 16384 >> 15;
                        var30 = var30 + var10;
                        var31 = var31 + var11;
                        var32 = var32 + var12_int;
                        var33 = 0;
                        L23: while (true) {
                          if (var33 >= var9) {
                            break L15;
                          } else {
                            L24: {
                              var34 = param1[var33];
                              if (var34 >= ((fc) this).field_b.length) {
                                break L24;
                              } else {
                                var35 = ((fc) this).field_b[var34];
                                var36 = 0;
                                L25: while (true) {
                                  if (var36 >= var35.length) {
                                    break L24;
                                  } else {
                                    L26: {
                                      L27: {
                                        var37 = var35[var36];
                                        if (((fc) this).field_Y == null) {
                                          break L27;
                                        } else {
                                          if ((param6 & ((fc) this).field_Y[var37]) != 0) {
                                            break L27;
                                          } else {
                                            break L26;
                                          }
                                        }
                                      }
                                      var38 = var29[0] * ((fc) this).field_k[var37] + var29[1] * ((fc) this).field_C[var37] + var29[2] * ((fc) this).field_A[var37] + 16384 >> 15;
                                      var39 = var29[3] * ((fc) this).field_k[var37] + var29[4] * ((fc) this).field_C[var37] + var29[5] * ((fc) this).field_A[var37] + 16384 >> 15;
                                      var40 = var29[6] * ((fc) this).field_k[var37] + var29[7] * ((fc) this).field_C[var37] + var29[8] * ((fc) this).field_A[var37] + 16384 >> 15;
                                      var38 = var38 + var30;
                                      var39 = var39 + var31;
                                      var40 = var40 + var32;
                                      ((fc) this).field_k[var37] = var38;
                                      ((fc) this).field_C[var37] = var39;
                                      ((fc) this).field_A[var37] = var40;
                                      break L26;
                                    }
                                    var36++;
                                    continue L25;
                                  }
                                }
                              }
                            }
                            var33++;
                            continue L23;
                          }
                        }
                      } else {
                        var31 = 0;
                        L28: while (true) {
                          if (var31 >= 3) {
                            var30++;
                            continue L22;
                          } else {
                            var32 = 0;
                            var33 = 0;
                            L29: while (true) {
                              if (var33 >= 3) {
                                var29[var30 * 3 + var31] = var32 + 16384 >> 15;
                                var31++;
                                continue L28;
                              } else {
                                var32 = var32 + param7[var30 * 3 + var33] * var25[var31 + var33 * 3];
                                var33++;
                                continue L29;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
                return;
              }
            } else {
              L30: {
                if (param7 == null) {
                  var10 = 0;
                  L31: while (true) {
                    if (var10 >= var9) {
                      break L30;
                    } else {
                      L32: {
                        var11 = param1[var10];
                        if (var11 >= ((fc) this).field_b.length) {
                          break L32;
                        } else {
                          var12 = ((fc) this).field_b[var11];
                          var13 = 0;
                          L33: while (true) {
                            if (var13 >= var12.length) {
                              break L32;
                            } else {
                              L34: {
                                L35: {
                                  var14 = var12[var13];
                                  if (((fc) this).field_Y == null) {
                                    break L35;
                                  } else {
                                    if ((param6 & ((fc) this).field_Y[var14]) != 0) {
                                      break L35;
                                    } else {
                                      break L34;
                                    }
                                  }
                                }
                                L36: {
                                  ((fc) this).field_k[var14] = ((fc) this).field_k[var14] - field_kb;
                                  ((fc) this).field_C[var14] = ((fc) this).field_C[var14] - field_ib;
                                  ((fc) this).field_A[var14] = ((fc) this).field_A[var14] - field_x;
                                  if (param4 == 0) {
                                    break L36;
                                  } else {
                                    var15 = oo.field_j[param4];
                                    var16 = oo.field_h[param4];
                                    var17 = ((fc) this).field_C[var14] * var15 + ((fc) this).field_k[var14] * var16 + 32767 >> 16;
                                    ((fc) this).field_C[var14] = ((fc) this).field_C[var14] * var16 - ((fc) this).field_k[var14] * var15 + 32767 >> 16;
                                    ((fc) this).field_k[var14] = var17;
                                    break L36;
                                  }
                                }
                                L37: {
                                  if (param2 == 0) {
                                    break L37;
                                  } else {
                                    var15 = oo.field_j[param2];
                                    var16 = oo.field_h[param2];
                                    var17 = ((fc) this).field_C[var14] * var16 - ((fc) this).field_A[var14] * var15 + 32767 >> 16;
                                    ((fc) this).field_A[var14] = ((fc) this).field_C[var14] * var15 + ((fc) this).field_A[var14] * var16 + 32767 >> 16;
                                    ((fc) this).field_C[var14] = var17;
                                    break L37;
                                  }
                                }
                                L38: {
                                  if (param3 == 0) {
                                    break L38;
                                  } else {
                                    var15 = oo.field_j[param3];
                                    var16 = oo.field_h[param3];
                                    var17 = ((fc) this).field_A[var14] * var15 + ((fc) this).field_k[var14] * var16 + 32767 >> 16;
                                    ((fc) this).field_A[var14] = ((fc) this).field_A[var14] * var16 - ((fc) this).field_k[var14] * var15 + 32767 >> 16;
                                    ((fc) this).field_k[var14] = var17;
                                    break L38;
                                  }
                                }
                                ((fc) this).field_k[var14] = ((fc) this).field_k[var14] + field_kb;
                                ((fc) this).field_C[var14] = ((fc) this).field_C[var14] + field_ib;
                                ((fc) this).field_A[var14] = ((fc) this).field_A[var14] + field_x;
                                break L34;
                              }
                              var13++;
                              continue L33;
                            }
                          }
                        }
                      }
                      var10++;
                      continue L31;
                    }
                  }
                } else {
                  L39: {
                    var10 = param7[9];
                    var11 = param7[10];
                    var12_int = param7[11];
                    var13 = param7[12];
                    var14 = param7[13];
                    var15 = param7[14];
                    if (!field_n) {
                      break L39;
                    } else {
                      var16 = param7[0] * field_kb + param7[3] * field_ib + param7[6] * field_x + 16384 >> 15;
                      var17 = param7[1] * field_kb + param7[4] * field_ib + param7[7] * field_x + 16384 >> 15;
                      var18 = param7[2] * field_kb + param7[5] * field_ib + param7[8] * field_x + 16384 >> 15;
                      var16 = var16 + var13;
                      var17 = var17 + var14;
                      var18 = var18 + var15;
                      field_kb = var16;
                      field_ib = var17;
                      field_x = var18;
                      field_n = false;
                      break L39;
                    }
                  }
                  var16_ref_int__ = new int[9];
                  var17 = oo.field_h[param2] >> 1;
                  var18 = oo.field_j[param2] >> 1;
                  var19 = oo.field_h[param3] >> 1;
                  var20 = oo.field_j[param3] >> 1;
                  var21 = oo.field_h[param4] >> 1;
                  var22 = oo.field_j[param4] >> 1;
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
                  var25_int = var16_ref_int__[0] * -field_kb + var16_ref_int__[1] * -field_ib + var16_ref_int__[2] * -field_x + 16384 >> 15;
                  var26 = var16_ref_int__[3] * -field_kb + var16_ref_int__[4] * -field_ib + var16_ref_int__[5] * -field_x + 16384 >> 15;
                  var27 = var16_ref_int__[6] * -field_kb + var16_ref_int__[7] * -field_ib + var16_ref_int__[8] * -field_x + 16384 >> 15;
                  var28 = var25_int + field_kb;
                  var29_int = var26 + field_ib;
                  var30 = var27 + field_x;
                  var31_ref_int__ = new int[9];
                  var32 = 0;
                  L40: while (true) {
                    if (var32 >= 3) {
                      var32 = var16_ref_int__[0] * var13 + var16_ref_int__[1] * var14 + var16_ref_int__[2] * var15 + 16384 >> 15;
                      var33 = var16_ref_int__[3] * var13 + var16_ref_int__[4] * var14 + var16_ref_int__[5] * var15 + 16384 >> 15;
                      var34 = var16_ref_int__[6] * var13 + var16_ref_int__[7] * var14 + var16_ref_int__[8] * var15 + 16384 >> 15;
                      var32 = var32 + var28;
                      var33 = var33 + var29_int;
                      var34 = var34 + var30;
                      var35 = new int[9];
                      var36 = 0;
                      L41: while (true) {
                        if (var36 >= 3) {
                          var36 = param7[0] * var32 + param7[1] * var33 + param7[2] * var34 + 16384 >> 15;
                          var37 = param7[3] * var32 + param7[4] * var33 + param7[5] * var34 + 16384 >> 15;
                          var38 = param7[6] * var32 + param7[7] * var33 + param7[8] * var34 + 16384 >> 15;
                          var36 = var36 + var10;
                          var37 = var37 + var11;
                          var38 = var38 + var12_int;
                          var39 = 0;
                          L42: while (true) {
                            if (var39 >= var9) {
                              break L30;
                            } else {
                              L43: {
                                var40 = param1[var39];
                                if (var40 >= ((fc) this).field_b.length) {
                                  break L43;
                                } else {
                                  var41 = ((fc) this).field_b[var40];
                                  var42 = 0;
                                  L44: while (true) {
                                    if (var42 >= var41.length) {
                                      break L43;
                                    } else {
                                      L45: {
                                        L46: {
                                          var43 = var41[var42];
                                          if (((fc) this).field_Y == null) {
                                            break L46;
                                          } else {
                                            if ((param6 & ((fc) this).field_Y[var43]) != 0) {
                                              break L46;
                                            } else {
                                              break L45;
                                            }
                                          }
                                        }
                                        var44 = var35[0] * ((fc) this).field_k[var43] + var35[1] * ((fc) this).field_C[var43] + var35[2] * ((fc) this).field_A[var43] + 16384 >> 15;
                                        var45 = var35[3] * ((fc) this).field_k[var43] + var35[4] * ((fc) this).field_C[var43] + var35[5] * ((fc) this).field_A[var43] + 16384 >> 15;
                                        var46 = var35[6] * ((fc) this).field_k[var43] + var35[7] * ((fc) this).field_C[var43] + var35[8] * ((fc) this).field_A[var43] + 16384 >> 15;
                                        var44 = var44 + var36;
                                        var45 = var45 + var37;
                                        var46 = var46 + var38;
                                        ((fc) this).field_k[var43] = var44;
                                        ((fc) this).field_C[var43] = var45;
                                        ((fc) this).field_A[var43] = var46;
                                        break L45;
                                      }
                                      var42++;
                                      continue L44;
                                    }
                                  }
                                }
                              }
                              var39++;
                              continue L42;
                            }
                          }
                        } else {
                          var37 = 0;
                          L47: while (true) {
                            if (var37 >= 3) {
                              var36++;
                              continue L41;
                            } else {
                              var38 = 0;
                              var39 = 0;
                              L48: while (true) {
                                if (var39 >= 3) {
                                  var35[var36 * 3 + var37] = var38 + 16384 >> 15;
                                  var37++;
                                  continue L47;
                                } else {
                                  var38 = var38 + param7[var36 * 3 + var39] * var31_ref_int__[var37 + var39 * 3];
                                  var39++;
                                  continue L48;
                                }
                              }
                            }
                          }
                        }
                      }
                    } else {
                      var33 = 0;
                      L49: while (true) {
                        if (var33 >= 3) {
                          var32++;
                          continue L40;
                        } else {
                          var34 = 0;
                          var35_int = 0;
                          L50: while (true) {
                            if (var35_int >= 3) {
                              var31_ref_int__[var32 * 3 + var33] = var34 + 16384 >> 15;
                              var33++;
                              continue L49;
                            } else {
                              var34 = var34 + var16_ref_int__[var32 * 3 + var35_int] * param7[var33 * 3 + var35_int];
                              var35_int++;
                              continue L50;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              return;
            }
          } else {
            L51: {
              if (param7 == null) {
                break L51;
              } else {
                var10 = param7[0] * param2 + param7[1] * param3 + param7[2] * param4 + 16384 >> 15;
                var11 = param7[3] * param2 + param7[4] * param3 + param7[5] * param4 + 16384 >> 15;
                var12_int = param7[6] * param2 + param7[7] * param3 + param7[8] * param4 + 16384 >> 15;
                param2 = var10;
                param3 = var11;
                param4 = var12_int;
                break L51;
              }
            }
            var10 = 0;
            L52: while (true) {
              if (var10 >= var9) {
                return;
              } else {
                L53: {
                  var11 = param1[var10];
                  if (var11 >= ((fc) this).field_b.length) {
                    break L53;
                  } else {
                    var12 = ((fc) this).field_b[var11];
                    var13 = 0;
                    L54: while (true) {
                      if (var13 >= var12.length) {
                        break L53;
                      } else {
                        L55: {
                          L56: {
                            var14 = var12[var13];
                            if (((fc) this).field_Y == null) {
                              break L56;
                            } else {
                              if ((param6 & ((fc) this).field_Y[var14]) != 0) {
                                break L56;
                              } else {
                                break L55;
                              }
                            }
                          }
                          ((fc) this).field_k[var14] = ((fc) this).field_k[var14] + param2;
                          ((fc) this).field_C[var14] = ((fc) this).field_C[var14] + param3;
                          ((fc) this).field_A[var14] = ((fc) this).field_A[var14] + param4;
                          break L55;
                        }
                        var13++;
                        continue L54;
                      }
                    }
                  }
                }
                var10++;
                continue L52;
              }
            }
          }
        } else {
          var10 = 0;
          field_kb = 0;
          field_ib = 0;
          field_x = 0;
          var11 = 0;
          L57: while (true) {
            if (var11 >= var9) {
              L58: {
                if (var10 <= 0) {
                  field_kb = param2;
                  field_ib = param3;
                  field_x = param4;
                  break L58;
                } else {
                  field_kb = field_kb / var10 + param2;
                  field_ib = field_ib / var10 + param3;
                  field_x = field_x / var10 + param4;
                  field_n = true;
                  break L58;
                }
              }
              return;
            } else {
              L59: {
                var12_int = param1[var11];
                if (var12_int >= ((fc) this).field_b.length) {
                  break L59;
                } else {
                  var13_ref_int__ = ((fc) this).field_b[var12_int];
                  var14 = 0;
                  L60: while (true) {
                    if (var14 >= var13_ref_int__.length) {
                      break L59;
                    } else {
                      L61: {
                        L62: {
                          var15 = var13_ref_int__[var14];
                          if (((fc) this).field_Y == null) {
                            break L62;
                          } else {
                            if ((param6 & ((fc) this).field_Y[var15]) != 0) {
                              break L62;
                            } else {
                              break L61;
                            }
                          }
                        }
                        field_kb = field_kb + ((fc) this).field_k[var15];
                        field_ib = field_ib + ((fc) this).field_C[var15];
                        field_x = field_x + ((fc) this).field_A[var15];
                        var10++;
                        break L61;
                      }
                      var14++;
                      continue L60;
                    }
                  }
                }
              }
              var11++;
              continue L57;
            }
          }
        }
    }

    private final void c() {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_8_0 = 0;
        short stackOut_5_0 = 0;
        int stackOut_7_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (var4 >= ((fc) this).field_w) {
                            statePc = 14;
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
                        if (((fc) this).field_F == null) {
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
                        stackOut_5_0 = ((fc) this).field_F[var4];
                        stackIn_8_0 = stackOut_5_0;
                        statePc = 8;
                        continue stateLoop;
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
                    stackOut_7_0 = -1;
                    stackIn_8_0 = stackOut_7_0;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    var3 = stackIn_8_0;
                    if (var3 != -1) {
                        statePc = 13;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    var1 = ((fc) this).field_d[var4] & 65535;
                    if (((fc) this).field_bb[var4] != -1) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    var2 = ((fc) this).field_i[var4] & -131072;
                    ((fc) this).field_i[var4] = var2 | fc.a(var1, var2 >> 17);
                    statePc = 13;
                    continue stateLoop;
                }
                case 11: {
                    if (((fc) this).field_bb[var4] == -2) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    var2 = ((fc) this).field_i[var4] & -131072;
                    ((fc) this).field_i[var4] = var2 | fc.a(var1, var2 >> 17);
                    var2 = ((fc) this).field_X[var4] & -131072;
                    ((fc) this).field_X[var4] = var2 | fc.a(var1, var2 >> 17);
                    var2 = ((fc) this).field_bb[var4] & -131072;
                    ((fc) this).field_bb[var4] = var2 | fc.a(var1, var2 >> 17);
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    var4++;
                    statePc = 1;
                    continue stateLoop;
                }
                case 14: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(int param0) {
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
          var2 = oo.field_l;
          var3 = oo.field_e;
          var4 = 0;
          var5 = ((fc) this).field_o[param0];
          var6 = ((fc) this).field_a[param0];
          var7 = ((fc) this).field_u[param0];
          var8 = field_q[var5];
          var9 = field_q[var6];
          var10 = field_q[var7];
          if (((fc) this).field_R != null) {
            oo.field_n = ((fc) this).field_R[param0] & 255;
            break L0;
          } else {
            oo.field_n = 0;
            break L0;
          }
        }
        L1: {
          if (var8 < 50) {
            L2: {
              var11 = field_S[var5];
              var12 = field_fb[var5];
              var13 = ((fc) this).field_i[param0] & 65535;
              if (var10 < 50) {
                break L2;
              } else {
                var14 = (50 - var8) * oo.field_k[var10 - var8];
                field_O[var4] = var2 + (var11 + ((field_S[var7] - var11) * var14 >> 16) << 9) / 50;
                field_l[var4] = var3 + (var12 + ((field_fb[var7] - var12) * var14 >> 16) << 9) / 50;
                var4++;
                field_J[var4] = var13 + (((((fc) this).field_bb[param0] & 65535) - var13) * var14 >> 16);
                break L2;
              }
            }
            if (var9 < 50) {
              break L1;
            } else {
              var14 = (50 - var8) * oo.field_k[var9 - var8];
              field_O[var4] = var2 + (var11 + ((field_S[var6] - var11) * var14 >> 16) << 9) / 50;
              field_l[var4] = var3 + (var12 + ((field_fb[var6] - var12) * var14 >> 16) << 9) / 50;
              var4++;
              field_J[var4] = var13 + (((((fc) this).field_X[param0] & 65535) - var13) * var14 >> 16);
              break L1;
            }
          } else {
            field_O[var4] = field_v[var5];
            field_l[var4] = field_cb[var5];
            var4++;
            field_J[var4] = ((fc) this).field_i[param0] & 65535;
            break L1;
          }
        }
        L3: {
          if (var9 < 50) {
            L4: {
              var11 = field_S[var6];
              var12 = field_fb[var6];
              var13 = ((fc) this).field_X[param0] & 65535;
              if (var8 < 50) {
                break L4;
              } else {
                var14 = (50 - var9) * oo.field_k[var8 - var9];
                field_O[var4] = var2 + (var11 + ((field_S[var5] - var11) * var14 >> 16) << 9) / 50;
                field_l[var4] = var3 + (var12 + ((field_fb[var5] - var12) * var14 >> 16) << 9) / 50;
                var4++;
                field_J[var4] = var13 + (((((fc) this).field_i[param0] & 65535) - var13) * var14 >> 16);
                break L4;
              }
            }
            if (var10 < 50) {
              break L3;
            } else {
              var14 = (50 - var9) * oo.field_k[var10 - var9];
              field_O[var4] = var2 + (var11 + ((field_S[var7] - var11) * var14 >> 16) << 9) / 50;
              field_l[var4] = var3 + (var12 + ((field_fb[var7] - var12) * var14 >> 16) << 9) / 50;
              var4++;
              field_J[var4] = var13 + (((((fc) this).field_bb[param0] & 65535) - var13) * var14 >> 16);
              break L3;
            }
          } else {
            field_O[var4] = field_v[var6];
            field_l[var4] = field_cb[var6];
            var4++;
            field_J[var4] = ((fc) this).field_X[param0] & 65535;
            break L3;
          }
        }
        L5: {
          if (var10 < 50) {
            L6: {
              var11 = field_S[var7];
              var12 = field_fb[var7];
              var13 = ((fc) this).field_bb[param0] & 65535;
              if (var9 < 50) {
                break L6;
              } else {
                var14 = (50 - var10) * oo.field_k[var9 - var10];
                field_O[var4] = var2 + (var11 + ((field_S[var6] - var11) * var14 >> 16) << 9) / 50;
                field_l[var4] = var3 + (var12 + ((field_fb[var6] - var12) * var14 >> 16) << 9) / 50;
                var4++;
                field_J[var4] = var13 + (((((fc) this).field_X[param0] & 65535) - var13) * var14 >> 16);
                break L6;
              }
            }
            if (var8 < 50) {
              break L5;
            } else {
              var14 = (50 - var10) * oo.field_k[var8 - var10];
              field_O[var4] = var2 + (var11 + ((field_S[var5] - var11) * var14 >> 16) << 9) / 50;
              field_l[var4] = var3 + (var12 + ((field_fb[var5] - var12) * var14 >> 16) << 9) / 50;
              var4++;
              field_J[var4] = var13 + (((((fc) this).field_i[param0] & 65535) - var13) * var14 >> 16);
              break L5;
            }
          } else {
            field_O[var4] = field_v[var7];
            field_l[var4] = field_cb[var7];
            var4++;
            field_J[var4] = ((fc) this).field_bb[param0] & 65535;
            break L5;
          }
        }
        L7: {
          var11 = field_O[0];
          var12 = field_O[1];
          var13 = field_O[2];
          var14 = field_l[0];
          var15 = field_l[1];
          var16 = field_l[2];
          oo.field_m = false;
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
                      if (var11 > oo.field_q) {
                        break L9;
                      } else {
                        if (var12 > oo.field_q) {
                          break L9;
                        } else {
                          if (var13 <= oo.field_q) {
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
              oo.field_m = true;
              break L8;
            }
            L10: {
              if (((fc) this).field_F == null) {
                break L10;
              } else {
                if (((fc) this).field_F[param0] != -1) {
                  L11: {
                    L12: {
                      if (((fc) this).field_eb == null) {
                        break L12;
                      } else {
                        if (((fc) this).field_eb[param0] == -1) {
                          break L12;
                        } else {
                          var20 = ((fc) this).field_eb[param0] & 255;
                          var17 = ((fc) this).field_N[var20];
                          var18 = ((fc) this).field_D[var20];
                          var19 = ((fc) this).field_E[var20];
                          break L11;
                        }
                      }
                    }
                    var17 = var5;
                    var18 = var6;
                    var19 = var7;
                    break L11;
                  }
                  if (((fc) this).field_bb[param0] != -1) {
                    oo.a(var14, var15, var16, var11, var12, var13, field_J[0], field_J[1], field_J[2], field_S[var17], field_S[var18], field_S[var19], field_fb[var17], field_fb[var18], field_fb[var19], field_q[var17], field_q[var18], field_q[var19], (int) ((fc) this).field_F[param0]);
                    break L7;
                  } else {
                    oo.a(var14, var15, var16, var11, var12, var13, ((fc) this).field_i[param0], ((fc) this).field_i[param0], ((fc) this).field_i[param0], field_S[var17], field_S[var18], field_S[var19], field_fb[var17], field_fb[var18], field_fb[var19], field_q[var17], field_q[var18], field_q[var19], (int) ((fc) this).field_F[param0]);
                    break L7;
                  }
                } else {
                  break L10;
                }
              }
            }
            if (((fc) this).field_bb[param0] != -1) {
              oo.a(var14, var15, var16, var11, var12, var13, field_J[0], field_J[1], field_J[2]);
              break L7;
            } else {
              oo.a(var14, var15, var16, var11, var12, var13, oo.field_c[((fc) this).field_i[param0] & 65535]);
              break L7;
            }
          }
        }
        L13: {
          if (var4 != 4) {
            break L13;
          } else {
            L14: {
              L15: {
                if (var11 < 0) {
                  break L15;
                } else {
                  if (var12 < 0) {
                    break L15;
                  } else {
                    if (var13 < 0) {
                      break L15;
                    } else {
                      if (var11 > oo.field_q) {
                        break L15;
                      } else {
                        if (var12 > oo.field_q) {
                          break L15;
                        } else {
                          if (var13 > oo.field_q) {
                            break L15;
                          } else {
                            if (field_O[3] < 0) {
                              break L15;
                            } else {
                              if (field_O[3] <= oo.field_q) {
                                break L14;
                              } else {
                                break L15;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              oo.field_m = true;
              break L14;
            }
            L16: {
              if (((fc) this).field_F == null) {
                break L16;
              } else {
                if (((fc) this).field_F[param0] != -1) {
                  L17: {
                    L18: {
                      if (((fc) this).field_eb == null) {
                        break L18;
                      } else {
                        if (((fc) this).field_eb[param0] == -1) {
                          break L18;
                        } else {
                          var20 = ((fc) this).field_eb[param0] & 255;
                          var17 = ((fc) this).field_N[var20];
                          var18 = ((fc) this).field_D[var20];
                          var19 = ((fc) this).field_E[var20];
                          break L17;
                        }
                      }
                    }
                    var17 = var5;
                    var18 = var6;
                    var19 = var7;
                    break L17;
                  }
                  var20 = ((fc) this).field_F[param0];
                  if (((fc) this).field_bb[param0] != -1) {
                    oo.a(var14, var15, var16, var11, var12, var13, field_J[0], field_J[1], field_J[2], field_S[var17], field_S[var18], field_S[var19], field_fb[var17], field_fb[var18], field_fb[var19], field_q[var17], field_q[var18], field_q[var19], var20);
                    oo.a(var14, var16, field_l[3], var11, var13, field_O[3], field_J[0], field_J[2], field_J[3], field_S[var17], field_S[var18], field_S[var19], field_fb[var17], field_fb[var18], field_fb[var19], field_q[var17], field_q[var18], field_q[var19], var20);
                    break L13;
                  } else {
                    oo.a(var14, var15, var16, var11, var12, var13, ((fc) this).field_i[param0], ((fc) this).field_i[param0], ((fc) this).field_i[param0], field_S[var17], field_S[var18], field_S[var19], field_fb[var17], field_fb[var18], field_fb[var19], field_q[var17], field_q[var18], field_q[var19], var20);
                    oo.a(var14, var16, field_l[3], var11, var13, field_O[3], ((fc) this).field_i[param0], ((fc) this).field_i[param0], ((fc) this).field_i[param0], field_S[var17], field_S[var18], field_S[var19], field_fb[var17], field_fb[var18], field_fb[var19], field_q[var17], field_q[var18], field_q[var19], var20);
                    break L13;
                  }
                } else {
                  break L16;
                }
              }
            }
            if (((fc) this).field_bb[param0] != -1) {
              oo.a(var14, var15, var16, var11, var12, var13, field_J[0], field_J[1], field_J[2]);
              oo.a(var14, var16, field_l[3], var11, var13, field_O[3], field_J[0], field_J[2], field_J[3]);
              break L13;
            } else {
              var17 = oo.field_c[((fc) this).field_i[param0] & 65535];
              oo.a(var14, var15, var16, var11, var12, var13, var17);
              oo.a(var14, var16, field_l[3], var11, var13, field_O[3], var17);
              break L13;
            }
          }
        }
    }

    private final bn a(boolean param0, boolean param1, fc param2, byte[] param3, short[] param4, int[] param5, int[] param6, int[] param7) {
        int var9 = 0;
        fc stackIn_2_0 = null;
        fc stackOut_1_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        param2.field_T = ((fc) this).field_T;
                        param2.field_W = ((fc) this).field_W;
                        param2.field_w = ((fc) this).field_w;
                        param2.field_L = ((fc) this).field_L;
                        if (param2.field_k == null) {
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
                        stackOut_1_0 = (fc) param2;
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
                        if (stackIn_2_0.field_k.length >= ((fc) this).field_T) {
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
                        param2.field_k = new int[((fc) this).field_T + 100];
                        param2.field_C = new int[((fc) this).field_T + 100];
                        param2.field_A = new int[((fc) this).field_T + 100];
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
                    var9 = 0;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    try {
                        if (var9 >= ((fc) this).field_T) {
                            statePc = 12;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        param2.field_k[var9] = ((fc) this).field_k[var9];
                        param2.field_C[var9] = ((fc) this).field_C[var9];
                        param2.field_A[var9] = ((fc) this).field_A[var9];
                        var9++;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 11: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 12: {
                    try {
                        if (!param0) {
                            statePc = 15;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        param2.field_R = ((fc) this).field_R;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 14: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 15: {
                    param2.field_R = param3;
                    if (((fc) this).field_R != null) {
                        statePc = 21;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    var9 = 0;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    try {
                        if (var9 >= ((fc) this).field_w) {
                            statePc = 25;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        param2.field_R[var9] = (byte) 0;
                        var9++;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 19: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 21: {
                    var9 = 0;
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    try {
                        if (var9 >= ((fc) this).field_w) {
                            statePc = 25;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        param2.field_R[var9] = ((fc) this).field_R[var9];
                        var9++;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 24: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 25: {
                    try {
                        if (!param1) {
                            statePc = 28;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        param2.field_d = ((fc) this).field_d;
                        param2.field_i = ((fc) this).field_i;
                        param2.field_X = ((fc) this).field_X;
                        param2.field_bb = ((fc) this).field_bb;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 27: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 28: {
                    param2.field_d = param4;
                    param2.field_i = param5;
                    param2.field_X = param6;
                    param2.field_bb = param7;
                    var9 = 0;
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    try {
                        if (var9 >= ((fc) this).field_w) {
                            statePc = 32;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        param2.field_d[var9] = ((fc) this).field_d[var9];
                        param2.field_i[var9] = ((fc) this).field_i[var9];
                        param2.field_X[var9] = ((fc) this).field_X[var9];
                        param2.field_bb[var9] = ((fc) this).field_bb[var9];
                        var9++;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 31: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 32: {
                    param2.field_o = ((fc) this).field_o;
                    param2.field_a = ((fc) this).field_a;
                    param2.field_u = ((fc) this).field_u;
                    param2.field_H = ((fc) this).field_H;
                    param2.field_eb = ((fc) this).field_eb;
                    param2.field_F = ((fc) this).field_F;
                    param2.field_M = ((fc) this).field_M;
                    param2.field_N = ((fc) this).field_N;
                    param2.field_D = ((fc) this).field_D;
                    param2.field_E = ((fc) this).field_E;
                    param2.field_b = ((fc) this).field_b;
                    param2.field_g = ((fc) this).field_g;
                    param2.field_Y = ((fc) this).field_Y;
                    param2.field_t = ((fc) this).field_t;
                    param2.field_K = false;
                    return (bn) (Object) param2;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final bn a(boolean param0, boolean param1, boolean param2) {
        byte[] stackIn_2_0 = null;
        short[] stackIn_10_0 = null;
        byte[] stackOut_1_0 = null;
        short[] stackOut_9_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param0) {
                            statePc = 8;
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
                        stackOut_1_0 = (byte[]) field_h;
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
                        if (stackIn_2_0.length >= ((fc) this).field_w) {
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
                        field_h = new byte[((fc) this).field_w + 100];
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
                    try {
                        if (param1) {
                            statePc = 16;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackOut_9_0 = (short[]) field_m;
                        stackIn_10_0 = stackOut_9_0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (stackIn_10_0.length >= ((fc) this).field_w) {
                            statePc = 16;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        field_hb = new int[((fc) this).field_w + 100];
                        field_f = new int[((fc) this).field_w + 100];
                        field_s = new int[((fc) this).field_w + 100];
                        field_m = new short[((fc) this).field_w + 100];
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 15: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 16: {
                    return this.a(param0, param1, field_ab, field_h, field_m, field_hb, field_f, field_s);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
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
        int stackIn_25_0 = 0;
        Object stackIn_28_0 = null;
        int stackIn_34_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_24_0 = 0;
        Object stackOut_27_0 = null;
        int stackOut_31_0 = 0;
        int stackOut_33_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (((fc) this).field_K) {
                            statePc = 4;
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
                        this.e();
                        statePc = 4;
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
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        if (var5 >= 50 - ((fc) this).field_db) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        return;
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
                    var15 = ((fc) this).field_db * 92682 >> 16;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    try {
                        if (var3 >= -var5 - var15) {
                            statePc = 12;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        return;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 11: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 12: {
                    try {
                        if (var3 <= var5 + var15) {
                            statePc = 15;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        return;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 14: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 15: {
                    try {
                        if (var4 >= -var5 - var15) {
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
                        return;
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
                    try {
                        if (var4 <= var5 + var15) {
                            statePc = 21;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        return;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 20: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 21: {
                    try {
                        if (var5 > 50 + ((fc) this).field_db) {
                            statePc = 24;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        stackOut_22_0 = 1;
                        stackIn_25_0 = stackOut_22_0;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 23: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 24: {
                    stackOut_24_0 = 0;
                    stackIn_25_0 = stackOut_24_0;
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    var16 = stackIn_25_0;
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    try {
                        if (var16 != 0) {
                            statePc = 31;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        stackOut_27_0 = this;
                        stackIn_28_0 = stackOut_27_0;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (((fc) this).field_L <= 0) {
                            statePc = 33;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        stackOut_31_0 = 1;
                        stackIn_34_0 = stackOut_31_0;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 32: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 33: {
                    stackOut_33_0 = 0;
                    stackIn_34_0 = stackOut_33_0;
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    var17 = stackIn_34_0;
                    var18 = oo.field_l;
                    var19 = oo.field_e;
                    var20 = 0;
                    var21_int = 0;
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    if (var21_int >= ((fc) this).field_T) {
                        statePc = 46;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    var22 = ((fc) this).field_k[var21_int];
                    var23 = ((fc) this).field_C[var21_int];
                    var24 = ((fc) this).field_A[var21_int];
                    var25 = var22 * var6 + var23 * var9 + var24 * var12 >> 16;
                    var26 = var22 * var7 + var23 * var10 + var24 * var13 >> 16;
                    var24 = var22 * var8 + var23 * var11 + var24 * var14 >> 16;
                    var22 = var25;
                    var23 = var26;
                    field_gb[var21_int] = var24;
                    var22 = var22 + var3;
                    var23 = var23 + var4;
                    var24 = var24 + var5;
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    try {
                        if (var24 < 50) {
                            statePc = 40;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        field_v[var21_int] = var18 + (var22 << 9) / var24;
                        field_cb[var21_int] = var19 + (var23 << 9) / var24;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 39: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 40: {
                    field_v[var21_int] = -5000;
                    var20 = 1;
                    statePc = 41;
                    continue stateLoop;
                }
                case 41: {
                    try {
                        if (var17 == 0) {
                            statePc = 45;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        field_S[var21_int] = var22;
                        field_fb[var21_int] = var23;
                        field_q[var21_int] = var24;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 44: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 45: {
                    var21_int++;
                    statePc = 35;
                    continue stateLoop;
                }
                case 46: {
                    try {
                        this.a((var20 & var16) != 0, false, 0L, (int) ((fc) this).field_db, ((fc) this).field_db << 1);
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 48: {
                    var21 = (Exception) (Object) caughtException;
                    statePc = 49;
                    continue stateLoop;
                }
                case 49: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object stackIn_10_0 = null;
        Object stackOut_9_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (!field_p[param0]) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 2;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        this.a(param0);
                        return;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 2;
                        continue stateLoop;
                    }
                }
                case 2: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 3: {
                    var2 = ((fc) this).field_o[param0];
                    var3 = ((fc) this).field_a[param0];
                    var4 = ((fc) this).field_u[param0];
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    try {
                        oo.field_m = field_Z[param0];
                        if (((fc) this).field_R != null) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        oo.field_n = 0;
                        statePc = 8;
                        continue stateLoop;
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
                    oo.field_n = ((fc) this).field_R[param0] & 255;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    try {
                        if (((fc) this).field_F == null) {
                            statePc = 13;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackOut_9_0 = this;
                        stackIn_10_0 = stackOut_9_0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (((fc) this).field_F[param0] != -1) {
                            statePc = 19;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (((fc) this).field_bb[param0] != -1) {
                            statePc = 18;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        oo.a(field_cb[var2], field_cb[var3], field_cb[var4], field_v[var2], field_v[var3], field_v[var4], oo.field_c[((fc) this).field_i[param0] & 65535]);
                        statePc = 29;
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
                    oo.a(field_cb[var2], field_cb[var3], field_cb[var4], field_v[var2], field_v[var3], field_v[var4], ((fc) this).field_i[param0] & 65535, ((fc) this).field_X[param0] & 65535, ((fc) this).field_bb[param0] & 65535);
                    statePc = 29;
                    continue stateLoop;
                }
                case 19: {
                    try {
                        if (((fc) this).field_eb == null) {
                            statePc = 24;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (((fc) this).field_eb[param0] == -1) {
                            statePc = 24;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 22: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 23: {
                    var8 = ((fc) this).field_eb[param0] & 255;
                    var5 = ((fc) this).field_N[var8];
                    var6 = ((fc) this).field_D[var8];
                    var7 = ((fc) this).field_E[var8];
                    statePc = 25;
                    continue stateLoop;
                }
                case 24: {
                    var5 = var2;
                    var6 = var3;
                    var7 = var4;
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    try {
                        if (((fc) this).field_bb[param0] != -1) {
                            statePc = 28;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        oo.a(field_cb[var2], field_cb[var3], field_cb[var4], field_v[var2], field_v[var3], field_v[var4], ((fc) this).field_i[param0], ((fc) this).field_i[param0], ((fc) this).field_i[param0], field_S[var5], field_S[var6], field_S[var7], field_fb[var5], field_fb[var6], field_fb[var7], field_q[var5], field_q[var6], field_q[var7], (int) ((fc) this).field_F[param0]);
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 27: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 28: {
                    oo.a(field_cb[var2], field_cb[var3], field_cb[var4], field_v[var2], field_v[var3], field_v[var4], ((fc) this).field_i[param0], ((fc) this).field_X[param0], ((fc) this).field_bb[param0], field_S[var5], field_S[var6], field_S[var7], field_fb[var5], field_fb[var6], field_fb[var7], field_q[var5], field_q[var6], field_q[var7], (int) ((fc) this).field_F[param0]);
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void d() {
        field_ab = null;
        field_h = null;
        field_m = null;
        field_hb = null;
        field_f = null;
        field_s = null;
        field_Z = null;
        field_p = null;
        field_v = null;
        field_cb = null;
        field_gb = null;
        field_S = null;
        field_fb = null;
        field_q = null;
        field_j = null;
        field_U = null;
        field_P = null;
        field_y = null;
        field_jb = null;
        field_c = null;
        field_Q = null;
        field_G = null;
        field_r = null;
        field_z = null;
        field_V = null;
        field_O = null;
        field_l = null;
        field_J = null;
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
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        Object stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        Object stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        int stackIn_22_2 = 0;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int stackOut_19_2 = 0;
        Object stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        int stackOut_21_2 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (((fc) this).field_K) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        this.e();
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var10_int = oo.field_l;
                        var11 = oo.field_e;
                        var12 = oo.field_j[param0];
                        var13 = oo.field_h[param0];
                        var14 = oo.field_j[param1];
                        var15 = oo.field_h[param1];
                        var16 = oo.field_j[param2];
                        var17 = oo.field_h[param2];
                        var18 = oo.field_j[param3];
                        var19 = oo.field_h[param3];
                        var20 = param5 * var18 + param6 * var19 >> 16;
                        var21 = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var21 >= ((fc) this).field_T) {
                            statePc = 18;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var22 = ((fc) this).field_k[var21];
                        var23 = ((fc) this).field_C[var21];
                        var24 = ((fc) this).field_A[var21];
                        if (param2 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var25 = var23 * var16 + var22 * var17 >> 16;
                        var23 = var23 * var17 - var22 * var16 >> 16;
                        var22 = var25;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (param0 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var25 = var23 * var13 - var24 * var12 >> 16;
                        var24 = var23 * var12 + var24 * var13 >> 16;
                        var23 = var25;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (param1 == 0) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var25 = var24 * var14 + var22 * var15 >> 16;
                        var24 = var24 * var15 - var22 * var14 >> 16;
                        var22 = var25;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var22 = var22 + param4;
                        var23 = var23 + param5;
                        var24 = var24 + param6;
                        var25 = var23 * var19 - var24 * var18 >> 16;
                        var24 = var23 * var18 + var24 * var19 >> 16;
                        var23 = var25;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        field_gb[var21] = var24 - var20;
                        field_v[var21] = var10_int + (var22 << 9) / var24;
                        field_cb[var21] = var11 + (var23 << 9) / var24;
                        if (((fc) this).field_L <= 0) {
                            statePc = 17;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        field_S[var21] = var22;
                        field_fb[var21] = var23;
                        field_q[var21] = var24;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var21++;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackOut_18_0 = this;
                        stackOut_18_1 = 0;
                        stackIn_21_0 = stackOut_18_0;
                        stackIn_21_1 = stackOut_18_1;
                        stackIn_19_0 = stackOut_18_0;
                        stackIn_19_1 = stackOut_18_1;
                        if (param7 < 0L) {
                            statePc = 21;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        stackOut_19_0 = this;
                        stackOut_19_1 = stackIn_19_1;
                        stackOut_19_2 = 1;
                        stackIn_22_0 = stackOut_19_0;
                        stackIn_22_1 = stackOut_19_1;
                        stackIn_22_2 = stackOut_19_2;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackOut_21_0 = this;
                        stackOut_21_1 = stackIn_21_1;
                        stackOut_21_2 = 0;
                        stackIn_22_0 = stackOut_21_0;
                        stackIn_22_1 = stackOut_21_1;
                        stackIn_22_2 = stackOut_21_2;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        this.a(stackIn_22_1 != 0, stackIn_22_2 != 0, param7, (int) ((fc) this).field_db, ((fc) this).field_db << 1);
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 24: {
                    var10 = (RuntimeException) (Object) caughtException;
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(boolean param0, boolean param1, long param2, int param3, int param4) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var11_ref_int__ = null;
        int var12 = 0;
        int var13 = 0;
        int var14_int = 0;
        int[] var14 = null;
        int var15_int = 0;
        int[] var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18_int = 0;
        int[] var18 = null;
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
        int stackIn_92_0 = 0;
        int stackOut_91_0 = 0;
        int stackOut_90_0 = 0;
        if (param4 < 1600) {
          L0: {
            var7 = 0;
            if (field_B) {
              break L0;
            } else {
              var8 = 0;
              L1: while (true) {
                if (var8 >= 1600) {
                  var8 = 0;
                  L2: while (true) {
                    if (var8 >= 32) {
                      field_e = 0;
                      break L0;
                    } else {
                      field_P[var8] = 0;
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
            if (var8 >= ((fc) this).field_w) {
              L4: {
                if (!field_B) {
                  if (((fc) this).field_H != null) {
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
                                var11_ref_int__ = field_U[var8];
                                var12 = 0;
                                L9: while (true) {
                                  if (var12 >= var10) {
                                    break L7;
                                  } else {
                                    L10: {
                                      var13 = var11_ref_int__[var12];
                                      var14_int = ((fc) this).field_H[var13];
                                      field_Q[var14_int] = field_Q[var14_int] + 1;
                                      var15_int = field_Q[var14_int];
                                      field_G[var14_int][var15_int] = var13;
                                      if (var14_int >= 10) {
                                        if (var14_int != 10) {
                                          field_z[var15_int] = var8;
                                          break L10;
                                        } else {
                                          field_r[var15_int] = var8;
                                          break L10;
                                        }
                                      } else {
                                        field_V[var14_int] = field_V[var14_int] + var8;
                                        break L10;
                                      }
                                    }
                                    var12++;
                                    continue L9;
                                  }
                                }
                              }
                            }
                            L11: {
                              if (var9 <= 64) {
                                break L11;
                              } else {
                                var10 = field_j[var8] - 64 - 1;
                                var11_ref_int__ = field_y[var10];
                                var12 = 0;
                                L12: while (true) {
                                  if (var12 >= field_P[var10]) {
                                    break L11;
                                  } else {
                                    L13: {
                                      var13 = var11_ref_int__[var12];
                                      var14_int = ((fc) this).field_H[var13];
                                      field_Q[var14_int] = field_Q[var14_int] + 1;
                                      var15_int = field_Q[var14_int];
                                      field_G[var14_int][var15_int] = var13;
                                      if (var14_int >= 10) {
                                        if (var14_int != 10) {
                                          field_z[var15_int] = var8;
                                          break L13;
                                        } else {
                                          field_r[var15_int] = var8;
                                          break L13;
                                        }
                                      } else {
                                        field_V[var14_int] = field_V[var14_int] + var8;
                                        break L13;
                                      }
                                    }
                                    var12++;
                                    continue L12;
                                  }
                                }
                              }
                            }
                            var8--;
                            continue L6;
                          }
                        }
                      } else {
                        field_Q[var8] = 0;
                        field_V[var8] = 0;
                        var8++;
                        continue L5;
                      }
                    }
                  } else {
                    var8 = param4 - 1;
                    L14: while (true) {
                      if (var8 < 0) {
                        return;
                      } else {
                        L15: {
                          var9 = field_j[var8];
                          if (var9 <= 0) {
                            break L15;
                          } else {
                            L16: {
                              if (var9 <= 64) {
                                stackOut_91_0 = var9;
                                stackIn_92_0 = stackOut_91_0;
                                break L16;
                              } else {
                                stackOut_90_0 = 64;
                                stackIn_92_0 = stackOut_90_0;
                                break L16;
                              }
                            }
                            var10 = stackIn_92_0;
                            var11_ref_int__ = field_U[var8];
                            var12 = 0;
                            L17: while (true) {
                              if (var12 >= var10) {
                                break L15;
                              } else {
                                this.c(var11_ref_int__[var12]);
                                var12++;
                                continue L17;
                              }
                            }
                          }
                        }
                        L18: {
                          if (var9 <= 64) {
                            break L18;
                          } else {
                            var10 = field_j[var8] - 64 - 1;
                            var11_ref_int__ = field_y[var10];
                            var12 = 0;
                            L19: while (true) {
                              if (var12 >= field_P[var10]) {
                                break L18;
                              } else {
                                this.c(var11_ref_int__[var12]);
                                var12++;
                                continue L19;
                              }
                            }
                          }
                        }
                        var8--;
                        continue L14;
                      }
                    }
                  }
                } else {
                  sf.a(field_jb, (byte) 17, var7 - 1, 0, field_c);
                  if (((fc) this).field_H != null) {
                    var8 = 0;
                    L20: while (true) {
                      if (var8 >= 12) {
                        var8 = 0;
                        L21: while (true) {
                          if (var8 >= var7) {
                            break L4;
                          } else {
                            L22: {
                              var9 = field_c[var8];
                              var10 = field_jb[var8];
                              var11 = ((fc) this).field_H[var9];
                              field_Q[var11] = field_Q[var11] + 1;
                              var12 = field_Q[var11];
                              field_G[var11][var12] = var9;
                              if (var11 >= 10) {
                                if (var11 != 10) {
                                  field_z[var12] = var10;
                                  break L22;
                                } else {
                                  field_r[var12] = var10;
                                  break L22;
                                }
                              } else {
                                field_V[var11] = field_V[var11] + var10;
                                break L22;
                              }
                            }
                            var8++;
                            continue L21;
                          }
                        }
                      } else {
                        field_Q[var8] = 0;
                        field_V[var8] = 0;
                        var8++;
                        continue L20;
                      }
                    }
                  } else {
                    var8 = 0;
                    L23: while (true) {
                      if (var8 >= var7) {
                        return;
                      } else {
                        this.c(field_c[var8]);
                        var8++;
                        continue L23;
                      }
                    }
                  }
                }
              }
              L24: {
                L25: {
                  var8 = 0;
                  if (field_Q[1] > 0) {
                    break L25;
                  } else {
                    if (field_Q[2] <= 0) {
                      break L24;
                    } else {
                      break L25;
                    }
                  }
                }
                var8 = (field_V[1] + field_V[2]) / (field_Q[1] + field_Q[2]);
                break L24;
              }
              L26: {
                L27: {
                  var9 = 0;
                  if (field_Q[3] > 0) {
                    break L27;
                  } else {
                    if (field_Q[4] <= 0) {
                      break L26;
                    } else {
                      break L27;
                    }
                  }
                }
                var9 = (field_V[3] + field_V[4]) / (field_Q[3] + field_Q[4]);
                break L26;
              }
              L28: {
                L29: {
                  var10 = 0;
                  if (field_Q[6] > 0) {
                    break L29;
                  } else {
                    if (field_Q[8] <= 0) {
                      break L28;
                    } else {
                      break L29;
                    }
                  }
                }
                var10 = (field_V[6] + field_V[8]) / (field_Q[6] + field_Q[8]);
                break L28;
              }
              L30: {
                var12 = 0;
                var13 = field_Q[10];
                var14 = field_G[10];
                var15 = field_r;
                if (var12 != var13) {
                  break L30;
                } else {
                  var12 = 0;
                  var13 = field_Q[11];
                  var14 = field_G[11];
                  var15 = field_z;
                  break L30;
                }
              }
              L31: {
                if (var12 >= var13) {
                  var11 = -1000;
                  break L31;
                } else {
                  var11 = var15[var12];
                  break L31;
                }
              }
              var16 = 0;
              L32: while (true) {
                if (var16 >= 10) {
                  L33: while (true) {
                    if (var11 == -1000) {
                      return;
                    } else {
                      L34: {
                        var12++;
                        this.c(var14[var12]);
                        if (var12 != var13) {
                          break L34;
                        } else {
                          if (var14 == field_G[11]) {
                            break L34;
                          } else {
                            var12 = 0;
                            var14 = field_G[11];
                            var13 = field_Q[11];
                            var15 = field_z;
                            break L34;
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
                } else {
                  L35: while (true) {
                    L36: {
                      if (var16 != 0) {
                        break L36;
                      } else {
                        if (var11 <= var8) {
                          break L36;
                        } else {
                          L37: {
                            var12++;
                            this.c(var14[var12]);
                            if (var12 != var13) {
                              break L37;
                            } else {
                              if (var14 == field_G[11]) {
                                break L37;
                              } else {
                                var12 = 0;
                                var13 = field_Q[11];
                                var14 = field_G[11];
                                var15 = field_z;
                                break L37;
                              }
                            }
                          }
                          if (var12 >= var13) {
                            var11 = -1000;
                            continue L35;
                          } else {
                            var11 = var15[var12];
                            continue L35;
                          }
                        }
                      }
                    }
                    L38: while (true) {
                      L39: {
                        if (var16 != 3) {
                          break L39;
                        } else {
                          if (var11 <= var9) {
                            break L39;
                          } else {
                            L40: {
                              var12++;
                              this.c(var14[var12]);
                              if (var12 != var13) {
                                break L40;
                              } else {
                                if (var14 == field_G[11]) {
                                  break L40;
                                } else {
                                  var12 = 0;
                                  var13 = field_Q[11];
                                  var14 = field_G[11];
                                  var15 = field_z;
                                  break L40;
                                }
                              }
                            }
                            if (var12 >= var13) {
                              var11 = -1000;
                              continue L38;
                            } else {
                              var11 = var15[var12];
                              continue L38;
                            }
                          }
                        }
                      }
                      L41: while (true) {
                        L42: {
                          if (var16 != 5) {
                            break L42;
                          } else {
                            if (var11 <= var10) {
                              break L42;
                            } else {
                              L43: {
                                var12++;
                                this.c(var14[var12]);
                                if (var12 != var13) {
                                  break L43;
                                } else {
                                  if (var14 == field_G[11]) {
                                    break L43;
                                  } else {
                                    var12 = 0;
                                    var13 = field_Q[11];
                                    var14 = field_G[11];
                                    var15 = field_z;
                                    break L43;
                                  }
                                }
                              }
                              if (var12 >= var13) {
                                var11 = -1000;
                                continue L41;
                              } else {
                                var11 = var15[var12];
                                continue L41;
                              }
                            }
                          }
                        }
                        var17 = field_Q[var16];
                        var18 = field_G[var16];
                        var19 = 0;
                        L44: while (true) {
                          if (var19 >= var17) {
                            var16++;
                            continue L32;
                          } else {
                            this.c(var18[var19]);
                            var19++;
                            continue L44;
                          }
                        }
                      }
                    }
                  }
                }
              }
            } else {
              L45: {
                if (((fc) this).field_bb[var8] != -2) {
                  L46: {
                    var9 = ((fc) this).field_o[var8];
                    var10 = ((fc) this).field_a[var8];
                    var11 = ((fc) this).field_u[var8];
                    var12 = field_v[var9];
                    var13 = field_v[var10];
                    var14_int = field_v[var11];
                    if (!param0) {
                      break L46;
                    } else {
                      L47: {
                        if (var12 == -5000) {
                          break L47;
                        } else {
                          if (var13 == -5000) {
                            break L47;
                          } else {
                            if (var14_int != -5000) {
                              break L46;
                            } else {
                              break L47;
                            }
                          }
                        }
                      }
                      L48: {
                        var15_int = field_S[var9];
                        var16 = field_S[var10];
                        var17 = field_S[var11];
                        var18_int = field_fb[var9];
                        var19 = field_fb[var10];
                        var20 = field_fb[var11];
                        var21 = field_q[var9];
                        var22 = field_q[var10];
                        var23 = field_q[var11];
                        var15_int = var15_int - var16;
                        var17 = var17 - var16;
                        var18_int = var18_int - var19;
                        var20 = var20 - var19;
                        var21 = var21 - var22;
                        var23 = var23 - var22;
                        var24 = var18_int * var23 - var21 * var20;
                        var25 = var21 * var17 - var15_int * var23;
                        var26 = var15_int * var20 - var18_int * var17;
                        if (var16 * var24 + var19 * var25 + var22 * var26 <= 0) {
                          break L48;
                        } else {
                          field_p[var8] = true;
                          if (!field_B) {
                            var27 = (field_gb[var9] + field_gb[var10] + field_gb[var11]) / 3 + param3;
                            if (field_j[var27] >= 64) {
                              L49: {
                                var28 = field_j[var27];
                                if (var28 != 64) {
                                  break L49;
                                } else {
                                  if (field_e != 512) {
                                    field_e = field_e + 1;
                                    var28 = 65 + field_e;
                                    field_j[var27] = 65 + field_e;
                                    break L49;
                                  } else {
                                    break L45;
                                  }
                                }
                              }
                              var28 -= 65;
                              field_P[var28] = field_P[var28] + 1;
                              field_y[var28][field_P[var28]] = var8;
                              break L48;
                            } else {
                              field_j[var27] = field_j[var27] + 1;
                              field_U[var27][field_j[var27]] = var8;
                              break L48;
                            }
                          } else {
                            field_jb[var7] = (field_gb[var9] + field_gb[var10] + field_gb[var11]) / 3;
                            var7++;
                            field_c[var7] = var8;
                            break L48;
                          }
                        }
                      }
                      break L45;
                    }
                  }
                  L50: {
                    if (!param1) {
                      break L50;
                    } else {
                      if (!this.a(bj.field_h + oo.field_l, fb.field_E + oo.field_e, field_cb[var9], field_cb[var10], field_cb[var11], var12, var13, var14_int)) {
                        break L50;
                      } else {
                        ec.field_C = ec.field_C + 1;
                        un.field_Mb[ec.field_C] = param2;
                        param1 = false;
                        break L50;
                      }
                    }
                  }
                  if ((var12 - var13) * (field_cb[var11] - field_cb[var10]) - (field_cb[var9] - field_cb[var10]) * (var14_int - var13) <= 0) {
                    break L45;
                  } else {
                    L51: {
                      L52: {
                        field_p[var8] = false;
                        if (var12 < 0) {
                          break L52;
                        } else {
                          if (var13 < 0) {
                            break L52;
                          } else {
                            if (var14_int < 0) {
                              break L52;
                            } else {
                              if (var12 > oo.field_q) {
                                break L52;
                              } else {
                                if (var13 > oo.field_q) {
                                  break L52;
                                } else {
                                  if (var14_int <= oo.field_q) {
                                    field_Z[var8] = false;
                                    break L51;
                                  } else {
                                    break L52;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      field_Z[var8] = true;
                      break L51;
                    }
                    if (!field_B) {
                      var15_int = (field_gb[var9] + field_gb[var10] + field_gb[var11]) / 3 + param3;
                      if (field_j[var15_int] >= 64) {
                        L53: {
                          var16 = field_j[var15_int];
                          if (var16 != 64) {
                            break L53;
                          } else {
                            if (field_e != 512) {
                              field_e = field_e + 1;
                              var16 = 65 + field_e;
                              field_j[var15_int] = 65 + field_e;
                              break L53;
                            } else {
                              break L45;
                            }
                          }
                        }
                        var16 -= 65;
                        field_P[var16] = field_P[var16] + 1;
                        field_y[var16][field_P[var16]] = var8;
                        break L45;
                      } else {
                        field_j[var15_int] = field_j[var15_int] + 1;
                        field_U[var15_int][field_j[var15_int]] = var8;
                        break L45;
                      }
                    } else {
                      field_jb[var7] = (field_gb[var9] + field_gb[var10] + field_gb[var11]) / 3;
                      var7++;
                      field_c[var7] = var8;
                      break L45;
                    }
                  }
                } else {
                  break L45;
                }
              }
              var8++;
              continue L3;
            }
          }
        } else {
          return;
        }
    }

    final void a(int param0, int[] param1, int param2, int param3, int param4, boolean param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        int[] var10 = null;
        int[] var11_ref_int__ = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = param1.length;
                    if (param0 != 0) {
                        statePc = 13;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    var8 = 0;
                    field_kb = 0;
                    field_ib = 0;
                    field_x = 0;
                    var9 = 0;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (var9 >= var7) {
                        statePc = 8;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    var10_int = param1[var9];
                    if (var10_int >= ((fc) this).field_b.length) {
                        statePc = 7;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var11_ref_int__ = ((fc) this).field_b[var10_int];
                    var12 = 0;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    if (var12 >= var11_ref_int__.length) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var13 = var11_ref_int__[var12];
                    field_kb = field_kb + ((fc) this).field_k[var13];
                    field_ib = field_ib + ((fc) this).field_C[var13];
                    field_x = field_x + ((fc) this).field_A[var13];
                    var8++;
                    var12++;
                    statePc = 5;
                    continue stateLoop;
                }
                case 7: {
                    var9++;
                    statePc = 2;
                    continue stateLoop;
                }
                case 8: {
                    try {
                        if (var8 <= 0) {
                            statePc = 11;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        field_kb = field_kb / var8 + param2;
                        field_ib = field_ib / var8 + param3;
                        field_x = field_x / var8 + param4;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 10: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 11: {
                    field_kb = param2;
                    field_ib = param3;
                    field_x = param4;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    return;
                }
                case 13: {
                    if (param0 != 1) {
                        statePc = 22;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    var8 = 0;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    if (var8 >= var7) {
                        statePc = 21;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    var9 = param1[var8];
                    if (var9 >= ((fc) this).field_b.length) {
                        statePc = 20;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    var10 = ((fc) this).field_b[var9];
                    var11 = 0;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    if (var11 >= var10.length) {
                        statePc = 20;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    var12 = var10[var11];
                    ((fc) this).field_k[var12] = ((fc) this).field_k[var12] + param2;
                    ((fc) this).field_C[var12] = ((fc) this).field_C[var12] + param3;
                    ((fc) this).field_A[var12] = ((fc) this).field_A[var12] + param4;
                    var11++;
                    statePc = 18;
                    continue stateLoop;
                }
                case 20: {
                    var8++;
                    statePc = 15;
                    continue stateLoop;
                }
                case 21: {
                    return;
                }
                case 22: {
                    if (param0 != 2) {
                        statePc = 37;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    var8 = 0;
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    if (var8 >= var7) {
                        statePc = 36;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    var9 = param1[var8];
                    if (var9 >= ((fc) this).field_b.length) {
                        statePc = 35;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    var10 = ((fc) this).field_b[var9];
                    var11 = 0;
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    if (var11 >= var10.length) {
                        statePc = 35;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    var12 = var10[var11];
                    ((fc) this).field_k[var12] = ((fc) this).field_k[var12] - field_kb;
                    ((fc) this).field_C[var12] = ((fc) this).field_C[var12] - field_ib;
                    ((fc) this).field_A[var12] = ((fc) this).field_A[var12] - field_x;
                    if (param4 == 0) {
                        statePc = 30;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    var13 = oo.field_j[param4];
                    var14 = oo.field_h[param4];
                    var15 = ((fc) this).field_C[var12] * var13 + ((fc) this).field_k[var12] * var14 + 32767 >> 16;
                    ((fc) this).field_C[var12] = ((fc) this).field_C[var12] * var14 - ((fc) this).field_k[var12] * var13 + 32767 >> 16;
                    ((fc) this).field_k[var12] = var15;
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    if (param2 == 0) {
                        statePc = 32;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    var13 = oo.field_j[param2];
                    var14 = oo.field_h[param2];
                    var15 = ((fc) this).field_C[var12] * var14 - ((fc) this).field_A[var12] * var13 + 32767 >> 16;
                    ((fc) this).field_A[var12] = ((fc) this).field_C[var12] * var13 + ((fc) this).field_A[var12] * var14 + 32767 >> 16;
                    ((fc) this).field_C[var12] = var15;
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    if (param3 == 0) {
                        statePc = 34;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    var13 = oo.field_j[param3];
                    var14 = oo.field_h[param3];
                    var15 = ((fc) this).field_A[var12] * var13 + ((fc) this).field_k[var12] * var14 + 32767 >> 16;
                    ((fc) this).field_A[var12] = ((fc) this).field_A[var12] * var14 - ((fc) this).field_k[var12] * var13 + 32767 >> 16;
                    ((fc) this).field_k[var12] = var15;
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    ((fc) this).field_k[var12] = ((fc) this).field_k[var12] + field_kb;
                    ((fc) this).field_C[var12] = ((fc) this).field_C[var12] + field_ib;
                    ((fc) this).field_A[var12] = ((fc) this).field_A[var12] + field_x;
                    var11++;
                    statePc = 27;
                    continue stateLoop;
                }
                case 35: {
                    var8++;
                    statePc = 24;
                    continue stateLoop;
                }
                case 36: {
                    return;
                }
                case 37: {
                    if (param0 != 3) {
                        statePc = 46;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    var8 = 0;
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    if (var8 >= var7) {
                        statePc = 45;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    var9 = param1[var8];
                    if (var9 >= ((fc) this).field_b.length) {
                        statePc = 44;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    var10 = ((fc) this).field_b[var9];
                    var11 = 0;
                    statePc = 42;
                    continue stateLoop;
                }
                case 42: {
                    if (var11 >= var10.length) {
                        statePc = 44;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    var12 = var10[var11];
                    ((fc) this).field_k[var12] = ((fc) this).field_k[var12] - field_kb;
                    ((fc) this).field_C[var12] = ((fc) this).field_C[var12] - field_ib;
                    ((fc) this).field_A[var12] = ((fc) this).field_A[var12] - field_x;
                    ((fc) this).field_k[var12] = ((fc) this).field_k[var12] * param2 / 128;
                    ((fc) this).field_C[var12] = ((fc) this).field_C[var12] * param3 / 128;
                    ((fc) this).field_A[var12] = ((fc) this).field_A[var12] * param4 / 128;
                    ((fc) this).field_k[var12] = ((fc) this).field_k[var12] + field_kb;
                    ((fc) this).field_C[var12] = ((fc) this).field_C[var12] + field_ib;
                    ((fc) this).field_A[var12] = ((fc) this).field_A[var12] + field_x;
                    var11++;
                    statePc = 42;
                    continue stateLoop;
                }
                case 44: {
                    var8++;
                    statePc = 39;
                    continue stateLoop;
                }
                case 45: {
                    return;
                }
                case 46: {
                    try {
                        if (param0 != 5) {
                            statePc = 65;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (((fc) this).field_g == null) {
                            statePc = 64;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (((fc) this).field_R == null) {
                            statePc = 64;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 52: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 53: {
                    var8 = 0;
                    statePc = 54;
                    continue stateLoop;
                }
                case 54: {
                    if (var8 >= var7) {
                        statePc = 64;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    var9 = param1[var8];
                    if (var9 >= ((fc) this).field_g.length) {
                        statePc = 63;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    var10 = ((fc) this).field_g[var9];
                    var11 = 0;
                    statePc = 57;
                    continue stateLoop;
                }
                case 57: {
                    if (var11 >= var10.length) {
                        statePc = 63;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    var12 = var10[var11];
                    var13 = (((fc) this).field_R[var12] & 255) + param2 * 8;
                    if (var13 >= 0) {
                        statePc = 60;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    var13 = 0;
                    statePc = 62;
                    continue stateLoop;
                }
                case 60: {
                    if (var13 <= 255) {
                        statePc = 62;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    var13 = 255;
                    statePc = 62;
                    continue stateLoop;
                }
                case 62: {
                    ((fc) this).field_R[var12] = (byte)var13;
                    var11++;
                    statePc = 57;
                    continue stateLoop;
                }
                case 63: {
                    var8++;
                    statePc = 54;
                    continue stateLoop;
                }
                case 64: {
                    return;
                }
                case 65: {
                    try {
                        if (param0 != 7) {
                            statePc = 86;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        if (((fc) this).field_g == null) {
                            statePc = 85;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 68: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 69: {
                    var8 = 0;
                    statePc = 70;
                    continue stateLoop;
                }
                case 70: {
                    if (var8 >= var7) {
                        statePc = 85;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 71: {
                    var9 = param1[var8];
                    if (var9 >= ((fc) this).field_g.length) {
                        statePc = 84;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    var10 = ((fc) this).field_g[var9];
                    var11 = 0;
                    statePc = 73;
                    continue stateLoop;
                }
                case 73: {
                    if (var11 >= var10.length) {
                        statePc = 83;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 74: {
                    var12 = var10[var11];
                    var13 = ((fc) this).field_d[var12] & 65535;
                    var14 = var13 >> 10 & 63;
                    var15 = var13 >> 7 & 7;
                    var16 = var13 & 127;
                    var14 = var14 + param2 & 63;
                    var15 = var15 + param3;
                    if (var15 >= 0) {
                        statePc = 76;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    var15 = 0;
                    statePc = 78;
                    continue stateLoop;
                }
                case 76: {
                    if (var15 <= 7) {
                        statePc = 78;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 77: {
                    var15 = 7;
                    statePc = 78;
                    continue stateLoop;
                }
                case 78: {
                    var16 = var16 + param4;
                    if (var16 >= 0) {
                        statePc = 80;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    var16 = 0;
                    statePc = 82;
                    continue stateLoop;
                }
                case 80: {
                    if (var16 <= 127) {
                        statePc = 82;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    var16 = 127;
                    statePc = 82;
                    continue stateLoop;
                }
                case 82: {
                    ((fc) this).field_d[var12] = (short)(var14 << 10 | var15 << 7 | var16);
                    var11++;
                    statePc = 73;
                    continue stateLoop;
                }
                case 83: {
                    ((fc) this).field_I = true;
                    statePc = 84;
                    continue stateLoop;
                }
                case 84: {
                    var8++;
                    statePc = 70;
                    continue stateLoop;
                }
                case 85: {
                    return;
                }
                case 86: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void b() {
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!((fc) this).field_I) {
              break L0;
            } else {
              this.c();
              ((fc) this).field_I = false;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
        }
        throw decompiledCaughtException;
    }

    final void a(fc param0) {
        int var2 = 0;
        fc stackIn_13_0 = null;
        fc stackIn_31_0 = null;
        fc stackOut_12_0 = null;
        fc stackOut_30_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var2 = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (var2 >= param0.field_w) {
                            statePc = 38;
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
                        ((fc) this).field_o[((fc) this).field_w] = param0.field_o[var2] + ((fc) this).field_T;
                        ((fc) this).field_a[((fc) this).field_w] = param0.field_a[var2] + ((fc) this).field_T;
                        ((fc) this).field_u[((fc) this).field_w] = param0.field_u[var2] + ((fc) this).field_T;
                        ((fc) this).field_i[((fc) this).field_w] = param0.field_i[var2];
                        ((fc) this).field_X[((fc) this).field_w] = param0.field_X[var2];
                        ((fc) this).field_bb[((fc) this).field_w] = param0.field_bb[var2];
                        ((fc) this).field_d[((fc) this).field_w] = param0.field_d[var2];
                        if (((fc) this).field_H == null) {
                            statePc = 11;
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
                        if (param0.field_H == null) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        ((fc) this).field_H[((fc) this).field_w] = param0.field_H[var2];
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 9: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 10: {
                    ((fc) this).field_H[((fc) this).field_w] = param0.field_M;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    try {
                        if (((fc) this).field_R == null) {
                            statePc = 19;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackOut_12_0 = (fc) param0;
                        stackIn_13_0 = stackOut_12_0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (stackIn_13_0.field_R == null) {
                            statePc = 19;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        ((fc) this).field_R[((fc) this).field_w] = param0.field_R[var2];
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 18: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 19: {
                    try {
                        if (((fc) this).field_F == null) {
                            statePc = 26;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (param0.field_F == null) {
                            statePc = 25;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        ((fc) this).field_F[((fc) this).field_w] = param0.field_F[var2];
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 24: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 25: {
                    ((fc) this).field_F[((fc) this).field_w] = (short) -1;
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    try {
                        if (((fc) this).field_eb == null) {
                            statePc = 37;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (param0.field_eb == null) {
                            statePc = 36;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        stackOut_30_0 = (fc) param0;
                        stackIn_31_0 = stackOut_30_0;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (stackIn_31_0.field_eb[var2] == -1) {
                            statePc = 36;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        ((fc) this).field_eb[((fc) this).field_w] = (byte)(param0.field_eb[var2] + ((fc) this).field_L);
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 35: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 36: {
                    ((fc) this).field_eb[((fc) this).field_w] = (byte) -1;
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    ((fc) this).field_w = ((fc) this).field_w + 1;
                    var2++;
                    statePc = 1;
                    continue stateLoop;
                }
                case 38: {
                    if (((fc) this).field_N == null) {
                        statePc = 43;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    var2 = 0;
                    statePc = 40;
                    continue stateLoop;
                }
                case 40: {
                    try {
                        if (var2 >= param0.field_L) {
                            statePc = 43;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        ((fc) this).field_N[((fc) this).field_L] = param0.field_N[var2] + ((fc) this).field_T;
                        ((fc) this).field_D[((fc) this).field_L] = param0.field_D[var2] + ((fc) this).field_T;
                        ((fc) this).field_E[((fc) this).field_L] = param0.field_E[var2] + ((fc) this).field_T;
                        ((fc) this).field_L = ((fc) this).field_L + 1;
                        var2++;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 42: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 43: {
                    var2 = 0;
                    statePc = 44;
                    continue stateLoop;
                }
                case 44: {
                    try {
                        if (var2 >= param0.field_T) {
                            statePc = 47;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        ((fc) this).field_k[((fc) this).field_T] = param0.field_k[var2];
                        ((fc) this).field_C[((fc) this).field_T] = param0.field_C[var2];
                        ((fc) this).field_A[((fc) this).field_T] = param0.field_A[var2];
                        ((fc) this).field_T = ((fc) this).field_T + 1;
                        var2++;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 46: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 47: {
                    ((fc) this).field_W = ((fc) this).field_T;
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final boolean a() {
        RuntimeException decompiledCaughtException = null;
        try {
          if (((fc) this).field_b != null) {
          } else {
            return false;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          throw decompiledCaughtException;
        }
        field_kb = 0;
        field_ib = 0;
        field_x = 0;
        return true;
    }

    private final boolean a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_39_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_38_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param1 >= param2) {
                            statePc = 11;
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
                        stackOut_1_0 = param1;
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
                        if (stackIn_2_0 >= param3) {
                            statePc = 11;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackOut_5_0 = param1;
                        stackIn_6_0 = stackOut_5_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (stackIn_6_0 >= param4) {
                            statePc = 11;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        return false;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 10: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 11: {
                    try {
                        if (param1 <= param2) {
                            statePc = 22;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackOut_12_0 = param1;
                        stackIn_13_0 = stackOut_12_0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (stackIn_13_0 <= param3) {
                            statePc = 22;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        stackOut_16_0 = param1;
                        stackIn_17_0 = stackOut_16_0;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (stackIn_17_0 <= param4) {
                            statePc = 22;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        return false;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 21: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 22: {
                    try {
                        if (param0 >= param5) {
                            statePc = 33;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        stackOut_23_0 = param0;
                        stackIn_24_0 = stackOut_23_0;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (stackIn_24_0 >= param6) {
                            statePc = 33;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        stackOut_27_0 = param0;
                        stackIn_28_0 = stackOut_27_0;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (stackIn_28_0 >= param7) {
                            statePc = 33;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        return false;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 32: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 33: {
                    try {
                        if (param0 <= param5) {
                            statePc = 44;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        stackOut_34_0 = param0;
                        stackIn_35_0 = stackOut_34_0;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (stackIn_35_0 <= param6) {
                            statePc = 44;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        stackOut_38_0 = param0;
                        stackIn_39_0 = stackOut_38_0;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (stackIn_39_0 <= param7) {
                            statePc = 44;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        return false;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 43: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 44: {
                    return true;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void e() {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = 0;
        int var8 = 0;
        for (var9 = 0; var9 < ((fc) this).field_W; var9++) {
            var10 = ((fc) this).field_k[var9];
            var11 = ((fc) this).field_C[var9];
            var12 = ((fc) this).field_A[var9];
            if (var10 < var1) {
                var1 = var10;
            }
            if (var10 > var4) {
                var4 = var10;
            }
            if (var11 < var2) {
                var2 = var11;
            }
            if (var11 > var5) {
                var5 = var11;
            }
            if (var12 < var3) {
                var3 = var12;
            }
            if (var12 > var6) {
                var6 = var12;
            }
            var13 = var10 * var10 + var12 * var12;
            if (var13 > var7) {
                var7 = var13;
            }
            var13 = var13 + var11 * var11;
            if (var13 > var8) {
                var8 = var13;
            }
        }
        ((fc) this).field_lb = (short)(int)(Math.sqrt((double)var7) + 0.99);
        ((fc) this).field_db = (short)(int)(Math.sqrt((double)var8) + 0.99);
        ((fc) this).field_K = true;
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

    private fc() {
        ((fc) this).field_T = 0;
        ((fc) this).field_L = 0;
        ((fc) this).field_I = false;
        ((fc) this).field_W = 0;
        ((fc) this).field_w = 0;
        ((fc) this).field_K = false;
        ((fc) this).field_M = (byte) 0;
    }

    fc(lg param0, int param1, int param2, int param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var9_ref_int__ = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        g var13 = null;
        sg var13_ref = null;
        int var14 = 0;
        int var15 = 0;
        ef stackIn_6_0 = null;
        lg stackIn_34_0 = null;
        lg stackIn_47_0 = null;
        Object stackIn_63_0 = null;
        ef stackOut_5_0 = null;
        lg stackOut_33_0 = null;
        lg stackOut_46_0 = null;
        Object stackOut_62_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    ((fc) this).field_T = 0;
                    ((fc) this).field_L = 0;
                    ((fc) this).field_I = false;
                    ((fc) this).field_W = 0;
                    ((fc) this).field_w = 0;
                    ((fc) this).field_K = false;
                    ((fc) this).field_M = (byte) 0;
                    param0.c();
                    param0.d();
                    ((fc) this).field_T = param0.field_G;
                    ((fc) this).field_W = param0.field_O;
                    ((fc) this).field_k = param0.field_p;
                    ((fc) this).field_C = param0.field_D;
                    ((fc) this).field_A = param0.field_i;
                    ((fc) this).field_w = param0.field_z;
                    ((fc) this).field_o = param0.field_e;
                    ((fc) this).field_a = param0.field_H;
                    ((fc) this).field_u = param0.field_r;
                    ((fc) this).field_H = param0.field_k;
                    ((fc) this).field_R = param0.field_o;
                    ((fc) this).field_M = param0.field_A;
                    ((fc) this).field_d = param0.field_c;
                    ((fc) this).field_b = param0.field_n;
                    ((fc) this).field_g = param0.field_w;
                    ((fc) this).field_t = param0.field_K;
                    ((fc) this).field_Y = param0.field_f;
                    var7 = (int)Math.sqrt((double)(param3 * param3 + param4 * param4 + param5 * param5));
                    var8 = param2 * var7 >> 8;
                    ((fc) this).field_i = new int[((fc) this).field_w];
                    ((fc) this).field_X = new int[((fc) this).field_w];
                    ((fc) this).field_bb = new int[((fc) this).field_w];
                    if (param0.field_N == null) {
                        statePc = 14;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    ((fc) this).field_F = new short[((fc) this).field_w];
                    var9 = 0;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (var9 >= ((fc) this).field_w) {
                        statePc = 15;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    var10 = param0.field_N[var9];
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    try {
                        if (var10 == -1) {
                            statePc = 11;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackOut_5_0 = oo.field_o;
                        stackIn_6_0 = stackOut_5_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (!((ef) (Object) stackIn_6_0).d(-127, var10)) {
                            statePc = 11;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        ((fc) this).field_F[var9] = (short) var10;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 10: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 11: {
                    ((fc) this).field_F[var9] = (short) -1;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    var9++;
                    statePc = 2;
                    continue stateLoop;
                }
                case 14: {
                    ((fc) this).field_F = null;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    try {
                        if (param0.field_L <= 0) {
                            statePc = 70;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (param0.field_x == null) {
                            statePc = 70;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 18: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 19: {
                    var9_ref_int__ = new int[param0.field_L];
                    var10 = 0;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    try {
                        if (var10 >= ((fc) this).field_w) {
                            statePc = 28;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (param0.field_x[var10] == -1) {
                            statePc = 27;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var9_ref_int__[param0.field_x[var10] & 255] = var9_ref_int__[param0.field_x[var10] & 255] + 1;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 26: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 27: {
                    var10++;
                    statePc = 20;
                    continue stateLoop;
                }
                case 28: {
                    ((fc) this).field_L = 0;
                    var10 = 0;
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    try {
                        if (var10 >= param0.field_L) {
                            statePc = 41;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (var9_ref_int__[var10] <= 0) {
                            statePc = 40;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        stackOut_33_0 = (lg) param0;
                        stackIn_34_0 = stackOut_33_0;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (stackIn_34_0.field_E[var10] != 0) {
                            statePc = 40;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        ((fc) this).field_L = ((fc) this).field_L + 1;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 39: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 40: {
                    var10++;
                    statePc = 29;
                    continue stateLoop;
                }
                case 41: {
                    ((fc) this).field_N = new int[((fc) this).field_L];
                    ((fc) this).field_D = new int[((fc) this).field_L];
                    ((fc) this).field_E = new int[((fc) this).field_L];
                    var10 = 0;
                    var11 = 0;
                    statePc = 42;
                    continue stateLoop;
                }
                case 42: {
                    try {
                        if (var11 >= param0.field_L) {
                            statePc = 54;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (var9_ref_int__[var11] <= 0) {
                            statePc = 52;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        stackOut_46_0 = (lg) param0;
                        stackIn_47_0 = stackOut_46_0;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (stackIn_47_0.field_E[var11] != 0) {
                            statePc = 52;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        ((fc) this).field_N[var10] = param0.field_M[var11] & 65535;
                        ((fc) this).field_D[var10] = param0.field_P[var11] & 65535;
                        ((fc) this).field_E[var10] = param0.field_F[var11] & 65535;
                        var10++;
                        var9_ref_int__[var11] = var10;
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 51: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 52: {
                    var9_ref_int__[var11] = -1;
                    statePc = 53;
                    continue stateLoop;
                }
                case 53: {
                    var11++;
                    statePc = 42;
                    continue stateLoop;
                }
                case 54: {
                    ((fc) this).field_eb = new byte[((fc) this).field_w];
                    var11 = 0;
                    statePc = 55;
                    continue stateLoop;
                }
                case 55: {
                    try {
                        if (var11 >= ((fc) this).field_w) {
                            statePc = 70;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (param0.field_x[var11] == -1) {
                            statePc = 68;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        ((fc) this).field_eb[var11] = (byte)var9_ref_int__[param0.field_x[var11] & 255];
                        if (((fc) this).field_eb[var11] != -1) {
                            statePc = 69;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        stackOut_62_0 = this;
                        stackIn_63_0 = stackOut_62_0;
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        if (((fc) this).field_F == null) {
                            statePc = 69;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        ((fc) this).field_F[var11] = (short) -1;
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 67: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 68: {
                    ((fc) this).field_eb[var11] = (byte) -1;
                    statePc = 69;
                    continue stateLoop;
                }
                case 69: {
                    var11++;
                    statePc = 55;
                    continue stateLoop;
                }
                case 70: {
                    var9 = 0;
                    statePc = 71;
                    continue stateLoop;
                }
                case 71: {
                    try {
                        if (var9 >= ((fc) this).field_w) {
                            statePc = 147;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        if (param0.field_g != null) {
                            statePc = 76;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 74: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 75: {
                    var10 = 0;
                    statePc = 77;
                    continue stateLoop;
                }
                case 76: {
                    var10 = param0.field_g[var9];
                    statePc = 77;
                    continue stateLoop;
                }
                case 77: {
                    if (param0.field_o != null) {
                        statePc = 79;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    var11 = 0;
                    statePc = 80;
                    continue stateLoop;
                }
                case 79: {
                    var11 = param0.field_o[var9];
                    statePc = 80;
                    continue stateLoop;
                }
                case 80: {
                    if (((fc) this).field_F != null) {
                        statePc = 82;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    var12 = -1;
                    statePc = 83;
                    continue stateLoop;
                }
                case 82: {
                    var12 = ((fc) this).field_F[var9];
                    statePc = 83;
                    continue stateLoop;
                }
                case 83: {
                    if (var11 != -2) {
                        statePc = 85;
                    } else {
                        statePc = 84;
                    }
                    continue stateLoop;
                }
                case 84: {
                    var10 = 3;
                    statePc = 85;
                    continue stateLoop;
                }
                case 85: {
                    if (var11 != -1) {
                        statePc = 87;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 86: {
                    var10 = 2;
                    statePc = 87;
                    continue stateLoop;
                }
                case 87: {
                    try {
                        if (var12 != -1) {
                            statePc = 119;
                        } else {
                            statePc = 88;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        if (var10 != 0) {
                            statePc = 113;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 90: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 91: {
                    var15 = param0.field_c[var9] & 65535;
                    statePc = 92;
                    continue stateLoop;
                }
                case 92: {
                    try {
                        if (param0.field_Q == null) {
                            statePc = 97;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        if (param0.field_Q[((fc) this).field_o[var9]] == null) {
                            statePc = 97;
                        } else {
                            statePc = 96;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 95: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 96: {
                    var13_ref = param0.field_Q[((fc) this).field_o[var9]];
                    statePc = 98;
                    continue stateLoop;
                }
                case 97: {
                    var13_ref = param0.field_B[((fc) this).field_o[var9]];
                    statePc = 98;
                    continue stateLoop;
                }
                case 98: {
                    var14 = param1 + (param3 * var13_ref.field_b + param4 * var13_ref.field_h + param5 * var13_ref.field_f) / (var8 * var13_ref.field_g) << 17;
                    statePc = 99;
                    continue stateLoop;
                }
                case 99: {
                    try {
                        ((fc) this).field_i[var9] = var14 | fc.a(var15, var14 >> 17);
                        if (param0.field_Q == null) {
                            statePc = 104;
                        } else {
                            statePc = 100;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        if (param0.field_Q[((fc) this).field_a[var9]] == null) {
                            statePc = 104;
                        } else {
                            statePc = 103;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 102: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 103: {
                    var13_ref = param0.field_Q[((fc) this).field_a[var9]];
                    statePc = 105;
                    continue stateLoop;
                }
                case 104: {
                    var13_ref = param0.field_B[((fc) this).field_a[var9]];
                    statePc = 105;
                    continue stateLoop;
                }
                case 105: {
                    var14 = param1 + (param3 * var13_ref.field_b + param4 * var13_ref.field_h + param5 * var13_ref.field_f) / (var8 * var13_ref.field_g) << 17;
                    statePc = 106;
                    continue stateLoop;
                }
                case 106: {
                    try {
                        ((fc) this).field_X[var9] = var14 | fc.a(var15, var14 >> 17);
                        if (param0.field_Q == null) {
                            statePc = 111;
                        } else {
                            statePc = 107;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 109;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        if (param0.field_Q[((fc) this).field_u[var9]] == null) {
                            statePc = 111;
                        } else {
                            statePc = 110;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 109;
                        continue stateLoop;
                    }
                }
                case 109: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 110: {
                    var13_ref = param0.field_Q[((fc) this).field_u[var9]];
                    statePc = 112;
                    continue stateLoop;
                }
                case 111: {
                    var13_ref = param0.field_B[((fc) this).field_u[var9]];
                    statePc = 112;
                    continue stateLoop;
                }
                case 112: {
                    var14 = param1 + (param3 * var13_ref.field_b + param4 * var13_ref.field_h + param5 * var13_ref.field_f) / (var8 * var13_ref.field_g) << 17;
                    ((fc) this).field_bb[var9] = var14 | fc.a(var15, var14 >> 17);
                    statePc = 146;
                    continue stateLoop;
                }
                case 113: {
                    if (var10 != 1) {
                        statePc = 115;
                    } else {
                        statePc = 114;
                    }
                    continue stateLoop;
                }
                case 114: {
                    var13 = param0.field_j[var9];
                    var14 = param1 + (param3 * var13.field_a + param4 * var13.field_c + param5 * var13.field_d) / (var8 + var8 / 2) << 17;
                    ((fc) this).field_i[var9] = var14 | fc.a(param0.field_c[var9] & 65535, var14 >> 17);
                    ((fc) this).field_bb[var9] = -1;
                    statePc = 146;
                    continue stateLoop;
                }
                case 115: {
                    try {
                        if (var10 != 3) {
                            statePc = 118;
                        } else {
                            statePc = 116;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        ((fc) this).field_i[var9] = 128;
                        ((fc) this).field_bb[var9] = -1;
                        statePc = 146;
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 117: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 118: {
                    ((fc) this).field_bb[var9] = -2;
                    statePc = 146;
                    continue stateLoop;
                }
                case 119: {
                    try {
                        if (var10 != 0) {
                            statePc = 143;
                        } else {
                            statePc = 120;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 122;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        if (param0.field_Q == null) {
                            statePc = 127;
                        } else {
                            statePc = 121;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        statePc = 123;
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        if (param0.field_Q[((fc) this).field_o[var9]] == null) {
                            statePc = 127;
                        } else {
                            statePc = 126;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 125: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 126: {
                    var13_ref = param0.field_Q[((fc) this).field_o[var9]];
                    statePc = 128;
                    continue stateLoop;
                }
                case 127: {
                    var13_ref = param0.field_B[((fc) this).field_o[var9]];
                    statePc = 128;
                    continue stateLoop;
                }
                case 128: {
                    var14 = param1 + (param3 * var13_ref.field_b + param4 * var13_ref.field_h + param5 * var13_ref.field_f) / (var8 * var13_ref.field_g);
                    statePc = 129;
                    continue stateLoop;
                }
                case 129: {
                    try {
                        ((fc) this).field_i[var9] = fc.b(var14);
                        if (param0.field_Q == null) {
                            statePc = 134;
                        } else {
                            statePc = 130;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        if (param0.field_Q[((fc) this).field_a[var9]] == null) {
                            statePc = 134;
                        } else {
                            statePc = 133;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 132: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 133: {
                    var13_ref = param0.field_Q[((fc) this).field_a[var9]];
                    statePc = 135;
                    continue stateLoop;
                }
                case 134: {
                    var13_ref = param0.field_B[((fc) this).field_a[var9]];
                    statePc = 135;
                    continue stateLoop;
                }
                case 135: {
                    var14 = param1 + (param3 * var13_ref.field_b + param4 * var13_ref.field_h + param5 * var13_ref.field_f) / (var8 * var13_ref.field_g);
                    statePc = 136;
                    continue stateLoop;
                }
                case 136: {
                    try {
                        ((fc) this).field_X[var9] = fc.b(var14);
                        if (param0.field_Q == null) {
                            statePc = 141;
                        } else {
                            statePc = 137;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 137: {
                    try {
                        if (param0.field_Q[((fc) this).field_u[var9]] == null) {
                            statePc = 141;
                        } else {
                            statePc = 140;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_137) {
                        caughtException = stateCaught_137;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 139: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 140: {
                    var13_ref = param0.field_Q[((fc) this).field_u[var9]];
                    statePc = 142;
                    continue stateLoop;
                }
                case 141: {
                    var13_ref = param0.field_B[((fc) this).field_u[var9]];
                    statePc = 142;
                    continue stateLoop;
                }
                case 142: {
                    var14 = param1 + (param3 * var13_ref.field_b + param4 * var13_ref.field_h + param5 * var13_ref.field_f) / (var8 * var13_ref.field_g);
                    ((fc) this).field_bb[var9] = fc.b(var14);
                    statePc = 146;
                    continue stateLoop;
                }
                case 143: {
                    if (var10 != 1) {
                        statePc = 145;
                    } else {
                        statePc = 144;
                    }
                    continue stateLoop;
                }
                case 144: {
                    var13 = param0.field_j[var9];
                    var14 = param1 + (param3 * var13.field_a + param4 * var13.field_c + param5 * var13.field_d) / (var8 + var8 / 2);
                    ((fc) this).field_i[var9] = fc.b(var14);
                    ((fc) this).field_bb[var9] = -1;
                    statePc = 146;
                    continue stateLoop;
                }
                case 145: {
                    ((fc) this).field_bb[var9] = -2;
                    statePc = 146;
                    continue stateLoop;
                }
                case 146: {
                    var9++;
                    statePc = 71;
                    continue stateLoop;
                }
                case 147: {
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    fc(int param0, int param1, int param2, boolean param3, boolean param4, boolean param5, boolean param6, int param7, int param8) {
        RuntimeException decompiledCaughtException = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    ((fc) this).field_T = 0;
                    ((fc) this).field_L = 0;
                    ((fc) this).field_I = false;
                    ((fc) this).field_W = 0;
                    ((fc) this).field_w = 0;
                    ((fc) this).field_K = false;
                    ((fc) this).field_M = (byte) 0;
                    ((fc) this).field_k = new int[param0];
                    ((fc) this).field_C = new int[param0];
                    ((fc) this).field_A = new int[param0];
                    ((fc) this).field_o = new int[param1];
                    ((fc) this).field_a = new int[param1];
                    ((fc) this).field_u = new int[param1];
                    ((fc) this).field_i = new int[param1];
                    ((fc) this).field_X = new int[param1];
                    ((fc) this).field_bb = new int[param1];
                    if (!param3) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    ((fc) this).field_H = new byte[param1];
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    try {
                        if (!param4) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        ((fc) this).field_R = new byte[param1];
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 5: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 6: {
                    try {
                        if (!param5) {
                            statePc = 10;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        ((fc) this).field_F = new short[param1];
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 9: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 10: {
                    try {
                        if (!param6) {
                            statePc = 14;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        ((fc) this).field_eb = new byte[param1];
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 13: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 14: {
                    try {
                        if (param2 <= 0) {
                            statePc = 18;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        ((fc) this).field_N = new int[param2];
                        ((fc) this).field_D = new int[param2];
                        ((fc) this).field_E = new int[param2];
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 17: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 18: {
                    ((fc) this).field_d = new short[param1];
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        field_ab = new fc();
                        field_hb = new int[1];
                        field_s = new int[1];
                        field_f = new int[1];
                        field_m = new short[1];
                        field_h = new byte[1];
                        fc discarded$4 = new fc();
                        fc discarded$5 = new fc();
                        field_Z = new boolean[4096];
                        field_G = new int[12][4096];
                        field_q = new int[4096];
                        field_fb = new int[4096];
                        field_v = new int[4096];
                        field_l = new int[10];
                        field_S = new int[4096];
                        field_Q = new int[12];
                        field_cb = new int[4096];
                        field_O = new int[10];
                        field_B = false;
                        field_J = new int[10];
                        field_V = new int[12];
                        field_r = new int[4096];
                        field_n = false;
                        field_gb = new int[4096];
                        field_e = 0;
                        field_p = new boolean[4096];
                        field_z = new int[4096];
                        if (!field_B) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 2;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        field_jb = new int[4096];
                        field_c = new int[4096];
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 2;
                        continue stateLoop;
                    }
                }
                case 2: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 3: {
                    field_j = new int[1600];
                    field_U = new int[1600][64];
                    field_P = new int[32];
                    field_y = new int[32][512];
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }
}
