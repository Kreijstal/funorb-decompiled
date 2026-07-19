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
                    stackOut_23_0 = this.field_c;
                    stackIn_24_0 = stackOut_23_0;
                    break L0;
                  } else {
                    stackOut_22_0 = 0;
                    stackIn_24_0 = stackOut_22_0;
                    break L0;
                  }
                }
                discarded$6 = com.ms.win32.User32.SetCursor(stackIn_24_0);
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
                  stackOut_17_0 = 0;
                  stackIn_18_0 = stackOut_17_0;
                  break L2;
                } else {
                  stackOut_16_0 = this.field_c;
                  stackIn_18_0 = stackOut_16_0;
                  break L2;
                }
              }
              discarded$7 = com.ms.win32.User32.SetCursor(stackIn_18_0);
              return 0;
            }
          } else {
            if (-101025 == (param1 ^ -1)) {
              L3: {
                if (this.field_d) {
                  stackOut_8_0 = this.field_c;
                  stackIn_9_0 = stackOut_8_0;
                  break L3;
                } else {
                  stackOut_7_0 = 0;
                  stackIn_9_0 = stackOut_7_0;
                  break L3;
                }
              }
              discarded$8 = com.ms.win32.User32.SetCursor(stackIn_9_0);
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
        int stackIn_4_0 = 0;
        Object stackIn_14_0 = null;
        Object stackIn_15_0 = null;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        Object stackIn_29_0 = null;
        Object stackIn_30_0 = null;
        Object stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        Object stackOut_28_0 = null;
        Object stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        Object stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        Object stackOut_13_0 = null;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        L0: {
          var9 = (com.ms.awt.WComponentPeer) null;
          var5 = var9.getTopHwnd();
          if (this.field_e != var5) {
            break L0;
          } else {
            L1: {
              if (param2) {
                stackOut_3_0 = 0;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = 1;
                stackIn_4_0 = stackOut_2_0;
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
            discarded$5 = com.ms.dll.Root.alloc(this);
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
              discarded$6 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
              var6 = this;
              synchronized (var6) {
                L4: {
                  discarded$7 = com.ms.win32.User32.SetWindowLong(this.field_e, -4, this.field_b);
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
            stackOut_28_0 = this;
            stackIn_30_0 = stackOut_28_0;
            stackIn_29_0 = stackOut_28_0;
            if (!param2) {
              stackOut_30_0 = this;
              stackOut_30_1 = 0;
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              break L7;
            } else {
              stackOut_29_0 = this;
              stackOut_29_1 = 1;
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              break L7;
            }
          }
          ((le) (this)).field_d = stackIn_31_1 != 0;
          discarded$8 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
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
            stackOut_13_0 = this;
            stackIn_15_0 = stackOut_13_0;
            stackIn_14_0 = stackOut_13_0;
            if (!param2) {
              stackOut_15_0 = this;
              stackOut_15_1 = 0;
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              break L9;
            } else {
              stackOut_14_0 = this;
              stackOut_14_1 = 1;
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              break L9;
            }
          }
          ((le) (this)).field_d = stackIn_16_1 != 0;
          discarded$9 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
          return;
        }
    }

    final void a(byte param0, int param1, int param2) {
        boolean discarded$0 = com.ms.win32.User32.SetCursorPos(param1, param2);
        int var4 = -121 / ((param0 - -50) / 38);
    }

    le() {
        this.field_d = true;
    }
}
