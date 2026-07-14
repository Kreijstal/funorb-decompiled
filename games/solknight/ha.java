/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ha {
    private int[] field_i;
    private int field_h;
    int field_l;
    qg[] field_j;
    int[] field_o;
    int[][] field_a;
    int[] field_f;
    static String field_p;
    private byte[] field_c;
    int field_d;
    int[] field_b;
    qg field_e;
    byte[][] field_q;
    static int field_g;
    int field_m;
    int[] field_s;
    int[] field_r;
    static String field_n;
    private int[][] field_k;

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
        gb var17 = null;
        byte[] var21 = null;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        L0: {
          var16 = SolKnight.field_L ? 1 : 0;
          var17 = new gb(jh.a(param1, 6));
          var4 = var17.j(255);
          if (5 > var4) {
            break L0;
          } else {
            if (var4 < -8) {
              break L0;
            } else {
              L1: {
                if (-7 > var4) {
                  ((ha) this).field_m = 0;
                  break L1;
                } else {
                  ((ha) this).field_m = var17.e(true);
                  break L1;
                }
              }
              L2: {
                var5 = var17.j(255);
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
                if (var4 < 7) {
                  ((ha) this).field_h = var17.i(-107);
                  break L4;
                } else {
                  ((ha) this).field_h = var17.e(6715);
                  break L4;
                }
              }
              L5: {
                var8 = 0;
                ((ha) this).field_f = new int[((ha) this).field_h];
                var9 = -1;
                if (-8 >= (var4 ^ -1)) {
                  var10 = 0;
                  L6: while (true) {
                    if (var10 >= ((ha) this).field_h) {
                      break L5;
                    } else {
                      var8 = var8 + var17.e(6715);
                      ((ha) this).field_f[var10] = var8 + var17.e(6715);
                      if (var9 < ((ha) this).field_f[var10]) {
                        var9 = ((ha) this).field_f[var10];
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
                    if (var10 >= ((ha) this).field_h) {
                      break L5;
                    } else {
                      var8 = var8 + var17.i(-126);
                      ((ha) this).field_f[var10] = var8 + var17.i(-126);
                      if (var9 < ((ha) this).field_f[var10]) {
                        var9 = ((ha) this).field_f[var10];
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
              ((ha) this).field_l = var9 + 1;
              ((ha) this).field_a = new int[((ha) this).field_l][];
              ((ha) this).field_b = new int[((ha) this).field_l];
              if (param0 < -73) {
                L8: {
                  ((ha) this).field_s = new int[((ha) this).field_l];
                  ((ha) this).field_r = new int[((ha) this).field_l];
                  ((ha) this).field_o = new int[((ha) this).field_l];
                  if (var7 == 0) {
                    break L8;
                  } else {
                    ((ha) this).field_q = new byte[((ha) this).field_l][];
                    break L8;
                  }
                }
                L9: {
                  if (var6 != 0) {
                    ((ha) this).field_i = new int[((ha) this).field_l];
                    var10 = 0;
                    L10: while (true) {
                      if (((ha) this).field_l <= var10) {
                        var10 = 0;
                        L11: while (true) {
                          if (var10 >= ((ha) this).field_h) {
                            ((ha) this).field_e = new qg(((ha) this).field_i);
                            break L9;
                          } else {
                            ((ha) this).field_i[((ha) this).field_f[var10]] = var17.e(true);
                            var10++;
                            continue L11;
                          }
                        }
                      } else {
                        ((ha) this).field_i[var10] = -1;
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
                  if (var10 >= ((ha) this).field_h) {
                    L13: {
                      if (var7 == 0) {
                        break L13;
                      } else {
                        var10 = 0;
                        L14: while (true) {
                          if (((ha) this).field_h <= var10) {
                            break L13;
                          } else {
                            var21 = new byte[64];
                            var17.a(64, 0, -111, var21);
                            ((ha) this).field_q[((ha) this).field_f[var10]] = var21;
                            var10++;
                            continue L14;
                          }
                        }
                      }
                    }
                    var10 = 0;
                    L15: while (true) {
                      if (((ha) this).field_h <= var10) {
                        L16: {
                          if (7 > var4) {
                            var10 = 0;
                            L17: while (true) {
                              if (((ha) this).field_h <= var10) {
                                var10 = 0;
                                L18: while (true) {
                                  if (var10 >= ((ha) this).field_h) {
                                    break L16;
                                  } else {
                                    var11 = ((ha) this).field_f[var10];
                                    var8 = 0;
                                    var12 = ((ha) this).field_r[var11];
                                    var13 = -1;
                                    ((ha) this).field_a[var11] = new int[var12];
                                    var14 = 0;
                                    L19: while (true) {
                                      if (var14 >= var12) {
                                        ((ha) this).field_o[var11] = var13 + 1;
                                        if (var13 + 1 == var12) {
                                          ((ha) this).field_a[var11] = null;
                                          var10++;
                                          continue L18;
                                        } else {
                                          var10++;
                                          continue L18;
                                        }
                                      } else {
                                        var8 = var8 + var17.i(-118);
                                        ((ha) this).field_a[var11][var14] = var8 + var17.i(-118);
                                        var15 = var8 + var17.i(-118);
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
                                ((ha) this).field_r[((ha) this).field_f[var10]] = var17.i(46);
                                var10++;
                                continue L17;
                              }
                            }
                          } else {
                            var10 = 0;
                            L20: while (true) {
                              if (((ha) this).field_h <= var10) {
                                var10 = 0;
                                L21: while (true) {
                                  if (((ha) this).field_h <= var10) {
                                    break L16;
                                  } else {
                                    var11 = ((ha) this).field_f[var10];
                                    var8 = 0;
                                    var12 = ((ha) this).field_r[var11];
                                    var13 = -1;
                                    ((ha) this).field_a[var11] = new int[var12];
                                    var14 = 0;
                                    L22: while (true) {
                                      if (var14 >= var12) {
                                        ((ha) this).field_o[var11] = var13 - -1;
                                        if (1 + var13 == var12) {
                                          ((ha) this).field_a[var11] = null;
                                          var10++;
                                          continue L21;
                                        } else {
                                          var10++;
                                          continue L21;
                                        }
                                      } else {
                                        var8 = var8 + var17.e(6715);
                                        ((ha) this).field_a[var11][var14] = var8 + var17.e(6715);
                                        var15 = var8 + var17.e(6715);
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
                                ((ha) this).field_r[((ha) this).field_f[var10]] = var17.e(6715);
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
                            ((ha) this).field_j = new qg[var9 - -1];
                            ((ha) this).field_k = new int[var9 + 1][];
                            var10 = 0;
                            L24: while (true) {
                              if (var10 >= ((ha) this).field_h) {
                                break L23;
                              } else {
                                var11 = ((ha) this).field_f[var10];
                                var12 = ((ha) this).field_r[var11];
                                ((ha) this).field_k[var11] = new int[((ha) this).field_o[var11]];
                                var13 = 0;
                                L25: while (true) {
                                  if (var13 >= ((ha) this).field_o[var11]) {
                                    var13 = 0;
                                    L26: while (true) {
                                      if (var12 <= var13) {
                                        ((ha) this).field_j[var11] = new qg(((ha) this).field_k[var11]);
                                        var10++;
                                        continue L24;
                                      } else {
                                        L27: {
                                          if (null == ((ha) this).field_a[var11]) {
                                            var14 = var13;
                                            break L27;
                                          } else {
                                            var14 = ((ha) this).field_a[var11][var13];
                                            break L27;
                                          }
                                        }
                                        ((ha) this).field_k[var11][var14] = var17.e(true);
                                        var13++;
                                        continue L26;
                                      }
                                    }
                                  } else {
                                    ((ha) this).field_k[var11][var13] = -1;
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
                        ((ha) this).field_s[((ha) this).field_f[var10]] = var17.e(true);
                        var10++;
                        continue L15;
                      }
                    }
                  } else {
                    ((ha) this).field_b[((ha) this).field_f[var10]] = var17.e(true);
                    var10++;
                    continue L12;
                  }
                }
              } else {
                return;
              }
            }
          }
        }
        throw new RuntimeException();
    }

    final static void a(gg param0, byte param1, gg param2) {
        if (!(param0.field_a == null)) {
            param0.c(10);
        }
        param0.field_d = param2;
        param0.field_a = param2.field_a;
        param0.field_a.field_d = param0;
        if (param1 <= 15) {
            return;
        }
        param0.field_d.field_a = param0;
    }

    public static void a(int param0) {
        field_n = null;
        field_p = null;
        if (param0 != 0) {
            field_n = null;
        }
    }

    final static o[] a(int param0, int param1) {
        int var3 = 115 / ((param1 - 7) / 63);
        o[] var4 = new o[9];
        o[] var2 = var4;
        var4[4] = ib.a(64, true, param0);
        return var2;
    }

    ha(byte[] param0, int param1, byte[] param2) {
        int var4 = 0;
        ((ha) this).field_d = gl.a(param0.length, param0, 119);
        if (((ha) this).field_d != param1) {
            throw new RuntimeException();
        }
        if (param2 != null) {
            if (64 != param2.length) {
                throw new RuntimeException();
            }
            ((ha) this).field_c = q.a(param0.length, 0, 89, param0);
            for (var4 = 0; -65 < (var4 ^ -1); var4++) {
                if (((ha) this).field_c[var4] != param2[var4]) {
                    throw new RuntimeException();
                }
            }
        }
        this.a((byte) -88, param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Score: <%0>";
        field_n = "to keep fullscreen or";
    }
}
