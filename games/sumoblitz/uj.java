/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uj {
    static hr[] field_b;
    static ri[] field_c;
    static hr field_a;

    final static ah a(int param0, int param1, int param2, byte param3, int param4) {
        if (param3 != 84) {
            return null;
        }
        return (ah) (Object) new dr(param0, param2, param1, param4);
    }

    public static void a(boolean param0) {
        field_c = null;
        if (!param0) {
            field_c = null;
            field_b = null;
            field_a = null;
            return;
        }
        field_b = null;
        field_a = null;
    }

    final static void a(byte param0, int param1, boolean param2, tv param3) {
        int var4_int = 0;
        Object var4 = null;
        Throwable var5 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (qr.field_b != null) {
                        statePc = 2;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 2: {
                    u.a(param3, param1, (byte) -87, 1048576, param2);
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (null != qc.field_e) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var4_int = -69 % ((param0 - -78) / 46);
                    return;
                }
                case 5: {
                    var4 = (Object) (Object) wd.field_f;
                    // monitorenter wd.field_f
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    try {
                        qc.field_e.a((byte) -91, -1, param1);
                        if (nd.field_B != param3) {
                            statePc = 9;
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
                        // monitorexit var4
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return;
                }
                case 9: {
                    try {
                        qc.field_e.e(0);
                        wd.field_f.d();
                        nd.field_B = param3;
                        if (null == nd.field_B) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        qc.field_e.a(param2, nd.field_B, 91);
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
                        // monitorexit var4
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 12: {
                    var4_int = -69 % ((param0 - -78) / 46);
                    return;
                }
                case 13: {
                    try {
                        var5 = caughtException;
                        // monitorexit var4
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 14: {
                    throw (RuntimeException) (Object) var5;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
    }
}
