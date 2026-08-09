/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class t extends com.ms.dll.Callback {
    private volatile boolean field_c;
    private volatile int field_a;
    private volatile int field_e;
    private int field_d;
    private boolean field_b;

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int stackIn_8_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_22_0 = 0;
        int var5;
        if (this.field_e != param0) {
          var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
          return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        } else {
          if (-33 == (param1 ^ -1)) {
            var5 = 65535 & param3;
            if (-2 != (var5 ^ -1)) {
              if ((param1 ^ -1) != -101025) {
                if ((param1 ^ -1) == -2) {
                  this.field_e = 0;
                  this.field_c = true;
                  return com.ms.win32.User32.CallWindowProc(this.field_a, param0, param1, param2, param3);
                } else {
                  return com.ms.win32.User32.CallWindowProc(this.field_a, param0, param1, param2, param3);
                }
              } else {
                L0: {
                  if (this.field_c) {
                    stackIn_22_0 = this.field_d;
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
              L1: {
                if (!this.field_c) {
                  stackIn_17_0 = 0;
                  break L1;
                } else {
                  stackIn_17_0 = this.field_d;
                  break L1;
                }
              }
              com.ms.win32.User32.SetCursor(stackIn_17_0);
              return 0;
            }
          } else {
            if ((param1 ^ -1) != -101025) {
              if ((param1 ^ -1) == -2) {
                this.field_e = 0;
                this.field_c = true;
                return com.ms.win32.User32.CallWindowProc(this.field_a, param0, param1, param2, param3);
              } else {
                return com.ms.win32.User32.CallWindowProc(this.field_a, param0, param1, param2, param3);
              }
            } else {
              L2: {
                if (this.field_c) {
                  stackIn_8_0 = this.field_d;
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

    final void a(boolean param0, int param1, java.awt.Component param2) {
        int var5 = 0;
        Object var6 = null;
        Throwable var8 = null;
        com.ms.awt.WComponentPeer var9 = null;
        boolean stackIn_3_0 = false;
        boolean stackIn_4_0 = false;
        int stackIn_4_1 = 0;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        Object stackIn_24_0 = null;
        Object stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        Throwable decompiledCaughtException = null;
        L0: {
          var9 = (com.ms.awt.WComponentPeer) null;
          var5 = var9.getTopHwnd();
          if (this.field_e != var5) {
            break L0;
          } else {
            L1: {
              stackIn_3_0 = param0;

              if (this.field_c) {
                stackIn_4_0 = stackIn_3_0;
                stackIn_4_1 = 0;
                break L1;
              } else {
                stackIn_4_0 = stackIn_3_0;
                stackIn_4_1 = 1;
                break L1;
              }
            }
            if ((stackIn_4_0 ? 1 : 0) == stackIn_4_1) {
              break L0;
            } else {
              return;
            }
          }
        }
        L2: {
          if (this.field_b) {
            break L2;
          } else {
            this.field_d = com.ms.win32.User32.LoadCursor(0, 32512);
            com.ms.dll.Root.alloc(this);
            this.field_b = true;
            break L2;
          }
        }
        if (var5 != this.field_e) {
          L3: {
            if (0 != this.field_e) {
              this.field_c = true;
              com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
              var6 = this;
              synchronized (var6) {
                L4: {
                  com.ms.win32.User32.SetWindowLong(this.field_e, -4, this.field_a);
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
              this.field_a = com.ms.win32.User32.SetWindowLong(this.field_e, -4, this);
              break L5;
            }
          }
          L6: {
            stackIn_24_0 = this;

            if (!param0) {
              stackIn_25_0 = this;
              stackIn_25_1 = 0;
              break L6;
            } else {
              stackIn_25_0 = this;
              stackIn_25_1 = 1;
              break L6;
            }
          }
          ((t) (this)).field_c = stackIn_25_1 != 0;
          com.ms.win32.User32.SendMessage(var5, 101024, 0, param1);
          return;
        } else {
          L7: {
            stackIn_11_0 = this;

            if (!param0) {
              stackIn_12_0 = this;
              stackIn_12_1 = 0;
              break L7;
            } else {
              stackIn_12_0 = this;
              stackIn_12_1 = 1;
              break L7;
            }
          }
          ((t) (this)).field_c = stackIn_12_1 != 0;
          com.ms.win32.User32.SendMessage(var5, 101024, 0, param1);
          return;
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param1 != 101024) {
            this.field_d = 0;
            com.ms.win32.User32.SetCursorPos(param0, param2);
            return;
        }
        com.ms.win32.User32.SetCursorPos(param0, param2);
    }

    t() {
        this.field_c = true;
    }
}
