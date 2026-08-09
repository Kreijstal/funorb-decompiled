/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pq extends com.ms.dll.Callback {
    private volatile boolean field_c;
    private volatile int field_a;
    private int field_b;
    private boolean field_d;
    private volatile int field_e;

    final void a(java.awt.Component param0, byte param1, boolean param2) {
        int stackIn_4_0 = 0;
        int stackIn_7_1 = 0;
        Object stackIn_16_0 = null;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
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
              if (param2) {
                stackIn_4_0 = 0;
                break L1;
              } else {
                stackIn_4_0 = 1;
                break L1;
              }
            }
            L2: {


              if (this.field_c) {

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
          if (this.field_d) {
            break L3;
          } else {
            this.field_b = com.ms.win32.User32.LoadCursor(0, 32512);
            com.ms.dll.Root.alloc(this);
            this.field_d = true;
            break L3;
          }
        }
        L4: {
          if (param1 < -23) {
            break L4;
          } else {
            this.callback(-85, 14, 75, 9);
            break L4;
          }
        }
        if (this.field_e != var5) {
          L5: {
            if (this.field_e != 0) {
              this.field_c = true;
              com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
              var6 = this;
              synchronized (var6) {
                L6: {
                  com.ms.win32.User32.SetWindowLong(this.field_e, -4, this.field_a);
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
              this.field_a = com.ms.win32.User32.SetWindowLong(this.field_e, -4, this);
              break L7;
            }
          }
          L8: {
            stackIn_29_0 = this;

            if (!param2) {
              stackIn_30_0 = this;
              stackIn_30_1 = 0;
              break L8;
            } else {
              stackIn_30_0 = this;
              stackIn_30_1 = 1;
              break L8;
            }
          }
          ((pq) (this)).field_c = stackIn_30_1 != 0;
          com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
          return;
        } else {
          L9: {
            stackIn_16_0 = this;

            if (!param2) {
              stackIn_17_0 = this;
              stackIn_17_1 = 0;
              break L9;
            } else {
              stackIn_17_0 = this;
              stackIn_17_1 = 1;
              break L9;
            }
          }
          ((pq) (this)).field_c = stackIn_17_1 != 0;
          com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
          return;
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param2 != 9537) {
            this.field_e = 62;
            com.ms.win32.User32.SetCursorPos(param1, param0);
            return;
        }
        com.ms.win32.User32.SetCursorPos(param1, param0);
    }

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_21_0 = 0;
        int var5;
        if (this.field_e == param0) {
          if (-33 != (param1 ^ -1)) {
            if (101024 != param1) {
              if (1 == param1) {
                this.field_e = 0;
                this.field_c = true;
                return com.ms.win32.User32.CallWindowProc(this.field_a, param0, param1, param2, param3);
              } else {
                return com.ms.win32.User32.CallWindowProc(this.field_a, param0, param1, param2, param3);
              }
            } else {
              L0: {
                if (!this.field_c) {
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
            var5 = param3 & 65535;
            if ((var5 ^ -1) != -2) {
              if (101024 != param1) {
                if (1 == param1) {
                  this.field_e = 0;
                  this.field_c = true;
                  return com.ms.win32.User32.CallWindowProc(this.field_a, param0, param1, param2, param3);
                } else {
                  return com.ms.win32.User32.CallWindowProc(this.field_a, param0, param1, param2, param3);
                }
              } else {
                L1: {
                  if (!this.field_c) {
                    stackIn_12_0 = 0;
                    break L1;
                  } else {
                    stackIn_12_0 = this.field_b;
                    break L1;
                  }
                }
                com.ms.win32.User32.SetCursor(stackIn_12_0);
                return 0;
              }
            } else {
              L2: {
                if (!this.field_c) {
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

    pq() {
        this.field_c = true;
    }
}
