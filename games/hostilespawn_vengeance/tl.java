/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tl extends com.ms.dll.Callback {
    private int field_d;
    private volatile boolean field_c;
    private volatile int field_e;
    private volatile int field_a;
    private boolean field_b;

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        if (!(~param0 == ~((tl) this).field_e)) {
            var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
            return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        }
        if (32 != param1) {
            if (!(param1 != 101024)) {
                int discarded$0 = com.ms.win32.User32.SetCursor(((tl) this).field_c ? ((tl) this).field_d : 0);
                return 0;
            }
            if (!(param1 != 1)) {
                ((tl) this).field_e = 0;
                ((tl) this).field_c = true;
            }
            return com.ms.win32.User32.CallWindowProc(((tl) this).field_a, param0, param1, param2, param3);
        }
        var5 = 65535 & param3;
        if (1 == var5) {
            int discarded$1 = com.ms.win32.User32.SetCursor(((tl) this).field_c ? ((tl) this).field_d : 0);
            return 0;
        }
        if (!(param1 != 101024)) {
            int discarded$2 = com.ms.win32.User32.SetCursor(((tl) this).field_c ? ((tl) this).field_d : 0);
            return 0;
        }
        if (!(param1 != 1)) {
            ((tl) this).field_e = 0;
            ((tl) this).field_c = true;
        }
        return com.ms.win32.User32.CallWindowProc(((tl) this).field_a, param0, param1, param2, param3);
    }

    final void a(int param0, boolean param1, java.awt.Component param2) {
        int var5 = 0;
        Object var6 = null;
        Throwable var7 = null;
        Throwable var8 = null;
        com.ms.awt.WComponentPeer var9 = null;
        boolean stackIn_2_0 = false;
        boolean stackIn_3_0 = false;
        boolean stackIn_4_0 = false;
        int stackIn_4_1 = 0;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        Object stackIn_23_0 = null;
        Object stackIn_24_0 = null;
        Object stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        Throwable decompiledCaughtException = null;
        boolean stackOut_1_0 = false;
        boolean stackOut_3_0 = false;
        int stackOut_3_1 = 0;
        boolean stackOut_2_0 = false;
        int stackOut_2_1 = 0;
        Object stackOut_22_0 = null;
        Object stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        Object stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        Object stackOut_9_0 = null;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        L0: {
          var9 = null;
          var5 = var9.getTopHwnd();
          if (((tl) this).field_e != var5) {
            break L0;
          } else {
            L1: {
              stackOut_1_0 = ((tl) this).field_c;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (param1) {
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
            if ((stackIn_4_0 ? 1 : 0) == stackIn_4_1) {
              break L0;
            } else {
              return;
            }
          }
        }
        L2: {
          if (((tl) this).field_b) {
            break L2;
          } else {
            ((tl) this).field_d = com.ms.win32.User32.LoadCursor(0, 32512);
            int discarded$14 = com.ms.dll.Root.alloc(this);
            ((tl) this).field_b = true;
            break L2;
          }
        }
        if (((tl) this).field_e != var5) {
          L3: {
            if (((tl) this).field_e != 0) {
              ((tl) this).field_c = true;
              int discarded$15 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
              var6 = this;
              synchronized (var6) {
                L4: {
                  int discarded$16 = com.ms.win32.User32.SetWindowLong(((tl) this).field_e, -4, ((tl) this).field_a);
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
              ((tl) this).field_e = var5;
              ((tl) this).field_a = com.ms.win32.User32.SetWindowLong(((tl) this).field_e, -4, this);
              break L5;
            }
          }
          L6: {
            stackOut_22_0 = this;
            stackIn_24_0 = stackOut_22_0;
            stackIn_23_0 = stackOut_22_0;
            if (!param1) {
              stackOut_24_0 = this;
              stackOut_24_1 = 0;
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              break L6;
            } else {
              stackOut_23_0 = this;
              stackOut_23_1 = 1;
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              break L6;
            }
          }
          ((tl) this).field_c = stackIn_25_1 != 0;
          int discarded$17 = com.ms.win32.User32.SendMessage(var5, 101024, param0, 0);
          return;
        } else {
          L7: {
            stackOut_9_0 = this;
            stackIn_11_0 = stackOut_9_0;
            stackIn_10_0 = stackOut_9_0;
            if (!param1) {
              stackOut_11_0 = this;
              stackOut_11_1 = 0;
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              break L7;
            } else {
              stackOut_10_0 = this;
              stackOut_10_1 = 1;
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              break L7;
            }
          }
          ((tl) this).field_c = stackIn_12_1 != 0;
          int discarded$18 = com.ms.win32.User32.SendMessage(var5, 101024, param0, 0);
          return;
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4 = -14 % ((77 - param1) / 33);
        boolean discarded$0 = com.ms.win32.User32.SetCursorPos(param2, param0);
    }

    tl() {
        ((tl) this).field_c = true;
    }
}
