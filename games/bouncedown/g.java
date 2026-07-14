/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class g {
    da[] field_k;
    private byte[] field_l;
    int[] field_j;
    int field_b;
    private int[] field_d;
    private int field_f;
    int[][] field_o;
    static String field_i;
    int[] field_n;
    int field_m;
    private int[][] field_p;
    da field_a;
    int[] field_g;
    int field_h;
    byte[][] field_e;
    int[] field_c;
    int[] field_q;

    final static we b(int param0) {
        we var1 = new we(se.field_C, fk.field_e, cl.field_n[0], ae.field_c[0], ih.field_V[0], qh.field_i[0], ph.field_c[0], he.field_k);
        if (param0 != -8964) {
            field_i = null;
        }
        vb.a((byte) 122);
        return var1;
    }

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
        wi var17 = null;
        byte[] var21 = null;
        int stackIn_10_0 = 0;
        int stackIn_18_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        L0: {
          var16 = Bounce.field_N;
          var17 = new wi(ta.a(21125, param1));
          var4 = var17.d((byte) -86);
          if (var4 < 5) {
            break L0;
          } else {
            if ((var4 ^ -1) >= -8) {
              L1: {
                if ((var4 ^ -1) > -7) {
                  ((g) this).field_h = 0;
                  break L1;
                } else {
                  ((g) this).field_h = var17.j(param0 ^ 10990);
                  break L1;
                }
              }
              L2: {
                var5 = var17.d((byte) -69);
                if ((1 & var5) == 0) {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  break L2;
                } else {
                  stackOut_8_0 = 1;
                  stackIn_10_0 = stackOut_8_0;
                  break L2;
                }
              }
              var6 = stackIn_10_0;
              if (param0 == -10989) {
                L3: {
                  if ((var4 ^ -1) <= -8) {
                    ((g) this).field_f = var17.e(param0 + 11061);
                    break L3;
                  } else {
                    ((g) this).field_f = var17.a(-1640531527);
                    break L3;
                  }
                }
                L4: {
                  if (-1 == (var5 & 2 ^ -1)) {
                    stackOut_17_0 = 0;
                    stackIn_18_0 = stackOut_17_0;
                    break L4;
                  } else {
                    stackOut_16_0 = 1;
                    stackIn_18_0 = stackOut_16_0;
                    break L4;
                  }
                }
                L5: {
                  var7 = stackIn_18_0;
                  var8 = 0;
                  var9 = -1;
                  ((g) this).field_n = new int[((g) this).field_f];
                  if ((var4 ^ -1) > -8) {
                    var10 = 0;
                    L6: while (true) {
                      if (((g) this).field_f <= var10) {
                        break L5;
                      } else {
                        var8 = var8 + var17.a(-1640531527);
                        ((g) this).field_n[var10] = var8 + var17.a(-1640531527);
                        if (var9 < ((g) this).field_n[var10]) {
                          var9 = ((g) this).field_n[var10];
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
                      if (((g) this).field_f <= var10) {
                        break L5;
                      } else {
                        var8 = var8 + var17.e(48);
                        ((g) this).field_n[var10] = var8 + var17.e(48);
                        if (((g) this).field_n[var10] > var9) {
                          var9 = ((g) this).field_n[var10];
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
                  ((g) this).field_m = 1 + var9;
                  ((g) this).field_o = new int[((g) this).field_m][];
                  ((g) this).field_g = new int[((g) this).field_m];
                  ((g) this).field_j = new int[((g) this).field_m];
                  ((g) this).field_q = new int[((g) this).field_m];
                  ((g) this).field_c = new int[((g) this).field_m];
                  if (var7 == 0) {
                    break L8;
                  } else {
                    ((g) this).field_e = new byte[((g) this).field_m][];
                    break L8;
                  }
                }
                L9: {
                  if (var6 == 0) {
                    break L9;
                  } else {
                    ((g) this).field_d = new int[((g) this).field_m];
                    var10 = 0;
                    L10: while (true) {
                      if (((g) this).field_m <= var10) {
                        var10 = 0;
                        L11: while (true) {
                          if (var10 >= ((g) this).field_f) {
                            ((g) this).field_a = new da(((g) this).field_d);
                            break L9;
                          } else {
                            ((g) this).field_d[((g) this).field_n[var10]] = var17.j(-3);
                            var10++;
                            continue L11;
                          }
                        }
                      } else {
                        ((g) this).field_d[var10] = -1;
                        var10++;
                        continue L10;
                      }
                    }
                  }
                }
                var10 = 0;
                L12: while (true) {
                  if (((g) this).field_f <= var10) {
                    L13: {
                      if (var7 == 0) {
                        break L13;
                      } else {
                        var10 = 0;
                        L14: while (true) {
                          if (((g) this).field_f <= var10) {
                            break L13;
                          } else {
                            var21 = new byte[64];
                            var17.a((byte) 127, 64, var21, 0);
                            ((g) this).field_e[((g) this).field_n[var10]] = var21;
                            var10++;
                            continue L14;
                          }
                        }
                      }
                    }
                    var10 = 0;
                    L15: while (true) {
                      if (((g) this).field_f <= var10) {
                        L16: {
                          if (-8 < (var4 ^ -1)) {
                            var10 = 0;
                            L17: while (true) {
                              if (((g) this).field_f <= var10) {
                                var10 = 0;
                                L18: while (true) {
                                  if (var10 >= ((g) this).field_f) {
                                    break L16;
                                  } else {
                                    var11 = ((g) this).field_n[var10];
                                    var12 = ((g) this).field_q[var11];
                                    var8 = 0;
                                    ((g) this).field_o[var11] = new int[var12];
                                    var13 = -1;
                                    var14 = 0;
                                    L19: while (true) {
                                      if (var14 >= var12) {
                                        ((g) this).field_c[var11] = 1 + var13;
                                        if (var12 == 1 + var13) {
                                          ((g) this).field_o[var11] = null;
                                          var10++;
                                          continue L18;
                                        } else {
                                          var10++;
                                          continue L18;
                                        }
                                      } else {
                                        var8 = var8 + var17.a(-1640531527);
                                        ((g) this).field_o[var11][var14] = var8 + var17.a(-1640531527);
                                        var15 = var8 + var17.a(-1640531527);
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
                                ((g) this).field_q[((g) this).field_n[var10]] = var17.a(-1640531527);
                                var10++;
                                continue L17;
                              }
                            }
                          } else {
                            var10 = 0;
                            L20: while (true) {
                              if (var10 >= ((g) this).field_f) {
                                var10 = 0;
                                L21: while (true) {
                                  if (var10 >= ((g) this).field_f) {
                                    break L16;
                                  } else {
                                    var11 = ((g) this).field_n[var10];
                                    var12 = ((g) this).field_q[var11];
                                    var8 = 0;
                                    ((g) this).field_o[var11] = new int[var12];
                                    var13 = -1;
                                    var14 = 0;
                                    L22: while (true) {
                                      if (var12 <= var14) {
                                        ((g) this).field_c[var11] = 1 + var13;
                                        if (var13 + 1 == var12) {
                                          ((g) this).field_o[var11] = null;
                                          var10++;
                                          continue L21;
                                        } else {
                                          var10++;
                                          continue L21;
                                        }
                                      } else {
                                        var8 = var8 + var17.e(87);
                                        ((g) this).field_o[var11][var14] = var8 + var17.e(87);
                                        var15 = var8 + var17.e(87);
                                        if (var15 > var13) {
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
                                ((g) this).field_q[((g) this).field_n[var10]] = var17.e(param0 + 11067);
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
                            ((g) this).field_k = new da[1 + var9];
                            ((g) this).field_p = new int[var9 + 1][];
                            var10 = 0;
                            L24: while (true) {
                              if (((g) this).field_f <= var10) {
                                break L23;
                              } else {
                                var11 = ((g) this).field_n[var10];
                                var12 = ((g) this).field_q[var11];
                                ((g) this).field_p[var11] = new int[((g) this).field_c[var11]];
                                var13 = 0;
                                L25: while (true) {
                                  if (((g) this).field_c[var11] <= var13) {
                                    var13 = 0;
                                    L26: while (true) {
                                      if (var12 <= var13) {
                                        ((g) this).field_k[var11] = new da(((g) this).field_p[var11]);
                                        var10++;
                                        continue L24;
                                      } else {
                                        L27: {
                                          if (null != ((g) this).field_o[var11]) {
                                            var14 = ((g) this).field_o[var11][var13];
                                            break L27;
                                          } else {
                                            var14 = var13;
                                            break L27;
                                          }
                                        }
                                        ((g) this).field_p[var11][var14] = var17.j(ud.a(param0, 10990));
                                        var13++;
                                        continue L26;
                                      }
                                    }
                                  } else {
                                    ((g) this).field_p[var11][var13] = -1;
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
                        ((g) this).field_g[((g) this).field_n[var10]] = var17.j(-3);
                        var10++;
                        continue L15;
                      }
                    }
                  } else {
                    ((g) this).field_j[((g) this).field_n[var10]] = var17.j(-3);
                    var10++;
                    continue L12;
                  }
                }
              } else {
                return;
              }
            } else {
              break L0;
            }
          }
        }
        throw new RuntimeException();
    }

    public static void a(int param0) {
        field_i = null;
        if (param0 != 6623) {
            we discarded$0 = g.b(-67);
        }
    }

    final static boolean a(boolean param0) {
        if (param0) {
            return false;
        }
        return dl.a((byte) -75);
    }

    g(byte[] param0, int param1, byte[] param2) {
        int var4 = 0;
        ((g) this).field_b = nb.a(param0, param0.length, (byte) 44);
        if (((g) this).field_b != param1) {
            throw new RuntimeException();
        }
        if (param2 != null) {
            if (64 != param2.length) {
                throw new RuntimeException();
            }
            ((g) this).field_l = jd.a(param0, 0, param0.length, 0);
            for (var4 = 0; -65 < (var4 ^ -1); var4++) {
                if (param2[var4] != ((g) this).field_l[var4]) {
                    throw new RuntimeException();
                }
            }
        }
        this.a(-10989, param0);
    }

    static {
    }
}
