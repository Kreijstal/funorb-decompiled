/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class be extends com.ms.dll.Callback {
    private volatile boolean field_e;
    private volatile int field_b;
    private volatile int field_d;
    private boolean field_a;
    private int field_c;

    final void a(boolean param0, java.awt.Component param1, int param2) {
        int var5 = 0;
        Object var6 = null;
        Throwable var8 = null;
        com.ms.awt.WComponentPeer var9 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_1 = 0;
        Object stackIn_15_0 = null;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        Object stackIn_28_0 = null;
        Object stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        Throwable decompiledCaughtException = null;
        L0: {
          var9 = (com.ms.awt.WComponentPeer) null;
          var5 = var9.getTopHwnd();
          if (this.field_d != var5) {
            break L0;
          } else {
            L1: {
              if (this.field_e) {
                stackIn_4_0 = 0;
                break L1;
              } else {
                stackIn_4_0 = 1;
                break L1;
              }
            }
            L2: {


              if (param0) {

                stackIn_7_1 = 0;
                break L2;
              } else {

                stackIn_7_1 = 1;
                break L2;
              }
            }
            if (stackIn_4_0 != stackIn_7_1) {
              break L0;
            } else {
              return;
            }
          }
        }
        L3: {
          if (!this.field_a) {
            this.field_c = com.ms.win32.User32.LoadCursor(0, 32512);
            com.ms.dll.Root.alloc(this);
            this.field_a = true;
            break L3;
          } else {
            break L3;
          }
        }
        if (this.field_d != var5) {
          L4: {
            if (this.field_d != 0) {
              this.field_e = true;
              com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
              var6 = this;
              synchronized (var6) {
                L5: {
                  com.ms.win32.User32.SetWindowLong(this.field_d, -4, this.field_b);
                  break L5;
                }
              }
              break L4;
            } else {
              break L4;
            }
          }
          var6 = this;
          synchronized (var6) {
            L6: {
              this.field_d = var5;
              this.field_b = com.ms.win32.User32.SetWindowLong(this.field_d, -4, this);
              break L6;
            }
          }
          L7: {
            stackIn_28_0 = this;

            if (!param0) {
              stackIn_29_0 = this;
              stackIn_29_1 = 0;
              break L7;
            } else {
              stackIn_29_0 = this;
              stackIn_29_1 = 1;
              break L7;
            }
          }
          ((be) (this)).field_e = stackIn_29_1 != 0;
          com.ms.win32.User32.SendMessage(var5, param2, 0, 0);
          return;
        } else {
          L8: {
            stackIn_15_0 = this;

            if (!param0) {
              stackIn_16_0 = this;
              stackIn_16_1 = 0;
              break L8;
            } else {
              stackIn_16_0 = this;
              stackIn_16_1 = 1;
              break L8;
            }
          }
          ((be) (this)).field_e = stackIn_16_1 != 0;
          com.ms.win32.User32.SendMessage(var5, param2, 0, 0);
          return;
        }
    }

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int stackIn_7_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_23_0 = 0;
        int var5;
        if (param0 == this.field_d) {
          if (-33 != (param1 ^ -1)) {
            if (param1 == 101024) {
              L0: {
                if (this.field_e) {
                  stackIn_23_0 = this.field_c;
                  break L0;
                } else {
                  stackIn_23_0 = 0;
                  break L0;
                }
              }
              com.ms.win32.User32.SetCursor(stackIn_23_0);
              return 0;
            } else {
              if ((param1 ^ -1) == -2) {
                this.field_d = 0;
                this.field_e = true;
                return com.ms.win32.User32.CallWindowProc(this.field_b, param0, param1, param2, param3);
              } else {
                return com.ms.win32.User32.CallWindowProc(this.field_b, param0, param1, param2, param3);
              }
            }
          } else {
            var5 = param3 & 65535;
            if (var5 != 1) {
              if (param1 == 101024) {
                L1: {
                  if (this.field_e) {
                    stackIn_13_0 = this.field_c;
                    break L1;
                  } else {
                    stackIn_13_0 = 0;
                    break L1;
                  }
                }
                com.ms.win32.User32.SetCursor(stackIn_13_0);
                return 0;
              } else {
                if ((param1 ^ -1) == -2) {
                  this.field_d = 0;
                  this.field_e = true;
                  return com.ms.win32.User32.CallWindowProc(this.field_b, param0, param1, param2, param3);
                } else {
                  return com.ms.win32.User32.CallWindowProc(this.field_b, param0, param1, param2, param3);
                }
              }
            } else {
              L2: {
                if (!this.field_e) {
                  stackIn_7_0 = 0;
                  break L2;
                } else {
                  stackIn_7_0 = this.field_c;
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

    final void a(int param0, int param1, int param2) {
        if (param1 != 101024) {
            return;
        }
        com.ms.win32.User32.SetCursorPos(param0, param2);
    }

    be() {
        this.field_e = true;
    }
}
