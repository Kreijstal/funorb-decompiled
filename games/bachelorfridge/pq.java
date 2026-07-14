/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pq extends com.ms.dll.Callback {
    private volatile boolean field_c;
    private volatile int field_a;
    private int field_b;
    private boolean field_d;
    private volatile int field_e;

    final void a(java.awt.Component param0, byte param1, boolean param2) {
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
        Object stackIn_15_0 = null;
        Object stackIn_16_0 = null;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        Object stackIn_28_0 = null;
        Object stackIn_29_0 = null;
        Object stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        Object stackOut_14_0 = null;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        Object stackOut_27_0 = null;
        Object stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        Object stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = null;
                    var5 = var9.getTopHwnd();
                    if (var5 != ((pq) this).field_e) {
                        statePc = 9;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    if (param2) {
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
                    if (((pq) this).field_c) {
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
                    if (((pq) this).field_d) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    ((pq) this).field_b = com.ms.win32.User32.LoadCursor(0, 32512);
                    int discarded$6 = com.ms.dll.Root.alloc(this);
                    ((pq) this).field_d = true;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    if (param1 < -23) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    int discarded$7 = ((pq) this).callback(-85, 14, 75, 9);
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    if (((pq) this).field_e != var5) {
                        statePc = 18;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    stackOut_14_0 = this;
                    stackIn_16_0 = stackOut_14_0;
                    stackIn_15_0 = stackOut_14_0;
                    if (!param2) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    stackOut_15_0 = this;
                    stackOut_15_1 = 1;
                    stackIn_17_0 = stackOut_15_0;
                    stackIn_17_1 = stackOut_15_1;
                    statePc = 17;
                    continue stateLoop;
                }
                case 16: {
                    stackOut_16_0 = this;
                    stackOut_16_1 = 0;
                    stackIn_17_0 = stackOut_16_0;
                    stackIn_17_1 = stackOut_16_1;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    ((pq) this).field_c = stackIn_17_1 != 0;
                    int discarded$8 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
                    return;
                }
                case 18: {
                    if (((pq) this).field_e != 0) {
                        statePc = 20;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 20: {
                    ((pq) this).field_c = true;
                    int discarded$9 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
                    var6_ref = this;
                    // monitorenter this
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    try {
                        int discarded$10 = com.ms.win32.User32.SetWindowLong(((pq) this).field_e, -4, ((pq) this).field_a);
                        // monitorexit var6_ref
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var7 = caughtException;
                        // monitorexit var6_ref
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 24: {
                    throw (RuntimeException) (Object) var7;
                }
                case 25: {
                    var6_ref = this;
                    // monitorenter this
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    try {
                        ((pq) this).field_e = var5;
                        ((pq) this).field_a = com.ms.win32.User32.SetWindowLong(((pq) this).field_e, -4, this);
                        // monitorexit var6_ref
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 27: {
                    stackOut_27_0 = this;
                    stackIn_29_0 = stackOut_27_0;
                    stackIn_28_0 = stackOut_27_0;
                    if (!param2) {
                        statePc = 29;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    stackOut_28_0 = this;
                    stackOut_28_1 = 1;
                    stackIn_30_0 = stackOut_28_0;
                    stackIn_30_1 = stackOut_28_1;
                    statePc = 30;
                    continue stateLoop;
                }
                case 29: {
                    stackOut_29_0 = this;
                    stackOut_29_1 = 0;
                    stackIn_30_0 = stackOut_29_0;
                    stackIn_30_1 = stackOut_29_1;
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    ((pq) this).field_c = stackIn_30_1 != 0;
                    int discarded$11 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
                    return;
                }
                case 31: {
                    try {
                        var8 = caughtException;
                        // monitorexit var6_ref
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 32: {
                    throw (RuntimeException) (Object) var8;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param2 != 9537) {
            ((pq) this).field_e = 62;
            boolean discarded$0 = com.ms.win32.User32.SetCursorPos(param1, param0);
            return;
        }
        boolean discarded$1 = com.ms.win32.User32.SetCursorPos(param1, param0);
    }

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (((pq) this).field_e == param0) {
          if (-33 != (param1 ^ -1)) {
            if (101024 != param1) {
              if (1 == param1) {
                ((pq) this).field_e = 0;
                ((pq) this).field_c = true;
                return com.ms.win32.User32.CallWindowProc(((pq) this).field_a, param0, param1, param2, param3);
              } else {
                return com.ms.win32.User32.CallWindowProc(((pq) this).field_a, param0, param1, param2, param3);
              }
            } else {
              L0: {
                if (!((pq) this).field_c) {
                  stackOut_20_0 = 0;
                  stackIn_21_0 = stackOut_20_0;
                  break L0;
                } else {
                  stackOut_19_0 = ((pq) this).field_b;
                  stackIn_21_0 = stackOut_19_0;
                  break L0;
                }
              }
              int discarded$3 = com.ms.win32.User32.SetCursor(stackIn_21_0);
              return 0;
            }
          } else {
            var5 = param3 & 65535;
            if ((var5 ^ -1) != -2) {
              if (101024 != param1) {
                if (1 == param1) {
                  ((pq) this).field_e = 0;
                  ((pq) this).field_c = true;
                  return com.ms.win32.User32.CallWindowProc(((pq) this).field_a, param0, param1, param2, param3);
                } else {
                  return com.ms.win32.User32.CallWindowProc(((pq) this).field_a, param0, param1, param2, param3);
                }
              } else {
                L1: {
                  if (!((pq) this).field_c) {
                    stackOut_11_0 = 0;
                    stackIn_12_0 = stackOut_11_0;
                    break L1;
                  } else {
                    stackOut_10_0 = ((pq) this).field_b;
                    stackIn_12_0 = stackOut_10_0;
                    break L1;
                  }
                }
                int discarded$4 = com.ms.win32.User32.SetCursor(stackIn_12_0);
                return 0;
              }
            } else {
              L2: {
                if (!((pq) this).field_c) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L2;
                } else {
                  stackOut_5_0 = ((pq) this).field_b;
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

    pq() {
        ((pq) this).field_c = true;
    }
}
