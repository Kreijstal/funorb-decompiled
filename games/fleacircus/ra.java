/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ra extends com.ms.dll.Callback {
    private volatile int field_c;
    private volatile int field_b;
    private boolean field_d;
    private volatile boolean field_a;
    private int field_e;

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
        if (param0 != ((ra) this).field_c) {
          var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
          return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        } else {
          if (param1 == 32) {
            var5 = param3 & 65535;
            if (var5 != 1) {
              if ((param1 ^ -1) == -101025) {
                L0: {
                  if (!((ra) this).field_a) {
                    stackOut_23_0 = 0;
                    stackIn_24_0 = stackOut_23_0;
                    break L0;
                  } else {
                    stackOut_22_0 = ((ra) this).field_e;
                    stackIn_24_0 = stackOut_22_0;
                    break L0;
                  }
                }
                int discarded$3 = com.ms.win32.User32.SetCursor(stackIn_24_0);
                return 0;
              } else {
                if (1 == param1) {
                  ((ra) this).field_c = 0;
                  ((ra) this).field_a = true;
                  return com.ms.win32.User32.CallWindowProc(((ra) this).field_b, param0, param1, param2, param3);
                } else {
                  return com.ms.win32.User32.CallWindowProc(((ra) this).field_b, param0, param1, param2, param3);
                }
              }
            } else {
              L1: {
                if (!((ra) this).field_a) {
                  stackOut_17_0 = 0;
                  stackIn_18_0 = stackOut_17_0;
                  break L1;
                } else {
                  stackOut_16_0 = ((ra) this).field_e;
                  stackIn_18_0 = stackOut_16_0;
                  break L1;
                }
              }
              int discarded$4 = com.ms.win32.User32.SetCursor(stackIn_18_0);
              return 0;
            }
          } else {
            if ((param1 ^ -1) == -101025) {
              L2: {
                if (!((ra) this).field_a) {
                  stackOut_8_0 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  break L2;
                } else {
                  stackOut_7_0 = ((ra) this).field_e;
                  stackIn_9_0 = stackOut_7_0;
                  break L2;
                }
              }
              int discarded$5 = com.ms.win32.User32.SetCursor(stackIn_9_0);
              return 0;
            } else {
              if (1 == param1) {
                ((ra) this).field_c = 0;
                ((ra) this).field_a = true;
                return com.ms.win32.User32.CallWindowProc(((ra) this).field_b, param0, param1, param2, param3);
              } else {
                return com.ms.win32.User32.CallWindowProc(((ra) this).field_b, param0, param1, param2, param3);
              }
            }
          }
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param0 >= -123) {
            ((ra) this).field_b = 124;
            boolean discarded$0 = com.ms.win32.User32.SetCursorPos(param1, param2);
            return;
        }
        boolean discarded$1 = com.ms.win32.User32.SetCursorPos(param1, param2);
    }

    final void a(java.awt.Component param0, byte param1, boolean param2) {
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
        Object stackIn_16_0 = null;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        Object stackIn_29_0 = null;
        Object stackIn_30_0 = null;
        Object stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        Object stackOut_28_0 = null;
        Object stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        Object stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        Object stackOut_15_0 = null;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        L0: {
          var9 = null;
          var5 = var9.getTopHwnd();
          if (((ra) this).field_c != var5) {
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
            L2: {
              stackOut_4_0 = stackIn_4_0;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (((ra) this).field_a) {
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
          if (!((ra) this).field_d) {
            ((ra) this).field_e = com.ms.win32.User32.LoadCursor(0, 32512);
            int discarded$5 = com.ms.dll.Root.alloc(this);
            ((ra) this).field_d = true;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (param1 == -36) {
            break L4;
          } else {
            ((ra) this).field_d = true;
            break L4;
          }
        }
        if (var5 != ((ra) this).field_c) {
          L5: {
            if (-1 != (((ra) this).field_c ^ -1)) {
              ((ra) this).field_a = true;
              int discarded$6 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
              var6 = this;
              synchronized (var6) {
                L6: {
                  int discarded$7 = com.ms.win32.User32.SetWindowLong(((ra) this).field_c, -4, ((ra) this).field_b);
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
              ((ra) this).field_c = var5;
              ((ra) this).field_b = com.ms.win32.User32.SetWindowLong(((ra) this).field_c, -4, this);
              break L7;
            }
          }
          L8: {
            stackOut_28_0 = this;
            stackIn_30_0 = stackOut_28_0;
            stackIn_29_0 = stackOut_28_0;
            if (!param2) {
              stackOut_30_0 = this;
              stackOut_30_1 = 0;
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              break L8;
            } else {
              stackOut_29_0 = this;
              stackOut_29_1 = 1;
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              break L8;
            }
          }
          ((ra) this).field_a = stackIn_31_1 != 0;
          int discarded$8 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
          return;
        } else {
          L9: {
            stackOut_15_0 = this;
            stackIn_17_0 = stackOut_15_0;
            stackIn_16_0 = stackOut_15_0;
            if (!param2) {
              stackOut_17_0 = this;
              stackOut_17_1 = 0;
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              break L9;
            } else {
              stackOut_16_0 = this;
              stackOut_16_1 = 1;
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              break L9;
            }
          }
          ((ra) this).field_a = stackIn_18_1 != 0;
          int discarded$9 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
          return;
        }
    }

    ra() {
        ((ra) this).field_a = true;
    }
}
