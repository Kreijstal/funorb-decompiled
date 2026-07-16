/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class d extends km {
    static String[] field_Kb;
    static String field_Gb;
    private km field_Jb;
    static int[] field_Lb;
    int field_Hb;
    private km[] field_Fb;
    private km[] field_Ib;
    static long field_Eb;

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param3 != -22361) {
            Object var9 = null;
            d.a((byte) 53, (byte[]) null);
        }
        ((d) this).field_K = param2;
        ((d) this).field_tb = param5;
        ((d) this).field_F = param6;
        ((d) this).field_ub = param1;
        this.b(param0, param4, param3 ^ -20132);
    }

    final static km h(int param0) {
        if (param0 != 0) {
            return null;
        }
        return ve.field_q.field_Lb;
    }

    final void g(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = Virogrid.field_F ? 1 : 0;
        var2 = param0;
        L0: while (true) {
          if (((d) this).field_Fb.length <= var2) {
            return;
          } else {
            if (((d) this).field_Hb != var2) {
              if (((d) this).field_Fb[var2].field_nb != 0) {
                ((d) this).field_Fb[((d) this).field_Hb].field_xb = false;
                ((d) this).field_Ib[((d) this).field_Hb].field_tb = ((d) this).field_Ib[((d) this).field_Hb].field_tb + 10000;
                ((d) this).field_Hb = var2;
                ((d) this).field_Fb[var2].field_xb = true;
                ((d) this).field_Ib[var2].field_tb = ((d) this).field_Ib[var2].field_tb - 10000;
                var2++;
                continue L0;
              } else {
                var2++;
                continue L0;
              }
            } else {
              var2++;
              continue L0;
            }
          }
        }
    }

    private final void b(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var7 = Virogrid.field_F ? 1 : 0;
        if (param2 == 6651) {
          var4 = 0;
          L0: while (true) {
            if (((d) this).field_Fb.length <= var4) {
              ((d) this).field_Jb.a(0, -param0 + ((d) this).field_ub, ((d) this).field_K, (byte) -70, param0);
              var8 = 0;
              var4 = var8;
              L1: while (true) {
                if (var8 >= ((d) this).field_Ib.length) {
                  return;
                } else {
                  ((d) this).field_Ib[var8].a(param1, ((d) this).field_Jb.field_ub - param1 * 2, -(param1 * 2) + ((d) this).field_Jb.field_K, (byte) -115, param1);
                  if (((d) this).field_Hb != var8) {
                    ((d) this).field_Ib[var8].field_tb = ((d) this).field_Ib[var8].field_tb + 10000;
                    var8++;
                    continue L1;
                  } else {
                    var8++;
                    continue L1;
                  }
                }
              }
            } else {
              var5 = var4 * ((d) this).field_K / ((d) this).field_Fb.length;
              var6 = ((d) this).field_K * (1 + var4) / ((d) this).field_Fb.length;
              ((d) this).field_Fb[var4].field_tb = var5;
              ((d) this).field_Fb[var4].field_F = 0;
              ((d) this).field_Fb[var4].field_K = -var5 + var6;
              ((d) this).field_Fb[var4].field_ub = param0;
              var4++;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    public static void e(byte param0) {
        if (param0 != -73) {
            field_Eb = -122L;
        }
        field_Lb = null;
        field_Gb = null;
        field_Kb = null;
    }

    final static void a(byte param0, byte[] param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var8 = null;
        byte[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        jc var16 = null;
        jc var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        byte[] var25 = null;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        int stackIn_36_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_38_1 = 0;
        int stackIn_53_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_55_1 = 0;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        int stackOut_35_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_37_1 = 0;
        int stackOut_36_0 = 0;
        int stackOut_36_1 = 0;
        int stackOut_52_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_54_1 = 0;
        int stackOut_53_0 = 0;
        int stackOut_53_1 = 0;
        var15 = Virogrid.field_F ? 1 : 0;
        var16 = new jc(param1);
        var17 = var16;
        var17.field_l = param1.length + -2;
        rj.field_h = var17.c((byte) -83);
        db.field_k = new int[rj.field_h];
        ei.field_d = new boolean[rj.field_h];
        mb.field_bb = new int[rj.field_h];
        md.field_g = new byte[rj.field_h][];
        gb.field_F = new int[rj.field_h];
        lj.field_j = new byte[rj.field_h][];
        el.field_w = new int[rj.field_h];
        var17.field_l = -(8 * rj.field_h) + param1.length - 7;
        oj.field_Kb = var17.c((byte) -108);
        se.field_d = var17.c((byte) 90);
        var3 = (var17.g(11132) & 255) + 1;
        if (param0 <= 0) {
          var4 = 0;
          L0: while (true) {
            L1: {
              if (var4 >= rj.field_h) {
                break L1;
              } else {
                el.field_w[var4] = var16.c((byte) -112);
                var4++;
                if (0 == 0) {
                  continue L0;
                } else {
                  break L1;
                }
              }
            }
            var4 = 0;
            L2: while (true) {
              L3: {
                if (var4 >= rj.field_h) {
                  break L3;
                } else {
                  mb.field_bb[var4] = var16.c((byte) 53);
                  var4++;
                  if (0 == 0) {
                    continue L2;
                  } else {
                    break L3;
                  }
                }
              }
              var4 = 0;
              L4: while (true) {
                L5: {
                  if (var4 >= rj.field_h) {
                    break L5;
                  } else {
                    db.field_k[var4] = var16.c((byte) 41);
                    var4++;
                    if (0 == 0) {
                      continue L4;
                    } else {
                      break L5;
                    }
                  }
                }
                var4 = 0;
                L6: while (true) {
                  L7: {
                    if (rj.field_h <= var4) {
                      break L7;
                    } else {
                      gb.field_F[var4] = var16.c((byte) 97);
                      var4++;
                      if (0 == 0) {
                        continue L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                  var17.field_l = 3 + -(var3 * 3) + (-7 + (param1.length - 8 * rj.field_h));
                  k.field_c = new int[var3];
                  var4 = 1;
                  L8: while (true) {
                    L9: {
                      if (var4 >= var3) {
                        break L9;
                      } else {
                        L10: {
                          k.field_c[var4] = var16.a(-25842);
                          if ((k.field_c[var4] ^ -1) != -1) {
                            break L10;
                          } else {
                            k.field_c[var4] = 1;
                            break L10;
                          }
                        }
                        var4++;
                        if (0 == 0) {
                          continue L8;
                        } else {
                          break L9;
                        }
                      }
                    }
                    var17.field_l = 0;
                    var4 = 0;
                    L11: while (true) {
                      L12: {
                        if (var4 >= rj.field_h) {
                          break L12;
                        } else {
                          var5 = db.field_k[var4];
                          var6 = gb.field_F[var4];
                          var7 = var5 * var6;
                          var24 = new byte[var7];
                          var22 = var24;
                          var20 = var22;
                          var18 = var20;
                          var8 = var18;
                          lj.field_j[var4] = var24;
                          var25 = new byte[var7];
                          var23 = var25;
                          var21 = var23;
                          var19 = var21;
                          var9 = var19;
                          md.field_g[var4] = var25;
                          var10 = 0;
                          var11 = var17.g(11132);
                          stackOut_25_0 = -1;
                          stackOut_25_1 = 1 & var11 ^ -1;
                          stackIn_27_0 = stackOut_25_0;
                          stackIn_27_1 = stackOut_25_1;
                          L13: {
                            L14: {
                              if (stackIn_27_0 != stackIn_27_1) {
                                break L14;
                              } else {
                                var12 = 0;
                                L15: while (true) {
                                  L16: {
                                    if (var12 >= var7) {
                                      break L16;
                                    } else {
                                      var8[var12] = var16.a((byte) 118);
                                      var12++;
                                      if (0 == 0) {
                                        continue L15;
                                      } else {
                                        break L16;
                                      }
                                    }
                                  }
                                  if (0 == (var11 & 2)) {
                                    break L13;
                                  } else {
                                    var12 = 0;
                                    L17: while (true) {
                                      L18: {
                                        if (var12 >= var7) {
                                          break L18;
                                        } else {
                                          L19: {
                                            byte dupTemp$2 = var16.a((byte) -114);
                                            var9[var12] = dupTemp$2;
                                            var13 = dupTemp$2;
                                            stackOut_35_0 = var10;
                                            stackIn_37_0 = stackOut_35_0;
                                            stackIn_36_0 = stackOut_35_0;
                                            if (-1 == var13) {
                                              stackOut_37_0 = stackIn_37_0;
                                              stackOut_37_1 = 0;
                                              stackIn_38_0 = stackOut_37_0;
                                              stackIn_38_1 = stackOut_37_1;
                                              break L19;
                                            } else {
                                              stackOut_36_0 = stackIn_36_0;
                                              stackOut_36_1 = 1;
                                              stackIn_38_0 = stackOut_36_0;
                                              stackIn_38_1 = stackOut_36_1;
                                              break L19;
                                            }
                                          }
                                          var10 = stackIn_38_0 | stackIn_38_1;
                                          var12++;
                                          if (0 == 0) {
                                            continue L17;
                                          } else {
                                            break L18;
                                          }
                                        }
                                      }
                                      if (0 == 0) {
                                        break L13;
                                      } else {
                                        break L14;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            var12 = 0;
                            L20: while (true) {
                              L21: {
                                if (var5 <= var12) {
                                  break L21;
                                } else {
                                  var13 = 0;
                                  L22: while (true) {
                                    L23: {
                                      if (var13 >= var6) {
                                        break L23;
                                      } else {
                                        var8[var5 * var13 + var12] = var16.a((byte) 78);
                                        var13++;
                                        if (0 == 0) {
                                          continue L22;
                                        } else {
                                          break L23;
                                        }
                                      }
                                    }
                                    var12++;
                                    if (0 == 0) {
                                      continue L20;
                                    } else {
                                      break L21;
                                    }
                                  }
                                }
                              }
                              if (-1 == (var11 & 2 ^ -1)) {
                                break L13;
                              } else {
                                var12 = 0;
                                L24: while (true) {
                                  if (var5 <= var12) {
                                    break L13;
                                  } else {
                                    var13 = 0;
                                    L25: while (true) {
                                      L26: {
                                        if (var6 <= var13) {
                                          break L26;
                                        } else {
                                          L27: {
                                            byte dupTemp$3 = var16.a((byte) -69);
                                            var9[var12 + var5 * var13] = dupTemp$3;
                                            var14 = dupTemp$3;
                                            stackOut_52_0 = var10;
                                            stackIn_54_0 = stackOut_52_0;
                                            stackIn_53_0 = stackOut_52_0;
                                            if ((var14 ^ -1) == 0) {
                                              stackOut_54_0 = stackIn_54_0;
                                              stackOut_54_1 = 0;
                                              stackIn_55_0 = stackOut_54_0;
                                              stackIn_55_1 = stackOut_54_1;
                                              break L27;
                                            } else {
                                              stackOut_53_0 = stackIn_53_0;
                                              stackOut_53_1 = 1;
                                              stackIn_55_0 = stackOut_53_0;
                                              stackIn_55_1 = stackOut_53_1;
                                              break L27;
                                            }
                                          }
                                          var10 = stackIn_55_0 | stackIn_55_1;
                                          var13++;
                                          if (0 == 0) {
                                            continue L25;
                                          } else {
                                            break L26;
                                          }
                                        }
                                      }
                                      var12++;
                                      if (0 == 0) {
                                        continue L24;
                                      } else {
                                        break L13;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          ei.field_d[var4] = var10 != 0;
                          var4++;
                          if (0 == 0) {
                            continue L11;
                          } else {
                            break L12;
                          }
                        }
                      }
                      return;
                    }
                  }
                }
              }
            }
          }
        } else {
          return;
        }
    }

    d(long param0, km param1, String[] param2, km param3, km[] param4, int param5) {
        super(param0, (km) null);
        int var8 = 0;
        km var9 = null;
        ((d) this).field_Fb = new km[param2.length];
        ((d) this).field_Jb = new km(0L, param3);
        ((d) this).field_Ib = param4;
        for (var8 = 0; var8 < param2.length; var8++) {
            var9 = new km(0L, param1);
            var9.field_V = param2[var8];
            ((d) this).field_Fb[var8] = var9;
            ((d) this).a(0, var9);
        }
        ((d) this).a(0, ((d) this).field_Jb);
        int var11 = 0;
        var8 = var11;
        while (var11 < param4.length) {
            ((d) this).field_Jb.a(0, param4[var11]);
            var11++;
        }
        ((d) this).field_Hb = param5;
        ((d) this).field_Fb[param5].field_xb = true;
    }

    final static int f(byte param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = Virogrid.field_F ? 1 : 0;
        var2 = -109 / ((param0 - -29) / 58);
        var1 = 0;
        L0: while (true) {
          if (!nd.b((byte) -116)) {
            L1: {
              g.field_b.a(ve.a(hk.field_Jb, nl.field_u, (byte) 66), false, ve.a(a.field_y, ii.field_b, (byte) 66));
              if (g.field_b.b(false)) {
                var1 = 1;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var3 = 0;
              if (var1 == 0) {
                break L2;
              } else {
                if (-1 < (g.field_b.field_d ^ -1)) {
                  break L2;
                } else {
                  var3 = ia.field_e[g.field_b.field_d];
                  if (var3 == 2) {
                    wn.c(false);
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
            }
            return var3;
          } else {
            g.field_b.e(-87);
            if (!g.field_b.b(false)) {
              continue L0;
            } else {
              var1 = 1;
              continue L0;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Lb = new int[8192];
        field_Kb = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
    }
}
