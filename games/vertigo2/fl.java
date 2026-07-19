/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fl extends com.ms.dll.Callback {
    private boolean field_c;
    private volatile int field_a;
    private volatile int field_b;
    private int field_e;
    private volatile boolean field_d;

    final void a(int param0, java.awt.Component param1, boolean param2) {
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
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
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
        Object stackOut_7_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        L0: {
          var9 = (com.ms.awt.WComponentPeer) null;
          var5 = var9.getTopHwnd();
          if (this.field_b != var5) {
            break L0;
          } else {
            if (this.field_d == param2) {
              return;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (this.field_c) {
            break L1;
          } else {
            this.field_e = com.ms.win32.User32.LoadCursor(0, 32512);
            discarded$5 = com.ms.dll.Root.alloc(this);
            this.field_c = true;
            break L1;
          }
        }
        if (this.field_b != var5) {
          L2: {
            if (-1 != (this.field_b ^ -1)) {
              this.field_d = true;
              discarded$6 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
              var6 = this;
              synchronized (var6) {
                L3: {
                  discarded$7 = com.ms.win32.User32.SetWindowLong(this.field_b, -4, this.field_a);
                  break L3;
                }
              }
              break L2;
            } else {
              break L2;
            }
          }
          var6 = this;
          synchronized (var6) {
            L4: {
              this.field_b = var5;
              this.field_a = com.ms.win32.User32.SetWindowLong(this.field_b, -4, this);
              break L4;
            }
          }
          L5: {
            stackOut_22_0 = this;
            stackIn_24_0 = stackOut_22_0;
            stackIn_23_0 = stackOut_22_0;
            if (!param2) {
              stackOut_24_0 = this;
              stackOut_24_1 = 0;
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              break L5;
            } else {
              stackOut_23_0 = this;
              stackOut_23_1 = 1;
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              break L5;
            }
          }
          L6: {
            ((fl) (this)).field_d = stackIn_25_1 != 0;
            discarded$8 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
            if (param0 == 11333) {
              break L6;
            } else {
              this.a(-21, (byte) -73, -121);
              break L6;
            }
          }
          return;
        } else {
          L7: {
            stackOut_7_0 = this;
            stackIn_9_0 = stackOut_7_0;
            stackIn_8_0 = stackOut_7_0;
            if (!param2) {
              stackOut_9_0 = this;
              stackOut_9_1 = 0;
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              break L7;
            } else {
              stackOut_8_0 = this;
              stackOut_8_1 = 1;
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              break L7;
            }
          }
          L8: {
            ((fl) (this)).field_d = stackIn_10_1 != 0;
            discarded$9 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
            if (param0 == 11333) {
              break L8;
            } else {
              this.a(-21, (byte) -73, -121);
              break L8;
            }
          }
          return;
        }
    }

    final void a(int param0, byte param1, int param2) {
        boolean discarded$4 = com.ms.win32.User32.SetCursorPos(param0, param2);
        if (param1 <= 46) {
            this.field_b = -95;
        }
    }

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int discarded$6 = 0;
        int discarded$7 = 0;
        int discarded$8 = 0;
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
        if (this.field_b == param0) {
          if ((param1 ^ -1) == -33) {
            var5 = param3 & 65535;
            if (-2 != (var5 ^ -1)) {
              if ((param1 ^ -1) == -101025) {
                L0: {
                  if (this.field_d) {
                    stackOut_22_0 = this.field_e;
                    stackIn_23_0 = stackOut_22_0;
                    break L0;
                  } else {
                    stackOut_21_0 = 0;
                    stackIn_23_0 = stackOut_21_0;
                    break L0;
                  }
                }
                discarded$6 = com.ms.win32.User32.SetCursor(stackIn_23_0);
                return 0;
              } else {
                L1: {
                  if (-2 == (param1 ^ -1)) {
                    this.field_b = 0;
                    this.field_d = true;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                return com.ms.win32.User32.CallWindowProc(this.field_a, param0, param1, param2, param3);
              }
            } else {
              L2: {
                if (this.field_d) {
                  stackOut_16_0 = this.field_e;
                  stackIn_17_0 = stackOut_16_0;
                  break L2;
                } else {
                  stackOut_15_0 = 0;
                  stackIn_17_0 = stackOut_15_0;
                  break L2;
                }
              }
              discarded$7 = com.ms.win32.User32.SetCursor(stackIn_17_0);
              return 0;
            }
          } else {
            if ((param1 ^ -1) == -101025) {
              L3: {
                if (this.field_d) {
                  stackOut_7_0 = this.field_e;
                  stackIn_8_0 = stackOut_7_0;
                  break L3;
                } else {
                  stackOut_6_0 = 0;
                  stackIn_8_0 = stackOut_6_0;
                  break L3;
                }
              }
              discarded$8 = com.ms.win32.User32.SetCursor(stackIn_8_0);
              return 0;
            } else {
              L4: {
                if (-2 == (param1 ^ -1)) {
                  this.field_b = 0;
                  this.field_d = true;
                  break L4;
                } else {
                  break L4;
                }
              }
              return com.ms.win32.User32.CallWindowProc(this.field_a, param0, param1, param2, param3);
            }
          }
        } else {
          var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
          return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        }
    }

    fl() {
        this.field_d = true;
    }
}
