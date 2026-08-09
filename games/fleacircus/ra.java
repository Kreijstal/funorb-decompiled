/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ra extends com.ms.dll.Callback {
    private volatile int field_c;
    private volatile int field_b;
    private boolean field_d;
    private volatile boolean field_a;
    private int field_e;

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int stackIn_9_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_24_0 = 0;
        int var5;
        if (param0 != this.field_c) {
          var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
          return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        } else {
          if (param1 == 32) {
            var5 = param3 & 65535;
            if (var5 != 1) {
              if ((param1 ^ -1) == -101025) {
                L0: {
                  if (!this.field_a) {
                    stackIn_24_0 = 0;
                    break L0;
                  } else {
                    stackIn_24_0 = this.field_e;
                    break L0;
                  }
                }
                com.ms.win32.User32.SetCursor(stackIn_24_0);
                return 0;
              } else {
                if (1 == param1) {
                  this.field_c = 0;
                  this.field_a = true;
                  return com.ms.win32.User32.CallWindowProc(this.field_b, param0, param1, param2, param3);
                } else {
                  return com.ms.win32.User32.CallWindowProc(this.field_b, param0, param1, param2, param3);
                }
              }
            } else {
              L1: {
                if (!this.field_a) {
                  stackIn_18_0 = 0;
                  break L1;
                } else {
                  stackIn_18_0 = this.field_e;
                  break L1;
                }
              }
              com.ms.win32.User32.SetCursor(stackIn_18_0);
              return 0;
            }
          } else {
            if ((param1 ^ -1) == -101025) {
              L2: {
                if (!this.field_a) {
                  stackIn_9_0 = 0;
                  break L2;
                } else {
                  stackIn_9_0 = this.field_e;
                  break L2;
                }
              }
              com.ms.win32.User32.SetCursor(stackIn_9_0);
              return 0;
            } else {
              if (1 == param1) {
                this.field_c = 0;
                this.field_a = true;
                return com.ms.win32.User32.CallWindowProc(this.field_b, param0, param1, param2, param3);
              } else {
                return com.ms.win32.User32.CallWindowProc(this.field_b, param0, param1, param2, param3);
              }
            }
          }
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param0 >= -123) {
            this.field_b = 124;
            com.ms.win32.User32.SetCursorPos(param1, param2);
            return;
        }
        com.ms.win32.User32.SetCursorPos(param1, param2);
    }

    final void a(java.awt.Component param0, byte param1, boolean param2) {
        int stackIn_4_0 = 0;
        int stackIn_7_1 = 0;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        Object stackIn_30_0 = null;
        Object stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        Throwable decompiledCaughtException = null;
        int var5 = 0;
        Object var6 = null;
        com.ms.awt.WComponentPeer var9 = null;
        L0: {
          var9 = (com.ms.awt.WComponentPeer) null;
          var5 = var9.getTopHwnd();
          if (this.field_c != var5) {
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


              if (this.field_a) {

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
          if (!this.field_d) {
            this.field_e = com.ms.win32.User32.LoadCursor(0, 32512);
            com.ms.dll.Root.alloc(this);
            this.field_d = true;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (param1 == -36) {
            break L4;
          } else {
            this.field_d = true;
            break L4;
          }
        }
        if (var5 != this.field_c) {
          L5: {
            if (-1 != (this.field_c ^ -1)) {
              this.field_a = true;
              com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
              var6 = this;
              synchronized (var6) {
                L6: {
                  com.ms.win32.User32.SetWindowLong(this.field_c, -4, this.field_b);
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
              this.field_c = var5;
              this.field_b = com.ms.win32.User32.SetWindowLong(this.field_c, -4, this);
              break L7;
            }
          }
          L8: {
            stackIn_30_0 = this;

            if (!param2) {
              stackIn_31_0 = this;
              stackIn_31_1 = 0;
              break L8;
            } else {
              stackIn_31_0 = this;
              stackIn_31_1 = 1;
              break L8;
            }
          }
          ((ra) (this)).field_a = stackIn_31_1 != 0;
          com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
          return;
        } else {
          L9: {
            stackIn_17_0 = this;

            if (!param2) {
              stackIn_18_0 = this;
              stackIn_18_1 = 0;
              break L9;
            } else {
              stackIn_18_0 = this;
              stackIn_18_1 = 1;
              break L9;
            }
          }
          ((ra) (this)).field_a = stackIn_18_1 != 0;
          com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
          return;
        }
    }

    ra() {
        this.field_a = true;
    }
}
