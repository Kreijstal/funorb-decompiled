/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cl extends com.ms.dll.Callback {
    private volatile int field_a;
    private volatile int field_d;
    private boolean field_c;
    private int field_e;
    private volatile boolean field_b;

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        if (((cl) this).field_d != param0) {
          var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
          return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        } else {
          if (-33 != param1) {
            if (param1 != 101024) {
              if (param1 == 1) {
                ((cl) this).field_d = 0;
                ((cl) this).field_b = true;
                return com.ms.win32.User32.CallWindowProc(((cl) this).field_a, param0, param1, param2, param3);
              } else {
                return com.ms.win32.User32.CallWindowProc(((cl) this).field_a, param0, param1, param2, param3);
              }
            } else {
              L0: {
                if (((cl) this).field_b) {
                  stackOut_21_0 = ((cl) this).field_e;
                  stackIn_22_0 = stackOut_21_0;
                  break L0;
                } else {
                  stackOut_20_0 = 0;
                  stackIn_22_0 = stackOut_20_0;
                  break L0;
                }
              }
              int discarded$3 = com.ms.win32.User32.SetCursor(stackIn_22_0);
              return 0;
            }
          } else {
            var5 = param3 & 65535;
            if (-2 != var5) {
              if (param1 != 101024) {
                if (param1 == 1) {
                  ((cl) this).field_d = 0;
                  ((cl) this).field_b = true;
                  return com.ms.win32.User32.CallWindowProc(((cl) this).field_a, param0, param1, param2, param3);
                } else {
                  return com.ms.win32.User32.CallWindowProc(((cl) this).field_a, param0, param1, param2, param3);
                }
              } else {
                L1: {
                  if (((cl) this).field_b) {
                    stackOut_12_0 = ((cl) this).field_e;
                    stackIn_13_0 = stackOut_12_0;
                    break L1;
                  } else {
                    stackOut_11_0 = 0;
                    stackIn_13_0 = stackOut_11_0;
                    break L1;
                  }
                }
                int discarded$4 = com.ms.win32.User32.SetCursor(stackIn_13_0);
                return 0;
              }
            } else {
              L2: {
                if (((cl) this).field_b) {
                  stackOut_7_0 = ((cl) this).field_e;
                  stackIn_8_0 = stackOut_7_0;
                  break L2;
                } else {
                  stackOut_6_0 = 0;
                  stackIn_8_0 = stackOut_6_0;
                  break L2;
                }
              }
              int discarded$5 = com.ms.win32.User32.SetCursor(stackIn_8_0);
              return 0;
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
        boolean stackIn_4_0 = false;
        boolean stackIn_5_0 = false;
        boolean stackIn_6_0 = false;
        int stackIn_6_1 = 0;
        Object stackIn_13_0 = null;
        Object stackIn_14_0 = null;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        Object stackIn_25_0 = null;
        Object stackIn_26_0 = null;
        Object stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        boolean stackOut_3_0 = false;
        boolean stackOut_4_0 = false;
        int stackOut_4_1 = 0;
        boolean stackOut_5_0 = false;
        int stackOut_5_1 = 0;
        Object stackOut_12_0 = null;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
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
                    if (param2 == -1101) {
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
                    if (var5 != ((cl) this).field_d) {
                        statePc = 9;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    stackOut_3_0 = ((cl) this).field_b;
                    stackIn_5_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (param1) {
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
                    if (((cl) this).field_c) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    ((cl) this).field_e = com.ms.win32.User32.LoadCursor(0, 32512);
                    int discarded$13 = com.ms.dll.Root.alloc(this);
                    ((cl) this).field_c = true;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    if (var5 != ((cl) this).field_d) {
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
                    ((cl) this).field_b = stackIn_15_1 != 0;
                    int discarded$14 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
                    return;
                }
                case 16: {
                    if (((cl) this).field_d == 0) {
                        statePc = 22;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    ((cl) this).field_b = true;
                    int discarded$15 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
                    var6 = this;
                    // monitorenter this
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    try {
                        int discarded$16 = com.ms.win32.User32.SetWindowLong(((cl) this).field_d, -4, ((cl) this).field_a);
                        // monitorexit var6
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
                        // monitorexit var6
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
                    var6 = this;
                    // monitorenter this
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    try {
                        ((cl) this).field_d = var5;
                        ((cl) this).field_a = com.ms.win32.User32.SetWindowLong(((cl) this).field_d, -4, this);
                        // monitorexit var6
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
                    if (!param1) {
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
                    ((cl) this).field_b = stackIn_27_1 != 0;
                    int discarded$17 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
                    return;
                }
                case 28: {
                    try {
                        var8 = caughtException;
                        // monitorexit var6
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
        boolean discarded$4 = com.ms.win32.User32.SetCursorPos(param2, param0);
        if (param1 >= -10) {
            Object var5 = null;
            ((cl) this).a((java.awt.Component) null, true, 29);
        }
    }

    cl() {
        ((cl) this).field_b = true;
    }
}
