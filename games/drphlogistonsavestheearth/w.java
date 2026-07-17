/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class w extends com.ms.dll.Callback {
    private boolean field_e;
    private volatile int field_a;
    private volatile boolean field_c;
    private int field_b;
    private volatile int field_d;

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
        if (param0 != ((w) this).field_a) {
          var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
          return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        } else {
          if (param1 == 32) {
            var5 = 65535 & param3;
            if (1 != var5) {
              if (101024 == param1) {
                L0: {
                  if (!((w) this).field_c) {
                    stackOut_26_0 = 0;
                    stackIn_27_0 = stackOut_26_0;
                    break L0;
                  } else {
                    stackOut_25_0 = ((w) this).field_b;
                    stackIn_27_0 = stackOut_25_0;
                    break L0;
                  }
                }
                int discarded$3 = com.ms.win32.User32.SetCursor(stackIn_27_0);
                return 0;
              } else {
                L1: {
                  if (param1 == 1) {
                    ((w) this).field_a = 0;
                    ((w) this).field_c = true;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                return com.ms.win32.User32.CallWindowProc(((w) this).field_d, param0, param1, param2, param3);
              }
            } else {
              L2: {
                if (!((w) this).field_c) {
                  stackOut_17_0 = 0;
                  stackIn_18_0 = stackOut_17_0;
                  break L2;
                } else {
                  stackOut_16_0 = ((w) this).field_b;
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
                if (!((w) this).field_c) {
                  stackOut_11_0 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  break L3;
                } else {
                  stackOut_10_0 = ((w) this).field_b;
                  stackIn_12_0 = stackOut_10_0;
                  break L3;
                }
              }
              int discarded$5 = com.ms.win32.User32.SetCursor(stackIn_12_0);
              return 0;
            } else {
              L4: {
                if (param1 == 1) {
                  ((w) this).field_a = 0;
                  ((w) this).field_c = true;
                  break L4;
                } else {
                  break L4;
                }
              }
              return com.ms.win32.User32.CallWindowProc(((w) this).field_d, param0, param1, param2, param3);
            }
          }
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param1 != 1) {
            return;
        }
        boolean discarded$0 = com.ms.win32.User32.SetCursorPos(param0, param2);
    }

    final void a(byte param0, java.awt.Component param1, boolean param2) {
        int var5 = 0;
        Object var6 = null;
        Throwable var7 = null;
        Throwable var8 = null;
        com.ms.awt.WComponentPeer var9 = null;
        boolean stackIn_2_0 = false;
        boolean stackIn_3_0 = false;
        boolean stackIn_4_0 = false;
        int stackIn_4_1 = 0;
        Object stackIn_23_0 = null;
        Object stackIn_24_0 = null;
        Object stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        Object stackIn_29_0 = null;
        Object stackIn_30_0 = null;
        Object stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        Throwable decompiledCaughtException = null;
        boolean stackOut_1_0 = false;
        boolean stackOut_3_0 = false;
        int stackOut_3_1 = 0;
        boolean stackOut_2_0 = false;
        int stackOut_2_1 = 0;
        Object stackOut_28_0 = null;
        Object stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        Object stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        Object stackOut_22_0 = null;
        Object stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        Object stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        L0: {
          var9 = null;
          var5 = var9.getTopHwnd();
          if (((w) this).field_a != var5) {
            break L0;
          } else {
            L1: {
              stackOut_1_0 = param2;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (((w) this).field_c) {
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
          if (param0 < -39) {
            break L2;
          } else {
            ((w) this).field_d = 44;
            break L2;
          }
        }
        L3: {
          if (!((w) this).field_e) {
            ((w) this).field_b = com.ms.win32.User32.LoadCursor(0, 32512);
            int discarded$5 = com.ms.dll.Root.alloc(this);
            ((w) this).field_e = true;
            break L3;
          } else {
            break L3;
          }
        }
        if (((w) this).field_a == var5) {
          L4: {
            stackOut_28_0 = this;
            stackIn_30_0 = stackOut_28_0;
            stackIn_29_0 = stackOut_28_0;
            if (!param2) {
              stackOut_30_0 = this;
              stackOut_30_1 = 0;
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              break L4;
            } else {
              stackOut_29_0 = this;
              stackOut_29_1 = 1;
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              break L4;
            }
          }
          ((w) this).field_c = stackIn_31_1 != 0;
          int discarded$6 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
          return;
        } else {
          L5: {
            if (((w) this).field_a != 0) {
              ((w) this).field_c = true;
              int discarded$7 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
              var6 = this;
              synchronized (var6) {
                L6: {
                  int discarded$8 = com.ms.win32.User32.SetWindowLong(((w) this).field_a, -4, ((w) this).field_d);
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
              ((w) this).field_a = var5;
              ((w) this).field_d = com.ms.win32.User32.SetWindowLong(((w) this).field_a, -4, this);
              break L7;
            }
          }
          L8: {
            stackOut_22_0 = this;
            stackIn_24_0 = stackOut_22_0;
            stackIn_23_0 = stackOut_22_0;
            if (!param2) {
              stackOut_24_0 = this;
              stackOut_24_1 = 0;
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              break L8;
            } else {
              stackOut_23_0 = this;
              stackOut_23_1 = 1;
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              break L8;
            }
          }
          ((w) this).field_c = stackIn_25_1 != 0;
          int discarded$9 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
          return;
        }
    }

    w() {
        ((w) this).field_c = true;
    }
}
