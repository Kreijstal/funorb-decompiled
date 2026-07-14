/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ff extends com.ms.dll.Callback {
    private int field_b;
    private boolean field_c;
    private volatile int field_e;
    private volatile boolean field_a;
    private volatile int field_d;

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int stackIn_8_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        if (((ff) this).field_e == param0) {
          if (32 == param1) {
            var5 = param3 & 65535;
            if (-2 != (var5 ^ -1)) {
              if (param1 == 101024) {
                L0: {
                  if (((ff) this).field_a) {
                    stackOut_22_0 = ((ff) this).field_b;
                    stackIn_23_0 = stackOut_22_0;
                    break L0;
                  } else {
                    stackOut_21_0 = 0;
                    stackIn_23_0 = stackOut_21_0;
                    break L0;
                  }
                }
                int discarded$3 = com.ms.win32.User32.SetCursor(stackIn_23_0);
                return 0;
              } else {
                if (1 == param1) {
                  ((ff) this).field_e = 0;
                  ((ff) this).field_a = true;
                  return com.ms.win32.User32.CallWindowProc(((ff) this).field_d, param0, param1, param2, param3);
                } else {
                  return com.ms.win32.User32.CallWindowProc(((ff) this).field_d, param0, param1, param2, param3);
                }
              }
            } else {
              L1: {
                if (!((ff) this).field_a) {
                  stackOut_16_0 = 0;
                  stackIn_17_0 = stackOut_16_0;
                  break L1;
                } else {
                  stackOut_15_0 = ((ff) this).field_b;
                  stackIn_17_0 = stackOut_15_0;
                  break L1;
                }
              }
              int discarded$4 = com.ms.win32.User32.SetCursor(stackIn_17_0);
              return 0;
            }
          } else {
            if (param1 == 101024) {
              L2: {
                if (((ff) this).field_a) {
                  stackOut_7_0 = ((ff) this).field_b;
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
            } else {
              if (1 == param1) {
                ((ff) this).field_e = 0;
                ((ff) this).field_a = true;
                return com.ms.win32.User32.CallWindowProc(((ff) this).field_d, param0, param1, param2, param3);
              } else {
                return com.ms.win32.User32.CallWindowProc(((ff) this).field_d, param0, param1, param2, param3);
              }
            }
          }
        } else {
          var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
          return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        }
    }

    final void a(int param0, boolean param1, java.awt.Component param2) {
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
        Object stackIn_22_0 = null;
        Object stackIn_23_0 = null;
        Object stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        Object stackIn_28_0 = null;
        Object stackIn_29_0 = null;
        Object stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        boolean stackOut_1_0 = false;
        boolean stackOut_2_0 = false;
        int stackOut_2_1 = 0;
        boolean stackOut_3_0 = false;
        int stackOut_3_1 = 0;
        Object stackOut_21_0 = null;
        Object stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        Object stackOut_23_0 = null;
        int stackOut_23_1 = 0;
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
                    if (var5 != ((ff) this).field_e) {
                        statePc = 7;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    stackOut_1_0 = param1;
                    stackIn_3_0 = stackOut_1_0;
                    stackIn_2_0 = stackOut_1_0;
                    if (((ff) this).field_a) {
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
                    if (param0 == 29783) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    int discarded$6 = ((ff) this).callback(-4, -87, -50, -103);
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    if (((ff) this).field_c) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    ((ff) this).field_b = com.ms.win32.User32.LoadCursor(0, 32512);
                    int discarded$7 = com.ms.dll.Root.alloc(this);
                    ((ff) this).field_c = true;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    if (var5 == ((ff) this).field_e) {
                        statePc = 27;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if (((ff) this).field_e != 0) {
                        statePc = 14;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 14: {
                    ((ff) this).field_a = true;
                    int discarded$8 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
                    var6_ref = this;
                    // monitorenter this
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    try {
                        int discarded$9 = com.ms.win32.User32.SetWindowLong(((ff) this).field_e, -4, ((ff) this).field_d);
                        // monitorexit var6_ref
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var7 = caughtException;
                        // monitorexit var6_ref
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 18: {
                    throw (RuntimeException) (Object) var7;
                }
                case 19: {
                    var6_ref = this;
                    // monitorenter this
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    try {
                        ((ff) this).field_e = var5;
                        ((ff) this).field_d = com.ms.win32.User32.SetWindowLong(((ff) this).field_e, -4, this);
                        // monitorexit var6_ref
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 21: {
                    stackOut_21_0 = this;
                    stackIn_23_0 = stackOut_21_0;
                    stackIn_22_0 = stackOut_21_0;
                    if (!param1) {
                        statePc = 23;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    stackOut_22_0 = this;
                    stackOut_22_1 = 1;
                    stackIn_24_0 = stackOut_22_0;
                    stackIn_24_1 = stackOut_22_1;
                    statePc = 24;
                    continue stateLoop;
                }
                case 23: {
                    stackOut_23_0 = this;
                    stackOut_23_1 = 0;
                    stackIn_24_0 = stackOut_23_0;
                    stackIn_24_1 = stackOut_23_1;
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    ((ff) this).field_a = stackIn_24_1 != 0;
                    int discarded$10 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
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
                    stackOut_27_0 = this;
                    stackIn_29_0 = stackOut_27_0;
                    stackIn_28_0 = stackOut_27_0;
                    if (!param1) {
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
                    ((ff) this).field_a = stackIn_30_1 != 0;
                    int discarded$11 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, int param1, int param2) {
        boolean discarded$5 = com.ms.win32.User32.SetCursorPos(param1, param2);
        if (param0 != 0) {
            Object var5 = null;
            ((ff) this).a(-91, false, (java.awt.Component) null);
        }
    }

    ff() {
        ((ff) this).field_a = true;
    }
}
