/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class in extends com.ms.dll.Callback {
    private int field_b;
    private boolean field_d;
    private volatile boolean field_a;
    private volatile int field_e;
    private volatile int field_c;

    final void a(boolean param0, java.awt.Component param1, byte param2) {
        int var5 = 0;
        Object var6 = null;
        Throwable var7 = null;
        Throwable var8 = null;
        com.ms.awt.WComponentPeer var9 = null;
        int stackIn_6_0 = 0;
        Object stackIn_14_0 = null;
        Object stackIn_15_0 = null;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        Object stackIn_26_0 = null;
        Object stackIn_27_0 = null;
        Object stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        Object stackOut_25_0 = null;
        Object stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        Object stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        Object stackOut_13_0 = null;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        var9 = null;
        var5 = var9.getTopHwnd();
        if (param2 >= 71) {
          L0: {
            if (((in) this).field_c != var5) {
              break L0;
            } else {
              L1: {
                if (param0) {
                  stackOut_5_0 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L1;
                }
              }
              if (stackIn_6_0 != (((in) this).field_a ? 1 : 0)) {
                return;
              } else {
                break L0;
              }
            }
          }
          L2: {
            if (!((in) this).field_d) {
              ((in) this).field_b = com.ms.win32.User32.LoadCursor(0, 32512);
              int discarded$13 = com.ms.dll.Root.alloc(this);
              ((in) this).field_d = true;
              break L2;
            } else {
              break L2;
            }
          }
          if (var5 != ((in) this).field_c) {
            L3: {
              if (((in) this).field_c == 0) {
                break L3;
              } else {
                ((in) this).field_a = true;
                int discarded$14 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
                var6 = this;
                synchronized (var6) {
                  L4: {
                    int discarded$15 = com.ms.win32.User32.SetWindowLong(((in) this).field_c, -4, ((in) this).field_e);
                    break L4;
                  }
                }
                break L3;
              }
            }
            var6 = this;
            synchronized (var6) {
              L5: {
                ((in) this).field_c = var5;
                ((in) this).field_e = com.ms.win32.User32.SetWindowLong(((in) this).field_c, -4, this);
                break L5;
              }
            }
            L6: {
              stackOut_25_0 = this;
              stackIn_27_0 = stackOut_25_0;
              stackIn_26_0 = stackOut_25_0;
              if (!param0) {
                stackOut_27_0 = this;
                stackOut_27_1 = 0;
                stackIn_28_0 = stackOut_27_0;
                stackIn_28_1 = stackOut_27_1;
                break L6;
              } else {
                stackOut_26_0 = this;
                stackOut_26_1 = 1;
                stackIn_28_0 = stackOut_26_0;
                stackIn_28_1 = stackOut_26_1;
                break L6;
              }
            }
            ((in) this).field_a = stackIn_28_1 != 0;
            int discarded$16 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
            return;
          } else {
            L7: {
              stackOut_13_0 = this;
              stackIn_15_0 = stackOut_13_0;
              stackIn_14_0 = stackOut_13_0;
              if (!param0) {
                stackOut_15_0 = this;
                stackOut_15_1 = 0;
                stackIn_16_0 = stackOut_15_0;
                stackIn_16_1 = stackOut_15_1;
                break L7;
              } else {
                stackOut_14_0 = this;
                stackOut_14_1 = 1;
                stackIn_16_0 = stackOut_14_0;
                stackIn_16_1 = stackOut_14_1;
                break L7;
              }
            }
            ((in) this).field_a = stackIn_16_1 != 0;
            int discarded$17 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
            return;
          }
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2) {
        boolean discarded$5 = com.ms.win32.User32.SetCursorPos(param1, param0);
        if (param2 != 0) {
            ((in) this).field_a = true;
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
        if (((in) this).field_c == param0) {
          if (param1 == 32) {
            var5 = 65535 & param3;
            if ((var5 ^ -1) != -2) {
              if (param1 != 101024) {
                if ((param1 ^ -1) == -2) {
                  ((in) this).field_c = 0;
                  ((in) this).field_a = true;
                  return com.ms.win32.User32.CallWindowProc(((in) this).field_e, param0, param1, param2, param3);
                } else {
                  return com.ms.win32.User32.CallWindowProc(((in) this).field_e, param0, param1, param2, param3);
                }
              } else {
                L0: {
                  if (!((in) this).field_a) {
                    stackOut_20_0 = 0;
                    stackIn_21_0 = stackOut_20_0;
                    break L0;
                  } else {
                    stackOut_19_0 = ((in) this).field_b;
                    stackIn_21_0 = stackOut_19_0;
                    break L0;
                  }
                }
                int discarded$3 = com.ms.win32.User32.SetCursor(stackIn_21_0);
                return 0;
              }
            } else {
              L1: {
                if (!((in) this).field_a) {
                  stackOut_15_0 = 0;
                  stackIn_16_0 = stackOut_15_0;
                  break L1;
                } else {
                  stackOut_14_0 = ((in) this).field_b;
                  stackIn_16_0 = stackOut_14_0;
                  break L1;
                }
              }
              int discarded$4 = com.ms.win32.User32.SetCursor(stackIn_16_0);
              return 0;
            }
          } else {
            if (param1 != 101024) {
              if ((param1 ^ -1) == -2) {
                ((in) this).field_c = 0;
                ((in) this).field_a = true;
                return com.ms.win32.User32.CallWindowProc(((in) this).field_e, param0, param1, param2, param3);
              } else {
                return com.ms.win32.User32.CallWindowProc(((in) this).field_e, param0, param1, param2, param3);
              }
            } else {
              L2: {
                if (!((in) this).field_a) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L2;
                } else {
                  stackOut_5_0 = ((in) this).field_b;
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

    in() {
        ((in) this).field_a = true;
    }
}
