/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class me extends com.ms.dll.Callback {
    private volatile int field_a;
    private boolean field_b;
    private int field_c;
    private volatile int field_d;
    private volatile boolean field_e;

    final synchronized int callback(int param0, int param1, int param2, int param3) {
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
        if (((me) this).field_d != param0) {
          var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
          return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        } else {
          if (param1 == 32) {
            var5 = param3 & 65535;
            if ((var5 ^ -1) != -2) {
              if (101024 == param1) {
                L0: {
                  if (((me) this).field_e) {
                    stackOut_26_0 = ((me) this).field_c;
                    stackIn_27_0 = stackOut_26_0;
                    break L0;
                  } else {
                    stackOut_25_0 = 0;
                    stackIn_27_0 = stackOut_25_0;
                    break L0;
                  }
                }
                int discarded$3 = com.ms.win32.User32.SetCursor(stackIn_27_0);
                return 0;
              } else {
                L1: {
                  if ((param1 ^ -1) == -2) {
                    ((me) this).field_d = 0;
                    ((me) this).field_e = true;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                return com.ms.win32.User32.CallWindowProc(((me) this).field_a, param0, param1, param2, param3);
              }
            } else {
              L2: {
                if (((me) this).field_e) {
                  stackOut_17_0 = ((me) this).field_c;
                  stackIn_18_0 = stackOut_17_0;
                  break L2;
                } else {
                  stackOut_16_0 = 0;
                  stackIn_18_0 = stackOut_16_0;
                  break L2;
                }
              }
              int discarded$4 = com.ms.win32.User32.SetCursor(stackIn_18_0);
              return 0;
            }
          } else {
            if (101024 == param1) {
              L3: {
                if (((me) this).field_e) {
                  stackOut_11_0 = ((me) this).field_c;
                  stackIn_12_0 = stackOut_11_0;
                  break L3;
                } else {
                  stackOut_10_0 = 0;
                  stackIn_12_0 = stackOut_10_0;
                  break L3;
                }
              }
              int discarded$5 = com.ms.win32.User32.SetCursor(stackIn_12_0);
              return 0;
            } else {
              L4: {
                if ((param1 ^ -1) == -2) {
                  ((me) this).field_d = 0;
                  ((me) this).field_e = true;
                  break L4;
                } else {
                  break L4;
                }
              }
              return com.ms.win32.User32.CallWindowProc(((me) this).field_a, param0, param1, param2, param3);
            }
          }
        }
    }

    final void a(boolean param0, java.awt.Component param1, byte param2) {
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
        Object stackIn_13_0 = null;
        Object stackIn_14_0 = null;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        Object stackIn_28_0 = null;
        Object stackIn_29_0 = null;
        Object stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        Object stackOut_27_0 = null;
        Object stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        Object stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        Object stackOut_12_0 = null;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        L0: {
          var9 = null;
          var5 = var9.getTopHwnd();
          if (((me) this).field_d != var5) {
            break L0;
          } else {
            L1: {
              if (param0) {
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
              if (((me) this).field_e) {
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
            if (stackIn_7_0 != stackIn_7_1) {
              break L0;
            } else {
              return;
            }
          }
        }
        L3: {
          if (((me) this).field_b) {
            break L3;
          } else {
            ((me) this).field_c = com.ms.win32.User32.LoadCursor(0, 32512);
            int discarded$7 = com.ms.dll.Root.alloc(this);
            ((me) this).field_b = true;
            break L3;
          }
        }
        if (((me) this).field_d != var5) {
          L4: {
            if (((me) this).field_d != 0) {
              ((me) this).field_e = true;
              int discarded$8 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
              var6 = this;
              synchronized (var6) {
                L5: {
                  int discarded$9 = com.ms.win32.User32.SetWindowLong(((me) this).field_d, -4, ((me) this).field_a);
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
              ((me) this).field_d = var5;
              ((me) this).field_a = com.ms.win32.User32.SetWindowLong(((me) this).field_d, -4, this);
              break L6;
            }
          }
          L7: {
            stackOut_27_0 = this;
            stackIn_29_0 = stackOut_27_0;
            stackIn_28_0 = stackOut_27_0;
            if (!param0) {
              stackOut_29_0 = this;
              stackOut_29_1 = 0;
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              break L7;
            } else {
              stackOut_28_0 = this;
              stackOut_28_1 = 1;
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              break L7;
            }
          }
          L8: {
            ((me) this).field_e = stackIn_30_1 != 0;
            int discarded$10 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
            if (param2 < -11) {
              break L8;
            } else {
              int discarded$11 = ((me) this).callback(111, 43, 112, -96);
              break L8;
            }
          }
          return;
        } else {
          L9: {
            stackOut_12_0 = this;
            stackIn_14_0 = stackOut_12_0;
            stackIn_13_0 = stackOut_12_0;
            if (!param0) {
              stackOut_14_0 = this;
              stackOut_14_1 = 0;
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              break L9;
            } else {
              stackOut_13_0 = this;
              stackOut_13_1 = 1;
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              break L9;
            }
          }
          L10: {
            ((me) this).field_e = stackIn_15_1 != 0;
            int discarded$12 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
            if (param2 < -11) {
              break L10;
            } else {
              int discarded$13 = ((me) this).callback(111, 43, 112, -96);
              break L10;
            }
          }
          return;
        }
    }

    final void a(int param0, int param1, byte param2) {
        if (param2 != -25) {
          int discarded$6 = ((me) this).callback(124, -71, -61, -36);
          boolean discarded$7 = com.ms.win32.User32.SetCursorPos(param1, param0);
          return;
        } else {
          boolean discarded$8 = com.ms.win32.User32.SetCursorPos(param1, param0);
          return;
        }
    }

    me() {
        ((me) this).field_e = true;
    }
}
