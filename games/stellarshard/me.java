/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class me extends com.ms.dll.Callback {
    private volatile int field_a;
    private boolean field_b;
    private int field_c;
    private volatile int field_d;
    private volatile boolean field_e;

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int stackIn_12_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_27_0 = 0;
        int var5;
        if (this.field_d != param0) {
          var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
          return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        } else {
          if (param1 == 32) {
            var5 = param3 & 65535;
            if ((var5 ^ -1) != -2) {
              if (101024 == param1) {
                L0: {
                  if (this.field_e) {
                    stackIn_27_0 = this.field_c;
                    break L0;
                  } else {
                    stackIn_27_0 = 0;
                    break L0;
                  }
                }
                com.ms.win32.User32.SetCursor(stackIn_27_0);
                return 0;
              } else {
                L1: {
                  if ((param1 ^ -1) == -2) {
                    this.field_d = 0;
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
                if (this.field_e) {
                  stackIn_18_0 = this.field_c;
                  break L2;
                } else {
                  stackIn_18_0 = 0;
                  break L2;
                }
              }
              com.ms.win32.User32.SetCursor(stackIn_18_0);
              return 0;
            }
          } else {
            if (101024 == param1) {
              L3: {
                if (this.field_e) {
                  stackIn_12_0 = this.field_c;
                  break L3;
                } else {
                  stackIn_12_0 = 0;
                  break L3;
                }
              }
              com.ms.win32.User32.SetCursor(stackIn_12_0);
              return 0;
            } else {
              L4: {
                if ((param1 ^ -1) == -2) {
                  this.field_d = 0;
                  this.field_e = true;
                  break L4;
                } else {
                  break L4;
                }
              }
              return com.ms.win32.User32.CallWindowProc(this.field_a, param0, param1, param2, param3);
            }
          }
        }
    }

    final void a(boolean param0, java.awt.Component param1, byte param2) {
        int stackIn_4_0 = 0;
        int stackIn_7_1 = 0;
        Object stackIn_14_0 = null;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
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
          if (this.field_d != var5) {
            break L0;
          } else {
            L1: {
              if (param0) {
                stackIn_4_0 = 0;
                break L1;
              } else {
                stackIn_4_0 = 1;
                break L1;
              }
            }
            L2: {


              if (this.field_e) {

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
          if (this.field_b) {
            break L3;
          } else {
            this.field_c = com.ms.win32.User32.LoadCursor(0, 32512);
            com.ms.dll.Root.alloc(this);
            this.field_b = true;
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
                  com.ms.win32.User32.SetWindowLong(this.field_d, -4, this.field_a);
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
              this.field_a = com.ms.win32.User32.SetWindowLong(this.field_d, -4, this);
              break L6;
            }
          }
          L7: {
            stackIn_29_0 = this;

            if (!param0) {
              stackIn_30_0 = this;
              stackIn_30_1 = 0;
              break L7;
            } else {
              stackIn_30_0 = this;
              stackIn_30_1 = 1;
              break L7;
            }
          }
          L8: {
            ((me) (this)).field_e = stackIn_30_1 != 0;
            com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
            if (param2 < -11) {
              break L8;
            } else {
              this.callback(111, 43, 112, -96);
              break L8;
            }
          }
          return;
        } else {
          L9: {
            stackIn_14_0 = this;

            if (!param0) {
              stackIn_15_0 = this;
              stackIn_15_1 = 0;
              break L9;
            } else {
              stackIn_15_0 = this;
              stackIn_15_1 = 1;
              break L9;
            }
          }
          L10: {
            ((me) (this)).field_e = stackIn_15_1 != 0;
            com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
            if (param2 < -11) {
              break L10;
            } else {
              this.callback(111, 43, 112, -96);
              break L10;
            }
          }
          return;
        }
    }

    final void a(int param0, int param1, byte param2) {
        if (param2 != -25) {
          this.callback(124, -71, -61, -36);
          com.ms.win32.User32.SetCursorPos(param1, param0);
          return;
        } else {
          com.ms.win32.User32.SetCursorPos(param1, param0);
          return;
        }
    }

    me() {
        this.field_e = true;
    }
}
