/*
 * Decompiled by CFR-JS 0.4.0.
 */
class fh extends hd {
    static hl[] field_r;
    static hl field_q;

    fh(qe param0, int param1) {
        super(param0, 4, 2, 2, 2, param1, -1, 0, 1, param0.field_p, -1, 2147483647, false);
    }

    final static String a(String param0, java.applet.Applet param1, byte param2) {
        try {
            String var3 = null;
            Throwable var3_ref = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            String stackIn_6_0 = null;
            String stackOut_5_0 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        try {
                            var3 = (String) mb.a(param1, "getcookies", true);
                            var4 = uj.a(-89, ';', var3);
                            var5 = 0;
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_0) {
                            caughtException = stateCaught_0;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 1: {
                        try {
                            if (var4.length <= var5) {
                                statePc = 10;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            var6 = var4[var5].indexOf('=');
                            if ((var6 ^ -1) > -1) {
                                statePc = 7;
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
                            if (var4[var5].substring(0, var6).trim().equals((Object) (Object) param0)) {
                                statePc = 5;
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
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            stackOut_5_0 = var4[var5].substring(var6 - -1).trim();
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
                            var5++;
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        var3_ref = caughtException;
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        if (param2 >= 77) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        field_r = null;
                        return null;
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

    final static void a(int param0, int param1) {
        int var3 = 0;
        Object var4 = null;
        dg var5 = null;
        we var6 = null;
        var3 = StarCannon.field_A;
        var5 = (dg) (Object) vb.field_k.c(-3905);
        if (param1 != 8100) {
          var4 = null;
          String discarded$1 = fh.a((String) null, (java.applet.Applet) null, (byte) -52);
          L0: while (true) {
            if (var5 == null) {
              var6 = (we) (Object) ma.field_h.c(-3905);
              L1: while (true) {
                if (var6 != null) {
                  la.a(0, var6, param0);
                  var6 = (we) (Object) ma.field_h.a(param1 + -25013);
                  continue L1;
                } else {
                  return;
                }
              }
            } else {
              tj.a((byte) 69, var5, param0);
              var5 = (dg) (Object) vb.field_k.a(param1 + -25013);
              continue L0;
            }
          }
        } else {
          L2: while (true) {
            if (var5 == null) {
              var6 = (we) (Object) ma.field_h.c(-3905);
              L3: while (true) {
                if (var6 != null) {
                  la.a(0, var6, param0);
                  var6 = (we) (Object) ma.field_h.a(param1 + -25013);
                  continue L3;
                } else {
                  return;
                }
              }
            } else {
              tj.a((byte) 69, var5, param0);
              var5 = (dg) (Object) vb.field_k.a(param1 + -25013);
              continue L2;
            }
          }
        }
    }

    public static void b(byte param0) {
        int var1 = 43 % ((param0 - -7) / 39);
        field_q = null;
        field_r = null;
    }

    public final void a(int param0, boolean param1, int param2, int param3, uj param4) {
        if (!(!param1)) {
            sk.a(param0 + param4.field_s, param4.field_i, param4.field_f, true, param4.field_j + param3);
        }
        int var6 = -54 / ((param2 - 2) / 54);
        super.a(param0, param1, 66, param3, param4);
    }

    fh(int param0) {
        this(nb.field_c, param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = new hl[8];
    }
}
