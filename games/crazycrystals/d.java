/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class d {
    static ko[] field_b;
    static int[] field_a;
    static dl[] field_c;

    final static void a(java.applet.Applet param0, byte param1, String param2) {
        try {
            Throwable throwable = null;
            String var3 = null;
            String var4 = null;
            String var5 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        hm.field_c = param2;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var3 = param0.getParameter("cookieprefix");
                            var5 = var3;
                            var5 = var3;
                            var4 = param0.getParameter("cookiehost");
                            var5 = var4;
                            var5 = var4;
                            var5 = var3 + "session=" + param2 + "; version=1; path=/; domain=" + var4;
                            if (0 != param2.length()) {
                                statePc = 3;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 5;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            var5 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 5;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            hi.a("document.cookie=\"" + var5 + "\"", param0, (byte) 77);
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 5;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        throwable = caughtException;
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 6: {
                        if (param1 <= 110) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        hk.a(1, param0);
                        return;
                    }
                    case 8: {
                        return;
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

    final static void a(byte param0, boolean param1) {
        qe.field_g.a((byte) -80, 0, 0);
        int var2 = 51 % ((param0 - 10) / 47);
    }

    public static void a(int param0) {
        field_c = null;
        field_b = null;
        field_a = null;
        if (param0 != -8130) {
            Object var2 = null;
            d.a((java.applet.Applet) null, (byte) -76, (String) null);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new ko[7];
        field_a = new int[8192];
    }
}
