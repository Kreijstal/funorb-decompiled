/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class in extends com.ms.dll.Callback {
    private volatile boolean field_a;
    private volatile int field_e;
    private volatile int field_b;
    private boolean field_c;
    private int field_d;

    final void a(int param0, int param1, int param2) {
        boolean discarded$0 = false;
        if (param1 != -4) {
            this.field_c = false;
            discarded$0 = com.ms.win32.User32.SetCursorPos(param2, param0);
            return;
        }
        boolean discarded$1 = com.ms.win32.User32.SetCursorPos(param2, param0);
    }

    final void a(java.awt.Component param0, int param1, boolean param2) {
        int discarded$42 = 0;
        int discarded$43 = 0;
        int discarded$44 = 0;
        int discarded$45 = 0;
        int discarded$46 = 0;
        int var5 = 0;
        Object var6 = null;
        Throwable var7 = null;
        Throwable var8 = null;
        com.ms.awt.WComponentPeer var9 = null;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        Object stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        Object stackIn_24_0 = null;
        Object stackIn_25_0 = null;
        Object stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_23_0 = null;
        Object stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        Object stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        Object stackOut_17_0 = null;
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        L0: {
          var9 = (com.ms.awt.WComponentPeer) null;
          var5 = var9.getTopHwnd();
          if (this.field_e != var5) {
            break L0;
          } else {
            if (this.field_a == param2) {
              return;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (!this.field_c) {
            this.field_d = com.ms.win32.User32.LoadCursor(0, 32512);
            discarded$42 = com.ms.dll.Root.alloc(this);
            this.field_c = true;
            break L1;
          } else {
            break L1;
          }
        }
        if (this.field_e == var5) {
          L2: {
            stackOut_23_0 = this;
            stackIn_25_0 = stackOut_23_0;
            stackIn_24_0 = stackOut_23_0;
            if (!param2) {
              stackOut_25_0 = this;
              stackOut_25_1 = 0;
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              break L2;
            } else {
              stackOut_24_0 = this;
              stackOut_24_1 = 1;
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              break L2;
            }
          }
          ((in) (this)).field_a = stackIn_26_1 != 0;
          discarded$43 = com.ms.win32.User32.SendMessage(var5, 101024, param1, 0);
          return;
        } else {
          L3: {
            if (this.field_e != 0) {
              this.field_a = true;
              discarded$44 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
              var6 = this;
              synchronized (var6) {
                L4: {
                  discarded$45 = com.ms.win32.User32.SetWindowLong(this.field_e, -4, this.field_b);
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
            stackOut_17_0 = this;
            stackIn_19_0 = stackOut_17_0;
            stackIn_18_0 = stackOut_17_0;
            if (!param2) {
              stackOut_19_0 = this;
              stackOut_19_1 = 0;
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              break L6;
            } else {
              stackOut_18_0 = this;
              stackOut_18_1 = 1;
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              break L6;
            }
          }
          ((in) (this)).field_a = stackIn_20_1 != 0;
          discarded$46 = com.ms.win32.User32.SendMessage(var5, 101024, param1, 0);
          return;
        }
    }

    in() {
        this.field_a = true;
    }

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int discarded$3 = 0;
        int discarded$4 = 0;
        int discarded$5 = 0;
        int var5 = 0;
        int stackIn_8_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        if (param0 != this.field_e) {
          var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
          return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        } else {
          if (param1 == 32) {
            var5 = param3 & 65535;
            if (1 != var5) {
              if (param1 != 101024) {
                if (param1 == 1) {
                  this.field_e = 0;
                  this.field_a = true;
                  return com.ms.win32.User32.CallWindowProc(this.field_b, param0, param1, param2, param3);
                } else {
                  return com.ms.win32.User32.CallWindowProc(this.field_b, param0, param1, param2, param3);
                }
              } else {
                L0: {
                  if (!this.field_a) {
                    stackOut_21_0 = 0;
                    stackIn_22_0 = stackOut_21_0;
                    break L0;
                  } else {
                    stackOut_20_0 = this.field_d;
                    stackIn_22_0 = stackOut_20_0;
                    break L0;
                  }
                }
                discarded$3 = com.ms.win32.User32.SetCursor(stackIn_22_0);
                return 0;
              }
            } else {
              L1: {
                if (this.field_a) {
                  stackOut_16_0 = this.field_d;
                  stackIn_17_0 = stackOut_16_0;
                  break L1;
                } else {
                  stackOut_15_0 = 0;
                  stackIn_17_0 = stackOut_15_0;
                  break L1;
                }
              }
              discarded$4 = com.ms.win32.User32.SetCursor(stackIn_17_0);
              return 0;
            }
          } else {
            if (param1 != 101024) {
              if (param1 == 1) {
                this.field_e = 0;
                this.field_a = true;
                return com.ms.win32.User32.CallWindowProc(this.field_b, param0, param1, param2, param3);
              } else {
                return com.ms.win32.User32.CallWindowProc(this.field_b, param0, param1, param2, param3);
              }
            } else {
              L2: {
                if (!this.field_a) {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  break L2;
                } else {
                  stackOut_6_0 = this.field_d;
                  stackIn_8_0 = stackOut_6_0;
                  break L2;
                }
              }
              discarded$5 = com.ms.win32.User32.SetCursor(stackIn_8_0);
              return 0;
            }
          }
        }
    }
}
