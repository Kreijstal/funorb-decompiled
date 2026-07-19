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
        int discarded$58 = 0;
        int discarded$59 = 0;
        int discarded$60 = 0;
        int discarded$61 = 0;
        int discarded$62 = 0;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        Throwable var8 = null;
        Throwable var9 = null;
        com.ms.awt.WComponentPeer var10 = null;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        Object stackIn_23_0 = null;
        Object stackIn_24_0 = null;
        Object stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_22_0 = null;
        Object stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        Object stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        Object stackOut_16_0 = null;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
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
            discarded$58 = com.ms.dll.Root.alloc(this);
            this.field_a = true;
            break L1;
          } else {
            break L1;
          }
        }
        if (this.field_e == var6) {
          L2: {
            stackOut_22_0 = this;
            stackIn_24_0 = stackOut_22_0;
            stackIn_23_0 = stackOut_22_0;
            if (!param0) {
              stackOut_24_0 = this;
              stackOut_24_1 = 0;
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              break L2;
            } else {
              stackOut_23_0 = this;
              stackOut_23_1 = 1;
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              break L2;
            }
          }
          ((sc) (this)).field_d = stackIn_25_1 != 0;
          discarded$59 = com.ms.win32.User32.SendMessage(var6, 101024, 0, 0);
          return;
        } else {
          L3: {
            if (this.field_e == 0) {
              break L3;
            } else {
              this.field_d = true;
              discarded$60 = com.ms.win32.User32.SendMessage(var6, 101024, 0, 0);
              var7 = this;
              synchronized (var7) {
                L4: {
                  discarded$61 = com.ms.win32.User32.SetWindowLong(this.field_e, -4, this.field_b);
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
            stackOut_16_0 = this;
            stackIn_18_0 = stackOut_16_0;
            stackIn_17_0 = stackOut_16_0;
            if (!param0) {
              stackOut_18_0 = this;
              stackOut_18_1 = 0;
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              break L6;
            } else {
              stackOut_17_0 = this;
              stackOut_17_1 = 1;
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              break L6;
            }
          }
          ((sc) (this)).field_d = stackIn_19_1 != 0;
          discarded$62 = com.ms.win32.User32.SendMessage(var6, 101024, 0, 0);
          return;
        }
    }

    final void a(int param0, boolean param1, int param2) {
        boolean discarded$5 = com.ms.win32.User32.SetCursorPos(param2, param0);
        if (!param1) {
            this.field_b = 108;
        }
    }

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int discarded$3 = 0;
        int discarded$4 = 0;
        int discarded$5 = 0;
        int var5 = 0;
        int stackIn_8_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        if (this.field_e == param0) {
          if ((param1 ^ -1) == -33) {
            var5 = param3 & 65535;
            if ((var5 ^ -1) != -2) {
              if ((param1 ^ -1) == -101025) {
                L0: {
                  if (!this.field_d) {
                    stackOut_22_0 = 0;
                    stackIn_23_0 = stackOut_22_0;
                    break L0;
                  } else {
                    stackOut_21_0 = this.field_c;
                    stackIn_23_0 = stackOut_21_0;
                    break L0;
                  }
                }
                discarded$3 = com.ms.win32.User32.SetCursor(stackIn_23_0);
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
                  stackOut_16_0 = this.field_c;
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
            if ((param1 ^ -1) == -101025) {
              L2: {
                if (!this.field_d) {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  break L2;
                } else {
                  stackOut_6_0 = this.field_c;
                  stackIn_8_0 = stackOut_6_0;
                  break L2;
                }
              }
              discarded$5 = com.ms.win32.User32.SetCursor(stackIn_8_0);
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
