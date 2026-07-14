/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pc {
    int[] field_b;
    private int[] field_o;
    int[] field_l;
    byte[][] field_g;
    int field_p;
    static String field_t;
    oe[] field_e;
    int[][] field_r;
    int[] field_a;
    static int field_i;
    private int[][] field_c;
    private byte[] field_j;
    private int field_s;
    static int field_m;
    int[] field_f;
    oe field_q;
    int field_k;
    int field_n;
    int[] field_d;
    static boolean field_h;

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
        be var17 = null;
        byte[] var21 = null;
        int stackIn_10_0 = 0;
        int stackIn_16_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        L0: {
          var16 = TrackController.field_F ? 1 : 0;
          var17 = new be(al.a(-128, param1));
          var4 = var17.h(16383);
          if (5 > var4) {
            break L0;
          } else {
            if (var4 <= 7) {
              L1: {
                if (6 <= var4) {
                  ((pc) this).field_k = var17.e((byte) 113);
                  break L1;
                } else {
                  ((pc) this).field_k = 0;
                  break L1;
                }
              }
              L2: {
                var5 = var17.h(16383);
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
              L3: {
                var6 = stackIn_10_0;
                if (7 <= var4) {
                  ((pc) this).field_s = var17.c(false);
                  break L3;
                } else {
                  ((pc) this).field_s = var17.d((byte) -78);
                  break L3;
                }
              }
              L4: {
                if ((2 & var5) == 0) {
                  stackOut_15_0 = 0;
                  stackIn_16_0 = stackOut_15_0;
                  break L4;
                } else {
                  stackOut_14_0 = 1;
                  stackIn_16_0 = stackOut_14_0;
                  break L4;
                }
              }
              var7 = stackIn_16_0;
              var8 = 0;
              if (param0 == -2) {
                L5: {
                  var9 = -1;
                  ((pc) this).field_f = new int[((pc) this).field_s];
                  if (var4 < 7) {
                    var10 = 0;
                    L6: while (true) {
                      if (((pc) this).field_s <= var10) {
                        break L5;
                      } else {
                        var8 = var8 + var17.d((byte) -62);
                        ((pc) this).field_f[var10] = var8 + var17.d((byte) -62);
                        if (((pc) this).field_f[var10] > var9) {
                          var9 = ((pc) this).field_f[var10];
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
                      if (((pc) this).field_s <= var10) {
                        break L5;
                      } else {
                        var8 = var8 + var17.c(false);
                        ((pc) this).field_f[var10] = var8 + var17.c(false);
                        if (var9 < ((pc) this).field_f[var10]) {
                          var9 = ((pc) this).field_f[var10];
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
                  ((pc) this).field_n = var9 + 1;
                  ((pc) this).field_r = new int[((pc) this).field_n][];
                  if (var7 != 0) {
                    ((pc) this).field_g = new byte[((pc) this).field_n][];
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  ((pc) this).field_a = new int[((pc) this).field_n];
                  ((pc) this).field_b = new int[((pc) this).field_n];
                  ((pc) this).field_d = new int[((pc) this).field_n];
                  ((pc) this).field_l = new int[((pc) this).field_n];
                  if (var6 == 0) {
                    break L9;
                  } else {
                    ((pc) this).field_o = new int[((pc) this).field_n];
                    var10 = 0;
                    L10: while (true) {
                      if (var10 >= ((pc) this).field_n) {
                        var10 = 0;
                        L11: while (true) {
                          if (var10 >= ((pc) this).field_s) {
                            ((pc) this).field_q = new oe(((pc) this).field_o);
                            break L9;
                          } else {
                            ((pc) this).field_o[((pc) this).field_f[var10]] = var17.e((byte) 113);
                            var10++;
                            continue L11;
                          }
                        }
                      } else {
                        ((pc) this).field_o[var10] = -1;
                        var10++;
                        continue L10;
                      }
                    }
                  }
                }
                var10 = 0;
                L12: while (true) {
                  if (var10 >= ((pc) this).field_s) {
                    L13: {
                      if (var7 == 0) {
                        break L13;
                      } else {
                        var10 = 0;
                        L14: while (true) {
                          if (((pc) this).field_s <= var10) {
                            break L13;
                          } else {
                            var21 = new byte[64];
                            var17.a(89, var21, 0, 64);
                            ((pc) this).field_g[((pc) this).field_f[var10]] = var21;
                            var10++;
                            continue L14;
                          }
                        }
                      }
                    }
                    var10 = 0;
                    L15: while (true) {
                      if (var10 >= ((pc) this).field_s) {
                        L16: {
                          if (-8 >= (var4 ^ -1)) {
                            var10 = 0;
                            L17: while (true) {
                              if (var10 >= ((pc) this).field_s) {
                                var10 = 0;
                                L18: while (true) {
                                  if (var10 >= ((pc) this).field_s) {
                                    break L16;
                                  } else {
                                    var11 = ((pc) this).field_f[var10];
                                    var8 = 0;
                                    var12 = ((pc) this).field_l[var11];
                                    ((pc) this).field_r[var11] = new int[var12];
                                    var13 = -1;
                                    var14 = 0;
                                    L19: while (true) {
                                      if (var12 <= var14) {
                                        ((pc) this).field_a[var11] = var13 + 1;
                                        if (var13 + 1 == var12) {
                                          ((pc) this).field_r[var11] = null;
                                          var10++;
                                          continue L18;
                                        } else {
                                          var10++;
                                          continue L18;
                                        }
                                      } else {
                                        var8 = var8 + var17.c(false);
                                        ((pc) this).field_r[var11][var14] = var8 + var17.c(false);
                                        var15 = var8 + var17.c(false);
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
                                ((pc) this).field_l[((pc) this).field_f[var10]] = var17.c(false);
                                var10++;
                                continue L17;
                              }
                            }
                          } else {
                            var10 = 0;
                            L20: while (true) {
                              if (var10 >= ((pc) this).field_s) {
                                var10 = 0;
                                L21: while (true) {
                                  if (var10 >= ((pc) this).field_s) {
                                    break L16;
                                  } else {
                                    var11 = ((pc) this).field_f[var10];
                                    var8 = 0;
                                    var12 = ((pc) this).field_l[var11];
                                    ((pc) this).field_r[var11] = new int[var12];
                                    var13 = -1;
                                    var14 = 0;
                                    L22: while (true) {
                                      if (var12 <= var14) {
                                        ((pc) this).field_a[var11] = var13 + 1;
                                        if (var12 == 1 + var13) {
                                          ((pc) this).field_r[var11] = null;
                                          var10++;
                                          continue L21;
                                        } else {
                                          var10++;
                                          continue L21;
                                        }
                                      } else {
                                        var8 = var8 + var17.d((byte) -109);
                                        ((pc) this).field_r[var11][var14] = var8 + var17.d((byte) -109);
                                        var15 = var8 + var17.d((byte) -109);
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
                                ((pc) this).field_l[((pc) this).field_f[var10]] = var17.d((byte) -42);
                                var10++;
                                continue L20;
                              }
                            }
                          }
                        }
                        L23: {
                          if (var6 != 0) {
                            ((pc) this).field_e = new oe[1 + var9];
                            ((pc) this).field_c = new int[1 + var9][];
                            var10 = 0;
                            L24: while (true) {
                              if (((pc) this).field_s <= var10) {
                                break L23;
                              } else {
                                var11 = ((pc) this).field_f[var10];
                                var12 = ((pc) this).field_l[var11];
                                ((pc) this).field_c[var11] = new int[((pc) this).field_a[var11]];
                                var13 = 0;
                                L25: while (true) {
                                  if (var13 >= ((pc) this).field_a[var11]) {
                                    var13 = 0;
                                    L26: while (true) {
                                      if (var12 <= var13) {
                                        ((pc) this).field_e[var11] = new oe(((pc) this).field_c[var11]);
                                        var10++;
                                        continue L24;
                                      } else {
                                        L27: {
                                          if (null == ((pc) this).field_r[var11]) {
                                            var14 = var13;
                                            break L27;
                                          } else {
                                            var14 = ((pc) this).field_r[var11][var13];
                                            break L27;
                                          }
                                        }
                                        ((pc) this).field_c[var11][var14] = var17.e((byte) 113);
                                        var13++;
                                        continue L26;
                                      }
                                    }
                                  } else {
                                    ((pc) this).field_c[var11][var13] = -1;
                                    var13++;
                                    continue L25;
                                  }
                                }
                              }
                            }
                          } else {
                            break L23;
                          }
                        }
                        return;
                      } else {
                        ((pc) this).field_d[((pc) this).field_f[var10]] = var17.e((byte) 113);
                        var10++;
                        continue L15;
                      }
                    }
                  } else {
                    ((pc) this).field_b[((pc) this).field_f[var10]] = var17.e((byte) 113);
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

    public static void a(boolean param0) {
        if (!param0) {
            return;
        }
        field_t = null;
    }

    pc(byte[] param0, int param1, byte[] param2) {
        int var4 = 0;
        ((pc) this).field_p = ql.a(0, param0, param0.length);
        if (((pc) this).field_p != param1) {
            throw new RuntimeException();
        }
        if (param2 != null) {
            if (64 != param2.length) {
                throw new RuntimeException();
            }
            ((pc) this).field_j = cf.a(0, param0, param0.length, -6196);
            for (var4 = 0; (var4 ^ -1) > -65; var4++) {
                if (((pc) this).field_j[var4] != param2[var4]) {
                    throw new RuntimeException();
                }
            }
        }
        this.a((byte) -2, param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = 0;
        field_h = false;
    }
}
