/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class in extends com.ms.dll.Callback {
    private int field_b;
    private boolean field_d;
    private volatile boolean field_a;
    private volatile int field_e;
    private volatile int field_c;

    final void a(boolean param0, java.awt.Component param1, byte param2) {
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
        var9 = (com.ms.awt.WComponentPeer) null;
        var5 = var9.getTopHwnd();
        if (param2 >= 71) {
          L0: {
            if (this.field_c != var5) {
              break L0;
            } else {
              L1: {
                if (param0) {
                  stackIn_6_0 = 0;
                  break L1;
                } else {
                  stackIn_6_0 = 1;
                  break L1;
                }
              }
              if (stackIn_6_0 != (this.field_a ? 1 : 0)) {
                return;
              } else {
                break L0;
              }
            }
          }
          L2: {
            if (!this.field_d) {
              this.field_b = com.ms.win32.User32.LoadCursor(0, 32512);
              com.ms.dll.Root.alloc(this);
              this.field_d = true;
              break L2;
            } else {
              break L2;
            }
          }
          if (var5 != this.field_c) {
            L3: {
              if (this.field_c == 0) {
                break L3;
              } else {
                this.field_a = true;
                com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
                var6 = this;
                synchronized (var6) {
                  L4: {
                    com.ms.win32.User32.SetWindowLong(this.field_c, -4, this.field_e);
                    break L4;
                  }
                }
                break L3;
              }
            }
            var6 = this;
            synchronized (var6) {
              L5: {
                this.field_c = var5;
                this.field_e = com.ms.win32.User32.SetWindowLong(this.field_c, -4, this);
                break L5;
              }
            }
            L6: {
              stackIn_27_0 = this;

              if (!param0) {
                stackIn_28_0 = this;
                stackIn_28_1 = 0;
                break L6;
              } else {
                stackIn_28_0 = this;
                stackIn_28_1 = 1;
                break L6;
              }
            }
            ((in) (this)).field_a = stackIn_28_1 != 0;
            com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
            return;
          } else {
            L7: {
              stackIn_15_0 = this;

              if (!param0) {
                stackIn_16_0 = this;
                stackIn_16_1 = 0;
                break L7;
              } else {
                stackIn_16_0 = this;
                stackIn_16_1 = 1;
                break L7;
              }
            }
            ((in) (this)).field_a = stackIn_16_1 != 0;
            com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
            return;
          }
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2) {
        com.ms.win32.User32.SetCursorPos(param1, param0);
        if (param2 != 0) {
            this.field_a = true;
        }
    }

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int stackIn_7_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_21_0 = 0;
        int var5;
        if (this.field_c == param0) {
          if (param1 == 32) {
            var5 = 65535 & param3;
            if ((var5 ^ -1) != -2) {
              if (param1 != 101024) {
                if ((param1 ^ -1) == -2) {
                  this.field_c = 0;
                  this.field_a = true;
                  return com.ms.win32.User32.CallWindowProc(this.field_e, param0, param1, param2, param3);
                } else {
                  return com.ms.win32.User32.CallWindowProc(this.field_e, param0, param1, param2, param3);
                }
              } else {
                L0: {
                  if (!this.field_a) {
                    stackIn_21_0 = 0;
                    break L0;
                  } else {
                    stackIn_21_0 = this.field_b;
                    break L0;
                  }
                }
                com.ms.win32.User32.SetCursor(stackIn_21_0);
                return 0;
              }
            } else {
              L1: {
                if (!this.field_a) {
                  stackIn_16_0 = 0;
                  break L1;
                } else {
                  stackIn_16_0 = this.field_b;
                  break L1;
                }
              }
              com.ms.win32.User32.SetCursor(stackIn_16_0);
              return 0;
            }
          } else {
            if (param1 != 101024) {
              if ((param1 ^ -1) == -2) {
                this.field_c = 0;
                this.field_a = true;
                return com.ms.win32.User32.CallWindowProc(this.field_e, param0, param1, param2, param3);
              } else {
                return com.ms.win32.User32.CallWindowProc(this.field_e, param0, param1, param2, param3);
              }
            } else {
              L2: {
                if (!this.field_a) {
                  stackIn_7_0 = 0;
                  break L2;
                } else {
                  stackIn_7_0 = this.field_b;
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

    in() {
        this.field_a = true;
    }
}
