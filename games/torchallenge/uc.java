/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uc extends ng {
    int field_S;
    int field_P;
    int field_V;
    static int field_X;
    static String field_T;
    static String field_R;
    static int field_Y;
    int field_O;
    int field_Q;
    int field_W;
    static int field_U;

    final static void a(ej param0, int param1, boolean param2, int param3) {
        Object var4 = null;
        Throwable var5 = null;
        Object var6 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (la.field_d != null) {
                        statePc = 2;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 2: {
                    ac.a(false, param3, param0, param2, 1048576);
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (la.field_a != null) {
                        statePc = 5;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var4 = (Object) (Object) bh.field_o;
                    // monitorenter bh.field_o
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    try {
                        la.field_a.a(param1 + 298, param3, -1);
                        if (tg.field_t == param0) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        // monitorexit var4
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 9: {
                    return;
                }
                case 10: {
                    try {
                        la.field_a.b((byte) 31);
                        bh.field_o.g();
                        tg.field_t = param0;
                        if (tg.field_t != null) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        la.field_a.a(-8126, tg.field_t, param2);
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        // monitorexit var4
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var5 = caughtException;
                        // monitorexit var4
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 16: {
                    throw (RuntimeException) (Object) var5;
                }
                case 17: {
                    if (param1 == -3560) {
                        statePc = 19;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    var6 = null;
                    uc.a((ej) null, 88, true, 73);
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(int param0) {
        field_R = null;
        field_T = null;
        if (param0 != -15087) {
            field_R = null;
        }
    }

    final static ja[] a(int param0, uj param1) {
        int var5 = 0;
        ja var6 = null;
        int var7 = TorChallenge.field_F ? 1 : 0;
        if (!param1.a((byte) -81)) {
            return new ja[]{};
        }
        mi var8 = param1.a(5);
        while (var8.field_d == 0) {
            c.a(46, 10L);
        }
        if (param0 >= -75) {
            uc.a(-124);
        }
        if (!(2 != var8.field_d)) {
            return new ja[]{};
        }
        int[] var12 = (int[]) var8.field_g;
        int[] var11 = var12;
        int[] var10 = var11;
        int[] var9 = var10;
        int[] var3 = var9;
        ja[] var4 = new ja[var12.length >> -414448606];
        for (var5 = 0; var5 < var4.length; var5++) {
            var6 = new ja();
            var4[var5] = var6;
            var6.field_h = var3[var5 << 1565342690];
            var6.field_d = var3[1 + (var5 << -1116581534)];
            var6.field_i = var3[(var5 << -1599941118) + 2];
            var6.field_c = var3[(var5 << -1319862270) + 3];
        }
        return var4;
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, int param5, ee param6) {
        int var8 = 0;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = TorChallenge.field_F ? 1 : 0;
        if (super.a(param0, param1, param2, param3, param4, param5, param6)) {
            var8 = -param4 - (((uc) this).field_m - -((uc) this).field_S - param1);
            var9 = -((uc) this).field_W + -param3 + (-((uc) this).field_i + param0);
            if (var8 * var8 + var9 * var9 < ((uc) this).field_V * ((uc) this).field_V) {
                var10 = Math.atan2((double)var9, (double)var8) - gb.field_a;
                if (0.0 <= var10) {
                    // ifle L143
                    var10 = var10 + 3.141592653589793 / (double)((uc) this).field_Q;
                } else {
                    var10 = var10 - 3.141592653589793 / (double)((uc) this).field_Q;
                }
                ((uc) this).field_P = (int)(var10 * (double)((uc) this).field_Q / 6.283185307179586);
                while (((uc) this).field_Q <= ((uc) this).field_P) {
                    ((uc) this).field_P = ((uc) this).field_P - ((uc) this).field_Q;
                }
                while (((uc) this).field_P < 0) {
                    ((uc) this).field_P = ((uc) this).field_P + ((uc) this).field_Q;
                }
            }
            return true;
        }
        return false;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, boolean param8, int param9) {
        int var10 = 0;
        int var11 = 0;
        fe var12 = null;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        L0: {
          var10 = qk.a(param4, param1, param2, param5, 120, param3, param7, param6);
          if (param8) {
            break L0;
          } else {
            field_T = null;
            break L0;
          }
        }
        L1: {
          stackOut_2_0 = param6;
          stackIn_4_0 = stackOut_2_0;
          stackIn_3_0 = stackOut_2_0;
          if (param8) {
            stackOut_4_0 = stackIn_4_0;
            stackOut_4_1 = 0;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            break L1;
          } else {
            stackOut_3_0 = stackIn_3_0;
            stackOut_3_1 = 1;
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            break L1;
          }
        }
        L2: {
          var11 = bj.a(stackIn_5_0, stackIn_5_1 != 0, param3, param2, param1);
          if (0 == var10) {
            break L2;
          } else {
            if (-1 >= (var11 ^ -1)) {
              L3: {
                if (!hc.field_Q) {
                  hc.field_Q = true;
                  var12 = ia.field_i[param4][dg.field_T[4]][0];
                  var12.field_l = var12.field_k.length;
                  ki.field_d = nc.a(var12, 100, var10, var11);
                  ki.field_d.e(-1);
                  ki.field_d.e(0, var12.field_k.length);
                  e discarded$2 = we.a(ki.field_d, 6222);
                  nj.field_g = var10;
                  lh.field_s = param0;
                  ub.field_n = param9;
                  break L3;
                } else {
                  break L3;
                }
              }
              return;
            } else {
              break L2;
            }
          }
        }
        sd.a(127);
    }

    private uc() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_X = -1;
        field_T = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
        field_R = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
    }
}
