/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hj extends com.ms.dll.Callback {
    private volatile int field_e;
    private volatile int field_d;
    private volatile boolean field_b;
    private boolean field_a;
    private int field_c;

    final void a(int param0, int param1, int param2) {
        boolean discarded$4 = com.ms.win32.User32.SetCursorPos(param2, param0);
        if (param1 <= 60) {
            this.field_b = false;
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
        if (this.field_e == param0) {
          if (32 == param1) {
            var5 = param3 & 65535;
            if (1 != var5) {
              if (param1 == 101024) {
                L0: {
                  if (!this.field_b) {
                    stackOut_25_0 = 0;
                    stackIn_26_0 = stackOut_25_0;
                    break L0;
                  } else {
                    stackOut_24_0 = this.field_c;
                    stackIn_26_0 = stackOut_24_0;
                    break L0;
                  }
                }
                discarded$3 = com.ms.win32.User32.SetCursor(stackIn_26_0);
                return 0;
              } else {
                L1: {
                  if ((param1 ^ -1) == -2) {
                    this.field_e = 0;
                    this.field_b = true;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                return com.ms.win32.User32.CallWindowProc(this.field_d, param0, param1, param2, param3);
              }
            } else {
              L2: {
                if (!this.field_b) {
                  stackOut_16_0 = 0;
                  stackIn_17_0 = stackOut_16_0;
                  break L2;
                } else {
                  stackOut_15_0 = this.field_c;
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
                if (!this.field_b) {
                  stackOut_10_0 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  break L3;
                } else {
                  stackOut_9_0 = this.field_c;
                  stackIn_11_0 = stackOut_9_0;
                  break L3;
                }
              }
              discarded$5 = com.ms.win32.User32.SetCursor(stackIn_11_0);
              return 0;
            } else {
              L4: {
                if ((param1 ^ -1) == -2) {
                  this.field_e = 0;
                  this.field_b = true;
                  break L4;
                } else {
                  break L4;
                }
              }
              return com.ms.win32.User32.CallWindowProc(this.field_d, param0, param1, param2, param3);
            }
          }
        } else {
          var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
          return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        }
    }

    final void a(int param0, boolean param1, java.awt.Component param2) {
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
        Object stackIn_22_0 = null;
        Object stackIn_23_0 = null;
        Object stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_21_0 = null;
        Object stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        Object stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        Object stackOut_9_0 = null;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        L0: {
          var9 = (com.ms.awt.WComponentPeer) null;
          var5 = var9.getTopHwnd();
          if (var5 != this.field_e) {
            break L0;
          } else {
            if (param1 != this.field_b) {
              break L0;
            } else {
              return;
            }
          }
        }
        if (param0 > 40) {
          L1: {
            if (!this.field_a) {
              this.field_c = com.ms.win32.User32.LoadCursor(0, 32512);
              discarded$55 = com.ms.dll.Root.alloc(this);
              this.field_a = true;
              break L1;
            } else {
              break L1;
            }
          }
          if (var5 != this.field_e) {
            L2: {
              if (this.field_e == 0) {
                break L2;
              } else {
                this.field_b = true;
                discarded$56 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
                var6 = this;
                synchronized (var6) {
                  L3: {
                    discarded$57 = com.ms.win32.User32.SetWindowLong(this.field_e, -4, this.field_d);
                    break L3;
                  }
                }
                break L2;
              }
            }
            var6 = this;
            synchronized (var6) {
              L4: {
                this.field_e = var5;
                this.field_d = com.ms.win32.User32.SetWindowLong(this.field_e, -4, this);
                break L4;
              }
            }
            L5: {
              stackOut_21_0 = this;
              stackIn_23_0 = stackOut_21_0;
              stackIn_22_0 = stackOut_21_0;
              if (!param1) {
                stackOut_23_0 = this;
                stackOut_23_1 = 0;
                stackIn_24_0 = stackOut_23_0;
                stackIn_24_1 = stackOut_23_1;
                break L5;
              } else {
                stackOut_22_0 = this;
                stackOut_22_1 = 1;
                stackIn_24_0 = stackOut_22_0;
                stackIn_24_1 = stackOut_22_1;
                break L5;
              }
            }
            ((hj) (this)).field_b = stackIn_24_1 != 0;
            discarded$58 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
            return;
          } else {
            L6: {
              stackOut_9_0 = this;
              stackIn_11_0 = stackOut_9_0;
              stackIn_10_0 = stackOut_9_0;
              if (!param1) {
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
            ((hj) (this)).field_b = stackIn_12_1 != 0;
            discarded$59 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
            return;
          }
        } else {
          return;
        }
    }

    hj() {
        this.field_b = true;
    }
}
