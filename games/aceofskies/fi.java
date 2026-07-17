/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fi extends com.ms.dll.Callback {
    private volatile boolean field_d;
    private int field_b;
    private volatile int field_a;
    private volatile int field_e;
    private boolean field_c;

    final void a(boolean param0, java.awt.Component param1, int param2) {
        int var5 = 0;
        Object var6 = null;
        Throwable var7 = null;
        Throwable var8 = null;
        com.ms.awt.WComponentPeer var9 = null;
        boolean stackIn_2_0 = false;
        boolean stackIn_3_0 = false;
        boolean stackIn_4_0 = false;
        int stackIn_4_1 = 0;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        Object stackIn_27_0 = null;
        Object stackIn_28_0 = null;
        Object stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        Throwable decompiledCaughtException = null;
        boolean stackOut_1_0 = false;
        boolean stackOut_3_0 = false;
        int stackOut_3_1 = 0;
        boolean stackOut_2_0 = false;
        int stackOut_2_1 = 0;
        Object stackOut_26_0 = null;
        Object stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        Object stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        Object stackOut_10_0 = null;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        L0: {
          var9 = null;
          var5 = var9.getTopHwnd();
          if (((fi) this).field_a != var5) {
            break L0;
          } else {
            L1: {
              stackOut_1_0 = param0;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (((fi) this).field_d) {
                stackOut_3_0 = stackIn_3_0;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = stackIn_2_0;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            if ((stackIn_4_0 ? 1 : 0) != stackIn_4_1) {
              return;
            } else {
              break L0;
            }
          }
        }
        L2: {
          if (((fi) this).field_c) {
            break L2;
          } else {
            ((fi) this).field_b = com.ms.win32.User32.LoadCursor(0, 32512);
            int discarded$5 = com.ms.dll.Root.alloc(this);
            ((fi) this).field_c = true;
            break L2;
          }
        }
        if (var5 != ((fi) this).field_a) {
          L3: {
            if (((fi) this).field_a != 0) {
              ((fi) this).field_d = true;
              int discarded$6 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
              var6 = this;
              synchronized (var6) {
                L4: {
                  int discarded$7 = com.ms.win32.User32.SetWindowLong(((fi) this).field_a, -4, ((fi) this).field_e);
                  break L4;
                }
              }
              break L3;
            } else {
              break L3;
            }
          }
          var6 = this;
          synchronized (var6) {
            L5: {
              ((fi) this).field_a = var5;
              ((fi) this).field_e = com.ms.win32.User32.SetWindowLong(((fi) this).field_a, -4, this);
              break L5;
            }
          }
          L6: {
            stackOut_26_0 = this;
            stackIn_28_0 = stackOut_26_0;
            stackIn_27_0 = stackOut_26_0;
            if (!param0) {
              stackOut_28_0 = this;
              stackOut_28_1 = 0;
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              break L6;
            } else {
              stackOut_27_0 = this;
              stackOut_27_1 = 1;
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              break L6;
            }
          }
          ((fi) this).field_d = stackIn_29_1 != 0;
          if (param2 != -4) {
            return;
          } else {
            int discarded$8 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
            return;
          }
        } else {
          L7: {
            stackOut_10_0 = this;
            stackIn_12_0 = stackOut_10_0;
            stackIn_11_0 = stackOut_10_0;
            if (!param0) {
              stackOut_12_0 = this;
              stackOut_12_1 = 0;
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              break L7;
            } else {
              stackOut_11_0 = this;
              stackOut_11_1 = 1;
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              break L7;
            }
          }
          ((fi) this).field_d = stackIn_13_1 != 0;
          if (param2 != -4) {
            return;
          } else {
            int discarded$9 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
            return;
          }
        }
    }

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        if (((fi) this).field_a != param0) {
            var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
            return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        }
        if (param1 != 32) {
            if (param1 == 101024) {
                int discarded$0 = com.ms.win32.User32.SetCursor(((fi) this).field_d ? ((fi) this).field_b : 0);
                return 0;
            }
            if (!(1 != param1)) {
                ((fi) this).field_a = 0;
                ((fi) this).field_d = true;
            }
            return com.ms.win32.User32.CallWindowProc(((fi) this).field_e, param0, param1, param2, param3);
        }
        var5 = param3 & 65535;
        if (var5 != 1) {
            if (param1 == 101024) {
                int discarded$1 = com.ms.win32.User32.SetCursor(((fi) this).field_d ? ((fi) this).field_b : 0);
                return 0;
            }
            if (!(1 != param1)) {
                ((fi) this).field_a = 0;
                ((fi) this).field_d = true;
            }
            return com.ms.win32.User32.CallWindowProc(((fi) this).field_e, param0, param1, param2, param3);
        }
        int discarded$2 = com.ms.win32.User32.SetCursor(!((fi) this).field_d ? 0 : ((fi) this).field_b);
        return 0;
    }

    final void a(int param0, int param1, int param2) {
        if (param0 != 0) {
            ((fi) this).field_d = false;
            boolean discarded$0 = com.ms.win32.User32.SetCursorPos(param1, param2);
            return;
        }
        boolean discarded$1 = com.ms.win32.User32.SetCursorPos(param1, param2);
    }

    fi() {
        ((fi) this).field_d = true;
    }
}
