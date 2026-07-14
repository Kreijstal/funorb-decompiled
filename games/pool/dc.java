/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dc extends com.ms.dll.Callback {
    private volatile int field_e;
    private int field_c;
    private volatile boolean field_d;
    private volatile int field_b;
    private boolean field_a;

    final void a(int param0, int param1, int param2) {
        Object var5 = null;
        if (param0 != -12384) {
          var5 = null;
          ((dc) this).a(-74, true, (java.awt.Component) null);
          boolean discarded$4 = com.ms.win32.User32.SetCursorPos(param2, param1);
          return;
        } else {
          boolean discarded$5 = com.ms.win32.User32.SetCursorPos(param2, param1);
          return;
        }
    }

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        if (!(((dc) this).field_e == param0)) {
            var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
            return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        }
        if (-33 != (param1 ^ -1)) {
            if (!(param1 != 101024)) {
                int discarded$0 = com.ms.win32.User32.SetCursor(!((dc) this).field_d ? 0 : ((dc) this).field_c);
                return 0;
            }
            if (!(-2 != (param1 ^ -1))) {
                ((dc) this).field_e = 0;
                ((dc) this).field_d = true;
            }
            return com.ms.win32.User32.CallWindowProc(((dc) this).field_b, param0, param1, param2, param3);
        }
        var5 = 65535 & param3;
        if ((var5 ^ -1) == -2) {
            int discarded$1 = com.ms.win32.User32.SetCursor(!((dc) this).field_d ? 0 : ((dc) this).field_c);
            return 0;
        }
        if (!(param1 != 101024)) {
            int discarded$2 = com.ms.win32.User32.SetCursor(!((dc) this).field_d ? 0 : ((dc) this).field_c);
            return 0;
        }
        if (!(-2 != (param1 ^ -1))) {
            ((dc) this).field_e = 0;
            ((dc) this).field_d = true;
        }
        return com.ms.win32.User32.CallWindowProc(((dc) this).field_b, param0, param1, param2, param3);
    }

    final void a(int param0, boolean param1, java.awt.Component param2) {
        int var5 = 0;
        Object var6 = null;
        Throwable var7 = null;
        Throwable var8 = null;
        com.ms.awt.WComponentPeer var9 = null;
        int stackIn_4_0 = 0;
        Object stackIn_13_0 = null;
        Object stackIn_14_0 = null;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        Object stackIn_26_0 = null;
        Object stackIn_27_0 = null;
        Object stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_3_0 = 0;
        Object stackOut_12_0 = null;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        Object stackOut_25_0 = null;
        Object stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        Object stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = null;
                    var5 = var9.getTopHwnd();
                    if (((dc) this).field_e != var5) {
                        statePc = 6;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    if (((dc) this).field_d) {
                        statePc = 3;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    stackOut_2_0 = 1;
                    stackIn_4_0 = stackOut_2_0;
                    statePc = 4;
                    continue stateLoop;
                }
                case 3: {
                    stackOut_3_0 = 0;
                    stackIn_4_0 = stackOut_3_0;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    if (stackIn_4_0 == (param1 ? 1 : 0)) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    return;
                }
                case 6: {
                    if (!((dc) this).field_a) {
                        statePc = 8;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 8: {
                    ((dc) this).field_c = com.ms.win32.User32.LoadCursor(0, 32512);
                    int discarded$13 = com.ms.dll.Root.alloc(this);
                    ((dc) this).field_a = true;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    if (param0 == -11888) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    return;
                }
                case 11: {
                    if (((dc) this).field_e != var5) {
                        statePc = 16;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    stackOut_12_0 = this;
                    stackIn_14_0 = stackOut_12_0;
                    stackIn_13_0 = stackOut_12_0;
                    if (!param1) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    stackOut_13_0 = this;
                    stackOut_13_1 = 1;
                    stackIn_15_0 = stackOut_13_0;
                    stackIn_15_1 = stackOut_13_1;
                    statePc = 15;
                    continue stateLoop;
                }
                case 14: {
                    stackOut_14_0 = this;
                    stackOut_14_1 = 0;
                    stackIn_15_0 = stackOut_14_0;
                    stackIn_15_1 = stackOut_14_1;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    ((dc) this).field_d = stackIn_15_1 != 0;
                    int discarded$14 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
                    return;
                }
                case 16: {
                    if (((dc) this).field_e != 0) {
                        statePc = 18;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 18: {
                    ((dc) this).field_d = true;
                    int discarded$15 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
                    var6 = this;
                    // monitorenter this
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    try {
                        int discarded$16 = com.ms.win32.User32.SetWindowLong(((dc) this).field_e, -4, ((dc) this).field_b);
                        // monitorexit var6
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var7 = caughtException;
                        // monitorexit var6
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 22: {
                    throw (RuntimeException) (Object) var7;
                }
                case 23: {
                    var6 = this;
                    // monitorenter this
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    try {
                        ((dc) this).field_e = var5;
                        ((dc) this).field_b = com.ms.win32.User32.SetWindowLong(((dc) this).field_e, -4, this);
                        // monitorexit var6
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 25: {
                    stackOut_25_0 = this;
                    stackIn_27_0 = stackOut_25_0;
                    stackIn_26_0 = stackOut_25_0;
                    if (!param1) {
                        statePc = 27;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    stackOut_26_0 = this;
                    stackOut_26_1 = 1;
                    stackIn_28_0 = stackOut_26_0;
                    stackIn_28_1 = stackOut_26_1;
                    statePc = 28;
                    continue stateLoop;
                }
                case 27: {
                    stackOut_27_0 = this;
                    stackOut_27_1 = 0;
                    stackIn_28_0 = stackOut_27_0;
                    stackIn_28_1 = stackOut_27_1;
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    ((dc) this).field_d = stackIn_28_1 != 0;
                    int discarded$17 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
                    return;
                }
                case 29: {
                    try {
                        var8 = caughtException;
                        // monitorexit var6
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 30: {
                    throw (RuntimeException) (Object) var8;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    dc() {
        ((dc) this).field_d = true;
    }
}
