/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pp extends com.ms.dll.Callback {
    private int field_b;
    private volatile int field_e;
    private boolean field_d;
    private volatile int field_c;
    private volatile boolean field_a;

    final void a(int param0, int param1, int param2) {
        boolean discarded$5 = com.ms.win32.User32.SetCursorPos(param0, param2);
        if (param1 != -4) {
            int discarded$6 = ((pp) this).callback(-126, -112, 29, -80);
        }
    }

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
        Object stackIn_20_0 = null;
        Object stackIn_21_0 = null;
        Object stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        Object stackIn_26_0 = null;
        Object stackIn_27_0 = null;
        Object stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        Throwable decompiledCaughtException = null;
        boolean stackOut_1_0 = false;
        boolean stackOut_3_0 = false;
        int stackOut_3_1 = 0;
        boolean stackOut_2_0 = false;
        int stackOut_2_1 = 0;
        Object stackOut_25_0 = null;
        Object stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        Object stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        Object stackOut_19_0 = null;
        Object stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        Object stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        L0: {
          var9 = null;
          var5 = var9.getTopHwnd();
          if (((pp) this).field_c != var5) {
            break L0;
          } else {
            L1: {
              stackOut_1_0 = param0;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (((pp) this).field_a) {
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
          if (!((pp) this).field_d) {
            ((pp) this).field_b = com.ms.win32.User32.LoadCursor(0, 32512);
            int discarded$12 = com.ms.dll.Root.alloc(this);
            ((pp) this).field_d = true;
            break L2;
          } else {
            break L2;
          }
        }
        if (var5 == ((pp) this).field_c) {
          L3: {
            stackOut_25_0 = this;
            stackIn_27_0 = stackOut_25_0;
            stackIn_26_0 = stackOut_25_0;
            if (!param0) {
              stackOut_27_0 = this;
              stackOut_27_1 = 0;
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              break L3;
            } else {
              stackOut_26_0 = this;
              stackOut_26_1 = 1;
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              break L3;
            }
          }
          ((pp) this).field_a = stackIn_28_1 != 0;
          int discarded$13 = com.ms.win32.User32.SendMessage(var5, 101024, 0, param2);
          return;
        } else {
          L4: {
            if (((pp) this).field_c != 0) {
              ((pp) this).field_a = true;
              int discarded$14 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
              var6 = this;
              synchronized (var6) {
                L5: {
                  int discarded$15 = com.ms.win32.User32.SetWindowLong(((pp) this).field_c, -4, ((pp) this).field_e);
                  break L5;
                }
              }
              break L4;
            } else {
              break L4;
            }
          }
          var6 = this;
          synchronized (var6) {
            L6: {
              ((pp) this).field_c = var5;
              ((pp) this).field_e = com.ms.win32.User32.SetWindowLong(((pp) this).field_c, -4, this);
              break L6;
            }
          }
          L7: {
            stackOut_19_0 = this;
            stackIn_21_0 = stackOut_19_0;
            stackIn_20_0 = stackOut_19_0;
            if (!param0) {
              stackOut_21_0 = this;
              stackOut_21_1 = 0;
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              break L7;
            } else {
              stackOut_20_0 = this;
              stackOut_20_1 = 1;
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              break L7;
            }
          }
          ((pp) this).field_a = stackIn_22_1 != 0;
          int discarded$16 = com.ms.win32.User32.SendMessage(var5, 101024, 0, param2);
          return;
        }
    }

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        if (((pp) this).field_c != param0) {
            var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
            return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        }
        if (param1 == 32) {
            var5 = 65535 & param3;
            if (1 != var5) {
                if (param1 == 101024) {
                    int discarded$0 = com.ms.win32.User32.SetCursor(((pp) this).field_a ? ((pp) this).field_b : 0);
                    return 0;
                }
                if (param1 == 1) {
                    ((pp) this).field_c = 0;
                    ((pp) this).field_a = true;
                    return com.ms.win32.User32.CallWindowProc(((pp) this).field_e, param0, param1, param2, param3);
                }
                return com.ms.win32.User32.CallWindowProc(((pp) this).field_e, param0, param1, param2, param3);
            }
            int discarded$1 = com.ms.win32.User32.SetCursor(!((pp) this).field_a ? 0 : ((pp) this).field_b);
            return 0;
        }
        if (param1 == 101024) {
            int discarded$2 = com.ms.win32.User32.SetCursor(((pp) this).field_a ? ((pp) this).field_b : 0);
            return 0;
        }
        if (param1 == 1) {
            ((pp) this).field_c = 0;
            ((pp) this).field_a = true;
            return com.ms.win32.User32.CallWindowProc(((pp) this).field_e, param0, param1, param2, param3);
        }
        return com.ms.win32.User32.CallWindowProc(((pp) this).field_e, param0, param1, param2, param3);
    }

    pp() {
        ((pp) this).field_a = true;
    }
}
