/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vj extends com.ms.dll.Callback {
    private int field_e;
    private volatile boolean field_d;
    private volatile int field_b;
    private volatile int field_c;
    private boolean field_a;

    final void a(java.awt.Component param0, int param1, boolean param2) {
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
        Object stackIn_13_0 = null;
        Object stackIn_14_0 = null;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        Object stackIn_26_0 = null;
        Object stackIn_27_0 = null;
        Object stackIn_28_0 = null;
        int stackIn_28_1 = 0;
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
                    if (param1 == 32512) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    ((vj) this).a(-24, -44, true);
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var9 = null;
                    var5 = var9.getTopHwnd();
                    if (((vj) this).field_c != var5) {
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
                    if (((vj) this).field_d) {
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
                    if (((vj) this).field_a) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    ((vj) this).field_e = com.ms.win32.User32.LoadCursor(0, 32512);
                    int discarded$5 = com.ms.dll.Root.alloc(this);
                    ((vj) this).field_a = true;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    if (((vj) this).field_c != var5) {
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
                    if (!param2) {
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
                    ((vj) this).field_d = stackIn_15_1 != 0;
                    int discarded$6 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
                    return;
                }
                case 16: {
                    if (0 != ((vj) this).field_c) {
                        statePc = 18;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 18: {
                    ((vj) this).field_d = true;
                    int discarded$7 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
                    var6_ref = this;
                    // monitorenter this
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    try {
                        int discarded$8 = com.ms.win32.User32.SetWindowLong(((vj) this).field_c, -4, ((vj) this).field_b);
                        // monitorexit var6_ref
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
                        // monitorexit var6_ref
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
                    var6_ref = this;
                    // monitorenter this
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    try {
                        ((vj) this).field_c = var5;
                        ((vj) this).field_b = com.ms.win32.User32.SetWindowLong(((vj) this).field_c, -4, this);
                        // monitorexit var6_ref
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
                    if (!param2) {
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
                    ((vj) this).field_d = stackIn_28_1 != 0;
                    int discarded$9 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
                    return;
                }
                case 29: {
                    try {
                        var8 = caughtException;
                        // monitorexit var6_ref
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

    final void a(int param0, int param1, boolean param2) {
        boolean discarded$5 = com.ms.win32.User32.SetCursorPos(param1, param0);
        if (param2) {
            int discarded$6 = ((vj) this).callback(101, 84, -67, 91);
        }
    }

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int stackIn_8_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        if (param0 != ((vj) this).field_c) {
          var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
          return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        } else {
          if (32 == param1) {
            var5 = 65535 & param3;
            if ((var5 ^ -1) != -2) {
              if (101024 != param1) {
                if (1 == param1) {
                  ((vj) this).field_c = 0;
                  ((vj) this).field_d = true;
                  return com.ms.win32.User32.CallWindowProc(((vj) this).field_b, param0, param1, param2, param3);
                } else {
                  return com.ms.win32.User32.CallWindowProc(((vj) this).field_b, param0, param1, param2, param3);
                }
              } else {
                L0: {
                  if (!((vj) this).field_d) {
                    stackOut_21_0 = 0;
                    stackIn_22_0 = stackOut_21_0;
                    break L0;
                  } else {
                    stackOut_20_0 = ((vj) this).field_e;
                    stackIn_22_0 = stackOut_20_0;
                    break L0;
                  }
                }
                int discarded$3 = com.ms.win32.User32.SetCursor(stackIn_22_0);
                return 0;
              }
            } else {
              L1: {
                if (!((vj) this).field_d) {
                  stackOut_16_0 = 0;
                  stackIn_17_0 = stackOut_16_0;
                  break L1;
                } else {
                  stackOut_15_0 = ((vj) this).field_e;
                  stackIn_17_0 = stackOut_15_0;
                  break L1;
                }
              }
              int discarded$4 = com.ms.win32.User32.SetCursor(stackIn_17_0);
              return 0;
            }
          } else {
            if (101024 != param1) {
              if (1 == param1) {
                ((vj) this).field_c = 0;
                ((vj) this).field_d = true;
                return com.ms.win32.User32.CallWindowProc(((vj) this).field_b, param0, param1, param2, param3);
              } else {
                return com.ms.win32.User32.CallWindowProc(((vj) this).field_b, param0, param1, param2, param3);
              }
            } else {
              L2: {
                if (!((vj) this).field_d) {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  break L2;
                } else {
                  stackOut_6_0 = ((vj) this).field_e;
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

    vj() {
        ((vj) this).field_d = true;
    }
}
