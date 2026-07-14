/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ad {
    private int[] field_f;
    int[] field_s;
    int field_d;
    int[] field_z;
    private int field_g;
    int[] field_i;
    byte[][] field_a;
    int[] field_w;
    int field_h;
    int field_v;
    private int[][] field_j;
    private byte[] field_q;
    wi field_p;
    int[] field_m;
    int[][] field_k;
    static ko field_l;
    wi[] field_n;
    static String field_e;
    static int field_x;
    static int[] field_o;
    static String field_b;
    static dd field_y;
    static int field_r;
    static int field_c;
    static String field_t;
    static int field_u;

    final static void a(byte param0, java.math.BigInteger param1, ge param2, java.math.BigInteger param3, ge param4) {
        lf.a(param3, param2.field_t, param1, param4, param2.field_v, 0, 0);
        if (param0 != 93) {
            dd discarded$0 = ad.a(122, 64, 86);
        }
    }

    public static void a(int param0) {
        field_o = null;
        if (param0 != 20592) {
            return;
        }
        field_t = null;
        field_y = null;
        field_b = null;
        field_e = null;
        field_l = null;
    }

    private final void a(byte[] param0, int param1) {
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
        ge var17 = null;
        byte[] var21 = null;
        int stackIn_10_0 = 0;
        int stackIn_16_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        L0: {
          var16 = Pool.field_O;
          var17 = new ge(wp.a(0, param0));
          var4 = var17.g(param1 ^ 105);
          if (-6 < (var4 ^ -1)) {
            break L0;
          } else {
            if (var4 <= 7) {
              L1: {
                if (var4 >= 6) {
                  ((ad) this).field_h = var17.b(true);
                  break L1;
                } else {
                  ((ad) this).field_h = 0;
                  break L1;
                }
              }
              L2: {
                var5 = var17.g(-60);
                if ((var5 & 1) == 0) {
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
                if (var4 >= 7) {
                  ((ad) this).field_g = var17.c(99);
                  break L3;
                } else {
                  ((ad) this).field_g = var17.d(-1034);
                  break L3;
                }
              }
              L4: {
                if (0 == (var5 & 2)) {
                  stackOut_15_0 = 0;
                  stackIn_16_0 = stackOut_15_0;
                  break L4;
                } else {
                  stackOut_14_0 = 1;
                  stackIn_16_0 = stackOut_14_0;
                  break L4;
                }
              }
              L5: {
                var7 = stackIn_16_0;
                var8 = 0;
                ((ad) this).field_m = new int[((ad) this).field_g];
                var9 = param1;
                if (7 <= var4) {
                  var10 = 0;
                  L6: while (true) {
                    if (var10 >= ((ad) this).field_g) {
                      break L5;
                    } else {
                      var8 = var8 + var17.c(cq.a(param1, 82));
                      ((ad) this).field_m[var10] = var8 + var17.c(cq.a(param1, 82));
                      if (((ad) this).field_m[var10] > var9) {
                        var9 = ((ad) this).field_m[var10];
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
                    if (((ad) this).field_g <= var10) {
                      break L5;
                    } else {
                      var8 = var8 + var17.d(cq.a(param1, 1033));
                      ((ad) this).field_m[var10] = var8 + var17.d(cq.a(param1, 1033));
                      if (((ad) this).field_m[var10] > var9) {
                        var9 = ((ad) this).field_m[var10];
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
                ((ad) this).field_d = 1 + var9;
                if (var7 == 0) {
                  break L8;
                } else {
                  ((ad) this).field_a = new byte[((ad) this).field_d][];
                  break L8;
                }
              }
              L9: {
                ((ad) this).field_k = new int[((ad) this).field_d][];
                ((ad) this).field_s = new int[((ad) this).field_d];
                ((ad) this).field_w = new int[((ad) this).field_d];
                ((ad) this).field_i = new int[((ad) this).field_d];
                ((ad) this).field_z = new int[((ad) this).field_d];
                if (var6 == 0) {
                  break L9;
                } else {
                  ((ad) this).field_f = new int[((ad) this).field_d];
                  var10 = 0;
                  L10: while (true) {
                    if (((ad) this).field_d <= var10) {
                      var10 = 0;
                      L11: while (true) {
                        if (((ad) this).field_g <= var10) {
                          ((ad) this).field_p = new wi(((ad) this).field_f);
                          break L9;
                        } else {
                          ((ad) this).field_f[((ad) this).field_m[var10]] = var17.b(true);
                          var10++;
                          continue L11;
                        }
                      }
                    } else {
                      ((ad) this).field_f[var10] = -1;
                      var10++;
                      continue L10;
                    }
                  }
                }
              }
              var10 = 0;
              L12: while (true) {
                if (((ad) this).field_g <= var10) {
                  L13: {
                    if (var7 == 0) {
                      break L13;
                    } else {
                      var10 = 0;
                      L14: while (true) {
                        if (var10 >= ((ad) this).field_g) {
                          break L13;
                        } else {
                          var21 = new byte[64];
                          var17.a(0, (byte) -118, var21, 64);
                          ((ad) this).field_a[((ad) this).field_m[var10]] = var21;
                          var10++;
                          continue L14;
                        }
                      }
                    }
                  }
                  var10 = 0;
                  L15: while (true) {
                    if (((ad) this).field_g <= var10) {
                      L16: {
                        if (var4 >= 7) {
                          var10 = 0;
                          L17: while (true) {
                            if (((ad) this).field_g <= var10) {
                              var10 = 0;
                              L18: while (true) {
                                if (var10 >= ((ad) this).field_g) {
                                  break L16;
                                } else {
                                  var11 = ((ad) this).field_m[var10];
                                  var8 = 0;
                                  var12 = ((ad) this).field_s[var11];
                                  ((ad) this).field_k[var11] = new int[var12];
                                  var13 = -1;
                                  var14 = 0;
                                  L19: while (true) {
                                    if (var14 >= var12) {
                                      ((ad) this).field_z[var11] = var13 - -1;
                                      if (1 + var13 == var12) {
                                        ((ad) this).field_k[var11] = null;
                                        var10++;
                                        continue L18;
                                      } else {
                                        var10++;
                                        continue L18;
                                      }
                                    } else {
                                      var8 = var8 + var17.c(81);
                                      ((ad) this).field_k[var11][var14] = var8 + var17.c(81);
                                      var15 = var8 + var17.c(81);
                                      if (var13 < var15) {
                                        var13 = var15;
                                        var14++;
                                        continue L19;
                                      } else {
                                        var14++;
                                        continue L19;
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              ((ad) this).field_s[((ad) this).field_m[var10]] = var17.c(cq.a(param1, -103));
                              var10++;
                              continue L17;
                            }
                          }
                        } else {
                          var10 = 0;
                          L20: while (true) {
                            if (var10 >= ((ad) this).field_g) {
                              var10 = 0;
                              L21: while (true) {
                                if (var10 >= ((ad) this).field_g) {
                                  break L16;
                                } else {
                                  var11 = ((ad) this).field_m[var10];
                                  var8 = 0;
                                  var12 = ((ad) this).field_s[var11];
                                  var13 = -1;
                                  ((ad) this).field_k[var11] = new int[var12];
                                  var14 = 0;
                                  L22: while (true) {
                                    if (var14 >= var12) {
                                      ((ad) this).field_z[var11] = var13 + 1;
                                      if (var12 == 1 + var13) {
                                        ((ad) this).field_k[var11] = null;
                                        var10++;
                                        continue L21;
                                      } else {
                                        var10++;
                                        continue L21;
                                      }
                                    } else {
                                      var8 = var8 + var17.d(-1034);
                                      ((ad) this).field_k[var11][var14] = var8 + var17.d(-1034);
                                      var15 = var8 + var17.d(-1034);
                                      if (var13 < var15) {
                                        var13 = var15;
                                        var14++;
                                        continue L22;
                                      } else {
                                        var14++;
                                        continue L22;
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              ((ad) this).field_s[((ad) this).field_m[var10]] = var17.d(param1 + -1033);
                              var10++;
                              continue L20;
                            }
                          }
                        }
                      }
                      L23: {
                        if (var6 == 0) {
                          break L23;
                        } else {
                          ((ad) this).field_n = new wi[1 + var9];
                          ((ad) this).field_j = new int[var9 - -1][];
                          var10 = 0;
                          L24: while (true) {
                            if (var10 >= ((ad) this).field_g) {
                              break L23;
                            } else {
                              var11 = ((ad) this).field_m[var10];
                              var12 = ((ad) this).field_s[var11];
                              ((ad) this).field_j[var11] = new int[((ad) this).field_z[var11]];
                              var13 = 0;
                              L25: while (true) {
                                if (((ad) this).field_z[var11] <= var13) {
                                  var13 = 0;
                                  L26: while (true) {
                                    if (var13 >= var12) {
                                      ((ad) this).field_n[var11] = new wi(((ad) this).field_j[var11]);
                                      var10++;
                                      continue L24;
                                    } else {
                                      L27: {
                                        if (((ad) this).field_k[var11] != null) {
                                          var14 = ((ad) this).field_k[var11][var13];
                                          break L27;
                                        } else {
                                          var14 = var13;
                                          break L27;
                                        }
                                      }
                                      ((ad) this).field_j[var11][var14] = var17.b(true);
                                      var13++;
                                      continue L26;
                                    }
                                  }
                                } else {
                                  ((ad) this).field_j[var11][var13] = -1;
                                  var13++;
                                  continue L25;
                                }
                              }
                            }
                          }
                        }
                      }
                      return;
                    } else {
                      ((ad) this).field_i[((ad) this).field_m[var10]] = var17.b(true);
                      var10++;
                      continue L15;
                    }
                  }
                } else {
                  ((ad) this).field_w[((ad) this).field_m[var10]] = var17.b(true);
                  var10++;
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

    ad(byte[] param0, int param1, byte[] param2) {
        int var4 = 0;
        ((ad) this).field_v = qo.a(param0.length, param0, 0);
        if (((ad) this).field_v != param1) {
            throw new RuntimeException();
        }
        if (param2 != null) {
            if (param2.length != 64) {
                throw new RuntimeException();
            }
            ((ad) this).field_q = jr.a(param0.length, (byte) -51, param0, 0);
            for (var4 = 0; var4 < 64; var4++) {
                if (param2[var4] != ((ad) this).field_q[var4]) {
                    throw new RuntimeException();
                }
            }
        }
        this.a(param0, -1);
    }

    final static dd a(int param0, int param1, int param2) {
        int var4 = 0;
        if (param2 != 7) {
            ad.a(82);
        }
        dd var5 = new dd(param1, param1);
        dd var3 = var5;
        for (var4 = 0; var4 < var3.field_D.length; var4++) {
            var5.field_D[var4] = param0;
        }
        return var3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = new ko();
        field_e = "Cancel";
        field_o = new int[]{2, 20, 21, 49, 5, 3, 9};
        field_b = "<%0> gained 1 life!";
        field_t = "Create a free Account";
    }
}
