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
        int discarded$3 = 0;
        int discarded$4 = 0;
        int discarded$5 = 0;
        int var5 = 0;
        int stackIn_12_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_27_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
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
                    stackOut_26_0 = this.field_d;
                    stackIn_27_0 = stackOut_26_0;
                    break L0;
                  } else {
                    stackOut_25_0 = 0;
                    stackIn_27_0 = stackOut_25_0;
                    break L0;
                  }
                }
                discarded$3 = com.ms.win32.User32.SetCursor(stackIn_27_0);
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
                  stackOut_17_0 = 0;
                  stackIn_18_0 = stackOut_17_0;
                  break L2;
                } else {
                  stackOut_16_0 = this.field_d;
                  stackIn_18_0 = stackOut_16_0;
                  break L2;
                }
              }
              discarded$4 = com.ms.win32.User32.SetCursor(stackIn_18_0);
              return 0;
            }
          } else {
            if (-101025 == (param1 ^ -1)) {
              L3: {
                if (this.field_b) {
                  stackOut_11_0 = this.field_d;
                  stackIn_12_0 = stackOut_11_0;
                  break L3;
                } else {
                  stackOut_10_0 = 0;
                  stackIn_12_0 = stackOut_10_0;
                  break L3;
                }
              }
              discarded$5 = com.ms.win32.User32.SetCursor(stackIn_12_0);
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
        int discarded$41 = 0;
        int discarded$42 = 0;
        int discarded$43 = 0;
        int discarded$44 = 0;
        int discarded$45 = 0;
        int var5 = 0;
        Object var6 = null;
        Throwable var7 = null;
        Throwable var8 = null;
        com.ms.awt.WComponentPeer var9 = null;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        Object stackIn_24_0 = null;
        Object stackIn_25_0 = null;
        Object stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        Object stackIn_30_0 = null;
        Object stackIn_31_0 = null;
        Object stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        Object stackOut_29_0 = null;
        Object stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        Object stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        Object stackOut_23_0 = null;
        Object stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        Object stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        L0: {
          var9 = (com.ms.awt.WComponentPeer) null;
          var5 = var9.getTopHwnd();
          if (this.field_a != var5) {
            break L0;
          } else {
            L1: {
              if (this.field_b) {
                stackOut_3_0 = 0;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = 1;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              stackOut_4_0 = stackIn_4_0;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (param1) {
                stackOut_6_0 = stackIn_6_0;
                stackOut_6_1 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L2;
              } else {
                stackOut_5_0 = stackIn_5_0;
                stackOut_5_1 = 1;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L2;
              }
            }
            if (stackIn_7_0 == stackIn_7_1) {
              return;
            } else {
              break L0;
            }
          }
        }
        L3: {
          if (!this.field_c) {
            this.field_d = com.ms.win32.User32.LoadCursor(0, 32512);
            discarded$41 = com.ms.dll.Root.alloc(this);
            this.field_c = true;
            break L3;
          } else {
            break L3;
          }
        }
        if (var5 == this.field_a) {
          L4: {
            stackOut_29_0 = this;
            stackIn_31_0 = stackOut_29_0;
            stackIn_30_0 = stackOut_29_0;
            if (!param1) {
              stackOut_31_0 = this;
              stackOut_31_1 = 0;
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              break L4;
            } else {
              stackOut_30_0 = this;
              stackOut_30_1 = 1;
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              break L4;
            }
          }
          ((al) (this)).field_b = stackIn_32_1 != 0;
          discarded$42 = com.ms.win32.User32.SendMessage(var5, 101024, 0, param0);
          return;
        } else {
          L5: {
            if (this.field_a != 0) {
              this.field_b = true;
              discarded$43 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
              var6 = this;
              synchronized (var6) {
                L6: {
                  discarded$44 = com.ms.win32.User32.SetWindowLong(this.field_a, -4, this.field_e);
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
            stackOut_23_0 = this;
            stackIn_25_0 = stackOut_23_0;
            stackIn_24_0 = stackOut_23_0;
            if (!param1) {
              stackOut_25_0 = this;
              stackOut_25_1 = 0;
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              break L8;
            } else {
              stackOut_24_0 = this;
              stackOut_24_1 = 1;
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              break L8;
            }
          }
          ((al) (this)).field_b = stackIn_26_1 != 0;
          discarded$45 = com.ms.win32.User32.SendMessage(var5, 101024, 0, param0);
          return;
        }
    }

    al() {
        this.field_b = true;
    }

    final void a(int param0, int param1, byte param2) {
        boolean discarded$5 = com.ms.win32.User32.SetCursorPos(param0, param1);
        if (param2 != 116) {
            this.a(-41, -9, (byte) 0);
        }
    }
}
