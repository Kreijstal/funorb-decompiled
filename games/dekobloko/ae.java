/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ae extends com.ms.dll.Callback {
    private volatile int field_a;
    private volatile int field_e;
    private boolean field_c;
    private int field_d;
    private volatile boolean field_b;

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
        if (this.field_e != param0) {
          var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
          return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        } else {
          if (32 == param1) {
            var5 = param3 & 65535;
            if (1 != var5) {
              if ((param1 ^ -1) != -101025) {
                if (-2 == (param1 ^ -1)) {
                  this.field_e = 0;
                  this.field_b = true;
                  return com.ms.win32.User32.CallWindowProc(this.field_a, param0, param1, param2, param3);
                } else {
                  return com.ms.win32.User32.CallWindowProc(this.field_a, param0, param1, param2, param3);
                }
              } else {
                L0: {
                  if (!this.field_b) {
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
                if (this.field_b) {
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
            if ((param1 ^ -1) != -101025) {
              if (-2 == (param1 ^ -1)) {
                this.field_e = 0;
                this.field_b = true;
                return com.ms.win32.User32.CallWindowProc(this.field_a, param0, param1, param2, param3);
              } else {
                return com.ms.win32.User32.CallWindowProc(this.field_a, param0, param1, param2, param3);
              }
            } else {
              L2: {
                if (!this.field_b) {
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

    final void a(boolean param0, java.awt.Component param1, byte param2) {
        int discarded$5 = 0;
        int discarded$6 = 0;
        int discarded$7 = 0;
        int discarded$8 = 0;
        int discarded$9 = 0;
        int var5 = 0;
        Object var6_ref_Object = null;
        int var6 = 0;
        Throwable var7 = null;
        Throwable var8 = null;
        com.ms.awt.WComponentPeer var9 = null;
        boolean stackIn_2_0 = false;
        boolean stackIn_3_0 = false;
        boolean stackIn_4_0 = false;
        int stackIn_4_1 = 0;
        Object stackIn_21_0 = null;
        Object stackIn_22_0 = null;
        Object stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        Object stackIn_27_0 = null;
        Object stackIn_28_0 = null;
        Object stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        Throwable decompiledCaughtException = null;
        boolean stackOut_1_0 = false;
        boolean stackOut_3_0 = false;
        int stackOut_3_1 = 0;
        boolean stackOut_2_0 = false;
        int stackOut_2_1 = 0;
        Object stackOut_26_0 = null;
        Object stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        Object stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        Object stackOut_20_0 = null;
        Object stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        Object stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        L0: {
          var9 = (com.ms.awt.WComponentPeer) null;
          var5 = var9.getTopHwnd();
          if (var5 != this.field_e) {
            break L0;
          } else {
            L1: {
              stackOut_1_0 = this.field_b;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (param0) {
                stackOut_3_0 = stackIn_3_0;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = stackIn_2_0;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
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
          if (!this.field_c) {
            this.field_d = com.ms.win32.User32.LoadCursor(0, 32512);
            discarded$5 = com.ms.dll.Root.alloc(this);
            this.field_c = true;
            break L2;
          } else {
            break L2;
          }
        }
        if (var5 == this.field_e) {
          L3: {
            stackOut_26_0 = this;
            stackIn_28_0 = stackOut_26_0;
            stackIn_27_0 = stackOut_26_0;
            if (!param0) {
              stackOut_28_0 = this;
              stackOut_28_1 = 0;
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              break L3;
            } else {
              stackOut_27_0 = this;
              stackOut_27_1 = 1;
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              break L3;
            }
          }
          ((ae) (this)).field_b = stackIn_29_1 != 0;
          var6 = 126 / ((28 - param2) / 47);
          discarded$6 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
          return;
        } else {
          L4: {
            if (0 != this.field_e) {
              this.field_b = true;
              discarded$7 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
              var6_ref_Object = this;
              synchronized (var6_ref_Object) {
                L5: {
                  discarded$8 = com.ms.win32.User32.SetWindowLong(this.field_e, -4, this.field_a);
                  break L5;
                }
              }
              break L4;
            } else {
              break L4;
            }
          }
          var6_ref_Object = this;
          synchronized (var6_ref_Object) {
            L6: {
              this.field_e = var5;
              this.field_a = com.ms.win32.User32.SetWindowLong(this.field_e, -4, this);
              break L6;
            }
          }
          L7: {
            stackOut_20_0 = this;
            stackIn_22_0 = stackOut_20_0;
            stackIn_21_0 = stackOut_20_0;
            if (!param0) {
              stackOut_22_0 = this;
              stackOut_22_1 = 0;
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              break L7;
            } else {
              stackOut_21_0 = this;
              stackOut_21_1 = 1;
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              break L7;
            }
          }
          ((ae) (this)).field_b = stackIn_23_1 != 0;
          var6 = 126 / ((28 - param2) / 47);
          discarded$9 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
          return;
        }
    }

    final void a(int param0, int param1, byte param2) {
        boolean discarded$5 = com.ms.win32.User32.SetCursorPos(param0, param1);
        if (param2 != -98) {
            java.awt.Component var5 = (java.awt.Component) null;
            this.a(false, (java.awt.Component) null, (byte) -80);
        }
    }

    ae() {
        this.field_b = true;
    }
}
