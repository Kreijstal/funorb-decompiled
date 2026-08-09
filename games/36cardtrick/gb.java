/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gb extends com.ms.dll.Callback {
    private volatile int field_e;
    private volatile boolean field_c;
    private int field_d;
    private volatile int field_b;
    private boolean field_a;

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int var5;
        int stackIn_9_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_24_0 = 0;
        if (this.field_b != param0) {
          var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
          return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        } else {
          if (-33 == (param1 ^ -1)) {
            var5 = 65535 & param3;
            if (1 != var5) {
              if (param1 == 101024) {
                L0: {
                  if (!this.field_c) {
                    stackIn_24_0 = 0;
                    break L0;
                  } else {
                    stackIn_24_0 = this.field_d;
                    break L0;
                  }
                }
                com.ms.win32.User32.SetCursor(stackIn_24_0);
                return 0;
              } else {
                L1: {
                  if (param1 == 1) {
                    this.field_b = 0;
                    this.field_c = true;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                return com.ms.win32.User32.CallWindowProc(this.field_e, param0, param1, param2, param3);
              }
            } else {
              L2: {
                if (this.field_c) {
                  stackIn_18_0 = this.field_d;
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
            if (param1 == 101024) {
              L3: {
                if (!this.field_c) {
                  stackIn_9_0 = 0;
                  break L3;
                } else {
                  stackIn_9_0 = this.field_d;
                  break L3;
                }
              }
              com.ms.win32.User32.SetCursor(stackIn_9_0);
              return 0;
            } else {
              L4: {
                if (param1 == 1) {
                  this.field_b = 0;
                  this.field_c = true;
                  break L4;
                } else {
                  break L4;
                }
              }
              return com.ms.win32.User32.CallWindowProc(this.field_e, param0, param1, param2, param3);
            }
          }
        }
    }

    final void a(boolean param0, java.awt.Component param1, int param2) {
        int stackIn_6_0 = 0;
        Object stackIn_13_0 = null;
        Object stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        Object stackIn_26_0 = null;
        Object stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        Throwable decompiledCaughtException = null;
        int var5 = 0;
        Object var6 = null;
        com.ms.awt.WComponentPeer var9 = null;
        L0: {
          if (param2 == -4) {
            break L0;
          } else {
            this.field_e = 72;
            break L0;
          }
        }
        L1: {
          var9 = (com.ms.awt.WComponentPeer) null;
          var5 = var9.getTopHwnd();
          if (this.field_b != var5) {
            break L1;
          } else {
            L2: {
              if (this.field_c) {
                stackIn_6_0 = 0;
                break L2;
              } else {
                stackIn_6_0 = 1;
                break L2;
              }
            }
            if (stackIn_6_0 == (param0 ? 1 : 0)) {
              break L1;
            } else {
              return;
            }
          }
        }
        L3: {
          if (this.field_a) {
            break L3;
          } else {
            this.field_d = com.ms.win32.User32.LoadCursor(0, 32512);
            com.ms.dll.Root.alloc(this);
            this.field_a = true;
            break L3;
          }
        }
        if (var5 != this.field_b) {
          L4: {
            if (0 != this.field_b) {
              this.field_c = true;
              com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
              var6 = this;
              synchronized (var6) {
                L5: {
                  com.ms.win32.User32.SetWindowLong(this.field_b, -4, this.field_e);
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
              this.field_b = var5;
              this.field_e = com.ms.win32.User32.SetWindowLong(this.field_b, -4, this);
              break L6;
            }
          }
          L7: {
            stackIn_26_0 = this;

            if (!param0) {
              stackIn_27_0 = this;
              stackIn_27_1 = 0;
              break L7;
            } else {
              stackIn_27_0 = this;
              stackIn_27_1 = 1;
              break L7;
            }
          }
          ((gb) (this)).field_c = stackIn_27_1 != 0;
          com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
          return;
        } else {
          L8: {
            stackIn_13_0 = this;

            if (!param0) {
              stackIn_14_0 = this;
              stackIn_14_1 = 0;
              break L8;
            } else {
              stackIn_14_0 = this;
              stackIn_14_1 = 1;
              break L8;
            }
          }
          ((gb) (this)).field_c = stackIn_14_1 != 0;
          com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
          return;
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param2 != 32512) {
          this.callback(18, -64, -120, -4);
          com.ms.win32.User32.SetCursorPos(param0, param1);
          return;
        } else {
          com.ms.win32.User32.SetCursorPos(param0, param1);
          return;
        }
    }

    gb() {
        this.field_c = true;
    }
}
