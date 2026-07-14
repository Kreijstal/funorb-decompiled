/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fl extends com.ms.dll.Callback {
    private boolean field_c;
    private volatile int field_a;
    private volatile int field_b;
    private int field_e;
    private volatile boolean field_d;

    final void a(int param0, java.awt.Component param1, boolean param2) {
        int var5 = 0;
        Object var6 = null;
        Object var6_ref = null;
        Throwable var7 = null;
        Throwable var8 = null;
        com.ms.awt.WComponentPeer var9 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackIn_23_0 = null;
        Object stackIn_24_0 = null;
        Object stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        Object stackOut_7_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_22_0 = null;
        Object stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        Object stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = null;
                    var5 = var9.getTopHwnd();
                    if (((fl) this).field_b != var5) {
                        statePc = 4;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    if (((fl) this).field_d == param2) {
                        statePc = 3;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 3: {
                    return;
                }
                case 4: {
                    if (((fl) this).field_c) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    ((fl) this).field_e = com.ms.win32.User32.LoadCursor(0, 32512);
                    int discarded$5 = com.ms.dll.Root.alloc(this);
                    ((fl) this).field_c = true;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if (((fl) this).field_b != var5) {
                        statePc = 13;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    stackOut_7_0 = this;
                    stackIn_9_0 = stackOut_7_0;
                    stackIn_8_0 = stackOut_7_0;
                    if (!param2) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    stackOut_8_0 = this;
                    stackOut_8_1 = 1;
                    stackIn_10_0 = stackOut_8_0;
                    stackIn_10_1 = stackOut_8_1;
                    statePc = 10;
                    continue stateLoop;
                }
                case 9: {
                    stackOut_9_0 = this;
                    stackOut_9_1 = 0;
                    stackIn_10_0 = stackOut_9_0;
                    stackIn_10_1 = stackOut_9_1;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    ((fl) this).field_d = stackIn_10_1 != 0;
                    int discarded$6 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
                    if (param0 == 11333) {
                        statePc = 12;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    ((fl) this).a(-21, (byte) -73, -121);
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    return;
                }
                case 13: {
                    if (-1 != (((fl) this).field_b ^ -1)) {
                        statePc = 15;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 15: {
                    ((fl) this).field_d = true;
                    int discarded$7 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
                    var6_ref = this;
                    // monitorenter this
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    try {
                        int discarded$8 = com.ms.win32.User32.SetWindowLong(((fl) this).field_b, -4, ((fl) this).field_a);
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
                        ((fl) this).field_b = var5;
                        ((fl) this).field_a = com.ms.win32.User32.SetWindowLong(((fl) this).field_b, -4, this);
                        // monitorexit var6_ref
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 28;
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
                    ((fl) this).field_d = stackIn_25_1 != 0;
                    int discarded$9 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
                    if (param0 == 11333) {
                        statePc = 27;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    ((fl) this).a(-21, (byte) -73, -121);
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
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
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, byte param1, int param2) {
        boolean discarded$4 = com.ms.win32.User32.SetCursorPos(param0, param2);
        if (param1 <= 46) {
            ((fl) this).field_b = -95;
        }
    }

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
        if (((fl) this).field_b == param0) {
          if ((param1 ^ -1) == -33) {
            var5 = param3 & 65535;
            if (-2 != (var5 ^ -1)) {
              if (param1 == -101025) {
                L0: {
                  if (((fl) this).field_d) {
                    stackOut_22_0 = ((fl) this).field_e;
                    stackIn_23_0 = stackOut_22_0;
                    break L0;
                  } else {
                    stackOut_21_0 = 0;
                    stackIn_23_0 = stackOut_21_0;
                    break L0;
                  }
                }
                int discarded$6 = com.ms.win32.User32.SetCursor(stackIn_23_0);
                return 0;
              } else {
                L1: {
                  if (-2 == param1) {
                    ((fl) this).field_b = 0;
                    ((fl) this).field_d = true;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                return com.ms.win32.User32.CallWindowProc(((fl) this).field_a, param0, param1, param2, param3);
              }
            } else {
              L2: {
                if (((fl) this).field_d) {
                  stackOut_16_0 = ((fl) this).field_e;
                  stackIn_17_0 = stackOut_16_0;
                  break L2;
                } else {
                  stackOut_15_0 = 0;
                  stackIn_17_0 = stackOut_15_0;
                  break L2;
                }
              }
              int discarded$7 = com.ms.win32.User32.SetCursor(stackIn_17_0);
              return 0;
            }
          } else {
            if (param1 == -101025) {
              L3: {
                if (((fl) this).field_d) {
                  stackOut_7_0 = ((fl) this).field_e;
                  stackIn_8_0 = stackOut_7_0;
                  break L3;
                } else {
                  stackOut_6_0 = 0;
                  stackIn_8_0 = stackOut_6_0;
                  break L3;
                }
              }
              int discarded$8 = com.ms.win32.User32.SetCursor(stackIn_8_0);
              return 0;
            } else {
              L4: {
                if (-2 == param1) {
                  ((fl) this).field_b = 0;
                  ((fl) this).field_d = true;
                  break L4;
                } else {
                  break L4;
                }
              }
              return com.ms.win32.User32.CallWindowProc(((fl) this).field_a, param0, param1, param2, param3);
            }
          }
        } else {
          var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
          return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        }
    }

    fl() {
        ((fl) this).field_d = true;
    }
}
