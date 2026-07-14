/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wd {
    int[][] field_a;
    int[] field_m;
    int[] field_r;
    ie[] field_t;
    private byte[] field_c;
    int[] field_p;
    private int[] field_q;
    int field_e;
    static boolean field_g;
    int[] field_f;
    static pj field_h;
    int field_d;
    private int field_k;
    byte[][] field_n;
    int[] field_j;
    static ud field_i;
    int field_l;
    private int[][] field_o;
    ie field_b;
    static String field_s;

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
        gk var17 = null;
        byte[] var21 = null;
        int stackIn_10_0 = 0;
        int stackIn_16_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        L0: {
          var16 = MonkeyPuzzle2.field_F ? 1 : 0;
          var17 = new gk(rc.a(param1, 115));
          var4 = var17.a((byte) 114);
          if (-6 < (var4 ^ -1)) {
            break L0;
          } else {
            if (var4 > 7) {
              break L0;
            } else {
              L1: {
                if (var4 >= 6) {
                  ((wd) this).field_l = var17.e(param0 ^ 16076);
                  break L1;
                } else {
                  ((wd) this).field_l = 0;
                  break L1;
                }
              }
              L2: {
                var5 = var17.a((byte) 114);
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
                if (7 > var4) {
                  ((wd) this).field_k = var17.j(17277);
                  break L3;
                } else {
                  ((wd) this).field_k = var17.m(param0 + -41191);
                  break L3;
                }
              }
              L4: {
                if (-1 == (var5 & 2 ^ -1)) {
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
                if (param0 == 16050) {
                  break L5;
                } else {
                  ((wd) this).field_j = null;
                  break L5;
                }
              }
              L6: {
                var8 = 0;
                ((wd) this).field_f = new int[((wd) this).field_k];
                var9 = -1;
                if (7 <= var4) {
                  var10 = 0;
                  L7: while (true) {
                    if (var10 >= ((wd) this).field_k) {
                      break L6;
                    } else {
                      var8 = var8 + var17.m(gi.a(param0, -23687));
                      ((wd) this).field_f[var10] = var8 + var17.m(gi.a(param0, -23687));
                      if (((wd) this).field_f[var10] > var9) {
                        var9 = ((wd) this).field_f[var10];
                        var10++;
                        continue L7;
                      } else {
                        var10++;
                        continue L7;
                      }
                    }
                  }
                } else {
                  var10 = 0;
                  L8: while (true) {
                    if (var10 >= ((wd) this).field_k) {
                      break L6;
                    } else {
                      var8 = var8 + var17.j(gi.a(param0, 32207));
                      ((wd) this).field_f[var10] = var8 + var17.j(gi.a(param0, 32207));
                      if (((wd) this).field_f[var10] > var9) {
                        var9 = ((wd) this).field_f[var10];
                        var10++;
                        continue L8;
                      } else {
                        var10++;
                        continue L8;
                      }
                    }
                  }
                }
              }
              L9: {
                ((wd) this).field_e = 1 + var9;
                if (var7 == 0) {
                  break L9;
                } else {
                  ((wd) this).field_n = new byte[((wd) this).field_e][];
                  break L9;
                }
              }
              L10: {
                ((wd) this).field_j = new int[((wd) this).field_e];
                ((wd) this).field_r = new int[((wd) this).field_e];
                ((wd) this).field_m = new int[((wd) this).field_e];
                ((wd) this).field_p = new int[((wd) this).field_e];
                ((wd) this).field_a = new int[((wd) this).field_e][];
                if (var6 != 0) {
                  ((wd) this).field_q = new int[((wd) this).field_e];
                  var10 = 0;
                  L11: while (true) {
                    if (var10 >= ((wd) this).field_e) {
                      var10 = 0;
                      L12: while (true) {
                        if (var10 >= ((wd) this).field_k) {
                          ((wd) this).field_b = new ie(((wd) this).field_q);
                          break L10;
                        } else {
                          ((wd) this).field_q[((wd) this).field_f[var10]] = var17.e(127);
                          var10++;
                          continue L12;
                        }
                      }
                    } else {
                      ((wd) this).field_q[var10] = -1;
                      var10++;
                      continue L11;
                    }
                  }
                } else {
                  break L10;
                }
              }
              var10 = 0;
              L13: while (true) {
                if (var10 >= ((wd) this).field_k) {
                  L14: {
                    if (var7 == 0) {
                      break L14;
                    } else {
                      var10 = 0;
                      L15: while (true) {
                        if (((wd) this).field_k <= var10) {
                          break L14;
                        } else {
                          var21 = new byte[64];
                          var17.a(var21, 64, -91, 0);
                          ((wd) this).field_n[((wd) this).field_f[var10]] = var21;
                          var10++;
                          continue L15;
                        }
                      }
                    }
                  }
                  var10 = 0;
                  L16: while (true) {
                    if (var10 >= ((wd) this).field_k) {
                      L17: {
                        if (7 <= var4) {
                          var10 = 0;
                          L18: while (true) {
                            if (var10 >= ((wd) this).field_k) {
                              var10 = 0;
                              L19: while (true) {
                                if (var10 >= ((wd) this).field_k) {
                                  break L17;
                                } else {
                                  var11 = ((wd) this).field_f[var10];
                                  var12 = ((wd) this).field_m[var11];
                                  var8 = 0;
                                  var13 = -1;
                                  ((wd) this).field_a[var11] = new int[var12];
                                  var14 = 0;
                                  L20: while (true) {
                                    if (var12 <= var14) {
                                      ((wd) this).field_r[var11] = var13 + 1;
                                      if (var13 - -1 == var12) {
                                        ((wd) this).field_a[var11] = null;
                                        var10++;
                                        continue L19;
                                      } else {
                                        var10++;
                                        continue L19;
                                      }
                                    } else {
                                      var8 = var8 + var17.m(-25141);
                                      ((wd) this).field_a[var11][var14] = var8 + var17.m(-25141);
                                      var15 = var8 + var17.m(-25141);
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
                              ((wd) this).field_m[((wd) this).field_f[var10]] = var17.m(-25141);
                              var10++;
                              continue L18;
                            }
                          }
                        } else {
                          var10 = 0;
                          L21: while (true) {
                            if (((wd) this).field_k <= var10) {
                              var10 = 0;
                              L22: while (true) {
                                if (((wd) this).field_k <= var10) {
                                  break L17;
                                } else {
                                  var11 = ((wd) this).field_f[var10];
                                  var8 = 0;
                                  var12 = ((wd) this).field_m[var11];
                                  ((wd) this).field_a[var11] = new int[var12];
                                  var13 = -1;
                                  var14 = 0;
                                  L23: while (true) {
                                    if (var12 <= var14) {
                                      ((wd) this).field_r[var11] = 1 + var13;
                                      if (var13 - -1 == var12) {
                                        ((wd) this).field_a[var11] = null;
                                        var10++;
                                        continue L22;
                                      } else {
                                        var10++;
                                        continue L22;
                                      }
                                    } else {
                                      var8 = var8 + var17.j(17277);
                                      ((wd) this).field_a[var11][var14] = var8 + var17.j(17277);
                                      var15 = var8 + var17.j(17277);
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
                              ((wd) this).field_m[((wd) this).field_f[var10]] = var17.j(param0 + 1227);
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
                          ((wd) this).field_o = new int[1 + var9][];
                          ((wd) this).field_t = new ie[var9 + 1];
                          var10 = 0;
                          L25: while (true) {
                            if (var10 >= ((wd) this).field_k) {
                              break L24;
                            } else {
                              var11 = ((wd) this).field_f[var10];
                              var12 = ((wd) this).field_m[var11];
                              ((wd) this).field_o[var11] = new int[((wd) this).field_r[var11]];
                              var13 = 0;
                              L26: while (true) {
                                if (((wd) this).field_r[var11] <= var13) {
                                  var13 = 0;
                                  L27: while (true) {
                                    if (var13 >= var12) {
                                      ((wd) this).field_t[var11] = new ie(((wd) this).field_o[var11]);
                                      var10++;
                                      continue L25;
                                    } else {
                                      L28: {
                                        if (null != ((wd) this).field_a[var11]) {
                                          var14 = ((wd) this).field_a[var11][var13];
                                          break L28;
                                        } else {
                                          var14 = var13;
                                          break L28;
                                        }
                                      }
                                      ((wd) this).field_o[var11][var14] = var17.e(-99);
                                      var13++;
                                      continue L27;
                                    }
                                  }
                                } else {
                                  ((wd) this).field_o[var11][var13] = -1;
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
                      ((wd) this).field_p[((wd) this).field_f[var10]] = var17.e(-31);
                      var10++;
                      continue L16;
                    }
                  }
                } else {
                  ((wd) this).field_j[((wd) this).field_f[var10]] = var17.e(-36);
                  var10++;
                  continue L13;
                }
              }
            }
          }
        }
        throw new RuntimeException();
    }

    public static void a(int param0) {
        if (param0 != 0) {
            return;
        }
        field_h = null;
        field_i = null;
        field_s = null;
    }

    final static void a(int param0, boolean param1) {
        int var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        mk var4 = (mk) (Object) eb.field_C.a((byte) -117);
        while (var4 != null) {
            fc.a(var4, (byte) 108, param0);
            var4 = (mk) (Object) eb.field_C.d((byte) 63);
        }
        if (!param1) {
            field_i = null;
        }
        ug var2 = t.field_v.a((byte) -117);
        while (var2 != null) {
            lf.a(25197, param0);
            var2 = t.field_v.d((byte) 63);
        }
    }

    wd(byte[] param0, int param1, byte[] param2) {
        int var4 = 0;
        ((wd) this).field_d = w.a(param0.length, param0, -18694);
        if (param1 != ((wd) this).field_d) {
            throw new RuntimeException();
        }
        if (param2 != null) {
            if (-65 != param2.length) {
                throw new RuntimeException();
            }
            ((wd) this).field_c = ie.a(-106, param0, param0.length, 0);
            for (var4 = 0; -65 > var4; var4++) {
                if (param2[var4] != ((wd) this).field_c[var4]) {
                    throw new RuntimeException();
                }
            }
        }
        this.a(16050, param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = false;
        field_h = new pj();
        field_s = "Create your own free Jagex account";
    }
}
