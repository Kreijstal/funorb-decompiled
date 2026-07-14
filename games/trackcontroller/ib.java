/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ib {
    static int field_a;
    static rk field_e;
    static String field_b;
    static String field_c;
    static int field_f;
    static int field_d;

    static long b(long param0, long param1) {
        return param0 | param1;
    }

    final static int a(boolean param0, int param1, String param2) {
        if (param1 != 10) {
            return -116;
        }
        if (!param0) {
            return r.field_k.a(param2);
        }
        return mk.field_b.a(param2);
    }

    static long a(long param0, long param1) {
        return param0 ^ param1;
    }

    final static void a(boolean param0, String param1, java.applet.Applet param2, byte param3) {
        try {
            java.net.MalformedURLException malformedURLException = null;
            Object var5 = null;
            Throwable decompiledCaughtException = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (!uf.field_b.startsWith("win")) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        if (fc.b(false, param1)) {
                            statePc = 3;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        return;
                    }
                    case 4: {
                        try {
                            param2.getAppletContext().showDocument(new java.net.URL(param1), "_blank");
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 6;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        malformedURLException = (java.net.MalformedURLException) (Object) caughtException;
                        hb.a((Throwable) null, 0, "MGR1: " + param1);
                        statePc = 7;
                        continue stateLoop;
                    }
                    case 7: {
                        if (param3 != -25) {
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
                        var5 = null;
                        ib.a(true, (String) null, (java.applet.Applet) null, (byte) 53);
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

    final static qj[] a(int param0, String param1, kk param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        if (param0 != 10) {
          var6 = null;
          int discarded$2 = ib.a(false, -91, (String) null);
          var4 = param2.a(true, param1);
          var5 = param2.a(param3, var4, param0 + -11);
          return dg.a(false, var4, var5, param2);
        } else {
          var4 = param2.a(true, param1);
          var5 = param2.a(param3, var4, param0 + -11);
          return dg.a(false, var4, var5, param2);
        }
    }

    public static void a(byte param0) {
        Object var2 = null;
        field_c = null;
        field_e = null;
        if (param0 != -78) {
          var2 = null;
          int discarded$2 = ib.a(false, 109, (String) null);
          field_b = null;
          return;
        } else {
          field_b = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Player";
        field_c = "Retry";
        field_d = 50;
        field_f = 10;
    }
}
