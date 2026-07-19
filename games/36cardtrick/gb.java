/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gb extends com.ms.dll.Callback {
    private volatile int field_e;
    private volatile boolean field_c;
    private int field_d;
    private volatile int field_b;
    private boolean field_a;

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int discarded$6 = 0;
        int discarded$7 = 0;
        int discarded$8 = 0;
        int var5 = 0;
        int stackIn_9_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        if (this.field_b != param0) {
          var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
          return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        } else {
          if (-33 == (param1 ^ -1)) {
            var5 = 65535 & param3;
            if (1 != var5) {
              if (param1 == 101024) {
                L0: {
                  if (!this.field_c) {
                    stackOut_23_0 = 0;
                    stackIn_24_0 = stackOut_23_0;
                    break L0;
                  } else {
                    stackOut_22_0 = this.field_d;
                    stackIn_24_0 = stackOut_22_0;
                    break L0;
                  }
                }
                discarded$6 = com.ms.win32.User32.SetCursor(stackIn_24_0);
                return 0;
              } else {
                L1: {
                  if (param1 == 1) {
                    this.field_b = 0;
                    this.field_c = true;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                return com.ms.win32.User32.CallWindowProc(this.field_e, param0, param1, param2, param3);
              }
            } else {
              L2: {
                if (this.field_c) {
                  stackOut_17_0 = this.field_d;
                  stackIn_18_0 = stackOut_17_0;
                  break L2;
                } else {
                  stackOut_16_0 = 0;
                  stackIn_18_0 = stackOut_16_0;
                  break L2;
                }
              }
              discarded$7 = com.ms.win32.User32.SetCursor(stackIn_18_0);
              return 0;
            }
          } else {
            if (param1 == 101024) {
              L3: {
                if (!this.field_c) {
                  stackOut_8_0 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  break L3;
                } else {
                  stackOut_7_0 = this.field_d;
                  stackIn_9_0 = stackOut_7_0;
                  break L3;
                }
              }
              discarded$8 = com.ms.win32.User32.SetCursor(stackIn_9_0);
              return 0;
            } else {
              L4: {
                if (param1 == 1) {
                  this.field_b = 0;
                  this.field_c = true;
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

    final void a(boolean param0, java.awt.Component param1, int param2) {
        int discarded$5 = 0;
        int discarded$6 = 0;
        int discarded$7 = 0;
        int discarded$8 = 0;
        int discarded$9 = 0;
        int var5 = 0;
        Object var6 = null;
        Throwable var7 = null;
        Throwable var8 = null;
        com.ms.awt.WComponentPeer var9 = null;
        int stackIn_6_0 = 0;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        Object stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        Object stackIn_25_0 = null;
        Object stackIn_26_0 = null;
        Object stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        Object stackOut_24_0 = null;
        Object stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        Object stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        Object stackOut_11_0 = null;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        L0: {
          if (param2 == -4) {
            break L0;
          } else {
            this.field_e = 72;
            break L0;
          }
        }
        L1: {
          var9 = (com.ms.awt.WComponentPeer) null;
          var5 = var9.getTopHwnd();
          if (this.field_b != var5) {
            break L1;
          } else {
            L2: {
              if (this.field_c) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L2;
              }
            }
            if (stackIn_6_0 == (param0 ? 1 : 0)) {
              break L1;
            } else {
              return;
            }
          }
        }
        L3: {
          if (this.field_a) {
            break L3;
          } else {
            this.field_d = com.ms.win32.User32.LoadCursor(0, 32512);
            discarded$5 = com.ms.dll.Root.alloc(this);
            this.field_a = true;
            break L3;
          }
        }
        if (var5 != this.field_b) {
          L4: {
            if (0 != this.field_b) {
              this.field_c = true;
              discarded$6 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
              var6 = this;
              synchronized (var6) {
                L5: {
                  discarded$7 = com.ms.win32.User32.SetWindowLong(this.field_b, -4, this.field_e);
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
              this.field_b = var5;
              this.field_e = com.ms.win32.User32.SetWindowLong(this.field_b, -4, this);
              break L6;
            }
          }
          L7: {
            stackOut_24_0 = this;
            stackIn_26_0 = stackOut_24_0;
            stackIn_25_0 = stackOut_24_0;
            if (!param0) {
              stackOut_26_0 = this;
              stackOut_26_1 = 0;
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              break L7;
            } else {
              stackOut_25_0 = this;
              stackOut_25_1 = 1;
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              break L7;
            }
          }
          ((gb) (this)).field_c = stackIn_27_1 != 0;
          discarded$8 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
          return;
        } else {
          L8: {
            stackOut_11_0 = this;
            stackIn_13_0 = stackOut_11_0;
            stackIn_12_0 = stackOut_11_0;
            if (!param0) {
              stackOut_13_0 = this;
              stackOut_13_1 = 0;
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              break L8;
            } else {
              stackOut_12_0 = this;
              stackOut_12_1 = 1;
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              break L8;
            }
          }
          ((gb) (this)).field_c = stackIn_14_1 != 0;
          discarded$9 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
          return;
        }
    }

    final void a(int param0, int param1, int param2) {
        int discarded$6 = 0;
        boolean discarded$7 = false;
        boolean discarded$8 = false;
        if (param2 != 32512) {
          discarded$6 = this.callback(18, -64, -120, -4);
          discarded$7 = com.ms.win32.User32.SetCursorPos(param0, param1);
          return;
        } else {
          discarded$8 = com.ms.win32.User32.SetCursorPos(param0, param1);
          return;
        }
    }

    gb() {
        this.field_c = true;
    }
}
