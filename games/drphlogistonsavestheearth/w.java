/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class w extends com.ms.dll.Callback {
    private boolean field_e;
    private volatile int field_a;
    private volatile boolean field_c;
    private int field_b;
    private volatile int field_d;

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int stackIn_12_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_27_0 = 0;
        int var5;
        if (param0 != this.field_a) {
          var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
          return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        } else {
          if ((param1 ^ -1) == -33) {
            var5 = 65535 & param3;
            if (1 != var5) {
              if (101024 == param1) {
                L0: {
                  if (!this.field_c) {
                    stackIn_27_0 = 0;
                    break L0;
                  } else {
                    stackIn_27_0 = this.field_b;
                    break L0;
                  }
                }
                com.ms.win32.User32.SetCursor(stackIn_27_0);
                return 0;
              } else {
                L1: {
                  if ((param1 ^ -1) == -2) {
                    this.field_a = 0;
                    this.field_c = true;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                return com.ms.win32.User32.CallWindowProc(this.field_d, param0, param1, param2, param3);
              }
            } else {
              L2: {
                if (!this.field_c) {
                  stackIn_18_0 = 0;
                  break L2;
                } else {
                  stackIn_18_0 = this.field_b;
                  break L2;
                }
              }
              com.ms.win32.User32.SetCursor(stackIn_18_0);
              return 0;
            }
          } else {
            if (101024 == param1) {
              L3: {
                if (!this.field_c) {
                  stackIn_12_0 = 0;
                  break L3;
                } else {
                  stackIn_12_0 = this.field_b;
                  break L3;
                }
              }
              com.ms.win32.User32.SetCursor(stackIn_12_0);
              return 0;
            } else {
              L4: {
                if ((param1 ^ -1) == -2) {
                  this.field_a = 0;
                  this.field_c = true;
                  break L4;
                } else {
                  break L4;
                }
              }
              return com.ms.win32.User32.CallWindowProc(this.field_d, param0, param1, param2, param3);
            }
          }
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param1 != 1) {
            return;
        }
        com.ms.win32.User32.SetCursorPos(param0, param2);
    }

    final void a(byte param0, java.awt.Component param1, boolean param2) {
        boolean stackIn_3_0 = false;
        boolean stackIn_4_0 = false;
        int stackIn_4_1 = 0;
        Object stackIn_24_0 = null;
        Object stackIn_25_0 = null;
        int stackIn_25_1 = 0;
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
          if (this.field_a != var5) {
            break L0;
          } else {
            L1: {
              stackIn_3_0 = param2;

              if (this.field_c) {
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
          if (param0 < -39) {
            break L2;
          } else {
            this.field_d = 44;
            break L2;
          }
        }
        L3: {
          if (!this.field_e) {
            this.field_b = com.ms.win32.User32.LoadCursor(0, 32512);
            com.ms.dll.Root.alloc(this);
            this.field_e = true;
            break L3;
          } else {
            break L3;
          }
        }
        if (this.field_a == var5) {
          L4: {
            stackIn_30_0 = this;

            if (!param2) {
              stackIn_31_0 = this;
              stackIn_31_1 = 0;
              break L4;
            } else {
              stackIn_31_0 = this;
              stackIn_31_1 = 1;
              break L4;
            }
          }
          ((w) (this)).field_c = stackIn_31_1 != 0;
          com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
          return;
        } else {
          L5: {
            if (-1 != (this.field_a ^ -1)) {
              this.field_c = true;
              com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
              var6 = this;
              synchronized (var6) {
                L6: {
                  com.ms.win32.User32.SetWindowLong(this.field_a, -4, this.field_d);
                  break L6;
                }
              }
              break L5;
            } else {
              break L5;
            }
          }
          var6 = this;
          synchronized (var6) {
            L7: {
              this.field_a = var5;
              this.field_d = com.ms.win32.User32.SetWindowLong(this.field_a, -4, this);
              break L7;
            }
          }
          L8: {
            stackIn_24_0 = this;

            if (!param2) {
              stackIn_25_0 = this;
              stackIn_25_1 = 0;
              break L8;
            } else {
              stackIn_25_0 = this;
              stackIn_25_1 = 1;
              break L8;
            }
          }
          ((w) (this)).field_c = stackIn_25_1 != 0;
          com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
          return;
        }
    }

    w() {
        this.field_c = true;
    }
}
