/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fl extends com.ms.dll.Callback {
    private boolean field_c;
    private volatile int field_a;
    private volatile int field_b;
    private int field_e;
    private volatile boolean field_d;

    final void a(int param0, java.awt.Component param1, boolean param2) {
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackIn_24_0 = null;
        Object stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        Throwable decompiledCaughtException = null;
        int var5 = 0;
        Object var6 = null;
        com.ms.awt.WComponentPeer var9 = null;
        L0: {
          var9 = (com.ms.awt.WComponentPeer) null;
          var5 = var9.getTopHwnd();
          if (this.field_b != var5) {
            break L0;
          } else {
            if (this.field_d == param2) {
              return;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (this.field_c) {
            break L1;
          } else {
            this.field_e = com.ms.win32.User32.LoadCursor(0, 32512);
            com.ms.dll.Root.alloc(this);
            this.field_c = true;
            break L1;
          }
        }
        if (this.field_b != var5) {
          L2: {
            if (-1 != (this.field_b ^ -1)) {
              this.field_d = true;
              com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
              var6 = this;
              synchronized (var6) {
                L3: {
                  com.ms.win32.User32.SetWindowLong(this.field_b, -4, this.field_a);
                  break L3;
                }
              }
              break L2;
            } else {
              break L2;
            }
          }
          var6 = this;
          synchronized (var6) {
            L4: {
              this.field_b = var5;
              this.field_a = com.ms.win32.User32.SetWindowLong(this.field_b, -4, this);
              break L4;
            }
          }
          L5: {
            stackIn_24_0 = this;

            if (!param2) {
              stackIn_25_0 = this;
              stackIn_25_1 = 0;
              break L5;
            } else {
              stackIn_25_0 = this;
              stackIn_25_1 = 1;
              break L5;
            }
          }
          L6: {
            ((fl) (this)).field_d = stackIn_25_1 != 0;
            com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
            if (param0 == 11333) {
              break L6;
            } else {
              this.a(-21, (byte) -73, -121);
              break L6;
            }
          }
          return;
        } else {
          L7: {
            stackIn_9_0 = this;

            if (!param2) {
              stackIn_10_0 = this;
              stackIn_10_1 = 0;
              break L7;
            } else {
              stackIn_10_0 = this;
              stackIn_10_1 = 1;
              break L7;
            }
          }
          L8: {
            ((fl) (this)).field_d = stackIn_10_1 != 0;
            com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
            if (param0 == 11333) {
              break L8;
            } else {
              this.a(-21, (byte) -73, -121);
              break L8;
            }
          }
          return;
        }
    }

    final void a(int param0, byte param1, int param2) {
        com.ms.win32.User32.SetCursorPos(param0, param2);
        if (param1 <= 46) {
            this.field_b = -95;
        }
    }

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int var5;
        int stackIn_8_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_23_0 = 0;
        if (this.field_b == param0) {
          if ((param1 ^ -1) == -33) {
            var5 = param3 & 65535;
            if (-2 != (var5 ^ -1)) {
              if ((param1 ^ -1) == -101025) {
                L0: {
                  if (this.field_d) {
                    stackIn_23_0 = this.field_e;
                    break L0;
                  } else {
                    stackIn_23_0 = 0;
                    break L0;
                  }
                }
                com.ms.win32.User32.SetCursor(stackIn_23_0);
                return 0;
              } else {
                L1: {
                  if (-2 == (param1 ^ -1)) {
                    this.field_b = 0;
                    this.field_d = true;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                return com.ms.win32.User32.CallWindowProc(this.field_a, param0, param1, param2, param3);
              }
            } else {
              L2: {
                if (this.field_d) {
                  stackIn_17_0 = this.field_e;
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
            if ((param1 ^ -1) == -101025) {
              L3: {
                if (this.field_d) {
                  stackIn_8_0 = this.field_e;
                  break L3;
                } else {
                  stackIn_8_0 = 0;
                  break L3;
                }
              }
              com.ms.win32.User32.SetCursor(stackIn_8_0);
              return 0;
            } else {
              L4: {
                if (-2 == (param1 ^ -1)) {
                  this.field_b = 0;
                  this.field_d = true;
                  break L4;
                } else {
                  break L4;
                }
              }
              return com.ms.win32.User32.CallWindowProc(this.field_a, param0, param1, param2, param3);
            }
          }
        } else {
          var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
          return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        }
    }

    fl() {
        this.field_d = true;
    }
}
