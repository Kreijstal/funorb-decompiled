/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class w extends com.ms.dll.Callback {
    private boolean field_e;
    private volatile int field_a;
    private volatile boolean field_c;
    private int field_b;
    private volatile int field_d;

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
        if (param0 != ((w) this).field_a) {
          var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
          return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        } else {
          if ((param1 ^ -1) == -33) {
            var5 = 65535 & param3;
            if (1 != var5) {
              if (101024 == param1) {
                L0: {
                  if (!((w) this).field_c) {
                    stackOut_26_0 = 0;
                    stackIn_27_0 = stackOut_26_0;
                    break L0;
                  } else {
                    stackOut_25_0 = ((w) this).field_b;
                    stackIn_27_0 = stackOut_25_0;
                    break L0;
                  }
                }
                int discarded$3 = com.ms.win32.User32.SetCursor(stackIn_27_0);
                return 0;
              } else {
                L1: {
                  if ((param1 ^ -1) == -2) {
                    ((w) this).field_a = 0;
                    ((w) this).field_c = true;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                return com.ms.win32.User32.CallWindowProc(((w) this).field_d, param0, param1, param2, param3);
              }
            } else {
              L2: {
                if (!((w) this).field_c) {
                  stackOut_17_0 = 0;
                  stackIn_18_0 = stackOut_17_0;
                  break L2;
                } else {
                  stackOut_16_0 = ((w) this).field_b;
                  stackIn_18_0 = stackOut_16_0;
                  break L2;
                }
              }
              int discarded$4 = com.ms.win32.User32.SetCursor(stackIn_18_0);
              return 0;
            }
          } else {
            if (101024 == param1) {
              L3: {
                if (!((w) this).field_c) {
                  stackOut_11_0 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  break L3;
                } else {
                  stackOut_10_0 = ((w) this).field_b;
                  stackIn_12_0 = stackOut_10_0;
                  break L3;
                }
              }
              int discarded$5 = com.ms.win32.User32.SetCursor(stackIn_12_0);
              return 0;
            } else {
              L4: {
                if ((param1 ^ -1) == -2) {
                  ((w) this).field_a = 0;
                  ((w) this).field_c = true;
                  break L4;
                } else {
                  break L4;
                }
              }
              return com.ms.win32.User32.CallWindowProc(((w) this).field_d, param0, param1, param2, param3);
            }
          }
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param1 != 1) {
            return;
        }
        boolean discarded$0 = com.ms.win32.User32.SetCursorPos(param0, param2);
    }

    final void a(byte param0, java.awt.Component param1, boolean param2) {
        int var5 = 0;
        Object var6 = null;
        Object var6_ref = null;
        Throwable var7 = null;
        Throwable var8 = null;
        com.ms.awt.WComponentPeer var9 = null;
        boolean stackIn_2_0 = false;
        boolean stackIn_3_0 = false;
        boolean stackIn_4_0 = false;
        int stackIn_4_1 = 0;
        Object stackIn_23_0 = null;
        Object stackIn_24_0 = null;
        Object stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        Object stackIn_29_0 = null;
        Object stackIn_30_0 = null;
        Object stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        boolean stackOut_1_0 = false;
        boolean stackOut_2_0 = false;
        int stackOut_2_1 = 0;
        boolean stackOut_3_0 = false;
        int stackOut_3_1 = 0;
        Object stackOut_22_0 = null;
        Object stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        Object stackOut_24_0 = null;
        int stackOut_24_1 = 0;
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
                    if (((w) this).field_a != var5) {
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
                    if (((w) this).field_c) {
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
                    if (param0 < -39) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    ((w) this).field_d = 44;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    if (!((w) this).field_e) {
                        statePc = 11;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 11: {
                    ((w) this).field_b = com.ms.win32.User32.LoadCursor(0, 32512);
                    int discarded$5 = com.ms.dll.Root.alloc(this);
                    ((w) this).field_e = true;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    if (((w) this).field_a == var5) {
                        statePc = 28;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if (-1 != (((w) this).field_a ^ -1)) {
                        statePc = 15;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 15: {
                    ((w) this).field_c = true;
                    int discarded$6 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
                    var6_ref = this;
                    // monitorenter this
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    try {
                        int discarded$7 = com.ms.win32.User32.SetWindowLong(((w) this).field_a, -4, ((w) this).field_d);
                        // monitorexit var6_ref
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
                        // monitorexit var6_ref
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
                    var6_ref = this;
                    // monitorenter this
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    try {
                        ((w) this).field_a = var5;
                        ((w) this).field_d = com.ms.win32.User32.SetWindowLong(((w) this).field_a, -4, this);
                        // monitorexit var6_ref
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
                    if (!param2) {
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
                    ((w) this).field_c = stackIn_25_1 != 0;
                    int discarded$8 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
                    return;
                }
                case 26: {
                    try {
                        var8 = caughtException;
                        // monitorexit var6_ref
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
                case 28: {
                    stackOut_28_0 = this;
                    stackIn_30_0 = stackOut_28_0;
                    stackIn_29_0 = stackOut_28_0;
                    if (!param2) {
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
                    ((w) this).field_c = stackIn_31_1 != 0;
                    int discarded$9 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    w() {
        ((w) this).field_c = true;
    }
}
