/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gk extends com.ms.dll.Callback {
    private int field_e;
    private boolean field_a;
    private volatile int field_d;
    private volatile boolean field_c;
    private volatile int field_b;

    final void a(int param0, int param1, int param2) {
        int discarded$6 = 0;
        boolean discarded$5 = com.ms.win32.User32.SetCursorPos(param2, param1);
        if (param0 != -2) {
            discarded$6 = this.callback(96, 11, 73, 3);
        }
    }

    final void a(boolean param0, java.awt.Component param1, int param2) {
        int discarded$55 = 0;
        int discarded$56 = 0;
        int discarded$57 = 0;
        int discarded$58 = 0;
        int discarded$59 = 0;
        int var5 = 0;
        Object var6 = null;
        Throwable var7 = null;
        Throwable var8 = null;
        com.ms.awt.WComponentPeer var9 = null;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        Object stackIn_23_0 = null;
        Object stackIn_24_0 = null;
        Object stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        Throwable decompiledCaughtException = null;
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
        var9 = (com.ms.awt.WComponentPeer) null;
        var5 = var9.getTopHwnd();
        if (param2 <= -15) {
          L0: {
            if (this.field_d != var5) {
              break L0;
            } else {
              if (this.field_c == param0) {
                return;
              } else {
                break L0;
              }
            }
          }
          L1: {
            if (this.field_a) {
              break L1;
            } else {
              this.field_e = com.ms.win32.User32.LoadCursor(0, 32512);
              discarded$55 = com.ms.dll.Root.alloc(this);
              this.field_a = true;
              break L1;
            }
          }
          if (var5 != this.field_d) {
            L2: {
              if (this.field_d != 0) {
                this.field_c = true;
                discarded$56 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
                var6 = this;
                synchronized (var6) {
                  L3: {
                    discarded$57 = com.ms.win32.User32.SetWindowLong(this.field_d, -4, this.field_b);
                    break L3;
                  }
                }
                break L2;
              } else {
                break L2;
              }
            }
            var6 = this;
            synchronized (var6) {
              L4: {
                this.field_d = var5;
                this.field_b = com.ms.win32.User32.SetWindowLong(this.field_d, -4, this);
                break L4;
              }
            }
            L5: {
              stackOut_22_0 = this;
              stackIn_24_0 = stackOut_22_0;
              stackIn_23_0 = stackOut_22_0;
              if (!param0) {
                stackOut_24_0 = this;
                stackOut_24_1 = 0;
                stackIn_25_0 = stackOut_24_0;
                stackIn_25_1 = stackOut_24_1;
                break L5;
              } else {
                stackOut_23_0 = this;
                stackOut_23_1 = 1;
                stackIn_25_0 = stackOut_23_0;
                stackIn_25_1 = stackOut_23_1;
                break L5;
              }
            }
            ((gk) (this)).field_c = stackIn_25_1 != 0;
            discarded$58 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
            return;
          } else {
            L6: {
              stackOut_9_0 = this;
              stackIn_11_0 = stackOut_9_0;
              stackIn_10_0 = stackOut_9_0;
              if (!param0) {
                stackOut_11_0 = this;
                stackOut_11_1 = 0;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                break L6;
              } else {
                stackOut_10_0 = this;
                stackOut_10_1 = 1;
                stackIn_12_0 = stackOut_10_0;
                stackIn_12_1 = stackOut_10_1;
                break L6;
              }
            }
            ((gk) (this)).field_c = stackIn_12_1 != 0;
            discarded$59 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
            return;
          }
        } else {
          return;
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
        if (param0 == this.field_d) {
          if (-33 == (param1 ^ -1)) {
            var5 = param3 & 65535;
            if (1 != var5) {
              if (param1 == 101024) {
                L0: {
                  if (this.field_c) {
                    stackOut_25_0 = this.field_e;
                    stackIn_26_0 = stackOut_25_0;
                    break L0;
                  } else {
                    stackOut_24_0 = 0;
                    stackIn_26_0 = stackOut_24_0;
                    break L0;
                  }
                }
                discarded$3 = com.ms.win32.User32.SetCursor(stackIn_26_0);
                return 0;
              } else {
                L1: {
                  if ((param1 ^ -1) == -2) {
                    this.field_d = 0;
                    this.field_c = true;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                return com.ms.win32.User32.CallWindowProc(this.field_b, param0, param1, param2, param3);
              }
            } else {
              L2: {
                if (!this.field_c) {
                  stackOut_16_0 = 0;
                  stackIn_17_0 = stackOut_16_0;
                  break L2;
                } else {
                  stackOut_15_0 = this.field_e;
                  stackIn_17_0 = stackOut_15_0;
                  break L2;
                }
              }
              discarded$4 = com.ms.win32.User32.SetCursor(stackIn_17_0);
              return 0;
            }
          } else {
            if (param1 == 101024) {
              L3: {
                if (this.field_c) {
                  stackOut_10_0 = this.field_e;
                  stackIn_11_0 = stackOut_10_0;
                  break L3;
                } else {
                  stackOut_9_0 = 0;
                  stackIn_11_0 = stackOut_9_0;
                  break L3;
                }
              }
              discarded$5 = com.ms.win32.User32.SetCursor(stackIn_11_0);
              return 0;
            } else {
              L4: {
                if ((param1 ^ -1) == -2) {
                  this.field_d = 0;
                  this.field_c = true;
                  break L4;
                } else {
                  break L4;
                }
              }
              return com.ms.win32.User32.CallWindowProc(this.field_b, param0, param1, param2, param3);
            }
          }
        } else {
          var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
          return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        }
    }

    gk() {
        this.field_c = true;
    }
}
