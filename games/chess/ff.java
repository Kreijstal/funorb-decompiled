/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ff extends com.ms.dll.Callback {
    private int field_b;
    private boolean field_c;
    private volatile int field_e;
    private volatile boolean field_a;
    private volatile int field_d;

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int stackIn_8_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_23_0 = 0;
        int var5;
        if (this.field_e == param0) {
          if (32 == param1) {
            var5 = param3 & 65535;
            if (-2 != (var5 ^ -1)) {
              if (param1 == 101024) {
                L0: {
                  if (this.field_a) {
                    stackIn_23_0 = this.field_b;
                    break L0;
                  } else {
                    stackIn_23_0 = 0;
                    break L0;
                  }
                }
                com.ms.win32.User32.SetCursor(stackIn_23_0);
                return 0;
              } else {
                if (1 == param1) {
                  this.field_e = 0;
                  this.field_a = true;
                  return com.ms.win32.User32.CallWindowProc(this.field_d, param0, param1, param2, param3);
                } else {
                  return com.ms.win32.User32.CallWindowProc(this.field_d, param0, param1, param2, param3);
                }
              }
            } else {
              L1: {
                if (!this.field_a) {
                  stackIn_17_0 = 0;
                  break L1;
                } else {
                  stackIn_17_0 = this.field_b;
                  break L1;
                }
              }
              com.ms.win32.User32.SetCursor(stackIn_17_0);
              return 0;
            }
          } else {
            if (param1 == 101024) {
              L2: {
                if (this.field_a) {
                  stackIn_8_0 = this.field_b;
                  break L2;
                } else {
                  stackIn_8_0 = 0;
                  break L2;
                }
              }
              com.ms.win32.User32.SetCursor(stackIn_8_0);
              return 0;
            } else {
              if (1 == param1) {
                this.field_e = 0;
                this.field_a = true;
                return com.ms.win32.User32.CallWindowProc(this.field_d, param0, param1, param2, param3);
              } else {
                return com.ms.win32.User32.CallWindowProc(this.field_d, param0, param1, param2, param3);
              }
            }
          }
        } else {
          var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
          return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        }
    }

    final void a(int param0, boolean param1, java.awt.Component param2) {
        boolean stackIn_3_0 = false;
        boolean stackIn_4_0 = false;
        int stackIn_4_1 = 0;
        Object stackIn_23_0 = null;
        Object stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        Object stackIn_29_0 = null;
        Object stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        Throwable decompiledCaughtException = null;
        int var5 = 0;
        Object var6 = null;
        com.ms.awt.WComponentPeer var9 = null;
        L0: {
          var9 = (com.ms.awt.WComponentPeer) null;
          var5 = var9.getTopHwnd();
          if (var5 != this.field_e) {
            break L0;
          } else {
            L1: {
              stackIn_3_0 = param1;

              if (this.field_a) {
                stackIn_4_0 = stackIn_3_0;
                stackIn_4_1 = 0;
                break L1;
              } else {
                stackIn_4_0 = stackIn_3_0;
                stackIn_4_1 = 1;
                break L1;
              }
            }
            if ((stackIn_4_0 ? 1 : 0) != stackIn_4_1) {
              return;
            } else {
              break L0;
            }
          }
        }
        L2: {
          if (param0 == 29783) {
            break L2;
          } else {
            this.callback(-4, -87, -50, -103);
            break L2;
          }
        }
        L3: {
          if (this.field_c) {
            break L3;
          } else {
            this.field_b = com.ms.win32.User32.LoadCursor(0, 32512);
            com.ms.dll.Root.alloc(this);
            this.field_c = true;
            break L3;
          }
        }
        if (var5 == this.field_e) {
          L4: {
            stackIn_29_0 = this;

            if (!param1) {
              stackIn_30_0 = this;
              stackIn_30_1 = 0;
              break L4;
            } else {
              stackIn_30_0 = this;
              stackIn_30_1 = 1;
              break L4;
            }
          }
          ((ff) (this)).field_a = stackIn_30_1 != 0;
          com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
          return;
        } else {
          L5: {
            if (this.field_e != 0) {
              this.field_a = true;
              com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
              var6 = this;
              synchronized (var6) {
                L6: {
                  com.ms.win32.User32.SetWindowLong(this.field_e, -4, this.field_d);
                  break L6;
                }
              }
              break L5;
            } else {
              break L5;
            }
          }
          var6 = this;
          synchronized (var6) {
            L7: {
              this.field_e = var5;
              this.field_d = com.ms.win32.User32.SetWindowLong(this.field_e, -4, this);
              break L7;
            }
          }
          L8: {
            stackIn_23_0 = this;

            if (!param1) {
              stackIn_24_0 = this;
              stackIn_24_1 = 0;
              break L8;
            } else {
              stackIn_24_0 = this;
              stackIn_24_1 = 1;
              break L8;
            }
          }
          ((ff) (this)).field_a = stackIn_24_1 != 0;
          com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
          return;
        }
    }

    final void a(int param0, int param1, int param2) {
        com.ms.win32.User32.SetCursorPos(param1, param2);
        if (param0 != 0) {
            java.awt.Component var5 = (java.awt.Component) null;
            this.a(-91, false, (java.awt.Component) null);
        }
    }

    ff() {
        this.field_a = true;
    }
}
