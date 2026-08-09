/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ue extends com.ms.dll.Callback {
    private volatile int field_b;
    private volatile int field_d;
    private volatile boolean field_c;
    private int field_e;
    private boolean field_a;

    final void a(int param0, java.awt.Component param1, boolean param2) {
        int var5 = 0;
        Object var6 = null;
        Throwable var8 = null;
        com.ms.awt.WComponentPeer var9 = null;
        boolean stackIn_3_0 = false;
        boolean stackIn_4_0 = false;
        int stackIn_4_1 = 0;
        Object stackIn_22_0 = null;
        Object stackIn_23_0 = null;
        int stackIn_23_1 = 0;
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
              stackIn_3_0 = param2;

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
            if ((stackIn_4_0 ? 1 : 0) != stackIn_4_1) {
              return;
            } else {
              break L0;
            }
          }
        }
        L2: {
          if (!this.field_a) {
            this.field_e = com.ms.win32.User32.LoadCursor(0, 32512);
            com.ms.dll.Root.alloc(this);
            this.field_a = true;
            break L2;
          } else {
            break L2;
          }
        }
        if (this.field_d == var5) {
          L3: {
            stackIn_28_0 = this;

            if (!param2) {
              stackIn_29_0 = this;
              stackIn_29_1 = 0;
              break L3;
            } else {
              stackIn_29_0 = this;
              stackIn_29_1 = 1;
              break L3;
            }
          }
          ((ue) (this)).field_c = stackIn_29_1 != 0;
          com.ms.win32.User32.SendMessage(var5, 101024, param0, 0);
          return;
        } else {
          L4: {
            if (this.field_d != 0) {
              this.field_c = true;
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
            stackIn_22_0 = this;

            if (!param2) {
              stackIn_23_0 = this;
              stackIn_23_1 = 0;
              break L7;
            } else {
              stackIn_23_0 = this;
              stackIn_23_1 = 1;
              break L7;
            }
          }
          ((ue) (this)).field_c = stackIn_23_1 != 0;
          com.ms.win32.User32.SendMessage(var5, 101024, param0, 0);
          return;
        }
    }

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int stackIn_9_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_24_0 = 0;
        int var5;
        if (this.field_d != param0) {
          var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
          return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        } else {
          if (32 == param1) {
            var5 = 65535 & param3;
            if (-2 != (var5 ^ -1)) {
              if (101024 == param1) {
                L0: {
                  if (this.field_c) {
                    stackIn_24_0 = this.field_e;
                    break L0;
                  } else {
                    stackIn_24_0 = 0;
                    break L0;
                  }
                }
                com.ms.win32.User32.SetCursor(stackIn_24_0);
                return 0;
              } else {
                if ((param1 ^ -1) == -2) {
                  this.field_d = 0;
                  this.field_c = true;
                  return com.ms.win32.User32.CallWindowProc(this.field_b, param0, param1, param2, param3);
                } else {
                  return com.ms.win32.User32.CallWindowProc(this.field_b, param0, param1, param2, param3);
                }
              }
            } else {
              L1: {
                if (this.field_c) {
                  stackIn_18_0 = this.field_e;
                  break L1;
                } else {
                  stackIn_18_0 = 0;
                  break L1;
                }
              }
              com.ms.win32.User32.SetCursor(stackIn_18_0);
              return 0;
            }
          } else {
            if (101024 == param1) {
              L2: {
                if (this.field_c) {
                  stackIn_9_0 = this.field_e;
                  break L2;
                } else {
                  stackIn_9_0 = 0;
                  break L2;
                }
              }
              com.ms.win32.User32.SetCursor(stackIn_9_0);
              return 0;
            } else {
              if ((param1 ^ -1) == -2) {
                this.field_d = 0;
                this.field_c = true;
                return com.ms.win32.User32.CallWindowProc(this.field_b, param0, param1, param2, param3);
              } else {
                return com.ms.win32.User32.CallWindowProc(this.field_b, param0, param1, param2, param3);
              }
            }
          }
        }
    }

    final void a(boolean param0, int param1, int param2) {
        com.ms.win32.User32.SetCursorPos(param1, param2);
        if (param0) {
            this.a(true, 69, -117);
        }
    }

    ue() {
        this.field_c = true;
    }
}
