/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fb extends com.ms.dll.Callback {
    private boolean field_a;
    private int field_b;
    private volatile boolean field_d;
    private volatile int field_e;
    private volatile int field_c;

    final void a(int param0, int param1, int param2) {
        java.awt.Component var5;
        if (param2 != -11154) {
          var5 = (java.awt.Component) null;
          this.a((java.awt.Component) null, true, (byte) 3);
          com.ms.win32.User32.SetCursorPos(param1, param0);
          return;
        } else {
          com.ms.win32.User32.SetCursorPos(param1, param0);
          return;
        }
    }

    final void a(java.awt.Component param0, boolean param1, byte param2) {
        int var5 = 0;
        Object var6 = null;
        Throwable var8 = null;
        com.ms.awt.WComponentPeer var9 = null;
        Object stackIn_19_0 = null;
        Object stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        Object stackIn_25_0 = null;
        Object stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        Throwable decompiledCaughtException = null;
        var9 = (com.ms.awt.WComponentPeer) null;
        var5 = var9.getTopHwnd();
        if (param2 >= 84) {
          L0: {
            if (var5 != this.field_c) {
              break L0;
            } else {
              if (this.field_d != param1) {
                break L0;
              } else {
                return;
              }
            }
          }
          L1: {
            if (!this.field_a) {
              this.field_b = com.ms.win32.User32.LoadCursor(0, 32512);
              com.ms.dll.Root.alloc(this);
              this.field_a = true;
              break L1;
            } else {
              break L1;
            }
          }
          if (this.field_c == var5) {
            L2: {
              stackIn_25_0 = this;

              if (!param1) {
                stackIn_26_0 = this;
                stackIn_26_1 = 0;
                break L2;
              } else {
                stackIn_26_0 = this;
                stackIn_26_1 = 1;
                break L2;
              }
            }
            ((fb) (this)).field_d = stackIn_26_1 != 0;
            com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
            return;
          } else {
            L3: {
              if (this.field_c == 0) {
                break L3;
              } else {
                this.field_d = true;
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
              stackIn_19_0 = this;

              if (!param1) {
                stackIn_20_0 = this;
                stackIn_20_1 = 0;
                break L6;
              } else {
                stackIn_20_0 = this;
                stackIn_20_1 = 1;
                break L6;
              }
            }
            ((fb) (this)).field_d = stackIn_20_1 != 0;
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
        if (param0 == this.field_c) {
          if (32 == param1) {
            var5 = param3 & 65535;
            if (var5 != 1) {
              if (param1 != 101024) {
                if (-2 == (param1 ^ -1)) {
                  this.field_c = 0;
                  this.field_d = true;
                  return com.ms.win32.User32.CallWindowProc(this.field_e, param0, param1, param2, param3);
                } else {
                  return com.ms.win32.User32.CallWindowProc(this.field_e, param0, param1, param2, param3);
                }
              } else {
                L0: {
                  if (!this.field_d) {
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
                if (!this.field_d) {
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
              if (-2 == (param1 ^ -1)) {
                this.field_c = 0;
                this.field_d = true;
                return com.ms.win32.User32.CallWindowProc(this.field_e, param0, param1, param2, param3);
              } else {
                return com.ms.win32.User32.CallWindowProc(this.field_e, param0, param1, param2, param3);
              }
            } else {
              L2: {
                if (!this.field_d) {
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

    fb() {
        this.field_d = true;
    }
}
