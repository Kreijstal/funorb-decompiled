/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ao {
    static String field_c;
    static String field_d;
    static int field_e;
    static dl[] field_b;
    static String field_a;

    static long a(long param0, long param1) {
        return param0 & param1;
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
                    var4 = CrazyCrystals.field_B;
                    var1 = (Object) (Object) uf.field_c;
                    // monitorenter uf.field_c
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        td.field_d = ah.field_g;
                        jf.field_a = jf.field_a + 1;
                        if (param0 < -32) {
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
                        if (-1 < bo.field_n) {
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
                        if (bo.field_n == ud.field_Z) {
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
                        var2 = pl.field_n[ud.field_Z];
                        ud.field_Z = 127 & ud.field_Z - -1;
                        if (-1 > var2) {
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
                        cp.field_k[var2] = true;
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
                        cp.field_k[var2 ^ -1] = false;
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
                        if ((var5 ^ -1) <= -113) {
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
                        cp.field_k[var5] = false;
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
                        bo.field_n = ud.field_Z;
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
                        ah.field_g = ei.field_A;
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

    public static void b(byte param0) {
        field_c = null;
        field_b = null;
        field_d = null;
        field_a = null;
        int var1 = 5 / ((param0 - 19) / 62);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "The object of this game is to collect all the crystals. Use the arrow keys to move.";
        field_c = "Name is available";
        field_a = "Data server full or too many connections from your address. Please try again in a few minutes.";
    }
}
