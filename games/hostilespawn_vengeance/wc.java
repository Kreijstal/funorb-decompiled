/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wc {
    int[] field_o;
    int[] field_v;
    static String field_s;
    int[] field_t;
    static String field_k;
    int[][] field_b;
    static int field_m;
    int[] field_i;
    int field_n;
    private int[][] field_q;
    byte[][] field_w;
    int[] field_p;
    int field_c;
    static bd field_e;
    int field_d;
    static boolean field_g;
    rg field_l;
    static bd[][] field_f;
    rg[] field_h;
    private byte[] field_a;
    private int field_j;
    private int[] field_r;
    static boolean field_u;

    final static void a(int param0, int param1, int param2) {
        wk.field_c = param0;
        if (param2 != -1) {
            wc.a(41);
        }
        qg.field_l = param1;
    }

    final static void a(java.applet.Applet param0, String param1, byte param2, boolean param3) {
        try {
            if (!(!fd.field_c.startsWith("win"))) {
                if (lm.a(26, param1)) {
                    return;
                }
            }
            if (param2 != -97) {
                return;
            }
            try {
                if (false) throw (java.net.MalformedURLException) null;
                param0.getAppletContext().showDocument(new java.net.URL(param1), "_blank");
            } catch (java.net.MalformedURLException malformedURLException) {
                ic.a((byte) -116, "MGR1: " + param1, (Throwable) null);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
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
        vi var17 = null;
        byte[] var21 = null;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        L0: {
          var16 = HostileSpawn.field_I ? 1 : 0;
          var17 = new vi(ml.a(param1, (byte) -76));
          var4 = var17.l(32270);
          if (5 > var4) {
            break L0;
          } else {
            if ((var4 ^ -1) >= -8) {
              L1: {
                if (6 <= var4) {
                  ((wc) this).field_n = var17.d(8195);
                  break L1;
                } else {
                  ((wc) this).field_n = 0;
                  break L1;
                }
              }
              L2: {
                var5 = var17.l(32270);
                if (-1 == (1 & var5 ^ -1)) {
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
                  ((wc) this).field_j = var17.a(true);
                  break L4;
                } else {
                  ((wc) this).field_j = var17.e(8);
                  break L4;
                }
              }
              L5: {
                var8 = 0;
                var9 = -1;
                if (param0 == 0) {
                  break L5;
                } else {
                  wc.a(-105);
                  break L5;
                }
              }
              L6: {
                ((wc) this).field_t = new int[((wc) this).field_j];
                if ((var4 ^ -1) > -8) {
                  var10 = 0;
                  L7: while (true) {
                    if (((wc) this).field_j <= var10) {
                      break L6;
                    } else {
                      var8 = var8 + var17.e(8);
                      ((wc) this).field_t[var10] = var8 + var17.e(8);
                      if (var9 < ((wc) this).field_t[var10]) {
                        var9 = ((wc) this).field_t[var10];
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
                    if (var10 >= ((wc) this).field_j) {
                      break L6;
                    } else {
                      var8 = var8 + var17.a(true);
                      ((wc) this).field_t[var10] = var8 + var17.a(true);
                      if (((wc) this).field_t[var10] > var9) {
                        var9 = ((wc) this).field_t[var10];
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
                ((wc) this).field_c = 1 + var9;
                ((wc) this).field_v = new int[((wc) this).field_c];
                ((wc) this).field_o = new int[((wc) this).field_c];
                ((wc) this).field_p = new int[((wc) this).field_c];
                ((wc) this).field_b = new int[((wc) this).field_c][];
                ((wc) this).field_i = new int[((wc) this).field_c];
                if (var7 == 0) {
                  break L9;
                } else {
                  ((wc) this).field_w = new byte[((wc) this).field_c][];
                  break L9;
                }
              }
              L10: {
                if (var6 != 0) {
                  ((wc) this).field_r = new int[((wc) this).field_c];
                  var10 = 0;
                  L11: while (true) {
                    if (var10 >= ((wc) this).field_c) {
                      var10 = 0;
                      L12: while (true) {
                        if (((wc) this).field_j <= var10) {
                          ((wc) this).field_l = new rg(((wc) this).field_r);
                          break L10;
                        } else {
                          ((wc) this).field_r[((wc) this).field_t[var10]] = var17.d(8195);
                          var10++;
                          continue L12;
                        }
                      }
                    } else {
                      ((wc) this).field_r[var10] = -1;
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
                if (((wc) this).field_j <= var10) {
                  L14: {
                    if (var7 != 0) {
                      var10 = 0;
                      L15: while (true) {
                        if (var10 >= ((wc) this).field_j) {
                          var10 = 0;
                          L16: while (true) {
                            if (((wc) this).field_j <= var10) {
                              break L14;
                            } else {
                              ((wc) this).field_i[((wc) this).field_t[var10]] = var17.d(8195);
                              var10++;
                              continue L16;
                            }
                          }
                        } else {
                          var21 = new byte[64];
                          var17.a(64, 0, var21, -18181);
                          ((wc) this).field_w[((wc) this).field_t[var10]] = var21;
                          var10++;
                          continue L15;
                        }
                      }
                    } else {
                      var10 = 0;
                      L17: while (true) {
                        if (((wc) this).field_j <= var10) {
                          break L14;
                        } else {
                          ((wc) this).field_i[((wc) this).field_t[var10]] = var17.d(8195);
                          var10++;
                          continue L17;
                        }
                      }
                    }
                  }
                  L18: {
                    if (var4 >= 7) {
                      var10 = 0;
                      L19: while (true) {
                        if (var10 >= ((wc) this).field_j) {
                          var10 = 0;
                          L20: while (true) {
                            if (var10 >= ((wc) this).field_j) {
                              break L18;
                            } else {
                              var11 = ((wc) this).field_t[var10];
                              var12 = ((wc) this).field_o[var11];
                              var8 = 0;
                              var13 = -1;
                              ((wc) this).field_b[var11] = new int[var12];
                              var14 = 0;
                              L21: while (true) {
                                if (var14 >= var12) {
                                  ((wc) this).field_p[var11] = var13 + 1;
                                  if (var12 == 1 + var13) {
                                    ((wc) this).field_b[var11] = null;
                                    var10++;
                                    continue L20;
                                  } else {
                                    var10++;
                                    continue L20;
                                  }
                                } else {
                                  var8 = var8 + var17.a(true);
                                  ((wc) this).field_b[var11][var14] = var8 + var17.a(true);
                                  var15 = var8 + var17.a(true);
                                  if (var15 > var13) {
                                    var13 = var15;
                                    var14++;
                                    continue L21;
                                  } else {
                                    var14++;
                                    continue L21;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          ((wc) this).field_o[((wc) this).field_t[var10]] = var17.a(true);
                          var10++;
                          continue L19;
                        }
                      }
                    } else {
                      var10 = 0;
                      L22: while (true) {
                        if (((wc) this).field_j <= var10) {
                          var10 = 0;
                          L23: while (true) {
                            if (var10 >= ((wc) this).field_j) {
                              break L18;
                            } else {
                              var11 = ((wc) this).field_t[var10];
                              var8 = 0;
                              var12 = ((wc) this).field_o[var11];
                              var13 = -1;
                              ((wc) this).field_b[var11] = new int[var12];
                              var14 = 0;
                              L24: while (true) {
                                if (var12 <= var14) {
                                  ((wc) this).field_p[var11] = var13 - -1;
                                  if (1 + var13 == var12) {
                                    ((wc) this).field_b[var11] = null;
                                    var10++;
                                    continue L23;
                                  } else {
                                    var10++;
                                    continue L23;
                                  }
                                } else {
                                  var8 = var8 + var17.e(8);
                                  ((wc) this).field_b[var11][var14] = var8 + var17.e(8);
                                  var15 = var8 + var17.e(8);
                                  if (var13 < var15) {
                                    var13 = var15;
                                    var14++;
                                    continue L24;
                                  } else {
                                    var14++;
                                    continue L24;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          ((wc) this).field_o[((wc) this).field_t[var10]] = var17.e(bm.a(param0, 8));
                          var10++;
                          continue L22;
                        }
                      }
                    }
                  }
                  L25: {
                    if (var6 == 0) {
                      break L25;
                    } else {
                      ((wc) this).field_q = new int[1 + var9][];
                      ((wc) this).field_h = new rg[var9 + 1];
                      var10 = 0;
                      L26: while (true) {
                        if (var10 >= ((wc) this).field_j) {
                          break L25;
                        } else {
                          var11 = ((wc) this).field_t[var10];
                          var12 = ((wc) this).field_o[var11];
                          ((wc) this).field_q[var11] = new int[((wc) this).field_p[var11]];
                          var13 = 0;
                          L27: while (true) {
                            if (((wc) this).field_p[var11] <= var13) {
                              var13 = 0;
                              L28: while (true) {
                                if (var12 <= var13) {
                                  ((wc) this).field_h[var11] = new rg(((wc) this).field_q[var11]);
                                  var10++;
                                  continue L26;
                                } else {
                                  L29: {
                                    if (((wc) this).field_b[var11] != null) {
                                      var14 = ((wc) this).field_b[var11][var13];
                                      break L29;
                                    } else {
                                      var14 = var13;
                                      break L29;
                                    }
                                  }
                                  ((wc) this).field_q[var11][var14] = var17.d(8195);
                                  var13++;
                                  continue L28;
                                }
                              }
                            } else {
                              ((wc) this).field_q[var11][var13] = -1;
                              var13++;
                              continue L27;
                            }
                          }
                        }
                      }
                    }
                  }
                  return;
                } else {
                  ((wc) this).field_v[((wc) this).field_t[var10]] = var17.d(8195);
                  var10++;
                  continue L13;
                }
              }
            } else {
              break L0;
            }
          }
        }
        throw new RuntimeException();
    }

    final static fn a(String param0, gb param1, int param2, gb param3, String param4) {
        if (param2 <= 23) {
            wc.a(-98);
        }
        int var5 = param3.a((byte) -2, param0);
        int var6 = param3.a(var5, param4, -1);
        return qj.a(param1, param3, -1, var6, var5);
    }

    wc(byte[] param0, int param1, byte[] param2) {
        int var4 = 0;
        ((wc) this).field_d = pi.a(param0.length, 31465, param0);
        if (((wc) this).field_d != param1) {
            throw new RuntimeException();
        }
        if (param2 != null) {
            if (-65 != (param2.length ^ -1)) {
                throw new RuntimeException();
            }
            ((wc) this).field_a = ld.a(param0, 0, 109, param0.length);
            for (var4 = 0; (var4 ^ -1) > -65; var4++) {
                if (((wc) this).field_a[var4] != param2[var4]) {
                    throw new RuntimeException();
                }
            }
        }
        this.a(0, param0);
    }

    public static void a(int param0) {
        field_f = null;
        field_s = null;
        if (param0 != -17514) {
            return;
        }
        field_k = null;
        field_e = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "To Customer Support";
        field_s = "Music: ";
    }
}
