/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eh extends com.ms.dll.Callback {
    private volatile int field_b;
    private volatile boolean field_c;
    private int field_e;
    private volatile int field_a;
    private boolean field_d;

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
        if (param0 != ((eh) this).field_b) {
          var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
          return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        } else {
          if (param1 == 32) {
            var5 = 65535 & param3;
            if ((var5 ^ -1) != -2) {
              if (param1 == 101024) {
                L0: {
                  if (!((eh) this).field_c) {
                    stackOut_23_0 = 0;
                    stackIn_24_0 = stackOut_23_0;
                    break L0;
                  } else {
                    stackOut_22_0 = ((eh) this).field_e;
                    stackIn_24_0 = stackOut_22_0;
                    break L0;
                  }
                }
                int discarded$3 = com.ms.win32.User32.SetCursor(stackIn_24_0);
                return 0;
              } else {
                if (-2 == (param1 ^ -1)) {
                  ((eh) this).field_b = 0;
                  ((eh) this).field_c = true;
                  return com.ms.win32.User32.CallWindowProc(((eh) this).field_a, param0, param1, param2, param3);
                } else {
                  return com.ms.win32.User32.CallWindowProc(((eh) this).field_a, param0, param1, param2, param3);
                }
              }
            } else {
              L1: {
                if (((eh) this).field_c) {
                  stackOut_17_0 = ((eh) this).field_e;
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
            if (param1 == 101024) {
              L2: {
                if (!((eh) this).field_c) {
                  stackOut_8_0 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  break L2;
                } else {
                  stackOut_7_0 = ((eh) this).field_e;
                  stackIn_9_0 = stackOut_7_0;
                  break L2;
                }
              }
              int discarded$5 = com.ms.win32.User32.SetCursor(stackIn_9_0);
              return 0;
            } else {
              if (-2 == (param1 ^ -1)) {
                ((eh) this).field_b = 0;
                ((eh) this).field_c = true;
                return com.ms.win32.User32.CallWindowProc(((eh) this).field_a, param0, param1, param2, param3);
              } else {
                return com.ms.win32.User32.CallWindowProc(((eh) this).field_a, param0, param1, param2, param3);
              }
            }
          }
        }
    }

    final void a(byte param0, int param1, int param2) {
        if (param0 != 121) {
            ((eh) this).field_d = false;
            boolean discarded$0 = com.ms.win32.User32.SetCursorPos(param1, param2);
            return;
        }
        boolean discarded$1 = com.ms.win32.User32.SetCursorPos(param1, param2);
    }

    final void a(boolean param0, byte param1, java.awt.Component param2) {
        int var5 = 0;
        Object var6 = null;
        Object var6_ref = null;
        Throwable var7 = null;
        Throwable var8 = null;
        com.ms.awt.WComponentPeer var9 = null;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        Object stackIn_14_0 = null;
        Object stackIn_15_0 = null;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        Object stackIn_30_0 = null;
        Object stackIn_31_0 = null;
        Object stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        Object stackOut_13_0 = null;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        Object stackOut_29_0 = null;
        Object stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        Object stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = null;
                    var5 = var9.getTopHwnd();
                    if (((eh) this).field_b != var5) {
                        statePc = 9;
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
                    stackOut_4_0 = stackIn_4_0;
                    stackIn_6_0 = stackOut_4_0;
                    stackIn_5_0 = stackOut_4_0;
                    if (((eh) this).field_c) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    stackOut_5_0 = stackIn_5_0;
                    stackOut_5_1 = 1;
                    stackIn_7_0 = stackOut_5_0;
                    stackIn_7_1 = stackOut_5_1;
                    statePc = 7;
                    continue stateLoop;
                }
                case 6: {
                    stackOut_6_0 = stackIn_6_0;
                    stackOut_6_1 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    stackIn_7_1 = stackOut_6_1;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    if (stackIn_7_0 != stackIn_7_1) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    return;
                }
                case 9: {
                    if (!((eh) this).field_d) {
                        statePc = 11;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 11: {
                    ((eh) this).field_e = com.ms.win32.User32.LoadCursor(0, 32512);
                    int discarded$7 = com.ms.dll.Root.alloc(this);
                    ((eh) this).field_d = true;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    if (((eh) this).field_b != var5) {
                        statePc = 21;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    stackOut_13_0 = this;
                    stackIn_15_0 = stackOut_13_0;
                    stackIn_14_0 = stackOut_13_0;
                    if (!param0) {
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
                    ((eh) this).field_c = stackIn_16_1 != 0;
                    if (param1 == 90) {
                        statePc = 18;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    ((eh) this).field_b = 69;
                    statePc = 19;
                    continue stateLoop;
                }
                case 18: {
                    int discarded$8 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
                    statePc = 20;
                    continue stateLoop;
                }
                case 19: {
                    int discarded$9 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    return;
                }
                case 21: {
                    if (((eh) this).field_b == 0) {
                        statePc = 27;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    ((eh) this).field_c = true;
                    int discarded$10 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
                    var6_ref = this;
                    // monitorenter this
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    try {
                        int discarded$11 = com.ms.win32.User32.SetWindowLong(((eh) this).field_b, -4, ((eh) this).field_a);
                        // monitorexit var6_ref
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var7 = caughtException;
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
                    throw (RuntimeException) (Object) var7;
                }
                case 27: {
                    var6_ref = this;
                    // monitorenter this
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    try {
                        ((eh) this).field_b = var5;
                        ((eh) this).field_a = com.ms.win32.User32.SetWindowLong(((eh) this).field_b, -4, this);
                        // monitorexit var6_ref
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 29: {
                    stackOut_29_0 = this;
                    stackIn_31_0 = stackOut_29_0;
                    stackIn_30_0 = stackOut_29_0;
                    if (!param0) {
                        statePc = 31;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    stackOut_30_0 = this;
                    stackOut_30_1 = 1;
                    stackIn_32_0 = stackOut_30_0;
                    stackIn_32_1 = stackOut_30_1;
                    statePc = 32;
                    continue stateLoop;
                }
                case 31: {
                    stackOut_31_0 = this;
                    stackOut_31_1 = 0;
                    stackIn_32_0 = stackOut_31_0;
                    stackIn_32_1 = stackOut_31_1;
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    ((eh) this).field_c = stackIn_32_1 != 0;
                    if (param1 == 90) {
                        statePc = 34;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    ((eh) this).field_b = 69;
                    statePc = 35;
                    continue stateLoop;
                }
                case 34: {
                    int discarded$12 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
                    statePc = 36;
                    continue stateLoop;
                }
                case 35: {
                    int discarded$13 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
                    statePc = 36;
                    continue stateLoop;
                }
                case 36: {
                    return;
                }
                case 37: {
                    try {
                        var8 = caughtException;
                        // monitorexit var6_ref
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 38: {
                    throw (RuntimeException) (Object) var8;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    eh() {
        ((eh) this).field_c = true;
    }
}
