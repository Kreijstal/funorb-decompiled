/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hj extends com.ms.dll.Callback {
    private volatile int field_e;
    private volatile int field_d;
    private volatile boolean field_b;
    private boolean field_a;
    private int field_c;

    final void a(int param0, int param1, int param2) {
        boolean discarded$4 = com.ms.win32.User32.SetCursorPos(param2, param0);
        if (param1 <= 60) {
            ((hj) this).field_b = false;
        }
    }

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int stackIn_11_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_26_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        if (((hj) this).field_e == param0) {
          if (32 == param1) {
            var5 = param3 & 65535;
            if (1 != var5) {
              if (param1 == 101024) {
                L0: {
                  if (!((hj) this).field_b) {
                    stackOut_25_0 = 0;
                    stackIn_26_0 = stackOut_25_0;
                    break L0;
                  } else {
                    stackOut_24_0 = ((hj) this).field_c;
                    stackIn_26_0 = stackOut_24_0;
                    break L0;
                  }
                }
                int discarded$3 = com.ms.win32.User32.SetCursor(stackIn_26_0);
                return 0;
              } else {
                L1: {
                  if ((param1 ^ -1) == -2) {
                    ((hj) this).field_e = 0;
                    ((hj) this).field_b = true;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                return com.ms.win32.User32.CallWindowProc(((hj) this).field_d, param0, param1, param2, param3);
              }
            } else {
              L2: {
                if (!((hj) this).field_b) {
                  stackOut_16_0 = 0;
                  stackIn_17_0 = stackOut_16_0;
                  break L2;
                } else {
                  stackOut_15_0 = ((hj) this).field_c;
                  stackIn_17_0 = stackOut_15_0;
                  break L2;
                }
              }
              int discarded$4 = com.ms.win32.User32.SetCursor(stackIn_17_0);
              return 0;
            }
          } else {
            if (param1 == 101024) {
              L3: {
                if (!((hj) this).field_b) {
                  stackOut_10_0 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  break L3;
                } else {
                  stackOut_9_0 = ((hj) this).field_c;
                  stackIn_11_0 = stackOut_9_0;
                  break L3;
                }
              }
              int discarded$5 = com.ms.win32.User32.SetCursor(stackIn_11_0);
              return 0;
            } else {
              L4: {
                if ((param1 ^ -1) == -2) {
                  ((hj) this).field_e = 0;
                  ((hj) this).field_b = true;
                  break L4;
                } else {
                  break L4;
                }
              }
              return com.ms.win32.User32.CallWindowProc(((hj) this).field_d, param0, param1, param2, param3);
            }
          }
        } else {
          var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
          return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        }
    }

    final void a(int param0, boolean param1, java.awt.Component param2) {
        int var5 = 0;
        Object var6 = null;
        Throwable var7 = null;
        Throwable var8 = null;
        com.ms.awt.WComponentPeer var9 = null;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        Object stackIn_22_0 = null;
        Object stackIn_23_0 = null;
        Object stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        Object stackOut_9_0 = null;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        Object stackOut_21_0 = null;
        Object stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        Object stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = null;
                    var5 = var9.getTopHwnd();
                    if (var5 != ((hj) this).field_e) {
                        statePc = 3;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    if (param1 != ((hj) this).field_b) {
                        statePc = 3;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    return;
                }
                case 3: {
                    if (param0 > 40) {
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
                    if (!((hj) this).field_a) {
                        statePc = 7;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 7: {
                    ((hj) this).field_c = com.ms.win32.User32.LoadCursor(0, 32512);
                    int discarded$13 = com.ms.dll.Root.alloc(this);
                    ((hj) this).field_a = true;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    if (var5 != ((hj) this).field_e) {
                        statePc = 13;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    stackOut_9_0 = this;
                    stackIn_11_0 = stackOut_9_0;
                    stackIn_10_0 = stackOut_9_0;
                    if (!param1) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    stackOut_10_0 = this;
                    stackOut_10_1 = 1;
                    stackIn_12_0 = stackOut_10_0;
                    stackIn_12_1 = stackOut_10_1;
                    statePc = 12;
                    continue stateLoop;
                }
                case 11: {
                    stackOut_11_0 = this;
                    stackOut_11_1 = 0;
                    stackIn_12_0 = stackOut_11_0;
                    stackIn_12_1 = stackOut_11_1;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    ((hj) this).field_b = stackIn_12_1 != 0;
                    int discarded$14 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
                    return;
                }
                case 13: {
                    if (((hj) this).field_e == 0) {
                        statePc = 19;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    ((hj) this).field_b = true;
                    int discarded$15 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
                    var6 = this;
                    // monitorenter this
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    try {
                        int discarded$16 = com.ms.win32.User32.SetWindowLong(((hj) this).field_e, -4, ((hj) this).field_d);
                        // monitorexit var6
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var7 = caughtException;
                        // monitorexit var6
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 18: {
                    throw (RuntimeException) (Object) var7;
                }
                case 19: {
                    var6 = this;
                    // monitorenter this
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    try {
                        ((hj) this).field_e = var5;
                        ((hj) this).field_d = com.ms.win32.User32.SetWindowLong(((hj) this).field_e, -4, this);
                        // monitorexit var6
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 21: {
                    stackOut_21_0 = this;
                    stackIn_23_0 = stackOut_21_0;
                    stackIn_22_0 = stackOut_21_0;
                    if (!param1) {
                        statePc = 23;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    stackOut_22_0 = this;
                    stackOut_22_1 = 1;
                    stackIn_24_0 = stackOut_22_0;
                    stackIn_24_1 = stackOut_22_1;
                    statePc = 24;
                    continue stateLoop;
                }
                case 23: {
                    stackOut_23_0 = this;
                    stackOut_23_1 = 0;
                    stackIn_24_0 = stackOut_23_0;
                    stackIn_24_1 = stackOut_23_1;
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    ((hj) this).field_b = stackIn_24_1 != 0;
                    int discarded$17 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
                    return;
                }
                case 25: {
                    try {
                        var8 = caughtException;
                        // monitorexit var6
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 26: {
                    throw (RuntimeException) (Object) var8;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    hj() {
        ((hj) this).field_b = true;
    }
}
