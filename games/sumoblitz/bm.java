/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bm extends com.ms.dll.Callback {
    private int field_e;
    private volatile boolean field_d;
    private volatile int field_c;
    private boolean field_b;
    private volatile int field_a;

    final void a(boolean param0, boolean param1, java.awt.Component param2) {
        int var5 = 0;
        Object var6 = null;
        Throwable var7 = null;
        Throwable var8 = null;
        com.ms.awt.WComponentPeer var9 = null;
        int stackIn_6_0 = 0;
        Object stackIn_14_0 = null;
        Object stackIn_15_0 = null;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        Object stackIn_26_0 = null;
        Object stackIn_27_0 = null;
        Object stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        Object stackOut_13_0 = null;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
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
                    if (!param0) {
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
                    var9 = null;
                    var5 = var9.getTopHwnd();
                    if (var5 != ((bm) this).field_a) {
                        statePc = 9;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (param1) {
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
                    if (stackIn_6_0 != (((bm) this).field_d ? 1 : 0)) {
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
                    if (!((bm) this).field_b) {
                        statePc = 11;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 11: {
                    ((bm) this).field_e = com.ms.win32.User32.LoadCursor(0, 32512);
                    int discarded$13 = com.ms.dll.Root.alloc(this);
                    ((bm) this).field_b = true;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    if (var5 != ((bm) this).field_a) {
                        statePc = 17;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    stackOut_13_0 = this;
                    stackIn_15_0 = stackOut_13_0;
                    stackIn_14_0 = stackOut_13_0;
                    if (!param1) {
                        statePc = 15;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    stackOut_14_0 = this;
                    stackOut_14_1 = 1;
                    stackIn_16_0 = stackOut_14_0;
                    stackIn_16_1 = stackOut_14_1;
                    statePc = 16;
                    continue stateLoop;
                }
                case 15: {
                    stackOut_15_0 = this;
                    stackOut_15_1 = 0;
                    stackIn_16_0 = stackOut_15_0;
                    stackIn_16_1 = stackOut_15_1;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    ((bm) this).field_d = stackIn_16_1 != 0;
                    int discarded$14 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
                    return;
                }
                case 17: {
                    if (0 == ((bm) this).field_a) {
                        statePc = 23;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    ((bm) this).field_d = true;
                    int discarded$15 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
                    var6 = this;
                    // monitorenter this
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    try {
                        int discarded$16 = com.ms.win32.User32.SetWindowLong(((bm) this).field_a, -4, ((bm) this).field_c);
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
                        ((bm) this).field_a = var5;
                        ((bm) this).field_c = com.ms.win32.User32.SetWindowLong(((bm) this).field_a, -4, this);
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
                    ((bm) this).field_d = stackIn_28_1 != 0;
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
        if (((bm) this).field_a == param0) {
          if (32 == param1) {
            var5 = param3 & 65535;
            if (var5 != 1) {
              if (param1 != 101024) {
                if ((param1 ^ -1) == -2) {
                  ((bm) this).field_a = 0;
                  ((bm) this).field_d = true;
                  return com.ms.win32.User32.CallWindowProc(((bm) this).field_c, param0, param1, param2, param3);
                } else {
                  return com.ms.win32.User32.CallWindowProc(((bm) this).field_c, param0, param1, param2, param3);
                }
              } else {
                L0: {
                  if (!((bm) this).field_d) {
                    stackOut_20_0 = 0;
                    stackIn_21_0 = stackOut_20_0;
                    break L0;
                  } else {
                    stackOut_19_0 = ((bm) this).field_e;
                    stackIn_21_0 = stackOut_19_0;
                    break L0;
                  }
                }
                int discarded$3 = com.ms.win32.User32.SetCursor(stackIn_21_0);
                return 0;
              }
            } else {
              L1: {
                if (((bm) this).field_d) {
                  stackOut_15_0 = ((bm) this).field_e;
                  stackIn_16_0 = stackOut_15_0;
                  break L1;
                } else {
                  stackOut_14_0 = 0;
                  stackIn_16_0 = stackOut_14_0;
                  break L1;
                }
              }
              int discarded$4 = com.ms.win32.User32.SetCursor(stackIn_16_0);
              return 0;
            }
          } else {
            if (param1 != 101024) {
              if ((param1 ^ -1) == -2) {
                ((bm) this).field_a = 0;
                ((bm) this).field_d = true;
                return com.ms.win32.User32.CallWindowProc(((bm) this).field_c, param0, param1, param2, param3);
              } else {
                return com.ms.win32.User32.CallWindowProc(((bm) this).field_c, param0, param1, param2, param3);
              }
            } else {
              L2: {
                if (!((bm) this).field_d) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L2;
                } else {
                  stackOut_5_0 = ((bm) this).field_e;
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

    final void a(int param0, int param1, byte param2) {
        if (param2 <= 53) {
            return;
        }
        boolean discarded$0 = com.ms.win32.User32.SetCursorPos(param1, param0);
    }

    bm() {
        ((bm) this).field_d = true;
    }
}
