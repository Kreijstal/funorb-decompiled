/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wg extends com.ms.dll.Callback {
    private int field_c;
    private boolean field_b;
    private volatile int field_a;
    private volatile boolean field_e;
    private volatile int field_d;

    final void a(java.awt.Component param0, boolean param1, int param2) {
        int discarded$44 = 0;
        int discarded$45 = 0;
        int discarded$46 = 0;
        int discarded$47 = 0;
        int discarded$48 = 0;
        int var5 = 0;
        Object var6 = null;
        Throwable var7 = null;
        Throwable var8 = null;
        com.ms.awt.WComponentPeer var9 = null;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        Object stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        Object stackIn_24_0 = null;
        Object stackIn_25_0 = null;
        Object stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_23_0 = null;
        Object stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        Object stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        Object stackOut_17_0 = null;
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        L0: {
          var9 = (com.ms.awt.WComponentPeer) null;
          if (param2 < -72) {
            break L0;
          } else {
            this.field_c = 127;
            break L0;
          }
        }
        L1: {
          var5 = var9.getTopHwnd();
          if (this.field_a != var5) {
            break L1;
          } else {
            if (this.field_e != param1) {
              break L1;
            } else {
              return;
            }
          }
        }
        L2: {
          if (!this.field_b) {
            this.field_c = com.ms.win32.User32.LoadCursor(0, 32512);
            discarded$44 = com.ms.dll.Root.alloc(this);
            this.field_b = true;
            break L2;
          } else {
            break L2;
          }
        }
        if (var5 == this.field_a) {
          L3: {
            stackOut_23_0 = this;
            stackIn_25_0 = stackOut_23_0;
            stackIn_24_0 = stackOut_23_0;
            if (!param1) {
              stackOut_25_0 = this;
              stackOut_25_1 = 0;
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              break L3;
            } else {
              stackOut_24_0 = this;
              stackOut_24_1 = 1;
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              break L3;
            }
          }
          ((wg) (this)).field_e = stackIn_26_1 != 0;
          discarded$45 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
          return;
        } else {
          L4: {
            if (-1 == (this.field_a ^ -1)) {
              break L4;
            } else {
              this.field_e = true;
              discarded$46 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
              var6 = this;
              synchronized (var6) {
                L5: {
                  discarded$47 = com.ms.win32.User32.SetWindowLong(this.field_a, -4, this.field_d);
                  break L5;
                }
              }
              break L4;
            }
          }
          var6 = this;
          synchronized (var6) {
            L6: {
              this.field_a = var5;
              this.field_d = com.ms.win32.User32.SetWindowLong(this.field_a, -4, this);
              break L6;
            }
          }
          L7: {
            stackOut_17_0 = this;
            stackIn_19_0 = stackOut_17_0;
            stackIn_18_0 = stackOut_17_0;
            if (!param1) {
              stackOut_19_0 = this;
              stackOut_19_1 = 0;
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              break L7;
            } else {
              stackOut_18_0 = this;
              stackOut_18_1 = 1;
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              break L7;
            }
          }
          ((wg) (this)).field_e = stackIn_20_1 != 0;
          discarded$48 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
          return;
        }
    }

    final void a(int param0, byte param1, int param2) {
        int discarded$6 = 0;
        boolean discarded$5 = com.ms.win32.User32.SetCursorPos(param2, param0);
        if (param1 != -40) {
            discarded$6 = this.callback(-26, -63, -123, 69);
        }
    }

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int discarded$6 = 0;
        int discarded$7 = 0;
        int discarded$8 = 0;
        int var5 = 0;
        int stackIn_9_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        if (param0 != this.field_a) {
          var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
          return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        } else {
          if ((param1 ^ -1) == -33) {
            var5 = 65535 & param3;
            if ((var5 ^ -1) != -2) {
              if (param1 == 101024) {
                L0: {
                  if (this.field_e) {
                    stackOut_23_0 = this.field_c;
                    stackIn_24_0 = stackOut_23_0;
                    break L0;
                  } else {
                    stackOut_22_0 = 0;
                    stackIn_24_0 = stackOut_22_0;
                    break L0;
                  }
                }
                discarded$6 = com.ms.win32.User32.SetCursor(stackIn_24_0);
                return 0;
              } else {
                L1: {
                  if (-2 == (param1 ^ -1)) {
                    this.field_a = 0;
                    this.field_e = true;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                return com.ms.win32.User32.CallWindowProc(this.field_d, param0, param1, param2, param3);
              }
            } else {
              L2: {
                if (!this.field_e) {
                  stackOut_17_0 = 0;
                  stackIn_18_0 = stackOut_17_0;
                  break L2;
                } else {
                  stackOut_16_0 = this.field_c;
                  stackIn_18_0 = stackOut_16_0;
                  break L2;
                }
              }
              discarded$7 = com.ms.win32.User32.SetCursor(stackIn_18_0);
              return 0;
            }
          } else {
            if (param1 == 101024) {
              L3: {
                if (this.field_e) {
                  stackOut_8_0 = this.field_c;
                  stackIn_9_0 = stackOut_8_0;
                  break L3;
                } else {
                  stackOut_7_0 = 0;
                  stackIn_9_0 = stackOut_7_0;
                  break L3;
                }
              }
              discarded$8 = com.ms.win32.User32.SetCursor(stackIn_9_0);
              return 0;
            } else {
              L4: {
                if (-2 == (param1 ^ -1)) {
                  this.field_a = 0;
                  this.field_e = true;
                  break L4;
                } else {
                  break L4;
                }
              }
              return com.ms.win32.User32.CallWindowProc(this.field_d, param0, param1, param2, param3);
            }
          }
        }
    }

    wg() {
        this.field_e = true;
    }
}
