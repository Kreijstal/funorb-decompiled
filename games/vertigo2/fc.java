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
        L0: {
          if (((fc) this).field_K) {
            break L0;
          } else {
            this.e();
            break L0;
          }
        }
        return ((fc) this).field_lb;
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
        int stackOut_7_0 = 0;
        short stackOut_5_0 = 0;
        var4 = 0;
        L0: while (true) {
          if (var4 >= ((fc) this).field_w) {
            return;
          } else {
            L1: {
              if (((fc) this).field_F == null) {
                stackOut_7_0 = -1;
                stackIn_8_0 = stackOut_7_0;
                break L1;
              } else {
                stackOut_5_0 = ((fc) this).field_F[var4];
                stackIn_8_0 = stackOut_5_0;
                break L1;
              }
            }
            L2: {
              var3 = stackIn_8_0;
              if (var3 != -1) {
                break L2;
              } else {
                var1 = ((fc) this).field_d[var4] & 65535;
                if (((fc) this).field_bb[var4] != -1) {
                  if (((fc) this).field_bb[var4] == -2) {
                    break L2;
                  } else {
                    var2 = ((fc) this).field_i[var4] & -131072;
                    ((fc) this).field_i[var4] = var2 | fc.a(var1, var2 >> 17);
                    var2 = ((fc) this).field_X[var4] & -131072;
                    ((fc) this).field_X[var4] = var2 | fc.a(var1, var2 >> 17);
                    var2 = ((fc) this).field_bb[var4] & -131072;
                    ((fc) this).field_bb[var4] = var2 | fc.a(var1, var2 >> 17);
                    break L2;
                  }
                } else {
                  var2 = ((fc) this).field_i[var4] & -131072;
                  ((fc) this).field_i[var4] = var2 | fc.a(var1, var2 >> 17);
                  break L2;
                }
              }
            }
            var4++;
            continue L0;
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
                int incrementValue$9 = var4;
                var4++;
                field_J[incrementValue$9] = var13 + (((((fc) this).field_bb[param0] & 65535) - var13) * var14 >> 16);
                break L2;
              }
            }
            if (var9 < 50) {
              break L1;
            } else {
              var14 = (50 - var8) * oo.field_k[var9 - var8];
              field_O[var4] = var2 + (var11 + ((field_S[var6] - var11) * var14 >> 16) << 9) / 50;
              field_l[var4] = var3 + (var12 + ((field_fb[var6] - var12) * var14 >> 16) << 9) / 50;
              int incrementValue$10 = var4;
              var4++;
              field_J[incrementValue$10] = var13 + (((((fc) this).field_X[param0] & 65535) - var13) * var14 >> 16);
              break L1;
            }
          } else {
            field_O[var4] = field_v[var5];
            field_l[var4] = field_cb[var5];
            int incrementValue$11 = var4;
            var4++;
            field_J[incrementValue$11] = ((fc) this).field_i[param0] & 65535;
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
                int incrementValue$12 = var4;
                var4++;
                field_J[incrementValue$12] = var13 + (((((fc) this).field_i[param0] & 65535) - var13) * var14 >> 16);
                break L4;
              }
            }
            if (var10 < 50) {
              break L3;
            } else {
              var14 = (50 - var9) * oo.field_k[var10 - var9];
              field_O[var4] = var2 + (var11 + ((field_S[var7] - var11) * var14 >> 16) << 9) / 50;
              field_l[var4] = var3 + (var12 + ((field_fb[var7] - var12) * var14 >> 16) << 9) / 50;
              int incrementValue$13 = var4;
              var4++;
              field_J[incrementValue$13] = var13 + (((((fc) this).field_bb[param0] & 65535) - var13) * var14 >> 16);
              break L3;
            }
          } else {
            field_O[var4] = field_v[var6];
            field_l[var4] = field_cb[var6];
            int incrementValue$14 = var4;
            var4++;
            field_J[incrementValue$14] = ((fc) this).field_X[param0] & 65535;
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
                int incrementValue$15 = var4;
                var4++;
                field_J[incrementValue$15] = var13 + (((((fc) this).field_X[param0] & 65535) - var13) * var14 >> 16);
                break L6;
              }
            }
            if (var8 < 50) {
              break L5;
            } else {
              var14 = (50 - var10) * oo.field_k[var8 - var10];
              field_O[var4] = var2 + (var11 + ((field_S[var5] - var11) * var14 >> 16) << 9) / 50;
              field_l[var4] = var3 + (var12 + ((field_fb[var5] - var12) * var14 >> 16) << 9) / 50;
              int incrementValue$16 = var4;
              var4++;
              field_J[incrementValue$16] = var13 + (((((fc) this).field_i[param0] & 65535) - var13) * var14 >> 16);
              break L5;
            }
          } else {
            field_O[var4] = field_v[var7];
            field_l[var4] = field_cb[var7];
            int incrementValue$17 = var4;
            var4++;
            field_J[incrementValue$17] = ((fc) this).field_bb[param0] & 65535;
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
        L0: {
          L1: {
            param2.field_T = ((fc) this).field_T;
            param2.field_W = ((fc) this).field_W;
            param2.field_w = ((fc) this).field_w;
            param2.field_L = ((fc) this).field_L;
            if (param2.field_k == null) {
              break L1;
            } else {
              if (param2.field_k.length >= ((fc) this).field_T) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          param2.field_k = new int[((fc) this).field_T + 100];
          param2.field_C = new int[((fc) this).field_T + 100];
          param2.field_A = new int[((fc) this).field_T + 100];
          break L0;
        }
        var9 = 0;
        L2: while (true) {
          if (var9 >= ((fc) this).field_T) {
            L3: {
              if (!param0) {
                param2.field_R = param3;
                if (((fc) this).field_R != null) {
                  var9 = 0;
                  L4: while (true) {
                    if (var9 >= ((fc) this).field_w) {
                      break L3;
                    } else {
                      param2.field_R[var9] = ((fc) this).field_R[var9];
                      var9++;
                      continue L4;
                    }
                  }
                } else {
                  var9 = 0;
                  L5: while (true) {
                    if (var9 >= ((fc) this).field_w) {
                      break L3;
                    } else {
                      param2.field_R[var9] = (byte) 0;
                      var9++;
                      continue L5;
                    }
                  }
                }
              } else {
                param2.field_R = ((fc) this).field_R;
                break L3;
              }
            }
            L6: {
              if (!param1) {
                param2.field_d = param4;
                param2.field_i = param5;
                param2.field_X = param6;
                param2.field_bb = param7;
                var9 = 0;
                L7: while (true) {
                  if (var9 >= ((fc) this).field_w) {
                    break L6;
                  } else {
                    param2.field_d[var9] = ((fc) this).field_d[var9];
                    param2.field_i[var9] = ((fc) this).field_i[var9];
                    param2.field_X[var9] = ((fc) this).field_X[var9];
                    param2.field_bb[var9] = ((fc) this).field_bb[var9];
                    var9++;
                    continue L7;
                  }
                }
              } else {
                param2.field_d = ((fc) this).field_d;
                param2.field_i = ((fc) this).field_i;
                param2.field_X = ((fc) this).field_X;
                param2.field_bb = ((fc) this).field_bb;
                break L6;
              }
            }
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
          } else {
            param2.field_k[var9] = ((fc) this).field_k[var9];
            param2.field_C[var9] = ((fc) this).field_C[var9];
            param2.field_A[var9] = ((fc) this).field_A[var9];
            var9++;
            continue L2;
          }
        }
    }

    final bn a(boolean param0, boolean param1, boolean param2) {
        L0: {
          if (param0) {
            break L0;
          } else {
            if (field_h.length >= ((fc) this).field_w) {
              break L0;
            } else {
              field_h = new byte[((fc) this).field_w + 100];
              break L0;
            }
          }
        }
        L1: {
          if (param1) {
            break L1;
          } else {
            if (field_m.length >= ((fc) this).field_w) {
              break L1;
            } else {
              field_hb = new int[((fc) this).field_w + 100];
              field_f = new int[((fc) this).field_w + 100];
              field_s = new int[((fc) this).field_w + 100];
              field_m = new short[((fc) this).field_w + 100];
              break L1;
            }
          }
        }
        return this.a(param0, param1, field_ab, field_h, field_m, field_hb, field_f, field_s);
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
        int stackIn_22_0 = 0;
        int stackIn_29_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_21_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_26_0 = 0;
        L0: {
          if (((fc) this).field_K) {
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
        if (var5 >= 50 - ((fc) this).field_db) {
          var15 = ((fc) this).field_db * 92682 >> 16;
          if (var3 >= -var5 - var15) {
            if (var3 <= var5 + var15) {
              if (var4 >= -var5 - var15) {
                if (var4 <= var5 + var15) {
                  L1: {
                    if (var5 > 50 + ((fc) this).field_db) {
                      stackOut_21_0 = 0;
                      stackIn_22_0 = stackOut_21_0;
                      break L1;
                    } else {
                      stackOut_19_0 = 1;
                      stackIn_22_0 = stackOut_19_0;
                      break L1;
                    }
                  }
                  L2: {
                    L3: {
                      var16 = stackIn_22_0;
                      if (var16 != 0) {
                        break L3;
                      } else {
                        if (((fc) this).field_L <= 0) {
                          stackOut_28_0 = 0;
                          stackIn_29_0 = stackOut_28_0;
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    stackOut_26_0 = 1;
                    stackIn_29_0 = stackOut_26_0;
                    break L2;
                  }
                  var17 = stackIn_29_0;
                  var18 = oo.field_l;
                  var19 = oo.field_e;
                  var20 = 0;
                  var21_int = 0;
                  L4: while (true) {
                    if (var21_int >= ((fc) this).field_T) {
                      try {
                        L5: {
                          this.a((var20 & var16) != 0, false, 0L, (int) ((fc) this).field_db, ((fc) this).field_db << 1);
                          break L5;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L6: {
                          var21 = (Exception) (Object) decompiledCaughtException;
                          break L6;
                        }
                      }
                      return;
                    } else {
                      L7: {
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
                        if (var24 < 50) {
                          field_v[var21_int] = -5000;
                          var20 = 1;
                          break L7;
                        } else {
                          field_v[var21_int] = var18 + (var22 << 9) / var24;
                          field_cb[var21_int] = var19 + (var23 << 9) / var24;
                          break L7;
                        }
                      }
                      L8: {
                        if (var17 == 0) {
                          break L8;
                        } else {
                          field_S[var21_int] = var22;
                          field_fb[var21_int] = var23;
                          field_q[var21_int] = var24;
                          break L8;
                        }
                      }
                      var21_int++;
                      continue L4;
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

    private final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (!field_p[param0]) {
          L0: {
            var2 = ((fc) this).field_o[param0];
            var3 = ((fc) this).field_a[param0];
            var4 = ((fc) this).field_u[param0];
            oo.field_m = field_Z[param0];
            if (((fc) this).field_R != null) {
              oo.field_n = ((fc) this).field_R[param0] & 255;
              break L0;
            } else {
              oo.field_n = 0;
              break L0;
            }
          }
          L1: {
            L2: {
              if (((fc) this).field_F == null) {
                break L2;
              } else {
                if (((fc) this).field_F[param0] != -1) {
                  L3: {
                    L4: {
                      if (((fc) this).field_eb == null) {
                        break L4;
                      } else {
                        if (((fc) this).field_eb[param0] == -1) {
                          break L4;
                        } else {
                          var8 = ((fc) this).field_eb[param0] & 255;
                          var5 = ((fc) this).field_N[var8];
                          var6 = ((fc) this).field_D[var8];
                          var7 = ((fc) this).field_E[var8];
                          break L3;
                        }
                      }
                    }
                    var5 = var2;
                    var6 = var3;
                    var7 = var4;
                    break L3;
                  }
                  if (((fc) this).field_bb[param0] != -1) {
                    oo.a(field_cb[var2], field_cb[var3], field_cb[var4], field_v[var2], field_v[var3], field_v[var4], ((fc) this).field_i[param0], ((fc) this).field_X[param0], ((fc) this).field_bb[param0], field_S[var5], field_S[var6], field_S[var7], field_fb[var5], field_fb[var6], field_fb[var7], field_q[var5], field_q[var6], field_q[var7], (int) ((fc) this).field_F[param0]);
                    break L1;
                  } else {
                    oo.a(field_cb[var2], field_cb[var3], field_cb[var4], field_v[var2], field_v[var3], field_v[var4], ((fc) this).field_i[param0], ((fc) this).field_i[param0], ((fc) this).field_i[param0], field_S[var5], field_S[var6], field_S[var7], field_fb[var5], field_fb[var6], field_fb[var7], field_q[var5], field_q[var6], field_q[var7], (int) ((fc) this).field_F[param0]);
                    break L1;
                  }
                } else {
                  break L2;
                }
              }
            }
            if (((fc) this).field_bb[param0] != -1) {
              oo.a(field_cb[var2], field_cb[var3], field_cb[var4], field_v[var2], field_v[var3], field_v[var4], ((fc) this).field_i[param0] & 65535, ((fc) this).field_X[param0] & 65535, ((fc) this).field_bb[param0] & 65535);
              break L1;
            } else {
              oo.a(field_cb[var2], field_cb[var3], field_cb[var4], field_v[var2], field_v[var3], field_v[var4], oo.field_c[((fc) this).field_i[param0] & 65535]);
              break L1;
            }
          }
          return;
        } else {
          this.a(param0);
          return;
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
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_19_2 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        try {
          L0: {
            L1: {
              if (((fc) this).field_K) {
                break L1;
              } else {
                this.e();
                break L1;
              }
            }
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
            L2: while (true) {
              if (var21 >= ((fc) this).field_T) {
                L3: {
                  stackOut_15_0 = this;
                  stackOut_15_1 = 0;
                  stackIn_18_0 = stackOut_15_0;
                  stackIn_18_1 = stackOut_15_1;
                  stackIn_16_0 = stackOut_15_0;
                  stackIn_16_1 = stackOut_15_1;
                  if (param7 < 0L) {
                    stackOut_18_0 = this;
                    stackOut_18_1 = stackIn_18_1;
                    stackOut_18_2 = 0;
                    stackIn_19_0 = stackOut_18_0;
                    stackIn_19_1 = stackOut_18_1;
                    stackIn_19_2 = stackOut_18_2;
                    break L3;
                  } else {
                    stackOut_16_0 = this;
                    stackOut_16_1 = stackIn_16_1;
                    stackOut_16_2 = 1;
                    stackIn_19_0 = stackOut_16_0;
                    stackIn_19_1 = stackOut_16_1;
                    stackIn_19_2 = stackOut_16_2;
                    break L3;
                  }
                }
                this.a(stackIn_19_1 != 0, stackIn_19_2 != 0, param7, (int) ((fc) this).field_db, ((fc) this).field_db << 1);
                break L0;
              } else {
                L4: {
                  var22 = ((fc) this).field_k[var21];
                  var23 = ((fc) this).field_C[var21];
                  var24 = ((fc) this).field_A[var21];
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
                  field_gb[var21] = var24 - var20;
                  field_v[var21] = var10_int + (var22 << 9) / var24;
                  field_cb[var21] = var11 + (var23 << 9) / var24;
                  if (((fc) this).field_L <= 0) {
                    break L7;
                  } else {
                    field_S[var21] = var22;
                    field_fb[var21] = var23;
                    field_q[var21] = var24;
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
        int stackIn_124_0 = 0;
        int stackOut_123_0 = 0;
        int stackOut_121_0 = 0;
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
                                stackOut_123_0 = var9;
                                stackIn_124_0 = stackOut_123_0;
                                break L16;
                              } else {
                                stackOut_121_0 = 64;
                                stackIn_124_0 = stackOut_121_0;
                                break L16;
                              }
                            }
                            var10 = stackIn_124_0;
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
                        int incrementValue$7 = var12;
                        var12++;
                        this.c(var14[incrementValue$7]);
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
                            int incrementValue$8 = var12;
                            var12++;
                            this.c(var14[incrementValue$8]);
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
                              int incrementValue$9 = var12;
                              var12++;
                              this.c(var14[incrementValue$9]);
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
                                int incrementValue$10 = var12;
                                var12++;
                                this.c(var14[incrementValue$10]);
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
                            int incrementValue$11 = var7;
                            var7++;
                            field_c[incrementValue$11] = var8;
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
                        int fieldTemp$12 = ec.field_C;
                        ec.field_C = ec.field_C + 1;
                        un.field_Mb[fieldTemp$12] = param2;
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
                      int incrementValue$13 = var7;
                      var7++;
                      field_c[incrementValue$13] = var8;
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
        var7 = param1.length;
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
                        var8 = 0;
                        L1: while (true) {
                          if (var8 >= var7) {
                            break L0;
                          } else {
                            L2: {
                              var9 = param1[var8];
                              if (var9 >= ((fc) this).field_g.length) {
                                break L2;
                              } else {
                                var10 = ((fc) this).field_g[var9];
                                var11 = 0;
                                L3: while (true) {
                                  if (var11 >= var10.length) {
                                    ((fc) this).field_I = true;
                                    break L2;
                                  } else {
                                    L4: {
                                      var12 = var10[var11];
                                      var13 = ((fc) this).field_d[var12] & 65535;
                                      var14 = var13 >> 10 & 63;
                                      var15 = var13 >> 7 & 7;
                                      var16 = var13 & 127;
                                      var14 = var14 + param2 & 63;
                                      var15 = var15 + param3;
                                      if (var15 >= 0) {
                                        if (var15 <= 7) {
                                          break L4;
                                        } else {
                                          var15 = 7;
                                          break L4;
                                        }
                                      } else {
                                        var15 = 0;
                                        break L4;
                                      }
                                    }
                                    L5: {
                                      var16 = var16 + param4;
                                      if (var16 >= 0) {
                                        if (var16 <= 127) {
                                          break L5;
                                        } else {
                                          var16 = 127;
                                          break L5;
                                        }
                                      } else {
                                        var16 = 0;
                                        break L5;
                                      }
                                    }
                                    ((fc) this).field_d[var12] = (short)(var14 << 10 | var15 << 7 | var16);
                                    var11++;
                                    continue L3;
                                  }
                                }
                              }
                            }
                            var8++;
                            continue L1;
                          }
                        }
                      }
                    }
                    return;
                  }
                } else {
                  L6: {
                    if (((fc) this).field_g == null) {
                      break L6;
                    } else {
                      if (((fc) this).field_R == null) {
                        break L6;
                      } else {
                        var8 = 0;
                        L7: while (true) {
                          if (var8 >= var7) {
                            break L6;
                          } else {
                            L8: {
                              var9 = param1[var8];
                              if (var9 >= ((fc) this).field_g.length) {
                                break L8;
                              } else {
                                var10 = ((fc) this).field_g[var9];
                                var11 = 0;
                                L9: while (true) {
                                  if (var11 >= var10.length) {
                                    break L8;
                                  } else {
                                    L10: {
                                      var12 = var10[var11];
                                      var13 = (((fc) this).field_R[var12] & 255) + param2 * 8;
                                      if (var13 >= 0) {
                                        if (var13 <= 255) {
                                          break L10;
                                        } else {
                                          var13 = 255;
                                          break L10;
                                        }
                                      } else {
                                        var13 = 0;
                                        break L10;
                                      }
                                    }
                                    ((fc) this).field_R[var12] = (byte)var13;
                                    var11++;
                                    continue L9;
                                  }
                                }
                              }
                            }
                            var8++;
                            continue L7;
                          }
                        }
                      }
                    }
                  }
                  return;
                }
              } else {
                var8 = 0;
                L11: while (true) {
                  if (var8 >= var7) {
                    return;
                  } else {
                    L12: {
                      var9 = param1[var8];
                      if (var9 >= ((fc) this).field_b.length) {
                        break L12;
                      } else {
                        var10 = ((fc) this).field_b[var9];
                        var11 = 0;
                        L13: while (true) {
                          if (var11 >= var10.length) {
                            break L12;
                          } else {
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
                            continue L13;
                          }
                        }
                      }
                    }
                    var8++;
                    continue L11;
                  }
                }
              }
            } else {
              var8 = 0;
              L14: while (true) {
                if (var8 >= var7) {
                  return;
                } else {
                  L15: {
                    var9 = param1[var8];
                    if (var9 >= ((fc) this).field_b.length) {
                      break L15;
                    } else {
                      var10 = ((fc) this).field_b[var9];
                      var11 = 0;
                      L16: while (true) {
                        if (var11 >= var10.length) {
                          break L15;
                        } else {
                          L17: {
                            var12 = var10[var11];
                            ((fc) this).field_k[var12] = ((fc) this).field_k[var12] - field_kb;
                            ((fc) this).field_C[var12] = ((fc) this).field_C[var12] - field_ib;
                            ((fc) this).field_A[var12] = ((fc) this).field_A[var12] - field_x;
                            if (param4 == 0) {
                              break L17;
                            } else {
                              var13 = oo.field_j[param4];
                              var14 = oo.field_h[param4];
                              var15 = ((fc) this).field_C[var12] * var13 + ((fc) this).field_k[var12] * var14 + 32767 >> 16;
                              ((fc) this).field_C[var12] = ((fc) this).field_C[var12] * var14 - ((fc) this).field_k[var12] * var13 + 32767 >> 16;
                              ((fc) this).field_k[var12] = var15;
                              break L17;
                            }
                          }
                          L18: {
                            if (param2 == 0) {
                              break L18;
                            } else {
                              var13 = oo.field_j[param2];
                              var14 = oo.field_h[param2];
                              var15 = ((fc) this).field_C[var12] * var14 - ((fc) this).field_A[var12] * var13 + 32767 >> 16;
                              ((fc) this).field_A[var12] = ((fc) this).field_C[var12] * var13 + ((fc) this).field_A[var12] * var14 + 32767 >> 16;
                              ((fc) this).field_C[var12] = var15;
                              break L18;
                            }
                          }
                          L19: {
                            if (param3 == 0) {
                              break L19;
                            } else {
                              var13 = oo.field_j[param3];
                              var14 = oo.field_h[param3];
                              var15 = ((fc) this).field_A[var12] * var13 + ((fc) this).field_k[var12] * var14 + 32767 >> 16;
                              ((fc) this).field_A[var12] = ((fc) this).field_A[var12] * var14 - ((fc) this).field_k[var12] * var13 + 32767 >> 16;
                              ((fc) this).field_k[var12] = var15;
                              break L19;
                            }
                          }
                          ((fc) this).field_k[var12] = ((fc) this).field_k[var12] + field_kb;
                          ((fc) this).field_C[var12] = ((fc) this).field_C[var12] + field_ib;
                          ((fc) this).field_A[var12] = ((fc) this).field_A[var12] + field_x;
                          var11++;
                          continue L16;
                        }
                      }
                    }
                  }
                  var8++;
                  continue L14;
                }
              }
            }
          } else {
            var8 = 0;
            L20: while (true) {
              if (var8 >= var7) {
                return;
              } else {
                L21: {
                  var9 = param1[var8];
                  if (var9 >= ((fc) this).field_b.length) {
                    break L21;
                  } else {
                    var10 = ((fc) this).field_b[var9];
                    var11 = 0;
                    L22: while (true) {
                      if (var11 >= var10.length) {
                        break L21;
                      } else {
                        var12 = var10[var11];
                        ((fc) this).field_k[var12] = ((fc) this).field_k[var12] + param2;
                        ((fc) this).field_C[var12] = ((fc) this).field_C[var12] + param3;
                        ((fc) this).field_A[var12] = ((fc) this).field_A[var12] + param4;
                        var11++;
                        continue L22;
                      }
                    }
                  }
                }
                var8++;
                continue L20;
              }
            }
          }
        } else {
          var8 = 0;
          field_kb = 0;
          field_ib = 0;
          field_x = 0;
          var9 = 0;
          L23: while (true) {
            if (var9 >= var7) {
              L24: {
                if (var8 <= 0) {
                  field_kb = param2;
                  field_ib = param3;
                  field_x = param4;
                  break L24;
                } else {
                  field_kb = field_kb / var8 + param2;
                  field_ib = field_ib / var8 + param3;
                  field_x = field_x / var8 + param4;
                  break L24;
                }
              }
              return;
            } else {
              L25: {
                var10_int = param1[var9];
                if (var10_int >= ((fc) this).field_b.length) {
                  break L25;
                } else {
                  var11_ref_int__ = ((fc) this).field_b[var10_int];
                  var12 = 0;
                  L26: while (true) {
                    if (var12 >= var11_ref_int__.length) {
                      break L25;
                    } else {
                      var13 = var11_ref_int__[var12];
                      field_kb = field_kb + ((fc) this).field_k[var13];
                      field_ib = field_ib + ((fc) this).field_C[var13];
                      field_x = field_x + ((fc) this).field_A[var13];
                      var8++;
                      var12++;
                      continue L26;
                    }
                  }
                }
              }
              var9++;
              continue L23;
            }
          }
        }
    }

    final void b() {
        L0: {
          if (!((fc) this).field_I) {
            break L0;
          } else {
            this.c();
            ((fc) this).field_I = false;
            break L0;
          }
        }
        ((fc) this).field_K = false;
    }

    final void a(fc param0) {
        int var2 = 0;
        var2 = 0;
        L0: while (true) {
          if (var2 >= param0.field_w) {
            L1: {
              if (((fc) this).field_N == null) {
                break L1;
              } else {
                var2 = 0;
                L2: while (true) {
                  if (var2 >= param0.field_L) {
                    break L1;
                  } else {
                    ((fc) this).field_N[((fc) this).field_L] = param0.field_N[var2] + ((fc) this).field_T;
                    ((fc) this).field_D[((fc) this).field_L] = param0.field_D[var2] + ((fc) this).field_T;
                    ((fc) this).field_E[((fc) this).field_L] = param0.field_E[var2] + ((fc) this).field_T;
                    ((fc) this).field_L = ((fc) this).field_L + 1;
                    var2++;
                    continue L2;
                  }
                }
              }
            }
            var2 = 0;
            L3: while (true) {
              if (var2 >= param0.field_T) {
                ((fc) this).field_W = ((fc) this).field_T;
                return;
              } else {
                ((fc) this).field_k[((fc) this).field_T] = param0.field_k[var2];
                ((fc) this).field_C[((fc) this).field_T] = param0.field_C[var2];
                ((fc) this).field_A[((fc) this).field_T] = param0.field_A[var2];
                ((fc) this).field_T = ((fc) this).field_T + 1;
                var2++;
                continue L3;
              }
            }
          } else {
            L4: {
              ((fc) this).field_o[((fc) this).field_w] = param0.field_o[var2] + ((fc) this).field_T;
              ((fc) this).field_a[((fc) this).field_w] = param0.field_a[var2] + ((fc) this).field_T;
              ((fc) this).field_u[((fc) this).field_w] = param0.field_u[var2] + ((fc) this).field_T;
              ((fc) this).field_i[((fc) this).field_w] = param0.field_i[var2];
              ((fc) this).field_X[((fc) this).field_w] = param0.field_X[var2];
              ((fc) this).field_bb[((fc) this).field_w] = param0.field_bb[var2];
              ((fc) this).field_d[((fc) this).field_w] = param0.field_d[var2];
              if (((fc) this).field_H == null) {
                break L4;
              } else {
                if (param0.field_H == null) {
                  ((fc) this).field_H[((fc) this).field_w] = param0.field_M;
                  break L4;
                } else {
                  ((fc) this).field_H[((fc) this).field_w] = param0.field_H[var2];
                  break L4;
                }
              }
            }
            L5: {
              if (((fc) this).field_R == null) {
                break L5;
              } else {
                if (param0.field_R == null) {
                  break L5;
                } else {
                  ((fc) this).field_R[((fc) this).field_w] = param0.field_R[var2];
                  break L5;
                }
              }
            }
            L6: {
              if (((fc) this).field_F == null) {
                break L6;
              } else {
                if (param0.field_F == null) {
                  ((fc) this).field_F[((fc) this).field_w] = (short) -1;
                  break L6;
                } else {
                  ((fc) this).field_F[((fc) this).field_w] = param0.field_F[var2];
                  break L6;
                }
              }
            }
            L7: {
              if (((fc) this).field_eb == null) {
                break L7;
              } else {
                L8: {
                  if (param0.field_eb == null) {
                    break L8;
                  } else {
                    if (param0.field_eb[var2] == -1) {
                      break L8;
                    } else {
                      ((fc) this).field_eb[((fc) this).field_w] = (byte)(param0.field_eb[var2] + ((fc) this).field_L);
                      break L7;
                    }
                  }
                }
                ((fc) this).field_eb[((fc) this).field_w] = (byte) -1;
                break L7;
              }
            }
            ((fc) this).field_w = ((fc) this).field_w + 1;
            var2++;
            continue L0;
          }
        }
    }

    final boolean a() {
        if (((fc) this).field_b != null) {
          field_kb = 0;
          field_ib = 0;
          field_x = 0;
          return true;
        } else {
          return false;
        }
    }

    private final boolean a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        L0: {
          if (param1 >= param2) {
            break L0;
          } else {
            if (param1 >= param3) {
              break L0;
            } else {
              if (param1 >= param4) {
                break L0;
              } else {
                return false;
              }
            }
          }
        }
        L1: {
          if (param1 <= param2) {
            break L1;
          } else {
            if (param1 <= param3) {
              break L1;
            } else {
              if (param1 <= param4) {
                break L1;
              } else {
                return false;
              }
            }
          }
        }
        L2: {
          if (param0 >= param5) {
            break L2;
          } else {
            if (param0 >= param6) {
              break L2;
            } else {
              if (param0 >= param7) {
                break L2;
              } else {
                return false;
              }
            }
          }
        }
        L3: {
          if (param0 <= param5) {
            break L3;
          } else {
            if (param0 <= param6) {
              break L3;
            } else {
              if (param0 <= param7) {
                break L3;
              } else {
                return false;
              }
            }
          }
        }
        return true;
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
        L0: {
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
            ((fc) this).field_F = null;
            break L0;
          } else {
            ((fc) this).field_F = new short[((fc) this).field_w];
            var9 = 0;
            L1: while (true) {
              if (var9 >= ((fc) this).field_w) {
                break L0;
              } else {
                L2: {
                  L3: {
                    var10 = param0.field_N[var9];
                    if (var10 == -1) {
                      break L3;
                    } else {
                      if (!oo.field_o.d(-127, var10)) {
                        break L3;
                      } else {
                        ((fc) this).field_F[var9] = (short) var10;
                        break L2;
                      }
                    }
                  }
                  ((fc) this).field_F[var9] = (short) -1;
                  break L2;
                }
                var9++;
                continue L1;
              }
            }
          }
        }
        L4: {
          if (param0.field_L <= 0) {
            break L4;
          } else {
            if (param0.field_x == null) {
              break L4;
            } else {
              var9_ref_int__ = new int[param0.field_L];
              var10 = 0;
              L5: while (true) {
                if (var10 >= ((fc) this).field_w) {
                  ((fc) this).field_L = 0;
                  var10 = 0;
                  L6: while (true) {
                    if (var10 >= param0.field_L) {
                      ((fc) this).field_N = new int[((fc) this).field_L];
                      ((fc) this).field_D = new int[((fc) this).field_L];
                      ((fc) this).field_E = new int[((fc) this).field_L];
                      var10 = 0;
                      var11 = 0;
                      L7: while (true) {
                        if (var11 >= param0.field_L) {
                          ((fc) this).field_eb = new byte[((fc) this).field_w];
                          var11 = 0;
                          L8: while (true) {
                            if (var11 >= ((fc) this).field_w) {
                              break L4;
                            } else {
                              L9: {
                                if (param0.field_x[var11] == -1) {
                                  ((fc) this).field_eb[var11] = (byte) -1;
                                  break L9;
                                } else {
                                  ((fc) this).field_eb[var11] = (byte)var9_ref_int__[param0.field_x[var11] & 255];
                                  if (((fc) this).field_eb[var11] != -1) {
                                    break L9;
                                  } else {
                                    if (((fc) this).field_F == null) {
                                      break L9;
                                    } else {
                                      ((fc) this).field_F[var11] = (short) -1;
                                      break L9;
                                    }
                                  }
                                }
                              }
                              var11++;
                              continue L8;
                            }
                          }
                        } else {
                          L10: {
                            L11: {
                              if (var9_ref_int__[var11] <= 0) {
                                break L11;
                              } else {
                                if (param0.field_E[var11] != 0) {
                                  break L11;
                                } else {
                                  ((fc) this).field_N[var10] = param0.field_M[var11] & 65535;
                                  ((fc) this).field_D[var10] = param0.field_P[var11] & 65535;
                                  ((fc) this).field_E[var10] = param0.field_F[var11] & 65535;
                                  int incrementValue$1 = var10;
                                  var10++;
                                  var9_ref_int__[var11] = incrementValue$1;
                                  break L10;
                                }
                              }
                            }
                            var9_ref_int__[var11] = -1;
                            break L10;
                          }
                          var11++;
                          continue L7;
                        }
                      }
                    } else {
                      L12: {
                        if (var9_ref_int__[var10] <= 0) {
                          break L12;
                        } else {
                          if (param0.field_E[var10] != 0) {
                            break L12;
                          } else {
                            ((fc) this).field_L = ((fc) this).field_L + 1;
                            break L12;
                          }
                        }
                      }
                      var10++;
                      continue L6;
                    }
                  }
                } else {
                  L13: {
                    if (param0.field_x[var10] == -1) {
                      break L13;
                    } else {
                      var9_ref_int__[param0.field_x[var10] & 255] = var9_ref_int__[param0.field_x[var10] & 255] + 1;
                      break L13;
                    }
                  }
                  var10++;
                  continue L5;
                }
              }
            }
          }
        }
        var9 = 0;
        L14: while (true) {
          if (var9 >= ((fc) this).field_w) {
            return;
          } else {
            L15: {
              if (param0.field_g != null) {
                var10 = param0.field_g[var9];
                break L15;
              } else {
                var10 = 0;
                break L15;
              }
            }
            L16: {
              if (param0.field_o != null) {
                var11 = param0.field_o[var9];
                break L16;
              } else {
                var11 = 0;
                break L16;
              }
            }
            L17: {
              if (((fc) this).field_F != null) {
                var12 = ((fc) this).field_F[var9];
                break L17;
              } else {
                var12 = -1;
                break L17;
              }
            }
            L18: {
              if (var11 != -2) {
                break L18;
              } else {
                var10 = 3;
                break L18;
              }
            }
            L19: {
              if (var11 != -1) {
                break L19;
              } else {
                var10 = 2;
                break L19;
              }
            }
            L20: {
              if (var12 != -1) {
                if (var10 != 0) {
                  if (var10 != 1) {
                    ((fc) this).field_bb[var9] = -2;
                    break L20;
                  } else {
                    var13 = param0.field_j[var9];
                    var14 = param1 + (param3 * var13.field_a + param4 * var13.field_c + param5 * var13.field_d) / (var8 + var8 / 2);
                    ((fc) this).field_i[var9] = fc.b(var14);
                    ((fc) this).field_bb[var9] = -1;
                    break L20;
                  }
                } else {
                  L21: {
                    L22: {
                      if (param0.field_Q == null) {
                        break L22;
                      } else {
                        if (param0.field_Q[((fc) this).field_o[var9]] == null) {
                          break L22;
                        } else {
                          var13_ref = param0.field_Q[((fc) this).field_o[var9]];
                          break L21;
                        }
                      }
                    }
                    var13_ref = param0.field_B[((fc) this).field_o[var9]];
                    break L21;
                  }
                  L23: {
                    L24: {
                      var14 = param1 + (param3 * var13_ref.field_b + param4 * var13_ref.field_h + param5 * var13_ref.field_f) / (var8 * var13_ref.field_g);
                      ((fc) this).field_i[var9] = fc.b(var14);
                      if (param0.field_Q == null) {
                        break L24;
                      } else {
                        if (param0.field_Q[((fc) this).field_a[var9]] == null) {
                          break L24;
                        } else {
                          var13_ref = param0.field_Q[((fc) this).field_a[var9]];
                          break L23;
                        }
                      }
                    }
                    var13_ref = param0.field_B[((fc) this).field_a[var9]];
                    break L23;
                  }
                  L25: {
                    L26: {
                      var14 = param1 + (param3 * var13_ref.field_b + param4 * var13_ref.field_h + param5 * var13_ref.field_f) / (var8 * var13_ref.field_g);
                      ((fc) this).field_X[var9] = fc.b(var14);
                      if (param0.field_Q == null) {
                        break L26;
                      } else {
                        if (param0.field_Q[((fc) this).field_u[var9]] == null) {
                          break L26;
                        } else {
                          var13_ref = param0.field_Q[((fc) this).field_u[var9]];
                          break L25;
                        }
                      }
                    }
                    var13_ref = param0.field_B[((fc) this).field_u[var9]];
                    break L25;
                  }
                  var14 = param1 + (param3 * var13_ref.field_b + param4 * var13_ref.field_h + param5 * var13_ref.field_f) / (var8 * var13_ref.field_g);
                  ((fc) this).field_bb[var9] = fc.b(var14);
                  break L20;
                }
              } else {
                if (var10 != 0) {
                  if (var10 != 1) {
                    if (var10 != 3) {
                      ((fc) this).field_bb[var9] = -2;
                      break L20;
                    } else {
                      ((fc) this).field_i[var9] = 128;
                      ((fc) this).field_bb[var9] = -1;
                      break L20;
                    }
                  } else {
                    var13 = param0.field_j[var9];
                    var14 = param1 + (param3 * var13.field_a + param4 * var13.field_c + param5 * var13.field_d) / (var8 + var8 / 2) << 17;
                    ((fc) this).field_i[var9] = var14 | fc.a(param0.field_c[var9] & 65535, var14 >> 17);
                    ((fc) this).field_bb[var9] = -1;
                    break L20;
                  }
                } else {
                  L27: {
                    L28: {
                      var15 = param0.field_c[var9] & 65535;
                      if (param0.field_Q == null) {
                        break L28;
                      } else {
                        if (param0.field_Q[((fc) this).field_o[var9]] == null) {
                          break L28;
                        } else {
                          var13_ref = param0.field_Q[((fc) this).field_o[var9]];
                          break L27;
                        }
                      }
                    }
                    var13_ref = param0.field_B[((fc) this).field_o[var9]];
                    break L27;
                  }
                  L29: {
                    L30: {
                      var14 = param1 + (param3 * var13_ref.field_b + param4 * var13_ref.field_h + param5 * var13_ref.field_f) / (var8 * var13_ref.field_g) << 17;
                      ((fc) this).field_i[var9] = var14 | fc.a(var15, var14 >> 17);
                      if (param0.field_Q == null) {
                        break L30;
                      } else {
                        if (param0.field_Q[((fc) this).field_a[var9]] == null) {
                          break L30;
                        } else {
                          var13_ref = param0.field_Q[((fc) this).field_a[var9]];
                          break L29;
                        }
                      }
                    }
                    var13_ref = param0.field_B[((fc) this).field_a[var9]];
                    break L29;
                  }
                  L31: {
                    L32: {
                      var14 = param1 + (param3 * var13_ref.field_b + param4 * var13_ref.field_h + param5 * var13_ref.field_f) / (var8 * var13_ref.field_g) << 17;
                      ((fc) this).field_X[var9] = var14 | fc.a(var15, var14 >> 17);
                      if (param0.field_Q == null) {
                        break L32;
                      } else {
                        if (param0.field_Q[((fc) this).field_u[var9]] == null) {
                          break L32;
                        } else {
                          var13_ref = param0.field_Q[((fc) this).field_u[var9]];
                          break L31;
                        }
                      }
                    }
                    var13_ref = param0.field_B[((fc) this).field_u[var9]];
                    break L31;
                  }
                  var14 = param1 + (param3 * var13_ref.field_b + param4 * var13_ref.field_h + param5 * var13_ref.field_f) / (var8 * var13_ref.field_g) << 17;
                  ((fc) this).field_bb[var9] = var14 | fc.a(var15, var14 >> 17);
                  break L20;
                }
              }
            }
            var9++;
            continue L14;
          }
        }
    }

    fc(int param0, int param1, int param2, boolean param3, boolean param4, boolean param5, boolean param6, int param7, int param8) {
        L0: {
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
            break L0;
          } else {
            ((fc) this).field_H = new byte[param1];
            break L0;
          }
        }
        L1: {
          if (!param4) {
            break L1;
          } else {
            ((fc) this).field_R = new byte[param1];
            break L1;
          }
        }
        L2: {
          if (!param5) {
            break L2;
          } else {
            ((fc) this).field_F = new short[param1];
            break L2;
          }
        }
        L3: {
          if (!param6) {
            break L3;
          } else {
            ((fc) this).field_eb = new byte[param1];
            break L3;
          }
        }
        L4: {
          if (param2 <= 0) {
            break L4;
          } else {
            ((fc) this).field_N = new int[param2];
            ((fc) this).field_D = new int[param2];
            ((fc) this).field_E = new int[param2];
            break L4;
          }
        }
        ((fc) this).field_d = new short[param1];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        L0: {
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
            field_j = new int[1600];
            field_U = new int[1600][64];
            field_P = new int[32];
            field_y = new int[32][512];
            break L0;
          } else {
            field_jb = new int[4096];
            field_c = new int[4096];
            break L0;
          }
        }
    }
}
