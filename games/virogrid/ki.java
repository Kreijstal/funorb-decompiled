/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ki extends com.ms.dll.Callback {
    private volatile boolean field_d;
    private volatile int field_b;
    private boolean field_e;
    private volatile int field_c;
    private int field_a;

    final void a(int param0, int param1, int param2) {
        boolean discarded$5 = com.ms.win32.User32.SetCursorPos(param1, param2);
        if (param0 != -1340) {
            Object var5 = null;
            ((ki) this).a((java.awt.Component) null, 25, true);
        }
    }

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int stackIn_8_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        if (((ki) this).field_b != param0) {
          var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
          return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        } else {
          if (param1 == 32) {
            var5 = param3 & 65535;
            if (1 != var5) {
              if (101024 != param1) {
                if (param1 == 1) {
                  ((ki) this).field_b = 0;
                  ((ki) this).field_d = true;
                  return com.ms.win32.User32.CallWindowProc(((ki) this).field_c, param0, param1, param2, param3);
                } else {
                  return com.ms.win32.User32.CallWindowProc(((ki) this).field_c, param0, param1, param2, param3);
                }
              } else {
                L0: {
                  if (!((ki) this).field_d) {
                    stackOut_21_0 = 0;
                    stackIn_22_0 = stackOut_21_0;
                    break L0;
                  } else {
                    stackOut_20_0 = ((ki) this).field_a;
                    stackIn_22_0 = stackOut_20_0;
                    break L0;
                  }
                }
                int discarded$3 = com.ms.win32.User32.SetCursor(stackIn_22_0);
                return 0;
              }
            } else {
              L1: {
                if (!((ki) this).field_d) {
                  stackOut_16_0 = 0;
                  stackIn_17_0 = stackOut_16_0;
                  break L1;
                } else {
                  stackOut_15_0 = ((ki) this).field_a;
                  stackIn_17_0 = stackOut_15_0;
                  break L1;
                }
              }
              int discarded$4 = com.ms.win32.User32.SetCursor(stackIn_17_0);
              return 0;
            }
          } else {
            if (101024 != param1) {
              if (param1 == 1) {
                ((ki) this).field_b = 0;
                ((ki) this).field_d = true;
                return com.ms.win32.User32.CallWindowProc(((ki) this).field_c, param0, param1, param2, param3);
              } else {
                return com.ms.win32.User32.CallWindowProc(((ki) this).field_c, param0, param1, param2, param3);
              }
            } else {
              L2: {
                if (!((ki) this).field_d) {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  break L2;
                } else {
                  stackOut_6_0 = ((ki) this).field_a;
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

    final void a(java.awt.Component param0, int param1, boolean param2) {
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        Object var7_ref = null;
        Throwable var8 = null;
        Throwable var9 = null;
        com.ms.awt.WComponentPeer var10 = null;
        boolean stackIn_2_0 = false;
        boolean stackIn_3_0 = false;
        boolean stackIn_4_0 = false;
        int stackIn_4_1 = 0;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        Object stackIn_24_0 = null;
        Object stackIn_25_0 = null;
        Object stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        boolean stackOut_1_0 = false;
        boolean stackOut_2_0 = false;
        int stackOut_2_1 = 0;
        boolean stackOut_3_0 = false;
        int stackOut_3_1 = 0;
        Object stackOut_10_0 = null;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
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
                    var5 = -126 % ((-37 - param1) / 58);
                    var10 = null;
                    var6 = var10.getTopHwnd();
                    if (var6 != ((ki) this).field_b) {
                        statePc = 6;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    stackOut_1_0 = param2;
                    stackIn_3_0 = stackOut_1_0;
                    stackIn_2_0 = stackOut_1_0;
                    if (((ki) this).field_d) {
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
                    if ((stackIn_4_0 ? 1 : 0) == stackIn_4_1) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    return;
                }
                case 6: {
                    if (!((ki) this).field_e) {
                        statePc = 8;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 8: {
                    ((ki) this).field_a = com.ms.win32.User32.LoadCursor(0, 32512);
                    int discarded$5 = com.ms.dll.Root.alloc(this);
                    ((ki) this).field_e = true;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    if (((ki) this).field_b != var6) {
                        statePc = 14;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    stackOut_10_0 = this;
                    stackIn_12_0 = stackOut_10_0;
                    stackIn_11_0 = stackOut_10_0;
                    if (!param2) {
                        statePc = 12;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    stackOut_11_0 = this;
                    stackOut_11_1 = 1;
                    stackIn_13_0 = stackOut_11_0;
                    stackIn_13_1 = stackOut_11_1;
                    statePc = 13;
                    continue stateLoop;
                }
                case 12: {
                    stackOut_12_0 = this;
                    stackOut_12_1 = 0;
                    stackIn_13_0 = stackOut_12_0;
                    stackIn_13_1 = stackOut_12_1;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    ((ki) this).field_d = stackIn_13_1 != 0;
                    int discarded$6 = com.ms.win32.User32.SendMessage(var6, 101024, 0, 0);
                    return;
                }
                case 14: {
                    if (((ki) this).field_b != 0) {
                        statePc = 16;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 16: {
                    ((ki) this).field_d = true;
                    int discarded$7 = com.ms.win32.User32.SendMessage(var6, 101024, 0, 0);
                    var7_ref = this;
                    // monitorenter this
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    try {
                        int discarded$8 = com.ms.win32.User32.SetWindowLong(((ki) this).field_b, -4, ((ki) this).field_c);
                        // monitorexit var7_ref
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var8 = caughtException;
                        // monitorexit var7_ref
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 20: {
                    throw (RuntimeException) (Object) var8;
                }
                case 21: {
                    var7_ref = this;
                    // monitorenter this
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    try {
                        ((ki) this).field_b = var6;
                        ((ki) this).field_c = com.ms.win32.User32.SetWindowLong(((ki) this).field_b, -4, this);
                        // monitorexit var7_ref
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 27;
                        continue stateLoop;
                    }
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
                    ((ki) this).field_d = stackIn_26_1 != 0;
                    int discarded$9 = com.ms.win32.User32.SendMessage(var6, 101024, 0, 0);
                    return;
                }
                case 27: {
                    try {
                        var9 = caughtException;
                        // monitorexit var7_ref
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 28: {
                    throw (RuntimeException) (Object) var9;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    ki() {
        ((ki) this).field_d = true;
    }
}
