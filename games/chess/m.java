/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class m {
    static fn[] field_e;
    static int field_d;
    static bn field_a;
    static int field_b;
    static String field_c;

    final static boolean a(int param0) {
        Object var2 = null;
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 <= -40) {
            break L0;
          } else {
            var2 = null;
            String discarded$2 = m.a((java.applet.Applet) null, (byte) 61);
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == lj.field_a) {
              break L2;
            } else {
              if (!tb.field_f.a((byte) -121)) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
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
            String var9 = null;
            Object stackIn_3_0 = null;
            String stackIn_10_0 = null;
            Object stackOut_2_0 = null;
            String stackOut_9_0 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var8 = Chess.field_G;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var9 = param0.getParameter("cookieprefix");
                            var3 = var9 + "settings";
                            var4 = (String) u.a(true, "getcookies", param0);
                            if (param1 == 87) {
                                statePc = 4;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            stackOut_2_0 = null;
                            stackIn_3_0 = stackOut_2_0;
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        return (String) (Object) stackIn_3_0;
                    }
                    case 4: {
                        try {
                            var5 = gl.a((byte) -118, ';', var4);
                            var6 = 0;
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if (var6 >= var5.length) {
                                statePc = 14;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            var7 = var5[var6].indexOf('=');
                            if (var7 < 0) {
                                statePc = 11;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            if (var5[var6].substring(0, var7).trim().equals((Object) (Object) var3)) {
                                statePc = 9;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            stackOut_9_0 = var5[var6].substring(1 + var7).trim();
                            stackIn_10_0 = stackOut_9_0;
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        return (String) (Object) stackIn_10_0;
                    }
                    case 11: {
                        try {
                            var6++;
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        var2 = caughtException;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 14: {
                        if (wg.field_p != null) {
                            statePc = 16;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    }
                    case 16: {
                        return wg.field_p;
                    }
                    case 17: {
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

    public static void a(boolean param0) {
        field_a = null;
        if (param0) {
            field_a = null;
        }
        field_c = null;
        field_e = null;
    }

    final static void a(int param0, int param1) {
        int var3 = Chess.field_G;
        if (param1 != 0) {
            field_a = null;
        }
        dc var4 = (dc) (Object) fa.field_j.g(param1 + -18110);
        while (var4 != null) {
            bh.a(var4, (byte) 46, param0);
            var4 = (dc) (Object) fa.field_j.a((byte) -92);
        }
        pa var5 = (pa) (Object) ve.field_Nb.g(param1 ^ -18110);
        while (var5 != null) {
            ri.a(param1 + -1281, var5, param0);
            var5 = (pa) (Object) ve.field_Nb.a((byte) -111);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Please wait...";
    }
}
