/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wg extends com.ms.dll.Callback {
    private int field_c;
    private boolean field_b;
    private volatile int field_a;
    private volatile boolean field_e;
    private volatile int field_d;

    final void a(java.awt.Component param0, boolean param1, int param2) {
        int var5 = 0;
        Object var6 = null;
        Throwable var7 = null;
        Throwable var8 = null;
        com.ms.awt.WComponentPeer var9 = null;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        Object stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        Object stackIn_24_0 = null;
        Object stackIn_25_0 = null;
        Object stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        Object stackOut_17_0 = null;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        Object stackOut_23_0 = null;
        Object stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        Object stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = null;
                    if (param2 < -72) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    ((wg) this).field_c = 127;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var5 = var9.getTopHwnd();
                    if (((wg) this).field_a != var5) {
                        statePc = 5;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (((wg) this).field_e != param1) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    return;
                }
                case 5: {
                    if (!((wg) this).field_b) {
                        statePc = 7;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 7: {
                    ((wg) this).field_c = com.ms.win32.User32.LoadCursor(0, 32512);
                    int discarded$12 = com.ms.dll.Root.alloc(this);
                    ((wg) this).field_b = true;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    if (var5 == ((wg) this).field_a) {
                        statePc = 23;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (-1 == (((wg) this).field_a ^ -1)) {
                        statePc = 15;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    ((wg) this).field_e = true;
                    int discarded$13 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
                    var6 = this;
                    // monitorenter this
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    try {
                        int discarded$14 = com.ms.win32.User32.SetWindowLong(((wg) this).field_a, -4, ((wg) this).field_d);
                        // monitorexit var6
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var7 = caughtException;
                        // monitorexit var6
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 14: {
                    throw (RuntimeException) (Object) var7;
                }
                case 15: {
                    var6 = this;
                    // monitorenter this
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    try {
                        ((wg) this).field_a = var5;
                        ((wg) this).field_d = com.ms.win32.User32.SetWindowLong(((wg) this).field_a, -4, this);
                        // monitorexit var6
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 17: {
                    stackOut_17_0 = this;
                    stackIn_19_0 = stackOut_17_0;
                    stackIn_18_0 = stackOut_17_0;
                    if (!param1) {
                        statePc = 19;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    stackOut_18_0 = this;
                    stackOut_18_1 = 1;
                    stackIn_20_0 = stackOut_18_0;
                    stackIn_20_1 = stackOut_18_1;
                    statePc = 20;
                    continue stateLoop;
                }
                case 19: {
                    stackOut_19_0 = this;
                    stackOut_19_1 = 0;
                    stackIn_20_0 = stackOut_19_0;
                    stackIn_20_1 = stackOut_19_1;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    ((wg) this).field_e = stackIn_20_1 != 0;
                    int discarded$15 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
                    return;
                }
                case 21: {
                    try {
                        var8 = caughtException;
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
                    throw (RuntimeException) (Object) var8;
                }
                case 23: {
                    stackOut_23_0 = this;
                    stackIn_25_0 = stackOut_23_0;
                    stackIn_24_0 = stackOut_23_0;
                    if (!param1) {
                        statePc = 25;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    stackOut_24_0 = this;
                    stackOut_24_1 = 1;
                    stackIn_26_0 = stackOut_24_0;
                    stackIn_26_1 = stackOut_24_1;
                    statePc = 26;
                    continue stateLoop;
                }
                case 25: {
                    stackOut_25_0 = this;
                    stackOut_25_1 = 0;
                    stackIn_26_0 = stackOut_25_0;
                    stackIn_26_1 = stackOut_25_1;
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    ((wg) this).field_e = stackIn_26_1 != 0;
                    int discarded$16 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, byte param1, int param2) {
        boolean discarded$5 = com.ms.win32.User32.SetCursorPos(param2, param0);
        if (param1 != -40) {
            int discarded$6 = ((wg) this).callback(-26, -63, -123, 69);
        }
    }

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int stackIn_9_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        if (param0 != ((wg) this).field_a) {
          var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
          return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        } else {
          if ((param1 ^ -1) == -33) {
            var5 = 65535 & param3;
            if ((var5 ^ -1) != -2) {
              if (param1 == 101024) {
                L0: {
                  if (((wg) this).field_e) {
                    stackOut_23_0 = ((wg) this).field_c;
                    stackIn_24_0 = stackOut_23_0;
                    break L0;
                  } else {
                    stackOut_22_0 = 0;
                    stackIn_24_0 = stackOut_22_0;
                    break L0;
                  }
                }
                int discarded$6 = com.ms.win32.User32.SetCursor(stackIn_24_0);
                return 0;
              } else {
                L1: {
                  if (-2 == (param1 ^ -1)) {
                    ((wg) this).field_a = 0;
                    ((wg) this).field_e = true;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                return com.ms.win32.User32.CallWindowProc(((wg) this).field_d, param0, param1, param2, param3);
              }
            } else {
              L2: {
                if (!((wg) this).field_e) {
                  stackOut_17_0 = 0;
                  stackIn_18_0 = stackOut_17_0;
                  break L2;
                } else {
                  stackOut_16_0 = ((wg) this).field_c;
                  stackIn_18_0 = stackOut_16_0;
                  break L2;
                }
              }
              int discarded$7 = com.ms.win32.User32.SetCursor(stackIn_18_0);
              return 0;
            }
          } else {
            if (param1 == 101024) {
              L3: {
                if (((wg) this).field_e) {
                  stackOut_8_0 = ((wg) this).field_c;
                  stackIn_9_0 = stackOut_8_0;
                  break L3;
                } else {
                  stackOut_7_0 = 0;
                  stackIn_9_0 = stackOut_7_0;
                  break L3;
                }
              }
              int discarded$8 = com.ms.win32.User32.SetCursor(stackIn_9_0);
              return 0;
            } else {
              L4: {
                if (-2 == (param1 ^ -1)) {
                  ((wg) this).field_a = 0;
                  ((wg) this).field_e = true;
                  break L4;
                } else {
                  break L4;
                }
              }
              return com.ms.win32.User32.CallWindowProc(((wg) this).field_d, param0, param1, param2, param3);
            }
          }
        }
    }

    wg() {
        ((wg) this).field_e = true;
    }
}
