/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kl {
    int field_g;
    int[] field_i;
    lf field_q;
    static boolean field_t;
    byte[][] field_k;
    private byte[] field_o;
    private int[] field_l;
    int field_d;
    int field_p;
    static wn field_a;
    int[] field_e;
    static ot field_m;
    static kh field_h;
    int[] field_b;
    int[] field_c;
    int[][] field_r;
    int[] field_f;
    private int field_n;
    private int[][] field_j;
    lf[] field_s;

    final static boolean b(int param0) {
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        if (param0 == 640) {
          L0: {
            L1: {
              if (-1 < (wt.field_x ^ -1)) {
                break L1;
              } else {
                if (640 <= wt.field_x) {
                  break L1;
                } else {
                  if (-1 < (us.field_j ^ -1)) {
                    break L1;
                  } else {
                    if (g.field_a.field_T >= us.field_j) {
                      stackOut_8_0 = 0;
                      stackIn_9_0 = stackOut_8_0;
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            stackOut_7_0 = 1;
            stackIn_9_0 = stackOut_7_0;
            break L0;
          }
          return stackIn_9_0 != 0;
        } else {
          return false;
        }
    }

    public static void a(int param0) {
        field_h = null;
        field_a = null;
        if (param0 != 0) {
            return;
        }
        field_m = null;
    }

    final static void c(int param0) {
        int fieldTemp$0 = va.field_J + 1;
        va.field_J = va.field_J + 1;
        if (32 <= fieldTemp$0) {
            va.field_J = 0;
        }
        int var1 = -125 / ((param0 - 27) / 54);
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
        int var17 = 0;
        iw var18 = null;
        byte[] var22 = null;
        int stackIn_10_0 = 0;
        int stackIn_16_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        L0: {
          var17 = Kickabout.field_G;
          var18 = new iw(hh.a(param1, (byte) -3));
          var4 = var18.h((byte) -107);
          if (5 > var4) {
            break L0;
          } else {
            if (-8 > (var4 ^ -1)) {
              break L0;
            } else {
              L1: {
                if ((var4 ^ -1) > -7) {
                  ((kl) this).field_p = 0;
                  break L1;
                } else {
                  ((kl) this).field_p = var18.k(4);
                  break L1;
                }
              }
              L2: {
                var5 = var18.h((byte) -116);
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
                if (-8 <= var4) {
                  ((kl) this).field_n = var18.f((byte) 117);
                  break L3;
                } else {
                  ((kl) this).field_n = var18.a((byte) 81);
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
              L5: {
                var7 = stackIn_16_0;
                var8 = 0;
                var9 = -1;
                ((kl) this).field_b = new int[((kl) this).field_n];
                if (var4 < 7) {
                  var10 = 0;
                  L6: while (true) {
                    if (((kl) this).field_n <= var10) {
                      break L5;
                    } else {
                      int dupTemp$4 = var8 + var18.a((byte) 81);
                      var8 = dupTemp$4;
                      ((kl) this).field_b[var10] = dupTemp$4;
                      if (((kl) this).field_b[var10] > var9) {
                        var9 = ((kl) this).field_b[var10];
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
                    if (((kl) this).field_n <= var10) {
                      break L5;
                    } else {
                      int dupTemp$5 = var8 + var18.f((byte) -27);
                      var8 = dupTemp$5;
                      ((kl) this).field_b[var10] = dupTemp$5;
                      if (((kl) this).field_b[var10] > var9) {
                        var9 = ((kl) this).field_b[var10];
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
                ((kl) this).field_d = var9 - -1;
                if (var7 == 0) {
                  break L8;
                } else {
                  ((kl) this).field_k = new byte[((kl) this).field_d][];
                  break L8;
                }
              }
              L9: {
                ((kl) this).field_r = new int[((kl) this).field_d][];
                ((kl) this).field_i = new int[((kl) this).field_d];
                ((kl) this).field_c = new int[((kl) this).field_d];
                ((kl) this).field_e = new int[((kl) this).field_d];
                var10 = 48 / ((param0 - -40) / 37);
                ((kl) this).field_f = new int[((kl) this).field_d];
                if (var6 != 0) {
                  ((kl) this).field_l = new int[((kl) this).field_d];
                  var11 = 0;
                  L10: while (true) {
                    if (((kl) this).field_d <= var11) {
                      var11 = 0;
                      L11: while (true) {
                        if (var11 >= ((kl) this).field_n) {
                          ((kl) this).field_q = new lf(((kl) this).field_l);
                          break L9;
                        } else {
                          ((kl) this).field_l[((kl) this).field_b[var11]] = var18.k(4);
                          var11++;
                          continue L11;
                        }
                      }
                    } else {
                      ((kl) this).field_l[var11] = -1;
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
                if (var11 >= ((kl) this).field_n) {
                  L13: {
                    if (var7 != 0) {
                      var11 = 0;
                      L14: while (true) {
                        if (var11 >= ((kl) this).field_n) {
                          var11 = 0;
                          L15: while (true) {
                            if (var11 >= ((kl) this).field_n) {
                              break L13;
                            } else {
                              ((kl) this).field_f[((kl) this).field_b[var11]] = var18.k(4);
                              var11++;
                              continue L15;
                            }
                          }
                        } else {
                          var22 = new byte[64];
                          var18.a(var22, 0, (byte) -6, 64);
                          ((kl) this).field_k[((kl) this).field_b[var11]] = var22;
                          var11++;
                          continue L14;
                        }
                      }
                    } else {
                      var11 = 0;
                      L16: while (true) {
                        if (var11 >= ((kl) this).field_n) {
                          break L13;
                        } else {
                          ((kl) this).field_f[((kl) this).field_b[var11]] = var18.k(4);
                          var11++;
                          continue L16;
                        }
                      }
                    }
                  }
                  L17: {
                    if (-8 >= (var4 ^ -1)) {
                      var11 = 0;
                      L18: while (true) {
                        if (((kl) this).field_n <= var11) {
                          var11 = 0;
                          L19: while (true) {
                            if (var11 >= ((kl) this).field_n) {
                              break L17;
                            } else {
                              var12 = ((kl) this).field_b[var11];
                              var8 = 0;
                              var13 = ((kl) this).field_i[var12];
                              ((kl) this).field_r[var12] = new int[var13];
                              var14 = -1;
                              var15 = 0;
                              L20: while (true) {
                                if (var15 >= var13) {
                                  ((kl) this).field_e[var12] = var14 - -1;
                                  if (var14 - -1 == var13) {
                                    ((kl) this).field_r[var12] = null;
                                    var11++;
                                    continue L19;
                                  } else {
                                    var11++;
                                    continue L19;
                                  }
                                } else {
                                  int dupTemp$6 = var8 + var18.f((byte) -96);
                                  var8 = dupTemp$6;
                                  ((kl) this).field_r[var12][var15] = dupTemp$6;
                                  var16 = dupTemp$6;
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
                          ((kl) this).field_i[((kl) this).field_b[var11]] = var18.f((byte) -104);
                          var11++;
                          continue L18;
                        }
                      }
                    } else {
                      var11 = 0;
                      L21: while (true) {
                        if (((kl) this).field_n <= var11) {
                          var11 = 0;
                          L22: while (true) {
                            if (((kl) this).field_n <= var11) {
                              break L17;
                            } else {
                              var12 = ((kl) this).field_b[var11];
                              var8 = 0;
                              var13 = ((kl) this).field_i[var12];
                              ((kl) this).field_r[var12] = new int[var13];
                              var14 = -1;
                              var15 = 0;
                              L23: while (true) {
                                if (var15 >= var13) {
                                  ((kl) this).field_e[var12] = var14 - -1;
                                  if (var14 - -1 == var13) {
                                    ((kl) this).field_r[var12] = null;
                                    var11++;
                                    continue L22;
                                  } else {
                                    var11++;
                                    continue L22;
                                  }
                                } else {
                                  int dupTemp$7 = var8 + var18.a((byte) 81);
                                  var8 = dupTemp$7;
                                  ((kl) this).field_r[var12][var15] = dupTemp$7;
                                  var16 = dupTemp$7;
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
                          ((kl) this).field_i[((kl) this).field_b[var11]] = var18.a((byte) 81);
                          var11++;
                          continue L21;
                        }
                      }
                    }
                  }
                  L24: {
                    if (var6 != 0) {
                      ((kl) this).field_s = new lf[var9 + 1];
                      ((kl) this).field_j = new int[1 + var9][];
                      var11 = 0;
                      L25: while (true) {
                        if (((kl) this).field_n <= var11) {
                          break L24;
                        } else {
                          var12 = ((kl) this).field_b[var11];
                          var13 = ((kl) this).field_i[var12];
                          ((kl) this).field_j[var12] = new int[((kl) this).field_e[var12]];
                          var14 = 0;
                          L26: while (true) {
                            if (var14 >= ((kl) this).field_e[var12]) {
                              var14 = 0;
                              L27: while (true) {
                                if (var13 <= var14) {
                                  ((kl) this).field_s[var12] = new lf(((kl) this).field_j[var12]);
                                  var11++;
                                  continue L25;
                                } else {
                                  L28: {
                                    if (((kl) this).field_r[var12] != null) {
                                      var15 = ((kl) this).field_r[var12][var14];
                                      break L28;
                                    } else {
                                      var15 = var14;
                                      break L28;
                                    }
                                  }
                                  ((kl) this).field_j[var12][var15] = var18.k(4);
                                  var14++;
                                  continue L27;
                                }
                              }
                            } else {
                              ((kl) this).field_j[var12][var14] = -1;
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
                  ((kl) this).field_c[((kl) this).field_b[var11]] = var18.k(4);
                  var11++;
                  continue L12;
                }
              }
            }
          }
        }
        throw new RuntimeException();
    }

    kl(byte[] param0, int param1, byte[] param2) {
        int var4 = 0;
        ((kl) this).field_g = er.a(false, param0.length, param0);
        if (((kl) this).field_g != param1) {
            throw new RuntimeException();
        }
        if (param2 != null) {
            if (param2.length != 64) {
                throw new RuntimeException();
            }
            ((kl) this).field_o = jj.a(param0.length, param0, (byte) 91, 0);
            for (var4 = 0; 64 > var4; var4++) {
                if (param2[var4] != ((kl) this).field_o[var4]) {
                    throw new RuntimeException();
                }
            }
        }
        this.a(26, param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = null;
        field_t = true;
    }
}
