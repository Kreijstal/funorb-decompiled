/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dc extends com.ms.dll.Callback {
    private volatile int field_e;
    private int field_c;
    private volatile boolean field_d;
    private volatile int field_b;
    private boolean field_a;

    final void a(int param0, int param1, int param2) {
        Object var5 = null;
        if (param0 != -12384) {
          var5 = null;
          ((dc) this).a(-74, true, (java.awt.Component) null);
          boolean discarded$4 = com.ms.win32.User32.SetCursorPos(param2, param1);
          return;
        } else {
          boolean discarded$5 = com.ms.win32.User32.SetCursorPos(param2, param1);
          return;
        }
    }

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        if (!(((dc) this).field_e == param0)) {
            var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
            return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        }
        if (-33 != (param1 ^ -1)) {
            if (!(param1 != 101024)) {
                int discarded$0 = com.ms.win32.User32.SetCursor(!((dc) this).field_d ? 0 : ((dc) this).field_c);
                return 0;
            }
            if (!(-2 != (param1 ^ -1))) {
                ((dc) this).field_e = 0;
                ((dc) this).field_d = true;
            }
            return com.ms.win32.User32.CallWindowProc(((dc) this).field_b, param0, param1, param2, param3);
        }
        var5 = 65535 & param3;
        if ((var5 ^ -1) == -2) {
            int discarded$1 = com.ms.win32.User32.SetCursor(!((dc) this).field_d ? 0 : ((dc) this).field_c);
            return 0;
        }
        if (!(param1 != 101024)) {
            int discarded$2 = com.ms.win32.User32.SetCursor(!((dc) this).field_d ? 0 : ((dc) this).field_c);
            return 0;
        }
        if (!(-2 != (param1 ^ -1))) {
            ((dc) this).field_e = 0;
            ((dc) this).field_d = true;
        }
        return com.ms.win32.User32.CallWindowProc(((dc) this).field_b, param0, param1, param2, param3);
    }

    final void a(int param0, boolean param1, java.awt.Component param2) {
        int var5 = 0;
        Object var6 = null;
        Throwable var7 = null;
        Throwable var8 = null;
        com.ms.awt.WComponentPeer var9 = null;
        int stackIn_4_0 = 0;
        Object stackIn_13_0 = null;
        Object stackIn_14_0 = null;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        Object stackIn_26_0 = null;
        Object stackIn_27_0 = null;
        Object stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        Object stackOut_25_0 = null;
        Object stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        Object stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        Object stackOut_12_0 = null;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        L0: {
          var9 = null;
          var5 = var9.getTopHwnd();
          if (((dc) this).field_e != var5) {
            break L0;
          } else {
            L1: {
              if (((dc) this).field_d) {
                stackOut_3_0 = 0;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = 1;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            if (stackIn_4_0 == (param1 ? 1 : 0)) {
              break L0;
            } else {
              return;
            }
          }
        }
        L2: {
          if (!((dc) this).field_a) {
            ((dc) this).field_c = com.ms.win32.User32.LoadCursor(0, 32512);
            int discarded$13 = com.ms.dll.Root.alloc(this);
            ((dc) this).field_a = true;
            break L2;
          } else {
            break L2;
          }
        }
        if (param0 == -11888) {
          if (((dc) this).field_e != var5) {
            L3: {
              if (((dc) this).field_e != 0) {
                ((dc) this).field_d = true;
                int discarded$14 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
                var6 = this;
                synchronized (var6) {
                  L4: {
                    int discarded$15 = com.ms.win32.User32.SetWindowLong(((dc) this).field_e, -4, ((dc) this).field_b);
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
                ((dc) this).field_e = var5;
                ((dc) this).field_b = com.ms.win32.User32.SetWindowLong(((dc) this).field_e, -4, this);
                break L5;
              }
            }
            L6: {
              stackOut_25_0 = this;
              stackIn_27_0 = stackOut_25_0;
              stackIn_26_0 = stackOut_25_0;
              if (!param1) {
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
            ((dc) this).field_d = stackIn_28_1 != 0;
            int discarded$16 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
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
            ((dc) this).field_d = stackIn_15_1 != 0;
            int discarded$17 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
            return;
          }
        } else {
          return;
        }
    }

    dc() {
        ((dc) this).field_d = true;
    }
}
