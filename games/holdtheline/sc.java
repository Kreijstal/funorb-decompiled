/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sc extends com.ms.dll.Callback {
    private volatile boolean field_d;
    private int field_c;
    private boolean field_a;
    private volatile int field_e;
    private volatile int field_b;

    final void a(boolean param0, java.awt.Component param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        Throwable var8 = null;
        Throwable var9 = null;
        com.ms.awt.WComponentPeer var10 = null;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        Object stackIn_23_0 = null;
        Object stackIn_24_0 = null;
        Object stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        Object stackOut_16_0 = null;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
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
                    var10 = null;
                    var5 = -83 / ((0 - param2) / 49);
                    var6 = var10.getTopHwnd();
                    if (var6 != ((sc) this).field_e) {
                        statePc = 4;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    if (((sc) this).field_d == param0) {
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
                    if (!((sc) this).field_a) {
                        statePc = 6;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 6: {
                    ((sc) this).field_c = com.ms.win32.User32.LoadCursor(0, 32512);
                    int discarded$12 = com.ms.dll.Root.alloc(this);
                    ((sc) this).field_a = true;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    if (((sc) this).field_e == var6) {
                        statePc = 22;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (((sc) this).field_e == 0) {
                        statePc = 14;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    ((sc) this).field_d = true;
                    int discarded$13 = com.ms.win32.User32.SendMessage(var6, 101024, 0, 0);
                    var7 = this;
                    // monitorenter this
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    try {
                        int discarded$14 = com.ms.win32.User32.SetWindowLong(((sc) this).field_e, -4, ((sc) this).field_b);
                        // monitorexit var7
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var8 = caughtException;
                        // monitorexit var7
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 13: {
                    throw (RuntimeException) (Object) var8;
                }
                case 14: {
                    var7 = this;
                    // monitorenter this
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    try {
                        ((sc) this).field_e = var6;
                        ((sc) this).field_b = com.ms.win32.User32.SetWindowLong(((sc) this).field_e, -4, this);
                        // monitorexit var7
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 16: {
                    stackOut_16_0 = this;
                    stackIn_18_0 = stackOut_16_0;
                    stackIn_17_0 = stackOut_16_0;
                    if (!param0) {
                        statePc = 18;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    stackOut_17_0 = this;
                    stackOut_17_1 = 1;
                    stackIn_19_0 = stackOut_17_0;
                    stackIn_19_1 = stackOut_17_1;
                    statePc = 19;
                    continue stateLoop;
                }
                case 18: {
                    stackOut_18_0 = this;
                    stackOut_18_1 = 0;
                    stackIn_19_0 = stackOut_18_0;
                    stackIn_19_1 = stackOut_18_1;
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    ((sc) this).field_d = stackIn_19_1 != 0;
                    int discarded$15 = com.ms.win32.User32.SendMessage(var6, 101024, 0, 0);
                    return;
                }
                case 20: {
                    try {
                        var9 = caughtException;
                        // monitorexit var7
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 21: {
                    throw (RuntimeException) (Object) var9;
                }
                case 22: {
                    stackOut_22_0 = this;
                    stackIn_24_0 = stackOut_22_0;
                    stackIn_23_0 = stackOut_22_0;
                    if (!param0) {
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
                    ((sc) this).field_d = stackIn_25_1 != 0;
                    int discarded$16 = com.ms.win32.User32.SendMessage(var6, 101024, 0, 0);
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, boolean param1, int param2) {
        boolean discarded$5 = com.ms.win32.User32.SetCursorPos(param2, param0);
        if (!param1) {
            ((sc) this).field_b = 108;
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
        if (((sc) this).field_e == param0) {
          if ((param1 ^ -1) == -33) {
            var5 = param3 & 65535;
            if ((var5 ^ -1) != -2) {
              if ((param1 ^ -1) == -101025) {
                L0: {
                  if (!((sc) this).field_d) {
                    stackOut_22_0 = 0;
                    stackIn_23_0 = stackOut_22_0;
                    break L0;
                  } else {
                    stackOut_21_0 = ((sc) this).field_c;
                    stackIn_23_0 = stackOut_21_0;
                    break L0;
                  }
                }
                int discarded$3 = com.ms.win32.User32.SetCursor(stackIn_23_0);
                return 0;
              } else {
                if (1 == param1) {
                  ((sc) this).field_e = 0;
                  ((sc) this).field_d = true;
                  return com.ms.win32.User32.CallWindowProc(((sc) this).field_b, param0, param1, param2, param3);
                } else {
                  return com.ms.win32.User32.CallWindowProc(((sc) this).field_b, param0, param1, param2, param3);
                }
              }
            } else {
              L1: {
                if (((sc) this).field_d) {
                  stackOut_16_0 = ((sc) this).field_c;
                  stackIn_17_0 = stackOut_16_0;
                  break L1;
                } else {
                  stackOut_15_0 = 0;
                  stackIn_17_0 = stackOut_15_0;
                  break L1;
                }
              }
              int discarded$4 = com.ms.win32.User32.SetCursor(stackIn_17_0);
              return 0;
            }
          } else {
            if ((param1 ^ -1) == -101025) {
              L2: {
                if (!((sc) this).field_d) {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  break L2;
                } else {
                  stackOut_6_0 = ((sc) this).field_c;
                  stackIn_8_0 = stackOut_6_0;
                  break L2;
                }
              }
              int discarded$5 = com.ms.win32.User32.SetCursor(stackIn_8_0);
              return 0;
            } else {
              if (1 == param1) {
                ((sc) this).field_e = 0;
                ((sc) this).field_d = true;
                return com.ms.win32.User32.CallWindowProc(((sc) this).field_b, param0, param1, param2, param3);
              } else {
                return com.ms.win32.User32.CallWindowProc(((sc) this).field_b, param0, param1, param2, param3);
              }
            }
          }
        } else {
          var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
          return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        }
    }

    sc() {
        ((sc) this).field_d = true;
    }
}
