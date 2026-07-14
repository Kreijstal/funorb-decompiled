/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uo {
    static String[] field_e;
    static qh field_f;
    static String field_b;
    static jp field_d;
    static jp[] field_c;
    static String field_a;

    final static tp a(byte param0, mf param1, String param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        var4 = param1.a(param3, false);
        if (param0 != 29) {
          field_a = null;
          var5 = param1.a(var4, -86, param2);
          return lq.a(0, var4, var5, param1);
        } else {
          var5 = param1.a(var4, -86, param2);
          return lq.a(0, var4, var5, param1);
        }
    }

    final static void a(boolean param0, boolean param1) {
        gp.a(param0, param1);
        nk.a((byte) -25, param0);
    }

    final static void a(eg param0, int param1, byte param2) {
        pi var3 = null;
        var3 = k.field_h;
        var3.e(-13413, param1);
        var3.a(58, 5);
        var3.a(param2 ^ -55, 0);
        var3.b((byte) 120, param0.field_l);
        var3.a(-116, param0.field_q);
        var3.a(-99, param0.field_p);
        if (param2 != 68) {
          field_d = null;
          return;
        } else {
          return;
        }
    }

    public static void a(byte param0) {
        field_c = null;
        field_f = null;
        field_b = null;
        if (param0 < 32) {
          uo.a((byte) 51);
          field_d = null;
          field_e = null;
          field_a = null;
          return;
        } else {
          field_d = null;
          field_e = null;
          field_a = null;
          return;
        }
    }

    final static boolean a(java.applet.Applet param0, byte param1) {
        try {
            String var2 = null;
            Throwable var2_ref = null;
            int var3 = 0;
            String var4 = null;
            String[] var5 = null;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int stackIn_8_0 = 0;
            int stackIn_15_0 = 0;
            int stackOut_7_0;
            int stackOut_13_0;
            int stackOut_14_0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var8 = BrickABrac.field_J ? 1 : 0;
                        if (!ni.field_Sb) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        return true;
                    }
                    case 2: {
                        try {
                            var3 = 98 / ((89 - param1) / 35);
                            var2 = "tuhstatbut";
                            var4 = (String) ne.a("getcookies", -126, param0);
                            var5 = qb.a((byte) -103, var4, ';');
                            var6 = 0;
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            if (var5.length <= var6) {
                                statePc = 12;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            var7 = var5[var6].indexOf('=');
                            if ((var7 ^ -1) > -1) {
                                statePc = 9;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if (var5[var6].substring(0, var7).trim().equals((Object) (Object) var2)) {
                                statePc = 7;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            stackOut_7_0 = 1;
                            stackIn_8_0 = stackOut_7_0;
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        return stackIn_8_0 != 0;
                    }
                    case 9: {
                        try {
                            var6++;
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        var2_ref = caughtException;
                        statePc = 12;
                        continue stateLoop;
                    }
                    case 12: {
                        if (null == param0.getParameter("tuhstatbut")) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        stackOut_13_0 = 1;
                        stackIn_15_0 = stackOut_13_0;
                        statePc = 15;
                        continue stateLoop;
                    }
                    case 14: {
                        stackOut_14_0 = 0;
                        stackIn_15_0 = stackOut_14_0;
                        statePc = 15;
                        continue stateLoop;
                    }
                    case 15: {
                        return stackIn_15_0 != 0;
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

    final static boolean a(int param0, byte param1, int[] param2) {
        int var3 = 93 % ((param1 - -19) / 40);
        return 0 == (param2[param0 >> 946699173] & 1 << (31 & param0)) ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
        field_f = new qh();
        field_b = "Aftertouch: flight control.";
        field_a = "Loading levels";
    }
}
