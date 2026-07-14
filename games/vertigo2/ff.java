/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ff {
    static String[] field_n;
    static int field_b;
    int[] field_l;
    byte[][] field_s;
    private int field_q;
    pq field_k;
    int[][] field_g;
    static long field_d;
    int field_c;
    int[] field_h;
    int[] field_e;
    static boolean field_m;
    static String field_u;
    int[] field_j;
    private int[] field_f;
    private byte[] field_a;
    int[] field_r;
    pq[] field_t;
    static String field_v;
    int field_p;
    private int[][] field_i;
    int field_o;

    final static void b(byte param0) {
        vd.field_b = new mk();
        n.field_b.a(false, (iq) (Object) vd.field_b);
        if (param0 != -104) {
            field_b = 45;
        }
    }

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
        ed var17 = null;
        byte[] var21 = null;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        L0: {
          var16 = Vertigo2.field_L ? 1 : 0;
          var17 = new ed(hm.a(-20595, param0));
          var4 = var17.h(-11);
          if (var4 < 5) {
            break L0;
          } else {
            if (-8 > var4) {
              break L0;
            } else {
              L1: {
                if (-7 > var4) {
                  ((ff) this).field_c = 0;
                  break L1;
                } else {
                  ((ff) this).field_c = var17.b(true);
                  break L1;
                }
              }
              L2: {
                var5 = var17.h(-11);
                if (-1 == (var5 & 1 ^ -1)) {
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
                if ((2 & var5) == 0) {
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
                if ((var4 ^ -1) <= -8) {
                  ((ff) this).field_q = var17.a(82);
                  break L4;
                } else {
                  ((ff) this).field_q = var17.a((byte) -11);
                  break L4;
                }
              }
              L5: {
                var8 = 0;
                var9 = -1;
                ((ff) this).field_e = new int[((ff) this).field_q];
                if ((var4 ^ -1) > -8) {
                  var10 = 0;
                  L6: while (true) {
                    if (var10 >= ((ff) this).field_q) {
                      break L5;
                    } else {
                      var8 = var8 + var17.a((byte) -11);
                      ((ff) this).field_e[var10] = var8 + var17.a((byte) -11);
                      if (((ff) this).field_e[var10] > var9) {
                        var9 = ((ff) this).field_e[var10];
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
                    if (((ff) this).field_q <= var10) {
                      break L5;
                    } else {
                      var8 = var8 + var17.a(118);
                      ((ff) this).field_e[var10] = var8 + var17.a(118);
                      if (var9 < ((ff) this).field_e[var10]) {
                        var9 = ((ff) this).field_e[var10];
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
                ((ff) this).field_p = 1 + var9;
                if (var7 != 0) {
                  ((ff) this).field_s = new byte[((ff) this).field_p][];
                  break L8;
                } else {
                  break L8;
                }
              }
              L9: {
                ((ff) this).field_h = new int[((ff) this).field_p];
                ((ff) this).field_g = new int[((ff) this).field_p][];
                ((ff) this).field_j = new int[((ff) this).field_p];
                ((ff) this).field_l = new int[((ff) this).field_p];
                ((ff) this).field_r = new int[((ff) this).field_p];
                if (var6 != 0) {
                  ((ff) this).field_f = new int[((ff) this).field_p];
                  var10 = 0;
                  L10: while (true) {
                    if (((ff) this).field_p <= var10) {
                      var10 = 0;
                      L11: while (true) {
                        if (var10 >= ((ff) this).field_q) {
                          ((ff) this).field_k = new pq(((ff) this).field_f);
                          break L9;
                        } else {
                          ((ff) this).field_f[((ff) this).field_e[var10]] = var17.b(true);
                          var10++;
                          continue L11;
                        }
                      }
                    } else {
                      ((ff) this).field_f[var10] = -1;
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
                if (var10 >= ((ff) this).field_q) {
                  L13: {
                    if (var7 == 0) {
                      break L13;
                    } else {
                      var10 = 0;
                      L14: while (true) {
                        if (var10 >= ((ff) this).field_q) {
                          break L13;
                        } else {
                          var21 = new byte[64];
                          var17.a(0, var21, 64, 78);
                          ((ff) this).field_s[((ff) this).field_e[var10]] = var21;
                          var10++;
                          continue L14;
                        }
                      }
                    }
                  }
                  var10 = 0;
                  if (param1) {
                    L15: while (true) {
                      if (((ff) this).field_q <= var10) {
                        L16: {
                          if ((var4 ^ -1) <= -8) {
                            var10 = 0;
                            L17: while (true) {
                              if (((ff) this).field_q <= var10) {
                                var10 = 0;
                                L18: while (true) {
                                  if (var10 >= ((ff) this).field_q) {
                                    break L16;
                                  } else {
                                    var11 = ((ff) this).field_e[var10];
                                    var12 = ((ff) this).field_h[var11];
                                    var8 = 0;
                                    var13 = -1;
                                    ((ff) this).field_g[var11] = new int[var12];
                                    var14 = 0;
                                    L19: while (true) {
                                      if (var12 <= var14) {
                                        ((ff) this).field_r[var11] = 1 + var13;
                                        if (1 + var13 == var12) {
                                          ((ff) this).field_g[var11] = null;
                                          var10++;
                                          continue L18;
                                        } else {
                                          var10++;
                                          continue L18;
                                        }
                                      } else {
                                        var8 = var8 + var17.a(83);
                                        ((ff) this).field_g[var11][var14] = var8 + var17.a(83);
                                        var15 = var8 + var17.a(83);
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
                                ((ff) this).field_h[((ff) this).field_e[var10]] = var17.a(113);
                                var10++;
                                continue L17;
                              }
                            }
                          } else {
                            var10 = 0;
                            L20: while (true) {
                              if (var10 >= ((ff) this).field_q) {
                                var10 = 0;
                                L21: while (true) {
                                  if (((ff) this).field_q <= var10) {
                                    break L16;
                                  } else {
                                    var11 = ((ff) this).field_e[var10];
                                    var8 = 0;
                                    var12 = ((ff) this).field_h[var11];
                                    ((ff) this).field_g[var11] = new int[var12];
                                    var13 = -1;
                                    var14 = 0;
                                    L22: while (true) {
                                      if (var14 >= var12) {
                                        ((ff) this).field_r[var11] = 1 + var13;
                                        if (var13 + 1 == var12) {
                                          ((ff) this).field_g[var11] = null;
                                          var10++;
                                          continue L21;
                                        } else {
                                          var10++;
                                          continue L21;
                                        }
                                      } else {
                                        var8 = var8 + var17.a((byte) -11);
                                        ((ff) this).field_g[var11][var14] = var8 + var17.a((byte) -11);
                                        var15 = var8 + var17.a((byte) -11);
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
                                ((ff) this).field_h[((ff) this).field_e[var10]] = var17.a((byte) -11);
                                var10++;
                                continue L20;
                              }
                            }
                          }
                        }
                        L23: {
                          if (var6 != 0) {
                            ((ff) this).field_i = new int[var9 + 1][];
                            ((ff) this).field_t = new pq[var9 + 1];
                            var10 = 0;
                            L24: while (true) {
                              if (((ff) this).field_q <= var10) {
                                break L23;
                              } else {
                                var11 = ((ff) this).field_e[var10];
                                var12 = ((ff) this).field_h[var11];
                                ((ff) this).field_i[var11] = new int[((ff) this).field_r[var11]];
                                var13 = 0;
                                L25: while (true) {
                                  if (((ff) this).field_r[var11] <= var13) {
                                    var13 = 0;
                                    L26: while (true) {
                                      if (var12 <= var13) {
                                        ((ff) this).field_t[var11] = new pq(((ff) this).field_i[var11]);
                                        var10++;
                                        continue L24;
                                      } else {
                                        L27: {
                                          if (null == ((ff) this).field_g[var11]) {
                                            var14 = var13;
                                            break L27;
                                          } else {
                                            var14 = ((ff) this).field_g[var11][var13];
                                            break L27;
                                          }
                                        }
                                        ((ff) this).field_i[var11][var14] = var17.b(true);
                                        var13++;
                                        continue L26;
                                      }
                                    }
                                  } else {
                                    ((ff) this).field_i[var11][var13] = -1;
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
                        ((ff) this).field_l[((ff) this).field_e[var10]] = var17.b(param1);
                        var10++;
                        continue L15;
                      }
                    }
                  } else {
                    return;
                  }
                } else {
                  ((ff) this).field_j[((ff) this).field_e[var10]] = var17.b(true);
                  var10++;
                  continue L12;
                }
              }
            }
          }
        }
        throw new RuntimeException();
    }

    final static void a(boolean param0, int param1) {
        kq.b(-69, param0);
        rg.a((byte) 53, param0);
        if (param1 != 11182) {
            ff.b((byte) 54);
        }
    }

    public static void a(byte param0) {
        field_u = null;
        field_v = null;
        field_n = null;
        if (param0 <= 69) {
            field_d = 125L;
        }
    }

    ff(byte[] param0, int param1, byte[] param2) {
        int var4 = 0;
        ((ff) this).field_o = w.a(param0.length, param0, -7);
        if (param1 != ((ff) this).field_o) {
            throw new RuntimeException();
        }
        if (param2 != null) {
            if (-65 != (param2.length ^ -1)) {
                throw new RuntimeException();
            }
            ((ff) this).field_a = de.a(0, (byte) -114, param0.length, param0);
            for (var4 = 0; var4 < 64; var4++) {
                if (((ff) this).field_a[var4] != param2[var4]) {
                    throw new RuntimeException();
                }
            }
        }
        this.a(param0, true);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
        field_b = 0;
        field_m = false;
        field_v = "Month";
    }
}
