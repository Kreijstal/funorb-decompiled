/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rb extends com.ms.dll.Callback {
    private volatile boolean field_e;
    private volatile int field_a;
    private boolean field_b;
    private int field_d;
    private volatile int field_c;

    final void a(int param0, int param1, int param2) {
        if (param2 > -89) {
            this.a(-75, -95, -122);
            com.ms.win32.User32.SetCursorPos(param1, param0);
            return;
        }
        com.ms.win32.User32.SetCursorPos(param1, param0);
    }

    final void a(int param0, java.awt.Component param1, boolean param2) {
        int stackIn_6_0 = 0;
        int stackIn_9_1 = 0;
        Object stackIn_26_0 = null;
        Object stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        Object stackIn_32_0 = null;
        Object stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        Throwable decompiledCaughtException = null;
        int var5 = 0;
        Object var6 = null;
        com.ms.awt.WComponentPeer var9 = null;
        L0: {
          var9 = (com.ms.awt.WComponentPeer) null;
          var5 = var9.getTopHwnd();
          if (param0 == 32512) {
            break L0;
          } else {
            this.callback(26, -83, -16, -117);
            break L0;
          }
        }
        L1: {
          if (this.field_c != var5) {
            break L1;
          } else {
            L2: {
              if (this.field_e) {
                stackIn_6_0 = 0;
                break L2;
              } else {
                stackIn_6_0 = 1;
                break L2;
              }
            }
            L3: {


              if (param2) {

                stackIn_9_1 = 0;
                break L3;
              } else {

                stackIn_9_1 = 1;
                break L3;
              }
            }
            if (stackIn_6_0 == stackIn_9_1) {
              return;
            } else {
              break L1;
            }
          }
        }
        L4: {
          if (this.field_b) {
            break L4;
          } else {
            this.field_d = com.ms.win32.User32.LoadCursor(0, 32512);
            com.ms.dll.Root.alloc(this);
            this.field_b = true;
            break L4;
          }
        }
        if (var5 == this.field_c) {
          L5: {
            stackIn_32_0 = this;

            if (!param2) {
              stackIn_33_0 = this;
              stackIn_33_1 = 0;
              break L5;
            } else {
              stackIn_33_0 = this;
              stackIn_33_1 = 1;
              break L5;
            }
          }
          ((rb) (this)).field_e = stackIn_33_1 != 0;
          com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
          return;
        } else {
          L6: {
            if (-1 != (this.field_c ^ -1)) {
              this.field_e = true;
              com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
              var6 = this;
              synchronized (var6) {
                L7: {
                  com.ms.win32.User32.SetWindowLong(this.field_c, -4, this.field_a);
                  break L7;
                }
              }
              break L6;
            } else {
              break L6;
            }
          }
          var6 = this;
          synchronized (var6) {
            L8: {
              this.field_c = var5;
              this.field_a = com.ms.win32.User32.SetWindowLong(this.field_c, -4, this);
              break L8;
            }
          }
          L9: {
            stackIn_26_0 = this;

            if (!param2) {
              stackIn_27_0 = this;
              stackIn_27_1 = 0;
              break L9;
            } else {
              stackIn_27_0 = this;
              stackIn_27_1 = 1;
              break L9;
            }
          }
          ((rb) (this)).field_e = stackIn_27_1 != 0;
          com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
          return;
        }
    }

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int stackIn_11_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_26_0 = 0;
        int var5;
        if (param0 == this.field_c) {
          if ((param1 ^ -1) == -33) {
            var5 = param3 & 65535;
            if (1 != var5) {
              if (101024 == param1) {
                L0: {
                  if (!this.field_e) {
                    stackIn_26_0 = 0;
                    break L0;
                  } else {
                    stackIn_26_0 = this.field_d;
                    break L0;
                  }
                }
                com.ms.win32.User32.SetCursor(stackIn_26_0);
                return 0;
              } else {
                L1: {
                  if (-2 == (param1 ^ -1)) {
                    this.field_c = 0;
                    this.field_e = true;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                return com.ms.win32.User32.CallWindowProc(this.field_a, param0, param1, param2, param3);
              }
            } else {
              L2: {
                if (!this.field_e) {
                  stackIn_17_0 = 0;
                  break L2;
                } else {
                  stackIn_17_0 = this.field_d;
                  break L2;
                }
              }
              com.ms.win32.User32.SetCursor(stackIn_17_0);
              return 0;
            }
          } else {
            if (101024 == param1) {
              L3: {
                if (!this.field_e) {
                  stackIn_11_0 = 0;
                  break L3;
                } else {
                  stackIn_11_0 = this.field_d;
                  break L3;
                }
              }
              com.ms.win32.User32.SetCursor(stackIn_11_0);
              return 0;
            } else {
              L4: {
                if (-2 == (param1 ^ -1)) {
                  this.field_c = 0;
                  this.field_e = true;
                  break L4;
                } else {
                  break L4;
                }
              }
              return com.ms.win32.User32.CallWindowProc(this.field_a, param0, param1, param2, param3);
            }
          }
        } else {
          var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
          return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        }
    }

    rb() {
        this.field_e = true;
    }
}
