/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bm {
    static String field_p;
    private int field_h;
    int field_g;
    int field_m;
    int[] field_q;
    int field_b;
    int[] field_k;
    private byte[] field_c;
    static int field_j;
    byte[][] field_r;
    private int[][] field_e;
    int[] field_i;
    int[][] field_o;
    am[] field_f;
    int[] field_t;
    private int[] field_d;
    am field_n;
    static int field_s;
    static int field_u;
    static nf[] field_l;
    int[] field_a;

    final static int[] a(int param0, byte param1, int param2) {
        int var3 = bh.a((byte) 69, param0);
        int var4 = fi.a(param0, 2048);
        int var5 = bh.a((byte) 101, param2);
        int var6 = fi.a(param2, 2048);
        int var7 = (int)((long)var3 * (long)var5 >> -758261296);
        int var8 = (int)((long)var6 * (long)var3 >> 1699857424);
        int var9 = (int)((long)var4 * (long)var5 >> -962179184);
        int var10 = (int)((long)var6 * (long)var4 >> 582575632);
        if (param1 > -65) {
            return null;
        }
        return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
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
        Object var17 = null;
        qc var18 = null;
        byte[] var22 = null;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        L0: {
          var16 = Geoblox.field_C;
          var18 = new qc(v.a(param1, -1));
          var4 = var18.c((byte) 34);
          if (5 > var4) {
            break L0;
          } else {
            if (var4 >= -8) {
              L1: {
                if (-7 > var4) {
                  ((bm) this).field_g = 0;
                  break L1;
                } else {
                  ((bm) this).field_g = var18.a((byte) -121);
                  break L1;
                }
              }
              L2: {
                var5 = var18.c((byte) 34);
                if (0 == (1 & var5)) {
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
                if ((2 & var5) == -1) {
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
                if (-8 <= var4) {
                  ((bm) this).field_h = var18.d((byte) -27);
                  break L4;
                } else {
                  ((bm) this).field_h = var18.b(true);
                  break L4;
                }
              }
              L5: {
                var8 = 0;
                ((bm) this).field_i = new int[((bm) this).field_h];
                var9 = -1;
                if (7 <= var4) {
                  var10 = 0;
                  L6: while (true) {
                    if (var10 >= ((bm) this).field_h) {
                      break L5;
                    } else {
                      var8 = var8 + var18.d((byte) -27);
                      ((bm) this).field_i[var10] = var8 + var18.d((byte) -27);
                      if (((bm) this).field_i[var10] > var9) {
                        var9 = ((bm) this).field_i[var10];
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
                    if (((bm) this).field_h <= var10) {
                      break L5;
                    } else {
                      var8 = var8 + var18.b(true);
                      ((bm) this).field_i[var10] = var8 + var18.b(true);
                      if (var9 < ((bm) this).field_i[var10]) {
                        var9 = ((bm) this).field_i[var10];
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
                ((bm) this).field_b = 1 + var9;
                if (var7 != 0) {
                  ((bm) this).field_r = new byte[((bm) this).field_b][];
                  break L8;
                } else {
                  break L8;
                }
              }
              L9: {
                ((bm) this).field_q = new int[((bm) this).field_b];
                ((bm) this).field_a = new int[((bm) this).field_b];
                ((bm) this).field_t = new int[((bm) this).field_b];
                ((bm) this).field_k = new int[((bm) this).field_b];
                ((bm) this).field_o = new int[((bm) this).field_b][];
                if (var6 == 0) {
                  break L9;
                } else {
                  ((bm) this).field_d = new int[((bm) this).field_b];
                  var10 = 0;
                  L10: while (true) {
                    if (((bm) this).field_b <= var10) {
                      var10 = 0;
                      L11: while (true) {
                        if (var10 >= ((bm) this).field_h) {
                          ((bm) this).field_n = new am(((bm) this).field_d);
                          break L9;
                        } else {
                          ((bm) this).field_d[((bm) this).field_i[var10]] = var18.a((byte) -76);
                          var10++;
                          continue L11;
                        }
                      }
                    } else {
                      ((bm) this).field_d[var10] = -1;
                      var10++;
                      continue L10;
                    }
                  }
                }
              }
              var10 = 0;
              L12: while (true) {
                if (var10 >= ((bm) this).field_h) {
                  L13: {
                    if (var7 == 0) {
                      break L13;
                    } else {
                      var10 = 0;
                      L14: while (true) {
                        if (((bm) this).field_h <= var10) {
                          break L13;
                        } else {
                          var22 = new byte[64];
                          var18.b(29915, 64, var22, 0);
                          ((bm) this).field_r[((bm) this).field_i[var10]] = var22;
                          var10++;
                          continue L14;
                        }
                      }
                    }
                  }
                  L15: {
                    var10 = 0;
                    if (param0 >= 109) {
                      break L15;
                    } else {
                      var17 = null;
                      this.a((byte) -96, (byte[]) null);
                      break L15;
                    }
                  }
                  L16: while (true) {
                    if (((bm) this).field_h <= var10) {
                      L17: {
                        if (var4 >= 7) {
                          var10 = 0;
                          L18: while (true) {
                            if (var10 >= ((bm) this).field_h) {
                              var10 = 0;
                              L19: while (true) {
                                if (((bm) this).field_h <= var10) {
                                  break L17;
                                } else {
                                  var11 = ((bm) this).field_i[var10];
                                  var8 = 0;
                                  var12 = ((bm) this).field_a[var11];
                                  var13 = -1;
                                  ((bm) this).field_o[var11] = new int[var12];
                                  var14 = 0;
                                  L20: while (true) {
                                    if (var12 <= var14) {
                                      ((bm) this).field_k[var11] = var13 + 1;
                                      if (var12 == 1 + var13) {
                                        ((bm) this).field_o[var11] = null;
                                        var10++;
                                        continue L19;
                                      } else {
                                        var10++;
                                        continue L19;
                                      }
                                    } else {
                                      var8 = var8 + var18.d((byte) -27);
                                      ((bm) this).field_o[var11][var14] = var8 + var18.d((byte) -27);
                                      var15 = var8 + var18.d((byte) -27);
                                      if (var13 < var15) {
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
                              ((bm) this).field_a[((bm) this).field_i[var10]] = var18.d((byte) -27);
                              var10++;
                              continue L18;
                            }
                          }
                        } else {
                          var10 = 0;
                          L21: while (true) {
                            if (((bm) this).field_h <= var10) {
                              var10 = 0;
                              L22: while (true) {
                                if (var10 >= ((bm) this).field_h) {
                                  break L17;
                                } else {
                                  var11 = ((bm) this).field_i[var10];
                                  var8 = 0;
                                  var12 = ((bm) this).field_a[var11];
                                  ((bm) this).field_o[var11] = new int[var12];
                                  var13 = -1;
                                  var14 = 0;
                                  L23: while (true) {
                                    if (var12 <= var14) {
                                      ((bm) this).field_k[var11] = var13 - -1;
                                      if (var12 == 1 + var13) {
                                        ((bm) this).field_o[var11] = null;
                                        var10++;
                                        continue L22;
                                      } else {
                                        var10++;
                                        continue L22;
                                      }
                                    } else {
                                      var8 = var8 + var18.b(true);
                                      ((bm) this).field_o[var11][var14] = var8 + var18.b(true);
                                      var15 = var8 + var18.b(true);
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
                              ((bm) this).field_a[((bm) this).field_i[var10]] = var18.b(true);
                              var10++;
                              continue L21;
                            }
                          }
                        }
                      }
                      L24: {
                        if (var6 != 0) {
                          ((bm) this).field_e = new int[var9 - -1][];
                          ((bm) this).field_f = new am[1 + var9];
                          var10 = 0;
                          L25: while (true) {
                            if (var10 >= ((bm) this).field_h) {
                              break L24;
                            } else {
                              var11 = ((bm) this).field_i[var10];
                              var12 = ((bm) this).field_a[var11];
                              ((bm) this).field_e[var11] = new int[((bm) this).field_k[var11]];
                              var13 = 0;
                              L26: while (true) {
                                if (((bm) this).field_k[var11] <= var13) {
                                  var13 = 0;
                                  L27: while (true) {
                                    if (var13 >= var12) {
                                      ((bm) this).field_f[var11] = new am(((bm) this).field_e[var11]);
                                      var10++;
                                      continue L25;
                                    } else {
                                      L28: {
                                        if (((bm) this).field_o[var11] != null) {
                                          var14 = ((bm) this).field_o[var11][var13];
                                          break L28;
                                        } else {
                                          var14 = var13;
                                          break L28;
                                        }
                                      }
                                      ((bm) this).field_e[var11][var14] = var18.a((byte) -78);
                                      var13++;
                                      continue L27;
                                    }
                                  }
                                } else {
                                  ((bm) this).field_e[var11][var13] = -1;
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
                      ((bm) this).field_t[((bm) this).field_i[var10]] = var18.a((byte) -110);
                      var10++;
                      continue L16;
                    }
                  }
                } else {
                  ((bm) this).field_q[((bm) this).field_i[var10]] = var18.a((byte) -95);
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

    final static void a(ai param0, int param1, int param2) {
        int var5 = 0;
        int var6 = Geoblox.field_C;
        pk var7 = fj.field_q;
        pk var8 = var7;
        var8.a(param1, (byte) -125);
        var8.field_f = var8.field_f + 1;
        int var4 = var8.field_f;
        var8.d((byte) 122, 1);
        var8.e(param0.field_q, 28695);
        var8.e(param0.field_f, 28695);
        var8.e(param0.field_k, 28695);
        var8.c((byte) 95, param0.field_m);
        var8.c((byte) 95, param0.field_g);
        var8.c((byte) 95, param0.field_j);
        if (param2 > -126) {
            field_j = 61;
        }
        var8.c((byte) 95, param0.field_i);
        var8.d((byte) 126, param0.field_o.length);
        for (var5 = 0; var5 < param0.field_o.length; var5++) {
            var7.c((byte) 95, param0.field_o[var5]);
        }
        int discarded$0 = var8.d(78, var4);
        var8.f(11700, -var4 + var8.field_f);
    }

    public static void a(int param0) {
        field_l = null;
        field_p = null;
        int var1 = -24 % ((param0 - -88) / 36);
    }

    bm(byte[] param0, int param1, byte[] param2) {
        int var4 = 0;
        ((bm) this).field_m = gg.a(param0, 107, param0.length);
        if (param1 != ((bm) this).field_m) {
            throw new RuntimeException();
        }
        if (param2 != null) {
            if ((param2.length ^ -1) != -65) {
                throw new RuntimeException();
            }
            ((bm) this).field_c = wh.a(param0.length, 0, param0, 8);
            for (var4 = 0; 64 > var4; var4++) {
                if (((bm) this).field_c[var4] != param2[var4]) {
                    throw new RuntimeException();
                }
            }
        }
        this.a((byte) 119, param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_j = 20;
    }
}
