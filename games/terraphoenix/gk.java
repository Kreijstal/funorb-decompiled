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
        com.ms.win32.User32.SetCursorPos(param2, param1);
        if (param0 != -2) {
            this.callback(96, 11, 73, 3);
        }
    }

    final void a(boolean param0, java.awt.Component param1, int param2) {
        int var5 = 0;
        Object var6 = null;
        Throwable var8 = null;
        com.ms.awt.WComponentPeer var9 = null;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        Object stackIn_24_0 = null;
        Object stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        Throwable decompiledCaughtException = null;
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
              com.ms.dll.Root.alloc(this);
              this.field_a = true;
              break L1;
            }
          }
          if (var5 != this.field_d) {
            L2: {
              if (this.field_d != 0) {
                this.field_c = true;
                com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
                var6 = this;
                synchronized (var6) {
                  L3: {
                    com.ms.win32.User32.SetWindowLong(this.field_d, -4, this.field_b);
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
              stackIn_24_0 = this;

              if (!param0) {
                stackIn_25_0 = this;
                stackIn_25_1 = 0;
                break L5;
              } else {
                stackIn_25_0 = this;
                stackIn_25_1 = 1;
                break L5;
              }
            }
            ((gk) (this)).field_c = stackIn_25_1 != 0;
            com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
            return;
          } else {
            L6: {
              stackIn_11_0 = this;

              if (!param0) {
                stackIn_12_0 = this;
                stackIn_12_1 = 0;
                break L6;
              } else {
                stackIn_12_0 = this;
                stackIn_12_1 = 1;
                break L6;
              }
            }
            ((gk) (this)).field_c = stackIn_12_1 != 0;
            com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
            return;
          }
        } else {
          return;
        }
    }

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int stackIn_11_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_26_0 = 0;
        int var5;
        if (param0 == this.field_d) {
          if (-33 == (param1 ^ -1)) {
            var5 = param3 & 65535;
            if (1 != var5) {
              if (param1 == 101024) {
                L0: {
                  if (this.field_c) {
                    stackIn_26_0 = this.field_e;
                    break L0;
                  } else {
                    stackIn_26_0 = 0;
                    break L0;
                  }
                }
                com.ms.win32.User32.SetCursor(stackIn_26_0);
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
                  stackIn_17_0 = 0;
                  break L2;
                } else {
                  stackIn_17_0 = this.field_e;
                  break L2;
                }
              }
              com.ms.win32.User32.SetCursor(stackIn_17_0);
              return 0;
            }
          } else {
            if (param1 == 101024) {
              L3: {
                if (this.field_c) {
                  stackIn_11_0 = this.field_e;
                  break L3;
                } else {
                  stackIn_11_0 = 0;
                  break L3;
                }
              }
              com.ms.win32.User32.SetCursor(stackIn_11_0);
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
