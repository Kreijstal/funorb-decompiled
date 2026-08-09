/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class me extends com.ms.dll.Callback {
    private volatile int field_c;
    private int field_b;
    private volatile boolean field_a;
    private boolean field_d;
    private volatile int field_e;

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int stackIn_9_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_24_0 = 0;
        int var5;
        if (param0 != this.field_c) {
          var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
          return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        } else {
          if (-33 == (param1 ^ -1)) {
            var5 = param3 & 65535;
            if (-2 != (var5 ^ -1)) {
              if (-101025 == (param1 ^ -1)) {
                L0: {
                  if (this.field_a) {
                    stackIn_24_0 = this.field_b;
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
                  this.field_c = 0;
                  this.field_a = true;
                  return com.ms.win32.User32.CallWindowProc(this.field_e, param0, param1, param2, param3);
                } else {
                  return com.ms.win32.User32.CallWindowProc(this.field_e, param0, param1, param2, param3);
                }
              }
            } else {
              L1: {
                if (this.field_a) {
                  stackIn_18_0 = this.field_b;
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
            if (-101025 == (param1 ^ -1)) {
              L2: {
                if (this.field_a) {
                  stackIn_9_0 = this.field_b;
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
                this.field_c = 0;
                this.field_a = true;
                return com.ms.win32.User32.CallWindowProc(this.field_e, param0, param1, param2, param3);
              } else {
                return com.ms.win32.User32.CallWindowProc(this.field_e, param0, param1, param2, param3);
              }
            }
          }
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 90 % ((param1 - -83) / 33);
        com.ms.win32.User32.SetCursorPos(param0, param2);
    }

    final void a(boolean param0, java.awt.Component param1, int param2) {
        int stackIn_6_0 = 0;
        int stackIn_9_1 = 0;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        Object stackIn_31_0 = null;
        Object stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        Throwable decompiledCaughtException = null;
        int var5 = 0;
        Object var6 = null;
        com.ms.awt.WComponentPeer var9 = null;
        if (param2 == 32512) {
          L0: {
            var9 = (com.ms.awt.WComponentPeer) null;
            var5 = var9.getTopHwnd();
            if (var5 != this.field_c) {
              break L0;
            } else {
              L1: {
                if (this.field_a) {
                  stackIn_6_0 = 0;
                  break L1;
                } else {
                  stackIn_6_0 = 1;
                  break L1;
                }
              }
              L2: {


                if (param0) {

                  stackIn_9_1 = 0;
                  break L2;
                } else {

                  stackIn_9_1 = 1;
                  break L2;
                }
              }
              if (stackIn_6_0 == stackIn_9_1) {
                return;
              } else {
                break L0;
              }
            }
          }
          L3: {
            if (!this.field_d) {
              this.field_b = com.ms.win32.User32.LoadCursor(0, 32512);
              com.ms.dll.Root.alloc(this);
              this.field_d = true;
              break L3;
            } else {
              break L3;
            }
          }
          if (var5 != this.field_c) {
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
              stackIn_31_0 = this;

              if (!param0) {
                stackIn_32_0 = this;
                stackIn_32_1 = 0;
                break L7;
              } else {
                stackIn_32_0 = this;
                stackIn_32_1 = 1;
                break L7;
              }
            }
            ((me) (this)).field_a = stackIn_32_1 != 0;
            com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
            return;
          } else {
            L8: {
              stackIn_18_0 = this;

              if (!param0) {
                stackIn_19_0 = this;
                stackIn_19_1 = 0;
                break L8;
              } else {
                stackIn_19_0 = this;
                stackIn_19_1 = 1;
                break L8;
              }
            }
            ((me) (this)).field_a = stackIn_19_1 != 0;
            com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
            return;
          }
        } else {
          return;
        }
    }

    me() {
        this.field_a = true;
    }
}
