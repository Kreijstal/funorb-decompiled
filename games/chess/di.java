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
        this.field_Eb = param0;
        for (var5 = 0; var5 < this.field_Sb; var5++) {
            var3 = var5 * this.field_Pb;
            var4 = this.field_Eb * this.field_Eb;
            this.field_Nb[var5].field_V = ((-var4 + 144) * var3 + var4 * (this.field_Fb - this.field_wb)) / 144;
        }
        if (param1 > -54) {
            di.a(58, '/');
        }
    }

    final static boolean a(int param0, char param1) {
        int stackIn_6_0 = 0;
        if (param0 == -49) {
          L0: {
            L1: {
              if (param1 < 48) {
                break L1;
              } else {
                if (param1 > 57) {
                  break L1;
                } else {
                  stackIn_6_0 = 1;
                  break L0;
                }
              }
            }
            stackIn_6_0 = 0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          return true;
        }
    }

    final static void f(byte param0) {
        int stackIn_17_0 = 0;
        String stackIn_23_0 = null;
        int stackIn_27_0 = 0;
        String stackIn_33_0 = null;
        int stackIn_40_0 = 0;
        le stackIn_45_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
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
        var10 = Chess.field_G;
        try {
          L0: {
            L1: {
              var1_int = ak.field_j;
              var2 = 0;
              if (gm.field_f == 2) {
                var3_long = -jg.field_M + ud.a(2);
                var2 = (int)((10999L - var3_long) / 1000L);
                if ((var2 ^ -1) <= -1) {
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
                L3: {
                  if (param0 > 88) {
                    break L3;
                  } else {
                    di.a(35, true);
                    break L3;
                  }
                }
                break L0;
              } else {
                L4: {
                  var4 = cb.field_k[var3];
                  if (var4 >= 0) {
                    if (ol.field_R.field_h == var4) {
                      var5 = kj.field_h;
                      break L4;
                    } else {
                      var5 = kg.field_V;
                      break L4;
                    }
                  } else {
                    var5 = le.field_f;
                    break L4;
                  }
                }
                L5: {
                  var6 = ka.field_g[var3];
                  if (-3 != (gm.field_f ^ -1)) {
                    break L5;
                  } else {
                    if (1 != var2) {
                      break L5;
                    } else {
                      L6: {
                        if (hj.field_l.length > ik.field_a.length) {
                          stackIn_17_0 = hj.field_l.length;
                          break L6;
                        } else {
                          stackIn_17_0 = ik.field_a.length;
                          break L6;
                        }
                      }
                      L7: {
                        var7 = stackIn_17_0;
                        if (6 > var3) {
                          break L7;
                        } else {
                          if (var3 < var7 + 6) {
                            L8: {
                              if (-1 < (-var7 + (var3 - 6) - -ik.field_a.length ^ -1)) {
                                stackIn_23_0 = "";
                                break L8;
                              } else {
                                stackIn_23_0 = ik.field_a[ik.field_a.length + (-6 + var3) - var7];
                                break L8;
                              }
                            }
                            var6 = stackIn_23_0;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                      }
                      L9: {
                        if (tj.field_p.length >= em.field_m.length) {
                          stackIn_27_0 = tj.field_p.length;
                          break L9;
                        } else {
                          stackIn_27_0 = em.field_m.length;
                          break L9;
                        }
                      }
                      var8 = stackIn_27_0;
                      if (var3 < 7 - -var7) {
                        break L5;
                      } else {
                        if (var3 < var7 + 7 + var8) {
                          L10: {
                            if (tj.field_p.length > var3 + -7 + -var7) {
                              stackIn_33_0 = tj.field_p[var3 - 7 + -var7];
                              break L10;
                            } else {
                              stackIn_33_0 = "";
                              break L10;
                            }
                          }
                          var6 = stackIn_33_0;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                }
                L11: {
                  if (1 == (var4 ^ -1)) {
                    var6 = Integer.toString(var2);
                    break L11;
                  } else {
                    break L11;
                  }
                }
                L12: {
                  if (0 > var4) {
                    stackIn_40_0 = 0;
                    break L12;
                  } else {
                    stackIn_40_0 = 1;
                    break L12;
                  }
                }
                L13: {
                  var7 = kn.a(stackIn_40_0 != 0, false, var6);
                  var8 = -(var7 >> 48205569) + ob.field_C;
                  if (0 <= var4) {
                    L14: {
                      if (var4 != ol.field_R.field_h) {
                        stackIn_45_0 = ie.field_b;
                        break L14;
                      } else {
                        stackIn_45_0 = in.field_d;
                        break L14;
                      }
                    }
                    L15: {
                      var9 = stackIn_45_0;
                      var1_int = var1_int + ek.field_b;
                      if (var9 == null) {
                        break L15;
                      } else {
                        var9.a(-m.field_d + var8, var7 - -(m.field_d << -509725119), (kl.field_i << -496842687) + vh.field_c, true, var1_int);
                        break L15;
                      }
                    }
                    var1_int = var1_int + kl.field_i;
                    break L13;
                  } else {
                    break L13;
                  }
                }
                L16: {
                  if (var4 >= 0) {
                    ce.field_a.a(var6, var8, var1_int + rm.field_S, var5, -1);
                    var1_int = var1_int + (vh.field_c + kl.field_i - -ek.field_b);
                    break L16;
                  } else {
                    vj.field_d.a(var6, var8, var1_int + b.field_d, var5, -1);
                    var1_int = var1_int + fd.field_n;
                    break L16;
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
          throw fk.a((Throwable) ((Object) var1), "di.F(" + param0 + ')');
        }
    }

    final void a(byte param0, int param1, int param2) {
        int var4_int;
        tl var5;
        int var6;
        tl stackIn_7_0 = null;
        tl stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        di var4;
        di var7;
        L0: {
          var6 = Chess.field_G;
          var4_int = 0;
          if (param0 == -44) {
            break L0;
          } else {
            this.n(-2);
            break L0;
          }
        }
        L1: while (true) {
          if (var4_int >= this.field_Nb.length) {
            L2: {
              if ((this.field_Jb ^ -1) == 0) {
                break L2;
              } else {
                var7 = this.field_Mb[this.field_Jb];
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
              if ((this.field_Eb ^ -1) < -1) {
                this.a(-1 + this.field_Eb, (byte) -77);
                break L3;
              } else {
                break L3;
              }
            }
            return;
          } else {
            var5 = this.field_Nb[var4_int];
            if (1 == var5.field_L) {
              L4: {
                this.a((byte) 24, param1, var4_int, param2);
                stackIn_7_0 = (tl) (var5);

                if (this.field_Jb != var4_int) {
                  stackIn_8_0 = (tl) ((Object) stackIn_7_0);
                  stackIn_8_1 = 0;
                  break L4;
                } else {
                  stackIn_8_0 = (tl) ((Object) stackIn_7_0);
                  stackIn_8_1 = 1;
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
        if (param0 != -54) {
            field_Qb = (String) null;
        }
        field_Qb = null;
        field_Ib = (byte[][]) null;
    }

    private final void a(byte param0, int param1, int param2, int param3) {
        int var5;
        int var6;
        int var7;
        String var8;
        L0: {
          var7 = Chess.field_G;
          if (this.field_Jb == param2) {
            this.n(param0 ^ 75);
            this.a(0, (byte) -93);
            break L0;
          } else {
            if (this.field_Mb[param2] != null) {
              this.n(-79);
              this.a(0, (byte) -120);
              this.field_Jb = param2;
              this.field_Kb = this.field_Mb[this.field_Jb];
              q.a(this.field_Kb, 0);
              this.field_Kb.a(12, (byte) -73);
              break L0;
            } else {
              if ((this.field_Gb[param2] ^ -1) == 0) {
                lc.a(103);
                rc.b(0);
                break L0;
              } else {
                L1: {
                  var5 = this.field_Gb[param2] | 32768;
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
                  if (-3 == (lg.a(105, var6) ^ -1)) {
                    oj.a(var6, (byte) -99, 1, param3);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var8 = (String) null;
                ke.a(9822, vk.field_g, ij.field_c, param1, var5, (String) null);
                hn.a(ij.field_c, vk.field_g, (byte) -54, var5, re.field_p);
                rc.b(param0 ^ 24);
                e.h((byte) -120);
                break L0;
              }
            }
          }
        }
        L3: {
          if (param0 == 24) {
            break L3;
          } else {
            di.a(19, '6');
            break L3;
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
        this.field_Hb = param4 * 2 + this.field_Ob;
        this.a(param2, this.field_Hb, -2147483648, this.field_Rb, param3 - this.field_Rb);
        if (param0 != this.field_Fb) {
            this.field_Fb = param0;
            this.a(this.field_Eb, (byte) -100);
        }
        for (var7 = 0; this.field_Sb > var7; var7++) {
            this.field_Nb[var7].a(this.field_Hb, param1, this.field_Pb, 0, this.field_Nb[var7].field_V, (byte) -22, param4);
        }
        if (-1 != this.field_Jb && null != this.field_Mb[this.field_Jb]) {
            var7 = this.field_Mb[this.field_Jb].field_Sb;
            for (var8 = this.field_Pb * (var7 + this.field_Jb) + this.field_V; var8 > param3; var8 = var8 - this.field_Pb) {
            }
            this.field_Mb[this.field_Jb].a(this.field_Nb[this.field_Jb].field_wb, param1, this.field_Hb + param2, var8, param4, 6);
        }
    }

    final static void a(int param0, int param1, int param2) {
        int var3 = -41 % ((param1 - 13) / 48);
        ob.field_C = param0;
        kd.field_Hb = param2;
    }

    final boolean m(int param0) {
        int var2;
        tl[] var3;
        int var4;
        tl var5;
        int var6;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_10_1 = 0;
        int stackIn_17_0 = 0;
        var6 = Chess.field_G;
        if (param0 < -86) {
          var2 = 0;
          var3 = this.field_Nb;
          var4 = 0;
          L0: while (true) {
            L1: {
              L2: {
                if (var4 >= var3.length) {
                  if (var2 != 0) {
                    break L1;
                  } else {
                    if (-1 == this.field_Jb) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                } else {
                  var5 = var3[var4];
                  stackIn_7_0 = var2;

                  stackIn_7_1 = -1;

                  L3: {


                    if (stackIn_7_1 == (var5.field_L ^ -1)) {

                      stackIn_10_1 = 0;
                      break L3;
                    } else {

                      stackIn_10_1 = 1;
                      break L3;
                    }
                  }
                  var2 = stackIn_7_0 | stackIn_10_1;
                  var4++;
                  continue L0;
                }
              }
              if (null == this.field_Mb[this.field_Jb]) {
                break L1;
              } else {
                L4: {
                  if (!this.field_Mb[this.field_Jb].m(-120)) {
                    stackIn_17_0 = 0;
                    break L4;
                  } else {
                    stackIn_17_0 = 1;
                    break L4;
                  }
                }
                var2 = stackIn_17_0;
                break L1;
              }
            }
            return var2 != 0;
          }
        } else {
          return false;
        }
    }

    final void n(int param0) {
        int var4 = 0;
        tl var5 = null;
        int var6 = Chess.field_G;
        int var3 = -115 / ((4 - param0) / 56);
        tl[] var7 = this.field_Nb;
        tl[] var2 = var7;
        for (var4 = 0; var7.length > var4; var4++) {
            var5 = var7[var4];
            var5.field_L = 0;
            var5.field_gb = false;
        }
        if (this.field_Kb != null) {
            this.field_Kb.n(105);
            this.field_Kb.c(-2193);
        }
        this.field_Kb = null;
        this.field_Jb = -1;
        this.a(12, (byte) -88);
    }

    di(long param0, ci param1, ci param2, ci param3, di[] param4, int[] param5, String[] param6, char[] param7) {
        super(param0, param1);
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10 = null;
        String var11 = null;
        String var12 = null;
        int var13 = 0;
        Object var14 = null;
        int var15 = 0;
        lh var17 = null;
        lh var18 = null;
        this.field_Jb = -1;
        try {
          L0: {
            this.field_Gb = param5;
            this.field_Lb = param7;
            this.field_Mb = param4;
            this.field_Sb = this.field_Gb.length;
            var17 = param3.field_xb;
            var18 = var17;
            this.field_Pb = 2 + (var18.field_C + var18.field_t);
            this.field_Nb = new tl[this.field_Sb];
            this.field_Rb = this.field_Sb * this.field_Pb;
            this.field_Ob = 0;
            var11 = "<col=999999>";
            var12 = "</col>";
            var13 = 0;
            L1: while (true) {
              if (this.field_Sb <= var13) {
                this.field_Ob = this.field_Ob + (10 + mc.field_b.field_v);
                this.a(12, (byte) -117);
                break L0;
              } else {
                L2: {
                  if (0 >= this.field_Lb[var13]) {
                    break L2;
                  } else {
                    param6[var13] = var11 + sc.a(this.field_Lb[var13], 123).toUpperCase() + ": " + var12 + param6[var13];
                    break L2;
                  }
                }
                L3: {
                  L4: {
                    var14 = null;
                    if (null != this.field_Mb[var13]) {
                      break L4;
                    } else {
                      if (this.field_Gb[var13] != -1) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var14 = mc.field_b;
                  break L3;
                }
                L5: {
                  this.field_Nb[var13] = new tl(0L, param2, (ci) null, param3, (km) (var14), param6[var13]);
                  this.a((byte) 127, this.field_Nb[var13]);
                  var15 = var17.b(param6[var13]);
                  if (this.field_Ob >= var15) {
                    break L5;
                  } else {
                    this.field_Ob = var15;
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
            stackIn_15_0 = (RuntimeException) (var10);

            stackIn_15_1 = new StringBuilder().append("di.<init>(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L6;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param2 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L7;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');

            if (param3 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L8;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');

            if (param4 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L9;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_27_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');

            if (param5 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L10;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_30_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',');

            if (param6 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L11;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_33_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',');

            if (param7 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L12;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L12;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_16_0), stackIn_34_2 + ')');
        }
    }

    final int l(int param0) {
        if (param0 <= 12) {
            return -9;
        }
        return this.field_Hb - -(null == this.field_Kb ? 0 : this.field_Kb.l(47));
    }

    final boolean b(byte param0, int param1, int param2) {
        int var7 = 0;
        int var8 = Chess.field_G;
        int var5 = -41 / ((11 - param0) / 60);
        int var4 = (vg.field_a ^ -1) == -86 ? 1 : 0;
        if (null != this.field_Kb) {
            if (var4 != 0) {
                if (!(-1 != this.field_Kb.field_Jb)) {
                    this.n(69);
                    this.a(0, (byte) -61);
                    return true;
                }
            }
            return this.field_Kb.b((byte) -88, param1, param2);
        }
        if (this.field_Kb == null && tl.field_Fb == this) {
            if (!(var4 == 0)) {
                rc.b(0);
                return true;
            }
        }
        int var6 = d.field_Ib;
        if (var6 <= 0) {
            return false;
        }
        if (var6 == ql.field_f) {
            var6 = 63;
        }
        for (var7 = 0; this.field_Lb.length > var7; var7++) {
            if (!(this.field_Lb[var7] != var6)) {
                this.a((byte) 24, param2, var7, param1);
                return true;
            }
        }
        return false;
    }

    final static void a(int param0, boolean param1) {
        if (param0 > -18) {
            di.a(42, 'ￖ');
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
        int var1_int = 0;
        int[] var2 = null;
        int var3 = 0;
        em var4_ref_em = null;
        int var4 = 0;
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
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        em var17 = null;
        int var18 = 0;
        var19 = Chess.field_G;
        try {
          L0: {
            th.field_c = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
            var1_int = ei.field_v.length;
            var21 = new int[var1_int];
            var20 = var21;
            var2 = var20;
            var3 = 0;
            L1: while (true) {
              if (var3 >= var1_int) {
                L2: {
                  var3 = th.field_c[param0] >> 1635654824;
                  var4 = th.field_c[10] >> -1976766424;
                  var5 = th.field_c[11] >> -219012152;
                  var6 = sl.field_a << -1840677404;
                  var7 = 0;
                  var8 = pj.a(106, var6) >> -1715017976;
                  var9 = rf.a(var6, 255) >> 88548424;
                  if ((hn.field_k ^ -1) == 0) {
                    break L2;
                  } else {
                    if ((rf.field_b ^ -1) != 0) {
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
                          if (-4 >= (var18 ^ -1)) {
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
                        if (var21[var17_int] > var21[var16]) {
                          var16 = var17_int;
                          var17_int++;
                          continue L4;
                        } else {
                          var17_int++;
                          continue L4;
                        }
                      }
                    }
                  }
                }
              } else {
                var4_ref_em = ei.field_v[var3];
                var4_ref_em.a(32767);
                cn.a((byte) 25, var3);
                var5 = var4_ref_em.field_K + var4_ref_em.field_P >> -886976255;
                var6 = var4_ref_em.field_v + var4_ref_em.field_I >> -1242076895;
                var7 = var4_ref_em.field_n + var4_ref_em.field_x >> -1183141791;
                var8 = th.field_c[9] >> -653971294;
                var9 = th.field_c[10] >> 1233910626;
                var10_int = th.field_c[11] >> -757578238;
                var11 = var9 * ua.field_b[4] + (ua.field_b[3] * var8 - -(ua.field_b[5] * var10_int)) >> -1014245426;
                var12 = var10_int * ua.field_b[8] + var8 * ua.field_b[6] - -(ua.field_b[7] * var9) >> -1602990898;
                var13 = var10_int * ua.field_b[11] + var8 * ua.field_b[9] + var9 * ua.field_b[10] >> -1128683986;
                var2[var3] = var6 * var12 + (var11 * var5 + var13 * var7) >> -330581648;
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var1), "di.I(" + param0 + ')');
        }
    }

    static {
        field_Qb = "Password: ";
        field_Ib = new byte[250][];
    }
}
