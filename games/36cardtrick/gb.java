/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gb extends com.ms.dll.Callback {
    private volatile int field_e;
    private volatile boolean field_c;
    private int field_d;
    private volatile int field_b;
    private boolean field_a;

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
        if (((gb) this).field_b != param0) {
          var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
          return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        } else {
          if (-33 == (param1 ^ -1)) {
            var5 = 65535 & param3;
            if (1 != var5) {
              if (param1 == 101024) {
                L0: {
                  if (!((gb) this).field_c) {
                    stackOut_23_0 = 0;
                    stackIn_24_0 = stackOut_23_0;
                    break L0;
                  } else {
                    stackOut_22_0 = ((gb) this).field_d;
                    stackIn_24_0 = stackOut_22_0;
                    break L0;
                  }
                }
                int discarded$6 = com.ms.win32.User32.SetCursor(stackIn_24_0);
                return 0;
              } else {
                L1: {
                  if (param1 == 1) {
                    ((gb) this).field_b = 0;
                    ((gb) this).field_c = true;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                return com.ms.win32.User32.CallWindowProc(((gb) this).field_e, param0, param1, param2, param3);
              }
            } else {
              L2: {
                if (((gb) this).field_c) {
                  stackOut_17_0 = ((gb) this).field_d;
                  stackIn_18_0 = stackOut_17_0;
                  break L2;
                } else {
                  stackOut_16_0 = 0;
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
                if (!((gb) this).field_c) {
                  stackOut_8_0 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  break L3;
                } else {
                  stackOut_7_0 = ((gb) this).field_d;
                  stackIn_9_0 = stackOut_7_0;
                  break L3;
                }
              }
              int discarded$8 = com.ms.win32.User32.SetCursor(stackIn_9_0);
              return 0;
            } else {
              L4: {
                if (param1 == 1) {
                  ((gb) this).field_b = 0;
                  ((gb) this).field_c = true;
                  break L4;
                } else {
                  break L4;
                }
              }
              return com.ms.win32.User32.CallWindowProc(((gb) this).field_e, param0, param1, param2, param3);
            }
          }
        }
    }

    final void a(boolean param0, java.awt.Component param1, int param2) {
        int var5 = 0;
        Object var6 = null;
        Object var6_ref = null;
        Throwable var7 = null;
        Throwable var8 = null;
        com.ms.awt.WComponentPeer var9 = null;
        int stackIn_6_0 = 0;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        Object stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        Object stackIn_25_0 = null;
        Object stackIn_26_0 = null;
        Object stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        Object stackOut_11_0 = null;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        Object stackOut_24_0 = null;
        Object stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        Object stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (param2 == -4) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    ((gb) this).field_e = 72;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var9 = (com.ms.awt.WComponentPeer) null;
                    var5 = var9.getTopHwnd();
                    if (((gb) this).field_b != var5) {
                        statePc = 8;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (((gb) this).field_c) {
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
                    if (stackIn_6_0 == (param0 ? 1 : 0)) {
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
                    if (((gb) this).field_a) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    ((gb) this).field_d = com.ms.win32.User32.LoadCursor(0, 32512);
                    int discarded$5 = com.ms.dll.Root.alloc(this);
                    ((gb) this).field_a = true;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    if (var5 != ((gb) this).field_b) {
                        statePc = 15;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    stackOut_11_0 = this;
                    stackIn_13_0 = stackOut_11_0;
                    stackIn_12_0 = stackOut_11_0;
                    if (!param0) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    stackOut_12_0 = this;
                    stackOut_12_1 = 1;
                    stackIn_14_0 = stackOut_12_0;
                    stackIn_14_1 = stackOut_12_1;
                    statePc = 14;
                    continue stateLoop;
                }
                case 13: {
                    stackOut_13_0 = this;
                    stackOut_13_1 = 0;
                    stackIn_14_0 = stackOut_13_0;
                    stackIn_14_1 = stackOut_13_1;
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    ((gb) this).field_c = stackIn_14_1 != 0;
                    int discarded$6 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
                    return;
                }
                case 15: {
                    if (0 != ((gb) this).field_b) {
                        statePc = 17;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 17: {
                    ((gb) this).field_c = true;
                    int discarded$7 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
                    var6_ref = this;
                    // monitorenter this
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    try {
                        int discarded$8 = com.ms.win32.User32.SetWindowLong(((gb) this).field_b, -4, ((gb) this).field_e);
                        // monitorexit var6_ref
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var7 = caughtException;
                        // monitorexit var6_ref
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 21: {
                    throw (RuntimeException) (Object) var7;
                }
                case 22: {
                    var6_ref = this;
                    // monitorenter this
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    try {
                        ((gb) this).field_b = var5;
                        ((gb) this).field_e = com.ms.win32.User32.SetWindowLong(((gb) this).field_b, -4, this);
                        // monitorexit var6_ref
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 24: {
                    stackOut_24_0 = this;
                    stackIn_26_0 = stackOut_24_0;
                    stackIn_25_0 = stackOut_24_0;
                    if (!param0) {
                        statePc = 26;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    stackOut_25_0 = this;
                    stackOut_25_1 = 1;
                    stackIn_27_0 = stackOut_25_0;
                    stackIn_27_1 = stackOut_25_1;
                    statePc = 27;
                    continue stateLoop;
                }
                case 26: {
                    stackOut_26_0 = this;
                    stackOut_26_1 = 0;
                    stackIn_27_0 = stackOut_26_0;
                    stackIn_27_1 = stackOut_26_1;
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    ((gb) this).field_c = stackIn_27_1 != 0;
                    int discarded$9 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
                    return;
                }
                case 28: {
                    try {
                        var8 = caughtException;
                        // monitorexit var6_ref
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 29: {
                    throw (RuntimeException) (Object) var8;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param2 != 32512) {
          int discarded$6 = ((gb) this).callback(18, -64, -120, -4);
          boolean discarded$7 = com.ms.win32.User32.SetCursorPos(param0, param1);
          return;
        } else {
          boolean discarded$8 = com.ms.win32.User32.SetCursorPos(param0, param1);
          return;
        }
    }

    gb() {
        ((gb) this).field_c = true;
    }
}
