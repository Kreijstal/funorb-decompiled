/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class q {
    byte[] field_c;
    int field_e;
    byte[] field_f;
    int field_k;
    int field_a;
    int field_d;
    static String field_l;
    static int field_b;
    int field_i;
    int field_h;
    static String field_g;
    int field_j;

    public static void a(boolean param0) {
        field_g = null;
        if (param0) {
            return;
        }
        field_l = null;
    }

    final static void a(int param0, java.applet.Applet param1, String param2) {
        try {
            Throwable throwable = null;
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
                        pa.field_f = param2;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var7 = param1.getParameter("cookieprefix");
                            var5 = var7;
                            var5 = var7;
                            var4 = param1.getParameter("cookiehost");
                            var5 = var4;
                            var5 = var4;
                            var8 = var7 + "settings=" + param2 + "; version=1; path=/; domain=" + var4;
                            var5 = var8;
                            var5 = var8;
                            if (0 != param2.length()) {
                                statePc = 3;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 6;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            var5 = var8 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 6;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            var5 = var8 + "; Expires=" + fc.a((byte) -32, 94608000000L + d.a((byte) 30)) + "; Max-Age=" + 94608000L;
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 6;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            cl.a(param1, "document.cookie=\"" + var5 + "\"", (byte) -111);
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 6;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        throwable = caughtException;
                        statePc = 7;
                        continue stateLoop;
                    }
                    case 7: {
                        jf.a((byte) 76, param1);
                        if (param0 != 26017) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    }
                    case 8: {
                        return;
                    }
                    case 9: {
                        var6 = null;
                        q.a(-77, (java.applet.Applet) null, (String) null);
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

    final static void a(int param0, java.awt.Frame param1, vh param2) {
        jh var3_ref = null;
        int var3 = 0;
        int var4 = 0;
        var4 = wizardrun.field_H;
        L0: while (true) {
          var3_ref = param2.a(7, param1);
          L1: while (true) {
            if (var3_ref.field_a != 0) {
              if (var3_ref.field_a != 1) {
                tg.a(100L, false);
                continue L0;
              } else {
                param1.setVisible(false);
                var3 = 79 % ((param0 - -4) / 58);
                param1.dispose();
                return;
              }
            } else {
              tg.a(10L, false);
              continue L1;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "COMPLETE";
        field_b = 10;
        field_g = "to keep fullscreen or";
    }
}
