/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gg {
    static dg field_b;
    static sh field_d;
    static db[] field_a;
    static String field_c;

    public static void a(boolean param0) {
        if (!param0) {
          gg.a(true);
          field_c = null;
          field_b = null;
          field_d = null;
          field_a = null;
          return;
        } else {
          field_c = null;
          field_b = null;
          field_d = null;
          field_a = null;
          return;
        }
    }

    final static void a(boolean param0, java.applet.Applet param1, String param2) {
        try {
            Throwable throwable = null;
            String var3 = null;
            String var4 = null;
            String var5 = null;
            int stackIn_9_0 = 0;
            int stackOut_7_0 = 0;
            int stackOut_8_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        ta.field_d = param2;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var3 = param1.getParameter("cookieprefix");
                            var5 = var3;
                            var5 = var3;
                            var4 = param1.getParameter("cookiehost");
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
                            oa.a("document.cookie=\"" + var5 + "\"", param1, -30196);
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
                        if (param0) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        stackOut_7_0 = 1;
                        stackIn_9_0 = stackOut_7_0;
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 8: {
                        stackOut_8_0 = 0;
                        stackIn_9_0 = stackOut_8_0;
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        vg.a(stackIn_9_0 != 0, param1);
                        if (!param0) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 10: {
                        return;
                    }
                    case 11: {
                        gg.a(false);
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new dg();
        field_c = "Checking";
    }
}
