/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bm extends com.ms.dll.Callback {
    private int field_e;
    private volatile boolean field_d;
    private volatile int field_c;
    private boolean field_b;
    private volatile int field_a;

    final void a(boolean param0, boolean param1, java.awt.Component param2) {
        int var5 = 0;
        Object var6 = null;
        Throwable var8 = null;
        com.ms.awt.WComponentPeer var9 = null;
        int stackIn_6_0 = 0;
        Object stackIn_15_0 = null;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        Object stackIn_27_0 = null;
        Object stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        Throwable decompiledCaughtException = null;
        if (!param0) {
          L0: {
            var9 = (com.ms.awt.WComponentPeer) null;
            var5 = var9.getTopHwnd();
            if (var5 != this.field_a) {
              break L0;
            } else {
              L1: {
                if (param1) {
                  stackIn_6_0 = 0;
                  break L1;
                } else {
                  stackIn_6_0 = 1;
                  break L1;
                }
              }
              if (stackIn_6_0 != (this.field_d ? 1 : 0)) {
                return;
              } else {
                break L0;
              }
            }
          }
          L2: {
            if (!this.field_b) {
              this.field_e = com.ms.win32.User32.LoadCursor(0, 32512);
              com.ms.dll.Root.alloc(this);
              this.field_b = true;
              break L2;
            } else {
              break L2;
            }
          }
          if (var5 != this.field_a) {
            L3: {
              if (0 == this.field_a) {
                break L3;
              } else {
                this.field_d = true;
                com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
                var6 = this;
                synchronized (var6) {
                  L4: {
                    com.ms.win32.User32.SetWindowLong(this.field_a, -4, this.field_c);
                    break L4;
                  }
                }
                break L3;
              }
            }
            var6 = this;
            synchronized (var6) {
              L5: {
                this.field_a = var5;
                this.field_c = com.ms.win32.User32.SetWindowLong(this.field_a, -4, this);
                break L5;
              }
            }
            L6: {
              stackIn_27_0 = this;

              if (!param1) {
                stackIn_28_0 = this;
                stackIn_28_1 = 0;
                break L6;
              } else {
                stackIn_28_0 = this;
                stackIn_28_1 = 1;
                break L6;
              }
            }
            ((bm) (this)).field_d = stackIn_28_1 != 0;
            com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
            return;
          } else {
            L7: {
              stackIn_15_0 = this;

              if (!param1) {
                stackIn_16_0 = this;
                stackIn_16_1 = 0;
                break L7;
              } else {
                stackIn_16_0 = this;
                stackIn_16_1 = 1;
                break L7;
              }
            }
            ((bm) (this)).field_d = stackIn_16_1 != 0;
            com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
            return;
          }
        } else {
          return;
        }
    }

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int stackIn_7_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_21_0 = 0;
        int var5;
        if (this.field_a == param0) {
          if (32 == param1) {
            var5 = param3 & 65535;
            if (var5 != 1) {
              if (param1 != 101024) {
                if ((param1 ^ -1) == -2) {
                  this.field_a = 0;
                  this.field_d = true;
                  return com.ms.win32.User32.CallWindowProc(this.field_c, param0, param1, param2, param3);
                } else {
                  return com.ms.win32.User32.CallWindowProc(this.field_c, param0, param1, param2, param3);
                }
              } else {
                L0: {
                  if (!this.field_d) {
                    stackIn_21_0 = 0;
                    break L0;
                  } else {
                    stackIn_21_0 = this.field_e;
                    break L0;
                  }
                }
                com.ms.win32.User32.SetCursor(stackIn_21_0);
                return 0;
              }
            } else {
              L1: {
                if (this.field_d) {
                  stackIn_16_0 = this.field_e;
                  break L1;
                } else {
                  stackIn_16_0 = 0;
                  break L1;
                }
              }
              com.ms.win32.User32.SetCursor(stackIn_16_0);
              return 0;
            }
          } else {
            if (param1 != 101024) {
              if ((param1 ^ -1) == -2) {
                this.field_a = 0;
                this.field_d = true;
                return com.ms.win32.User32.CallWindowProc(this.field_c, param0, param1, param2, param3);
              } else {
                return com.ms.win32.User32.CallWindowProc(this.field_c, param0, param1, param2, param3);
              }
            } else {
              L2: {
                if (!this.field_d) {
                  stackIn_7_0 = 0;
                  break L2;
                } else {
                  stackIn_7_0 = this.field_e;
                  break L2;
                }
              }
              com.ms.win32.User32.SetCursor(stackIn_7_0);
              return 0;
            }
          }
        } else {
          var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
          return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        }
    }

    final void a(int param0, int param1, byte param2) {
        if (param2 <= 53) {
            return;
        }
        com.ms.win32.User32.SetCursorPos(param1, param0);
    }

    bm() {
        this.field_d = true;
    }
}
