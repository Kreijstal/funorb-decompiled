/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class le extends com.ms.dll.Callback {
    private volatile int field_b;
    private volatile boolean field_d;
    private boolean field_a;
    private int field_c;
    private volatile int field_e;

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
        if (((le) this).field_e != param0) {
          var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
          return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        } else {
          if (-33 == param1) {
            var5 = param3 & 65535;
            if (var5 != 1) {
              if (-101025 == (param1 ^ -1)) {
                L0: {
                  if (((le) this).field_d) {
                    stackOut_23_0 = ((le) this).field_c;
                    stackIn_24_0 = stackOut_23_0;
                    break L0;
                  } else {
                    stackOut_22_0 = 0;
                    stackIn_24_0 = stackOut_22_0;
                    break L0;
                  }
                }
                int discarded$6 = com.ms.win32.User32.SetCursor(stackIn_24_0);
                return 0;
              } else {
                L1: {
                  if (param1 == 1) {
                    ((le) this).field_e = 0;
                    ((le) this).field_d = true;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                return com.ms.win32.User32.CallWindowProc(((le) this).field_b, param0, param1, param2, param3);
              }
            } else {
              L2: {
                if (!((le) this).field_d) {
                  stackOut_17_0 = 0;
                  stackIn_18_0 = stackOut_17_0;
                  break L2;
                } else {
                  stackOut_16_0 = ((le) this).field_c;
                  stackIn_18_0 = stackOut_16_0;
                  break L2;
                }
              }
              int discarded$7 = com.ms.win32.User32.SetCursor(stackIn_18_0);
              return 0;
            }
          } else {
            if (-101025 == param1) {
              L3: {
                if (((le) this).field_d) {
                  stackOut_8_0 = ((le) this).field_c;
                  stackIn_9_0 = stackOut_8_0;
                  break L3;
                } else {
                  stackOut_7_0 = 0;
                  stackIn_9_0 = stackOut_7_0;
                  break L3;
                }
              }
              int discarded$8 = com.ms.win32.User32.SetCursor(stackIn_9_0);
              return 0;
            } else {
              L4: {
                if (param1 == 1) {
                  ((le) this).field_e = 0;
                  ((le) this).field_d = true;
                  break L4;
                } else {
                  break L4;
                }
              }
              return com.ms.win32.User32.CallWindowProc(((le) this).field_b, param0, param1, param2, param3);
            }
          }
        }
    }

    final void a(byte param0, java.awt.Component param1, boolean param2) {
        int var5 = 0;
        Object var6 = null;
        Object var6_ref = null;
        Throwable var7 = null;
        Throwable var8 = null;
        com.ms.awt.WComponentPeer var9 = null;
        int stackIn_4_0 = 0;
        Object stackIn_14_0 = null;
        Object stackIn_15_0 = null;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        Object stackIn_29_0 = null;
        Object stackIn_30_0 = null;
        Object stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_3_0 = 0;
        Object stackOut_13_0 = null;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
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
                    if (((le) this).field_e != var5) {
                        statePc = 7;
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
                    if (stackIn_4_0 != (((le) this).field_d ? 1 : 0)) {
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
                    if (!((le) this).field_a) {
                        statePc = 9;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 9: {
                    ((le) this).field_c = com.ms.win32.User32.LoadCursor(0, 32512);
                    int discarded$5 = com.ms.dll.Root.alloc(this);
                    ((le) this).field_a = true;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    if (var5 != ((le) this).field_e) {
                        statePc = 17;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (param0 < -62) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    ((le) this).field_c = -104;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    stackOut_13_0 = this;
                    stackIn_15_0 = stackOut_13_0;
                    stackIn_14_0 = stackOut_13_0;
                    if (!param2) {
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
                    ((le) this).field_d = stackIn_16_1 != 0;
                    int discarded$6 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
                    return;
                }
                case 17: {
                    if (-1 != (((le) this).field_e ^ -1)) {
                        statePc = 19;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 19: {
                    ((le) this).field_d = true;
                    int discarded$7 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
                    var6_ref = this;
                    // monitorenter this
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    try {
                        int discarded$8 = com.ms.win32.User32.SetWindowLong(((le) this).field_e, -4, ((le) this).field_b);
                        // monitorexit var6_ref
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var7 = caughtException;
                        // monitorexit var6_ref
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 23: {
                    throw (RuntimeException) (Object) var7;
                }
                case 24: {
                    var6_ref = this;
                    // monitorenter this
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    try {
                        ((le) this).field_e = var5;
                        ((le) this).field_b = com.ms.win32.User32.SetWindowLong(((le) this).field_e, -4, this);
                        // monitorexit var6_ref
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 26: {
                    if (param0 < -62) {
                        statePc = 28;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    ((le) this).field_c = -104;
                    statePc = 28;
                    continue stateLoop;
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
                    ((le) this).field_d = stackIn_31_1 != 0;
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

    final void a(byte param0, int param1, int param2) {
        boolean discarded$0 = com.ms.win32.User32.SetCursorPos(param1, param2);
        int var4 = -121 / ((param0 - -50) / 38);
    }

    le() {
        ((le) this).field_d = true;
    }
}
