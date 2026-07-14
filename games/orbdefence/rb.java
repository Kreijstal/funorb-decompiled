/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rb extends com.ms.dll.Callback {
    private volatile boolean field_e;
    private volatile int field_a;
    private boolean field_b;
    private int field_d;
    private volatile int field_c;

    final void a(int param0, int param1, int param2) {
        if (param2 > -89) {
            ((rb) this).a(-75, -95, -122);
            boolean discarded$0 = com.ms.win32.User32.SetCursorPos(param1, param0);
            return;
        }
        boolean discarded$1 = com.ms.win32.User32.SetCursorPos(param1, param0);
    }

    final void a(int param0, java.awt.Component param1, boolean param2) {
        int var5 = 0;
        Object var6 = null;
        Object var6_ref = null;
        Throwable var7 = null;
        Throwable var8 = null;
        com.ms.awt.WComponentPeer var9 = null;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        Object stackIn_25_0 = null;
        Object stackIn_26_0 = null;
        Object stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        Object stackIn_31_0 = null;
        Object stackIn_32_0 = null;
        Object stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        Object stackOut_24_0 = null;
        Object stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        Object stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        Object stackOut_30_0 = null;
        Object stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        Object stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = null;
                    var5 = var9.getTopHwnd();
                    if (param0 == 32512) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    int discarded$6 = ((rb) this).callback(26, -83, -16, -117);
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (((rb) this).field_c != var5) {
                        statePc = 12;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (((rb) this).field_e) {
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
                    stackOut_6_0 = stackIn_6_0;
                    stackIn_8_0 = stackOut_6_0;
                    stackIn_7_0 = stackOut_6_0;
                    if (param2) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    stackOut_7_0 = stackIn_7_0;
                    stackOut_7_1 = 1;
                    stackIn_9_0 = stackOut_7_0;
                    stackIn_9_1 = stackOut_7_1;
                    statePc = 9;
                    continue stateLoop;
                }
                case 8: {
                    stackOut_8_0 = stackIn_8_0;
                    stackOut_8_1 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    stackIn_9_1 = stackOut_8_1;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    if (stackIn_9_0 == stackIn_9_1) {
                        statePc = 11;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 11: {
                    return;
                }
                case 12: {
                    if (((rb) this).field_b) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    ((rb) this).field_d = com.ms.win32.User32.LoadCursor(0, 32512);
                    int discarded$7 = com.ms.dll.Root.alloc(this);
                    ((rb) this).field_b = true;
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    if (var5 == ((rb) this).field_c) {
                        statePc = 30;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if (-1 != (((rb) this).field_c ^ -1)) {
                        statePc = 17;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 17: {
                    ((rb) this).field_e = true;
                    int discarded$8 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
                    var6_ref = this;
                    // monitorenter this
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    try {
                        int discarded$9 = com.ms.win32.User32.SetWindowLong(((rb) this).field_c, -4, ((rb) this).field_a);
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
                        ((rb) this).field_c = var5;
                        ((rb) this).field_a = com.ms.win32.User32.SetWindowLong(((rb) this).field_c, -4, this);
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
                    if (!param2) {
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
                    ((rb) this).field_e = stackIn_27_1 != 0;
                    int discarded$10 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
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
                case 30: {
                    stackOut_30_0 = this;
                    stackIn_32_0 = stackOut_30_0;
                    stackIn_31_0 = stackOut_30_0;
                    if (!param2) {
                        statePc = 32;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    stackOut_31_0 = this;
                    stackOut_31_1 = 1;
                    stackIn_33_0 = stackOut_31_0;
                    stackIn_33_1 = stackOut_31_1;
                    statePc = 33;
                    continue stateLoop;
                }
                case 32: {
                    stackOut_32_0 = this;
                    stackOut_32_1 = 0;
                    stackIn_33_0 = stackOut_32_0;
                    stackIn_33_1 = stackOut_32_1;
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    ((rb) this).field_e = stackIn_33_1 != 0;
                    int discarded$11 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
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
        if (param0 == ((rb) this).field_c) {
          if (param1 == -33) {
            var5 = param3 & 65535;
            if (1 != var5) {
              if (101024 == param1) {
                L0: {
                  if (!((rb) this).field_e) {
                    stackOut_25_0 = 0;
                    stackIn_26_0 = stackOut_25_0;
                    break L0;
                  } else {
                    stackOut_24_0 = ((rb) this).field_d;
                    stackIn_26_0 = stackOut_24_0;
                    break L0;
                  }
                }
                int discarded$3 = com.ms.win32.User32.SetCursor(stackIn_26_0);
                return 0;
              } else {
                L1: {
                  if (-2 == (param1 ^ -1)) {
                    ((rb) this).field_c = 0;
                    ((rb) this).field_e = true;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                return com.ms.win32.User32.CallWindowProc(((rb) this).field_a, param0, param1, param2, param3);
              }
            } else {
              L2: {
                if (!((rb) this).field_e) {
                  stackOut_16_0 = 0;
                  stackIn_17_0 = stackOut_16_0;
                  break L2;
                } else {
                  stackOut_15_0 = ((rb) this).field_d;
                  stackIn_17_0 = stackOut_15_0;
                  break L2;
                }
              }
              int discarded$4 = com.ms.win32.User32.SetCursor(stackIn_17_0);
              return 0;
            }
          } else {
            if (101024 == param1) {
              L3: {
                if (!((rb) this).field_e) {
                  stackOut_10_0 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  break L3;
                } else {
                  stackOut_9_0 = ((rb) this).field_d;
                  stackIn_11_0 = stackOut_9_0;
                  break L3;
                }
              }
              int discarded$5 = com.ms.win32.User32.SetCursor(stackIn_11_0);
              return 0;
            } else {
              L4: {
                if (-2 == param1) {
                  ((rb) this).field_c = 0;
                  ((rb) this).field_e = true;
                  break L4;
                } else {
                  break L4;
                }
              }
              return com.ms.win32.User32.CallWindowProc(((rb) this).field_a, param0, param1, param2, param3);
            }
          }
        } else {
          var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
          return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        }
    }

    rb() {
        ((rb) this).field_e = true;
    }
}
