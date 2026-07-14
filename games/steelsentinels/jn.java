/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jn {
    static wk[] field_f;
    static String field_a;
    static String field_e;
    static wk[] field_d;
    static dn field_h;
    static boolean field_g;
    static int field_c;
    static ml field_b;

    public static void a(byte param0) {
        field_b = null;
        field_d = null;
        if (param0 <= 55) {
          field_d = null;
          field_f = null;
          field_h = null;
          field_e = null;
          field_a = null;
          return;
        } else {
          field_f = null;
          field_h = null;
          field_e = null;
          field_a = null;
          return;
        }
    }

    final static void a(boolean param0, byte param1, int param2, tg param3) {
        Object var4 = null;
        Throwable var5 = null;
        Object var6 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (ja.field_g != null) {
                        statePc = 2;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 2: {
                    fn.a(-26907, 1048576, param0, param2, param3);
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (null != q.field_f) {
                        statePc = 7;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (param1 >= 65) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var6 = null;
                    jn.a(true, (byte) -9, -7, (tg) null);
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    return;
                }
                case 7: {
                    var4 = (Object) (Object) fc.field_a;
                    // monitorenter fc.field_a
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    try {
                        q.field_f.a(-1, (byte) 20, param2);
                        if (ml.field_g != param3) {
                            statePc = 11;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        // monitorexit var4
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 10: {
                    return;
                }
                case 11: {
                    try {
                        q.field_f.c((byte) -98);
                        fc.field_a.a();
                        ml.field_g = param3;
                        if (null == ml.field_g) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        q.field_f.a(true, param0, ml.field_g);
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        // monitorexit var4
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 14: {
                    if (param1 >= 65) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    var6 = null;
                    jn.a(true, (byte) -9, -7, (tg) null);
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    return;
                }
                case 17: {
                    try {
                        var5 = caughtException;
                        // monitorexit var4
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 18: {
                    throw (RuntimeException) (Object) var5;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Menu";
        field_e = "Warning: ";
        field_g = true;
        field_c = 480;
    }
}
