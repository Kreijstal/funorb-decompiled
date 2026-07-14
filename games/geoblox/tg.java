/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tg extends com.ms.dll.Callback {
    private volatile boolean field_e;
    private int field_a;
    private boolean field_d;
    private volatile int field_b;
    private volatile int field_c;

    final void a(int param0, boolean param1, java.awt.Component param2) {
        int var5 = 0;
        Object var6 = null;
        Throwable var7 = null;
        Throwable var8 = null;
        com.ms.awt.WComponentPeer var9 = null;
        int stackIn_6_0 = 0;
        Object stackIn_20_0 = null;
        Object stackIn_21_0 = null;
        Object stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        Object stackIn_26_0 = null;
        Object stackIn_27_0 = null;
        Object stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        Object stackOut_19_0 = null;
        Object stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        Object stackOut_21_0 = null;
        int stackOut_21_1 = 0;
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
                    if (param0 == 12758) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    ((tg) this).field_d = true;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var9 = null;
                    var5 = var9.getTopHwnd();
                    if (((tg) this).field_b != var5) {
                        statePc = 8;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (((tg) this).field_e) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    stackOut_4_0 = 1;
                    stackIn_6_0 = stackOut_4_0;
                    statePc = 6;
                    continue stateLoop;
                }
                case 5: {
                    stackOut_5_0 = 0;
                    stackIn_6_0 = stackOut_5_0;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if (stackIn_6_0 == (param1 ? 1 : 0)) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    return;
                }
                case 8: {
                    if (((tg) this).field_d) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    ((tg) this).field_a = com.ms.win32.User32.LoadCursor(0, 32512);
                    int discarded$12 = com.ms.dll.Root.alloc(this);
                    ((tg) this).field_d = true;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    if (var5 == ((tg) this).field_b) {
                        statePc = 25;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (0 == ((tg) this).field_b) {
                        statePc = 17;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    ((tg) this).field_e = true;
                    int discarded$13 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
                    var6 = this;
                    // monitorenter this
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    try {
                        int discarded$14 = com.ms.win32.User32.SetWindowLong(((tg) this).field_b, -4, ((tg) this).field_c);
                        // monitorexit var6
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
                        var7 = caughtException;
                        // monitorexit var6
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 16: {
                    throw (RuntimeException) (Object) var7;
                }
                case 17: {
                    var6 = this;
                    // monitorenter this
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    try {
                        ((tg) this).field_b = var5;
                        ((tg) this).field_c = com.ms.win32.User32.SetWindowLong(((tg) this).field_b, -4, this);
                        // monitorexit var6
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 19: {
                    stackOut_19_0 = this;
                    stackIn_21_0 = stackOut_19_0;
                    stackIn_20_0 = stackOut_19_0;
                    if (!param1) {
                        statePc = 21;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    stackOut_20_0 = this;
                    stackOut_20_1 = 1;
                    stackIn_22_0 = stackOut_20_0;
                    stackIn_22_1 = stackOut_20_1;
                    statePc = 22;
                    continue stateLoop;
                }
                case 21: {
                    stackOut_21_0 = this;
                    stackOut_21_1 = 0;
                    stackIn_22_0 = stackOut_21_0;
                    stackIn_22_1 = stackOut_21_1;
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    ((tg) this).field_e = stackIn_22_1 != 0;
                    int discarded$15 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
                    return;
                }
                case 23: {
                    try {
                        var8 = caughtException;
                        // monitorexit var6
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 24: {
                    throw (RuntimeException) (Object) var8;
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
                    ((tg) this).field_e = stackIn_28_1 != 0;
                    int discarded$16 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, int param1, int param2) {
        boolean discarded$4 = com.ms.win32.User32.SetCursorPos(param2, param1);
        if (param0 > -45) {
            Object var5 = null;
            ((tg) this).a(74, true, (java.awt.Component) null);
        }
    }

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int stackIn_7_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (((tg) this).field_b == param0) {
          if (32 == param1) {
            var5 = 65535 & param3;
            if ((var5 ^ -1) != -2) {
              if (param1 != 101024) {
                if (1 == param1) {
                  ((tg) this).field_b = 0;
                  ((tg) this).field_e = true;
                  return com.ms.win32.User32.CallWindowProc(((tg) this).field_c, param0, param1, param2, param3);
                } else {
                  return com.ms.win32.User32.CallWindowProc(((tg) this).field_c, param0, param1, param2, param3);
                }
              } else {
                L0: {
                  if (((tg) this).field_e) {
                    stackOut_20_0 = ((tg) this).field_a;
                    stackIn_21_0 = stackOut_20_0;
                    break L0;
                  } else {
                    stackOut_19_0 = 0;
                    stackIn_21_0 = stackOut_19_0;
                    break L0;
                  }
                }
                int discarded$3 = com.ms.win32.User32.SetCursor(stackIn_21_0);
                return 0;
              }
            } else {
              L1: {
                if (!((tg) this).field_e) {
                  stackOut_15_0 = 0;
                  stackIn_16_0 = stackOut_15_0;
                  break L1;
                } else {
                  stackOut_14_0 = ((tg) this).field_a;
                  stackIn_16_0 = stackOut_14_0;
                  break L1;
                }
              }
              int discarded$4 = com.ms.win32.User32.SetCursor(stackIn_16_0);
              return 0;
            }
          } else {
            if (param1 != 101024) {
              if (1 == param1) {
                ((tg) this).field_b = 0;
                ((tg) this).field_e = true;
                return com.ms.win32.User32.CallWindowProc(((tg) this).field_c, param0, param1, param2, param3);
              } else {
                return com.ms.win32.User32.CallWindowProc(((tg) this).field_c, param0, param1, param2, param3);
              }
            } else {
              L2: {
                if (((tg) this).field_e) {
                  stackOut_6_0 = ((tg) this).field_a;
                  stackIn_7_0 = stackOut_6_0;
                  break L2;
                } else {
                  stackOut_5_0 = 0;
                  stackIn_7_0 = stackOut_5_0;
                  break L2;
                }
              }
              int discarded$5 = com.ms.win32.User32.SetCursor(stackIn_7_0);
              return 0;
            }
          }
        } else {
          var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
          return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        }
    }

    tg() {
        ((tg) this).field_e = true;
    }
}
