/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vh extends me {
    static int field_m;
    static int field_n;
    static ti field_l;
    static String field_j;
    static String field_k;

    final static boolean a(java.applet.Applet param0, int param1) {
        try {
            String var2 = null;
            Throwable var2_ref = null;
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int stackIn_7_0 = 0;
            int stackIn_14_0 = 0;
            int stackOut_6_0 = 0;
            int stackOut_12_0 = 0;
            int stackOut_13_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var7 = Transmogrify.field_A ? 1 : 0;
                        if (!fl.field_c) {
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
                            var2 = "tuhstatbut";
                            var3 = (String) kj.a(param0, false, "getcookies");
                            var4 = vi.a(';', var3, 0);
                            var5 = param1;
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            if (var5 >= var4.length) {
                                statePc = 11;
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
                            var6 = var4[var5].indexOf('=');
                            if ((var6 ^ -1) > -1) {
                                statePc = 8;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if (!var4[var5].substring(0, var6).trim().equals((Object) (Object) var2)) {
                                statePc = 8;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            stackOut_6_0 = 1;
                            stackIn_7_0 = stackOut_6_0;
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        return stackIn_7_0 != 0;
                    }
                    case 8: {
                        try {
                            var5++;
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        var2_ref = caughtException;
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 11: {
                        if (param0.getParameter("tuhstatbut") == null) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        stackOut_12_0 = 1;
                        stackIn_14_0 = stackOut_12_0;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 13: {
                        stackOut_13_0 = 0;
                        stackIn_14_0 = stackOut_13_0;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 14: {
                        return stackIn_14_0 != 0;
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

    final rc a(int param0, String param1) {
        int var3 = tl.a(param1, 2993) == null ? 1 : 0;
        if (param0 != 95) {
            return null;
        }
        if (var3 == 0) {
            return ec.field_d;
        }
        return hi.field_b;
    }

    final String b(int param0, String param1) {
        if (!(((vh) this).a(95, param1) != ec.field_d)) {
            return uc.field_c;
        }
        if (param0 != -1) {
            field_n = 50;
        }
        return wj.field_i;
    }

    public static void b(byte param0) {
        field_l = null;
        field_k = null;
        field_j = null;
        int var1 = 57 / ((-83 - param0) / 34);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, boolean param5) {
        ba.field_q[cg.field_l] = param4;
        lk.field_d[cg.field_l] = cg.field_l;
        dk.field_k[cg.field_l] = param0;
        if (param0 < ua.field_d) {
            ue.field_a = param0;
        }
        if (!(param0 <= rc.field_c)) {
            vb.field_a = param0;
        }
        bh.field_a[cg.field_l] = param3;
        pd.field_a[cg.field_l] = param2;
        bg.field_j[cg.field_l] = param1;
        int var6 = param2 + param3 + param1;
        if (param5) {
            vh.a(59, 57, -75, 24, 38, false);
        }
        int var7 = var6 == 0 ? 0 : param3 * 1000 / var6;
        tb.field_d[cg.field_l] = var7;
        cg.field_l = cg.field_l + 1;
        if (!(vb.field_a >= var7)) {
            vb.field_a = var7;
        }
        if (var7 < ue.field_a) {
            ue.field_a = var7;
        }
    }

    vh(rg param0) {
        super(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = 0;
        field_j = "Start Game";
        field_k = "Unpacking languages";
    }
}
