/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class f {
    int[] field_d;
    byte[][] field_h;
    static ed field_o;
    private int field_c;
    private int[][] field_r;
    int[] field_i;
    int[] field_l;
    int field_k;
    int[] field_e;
    static int field_t;
    private int[] field_g;
    jn field_p;
    int field_n;
    static vj field_m;
    int field_b;
    static int field_j;
    jn[] field_s;
    int[] field_q;
    int[][] field_a;
    private byte[] field_f;

    public static void a(byte param0) {
        if (param0 != 18) {
            field_m = null;
        }
        field_o = null;
        field_m = null;
    }

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
        int var17 = 0;
        n var18 = null;
        byte[] var22 = null;
        int stackIn_10_0 = 0;
        int stackIn_16_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        L0: {
          var17 = EscapeVector.field_A;
          var18 = new n(s.a((byte) -26, param1));
          var4 = var18.e(0);
          if (5 > var4) {
            break L0;
          } else {
            if (var4 <= 7) {
              L1: {
                if (var4 < 6) {
                  ((f) this).field_n = 0;
                  break L1;
                } else {
                  ((f) this).field_n = var18.g(-5053);
                  break L1;
                }
              }
              L2: {
                var5 = var18.e(0);
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
                if (-8 <= var4) {
                  ((f) this).field_c = var18.j(2147483647);
                  break L3;
                } else {
                  ((f) this).field_c = var18.f(1952);
                  break L3;
                }
              }
              L4: {
                if (0 == (2 & var5)) {
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
                ((f) this).field_d = new int[((f) this).field_c];
                if (var4 < 7) {
                  var10 = 0;
                  L6: while (true) {
                    if (((f) this).field_c <= var10) {
                      break L5;
                    } else {
                      var8 = var8 + var18.f(1952);
                      ((f) this).field_d[var10] = var8 + var18.f(1952);
                      if (((f) this).field_d[var10] > var9) {
                        var9 = ((f) this).field_d[var10];
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
                    if (var10 >= ((f) this).field_c) {
                      break L5;
                    } else {
                      var8 = var8 + var18.j(2147483647);
                      ((f) this).field_d[var10] = var8 + var18.j(2147483647);
                      if (var9 < ((f) this).field_d[var10]) {
                        var9 = ((f) this).field_d[var10];
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
                ((f) this).field_k = var9 - -1;
                if (var7 == 0) {
                  break L8;
                } else {
                  ((f) this).field_h = new byte[((f) this).field_k][];
                  break L8;
                }
              }
              L9: {
                var10 = 115 % ((60 - param0) / 44);
                ((f) this).field_i = new int[((f) this).field_k];
                ((f) this).field_a = new int[((f) this).field_k][];
                ((f) this).field_e = new int[((f) this).field_k];
                ((f) this).field_l = new int[((f) this).field_k];
                ((f) this).field_q = new int[((f) this).field_k];
                if (var6 != 0) {
                  ((f) this).field_g = new int[((f) this).field_k];
                  var11 = 0;
                  L10: while (true) {
                    if (((f) this).field_k <= var11) {
                      var11 = 0;
                      L11: while (true) {
                        if (var11 >= ((f) this).field_c) {
                          ((f) this).field_p = new jn(((f) this).field_g);
                          break L9;
                        } else {
                          ((f) this).field_g[((f) this).field_d[var11]] = var18.g(-5053);
                          var11++;
                          continue L11;
                        }
                      }
                    } else {
                      ((f) this).field_g[var11] = -1;
                      var11++;
                      continue L10;
                    }
                  }
                } else {
                  break L9;
                }
              }
              var11 = 0;
              L12: while (true) {
                if (((f) this).field_c <= var11) {
                  L13: {
                    if (var7 != 0) {
                      var11 = 0;
                      L14: while (true) {
                        if (var11 >= ((f) this).field_c) {
                          var11 = 0;
                          L15: while (true) {
                            if (var11 >= ((f) this).field_c) {
                              break L13;
                            } else {
                              ((f) this).field_q[((f) this).field_d[var11]] = var18.g(-5053);
                              var11++;
                              continue L15;
                            }
                          }
                        } else {
                          var22 = new byte[64];
                          var18.a(var22, (byte) -96, 0, 64);
                          ((f) this).field_h[((f) this).field_d[var11]] = var22;
                          var11++;
                          continue L14;
                        }
                      }
                    } else {
                      var11 = 0;
                      L16: while (true) {
                        if (var11 >= ((f) this).field_c) {
                          break L13;
                        } else {
                          ((f) this).field_q[((f) this).field_d[var11]] = var18.g(-5053);
                          var11++;
                          continue L16;
                        }
                      }
                    }
                  }
                  L17: {
                    if (var4 < 7) {
                      var11 = 0;
                      L18: while (true) {
                        if (var11 >= ((f) this).field_c) {
                          var11 = 0;
                          L19: while (true) {
                            if (((f) this).field_c <= var11) {
                              break L17;
                            } else {
                              var12 = ((f) this).field_d[var11];
                              var8 = 0;
                              var13 = ((f) this).field_i[var12];
                              var14 = -1;
                              ((f) this).field_a[var12] = new int[var13];
                              var15 = 0;
                              L20: while (true) {
                                if (var15 >= var13) {
                                  ((f) this).field_e[var12] = 1 + var14;
                                  if (var14 - -1 == var13) {
                                    ((f) this).field_a[var12] = null;
                                    var11++;
                                    continue L19;
                                  } else {
                                    var11++;
                                    continue L19;
                                  }
                                } else {
                                  var8 = var8 + var18.f(1952);
                                  ((f) this).field_a[var12][var15] = var8 + var18.f(1952);
                                  var16 = var8 + var18.f(1952);
                                  if (var14 < var16) {
                                    var14 = var16;
                                    var15++;
                                    continue L20;
                                  } else {
                                    var15++;
                                    continue L20;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          ((f) this).field_i[((f) this).field_d[var11]] = var18.f(1952);
                          var11++;
                          continue L18;
                        }
                      }
                    } else {
                      var11 = 0;
                      L21: while (true) {
                        if (var11 >= ((f) this).field_c) {
                          var11 = 0;
                          L22: while (true) {
                            if (((f) this).field_c <= var11) {
                              break L17;
                            } else {
                              var12 = ((f) this).field_d[var11];
                              var8 = 0;
                              var13 = ((f) this).field_i[var12];
                              var14 = -1;
                              ((f) this).field_a[var12] = new int[var13];
                              var15 = 0;
                              L23: while (true) {
                                if (var15 >= var13) {
                                  ((f) this).field_e[var12] = 1 + var14;
                                  if (1 + var14 == var13) {
                                    ((f) this).field_a[var12] = null;
                                    var11++;
                                    continue L22;
                                  } else {
                                    var11++;
                                    continue L22;
                                  }
                                } else {
                                  var8 = var8 + var18.j(2147483647);
                                  ((f) this).field_a[var12][var15] = var8 + var18.j(2147483647);
                                  var16 = var8 + var18.j(2147483647);
                                  if (var16 > var14) {
                                    var14 = var16;
                                    var15++;
                                    continue L23;
                                  } else {
                                    var15++;
                                    continue L23;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          ((f) this).field_i[((f) this).field_d[var11]] = var18.j(2147483647);
                          var11++;
                          continue L21;
                        }
                      }
                    }
                  }
                  L24: {
                    if (var6 != 0) {
                      ((f) this).field_r = new int[1 + var9][];
                      ((f) this).field_s = new jn[1 + var9];
                      var11 = 0;
                      L25: while (true) {
                        if (var11 >= ((f) this).field_c) {
                          break L24;
                        } else {
                          var12 = ((f) this).field_d[var11];
                          var13 = ((f) this).field_i[var12];
                          ((f) this).field_r[var12] = new int[((f) this).field_e[var12]];
                          var14 = 0;
                          L26: while (true) {
                            if (((f) this).field_e[var12] <= var14) {
                              var14 = 0;
                              L27: while (true) {
                                if (var13 <= var14) {
                                  ((f) this).field_s[var12] = new jn(((f) this).field_r[var12]);
                                  var11++;
                                  continue L25;
                                } else {
                                  L28: {
                                    if (((f) this).field_a[var12] != null) {
                                      var15 = ((f) this).field_a[var12][var14];
                                      break L28;
                                    } else {
                                      var15 = var14;
                                      break L28;
                                    }
                                  }
                                  ((f) this).field_r[var12][var15] = var18.g(-5053);
                                  var14++;
                                  continue L27;
                                }
                              }
                            } else {
                              ((f) this).field_r[var12][var14] = -1;
                              var14++;
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
                  ((f) this).field_l[((f) this).field_d[var11]] = var18.g(-5053);
                  var11++;
                  continue L12;
                }
              }
            } else {
              break L0;
            }
          }
        }
        throw new RuntimeException();
    }

    f(byte[] param0, int param1, byte[] param2) {
        int var4 = 0;
        ((f) this).field_b = ji.a(255, param0.length, param0);
        if (param1 != ((f) this).field_b) {
            throw new RuntimeException();
        }
        if (param2 != null) {
            if (param2.length != 64) {
                throw new RuntimeException();
            }
            ((f) this).field_f = vn.a(param0, 0, param0.length, 0);
            for (var4 = 0; var4 < 64; var4++) {
                if (param2[var4] != ((f) this).field_f[var4]) {
                    throw new RuntimeException();
                }
            }
        }
        this.a((byte) -23, param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = -1;
        field_m = null;
    }
}
