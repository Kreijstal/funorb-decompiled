/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class od extends on {
    short[] field_U;
    oh[] field_I;
    short[] field_p;
    private static int field_N;
    private int[][] field_O;
    byte[] field_G;
    private byte[] field_K;
    private int[] field_J;
    short[] field_g;
    private short[] field_o;
    ea[] field_u;
    int[] field_S;
    private byte[] field_l;
    int[] field_q;
    oh[] field_r;
    int[] field_i;
    byte[] field_n;
    int[] field_h;
    byte[] field_y;
    private short[] field_H;
    int[] field_s;
    short[] field_T;
    int field_Q;
    int field_j;
    short[] field_M;
    private static int field_A;
    private byte[] field_L;
    private static int[] field_E;
    private byte[] field_m;
    int field_R;
    private byte[] field_B;
    int[] field_v;
    private int[][] field_x;
    private short[] field_w;
    int field_t;
    private static int field_F;
    private int[] field_k;
    byte[] field_C;
    private static int[] field_D;
    byte[] field_z;

    private final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        for (var5 = 0; var5 < ((od) this).field_j; var5++) {
            ((od) this).field_v[var5] = ((od) this).field_v[var5] * param0 / param3;
            ((od) this).field_s[var5] = ((od) this).field_s[var5] * param1 / param3;
            ((od) this).field_h[var5] = ((od) this).field_h[var5] * param2 / param3;
        }
        this.e();
    }

    final int b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var2 = 0;
        var3 = 0;
        L0: while (true) {
          if (var3 >= ((od) this).field_j) {
            var2 = (int)(Math.sqrt((double)var2) + 0.99);
            this.a(param0, param0, param0, var2);
            return var2;
          } else {
            var4 = ((od) this).field_v[var3];
            var5 = ((od) this).field_s[var3];
            var6 = ((od) this).field_h[var3];
            var7 = var4 * var4 + var6 * var6 + var5 * var5;
            if (var7 > var2) {
              var2 = var7;
              var3++;
              continue L0;
            } else {
              var3++;
              continue L0;
            }
          }
        }
    }

    final wj a(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        return ((od) this).a(param0, param1, param2 * param5[3] + param3 * param5[4] + param4 * param5[5] >> 16, param2 * param5[6] + param3 * param5[7] + param4 * param5[8] >> 16, param2 * param5[9] + param3 * param5[10] + param4 * param5[11] >> 16);
    }

    final static od a(mi param0, String param1, String param2) {
        byte[] var3 = param0.a(81, param1, param2);
        if (var3 == null) {
            return null;
        }
        return new od(var3);
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        for (var4 = 0; var4 < ((od) this).field_j; var4++) {
            ((od) this).field_v[var4] = ((od) this).field_v[var4] * param0 / 128;
            ((od) this).field_s[var4] = ((od) this).field_s[var4] * param1 / 128;
            ((od) this).field_h[var4] = ((od) this).field_h[var4] * param2 / 128;
        }
        this.e();
    }

    private final void e() {
        ((od) this).field_I = null;
        ((od) this).field_r = null;
        ((od) this).field_u = null;
    }

    public static void c() {
        field_E = null;
        field_D = null;
    }

    private final void a(byte[] param0) {
        kg var2 = null;
        kg var3 = null;
        kg var4 = null;
        kg var5 = null;
        kg var6 = null;
        kg var7 = null;
        kg var8 = null;
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
          var2 = new kg(param0);
          var3 = new kg(param0);
          var4 = new kg(param0);
          var5 = new kg(param0);
          var6 = new kg(param0);
          var7 = new kg(param0);
          var8 = new kg(param0);
          var2.field_n = param0.length - 23;
          var9 = var2.a((byte) 25);
          var10 = var2.a((byte) 25);
          var11 = var2.c(32);
          var12 = var2.c(32);
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
          var15 = var2.c(32);
          var16 = var2.c(32);
          var17 = var2.c(32);
          var18 = var2.c(32);
          var19 = var2.c(32);
          var20 = var2.a((byte) 25);
          var21 = var2.a((byte) 25);
          var22 = var2.a((byte) 25);
          var23 = var2.a((byte) 25);
          var24 = var2.a((byte) 25);
          var25 = 0;
          var26 = 0;
          var27 = 0;
          if (var11 <= 0) {
            break L2;
          } else {
            ((od) this).field_z = new byte[var11];
            var2.field_n = 0;
            var28 = 0;
            L3: while (true) {
              if (var28 >= var11) {
                break L2;
              } else {
                L4: {
                  byte dupTemp$1 = var2.b(true);
                  ((od) this).field_z[var28] = dupTemp$1;
                  var29 = dupTemp$1;
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
          ((od) this).field_j = var9;
          ((od) this).field_t = var10;
          ((od) this).field_Q = var11;
          ((od) this).field_v = new int[var9];
          ((od) this).field_s = new int[var9];
          ((od) this).field_h = new int[var9];
          ((od) this).field_S = new int[var10];
          ((od) this).field_q = new int[var10];
          ((od) this).field_i = new int[var10];
          if (var19 != 1) {
            break L12;
          } else {
            ((od) this).field_k = new int[var9];
            break L12;
          }
        }
        L13: {
          if (var13 == 0) {
            break L13;
          } else {
            ((od) this).field_C = new byte[var10];
            break L13;
          }
        }
        L14: {
          if (var15 != 255) {
            break L14;
          } else {
            ((od) this).field_G = new byte[var10];
            break L14;
          }
        }
        L15: {
          if (var16 != 1) {
            break L15;
          } else {
            ((od) this).field_n = new byte[var10];
            break L15;
          }
        }
        L16: {
          if (var17 != 1) {
            break L16;
          } else {
            ((od) this).field_J = new int[var10];
            break L16;
          }
        }
        L17: {
          if (var18 != 1) {
            break L17;
          } else {
            ((od) this).field_p = new short[var10];
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
              ((od) this).field_y = new byte[var10];
              break L18;
            }
          }
        }
        L19: {
          ((od) this).field_M = new short[var10];
          if (var11 <= 0) {
            break L19;
          } else {
            L20: {
              ((od) this).field_g = new short[var11];
              ((od) this).field_U = new short[var11];
              ((od) this).field_T = new short[var11];
              if (var26 <= 0) {
                break L20;
              } else {
                ((od) this).field_o = new short[var26];
                ((od) this).field_w = new short[var26];
                ((od) this).field_H = new short[var26];
                ((od) this).field_B = new byte[var26];
                ((od) this).field_m = new byte[var26];
                ((od) this).field_l = new byte[var26];
                break L20;
              }
            }
            if (var27 <= 0) {
              break L19;
            } else {
              ((od) this).field_K = new byte[var27];
              ((od) this).field_L = new byte[var27];
              break L19;
            }
          }
        }
        var2.field_n = var29;
        var3.field_n = var40;
        var4.field_n = var41;
        var5.field_n = var42;
        var6.field_n = var34;
        var50 = 0;
        var51 = 0;
        var52 = 0;
        var53 = 0;
        L21: while (true) {
          if (var53 >= var9) {
            var2.field_n = var39;
            var3.field_n = var30;
            var4.field_n = var32;
            var5.field_n = var35;
            var6.field_n = var33;
            var7.field_n = var37;
            var8.field_n = var38;
            var53 = 0;
            L22: while (true) {
              if (var53 >= var10) {
                ((od) this).field_R = -1;
                var2.field_n = var36;
                var3.field_n = var31;
                var53 = 0;
                var54 = 0;
                var55 = 0;
                var56 = 0;
                var57 = 0;
                L23: while (true) {
                  if (var57 >= var10) {
                    ((od) this).field_R = ((od) this).field_R + 1;
                    var2.field_n = var43;
                    var3.field_n = var44;
                    var4.field_n = var45;
                    var5.field_n = var46;
                    var6.field_n = var47;
                    var7.field_n = var48;
                    var57 = 0;
                    L24: while (true) {
                      if (var57 >= var11) {
                        L25: {
                          if (var14 == 0) {
                            break L25;
                          } else {
                            L26: {
                              var2.field_n = var49;
                              var57 = var2.c(32);
                              if (var57 <= 0) {
                                break L26;
                              } else {
                                var2.field_n = var2.field_n + 4 * var57;
                                break L26;
                              }
                            }
                            var58 = var2.c(32);
                            if (var58 <= 0) {
                              break L25;
                            } else {
                              var2.field_n = var2.field_n + 4 * var58;
                              break L25;
                            }
                          }
                        }
                        return;
                      } else {
                        L27: {
                          var58 = ((od) this).field_z[var57] & 255;
                          if (var58 != 0) {
                            break L27;
                          } else {
                            ((od) this).field_g[var57] = (short)var2.a((byte) 25);
                            ((od) this).field_U[var57] = (short)var2.a((byte) 25);
                            ((od) this).field_T[var57] = (short)var2.a((byte) 25);
                            break L27;
                          }
                        }
                        L28: {
                          if (var58 != 1) {
                            break L28;
                          } else {
                            ((od) this).field_g[var57] = (short)var3.a((byte) 25);
                            ((od) this).field_U[var57] = (short)var3.a((byte) 25);
                            ((od) this).field_T[var57] = (short)var3.a((byte) 25);
                            ((od) this).field_o[var57] = (short)var4.a((byte) 25);
                            ((od) this).field_w[var57] = (short)var4.a((byte) 25);
                            ((od) this).field_H[var57] = (short)var4.a((byte) 25);
                            ((od) this).field_B[var57] = var5.b(true);
                            ((od) this).field_m[var57] = var6.b(true);
                            ((od) this).field_l[var57] = var7.b(true);
                            break L28;
                          }
                        }
                        L29: {
                          if (var58 != 2) {
                            break L29;
                          } else {
                            ((od) this).field_g[var57] = (short)var3.a((byte) 25);
                            ((od) this).field_U[var57] = (short)var3.a((byte) 25);
                            ((od) this).field_T[var57] = (short)var3.a((byte) 25);
                            ((od) this).field_o[var57] = (short)var4.a((byte) 25);
                            ((od) this).field_w[var57] = (short)var4.a((byte) 25);
                            ((od) this).field_H[var57] = (short)var4.a((byte) 25);
                            ((od) this).field_B[var57] = var5.b(true);
                            ((od) this).field_m[var57] = var6.b(true);
                            ((od) this).field_l[var57] = var7.b(true);
                            ((od) this).field_K[var57] = var7.b(true);
                            ((od) this).field_L[var57] = var7.b(true);
                            break L29;
                          }
                        }
                        if (var58 == 3) {
                          ((od) this).field_g[var57] = (short)var3.a((byte) 25);
                          ((od) this).field_U[var57] = (short)var3.a((byte) 25);
                          ((od) this).field_T[var57] = (short)var3.a((byte) 25);
                          ((od) this).field_o[var57] = (short)var4.a((byte) 25);
                          ((od) this).field_w[var57] = (short)var4.a((byte) 25);
                          ((od) this).field_H[var57] = (short)var4.a((byte) 25);
                          ((od) this).field_B[var57] = var5.b(true);
                          ((od) this).field_m[var57] = var6.b(true);
                          ((od) this).field_l[var57] = var7.b(true);
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
                      var58 = var3.c(32);
                      if (var58 != 1) {
                        break L30;
                      } else {
                        L31: {
                          var53 = var2.b(1647) + var56;
                          var56 = var53;
                          var54 = var2.b(1647) + var56;
                          var56 = var54;
                          var55 = var2.b(1647) + var56;
                          var56 = var55;
                          ((od) this).field_S[var57] = var53;
                          ((od) this).field_q[var57] = var54;
                          ((od) this).field_i[var57] = var55;
                          if (var53 <= ((od) this).field_R) {
                            break L31;
                          } else {
                            ((od) this).field_R = var53;
                            break L31;
                          }
                        }
                        L32: {
                          if (var54 <= ((od) this).field_R) {
                            break L32;
                          } else {
                            ((od) this).field_R = var54;
                            break L32;
                          }
                        }
                        if (var55 <= ((od) this).field_R) {
                          break L30;
                        } else {
                          ((od) this).field_R = var55;
                          break L30;
                        }
                      }
                    }
                    L33: {
                      if (var58 != 2) {
                        break L33;
                      } else {
                        var54 = var55;
                        var55 = var2.b(1647) + var56;
                        var56 = var55;
                        ((od) this).field_S[var57] = var53;
                        ((od) this).field_q[var57] = var54;
                        ((od) this).field_i[var57] = var55;
                        if (var55 <= ((od) this).field_R) {
                          break L33;
                        } else {
                          ((od) this).field_R = var55;
                          break L33;
                        }
                      }
                    }
                    L34: {
                      if (var58 != 3) {
                        break L34;
                      } else {
                        var53 = var55;
                        var55 = var2.b(1647) + var56;
                        var56 = var55;
                        ((od) this).field_S[var57] = var53;
                        ((od) this).field_q[var57] = var54;
                        ((od) this).field_i[var57] = var55;
                        if (var55 <= ((od) this).field_R) {
                          break L34;
                        } else {
                          ((od) this).field_R = var55;
                          break L34;
                        }
                      }
                    }
                    if (var58 == 4) {
                      var59 = var53;
                      var53 = var54;
                      var54 = var59;
                      var55 = var2.b(1647) + var56;
                      var56 = var55;
                      ((od) this).field_S[var57] = var53;
                      ((od) this).field_q[var57] = var54;
                      ((od) this).field_i[var57] = var55;
                      if (var55 > ((od) this).field_R) {
                        ((od) this).field_R = var55;
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
                  ((od) this).field_M[var53] = (short)var2.a((byte) 25);
                  if (var13 == 0) {
                    break L35;
                  } else {
                    ((od) this).field_C[var53] = var3.b(true);
                    break L35;
                  }
                }
                L36: {
                  if (var15 != 255) {
                    break L36;
                  } else {
                    ((od) this).field_G[var53] = var4.b(true);
                    break L36;
                  }
                }
                L37: {
                  if (var16 != 1) {
                    break L37;
                  } else {
                    ((od) this).field_n[var53] = var5.b(true);
                    break L37;
                  }
                }
                L38: {
                  if (var17 != 1) {
                    break L38;
                  } else {
                    ((od) this).field_J[var53] = var6.c(32);
                    break L38;
                  }
                }
                L39: {
                  if (var18 != 1) {
                    break L39;
                  } else {
                    ((od) this).field_p[var53] = (short)(var7.a((byte) 25) - 1);
                    break L39;
                  }
                }
                if (((od) this).field_y != null) {
                  if (((od) this).field_p[var53] == -1) {
                    ((od) this).field_y[var53] = (byte) -1;
                    var53++;
                    continue L22;
                  } else {
                    ((od) this).field_y[var53] = (byte)(var8.c(32) - 1);
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
              var54 = var2.c(32);
              var55 = 0;
              if ((var54 & 1) == 0) {
                break L40;
              } else {
                var55 = var3.b(1647);
                break L40;
              }
            }
            L41: {
              var56 = 0;
              if ((var54 & 2) == 0) {
                break L41;
              } else {
                var56 = var4.b(1647);
                break L41;
              }
            }
            L42: {
              var57 = 0;
              if ((var54 & 4) == 0) {
                break L42;
              } else {
                var57 = var5.b(1647);
                break L42;
              }
            }
            ((od) this).field_v[var53] = var50 + var55;
            ((od) this).field_s[var53] = var51 + var56;
            ((od) this).field_h[var53] = var52 + var57;
            var50 = ((od) this).field_v[var53];
            var51 = ((od) this).field_s[var53];
            var52 = ((od) this).field_h[var53];
            if (var19 == 1) {
              ((od) this).field_k[var53] = var6.c(32);
              var53++;
              continue L21;
            } else {
              var53++;
              continue L21;
            }
          }
        }
    }

    final wj a(int param0, int param1, int param2, int param3, int param4) {
        return (wj) (Object) new sk((od) this, param0, param1, param2, param3, param4);
    }

    final void b() {
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
          if (((od) this).field_k == null) {
            break L0;
          } else {
            var9 = new int[256];
            var7 = var9;
            var5 = var7;
            var2 = 0;
            var3 = 0;
            L1: while (true) {
              if (var3 >= ((od) this).field_j) {
                ((od) this).field_O = new int[var2 + 1][];
                var3 = 0;
                L2: while (true) {
                  if (var3 > var2) {
                    var3 = 0;
                    L3: while (true) {
                      if (var3 >= ((od) this).field_j) {
                        ((od) this).field_k = null;
                        break L0;
                      } else {
                        var4 = ((od) this).field_k[var3];
                        var5[var4] = var5[var4] + 1;
                        ((od) this).field_O[var4][var5[var4]] = var3;
                        var3++;
                        continue L3;
                      }
                    }
                  } else {
                    ((od) this).field_O[var3] = new int[var9[var3]];
                    var9[var3] = 0;
                    var3++;
                    continue L2;
                  }
                }
              } else {
                var4 = ((od) this).field_k[var3];
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
          if (((od) this).field_J == null) {
            break L4;
          } else {
            var10 = new int[256];
            var8 = var10;
            var6 = var8;
            var2 = 0;
            var3 = 0;
            L5: while (true) {
              if (var3 >= ((od) this).field_t) {
                ((od) this).field_x = new int[var2 + 1][];
                var3 = 0;
                L6: while (true) {
                  if (var3 > var2) {
                    var3 = 0;
                    L7: while (true) {
                      if (var3 >= ((od) this).field_t) {
                        ((od) this).field_J = null;
                        break L4;
                      } else {
                        var4 = ((od) this).field_J[var3];
                        var6[var4] = var6[var4] + 1;
                        ((od) this).field_x[var4][var6[var4]] = var3;
                        var3++;
                        continue L7;
                      }
                    }
                  } else {
                    ((od) this).field_x[var3] = new int[var10[var3]];
                    var10[var3] = 0;
                    var3++;
                    continue L6;
                  }
                }
              } else {
                var4 = ((od) this).field_J[var3];
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

    final void a() {
        int var1 = 0;
        for (var1 = 0; var1 < ((od) this).field_j; var1++) {
            ((od) this).field_v[var1] = -((od) this).field_v[var1];
            ((od) this).field_h[var1] = -((od) this).field_h[var1];
        }
        this.e();
    }

    final void a(sg param0, int param1) {
        int var5 = 0;
        int var6 = 0;
        ((od) this).b();
        if (((od) this).field_O == null) {
            return;
        }
        if (param1 == -1) {
            return;
        }
        cm var3 = param0.field_t[param1];
        ij var4 = var3.field_g;
        field_F = 0;
        field_N = 0;
        field_A = 0;
        for (var5 = 0; var5 < var3.field_k; var5++) {
            var6 = var3.field_i[var5];
            if (var3.field_n[var5] != -1) {
                this.a(0, var4.field_w[var3.field_n[var5]], 0, 0, 0);
            }
            this.a(var4.field_n[var6], var4.field_w[var6], (int) var3.field_c[var5], (int) var3.field_a[var5], (int) var3.field_l[var5]);
        }
        this.e();
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
        ea var16 = null;
        oh var17 = null;
        oh var18 = null;
        oh var19 = null;
        if (((od) this).field_I == null) {
          ((od) this).field_I = new oh[((od) this).field_R];
          var1 = 0;
          L0: while (true) {
            if (var1 >= ((od) this).field_R) {
              var1 = 0;
              L1: while (true) {
                if (var1 >= ((od) this).field_t) {
                  return;
                } else {
                  var2 = ((od) this).field_S[var1];
                  var3 = ((od) this).field_q[var1];
                  var4 = ((od) this).field_i[var1];
                  var5 = ((od) this).field_v[var3] - ((od) this).field_v[var2];
                  var6 = ((od) this).field_s[var3] - ((od) this).field_s[var2];
                  var7 = ((od) this).field_h[var3] - ((od) this).field_h[var2];
                  var8 = ((od) this).field_v[var4] - ((od) this).field_v[var2];
                  var9 = ((od) this).field_s[var4] - ((od) this).field_s[var2];
                  var10 = ((od) this).field_h[var4] - ((od) this).field_h[var2];
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
                                    if (((od) this).field_C != null) {
                                      var15 = ((od) this).field_C[var1];
                                      break L5;
                                    } else {
                                      var15 = 0;
                                      break L5;
                                    }
                                  }
                                  if (var15 != 0) {
                                    if (var15 == 1) {
                                      L6: {
                                        if (((od) this).field_u != null) {
                                          break L6;
                                        } else {
                                          ((od) this).field_u = new ea[((od) this).field_t];
                                          break L6;
                                        }
                                      }
                                      ea dupTemp$1 = new ea();
                                      ((od) this).field_u[var1] = dupTemp$1;
                                      var16 = dupTemp$1;
                                      var16.field_d = var11;
                                      var16.field_c = var12;
                                      var16.field_b = var13;
                                      var1++;
                                      continue L1;
                                    } else {
                                      var1++;
                                      continue L1;
                                    }
                                  } else {
                                    var17 = ((od) this).field_I[var2];
                                    var17.field_b = var17.field_b + var11;
                                    var17.field_c = var17.field_c + var12;
                                    var17.field_f = var17.field_f + var13;
                                    var17.field_g = var17.field_g + 1;
                                    var18 = ((od) this).field_I[var3];
                                    var18.field_b = var18.field_b + var11;
                                    var18.field_c = var18.field_c + var12;
                                    var18.field_f = var18.field_f + var13;
                                    var18.field_g = var18.field_g + 1;
                                    var19 = ((od) this).field_I[var4];
                                    var19.field_b = var19.field_b + var11;
                                    var19.field_c = var19.field_c + var12;
                                    var19.field_f = var19.field_f + var13;
                                    var19.field_g = var19.field_g + 1;
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
              ((od) this).field_I[var1] = new oh();
              var1++;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    private final void a(int param0, int[] param1, int param2, int param3, int param4) {
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
        int[] var34 = null;
        int[] var35 = null;
        int[] var36 = null;
        int[] var37 = null;
        int[] var38 = null;
        int[] var39 = null;
        var6 = param1.length;
        if (param0 != 0) {
          if (param0 != 1) {
            if (param0 != 2) {
              if (param0 != 3) {
                if (param0 != 5) {
                  if (param0 != 7) {
                    return;
                  } else {
                    L0: {
                      if (((od) this).field_x == null) {
                        break L0;
                      } else {
                        var7 = 0;
                        L1: while (true) {
                          if (var7 >= var6) {
                            break L0;
                          } else {
                            var8 = param1[var7];
                            if (var8 < ((od) this).field_x.length) {
                              var39 = ((od) this).field_x[var8];
                              var10 = 0;
                              L2: while (true) {
                                if (var10 < var39.length) {
                                  L3: {
                                    var11 = var39[var10];
                                    var12 = ((od) this).field_M[var11] & 65535;
                                    var13 = var12 >> 10 & 63;
                                    var14 = var12 >> 7 & 7;
                                    var15 = var12 & 127;
                                    var13 = var13 + param2 & 63;
                                    var14 = var14 + param3;
                                    if (var14 >= 0) {
                                      if (var14 <= 7) {
                                        break L3;
                                      } else {
                                        var14 = 7;
                                        break L3;
                                      }
                                    } else {
                                      var14 = 0;
                                      break L3;
                                    }
                                  }
                                  L4: {
                                    var15 = var15 + param4;
                                    if (var15 >= 0) {
                                      if (var15 <= 127) {
                                        break L4;
                                      } else {
                                        var15 = 127;
                                        break L4;
                                      }
                                    } else {
                                      var15 = 0;
                                      break L4;
                                    }
                                  }
                                  ((od) this).field_M[var11] = (short)(var13 << 10 | var14 << 7 | var15);
                                  var10++;
                                  continue L2;
                                } else {
                                  var7++;
                                  continue L1;
                                }
                              }
                            } else {
                              var7++;
                              continue L1;
                            }
                          }
                        }
                      }
                    }
                    return;
                  }
                } else {
                  L5: {
                    if (((od) this).field_x == null) {
                      break L5;
                    } else {
                      if (((od) this).field_n == null) {
                        break L5;
                      } else {
                        var7 = 0;
                        L6: while (true) {
                          if (var7 >= var6) {
                            break L5;
                          } else {
                            var8 = param1[var7];
                            if (var8 < ((od) this).field_x.length) {
                              var38 = ((od) this).field_x[var8];
                              var10 = 0;
                              L7: while (true) {
                                if (var10 < var38.length) {
                                  L8: {
                                    var11 = var38[var10];
                                    var12 = (((od) this).field_n[var11] & 255) + param2 * 8;
                                    if (var12 >= 0) {
                                      if (var12 <= 255) {
                                        break L8;
                                      } else {
                                        var12 = 255;
                                        break L8;
                                      }
                                    } else {
                                      var12 = 0;
                                      break L8;
                                    }
                                  }
                                  ((od) this).field_n[var11] = (byte)var12;
                                  var10++;
                                  continue L7;
                                } else {
                                  var7++;
                                  continue L6;
                                }
                              }
                            } else {
                              var7++;
                              continue L6;
                            }
                          }
                        }
                      }
                    }
                  }
                  return;
                }
              } else {
                var7 = 0;
                L9: while (true) {
                  if (var7 >= var6) {
                    return;
                  } else {
                    var8 = param1[var7];
                    if (var8 < ((od) this).field_O.length) {
                      var37 = ((od) this).field_O[var8];
                      var10 = 0;
                      L10: while (true) {
                        if (var10 < var37.length) {
                          var11 = var37[var10];
                          ((od) this).field_v[var11] = ((od) this).field_v[var11] - field_F;
                          ((od) this).field_s[var11] = ((od) this).field_s[var11] - field_N;
                          ((od) this).field_h[var11] = ((od) this).field_h[var11] - field_A;
                          ((od) this).field_v[var11] = ((od) this).field_v[var11] * param2 / 128;
                          ((od) this).field_s[var11] = ((od) this).field_s[var11] * param3 / 128;
                          ((od) this).field_h[var11] = ((od) this).field_h[var11] * param4 / 128;
                          ((od) this).field_v[var11] = ((od) this).field_v[var11] + field_F;
                          ((od) this).field_s[var11] = ((od) this).field_s[var11] + field_N;
                          ((od) this).field_h[var11] = ((od) this).field_h[var11] + field_A;
                          var10++;
                          continue L10;
                        } else {
                          var7++;
                          continue L9;
                        }
                      }
                    } else {
                      var7++;
                      continue L9;
                    }
                  }
                }
              }
            } else {
              var7 = 0;
              L11: while (true) {
                if (var7 >= var6) {
                  return;
                } else {
                  var8 = param1[var7];
                  if (var8 < ((od) this).field_O.length) {
                    var36 = ((od) this).field_O[var8];
                    var10 = 0;
                    L12: while (true) {
                      if (var10 < var36.length) {
                        L13: {
                          var11 = var36[var10];
                          ((od) this).field_v[var11] = ((od) this).field_v[var11] - field_F;
                          ((od) this).field_s[var11] = ((od) this).field_s[var11] - field_N;
                          ((od) this).field_h[var11] = ((od) this).field_h[var11] - field_A;
                          if (param4 == 0) {
                            break L13;
                          } else {
                            var12 = field_E[param4];
                            var13 = field_D[param4];
                            var14 = ((od) this).field_s[var11] * var12 + ((od) this).field_v[var11] * var13 >> 16;
                            ((od) this).field_s[var11] = ((od) this).field_s[var11] * var13 - ((od) this).field_v[var11] * var12 >> 16;
                            ((od) this).field_v[var11] = var14;
                            break L13;
                          }
                        }
                        L14: {
                          if (param2 == 0) {
                            break L14;
                          } else {
                            var12 = field_E[param2];
                            var13 = field_D[param2];
                            var14 = ((od) this).field_s[var11] * var13 - ((od) this).field_h[var11] * var12 >> 16;
                            ((od) this).field_h[var11] = ((od) this).field_s[var11] * var12 + ((od) this).field_h[var11] * var13 >> 16;
                            ((od) this).field_s[var11] = var14;
                            break L14;
                          }
                        }
                        L15: {
                          if (param3 == 0) {
                            break L15;
                          } else {
                            var12 = field_E[param3];
                            var13 = field_D[param3];
                            var14 = ((od) this).field_h[var11] * var12 + ((od) this).field_v[var11] * var13 >> 16;
                            ((od) this).field_h[var11] = ((od) this).field_h[var11] * var13 - ((od) this).field_v[var11] * var12 >> 16;
                            ((od) this).field_v[var11] = var14;
                            break L15;
                          }
                        }
                        ((od) this).field_v[var11] = ((od) this).field_v[var11] + field_F;
                        ((od) this).field_s[var11] = ((od) this).field_s[var11] + field_N;
                        ((od) this).field_h[var11] = ((od) this).field_h[var11] + field_A;
                        var10++;
                        continue L12;
                      } else {
                        var7++;
                        continue L11;
                      }
                    }
                  } else {
                    var7++;
                    continue L11;
                  }
                }
              }
            }
          } else {
            var7 = 0;
            L16: while (true) {
              if (var7 >= var6) {
                return;
              } else {
                var8 = param1[var7];
                if (var8 < ((od) this).field_O.length) {
                  var35 = ((od) this).field_O[var8];
                  var10 = 0;
                  L17: while (true) {
                    if (var10 < var35.length) {
                      var11 = var35[var10];
                      ((od) this).field_v[var11] = ((od) this).field_v[var11] + param2;
                      ((od) this).field_s[var11] = ((od) this).field_s[var11] + param3;
                      ((od) this).field_h[var11] = ((od) this).field_h[var11] + param4;
                      var10++;
                      continue L17;
                    } else {
                      var7++;
                      continue L16;
                    }
                  }
                } else {
                  var7++;
                  continue L16;
                }
              }
            }
          }
        } else {
          var7 = 0;
          field_F = 0;
          field_N = 0;
          field_A = 0;
          var8 = 0;
          L18: while (true) {
            if (var8 >= var6) {
              L19: {
                if (var7 <= 0) {
                  field_F = param2;
                  field_N = param3;
                  field_A = param4;
                  break L19;
                } else {
                  field_F = field_F / var7 + param2;
                  field_N = field_N / var7 + param3;
                  field_A = field_A / var7 + param4;
                  break L19;
                }
              }
              return;
            } else {
              var9 = param1[var8];
              if (var9 < ((od) this).field_O.length) {
                var34 = ((od) this).field_O[var9];
                var11 = 0;
                L20: while (true) {
                  if (var11 < var34.length) {
                    var12 = var34[var11];
                    field_F = field_F + ((od) this).field_v[var12];
                    field_N = field_N + ((od) this).field_s[var12];
                    field_A = field_A + ((od) this).field_h[var12];
                    var7++;
                    var11++;
                    continue L20;
                  } else {
                    var8++;
                    continue L18;
                  }
                }
              } else {
                var8++;
                continue L18;
              }
            }
          }
        }
    }

    private od(byte[] param0) {
        L0: {
          L1: {
            ((od) this).field_R = 0;
            ((od) this).field_t = 0;
            ((od) this).field_j = 0;
            if (param0[param0.length - 1] != -1) {
              break L1;
            } else {
              if (param0[param0.length - 2] != -1) {
                break L1;
              } else {
                this.a(param0);
                break L0;
              }
            }
          }
          this.b(param0);
          break L0;
        }
    }

    od(od param0, boolean param1, boolean param2, boolean param3, boolean param4) {
        int var6 = 0;
        L0: {
          ((od) this).field_R = 0;
          ((od) this).field_t = 0;
          ((od) this).field_j = 0;
          ((od) this).field_j = param0.field_j;
          ((od) this).field_R = param0.field_R;
          ((od) this).field_t = param0.field_t;
          ((od) this).field_Q = param0.field_Q;
          if (!param1) {
            ((od) this).field_v = new int[((od) this).field_j];
            ((od) this).field_s = new int[((od) this).field_j];
            ((od) this).field_h = new int[((od) this).field_j];
            var6 = 0;
            L1: while (true) {
              if (var6 >= ((od) this).field_j) {
                break L0;
              } else {
                ((od) this).field_v[var6] = param0.field_v[var6];
                ((od) this).field_s[var6] = param0.field_s[var6];
                ((od) this).field_h[var6] = param0.field_h[var6];
                var6++;
                continue L1;
              }
            }
          } else {
            ((od) this).field_v = param0.field_v;
            ((od) this).field_s = param0.field_s;
            ((od) this).field_h = param0.field_h;
            break L0;
          }
        }
        L2: {
          if (!param2) {
            ((od) this).field_M = new short[((od) this).field_t];
            var6 = 0;
            L3: while (true) {
              if (var6 >= ((od) this).field_t) {
                break L2;
              } else {
                ((od) this).field_M[var6] = param0.field_M[var6];
                var6++;
                continue L3;
              }
            }
          } else {
            ((od) this).field_M = param0.field_M;
            break L2;
          }
        }
        L4: {
          L5: {
            if (param3) {
              break L5;
            } else {
              if (param0.field_p != null) {
                ((od) this).field_p = new short[((od) this).field_t];
                var6 = 0;
                L6: while (true) {
                  if (var6 >= ((od) this).field_t) {
                    break L4;
                  } else {
                    ((od) this).field_p[var6] = param0.field_p[var6];
                    var6++;
                    continue L6;
                  }
                }
              } else {
                break L5;
              }
            }
          }
          ((od) this).field_p = param0.field_p;
          break L4;
        }
        L7: {
          if (!param4) {
            ((od) this).field_n = new byte[((od) this).field_t];
            if (param0.field_n != null) {
              var6 = 0;
              L8: while (true) {
                if (var6 >= ((od) this).field_t) {
                  break L7;
                } else {
                  ((od) this).field_n[var6] = param0.field_n[var6];
                  var6++;
                  continue L8;
                }
              }
            } else {
              var6 = 0;
              L9: while (true) {
                if (var6 >= ((od) this).field_t) {
                  break L7;
                } else {
                  ((od) this).field_n[var6] = (byte) 0;
                  var6++;
                  continue L9;
                }
              }
            }
          } else {
            ((od) this).field_n = param0.field_n;
            break L7;
          }
        }
        ((od) this).field_S = param0.field_S;
        ((od) this).field_q = param0.field_q;
        ((od) this).field_i = param0.field_i;
        ((od) this).field_C = param0.field_C;
        ((od) this).field_G = param0.field_G;
        ((od) this).field_y = param0.field_y;
        ((od) this).field_z = param0.field_z;
        ((od) this).field_g = param0.field_g;
        ((od) this).field_U = param0.field_U;
        ((od) this).field_T = param0.field_T;
        ((od) this).field_o = param0.field_o;
        ((od) this).field_w = param0.field_w;
        ((od) this).field_H = param0.field_H;
        ((od) this).field_B = param0.field_B;
        ((od) this).field_m = param0.field_m;
        ((od) this).field_l = param0.field_l;
        ((od) this).field_K = param0.field_K;
        ((od) this).field_L = param0.field_L;
        ((od) this).field_k = param0.field_k;
        ((od) this).field_J = param0.field_J;
        ((od) this).field_O = param0.field_O;
        ((od) this).field_x = param0.field_x;
        ((od) this).field_I = param0.field_I;
        ((od) this).field_u = param0.field_u;
        ((od) this).field_r = param0.field_r;
    }

    private final void b(byte[] param0) {
        int var2 = 0;
        int var3 = 0;
        kg var4 = null;
        kg var5 = null;
        kg var6 = null;
        kg var7 = null;
        kg var8 = null;
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
          var4 = new kg(param0);
          var5 = new kg(param0);
          var6 = new kg(param0);
          var7 = new kg(param0);
          var8 = new kg(param0);
          var4.field_n = param0.length - 18;
          var9 = var4.a((byte) 25);
          var10 = var4.a((byte) 25);
          var11 = var4.c(32);
          var12 = var4.c(32);
          var13 = var4.c(32);
          var14 = var4.c(32);
          var15 = var4.c(32);
          var16 = var4.c(32);
          var17 = var4.a((byte) 25);
          var18 = var4.a((byte) 25);
          var19 = var4.a((byte) 25);
          var20 = var4.a((byte) 25);
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
          ((od) this).field_j = var9;
          ((od) this).field_t = var10;
          ((od) this).field_Q = var11;
          ((od) this).field_v = new int[var9];
          ((od) this).field_s = new int[var9];
          ((od) this).field_h = new int[var9];
          ((od) this).field_S = new int[var10];
          ((od) this).field_q = new int[var10];
          ((od) this).field_i = new int[var10];
          if (var11 <= 0) {
            break L5;
          } else {
            ((od) this).field_z = new byte[var11];
            ((od) this).field_g = new short[var11];
            ((od) this).field_U = new short[var11];
            ((od) this).field_T = new short[var11];
            break L5;
          }
        }
        L6: {
          if (var16 != 1) {
            break L6;
          } else {
            ((od) this).field_k = new int[var9];
            break L6;
          }
        }
        L7: {
          if (var12 != 1) {
            break L7;
          } else {
            ((od) this).field_C = new byte[var10];
            ((od) this).field_y = new byte[var10];
            ((od) this).field_p = new short[var10];
            break L7;
          }
        }
        L8: {
          if (var13 != 255) {
            break L8;
          } else {
            ((od) this).field_G = new byte[var10];
            break L8;
          }
        }
        L9: {
          if (var14 != 1) {
            break L9;
          } else {
            ((od) this).field_n = new byte[var10];
            break L9;
          }
        }
        L10: {
          if (var15 != 1) {
            break L10;
          } else {
            ((od) this).field_J = new int[var10];
            break L10;
          }
        }
        ((od) this).field_M = new short[var10];
        var4.field_n = var22;
        var5.field_n = var32;
        var6.field_n = var33;
        var7.field_n = var34;
        var8.field_n = var27;
        var35 = 0;
        var36 = 0;
        var37 = 0;
        var38 = 0;
        L11: while (true) {
          if (var38 >= var9) {
            var4.field_n = var30;
            var5.field_n = var26;
            var6.field_n = var24;
            var7.field_n = var28;
            var8.field_n = var25;
            var38 = 0;
            L12: while (true) {
              if (var38 >= var10) {
                ((od) this).field_R = -1;
                var4.field_n = var29;
                var5.field_n = var23;
                var38 = 0;
                var39 = 0;
                var40 = 0;
                var41 = 0;
                var42 = 0;
                L13: while (true) {
                  if (var42 >= var10) {
                    ((od) this).field_R = ((od) this).field_R + 1;
                    var4.field_n = var31;
                    var42 = 0;
                    L14: while (true) {
                      if (var42 >= var11) {
                        L15: {
                          if (((od) this).field_y == null) {
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
                                  ((od) this).field_y = null;
                                  break L15;
                                }
                              } else {
                                var44 = ((od) this).field_y[var45] & 255;
                                if (var44 != 255) {
                                  L17: {
                                    if ((((od) this).field_g[var44] & 65535) != ((od) this).field_S[var45]) {
                                      break L17;
                                    } else {
                                      if ((((od) this).field_U[var44] & 65535) != ((od) this).field_q[var45]) {
                                        break L17;
                                      } else {
                                        if ((((od) this).field_T[var44] & 65535) != ((od) this).field_i[var45]) {
                                          break L17;
                                        } else {
                                          ((od) this).field_y[var45] = (byte) -1;
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
                            ((od) this).field_p = null;
                            break L18;
                          }
                        }
                        L19: {
                          if (var2 != 0) {
                            break L19;
                          } else {
                            ((od) this).field_C = null;
                            break L19;
                          }
                        }
                        return;
                      } else {
                        ((od) this).field_z[var42] = (byte) 0;
                        ((od) this).field_g[var42] = (short)var4.a((byte) 25);
                        ((od) this).field_U[var42] = (short)var4.a((byte) 25);
                        ((od) this).field_T[var42] = (short)var4.a((byte) 25);
                        var42++;
                        continue L14;
                      }
                    }
                  } else {
                    L20: {
                      var43 = var5.c(32);
                      if (var43 != 1) {
                        break L20;
                      } else {
                        L21: {
                          var38 = var4.b(1647) + var41;
                          var41 = var38;
                          var39 = var4.b(1647) + var41;
                          var41 = var39;
                          var40 = var4.b(1647) + var41;
                          var41 = var40;
                          ((od) this).field_S[var42] = var38;
                          ((od) this).field_q[var42] = var39;
                          ((od) this).field_i[var42] = var40;
                          if (var38 <= ((od) this).field_R) {
                            break L21;
                          } else {
                            ((od) this).field_R = var38;
                            break L21;
                          }
                        }
                        L22: {
                          if (var39 <= ((od) this).field_R) {
                            break L22;
                          } else {
                            ((od) this).field_R = var39;
                            break L22;
                          }
                        }
                        if (var40 <= ((od) this).field_R) {
                          break L20;
                        } else {
                          ((od) this).field_R = var40;
                          break L20;
                        }
                      }
                    }
                    L23: {
                      if (var43 != 2) {
                        break L23;
                      } else {
                        var39 = var40;
                        var40 = var4.b(1647) + var41;
                        var41 = var40;
                        ((od) this).field_S[var42] = var38;
                        ((od) this).field_q[var42] = var39;
                        ((od) this).field_i[var42] = var40;
                        if (var40 <= ((od) this).field_R) {
                          break L23;
                        } else {
                          ((od) this).field_R = var40;
                          break L23;
                        }
                      }
                    }
                    L24: {
                      if (var43 != 3) {
                        break L24;
                      } else {
                        var38 = var40;
                        var40 = var4.b(1647) + var41;
                        var41 = var40;
                        ((od) this).field_S[var42] = var38;
                        ((od) this).field_q[var42] = var39;
                        ((od) this).field_i[var42] = var40;
                        if (var40 <= ((od) this).field_R) {
                          break L24;
                        } else {
                          ((od) this).field_R = var40;
                          break L24;
                        }
                      }
                    }
                    if (var43 == 4) {
                      var44 = var38;
                      var38 = var39;
                      var39 = var44;
                      var40 = var4.b(1647) + var41;
                      var41 = var40;
                      ((od) this).field_S[var42] = var38;
                      ((od) this).field_q[var42] = var39;
                      ((od) this).field_i[var42] = var40;
                      if (var40 > ((od) this).field_R) {
                        ((od) this).field_R = var40;
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
                  ((od) this).field_M[var38] = (short)var4.a((byte) 25);
                  if (var12 != 1) {
                    break L25;
                  } else {
                    L26: {
                      var39 = var5.c(32);
                      if ((var39 & 1) != 1) {
                        ((od) this).field_C[var38] = (byte) 0;
                        break L26;
                      } else {
                        ((od) this).field_C[var38] = (byte) 1;
                        var2 = 1;
                        break L26;
                      }
                    }
                    if ((var39 & 2) != 2) {
                      ((od) this).field_y[var38] = (byte) -1;
                      ((od) this).field_p[var38] = (short) -1;
                      break L25;
                    } else {
                      ((od) this).field_y[var38] = (byte)(var39 >> 2);
                      ((od) this).field_p[var38] = ((od) this).field_M[var38];
                      ((od) this).field_M[var38] = (short) 127;
                      if (((od) this).field_p[var38] == -1) {
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
                    ((od) this).field_G[var38] = var6.b(true);
                    break L27;
                  }
                }
                L28: {
                  if (var14 != 1) {
                    break L28;
                  } else {
                    ((od) this).field_n[var38] = var7.b(true);
                    break L28;
                  }
                }
                if (var15 == 1) {
                  ((od) this).field_J[var38] = var8.c(32);
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
              var39 = var4.c(32);
              var40 = 0;
              if ((var39 & 1) == 0) {
                break L29;
              } else {
                var40 = var5.b(1647);
                break L29;
              }
            }
            L30: {
              var41 = 0;
              if ((var39 & 2) == 0) {
                break L30;
              } else {
                var41 = var6.b(1647);
                break L30;
              }
            }
            L31: {
              var42 = 0;
              if ((var39 & 4) == 0) {
                break L31;
              } else {
                var42 = var7.b(1647);
                break L31;
              }
            }
            ((od) this).field_v[var38] = var35 + var40;
            ((od) this).field_s[var38] = var36 + var41;
            ((od) this).field_h[var38] = var37 + var42;
            var35 = ((od) this).field_v[var38];
            var36 = ((od) this).field_s[var38];
            var37 = ((od) this).field_h[var38];
            if (var16 == 1) {
              ((od) this).field_k[var38] = var8.c(32);
              var38++;
              continue L11;
            } else {
              var38++;
              continue L11;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_D = ti.field_j;
        field_E = ti.field_m;
    }
}
