/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class le extends bg {
    static String field_J;
    static int field_K;
    static int[] field_L;
    static String field_B;
    private Object field_I;

    final Object d(byte param0) {
        int var2 = -124 / ((70 - param0) / 38);
        return ((le) this).field_I;
    }

    final static void a(Object param0, int param1, pn param2) {
        Exception var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = SteelSentinels.field_G;
                    if (param2.field_b == null) {
                        statePc = 2;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 2: {
                    return;
                }
                case 3: {
                    var3_int = 0;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    if (var3_int >= 50) {
                        statePc = 7;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (param2.field_b.peekEvent() == null) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    a.a((byte) 125, 1L);
                    var3_int++;
                    statePc = 4;
                    continue stateLoop;
                }
                case 7: {
                    try {
                        if (param0 != null) {
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
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        param2.field_b.postEvent((java.awt.AWTEvent) (Object) new java.awt.event.ActionEvent(param0, 1001, "dummy"));
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (param1 == 50) {
                            statePc = 14;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        field_L = null;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 13: {
                    var3 = (Exception) (Object) caughtException;
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(byte param0, boolean param1) {
        ul.field_g = hh.field_i;
        ag.field_u = 0;
        ik.field_e = 0;
        lh.field_r = 0;
        jh.field_i = new rm(2);
        int var2 = 116 / ((param0 - 57) / 61);
        jh.field_i.a(param1, -1, 0, ei.a(pi.field_c, oh.field_f, true));
    }

    le(Object param0, int param1) {
        super(param1);
        ((le) this).field_I = param0;
    }

    public static void i(int param0) {
        if (param0 < 59) {
            return;
        }
        field_L = null;
        field_B = null;
        field_J = null;
    }

    final boolean h(int param0) {
        if (param0 != -29304) {
            return true;
        }
        return false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = "Back";
        field_B = "Options";
    }
}
