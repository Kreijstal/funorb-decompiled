/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ld extends com.ms.dll.Callback {
    private volatile int field_d;
    private boolean field_c;
    private volatile int field_e;
    private int field_a;
    private volatile boolean field_b;

    final void a(int param0, int param1, int param2) {
        boolean discarded$0 = com.ms.win32.User32.SetCursorPos(param0, param2);
        int var4 = 38 % ((param1 - -23) / 46);
    }

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int stackIn_12_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_27_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        if (((ld) this).field_d != param0) {
          var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
          return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        } else {
          if (32 == param1) {
            var5 = 65535 & param3;
            if (-2 != (var5 ^ -1)) {
              if (param1 == 101024) {
                L0: {
                  if (!((ld) this).field_b) {
                    stackOut_26_0 = 0;
                    stackIn_27_0 = stackOut_26_0;
                    break L0;
                  } else {
                    stackOut_25_0 = ((ld) this).field_a;
                    stackIn_27_0 = stackOut_25_0;
                    break L0;
                  }
                }
                int discarded$3 = com.ms.win32.User32.SetCursor(stackIn_27_0);
                return 0;
              } else {
                L1: {
                  if ((param1 ^ -1) == -2) {
                    ((ld) this).field_d = 0;
                    ((ld) this).field_b = true;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                return com.ms.win32.User32.CallWindowProc(((ld) this).field_e, param0, param1, param2, param3);
              }
            } else {
              L2: {
                if (((ld) this).field_b) {
                  stackOut_17_0 = ((ld) this).field_a;
                  stackIn_18_0 = stackOut_17_0;
                  break L2;
                } else {
                  stackOut_16_0 = 0;
                  stackIn_18_0 = stackOut_16_0;
                  break L2;
                }
              }
              int discarded$4 = com.ms.win32.User32.SetCursor(stackIn_18_0);
              return 0;
            }
          } else {
            if (param1 == 101024) {
              L3: {
                if (!((ld) this).field_b) {
                  stackOut_11_0 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  break L3;
                } else {
                  stackOut_10_0 = ((ld) this).field_a;
                  stackIn_12_0 = stackOut_10_0;
                  break L3;
                }
              }
              int discarded$5 = com.ms.win32.User32.SetCursor(stackIn_12_0);
              return 0;
            } else {
              L4: {
                if ((param1 ^ -1) == -2) {
                  ((ld) this).field_d = 0;
                  ((ld) this).field_b = true;
                  break L4;
                } else {
                  break L4;
                }
              }
              return com.ms.win32.User32.CallWindowProc(((ld) this).field_e, param0, param1, param2, param3);
            }
          }
        }
    }

    final void a(java.awt.Component param0, boolean param1, int param2) {
        int var5 = 0;
        Object var6 = null;
        Throwable var7 = null;
        Throwable var8 = null;
        com.ms.awt.WComponentPeer var9 = null;
        int stackIn_4_0 = 0;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        Object stackIn_23_0 = null;
        Object stackIn_24_0 = null;
        Object stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_3_0 = 0;
        Object stackOut_9_0 = null;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        Object stackOut_22_0 = null;
        Object stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        Object stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = null;
                    var5 = var9.getTopHwnd();
                    if (var5 != ((ld) this).field_d) {
                        statePc = 6;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    if (((ld) this).field_b) {
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
                    if (((ld) this).field_c) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    ((ld) this).field_a = com.ms.win32.User32.LoadCursor(0, 32512);
                    int discarded$13 = com.ms.dll.Root.alloc(this);
                    ((ld) this).field_c = true;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    if (((ld) this).field_d != var5) {
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
                    ((ld) this).field_b = stackIn_12_1 != 0;
                    int discarded$14 = com.ms.win32.User32.SendMessage(var5, 101024, 0, param2);
                    return;
                }
                case 13: {
                    if (-1 != (((ld) this).field_d ^ -1)) {
                        statePc = 15;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 15: {
                    ((ld) this).field_b = true;
                    int discarded$15 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
                    var6 = this;
                    // monitorenter this
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    try {
                        int discarded$16 = com.ms.win32.User32.SetWindowLong(((ld) this).field_d, -4, ((ld) this).field_e);
                        // monitorexit var6
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var7 = caughtException;
                        // monitorexit var6
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 19: {
                    throw (RuntimeException) (Object) var7;
                }
                case 20: {
                    var6 = this;
                    // monitorenter this
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    try {
                        ((ld) this).field_d = var5;
                        ((ld) this).field_e = com.ms.win32.User32.SetWindowLong(((ld) this).field_d, -4, this);
                        // monitorexit var6
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 22: {
                    stackOut_22_0 = this;
                    stackIn_24_0 = stackOut_22_0;
                    stackIn_23_0 = stackOut_22_0;
                    if (!param1) {
                        statePc = 24;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    stackOut_23_0 = this;
                    stackOut_23_1 = 1;
                    stackIn_25_0 = stackOut_23_0;
                    stackIn_25_1 = stackOut_23_1;
                    statePc = 25;
                    continue stateLoop;
                }
                case 24: {
                    stackOut_24_0 = this;
                    stackOut_24_1 = 0;
                    stackIn_25_0 = stackOut_24_0;
                    stackIn_25_1 = stackOut_24_1;
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    ((ld) this).field_b = stackIn_25_1 != 0;
                    int discarded$17 = com.ms.win32.User32.SendMessage(var5, 101024, 0, param2);
                    return;
                }
                case 26: {
                    try {
                        var8 = caughtException;
                        // monitorexit var6
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 27: {
                    throw (RuntimeException) (Object) var8;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    ld() {
        ((ld) this).field_b = true;
    }
}
