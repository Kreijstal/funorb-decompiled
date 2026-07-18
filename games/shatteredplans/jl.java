/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class jl extends w {
    private int field_L;
    private int field_K;
    private int field_T;
    private int field_R;
    static qb field_S;
    private int field_P;
    private int field_Q;
    static java.math.BigInteger field_V;
    static String field_N;
    static String field_O;
    static int[] field_M;
    static int field_U;
    static bi field_W;

    jl(tc param0, int param1, int param2) {
        super(param0, param1, param2);
        ((jl) this).field_P = 0;
        ((jl) this).field_Q = 0;
    }

    final void b(int param0, int param1, int param2, int param3) {
        if (0 >= param1) {
            ((jl) this).b(param3, param2, (byte) -121);
            return;
        }
        ((jl) this).field_L = ((jl) this).field_x;
        ((jl) this).field_R = ((jl) this).field_n;
        ((jl) this).field_T = param2;
        ((jl) this).field_Q = 0;
        int var5 = -30 % ((param0 - 43) / 43);
        ((jl) this).field_K = param3;
        ((jl) this).field_P = param1;
    }

    void a(int param0, int param1, int param2) {
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
        var16 = ShatteredPlansClient.field_F ? 1 : 0;
        gf.i(param0 + 6, param2 - -35, -12 + ((jl) this).field_x, -40 + ((jl) this).field_n, 2105376, 0);
        var4 = 35;
        var5 = 211;
        var6 = 194;
        var7 = 0;
        var8 = param2;
        L0: while (true) {
          if (var4 <= var7) {
            var6 = 169;
            var4 = 22;
            var5 = 194;
            var7 = 0;
            var8 = param2 + 35;
            L1: while (true) {
              if (var7 >= var4) {
                L2: {
                  kb.field_v.f(((jl) this).field_x + param0 - 90, 10 + param2);
                  wh.a(os.field_u, param2 + 35, ((jl) this).field_x + -10, (byte) -114, 5 + param0);
                  wh.a(oh.field_d, -22 + (((jl) this).field_n + param2), ((jl) this).field_x, (byte) -99, param0);
                  var5 = 169;
                  var4 = -79 + ((jl) this).field_n;
                  var6 = 127;
                  var7 = 0;
                  if (param1 == 103) {
                    break L2;
                  } else {
                    field_M = null;
                    break L2;
                  }
                }
                var8 = param2 + 57;
                L3: while (true) {
                  if (var7 >= var4) {
                    return;
                  } else {
                    var9 = var5 - -(var7 * (var6 - var5) / var4);
                    var9 = var9 | (var9 << 16 | var9 << 8);
                    gf.f(param0, var8, 6, var9);
                    gf.f(param0 + ((jl) this).field_x + -6, var8, 6, var9);
                    var7++;
                    var8++;
                    continue L3;
                  }
                }
              } else {
                var9 = var5 - -((-var5 + var6) * var7 / var4);
                var9 = var9 | (var9 << 8 | var9 << 16);
                gf.f(param0, var8, 6, var9);
                gf.f(-6 + (((jl) this).field_x + param0), var8, 6, var9);
                var7++;
                var8++;
                continue L1;
              }
            }
          } else {
            L4: {
              if (~gf.field_a < ~var8) {
                break L4;
              } else {
                if (var8 < gf.field_f) {
                  L5: {
                    var9 = var5 + var7 * (-var5 + var6) / var4;
                    var10 = 0;
                    var11 = ((jl) this).field_x;
                    if (var7 > 20) {
                      break L5;
                    } else {
                      L6: while (true) {
                        if (var10 > 20) {
                          break L5;
                        } else {
                          L7: {
                            var12 = (-var7 + 20) * (-var7 + 20) - -((20 - var10) * (-var10 + 20));
                            if (var12 > 462) {
                              break L7;
                            } else {
                              if (var12 < 420) {
                                break L5;
                              } else {
                                var13 = (-var12 + 462) * var9 / 42;
                                var13 = var13 | (var13 << 16 | var13 << 8);
                                gf.field_h[var10 + (var8 * gf.field_b - -param0)] = var13;
                                break L7;
                              }
                            }
                          }
                          var10++;
                          continue L6;
                        }
                      }
                    }
                  }
                  L8: {
                    if (var7 <= 20) {
                      var12 = var11;
                      var11 -= 21;
                      var13 = 0;
                      L9: while (true) {
                        L10: {
                          if (var13 > 20) {
                            break L10;
                          } else {
                            var14 = var13 * var13 + (20 - var7) * (-var7 + 20);
                            if (var14 <= 462) {
                              L11: {
                                if (var14 < 420) {
                                  var12 = var11 - -1;
                                  break L11;
                                } else {
                                  var15 = var9 * (462 - var14) / 42;
                                  var15 = var15 | (var15 << 8 | var15 << 16);
                                  gf.field_h[var11 + param0 + gf.field_b * var8] = var15;
                                  break L11;
                                }
                              }
                              var13++;
                              var11++;
                              continue L9;
                            } else {
                              break L10;
                            }
                          }
                        }
                        var11 = var12;
                        break L8;
                      }
                    } else {
                      break L8;
                    }
                  }
                  var9 = var9 | (var9 << 8 | var9 << 16);
                  gf.f(var10 + param0, var8, var11 + -var10, var9);
                  break L4;
                } else {
                  break L4;
                }
              }
            }
            var7++;
            var8++;
            continue L0;
          }
        }
    }

    void g(byte param0) {
        if (param0 > -100) {
            jl.o(21);
        }
    }

    boolean k(int param0) {
        ((jl) this).n(7489);
        return super.k(0);
    }

    void n(int param0) {
        if (param0 != 7489) {
            return;
        }
        if (!(((jl) this).field_P > 0)) {
            return;
        }
        ((jl) this).b(((jl) this).field_K, ((jl) this).field_T, (byte) -114);
        ((jl) this).field_P = 0;
        ((jl) this).g((byte) -103);
    }

    final static void a(int param0, boolean param1, int param2) {
        int var3 = 0;
        String var4 = null;
        Object var5 = null;
        Object var6 = null;
        CharSequence var7 = null;
        L0: {
          if (param0 == -21) {
            break L0;
          } else {
            jl.a(-51, true, -46);
            break L0;
          }
        }
        L1: {
          if (lg.field_e == null) {
            break L1;
          } else {
            var3 = lg.field_e.a((byte) -83, param1);
            if (var3 != 0) {
              L2: {
                if (var3 != 2) {
                  break L2;
                } else {
                  if (null == lg.field_e.field_z) {
                    break L2;
                  } else {
                    if (!lg.field_e.field_z.equals((Object) (Object) "")) {
                      L3: {
                        if (lg.field_e.field_z.charAt(0) == 91) {
                          var4 = lg.field_e.field_z;
                          break L3;
                        } else {
                          var7 = (CharSequence) (Object) lg.field_e.field_z;
                          int discarded$1 = 1;
                          var4 = ji.a(var7);
                          break L3;
                        }
                      }
                      L4: {
                        var5 = null;
                        if (0 == ia.field_b) {
                          var5 = (Object) (Object) nj.a(var4, param2, (byte) -62);
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      L5: {
                        if (ia.field_b != 1) {
                          break L5;
                        } else {
                          var5 = (Object) (Object) o.a((byte) -88, param2, var4);
                          break L5;
                        }
                      }
                      L6: {
                        if (ia.field_b == 2) {
                          var5 = (Object) (Object) vq.a(2, var4, param2);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      L7: {
                        if (3 != ia.field_b) {
                          break L7;
                        } else {
                          var5 = (Object) (Object) os.a((byte) 117, param2, var4, var4);
                          break L7;
                        }
                      }
                      if (var5 != null) {
                        var6 = null;
                        md.a(2, (String) var5, 0, var4, (String) null, -16169);
                        ia.field_b = -1;
                        lg.field_e = null;
                        break L1;
                      } else {
                        ia.field_b = -1;
                        lg.field_e = null;
                        break L1;
                      }
                    } else {
                      break L2;
                    }
                  }
                }
              }
              ia.field_b = -1;
              lg.field_e = null;
              break L1;
            } else {
              break L1;
            }
          }
        }
    }

    boolean a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        if (0 >= ((jl) this).field_P) {
        } else {
            var2 = ((jl) this).field_T;
            var3 = ((jl) this).field_K;
            int fieldTemp$0 = ((jl) this).field_Q + 1;
            ((jl) this).field_Q = ((jl) this).field_Q + 1;
            if (fieldTemp$0 >= ((jl) this).field_P) {
                ((jl) this).field_P = 0;
                ((jl) this).g((byte) -119);
            } else {
                var4 = (-((jl) this).field_Q + 2 * ((jl) this).field_P) * ((jl) this).field_Q;
                var5 = ((jl) this).field_P * ((jl) this).field_P;
                var3 = var4 * (-((jl) this).field_R + ((jl) this).field_K) / var5 + ((jl) this).field_R;
                var2 = (((jl) this).field_T + -((jl) this).field_L) * var4 / var5 + ((jl) this).field_L;
            }
            ((jl) this).b(var3, var2, (byte) -104);
        }
        var2 = -28;
        return super.a((byte) 88);
    }

    final static int a(nf param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = ho.field_c;
              if (param0.field_n != 2) {
                if (param0.field_n == 4) {
                  var2_int = hd.field_l[param0.field_n];
                  break L1;
                } else {
                  if (~param0.field_p != ~ec.field_p) {
                    var2_int = hd.field_l[param0.field_n];
                    break L1;
                  } else {
                    var2_int = ke.field_q[param0.field_n];
                    break L1;
                  }
                }
              } else {
                if (!param0.field_h) {
                  L2: {
                    if (param0.field_l != 0) {
                      break L2;
                    } else {
                      if (param0.field_e != 0) {
                        break L2;
                      } else {
                        var2_int = ke.field_q[param0.field_n];
                        break L1;
                      }
                    }
                  }
                  var2_int = hd.field_l[param0.field_n];
                  break L1;
                } else {
                  var2_int = ho.field_c;
                  break L1;
                }
              }
            }
            stackOut_15_0 = var2_int;
            stackIn_16_0 = stackOut_15_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var2;
            stackOut_17_1 = new StringBuilder().append("jl.H(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L3;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L3;
            }
          }
          throw r.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ',' + -73 + ')');
        }
        return stackIn_16_0;
    }

    public static void o(int param0) {
        field_O = null;
        field_V = null;
        field_M = null;
        int var1 = -92 % ((-20 - param0) / 63);
        field_W = null;
        field_S = null;
        field_N = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_V = new java.math.BigInteger("6757747274818513864204534133465045479284128469717186816691454417744823753827902036844748836683348383638677747113757906301249837209713747402067689777172847");
        field_O = "<%0>%";
        field_M = new int[16384];
        field_N = "<%highlight>Turn animations</col> provide a brief overview of the events during the previous turn and play at the start of each turn by default. They can be disabled or replayed using the buttons at the <%highlight>bottom-right</col> of the screen.";
        field_U = 4;
    }
}
