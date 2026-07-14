/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ila extends ksa {
    String field_d;

    final static void c(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = VoidHunters.field_G;
        int var1 = bs.field_b[0];
        if (param0 != -15) {
            return;
        }
        for (var2 = 1; var2 < bs.field_b.length; var2++) {
            var3 = bs.field_b[var2];
            cua.a(aq.field_p, var2 << -863152860, aq.field_p, var1, var3);
            var1 = var1 + var3;
        }
    }

    final static boolean a(int param0, java.applet.Applet param1) {
        try {
            String var2 = null;
            Throwable var2_ref = null;
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int stackIn_8_0 = 0;
            int stackIn_15_0 = 0;
            int stackOut_7_0 = 0;
            int stackOut_13_0 = 0;
            int stackOut_14_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var7 = VoidHunters.field_G;
                        if (!ch.field_o) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        return true;
                    }
                    case 2: {
                        try {
                            var2 = "tuhstatbut";
                            var3 = (String) ia.a(param1, "getcookies", 12348);
                            var4 = up.a((byte) -67, ';', var3);
                            var5 = param0;
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            if (var5 >= var4.length) {
                                statePc = 12;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            var6 = var4[var5].indexOf('=');
                            if (var6 < 0) {
                                statePc = 9;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if (var4[var5].substring(0, var6).trim().equals((Object) (Object) var2)) {
                                statePc = 7;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            stackOut_7_0 = 1;
                            stackIn_8_0 = stackOut_7_0;
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        return stackIn_8_0 != 0;
                    }
                    case 9: {
                        try {
                            var5++;
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        var2_ref = caughtException;
                        statePc = 12;
                        continue stateLoop;
                    }
                    case 12: {
                        if (param1.getParameter("tuhstatbut") == null) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        stackOut_13_0 = 1;
                        stackIn_15_0 = stackOut_13_0;
                        statePc = 15;
                        continue stateLoop;
                    }
                    case 14: {
                        stackOut_14_0 = 0;
                        stackIn_15_0 = stackOut_14_0;
                        statePc = 15;
                        continue stateLoop;
                    }
                    case 15: {
                        return stackIn_15_0 != 0;
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

    ila(String param0) {
        ((ila) this).field_d = param0;
    }

    final static String a(byte[] param0, int param1) {
        String var2 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = VoidHunters.field_G;
        if (param0 != null) {
          var2 = "[";
          var3 = 0;
          L0: while (true) {
            if (var3 >= param0.length) {
              var3 = 84 % ((param1 - -26) / 46);
              return var2 + "]";
            } else {
              var2 = var2 + param0[var3];
              if (-1 + param0.length > var3) {
                var2 = var2 + ",";
                var3++;
                continue L0;
              } else {
                var3++;
                continue L0;
              }
            }
          }
        } else {
          return null;
        }
    }

    static {
    }
}
