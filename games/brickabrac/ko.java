/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ko {
    private byte[] field_o;
    private int[] field_k;
    int field_b;
    static int field_s;
    int field_f;
    lm field_n;
    static int field_e;
    int[] field_g;
    int[] field_l;
    static mh field_j;
    int[] field_r;
    lm[] field_i;
    int[] field_p;
    int[] field_m;
    private int[][] field_t;
    int field_a;
    private int field_d;
    int[][] field_h;
    byte[][] field_c;
    static String field_q;

    private final void a(byte[] param0, boolean param1) {
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
        wq var17 = null;
        byte[] var21 = null;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackOut_9_0;
        int stackOut_8_0;
        int stackOut_12_0;
        int stackOut_11_0;
        L0: {
          var16 = BrickABrac.field_J ? 1 : 0;
          var17 = new wq(i.a(true, param0));
          var4 = var17.l(255);
          if (-6 < (var4 ^ -1)) {
            break L0;
          } else {
            if (var4 > 7) {
              break L0;
            } else {
              L1: {
                if (var4 < 6) {
                  ((ko) this).field_a = 0;
                  break L1;
                } else {
                  ((ko) this).field_a = var17.e(255);
                  break L1;
                }
              }
              L2: {
                var5 = var17.l(255);
                if (0 == (var5 & 1)) {
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
                if (0 == (var5 & 2)) {
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
                if (var4 >= 7) {
                  ((ko) this).field_d = var17.c(false);
                  break L4;
                } else {
                  ((ko) this).field_d = var17.i(65280);
                  break L4;
                }
              }
              L5: {
                var8 = 0;
                ((ko) this).field_g = new int[((ko) this).field_d];
                if (!param1) {
                  break L5;
                } else {
                  ko.a((byte) 19);
                  break L5;
                }
              }
              L6: {
                var9 = -1;
                if (-8 >= (var4 ^ -1)) {
                  var10 = 0;
                  L7: while (true) {
                    if (var10 >= ((ko) this).field_d) {
                      break L6;
                    } else {
                      var8 = var8 + var17.c(false);
                      ((ko) this).field_g[var10] = var8 + var17.c(false);
                      if (var9 < ((ko) this).field_g[var10]) {
                        var9 = ((ko) this).field_g[var10];
                        var10++;
                        continue L7;
                      } else {
                        var10++;
                        continue L7;
                      }
                    }
                  }
                } else {
                  var10 = 0;
                  L8: while (true) {
                    if (var10 >= ((ko) this).field_d) {
                      break L6;
                    } else {
                      var8 = var8 + var17.i(65280);
                      ((ko) this).field_g[var10] = var8 + var17.i(65280);
                      if (var9 < ((ko) this).field_g[var10]) {
                        var9 = ((ko) this).field_g[var10];
                        var10++;
                        continue L8;
                      } else {
                        var10++;
                        continue L8;
                      }
                    }
                  }
                }
              }
              L9: {
                ((ko) this).field_f = 1 + var9;
                ((ko) this).field_r = new int[((ko) this).field_f];
                if (var7 == 0) {
                  break L9;
                } else {
                  ((ko) this).field_c = new byte[((ko) this).field_f][];
                  break L9;
                }
              }
              L10: {
                ((ko) this).field_l = new int[((ko) this).field_f];
                ((ko) this).field_p = new int[((ko) this).field_f];
                ((ko) this).field_m = new int[((ko) this).field_f];
                ((ko) this).field_h = new int[((ko) this).field_f][];
                if (var6 != 0) {
                  ((ko) this).field_k = new int[((ko) this).field_f];
                  var10 = 0;
                  L11: while (true) {
                    if (((ko) this).field_f <= var10) {
                      var10 = 0;
                      L12: while (true) {
                        if (var10 >= ((ko) this).field_d) {
                          ((ko) this).field_n = new lm(((ko) this).field_k);
                          break L10;
                        } else {
                          ((ko) this).field_k[((ko) this).field_g[var10]] = var17.e(255);
                          var10++;
                          continue L12;
                        }
                      }
                    } else {
                      ((ko) this).field_k[var10] = -1;
                      var10++;
                      continue L11;
                    }
                  }
                } else {
                  break L10;
                }
              }
              var10 = 0;
              L13: while (true) {
                if (((ko) this).field_d <= var10) {
                  L14: {
                    if (var7 == 0) {
                      break L14;
                    } else {
                      var10 = 0;
                      L15: while (true) {
                        if (var10 >= ((ko) this).field_d) {
                          break L14;
                        } else {
                          var21 = new byte[64];
                          var17.a(0, var21, 110, 64);
                          ((ko) this).field_c[((ko) this).field_g[var10]] = var21;
                          var10++;
                          continue L15;
                        }
                      }
                    }
                  }
                  var10 = 0;
                  L16: while (true) {
                    if (((ko) this).field_d <= var10) {
                      L17: {
                        if (var4 < 7) {
                          var10 = 0;
                          L18: while (true) {
                            if (var10 >= ((ko) this).field_d) {
                              var10 = 0;
                              L19: while (true) {
                                if (((ko) this).field_d <= var10) {
                                  break L17;
                                } else {
                                  var11 = ((ko) this).field_g[var10];
                                  var8 = 0;
                                  var12 = ((ko) this).field_m[var11];
                                  var13 = -1;
                                  ((ko) this).field_h[var11] = new int[var12];
                                  var14 = 0;
                                  L20: while (true) {
                                    if (var14 >= var12) {
                                      ((ko) this).field_l[var11] = 1 + var13;
                                      if (var13 - -1 == var12) {
                                        ((ko) this).field_h[var11] = null;
                                        var10++;
                                        continue L19;
                                      } else {
                                        var10++;
                                        continue L19;
                                      }
                                    } else {
                                      var8 = var8 + var17.i(65280);
                                      ((ko) this).field_h[var11][var14] = var8 + var17.i(65280);
                                      var15 = var8 + var17.i(65280);
                                      if (var15 > var13) {
                                        var13 = var15;
                                        var14++;
                                        continue L20;
                                      } else {
                                        var14++;
                                        continue L20;
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              ((ko) this).field_m[((ko) this).field_g[var10]] = var17.i(65280);
                              var10++;
                              continue L18;
                            }
                          }
                        } else {
                          var10 = 0;
                          L21: while (true) {
                            if (var10 >= ((ko) this).field_d) {
                              var10 = 0;
                              L22: while (true) {
                                if (((ko) this).field_d <= var10) {
                                  break L17;
                                } else {
                                  var11 = ((ko) this).field_g[var10];
                                  var8 = 0;
                                  var12 = ((ko) this).field_m[var11];
                                  ((ko) this).field_h[var11] = new int[var12];
                                  var13 = -1;
                                  var14 = 0;
                                  L23: while (true) {
                                    if (var14 >= var12) {
                                      ((ko) this).field_l[var11] = var13 + 1;
                                      if (1 + var13 == var12) {
                                        ((ko) this).field_h[var11] = null;
                                        var10++;
                                        continue L22;
                                      } else {
                                        var10++;
                                        continue L22;
                                      }
                                    } else {
                                      var8 = var8 + var17.c(false);
                                      ((ko) this).field_h[var11][var14] = var8 + var17.c(false);
                                      var15 = var8 + var17.c(false);
                                      if (var13 < var15) {
                                        var13 = var15;
                                        var14++;
                                        continue L23;
                                      } else {
                                        var14++;
                                        continue L23;
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              ((ko) this).field_m[((ko) this).field_g[var10]] = var17.c(false);
                              var10++;
                              continue L21;
                            }
                          }
                        }
                      }
                      L24: {
                        if (var6 == 0) {
                          break L24;
                        } else {
                          ((ko) this).field_i = new lm[var9 + 1];
                          ((ko) this).field_t = new int[1 + var9][];
                          var10 = 0;
                          L25: while (true) {
                            if (((ko) this).field_d <= var10) {
                              break L24;
                            } else {
                              var11 = ((ko) this).field_g[var10];
                              var12 = ((ko) this).field_m[var11];
                              ((ko) this).field_t[var11] = new int[((ko) this).field_l[var11]];
                              var13 = 0;
                              L26: while (true) {
                                if (((ko) this).field_l[var11] <= var13) {
                                  var13 = 0;
                                  L27: while (true) {
                                    if (var13 >= var12) {
                                      ((ko) this).field_i[var11] = new lm(((ko) this).field_t[var11]);
                                      var10++;
                                      continue L25;
                                    } else {
                                      L28: {
                                        if (null == ((ko) this).field_h[var11]) {
                                          var14 = var13;
                                          break L28;
                                        } else {
                                          var14 = ((ko) this).field_h[var11][var13];
                                          break L28;
                                        }
                                      }
                                      ((ko) this).field_t[var11][var14] = var17.e(255);
                                      var13++;
                                      continue L27;
                                    }
                                  }
                                } else {
                                  ((ko) this).field_t[var11][var13] = -1;
                                  var13++;
                                  continue L26;
                                }
                              }
                            }
                          }
                        }
                      }
                      return;
                    } else {
                      ((ko) this).field_r[((ko) this).field_g[var10]] = var17.e(255);
                      var10++;
                      continue L16;
                    }
                  }
                } else {
                  ((ko) this).field_p[((ko) this).field_g[var10]] = var17.e(255);
                  var10++;
                  continue L13;
                }
              }
            }
          }
        }
        throw new RuntimeException();
    }

    final static void a(int param0) {
        int var2 = BrickABrac.field_J ? 1 : 0;
        if (ml.field_b > 0) {
            ml.field_b = ml.field_b - 1;
        } else {
            if (pe.field_j > 0) {
                pe.field_j = pe.field_j - 1;
            } else {
                if (eg.field_m < -1) {
                    eg.field_m = eg.field_m - 1;
                }
            }
        }
        if (param0 != -32120) {
            return;
        }
        if (!(-1 >= ml.field_b)) {
            on.e(param0 ^ 32040);
        }
        if (!(pe.field_j <= 0)) {
            co.a(pe.field_j, false);
        }
        if (eg.field_m > 0) {
            co.a(eg.field_m, false);
        }
    }

    final static void a(int param0, int param1, jp param2, int param3, jp param4, int param5, int param6, int param7, int param8, int param9, jp param10) {
        param4.d(param8 - (-((-param4.field_x + param6) / 2) + -(5 * param3 >> 1594706992)), param9);
        if (param0 > -20) {
            field_s = 123;
        }
        param10.c(-(30 / param7) + (param8 + ((-param10.field_x + param6) / 2 - -(param3 * 10 >> 1124111280))), 37 / param7 + (-param10.field_z + 480 + param9) - -param1);
        param2.c(param8 - (-((param6 - param2.field_x) / 2) + -(20 * param3 >> 1188009520)) - 5 / param7, -param2.field_z + 480 + (param9 - -param1));
    }

    public static void a(byte param0) {
        if (param0 <= 108) {
            return;
        }
        field_q = null;
        field_j = null;
    }

    ko(byte[] param0, int param1, byte[] param2) {
        int var4 = 0;
        ((ko) this).field_b = cg.a(param0.length, param0, (byte) -86);
        if (param1 != ((ko) this).field_b) {
            throw new RuntimeException();
        }
        if (param2 != null) {
            if (-65 != param2.length) {
                throw new RuntimeException();
            }
            ((ko) this).field_o = jd.a(param0, 0, -14970, param0.length);
            for (var4 = 0; -65 > var4; var4++) {
                if (((ko) this).field_o[var4] != param2[var4]) {
                    throw new RuntimeException();
                }
            }
        }
        this.a(param0, false);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "PER MONTH";
    }
}
