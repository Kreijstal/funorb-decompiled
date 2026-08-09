/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sc extends com.ms.dll.Callback {
    private volatile boolean field_d;
    private int field_c;
    private boolean field_a;
    private volatile int field_e;
    private volatile int field_b;

    final void a(boolean param0, java.awt.Component param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        Throwable var9 = null;
        com.ms.awt.WComponentPeer var10 = null;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        Object stackIn_24_0 = null;
        Object stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        Throwable decompiledCaughtException = null;
        L0: {
          var10 = (com.ms.awt.WComponentPeer) null;
          var5 = -83 / ((0 - param2) / 49);
          var6 = var10.getTopHwnd();
          if (var6 != this.field_e) {
            break L0;
          } else {
            if (this.field_d == param0) {
              return;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (!this.field_a) {
            this.field_c = com.ms.win32.User32.LoadCursor(0, 32512);
            com.ms.dll.Root.alloc(this);
            this.field_a = true;
            break L1;
          } else {
            break L1;
          }
        }
        if (this.field_e == var6) {
          L2: {
            stackIn_24_0 = this;

            if (!param0) {
              stackIn_25_0 = this;
              stackIn_25_1 = 0;
              break L2;
            } else {
              stackIn_25_0 = this;
              stackIn_25_1 = 1;
              break L2;
            }
          }
          ((sc) (this)).field_d = stackIn_25_1 != 0;
          com.ms.win32.User32.SendMessage(var6, 101024, 0, 0);
          return;
        } else {
          L3: {
            if (this.field_e == 0) {
              break L3;
            } else {
              this.field_d = true;
              com.ms.win32.User32.SendMessage(var6, 101024, 0, 0);
              var7 = this;
              synchronized (var7) {
                L4: {
                  com.ms.win32.User32.SetWindowLong(this.field_e, -4, this.field_b);
                  break L4;
                }
              }
              break L3;
            }
          }
          var7 = this;
          synchronized (var7) {
            L5: {
              this.field_e = var6;
              this.field_b = com.ms.win32.User32.SetWindowLong(this.field_e, -4, this);
              break L5;
            }
          }
          L6: {
            stackIn_18_0 = this;

            if (!param0) {
              stackIn_19_0 = this;
              stackIn_19_1 = 0;
              break L6;
            } else {
              stackIn_19_0 = this;
              stackIn_19_1 = 1;
              break L6;
            }
          }
          ((sc) (this)).field_d = stackIn_19_1 != 0;
          com.ms.win32.User32.SendMessage(var6, 101024, 0, 0);
          return;
        }
    }

    final void a(int param0, boolean param1, int param2) {
        com.ms.win32.User32.SetCursorPos(param2, param0);
        if (!param1) {
            this.field_b = 108;
        }
    }

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int stackIn_8_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_23_0 = 0;
        int var5;
        if (this.field_e == param0) {
          if ((param1 ^ -1) == -33) {
            var5 = param3 & 65535;
            if ((var5 ^ -1) != -2) {
              if ((param1 ^ -1) == -101025) {
                L0: {
                  if (!this.field_d) {
                    stackIn_23_0 = 0;
                    break L0;
                  } else {
                    stackIn_23_0 = this.field_c;
                    break L0;
                  }
                }
                com.ms.win32.User32.SetCursor(stackIn_23_0);
                return 0;
              } else {
                if (1 == param1) {
                  this.field_e = 0;
                  this.field_d = true;
                  return com.ms.win32.User32.CallWindowProc(this.field_b, param0, param1, param2, param3);
                } else {
                  return com.ms.win32.User32.CallWindowProc(this.field_b, param0, param1, param2, param3);
                }
              }
            } else {
              L1: {
                if (this.field_d) {
                  stackIn_17_0 = this.field_c;
                  break L1;
                } else {
                  stackIn_17_0 = 0;
                  break L1;
                }
              }
              com.ms.win32.User32.SetCursor(stackIn_17_0);
              return 0;
            }
          } else {
            if ((param1 ^ -1) == -101025) {
              L2: {
                if (!this.field_d) {
                  stackIn_8_0 = 0;
                  break L2;
                } else {
                  stackIn_8_0 = this.field_c;
                  break L2;
                }
              }
              com.ms.win32.User32.SetCursor(stackIn_8_0);
              return 0;
            } else {
              if (1 == param1) {
                this.field_e = 0;
                this.field_d = true;
                return com.ms.win32.User32.CallWindowProc(this.field_b, param0, param1, param2, param3);
              } else {
                return com.ms.win32.User32.CallWindowProc(this.field_b, param0, param1, param2, param3);
              }
            }
          }
        } else {
          var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
          return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        }
    }

    sc() {
        this.field_d = true;
    }
}
