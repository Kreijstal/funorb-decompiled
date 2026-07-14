/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kf {
    private String field_d;
    static String field_c;
    static String field_a;
    static int field_f;
    static String[] field_e;
    static int field_b;
    static int field_g;

    final boolean a(byte param0, String param1) {
        int var3 = 95 % ((param0 - -55) / 62);
        return ((kf) this).field_d.equals((Object) (Object) param1);
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static String a(int param0, java.applet.Applet param1) {
        try {
            Throwable var2 = null;
            String var3 = null;
            String var4 = null;
            String[] var5 = null;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            String var9 = null;
            String stackIn_6_0 = null;
            String stackOut_5_0 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var8 = Terraphoenix.field_V;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var9 = param1.getParameter("cookieprefix");
                            var3 = var9 + "settings";
                            var4 = (String) cd.a((byte) -128, "getcookies", param1);
                            var5 = nc.a(14352, var4, ';');
                            var6 = 0;
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            if (var5.length <= var6) {
                                statePc = 10;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            var7 = var5[var6].indexOf('=');
                            if (var7 < 0) {
                                statePc = 7;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            if (!var5[var6].substring(0, var7).trim().equals((Object) (Object) var3)) {
                                statePc = 7;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            stackOut_5_0 = var5[var6].substring(var7 + 1).trim();
                            stackIn_6_0 = stackOut_5_0;
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        return stackIn_6_0;
                    }
                    case 7: {
                        try {
                            var6++;
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        var2 = caughtException;
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        if (param0 <= -17) {
                            statePc = 15;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        field_a = null;
                        if (va.field_g != null) {
                            statePc = 13;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        return va.field_g;
                    }
                    case 14: {
                        return param1.getParameter("settings");
                    }
                    case 15: {
                        if (va.field_g != null) {
                            statePc = 17;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    }
                    case 17: {
                        return va.field_g;
                    }
                    case 18: {
                        return param1.getParameter("settings");
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

    kf(String param0) {
        ((kf) this).field_d = param0;
    }

    final static boolean a(boolean param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0) {
          L0: {
            field_f = -47;
            if (vc.field_a.a(-121)) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (vc.field_a.a(-121)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final void a(java.applet.Applet param0, byte param1) {
        if (param1 != 117) {
          kf.a((byte) -79);
          ll.a(((kf) this).field_d, 31536000L, (byte) -126, param0, "jagex-last-login-method");
          return;
        } else {
          ll.a(((kf) this).field_d, 31536000L, (byte) -126, param0, "jagex-last-login-method");
          return;
        }
    }

    final static qd a(int param0, byte param1, fa param2) {
        int var3 = 0;
        byte[] var4 = null;
        var3 = 39 % ((74 - param1) / 39);
        var4 = param2.b(param0, 0);
        if (var4 == null) {
          return null;
        } else {
          return new qd(var4);
        }
    }

    public static void a(byte param0) {
        if (param0 != -77) {
            return;
        }
        field_e = null;
        field_a = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Recruit new soldier";
        field_a = "P-2 FG";
        field_e = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
    }
}
