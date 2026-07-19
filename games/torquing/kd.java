/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kd extends com.ms.dll.Callback {
    private volatile int field_c;
    private boolean field_a;
    private volatile boolean field_d;
    private int field_e;
    private volatile int field_b;

    final void a(boolean param0, byte param1, java.awt.Component param2) {
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
        int stackIn_4_0 = 0;
        Object stackIn_20_0 = null;
        Object stackIn_21_0 = null;
        Object stackIn_22_0 = null;
        int stackIn_22_1 = 0;
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
        Object stackOut_19_0 = null;
        Object stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        Object stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        L0: {
          var9 = (com.ms.awt.WComponentPeer) null;
          var5 = var9.getTopHwnd();
          if (var5 != this.field_b) {
            break L0;
          } else {
            L1: {
              if (param0) {
                stackOut_3_0 = 0;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = 1;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            if (stackIn_4_0 == (this.field_d ? 1 : 0)) {
              break L0;
            } else {
              return;
            }
          }
        }
        L2: {
          if (!this.field_a) {
            this.field_e = com.ms.win32.User32.LoadCursor(0, 32512);
            discarded$5 = com.ms.dll.Root.alloc(this);
            this.field_a = true;
            break L2;
          } else {
            break L2;
          }
        }
        if (this.field_b == var5) {
          if (param1 < 28) {
            return;
          } else {
            L3: {
              stackOut_28_0 = this;
              stackIn_30_0 = stackOut_28_0;
              stackIn_29_0 = stackOut_28_0;
              if (!param0) {
                stackOut_30_0 = this;
                stackOut_30_1 = 0;
                stackIn_31_0 = stackOut_30_0;
                stackIn_31_1 = stackOut_30_1;
                break L3;
              } else {
                stackOut_29_0 = this;
                stackOut_29_1 = 1;
                stackIn_31_0 = stackOut_29_0;
                stackIn_31_1 = stackOut_29_1;
                break L3;
              }
            }
            ((kd) (this)).field_d = stackIn_31_1 != 0;
            discarded$6 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
            return;
          }
        } else {
          L4: {
            if (0 == this.field_b) {
              break L4;
            } else {
              this.field_d = true;
              discarded$7 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
              var6 = this;
              synchronized (var6) {
                L5: {
                  discarded$8 = com.ms.win32.User32.SetWindowLong(this.field_b, -4, this.field_c);
                  break L5;
                }
              }
              break L4;
            }
          }
          var6 = this;
          synchronized (var6) {
            L6: {
              this.field_b = var5;
              this.field_c = com.ms.win32.User32.SetWindowLong(this.field_b, -4, this);
              break L6;
            }
          }
          if (param1 < 28) {
            return;
          } else {
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
            ((kd) (this)).field_d = stackIn_22_1 != 0;
            discarded$9 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
            return;
          }
        }
    }

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int discarded$3 = 0;
        int discarded$4 = 0;
        int discarded$5 = 0;
        int var5 = 0;
        int stackIn_11_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_26_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        if (this.field_b == param0) {
          if (32 == param1) {
            var5 = 65535 & param3;
            if (1 != var5) {
              if (101024 == param1) {
                L0: {
                  if (!this.field_d) {
                    stackOut_25_0 = 0;
                    stackIn_26_0 = stackOut_25_0;
                    break L0;
                  } else {
                    stackOut_24_0 = this.field_e;
                    stackIn_26_0 = stackOut_24_0;
                    break L0;
                  }
                }
                discarded$3 = com.ms.win32.User32.SetCursor(stackIn_26_0);
                return 0;
              } else {
                L1: {
                  if (-2 == (param1 ^ -1)) {
                    this.field_b = 0;
                    this.field_d = true;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                return com.ms.win32.User32.CallWindowProc(this.field_c, param0, param1, param2, param3);
              }
            } else {
              L2: {
                if (this.field_d) {
                  stackOut_16_0 = this.field_e;
                  stackIn_17_0 = stackOut_16_0;
                  break L2;
                } else {
                  stackOut_15_0 = 0;
                  stackIn_17_0 = stackOut_15_0;
                  break L2;
                }
              }
              discarded$4 = com.ms.win32.User32.SetCursor(stackIn_17_0);
              return 0;
            }
          } else {
            if (101024 == param1) {
              L3: {
                if (!this.field_d) {
                  stackOut_10_0 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  break L3;
                } else {
                  stackOut_9_0 = this.field_e;
                  stackIn_11_0 = stackOut_9_0;
                  break L3;
                }
              }
              discarded$5 = com.ms.win32.User32.SetCursor(stackIn_11_0);
              return 0;
            } else {
              L4: {
                if (-2 == (param1 ^ -1)) {
                  this.field_b = 0;
                  this.field_d = true;
                  break L4;
                } else {
                  break L4;
                }
              }
              return com.ms.win32.User32.CallWindowProc(this.field_c, param0, param1, param2, param3);
            }
          }
        } else {
          var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
          return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        }
    }

    final void a(int param0, int param1, int param2) {
        boolean discarded$0 = com.ms.win32.User32.SetCursorPos(param1, param0);
        int var4 = -33 % ((param2 - 22) / 49);
    }

    kd() {
        this.field_d = true;
    }
}
