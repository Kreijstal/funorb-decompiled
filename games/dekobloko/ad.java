/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ad {
    private int field_w;
    byte[][] field_l;
    static int field_a;
    int[][] field_v;
    oc field_e;
    oc[] field_o;
    static ck field_d;
    int[] field_k;
    int field_m;
    int[] field_y;
    int field_n;
    int field_s;
    int[] field_f;
    static String field_b;
    private int[][] field_r;
    private int[] field_p;
    private byte[] field_h;
    static String field_A;
    int[] field_c;
    static w field_q;
    static ck[][] field_j;
    int[] field_B;
    static ck field_g;
    static String field_t;
    static int field_u;
    static int[] field_i;
    static String field_x;
    static String field_z;

    public static void a(byte param0) {
        field_b = null;
        field_d = null;
        field_j = null;
        field_i = null;
        field_A = null;
        field_z = null;
        field_x = null;
        field_q = null;
        field_g = null;
        field_t = null;
        if (param0 != -67) {
            field_g = null;
        }
    }

    final static void a(int param0, int param1) {
        if (param0 != -1) {
            field_q = null;
        }
        uf var2 = we.field_b;
        var2.f(param1, -4);
        var2.a(true, 1);
        var2.a(true, 0);
    }

    final static String a(ji param0, String param1, boolean param2, String param3) {
        if (!param0.a((byte) 121)) {
            return param1;
        }
        if (!param2) {
            Object var5 = null;
            ad.a((byte[]) null, -41, true, 8, -58, true);
        }
        return param3 + " - " + param0.b((byte) -89) + "%";
    }

    final static void a(byte[] param0, int param1, boolean param2, int param3, int param4, boolean param5) {
        uf var6 = we.field_b;
        var6.f(param1, -4);
        var6.field_n = var6.field_n + 1;
        int var7 = var6.field_n;
        var6.a(param2, 4);
        var6.a(param2, param3);
        int var8 = param4;
        if (param5) {
            // wide iinc 8 128
        }
        var6.a(param2, var8);
        var6.a(false, param0.length, param0, 0);
        var6.b(-var7 + var6.field_n, param2);
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
        wl var17 = null;
        byte[] var21 = null;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        L0: {
          var16 = client.field_A ? 1 : 0;
          var17 = new wl(i.a(param0, -89));
          var4 = var17.d((byte) -114);
          if (var4 > -6) {
            break L0;
          } else {
            if (-8 >= var4) {
              L1: {
                if (-7 >= (var4 ^ -1)) {
                  ((ad) this).field_m = var17.i(param1 ^ 7553);
                  break L1;
                } else {
                  ((ad) this).field_m = 0;
                  break L1;
                }
              }
              L2: {
                var5 = var17.d((byte) -46);
                if ((var5 & 1) == 0) {
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
                if (7 <= var4) {
                  ((ad) this).field_w = var17.f(21663);
                  break L4;
                } else {
                  ((ad) this).field_w = var17.e(param1 + 3);
                  break L4;
                }
              }
              L5: {
                var8 = 0;
                var9 = -1;
                ((ad) this).field_f = new int[((ad) this).field_w];
                if (-8 < (var4 ^ -1)) {
                  var10 = 0;
                  L6: while (true) {
                    if (((ad) this).field_w <= var10) {
                      break L5;
                    } else {
                      var8 = var8 + var17.e(qm.b(param1, 3));
                      ((ad) this).field_f[var10] = var8 + var17.e(qm.b(param1, 3));
                      if (((ad) this).field_f[var10] > var9) {
                        var9 = ((ad) this).field_f[var10];
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
                    if (((ad) this).field_w <= var10) {
                      break L5;
                    } else {
                      var8 = var8 + var17.f(21663);
                      ((ad) this).field_f[var10] = var8 + var17.f(21663);
                      if (((ad) this).field_f[var10] > var9) {
                        var9 = ((ad) this).field_f[var10];
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
                ((ad) this).field_n = var9 - -1;
                ((ad) this).field_y = new int[((ad) this).field_n];
                if (var7 != 0) {
                  ((ad) this).field_l = new byte[((ad) this).field_n][];
                  break L8;
                } else {
                  break L8;
                }
              }
              L9: {
                ((ad) this).field_c = new int[((ad) this).field_n];
                ((ad) this).field_v = new int[((ad) this).field_n][];
                ((ad) this).field_B = new int[((ad) this).field_n];
                ((ad) this).field_k = new int[((ad) this).field_n];
                if (var6 == 0) {
                  break L9;
                } else {
                  ((ad) this).field_p = new int[((ad) this).field_n];
                  var10 = 0;
                  L10: while (true) {
                    if (((ad) this).field_n <= var10) {
                      var10 = 0;
                      L11: while (true) {
                        if (((ad) this).field_w <= var10) {
                          ((ad) this).field_e = new oc(((ad) this).field_p);
                          break L9;
                        } else {
                          ((ad) this).field_p[((ad) this).field_f[var10]] = var17.i(param1 + 7553);
                          var10++;
                          continue L11;
                        }
                      }
                    } else {
                      ((ad) this).field_p[var10] = -1;
                      var10++;
                      continue L10;
                    }
                  }
                }
              }
              var10 = param1;
              L12: while (true) {
                if (((ad) this).field_w <= var10) {
                  L13: {
                    if (var7 == 0) {
                      break L13;
                    } else {
                      var10 = 0;
                      L14: while (true) {
                        if (var10 >= ((ad) this).field_w) {
                          break L13;
                        } else {
                          var21 = new byte[64];
                          var17.a(var21, 0, (byte) 125, 64);
                          ((ad) this).field_l[((ad) this).field_f[var10]] = var21;
                          var10++;
                          continue L14;
                        }
                      }
                    }
                  }
                  var10 = 0;
                  L15: while (true) {
                    if (((ad) this).field_w <= var10) {
                      L16: {
                        if (-8 >= (var4 ^ -1)) {
                          var10 = 0;
                          L17: while (true) {
                            if (((ad) this).field_w <= var10) {
                              var10 = 0;
                              L18: while (true) {
                                if (((ad) this).field_w <= var10) {
                                  break L16;
                                } else {
                                  var11 = ((ad) this).field_f[var10];
                                  var12 = ((ad) this).field_B[var11];
                                  var8 = 0;
                                  ((ad) this).field_v[var11] = new int[var12];
                                  var13 = -1;
                                  var14 = 0;
                                  L19: while (true) {
                                    if (var14 >= var12) {
                                      ((ad) this).field_k[var11] = 1 + var13;
                                      if (var13 - -1 == var12) {
                                        ((ad) this).field_v[var11] = null;
                                        var10++;
                                        continue L18;
                                      } else {
                                        var10++;
                                        continue L18;
                                      }
                                    } else {
                                      var8 = var8 + var17.f(21663);
                                      ((ad) this).field_v[var11][var14] = var8 + var17.f(21663);
                                      var15 = var8 + var17.f(21663);
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
                              ((ad) this).field_B[((ad) this).field_f[var10]] = var17.f(21663);
                              var10++;
                              continue L17;
                            }
                          }
                        } else {
                          var10 = 0;
                          L20: while (true) {
                            if (var10 >= ((ad) this).field_w) {
                              var10 = 0;
                              L21: while (true) {
                                if (((ad) this).field_w <= var10) {
                                  break L16;
                                } else {
                                  var11 = ((ad) this).field_f[var10];
                                  var12 = ((ad) this).field_B[var11];
                                  var8 = 0;
                                  var13 = -1;
                                  ((ad) this).field_v[var11] = new int[var12];
                                  var14 = 0;
                                  L22: while (true) {
                                    if (var14 >= var12) {
                                      ((ad) this).field_k[var11] = 1 + var13;
                                      if (1 + var13 == var12) {
                                        ((ad) this).field_v[var11] = null;
                                        var10++;
                                        continue L21;
                                      } else {
                                        var10++;
                                        continue L21;
                                      }
                                    } else {
                                      var8 = var8 + var17.e(3);
                                      ((ad) this).field_v[var11][var14] = var8 + var17.e(3);
                                      var15 = var8 + var17.e(3);
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
                              ((ad) this).field_B[((ad) this).field_f[var10]] = var17.e(3);
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
                          ((ad) this).field_o = new oc[var9 + 1];
                          ((ad) this).field_r = new int[var9 + 1][];
                          var10 = 0;
                          L24: while (true) {
                            if (((ad) this).field_w <= var10) {
                              break L23;
                            } else {
                              var11 = ((ad) this).field_f[var10];
                              var12 = ((ad) this).field_B[var11];
                              ((ad) this).field_r[var11] = new int[((ad) this).field_k[var11]];
                              var13 = 0;
                              L25: while (true) {
                                if (((ad) this).field_k[var11] <= var13) {
                                  var13 = 0;
                                  L26: while (true) {
                                    if (var13 >= var12) {
                                      ((ad) this).field_o[var11] = new oc(((ad) this).field_r[var11]);
                                      var10++;
                                      continue L24;
                                    } else {
                                      L27: {
                                        if (null != ((ad) this).field_v[var11]) {
                                          var14 = ((ad) this).field_v[var11][var13];
                                          break L27;
                                        } else {
                                          var14 = var13;
                                          break L27;
                                        }
                                      }
                                      ((ad) this).field_r[var11][var14] = var17.i(qm.b(param1, 7553));
                                      var13++;
                                      continue L26;
                                    }
                                  }
                                } else {
                                  ((ad) this).field_r[var11][var13] = -1;
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
                      ((ad) this).field_y[((ad) this).field_f[var10]] = var17.i(7553);
                      var10++;
                      continue L15;
                    }
                  }
                } else {
                  ((ad) this).field_c[((ad) this).field_f[var10]] = var17.i(7553);
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
    }

    ad(byte[] param0, int param1, byte[] param2) {
        int var4 = 0;
        ((ad) this).field_s = tj.a(param0.length, 0, param0);
        if (((ad) this).field_s != param1) {
            throw new RuntimeException();
        }
        if (param2 != null) {
            if (param2.length != 64) {
                throw new RuntimeException();
            }
            ((ad) this).field_h = um.a(0, param0, 0, param0.length);
            for (var4 = 0; (var4 ^ -1) > -65; var4++) {
                if (param2[var4] != ((ad) this).field_h[var4]) {
                    throw new RuntimeException();
                }
            }
        }
        this.a(param0, 0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Please enter a year between <%0> and <%1>";
        field_d = new ck(18, 18);
        field_j = new ck[8][];
        field_A = "<%0> wants to join";
        field_t = "Your email address is used to identify this account";
        field_u = 0;
        field_z = "Achievements This Session";
    }
}
