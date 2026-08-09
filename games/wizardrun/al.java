/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class al extends com.ms.dll.Callback {
    private int field_d;
    private volatile int field_e;
    private volatile boolean field_b;
    private boolean field_c;
    private volatile int field_a;

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int stackIn_12_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_27_0 = 0;
        int var5;
        if (param0 != this.field_a) {
          var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
          return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        } else {
          if (param1 == 32) {
            var5 = 65535 & param3;
            if (1 != var5) {
              if (-101025 == (param1 ^ -1)) {
                L0: {
                  if (this.field_b) {
                    stackIn_27_0 = this.field_d;
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
                  if (1 == param1) {
                    this.field_a = 0;
                    this.field_b = true;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                return com.ms.win32.User32.CallWindowProc(this.field_e, param0, param1, param2, param3);
              }
            } else {
              L2: {
                if (!this.field_b) {
                  stackIn_18_0 = 0;
                  break L2;
                } else {
                  stackIn_18_0 = this.field_d;
                  break L2;
                }
              }
              com.ms.win32.User32.SetCursor(stackIn_18_0);
              return 0;
            }
          } else {
            if (-101025 == (param1 ^ -1)) {
              L3: {
                if (this.field_b) {
                  stackIn_12_0 = this.field_d;
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
                if (1 == param1) {
                  this.field_a = 0;
                  this.field_b = true;
                  break L4;
                } else {
                  break L4;
                }
              }
              return com.ms.win32.User32.CallWindowProc(this.field_e, param0, param1, param2, param3);
            }
          }
        }
    }

    final void a(int param0, boolean param1, java.awt.Component param2) {
        int var5 = 0;
        Object var6 = null;
        Throwable var8 = null;
        com.ms.awt.WComponentPeer var9 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_1 = 0;
        Object stackIn_25_0 = null;
        Object stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        Object stackIn_31_0 = null;
        Object stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        Throwable decompiledCaughtException = null;
        L0: {
          var9 = (com.ms.awt.WComponentPeer) null;
          var5 = var9.getTopHwnd();
          if (this.field_a != var5) {
            break L0;
          } else {
            L1: {
              if (this.field_b) {
                stackIn_4_0 = 0;
                break L1;
              } else {
                stackIn_4_0 = 1;
                break L1;
              }
            }
            L2: {


              if (param1) {

                stackIn_7_1 = 0;
                break L2;
              } else {

                stackIn_7_1 = 1;
                break L2;
              }
            }
            if (stackIn_4_0 == stackIn_7_1) {
              return;
            } else {
              break L0;
            }
          }
        }
        L3: {
          if (!this.field_c) {
            this.field_d = com.ms.win32.User32.LoadCursor(0, 32512);
            com.ms.dll.Root.alloc(this);
            this.field_c = true;
            break L3;
          } else {
            break L3;
          }
        }
        if (var5 == this.field_a) {
          L4: {
            stackIn_31_0 = this;

            if (!param1) {
              stackIn_32_0 = this;
              stackIn_32_1 = 0;
              break L4;
            } else {
              stackIn_32_0 = this;
              stackIn_32_1 = 1;
              break L4;
            }
          }
          ((al) (this)).field_b = stackIn_32_1 != 0;
          com.ms.win32.User32.SendMessage(var5, 101024, 0, param0);
          return;
        } else {
          L5: {
            if (this.field_a != 0) {
              this.field_b = true;
              com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
              var6 = this;
              synchronized (var6) {
                L6: {
                  com.ms.win32.User32.SetWindowLong(this.field_a, -4, this.field_e);
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
              this.field_e = com.ms.win32.User32.SetWindowLong(this.field_a, -4, this);
              break L7;
            }
          }
          L8: {
            stackIn_25_0 = this;

            if (!param1) {
              stackIn_26_0 = this;
              stackIn_26_1 = 0;
              break L8;
            } else {
              stackIn_26_0 = this;
              stackIn_26_1 = 1;
              break L8;
            }
          }
          ((al) (this)).field_b = stackIn_26_1 != 0;
          com.ms.win32.User32.SendMessage(var5, 101024, 0, param0);
          return;
        }
    }

    al() {
        this.field_b = true;
    }

    final void a(int param0, int param1, byte param2) {
        com.ms.win32.User32.SetCursorPos(param0, param1);
        if (param2 != 116) {
            this.a(-41, -9, (byte) 0);
        }
    }
}
