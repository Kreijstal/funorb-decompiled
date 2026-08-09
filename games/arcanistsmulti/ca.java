/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ca extends com.ms.dll.Callback {
    private int field_a;
    private boolean field_b;
    private volatile int field_c;
    private volatile int field_e;
    private volatile boolean field_d;

    final void a(int param0, int param1, int param2) {
        com.ms.win32.User32.SetCursorPos(param2, param1);
        if (param0 != 26899) {
            this.field_b = false;
        }
    }

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        if (param0 != this.field_c) {
            var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
            return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        }
        if (param1 != 32) {
            if (!(-101025 != (param1 ^ -1))) {
                com.ms.win32.User32.SetCursor(!this.field_d ? 0 : this.field_a);
                return 0;
            }
            if (!(-2 != (param1 ^ -1))) {
                this.field_c = 0;
                this.field_d = true;
            }
            return com.ms.win32.User32.CallWindowProc(this.field_e, param0, param1, param2, param3);
        }
        var5 = param3 & 65535;
        if (var5 == 1) {
            com.ms.win32.User32.SetCursor(!this.field_d ? 0 : this.field_a);
            return 0;
        }
        if (!(-101025 != (param1 ^ -1))) {
            com.ms.win32.User32.SetCursor(!this.field_d ? 0 : this.field_a);
            return 0;
        }
        if (!(-2 != (param1 ^ -1))) {
            this.field_c = 0;
            this.field_d = true;
        }
        return com.ms.win32.User32.CallWindowProc(this.field_e, param0, param1, param2, param3);
    }

    final void a(int param0, java.awt.Component param1, boolean param2) {
        boolean stackIn_5_0 = false;
        boolean stackIn_6_0 = false;
        int stackIn_6_1 = 0;
        Object stackIn_22_0 = null;
        Object stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        Object stackIn_28_0 = null;
        Object stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        Throwable decompiledCaughtException = null;
        int var5 = 0;
        Object var6 = null;
        com.ms.awt.WComponentPeer var9 = null;
        L0: {
          if (param0 > 49) {
            break L0;
          } else {
            this.field_a = 16;
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
              stackIn_5_0 = param2;

              if (this.field_d) {
                stackIn_6_0 = stackIn_5_0;
                stackIn_6_1 = 0;
                break L2;
              } else {
                stackIn_6_0 = stackIn_5_0;
                stackIn_6_1 = 1;
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
          if (this.field_b) {
            break L3;
          } else {
            this.field_a = com.ms.win32.User32.LoadCursor(0, 32512);
            com.ms.dll.Root.alloc(this);
            this.field_b = true;
            break L3;
          }
        }
        if (this.field_c == var5) {
          L4: {
            stackIn_28_0 = this;

            if (!param2) {
              stackIn_29_0 = this;
              stackIn_29_1 = 0;
              break L4;
            } else {
              stackIn_29_0 = this;
              stackIn_29_1 = 1;
              break L4;
            }
          }
          ((ca) (this)).field_d = stackIn_29_1 != 0;
          com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
          return;
        } else {
          L5: {
            if (-1 == (this.field_c ^ -1)) {
              break L5;
            } else {
              this.field_d = true;
              com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
              var6 = this;
              synchronized (var6) {
                L6: {
                  com.ms.win32.User32.SetWindowLong(this.field_c, -4, this.field_e);
                  break L6;
                }
              }
              break L5;
            }
          }
          var6 = this;
          synchronized (var6) {
            L7: {
              this.field_c = var5;
              this.field_e = com.ms.win32.User32.SetWindowLong(this.field_c, -4, this);
              break L7;
            }
          }
          L8: {
            stackIn_22_0 = this;

            if (!param2) {
              stackIn_23_0 = this;
              stackIn_23_1 = 0;
              break L8;
            } else {
              stackIn_23_0 = this;
              stackIn_23_1 = 1;
              break L8;
            }
          }
          ((ca) (this)).field_d = stackIn_23_1 != 0;
          com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
          return;
        }
    }

    ca() {
        this.field_d = true;
    }
}
