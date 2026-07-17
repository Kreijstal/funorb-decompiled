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
        if (!((fc) this).field_K) {
            this.e();
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
                        if (((fc) this).field_g == null) {
                          break L1;
                        } else {
                          var10 = 0;
                          L2: while (true) {
                            if (var10 >= var9) {
                              return;
                            } else {
                              var11 = param1[var10];
                              if (var11 < ((fc) this).field_g.length) {
                                var91 = ((fc) this).field_g[var11];
                                var13 = 0;
                                L3: while (true) {
                                  if (var13 >= var91.length) {
                                    ((fc) this).field_I = true;
                                    var10++;
                                    continue L2;
                                  } else {
                                    L4: {
                                      var14 = var91[var13];
                                      if (((fc) this).field_t == null) {
                                        break L4;
                                      } else {
                                        if ((param6 & ((fc) this).field_t[var14]) != 0) {
                                          break L4;
                                        } else {
                                          var13++;
                                          continue L3;
                                        }
                                      }
                                    }
                                    L5: {
                                      var15 = ((fc) this).field_d[var14] & 65535;
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
                                    ((fc) this).field_d[var14] = (short)(var16 << 10 | var17 << 7 | var18);
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
                      if (((fc) this).field_g == null) {
                        break L1;
                      } else {
                        L7: {
                          if (((fc) this).field_R == null) {
                            break L7;
                          } else {
                            var10 = 0;
                            L8: while (true) {
                              if (var10 >= var9) {
                                break L7;
                              } else {
                                var11 = param1[var10];
                                if (var11 < ((fc) this).field_g.length) {
                                  var90 = ((fc) this).field_g[var11];
                                  var13 = 0;
                                  L9: while (true) {
                                    if (var13 < var90.length) {
                                      L10: {
                                        var14 = var90[var13];
                                        if (((fc) this).field_t == null) {
                                          break L10;
                                        } else {
                                          if ((param6 & ((fc) this).field_t[var14]) != 0) {
                                            break L10;
                                          } else {
                                            var13++;
                                            continue L9;
                                          }
                                        }
                                      }
                                      L11: {
                                        var15 = (((fc) this).field_R[var14] & 255) + param2 * 8;
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
                                      ((fc) this).field_R[var14] = (byte)var15;
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
                        if (var11 < ((fc) this).field_b.length) {
                          var89 = ((fc) this).field_b[var11];
                          var13 = 0;
                          L13: while (true) {
                            if (var13 < var89.length) {
                              L14: {
                                var14 = var89[var13];
                                if (((fc) this).field_Y == null) {
                                  break L14;
                                } else {
                                  if ((param6 & ((fc) this).field_Y[var14]) != 0) {
                                    break L14;
                                  } else {
                                    var13++;
                                    continue L13;
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
                      if (!field_n) {
                        break L15;
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
                        break L15;
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
                            if (var34 < ((fc) this).field_b.length) {
                              var87 = ((fc) this).field_b[var34];
                              var36 = 0;
                              L18: while (true) {
                                if (var36 < var87.length) {
                                  L19: {
                                    var37 = var87[var36];
                                    if (((fc) this).field_Y == null) {
                                      break L19;
                                    } else {
                                      if ((param6 & ((fc) this).field_Y[var37]) != 0) {
                                        break L19;
                                      } else {
                                        var36++;
                                        continue L18;
                                      }
                                    }
                                  }
                                  var38 = var88[0] * ((fc) this).field_k[var37] + var88[1] * ((fc) this).field_C[var37] + var88[2] * ((fc) this).field_A[var37] + 16384 >> 15;
                                  var39 = var88[3] * ((fc) this).field_k[var37] + var88[4] * ((fc) this).field_C[var37] + var88[5] * ((fc) this).field_A[var37] + 16384 >> 15;
                                  var40 = var88[6] * ((fc) this).field_k[var37] + var88[7] * ((fc) this).field_C[var37] + var88[8] * ((fc) this).field_A[var37] + 16384 >> 15;
                                  var38 = var38 + var30;
                                  var39 = var39 + var31;
                                  var40 = var40 + var32;
                                  ((fc) this).field_k[var37] = var38;
                                  ((fc) this).field_C[var37] = var39;
                                  ((fc) this).field_A[var37] = var40;
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
                      if (var11 < ((fc) this).field_b.length) {
                        var86 = ((fc) this).field_b[var11];
                        var13 = 0;
                        L23: while (true) {
                          if (var13 < var86.length) {
                            L24: {
                              var14 = var86[var13];
                              if (((fc) this).field_Y == null) {
                                break L24;
                              } else {
                                if ((param6 & ((fc) this).field_Y[var14]) != 0) {
                                  break L24;
                                } else {
                                  var13++;
                                  continue L23;
                                }
                              }
                            }
                            L25: {
                              ((fc) this).field_k[var14] = ((fc) this).field_k[var14] - field_kb;
                              ((fc) this).field_C[var14] = ((fc) this).field_C[var14] - field_ib;
                              ((fc) this).field_A[var14] = ((fc) this).field_A[var14] - field_x;
                              if (param4 == 0) {
                                break L25;
                              } else {
                                var15 = oo.field_j[param4];
                                var16 = oo.field_h[param4];
                                var17 = ((fc) this).field_C[var14] * var15 + ((fc) this).field_k[var14] * var16 + 32767 >> 16;
                                ((fc) this).field_C[var14] = ((fc) this).field_C[var14] * var16 - ((fc) this).field_k[var14] * var15 + 32767 >> 16;
                                ((fc) this).field_k[var14] = var17;
                                break L25;
                              }
                            }
                            L26: {
                              if (param2 == 0) {
                                break L26;
                              } else {
                                var15 = oo.field_j[param2];
                                var16 = oo.field_h[param2];
                                var17 = ((fc) this).field_C[var14] * var16 - ((fc) this).field_A[var14] * var15 + 32767 >> 16;
                                ((fc) this).field_A[var14] = ((fc) this).field_C[var14] * var15 + ((fc) this).field_A[var14] * var16 + 32767 >> 16;
                                ((fc) this).field_C[var14] = var17;
                                break L26;
                              }
                            }
                            L27: {
                              if (param3 == 0) {
                                break L27;
                              } else {
                                var15 = oo.field_j[param3];
                                var16 = oo.field_h[param3];
                                var17 = ((fc) this).field_A[var14] * var15 + ((fc) this).field_k[var14] * var16 + 32767 >> 16;
                                ((fc) this).field_A[var14] = ((fc) this).field_A[var14] * var16 - ((fc) this).field_k[var14] * var15 + 32767 >> 16;
                                ((fc) this).field_k[var14] = var17;
                                break L27;
                              }
                            }
                            ((fc) this).field_k[var14] = ((fc) this).field_k[var14] + field_kb;
                            ((fc) this).field_C[var14] = ((fc) this).field_C[var14] + field_ib;
                            ((fc) this).field_A[var14] = ((fc) this).field_A[var14] + field_x;
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
                    if (!field_n) {
                      break L28;
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
                      break L28;
                    }
                  }
                  var83 = new int[9];
                  var72 = var83;
                  var61 = var72;
                  var50 = var61;
                  var16_ref_int__ = var50;
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
                  var25_int = var83[0] * -field_kb + var83[1] * -field_ib + var83[2] * -field_x + 16384 >> 15;
                  var26 = var83[3] * -field_kb + var83[4] * -field_ib + var83[5] * -field_x + 16384 >> 15;
                  var27 = var83[6] * -field_kb + var83[7] * -field_ib + var83[8] * -field_x + 16384 >> 15;
                  var28 = var25_int + field_kb;
                  var29_int = var26 + field_ib;
                  var30 = var27 + field_x;
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
                              if (var40 < ((fc) this).field_b.length) {
                                var84 = ((fc) this).field_b[var40];
                                var42 = 0;
                                L32: while (true) {
                                  if (var42 < var84.length) {
                                    L33: {
                                      var43 = var84[var42];
                                      if (((fc) this).field_Y == null) {
                                        break L33;
                                      } else {
                                        if ((param6 & ((fc) this).field_Y[var43]) != 0) {
                                          break L33;
                                        } else {
                                          var42++;
                                          continue L32;
                                        }
                                      }
                                    }
                                    var44 = var85[0] * ((fc) this).field_k[var43] + var85[1] * ((fc) this).field_C[var43] + var85[2] * ((fc) this).field_A[var43] + 16384 >> 15;
                                    var45 = var85[3] * ((fc) this).field_k[var43] + var85[4] * ((fc) this).field_C[var43] + var85[5] * ((fc) this).field_A[var43] + 16384 >> 15;
                                    var46 = var85[6] * ((fc) this).field_k[var43] + var85[7] * ((fc) this).field_C[var43] + var85[8] * ((fc) this).field_A[var43] + 16384 >> 15;
                                    var44 = var44 + var36;
                                    var45 = var45 + var37;
                                    var46 = var46 + var38;
                                    ((fc) this).field_k[var43] = var44;
                                    ((fc) this).field_C[var43] = var45;
                                    ((fc) this).field_A[var43] = var46;
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
                if (var11 < ((fc) this).field_b.length) {
                  var82 = ((fc) this).field_b[var11];
                  var13 = 0;
                  L40: while (true) {
                    if (var13 < var82.length) {
                      L41: {
                        var14 = var82[var13];
                        if (((fc) this).field_Y == null) {
                          break L41;
                        } else {
                          if ((param6 & ((fc) this).field_Y[var14]) != 0) {
                            break L41;
                          } else {
                            var13++;
                            continue L40;
                          }
                        }
                      }
                      ((fc) this).field_k[var14] = ((fc) this).field_k[var14] + param2;
                      ((fc) this).field_C[var14] = ((fc) this).field_C[var14] + param3;
                      ((fc) this).field_A[var14] = ((fc) this).field_A[var14] + param4;
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
          field_kb = 0;
          field_ib = 0;
          field_x = 0;
          var11 = 0;
          L42: while (true) {
            if (var11 >= var9) {
              L43: {
                if (var10 <= 0) {
                  field_kb = param2;
                  field_ib = param3;
                  field_x = param4;
                  break L43;
                } else {
                  field_kb = field_kb / var10 + param2;
                  field_ib = field_ib / var10 + param3;
                  field_x = field_x / var10 + param4;
                  field_n = true;
                  break L43;
                }
              }
              return;
            } else {
              var12 = param1[var11];
              if (var12 < ((fc) this).field_b.length) {
                var81 = ((fc) this).field_b[var12];
                var14 = 0;
                L44: while (true) {
                  if (var14 < var81.length) {
                    L45: {
                      var15 = var81[var14];
                      if (((fc) this).field_Y == null) {
                        break L45;
                      } else {
                        if ((param6 & ((fc) this).field_Y[var15]) != 0) {
                          break L45;
                        } else {
                          var14++;
                          continue L44;
                        }
                      }
                    }
                    field_kb = field_kb + ((fc) this).field_k[var15];
                    field_ib = field_ib + ((fc) this).field_C[var15];
                    field_x = field_x + ((fc) this).field_A[var15];
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
          if (var4 >= ((fc) this).field_w) {
            return;
          } else {
            L1: {
              if (((fc) this).field_F == null) {
                stackOut_4_0 = -1;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = ((fc) this).field_F[var4];
                stackIn_5_0 = stackOut_3_0;
                break L1;
              }
            }
            var3 = stackIn_5_0;
            if (var3 == -1) {
              var1 = ((fc) this).field_d[var4] & 65535;
              if (((fc) this).field_bb[var4] != -1) {
                if (((fc) this).field_bb[var4] != -2) {
                  var2 = ((fc) this).field_i[var4] & -131072;
                  ((fc) this).field_i[var4] = var2 | fc.a(var1, var2 >> 17);
                  var2 = ((fc) this).field_X[var4] & -131072;
                  ((fc) this).field_X[var4] = var2 | fc.a(var1, var2 >> 17);
                  var2 = ((fc) this).field_bb[var4] & -131072;
                  ((fc) this).field_bb[var4] = var2 | fc.a(var1, var2 >> 17);
                  var4++;
                  continue L0;
                } else {
                  var4++;
                  continue L0;
                }
              } else {
                var2 = ((fc) this).field_i[var4] & -131072;
                ((fc) this).field_i[var4] = var2 | fc.a(var1, var2 >> 17);
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
                    if (var11 > oo.field_q) {
                      break L14;
                    } else {
                      if (var12 > oo.field_q) {
                        break L14;
                      } else {
                        if (var13 > oo.field_q) {
                          break L14;
                        } else {
                          if (field_O[3] < 0) {
                            break L14;
                          } else {
                            if (field_O[3] <= oo.field_q) {
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
            oo.field_m = true;
            break L13;
          }
          L15: {
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
                    break L15;
                  } else {
                    oo.a(var14, var15, var16, var11, var12, var13, ((fc) this).field_i[param0], ((fc) this).field_i[param0], ((fc) this).field_i[param0], field_S[var17], field_S[var18], field_S[var19], field_fb[var17], field_fb[var18], field_fb[var19], field_q[var17], field_q[var18], field_q[var19], var20);
                    oo.a(var14, var16, field_l[3], var11, var13, field_O[3], ((fc) this).field_i[param0], ((fc) this).field_i[param0], ((fc) this).field_i[param0], field_S[var17], field_S[var18], field_S[var19], field_fb[var17], field_fb[var18], field_fb[var19], field_q[var17], field_q[var18], field_q[var19], var20);
                    break L15;
                  }
                } else {
                  break L16;
                }
              }
            }
            if (((fc) this).field_bb[param0] != -1) {
              oo.a(var14, var15, var16, var11, var12, var13, field_J[0], field_J[1], field_J[2]);
              oo.a(var14, var16, field_l[3], var11, var13, field_O[3], field_J[0], field_J[2], field_J[3]);
              break L15;
            } else {
              var17 = oo.field_c[((fc) this).field_i[param0] & 65535];
              oo.a(var14, var15, var16, var11, var12, var13, var17);
              oo.a(var14, var16, field_l[3], var11, var13, field_O[3], var17);
              break L15;
            }
          }
          return;
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
          if (!param0) {
            if (field_h.length < ((fc) this).field_w) {
              field_h = new byte[((fc) this).field_w + 100];
              if (param1) {
                break L0;
              } else {
                if (field_m.length >= ((fc) this).field_w) {
                  break L0;
                } else {
                  field_hb = new int[((fc) this).field_w + 100];
                  field_f = new int[((fc) this).field_w + 100];
                  field_s = new int[((fc) this).field_w + 100];
                  field_m = new short[((fc) this).field_w + 100];
                  break L0;
                }
              }
            } else {
              if (param1) {
                break L0;
              } else {
                if (field_m.length >= ((fc) this).field_w) {
                  break L0;
                } else {
                  field_hb = new int[((fc) this).field_w + 100];
                  field_f = new int[((fc) this).field_w + 100];
                  field_s = new int[((fc) this).field_w + 100];
                  field_m = new short[((fc) this).field_w + 100];
                  break L0;
                }
              }
            }
          } else {
            if (param1) {
              break L0;
            } else {
              if (field_m.length >= ((fc) this).field_w) {
                break L0;
              } else {
                field_hb = new int[((fc) this).field_w + 100];
                field_f = new int[((fc) this).field_w + 100];
                field_s = new int[((fc) this).field_w + 100];
                field_m = new short[((fc) this).field_w + 100];
                break L0;
              }
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
                      if (((fc) this).field_L > 0) {
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
                  var18 = oo.field_l;
                  var19 = oo.field_e;
                  var20 = 0;
                  var27 = 0;
                  var21_int = var27;
                  L3: while (true) {
                    if (var27 >= ((fc) this).field_T) {
                      try {
                        L4: {
                          this.a((var20 & var16) != 0, false, 0L, (int) ((fc) this).field_db, ((fc) this).field_db << 1);
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
                        var22 = ((fc) this).field_k[var27];
                        var23 = ((fc) this).field_C[var27];
                        var24 = ((fc) this).field_A[var27];
                        var25 = var22 * var6 + var23 * var9 + var24 * var12 >> 16;
                        var26 = var22 * var7 + var23 * var10 + var24 * var13 >> 16;
                        var24 = var22 * var8 + var23 * var11 + var24 * var14 >> 16;
                        var22 = var25;
                        var23 = var26;
                        field_gb[var27] = var24;
                        var22 = var22 + var3;
                        var23 = var23 + var4;
                        var24 = var24 + var5;
                        if (var24 < 50) {
                          field_v[var27] = -5000;
                          var20 = 1;
                          break L6;
                        } else {
                          field_v[var27] = var18 + (var22 << 9) / var24;
                          field_cb[var27] = var19 + (var23 << 9) / var24;
                          break L6;
                        }
                      }
                      if (var17 != 0) {
                        field_S[var27] = var22;
                        field_fb[var27] = var23;
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
                this.a(stackIn_16_1 != 0, stackIn_16_2 != 0, param7, (int) ((fc) this).field_db, ((fc) this).field_db << 1);
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
                                var47 = field_U[var8];
                                var12 = 0;
                                L9: while (true) {
                                  if (var12 >= var10) {
                                    break L7;
                                  } else {
                                    var13 = var47[var12];
                                    var14_int = ((fc) this).field_H[var13];
                                    field_Q[var14_int] = field_Q[var14_int] + 1;
                                    var15_int = field_Q[var14_int];
                                    field_G[var14_int][var15_int] = var13;
                                    if (var14_int >= 10) {
                                      if (var14_int != 10) {
                                        field_z[var15_int] = var8;
                                        var12++;
                                        continue L9;
                                      } else {
                                        field_r[var15_int] = var8;
                                        var12++;
                                        continue L9;
                                      }
                                    } else {
                                      field_V[var14_int] = field_V[var14_int] + var8;
                                      var12++;
                                      continue L9;
                                    }
                                  }
                                }
                              }
                            }
                            if (var9 > 64) {
                              var10 = field_j[var8] - 65;
                              var48 = field_y[var10];
                              var12 = 0;
                              L10: while (true) {
                                if (var12 < field_P[var10]) {
                                  var13 = var48[var12];
                                  var14_int = ((fc) this).field_H[var13];
                                  field_Q[var14_int] = field_Q[var14_int] + 1;
                                  var15_int = field_Q[var14_int];
                                  field_G[var14_int][var15_int] = var13;
                                  if (var14_int >= 10) {
                                    if (var14_int != 10) {
                                      field_z[var15_int] = var8;
                                      var12++;
                                      continue L10;
                                    } else {
                                      field_r[var15_int] = var8;
                                      var12++;
                                      continue L10;
                                    }
                                  } else {
                                    field_V[var14_int] = field_V[var14_int] + var8;
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
                        field_Q[var8] = 0;
                        field_V[var8] = 0;
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
                                this.c(var45[var12]);
                                var12++;
                                continue L14;
                              }
                            }
                          }
                        }
                        if (var9 > 64) {
                          var10 = field_j[var8] - 65;
                          var46 = field_y[var10];
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
                  sf.a(field_jb, (byte) 17, var7 - 1, 0, field_c);
                  if (((fc) this).field_H != null) {
                    var8 = 0;
                    L16: while (true) {
                      if (var8 >= 12) {
                        var8 = 0;
                        L17: while (true) {
                          if (var8 >= var7) {
                            break L4;
                          } else {
                            var9 = field_c[var8];
                            var10 = field_jb[var8];
                            var11 = ((fc) this).field_H[var9];
                            field_Q[var11] = field_Q[var11] + 1;
                            var12 = field_Q[var11];
                            field_G[var11][var12] = var9;
                            if (var11 >= 10) {
                              if (var11 != 10) {
                                field_z[var12] = var10;
                                var8++;
                                continue L17;
                              } else {
                                field_r[var12] = var10;
                                var8++;
                                continue L17;
                              }
                            } else {
                              field_V[var11] = field_V[var11] + var10;
                              var8++;
                              continue L17;
                            }
                          }
                        }
                      } else {
                        field_Q[var8] = 0;
                        field_V[var8] = 0;
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
                        this.c(field_c[var8]);
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
                  if (field_Q[1] > 0) {
                    break L20;
                  } else {
                    if (field_Q[2] <= 0) {
                      break L19;
                    } else {
                      break L20;
                    }
                  }
                }
                var8 = (field_V[1] + field_V[2]) / (field_Q[1] + field_Q[2]);
                break L19;
              }
              L21: {
                L22: {
                  var9 = 0;
                  if (field_Q[3] > 0) {
                    break L22;
                  } else {
                    if (field_Q[4] <= 0) {
                      break L21;
                    } else {
                      break L22;
                    }
                  }
                }
                var9 = (field_V[3] + field_V[4]) / (field_Q[3] + field_Q[4]);
                break L21;
              }
              L23: {
                L24: {
                  var10 = 0;
                  if (field_Q[6] > 0) {
                    break L24;
                  } else {
                    if (field_Q[8] <= 0) {
                      break L23;
                    } else {
                      break L24;
                    }
                  }
                }
                var10 = (field_V[6] + field_V[8]) / (field_Q[6] + field_Q[8]);
                break L23;
              }
              L25: {
                var12 = 0;
                var13 = field_Q[10];
                var14 = field_G[10];
                var15 = field_r;
                if (var12 != var13) {
                  break L25;
                } else {
                  var12 = 0;
                  var13 = field_Q[11];
                  var14 = field_G[11];
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
                        int incrementValue$7 = var12;
                        var12++;
                        this.c(var14[incrementValue$7]);
                        if (var12 != var13) {
                          break L29;
                        } else {
                          if (var14 == field_G[11]) {
                            break L29;
                          } else {
                            var12 = 0;
                            var14 = field_G[11];
                            var13 = field_Q[11];
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
                            int incrementValue$8 = var12;
                            var12++;
                            this.c(var14[incrementValue$8]);
                            if (var12 != var13) {
                              break L32;
                            } else {
                              if (var14 == field_G[11]) {
                                break L32;
                              } else {
                                var12 = 0;
                                var13 = field_Q[11];
                                var14 = field_G[11];
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
                              int incrementValue$9 = var12;
                              var12++;
                              this.c(var14[incrementValue$9]);
                              if (var12 != var13) {
                                break L35;
                              } else {
                                if (var14 == field_G[11]) {
                                  break L35;
                                } else {
                                  var12 = 0;
                                  var13 = field_Q[11];
                                  var14 = field_G[11];
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
                                int incrementValue$10 = var12;
                                var12++;
                                this.c(var14[incrementValue$10]);
                                if (var12 != var13) {
                                  break L38;
                                } else {
                                  if (var14 == field_G[11]) {
                                    break L38;
                                  } else {
                                    var12 = 0;
                                    var13 = field_Q[11];
                                    var14 = field_G[11];
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
                        var17 = field_Q[var16];
                        var49 = field_G[var16];
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
              if (((fc) this).field_bb[var8] != -2) {
                L40: {
                  var9 = ((fc) this).field_o[var8];
                  var10 = ((fc) this).field_a[var8];
                  var11 = ((fc) this).field_u[var8];
                  var12 = field_v[var9];
                  var13 = field_v[var10];
                  var14_int = field_v[var11];
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
                    var15_int = field_S[var9];
                    var16 = field_S[var10];
                    var17 = field_S[var11];
                    var18 = field_fb[var9];
                    var19 = field_fb[var10];
                    var20 = field_fb[var11];
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
                      field_p[var8] = true;
                      if (!field_B) {
                        var27 = (field_gb[var9] + field_gb[var10] + field_gb[var11]) / 3 + param3;
                        if (field_j[var27] >= 64) {
                          L42: {
                            var28 = field_j[var27];
                            if (var28 != 64) {
                              break L42;
                            } else {
                              if (field_e != 512) {
                                field_e = field_e + 1;
                                var28 = 65 + field_e;
                                field_j[var27] = 65 + field_e;
                                break L42;
                              } else {
                                var8++;
                                continue L3;
                              }
                            }
                          }
                          var28 -= 65;
                          field_P[var28] = field_P[var28] + 1;
                          field_y[var28][field_P[var28]] = var8;
                          var8++;
                          continue L3;
                        } else {
                          field_j[var27] = field_j[var27] + 1;
                          field_U[var27][field_j[var27]] = var8;
                          var8++;
                          continue L3;
                        }
                      } else {
                        field_jb[var7] = (field_gb[var9] + field_gb[var10] + field_gb[var11]) / 3;
                        int incrementValue$11 = var7;
                        var7++;
                        field_c[incrementValue$11] = var8;
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
                    if (!this.a(bj.field_h + oo.field_l, fb.field_E + oo.field_e, field_cb[var9], field_cb[var10], field_cb[var11], var12, var13, var14_int)) {
                      break L43;
                    } else {
                      int fieldTemp$12 = ec.field_C;
                      ec.field_C = ec.field_C + 1;
                      un.field_Mb[fieldTemp$12] = param2;
                      param1 = false;
                      break L43;
                    }
                  }
                }
                if ((var12 - var13) * (field_cb[var11] - field_cb[var10]) - (field_cb[var9] - field_cb[var10]) * (var14_int - var13) > 0) {
                  L44: {
                    L45: {
                      field_p[var8] = false;
                      if (var12 < 0) {
                        break L45;
                      } else {
                        if (var13 < 0) {
                          break L45;
                        } else {
                          if (var14_int < 0) {
                            break L45;
                          } else {
                            if (var12 > oo.field_q) {
                              break L45;
                            } else {
                              if (var13 > oo.field_q) {
                                break L45;
                              } else {
                                if (var14_int <= oo.field_q) {
                                  field_Z[var8] = false;
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
                    field_Z[var8] = true;
                    break L44;
                  }
                  if (!field_B) {
                    var15_int = (field_gb[var9] + field_gb[var10] + field_gb[var11]) / 3 + param3;
                    if (field_j[var15_int] >= 64) {
                      L46: {
                        var16 = field_j[var15_int];
                        if (var16 != 64) {
                          break L46;
                        } else {
                          if (field_e != 512) {
                            field_e = field_e + 1;
                            var16 = 65 + field_e;
                            field_j[var15_int] = 65 + field_e;
                            break L46;
                          } else {
                            var8++;
                            continue L3;
                          }
                        }
                      }
                      var16 -= 65;
                      field_P[var16] = field_P[var16] + 1;
                      field_y[var16][field_P[var16]] = var8;
                      var8++;
                      continue L3;
                    } else {
                      field_j[var15_int] = field_j[var15_int] + 1;
                      field_U[var15_int][field_j[var15_int]] = var8;
                      var8++;
                      continue L3;
                    }
                  } else {
                    field_jb[var7] = (field_gb[var9] + field_gb[var10] + field_gb[var11]) / 3;
                    int incrementValue$13 = var7;
                    var7++;
                    field_c[incrementValue$13] = var8;
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
                      if (((fc) this).field_g == null) {
                        break L0;
                      } else {
                        var8 = 0;
                        L1: while (true) {
                          if (var8 >= var7) {
                            return;
                          } else {
                            var9 = param1[var8];
                            if (var9 < ((fc) this).field_g.length) {
                              var40 = ((fc) this).field_g[var9];
                              var11 = 0;
                              L2: while (true) {
                                if (var11 >= var40.length) {
                                  ((fc) this).field_I = true;
                                  var8++;
                                  continue L1;
                                } else {
                                  L3: {
                                    var12 = var40[var11];
                                    var13 = ((fc) this).field_d[var12] & 65535;
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
                                  ((fc) this).field_d[var12] = (short)(var14 << 10 | var15 << 7 | var16);
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
                    if (((fc) this).field_g == null) {
                      break L0;
                    } else {
                      L5: {
                        if (((fc) this).field_R == null) {
                          break L5;
                        } else {
                          var8 = 0;
                          L6: while (true) {
                            if (var8 >= var7) {
                              break L5;
                            } else {
                              var9 = param1[var8];
                              if (var9 < ((fc) this).field_g.length) {
                                var39 = ((fc) this).field_g[var9];
                                var11 = 0;
                                L7: while (true) {
                                  if (var11 < var39.length) {
                                    L8: {
                                      var12 = var39[var11];
                                      var13 = (((fc) this).field_R[var12] & 255) + param2 * 8;
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
                                    ((fc) this).field_R[var12] = (byte)var13;
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
                    if (var9 < ((fc) this).field_b.length) {
                      var38 = ((fc) this).field_b[var9];
                      var11 = 0;
                      L10: while (true) {
                        if (var11 < var38.length) {
                          var12 = var38[var11];
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
                  if (var9 < ((fc) this).field_b.length) {
                    var37 = ((fc) this).field_b[var9];
                    var11 = 0;
                    L12: while (true) {
                      if (var11 < var37.length) {
                        L13: {
                          var12 = var37[var11];
                          ((fc) this).field_k[var12] = ((fc) this).field_k[var12] - field_kb;
                          ((fc) this).field_C[var12] = ((fc) this).field_C[var12] - field_ib;
                          ((fc) this).field_A[var12] = ((fc) this).field_A[var12] - field_x;
                          if (param4 == 0) {
                            break L13;
                          } else {
                            var13 = oo.field_j[param4];
                            var14 = oo.field_h[param4];
                            var15 = ((fc) this).field_C[var12] * var13 + ((fc) this).field_k[var12] * var14 + 32767 >> 16;
                            ((fc) this).field_C[var12] = ((fc) this).field_C[var12] * var14 - ((fc) this).field_k[var12] * var13 + 32767 >> 16;
                            ((fc) this).field_k[var12] = var15;
                            break L13;
                          }
                        }
                        L14: {
                          if (param2 == 0) {
                            break L14;
                          } else {
                            var13 = oo.field_j[param2];
                            var14 = oo.field_h[param2];
                            var15 = ((fc) this).field_C[var12] * var14 - ((fc) this).field_A[var12] * var13 + 32767 >> 16;
                            ((fc) this).field_A[var12] = ((fc) this).field_C[var12] * var13 + ((fc) this).field_A[var12] * var14 + 32767 >> 16;
                            ((fc) this).field_C[var12] = var15;
                            break L14;
                          }
                        }
                        L15: {
                          if (param3 == 0) {
                            break L15;
                          } else {
                            var13 = oo.field_j[param3];
                            var14 = oo.field_h[param3];
                            var15 = ((fc) this).field_A[var12] * var13 + ((fc) this).field_k[var12] * var14 + 32767 >> 16;
                            ((fc) this).field_A[var12] = ((fc) this).field_A[var12] * var14 - ((fc) this).field_k[var12] * var13 + 32767 >> 16;
                            ((fc) this).field_k[var12] = var15;
                            break L15;
                          }
                        }
                        ((fc) this).field_k[var12] = ((fc) this).field_k[var12] + field_kb;
                        ((fc) this).field_C[var12] = ((fc) this).field_C[var12] + field_ib;
                        ((fc) this).field_A[var12] = ((fc) this).field_A[var12] + field_x;
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
                if (var9 < ((fc) this).field_b.length) {
                  var36 = ((fc) this).field_b[var9];
                  var11 = 0;
                  L17: while (true) {
                    if (var11 < var36.length) {
                      var12 = var36[var11];
                      ((fc) this).field_k[var12] = ((fc) this).field_k[var12] + param2;
                      ((fc) this).field_C[var12] = ((fc) this).field_C[var12] + param3;
                      ((fc) this).field_A[var12] = ((fc) this).field_A[var12] + param4;
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
          field_kb = 0;
          field_ib = 0;
          field_x = 0;
          var9 = 0;
          L18: while (true) {
            if (var9 >= var7) {
              L19: {
                if (var8 <= 0) {
                  field_kb = param2;
                  field_ib = param3;
                  field_x = param4;
                  break L19;
                } else {
                  field_kb = field_kb / var8 + param2;
                  field_ib = field_ib / var8 + param3;
                  field_x = field_x / var8 + param4;
                  break L19;
                }
              }
              return;
            } else {
              var10 = param1[var9];
              if (var10 < ((fc) this).field_b.length) {
                var35 = ((fc) this).field_b[var10];
                var12 = 0;
                L20: while (true) {
                  if (var12 < var35.length) {
                    var13 = var35[var12];
                    field_kb = field_kb + ((fc) this).field_k[var13];
                    field_ib = field_ib + ((fc) this).field_C[var13];
                    field_x = field_x + ((fc) this).field_A[var13];
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

    final void b() {
        if (((fc) this).field_I) {
            this.c();
            ((fc) this).field_I = false;
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
                if (((fc) this).field_R == null) {
                  break L4;
                } else {
                  if (param0.field_R == null) {
                    break L4;
                  } else {
                    ((fc) this).field_R[((fc) this).field_w] = param0.field_R[var2];
                    break L4;
                  }
                }
              } else {
                if (((fc) this).field_R == null) {
                  break L4;
                } else {
                  if (param0.field_R == null) {
                    break L4;
                  } else {
                    ((fc) this).field_R[((fc) this).field_w] = param0.field_R[var2];
                    break L4;
                  }
                }
              }
            }
            L5: {
              if (((fc) this).field_F == null) {
                break L5;
              } else {
                if (param0.field_F == null) {
                  ((fc) this).field_F[((fc) this).field_w] = (short) -1;
                  break L5;
                } else {
                  ((fc) this).field_F[((fc) this).field_w] = param0.field_F[var2];
                  break L5;
                }
              }
            }
            L6: {
              if (((fc) this).field_eb == null) {
                break L6;
              } else {
                L7: {
                  if (param0.field_eb == null) {
                    break L7;
                  } else {
                    if (param0.field_eb[var2] == -1) {
                      break L7;
                    } else {
                      ((fc) this).field_eb[((fc) this).field_w] = (byte)(param0.field_eb[var2] + ((fc) this).field_L);
                      break L6;
                    }
                  }
                }
                ((fc) this).field_eb[((fc) this).field_w] = (byte) -1;
                break L6;
              }
            }
            ((fc) this).field_w = ((fc) this).field_w + 1;
            var2++;
            continue L0;
          }
        }
    }

    final boolean a() {
        if (((fc) this).field_b == null) {
            return false;
        }
        field_kb = 0;
        field_ib = 0;
        field_x = 0;
        return true;
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
          if (var9 >= ((fc) this).field_W) {
            ((fc) this).field_lb = (short)(int)(Math.sqrt((double)var7) + 0.99);
            ((fc) this).field_db = (short)(int)(Math.sqrt((double)var8) + 0.99);
            ((fc) this).field_K = true;
            return;
          } else {
            L1: {
              var10 = ((fc) this).field_k[var9];
              var11 = ((fc) this).field_C[var9];
              var12 = ((fc) this).field_A[var9];
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
        sg var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        g var18 = null;
        g var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
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
                  var10 = param0.field_N[var9];
                  if (var10 == -1) {
                    break L2;
                  } else {
                    if (!oo.field_o.d(-127, var10)) {
                      break L2;
                    } else {
                      ((fc) this).field_F[var9] = (short)var10;
                      var9++;
                      continue L1;
                    }
                  }
                }
                ((fc) this).field_F[var9] = (short) -1;
                var9++;
                continue L1;
              }
            }
          }
        }
        L3: {
          if (param0.field_L <= 0) {
            break L3;
          } else {
            if (param0.field_x == null) {
              break L3;
            } else {
              var22 = new int[param0.field_L];
              var21 = var22;
              var20 = var21;
              var17 = var20;
              var9_ref_int__ = var17;
              var10 = 0;
              L4: while (true) {
                if (var10 >= ((fc) this).field_w) {
                  ((fc) this).field_L = 0;
                  var10 = 0;
                  L5: while (true) {
                    if (var10 >= param0.field_L) {
                      ((fc) this).field_N = new int[((fc) this).field_L];
                      ((fc) this).field_D = new int[((fc) this).field_L];
                      ((fc) this).field_E = new int[((fc) this).field_L];
                      var10 = 0;
                      var11 = 0;
                      L6: while (true) {
                        if (var11 >= param0.field_L) {
                          ((fc) this).field_eb = new byte[((fc) this).field_w];
                          var11 = 0;
                          L7: while (true) {
                            if (var11 >= ((fc) this).field_w) {
                              break L3;
                            } else {
                              if (param0.field_x[var11] == -1) {
                                ((fc) this).field_eb[var11] = (byte) -1;
                                var11++;
                                continue L7;
                              } else {
                                ((fc) this).field_eb[var11] = (byte)var9_ref_int__[param0.field_x[var11] & 255];
                                if (((fc) this).field_eb[var11] == -1) {
                                  if (((fc) this).field_F != null) {
                                    ((fc) this).field_F[var11] = (short) -1;
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
                              if (param0.field_E[var11] != 0) {
                                break L8;
                              } else {
                                ((fc) this).field_N[var10] = param0.field_M[var11] & 65535;
                                ((fc) this).field_D[var10] = param0.field_P[var11] & 65535;
                                ((fc) this).field_E[var10] = param0.field_F[var11] & 65535;
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
                        if (param0.field_E[var10] == 0) {
                          ((fc) this).field_L = ((fc) this).field_L + 1;
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
                  if (param0.field_x[var10] != -1) {
                    var9_ref_int__[param0.field_x[var10] & 255] = var9_ref_int__[param0.field_x[var10] & 255] + 1;
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
          if (var16 >= ((fc) this).field_w) {
            return;
          } else {
            L10: {
              if (param0.field_g != null) {
                var10 = param0.field_g[var16];
                break L10;
              } else {
                var10 = 0;
                break L10;
              }
            }
            L11: {
              if (param0.field_o != null) {
                var11 = param0.field_o[var16];
                break L11;
              } else {
                var11 = 0;
                break L11;
              }
            }
            L12: {
              if (((fc) this).field_F != null) {
                var12 = ((fc) this).field_F[var16];
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
                  ((fc) this).field_bb[var16] = -2;
                  var16++;
                  continue L9;
                } else {
                  var19 = param0.field_j[var16];
                  var14 = param1 + (param3 * var19.field_a + param4 * var19.field_c + param5 * var19.field_d) / (var8 + var8 / 2);
                  ((fc) this).field_i[var16] = fc.b(var14);
                  ((fc) this).field_bb[var16] = -1;
                  var16++;
                  continue L9;
                }
              } else {
                L15: {
                  L16: {
                    if (param0.field_Q == null) {
                      break L16;
                    } else {
                      if (param0.field_Q[((fc) this).field_o[var16]] == null) {
                        break L16;
                      } else {
                        var13 = param0.field_Q[((fc) this).field_o[var16]];
                        break L15;
                      }
                    }
                  }
                  var13 = param0.field_B[((fc) this).field_o[var16]];
                  break L15;
                }
                L17: {
                  L18: {
                    var14 = param1 + (param3 * var13.field_b + param4 * var13.field_h + param5 * var13.field_f) / (var8 * var13.field_g);
                    ((fc) this).field_i[var16] = fc.b(var14);
                    if (param0.field_Q == null) {
                      break L18;
                    } else {
                      if (param0.field_Q[((fc) this).field_a[var16]] == null) {
                        break L18;
                      } else {
                        var13 = param0.field_Q[((fc) this).field_a[var16]];
                        break L17;
                      }
                    }
                  }
                  var13 = param0.field_B[((fc) this).field_a[var16]];
                  break L17;
                }
                L19: {
                  L20: {
                    var14 = param1 + (param3 * var13.field_b + param4 * var13.field_h + param5 * var13.field_f) / (var8 * var13.field_g);
                    ((fc) this).field_X[var16] = fc.b(var14);
                    if (param0.field_Q == null) {
                      break L20;
                    } else {
                      if (param0.field_Q[((fc) this).field_u[var16]] == null) {
                        break L20;
                      } else {
                        var13 = param0.field_Q[((fc) this).field_u[var16]];
                        break L19;
                      }
                    }
                  }
                  var13 = param0.field_B[((fc) this).field_u[var16]];
                  break L19;
                }
                var14 = param1 + (param3 * var13.field_b + param4 * var13.field_h + param5 * var13.field_f) / (var8 * var13.field_g);
                ((fc) this).field_bb[var16] = fc.b(var14);
                var16++;
                continue L9;
              }
            } else {
              if (var10 != 0) {
                if (var10 != 1) {
                  if (var10 != 3) {
                    ((fc) this).field_bb[var16] = -2;
                    var16++;
                    continue L9;
                  } else {
                    ((fc) this).field_i[var16] = 128;
                    ((fc) this).field_bb[var16] = -1;
                    var16++;
                    continue L9;
                  }
                } else {
                  var18 = param0.field_j[var16];
                  var14 = param1 + (param3 * var18.field_a + param4 * var18.field_c + param5 * var18.field_d) / (var8 + var8 / 2) << 17;
                  ((fc) this).field_i[var16] = var14 | fc.a(param0.field_c[var16] & 65535, var14 >> 17);
                  ((fc) this).field_bb[var16] = -1;
                  var16++;
                  continue L9;
                }
              } else {
                L21: {
                  L22: {
                    var15 = param0.field_c[var16] & 65535;
                    if (param0.field_Q == null) {
                      break L22;
                    } else {
                      if (param0.field_Q[((fc) this).field_o[var16]] == null) {
                        break L22;
                      } else {
                        var13 = param0.field_Q[((fc) this).field_o[var16]];
                        break L21;
                      }
                    }
                  }
                  var13 = param0.field_B[((fc) this).field_o[var16]];
                  break L21;
                }
                L23: {
                  L24: {
                    var14 = param1 + (param3 * var13.field_b + param4 * var13.field_h + param5 * var13.field_f) / (var8 * var13.field_g) << 17;
                    ((fc) this).field_i[var16] = var14 | fc.a(var15, var14 >> 17);
                    if (param0.field_Q == null) {
                      break L24;
                    } else {
                      if (param0.field_Q[((fc) this).field_a[var16]] == null) {
                        break L24;
                      } else {
                        var13 = param0.field_Q[((fc) this).field_a[var16]];
                        break L23;
                      }
                    }
                  }
                  var13 = param0.field_B[((fc) this).field_a[var16]];
                  break L23;
                }
                L25: {
                  L26: {
                    var14 = param1 + (param3 * var13.field_b + param4 * var13.field_h + param5 * var13.field_f) / (var8 * var13.field_g) << 17;
                    ((fc) this).field_X[var16] = var14 | fc.a(var15, var14 >> 17);
                    if (param0.field_Q == null) {
                      break L26;
                    } else {
                      if (param0.field_Q[((fc) this).field_u[var16]] == null) {
                        break L26;
                      } else {
                        var13 = param0.field_Q[((fc) this).field_u[var16]];
                        break L25;
                      }
                    }
                  }
                  var13 = param0.field_B[((fc) this).field_u[var16]];
                  break L25;
                }
                var14 = param1 + (param3 * var13.field_b + param4 * var13.field_h + param5 * var13.field_f) / (var8 * var13.field_g) << 17;
                ((fc) this).field_bb[var16] = var14 | fc.a(var15, var14 >> 17);
                var16++;
                continue L9;
              }
            }
          }
        }
    }

    fc(int param0, int param1, int param2, boolean param3, boolean param4, boolean param5, boolean param6, int param7, int param8) {
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
        if (param3) {
            ((fc) this).field_H = new byte[param1];
        }
        if (param4) {
            ((fc) this).field_R = new byte[param1];
        }
        if (param5) {
            ((fc) this).field_F = new short[param1];
        }
        if (param6) {
            ((fc) this).field_eb = new byte[param1];
        }
        if (param2 > 0) {
            ((fc) this).field_N = new int[param2];
            ((fc) this).field_D = new int[param2];
            ((fc) this).field_E = new int[param2];
        }
        ((fc) this).field_d = new short[param1];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_ab = new fc();
        field_hb = new int[1];
        field_s = new int[1];
        field_f = new int[1];
        field_m = new short[1];
        field_h = new byte[1];
        fc discarded$0 = new fc();
        fc discarded$1 = new fc();
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
        if (field_B) {
            field_jb = new int[4096];
            field_c = new int[4096];
        } else {
            field_j = new int[1600];
            field_U = new int[1600][64];
            field_P = new int[32];
            field_y = new int[32][512];
        }
    }
}
