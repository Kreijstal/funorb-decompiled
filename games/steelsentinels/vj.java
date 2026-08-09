/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vj extends com.ms.dll.Callback {
    private int field_e;
    private volatile boolean field_d;
    private volatile int field_b;
    private volatile int field_c;
    private boolean field_a;

    final void a(java.awt.Component param0, int param1, boolean param2) {
        boolean stackIn_5_0 = false;
        boolean stackIn_6_0 = false;
        int stackIn_6_1 = 0;
        Object stackIn_14_0 = null;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        Object stackIn_27_0 = null;
        Object stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        Throwable decompiledCaughtException = null;
        int var5 = 0;
        Object var6 = null;
        com.ms.awt.WComponentPeer var9 = null;
        L0: {
          if (param1 == 32512) {
            break L0;
          } else {
            this.a(-24, -44, true);
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
          if (this.field_a) {
            break L3;
          } else {
            this.field_e = com.ms.win32.User32.LoadCursor(0, 32512);
            com.ms.dll.Root.alloc(this);
            this.field_a = true;
            break L3;
          }
        }
        if (this.field_c != var5) {
          L4: {
            if (0 != this.field_c) {
              this.field_d = true;
              com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
              var6 = this;
              synchronized (var6) {
                L5: {
                  com.ms.win32.User32.SetWindowLong(this.field_c, -4, this.field_b);
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
              this.field_c = var5;
              this.field_b = com.ms.win32.User32.SetWindowLong(this.field_c, -4, this);
              break L6;
            }
          }
          L7: {
            stackIn_27_0 = this;

            if (!param2) {
              stackIn_28_0 = this;
              stackIn_28_1 = 0;
              break L7;
            } else {
              stackIn_28_0 = this;
              stackIn_28_1 = 1;
              break L7;
            }
          }
          ((vj) (this)).field_d = stackIn_28_1 != 0;
          com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
          return;
        } else {
          L8: {
            stackIn_14_0 = this;

            if (!param2) {
              stackIn_15_0 = this;
              stackIn_15_1 = 0;
              break L8;
            } else {
              stackIn_15_0 = this;
              stackIn_15_1 = 1;
              break L8;
            }
          }
          ((vj) (this)).field_d = stackIn_15_1 != 0;
          com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
          return;
        }
    }

    final void a(int param0, int param1, boolean param2) {
        com.ms.win32.User32.SetCursorPos(param1, param0);
        if (param2) {
            this.callback(101, 84, -67, 91);
        }
    }

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int stackIn_8_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_22_0 = 0;
        int var5;
        if (param0 != this.field_c) {
          var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
          return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        } else {
          if (32 == param1) {
            var5 = 65535 & param3;
            if ((var5 ^ -1) != -2) {
              if (101024 != param1) {
                if (1 == param1) {
                  this.field_c = 0;
                  this.field_d = true;
                  return com.ms.win32.User32.CallWindowProc(this.field_b, param0, param1, param2, param3);
                } else {
                  return com.ms.win32.User32.CallWindowProc(this.field_b, param0, param1, param2, param3);
                }
              } else {
                L0: {
                  if (!this.field_d) {
                    stackIn_22_0 = 0;
                    break L0;
                  } else {
                    stackIn_22_0 = this.field_e;
                    break L0;
                  }
                }
                com.ms.win32.User32.SetCursor(stackIn_22_0);
                return 0;
              }
            } else {
              L1: {
                if (!this.field_d) {
                  stackIn_17_0 = 0;
                  break L1;
                } else {
                  stackIn_17_0 = this.field_e;
                  break L1;
                }
              }
              com.ms.win32.User32.SetCursor(stackIn_17_0);
              return 0;
            }
          } else {
            if (101024 != param1) {
              if (1 == param1) {
                this.field_c = 0;
                this.field_d = true;
                return com.ms.win32.User32.CallWindowProc(this.field_b, param0, param1, param2, param3);
              } else {
                return com.ms.win32.User32.CallWindowProc(this.field_b, param0, param1, param2, param3);
              }
            } else {
              L2: {
                if (!this.field_d) {
                  stackIn_8_0 = 0;
                  break L2;
                } else {
                  stackIn_8_0 = this.field_e;
                  break L2;
                }
              }
              com.ms.win32.User32.SetCursor(stackIn_8_0);
              return 0;
            }
          }
        }
    }

    vj() {
        this.field_d = true;
    }
}
