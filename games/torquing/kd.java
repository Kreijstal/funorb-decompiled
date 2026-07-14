/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kd extends com.ms.dll.Callback {
    private volatile int field_c;
    private boolean field_a;
    private volatile boolean field_d;
    private int field_e;
    private volatile int field_b;

    final void a(boolean param0, byte param1, java.awt.Component param2) {
        int var5 = 0;
        Object var6 = null;
        Object var6_ref = null;
        Throwable var7 = null;
        Throwable var8 = null;
        com.ms.awt.WComponentPeer var9 = null;
        int stackIn_4_0 = 0;
        Object stackIn_20_0 = null;
        Object stackIn_21_0 = null;
        Object stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        Object stackIn_29_0 = null;
        Object stackIn_30_0 = null;
        Object stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_3_0 = 0;
        Object stackOut_19_0 = null;
        Object stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        Object stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        Object stackOut_28_0 = null;
        Object stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        Object stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = null;
                    var5 = var9.getTopHwnd();
                    if (var5 != ((kd) this).field_b) {
                        statePc = 6;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    if (param0) {
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
                    if (stackIn_4_0 == (((kd) this).field_d ? 1 : 0)) {
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
                    if (!((kd) this).field_a) {
                        statePc = 8;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 8: {
                    ((kd) this).field_e = com.ms.win32.User32.LoadCursor(0, 32512);
                    int discarded$5 = com.ms.dll.Root.alloc(this);
                    ((kd) this).field_a = true;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    if (((kd) this).field_b == var5) {
                        statePc = 27;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if (0 == ((kd) this).field_b) {
                        statePc = 16;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    ((kd) this).field_d = true;
                    int discarded$6 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
                    var6_ref = this;
                    // monitorenter this
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    try {
                        int discarded$7 = com.ms.win32.User32.SetWindowLong(((kd) this).field_b, -4, ((kd) this).field_c);
                        // monitorexit var6_ref
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var7 = caughtException;
                        // monitorexit var6_ref
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 15: {
                    throw (RuntimeException) (Object) var7;
                }
                case 16: {
                    var6_ref = this;
                    // monitorenter this
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    try {
                        ((kd) this).field_b = var5;
                        ((kd) this).field_c = com.ms.win32.User32.SetWindowLong(((kd) this).field_b, -4, this);
                        // monitorexit var6_ref
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 18: {
                    if (param1 < 28) {
                        statePc = 23;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    stackOut_19_0 = this;
                    stackIn_21_0 = stackOut_19_0;
                    stackIn_20_0 = stackOut_19_0;
                    if (!param0) {
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
                    ((kd) this).field_d = stackIn_22_1 != 0;
                    int discarded$8 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
                    return;
                }
                case 23: {
                    return;
                }
                case 25: {
                    try {
                        var8 = caughtException;
                        // monitorexit var6_ref
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
                case 27: {
                    if (param1 < 28) {
                        statePc = 32;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    stackOut_28_0 = this;
                    stackIn_30_0 = stackOut_28_0;
                    stackIn_29_0 = stackOut_28_0;
                    if (!param0) {
                        statePc = 30;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    stackOut_29_0 = this;
                    stackOut_29_1 = 1;
                    stackIn_31_0 = stackOut_29_0;
                    stackIn_31_1 = stackOut_29_1;
                    statePc = 31;
                    continue stateLoop;
                }
                case 30: {
                    stackOut_30_0 = this;
                    stackOut_30_1 = 0;
                    stackIn_31_0 = stackOut_30_0;
                    stackIn_31_1 = stackOut_30_1;
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    ((kd) this).field_d = stackIn_31_1 != 0;
                    int discarded$9 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
                    return;
                }
                case 32: {
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
        if (((kd) this).field_b == param0) {
          if (32 == param1) {
            var5 = 65535 & param3;
            if (1 != var5) {
              if (101024 == param1) {
                L0: {
                  if (!((kd) this).field_d) {
                    stackOut_25_0 = 0;
                    stackIn_26_0 = stackOut_25_0;
                    break L0;
                  } else {
                    stackOut_24_0 = ((kd) this).field_e;
                    stackIn_26_0 = stackOut_24_0;
                    break L0;
                  }
                }
                int discarded$3 = com.ms.win32.User32.SetCursor(stackIn_26_0);
                return 0;
              } else {
                L1: {
                  if (-2 == (param1 ^ -1)) {
                    ((kd) this).field_b = 0;
                    ((kd) this).field_d = true;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                return com.ms.win32.User32.CallWindowProc(((kd) this).field_c, param0, param1, param2, param3);
              }
            } else {
              L2: {
                if (((kd) this).field_d) {
                  stackOut_16_0 = ((kd) this).field_e;
                  stackIn_17_0 = stackOut_16_0;
                  break L2;
                } else {
                  stackOut_15_0 = 0;
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
                if (!((kd) this).field_d) {
                  stackOut_10_0 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  break L3;
                } else {
                  stackOut_9_0 = ((kd) this).field_e;
                  stackIn_11_0 = stackOut_9_0;
                  break L3;
                }
              }
              int discarded$5 = com.ms.win32.User32.SetCursor(stackIn_11_0);
              return 0;
            } else {
              L4: {
                if (-2 == (param1 ^ -1)) {
                  ((kd) this).field_b = 0;
                  ((kd) this).field_d = true;
                  break L4;
                } else {
                  break L4;
                }
              }
              return com.ms.win32.User32.CallWindowProc(((kd) this).field_c, param0, param1, param2, param3);
            }
          }
        } else {
          var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
          return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        }
    }

    final void a(int param0, int param1, int param2) {
        boolean discarded$0 = com.ms.win32.User32.SetCursorPos(param1, param0);
        int var4 = -33 % ((param2 - 22) / 49);
    }

    kd() {
        ((kd) this).field_d = true;
    }
}
