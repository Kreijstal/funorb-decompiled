/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dc extends hg {
    int[] field_h;
    boolean field_g;
    static String field_i;
    int field_j;

    final static String a(byte param0, String param1, java.applet.Applet param2) {
        try {
            String var3 = null;
            Throwable var3_ref = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            String stackIn_6_0 = null;
            String stackOut_5_0 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var7 = EscapeVector.field_A;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var3 = (String) sd.a(param2, "getcookies", -29155);
                            var4 = bb.a(-128, var3, ';');
                            var5 = 0;
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            if (var4.length <= var5) {
                                statePc = 8;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            var6 = var4[var5].indexOf('=');
                            if (var6 < 0) {
                                statePc = 7;
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
                            if (!var4[var5].substring(0, var6).trim().equals((Object) (Object) param1)) {
                                statePc = 7;
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
                            stackOut_5_0 = var4[var5].substring(1 + var6).trim();
                            stackIn_6_0 = stackOut_5_0;
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        return stackIn_6_0;
                    }
                    case 7: {
                        try {
                            var5++;
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            if (param0 > 78) {
                                statePc = 12;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            field_i = null;
                            return null;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        var3_ref = caughtException;
                        statePc = 12;
                        continue stateLoop;
                    }
                    case 12: {
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

    final static int a(int param0, int param1, int param2) {
        int var3 = 0;
        if (param0 <= -5) {
          var3 = param2 / param1;
          if (param2 % param1 != 0) {
            var3++;
            return var3;
          } else {
            return var3;
          }
        } else {
          return -127;
        }
    }

    final static void a(byte param0, String param1, int param2, int param3) {
        fh.field_g.b(param1, param2 + -1, -1 + param3, 0, -1, 64);
        if (param0 < 19) {
          field_i = null;
          fh.field_g.b(param1, 1 + param2, -1 + param3, 0, -1, 64);
          fh.field_g.b(param1, param2 - 1, 1 + param3, 0, -1, 64);
          fh.field_g.b(param1, 1 + param2, 1 + param3, 0, -1, 64);
          fh.field_g.c(param1, param2, param3, 16777215, -1);
          return;
        } else {
          fh.field_g.b(param1, 1 + param2, -1 + param3, 0, -1, 64);
          fh.field_g.b(param1, param2 - 1, 1 + param3, 0, -1, 64);
          fh.field_g.b(param1, 1 + param2, 1 + param3, 0, -1, 64);
          fh.field_g.c(param1, param2, param3, 16777215, -1);
          return;
        }
    }

    final static int a(int param0, int param1, int param2, int param3, int param4) {
        if (param4 != 64) {
          field_i = null;
          return param3 * (-param2 + param0) / param1 + param2;
        } else {
          return param3 * (-param2 + param0) / param1 + param2;
        }
    }

    dc() {
    }

    public static void a(boolean param0) {
        field_i = null;
        if (param0) {
            dc.a(true);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "RIGHT ARROW";
    }
}
