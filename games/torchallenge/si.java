/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class si extends ic {
    static ka[][][] field_I;
    static int field_J;
    static int[] field_L;
    static String field_M;
    static int[] field_H;
    private sl field_G;
    static ka field_F;
    static int[] field_K;

    final void g(byte param0) {
        int var4 = TorChallenge.field_F ? 1 : 0;
        if (param0 != -37) {
            field_L = null;
        }
        nj var2 = new nj(((si) this).field_G);
        b var3 = (b) (Object) var2.c(0);
        while (var3 != null) {
            if (var3.h(124)) {
                var3.a(true);
            }
            var3 = (b) (Object) var2.a(false);
        }
    }

    final static void e(byte param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        ka var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        RuntimeException decompiledCaughtException = null;
        var17 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 125) {
                break L1;
              } else {
                field_K = null;
                break L1;
              }
            }
            var1_int = ba.field_b[1].field_q + ba.field_b[0].field_q + ba.field_b[2].field_q;
            var2 = 3;
            var3 = lg.field_d[var2][8];
            var4 = ef.field_j[0];
            var5 = ef.field_j[1];
            var6 = var4 - var1_int >> 1;
            var7 = var4 - (var1_int + (var6 << 1) - var6);
            var8 = var5 + -var3 >> 1;
            var9 = var8 + -(var8 << 1) + var5 - var3;
            rj.a(2, var2, var3, ba.field_b, var1_int);
            ji.field_p = new ka[9];
            var12 = de.field_a;
            var15 = 0;
            L2: while (true) {
              if (var15 >= 9) {
                la.field_f.a(param0 + -188);
                ll.field_b = -1;
                break L0;
              } else {
                L3: {
                  L4: {
                    var16 = var15;
                    if (var16 != 0) {
                      if (var16 == 2) {
                        break L4;
                      } else {
                        if (var16 == 6) {
                          break L4;
                        } else {
                          if (var16 == 8) {
                            break L4;
                          } else {
                            L5: {
                              if (var16 == 1) {
                                break L5;
                              } else {
                                if (var16 != 7) {
                                  L6: {
                                    if (var16 == 3) {
                                      break L6;
                                    } else {
                                      if (5 != var16) {
                                        if (var16 != 4) {
                                          break L3;
                                        } else {
                                          var13 = var12.field_q;
                                          var14 = var12.field_v;
                                          var1_int = -var7 + (var13 + -var6) - ba.field_b[var15].field_q * 2;
                                          var3 = -(ba.field_b[var15].field_v * 2) + (-var8 + var14 + -var9);
                                          ji.field_p[var15] = new ka(var1_int, var3);
                                          ji.field_p[var15].d();
                                          var3 = ba.field_b[var15].field_v;
                                          var1_int = ba.field_b[var15].field_q;
                                          var10 = -var6 + -var1_int;
                                          var11 = -var3 + -var8;
                                          var12.g(var10, var11);
                                          break L3;
                                        }
                                      } else {
                                        break L6;
                                      }
                                    }
                                  }
                                  L7: {
                                    var14 = var12.field_v;
                                    var1_int = ba.field_b[var15].field_q;
                                    var13 = var12.field_q;
                                    var3 = -var9 + (var14 + -var8 + -(2 * ba.field_b[var15].field_v));
                                    ji.field_p[var15] = new ka(var1_int, var3);
                                    ji.field_p[var15].d();
                                    var3 = ba.field_b[var15].field_v;
                                    if (3 == var15) {
                                      var10 = -var6;
                                      break L7;
                                    } else {
                                      var10 = var7 + (-var13 + var1_int);
                                      break L7;
                                    }
                                  }
                                  var11 = -var3 + -var8;
                                  var12.g(var10, var11);
                                  break L3;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            L8: {
                              var14 = var12.field_v;
                              var13 = var12.field_q;
                              var3 = ba.field_b[var15].field_v;
                              var1_int = -(ba.field_b[var15].field_q * 2) + (-var7 + -var6) + var13;
                              ji.field_p[var15] = new ka(var1_int, var3);
                              ji.field_p[var15].d();
                              var1_int = ba.field_b[var15].field_q;
                              var10 = -var6 - var1_int;
                              if (1 == var15) {
                                var11 = -var8;
                                break L8;
                              } else {
                                var11 = var9 + (-var14 + var3);
                                break L8;
                              }
                            }
                            var12.g(var10, var11);
                            break L3;
                          }
                        }
                      }
                    } else {
                      break L4;
                    }
                  }
                  L9: {
                    L10: {
                      var14 = var12.field_v;
                      var13 = var12.field_q;
                      var1_int = ba.field_b[var15].field_q;
                      var3 = ba.field_b[var15].field_v;
                      ji.field_p[var15] = new ka(var1_int, var3);
                      if (0 == var15) {
                        break L10;
                      } else {
                        if (var15 == 2) {
                          break L10;
                        } else {
                          var11 = var9 + -var14 - -var3;
                          break L9;
                        }
                      }
                    }
                    var11 = -var8;
                    break L9;
                  }
                  L11: {
                    L12: {
                      if (var15 == 0) {
                        break L12;
                      } else {
                        if (var15 == 6) {
                          break L12;
                        } else {
                          var10 = var1_int + -var13 + var7;
                          break L11;
                        }
                      }
                    }
                    var10 = -var6;
                    break L11;
                  }
                  ji.field_p[var15].d();
                  var12.g(var10, var11);
                  break L3;
                }
                var15++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.a((Throwable) (Object) var1, "si.F(" + param0 + ')');
        }
    }

    final void a(int param0, int param1, boolean param2, int param3) {
        int var7 = TorChallenge.field_F ? 1 : 0;
        if (null != ((si) this).field_q) {
            ((si) this).field_q.a((ee) this, param0, param1, (byte) 97, true);
        }
        nj var5 = new nj(((si) this).field_G);
        ee var6 = (ee) (Object) var5.a(-107);
        if (param2) {
            return;
        }
        while (var6 != null) {
            var6.a(((si) this).field_i + param0, ((si) this).field_m + param1, false, param3);
            var6 = (ee) (Object) var5.c((byte) -13);
        }
    }

    final static String h(int param0) {
        if (qc.field_i == gj.field_a) {
            return vb.field_m;
        }
        if (!(eh.field_p != qc.field_i)) {
            return ta.field_zb;
        }
        if (!ji.field_k.b(0)) {
            return ta.field_zb;
        }
        int var1 = -6 % ((78 - param0) / 36);
        return lg.field_b;
    }

    final static vh a(String param0, int param1) {
        RuntimeException var2 = null;
        Object var3 = null;
        vh stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        vh stackOut_6_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              if (param1 >= 22) {
                break L1;
              } else {
                var3 = null;
                si.a(true, (ka[]) null, -120, -97);
                break L1;
              }
            }
            L2: {
              if (!ji.field_k.b(0)) {
                break L2;
              } else {
                if (!param0.equals((Object) (Object) ji.field_k.a(0))) {
                  ji.field_k = og.a(param0, true);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            stackOut_6_0 = ji.field_k;
            stackIn_7_0 = stackOut_6_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var2;
            stackOut_8_1 = new StringBuilder().append("si.S(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    final static void a(boolean param0, ka[] param1, int param2, int param3) {
        try {
            gb.field_f = new h(param1);
            i.field_m = param3;
            mg.field_d = param2;
            rf.m(62);
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) (Object) runtimeException, "si.B(" + true + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final ee c(byte param0) {
        nj var2 = null;
        b var3 = null;
        int var4 = 0;
        L0: {
          var4 = TorChallenge.field_F ? 1 : 0;
          var2 = new nj(((si) this).field_G);
          if (param0 <= -24) {
            break L0;
          } else {
            field_L = null;
            break L0;
          }
        }
        var3 = (b) (Object) var2.c(0);
        L1: while (true) {
          if (var3 != null) {
            if (var3.field_K) {
              return var3.d((byte) 107);
            } else {
              var3 = (b) (Object) var2.a(false);
              continue L1;
            }
          } else {
            return null;
          }
        }
    }

    final static void a(int param0, int[][] param1, int param2, int[][][] param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
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
        var11 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            var7 = 64;
            var9 = 0;
            L1: while (true) {
              if (2 <= var9) {
                la.field_f.a(105);
                break L0;
              } else {
                var10 = 0;
                L2: while (true) {
                  if (var10 > 1) {
                    var9++;
                    continue L1;
                  } else {
                    L3: {
                      sf.field_d[var9][param2][var10].d();
                      qg.a(ae.field_y);
                      var6_int = param3[param2][var10][1] - param3[param2][var10][0];
                      if (var6_int > 0) {
                        qg.a(0, 0, var6_int, var7);
                        var8 = param1[var10][param2];
                        od.a(nj.field_e[var9][var6_int + -1], var8);
                        qg.b(ae.field_y);
                        la.field_f.a(-38);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    var10++;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var6;
            stackOut_13_1 = new StringBuilder().append("si.DA(").append(param0).append(',');
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
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          L5: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param2).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param3 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + param4 + ',' + 1 + ')');
        }
    }

    final void j(int param0) {
        int var4 = TorChallenge.field_F ? 1 : 0;
        nj var2 = new nj(((si) this).field_G);
        b var3 = (b) (Object) var2.c(0);
        while (var3 != null) {
            if (!(!var3.j(1))) {
                var3.a(true);
            }
            var3 = (b) (Object) var2.a(false);
        }
        if (param0 > -38) {
            ((si) this).field_G = null;
        }
        ((si) this).field_A = (ee) (Object) ((si) this).f((byte) 123);
    }

    final b f(byte param0) {
        nj var2 = null;
        b var3 = null;
        int var4 = 0;
        Object var5 = null;
        L0: {
          var4 = TorChallenge.field_F ? 1 : 0;
          var2 = new nj(((si) this).field_G);
          if (param0 == 123) {
            break L0;
          } else {
            var5 = null;
            ((si) this).a((byte) -70, (ee) null);
            break L0;
          }
        }
        var3 = (b) (Object) var2.c(0);
        L1: while (true) {
          if (var3 != null) {
            if (var3.field_K) {
              return var3;
            } else {
              var3 = (b) (Object) var2.a(false);
              continue L1;
            }
          } else {
            return null;
          }
        }
    }

    final static String a(boolean param0, int param1, boolean param2, boolean param3) {
        int var4 = 0;
        if (!(!param3)) {
            var4 += 4;
        }
        if (!(!param2)) {
            var4 += 2;
        }
        if (param1 != 8586514) {
            String discarded$0 = si.a(false, 58, false, false);
        }
        return ii.field_g[var4];
    }

    public static void d(byte param0) {
        field_K = null;
        int var1 = 0;
        field_H = null;
        field_I = null;
        field_F = null;
        field_M = null;
        field_L = null;
    }

    final void i(int param0) {
        int var4 = TorChallenge.field_F ? 1 : 0;
        nj var2 = new nj(((si) this).field_G);
        b var3 = (b) (Object) var2.c(0);
        while (var3 != null) {
            var3.field_K = false;
            var3 = (b) (Object) var2.a(false);
        }
        ((si) this).field_A = null;
        if (param0 != 8389905) {
            si.e((byte) 49);
        }
    }

    final void a(byte param0, ee param1) {
        b var3 = null;
        if (param0 < 52) {
            return;
        }
        try {
            if (!(param1 instanceof b)) {
                throw new IllegalArgumentException();
            }
            var3 = (b) (Object) param1;
            ((si) this).field_G.a((byte) 119, (da) (Object) var3);
            var3.field_K = true;
            boolean discarded$0 = var3.a((ee) this, 0);
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) (Object) runtimeException, "si.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public si() {
        super(0, 0, TorChallenge.field_G, md.field_h, (j) null, (gg) null);
        ((si) this).field_G = new sl();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = new int[]{6882317, 8389905, 8586514, 6882317};
        field_L = new int[2];
        field_M = "Start Game";
        field_K = new int[8192];
    }
}
