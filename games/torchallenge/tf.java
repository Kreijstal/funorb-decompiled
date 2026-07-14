/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tf {
    int[] field_e;
    int[] field_y;
    static ka[] field_a;
    int[][] field_A;
    static double field_i;
    static cd field_h;
    private int[] field_c;
    int field_k;
    int[] field_g;
    int field_b;
    int field_r;
    static int[] field_l;
    private int field_m;
    int[] field_d;
    private int[][] field_v;
    static ka[] field_j;
    static int field_o;
    wi field_p;
    wi[] field_s;
    static h field_f;
    static rj field_w;
    int[] field_t;
    static String[] field_z;
    static int[] field_u;
    byte[][] field_n;
    private byte[] field_q;
    static eg field_x;

    public static void a(byte param0) {
        field_u = null;
        field_j = null;
        field_w = null;
        field_a = null;
        field_f = null;
        field_z = null;
        field_h = null;
        field_l = null;
        field_x = null;
        if (param0 < 46) {
            field_x = null;
        }
    }

    private final void a(byte param0, byte[] param1) {
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
        uf var18 = null;
        byte[] var22 = null;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        L0: {
          var17 = TorChallenge.field_F ? 1 : 0;
          var18 = new uf(pg.a(-1048576, param1));
          var4 = var18.j(-101);
          if (5 > var4) {
            break L0;
          } else {
            if (7 >= var4) {
              L1: {
                if (var4 < 6) {
                  ((tf) this).field_b = 0;
                  break L1;
                } else {
                  ((tf) this).field_b = var18.i(40);
                  break L1;
                }
              }
              L2: {
                var5 = var18.j(-128);
                if ((1 & var5) == -1) {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  break L2;
                } else {
                  stackOut_8_0 = 1;
                  stackIn_10_0 = stackOut_8_0;
                  break L2;
                }
              }
              L3: {
                var6 = stackIn_10_0;
                if (-1 == (2 & var5)) {
                  stackOut_12_0 = 0;
                  stackIn_13_0 = stackOut_12_0;
                  break L3;
                } else {
                  stackOut_11_0 = 1;
                  stackIn_13_0 = stackOut_11_0;
                  break L3;
                }
              }
              L4: {
                var7 = stackIn_13_0;
                if (-8 < (var4 ^ -1)) {
                  ((tf) this).field_m = var18.c(false);
                  break L4;
                } else {
                  ((tf) this).field_m = var18.h(78);
                  break L4;
                }
              }
              L5: {
                var8 = 0;
                ((tf) this).field_y = new int[((tf) this).field_m];
                var9 = -1;
                if (-8 >= (var4 ^ -1)) {
                  var10 = 0;
                  L6: while (true) {
                    if (var10 >= ((tf) this).field_m) {
                      break L5;
                    } else {
                      var8 = var8 + var18.h(96);
                      ((tf) this).field_y[var10] = var8 + var18.h(96);
                      if (((tf) this).field_y[var10] > var9) {
                        var9 = ((tf) this).field_y[var10];
                        var10++;
                        continue L6;
                      } else {
                        var10++;
                        continue L6;
                      }
                    }
                  }
                } else {
                  var10 = 0;
                  L7: while (true) {
                    if (((tf) this).field_m <= var10) {
                      break L5;
                    } else {
                      var8 = var8 + var18.c(false);
                      ((tf) this).field_y[var10] = var8 + var18.c(false);
                      if (((tf) this).field_y[var10] > var9) {
                        var9 = ((tf) this).field_y[var10];
                        var10++;
                        continue L7;
                      } else {
                        var10++;
                        continue L7;
                      }
                    }
                  }
                }
              }
              L8: {
                var10 = 36 % ((param0 - -33) / 36);
                ((tf) this).field_r = var9 - -1;
                ((tf) this).field_A = new int[((tf) this).field_r][];
                if (var7 != 0) {
                  ((tf) this).field_n = new byte[((tf) this).field_r][];
                  break L8;
                } else {
                  break L8;
                }
              }
              L9: {
                ((tf) this).field_d = new int[((tf) this).field_r];
                ((tf) this).field_g = new int[((tf) this).field_r];
                ((tf) this).field_e = new int[((tf) this).field_r];
                ((tf) this).field_t = new int[((tf) this).field_r];
                if (var6 == 0) {
                  break L9;
                } else {
                  ((tf) this).field_c = new int[((tf) this).field_r];
                  var11 = 0;
                  L10: while (true) {
                    if (var11 >= ((tf) this).field_r) {
                      var11 = 0;
                      L11: while (true) {
                        if (var11 >= ((tf) this).field_m) {
                          ((tf) this).field_p = new wi(((tf) this).field_c);
                          break L9;
                        } else {
                          ((tf) this).field_c[((tf) this).field_y[var11]] = var18.i(124);
                          var11++;
                          continue L11;
                        }
                      }
                    } else {
                      ((tf) this).field_c[var11] = -1;
                      var11++;
                      continue L10;
                    }
                  }
                }
              }
              var11 = 0;
              L12: while (true) {
                if (((tf) this).field_m <= var11) {
                  L13: {
                    if (var7 != 0) {
                      var11 = 0;
                      L14: while (true) {
                        if (var11 >= ((tf) this).field_m) {
                          var11 = 0;
                          L15: while (true) {
                            if (((tf) this).field_m <= var11) {
                              break L13;
                            } else {
                              ((tf) this).field_d[((tf) this).field_y[var11]] = var18.i(116);
                              var11++;
                              continue L15;
                            }
                          }
                        } else {
                          var22 = new byte[64];
                          var18.a(93, var22, 64, 0);
                          ((tf) this).field_n[((tf) this).field_y[var11]] = var22;
                          var11++;
                          continue L14;
                        }
                      }
                    } else {
                      var11 = 0;
                      L16: while (true) {
                        if (((tf) this).field_m <= var11) {
                          break L13;
                        } else {
                          ((tf) this).field_d[((tf) this).field_y[var11]] = var18.i(116);
                          var11++;
                          continue L16;
                        }
                      }
                    }
                  }
                  L17: {
                    if (var4 >= 7) {
                      var11 = 0;
                      L18: while (true) {
                        if (var11 >= ((tf) this).field_m) {
                          var11 = 0;
                          L19: while (true) {
                            if (((tf) this).field_m <= var11) {
                              break L17;
                            } else {
                              var12 = ((tf) this).field_y[var11];
                              var8 = 0;
                              var13 = ((tf) this).field_e[var12];
                              ((tf) this).field_A[var12] = new int[var13];
                              var14 = -1;
                              var15 = 0;
                              L20: while (true) {
                                if (var15 >= var13) {
                                  ((tf) this).field_g[var12] = 1 + var14;
                                  if (1 + var14 == var13) {
                                    ((tf) this).field_A[var12] = null;
                                    var11++;
                                    continue L19;
                                  } else {
                                    var11++;
                                    continue L19;
                                  }
                                } else {
                                  var8 = var8 + var18.h(-116);
                                  ((tf) this).field_A[var12][var15] = var8 + var18.h(-116);
                                  var16 = var8 + var18.h(-116);
                                  if (var16 > var14) {
                                    var14 = var16;
                                    var15++;
                                    continue L20;
                                  } else {
                                    var15++;
                                    continue L20;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          ((tf) this).field_e[((tf) this).field_y[var11]] = var18.h(-76);
                          var11++;
                          continue L18;
                        }
                      }
                    } else {
                      var11 = 0;
                      L21: while (true) {
                        if (var11 >= ((tf) this).field_m) {
                          var11 = 0;
                          L22: while (true) {
                            if (((tf) this).field_m <= var11) {
                              break L17;
                            } else {
                              var12 = ((tf) this).field_y[var11];
                              var13 = ((tf) this).field_e[var12];
                              var8 = 0;
                              ((tf) this).field_A[var12] = new int[var13];
                              var14 = -1;
                              var15 = 0;
                              L23: while (true) {
                                if (var15 >= var13) {
                                  ((tf) this).field_g[var12] = var14 + 1;
                                  if (var13 == 1 + var14) {
                                    ((tf) this).field_A[var12] = null;
                                    var11++;
                                    continue L22;
                                  } else {
                                    var11++;
                                    continue L22;
                                  }
                                } else {
                                  var8 = var8 + var18.c(false);
                                  ((tf) this).field_A[var12][var15] = var8 + var18.c(false);
                                  var16 = var8 + var18.c(false);
                                  if (var16 > var14) {
                                    var14 = var16;
                                    var15++;
                                    continue L23;
                                  } else {
                                    var15++;
                                    continue L23;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          ((tf) this).field_e[((tf) this).field_y[var11]] = var18.c(false);
                          var11++;
                          continue L21;
                        }
                      }
                    }
                  }
                  L24: {
                    if (var6 != 0) {
                      ((tf) this).field_s = new wi[var9 + 1];
                      ((tf) this).field_v = new int[var9 + 1][];
                      var11 = 0;
                      L25: while (true) {
                        if (var11 >= ((tf) this).field_m) {
                          break L24;
                        } else {
                          var12 = ((tf) this).field_y[var11];
                          var13 = ((tf) this).field_e[var12];
                          ((tf) this).field_v[var12] = new int[((tf) this).field_g[var12]];
                          var14 = 0;
                          L26: while (true) {
                            if (var14 >= ((tf) this).field_g[var12]) {
                              var14 = 0;
                              L27: while (true) {
                                if (var13 <= var14) {
                                  ((tf) this).field_s[var12] = new wi(((tf) this).field_v[var12]);
                                  var11++;
                                  continue L25;
                                } else {
                                  L28: {
                                    if (null == ((tf) this).field_A[var12]) {
                                      var15 = var14;
                                      break L28;
                                    } else {
                                      var15 = ((tf) this).field_A[var12][var14];
                                      break L28;
                                    }
                                  }
                                  ((tf) this).field_v[var12][var15] = var18.i(50);
                                  var14++;
                                  continue L27;
                                }
                              }
                            } else {
                              ((tf) this).field_v[var12][var14] = -1;
                              var14++;
                              continue L26;
                            }
                          }
                        }
                      }
                    } else {
                      break L24;
                    }
                  }
                  return;
                } else {
                  ((tf) this).field_t[((tf) this).field_y[var11]] = var18.i(50);
                  var11++;
                  continue L12;
                }
              }
            } else {
              break L0;
            }
          }
        }
        throw new RuntimeException();
    }

    tf(byte[] param0, int param1, byte[] param2) {
        int var4 = 0;
        ((tf) this).field_k = k.a(param0, param0.length, 0);
        if (((tf) this).field_k != param1) {
            throw new RuntimeException();
        }
        if (param2 != null) {
            if ((param2.length ^ -1) != -65) {
                throw new RuntimeException();
            }
            ((tf) this).field_q = qc.a(param0, param0.length, (byte) -126, 0);
            for (var4 = 0; var4 < 64; var4++) {
                if (param2[var4] != ((tf) this).field_q[var4]) {
                    throw new RuntimeException();
                }
            }
        }
        this.a((byte) -123, param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = 0.0;
        field_l = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        field_h = null;
        field_o = 0;
        field_z = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
        field_u = new int[8192];
        field_w = new rj();
    }
}
