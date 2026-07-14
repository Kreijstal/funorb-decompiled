/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sc {
    static String field_e;
    static hl field_a;
    static int[] field_d;
    static String field_c;
    static int field_b;

    final static void a(hl param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var9 = -param6 + param3 + (param0.field_w - -param5);
          var10 = param4 + (param0.field_w + param3 + param5);
          if (param1 == 14432) {
            break L0;
          } else {
            sc.a((hl) null, -46, 99, -84, -72, -58, -75, 1, -19);
            break L0;
          }
        }
        var11 = (param0.field_v >> -1182781471) + param0.field_y + param7;
        ki.c(var9, 0, var10, var11 - -param8);
        param0.f(param3 - 1, param7 + -1, param2);
        param0.f(param3 - 1, 1 + param7, param2);
        ki.b(wc.field_b);
        ki.c(1 + var9, 0, 1 + var10, var11 + param8);
        param0.f(param3 - -1, -1 + param7, param2);
        param0.f(param3 - -1, 1 + param7, param2);
        ki.b(wc.field_b);
        var10 = -param6 + param0.field_u + (param0.field_w - -param3) + -param5;
        var9 = param0.field_w + (param0.field_u - -param3 - (param5 + param4));
        ki.c(var9, -param8 + var11, var10, 480);
        param0.f(-1 + param3, -1 + param7, param2);
        param0.f(-1 + param3, param7 - -1, param2);
        ki.b(wc.field_b);
        ki.c(var9 + 1, -param8 + var11, var10 - -1, 480);
        param0.f(param3 - -1, -1 + param7, param2);
        param0.f(param3 + 1, param7 + 1, param2);
        ki.b(wc.field_b);
    }

    final static void a(boolean param0, byte param1, String param2) {
        if (param1 <= 91) {
            field_c = null;
        }
        s.field_c = true;
        vj.field_V = param0 ? true : false;
        fa.field_G = new ph(ti.field_b, tk.field_a, param2, tc.field_x, vj.field_V);
        ti.field_b.a((byte) 85, (uj) (Object) fa.field_G);
    }

    public static void a(int param0) {
        field_e = null;
        field_d = null;
        if (param0 != 0) {
            field_c = null;
        }
        field_a = null;
        field_c = null;
    }

    final static void a(int param0, int param1) {
        ia var2 = d.field_b;
        var2.d((byte) 28, param1);
        var2.a(1, -63);
        if (param0 != 32395) {
            return;
        }
        var2.a(0, param0 ^ -32447);
    }

    final static void a(int param0, int[] param1, int param2, int param3) {
        kh.a(param1, 120, 0, ki.field_a, 0, 0, 0, param0, 160, 1920, -93, 0);
        nb.a(0, 0, 0, ki.field_a, 0, 16384, 0, param2, 120, 160);
        if (param3 != 30603) {
            Object var5 = null;
            sc.a(true, (byte) -89, (String) null);
        }
    }

    final static boolean a(java.applet.Applet param0, boolean param1) {
        try {
            String var2 = null;
            Throwable var2_ref = null;
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int stackIn_8_0 = 0;
            int stackIn_15_0 = 0;
            int stackOut_7_0 = 0;
            int stackOut_13_0 = 0;
            int stackOut_14_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (ve.field_d) {
                            statePc = 2;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        return true;
                    }
                    case 3: {
                        try {
                            var2 = "tuhstatbut";
                            var3 = (String) mb.a(param0, "getcookies", param1);
                            var4 = uj.a(-57, ';', var3);
                            var5 = 0;
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            if (var5 >= var4.length) {
                                statePc = 12;
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
                            var6 = var4[var5].indexOf('=');
                            if (var6 < 0) {
                                statePc = 9;
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
                            if (!var4[var5].substring(0, var6).trim().equals((Object) (Object) var2)) {
                                statePc = 9;
                            } else {
                                statePc = 7;
                            }
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
                            var5++;
                            statePc = 4;
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
        field_d = new int[8192];
        field_c = null;
    }
}
