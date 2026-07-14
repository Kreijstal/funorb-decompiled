/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sm {
    static qb field_d;
    static kc field_c;
    static String field_b;
    static kd field_e;
    static int field_a;

    final static boolean a(int param0, String param1, String param2) {
        String var3 = null;
        int stackIn_5_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 == 22230) {
          param2 = fb.a(false, '_', param2, "");
          var3 = pn.a(8671, param1);
          if ((param2.indexOf(param1) ^ -1) == 0) {
            if ((param2.indexOf(var3) ^ -1) != 0) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_3_0 = 1;
            stackIn_5_0 = stackOut_3_0;
            return stackIn_5_0 != 0;
          }
        } else {
          return true;
        }
    }

    final static void a(long param0, String param1, java.applet.Applet param2, int param3, String param4) {
        try {
            Throwable throwable = null;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            Throwable decompiledCaughtException = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        try {
                            var8 = param2.getParameter("cookiehost");
                            var7 = var8;
                            var7 = var8;
                            var9 = param1 + "=" + param4 + "; version=1; path=/; domain=" + var8;
                            var7 = var9;
                            var7 = var9;
                            if ((param0 ^ -1L) > -1L) {
                                statePc = 2;
                            } else {
                                statePc = 1;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_0) {
                            caughtException = stateCaught_0;
                            statePc = 5;
                            continue stateLoop;
                        }
                    }
                    case 1: {
                        try {
                            var7 = var9 + "; Expires=" + di.a(param3 ^ 15478, qj.b(-26572) + 1000L * param0) + "; Max-Age=" + param0;
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 5;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            var7 = var9 + "; Discard;";
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
                            ei.a("document.cookie=\"" + var7 + "\"", param2, 269);
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
                        if (param3 != -15367) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        return;
                    }
                    case 8: {
                        sm.a(51, -15);
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

    public static void a(boolean param0) {
        field_b = null;
        field_e = null;
        field_c = null;
        field_d = null;
        if (param0) {
            field_a = -109;
        }
    }

    final static void a(int param0, int param1) {
        if (-51 != (param1 ^ -1)) {
            throw new IllegalArgumentException();
        }
        int var2 = 101 % ((-45 - param0) / 42);
    }

    final static void a(int param0, boolean param1, int param2, gh param3, java.awt.Component param4, int param5, dl param6, int param7) {
        lb.a(param2, param1, 10);
        oh.field_k = lb.a(param6, param4, 0, param7);
        lf.field_a = lb.a(param6, param4, 1, param5);
        pc.field_e = new m();
        qc.field_a = 1000 * param5 / param2;
        lf.field_a.a((sg) (Object) pc.field_e);
        jl.field_h = param3;
        jl.field_h.a(ul.field_A, (byte) -66);
        oh.field_k.a((sg) (Object) jl.field_h);
        int var8 = 110 % ((-25 - param0) / 48);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Please enter your date of birth to enable chat:";
    }
}
