/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ps {
    static int field_h;
    int[] field_j;
    private int[] field_n;
    static qo field_d;
    int[] field_k;
    int field_l;
    private byte[] field_c;
    int[] field_o;
    byte[][] field_i;
    static int[] field_e;
    int[][] field_q;
    nm field_b;
    private int[][] field_p;
    int[] field_g;
    nm[] field_r;
    int field_t;
    int field_m;
    static vd[][] field_f;
    private int field_s;
    int[] field_a;

    final static void a(String[] args, byte param1) {
        int var2 = 60 / ((param1 - 53) / 55);
        if (null != qk.field_e) {
            qk.field_e.field_B.a(args, true);
        }
        if (!(null == fd.field_f)) {
            fd.field_f.field_t.a(args, true);
        }
    }

    final static void a(boolean param0) {
        aq.field_b = null;
        if (!param0) {
            ps.b(111);
        }
        qn.field_d = null;
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
        rb var17 = null;
        byte[] var21 = null;
        int stackIn_12_0 = 0;
        int stackIn_18_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        L0: {
          var16 = AceOfSkies.field_G ? 1 : 0;
          var17 = new rb(pn.a(param0, 0));
          var4 = var17.g(-112);
          if (var4 < 5) {
            break L0;
          } else {
            if (-8 <= (var4 ^ -1)) {
              L1: {
                if (param1 > 65) {
                  break L1;
                } else {
                  ps.b(-65);
                  break L1;
                }
              }
              L2: {
                if (6 <= var4) {
                  ((ps) this).field_m = var17.a((byte) 113);
                  break L2;
                } else {
                  ((ps) this).field_m = 0;
                  break L2;
                }
              }
              L3: {
                var5 = var17.g(73);
                if ((var5 & 1) == 0) {
                  stackOut_11_0 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  break L3;
                } else {
                  stackOut_10_0 = 1;
                  stackIn_12_0 = stackOut_10_0;
                  break L3;
                }
              }
              L4: {
                var6 = stackIn_12_0;
                if ((var4 ^ -1) <= -8) {
                  ((ps) this).field_s = var17.c((byte) 127);
                  break L4;
                } else {
                  ((ps) this).field_s = var17.i((byte) 0);
                  break L4;
                }
              }
              L5: {
                if (-1 == (var5 & 2 ^ -1)) {
                  stackOut_17_0 = 0;
                  stackIn_18_0 = stackOut_17_0;
                  break L5;
                } else {
                  stackOut_16_0 = 1;
                  stackIn_18_0 = stackOut_16_0;
                  break L5;
                }
              }
              L6: {
                var7 = stackIn_18_0;
                var8 = 0;
                var9 = -1;
                ((ps) this).field_o = new int[((ps) this).field_s];
                if (7 <= var4) {
                  var10 = 0;
                  L7: while (true) {
                    if (((ps) this).field_s <= var10) {
                      break L6;
                    } else {
                      var8 = var8 + var17.c((byte) 127);
                      ((ps) this).field_o[var10] = var8 + var17.c((byte) 127);
                      if (((ps) this).field_o[var10] > var9) {
                        var9 = ((ps) this).field_o[var10];
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
                    if (((ps) this).field_s <= var10) {
                      break L6;
                    } else {
                      var8 = var8 + var17.i((byte) 0);
                      ((ps) this).field_o[var10] = var8 + var17.i((byte) 0);
                      if (((ps) this).field_o[var10] > var9) {
                        var9 = ((ps) this).field_o[var10];
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
                ((ps) this).field_l = 1 + var9;
                ((ps) this).field_g = new int[((ps) this).field_l];
                if (var7 == 0) {
                  break L9;
                } else {
                  ((ps) this).field_i = new byte[((ps) this).field_l][];
                  break L9;
                }
              }
              L10: {
                ((ps) this).field_q = new int[((ps) this).field_l][];
                ((ps) this).field_k = new int[((ps) this).field_l];
                ((ps) this).field_a = new int[((ps) this).field_l];
                ((ps) this).field_j = new int[((ps) this).field_l];
                if (var6 != 0) {
                  ((ps) this).field_n = new int[((ps) this).field_l];
                  var10 = 0;
                  L11: while (true) {
                    if (var10 >= ((ps) this).field_l) {
                      var10 = 0;
                      L12: while (true) {
                        if (var10 >= ((ps) this).field_s) {
                          ((ps) this).field_b = new nm(((ps) this).field_n);
                          break L10;
                        } else {
                          ((ps) this).field_n[((ps) this).field_o[var10]] = var17.a((byte) 124);
                          var10++;
                          continue L12;
                        }
                      }
                    } else {
                      ((ps) this).field_n[var10] = -1;
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
                if (((ps) this).field_s <= var10) {
                  L14: {
                    if (var7 == 0) {
                      break L14;
                    } else {
                      var10 = 0;
                      L15: while (true) {
                        if (var10 >= ((ps) this).field_s) {
                          break L14;
                        } else {
                          var21 = new byte[64];
                          var17.a(0, 7186, 64, var21);
                          ((ps) this).field_i[((ps) this).field_o[var10]] = var21;
                          var10++;
                          continue L15;
                        }
                      }
                    }
                  }
                  var10 = 0;
                  L16: while (true) {
                    if (((ps) this).field_s <= var10) {
                      L17: {
                        if (-8 < (var4 ^ -1)) {
                          var10 = 0;
                          L18: while (true) {
                            if (((ps) this).field_s <= var10) {
                              var10 = 0;
                              L19: while (true) {
                                if (((ps) this).field_s <= var10) {
                                  break L17;
                                } else {
                                  var11 = ((ps) this).field_o[var10];
                                  var12 = ((ps) this).field_k[var11];
                                  var8 = 0;
                                  ((ps) this).field_q[var11] = new int[var12];
                                  var13 = -1;
                                  var14 = 0;
                                  L20: while (true) {
                                    if (var14 >= var12) {
                                      ((ps) this).field_j[var11] = var13 + 1;
                                      if (var12 == var13 + 1) {
                                        ((ps) this).field_q[var11] = null;
                                        var10++;
                                        continue L19;
                                      } else {
                                        var10++;
                                        continue L19;
                                      }
                                    } else {
                                      var8 = var8 + var17.i((byte) 0);
                                      ((ps) this).field_q[var11][var14] = var8 + var17.i((byte) 0);
                                      var15 = var8 + var17.i((byte) 0);
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
                              ((ps) this).field_k[((ps) this).field_o[var10]] = var17.i((byte) 0);
                              var10++;
                              continue L18;
                            }
                          }
                        } else {
                          var10 = 0;
                          L21: while (true) {
                            if (var10 >= ((ps) this).field_s) {
                              var10 = 0;
                              L22: while (true) {
                                if (var10 >= ((ps) this).field_s) {
                                  break L17;
                                } else {
                                  var11 = ((ps) this).field_o[var10];
                                  var12 = ((ps) this).field_k[var11];
                                  var8 = 0;
                                  ((ps) this).field_q[var11] = new int[var12];
                                  var13 = -1;
                                  var14 = 0;
                                  L23: while (true) {
                                    if (var14 >= var12) {
                                      ((ps) this).field_j[var11] = var13 - -1;
                                      if (var12 == var13 - -1) {
                                        ((ps) this).field_q[var11] = null;
                                        var10++;
                                        continue L22;
                                      } else {
                                        var10++;
                                        continue L22;
                                      }
                                    } else {
                                      var8 = var8 + var17.c((byte) 124);
                                      ((ps) this).field_q[var11][var14] = var8 + var17.c((byte) 124);
                                      var15 = var8 + var17.c((byte) 124);
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
                              ((ps) this).field_k[((ps) this).field_o[var10]] = var17.c((byte) 126);
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
                          ((ps) this).field_p = new int[var9 - -1][];
                          ((ps) this).field_r = new nm[1 + var9];
                          var10 = 0;
                          L25: while (true) {
                            if (((ps) this).field_s <= var10) {
                              break L24;
                            } else {
                              var11 = ((ps) this).field_o[var10];
                              var12 = ((ps) this).field_k[var11];
                              ((ps) this).field_p[var11] = new int[((ps) this).field_j[var11]];
                              var13 = 0;
                              L26: while (true) {
                                if (var13 >= ((ps) this).field_j[var11]) {
                                  var13 = 0;
                                  L27: while (true) {
                                    if (var13 >= var12) {
                                      ((ps) this).field_r[var11] = new nm(((ps) this).field_p[var11]);
                                      var10++;
                                      continue L25;
                                    } else {
                                      L28: {
                                        if (null != ((ps) this).field_q[var11]) {
                                          var14 = ((ps) this).field_q[var11][var13];
                                          break L28;
                                        } else {
                                          var14 = var13;
                                          break L28;
                                        }
                                      }
                                      ((ps) this).field_p[var11][var14] = var17.a((byte) 110);
                                      var13++;
                                      continue L27;
                                    }
                                  }
                                } else {
                                  ((ps) this).field_p[var11][var13] = -1;
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
                      ((ps) this).field_a[((ps) this).field_o[var10]] = var17.a((byte) 113);
                      var10++;
                      continue L16;
                    }
                  }
                } else {
                  ((ps) this).field_g[((ps) this).field_o[var10]] = var17.a((byte) 125);
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

    final static void b(int param0) {
        oi.a(param0, 20665);
    }

    final static void a(int param0, boolean param1, java.awt.Canvas param2, int param3) {
        java.awt.Graphics var4 = param2.getGraphics();
        cl.field_fb.a(118, var4, param3, param0);
        if (param1) {
            return;
        }
        try {
            var4.dispose();
        } catch (Exception exception) {
            param2.repaint();
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_e = null;
        if (param0 != 0) {
            field_d = (qo) null;
        }
        field_f = (vd[][]) null;
    }

    ps(byte[] param0, int param1, byte[] param2) {
        int var4 = 0;
        ((ps) this).field_t = lj.a(-124, param0, param0.length);
        if (param1 != ((ps) this).field_t) {
            throw new RuntimeException();
        }
        if (param2 != null) {
            if ((param2.length ^ -1) != -65) {
                throw new RuntimeException();
            }
            ((ps) this).field_c = qm.a(0, param0.length, param0, 0);
            for (var4 = 0; -65 < (var4 ^ -1); var4++) {
                if (((ps) this).field_c[var4] != param2[var4]) {
                    throw new RuntimeException();
                }
            }
        }
        this.a(param0, 100);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new int[128];
        field_d = new qo();
    }
}
