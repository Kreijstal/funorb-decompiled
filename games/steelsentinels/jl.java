/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jl {
    int[] field_g;
    static int field_r;
    int[] field_m;
    jk field_n;
    byte[][] field_t;
    private int field_b;
    static float field_c;
    jk[] field_d;
    static int field_p;
    int[] field_h;
    int field_k;
    private int[][] field_q;
    int field_e;
    int[] field_j;
    static gh field_s;
    private byte[] field_l;
    int field_u;
    static oe field_w;
    static String field_f;
    private int[] field_v;
    int[] field_a;
    static String field_i;
    int[][] field_o;

    final static void a(boolean param0) {
        aj var1_ref = null;
        aj var1 = (aj) (Object) sl.field_b.c(-6533);
        if (!(var1 != null)) {
            var1_ref = new aj();
        }
        var1_ref.a(pb.field_b, pb.field_i, pb.field_c, pb.field_l, pb.field_g, pb.field_d, pb.field_j, (byte) -62);
        ff.field_qb.a(3, (ck) (Object) var1_ref);
        if (param0) {
            jl.a(true);
        }
    }

    public static void a(int param0) {
        field_f = null;
        field_w = null;
        if (param0 != 0) {
            jl.a(81);
        }
        field_i = null;
        field_s = null;
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
        gi var17 = null;
        byte[] var21 = null;
        int stackIn_10_0 = 0;
        int stackIn_16_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        L0: {
          var16 = SteelSentinels.field_G;
          var17 = new gi(ln.a(param0, (byte) 127));
          var4 = var17.f((byte) -66);
          if (5 > var4) {
            break L0;
          } else {
            if (-8 > (var4 ^ -1)) {
              break L0;
            } else {
              L1: {
                if (var4 >= 6) {
                  ((jl) this).field_k = var17.i(0);
                  break L1;
                } else {
                  ((jl) this).field_k = 0;
                  break L1;
                }
              }
              L2: {
                var5 = var17.f((byte) -111);
                if (-1 == (1 & var5)) {
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
                if (-8 > var4) {
                  ((jl) this).field_b = var17.c((byte) -60);
                  break L3;
                } else {
                  ((jl) this).field_b = var17.c(true);
                  break L3;
                }
              }
              L4: {
                if (-1 == (var5 & 2 ^ -1)) {
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
                var9 = -1;
                ((jl) this).field_h = new int[((jl) this).field_b];
                if (7 > var4) {
                  var10 = 0;
                  L6: while (true) {
                    if (((jl) this).field_b <= var10) {
                      break L5;
                    } else {
                      var8 = var8 + var17.c((byte) -60);
                      ((jl) this).field_h[var10] = var8 + var17.c((byte) -60);
                      if (((jl) this).field_h[var10] > var9) {
                        var9 = ((jl) this).field_h[var10];
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
                    if (((jl) this).field_b <= var10) {
                      break L5;
                    } else {
                      var8 = var8 + var17.c(true);
                      ((jl) this).field_h[var10] = var8 + var17.c(true);
                      if (((jl) this).field_h[var10] > var9) {
                        var9 = ((jl) this).field_h[var10];
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
                ((jl) this).field_u = 1 + var9;
                ((jl) this).field_o = new int[((jl) this).field_u][];
                ((jl) this).field_g = new int[((jl) this).field_u];
                if (var7 != 0) {
                  ((jl) this).field_t = new byte[((jl) this).field_u][];
                  break L8;
                } else {
                  break L8;
                }
              }
              L9: {
                ((jl) this).field_j = new int[((jl) this).field_u];
                ((jl) this).field_a = new int[((jl) this).field_u];
                ((jl) this).field_m = new int[((jl) this).field_u];
                if (var6 != 0) {
                  ((jl) this).field_v = new int[((jl) this).field_u];
                  var10 = 0;
                  L10: while (true) {
                    if (((jl) this).field_u <= var10) {
                      var10 = 0;
                      L11: while (true) {
                        if (var10 >= ((jl) this).field_b) {
                          ((jl) this).field_n = new jk(((jl) this).field_v);
                          break L9;
                        } else {
                          ((jl) this).field_v[((jl) this).field_h[var10]] = var17.i(0);
                          var10++;
                          continue L11;
                        }
                      }
                    } else {
                      ((jl) this).field_v[var10] = -1;
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
                if (((jl) this).field_b <= var10) {
                  L13: {
                    if (var7 == 0) {
                      break L13;
                    } else {
                      var10 = 0;
                      L14: while (true) {
                        if (var10 >= ((jl) this).field_b) {
                          break L13;
                        } else {
                          var21 = new byte[64];
                          var17.a(0, var21, 28, 64);
                          ((jl) this).field_t[((jl) this).field_h[var10]] = var21;
                          var10++;
                          continue L14;
                        }
                      }
                    }
                  }
                  if (param1 >= 64) {
                    var10 = 0;
                    L15: while (true) {
                      if (((jl) this).field_b <= var10) {
                        L16: {
                          if ((var4 ^ -1) > -8) {
                            var10 = 0;
                            L17: while (true) {
                              if (((jl) this).field_b <= var10) {
                                var10 = 0;
                                L18: while (true) {
                                  if (((jl) this).field_b <= var10) {
                                    break L16;
                                  } else {
                                    var11 = ((jl) this).field_h[var10];
                                    var8 = 0;
                                    var12 = ((jl) this).field_j[var11];
                                    ((jl) this).field_o[var11] = new int[var12];
                                    var13 = -1;
                                    var14 = 0;
                                    L19: while (true) {
                                      if (var14 >= var12) {
                                        ((jl) this).field_g[var11] = 1 + var13;
                                        if (var12 == 1 + var13) {
                                          ((jl) this).field_o[var11] = null;
                                          var10++;
                                          continue L18;
                                        } else {
                                          var10++;
                                          continue L18;
                                        }
                                      } else {
                                        var8 = var8 + var17.c((byte) -60);
                                        ((jl) this).field_o[var11][var14] = var8 + var17.c((byte) -60);
                                        var15 = var8 + var17.c((byte) -60);
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
                                ((jl) this).field_j[((jl) this).field_h[var10]] = var17.c((byte) -60);
                                var10++;
                                continue L17;
                              }
                            }
                          } else {
                            var10 = 0;
                            L20: while (true) {
                              if (((jl) this).field_b <= var10) {
                                var10 = 0;
                                L21: while (true) {
                                  if (var10 >= ((jl) this).field_b) {
                                    break L16;
                                  } else {
                                    var11 = ((jl) this).field_h[var10];
                                    var8 = 0;
                                    var12 = ((jl) this).field_j[var11];
                                    var13 = -1;
                                    ((jl) this).field_o[var11] = new int[var12];
                                    var14 = 0;
                                    L22: while (true) {
                                      if (var12 <= var14) {
                                        ((jl) this).field_g[var11] = var13 + 1;
                                        if (var13 + 1 == var12) {
                                          ((jl) this).field_o[var11] = null;
                                          var10++;
                                          continue L21;
                                        } else {
                                          var10++;
                                          continue L21;
                                        }
                                      } else {
                                        var8 = var8 + var17.c(true);
                                        ((jl) this).field_o[var11][var14] = var8 + var17.c(true);
                                        var15 = var8 + var17.c(true);
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
                                ((jl) this).field_j[((jl) this).field_h[var10]] = var17.c(true);
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
                            ((jl) this).field_d = new jk[var9 - -1];
                            ((jl) this).field_q = new int[1 + var9][];
                            var10 = 0;
                            L24: while (true) {
                              if (((jl) this).field_b <= var10) {
                                break L23;
                              } else {
                                var11 = ((jl) this).field_h[var10];
                                var12 = ((jl) this).field_j[var11];
                                ((jl) this).field_q[var11] = new int[((jl) this).field_g[var11]];
                                var13 = 0;
                                L25: while (true) {
                                  if (((jl) this).field_g[var11] <= var13) {
                                    var13 = 0;
                                    L26: while (true) {
                                      if (var12 <= var13) {
                                        ((jl) this).field_d[var11] = new jk(((jl) this).field_q[var11]);
                                        var10++;
                                        continue L24;
                                      } else {
                                        L27: {
                                          if (null == ((jl) this).field_o[var11]) {
                                            var14 = var13;
                                            break L27;
                                          } else {
                                            var14 = ((jl) this).field_o[var11][var13];
                                            break L27;
                                          }
                                        }
                                        ((jl) this).field_q[var11][var14] = var17.i(0);
                                        var13++;
                                        continue L26;
                                      }
                                    }
                                  } else {
                                    ((jl) this).field_q[var11][var13] = -1;
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
                        ((jl) this).field_m[((jl) this).field_h[var10]] = var17.i(0);
                        var10++;
                        continue L15;
                      }
                    }
                  } else {
                    return;
                  }
                } else {
                  ((jl) this).field_a[((jl) this).field_h[var10]] = var17.i(0);
                  var10++;
                  continue L12;
                }
              }
            }
          }
        }
        throw new RuntimeException();
    }

    jl(byte[] param0, int param1, byte[] param2) {
        int var4 = 0;
        ((jl) this).field_e = ba.a((byte) -107, param0, param0.length);
        if (((jl) this).field_e != param1) {
            throw new RuntimeException();
        }
        if (param2 != null) {
            if (64 != param2.length) {
                throw new RuntimeException();
            }
            ((jl) this).field_l = co.a((byte) -37, param0.length, 0, param0);
            for (var4 = 0; 64 > var4; var4++) {
                if (param2[var4] != ((jl) this).field_l[var4]) {
                    throw new RuntimeException();
                }
            }
        }
        this.a(param0, 70);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Unpacking graphics";
        field_f = "Click or press F10 to open Quick Chat";
    }
}
