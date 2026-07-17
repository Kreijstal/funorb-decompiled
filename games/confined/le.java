/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class le extends com.ms.dll.Callback {
    private volatile int field_b;
    private volatile boolean field_d;
    private boolean field_a;
    private int field_c;
    private volatile int field_e;

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        if (!(~((le) this).field_e == ~param0)) {
            var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
            return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        }
        if (param1 != 32) {
            if (!(param1 != 101024)) {
                int discarded$0 = com.ms.win32.User32.SetCursor(!((le) this).field_d ? 0 : ((le) this).field_c);
                return 0;
            }
            if (!(param1 != 1)) {
                ((le) this).field_e = 0;
                ((le) this).field_d = true;
            }
            return com.ms.win32.User32.CallWindowProc(((le) this).field_b, param0, param1, param2, param3);
        }
        var5 = param3 & 65535;
        if (var5 != 1) {
            if (!(param1 != 101024)) {
                int discarded$1 = com.ms.win32.User32.SetCursor(!((le) this).field_d ? 0 : ((le) this).field_c);
                return 0;
            }
            if (!(param1 != 1)) {
                ((le) this).field_e = 0;
                ((le) this).field_d = true;
            }
            return com.ms.win32.User32.CallWindowProc(((le) this).field_b, param0, param1, param2, param3);
        }
        int discarded$2 = com.ms.win32.User32.SetCursor(((le) this).field_d ? ((le) this).field_c : 0);
        return 0;
    }

    final void a(byte param0, java.awt.Component param1, boolean param2) {
        int var5 = 0;
        Object var6 = null;
        Throwable var7 = null;
        Throwable var8 = null;
        com.ms.awt.WComponentPeer var9 = null;
        int stackIn_4_0 = 0;
        Object stackIn_14_0 = null;
        Object stackIn_15_0 = null;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        Object stackIn_29_0 = null;
        Object stackIn_30_0 = null;
        Object stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        Object stackOut_28_0 = null;
        Object stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        Object stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        Object stackOut_13_0 = null;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        L0: {
          var9 = null;
          var5 = var9.getTopHwnd();
          if (((le) this).field_e != var5) {
            break L0;
          } else {
            L1: {
              if (param2) {
                stackOut_3_0 = 0;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = 1;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            if (stackIn_4_0 != (((le) this).field_d ? 1 : 0)) {
              return;
            } else {
              break L0;
            }
          }
        }
        L2: {
          if (!((le) this).field_a) {
            ((le) this).field_c = com.ms.win32.User32.LoadCursor(0, 32512);
            int discarded$5 = com.ms.dll.Root.alloc(this);
            ((le) this).field_a = true;
            break L2;
          } else {
            break L2;
          }
        }
        if (var5 != ((le) this).field_e) {
          L3: {
            if (((le) this).field_e != 0) {
              ((le) this).field_d = true;
              int discarded$6 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
              var6 = this;
              synchronized (var6) {
                L4: {
                  int discarded$7 = com.ms.win32.User32.SetWindowLong(((le) this).field_e, -4, ((le) this).field_b);
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
              ((le) this).field_e = var5;
              ((le) this).field_b = com.ms.win32.User32.SetWindowLong(((le) this).field_e, -4, this);
              break L5;
            }
          }
          L6: {
            if (param0 < -62) {
              break L6;
            } else {
              ((le) this).field_c = -104;
              break L6;
            }
          }
          L7: {
            stackOut_28_0 = this;
            stackIn_30_0 = stackOut_28_0;
            stackIn_29_0 = stackOut_28_0;
            if (!param2) {
              stackOut_30_0 = this;
              stackOut_30_1 = 0;
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              break L7;
            } else {
              stackOut_29_0 = this;
              stackOut_29_1 = 1;
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              break L7;
            }
          }
          ((le) this).field_d = stackIn_31_1 != 0;
          int discarded$8 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
          return;
        } else {
          L8: {
            if (param0 < -62) {
              break L8;
            } else {
              ((le) this).field_c = -104;
              break L8;
            }
          }
          L9: {
            stackOut_13_0 = this;
            stackIn_15_0 = stackOut_13_0;
            stackIn_14_0 = stackOut_13_0;
            if (!param2) {
              stackOut_15_0 = this;
              stackOut_15_1 = 0;
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              break L9;
            } else {
              stackOut_14_0 = this;
              stackOut_14_1 = 1;
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              break L9;
            }
          }
          ((le) this).field_d = stackIn_16_1 != 0;
          int discarded$9 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
          return;
        }
    }

    final void a(byte param0, int param1, int param2) {
        boolean discarded$0 = com.ms.win32.User32.SetCursorPos(param1, param2);
        int var4 = -121 / ((param0 - -50) / 38);
    }

    le() {
        ((le) this).field_d = true;
    }
}
