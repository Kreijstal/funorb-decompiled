/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hd {
    private int field_n;
    int field_s;
    private int[] field_m;
    private int[][] field_a;
    int[] field_d;
    int[] field_i;
    int[] field_r;
    static ba field_q;
    int[] field_l;
    int[][] field_f;
    int field_p;
    private byte[] field_h;
    int[] field_c;
    int field_b;
    af field_o;
    byte[][] field_k;
    static hj field_e;
    static int field_t;
    af[] field_g;
    static String field_j;

    private final void a(int param0, byte[] param1) {
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
        mg var17 = null;
        byte[] var21 = null;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        L0: {
          var16 = OrbDefence.field_D ? 1 : 0;
          var17 = new mg(nf.a(param1, -2));
          var4 = var17.b((byte) 90);
          if (-6 < (var4 ^ -1)) {
            break L0;
          } else {
            if (7 < var4) {
              break L0;
            } else {
              L1: {
                if (6 <= var4) {
                  ((hd) this).field_b = var17.l(0);
                  break L1;
                } else {
                  ((hd) this).field_b = 0;
                  break L1;
                }
              }
              L2: {
                var5 = var17.b((byte) 90);
                if (param0 >= 63) {
                  break L2;
                } else {
                  field_q = null;
                  break L2;
                }
              }
              L3: {
                if ((1 & var5) == 0) {
                  stackOut_11_0 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  break L3;
                } else {
                  stackOut_10_0 = 1;
                  stackIn_12_0 = stackOut_10_0;
                  break L3;
                }
              }
              L4: {
                var6 = stackIn_12_0;
                if ((2 & var5) == 0) {
                  stackOut_14_0 = 0;
                  stackIn_15_0 = stackOut_14_0;
                  break L4;
                } else {
                  stackOut_13_0 = 1;
                  stackIn_15_0 = stackOut_13_0;
                  break L4;
                }
              }
              L5: {
                var7 = stackIn_15_0;
                if (var4 >= 7) {
                  ((hd) this).field_n = var17.d(true);
                  break L5;
                } else {
                  ((hd) this).field_n = var17.j(98203176);
                  break L5;
                }
              }
              L6: {
                var8 = 0;
                ((hd) this).field_c = new int[((hd) this).field_n];
                var9 = -1;
                if (-8 >= (var4 ^ -1)) {
                  var10 = 0;
                  L7: while (true) {
                    if (var10 >= ((hd) this).field_n) {
                      break L6;
                    } else {
                      var8 = var8 + var17.d(true);
                      ((hd) this).field_c[var10] = var8 + var17.d(true);
                      if (((hd) this).field_c[var10] > var9) {
                        var9 = ((hd) this).field_c[var10];
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
                    if (var10 >= ((hd) this).field_n) {
                      break L6;
                    } else {
                      var8 = var8 + var17.j(98203176);
                      ((hd) this).field_c[var10] = var8 + var17.j(98203176);
                      if (var9 < ((hd) this).field_c[var10]) {
                        var9 = ((hd) this).field_c[var10];
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
                ((hd) this).field_s = var9 - -1;
                ((hd) this).field_l = new int[((hd) this).field_s];
                ((hd) this).field_i = new int[((hd) this).field_s];
                ((hd) this).field_r = new int[((hd) this).field_s];
                if (var7 != 0) {
                  ((hd) this).field_k = new byte[((hd) this).field_s][];
                  break L9;
                } else {
                  break L9;
                }
              }
              L10: {
                ((hd) this).field_d = new int[((hd) this).field_s];
                ((hd) this).field_f = new int[((hd) this).field_s][];
                if (var6 == 0) {
                  break L10;
                } else {
                  ((hd) this).field_m = new int[((hd) this).field_s];
                  var10 = 0;
                  L11: while (true) {
                    if (var10 >= ((hd) this).field_s) {
                      var10 = 0;
                      L12: while (true) {
                        if (((hd) this).field_n <= var10) {
                          ((hd) this).field_o = new af(((hd) this).field_m);
                          break L10;
                        } else {
                          ((hd) this).field_m[((hd) this).field_c[var10]] = var17.l(0);
                          var10++;
                          continue L12;
                        }
                      }
                    } else {
                      ((hd) this).field_m[var10] = -1;
                      var10++;
                      continue L11;
                    }
                  }
                }
              }
              var10 = 0;
              L13: while (true) {
                if (var10 >= ((hd) this).field_n) {
                  L14: {
                    if (var7 == 0) {
                      break L14;
                    } else {
                      var10 = 0;
                      L15: while (true) {
                        if (var10 >= ((hd) this).field_n) {
                          break L14;
                        } else {
                          var21 = new byte[64];
                          var17.a((byte) 115, var21, 0, 64);
                          ((hd) this).field_k[((hd) this).field_c[var10]] = var21;
                          var10++;
                          continue L15;
                        }
                      }
                    }
                  }
                  var10 = 0;
                  L16: while (true) {
                    if (var10 >= ((hd) this).field_n) {
                      L17: {
                        if (-8 >= (var4 ^ -1)) {
                          var10 = 0;
                          L18: while (true) {
                            if (((hd) this).field_n <= var10) {
                              var10 = 0;
                              L19: while (true) {
                                if (((hd) this).field_n <= var10) {
                                  break L17;
                                } else {
                                  var11 = ((hd) this).field_c[var10];
                                  var8 = 0;
                                  var12 = ((hd) this).field_d[var11];
                                  ((hd) this).field_f[var11] = new int[var12];
                                  var13 = -1;
                                  var14 = 0;
                                  L20: while (true) {
                                    if (var12 <= var14) {
                                      ((hd) this).field_l[var11] = var13 - -1;
                                      if (var12 == var13 - -1) {
                                        ((hd) this).field_f[var11] = null;
                                        var10++;
                                        continue L19;
                                      } else {
                                        var10++;
                                        continue L19;
                                      }
                                    } else {
                                      var8 = var8 + var17.d(true);
                                      ((hd) this).field_f[var11][var14] = var8 + var17.d(true);
                                      var15 = var8 + var17.d(true);
                                      if (var13 < var15) {
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
                              ((hd) this).field_d[((hd) this).field_c[var10]] = var17.d(true);
                              var10++;
                              continue L18;
                            }
                          }
                        } else {
                          var10 = 0;
                          L21: while (true) {
                            if (((hd) this).field_n <= var10) {
                              var10 = 0;
                              L22: while (true) {
                                if (((hd) this).field_n <= var10) {
                                  break L17;
                                } else {
                                  var11 = ((hd) this).field_c[var10];
                                  var8 = 0;
                                  var12 = ((hd) this).field_d[var11];
                                  ((hd) this).field_f[var11] = new int[var12];
                                  var13 = -1;
                                  var14 = 0;
                                  L23: while (true) {
                                    if (var12 <= var14) {
                                      ((hd) this).field_l[var11] = 1 + var13;
                                      if (var13 + 1 == var12) {
                                        ((hd) this).field_f[var11] = null;
                                        var10++;
                                        continue L22;
                                      } else {
                                        var10++;
                                        continue L22;
                                      }
                                    } else {
                                      var8 = var8 + var17.j(98203176);
                                      ((hd) this).field_f[var11][var14] = var8 + var17.j(98203176);
                                      var15 = var8 + var17.j(98203176);
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
                              ((hd) this).field_d[((hd) this).field_c[var10]] = var17.j(98203176);
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
                          ((hd) this).field_g = new af[1 + var9];
                          ((hd) this).field_a = new int[var9 + 1][];
                          var10 = 0;
                          L25: while (true) {
                            if (((hd) this).field_n <= var10) {
                              break L24;
                            } else {
                              var11 = ((hd) this).field_c[var10];
                              var12 = ((hd) this).field_d[var11];
                              ((hd) this).field_a[var11] = new int[((hd) this).field_l[var11]];
                              var13 = 0;
                              L26: while (true) {
                                if (((hd) this).field_l[var11] <= var13) {
                                  var13 = 0;
                                  L27: while (true) {
                                    if (var13 >= var12) {
                                      ((hd) this).field_g[var11] = new af(((hd) this).field_a[var11]);
                                      var10++;
                                      continue L25;
                                    } else {
                                      L28: {
                                        if (null != ((hd) this).field_f[var11]) {
                                          var14 = ((hd) this).field_f[var11][var13];
                                          break L28;
                                        } else {
                                          var14 = var13;
                                          break L28;
                                        }
                                      }
                                      ((hd) this).field_a[var11][var14] = var17.l(0);
                                      var13++;
                                      continue L27;
                                    }
                                  }
                                } else {
                                  ((hd) this).field_a[var11][var13] = -1;
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
                      ((hd) this).field_i[((hd) this).field_c[var10]] = var17.l(0);
                      var10++;
                      continue L16;
                    }
                  }
                } else {
                  ((hd) this).field_r[((hd) this).field_c[var10]] = var17.l(0);
                  var10++;
                  continue L13;
                }
              }
            }
          }
        }
        throw new RuntimeException();
    }

    public static void a(int param0) {
        field_q = null;
        field_j = null;
        if (param0 != 100) {
            hd.a(33);
        }
        field_e = null;
    }

    hd(byte[] param0, int param1, byte[] param2) {
        int var4 = 0;
        ((hd) this).field_p = eg.a(param0, 0, param0.length);
        if (param1 != ((hd) this).field_p) {
            throw new RuntimeException();
        }
        if (param2 != null) {
            if ((param2.length ^ -1) != -65) {
                throw new RuntimeException();
            }
            ((hd) this).field_h = ee.a(-1, param0.length, 0, param0);
            for (var4 = 0; -65 < (var4 ^ -1); var4++) {
                if (((hd) this).field_h[var4] != param2[var4]) {
                    throw new RuntimeException();
                }
            }
        }
        this.a(68, param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = 100;
        field_q = new ba(8, 0, 4, 1);
    }
}
