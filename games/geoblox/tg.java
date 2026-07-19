/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tg extends com.ms.dll.Callback {
    private volatile boolean field_e;
    private int field_a;
    private boolean field_d;
    private volatile int field_b;
    private volatile int field_c;

    final void a(int param0, boolean param1, java.awt.Component param2) {
        int discarded$43 = 0;
        int discarded$44 = 0;
        int discarded$45 = 0;
        int discarded$46 = 0;
        int discarded$47 = 0;
        int var5 = 0;
        Object var6 = null;
        Throwable var7 = null;
        Throwable var8 = null;
        com.ms.awt.WComponentPeer var9 = null;
        int stackIn_6_0 = 0;
        Object stackIn_20_0 = null;
        Object stackIn_21_0 = null;
        Object stackIn_22_0 = null;
        int stackIn_22_1 = 0;
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
        Object stackOut_19_0 = null;
        Object stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        Object stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        L0: {
          if (param0 == 12758) {
            break L0;
          } else {
            this.field_d = true;
            break L0;
          }
        }
        L1: {
          var9 = (com.ms.awt.WComponentPeer) null;
          var5 = var9.getTopHwnd();
          if (this.field_b != var5) {
            break L1;
          } else {
            L2: {
              if (this.field_e) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L2;
              }
            }
            if (stackIn_6_0 == (param1 ? 1 : 0)) {
              break L1;
            } else {
              return;
            }
          }
        }
        L3: {
          if (this.field_d) {
            break L3;
          } else {
            this.field_a = com.ms.win32.User32.LoadCursor(0, 32512);
            discarded$43 = com.ms.dll.Root.alloc(this);
            this.field_d = true;
            break L3;
          }
        }
        if (var5 == this.field_b) {
          L4: {
            stackOut_25_0 = this;
            stackIn_27_0 = stackOut_25_0;
            stackIn_26_0 = stackOut_25_0;
            if (!param1) {
              stackOut_27_0 = this;
              stackOut_27_1 = 0;
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              break L4;
            } else {
              stackOut_26_0 = this;
              stackOut_26_1 = 1;
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              break L4;
            }
          }
          ((tg) (this)).field_e = stackIn_28_1 != 0;
          discarded$44 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
          return;
        } else {
          L5: {
            if (0 == this.field_b) {
              break L5;
            } else {
              this.field_e = true;
              discarded$45 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
              var6 = this;
              synchronized (var6) {
                L6: {
                  discarded$46 = com.ms.win32.User32.SetWindowLong(this.field_b, -4, this.field_c);
                  break L6;
                }
              }
              break L5;
            }
          }
          var6 = this;
          synchronized (var6) {
            L7: {
              this.field_b = var5;
              this.field_c = com.ms.win32.User32.SetWindowLong(this.field_b, -4, this);
              break L7;
            }
          }
          L8: {
            stackOut_19_0 = this;
            stackIn_21_0 = stackOut_19_0;
            stackIn_20_0 = stackOut_19_0;
            if (!param1) {
              stackOut_21_0 = this;
              stackOut_21_1 = 0;
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              break L8;
            } else {
              stackOut_20_0 = this;
              stackOut_20_1 = 1;
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              break L8;
            }
          }
          ((tg) (this)).field_e = stackIn_22_1 != 0;
          discarded$47 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
          return;
        }
    }

    final void a(int param0, int param1, int param2) {
        boolean discarded$4 = com.ms.win32.User32.SetCursorPos(param2, param1);
        if (param0 > -45) {
            java.awt.Component var5 = (java.awt.Component) null;
            this.a(74, true, (java.awt.Component) null);
        }
    }

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int discarded$3 = 0;
        int discarded$4 = 0;
        int discarded$5 = 0;
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
        if (this.field_b == param0) {
          if (32 == param1) {
            var5 = 65535 & param3;
            if ((var5 ^ -1) != -2) {
              if (param1 != 101024) {
                if (1 == param1) {
                  this.field_b = 0;
                  this.field_e = true;
                  return com.ms.win32.User32.CallWindowProc(this.field_c, param0, param1, param2, param3);
                } else {
                  return com.ms.win32.User32.CallWindowProc(this.field_c, param0, param1, param2, param3);
                }
              } else {
                L0: {
                  if (this.field_e) {
                    stackOut_20_0 = this.field_a;
                    stackIn_21_0 = stackOut_20_0;
                    break L0;
                  } else {
                    stackOut_19_0 = 0;
                    stackIn_21_0 = stackOut_19_0;
                    break L0;
                  }
                }
                discarded$3 = com.ms.win32.User32.SetCursor(stackIn_21_0);
                return 0;
              }
            } else {
              L1: {
                if (!this.field_e) {
                  stackOut_15_0 = 0;
                  stackIn_16_0 = stackOut_15_0;
                  break L1;
                } else {
                  stackOut_14_0 = this.field_a;
                  stackIn_16_0 = stackOut_14_0;
                  break L1;
                }
              }
              discarded$4 = com.ms.win32.User32.SetCursor(stackIn_16_0);
              return 0;
            }
          } else {
            if (param1 != 101024) {
              if (1 == param1) {
                this.field_b = 0;
                this.field_e = true;
                return com.ms.win32.User32.CallWindowProc(this.field_c, param0, param1, param2, param3);
              } else {
                return com.ms.win32.User32.CallWindowProc(this.field_c, param0, param1, param2, param3);
              }
            } else {
              L2: {
                if (this.field_e) {
                  stackOut_6_0 = this.field_a;
                  stackIn_7_0 = stackOut_6_0;
                  break L2;
                } else {
                  stackOut_5_0 = 0;
                  stackIn_7_0 = stackOut_5_0;
                  break L2;
                }
              }
              discarded$5 = com.ms.win32.User32.SetCursor(stackIn_7_0);
              return 0;
            }
          }
        } else {
          var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
          return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        }
    }

    tg() {
        this.field_e = true;
    }
}
