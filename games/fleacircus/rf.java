/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rf {
    private int[] field_g;
    int[] field_u;
    int[] field_r;
    static int field_l;
    int[] field_n;
    int field_i;
    byte[][] field_o;
    static int[] field_c;
    int field_t;
    static int[] field_e;
    static String field_q;
    private byte[] field_b;
    private int[][] field_m;
    int field_p;
    static int field_a;
    int[][] field_h;
    int[] field_v;
    private int field_s;
    fl[] field_k;
    static int field_d;
    fl field_j;
    int[] field_f;

    public static void a(byte param0) {
        field_c = null;
        field_e = null;
        if (param0 < 115) {
            field_c = null;
        }
        field_q = null;
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
        ni var17 = null;
        byte[] var21 = null;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        L0: {
          var16 = fleas.field_A ? 1 : 0;
          var17 = new ni(qi.a(param0, -22518));
          var4 = var17.e(false);
          if ((var4 ^ -1) > -6) {
            break L0;
          } else {
            if (var4 > 7) {
              break L0;
            } else {
              L1: {
                if ((var4 ^ -1) <= -7) {
                  ((rf) this).field_t = var17.c((byte) 126);
                  break L1;
                } else {
                  ((rf) this).field_t = 0;
                  break L1;
                }
              }
              L2: {
                var5 = var17.e(false);
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
                if ((var5 & 2) == 0) {
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
                  ((rf) this).field_s = var17.e((byte) 120);
                  break L4;
                } else {
                  ((rf) this).field_s = var17.d((byte) -79);
                  break L4;
                }
              }
              L5: {
                var8 = 0;
                var9 = -1;
                ((rf) this).field_r = new int[((rf) this).field_s];
                if (var4 < 7) {
                  var10 = 0;
                  L6: while (true) {
                    if (((rf) this).field_s <= var10) {
                      break L5;
                    } else {
                      var8 = var8 + var17.d((byte) -62);
                      ((rf) this).field_r[var10] = var8 + var17.d((byte) -62);
                      if (((rf) this).field_r[var10] > var9) {
                        var9 = ((rf) this).field_r[var10];
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
                    if (var10 >= ((rf) this).field_s) {
                      break L5;
                    } else {
                      var8 = var8 + var17.e((byte) 63);
                      ((rf) this).field_r[var10] = var8 + var17.e((byte) 63);
                      if (var9 < ((rf) this).field_r[var10]) {
                        var9 = ((rf) this).field_r[var10];
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
                ((rf) this).field_i = 1 + var9;
                ((rf) this).field_h = new int[((rf) this).field_i][];
                ((rf) this).field_n = new int[((rf) this).field_i];
                ((rf) this).field_u = new int[((rf) this).field_i];
                ((rf) this).field_v = new int[((rf) this).field_i];
                ((rf) this).field_f = new int[((rf) this).field_i];
                if (var7 != 0) {
                  ((rf) this).field_o = new byte[((rf) this).field_i][];
                  break L8;
                } else {
                  break L8;
                }
              }
              L9: {
                if (var6 != 0) {
                  ((rf) this).field_g = new int[((rf) this).field_i];
                  var10 = 0;
                  L10: while (true) {
                    if (var10 >= ((rf) this).field_i) {
                      var10 = 0;
                      L11: while (true) {
                        if (var10 >= ((rf) this).field_s) {
                          ((rf) this).field_j = new fl(((rf) this).field_g);
                          break L9;
                        } else {
                          ((rf) this).field_g[((rf) this).field_r[var10]] = var17.c((byte) -82);
                          var10++;
                          continue L11;
                        }
                      }
                    } else {
                      ((rf) this).field_g[var10] = -1;
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
                if (var10 >= ((rf) this).field_s) {
                  L13: {
                    if (var7 == 0) {
                      break L13;
                    } else {
                      var10 = 0;
                      L14: while (true) {
                        if (var10 >= ((rf) this).field_s) {
                          break L13;
                        } else {
                          var21 = new byte[64];
                          var17.b(var21, 0, -58, 64);
                          ((rf) this).field_o[((rf) this).field_r[var10]] = var21;
                          var10++;
                          continue L14;
                        }
                      }
                    }
                  }
                  var10 = 0;
                  L15: while (true) {
                    if (((rf) this).field_s <= var10) {
                      L16: {
                        if (param1 == 19083) {
                          break L16;
                        } else {
                          rf.a((byte) -112);
                          break L16;
                        }
                      }
                      L17: {
                        if ((var4 ^ -1) <= -8) {
                          var10 = 0;
                          L18: while (true) {
                            if (var10 >= ((rf) this).field_s) {
                              var10 = 0;
                              L19: while (true) {
                                if (var10 >= ((rf) this).field_s) {
                                  break L17;
                                } else {
                                  var11 = ((rf) this).field_r[var10];
                                  var12 = ((rf) this).field_f[var11];
                                  var8 = 0;
                                  var13 = -1;
                                  ((rf) this).field_h[var11] = new int[var12];
                                  var14 = 0;
                                  L20: while (true) {
                                    if (var14 >= var12) {
                                      ((rf) this).field_v[var11] = 1 + var13;
                                      if (var12 == 1 + var13) {
                                        ((rf) this).field_h[var11] = null;
                                        var10++;
                                        continue L19;
                                      } else {
                                        var10++;
                                        continue L19;
                                      }
                                    } else {
                                      var8 = var8 + var17.e((byte) 111);
                                      ((rf) this).field_h[var11][var14] = var8 + var17.e((byte) 111);
                                      var15 = var8 + var17.e((byte) 111);
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
                              ((rf) this).field_f[((rf) this).field_r[var10]] = var17.e((byte) 86);
                              var10++;
                              continue L18;
                            }
                          }
                        } else {
                          var10 = 0;
                          L21: while (true) {
                            if (var10 >= ((rf) this).field_s) {
                              var10 = 0;
                              L22: while (true) {
                                if (var10 >= ((rf) this).field_s) {
                                  break L17;
                                } else {
                                  var11 = ((rf) this).field_r[var10];
                                  var8 = 0;
                                  var12 = ((rf) this).field_f[var11];
                                  ((rf) this).field_h[var11] = new int[var12];
                                  var13 = -1;
                                  var14 = 0;
                                  L23: while (true) {
                                    if (var14 >= var12) {
                                      ((rf) this).field_v[var11] = var13 - -1;
                                      if (var12 == var13 - -1) {
                                        ((rf) this).field_h[var11] = null;
                                        var10++;
                                        continue L22;
                                      } else {
                                        var10++;
                                        continue L22;
                                      }
                                    } else {
                                      var8 = var8 + var17.d((byte) 122);
                                      ((rf) this).field_h[var11][var14] = var8 + var17.d((byte) 122);
                                      var15 = var8 + var17.d((byte) 122);
                                      if (var13 < var15) {
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
                              ((rf) this).field_f[((rf) this).field_r[var10]] = var17.d((byte) 113);
                              var10++;
                              continue L21;
                            }
                          }
                        }
                      }
                      L24: {
                        if (var6 == 0) {
                          break L24;
                        } else {
                          ((rf) this).field_m = new int[var9 + 1][];
                          ((rf) this).field_k = new fl[1 + var9];
                          var10 = 0;
                          L25: while (true) {
                            if (((rf) this).field_s <= var10) {
                              break L24;
                            } else {
                              var11 = ((rf) this).field_r[var10];
                              var12 = ((rf) this).field_f[var11];
                              ((rf) this).field_m[var11] = new int[((rf) this).field_v[var11]];
                              var13 = 0;
                              L26: while (true) {
                                if (((rf) this).field_v[var11] <= var13) {
                                  var13 = 0;
                                  L27: while (true) {
                                    if (var12 <= var13) {
                                      ((rf) this).field_k[var11] = new fl(((rf) this).field_m[var11]);
                                      var10++;
                                      continue L25;
                                    } else {
                                      L28: {
                                        if (((rf) this).field_h[var11] != null) {
                                          var14 = ((rf) this).field_h[var11][var13];
                                          break L28;
                                        } else {
                                          var14 = var13;
                                          break L28;
                                        }
                                      }
                                      ((rf) this).field_m[var11][var14] = var17.c((byte) 124);
                                      var13++;
                                      continue L27;
                                    }
                                  }
                                } else {
                                  ((rf) this).field_m[var11][var13] = -1;
                                  var13++;
                                  continue L26;
                                }
                              }
                            }
                          }
                        }
                      }
                      return;
                    } else {
                      ((rf) this).field_n[((rf) this).field_r[var10]] = var17.c((byte) -1);
                      var10++;
                      continue L15;
                    }
                  }
                } else {
                  ((rf) this).field_u[((rf) this).field_r[var10]] = var17.c((byte) 125);
                  var10++;
                  continue L12;
                }
              }
            }
          }
        }
        throw new RuntimeException();
    }

    rf(byte[] param0, int param1, byte[] param2) {
        int var4 = 0;
        ((rf) this).field_p = ia.a(true, param0, param0.length);
        if (((rf) this).field_p != param1) {
            throw new RuntimeException();
        }
        if (param2 != null) {
            if (-65 != (param2.length ^ -1)) {
                throw new RuntimeException();
            }
            ((rf) this).field_b = kb.a(param0, param0.length, (byte) 111, 0);
            for (var4 = 0; var4 < 64; var4++) {
                if (((rf) this).field_b[var4] != param2[var4]) {
                    throw new RuntimeException();
                }
            }
        }
        this.a(param0, 19083);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new int[40];
        field_q = "Unfortunately we are unable to create an account for you at this time.";
        field_a = -1;
        field_c = new int[]{1, 2, 3, 10, 2, 1, 1, 2, 3, 3, 2, 2, 2, 3, 5, 10};
        field_d = 5;
    }
}
