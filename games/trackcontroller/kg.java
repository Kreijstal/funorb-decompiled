/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kg {
    static qj[] field_e;
    static String field_a;
    static boolean field_f;
    static int field_d;
    static int[] field_b;
    static int field_c;

    public static void a(int param0) {
        field_a = null;
        field_e = null;
        if (param0 != -1) {
            field_c = -1;
            field_b = null;
            return;
        }
        field_b = null;
    }

    final static void a(boolean param0, byte param1, int param2, wb param3) {
        int var4 = 0;
        Object var5 = null;
        Throwable var6 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = -101 % ((param1 - 11) / 46);
                    if (null == da.field_n) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    ia.a(param0, param2, 1048576, 1000000, param3);
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (fj.field_P == null) {
                        statePc = 15;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    var5 = (Object) (Object) sb.field_b;
                    // monitorenter sb.field_b
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    try {
                        fj.field_P.a(param2, (byte) -113, -1);
                        if (param3 == ch.field_n) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        // monitorexit var5
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 7: {
                    return;
                }
                case 8: {
                    try {
                        fj.field_P.f(11795);
                        sb.field_b.c();
                        ch.field_n = param3;
                        if (ch.field_n != null) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        fj.field_P.a(ch.field_n, 14526, param0);
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        // monitorexit var5
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 12: {
                    return;
                }
                case 13: {
                    try {
                        var6 = caughtException;
                        // monitorexit var5
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 14: {
                    throw (RuntimeException) (Object) var6;
                }
                case 15: {
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
        field_c = 480;
        field_b = new int[256];
    }
}
