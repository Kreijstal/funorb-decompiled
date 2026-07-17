/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ca extends com.ms.dll.Callback {
    private int field_a;
    private boolean field_b;
    private volatile int field_c;
    private volatile int field_e;
    private volatile boolean field_d;

    final void a(int param0, int param1, int param2) {
        boolean discarded$5 = com.ms.win32.User32.SetCursorPos(param2, param1);
        if (param0 != 26899) {
            ((ca) this).field_b = false;
        }
    }

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        if (~param0 != ~((ca) this).field_c) {
            var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
            return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        }
        if (param1 != 32) {
            if (!(param1 != 101024)) {
                int discarded$0 = com.ms.win32.User32.SetCursor(!((ca) this).field_d ? 0 : ((ca) this).field_a);
                return 0;
            }
            if (!(param1 != 1)) {
                ((ca) this).field_c = 0;
                ((ca) this).field_d = true;
            }
            return com.ms.win32.User32.CallWindowProc(((ca) this).field_e, param0, param1, param2, param3);
        }
        var5 = param3 & 65535;
        if (var5 == 1) {
            int discarded$1 = com.ms.win32.User32.SetCursor(!((ca) this).field_d ? 0 : ((ca) this).field_a);
            return 0;
        }
        if (!(param1 != 101024)) {
            int discarded$2 = com.ms.win32.User32.SetCursor(!((ca) this).field_d ? 0 : ((ca) this).field_a);
            return 0;
        }
        if (!(param1 != 1)) {
            ((ca) this).field_c = 0;
            ((ca) this).field_d = true;
        }
        return com.ms.win32.User32.CallWindowProc(((ca) this).field_e, param0, param1, param2, param3);
    }

    final void a(int param0, java.awt.Component param1, boolean param2) {
        int var5 = 0;
        Object var6 = null;
        Throwable var7 = null;
        Throwable var8 = null;
        com.ms.awt.WComponentPeer var9 = null;
        boolean stackIn_4_0 = false;
        boolean stackIn_5_0 = false;
        boolean stackIn_6_0 = false;
        int stackIn_6_1 = 0;
        Object stackIn_21_0 = null;
        Object stackIn_22_0 = null;
        Object stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        Object stackIn_27_0 = null;
        Object stackIn_28_0 = null;
        Object stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        Throwable decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        boolean stackOut_5_0 = false;
        int stackOut_5_1 = 0;
        boolean stackOut_4_0 = false;
        int stackOut_4_1 = 0;
        Object stackOut_26_0 = null;
        Object stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        Object stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        Object stackOut_20_0 = null;
        Object stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        Object stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        L0: {
          if (param0 > 49) {
            break L0;
          } else {
            ((ca) this).field_a = 16;
            break L0;
          }
        }
        L1: {
          var9 = null;
          var5 = var9.getTopHwnd();
          if (((ca) this).field_c != var5) {
            break L1;
          } else {
            L2: {
              stackOut_3_0 = param2;
              stackIn_5_0 = stackOut_3_0;
              stackIn_4_0 = stackOut_3_0;
              if (((ca) this).field_d) {
                stackOut_5_0 = stackIn_5_0;
                stackOut_5_1 = 0;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                break L2;
              } else {
                stackOut_4_0 = stackIn_4_0;
                stackOut_4_1 = 1;
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                break L2;
              }
            }
            if ((stackIn_6_0 ? 1 : 0) != stackIn_6_1) {
              return;
            } else {
              break L1;
            }
          }
        }
        L3: {
          if (((ca) this).field_b) {
            break L3;
          } else {
            ((ca) this).field_a = com.ms.win32.User32.LoadCursor(0, 32512);
            int discarded$5 = com.ms.dll.Root.alloc(this);
            ((ca) this).field_b = true;
            break L3;
          }
        }
        if (~((ca) this).field_c == ~var5) {
          L4: {
            stackOut_26_0 = this;
            stackIn_28_0 = stackOut_26_0;
            stackIn_27_0 = stackOut_26_0;
            if (!param2) {
              stackOut_28_0 = this;
              stackOut_28_1 = 0;
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              break L4;
            } else {
              stackOut_27_0 = this;
              stackOut_27_1 = 1;
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              break L4;
            }
          }
          ((ca) this).field_d = stackIn_29_1 != 0;
          int discarded$6 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
          return;
        } else {
          L5: {
            if (((ca) this).field_c == 0) {
              break L5;
            } else {
              ((ca) this).field_d = true;
              int discarded$7 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
              var6 = this;
              synchronized (var6) {
                L6: {
                  int discarded$8 = com.ms.win32.User32.SetWindowLong(((ca) this).field_c, -4, ((ca) this).field_e);
                  break L6;
                }
              }
              break L5;
            }
          }
          var6 = this;
          synchronized (var6) {
            L7: {
              ((ca) this).field_c = var5;
              ((ca) this).field_e = com.ms.win32.User32.SetWindowLong(((ca) this).field_c, -4, this);
              break L7;
            }
          }
          L8: {
            stackOut_20_0 = this;
            stackIn_22_0 = stackOut_20_0;
            stackIn_21_0 = stackOut_20_0;
            if (!param2) {
              stackOut_22_0 = this;
              stackOut_22_1 = 0;
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              break L8;
            } else {
              stackOut_21_0 = this;
              stackOut_21_1 = 1;
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              break L8;
            }
          }
          ((ca) this).field_d = stackIn_23_1 != 0;
          int discarded$9 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
          return;
        }
    }

    ca() {
        ((ca) this).field_d = true;
    }
}
