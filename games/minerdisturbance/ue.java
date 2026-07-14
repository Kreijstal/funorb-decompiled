/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ue extends com.ms.dll.Callback {
    private volatile int field_b;
    private volatile int field_d;
    private volatile boolean field_c;
    private int field_e;
    private boolean field_a;

    final void a(int param0, java.awt.Component param1, boolean param2) {
        int var5 = 0;
        Object var6 = null;
        Throwable var7 = null;
        Throwable var8 = null;
        com.ms.awt.WComponentPeer var9 = null;
        boolean stackIn_2_0 = false;
        boolean stackIn_3_0 = false;
        boolean stackIn_4_0 = false;
        int stackIn_4_1 = 0;
        Object stackIn_21_0 = null;
        Object stackIn_22_0 = null;
        Object stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        Object stackIn_27_0 = null;
        Object stackIn_28_0 = null;
        Object stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        boolean stackOut_1_0 = false;
        boolean stackOut_2_0 = false;
        int stackOut_2_1 = 0;
        boolean stackOut_3_0 = false;
        int stackOut_3_1 = 0;
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
                    var9 = null;
                    var5 = var9.getTopHwnd();
                    if (((ue) this).field_d != var5) {
                        statePc = 7;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    stackOut_1_0 = param2;
                    stackIn_3_0 = stackOut_1_0;
                    stackIn_2_0 = stackOut_1_0;
                    if (((ue) this).field_c) {
                        statePc = 3;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    stackOut_2_0 = stackIn_2_0;
                    stackOut_2_1 = 1;
                    stackIn_4_0 = stackOut_2_0;
                    stackIn_4_1 = stackOut_2_1;
                    statePc = 4;
                    continue stateLoop;
                }
                case 3: {
                    stackOut_3_0 = stackIn_3_0;
                    stackOut_3_1 = 0;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    if ((stackIn_4_0 ? 1 : 0) != stackIn_4_1) {
                        statePc = 6;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 6: {
                    return;
                }
                case 7: {
                    if (!((ue) this).field_a) {
                        statePc = 9;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 9: {
                    ((ue) this).field_e = com.ms.win32.User32.LoadCursor(0, 32512);
                    int discarded$12 = com.ms.dll.Root.alloc(this);
                    ((ue) this).field_a = true;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    if (((ue) this).field_d == var5) {
                        statePc = 26;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (((ue) this).field_d != 0) {
                        statePc = 13;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 13: {
                    ((ue) this).field_c = true;
                    int discarded$13 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
                    var6 = this;
                    // monitorenter this
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    try {
                        int discarded$14 = com.ms.win32.User32.SetWindowLong(((ue) this).field_d, -4, ((ue) this).field_b);
                        // monitorexit var6
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
                        // monitorexit var6
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
                    var6 = this;
                    // monitorenter this
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    try {
                        ((ue) this).field_d = var5;
                        ((ue) this).field_b = com.ms.win32.User32.SetWindowLong(((ue) this).field_d, -4, this);
                        // monitorexit var6
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
                    ((ue) this).field_c = stackIn_23_1 != 0;
                    int discarded$15 = com.ms.win32.User32.SendMessage(var5, 101024, param0, 0);
                    return;
                }
                case 24: {
                    try {
                        var8 = caughtException;
                        // monitorexit var6
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
                    ((ue) this).field_c = stackIn_29_1 != 0;
                    int discarded$16 = com.ms.win32.User32.SendMessage(var5, 101024, param0, 0);
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
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
        if (((ue) this).field_d != param0) {
          var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
          return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        } else {
          if (32 == param1) {
            var5 = 65535 & param3;
            if (-2 != (var5 ^ -1)) {
              if (101024 == param1) {
                L0: {
                  if (((ue) this).field_c) {
                    stackOut_23_0 = ((ue) this).field_e;
                    stackIn_24_0 = stackOut_23_0;
                    break L0;
                  } else {
                    stackOut_22_0 = 0;
                    stackIn_24_0 = stackOut_22_0;
                    break L0;
                  }
                }
                int discarded$3 = com.ms.win32.User32.SetCursor(stackIn_24_0);
                return 0;
              } else {
                if ((param1 ^ -1) == -2) {
                  ((ue) this).field_d = 0;
                  ((ue) this).field_c = true;
                  return com.ms.win32.User32.CallWindowProc(((ue) this).field_b, param0, param1, param2, param3);
                } else {
                  return com.ms.win32.User32.CallWindowProc(((ue) this).field_b, param0, param1, param2, param3);
                }
              }
            } else {
              L1: {
                if (((ue) this).field_c) {
                  stackOut_17_0 = ((ue) this).field_e;
                  stackIn_18_0 = stackOut_17_0;
                  break L1;
                } else {
                  stackOut_16_0 = 0;
                  stackIn_18_0 = stackOut_16_0;
                  break L1;
                }
              }
              int discarded$4 = com.ms.win32.User32.SetCursor(stackIn_18_0);
              return 0;
            }
          } else {
            if (101024 == param1) {
              L2: {
                if (((ue) this).field_c) {
                  stackOut_8_0 = ((ue) this).field_e;
                  stackIn_9_0 = stackOut_8_0;
                  break L2;
                } else {
                  stackOut_7_0 = 0;
                  stackIn_9_0 = stackOut_7_0;
                  break L2;
                }
              }
              int discarded$5 = com.ms.win32.User32.SetCursor(stackIn_9_0);
              return 0;
            } else {
              if ((param1 ^ -1) == -2) {
                ((ue) this).field_d = 0;
                ((ue) this).field_c = true;
                return com.ms.win32.User32.CallWindowProc(((ue) this).field_b, param0, param1, param2, param3);
              } else {
                return com.ms.win32.User32.CallWindowProc(((ue) this).field_b, param0, param1, param2, param3);
              }
            }
          }
        }
    }

    final void a(boolean param0, int param1, int param2) {
        boolean discarded$5 = com.ms.win32.User32.SetCursorPos(param1, param2);
        if (param0) {
            ((ue) this).a(true, 69, -117);
        }
    }

    ue() {
        ((ue) this).field_c = true;
    }
}
