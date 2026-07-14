/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fb extends com.ms.dll.Callback {
    private boolean field_a;
    private int field_b;
    private volatile boolean field_d;
    private volatile int field_e;
    private volatile int field_c;

    final void a(int param0, int param1, int param2) {
        Object var5 = null;
        if (param2 != -11154) {
          var5 = null;
          ((fb) this).a((java.awt.Component) null, true, (byte) 3);
          boolean discarded$4 = com.ms.win32.User32.SetCursorPos(param1, param0);
          return;
        } else {
          boolean discarded$5 = com.ms.win32.User32.SetCursorPos(param1, param0);
          return;
        }
    }

    final void a(java.awt.Component param0, boolean param1, byte param2) {
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
        Object stackOut_17_0 = null;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        Object stackOut_23_0 = null;
        Object stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        Object stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = null;
                    var5 = var9.getTopHwnd();
                    if (param2 >= 84) {
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
                    if (var5 != ((fb) this).field_c) {
                        statePc = 5;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (((fb) this).field_d != param1) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    return;
                }
                case 5: {
                    if (!((fb) this).field_a) {
                        statePc = 7;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 7: {
                    ((fb) this).field_b = com.ms.win32.User32.LoadCursor(0, 32512);
                    int discarded$12 = com.ms.dll.Root.alloc(this);
                    ((fb) this).field_a = true;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    if (((fb) this).field_c == var5) {
                        statePc = 23;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (((fb) this).field_c == 0) {
                        statePc = 15;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    ((fb) this).field_d = true;
                    int discarded$13 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
                    var6 = this;
                    // monitorenter this
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    try {
                        int discarded$14 = com.ms.win32.User32.SetWindowLong(((fb) this).field_c, -4, ((fb) this).field_e);
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
                        ((fb) this).field_c = var5;
                        ((fb) this).field_e = com.ms.win32.User32.SetWindowLong(((fb) this).field_c, -4, this);
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
                    if (!param1) {
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
                    ((fb) this).field_d = stackIn_20_1 != 0;
                    int discarded$15 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
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
                    if (!param1) {
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
                    ((fb) this).field_d = stackIn_26_1 != 0;
                    int discarded$16 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int stackIn_7_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == ((fb) this).field_c) {
          if (32 == param1) {
            var5 = param3 & 65535;
            if (var5 != 1) {
              if (param1 != 101024) {
                if (-2 == (param1 ^ -1)) {
                  ((fb) this).field_c = 0;
                  ((fb) this).field_d = true;
                  return com.ms.win32.User32.CallWindowProc(((fb) this).field_e, param0, param1, param2, param3);
                } else {
                  return com.ms.win32.User32.CallWindowProc(((fb) this).field_e, param0, param1, param2, param3);
                }
              } else {
                L0: {
                  if (!((fb) this).field_d) {
                    stackOut_20_0 = 0;
                    stackIn_21_0 = stackOut_20_0;
                    break L0;
                  } else {
                    stackOut_19_0 = ((fb) this).field_b;
                    stackIn_21_0 = stackOut_19_0;
                    break L0;
                  }
                }
                int discarded$3 = com.ms.win32.User32.SetCursor(stackIn_21_0);
                return 0;
              }
            } else {
              L1: {
                if (!((fb) this).field_d) {
                  stackOut_15_0 = 0;
                  stackIn_16_0 = stackOut_15_0;
                  break L1;
                } else {
                  stackOut_14_0 = ((fb) this).field_b;
                  stackIn_16_0 = stackOut_14_0;
                  break L1;
                }
              }
              int discarded$4 = com.ms.win32.User32.SetCursor(stackIn_16_0);
              return 0;
            }
          } else {
            if (param1 != 101024) {
              if (-2 == (param1 ^ -1)) {
                ((fb) this).field_c = 0;
                ((fb) this).field_d = true;
                return com.ms.win32.User32.CallWindowProc(((fb) this).field_e, param0, param1, param2, param3);
              } else {
                return com.ms.win32.User32.CallWindowProc(((fb) this).field_e, param0, param1, param2, param3);
              }
            } else {
              L2: {
                if (!((fb) this).field_d) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L2;
                } else {
                  stackOut_5_0 = ((fb) this).field_b;
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

    fb() {
        ((fb) this).field_d = true;
    }
}
