/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qb extends ll {
    pg[] field_L;
    s[] field_n;
    int[] field_l;
    private byte[] field_m;
    s[] field_g;
    short[] field_q;
    private int[] field_Q;
    private byte[] field_D;
    private short field_U;
    private byte[] field_j;
    int field_z;
    int field_J;
    private short field_G;
    byte[] field_s;
    private int[] field_C;
    byte[] field_O;
    private short[] field_i;
    private static int[] field_H;
    short[] field_A;
    int[] field_x;
    int[] field_e;
    int field_t;
    private short field_F;
    private short[] field_E;
    int field_f;
    private short field_S;
    private short field_k;
    int[] field_o;
    short[] field_W;
    private static int field_u;
    private boolean field_T;
    int[] field_v;
    short[] field_p;
    int[] field_V;
    private byte[] field_r;
    short[] field_M;
    private short field_h;
    private int[][] field_R;
    byte[] field_B;
    byte[] field_w;
    private static int[] field_K;
    byte[] field_N;
    private short[] field_P;
    private int[][] field_y;
    private byte[] field_I;

    final static qb a(eh param0, String param1, String param2) {
        byte[] var3 = param0.a(param1, 100, param2);
        if (var3 == null) {
            return null;
        }
        return new qb(var3);
    }

    private final void b(byte[] param0) {
        int var2 = 0;
        int var3 = 0;
        jc var4 = null;
        jc var5 = null;
        jc var6 = null;
        jc var7 = null;
        jc var8 = null;
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
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        L0: {
          var2 = 0;
          var3 = 0;
          var4 = new jc(param0);
          var5 = new jc(param0);
          var6 = new jc(param0);
          var7 = new jc(param0);
          var8 = new jc(param0);
          var4.field_l = param0.length - 18;
          var9 = var4.c((byte) -96);
          var10 = var4.c((byte) -60);
          var11 = var4.g(11132);
          var12 = var4.g(11132);
          var13 = var4.g(11132);
          var14 = var4.g(11132);
          var15 = var4.g(11132);
          var16 = var4.g(11132);
          var17 = var4.c((byte) 123);
          var18 = var4.c((byte) -60);
          var19 = var4.c((byte) 115);
          var20 = var4.c((byte) -68);
          var21 = 0;
          var22 = var21;
          var21 = var21 + var9;
          var23 = var21;
          var21 = var21 + var10;
          var24 = var21;
          if (var13 != 255) {
            break L0;
          } else {
            var21 = var21 + var10;
            break L0;
          }
        }
        L1: {
          var25 = var21;
          if (var15 != 1) {
            break L1;
          } else {
            var21 = var21 + var10;
            break L1;
          }
        }
        L2: {
          var26 = var21;
          if (var12 != 1) {
            break L2;
          } else {
            var21 = var21 + var10;
            break L2;
          }
        }
        L3: {
          var27 = var21;
          if (var16 != 1) {
            break L3;
          } else {
            var21 = var21 + var9;
            break L3;
          }
        }
        L4: {
          var28 = var21;
          if (var14 != 1) {
            break L4;
          } else {
            var21 = var21 + var10;
            break L4;
          }
        }
        L5: {
          var29 = var21;
          var21 = var21 + var20;
          var30 = var21;
          var21 = var21 + var10 * 2;
          var31 = var21;
          var21 = var21 + var11 * 6;
          var32 = var21;
          var21 = var21 + var17;
          var33 = var21;
          var21 = var21 + var18;
          var34 = var21;
          var21 = var21 + var19;
          ((qb) this).field_t = var9;
          ((qb) this).field_J = var10;
          ((qb) this).field_f = var11;
          ((qb) this).field_x = new int[var9];
          ((qb) this).field_o = new int[var9];
          ((qb) this).field_l = new int[var9];
          ((qb) this).field_V = new int[var10];
          ((qb) this).field_v = new int[var10];
          ((qb) this).field_e = new int[var10];
          if (var11 <= 0) {
            break L5;
          } else {
            ((qb) this).field_N = new byte[var11];
            ((qb) this).field_M = new short[var11];
            ((qb) this).field_q = new short[var11];
            ((qb) this).field_A = new short[var11];
            break L5;
          }
        }
        L6: {
          if (var16 != 1) {
            break L6;
          } else {
            ((qb) this).field_C = new int[var9];
            break L6;
          }
        }
        L7: {
          if (var12 != 1) {
            break L7;
          } else {
            ((qb) this).field_s = new byte[var10];
            ((qb) this).field_B = new byte[var10];
            ((qb) this).field_p = new short[var10];
            break L7;
          }
        }
        L8: {
          if (var13 != 255) {
            break L8;
          } else {
            ((qb) this).field_O = new byte[var10];
            break L8;
          }
        }
        L9: {
          if (var14 != 1) {
            break L9;
          } else {
            ((qb) this).field_w = new byte[var10];
            break L9;
          }
        }
        L10: {
          if (var15 != 1) {
            break L10;
          } else {
            ((qb) this).field_Q = new int[var10];
            break L10;
          }
        }
        ((qb) this).field_W = new short[var10];
        var4.field_l = var22;
        var5.field_l = var32;
        var6.field_l = var33;
        var7.field_l = var34;
        var8.field_l = var27;
        var35 = 0;
        var36 = 0;
        var37 = 0;
        var38 = 0;
        L11: while (true) {
          if (var38 >= var9) {
            var4.field_l = var30;
            var5.field_l = var26;
            var6.field_l = var24;
            var7.field_l = var28;
            var8.field_l = var25;
            var38 = 0;
            L12: while (true) {
              if (var38 >= var10) {
                ((qb) this).field_z = -1;
                var4.field_l = var29;
                var5.field_l = var23;
                var38 = 0;
                var39 = 0;
                var40 = 0;
                var41 = 0;
                var42 = 0;
                L13: while (true) {
                  if (var42 >= var10) {
                    ((qb) this).field_z = ((qb) this).field_z + 1;
                    var4.field_l = var31;
                    var42 = 0;
                    L14: while (true) {
                      if (var42 >= var11) {
                        L15: {
                          if (((qb) this).field_B == null) {
                            break L15;
                          } else {
                            var42 = 0;
                            var45 = 0;
                            var43 = var45;
                            L16: while (true) {
                              if (var45 >= var10) {
                                if (var42 != 0) {
                                  break L15;
                                } else {
                                  ((qb) this).field_B = null;
                                  break L15;
                                }
                              } else {
                                var44 = ((qb) this).field_B[var45] & 255;
                                if (var44 != 255) {
                                  L17: {
                                    if ((((qb) this).field_M[var44] & 65535) != ((qb) this).field_V[var45]) {
                                      break L17;
                                    } else {
                                      if ((((qb) this).field_q[var44] & 65535) != ((qb) this).field_v[var45]) {
                                        break L17;
                                      } else {
                                        if ((((qb) this).field_A[var44] & 65535) != ((qb) this).field_e[var45]) {
                                          break L17;
                                        } else {
                                          ((qb) this).field_B[var45] = (byte)-1;
                                          var45++;
                                          continue L16;
                                        }
                                      }
                                    }
                                  }
                                  var42 = 1;
                                  var45++;
                                  continue L16;
                                } else {
                                  var45++;
                                  continue L16;
                                }
                              }
                            }
                          }
                        }
                        L18: {
                          if (var3 != 0) {
                            break L18;
                          } else {
                            ((qb) this).field_p = null;
                            break L18;
                          }
                        }
                        L19: {
                          if (var2 != 0) {
                            break L19;
                          } else {
                            ((qb) this).field_s = null;
                            break L19;
                          }
                        }
                        return;
                      } else {
                        ((qb) this).field_N[var42] = (byte) 0;
                        ((qb) this).field_M[var42] = (short)var4.c((byte) -52);
                        ((qb) this).field_q[var42] = (short)var4.c((byte) -63);
                        ((qb) this).field_A[var42] = (short)var4.c((byte) -114);
                        var42++;
                        continue L14;
                      }
                    }
                  } else {
                    L20: {
                      var43 = var5.g(11132);
                      if (var43 != 1) {
                        break L20;
                      } else {
                        L21: {
                          var38 = var4.d(111) + var41;
                          var41 = var38;
                          var39 = var4.d(123) + var41;
                          var41 = var39;
                          var40 = var4.d(49) + var41;
                          var41 = var40;
                          ((qb) this).field_V[var42] = var38;
                          ((qb) this).field_v[var42] = var39;
                          ((qb) this).field_e[var42] = var40;
                          if (var38 <= ((qb) this).field_z) {
                            break L21;
                          } else {
                            ((qb) this).field_z = var38;
                            break L21;
                          }
                        }
                        L22: {
                          if (var39 <= ((qb) this).field_z) {
                            break L22;
                          } else {
                            ((qb) this).field_z = var39;
                            break L22;
                          }
                        }
                        if (var40 <= ((qb) this).field_z) {
                          break L20;
                        } else {
                          ((qb) this).field_z = var40;
                          break L20;
                        }
                      }
                    }
                    L23: {
                      if (var43 != 2) {
                        break L23;
                      } else {
                        var39 = var40;
                        var40 = var4.d(52) + var41;
                        var41 = var40;
                        ((qb) this).field_V[var42] = var38;
                        ((qb) this).field_v[var42] = var39;
                        ((qb) this).field_e[var42] = var40;
                        if (var40 <= ((qb) this).field_z) {
                          break L23;
                        } else {
                          ((qb) this).field_z = var40;
                          break L23;
                        }
                      }
                    }
                    L24: {
                      if (var43 != 3) {
                        break L24;
                      } else {
                        var38 = var40;
                        var40 = var4.d(95) + var41;
                        var41 = var40;
                        ((qb) this).field_V[var42] = var38;
                        ((qb) this).field_v[var42] = var39;
                        ((qb) this).field_e[var42] = var40;
                        if (var40 <= ((qb) this).field_z) {
                          break L24;
                        } else {
                          ((qb) this).field_z = var40;
                          break L24;
                        }
                      }
                    }
                    if (var43 == 4) {
                      var44 = var38;
                      var38 = var39;
                      var39 = var44;
                      var40 = var4.d(72) + var41;
                      var41 = var40;
                      ((qb) this).field_V[var42] = var38;
                      ((qb) this).field_v[var42] = var39;
                      ((qb) this).field_e[var42] = var40;
                      if (var40 > ((qb) this).field_z) {
                        ((qb) this).field_z = var40;
                        var42++;
                        continue L13;
                      } else {
                        var42++;
                        continue L13;
                      }
                    } else {
                      var42++;
                      continue L13;
                    }
                  }
                }
              } else {
                L25: {
                  ((qb) this).field_W[var38] = (short)var4.c((byte) 55);
                  if (var12 != 1) {
                    break L25;
                  } else {
                    L26: {
                      var39 = var5.g(11132);
                      if ((var39 & 1) != 1) {
                        ((qb) this).field_s[var38] = (byte) 0;
                        break L26;
                      } else {
                        ((qb) this).field_s[var38] = (byte) 1;
                        var2 = 1;
                        break L26;
                      }
                    }
                    if ((var39 & 2) != 2) {
                      ((qb) this).field_B[var38] = (byte)-1;
                      ((qb) this).field_p[var38] = (short)-1;
                      break L25;
                    } else {
                      ((qb) this).field_B[var38] = (byte)(var39 >> 2);
                      ((qb) this).field_p[var38] = ((qb) this).field_W[var38];
                      ((qb) this).field_W[var38] = (short)127;
                      if (((qb) this).field_p[var38] == -1) {
                        break L25;
                      } else {
                        var3 = 1;
                        break L25;
                      }
                    }
                  }
                }
                L27: {
                  if (var13 != 255) {
                    break L27;
                  } else {
                    ((qb) this).field_O[var38] = var6.a((byte) -88);
                    break L27;
                  }
                }
                L28: {
                  if (var14 != 1) {
                    break L28;
                  } else {
                    ((qb) this).field_w[var38] = var7.a((byte) 121);
                    break L28;
                  }
                }
                if (var15 == 1) {
                  ((qb) this).field_Q[var38] = var8.g(11132);
                  var38++;
                  continue L12;
                } else {
                  var38++;
                  continue L12;
                }
              }
            }
          } else {
            L29: {
              var39 = var4.g(11132);
              var40 = 0;
              if ((var39 & 1) == 0) {
                break L29;
              } else {
                var40 = var5.d(103);
                break L29;
              }
            }
            L30: {
              var41 = 0;
              if ((var39 & 2) == 0) {
                break L30;
              } else {
                var41 = var6.d(56);
                break L30;
              }
            }
            L31: {
              var42 = 0;
              if ((var39 & 4) == 0) {
                break L31;
              } else {
                var42 = var7.d(61);
                break L31;
              }
            }
            ((qb) this).field_x[var38] = var35 + var40;
            ((qb) this).field_o[var38] = var36 + var41;
            ((qb) this).field_l[var38] = var37 + var42;
            var35 = ((qb) this).field_x[var38];
            var36 = ((qb) this).field_o[var38];
            var37 = ((qb) this).field_l[var38];
            if (var16 == 1) {
              ((qb) this).field_C[var38] = var8.g(11132);
              var38++;
              continue L11;
            } else {
              var38++;
              continue L11;
            }
          }
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        for (var4 = 0; var4 < ((qb) this).field_t; var4++) {
            ((qb) this).field_x[var4] = ((qb) this).field_x[var4] + param0;
            ((qb) this).field_o[var4] = ((qb) this).field_o[var4] + param1;
            ((qb) this).field_l[var4] = ((qb) this).field_l[var4] + param2;
        }
        this.c();
    }

    final void a() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int[] var6 = null;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        L0: {
          if (((qb) this).field_C == null) {
            break L0;
          } else {
            var9 = new int[256];
            var7 = var9;
            var5 = var7;
            var2 = 0;
            var3 = 0;
            L1: while (true) {
              if (var3 >= ((qb) this).field_t) {
                ((qb) this).field_y = new int[var2 + 1][];
                var3 = 0;
                L2: while (true) {
                  if (var3 > var2) {
                    var3 = 0;
                    L3: while (true) {
                      if (var3 >= ((qb) this).field_t) {
                        ((qb) this).field_C = null;
                        break L0;
                      } else {
                        var4 = ((qb) this).field_C[var3];
                        var5[var4] = var5[var4] + 1;
                        ((qb) this).field_y[var4][var5[var4]] = var3;
                        var3++;
                        continue L3;
                      }
                    }
                  } else {
                    ((qb) this).field_y[var3] = new int[var9[var3]];
                    var9[var3] = 0;
                    var3++;
                    continue L2;
                  }
                }
              } else {
                var4 = ((qb) this).field_C[var3];
                var5[var4] = var5[var4] + 1;
                if (var4 > var2) {
                  var2 = var4;
                  var3++;
                  continue L1;
                } else {
                  var3++;
                  continue L1;
                }
              }
            }
          }
        }
        L4: {
          if (((qb) this).field_Q == null) {
            break L4;
          } else {
            var10 = new int[256];
            var8 = var10;
            var6 = var8;
            var2 = 0;
            var3 = 0;
            L5: while (true) {
              if (var3 >= ((qb) this).field_J) {
                ((qb) this).field_R = new int[var2 + 1][];
                var3 = 0;
                L6: while (true) {
                  if (var3 > var2) {
                    var3 = 0;
                    L7: while (true) {
                      if (var3 >= ((qb) this).field_J) {
                        ((qb) this).field_Q = null;
                        break L4;
                      } else {
                        var4 = ((qb) this).field_Q[var3];
                        var6[var4] = var6[var4] + 1;
                        ((qb) this).field_R[var4][var6[var4]] = var3;
                        var3++;
                        continue L7;
                      }
                    }
                  } else {
                    ((qb) this).field_R[var3] = new int[var10[var3]];
                    var10[var3] = 0;
                    var3++;
                    continue L6;
                  }
                }
              } else {
                var4 = ((qb) this).field_Q[var3];
                var6[var4] = var6[var4] + 1;
                if (var4 > var2) {
                  var2 = var4;
                  var3++;
                  continue L5;
                } else {
                  var3++;
                  continue L5;
                }
              }
            }
          }
        }
    }

    private final void c() {
        ((qb) this).field_n = null;
        ((qb) this).field_g = null;
        ((qb) this).field_L = null;
        ((qb) this).field_T = false;
    }

    final void d() {
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
        int var14 = 0;
        int var15 = 0;
        pg var16 = null;
        s var17 = null;
        s var18 = null;
        s var19 = null;
        if (((qb) this).field_n == null) {
          ((qb) this).field_n = new s[((qb) this).field_z];
          var1 = 0;
          L0: while (true) {
            if (var1 >= ((qb) this).field_z) {
              var1 = 0;
              L1: while (true) {
                if (var1 >= ((qb) this).field_J) {
                  return;
                } else {
                  var2 = ((qb) this).field_V[var1];
                  var3 = ((qb) this).field_v[var1];
                  var4 = ((qb) this).field_e[var1];
                  var5 = ((qb) this).field_x[var3] - ((qb) this).field_x[var2];
                  var6 = ((qb) this).field_o[var3] - ((qb) this).field_o[var2];
                  var7 = ((qb) this).field_l[var3] - ((qb) this).field_l[var2];
                  var8 = ((qb) this).field_x[var4] - ((qb) this).field_x[var2];
                  var9 = ((qb) this).field_o[var4] - ((qb) this).field_o[var2];
                  var10 = ((qb) this).field_l[var4] - ((qb) this).field_l[var2];
                  var11 = var6 * var10 - var9 * var7;
                  var12 = var7 * var8 - var10 * var5;
                  var13 = var5 * var9 - var8 * var6;
                  L2: while (true) {
                    L3: {
                      if (var11 > 8192) {
                        break L3;
                      } else {
                        if (var12 > 8192) {
                          break L3;
                        } else {
                          if (var13 > 8192) {
                            break L3;
                          } else {
                            if (var11 < -8192) {
                              break L3;
                            } else {
                              if (var12 < -8192) {
                                break L3;
                              } else {
                                if (var13 >= -8192) {
                                  L4: {
                                    var14 = (int)Math.sqrt((double)(var11 * var11 + var12 * var12 + var13 * var13));
                                    if (var14 > 0) {
                                      break L4;
                                    } else {
                                      var14 = 1;
                                      break L4;
                                    }
                                  }
                                  L5: {
                                    var11 = var11 * 256 / var14;
                                    var12 = var12 * 256 / var14;
                                    var13 = var13 * 256 / var14;
                                    if (((qb) this).field_s != null) {
                                      var15 = ((qb) this).field_s[var1];
                                      break L5;
                                    } else {
                                      var15 = 0;
                                      break L5;
                                    }
                                  }
                                  if (var15 != 0) {
                                    if (var15 == 1) {
                                      L6: {
                                        if (((qb) this).field_L != null) {
                                          break L6;
                                        } else {
                                          ((qb) this).field_L = new pg[((qb) this).field_J];
                                          break L6;
                                        }
                                      }
                                      ((qb) this).field_L[var1] = new pg();
                                      var16 = new pg();
                                      var16.field_b = var11;
                                      var16.field_d = var12;
                                      var16.field_f = var13;
                                      var1++;
                                      continue L1;
                                    } else {
                                      var1++;
                                      continue L1;
                                    }
                                  } else {
                                    var17 = ((qb) this).field_n[var2];
                                    var17.field_j = var17.field_j + var11;
                                    var17.field_d = var17.field_d + var12;
                                    var17.field_i = var17.field_i + var13;
                                    var17.field_e = var17.field_e + 1;
                                    var18 = ((qb) this).field_n[var3];
                                    var18.field_j = var18.field_j + var11;
                                    var18.field_d = var18.field_d + var12;
                                    var18.field_i = var18.field_i + var13;
                                    var18.field_e = var18.field_e + 1;
                                    var19 = ((qb) this).field_n[var4];
                                    var19.field_j = var19.field_j + var11;
                                    var19.field_d = var19.field_d + var12;
                                    var19.field_i = var19.field_i + var13;
                                    var19.field_e = var19.field_e + 1;
                                    var1++;
                                    continue L1;
                                  }
                                } else {
                                  break L3;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    var11 = var11 >> 1;
                    var12 = var12 >> 1;
                    var13 = var13 >> 1;
                    continue L2;
                  }
                }
              }
            } else {
              ((qb) this).field_n[var1] = new s();
              var1++;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    private final void a(byte[] param0) {
        jc var2 = null;
        jc var3 = null;
        jc var4 = null;
        jc var5 = null;
        jc var6 = null;
        jc var7 = null;
        jc var8 = null;
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
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        int var46 = 0;
        int var47 = 0;
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        int var51 = 0;
        int var52 = 0;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        int var57 = 0;
        int var58 = 0;
        int var59 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          var2 = new jc(param0);
          var3 = new jc(param0);
          var4 = new jc(param0);
          var5 = new jc(param0);
          var6 = new jc(param0);
          var7 = new jc(param0);
          var8 = new jc(param0);
          var2.field_l = param0.length - 23;
          var9 = var2.c((byte) -106);
          var10 = var2.c((byte) -91);
          var11 = var2.g(11132);
          var12 = var2.g(11132);
          if ((var12 & 1) != 1) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var13 = stackIn_3_0;
          if ((var12 & 2) != 2) {
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = 1;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        L2: {
          var14 = stackIn_6_0;
          var15 = var2.g(11132);
          var16 = var2.g(11132);
          var17 = var2.g(11132);
          var18 = var2.g(11132);
          var19 = var2.g(11132);
          var20 = var2.c((byte) -104);
          var21 = var2.c((byte) 110);
          var22 = var2.c((byte) -98);
          var23 = var2.c((byte) 83);
          var24 = var2.c((byte) 108);
          var25 = 0;
          var26 = 0;
          var27 = 0;
          if (var11 <= 0) {
            break L2;
          } else {
            ((qb) this).field_N = new byte[var11];
            var2.field_l = 0;
            var28 = 0;
            L3: while (true) {
              if (var28 >= var11) {
                break L2;
              } else {
                L4: {
                  ((qb) this).field_N[var28] = var2.a((byte) 110);
                  var29 = var2.a((byte) 110);
                  if (var29 != 0) {
                    break L4;
                  } else {
                    var25++;
                    break L4;
                  }
                }
                L5: {
                  if (var29 < 1) {
                    break L5;
                  } else {
                    if (var29 > 3) {
                      break L5;
                    } else {
                      var26++;
                      break L5;
                    }
                  }
                }
                if (var29 == 2) {
                  var27++;
                  var28++;
                  continue L3;
                } else {
                  var28++;
                  continue L3;
                }
              }
            }
          }
        }
        L6: {
          var28 = var11;
          var29 = var28;
          var28 = var28 + var9;
          var30 = var28;
          if (var13 == 0) {
            break L6;
          } else {
            var28 = var28 + var10;
            break L6;
          }
        }
        L7: {
          var31 = var28;
          var28 = var28 + var10;
          var32 = var28;
          if (var15 != 255) {
            break L7;
          } else {
            var28 = var28 + var10;
            break L7;
          }
        }
        L8: {
          var33 = var28;
          if (var17 != 1) {
            break L8;
          } else {
            var28 = var28 + var10;
            break L8;
          }
        }
        L9: {
          var34 = var28;
          if (var19 != 1) {
            break L9;
          } else {
            var28 = var28 + var9;
            break L9;
          }
        }
        L10: {
          var35 = var28;
          if (var16 != 1) {
            break L10;
          } else {
            var28 = var28 + var10;
            break L10;
          }
        }
        L11: {
          var36 = var28;
          var28 = var28 + var23;
          var37 = var28;
          if (var18 != 1) {
            break L11;
          } else {
            var28 = var28 + var10 * 2;
            break L11;
          }
        }
        L12: {
          var38 = var28;
          var28 = var28 + var24;
          var39 = var28;
          var28 = var28 + var10 * 2;
          var40 = var28;
          var28 = var28 + var20;
          var41 = var28;
          var28 = var28 + var21;
          var42 = var28;
          var28 = var28 + var22;
          var43 = var28;
          var28 = var28 + var25 * 6;
          var44 = var28;
          var28 = var28 + var26 * 6;
          var45 = var28;
          var28 = var28 + var26 * 6;
          var46 = var28;
          var28 = var28 + var26;
          var47 = var28;
          var28 = var28 + var26;
          var48 = var28;
          var28 = var28 + (var26 + var27 * 2);
          var49 = var28;
          ((qb) this).field_t = var9;
          ((qb) this).field_J = var10;
          ((qb) this).field_f = var11;
          ((qb) this).field_x = new int[var9];
          ((qb) this).field_o = new int[var9];
          ((qb) this).field_l = new int[var9];
          ((qb) this).field_V = new int[var10];
          ((qb) this).field_v = new int[var10];
          ((qb) this).field_e = new int[var10];
          if (var19 != 1) {
            break L12;
          } else {
            ((qb) this).field_C = new int[var9];
            break L12;
          }
        }
        L13: {
          if (var13 == 0) {
            break L13;
          } else {
            ((qb) this).field_s = new byte[var10];
            break L13;
          }
        }
        L14: {
          if (var15 != 255) {
            break L14;
          } else {
            ((qb) this).field_O = new byte[var10];
            break L14;
          }
        }
        L15: {
          if (var16 != 1) {
            break L15;
          } else {
            ((qb) this).field_w = new byte[var10];
            break L15;
          }
        }
        L16: {
          if (var17 != 1) {
            break L16;
          } else {
            ((qb) this).field_Q = new int[var10];
            break L16;
          }
        }
        L17: {
          if (var18 != 1) {
            break L17;
          } else {
            ((qb) this).field_p = new short[var10];
            break L17;
          }
        }
        L18: {
          if (var18 != 1) {
            break L18;
          } else {
            if (var11 <= 0) {
              break L18;
            } else {
              ((qb) this).field_B = new byte[var10];
              break L18;
            }
          }
        }
        L19: {
          ((qb) this).field_W = new short[var10];
          if (var11 <= 0) {
            break L19;
          } else {
            L20: {
              ((qb) this).field_M = new short[var11];
              ((qb) this).field_q = new short[var11];
              ((qb) this).field_A = new short[var11];
              if (var26 <= 0) {
                break L20;
              } else {
                ((qb) this).field_E = new short[var26];
                ((qb) this).field_P = new short[var26];
                ((qb) this).field_i = new short[var26];
                ((qb) this).field_D = new byte[var26];
                ((qb) this).field_r = new byte[var26];
                ((qb) this).field_m = new byte[var26];
                break L20;
              }
            }
            if (var27 <= 0) {
              break L19;
            } else {
              ((qb) this).field_I = new byte[var27];
              ((qb) this).field_j = new byte[var27];
              break L19;
            }
          }
        }
        var2.field_l = var29;
        var3.field_l = var40;
        var4.field_l = var41;
        var5.field_l = var42;
        var6.field_l = var34;
        var50 = 0;
        var51 = 0;
        var52 = 0;
        var53 = 0;
        L21: while (true) {
          if (var53 >= var9) {
            var2.field_l = var39;
            var3.field_l = var30;
            var4.field_l = var32;
            var5.field_l = var35;
            var6.field_l = var33;
            var7.field_l = var37;
            var8.field_l = var38;
            var53 = 0;
            L22: while (true) {
              if (var53 >= var10) {
                ((qb) this).field_z = -1;
                var2.field_l = var36;
                var3.field_l = var31;
                var53 = 0;
                var54 = 0;
                var55 = 0;
                var56 = 0;
                var57 = 0;
                L23: while (true) {
                  if (var57 >= var10) {
                    ((qb) this).field_z = ((qb) this).field_z + 1;
                    var2.field_l = var43;
                    var3.field_l = var44;
                    var4.field_l = var45;
                    var5.field_l = var46;
                    var6.field_l = var47;
                    var7.field_l = var48;
                    var57 = 0;
                    L24: while (true) {
                      if (var57 >= var11) {
                        L25: {
                          if (var14 == 0) {
                            break L25;
                          } else {
                            L26: {
                              var2.field_l = var49;
                              var57 = var2.g(11132);
                              if (var57 <= 0) {
                                break L26;
                              } else {
                                var2.field_l = var2.field_l + 4 * var57;
                                break L26;
                              }
                            }
                            var58 = var2.g(11132);
                            if (var58 <= 0) {
                              break L25;
                            } else {
                              var2.field_l = var2.field_l + 4 * var58;
                              break L25;
                            }
                          }
                        }
                        return;
                      } else {
                        L27: {
                          var58 = ((qb) this).field_N[var57] & 255;
                          if (var58 != 0) {
                            break L27;
                          } else {
                            ((qb) this).field_M[var57] = (short)var2.c((byte) 34);
                            ((qb) this).field_q[var57] = (short)var2.c((byte) 78);
                            ((qb) this).field_A[var57] = (short)var2.c((byte) -81);
                            break L27;
                          }
                        }
                        L28: {
                          if (var58 != 1) {
                            break L28;
                          } else {
                            ((qb) this).field_M[var57] = (short)var3.c((byte) -103);
                            ((qb) this).field_q[var57] = (short)var3.c((byte) 97);
                            ((qb) this).field_A[var57] = (short)var3.c((byte) 112);
                            ((qb) this).field_E[var57] = (short)var4.c((byte) -70);
                            ((qb) this).field_P[var57] = (short)var4.c((byte) -89);
                            ((qb) this).field_i[var57] = (short)var4.c((byte) -58);
                            ((qb) this).field_D[var57] = var5.a((byte) -124);
                            ((qb) this).field_r[var57] = var6.a((byte) 50);
                            ((qb) this).field_m[var57] = var7.a((byte) -114);
                            break L28;
                          }
                        }
                        L29: {
                          if (var58 != 2) {
                            break L29;
                          } else {
                            ((qb) this).field_M[var57] = (short)var3.c((byte) -91);
                            ((qb) this).field_q[var57] = (short)var3.c((byte) 96);
                            ((qb) this).field_A[var57] = (short)var3.c((byte) -69);
                            ((qb) this).field_E[var57] = (short)var4.c((byte) -100);
                            ((qb) this).field_P[var57] = (short)var4.c((byte) -87);
                            ((qb) this).field_i[var57] = (short)var4.c((byte) -82);
                            ((qb) this).field_D[var57] = var5.a((byte) 67);
                            ((qb) this).field_r[var57] = var6.a((byte) 88);
                            ((qb) this).field_m[var57] = var7.a((byte) -73);
                            ((qb) this).field_I[var57] = var7.a((byte) -79);
                            ((qb) this).field_j[var57] = var7.a((byte) 84);
                            break L29;
                          }
                        }
                        if (var58 == 3) {
                          ((qb) this).field_M[var57] = (short)var3.c((byte) -71);
                          ((qb) this).field_q[var57] = (short)var3.c((byte) -91);
                          ((qb) this).field_A[var57] = (short)var3.c((byte) 76);
                          ((qb) this).field_E[var57] = (short)var4.c((byte) -118);
                          ((qb) this).field_P[var57] = (short)var4.c((byte) -68);
                          ((qb) this).field_i[var57] = (short)var4.c((byte) 60);
                          ((qb) this).field_D[var57] = var5.a((byte) -70);
                          ((qb) this).field_r[var57] = var6.a((byte) 127);
                          ((qb) this).field_m[var57] = var7.a((byte) -70);
                          var57++;
                          continue L24;
                        } else {
                          var57++;
                          continue L24;
                        }
                      }
                    }
                  } else {
                    L30: {
                      var58 = var3.g(11132);
                      if (var58 != 1) {
                        break L30;
                      } else {
                        L31: {
                          var53 = var2.d(48) + var56;
                          var56 = var53;
                          var54 = var2.d(127) + var56;
                          var56 = var54;
                          var55 = var2.d(53) + var56;
                          var56 = var55;
                          ((qb) this).field_V[var57] = var53;
                          ((qb) this).field_v[var57] = var54;
                          ((qb) this).field_e[var57] = var55;
                          if (var53 <= ((qb) this).field_z) {
                            break L31;
                          } else {
                            ((qb) this).field_z = var53;
                            break L31;
                          }
                        }
                        L32: {
                          if (var54 <= ((qb) this).field_z) {
                            break L32;
                          } else {
                            ((qb) this).field_z = var54;
                            break L32;
                          }
                        }
                        if (var55 <= ((qb) this).field_z) {
                          break L30;
                        } else {
                          ((qb) this).field_z = var55;
                          break L30;
                        }
                      }
                    }
                    L33: {
                      if (var58 != 2) {
                        break L33;
                      } else {
                        var54 = var55;
                        var55 = var2.d(101) + var56;
                        var56 = var55;
                        ((qb) this).field_V[var57] = var53;
                        ((qb) this).field_v[var57] = var54;
                        ((qb) this).field_e[var57] = var55;
                        if (var55 <= ((qb) this).field_z) {
                          break L33;
                        } else {
                          ((qb) this).field_z = var55;
                          break L33;
                        }
                      }
                    }
                    L34: {
                      if (var58 != 3) {
                        break L34;
                      } else {
                        var53 = var55;
                        var55 = var2.d(125) + var56;
                        var56 = var55;
                        ((qb) this).field_V[var57] = var53;
                        ((qb) this).field_v[var57] = var54;
                        ((qb) this).field_e[var57] = var55;
                        if (var55 <= ((qb) this).field_z) {
                          break L34;
                        } else {
                          ((qb) this).field_z = var55;
                          break L34;
                        }
                      }
                    }
                    if (var58 == 4) {
                      var59 = var53;
                      var53 = var54;
                      var54 = var59;
                      var55 = var2.d(50) + var56;
                      var56 = var55;
                      ((qb) this).field_V[var57] = var53;
                      ((qb) this).field_v[var57] = var54;
                      ((qb) this).field_e[var57] = var55;
                      if (var55 > ((qb) this).field_z) {
                        ((qb) this).field_z = var55;
                        var57++;
                        continue L23;
                      } else {
                        var57++;
                        continue L23;
                      }
                    } else {
                      var57++;
                      continue L23;
                    }
                  }
                }
              } else {
                L35: {
                  ((qb) this).field_W[var53] = (short)var2.c((byte) 62);
                  if (var13 == 0) {
                    break L35;
                  } else {
                    ((qb) this).field_s[var53] = var3.a((byte) -82);
                    break L35;
                  }
                }
                L36: {
                  if (var15 != 255) {
                    break L36;
                  } else {
                    ((qb) this).field_O[var53] = var4.a((byte) 43);
                    break L36;
                  }
                }
                L37: {
                  if (var16 != 1) {
                    break L37;
                  } else {
                    ((qb) this).field_w[var53] = var5.a((byte) 64);
                    break L37;
                  }
                }
                L38: {
                  if (var17 != 1) {
                    break L38;
                  } else {
                    ((qb) this).field_Q[var53] = var6.g(11132);
                    break L38;
                  }
                }
                L39: {
                  if (var18 != 1) {
                    break L39;
                  } else {
                    ((qb) this).field_p[var53] = (short)(var7.c((byte) -93) - 1);
                    break L39;
                  }
                }
                if (((qb) this).field_B != null) {
                  if (((qb) this).field_p[var53] == -1) {
                    ((qb) this).field_B[var53] = (byte)-1;
                    var53++;
                    continue L22;
                  } else {
                    ((qb) this).field_B[var53] = (byte)(var8.g(11132) - 1);
                    var53++;
                    continue L22;
                  }
                } else {
                  var53++;
                  continue L22;
                }
              }
            }
          } else {
            L40: {
              var54 = var2.g(11132);
              var55 = 0;
              if ((var54 & 1) == 0) {
                break L40;
              } else {
                var55 = var3.d(87);
                break L40;
              }
            }
            L41: {
              var56 = 0;
              if ((var54 & 2) == 0) {
                break L41;
              } else {
                var56 = var4.d(85);
                break L41;
              }
            }
            L42: {
              var57 = 0;
              if ((var54 & 4) == 0) {
                break L42;
              } else {
                var57 = var5.d(55);
                break L42;
              }
            }
            ((qb) this).field_x[var53] = var50 + var55;
            ((qb) this).field_o[var53] = var51 + var56;
            ((qb) this).field_l[var53] = var52 + var57;
            var50 = ((qb) this).field_x[var53];
            var51 = ((qb) this).field_o[var53];
            var52 = ((qb) this).field_l[var53];
            if (var19 == 1) {
              ((qb) this).field_C[var53] = var6.g(11132);
              var53++;
              continue L21;
            } else {
              var53++;
              continue L21;
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        for (var5 = 0; var5 < ((qb) this).field_t; var5++) {
            ((qb) this).field_x[var5] = ((qb) this).field_x[var5] * param0 / param3;
            ((qb) this).field_o[var5] = ((qb) this).field_o[var5] * param1 / param3;
            ((qb) this).field_l[var5] = ((qb) this).field_l[var5] * param2 / param3;
        }
        this.c();
    }

    final cn a(int param0, int param1, int param2, int param3, int param4) {
        return (cn) (Object) new il((qb) this, param0, param1, param2, param3, param4);
    }

    final void a(ll param0, int param1, int param2, int param3, boolean param4) {
        qb var6 = null;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        s var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        s var16 = null;
        s var16_ref = null;
        s var17 = null;
        s var17_ref = null;
        s var18 = null;
        s var18_ref = null;
        int[] var22 = null;
        var6 = (qb) (Object) param0;
        var6.e();
        var6.d();
        field_u = field_u + 1;
        var7 = 0;
        var22 = var6.field_x;
        var9 = var6.field_z;
        var10 = 0;
        L0: while (true) {
          if (var10 >= ((qb) this).field_z) {
            L1: {
              if (var7 < 3) {
                break L1;
              } else {
                if (param4) {
                  var10 = 0;
                  L2: while (true) {
                    if (var10 >= ((qb) this).field_J) {
                      var10 = 0;
                      L3: while (true) {
                        if (var10 >= var6.field_J) {
                          return;
                        } else {
                          if (field_H[var6.field_V[var10]] == field_u) {
                            if (field_H[var6.field_v[var10]] == field_u) {
                              if (field_H[var6.field_e[var10]] == field_u) {
                                L4: {
                                  if (var6.field_s != null) {
                                    break L4;
                                  } else {
                                    var6.field_s = new byte[var6.field_J];
                                    break L4;
                                  }
                                }
                                var6.field_s[var10] = (byte)2;
                                var10++;
                                continue L3;
                              } else {
                                var10++;
                                continue L3;
                              }
                            } else {
                              var10++;
                              continue L3;
                            }
                          } else {
                            var10++;
                            continue L3;
                          }
                        }
                      }
                    } else {
                      if (field_K[((qb) this).field_V[var10]] == field_u) {
                        if (field_K[((qb) this).field_v[var10]] == field_u) {
                          if (field_K[((qb) this).field_e[var10]] == field_u) {
                            L5: {
                              if (((qb) this).field_s != null) {
                                break L5;
                              } else {
                                ((qb) this).field_s = new byte[((qb) this).field_J];
                                break L5;
                              }
                            }
                            ((qb) this).field_s[var10] = (byte)2;
                            var10++;
                            continue L2;
                          } else {
                            var10++;
                            continue L2;
                          }
                        } else {
                          var10++;
                          continue L2;
                        }
                      } else {
                        var10++;
                        continue L2;
                      }
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            return;
          } else {
            var11 = ((qb) this).field_n[var10];
            var16 = var11;
            var16 = var11;
            if (var11.field_e != 0) {
              var12 = ((qb) this).field_o[var10] - param2;
              if (var12 >= var6.field_h) {
                if (var12 <= var6.field_S) {
                  var13 = ((qb) this).field_x[var10] - param1;
                  if (var13 >= var6.field_F) {
                    if (var13 <= var6.field_G) {
                      var14 = ((qb) this).field_l[var10] - param3;
                      if (var14 >= var6.field_U) {
                        if (var14 <= var6.field_k) {
                          var15 = 0;
                          L6: while (true) {
                            if (var15 < var9) {
                              var16_ref = var6.field_n[var15];
                              if (var13 == var22[var15]) {
                                if (var14 == var6.field_l[var15]) {
                                  if (var12 == var6.field_o[var15]) {
                                    if (var16_ref.field_e != 0) {
                                      L7: {
                                        if (((qb) this).field_g != null) {
                                          break L7;
                                        } else {
                                          ((qb) this).field_g = new s[((qb) this).field_z];
                                          break L7;
                                        }
                                      }
                                      L8: {
                                        if (var6.field_g != null) {
                                          break L8;
                                        } else {
                                          var6.field_g = new s[var9];
                                          break L8;
                                        }
                                      }
                                      L9: {
                                        var17 = ((qb) this).field_g[var10];
                                        if (var17 != null) {
                                          break L9;
                                        } else {
                                          ((qb) this).field_g[var10] = new s(var11);
                                          var17_ref = new s(var11);
                                          break L9;
                                        }
                                      }
                                      L10: {
                                        var18 = var6.field_g[var15];
                                        if (var18 != null) {
                                          break L10;
                                        } else {
                                          var6.field_g[var15] = new s(var16_ref);
                                          var18_ref = new s(var16_ref);
                                          break L10;
                                        }
                                      }
                                      var17_ref.field_j = var17_ref.field_j + var16_ref.field_j;
                                      var17_ref.field_d = var17_ref.field_d + var16_ref.field_d;
                                      var17_ref.field_i = var17_ref.field_i + var16_ref.field_i;
                                      var17_ref.field_e = var17_ref.field_e + var16_ref.field_e;
                                      var18_ref.field_j = var18_ref.field_j + var11.field_j;
                                      var18_ref.field_d = var18_ref.field_d + var11.field_d;
                                      var18_ref.field_i = var18_ref.field_i + var11.field_i;
                                      var18_ref.field_e = var18_ref.field_e + var11.field_e;
                                      var7++;
                                      field_K[var10] = field_u;
                                      field_H[var15] = field_u;
                                      var15++;
                                      continue L6;
                                    } else {
                                      var15++;
                                      continue L6;
                                    }
                                  } else {
                                    var15++;
                                    continue L6;
                                  }
                                } else {
                                  var15++;
                                  continue L6;
                                }
                              } else {
                                var15++;
                                continue L6;
                              }
                            } else {
                              var10++;
                              continue L0;
                            }
                          }
                        } else {
                          var10++;
                          continue L0;
                        }
                      } else {
                        var10++;
                        continue L0;
                      }
                    } else {
                      var10++;
                      continue L0;
                    }
                  } else {
                    var10++;
                    continue L0;
                  }
                } else {
                  var10++;
                  continue L0;
                }
              } else {
                var10++;
                continue L0;
              }
            } else {
              var10++;
              continue L0;
            }
          }
        }
    }

    public static void b() {
        field_K = null;
        field_H = null;
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
        if (!((qb) this).field_T) {
          ((qb) this).field_T = true;
          var1 = 32767;
          var2 = 32767;
          var3 = 32767;
          var4 = -32768;
          var5 = -32768;
          var6 = -32768;
          var7 = 0;
          L0: while (true) {
            if (var7 >= ((qb) this).field_z) {
              ((qb) this).field_F = (short)var1;
              ((qb) this).field_G = (short)var4;
              ((qb) this).field_h = (short)var2;
              ((qb) this).field_S = (short)var5;
              ((qb) this).field_U = (short)var3;
              ((qb) this).field_k = (short)var6;
              return;
            } else {
              L1: {
                var8 = ((qb) this).field_x[var7];
                var9 = ((qb) this).field_o[var7];
                var10 = ((qb) this).field_l[var7];
                if (var8 >= var1) {
                  break L1;
                } else {
                  var1 = var8;
                  break L1;
                }
              }
              L2: {
                if (var8 <= var4) {
                  break L2;
                } else {
                  var4 = var8;
                  break L2;
                }
              }
              L3: {
                if (var9 >= var2) {
                  break L3;
                } else {
                  var2 = var9;
                  break L3;
                }
              }
              L4: {
                if (var9 <= var5) {
                  break L4;
                } else {
                  var5 = var9;
                  break L4;
                }
              }
              L5: {
                if (var10 >= var3) {
                  break L5;
                } else {
                  var3 = var10;
                  break L5;
                }
              }
              if (var10 > var6) {
                var6 = var10;
                var7++;
                continue L0;
              } else {
                var7++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    private qb(byte[] param0) {
        ((qb) this).field_z = 0;
        ((qb) this).field_t = 0;
        ((qb) this).field_J = 0;
        ((qb) this).field_T = false;
        if (param0[param0.length - 1] == -1) {
            // if_icmpne L52
            this.a(param0);
        } else {
            this.b(param0);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = 0;
        field_H = new int[10000];
        field_K = new int[10000];
    }
}
