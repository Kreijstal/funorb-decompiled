/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lh {
    vj field_q;
    int field_e;
    int field_m;
    private byte[] field_s;
    int[] field_p;
    int[] field_l;
    int[] field_k;
    vj[] field_c;
    private int field_a;
    private int[][] field_o;
    int[] field_j;
    byte[][] field_h;
    int[][] field_b;
    int field_r;
    private int[] field_i;
    static th field_n;
    int[] field_g;
    static volatile boolean field_f;
    static int field_d;

    final static boolean a(ej param0, byte param1) {
        int var2 = -34 % ((-76 - param1) / 34);
        return param0.a(-54);
    }

    public static void a(byte param0) {
        int var1 = 52 % ((param0 - 56) / 59);
        field_n = null;
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
        ka var17 = null;
        byte[] var21 = null;
        int stackIn_10_0 = 0;
        int stackIn_16_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        L0: {
          var16 = stellarshard.field_B;
          var17 = new ka(sl.a((byte) -64, param1));
          var4 = var17.f(4);
          if (var4 < 5) {
            break L0;
          } else {
            if (7 < var4) {
              break L0;
            } else {
              L1: {
                if (6 <= var4) {
                  ((lh) this).field_r = var17.b(false);
                  break L1;
                } else {
                  ((lh) this).field_r = 0;
                  break L1;
                }
              }
              L2: {
                var5 = var17.f(4);
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
                if (var4 < 7) {
                  ((lh) this).field_a = var17.c((byte) 35);
                  break L3;
                } else {
                  ((lh) this).field_a = var17.h(26491);
                  break L3;
                }
              }
              L4: {
                if ((var5 & 2) == 0) {
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
                ((lh) this).field_k = new int[((lh) this).field_a];
                var9 = -1;
                if (var4 >= 7) {
                  var10 = 0;
                  L6: while (true) {
                    if (((lh) this).field_a <= var10) {
                      break L5;
                    } else {
                      int dupTemp$4 = var8 + var17.h(26491);
                      var8 = dupTemp$4;
                      ((lh) this).field_k[var10] = dupTemp$4;
                      if (((lh) this).field_k[var10] > var9) {
                        var9 = ((lh) this).field_k[var10];
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
                    if (var10 >= ((lh) this).field_a) {
                      break L5;
                    } else {
                      int dupTemp$5 = var8 + var17.c((byte) 42);
                      var8 = dupTemp$5;
                      ((lh) this).field_k[var10] = dupTemp$5;
                      if (var9 < ((lh) this).field_k[var10]) {
                        var9 = ((lh) this).field_k[var10];
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
                ((lh) this).field_e = 1 + var9;
                ((lh) this).field_p = new int[((lh) this).field_e];
                if (var7 != 0) {
                  ((lh) this).field_h = new byte[((lh) this).field_e][];
                  break L8;
                } else {
                  break L8;
                }
              }
              L9: {
                ((lh) this).field_g = new int[((lh) this).field_e];
                ((lh) this).field_l = new int[((lh) this).field_e];
                ((lh) this).field_j = new int[((lh) this).field_e];
                ((lh) this).field_b = new int[((lh) this).field_e][];
                if (var6 == 0) {
                  break L9;
                } else {
                  ((lh) this).field_i = new int[((lh) this).field_e];
                  var10 = 0;
                  L10: while (true) {
                    if (((lh) this).field_e <= var10) {
                      var10 = 0;
                      L11: while (true) {
                        if (((lh) this).field_a <= var10) {
                          ((lh) this).field_q = new vj(((lh) this).field_i);
                          break L9;
                        } else {
                          ((lh) this).field_i[((lh) this).field_k[var10]] = var17.b(false);
                          var10++;
                          continue L11;
                        }
                      }
                    } else {
                      ((lh) this).field_i[var10] = -1;
                      var10++;
                      continue L10;
                    }
                  }
                }
              }
              var10 = param0;
              L12: while (true) {
                if (var10 >= ((lh) this).field_a) {
                  L13: {
                    if (var7 == 0) {
                      break L13;
                    } else {
                      var10 = 0;
                      L14: while (true) {
                        if (var10 >= ((lh) this).field_a) {
                          break L13;
                        } else {
                          var21 = new byte[64];
                          var17.a(0, (byte) -100, 64, var21);
                          ((lh) this).field_h[((lh) this).field_k[var10]] = var21;
                          var10++;
                          continue L14;
                        }
                      }
                    }
                  }
                  var10 = 0;
                  L15: while (true) {
                    if (((lh) this).field_a <= var10) {
                      L16: {
                        if (-8 < (var4 ^ -1)) {
                          var10 = 0;
                          L17: while (true) {
                            if (((lh) this).field_a <= var10) {
                              var10 = 0;
                              L18: while (true) {
                                if (var10 >= ((lh) this).field_a) {
                                  break L16;
                                } else {
                                  var11 = ((lh) this).field_k[var10];
                                  var12 = ((lh) this).field_p[var11];
                                  var8 = 0;
                                  ((lh) this).field_b[var11] = new int[var12];
                                  var13 = -1;
                                  var14 = 0;
                                  L19: while (true) {
                                    if (var12 <= var14) {
                                      ((lh) this).field_g[var11] = 1 + var13;
                                      if (var13 + 1 == var12) {
                                        ((lh) this).field_b[var11] = null;
                                        var10++;
                                        continue L18;
                                      } else {
                                        var10++;
                                        continue L18;
                                      }
                                    } else {
                                      int dupTemp$6 = var8 + var17.c((byte) 102);
                                      var8 = dupTemp$6;
                                      ((lh) this).field_b[var11][var14] = dupTemp$6;
                                      var15 = dupTemp$6;
                                      if (var15 > var13) {
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
                              ((lh) this).field_p[((lh) this).field_k[var10]] = var17.c((byte) 92);
                              var10++;
                              continue L17;
                            }
                          }
                        } else {
                          var10 = 0;
                          L20: while (true) {
                            if (var10 >= ((lh) this).field_a) {
                              var10 = 0;
                              L21: while (true) {
                                if (var10 >= ((lh) this).field_a) {
                                  break L16;
                                } else {
                                  var11 = ((lh) this).field_k[var10];
                                  var8 = 0;
                                  var12 = ((lh) this).field_p[var11];
                                  var13 = -1;
                                  ((lh) this).field_b[var11] = new int[var12];
                                  var14 = 0;
                                  L22: while (true) {
                                    if (var14 >= var12) {
                                      ((lh) this).field_g[var11] = 1 + var13;
                                      if (1 + var13 == var12) {
                                        ((lh) this).field_b[var11] = null;
                                        var10++;
                                        continue L21;
                                      } else {
                                        var10++;
                                        continue L21;
                                      }
                                    } else {
                                      int dupTemp$7 = var8 + var17.h(26491);
                                      var8 = dupTemp$7;
                                      ((lh) this).field_b[var11][var14] = dupTemp$7;
                                      var15 = dupTemp$7;
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
                              ((lh) this).field_p[((lh) this).field_k[var10]] = var17.h(ih.a(param0, 26491));
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
                          ((lh) this).field_o = new int[1 + var9][];
                          ((lh) this).field_c = new vj[var9 + 1];
                          var10 = 0;
                          L24: while (true) {
                            if (var10 >= ((lh) this).field_a) {
                              break L23;
                            } else {
                              var11 = ((lh) this).field_k[var10];
                              var12 = ((lh) this).field_p[var11];
                              ((lh) this).field_o[var11] = new int[((lh) this).field_g[var11]];
                              var13 = 0;
                              L25: while (true) {
                                if (((lh) this).field_g[var11] <= var13) {
                                  var13 = 0;
                                  L26: while (true) {
                                    if (var12 <= var13) {
                                      ((lh) this).field_c[var11] = new vj(((lh) this).field_o[var11]);
                                      var10++;
                                      continue L24;
                                    } else {
                                      L27: {
                                        if (null == ((lh) this).field_b[var11]) {
                                          var14 = var13;
                                          break L27;
                                        } else {
                                          var14 = ((lh) this).field_b[var11][var13];
                                          break L27;
                                        }
                                      }
                                      ((lh) this).field_o[var11][var14] = var17.b(false);
                                      var13++;
                                      continue L26;
                                    }
                                  }
                                } else {
                                  ((lh) this).field_o[var11][var13] = -1;
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
                      ((lh) this).field_j[((lh) this).field_k[var10]] = var17.b(false);
                      var10++;
                      continue L15;
                    }
                  }
                } else {
                  ((lh) this).field_l[((lh) this).field_k[var10]] = var17.b(false);
                  var10++;
                  continue L12;
                }
              }
            }
          }
        }
        throw new RuntimeException();
    }

    lh(byte[] param0, int param1, byte[] param2) {
        int var4 = 0;
        ((lh) this).field_m = bg.a(param0.length, param0, 0);
        if (((lh) this).field_m != param1) {
            throw new RuntimeException();
        }
        if (param2 != null) {
            if (64 != param2.length) {
                throw new RuntimeException();
            }
            ((lh) this).field_s = bc.a(0, 0, param0.length, param0);
            for (var4 = 0; var4 < 64; var4++) {
                if (((lh) this).field_s[var4] != param2[var4]) {
                    throw new RuntimeException();
                }
            }
        }
        this.a(0, param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = new th();
        field_d = 1;
        field_f = true;
    }
}
