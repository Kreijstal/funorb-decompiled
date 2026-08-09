/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bm extends gj implements da {
    private bb[] field_F;
    private bd field_L;
    private String field_H;
    static int field_K;
    static String field_N;
    private fa field_G;
    static int field_M;
    private int[] field_I;
    private int field_J;

    public final void a(int param0, int param1, int param2, int param3, bb param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            if (param3 == 248) {
              var6_int = 0;
              L1: while (true) {
                L2: {
                  if (var6_int >= this.field_J) {
                    break L2;
                  } else {
                    if (var8 == 0) {
                      L3: {
                        if (this.field_F[var6_int] != param4) {
                          break L3;
                        } else {
                          L4: {
                            var7 = this.field_I[var6_int];
                            if (0 != (var7 ^ -1)) {
                              break L4;
                            } else {
                              this.field_L.n(-22645);
                              if (var8 == 0) {
                                break L2;
                              } else {
                                break L4;
                              }
                            }
                          }
                          cg.a((byte) -105, this.field_I[var6_int]);
                          if (var8 == 0) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                      var6_int++;
                      if (var8 == 0) {
                        continue L1;
                      } else {
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var6);

            stackIn_18_1 = new StringBuilder().append("bm.JA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(int param0, int param1) {
        int var6 = fleas.field_A ? 1 : 0;
        if (this.field_J >= param1) {
            return;
        }
        bb[] var7 = new bb[param1];
        bb[] var8 = var7;
        bb[] var3 = var8;
        int[] var4 = new int[param1];
        int var5 = param0;
        do {
            if (this.field_J <= var5) {
                this.field_F = var8;
                this.field_I = var4;
                this.field_J = param1;
                return;
            }
            var7[var5] = this.field_F[var5];
            var4[var5] = this.field_I[var5];
            var5++;
            if (var6 != 0) {
                return;
            }
        } while (var6 == 0);
        this.field_F = var8;
        this.field_I = var4;
        this.field_J = param1;
    }

    public static void c(boolean param0) {
        if (param0) {
            field_N = (String) null;
            field_N = null;
            return;
        }
        field_N = null;
    }

    final bb a(kd param0, boolean param1, String param2) {
        bb var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        bb stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4 = new bb(param2, param0);
              var4.field_p = (ch) ((Object) new ri());
              if (param1) {
                break L1;
              } else {
                this.field_G = (fa) null;
                break L1;
              }
            }
            var5 = this.field_j - 2;
            this.a(0, this.field_u, 0, this.field_j + 34, 80);
            var4.a(7, this.field_u - 14, var5, 30, 80);
            this.a((qa) (var4), (byte) -32);
            stackIn_3_0 = (bb) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4_ref);

            stackIn_6_1 = new StringBuilder().append("bm.GA(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    final static ll a(boolean param0, int param1, int param2, int param3, int param4) {
        ll var5;
        int var6;
        int stackIn_5_0 = 0;
        var6 = fleas.field_A ? 1 : 0;
        var5 = (ll) ((Object) jj.field_S.c((byte) 47));
        L0: while (true) {
          if (var5 != null) {
            stackIn_5_0 = var5.field_k;

            if (var6 == 0) {
              if (stackIn_5_0 == param4) {
                return var5;
              } else {
                var5 = (ll) ((Object) jj.field_S.b((byte) -105));
                if (var6 == 0) {
                  continue L0;
                } else {
                  var5 = new ll();
                  var5.field_k = param4;
                  var5.field_t = param2;
                  var5.field_q = param3;
                  jj.field_S.a(param0, var5);
                  ak.a(-14722, var5, param1);
                  return var5;
                }
              }
            } else {
              ak.a(stackIn_5_0, var5, param1);
              return var5;
            }
          } else {
            var5 = new ll();
            var5.field_k = param4;
            var5.field_t = param2;
            var5.field_q = param3;
            jj.field_S.a(param0, var5);
            ak.a(-14722, var5, param1);
            return var5;
          }
        }
    }

    final static int f(byte param0) {
        if (param0 <= 8) {
            bm.c(true);
            return (int)(1000000000L / na.field_f);
        }
        return (int)(1000000000L / na.field_f);
    }

    final static void e(byte param0) {
        int statePc = 0;
        Throwable caughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = fleas.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 == 31) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        bm.c(false);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var1_int = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var1_int >= qi.field_f) {
                            statePc = 25;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var3 = rk.field_u[var1_int];
                        var4 = kk.field_a[var1_int];
                        var2 = -1 + var3;
                        var8 = 16 * var4 + 16;
                        var7 = 16 * var3 + 20;
                        var6 = var4 * 16;
                        if (var9 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        return;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (-15 == (fl.field_c[var3][var4] ^ -1)) {
                            statePc = 11;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (fl.field_c[var3][var4] != 28) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        me.field_i[var1_int] = 1;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var5 = var3 * 16;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (!qg.a(fl.field_c[var2][var4], -48)) {
                            statePc = 16;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var5 -= 16;
                        var2--;
                        if (var9 != 0) {
                            statePc = 17;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var9 == 0) {
                            statePc = 12;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var2 = var3 - -1;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (!qg.a(fl.field_c[var2][var4], -117)) {
                            statePc = 21;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var2++;
                        var7 += 16;
                        if (var9 != 0) {
                            statePc = 22;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (var9 == 0) {
                            statePc = 17;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        oa.field_m[var1_int] = var5;
                        uh.field_n[var1_int] = var6;
                        lc.field_v[var1_int] = var7;
                        ca.field_G[var1_int] = var8;
                        var1_int++;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (var9 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 24: {
                    var1 = (RuntimeException) ((Object) caughtException);
                    throw pf.a((Throwable) ((Object) var1), "bm.EA(" + param0 + ')');
                }
                case 25: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(String param0, int param1, int param2) {
        int var4_int = 0;
        try {
            var4_int = this.field_J;
            this.a(param1 ^ param1, 1 + var4_int);
            this.field_F[var4_int] = this.a((kd) (this), true, param0);
            this.field_I[var4_int] = param2;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "bm.FA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    bm(bd param0, fa param1, String param2) {
        super(0, 0, 288, 0, (ch) null);
        int var4_int = 0;
        this.field_J = 0;
        try {
            this.field_G = param1;
            this.field_H = param2;
            this.field_L = param0;
            var4_int = null == this.field_H ? 0 : this.field_G.b(this.field_H, 260, this.field_G.field_H);
            this.a(0, 288, 0, var4_int + 22, 80);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "bm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0, int param1, boolean param2, int param3) {
        super.b(param0, param1, param2, param3);
        this.field_G.a(this.field_H, 14 + param1 + this.field_y, param0 + (this.field_z + 10), -28 + this.field_u, this.field_j, 16777215, -1, 0, 0, this.field_G.field_H);
    }

    static {
        field_N = "To server list";
    }
}
