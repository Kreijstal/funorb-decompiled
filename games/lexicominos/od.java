/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class od extends com.ms.dll.Callback {
    private boolean field_a;
    private volatile int field_d;
    private volatile boolean field_e;
    private volatile int field_b;
    private int field_c;

    final void a(java.awt.Component param0, boolean param1, boolean param2) {
        int var5 = 0;
        Object var6 = null;
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
        Object stackIn_28_0 = null;
        Object stackIn_29_0 = null;
        Object stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        Object stackIn_32_0 = null;
        Object stackIn_33_0 = null;
        Object stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        Throwable decompiledCaughtException = null;
        boolean stackOut_1_0 = false;
        boolean stackOut_3_0 = false;
        int stackOut_3_1 = 0;
        boolean stackOut_2_0 = false;
        int stackOut_2_1 = 0;
        Object stackOut_31_0 = null;
        Object stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        Object stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        Object stackOut_27_0 = null;
        Object stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        Object stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        Object stackOut_20_0 = null;
        Object stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        Object stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        L0: {
          var9 = null;
          var5 = var9.getTopHwnd();
          if (var5 != ((od) this).field_b) {
            break L0;
          } else {
            L1: {
              stackOut_1_0 = param1;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (((od) this).field_e) {
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
            if ((stackIn_4_0 ? 1 : 0) == stackIn_4_1) {
              break L0;
            } else {
              return;
            }
          }
        }
        L2: {
          if (!((od) this).field_a) {
            ((od) this).field_c = com.ms.win32.User32.LoadCursor(0, 32512);
            int discarded$8 = com.ms.dll.Root.alloc(this);
            ((od) this).field_a = true;
            break L2;
          } else {
            break L2;
          }
        }
        if (((od) this).field_b == var5) {
          if (!param2) {
            L3: {
              int discarded$9 = ((od) this).callback(85, -115, -36, 38);
              stackOut_31_0 = this;
              stackIn_33_0 = stackOut_31_0;
              stackIn_32_0 = stackOut_31_0;
              if (!param1) {
                stackOut_33_0 = this;
                stackOut_33_1 = 0;
                stackIn_34_0 = stackOut_33_0;
                stackIn_34_1 = stackOut_33_1;
                break L3;
              } else {
                stackOut_32_0 = this;
                stackOut_32_1 = 1;
                stackIn_34_0 = stackOut_32_0;
                stackIn_34_1 = stackOut_32_1;
                break L3;
              }
            }
            ((od) this).field_e = stackIn_34_1 != 0;
            int discarded$10 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
            return;
          } else {
            L4: {
              stackOut_27_0 = this;
              stackIn_29_0 = stackOut_27_0;
              stackIn_28_0 = stackOut_27_0;
              if (!param1) {
                stackOut_29_0 = this;
                stackOut_29_1 = 0;
                stackIn_30_0 = stackOut_29_0;
                stackIn_30_1 = stackOut_29_1;
                break L4;
              } else {
                stackOut_28_0 = this;
                stackOut_28_1 = 1;
                stackIn_30_0 = stackOut_28_0;
                stackIn_30_1 = stackOut_28_1;
                break L4;
              }
            }
            ((od) this).field_e = stackIn_30_1 != 0;
            int discarded$11 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
            return;
          }
        } else {
          L5: {
            if (0 == ((od) this).field_b) {
              break L5;
            } else {
              ((od) this).field_e = true;
              int discarded$12 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
              var6 = this;
              synchronized (var6) {
                L6: {
                  int discarded$13 = com.ms.win32.User32.SetWindowLong(((od) this).field_b, -4, ((od) this).field_d);
                  break L6;
                }
              }
              break L5;
            }
          }
          var6 = this;
          synchronized (var6) {
            L7: {
              ((od) this).field_b = var5;
              ((od) this).field_d = com.ms.win32.User32.SetWindowLong(((od) this).field_b, -4, this);
              break L7;
            }
          }
          L8: {
            if (param2) {
              break L8;
            } else {
              int discarded$14 = ((od) this).callback(85, -115, -36, 38);
              break L8;
            }
          }
          L9: {
            stackOut_20_0 = this;
            stackIn_22_0 = stackOut_20_0;
            stackIn_21_0 = stackOut_20_0;
            if (!param1) {
              stackOut_22_0 = this;
              stackOut_22_1 = 0;
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              break L9;
            } else {
              stackOut_21_0 = this;
              stackOut_21_1 = 1;
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              break L9;
            }
          }
          ((od) this).field_e = stackIn_23_1 != 0;
          int discarded$15 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
          return;
        }
    }

    final void a(int param0, int param1, int param2) {
        boolean discarded$0 = com.ms.win32.User32.SetCursorPos(param0, param1);
        int var4 = 56 % ((param2 - 67) / 44);
    }

    od() {
        ((od) this).field_e = true;
    }

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int stackIn_7_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (((od) this).field_b == param0) {
          if (param1 != 32) {
            if (param1 == 101024) {
              L0: {
                if (((od) this).field_e) {
                  stackOut_22_0 = ((od) this).field_c;
                  stackIn_23_0 = stackOut_22_0;
                  break L0;
                } else {
                  stackOut_21_0 = 0;
                  stackIn_23_0 = stackOut_21_0;
                  break L0;
                }
              }
              int discarded$3 = com.ms.win32.User32.SetCursor(stackIn_23_0);
              return 0;
            } else {
              if (param1 == 1) {
                ((od) this).field_b = 0;
                ((od) this).field_e = true;
                return com.ms.win32.User32.CallWindowProc(((od) this).field_d, param0, param1, param2, param3);
              } else {
                return com.ms.win32.User32.CallWindowProc(((od) this).field_d, param0, param1, param2, param3);
              }
            }
          } else {
            var5 = param3 & 65535;
            if (var5 != 1) {
              if (param1 == 101024) {
                L1: {
                  if (((od) this).field_e) {
                    stackOut_12_0 = ((od) this).field_c;
                    stackIn_13_0 = stackOut_12_0;
                    break L1;
                  } else {
                    stackOut_11_0 = 0;
                    stackIn_13_0 = stackOut_11_0;
                    break L1;
                  }
                }
                int discarded$4 = com.ms.win32.User32.SetCursor(stackIn_13_0);
                return 0;
              } else {
                if (param1 == 1) {
                  ((od) this).field_b = 0;
                  ((od) this).field_e = true;
                  return com.ms.win32.User32.CallWindowProc(((od) this).field_d, param0, param1, param2, param3);
                } else {
                  return com.ms.win32.User32.CallWindowProc(((od) this).field_d, param0, param1, param2, param3);
                }
              }
            } else {
              L2: {
                if (!((od) this).field_e) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L2;
                } else {
                  stackOut_5_0 = ((od) this).field_c;
                  stackIn_7_0 = stackOut_5_0;
                  break L2;
                }
              }
              int discarded$5 = com.ms.win32.User32.SetCursor(stackIn_7_0);
              return 0;
            }
          }
        } else {
          var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
          return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        }
    }
}
