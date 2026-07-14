/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vf {
    static int[] field_a;
    static String[] field_b;
    static byte[][] field_c;

    public static void a(int param0) {
        field_b = null;
        if (param0 != 1) {
            return;
        }
        field_c = null;
        field_a = null;
    }

    final static hj[] a(int param0, int param1, int param2, byte param3) {
        if (param3 >= -44) {
            vf.a(45);
        }
        return kd.a(1, param2, 119, param0, param1);
    }

    final static void a(Object param0, int param1, be param2) {
        int var3_int = 0;
        Exception var3 = null;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = OrbDefence.field_D ? 1 : 0;
                    if (param2.field_t == null) {
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
                    if (null == param2.field_t.peekEvent()) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    hb.a(1L, 97);
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
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        param2.field_t.postEvent((java.awt.AWTEvent) (Object) new java.awt.event.ActionEvent(param0, 1001, "dummy"));
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 11: {
                    var3 = (Exception) (Object) caughtException;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    if (param1 == 50) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    hj[] discarded$3 = vf.a(9, -82, 8, (byte) 43);
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

    final static void a(byte param0, String param1, String param2) {
        if (param0 <= 84) {
            hj[] discarded$0 = vf.a(-58, 69, -47, (byte) 17);
        }
        pc.a(-1, param2, param1, false);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[1024];
        field_b = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
        field_c = new byte[50][];
    }
}
