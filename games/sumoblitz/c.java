/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class c extends nl {
    static int field_s;
    static String field_q;
    static int field_r;
    static String field_t;
    static int[] field_u;

    final String a(boolean param0, pk param1) {
        if (!param0) {
          field_s = -86;
          return oc.a(param1.field_m.length(), '*', -1);
        } else {
          return oc.a(param1.field_m.length(), '*', -1);
        }
    }

    public static void c(int param0) {
        if (param0 != 22760) {
          field_q = null;
          field_t = null;
          field_q = null;
          field_u = null;
          return;
        } else {
          field_t = null;
          field_q = null;
          field_u = null;
          return;
        }
    }

    private c(vn param0, int param1) {
        super(param0, param1);
    }

    c(int param0) {
        this(kw.field_b, param0);
    }

    final static void a(byte param0) {
        Object var1 = null;
        int var2 = 0;
        Throwable var3 = null;
        int var4 = 0;
        int var5 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = Sumoblitz.field_L ? 1 : 0;
                    var1 = (Object) (Object) wd.field_e;
                    // monitorenter wd.field_e
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 >= 108) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        // monitorexit var1
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return;
                }
                case 4: {
                    try {
                        bj.field_a = ua.field_a;
                        kj.field_e = kj.field_e + 1;
                        if (0 > lv.field_i) {
                            statePc = 9;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (ks.field_v == lv.field_i) {
                            statePc = 13;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var2 = jf.field_d[ks.field_v];
                        ks.field_v = 127 & ks.field_v + 1;
                        if (0 <= var2) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        hw.field_b[var2] = false;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        hw.field_b[var2] = true;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var5 = 0;
                        var2 = var5;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (-113 <= var5) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        hw.field_b[var5] = false;
                        var5++;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        lv.field_i = ks.field_v;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        ua.field_a = jt.field_s;
                        // monitorexit var1
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var3 = caughtException;
                        // monitorexit var1
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 16: {
                    throw (RuntimeException) (Object) var3;
                }
                case 17: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "If you do nothing the game will revert to normal view once the timer reaches 0.";
        field_t = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
        field_u = new int[]{1, 1, 1};
    }
}
