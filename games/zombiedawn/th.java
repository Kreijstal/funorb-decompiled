/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class th extends com.ms.dll.Callback {
    private volatile int field_a;
    private int field_d;
    private volatile boolean field_b;
    private volatile int field_e;
    private boolean field_c;

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int stackIn_7_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_21_0 = 0;
        int var5;
        if (param0 == this.field_a) {
          if (param1 == 32) {
            var5 = 65535 & param3;
            if ((var5 ^ -1) != -2) {
              if (param1 != 101024) {
                if (-2 == (param1 ^ -1)) {
                  this.field_a = 0;
                  this.field_b = true;
                  return com.ms.win32.User32.CallWindowProc(this.field_e, param0, param1, param2, param3);
                } else {
                  return com.ms.win32.User32.CallWindowProc(this.field_e, param0, param1, param2, param3);
                }
              } else {
                L0: {
                  if (!this.field_b) {
                    stackIn_21_0 = 0;
                    break L0;
                  } else {
                    stackIn_21_0 = this.field_d;
                    break L0;
                  }
                }
                com.ms.win32.User32.SetCursor(stackIn_21_0);
                return 0;
              }
            } else {
              L1: {
                if (!this.field_b) {
                  stackIn_16_0 = 0;
                  break L1;
                } else {
                  stackIn_16_0 = this.field_d;
                  break L1;
                }
              }
              com.ms.win32.User32.SetCursor(stackIn_16_0);
              return 0;
            }
          } else {
            if (param1 != 101024) {
              if (-2 == (param1 ^ -1)) {
                this.field_a = 0;
                this.field_b = true;
                return com.ms.win32.User32.CallWindowProc(this.field_e, param0, param1, param2, param3);
              } else {
                return com.ms.win32.User32.CallWindowProc(this.field_e, param0, param1, param2, param3);
              }
            } else {
              L2: {
                if (!this.field_b) {
                  stackIn_7_0 = 0;
                  break L2;
                } else {
                  stackIn_7_0 = this.field_d;
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

    final void a(java.awt.Component param0, boolean param1, boolean param2) {
        int var5 = 0;
        Object var6 = null;
        Throwable var8 = null;
        com.ms.awt.WComponentPeer var9 = null;
        int stackIn_4_0 = 0;
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
          if (var5 != this.field_a) {
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
            if (stackIn_4_0 == (this.field_b ? 1 : 0)) {
              break L0;
            } else {
              return;
            }
          }
        }
        L2: {
          if (this.field_c) {
            break L2;
          } else {
            this.field_d = com.ms.win32.User32.LoadCursor(0, 32512);
            com.ms.dll.Root.alloc(this);
            this.field_c = true;
            break L2;
          }
        }
        if (param1) {
          if (this.field_a == var5) {
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
            ((th) (this)).field_b = stackIn_29_1 != 0;
            com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
            return;
          } else {
            L4: {
              if (this.field_a != 0) {
                this.field_b = true;
                com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
                var6 = this;
                synchronized (var6) {
                  L5: {
                    com.ms.win32.User32.SetWindowLong(this.field_a, -4, this.field_e);
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
                this.field_a = var5;
                this.field_e = com.ms.win32.User32.SetWindowLong(this.field_a, -4, this);
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
            ((th) (this)).field_b = stackIn_23_1 != 0;
            com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
            return;
          }
        } else {
          return;
        }
    }

    final void a(int param0, int param1, byte param2) {
        if (param2 != -70) {
            return;
        }
        com.ms.win32.User32.SetCursorPos(param1, param0);
    }

    th() {
        this.field_b = true;
    }
}
