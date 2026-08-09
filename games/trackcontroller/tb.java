/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tb extends com.ms.dll.Callback {
    private int field_a;
    private volatile boolean field_e;
    private volatile int field_b;
    private boolean field_d;
    private volatile int field_c;

    final void a(int param0, int param1, int param2) {
        com.ms.win32.User32.SetCursorPos(param1, param2);
        if (param0 != 31942) {
            this.a(81, -77, 10);
        }
    }

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int stackIn_12_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_27_0 = 0;
        int var5;
        if (this.field_c != param0) {
          var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
          return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        } else {
          if (32 == param1) {
            var5 = 65535 & param3;
            if (-2 != (var5 ^ -1)) {
              if (param1 == 101024) {
                L0: {
                  if (!this.field_e) {
                    stackIn_27_0 = 0;
                    break L0;
                  } else {
                    stackIn_27_0 = this.field_a;
                    break L0;
                  }
                }
                com.ms.win32.User32.SetCursor(stackIn_27_0);
                return 0;
              } else {
                L1: {
                  if (param1 == 1) {
                    this.field_c = 0;
                    this.field_e = true;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                return com.ms.win32.User32.CallWindowProc(this.field_b, param0, param1, param2, param3);
              }
            } else {
              L2: {
                if (this.field_e) {
                  stackIn_18_0 = this.field_a;
                  break L2;
                } else {
                  stackIn_18_0 = 0;
                  break L2;
                }
              }
              com.ms.win32.User32.SetCursor(stackIn_18_0);
              return 0;
            }
          } else {
            if (param1 == 101024) {
              L3: {
                if (!this.field_e) {
                  stackIn_12_0 = 0;
                  break L3;
                } else {
                  stackIn_12_0 = this.field_a;
                  break L3;
                }
              }
              com.ms.win32.User32.SetCursor(stackIn_12_0);
              return 0;
            } else {
              L4: {
                if (param1 == 1) {
                  this.field_c = 0;
                  this.field_e = true;
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

    final void a(boolean param0, java.awt.Component param1, int param2) {
        int var5 = 0;
        Object var6 = null;
        Throwable var8 = null;
        com.ms.awt.WComponentPeer var9 = null;
        int stackIn_4_0 = 0;
        Object stackIn_24_0 = null;
        Object stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        Object stackIn_30_0 = null;
        Object stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        Throwable decompiledCaughtException = null;
        L0: {
          var9 = (com.ms.awt.WComponentPeer) null;
          var5 = var9.getTopHwnd();
          if (var5 != this.field_c) {
            break L0;
          } else {
            L1: {
              if (param0) {
                stackIn_4_0 = 0;
                break L1;
              } else {
                stackIn_4_0 = 1;
                break L1;
              }
            }
            if (stackIn_4_0 != (this.field_e ? 1 : 0)) {
              return;
            } else {
              break L0;
            }
          }
        }
        L2: {
          if (!this.field_d) {
            this.field_a = com.ms.win32.User32.LoadCursor(0, 32512);
            com.ms.dll.Root.alloc(this);
            this.field_d = true;
            break L2;
          } else {
            break L2;
          }
        }
        if (param2 == 5745) {
          if (this.field_c == var5) {
            L3: {
              stackIn_30_0 = this;

              if (!param0) {
                stackIn_31_0 = this;
                stackIn_31_1 = 0;
                break L3;
              } else {
                stackIn_31_0 = this;
                stackIn_31_1 = 1;
                break L3;
              }
            }
            ((tb) (this)).field_e = stackIn_31_1 != 0;
            com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
            return;
          } else {
            L4: {
              if (0 != this.field_c) {
                this.field_e = true;
                com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
                var6 = this;
                synchronized (var6) {
                  L5: {
                    com.ms.win32.User32.SetWindowLong(this.field_c, -4, this.field_b);
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
                this.field_b = com.ms.win32.User32.SetWindowLong(this.field_c, -4, this);
                break L6;
              }
            }
            L7: {
              stackIn_24_0 = this;

              if (!param0) {
                stackIn_25_0 = this;
                stackIn_25_1 = 0;
                break L7;
              } else {
                stackIn_25_0 = this;
                stackIn_25_1 = 1;
                break L7;
              }
            }
            ((tb) (this)).field_e = stackIn_25_1 != 0;
            com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
            return;
          }
        } else {
          return;
        }
    }

    tb() {
        this.field_e = true;
    }
}
