/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uk extends com.ms.dll.Callback {
    private volatile int field_c;
    private volatile int field_a;
    private int field_d;
    private boolean field_b;
    private volatile boolean field_e;

    final void a(java.awt.Component param0, int param1, boolean param2) {
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
        Object stackIn_23_0 = null;
        Object stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        Throwable decompiledCaughtException = null;
        L0: {
          var9 = (com.ms.awt.WComponentPeer) null;
          var5 = var9.getTopHwnd();
          if (var5 != this.field_a) {
            break L0;
          } else {
            L1: {
              stackIn_3_0 = param2;

              if (this.field_e) {
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
        if (var5 != this.field_a) {
          L3: {
            if (0 == this.field_a) {
              break L3;
            } else {
              this.field_e = true;
              com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
              var6 = this;
              synchronized (var6) {
                L4: {
                  com.ms.win32.User32.SetWindowLong(this.field_a, -4, this.field_c);
                  break L4;
                }
              }
              break L3;
            }
          }
          var6 = this;
          synchronized (var6) {
            L5: {
              this.field_a = var5;
              this.field_c = com.ms.win32.User32.SetWindowLong(this.field_a, -4, this);
              break L5;
            }
          }
          L6: {
            stackIn_23_0 = this;

            if (!param2) {
              stackIn_24_0 = this;
              stackIn_24_1 = 0;
              break L6;
            } else {
              stackIn_24_0 = this;
              stackIn_24_1 = 1;
              break L6;
            }
          }
          ((uk) (this)).field_e = stackIn_24_1 != 0;
          com.ms.win32.User32.SendMessage(var5, 101024, 0, param1);
          return;
        } else {
          L7: {
            stackIn_11_0 = this;

            if (!param2) {
              stackIn_12_0 = this;
              stackIn_12_1 = 0;
              break L7;
            } else {
              stackIn_12_0 = this;
              stackIn_12_1 = 1;
              break L7;
            }
          }
          ((uk) (this)).field_e = stackIn_12_1 != 0;
          com.ms.win32.User32.SendMessage(var5, 101024, 0, param1);
          return;
        }
    }

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int stackIn_9_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_24_0 = 0;
        int var5;
        if (param0 != this.field_a) {
          var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
          return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        } else {
          if (param1 == 32) {
            var5 = 65535 & param3;
            if (1 != var5) {
              if (101024 == param1) {
                L0: {
                  if (!this.field_e) {
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
                if (param1 == 1) {
                  this.field_a = 0;
                  this.field_e = true;
                  return com.ms.win32.User32.CallWindowProc(this.field_c, param0, param1, param2, param3);
                } else {
                  return com.ms.win32.User32.CallWindowProc(this.field_c, param0, param1, param2, param3);
                }
              }
            } else {
              L1: {
                if (this.field_e) {
                  stackIn_18_0 = this.field_d;
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
                if (!this.field_e) {
                  stackIn_9_0 = 0;
                  break L2;
                } else {
                  stackIn_9_0 = this.field_d;
                  break L2;
                }
              }
              com.ms.win32.User32.SetCursor(stackIn_9_0);
              return 0;
            } else {
              if (param1 == 1) {
                this.field_a = 0;
                this.field_e = true;
                return com.ms.win32.User32.CallWindowProc(this.field_c, param0, param1, param2, param3);
              } else {
                return com.ms.win32.User32.CallWindowProc(this.field_c, param0, param1, param2, param3);
              }
            }
          }
        }
    }

    final void a(int param0, int param1, int param2) {
        com.ms.win32.User32.SetCursorPos(param2, param0);
        if (param1 != -4) {
            this.field_b = true;
        }
    }

    uk() {
        this.field_e = true;
    }
}
