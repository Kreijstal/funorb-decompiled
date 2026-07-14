/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qj extends com.ms.dll.Callback {
    private volatile int field_b;
    private volatile boolean field_d;
    private boolean field_c;
    private volatile int field_a;
    private int field_e;

    final void a(int param0, int param1, int param2) {
        if (param0 != 0) {
            ((qj) this).field_a = -126;
            boolean discarded$0 = com.ms.win32.User32.SetCursorPos(param1, param2);
            return;
        }
        boolean discarded$1 = com.ms.win32.User32.SetCursorPos(param1, param2);
    }

    final void a(boolean param0, int param1, java.awt.Component param2) {
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
        Object stackIn_16_0 = null;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        Object stackIn_29_0 = null;
        Object stackIn_30_0 = null;
        Object stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        Object stackOut_15_0 = null;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
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
                    if (param1 <= -34) {
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
                    if (var5 != ((qj) this).field_a) {
                        statePc = 12;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (param0) {
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
                    if (((qj) this).field_d) {
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
                    if (((qj) this).field_c) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    ((qj) this).field_e = com.ms.win32.User32.LoadCursor(0, 32512);
                    int discarded$5 = com.ms.dll.Root.alloc(this);
                    ((qj) this).field_c = true;
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    if (var5 != ((qj) this).field_a) {
                        statePc = 19;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    stackOut_15_0 = this;
                    stackIn_17_0 = stackOut_15_0;
                    stackIn_16_0 = stackOut_15_0;
                    if (!param0) {
                        statePc = 17;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    stackOut_16_0 = this;
                    stackOut_16_1 = 1;
                    stackIn_18_0 = stackOut_16_0;
                    stackIn_18_1 = stackOut_16_1;
                    statePc = 18;
                    continue stateLoop;
                }
                case 17: {
                    stackOut_17_0 = this;
                    stackOut_17_1 = 0;
                    stackIn_18_0 = stackOut_17_0;
                    stackIn_18_1 = stackOut_17_1;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    ((qj) this).field_d = stackIn_18_1 != 0;
                    int discarded$6 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
                    return;
                }
                case 19: {
                    if (0 != ((qj) this).field_a) {
                        statePc = 21;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 21: {
                    ((qj) this).field_d = true;
                    int discarded$7 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
                    var6_ref = this;
                    // monitorenter this
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    try {
                        int discarded$8 = com.ms.win32.User32.SetWindowLong(((qj) this).field_a, -4, ((qj) this).field_b);
                        // monitorexit var6_ref
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var7 = caughtException;
                        // monitorexit var6_ref
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 25: {
                    throw (RuntimeException) (Object) var7;
                }
                case 26: {
                    var6_ref = this;
                    // monitorenter this
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    try {
                        ((qj) this).field_a = var5;
                        ((qj) this).field_b = com.ms.win32.User32.SetWindowLong(((qj) this).field_a, -4, this);
                        // monitorexit var6_ref
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 32;
                        continue stateLoop;
                    }
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
                    ((qj) this).field_d = stackIn_31_1 != 0;
                    int discarded$9 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
                    return;
                }
                case 32: {
                    try {
                        var8 = caughtException;
                        // monitorexit var6_ref
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 33: {
                    throw (RuntimeException) (Object) var8;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    qj() {
        ((qj) this).field_d = true;
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
        if (((qj) this).field_a != param0) {
          var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
          return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        } else {
          if (param1 == 32) {
            var5 = 65535 & param3;
            if (-2 != (var5 ^ -1)) {
              if ((param1 ^ -1) == -101025) {
                L0: {
                  if (!((qj) this).field_d) {
                    stackOut_23_0 = 0;
                    stackIn_24_0 = stackOut_23_0;
                    break L0;
                  } else {
                    stackOut_22_0 = ((qj) this).field_e;
                    stackIn_24_0 = stackOut_22_0;
                    break L0;
                  }
                }
                int discarded$6 = com.ms.win32.User32.SetCursor(stackIn_24_0);
                return 0;
              } else {
                L1: {
                  if ((param1 ^ -1) == -2) {
                    ((qj) this).field_a = 0;
                    ((qj) this).field_d = true;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                return com.ms.win32.User32.CallWindowProc(((qj) this).field_b, param0, param1, param2, param3);
              }
            } else {
              L2: {
                if (!((qj) this).field_d) {
                  stackOut_17_0 = 0;
                  stackIn_18_0 = stackOut_17_0;
                  break L2;
                } else {
                  stackOut_16_0 = ((qj) this).field_e;
                  stackIn_18_0 = stackOut_16_0;
                  break L2;
                }
              }
              int discarded$7 = com.ms.win32.User32.SetCursor(stackIn_18_0);
              return 0;
            }
          } else {
            if ((param1 ^ -1) == -101025) {
              L3: {
                if (!((qj) this).field_d) {
                  stackOut_8_0 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  break L3;
                } else {
                  stackOut_7_0 = ((qj) this).field_e;
                  stackIn_9_0 = stackOut_7_0;
                  break L3;
                }
              }
              int discarded$8 = com.ms.win32.User32.SetCursor(stackIn_9_0);
              return 0;
            } else {
              L4: {
                if ((param1 ^ -1) == -2) {
                  ((qj) this).field_a = 0;
                  ((qj) this).field_d = true;
                  break L4;
                } else {
                  break L4;
                }
              }
              return com.ms.win32.User32.CallWindowProc(((qj) this).field_b, param0, param1, param2, param3);
            }
          }
        }
    }
}
