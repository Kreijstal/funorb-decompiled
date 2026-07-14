/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class he extends pu {
    static String field_n;
    static int field_l;
    static String field_m;
    static String field_o;

    public static void d(byte param0) {
        if (param0 < 81) {
            he.d((byte) 27);
        }
        field_m = null;
        field_n = null;
        field_o = null;
    }

    final static void a(ht param0, boolean param1, Object param2) {
        Exception var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = BachelorFridge.field_y;
                    if (null != param0.field_x) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return;
                }
                case 2: {
                    var3_int = 0;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (var3_int >= 50) {
                        statePc = 6;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (null == param0.field_x.peekEvent()) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    gda.a(false, 1L);
                    var3_int++;
                    statePc = 3;
                    continue stateLoop;
                }
                case 6: {
                    if (!param1) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    field_l = 106;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    try {
                        if (param2 == null) {
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
                        param0.field_x.postEvent((java.awt.AWTEvent) (Object) new java.awt.event.ActionEvent(param2, 1001, "dummy"));
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
        field_n = "To play a multiplayer game, please log in or create a free account.";
        field_o = "Your <%0> will be lost!";
        field_m = "Your friend list is full. Max of 100 for free users, and 200 for members.";
    }
}
