/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ki extends com.ms.dll.Callback {
    private volatile boolean field_d;
    private volatile int field_b;
    private boolean field_e;
    private volatile int field_c;
    private int field_a;

    final void a(int param0, int param1, int param2) {
        com.ms.win32.User32.SetCursorPos(param1, param2);
        if (param0 != -1340) {
            java.awt.Component var5 = (java.awt.Component) null;
            this.a((java.awt.Component) null, 25, true);
        }
    }

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int stackIn_8_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_22_0 = 0;
        int var5;
        if (this.field_b != param0) {
          var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
          return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        } else {
          if (param1 == 32) {
            var5 = param3 & 65535;
            if (1 != var5) {
              if (101024 != param1) {
                if (param1 == 1) {
                  this.field_b = 0;
                  this.field_d = true;
                  return com.ms.win32.User32.CallWindowProc(this.field_c, param0, param1, param2, param3);
                } else {
                  return com.ms.win32.User32.CallWindowProc(this.field_c, param0, param1, param2, param3);
                }
              } else {
                L0: {
                  if (!this.field_d) {
                    stackIn_22_0 = 0;
                    break L0;
                  } else {
                    stackIn_22_0 = this.field_a;
                    break L0;
                  }
                }
                com.ms.win32.User32.SetCursor(stackIn_22_0);
                return 0;
              }
            } else {
              L1: {
                if (!this.field_d) {
                  stackIn_17_0 = 0;
                  break L1;
                } else {
                  stackIn_17_0 = this.field_a;
                  break L1;
                }
              }
              com.ms.win32.User32.SetCursor(stackIn_17_0);
              return 0;
            }
          } else {
            if (101024 != param1) {
              if (param1 == 1) {
                this.field_b = 0;
                this.field_d = true;
                return com.ms.win32.User32.CallWindowProc(this.field_c, param0, param1, param2, param3);
              } else {
                return com.ms.win32.User32.CallWindowProc(this.field_c, param0, param1, param2, param3);
              }
            } else {
              L2: {
                if (!this.field_d) {
                  stackIn_8_0 = 0;
                  break L2;
                } else {
                  stackIn_8_0 = this.field_a;
                  break L2;
                }
              }
              com.ms.win32.User32.SetCursor(stackIn_8_0);
              return 0;
            }
          }
        }
    }

    final void a(java.awt.Component param0, int param1, boolean param2) {
        boolean stackIn_3_0 = false;
        boolean stackIn_4_0 = false;
        int stackIn_4_1 = 0;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        Object stackIn_25_0 = null;
        Object stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        Throwable decompiledCaughtException = null;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        com.ms.awt.WComponentPeer var10 = null;
        L0: {
          var5 = -126 % ((-37 - param1) / 58);
          var10 = (com.ms.awt.WComponentPeer) null;
          var6 = var10.getTopHwnd();
          if (var6 != this.field_b) {
            break L0;
          } else {
            L1: {
              stackIn_3_0 = param2;

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
            if ((stackIn_4_0 ? 1 : 0) == stackIn_4_1) {
              break L0;
            } else {
              return;
            }
          }
        }
        L2: {
          if (!this.field_e) {
            this.field_a = com.ms.win32.User32.LoadCursor(0, 32512);
            com.ms.dll.Root.alloc(this);
            this.field_e = true;
            break L2;
          } else {
            break L2;
          }
        }
        if (this.field_b != var6) {
          L3: {
            if (this.field_b != 0) {
              this.field_d = true;
              com.ms.win32.User32.SendMessage(var6, 101024, 0, 0);
              var7 = this;
              synchronized (var7) {
                L4: {
                  com.ms.win32.User32.SetWindowLong(this.field_b, -4, this.field_c);
                  break L4;
                }
              }
              break L3;
            } else {
              break L3;
            }
          }
          var7 = this;
          synchronized (var7) {
            L5: {
              this.field_b = var6;
              this.field_c = com.ms.win32.User32.SetWindowLong(this.field_b, -4, this);
              break L5;
            }
          }
          L6: {
            stackIn_25_0 = this;

            if (!param2) {
              stackIn_26_0 = this;
              stackIn_26_1 = 0;
              break L6;
            } else {
              stackIn_26_0 = this;
              stackIn_26_1 = 1;
              break L6;
            }
          }
          ((ki) (this)).field_d = stackIn_26_1 != 0;
          com.ms.win32.User32.SendMessage(var6, 101024, 0, 0);
          return;
        } else {
          L7: {
            stackIn_12_0 = this;

            if (!param2) {
              stackIn_13_0 = this;
              stackIn_13_1 = 0;
              break L7;
            } else {
              stackIn_13_0 = this;
              stackIn_13_1 = 1;
              break L7;
            }
          }
          ((ki) (this)).field_d = stackIn_13_1 != 0;
          com.ms.win32.User32.SendMessage(var6, 101024, 0, 0);
          return;
        }
    }

    ki() {
        this.field_d = true;
    }
}
