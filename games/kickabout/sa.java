/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sa extends java.awt.Canvas {
    static String[] field_c;
    private java.awt.Component field_b;
    static bu field_a;
    static String[] field_d;
    static int field_e;

    public final void update(java.awt.Graphics param0) {
        ((sa) this).field_b.update(param0);
    }

    public static void a(byte param0) {
        if (param0 < 106) {
            return;
        }
        field_a = null;
        field_c = null;
        field_d = null;
    }

    final static String a(java.applet.Applet param0, byte param1) {
        try {
            Throwable var2 = null;
            String var3 = null;
            String var4 = null;
            String[] var5 = null;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            String var10 = null;
            String stackIn_7_0 = null;
            String stackOut_6_0 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var9 = Kickabout.field_G;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var10 = param0.getParameter("cookieprefix");
                            var3 = var10 + "settings";
                            var4 = (String) mm.a(30858, "getcookies", param0);
                            var5 = wr.a(var4, 2, ';');
                            var6 = 0;
                            var7 = 35 % ((param1 - 32) / 57);
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            if (var6 >= var5.length) {
                                statePc = 11;
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
                            var8 = var5[var6].indexOf('=');
                            if ((var8 ^ -1) > -1) {
                                statePc = 8;
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
                            if (var5[var6].substring(0, var8).trim().equals((Object) (Object) var3)) {
                                statePc = 6;
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
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            stackOut_6_0 = var5[var6].substring(var8 - -1).trim();
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
                        return stackIn_7_0;
                    }
                    case 8: {
                        try {
                            var6++;
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        var2 = caughtException;
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 11: {
                        if (wk.field_b == null) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        return wk.field_b;
                    }
                    case 13: {
                        return param0.getParameter("settings");
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

    sa(java.awt.Component param0) {
        ((sa) this).field_b = param0;
    }

    public final void paint(java.awt.Graphics param0) {
        ((sa) this).field_b.paint(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new String[]{"Press the spacebar to sprint.", "Press 'CTRL' to sprint."};
        tf discarded$0 = new tf();
        field_d = new String[]{"Modern", "Old School"};
    }
}
