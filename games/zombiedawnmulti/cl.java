/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cl extends com.ms.dll.Callback {
    private volatile int field_a;
    private volatile int field_d;
    private boolean field_c;
    private int field_e;
    private volatile boolean field_b;

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        if (!(((cl) this).field_d == param0)) {
            var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
            return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        }
        if (param1 == 32) {
            var5 = param3 & 65535;
            if (var5 != 1) {
                if (param1 == 101024) {
                    int discarded$0 = com.ms.win32.User32.SetCursor(!((cl) this).field_b ? 0 : ((cl) this).field_e);
                    return 0;
                }
                if (param1 == 1) {
                    ((cl) this).field_d = 0;
                    ((cl) this).field_b = true;
                    return com.ms.win32.User32.CallWindowProc(((cl) this).field_a, param0, param1, param2, param3);
                }
                return com.ms.win32.User32.CallWindowProc(((cl) this).field_a, param0, param1, param2, param3);
            }
            int discarded$1 = com.ms.win32.User32.SetCursor(!((cl) this).field_b ? 0 : ((cl) this).field_e);
            return 0;
        }
        if (param1 == 101024) {
            int discarded$2 = com.ms.win32.User32.SetCursor(!((cl) this).field_b ? 0 : ((cl) this).field_e);
            return 0;
        }
        if (param1 == 1) {
            ((cl) this).field_d = 0;
            ((cl) this).field_b = true;
            return com.ms.win32.User32.CallWindowProc(((cl) this).field_a, param0, param1, param2, param3);
        }
        return com.ms.win32.User32.CallWindowProc(((cl) this).field_a, param0, param1, param2, param3);
    }

    final void a(java.awt.Component param0, boolean param1, int param2) {
        int var5 = 0;
        Object var6 = null;
        Throwable var7 = null;
        Throwable var8 = null;
        com.ms.awt.WComponentPeer var9 = null;
        boolean stackIn_4_0 = false;
        boolean stackIn_5_0 = false;
        boolean stackIn_6_0 = false;
        int stackIn_6_1 = 0;
        Object stackIn_13_0 = null;
        Object stackIn_14_0 = null;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        Object stackIn_25_0 = null;
        Object stackIn_26_0 = null;
        Object stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        Throwable decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        boolean stackOut_5_0 = false;
        int stackOut_5_1 = 0;
        boolean stackOut_4_0 = false;
        int stackOut_4_1 = 0;
        Object stackOut_24_0 = null;
        Object stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        Object stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        Object stackOut_12_0 = null;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        if (param2 == -1101) {
          L0: {
            var9 = null;
            var5 = var9.getTopHwnd();
            if (var5 != ((cl) this).field_d) {
              break L0;
            } else {
              L1: {
                stackOut_3_0 = ((cl) this).field_b;
                stackIn_5_0 = stackOut_3_0;
                stackIn_4_0 = stackOut_3_0;
                if (param1) {
                  stackOut_5_0 = stackIn_5_0;
                  stackOut_5_1 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  stackIn_6_1 = stackOut_5_1;
                  break L1;
                } else {
                  stackOut_4_0 = stackIn_4_0;
                  stackOut_4_1 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_6_1 = stackOut_4_1;
                  break L1;
                }
              }
              if ((stackIn_6_0 ? 1 : 0) != stackIn_6_1) {
                return;
              } else {
                break L0;
              }
            }
          }
          L2: {
            if (((cl) this).field_c) {
              break L2;
            } else {
              ((cl) this).field_e = com.ms.win32.User32.LoadCursor(0, 32512);
              int discarded$14 = com.ms.dll.Root.alloc(this);
              ((cl) this).field_c = true;
              break L2;
            }
          }
          if (var5 != ((cl) this).field_d) {
            L3: {
              if (((cl) this).field_d == 0) {
                break L3;
              } else {
                ((cl) this).field_b = true;
                int discarded$15 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
                var6 = this;
                synchronized (var6) {
                  L4: {
                    int discarded$16 = com.ms.win32.User32.SetWindowLong(((cl) this).field_d, -4, ((cl) this).field_a);
                    break L4;
                  }
                }
                break L3;
              }
            }
            var6 = this;
            synchronized (var6) {
              L5: {
                ((cl) this).field_d = var5;
                ((cl) this).field_a = com.ms.win32.User32.SetWindowLong(((cl) this).field_d, -4, this);
                break L5;
              }
            }
            L6: {
              stackOut_24_0 = this;
              stackIn_26_0 = stackOut_24_0;
              stackIn_25_0 = stackOut_24_0;
              if (!param1) {
                stackOut_26_0 = this;
                stackOut_26_1 = 0;
                stackIn_27_0 = stackOut_26_0;
                stackIn_27_1 = stackOut_26_1;
                break L6;
              } else {
                stackOut_25_0 = this;
                stackOut_25_1 = 1;
                stackIn_27_0 = stackOut_25_0;
                stackIn_27_1 = stackOut_25_1;
                break L6;
              }
            }
            ((cl) this).field_b = stackIn_27_1 != 0;
            int discarded$17 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
            return;
          } else {
            L7: {
              stackOut_12_0 = this;
              stackIn_14_0 = stackOut_12_0;
              stackIn_13_0 = stackOut_12_0;
              if (!param1) {
                stackOut_14_0 = this;
                stackOut_14_1 = 0;
                stackIn_15_0 = stackOut_14_0;
                stackIn_15_1 = stackOut_14_1;
                break L7;
              } else {
                stackOut_13_0 = this;
                stackOut_13_1 = 1;
                stackIn_15_0 = stackOut_13_0;
                stackIn_15_1 = stackOut_13_1;
                break L7;
              }
            }
            ((cl) this).field_b = stackIn_15_1 != 0;
            int discarded$18 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
            return;
          }
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2) {
        boolean discarded$4 = com.ms.win32.User32.SetCursorPos(param2, param0);
        if (param1 >= -10) {
            Object var5 = null;
            ((cl) this).a((java.awt.Component) null, true, 29);
        }
    }

    cl() {
        ((cl) this).field_b = true;
    }
}
