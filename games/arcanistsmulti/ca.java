/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ca extends com.ms.dll.Callback {
    private int field_a;
    private boolean field_b;
    private volatile int field_c;
    private volatile int field_e;
    private volatile boolean field_d;

    final void a(int param0, int param1, int param2) {
        boolean discarded$5 = com.ms.win32.User32.SetCursorPos(param2, param1);
        if (param0 != 26899) {
            ((ca) this).field_b = false;
        }
    }

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        if (param0 != ((ca) this).field_c) {
            var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
            return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        }
        if (param1 != 32) {
            if (!(-101025 != param1)) {
                int discarded$0 = com.ms.win32.User32.SetCursor(!((ca) this).field_d ? 0 : ((ca) this).field_a);
                return 0;
            }
            if (!(-2 != param1)) {
                ((ca) this).field_c = 0;
                ((ca) this).field_d = true;
            }
            return com.ms.win32.User32.CallWindowProc(((ca) this).field_e, param0, param1, param2, param3);
        }
        var5 = param3 & 65535;
        if (var5 == 1) {
            int discarded$1 = com.ms.win32.User32.SetCursor(!((ca) this).field_d ? 0 : ((ca) this).field_a);
            return 0;
        }
        if (!(-101025 != param1)) {
            int discarded$2 = com.ms.win32.User32.SetCursor(!((ca) this).field_d ? 0 : ((ca) this).field_a);
            return 0;
        }
        if (!(-2 != param1)) {
            ((ca) this).field_c = 0;
            ((ca) this).field_d = true;
        }
        return com.ms.win32.User32.CallWindowProc(((ca) this).field_e, param0, param1, param2, param3);
    }

    final void a(int param0, java.awt.Component param1, boolean param2) {
        int var5 = 0;
        Object var6 = null;
        Object var6_ref = null;
        Throwable var7 = null;
        Throwable var8 = null;
        com.ms.awt.WComponentPeer var9 = null;
        boolean stackIn_4_0 = false;
        boolean stackIn_5_0 = false;
        boolean stackIn_6_0 = false;
        int stackIn_6_1 = 0;
        Object stackIn_21_0 = null;
        Object stackIn_22_0 = null;
        Object stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        Object stackIn_27_0 = null;
        Object stackIn_28_0 = null;
        Object stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        boolean stackOut_3_0 = false;
        boolean stackOut_4_0 = false;
        int stackOut_4_1 = 0;
        boolean stackOut_5_0 = false;
        int stackOut_5_1 = 0;
        Object stackOut_20_0 = null;
        Object stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        Object stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        Object stackOut_26_0 = null;
        Object stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        Object stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (param0 > 49) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    ((ca) this).field_a = 16;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var9 = null;
                    var5 = var9.getTopHwnd();
                    if (((ca) this).field_c != var5) {
                        statePc = 9;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    stackOut_3_0 = param2;
                    stackIn_5_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (((ca) this).field_d) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    stackOut_4_0 = stackIn_4_0;
                    stackOut_4_1 = 1;
                    stackIn_6_0 = stackOut_4_0;
                    stackIn_6_1 = stackOut_4_1;
                    statePc = 6;
                    continue stateLoop;
                }
                case 5: {
                    stackOut_5_0 = stackIn_5_0;
                    stackOut_5_1 = 0;
                    stackIn_6_0 = stackOut_5_0;
                    stackIn_6_1 = stackOut_5_1;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if ((stackIn_6_0 ? 1 : 0) != stackIn_6_1) {
                        statePc = 8;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 8: {
                    return;
                }
                case 9: {
                    if (((ca) this).field_b) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    ((ca) this).field_a = com.ms.win32.User32.LoadCursor(0, 32512);
                    int discarded$5 = com.ms.dll.Root.alloc(this);
                    ((ca) this).field_b = true;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    if (((ca) this).field_c == var5) {
                        statePc = 26;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if (-1 == (((ca) this).field_c ^ -1)) {
                        statePc = 18;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    ((ca) this).field_d = true;
                    int discarded$6 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
                    var6_ref = this;
                    // monitorenter this
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    try {
                        int discarded$7 = com.ms.win32.User32.SetWindowLong(((ca) this).field_c, -4, ((ca) this).field_e);
                        // monitorexit var6_ref
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var7 = caughtException;
                        // monitorexit var6_ref
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 17: {
                    throw (RuntimeException) (Object) var7;
                }
                case 18: {
                    var6_ref = this;
                    // monitorenter this
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    try {
                        ((ca) this).field_c = var5;
                        ((ca) this).field_e = com.ms.win32.User32.SetWindowLong(((ca) this).field_c, -4, this);
                        // monitorexit var6_ref
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 20: {
                    stackOut_20_0 = this;
                    stackIn_22_0 = stackOut_20_0;
                    stackIn_21_0 = stackOut_20_0;
                    if (!param2) {
                        statePc = 22;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    stackOut_21_0 = this;
                    stackOut_21_1 = 1;
                    stackIn_23_0 = stackOut_21_0;
                    stackIn_23_1 = stackOut_21_1;
                    statePc = 23;
                    continue stateLoop;
                }
                case 22: {
                    stackOut_22_0 = this;
                    stackOut_22_1 = 0;
                    stackIn_23_0 = stackOut_22_0;
                    stackIn_23_1 = stackOut_22_1;
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    ((ca) this).field_d = stackIn_23_1 != 0;
                    int discarded$8 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
                    return;
                }
                case 24: {
                    try {
                        var8 = caughtException;
                        // monitorexit var6_ref
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 25: {
                    throw (RuntimeException) (Object) var8;
                }
                case 26: {
                    stackOut_26_0 = this;
                    stackIn_28_0 = stackOut_26_0;
                    stackIn_27_0 = stackOut_26_0;
                    if (!param2) {
                        statePc = 28;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    stackOut_27_0 = this;
                    stackOut_27_1 = 1;
                    stackIn_29_0 = stackOut_27_0;
                    stackIn_29_1 = stackOut_27_1;
                    statePc = 29;
                    continue stateLoop;
                }
                case 28: {
                    stackOut_28_0 = this;
                    stackOut_28_1 = 0;
                    stackIn_29_0 = stackOut_28_0;
                    stackIn_29_1 = stackOut_28_1;
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    ((ca) this).field_d = stackIn_29_1 != 0;
                    int discarded$9 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    ca() {
        ((ca) this).field_d = true;
    }
}
