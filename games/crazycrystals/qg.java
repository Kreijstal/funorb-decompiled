/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qg {
    int field_b;
    int[] field_g;
    static ih field_s;
    private int[] field_k;
    v field_t;
    private int[][] field_d;
    int[][] field_h;
    int[] field_l;
    static int field_q;
    v[] field_i;
    int[] field_e;
    int[] field_n;
    private byte[] field_j;
    int[] field_f;
    int field_a;
    private int field_p;
    int field_r;
    byte[][] field_m;
    static String field_o;
    static String[] field_c;

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
        Object var17 = null;
        ng var18 = null;
        byte[] var22 = null;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        L0: {
          var16 = CrazyCrystals.field_B;
          var18 = new ng(b.a(param1, -1));
          var4 = var18.h(255);
          if (-6 < (var4 ^ -1)) {
            break L0;
          } else {
            if (-8 > (var4 ^ -1)) {
              break L0;
            } else {
              L1: {
                if (-7 < (var4 ^ -1)) {
                  ((qg) this).field_r = 0;
                  break L1;
                } else {
                  ((qg) this).field_r = var18.b((byte) 127);
                  break L1;
                }
              }
              L2: {
                var5 = var18.h(255);
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
                if (-1 == (2 & var5 ^ -1)) {
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
                  ((qg) this).field_p = var18.a((byte) -122);
                  break L4;
                } else {
                  ((qg) this).field_p = var18.c((byte) -7);
                  break L4;
                }
              }
              L5: {
                var8 = 0;
                var9 = -1;
                ((qg) this).field_e = new int[((qg) this).field_p];
                if (7 > var4) {
                  var10 = 0;
                  L6: while (true) {
                    if ((((qg) this).field_p ^ -1) >= (var10 ^ -1)) {
                      break L5;
                    } else {
                      L7: {
                        int dupTemp$4 = var8 + var18.c((byte) -7);
                        var8 = dupTemp$4;
                        ((qg) this).field_e[var10] = dupTemp$4;
                        if ((var9 ^ -1) > (((qg) this).field_e[var10] ^ -1)) {
                          var9 = ((qg) this).field_e[var10];
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      var10++;
                      continue L6;
                    }
                  }
                } else {
                  var10 = 0;
                  L8: while (true) {
                    if ((var10 ^ -1) <= (((qg) this).field_p ^ -1)) {
                      break L5;
                    } else {
                      L9: {
                        int dupTemp$5 = var8 + var18.a((byte) -124);
                        var8 = dupTemp$5;
                        ((qg) this).field_e[var10] = dupTemp$5;
                        if ((((qg) this).field_e[var10] ^ -1) >= (var9 ^ -1)) {
                          break L9;
                        } else {
                          var9 = ((qg) this).field_e[var10];
                          break L9;
                        }
                      }
                      var10++;
                      continue L8;
                    }
                  }
                }
              }
              L10: {
                ((qg) this).field_a = 1 + var9;
                if (var7 == 0) {
                  break L10;
                } else {
                  ((qg) this).field_m = new byte[((qg) this).field_a][];
                  break L10;
                }
              }
              L11: {
                ((qg) this).field_l = new int[((qg) this).field_a];
                ((qg) this).field_h = new int[((qg) this).field_a][];
                ((qg) this).field_f = new int[((qg) this).field_a];
                ((qg) this).field_g = new int[((qg) this).field_a];
                ((qg) this).field_n = new int[((qg) this).field_a];
                if (var6 == 0) {
                  break L11;
                } else {
                  ((qg) this).field_k = new int[((qg) this).field_a];
                  var10 = 0;
                  L12: while (true) {
                    if (((qg) this).field_a <= var10) {
                      var10 = 0;
                      L13: while (true) {
                        if (var10 >= ((qg) this).field_p) {
                          ((qg) this).field_t = new v(((qg) this).field_k);
                          break L11;
                        } else {
                          ((qg) this).field_k[((qg) this).field_e[var10]] = var18.b((byte) -23);
                          var10++;
                          continue L13;
                        }
                      }
                    } else {
                      ((qg) this).field_k[var10] = -1;
                      var10++;
                      continue L12;
                    }
                  }
                }
              }
              var10 = 0;
              L14: while (true) {
                if ((((qg) this).field_p ^ -1) >= (var10 ^ -1)) {
                  L15: {
                    if (var7 == 0) {
                      break L15;
                    } else {
                      var10 = 0;
                      L16: while (true) {
                        if (((qg) this).field_p <= var10) {
                          break L15;
                        } else {
                          var22 = new byte[64];
                          var18.a(64, var22, (byte) -110, 0);
                          ((qg) this).field_m[((qg) this).field_e[var10]] = var22;
                          var10++;
                          continue L16;
                        }
                      }
                    }
                  }
                  var10 = 0;
                  L17: while (true) {
                    if ((((qg) this).field_p ^ -1) >= (var10 ^ -1)) {
                      L18: {
                        if (-8 < (var4 ^ -1)) {
                          var10 = 0;
                          L19: while (true) {
                            if ((((qg) this).field_p ^ -1) >= (var10 ^ -1)) {
                              var10 = 0;
                              L20: while (true) {
                                if ((var10 ^ -1) <= (((qg) this).field_p ^ -1)) {
                                  break L18;
                                } else {
                                  var11 = ((qg) this).field_e[var10];
                                  var8 = 0;
                                  var12 = ((qg) this).field_f[var11];
                                  var13 = -1;
                                  ((qg) this).field_h[var11] = new int[var12];
                                  var14 = 0;
                                  L21: while (true) {
                                    if ((var12 ^ -1) >= (var14 ^ -1)) {
                                      L22: {
                                        ((qg) this).field_l[var11] = var13 - -1;
                                        if (1 + var13 == var12) {
                                          ((qg) this).field_h[var11] = null;
                                          break L22;
                                        } else {
                                          break L22;
                                        }
                                      }
                                      var10++;
                                      continue L20;
                                    } else {
                                      L23: {
                                        int dupTemp$6 = var8 + var18.c((byte) -7);
                                        var8 = dupTemp$6;
                                        ((qg) this).field_h[var11][var14] = dupTemp$6;
                                        var15 = dupTemp$6;
                                        if ((var13 ^ -1) > (var15 ^ -1)) {
                                          var13 = var15;
                                          break L23;
                                        } else {
                                          break L23;
                                        }
                                      }
                                      var14++;
                                      continue L21;
                                    }
                                  }
                                }
                              }
                            } else {
                              ((qg) this).field_f[((qg) this).field_e[var10]] = var18.c((byte) -7);
                              var10++;
                              continue L19;
                            }
                          }
                        } else {
                          var10 = 0;
                          L24: while (true) {
                            if ((var10 ^ -1) <= (((qg) this).field_p ^ -1)) {
                              var10 = 0;
                              L25: while (true) {
                                if (var10 >= ((qg) this).field_p) {
                                  break L18;
                                } else {
                                  var11 = ((qg) this).field_e[var10];
                                  var8 = 0;
                                  var12 = ((qg) this).field_f[var11];
                                  var13 = -1;
                                  ((qg) this).field_h[var11] = new int[var12];
                                  var14 = 0;
                                  L26: while (true) {
                                    if ((var14 ^ -1) <= (var12 ^ -1)) {
                                      L27: {
                                        ((qg) this).field_l[var11] = 1 + var13;
                                        if ((var12 ^ -1) == (var13 - -1 ^ -1)) {
                                          ((qg) this).field_h[var11] = null;
                                          break L27;
                                        } else {
                                          break L27;
                                        }
                                      }
                                      var10++;
                                      continue L25;
                                    } else {
                                      L28: {
                                        int dupTemp$7 = var8 + var18.a((byte) -121);
                                        var8 = dupTemp$7;
                                        ((qg) this).field_h[var11][var14] = dupTemp$7;
                                        var15 = dupTemp$7;
                                        if ((var13 ^ -1) <= (var15 ^ -1)) {
                                          break L28;
                                        } else {
                                          var13 = var15;
                                          break L28;
                                        }
                                      }
                                      var14++;
                                      continue L26;
                                    }
                                  }
                                }
                              }
                            } else {
                              ((qg) this).field_f[((qg) this).field_e[var10]] = var18.a((byte) -121);
                              var10++;
                              continue L24;
                            }
                          }
                        }
                      }
                      L29: {
                        if (var6 == 0) {
                          break L29;
                        } else {
                          ((qg) this).field_d = new int[var9 + 1][];
                          ((qg) this).field_i = new v[var9 + 1];
                          var10 = 0;
                          L30: while (true) {
                            if (((qg) this).field_p <= var10) {
                              break L29;
                            } else {
                              var11 = ((qg) this).field_e[var10];
                              var12 = ((qg) this).field_f[var11];
                              ((qg) this).field_d[var11] = new int[((qg) this).field_l[var11]];
                              var13 = 0;
                              L31: while (true) {
                                if ((var13 ^ -1) <= (((qg) this).field_l[var11] ^ -1)) {
                                  var13 = 0;
                                  L32: while (true) {
                                    if ((var13 ^ -1) <= (var12 ^ -1)) {
                                      ((qg) this).field_i[var11] = new v(((qg) this).field_d[var11]);
                                      var10++;
                                      continue L30;
                                    } else {
                                      L33: {
                                        if (null != ((qg) this).field_h[var11]) {
                                          var14 = ((qg) this).field_h[var11][var13];
                                          break L33;
                                        } else {
                                          var14 = var13;
                                          break L33;
                                        }
                                      }
                                      ((qg) this).field_d[var11][var14] = var18.b((byte) -59);
                                      var13++;
                                      continue L32;
                                    }
                                  }
                                } else {
                                  ((qg) this).field_d[var11][var13] = -1;
                                  var13++;
                                  continue L31;
                                }
                              }
                            }
                          }
                        }
                      }
                      L34: {
                        if (param0 == 64) {
                          break L34;
                        } else {
                          var17 = null;
                          this.a(-2, (byte[]) null);
                          break L34;
                        }
                      }
                      return;
                    } else {
                      ((qg) this).field_g[((qg) this).field_e[var10]] = var18.b((byte) 127);
                      var10++;
                      continue L17;
                    }
                  }
                } else {
                  ((qg) this).field_n[((qg) this).field_e[var10]] = var18.b((byte) 127);
                  var10++;
                  continue L14;
                }
              }
            }
          }
        }
        throw new RuntimeException();
    }

    public static void a(byte param0) {
        field_c = null;
        field_o = null;
        if (param0 != 51) {
            field_o = null;
        }
        field_s = null;
    }

    qg(byte[] param0, int param1, byte[] param2) {
        int var4 = 0;
        ((qg) this).field_b = gi.a(param0.length, param0, 26009);
        if (((qg) this).field_b != param1) {
            throw new RuntimeException();
        }
        if (param2 != null) {
            if (-65 != (param2.length ^ -1)) {
                throw new RuntimeException();
            }
            ((qg) this).field_j = ac.a(param0, 0, param0.length, (byte) -127);
            for (var4 = 0; (var4 ^ -1) > -65; var4++) {
                if (((qg) this).field_j[var4] != param2[var4]) {
                    throw new RuntimeException();
                }
            }
        }
        this.a(64, param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = new ih();
        field_c = new String[]{"Three's a Crowd", "Infestation Team", "Chomp", "Crystal Race", "Armageddon!"};
        field_o = "You are not currently logged in to the<nbsp>game.";
    }
}
