/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pc {
    private int field_e;
    int[] field_q;
    oe field_h;
    int[] field_t;
    private byte[] field_b;
    static sd field_v;
    int[] field_n;
    private int[][] field_g;
    int[] field_p;
    static String field_r;
    oe[] field_x;
    int[] field_c;
    static String field_o;
    byte[][] field_j;
    private int[] field_u;
    int field_i;
    int field_s;
    int field_f;
    int[][] field_w;
    static bh field_a;
    static long[] field_k;
    static sd field_m;
    static oi field_l;
    static c field_d;

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
        va var17 = null;
        byte[] var21 = null;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        L0: {
          var16 = wizardrun.field_H;
          var17 = new va(dg.a(param0, 31027));
          var4 = var17.f(param1 + 255);
          if (var4 < 5) {
            break L0;
          } else {
            if (var4 > 7) {
              break L0;
            } else {
              L1: {
                if ((var4 ^ -1) <= -7) {
                  ((pc) this).field_f = var17.i(255);
                  break L1;
                } else {
                  ((pc) this).field_f = 0;
                  break L1;
                }
              }
              L2: {
                var5 = var17.f(param1 ^ 255);
                if (-1 == (1 & var5 ^ -1)) {
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
                if ((2 & var5) == param1) {
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
                  ((pc) this).field_e = var17.a((byte) -88);
                  break L4;
                } else {
                  ((pc) this).field_e = var17.j(param1 + -14477);
                  break L4;
                }
              }
              L5: {
                var8 = 0;
                ((pc) this).field_c = new int[((pc) this).field_e];
                var9 = -1;
                if ((var4 ^ -1) <= -8) {
                  var10 = 0;
                  L6: while (true) {
                    if (var10 >= ((pc) this).field_e) {
                      break L5;
                    } else {
                      var8 = var8 + var17.a((byte) -88);
                      ((pc) this).field_c[var10] = var8 + var17.a((byte) -88);
                      if (var9 < ((pc) this).field_c[var10]) {
                        var9 = ((pc) this).field_c[var10];
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
                    if (var10 >= ((pc) this).field_e) {
                      break L5;
                    } else {
                      var8 = var8 + var17.j(-14477);
                      ((pc) this).field_c[var10] = var8 + var17.j(-14477);
                      if (var9 < ((pc) this).field_c[var10]) {
                        var9 = ((pc) this).field_c[var10];
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
                ((pc) this).field_s = var9 - -1;
                ((pc) this).field_p = new int[((pc) this).field_s];
                if (var7 == 0) {
                  break L8;
                } else {
                  ((pc) this).field_j = new byte[((pc) this).field_s][];
                  break L8;
                }
              }
              L9: {
                ((pc) this).field_n = new int[((pc) this).field_s];
                ((pc) this).field_t = new int[((pc) this).field_s];
                ((pc) this).field_q = new int[((pc) this).field_s];
                ((pc) this).field_w = new int[((pc) this).field_s][];
                if (var6 != 0) {
                  ((pc) this).field_u = new int[((pc) this).field_s];
                  var10 = 0;
                  L10: while (true) {
                    if (((pc) this).field_s <= var10) {
                      var10 = 0;
                      L11: while (true) {
                        if (((pc) this).field_e <= var10) {
                          ((pc) this).field_h = new oe(((pc) this).field_u);
                          break L9;
                        } else {
                          ((pc) this).field_u[((pc) this).field_c[var10]] = var17.i(param1 + 255);
                          var10++;
                          continue L11;
                        }
                      }
                    } else {
                      ((pc) this).field_u[var10] = -1;
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
                if (((pc) this).field_e <= var10) {
                  L13: {
                    if (var7 == 0) {
                      break L13;
                    } else {
                      var10 = 0;
                      L14: while (true) {
                        if (var10 >= ((pc) this).field_e) {
                          break L13;
                        } else {
                          var21 = new byte[64];
                          var17.a(true, 64, var21, 0);
                          ((pc) this).field_j[((pc) this).field_c[var10]] = var21;
                          var10++;
                          continue L14;
                        }
                      }
                    }
                  }
                  var10 = 0;
                  L15: while (true) {
                    if (var10 >= ((pc) this).field_e) {
                      L16: {
                        if (7 <= var4) {
                          var10 = 0;
                          L17: while (true) {
                            if (var10 >= ((pc) this).field_e) {
                              var10 = 0;
                              L18: while (true) {
                                if (var10 >= ((pc) this).field_e) {
                                  break L16;
                                } else {
                                  var11 = ((pc) this).field_c[var10];
                                  var12 = ((pc) this).field_p[var11];
                                  var8 = 0;
                                  var13 = -1;
                                  ((pc) this).field_w[var11] = new int[var12];
                                  var14 = 0;
                                  L19: while (true) {
                                    if (var12 <= var14) {
                                      ((pc) this).field_t[var11] = 1 + var13;
                                      if (var12 == var13 + 1) {
                                        ((pc) this).field_w[var11] = null;
                                        var10++;
                                        continue L18;
                                      } else {
                                        var10++;
                                        continue L18;
                                      }
                                    } else {
                                      var8 = var8 + var17.a((byte) -88);
                                      ((pc) this).field_w[var11][var14] = var8 + var17.a((byte) -88);
                                      var15 = var8 + var17.a((byte) -88);
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
                              ((pc) this).field_p[((pc) this).field_c[var10]] = var17.a((byte) -88);
                              var10++;
                              continue L17;
                            }
                          }
                        } else {
                          var10 = 0;
                          L20: while (true) {
                            if (var10 >= ((pc) this).field_e) {
                              var10 = 0;
                              L21: while (true) {
                                if (var10 >= ((pc) this).field_e) {
                                  break L16;
                                } else {
                                  var11 = ((pc) this).field_c[var10];
                                  var12 = ((pc) this).field_p[var11];
                                  var8 = 0;
                                  ((pc) this).field_w[var11] = new int[var12];
                                  var13 = -1;
                                  var14 = 0;
                                  L22: while (true) {
                                    if (var14 >= var12) {
                                      ((pc) this).field_t[var11] = 1 + var13;
                                      if (var12 == var13 + 1) {
                                        ((pc) this).field_w[var11] = null;
                                        var10++;
                                        continue L21;
                                      } else {
                                        var10++;
                                        continue L21;
                                      }
                                    } else {
                                      var8 = var8 + var17.j(-14477);
                                      ((pc) this).field_w[var11][var14] = var8 + var17.j(-14477);
                                      var15 = var8 + var17.j(-14477);
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
                              ((pc) this).field_p[((pc) this).field_c[var10]] = var17.j(-14477);
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
                          ((pc) this).field_g = new int[1 + var9][];
                          ((pc) this).field_x = new oe[var9 + 1];
                          var10 = 0;
                          L24: while (true) {
                            if (var10 >= ((pc) this).field_e) {
                              break L23;
                            } else {
                              var11 = ((pc) this).field_c[var10];
                              var12 = ((pc) this).field_p[var11];
                              ((pc) this).field_g[var11] = new int[((pc) this).field_t[var11]];
                              var13 = 0;
                              L25: while (true) {
                                if (((pc) this).field_t[var11] <= var13) {
                                  var13 = 0;
                                  L26: while (true) {
                                    if (var12 <= var13) {
                                      ((pc) this).field_x[var11] = new oe(((pc) this).field_g[var11]);
                                      var10++;
                                      continue L24;
                                    } else {
                                      L27: {
                                        if (null == ((pc) this).field_w[var11]) {
                                          var14 = var13;
                                          break L27;
                                        } else {
                                          var14 = ((pc) this).field_w[var11][var13];
                                          break L27;
                                        }
                                      }
                                      ((pc) this).field_g[var11][var14] = var17.i(255);
                                      var13++;
                                      continue L26;
                                    }
                                  }
                                } else {
                                  ((pc) this).field_g[var11][var13] = -1;
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
                      ((pc) this).field_n[((pc) this).field_c[var10]] = var17.i(255);
                      var10++;
                      continue L15;
                    }
                  }
                } else {
                  ((pc) this).field_q[((pc) this).field_c[var10]] = var17.i(255);
                  var10++;
                  continue L12;
                }
              }
            }
          }
        }
        throw new RuntimeException();
    }

    public static void b(int param0) {
        if (param0 != 1) {
            Object var2 = null;
            o[] discarded$0 = pc.a((byte) -119, (String) null, (kl) null, (String) null);
        }
        field_k = null;
        field_v = null;
        field_r = null;
        field_a = null;
        field_o = null;
        field_l = null;
        field_m = null;
        field_d = null;
    }

    final static void a(int param0) {
        if (param0 != -1) {
            field_d = null;
        }
        Object var2 = null;
        rj.a((String) null, "", true);
    }

    pc(byte[] param0, int param1, byte[] param2) {
        int var4 = 0;
        ((pc) this).field_i = bi.a(param0, 10510, param0.length);
        if (((pc) this).field_i != param1) {
            throw new RuntimeException();
        }
        if (param2 != null) {
            if ((param2.length ^ -1) != -65) {
                throw new RuntimeException();
            }
            ((pc) this).field_b = id.a(param0, 0, param0.length, 0);
            for (var4 = 0; (var4 ^ -1) > -65; var4++) {
                if (((pc) this).field_b[var4] != param2[var4]) {
                    throw new RuntimeException();
                }
            }
        }
        this.a(param0, 0);
    }

    final static o[] a(byte param0, String param1, kl param2, String param3) {
        int var4 = param2.b(-1, param1);
        if (param0 < 99) {
            pc.b(61);
        }
        int var5 = param2.a(var4, param3, -11986);
        return r.a(var5, param2, 13469, var4);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Updates will sent to the email address you've given";
        field_v = new sd(3);
        field_a = new bh(9, 0, 4, 1);
        field_k = new long[32];
        field_m = new sd(0);
        field_l = new oi();
    }
}
