/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class in extends com.ms.dll.Callback {
    private volatile boolean field_a;
    private volatile int field_e;
    private volatile int field_b;
    private boolean field_c;
    private int field_d;

    final void a(int param0, int param1, int param2) {
        if (param1 != -4) {
            this.field_c = false;
            com.ms.win32.User32.SetCursorPos(param2, param0);
            return;
        }
        com.ms.win32.User32.SetCursorPos(param2, param0);
    }

    final void a(java.awt.Component param0, int param1, boolean param2) {
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
        L0: {
          var9 = (com.ms.awt.WComponentPeer) null;
          var5 = var9.getTopHwnd();
          if (this.field_e != var5) {
            break L0;
          } else {
            if (this.field_a == param2) {
              return;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (!this.field_c) {
            this.field_d = com.ms.win32.User32.LoadCursor(0, 32512);
            com.ms.dll.Root.alloc(this);
            this.field_c = true;
            break L1;
          } else {
            break L1;
          }
        }
        if (this.field_e == var5) {
          L2: {
            stackIn_25_0 = this;

            if (!param2) {
              stackIn_26_0 = this;
              stackIn_26_1 = 0;
              break L2;
            } else {
              stackIn_26_0 = this;
              stackIn_26_1 = 1;
              break L2;
            }
          }
          ((in) (this)).field_a = stackIn_26_1 != 0;
          com.ms.win32.User32.SendMessage(var5, 101024, param1, 0);
          return;
        } else {
          L3: {
            if (this.field_e != 0) {
              this.field_a = true;
              com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
              var6 = this;
              synchronized (var6) {
                L4: {
                  com.ms.win32.User32.SetWindowLong(this.field_e, -4, this.field_b);
                  break L4;
                }
              }
              break L3;
            } else {
              break L3;
            }
          }
          var6 = this;
          synchronized (var6) {
            L5: {
              this.field_e = var5;
              this.field_b = com.ms.win32.User32.SetWindowLong(this.field_e, -4, this);
              break L5;
            }
          }
          L6: {
            stackIn_19_0 = this;

            if (!param2) {
              stackIn_20_0 = this;
              stackIn_20_1 = 0;
              break L6;
            } else {
              stackIn_20_0 = this;
              stackIn_20_1 = 1;
              break L6;
            }
          }
          ((in) (this)).field_a = stackIn_20_1 != 0;
          com.ms.win32.User32.SendMessage(var5, 101024, param1, 0);
          return;
        }
    }

    in() {
        this.field_a = true;
    }

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int stackIn_8_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_22_0 = 0;
        int var5;
        if (param0 != this.field_e) {
          var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
          return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        } else {
          if (param1 == 32) {
            var5 = param3 & 65535;
            if (1 != var5) {
              if (param1 != 101024) {
                if (param1 == 1) {
                  this.field_e = 0;
                  this.field_a = true;
                  return com.ms.win32.User32.CallWindowProc(this.field_b, param0, param1, param2, param3);
                } else {
                  return com.ms.win32.User32.CallWindowProc(this.field_b, param0, param1, param2, param3);
                }
              } else {
                L0: {
                  if (!this.field_a) {
                    stackIn_22_0 = 0;
                    break L0;
                  } else {
                    stackIn_22_0 = this.field_d;
                    break L0;
                  }
                }
                com.ms.win32.User32.SetCursor(stackIn_22_0);
                return 0;
              }
            } else {
              L1: {
                if (this.field_a) {
                  stackIn_17_0 = this.field_d;
                  break L1;
                } else {
                  stackIn_17_0 = 0;
                  break L1;
                }
              }
              com.ms.win32.User32.SetCursor(stackIn_17_0);
              return 0;
            }
          } else {
            if (param1 != 101024) {
              if (param1 == 1) {
                this.field_e = 0;
                this.field_a = true;
                return com.ms.win32.User32.CallWindowProc(this.field_b, param0, param1, param2, param3);
              } else {
                return com.ms.win32.User32.CallWindowProc(this.field_b, param0, param1, param2, param3);
              }
            } else {
              L2: {
                if (!this.field_a) {
                  stackIn_8_0 = 0;
                  break L2;
                } else {
                  stackIn_8_0 = this.field_d;
                  break L2;
                }
              }
              com.ms.win32.User32.SetCursor(stackIn_8_0);
              return 0;
            }
          }
        }
    }
}
