/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class in extends com.ms.dll.Callback {
    private volatile boolean field_a;
    private volatile int field_e;
    private volatile int field_b;
    private boolean field_c;
    private int field_d;

    final void a(int param0, int param1, int param2) {
        if (param1 != -4) {
            ((in) this).field_c = false;
            boolean discarded$0 = com.ms.win32.User32.SetCursorPos(param2, param0);
            return;
        }
        boolean discarded$1 = com.ms.win32.User32.SetCursorPos(param2, param0);
    }

    final void a(java.awt.Component param0, int param1, boolean param2) {
        int var5 = 0;
        Object var6 = null;
        Throwable var7 = null;
        Throwable var8 = null;
        com.ms.awt.WComponentPeer var9 = null;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        Object stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        Object stackIn_24_0 = null;
        Object stackIn_25_0 = null;
        Object stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        Object stackOut_17_0;
        Object stackOut_18_0;
        int stackOut_18_1;
        Object stackOut_19_0;
        int stackOut_19_1;
        Object stackOut_23_0;
        Object stackOut_24_0;
        int stackOut_24_1;
        Object stackOut_25_0;
        int stackOut_25_1;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = null;
                    var5 = var9.getTopHwnd();
                    if (((in) this).field_e != var5) {
                        statePc = 4;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    if (((in) this).field_a == param2) {
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
                    if (!((in) this).field_c) {
                        statePc = 6;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 6: {
                    ((in) this).field_d = com.ms.win32.User32.LoadCursor(0, 32512);
                    int discarded$12 = com.ms.dll.Root.alloc(this);
                    ((in) this).field_c = true;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    if (((in) this).field_e == var5) {
                        statePc = 23;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (((in) this).field_e != 0) {
                        statePc = 10;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 10: {
                    ((in) this).field_a = true;
                    int discarded$13 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
                    var6 = this;
                    // monitorenter this
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    try {
                        int discarded$14 = com.ms.win32.User32.SetWindowLong(((in) this).field_e, -4, ((in) this).field_b);
                        // monitorexit var6
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var7 = caughtException;
                        // monitorexit var6
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 14: {
                    throw (RuntimeException) (Object) var7;
                }
                case 15: {
                    var6 = this;
                    // monitorenter this
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    try {
                        ((in) this).field_e = var5;
                        ((in) this).field_b = com.ms.win32.User32.SetWindowLong(((in) this).field_e, -4, this);
                        // monitorexit var6
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 17: {
                    stackOut_17_0 = this;
                    stackIn_19_0 = stackOut_17_0;
                    stackIn_18_0 = stackOut_17_0;
                    if (!param2) {
                        statePc = 19;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    stackOut_18_0 = this;
                    stackOut_18_1 = 1;
                    stackIn_20_0 = stackOut_18_0;
                    stackIn_20_1 = stackOut_18_1;
                    statePc = 20;
                    continue stateLoop;
                }
                case 19: {
                    stackOut_19_0 = this;
                    stackOut_19_1 = 0;
                    stackIn_20_0 = stackOut_19_0;
                    stackIn_20_1 = stackOut_19_1;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    ((in) this).field_a = stackIn_20_1 != 0;
                    int discarded$15 = com.ms.win32.User32.SendMessage(var5, 101024, param1, 0);
                    return;
                }
                case 21: {
                    try {
                        var8 = caughtException;
                        // monitorexit var6
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 22: {
                    throw (RuntimeException) (Object) var8;
                }
                case 23: {
                    stackOut_23_0 = this;
                    stackIn_25_0 = stackOut_23_0;
                    stackIn_24_0 = stackOut_23_0;
                    if (!param2) {
                        statePc = 25;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    stackOut_24_0 = this;
                    stackOut_24_1 = 1;
                    stackIn_26_0 = stackOut_24_0;
                    stackIn_26_1 = stackOut_24_1;
                    statePc = 26;
                    continue stateLoop;
                }
                case 25: {
                    stackOut_25_0 = this;
                    stackOut_25_1 = 0;
                    stackIn_26_0 = stackOut_25_0;
                    stackIn_26_1 = stackOut_25_1;
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    ((in) this).field_a = stackIn_26_1 != 0;
                    int discarded$16 = com.ms.win32.User32.SendMessage(var5, 101024, param1, 0);
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    in() {
        ((in) this).field_a = true;
    }

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int stackIn_8_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_22_0 = 0;
        int stackOut_21_0;
        int stackOut_20_0;
        int stackOut_16_0;
        int stackOut_15_0;
        int stackOut_7_0;
        int stackOut_6_0;
        if (param0 != ((in) this).field_e) {
          var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
          return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        } else {
          if (param1 == 32) {
            var5 = param3 & 65535;
            if (1 != var5) {
              if (param1 != 101024) {
                if (param1 == 1) {
                  ((in) this).field_e = 0;
                  ((in) this).field_a = true;
                  return com.ms.win32.User32.CallWindowProc(((in) this).field_b, param0, param1, param2, param3);
                } else {
                  return com.ms.win32.User32.CallWindowProc(((in) this).field_b, param0, param1, param2, param3);
                }
              } else {
                L0: {
                  if (!((in) this).field_a) {
                    stackOut_21_0 = 0;
                    stackIn_22_0 = stackOut_21_0;
                    break L0;
                  } else {
                    stackOut_20_0 = ((in) this).field_d;
                    stackIn_22_0 = stackOut_20_0;
                    break L0;
                  }
                }
                int discarded$3 = com.ms.win32.User32.SetCursor(stackIn_22_0);
                return 0;
              }
            } else {
              L1: {
                if (((in) this).field_a) {
                  stackOut_16_0 = ((in) this).field_d;
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
            if (param1 != 101024) {
              if (param1 == 1) {
                ((in) this).field_e = 0;
                ((in) this).field_a = true;
                return com.ms.win32.User32.CallWindowProc(((in) this).field_b, param0, param1, param2, param3);
              } else {
                return com.ms.win32.User32.CallWindowProc(((in) this).field_b, param0, param1, param2, param3);
              }
            } else {
              L2: {
                if (!((in) this).field_a) {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  break L2;
                } else {
                  stackOut_6_0 = ((in) this).field_d;
                  stackIn_8_0 = stackOut_6_0;
                  break L2;
                }
              }
              int discarded$5 = com.ms.win32.User32.SetCursor(stackIn_8_0);
              return 0;
            }
          }
        }
    }
}
