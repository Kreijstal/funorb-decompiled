/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pp extends com.ms.dll.Callback {
    private int field_b;
    private volatile int field_e;
    private boolean field_d;
    private volatile int field_c;
    private volatile boolean field_a;

    final void a(int param0, int param1, int param2) {
        com.ms.win32.User32.SetCursorPos(param0, param2);
        if (param1 != -4) {
            this.callback(-126, -112, 29, -80);
        }
    }

    final void a(boolean param0, java.awt.Component param1, int param2) {
        int var5 = 0;
        Object var6 = null;
        Throwable var8 = null;
        com.ms.awt.WComponentPeer var9 = null;
        boolean stackIn_3_0 = false;
        boolean stackIn_4_0 = false;
        int stackIn_4_1 = 0;
        Object stackIn_21_0 = null;
        Object stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        Object stackIn_27_0 = null;
        Object stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        Throwable decompiledCaughtException = null;
        L0: {
          var9 = (com.ms.awt.WComponentPeer) null;
          var5 = var9.getTopHwnd();
          if (this.field_c != var5) {
            break L0;
          } else {
            L1: {
              stackIn_3_0 = param0;

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
            if ((stackIn_4_0 ? 1 : 0) == stackIn_4_1) {
              break L0;
            } else {
              return;
            }
          }
        }
        L2: {
          if (!this.field_d) {
            this.field_b = com.ms.win32.User32.LoadCursor(0, 32512);
            com.ms.dll.Root.alloc(this);
            this.field_d = true;
            break L2;
          } else {
            break L2;
          }
        }
        if (var5 == this.field_c) {
          L3: {
            stackIn_27_0 = this;

            if (!param0) {
              stackIn_28_0 = this;
              stackIn_28_1 = 0;
              break L3;
            } else {
              stackIn_28_0 = this;
              stackIn_28_1 = 1;
              break L3;
            }
          }
          ((pp) (this)).field_a = stackIn_28_1 != 0;
          com.ms.win32.User32.SendMessage(var5, 101024, 0, param2);
          return;
        } else {
          L4: {
            if (-1 != (this.field_c ^ -1)) {
              this.field_a = true;
              com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
              var6 = this;
              synchronized (var6) {
                L5: {
                  com.ms.win32.User32.SetWindowLong(this.field_c, -4, this.field_e);
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
              this.field_e = com.ms.win32.User32.SetWindowLong(this.field_c, -4, this);
              break L6;
            }
          }
          L7: {
            stackIn_21_0 = this;

            if (!param0) {
              stackIn_22_0 = this;
              stackIn_22_1 = 0;
              break L7;
            } else {
              stackIn_22_0 = this;
              stackIn_22_1 = 1;
              break L7;
            }
          }
          ((pp) (this)).field_a = stackIn_22_1 != 0;
          com.ms.win32.User32.SendMessage(var5, 101024, 0, param2);
          return;
        }
    }

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_21_0 = 0;
        int var5;
        if (this.field_c == param0) {
          if (-33 != (param1 ^ -1)) {
            if (-101025 != (param1 ^ -1)) {
              if (-2 == (param1 ^ -1)) {
                this.field_c = 0;
                this.field_a = true;
                return com.ms.win32.User32.CallWindowProc(this.field_e, param0, param1, param2, param3);
              } else {
                return com.ms.win32.User32.CallWindowProc(this.field_e, param0, param1, param2, param3);
              }
            } else {
              L0: {
                if (!this.field_a) {
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
            var5 = 65535 & param3;
            if (1 != var5) {
              if (-101025 != (param1 ^ -1)) {
                if (-2 == (param1 ^ -1)) {
                  this.field_c = 0;
                  this.field_a = true;
                  return com.ms.win32.User32.CallWindowProc(this.field_e, param0, param1, param2, param3);
                } else {
                  return com.ms.win32.User32.CallWindowProc(this.field_e, param0, param1, param2, param3);
                }
              } else {
                L1: {
                  if (!this.field_a) {
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
                if (this.field_a) {
                  stackIn_7_0 = this.field_b;
                  break L2;
                } else {
                  stackIn_7_0 = 0;
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

    pp() {
        this.field_a = true;
    }
}
