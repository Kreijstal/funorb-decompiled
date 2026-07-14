/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class um {
    static String field_e;
    static String field_d;
    static aj field_b;
    static int[][] field_a;
    static String field_c;

    public static void a(int param0) {
        if (param0 != 0) {
          field_b = null;
          field_e = null;
          field_a = null;
          field_d = null;
          field_b = null;
          field_c = null;
          return;
        } else {
          field_e = null;
          field_a = null;
          field_d = null;
          field_b = null;
          field_c = null;
          return;
        }
    }

    final static boolean a(byte param0) {
        if (param0 != -5) {
            return false;
        }
        return sb.field_a;
    }

    final static void a(String param0, java.applet.Applet param1, int param2) {
        try {
            Throwable var3 = null;
            String var4 = null;
            String var5 = null;
            Object var6 = null;
            String var7 = null;
            String var8 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        so.field_g = param0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var7 = param1.getParameter("cookieprefix");
                            var5 = var7;
                            var4 = param1.getParameter("cookiehost");
                            var5 = var4;
                            var8 = var7 + "session=" + param0 + "; version=1; path=/; domain=" + var4;
                            var5 = var8;
                            if (param0.length() == 0) {
                                statePc = 3;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 7;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            var5 = var8;
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 7;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            var5 = var8 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 7;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            ei.a("document.cookie=\"" + var5 + "\"", param1, 269);
                            if (param2 == 13680) {
                                statePc = 8;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 7;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            var6 = null;
                            um.a((String) null, (java.applet.Applet) null, -110);
                            ml.a(-104, param1);
                            return;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 7;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        var3 = caughtException;
                        statePc = 8;
                        continue stateLoop;
                    }
                    case 8: {
                        ml.a(-104, param1);
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
        field_e = "ESC - cancel this line";
        field_d = "Friends";
        field_c = "<%0> would need a rating of <%1> to play with the current options.";
        field_b = new aj(10, 2, 2, 0);
    }
}
