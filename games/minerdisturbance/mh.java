/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mh implements uj {
    static double field_a;
    static rc[] field_b;
    static boolean field_f;
    static ea field_d;
    static int field_c;
    static je[][] field_e;

    final static boolean a(int[] param0, int param1) {
        int var3 = MinerDisturbance.field_ab;
        int var2 = 0;
        if (param1 != -1) {
            Object var4 = null;
            boolean discarded$0 = mh.a((int[]) null, -37);
        }
        while (var2 < 8) {
            if (-1 != (param0[var2] ^ -1)) {
                return true;
            }
            var2++;
        }
        return false;
    }

    public final void a(boolean param0) {
        tb.field_a = 1;
        gd.field_x = 1;
        if (param0) {
            field_c = -35;
        }
    }

    final static void b(int param0) {
        Object var1 = null;
        int var2 = 0;
        Throwable var3 = null;
        int var4 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = MinerDisturbance.field_ab;
                    var1 = (Object) (Object) di.field_O;
                    // monitorenter di.field_O
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        dn.field_w = ll.field_d;
                        hb.field_b = hb.field_b + 1;
                        if (cg.field_H >= 0) {
                            statePc = 6;
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
                        var2 = 0;
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
                        if ((var2 ^ -1) <= -113) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        qd.field_O[var2] = false;
                        var2++;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        cg.field_H = dm.field_b;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (dm.field_b == cg.field_H) {
                            statePc = 10;
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
                        var2 = ib.field_b[dm.field_b];
                        dm.field_b = dm.field_b - -1 & 127;
                        if (var2 < 0) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        qd.field_O[var2] = true;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        qd.field_O[var2 ^ -1] = false;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var2 = -126 % ((param0 - -3) / 32);
                        ll.field_d = qf.field_n;
                        // monitorexit var1
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var3 = caughtException;
                        // monitorexit var1
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 13: {
                    throw (RuntimeException) (Object) var3;
                }
                case 14: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public final String a(byte param0) {
        int var2 = -104 / ((param0 - -33) / 62);
        return "Make Ore Silver";
    }

    public static void a(int param0) {
        field_b = null;
        field_e = null;
        field_d = null;
        int var1 = 103 % ((5 - param0) / 39);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new rc[5];
        field_a = Math.atan2(1.0, 0.0);
    }
}
