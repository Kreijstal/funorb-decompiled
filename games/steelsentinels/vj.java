/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vj extends com.ms.dll.Callback {
    private int field_e;
    private volatile boolean field_d;
    private volatile int field_b;
    private volatile int field_c;
    private boolean field_a;

    final void a(java.awt.Component param0, int param1, boolean param2) {
        int discarded$5 = 0;
        int discarded$6 = 0;
        int discarded$7 = 0;
        int discarded$8 = 0;
        int discarded$9 = 0;
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
        Object stackIn_26_0 = null;
        Object stackIn_27_0 = null;
        Object stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        Throwable decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        boolean stackOut_5_0 = false;
        int stackOut_5_1 = 0;
        boolean stackOut_4_0 = false;
        int stackOut_4_1 = 0;
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
          if (param1 == 32512) {
            break L0;
          } else {
            this.a(-24, -44, true);
            break L0;
          }
        }
        L1: {
          var9 = (com.ms.awt.WComponentPeer) null;
          var5 = var9.getTopHwnd();
          if (this.field_c != var5) {
            break L1;
          } else {
            L2: {
              stackOut_3_0 = param2;
              stackIn_5_0 = stackOut_3_0;
              stackIn_4_0 = stackOut_3_0;
              if (this.field_d) {
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
          if (this.field_a) {
            break L3;
          } else {
            this.field_e = com.ms.win32.User32.LoadCursor(0, 32512);
            discarded$5 = com.ms.dll.Root.alloc(this);
            this.field_a = true;
            break L3;
          }
        }
        if (this.field_c != var5) {
          L4: {
            if (0 != this.field_c) {
              this.field_d = true;
              discarded$6 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
              var6 = this;
              synchronized (var6) {
                L5: {
                  discarded$7 = com.ms.win32.User32.SetWindowLong(this.field_c, -4, this.field_b);
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
              this.field_c = var5;
              this.field_b = com.ms.win32.User32.SetWindowLong(this.field_c, -4, this);
              break L6;
            }
          }
          L7: {
            stackOut_25_0 = this;
            stackIn_27_0 = stackOut_25_0;
            stackIn_26_0 = stackOut_25_0;
            if (!param2) {
              stackOut_27_0 = this;
              stackOut_27_1 = 0;
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              break L7;
            } else {
              stackOut_26_0 = this;
              stackOut_26_1 = 1;
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              break L7;
            }
          }
          ((vj) (this)).field_d = stackIn_28_1 != 0;
          discarded$8 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
          return;
        } else {
          L8: {
            stackOut_12_0 = this;
            stackIn_14_0 = stackOut_12_0;
            stackIn_13_0 = stackOut_12_0;
            if (!param2) {
              stackOut_14_0 = this;
              stackOut_14_1 = 0;
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              break L8;
            } else {
              stackOut_13_0 = this;
              stackOut_13_1 = 1;
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              break L8;
            }
          }
          ((vj) (this)).field_d = stackIn_15_1 != 0;
          discarded$9 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
          return;
        }
    }

    final void a(int param0, int param1, boolean param2) {
        int discarded$6 = 0;
        boolean discarded$5 = com.ms.win32.User32.SetCursorPos(param1, param0);
        if (param2) {
            discarded$6 = this.callback(101, 84, -67, 91);
        }
    }

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int discarded$3 = 0;
        int discarded$4 = 0;
        int discarded$5 = 0;
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
        if (param0 != this.field_c) {
          var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
          return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        } else {
          if (32 == param1) {
            var5 = 65535 & param3;
            if ((var5 ^ -1) != -2) {
              if (101024 != param1) {
                if (1 == param1) {
                  this.field_c = 0;
                  this.field_d = true;
                  return com.ms.win32.User32.CallWindowProc(this.field_b, param0, param1, param2, param3);
                } else {
                  return com.ms.win32.User32.CallWindowProc(this.field_b, param0, param1, param2, param3);
                }
              } else {
                L0: {
                  if (!this.field_d) {
                    stackOut_21_0 = 0;
                    stackIn_22_0 = stackOut_21_0;
                    break L0;
                  } else {
                    stackOut_20_0 = this.field_e;
                    stackIn_22_0 = stackOut_20_0;
                    break L0;
                  }
                }
                discarded$3 = com.ms.win32.User32.SetCursor(stackIn_22_0);
                return 0;
              }
            } else {
              L1: {
                if (!this.field_d) {
                  stackOut_16_0 = 0;
                  stackIn_17_0 = stackOut_16_0;
                  break L1;
                } else {
                  stackOut_15_0 = this.field_e;
                  stackIn_17_0 = stackOut_15_0;
                  break L1;
                }
              }
              discarded$4 = com.ms.win32.User32.SetCursor(stackIn_17_0);
              return 0;
            }
          } else {
            if (101024 != param1) {
              if (1 == param1) {
                this.field_c = 0;
                this.field_d = true;
                return com.ms.win32.User32.CallWindowProc(this.field_b, param0, param1, param2, param3);
              } else {
                return com.ms.win32.User32.CallWindowProc(this.field_b, param0, param1, param2, param3);
              }
            } else {
              L2: {
                if (!this.field_d) {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  break L2;
                } else {
                  stackOut_6_0 = this.field_e;
                  stackIn_8_0 = stackOut_6_0;
                  break L2;
                }
              }
              discarded$5 = com.ms.win32.User32.SetCursor(stackIn_8_0);
              return 0;
            }
          }
        }
    }

    vj() {
        this.field_d = true;
    }
}
