/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class di extends ci {
    private char[] field_Lb;
    static String field_Qb;
    private tl[] field_Nb;
    private di field_Kb;
    private int field_Sb;
    private int field_Ob;
    private int field_Eb;
    private di[] field_Mb;
    private int field_Rb;
    private int field_Fb;
    private int[] field_Gb;
    private int field_Jb;
    private int field_Hb;
    private int field_Pb;
    static byte[][] field_Ib;

    private final void a(int param0, byte param1) {
        int var5 = 0;
        int var3 = 0;
        int var4 = 0;
        int var6 = Chess.field_G;
        ((di) this).field_Eb = param0;
        for (var5 = 0; var5 < ((di) this).field_Sb; var5++) {
            var3 = var5 * ((di) this).field_Pb;
            var4 = ((di) this).field_Eb * ((di) this).field_Eb;
            ((di) this).field_Nb[var5].field_V = ((-var4 + 144) * var3 + var4 * (((di) this).field_Fb - ((di) this).field_wb)) / 144;
        }
        if (param1 > -54) {
            boolean discarded$0 = di.a(58, '/');
        }
    }

    final static boolean a(int param0, char param1) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == -49) {
          L0: {
            L1: {
              if (param1 < 48) {
                break L1;
              } else {
                if (param1 > 57) {
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L0;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          return true;
        }
    }

    final static void f(byte param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        long var3_long = 0L;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        le var9 = null;
        int var10 = 0;
        int stackIn_17_0 = 0;
        String stackIn_23_0 = null;
        int stackIn_27_0 = 0;
        String stackIn_33_0 = null;
        int stackIn_40_0 = 0;
        le stackIn_45_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        String stackOut_22_0 = null;
        String stackOut_21_0 = null;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        String stackOut_32_0 = null;
        String stackOut_31_0 = null;
        int stackOut_39_0 = 0;
        int stackOut_38_0 = 0;
        le stackOut_44_0 = null;
        le stackOut_43_0 = null;
        var10 = Chess.field_G;
        try {
          L0: {
            L1: {
              var1_int = ak.field_j;
              var2 = 0;
              if (gm.field_f == 2) {
                var3_long = -jg.field_M + ud.a(2);
                var2 = (int)((10999L - var3_long) / 1000L);
                if (var2 >= 0) {
                  break L1;
                } else {
                  var2 = 0;
                  break L1;
                }
              } else {
                break L1;
              }
            }
            var3 = 0;
            L2: while (true) {
              if (var3 >= ka.field_g.length) {
                break L0;
              } else {
                L3: {
                  var4 = cb.field_k[var3];
                  if (var4 >= 0) {
                    if (ol.field_R.field_h == var4) {
                      var5 = kj.field_h;
                      break L3;
                    } else {
                      var5 = kg.field_V;
                      break L3;
                    }
                  } else {
                    var5 = le.field_f;
                    break L3;
                  }
                }
                L4: {
                  var6 = ka.field_g[var3];
                  if (gm.field_f != 2) {
                    break L4;
                  } else {
                    if (1 != var2) {
                      break L4;
                    } else {
                      L5: {
                        if (hj.field_l.length > ik.field_a.length) {
                          stackOut_16_0 = hj.field_l.length;
                          stackIn_17_0 = stackOut_16_0;
                          break L5;
                        } else {
                          stackOut_15_0 = ik.field_a.length;
                          stackIn_17_0 = stackOut_15_0;
                          break L5;
                        }
                      }
                      L6: {
                        var7 = stackIn_17_0;
                        if (6 > var3) {
                          break L6;
                        } else {
                          if (var3 < var7 + 6) {
                            L7: {
                              if (-var7 + (var3 - 6) - -ik.field_a.length < 0) {
                                stackOut_22_0 = "";
                                stackIn_23_0 = stackOut_22_0;
                                break L7;
                              } else {
                                stackOut_21_0 = ik.field_a[ik.field_a.length + (-6 + var3) - var7];
                                stackIn_23_0 = stackOut_21_0;
                                break L7;
                              }
                            }
                            var6 = stackIn_23_0;
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                      }
                      L8: {
                        if (tj.field_p.length >= em.field_m.length) {
                          stackOut_26_0 = tj.field_p.length;
                          stackIn_27_0 = stackOut_26_0;
                          break L8;
                        } else {
                          stackOut_25_0 = em.field_m.length;
                          stackIn_27_0 = stackOut_25_0;
                          break L8;
                        }
                      }
                      var8 = stackIn_27_0;
                      if (var3 < 7 - -var7) {
                        break L4;
                      } else {
                        if (var3 < var7 + 7 + var8) {
                          L9: {
                            if (tj.field_p.length > var3 + -7 + -var7) {
                              stackOut_32_0 = tj.field_p[var3 - 7 + -var7];
                              stackIn_33_0 = stackOut_32_0;
                              break L9;
                            } else {
                              stackOut_31_0 = "";
                              stackIn_33_0 = stackOut_31_0;
                              break L9;
                            }
                          }
                          var6 = stackIn_33_0;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                }
                L10: {
                  if (var4 == -2) {
                    var6 = Integer.toString(var2);
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L11: {
                  if (0 > var4) {
                    stackOut_39_0 = 0;
                    stackIn_40_0 = stackOut_39_0;
                    break L11;
                  } else {
                    stackOut_38_0 = 1;
                    stackIn_40_0 = stackOut_38_0;
                    break L11;
                  }
                }
                L12: {
                  var7 = kn.a(stackIn_40_0 != 0, false, var6);
                  var8 = -(var7 >> 1) + ob.field_C;
                  if (0 <= var4) {
                    L13: {
                      if (var4 != ol.field_R.field_h) {
                        stackOut_44_0 = ie.field_b;
                        stackIn_45_0 = stackOut_44_0;
                        break L13;
                      } else {
                        stackOut_43_0 = in.field_d;
                        stackIn_45_0 = stackOut_43_0;
                        break L13;
                      }
                    }
                    L14: {
                      var9 = stackIn_45_0;
                      var1_int = var1_int + ek.field_b;
                      if (var9 == null) {
                        break L14;
                      } else {
                        var9.a(-m.field_d + var8, var7 - -(m.field_d << 1), (kl.field_i << 1) + vh.field_c, true, var1_int);
                        break L14;
                      }
                    }
                    var1_int = var1_int + kl.field_i;
                    break L12;
                  } else {
                    break L12;
                  }
                }
                L15: {
                  if (var4 >= 0) {
                    ce.field_a.a(var6, var8, var1_int + rm.field_S, var5, -1);
                    var1_int = var1_int + (vh.field_c + kl.field_i - -ek.field_b);
                    break L15;
                  } else {
                    vj.field_d.a(var6, var8, var1_int + b.field_d, var5, -1);
                    var1_int = var1_int + fd.field_n;
                    break L15;
                  }
                }
                var3++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fk.a((Throwable) (Object) var1, "di.F(" + 118 + ')');
        }
    }

    final void a(byte param0, int param1, int param2) {
        int var4_int = 0;
        di var4 = null;
        tl var5 = null;
        int var6 = 0;
        di var7 = null;
        tl stackIn_6_0 = null;
        tl stackIn_7_0 = null;
        tl stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        tl stackOut_5_0 = null;
        tl stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        tl stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        L0: {
          var6 = Chess.field_G;
          var4_int = 0;
          if (param0 == -44) {
            break L0;
          } else {
            ((di) this).n(-2);
            break L0;
          }
        }
        L1: while (true) {
          if (var4_int >= ((di) this).field_Nb.length) {
            L2: {
              if (((di) this).field_Jb == -1) {
                break L2;
              } else {
                var7 = ((di) this).field_Mb[((di) this).field_Jb];
                var4 = var7;
                if (var4 != null) {
                  var7.a((byte) -44, param1, param2);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (((di) this).field_Eb > 0) {
                this.a(-1 + ((di) this).field_Eb, (byte) -77);
                break L3;
              } else {
                break L3;
              }
            }
            return;
          } else {
            var5 = ((di) this).field_Nb[var4_int];
            if (1 == var5.field_L) {
              L4: {
                this.a((byte) 24, param1, var4_int, param2);
                stackOut_5_0 = (tl) var5;
                stackIn_7_0 = stackOut_5_0;
                stackIn_6_0 = stackOut_5_0;
                if (((di) this).field_Jb != var4_int) {
                  stackOut_7_0 = (tl) (Object) stackIn_7_0;
                  stackOut_7_1 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  stackIn_8_1 = stackOut_7_1;
                  break L4;
                } else {
                  stackOut_6_0 = (tl) (Object) stackIn_6_0;
                  stackOut_6_1 = 1;
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_8_1 = stackOut_6_1;
                  break L4;
                }
              }
              stackIn_8_0.field_gb = stackIn_8_1 != 0;
              var4_int++;
              continue L1;
            } else {
              var4_int++;
              continue L1;
            }
          }
        }
    }

    public static void g(byte param0) {
        field_Qb = null;
        field_Ib = null;
    }

    private final void a(byte param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        L0: {
          var7 = Chess.field_G;
          if (((di) this).field_Jb == param2) {
            ((di) this).n(83);
            this.a(0, (byte) -93);
            break L0;
          } else {
            if (((di) this).field_Mb[param2] != null) {
              ((di) this).n(-79);
              this.a(0, (byte) -120);
              ((di) this).field_Jb = param2;
              ((di) this).field_Kb = ((di) this).field_Mb[((di) this).field_Jb];
              q.a(((di) this).field_Kb, 0);
              ((di) this).field_Kb.a(12, (byte) -73);
              break L0;
            } else {
              if (((di) this).field_Gb[param2] == -1) {
                lc.a(103);
                rc.b(0);
                break L0;
              } else {
                L1: {
                  var5 = ((di) this).field_Gb[param2] | 32768;
                  var6 = vk.field_g;
                  if (var6 != 0) {
                    break L1;
                  } else {
                    if (null != pd.field_Rb) {
                      var6 = 1;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
                L2: {
                  if (lg.a(105, var6) == 2) {
                    oj.a(var6, (byte) -99, 1, param3);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var8 = null;
                ke.a(9822, vk.field_g, ij.field_c, param1, var5, (String) null);
                hn.a(ij.field_c, vk.field_g, (byte) -54, var5, re.field_p);
                rc.b(0);
                e.h((byte) -120);
                break L0;
              }
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = Chess.field_G;
        if (param5 != 6) {
            return;
        }
        ((di) this).field_Hb = param4 * 2 + ((di) this).field_Ob;
        ((di) this).a(param2, ((di) this).field_Hb, -2147483648, ((di) this).field_Rb, param3 - ((di) this).field_Rb);
        if (param0 != ((di) this).field_Fb) {
            ((di) this).field_Fb = param0;
            this.a(((di) this).field_Eb, (byte) -100);
        }
        for (var7 = 0; ((di) this).field_Sb > var7; var7++) {
            ((di) this).field_Nb[var7].a(((di) this).field_Hb, param1, ((di) this).field_Pb, 0, ((di) this).field_Nb[var7].field_V, (byte) -22, param4);
        }
        if (-1 != ((di) this).field_Jb) {
            if (null != ((di) this).field_Mb[((di) this).field_Jb]) {
                var7 = ((di) this).field_Mb[((di) this).field_Jb].field_Sb;
                var8 = ((di) this).field_Pb * (var7 + ((di) this).field_Jb) + ((di) this).field_V;
                while (var8 > param3) {
                    var8 = var8 - ((di) this).field_Pb;
                }
                ((di) this).field_Mb[((di) this).field_Jb].a(((di) this).field_Nb[((di) this).field_Jb].field_wb, param1, ((di) this).field_Hb + param2, var8, param4, 6);
            }
        }
    }

    final static void a(int param0, int param1, int param2) {
        int var3 = -41 % ((param1 - 13) / 48);
        ob.field_C = param0;
        kd.field_Hb = param2;
    }

    final boolean m(int param0) {
        int var4 = 0;
        tl var5 = null;
        int var6 = Chess.field_G;
        if (param0 >= -86) {
            return false;
        }
        int var2 = 0;
        tl[] var3 = ((di) this).field_Nb;
        for (var4 = 0; var4 < var3.length; var4++) {
            var5 = var3[var4];
            var2 = var2 | (var5.field_L != 0 ? 1 : 0);
        }
        if (var2 == 0) {
            if (-1 != ((di) this).field_Jb) {
                if (null != ((di) this).field_Mb[((di) this).field_Jb]) {
                    var2 = ((di) this).field_Mb[((di) this).field_Jb].m(-120) ? 1 : 0;
                }
            }
        }
        return var2 != 0;
    }

    final void n(int param0) {
        int var4 = 0;
        tl var5 = null;
        int var6 = Chess.field_G;
        int var3 = -115 / ((4 - param0) / 56);
        tl[] var7 = ((di) this).field_Nb;
        tl[] var2 = var7;
        for (var4 = 0; var7.length > var4; var4++) {
            var5 = var7[var4];
            var5.field_L = 0;
            var5.field_gb = false;
        }
        if (((di) this).field_Kb != null) {
            ((di) this).field_Kb.n(105);
            ((di) this).field_Kb.c(-2193);
        }
        ((di) this).field_Kb = null;
        ((di) this).field_Jb = -1;
        this.a(12, (byte) -88);
    }

    di(long param0, ci param1, ci param2, ci param3, di[] param4, int[] param5, String[] param6, char[] param7) {
        super(param0, param1);
        RuntimeException var10 = null;
        String var11 = null;
        String var12 = null;
        int var13 = 0;
        Object var14 = null;
        int var15 = 0;
        lh var17 = null;
        lh var18 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        ((di) this).field_Jb = -1;
        try {
          L0: {
            ((di) this).field_Gb = param5;
            ((di) this).field_Lb = param7;
            ((di) this).field_Mb = param4;
            ((di) this).field_Sb = ((di) this).field_Gb.length;
            var17 = param3.field_xb;
            var18 = var17;
            ((di) this).field_Pb = 2 + (var18.field_C + var18.field_t);
            ((di) this).field_Nb = new tl[((di) this).field_Sb];
            ((di) this).field_Rb = ((di) this).field_Sb * ((di) this).field_Pb;
            ((di) this).field_Ob = 0;
            var11 = "<col=999999>";
            var12 = "</col>";
            var13 = 0;
            L1: while (true) {
              if (((di) this).field_Sb <= var13) {
                ((di) this).field_Ob = ((di) this).field_Ob + (10 + mc.field_b.field_v);
                this.a(12, (byte) -117);
                break L0;
              } else {
                L2: {
                  if (0 >= ((di) this).field_Lb[var13]) {
                    break L2;
                  } else {
                    param6[var13] = var11 + sc.a(((di) this).field_Lb[var13], 123).toUpperCase() + ": " + var12 + param6[var13];
                    break L2;
                  }
                }
                L3: {
                  L4: {
                    var14 = null;
                    if (null != ((di) this).field_Mb[var13]) {
                      break L4;
                    } else {
                      if (((di) this).field_Gb[var13] != -1) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var14 = (Object) (Object) mc.field_b;
                  break L3;
                }
                L5: {
                  ((di) this).field_Nb[var13] = new tl(0L, param2, (ci) null, param3, (km) var14, param6[var13]);
                  ((di) this).a((byte) 127, (ci) (Object) ((di) this).field_Nb[var13]);
                  var15 = var17.b(param6[var13]);
                  if (((di) this).field_Ob >= var15) {
                    break L5;
                  } else {
                    ((di) this).field_Ob = var15;
                    break L5;
                  }
                }
                var13++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var10 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var10;
            stackOut_13_1 = new StringBuilder().append("di.<init>(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L6;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L6;
            }
          }
          L7: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L7;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L7;
            }
          }
          L8: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param3 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L8;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L8;
            }
          }
          L9: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param4 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L9;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L9;
            }
          }
          L10: {
            stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param5 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L10;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L10;
            }
          }
          L11: {
            stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
            stackOut_28_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param6 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L11;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L11;
            }
          }
          L12: {
            stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
            stackOut_31_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',');
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param7 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L12;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L12;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + ')');
        }
    }

    final int l(int param0) {
        if (param0 <= 12) {
            return -9;
        }
        return ((di) this).field_Hb - -(null == ((di) this).field_Kb ? 0 : ((di) this).field_Kb.l(47));
    }

    final boolean b(byte param0, int param1, int param2) {
        int var7 = 0;
        int var8 = Chess.field_G;
        int var5 = -41 / ((11 - param0) / 60);
        int var4 = vg.field_a == 85 ? 1 : 0;
        if (null != ((di) this).field_Kb) {
            if (var4 != 0) {
                if (!(-1 != ((di) this).field_Kb.field_Jb)) {
                    ((di) this).n(69);
                    this.a(0, (byte) -61);
                    return true;
                }
            }
            return ((di) this).field_Kb.b((byte) -88, param1, param2);
        }
        if (((di) this).field_Kb == null) {
            if ((Object) (Object) tl.field_Fb == this) {
                if (!(var4 == 0)) {
                    rc.b(0);
                    return true;
                }
            }
        }
        int var6 = d.field_Ib;
        if (var6 <= 0) {
            return false;
        }
        if (var6 == ql.field_f) {
            var6 = 63;
        }
        for (var7 = 0; ((di) this).field_Lb.length > var7; var7++) {
            if (!(((di) this).field_Lb[var7] != var6)) {
                this.a((byte) 24, param2, var7, param1);
                return true;
            }
        }
        return false;
    }

    final static void a(int param0, boolean param1) {
        if (param0 > -18) {
            boolean discarded$0 = di.a(42, 'ￖ');
        }
        if (!(!lk.a((byte) 81))) {
            param1 = false;
        }
        hl.a(-416228287, param1);
        if (!(!fn.field_a)) {
            wb.g(qa.field_f.field_a.field_mb, qa.field_f.field_a.field_V, qa.field_f.field_a.field_M, qa.field_f.field_a.field_pb);
            qa.field_f.field_a.a(false, param1);
        }
        cn.a(16384, param1);
    }

    final static void k(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        em var4_ref_em = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        double var10 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17_int = 0;
        em var17 = null;
        int var18 = 0;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        RuntimeException decompiledCaughtException = null;
        var19 = Chess.field_G;
        try {
          L0: {
            th.field_c = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
            var1_int = ei.field_v.length;
            var23 = new int[var1_int];
            var22 = var23;
            var21 = var22;
            var20 = var21;
            var2 = var20;
            var3 = 0;
            L1: while (true) {
              if (var3 >= var1_int) {
                L2: {
                  var3 = th.field_c[9] >> 8;
                  var4 = th.field_c[10] >> 8;
                  var5 = th.field_c[11] >> 8;
                  var6 = sl.field_a << 4;
                  var7 = 0;
                  var8 = pj.a(106, var6) >> 8;
                  var9 = rf.a(var6, 255) >> 8;
                  if (hn.field_k == -1) {
                    break L2;
                  } else {
                    if (rf.field_b != -1) {
                      var8 = -rf.field_b + 240;
                      var9 = -128;
                      var7 = -320 + hn.field_k;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                var10 = 256.0 / Math.sqrt((double)(var9 * var9 + var8 * var8 + var7 * var7));
                var8 = (int)((double)var8 * var10);
                var7 = (int)((double)var7 * var10);
                var9 = (int)((double)var9 * var10);
                var12 = var7 + -var3;
                var13 = var8 - var4;
                var14 = var9 + -var5;
                var10 = 256.0 / Math.sqrt((double)(var13 * var13 + (var12 * var12 - -(var14 * var14))));
                var13 = (int)((double)var13 * var10);
                var12 = (int)((double)var12 * var10);
                var14 = (int)((double)var14 * var10);
                var15 = 0;
                L3: while (true) {
                  if (ei.field_v.length <= var15) {
                    break L0;
                  } else {
                    var16 = 0;
                    var17_int = 1;
                    L4: while (true) {
                      if (var17_int >= ei.field_v.length) {
                        var2[var16] = -2147483648;
                        var17 = ei.field_v[var16];
                        cn.a((byte) 25, var16);
                        var18 = 0;
                        L5: while (true) {
                          if (var18 >= 3) {
                            hb.a(false, th.field_c, (byte) -98, ua.field_b, false, var17, true);
                            lf.a(var8, var17, var14, var9, 29521, var12, var13, var7);
                            var15++;
                            continue L3;
                          } else {
                            ua.field_b[var18] = ua.field_b[var18] + ql.field_a[var15][var18];
                            var18++;
                            continue L5;
                          }
                        }
                      } else {
                        L6: {
                          if (var23[var17_int] <= var23[var16]) {
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        var17_int++;
                        continue L4;
                      }
                    }
                  }
                }
              } else {
                var4_ref_em = ei.field_v[var3];
                var4_ref_em.a(32767);
                cn.a((byte) 25, var3);
                var5 = var4_ref_em.field_K + var4_ref_em.field_P >> 1;
                var6 = var4_ref_em.field_v + var4_ref_em.field_I >> 1;
                var7 = var4_ref_em.field_n + var4_ref_em.field_x >> 1;
                var8 = th.field_c[9] >> 2;
                var9 = th.field_c[10] >> 2;
                var10_int = th.field_c[11] >> 2;
                var11 = var9 * ua.field_b[4] + (ua.field_b[3] * var8 - -(ua.field_b[5] * var10_int)) >> 14;
                var12 = var10_int * ua.field_b[8] + var8 * ua.field_b[6] - -(ua.field_b[7] * var9) >> 14;
                var13 = var10_int * ua.field_b[11] + var8 * ua.field_b[9] + var9 * ua.field_b[10] >> 14;
                var2[var3] = var6 * var12 + (var11 * var5 + var13 * var7) >> 16;
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fk.a((Throwable) (Object) var1, "di.I(" + 9 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Qb = "Password: ";
        field_Ib = new byte[250][];
    }
}
