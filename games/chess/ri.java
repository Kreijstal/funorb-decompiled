/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ri extends jb implements ha, we {
    static int field_i;
    bf field_j;
    static int field_g;
    static ci field_k;
    static String field_h;

    final String d(int param0) {
        int var2_int = 0;
        NumberFormatException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String stackIn_6_0 = null;
        Object stackIn_9_0 = null;
        Throwable decompiledCaughtException = null;
        String stackOut_5_0 = null;
        Object stackOut_8_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (param0 > 40) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return null;
                }
                case 2: {
                    try {
                        var2_int = ((ri) this).field_j.c(false);
                        var3 = ((ri) this).field_j.h(-1);
                        var4 = ((ri) this).field_j.i(93);
                        var5 = ca.a(13421568);
                        if (1890 > var4) {
                            statePc = 5;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (var4 > -3 + var5) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackOut_5_0 = oc.a(od.field_X, new String[2], (byte) -59);
                        stackIn_6_0 = stackOut_5_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 6: {
                    return (String) (Object) stackIn_6_0;
                }
                case 7: {
                    try {
                        if (!tn.a(var2_int, var3, -25042, var4)) {
                            statePc = 11;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackOut_8_0 = null;
                        stackIn_9_0 = stackOut_8_0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 9: {
                    return (String) (Object) stackIn_9_0;
                }
                case 10: {
                    var2 = (NumberFormatException) (Object) caughtException;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    return oj.field_g;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void g(int param0) {
        jh.field_e.i(0);
        if (mk.field_e != null) {
          jh.field_e.b((mf) (Object) mk.field_e, (byte) -65);
          if (param0 <= 119) {
            field_h = null;
            return;
          } else {
            return;
          }
        } else {
          mk.field_e = new ch(jh.field_e, qf.field_g);
          jh.field_e.b((mf) (Object) mk.field_e, (byte) -65);
          if (param0 > 119) {
            return;
          } else {
            field_h = null;
            return;
          }
        }
    }

    final mk e(int param0) {
        int var2_int = 0;
        NumberFormatException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        mk stackIn_5_0 = null;
        mk stackIn_8_0 = null;
        mk stackIn_11_0 = null;
        Throwable decompiledCaughtException = null;
        mk stackOut_4_0 = null;
        mk stackOut_7_0 = null;
        mk stackOut_10_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        var2_int = ((ri) this).field_j.c(false);
                        var3 = ((ri) this).field_j.h(-1);
                        var4 = ((ri) this).field_j.i(110);
                        var5 = ca.a(13421568);
                        if (param0 == 4) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        var6 = null;
                        ((ri) this).a((qn) null, -75);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (-1891 < (var4 ^ -1)) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackOut_4_0 = qk.field_b;
                        stackIn_5_0 = stackOut_4_0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 5: {
                    return (mk) (Object) stackIn_5_0;
                }
                case 6: {
                    try {
                        if (var4 <= var5 + -3) {
                            statePc = 9;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackOut_7_0 = qk.field_b;
                        stackIn_8_0 = stackOut_7_0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return (mk) (Object) stackIn_8_0;
                }
                case 9: {
                    try {
                        if (tn.a(var2_int, var3, param0 + -25046, var4)) {
                            statePc = 13;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackOut_10_0 = qk.field_b;
                        stackIn_11_0 = stackOut_10_0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 11: {
                    return (mk) (Object) stackIn_11_0;
                }
                case 12: {
                    var2 = (NumberFormatException) (Object) caughtException;
                    return qk.field_b;
                }
                case 13: {
                    return oa.field_a;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void h(int param0) {
        if (param0 != 1) {
            um discarded$0 = ri.a(94, (byte) 26);
            field_k = null;
            field_h = null;
            return;
        }
        field_k = null;
        field_h = null;
    }

    public final boolean b(int param0) {
        if (param0 != 14496) {
            return false;
        }
        return ((ri) this).field_j.h((byte) -123);
    }

    final static void a(int param0, pa param1, int param2) {
        nk var3 = null;
        var3 = qn.field_U;
        var3.f(param2, -106);
        var3.c(2, (byte) -56);
        var3.c(0, (byte) -112);
        if (param0 != -1281) {
          field_g = 45;
          var3.c(param1.field_p, (byte) 78);
          return;
        } else {
          var3.c(param1.field_p, (byte) 78);
          return;
        }
    }

    public final void b(qn param0, int param1) {
        if (param1 != 3) {
            field_i = -5;
        }
    }

    public ri() {
    }

    public final void a(qn param0, int param1) {
        if (param1 != 10999) {
            return;
        }
        ((ri) this).b(true);
    }

    final static um a(int param0, byte param1) {
        if (param1 < 126) {
            return null;
        }
        return ci.a(-17288, param0, 1, false, false, true);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Exploiting a bug";
    }
}
