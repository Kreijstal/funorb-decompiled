/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qj extends com.ms.dll.Callback {
    private volatile int field_b;
    private volatile boolean field_d;
    private boolean field_c;
    private volatile int field_a;
    private int field_e;

    final void a(int param0, int param1, int param2) {
        if (param0 != 0) {
            this.field_a = -126;
            com.ms.win32.User32.SetCursorPos(param1, param2);
            return;
        }
        com.ms.win32.User32.SetCursorPos(param1, param2);
    }

    final void a(boolean param0, int param1, java.awt.Component param2) {
        int stackIn_6_0 = 0;
        int stackIn_9_1 = 0;
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
        if (param1 <= -34) {
          L0: {
            var9 = (com.ms.awt.WComponentPeer) null;
            var5 = var9.getTopHwnd();
            if (var5 != this.field_a) {
              break L0;
            } else {
              L1: {
                if (param0) {
                  stackIn_6_0 = 0;
                  break L1;
                } else {
                  stackIn_6_0 = 1;
                  break L1;
                }
              }
              L2: {


                if (this.field_d) {

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
            if (this.field_c) {
              break L3;
            } else {
              this.field_e = com.ms.win32.User32.LoadCursor(0, 32512);
              com.ms.dll.Root.alloc(this);
              this.field_c = true;
              break L3;
            }
          }
          if (var5 != this.field_a) {
            L4: {
              if (0 != this.field_a) {
                this.field_d = true;
                com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
                var6 = this;
                synchronized (var6) {
                  L5: {
                    com.ms.win32.User32.SetWindowLong(this.field_a, -4, this.field_b);
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
                this.field_b = com.ms.win32.User32.SetWindowLong(this.field_a, -4, this);
                break L6;
              }
            }
            L7: {
              stackIn_30_0 = this;

              if (!param0) {
                stackIn_31_0 = this;
                stackIn_31_1 = 0;
                break L7;
              } else {
                stackIn_31_0 = this;
                stackIn_31_1 = 1;
                break L7;
              }
            }
            ((qj) (this)).field_d = stackIn_31_1 != 0;
            com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
            return;
          } else {
            L8: {
              stackIn_17_0 = this;

              if (!param0) {
                stackIn_18_0 = this;
                stackIn_18_1 = 0;
                break L8;
              } else {
                stackIn_18_0 = this;
                stackIn_18_1 = 1;
                break L8;
              }
            }
            ((qj) (this)).field_d = stackIn_18_1 != 0;
            com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
            return;
          }
        } else {
          return;
        }
    }

    qj() {
        this.field_d = true;
    }

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int var5;
        int stackIn_9_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_24_0 = 0;
        if (this.field_a != param0) {
          var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
          return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        } else {
          if (param1 == 32) {
            var5 = 65535 & param3;
            if (-2 != (var5 ^ -1)) {
              if ((param1 ^ -1) == -101025) {
                L0: {
                  if (!this.field_d) {
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
                L1: {
                  if ((param1 ^ -1) == -2) {
                    this.field_a = 0;
                    this.field_d = true;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                return com.ms.win32.User32.CallWindowProc(this.field_b, param0, param1, param2, param3);
              }
            } else {
              L2: {
                if (!this.field_d) {
                  stackIn_18_0 = 0;
                  break L2;
                } else {
                  stackIn_18_0 = this.field_e;
                  break L2;
                }
              }
              com.ms.win32.User32.SetCursor(stackIn_18_0);
              return 0;
            }
          } else {
            if ((param1 ^ -1) == -101025) {
              L3: {
                if (!this.field_d) {
                  stackIn_9_0 = 0;
                  break L3;
                } else {
                  stackIn_9_0 = this.field_e;
                  break L3;
                }
              }
              com.ms.win32.User32.SetCursor(stackIn_9_0);
              return 0;
            } else {
              L4: {
                if ((param1 ^ -1) == -2) {
                  this.field_a = 0;
                  this.field_d = true;
                  break L4;
                } else {
                  break L4;
                }
              }
              return com.ms.win32.User32.CallWindowProc(this.field_b, param0, param1, param2, param3);
            }
          }
        }
    }
}
