/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eh extends com.ms.dll.Callback {
    private volatile int field_b;
    private volatile boolean field_c;
    private int field_e;
    private volatile int field_a;
    private boolean field_d;

    final synchronized int callback(int param0, int param1, int param2, int param3) {
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
        if (param0 != ((eh) this).field_b) {
          var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
          return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        } else {
          if (param1 == 32) {
            var5 = 65535 & param3;
            if (var5 != 1) {
              if (param1 == 101024) {
                L0: {
                  if (!((eh) this).field_c) {
                    stackOut_23_0 = 0;
                    stackIn_24_0 = stackOut_23_0;
                    break L0;
                  } else {
                    stackOut_22_0 = ((eh) this).field_e;
                    stackIn_24_0 = stackOut_22_0;
                    break L0;
                  }
                }
                int discarded$3 = com.ms.win32.User32.SetCursor(stackIn_24_0);
                return 0;
              } else {
                if (param1 == 1) {
                  ((eh) this).field_b = 0;
                  ((eh) this).field_c = true;
                  return com.ms.win32.User32.CallWindowProc(((eh) this).field_a, param0, param1, param2, param3);
                } else {
                  return com.ms.win32.User32.CallWindowProc(((eh) this).field_a, param0, param1, param2, param3);
                }
              }
            } else {
              L1: {
                if (((eh) this).field_c) {
                  stackOut_17_0 = ((eh) this).field_e;
                  stackIn_18_0 = stackOut_17_0;
                  break L1;
                } else {
                  stackOut_16_0 = 0;
                  stackIn_18_0 = stackOut_16_0;
                  break L1;
                }
              }
              int discarded$4 = com.ms.win32.User32.SetCursor(stackIn_18_0);
              return 0;
            }
          } else {
            if (param1 == 101024) {
              L2: {
                if (!((eh) this).field_c) {
                  stackOut_8_0 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  break L2;
                } else {
                  stackOut_7_0 = ((eh) this).field_e;
                  stackIn_9_0 = stackOut_7_0;
                  break L2;
                }
              }
              int discarded$5 = com.ms.win32.User32.SetCursor(stackIn_9_0);
              return 0;
            } else {
              if (param1 == 1) {
                ((eh) this).field_b = 0;
                ((eh) this).field_c = true;
                return com.ms.win32.User32.CallWindowProc(((eh) this).field_a, param0, param1, param2, param3);
              } else {
                return com.ms.win32.User32.CallWindowProc(((eh) this).field_a, param0, param1, param2, param3);
              }
            }
          }
        }
    }

    final void a(byte param0, int param1, int param2) {
        if (param0 != 121) {
            ((eh) this).field_d = false;
            boolean discarded$0 = com.ms.win32.User32.SetCursorPos(param1, param2);
            return;
        }
        boolean discarded$1 = com.ms.win32.User32.SetCursorPos(param1, param2);
    }

    final void a(boolean param0, byte param1, java.awt.Component param2) {
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
        Object stackIn_14_0 = null;
        Object stackIn_15_0 = null;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
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
        Object stackOut_13_0 = null;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        L0: {
          var9 = null;
          var5 = var9.getTopHwnd();
          if (((eh) this).field_b != var5) {
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
              if (((eh) this).field_c) {
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
          if (!((eh) this).field_d) {
            ((eh) this).field_e = com.ms.win32.User32.LoadCursor(0, 32512);
            int discarded$7 = com.ms.dll.Root.alloc(this);
            ((eh) this).field_d = true;
            break L3;
          } else {
            break L3;
          }
        }
        if (((eh) this).field_b != var5) {
          L4: {
            if (((eh) this).field_b == 0) {
              break L4;
            } else {
              ((eh) this).field_c = true;
              int discarded$8 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
              var6 = this;
              synchronized (var6) {
                L5: {
                  int discarded$9 = com.ms.win32.User32.SetWindowLong(((eh) this).field_b, -4, ((eh) this).field_a);
                  break L5;
                }
              }
              break L4;
            }
          }
          var6 = this;
          synchronized (var6) {
            L6: {
              ((eh) this).field_b = var5;
              ((eh) this).field_a = com.ms.win32.User32.SetWindowLong(((eh) this).field_b, -4, this);
              break L6;
            }
          }
          L7: {
            stackOut_29_0 = this;
            stackIn_31_0 = stackOut_29_0;
            stackIn_30_0 = stackOut_29_0;
            if (!param0) {
              stackOut_31_0 = this;
              stackOut_31_1 = 0;
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              break L7;
            } else {
              stackOut_30_0 = this;
              stackOut_30_1 = 1;
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              break L7;
            }
          }
          L8: {
            ((eh) this).field_c = stackIn_32_1 != 0;
            if (param1 == 90) {
              int discarded$10 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
              break L8;
            } else {
              ((eh) this).field_b = 69;
              int discarded$11 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
              break L8;
            }
          }
          return;
        } else {
          L9: {
            stackOut_13_0 = this;
            stackIn_15_0 = stackOut_13_0;
            stackIn_14_0 = stackOut_13_0;
            if (!param0) {
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
          L10: {
            ((eh) this).field_c = stackIn_16_1 != 0;
            if (param1 == 90) {
              int discarded$12 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
              break L10;
            } else {
              ((eh) this).field_b = 69;
              int discarded$13 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
              break L10;
            }
          }
          return;
        }
    }

    eh() {
        ((eh) this).field_c = true;
    }
}
