/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sj {
    int[] field_i;
    static eh field_l;
    int[] field_n;
    int[] field_m;
    int[][] field_r;
    static mg field_j;
    int[] field_c;
    private int[] field_t;
    private byte[] field_s;
    int field_q;
    static String field_e;
    byte[][] field_p;
    int[] field_f;
    private int[][] field_g;
    md field_h;
    md[] field_u;
    int field_a;
    static String field_k;
    static String field_d;
    static float field_o;
    private int field_b;
    int field_v;

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
        int var17 = 0;
        jc var18 = null;
        byte[] var22 = null;
        int stackIn_10_0 = 0;
        int stackIn_16_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        L0: {
          var17 = Virogrid.field_F ? 1 : 0;
          var18 = new jc(mc.a(param0, 118));
          var4 = var18.g(11132);
          if (-6 < (var4 ^ -1)) {
            break L0;
          } else {
            if (var4 > 7) {
              break L0;
            } else {
              L1: {
                if ((var4 ^ -1) > -7) {
                  ((sj) this).field_a = 0;
                  break L1;
                } else {
                  ((sj) this).field_a = var18.d((byte) 109);
                  break L1;
                }
              }
              L2: {
                var5 = var18.g(11132);
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
                if (7 <= var4) {
                  ((sj) this).field_b = var18.d(true);
                  break L3;
                } else {
                  ((sj) this).field_b = var18.c((byte) 106);
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
                var10 = -92 % ((-9 - param1) / 56);
                var9 = -1;
                ((sj) this).field_c = new int[((sj) this).field_b];
                if ((var4 ^ -1) > -8) {
                  var11 = 0;
                  L6: while (true) {
                    if (((sj) this).field_b <= var11) {
                      break L5;
                    } else {
                      var8 = var8 + var18.c((byte) 66);
                      ((sj) this).field_c[var11] = var8 + var18.c((byte) 66);
                      if (((sj) this).field_c[var11] > var9) {
                        var9 = ((sj) this).field_c[var11];
                        var11++;
                        continue L6;
                      } else {
                        var11++;
                        continue L6;
                      }
                    }
                  }
                } else {
                  var11 = 0;
                  L7: while (true) {
                    if (var11 >= ((sj) this).field_b) {
                      break L5;
                    } else {
                      var8 = var8 + var18.d(true);
                      ((sj) this).field_c[var11] = var8 + var18.d(true);
                      if (((sj) this).field_c[var11] > var9) {
                        var9 = ((sj) this).field_c[var11];
                        var11++;
                        continue L7;
                      } else {
                        var11++;
                        continue L7;
                      }
                    }
                  }
                }
              }
              L8: {
                ((sj) this).field_v = 1 + var9;
                ((sj) this).field_r = new int[((sj) this).field_v][];
                ((sj) this).field_i = new int[((sj) this).field_v];
                if (var7 == 0) {
                  break L8;
                } else {
                  ((sj) this).field_p = new byte[((sj) this).field_v][];
                  break L8;
                }
              }
              L9: {
                ((sj) this).field_m = new int[((sj) this).field_v];
                ((sj) this).field_n = new int[((sj) this).field_v];
                ((sj) this).field_f = new int[((sj) this).field_v];
                if (var6 == 0) {
                  break L9;
                } else {
                  ((sj) this).field_t = new int[((sj) this).field_v];
                  var11 = 0;
                  L10: while (true) {
                    if (((sj) this).field_v <= var11) {
                      var11 = 0;
                      L11: while (true) {
                        if (var11 >= ((sj) this).field_b) {
                          ((sj) this).field_h = new md(((sj) this).field_t);
                          break L9;
                        } else {
                          ((sj) this).field_t[((sj) this).field_c[var11]] = var18.d((byte) 119);
                          var11++;
                          continue L11;
                        }
                      }
                    } else {
                      ((sj) this).field_t[var11] = -1;
                      var11++;
                      continue L10;
                    }
                  }
                }
              }
              var11 = 0;
              L12: while (true) {
                if (((sj) this).field_b <= var11) {
                  L13: {
                    if (var7 == 0) {
                      break L13;
                    } else {
                      var11 = 0;
                      L14: while (true) {
                        if (var11 >= ((sj) this).field_b) {
                          break L13;
                        } else {
                          var22 = new byte[64];
                          var18.a(0, 64, true, var22);
                          ((sj) this).field_p[((sj) this).field_c[var11]] = var22;
                          var11++;
                          continue L14;
                        }
                      }
                    }
                  }
                  var11 = 0;
                  L15: while (true) {
                    if (var11 >= ((sj) this).field_b) {
                      L16: {
                        if ((var4 ^ -1) <= -8) {
                          var11 = 0;
                          L17: while (true) {
                            if (((sj) this).field_b <= var11) {
                              var11 = 0;
                              L18: while (true) {
                                if (var11 >= ((sj) this).field_b) {
                                  break L16;
                                } else {
                                  var12 = ((sj) this).field_c[var11];
                                  var13 = ((sj) this).field_n[var12];
                                  var8 = 0;
                                  var14 = -1;
                                  ((sj) this).field_r[var12] = new int[var13];
                                  var15 = 0;
                                  L19: while (true) {
                                    if (var13 <= var15) {
                                      ((sj) this).field_i[var12] = 1 + var14;
                                      if (1 + var14 == var13) {
                                        ((sj) this).field_r[var12] = null;
                                        var11++;
                                        continue L18;
                                      } else {
                                        var11++;
                                        continue L18;
                                      }
                                    } else {
                                      var8 = var8 + var18.d(true);
                                      ((sj) this).field_r[var12][var15] = var8 + var18.d(true);
                                      var16 = var8 + var18.d(true);
                                      if (var14 < var16) {
                                        var14 = var16;
                                        var15++;
                                        continue L19;
                                      } else {
                                        var15++;
                                        continue L19;
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              ((sj) this).field_n[((sj) this).field_c[var11]] = var18.d(true);
                              var11++;
                              continue L17;
                            }
                          }
                        } else {
                          var11 = 0;
                          L20: while (true) {
                            if (var11 >= ((sj) this).field_b) {
                              var11 = 0;
                              L21: while (true) {
                                if (var11 >= ((sj) this).field_b) {
                                  break L16;
                                } else {
                                  var12 = ((sj) this).field_c[var11];
                                  var13 = ((sj) this).field_n[var12];
                                  var8 = 0;
                                  ((sj) this).field_r[var12] = new int[var13];
                                  var14 = -1;
                                  var15 = 0;
                                  L22: while (true) {
                                    if (var13 <= var15) {
                                      ((sj) this).field_i[var12] = 1 + var14;
                                      if (1 + var14 == var13) {
                                        ((sj) this).field_r[var12] = null;
                                        var11++;
                                        continue L21;
                                      } else {
                                        var11++;
                                        continue L21;
                                      }
                                    } else {
                                      var8 = var8 + var18.c((byte) -84);
                                      ((sj) this).field_r[var12][var15] = var8 + var18.c((byte) -84);
                                      var16 = var8 + var18.c((byte) -84);
                                      if (var16 > var14) {
                                        var14 = var16;
                                        var15++;
                                        continue L22;
                                      } else {
                                        var15++;
                                        continue L22;
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              ((sj) this).field_n[((sj) this).field_c[var11]] = var18.c((byte) 42);
                              var11++;
                              continue L20;
                            }
                          }
                        }
                      }
                      L23: {
                        if (var6 != 0) {
                          ((sj) this).field_g = new int[1 + var9][];
                          ((sj) this).field_u = new md[var9 - -1];
                          var11 = 0;
                          L24: while (true) {
                            if (var11 >= ((sj) this).field_b) {
                              break L23;
                            } else {
                              var12 = ((sj) this).field_c[var11];
                              var13 = ((sj) this).field_n[var12];
                              ((sj) this).field_g[var12] = new int[((sj) this).field_i[var12]];
                              var14 = 0;
                              L25: while (true) {
                                if (var14 >= ((sj) this).field_i[var12]) {
                                  var14 = 0;
                                  L26: while (true) {
                                    if (var14 >= var13) {
                                      ((sj) this).field_u[var12] = new md(((sj) this).field_g[var12]);
                                      var11++;
                                      continue L24;
                                    } else {
                                      L27: {
                                        if (((sj) this).field_r[var12] == null) {
                                          var15 = var14;
                                          break L27;
                                        } else {
                                          var15 = ((sj) this).field_r[var12][var14];
                                          break L27;
                                        }
                                      }
                                      ((sj) this).field_g[var12][var15] = var18.d((byte) 119);
                                      var14++;
                                      continue L26;
                                    }
                                  }
                                } else {
                                  ((sj) this).field_g[var12][var14] = -1;
                                  var14++;
                                  continue L25;
                                }
                              }
                            }
                          }
                        } else {
                          break L23;
                        }
                      }
                      return;
                    } else {
                      ((sj) this).field_f[((sj) this).field_c[var11]] = var18.d((byte) 104);
                      var11++;
                      continue L15;
                    }
                  }
                } else {
                  ((sj) this).field_m[((sj) this).field_c[var11]] = var18.d((byte) 95);
                  var11++;
                  continue L12;
                }
              }
            }
          }
        }
        throw new RuntimeException();
    }

    final static void a(java.applet.Applet param0, int param1) {
        af.field_i = true;
        String var2 = "tuhstatbut";
        if (param1 != 20298) {
            Object var6 = null;
            sj.a((il) null, true, (int[]) null, (int[]) null);
        }
        String var3 = "rvnadlm";
        long var4 = -1L;
        sb.a(var2, var3, param0, var4, (byte) -2);
    }

    final static void a(il param0, boolean param1, int[] param2, int[] param3) {
        param0.a(param2, param3);
        if (param1) {
            field_l = null;
        }
    }

    public static void a(byte param0) {
        if (param0 <= 118) {
            return;
        }
        field_j = null;
        field_d = null;
        field_k = null;
        field_l = null;
        field_e = null;
    }

    sj(byte[] param0, int param1, byte[] param2) {
        int var4 = 0;
        ((sj) this).field_q = na.a(false, param0.length, param0);
        if (((sj) this).field_q != param1) {
            throw new RuntimeException();
        }
        if (param2 != null) {
            if (64 != param2.length) {
                throw new RuntimeException();
            }
            ((sj) this).field_s = ug.a(param0, param0.length, 0, false);
            for (var4 = 0; var4 < 64; var4++) {
                if (param2[var4] != ((sj) this).field_s[var4]) {
                    throw new RuntimeException();
                }
            }
        }
        this.a(param0, 117);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
        field_d = "Leave game";
        field_e = "Show chat (<%0> unread messages)";
    }
}
