/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kc extends vh {
    byte[] field_m;
    byte[] field_x;
    byte[] field_n;
    int field_K;
    short[] field_j;
    byte[] field_v;
    int[][] field_y;
    io[] field_f;
    short[] field_r;
    private int[] field_p;
    byte[] field_z;
    short[] field_u;
    int[] field_C;
    byte[] field_F;
    int field_i;
    int[] field_g;
    short[] field_L;
    short[] field_Q;
    short[] field_k;
    private int[] field_G;
    ce[] field_o;
    short[] field_D;
    int[] field_B;
    int[] field_R;
    int[] field_O;
    byte[] field_S;
    byte[] field_M;
    byte[] field_q;
    short[] field_H;
    int field_t;
    int field_E;
    int[][] field_P;
    short[] field_N;
    short[] field_l;
    byte[] field_J;
    io[] field_w;
    byte field_s;
    int[] field_h;

    final void b() {
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
        ce var16 = null;
        io var17 = null;
        io var18 = null;
        io var19 = null;
        if (((kc) this).field_f == null) {
          ((kc) this).field_f = new io[((kc) this).field_E];
          var1 = 0;
          L0: while (true) {
            if (var1 >= ((kc) this).field_E) {
              var1 = 0;
              L1: while (true) {
                if (var1 >= ((kc) this).field_K) {
                  return;
                } else {
                  var2 = ((kc) this).field_C[var1];
                  var3 = ((kc) this).field_O[var1];
                  var4 = ((kc) this).field_B[var1];
                  var5 = ((kc) this).field_R[var3] - ((kc) this).field_R[var2];
                  var6 = ((kc) this).field_h[var3] - ((kc) this).field_h[var2];
                  var7 = ((kc) this).field_g[var3] - ((kc) this).field_g[var2];
                  var8 = ((kc) this).field_R[var4] - ((kc) this).field_R[var2];
                  var9 = ((kc) this).field_h[var4] - ((kc) this).field_h[var2];
                  var10 = ((kc) this).field_g[var4] - ((kc) this).field_g[var2];
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
                                    if (((kc) this).field_J != null) {
                                      var15 = ((kc) this).field_J[var1];
                                      break L5;
                                    } else {
                                      var15 = 0;
                                      break L5;
                                    }
                                  }
                                  if (var15 != 0) {
                                    if (var15 == 1) {
                                      L6: {
                                        if (((kc) this).field_o != null) {
                                          break L6;
                                        } else {
                                          ((kc) this).field_o = new ce[((kc) this).field_K];
                                          break L6;
                                        }
                                      }
                                      ((kc) this).field_o[var1] = new ce();
                                      var16 = new ce();
                                      var16.field_g = var11;
                                      var16.field_d = var12;
                                      var16.field_h = var13;
                                      var1++;
                                      continue L1;
                                    } else {
                                      var1++;
                                      continue L1;
                                    }
                                  } else {
                                    var17 = ((kc) this).field_f[var2];
                                    var17.field_j = var17.field_j + var11;
                                    var17.field_f = var17.field_f + var12;
                                    var17.field_b = var17.field_b + var13;
                                    var17.field_e = var17.field_e + 1;
                                    var18 = ((kc) this).field_f[var3];
                                    var18.field_j = var18.field_j + var11;
                                    var18.field_f = var18.field_f + var12;
                                    var18.field_b = var18.field_b + var13;
                                    var18.field_e = var18.field_e + 1;
                                    var19 = ((kc) this).field_f[var4];
                                    var19.field_j = var19.field_j + var11;
                                    var19.field_f = var19.field_f + var12;
                                    var19.field_b = var19.field_b + var13;
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
              ((kc) this).field_f[var1] = new io();
              var1++;
              continue L0;
            }
          }
        } else {
          return;
        }
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
          if (((kc) this).field_G == null) {
            break L0;
          } else {
            var9 = new int[256];
            var7 = var9;
            var5 = var7;
            var2 = 0;
            var3 = 0;
            L1: while (true) {
              if (var3 >= ((kc) this).field_t) {
                ((kc) this).field_y = new int[var2 + 1][];
                var3 = 0;
                L2: while (true) {
                  if (var3 > var2) {
                    var3 = 0;
                    L3: while (true) {
                      if (var3 >= ((kc) this).field_t) {
                        ((kc) this).field_G = null;
                        break L0;
                      } else {
                        var4 = ((kc) this).field_G[var3];
                        var5[var4] = var5[var4] + 1;
                        ((kc) this).field_y[var4][var5[var4]] = var3;
                        var3++;
                        continue L3;
                      }
                    }
                  } else {
                    ((kc) this).field_y[var3] = new int[var9[var3]];
                    var9[var3] = 0;
                    var3++;
                    continue L2;
                  }
                }
              } else {
                var4 = ((kc) this).field_G[var3];
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
          if (((kc) this).field_p == null) {
            break L4;
          } else {
            var10 = new int[256];
            var8 = var10;
            var6 = var8;
            var2 = 0;
            var3 = 0;
            L5: while (true) {
              if (var3 >= ((kc) this).field_K) {
                ((kc) this).field_P = new int[var2 + 1][];
                var3 = 0;
                L6: while (true) {
                  if (var3 > var2) {
                    var3 = 0;
                    L7: while (true) {
                      if (var3 >= ((kc) this).field_K) {
                        ((kc) this).field_p = null;
                        break L4;
                      } else {
                        var4 = ((kc) this).field_p[var3];
                        var6[var4] = var6[var4] + 1;
                        ((kc) this).field_P[var4][var6[var4]] = var3;
                        var3++;
                        continue L7;
                      }
                    }
                  } else {
                    ((kc) this).field_P[var3] = new int[var10[var3]];
                    var10[var3] = 0;
                    var3++;
                    continue L6;
                  }
                }
              } else {
                var4 = ((kc) this).field_p[var3];
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

    final fc a(int param0, int param1, int param2, int param3, int param4) {
        return (fc) (Object) new ob((kc) this, param0, param1, param2, param3, param4);
    }

    final static kc a(ah param0, String param1, String param2) {
        byte[] var3 = param0.a(param1, param2, true);
        if (var3 == null) {
            return null;
        }
        return new kc(var3);
    }

    private final void a(byte[] param0) {
        bh var2 = null;
        bh var3 = null;
        bh var4 = null;
        bh var5 = null;
        bh var6 = null;
        bh var7 = null;
        bh var8 = null;
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
          var2 = new bh(param0);
          var3 = new bh(param0);
          var4 = new bh(param0);
          var5 = new bh(param0);
          var6 = new bh(param0);
          var7 = new bh(param0);
          var8 = new bh(param0);
          var2.field_t = param0.length - 23;
          var9 = var2.e(127);
          var10 = var2.e(127);
          var11 = var2.d((byte) -99);
          var12 = var2.d((byte) -99);
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
          var15 = var2.d((byte) -99);
          var16 = var2.d((byte) -99);
          var17 = var2.d((byte) -99);
          var18 = var2.d((byte) -99);
          var19 = var2.d((byte) -99);
          var20 = var2.e(127);
          var21 = var2.e(127);
          var22 = var2.e(127);
          var23 = var2.e(127);
          var24 = var2.e(127);
          var25 = 0;
          var26 = 0;
          var27 = 0;
          if (var11 <= 0) {
            break L2;
          } else {
            ((kc) this).field_v = new byte[var11];
            var2.field_t = 0;
            var28 = 0;
            L3: while (true) {
              if (var28 >= var11) {
                break L2;
              } else {
                L4: {
                  ((kc) this).field_v[var28] = var2.g(-1772093437);
                  var29 = var2.g(-1772093437);
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
          ((kc) this).field_t = var9;
          ((kc) this).field_K = var10;
          ((kc) this).field_i = var11;
          ((kc) this).field_R = new int[var9];
          ((kc) this).field_h = new int[var9];
          ((kc) this).field_g = new int[var9];
          ((kc) this).field_C = new int[var10];
          ((kc) this).field_O = new int[var10];
          ((kc) this).field_B = new int[var10];
          if (var19 != 1) {
            break L12;
          } else {
            ((kc) this).field_G = new int[var9];
            break L12;
          }
        }
        L13: {
          if (var13 == 0) {
            break L13;
          } else {
            ((kc) this).field_J = new byte[var10];
            break L13;
          }
        }
        L14: {
          if (var15 != 255) {
            ((kc) this).field_s = (byte)var15;
            break L14;
          } else {
            ((kc) this).field_z = new byte[var10];
            break L14;
          }
        }
        L15: {
          if (var16 != 1) {
            break L15;
          } else {
            ((kc) this).field_m = new byte[var10];
            break L15;
          }
        }
        L16: {
          if (var17 != 1) {
            break L16;
          } else {
            ((kc) this).field_p = new int[var10];
            break L16;
          }
        }
        L17: {
          if (var18 != 1) {
            break L17;
          } else {
            ((kc) this).field_u = new short[var10];
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
              ((kc) this).field_q = new byte[var10];
              break L18;
            }
          }
        }
        L19: {
          ((kc) this).field_H = new short[var10];
          if (var11 <= 0) {
            break L19;
          } else {
            L20: {
              ((kc) this).field_k = new short[var11];
              ((kc) this).field_N = new short[var11];
              ((kc) this).field_Q = new short[var11];
              if (var26 <= 0) {
                break L20;
              } else {
                ((kc) this).field_L = new short[var26];
                ((kc) this).field_D = new short[var26];
                ((kc) this).field_l = new short[var26];
                ((kc) this).field_S = new byte[var26];
                ((kc) this).field_x = new byte[var26];
                ((kc) this).field_n = new byte[var26];
                break L20;
              }
            }
            if (var27 <= 0) {
              break L19;
            } else {
              ((kc) this).field_M = new byte[var27];
              ((kc) this).field_F = new byte[var27];
              break L19;
            }
          }
        }
        var2.field_t = var29;
        var3.field_t = var40;
        var4.field_t = var41;
        var5.field_t = var42;
        var6.field_t = var34;
        var50 = 0;
        var51 = 0;
        var52 = 0;
        var53 = 0;
        L21: while (true) {
          if (var53 >= var9) {
            var2.field_t = var39;
            var3.field_t = var30;
            var4.field_t = var32;
            var5.field_t = var35;
            var6.field_t = var33;
            var7.field_t = var37;
            var8.field_t = var38;
            var53 = 0;
            L22: while (true) {
              if (var53 >= var10) {
                ((kc) this).field_E = -1;
                var2.field_t = var36;
                var3.field_t = var31;
                var53 = 0;
                var54 = 0;
                var55 = 0;
                var56 = 0;
                var57 = 0;
                L23: while (true) {
                  if (var57 >= var10) {
                    ((kc) this).field_E = ((kc) this).field_E + 1;
                    var2.field_t = var43;
                    var3.field_t = var44;
                    var4.field_t = var45;
                    var5.field_t = var46;
                    var6.field_t = var47;
                    var7.field_t = var48;
                    var57 = 0;
                    L24: while (true) {
                      if (var57 >= var11) {
                        L25: {
                          if (var14 == 0) {
                            break L25;
                          } else {
                            L26: {
                              var2.field_t = var49;
                              var57 = var2.d((byte) -99);
                              if (var57 <= 0) {
                                break L26;
                              } else {
                                var2.field_t = var2.field_t + 4 * var57;
                                break L26;
                              }
                            }
                            var58 = var2.d((byte) -99);
                            if (var58 <= 0) {
                              break L25;
                            } else {
                              var2.field_t = var2.field_t + 4 * var58;
                              break L25;
                            }
                          }
                        }
                        return;
                      } else {
                        L27: {
                          var58 = ((kc) this).field_v[var57] & 255;
                          if (var58 != 0) {
                            break L27;
                          } else {
                            ((kc) this).field_k[var57] = (short)var2.e(127);
                            ((kc) this).field_N[var57] = (short)var2.e(127);
                            ((kc) this).field_Q[var57] = (short)var2.e(127);
                            break L27;
                          }
                        }
                        L28: {
                          if (var58 != 1) {
                            break L28;
                          } else {
                            ((kc) this).field_k[var57] = (short)var3.e(127);
                            ((kc) this).field_N[var57] = (short)var3.e(127);
                            ((kc) this).field_Q[var57] = (short)var3.e(127);
                            ((kc) this).field_L[var57] = (short)var4.e(127);
                            ((kc) this).field_D[var57] = (short)var4.e(127);
                            ((kc) this).field_l[var57] = (short)var4.e(127);
                            ((kc) this).field_S[var57] = var5.g(-1772093437);
                            ((kc) this).field_x[var57] = var6.g(-1772093437);
                            ((kc) this).field_n[var57] = var7.g(-1772093437);
                            break L28;
                          }
                        }
                        L29: {
                          if (var58 != 2) {
                            break L29;
                          } else {
                            ((kc) this).field_k[var57] = (short)var3.e(127);
                            ((kc) this).field_N[var57] = (short)var3.e(127);
                            ((kc) this).field_Q[var57] = (short)var3.e(127);
                            ((kc) this).field_L[var57] = (short)var4.e(127);
                            ((kc) this).field_D[var57] = (short)var4.e(127);
                            ((kc) this).field_l[var57] = (short)var4.e(127);
                            ((kc) this).field_S[var57] = var5.g(-1772093437);
                            ((kc) this).field_x[var57] = var6.g(-1772093437);
                            ((kc) this).field_n[var57] = var7.g(-1772093437);
                            ((kc) this).field_M[var57] = var7.g(-1772093437);
                            ((kc) this).field_F[var57] = var7.g(-1772093437);
                            break L29;
                          }
                        }
                        if (var58 == 3) {
                          ((kc) this).field_k[var57] = (short)var3.e(127);
                          ((kc) this).field_N[var57] = (short)var3.e(127);
                          ((kc) this).field_Q[var57] = (short)var3.e(127);
                          ((kc) this).field_L[var57] = (short)var4.e(127);
                          ((kc) this).field_D[var57] = (short)var4.e(127);
                          ((kc) this).field_l[var57] = (short)var4.e(127);
                          ((kc) this).field_S[var57] = var5.g(-1772093437);
                          ((kc) this).field_x[var57] = var6.g(-1772093437);
                          ((kc) this).field_n[var57] = var7.g(-1772093437);
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
                      var58 = var3.d((byte) -99);
                      if (var58 != 1) {
                        break L30;
                      } else {
                        L31: {
                          var53 = var2.e((byte) 82) + var56;
                          var56 = var53;
                          var54 = var2.e((byte) 82) + var56;
                          var56 = var54;
                          var55 = var2.e((byte) 82) + var56;
                          var56 = var55;
                          ((kc) this).field_C[var57] = var53;
                          ((kc) this).field_O[var57] = var54;
                          ((kc) this).field_B[var57] = var55;
                          if (var53 <= ((kc) this).field_E) {
                            break L31;
                          } else {
                            ((kc) this).field_E = var53;
                            break L31;
                          }
                        }
                        L32: {
                          if (var54 <= ((kc) this).field_E) {
                            break L32;
                          } else {
                            ((kc) this).field_E = var54;
                            break L32;
                          }
                        }
                        if (var55 <= ((kc) this).field_E) {
                          break L30;
                        } else {
                          ((kc) this).field_E = var55;
                          break L30;
                        }
                      }
                    }
                    L33: {
                      if (var58 != 2) {
                        break L33;
                      } else {
                        var54 = var55;
                        var55 = var2.e((byte) 82) + var56;
                        var56 = var55;
                        ((kc) this).field_C[var57] = var53;
                        ((kc) this).field_O[var57] = var54;
                        ((kc) this).field_B[var57] = var55;
                        if (var55 <= ((kc) this).field_E) {
                          break L33;
                        } else {
                          ((kc) this).field_E = var55;
                          break L33;
                        }
                      }
                    }
                    L34: {
                      if (var58 != 3) {
                        break L34;
                      } else {
                        var53 = var55;
                        var55 = var2.e((byte) 82) + var56;
                        var56 = var55;
                        ((kc) this).field_C[var57] = var53;
                        ((kc) this).field_O[var57] = var54;
                        ((kc) this).field_B[var57] = var55;
                        if (var55 <= ((kc) this).field_E) {
                          break L34;
                        } else {
                          ((kc) this).field_E = var55;
                          break L34;
                        }
                      }
                    }
                    if (var58 == 4) {
                      var59 = var53;
                      var53 = var54;
                      var54 = var59;
                      var55 = var2.e((byte) 82) + var56;
                      var56 = var55;
                      ((kc) this).field_C[var57] = var53;
                      ((kc) this).field_O[var57] = var54;
                      ((kc) this).field_B[var57] = var55;
                      if (var55 > ((kc) this).field_E) {
                        ((kc) this).field_E = var55;
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
                  ((kc) this).field_H[var53] = (short)var2.e(127);
                  if (var13 == 0) {
                    break L35;
                  } else {
                    ((kc) this).field_J[var53] = var3.g(-1772093437);
                    break L35;
                  }
                }
                L36: {
                  if (var15 != 255) {
                    break L36;
                  } else {
                    ((kc) this).field_z[var53] = var4.g(-1772093437);
                    break L36;
                  }
                }
                L37: {
                  if (var16 != 1) {
                    break L37;
                  } else {
                    ((kc) this).field_m[var53] = var5.g(-1772093437);
                    break L37;
                  }
                }
                L38: {
                  if (var17 != 1) {
                    break L38;
                  } else {
                    ((kc) this).field_p[var53] = var6.d((byte) -99);
                    break L38;
                  }
                }
                L39: {
                  if (var18 != 1) {
                    break L39;
                  } else {
                    ((kc) this).field_u[var53] = (short)(var7.e(127) - 1);
                    break L39;
                  }
                }
                if (((kc) this).field_q != null) {
                  if (((kc) this).field_u[var53] == -1) {
                    ((kc) this).field_q[var53] = (byte)-1;
                    var53++;
                    continue L22;
                  } else {
                    ((kc) this).field_q[var53] = (byte)(var8.d((byte) -99) - 1);
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
              var54 = var2.d((byte) -99);
              var55 = 0;
              if ((var54 & 1) == 0) {
                break L40;
              } else {
                var55 = var3.e((byte) 82);
                break L40;
              }
            }
            L41: {
              var56 = 0;
              if ((var54 & 2) == 0) {
                break L41;
              } else {
                var56 = var4.e((byte) 82);
                break L41;
              }
            }
            L42: {
              var57 = 0;
              if ((var54 & 4) == 0) {
                break L42;
              } else {
                var57 = var5.e((byte) 82);
                break L42;
              }
            }
            ((kc) this).field_R[var53] = var50 + var55;
            ((kc) this).field_h[var53] = var51 + var56;
            ((kc) this).field_g[var53] = var52 + var57;
            var50 = ((kc) this).field_R[var53];
            var51 = ((kc) this).field_h[var53];
            var52 = ((kc) this).field_g[var53];
            if (var19 == 1) {
              ((kc) this).field_G[var53] = var6.d((byte) -99);
              var53++;
              continue L21;
            } else {
              var53++;
              continue L21;
            }
          }
        }
    }

    private final void b(byte[] param0) {
        int var2 = 0;
        int var3 = 0;
        bh var4 = null;
        bh var5 = null;
        bh var6 = null;
        bh var7 = null;
        bh var8 = null;
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
          var4 = new bh(param0);
          var5 = new bh(param0);
          var6 = new bh(param0);
          var7 = new bh(param0);
          var8 = new bh(param0);
          var4.field_t = param0.length - 18;
          var9 = var4.e(127);
          var10 = var4.e(127);
          var11 = var4.d((byte) -99);
          var12 = var4.d((byte) -99);
          var13 = var4.d((byte) -99);
          var14 = var4.d((byte) -99);
          var15 = var4.d((byte) -99);
          var16 = var4.d((byte) -99);
          var17 = var4.e(127);
          var18 = var4.e(127);
          var19 = var4.e(127);
          var20 = var4.e(127);
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
          ((kc) this).field_t = var9;
          ((kc) this).field_K = var10;
          ((kc) this).field_i = var11;
          ((kc) this).field_R = new int[var9];
          ((kc) this).field_h = new int[var9];
          ((kc) this).field_g = new int[var9];
          ((kc) this).field_C = new int[var10];
          ((kc) this).field_O = new int[var10];
          ((kc) this).field_B = new int[var10];
          if (var11 <= 0) {
            break L5;
          } else {
            ((kc) this).field_v = new byte[var11];
            ((kc) this).field_k = new short[var11];
            ((kc) this).field_N = new short[var11];
            ((kc) this).field_Q = new short[var11];
            break L5;
          }
        }
        L6: {
          if (var16 != 1) {
            break L6;
          } else {
            ((kc) this).field_G = new int[var9];
            break L6;
          }
        }
        L7: {
          if (var12 != 1) {
            break L7;
          } else {
            ((kc) this).field_J = new byte[var10];
            ((kc) this).field_q = new byte[var10];
            ((kc) this).field_u = new short[var10];
            break L7;
          }
        }
        L8: {
          if (var13 != 255) {
            ((kc) this).field_s = (byte)var13;
            break L8;
          } else {
            ((kc) this).field_z = new byte[var10];
            break L8;
          }
        }
        L9: {
          if (var14 != 1) {
            break L9;
          } else {
            ((kc) this).field_m = new byte[var10];
            break L9;
          }
        }
        L10: {
          if (var15 != 1) {
            break L10;
          } else {
            ((kc) this).field_p = new int[var10];
            break L10;
          }
        }
        ((kc) this).field_H = new short[var10];
        var4.field_t = var22;
        var5.field_t = var32;
        var6.field_t = var33;
        var7.field_t = var34;
        var8.field_t = var27;
        var35 = 0;
        var36 = 0;
        var37 = 0;
        var38 = 0;
        L11: while (true) {
          if (var38 >= var9) {
            var4.field_t = var30;
            var5.field_t = var26;
            var6.field_t = var24;
            var7.field_t = var28;
            var8.field_t = var25;
            var38 = 0;
            L12: while (true) {
              if (var38 >= var10) {
                ((kc) this).field_E = -1;
                var4.field_t = var29;
                var5.field_t = var23;
                var38 = 0;
                var39 = 0;
                var40 = 0;
                var41 = 0;
                var42 = 0;
                L13: while (true) {
                  if (var42 >= var10) {
                    ((kc) this).field_E = ((kc) this).field_E + 1;
                    var4.field_t = var31;
                    var42 = 0;
                    L14: while (true) {
                      if (var42 >= var11) {
                        L15: {
                          if (((kc) this).field_q == null) {
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
                                  ((kc) this).field_q = null;
                                  break L15;
                                }
                              } else {
                                var44 = ((kc) this).field_q[var45] & 255;
                                if (var44 != 255) {
                                  L17: {
                                    if ((((kc) this).field_k[var44] & 65535) != ((kc) this).field_C[var45]) {
                                      break L17;
                                    } else {
                                      if ((((kc) this).field_N[var44] & 65535) != ((kc) this).field_O[var45]) {
                                        break L17;
                                      } else {
                                        if ((((kc) this).field_Q[var44] & 65535) != ((kc) this).field_B[var45]) {
                                          break L17;
                                        } else {
                                          ((kc) this).field_q[var45] = (byte)-1;
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
                            ((kc) this).field_u = null;
                            break L18;
                          }
                        }
                        L19: {
                          if (var2 != 0) {
                            break L19;
                          } else {
                            ((kc) this).field_J = null;
                            break L19;
                          }
                        }
                        return;
                      } else {
                        ((kc) this).field_v[var42] = (byte) 0;
                        ((kc) this).field_k[var42] = (short)var4.e(127);
                        ((kc) this).field_N[var42] = (short)var4.e(127);
                        ((kc) this).field_Q[var42] = (short)var4.e(127);
                        var42++;
                        continue L14;
                      }
                    }
                  } else {
                    L20: {
                      var43 = var5.d((byte) -99);
                      if (var43 != 1) {
                        break L20;
                      } else {
                        L21: {
                          var38 = var4.e((byte) 82) + var41;
                          var41 = var38;
                          var39 = var4.e((byte) 82) + var41;
                          var41 = var39;
                          var40 = var4.e((byte) 82) + var41;
                          var41 = var40;
                          ((kc) this).field_C[var42] = var38;
                          ((kc) this).field_O[var42] = var39;
                          ((kc) this).field_B[var42] = var40;
                          if (var38 <= ((kc) this).field_E) {
                            break L21;
                          } else {
                            ((kc) this).field_E = var38;
                            break L21;
                          }
                        }
                        L22: {
                          if (var39 <= ((kc) this).field_E) {
                            break L22;
                          } else {
                            ((kc) this).field_E = var39;
                            break L22;
                          }
                        }
                        if (var40 <= ((kc) this).field_E) {
                          break L20;
                        } else {
                          ((kc) this).field_E = var40;
                          break L20;
                        }
                      }
                    }
                    L23: {
                      if (var43 != 2) {
                        break L23;
                      } else {
                        var39 = var40;
                        var40 = var4.e((byte) 82) + var41;
                        var41 = var40;
                        ((kc) this).field_C[var42] = var38;
                        ((kc) this).field_O[var42] = var39;
                        ((kc) this).field_B[var42] = var40;
                        if (var40 <= ((kc) this).field_E) {
                          break L23;
                        } else {
                          ((kc) this).field_E = var40;
                          break L23;
                        }
                      }
                    }
                    L24: {
                      if (var43 != 3) {
                        break L24;
                      } else {
                        var38 = var40;
                        var40 = var4.e((byte) 82) + var41;
                        var41 = var40;
                        ((kc) this).field_C[var42] = var38;
                        ((kc) this).field_O[var42] = var39;
                        ((kc) this).field_B[var42] = var40;
                        if (var40 <= ((kc) this).field_E) {
                          break L24;
                        } else {
                          ((kc) this).field_E = var40;
                          break L24;
                        }
                      }
                    }
                    if (var43 == 4) {
                      var44 = var38;
                      var38 = var39;
                      var39 = var44;
                      var40 = var4.e((byte) 82) + var41;
                      var41 = var40;
                      ((kc) this).field_C[var42] = var38;
                      ((kc) this).field_O[var42] = var39;
                      ((kc) this).field_B[var42] = var40;
                      if (var40 > ((kc) this).field_E) {
                        ((kc) this).field_E = var40;
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
                  ((kc) this).field_H[var38] = (short)var4.e(127);
                  if (var12 != 1) {
                    break L25;
                  } else {
                    L26: {
                      var39 = var5.d((byte) -99);
                      if ((var39 & 1) != 1) {
                        ((kc) this).field_J[var38] = (byte) 0;
                        break L26;
                      } else {
                        ((kc) this).field_J[var38] = (byte) 1;
                        var2 = 1;
                        break L26;
                      }
                    }
                    if ((var39 & 2) != 2) {
                      ((kc) this).field_q[var38] = (byte)-1;
                      ((kc) this).field_u[var38] = (short)-1;
                      break L25;
                    } else {
                      ((kc) this).field_q[var38] = (byte)(var39 >> 2);
                      ((kc) this).field_u[var38] = ((kc) this).field_H[var38];
                      ((kc) this).field_H[var38] = (short)127;
                      if (((kc) this).field_u[var38] == -1) {
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
                    ((kc) this).field_z[var38] = var6.g(-1772093437);
                    break L27;
                  }
                }
                L28: {
                  if (var14 != 1) {
                    break L28;
                  } else {
                    ((kc) this).field_m[var38] = var7.g(-1772093437);
                    break L28;
                  }
                }
                if (var15 == 1) {
                  ((kc) this).field_p[var38] = var8.d((byte) -99);
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
              var39 = var4.d((byte) -99);
              var40 = 0;
              if ((var39 & 1) == 0) {
                break L29;
              } else {
                var40 = var5.e((byte) 82);
                break L29;
              }
            }
            L30: {
              var41 = 0;
              if ((var39 & 2) == 0) {
                break L30;
              } else {
                var41 = var6.e((byte) 82);
                break L30;
              }
            }
            L31: {
              var42 = 0;
              if ((var39 & 4) == 0) {
                break L31;
              } else {
                var42 = var7.e((byte) 82);
                break L31;
              }
            }
            ((kc) this).field_R[var38] = var35 + var40;
            ((kc) this).field_h[var38] = var36 + var41;
            ((kc) this).field_g[var38] = var37 + var42;
            var35 = ((kc) this).field_R[var38];
            var36 = ((kc) this).field_h[var38];
            var37 = ((kc) this).field_g[var38];
            if (var16 == 1) {
              ((kc) this).field_G[var38] = var8.d((byte) -99);
              var38++;
              continue L11;
            } else {
              var38++;
              continue L11;
            }
          }
        }
    }

    private kc(byte[] param0) {
        ((kc) this).field_K = 0;
        ((kc) this).field_t = 0;
        ((kc) this).field_s = (byte) 0;
        ((kc) this).field_E = 0;
        if (param0[param0.length - 1] == -1) {
            // if_icmpne L52
            this.a(param0);
        } else {
            this.b(param0);
        }
    }
}
