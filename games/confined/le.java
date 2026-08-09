/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class le extends com.ms.dll.Callback {
    private volatile int field_b;
    private volatile boolean field_d;
    private boolean field_a;
    private int field_c;
    private volatile int field_e;

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int var5;
        int stackIn_9_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_24_0 = 0;
        if (this.field_e != param0) {
          var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
          return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        } else {
          if (-33 == (param1 ^ -1)) {
            var5 = param3 & 65535;
            if (var5 != 1) {
              if (-101025 == (param1 ^ -1)) {
                L0: {
                  if (this.field_d) {
                    stackIn_24_0 = this.field_c;
                    break L0;
                  } else {
                    stackIn_24_0 = 0;
                    break L0;
                  }
                }
                com.ms.win32.User32.SetCursor(stackIn_24_0);
                return 0;
              } else {
                L1: {
                  if (param1 == 1) {
                    this.field_e = 0;
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
                  stackIn_18_0 = this.field_c;
                  break L2;
                }
              }
              com.ms.win32.User32.SetCursor(stackIn_18_0);
              return 0;
            }
          } else {
            if (-101025 == (param1 ^ -1)) {
              L3: {
                if (this.field_d) {
                  stackIn_9_0 = this.field_c;
                  break L3;
                } else {
                  stackIn_9_0 = 0;
                  break L3;
                }
              }
              com.ms.win32.User32.SetCursor(stackIn_9_0);
              return 0;
            } else {
              L4: {
                if (param1 == 1) {
                  this.field_e = 0;
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

    final void a(byte param0, java.awt.Component param1, boolean param2) {
        int stackIn_4_0 = 0;
        Object stackIn_15_0 = null;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        Object stackIn_30_0 = null;
        Object stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        Throwable decompiledCaughtException = null;
        int var5 = 0;
        Object var6 = null;
        com.ms.awt.WComponentPeer var9 = null;
        L0: {
          var9 = (com.ms.awt.WComponentPeer) null;
          var5 = var9.getTopHwnd();
          if (this.field_e != var5) {
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
            if (stackIn_4_0 != (this.field_d ? 1 : 0)) {
              return;
            } else {
              break L0;
            }
          }
        }
        L2: {
          if (!this.field_a) {
            this.field_c = com.ms.win32.User32.LoadCursor(0, 32512);
            com.ms.dll.Root.alloc(this);
            this.field_a = true;
            break L2;
          } else {
            break L2;
          }
        }
        if (var5 != this.field_e) {
          L3: {
            if (-1 != (this.field_e ^ -1)) {
              this.field_d = true;
              com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
              var6 = this;
              synchronized (var6) {
                L4: {
                  com.ms.win32.User32.SetWindowLong(this.field_e, -4, this.field_b);
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
              this.field_b = com.ms.win32.User32.SetWindowLong(this.field_e, -4, this);
              break L5;
            }
          }
          L6: {
            if (param0 < -62) {
              break L6;
            } else {
              this.field_c = -104;
              break L6;
            }
          }
          L7: {
            stackIn_30_0 = this;

            if (!param2) {
              stackIn_31_0 = this;
              stackIn_31_1 = 0;
              break L7;
            } else {
              stackIn_31_0 = this;
              stackIn_31_1 = 1;
              break L7;
            }
          }
          ((le) (this)).field_d = stackIn_31_1 != 0;
          com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
          return;
        } else {
          L8: {
            if (param0 < -62) {
              break L8;
            } else {
              this.field_c = -104;
              break L8;
            }
          }
          L9: {
            stackIn_15_0 = this;

            if (!param2) {
              stackIn_16_0 = this;
              stackIn_16_1 = 0;
              break L9;
            } else {
              stackIn_16_0 = this;
              stackIn_16_1 = 1;
              break L9;
            }
          }
          ((le) (this)).field_d = stackIn_16_1 != 0;
          com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
          return;
        }
    }

    final void a(byte param0, int param1, int param2) {
        com.ms.win32.User32.SetCursorPos(param1, param2);
        int var4 = -121 / ((param0 - -50) / 38);
    }

    le() {
        this.field_d = true;
    }
}
