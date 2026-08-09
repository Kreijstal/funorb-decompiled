/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tb extends com.ms.dll.Callback {
    private volatile int field_d;
    private volatile int field_c;
    private volatile boolean field_b;
    private boolean field_e;
    private int field_a;

    final void a(boolean param0, java.awt.Component param1, byte param2) {
        int var5 = 0;
        Object var6 = null;
        Throwable var8 = null;
        com.ms.awt.WComponentPeer var9 = null;
        boolean stackIn_5_0 = false;
        boolean stackIn_6_0 = false;
        int stackIn_6_1 = 0;
        Object stackIn_15_0 = null;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        Object stackIn_28_0 = null;
        Object stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        Throwable decompiledCaughtException = null;
        if (param2 < -19) {
          L0: {
            var9 = (com.ms.awt.WComponentPeer) null;
            var5 = var9.getTopHwnd();
            if (var5 != this.field_c) {
              break L0;
            } else {
              L1: {
                stackIn_5_0 = this.field_b;

                if (param0) {
                  stackIn_6_0 = stackIn_5_0;
                  stackIn_6_1 = 0;
                  break L1;
                } else {
                  stackIn_6_0 = stackIn_5_0;
                  stackIn_6_1 = 1;
                  break L1;
                }
              }
              if ((stackIn_6_0 ? 1 : 0) != stackIn_6_1) {
                return;
              } else {
                break L0;
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
          if (var5 != this.field_c) {
            L3: {
              if (0 != this.field_c) {
                this.field_b = true;
                com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
                var6 = this;
                synchronized (var6) {
                  L4: {
                    com.ms.win32.User32.SetWindowLong(this.field_c, -4, this.field_d);
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
                this.field_c = var5;
                this.field_d = com.ms.win32.User32.SetWindowLong(this.field_c, -4, this);
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
            ((tb) (this)).field_b = stackIn_29_1 != 0;
            com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
            return;
          } else {
            L7: {
              stackIn_15_0 = this;

              if (!param0) {
                stackIn_16_0 = this;
                stackIn_16_1 = 0;
                break L7;
              } else {
                stackIn_16_0 = this;
                stackIn_16_1 = 1;
                break L7;
              }
            }
            ((tb) (this)).field_b = stackIn_16_1 != 0;
            com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
            return;
          }
        } else {
          return;
        }
    }

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int stackIn_12_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_27_0 = 0;
        int var5;
        if (param0 != this.field_c) {
          var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
          return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        } else {
          if (32 == param1) {
            var5 = 65535 & param3;
            if (-2 != (var5 ^ -1)) {
              if (param1 == 101024) {
                L0: {
                  if (this.field_b) {
                    stackIn_27_0 = this.field_a;
                    break L0;
                  } else {
                    stackIn_27_0 = 0;
                    break L0;
                  }
                }
                com.ms.win32.User32.SetCursor(stackIn_27_0);
                return 0;
              } else {
                L1: {
                  if (param1 == 1) {
                    this.field_c = 0;
                    this.field_b = true;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                return com.ms.win32.User32.CallWindowProc(this.field_d, param0, param1, param2, param3);
              }
            } else {
              L2: {
                if (this.field_b) {
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
                if (this.field_b) {
                  stackIn_12_0 = this.field_a;
                  break L3;
                } else {
                  stackIn_12_0 = 0;
                  break L3;
                }
              }
              com.ms.win32.User32.SetCursor(stackIn_12_0);
              return 0;
            } else {
              L4: {
                if (param1 == 1) {
                  this.field_c = 0;
                  this.field_b = true;
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
        com.ms.win32.User32.SetCursorPos(param0, param1);
        if (param2 != 0) {
            java.awt.Component var5 = (java.awt.Component) null;
            this.a(true, (java.awt.Component) null, (byte) 63);
        }
    }

    tb() {
        this.field_b = true;
    }
}
