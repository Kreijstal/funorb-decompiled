/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sg {
    int field_p;
    int[] field_b;
    static String field_i;
    private int[][] field_o;
    private byte[] field_g;
    static long field_j;
    byte[][] field_a;
    int field_l;
    bf field_e;
    int field_d;
    int[] field_c;
    bf[] field_q;
    private int field_h;
    int[] field_m;
    private int[] field_n;
    int[][] field_s;
    int[] field_r;
    static String field_k;
    int[] field_f;

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
        fs var17 = null;
        byte[] var21 = null;
        int stackIn_12_0 = 0;
        int stackIn_18_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        var16 = Sumoblitz.field_L ? 1 : 0;
        if (param1 == -56) {
          L0: {
            var17 = new fs(nd.a(-1, param0));
            var4 = var17.e(param1 ^ 31346);
            if (-6 < (var4 ^ -1)) {
              break L0;
            } else {
              if (var4 >= -8) {
                L1: {
                  if (-7 > var4) {
                    ((sg) this).field_l = 0;
                    break L1;
                  } else {
                    ((sg) this).field_l = var17.c(true);
                    break L1;
                  }
                }
                L2: {
                  var5 = var17.e(-31302);
                  if ((1 & var5) == -1) {
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
                  if (-8 > var4) {
                    ((sg) this).field_h = var17.a(255);
                    break L3;
                  } else {
                    ((sg) this).field_h = var17.f(0);
                    break L3;
                  }
                }
                L4: {
                  if (-1 == (var5 & 2)) {
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
                  ((sg) this).field_f = new int[((sg) this).field_h];
                  if (-8 <= var4) {
                    var10 = 0;
                    L6: while (true) {
                      if (((sg) this).field_h <= var10) {
                        break L5;
                      } else {
                        var8 = var8 + var17.f(0);
                        ((sg) this).field_f[var10] = var8 + var17.f(0);
                        if (var9 < ((sg) this).field_f[var10]) {
                          var9 = ((sg) this).field_f[var10];
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
                      if (var10 >= ((sg) this).field_h) {
                        break L5;
                      } else {
                        var8 = var8 + var17.a(jg.a((int) param1, -201));
                        ((sg) this).field_f[var10] = var8 + var17.a(jg.a((int) param1, -201));
                        if (((sg) this).field_f[var10] > var9) {
                          var9 = ((sg) this).field_f[var10];
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
                  ((sg) this).field_d = var9 + 1;
                  ((sg) this).field_b = new int[((sg) this).field_d];
                  ((sg) this).field_c = new int[((sg) this).field_d];
                  if (var7 != 0) {
                    ((sg) this).field_a = new byte[((sg) this).field_d][];
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  ((sg) this).field_s = new int[((sg) this).field_d][];
                  ((sg) this).field_r = new int[((sg) this).field_d];
                  ((sg) this).field_m = new int[((sg) this).field_d];
                  if (var6 == 0) {
                    break L9;
                  } else {
                    ((sg) this).field_n = new int[((sg) this).field_d];
                    var10 = 0;
                    L10: while (true) {
                      if (((sg) this).field_d <= var10) {
                        var10 = 0;
                        L11: while (true) {
                          if (((sg) this).field_h <= var10) {
                            ((sg) this).field_e = new bf(((sg) this).field_n);
                            break L9;
                          } else {
                            ((sg) this).field_n[((sg) this).field_f[var10]] = var17.c(true);
                            var10++;
                            continue L11;
                          }
                        }
                      } else {
                        ((sg) this).field_n[var10] = -1;
                        var10++;
                        continue L10;
                      }
                    }
                  }
                }
                var10 = 0;
                L12: while (true) {
                  if (var10 >= ((sg) this).field_h) {
                    L13: {
                      if (var7 != 0) {
                        var10 = 0;
                        L14: while (true) {
                          if (((sg) this).field_h <= var10) {
                            var10 = 0;
                            L15: while (true) {
                              if (var10 >= ((sg) this).field_h) {
                                break L13;
                              } else {
                                ((sg) this).field_c[((sg) this).field_f[var10]] = var17.c(true);
                                var10++;
                                continue L15;
                              }
                            }
                          } else {
                            var21 = new byte[64];
                            var17.a(var21, 64, 0, (byte) -109);
                            ((sg) this).field_a[((sg) this).field_f[var10]] = var21;
                            var10++;
                            continue L14;
                          }
                        }
                      } else {
                        var10 = 0;
                        L16: while (true) {
                          if (var10 >= ((sg) this).field_h) {
                            break L13;
                          } else {
                            ((sg) this).field_c[((sg) this).field_f[var10]] = var17.c(true);
                            var10++;
                            continue L16;
                          }
                        }
                      }
                    }
                    L17: {
                      if (var4 >= 7) {
                        var10 = 0;
                        L18: while (true) {
                          if (((sg) this).field_h <= var10) {
                            var10 = 0;
                            L19: while (true) {
                              if (var10 >= ((sg) this).field_h) {
                                break L17;
                              } else {
                                var11 = ((sg) this).field_f[var10];
                                var8 = 0;
                                var12 = ((sg) this).field_m[var11];
                                var13 = -1;
                                ((sg) this).field_s[var11] = new int[var12];
                                var14 = 0;
                                L20: while (true) {
                                  if (var12 <= var14) {
                                    ((sg) this).field_r[var11] = 1 + var13;
                                    if (1 + var13 == var12) {
                                      ((sg) this).field_s[var11] = null;
                                      var10++;
                                      continue L19;
                                    } else {
                                      var10++;
                                      continue L19;
                                    }
                                  } else {
                                    var8 = var8 + var17.f(0);
                                    ((sg) this).field_s[var11][var14] = var8 + var17.f(0);
                                    var15 = var8 + var17.f(0);
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
                            ((sg) this).field_m[((sg) this).field_f[var10]] = var17.f(0);
                            var10++;
                            continue L18;
                          }
                        }
                      } else {
                        var10 = 0;
                        L21: while (true) {
                          if (var10 >= ((sg) this).field_h) {
                            var10 = 0;
                            L22: while (true) {
                              if (((sg) this).field_h <= var10) {
                                break L17;
                              } else {
                                var11 = ((sg) this).field_f[var10];
                                var12 = ((sg) this).field_m[var11];
                                var8 = 0;
                                ((sg) this).field_s[var11] = new int[var12];
                                var13 = -1;
                                var14 = 0;
                                L23: while (true) {
                                  if (var12 <= var14) {
                                    ((sg) this).field_r[var11] = 1 + var13;
                                    if (var12 == 1 + var13) {
                                      ((sg) this).field_s[var11] = null;
                                      var10++;
                                      continue L22;
                                    } else {
                                      var10++;
                                      continue L22;
                                    }
                                  } else {
                                    var8 = var8 + var17.a(255);
                                    ((sg) this).field_s[var11][var14] = var8 + var17.a(255);
                                    var15 = var8 + var17.a(255);
                                    if (var15 > var13) {
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
                            ((sg) this).field_m[((sg) this).field_f[var10]] = var17.a(255);
                            var10++;
                            continue L21;
                          }
                        }
                      }
                    }
                    L24: {
                      if (var6 != 0) {
                        ((sg) this).field_o = new int[var9 + 1][];
                        ((sg) this).field_q = new bf[1 + var9];
                        var10 = 0;
                        L25: while (true) {
                          if (((sg) this).field_h <= var10) {
                            break L24;
                          } else {
                            var11 = ((sg) this).field_f[var10];
                            var12 = ((sg) this).field_m[var11];
                            ((sg) this).field_o[var11] = new int[((sg) this).field_r[var11]];
                            var13 = 0;
                            L26: while (true) {
                              if (var13 >= ((sg) this).field_r[var11]) {
                                var13 = 0;
                                L27: while (true) {
                                  if (var13 >= var12) {
                                    ((sg) this).field_q[var11] = new bf(((sg) this).field_o[var11]);
                                    var10++;
                                    continue L25;
                                  } else {
                                    L28: {
                                      if (((sg) this).field_s[var11] == null) {
                                        var14 = var13;
                                        break L28;
                                      } else {
                                        var14 = ((sg) this).field_s[var11][var13];
                                        break L28;
                                      }
                                    }
                                    ((sg) this).field_o[var11][var14] = var17.c(true);
                                    var13++;
                                    continue L27;
                                  }
                                }
                              } else {
                                ((sg) this).field_o[var11][var13] = -1;
                                var13++;
                                continue L26;
                              }
                            }
                          }
                        }
                      } else {
                        break L24;
                      }
                    }
                    return;
                  } else {
                    ((sg) this).field_b[((sg) this).field_f[var10]] = var17.c(true);
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
        } else {
          return;
        }
    }

    public static void a(int param0) {
        if (param0 > -67) {
            return;
        }
        field_k = null;
        field_i = null;
    }

    final static boolean a(int param0, int param1, int param2) {
        if (param2 < 12) {
            return false;
        }
        return -1 != (param1 & 2048 ^ -1) ? true : false;
    }

    sg(byte[] param0, int param1, byte[] param2) {
        int var4 = 0;
        ((sg) this).field_p = am.a(param0.length, param0, (byte) 18);
        if (((sg) this).field_p != param1) {
            throw new RuntimeException();
        }
        if (param2 != null) {
            if (64 != param2.length) {
                throw new RuntimeException();
            }
            ((sg) this).field_g = gn.a(param0, (byte) -110, 0, param0.length);
            for (var4 = 0; var4 < 64; var4++) {
                if (param2[var4] != ((sg) this).field_g[var4]) {
                    throw new RuntimeException();
                }
            }
        }
        this.a(param0, (byte) -56);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Loading instruments";
        field_k = "Passwords must be between 5 and 20 characters long";
    }
}
