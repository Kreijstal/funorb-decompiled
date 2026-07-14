/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tm {
    int[][] field_m;
    ra field_a;
    int[] field_o;
    private int[][] field_d;
    int[] field_i;
    private int[] field_c;
    int[] field_k;
    private byte[] field_r;
    int[] field_q;
    int[] field_j;
    private int field_h;
    static wh field_b;
    int field_s;
    static int field_e;
    static cn field_p;
    ra[] field_n;
    int field_l;
    byte[][] field_g;
    int field_f;

    private final void a(byte[] param0, byte param1) {
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
        ec var17 = null;
        byte[] var21 = null;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        L0: {
          var16 = DungeonAssault.field_K;
          var17 = new ec(lc.a(param0, 50166));
          var4 = var17.c(true);
          if (5 > var4) {
            break L0;
          } else {
            if (7 >= var4) {
              if (param1 > 97) {
                L1: {
                  if (6 > var4) {
                    ((tm) this).field_s = 0;
                    break L1;
                  } else {
                    ((tm) this).field_s = var17.h(-42);
                    break L1;
                  }
                }
                L2: {
                  var5 = var17.c(true);
                  if ((1 & var5) == 0) {
                    stackOut_11_0 = 0;
                    stackIn_12_0 = stackOut_11_0;
                    break L2;
                  } else {
                    stackOut_10_0 = 1;
                    stackIn_12_0 = stackOut_10_0;
                    break L2;
                  }
                }
                L3: {
                  var6 = stackIn_12_0;
                  if (0 == (var5 & 2)) {
                    stackOut_14_0 = 0;
                    stackIn_15_0 = stackOut_14_0;
                    break L3;
                  } else {
                    stackOut_13_0 = 1;
                    stackIn_15_0 = stackOut_13_0;
                    break L3;
                  }
                }
                L4: {
                  var7 = stackIn_15_0;
                  if ((var4 ^ -1) <= -8) {
                    ((tm) this).field_h = var17.j(1);
                    break L4;
                  } else {
                    ((tm) this).field_h = var17.k(0);
                    break L4;
                  }
                }
                L5: {
                  var8 = 0;
                  var9 = -1;
                  ((tm) this).field_j = new int[((tm) this).field_h];
                  if (7 > var4) {
                    var10 = 0;
                    L6: while (true) {
                      if (((tm) this).field_h <= var10) {
                        break L5;
                      } else {
                        var8 = var8 + var17.k(0);
                        ((tm) this).field_j[var10] = var8 + var17.k(0);
                        if (((tm) this).field_j[var10] > var9) {
                          var9 = ((tm) this).field_j[var10];
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
                      if (((tm) this).field_h <= var10) {
                        break L5;
                      } else {
                        var8 = var8 + var17.j(1);
                        ((tm) this).field_j[var10] = var8 + var17.j(1);
                        if (var9 < ((tm) this).field_j[var10]) {
                          var9 = ((tm) this).field_j[var10];
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
                  ((tm) this).field_l = 1 + var9;
                  ((tm) this).field_m = new int[((tm) this).field_l][];
                  if (var7 != 0) {
                    ((tm) this).field_g = new byte[((tm) this).field_l][];
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  ((tm) this).field_o = new int[((tm) this).field_l];
                  ((tm) this).field_i = new int[((tm) this).field_l];
                  ((tm) this).field_q = new int[((tm) this).field_l];
                  ((tm) this).field_k = new int[((tm) this).field_l];
                  if (var6 != 0) {
                    ((tm) this).field_c = new int[((tm) this).field_l];
                    var10 = 0;
                    L10: while (true) {
                      if (var10 >= ((tm) this).field_l) {
                        var10 = 0;
                        L11: while (true) {
                          if (((tm) this).field_h <= var10) {
                            ((tm) this).field_a = new ra(((tm) this).field_c);
                            break L9;
                          } else {
                            ((tm) this).field_c[((tm) this).field_j[var10]] = var17.h(-50);
                            var10++;
                            continue L11;
                          }
                        }
                      } else {
                        ((tm) this).field_c[var10] = -1;
                        var10++;
                        continue L10;
                      }
                    }
                  } else {
                    break L9;
                  }
                }
                var10 = 0;
                L12: while (true) {
                  if (((tm) this).field_h <= var10) {
                    L13: {
                      if (var7 == 0) {
                        break L13;
                      } else {
                        var10 = 0;
                        L14: while (true) {
                          if (((tm) this).field_h <= var10) {
                            break L13;
                          } else {
                            var21 = new byte[64];
                            var17.a((byte) -124, 0, 64, var21);
                            ((tm) this).field_g[((tm) this).field_j[var10]] = var21;
                            var10++;
                            continue L14;
                          }
                        }
                      }
                    }
                    var10 = 0;
                    L15: while (true) {
                      if (var10 >= ((tm) this).field_h) {
                        L16: {
                          if (var4 >= 7) {
                            var10 = 0;
                            L17: while (true) {
                              if (var10 >= ((tm) this).field_h) {
                                var10 = 0;
                                L18: while (true) {
                                  if (var10 >= ((tm) this).field_h) {
                                    break L16;
                                  } else {
                                    var11 = ((tm) this).field_j[var10];
                                    var8 = 0;
                                    var12 = ((tm) this).field_k[var11];
                                    var13 = -1;
                                    ((tm) this).field_m[var11] = new int[var12];
                                    var14 = 0;
                                    L19: while (true) {
                                      if (var12 <= var14) {
                                        ((tm) this).field_i[var11] = 1 + var13;
                                        if (var12 == 1 + var13) {
                                          ((tm) this).field_m[var11] = null;
                                          var10++;
                                          continue L18;
                                        } else {
                                          var10++;
                                          continue L18;
                                        }
                                      } else {
                                        var8 = var8 + var17.j(1);
                                        ((tm) this).field_m[var11][var14] = var8 + var17.j(1);
                                        var15 = var8 + var17.j(1);
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
                                ((tm) this).field_k[((tm) this).field_j[var10]] = var17.j(1);
                                var10++;
                                continue L17;
                              }
                            }
                          } else {
                            var10 = 0;
                            L20: while (true) {
                              if (var10 >= ((tm) this).field_h) {
                                var10 = 0;
                                L21: while (true) {
                                  if (((tm) this).field_h <= var10) {
                                    break L16;
                                  } else {
                                    var11 = ((tm) this).field_j[var10];
                                    var8 = 0;
                                    var12 = ((tm) this).field_k[var11];
                                    ((tm) this).field_m[var11] = new int[var12];
                                    var13 = -1;
                                    var14 = 0;
                                    L22: while (true) {
                                      if (var12 <= var14) {
                                        ((tm) this).field_i[var11] = 1 + var13;
                                        if (var12 == 1 + var13) {
                                          ((tm) this).field_m[var11] = null;
                                          var10++;
                                          continue L21;
                                        } else {
                                          var10++;
                                          continue L21;
                                        }
                                      } else {
                                        var8 = var8 + var17.k(0);
                                        ((tm) this).field_m[var11][var14] = var8 + var17.k(0);
                                        var15 = var8 + var17.k(0);
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
                                ((tm) this).field_k[((tm) this).field_j[var10]] = var17.k(0);
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
                            ((tm) this).field_d = new int[1 + var9][];
                            ((tm) this).field_n = new ra[var9 + 1];
                            var10 = 0;
                            L24: while (true) {
                              if (var10 >= ((tm) this).field_h) {
                                break L23;
                              } else {
                                var11 = ((tm) this).field_j[var10];
                                var12 = ((tm) this).field_k[var11];
                                ((tm) this).field_d[var11] = new int[((tm) this).field_i[var11]];
                                var13 = 0;
                                L25: while (true) {
                                  if (((tm) this).field_i[var11] <= var13) {
                                    var13 = 0;
                                    L26: while (true) {
                                      if (var13 >= var12) {
                                        ((tm) this).field_n[var11] = new ra(((tm) this).field_d[var11]);
                                        var10++;
                                        continue L24;
                                      } else {
                                        L27: {
                                          if (((tm) this).field_m[var11] != null) {
                                            var14 = ((tm) this).field_m[var11][var13];
                                            break L27;
                                          } else {
                                            var14 = var13;
                                            break L27;
                                          }
                                        }
                                        ((tm) this).field_d[var11][var14] = var17.h(-81);
                                        var13++;
                                        continue L26;
                                      }
                                    }
                                  } else {
                                    ((tm) this).field_d[var11][var13] = -1;
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
                        ((tm) this).field_o[((tm) this).field_j[var10]] = var17.h(-100);
                        var10++;
                        continue L15;
                      }
                    }
                  } else {
                    ((tm) this).field_q[((tm) this).field_j[var10]] = var17.h(-77);
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
        field_p = null;
        field_b = null;
        int var1 = 32 / ((param0 - 5) / 55);
    }

    tm(byte[] param0, int param1, byte[] param2) {
        int var4 = 0;
        ((tm) this).field_f = qh.a(16777215, param0, param0.length);
        if (param1 != ((tm) this).field_f) {
            throw new RuntimeException();
        }
        if (param2 != null) {
            if (param2.length != 64) {
                throw new RuntimeException();
            }
            ((tm) this).field_r = rn.a(param0.length, 0, 8, param0);
            for (var4 = 0; (var4 ^ -1) > -65; var4++) {
                if (param2[var4] != ((tm) this).field_r[var4]) {
                    throw new RuntimeException();
                }
            }
        }
        this.a(param0, (byte) 118);
    }

    static {
    }
}
