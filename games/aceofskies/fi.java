/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fi extends com.ms.dll.Callback {
    private volatile boolean field_d;
    private int field_b;
    private volatile int field_a;
    private volatile int field_e;
    private boolean field_c;

    final void a(boolean param0, java.awt.Component param1, int param2) {
        boolean stackIn_3_0 = false;
        boolean stackIn_4_0 = false;
        int stackIn_4_1 = 0;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        Object stackIn_28_0 = null;
        Object stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        Throwable decompiledCaughtException = null;
        int var5 = 0;
        Object var6 = null;
        com.ms.awt.WComponentPeer var9 = null;
        L0: {
          var9 = (com.ms.awt.WComponentPeer) null;
          var5 = var9.getTopHwnd();
          if (this.field_a != var5) {
            break L0;
          } else {
            L1: {
              stackIn_3_0 = param0;

              if (this.field_d) {
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
          if (this.field_c) {
            break L2;
          } else {
            this.field_b = com.ms.win32.User32.LoadCursor(0, 32512);
            com.ms.dll.Root.alloc(this);
            this.field_c = true;
            break L2;
          }
        }
        if (var5 != this.field_a) {
          L3: {
            if (this.field_a != 0) {
              this.field_d = true;
              com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
              var6 = this;
              synchronized (var6) {
                L4: {
                  com.ms.win32.User32.SetWindowLong(this.field_a, -4, this.field_e);
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
              this.field_a = var5;
              this.field_e = com.ms.win32.User32.SetWindowLong(this.field_a, -4, this);
              break L5;
            }
          }
          L6: {
            stackIn_28_0 = this;

            if (!param0) {
              stackIn_29_0 = this;
              stackIn_29_1 = 0;
              break L6;
            } else {
              stackIn_29_0 = this;
              stackIn_29_1 = 1;
              break L6;
            }
          }
          ((fi) (this)).field_d = stackIn_29_1 != 0;
          if (param2 != -4) {
            return;
          } else {
            com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
            return;
          }
        } else {
          L7: {
            stackIn_12_0 = this;

            if (!param0) {
              stackIn_13_0 = this;
              stackIn_13_1 = 0;
              break L7;
            } else {
              stackIn_13_0 = this;
              stackIn_13_1 = 1;
              break L7;
            }
          }
          ((fi) (this)).field_d = stackIn_13_1 != 0;
          if (param2 != -4) {
            return;
          } else {
            com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
            return;
          }
        }
    }

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int stackIn_11_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_26_0 = 0;
        int var5;
        if (this.field_a == param0) {
          if (-33 == (param1 ^ -1)) {
            var5 = param3 & 65535;
            if (var5 != 1) {
              if (-101025 == (param1 ^ -1)) {
                L0: {
                  if (!this.field_d) {
                    stackIn_26_0 = 0;
                    break L0;
                  } else {
                    stackIn_26_0 = this.field_b;
                    break L0;
                  }
                }
                com.ms.win32.User32.SetCursor(stackIn_26_0);
                return 0;
              } else {
                L1: {
                  if (1 == param1) {
                    this.field_a = 0;
                    this.field_d = true;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                return com.ms.win32.User32.CallWindowProc(this.field_e, param0, param1, param2, param3);
              }
            } else {
              L2: {
                if (this.field_d) {
                  stackIn_17_0 = this.field_b;
                  break L2;
                } else {
                  stackIn_17_0 = 0;
                  break L2;
                }
              }
              com.ms.win32.User32.SetCursor(stackIn_17_0);
              return 0;
            }
          } else {
            if (-101025 == (param1 ^ -1)) {
              L3: {
                if (!this.field_d) {
                  stackIn_11_0 = 0;
                  break L3;
                } else {
                  stackIn_11_0 = this.field_b;
                  break L3;
                }
              }
              com.ms.win32.User32.SetCursor(stackIn_11_0);
              return 0;
            } else {
              L4: {
                if (1 == param1) {
                  this.field_a = 0;
                  this.field_d = true;
                  break L4;
                } else {
                  break L4;
                }
              }
              return com.ms.win32.User32.CallWindowProc(this.field_e, param0, param1, param2, param3);
            }
          }
        } else {
          var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
          return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param0 != 0) {
            this.field_d = false;
            com.ms.win32.User32.SetCursorPos(param1, param2);
            return;
        }
        com.ms.win32.User32.SetCursorPos(param1, param2);
    }

    fi() {
        this.field_d = true;
    }
}
