/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kh {
    private boolean field_c;
    static il[] field_e;
    static String field_a;
    private String field_d;
    static String field_b;

    final static qj a(boolean param0, int param1, int param2, kk param3) {
        Object var5 = null;
        if (!param0) {
          if (!sk.a(param2, param3, 1, param1)) {
            return null;
          } else {
            return ec.a(0);
          }
        } else {
          var5 = null;
          String discarded$4 = kh.a((String) null, 123, (java.applet.Applet) null);
          if (!sk.a(param2, param3, 1, param1)) {
            return null;
          } else {
            return ec.a(0);
          }
        }
    }

    final static String a(String param0, int param1, java.applet.Applet param2) {
        try {
            String var3 = null;
            Throwable var3_ref = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            String stackIn_9_0 = null;
            String stackOut_8_0 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var7 = TrackController.field_F ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (param1 > 55) {
                                statePc = 3;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            field_a = null;
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            var3 = (String) sj.a((byte) -92, "getcookies", param2);
                            var4 = te.a(var3, ';', (byte) -98);
                            var5 = 0;
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            if (var4.length <= var5) {
                                statePc = 13;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            var6 = var4[var5].indexOf('=');
                            if (var6 < 0) {
                                statePc = 10;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            if (var4[var5].substring(0, var6).trim().equals((Object) (Object) param0)) {
                                statePc = 8;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            stackOut_8_0 = var4[var5].substring(1 + var6).trim();
                            stackIn_9_0 = stackOut_8_0;
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        return stackIn_9_0;
                    }
                    case 10: {
                        try {
                            var5++;
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        var3_ref = caughtException;
                        statePc = 13;
                        continue stateLoop;
                    }
                    case 13: {
                        return null;
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

    kh(String param0) {
        this(param0, false);
    }

    final static ck a(kk param0, String param1, kk param2, String param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        if (param4 != 1) {
          field_b = null;
          var5 = param2.a(true, param3);
          var6 = param2.a(param1, var5, -1);
          return pb.a(var5, var6, param2, param0, (byte) 126);
        } else {
          var5 = param2.a(true, param3);
          var6 = param2.a(param1, var5, -1);
          return pb.a(var5, var6, param2, param0, (byte) 126);
        }
    }

    final String b(int param0) {
        if (param0 >= -73) {
            return null;
        }
        return ((kh) this).field_d;
    }

    public static void c(int param0) {
        field_a = null;
        if (param0 != 61) {
            return;
        }
        field_b = null;
        field_e = null;
    }

    final boolean a(int param0) {
        if (param0 > -35) {
            Object var3 = null;
            String discarded$0 = kh.a((String) null, 73, (java.applet.Applet) null);
            return ((kh) this).field_c;
        }
        return ((kh) this).field_c;
    }

    kh(String param0, boolean param1) {
        ((kh) this).field_d = param0;
        if (((kh) this).field_d == null) {
            ((kh) this).field_d = "";
        }
        ((kh) this).field_c = param1 ? true : false;
        if (((kh) this).field_d.length() == 0) {
            ((kh) this).field_c = false;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Passwords can only contain letters and numbers";
        field_b = "Play the game without logging in just yet";
    }
}
