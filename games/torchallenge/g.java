/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class g implements j {
    private int field_h;
    private int field_b;
    private int field_e;
    private int field_d;
    private int field_f;
    private int field_g;
    private eg field_a;
    static ka[][][] field_i;
    private int field_c;

    final static String a(String param0, byte param1, java.applet.Applet param2) {
        try {
            int var3 = 0;
            String var4 = null;
            Throwable var4_ref = null;
            String[] var5 = null;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            String stackIn_6_0 = null;
            String stackOut_5_0 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var8 = TorChallenge.field_F ? 1 : 0;
                        var3 = -68 % ((param1 - -48) / 58);
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var4 = (String) ff.a("getcookies", param2, 20511);
                            var5 = dl.a(var4, ';', -75);
                            var6 = 0;
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            if (var5.length <= var6) {
                                statePc = 10;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            var7 = var5[var6].indexOf('=');
                            if (-1 < (var7 ^ -1)) {
                                statePc = 7;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            if (!var5[var6].substring(0, var7).trim().equals((Object) (Object) param0)) {
                                statePc = 7;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            stackOut_5_0 = var5[var6].substring(var7 - -1).trim();
                            stackIn_6_0 = stackOut_5_0;
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        return stackIn_6_0;
                    }
                    case 7: {
                        try {
                            var6++;
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        var4_ref = caughtException;
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        return null;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_i = null;
        if (param0 != 28215) {
            field_i = null;
        }
    }

    final static boolean a(int param0, int param1) {
        int stackIn_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        if (param0 > 76) {
          if (-1 == param1) {
            return true;
          } else {
            L0: {
              if (0 == (1 << param1 & lb.field_s)) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                break L0;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L0;
              }
            }
            return stackIn_6_0 != 0;
          }
        } else {
          return true;
        }
    }

    public final void a(ee param0, int param1, int param2, byte param3, boolean param4) {
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        uc var14 = null;
        ee stackIn_3_0 = null;
        ee stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        L0: {
          if (param0 instanceof uc) {
            stackOut_2_0 = (ee) param0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = null;
            stackIn_3_0 = (ee) (Object) stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var14 = (uc) (Object) stackIn_3_0;
          qg.f(param0.field_m + param2, param1 + param0.field_i, param0.field_p, param0.field_l, ((g) this).field_c);
          if (var14 != null) {
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          var7 = var14.field_S + param0.field_m + param2;
          var8 = param1 + (param0.field_i + var14.field_W);
          qg.e(var7, var8, var14.field_V, ((g) this).field_d);
          if (0 != (var14.field_O ^ -1)) {
            var9 = 3.141592653589793 * (double)var14.field_O * 2.0 / (double)var14.field_Q;
            var11 = (int)(-Math.sin(var9) * (double)var14.field_V);
            var12 = (int)(Math.cos(var9) * (double)var14.field_V);
            qg.e(var11 + var7, var8 - -var12, 1, ((g) this).field_h);
            break L2;
          } else {
            break L2;
          }
        }
        qg.e(var7, var8, 2, 1);
        var9 = 2.0 * ((double)var14.field_P * 3.141592653589793) / (double)var14.field_Q;
        if (param3 != 97) {
          L3: {
            ((g) this).field_d = 76;
            var11 = (int)(-Math.sin(var9) * (double)var14.field_V);
            var12 = (int)(Math.cos(var9) * (double)var14.field_V);
            qg.d(var7, var8, var7 - -var11, var12 + var8, 1);
            if (((g) this).field_a == null) {
              break L3;
            } else {
              var13 = var14.field_V + var14.field_S + ((g) this).field_g;
              int discarded$2 = ((g) this).field_a.a(param0.field_v, var13 + (param0.field_m + param2), ((g) this).field_f + (param1 + param0.field_i), -((g) this).field_g + (-var13 + param0.field_p), -(((g) this).field_g << -571272767) + param0.field_l, ((g) this).field_e, ((g) this).field_b, 1, 1, 0);
              break L3;
            }
          }
          return;
        } else {
          L4: {
            var11 = (int)(-Math.sin(var9) * (double)var14.field_V);
            var12 = (int)(Math.cos(var9) * (double)var14.field_V);
            qg.d(var7, var8, var7 - -var11, var12 + var8, 1);
            if (((g) this).field_a == null) {
              break L4;
            } else {
              var13 = var14.field_V + var14.field_S + ((g) this).field_g;
              int discarded$3 = ((g) this).field_a.a(param0.field_v, var13 + (param0.field_m + param2), ((g) this).field_f + (param1 + param0.field_i), -((g) this).field_g + (-var13 + param0.field_p), -(((g) this).field_g << -571272767) + param0.field_l, ((g) this).field_e, ((g) this).field_b, 1, 1, 0);
              break L4;
            }
          }
          return;
        }
    }

    g(eg param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        ((g) this).field_g = param1;
        ((g) this).field_f = param2;
        ((g) this).field_a = param0;
        ((g) this).field_b = param4;
        ((g) this).field_c = param7;
        ((g) this).field_h = param6;
        ((g) this).field_d = param5;
        ((g) this).field_e = param3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new ka[16][3][];
    }
}
