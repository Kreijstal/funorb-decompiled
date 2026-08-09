/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cl extends com.ms.dll.Callback {
    private volatile int field_a;
    private volatile int field_d;
    private boolean field_c;
    private int field_e;
    private volatile boolean field_b;

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_22_0 = 0;
        int var5;
        if (this.field_d != param0) {
          var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
          return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        } else {
          if (-33 != (param1 ^ -1)) {
            if (param1 != 101024) {
              if (param1 == 1) {
                this.field_d = 0;
                this.field_b = true;
                return com.ms.win32.User32.CallWindowProc(this.field_a, param0, param1, param2, param3);
              } else {
                return com.ms.win32.User32.CallWindowProc(this.field_a, param0, param1, param2, param3);
              }
            } else {
              L0: {
                if (this.field_b) {
                  stackIn_22_0 = this.field_e;
                  break L0;
                } else {
                  stackIn_22_0 = 0;
                  break L0;
                }
              }
              com.ms.win32.User32.SetCursor(stackIn_22_0);
              return 0;
            }
          } else {
            var5 = param3 & 65535;
            if (-2 != (var5 ^ -1)) {
              if (param1 != 101024) {
                if (param1 == 1) {
                  this.field_d = 0;
                  this.field_b = true;
                  return com.ms.win32.User32.CallWindowProc(this.field_a, param0, param1, param2, param3);
                } else {
                  return com.ms.win32.User32.CallWindowProc(this.field_a, param0, param1, param2, param3);
                }
              } else {
                L1: {
                  if (this.field_b) {
                    stackIn_13_0 = this.field_e;
                    break L1;
                  } else {
                    stackIn_13_0 = 0;
                    break L1;
                  }
                }
                com.ms.win32.User32.SetCursor(stackIn_13_0);
                return 0;
              }
            } else {
              L2: {
                if (this.field_b) {
                  stackIn_8_0 = this.field_e;
                  break L2;
                } else {
                  stackIn_8_0 = 0;
                  break L2;
                }
              }
              com.ms.win32.User32.SetCursor(stackIn_8_0);
              return 0;
            }
          }
        }
    }

    final void a(java.awt.Component param0, boolean param1, int param2) {
        int var5 = 0;
        Object var6 = null;
        Throwable var8 = null;
        com.ms.awt.WComponentPeer var9 = null;
        boolean stackIn_5_0 = false;
        boolean stackIn_6_0 = false;
        int stackIn_6_1 = 0;
        Object stackIn_14_0 = null;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        Object stackIn_26_0 = null;
        Object stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        Throwable decompiledCaughtException = null;
        if (param2 == -1101) {
          L0: {
            var9 = (com.ms.awt.WComponentPeer) null;
            var5 = var9.getTopHwnd();
            if (var5 != this.field_d) {
              break L0;
            } else {
              L1: {
                stackIn_5_0 = this.field_b;

                if (param1) {
                  stackIn_6_0 = stackIn_5_0;
                  stackIn_6_1 = 0;
                  break L1;
                } else {
                  stackIn_6_0 = stackIn_5_0;
                  stackIn_6_1 = 1;
                  break L1;
                }
              }
              if ((stackIn_6_0 ? 1 : 0) != stackIn_6_1) {
                return;
              } else {
                break L0;
              }
            }
          }
          L2: {
            if (this.field_c) {
              break L2;
            } else {
              this.field_e = com.ms.win32.User32.LoadCursor(0, 32512);
              com.ms.dll.Root.alloc(this);
              this.field_c = true;
              break L2;
            }
          }
          if (var5 != this.field_d) {
            L3: {
              if (this.field_d == 0) {
                break L3;
              } else {
                this.field_b = true;
                com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
                var6 = this;
                synchronized (var6) {
                  L4: {
                    com.ms.win32.User32.SetWindowLong(this.field_d, -4, this.field_a);
                    break L4;
                  }
                }
                break L3;
              }
            }
            var6 = this;
            synchronized (var6) {
              L5: {
                this.field_d = var5;
                this.field_a = com.ms.win32.User32.SetWindowLong(this.field_d, -4, this);
                break L5;
              }
            }
            L6: {
              stackIn_26_0 = this;

              if (!param1) {
                stackIn_27_0 = this;
                stackIn_27_1 = 0;
                break L6;
              } else {
                stackIn_27_0 = this;
                stackIn_27_1 = 1;
                break L6;
              }
            }
            ((cl) (this)).field_b = stackIn_27_1 != 0;
            com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
            return;
          } else {
            L7: {
              stackIn_14_0 = this;

              if (!param1) {
                stackIn_15_0 = this;
                stackIn_15_1 = 0;
                break L7;
              } else {
                stackIn_15_0 = this;
                stackIn_15_1 = 1;
                break L7;
              }
            }
            ((cl) (this)).field_b = stackIn_15_1 != 0;
            com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
            return;
          }
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2) {
        com.ms.win32.User32.SetCursorPos(param2, param0);
        if (param1 >= -10) {
            java.awt.Component var5 = (java.awt.Component) null;
            this.a((java.awt.Component) null, true, 29);
        }
    }

    cl() {
        this.field_b = true;
    }
}
